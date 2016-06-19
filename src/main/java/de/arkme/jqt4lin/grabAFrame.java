/*
 * Copyright 2016 vincent.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.arkme.jqt4lin;
import au.edu.jcu.v4l4j.FrameGrabber;
import au.edu.jcu.v4l4j.VideoDevice;
import au.edu.jcu.v4l4j.exceptions.V4L4JException;
import java.util.logging.Level;
import java.util.logging.Logger;
import au.edu.jcu.v4l4j.JPEGFrameGrabber;
import au.edu.jcu.v4l4j.CaptureCallback;

/**
 *
 * @author vincent
 */
public class grabAFrame {
    private static VideoFrame shot(String myVideoDevice) throws V4L4JException{
        VideoDevice vid = new VideoDevice(myVideoDevice);
        VideoFrame img = vid.getRawFrameGrabber(800, 448, 0, 0);
        return img;
    }
    public void exportShot(String myVideoDevice, String path) throws V4L4JException{
        Object shot = shot(myVideoDevice);
        //to-do: write output into file
    }    
}
