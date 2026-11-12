package defpackage;

import android.os.PowerManager;
import androidx.media3.common.C;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class nfm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f43061a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static nfm f43062c;
    private PowerManager.WakeLock d;

    private nfm() {
        Object systemService = BaseApplication.b().getSystemService("power");
        if (systemService instanceof PowerManager) {
            LogUtil.a("UpdateTimeFreezeUtils", "init WakeLock");
            this.d = ((PowerManager) systemService).newWakeLock(1, "PhoneService_SetDeviceTime");
        }
    }

    public static nfm d() {
        nfm nfmVar;
        synchronized (f43061a) {
            if (f43062c == null) {
                f43062c = new nfm();
            }
            nfmVar = f43062c;
        }
        return nfmVar;
    }

    public void a() {
        PowerManager.WakeLock wakeLock = this.d;
        if (wakeLock != null) {
            wakeLock.acquire(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        }
    }

    public void c() {
        this.d = null;
        b();
    }

    private static void b() {
        synchronized (f43061a) {
            f43062c = null;
        }
    }
}
