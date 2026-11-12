package zo1;

import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ps.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lzo1/a;", "", "Lps/x1;", "climb", "", "climbGroups", "", "title", "", "final", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/ActivityDetailChartDTO;", "chartDetails", "Lyo1/f;", "sgrCompetitionsResults", "hasActivity", "showRankingFirst", "Lkotlin/Function1;", "", "skipRefreshOnStart", "<init>", "(Lps/x1;Ljava/util/List;Ljava/lang/String;ZLcom/garmin/android/apps/connectmobile/activities/newmodel/ActivityDetailChartDTO;Lyo1/f;ZZLe23/l;)V", "gcm-social-group-ride_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x1 f206215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<x1> f206216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f206217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f206218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ActivityDetailChartDTO f206219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yo1.f f206220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f206221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f206222h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e23.l<Boolean, Unit> f206223i;

    /* JADX WARN: Multi-variable type inference failed */
    public a(x1 x1Var, List<x1> list, String str, boolean z14, ActivityDetailChartDTO activityDetailChartDTO, yo1.f fVar, boolean z15, boolean z16, e23.l<? super Boolean, Unit> lVar) {
        x1Var.getClass();
        list.getClass();
        str.getClass();
        this.f206215a = x1Var;
        this.f206216b = list;
        this.f206217c = str;
        this.f206218d = z14;
        this.f206219e = activityDetailChartDTO;
        this.f206220f = fVar;
        this.f206221g = z15;
        this.f206222h = z16;
        this.f206223i = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p005kotlin.jvm.internal.s.g(this.f206215a, aVar.f206215a) && p005kotlin.jvm.internal.s.g(this.f206216b, aVar.f206216b) && p005kotlin.jvm.internal.s.g(this.f206217c, aVar.f206217c) && this.f206218d == aVar.f206218d && p005kotlin.jvm.internal.s.g(this.f206219e, aVar.f206219e) && p005kotlin.jvm.internal.s.g(this.f206220f, aVar.f206220f) && this.f206221g == aVar.f206221g && this.f206222h == aVar.f206222h && p005kotlin.jvm.internal.s.g(this.f206223i, aVar.f206223i);
    }

    public final int hashCode() {
        int iG = q6.f.g(wr.g.j(lc.u0.b(this.f206215a.hashCode() * 31, 31, this.f206216b), 31, this.f206217c), 31, this.f206218d);
        ActivityDetailChartDTO activityDetailChartDTO = this.f206219e;
        int iHashCode = (iG + (activityDetailChartDTO == null ? 0 : activityDetailChartDTO.hashCode())) * 31;
        yo1.f fVar = this.f206220f;
        int iG2 = q6.f.g(q6.f.g((iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31, 31, this.f206221g), 31, this.f206222h);
        e23.l<Boolean, Unit> lVar = this.f206223i;
        return iG2 + (lVar != null ? lVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ClimbDetailsArguments(climb=");
        sb3.append(this.f206215a);
        sb3.append(", climbGroups=");
        sb3.append(this.f206216b);
        sb3.append(", title=");
        v.h.C(this.f206217c, ", final=", ", chartDetails=", sb3, this.f206218d);
        sb3.append(this.f206219e);
        sb3.append(", sgrCompetitionsResults=");
        sb3.append(this.f206220f);
        sb3.append(", hasActivity=");
        kg.f.q(", showRankingFirst=", ", skipRefreshOnStart=", sb3, this.f206221g, this.f206222h);
        sb3.append(this.f206223i);
        sb3.append(")");
        return sb3.toString();
    }

    public /* synthetic */ a(x1 x1Var, List list, String str, boolean z14, ActivityDetailChartDTO activityDetailChartDTO, yo1.f fVar, boolean z15, boolean z16, e23.l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(x1Var, list, str, z14, activityDetailChartDTO, fVar, z15, z16, (i14 & 256) != 0 ? null : lVar);
    }
}
