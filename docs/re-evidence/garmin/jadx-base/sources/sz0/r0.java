package sz0;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001Bs\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0014\u001a\u0004\b&\u0010\u0016\"\u0004\b'\u0010\u0018R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b\n\u0010*\"\u0004\b\u0019\u0010+R\"\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010)\u001a\u0004\b\u000b\u0010*\"\u0004\b,\u0010+R\"\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010)\u001a\u0004\b\f\u0010*\"\u0004\b.\u0010+R\"\u0010\r\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010)\u001a\u0004\b\r\u0010*\"\u0004\b0\u0010+R$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0014\u001a\u0004\b1\u0010\u0016\"\u0004\b-\u0010\u0018R$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010\u0014\u001a\u0004\b2\u0010\u0016\"\u0004\b/\u0010\u0018R\"\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u0010\u001a\u001a\u0004\b4\u0010\u001c\"\u0004\b%\u0010\u001e¨\u00065"}, d2 = {"Lsz0/r0;", "Landroid/os/Parcelable;", "", "registrationId", "", "userProfilePk", "", "serviceProviderPk", "appType", "", "isAlertAccepted", "isBadgeAccepted", "isSoundAccepted", "isPushEnabled", "platform", RemoteConfigConstants.RequestFieldKey.PLATFORM_VERSION, RemoteConfigConstants.RequestFieldKey.APP_VERSION, "<init>", "(Ljava/lang/String;JILjava/lang/String;ZZZZLjava/lang/String;Ljava/lang/String;J)V", "a", "Ljava/lang/String;", "getRegistrationId", "()Ljava/lang/String;", "setRegistrationId", "(Ljava/lang/String;)V", "b", "J", "getUserProfilePk", "()J", "setUserProfilePk", "(J)V", "c", "I", "getServiceProviderPk", "()I", "setServiceProviderPk", "(I)V", "d", "getAppType", "setAppType", JWKParameterNames.RSA_EXPONENT, "Z", "()Z", "(Z)V", "f", "g", "j", "h", IntegerTokenConverter.CONVERTER_KEY, "getPlatform", "getPlatformVersion", JWKParameterNames.OCT_KEY_VALUE, "getAppVersion", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class r0 implements Parcelable {
    public static final Parcelable.Creator<r0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("registrationID")
    private String registrationId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastLoggedInUserPk")
    private long userProfilePk;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pushnotificationProviderPk")
    private int serviceProviderPk;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("appType")
    private String appType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isAlertAccepted")
    private boolean isAlertAccepted;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isBadgeAccepted")
    private boolean isBadgeAccepted;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isSoundAccepted")
    private boolean isSoundAccepted;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("enablePushNotification")
    private boolean isPushEnabled;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("platform")
    private String platform;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.RequestFieldKey.PLATFORM_VERSION)
    private String platformVersion;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.RequestFieldKey.APP_VERSION)
    private long appVersion;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<r0> {
        @Override // android.os.Parcelable.Creator
        public final r0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            long j8 = parcel.readLong();
            int i14 = parcel.readInt();
            String string2 = parcel.readString();
            boolean z14 = false;
            boolean z15 = true;
            boolean z16 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z14 = true;
            }
            if (parcel.readInt() == 0) {
                z15 = z14;
            }
            return new r0(string, j8, i14, string2, z16, z14, z15, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final r0[] newArray(int i14) {
            return new r0[i14];
        }
    }

    public /* synthetic */ r0(String str, long j8, int i14, String str2, boolean z14, boolean z15, boolean z16, boolean z17, String str3, String str4, long j14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(str, j8, i14, str2, (i15 & 16) != 0 ? false : z14, (i15 & 32) != 0 ? false : z15, (i15 & 64) != 0 ? false : z16, (i15 & 128) != 0 ? false : z17, (i15 & 256) != 0 ? null : str3, (i15 & 512) != 0 ? null : str4, (i15 & 1024) != 0 ? 0L : j14);
    }

    public final void b() {
        this.isAlertAccepted = true;
    }

    public final void d(long j8) {
        this.appVersion = j8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return p005kotlin.jvm.internal.s.g(this.registrationId, r0Var.registrationId) && this.userProfilePk == r0Var.userProfilePk && this.serviceProviderPk == r0Var.serviceProviderPk && p005kotlin.jvm.internal.s.g(this.appType, r0Var.appType) && this.isAlertAccepted == r0Var.isAlertAccepted && this.isBadgeAccepted == r0Var.isBadgeAccepted && this.isSoundAccepted == r0Var.isSoundAccepted && this.isPushEnabled == r0Var.isPushEnabled && p005kotlin.jvm.internal.s.g(this.platform, r0Var.platform) && p005kotlin.jvm.internal.s.g(this.platformVersion, r0Var.platformVersion) && this.appVersion == r0Var.appVersion;
    }

    public final void f() {
        this.isBadgeAccepted = true;
    }

    public final void g() {
        this.platform = "google";
    }

    public final void h() {
        this.platformVersion = Build.VERSION.RELEASE;
    }

    public final int hashCode() {
        int iG = q6.f.g(q6.f.g(q6.f.g(q6.f.g(wr.g.j(q2.d(this.serviceProviderPk, q6.f.e(this.registrationId.hashCode() * 31, 31, this.userProfilePk), 31), 31, this.appType), 31, this.isAlertAccepted), 31, this.isBadgeAccepted), 31, this.isSoundAccepted), 31, this.isPushEnabled);
        String str = this.platform;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.platformVersion;
        return Long.hashCode(this.appVersion) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final void i() {
        this.isPushEnabled = true;
    }

    public final void j() {
        this.isSoundAccepted = true;
    }

    public final String toString() {
        String str = this.registrationId;
        long j8 = this.userProfilePk;
        int i14 = this.serviceProviderPk;
        String str2 = this.appType;
        boolean z14 = this.isAlertAccepted;
        boolean z15 = this.isBadgeAccepted;
        boolean z16 = this.isSoundAccepted;
        boolean z17 = this.isPushEnabled;
        String str3 = this.platform;
        String str4 = this.platformVersion;
        long j14 = this.appVersion;
        StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(j8, "PushNotificationSettingsDTO(registrationId=", str, ", userProfilePk=");
        sbJ.append(", serviceProviderPk=");
        sbJ.append(i14);
        sbJ.append(", appType=");
        sbJ.append(str2);
        com.airbnb.lottie.animation.keyframe.a.v(", isAlertAccepted=", ", isBadgeAccepted=", sbJ, z14, z15);
        com.airbnb.lottie.animation.keyframe.a.v(", isSoundAccepted=", ", isPushEnabled=", sbJ, z16, z17);
        sn.a.t(sbJ, ", platform=", str3, ", platformVersion=", str4);
        return com.nimbusds.jose.shaded.gson.internal.a.g(j14, ", appVersion=", ")", sbJ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.registrationId);
        parcel.writeLong(this.userProfilePk);
        parcel.writeInt(this.serviceProviderPk);
        parcel.writeString(this.appType);
        parcel.writeInt(this.isAlertAccepted ? 1 : 0);
        parcel.writeInt(this.isBadgeAccepted ? 1 : 0);
        parcel.writeInt(this.isSoundAccepted ? 1 : 0);
        parcel.writeInt(this.isPushEnabled ? 1 : 0);
        parcel.writeString(this.platform);
        parcel.writeString(this.platformVersion);
        parcel.writeLong(this.appVersion);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r0(String str, long j8, int i14, String str2, boolean z14) {
        this(str, j8, i14, str2, z14, false, false, false, null, null, 0L, 2016, null);
        str.getClass();
        str2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r0(String str, long j8, int i14, String str2, boolean z14, boolean z15) {
        this(str, j8, i14, str2, z14, z15, false, false, null, null, 0L, 1984, null);
        str.getClass();
        str2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r0(String str, long j8, int i14, String str2, boolean z14, boolean z15, boolean z16) {
        this(str, j8, i14, str2, z14, z15, z16, false, null, null, 0L, 1920, null);
        str.getClass();
        str2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r0(String str, long j8, int i14, String str2, boolean z14, boolean z15, boolean z16, boolean z17) {
        this(str, j8, i14, str2, z14, z15, z16, z17, null, null, 0L, 1792, null);
        str.getClass();
        str2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r0(String str, long j8, int i14, String str2, boolean z14, boolean z15, boolean z16, boolean z17, String str3) {
        this(str, j8, i14, str2, z14, z15, z16, z17, str3, null, 0L, 1536, null);
        str.getClass();
        str2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r0(String str, long j8, int i14, String str2, boolean z14, boolean z15, boolean z16, boolean z17, String str3, String str4) {
        this(str, j8, i14, str2, z14, z15, z16, z17, str3, str4, 0L, 1024, null);
        str.getClass();
        str2.getClass();
    }

    public r0(String str, long j8, int i14, String str2, boolean z14, boolean z15, boolean z16, boolean z17, String str3, String str4, long j14) {
        str.getClass();
        str2.getClass();
        this.registrationId = str;
        this.userProfilePk = j8;
        this.serviceProviderPk = i14;
        this.appType = str2;
        this.isAlertAccepted = z14;
        this.isBadgeAccepted = z15;
        this.isSoundAccepted = z16;
        this.isPushEnabled = z17;
        this.platform = str3;
        this.platformVersion = str4;
        this.appVersion = j14;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r0(String str, long j8, int i14, String str2) {
        this(str, j8, i14, str2, false, false, false, false, null, null, 0L, 2032, null);
        str.getClass();
        str2.getClass();
    }
}
