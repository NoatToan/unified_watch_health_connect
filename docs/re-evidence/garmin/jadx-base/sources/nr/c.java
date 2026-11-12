package nr;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0006\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lnr/c;", "", "Lnr/a;", "activityBasicData", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/l0;", "tanksPressure", "", "Lim/b;", "timeChartDataList", "distanceChartDataList", "Ljr/f;", "chartComponentList", "<init>", "(Lnr/a;Lcom/garmin/android/apps/connectmobile/activities/newmodel/l0;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f126996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.activities.newmodel.l0 f126997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<im.b> f126998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<im.b> f126999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<List<jr.f>> f127000e;

    public /* synthetic */ c(a aVar, com.garmin.android.apps.connectmobile.activities.newmodel.l0 l0Var, List list, List list2, List list3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : aVar, l0Var, (i14 & 4) != 0 ? null : list, (i14 & 8) != 0 ? null : list2, (i14 & 16) != 0 ? null : list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p005kotlin.jvm.internal.s.g(this.f126996a, cVar.f126996a) && p005kotlin.jvm.internal.s.g(this.f126997b, cVar.f126997b) && p005kotlin.jvm.internal.s.g(this.f126998c, cVar.f126998c) && p005kotlin.jvm.internal.s.g(this.f126999d, cVar.f126999d) && p005kotlin.jvm.internal.s.g(this.f127000e, cVar.f127000e);
    }

    public final int hashCode() {
        a aVar = this.f126996a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        com.garmin.android.apps.connectmobile.activities.newmodel.l0 l0Var = this.f126997b;
        int iHashCode2 = (iHashCode + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        List<im.b> list = this.f126998c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<im.b> list2 = this.f126999d;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<List<jr.f>> list3 = this.f127000e;
        return iHashCode4 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActivityDetailsChartsData(activityBasicData=");
        sb3.append(this.f126996a);
        sb3.append(", tanksPressure=");
        sb3.append(this.f126997b);
        sb3.append(", timeChartDataList=");
        n23.j.z(sb3, this.f126998c, ", distanceChartDataList=", this.f126999d, ", chartComponentList=");
        return u62.z.c(sb3, this.f127000e, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(a aVar, com.garmin.android.apps.connectmobile.activities.newmodel.l0 l0Var, List<? extends im.b> list, List<? extends im.b> list2, List<? extends List<jr.f>> list3) {
        this.f126996a = aVar;
        this.f126997b = l0Var;
        this.f126998c = list;
        this.f126999d = list2;
        this.f127000e = list3;
    }
}
