package com.beaglebuddy.id3.v24.frame_body;

import com.beaglebuddy.id3.enums.v24.FrameType;
import com.beaglebuddy.util.Utility;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v24FrameBodySeek extends ID3v24FrameBody {
    private int a;

    public ID3v24FrameBodySeek() {
        this(0);
    }

    public int getOffsetToNextTag() {
        return this.a;
    }

    @Override // com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBody
    public void parse() throws IllegalArgumentException {
        setOffsetToNextTag(Utility.bytesToInt(this.buffer, 0));
        this.dirty = false;
    }

    @Override // com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBody
    public void setBuffer() {
        if (isDirty()) {
            System.arraycopy(Utility.intToBytes(this.a), 0, this.buffer, 0, 4);
            this.dirty = false;
        }
    }

    public void setOffsetToNextTag(int i) {
        if (i >= 0) {
            this.a = i;
            this.dirty = true;
            return;
        }
        throw new IllegalArgumentException("The offset to the next tag field in the ID3v2.4 " + this.frameType.getId() + " frame contains an invalid value, " + i + ".  It must be >= 0.");
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("frame body: seek\n");
        stringBuffer.append("   bytes.............: " + this.buffer.length + " bytes\n");
        stringBuffer.append("                       " + Utility.hex(this.buffer, 22) + "\n");
        StringBuilder sb = new StringBuilder();
        sb.append("   offset to next tag: ");
        sb.append(this.a);
        stringBuffer.append(sb.toString());
        return stringBuffer.toString();
    }

    public ID3v24FrameBodySeek(int i) {
        super(FrameType.SEEK_FRAME);
        setOffsetToNextTag(i);
        this.dirty = true;
    }

    public ID3v24FrameBodySeek(InputStream inputStream, int i) throws IOException {
        super(inputStream, FrameType.SEEK_FRAME, i);
    }
}
