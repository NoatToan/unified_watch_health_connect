package mp;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001d\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001f\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0011\u001a\u0004\b!\u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0011\u001a\u0004\b#\u0010\u0013R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0011\u001a\u0004\b%\u0010\u0013R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0011\u001a\u0004\b'\u0010\u0013¨\u0006("}, d2 = {"Lmp/q;", "Landroid/os/Parcelable;", "Lmp/e;", "duration", "differenceBodyBattery", "splitSummaries", "avgStress", "distance", "elevationGain", "calories", "restingCalories", "packWeightCalories", "packWeight", "avgSpeed", "<init>", "(Lmp/e;Lmp/e;Lmp/e;Lmp/e;Lmp/e;Lmp/e;Lmp/e;Lmp/e;Lmp/e;Lmp/e;Lmp/e;)V", "a", "Lmp/e;", "getDuration", "()Lmp/e;", "b", "getDifferenceBodyBattery", "c", "getSplitSummaries", "d", "getAvgStress", JWKParameterNames.RSA_EXPONENT, "getDistance", "f", "getElevationGain", "g", "getCalories", "h", "getRestingCalories", IntegerTokenConverter.CONVERTER_KEY, "getPackWeightCalories", "j", "getPackWeight", JWKParameterNames.OCT_KEY_VALUE, "getAvgSpeed", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q implements Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("duration")
    private final e duration;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("differenceBodyBattery")
    private final e differenceBodyBattery;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("splitSummaries")
    private final e splitSummaries;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgStress")
    private final e avgStress;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("distance")
    private final e distance;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("elevationGain")
    private final e elevationGain;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calories")
    private final e calories;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bmrCalories")
    private final e restingCalories;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("packWeightCalories")
    private final e packWeightCalories;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("beginPackWeight")
    private final e packWeight;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgSpeed")
    private final e avgSpeed;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<q> {
        @Override // android.os.Parcelable.Creator
        public final q createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new q(parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? e.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final q[] newArray(int i14) {
            return new q[i14];
        }
    }

    public q(e eVar, e eVar2, e eVar3, e eVar4, e eVar5, e eVar6, e eVar7, e eVar8, e eVar9, e eVar10, e eVar11) {
        this.duration = eVar;
        this.differenceBodyBattery = eVar2;
        this.splitSummaries = eVar3;
        this.avgStress = eVar4;
        this.distance = eVar5;
        this.elevationGain = eVar6;
        this.calories = eVar7;
        this.restingCalories = eVar8;
        this.packWeightCalories = eVar9;
        this.packWeight = eVar10;
        this.avgSpeed = eVar11;
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
        return s.g(this.duration, qVar.duration) && s.g(this.differenceBodyBattery, qVar.differenceBodyBattery) && s.g(this.splitSummaries, qVar.splitSummaries) && s.g(this.avgStress, qVar.avgStress) && s.g(this.distance, qVar.distance) && s.g(this.elevationGain, qVar.elevationGain) && s.g(this.calories, qVar.calories) && s.g(this.restingCalories, qVar.restingCalories) && s.g(this.packWeightCalories, qVar.packWeightCalories) && s.g(this.packWeight, qVar.packWeight) && s.g(this.avgSpeed, qVar.avgSpeed);
    }

    public final int hashCode() {
        e eVar = this.duration;
        int iHashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
        e eVar2 = this.differenceBodyBattery;
        int iHashCode2 = (iHashCode + (eVar2 == null ? 0 : eVar2.hashCode())) * 31;
        e eVar3 = this.splitSummaries;
        int iHashCode3 = (iHashCode2 + (eVar3 == null ? 0 : eVar3.hashCode())) * 31;
        e eVar4 = this.avgStress;
        int iHashCode4 = (iHashCode3 + (eVar4 == null ? 0 : eVar4.hashCode())) * 31;
        e eVar5 = this.distance;
        int iHashCode5 = (iHashCode4 + (eVar5 == null ? 0 : eVar5.hashCode())) * 31;
        e eVar6 = this.elevationGain;
        int iHashCode6 = (iHashCode5 + (eVar6 == null ? 0 : eVar6.hashCode())) * 31;
        e eVar7 = this.calories;
        int iHashCode7 = (iHashCode6 + (eVar7 == null ? 0 : eVar7.hashCode())) * 31;
        e eVar8 = this.restingCalories;
        int iHashCode8 = (iHashCode7 + (eVar8 == null ? 0 : eVar8.hashCode())) * 31;
        e eVar9 = this.packWeightCalories;
        int iHashCode9 = (iHashCode8 + (eVar9 == null ? 0 : eVar9.hashCode())) * 31;
        e eVar10 = this.packWeight;
        int iHashCode10 = (iHashCode9 + (eVar10 == null ? 0 : eVar10.hashCode())) * 31;
        e eVar11 = this.avgSpeed;
        return iHashCode10 + (eVar11 != null ? eVar11.hashCode() : 0);
    }

    public final String toString() {
        return "SportsMetricDTO(duration=" + this.duration + ", differenceBodyBattery=" + this.differenceBodyBattery + ", splitSummaries=" + this.splitSummaries + ", avgStress=" + this.avgStress + ", distance=" + this.distance + ", elevationGain=" + this.elevationGain + ", calories=" + this.calories + ", restingCalories=" + this.restingCalories + ", packWeightCalories=" + this.packWeightCalories + ", packWeight=" + this.packWeight + ", avgSpeed=" + this.avgSpeed + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        e eVar = this.duration;
        if (eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar.writeToParcel(parcel, i14);
        }
        e eVar2 = this.differenceBodyBattery;
        if (eVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar2.writeToParcel(parcel, i14);
        }
        e eVar3 = this.splitSummaries;
        if (eVar3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar3.writeToParcel(parcel, i14);
        }
        e eVar4 = this.avgStress;
        if (eVar4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar4.writeToParcel(parcel, i14);
        }
        e eVar5 = this.distance;
        if (eVar5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar5.writeToParcel(parcel, i14);
        }
        e eVar6 = this.elevationGain;
        if (eVar6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar6.writeToParcel(parcel, i14);
        }
        e eVar7 = this.calories;
        if (eVar7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar7.writeToParcel(parcel, i14);
        }
        e eVar8 = this.restingCalories;
        if (eVar8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar8.writeToParcel(parcel, i14);
        }
        e eVar9 = this.packWeightCalories;
        if (eVar9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar9.writeToParcel(parcel, i14);
        }
        e eVar10 = this.packWeight;
        if (eVar10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar10.writeToParcel(parcel, i14);
        }
        e eVar11 = this.avgSpeed;
        if (eVar11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar11.writeToParcel(parcel, i14);
        }
    }
}
