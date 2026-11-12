package kc2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\rR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018¨\u0006!"}, d2 = {"Lkc2/a;", "Landroid/os/Parcelable;", "", "androidDeviceGuid", "Lkc2/h;", "applicationInfo", "Lkc2/d;", "mobileDeviceInfo", "operatingSystemInfo", "<init>", "(Ljava/lang/String;Lkc2/h;Lkc2/d;Lkc2/h;)V", "appName", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "setAndroidDeviceGuid", "(Ljava/lang/String;)V", "Lkc2/h;", "d", "()Lkc2/h;", "setApplicationInfo", "(Lkc2/h;)V", "c", "Lkc2/d;", "getMobileDeviceInfo", "()Lkc2/d;", "setMobileDeviceInfo", "(Lkc2/d;)V", "g", "setOperatingSystemInfo", "analytics-omt_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1992a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("DeviceGuid")
    private String androidDeviceGuid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ApplicationInfo")
    private h applicationInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("MobileDeviceInfo")
    private d mobileDeviceInfo;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("OperatingSystemInfo")
    private h operatingSystemInfo;

    /* JADX INFO: renamed from: kc2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C1992a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            Parcelable.Creator<h> creator = h.CREATOR;
            return new a(string, creator.createFromParcel(parcel), d.CREATOR.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(String str, h hVar, d dVar, h hVar2, int i14, j jVar) {
        dVar = (i14 & 4) != 0 ? new d(null, null, 3, null) : dVar;
        if ((i14 & 8) != 0) {
            jc2.e.f98177a.getClass();
            hVar2 = new h((String) jc2.e.f98178b.getValue(), jc2.e.a());
        }
        this(str, hVar, dVar, hVar2);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAndroidDeviceGuid() {
        return this.androidDeviceGuid;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final h getApplicationInfo() {
        return this.applicationInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.androidDeviceGuid, aVar.androidDeviceGuid) && s.g(this.applicationInfo, aVar.applicationInfo) && s.g(this.mobileDeviceInfo, aVar.mobileDeviceInfo) && s.g(this.operatingSystemInfo, aVar.operatingSystemInfo);
    }

    public final String f() {
        return this.applicationInfo.getName();
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final h getOperatingSystemInfo() {
        return this.operatingSystemInfo;
    }

    public final int hashCode() {
        return this.operatingSystemInfo.hashCode() + ((this.mobileDeviceInfo.hashCode() + ((this.applicationInfo.hashCode() + (this.androidDeviceGuid.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClientInfo(androidDeviceGuid=" + this.androidDeviceGuid + ", applicationInfo=" + this.applicationInfo + ", mobileDeviceInfo=" + this.mobileDeviceInfo + ", operatingSystemInfo=" + this.operatingSystemInfo + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.androidDeviceGuid);
        this.applicationInfo.writeToParcel(parcel, i14);
        this.mobileDeviceInfo.writeToParcel(parcel, i14);
        this.operatingSystemInfo.writeToParcel(parcel, i14);
    }

    public a(String str, h hVar, d dVar, h hVar2) {
        str.getClass();
        hVar.getClass();
        dVar.getClass();
        hVar2.getClass();
        this.androidDeviceGuid = str;
        this.applicationInfo = hVar;
        this.mobileDeviceInfo = dVar;
        this.operatingSystemInfo = hVar2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String str, String str2, String str3) {
        this(str, new h(str2, str3), null, null, 12, null);
        str.getClass();
        str2.getClass();
        str3.getClass();
    }
}
