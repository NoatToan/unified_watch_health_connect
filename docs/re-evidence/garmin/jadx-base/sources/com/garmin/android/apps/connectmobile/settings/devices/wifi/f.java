package com.garmin.android.apps.connectmobile.settings.devices.wifi;

import com.garmin.proto.generated.WifiSetup;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/f;", "", "<init>", "()V", "b", "a", "Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/f$a;", "Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/f$b;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class f {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/f$a;", "Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/f;", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f43298a = new a();

        private a() {
            super(null);
        }

        @Override // com.garmin.android.apps.connectmobile.settings.devices.wifi.f
        /* JADX INFO: renamed from: a */
        public final long getF43301c() {
            return 0L;
        }

        @Override // com.garmin.android.apps.connectmobile.settings.devices.wifi.f
        /* JADX INFO: renamed from: b */
        public final long getF43300b() {
            return 0L;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/f$b;", "Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/f;", "Lcom/garmin/proto/generated/WifiSetup$ScannedAccessPoint;", "network", "<init>", "(Lcom/garmin/proto/generated/WifiSetup$ScannedAccessPoint;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WifiSetup.ScannedAccessPoint f43299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f43300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f43301c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(WifiSetup.ScannedAccessPoint scannedAccessPoint) {
            super(null);
            scannedAccessPoint.getClass();
            this.f43299a = scannedAccessPoint;
            long jHashCode = scannedAccessPoint.getSsid().hashCode();
            this.f43300b = jHashCode;
            this.f43301c = jHashCode;
        }

        @Override // com.garmin.android.apps.connectmobile.settings.devices.wifi.f
        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getF43301c() {
            return this.f43301c;
        }

        @Override // com.garmin.android.apps.connectmobile.settings.devices.wifi.f
        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getF43300b() {
            return this.f43300b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && s.g(this.f43299a, ((b) obj).f43299a);
        }

        public final int hashCode() {
            return this.f43299a.hashCode();
        }

        public final String toString() {
            return "NetworkItem(network=" + this.f43299a + ")";
        }
    }

    public /* synthetic */ f(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract long getF43301c();

    /* JADX INFO: renamed from: b */
    public abstract long getF43300b();

    private f() {
    }
}
