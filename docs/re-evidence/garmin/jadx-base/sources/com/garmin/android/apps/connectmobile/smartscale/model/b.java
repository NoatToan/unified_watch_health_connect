package com.garmin.android.apps.connectmobile.smartscale.model;

import android.os.Parcel;
import android.os.Parcelable;
import b71.i;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import d53.w;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import tn.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b4\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019BÇ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!\"\u0004\b\"\u0010#R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010\u001eR$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010 \u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010 \u001a\u0004\b+\u0010!\"\u0004\b,\u0010#R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b-\u0010\u001c\"\u0004\b.\u0010\u001eR$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010 \u001a\u0004\b0\u0010!\"\u0004\b1\u0010#R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b/\u00104\"\u0004\b5\u00106R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010\u001a\u001a\u0004\b2\u0010\u001c\"\u0004\b<\u0010\u001eR$\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010 \u001a\u0004\b=\u0010!\"\u0004\b>\u0010#R$\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u0010 \u001a\u0004\b@\u0010!\"\u0004\bA\u0010#R$\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010 \u001a\u0004\bB\u0010!\"\u0004\bC\u0010#R$\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bD\u0010 \u001a\u0004\bE\u0010!\"\u0004\bF\u0010#R$\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b=\u0010 \u001a\u0004\bG\u0010!\"\u0004\bH\u0010#¨\u0006I"}, d2 = {"Lcom/garmin/android/apps/connectmobile/smartscale/model/b;", "Landroid/os/Parcelable;", "", "deviceInviteID", "", "deviceID", "invitorID", "invitorName", "invitorDisplayName", "inviteeID", "inviteeEmail", "Lcom/garmin/android/apps/connectmobile/smartscale/model/d;", "deviceInviteStatus", "", "requestViewed", "inviteDate", "invitorProfilePicURL", "applicationKey", "productPartNumber", "productDisplayName", "productImageUrl", "Lb12/b;", "userProfileImageData", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/smartscale/model/d;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb12/b;)V", "a", "Ljava/lang/Long;", "f", "()Ljava/lang/Long;", "setDeviceInviteID", "(Ljava/lang/Long;)V", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "setDeviceID", "(Ljava/lang/String;)V", "c", JWKParameterNames.OCT_KEY_VALUE, "setInvitorID", "d", "m", "setInvitorName", JWKParameterNames.RSA_EXPONENT, "j", "setInvitorDisplayName", IntegerTokenConverter.CONVERTER_KEY, "setInviteeID", "g", "getInviteeEmail", "setInviteeEmail", "h", "Lcom/garmin/android/apps/connectmobile/smartscale/model/d;", "()Lcom/garmin/android/apps/connectmobile/smartscale/model/d;", "setDeviceInviteStatus", "(Lcom/garmin/android/apps/connectmobile/smartscale/model/d;)V", "Ljava/lang/Boolean;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "()Ljava/lang/Boolean;", "setRequestViewed", "(Ljava/lang/Boolean;)V", "setInviteDate", "o", "setInvitorProfilePicURL", "l", "getApplicationKey", "setApplicationKey", "getProductPartNumber", "setProductPartNumber", JWKParameterNames.RSA_MODULUS, "getProductDisplayName", "setProductDisplayName", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "setProductImageUrl", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceInviteId")
    private Long deviceInviteID;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceId")
    private String deviceID;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("invitorId")
    private Long invitorID;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("invitorName")
    private String invitorName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("invitorDisplayName")
    private String invitorDisplayName;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("inviteeId")
    private Long inviteeID;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("inviteeEmail")
    private String inviteeEmail;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceInviteStatus")
    private d deviceInviteStatus;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("requestViewed")
    private Boolean requestViewed;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("inviteDate")
    private Long inviteDate;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("invitorProfilePicURL")
    private String invitorProfilePicURL;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("applicationKey")
    private String applicationKey;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("productPartNumber")
    private String productPartNumber;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("productDisplayName")
    private String productDisplayName;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("productImageUrl")
    private String productImageUrl;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public transient b12.b f44443p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f44427q = new a(null);
    public static final Parcelable.Creator<b> CREATOR = new C0839b();

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.smartscale.model.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0839b implements Parcelable.Creator<b> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            Long lValueOf;
            Long l14;
            Object objValueOf;
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
            Long lValueOf3 = l14;
            Long l15 = lValueOf2;
            String string3 = parcel.readString();
            Long lValueOf4 = parcel.readInt() == 0 ? lValueOf3 : Long.valueOf(parcel.readLong());
            String string4 = parcel.readString();
            Object objValueOf2 = parcel.readInt() == 0 ? lValueOf3 : d.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                objValueOf = lValueOf3;
            } else {
                objValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                lValueOf3 = Long.valueOf(parcel.readLong());
            }
            return new b(lValueOf, string, l15, string2, string3, lValueOf4, string4, objValueOf2, objValueOf, lValueOf3, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (b12.b) parcel.readParcelable(b.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public /* synthetic */ b(Long l14, String str, Long l15, String str2, String str3, Long l16, String str4, d dVar, Boolean bool, Long l17, String str5, String str6, String str7, String str8, String str9, b12.b bVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : l15, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : str3, (i14 & 32) != 0 ? null : l16, (i14 & 64) != 0 ? null : str4, (i14 & 128) != 0 ? null : dVar, (i14 & 256) != 0 ? null : bool, (i14 & 512) != 0 ? null : l17, (i14 & 1024) != 0 ? null : str5, (i14 & 2048) != 0 ? null : str6, (i14 & 4096) != 0 ? null : str7, (i14 & 8192) != 0 ? null : str8, (i14 & 16384) != 0 ? null : str9, (i14 & 32768) != 0 ? b12.b.f14386g : bVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDeviceID() {
        return this.deviceID;
    }

    public final long d() {
        String str = this.deviceID;
        if (str != null) {
            return Long.parseLong(str);
        }
        return -1L;
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
        return s.g(this.deviceInviteID, bVar.deviceInviteID) && s.g(this.deviceID, bVar.deviceID) && s.g(this.invitorID, bVar.invitorID) && s.g(this.invitorName, bVar.invitorName) && s.g(this.invitorDisplayName, bVar.invitorDisplayName) && s.g(this.inviteeID, bVar.inviteeID) && s.g(this.inviteeEmail, bVar.inviteeEmail) && this.deviceInviteStatus == bVar.deviceInviteStatus && s.g(this.requestViewed, bVar.requestViewed) && s.g(this.inviteDate, bVar.inviteDate) && s.g(this.invitorProfilePicURL, bVar.invitorProfilePicURL) && s.g(this.applicationKey, bVar.applicationKey) && s.g(this.productPartNumber, bVar.productPartNumber) && s.g(this.productDisplayName, bVar.productDisplayName) && s.g(this.productImageUrl, bVar.productImageUrl) && s.g(this.f44443p, bVar.f44443p);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getDeviceInviteID() {
        return this.deviceInviteID;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final d getDeviceInviteStatus() {
        return this.deviceInviteStatus;
    }

    public final String getPartNumberPartial() {
        String str = this.productPartNumber;
        if (str != null) {
            if (str != null && str.length() == 4) {
                return this.productPartNumber;
            }
            try {
                int iH = w.H(str, "-", 0, false, 4);
                return str.substring(iH + 2, iH + 6);
            } catch (IndexOutOfBoundsException e4) {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.DEVICES;
                String name = b.class.getName();
                aVar.getClass();
                i2.a.g(a2Var, name, e4);
            }
        }
        return null;
    }

    public final String getProductDisplayName() {
        return this.productDisplayName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Long getInviteDate() {
        return this.inviteDate;
    }

    public final int hashCode() {
        Long l14 = this.deviceInviteID;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.deviceID;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l15 = this.invitorID;
        int iHashCode3 = (iHashCode2 + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str2 = this.invitorName;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.invitorDisplayName;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l16 = this.inviteeID;
        int iHashCode6 = (iHashCode5 + (l16 == null ? 0 : l16.hashCode())) * 31;
        String str4 = this.inviteeEmail;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        d dVar = this.deviceInviteStatus;
        int iHashCode8 = (iHashCode7 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Boolean bool = this.requestViewed;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l17 = this.inviteDate;
        int iHashCode10 = (iHashCode9 + (l17 == null ? 0 : l17.hashCode())) * 31;
        String str5 = this.invitorProfilePicURL;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.applicationKey;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.productPartNumber;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.productDisplayName;
        int iHashCode14 = (iHashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.productImageUrl;
        int iHashCode15 = (iHashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        b12.b bVar = this.f44443p;
        return iHashCode15 + (bVar != null ? bVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Long getInviteeID() {
        return this.inviteeID;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getInvitorDisplayName() {
        return this.invitorDisplayName;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Long getInvitorID() {
        return this.invitorID;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getInvitorName() {
        return this.invitorName;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getInvitorProfilePicURL() {
        return this.invitorProfilePicURL;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getProductImageUrl() {
        return this.productImageUrl;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Boolean getRequestViewed() {
        return this.requestViewed;
    }

    public final boolean s() {
        return this.deviceID != null || this.deviceInviteID != null || this.invitorID == null || this.inviteeID == null;
    }

    public final String toString() {
        Long l14 = this.deviceInviteID;
        String str = this.deviceID;
        Long l15 = this.invitorID;
        String str2 = this.invitorName;
        String str3 = this.invitorDisplayName;
        Long l16 = this.inviteeID;
        String str4 = this.inviteeEmail;
        d dVar = this.deviceInviteStatus;
        Boolean bool = this.requestViewed;
        Long l17 = this.inviteDate;
        String str5 = this.invitorProfilePicURL;
        String str6 = this.applicationKey;
        String str7 = this.productPartNumber;
        String str8 = this.productDisplayName;
        String str9 = this.productImageUrl;
        b12.b bVar = this.f44443p;
        StringBuilder sbJ = i.j("DeviceInviteDTO(deviceInviteID=", ", deviceID=", str, l14, ", invitorID=");
        i.q(l15, ", invitorName=", str2, ", invitorDisplayName=", sbJ);
        n23.j.q(l16, str3, ", inviteeID=", ", inviteeEmail=", sbJ);
        sbJ.append(str4);
        sbJ.append(", deviceInviteStatus=");
        sbJ.append(dVar);
        sbJ.append(", requestViewed=");
        sbJ.append(bool);
        sbJ.append(", inviteDate=");
        sbJ.append(l17);
        sbJ.append(", invitorProfilePicURL=");
        sn.a.t(sbJ, str5, ", applicationKey=", str6, ", productPartNumber=");
        sn.a.t(sbJ, str7, ", productDisplayName=", str8, ", productImageUrl=");
        sbJ.append(str9);
        sbJ.append(", userProfileImageData=");
        sbJ.append(bVar);
        sbJ.append(")");
        return sbJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.deviceInviteID;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.deviceID);
        Long l15 = this.invitorID;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeString(this.invitorName);
        parcel.writeString(this.invitorDisplayName);
        Long l16 = this.inviteeID;
        if (l16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l16);
        }
        parcel.writeString(this.inviteeEmail);
        d dVar = this.deviceInviteStatus;
        if (dVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(dVar.name());
        }
        Boolean bool = this.requestViewed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            k.m(parcel, 1, bool);
        }
        Long l17 = this.inviteDate;
        if (l17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l17);
        }
        parcel.writeString(this.invitorProfilePicURL);
        parcel.writeString(this.applicationKey);
        parcel.writeString(this.productPartNumber);
        parcel.writeString(this.productDisplayName);
        parcel.writeString(this.productImageUrl);
        parcel.writeParcelable(this.f44443p, i14);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/smartscale/model/b$a;", "", "<init>", "()V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public b(Long l14, String str, Long l15, String str2, String str3, Long l16, String str4, d dVar, Boolean bool, Long l17, String str5, String str6, String str7, String str8, String str9, b12.b bVar) {
        this.deviceInviteID = l14;
        this.deviceID = str;
        this.invitorID = l15;
        this.invitorName = str2;
        this.invitorDisplayName = str3;
        this.inviteeID = l16;
        this.inviteeEmail = str4;
        this.deviceInviteStatus = dVar;
        this.requestViewed = bool;
        this.inviteDate = l17;
        this.invitorProfilePicURL = str5;
        this.applicationKey = str6;
        this.productPartNumber = str7;
        this.productDisplayName = str8;
        this.productImageUrl = str9;
        this.f44443p = bVar;
    }

    public b() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }
}
