package h33;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f81504d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v f81505e = new v(h0.STRICT, null, null, 6, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f81506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o13.j f81507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f81508c;

    public /* synthetic */ v(h0 h0Var, o13.j jVar, h0 h0Var2, int i14, p005kotlin.jvm.internal.j jVar2) {
        this(h0Var, (i14 & 2) != 0 ? new o13.j(1, 0) : jVar, (i14 & 4) != 0 ? h0Var : h0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f81506a == vVar.f81506a && p005kotlin.jvm.internal.s.g(this.f81507b, vVar.f81507b) && this.f81508c == vVar.f81508c;
    }

    public final int hashCode() {
        int iHashCode = this.f81506a.hashCode() * 31;
        o13.j jVar = this.f81507b;
        return this.f81508c.hashCode() + ((iHashCode + (jVar == null ? 0 : jVar.f128587d)) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f81506a + ", sinceVersion=" + this.f81507b + ", reportLevelAfter=" + this.f81508c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public v(h0 h0Var, o13.j jVar, h0 h0Var2) {
        h0Var.getClass();
        h0Var2.getClass();
        this.f81506a = h0Var;
        this.f81507b = jVar;
        this.f81508c = h0Var2;
    }
}
