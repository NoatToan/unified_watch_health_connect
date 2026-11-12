package fu1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b \u0010\u0012R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b!\u0010\u0019¨\u0006\""}, d2 = {"Lfu1/q;", "Landroid/os/Parcelable;", "", "activityId", "Lfu1/x;", "performanceRating", "", "race", "scheduleWorkoutId", "", "scheduledWorkoutDate", "workoutId", "benchmark", "<init>", "(Ljava/lang/Long;Lfu1/x;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;)V", "a", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "Lfu1/x;", "f", "()Lfu1/x;", "c", "Ljava/lang/Boolean;", "getRace", "()Ljava/lang/Boolean;", "d", "g", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/String;", "h", "()Ljava/lang/String;", "j", "getBenchmark", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q implements Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityId")
    private final Long activityId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("performanceRating")
    private final x performanceRating;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("race")
    private final Boolean race;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("scheduleWorkoutId")
    private final Long scheduleWorkoutId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("scheduledWorkoutDate")
    private final String scheduledWorkoutDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutId")
    private final Long workoutId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("benchmark")
    private final Boolean benchmark;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<q> {
        @Override // android.os.Parcelable.Creator
        public final q createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            parcel.getClass();
            Boolean boolValueOf2 = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            x xVarCreateFromParcel = parcel.readInt() == 0 ? null : x.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new q(lValueOf, xVarCreateFromParcel, boolValueOf, lValueOf2, string, lValueOf3, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final q[] newArray(int i14) {
            return new q[i14];
        }
    }

    public /* synthetic */ q(Long l14, x xVar, Boolean bool, Long l15, String str, Long l16, Boolean bool2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : xVar, (i14 & 4) != 0 ? null : bool, (i14 & 8) != 0 ? null : l15, (i14 & 16) != 0 ? null : str, (i14 & 32) != 0 ? null : l16, (i14 & 64) != 0 ? null : bool2);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getActivityId() {
        return this.activityId;
    }

    public final long d() {
        Long l14 = this.activityId;
        if (l14 != null) {
            return l14.longValue();
        }
        return 0L;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return p005kotlin.jvm.internal.s.g(this.activityId, qVar.activityId) && p005kotlin.jvm.internal.s.g(this.performanceRating, qVar.performanceRating) && p005kotlin.jvm.internal.s.g(this.race, qVar.race) && p005kotlin.jvm.internal.s.g(this.scheduleWorkoutId, qVar.scheduleWorkoutId) && p005kotlin.jvm.internal.s.g(this.scheduledWorkoutDate, qVar.scheduledWorkoutDate) && p005kotlin.jvm.internal.s.g(this.workoutId, qVar.workoutId) && p005kotlin.jvm.internal.s.g(this.benchmark, qVar.benchmark);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final x getPerformanceRating() {
        return this.performanceRating;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getScheduleWorkoutId() {
        return this.scheduleWorkoutId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getScheduledWorkoutDate() {
        return this.scheduledWorkoutDate;
    }

    public final int hashCode() {
        Long l14 = this.activityId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        x xVar = this.performanceRating;
        int iHashCode2 = (iHashCode + (xVar == null ? 0 : xVar.hashCode())) * 31;
        Boolean bool = this.race;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l15 = this.scheduleWorkoutId;
        int iHashCode4 = (iHashCode3 + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str = this.scheduledWorkoutDate;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Long l16 = this.workoutId;
        int iHashCode6 = (iHashCode5 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Boolean bool2 = this.benchmark;
        return iHashCode6 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final DateTime i() {
        String str = this.scheduledWorkoutDate;
        if (str != null) {
            return g22.k.q(str, "yyyy-MM-dd", null);
        }
        return null;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Long getWorkoutId() {
        return this.workoutId;
    }

    public final long k() {
        Long l14 = this.workoutId;
        if (l14 != null) {
            return l14.longValue();
        }
        return 0L;
    }

    public final boolean m() {
        Boolean bool = this.benchmark;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean o() {
        Boolean bool = this.race;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final String toString() {
        Long l14 = this.activityId;
        x xVar = this.performanceRating;
        Boolean bool = this.race;
        Long l15 = this.scheduleWorkoutId;
        String str = this.scheduledWorkoutDate;
        Long l16 = this.workoutId;
        Boolean bool2 = this.benchmark;
        StringBuilder sb3 = new StringBuilder("GradedWorkoutDTO(activityId=");
        sb3.append(l14);
        sb3.append(", performanceRating=");
        sb3.append(xVar);
        sb3.append(", race=");
        sb3.append(bool);
        sb3.append(", scheduleWorkoutId=");
        sb3.append(l15);
        sb3.append(", scheduledWorkoutDate=");
        n23.j.q(l16, str, ", workoutId=", ", benchmark=", sb3);
        return p6.b.f(sb3, bool2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.activityId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        x xVar = this.performanceRating;
        if (xVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            xVar.writeToParcel(parcel, i14);
        }
        Boolean bool = this.race;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        Long l15 = this.scheduleWorkoutId;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeString(this.scheduledWorkoutDate);
        Long l16 = this.workoutId;
        if (l16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l16);
        }
        Boolean bool2 = this.benchmark;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
    }

    public q(Long l14, x xVar, Boolean bool, Long l15, String str, Long l16, Boolean bool2) {
        this.activityId = l14;
        this.performanceRating = xVar;
        this.race = bool;
        this.scheduleWorkoutId = l15;
        this.scheduledWorkoutDate = str;
        this.workoutId = l16;
        this.benchmark = bool2;
    }

    public q() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
