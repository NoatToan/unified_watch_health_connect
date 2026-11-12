package com.beaglebuddy.id3.v23.frame_body;

import com.beaglebuddy.id3.enums.v23.FrameType;
import com.beaglebuddy.util.Utility;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v23FrameBodyPlayCounter extends ID3v23FrameBody {
    private int a;

    public ID3v23FrameBodyPlayCounter() {
        this(0);
    }

    public int getCounter() {
        return this.a;
    }

    @Override // com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBody
    public void parse() throws IllegalArgumentException {
        byte[] bArr = this.buffer;
        if (bArr.length == 4) {
            this.a = ((bArr[3] & 255) << 24) + ((bArr[2] & 255) << 16) + ((bArr[1] & 255) << 8) + (bArr[0] & 255);
            this.dirty = false;
            return;
        }
        throw new IllegalArgumentException("The size of the counter field in the " + this.frameType.getId() + " can not be " + this.buffer.length + " bytes.  It must be 4 bytes.");
    }

    @Override // com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBody
    public void setBuffer() {
        if (isDirty()) {
            this.buffer = new byte[4];
            System.arraycopy(Utility.intToBytes(this.a), 0, this.buffer, 0, 4);
            this.dirty = false;
        }
    }

    public void setCounter(int i) {
        if (i >= 0) {
            this.a = i;
            this.dirty = true;
            return;
        }
        throw new IllegalArgumentException("The counter field in the " + this.frameType.getId() + " frame contains an invalid value, " + i + ".  It must be >= 0.");
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("frame body: play counter\n");
        stringBuffer.append("   bytes...........: " + this.buffer.length + " bytes\n");
        stringBuffer.append("                     " + Utility.hex(this.buffer, 21) + "\n");
        stringBuffer.append("   num times played: " + this.a + "\n");
        return stringBuffer.toString();
    }

    public ID3v23FrameBodyPlayCounter(int i) {
        super(FrameType.PLAY_COUNTER);
        setCounter(i);
        this.dirty = true;
    }

    public ID3v23FrameBodyPlayCounter(InputStream inputStream, int i) throws IOException {
        super(inputStream, FrameType.PLAY_COUNTER, i);
    }
}
