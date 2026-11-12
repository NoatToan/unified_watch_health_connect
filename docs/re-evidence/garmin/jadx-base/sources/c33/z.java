package c33;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z f24306c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f24307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f24308b;

    static {
        new a(null);
        f24306c = new z(null, null);
    }

    public z(b0 b0Var, w wVar) {
        this.f24307a = b0Var;
        this.f24308b = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f24307a == zVar.f24307a && p005kotlin.jvm.internal.s.g(this.f24308b, zVar.f24308b);
    }

    public final int hashCode() {
        b0 b0Var = this.f24307a;
        int iHashCode = (b0Var == null ? 0 : b0Var.hashCode()) * 31;
        w wVar = this.f24308b;
        return iHashCode + (wVar != null ? wVar.hashCode() : 0);
    }

    public final String toString() {
        return "KmTypeProjection(variance=" + this.f24307a + ", type=" + this.f24308b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
