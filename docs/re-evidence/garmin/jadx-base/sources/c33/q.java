package c33;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f24261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24262b;

    static {
        new a(null);
    }

    public q(w wVar, String str) {
        wVar.getClass();
        this.f24261a = wVar;
        this.f24262b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f24261a.equals(qVar.f24261a) && p005kotlin.jvm.internal.s.g(this.f24262b, qVar.f24262b);
    }

    public final int hashCode() {
        int iHashCode = this.f24261a.hashCode() * 31;
        String str = this.f24262b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("KmFlexibleTypeUpperBound(type=");
        sb3.append(this.f24261a);
        sb3.append(", typeFlexibilityId=");
        return androidx.room.a0.m(sb3, this.f24262b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
