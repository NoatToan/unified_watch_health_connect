package defpackage;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class fpr extends msd {
    public static final char[] x = xt3.d();
    public final Writer o;
    public char p;
    public char[] q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f18067r;
    public int s;
    public int t;
    public char[] u;
    public owl v;
    public char[] w;

    public fpr(xuc xucVar, int i, v3h v3hVar, Writer writer) {
        super(xucVar, i, v3hVar);
        this.p = '\"';
        this.o = writer;
        char[] cArrE = xucVar.e();
        this.q = cArrE;
        this.t = cArrE.length;
    }

    private int i1(InputStream inputStream, byte[] bArr, int i, int i2, int i3) throws IOException {
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

    private final void q1() throws IOException {
        if (this.s + 4 >= this.t) {
            f1();
        }
        int i = this.s;
        char[] cArr = this.q;
        cArr[i] = 'n';
        cArr[i + 1] = AbstractJsonLexerKt.UNICODE_ESC;
        cArr[i + 2] = 'l';
        cArr[i + 3] = 'l';
        this.s = i + 4;
    }

    private void t1(int i) throws IOException {
        if (this.s + 13 >= this.t) {
            f1();
        }
        char[] cArr = this.q;
        int i2 = this.s;
        int i3 = i2 + 1;
        this.s = i3;
        cArr[i2] = this.p;
        int iP = o2h.p(i, cArr, i3);
        char[] cArr2 = this.q;
        this.s = iP + 1;
        cArr2[iP] = this.p;
    }

    private void u1(long j) throws IOException {
        if (this.s + 23 >= this.t) {
            f1();
        }
        char[] cArr = this.q;
        int i = this.s;
        int i2 = i + 1;
        this.s = i2;
        cArr[i] = this.p;
        int iR = o2h.r(j, cArr, i2);
        char[] cArr2 = this.q;
        this.s = iR + 1;
        cArr2[iR] = this.p;
    }

    private void v1(String str) throws IOException {
        if (this.s >= this.t) {
            f1();
        }
        char[] cArr = this.q;
        int i = this.s;
        this.s = i + 1;
        cArr[i] = this.p;
        H0(str);
        if (this.s >= this.t) {
            f1();
        }
        char[] cArr2 = this.q;
        int i2 = this.s;
        this.s = i2 + 1;
        cArr2[i2] = this.p;
    }

    private void w1(short s) throws IOException {
        if (this.s + 8 >= this.t) {
            f1();
        }
        char[] cArr = this.q;
        int i = this.s;
        int i2 = i + 1;
        this.s = i2;
        cArr[i] = this.p;
        int iP = o2h.p(s, cArr, i2);
        char[] cArr2 = this.q;
        this.s = iP + 1;
        cArr2[iP] = this.p;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void A0(short s) throws IOException {
        Z0("write a number");
        if (this.d) {
            w1(s);
            return;
        }
        if (this.s + 6 >= this.t) {
            f1();
        }
        this.s = o2h.p(s, this.q, this.s);
    }

    public final void A1(String str) throws IOException {
        int length = str.length();
        int i = this.t;
        if (length > i) {
            p1(str);
            return;
        }
        if (this.s + length > i) {
            f1();
        }
        str.getChars(0, length, this.q, this.s);
        if (this.f27156k != null) {
            F1(length);
            return;
        }
        int i2 = this.j;
        if (i2 != 0) {
            D1(length, i2);
        } else {
            C1(length);
        }
    }

    public final void B1(char[] cArr, int i, int i2) throws IOException {
        if (this.f27156k != null) {
            G1(cArr, i, i2);
            return;
        }
        int i3 = this.j;
        if (i3 != 0) {
            E1(cArr, i, i2, i3);
            return;
        }
        int i4 = i2 + i;
        int[] iArr = this.i;
        int length = iArr.length;
        while (i < i4) {
            int i5 = i;
            do {
                char c = cArr[i5];
                if (c < length && iArr[c] != 0) {
                    break;
                } else {
                    i5++;
                }
            } while (i5 < i4);
            int i6 = i5 - i;
            if (i6 < 32) {
                if (this.s + i6 > this.t) {
                    f1();
                }
                if (i6 > 0) {
                    System.arraycopy(cArr, i, this.q, this.s, i6);
                    this.s += i6;
                }
            } else {
                f1();
                this.o.write(cArr, i, i6);
            }
            if (i5 >= i4) {
                return;
            }
            i = i5 + 1;
            char c2 = cArr[i5];
            e1(c2, iArr[c2]);
        }
    }

    public final void C1(int i) throws IOException {
        int i2;
        int i3 = this.s + i;
        int[] iArr = this.i;
        int length = iArr.length;
        while (this.s < i3) {
            do {
                char[] cArr = this.q;
                int i4 = this.s;
                char c = cArr[i4];
                if (c >= length || iArr[c] == 0) {
                    i2 = i4 + 1;
                    this.s = i2;
                } else {
                    int i5 = this.f18067r;
                    int i6 = i4 - i5;
                    if (i6 > 0) {
                        this.o.write(cArr, i5, i6);
                    }
                    char[] cArr2 = this.q;
                    int i7 = this.s;
                    this.s = i7 + 1;
                    char c2 = cArr2[i7];
                    h1(c2, iArr[c2]);
                }
            } while (i2 < i3);
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    /* JADX WARN: Code duplicated, block: B:22:0x002a A[SYNTHETIC] */
    public final void D1(int i, int i2) throws IOException {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.s + i;
        int[] iArr = this.i;
        int iMin = Math.min(iArr.length, i2 + 1);
        while (this.s < i7) {
            do {
                char[] cArr = this.q;
                int i8 = this.s;
                char c = cArr[i8];
                if (c < iMin) {
                    i3 = iArr[c];
                    if (i3 != 0) {
                        i4 = this.f18067r;
                        i5 = i8 - i4;
                        if (i5 > 0) {
                            this.o.write(cArr, i4, i5);
                        }
                        this.s++;
                        h1(c, i3);
                    }
                    i6 = i8 + 1;
                    this.s = i6;
                } else {
                    if (c > i2) {
                        i3 = -1;
                        i4 = this.f18067r;
                        i5 = i8 - i4;
                        if (i5 > 0) {
                            this.o.write(cArr, i4, i5);
                        }
                        this.s++;
                        h1(c, i3);
                    }
                    i6 = i8 + 1;
                    this.s = i6;
                }
            } while (i6 < i7);
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b A[PHI: r2
      0x001b: PHI (r2v6 int) = (r2v3 int), (r2v7 int) binds: [B:10:0x0017, B:8:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    public final void E1(char[] cArr, int i, int i2, int i3) throws IOException {
        char c;
        int i4 = i2 + i;
        int[] iArr = this.i;
        int iMin = Math.min(iArr.length, i3 + 1);
        int i5 = 0;
        while (i < i4) {
            int i6 = i;
            do {
                c = cArr[i6];
                if (c < iMin) {
                    i5 = iArr[c];
                    if (i5 != 0) {
                        break;
                    } else {
                        i6++;
                    }
                } else {
                    if (c > i3) {
                        i5 = -1;
                        break;
                    }
                    i6++;
                }
            } while (i6 < i4);
            int i7 = i6 - i;
            if (i7 < 32) {
                if (this.s + i7 > this.t) {
                    f1();
                }
                if (i7 > 0) {
                    System.arraycopy(cArr, i, this.q, this.s, i7);
                    this.s += i7;
                }
            } else {
                f1();
                this.o.write(cArr, i, i7);
            }
            if (i6 >= i4) {
                return;
            }
            i = i6 + 1;
            e1(c, i5);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void F0(char c) throws IOException {
        if (this.s >= this.t) {
            f1();
        }
        char[] cArr = this.q;
        int i = this.s;
        this.s = i + 1;
        cArr[i] = c;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0042 A[SYNTHETIC] */
    public final void F1(int i) throws IOException {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.s + i;
        int[] iArr = this.i;
        int i7 = this.j;
        if (i7 < 1) {
            i7 = 65535;
        }
        int iMin = Math.min(iArr.length, i7 + 1);
        CharacterEscapes characterEscapes = this.f27156k;
        while (this.s < i6) {
            do {
                char c = this.q[this.s];
                if (c < iMin) {
                    i2 = iArr[c];
                    if (i2 != 0) {
                        int i8 = this.s;
                        i3 = this.f18067r;
                        i4 = i8 - i3;
                        if (i4 > 0) {
                            this.o.write(this.q, i3, i4);
                        }
                        this.s++;
                        h1(c, i2);
                    }
                    i5 = this.s + 1;
                    this.s = i5;
                } else {
                    if (c > i7) {
                        i2 = -1;
                    } else {
                        owl escapeSequence = characterEscapes.getEscapeSequence(c);
                        this.v = escapeSequence;
                        if (escapeSequence != null) {
                            i2 = -2;
                        }
                        i5 = this.s + 1;
                        this.s = i5;
                    }
                    int i9 = this.s;
                    i3 = this.f18067r;
                    i4 = i9 - i3;
                    if (i4 > 0) {
                        this.o.write(this.q, i3, i4);
                    }
                    this.s++;
                    h1(c, i2);
                }
            } while (i5 < i6);
            return;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void G0(owl owlVar) throws IOException {
        H0(owlVar.getValue());
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002f A[PHI: r4
      0x002f: PHI (r4v6 int) = (r4v2 int), (r4v7 int) binds: [B:16:0x002b, B:11:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    public final void G1(char[] cArr, int i, int i2) throws IOException {
        char c;
        int i3 = i2 + i;
        int[] iArr = this.i;
        int i4 = this.j;
        if (i4 < 1) {
            i4 = 65535;
        }
        int iMin = Math.min(iArr.length, i4 + 1);
        CharacterEscapes characterEscapes = this.f27156k;
        int i5 = 0;
        while (i < i3) {
            int i6 = i;
            do {
                c = cArr[i6];
                if (c < iMin) {
                    i5 = iArr[c];
                    if (i5 != 0) {
                        break;
                    } else {
                        i6++;
                    }
                } else {
                    if (c > i4) {
                        i5 = -1;
                        break;
                    }
                    owl escapeSequence = characterEscapes.getEscapeSequence(c);
                    this.v = escapeSequence;
                    if (escapeSequence != null) {
                        i5 = -2;
                        break;
                    }
                    i6++;
                }
            } while (i6 < i3);
            int i7 = i6 - i;
            if (i7 < 32) {
                if (this.s + i7 > this.t) {
                    f1();
                }
                if (i7 > 0) {
                    System.arraycopy(cArr, i, this.q, this.s, i7);
                    this.s += i7;
                }
            } else {
                f1();
                this.o.write(cArr, i, i7);
            }
            if (i6 >= i3) {
                return;
            }
            i = i6 + 1;
            e1(c, i5);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void H0(String str) throws IOException {
        int length = str.length();
        int i = this.t - this.s;
        if (i == 0) {
            f1();
            i = this.t - this.s;
        }
        if (i < length) {
            H1(str);
        } else {
            str.getChars(0, length, this.q, this.s);
            this.s += length;
        }
    }

    public final void H1(String str) throws IOException {
        int i = this.t;
        int i2 = this.s;
        int i3 = i - i2;
        str.getChars(0, i3, this.q, i2);
        this.s += i3;
        f1();
        int length = str.length() - i3;
        while (true) {
            int i4 = this.t;
            if (length <= i4) {
                str.getChars(i3, i3 + length, this.q, 0);
                this.f18067r = 0;
                this.s = length;
                return;
            } else {
                int i5 = i3 + i4;
                str.getChars(i3, i5, this.q, 0);
                this.f18067r = 0;
                this.s = i4;
                f1();
                length -= i4;
                i3 = i5;
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void I0(char[] cArr, int i, int i2) throws IOException {
        if (i2 >= 32) {
            f1();
            this.o.write(cArr, i, i2);
        } else {
            if (i2 > this.t - this.s) {
                f1();
            }
            System.arraycopy(cArr, i, this.q, this.s, i2);
            this.s += i2;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void L0() throws IOException {
        Z0("start an array");
        this.e = this.e.m();
        r7i r7iVar = this.f7619a;
        if (r7iVar != null) {
            r7iVar.writeStartArray(this);
            return;
        }
        if (this.s >= this.t) {
            f1();
        }
        char[] cArr = this.q;
        int i = this.s;
        this.s = i + 1;
        cArr[i] = AbstractJsonLexerKt.BEGIN_LIST;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void N0() throws IOException {
        Z0("start an object");
        this.e = this.e.n();
        r7i r7iVar = this.f7619a;
        if (r7iVar != null) {
            r7iVar.writeStartObject(this);
            return;
        }
        if (this.s >= this.t) {
            f1();
        }
        char[] cArr = this.q;
        int i = this.s;
        this.s = i + 1;
        cArr[i] = AbstractJsonLexerKt.BEGIN_OBJ;
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
        if (this.s >= this.t) {
            f1();
        }
        char[] cArr = this.q;
        int i = this.s;
        this.s = i + 1;
        cArr[i] = AbstractJsonLexerKt.BEGIN_OBJ;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void P0(owl owlVar) throws IOException {
        Z0("write a string");
        if (this.s >= this.t) {
            f1();
        }
        char[] cArr = this.q;
        int i = this.s;
        this.s = i + 1;
        cArr[i] = this.p;
        char[] cArrAsQuotedChars = owlVar.asQuotedChars();
        int length = cArrAsQuotedChars.length;
        if (length < 32) {
            if (length > this.t - this.s) {
                f1();
            }
            System.arraycopy(cArrAsQuotedChars, 0, this.q, this.s, length);
            this.s += length;
        } else {
            f1();
            this.o.write(cArrAsQuotedChars, 0, length);
        }
        if (this.s >= this.t) {
            f1();
        }
        char[] cArr2 = this.q;
        int i2 = this.s;
        this.s = i2 + 1;
        cArr2[i2] = this.p;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void Q0(String str) throws IOException {
        Z0("write a string");
        if (str == null) {
            q1();
            return;
        }
        if (this.s >= this.t) {
            f1();
        }
        char[] cArr = this.q;
        int i = this.s;
        this.s = i + 1;
        cArr[i] = this.p;
        A1(str);
        if (this.s >= this.t) {
            f1();
        }
        char[] cArr2 = this.q;
        int i2 = this.s;
        this.s = i2 + 1;
        cArr2[i2] = this.p;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void R0(char[] cArr, int i, int i2) throws IOException {
        Z0("write a string");
        if (this.s >= this.t) {
            f1();
        }
        char[] cArr2 = this.q;
        int i3 = this.s;
        this.s = i3 + 1;
        cArr2[i3] = this.p;
        B1(cArr, i, i2);
        if (this.s >= this.t) {
            f1();
        }
        char[] cArr3 = this.q;
        int i4 = this.s;
        this.s = i4 + 1;
        cArr3[i4] = this.p;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int U(Base64Variant base64Variant, InputStream inputStream, int i) throws IOException {
        Z0("write a binary value");
        if (this.s >= this.t) {
            f1();
        }
        char[] cArr = this.q;
        int i2 = this.s;
        this.s = i2 + 1;
        cArr[i2] = this.p;
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
            if (this.s >= this.t) {
                f1();
            }
            char[] cArr2 = this.q;
            int i3 = this.s;
            this.s = i3 + 1;
            cArr2[i3] = this.p;
            return i;
        } catch (Throwable th) {
            this.h.o(bArrD);
            throw th;
        }
    }

    @Override // defpackage.yxa
    public final void Z0(String str) throws IOException {
        char c;
        int iU = this.e.u();
        if (this.f7619a != null) {
            c1(str, iU);
            return;
        }
        if (iU == 1) {
            c = ',';
        } else {
            if (iU != 2) {
                if (iU != 3) {
                    if (iU != 5) {
                        return;
                    }
                    b1(str);
                    return;
                } else {
                    owl owlVar = this.l;
                    if (owlVar != null) {
                        H0(owlVar.getValue());
                        return;
                    }
                    return;
                }
            }
            c = AbstractJsonLexerKt.COLON;
        }
        if (this.s >= this.t) {
            f1();
        }
        char[] cArr = this.q;
        int i = this.s;
        this.s = i + 1;
        cArr[i] = c;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void b0(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException {
        Z0("write a binary value");
        if (this.s >= this.t) {
            f1();
        }
        char[] cArr = this.q;
        int i3 = this.s;
        this.s = i3 + 1;
        cArr[i3] = this.p;
        m1(base64Variant, bArr, i, i2 + i);
        if (this.s >= this.t) {
            f1();
        }
        char[] cArr2 = this.q;
        int i4 = this.s;
        this.s = i4 + 1;
        cArr2[i4] = this.p;
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
        f1();
        this.f18067r = 0;
        this.s = 0;
        if (this.o != null) {
            if (this.h.n() || a1(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
                this.o.close();
            } else if (a1(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
                this.o.flush();
            }
        }
        j1();
    }

    public final char[] d1() {
        char[] cArr = {AbstractJsonLexerKt.STRING_ESC, 0, AbstractJsonLexerKt.STRING_ESC, AbstractJsonLexerKt.UNICODE_ESC, '0', '0', 0, 0, AbstractJsonLexerKt.STRING_ESC, AbstractJsonLexerKt.UNICODE_ESC, 0, 0, 0, 0};
        this.u = cArr;
        return cArr;
    }

    public final void e1(char c, int i) throws IOException {
        String value;
        int i2;
        if (i >= 0) {
            if (this.s + 2 > this.t) {
                f1();
            }
            char[] cArr = this.q;
            int i3 = this.s;
            cArr[i3] = AbstractJsonLexerKt.STRING_ESC;
            this.s = i3 + 2;
            cArr[i3 + 1] = (char) i;
            return;
        }
        if (i == -2) {
            owl owlVar = this.v;
            if (owlVar == null) {
                value = this.f27156k.getEscapeSequence(c).getValue();
            } else {
                value = owlVar.getValue();
                this.v = null;
            }
            int length = value.length();
            if (this.s + length > this.t) {
                f1();
                if (length > this.t) {
                    this.o.write(value);
                    return;
                }
            }
            value.getChars(0, length, this.q, this.s);
            this.s += length;
            return;
        }
        if (this.s + 5 >= this.t) {
            f1();
        }
        int i4 = this.s;
        char[] cArr2 = this.q;
        cArr2[i4] = AbstractJsonLexerKt.STRING_ESC;
        int i5 = i4 + 2;
        cArr2[i4 + 1] = AbstractJsonLexerKt.UNICODE_ESC;
        if (c > 255) {
            int i6 = c >> '\b';
            int i7 = i4 + 3;
            char[] cArr3 = x;
            cArr2[i5] = cArr3[(i6 & 255) >> 4];
            i2 = i4 + 4;
            cArr2[i7] = cArr3[i6 & 15];
            c = (char) (c & 255);
        } else {
            int i8 = i4 + 3;
            cArr2[i5] = '0';
            i2 = i4 + 4;
            cArr2[i8] = '0';
        }
        char[] cArr4 = x;
        cArr2[i2] = cArr4[c >> 4];
        cArr2[i2 + 1] = cArr4[c & 15];
        this.s = i2 + 2;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void f0(boolean z) throws IOException {
        int i;
        Z0("write a boolean value");
        if (this.s + 5 >= this.t) {
            f1();
        }
        int i2 = this.s;
        char[] cArr = this.q;
        if (z) {
            cArr[i2] = 't';
            cArr[i2 + 1] = 'r';
            cArr[i2 + 2] = AbstractJsonLexerKt.UNICODE_ESC;
            i = i2 + 3;
            cArr[i] = 'e';
        } else {
            cArr[i2] = 'f';
            cArr[i2 + 1] = 'a';
            cArr[i2 + 2] = 'l';
            cArr[i2 + 3] = 's';
            i = i2 + 4;
            cArr[i] = 'e';
        }
        this.s = i + 1;
    }

    public void f1() throws IOException {
        int i = this.s;
        int i2 = this.f18067r;
        int i3 = i - i2;
        if (i3 > 0) {
            this.f18067r = 0;
            this.s = 0;
            this.o.write(this.q, i2, i3);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public void flush() throws IOException {
        f1();
        if (this.o == null || !a1(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        this.o.flush();
    }

    public final int g1(char[] cArr, int i, int i2, char c, int i3) throws IOException {
        String value;
        int i4;
        if (i3 >= 0) {
            if (i > 1 && i < i2) {
                int i5 = i - 2;
                cArr[i5] = AbstractJsonLexerKt.STRING_ESC;
                cArr[i - 1] = (char) i3;
                return i5;
            }
            char[] cArrD1 = this.u;
            if (cArrD1 == null) {
                cArrD1 = d1();
            }
            cArrD1[1] = (char) i3;
            this.o.write(cArrD1, 0, 2);
            return i;
        }
        if (i3 == -2) {
            owl owlVar = this.v;
            if (owlVar == null) {
                value = this.f27156k.getEscapeSequence(c).getValue();
            } else {
                value = owlVar.getValue();
                this.v = null;
            }
            int length = value.length();
            if (i < length || i >= i2) {
                this.o.write(value);
                return i;
            }
            int i6 = i - length;
            value.getChars(0, length, cArr, i6);
            return i6;
        }
        if (i <= 5 || i >= i2) {
            char[] cArrD2 = this.u;
            if (cArrD2 == null) {
                cArrD2 = d1();
            }
            this.f18067r = this.s;
            if (c <= 255) {
                char[] cArr2 = x;
                cArrD2[6] = cArr2[c >> 4];
                cArrD2[7] = cArr2[c & 15];
                this.o.write(cArrD2, 2, 6);
                return i;
            }
            int i7 = c >> '\b';
            char[] cArr3 = x;
            cArrD2[10] = cArr3[(i7 & 255) >> 4];
            cArrD2[11] = cArr3[i7 & 15];
            cArrD2[12] = cArr3[(c & 255) >> 4];
            cArrD2[13] = cArr3[c & 15];
            this.o.write(cArrD2, 8, 6);
            return i;
        }
        cArr[i - 6] = AbstractJsonLexerKt.STRING_ESC;
        int i8 = i - 4;
        cArr[i - 5] = AbstractJsonLexerKt.UNICODE_ESC;
        if (c > 255) {
            int i9 = c >> '\b';
            int i10 = i - 3;
            char[] cArr4 = x;
            cArr[i8] = cArr4[(i9 & 255) >> 4];
            i4 = i - 2;
            cArr[i10] = cArr4[i9 & 15];
            c = (char) (c & 255);
        } else {
            int i11 = i - 3;
            cArr[i8] = '0';
            i4 = i - 2;
            cArr[i11] = '0';
        }
        char[] cArr5 = x;
        cArr[i4] = cArr5[c >> 4];
        cArr[i4 + 1] = cArr5[c & 15];
        return i4 - 4;
    }

    public final void h1(char c, int i) throws IOException {
        String value;
        int i2;
        if (i >= 0) {
            int i3 = this.s;
            if (i3 >= 2) {
                int i4 = i3 - 2;
                this.f18067r = i4;
                char[] cArr = this.q;
                cArr[i4] = AbstractJsonLexerKt.STRING_ESC;
                cArr[i3 - 1] = (char) i;
                return;
            }
            char[] cArrD1 = this.u;
            if (cArrD1 == null) {
                cArrD1 = d1();
            }
            this.f18067r = this.s;
            cArrD1[1] = (char) i;
            this.o.write(cArrD1, 0, 2);
            return;
        }
        if (i == -2) {
            owl owlVar = this.v;
            if (owlVar == null) {
                value = this.f27156k.getEscapeSequence(c).getValue();
            } else {
                value = owlVar.getValue();
                this.v = null;
            }
            int length = value.length();
            int i5 = this.s;
            if (i5 < length) {
                this.f18067r = i5;
                this.o.write(value);
                return;
            } else {
                int i6 = i5 - length;
                this.f18067r = i6;
                value.getChars(0, length, this.q, i6);
                return;
            }
        }
        int i7 = this.s;
        if (i7 < 6) {
            char[] cArrD2 = this.u;
            if (cArrD2 == null) {
                cArrD2 = d1();
            }
            this.f18067r = this.s;
            if (c <= 255) {
                char[] cArr2 = x;
                cArrD2[6] = cArr2[c >> 4];
                cArrD2[7] = cArr2[c & 15];
                this.o.write(cArrD2, 2, 6);
                return;
            }
            int i8 = c >> '\b';
            char[] cArr3 = x;
            cArrD2[10] = cArr3[(i8 & 255) >> 4];
            cArrD2[11] = cArr3[i8 & 15];
            cArrD2[12] = cArr3[(c & 255) >> 4];
            cArrD2[13] = cArr3[c & 15];
            this.o.write(cArrD2, 8, 6);
            return;
        }
        char[] cArr4 = this.q;
        int i9 = i7 - 6;
        this.f18067r = i9;
        cArr4[i9] = AbstractJsonLexerKt.STRING_ESC;
        cArr4[i7 - 5] = AbstractJsonLexerKt.UNICODE_ESC;
        if (c > 255) {
            int i10 = c >> '\b';
            char[] cArr5 = x;
            cArr4[i7 - 4] = cArr5[(i10 & 255) >> 4];
            i2 = i7 - 3;
            cArr4[i2] = cArr5[i10 & 15];
            c = (char) (c & 255);
        } else {
            cArr4[i7 - 4] = '0';
            i2 = i7 - 3;
            cArr4[i2] = '0';
        }
        char[] cArr6 = x;
        cArr4[i2 + 1] = cArr6[c >> 4];
        cArr4[i2 + 2] = cArr6[c & 15];
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void i0() throws IOException {
        if (!this.e.f()) {
            a("Current context not Array but " + this.e.j());
        }
        r7i r7iVar = this.f7619a;
        if (r7iVar != null) {
            r7iVar.writeEndArray(this, this.e.d());
        } else {
            if (this.s >= this.t) {
                f1();
            }
            char[] cArr = this.q;
            int i = this.s;
            this.s = i + 1;
            cArr[i] = AbstractJsonLexerKt.END_LIST;
        }
        this.e = this.e.l();
    }

    public void j1() {
        char[] cArr = this.q;
        if (cArr != null) {
            this.q = null;
            this.h.p(cArr);
        }
        char[] cArr2 = this.w;
        if (cArr2 != null) {
            this.w = null;
            this.h.q(cArr2);
        }
    }

    public final int k1(Base64Variant base64Variant, InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.t - 6;
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
            if (this.s > i) {
                f1();
            }
            int i6 = i4 + 2;
            int i7 = ((bArr[i4 + 1] & 255) | (bArr[i4] << 8)) << 8;
            i4 += 3;
            i5 += 3;
            int iEncodeBase64Chunk = base64Variant.encodeBase64Chunk(i7 | (bArr[i6] & 255), this.q, this.s);
            this.s = iEncodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                char[] cArr = this.q;
                cArr[iEncodeBase64Chunk] = AbstractJsonLexerKt.STRING_ESC;
                this.s = iEncodeBase64Chunk + 2;
                cArr[iEncodeBase64Chunk + 1] = 'n';
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (iI1 <= 0) {
            return i5;
        }
        if (this.s > i) {
            f1();
        }
        int i8 = bArr[0] << 16;
        if (1 < iI1) {
            i8 |= (bArr[1] & 255) << 8;
        } else {
            i2 = 1;
        }
        int i9 = i5 + i2;
        this.s = base64Variant.encodeBase64Partial(i8, i2, this.q, this.s);
        return i9;
    }

    public final int l1(Base64Variant base64Variant, InputStream inputStream, byte[] bArr, int i) throws IOException {
        int iI1;
        int i2 = this.t - 6;
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
            if (this.s > i2) {
                f1();
            }
            int i7 = i6 + 2;
            int i8 = ((bArr[i6 + 1] & 255) | (bArr[i6] << 8)) << 8;
            i6 += 3;
            i5 -= 3;
            int iEncodeBase64Chunk = base64Variant.encodeBase64Chunk(i8 | (bArr[i7] & 255), this.q, this.s);
            this.s = iEncodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                char[] cArr = this.q;
                cArr[iEncodeBase64Chunk] = AbstractJsonLexerKt.STRING_ESC;
                this.s = iEncodeBase64Chunk + 2;
                cArr[iEncodeBase64Chunk + 1] = 'n';
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (i5 <= 0 || (iI1 = i1(inputStream, bArr, i6, iI2, i5)) <= 0) {
            return i5;
        }
        if (this.s > i2) {
            f1();
        }
        int i9 = bArr[0] << 16;
        if (1 < iI1) {
            i9 |= (bArr[1] & 255) << 8;
        } else {
            i3 = 1;
        }
        this.s = base64Variant.encodeBase64Partial(i9, i3, this.q, this.s);
        return i5 - i3;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void m0() throws IOException {
        if (!this.e.g()) {
            a("Current context not Object but " + this.e.j());
        }
        r7i r7iVar = this.f7619a;
        if (r7iVar != null) {
            r7iVar.writeEndObject(this, this.e.d());
        } else {
            if (this.s >= this.t) {
                f1();
            }
            char[] cArr = this.q;
            int i = this.s;
            this.s = i + 1;
            cArr[i] = AbstractJsonLexerKt.END_OBJ;
        }
        this.e = this.e.l();
    }

    public final void m1(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException {
        int iEncodeBase64Chunk;
        int i3 = i2 - 3;
        int i4 = this.t - 6;
        int maxLineLength = base64Variant.getMaxLineLength();
        loop0: while (true) {
            int i5 = maxLineLength >> 2;
            do {
                if (i > i3) {
                    break loop0;
                }
                if (this.s > i4) {
                    f1();
                }
                int i6 = i + 2;
                int i7 = ((bArr[i + 1] & 255) | (bArr[i] << 8)) << 8;
                i += 3;
                iEncodeBase64Chunk = base64Variant.encodeBase64Chunk(i7 | (bArr[i6] & 255), this.q, this.s);
                this.s = iEncodeBase64Chunk;
                i5--;
            } while (i5 > 0);
            char[] cArr = this.q;
            cArr[iEncodeBase64Chunk] = AbstractJsonLexerKt.STRING_ESC;
            this.s = iEncodeBase64Chunk + 2;
            cArr[iEncodeBase64Chunk + 1] = 'n';
            maxLineLength = base64Variant.getMaxLineLength();
        }
        int i8 = i2 - i;
        if (i8 > 0) {
            if (this.s > i4) {
                f1();
            }
            int i9 = i + 1;
            int i10 = bArr[i] << 16;
            if (i8 == 2) {
                i10 |= (bArr[i9] & 255) << 8;
            }
            this.s = base64Variant.encodeBase64Partial(i10, i8, this.q, this.s);
        }
    }

    public final void n1(owl owlVar, boolean z) throws IOException {
        if (this.f7619a != null) {
            r1(owlVar, z);
            return;
        }
        if (this.s + 1 >= this.t) {
            f1();
        }
        if (z) {
            char[] cArr = this.q;
            int i = this.s;
            this.s = i + 1;
            cArr[i] = ',';
        }
        char[] cArrAsQuotedChars = owlVar.asQuotedChars();
        if (this.m) {
            I0(cArrAsQuotedChars, 0, cArrAsQuotedChars.length);
            return;
        }
        char[] cArr2 = this.q;
        int i2 = this.s;
        int i3 = i2 + 1;
        this.s = i3;
        cArr2[i2] = this.p;
        int length = cArrAsQuotedChars.length;
        if (i3 + length + 1 < this.t) {
            System.arraycopy(cArrAsQuotedChars, 0, cArr2, i3, length);
            int i4 = this.s + length;
            char[] cArr3 = this.q;
            this.s = i4 + 1;
            cArr3[i4] = this.p;
            return;
        }
        I0(cArrAsQuotedChars, 0, length);
        if (this.s >= this.t) {
            f1();
        }
        char[] cArr4 = this.q;
        int i5 = this.s;
        this.s = i5 + 1;
        cArr4[i5] = this.p;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void o0(owl owlVar) throws IOException {
        int iT = this.e.t(owlVar.getValue());
        if (iT == 4) {
            a("Can not write a field name, expecting a value");
        }
        n1(owlVar, iT == 1);
    }

    public final void o1(String str, boolean z) throws IOException {
        if (this.f7619a != null) {
            s1(str, z);
            return;
        }
        if (this.s + 1 >= this.t) {
            f1();
        }
        if (z) {
            char[] cArr = this.q;
            int i = this.s;
            this.s = i + 1;
            cArr[i] = ',';
        }
        if (this.m) {
            A1(str);
            return;
        }
        char[] cArr2 = this.q;
        int i2 = this.s;
        this.s = i2 + 1;
        cArr2[i2] = this.p;
        A1(str);
        if (this.s >= this.t) {
            f1();
        }
        char[] cArr3 = this.q;
        int i3 = this.s;
        this.s = i3 + 1;
        cArr3[i3] = this.p;
    }

    public final void p1(String str) throws IOException {
        f1();
        int length = str.length();
        int i = 0;
        while (true) {
            int i2 = this.t;
            if (i + i2 > length) {
                i2 = length - i;
            }
            int i3 = i + i2;
            str.getChars(i, i3, this.q, 0);
            if (this.f27156k != null) {
                z1(i2);
            } else {
                int i4 = this.j;
                if (i4 != 0) {
                    y1(i2, i4);
                } else {
                    x1(i2);
                }
            }
            if (i3 >= length) {
                return;
            } else {
                i = i3;
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void r0(String str) throws IOException {
        int iT = this.e.t(str);
        if (iT == 4) {
            a("Can not write a field name, expecting a value");
        }
        o1(str, iT == 1);
    }

    public final void r1(owl owlVar, boolean z) throws IOException {
        if (z) {
            this.f7619a.writeObjectEntrySeparator(this);
        } else {
            this.f7619a.beforeObjectEntries(this);
        }
        char[] cArrAsQuotedChars = owlVar.asQuotedChars();
        if (this.m) {
            I0(cArrAsQuotedChars, 0, cArrAsQuotedChars.length);
            return;
        }
        if (this.s >= this.t) {
            f1();
        }
        char[] cArr = this.q;
        int i = this.s;
        this.s = i + 1;
        cArr[i] = this.p;
        I0(cArrAsQuotedChars, 0, cArrAsQuotedChars.length);
        if (this.s >= this.t) {
            f1();
        }
        char[] cArr2 = this.q;
        int i2 = this.s;
        this.s = i2 + 1;
        cArr2[i2] = this.p;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void s0() throws IOException {
        Z0("write a null");
        q1();
    }

    public final void s1(String str, boolean z) throws IOException {
        if (z) {
            this.f7619a.writeObjectEntrySeparator(this);
        } else {
            this.f7619a.beforeObjectEntries(this);
        }
        if (this.m) {
            A1(str);
            return;
        }
        if (this.s >= this.t) {
            f1();
        }
        char[] cArr = this.q;
        int i = this.s;
        this.s = i + 1;
        cArr[i] = this.p;
        A1(str);
        if (this.s >= this.t) {
            f1();
        }
        char[] cArr2 = this.q;
        int i2 = this.s;
        this.s = i2 + 1;
        cArr2[i2] = this.p;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void t0(double d) throws IOException {
        if (this.d || (a1(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS) && (Double.isNaN(d) || Double.isInfinite(d)))) {
            Q0(String.valueOf(d));
        } else {
            Z0("write a number");
            H0(String.valueOf(d));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void u0(float f) throws IOException {
        if (this.d || (a1(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS) && (Float.isNaN(f) || Float.isInfinite(f)))) {
            Q0(String.valueOf(f));
        } else {
            Z0("write a number");
            H0(String.valueOf(f));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void v0(int i) throws IOException {
        Z0("write a number");
        if (this.d) {
            t1(i);
            return;
        }
        if (this.s + 11 >= this.t) {
            f1();
        }
        this.s = o2h.p(i, this.q, this.s);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void w0(long j) throws IOException {
        Z0("write a number");
        if (this.d) {
            u1(j);
            return;
        }
        if (this.s + 21 >= this.t) {
            f1();
        }
        this.s = o2h.r(j, this.q, this.s);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void x0(String str) throws IOException {
        Z0("write a number");
        if (this.d) {
            v1(str);
        } else {
            H0(str);
        }
    }

    public final void x1(int i) throws IOException {
        char[] cArr;
        char c;
        int[] iArr = this.i;
        int length = iArr.length;
        int i2 = 0;
        int iG1 = 0;
        while (i2 < i) {
            do {
                cArr = this.q;
                c = cArr[i2];
                if (c < length && iArr[c] != 0) {
                    break;
                } else {
                    i2++;
                }
            } while (i2 < i);
            int i3 = i2 - iG1;
            if (i3 > 0) {
                this.o.write(cArr, iG1, i3);
                if (i2 >= i) {
                    return;
                }
            }
            i2++;
            iG1 = g1(this.q, i2, i, c, iArr[c]);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void y0(BigDecimal bigDecimal) throws IOException {
        Z0("write a number");
        if (bigDecimal == null) {
            q1();
        } else if (this.d) {
            v1(W0(bigDecimal));
        } else {
            H0(W0(bigDecimal));
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d A[PHI: r4
      0x001d: PHI (r4v5 int) = (r4v2 int), (r4v6 int) binds: [B:9:0x0019, B:7:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    public final void y1(int i, int i2) throws IOException {
        char[] cArr;
        char c;
        int[] iArr = this.i;
        int iMin = Math.min(iArr.length, i2 + 1);
        int i3 = 0;
        int iG1 = 0;
        int i4 = 0;
        while (i3 < i) {
            do {
                cArr = this.q;
                c = cArr[i3];
                if (c < iMin) {
                    i4 = iArr[c];
                    if (i4 != 0) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    if (c > i2) {
                        i4 = -1;
                        break;
                    }
                    i3++;
                }
            } while (i3 < i);
            int i5 = i3 - iG1;
            if (i5 > 0) {
                this.o.write(cArr, iG1, i5);
                if (i3 >= i) {
                    return;
                }
            }
            i3++;
            iG1 = g1(this.q, i3, i, c, i4);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void z0(BigInteger bigInteger) throws IOException {
        Z0("write a number");
        if (bigInteger == null) {
            q1();
        } else if (this.d) {
            v1(bigInteger.toString());
        } else {
            H0(bigInteger.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0031 A[PHI: r6
      0x0031: PHI (r6v6 int) = (r6v2 int), (r6v7 int) binds: [B:15:0x002d, B:10:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    public final void z1(int i) throws IOException {
        char c;
        int[] iArr = this.i;
        int i2 = this.j;
        if (i2 < 1) {
            i2 = 65535;
        }
        int iMin = Math.min(iArr.length, i2 + 1);
        CharacterEscapes characterEscapes = this.f27156k;
        int i3 = 0;
        int iG1 = 0;
        int i4 = 0;
        while (i3 < i) {
            do {
                c = this.q[i3];
                if (c < iMin) {
                    i4 = iArr[c];
                    if (i4 != 0) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    if (c > i2) {
                        i4 = -1;
                        break;
                    }
                    owl escapeSequence = characterEscapes.getEscapeSequence(c);
                    this.v = escapeSequence;
                    if (escapeSequence != null) {
                        i4 = -2;
                        break;
                    }
                    i3++;
                }
            } while (i3 < i);
            int i5 = i3 - iG1;
            if (i5 > 0) {
                this.o.write(this.q, iG1, i5);
                if (i3 >= i) {
                    return;
                }
            }
            i3++;
            iG1 = g1(this.q, i3, i, c, i4);
        }
    }
}
