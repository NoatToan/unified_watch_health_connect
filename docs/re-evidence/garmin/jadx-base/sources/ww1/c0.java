package ww1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0093\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b#\u0010$R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b-\u0010,R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u001e\u001a\u0004\b%\u0010 R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001e\u001a\u0004\b)\u0010 R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u001e\u001a\u0004\b.\u0010 R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\u001e\u001a\u0004\b/\u0010 ¨\u00061"}, d2 = {"Lww1/c0;", "Landroid/os/Parcelable;", "", "athletePlanId", "Lww1/h;", "athleteRace", "", "workoutsPerWeek", "", "_registrationDate", "trainingType", "", "planComplete", "Lww1/y;", "quit", "pause", "baseWeeks", "buildWeeks", "peakWeeks", "planTypeId", "<init>", "(JLww1/h;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLww1/y;Lww1/y;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "J", "b", "()J", "Lww1/h;", "d", "()Lww1/h;", "c", "Ljava/lang/Integer;", "getWorkoutsPerWeek", "()Ljava/lang/Integer;", "Ljava/lang/String;", JWKParameterNames.RSA_EXPONENT, "u", "()Ljava/lang/String;", "f", "Z", "j", "()Z", "g", "Lww1/y;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "()Lww1/y;", "h", IntegerTokenConverter.CONVERTER_KEY, JWKParameterNames.OCT_KEY_VALUE, "l", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c0 implements Parcelable {
    public static final Parcelable.Creator<c0> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("athletePlanId")
    private final long athletePlanId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("athleteRace")
    private final h athleteRace;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutsPerWeek")
    private final Integer workoutsPerWeek;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("registrationDate")
    private final String _registrationDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingType")
    private final String trainingType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("planCompleted")
    private final boolean planComplete;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("quit")
    private final y quit;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pause")
    private final y pause;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("baseWeeks")
    private final Integer baseWeeks;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("buildWeeks")
    private final Integer buildWeeks;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("peakWeeks")
    private final Integer peakWeeks;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutPlanTypeId")
    private final Integer planTypeId;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<c0> {
        @Override // android.os.Parcelable.Creator
        public final c0 createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer num;
            Integer num2;
            Integer numValueOf2;
            parcel.getClass();
            long j8 = parcel.readLong();
            h hVarCreateFromParcel = parcel.readInt() == 0 ? null : h.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                numValueOf = null;
                num = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
                num = null;
            }
            String string = parcel.readString();
            Integer num3 = numValueOf;
            String string2 = parcel.readString();
            boolean z14 = parcel.readInt() != 0;
            y yVar = (y) (parcel.readInt() == 0 ? num : y.CREATOR.createFromParcel(parcel));
            y yVar2 = (y) (parcel.readInt() == 0 ? num : y.CREATOR.createFromParcel(parcel));
            Integer numValueOf3 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
            Integer numValueOf4 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
            Integer numValueOf5 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                Integer num4 = numValueOf4;
                numValueOf2 = num;
                num2 = num4;
            } else {
                num2 = numValueOf4;
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new c0(j8, hVarCreateFromParcel, num3, string, string2, z14, yVar, yVar2, numValueOf3, num2, numValueOf5, numValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final c0[] newArray(int i14) {
            return new c0[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public /* synthetic */ c0(long j8, h hVar, Integer num, String str, String str2, boolean z14, y yVar, y yVar2, Integer num2, Integer num3, Integer num4, Integer num5, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? 0L : j8, (i14 & 2) != 0 ? null : hVar, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? null : str, (i14 & 16) != 0 ? null : str2, (i14 & 32) != 0 ? false : z14, (i14 & 64) != 0 ? null : yVar, (i14 & 128) != 0 ? null : yVar2, (i14 & 256) != 0 ? null : num2, (i14 & 512) != 0 ? null : num3, (i14 & 1024) != 0 ? null : num4, (i14 & 2048) != 0 ? null : num5);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getAthletePlanId() {
        return this.athletePlanId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final h getAthleteRace() {
        return this.athleteRace;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.athletePlanId == c0Var.athletePlanId && p005kotlin.jvm.internal.s.g(this.athleteRace, c0Var.athleteRace) && p005kotlin.jvm.internal.s.g(this.workoutsPerWeek, c0Var.workoutsPerWeek) && p005kotlin.jvm.internal.s.g(this._registrationDate, c0Var._registrationDate) && p005kotlin.jvm.internal.s.g(this.trainingType, c0Var.trainingType) && this.planComplete == c0Var.planComplete && p005kotlin.jvm.internal.s.g(this.quit, c0Var.quit) && p005kotlin.jvm.internal.s.g(this.pause, c0Var.pause) && p005kotlin.jvm.internal.s.g(this.baseWeeks, c0Var.baseWeeks) && p005kotlin.jvm.internal.s.g(this.buildWeeks, c0Var.buildWeeks) && p005kotlin.jvm.internal.s.g(this.peakWeeks, c0Var.peakWeeks) && p005kotlin.jvm.internal.s.g(this.planTypeId, c0Var.planTypeId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getBaseWeeks() {
        return this.baseWeeks;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getBuildWeeks() {
        return this.buildWeeks;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final y getPause() {
        return this.pause;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.athletePlanId) * 31;
        h hVar = this.athleteRace;
        int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        Integer num = this.workoutsPerWeek;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this._registrationDate;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.trainingType;
        int iG = q6.f.g((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.planComplete);
        y yVar = this.quit;
        int iHashCode5 = (iG + (yVar == null ? 0 : yVar.hashCode())) * 31;
        y yVar2 = this.pause;
        int iHashCode6 = (iHashCode5 + (yVar2 == null ? 0 : yVar2.hashCode())) * 31;
        Integer num2 = this.baseWeeks;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.buildWeeks;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.peakWeeks;
        int iHashCode9 = (iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.planTypeId;
        return iHashCode9 + (num5 != null ? num5.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Integer getPeakWeeks() {
        return this.peakWeeks;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getPlanComplete() {
        return this.planComplete;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Integer getPlanTypeId() {
        return this.planTypeId;
    }

    public final int m() {
        DateTime dateTimeR = r();
        if (dateTimeR == null) {
            return 0;
        }
        h hVar = this.athleteRace;
        DateTime dateTimeB = hVar != null ? hVar.b() : null;
        if (dateTimeB == null || !dateTimeB.isBeforeNow()) {
            dateTimeB = DateTime.now().withTimeAtStartOfDay();
        }
        return Days.daysBetween(dateTimeR, dateTimeB).getDays() + 1;
    }

    public final int o() {
        int i14 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).e1().f77271c;
        DateTime dateTimeR = r();
        if (dateTimeR == null) {
            return 0;
        }
        fy1.a.C1500a c1500a = fy1.a.f73883a;
        DateTime dateTimeWithTimeAtStartOfDay = dateTimeR.withTimeAtStartOfDay();
        dateTimeWithTimeAtStartOfDay.getClass();
        DateTime dateTimeWithTimeAtStartOfDay2 = DateTime.now().withTimeAtStartOfDay();
        dateTimeWithTimeAtStartOfDay2.getClass();
        c1500a.getClass();
        return fy1.a.C1500a.a(i14, dateTimeWithTimeAtStartOfDay, dateTimeWithTimeAtStartOfDay2);
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final y getQuit() {
        return this.quit;
    }

    public final DateTime r() {
        String str = this._registrationDate;
        if (str != null) {
            try {
                return g22.k.p(str, "yyyy-MM-dd'T'HH:mm:ss.SSS", null);
            } catch (IllegalArgumentException e4) {
                String strN = fb1.c.n("Error parsing registration day: ", e4.getMessage());
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.f(a2Var, "TrainingPlanDetailBrief", strN);
            }
        }
        return null;
    }

    public final int s() {
        DateTime dateTimeR = r();
        h hVar = this.athleteRace;
        DateTime dateTimeB = hVar != null ? hVar.b() : null;
        if (dateTimeR == null || dateTimeB == null) {
            return 0;
        }
        return Days.daysBetween(dateTimeR, dateTimeB).getDays() + 1;
    }

    public final int t() {
        int i14 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).e1().f77271c;
        DateTime dateTimeR = r();
        h hVar = this.athleteRace;
        DateTime dateTimeB = hVar != null ? hVar.b() : null;
        if (dateTimeR == null || dateTimeB == null) {
            return 0;
        }
        fy1.a.f73883a.getClass();
        return fy1.a.C1500a.a(i14, dateTimeR, dateTimeB);
    }

    public final String toString() {
        long j8 = this.athletePlanId;
        h hVar = this.athleteRace;
        Integer num = this.workoutsPerWeek;
        String str = this._registrationDate;
        String str2 = this.trainingType;
        boolean z14 = this.planComplete;
        y yVar = this.quit;
        y yVar2 = this.pause;
        Integer num2 = this.baseWeeks;
        Integer num3 = this.buildWeeks;
        Integer num4 = this.peakWeeks;
        Integer num5 = this.planTypeId;
        StringBuilder sb3 = new StringBuilder("TrainingPlanDetailBrief(athletePlanId=");
        sb3.append(j8);
        sb3.append(", athleteRace=");
        sb3.append(hVar);
        sb3.append(", workoutsPerWeek=");
        sb3.append(num);
        sb3.append(", _registrationDate=");
        sb3.append(str);
        com.airbnb.lottie.animation.keyframe.a.t(", trainingType=", str2, ", planComplete=", sb3, z14);
        sb3.append(", quit=");
        sb3.append(yVar);
        sb3.append(", pause=");
        sb3.append(yVar2);
        sb3.append(", baseWeeks=");
        sb3.append(num2);
        sb3.append(", buildWeeks=");
        sb3.append(num3);
        sb3.append(", peakWeeks=");
        sb3.append(num4);
        sb3.append(", planTypeId=");
        sb3.append(num5);
        sb3.append(")");
        return sb3.toString();
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getTrainingType() {
        return this.trainingType;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.athletePlanId);
        h hVar = this.athleteRace;
        if (hVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hVar.writeToParcel(parcel, i14);
        }
        Integer num = this.workoutsPerWeek;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this._registrationDate);
        parcel.writeString(this.trainingType);
        parcel.writeInt(this.planComplete ? 1 : 0);
        y yVar = this.quit;
        if (yVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yVar.writeToParcel(parcel, i14);
        }
        y yVar2 = this.pause;
        if (yVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yVar2.writeToParcel(parcel, i14);
        }
        Integer num2 = this.baseWeeks;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Integer num3 = this.buildWeeks;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        Integer num4 = this.peakWeeks;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num4);
        }
        Integer num5 = this.planTypeId;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num5);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lww1/c0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "DATE_FORMAT", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public c0(long j8, h hVar, Integer num, String str, String str2, boolean z14, y yVar, y yVar2, Integer num2, Integer num3, Integer num4, Integer num5) {
        this.athletePlanId = j8;
        this.athleteRace = hVar;
        this.workoutsPerWeek = num;
        this._registrationDate = str;
        this.trainingType = str2;
        this.planComplete = z14;
        this.quit = yVar;
        this.pause = yVar2;
        this.baseWeeks = num2;
        this.buildWeeks = num3;
        this.peakWeeks = num4;
        this.planTypeId = num5;
    }

    public c0() {
        this(0L, null, null, null, null, false, null, null, null, null, null, null, 4095, null);
    }
}
