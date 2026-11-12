package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.huawei.haf.bundle.AppBundle;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.deviceconnect.callback.PingCallback;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwWorkoutServiceUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IBaseCallback;
import health.compact.a.LogAnonymous;

/* JADX INFO: loaded from: classes10.dex */
public class lyy {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static lyy f41169c;
    private static final Object e = new Object();

    public static lyy b() {
        lyy lyyVar;
        LogUtil.a("HwAppMarketApi", "getInstance()");
        synchronized (e) {
            if (f41169c == null) {
                f41169c = new lyy();
            }
            lyyVar = f41169c;
        }
        return lyyVar;
    }

    private lyy() {
    }

    public void h() {
        lze.c().b();
    }

    public void e(String str) {
        lze.c().d(str);
    }

    public void d(int i, Object obj) {
        if (b(mgg.c("HwAppMarketApi"))) {
            LogUtil.a("HwAppMarketApi", "setAppMarketParameter smart");
        } else {
            lze.c().a(i, obj);
        }
    }

    public void a(DeviceCapability deviceCapability, IBaseResponseCallback iBaseResponseCallback) {
        lze.c().c(deviceCapability, iBaseResponseCallback);
    }

    public boolean b(DeviceInfo deviceInfo) {
        return eey.d(deviceInfo, 44) || eey.d(deviceInfo, HwWorkoutServiceUtils.HEART_RATE_TRUST_VALUE);
    }

    public void g() {
        lze.c().d();
    }

    public void e(IBaseResponseCallback iBaseResponseCallback) {
        pbq.c().sendCommand(1, iBaseResponseCallback);
    }

    public void e(final IBaseCallback iBaseCallback) {
        LogUtil.a("HwAppMarketApi", "setCancelTransferCallback callback : ", iBaseCallback);
        pbq.c().sendCommand(2, iBaseCallback != null ? new IBaseResponseCallback() { // from class: lyy.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                IBaseCallback iBaseCallback2 = iBaseCallback;
                if (iBaseCallback2 == null || !(obj instanceof String)) {
                    return;
                }
                try {
                    iBaseCallback2.onResponse(i, String.valueOf(obj));
                } catch (RemoteException e2) {
                    LogUtil.e("HwAppMarketApi", "RemoteException : ", LogAnonymous.b(e2));
                }
            }
        } : null);
    }

    public void b(final PingCallback pingCallback) {
        LogUtil.a("HwAppMarketApi", "pingDevice");
        pbq.c().sendCommand(3, new IBaseResponseCallback() { // from class: lyy.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                PingCallback pingCallback2 = pingCallback;
                if (pingCallback2 != null) {
                    pingCallback2.onPingResult(i);
                }
            }
        });
    }

    public boolean j() {
        return lzf.d();
    }

    public String c() {
        return lzf.b();
    }

    public int c(Context context) {
        return lzf.a().c(BaseApplication.getContext());
    }

    public void f() {
        pbq.c().initAppMarketAdapter();
    }

    public void d() {
        ThreadPoolManager.c().a("HwAppMarketApi", new Runnable() { // from class: lzd
            @Override // java.lang.Runnable
            public final void run() {
                pbq.c().hasNewVersion();
            }
        });
    }

    public void d(int i) {
        pbq.c().launchAppGallery(i);
    }

    public void d(Context context, AppBundleLauncher.InstallCallback installCallback) {
        Intent intent = new Intent();
        intent.putExtra("moduleName", "PluginWearAbility");
        AppBundle.d().launchActivity(context, intent, installCallback);
    }

    public boolean c(String str) {
        return lze.c().e(str);
    }

    public void a(String str, boolean z) {
        lze.c().c(str, z);
    }

    public void e() {
        lze.c().a();
    }
}
