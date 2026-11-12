package com.beaglebuddy.ape;

import com.beaglebuddy.exception.ParseException;
import com.beaglebuddy.util.Utility;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes2.dex */
public class APEFooter {
    public static final int SIZE = 32;
    private static final String g = "APETAGEX";
    private static final int h = 8;
    private static final int i = 4;
    private static final int j = 4;
    private static final int k = 4;
    private String a;
    private int b;
    private int c;
    private int d;
    private int e;
    private APEFlags f;

    public APEFooter(byte[] bArr) throws ParseException {
        this(bArr, "footer");
    }

    public APEFlags getFlags() {
        return this.f;
    }

    public int getNumItems() {
        return this.e;
    }

    public int getSize() {
        return this.b;
    }

    public int getTagSize() {
        return this.d;
    }

    public int getVersion() {
        return this.c;
    }

    public String toString() {
        return toString("footer");
    }

    public APEFooter(byte[] bArr, String str) throws ParseException {
        if (bArr.length < 32) {
            throw new ParseException("Invalid size, " + bArr.length + ", of APE " + str + ".");
        }
        try {
            this.a = new String(bArr, 0, 8, "ISO-8859-1");
        } catch (UnsupportedEncodingException unused) {
            this.a = new String(bArr, 0, 8);
        }
        if (!this.a.equals(g)) {
            throw new ParseException("Invalid id, " + this.a + ", in APE " + str + ".");
        }
        int iLittleEndianBytesToInt = Utility.littleEndianBytesToInt(bArr, 8);
        this.c = iLittleEndianBytesToInt;
        if (iLittleEndianBytesToInt == 1000) {
            this.c = 1;
        } else {
            if (iLittleEndianBytesToInt != 2000) {
                throw new ParseException("Invalid version, " + this.c + ", in APE " + str + ".");
            }
            this.c = 2;
        }
        this.d = Utility.littleEndianBytesToInt(bArr, 12);
        this.e = Utility.littleEndianBytesToInt(bArr, 16);
        this.f = new APEFlags(bArr, 20);
        if (str.equals("footer") && !this.f.isFooter()) {
            throw new ParseException("Invalid APE footer flag type.");
        }
        if (str.equals("header") && !this.f.isHeader()) {
            throw new ParseException("Invalid APE header flag type.");
        }
        this.b = 32;
    }

    public String toString(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str + "\n");
        stringBuffer.append("      size.....: " + this.b + " bytes\n");
        stringBuffer.append("      id.......: " + this.a + "\n");
        stringBuffer.append("      version..: APEv" + this.c + "\n");
        stringBuffer.append("      tag size.: " + this.d + " bytes\n");
        stringBuffer.append("      num items: " + this.e + "\n");
        StringBuilder sb = new StringBuilder();
        sb.append("      flags....: ");
        sb.append(this.f);
        stringBuffer.append(sb.toString());
        return stringBuffer.toString();
    }
}
