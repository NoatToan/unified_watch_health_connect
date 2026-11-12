package o10;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.gncs.NotificationConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;
import tn.k;
import wr.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\bA\b\u0087\b\u0018\u00002\u00020\u0001B»\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010 \u001a\u0004\b+\u0010\"\"\u0004\b,\u0010$R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010 \u001a\u0004\b.\u0010\"\"\u0004\b/\u0010$R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b\u001a\u00104R\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u0010 \u001a\u0004\b6\u0010\"\"\u0004\b7\u0010$R\"\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u0010 \u001a\u0004\b5\u0010\"\"\u0004\b9\u0010$R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u0010:R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010<\u001a\u0004\b?\u0010>R$\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b@\u0010 \u001a\u0004\b;\u0010\"\"\u0004\bA\u0010$R\u0016\u0010\u0012\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b=\u00101R\"\u0010\u0013\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bB\u00101\u001a\u0004\b8\u00103\"\u0004\bC\u00104R\"\u0010\u0014\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u00101\u001a\u0004\bD\u00103\"\u0004\bE\u00104R\"\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bF\u00101\u001a\u0004\bG\u00103\"\u0004\bH\u00104R\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bI\u0010\u001a\u001a\u0004\bI\u0010\u001c\"\u0004\bJ\u0010\u001e¨\u0006K"}, d2 = {"Lo10/b;", "Landroid/os/Parcelable;", "", "internalVersion", "", "versionName", "", "size", RemoteConfigConstants.RequestFieldKey.APP_ID, "name", "", "hasSettings", NotificationConstants.KEY_DATA_MIME_TYPE, "developerName", "favorite", "minFirmwareVersion", "maxFirmwareVersion", "iconUrl", "installed", "disabled", "updateAvailable", "permissionsChanged", "nativeAppSourceId", "<init>", "(ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;ZZZZI)V", "a", "I", JWKParameterNames.OCT_KEY_VALUE, "()I", "a0", "(I)V", "b", "Ljava/lang/String;", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "()Ljava/lang/String;", "i0", "(Ljava/lang/String;)V", "c", "J", "s", "()J", "f0", "(J)V", "d", "D", JWKParameterNames.RSA_EXPONENT, "o", "c0", "f", "Z", IntegerTokenConverter.CONVERTER_KEY, "()Z", "(Z)V", "g", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "g0", "h", "F", "Ljava/lang/Boolean;", "j", "Ljava/lang/Long;", "m", "()Ljava/lang/Long;", "getMaxFirmwareVersion", "l", "M", JWKParameterNames.RSA_MODULUS, "G", "u", "h0", "p", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "setPermissionsChanged", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "e0", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("latestInternalVersionNumber")
    private int internalVersion;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("latestVersionName")
    private String versionName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("size")
    private long size;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.RequestFieldKey.APP_ID)
    private String appId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("name")
    private String name;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasSettings")
    private boolean hasSettings;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName(NotificationConstants.KEY_DATA_MIME_TYPE)
    private String type;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("developerName")
    private String developerName;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("favorite")
    private Boolean favorite;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("minFirmwareVersion")
    private final Long minFirmwareVersion;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxFirmwareVersion")
    private final Long maxFirmwareVersion;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private String iconUrl;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private boolean installed;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private boolean disabled;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private boolean updateAvailable;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private boolean permissionsChanged;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private int nativeAppSourceId;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            boolean z14;
            boolean z15;
            Boolean boolValueOf;
            boolean z16;
            boolean z17;
            boolean z18;
            boolean z19;
            parcel.getClass();
            int i14 = parcel.readInt();
            String string = parcel.readString();
            long j8 = parcel.readLong();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z15 = false;
                z14 = true;
            } else {
                z14 = false;
                z15 = false;
            }
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0 ? true : z15);
            }
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
            String string6 = parcel.readString();
            if (parcel.readInt() != 0) {
                z16 = true;
                z17 = true;
            } else {
                z16 = true;
                z17 = z15;
            }
            if (parcel.readInt() != 0) {
                z18 = z15;
                z19 = z16;
            } else {
                z18 = z15;
                z19 = z18;
            }
            if (parcel.readInt() == 0) {
                z16 = z18;
            }
            if (parcel.readInt() != 0) {
                z18 = z16;
            }
            return new b(i14, string, j8, string2, string3, z14, string4, string5, boolValueOf, lValueOf, lValueOf2, string6, z17, z19, z16, z18, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public /* synthetic */ b(int i14, String str, long j8, String str2, String str3, boolean z14, String str4, String str5, Boolean bool, Long l14, Long l15, String str6, boolean z15, boolean z16, boolean z17, boolean z18, int i15, int i16, j jVar) {
        this((i16 & 1) != 0 ? 0 : i14, (i16 & 2) != 0 ? "" : str, (i16 & 4) != 0 ? 0L : j8, (i16 & 8) != 0 ? "" : str2, (i16 & 16) != 0 ? "" : str3, (i16 & 32) != 0 ? false : z14, (i16 & 64) != 0 ? "" : str4, (i16 & 128) != 0 ? "" : str5, (i16 & 256) != 0 ? null : bool, (i16 & 512) != 0 ? null : l14, (i16 & 1024) == 0 ? l15 : null, (i16 & 2048) == 0 ? str6 : "", (i16 & 4096) != 0 ? false : z15, (i16 & 8192) != 0 ? false : z16, (i16 & 16384) != 0 ? false : z17, (i16 & 32768) != 0 ? false : z18, (i16 & 65536) != 0 ? -1 : i15);
    }

    public static b b(b bVar) {
        int i14 = bVar.internalVersion;
        String str = bVar.versionName;
        long j8 = bVar.size;
        String str2 = bVar.appId;
        String str3 = bVar.name;
        boolean z14 = bVar.hasSettings;
        String str4 = bVar.type;
        String str5 = bVar.developerName;
        Boolean bool = bVar.favorite;
        Long l14 = bVar.minFirmwareVersion;
        Long l15 = bVar.maxFirmwareVersion;
        String str6 = bVar.iconUrl;
        boolean z15 = bVar.installed;
        boolean z16 = bVar.disabled;
        boolean z17 = bVar.updateAvailable;
        boolean z18 = bVar.permissionsChanged;
        int i15 = bVar.nativeAppSourceId;
        bVar.getClass();
        str.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        return new b(i14, str, j8, str2, str3, z14, str4, str5, bool, l14, l15, str6, z15, z16, z17, z18, i15);
    }

    public final boolean A() {
        Boolean bool = this.favorite;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final boolean getInstalled() {
        return this.installed;
    }

    public final void D(String str) {
        this.appId = str;
    }

    public final void F(String str) {
        str.getClass();
        this.developerName = str;
    }

    public final void G(boolean z14) {
        this.disabled = z14;
    }

    public final void H(boolean z14) {
        this.favorite = Boolean.valueOf(z14);
    }

    public final void I(boolean z14) {
        this.hasSettings = z14;
    }

    public final void M(String str) {
        this.iconUrl = str;
    }

    public final void Z(boolean z14) {
        this.installed = z14;
    }

    public final void a0(int i14) {
        this.internalVersion = i14;
    }

    public final void c0(String str) {
        str.getClass();
        this.name = str;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e0(int i14) {
        this.nativeAppSourceId = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.internalVersion == bVar.internalVersion && s.g(this.versionName, bVar.versionName) && this.size == bVar.size && s.g(this.appId, bVar.appId) && s.g(this.name, bVar.name) && this.hasSettings == bVar.hasSettings && s.g(this.type, bVar.type) && s.g(this.developerName, bVar.developerName) && s.g(this.favorite, bVar.favorite) && s.g(this.minFirmwareVersion, bVar.minFirmwareVersion) && s.g(this.maxFirmwareVersion, bVar.maxFirmwareVersion) && s.g(this.iconUrl, bVar.iconUrl) && this.installed == bVar.installed && this.disabled == bVar.disabled && this.updateAvailable == bVar.updateAvailable && this.permissionsChanged == bVar.permissionsChanged && this.nativeAppSourceId == bVar.nativeAppSourceId;
    }

    public final String f() {
        String str = this.appId;
        return str == null ? "" : str;
    }

    public final void f0(long j8) {
        this.size = j8;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getDeveloperName() {
        return this.developerName;
    }

    public final void g0(String str) {
        str.getClass();
        this.type = str;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getDisabled() {
        return this.disabled;
    }

    public final void h0(boolean z14) {
        this.updateAvailable = z14;
    }

    public final int hashCode() {
        int iE = f.e(g.j(Integer.hashCode(this.internalVersion) * 31, 31, this.versionName), 31, this.size);
        String str = this.appId;
        int iJ = g.j(g.j(f.g(g.j((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.name), 31, this.hasSettings), 31, this.type), 31, this.developerName);
        Boolean bool = this.favorite;
        int iHashCode = (iJ + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l14 = this.minFirmwareVersion;
        int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.maxFirmwareVersion;
        int iHashCode3 = (iHashCode2 + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str2 = this.iconUrl;
        return Integer.hashCode(this.nativeAppSourceId) + f.g(f.g(f.g(f.g((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.installed), 31, this.disabled), 31, this.updateAvailable), 31, this.permissionsChanged);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getHasSettings() {
        return this.hasSettings;
    }

    public final void i0(String str) {
        str.getClass();
        this.versionName = str;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getInternalVersion() {
        return this.internalVersion;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Long getMinFirmwareVersion() {
        return this.minFirmwareVersion;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final int getNativeAppSourceId() {
        return this.nativeAppSourceId;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getPermissionsChanged() {
        return this.permissionsChanged;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final String toString() {
        int i14 = this.internalVersion;
        String str = this.versionName;
        long j8 = this.size;
        String str2 = this.appId;
        String str3 = this.name;
        boolean z14 = this.hasSettings;
        String str4 = this.type;
        String str5 = this.developerName;
        Boolean bool = this.favorite;
        Long l14 = this.minFirmwareVersion;
        Long l15 = this.maxFirmwareVersion;
        String str6 = this.iconUrl;
        boolean z15 = this.installed;
        boolean z16 = this.disabled;
        boolean z17 = this.updateAvailable;
        boolean z18 = this.permissionsChanged;
        int i15 = this.nativeAppSourceId;
        StringBuilder sbR = g.r(i14, "ConnectIQDownloadedApp(internalVersion=", ", versionName=", str, ", size=");
        p6.b.k(j8, ", appId=", str2, sbR);
        com.airbnb.lottie.animation.keyframe.a.t(", name=", str3, ", hasSettings=", sbR, z14);
        sn.a.t(sbR, ", type=", str4, ", developerName=", str5);
        sbR.append(", favorite=");
        sbR.append(bool);
        sbR.append(", minFirmwareVersion=");
        sbR.append(l14);
        sbR.append(", maxFirmwareVersion=");
        sbR.append(l15);
        sbR.append(", iconUrl=");
        sbR.append(str6);
        com.airbnb.lottie.animation.keyframe.a.v(", installed=", ", disabled=", sbR, z15, z16);
        com.airbnb.lottie.animation.keyframe.a.v(", updateAvailable=", ", permissionsChanged=", sbR, z17, z18);
        return u0.k(sbR, ", nativeAppSourceId=", i15, ")");
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final boolean getUpdateAvailable() {
        return this.updateAvailable;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.internalVersion);
        parcel.writeString(this.versionName);
        parcel.writeLong(this.size);
        parcel.writeString(this.appId);
        parcel.writeString(this.name);
        parcel.writeInt(this.hasSettings ? 1 : 0);
        parcel.writeString(this.type);
        parcel.writeString(this.developerName);
        Boolean bool = this.favorite;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            k.m(parcel, 1, bool);
        }
        Long l14 = this.minFirmwareVersion;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Long l15 = this.maxFirmwareVersion;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeString(this.iconUrl);
        parcel.writeInt(this.installed ? 1 : 0);
        parcel.writeInt(this.disabled ? 1 : 0);
        parcel.writeInt(this.updateAvailable ? 1 : 0);
        parcel.writeInt(this.permissionsChanged ? 1 : 0);
        parcel.writeInt(this.nativeAppSourceId);
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final String getVersionName() {
        return this.versionName;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final Boolean getFavorite() {
        return this.favorite;
    }

    public b(int i14, String str, long j8, String str2, String str3, boolean z14, String str4, String str5, Boolean bool, Long l14, Long l15, String str6, boolean z15, boolean z16, boolean z17, boolean z18, int i15) {
        kg.f.p(str, str3, str4, str5);
        this.internalVersion = i14;
        this.versionName = str;
        this.size = j8;
        this.appId = str2;
        this.name = str3;
        this.hasSettings = z14;
        this.type = str4;
        this.developerName = str5;
        this.favorite = bool;
        this.minFirmwareVersion = l14;
        this.maxFirmwareVersion = l15;
        this.iconUrl = str6;
        this.installed = z15;
        this.disabled = z16;
        this.updateAvailable = z17;
        this.permissionsChanged = z18;
        this.nativeAppSourceId = i15;
    }

    public b() {
        this(0, null, 0L, null, null, false, null, null, null, null, null, null, false, false, false, false, 0, 131071, null);
    }
}
