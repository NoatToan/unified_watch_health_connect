package com.beaglebuddy.id3.v23.frame_body;

import com.beaglebuddy.id3.enums.v23.FrameType;
import com.beaglebuddy.util.Utility;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v23FrameBodyReverb extends ID3v23FrameBody {
    private int a;
    private int b;
    private byte c;
    private byte d;
    private byte e;
    private byte f;
    private byte g;
    private byte h;
    private byte i;
    private byte j;

    public ID3v23FrameBodyReverb() {
        this(0, 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0);
    }

    public byte getFeedbackLeftToLeft() {
        return this.e;
    }

    public byte getFeedbackLeftToRight() {
        return this.f;
    }

    public byte getFeedbackRightToLeft() {
        return this.h;
    }

    public byte getFeedbackRightToRight() {
        return this.g;
    }

    public int getLeft() {
        return this.a;
    }

    public byte getLeftBounces() {
        return this.c;
    }

    public byte getPremixLeftToRight() {
        return this.i;
    }

    public byte getPremixRightToLeft() {
        return this.j;
    }

    public int getRight() {
        return this.b;
    }

    public byte getRightBounces() {
        return this.d;
    }

    @Override // com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBody
    public void parse() throws IllegalArgumentException {
        byte[] bArr = this.buffer;
        if (bArr.length != 12) {
            throw new IllegalArgumentException("Invalid " + this.frameType + " frame body.  It must be 12 bytes in length, not " + this.buffer.length + ".");
        }
        setLeft(((bArr[0] & 255) << 8) + (bArr[1] & 255));
        byte[] bArr2 = this.buffer;
        setRight(((bArr2[2] & 255) << 8) + (bArr2[3] & 255));
        setLeftBounces(this.buffer[4]);
        setRightBounces(this.buffer[5]);
        setFeedbackLeftToLeft(this.buffer[6]);
        setFeedbackLeftToRight(this.buffer[7]);
        setFeedbackRightToRight(this.buffer[8]);
        setFeedbackRightToLeft(this.buffer[9]);
        setPremixLeftToRight(this.buffer[10]);
        setPremixRightToLeft(this.buffer[11]);
        this.dirty = false;
    }

    @Override // com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBody
    public void setBuffer() {
        if (isDirty()) {
            System.arraycopy(Utility.shortToBytes(this.a), 0, this.buffer, 0, 2);
            System.arraycopy(Utility.shortToBytes(this.b), 0, this.buffer, 2, 2);
            byte[] bArr = this.buffer;
            bArr[4] = this.c;
            bArr[5] = this.d;
            bArr[6] = this.e;
            bArr[7] = this.f;
            bArr[8] = this.g;
            bArr[9] = this.h;
            bArr[10] = this.i;
            bArr[11] = this.j;
            this.dirty = false;
        }
    }

    public void setFeedbackLeftToLeft(byte b) {
        if (b >= 0) {
            this.e = b;
            this.dirty = true;
            return;
        }
        throw new IllegalArgumentException("The feedback left to left field in the " + this.frameType.getId() + " frame contains an invalid value, " + ((int) b) + ".  It must >= 0.");
    }

    public void setFeedbackLeftToRight(byte b) {
        if (b >= 0) {
            this.f = b;
            this.dirty = true;
            return;
        }
        throw new IllegalArgumentException("The feedback left to right field in the " + this.frameType.getId() + " frame contains an invalid value, " + ((int) b) + ".  It must >= 0.");
    }

    public void setFeedbackRightToLeft(byte b) {
        if (b >= 0) {
            this.h = b;
            this.dirty = true;
            return;
        }
        throw new IllegalArgumentException("The feedback right to left field in the " + this.frameType.getId() + " frame contains an invalid value, " + ((int) b) + ".  It must >= 0.");
    }

    public void setFeedbackRightToRight(byte b) {
        if (b >= 0) {
            this.g = b;
            this.dirty = true;
            return;
        }
        throw new IllegalArgumentException("The feedback right to right field in the " + this.frameType.getId() + " frame contains an invalid value, " + ((int) b) + ".  It must >= 0.");
    }

    public void setLeft(int i) {
        if (i >= 0) {
            this.a = i;
            this.dirty = true;
            return;
        }
        throw new IllegalArgumentException("The left field in the " + this.frameType.getId() + " frame contains an invalid value, " + i + ".  It must >= 0.");
    }

    public void setLeftBounces(byte b) {
        if (b >= 0) {
            this.c = b;
            this.dirty = true;
            return;
        }
        throw new IllegalArgumentException("The left bounces field in the " + this.frameType.getId() + " frame contains an invalid value, " + ((int) b) + ".  It must >= 0.");
    }

    public void setPremixLeftToRight(byte b) {
        if (b >= 0) {
            this.i = b;
            this.dirty = true;
            return;
        }
        throw new IllegalArgumentException("The premix left to right field in the " + this.frameType.getId() + " frame contains an invalid value, " + ((int) b) + ".  It must >= 0.");
    }

    public void setPremixRightToLeft(byte b) {
        if (b >= 0) {
            this.j = b;
            this.dirty = true;
            return;
        }
        throw new IllegalArgumentException("The premix right to left field in the " + this.frameType.getId() + " frame contains an invalid value, " + ((int) b) + ".  It must >= 0.");
    }

    public void setRight(int i) {
        if (i >= 0) {
            this.b = i;
            this.dirty = true;
            return;
        }
        throw new IllegalArgumentException("The right field in the " + this.frameType.getId() + " frame contains an invalid value, " + i + ".  It must >= 0.");
    }

    public void setRightBounces(byte b) {
        if (b >= 0) {
            this.d = b;
            this.dirty = true;
            return;
        }
        throw new IllegalArgumentException("The right bounces field in the " + this.frameType.getId() + " frame contains an invalid value, " + ((int) b) + ".  It must >= 0.");
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("frame body: reverb\n");
        stringBuffer.append("   left...................: " + this.a + "\n");
        stringBuffer.append("   right..................: " + this.b + "\n");
        stringBuffer.append("   left  bounces..........: " + ((int) this.c) + "\n");
        stringBuffer.append("   right bounces..........: " + ((int) this.d) + "\n");
        stringBuffer.append("   feedback left  to left.: " + ((int) this.e) + "\n");
        stringBuffer.append("   feedback left  to right: " + ((int) this.f) + "\n");
        stringBuffer.append("   feedback right to right: " + ((int) this.g) + "\n");
        stringBuffer.append("   feedback right to left.: " + ((int) this.h) + "\n");
        stringBuffer.append("   premix   left  to right: " + ((int) this.i) + "\n");
        stringBuffer.append("   premix   right to left.: " + ((int) this.j) + "\n");
        return stringBuffer.toString();
    }

    public ID3v23FrameBodyReverb(int i, int i2, byte b, byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8) {
        super(FrameType.REVERB);
        setLeft(i);
        setRight(i2);
        setLeftBounces(b);
        setRightBounces(b2);
        setFeedbackLeftToLeft(b3);
        setFeedbackLeftToRight(b4);
        setFeedbackRightToRight(b5);
        setFeedbackRightToLeft(b6);
        setPremixLeftToRight(b7);
        setPremixRightToLeft(b8);
        this.dirty = true;
    }

    public ID3v23FrameBodyReverb(InputStream inputStream, int i) throws IOException {
        super(inputStream, FrameType.REVERB, i);
    }
}
