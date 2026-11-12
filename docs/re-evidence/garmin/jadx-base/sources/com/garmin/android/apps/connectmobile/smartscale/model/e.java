package com.garmin.android.apps.connectmobile.smartscale.model;

import android.os.Parcel;
import android.os.Parcelable;
import b71.i;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0018\u001a\u0004\b\u0017\u0010\u001a\"\u0004\b$\u0010\u001cR$\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b \u0010\u0014R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\r\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010'\u001a\u0004\b,\u0010)\"\u0004\b-\u0010+R\"\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010'\u001a\u0004\b\u000e\u0010)\"\u0004\b.\u0010+¨\u0006/"}, d2 = {"Lcom/garmin/android/apps/connectmobile/smartscale/model/e;", "Landroid/os/Parcelable;", "", "userProfileId", "", "userEmail", "userDisplayName", "displayName", "fullName", "userProfilePicUrlSmall", "inviteId", "", "isPrimary", "isAccepted", "isPro", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;ZZZ)V", "a", "Ljava/lang/Long;", "h", "()Ljava/lang/Long;", "setUserProfileId", "(Ljava/lang/Long;)V", "b", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "setUserEmail", "(Ljava/lang/String;)V", "c", "f", "setUserDisplayName", "d", "getDisplayName", "setDisplayName", JWKParameterNames.RSA_EXPONENT, "setFullName", "getUserProfilePicUrlSmall", "setUserProfilePicUrlSmall", "Z", "j", "()Z", "setPrimary", "(Z)V", IntegerTokenConverter.CONVERTER_KEY, "setAccepted", "setPro", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfileId")
    private Long userProfileId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userEmail")
    private String userEmail;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userDisplayName")
    private String userDisplayName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayName ")
    private String displayName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fullName")
    private String fullName;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePicUrlSmall")
    private String userProfilePicUrlSmall;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("inviteId")
    private final Long inviteId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isPrimary")
    private boolean isPrimary;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isAccepted")
    private boolean isAccepted;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isPro")
    private boolean isPro;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b12.b f44460k;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            Long lValueOf;
            Long l14;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                lValueOf = null;
                l14 = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
                l14 = null;
            }
            String string = parcel.readString();
            Long l15 = l14;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Long lValueOf2 = l15;
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            boolean z14 = false;
            boolean z15 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z14 = true;
            }
            return new e(lValueOf, string, string2, string3, string4, string5, lValueOf2, z15, z14, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public /* synthetic */ e(Long l14, String str, String str2, String str3, String str4, String str5, Long l15, boolean z14, boolean z15, boolean z16, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? null : str5, (i14 & 64) != 0 ? null : l15, (i14 & 128) != 0 ? false : z14, (i14 & 256) != 0 ? false : z15, (i14 & 512) != 0 ? false : z16);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getInviteId() {
        return this.inviteId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.userProfileId, eVar.userProfileId) && s.g(this.userEmail, eVar.userEmail) && s.g(this.userDisplayName, eVar.userDisplayName) && s.g(this.displayName, eVar.displayName) && s.g(this.fullName, eVar.fullName) && s.g(this.userProfilePicUrlSmall, eVar.userProfilePicUrlSmall) && s.g(this.inviteId, eVar.inviteId) && this.isPrimary == eVar.isPrimary && this.isAccepted == eVar.isAccepted && this.isPro == eVar.isPro;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getUserDisplayName() {
        return this.userDisplayName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getUserEmail() {
        return this.userEmail;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Long getUserProfileId() {
        return this.userProfileId;
    }

    public final int hashCode() {
        Long l14 = this.userProfileId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.userEmail;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.userDisplayName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.displayName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fullName;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.userProfilePicUrlSmall;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l15 = this.inviteId;
        return Boolean.hashCode(this.isPro) + q6.f.g(q6.f.g((iHashCode6 + (l15 != null ? l15.hashCode() : 0)) * 31, 31, this.isPrimary), 31, this.isAccepted);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsAccepted() {
        return this.isAccepted;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsPrimary() {
        return this.isPrimary;
    }

    public final String toString() {
        Long l14 = this.userProfileId;
        String str = this.userEmail;
        String str2 = this.userDisplayName;
        String str3 = this.displayName;
        String str4 = this.fullName;
        String str5 = this.userProfilePicUrlSmall;
        Long l15 = this.inviteId;
        boolean z14 = this.isPrimary;
        boolean z15 = this.isAccepted;
        boolean z16 = this.isPro;
        StringBuilder sbJ = i.j("IndexDeviceUserDTO(userProfileId=", ", userEmail=", str, l14, ", userDisplayName=");
        sn.a.t(sbJ, str2, ", displayName=", str3, ", fullName=");
        sn.a.t(sbJ, str4, ", userProfilePicUrlSmall=", str5, ", inviteId=");
        sbJ.append(l15);
        sbJ.append(", isPrimary=");
        sbJ.append(z14);
        sbJ.append(", isAccepted=");
        return com.airbnb.lottie.animation.keyframe.a.f(", isPro=", ")", sbJ, z15, z16);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.userProfileId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.userEmail);
        parcel.writeString(this.userDisplayName);
        parcel.writeString(this.displayName);
        parcel.writeString(this.fullName);
        parcel.writeString(this.userProfilePicUrlSmall);
        Long l15 = this.inviteId;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeInt(this.isPrimary ? 1 : 0);
        parcel.writeInt(this.isAccepted ? 1 : 0);
        parcel.writeInt(this.isPro ? 1 : 0);
    }

    public e(Long l14, String str, String str2, String str3, String str4, String str5, Long l15, boolean z14, boolean z15, boolean z16) {
        this.userProfileId = l14;
        this.userEmail = str;
        this.userDisplayName = str2;
        this.displayName = str3;
        this.fullName = str4;
        this.userProfilePicUrlSmall = str5;
        this.inviteId = l15;
        this.isPrimary = z14;
        this.isAccepted = z15;
        this.isPro = z16;
        this.f44460k = b12.b.f14386g;
    }

    public e() {
        this(null, null, null, null, null, null, null, false, false, false, 1023, null);
    }
}
