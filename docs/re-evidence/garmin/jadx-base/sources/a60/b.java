package a60;

import am.j;
import com.garmin.android.apps.connectmobile.courses.model.i;
import k30.k;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import q6.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"La60/b;", "", "", "courseName", "Lk30/k;", "courseRoutingType", "", "shouldShowRoutingOptions", "shouldAvoidHighTraffic", "shouldAvoidClosedRoads", "shouldAvoidUnpavedRoads", "", "targetDistance", "minDistance", "maxDistance", "Lcom/garmin/android/apps/connectmobile/courses/model/i;", "courseType", "Lw20/b;", "courseDirection", "isUsingMetric", "isReRouteFlow", "", "courseCreateFlow", "<init>", "(Ljava/lang/String;Lk30/k;ZZZZLjava/lang/Double;DDLcom/garmin/android/apps/connectmobile/courses/model/i;Lw20/b;ZZI)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f1536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f1539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1540f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f1541g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final double f1542h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final double f1543i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f1544j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w20.b f1545k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f1546l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f1547m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f1548n;

    public b(String str, k kVar, boolean z14, boolean z15, boolean z16, boolean z17, Double d14, double d15, double d16, i iVar, w20.b bVar, boolean z18, boolean z19, int i14) {
        kVar.getClass();
        iVar.getClass();
        bVar.getClass();
        this.f1535a = str;
        this.f1536b = kVar;
        this.f1537c = z14;
        this.f1538d = z15;
        this.f1539e = z16;
        this.f1540f = z17;
        this.f1541g = d14;
        this.f1542h = d15;
        this.f1543i = d16;
        this.f1544j = iVar;
        this.f1545k = bVar;
        this.f1546l = z18;
        this.f1547m = z19;
        this.f1548n = i14;
    }

    public static b a(b bVar, String str, k kVar, boolean z14, boolean z15, boolean z16, Double d14, w20.b bVar2, int i14) {
        String str2 = (i14 & 1) != 0 ? bVar.f1535a : str;
        k kVar2 = (i14 & 2) != 0 ? bVar.f1536b : kVar;
        boolean z17 = bVar.f1537c;
        boolean z18 = (i14 & 8) != 0 ? bVar.f1538d : z14;
        boolean z19 = (i14 & 16) != 0 ? bVar.f1539e : z15;
        boolean z24 = (i14 & 32) != 0 ? bVar.f1540f : z16;
        Double d15 = (i14 & 64) != 0 ? bVar.f1541g : d14;
        double d16 = bVar.f1542h;
        double d17 = bVar.f1543i;
        i iVar = bVar.f1544j;
        w20.b bVar3 = (i14 & 1024) != 0 ? bVar.f1545k : bVar2;
        boolean z25 = bVar.f1546l;
        boolean z26 = bVar.f1547m;
        int i15 = bVar.f1548n;
        bVar.getClass();
        return new b(str2, kVar2, z17, z18, z19, z24, d15, d16, d17, iVar, bVar3, z25, z26, i15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f1535a, bVar.f1535a) && this.f1536b == bVar.f1536b && this.f1537c == bVar.f1537c && this.f1538d == bVar.f1538d && this.f1539e == bVar.f1539e && this.f1540f == bVar.f1540f && s.g(this.f1541g, bVar.f1541g) && Double.compare(this.f1542h, bVar.f1542h) == 0 && Double.compare(this.f1543i, bVar.f1543i) == 0 && this.f1544j == bVar.f1544j && this.f1545k == bVar.f1545k && this.f1546l == bVar.f1546l && this.f1547m == bVar.f1547m && this.f1548n == bVar.f1548n;
    }

    public final int hashCode() {
        String str = this.f1535a;
        int iG = f.g(f.g(f.g(f.g((this.f1536b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.f1537c), 31, this.f1538d), 31, this.f1539e), 31, this.f1540f);
        Double d14 = this.f1541g;
        return Integer.hashCode(this.f1548n) + f.g(f.g((this.f1545k.hashCode() + ((this.f1544j.hashCode() + e.b(e.b((iG + (d14 != null ? d14.hashCode() : 0)) * 31, 31, this.f1542h), 31, this.f1543i)) * 31)) * 31, 31, this.f1546l), 31, this.f1547m);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CourseParametersState(courseName=");
        sb3.append(this.f1535a);
        sb3.append(", courseRoutingType=");
        sb3.append(this.f1536b);
        sb3.append(", shouldShowRoutingOptions=");
        kg.f.q(", shouldAvoidHighTraffic=", ", shouldAvoidClosedRoads=", sb3, this.f1537c, this.f1538d);
        kg.f.q(", shouldAvoidUnpavedRoads=", ", targetDistance=", sb3, this.f1539e, this.f1540f);
        sb3.append(this.f1541g);
        sb3.append(", minDistance=");
        sb3.append(this.f1542h);
        j.x(sb3, ", maxDistance=", this.f1543i, ", courseType=");
        sb3.append(this.f1544j);
        sb3.append(", courseDirection=");
        sb3.append(this.f1545k);
        sb3.append(", isUsingMetric=");
        kg.f.q(", isReRouteFlow=", ", courseCreateFlow=", sb3, this.f1546l, this.f1547m);
        return j.q(sb3, this.f1548n, ")");
    }
}
