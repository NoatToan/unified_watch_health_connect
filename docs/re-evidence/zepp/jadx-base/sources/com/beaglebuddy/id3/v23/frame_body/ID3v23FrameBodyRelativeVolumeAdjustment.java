package com.beaglebuddy.id3.v23.frame_body;

import com.beaglebuddy.id3.enums.v23.FrameType;
import com.beaglebuddy.util.Utility;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v23FrameBodyRelativeVolumeAdjustment extends ID3v23FrameBody {
    private static int n = 65536;
    private static byte o = 1;
    private static byte p = 2;
    private static byte q = 3;
    private static byte r = 4;
    private static byte s = 5;
    private static byte t = 5;
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;

    public enum Direction {
        DECREASE_VOLUME,
        INCREASE_VOLUME;

        public static Direction getDirection(int i) {
            for (Direction direction : values()) {
                if (i == direction.ordinal()) {
                    return direction;
                }
            }
            throw new IllegalArgumentException("Invalid volume direction " + i + ".");
        }

        @Override // java.lang.Enum
        public String toString() {
            return "" + ordinal() + " - " + super.toString().toLowerCase();
        }
    }

    public ID3v23FrameBodyRelativeVolumeAdjustment() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    private void a(int i) {
        if (i == 16) {
            this.a = i;
            this.dirty = true;
            return;
        }
        throw new IllegalArgumentException("The bits used for volume adjustments field in the frame " + this.frameType.getId() + " contains an invalid value, " + i + ". The Beaglebuddy MP3 library only supports a value of 16 bits.");
    }

    public double convertVolumeAdjustmentsToDecibels(int i) {
        return (Math.log(((((double) i) / 256.0d) + 255.0d) / 255.0d) * 20.0d) / Math.log(10.0d);
    }

    public int getBitsUsedForVolumeAdjustments() {
        return this.a;
    }

    public int getPeakVolumeBackLeftChannel() {
        return this.i;
    }

    public int getPeakVolumeBackRightChannel() {
        return this.h;
    }

    public int getPeakVolumeBassChannel() {
        return this.m;
    }

    public int getPeakVolumeCenterChannel() {
        return this.k;
    }

    public int getPeakVolumeFrontLeftChannel() {
        return this.e;
    }

    public int getPeakVolumeFrontRightChannel() {
        return this.d;
    }

    public int getRelativeVolumeAdjustmentBackLeftChannel() {
        return this.g;
    }

    public int getRelativeVolumeAdjustmentBackRightChannel() {
        return this.f;
    }

    public int getRelativeVolumeAdjustmentBassChannel() {
        return this.l;
    }

    public int getRelativeVolumeAdjustmentCenterChannel() {
        return this.j;
    }

    public int getRelativeVolumeAdjustmentFrontLeftChannel() {
        return this.c;
    }

    public int getRelativeVolumeAdjustmentFrontRightChannel() {
        return this.b;
    }

    @Override // com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBody
    public void parse() throws IllegalArgumentException {
        byte[] bArr = this.buffer;
        Direction direction = (bArr[0] & o) == 0 ? Direction.DECREASE_VOLUME : Direction.INCREASE_VOLUME;
        Direction direction2 = (bArr[0] & p) == 0 ? Direction.DECREASE_VOLUME : Direction.INCREASE_VOLUME;
        Direction direction3 = (bArr[0] & q) == 0 ? Direction.DECREASE_VOLUME : Direction.INCREASE_VOLUME;
        Direction direction4 = (bArr[0] & r) == 0 ? Direction.DECREASE_VOLUME : Direction.INCREASE_VOLUME;
        Direction direction5 = (bArr[0] & s) == 0 ? Direction.DECREASE_VOLUME : Direction.INCREASE_VOLUME;
        Direction direction6 = (bArr[0] & t) == 0 ? Direction.DECREASE_VOLUME : Direction.INCREASE_VOLUME;
        a(bArr[1]);
        byte[] bArr2 = this.buffer;
        int i = ((bArr2[2] & 255) << 8) + (bArr2[3] & 255);
        Direction direction7 = Direction.INCREASE_VOLUME;
        setRelativeVolumeAdjustmentFrontRightChannel(i * (direction == direction7 ? 1 : -1));
        byte[] bArr3 = this.buffer;
        setRelativeVolumeAdjustmentFrontLeftChannel((((bArr3[4] & 255) << 8) + (bArr3[5] & 255)) * (direction2 == direction7 ? 1 : -1));
        byte[] bArr4 = this.buffer;
        setPeakVolumeFrontRightChannel(((bArr4[6] & 255) << 8) + (bArr4[7] & 255));
        byte[] bArr5 = this.buffer;
        setPeakVolumeFrontLeftChannel(((bArr5[8] & 255) << 8) + (bArr5[9] & 255));
        byte[] bArr6 = this.buffer;
        if (bArr6.length >= 14) {
            setRelativeVolumeAdjustmentBackRightChannel((((bArr6[10] & 255) << 8) + (bArr6[11] & 255)) * (direction3 == direction7 ? 1 : -1));
            byte[] bArr7 = this.buffer;
            setRelativeVolumeAdjustmentBackLeftChannel((((bArr7[12] & 255) << 8) + (bArr7[13] & 255)) * (direction4 == direction7 ? 1 : -1));
        }
        byte[] bArr8 = this.buffer;
        if (bArr8.length >= 18) {
            setPeakVolumeBackRightChannel(((bArr8[14] & 255) << 8) + (bArr8[15] & 255));
            byte[] bArr9 = this.buffer;
            setPeakVolumeBackLeftChannel(((bArr9[16] & 255) << 8) + (bArr9[17] & 255));
        }
        byte[] bArr10 = this.buffer;
        if (bArr10.length >= 20) {
            setRelativeVolumeAdjustmentCenterChannel((((bArr10[18] & 255) << 8) + (bArr10[19] & 255)) * (direction5 == direction7 ? 1 : -1));
        }
        byte[] bArr11 = this.buffer;
        if (bArr11.length >= 22) {
            setPeakVolumeCenterChannel(((bArr11[20] & 255) << 8) + (bArr11[21] & 255));
        }
        byte[] bArr12 = this.buffer;
        if (bArr12.length >= 24) {
            setRelativeVolumeAdjustmentBassChannel((((bArr12[22] & 255) << 8) + (bArr12[23] & 255)) * (direction6 != direction7 ? -1 : 1));
        }
        byte[] bArr13 = this.buffer;
        if (bArr13.length == 26) {
            setPeakVolumeBassChannel(((bArr13[24] & 255) << 8) + (bArr13[25] & 255));
        }
        this.dirty = false;
    }

    @Override // com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBody
    public void setBuffer() {
        if (isDirty()) {
            if (this.buffer.length != 26) {
                this.buffer = new byte[26];
            }
            byte[] bArr = this.buffer;
            int i = this.b;
            bArr[0] = (byte) (i >= 0 ? bArr[0] | o : bArr[0] & (~o));
            bArr[0] = (byte) (this.c >= 0 ? bArr[0] | p : bArr[0] & (~p));
            bArr[0] = (byte) (this.f >= 0 ? bArr[0] | q : bArr[0] & (~q));
            bArr[0] = (byte) (this.g >= 0 ? bArr[0] | r : bArr[0] & (~r));
            bArr[0] = (byte) (this.j >= 0 ? bArr[0] | s : bArr[0] & (~s));
            bArr[0] = (byte) (this.l >= 0 ? bArr[0] | t : bArr[0] & (~t));
            bArr[1] = (byte) this.a;
            System.arraycopy(Utility.intToBytes(Math.abs(i)), 2, this.buffer, 2, 2);
            System.arraycopy(Utility.intToBytes(Math.abs(this.c)), 2, this.buffer, 4, 2);
            System.arraycopy(Utility.intToBytes(this.d), 2, this.buffer, 6, 2);
            System.arraycopy(Utility.intToBytes(this.e), 2, this.buffer, 8, 2);
            System.arraycopy(Utility.intToBytes(Math.abs(this.f)), 2, this.buffer, 10, 2);
            System.arraycopy(Utility.intToBytes(Math.abs(this.g)), 2, this.buffer, 12, 2);
            System.arraycopy(Utility.intToBytes(this.h), 2, this.buffer, 14, 2);
            System.arraycopy(Utility.intToBytes(this.i), 2, this.buffer, 16, 2);
            System.arraycopy(Utility.intToBytes(Math.abs(this.j)), 2, this.buffer, 18, 2);
            System.arraycopy(Utility.intToBytes(this.k), 2, this.buffer, 20, 2);
            System.arraycopy(Utility.intToBytes(Math.abs(this.l)), 2, this.buffer, 22, 2);
            System.arraycopy(Utility.intToBytes(this.m), 2, this.buffer, 24, 2);
        }
        this.dirty = false;
    }

    public void setPeakVolumeBackLeftChannel(int i) {
        int i2 = n;
        if (i >= (-i2) && i <= i2) {
            this.i = i;
            this.dirty = true;
            return;
        }
        throw new IllegalArgumentException("The peak volume back left channel field in the frame " + this.frameType.getId() + " contains an invalid value, " + i + ". It must be " + (-n) + " < peak volume <= " + n + ".");
    }

    public void setPeakVolumeBackRightChannel(int i) {
        int i2 = n;
        if (i >= (-i2) && i <= i2) {
            this.h = i;
            this.dirty = true;
            return;
        }
        throw new IllegalArgumentException("The peak volume back right channel field in the frame " + this.frameType.getId() + " contains an invalid value, " + i + ". It must be " + (-n) + " < peak volume <= " + n + ".");
    }

    public void setPeakVolumeBassChannel(int i) {
        int i2 = n;
        if (i >= (-i2) && i <= i2) {
            this.m = i;
            this.dirty = true;
            return;
        }
        throw new IllegalArgumentException("The peak volume bass channel field in the frame " + this.frameType.getId() + " contains an invalid value, " + i + ". It must be " + (-n) + " < peak volume <= " + n + ".");
    }

    public void setPeakVolumeCenterChannel(int i) {
        int i2 = n;
        if (i >= (-i2) && i <= i2) {
            this.k = i;
            this.dirty = true;
            return;
        }
        throw new IllegalArgumentException("The peak volume center channel field in the frame " + this.frameType.getId() + " contains an invalid value, " + i + ". It must be " + (-n) + " < peak volume <= " + n + ".");
    }

    public void setPeakVolumeFrontLeftChannel(int i) {
        int i2 = n;
        if (i >= (-i2) && i <= i2) {
            this.e = i;
            this.dirty = true;
            return;
        }
        throw new IllegalArgumentException("The peak volume front left channel field in the frame " + this.frameType.getId() + " contains an invalid value, " + i + ". It must be " + (-n) + " < peak volume <= " + n + ".");
    }

    public void setPeakVolumeFrontRightChannel(int i) {
        int i2 = n;
        if (i >= (-i2) && i <= i2) {
            this.d = i;
            this.dirty = true;
            return;
        }
        throw new IllegalArgumentException("The peak volume front right channel field in the frame " + this.frameType.getId() + " contains an invalid value, " + i + ". It must be " + (-n) + " < peak volume <= " + n + ".");
    }

    public void setRelativeVolumeAdjustmentBackLeftChannel(int i) {
        int i2 = n;
        if (i >= (-i2) && i <= i2) {
            this.g = i;
            this.dirty = true;
            return;
        }
        throw new IllegalArgumentException("The relative volume adjustment back left channel field in the frame " + this.frameType.getId() + " contains an invalid value, " + i + ". It must be " + (-n) + " < volume adjustment <= " + n + ".");
    }

    public void setRelativeVolumeAdjustmentBackRightChannel(int i) {
        int i2 = n;
        if (i >= (-i2) && i <= i2) {
            this.f = i;
            this.dirty = true;
            return;
        }
        throw new IllegalArgumentException("The relative volume adjustment back right channel field in the frame " + this.frameType.getId() + " contains an invalid value, " + i + ". It must be " + (-n) + " < volume adjustment <= " + n + ".");
    }

    public void setRelativeVolumeAdjustmentBassChannel(int i) {
        int i2 = n;
        if (i >= (-i2) && i <= i2) {
            this.l = i;
            this.dirty = true;
            return;
        }
        throw new IllegalArgumentException("The relative volume adjustment bass channel field in the frame " + this.frameType.getId() + " contains an invalid value, " + i + ". It must be " + (-n) + " < volume adjustment <= " + n + ".");
    }

    public void setRelativeVolumeAdjustmentCenterChannel(int i) {
        int i2 = n;
        if (i >= (-i2) && i <= i2) {
            this.j = i;
            this.dirty = true;
            return;
        }
        throw new IllegalArgumentException("The relative volume adjustment center channel field in the frame " + this.frameType.getId() + " contains an invalid value, " + i + ". It must be " + (-n) + " < volume adjustment <= " + n + ".");
    }

    public void setRelativeVolumeAdjustmentFrontLeftChannel(int i) {
        int i2 = n;
        if (i >= (-i2) && i <= i2) {
            this.c = i;
            this.dirty = true;
            return;
        }
        throw new IllegalArgumentException("The relative volume adjustment front left channel field in the frame " + this.frameType.getId() + " contains an invalid value, " + i + ". It must be " + (-n) + " < volume adjustment <= " + n + ".");
    }

    public void setRelativeVolumeAdjustmentFrontRightChannel(int i) {
        int i2 = n;
        if (i >= (-i2) && i <= i2) {
            this.b = i;
            this.dirty = true;
            return;
        }
        throw new IllegalArgumentException("The relative volume adjustment front right channel field in the frame " + this.frameType.getId() + " contains an invalid value, " + i + ". It must be " + (-n) + " < volume adjustment <= " + n + ".");
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("frame body: relative volume adjustment\n");
        stringBuffer.append("   bytes..........................................: " + this.buffer.length + " bytes\n");
        stringBuffer.append("                                                    " + Utility.hex(this.buffer, 52) + "\n");
        stringBuffer.append("   bits used for volume adjustments...............: " + this.a + "\n");
        StringBuilder sb = new StringBuilder();
        sb.append("   volume adjustment direction front right channel: ");
        sb.append((this.buffer[0] & o) == 0 ? Direction.DECREASE_VOLUME : Direction.INCREASE_VOLUME);
        sb.append("\n");
        stringBuffer.append(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("   volume adjustment direction front left  channel: ");
        sb2.append((this.buffer[0] & p) == 0 ? Direction.DECREASE_VOLUME : Direction.INCREASE_VOLUME);
        sb2.append("\n");
        stringBuffer.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("   volume adjustment direction back  right channel: ");
        sb3.append((this.buffer[0] & q) == 0 ? Direction.DECREASE_VOLUME : Direction.INCREASE_VOLUME);
        sb3.append("\n");
        stringBuffer.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("   volume adjustment direction back  left  channel: ");
        sb4.append((this.buffer[0] & r) == 0 ? Direction.DECREASE_VOLUME : Direction.INCREASE_VOLUME);
        sb4.append("\n");
        stringBuffer.append(sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append("   volume adjustment direction center      channel: ");
        sb5.append((this.buffer[0] & s) == 0 ? Direction.DECREASE_VOLUME : Direction.INCREASE_VOLUME);
        sb5.append("\n");
        stringBuffer.append(sb5.toString());
        StringBuilder sb6 = new StringBuilder();
        sb6.append("   volume adjustment direction bass        channel: ");
        sb6.append((this.buffer[0] & t) == 0 ? Direction.DECREASE_VOLUME : Direction.INCREASE_VOLUME);
        sb6.append("\n");
        stringBuffer.append(sb6.toString());
        stringBuffer.append("   relative volume adjustment  front right channel: " + this.b + "\n");
        stringBuffer.append("   relative volume adjustment  front left  channel: " + this.c + "\n");
        stringBuffer.append("   relative volume adjustment  back  right channel: " + this.f + "\n");
        stringBuffer.append("   relative volume adjustment  back  left  channel: " + this.g + "\n");
        stringBuffer.append("   relative volume adjustment  center      channel: " + this.j + "\n");
        stringBuffer.append("   relative volume adjustment  bass        channel: " + this.l + "\n");
        stringBuffer.append("   peak volume front right channel................: " + this.d + "\n");
        stringBuffer.append("   peak volume front left  channel................: " + this.e + "\n");
        stringBuffer.append("   peak volume back  right channel................: " + this.h + "\n");
        stringBuffer.append("   peak volume back  left  channel................: " + this.i + "\n");
        stringBuffer.append("   peak volume center      channel................: " + this.k + "\n");
        stringBuffer.append("   peak volume bass        channel................: " + this.m + "\n");
        return stringBuffer.toString();
    }

    public ID3v23FrameBodyRelativeVolumeAdjustment(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        super(FrameType.RELATIVE_VOLUME_ADJUSTMENT);
        setRelativeVolumeAdjustmentFrontRightChannel(i);
        setRelativeVolumeAdjustmentFrontLeftChannel(i2);
        setRelativeVolumeAdjustmentBackRightChannel(i3);
        setRelativeVolumeAdjustmentBackLeftChannel(i4);
        setRelativeVolumeAdjustmentCenterChannel(i5);
        setRelativeVolumeAdjustmentBassChannel(i6);
        setPeakVolumeFrontRightChannel(i7);
        setPeakVolumeFrontLeftChannel(i8);
        setPeakVolumeBackRightChannel(i9);
        setPeakVolumeBackLeftChannel(i10);
        setPeakVolumeCenterChannel(i11);
        setPeakVolumeBassChannel(i12);
        this.dirty = true;
    }

    public ID3v23FrameBodyRelativeVolumeAdjustment(InputStream inputStream, int i) throws IOException {
        super(inputStream, FrameType.RELATIVE_VOLUME_ADJUSTMENT, i);
    }
}
