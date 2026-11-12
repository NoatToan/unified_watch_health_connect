package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.wearengine.device.Device;
import com.huawei.wearengine.monitor.MonitorMessage;
import com.huawei.wearengine.monitor.QueryDataCallback;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class yjo {
    private static final Object e = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, List<QueryDataCallback>> f53519b;
    private yjv d;

    public int d(int i, int i2) {
        return (i < 0 || i > 100) ? i2 : i;
    }

    static class e {
        private static final yjo e = new yjo();
    }

    private yjo() {
        HashMap map = new HashMap(16);
        this.f53519b = map;
        map.clear();
        this.d = new yjv(50);
    }

    public static yjo c() {
        return e.e;
    }

    public void d(String str, QueryDataCallback queryDataCallback) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (e) {
            List<QueryDataCallback> arrayList = this.f53519b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(queryDataCallback);
            this.f53519b.put(str, arrayList);
        }
        LogUtil.a("PowerStatusHandleManager", "addPowerStatusListener callback ok");
    }

    public void d(DeviceInfo deviceInfo, byte[] bArr) {
        List<QueryDataCallback> listRemove;
        if (bArr == null || bArr.length == 0) {
            LogUtil.j("PowerStatusHandleManager", "Received message is null");
            return;
        }
        if (deviceInfo == null || StringUtils.g(deviceInfo.getDeviceIdentify())) {
            LogUtil.j("PowerStatusHandleManager", "Received deviceInfo is null or deviceIdentify is empty");
            return;
        }
        if (bArr.length >= 2) {
            if (bArr[0] == 1 && bArr[1] == 8) {
                int iD = d(yli.a(bArr, -1), -1);
                LogUtil.a("PowerStatusHandleManager", "handlePowerStatusValue is: ", Integer.valueOf(iD));
                if (iD != -1) {
                    b(deviceInfo.getDeviceIdentify(), "powerStatus", String.valueOf(iD));
                }
                try {
                    synchronized (e) {
                        listRemove = this.f53519b.remove(deviceInfo.getDeviceIdentify());
                    }
                    if (listRemove == null) {
                        LogUtil.j("PowerStatusHandleManager", "onResponsePowerStatus QueryDataCallback is null");
                        return;
                    }
                    Device deviceI = ykx.i(deviceInfo);
                    if (deviceI == null) {
                        LogUtil.j("PowerStatusHandleManager", "onResponsePowerStatus hiWearDevice is null");
                        return;
                    }
                    int i = iD == -1 ? 12 : 0;
                    Iterator<QueryDataCallback> it = listRemove.iterator();
                    while (it.hasNext()) {
                        it.next().onDataReceived(i, new MonitorMessage("powerStatus", deviceI.getUuid(), iD));
                    }
                } catch (Exception unused) {
                    LogUtil.e("PowerStatusHandleManager", "onResponsePowerStatus RemoteException");
                }
            }
        }
    }

    public void b(String str, String str2, String str3) {
        if (StringUtils.g(str) || !"powerStatus".equals(str2) || str3 == null) {
            return;
        }
        this.d.c(str, str2, str3);
    }
}
