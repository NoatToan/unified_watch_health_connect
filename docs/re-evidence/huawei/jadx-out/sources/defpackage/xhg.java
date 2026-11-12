package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BadParcelableException;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.devicesdk.callback.StatusCallback;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.unitedevice.entity.UniteDevice;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LogUtil;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes20.dex */
public class xhg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static xhg f52980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f52981c = new Object();
    private CopyOnWriteArraySet<StatusCallback> d = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BroadcastReceiver f52982a = new BroadcastReceiver() { // from class: xhg.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.d("FileBtBroadcast", "intent is null");
                return;
            }
            LogUtil.b("FileBtBroadcast", "Action is: ", intent.getAction());
            if (TextUtils.isEmpty(intent.getAction())) {
                LogUtil.e("FileBtBroadcast", "action is empty.");
            } else if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                LogUtil.b("FileBtBroadcast", "action match");
                xhg.this.c(intent);
            }
        }
    };

    private xhg() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        BroadcastManagerUtil.c(BaseApplication.b(), this.f52982a, intentFilter, clx.e, null);
    }

    protected static xhg e() {
        xhg xhgVar;
        synchronized (f52981c) {
            if (f52980b == null) {
                f52980b = new xhg();
            }
            xhgVar = f52980b;
        }
        return xhgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Intent intent) {
        Parcelable parcelableExtra;
        try {
            parcelableExtra = intent.getParcelableExtra("deviceinfo");
        } catch (BadParcelableException unused) {
            LogUtil.d("FileBtBroadcast", "fuzzy test exception, no care this.");
            parcelableExtra = null;
        }
        if (!(parcelableExtra instanceof DeviceInfo)) {
            LogUtil.b("FileBtBroadcast", "device info is wrong, please check.");
            return;
        }
        DeviceInfo deviceInfo = (DeviceInfo) parcelableExtra;
        UniteDevice uniteDeviceE = xit.e(deviceInfo);
        int deviceConnectState = deviceInfo.getDeviceConnectState();
        LogUtil.b("FileBtBroadcast", "deviceStatusChangeCallbacks size : " + this.d.size());
        for (StatusCallback statusCallback : this.d) {
            if (statusCallback == null) {
                LogUtil.d("FileBtBroadcast", "onConnectStatusChanged: callback is null.");
            } else {
                try {
                    statusCallback.onStatusChanged(0, uniteDeviceE, deviceConnectState);
                } catch (RemoteException unused2) {
                    LogUtil.d("FileBtBroadcast", "reportCallback RemoteException");
                }
            }
        }
    }

    protected void a(StatusCallback statusCallback) {
        if (statusCallback == null) {
            return;
        }
        LogUtil.b("FileBtBroadcast", "registerCallback : ", statusCallback);
        this.d.add(statusCallback);
    }

    protected void d(StatusCallback statusCallback) {
        if (statusCallback == null) {
            return;
        }
        this.d.remove(statusCallback);
    }
}
