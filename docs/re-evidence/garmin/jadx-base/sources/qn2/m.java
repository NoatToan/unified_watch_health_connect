package qn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u0018\u0010\u0011R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011¨\u0006 "}, d2 = {"Lqn2/m;", "Lpn2/d;", "", "deviceProviderId", "deviceManufacturer", "deviceName", "deviceIdentificationData", "chipDestinationId", "deviceVersion", "deviceType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getDeviceProviderId", "()Ljava/lang/String;", "setDeviceProviderId", "(Ljava/lang/String;)V", "b", "getDeviceManufacturer", "f", "c", "getDeviceName", "g", "d", "getDeviceIdentificationData", JWKParameterNames.RSA_EXPONENT, "setChipDestinationId", "getDeviceVersion", "setDeviceVersion", "getDeviceType", "setDeviceType", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m implements pn2.d {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceProviderId")
    private String deviceProviderId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceManufacturer")
    private String deviceManufacturer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceName")
    private String deviceName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceIdentificationData")
    private String deviceIdentificationData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("chipDestinationId")
    private String chipDestinationId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceVersion")
    private String deviceVersion;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceType")
    private String deviceType;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new m(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i14) {
            return new m[i14];
        }
    }

    public m(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        hb.a.p(str, str2, str3, str4, str5);
        str6.getClass();
        str7.getClass();
        this.deviceProviderId = str;
        this.deviceManufacturer = str2;
        this.deviceName = str3;
        this.deviceIdentificationData = str4;
        this.chipDestinationId = str5;
        this.deviceVersion = str6;
        this.deviceType = str7;
        if (str.length() != 8) {
            vb.h.x(am.j.h(this.deviceProviderId.length(), "deviceProviderId length(8): "));
            throw null;
        }
        int length = this.deviceManufacturer.length();
        if (1 > length || length >= 256) {
            vb.h.x(am.j.h(this.deviceManufacturer.length(), "deviceManufacturer length(1-255): "));
            throw null;
        }
        int length2 = this.deviceName.length();
        if (1 > length2 || length2 >= 256) {
            vb.h.x(am.j.h(this.deviceName.length(), "deviceName length(1-255): "));
            throw null;
        }
        int length3 = this.deviceIdentificationData.length();
        if (1 > length3 || length3 >= 256) {
            vb.h.x(am.j.h(this.deviceIdentificationData.length(), "deviceIdentificationData length(1-255): "));
            throw null;
        }
        if (this.chipDestinationId.length() != 2) {
            vb.h.x(am.j.h(this.chipDestinationId.length(), "chipDestinationId length(2): "));
            throw null;
        }
        int length4 = this.deviceVersion.length();
        if (1 > length4 || length4 >= 256) {
            vb.h.x(am.j.h(this.deviceVersion.length(), "deviceVersion length(1-255): "));
            throw null;
        }
        if (this.deviceType.length() == 1) {
            return;
        }
        vb.h.x(am.j.h(this.deviceType.length(), "deviceType length(1): "));
        throw null;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getChipDestinationId() {
        return this.chipDestinationId;
    }

    public final void d(String str) {
        str.getClass();
        this.deviceIdentificationData = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return p005kotlin.jvm.internal.s.g(this.deviceProviderId, mVar.deviceProviderId) && p005kotlin.jvm.internal.s.g(this.deviceManufacturer, mVar.deviceManufacturer) && p005kotlin.jvm.internal.s.g(this.deviceName, mVar.deviceName) && p005kotlin.jvm.internal.s.g(this.deviceIdentificationData, mVar.deviceIdentificationData) && p005kotlin.jvm.internal.s.g(this.chipDestinationId, mVar.chipDestinationId) && p005kotlin.jvm.internal.s.g(this.deviceVersion, mVar.deviceVersion) && p005kotlin.jvm.internal.s.g(this.deviceType, mVar.deviceType);
    }

    public final void f(String str) {
        str.getClass();
        this.deviceManufacturer = str;
    }

    public final void g(String str) {
        str.getClass();
        this.deviceName = str;
    }

    public final int hashCode() {
        return this.deviceType.hashCode() + wr.g.j(wr.g.j(wr.g.j(wr.g.j(wr.g.j(this.deviceProviderId.hashCode() * 31, 31, this.deviceManufacturer), 31, this.deviceName), 31, this.deviceIdentificationData), 31, this.chipDestinationId), 31, this.deviceVersion);
    }

    public final String toString() {
        String str = this.deviceProviderId;
        String str2 = this.deviceManufacturer;
        String str3 = this.deviceName;
        String str4 = this.deviceIdentificationData;
        String str5 = this.chipDestinationId;
        String str6 = this.deviceVersion;
        String str7 = this.deviceType;
        StringBuilder sbI = p6.b.i("FNDeviceInfoDto(deviceProviderId='", str, "', deviceManufacturer='", str2, "', deviceName='");
        sn.a.t(sbI, str3, "', deviceIdentificationData='", str4, "', chipDestinationId='");
        sn.a.t(sbI, str5, "', deviceVersion='", str6, "', deviceType='");
        return am.j.o(str7, "')", sbI);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.deviceProviderId);
        parcel.writeString(this.deviceManufacturer);
        parcel.writeString(this.deviceName);
        parcel.writeString(this.deviceIdentificationData);
        parcel.writeString(this.chipDestinationId);
        parcel.writeString(this.deviceVersion);
        parcel.writeString(this.deviceType);
    }
}
