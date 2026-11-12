package health.compact.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import defpackage.ddy;
import defpackage.tqp;

/* JADX INFO: loaded from: classes.dex */
public class DeviceConfigInit {
    private static final String TAG = "DeviceConfigInit";
    private static volatile boolean sIsInit = false;
    private static BroadcastReceiver sWalletRequestBroadcast;

    private DeviceConfigInit() {
    }

    public static void create() {
        synchronized (DeviceConfigInit.class) {
            if (sIsInit) {
                com.huawei.hwlogsmodel.LogUtil.a(TAG, "has init or not authorize");
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            registerBroadcast();
            ddy.e().initBaseConfig(BaseApplication.getContext());
            sIsInit = true;
            health.compact.a.hwlogsmodel.ReleaseLogUtil.d(TAG, "DeviceConfig init finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
        }
    }

    public static void destroy() {
        unRegisterBroadcast();
        sIsInit = false;
    }

    private static void registerBroadcast() {
        com.huawei.hwlogsmodel.LogUtil.a(TAG, "register WalletRequestBroadcast");
        if (sWalletRequestBroadcast == null) {
            sWalletRequestBroadcast = new BroadcastReceiver() { // from class: health.compact.a.DeviceConfigInit.1
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    com.huawei.hwlogsmodel.LogUtil.a(DeviceConfigInit.TAG, "mWalletRequestBroadcast onReceive");
                    if (intent == null || intent.getAction() == null) {
                        return;
                    }
                    com.huawei.hwlogsmodel.LogUtil.a(DeviceConfigInit.TAG, "init adapter");
                    tqp.b(BaseApplication.getContext());
                    ddy.e().initHealthPayAdapter(BaseApplication.getContext());
                }
            };
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.health.action.invoke_health");
        LocalBroadcastManager.getInstance().registerReceiver(sWalletRequestBroadcast, intentFilter);
    }

    private static void unRegisterBroadcast() {
        com.huawei.hwlogsmodel.LogUtil.a(TAG, "unregister WalletRequestBroadcast");
        if (sWalletRequestBroadcast != null) {
            LocalBroadcastManager.getInstance().unregisterReceiver(sWalletRequestBroadcast);
            sWalletRequestBroadcast = null;
        }
    }
}
