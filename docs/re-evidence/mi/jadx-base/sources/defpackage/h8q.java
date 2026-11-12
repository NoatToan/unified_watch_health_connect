package defpackage;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.tsmclient.smartcard.terminal.APDUConstants;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes4.dex */
public class h8q extends msd {
    public final OutputStream o;
    public byte p;
    public byte[] q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f19813r;
    public final int s;
    public final int t;
    public char[] u;
    public final int v;
    public boolean w;
    public static final byte[] x = xt3.c();
    public static final byte[] y = {110, 117, 108, 108};
    public static final byte[] z = {116, 114, 117, 101};
    public static final byte[] A = {102, APDUConstants.TAG_MORE_DATA, 108, 115, 101};

    public h8q(xuc xucVar, int i, v3h v3hVar, OutputStream outputStream) {
        super(xucVar, i, v3hVar);
        this.p = (byte) 34;
        this.o = outputStream;
        this.w = true;
        byte[] bArrJ = xucVar.j();
        this.q = bArrJ;
        int length = bArrJ.length;
        this.s = length;
        this.t = length >> 3;
        char[] cArrE = xucVar.e();
        this.u = cArrE;
        this.v = cArrE.length;
        if (a1(JsonGenerator.Feature.ESCAPE_NON_ASCII)) {
            O(127);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void A0(short s) throws IOException {
        Z0("write a number");
        if (this.f19813r + 6 >= this.s) {
            d1();
        }
        if (this.d) {
            y1(s);
        } else {
            this.f19813r = o2h.o(s, this.q, this.f19813r);
        }
    }

    public final void A1(char[] cArr, int i, int i2) throws IOException {
        int i3 = this.s;
        byte[] bArr = this.q;
        int i4 = i2 + i;
        while (i < i4) {
            do {
                char c = cArr[i];
                if (c >= 128) {
                    if (this.f19813r + 3 >= this.s) {
                        d1();
                    }
                    int i5 = i + 1;
                    char c2 = cArr[i];
                    if (c2 < 2048) {
                        int i6 = this.f19813r;
                        bArr[i6] = (byte) ((c2 >> 6) | 192);
                        this.f19813r = i6 + 2;
                        bArr[i6 + 1] = (byte) ((c2 & '?') | 128);
                        i = i5;
                    } else {
                        i = g1(c2, cArr, i5, i4);
                    }
                } else {
                    if (this.f19813r >= i3) {
                        d1();
                    }
                    int i7 = this.f19813r;
                    this.f19813r = i7 + 1;
                    bArr[i7] = (byte) c;
                    i++;
                }
            } while (i < i4);
            return;
        }
    }

    public final void B1(String str, int i, int i2) throws IOException {
        int i3 = i2 + i;
        int i4 = this.f19813r;
        byte[] bArr = this.q;
        int[] iArr = this.i;
        while (i < i3) {
            char cCharAt = str.charAt(i);
            if (cCharAt > 127 || iArr[cCharAt] != 0) {
                break;
            }
            bArr[i4] = (byte) cCharAt;
            i++;
            i4++;
        }
        this.f19813r = i4;
        if (i < i3) {
            if (this.f27156k != null) {
                p1(str, i, i3);
            } else if (this.j == 0) {
                D1(str, i, i3);
            } else {
                F1(str, i, i3);
            }
        }
    }

    public final void C1(char[] cArr, int i, int i2) throws IOException {
        int i3 = i2 + i;
        int i4 = this.f19813r;
        byte[] bArr = this.q;
        int[] iArr = this.i;
        while (i < i3) {
            char c = cArr[i];
            if (c > 127 || iArr[c] != 0) {
                break;
            }
            bArr[i4] = (byte) c;
            i++;
            i4++;
        }
        this.f19813r = i4;
        if (i < i3) {
            if (this.f27156k != null) {
                q1(cArr, i, i3);
            } else if (this.j == 0) {
                E1(cArr, i, i3);
            } else {
                G1(cArr, i, i3);
            }
        }
    }

    public final void D1(String str, int i, int i2) throws IOException {
        if (this.f19813r + ((i2 - i) * 6) > this.s) {
            d1();
        }
        int iF1 = this.f19813r;
        byte[] bArr = this.q;
        int[] iArr = this.i;
        while (i < i2) {
            i++;
            char cCharAt = str.charAt(i);
            if (cCharAt <= 127) {
                int i3 = iArr[cCharAt];
                if (i3 == 0) {
                    bArr[iF1] = (byte) cCharAt;
                    iF1++;
                } else if (i3 > 0) {
                    int i4 = iF1 + 1;
                    bArr[iF1] = 92;
                    iF1 += 2;
                    bArr[i4] = (byte) i3;
                } else {
                    iF1 = r1(cCharAt, iF1);
                }
            } else if (cCharAt <= 2047) {
                int i5 = iF1 + 1;
                bArr[iF1] = (byte) ((cCharAt >> 6) | 192);
                iF1 += 2;
                bArr[i5] = (byte) ((cCharAt & '?') | 128);
            } else {
                iF1 = f1(cCharAt, iF1);
            }
        }
        this.f19813r = iF1;
    }

    public final void E1(char[] cArr, int i, int i2) throws IOException {
        if (this.f19813r + ((i2 - i) * 6) > this.s) {
            d1();
        }
        int iF1 = this.f19813r;
        byte[] bArr = this.q;
        int[] iArr = this.i;
        while (i < i2) {
            i++;
            char c = cArr[i];
            if (c <= 127) {
                int i3 = iArr[c];
                if (i3 == 0) {
                    bArr[iF1] = (byte) c;
                    iF1++;
                } else if (i3 > 0) {
                    int i4 = iF1 + 1;
                    bArr[iF1] = 92;
                    iF1 += 2;
                    bArr[i4] = (byte) i3;
                } else {
                    iF1 = r1(c, iF1);
                }
            } else if (c <= 2047) {
                int i5 = iF1 + 1;
                bArr[iF1] = (byte) ((c >> 6) | 192);
                iF1 += 2;
                bArr[i5] = (byte) ((c & '?') | 128);
            } else {
                iF1 = f1(c, iF1);
            }
        }
        this.f19813r = iF1;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void F0(char c) throws IOException {
        if (this.f19813r + 3 >= this.s) {
            d1();
        }
        byte[] bArr = this.q;
        if (c <= 127) {
            int i = this.f19813r;
            this.f19813r = i + 1;
            bArr[i] = (byte) c;
        } else {
            if (c >= 2048) {
                g1(c, null, 0, 0);
                return;
            }
            int i2 = this.f19813r;
            bArr[i2] = (byte) ((c >> 6) | 192);
            this.f19813r = i2 + 2;
            bArr[i2 + 1] = (byte) ((c & '?') | 128);
        }
    }

    public final void F1(String str, int i, int i2) throws IOException {
        if (this.f19813r + ((i2 - i) * 6) > this.s) {
            d1();
        }
        int iF1 = this.f19813r;
        byte[] bArr = this.q;
        int[] iArr = this.i;
        int i3 = this.j;
        while (i < i2) {
            i++;
            char cCharAt = str.charAt(i);
            if (cCharAt <= 127) {
                int i4 = iArr[cCharAt];
                if (i4 == 0) {
                    bArr[iF1] = (byte) cCharAt;
                    iF1++;
                } else if (i4 > 0) {
                    int i5 = iF1 + 1;
                    bArr[iF1] = 92;
                    iF1 += 2;
                    bArr[i5] = (byte) i4;
                } else {
                    iF1 = r1(cCharAt, iF1);
                }
            } else if (cCharAt > i3) {
                iF1 = r1(cCharAt, iF1);
            } else if (cCharAt <= 2047) {
                int i6 = iF1 + 1;
                bArr[iF1] = (byte) ((cCharAt >> 6) | 192);
                iF1 += 2;
                bArr[i6] = (byte) ((cCharAt & '?') | 128);
            } else {
                iF1 = f1(cCharAt, iF1);
            }
        }
        this.f19813r = iF1;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void G0(owl owlVar) throws IOException {
        byte[] bArrAsUnquotedUTF8 = owlVar.asUnquotedUTF8();
        if (bArrAsUnquotedUTF8.length > 0) {
            n1(bArrAsUnquotedUTF8);
        }
    }

    public final void G1(char[] cArr, int i, int i2) throws IOException {
        if (this.f19813r + ((i2 - i) * 6) > this.s) {
            d1();
        }
        int iF1 = this.f19813r;
        byte[] bArr = this.q;
        int[] iArr = this.i;
        int i3 = this.j;
        while (i < i2) {
            i++;
            char c = cArr[i];
            if (c <= 127) {
                int i4 = iArr[c];
                if (i4 == 0) {
                    bArr[iF1] = (byte) c;
                    iF1++;
                } else if (i4 > 0) {
                    int i5 = iF1 + 1;
                    bArr[iF1] = 92;
                    iF1 += 2;
                    bArr[i5] = (byte) i4;
                } else {
                    iF1 = r1(c, iF1);
                }
            } else if (c > i3) {
                iF1 = r1(c, iF1);
            } else if (c <= 2047) {
                int i6 = iF1 + 1;
                bArr[iF1] = (byte) ((c >> 6) | 192);
                iF1 += 2;
                bArr[i6] = (byte) ((c & '?') | 128);
            } else {
                iF1 = f1(c, iF1);
            }
        }
        this.f19813r = iF1;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void H0(String str) throws IOException {
        int length = str.length();
        char[] cArr = this.u;
        if (length > cArr.length) {
            L1(str, 0, length);
        } else {
            str.getChars(0, length, cArr, 0);
            I0(cArr, 0, length);
        }
    }

    public final void H1(String str, int i, int i2) throws IOException {
        do {
            int iMin = Math.min(this.t, i2);
            if (this.f19813r + iMin > this.s) {
                d1();
            }
            B1(str, i, iMin);
            i += iMin;
            i2 -= iMin;
        } while (i2 > 0);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void I0(char[] cArr, int i, int i2) throws IOException {
        int i3 = i2 + i2 + i2;
        int i4 = this.f19813r + i3;
        int i5 = this.s;
        if (i4 > i5) {
            if (i5 < i3) {
                A1(cArr, i, i2);
                return;
            }
            d1();
        }
        int i6 = i2 + i;
        while (i < i6) {
            do {
                char c = cArr[i];
                if (c > 127) {
                    i++;
                    if (c < 2048) {
                        byte[] bArr = this.q;
                        int i7 = this.f19813r;
                        bArr[i7] = (byte) ((c >> 6) | 192);
                        this.f19813r = i7 + 2;
                        bArr[i7 + 1] = (byte) ((c & '?') | 128);
                    } else {
                        i = g1(c, cArr, i, i6);
                    }
                } else {
                    byte[] bArr2 = this.q;
                    int i8 = this.f19813r;
                    this.f19813r = i8 + 1;
                    bArr2[i8] = (byte) c;
                    i++;
                }
            } while (i < i6);
            return;
        }
    }

    public final void I1(String str, boolean z2) throws IOException {
        if (z2) {
            if (this.f19813r >= this.s) {
                d1();
            }
            byte[] bArr = this.q;
            int i = this.f19813r;
            this.f19813r = i + 1;
            bArr[i] = this.p;
        }
        int length = str.length();
        int i2 = 0;
        while (length > 0) {
            int iMin = Math.min(this.t, length);
            if (this.f19813r + iMin > this.s) {
                d1();
            }
            B1(str, i2, iMin);
            i2 += iMin;
            length -= iMin;
        }
        if (z2) {
            if (this.f19813r >= this.s) {
                d1();
            }
            byte[] bArr2 = this.q;
            int i3 = this.f19813r;
            this.f19813r = i3 + 1;
            bArr2[i3] = this.p;
        }
    }

    @Override // defpackage.yxa, com.fasterxml.jackson.core.JsonGenerator
    public void J0(owl owlVar) throws IOException {
        Z0("write a raw (unencoded) value");
        byte[] bArrAsUnquotedUTF8 = owlVar.asUnquotedUTF8();
        if (bArrAsUnquotedUTF8.length > 0) {
            n1(bArrAsUnquotedUTF8);
        }
    }

    public final void J1(char[] cArr, int i, int i2) throws IOException {
        do {
            int iMin = Math.min(this.t, i2);
            if (this.f19813r + iMin > this.s) {
                d1();
            }
            C1(cArr, i, iMin);
            i += iMin;
            i2 -= iMin;
        } while (i2 > 0);
    }

    public final void K1(owl owlVar) throws IOException {
        int iAppendQuotedUTF8 = owlVar.appendQuotedUTF8(this.q, this.f19813r);
        if (iAppendQuotedUTF8 < 0) {
            n1(owlVar.asQuotedUTF8());
        } else {
            this.f19813r += iAppendQuotedUTF8;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void L0() throws IOException {
        Z0("start an array");
        this.e = this.e.m();
        r7i r7iVar = this.f7619a;
        if (r7iVar != null) {
            r7iVar.writeStartArray(this);
            return;
        }
        if (this.f19813r >= this.s) {
            d1();
        }
        byte[] bArr = this.q;
        int i = this.f19813r;
        this.f19813r = i + 1;
        bArr[i] = 91;
    }

    public void L1(String str, int i, int i2) throws IOException {
        char c;
        char[] cArr = this.u;
        int length = cArr.length;
        if (i2 <= length) {
            str.getChars(i, i + i2, cArr, 0);
            I0(cArr, 0, i2);
            return;
        }
        int i3 = this.s;
        int iMin = Math.min(length, (i3 >> 2) + (i3 >> 4));
        int i4 = iMin * 3;
        while (i2 > 0) {
            int iMin2 = Math.min(iMin, i2);
            str.getChars(i, i + iMin2, cArr, 0);
            if (this.f19813r + i4 > this.s) {
                d1();
            }
            if (iMin2 > 1 && (c = cArr[iMin2 - 1]) >= 55296 && c <= 56319) {
                iMin2--;
            }
            z1(cArr, 0, iMin2);
            i += iMin2;
            i2 -= iMin2;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void N0() throws IOException {
        Z0("start an object");
        this.e = this.e.n();
        r7i r7iVar = this.f7619a;
        if (r7iVar != null) {
            r7iVar.writeStartObject(this);
            return;
        }
        if (this.f19813r >= this.s) {
            d1();
        }
        byte[] bArr = this.q;
        int i = this.f19813r;
        this.f19813r = i + 1;
        bArr[i] = 123;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void O0(Object obj) throws IOException {
        Z0("start an object");
        xud xudVarN = this.e.n();
        this.e = xudVarN;
        if (obj != null) {
            xudVarN.i(obj);
        }
        r7i r7iVar = this.f7619a;
        if (r7iVar != null) {
            r7iVar.writeStartObject(this);
            return;
        }
        if (this.f19813r >= this.s) {
            d1();
        }
        byte[] bArr = this.q;
        int i = this.f19813r;
        this.f19813r = i + 1;
        bArr[i] = 123;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void P0(owl owlVar) throws IOException {
        Z0("write a string");
        if (this.f19813r >= this.s) {
            d1();
        }
        byte[] bArr = this.q;
        int i = this.f19813r;
        int i2 = i + 1;
        this.f19813r = i2;
        bArr[i] = this.p;
        int iAppendQuotedUTF8 = owlVar.appendQuotedUTF8(bArr, i2);
        if (iAppendQuotedUTF8 < 0) {
            n1(owlVar.asQuotedUTF8());
        } else {
            this.f19813r += iAppendQuotedUTF8;
        }
        if (this.f19813r >= this.s) {
            d1();
        }
        byte[] bArr2 = this.q;
        int i3 = this.f19813r;
        this.f19813r = i3 + 1;
        bArr2[i3] = this.p;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void Q0(String str) throws IOException {
        Z0("write a string");
        if (str == null) {
            s1();
            return;
        }
        int length = str.length();
        if (length > this.t) {
            I1(str, true);
            return;
        }
        if (this.f19813r + length >= this.s) {
            d1();
        }
        byte[] bArr = this.q;
        int i = this.f19813r;
        this.f19813r = i + 1;
        bArr[i] = this.p;
        B1(str, 0, length);
        if (this.f19813r >= this.s) {
            d1();
        }
        byte[] bArr2 = this.q;
        int i2 = this.f19813r;
        this.f19813r = i2 + 1;
        bArr2[i2] = this.p;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void R0(char[] cArr, int i, int i2) throws IOException {
        Z0("write a string");
        if (this.f19813r >= this.s) {
            d1();
        }
        byte[] bArr = this.q;
        int i3 = this.f19813r;
        int i4 = i3 + 1;
        this.f19813r = i4;
        bArr[i3] = this.p;
        if (i2 <= this.t) {
            if (i4 + i2 > this.s) {
                d1();
            }
            C1(cArr, i, i2);
        } else {
            J1(cArr, i, i2);
        }
        if (this.f19813r >= this.s) {
            d1();
        }
        byte[] bArr2 = this.q;
        int i5 = this.f19813r;
        this.f19813r = i5 + 1;
        bArr2[i5] = this.p;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int U(Base64Variant base64Variant, InputStream inputStream, int i) throws IOException {
        Z0("write a binary value");
        if (this.f19813r >= this.s) {
            d1();
        }
        byte[] bArr = this.q;
        int i2 = this.f19813r;
        this.f19813r = i2 + 1;
        bArr[i2] = this.p;
        byte[] bArrD = this.h.d();
        try {
            if (i < 0) {
                i = k1(base64Variant, inputStream, bArrD);
            } else {
                int iL1 = l1(base64Variant, inputStream, bArrD, i);
                if (iL1 > 0) {
                    a("Too few bytes available: missing " + iL1 + " bytes (out of " + i + ")");
                }
            }
            this.h.o(bArrD);
            if (this.f19813r >= this.s) {
                d1();
            }
            byte[] bArr2 = this.q;
            int i3 = this.f19813r;
            this.f19813r = i3 + 1;
            bArr2[i3] = this.p;
            return i;
        } catch (Throwable th) {
            this.h.o(bArrD);
            throw th;
        }
    }

    @Override // defpackage.yxa
    public final void Z0(String str) throws IOException {
        byte b2;
        int iU = this.e.u();
        if (this.f7619a != null) {
            c1(str, iU);
            return;
        }
        if (iU == 1) {
            b2 = HMProSyncDataBaseProfile.DATA_STATISTIC_V2;
        } else {
            if (iU != 2) {
                if (iU != 3) {
                    if (iU != 5) {
                        return;
                    }
                    b1(str);
                    return;
                }
                owl owlVar = this.l;
                if (owlVar != null) {
                    byte[] bArrAsUnquotedUTF8 = owlVar.asUnquotedUTF8();
                    if (bArrAsUnquotedUTF8.length > 0) {
                        n1(bArrAsUnquotedUTF8);
                        return;
                    }
                    return;
                }
                return;
            }
            b2 = HMProSyncDataBaseProfile.DATA_TYPE_RESTING_HEART_RATE;
        }
        if (this.f19813r >= this.s) {
            d1();
        }
        byte[] bArr = this.q;
        int i = this.f19813r;
        this.f19813r = i + 1;
        bArr[i] = b2;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void b0(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException {
        Z0("write a binary value");
        if (this.f19813r >= this.s) {
            d1();
        }
        byte[] bArr2 = this.q;
        int i3 = this.f19813r;
        this.f19813r = i3 + 1;
        bArr2[i3] = this.p;
        m1(base64Variant, bArr, i, i2 + i);
        if (this.f19813r >= this.s) {
            d1();
        }
        byte[] bArr3 = this.q;
        int i4 = this.f19813r;
        this.f19813r = i4 + 1;
        bArr3[i4] = this.p;
    }

    @Override // defpackage.yxa, com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        if (this.q != null && a1(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                fud fudVarY = y();
                if (!fudVarY.f()) {
                    if (!fudVarY.g()) {
                        break;
                    } else {
                        m0();
                    }
                } else {
                    i0();
                }
            }
        }
        d1();
        this.f19813r = 0;
        if (this.o != null) {
            if (this.h.n() || a1(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
                this.o.close();
            } else if (a1(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
                this.o.flush();
            }
        }
        j1();
    }

    public final void d1() throws IOException {
        int i = this.f19813r;
        if (i > 0) {
            this.f19813r = 0;
            this.o.write(this.q, 0, i);
        }
    }

    public final int e1(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IOException {
        int length = bArr2.length;
        if (i + length > i2) {
            this.f19813r = i;
            d1();
            int i4 = this.f19813r;
            if (length > bArr.length) {
                this.o.write(bArr2, 0, length);
                return i4;
            }
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i = i4 + length;
        }
        if ((i3 * 6) + i <= i2) {
            return i;
        }
        d1();
        return this.f19813r;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void f0(boolean z2) throws IOException {
        Z0("write a boolean value");
        if (this.f19813r + 5 >= this.s) {
            d1();
        }
        byte[] bArr = z2 ? z : A;
        int length = bArr.length;
        System.arraycopy(bArr, 0, this.q, this.f19813r, length);
        this.f19813r += length;
    }

    public final int f1(int i, int i2) throws IOException {
        byte[] bArr = this.q;
        if (i < 55296 || i > 57343) {
            bArr[i2] = (byte) ((i >> 12) | SportReportBaseParser.ReportType.avgFreq);
            int i3 = i2 + 2;
            bArr[i2 + 1] = (byte) (((i >> 6) & 63) | 128);
            int i4 = i2 + 3;
            bArr[i3] = (byte) ((i & 63) | 128);
            return i4;
        }
        bArr[i2] = 92;
        bArr[i2 + 1] = 117;
        byte[] bArr2 = x;
        bArr[i2 + 2] = bArr2[(i >> 12) & 15];
        bArr[i2 + 3] = bArr2[(i >> 8) & 15];
        int i5 = i2 + 5;
        bArr[i2 + 4] = bArr2[(i >> 4) & 15];
        int i6 = i2 + 6;
        bArr[i5] = bArr2[i & 15];
        return i6;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public void flush() throws IOException {
        d1();
        if (this.o == null || !a1(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        this.o.flush();
    }

    public final int g1(int i, char[] cArr, int i2, int i3) throws IOException {
        if (i >= 55296 && i <= 57343) {
            if (i2 >= i3 || cArr == null) {
                a(String.format("Split surrogate on writeRaw() input (last character): first character 0x%4x", Integer.valueOf(i)));
            }
            h1(i, cArr[i2]);
            return i2 + 1;
        }
        byte[] bArr = this.q;
        int i4 = this.f19813r;
        bArr[i4] = (byte) ((i >> 12) | SportReportBaseParser.ReportType.avgFreq);
        bArr[i4 + 1] = (byte) (((i >> 6) & 63) | 128);
        this.f19813r = i4 + 3;
        bArr[i4 + 2] = (byte) ((i & 63) | 128);
        return i2;
    }

    public final void h1(int i, int i2) throws IOException {
        int iY0 = Y0(i, i2);
        if (this.f19813r + 4 > this.s) {
            d1();
        }
        byte[] bArr = this.q;
        int i3 = this.f19813r;
        bArr[i3] = (byte) ((iY0 >> 18) | 240);
        bArr[i3 + 1] = (byte) (((iY0 >> 12) & 63) | 128);
        bArr[i3 + 2] = (byte) (((iY0 >> 6) & 63) | 128);
        this.f19813r = i3 + 4;
        bArr[i3 + 3] = (byte) ((iY0 & 63) | 128);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void i0() throws IOException {
        if (!this.e.f()) {
            a("Current context not Array but " + this.e.j());
        }
        r7i r7iVar = this.f7619a;
        if (r7iVar != null) {
            r7iVar.writeEndArray(this, this.e.d());
        } else {
            if (this.f19813r >= this.s) {
                d1();
            }
            byte[] bArr = this.q;
            int i = this.f19813r;
            this.f19813r = i + 1;
            bArr[i] = 93;
        }
        this.e = this.e.l();
    }

    public final int i1(InputStream inputStream, byte[] bArr, int i, int i2, int i3) throws IOException {
        int i4 = 0;
        while (i < i2) {
            bArr[i4] = bArr[i];
            i4++;
            i++;
        }
        int iMin = Math.min(i3, bArr.length);
        do {
            int i5 = iMin - i4;
            if (i5 == 0) {
                break;
            }
            int i6 = inputStream.read(bArr, i4, i5);
            if (i6 < 0) {
                return i4;
            }
            i4 += i6;
        } while (i4 < 3);
        return i4;
    }

    public void j1() {
        byte[] bArr = this.q;
        if (bArr != null && this.w) {
            this.q = null;
            this.h.t(bArr);
        }
        char[] cArr = this.u;
        if (cArr != null) {
            this.u = null;
            this.h.p(cArr);
        }
    }

    public final int k1(Base64Variant base64Variant, InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.s - 6;
        int i2 = 2;
        int i3 = -3;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i4 = 0;
        int iI1 = 0;
        int i5 = 0;
        while (true) {
            if (i4 > i3) {
                iI1 = i1(inputStream, bArr, i4, iI1, bArr.length);
                if (iI1 < 3) {
                    break;
                }
                i3 = iI1 - 3;
                i4 = 0;
            }
            if (this.f19813r > i) {
                d1();
            }
            int i6 = i4 + 2;
            int i7 = ((bArr[i4 + 1] & 255) | (bArr[i4] << 8)) << 8;
            i4 += 3;
            i5 += 3;
            int iEncodeBase64Chunk = base64Variant.encodeBase64Chunk(i7 | (bArr[i6] & 255), this.q, this.f19813r);
            this.f19813r = iEncodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr2 = this.q;
                bArr2[iEncodeBase64Chunk] = 92;
                this.f19813r = iEncodeBase64Chunk + 2;
                bArr2[iEncodeBase64Chunk + 1] = 110;
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (iI1 <= 0) {
            return i5;
        }
        if (this.f19813r > i) {
            d1();
        }
        int i8 = bArr[0] << 16;
        if (1 < iI1) {
            i8 |= (bArr[1] & 255) << 8;
        } else {
            i2 = 1;
        }
        int i9 = i5 + i2;
        this.f19813r = base64Variant.encodeBase64Partial(i8, i2, this.q, this.f19813r);
        return i9;
    }

    public final int l1(Base64Variant base64Variant, InputStream inputStream, byte[] bArr, int i) throws IOException {
        int iI1;
        int i2 = this.s - 6;
        int i3 = 2;
        int i4 = -3;
        int i5 = i;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i6 = 0;
        int iI2 = 0;
        while (i5 > 2) {
            if (i6 > i4) {
                iI2 = i1(inputStream, bArr, i6, iI2, i5);
                if (iI2 < 3) {
                    i6 = 0;
                    break;
                }
                i4 = iI2 - 3;
                i6 = 0;
            }
            if (this.f19813r > i2) {
                d1();
            }
            int i7 = i6 + 2;
            int i8 = ((bArr[i6 + 1] & 255) | (bArr[i6] << 8)) << 8;
            i6 += 3;
            i5 -= 3;
            int iEncodeBase64Chunk = base64Variant.encodeBase64Chunk(i8 | (bArr[i7] & 255), this.q, this.f19813r);
            this.f19813r = iEncodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr2 = this.q;
                bArr2[iEncodeBase64Chunk] = 92;
                this.f19813r = iEncodeBase64Chunk + 2;
                bArr2[iEncodeBase64Chunk + 1] = 110;
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (i5 <= 0 || (iI1 = i1(inputStream, bArr, i6, iI2, i5)) <= 0) {
            return i5;
        }
        if (this.f19813r > i2) {
            d1();
        }
        int i9 = bArr[0] << 16;
        if (1 < iI1) {
            i9 |= (bArr[1] & 255) << 8;
        } else {
            i3 = 1;
        }
        this.f19813r = base64Variant.encodeBase64Partial(i9, i3, this.q, this.f19813r);
        return i5 - i3;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void m0() throws IOException {
        if (!this.e.g()) {
            a("Current context not Object but " + this.e.j());
        }
        r7i r7iVar = this.f7619a;
        if (r7iVar != null) {
            r7iVar.writeEndObject(this, this.e.d());
        } else {
            if (this.f19813r >= this.s) {
                d1();
            }
            byte[] bArr = this.q;
            int i = this.f19813r;
            this.f19813r = i + 1;
            bArr[i] = 125;
        }
        this.e = this.e.l();
    }

    public final void m1(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException {
        int iEncodeBase64Chunk;
        int i3 = i2 - 3;
        int i4 = this.s - 6;
        int maxLineLength = base64Variant.getMaxLineLength();
        loop0: while (true) {
            int i5 = maxLineLength >> 2;
            do {
                if (i > i3) {
                    break loop0;
                }
                if (this.f19813r > i4) {
                    d1();
                }
                int i6 = i + 2;
                int i7 = ((bArr[i + 1] & 255) | (bArr[i] << 8)) << 8;
                i += 3;
                iEncodeBase64Chunk = base64Variant.encodeBase64Chunk(i7 | (bArr[i6] & 255), this.q, this.f19813r);
                this.f19813r = iEncodeBase64Chunk;
                i5--;
            } while (i5 > 0);
            byte[] bArr2 = this.q;
            bArr2[iEncodeBase64Chunk] = 92;
            this.f19813r = iEncodeBase64Chunk + 2;
            bArr2[iEncodeBase64Chunk + 1] = 110;
            maxLineLength = base64Variant.getMaxLineLength();
        }
        int i8 = i2 - i;
        if (i8 > 0) {
            if (this.f19813r > i4) {
                d1();
            }
            int i9 = i + 1;
            int i10 = bArr[i] << 16;
            if (i8 == 2) {
                i10 |= (bArr[i9] & 255) << 8;
            }
            this.f19813r = base64Variant.encodeBase64Partial(i10, i8, this.q, this.f19813r);
        }
    }

    public final void n1(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this.f19813r + length > this.s) {
            d1();
            if (length > 512) {
                this.o.write(bArr, 0, length);
                return;
            }
        }
        System.arraycopy(bArr, 0, this.q, this.f19813r, length);
        this.f19813r += length;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void o0(owl owlVar) throws IOException {
        if (this.f7619a != null) {
            t1(owlVar);
            return;
        }
        int iT = this.e.t(owlVar.getValue());
        if (iT == 4) {
            a("Can not write a field name, expecting a value");
        }
        if (iT == 1) {
            if (this.f19813r >= this.s) {
                d1();
            }
            byte[] bArr = this.q;
            int i = this.f19813r;
            this.f19813r = i + 1;
            bArr[i] = HMProSyncDataBaseProfile.DATA_STATISTIC_V2;
        }
        if (this.m) {
            K1(owlVar);
            return;
        }
        if (this.f19813r >= this.s) {
            d1();
        }
        byte[] bArr2 = this.q;
        int i2 = this.f19813r;
        int i3 = i2 + 1;
        this.f19813r = i3;
        bArr2[i2] = this.p;
        int iAppendQuotedUTF8 = owlVar.appendQuotedUTF8(bArr2, i3);
        if (iAppendQuotedUTF8 < 0) {
            n1(owlVar.asQuotedUTF8());
        } else {
            this.f19813r += iAppendQuotedUTF8;
        }
        if (this.f19813r >= this.s) {
            d1();
        }
        byte[] bArr3 = this.q;
        int i4 = this.f19813r;
        this.f19813r = i4 + 1;
        bArr3[i4] = this.p;
    }

    public final int o1(byte[] bArr, int i, owl owlVar, int i2) throws IOException {
        byte[] bArrAsUnquotedUTF8 = owlVar.asUnquotedUTF8();
        int length = bArrAsUnquotedUTF8.length;
        if (length > 6) {
            return e1(bArr, i, this.s, bArrAsUnquotedUTF8, i2);
        }
        System.arraycopy(bArrAsUnquotedUTF8, 0, bArr, i, length);
        return i + length;
    }

    public final void p1(String str, int i, int i2) throws IOException {
        if (this.f19813r + ((i2 - i) * 6) > this.s) {
            d1();
        }
        int iF1 = this.f19813r;
        byte[] bArr = this.q;
        int[] iArr = this.i;
        int i3 = this.j;
        if (i3 <= 0) {
            i3 = 65535;
        }
        CharacterEscapes characterEscapes = this.f27156k;
        while (i < i2) {
            i++;
            char cCharAt = str.charAt(i);
            if (cCharAt <= 127) {
                int i4 = iArr[cCharAt];
                if (i4 == 0) {
                    bArr[iF1] = (byte) cCharAt;
                    iF1++;
                } else if (i4 > 0) {
                    int i5 = iF1 + 1;
                    bArr[iF1] = 92;
                    iF1 += 2;
                    bArr[i5] = (byte) i4;
                } else if (i4 == -2) {
                    owl escapeSequence = characterEscapes.getEscapeSequence(cCharAt);
                    if (escapeSequence == null) {
                        a("Invalid custom escape definitions; custom escape not found for character code 0x" + Integer.toHexString(cCharAt) + ", although was supposed to have one");
                    }
                    iF1 = o1(bArr, iF1, escapeSequence, i2 - i);
                } else {
                    iF1 = r1(cCharAt, iF1);
                }
            } else if (cCharAt > i3) {
                iF1 = r1(cCharAt, iF1);
            } else {
                owl escapeSequence2 = characterEscapes.getEscapeSequence(cCharAt);
                if (escapeSequence2 != null) {
                    iF1 = o1(bArr, iF1, escapeSequence2, i2 - i);
                } else if (cCharAt <= 2047) {
                    int i6 = iF1 + 1;
                    bArr[iF1] = (byte) ((cCharAt >> 6) | 192);
                    iF1 += 2;
                    bArr[i6] = (byte) ((cCharAt & '?') | 128);
                } else {
                    iF1 = f1(cCharAt, iF1);
                }
            }
        }
        this.f19813r = iF1;
    }

    public final void q1(char[] cArr, int i, int i2) throws IOException {
        if (this.f19813r + ((i2 - i) * 6) > this.s) {
            d1();
        }
        int iF1 = this.f19813r;
        byte[] bArr = this.q;
        int[] iArr = this.i;
        int i3 = this.j;
        if (i3 <= 0) {
            i3 = 65535;
        }
        CharacterEscapes characterEscapes = this.f27156k;
        while (i < i2) {
            i++;
            char c = cArr[i];
            if (c <= 127) {
                int i4 = iArr[c];
                if (i4 == 0) {
                    bArr[iF1] = (byte) c;
                    iF1++;
                } else if (i4 > 0) {
                    int i5 = iF1 + 1;
                    bArr[iF1] = 92;
                    iF1 += 2;
                    bArr[i5] = (byte) i4;
                } else if (i4 == -2) {
                    owl escapeSequence = characterEscapes.getEscapeSequence(c);
                    if (escapeSequence == null) {
                        a("Invalid custom escape definitions; custom escape not found for character code 0x" + Integer.toHexString(c) + ", although was supposed to have one");
                    }
                    iF1 = o1(bArr, iF1, escapeSequence, i2 - i);
                } else {
                    iF1 = r1(c, iF1);
                }
            } else if (c > i3) {
                iF1 = r1(c, iF1);
            } else {
                owl escapeSequence2 = characterEscapes.getEscapeSequence(c);
                if (escapeSequence2 != null) {
                    iF1 = o1(bArr, iF1, escapeSequence2, i2 - i);
                } else if (c <= 2047) {
                    int i6 = iF1 + 1;
                    bArr[iF1] = (byte) ((c >> 6) | 192);
                    iF1 += 2;
                    bArr[i6] = (byte) ((c & '?') | 128);
                } else {
                    iF1 = f1(c, iF1);
                }
            }
        }
        this.f19813r = iF1;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void r0(String str) throws IOException {
        if (this.f7619a != null) {
            u1(str);
            return;
        }
        int iT = this.e.t(str);
        if (iT == 4) {
            a("Can not write a field name, expecting a value");
        }
        if (iT == 1) {
            if (this.f19813r >= this.s) {
                d1();
            }
            byte[] bArr = this.q;
            int i = this.f19813r;
            this.f19813r = i + 1;
            bArr[i] = HMProSyncDataBaseProfile.DATA_STATISTIC_V2;
        }
        if (this.m) {
            I1(str, false);
            return;
        }
        int length = str.length();
        if (length > this.v) {
            I1(str, true);
            return;
        }
        if (this.f19813r >= this.s) {
            d1();
        }
        byte[] bArr2 = this.q;
        int i2 = this.f19813r;
        int i3 = i2 + 1;
        this.f19813r = i3;
        bArr2[i2] = this.p;
        if (length <= this.t) {
            if (i3 + length > this.s) {
                d1();
            }
            B1(str, 0, length);
        } else {
            H1(str, 0, length);
        }
        if (this.f19813r >= this.s) {
            d1();
        }
        byte[] bArr3 = this.q;
        int i4 = this.f19813r;
        this.f19813r = i4 + 1;
        bArr3[i4] = this.p;
    }

    public final int r1(int i, int i2) throws IOException {
        int i3;
        byte[] bArr = this.q;
        bArr[i2] = 92;
        int i4 = i2 + 2;
        bArr[i2 + 1] = 117;
        if (i > 255) {
            int i5 = i >> 8;
            int i6 = i2 + 3;
            byte[] bArr2 = x;
            bArr[i4] = bArr2[(i5 & 255) >> 4];
            i3 = i2 + 4;
            bArr[i6] = bArr2[i5 & 15];
            i &= 255;
        } else {
            int i7 = i2 + 3;
            bArr[i4] = 48;
            i3 = i2 + 4;
            bArr[i7] = 48;
        }
        int i8 = i3 + 1;
        byte[] bArr3 = x;
        bArr[i3] = bArr3[i >> 4];
        int i9 = i3 + 2;
        bArr[i8] = bArr3[i & 15];
        return i9;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void s0() throws IOException {
        Z0("write a null");
        s1();
    }

    public final void s1() throws IOException {
        if (this.f19813r + 4 >= this.s) {
            d1();
        }
        System.arraycopy(y, 0, this.q, this.f19813r, 4);
        this.f19813r += 4;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void t0(double d) throws IOException {
        if (this.d || ((Double.isNaN(d) || Double.isInfinite(d)) && JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(this.c))) {
            Q0(String.valueOf(d));
        } else {
            Z0("write a number");
            H0(String.valueOf(d));
        }
    }

    public final void t1(owl owlVar) throws IOException {
        int iT = this.e.t(owlVar.getValue());
        if (iT == 4) {
            a("Can not write a field name, expecting a value");
        }
        if (iT == 1) {
            this.f7619a.writeObjectEntrySeparator(this);
        } else {
            this.f7619a.beforeObjectEntries(this);
        }
        boolean z2 = !this.m;
        if (z2) {
            if (this.f19813r >= this.s) {
                d1();
            }
            byte[] bArr = this.q;
            int i = this.f19813r;
            this.f19813r = i + 1;
            bArr[i] = this.p;
        }
        n1(owlVar.asQuotedUTF8());
        if (z2) {
            if (this.f19813r >= this.s) {
                d1();
            }
            byte[] bArr2 = this.q;
            int i2 = this.f19813r;
            this.f19813r = i2 + 1;
            bArr2[i2] = this.p;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void u0(float f) throws IOException {
        if (this.d || ((Float.isNaN(f) || Float.isInfinite(f)) && JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(this.c))) {
            Q0(String.valueOf(f));
        } else {
            Z0("write a number");
            H0(String.valueOf(f));
        }
    }

    public final void u1(String str) throws IOException {
        int iT = this.e.t(str);
        if (iT == 4) {
            a("Can not write a field name, expecting a value");
        }
        if (iT == 1) {
            this.f7619a.writeObjectEntrySeparator(this);
        } else {
            this.f7619a.beforeObjectEntries(this);
        }
        if (this.m) {
            I1(str, false);
            return;
        }
        int length = str.length();
        if (length > this.v) {
            I1(str, true);
            return;
        }
        if (this.f19813r >= this.s) {
            d1();
        }
        byte[] bArr = this.q;
        int i = this.f19813r;
        this.f19813r = i + 1;
        bArr[i] = this.p;
        str.getChars(0, length, this.u, 0);
        if (length <= this.t) {
            if (this.f19813r + length > this.s) {
                d1();
            }
            C1(this.u, 0, length);
        } else {
            J1(this.u, 0, length);
        }
        if (this.f19813r >= this.s) {
            d1();
        }
        byte[] bArr2 = this.q;
        int i2 = this.f19813r;
        this.f19813r = i2 + 1;
        bArr2[i2] = this.p;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void v0(int i) throws IOException {
        Z0("write a number");
        if (this.f19813r + 11 >= this.s) {
            d1();
        }
        if (this.d) {
            v1(i);
        } else {
            this.f19813r = o2h.o(i, this.q, this.f19813r);
        }
    }

    public final void v1(int i) throws IOException {
        if (this.f19813r + 13 >= this.s) {
            d1();
        }
        byte[] bArr = this.q;
        int i2 = this.f19813r;
        int i3 = i2 + 1;
        this.f19813r = i3;
        bArr[i2] = this.p;
        int iO = o2h.o(i, bArr, i3);
        byte[] bArr2 = this.q;
        this.f19813r = iO + 1;
        bArr2[iO] = this.p;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void w0(long j) throws IOException {
        Z0("write a number");
        if (this.d) {
            w1(j);
            return;
        }
        if (this.f19813r + 21 >= this.s) {
            d1();
        }
        this.f19813r = o2h.q(j, this.q, this.f19813r);
    }

    public final void w1(long j) throws IOException {
        if (this.f19813r + 23 >= this.s) {
            d1();
        }
        byte[] bArr = this.q;
        int i = this.f19813r;
        int i2 = i + 1;
        this.f19813r = i2;
        bArr[i] = this.p;
        int iQ = o2h.q(j, bArr, i2);
        byte[] bArr2 = this.q;
        this.f19813r = iQ + 1;
        bArr2[iQ] = this.p;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void x0(String str) throws IOException {
        Z0("write a number");
        if (this.d) {
            x1(str);
        } else {
            H0(str);
        }
    }

    public final void x1(String str) throws IOException {
        if (this.f19813r >= this.s) {
            d1();
        }
        byte[] bArr = this.q;
        int i = this.f19813r;
        this.f19813r = i + 1;
        bArr[i] = this.p;
        H0(str);
        if (this.f19813r >= this.s) {
            d1();
        }
        byte[] bArr2 = this.q;
        int i2 = this.f19813r;
        this.f19813r = i2 + 1;
        bArr2[i2] = this.p;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void y0(BigDecimal bigDecimal) throws IOException {
        Z0("write a number");
        if (bigDecimal == null) {
            s1();
        } else if (this.d) {
            x1(W0(bigDecimal));
        } else {
            H0(W0(bigDecimal));
        }
    }

    public final void y1(short s) throws IOException {
        if (this.f19813r + 8 >= this.s) {
            d1();
        }
        byte[] bArr = this.q;
        int i = this.f19813r;
        int i2 = i + 1;
        this.f19813r = i2;
        bArr[i] = this.p;
        int iO = o2h.o(s, bArr, i2);
        byte[] bArr2 = this.q;
        this.f19813r = iO + 1;
        bArr2[iO] = this.p;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void z0(BigInteger bigInteger) throws IOException {
        Z0("write a number");
        if (bigInteger == null) {
            s1();
        } else if (this.d) {
            x1(bigInteger.toString());
        } else {
            H0(bigInteger.toString());
        }
    }

    public final void z1(char[] cArr, int i, int i2) throws IOException {
        while (i < i2) {
            do {
                char c = cArr[i];
                if (c > 127) {
                    i++;
                    if (c < 2048) {
                        byte[] bArr = this.q;
                        int i3 = this.f19813r;
                        bArr[i3] = (byte) ((c >> 6) | 192);
                        this.f19813r = i3 + 2;
                        bArr[i3 + 1] = (byte) ((c & '?') | 128);
                    } else {
                        i = g1(c, cArr, i, i2);
                    }
                } else {
                    byte[] bArr2 = this.q;
                    int i4 = this.f19813r;
                    this.f19813r = i4 + 1;
                    bArr2[i4] = (byte) c;
                    i++;
                }
            } while (i < i2);
            return;
        }
    }
}
