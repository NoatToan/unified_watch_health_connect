package com.beaglebuddy.id3.v24.frame_body;

import com.beaglebuddy.id3.enums.v24.FrameType;
import com.beaglebuddy.util.Utility;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v24FrameBodyMPEGLocationLookupTable extends ID3v24FrameBody {
    public ID3v24FrameBodyMPEGLocationLookupTable() {
        super(FrameType.MPEG_LOCATION_LOOKUP_TABLE);
        this.dirty = true;
    }

    @Override // com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBody
    public void parse() throws IllegalArgumentException {
        this.dirty = false;
    }

    @Override // com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBody
    public void setBuffer() {
        this.dirty = false;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("frame body: MPEG location lookup table\n");
        stringBuffer.append("   bytes..........: " + this.buffer.length + " bytes\n");
        stringBuffer.append("                    " + Utility.hex(this.buffer, 20) + "\n");
        return stringBuffer.toString();
    }

    public ID3v24FrameBodyMPEGLocationLookupTable(InputStream inputStream, int i) throws IOException {
        super(inputStream, FrameType.MPEG_LOCATION_LOOKUP_TABLE, i);
    }
}
