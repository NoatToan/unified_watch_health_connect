package defpackage;

import android.location.Location;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.amap.api.location.AMapLocation;
import com.huawei.health.manager.powerkit.PowerKitManager;
import com.huawei.hwlocationmgr.model.ILoactionCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginhealthzone.interactors.LocationMgrCallback;
import health.compact.a.EnvironmentInfo;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes42.dex */
public class pgg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f45318a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile pgg f45319c;
    private LocationMgrCallback d;
    private HandlerThread e;
    private e h;
    private long j = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f45320b = false;

    private pgg() {
        if (this.e == null) {
            HandlerThread handlerThread = new HandlerThread("LocationMgr");
            this.e = handlerThread;
            handlerThread.start();
        }
        if (this.h == null) {
            this.h = new e(this.e.getLooper());
        }
    }

    public static pgg d() {
        pgg pggVar;
        if (f45319c == null) {
            synchronized (f45318a) {
                if (f45319c == null) {
                    f45319c = new pgg();
                }
                pggVar = f45319c;
            }
            return pggVar;
        }
        return f45319c;
    }

    public void b(LocationMgrCallback locationMgrCallback) {
        if (locationMgrCallback == null) {
            LogUtil.j("LocationMgr", "location call back is null.");
            return;
        }
        LogUtil.a("LocationMgr", "getLocation enter.");
        this.d = locationMgrCallback;
        if (!this.f45320b) {
            LogUtil.a("LocationMgr", "request location listener.");
            npg.d().a(new ILoactionCallback() { // from class: pgh
                @Override // com.huawei.hwlocationmgr.model.ILoactionCallback
                public final void dispatchLocationChanged(Location location) {
                    this.f45322c.b(location);
                }
            }, "healthZoneTrackLocation");
            this.f45320b = true;
        }
        b();
        this.h.removeMessages(1);
        this.h.sendEmptyMessageDelayed(1, 60000L);
    }

    /* synthetic */ void b(Location location) {
        pgp pgpVar = new pgp();
        pgpVar.b(Double.valueOf(location.getAltitude()));
        pgpVar.c(Double.valueOf(location.getLatitude()));
        pgpVar.e(Double.valueOf(location.getLongitude()));
        pgpVar.b(AMapLocation.COORD_TYPE_WGS84);
        LogUtil.d("LocationMgr", "new location dispatch provider=", location.getProvider(), " altitude=", Double.valueOf(location.getAltitude()), " latitude=", Double.valueOf(location.getLatitude()), " longitude=", Double.valueOf(location.getLongitude()));
        this.d.onLocationChanged(pgpVar);
    }

    public void a() {
        npg.d().c("healthZoneTrackLocation");
        c();
        this.e.quitSafely();
        this.f45320b = false;
        synchronized (f45318a) {
            f45319c = null;
        }
    }

    class e extends Handler {
        e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                LogUtil.j("LocationMgr", "request location timeout.");
                pgg.this.a();
            }
        }
    }

    public void b() {
        if (EnvironmentInfo.l() && System.currentTimeMillis() - this.j >= 270000) {
            this.j = System.currentTimeMillis();
            ReleaseLogUtil.d("LocationMgr", "apply power kit now");
            PowerKitManager.a().a("FAMILY_SPACE", 65535, "user-healthZone-location");
            PowerKitManager.a().d("FAMILY_SPACE", 65535, 300000L, "user-healthZone-location");
        }
    }

    public void c() {
        if (EnvironmentInfo.l()) {
            ReleaseLogUtil.d("LocationMgr", "unapply power kit now");
            this.j = 0L;
            PowerKitManager.a().a("FAMILY_SPACE", 65535, "user-healthZone-location");
        }
    }
}
