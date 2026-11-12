package org.cybergarage.upnp.std.av.server.object.format;

import java.util.Vector;

/* JADX INFO: loaded from: classes23.dex */
public class ID3FrameList extends Vector {
    public ID3Frame at(int i) {
        return (ID3Frame) get(i);
    }

    public ID3Frame getFrame(int i) {
        return (ID3Frame) get(i);
    }

    public byte[] getFrameData(String str) {
        ID3Frame frame = getFrame(str);
        return frame == null ? new byte[0] : frame.getData();
    }

    public String getFrameStringData(String str) {
        ID3Frame frame = getFrame(str);
        return frame == null ? "" : frame.getStringData();
    }

    public ID3Frame getFrame(String str) {
        if (str == null) {
            return null;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            ID3Frame frame = getFrame(i);
            if (str.compareTo(frame.getID()) == 0) {
                return frame;
            }
        }
        return null;
    }
}
