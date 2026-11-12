package fo2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u000e\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001a"}, d2 = {"Lfo2/t;", "Landroid/os/Parcelable;", "", "deviceId", "Lzn2/h;", "deviceType", "manufacturerName", "deviceName", "softwareRevision", "osName", "", "isHostDeviceActive", "<init>", "(Ljava/lang/String;Lzn2/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "b", "Lzn2/h;", "getDeviceType", "()Lzn2/h;", "c", "Ljava/lang/String;", "d", "()Ljava/lang/String;", JWKParameterNames.RSA_EXPONENT, "getSoftwareRevision", "f", "getOsName", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t implements Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient String f73113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceType")
    private final zn2.h deviceType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("manufacturerName")
    private final String manufacturerName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceName")
    private final String deviceName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("softwareRevision")
    private final String softwareRevision;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("osName")
    private final String osName;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient boolean f73119g;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<t> {
        @Override // android.os.Parcelable.Creator
        public final t createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new t(parcel.readString(), parcel.readInt() == 0 ? null : zn2.h.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final t[] newArray(int i14) {
            return new t[i14];
        }
    }

    public /* synthetic */ t(String str, zn2.h hVar, String str2, String str3, String str4, String str5, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : hVar, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? null : str5, z14);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDeviceName() {
        return this.deviceName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getManufacturerName() {
        return this.manufacturerName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return p005kotlin.jvm.internal.s.g(this.f73113a, tVar.f73113a) && this.deviceType == tVar.deviceType && p005kotlin.jvm.internal.s.g(this.manufacturerName, tVar.manufacturerName) && p005kotlin.jvm.internal.s.g(this.deviceName, tVar.deviceName) && p005kotlin.jvm.internal.s.g(this.softwareRevision, tVar.softwareRevision) && p005kotlin.jvm.internal.s.g(this.osName, tVar.osName) && this.f73119g == tVar.f73119g;
    }

    public final int hashCode() {
        String str = this.f73113a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        zn2.h hVar = this.deviceType;
        int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        String str2 = this.manufacturerName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deviceName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.softwareRevision;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.osName;
        return Boolean.hashCode(this.f73119g) + ((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        zn2.h hVar = this.deviceType;
        String str = this.manufacturerName;
        String str2 = this.deviceName;
        String str3 = this.softwareRevision;
        String str4 = this.osName;
        StringBuilder sb3 = new StringBuilder("NewFitPayHostDevice(deviceId=");
        sb3.append(this.f73113a);
        sb3.append(", deviceType=");
        sb3.append(hVar);
        sb3.append(", manufacturerName=");
        sn.a.t(sb3, str, ", deviceName=", str2, ", softwareRevision=");
        sn.a.t(sb3, str3, ", osName=", str4, ", isHostDeviceActive=");
        return hb.a.k(sb3, this.f73119g, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f73113a);
        zn2.h hVar = this.deviceType;
        if (hVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(hVar.name());
        }
        parcel.writeString(this.manufacturerName);
        parcel.writeString(this.deviceName);
        parcel.writeString(this.softwareRevision);
        parcel.writeString(this.osName);
        parcel.writeInt(this.f73119g ? 1 : 0);
    }

    public t(String str, zn2.h hVar, String str2, String str3, String str4, String str5, boolean z14) {
        this.f73113a = str;
        this.deviceType = hVar;
        this.manufacturerName = str2;
        this.deviceName = str3;
        this.softwareRevision = str4;
        this.osName = str5;
        this.f73119g = z14;
    }
}
