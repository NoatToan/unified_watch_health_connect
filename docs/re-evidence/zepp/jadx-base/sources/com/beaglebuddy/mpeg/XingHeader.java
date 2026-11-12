package com.beaglebuddy.mpeg;

import com.beaglebuddy.exception.ParseException;
import com.beaglebuddy.mpeg.enums.BitrateType;
import com.beaglebuddy.util.Utility;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class XingHeader {
    public static final int HEADER_MAX_SIZE = 120;
    public static final int HEADER_MIN_SIZE = 8;
    private static final int l = 4;
    private static final int m = 4;
    private static final int n = 4;
    private static final int o = 4;
    private static final int p = 100;
    private static final int q = 4;
    private static final byte r = 7;
    private static final byte s = 1;
    private static final byte t = 2;
    private static final byte u = 4;
    private static final byte v = 8;
    private static final String w = "Info";
    private static final String x = "Xing";
    private String a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private int f;
    private int g;
    private byte[] h;
    private int i;
    private int j;
    private byte[] k;

    public XingHeader() {
        this.a = x;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = 0;
        this.g = 0;
        this.h = null;
        this.i = 0;
        this.j = 0;
        this.k = null;
    }

    private byte[] a(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        if (inputStream.read(bArr) != i) {
            throw new IOException("Unable to read the Xing header from the mpeg audio frame in the mp3 file.");
        }
        System.arraycopy(bArr, 0, this.k, this.j, i);
        this.j += i;
        return bArr;
    }

    public BitrateType getBitrateType() {
        return this.a.equals(w) ? BitrateType.CBR : BitrateType.VBR;
    }

    public String getId() {
        return this.a;
    }

    public int getNumBytes() throws IllegalStateException {
        if (this.c) {
            return this.g;
        }
        throw new IllegalStateException("The method getNumBytes() may not be invoked as the number of bytes present flag is false.");
    }

    public int getNumFrames() throws IllegalStateException {
        if (this.b) {
            return this.f;
        }
        throw new IllegalStateException("The method getNumFrames() may not be invoked as the number of frames present flag is false.");
    }

    public int getQuality() throws IllegalStateException {
        if (this.e) {
            return this.i;
        }
        throw new IllegalStateException("The method getQuality() may not be invoked as the quality indicator present flag is false.");
    }

    public int getSize() {
        return this.j;
    }

    public int getTOCOffset(int i) throws IllegalStateException {
        if (!this.d) {
            throw new IllegalStateException("The method getTOCOffset() may not be invoked as the table of contents present flag is false.");
        }
        if (this.c) {
            return (int) ((((double) this.h[i]) / 256.0d) * ((double) this.g));
        }
        throw new IllegalStateException("The method getTOCOffset() may not be invoked as the number of bytes present flag is false.");
    }

    public byte[] getTableOfContents() throws IllegalStateException {
        if (this.d) {
            return this.h;
        }
        throw new IllegalStateException("The method getTableOfContents() may not be invoked as the table of contents present flag is false.");
    }

    public boolean isNumBytesPresent() {
        return this.c;
    }

    public boolean isNumFramesPresent() {
        return this.b;
    }

    public boolean isQualityIndicatorPresent() {
        return this.e;
    }

    public boolean isTableOfContentsPresent() {
        return this.d;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Xing header\n");
        stringBuffer.append("   size.....................: " + this.j + " bytes\n");
        stringBuffer.append("   bytes....................: " + Utility.hex(this.k, 30) + "\n");
        stringBuffer.append("   id.......................: " + this.a + "\n");
        stringBuffer.append("   num frames present.......: " + this.b + "\n");
        stringBuffer.append("   num bytes present........: " + this.c + "\n");
        stringBuffer.append("   table of contents present: " + this.d + "\n");
        StringBuilder sb = new StringBuilder();
        sb.append("   quality present..........: ");
        sb.append(this.e);
        stringBuffer.append(sb.toString());
        if (this.b) {
            stringBuffer.append("\n   num frames...............: " + this.f);
        }
        if (this.c) {
            stringBuffer.append("\n   num bytes................: " + this.g);
        }
        if (this.e) {
            stringBuffer.append("\n   quality..................: " + this.i);
        }
        if (this.d) {
            stringBuffer.append("\n   num TOC entries..........: " + this.h.length);
        }
        if (this.d) {
            stringBuffer.append("\n   TOC entries..............: " + Utility.hex(this.h, 30));
        }
        return stringBuffer.toString();
    }

    public XingHeader(InputStream inputStream) throws ParseException, IOException {
        this.k = new byte[120];
        byte[] bArrA = a(inputStream, 4);
        String str = new String(bArrA);
        this.a = str;
        if (!str.equals(w) && !this.a.equals(x)) {
            throw new ParseException("Invalid id, " + this.a + ", in Xing header.  It must be " + w + " or " + x + ".", bArrA);
        }
        byte[] bArrA2 = a(inputStream, 4);
        boolean z = (bArrA2[3] & 1) != 0;
        this.b = z;
        this.c = (bArrA2[3] & 2) != 0;
        this.d = (bArrA2[3] & 4) != 0;
        this.e = (bArrA2[3] & 8) != 0;
        if (z) {
            this.f = Utility.bytesToInt(a(inputStream, 4));
        }
        if (this.c) {
            this.g = Utility.bytesToInt(a(inputStream, 4));
        }
        if (this.d) {
            this.h = a(inputStream, 100);
        }
        if (this.e) {
            int iBytesToInt = Utility.bytesToInt(a(inputStream, 4));
            this.i = iBytesToInt;
            if (iBytesToInt < 0 || iBytesToInt > 100) {
                throw new ParseException("Invalid quality value, " + this.i + ", in the Xing header.  It must be 0 <= qaulity <= 100.", new byte[this.j]);
            }
        }
        int i = this.j;
        byte[] bArr = this.k;
        if (i != bArr.length) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            int i2 = this.j;
            byte[] bArr3 = new byte[i2];
            this.k = bArr3;
            System.arraycopy(bArr2, 0, bArr3, 0, i2);
        }
    }

    public XingHeader(byte[] bArr, int i) throws ParseException {
        try {
            String str = new String(bArr, i, 4);
            this.a = str;
            if (!str.equals(w) && !this.a.equals(x)) {
                throw new ParseException("Invalid id, " + this.a + ", in Xing header.  It must be " + w + " or " + x + ".", bArr);
            }
            int i2 = i + 7;
            boolean z = true;
            boolean z2 = (bArr[i2] & 1) != 0;
            this.b = z2;
            this.c = (bArr[i2] & 2) != 0;
            this.d = (bArr[i2] & 4) != 0;
            if ((bArr[i2] & 8) == 0) {
                z = false;
            }
            this.e = z;
            this.j = 8;
            if (z2) {
                byte[] bArr2 = new byte[4];
                System.arraycopy(bArr, i + 8, bArr2, 0, 4);
                this.f = Utility.bytesToInt(bArr2);
                this.j += 4;
            }
            if (this.c) {
                byte[] bArr3 = new byte[4];
                System.arraycopy(bArr, this.j + i, bArr3, 0, 4);
                this.g = Utility.bytesToInt(bArr3);
                this.j += 4;
            }
            if (this.d) {
                byte[] bArr4 = new byte[100];
                this.h = bArr4;
                System.arraycopy(bArr, this.j + i, bArr4, 0, bArr4.length);
                this.j += this.h.length;
            }
            if (this.e) {
                byte[] bArr5 = new byte[4];
                System.arraycopy(bArr, this.j + i, bArr5, 0, 4);
                int iBytesToInt = Utility.bytesToInt(bArr5);
                this.i = iBytesToInt;
                this.j += 4;
                if (iBytesToInt < 0 || iBytesToInt > 100) {
                    throw new ParseException("Invalid quality value, " + this.i + ", in the Xing header.  It must be 0 <= qaulity <= 100.", new byte[0]);
                }
            }
            int i3 = this.j;
            byte[] bArr6 = new byte[i3];
            this.k = bArr6;
            System.arraycopy(bArr, i, bArr6, 0, i3);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ParseException("Insufficient bytes to parse the Xing header.", bArr);
        }
    }
}
