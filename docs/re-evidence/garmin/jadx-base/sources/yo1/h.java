package yo1;

import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import ps.n;
import ps.r;
import ps.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lyo1/h;", "", "", "activityId", "", "groupRideUUID", "activityName", "Lyo1/j;", "sgrResultsDTO", "Lps/r;", "activitySummaryDTO", "Lps/n;", "activityPolylineDTO", "", "Lps/x1;", "typedSplits", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/ActivityDetailChartDTO;", "chartDetails", "Lyo1/f;", "competitionResult", "", "shouldShowActivityCard", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lyo1/j;Lps/r;Lps/n;Ljava/util/List;Lcom/garmin/android/apps/connectmobile/activities/newmodel/ActivityDetailChartDTO;Lyo1/f;Z)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f198478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f198479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f198480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f198481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f198482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f198483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<x1> f198484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ActivityDetailChartDTO f198485h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f f198486i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f198487j;

    public /* synthetic */ h(Long l14, String str, String str2, j jVar, r rVar, n nVar, List list, ActivityDetailChartDTO activityDetailChartDTO, f fVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar2) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, jVar, rVar, nVar, list, activityDetailChartDTO, fVar, (i14 & 512) != 0 ? true : z14);
    }

    public static h a(h hVar, j jVar, r rVar, n nVar, List list, ActivityDetailChartDTO activityDetailChartDTO, f fVar, int i14) {
        Long l14 = hVar.f198478a;
        String str = hVar.f198479b;
        String str2 = hVar.f198480c;
        if ((i14 & 16) != 0) {
            rVar = hVar.f198482e;
        }
        r rVar2 = rVar;
        if ((i14 & 32) != 0) {
            nVar = hVar.f198483f;
        }
        n nVar2 = nVar;
        if ((i14 & 64) != 0) {
            list = hVar.f198484g;
        }
        List list2 = list;
        ActivityDetailChartDTO activityDetailChartDTO2 = (i14 & 128) != 0 ? hVar.f198485h : activityDetailChartDTO;
        f fVar2 = (i14 & 256) != 0 ? hVar.f198486i : fVar;
        boolean z14 = hVar.f198487j;
        jVar.getClass();
        return new h(l14, str, str2, jVar, rVar2, nVar2, list2, activityDetailChartDTO2, fVar2, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.g(this.f198478a, hVar.f198478a) && s.g(this.f198479b, hVar.f198479b) && s.g(this.f198480c, hVar.f198480c) && s.g(this.f198481d, hVar.f198481d) && s.g(this.f198482e, hVar.f198482e) && s.g(this.f198483f, hVar.f198483f) && s.g(this.f198484g, hVar.f198484g) && s.g(this.f198485h, hVar.f198485h) && s.g(this.f198486i, hVar.f198486i) && this.f198487j == hVar.f198487j;
    }

    public final int hashCode() {
        Long l14 = this.f198478a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.f198479b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f198480c;
        int iHashCode3 = (this.f198481d.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        r rVar = this.f198482e;
        int iHashCode4 = (iHashCode3 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        n nVar = this.f198483f;
        int iHashCode5 = (iHashCode4 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        List<x1> list = this.f198484g;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        ActivityDetailChartDTO activityDetailChartDTO = this.f198485h;
        int iHashCode7 = (iHashCode6 + (activityDetailChartDTO == null ? 0 : activityDetailChartDTO.hashCode())) * 31;
        f fVar = this.f198486i;
        return Boolean.hashCode(this.f198487j) + ((iHashCode7 + (fVar != null ? fVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbJ = b71.i.j("SocialGroupRideDetails(activityId=", ", groupRideUUID=", this.f198479b, this.f198478a, ", activityName=");
        sbJ.append(this.f198480c);
        sbJ.append(", sgrResultsDTO=");
        sbJ.append(this.f198481d);
        sbJ.append(", activitySummaryDTO=");
        sbJ.append(this.f198482e);
        sbJ.append(", activityPolylineDTO=");
        sbJ.append(this.f198483f);
        sbJ.append(", typedSplits=");
        sbJ.append(this.f198484g);
        sbJ.append(", chartDetails=");
        sbJ.append(this.f198485h);
        sbJ.append(", competitionResult=");
        sbJ.append(this.f198486i);
        sbJ.append(", shouldShowActivityCard=");
        sbJ.append(this.f198487j);
        sbJ.append(")");
        return sbJ.toString();
    }

    public h(Long l14, String str, String str2, j jVar, r rVar, n nVar, List<x1> list, ActivityDetailChartDTO activityDetailChartDTO, f fVar, boolean z14) {
        jVar.getClass();
        this.f198478a = l14;
        this.f198479b = str;
        this.f198480c = str2;
        this.f198481d = jVar;
        this.f198482e = rVar;
        this.f198483f = nVar;
        this.f198484g = list;
        this.f198485h = activityDetailChartDTO;
        this.f198486i = fVar;
        this.f198487j = z14;
    }
}
