package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.media3.extractor.ts.TsExtractor;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.btproxy.callback.BtProxySleepCallback;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.util.LogUtil;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class mlu {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static mlu f41894b;
    private static final Object d = new Object();
    private Map<String, Integer> g = new HashMap(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BtProxySleepCallback f41896c = null;
    private String e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BroadcastReceiver f41895a = new BroadcastReceiver() { // from class: mlu.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            LogUtil.a("BtProxySleepStatusManager", "mDeviceStatusReceiver action: ", action);
            if (action == null) {
                return;
            }
            if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(action)) {
                mlu.this.c(intent);
            } else {
                LogUtil.d("BtProxySleepStatusManager", "mDeviceStatusReceiver other action");
            }
        }
    };

    private mlu() {
        BroadcastManagerUtil.c(BaseApplication.getContext(), this.f41895a, new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED"), LocalBroadcast.f36595c, null);
    }

    public void c(String str, BtProxySleepCallback btProxySleepCallback) {
        if (btProxySleepCallback == null) {
            LogUtil.d("BtProxySleepStatusManager", "registerSleepStatusListen btProxySleepCallback is null.");
            return;
        }
        LogUtil.a("BtProxySleepStatusManager", "registerSleepStatusListen deviceInfoIdentify: ", cpl.e(str));
        this.e = str;
        this.f41896c = btProxySleepCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Intent intent) {
        DeviceInfo deviceInfo = intent.getParcelableExtra("deviceinfo") instanceof DeviceInfo ? (DeviceInfo) intent.getParcelableExtra("deviceinfo") : null;
        if (deviceInfo == null) {
            LogUtil.d("BtProxySleepStatusManager", "deviceInfo is null");
        } else {
            LogUtil.a("BtProxySleepStatusManager", "dealConnectStatusChange deviceInfoIdentify: ", cpl.e(deviceInfo.getDeviceIdentify()));
            e(deviceInfo.getDeviceIdentify(), 0);
        }
    }

    public static mlu d() {
        mlu mluVar;
        synchronized (d) {
            if (f41894b == null) {
                LogUtil.a("BtProxySleepStatusManager", "BtProxySleepStatusManager init.");
                f41894b = new mlu();
            }
            mluVar = f41894b;
        }
        return mluVar;
    }

    public int d(String str) {
        LogUtil.a("BtProxySleepStatusManager", "getDeviceSleepStatus deviceIdentify is ", cpl.e(str));
        if (TextUtils.isEmpty(str)) {
            LogUtil.d("BtProxySleepStatusManager", "getDeviceSleepStatus deviceMac is null.");
            return 0;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        int i = calendar.get(11);
        LogUtil.a("BtProxySleepStatusManager", "current:", Long.valueOf(jCurrentTimeMillis), " hour: ", Integer.valueOf(i), " minutes: ", Integer.valueOf(calendar.get(12)));
        if (CommonUtil.q(BaseApplication.getContext()) || i >= 9) {
            LogUtil.a("BtProxySleepStatusManager", "getDeviceSleepStatus operating hours.");
            return 0;
        }
        int iA = a(str);
        LogUtil.a("BtProxySleepStatusManager", "getDeviceSleepStatus sleepStatus: ", Integer.valueOf(iA));
        return iA;
    }

    public int e(String str) {
        LogUtil.a("BtProxySleepStatusManager", "getDeviceSleepStatus deviceIdentify is ", cpl.e(str));
        if (TextUtils.isEmpty(str)) {
            LogUtil.d("BtProxySleepStatusManager", "getDeviceSleepStatus deviceMac is null.");
            return 0;
        }
        int iA = a(str);
        LogUtil.a("BtProxySleepStatusManager", "getDeviceSleepStatus sleepStatus: ", Integer.valueOf(iA));
        return iA;
    }

    public void c(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.d("BtProxySleepStatusManager", "dealDeviceSleepAction deviceMac is empty.");
            return;
        }
        LogUtil.a("BtProxySleepStatusManager", "dealDeviceSleepAction action: ", Integer.valueOf(i));
        if (i != 4) {
            if (i == 16) {
                e(str, 1);
                return;
            } else {
                LogUtil.d("BtProxySleepStatusManager", "dealDeviceSleepAction else action.");
                return;
            }
        }
        e(str, 0);
        if (this.f41896c == null || !str.equals(this.e)) {
            return;
        }
        this.f41896c.onSleepStatusCallback(0);
    }

    public boolean a(DeviceInfo deviceInfo) {
        return eey.d(deviceInfo, TsExtractor.TS_STREAM_TYPE_DTS_HD);
    }

    private int a(String str) {
        if (this.g.containsKey(str)) {
            return this.g.get(str).intValue();
        }
        return 0;
    }

    private void e(String str, int i) {
        this.g.put(str, Integer.valueOf(i));
    }

    public void e() {
        BaseApplication.getContext().unregisterReceiver(this.f41895a);
        this.g.clear();
        this.f41896c = null;
        a();
    }

    private static void a() {
        synchronized (d) {
            f41894b = null;
        }
    }
}
