package nr;

import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lnr/f0;", "", "Lps/r;", "activitySummaryDTO", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/ActivityDetailChartDTO;", "activityDetailsDTO", "Lnr/v;", "deviceData", "<init>", "(Lps/r;Lcom/garmin/android/apps/connectmobile/activities/newmodel/ActivityDetailChartDTO;Lnr/v;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ps.r f127039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActivityDetailChartDTO f127040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f127041c;

    public f0(ps.r rVar, ActivityDetailChartDTO activityDetailChartDTO, v vVar) {
        this.f127039a = rVar;
        this.f127040b = activityDetailChartDTO;
        this.f127041c = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return p005kotlin.jvm.internal.s.g(this.f127039a, f0Var.f127039a) && p005kotlin.jvm.internal.s.g(this.f127040b, f0Var.f127040b) && p005kotlin.jvm.internal.s.g(this.f127041c, f0Var.f127041c);
    }

    public final int hashCode() {
        ps.r rVar = this.f127039a;
        int iHashCode = (rVar == null ? 0 : rVar.hashCode()) * 31;
        ActivityDetailChartDTO activityDetailChartDTO = this.f127040b;
        int iHashCode2 = (iHashCode + (activityDetailChartDTO == null ? 0 : activityDetailChartDTO.hashCode())) * 31;
        v vVar = this.f127041c;
        return iHashCode2 + (vVar != null ? vVar.hashCode() : 0);
    }

    public final String toString() {
        return "FiveHzDialogData(activitySummaryDTO=" + this.f127039a + ", activityDetailsDTO=" + this.f127040b + ", deviceData=" + this.f127041c + ")";
    }

    public /* synthetic */ f0(ps.r rVar, ActivityDetailChartDTO activityDetailChartDTO, v vVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(rVar, (i14 & 2) != 0 ? null : activityDetailChartDTO, vVar);
    }
}
