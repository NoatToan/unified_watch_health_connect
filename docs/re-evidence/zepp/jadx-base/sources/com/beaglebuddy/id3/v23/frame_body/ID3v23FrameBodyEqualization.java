package com.beaglebuddy.id3.v23.frame_body;

import com.beaglebuddy.id3.enums.v23.FrameType;
import com.beaglebuddy.id3.pojo.v23.Level;
import com.beaglebuddy.util.Utility;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v23FrameBodyEqualization extends ID3v23FrameBody {
    private static byte c = -128;
    private static byte d = 127;
    private int a;
    private List<Level> b;

    public ID3v23FrameBodyEqualization() {
        this(16, new Vector());
    }

    private int a() {
        int i = this.a;
        return (i / 8) + (i % 8 == 0 ? 0 : 1);
    }

    public List<Level> getLevels() {
        return this.b;
    }

    public int getNumAdjustmentBits() {
        return this.a;
    }

    @Override // com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBody
    public void parse() throws IllegalArgumentException {
        int i;
        int i2;
        byte b;
        setNumAdjustmentBits(this.buffer[0]);
        this.b = new Vector();
        int iA = a();
        byte[] bArr = new byte[iA];
        int i3 = 1;
        while (true) {
            byte[] bArr2 = this.buffer;
            if (i3 >= bArr2.length) {
                this.dirty = false;
                return;
            }
            int i4 = (bArr2[i3] & c) >> 7;
            short s = (short) ((bArr2[i3] & d) << ((bArr2[i3 + 1] & 255) + 8));
            int i5 = i3 + 2;
            System.arraycopy(bArr2, i5, bArr, 0, iA);
            if (iA != 1) {
                if (iA == 2) {
                    i2 = (bArr[i5] & 255) << 8;
                    b = bArr[i5 + 1];
                } else if (iA == 3) {
                    int i6 = i5 + 1;
                    i2 = ((bArr[i5] & 255) << 16) + ((bArr[i6] & 255) << 8);
                    b = bArr[i6];
                } else if (iA != 4) {
                    i = 0;
                } else {
                    i2 = ((bArr[i5] & 255) << 24) + ((bArr[i5 + 1] & 255) << 16) + ((bArr[i5 + 2] & 255) << 8);
                    b = bArr[i5 + 3];
                }
                i = i2 + (b & 255);
            } else {
                i = bArr[i5] & 255;
            }
            i3 = i5 + iA;
            this.b.add(new Level(Level.Direction.getDirection(i4), s, i));
        }
    }

    @Override // com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBody
    public void setBuffer() {
        if (isDirty()) {
            int iA = a() + 2;
            byte[] bArr = new byte[iA];
            byte[] bArr2 = new byte[(this.b.size() * iA) + 1];
            this.buffer = bArr2;
            bArr2[0] = (byte) this.a;
            for (Level level : this.b) {
                System.arraycopy(Utility.shortToBytes(level.getFrequency()), 0, bArr, 0, 2);
                bArr[0] = (byte) (level.getDirection().ordinal() == 1 ? bArr[0] | c : bArr[0] & (~c));
                System.arraycopy(Utility.intToBytes(level.getAdjustment()), 4 - a(), bArr, 2, iA - 2);
                System.arraycopy(bArr, 0, this.buffer, 1, iA);
            }
            this.dirty = false;
        }
    }

    public void setLevels(Level[] levelArr) {
        Vector vector = new Vector();
        if (levelArr != null) {
            for (Level level : levelArr) {
                vector.add(level);
            }
        }
        setLevels(vector);
    }

    public void setNumAdjustmentBits(int i) throws IllegalArgumentException {
        if (i > 0 && i <= 32) {
            this.dirty = true;
            this.a = i;
            return;
        }
        throw new IllegalArgumentException("The number of adjustment bits field in the " + this.frameType.getId() + " frame contains an invalid value, " + i + ".  It must be  0 < number of adjustment bits <= 32.");
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("frame body: equalization\n");
        stringBuffer.append("   bytes..............: " + this.buffer.length + " bytes\n");
        stringBuffer.append("                        " + Utility.hex(this.buffer, 24) + "\n");
        stringBuffer.append("   num adjustment bits: " + this.a + "\n");
        stringBuffer.append("   EQ levels..........: " + this.b.size() + "\n");
        Iterator<Level> it2 = this.b.iterator();
        while (it2.hasNext()) {
            stringBuffer.append("                        " + it2.next() + "\n");
        }
        return stringBuffer.toString();
    }

    public ID3v23FrameBodyEqualization(int i, Level[] levelArr) {
        super(FrameType.EQUALIZATION);
        setNumAdjustmentBits(i);
        setLevels(levelArr);
        this.dirty = true;
    }

    public void setLevels(List<Level> list) {
        int iPow = ((int) Math.pow(2.0d, this.a)) - 1;
        for (Level level : list) {
            if (level.getAdjustment() > iPow) {
                throw new IllegalArgumentException("The amount of adjustment field in the equalization level " + level + " in the " + this.frameType.getId() + " frame contains an invalid value, " + level.getAdjustment() + ".  It must be <= " + iPow + ".");
            }
        }
        this.dirty = true;
        this.b = list;
    }

    public ID3v23FrameBodyEqualization(int i, List<Level> list) {
        super(FrameType.EQUALIZATION);
        setNumAdjustmentBits(i);
        setLevels(list);
        this.dirty = true;
    }

    public ID3v23FrameBodyEqualization(InputStream inputStream, int i) throws IOException {
        super(inputStream, FrameType.EQUALIZATION, i);
    }
}
