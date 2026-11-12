package com.beaglebuddy.id3.v24.frame_body;

import com.beaglebuddy.id3.enums.v24.Encoding;
import com.beaglebuddy.id3.enums.v24.FrameType;
import com.beaglebuddy.id3.pojo.v24.Level;
import com.beaglebuddy.util.Utility;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v24FrameBodyEqualization extends ID3v24FrameBody {
    private InterpolationMethod a;
    private String b;
    private List<Level> c;

    public enum InterpolationMethod {
        BAND,
        LINEAR;

        public static InterpolationMethod getInterpolationMethod(int i) {
            for (InterpolationMethod interpolationMethod : values()) {
                if (i == interpolationMethod.ordinal()) {
                    return interpolationMethod;
                }
            }
            throw new IllegalArgumentException("Invalid ID3v2.4 interpolation method " + i + ".  It must be either 0 or 1.");
        }

        @Override // java.lang.Enum
        public String toString() {
            return "" + ordinal() + " - " + super.toString().toLowerCase();
        }
    }

    public ID3v24FrameBodyEqualization() {
        this(InterpolationMethod.LINEAR, "standard", new Vector());
    }

    public String getIdentification() {
        return this.b;
    }

    public InterpolationMethod getInterpolationMethod() {
        return this.a;
    }

    public List<Level> getLevels() {
        return this.c;
    }

    @Override // com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBody
    public void parse() throws IllegalArgumentException {
        setInterpolationMethod(InterpolationMethod.getInterpolationMethod(this.buffer[0]));
        Encoding encoding = Encoding.ISO_8859_1;
        int nextNullTerminator = getNextNullTerminator(1, encoding);
        this.nullTerminatorIndex = nextNullTerminator;
        setIdentification(new String(this.buffer, 1, nextNullTerminator - 1, encoding.getCharacterSet()).trim());
        int i = this.nullTerminatorIndex + 1;
        this.c = new Vector();
        while (true) {
            byte[] bArr = this.buffer;
            if (i >= bArr.length) {
                this.dirty = false;
                return;
            }
            short sBytesToShort = Utility.bytesToShort(bArr, i);
            int i2 = i + 2;
            short sBytesToShort2 = Utility.bytesToShort(this.buffer, i2);
            i = i2 + 2;
            this.c.add(new Level((short) (sBytesToShort / 2), ((double) sBytesToShort2) * 512.0d));
        }
    }

    @Override // com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBody
    public void setBuffer() {
        if (isDirty()) {
            byte[] bArrStringToBytes = ID3v24FrameBodyUtility.stringToBytes(Encoding.ISO_8859_1, this.b);
            byte[] bArr = new byte[bArrStringToBytes.length + 1 + (this.c.size() * 4)];
            this.buffer = bArr;
            bArr[0] = (byte) this.a.ordinal();
            System.arraycopy(bArrStringToBytes, 0, this.buffer, 1, bArrStringToBytes.length);
            int length = bArrStringToBytes.length + 1;
            for (Level level : this.c) {
                System.arraycopy(Utility.shortToBytes((short) (level.getFrequency() * 2)), 0, this.buffer, length, 2);
                length += 2;
                System.arraycopy(Utility.shortToBytes((short) (level.getVolume() * 512.0d)), 0, this.buffer, length, 2);
            }
            this.dirty = false;
        }
    }

    public void setIdentification(String str) {
        this.b = str;
        this.dirty = true;
    }

    public void setInterpolationMethod(InterpolationMethod interpolationMethod) {
        this.a = interpolationMethod;
        this.dirty = true;
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

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("frame body: equalization\n");
        stringBuffer.append("   bytes...............: " + this.buffer.length + " bytes\n");
        stringBuffer.append("                         " + Utility.hex(this.buffer, 25) + "\n");
        stringBuffer.append("   interpolation method: " + this.a + "\n");
        stringBuffer.append("   identification......: " + this.b + "\n");
        stringBuffer.append("   EQ levels...........: " + this.c.size() + "\n");
        Iterator<Level> it2 = this.c.iterator();
        while (it2.hasNext()) {
            stringBuffer.append("                         " + it2.next() + "\n");
        }
        return stringBuffer.toString();
    }

    public ID3v24FrameBodyEqualization(InterpolationMethod interpolationMethod, String str, Level[] levelArr) {
        super(FrameType.EQUALIZATION);
        setInterpolationMethod(interpolationMethod);
        setIdentification(str);
        setLevels(levelArr);
        this.dirty = true;
    }

    public void setLevels(List<Level> list) {
        if (list == null) {
            list = new Vector<>();
        }
        this.c = list;
        this.dirty = true;
    }

    public ID3v24FrameBodyEqualization(InterpolationMethod interpolationMethod, String str, List<Level> list) {
        super(FrameType.EQUALIZATION);
        setInterpolationMethod(interpolationMethod);
        setIdentification(str);
        setLevels(list);
        this.dirty = true;
    }

    public ID3v24FrameBodyEqualization(InputStream inputStream, int i) throws IOException {
        super(inputStream, FrameType.EQUALIZATION, i);
    }
}
