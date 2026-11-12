package defpackage;

import com.huawei.callback.BluetoothDataReceiveCallback;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lvg implements BluetoothDataReceiveCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile lvg f40887b;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, BluetoothDataReceiveCallback> f40888a = new HashMap();

    private lvg() {
        lvb.e().d(39, this);
    }

    public void d(String str, BluetoothDataReceiveCallback bluetoothDataReceiveCallback) {
        this.f40888a.put(str, bluetoothDataReceiveCallback);
    }

    public static lvg e() {
        lvg lvgVar;
        synchronized (d) {
            if (f40887b == null) {
                f40887b = new lvg();
            }
            lvgVar = f40887b;
        }
        return lvgVar;
    }

    @Override // com.huawei.callback.BluetoothDataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, byte[] bArr) {
        Iterator<String> it = this.f40888a.keySet().iterator();
        while (it.hasNext()) {
            BluetoothDataReceiveCallback bluetoothDataReceiveCallback = this.f40888a.get(it.next());
            if (bluetoothDataReceiveCallback != null) {
                try {
                    bluetoothDataReceiveCallback.onDataReceived(i, deviceInfo, bArr);
                } catch (Exception e) {
                    LogUtil.a("WatchFaceBtDataManager", ExceptionUtils.c(e));
                }
            }
        }
    }
}
