package tn;

import p005kotlin.Metadata;
import r53.a2;
import yc.v2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ltn/g;", "Lnn/l;", "Lsn/h;", "wellnessActivity", "Lr53/i;", "Lyc/v2;", "healthSnapshotPager", "<init>", "(Lsn/h;Lr53/i;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g implements nn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sn.h f165466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r53.i<v2<sn.h>> f165467b;

    public g(sn.h hVar, r53.i<v2<sn.h>> iVar) {
        this.f165466a = hVar;
        this.f165467b = iVar;
    }

    public static g a(g gVar, sn.h hVar, a2 a2Var, int i14) {
        if ((i14 & 1) != 0) {
            hVar = gVar.f165466a;
        }
        r53.i<v2<sn.h>> iVar = a2Var;
        if ((i14 & 2) != 0) {
            iVar = gVar.f165467b;
        }
        gVar.getClass();
        return new g(hVar, iVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return p005kotlin.jvm.internal.s.g(this.f165466a, gVar.f165466a) && p005kotlin.jvm.internal.s.g(this.f165467b, gVar.f165467b);
    }

    public final int hashCode() {
        sn.h hVar = this.f165466a;
        int iHashCode = (hVar == null ? 0 : hVar.hashCode()) * 31;
        r53.i<v2<sn.h>> iVar = this.f165467b;
        return iHashCode + (iVar != null ? iVar.hashCode() : 0);
    }

    public final String toString() {
        return "State(wellnessActivity=" + this.f165466a + ", healthSnapshotPager=" + this.f165467b + ")";
    }
}
