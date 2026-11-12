package defpackage;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigSyntax;
import com.xiaomi.fitness.watch.face.schema.FaceSchema;
import io.netty.util.internal.StringUtil;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public final class mip {

    public static class a extends Exception {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zhp f26223a;

        public a(zhp zhpVar) {
            this.f26223a = zhpVar;
        }

        public zhp a() {
            return this.f26223a;
        }
    }

    public static class b implements Iterator<zhp> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ocm f26224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Reader f26225b;
        public final LinkedList<Integer> c = new LinkedList<>();
        public int d = 1;
        public jc4 e;
        public final Queue<zhp> f;
        public final a g;
        public final boolean h;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public StringBuilder f26226a = new StringBuilder();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f26227b = false;

            public void a(int i) {
                if (this.f26227b) {
                    this.f26226a.appendCodePoint(i);
                }
            }

            public zhp b(zhp zhpVar, jc4 jc4Var, int i) {
                if (b.d(zhpVar)) {
                    return c(jc4Var, i);
                }
                d();
                return null;
            }

            public final zhp c(jc4 jc4Var, int i) {
                if (!this.f26227b) {
                    this.f26227b = true;
                    this.f26226a.setLength(0);
                    return null;
                }
                if (this.f26226a.length() <= 0) {
                    return null;
                }
                zhp zhpVarY = oip.y(b.g(jc4Var, i), this.f26226a.toString());
                this.f26226a.setLength(0);
                return zhpVarY;
            }

            public final void d() {
                this.f26227b = false;
                this.f26226a.setLength(0);
            }
        }

        public b(jc4 jc4Var, Reader reader, boolean z) {
            ocm ocmVar = (ocm) jc4Var;
            this.f26224a = ocmVar;
            this.f26225b = reader;
            this.h = z;
            this.e = ocmVar.v(1);
            LinkedList linkedList = new LinkedList();
            this.f = linkedList;
            linkedList.add(oip.f29207a);
            this.g = new a();
        }

        public static boolean d(zhp zhpVar) {
            return oip.l(zhpVar) || oip.m(zhpVar) || oip.n(zhpVar);
        }

        public static boolean e(int i) {
            return wb4.c(i);
        }

        public static boolean f(int i) {
            return i != 10 && wb4.c(i);
        }

        public static jc4 g(jc4 jc4Var, int i) {
            return ((ocm) jc4Var).v(i);
        }

        public static a k(jc4 jc4Var, String str) {
            return l(jc4Var, "", str, null);
        }

        public static a l(jc4 jc4Var, String str, String str2, Throwable th) {
            return m(jc4Var, str, str2, false, th);
        }

        public static a m(jc4 jc4Var, String str, String str2, boolean z, Throwable th) {
            if (str == null || str2 == null) {
                throw new ConfigException.BugOrBroken("internal error, creating bad ProblemException");
            }
            return new a(oip.v(jc4Var, str, str2, z, th));
        }

        public final void A(int i) {
            if (this.c.size() > 2) {
                throw new ConfigException.BugOrBroken("bug: putBack() three times, undesirable look-ahead");
            }
            this.c.push(Integer.valueOf(i));
        }

        public final void B() throws a {
            zhp zhpVarU = u(this.g);
            zhp zhpVarB = this.g.b(zhpVarU, this.f26224a, this.d);
            if (zhpVarB != null) {
                this.f.add(zhpVarB);
            }
            this.f.add(zhpVarU);
        }

        public final boolean C(int i) {
            if (i != -1 && this.h) {
                if (i == 35) {
                    return true;
                }
                if (i == 47) {
                    int iJ = j();
                    A(iJ);
                    if (iJ == 47) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final void c(StringBuilder sb) throws a {
            int i = 0;
            while (true) {
                int iJ = j();
                if (iJ == 34) {
                    i++;
                } else if (i >= 3) {
                    sb.setLength(sb.length() - 3);
                    A(iJ);
                    return;
                } else {
                    if (iJ == -1) {
                        throw n("End of input but triple-quoted string was still open");
                    }
                    if (iJ == 10) {
                        int i2 = this.d + 1;
                        this.d = i2;
                        this.e = this.f26224a.v(i2);
                    }
                    i = 0;
                }
                sb.appendCodePoint(iJ);
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public zhp next() {
            zhp zhpVarRemove = this.f.remove();
            if (this.f.isEmpty() && zhpVarRemove != oip.f29208b) {
                try {
                    B();
                } catch (a e) {
                    this.f.add(e.a());
                }
                if (this.f.isEmpty()) {
                    throw new ConfigException.BugOrBroken("bug: tokens queue should not be empty here");
                }
            }
            return zhpVarRemove;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f.isEmpty();
        }

        public final int i(a aVar) {
            while (true) {
                int iJ = j();
                if (iJ == -1) {
                    return -1;
                }
                if (!f(iJ)) {
                    return iJ;
                }
                aVar.a(iJ);
            }
        }

        public final int j() {
            if (!this.c.isEmpty()) {
                return this.c.pop().intValue();
            }
            try {
                return this.f26225b.read();
            } catch (IOException e) {
                throw new ConfigException.IO(this.f26224a, "read error: " + e.getMessage(), e);
            }
        }

        public final a n(String str) {
            return p("", str, null);
        }

        public final a o(String str, String str2) {
            return p(str, str2, null);
        }

        public final a p(String str, String str2, Throwable th) {
            return l(this.e, str, str2, th);
        }

        public final a q(String str, String str2, boolean z) {
            return r(str, str2, z, null);
        }

        public final a r(String str, String str2, boolean z, Throwable th) {
            return m(this.e, str, str2, z, th);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Does not make sense to remove items from token stream");
        }

        public final zhp s(int i) {
            int iJ;
            if (i == 47 && j() != 47) {
                throw new ConfigException.BugOrBroken("called pullComment but // not seen");
            }
            StringBuilder sb = new StringBuilder();
            while (true) {
                iJ = j();
                if (iJ == -1 || iJ == 10) {
                    break;
                }
                sb.appendCodePoint(iJ);
            }
            A(iJ);
            return oip.q(this.e, sb.toString());
        }

        public final void t(StringBuilder sb) throws a {
            int iJ = j();
            if (iJ == -1) {
                throw n("End of input but backslash in string had nothing after it");
            }
            if (iJ == 34) {
                sb.append('\"');
                return;
            }
            if (iJ == 47) {
                sb.append('/');
                return;
            }
            if (iJ == 92) {
                sb.append(AbstractJsonLexerKt.STRING_ESC);
                return;
            }
            if (iJ == 98) {
                sb.append('\b');
                return;
            }
            if (iJ == 102) {
                sb.append('\f');
                return;
            }
            if (iJ == 110) {
                sb.append('\n');
                return;
            }
            if (iJ == 114) {
                sb.append(StringUtil.CARRIAGE_RETURN);
                return;
            }
            if (iJ == 116) {
                sb.append('\t');
                return;
            }
            if (iJ != 117) {
                throw o(mip.b(iJ), String.format("backslash followed by '%s', this is not a valid escape sequence (quoted strings use JSON escaping, so use double-backslash \\\\ for literal backslash)", mip.b(iJ)));
            }
            char[] cArr = new char[4];
            for (int i = 0; i < 4; i++) {
                int iJ2 = j();
                if (iJ2 == -1) {
                    throw n("End of input but expecting 4 hex digits for \\uXXXX escape");
                }
                cArr[i] = (char) iJ2;
            }
            String str = new String(cArr);
            try {
                sb.appendCodePoint(Integer.parseInt(str, 16));
            } catch (NumberFormatException e) {
                throw p(str, String.format("Malformed hex digits after \\u escape in string: '%s'", str), e);
            }
        }

        public final zhp u(a aVar) throws a {
            zhp zhpVarX;
            zhp zhpVarZ;
            int i = i(aVar);
            if (i == -1) {
                return oip.f29208b;
            }
            if (i == 10) {
                zhp zhpVarS = oip.s(this.e);
                int i2 = this.d + 1;
                this.d = i2;
                this.e = this.f26224a.v(i2);
                return zhpVarS;
            }
            if (C(i)) {
                zhpVarZ = s(i);
            } else {
                if (i == 34) {
                    zhpVarX = x();
                } else if (i == 36) {
                    zhpVarX = y();
                } else if (i == 58) {
                    zhpVarX = oip.e;
                } else if (i == 61) {
                    zhpVarX = oip.d;
                } else if (i == 91) {
                    zhpVarX = oip.h;
                } else if (i == 93) {
                    zhpVarX = oip.i;
                } else if (i == 123) {
                    zhpVarX = oip.f;
                } else if (i == 125) {
                    zhpVarX = oip.g;
                } else if (i != 43) {
                    zhpVarX = i != 44 ? null : oip.c;
                } else {
                    zhpVarX = w();
                }
                if (zhpVarX != null) {
                    zhpVarZ = zhpVarX;
                } else if ("0123456789-".indexOf(i) >= 0) {
                    zhpVarZ = v(i);
                } else {
                    if ("$\"{}[]:=,+#`^?!@*&\\".indexOf(i) >= 0) {
                        throw q(mip.b(i), "Reserved character '" + mip.b(i) + "' is not allowed outside quotes", true);
                    }
                    A(i);
                    zhpVarZ = z();
                }
            }
            if (zhpVarZ != null) {
                return zhpVarZ;
            }
            throw new ConfigException.BugOrBroken("bug: failed to generate next token");
        }

        public final zhp v(int i) throws a {
            StringBuilder sb = new StringBuilder();
            sb.appendCodePoint(i);
            int iJ = j();
            boolean z = false;
            while (iJ != -1 && "0123456789eE+-.".indexOf(iJ) >= 0) {
                if (iJ == 46 || iJ == 101 || iJ == 69) {
                    z = true;
                }
                sb.appendCodePoint(iJ);
                iJ = j();
            }
            A(iJ);
            String string = sb.toString();
            try {
                return z ? oip.r(this.e, Double.parseDouble(string), string) : oip.t(this.e, Long.parseLong(string), string);
            } catch (NumberFormatException unused) {
                for (char c : string.toCharArray()) {
                    if ("$\"{}[]:=,+#`^?!@*&\\".indexOf(c) >= 0) {
                        throw q(mip.b(c), "Reserved character '" + mip.b(c) + "' is not allowed outside quotes", true);
                    }
                }
                return oip.y(this.e, string);
            }
        }

        public final zhp w() throws a {
            int iJ = j();
            if (iJ == 61) {
                return oip.j;
            }
            throw q(mip.b(iJ), "'+' not followed by =, '" + mip.b(iJ) + "' not allowed after '+'", true);
        }

        public final zhp x() throws a {
            int iJ;
            StringBuilder sb = new StringBuilder();
            do {
                iJ = j();
                if (iJ == -1) {
                    throw n("End of input but string quote was still open");
                }
                if (iJ == 92) {
                    t(sb);
                } else if (iJ != 34) {
                    if (Character.isISOControl(iJ)) {
                        throw o(mip.b(iJ), "JSON does not allow unescaped " + mip.b(iJ) + " in quoted strings, use a backslash escape");
                    }
                    sb.appendCodePoint(iJ);
                }
            } while (iJ != 34);
            if (sb.length() == 0) {
                int iJ2 = j();
                if (iJ2 == 34) {
                    c(sb);
                } else {
                    A(iJ2);
                }
            }
            return oip.w(this.e, sb.toString());
        }

        public final zhp y() throws a {
            jc4 jc4Var = this.e;
            int iJ = j();
            boolean z = true;
            if (iJ != 123) {
                throw q(mip.b(iJ), "'$' not followed by {, '" + mip.b(iJ) + "' not allowed after '$'", true);
            }
            int iJ2 = j();
            if (iJ2 != 63) {
                A(iJ2);
                z = false;
            }
            a aVar = new a();
            ArrayList arrayList = new ArrayList();
            while (true) {
                zhp zhpVarU = u(aVar);
                if (zhpVarU == oip.g) {
                    return oip.x(jc4Var, z, arrayList);
                }
                if (zhpVarU == oip.f29208b) {
                    throw k(jc4Var, "Substitution ${ was not closed with a }");
                }
                zhp zhpVarB = aVar.b(zhpVarU, jc4Var, this.d);
                if (zhpVarB != null) {
                    arrayList.add(zhpVarB);
                }
                arrayList.add(zhpVarU);
            }
        }

        public final zhp z() {
            jc4 jc4Var = this.e;
            StringBuilder sb = new StringBuilder();
            int iJ = j();
            while (iJ != -1 && "$\"{}[]:=,+#`^?!@*&\\".indexOf(iJ) < 0 && !e(iJ) && !C(iJ)) {
                sb.appendCodePoint(iJ);
                if (sb.length() == 4) {
                    String string = sb.toString();
                    if (string.equals("true")) {
                        return oip.p(jc4Var, true);
                    }
                    if (string.equals(AbstractJsonLexerKt.NULL)) {
                        return oip.u(jc4Var);
                    }
                } else if (sb.length() == 5 && sb.toString().equals("false")) {
                    return oip.p(jc4Var, false);
                }
                iJ = j();
            }
            A(iJ);
            return oip.y(jc4Var, sb.toString());
        }
    }

    public static String b(int i) {
        if (i == 10) {
            return "newline";
        }
        if (i == 9) {
            return FaceSchema.FACE_PAGE_TAB;
        }
        if (i == -1) {
            return "end of file";
        }
        return Character.isISOControl(i) ? String.format("control character 0x%x", Integer.valueOf(i)) : String.format("%c", Integer.valueOf(i));
    }

    public static Iterator<zhp> c(jc4 jc4Var, Reader reader, ConfigSyntax configSyntax) {
        return new b(jc4Var, reader, configSyntax != ConfigSyntax.JSON);
    }
}
