package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiAppInfo;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hihealth.dictionary.utils.ProductMapParseUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.privacy.datasourcemanager.bean.SourceInfo;
import defpackage.lql;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class wgt {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map<String, Integer> f52039c = Collections.unmodifiableMap(new HashMap<String, Integer>() { // from class: wgt.4
        private static final long serialVersionUID = -1189305116792831566L;

        {
            put("manualInput", Integer.valueOf(R.mipmap.ic_data_source_manual_input_black));
            put("unknowApp", Integer.valueOf(R.mipmap.ic_data_source_unknown_app_black));
            put("unknowDevice", Integer.valueOf(R.mipmap.ic_data_source_unknown_device_black));
            put("06E", Integer.valueOf(R.mipmap.ic_data_source_band_black));
            put("06D", Integer.valueOf(R.mipmap.ic_data_source_watch_black));
            put("00E", Integer.valueOf(R.mipmap.ic_data_source_phone_black));
            put("011", Integer.valueOf(R.mipmap.ic_data_source_phone_black));
            put("082", Integer.valueOf(R.mipmap.ic_data_source_heart_headphonesh_black));
            put("088", Integer.valueOf(R.mipmap.ic_data_source_heart_rate_band_black));
            put("025", Integer.valueOf(R.mipmap.ic_data_source_body_fat_scale_black));
            put("08F", Integer.valueOf(R.mipmap.ic_data_source_treadmill_black));
            put("0B3", Integer.valueOf(R.mipmap.ic_data_source_temperature_gun_black));
            put("054", Integer.valueOf(R.mipmap.ic_data_source_pillow_black));
            put("02B", Integer.valueOf(R.mipmap.ic_cuff_sphygmomanometer));
        }
    });

    public static String b(String str) {
        ProductMapParseUtil.a(BaseApplication.getContext());
        List<ProductMapInfo> listC = ProductMap.c("deviceId", str);
        if (njy.e(listC)) {
            return "";
        }
        return listC.get(0).e();
    }

    public static int c(String str) {
        String strB = b(str);
        Map<String, Integer> map = f52039c;
        if (map.containsKey(strB)) {
            return map.get(strB).intValue();
        }
        if (f(str) && map.containsKey("025")) {
            return map.get("025").intValue();
        }
        return map.get("unknowDevice").intValue();
    }

    private static boolean f(String str) {
        return String.valueOf(85).equals(str) || String.valueOf(86).equals(str);
    }

    public static int e(String str) {
        String strB;
        if ("10004".equals(str) || "68".equals(str)) {
            strB = "02B";
        } else if ("104".equals(str)) {
            strB = "06D";
        } else {
            strB = b(str);
        }
        Map<String, Integer> map = f52039c;
        if (map.containsKey(strB)) {
            return map.get(strB).intValue();
        }
        return R.mipmap.ic_mydata_blood_pressure;
    }

    public static int a() {
        return f52039c.get("manualInput").intValue();
    }

    public static int d() {
        return f52039c.get("unknowDevice").intValue();
    }

    public static int c() {
        return f52039c.get("unknowApp").intValue();
    }

    public static void a(final Context context) {
        ProductMapParseUtil.a(context);
        if (lql.a(context)) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.main.stories.privacy.datasourcemanager.util.SourceUtil$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    lql.b(context, 0);
                }
            });
        }
    }

    public static List<SourceInfo> e(List<SourceInfo> list) {
        ArrayList arrayList = new ArrayList(10);
        for (SourceInfo sourceInfo : list) {
            if (sourceInfo.getmItemType() == 3) {
                arrayList.add(sourceInfo);
            }
        }
        return arrayList;
    }

    public static void a(List<SourceInfo> list) {
        for (SourceInfo sourceInfo : list) {
            if (sourceInfo.getmItemType() == 3) {
                int sourceType = sourceInfo.getSourceType();
                if (sourceType == 2) {
                    sourceInfo.setIconResourceId(c(String.valueOf(sourceInfo.getDeviceType())));
                } else if (sourceType == 3) {
                    sourceInfo.setIconResourceId(a());
                } else {
                    sourceInfo.setIconResourceId(c());
                }
            }
        }
    }

    public static void b(List<SourceInfo> list) {
        String strB = b();
        LogUtil.a("SourceUtil", "packageNameMapJson:", strB);
        if (TextUtils.isEmpty(strB)) {
            list.clear();
            return;
        }
        Map<String, String> mapB = peh.b(strB);
        Iterator<SourceInfo> it = list.iterator();
        while (it.hasNext()) {
            String packageName = it.next().getPackageName();
            if (!mapB.containsKey(packageName)) {
                it.remove();
                LogUtil.a("SourceUtil", "remove packageName:", packageName);
            }
        }
    }

    public static String b() {
        SharedPreferences sharedPreferences = BaseApplication.getContext().getSharedPreferences("privacy_data_source_third_party_app_flag_file", 0);
        return sharedPreferences == null ? "" : sharedPreferences.getString("privacy_data_source_third_party_app_flag_context", "");
    }

    public static void c(List<SourceInfo> list) {
        wgr.c(list, BaseApplication.getContext());
    }

    public static List<SourceInfo> d(List<SourceInfo> list) {
        ArrayList arrayList = new ArrayList(10);
        HashMap map = new HashMap(16);
        for (SourceInfo sourceInfo : list) {
            if (!map.containsKey(Integer.valueOf(sourceInfo.getDeviceId()))) {
                map.put(Integer.valueOf(sourceInfo.getDeviceId()), sourceInfo);
            }
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((SourceInfo) ((Map.Entry) it.next()).getValue());
        }
        return arrayList;
    }

    public static SourceInfo c(HiDeviceInfo hiDeviceInfo) {
        String strE;
        SourceInfo sourceInfo = new SourceInfo();
        if (hiDeviceInfo == null) {
            return sourceInfo;
        }
        sourceInfo.setDeviceUniqueCode(hiDeviceInfo.getDeviceUniqueCode());
        sourceInfo.setSourceType(2);
        sourceInfo.setItemType(3);
        sourceInfo.setDeviceType(hiDeviceInfo.getDeviceType());
        sourceInfo.setDeviceId(hiDeviceInfo.getDeviceId());
        if (hiDeviceInfo.getDeviceType() == 32) {
            strE = hiDeviceInfo.getModel();
            if (TextUtils.isEmpty(strE)) {
                strE = hiDeviceInfo.getManufacturer();
            }
            if (TextUtils.isEmpty(strE)) {
                strE = hiDeviceInfo.getDeviceName();
            }
            String deviceName = hiDeviceInfo.getDeviceName();
            String manufacturer = hiDeviceInfo.getManufacturer();
            if (j(deviceName) || j(manufacturer)) {
                sourceInfo.setOtherManufacturer(false);
            } else {
                sourceInfo.setOtherManufacturer(true);
            }
        } else {
            strE = xjj.e(hiDeviceInfo);
        }
        if (TextUtils.isEmpty(strE)) {
            if (hiDeviceInfo.getDeviceType() == 10004) {
                strE = BaseApplication.getContext().getResources().getString(R.string.IDS_hw_ecological_device);
            } else {
                strE = BaseApplication.getContext().getResources().getString(R.string.IDS_hw_data_origin_unknow_device);
            }
        }
        sourceInfo.setDeviceName(strE);
        return sourceInfo;
    }

    private static boolean j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        return upperCase.contains("HUAWEI") || upperCase.contains("HONOR");
    }

    public static boolean d(String str) {
        return (vzm.f51747b.equals(str) || lep.b(str)) ? false : true;
    }

    public static boolean a(String str) {
        return !"-1".equals(str);
    }

    public static SourceInfo d(HiAppInfo hiAppInfo) {
        SourceInfo sourceInfo = new SourceInfo();
        sourceInfo.setSourceType(1);
        sourceInfo.setDeviceId(hiAppInfo.getAppId());
        if (hiAppInfo.getAppName() != null) {
            sourceInfo.setDeviceName(hiAppInfo.getAppName());
        } else {
            sourceInfo.setDeviceName(BaseApplication.getContext().getResources().getString(R.string.IDS_hwh_datasource_unknow_application));
        }
        sourceInfo.setPackageName(hiAppInfo.getPackageName());
        sourceInfo.setAppVertion(hiAppInfo.getVersion());
        sourceInfo.setDeviceType(Integer.MIN_VALUE);
        sourceInfo.setItemType(3);
        return sourceInfo;
    }

    public static String a(HiHealthClient hiHealthClient) {
        String strF = qre.f(R.string.IDS_hw_data_origin_unknow_device);
        if (hiHealthClient == null) {
            ReleaseLogUtil.e("R_SourceUtil", "getDataSourceName hiHealthClient is null");
            return strF;
        }
        HiDeviceInfo hiDeviceInfo = hiHealthClient.getHiDeviceInfo();
        HiAppInfo hiAppInfo = hiHealthClient.getHiAppInfo();
        if (hiDeviceInfo == null || hiAppInfo == null) {
            ReleaseLogUtil.e("R_SourceUtil", "getDataSourceName hiDeviceInfo or appInfo is null");
            return strF;
        }
        String packageName = hiAppInfo.getPackageName();
        String deviceName = c(hiDeviceInfo).getDeviceName();
        if (!wgr.c(packageName)) {
            return wgr.d(packageName, hiDeviceInfo.getDeviceUniqueCode()) ? qre.f(R.string.IDS_hw_health_show_healthdata_input) : deviceName;
        }
        String appName = hiAppInfo.getAppName();
        if (!"未知APP".equals(appName)) {
            deviceName = appName;
        }
        return TextUtils.isEmpty(deviceName) ? qre.f(R.string.IDS_hwh_datasource_unknow_application) : deviceName;
    }
}
