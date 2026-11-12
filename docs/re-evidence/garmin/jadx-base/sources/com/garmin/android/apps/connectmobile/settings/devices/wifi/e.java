package com.garmin.android.apps.connectmobile.settings.devices.wifi;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.proto.generated.WifiSetup;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B%\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0002\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0002\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/e;", "Landroid/os/Parcelable;", "<init>", "()V", "", "ssid", "Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/k$c;", "securityType", "", "statusType", "(Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/k$c;I)V", "Lcom/garmin/proto/generated/WifiSetup$StoredAccessPoint;", "stored", "(Lcom/garmin/proto/generated/WifiSetup$StoredAccessPoint;)V", "b", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f43291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f43292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f43293f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f43294g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k.c f43296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43297c;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/settings/devices/wifi/e$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/e;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            k.c.a aVar = k.c.f43331b;
            int i14 = parcel.readInt();
            aVar.getClass();
            k.c cVar = k.c.f43332c.get(i14);
            cVar.getClass();
            return new e(string, cVar, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    static {
        new b(null);
        f43291d = WifiSetup.StatusType.Unknown.getNumber();
        f43292e = WifiSetup.StatusType.ConnectionSuccess.getNumber();
        f43293f = WifiSetup.StatusType.InvalidCredentials.getNumber();
        f43294g = WifiSetup.StatusType.NotFound.getNumber();
        CREATOR = new a();
    }

    public e(WifiSetup.StoredAccessPoint storedAccessPoint) {
        storedAccessPoint.getClass();
        int i14 = f43291d;
        this.f43297c = i14;
        this.f43295a = storedAccessPoint.getSsid();
        WifiSetup.SecurityType securityType = storedAccessPoint.getSecurityType();
        securityType.getClass();
        k.f43319i.getClass();
        this.f43296b = k.b.a(securityType);
        WifiSetup.StatusType statusType = storedAccessPoint.getStatusType();
        if (statusType == null) {
            d(i14);
            return;
        }
        try {
            d(statusType.getNumber());
        } catch (Exception unused) {
            d(i14);
        }
    }

    public final boolean b() {
        return this.f43297c == f43292e;
    }

    public final void d(int i14) {
        int i15 = f43291d;
        if (i14 != i15 && i14 != f43292e && i14 != f43293f && i14 != f43294g) {
            i14 = i15;
        }
        this.f43297c = i14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        int i14 = this.f43297c;
        if (i14 == f43291d) {
            str = "STATUS_UNKNOWN";
        } else if (i14 == f43292e) {
            str = "STATUS_CONNECTION_SUCCESSFUL";
        } else if (i14 == f43293f) {
            str = "STATUS_FAILED_INVALID_CREDENTIALS";
        } else {
            str = i14 == f43294g ? "STATUS_FAILED_WIFI_NETWORK_NOT_FOUND" : null;
        }
        return this.f43295a + "/" + this.f43296b + "/" + str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f43295a);
        k.c cVar = this.f43296b;
        cVar.getClass();
        parcel.writeInt(cVar.f43340a);
        parcel.writeInt(this.f43297c);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/e$b;", "", "<init>", "()V", "", "STATUS_UNKNOWN", "I", "STATUS_NOTHING_TO_VERIFY", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/e;", "CREATOR", "Landroid/os/Parcelable$Creator;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public e(String str, k.c cVar, int i14) {
        this.f43297c = f43291d;
        this.f43295a = str;
        this.f43296b = cVar;
        d(i14);
    }

    public e() {
        this.f43297c = f43291d;
        d(-1);
    }
}
