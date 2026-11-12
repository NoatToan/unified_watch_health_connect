package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class aj8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yk5 f1086b;
    public final yk5 c;
    public final sn9 d;

    public aj8(yk5 yk5Var, yk5 yk5Var2, sn9 sn9Var, boolean z) {
        this.f1086b = yk5Var;
        this.c = yk5Var2;
        this.d = sn9Var;
        this.f1085a = z;
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static int e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public sn9 b() {
        return this.d;
    }

    public yk5 c() {
        return this.f1086b;
    }

    public yk5 d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof aj8)) {
            return false;
        }
        aj8 aj8Var = (aj8) obj;
        return a(this.f1086b, aj8Var.f1086b) && a(this.c, aj8Var.c) && a(this.d, aj8Var.d);
    }

    public boolean f() {
        return this.c == null;
    }

    public int hashCode() {
        return (e(this.f1086b) ^ e(this.c)) ^ e(this.d);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(this.f1086b);
        sb.append(" , ");
        sb.append(this.c);
        sb.append(" : ");
        sn9 sn9Var = this.d;
        sb.append(sn9Var == null ? AbstractJsonLexerKt.NULL : Integer.valueOf(sn9Var.c()));
        sb.append(" ]");
        return sb.toString();
    }
}
