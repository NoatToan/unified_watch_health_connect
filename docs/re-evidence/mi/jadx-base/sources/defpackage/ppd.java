package defpackage;

import com.nimbusds.jose.shaded.json.parser.ParseException;
import io.netty.util.internal.StringUtil;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.internal._BufferKt;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ppd {
    public static boolean[] t;
    public static boolean[] u;
    public static boolean[] v;
    public static boolean[] w;
    public static boolean[] x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char f30607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vtd f30608b;
    public String c;
    public final a d = new a(15);
    public Object e;
    public String f;
    public int g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f30609k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f30610r;
    public final boolean s;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public char[] f30611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f30612b = -1;

        public a(int i) {
            this.f30611a = new char[i];
        }

        public void a(char c) {
            int i = this.f30612b + 1;
            this.f30612b = i;
            char[] cArr = this.f30611a;
            if (cArr.length <= i) {
                char[] cArr2 = new char[(cArr.length * 2) + 1];
                System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
                this.f30611a = cArr2;
            }
            this.f30611a[this.f30612b] = c;
        }

        public void b() {
            this.f30612b = -1;
        }

        public String toString() {
            return new String(this.f30611a, 0, this.f30612b + 1);
        }
    }

    static {
        boolean[] zArr = new boolean[126];
        t = zArr;
        boolean[] zArr2 = new boolean[126];
        u = zArr2;
        boolean[] zArr3 = new boolean[126];
        v = zArr3;
        boolean[] zArr4 = new boolean[126];
        w = zArr4;
        boolean[] zArr5 = new boolean[126];
        x = zArr5;
        zArr3[26] = true;
        zArr3[58] = true;
        zArr4[26] = true;
        zArr4[125] = true;
        zArr4[44] = true;
        zArr2[26] = true;
        zArr2[93] = true;
        zArr2[44] = true;
        zArr5[26] = true;
        zArr[58] = true;
        zArr[44] = true;
        zArr[26] = true;
        zArr[125] = true;
        zArr[93] = true;
    }

    public ppd(int i) {
        this.i = (i & 4) > 0;
        this.j = (i & 2) > 0;
        this.f30609k = (i & 1) > 0;
        this.o = (i & 8) > 0;
        this.q = (i & 16) > 0;
        this.h = (i & 32) > 0;
        this.l = (i & 64) > 0;
        this.p = (i & 128) > 0;
        this.m = (i & 768) != 768;
        this.n = (i & 512) == 0;
        this.f30610r = (i & 1024) > 0;
        this.s = (i & 2048) > 0;
    }

    public void a() throws ParseException {
        if (this.o) {
            return;
        }
        int length = this.f.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = this.f.charAt(i);
            if (cCharAt >= 0) {
                if (cCharAt <= 31) {
                    throw new ParseException(this.g + i, 0, Character.valueOf(cCharAt));
                }
                if (cCharAt == 127 && this.f30610r) {
                    throw new ParseException(this.g + i, 0, Character.valueOf(cCharAt));
                }
            }
        }
    }

    public void b() throws ParseException {
        int length = this.f.length();
        if (length == 1) {
            return;
        }
        if (length == 2) {
            if (this.f.equals("00")) {
                throw new ParseException(this.g, 6, this.f);
            }
            return;
        }
        char cCharAt = this.f.charAt(0);
        char cCharAt2 = this.f.charAt(1);
        if (cCharAt != '-') {
            if (cCharAt == '0' && cCharAt2 >= '0' && cCharAt2 <= '9') {
                throw new ParseException(this.g, 6, this.f);
            }
            return;
        }
        char cCharAt3 = this.f.charAt(2);
        if (cCharAt2 == '0' && cCharAt3 >= '0' && cCharAt3 <= '9') {
            throw new ParseException(this.g, 6, this.f);
        }
    }

    public Number c() throws ParseException {
        if (!this.h) {
            b();
        }
        try {
            if (!this.p) {
                return Float.valueOf(Float.parseFloat(this.f));
            }
            if (this.f.length() <= 18) {
                return Double.valueOf(Double.parseDouble(this.f));
            }
            BigDecimal bigDecimal = new BigDecimal(this.f);
            if (this.s) {
                return bigDecimal;
            }
            double d = Double.parseDouble(this.f);
            return String.valueOf(d).equals(this.f) ? Double.valueOf(d) : bigDecimal;
        } catch (NumberFormatException unused) {
            throw new ParseException(this.g, 1, this.f);
        }
    }

    public <T> T d(wtd<T> wtdVar) throws ParseException {
        this.g = -1;
        try {
            f();
            T t2 = (T) h(wtdVar);
            if (this.m) {
                if (!this.n) {
                    t();
                }
                if (this.f30607a != 26) {
                    throw new ParseException(this.g - 1, 1, Character.valueOf(this.f30607a));
                }
            }
            this.f = null;
            this.e = null;
            return t2;
        } catch (IOException e) {
            throw new ParseException(this.g, e);
        }
    }

    public Number e(String str) throws ParseException {
        int i;
        int i2;
        int length = str.length();
        boolean z = false;
        if (str.charAt(0) == '-') {
            if (!this.h && length >= 3 && str.charAt(1) == '0') {
                throw new ParseException(this.g, 6, str);
            }
            i = 20;
            i2 = 1;
        } else {
            if (!this.h && length >= 2 && str.charAt(0) == '0') {
                throw new ParseException(this.g, 6, str);
            }
            i = 19;
            i2 = 0;
        }
        int i3 = i2;
        if (length >= i) {
            if (length > i) {
                return new BigInteger(str, 10);
            }
            length--;
            z = true;
        }
        long jCharAt = 0;
        while (i2 < length) {
            jCharAt = (jCharAt * 10) + ((long) ('0' - str.charAt(i2)));
            i2++;
        }
        if (z) {
            if (jCharAt <= _BufferKt.OVERFLOW_ZONE) {
                if (jCharAt >= _BufferKt.OVERFLOW_ZONE) {
                    if (i3 != 0) {
                    }
                }
                return new BigInteger(str, 10);
            }
            jCharAt = (jCharAt * 10) + ((long) ('0' - str.charAt(i2)));
        }
        if (i3 != 0) {
            return (!this.q || jCharAt < -2147483648L) ? Long.valueOf(jCharAt) : Integer.valueOf((int) jCharAt);
        }
        long j = -jCharAt;
        return (!this.q || j > 2147483647L) ? Long.valueOf(j) : Integer.valueOf((int) j);
    }

    public abstract void f() throws IOException;

    public <T> T g(wtd<T> wtdVar) throws ParseException, IOException {
        char c;
        Object objC = wtdVar.c();
        if (this.f30607a != '[') {
            throw new RuntimeException("Internal Error");
        }
        f();
        if (this.f30607a == ',' && !this.l) {
            throw new ParseException(this.g, 0, Character.valueOf(this.f30607a));
        }
        while (true) {
            boolean z = false;
            while (true) {
                c = this.f30607a;
                if (c != '\t' && c != '\n' && c != '\r') {
                    if (c == 26) {
                        throw new ParseException(this.g - 1, 3, "EOF");
                    }
                    if (c != ' ') {
                        if (c != ',') {
                            break;
                        }
                        if (z && !this.l) {
                            throw new ParseException(this.g, 0, Character.valueOf(this.f30607a));
                        }
                        f();
                        z = true;
                    }
                }
                f();
            }
            if (c != ':') {
                if (c == ']') {
                    if (z && !this.l) {
                        throw new ParseException(this.g, 0, Character.valueOf(this.f30607a));
                    }
                    f();
                    return wtdVar.b(objC);
                }
                if (c != '}') {
                    wtdVar.a(objC, i(wtdVar, u));
                }
            }
            throw new ParseException(this.g, 0, Character.valueOf(this.f30607a));
        }
    }

    public <T> T h(wtd<T> wtdVar) throws ParseException, IOException {
        while (true) {
            char c = this.f30607a;
            if (c != '\t' && c != '\n') {
                switch (c) {
                    case '\r':
                    case ' ':
                        break;
                    case '\"':
                    case '\'':
                        o();
                        return wtdVar.b(this.f);
                    case '-':
                        Object objL = l(x);
                        this.e = objL;
                        return wtdVar.b(objL);
                    case 'N':
                        j(x);
                        if (!this.i) {
                            throw new ParseException(this.g, 1, this.f);
                        }
                        if ("NaN".equals(this.f)) {
                            return wtdVar.b(Float.valueOf(Float.NaN));
                        }
                        if (this.j) {
                            return wtdVar.b(this.f);
                        }
                        throw new ParseException(this.g, 1, this.f);
                    case '[':
                        return (T) g(wtdVar);
                    case ']':
                    case '}':
                        break;
                    case 'f':
                        j(x);
                        if ("false".equals(this.f)) {
                            return wtdVar.b(Boolean.FALSE);
                        }
                        if (this.j) {
                            return wtdVar.b(this.f);
                        }
                        throw new ParseException(this.g, 1, this.f);
                    case 'n':
                        j(x);
                        if (AbstractJsonLexerKt.NULL.equals(this.f)) {
                            return null;
                        }
                        if (this.j) {
                            return wtdVar.b(this.f);
                        }
                        throw new ParseException(this.g, 1, this.f);
                    case 't':
                        j(x);
                        if ("true".equals(this.f)) {
                            return wtdVar.b(Boolean.TRUE);
                        }
                        if (this.j) {
                            return wtdVar.b(this.f);
                        }
                        throw new ParseException(this.g, 1, this.f);
                    case '{':
                        return (T) m(wtdVar);
                    default:
                        switch (c) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                Object objL2 = l(x);
                                this.e = objL2;
                                return wtdVar.b(objL2);
                            case ':':
                                break;
                            default:
                                j(x);
                                if (this.j) {
                                    return wtdVar.b(this.f);
                                }
                                throw new ParseException(this.g, 1, this.f);
                        }
                        break;
                }
            }
            f();
        }
        throw new ParseException(this.g, 0, Character.valueOf(this.f30607a));
    }

    public Object i(wtd<?> wtdVar, boolean[] zArr) throws ParseException, IOException {
        while (true) {
            char c = this.f30607a;
            if (c != '\t' && c != '\n') {
                switch (c) {
                    case '\r':
                    case ' ':
                        break;
                    case '\"':
                    case '\'':
                        o();
                        return this.f;
                    case '-':
                        return l(zArr);
                    case 'N':
                        j(zArr);
                        if (!this.i) {
                            throw new ParseException(this.g, 1, this.f);
                        }
                        if ("NaN".equals(this.f)) {
                            return Float.valueOf(Float.NaN);
                        }
                        if (this.j) {
                            return this.f;
                        }
                        throw new ParseException(this.g, 1, this.f);
                    case '[':
                        return g(wtdVar.f(this.c));
                    case ']':
                    case '}':
                        break;
                    case 'f':
                        j(zArr);
                        if ("false".equals(this.f)) {
                            return Boolean.FALSE;
                        }
                        if (this.j) {
                            return this.f;
                        }
                        throw new ParseException(this.g, 1, this.f);
                    case 'n':
                        j(zArr);
                        if (AbstractJsonLexerKt.NULL.equals(this.f)) {
                            return null;
                        }
                        if (this.j) {
                            return this.f;
                        }
                        throw new ParseException(this.g, 1, this.f);
                    case 't':
                        j(zArr);
                        if ("true".equals(this.f)) {
                            return Boolean.TRUE;
                        }
                        if (this.j) {
                            return this.f;
                        }
                        throw new ParseException(this.g, 1, this.f);
                    case '{':
                        return m(wtdVar.g(this.c));
                    default:
                        switch (c) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                return l(zArr);
                            case ':':
                                break;
                            default:
                                j(zArr);
                                if (this.j) {
                                    return this.f;
                                }
                                throw new ParseException(this.g, 1, this.f);
                        }
                        break;
                }
            }
            f();
        }
        throw new ParseException(this.g, 0, Character.valueOf(this.f30607a));
    }

    public abstract void j(boolean[] zArr) throws IOException;

    public abstract void k() throws ParseException, IOException;

    public abstract Object l(boolean[] zArr) throws ParseException, IOException;

    public <T> T m(wtd<T> wtdVar) throws ParseException, IOException {
        if (this.f30607a != '{') {
            throw new RuntimeException("Internal Error");
        }
        Object objD = wtdVar.d();
        boolean z = false;
        while (true) {
            f();
            char c = this.f30607a;
            if (c != '\t' && c != '\n' && c != '\r' && c != ' ') {
                if (c != ',') {
                    if (c == ':' || c == '[' || c == ']' || c == '{') {
                        throw new ParseException(this.g, 0, Character.valueOf(this.f30607a));
                    }
                    if (c == '}') {
                        if (z && !this.l) {
                            throw new ParseException(this.g, 0, Character.valueOf(this.f30607a));
                        }
                        f();
                        return wtdVar.b(objD);
                    }
                    if (c == '\"' || c == '\'') {
                        o();
                    } else {
                        j(v);
                        if (!this.j) {
                            throw new ParseException(this.g, 1, this.f);
                        }
                    }
                    String str = this.f;
                    t();
                    char c2 = this.f30607a;
                    if (c2 != ':') {
                        if (c2 == 26) {
                            throw new ParseException(this.g - 1, 3, null);
                        }
                        throw new ParseException(this.g - 1, 0, Character.valueOf(this.f30607a));
                    }
                    k();
                    this.c = str;
                    wtdVar.e(objD, str, i(wtdVar, w));
                    this.c = null;
                    t();
                    char c3 = this.f30607a;
                    if (c3 == '}') {
                        f();
                        return wtdVar.b(objD);
                    }
                    if (c3 == 26) {
                        throw new ParseException(this.g - 1, 3, null);
                    }
                    if (c3 != ',') {
                        throw new ParseException(this.g - 1, 1, Character.valueOf(this.f30607a));
                    }
                } else if (z && !this.l) {
                    throw new ParseException(this.g, 0, Character.valueOf(this.f30607a));
                }
                z = true;
            }
        }
    }

    public abstract void n() throws IOException;

    public abstract void o() throws ParseException, IOException;

    public void p() throws ParseException, IOException {
        char c = this.f30607a;
        while (true) {
            f();
            char c2 = this.f30607a;
            if (c2 == '\"' || c2 == '\'') {
                if (c == c2) {
                    f();
                    this.f = this.d.toString();
                    return;
                }
                this.d.a(c2);
            } else if (c2 == '\\') {
                f();
                char c3 = this.f30607a;
                if (c3 == '\"') {
                    this.d.a('\"');
                } else if (c3 == '\'') {
                    this.d.a('\'');
                } else if (c3 == '/') {
                    this.d.a('/');
                } else if (c3 == '\\') {
                    this.d.a(AbstractJsonLexerKt.STRING_ESC);
                } else if (c3 == 'b') {
                    this.d.a('\b');
                } else if (c3 == 'f') {
                    this.d.a('\f');
                } else if (c3 == 'n') {
                    this.d.a('\n');
                } else if (c3 == 'r') {
                    this.d.a(StringUtil.CARRIAGE_RETURN);
                } else if (c3 == 'x') {
                    this.d.a(q(2));
                } else if (c3 == 't') {
                    this.d.a('\t');
                } else if (c3 == 'u') {
                    this.d.a(q(4));
                }
            } else if (c2 != 127) {
                switch (c2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case '\b':
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                        if (!this.o) {
                            throw new ParseException(this.g, 0, Character.valueOf(this.f30607a));
                        }
                        continue;
                        break;
                    case 26:
                        throw new ParseException(this.g - 1, 3, null);
                }
                this.d.a(c2);
            } else if (this.o) {
                continue;
            } else {
                if (this.f30610r) {
                    throw new ParseException(this.g, 0, Character.valueOf(this.f30607a));
                }
                this.d.a(c2);
            }
        }
    }

    public char q(int i) throws ParseException, IOException {
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = i3 * 16;
            f();
            char c = this.f30607a;
            if (c <= '9' && c >= '0') {
                i2 = c - '0';
            } else if (c <= 'F' && c >= 'A') {
                i2 = c - '7';
            } else {
                if (c < 'a' || c > 'f') {
                    if (c == 26) {
                        throw new ParseException(this.g, 3, "EOF");
                    }
                    throw new ParseException(this.g, 4, Character.valueOf(this.f30607a));
                }
                i2 = c - 'W';
            }
            i3 = i5 + i2;
        }
        return (char) i3;
    }

    public void r() throws IOException {
        while (true) {
            char c = this.f30607a;
            if (c < '0' || c > '9') {
                return;
            } else {
                n();
            }
        }
    }

    public void s(boolean[] zArr) throws IOException {
        while (true) {
            char c = this.f30607a;
            if (c == 26) {
                return;
            }
            if (c >= 0 && c < '~' && zArr[c]) {
                return;
            } else {
                n();
            }
        }
    }

    public void t() throws IOException {
        while (true) {
            char c = this.f30607a;
            if (c > ' ' || c == 26) {
                return;
            } else {
                n();
            }
        }
    }
}
