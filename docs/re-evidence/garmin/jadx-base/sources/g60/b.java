package g60;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import c22.l3;
import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import g22.k;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u0019"}, d2 = {"Lg60/b;", "Landroid/os/Parcelable;", "", "version", "criticalSwimSpeed", "", "measurementTimestampLocal", "measurementTimestampGMT", "biometricSourceType", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/Long;", "h", "()Ljava/lang/Long;", "b", "getCriticalSwimSpeed", "c", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "d", "getMeasurementTimestampGMT", JWKParameterNames.RSA_EXPONENT, "getBiometricSourceType", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f76030f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("version")
    private final Long version;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("criticalSwimSpeed")
    private final Long criticalSwimSpeed;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("measurementTimestampLocal")
    private final String measurementTimestampLocal;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("measurementTimestampGMT")
    private final String measurementTimestampGMT;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("biometricSourceType")
    private final String biometricSourceType;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(Long l14, Long l15, String str, String str2, String str3) {
        this.version = l14;
        this.criticalSwimSpeed = l15;
        this.measurementTimestampLocal = str;
        this.measurementTimestampGMT = str2;
        this.biometricSourceType = str3;
    }

    public final Double b() {
        Long l14 = this.criticalSwimSpeed;
        if (l14 != null) {
            return Double.valueOf(l14.longValue() / ((double) 1000));
        }
        return null;
    }

    public final Double d() {
        Double dB = b();
        if (dB == null) {
            return null;
        }
        l3.a aVar = l3.f23124b;
        double dDoubleValue = dB.doubleValue();
        aVar.getClass();
        return Double.valueOf(l3.a.r(dDoubleValue, true));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.version, bVar.version) && s.g(this.criticalSwimSpeed, bVar.criticalSwimSpeed) && s.g(this.measurementTimestampLocal, bVar.measurementTimestampLocal) && s.g(this.measurementTimestampGMT, bVar.measurementTimestampGMT) && s.g(this.biometricSourceType, bVar.biometricSourceType);
    }

    public final DateTime f() {
        return k.q(this.measurementTimestampLocal, "yyyy-MM-dd'T'HH:mm:ss.SSS", null);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getMeasurementTimestampLocal() {
        return this.measurementTimestampLocal;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Long getVersion() {
        return this.version;
    }

    public final int hashCode() {
        Long l14 = this.version;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Long l15 = this.criticalSwimSpeed;
        int iHashCode2 = (iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str = this.measurementTimestampLocal;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.measurementTimestampGMT;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.biometricSourceType;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        Long l14 = this.version;
        Long l15 = this.criticalSwimSpeed;
        String str = this.measurementTimestampLocal;
        String str2 = this.measurementTimestampGMT;
        String str3 = this.biometricSourceType;
        StringBuilder sbJ = f3.j(l14, l15, "CriticalSwimSpeedDTO(version=", ", criticalSwimSpeed=", ", measurementTimestampLocal=");
        sn.a.t(sbJ, str, ", measurementTimestampGMT=", str2, ", biometricSourceType=");
        return j.o(str3, ")", sbJ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.version;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Long l15 = this.criticalSwimSpeed;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeString(this.measurementTimestampLocal);
        parcel.writeString(this.measurementTimestampGMT);
        parcel.writeString(this.biometricSourceType);
    }
}
