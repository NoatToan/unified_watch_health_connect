package defpackage;

import android.os.Build;
import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.OpAnalyticsUtil;
import health.compact.a.CommonUtil;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class rdt {
    public static void d(boolean z) {
        HashMap map = new HashMap(16);
        if (z) {
            mhs.a().setSwitchSetting("wlan_auto_update", "1", null);
            map.put("type", "1");
        } else {
            mhs.a().setSwitchSetting("wlan_auto_update", "2", null);
            map.put("type", "0");
        }
        map.put("click", 1);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SETTING_1090006.value(), map, 0);
    }

    public static void d(boolean z, String str) {
        HashMap map = new HashMap(16);
        if (z) {
            mhs.a().setSwitchSetting("auto_open_wlan_status", "1", str, null);
            map.put("type", "1");
        } else {
            mhs.a().setSwitchSetting("auto_open_wlan_status", "2", str, null);
            map.put("type", "0");
        }
        map.put("click", 1);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SETTING_WLAN_TRANSMIT_1090096.value(), map, 0);
        LogUtil.a("DeviceBiAnalyticsUtil", "autoOpenWlanTransmitBiEvent end");
    }

    public static void e(String str, int i) {
        if (i != 0) {
            HashMap map = new HashMap(16);
            map.put("device_name", str);
            map.put(DeviceCategoryFragment.DEVICE_TYPE, "HDK_WEAR");
            map.put("error_type", String.valueOf(i));
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SETTING_1090010.value(), map, 0);
            return;
        }
        LogUtil.j("DeviceBiAnalyticsUtil", "errorCode is 0");
    }

    public static void a(boolean z) {
        HashMap map = new HashMap(16);
        if (z) {
            map.put("type", 1);
        } else {
            map.put("type", 2);
        }
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_PAIRING_MODE_1090035.value(), map, 0);
    }

    public static void d() {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("type", "1");
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.KID_ACCOUNT_PAIR_STUDENT_BAND.value(), map, 0);
    }

    public static void a(int i) {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("type", String.valueOf(i));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.USER_SELECT_PAIR_MODE.value(), map, 0);
    }

    public static void a(String str) {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        lmf.d().c(BaseApplication.getContext(), str, map, 0);
    }

    public static void e(String str, String str2, boolean z) {
        LogUtil.a("DeviceBiAnalyticsUtil", "saveAutoInstallCheck save AutoOnCheckedListener");
        HashMap map = new HashMap(16);
        if (z) {
            rcw.b(BaseApplication.getContext()).a(str, true);
            mhs.a().setSwitchSetting("auto_update_status", "true", str2, null);
            map.put("type", "1");
        } else {
            rcw.b(BaseApplication.getContext()).a(str, false);
            mhs.a().setSwitchSetting("auto_update_status", "false", str2, null);
            map.put("type", "0");
        }
        map.put("click", 1);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SETTING_1090037.value(), map, 0);
    }

    public static void e(Map<String, Object> map, int i) {
        String str;
        if (map == null) {
            return;
        }
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SETTING_1090001.value(), map, 0);
        if (!(map.get("devicename") instanceof String)) {
            str = "";
        } else {
            str = (String) map.get("devicename");
        }
        map.clear();
        map.put("device_name", str);
        map.put(DeviceCategoryFragment.DEVICE_TYPE, "HDK_WEAR");
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_BIND_SUCCEED_2060005.value(), map, 0);
        map.put("from", Integer.valueOf(d(i)));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_BIND_SUCCEED_WHITE_2060087.value(), map, 0);
    }

    private static int d(int i) {
        Integer num = new HashMap<Integer, Integer>() { // from class: rdt.2
            {
                put(100003, 1);
                put(100008, 2);
                put(100009, 2);
                put(100001, 3);
                put(Integer.valueOf(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007), 4);
                put(100010, 5);
            }
        }.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static void b(int i) {
        LogUtil.a("DeviceBiAnalyticsUtil", "addClickDotting is click :", Integer.valueOf(i));
        HashMap map = new HashMap(2);
        map.put("type", Integer.valueOf(i));
        map.put("click", 1);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SETTING_2060105.value(), map, 0);
    }

    public static void b(String str, String str2, String str3) {
        HashMap map = new HashMap(16);
        if (TextUtils.isEmpty(str2)) {
            str2 = Constants.LINK;
        }
        map.put("kind_name", str2);
        map.put("product_id", str);
        map.put("device_name", etn.c(str));
        map.put("source", str3);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_PAIR_GUIDE_2170021.value(), map, 0);
    }

    public static void b(String str, String str2, boolean z) {
        HashMap map = new HashMap(10);
        map.put("device_name_key", str);
        map.put("device_emui_version_key", str2);
        if (z) {
            map.put("is_has_resources_key", "1");
        } else {
            map.put("is_has_resources_key", "0");
        }
        String strValue = AnalyticsValue.OOBE_IS_NORMAL_DISPLAY1090055.value();
        lmf.d().c(BaseApplication.getContext(), strValue, map, 0);
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(16);
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                linkedHashMap.put(str3, value.toString());
            } else {
                LogUtil.j("DeviceBiAnalyticsUtil", "the mapValue is null when mapKey is:", str3);
            }
        }
        OpAnalyticsUtil.getInstance().setEvent2nd(strValue, linkedHashMap);
    }

    public static void e(String str) {
        HashMap map = new HashMap(16);
        map.put("type", str);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_HOME_UPDATE_OPEN_2010089.value(), map, 0);
    }

    public static void a() {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.APP_MARKET_ENTRANCE_KEY.value(), map, 0);
    }

    public static void c() {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_DEVICE_TAB_MUSIC_2010103.value(), map, 0);
    }

    public static void i() {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_DEVICE_TAB_WALLET_2010104.value(), map, 0);
    }

    public static void c(String str) {
        mhs.a().setSwitchSetting("wlan_auto_update", "1", null);
        HashMap map = new HashMap(16);
        map.put("click", str);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SETTING_1090006.value(), map, 0);
    }

    public static void b(String str) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put("device_name", str);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_UNBIND_SUCCEED_2060014.value(), map, 0);
    }

    public static void c(String str, String str2) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put("id", str);
        map.put("name", str2);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_R1_PRO_HEADSET_OPEN_HEART_INDEX_2060042.value(), map, 0);
    }

    public static void a(DeviceInfo deviceInfo) {
        HashMap map = new HashMap(16);
        if (deviceInfo != null) {
            map.put("BT", mgu.b(deviceInfo).a());
        }
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SETTING_1090004.value(), map, 0);
    }

    public static void d(DeviceInfo deviceInfo) {
        HashMap map = new HashMap(16);
        if (deviceInfo != null) {
            map.put("BT", mgu.b(deviceInfo).a());
        }
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HOME_1010034.value(), map, 0);
    }

    public static void b() {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.CLICK_STUDENT_INFO_CARD.value(), map, 0);
    }

    public static void c(DeviceInfo deviceInfo) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put("BT", mgu.b(deviceInfo).a());
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HOME_1010033.value(), map, 0);
    }

    public static void e() {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_AW70_MODE_SELECTION_2060027.value(), map, 0);
    }

    public static void e(DeviceInfo deviceInfo) {
        HashMap map = new HashMap(16);
        if (deviceInfo != null) {
            map.put("BT", mgu.b(deviceInfo).a());
        }
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HOME_1010047.value(), map, 0);
        HashMap map2 = new HashMap(16);
        map2.put("click", "1");
        if (deviceInfo != null) {
            map2.put("device_name", deviceInfo.getDeviceName());
        }
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_UNBIND_SUCCEED_2060014.value(), map2, 0);
        lmf.d().c(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
    }

    public static void b(DeviceInfo deviceInfo) {
        HashMap map = new HashMap(16);
        if (deviceInfo != null) {
            map.put("BT", mgu.b(deviceInfo).a());
        }
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HOME_1010001.value(), map, 0);
    }

    public static void b(int i, String str) {
        String strValueOf = String.valueOf(System.currentTimeMillis());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strE = cot.e();
        String str2 = Build.MODEL;
        if (!TextUtils.isEmpty(str)) {
            linkedHashMap.put("deviceName", str);
        }
        linkedHashMap.put("monitorType", String.valueOf(i));
        linkedHashMap.put("timestamp", strValueOf);
        linkedHashMap.put("serialNumber", strE);
        linkedHashMap.put("phoneMode", str2);
        linkedHashMap.put("brand", String.valueOf(Build.BRAND));
        linkedHashMap.put("androidOS", String.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap.put("app_version", String.valueOf(CommonUtil.e(BaseApplication.getContext())));
        LinkedHashMap<String, String> linkedHashMap2 = new LinkedHashMap<>();
        linkedHashMap2.put(strValueOf, linkedHashMap.toString());
        OpAnalyticsUtil.getInstance().setEvent2nd("80020005", linkedHashMap2);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(strValueOf, linkedHashMap.toString());
        cpj.d(linkedHashMap3.toString(), str, 0, (DeviceInfo) null);
    }

    public static void d(int i, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(16);
        String strE = cot.e();
        String str2 = Build.MODEL;
        linkedHashMap.put("monitorType", String.valueOf(i));
        linkedHashMap.put("errorCode", str);
        linkedHashMap.put("timestamp", String.valueOf(jCurrentTimeMillis));
        linkedHashMap.put("serialNumber", strE);
        linkedHashMap.put("phoneMode", str2);
        OpAnalyticsUtil.getInstance().setEvent2nd("80020005", linkedHashMap);
    }

    public static void d(String str) {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("type", str);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.DEVICE_HOME_ITEM_CLICK_EVENT_VALUE.value(), map, 0);
    }

    public static void e(int i) {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("event", Integer.valueOf(i));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.DELETE_DEVICE_EVENT_VALUE.value(), map, 0);
    }

    public static void c(int i) {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("event", Integer.valueOf(i));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.DEVICE_SYSTEM_AND_UPDATE_EVENT_VALUE.value(), map, 0);
    }

    public static void d(Map<String, Object> map) {
        if (map == null) {
            LogUtil.a("DeviceBiAnalyticsUtil", "setStressPageEvent content is null");
            return;
        }
        lmn lmnVar = new lmn();
        HashMap map2 = new HashMap();
        map2.put("pageId", "Stress_0005");
        lmnVar.d(map2);
        lmnVar.e(map);
        lmf.d().a(BaseApplication.getContext(), AnalyticsValue.ENTRY_MY_WATCH_FACE_H2160001005.value(), lmnVar, 0);
        LogUtil.a("DeviceBiAnalyticsUtil", "setStressPageEvent content：", map);
    }
}
