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
public class yjp {
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, List<QueryDataCallback>> f53520a;
    private yjv e;

    public int e(int i, int i2) {
        return (i == 1 || i == 2) ? i : i2;
    }

    static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final yjp f53521b = new yjp();
    }

    private yjp() {
        HashMap map = new HashMap(16);
        this.f53520a = map;
        map.clear();
        this.e = new yjv(50);
    }

    public static yjp a() {
        return d.f53521b;
    }

    public void a(String str, QueryDataCallback queryDataCallback) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (d) {
            List<QueryDataCallback> arrayList = this.f53520a.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(queryDataCallback);
            this.f53520a.put(str, arrayList);
        }
        LogUtil.a("WearStatusHandleManager", "addWearStatusListener callback ok");
    }

    public void c(DeviceInfo deviceInfo, byte[] bArr) {
        List<QueryDataCallback> listRemove;
        if (bArr == null || bArr.length == 0) {
            LogUtil.j("WearStatusHandleManager", "Received message is null");
            return;
        }
        if (deviceInfo == null || StringUtils.g(deviceInfo.getDeviceIdentify())) {
            LogUtil.j("WearStatusHandleManager", "Received deviceInfo is null or deviceIdentify is empty");
            return;
        }
        if (bArr.length >= 2) {
            if (bArr[0] == 46 && bArr[1] == 3) {
                int iE = e(yli.a(bArr, -1), -1);
                LogUtil.a("WearStatusHandleManager", "handleWearStatusValue is: ", Integer.valueOf(iE));
                if (iE != -1) {
                    d(deviceInfo.getDeviceIdentify(), "wearStatus", String.valueOf(iE));
                }
                try {
                    synchronized (d) {
                        listRemove = this.f53520a.remove(deviceInfo.getDeviceIdentify());
                    }
                    if (listRemove == null) {
                        LogUtil.j("WearStatusHandleManager", "onResponseWearStatus QueryDataCallback is null");
                        return;
                    }
                    Device deviceI = ykx.i(deviceInfo);
                    if (deviceI == null) {
                        LogUtil.j("WearStatusHandleManager", "onResponseWearStatus hiWearDevice is null");
                        return;
                    }
                    int i = iE == -1 ? 12 : 0;
                    Iterator<QueryDataCallback> it = listRemove.iterator();
                    while (it.hasNext()) {
                        it.next().onDataReceived(i, new MonitorMessage("wearStatus", deviceI.getUuid(), iE));
                    }
                } catch (Exception unused) {
                    LogUtil.e("WearStatusHandleManager", "onResponseWearStatus RemoteException");
                }
            }
        }
    }

    public void d(String str, String str2, String str3) {
        if (StringUtils.g(str) || !"wearStatus".equals(str2) || str3 == null) {
            return;
        }
        this.e.c(str, str2, str3);
    }
}
