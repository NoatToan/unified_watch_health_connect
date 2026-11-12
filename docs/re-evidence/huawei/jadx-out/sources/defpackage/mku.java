package defpackage;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.ScreenUtil;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.PhoneService;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class mku {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static mku f41832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f41833c = new Object();
    private long e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f41834a = new Handler(Looper.getMainLooper()) { // from class: mku.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 100) {
                return;
            }
            mku.this.c();
        }
    };

    public static mku d() {
        mku mkuVar;
        synchronized (f41833c) {
            if (f41832b == null) {
                LogUtil.a("DEVMGR_KillPhoneServiceManager", "KillPhoneServiceManager init");
                f41832b = new mku();
            }
            mkuVar = f41832b;
        }
        return mkuVar;
    }

    public void c() {
        ReleaseLogUtil.d("DEVMGR_KillPhoneServiceManager", "Try to kill health enter");
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "killProcessesWhenNoDevices");
        if (deviceList == null) {
            ReleaseLogUtil.a("DEVMGR_KillPhoneServiceManager", "allDeviceInfoList is null");
            g();
        } else if (!deviceList.isEmpty()) {
            h();
        } else if (!e() && !ScreenUtil.d()) {
            b();
        } else {
            g();
        }
    }

    private void b() {
        ReleaseLogUtil.d("DEVMGR_KillPhoneServiceManager", "Kill phoneService process");
        Intent intent = new Intent(BaseApplication.b(), (Class<?>) PhoneService.class);
        intent.setPackage(BaseApplication.d());
        try {
            BaseApplication.b().stopService(intent);
        } catch (Exception e) {
            ReleaseLogUtil.d("DEVMGR_KillPhoneServiceManager", "killPhoneService deadSystemException: ", ExceptionUtils.c(e));
            lng.c("MultiDeviceMessage", "killPhoneService deadSystemException: " + ExceptionUtils.c(e));
        }
    }

    public static void a() {
        synchronized (f41833c) {
            mku mkuVar = f41832b;
            if (mkuVar != null) {
                mkuVar.e = System.currentTimeMillis();
            }
        }
    }

    private boolean e() {
        return System.currentTimeMillis() - this.e < 120000;
    }

    private void g() {
        ReleaseLogUtil.d("DEVMGR_KillPhoneServiceManager", "Try to kill health after 10 seconds");
        ThreadPoolManager.c().execute(new Runnable() { // from class: mku.1
            @Override // java.lang.Runnable
            public void run() {
                mku.this.f41834a.removeMessages(100);
                mku.this.f41834a.sendEmptyMessageDelayed(100, 10000L);
            }
        });
    }

    private void h() {
        ReleaseLogUtil.d("DEVMGR_KillPhoneServiceManager", "KillPhoneServiceManager onDestroy");
        synchronized (f41833c) {
            this.f41834a.removeMessages(100);
            this.f41834a = null;
            f41832b = null;
        }
    }
}
