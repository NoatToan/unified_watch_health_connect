package org.apache.commons.io;

import java.io.Serializable;
import java.util.Locale;
import org.apache.commons.lang3.CharEncoding;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class ByteOrderMark implements Serializable {
    public static final char UTF_BOM = 65279;
    private static final long serialVersionUID = 1;
    private final int[] bytes;
    private final String charsetName;
    public static final ByteOrderMark UTF_8 = new ByteOrderMark("UTF-8", 239, 187, 191);
    public static final ByteOrderMark UTF_16BE = new ByteOrderMark(CharEncoding.UTF_16BE, 254, 255);
    public static final ByteOrderMark UTF_16LE = new ByteOrderMark("UTF-16LE", 255, 254);
    public static final ByteOrderMark UTF_32BE = new ByteOrderMark("UTF-32BE", 0, 0, 254, 255);
    public static final ByteOrderMark UTF_32LE = new ByteOrderMark("UTF-32LE", 255, 254, 0, 0);

    public ByteOrderMark(String str, int... iArr) {
        if (str == null || str.isEmpty()) {
            h.s("No charsetName specified");
            throw null;
        }
        if (iArr == null || iArr.length == 0) {
            h.s("No bytes specified");
            throw null;
        }
        this.charsetName = str;
        int[] iArr2 = new int[iArr.length];
        this.bytes = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ByteOrderMark)) {
            return false;
        }
        ByteOrderMark byteOrderMark = (ByteOrderMark) obj;
        if (this.bytes.length != byteOrderMark.length()) {
            return false;
        }
        int i14 = 0;
        while (true) {
            int[] iArr = this.bytes;
            if (i14 >= iArr.length) {
                return true;
            }
            if (iArr[i14] != byteOrderMark.get(i14)) {
                return false;
            }
            i14++;
        }
    }

    public int get(int i14) {
        return this.bytes[i14];
    }

    public byte[] getBytes() {
        byte[] bArr = new byte[this.bytes.length];
        int i14 = 0;
        while (true) {
            int[] iArr = this.bytes;
            if (i14 >= iArr.length) {
                return bArr;
            }
            bArr[i14] = (byte) iArr[i14];
            i14++;
        }
    }

    public String getCharsetName() {
        return this.charsetName;
    }

    public int hashCode() {
        int iHashCode = getClass().hashCode();
        for (int i14 : this.bytes) {
            iHashCode += i14;
        }
        return iHashCode;
    }

    public int length() {
        return this.bytes.length;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(getClass().getSimpleName());
        sb3.append('[');
        sb3.append(this.charsetName);
        sb3.append(": ");
        for (int i14 = 0; i14 < this.bytes.length; i14++) {
            if (i14 > 0) {
                sb3.append(",");
            }
            sb3.append("0x");
            sb3.append(Integer.toHexString(this.bytes[i14] & 255).toUpperCase(Locale.ROOT));
        }
        sb3.append(']');
        return sb3.toString();
    }
}
