package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.common.base.Ascii;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LocalBroadcast;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class mnk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, mod> f41994a = new HashMap(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f41995b = new Object();
    private static mnk d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f41996c = new BroadcastReceiver() { // from class: mnk.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (context == null || intent == null || !"com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                return;
            }
            DeviceInfo deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo");
            if (deviceInfo == null) {
                LogUtil.j("HwFileServicesManager", "onReceive deviceInfo is null");
                return;
            }
            LogUtil.a("HwFileServicesManager", "mConnectStateChangedReceiver() status = ", Integer.valueOf(deviceInfo.getDeviceConnectState()));
            int deviceConnectState = deviceInfo.getDeviceConnectState();
            if (deviceConnectState != 2) {
                if (deviceConnectState != 3 && deviceConnectState != 4) {
                    LogUtil.d("HwFileServicesManager", "mConnectStateChangedReceiver() default branch.");
                } else {
                    mnx.a(deviceInfo);
                }
            }
        }
    };

    private mnk() {
        moa.c();
        BroadcastManagerUtil.c(BaseApplication.getContext(), this.f41996c, new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED"), LocalBroadcast.f36595c, null);
    }

    public static mnk e() {
        mnk mnkVar;
        synchronized (f41995b) {
            if (d == null) {
                d = new mnk();
            }
            mnkVar = d;
        }
        return mnkVar;
    }

    public static Map<String, mod> b() {
        return f41994a;
    }

    public void c() {
        BaseApplication.getContext().unregisterReceiver(this.f41996c);
    }

    public void b(byte[] bArr, DeviceInfo deviceInfo) {
        cpl.d("HwFileServicesManager", bArr, "getResult()  message: ");
        mob.d(bArr, deviceInfo);
    }

    public void b(DeviceInfo deviceInfo) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(28);
        deviceCommand.setCommandID(1);
        deviceCommand.setDataContent(new byte[]{Ascii.DEL, 4, 0, 1, -122, -91});
        deviceCommand.setDataLen(6);
        if (deviceInfo != null) {
            deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        }
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }
}
