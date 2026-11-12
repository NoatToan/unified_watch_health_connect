package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.servicesapi.R;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hihealth.dictionary.utils.ProductMapParseUtil;
import com.huawei.hms.network.embedded.g2;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.ErrorCode;
import health.compact.a.CompileParameterUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class een {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SparseIntArray f32852a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32852a = sparseIntArray;
        sparseIntArray.put(21, R.string.IDS_select_device_b1_name);
        sparseIntArray.put(22, R.string.IDS_select_device_b2_name);
        sparseIntArray.put(39, R.string.IDS_app_display_name_gemini);
        sparseIntArray.put(36, R.string.IDS_app_display_name_w1);
        sparseIntArray.put(37, R.string.IDS_app_display_name_w1);
        sparseIntArray.put(42, R.string.IDS_app_display_name_nys);
        sparseIntArray.put(47, R.string.IDS_app_display_name_eris);
        sparseIntArray.put(51, R.string.IDS_messagecenter_color_band_name);
        sparseIntArray.put(23, R.string.IDS_messagecenter_color_band_name);
        sparseIntArray.put(43, R.string.IDS_huawei_r1_content);
        sparseIntArray.put(46, R.string.IDS_app_display_name_leo);
        sparseIntArray.put(61, R.string.IDS_app_display_name_k2);
        sparseIntArray.put(62, R.string.IDS_app_display_name_k2);
        sparseIntArray.put(74, R.string.IDS_app_display_name_janus);
        sparseIntArray.put(81, R.string.IDS_app_display_name_aw);
        sparseIntArray.put(83, R.string.IDS_app_display_name_honor_aw);
        sparseIntArray.put(90, R.string.IDS_app_display_name_aw_pro);
        sparseIntArray.put(91, R.string.IDS_app_display_name_honor_aw_pro);
        sparseIntArray.put(436, R.string.IDS_name_honor_vision);
        sparseIntArray.put(437, R.string.IDS_name_huawei_vision_v);
        sparseIntArray.put(438, R.string.IDS_name_huawei_vision_x);
        sparseIntArray.put(439, R.string.IDS_name_honor_vision_x);
        sparseIntArray.put(440, R.string.IDS_name_huawei_vision);
        sparseIntArray.put(441, R.string.IDS_name_huawei_vision_s);
        sparseIntArray.put(ErrorCode.ERROR_CODE_NO_USERINFO, R.string.IDS_name_huawei_vision_v);
        sparseIntArray.put(g2.n, R.string.IDS_name_huawei_vision_x);
        sparseIntArray.put(WorkoutRecord.COURSE_TYPE_YOGA, R.string.IDS_name_huawei_vision);
        sparseIntArray.put(445, R.string.IDS_name_huawei_vision);
        sparseIntArray.put(446, R.string.IDS_name_huawei_vision);
        sparseIntArray.put(447, R.string.IDS_name_huawei_vision);
        sparseIntArray.put(448, R.string.IDS_name_huawei_vision);
        sparseIntArray.put(449, R.string.IDS_name_huawei_vision);
    }

    private static ProductMapInfo c(String str, String str2) {
        ProductMapParseUtil.a(BaseApplication.getContext());
        List<ProductMapInfo> listC = ProductMap.c(str, str2);
        if (njy.e(listC)) {
            LogUtil.a("DevicesNameSwitch", "productmap is null or empty");
            return null;
        }
        return listC.get(0);
    }

    public static String a(String str, String str2) {
        LogUtil.a("DevicesNameSwitch", "getDeviceNameForProdId prodId = ", str);
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DevicesNameSwitch", "prodId is empty");
            return "";
        }
        ProductMapInfo productMapInfoC = c("smartProductId", str);
        if (productMapInfoC != null) {
            String strC = productMapInfoC.c(str2);
            LogUtil.d("DevicesNameSwitch", "getDeviceNameForProdId marketingName:", strC);
            if (!TextUtils.isEmpty(strC)) {
                String[] strArrSplit = strC.split("####");
                if (strArrSplit.length == 2) {
                    if (LanguageUtil.l(BaseApplication.getContext())) {
                        return strArrSplit[1];
                    }
                    return strArrSplit[0];
                }
                if (strArrSplit.length == 1) {
                    return strArrSplit[0];
                }
            }
        }
        return "";
    }

    public static String b(int i, Context context, String str) {
        return e(i, context, str, "", "");
    }

    public static String e(int i, Context context, String str, String str2) {
        return e(i, context, str, str2, "");
    }

    public static String e(int i, Context context, String str, String str2, String str3) {
        String strE = "";
        if (context == null) {
            LogUtil.j("DevicesNameSwitch", "context == null");
            return "";
        }
        if (i == 0) {
            LogUtil.j("DevicesNameSwitch", "invalid device type id");
            return a(str2, str3);
        }
        LogUtil.a("DevicesNameSwitch", "getDeviceProductName type:", Integer.valueOf(i));
        ProductMapParseUtil.a(context);
        List<ProductMapInfo> listC = ProductMap.c("deviceId", String.valueOf(i));
        if (njy.b(listC)) {
            String strC = listC.get(0).c(str3);
            LogUtil.d("DevicesNameSwitch", "getDeviceProductName marketingName:", strC);
            if (!TextUtils.isEmpty(strC)) {
                strE = b(i, context, strC, str);
            }
        }
        if (TextUtils.isEmpty(strE)) {
            strE = e(i, context, str);
        }
        return TextUtils.isEmpty(strE) ? a(str2, str3) : strE;
    }

    private static String e(int i, Context context, String str) {
        Resources resources = context.getResources();
        HashSet hashSet = new HashSet(Arrays.asList(81, 83, 90, 91));
        HashSet hashSet2 = new HashSet(Arrays.asList(35, 41, 44, 45, 74, 78, 77, 97));
        HashSet hashSet3 = new HashSet(Arrays.asList(79, 80));
        if (hashSet.contains(Integer.valueOf(i))) {
            return e(context, i);
        }
        if (hashSet2.contains(Integer.valueOf(i))) {
            return c(context, i);
        }
        if (hashSet3.contains(Integer.valueOf(i))) {
            return d(context, i);
        }
        return a(i, resources, str);
    }

    private static String b(int i, Context context, String str, String str2) {
        String[] strArrSplit = str.split("####");
        if (strArrSplit.length == 2) {
            if (LanguageUtil.l(context)) {
                return strArrSplit[1];
            }
            return strArrSplit[0];
        }
        if (strArrSplit.length == 1) {
            return strArrSplit[0];
        }
        return e(i, context, str2);
    }

    private static String d(Context context, int i) {
        if (i == 79) {
            return qrs.w(context);
        }
        if (i == 80) {
            return qrs.h(context);
        }
        return "";
    }

    private static String e(Context context, int i) {
        if (i == 81) {
            return qrs.n(context);
        }
        if (i == 83) {
            return qrs.l(context);
        }
        if (i == 90) {
            return qrs.m(context);
        }
        if (i == 91) {
            return qrs.k(context);
        }
        return "";
    }

    private static String c(Context context, int i) {
        if (i == 35) {
            return qrs.b(context);
        }
        if (i == 41) {
            return qrs.p(context);
        }
        if (i == 74) {
            return qrs.o(context);
        }
        if (i != 97) {
            if (i == 44) {
                return qrs.e(context);
            }
            if (i == 45) {
                return "GRUS";
            }
            if (i != 77) {
                if (i == 78) {
                    return qrs.v(context);
                }
                return "";
            }
        }
        return qrs.a(context);
    }

    private static String c(int i, String str, Resources resources) {
        int identifier = f32852a.get(i);
        LogUtil.a("DevicesNameSwitch", Integer.valueOf(identifier));
        if (identifier == 0) {
            String strD = d(i);
            LogUtil.a("DevicesNameSwitch", strD);
            if (!TextUtils.isEmpty(strD)) {
                return strD;
            }
            identifier = resources.getIdentifier("IDS_app_name_health", "string", str);
        }
        return resources.getString(identifier);
    }

    public static String d(int i, Context context, String str) {
        return b(i, context, str, "", "");
    }

    public static String b(int i, Context context, String str, String str2, String str3) {
        if (context == null) {
            return "";
        }
        String strE = e(i, context, str, str2, str3);
        Resources resources = context.getResources();
        return resources.getString(resources.getIdentifier("IDS_app_name_health", "string", str)).equals(strE) ? "" : strE;
    }

    private static String d(int i) {
        LogUtil.a("DevicesNameSwitch", Integer.valueOf(i));
        edl pluginInfoByHiType = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByHiType(i);
        if (pluginInfoByHiType == null || pluginInfoByHiType.i() == null) {
            LogUtil.a("DevicesNameSwitch", "getDefaultName pluginInfo pluginInfo.getWearDeviceInfo is null");
            return null;
        }
        if (CompileParameterUtil.c("IS_RELEASE_VERSION", false)) {
            return pluginInfoByHiType.i().ah();
        }
        return pluginInfoByHiType.i().bp();
    }

    private static String b(int i, String str, Resources resources) {
        LogUtil.a("DevicesNameSwitch", Integer.valueOf(i));
        edl pluginInfoByDeviceType = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByDeviceType(i);
        if (pluginInfoByDeviceType == null || pluginInfoByDeviceType.i() == null) {
            LogUtil.a("DevicesNameSwitch", "getDefaultName pluginInfo pluginInfo.getWearDeviceInfo is null");
            return resources.getString(resources.getIdentifier("IDS_app_name_health", "string", str));
        }
        String strAh = pluginInfoByDeviceType.i().ah();
        return TextUtils.isEmpty(strAh) ? resources.getString(resources.getIdentifier("IDS_app_name_health", "string", str)) : strAh;
    }

    private static String a(int i, Resources resources, String str) {
        if (i == 92) {
            return b(44, str, resources);
        }
        if (i == 93) {
            return b(45, str, resources);
        }
        return c(i, str, resources);
    }
}
