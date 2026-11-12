package ix1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import j20.x;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b!\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\"\u0010 R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0013\u001a\u0004\b$\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b%\u0010\u0019R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0013\u001a\u0004\b&\u0010\u0015R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b'\u0010 ¨\u0006("}, d2 = {"Lix1/c;", "Landroid/os/Parcelable;", "", "activityId", "", "benchmarkCategoryKey", "benchmarkId", "benchmarkKey", "", "benchmarkValueInGrams", "maxWeightInGrams", "reps", "workoutId", "workoutName", "workoutScheduleId", "userAccountBenchmarkValue", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;)V", "a", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "b", "Ljava/lang/String;", "getBenchmarkCategoryKey", "()Ljava/lang/String;", "c", "f", "g", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Integer;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/Integer;", "j", JWKParameterNames.OCT_KEY_VALUE, "h", "getWorkoutId", "getWorkoutName", "getWorkoutScheduleId", "m", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityId")
    private final Long activityId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("benchmarkCategoryKey")
    private final String benchmarkCategoryKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("benchmarkId")
    private final Long benchmarkId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("benchmarkKey")
    private final String benchmarkKey;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("benchmarkValue")
    private final Integer benchmarkValueInGrams;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxWeight")
    private final Integer maxWeightInGrams;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reps")
    private final Integer reps;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutId")
    private final Long workoutId;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutName")
    private final String workoutName;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutScheduleId")
    private final Long workoutScheduleId;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userAccountBenchmarkValue")
    private final Integer userAccountBenchmarkValue;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            Long lValueOf;
            Long l14;
            Long l15;
            Integer numValueOf;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                lValueOf = null;
                l14 = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
                l14 = null;
            }
            String string = parcel.readString();
            Long lValueOf2 = parcel.readInt() == 0 ? l14 : Long.valueOf(parcel.readLong());
            String string2 = parcel.readString();
            Object objValueOf = parcel.readInt() == 0 ? l14 : Integer.valueOf(parcel.readInt());
            Object objValueOf2 = parcel.readInt() == 0 ? l14 : Integer.valueOf(parcel.readInt());
            Object objValueOf3 = parcel.readInt() == 0 ? l14 : Integer.valueOf(parcel.readInt());
            Long lValueOf3 = parcel.readInt() == 0 ? l14 : Long.valueOf(parcel.readLong());
            String string3 = parcel.readString();
            Long lValueOf4 = parcel.readInt() == 0 ? l14 : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                Long l16 = lValueOf4;
                numValueOf = l14;
                l15 = l16;
            } else {
                l15 = lValueOf4;
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new c(lValueOf, string, lValueOf2, string2, objValueOf, objValueOf2, objValueOf3, lValueOf3, string3, l15, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public c(Long l14, String str, Long l15, String str2, Integer num, Integer num2, Integer num3, Long l16, String str3, Long l17, Integer num4) {
        this.activityId = l14;
        this.benchmarkCategoryKey = str;
        this.benchmarkId = l15;
        this.benchmarkKey = str2;
        this.benchmarkValueInGrams = num;
        this.maxWeightInGrams = num2;
        this.reps = num3;
        this.workoutId = l16;
        this.workoutName = str3;
        this.workoutScheduleId = l17;
        this.userAccountBenchmarkValue = num4;
    }

    public static c b(c cVar, Long l14) {
        return new c(cVar.activityId, cVar.benchmarkCategoryKey, l14, cVar.benchmarkKey, cVar.benchmarkValueInGrams, cVar.maxWeightInGrams, cVar.reps, cVar.workoutId, cVar.workoutName, cVar.workoutScheduleId, cVar.userAccountBenchmarkValue);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getActivityId() {
        return this.activityId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.activityId, cVar.activityId) && s.g(this.benchmarkCategoryKey, cVar.benchmarkCategoryKey) && s.g(this.benchmarkId, cVar.benchmarkId) && s.g(this.benchmarkKey, cVar.benchmarkKey) && s.g(this.benchmarkValueInGrams, cVar.benchmarkValueInGrams) && s.g(this.maxWeightInGrams, cVar.maxWeightInGrams) && s.g(this.reps, cVar.reps) && s.g(this.workoutId, cVar.workoutId) && s.g(this.workoutName, cVar.workoutName) && s.g(this.workoutScheduleId, cVar.workoutScheduleId) && s.g(this.userAccountBenchmarkValue, cVar.userAccountBenchmarkValue);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getBenchmarkId() {
        return this.benchmarkId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getBenchmarkKey() {
        return this.benchmarkKey;
    }

    public final d h() {
        Object next;
        d.a aVar = d.f95717a;
        String str = this.benchmarkKey;
        aVar.getClass();
        Iterator<T> it = d.f95719c.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (s.g(((d) next).name(), str)) {
                return (d) next;
            }
        }
        next = null;
        return (d) next;
    }

    public final int hashCode() {
        Long l14 = this.activityId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.benchmarkCategoryKey;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l15 = this.benchmarkId;
        int iHashCode3 = (iHashCode2 + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str2 = this.benchmarkKey;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.benchmarkValueInGrams;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxWeightInGrams;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.reps;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l16 = this.workoutId;
        int iHashCode8 = (iHashCode7 + (l16 == null ? 0 : l16.hashCode())) * 31;
        String str3 = this.workoutName;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l17 = this.workoutScheduleId;
        int iHashCode10 = (iHashCode9 + (l17 == null ? 0 : l17.hashCode())) * 31;
        Integer num4 = this.userAccountBenchmarkValue;
        return iHashCode10 + (num4 != null ? num4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Integer getBenchmarkValueInGrams() {
        return this.benchmarkValueInGrams;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Integer getMaxWeightInGrams() {
        return this.maxWeightInGrams;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Integer getReps() {
        return this.reps;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Integer getUserAccountBenchmarkValue() {
        return this.userAccountBenchmarkValue;
    }

    public final String toString() {
        Long l14 = this.activityId;
        String str = this.benchmarkCategoryKey;
        Long l15 = this.benchmarkId;
        String str2 = this.benchmarkKey;
        Integer num = this.benchmarkValueInGrams;
        Integer num2 = this.maxWeightInGrams;
        Integer num3 = this.reps;
        Long l16 = this.workoutId;
        String str3 = this.workoutName;
        Long l17 = this.workoutScheduleId;
        Integer num4 = this.userAccountBenchmarkValue;
        StringBuilder sbJ = b71.i.j("StrengthBenchmarkDTO(activityId=", ", benchmarkCategoryKey=", str, l14, ", benchmarkId=");
        b71.i.q(l15, ", benchmarkKey=", str2, ", benchmarkValueInGrams=", sbJ);
        x.m(sbJ, num, ", maxWeightInGrams=", num2, ", reps=");
        sbJ.append(num3);
        sbJ.append(", workoutId=");
        sbJ.append(l16);
        sbJ.append(", workoutName=");
        n23.j.q(l17, str3, ", workoutScheduleId=", ", userAccountBenchmarkValue=", sbJ);
        return f3.i(sbJ, num4, ")");
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
        parcel.writeString(this.benchmarkCategoryKey);
        Long l15 = this.benchmarkId;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeString(this.benchmarkKey);
        Integer num = this.benchmarkValueInGrams;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.maxWeightInGrams;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Integer num3 = this.reps;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        Long l16 = this.workoutId;
        if (l16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l16);
        }
        parcel.writeString(this.workoutName);
        Long l17 = this.workoutScheduleId;
        if (l17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l17);
        }
        Integer num4 = this.userAccountBenchmarkValue;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num4);
        }
    }
}
