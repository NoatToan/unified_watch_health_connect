package com.beaglebuddy.ape;

import com.beaglebuddy.util.Utility;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes2.dex */
public class APEItem {
    private static final int e = 4;
    private static final int f = 4;
    private int a;
    private APEFlags b;
    private String c;
    private byte[] d;

    public APEItem(byte[] bArr, int i) {
        int iLittleEndianBytesToInt = Utility.littleEndianBytesToInt(bArr, i);
        int i2 = i + 4;
        this.b = new APEFlags(bArr, i2);
        int i3 = i2 + 4;
        String strA = a(bArr, i3);
        this.c = strA;
        this.a = strA.length() + 8 + 1 + iLittleEndianBytesToInt;
        this.d = new byte[iLittleEndianBytesToInt];
        int length = i3 + this.c.length() + 1;
        byte[] bArr2 = this.d;
        System.arraycopy(bArr, length, bArr2, 0, bArr2.length);
    }

    private static String a(byte[] bArr, int i) {
        int i2 = i;
        while (i2 < bArr.length && bArr[i2] != 0) {
            i2++;
        }
        return new String(bArr, i, i2 - i);
    }

    public byte[] getBinaryValue() {
        return this.d;
    }

    public APEFlags getFlags() {
        return this.b;
    }

    public String getKey() {
        return this.c;
    }

    public int getSize() {
        return this.a;
    }

    public String getTextValue() {
        try {
            return new String(this.d, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return new String(this.d);
        }
    }

    public APEFlags.Type getType() {
        return this.b.getType();
    }

    public boolean isValueBinary() {
        return this.b.getType() == APEFlags.Type.BINARY;
    }

    public boolean isValueText() {
        return this.b.getType() != APEFlags.Type.BINARY;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("item\n");
        stringBuffer.append("      size.: " + this.a + " bytes\n");
        stringBuffer.append("      key..: " + this.c + "\n");
        StringBuilder sb = new StringBuilder();
        sb.append("      value: ");
        sb.append(this.b.getType() == APEFlags.Type.BINARY ? Utility.hex(this.d, 13) : getTextValue());
        sb.append("\n");
        stringBuffer.append(sb.toString());
        stringBuffer.append("      flags: " + this.b);
        return stringBuffer.toString();
    }
}
