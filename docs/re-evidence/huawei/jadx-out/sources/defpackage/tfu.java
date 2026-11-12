package defpackage;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.main.stories.guide.interactors.GuideInteractors;
import health.compact.a.LocalBroadcast;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes18.dex */
public class tfu {
    private static Handler e = new Handler(Looper.getMainLooper()) { // from class: tfu.4
        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    };

    public static void a(final String str) {
        final GuideInteractors guideInteractors = new GuideInteractors(BaseApplication.getContext());
        if (guideInteractors.b()) {
            LogUtil.b("DeviceBindingPostProcessor", "send Broadcast ACTION_BIND_DEVICE_SUCCESS");
            e.postDelayed(new Runnable() { // from class: tfu.1
                @Override // java.lang.Runnable
                public void run() {
                    DeviceInfo deviceInfoA = tfn.a().a(str);
                    if (deviceInfoA == null) {
                        ReleaseLogUtil.c("DeviceBindingPostProcessor", "send broadcast: deviceInfo == null");
                        return;
                    }
                    ReleaseLogUtil.c("DeviceBindingPostProcessor", "send broadcast: BIND_DEVICE_SUCCESS");
                    Intent intent = new Intent("com.huawei.health.action.BIND_DEVICE_SUCCESS");
                    intent.putExtra("deviceinfo", deviceInfoA);
                    BaseApplication.getContext().sendBroadcast(intent, LocalBroadcast.f36595c);
                    guideInteractors.e(false);
                }
            }, 2000L);
        }
    }
}
