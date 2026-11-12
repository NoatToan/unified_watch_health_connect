package p33;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f135458e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j f135459f = new j(null, null, false, false, 8, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f135460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f135461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f135462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f135463d;

    public j(m mVar, k kVar, boolean z14, boolean z15) {
        this.f135460a = mVar;
        this.f135461b = kVar;
        this.f135462c = z14;
        this.f135463d = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f135460a == jVar.f135460a && this.f135461b == jVar.f135461b && this.f135462c == jVar.f135462c && this.f135463d == jVar.f135463d;
    }

    public final int hashCode() {
        m mVar = this.f135460a;
        int iHashCode = (mVar == null ? 0 : mVar.hashCode()) * 31;
        k kVar = this.f135461b;
        return Boolean.hashCode(this.f135463d) + q6.f.g((iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 31, 31, this.f135462c);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("JavaTypeQualifiers(nullability=");
        sb3.append(this.f135460a);
        sb3.append(", mutability=");
        sb3.append(this.f135461b);
        sb3.append(", definitelyNotNull=");
        sb3.append(this.f135462c);
        sb3.append(", isNullabilityQualifierForWarning=");
        return am.j.t(sb3, this.f135463d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ j(m mVar, k kVar, boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this(mVar, kVar, z14, (i14 & 8) != 0 ? false : z15);
    }
}
