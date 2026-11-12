package ps;

import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lps/a0;", "", "Lps/r;", "activitySummary", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/ActivityDetailChartDTO;", "activityDetails", "Lps/s0;", "exerciseSet", "Lps/p;", "activitySplits", "", "hasDeviceInfo", "", "", "childActivityTypes", "<init>", "(Lps/r;Lcom/garmin/android/apps/connectmobile/activities/newmodel/ActivityDetailChartDTO;Lps/s0;Lps/p;Ljava/lang/Boolean;Ljava/util/List;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f139647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActivityDetailChartDTO f139648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s0 f139649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f139650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f139651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<String> f139652f;

    public a0(r rVar, ActivityDetailChartDTO activityDetailChartDTO, s0 s0Var, p pVar, Boolean bool, List<String> list) {
        list.getClass();
        this.f139647a = rVar;
        this.f139648b = activityDetailChartDTO;
        this.f139649c = s0Var;
        this.f139650d = pVar;
        this.f139651e = bool;
        this.f139652f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return p005kotlin.jvm.internal.s.g(this.f139647a, a0Var.f139647a) && p005kotlin.jvm.internal.s.g(this.f139648b, a0Var.f139648b) && p005kotlin.jvm.internal.s.g(this.f139649c, a0Var.f139649c) && p005kotlin.jvm.internal.s.g(this.f139650d, a0Var.f139650d) && p005kotlin.jvm.internal.s.g(this.f139651e, a0Var.f139651e) && this.f139652f.equals(a0Var.f139652f);
    }

    public final int hashCode() {
        r rVar = this.f139647a;
        int iHashCode = (rVar == null ? 0 : rVar.hashCode()) * 31;
        ActivityDetailChartDTO activityDetailChartDTO = this.f139648b;
        int iHashCode2 = (iHashCode + (activityDetailChartDTO == null ? 0 : activityDetailChartDTO.hashCode())) * 31;
        s0 s0Var = this.f139649c;
        int iHashCode3 = (iHashCode2 + (s0Var == null ? 0 : s0Var.hashCode())) * 31;
        p pVar = this.f139650d;
        int iHashCode4 = (iHashCode3 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        Boolean bool = this.f139651e;
        return this.f139652f.hashCode() + ((iHashCode4 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CompactActivityDetails(activitySummary=" + this.f139647a + ", activityDetails=" + this.f139648b + ", exerciseSet=" + this.f139649c + ", activitySplits=" + this.f139650d + ", hasDeviceInfo=" + this.f139651e + ", childActivityTypes=" + this.f139652f + ")";
    }
}
