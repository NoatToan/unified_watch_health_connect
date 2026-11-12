package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.callback.BluetoothDataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lwl extends HwBaseManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static lwl f40966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f40967c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, lwm> f40968a;
    private BluetoothDataReceiveCallback e;

    private lwl(Context context) {
        super(context);
        this.f40968a = new HashMap(1);
        this.e = new BluetoothDataReceiveCallback() { // from class: lwl.5
            @Override // com.huawei.callback.BluetoothDataReceiveCallback
            public void onDataReceived(int i, DeviceInfo deviceInfo, byte[] bArr) {
                LogUtil.a("HwDeviceModeMgr", "onResponse errCode:", Integer.valueOf(i), ", and objData:", eeq.e(bArr));
                if (bArr.length < 1) {
                    LogUtil.j("HwDeviceModeMgr", "onResponse responseData length less than 1");
                } else if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceIdentify())) {
                    LogUtil.j("HwDeviceModeMgr", "device info error");
                } else {
                    lwl.this.a(deviceInfo.getDeviceIdentify()).onReceivedData(i, bArr);
                }
            }
        };
        lvb.e().d(38, this.e);
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 38;
    }

    public static lwl e(Context context) {
        lwl lwlVar;
        synchronized (f40967c) {
            if (f40966b == null && context != null) {
                f40966b = new lwl(context);
            }
            lwlVar = f40966b;
        }
        return lwlVar;
    }

    public void e(String str, IBaseResponseCallback iBaseResponseCallback) {
        a(str).d(iBaseResponseCallback);
    }

    public void c(String str, int i, IBaseResponseCallback iBaseResponseCallback) {
        a(str).d(i, iBaseResponseCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public lwm a(String str) {
        lwm lwmVar = this.f40968a.get(str);
        if (lwmVar != null) {
            return lwmVar;
        }
        lwm lwmVar2 = new lwm(str);
        this.f40968a.put(str, lwmVar2);
        return lwmVar2;
    }
}
