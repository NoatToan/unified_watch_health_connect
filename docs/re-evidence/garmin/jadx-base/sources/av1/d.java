package av1;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import d53.u;
import g22.k;
import g22.n;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u001a\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b&\u0010\u001cR\u001a\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001a\u001a\u0004\b'\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001a\u001a\u0004\b(\u0010\u001cR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u001a\u001a\u0004\b.\u0010\u001cR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b$\u00101R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u001a\u001a\u0004\b2\u0010\u001cR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b-\u00105¨\u00066"}, d2 = {"Lav1/d;", "Landroid/os/Parcelable;", "", "activityId", "", "activityType", "adaptiveCoachingWorkoutStatus", "", "avgSpeed", "distance", "duration", "name", "startLocal", "trainingEffectLabel", "workoutId", "workoutType", "aerobicTrainingEffect", "parentId", "", "workoutGroupEnumerator", "<init>", "(JLjava/lang/String;Ljava/lang/String;DDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;)V", "a", "J", "b", "()J", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "getAdaptiveCoachingWorkoutStatus", "D", "getAvgSpeed", "()D", JWKParameterNames.RSA_EXPONENT, "g", "f", "h", IntegerTokenConverter.CONVERTER_KEY, "getStartLocal", "getTrainingEffectLabel", "j", "Ljava/lang/Long;", "m", "()Ljava/lang/Long;", JWKParameterNames.OCT_KEY_VALUE, "getWorkoutType", "l", "Ljava/lang/Double;", "()Ljava/lang/Double;", "getParentId", JWKParameterNames.RSA_MODULUS, "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityId")
    private final long activityId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityType")
    private final String activityType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("adaptiveCoachingWorkoutStatus")
    private final String adaptiveCoachingWorkoutStatus;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgSpeed")
    private final double avgSpeed;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("distance")
    private final double distance;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("duration")
    private final double duration;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("name")
    private final String name;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startLocal")
    private final String startLocal;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingEffectLabel")
    private final String trainingEffectLabel;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutId")
    private final Long workoutId;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutType")
    private final String workoutType;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("aerobicTrainingEffect")
    private final Double aerobicTrainingEffect;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("parentId")
    private final String parentId;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutGroupEnumerator")
    private final Integer workoutGroupEnumerator;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            Long lValueOf;
            Integer numValueOf;
            parcel.getClass();
            long j8 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            double d14 = parcel.readDouble();
            double d15 = parcel.readDouble();
            double d16 = parcel.readDouble();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                lValueOf = null;
                numValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
                numValueOf = null;
            }
            String string6 = parcel.readString();
            Object objValueOf = parcel.readInt() == 0 ? numValueOf : Double.valueOf(parcel.readDouble());
            String string7 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new d(j8, string, string2, d14, d15, d16, string3, string4, string5, lValueOf, string6, objValueOf, string7, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public d(long j8, String str, String str2, double d14, double d15, double d16, String str3, String str4, String str5, Long l14, String str6, Double d17, String str7, Integer num) {
        str.getClass();
        str4.getClass();
        this.activityId = j8;
        this.activityType = str;
        this.adaptiveCoachingWorkoutStatus = str2;
        this.avgSpeed = d14;
        this.distance = d15;
        this.duration = d16;
        this.name = str3;
        this.startLocal = str4;
        this.trainingEffectLabel = str5;
        this.workoutId = l14;
        this.workoutType = str6;
        this.aerobicTrainingEffect = d17;
        this.parentId = str7;
        this.workoutGroupEnumerator = num;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getActivityId() {
        return this.activityId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getActivityType() {
        return this.activityType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.activityId == dVar.activityId && s.g(this.activityType, dVar.activityType) && s.g(this.adaptiveCoachingWorkoutStatus, dVar.adaptiveCoachingWorkoutStatus) && Double.compare(this.avgSpeed, dVar.avgSpeed) == 0 && Double.compare(this.distance, dVar.distance) == 0 && Double.compare(this.duration, dVar.duration) == 0 && s.g(this.name, dVar.name) && s.g(this.startLocal, dVar.startLocal) && s.g(this.trainingEffectLabel, dVar.trainingEffectLabel) && s.g(this.workoutId, dVar.workoutId) && s.g(this.workoutType, dVar.workoutType) && s.g(this.aerobicTrainingEffect, dVar.aerobicTrainingEffect) && s.g(this.parentId, dVar.parentId) && s.g(this.workoutGroupEnumerator, dVar.workoutGroupEnumerator);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Double getAerobicTrainingEffect() {
        return this.aerobicTrainingEffect;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final double getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final double getDuration() {
        return this.duration;
    }

    public final int hashCode() {
        int iJ = wr.g.j(Long.hashCode(this.activityId) * 31, 31, this.activityType);
        String str = this.adaptiveCoachingWorkoutStatus;
        int iB = org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b((iJ + (str == null ? 0 : str.hashCode())) * 31, 31, this.avgSpeed), 31, this.distance), 31, this.duration);
        String str2 = this.name;
        int iJ2 = wr.g.j((iB + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.startLocal);
        String str3 = this.trainingEffectLabel;
        int iHashCode = (iJ2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l14 = this.workoutId;
        int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str4 = this.workoutType;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d14 = this.aerobicTrainingEffect;
        int iHashCode4 = (iHashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str5 = this.parentId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.workoutGroupEnumerator;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final DateTime j() {
        if (n.d(this.startLocal)) {
            return k.p(this.startLocal, "yyyy-MM-dd'T'HH:mm:ss", null);
        }
        return null;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Integer getWorkoutGroupEnumerator() {
        return this.workoutGroupEnumerator;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Long getWorkoutId() {
        return this.workoutId;
    }

    public final boolean o() {
        return u.q(this.workoutType, "ADAPTIVE_COACHING", true);
    }

    public final boolean q() {
        if (!o()) {
            return false;
        }
        vt1.b.a aVar = vt1.b.f180079b;
        String str = this.adaptiveCoachingWorkoutStatus;
        aVar.getClass();
        return vt1.b.a.a(str);
    }

    public final boolean r() {
        return this.parentId == null;
    }

    public final String toString() {
        long j8 = this.activityId;
        String str = this.activityType;
        String str2 = this.adaptiveCoachingWorkoutStatus;
        double d14 = this.avgSpeed;
        double d15 = this.distance;
        double d16 = this.duration;
        String str3 = this.name;
        String str4 = this.startLocal;
        String str5 = this.trainingEffectLabel;
        Long l14 = this.workoutId;
        String str6 = this.workoutType;
        Double d17 = this.aerobicTrainingEffect;
        String str7 = this.parentId;
        Integer num = this.workoutGroupEnumerator;
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "FBTFitnessStatsActivityDTO(activityId=", ", activityType=", str);
        j.y(sbK, ", adaptiveCoachingWorkoutStatus=", str2, ", avgSpeed=");
        sbK.append(d14);
        j.x(sbK, ", distance=", d15, ", duration=");
        sbK.append(d16);
        sbK.append(", name=");
        sbK.append(str3);
        sn.a.t(sbK, ", startLocal=", str4, ", trainingEffectLabel=", str5);
        sbK.append(", workoutId=");
        sbK.append(l14);
        sbK.append(", workoutType=");
        sbK.append(str6);
        sbK.append(", aerobicTrainingEffect=");
        sbK.append(d17);
        sbK.append(", parentId=");
        sbK.append(str7);
        sbK.append(", workoutGroupEnumerator=");
        sbK.append(num);
        sbK.append(")");
        return sbK.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.activityId);
        parcel.writeString(this.activityType);
        parcel.writeString(this.adaptiveCoachingWorkoutStatus);
        parcel.writeDouble(this.avgSpeed);
        parcel.writeDouble(this.distance);
        parcel.writeDouble(this.duration);
        parcel.writeString(this.name);
        parcel.writeString(this.startLocal);
        parcel.writeString(this.trainingEffectLabel);
        Long l14 = this.workoutId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.workoutType);
        Double d14 = this.aerobicTrainingEffect;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        parcel.writeString(this.parentId);
        Integer num = this.workoutGroupEnumerator;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
    }
}
