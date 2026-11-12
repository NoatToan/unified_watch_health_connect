package defpackage;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import com.xiaomi.push.service.XMPushService;

/* JADX INFO: loaded from: classes11.dex */
public class phs implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ XMPushService f30407a;

    public phs(XMPushService xMPushService) {
        this.f30407a = xMPushService;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            PackageManager packageManager = this.f30407a.getApplicationContext().getPackageManager();
            ComponentName componentName = new ComponentName(this.f30407a.getApplicationContext(), "com.xiaomi.push.service.receivers.PingReceiver");
            if (packageManager.getComponentEnabledSetting(componentName) != 2) {
                packageManager.setComponentEnabledSetting(componentName, 2, 1);
            }
        } catch (Throwable th) {
            x9s.o("[Alarm] disable ping receiver may be failure. " + th);
        }
    }
}
