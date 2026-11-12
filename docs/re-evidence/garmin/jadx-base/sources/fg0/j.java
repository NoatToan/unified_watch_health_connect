package fg0;

import android.os.Parcel;
import android.os.Parcelable;
import c22.j0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b3\b\u0087\b\u0018\u00002\u00020\u0001B©\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010$\u001a\u0004\b\t\u0010&\"\u0004\b*\u0010(R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b)\u0010-\"\u0004\b.\u0010/R$\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010$\u001a\u0004\b0\u0010&\"\u0004\b1\u0010(R$\u0010\r\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u0010,\u001a\u0004\b3\u0010-\"\u0004\b4\u0010/R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b:\u0010,\u001a\u0004\b;\u0010-\"\u0004\b<\u0010/R$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b=\u0010,\u001a\u0004\b>\u0010-\"\u0004\b?\u0010/R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010@\u001a\u0004\bA\u0010BR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010D\u001a\u0004\b=\u0010F¨\u0006G"}, d2 = {"Lfg0/j;", "Landroid/os/Parcelable;", "Lfg0/d;", "customGoal", "", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/c;", "customLegGoals", "", "isPrimaryEvent", "isGoalMet", "", "associatedWithActivityId", "isTrainingEvent", "trainingPlanId", "Lgg0/e;", "trainingPlanType", "predictedRaceTimeDuration", "projectedRaceTimeDuration", "", "enrollmentTime", "", "projectedRaceSpeed", "predictedRaceSpeed", "<init>", "(Lfg0/d;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Lgg0/e;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "a", "Lfg0/d;", "f", "()Lfg0/d;", "F", "(Lfg0/d;)V", "b", "Ljava/util/List;", "h", "()Ljava/util/List;", "c", "Ljava/lang/Boolean;", "A", "()Ljava/lang/Boolean;", "G", "(Ljava/lang/Boolean;)V", "d", "setGoalMet", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Long;", "()Ljava/lang/Long;", "D", "(Ljava/lang/Long;)V", "C", "H", "g", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "I", "Lgg0/e;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "()Lgg0/e;", "M", "(Lgg0/e;)V", IntegerTokenConverter.CONVERTER_KEY, JWKParameterNames.OCT_KEY_VALUE, "setPredictedRaceTimeDuration", "j", "o", "setProjectedRaceTimeDuration", "Ljava/lang/String;", "getEnrollmentTime", "()Ljava/lang/String;", "l", "Ljava/lang/Double;", "m", "()Ljava/lang/Double;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f71246n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("customGoal")
    private d customGoal;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("customLegGoals")
    private final List<com.garmin.android.apps.connectmobile.workouts.data.model.c> customLegGoals;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isPrimaryEvent")
    private Boolean isPrimaryEvent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isGoalMet")
    private Boolean isGoalMet;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("associatedWithActivityId")
    private Long associatedWithActivityId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isTrainingEvent")
    private Boolean isTrainingEvent;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingPlanId")
    private Long trainingPlanId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingPlanType")
    private gg0.e trainingPlanType;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("predictedRaceTimeDurationSeconds")
    private Long predictedRaceTimeDuration;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("projectedRaceTimeDurationSeconds")
    private Long projectedRaceTimeDuration;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("enrollmentTime")
    private final String enrollmentTime;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("projectedRaceSpeed")
    private final Double projectedRaceSpeed;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("predictedRaceSpeed")
    private final Double predictedRaceSpeed;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            parcel.getClass();
            d dVarCreateFromParcel = parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(com.garmin.android.apps.connectmobile.workouts.data.model.c.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new j(dVarCreateFromParcel, arrayList, boolValueOf, boolValueOf2, lValueOf, boolValueOf3, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : gg0.e.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    public /* synthetic */ j(d dVar, List list, Boolean bool, Boolean bool2, Long l14, Boolean bool3, Long l15, gg0.e eVar, Long l16, Long l17, String str, Double d14, Double d15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : dVar, (i14 & 2) != 0 ? null : list, (i14 & 4) != 0 ? null : bool, (i14 & 8) != 0 ? null : bool2, (i14 & 16) != 0 ? null : l14, (i14 & 32) != 0 ? null : bool3, (i14 & 64) != 0 ? null : l15, (i14 & 128) != 0 ? null : eVar, (i14 & 256) != 0 ? null : l16, (i14 & 512) != 0 ? null : l17, (i14 & 1024) != 0 ? null : str, (i14 & 2048) != 0 ? null : d14, (i14 & 4096) != 0 ? null : d15);
    }

    public static j b(j jVar, d dVar, List list, Boolean bool, Boolean bool2, Long l14, gg0.e eVar, int i14) {
        d dVar2 = (i14 & 1) != 0 ? jVar.customGoal : dVar;
        List list2 = (i14 & 2) != 0 ? jVar.customLegGoals : list;
        Boolean bool3 = (i14 & 4) != 0 ? jVar.isPrimaryEvent : bool;
        Boolean bool4 = jVar.isGoalMet;
        Long l15 = jVar.associatedWithActivityId;
        Boolean bool5 = (i14 & 32) != 0 ? jVar.isTrainingEvent : bool2;
        Long l16 = (i14 & 64) != 0 ? jVar.trainingPlanId : l14;
        gg0.e eVar2 = (i14 & 128) != 0 ? jVar.trainingPlanType : eVar;
        Long l17 = jVar.predictedRaceTimeDuration;
        Long l18 = jVar.projectedRaceTimeDuration;
        String str = jVar.enrollmentTime;
        Double d14 = jVar.projectedRaceSpeed;
        Double d15 = jVar.predictedRaceSpeed;
        jVar.getClass();
        return new j(dVar2, list2, bool3, bool4, l15, bool5, l16, eVar2, l17, l18, str, d14, d15);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final Boolean getIsPrimaryEvent() {
        return this.isPrimaryEvent;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final Boolean getIsTrainingEvent() {
        return this.isTrainingEvent;
    }

    public final void D(Long l14) {
        this.associatedWithActivityId = l14;
    }

    public final void F(d dVar) {
        this.customGoal = dVar;
    }

    public final void G(Boolean bool) {
        this.isPrimaryEvent = bool;
    }

    public final void H(Boolean bool) {
        this.isTrainingEvent = bool;
    }

    public final void I(Long l14) {
        this.trainingPlanId = l14;
    }

    public final void M(gg0.e eVar) {
        this.trainingPlanType = eVar;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getAssociatedWithActivityId() {
        return this.associatedWithActivityId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return p005kotlin.jvm.internal.s.g(this.customGoal, jVar.customGoal) && p005kotlin.jvm.internal.s.g(this.customLegGoals, jVar.customLegGoals) && p005kotlin.jvm.internal.s.g(this.isPrimaryEvent, jVar.isPrimaryEvent) && p005kotlin.jvm.internal.s.g(this.isGoalMet, jVar.isGoalMet) && p005kotlin.jvm.internal.s.g(this.associatedWithActivityId, jVar.associatedWithActivityId) && p005kotlin.jvm.internal.s.g(this.isTrainingEvent, jVar.isTrainingEvent) && p005kotlin.jvm.internal.s.g(this.trainingPlanId, jVar.trainingPlanId) && this.trainingPlanType == jVar.trainingPlanType && p005kotlin.jvm.internal.s.g(this.predictedRaceTimeDuration, jVar.predictedRaceTimeDuration) && p005kotlin.jvm.internal.s.g(this.projectedRaceTimeDuration, jVar.projectedRaceTimeDuration) && p005kotlin.jvm.internal.s.g(this.enrollmentTime, jVar.enrollmentTime) && p005kotlin.jvm.internal.s.g(this.projectedRaceSpeed, jVar.projectedRaceSpeed) && p005kotlin.jvm.internal.s.g(this.predictedRaceSpeed, jVar.predictedRaceSpeed);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final d getCustomGoal() {
        return this.customGoal;
    }

    public final com.garmin.android.apps.connectmobile.workouts.data.model.c g(Integer num) {
        List<com.garmin.android.apps.connectmobile.workouts.data.model.c> list = this.customLegGoals;
        Object obj = null;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            int legIndex = ((com.garmin.android.apps.connectmobile.workouts.data.model.c) obj2).getLegIndex();
            if (num != null && legIndex == num.intValue()) {
                obj = obj2;
                break;
            }
        }
        return (com.garmin.android.apps.connectmobile.workouts.data.model.c) obj;
    }

    public final List<com.garmin.android.apps.connectmobile.workouts.data.model.c> h() {
        return this.customLegGoals;
    }

    public final int hashCode() {
        d dVar = this.customGoal;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.c> list = this.customLegGoals;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isPrimaryEvent;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isGoalMet;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l14 = this.associatedWithActivityId;
        int iHashCode5 = (iHashCode4 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Boolean bool3 = this.isTrainingEvent;
        int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Long l15 = this.trainingPlanId;
        int iHashCode7 = (iHashCode6 + (l15 == null ? 0 : l15.hashCode())) * 31;
        gg0.e eVar = this.trainingPlanType;
        int iHashCode8 = (iHashCode7 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Long l16 = this.predictedRaceTimeDuration;
        int iHashCode9 = (iHashCode8 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Long l17 = this.projectedRaceTimeDuration;
        int iHashCode10 = (iHashCode9 + (l17 == null ? 0 : l17.hashCode())) * 31;
        String str = this.enrollmentTime;
        int iHashCode11 = (iHashCode10 + (str == null ? 0 : str.hashCode())) * 31;
        Double d14 = this.projectedRaceSpeed;
        int iHashCode12 = (iHashCode11 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.predictedRaceSpeed;
        return iHashCode12 + (d15 != null ? d15.hashCode() : 0);
    }

    public final DateTime i() {
        if (g22.n.d(this.enrollmentTime)) {
            return j0.K(this.enrollmentTime, "yyyy-MM-dd'T'HH:mm:ss.SSS");
        }
        return null;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Double getPredictedRaceSpeed() {
        return this.predictedRaceSpeed;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Long getPredictedRaceTimeDuration() {
        return this.predictedRaceTimeDuration;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Double getProjectedRaceSpeed() {
        return this.projectedRaceSpeed;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Long getProjectedRaceTimeDuration() {
        return this.projectedRaceTimeDuration;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Long getTrainingPlanId() {
        return this.trainingPlanId;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final gg0.e getTrainingPlanType() {
        return this.trainingPlanType;
    }

    public final gg0.g s() {
        if (this.customLegGoals != null) {
            return gg0.g.FINISH_WITH_LEG_TIME_GOALS;
        }
        return this.customGoal != null ? gg0.g.FINISH_WITH_AN_OVERALL_GOAL_TIME : gg0.g.FINISH__THE_EVENT;
    }

    public final boolean t() {
        return this.trainingPlanId != null && this.trainingPlanType == gg0.e.COACH_ATP;
    }

    public final String toString() {
        d dVar = this.customGoal;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.c> list = this.customLegGoals;
        Boolean bool = this.isPrimaryEvent;
        Boolean bool2 = this.isGoalMet;
        Long l14 = this.associatedWithActivityId;
        Boolean bool3 = this.isTrainingEvent;
        Long l15 = this.trainingPlanId;
        gg0.e eVar = this.trainingPlanType;
        Long l16 = this.predictedRaceTimeDuration;
        Long l17 = this.projectedRaceTimeDuration;
        String str = this.enrollmentTime;
        Double d14 = this.projectedRaceSpeed;
        Double d15 = this.predictedRaceSpeed;
        StringBuilder sb3 = new StringBuilder("EventCustomizationDTO(customGoal=");
        sb3.append(dVar);
        sb3.append(", customLegGoals=");
        sb3.append(list);
        sb3.append(", isPrimaryEvent=");
        b71.i.o(bool, bool2, ", isGoalMet=", ", associatedWithActivityId=", sb3);
        sb3.append(l14);
        sb3.append(", isTrainingEvent=");
        sb3.append(bool3);
        sb3.append(", trainingPlanId=");
        sb3.append(l15);
        sb3.append(", trainingPlanType=");
        sb3.append(eVar);
        sb3.append(", predictedRaceTimeDuration=");
        kg.f.s(sb3, l16, ", projectedRaceTimeDuration=", l17, ", enrollmentTime=");
        b71.i.x(sb3, str, ", projectedRaceSpeed=", d14, ", predictedRaceSpeed=");
        return b71.i.g(sb3, d15, ")");
    }

    public final boolean u() {
        return this.trainingPlanId != null && this.trainingPlanType == gg0.e.FBT_ADAPTIVE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        d dVar = this.customGoal;
        if (dVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dVar.writeToParcel(parcel, i14);
        }
        List<com.garmin.android.apps.connectmobile.workouts.data.model.c> list = this.customLegGoals;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((com.garmin.android.apps.connectmobile.workouts.data.model.c) itO.next()).writeToParcel(parcel, i14);
            }
        }
        Boolean bool = this.isPrimaryEvent;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        Boolean bool2 = this.isGoalMet;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
        Long l14 = this.associatedWithActivityId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Boolean bool3 = this.isTrainingEvent;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool3);
        }
        Long l15 = this.trainingPlanId;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        gg0.e eVar = this.trainingPlanType;
        if (eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(eVar.name());
        }
        Long l16 = this.predictedRaceTimeDuration;
        if (l16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l16);
        }
        Long l17 = this.projectedRaceTimeDuration;
        if (l17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l17);
        }
        parcel.writeString(this.enrollmentTime);
        Double d14 = this.projectedRaceSpeed;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.predictedRaceSpeed;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
    }

    public final boolean y() {
        return this.customGoal != null;
    }

    public final boolean z() {
        return this.trainingPlanId != null && this.trainingPlanType == gg0.e.ITP;
    }

    public j(d dVar, List<com.garmin.android.apps.connectmobile.workouts.data.model.c> list, Boolean bool, Boolean bool2, Long l14, Boolean bool3, Long l15, gg0.e eVar, Long l16, Long l17, String str, Double d14, Double d15) {
        this.customGoal = dVar;
        this.customLegGoals = list;
        this.isPrimaryEvent = bool;
        this.isGoalMet = bool2;
        this.associatedWithActivityId = l14;
        this.isTrainingEvent = bool3;
        this.trainingPlanId = l15;
        this.trainingPlanType = eVar;
        this.predictedRaceTimeDuration = l16;
        this.projectedRaceTimeDuration = l17;
        this.enrollmentTime = str;
        this.projectedRaceSpeed = d14;
        this.predictedRaceSpeed = d15;
    }

    public j() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }
}
