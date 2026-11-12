package tn;

import p005kotlin.Metadata;
import yc.v2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltn/s;", "Lnn/l;", "Lr53/i;", "Lyc/v2;", "Lsn/h;", "healthSnapshotPager", "<init>", "(Lr53/i;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s implements nn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r53.i<v2<sn.h>> f165492a;

    public s(r53.i<v2<sn.h>> iVar) {
        this.f165492a = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && p005kotlin.jvm.internal.s.g(this.f165492a, ((s) obj).f165492a);
    }

    public final int hashCode() {
        r53.i<v2<sn.h>> iVar = this.f165492a;
        if (iVar == null) {
            return 0;
        }
        return iVar.hashCode();
    }

    public final String toString() {
        return "State(healthSnapshotPager=" + this.f165492a + ")";
    }
}
