package r80;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import d53.w;
import fb1.c;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg.f;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.x;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0010B_\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0011R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0014\u0010\u001fR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lr80/b;", "Landroid/os/Parcelable;", "", "applicationKey", "productDisplayName", "imageUrl", "versionString", "versionMajor", "_versionMinor", "", "released", "", "Lr80/a;", "capabilities", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "a", "Ljava/lang/String;", "getApplicationKey", "()Ljava/lang/String;", "b", "getProductDisplayName", "c", "getImageUrl", "d", "getVersionString", JWKParameterNames.RSA_EXPONENT, "getVersionMajor", "f", "g", "Z", "()Z", "h", "Ljava/util/List;", "getCapabilities", "()Ljava/util/List;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("applicationKey")
    private final String applicationKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("productDisplayName")
    private final String productDisplayName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("imageUrl")
    private final String imageUrl;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("versionString")
    private final String versionString;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("versionMajor")
    private final String versionMajor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("versionMinor")
    private final String _versionMinor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("released")
    private final boolean released;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("capabilities")
    private final List<r80.a> capabilities;

    /* JADX INFO: renamed from: r80.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2843b implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            boolean z14 = false;
            int iA = 0;
            if (parcel.readInt() != 0) {
                z14 = true;
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                while (iA != i14) {
                    iA = f.a(r80.a.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new b(string, string2, string3, string4, string5, string6, z14, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new C2843b();
    }

    public /* synthetic */ b(String str, String str2, String str3, String str4, String str5, String str6, boolean z14, List list, int i14, j jVar) {
        this(str, str2, str3, str4, str5, str6, (i14 & 64) != 0 ? false : z14, (i14 & 128) != 0 ? null : list);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getReleased() {
        return this.released;
    }

    public final String d() {
        String strN;
        String str = this.versionMajor;
        String str2 = this._versionMinor;
        if (str2 == null || str2.length() == 0) {
            strN = "00";
        } else {
            int length = this._versionMinor.length();
            strN = this._versionMinor;
            if (length == 1) {
                strN = c.n("0", strN);
            }
        }
        return e5.g(str, ".", strN);
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
        return s.g(this.applicationKey, bVar.applicationKey) && s.g(this.productDisplayName, bVar.productDisplayName) && s.g(this.imageUrl, bVar.imageUrl) && s.g(this.versionString, bVar.versionString) && s.g(this.versionMajor, bVar.versionMajor) && s.g(this._versionMinor, bVar._versionMinor) && this.released == bVar.released && s.g(this.capabilities, bVar.capabilities);
    }

    public final boolean f() {
        String str = this.applicationKey;
        return (str == null || w.z(str, PrivacyUpdateRequestError.UNKNOWN, false) || w.z(this.applicationKey, "garminMobile", false) || x.k("https://connect.garmin.com/", "https://connect.garmin.cn/", "https://connectapi.garmin.com/", "https://connectapi.garmin.cn").contains(this.applicationKey)) ? false : true;
    }

    public final boolean g() {
        List<r80.a> list = this.capabilities;
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (s.g(((r80.a) it.next()).getName(), "DESCRIPTIVE_TRAINING_EFFECT_CAPABLE")) {
                return true;
            }
        }
        return false;
    }

    public final String getApplicationKey() {
        return this.applicationKey;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getProductDisplayName() {
        return this.productDisplayName;
    }

    public final int hashCode() {
        String str = this.applicationKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.productDisplayName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.versionString;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.versionMajor;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this._versionMinor;
        int iG = q6.f.g((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.released);
        List<r80.a> list = this.capabilities;
        return iG + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str = this.applicationKey;
        String str2 = this.productDisplayName;
        String str3 = this.imageUrl;
        String str4 = this.versionString;
        String str5 = this.versionMajor;
        String str6 = this._versionMinor;
        boolean z14 = this.released;
        List<r80.a> list = this.capabilities;
        StringBuilder sbI = p6.b.i("DeviceApplicationInfoDTO(applicationKey=", str, ", productDisplayName=", str2, ", imageUrl=");
        sn.a.t(sbI, str3, ", versionString=", str4, ", versionMajor=");
        sn.a.t(sbI, str5, ", _versionMinor=", str6, ", released=");
        sbI.append(z14);
        sbI.append(", capabilities=");
        sbI.append(list);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.applicationKey);
        parcel.writeString(this.productDisplayName);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.versionString);
        parcel.writeString(this.versionMajor);
        parcel.writeString(this._versionMinor);
        parcel.writeInt(this.released ? 1 : 0);
        List<r80.a> list = this.capabilities;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            ((r80.a) itO.next()).writeToParcel(parcel, i14);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lr80/b$a;", "", "<init>", "()V", "", "UNKNOWN_APP_KEY", "Ljava/lang/String;", "GARMIN_MOBILE_KEY", "HTTPS_CONNECT_GARMIN_COM_KEY", "HTTPS_CONNECT_GARMIN_CN_KEY", "HTTPS_CONNECTAPI_GARMIN_COM_KEY", "HTTPS_CONNECTAPI_GARMIN_CN_KEY", "DESCRIPTIVE_TRAINING_EFFECT_CAPABLE", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public b(String str, String str2, String str3, String str4, String str5, String str6, boolean z14, List<r80.a> list) {
        this.applicationKey = str;
        this.productDisplayName = str2;
        this.imageUrl = str3;
        this.versionString = str4;
        this.versionMajor = str5;
        this._versionMinor = str6;
        this.released = z14;
        this.capabilities = list;
    }
}
