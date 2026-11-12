package com.beaglebuddy.id3.v23.frame_body;

import com.beaglebuddy.id3.enums.v23.FrameType;
import com.beaglebuddy.util.Utility;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v23FrameBodyMPEGLocationLookupTable extends ID3v23FrameBody {
    public ID3v23FrameBodyMPEGLocationLookupTable() {
        super(FrameType.MPEG_LOCATION_LOOKUP_TABLE);
        this.dirty = true;
    }

    @Override // com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBody
    public void parse() throws IllegalArgumentException {
        this.dirty = false;
    }

    @Override // com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBody
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

    public ID3v23FrameBodyMPEGLocationLookupTable(InputStream inputStream, int i) throws IOException {
        super(inputStream, FrameType.MPEG_LOCATION_LOOKUP_TABLE, i);
    }
}
