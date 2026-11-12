package defpackage;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigValueType;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class oip {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zhp f29207a = zhp.c(lip.START, "start of file");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zhp f29208b = zhp.c(lip.END, "end of file");
    public static final zhp c = zhp.c(lip.COMMA, "','");
    public static final zhp d = zhp.c(lip.EQUALS, "'='");
    public static final zhp e = zhp.c(lip.COLON, "':'");
    public static final zhp f = zhp.c(lip.OPEN_CURLY, "'{'");
    public static final zhp g = zhp.c(lip.CLOSE_CURLY, "'}'");
    public static final zhp h = zhp.c(lip.OPEN_SQUARE, "'['");
    public static final zhp i = zhp.c(lip.CLOSE_SQUARE, "']'");
    public static final zhp j = zhp.c(lip.PLUS_EQUALS, "'+='");

    public static class a extends zhp {
        public final String d;

        public a(jc4 jc4Var, String str) {
            super(lip.COMMENT, jc4Var);
            this.d = str;
        }

        @Override // defpackage.zhp
        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public String e() {
            return this.d;
        }

        @Override // defpackage.zhp
        public boolean equals(Object obj) {
            return super.equals(obj) && ((a) obj).d.equals(this.d);
        }

        @Override // defpackage.zhp
        public int hashCode() {
            return (((super.hashCode() + 41) * 41) + this.d.hashCode()) * 41;
        }

        @Override // defpackage.zhp
        public String toString() {
            return "'#" + this.d + "' (COMMENT)";
        }
    }

    public static class b extends zhp {
        public b(jc4 jc4Var) {
            super(lip.NEWLINE, jc4Var);
        }

        @Override // defpackage.zhp
        public boolean a(Object obj) {
            return obj instanceof b;
        }

        @Override // defpackage.zhp
        public boolean equals(Object obj) {
            return super.equals(obj) && ((b) obj).b() == b();
        }

        @Override // defpackage.zhp
        public int hashCode() {
            return ((super.hashCode() + 41) * 41) + b();
        }

        @Override // defpackage.zhp
        public String toString() {
            return "'\\n'@" + b();
        }
    }

    public static class c extends zhp {
        public final String d;
        public final String e;
        public final boolean f;
        public final Throwable g;

        public c(jc4 jc4Var, String str, String str2, boolean z, Throwable th) {
            super(lip.PROBLEM, jc4Var);
            this.d = str;
            this.e = str2;
            this.f = z;
            this.g = th;
        }

        @Override // defpackage.zhp
        public boolean a(Object obj) {
            return obj instanceof c;
        }

        public Throwable e() {
            return this.g;
        }

        @Override // defpackage.zhp
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                c cVar = (c) obj;
                if (cVar.d.equals(this.d) && cVar.e.equals(this.e) && cVar.f == this.f && wb4.a(cVar.g, this.g)) {
                    return true;
                }
            }
            return false;
        }

        public String f() {
            return this.e;
        }

        public boolean g() {
            return this.f;
        }

        @Override // defpackage.zhp
        public int hashCode() {
            int iHashCode = (((((((super.hashCode() + 41) * 41) + this.d.hashCode()) * 41) + this.e.hashCode()) * 41) + Boolean.valueOf(this.f).hashCode()) * 41;
            Throwable th = this.g;
            return th != null ? (iHashCode + th.hashCode()) * 41 : iHashCode;
        }

        @Override // defpackage.zhp
        public String toString() {
            return '\'' + this.d + "' (" + this.e + ")";
        }
    }

    public static class d extends zhp {
        public final boolean d;
        public final List<zhp> e;

        public d(jc4 jc4Var, boolean z, List<zhp> list) {
            super(lip.SUBSTITUTION, jc4Var);
            this.d = z;
            this.e = list;
        }

        @Override // defpackage.zhp
        public boolean a(Object obj) {
            return obj instanceof d;
        }

        public boolean e() {
            return this.d;
        }

        @Override // defpackage.zhp
        public boolean equals(Object obj) {
            return super.equals(obj) && ((d) obj).e.equals(this.e);
        }

        public List<zhp> f() {
            return this.e;
        }

        @Override // defpackage.zhp
        public int hashCode() {
            return ((super.hashCode() + 41) * 41) + this.e.hashCode();
        }

        @Override // defpackage.zhp
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Iterator<zhp> it = this.e.iterator();
            while (it.hasNext()) {
                sb.append(it.next().toString());
            }
            return "'${" + sb.toString() + "}'";
        }
    }

    public static class e extends zhp {
        public final String d;

        public e(jc4 jc4Var, String str) {
            super(lip.UNQUOTED_TEXT, jc4Var);
            this.d = str;
        }

        @Override // defpackage.zhp
        public boolean a(Object obj) {
            return obj instanceof e;
        }

        public String e() {
            return this.d;
        }

        @Override // defpackage.zhp
        public boolean equals(Object obj) {
            return super.equals(obj) && ((e) obj).d.equals(this.d);
        }

        @Override // defpackage.zhp
        public int hashCode() {
            return ((super.hashCode() + 41) * 41) + this.d.hashCode();
        }

        @Override // defpackage.zhp
        public String toString() {
            return "'" + this.d + "'";
        }
    }

    public static class f extends zhp {
        public final h00 d;

        public f(h00 h00Var) {
            super(lip.VALUE, h00Var.g());
            this.d = h00Var;
        }

        @Override // defpackage.zhp
        public boolean a(Object obj) {
            return obj instanceof f;
        }

        public h00 e() {
            return this.d;
        }

        @Override // defpackage.zhp
        public boolean equals(Object obj) {
            return super.equals(obj) && ((f) obj).d.equals(this.d);
        }

        @Override // defpackage.zhp
        public int hashCode() {
            return ((super.hashCode() + 41) * 41) + this.d.hashCode();
        }

        @Override // defpackage.zhp
        public String toString() {
            if (e().Z() != iqk.RESOLVED) {
                return "'<unresolved value>' (" + this.d.valueType().name() + ")";
            }
            return "'" + e().x() + "' (" + this.d.valueType().name() + ")";
        }
    }

    public static String a(zhp zhpVar) {
        if (zhpVar instanceof a) {
            return ((a) zhpVar).e();
        }
        throw new ConfigException.BugOrBroken("tried to get comment text from " + zhpVar);
    }

    public static Throwable b(zhp zhpVar) {
        if (zhpVar instanceof c) {
            return ((c) zhpVar).e();
        }
        throw new ConfigException.BugOrBroken("tried to get problem cause from " + zhpVar);
    }

    public static String c(zhp zhpVar) {
        if (zhpVar instanceof c) {
            return ((c) zhpVar).f();
        }
        throw new ConfigException.BugOrBroken("tried to get problem message from " + zhpVar);
    }

    public static boolean d(zhp zhpVar) {
        if (zhpVar instanceof c) {
            return ((c) zhpVar).g();
        }
        throw new ConfigException.BugOrBroken("tried to get problem suggestQuotes from " + zhpVar);
    }

    public static boolean e(zhp zhpVar) {
        if (zhpVar instanceof d) {
            return ((d) zhpVar).e();
        }
        throw new ConfigException.BugOrBroken("tried to get substitution optionality from " + zhpVar);
    }

    public static List<zhp> f(zhp zhpVar) {
        if (zhpVar instanceof d) {
            return ((d) zhpVar).f();
        }
        throw new ConfigException.BugOrBroken("tried to get substitution from " + zhpVar);
    }

    public static String g(zhp zhpVar) {
        if (zhpVar instanceof e) {
            return ((e) zhpVar).e();
        }
        throw new ConfigException.BugOrBroken("tried to get unquoted text from " + zhpVar);
    }

    public static h00 h(zhp zhpVar) {
        if (zhpVar instanceof f) {
            return ((f) zhpVar).e();
        }
        throw new ConfigException.BugOrBroken("tried to get value of non-value token " + zhpVar);
    }

    public static boolean i(zhp zhpVar) {
        return zhpVar instanceof a;
    }

    public static boolean j(zhp zhpVar) {
        return zhpVar instanceof b;
    }

    public static boolean k(zhp zhpVar) {
        return zhpVar instanceof c;
    }

    public static boolean l(zhp zhpVar) {
        return zhpVar instanceof d;
    }

    public static boolean m(zhp zhpVar) {
        return zhpVar instanceof e;
    }

    public static boolean n(zhp zhpVar) {
        return zhpVar instanceof f;
    }

    public static boolean o(zhp zhpVar, ConfigValueType configValueType) {
        return n(zhpVar) && h(zhpVar).valueType() == configValueType;
    }

    public static zhp p(jc4 jc4Var, boolean z) {
        return z(new ob4(jc4Var, z));
    }

    public static zhp q(jc4 jc4Var, String str) {
        return new a(jc4Var, str);
    }

    public static zhp r(jc4 jc4Var, double d2, String str) {
        return z(hc4.k0(jc4Var, d2, str));
    }

    public static zhp s(jc4 jc4Var) {
        return new b(jc4Var);
    }

    public static zhp t(jc4 jc4Var, long j2, String str) {
        return z(hc4.l0(jc4Var, j2, str));
    }

    public static zhp u(jc4 jc4Var) {
        return z(new gc4(jc4Var));
    }

    public static zhp v(jc4 jc4Var, String str, String str2, boolean z, Throwable th) {
        return new c(jc4Var, str, str2, z, th);
    }

    public static zhp w(jc4 jc4Var, String str) {
        return z(new qc4(jc4Var, str));
    }

    public static zhp x(jc4 jc4Var, boolean z, List<zhp> list) {
        return new d(jc4Var, z, list);
    }

    public static zhp y(jc4 jc4Var, String str) {
        return new e(jc4Var, str);
    }

    public static zhp z(h00 h00Var) {
        return new f(h00Var);
    }
}
