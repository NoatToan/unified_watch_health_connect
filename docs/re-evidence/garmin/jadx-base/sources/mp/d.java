package mp;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import ps.o1;
import v.e0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b-\u0010,R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b0\u0010,R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010*\u001a\u0004\b/\u0010,R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010*\u001a\u0004\b1\u0010,R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010*\u001a\u0004\b3\u0010,R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u001e\u001a\u0004\b4\u0010 ¨\u0006<"}, d2 = {"Lmp/d;", "Landroid/os/Parcelable;", "", "activityId", "", "startTimeLocal", "activityName", "", "isPersonalRecord", "Lto/o;", "activityType", "", "duration", "distance", "calories", "elevationGain", "differenceBodyBattery", "avgStress", "packWeight", "", "Lps/o1;", "splitSummaries", "qualifyingDive", "endTimeGMT", "<init>", "(JLjava/lang/String;Ljava/lang/String;ZLto/o;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;)V", "a", "J", "b", "()J", "Ljava/lang/String;", "s", "()Ljava/lang/String;", "c", "d", "Z", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "()Z", JWKParameterNames.RSA_EXPONENT, "Lto/o;", "f", "()Lto/o;", "Ljava/lang/Double;", "j", "()Ljava/lang/Double;", "g", IntegerTokenConverter.CONVERTER_KEY, "h", JWKParameterNames.OCT_KEY_VALUE, "getAvgStress", "l", "o", "m", "Ljava/util/List;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "()Ljava/util/List;", JWKParameterNames.RSA_MODULUS, "Ljava/lang/Boolean;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "()Ljava/lang/Boolean;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityId")
    private final long activityId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startTimeLocal")
    private final String startTimeLocal;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityName")
    private final String activityName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pr")
    private final boolean isPersonalRecord;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityType")
    private final to.o activityType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("duration")
    private final Double duration;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("distance")
    private final Double distance;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calories")
    private final Double calories;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("elevationGain")
    private final Double elevationGain;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("differenceBodyBattery")
    private final Double differenceBodyBattery;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgStress")
    private final Double avgStress;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("beginPackWeight")
    private final Double packWeight;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("splitSummaries")
    private final List<o1> splitSummaries;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("qualifyingDive")
    private final Boolean qualifyingDive;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endTimeGMT")
    private final String endTimeGMT;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            long j8;
            Boolean boolValueOf;
            parcel.getClass();
            long j14 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z14 = parcel.readInt() != 0;
            to.o oVarCreateFromParcel = to.o.CREATOR.createFromParcel(parcel);
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf3 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf4 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf5 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf6 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf7 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() != 0) {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA = 0;
                while (true) {
                    j8 = j14;
                    if (iA == i14) {
                        break;
                    }
                    iA = kg.f.a(o1.CREATOR, parcel, arrayList, iA, 1);
                    j14 = j8;
                }
            } else {
                arrayList = null;
                j8 = j14;
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new d(j8, string, string2, z14, oVarCreateFromParcel, dValueOf, dValueOf2, dValueOf3, dValueOf4, dValueOf5, dValueOf6, dValueOf7, arrayList, boolValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public d(long j8, String str, String str2, boolean z14, to.o oVar, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, List<o1> list, Boolean bool, String str3) {
        oVar.getClass();
        this.activityId = j8;
        this.startTimeLocal = str;
        this.activityName = str2;
        this.isPersonalRecord = z14;
        this.activityType = oVar;
        this.duration = d14;
        this.distance = d15;
        this.calories = d16;
        this.elevationGain = d17;
        this.differenceBodyBattery = d18;
        this.avgStress = d19;
        this.packWeight = d24;
        this.splitSummaries = list;
        this.qualifyingDive = bool;
        this.endTimeGMT = str3;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getActivityId() {
        return this.activityId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getActivityName() {
        return this.activityName;
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
        return this.activityId == dVar.activityId && s.g(this.startTimeLocal, dVar.startTimeLocal) && s.g(this.activityName, dVar.activityName) && this.isPersonalRecord == dVar.isPersonalRecord && s.g(this.activityType, dVar.activityType) && s.g(this.duration, dVar.duration) && s.g(this.distance, dVar.distance) && s.g(this.calories, dVar.calories) && s.g(this.elevationGain, dVar.elevationGain) && s.g(this.differenceBodyBattery, dVar.differenceBodyBattery) && s.g(this.avgStress, dVar.avgStress) && s.g(this.packWeight, dVar.packWeight) && s.g(this.splitSummaries, dVar.splitSummaries) && s.g(this.qualifyingDive, dVar.qualifyingDive) && s.g(this.endTimeGMT, dVar.endTimeGMT);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final to.o getActivityType() {
        return this.activityType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getCalories() {
        return this.calories;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Double getDifferenceBodyBattery() {
        return this.differenceBodyBattery;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.activityId) * 31;
        String str = this.startTimeLocal;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.activityName;
        int iHashCode3 = (this.activityType.hashCode() + q6.f.g((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isPersonalRecord)) * 31;
        Double d14 = this.duration;
        int iHashCode4 = (iHashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.distance;
        int iHashCode5 = (iHashCode4 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.calories;
        int iHashCode6 = (iHashCode5 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.elevationGain;
        int iHashCode7 = (iHashCode6 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.differenceBodyBattery;
        int iHashCode8 = (iHashCode7 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.avgStress;
        int iHashCode9 = (iHashCode8 + (d19 == null ? 0 : d19.hashCode())) * 31;
        Double d24 = this.packWeight;
        int iHashCode10 = (iHashCode9 + (d24 == null ? 0 : d24.hashCode())) * 31;
        List<o1> list = this.splitSummaries;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.qualifyingDive;
        int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.endTimeGMT;
        return iHashCode12 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Double getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Double getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Double getElevationGain() {
        return this.elevationGain;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getEndTimeGMT() {
        return this.endTimeGMT;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Double getPackWeight() {
        return this.packWeight;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Boolean getQualifyingDive() {
        return this.qualifyingDive;
    }

    public final List<o1> r() {
        return this.splitSummaries;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getStartTimeLocal() {
        return this.startTimeLocal;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getIsPersonalRecord() {
        return this.isPersonalRecord;
    }

    public final String toString() {
        long j8 = this.activityId;
        String str = this.startTimeLocal;
        String str2 = this.activityName;
        boolean z14 = this.isPersonalRecord;
        to.o oVar = this.activityType;
        Double d14 = this.duration;
        Double d15 = this.distance;
        Double d16 = this.calories;
        Double d17 = this.elevationGain;
        Double d18 = this.differenceBodyBattery;
        Double d19 = this.avgStress;
        Double d24 = this.packWeight;
        List<o1> list = this.splitSummaries;
        Boolean bool = this.qualifyingDive;
        String str3 = this.endTimeGMT;
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "ActivityReportsItemDTO(activityId=", ", startTimeLocal=", str);
        com.airbnb.lottie.animation.keyframe.a.t(", activityName=", str2, ", isPersonalRecord=", sbK, z14);
        sbK.append(", activityType=");
        sbK.append(oVar);
        sbK.append(", duration=");
        sbK.append(d14);
        sn.a.p(d15, d16, ", distance=", ", calories=", sbK);
        sn.a.p(d17, d18, ", elevationGain=", ", differenceBodyBattery=", sbK);
        sn.a.p(d19, d24, ", avgStress=", ", packWeight=", sbK);
        sbK.append(", splitSummaries=");
        sbK.append(list);
        sbK.append(", qualifyingDive=");
        sbK.append(bool);
        return e0.h(sbK, ", endTimeGMT=", str3, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.activityId);
        parcel.writeString(this.startTimeLocal);
        parcel.writeString(this.activityName);
        parcel.writeInt(this.isPersonalRecord ? 1 : 0);
        this.activityType.writeToParcel(parcel, i14);
        Double d14 = this.duration;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.distance;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Double d16 = this.calories;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        Double d17 = this.elevationGain;
        if (d17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d17);
        }
        Double d18 = this.differenceBodyBattery;
        if (d18 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d18);
        }
        Double d19 = this.avgStress;
        if (d19 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d19);
        }
        Double d24 = this.packWeight;
        if (d24 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d24);
        }
        List<o1> list = this.splitSummaries;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((o1) itO.next()).writeToParcel(parcel, i14);
            }
        }
        Boolean bool = this.qualifyingDive;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        parcel.writeString(this.endTimeGMT);
    }
}
