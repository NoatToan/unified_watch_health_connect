package org.apache.commons.io;

import com.huami.mifit.sportlib.common.DataTypeSource;
import java.io.Serializable;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* JADX INFO: loaded from: classes23.dex */
public class ByteOrderMark implements Serializable {
    public static final char UTF_BOM = 65279;
    private static final long serialVersionUID = 1;
    private final String a;
    private final int[] b;
    public static final ByteOrderMark UTF_8 = new ByteOrderMark("UTF-8", 239, DataTypeSource.SPORT_TYPE_TAP_DANCE, DataTypeSource.SPORT_TYPE_NO_GPS_SOCCER);
    public static final ByteOrderMark UTF_16BE = new ByteOrderMark("UTF-16BE", 254, 255);
    public static final ByteOrderMark UTF_16LE = new ByteOrderMark("UTF-16LE", 255, 254);
    public static final ByteOrderMark UTF_32BE = new ByteOrderMark("UTF-32BE", 0, 0, 254, 255);
    public static final ByteOrderMark UTF_32LE = new ByteOrderMark("UTF-32LE", 255, 254, 0, 0);

    public ByteOrderMark(String str, int... iArr) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("No charsetName specified");
        }
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("No bytes specified");
        }
        this.a = str;
        int[] iArr2 = new int[iArr.length];
        this.b = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ByteOrderMark)) {
            return false;
        }
        ByteOrderMark byteOrderMark = (ByteOrderMark) obj;
        if (this.b.length != byteOrderMark.length()) {
            return false;
        }
        int i = 0;
        while (true) {
            int[] iArr = this.b;
            if (i >= iArr.length) {
                return true;
            }
            if (iArr[i] != byteOrderMark.get(i)) {
                return false;
            }
            i++;
        }
    }

    public int get(int i) {
        return this.b[i];
    }

    public byte[] getBytes() {
        byte[] bArr = new byte[this.b.length];
        int i = 0;
        while (true) {
            int[] iArr = this.b;
            if (i >= iArr.length) {
                return bArr;
            }
            bArr[i] = (byte) iArr[i];
            i++;
        }
    }

    public String getCharsetName() {
        return this.a;
    }

    public int hashCode() {
        int iHashCode = getClass().hashCode();
        for (int i : this.b) {
            iHashCode += i;
        }
        return iHashCode;
    }

    public int length() {
        return this.b.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(JsonLexerKt.BEGIN_LIST);
        sb.append(this.a);
        sb.append(": ");
        for (int i = 0; i < this.b.length; i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append("0x");
            sb.append(Integer.toHexString(this.b[i] & 255).toUpperCase());
        }
        sb.append(JsonLexerKt.END_LIST);
        return sb.toString();
    }
}
