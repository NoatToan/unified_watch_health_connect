package com.garmin.android.apps.connectmobile.userprofile.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u0017\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0018\u001a\u0004\b&\u0010\u001a\"\u0004\b'\u0010\u001cR$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b(\u0010\u001cR$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b)\u0010\u001a\"\u0004\b*\u0010\u001cR$\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0018\u001a\u0004\b,\u0010\u001a\"\u0004\b-\u0010\u001c¨\u0006."}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/model/d;", "Landroid/os/Parcelable;", "", "userProfileId", "", "displayName", "fullName", "", "userLevel", "profileImageUrlLarge", "profileImageUrlMedium", "profileImageUrlSmall", FirebaseAnalytics.Param.LOCATION, "Lb12/b;", "userProfileImageData", "<init>", "(JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb12/b;)V", "a", "J", "g", "()J", "setUserProfileId", "(J)V", "b", "Ljava/lang/String;", "getDisplayName", "()Ljava/lang/String;", "setDisplayName", "(Ljava/lang/String;)V", "c", "setFullName", "d", "I", "f", "()I", "setUserLevel", "(I)V", JWKParameterNames.RSA_EXPONENT, "getProfileImageUrlLarge", "setProfileImageUrlLarge", "setProfileImageUrlMedium", "getProfileImageUrlSmall", "setProfileImageUrlSmall", "h", "getLocation", "setLocation", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfileId")
    private long userProfileId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayName")
    private String displayName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fullName")
    private String fullName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userLevel")
    private int userLevel;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageUrlLarge")
    private String profileImageUrlLarge;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageUrlMedium")
    private String profileImageUrlMedium;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageUrlSmall")
    private String profileImageUrlSmall;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName(FirebaseAnalytics.Param.LOCATION)
    private String location;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b12.b f46849i;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (b12.b) parcel.readParcelable(d.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public /* synthetic */ d(long j8, String str, String str2, int i14, String str3, String str4, String str5, String str6, b12.b bVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this(j8, str, (i15 & 4) != 0 ? null : str2, (i15 & 8) != 0 ? 1 : i14, (i15 & 16) != 0 ? null : str3, (i15 & 32) != 0 ? null : str4, (i15 & 64) != 0 ? null : str5, (i15 & 128) != 0 ? null : str6, (i15 & 256) != 0 ? null : bVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getProfileImageUrlMedium() {
        return this.profileImageUrlMedium;
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
        return this.userProfileId == dVar.userProfileId && s.g(this.displayName, dVar.displayName) && s.g(this.fullName, dVar.fullName) && this.userLevel == dVar.userLevel && s.g(this.profileImageUrlLarge, dVar.profileImageUrlLarge) && s.g(this.profileImageUrlMedium, dVar.profileImageUrlMedium) && s.g(this.profileImageUrlSmall, dVar.profileImageUrlSmall) && s.g(this.location, dVar.location) && s.g(this.f46849i, dVar.f46849i);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getUserLevel() {
        return this.userLevel;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getUserProfileId() {
        return this.userProfileId;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.userProfileId) * 31;
        String str = this.displayName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fullName;
        int iD = q2.d(this.userLevel, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.profileImageUrlLarge;
        int iHashCode3 = (iD + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.profileImageUrlMedium;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.profileImageUrlSmall;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.location;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        b12.b bVar = this.f46849i;
        return iHashCode6 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        long j8 = this.userProfileId;
        String str = this.displayName;
        String str2 = this.fullName;
        int i14 = this.userLevel;
        String str3 = this.profileImageUrlLarge;
        String str4 = this.profileImageUrlMedium;
        String str5 = this.profileImageUrlSmall;
        String str6 = this.location;
        b12.b bVar = this.f46849i;
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "BlockedUserProfileDTO(userProfileId=", ", displayName=", str);
        sbK.append(", fullName=");
        sbK.append(str2);
        sbK.append(", userLevel=");
        sbK.append(i14);
        sn.a.t(sbK, ", profileImageUrlLarge=", str3, ", profileImageUrlMedium=", str4);
        sn.a.t(sbK, ", profileImageUrlSmall=", str5, ", location=", str6);
        sbK.append(", userProfileImageData=");
        sbK.append(bVar);
        sbK.append(")");
        return sbK.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.userProfileId);
        parcel.writeString(this.displayName);
        parcel.writeString(this.fullName);
        parcel.writeInt(this.userLevel);
        parcel.writeString(this.profileImageUrlLarge);
        parcel.writeString(this.profileImageUrlMedium);
        parcel.writeString(this.profileImageUrlSmall);
        parcel.writeString(this.location);
        parcel.writeParcelable(this.f46849i, i14);
    }

    public d(long j8, String str, String str2, int i14, String str3, String str4, String str5, String str6, b12.b bVar) {
        this.userProfileId = j8;
        this.displayName = str;
        this.fullName = str2;
        this.userLevel = i14;
        this.profileImageUrlLarge = str3;
        this.profileImageUrlMedium = str4;
        this.profileImageUrlSmall = str5;
        this.location = str6;
        this.f46849i = bVar;
    }
}
