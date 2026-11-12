package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Utils;
import java.util.HashMap;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes10.dex */
public class mgu {
    public static lmg b(DeviceInfo deviceInfo) {
        lmg lmgVar = new lmg();
        if (deviceInfo == null) {
            return lmgVar;
        }
        lmgVar.d(deviceInfo.getSoftVersion());
        String udidFromDevice = deviceInfo.getUdidFromDevice();
        if (!TextUtils.isEmpty(udidFromDevice)) {
            lmgVar.c(udidFromDevice);
        } else {
            if (Utils.o()) {
                String strReplace = nio.e(deviceInfo.getSecurityDeviceId()).replace(Marker.ANY_NON_NULL_MARKER, "A").replace("=", "A").replace("/", "A");
                if (strReplace.length() >= 24) {
                    strReplace = strReplace.substring(0, 24);
                }
                lmgVar.c(strReplace);
            } else if (deviceInfo.getDeviceIdType() == 1) {
                String strReplace2 = nio.e(deviceInfo.getSecurityDeviceId()).replace(Marker.ANY_NON_NULL_MARKER, "A").replace("=", "A").replace("/", "A");
                if (strReplace2.length() >= 24) {
                    strReplace2 = strReplace2.substring(0, 24);
                }
                lmgVar.c(strReplace2);
            } else {
                lmgVar.c(deviceInfo.getDeviceIdentify());
            }
            if (deviceInfo.getProductType() >= 58) {
                lmgVar.c(deviceInfo.getDeviceUdid());
            }
        }
        e(deviceInfo, lmgVar);
        if (deviceInfo.getProductType() == 3 || deviceInfo.getProductType() == 10) {
            lmgVar.c(deviceInfo.getUuid());
        }
        lmgVar.i(deviceInfo.getUdidFromDevice());
        lmgVar.b(deviceInfo.getSecurityDeviceId());
        lmgVar.e(deviceInfo.getDeviceIdentify());
        lmgVar.c(deviceInfo.getProductType());
        return lmgVar;
    }

    private static void e(DeviceInfo deviceInfo, lmg lmgVar) {
        if (11 == deviceInfo.getProductType() && "HUAWEI CM-R1P".equals(deviceInfo.getDeviceName())) {
            lmgVar.a("R1-PRO");
            return;
        }
        if (deviceInfo.getProductType() == 10 && (TextUtils.equals(deviceInfo.getDeviceName(), "PORSCHE DESIGN") || TextUtils.equals(deviceInfo.getDeviceModel(), "PORSCHE DESIGN"))) {
            lmgVar.a("PORSCHE DESIGN");
        } else if (deviceInfo.getProductType() >= 34) {
            lmgVar.a(deviceInfo.getDeviceModel());
        } else {
            lmgVar.a(mga.d(deviceInfo));
        }
    }

    public static void a(DeviceInfo deviceInfo) {
        LogUtil.a("WearDeviceBiUtil", "setBiAnalyticsData enter");
        lmg lmgVarB = b(deviceInfo);
        if (deviceInfo.getDeviceConnectState() == 2) {
            lmf.d().e(lmgVarB);
        } else if (deviceInfo.getDeviceConnectState() == 3) {
            lmf.d().c(lmgVarB);
        } else {
            LogUtil.j("WearDeviceBiUtil", "setBiAnalyticsData other state");
        }
    }

    public static void a() {
        LogUtil.a("WearDeviceBiUtil", "setMainBiAnalyticsData enter");
        DeviceInfo deviceInfoC = mgg.c("WearDeviceBiUtil");
        if (deviceInfoC == null) {
            deviceInfoC = mgi.c("WearDeviceBiUtil");
        }
        if (deviceInfoC != null) {
            a(deviceInfoC);
        }
    }

    public static void a(String str) {
        LogUtil.a("WearDeviceBiUtil", "entryMyWatchFaceBiEvent from：", str);
        HashMap map = new HashMap(4);
        map.put("event", 0);
        map.put(FunctionSetBeanReader.BI_ELEMENT, "m0");
        map.put("entrance", str);
        map.put("moduleName", "main_page");
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.ENTRY_MY_WATCH_FACE_H9000001.value(), map, 0);
    }

    public static void e(String str, String str2, String str3) {
        LogUtil.a("WearDeviceBiUtil", "operateWatchFaceBiEvent operate：", str, " operateStatus：", str2);
        HashMap map = new HashMap(6);
        map.put("event", 1);
        map.put(FunctionSetBeanReader.BI_ELEMENT, str);
        map.put("value", str2);
        map.put("resourceInfo", str3);
        map.put("entrance", "e1");
        map.put("moduleName", "main_page");
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.INSTALL_UPDATE_DELETE_APPLY_WATCH_FACE_H9000005.value(), map, 0);
    }

    public static void d(int i, String str, String str2) {
        LogUtil.a("WearDeviceBiUtil", "installAndApplyWatchFaceBiEvent operate：", Integer.valueOf(i), " operateStatus：", str);
        if (1 == i) {
            e("m1", str, str2);
        } else if (4 == i) {
            e("m2", str, str2);
        } else {
            LogUtil.a("WearDeviceBiUtil", "installAndApplyWatchFaceBiEvent  operate is other");
        }
    }
}
