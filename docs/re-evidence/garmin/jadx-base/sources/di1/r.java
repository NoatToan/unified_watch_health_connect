package di1;

import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.WifiSetup;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0002\u0010\u0006¨\u0006\b"}, d2 = {"Ldi1/r;", "", "<init>", "()V", "Lcom/garmin/proto/generated/WifiSetup$WifiSetupDevice;", "wsd", "(Lcom/garmin/proto/generated/WifiSetup$WifiSetupDevice;)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<com.garmin.android.apps.connectmobile.settings.devices.wifi.k> f59773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<com.garmin.android.apps.connectmobile.settings.devices.wifi.k> f59774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<com.garmin.android.apps.connectmobile.settings.devices.wifi.k> f59775c;

    static {
        new a(null);
    }

    public r(WifiSetup.WifiSetupDevice wifiSetupDevice) {
        ArrayList<com.garmin.android.apps.connectmobile.settings.devices.wifi.k> arrayList = new ArrayList<>();
        this.f59773a = arrayList;
        ArrayList<com.garmin.android.apps.connectmobile.settings.devices.wifi.k> arrayList2 = new ArrayList<>();
        this.f59774b = arrayList2;
        this.f59775c = new ArrayList<>();
        arrayList.clear();
        arrayList2.clear();
        if (wifiSetupDevice != null) {
            for (WifiSetup.StoredAccessPoint storedAccessPoint : wifiSetupDevice.getStoredApsList()) {
                if (TextUtils.isEmpty(storedAccessPoint.getSsid())) {
                    i2.a aVar = i2.f36769a;
                    aVar.getClass();
                    i2.a.b(a2.SETTINGS, "WiFiNetworkListDTO", "Empty SSID StoredAccessPoint! [" + wifiSetupDevice + "]");
                } else {
                    com.garmin.android.apps.connectmobile.settings.devices.wifi.k kVar = new com.garmin.android.apps.connectmobile.settings.devices.wifi.k(storedAccessPoint);
                    this.f59773a.add(kVar);
                    this.f59774b.add(kVar);
                }
            }
            for (WifiSetup.ScannedAccessPoint scannedAccessPoint : wifiSetupDevice.getScannedApsList()) {
                if (TextUtils.isEmpty(scannedAccessPoint.getSsid())) {
                    i2.a aVar2 = i2.f36769a;
                    aVar2.getClass();
                    i2.a.b(a2.SETTINGS, "WiFiNetworkListDTO", "Empty SSID ScannedAccessPoint! [" + wifiSetupDevice + "]");
                } else {
                    com.garmin.android.apps.connectmobile.settings.devices.wifi.k kVar2 = new com.garmin.android.apps.connectmobile.settings.devices.wifi.k(scannedAccessPoint);
                    if (!this.f59773a.contains(kVar2)) {
                        this.f59773a.add(kVar2);
                    }
                    if (!this.f59775c.contains(kVar2) && !this.f59774b.contains(kVar2)) {
                        this.f59775c.add(kVar2);
                    }
                }
            }
        }
    }

    public final String toString() {
        String string = this.f59773a.toString();
        string.getClass();
        return string;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ldi1/r$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public r() {
        ArrayList<com.garmin.android.apps.connectmobile.settings.devices.wifi.k> arrayList = new ArrayList<>();
        this.f59773a = arrayList;
        ArrayList<com.garmin.android.apps.connectmobile.settings.devices.wifi.k> arrayList2 = new ArrayList<>();
        this.f59774b = arrayList2;
        this.f59775c = new ArrayList<>();
        arrayList.clear();
        arrayList2.clear();
    }
}
