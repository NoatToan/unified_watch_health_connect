package com.beaglebuddy.id3.v24.frame_body;

import com.beaglebuddy.id3.enums.v24.FrameType;
import com.beaglebuddy.util.Utility;
import com.tencent.connect.common.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v24FrameBodyAudioSeekPointIndex extends ID3v24FrameBody {
    private int a;
    private int b;
    private BitsPerIndexPoint c;
    private List<Short> d;

    public enum BitsPerIndexPoint {
        SIZE_8_BITS,
        SIZE_16_BITS;

        public static BitsPerIndexPoint getBitsPerIndexPoint(int i) {
            for (BitsPerIndexPoint bitsPerIndexPoint : values()) {
                if (i == bitsPerIndexPoint.ordinal()) {
                    return bitsPerIndexPoint;
                }
            }
            throw new IllegalArgumentException("Invalid value bitsPerIndexPoint " + i + ".  It must be either 0 or 1.");
        }

        @Override // java.lang.Enum
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(ordinal());
            sb.append(" - ");
            sb.append(this == SIZE_8_BITS ? "8" : Constants.VIA_REPORT_TYPE_START_WAP);
            sb.append(" bits");
            return sb.toString();
        }
    }

    public ID3v24FrameBodyAudioSeekPointIndex() {
        this(0, 0, BitsPerIndexPoint.SIZE_16_BITS, new Vector());
    }

    public BitsPerIndexPoint getBitsPerIndexPoint() {
        return this.c;
    }

    public List<Short> getFractionAtIndexes() {
        return this.d;
    }

    public int getIndexedDataLength() {
        return this.b;
    }

    public int getIndexedDataStart() {
        return this.a;
    }

    public short getNumIndexPoints() {
        return (short) this.d.size();
    }

    @Override // com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBody
    public void parse() throws IllegalArgumentException {
        setIndexedDataStart(Utility.bytesToInt(this.buffer, 0));
        setIndexedDataLength(Utility.bytesToInt(this.buffer, 4));
        short sBytesToShort = Utility.bytesToShort(this.buffer, 8);
        setBitsPerIndexPoint(BitsPerIndexPoint.getBitsPerIndexPoint(this.buffer[10]));
        Vector vector = new Vector();
        int i = 11;
        if (this.c != BitsPerIndexPoint.SIZE_8_BITS) {
            while (true) {
                byte[] bArr = this.buffer;
                if (i >= bArr.length) {
                    break;
                }
                vector.add(new Short(Utility.bytesToShort(bArr, i)));
                i += 2;
            }
        } else {
            while (true) {
                byte[] bArr2 = this.buffer;
                if (i >= bArr2.length) {
                    break;
                }
                vector.add(new Short((short) (bArr2[i] & 255)));
                i++;
            }
        }
        setFractionAtIndexes(vector);
        if (this.d.size() == sBytesToShort) {
            this.dirty = false;
            return;
        }
        throw new IllegalArgumentException("The fractions at indexes field in the ID3v2.4 " + this.frameType.getId() + " frame contains " + this.d.size() + " values, while the number of index points field specifies that " + ((int) sBytesToShort) + " values are expected.");
    }

    public void setBitsPerIndexPoint(BitsPerIndexPoint bitsPerIndexPoint) {
        this.c = bitsPerIndexPoint;
        this.dirty = true;
    }

    @Override // com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBody
    public void setBuffer() {
        if (isDirty()) {
            int size = this.d.size();
            BitsPerIndexPoint bitsPerIndexPoint = this.c;
            BitsPerIndexPoint bitsPerIndexPoint2 = BitsPerIndexPoint.SIZE_8_BITS;
            int i = size * (bitsPerIndexPoint == bitsPerIndexPoint2 ? 1 : 2);
            int i2 = 11;
            this.buffer = new byte[i + 11];
            System.arraycopy(Utility.intToBytes(this.a), 0, this.buffer, 0, 4);
            System.arraycopy(Utility.intToBytes(this.b), 0, this.buffer, 4, 4);
            System.arraycopy(Utility.shortToBytes((short) this.d.size()), 0, this.buffer, 8, 2);
            this.buffer[10] = (byte) this.c.ordinal();
            if (this.c == bitsPerIndexPoint2) {
                Iterator<Short> it2 = this.d.iterator();
                while (it2.hasNext()) {
                    this.buffer[i2] = (byte) it2.next().shortValue();
                    i2++;
                }
            } else {
                Iterator<Short> it3 = this.d.iterator();
                while (it3.hasNext()) {
                    System.arraycopy(Utility.shortToBytes(it3.next().shortValue()), 0, this.buffer, i2, 2);
                    i2 += 2;
                }
            }
            this.dirty = false;
        }
    }

    public void setFractionAtIndexes(List<Short> list) {
        if (list == null) {
            list = new Vector<>();
        }
        this.d = list;
        this.dirty = true;
    }

    public void setIndexedDataLength(int i) {
        if (i > 0) {
            this.b = i;
            this.dirty = true;
            return;
        }
        throw new IllegalArgumentException("The indexed data length field in the ID3v2.4 " + this.frameType.getId() + " frame contains an invalid value, " + i + ".  It must be > 0.");
    }

    public void setIndexedDataStart(int i) {
        if (this.b >= 0) {
            this.a = i;
            this.dirty = true;
            return;
        }
        throw new IllegalArgumentException("The indexed data start field in the ID3v2.4 " + this.frameType.getId() + " frame contains an invalid value, " + i + ".  It must be >= 0.");
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("frame body: audio seek point index\n");
        stringBuffer.append("   bytes................: " + this.buffer.length + " bytes\n");
        stringBuffer.append("                          " + Utility.hex(this.buffer, 26) + "\n");
        stringBuffer.append("   indexed data start..: " + this.a + "\n");
        stringBuffer.append("   indexed data length.: " + this.b + "\n");
        stringBuffer.append("   num index points....: " + this.d.size() + "\n");
        stringBuffer.append("   bits per index point: " + this.c + "\n");
        stringBuffer.append("   fraction at indexes.: \n");
        Iterator<Short> it2 = this.d.iterator();
        while (it2.hasNext()) {
            stringBuffer.append("                          " + ((int) it2.next().shortValue()) + "\n");
        }
        return stringBuffer.toString();
    }

    public ID3v24FrameBodyAudioSeekPointIndex(int i, int i2, BitsPerIndexPoint bitsPerIndexPoint, List<Short> list) {
        super(FrameType.AUDIO_SEEK_POINT_INDEX);
        setIndexedDataStart(i);
        setIndexedDataLength(i2);
        setBitsPerIndexPoint(bitsPerIndexPoint);
        setFractionAtIndexes(list);
        this.dirty = true;
    }

    public ID3v24FrameBodyAudioSeekPointIndex(InputStream inputStream, int i) throws IOException {
        super(inputStream, FrameType.AUDIO_SEEK_POINT_INDEX, i);
    }
}
