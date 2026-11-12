package io.sentry.vendor.gson.stream;

import io.netty.util.internal.StringUtil;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.internal._BufferKt;
import org.jetbrains.annotations.ApiStatus;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Reader f21913a;
    public long i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f21915k;
    public int[] l;
    public String[] n;
    public int[] o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f21914b = false;
    public final char[] c = new char[1024];
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;
    public int m = 1;

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.l = iArr;
        iArr[0] = 6;
        this.n = new String[32];
        this.o = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f21913a = reader;
    }

    public void D() throws IOException {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 7) {
            this.h = 0;
            int[] iArr = this.o;
            int i = this.m - 1;
            iArr[i] = iArr[i] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + peek() + p());
    }

    public final String E(char c) throws IOException {
        int i;
        char[] cArr = this.c;
        StringBuilder sb = null;
        do {
            int i2 = this.d;
            int i3 = this.e;
            while (true) {
                int i4 = i3;
                i = i2;
                while (true) {
                    if (i2 < i4) {
                        int i5 = i2 + 1;
                        char c2 = cArr[i2];
                        if (c2 == c) {
                            this.d = i5;
                            int i6 = (i5 - i) - 1;
                            if (sb == null) {
                                return new String(cArr, i, i6);
                            }
                            sb.append(cArr, i, i6);
                            return sb.toString();
                        }
                        if (c2 == '\\') {
                            this.d = i5;
                            int i7 = i5 - i;
                            int i8 = i7 - 1;
                            if (sb == null) {
                                sb = new StringBuilder(Math.max(i7 * 2, 16));
                            }
                            sb.append(cArr, i, i8);
                            sb.append(O());
                            i2 = this.d;
                            i3 = this.e;
                        } else {
                            if (c2 == '\n') {
                                this.f++;
                                this.g = i5;
                            }
                            i2 = i5;
                        }
                    }
                }
            }
            if (sb == null) {
                sb = new StringBuilder(Math.max((i2 - i) * 2, 16));
            }
            sb.append(cArr, i, i2 - i);
            this.d = i2;
        } while (m(1));
        throw T("Unterminated string");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    public final String J() throws IOException {
        String string;
        StringBuilder sb = null;
        int i = 0;
        while (true) {
            int i2 = 0;
            while (true) {
                int i3 = this.d;
                if (i3 + i2 < this.e) {
                    char c = this.c[i3 + i2];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        b();
                    }
                    i = i2;
                } else if (i2 >= this.c.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i2, 16));
                    }
                    sb.append(this.c, this.d, i2);
                    this.d += i2;
                    if (!m(1)) {
                    }
                } else if (!m(i2 + 1)) {
                    i = i2;
                }
                if (sb == null) {
                    string = new String(this.c, this.d, i);
                } else {
                    sb.append(this.c, this.d, i);
                    string = sb.toString();
                }
                this.d += i;
                return string;
            }
        }
    }

    public final int K() throws IOException {
        String str;
        String str2;
        int i;
        char c = this.c[this.d];
        if (c == 't' || c == 'T') {
            str = "true";
            str2 = "TRUE";
            i = 5;
        } else if (c == 'f' || c == 'F') {
            str = "false";
            str2 = "FALSE";
            i = 6;
        } else {
            if (c != 'n' && c != 'N') {
                return 0;
            }
            str = AbstractJsonLexerKt.NULL;
            str2 = "NULL";
            i = 7;
        }
        int length = str.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.d + i2 >= this.e && !m(i2 + 1)) {
                return 0;
            }
            char c2 = this.c[this.d + i2];
            if (c2 != str.charAt(i2) && c2 != str2.charAt(i2)) {
                return 0;
            }
        }
        if ((this.d + length < this.e || m(length + 1)) && o(this.c[this.d + length])) {
            return 0;
        }
        this.d += length;
        this.h = i;
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    /* JADX WARN: Code duplicated, block: B:90:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:92:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:97:0x00ec  */
    public final int M() throws IOException {
        char c;
        char c2;
        char[] cArr = this.c;
        int i = this.d;
        int i2 = this.e;
        int i3 = 0;
        int i4 = 0;
        char c3 = 0;
        boolean z = false;
        boolean z2 = true;
        long j = 0;
        while (true) {
            if (i + i4 != i2) {
                c = cArr[i + i4];
                if (c != '+') {
                    if (c != 'E' || c == 'e') {
                        i3 = 0;
                        if (c3 == 2 && c3 != 4) {
                            return 0;
                        }
                        c3 = 5;
                    } else if (c != '-') {
                        c2 = 3;
                        if (c == '.') {
                            i3 = 0;
                            if (c3 != 2) {
                                return 0;
                            }
                        } else {
                            if (c < '0' || c > '9') {
                                if (!o(c)) {
                                    break;
                                }
                                return 0;
                            }
                            if (c3 == 1 || c3 == 0) {
                                j = -(c - '0');
                                c3 = 2;
                            } else if (c3 == 2) {
                                if (j == 0) {
                                    return 0;
                                }
                                long j2 = (10 * j) - ((long) (c - '0'));
                                z2 &= j > _BufferKt.OVERFLOW_ZONE || (j == _BufferKt.OVERFLOW_ZONE && j2 < j);
                                j = j2;
                            } else if (c3 == 3) {
                                i3 = 0;
                                c3 = 4;
                            } else if (c3 == 5 || c3 == 6) {
                                i3 = 0;
                                c3 = 7;
                            }
                            i3 = 0;
                        }
                    } else {
                        c2 = 6;
                        i3 = 0;
                        if (c3 == 0) {
                            c3 = 1;
                            z = true;
                        } else if (c3 != 5) {
                            return 0;
                        }
                    }
                    i4++;
                } else {
                    c2 = 6;
                    i3 = 0;
                    if (c3 != 5) {
                        return 0;
                    }
                }
                c3 = c2;
                i4++;
            } else {
                if (i4 == cArr.length) {
                    return i3;
                }
                if (!m(i4 + 1)) {
                    break;
                }
                i = this.d;
                i2 = this.e;
                c = cArr[i + i4];
                if (c != '+') {
                    if (c != 'E') {
                        i3 = 0;
                        if (c3 == 2) {
                        }
                        c3 = 5;
                    } else {
                        i3 = 0;
                        if (c3 == 2) {
                        }
                        c3 = 5;
                    }
                    i4++;
                } else {
                    c2 = 6;
                    i3 = 0;
                    if (c3 != 5) {
                        return 0;
                    }
                }
                c3 = c2;
                i4++;
            }
        }
        if (c3 == 2 && z2 && ((j != Long.MIN_VALUE || z) && (j != 0 || !z))) {
            if (!z) {
                j = -j;
            }
            this.i = j;
            this.d += i4;
            this.h = 15;
            return 15;
        }
        if (c3 != 2 && c3 != 4 && c3 != 7) {
            return 0;
        }
        this.j = i4;
        this.h = 16;
        return 16;
    }

    public final void N(int i) {
        int i2 = this.m;
        int[] iArr = this.l;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.l = Arrays.copyOf(iArr, i3);
            this.o = Arrays.copyOf(this.o, i3);
            this.n = (String[]) Arrays.copyOf(this.n, i3);
        }
        int[] iArr2 = this.l;
        int i4 = this.m;
        this.m = i4 + 1;
        iArr2[i4] = i;
    }

    public final char O() throws IOException {
        int i;
        if (this.d == this.e && !m(1)) {
            throw T("Unterminated escape sequence");
        }
        char[] cArr = this.c;
        int i2 = this.d;
        int i3 = i2 + 1;
        this.d = i3;
        char c = cArr[i2];
        if (c == '\n') {
            this.f++;
            this.g = i3;
        } else if (c != '\"' && c != '\'' && c != '/' && c != '\\') {
            if (c == 'b') {
                return '\b';
            }
            if (c == 'f') {
                return '\f';
            }
            if (c == 'n') {
                return '\n';
            }
            if (c == 'r') {
                return StringUtil.CARRIAGE_RETURN;
            }
            if (c == 't') {
                return '\t';
            }
            if (c != 'u') {
                throw T("Invalid escape sequence");
            }
            if (i2 + 5 > this.e && !m(4)) {
                throw T("Unterminated escape sequence");
            }
            int i4 = this.d;
            int i5 = i4 + 4;
            char c2 = 0;
            while (i4 < i5) {
                char c3 = this.c[i4];
                char c4 = (char) (c2 << 4);
                if (c3 >= '0' && c3 <= '9') {
                    i = c3 - '0';
                } else if (c3 >= 'a' && c3 <= 'f') {
                    i = c3 - 'W';
                } else {
                    if (c3 < 'A' || c3 > 'F') {
                        throw new NumberFormatException("\\u" + new String(this.c, this.d, 4));
                    }
                    i = c3 - '7';
                }
                c2 = (char) (c4 + i);
                i4++;
            }
            this.d += 4;
            return c2;
        }
        return c;
    }

    public final void P(char c) throws IOException {
        char[] cArr = this.c;
        do {
            int i = this.d;
            int i2 = this.e;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.d = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.d = i3;
                    O();
                    i = this.d;
                    i2 = this.e;
                } else {
                    if (c2 == '\n') {
                        this.f++;
                        this.g = i3;
                    }
                    i = i3;
                }
            }
            this.d = i;
        } while (m(1));
        throw T("Unterminated string");
    }

    public final boolean Q(String str) throws IOException {
        int length = str.length();
        while (true) {
            if (this.d + length > this.e && !m(length)) {
                return false;
            }
            char[] cArr = this.c;
            int i = this.d;
            if (cArr[i] != '\n') {
                for (int i2 = 0; i2 < length; i2++) {
                    if (this.c[this.d + i2] == str.charAt(i2)) {
                    }
                }
                return true;
            }
            this.f++;
            this.g = i + 1;
            this.d++;
        }
    }

    public final void R() throws IOException {
        char c;
        do {
            if (this.d >= this.e && !m(1)) {
                return;
            }
            char[] cArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            c = cArr[i];
            if (c == '\n') {
                this.f++;
                this.g = i2;
                return;
            }
        } while (c != '\r');
    }

    public final void S() throws IOException {
        do {
            int i = 0;
            while (true) {
                int i2 = this.d;
                if (i2 + i < this.e) {
                    char c = this.c[i2 + i];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        b();
                    }
                    this.d += i;
                    return;
                }
                this.d = i2 + i;
            }
        } while (m(1));
    }

    public final IOException T(String str) throws IOException {
        throw new MalformedJsonException(str + p());
    }

    public void a() throws IOException {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 3) {
            N(1);
            this.o[this.m - 1] = 0;
            this.h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + peek() + p());
        }
    }

    public final void b() throws IOException {
        if (!this.f21914b) {
            throw T("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    public void beginObject() throws IOException {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 1) {
            N(3);
            this.h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + peek() + p());
        }
    }

    public final void c() throws IOException {
        y(true);
        int i = this.d;
        int i2 = i - 1;
        this.d = i2;
        if (i + 4 <= this.e || m(5)) {
            char[] cArr = this.c;
            if (cArr[i2] == ')' && cArr[i] == ']' && cArr[i + 1] == '}' && cArr[i + 2] == '\'' && cArr[i + 3] == '\n') {
                this.d += 5;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.h = 0;
        this.l[0] = 8;
        this.m = 1;
        this.f21913a.close();
    }

    public int d() throws IOException {
        int iY;
        int[] iArr = this.l;
        int i = this.m;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int iY2 = y(true);
            if (iY2 != 44) {
                if (iY2 != 59) {
                    if (iY2 != 93) {
                        throw T("Unterminated array");
                    }
                    this.h = 4;
                    return 4;
                }
                b();
            }
        } else {
            if (i2 == 3 || i2 == 5) {
                iArr[i - 1] = 4;
                if (i2 == 5 && (iY = y(true)) != 44) {
                    if (iY != 59) {
                        if (iY != 125) {
                            throw T("Unterminated object");
                        }
                        this.h = 2;
                        return 2;
                    }
                    b();
                }
                int iY3 = y(true);
                if (iY3 == 34) {
                    this.h = 13;
                    return 13;
                }
                if (iY3 == 39) {
                    b();
                    this.h = 12;
                    return 12;
                }
                if (iY3 == 125) {
                    if (i2 == 5) {
                        throw T("Expected name");
                    }
                    this.h = 2;
                    return 2;
                }
                b();
                this.d--;
                if (!o((char) iY3)) {
                    throw T("Expected name");
                }
                this.h = 14;
                return 14;
            }
            if (i2 == 4) {
                iArr[i - 1] = 5;
                int iY4 = y(true);
                if (iY4 != 58) {
                    if (iY4 != 61) {
                        throw T("Expected ':'");
                    }
                    b();
                    if (this.d < this.e || m(1)) {
                        char[] cArr = this.c;
                        int i3 = this.d;
                        if (cArr[i3] == '>') {
                            this.d = i3 + 1;
                        }
                    }
                }
            } else if (i2 == 6) {
                if (this.f21914b) {
                    c();
                }
                this.l[this.m - 1] = 7;
            } else if (i2 == 7) {
                if (y(false) == -1) {
                    this.h = 17;
                    return 17;
                }
                b();
                this.d--;
            } else if (i2 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iY5 = y(true);
        if (iY5 == 34) {
            this.h = 9;
            return 9;
        }
        if (iY5 == 39) {
            b();
            this.h = 8;
            return 8;
        }
        if (iY5 != 44 && iY5 != 59) {
            if (iY5 == 91) {
                this.h = 3;
                return 3;
            }
            if (iY5 != 93) {
                if (iY5 == 123) {
                    this.h = 1;
                    return 1;
                }
                this.d--;
                int iK = K();
                if (iK != 0) {
                    return iK;
                }
                int iM = M();
                if (iM != 0) {
                    return iM;
                }
                if (!o(this.c[this.d])) {
                    throw T("Expected value");
                }
                b();
                this.h = 10;
                return 10;
            }
            if (i2 == 1) {
                this.h = 4;
                return 4;
            }
        }
        if (i2 != 1 && i2 != 2) {
            throw T("Unexpected value");
        }
        b();
        this.d--;
        this.h = 7;
        return 7;
    }

    public void endObject() throws IOException {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + peek() + p());
        }
        int i = this.m;
        int i2 = i - 1;
        this.m = i2;
        this.n[i2] = null;
        int[] iArr = this.o;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.h = 0;
    }

    public String getPath() {
        StringBuilder sb = new StringBuilder();
        sb.append(Typography.dollar);
        int i = this.m;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.l[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append(AbstractJsonLexerKt.BEGIN_LIST);
                sb.append(this.o[i2]);
                sb.append(AbstractJsonLexerKt.END_LIST);
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = this.n[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public void l() throws IOException {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + peek() + p());
        }
        int i = this.m;
        this.m = i - 1;
        int[] iArr = this.o;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.h = 0;
    }

    public final boolean m(int i) throws IOException {
        int i2;
        int i3;
        char[] cArr = this.c;
        int i4 = this.g;
        int i5 = this.d;
        this.g = i4 - i5;
        int i6 = this.e;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.e = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.e = 0;
        }
        this.d = 0;
        do {
            Reader reader = this.f21913a;
            int i8 = this.e;
            int i9 = reader.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.e + i9;
            this.e = i2;
            if (this.f == 0 && (i3 = this.g) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.d++;
                this.g = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    public boolean n() throws IOException {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        return (iD == 2 || iD == 4) ? false : true;
    }

    public double nextDouble() throws IOException {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 15) {
            this.h = 0;
            int[] iArr = this.o;
            int i = this.m - 1;
            iArr[i] = iArr[i] + 1;
            return this.i;
        }
        if (iD == 16) {
            this.f21915k = new String(this.c, this.d, this.j);
            this.d += this.j;
        } else if (iD == 8 || iD == 9) {
            this.f21915k = E(iD == 8 ? '\'' : '\"');
        } else if (iD == 10) {
            this.f21915k = J();
        } else if (iD != 11) {
            throw new IllegalStateException("Expected a double but was " + peek() + p());
        }
        this.h = 11;
        double d = Double.parseDouble(this.f21915k);
        if (!this.f21914b && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + d + p());
        }
        this.f21915k = null;
        this.h = 0;
        int[] iArr2 = this.o;
        int i2 = this.m - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    public int nextInt() throws IOException {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 15) {
            long j = this.i;
            int i = (int) j;
            if (j == i) {
                this.h = 0;
                int[] iArr = this.o;
                int i2 = this.m - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new NumberFormatException("Expected an int but was " + this.i + p());
        }
        if (iD == 16) {
            this.f21915k = new String(this.c, this.d, this.j);
            this.d += this.j;
        } else {
            if (iD != 8 && iD != 9 && iD != 10) {
                throw new IllegalStateException("Expected an int but was " + peek() + p());
            }
            if (iD == 10) {
                this.f21915k = J();
            } else {
                this.f21915k = E(iD == 8 ? '\'' : '\"');
            }
            try {
                int i3 = Integer.parseInt(this.f21915k);
                this.h = 0;
                int[] iArr2 = this.o;
                int i4 = this.m - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        }
        this.h = 11;
        double d = Double.parseDouble(this.f21915k);
        int i5 = (int) d;
        if (i5 != d) {
            throw new NumberFormatException("Expected an int but was " + this.f21915k + p());
        }
        this.f21915k = null;
        this.h = 0;
        int[] iArr3 = this.o;
        int i6 = this.m - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    public long nextLong() throws IOException {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 15) {
            this.h = 0;
            int[] iArr = this.o;
            int i = this.m - 1;
            iArr[i] = iArr[i] + 1;
            return this.i;
        }
        if (iD == 16) {
            this.f21915k = new String(this.c, this.d, this.j);
            this.d += this.j;
        } else {
            if (iD != 8 && iD != 9 && iD != 10) {
                throw new IllegalStateException("Expected a long but was " + peek() + p());
            }
            if (iD == 10) {
                this.f21915k = J();
            } else {
                this.f21915k = E(iD == 8 ? '\'' : '\"');
            }
            try {
                long j = Long.parseLong(this.f21915k);
                this.h = 0;
                int[] iArr2 = this.o;
                int i2 = this.m - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        }
        this.h = 11;
        double d = Double.parseDouble(this.f21915k);
        long j2 = (long) d;
        if (j2 != d) {
            throw new NumberFormatException("Expected a long but was " + this.f21915k + p());
        }
        this.f21915k = null;
        this.h = 0;
        int[] iArr3 = this.o;
        int i3 = this.m - 1;
        iArr3[i3] = iArr3[i3] + 1;
        return j2;
    }

    public String nextName() throws IOException {
        String strE;
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 14) {
            strE = J();
        } else if (iD == 12) {
            strE = E('\'');
        } else {
            if (iD != 13) {
                throw new IllegalStateException("Expected a name but was " + peek() + p());
            }
            strE = E('\"');
        }
        this.h = 0;
        this.n[this.m - 1] = strE;
        return strE;
    }

    public String nextString() throws IOException {
        String str;
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 10) {
            str = J();
        } else if (iD == 8) {
            str = E('\'');
        } else if (iD == 9) {
            str = E('\"');
        } else if (iD == 11) {
            str = this.f21915k;
            this.f21915k = null;
        } else if (iD == 15) {
            str = Long.toString(this.i);
        } else {
            if (iD != 16) {
                throw new IllegalStateException("Expected a string but was " + peek() + p());
            }
            str = new String(this.c, this.d, this.j);
            this.d += this.j;
        }
        this.h = 0;
        int[] iArr = this.o;
        int i = this.m - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    public final boolean o(char c) throws IOException {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        b();
        return false;
    }

    public String p() {
        return " at line " + (this.f + 1) + " column " + ((this.d - this.g) + 1) + " path " + getPath();
    }

    public JsonToken peek() throws IOException {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        switch (iD) {
            case 1:
                return JsonToken.BEGIN_OBJECT;
            case 2:
                return JsonToken.END_OBJECT;
            case 3:
                return JsonToken.BEGIN_ARRAY;
            case 4:
                return JsonToken.END_ARRAY;
            case 5:
            case 6:
                return JsonToken.BOOLEAN;
            case 7:
                return JsonToken.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonToken.STRING;
            case 12:
            case 13:
            case 14:
                return JsonToken.NAME;
            case 15:
            case 16:
                return JsonToken.NUMBER;
            case 17:
                return JsonToken.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public boolean s() throws IOException {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 5) {
            this.h = 0;
            int[] iArr = this.o;
            int i = this.m - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iD == 6) {
            this.h = 0;
            int[] iArr2 = this.o;
            int i2 = this.m - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + peek() + p());
    }

    public final void setLenient(boolean z) {
        this.f21914b = z;
    }

    public void skipValue() throws IOException {
        int i = 0;
        do {
            int iD = this.h;
            if (iD == 0) {
                iD = d();
            }
            if (iD == 3) {
                N(1);
            } else {
                if (iD == 1) {
                    N(3);
                } else if (iD == 4 || iD == 2) {
                    this.m--;
                    i--;
                } else if (iD == 14 || iD == 10) {
                    S();
                } else if (iD == 8 || iD == 12) {
                    P('\'');
                } else if (iD == 9 || iD == 13) {
                    P('\"');
                } else if (iD == 16) {
                    this.d += this.j;
                }
                this.h = 0;
            }
            i++;
            this.h = 0;
        } while (i != 0);
        int[] iArr = this.o;
        int i2 = this.m;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.n[i2 - 1] = AbstractJsonLexerKt.NULL;
    }

    public String toString() {
        return getClass().getSimpleName() + p();
    }

    public final int y(boolean z) throws IOException {
        char[] cArr = this.c;
        int i = this.d;
        int i2 = this.e;
        while (true) {
            if (i == i2) {
                this.d = i;
                if (!m(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input" + p());
                }
                i = this.d;
                i2 = this.e;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.f++;
                this.g = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.d = i3;
                    if (i3 == i2) {
                        this.d = i;
                        boolean zM = m(2);
                        this.d++;
                        if (!zM) {
                            return c;
                        }
                    }
                    b();
                    int i4 = this.d;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.d = i4 + 1;
                        if (!Q("*/")) {
                            throw T("Unterminated comment");
                        }
                        i = this.d + 2;
                        i2 = this.e;
                    } else {
                        if (c2 != '/') {
                            return c;
                        }
                        this.d = i4 + 1;
                        R();
                        i = this.d;
                        i2 = this.e;
                    }
                } else {
                    if (c != '#') {
                        this.d = i3;
                        return c;
                    }
                    this.d = i3;
                    b();
                    R();
                    i = this.d;
                    i2 = this.e;
                }
            }
            i = i3;
        }
    }
}
