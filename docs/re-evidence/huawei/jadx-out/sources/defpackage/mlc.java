package defpackage;

import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.huawei.health.IBaseCommonCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class mlc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f41858c = new Object();
    private static mlc d;
    private Map<String, IBaseCommonCallback> e = new HashMap();

    private mlc() {
    }

    public static mlc a() {
        mlc mlcVar;
        synchronized (f41858c) {
            if (d == null) {
                d = new mlc();
            }
            mlcVar = d;
        }
        return mlcVar;
    }

    public void c(String str, IBaseCommonCallback iBaseCommonCallback) {
        if (TextUtils.isEmpty(str) || iBaseCommonCallback == null) {
            return;
        }
        this.e.put(str, iBaseCommonCallback);
    }

    private IBaseCommonCallback e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.e.get(str);
    }

    private void a(String str) {
        if (!TextUtils.isEmpty(str) && this.e.containsKey(str)) {
            this.e.remove(str);
            LogUtil.a("BatterySupport", "removeBatteryTaskCallback success.");
        }
    }

    public void a(DeviceInfo deviceInfo, byte[] bArr) {
        int iE;
        LogUtil.a("BatterySupport", "handleWearKitBatteryValue enter");
        if (bArr == null || bArr.length <= 0) {
            LogUtil.e("BatterySupport", "handleWearKitBatteryValue() Received data is null");
            return;
        }
        if (deviceInfo == null) {
            LogUtil.e("BatterySupport", "handleWearKitBatteryValue() Received deviceInfo is null");
            return;
        }
        if (bArr.length > 1 && bArr[0] == 1 && bArr[1] == 8) {
            if (bArr.length > 3 && bArr[2] == 127) {
                LogUtil.e("BatterySupport", "handleWearKitBatteryValue() get !V0 battery level timeout.");
                iE = -1;
            } else {
                iE = e(bArr);
            }
            LogUtil.a("BatterySupport", "handleWearKitBatteryValue battery value is: ", Integer.valueOf(iE));
            b(iE, deviceInfo);
        }
    }

    private int e(byte[] bArr) {
        try {
            String strE = eeq.e(bArr);
            int i = 0;
            LogUtil.a("BatterySupport", "getBatteryValue() Received byte message is:", Arrays.toString(bArr), "getBatteryValue() Received message is:", strE);
            if (!TextUtils.isEmpty(strE) && strE.length() > 8) {
                String strSubstring = strE.substring(8);
                LogUtil.a("BatterySupport", "getBatteryValue() batteryString is:", strSubstring);
                int iV = CommonUtil.v(strSubstring);
                i = iV >= 0 ? iV : 0;
                if (i > 100) {
                    return 100;
                }
            }
            return i;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private void b(int i, DeviceInfo deviceInfo) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("mDeviceName", deviceInfo.getDeviceName());
        jsonObject.addProperty("mProductType", Integer.valueOf(deviceInfo.getProductType()));
        jsonObject.addProperty("mBatteryValue", Integer.valueOf(i));
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(jsonObject);
        LogUtil.a("BatterySupport", "onResponseBatteryValue response is:", jsonArray.toString());
        try {
            try {
                IBaseCommonCallback iBaseCommonCallbackE = e(deviceInfo.getDeviceIdentify());
                if (iBaseCommonCallbackE != null) {
                    LogUtil.a("BatterySupport", "onResponseBatteryValue IBaseCommonCallback is not null");
                    iBaseCommonCallbackE.onResponse(0, jsonArray.toString());
                }
            } catch (Exception unused) {
                LogUtil.e("BatterySupport", "onResponseBatteryValue RemoteException");
            }
        } finally {
            a(deviceInfo.getDeviceIdentify());
        }
    }
}
