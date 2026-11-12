package com.beaglebuddy.mpeg;

import com.beaglebuddy.exception.ParseException;
import com.beaglebuddy.mpeg.enums.GainOriginator;
import com.beaglebuddy.mpeg.enums.GainType;
import com.beaglebuddy.mpeg.enums.SourceFrequency;
import com.beaglebuddy.mpeg.enums.StereoMode;
import com.beaglebuddy.mpeg.enums.SurroundInfo;
import com.beaglebuddy.mpeg.enums.VBRMethod;
import com.beaglebuddy.mpeg.pojo.ReplayGain;
import com.beaglebuddy.mpeg.pojo.Version;
import com.beaglebuddy.util.Utility;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class LAMEHeader {
    private static final int C = 4;
    private static final int D = 4;
    private static final int E = 1;
    private static final int F = 1;
    private static final int G = 4;
    private static final int H = 2;
    public static final int HEADER_MAX_SIZE = 36;
    public static final int HEADER_MIN_SIZE = 20;
    private static final int I = 1;
    private static final int J = 1;
    private static final int K = 3;
    private static final int L = 1;
    private static final int M = 2;
    private static final int N = 4;
    private static final int O = 2;
    private static final int P = 2;
    private static final byte Q = 15;
    private static final byte R = 16;
    private static final byte S = 32;
    private static final byte T = 64;
    private static final byte U = -128;
    private static final byte V = 3;
    private static final byte W = 28;
    private static final byte X = 32;
    private static final byte Y = -64;
    private static final byte Z = 56;
    private static final byte a0 = 7;
    private static final String b0 = "LAME";
    private int A;
    private byte[] B;
    private String a;
    private Version b;
    private int c;
    private VBRMethod d;
    private int e;
    private float f;
    private ReplayGain g;
    private ReplayGain h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private int q;
    private StereoMode r;
    private boolean s;
    private SourceFrequency t;
    private byte u;
    private SurroundInfo v;
    private int w;
    private int x;
    private byte[] y;
    private byte[] z;

    public LAMEHeader() {
        this.a = b0;
        this.b = null;
        this.c = 0;
        this.d = null;
        this.e = 0;
        this.f = 0.0f;
        this.g = null;
        this.h = null;
        this.i = 0;
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = null;
        this.s = false;
        this.t = null;
        this.u = (byte) 0;
        this.v = null;
        this.w = 0;
        this.x = 0;
        this.y = null;
        this.z = null;
        this.A = 0;
        this.B = null;
    }

    private byte[] a(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        if (inputStream.read(bArr) != i) {
            throw new IOException("Unable to read the LAME header from the mpeg audio frame in the mp3 file.");
        }
        System.arraycopy(bArr, 0, this.B, this.A, i);
        this.A += i;
        return bArr;
    }

    private void b(byte[] bArr) {
        this.n = bArr[0] & 255;
    }

    private void c(byte[] bArr) {
        this.o = ((bArr[0] & 240) << 4) + ((bArr[0] & 15) << 4) + ((bArr[1] & 240) >> 4);
        this.p = ((bArr[1] & 15) << 8) + bArr[2];
    }

    private void d(byte[] bArr) {
        this.i = bArr[0] & 15;
        this.j = (bArr[0] & 16) != 0;
        this.k = (bArr[0] & 32) != 0;
        this.l = (bArr[0] & 64) != 0;
        this.m = (bArr[0] & (-128)) != 0;
    }

    private void e(byte[] bArr) throws ParseException {
        this.q = bArr[0] & 3;
        this.s = (bArr[0] & 32) != 0;
        try {
            this.r = StereoMode.valueOf((bArr[0] & 28) >> 2);
            try {
                this.t = SourceFrequency.valueOf((bArr[0] & Y) >> 6);
            } catch (IllegalArgumentException e) {
                throw new ParseException(e.getMessage());
            }
        } catch (IllegalArgumentException e2) {
            throw new ParseException(e2.getMessage());
        }
    }

    private void f(InputStream inputStream) throws ParseException, IOException {
        String str = new String(a(inputStream, 4));
        this.a = str;
        if (str.equals(b0)) {
            return;
        }
        throw new ParseException("Invalid id, " + this.a + ", in LAME header.  It must be " + b0 + ".", new byte[this.A]);
    }

    private void g(byte[] bArr) {
        this.e = (bArr[0] & 255) * 100;
    }

    private void h(byte[] bArr) {
        this.x = Utility.bytesToInt(bArr);
    }

    private void i(byte[] bArr) {
        this.f = Float.intBitsToFloat(Utility.bytesToInt(bArr));
    }

    private void j(byte[] bArr) throws ParseException {
        try {
            this.v = SurroundInfo.valueOf((bArr[0] & 56) >> 3);
            bArr[0] = (byte) (bArr[0] & 7);
            this.w = Utility.bytesToShort(bArr);
        } catch (IllegalArgumentException e) {
            throw new ParseException(e.getMessage());
        }
    }

    private void k(byte[] bArr) throws ParseException {
        try {
            int i = 0;
            this.g = new ReplayGain(GainType.valueOf((bArr[0] & 208) >> 5), GainOriginator.valueOf((bArr[0] & 28) >> 2), (bArr[0] & 2) != 0, (bArr[0] & 1) == 0 ? 0 : bArr[1] + 256);
            GainType gainTypeValueOf = GainType.valueOf((bArr[2] & 208) >> 5);
            GainOriginator gainOriginatorValueOf = GainOriginator.valueOf((bArr[2] & 28) >> 2);
            boolean z = (bArr[0] & 2) != 0;
            if ((bArr[2] & 1) != 0) {
                i = bArr[3] + 256;
            }
            this.h = new ReplayGain(gainTypeValueOf, gainOriginatorValueOf, z, i);
        } catch (IllegalArgumentException e) {
            throw new ParseException(e.getMessage());
        }
    }

    private void l(int i) throws ParseException {
        if (i != 15) {
            this.c = i;
            return;
        }
        throw new ParseException("Invalid revision, " + i + ", in LAME header.", new byte[this.A]);
    }

    private void m(int i) throws ParseException {
        try {
            VBRMethod vBRMethodValueOf = VBRMethod.valueOf(i);
            this.d = vBRMethodValueOf;
            if (vBRMethodValueOf != VBRMethod.RESERVED) {
                return;
            }
            throw new ParseException("Invalid VBR encoding method, " + this.d + ", in LAME header.", new byte[this.A]);
        } catch (IllegalArgumentException e) {
            throw new ParseException(e.getMessage(), new byte[this.A]);
        }
    }

    private void n(byte[] bArr) throws ParseException {
        int i;
        int i2 = 0;
        String str = new String(bArr, 0, 4);
        int i3 = bArr[0] - 48;
        try {
            if (str.matches("\\d\\.\\d\\d")) {
                i = Integer.parseInt(new String(new byte[]{bArr[2], bArr[3]}));
            } else {
                if (!str.matches("\\d\\d\\d\\d")) {
                    throw new ParseException("Invalid version, " + new String(bArr) + ", found in the LAME header.");
                }
                i = Integer.parseInt(new String(new byte[]{bArr[1], bArr[2], bArr[3]}));
            }
            i2 = i;
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        this.b = new Version(i3, i2, (char) bArr[4]);
    }

    public int getAthType() {
        return this.i;
    }

    public ReplayGain getAudiophileReplayGain() {
        return this.h;
    }

    public int getBitrate() {
        return this.n;
    }

    public byte[] getCRC() {
        return this.z;
    }

    public int getEncodingDelay() {
        return this.o;
    }

    public int getEncodingPadding() {
        return this.p;
    }

    public String getId() {
        return this.a;
    }

    public int getLowpassFilterFrequency() {
        return this.e;
    }

    public byte getMp3Gain() {
        return this.u;
    }

    public byte[] getMusicCRC() {
        return this.y;
    }

    public int getMusicLength() {
        return this.x;
    }

    public int getNoiseShaping() {
        return this.q;
    }

    public float getPeakSignalAmplitude() {
        return this.f;
    }

    public int getPreset() {
        return this.w;
    }

    public ReplayGain getRadioReplayGain() {
        return this.g;
    }

    public int getRevision() {
        return this.c;
    }

    public int getSize() {
        return this.A;
    }

    public SourceFrequency getSourceSampleFrequency() {
        return this.t;
    }

    public StereoMode getStereoMode() {
        return this.r;
    }

    public SurroundInfo getSurroundInfo() {
        return this.v;
    }

    public VBRMethod getVBRMethod() {
        return this.d;
    }

    public Version getVersion() {
        return this.b;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("LAME header\n");
        stringBuffer.append("   size..........................: " + this.A + " bytes\n");
        stringBuffer.append("   bytes.........................: " + Utility.hex(this.B, 35) + "\n");
        stringBuffer.append("   id............................: " + this.a + "\n");
        stringBuffer.append("   version.......................: " + this.b + "\n");
        stringBuffer.append("   revision......................: " + this.c + "\n");
        stringBuffer.append("   vbr version...................: " + this.d + "\n");
        stringBuffer.append("   low pass filter freq..........: " + this.e + " hz\n");
        stringBuffer.append("   peak signal amplitude.........: " + this.f + "\n");
        stringBuffer.append("   radio      replay gain........: " + this.g + "\n");
        stringBuffer.append("   audiophile replay gain........: " + this.h + "\n");
        stringBuffer.append("   ATH type......................: " + this.i + "\n");
        stringBuffer.append("   encoded using psytune.........: " + this.j + "\n");
        stringBuffer.append("   encoded using safejoint.......: " + this.k + "\n");
        stringBuffer.append("   no gap continues to next track: " + this.l + "\n");
        stringBuffer.append("   no gap continues to prev track: " + this.m + "\n");
        VBRMethod vBRMethod = this.d;
        if (vBRMethod == VBRMethod.CBR || vBRMethod == VBRMethod.CBR_2_PASS) {
            stringBuffer.append("   constant bit rate.............: ");
        } else if (vBRMethod == VBRMethod.ABR || vBRMethod == VBRMethod.ABR_2_PASS) {
            stringBuffer.append("   average bit rate..............: ");
        } else {
            stringBuffer.append("   minimal variable bit rate.....: ");
        }
        stringBuffer.append(this.n + "\n");
        stringBuffer.append("   encoding delay................: " + this.o + " samples\n");
        stringBuffer.append("   encoding padding..............: " + this.p + " samples\n");
        stringBuffer.append("   noise shaping.................: " + this.q + "\n");
        stringBuffer.append("   stereo mode...................: " + this.r + "\n");
        stringBuffer.append("   unwise settings used..........: " + this.s + "\n");
        stringBuffer.append("   source sample frequency.......: " + this.t + "\n");
        stringBuffer.append("   mp3 gain......................: " + Utility.hex(this.u) + "\n");
        stringBuffer.append("   surround info.................: " + this.v + "\n");
        stringBuffer.append("   preset........................: " + this.w + "\n");
        stringBuffer.append("   music length..................: " + this.x + " bytes\n");
        stringBuffer.append("   music CRC.....................: " + Utility.hex(this.y) + "\n");
        StringBuilder sb = new StringBuilder();
        sb.append("   CRC of first 190 bytes........: ");
        sb.append(Utility.hex(this.z));
        stringBuffer.append(sb.toString());
        return stringBuffer.toString();
    }

    public boolean usedNoGapNext() {
        return this.l;
    }

    public boolean usedNoGapPrevious() {
        return this.m;
    }

    public boolean usedPsytune() {
        return this.j;
    }

    public boolean usedSafejoint() {
        return this.k;
    }

    public boolean usedUnwise() {
        return this.s;
    }

    public LAMEHeader(InputStream inputStream) throws ParseException, IOException {
        this.B = new byte[36];
        f(inputStream);
        n(a(inputStream, 5));
        if (this.b.getMajor() >= 3 && this.b.getMinor() >= 90) {
            byte[] bArrA = a(inputStream, 1);
            l((bArrA[0] & 240) >> 4);
            m(bArrA[0] & 15);
            g(a(inputStream, 1));
            i(a(inputStream, 4));
            k(a(inputStream, 4));
            d(a(inputStream, 1));
            b(a(inputStream, 1));
            c(a(inputStream, 3));
            e(a(inputStream, 1));
            this.u = a(inputStream, 1)[0];
            j(a(inputStream, 2));
            h(a(inputStream, 4));
            this.y = a(inputStream, 2);
            this.z = a(inputStream, 2);
            return;
        }
        byte[] bArrA2 = a(inputStream, 11);
        byte[] bArr = this.B;
        byte[] bArr2 = {bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5], bArr[6], bArr[7], bArr[8]};
        byte[] bArr3 = new byte[20];
        this.B = bArr3;
        System.arraycopy(bArr2, 0, bArr3, 0, 9);
        System.arraycopy(bArrA2, 0, this.B, 9, bArrA2.length);
    }

    public LAMEHeader(byte[] bArr, int i) throws ParseException {
        try {
            String str = new String(bArr, i, 4);
            this.a = str;
            if (str.equals(b0)) {
                this.A = 4;
                byte[] bArr2 = new byte[5];
                System.arraycopy(bArr, i + 4, bArr2, 0, 5);
                n(bArr2);
                this.A += 5;
                if (this.b.getMajor() >= 3 && this.b.getMinor() >= 90) {
                    byte[] bArr3 = new byte[1];
                    System.arraycopy(bArr, this.A + i, bArr3, 0, 1);
                    l((bArr3[0] & 240) >> 4);
                    m(bArr3[0] & 15);
                    int i2 = this.A + 1;
                    this.A = i2;
                    byte[] bArr4 = new byte[1];
                    System.arraycopy(bArr, i2 + i, bArr4, 0, 1);
                    g(bArr4);
                    int i3 = this.A + 1;
                    this.A = i3;
                    byte[] bArr5 = new byte[4];
                    System.arraycopy(bArr, i3 + i, bArr5, 0, 4);
                    i(bArr5);
                    int i4 = this.A + 4;
                    this.A = i4;
                    byte[] bArr6 = new byte[4];
                    System.arraycopy(bArr, i4 + i, bArr6, 0, 4);
                    k(bArr6);
                    int i5 = this.A + 4;
                    this.A = i5;
                    byte[] bArr7 = new byte[1];
                    System.arraycopy(bArr, i5 + i, bArr7, 0, 1);
                    d(bArr7);
                    int i6 = this.A + 1;
                    this.A = i6;
                    byte[] bArr8 = new byte[1];
                    System.arraycopy(bArr, i6 + i, bArr8, 0, 1);
                    b(bArr8);
                    int i7 = this.A + 1;
                    this.A = i7;
                    byte[] bArr9 = new byte[3];
                    System.arraycopy(bArr, i7 + i, bArr9, 0, 3);
                    c(bArr9);
                    int i8 = this.A + 3;
                    this.A = i8;
                    byte[] bArr10 = new byte[1];
                    System.arraycopy(bArr, i8 + i, bArr10, 0, 1);
                    e(bArr10);
                    int i9 = this.A + 1;
                    this.A = i9;
                    this.u = bArr[i + i9];
                    int i10 = i9 + 1;
                    this.A = i10;
                    byte[] bArr11 = new byte[2];
                    System.arraycopy(bArr, i10 + i, bArr11, 0, 2);
                    j(bArr11);
                    int i11 = this.A + 2;
                    this.A = i11;
                    byte[] bArr12 = new byte[4];
                    System.arraycopy(bArr, i11 + i, bArr12, 0, 4);
                    h(bArr12);
                    int i12 = this.A + 4;
                    this.A = i12;
                    byte[] bArr13 = new byte[2];
                    this.y = bArr13;
                    System.arraycopy(bArr, i12 + i, bArr13, 0, bArr13.length);
                    int length = this.A + this.y.length;
                    this.A = length;
                    byte[] bArr14 = new byte[2];
                    this.z = bArr14;
                    System.arraycopy(bArr, length + i, bArr14, 0, bArr14.length);
                    this.A += this.z.length;
                } else {
                    byte[] bArr15 = new byte[20];
                    this.B = bArr15;
                    System.arraycopy(bArr, i, bArr15, 0, bArr15.length);
                    this.A = this.B.length;
                }
                int i13 = this.A;
                byte[] bArr16 = new byte[i13];
                this.B = bArr16;
                System.arraycopy(bArr, i, bArr16, 0, i13);
                return;
            }
            throw new ParseException("Invalid id, " + this.a + ", in LAME header.  It must be " + b0 + ".", bArr);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ParseException("Insufficient bytes to parse the LAME header.");
        }
    }
}
