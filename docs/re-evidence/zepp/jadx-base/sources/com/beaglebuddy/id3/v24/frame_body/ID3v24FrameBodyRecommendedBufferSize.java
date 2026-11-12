package com.beaglebuddy.id3.v24.frame_body;

import com.beaglebuddy.id3.enums.v24.FrameType;
import com.beaglebuddy.util.Utility;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v24FrameBodyRecommendedBufferSize extends ID3v24FrameBody {
    private int a;
    private boolean b;
    private int c;

    public ID3v24FrameBodyRecommendedBufferSize() {
        this(0, false, 0);
    }

    public int getBufferSize() {
        return this.a;
    }

    public int getOffsetToNextTag() {
        return this.c;
    }

    public boolean isEmbeddedInfoFlag() {
        return this.b;
    }

    @Override // com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBody
    public void parse() throws IllegalArgumentException {
        byte[] bArr = this.buffer;
        this.a = ((bArr[0] & 255) << 16) + ((bArr[1] & 255) << 8) + (bArr[2] & 255);
        this.b = (bArr[3] & 1) == 1;
        this.c = bArr.length == 8 ? ((bArr[4] & 255) << 24) + ((bArr[5] & 255) << 16) + ((bArr[6] & 255) << 8) + (bArr[7] & 255) : 0;
        this.dirty = false;
    }

    @Override // com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBody
    public void setBuffer() {
        if (isDirty()) {
            this.buffer = new byte[(this.c == 0 ? 0 : 4) + 5];
            System.arraycopy(Utility.intToBytes(this.a), 0, this.buffer, 0, 4);
            this.buffer[4] = this.b ? (byte) 1 : (byte) 0;
            int i = this.c;
            if (i != 0) {
                System.arraycopy(Utility.intToBytes(i), 0, this.buffer, 5, 4);
            }
            this.dirty = false;
        }
    }

    public void setBufferSize(int i) {
        if (i >= 0) {
            this.a = i;
            this.dirty = true;
            return;
        }
        throw new IllegalArgumentException("The buffer size field in the " + this.frameType.getId() + " frame contains an onvalid value, " + i + ".  It must be >= 0.");
    }

    public void setEmbeddedInfoFlag(boolean z) {
        this.b = z;
        this.dirty = true;
    }

    public void setOffsetToNextTag(int i) {
        this.c = i;
        this.dirty = true;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("frame body: recommended buffer size\n");
        stringBuffer.append("   bytes.............: " + this.buffer.length + " bytes\n");
        stringBuffer.append("                       " + Utility.hex(this.buffer, 24) + "\n");
        stringBuffer.append("   buffer size.......: " + this.a + "\n");
        stringBuffer.append("   embedded info flag: " + this.b + "\n");
        stringBuffer.append("   offset to next tag: " + this.c + "\n");
        return stringBuffer.toString();
    }

    public ID3v24FrameBodyRecommendedBufferSize(int i, boolean z, int i2) {
        super(FrameType.RECOMMENDED_BUFFER_SIZE);
        setBufferSize(i);
        setEmbeddedInfoFlag(z);
        setOffsetToNextTag(i2);
        this.dirty = true;
    }

    public ID3v24FrameBodyRecommendedBufferSize(InputStream inputStream, int i) throws IOException {
        super(inputStream, FrameType.RECOMMENDED_BUFFER_SIZE, i);
    }
}
