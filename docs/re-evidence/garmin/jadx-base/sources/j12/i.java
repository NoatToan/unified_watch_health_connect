package j12;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.common.HttpHeaders;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;
import v.e0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0013\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010!\u001a\u0004\b\u0019\u0010\"\"\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lj12/i;", "Landroid/os/Parcelable;", "", "height", "weight", "vo2MaxRunning", "vo2MaxCycling", "", HttpHeaders.AGE, "", "gender", "<init>", "(DDDDILjava/lang/String;)V", "a", "D", "f", "()D", "setHeight", "(D)V", "b", IntegerTokenConverter.CONVERTER_KEY, "setWeight", "c", "h", "setVo2MaxRunning", "d", "g", "setVo2MaxCycling", JWKParameterNames.RSA_EXPONENT, "I", "()I", "setAge", "(I)V", "Ljava/lang/String;", "()Ljava/lang/String;", "setGender", "(Ljava/lang/String;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("height")
    private double height;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weight")
    private double weight;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("vo2Max")
    private double vo2MaxRunning;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("vo2MaxCycling")
    private double vo2MaxCycling;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName(HttpHeaders.AGE)
    private int age;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gender")
    private String gender;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new i(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i14) {
            return new i[i14];
        }
    }

    public /* synthetic */ i(double d14, double d15, double d16, double d17, int i14, String str, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 0.0d : d14, (i15 & 2) != 0 ? 0.0d : d15, (i15 & 4) != 0 ? 0.0d : d16, (i15 & 8) != 0 ? 0.0d : d17, (i15 & 16) != 0 ? 0 : i14, (i15 & 32) != 0 ? null : str);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getAge() {
        return this.age;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getGender() {
        return this.gender;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Double.compare(this.height, iVar.height) == 0 && Double.compare(this.weight, iVar.weight) == 0 && Double.compare(this.vo2MaxRunning, iVar.vo2MaxRunning) == 0 && Double.compare(this.vo2MaxCycling, iVar.vo2MaxCycling) == 0 && this.age == iVar.age && s.g(this.gender, iVar.gender);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final double getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final double getVo2MaxCycling() {
        return this.vo2MaxCycling;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final double getVo2MaxRunning() {
        return this.vo2MaxRunning;
    }

    public final int hashCode() {
        int iD = q2.d(this.age, org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(Double.hashCode(this.height) * 31, 31, this.weight), 31, this.vo2MaxRunning), 31, this.vo2MaxCycling), 31);
        String str = this.gender;
        return iD + (str == null ? 0 : str.hashCode());
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final double getWeight() {
        return this.weight;
    }

    public final String toString() {
        double d14 = this.height;
        double d15 = this.weight;
        double d16 = this.vo2MaxRunning;
        double d17 = this.vo2MaxCycling;
        int i14 = this.age;
        String str = this.gender;
        StringBuilder sbA = com.airbnb.lottie.parser.moshi.a.a("SimpleBiometricProfileDTO(height=", d14, ", weight=");
        sbA.append(d15);
        am.j.x(sbA, ", vo2MaxRunning=", d16, ", vo2MaxCycling=");
        sbA.append(d17);
        sbA.append(", age=");
        sbA.append(i14);
        return e0.h(sbA, ", gender=", str, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeDouble(this.height);
        parcel.writeDouble(this.weight);
        parcel.writeDouble(this.vo2MaxRunning);
        parcel.writeDouble(this.vo2MaxCycling);
        parcel.writeInt(this.age);
        parcel.writeString(this.gender);
    }

    public i(double d14, double d15, double d16, double d17, int i14, String str) {
        this.height = d14;
        this.weight = d15;
        this.vo2MaxRunning = d16;
        this.vo2MaxCycling = d17;
        this.age = i14;
        this.gender = str;
    }

    public i() {
        this(0.0d, 0.0d, 0.0d, 0.0d, 0, null, 63, null);
    }
}
