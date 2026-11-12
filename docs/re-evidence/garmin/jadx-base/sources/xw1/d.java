package xw1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import j20.x;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;
import rt1.r;
import ww1.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b@\b\u0087\b\u0018\u00002\u00020\u0001:\u0001 Bß\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)\"\u0004\b,\u0010-R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010;\u001a\u0004\b<\u0010=R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u00108\u001a\u0004\b?\u0010:R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b>\u0010BR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010;\u001a\u0004\bD\u0010=R$\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bD\u0010;\u001a\u0004\bE\u0010=\"\u0004\bF\u0010GR$\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bH\u0010;\u001a\u0004\bI\u0010=\"\u0004\bJ\u0010GR$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\b7\u0010M\"\u0004\bN\u0010OR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010;\u001a\u0004\bK\u0010=R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010Q\u001a\u0004\bR\u0010SR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\b@\u0010VR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010Q\u001a\u0004\bW\u0010SR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[¨\u0006\\"}, d2 = {"Lxw1/d;", "Landroid/os/Parcelable;", "Lxw1/b;", "action", "", "athletePlanId", "workoutPlanId", "", "workoutPlanTypeId", "", "", "workoutCalendarDays", "longRunDay", "workoutsPerWeek", "registrationDate", "Lww1/h;", "athleteRace", "confidence", "prePlanWeeklyMileage", "prePlanTrainingPace", "Lxw1/m;", "athletePlanGoal", "goalTimeSeconds", "Lww1/y;", "quit", "Lxw1/e;", "coach", "pause", "", "planCompleted", "<init>", "(Lxw1/b;JJILjava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lww1/h;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lxw1/m;Ljava/lang/Integer;Lww1/y;Lxw1/e;Lww1/y;Ljava/lang/Boolean;)V", "a", "Lxw1/b;", "d", "()Lxw1/b;", "setAction", "(Lxw1/b;)V", "b", "J", "g", "()J", "c", "D", "setWorkoutPlanId", "(J)V", "I", "F", "()I", "setWorkoutPlanTypeId", "(I)V", JWKParameterNames.RSA_EXPONENT, "Ljava/util/List;", "C", "()Ljava/util/List;", "f", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "Ljava/lang/Integer;", "G", "()Ljava/lang/Integer;", "h", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, IntegerTokenConverter.CONVERTER_KEY, "Lww1/h;", "()Lww1/h;", "j", JWKParameterNames.OCT_KEY_VALUE, "u", "setPrePlanWeeklyMileage", "(Ljava/lang/Integer;)V", "l", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "setPrePlanTrainingPace", "m", "Lxw1/m;", "()Lxw1/m;", "setAthletePlanGoal", "(Lxw1/m;)V", JWKParameterNames.RSA_MODULUS, "Lww1/y;", "getQuit", "()Lww1/y;", "p", "Lxw1/e;", "()Lxw1/e;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "Ljava/lang/Boolean;", "getPlanCompleted", "()Ljava/lang/Boolean;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("action")
    private xw1.b action;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("athletePlanId")
    private final long athletePlanId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutPlanId")
    private long workoutPlanId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutPlanTypeId")
    private int workoutPlanTypeId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutCalendarDays")
    private final List<String> workoutCalendarDays;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("longRunDay")
    private final String longRunDay;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutsPerWeek")
    private final Integer workoutsPerWeek;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("registrationDate")
    private final String registrationDate;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("athleteRace")
    private final ww1.h athleteRace;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("confidence")
    private final Integer confidence;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("prePlanWeeklyMileage")
    private Integer prePlanWeeklyMileage;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("prePlanTrainingPace")
    private Integer prePlanTrainingPace;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("athletePlanGoal")
    private m athletePlanGoal;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("goalTimeSeconds")
    private final Integer goalTimeSeconds;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("quit")
    private final y quit;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("coach")
    private final e coach;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pause")
    private final y pause;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("planCompleted")
    private final Boolean planCompleted;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            xw1.b bVar;
            Integer num;
            Boolean boolValueOf;
            parcel.getClass();
            xw1.b bVarCreateFromParcel = parcel.readInt() == 0 ? null : xw1.b.CREATOR.createFromParcel(parcel);
            long j8 = parcel.readLong();
            long j14 = parcel.readLong();
            int i14 = parcel.readInt();
            m mVarCreateFromParcel = null;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string2 = parcel.readString();
            ww1.h hVarCreateFromParcel = parcel.readInt() == 0 ? null : ww1.h.CREATOR.createFromParcel(parcel);
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                mVarCreateFromParcel = m.CREATOR.createFromParcel(parcel);
            }
            m mVar = mVarCreateFromParcel;
            Integer numValueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            y yVarCreateFromParcel = parcel.readInt() == 0 ? null : y.CREATOR.createFromParcel(parcel);
            e eVarCreateFromParcel = parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel);
            y yVarCreateFromParcel2 = parcel.readInt() == 0 ? null : y.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                bVar = bVarCreateFromParcel;
                num = numValueOf3;
                boolValueOf = null;
            } else {
                bVar = r1;
                num = numValueOf3;
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new d(bVar, j8, j14, i14, arrayListCreateStringArrayList, string, numValueOf, string2, hVarCreateFromParcel, numValueOf2, num, numValueOf4, mVar, numValueOf5, yVarCreateFromParcel, eVarCreateFromParcel, yVarCreateFromParcel2, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public d(xw1.b bVar, long j8, long j14, int i14, List list, String str, Integer num, String str2, ww1.h hVar, Integer num2, Integer num3, Integer num4, m mVar, Integer num5, y yVar, e eVar, y yVar2, Boolean bool, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? null : bVar, (i15 & 2) != 0 ? 0L : j8, (i15 & 4) == 0 ? j14 : 0L, (i15 & 8) != 0 ? r.FIVE_K.f154560a : i14, (i15 & 16) != 0 ? null : list, (i15 & 32) != 0 ? null : str, (i15 & 64) != 0 ? null : num, (i15 & 128) != 0 ? null : str2, (i15 & 256) != 0 ? null : hVar, (i15 & 512) != 0 ? null : num2, (i15 & 1024) != 0 ? null : num3, (i15 & 2048) != 0 ? null : num4, (i15 & 4096) != 0 ? null : mVar, (i15 & 8192) != 0 ? null : num5, (i15 & 16384) != 0 ? null : yVar, (i15 & 32768) != 0 ? null : eVar, (i15 & 65536) != 0 ? null : yVar2, (i15 & 131072) != 0 ? null : bool);
    }

    public final int A(int i14) {
        DateTime dateTimeS = s();
        ww1.h hVar = this.athleteRace;
        DateTime dateTimeB = hVar != null ? hVar.b() : null;
        if (dateTimeS == null || dateTimeB == null) {
            return 0;
        }
        fy1.a.f73883a.getClass();
        return fy1.a.C1500a.a(i14, dateTimeS, dateTimeB);
    }

    public final List<String> C() {
        return this.workoutCalendarDays;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final long getWorkoutPlanId() {
        return this.workoutPlanId;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final int getWorkoutPlanTypeId() {
        return this.workoutPlanTypeId;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final Integer getWorkoutsPerWeek() {
        return this.workoutsPerWeek;
    }

    public final boolean H() {
        Integer num = this.confidence;
        return num != null && num.intValue() > 0;
    }

    public final boolean I() {
        xw1.b bVar = this.action;
        if (bVar != null) {
            return bVar.g();
        }
        return false;
    }

    public final boolean M() {
        y yVar = this.quit;
        return yVar != null && s.g(yVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.STATE java.lang.String(), Boolean.TRUE);
    }

    public final boolean Z() {
        return (M() || e0() || a0()) ? false : true;
    }

    public final boolean a0() {
        return s.g(this.planCompleted, Boolean.TRUE);
    }

    public final void b() {
        this.action = null;
    }

    public final boolean c0() {
        return (M() || a0()) ? false : true;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final xw1.b getAction() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e0() {
        y yVar = this.pause;
        return yVar != null && s.g(yVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.STATE java.lang.String(), Boolean.TRUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.action, dVar.action) && this.athletePlanId == dVar.athletePlanId && this.workoutPlanId == dVar.workoutPlanId && this.workoutPlanTypeId == dVar.workoutPlanTypeId && s.g(this.workoutCalendarDays, dVar.workoutCalendarDays) && s.g(this.longRunDay, dVar.longRunDay) && s.g(this.workoutsPerWeek, dVar.workoutsPerWeek) && s.g(this.registrationDate, dVar.registrationDate) && s.g(this.athleteRace, dVar.athleteRace) && s.g(this.confidence, dVar.confidence) && s.g(this.prePlanWeeklyMileage, dVar.prePlanWeeklyMileage) && s.g(this.prePlanTrainingPace, dVar.prePlanTrainingPace) && s.g(this.athletePlanGoal, dVar.athletePlanGoal) && s.g(this.goalTimeSeconds, dVar.goalTimeSeconds) && s.g(this.quit, dVar.quit) && s.g(this.coach, dVar.coach) && s.g(this.pause, dVar.pause) && s.g(this.planCompleted, dVar.planCompleted);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final m getAthletePlanGoal() {
        return this.athletePlanGoal;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getAthletePlanId() {
        return this.athletePlanId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final ww1.h getAthleteRace() {
        return this.athleteRace;
    }

    public final int hashCode() {
        xw1.b bVar = this.action;
        int iD = q2.d(this.workoutPlanTypeId, q6.f.e(q6.f.e((bVar == null ? 0 : bVar.hashCode()) * 31, 31, this.athletePlanId), 31, this.workoutPlanId), 31);
        List<String> list = this.workoutCalendarDays;
        int iHashCode = (iD + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.longRunDay;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.workoutsPerWeek;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.registrationDate;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ww1.h hVar = this.athleteRace;
        int iHashCode5 = (iHashCode4 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        Integer num2 = this.confidence;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.prePlanWeeklyMileage;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.prePlanTrainingPace;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        m mVar = this.athletePlanGoal;
        int iHashCode9 = (iHashCode8 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        Integer num5 = this.goalTimeSeconds;
        int iHashCode10 = (iHashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
        y yVar = this.quit;
        int iHashCode11 = (iHashCode10 + (yVar == null ? 0 : yVar.hashCode())) * 31;
        e eVar = this.coach;
        int iHashCode12 = (iHashCode11 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        y yVar2 = this.pause;
        int iHashCode13 = (iHashCode12 + (yVar2 == null ? 0 : yVar2.hashCode())) * 31;
        Boolean bool = this.planCompleted;
        return iHashCode13 + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final e getCoach() {
        return this.coach;
    }

    public final int j(int i14, DateTime dateTime) {
        DateTime dateTimeS = s();
        if (dateTimeS == null) {
            return 0;
        }
        fy1.a.C1500a c1500a = fy1.a.f73883a;
        DateTime dateTimeWithTimeAtStartOfDay = dateTimeS.withTimeAtStartOfDay();
        dateTimeWithTimeAtStartOfDay.getClass();
        DateTime dateTimeWithTimeAtStartOfDay2 = dateTime.withTimeAtStartOfDay();
        dateTimeWithTimeAtStartOfDay2.getClass();
        c1500a.getClass();
        return fy1.a.C1500a.a(i14, dateTimeWithTimeAtStartOfDay, dateTimeWithTimeAtStartOfDay2);
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Integer getConfidence() {
        return this.confidence;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Integer getGoalTimeSeconds() {
        return this.goalTimeSeconds;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getLongRunDay() {
        return this.longRunDay;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final y getPause() {
        return this.pause;
    }

    public final DateTime r() {
        ww1.h hVar = this.athleteRace;
        if (hVar != null) {
            return hVar.b();
        }
        return null;
    }

    public final DateTime s() {
        String str = this.registrationDate;
        if (str == null) {
            return null;
        }
        try {
            LocalDateTime localDateTime = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ").parseLocalDateTime(str);
            localDateTime.getClass();
            return localDateTime.toDateTime();
        } catch (IllegalArgumentException e4) {
            String strN = fb1.c.n("Error parsing the registration date: ", e4.getMessage());
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "AthletePlanDTO", strN);
            return null;
        }
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Integer getPrePlanTrainingPace() {
        return this.prePlanTrainingPace;
    }

    public final String toString() {
        xw1.b bVar = this.action;
        long j8 = this.athletePlanId;
        long j14 = this.workoutPlanId;
        int i14 = this.workoutPlanTypeId;
        List<String> list = this.workoutCalendarDays;
        String str = this.longRunDay;
        Integer num = this.workoutsPerWeek;
        String str2 = this.registrationDate;
        ww1.h hVar = this.athleteRace;
        Integer num2 = this.confidence;
        Integer num3 = this.prePlanWeeklyMileage;
        Integer num4 = this.prePlanTrainingPace;
        m mVar = this.athletePlanGoal;
        Integer num5 = this.goalTimeSeconds;
        y yVar = this.quit;
        e eVar = this.coach;
        y yVar2 = this.pause;
        Boolean bool = this.planCompleted;
        StringBuilder sb3 = new StringBuilder("AthletePlanDTO(action=");
        sb3.append(bVar);
        sb3.append(", athletePlanId=");
        sb3.append(j8);
        x.j(j14, ", workoutPlanId=", ", workoutPlanTypeId=", sb3);
        sb3.append(i14);
        sb3.append(", workoutCalendarDays=");
        sb3.append(list);
        sb3.append(", longRunDay=");
        fb1.c.u(num, str, ", workoutsPerWeek=", ", registrationDate=", sb3);
        sb3.append(str2);
        sb3.append(", athleteRace=");
        sb3.append(hVar);
        sb3.append(", confidence=");
        x.m(sb3, num2, ", prePlanWeeklyMileage=", num3, ", prePlanTrainingPace=");
        sb3.append(num4);
        sb3.append(", athletePlanGoal=");
        sb3.append(mVar);
        sb3.append(", goalTimeSeconds=");
        sb3.append(num5);
        sb3.append(", quit=");
        sb3.append(yVar);
        sb3.append(", coach=");
        sb3.append(eVar);
        sb3.append(", pause=");
        sb3.append(yVar2);
        sb3.append(", planCompleted=");
        return p6.b.f(sb3, bool, ")");
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final Integer getPrePlanWeeklyMileage() {
        return this.prePlanWeeklyMileage;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        xw1.b bVar = this.action;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar.writeToParcel(parcel, i14);
        }
        parcel.writeLong(this.athletePlanId);
        parcel.writeLong(this.workoutPlanId);
        parcel.writeInt(this.workoutPlanTypeId);
        parcel.writeStringList(this.workoutCalendarDays);
        parcel.writeString(this.longRunDay);
        Integer num = this.workoutsPerWeek;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.registrationDate);
        ww1.h hVar = this.athleteRace;
        if (hVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hVar.writeToParcel(parcel, i14);
        }
        Integer num2 = this.confidence;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Integer num3 = this.prePlanWeeklyMileage;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        Integer num4 = this.prePlanTrainingPace;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num4);
        }
        m mVar = this.athletePlanGoal;
        if (mVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mVar.writeToParcel(parcel, i14);
        }
        Integer num5 = this.goalTimeSeconds;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num5);
        }
        y yVar = this.quit;
        if (yVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yVar.writeToParcel(parcel, i14);
        }
        e eVar = this.coach;
        if (eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar.writeToParcel(parcel, i14);
        }
        y yVar2 = this.pause;
        if (yVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yVar2.writeToParcel(parcel, i14);
        }
        Boolean bool = this.planCompleted;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final String getRegistrationDate() {
        return this.registrationDate;
    }

    public final int z() {
        DateTime dateTimeS = s();
        ww1.h hVar = this.athleteRace;
        DateTime dateTimeB = hVar != null ? hVar.b() : null;
        if (dateTimeS != null) {
            return Days.daysBetween(dateTimeS, dateTimeB).getDays() + 1;
        }
        return 0;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxw1/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public d(xw1.b bVar, long j8, long j14, int i14, List<String> list, String str, Integer num, String str2, ww1.h hVar, Integer num2, Integer num3, Integer num4, m mVar, Integer num5, y yVar, e eVar, y yVar2, Boolean bool) {
        this.action = bVar;
        this.athletePlanId = j8;
        this.workoutPlanId = j14;
        this.workoutPlanTypeId = i14;
        this.workoutCalendarDays = list;
        this.longRunDay = str;
        this.workoutsPerWeek = num;
        this.registrationDate = str2;
        this.athleteRace = hVar;
        this.confidence = num2;
        this.prePlanWeeklyMileage = num3;
        this.prePlanTrainingPace = num4;
        this.athletePlanGoal = mVar;
        this.goalTimeSeconds = num5;
        this.quit = yVar;
        this.coach = eVar;
        this.pause = yVar2;
        this.planCompleted = bool;
    }

    public d() {
        this(null, 0L, 0L, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
    }
}
