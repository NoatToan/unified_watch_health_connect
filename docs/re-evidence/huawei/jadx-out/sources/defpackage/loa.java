package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbtsdk.btdatatype.datatype.OperationDeviceInfo;
import health.compact.a.LogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class loa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f40531a = new Object();
    private static loa e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, OperationDeviceInfo> f40532b = new HashMap(16);

    public static loa a() {
        loa loaVar;
        synchronized (f40531a) {
            if (e == null) {
                e = new loa();
            }
            loaVar = e;
        }
        return loaVar;
    }

    public OperationDeviceInfo d(String str) {
        if (TextUtils.isEmpty(str) || this.f40532b.get(str) == null) {
            return null;
        }
        return this.f40532b.get(str);
    }

    public void a(DeviceInfo deviceInfo) {
        if (deviceInfo != null) {
            LogUtil.b("OpAnalyticsManager", "setDeviceInfoMap ProductType: ", Integer.valueOf(deviceInfo.getProductType()), " containsKey: ", Boolean.valueOf(this.f40532b.containsKey(deviceInfo.getDeviceIdentify())));
            if (this.f40532b.containsKey(deviceInfo.getDeviceIdentify())) {
                this.f40532b.get(deviceInfo.getDeviceIdentify()).setProductType(deviceInfo.getProductType());
                return;
            }
            OperationDeviceInfo operationDeviceInfo = new OperationDeviceInfo();
            operationDeviceInfo.setDeviceIdentify(deviceInfo.getDeviceIdentify());
            operationDeviceInfo.setProductType(deviceInfo.getProductType());
            this.f40532b.put(deviceInfo.getDeviceIdentify(), operationDeviceInfo);
        }
    }

    public void b(DeviceInfo deviceInfo, long j) {
        if (deviceInfo == null) {
            LogUtil.b("OpAnalyticsManager", "setStartConnectTime deviceInfo is null.");
            return;
        }
        if (TextUtils.isEmpty(deviceInfo.getDeviceIdentify()) || j <= 0) {
            return;
        }
        OperationDeviceInfo operationDeviceInfo = this.f40532b.get(deviceInfo.getDeviceIdentify());
        if (operationDeviceInfo == null) {
            LogUtil.b("OpAnalyticsManager", "setStartConnectTime operationDeviceInfo is null.");
        } else {
            operationDeviceInfo.setStartConnectTime(j);
            operationDeviceInfo.setDeviceBluetoothType(deviceInfo.getDeviceBluetoothType());
        }
    }

    public void a(String str, long j) {
        if (TextUtils.isEmpty(str) || j <= 0) {
            return;
        }
        OperationDeviceInfo operationDeviceInfo = this.f40532b.get(str);
        if (operationDeviceInfo == null) {
            LogUtil.b("OpAnalyticsManager", "setConnectFailedTime operationDeviceInfo is null.");
        } else {
            operationDeviceInfo.setEndConnectTime(j);
        }
    }

    public void d(String str, int i) {
        if (TextUtils.isEmpty(str) || i <= 0) {
            return;
        }
        OperationDeviceInfo operationDeviceInfo = this.f40532b.get(str);
        if (operationDeviceInfo == null) {
            LogUtil.b("OpAnalyticsManager", "setErrorCode operationDeviceInfo is null.");
        } else {
            operationDeviceInfo.setErrorCode(i);
        }
    }

    public void e(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        OperationDeviceInfo operationDeviceInfo = this.f40532b.get(str);
        if (operationDeviceInfo == null) {
            LogUtil.b("OpAnalyticsManager", "setErrorCode operationDeviceInfo is null.");
        } else {
            operationDeviceInfo.setErrorMeathod(str2);
        }
    }
}
