package ww1;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lww1/t;", "", "", "trainingPlanId", "", "planName", "_planClassification", "Lww1/c0;", "trainingPlanDetailBrief", "", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/d;", "workoutScheduleSummaries", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lww1/c0;Ljava/util/List;)V", "a", "Ljava/lang/Long;", "f", "()Ljava/lang/Long;", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "Lww1/c0;", JWKParameterNames.RSA_EXPONENT, "()Lww1/c0;", "Ljava/util/List;", "getWorkoutScheduleSummaries", "()Ljava/util/List;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingPlanId")
    private final Long trainingPlanId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("planName")
    private final String planName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingPlanClassification")
    private final String _planClassification;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingPlanDetailsDTO")
    private final c0 trainingPlanDetailBrief;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutScheduleSummaries")
    private final List<com.garmin.android.apps.connectmobile.workouts.data.model.d> workoutScheduleSummaries;

    public /* synthetic */ t(Long l14, String str, String str2, c0 c0Var, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this(l14, str, str2, c0Var, (i14 & 16) != 0 ? null : list);
    }

    public final List<com.garmin.android.apps.connectmobile.workouts.data.model.d> a() {
        int i14 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).e1().f77271c;
        DateTime dateTimeWithTimeAtStartOfDay = DateTime.now().withTimeAtStartOfDay();
        dateTimeWithTimeAtStartOfDay.getClass();
        DateTime dateTimeO = g22.k.o(i14, dateTimeWithTimeAtStartOfDay);
        DateTime dateTimeA = g22.k.A(g22.k.b(i14, dateTimeWithTimeAtStartOfDay));
        List<com.garmin.android.apps.connectmobile.workouts.data.model.d> list = this.workoutScheduleSummaries;
        if (list == null) {
            return j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            DateTime dateTimeG = ((com.garmin.android.apps.connectmobile.workouts.data.model.d) obj).g();
            if (dateTimeG != null && g22.k.e(dateTimeG, dateTimeO, dateTimeA)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final b0 b() {
        b0.a aVar = b0.f187722b;
        String str = this._planClassification;
        aVar.getClass();
        for (b0 b0Var : b0.values()) {
            if (p005kotlin.jvm.internal.s.g(b0Var.f187728a, str)) {
                return b0Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPlanName() {
        return this.planName;
    }

    public final List<com.garmin.android.apps.connectmobile.workouts.data.model.d> d() {
        DateTime dateTimeG;
        int i14 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).e1().f77271c;
        DateTime dateTimeWithTimeAtStartOfDay = DateTime.now().withTimeAtStartOfDay();
        dateTimeWithTimeAtStartOfDay.getClass();
        DateTime dateTimeA = g22.k.A(g22.k.b(i14, dateTimeWithTimeAtStartOfDay));
        List<com.garmin.android.apps.connectmobile.workouts.data.model.d> list = this.workoutScheduleSummaries;
        if (list == null) {
            return j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            com.garmin.android.apps.connectmobile.workouts.data.model.d dVar = (com.garmin.android.apps.connectmobile.workouts.data.model.d) obj;
            if (dVar.getAssociatedActivityId() == null && (dateTimeG = dVar.g()) != null && g22.k.e(dateTimeG, dateTimeWithTimeAtStartOfDay, dateTimeA)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final c0 getTrainingPlanDetailBrief() {
        return this.trainingPlanDetailBrief;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return p005kotlin.jvm.internal.s.g(this.trainingPlanId, tVar.trainingPlanId) && p005kotlin.jvm.internal.s.g(this.planName, tVar.planName) && p005kotlin.jvm.internal.s.g(this._planClassification, tVar._planClassification) && p005kotlin.jvm.internal.s.g(this.trainingPlanDetailBrief, tVar.trainingPlanDetailBrief) && p005kotlin.jvm.internal.s.g(this.workoutScheduleSummaries, tVar.workoutScheduleSummaries);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getTrainingPlanId() {
        return this.trainingPlanId;
    }

    public final boolean g() {
        return b() == b0.FBT_ADAPTIVE;
    }

    public final boolean h(DateTime dateTime) {
        h athleteRace;
        dateTime.getClass();
        c0 c0Var = this.trainingPlanDetailBrief;
        return g22.k.f((c0Var == null || (athleteRace = c0Var.getAthleteRace()) == null) ? null : athleteRace.b(), dateTime);
    }

    public final int hashCode() {
        Long l14 = this.trainingPlanId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.planName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this._planClassification;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        c0 c0Var = this.trainingPlanDetailBrief;
        int iHashCode4 = (iHashCode3 + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.d> list = this.workoutScheduleSummaries;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final boolean i() {
        h athleteRace;
        DateTime dateTimeB;
        if (g()) {
            int i14 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).e1().f77271c;
            DateTime dateTimeWithTimeAtStartOfDay = DateTime.now().withTimeAtStartOfDay();
            dateTimeWithTimeAtStartOfDay.getClass();
            DateTime dateTimeO = g22.k.o(i14, dateTimeWithTimeAtStartOfDay);
            DateTime dateTimeA = g22.k.A(g22.k.b(i14, dateTimeWithTimeAtStartOfDay));
            c0 c0Var = this.trainingPlanDetailBrief;
            return (c0Var == null || (athleteRace = c0Var.getAthleteRace()) == null || (dateTimeB = athleteRace.b()) == null || !g22.k.e(dateTimeB, dateTimeO, dateTimeA)) ? false : true;
        }
        List<com.garmin.android.apps.connectmobile.workouts.data.model.d> listA = a();
        if (listA != null && listA.isEmpty()) {
            return false;
        }
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            if (((com.garmin.android.apps.connectmobile.workouts.data.model.d) it.next()).q()) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        Long l14 = this.trainingPlanId;
        String str = this.planName;
        String str2 = this._planClassification;
        c0 c0Var = this.trainingPlanDetailBrief;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.d> list = this.workoutScheduleSummaries;
        StringBuilder sbJ = b71.i.j("DashboardTrainingPlanDTO(trainingPlanId=", ", planName=", str, l14, ", _planClassification=");
        sbJ.append(str2);
        sbJ.append(", trainingPlanDetailBrief=");
        sbJ.append(c0Var);
        sbJ.append(", workoutScheduleSummaries=");
        return u62.z.c(sbJ, list, ")");
    }

    public t(Long l14, String str, String str2, c0 c0Var, List<com.garmin.android.apps.connectmobile.workouts.data.model.d> list) {
        this.trainingPlanId = l14;
        this.planName = str;
        this._planClassification = str2;
        this.trainingPlanDetailBrief = c0Var;
        this.workoutScheduleSummaries = list;
    }
}
