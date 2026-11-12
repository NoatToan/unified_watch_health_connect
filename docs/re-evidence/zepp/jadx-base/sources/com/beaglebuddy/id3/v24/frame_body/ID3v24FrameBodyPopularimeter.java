package com.beaglebuddy.id3.v24.frame_body;

import com.beaglebuddy.id3.enums.v24.Encoding;
import com.beaglebuddy.id3.enums.v24.FrameType;
import com.beaglebuddy.util.Utility;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v24FrameBodyPopularimeter extends ID3v24FrameBody {
    public static final int BEST = 255;
    public static final int MIDDLE = 128;
    public static final int UNKNOWN = 0;
    public static final int WORST = 1;
    private String a;
    private int b;
    private int c;

    public ID3v24FrameBodyPopularimeter() {
        this(".", 0, 0);
    }

    public int getCounter() {
        return this.c;
    }

    public int getRating() {
        return this.b;
    }

    public String getUserEmail() {
        return this.a;
    }

    @Override // com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBody
    public void parse() throws IllegalArgumentException {
        Encoding encoding = Encoding.ISO_8859_1;
        int nextNullTerminator = getNextNullTerminator(0, encoding);
        this.nullTerminatorIndex = nextNullTerminator;
        setUserEmail(new String(this.buffer, 0, nextNullTerminator, encoding.getCharacterSet()).trim());
        int i = this.nullTerminatorIndex + 1;
        this.nullTerminatorIndex = i;
        setRating(this.buffer[i] & 255);
        int i2 = this.nullTerminatorIndex + 1;
        this.nullTerminatorIndex = i2;
        int i3 = i2 + 4;
        byte[] bArr = this.buffer;
        if (i3 <= bArr.length) {
            this.c = ((bArr[i2] & 255) << 24) + ((bArr[i2 + 1] & 255) << 16) + ((bArr[i2 + 2] & 255) << 8) + (bArr[i2 + 3] & 255);
            if (bArr.length - i2 > 4) {
                throw new IllegalArgumentException("The size of the counter field in the " + this.frameType.getId() + " can not be " + this.buffer.length + " bytes.  It must be 4 bytes.");
            }
        }
        this.dirty = false;
    }

    @Override // com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBody
    public void setBuffer() {
        if (isDirty()) {
            byte[] bArrStringToBytes = ID3v24FrameBodyUtility.stringToBytes(Encoding.ISO_8859_1, this.a);
            int length = bArrStringToBytes.length;
            byte[] bArr = new byte[bArrStringToBytes.length + 1 + (this.c == 0 ? 0 : 4)];
            this.buffer = bArr;
            System.arraycopy(bArrStringToBytes, 0, bArr, 0, bArrStringToBytes.length);
            this.buffer[length] = (byte) this.b;
            int i = this.c;
            if (i != 0) {
                System.arraycopy(Utility.intToBytes(i), 0, this.buffer, length + 1, 4);
            }
            this.dirty = false;
        }
    }

    public void setCounter(int i) {
        if (i >= 0) {
            this.c = i;
            this.dirty = true;
            return;
        }
        throw new IllegalArgumentException("The counter field in the " + this.frameType.getId() + " frame contains an invalid value, " + i + ".  It must be >= 0.");
    }

    public void setRating(int i) {
        if (i >= 0 && i <= 255) {
            this.b = i;
            this.dirty = true;
            return;
        }
        throw new IllegalArgumentException("The rating field in the " + this.frameType.getId() + " frame contains an invalid value, " + i + ".  It must be 0 <= rating <= 255.");
    }

    public void setUserEmail(String str) {
        if (str != null && str.length() != 0) {
            this.a = str;
            this.dirty = true;
        } else {
            throw new IllegalArgumentException("The user e-mail field in the " + this.frameType.getId() + " frame may not be empty.");
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("frame body: popularimeter\n");
        stringBuffer.append("   bytes...........: " + this.buffer.length + " bytes\n");
        stringBuffer.append("                     " + Utility.hex(this.buffer, 21) + "\n");
        stringBuffer.append("   user e-mail.....: " + this.a + "\n");
        stringBuffer.append("   rating..........: " + this.b + "\n");
        stringBuffer.append("   num times played: " + this.c + "\n");
        return stringBuffer.toString();
    }

    public ID3v24FrameBodyPopularimeter(String str, int i, int i2) {
        super(FrameType.POPULARIMETER);
        setUserEmail(str);
        setRating(i);
        setCounter(i2);
        this.dirty = true;
    }

    public ID3v24FrameBodyPopularimeter(InputStream inputStream, int i) throws IOException {
        super(inputStream, FrameType.POPULARIMETER, i);
    }
}
