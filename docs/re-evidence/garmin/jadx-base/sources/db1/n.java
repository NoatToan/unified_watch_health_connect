package db1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import j20.x;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b<\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010#\u001a\u0004\b(\u0010%\"\u0004\b)\u0010'R$\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%\"\u0004\b,\u0010'R$\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010#\u001a\u0004\b.\u0010%\"\u0004\b/\u0010'R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u00101\u001a\u0004\b7\u00103\"\u0004\b8\u00105R$\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u00101\u001a\u0004\b:\u00103\"\u0004\b;\u00105R$\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b<\u00101\u001a\u0004\b=\u00103\"\u0004\b>\u00105R$\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u0010#\u001a\u0004\b@\u0010%\"\u0004\bA\u0010'R$\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bB\u00101\u001a\u0004\bC\u00103\"\u0004\bD\u00105R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bK\u0010\u0018\u001a\u0004\bL\u0010\u001a\"\u0004\bM\u0010\u001c¨\u0006N"}, d2 = {"Ldb1/n;", "Landroid/os/Parcelable;", "Lorg/joda/time/DateTime;", "date", "", "version", "", "weight", "bmi", "bodyFat", "bodyWater", "", "boneMass", "muscleMass", "physiqueRating", "visceralFat", "metabolicAge", "caloricIntake", "Ldb1/v;", "sourceType", "timestampGMT", "<init>", "(Lorg/joda/time/DateTime;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ldb1/v;Lorg/joda/time/DateTime;)V", "a", "Lorg/joda/time/DateTime;", "b", "()Lorg/joda/time/DateTime;", "setDate", "(Lorg/joda/time/DateTime;)V", "Ljava/lang/Long;", "getVersion", "()Ljava/lang/Long;", "setVersion", "(Ljava/lang/Long;)V", "c", "Ljava/lang/Double;", "d", "()Ljava/lang/Double;", "setWeight", "(Ljava/lang/Double;)V", "getBmi", "setBmi", JWKParameterNames.RSA_EXPONENT, "getBodyFat", "setBodyFat", "f", "getBodyWater", "setBodyWater", "g", "Ljava/lang/Integer;", "getBoneMass", "()Ljava/lang/Integer;", "setBoneMass", "(Ljava/lang/Integer;)V", "h", "getMuscleMass", "setMuscleMass", IntegerTokenConverter.CONVERTER_KEY, "getPhysiqueRating", "setPhysiqueRating", "j", "getVisceralFat", "setVisceralFat", JWKParameterNames.OCT_KEY_VALUE, "getMetabolicAge", "setMetabolicAge", "l", "getCaloricIntake", "setCaloricIntake", "m", "Ldb1/v;", "getSourceType", "()Ldb1/v;", "setSourceType", "(Ldb1/v;)V", JWKParameterNames.RSA_MODULUS, "getTimestampGMT", "setTimestampGMT", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("date")
    @JsonAdapter(GsonUtil.DateTimeTypeAdapterWithMilliSeconds.class)
    private DateTime date;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("version")
    private Long version;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weight")
    private Double weight;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bmi")
    private Double bmi;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bodyFat")
    private Double bodyFat;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bodyWater")
    private Double bodyWater;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("boneMass")
    private Integer boneMass;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("muscleMass")
    private Integer muscleMass;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("physiqueRating")
    private Integer physiqueRating;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("visceralFat")
    private Integer visceralFat;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("metabolicAge")
    private Double metabolicAge;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("caloricIntake")
    private Integer caloricIntake;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sourceType")
    private v sourceType;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timestampGMT")
    @JsonAdapter(GsonUtil.DateTimeTypeAdapterWithMilliSeconds.class)
    private DateTime timestampGMT;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        public final n createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new n((DateTime) parcel.readSerializable(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? v.valueOf(parcel.readString()) : null, (DateTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final n[] newArray(int i14) {
            return new n[i14];
        }
    }

    public /* synthetic */ n(DateTime dateTime, Long l14, Double d14, Double d15, Double d16, Double d17, Integer num, Integer num2, Integer num3, Integer num4, Double d18, Integer num5, v vVar, DateTime dateTime2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : dateTime, (i14 & 2) != 0 ? null : l14, (i14 & 4) != 0 ? null : d14, (i14 & 8) != 0 ? null : d15, (i14 & 16) != 0 ? null : d16, (i14 & 32) != 0 ? null : d17, (i14 & 64) != 0 ? null : num, (i14 & 128) != 0 ? null : num2, (i14 & 256) != 0 ? null : num3, (i14 & 512) != 0 ? null : num4, (i14 & 1024) != 0 ? null : d18, (i14 & 2048) != 0 ? null : num5, (i14 & 4096) != 0 ? null : vVar, (i14 & 8192) != 0 ? null : dateTime2);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DateTime getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getWeight() {
        return this.weight;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return p005kotlin.jvm.internal.s.g(this.date, nVar.date) && p005kotlin.jvm.internal.s.g(this.version, nVar.version) && p005kotlin.jvm.internal.s.g(this.weight, nVar.weight) && p005kotlin.jvm.internal.s.g(this.bmi, nVar.bmi) && p005kotlin.jvm.internal.s.g(this.bodyFat, nVar.bodyFat) && p005kotlin.jvm.internal.s.g(this.bodyWater, nVar.bodyWater) && p005kotlin.jvm.internal.s.g(this.boneMass, nVar.boneMass) && p005kotlin.jvm.internal.s.g(this.muscleMass, nVar.muscleMass) && p005kotlin.jvm.internal.s.g(this.physiqueRating, nVar.physiqueRating) && p005kotlin.jvm.internal.s.g(this.visceralFat, nVar.visceralFat) && p005kotlin.jvm.internal.s.g(this.metabolicAge, nVar.metabolicAge) && p005kotlin.jvm.internal.s.g(this.caloricIntake, nVar.caloricIntake) && this.sourceType == nVar.sourceType && p005kotlin.jvm.internal.s.g(this.timestampGMT, nVar.timestampGMT);
    }

    public final int hashCode() {
        DateTime dateTime = this.date;
        int iHashCode = (dateTime == null ? 0 : dateTime.hashCode()) * 31;
        Long l14 = this.version;
        int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        Double d14 = this.weight;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.bmi;
        int iHashCode4 = (iHashCode3 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.bodyFat;
        int iHashCode5 = (iHashCode4 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.bodyWater;
        int iHashCode6 = (iHashCode5 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Integer num = this.boneMass;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.muscleMass;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.physiqueRating;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.visceralFat;
        int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Double d18 = this.metabolicAge;
        int iHashCode11 = (iHashCode10 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Integer num5 = this.caloricIntake;
        int iHashCode12 = (iHashCode11 + (num5 == null ? 0 : num5.hashCode())) * 31;
        v vVar = this.sourceType;
        int iHashCode13 = (iHashCode12 + (vVar == null ? 0 : vVar.hashCode())) * 31;
        DateTime dateTime2 = this.timestampGMT;
        return iHashCode13 + (dateTime2 != null ? dateTime2.hashCode() : 0);
    }

    public final String toString() {
        DateTime dateTime = this.date;
        Long l14 = this.version;
        Double d14 = this.weight;
        Double d15 = this.bmi;
        Double d16 = this.bodyFat;
        Double d17 = this.bodyWater;
        Integer num = this.boneMass;
        Integer num2 = this.muscleMass;
        Integer num3 = this.physiqueRating;
        Integer num4 = this.visceralFat;
        Double d18 = this.metabolicAge;
        Integer num5 = this.caloricIntake;
        v vVar = this.sourceType;
        DateTime dateTime2 = this.timestampGMT;
        StringBuilder sb3 = new StringBuilder("PregnancyWeightDTO(date=");
        sb3.append(dateTime);
        sb3.append(", version=");
        sb3.append(l14);
        sb3.append(", weight=");
        b71.i.p(d14, d15, ", bmi=", ", bodyFat=", sb3);
        b71.i.p(d16, d17, ", bodyWater=", ", boneMass=", sb3);
        x.m(sb3, num, ", muscleMass=", num2, ", physiqueRating=");
        x.m(sb3, num3, ", visceralFat=", num4, ", metabolicAge=");
        b71.i.t(sb3, d18, ", caloricIntake=", num5, ", sourceType=");
        sb3.append(vVar);
        sb3.append(", timestampGMT=");
        sb3.append(dateTime2);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeSerializable(this.date);
        Long l14 = this.version;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Double d14 = this.weight;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.bmi;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Double d16 = this.bodyFat;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        Double d17 = this.bodyWater;
        if (d17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d17);
        }
        Integer num = this.boneMass;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.muscleMass;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Integer num3 = this.physiqueRating;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        Integer num4 = this.visceralFat;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num4);
        }
        Double d18 = this.metabolicAge;
        if (d18 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d18);
        }
        Integer num5 = this.caloricIntake;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num5);
        }
        v vVar = this.sourceType;
        if (vVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(vVar.name());
        }
        parcel.writeSerializable(this.timestampGMT);
    }

    public n(DateTime dateTime, Long l14, Double d14, Double d15, Double d16, Double d17, Integer num, Integer num2, Integer num3, Integer num4, Double d18, Integer num5, v vVar, DateTime dateTime2) {
        this.date = dateTime;
        this.version = l14;
        this.weight = d14;
        this.bmi = d15;
        this.bodyFat = d16;
        this.bodyWater = d17;
        this.boneMass = num;
        this.muscleMass = num2;
        this.physiqueRating = num3;
        this.visceralFat = num4;
        this.metabolicAge = d18;
        this.caloricIntake = num5;
        this.sourceType = vVar;
        this.timestampGMT = dateTime2;
    }

    public n() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }
}
