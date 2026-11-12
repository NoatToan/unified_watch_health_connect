package defpackage;

import android.os.Looper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.manager.powerkit.PowerKitManager;
import health.compact.a.EnvironmentInfo;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class def {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31702b;
    private long d = 0;

    public def(int i) {
        StringBuilder sb = new StringBuilder("user-sport-");
        if (i == 258) {
            sb.append("run");
        } else if (i == 259) {
            sb.append("bike");
        } else if (i == 264) {
            sb.append("treadmill");
        } else {
            sb.append("other");
        }
        this.f31702b = sb.toString();
    }

    public void a() {
        if (EnvironmentInfo.l() && System.currentTimeMillis() - this.d >= 540000) {
            this.d = System.currentTimeMillis();
            ReleaseLogUtil.d("Track_SportPowerKitHelper", "apply power kit now");
            if (Looper.getMainLooper() == Looper.myLooper()) {
                ThreadPoolManager.c().b("Track_SportPowerKitHelper", new Runnable() { // from class: dee
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f31701c.b();
                    }
                });
            } else {
                PowerKitManager.a().a("sport-module", 65535, this.f31702b);
                PowerKitManager.a().d("sport-module", 65535, 600000L, this.f31702b);
            }
        }
    }

    /* synthetic */ void b() {
        PowerKitManager.a().a("sport-module", 65535, this.f31702b);
        PowerKitManager.a().d("sport-module", 65535, 600000L, this.f31702b);
    }

    public void c() {
        if (EnvironmentInfo.l()) {
            ReleaseLogUtil.d("Track_SportPowerKitHelper", "unapply power kit now");
            this.d = 0L;
            if (Looper.getMainLooper() == Looper.myLooper()) {
                ThreadPoolManager.c().b("Track_SportPowerKitHelper", new Runnable() { // from class: deh
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f31705b.e();
                    }
                });
            } else {
                PowerKitManager.a().a("sport-module", 65535, this.f31702b);
            }
        }
    }

    /* synthetic */ void e() {
        PowerKitManager.a().a("sport-module", 65535, this.f31702b);
    }
}
