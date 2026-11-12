package p33;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f135480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f135481b;

    public n(m mVar, boolean z14) {
        mVar.getClass();
        this.f135480a = mVar;
        this.f135481b = z14;
    }

    public static n a(n nVar, m mVar, boolean z14, int i14) {
        if ((i14 & 1) != 0) {
            mVar = nVar.f135480a;
        }
        if ((i14 & 2) != 0) {
            z14 = nVar.f135481b;
        }
        nVar.getClass();
        mVar.getClass();
        return new n(mVar, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f135480a == nVar.f135480a && this.f135481b == nVar.f135481b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f135481b) + (this.f135480a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NullabilityQualifierWithMigrationStatus(qualifier=");
        sb3.append(this.f135480a);
        sb3.append(", isForWarningOnly=");
        return am.j.t(sb3, this.f135481b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public /* synthetic */ n(m mVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(mVar, (i14 & 2) != 0 ? false : z14);
    }
}
