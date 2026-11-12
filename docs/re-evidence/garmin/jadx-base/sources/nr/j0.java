package nr;

import java.util.List;
import p005kotlin.Metadata;
import ps.b2;
import ps.c1;
import ps.d1;
import ps.x1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\b¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lnr/j0;", "", "Lps/m;", "polyline", "Lps/b2;", "weather", "Lps/c1;", "metricTrackLog", "", "Lls/c;", "markerList", "Lps/x1;", "typedSplitDTOs", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/a0;", "polylineDTOs", "Lps/d1;", "legs", "Lps/i;", "heatmapPoints", "<init>", "(Lps/m;Lps/b2;Lps/c1;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ps.m f127208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f127209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f127210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<ls.c> f127211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<x1> f127212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<com.garmin.android.apps.connectmobile.activities.newmodel.a0> f127213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<d1> f127214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<ps.i> f127215h;

    public /* synthetic */ j0(ps.m mVar, b2 b2Var, c1 c1Var, List list, List list2, List list3, List list4, List list5, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : mVar, (i14 & 2) != 0 ? null : b2Var, (i14 & 4) != 0 ? null : c1Var, (i14 & 8) != 0 ? null : list, (i14 & 16) != 0 ? null : list2, (i14 & 32) != 0 ? null : list3, (i14 & 64) != 0 ? null : list4, (i14 & 128) != 0 ? null : list5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return p005kotlin.jvm.internal.s.g(this.f127208a, j0Var.f127208a) && p005kotlin.jvm.internal.s.g(this.f127209b, j0Var.f127209b) && p005kotlin.jvm.internal.s.g(this.f127210c, j0Var.f127210c) && p005kotlin.jvm.internal.s.g(this.f127211d, j0Var.f127211d) && p005kotlin.jvm.internal.s.g(this.f127212e, j0Var.f127212e) && p005kotlin.jvm.internal.s.g(this.f127213f, j0Var.f127213f) && p005kotlin.jvm.internal.s.g(this.f127214g, j0Var.f127214g) && p005kotlin.jvm.internal.s.g(this.f127215h, j0Var.f127215h);
    }

    public final int hashCode() {
        ps.m mVar = this.f127208a;
        int iHashCode = (mVar == null ? 0 : mVar.hashCode()) * 31;
        b2 b2Var = this.f127209b;
        int iHashCode2 = (iHashCode + (b2Var == null ? 0 : b2Var.hashCode())) * 31;
        c1 c1Var = this.f127210c;
        int iHashCode3 = (iHashCode2 + (c1Var == null ? 0 : c1Var.hashCode())) * 31;
        List<ls.c> list = this.f127211d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<x1> list2 = this.f127212e;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<com.garmin.android.apps.connectmobile.activities.newmodel.a0> list3 = this.f127213f;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<d1> list4 = this.f127214g;
        int iHashCode7 = (iHashCode6 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<ps.i> list5 = this.f127215h;
        return iHashCode7 + (list5 != null ? list5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MapData(polyline=");
        sb3.append(this.f127208a);
        sb3.append(", weather=");
        sb3.append(this.f127209b);
        sb3.append(", metricTrackLog=");
        sb3.append(this.f127210c);
        sb3.append(", markerList=");
        sb3.append(this.f127211d);
        sb3.append(", typedSplitDTOs=");
        n23.j.z(sb3, this.f127212e, ", polylineDTOs=", this.f127213f, ", legs=");
        return n23.j.j(sb3, this.f127214g, ", heatmapPoints=", this.f127215h, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j0(ps.m mVar, b2 b2Var, c1 c1Var, List<ls.c> list, List<x1> list2, List<? extends com.garmin.android.apps.connectmobile.activities.newmodel.a0> list3, List<d1> list4, List<ps.i> list5) {
        this.f127208a = mVar;
        this.f127209b = b2Var;
        this.f127210c = c1Var;
        this.f127211d = list;
        this.f127212e = list2;
        this.f127213f = list3;
        this.f127214g = list4;
        this.f127215h = list5;
    }

    public j0() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
