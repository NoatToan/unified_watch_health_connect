package vm2;

import android.os.RemoteException;
import com.garmin.android.apps.connectmobile.devices.GarminDeviceWakefulService;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.device.datatypes.DeviceProfile;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import o13.p;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import sm2.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lvm2/d;", "Llm2/d;", "", "initialDelayMinutes", "intervalMinutes", "<init>", "(JJ)V", "a", "b", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements lm2.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f178818e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f178819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f178820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f178821c = Executors.newScheduledThreadPool(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap<String, ScheduledFuture<?>> f178822d = new HashMap<>();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lvm2/d$b;", "Ljava/lang/Runnable;", "", "macAddress", "", "unitId", "<init>", "(Lvm2/d;Ljava/lang/String;J)V", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f178823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f178824b;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"vm2/d$b$a", "Lsm2/w$b;", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements w.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f178825a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeviceProfile f178826b;

            public a(d dVar, DeviceProfile deviceProfile) {
                this.f178825a = dVar;
                this.f178826b = deviceProfile;
            }

            @Override // sm2.w.b
            public final void a(long j8, long j14) {
            }

            @Override // sm2.w.b
            public final void b(p<byte[], UUID> pVar, String str) {
                d.f178818e.info("retrieveGarminDeviceXml complete. success:" + (pVar != null));
                if (pVar != null) {
                    this.f178825a.f178821c.schedule(new vg1.d(5, pVar, this.f178826b), 0L, TimeUnit.SECONDS);
                }
            }
        }

        public b(d dVar, String str, long j8) {
            str.getClass();
            this.f178824b = dVar;
            this.f178823a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zV;
            lm2.g gVarC = lm2.h.c();
            lm2.h.d();
            if (!GarminDeviceWakefulService.f33825e) {
                hk0.p pVar = hk0.p.f84079d;
                String str = this.f178823a;
                if (pVar == null || !pVar.n()) {
                    zV = false;
                } else {
                    try {
                        zV = hk0.p.f84079d.f84080a.V(str);
                    } catch (RemoteException e4) {
                        i2.g(e4, "TMP#GFDIService");
                        zV = false;
                    }
                }
                if (!zV) {
                    fm2.c cVar = (fm2.c) gVarC;
                    DeviceProfile deviceProfileH = cVar.h(str);
                    if (deviceProfileH == null || !deviceProfileH.getF92743g() || deviceProfileH.getConnectionType() != 1) {
                        d.f178818e.info("retrieveGarminDeviceXml");
                        cVar.o(str, new a(this.f178824b, deviceProfileH));
                        return;
                    }
                    d.f178818e.debug("Skipping retrieveGarminDeviceXml for BLE link (" + deviceProfileH.getMacAddress() + ") of dual pairing " + deviceProfileH.getF92742f());
                    return;
                }
            }
            d.f178818e.warn("User is pairing a device or sync is in progress. Skipped.");
        }
    }

    static {
        new a(null);
        f178818e = LoggerFactory.getLogger("PAIR#DeviceXMLReadScheduler");
    }

    public d(long j8, long j14) {
        this.f178819a = j8;
        this.f178820b = j14;
    }

    @Override // com.garmin.android.gfdi.AuthRegistry.Callback
    public final void onDeviceAuthenticated(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        str.getClass();
        bArr.getClass();
        bArr2.getClass();
        bArr3.getClass();
    }

    @Override // la2.a
    public final void onDeviceConnected(la2.b bVar) {
        DeviceProfile deviceProfile = bVar.f111632a;
        String macAddress = deviceProfile.getMacAddress();
        macAddress.getClass();
        long f172494b = deviceProfile.getF92746j();
        sk2.c.a aVar = sk2.c.f159932o;
        String f172493a = deviceProfile.getF92741e();
        f172493a.getClass();
        aVar.getClass();
        if (sk2.c.a.a(f172493a)) {
            com.airbnb.lottie.animation.keyframe.a.u("Skip device XML update for Sync 2.0 configured device ", macAddress, ". Changes will be detected/read automatically", f178818e);
            return;
        }
        this.f178822d.put(macAddress, this.f178821c.scheduleAtFixedRate(new b(this, macAddress, f172494b), this.f178819a, this.f178820b, TimeUnit.MINUTES));
    }

    @Override // la2.a
    public final void onDeviceConnectingFailure(la2.c cVar) {
    }

    @Override // la2.a
    public final void onDeviceDisconnected(la2.h hVar) {
        DeviceProfile deviceProfile = hVar.f111673a;
        String macAddress = deviceProfile.getMacAddress();
        HashMap<String, ScheduledFuture<?>> map = this.f178822d;
        ScheduledFuture<?> scheduledFuture = map.get(macAddress);
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        map.remove(deviceProfile.getMacAddress());
    }

    @Override // com.garmin.android.gfdi.AuthRegistry.Callback
    public final void onPasskeyRequired(String str, int i14) {
        str.getClass();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lvm2/d$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "LOGGER", "Lorg/slf4j/Logger;", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
