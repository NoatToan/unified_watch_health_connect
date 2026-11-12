package nr;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnr/u0;", "", "", "Lms1/d;", "candidateTrailData", "linkedTrailData", "<init>", "(Ljava/util/List;Lms1/d;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<ms1.d> f127376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ms1.d f127377b;

    public u0(List list, ms1.d dVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? p13.j0.f134944a : list, (i14 & 2) != 0 ? null : dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return p005kotlin.jvm.internal.s.g(this.f127376a, u0Var.f127376a) && p005kotlin.jvm.internal.s.g(this.f127377b, u0Var.f127377b);
    }

    public final int hashCode() {
        int iHashCode = this.f127376a.hashCode() * 31;
        ms1.d dVar = this.f127377b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "TrailsData(candidateTrailData=" + this.f127376a + ", linkedTrailData=" + this.f127377b + ")";
    }

    public u0(List<ms1.d> list, ms1.d dVar) {
        list.getClass();
        this.f127376a = list;
        this.f127377b = dVar;
    }

    public u0() {
        this(null, null, 3, null);
    }
}
