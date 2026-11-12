package com.garmin.android.apps.connectmobile.userprofile.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import f12.u;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0014\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006R$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\tR$\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR$\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\rR$\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\t\u001a\u0004\b\u001a\u0010\u000b\"\u0004\b\u001b\u0010\rR$\u0010 \u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\rR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010+\u001a\u00020!8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010#\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R\"\u0010.\u001a\u00020!8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010#\u001a\u0004\b,\u0010%\"\u0004\b-\u0010'R$\u00102\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010\t\u001a\u0004\b0\u0010\u000b\"\u0004\b1\u0010\rR\"\u00106\u001a\u0002038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010<\u001a\u0002038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b:\u00105\u001a\u0004\b4\u00107\"\u0004\b;\u00109R\"\u0010B\u001a\u00020=8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010>\u001a\u0004\b\u0015\u0010?\"\u0004\b@\u0010AR$\u0010I\u001a\u0004\u0018\u00010C8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\b\"\u0010F\"\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/model/c;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "", "a", "Ljava/lang/String;", "getDisplayName", "()Ljava/lang/String;", "m", "(Ljava/lang/String;)V", "displayName", "b", "fullName", "c", "getProfileImageUrlLarge", "setProfileImageUrlLarge", "profileImageUrlLarge", "d", "getProfileImageUrlMedium", "setProfileImageUrlMedium", "profileImageUrlMedium", JWKParameterNames.RSA_EXPONENT, "getProfileImageUrlSmall", "setProfileImageUrlSmall", "profileImageUrlSmall", "f", "getLocation", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, FirebaseAnalytics.Param.LOCATION, "", "g", "I", "h", "()I", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "(I)V", "userLevel", IntegerTokenConverter.CONVERTER_KEY, "u", "userPoints", "getNextLevelPoints", "setNextLevelPoints", "nextLevelPoints", "j", "getLevelUpdateDate", "setLevelUpdateDate", "levelUpdateDate", "", JWKParameterNames.OCT_KEY_VALUE, "Z", "isLevelViewed", "()Z", "setLevelViewed", "(Z)V", "l", "setBlocked", "isBlocked", "Lcom/garmin/android/apps/connectmobile/userprofile/model/h;", "Lcom/garmin/android/apps/connectmobile/userprofile/model/h;", "()Lcom/garmin/android/apps/connectmobile/userprofile/model/h;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "(Lcom/garmin/android/apps/connectmobile/userprofile/model/h;)V", "profileImageType", "Lcom/garmin/android/apps/connectmobile/userprofile/model/j;", JWKParameterNames.RSA_MODULUS, "Lcom/garmin/android/apps/connectmobile/userprofile/model/j;", "()Lcom/garmin/android/apps/connectmobile/userprofile/model/j;", "s", "(Lcom/garmin/android/apps/connectmobile/userprofile/model/j;)V", "profileImageUrls", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayName")
    private String displayName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fullName")
    private String fullName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageUrlLarge")
    private String profileImageUrlLarge;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageUrlMedium")
    private String profileImageUrlMedium;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageUrlSmall")
    private String profileImageUrlSmall;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName(FirebaseAnalytics.Param.LOCATION)
    private String location;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userLevel")
    private int userLevel;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userPoint")
    private int userPoints;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("levelPointThreshold")
    private int nextLevelPoints;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("levelUpdateDate")
    private String levelUpdateDate;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("levelIsViewed")
    private boolean isLevelViewed;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isBlocked")
    private boolean isBlocked;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageType")
    private h profileImageType;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageUrls")
    private j profileImageUrls;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f46826o = new b(null);
    public static final Parcelable.Creator<c> CREATOR = new a();

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/userprofile/model/c$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/userprofile/model/c;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public c(Parcel parcel) {
        h hVarValueOf;
        parcel.getClass();
        h hVar = h.UPLOADED_PHOTO;
        this.profileImageType = hVar;
        this.displayName = parcel.readString();
        this.fullName = parcel.readString();
        this.profileImageUrlLarge = parcel.readString();
        this.profileImageUrlMedium = parcel.readString();
        this.profileImageUrlSmall = parcel.readString();
        this.location = parcel.readString();
        this.userLevel = parcel.readInt();
        this.userPoints = parcel.readInt();
        this.nextLevelPoints = parcel.readInt();
        this.levelUpdateDate = parcel.readString();
        this.isLevelViewed = parcel.readByte() != 0;
        this.isBlocked = parcel.readByte() != 0;
        try {
            String string = parcel.readString();
            if (string != null && (hVarValueOf = h.valueOf(string)) != null) {
                hVar = hVarValueOf;
            }
        } catch (Exception unused) {
            hVar = h.UPLOADED_PHOTO;
        }
        this.profileImageType = hVar;
        this.profileImageUrls = (j) parcel.readParcelable(j.class.getClassLoader());
    }

    public final String b() {
        return !TextUtils.isEmpty(this.fullName) ? this.fullName : this.displayName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final h getProfileImageType() {
        return this.profileImageType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String f() {
        j jVar = this.profileImageUrls;
        if (jVar != null) {
            return jVar.f46878g;
        }
        return null;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final j getProfileImageUrls() {
        return this.profileImageUrls;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getUserLevel() {
        return this.userLevel;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getUserPoints() {
        return this.userPoints;
    }

    public final b12.b j() {
        j jVar = this.profileImageUrls;
        return new b12.b(jVar != null ? jVar.f46878g : null, null, u.a(this.userLevel), null, null, 26, null);
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsBlocked() {
        return this.isBlocked;
    }

    public final void m(String str) {
        this.displayName = str;
    }

    public final void o(String str) {
        this.fullName = str;
    }

    public final void q(String str) {
        this.location = str;
    }

    public final void r(h hVar) {
        hVar.getClass();
        this.profileImageType = hVar;
    }

    public final void s(j jVar) {
        this.profileImageUrls = jVar;
    }

    public final void t(int i14) {
        this.userLevel = i14;
    }

    public final void u(int i14) {
        this.userPoints = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.displayName);
        parcel.writeString(this.fullName);
        parcel.writeString(this.profileImageUrlLarge);
        parcel.writeString(this.profileImageUrlMedium);
        parcel.writeString(this.profileImageUrlSmall);
        parcel.writeString(this.location);
        parcel.writeInt(this.userLevel);
        parcel.writeInt(this.userPoints);
        parcel.writeInt(this.nextLevelPoints);
        parcel.writeString(this.levelUpdateDate);
        parcel.writeByte(this.isLevelViewed ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isBlocked ? (byte) 1 : (byte) 0);
        parcel.writeString(this.profileImageType.name());
        parcel.writeParcelable(this.profileImageUrls, i14);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/model/c$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/userprofile/model/c;", "CREATOR", "Landroid/os/Parcelable$Creator;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public c() {
        this.profileImageType = h.UPLOADED_PHOTO;
    }
}
