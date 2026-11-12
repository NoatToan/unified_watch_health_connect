package defpackage;

import android.os.Build;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.LogUtil;
import java.util.ConcurrentModificationException;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class cqp {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static LinkedHashMap<String, String> f31262b = new LinkedHashMap<>(16);
    private static final Object e = new Object();

    public static void a(int i, String str, String str2, String str3) {
        if (!NetworkUtil.i()) {
            LogUtil.e("DeviceOperationUtil", "reportMonitorResult monitorType is unknown.");
            return;
        }
        if (i == -1) {
            LogUtil.e("DeviceOperationUtil", "reportMonitorResult monitorType is unknown.");
            return;
        }
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        e(i, str, str2, str3);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00c5  */
    private static void e(int i, String str, String str2, String str3) {
        try {
            try {
                String[] strArrSplit = str3.split("&");
                boolean zE = e(i, strArrSplit, false);
                if (str.contains(":")) {
                    str = cpl.e(str);
                }
                String strValueOf = String.valueOf(System.currentTimeMillis());
                LinkedHashMap linkedHashMap = new LinkedHashMap(16);
                String strE = cot.e();
                String str4 = Build.MODEL;
                linkedHashMap.put("monitorType", String.valueOf(i));
                linkedHashMap.put("otherCode", strArrSplit[0]);
                linkedHashMap.put("deviceName", str);
                linkedHashMap.put("errorCode", str2);
                linkedHashMap.put("timestamp", strValueOf);
                linkedHashMap.put("serialNumber", strE);
                linkedHashMap.put("phoneMode", str4);
                if (strArrSplit.length > 1) {
                    linkedHashMap.put("connectModel", strArrSplit[1]);
                }
                if (strArrSplit.length > 2) {
                    if (strArrSplit[2].equals("normalGattTimeout")) {
                        linkedHashMap.put("normalGattTimeoutModel", strArrSplit[2]);
                    } else {
                        linkedHashMap.put("powerModel", strArrSplit[2]);
                    }
                }
                JSONObject jSONObject = new JSONObject(linkedHashMap);
                String str5 = (String) linkedHashMap.get("deviceName");
                try {
                    if (Integer.parseInt((String) linkedHashMap.get("monitorType")) != 100042) {
                        if (cpj.a(str5) || !str5.contains(Constants.LINK) || str5.contains("?")) {
                            str5 = "";
                        }
                    } else {
                        str5 = "";
                    }
                } catch (NumberFormatException unused) {
                    LogUtil.e("DeviceOperationUtil", "parseInt NumberFormatException");
                }
                cpj.d(jSONObject.toString(), str5, 0, (DeviceInfo) null);
                synchronized (e) {
                    try {
                        if (f31262b == null) {
                            f31262b = new LinkedHashMap<>(16);
                        }
                        f31262b.put(strValueOf, linkedHashMap.toString());
                        if (zE || f31262b.size() >= 30) {
                            LogUtil.b("DeviceOperationUtil", "opEvent sOpEventDataMap: ", f31262b.toString());
                            lng.e("80020005", f31262b);
                            f31262b = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (NumberFormatException unused2) {
                LogUtil.d("DeviceOperationUtil", "opEvent occur NumberFormatException.");
            }
        } catch (ConcurrentModificationException unused3) {
            LogUtil.d("DeviceOperationUtil", "opEvent occur ConcurrentModificationException.");
        }
    }

    private static boolean e(int i, String[] strArr, boolean z) {
        if (i != 100050) {
            if (i == 100112) {
                return true;
            }
            LogUtil.b("DeviceOperationUtil", "isReportSingle monitorType is other");
            return z;
        }
        int i2 = cpb.i(strArr[0]);
        if (i2 == 2 || i2 == 4 || i2 == 3) {
            return true;
        }
        return z;
    }
}
