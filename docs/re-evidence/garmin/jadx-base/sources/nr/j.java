package nr;

import android.util.SparseArray;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lnr/j;", "", "Lls/a;", "statsSummary", "Lnr/c;", "chartsData", "Landroid/util/SparseArray;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/q0;", "comparisonTargetData", "<init>", "(Lls/a;Lnr/c;Landroid/util/SparseArray;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ls.a f127205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f127206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray<com.garmin.android.apps.connectmobile.activities.newmodel.q0> f127207c;

    public /* synthetic */ j(ls.a aVar, c cVar, SparseArray sparseArray, int i14, p005kotlin.jvm.internal.j jVar) {
        this(aVar, (i14 & 2) != 0 ? null : cVar, (i14 & 4) != 0 ? null : sparseArray);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return p005kotlin.jvm.internal.s.g(this.f127205a, jVar.f127205a) && p005kotlin.jvm.internal.s.g(this.f127206b, jVar.f127206b) && p005kotlin.jvm.internal.s.g(this.f127207c, jVar.f127207c);
    }

    public final int hashCode() {
        int iHashCode = this.f127205a.hashCode() * 31;
        c cVar = this.f127206b;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        SparseArray<com.garmin.android.apps.connectmobile.activities.newmodel.q0> sparseArray = this.f127207c;
        return iHashCode2 + (sparseArray != null ? sparseArray.hashCode() : 0);
    }

    public final String toString() {
        return "ActivityDetailsStatsSummary(statsSummary=" + this.f127205a + ", chartsData=" + this.f127206b + ", comparisonTargetData=" + this.f127207c + ")";
    }

    public j(ls.a aVar, c cVar, SparseArray<com.garmin.android.apps.connectmobile.activities.newmodel.q0> sparseArray) {
        aVar.getClass();
        this.f127205a = aVar;
        this.f127206b = cVar;
        this.f127207c = sparseArray;
    }
}
