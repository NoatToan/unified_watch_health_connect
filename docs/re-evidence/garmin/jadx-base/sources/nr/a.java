package nr;

import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lnr/a;", "", "Ljr/d;", "typeConfiguration", "Lnr/o;", "summaries", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/ActivityDetailChartDTO;", "details", "Lps/p;", "splits", "", "userWeight", "<init>", "(Ljr/d;Lnr/o;Lcom/garmin/android/apps/connectmobile/activities/newmodel/ActivityDetailChartDTO;Lps/p;Ljava/lang/Double;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jr.d f126974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f126975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActivityDetailChartDTO f126976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ps.p f126977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f126978e;

    public /* synthetic */ a(jr.d dVar, o oVar, ActivityDetailChartDTO activityDetailChartDTO, ps.p pVar, Double d14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : dVar, (i14 & 2) != 0 ? null : oVar, (i14 & 4) != 0 ? null : activityDetailChartDTO, (i14 & 8) != 0 ? null : pVar, (i14 & 16) != 0 ? null : d14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p005kotlin.jvm.internal.s.g(this.f126974a, aVar.f126974a) && p005kotlin.jvm.internal.s.g(this.f126975b, aVar.f126975b) && p005kotlin.jvm.internal.s.g(this.f126976c, aVar.f126976c) && p005kotlin.jvm.internal.s.g(this.f126977d, aVar.f126977d) && p005kotlin.jvm.internal.s.g(this.f126978e, aVar.f126978e);
    }

    public final int hashCode() {
        jr.d dVar = this.f126974a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        o oVar = this.f126975b;
        int iHashCode2 = (iHashCode + (oVar == null ? 0 : oVar.hashCode())) * 31;
        ActivityDetailChartDTO activityDetailChartDTO = this.f126976c;
        int iHashCode3 = (iHashCode2 + (activityDetailChartDTO == null ? 0 : activityDetailChartDTO.hashCode())) * 31;
        ps.p pVar = this.f126977d;
        int iHashCode4 = (iHashCode3 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        Double d14 = this.f126978e;
        return iHashCode4 + (d14 != null ? d14.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActivityBasicData(typeConfiguration=");
        sb3.append(this.f126974a);
        sb3.append(", summaries=");
        sb3.append(this.f126975b);
        sb3.append(", details=");
        sb3.append(this.f126976c);
        sb3.append(", splits=");
        sb3.append(this.f126977d);
        sb3.append(", userWeight=");
        return b71.i.g(sb3, this.f126978e, ")");
    }

    public a(jr.d dVar, o oVar, ActivityDetailChartDTO activityDetailChartDTO, ps.p pVar, Double d14) {
        this.f126974a = dVar;
        this.f126975b = oVar;
        this.f126976c = activityDetailChartDTO;
        this.f126977d = pVar;
        this.f126978e = d14;
    }

    public a() {
        this(null, null, null, null, null, 31, null);
    }
}
