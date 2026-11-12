package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import com.huawei.wisecloud.drmclient.license.HwDrmConstant;
import health.compact.a.CommonUtil;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class dyj {
    public static void a(int i) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put("type", String.valueOf(i));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_WIFI_BIND_TYPE_2060026.value(), map, 0);
        LogUtil.a("PluginDevice_ScaleBiAnalyticsHelper", "setBiWifiDeviceBindType bindType: ", Integer.valueOf(i), " map: ", map.toString());
    }

    public static void f(String str) {
        LogUtil.a("PluginDevice_ScaleBiAnalyticsHelper", "setBiWifiConfigNetworkAddress deviceAddress: ", CommonUtil.n(str));
        HashMap map = new HashMap(16);
        map.put("click", "1");
        if (!TextUtils.isEmpty(str)) {
            map.put("macAddress", str);
        }
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_HAGRID_DEVICE_DUAL_MODE_ADD_SUCCESS_2060039.value(), map, 0);
    }

    public static void e(int i) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put("type", String.valueOf(i));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_WIFI_BIND_TYPE_2060026.value(), map, 0);
        LogUtil.a("PluginDevice_ScaleBiAnalyticsHelper", "setBiSingleWifiDeviceBindType bindType: ", Integer.valueOf(i), " map: ", map.toString());
    }

    public static void a(String str, elh elhVar) {
        LogUtil.a("PluginDevice_ScaleBiAnalyticsHelper", "setBiSingleWifiDeviceBindSuccessCount code: ", CommonUtil.n(str));
        MeasurableDevice measurableDeviceB = dmp.d().b(str, false);
        if (measurableDeviceB instanceof eby) {
            HashMap map = new HashMap(16);
            map.put("click", "1");
            c(elhVar, (eby) measurableDeviceB, map);
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_WIFI_DEVICE_BIND_2060024.value(), map, 0);
        }
    }

    public static void e(String str) {
        LogUtil.a("PluginDevice_ScaleBiAnalyticsHelper", "setBiBluetoothPairSuccess productId: ", CommonUtil.n(str));
        boolean zAi = dxm.ai(str);
        HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put("type", Integer.valueOf(!zAi ? 1 : 0));
        map.put("deviceId", Integer.valueOf(dxm.j(str)));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_HAGRID_DEVICE_DUAL_MODE_ADD_SUCCESS_2060038.value(), map, 0);
    }

    private static void c(elh elhVar, eby ebyVar, Map<String, Object> map) {
        String strD;
        if (TextUtils.isEmpty(ebyVar.getAddress()) || (strD = erh.d(ebyVar.getAddress())) == null || TextUtils.isEmpty(strD) || strD.length() <= 24) {
            return;
        }
        map.put("macAddress", strD.substring(0, 24));
        map.put("device_name", elhVar.l().d());
        map.put(DeviceCategoryFragment.DEVICE_TYPE, elhVar.m().name());
    }

    public static void h() {
        LogUtil.a("PluginDevice_ScaleBiAnalyticsHelper", "setBiWifiDeviceOtaUpgrade enter");
        HashMap map = new HashMap(16);
        map.put("click", "1");
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_WIFI_OTA_UPGRADE_2060023.value(), map, 0);
    }

    public static void a(String str) {
        LogUtil.a("PluginDevice_ScaleBiAnalyticsHelper", "setBiAutoMeasureWeight productId: ", CommonUtil.n(str));
        HashMap map = new HashMap(16);
        map.put("click", 1);
        elh elhVarD = ResourceManager.c().d(str);
        if (elhVarD != null) {
            elh.d dVarL = elhVarD.l();
            if (dVarL != null) {
                map.put("device_name", dVarL.d());
            }
            HealthDevice.HealthDeviceKind healthDeviceKindM = elhVarD.m();
            if (healthDeviceKindM != null) {
                map.put(DeviceCategoryFragment.DEVICE_TYPE, healthDeviceKindM.name());
            }
        }
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_HOME_MEASURE_SUCCESS_2060022.value(), map, 0);
    }

    public static void c(String str) {
        String strName;
        LogUtil.a("PluginDevice_ScaleBiAnalyticsHelper", "setBiWeightMeasureResult productId: ", CommonUtil.n(str));
        elh elhVarD = ResourceManager.c().d(str);
        String str2 = null;
        if (elhVarD != null) {
            String strC = etn.c(str, elhVarD.l().d());
            strName = elhVarD.m() != null ? elhVarD.m().name() : null;
            str2 = strC;
        } else {
            LogUtil.j("PluginDevice_ScaleBiAnalyticsHelper", "onCreateView info is null");
            strName = null;
        }
        LogUtil.d("PluginDevice_ScaleBiAnalyticsHelper", "WeightResultFragment deviceName is " + str2);
        HashMap map = new HashMap(16);
        map.put("device_name", str2);
        map.put(DeviceCategoryFragment.DEVICE_TYPE, strName);
        map.put("measure_time", new SimpleDateFormat(HwDrmConstant.TIME_FORMAT).format(new Date(System.currentTimeMillis())));
        map.put("prodId", era.b(str));
        lmf.d().c(dxw.d(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_MEASURE_SUCCEED_2060011.value(), map, 0);
        ddq.d().setEvent(BaseApplication.getContext(), String.valueOf(KakaConstants.TASK_MEASURE_TODAY_WEIGHT), map);
    }

    public static void e() {
        LogUtil.a("PluginDevice_ScaleBiAnalyticsHelper", "setBiAbnormalDataConfirmBiEvent enter");
        HashMap map = new HashMap(16);
        map.put("click", "1");
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_HOME_WEIGHT_ABNORMAL_DATA_CONFIRM_2030068.value(), map, 0);
    }

    public static void b() {
        LogUtil.a("PluginDevice_ScaleBiAnalyticsHelper", "setBiMeasureForPlan enter");
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put("type", 1);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.INT_PLAN_1120034.value(), map, 0);
    }

    public static void d(String str, String str2, String str3, ContentValues contentValues) {
        String strE;
        LogUtil.a("PluginDevice_ScaleBiAnalyticsHelper", "setBiHagridDeviceOtaUpgrade enter");
        HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put("type", dxm.f32485b.get(str));
        map.put("oldVersion", str2);
        map.put("newVersion", str3);
        if (contentValues != null && !TextUtils.isEmpty(contentValues.getAsString("uniqueId"))) {
            MeasurableDevice measurableDeviceB = dmp.d().b(contentValues.getAsString("uniqueId"), false);
            eby ebyVar = measurableDeviceB instanceof eby ? (eby) measurableDeviceB : null;
            if (ebyVar != null) {
                strE = ebyVar.e();
            } else {
                LogUtil.j("PluginDevice_ScaleBiAnalyticsHelper", "setBiHagridDeviceOtaUpgrade device is null");
                strE = "";
            }
        } else {
            strE = "";
        }
        map.put("deviceId", strE);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_HAGRID_DEVICE_UP_OTA_SUCCESS_2060041.value(), map, 0);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x004a  */
    public static void d(String str, String str2, ContentValues contentValues) {
        String strE;
        LogUtil.a("PluginDevice_ScaleBiAnalyticsHelper", "setBiHagridOtaCheckUpgrade enter");
        HashMap map = new HashMap(16);
        map.put("type", dxm.f32485b.get(str));
        map.put("deviceVersion", str2);
        if (contentValues != null && !TextUtils.isEmpty(contentValues.getAsString("uniqueId"))) {
            MeasurableDevice measurableDeviceB = dmp.d().b(contentValues.getAsString("uniqueId"), false);
            if (measurableDeviceB instanceof eby) {
                strE = ((eby) measurableDeviceB).e();
            } else {
                strE = "";
            }
        } else {
            strE = "";
        }
        map.put("deviceId", strE);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_HAGRID_DEVICE_CHECK_UP_OTA_SUCCESS_2060040.value(), map, 0);
    }

    public static void d(com.huawei.hihealth.device.open.HealthDevice healthDevice, String str, elh elhVar) {
        LogUtil.a("PluginDevice_ScaleBiAnalyticsHelper", "setBiCommonBindSuccessAnalytics enter");
        HashMap map = new HashMap(16);
        map.put("macAddress", erh.d(healthDevice.getAddress()));
        map.put("device_name", etn.c(str, elhVar.l().d()));
        map.put(DeviceCategoryFragment.DEVICE_TYPE, elhVar.m().name());
        map.put("prodId", era.b(str));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_BIND_SUCCEED_2060005.value(), map, 0);
        LogUtil.a("PluginDevice_ScaleBiAnalyticsHelper", "macAddress fuzzyData: ", CommonUtil.n(erh.d(healthDevice.getAddress())));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_BIND_SUCCEED_WHITE_2060087.value(), map, 0);
    }

    public static void b(String str, String str2) {
        LogUtil.a("PluginDevice_ScaleBiAnalyticsHelper", "setBiStartOpenService enter");
        HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put("id", str);
        map.put("name", str2);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_OPEN_SERVICE_2060021.value(), map, 0);
    }

    public static void d() {
        LogUtil.a("PluginDevice_ScaleBiAnalyticsHelper", "setBiOpenAppHelpActivity enter");
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HOME_1010034.value(), new HashMap(16), 0);
    }

    public static void a() {
        LogUtil.a("PluginDevice_ScaleBiAnalyticsHelper", "setBiCallHotLine enter");
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HOME_1010046.value(), new HashMap(16), 0);
    }

    public static void c() {
        LogUtil.a("PluginDevice_ScaleBiAnalyticsHelper", "setBiEnterPollenClub enter");
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HOME_1010042.value(), new HashMap(16), 0);
    }

    public static void c(Map<String, Object> map) {
        LogUtil.a("PluginDevice_ScaleBiAnalyticsHelper", "setBiResetBandUpdate enter");
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_UNBIND_SUCCEED_2060014.value(), map, 0);
    }

    public static void d(String str, String str2) {
        String deviceName;
        LogUtil.a("PluginDevice_ScaleBiAnalyticsHelper", "setBiRequestDeviceShareClickEvent enter");
        HashMap map = new HashMap(16);
        MeasurableDevice measurableDeviceB = !TextUtils.isEmpty(str) ? dmp.d().b(str, false) : null;
        if (measurableDeviceB == null) {
            deviceName = "";
        } else {
            deviceName = measurableDeviceB.getDeviceName();
        }
        map.put("click", "1");
        String strM = dxm.m(str);
        if (TextUtils.isEmpty(strM)) {
            strM = dxm.m(str2);
        }
        map.put("device_version", strM);
        map.put("device_model", deviceName);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_HAGRID_DEVICE_REQUEST_DEVICE_SHARE_2060053.value(), map, 0);
    }

    public static void e(Map<String, Object> map) {
        LogUtil.a("PluginDevice_ScaleBiAnalyticsHelper", "setBiDeviceBindGuideSuccessPair enter");
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_BIND_SUCCEED_2060005.value(), map, 0);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_BIND_SUCCEED_WHITE_2060087.value(), map, 0);
    }

    public static void b(String str) {
        LogUtil.a("PluginDevice_ScaleBiAnalyticsHelper", "setBiDualModelBluetoothPairSuccess enter");
        boolean zAi = dxm.ai(str);
        HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put("type", Integer.valueOf(!zAi ? 1 : 0));
        map.put("deviceId", Integer.valueOf(dxm.j(str)));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_HAGRID_DEVICE_DUAL_MODE_ADD_SUCCESS_2060038.value(), map, 0);
    }

    public static void d(String str) {
        LogUtil.a("PluginDevice_ScaleBiAnalyticsHelper", "setBiWeightMeasureStart enter");
        HashMap map = new HashMap(16);
        elh elhVarD = ResourceManager.c().d(str);
        map.put("device_name", (elhVarD == null || elhVarD.l() == null) ? null : etn.c(str, elhVarD.l().d()));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_BEGIN_MEASURE_2060006.value(), map, 0);
    }

    public static void d(elh elhVar, String str) {
        LogUtil.a("PluginDevice_ScaleBiAnalyticsHelper", "setBiBindUiClickEvent enter");
        HashMap map = new HashMap(16);
        map.put("click", "1");
        if (elhVar != null && elhVar.l() != null) {
            map.put("device_name", elhVar.l().d());
        } else {
            LogUtil.j("PluginDevice_ScaleBiAnalyticsHelper", "setBiBindUiClickEvent mProductInfo is null");
        }
        lmf.d().c(BaseApplication.getContext(), str, map, 0);
    }

    public static void c(Context context, HealthDevice healthDevice, String str, String str2) {
        if (healthDevice == null) {
            LogUtil.j("PluginDevice_ScaleBiAnalyticsHelper", "setDeviceVersionBi device is null");
            return;
        }
        lmg lmgVar = new lmg();
        lmgVar.a(dxm.j.get(str));
        lmgVar.c(dxm.a(healthDevice.getAddress()));
        String strM = dxm.m(str2);
        dxn.e("PluginDevice_ScaleBiAnalyticsHelper", strM, context, str2);
        if (TextUtils.isEmpty(strM)) {
            strM = dxm.m(str);
        }
        lmgVar.d(strM);
        lmf.d().e(lmgVar);
    }
}
