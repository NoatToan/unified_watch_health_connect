package ue0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b \u0010\u0016R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b!\u0010\u001a¨\u0006\""}, d2 = {"Lue0/h;", "Landroid/os/Parcelable;", "", "deviceId", "", "displayName", "", "emergencyCallingCapable", "fallDetectionCapable", "incidentDetectionCapable", "liveTrackCapable", "pendingActivityCapable", "productDisplayName", "screenlessDeviceCapable", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)V", "a", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "Ljava/lang/String;", "getDisplayName", "()Ljava/lang/String;", "c", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "f", JWKParameterNames.RSA_EXPONENT, "g", "h", IntegerTokenConverter.CONVERTER_KEY, "getProductDisplayName", "getScreenlessDeviceCapable", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceId")
    private final Long deviceId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayName")
    private final String displayName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("emergencyCallingCapable")
    private final Boolean emergencyCallingCapable;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fallDetectionCapable")
    private final Boolean fallDetectionCapable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("incidentDetectionCapable")
    private final Boolean incidentDetectionCapable;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("liveTrackCapable")
    private final Boolean liveTrackCapable;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pendingActivityCapable")
    private final Boolean pendingActivityCapable;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("productDisplayName")
    private final String productDisplayName;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("screenlessDeviceCapable")
    private final Boolean screenlessDeviceCapable;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            Long lValueOf;
            Boolean bool;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            Boolean boolValueOf6;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                lValueOf = null;
                bool = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
                bool = null;
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = bool;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = bool;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = bool;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf4 = bool;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf5 = bool;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Boolean bool2 = boolValueOf3;
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf6 = bool;
            } else {
                boolValueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new h(lValueOf, string, boolValueOf, boolValueOf2, bool2, boolValueOf4, boolValueOf5, string2, boolValueOf6);
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    }

    public /* synthetic */ h(Long l14, String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str2, Boolean bool6, int i14, p005kotlin.jvm.internal.j jVar) {
        this(l14, str, bool, (i14 & 8) != 0 ? Boolean.FALSE : bool2, (i14 & 16) != 0 ? Boolean.FALSE : bool3, (i14 & 32) != 0 ? Boolean.FALSE : bool4, (i14 & 64) != 0 ? Boolean.FALSE : bool5, str2, (i14 & 256) != 0 ? Boolean.FALSE : bool6);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getEmergencyCallingCapable() {
        return this.emergencyCallingCapable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.g(this.deviceId, hVar.deviceId) && s.g(this.displayName, hVar.displayName) && s.g(this.emergencyCallingCapable, hVar.emergencyCallingCapable) && s.g(this.fallDetectionCapable, hVar.fallDetectionCapable) && s.g(this.incidentDetectionCapable, hVar.incidentDetectionCapable) && s.g(this.liveTrackCapable, hVar.liveTrackCapable) && s.g(this.pendingActivityCapable, hVar.pendingActivityCapable) && s.g(this.productDisplayName, hVar.productDisplayName) && s.g(this.screenlessDeviceCapable, hVar.screenlessDeviceCapable);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getFallDetectionCapable() {
        return this.fallDetectionCapable;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Boolean getIncidentDetectionCapable() {
        return this.incidentDetectionCapable;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getProductDisplayName() {
        return this.productDisplayName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Boolean getLiveTrackCapable() {
        return this.liveTrackCapable;
    }

    public final int hashCode() {
        Long l14 = this.deviceId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.displayName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.emergencyCallingCapable;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.fallDetectionCapable;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.incidentDetectionCapable;
        int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.liveTrackCapable;
        int iHashCode6 = (iHashCode5 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.pendingActivityCapable;
        int iHashCode7 = (iHashCode6 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str2 = this.productDisplayName;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool6 = this.screenlessDeviceCapable;
        return iHashCode8 + (bool6 != null ? bool6.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Boolean getPendingActivityCapable() {
        return this.pendingActivityCapable;
    }

    public final String toString() {
        Long l14 = this.deviceId;
        String str = this.displayName;
        Boolean bool = this.emergencyCallingCapable;
        Boolean bool2 = this.fallDetectionCapable;
        Boolean bool3 = this.incidentDetectionCapable;
        Boolean bool4 = this.liveTrackCapable;
        Boolean bool5 = this.pendingActivityCapable;
        String str2 = this.productDisplayName;
        Boolean bool6 = this.screenlessDeviceCapable;
        StringBuilder sbJ = b71.i.j("ChildDeviceRegistrationDto(deviceId=", ", displayName=", str, l14, ", emergencyCallingCapable=");
        b71.i.o(bool, bool2, ", fallDetectionCapable=", ", incidentDetectionCapable=", sbJ);
        b71.i.o(bool3, bool4, ", liveTrackCapable=", ", pendingActivityCapable=", sbJ);
        b71.i.s(sbJ, bool5, ", productDisplayName=", str2, ", screenlessDeviceCapable=");
        return p6.b.f(sbJ, bool6, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.deviceId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.displayName);
        Boolean bool = this.emergencyCallingCapable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        Boolean bool2 = this.fallDetectionCapable;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
        Boolean bool3 = this.incidentDetectionCapable;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool3);
        }
        Boolean bool4 = this.liveTrackCapable;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool4);
        }
        Boolean bool5 = this.pendingActivityCapable;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool5);
        }
        parcel.writeString(this.productDisplayName);
        Boolean bool6 = this.screenlessDeviceCapable;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool6);
        }
    }

    public h(Long l14, String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str2, Boolean bool6) {
        this.deviceId = l14;
        this.displayName = str;
        this.emergencyCallingCapable = bool;
        this.fallDetectionCapable = bool2;
        this.incidentDetectionCapable = bool3;
        this.liveTrackCapable = bool4;
        this.pendingActivityCapable = bool5;
        this.productDisplayName = str2;
        this.screenlessDeviceCapable = bool6;
    }
}
