package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.HwGetDevicesParameter;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.hms.network.embedded.w9;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.manager.HwVersionManager;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.AiCoreSdkConstant;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.wisecloud.drmclient.license.HwDrmConstant;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentUtils;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.WhiteBoxManager;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes11.dex */
public class nvd {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final HashMap<Integer, Long> f43791c = new HashMap() { // from class: nvd.2
        private static final long serialVersionUID = -3166334915769251418L;

        {
            try {
                put(18, Long.valueOf(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse("2018/09/20 00:00:00").getTime()));
                put(19, Long.valueOf(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse("2018/09/30 00:00:00").getTime()));
                put(20, Long.valueOf(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse("2018/10/1 00:00:00").getTime()));
                put(21, Long.valueOf(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse("2018/10/1 00:00:00").getTime()));
                put(23, Long.valueOf(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse("2018/09/20 00:00:00").getTime()));
                put(24, Long.valueOf(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse("2018/10/1 00:00:00").getTime()));
            } catch (ParseException e2) {
                LogUtil.e("UpdateUtil", "DEVICE_SUPPORT_START ParseException e:", e2.getMessage());
            }
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HashMap<Integer, Long> f43790b = new HashMap() { // from class: nvd.5
        private static final long serialVersionUID = 2263858593329879485L;

        {
            try {
                put(18, Long.valueOf(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse("2019/02/19 23:59:59").getTime()));
                put(19, Long.valueOf(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse("2019/02/28 23:59:59").getTime()));
                put(20, Long.valueOf(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse("2019/02/28 23:59:59").getTime()));
                put(21, Long.valueOf(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse("2019/02/28 23:59:59").getTime()));
                put(23, Long.valueOf(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse("2019/02/19 23:59:59").getTime()));
                put(24, Long.valueOf(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse("2019/02/28 23:59:59").getTime()));
            } catch (ParseException e2) {
                LogUtil.e("UpdateUtil", "DEVICE_SUPPORT_END ParseException e:", e2.getMessage());
            }
        }
    };
    private static boolean e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f43789a = "";
    private static String d = "";

    public static String n(String str) {
        LogUtil.a("UpdateUtil", "stringTransfer string = ", str);
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] strArrSplit = str.split(str.contains("；") ? "；" : System.lineSeparator());
        StringBuffer stringBuffer = new StringBuffer(str.length());
        boolean z = false;
        for (int i = 0; i < strArrSplit.length; i++) {
            if (!"".equals(strArrSplit[i])) {
                if (z) {
                    stringBuffer.append(System.lineSeparator());
                }
                stringBuffer.append(strArrSplit[i]);
                z = true;
            }
        }
        return stringBuffer.toString();
    }

    public static void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2)) {
            LogUtil.j("UpdateUtil", "upElecCardOpAnalytics key is null");
            return;
        }
        if (!str2.equals("recElectronic") && !str2.equals("saveElectronic") && !l(str)) {
            LogUtil.j("UpdateUtil", "is not receive Electronic, key = ", str2);
            return;
        }
        String strC = nio.c(str);
        n(BaseApplication.getContext(), str2 + strC, str3);
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(16);
        linkedHashMap.put(str2, str3);
        DeviceInfo deviceInfoB = b(str);
        if (deviceInfoB != null) {
            linkedHashMap.put("deviceModel", deviceInfoB.getDeviceModel());
        }
        LogUtil.a("UpdateUtil", "upElecCardOpAnalytics map = ", linkedHashMap.toString());
        OpAnalyticsUtil.getInstance().setEvent(OperationKey.ELECTRONIC_CARD_PROCESS_80070012.value(), linkedHashMap);
    }

    public static void c(String str, String str2, Boolean bool) {
        if (!l(str)) {
            LogUtil.j("UpdateUtil", "summaryElecCardOpAnalytics, is not receive Electronic");
            return;
        }
        String strC = nio.c(str);
        Context context = BaseApplication.getContext();
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put("recElectronic", u(context, "recElectronic" + strC));
        linkedHashMap.put("saveElectronic", u(context, "saveElectronic" + strC));
        linkedHashMap.put(w9.o, u(context, w9.o + strC));
        linkedHashMap.put("checkElectronic", u(context, "checkElectronic" + strC));
        linkedHashMap.put("hotaElectronic", u(context, "hotaElectronic" + strC));
        linkedHashMap.put("upLoadServer", u(context, "upLoadServer" + strC));
        LinkedHashMap<String, String> linkedHashMap2 = new LinkedHashMap<>(16);
        linkedHashMap2.put("electronicAll", linkedHashMap.toString());
        linkedHashMap2.put("summaryType", str2);
        DeviceInfo deviceInfoB = b(str);
        if (deviceInfoB != null) {
            linkedHashMap2.put("deviceModel", deviceInfoB.getDeviceModel());
        }
        LogUtil.a("UpdateUtil", "upElecCardOpAnalytics map = ", linkedHashMap2.toString());
        OpAnalyticsUtil.getInstance().setEvent(OperationKey.ELECTRONIC_CARD_PROCESS_80070012.value(), linkedHashMap2);
        if (bool.booleanValue()) {
            n(context, "recElectronic" + strC, "");
            n(context, "saveElectronic" + strC, "");
            n(context, w9.o + strC, "");
            n(context, "checkElectronic" + strC, "");
            n(context, "hotaElectronic" + strC, "");
            n(context, "upLoadServer" + strC, "");
        }
    }

    public static DeviceInfo b(String str) {
        HwGetDevicesParameter hwGetDevicesParameter = new HwGetDevicesParameter();
        hwGetDevicesParameter.setDeviceIdentify(str);
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.IDENTIFY_DEVICES, hwGetDevicesParameter, "UpdateUtil");
        if (njy.e(deviceList)) {
            return null;
        }
        return deviceList.get(0);
    }

    private static boolean l(String str) {
        String strC = nio.c(str);
        return "true".equals(u(BaseApplication.getContext(), "recElectronic" + strC));
    }

    public static boolean d(String str, int i) {
        Date dateC;
        LogUtil.a("UpdateUtil", "isAlreadyUpdated : lastTime = ", str, ",deviceType = ", Integer.valueOf(i));
        if (TextUtils.isEmpty(str) || (dateC = c(str)) == null) {
            return false;
        }
        long time = dateC.getTime();
        LogUtil.a("UpdateUtil", "isAlreadyUpdated last = ", Long.valueOf(time));
        if (CommonUtil.ap() && TextUtils.equals(i(BaseApplication.getContext()), "test_mode")) {
            LogUtil.a("UpdateUtil", "isAlreadyUpdated return 2 hours ");
            return Math.abs(System.currentTimeMillis() - time) <= AiCoreSdkConstant.CHECK_SUPPORT_INTERVAL;
        }
        if (b(i) || HwVersionManager.b(BaseApplication.getContext()).h()) {
            return Math.abs(System.currentTimeMillis() - time) <= 86400000;
        }
        if (CommonUtil.ap()) {
            return Math.abs(System.currentTimeMillis() - time) <= 86400000;
        }
        return Math.abs(System.currentTimeMillis() - time) <= 259200000;
    }

    public static boolean a(String str) {
        Date dateC;
        LogUtil.a("UpdateUtil", "isAlreadyAutoDownload: lastTime", str);
        if (TextUtils.isEmpty(str) || (dateC = c(str)) == null) {
            return false;
        }
        long time = dateC.getTime();
        LogUtil.a("UpdateUtil", "isAlreadyAutoDownload: System.currentTimeMillis() ", Long.valueOf(System.currentTimeMillis()), " last ", Long.valueOf(time));
        return Math.abs(System.currentTimeMillis() - time) <= 86400000;
    }

    public static Date d(String str) {
        try {
            return new SimpleDateFormat("yyyyMMdd").parse(str);
        } catch (ParseException e2) {
            LogUtil.e("UpdateUtil", "getDateTime ParseException e = ", e2.getMessage());
            return null;
        }
    }

    public static Date c(String str) {
        try {
            return new SimpleDateFormat(HwDrmConstant.TIME_FORMAT).parse(str);
        } catch (ParseException e2) {
            LogUtil.e("UpdateUtil", "getDateTime ParseException e = ", e2.getMessage());
            return null;
        }
    }

    public static String e() {
        try {
            String strO = o(HwDrmConstant.TIME_FORMAT);
            LogUtil.a("UpdateUtil", "getCurrentTimeMinutes: currentTime is ", strO);
            return strO;
        } catch (Exception unused) {
            LogUtil.e("UpdateUtil", "getCurrentTimeMinutes exception");
            return "";
        }
    }

    public static String b() {
        try {
            String strO = o("yyyyMMdd");
            LogUtil.a("UpdateUtil", "getCurrentTime: currentTime = ", strO);
            return strO;
        } catch (Exception unused) {
            LogUtil.e("UpdateUtil", "getCurrentTime Exception");
            return null;
        }
    }

    private static String o(String str) {
        return new SimpleDateFormat(str, Locale.ENGLISH).format(Calendar.getInstance().getTime());
    }

    public static String b(Context context, String str) {
        String str2 = "update_key_band_auto_check_time";
        if (!TextUtils.isEmpty(str)) {
            str2 = nio.c(str) + "update_key_band_auto_check_time";
        }
        String strU = u(context, str2);
        LogUtil.a("UpdateUtil", "getBandAutoCheckTime, autoCheckTime ", strU);
        return strU;
    }

    public static void r(Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        LogUtil.a("UpdateUtil", "setRegisterLocationTime, time ", Long.valueOf(jCurrentTimeMillis));
        n(context, "update_key_register_location_time", String.valueOf(jCurrentTimeMillis));
    }

    private static String s(Context context) {
        String strU = u(context, "update_key_register_location_time");
        LogUtil.a("UpdateUtil", "getRegisterLocationTime, lastTime ", strU);
        return strU;
    }

    public static boolean i() {
        String strS = s(BaseApplication.getContext());
        if (TextUtils.isEmpty(strS)) {
            return true;
        }
        LogUtil.a("UpdateUtil", "isRegisterLocationDuration lastTime ", strS, ",currentTimeMillis ", Long.valueOf(System.currentTimeMillis()));
        return Math.abs(System.currentTimeMillis() - CommonUtil.i(strS)) > Constants.ANALYSIS_EVENT_KEEP_TIME;
    }

    public static boolean f(String str) {
        long jA = a(str, BaseApplication.getContext());
        LogUtil.a("UpdateUtil", "isSameDayUploadElecCard lastTime ", Long.valueOf(jA), ",currentTimeMillis ", Long.valueOf(System.currentTimeMillis()));
        return lsl.c(jA, System.currentTimeMillis());
    }

    public static void c(long j, String str, Context context) {
        String str2 = "update_key_electronic_card_upload_time";
        if (!TextUtils.isEmpty(str)) {
            str2 = nio.c(str) + "update_key_electronic_card_upload_time";
        }
        LogUtil.a("UpdateUtil", "setElecCardUploadTime, key ", str2, " time ", Long.valueOf(j));
        n(context, str2, String.valueOf(j));
    }

    public static long a(String str, Context context) {
        String str2 = "update_key_electronic_card_upload_time";
        if (!TextUtils.isEmpty(str)) {
            str2 = nio.c(str) + "update_key_electronic_card_upload_time";
        }
        String strU = u(context, str2);
        LogUtil.a("UpdateUtil", "getElecCardUploadTime, key ", str2, " time ", strU);
        return lsk.b(strU);
    }

    public static void b(long j, String str, Context context) {
        String str2 = "update_key_psi_upload_time";
        if (!TextUtils.isEmpty(str)) {
            str2 = nio.c(str) + "update_key_psi_upload_time";
        }
        LogUtil.a("UpdateUtil", "setPsiUploadTime, key ", str2, " time ", Long.valueOf(j));
        n(context, str2, String.valueOf(j));
    }

    public static long d(String str, Context context) {
        String str2 = "update_key_psi_upload_time";
        if (!TextUtils.isEmpty(str)) {
            str2 = nio.c(str) + "update_key_psi_upload_time";
        }
        String strU = u(context, str2);
        LogUtil.a("UpdateUtil", "getPsiUploadTime, key ", str2, " time ", strU);
        return lsk.b(strU);
    }

    public static void b(int i, String str, Context context) {
        String str2 = "update_key_psi_upload_fail_count";
        if (!TextUtils.isEmpty(str)) {
            str2 = nio.c(str) + "update_key_psi_upload_fail_count";
        }
        LogUtil.a("UpdateUtil", "setPsiUploadFailCount, key ", str2, " count ", Integer.valueOf(i));
        n(context, str2, String.valueOf(i));
    }

    public static int e(String str, Context context) {
        String str2 = "update_key_psi_upload_fail_count";
        if (!TextUtils.isEmpty(str)) {
            str2 = nio.c(str) + "update_key_psi_upload_fail_count";
        }
        String strU = u(context, str2);
        LogUtil.a("UpdateUtil", "getPsiUploadFailCount, key ", str2, " count ", strU);
        return lsk.a(strU, 10);
    }

    public static void c(int i, String str, Context context) {
        String str2 = "update_key_psi_upload_count";
        if (!TextUtils.isEmpty(str)) {
            str2 = nio.c(str) + "update_key_psi_upload_count";
        }
        LogUtil.a("UpdateUtil", "setPsiUploadCount, key ", str2, " count ", Integer.valueOf(i));
        n(context, str2, String.valueOf(i));
    }

    public static int b(String str, Context context) {
        String str2 = "update_key_psi_upload_count";
        if (!TextUtils.isEmpty(str)) {
            str2 = nio.c(str) + "update_key_psi_upload_count";
        }
        String strU = u(context, str2);
        LogUtil.a("UpdateUtil", "getPsiUploadCount, key ", str2, " count ", strU);
        return lsk.a(strU, 10);
    }

    public static void b(String str, String str2, Context context) {
        LogUtil.a("UpdateUtil", "setBandAutoCheckTime, time ", str);
        String str3 = "update_key_band_auto_check_time";
        if (!TextUtils.isEmpty(str2)) {
            str3 = nio.c(str2) + "update_key_band_auto_check_time";
        }
        n(context, str3, str);
    }

    public static void o(String str, Context context) {
        LogUtil.a("UpdateUtil", "setDeviceNewVersion, newVersion ", str);
        n(context, "update_key_band_auto_new_version", str);
    }

    public static String j(Context context) {
        String strI = i(context, "", "");
        LogUtil.a("UpdateUtil", "getDeviceNewSize, size ", strI);
        return strI;
    }

    public static int h(Context context, String str, String str2) {
        String string = "update_key_band_auto_new_size_int";
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(nio.c(str + str2));
            sb.append("update_key_band_auto_new_size_int");
            string = sb.toString();
        }
        int iA = lsk.a(u(context, string), 10);
        LogUtil.a("UpdateUtil", "getDeviceNewSize, size ", Integer.valueOf(iA), " key ", CommonUtil.n(string));
        return iA;
    }

    public static String i(Context context, String str, String str2) {
        String string = "update_key_band_auto_new_size";
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(nio.c(str + str2));
            sb.append("update_key_band_auto_new_size");
            string = sb.toString();
        }
        String strU = u(context, string);
        LogUtil.a("UpdateUtil", "getDeviceNewSize, size ", strU, " key ", CommonUtil.n(string));
        return strU;
    }

    public static void n(String str, Context context) {
        LogUtil.a("UpdateUtil", "setDeviceNewSize, size ", str);
        j(str, context, "", "");
    }

    public static String g(Context context, String str, String str2) {
        String string = "update_key_band_auto_new_origin_size";
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(nio.c(str + str2));
            sb.append("update_key_band_auto_new_origin_size");
            string = sb.toString();
        }
        String strU = u(context, string);
        LogUtil.a("UpdateUtil", "getDeviceNewSize, size ", strU, " key ", CommonUtil.n(string));
        return strU;
    }

    public static void j(String str, Context context) {
        LogUtil.a("UpdateUtil", "setDeviceNewSize, size ", str);
        a(str, context, "", "");
    }

    public static void j(String str, Context context, String str2, String str3) {
        String string = "update_key_band_auto_new_size";
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            StringBuilder sb = new StringBuilder();
            sb.append(nio.c(str2 + str3));
            sb.append("update_key_band_auto_new_size");
            string = sb.toString();
        }
        LogUtil.a("UpdateUtil", "setDeviceNewSize, size ", str, " key ", CommonUtil.n(string));
        n(context, string, str);
    }

    public static void a(String str, Context context, String str2, String str3) {
        String string = "update_key_band_auto_new_origin_size";
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            StringBuilder sb = new StringBuilder();
            sb.append(nio.c(str2 + str3));
            sb.append("update_key_band_auto_new_origin_size");
            string = sb.toString();
        }
        LogUtil.a("UpdateUtil", "setDeviceNewSize, size ", str, " key ", CommonUtil.n(string));
        n(context, string, str);
    }

    public static void c(int i, Context context, String str, String str2) {
        String string = "update_key_band_auto_new_size_int";
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(nio.c(str + str2));
            sb.append("update_key_band_auto_new_size_int");
            string = sb.toString();
        }
        LogUtil.a("UpdateUtil", "setDeviceNewSize, size ", Integer.valueOf(i), " key ", CommonUtil.n(string));
        n(context, string, String.valueOf(i));
    }

    public static String b(Context context, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(nio.c(str + str2));
        sb.append("update_key_band_auto_new_content");
        sb.append(h());
        String string = sb.toString();
        String strU = u(context, string);
        LogUtil.a("UpdateUtil", "getDeviceNewSize, content ", strU, " key ", string);
        return strU;
    }

    public static void b(String str, Context context, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(nio.c(str2 + str3));
        sb.append("update_key_band_auto_new_content");
        sb.append(h());
        String string = sb.toString();
        LogUtil.a("UpdateUtil", "setDeviceNewSize, content ", str, " key ", string);
        n(context, string, str);
    }

    public static String d(Context context, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(nio.c(str + str2));
        sb.append("update_key_band_auto_new_size");
        sb.append(h());
        String string = sb.toString();
        String strU = u(context, string);
        LogUtil.a("UpdateUtil", "getDeviceNewSize, size ", strU, " key ", string);
        return strU;
    }

    public static void c(String str, Context context, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(nio.c(str2 + str3));
        sb.append("update_key_band_auto_new_size");
        sb.append(h());
        String string = sb.toString();
        LogUtil.a("UpdateUtil", "setDeviceNewSize, size ", str, " key ", string);
        n(context, string, str);
    }

    public static String a(Context context, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(nio.c(str + str2));
        sb.append("update_key_band_auto_new_origin_size");
        sb.append(h());
        String string = sb.toString();
        String strU = u(context, string);
        LogUtil.a("UpdateUtil", "getDeviceNewSize, size ", strU, " key ", string);
        return strU;
    }

    public static void d(String str, Context context, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(nio.c(str2 + str3));
        sb.append("update_key_band_auto_new_origin_size");
        sb.append(h());
        String string = sb.toString();
        LogUtil.a("UpdateUtil", "setDeviceNewSize, size ", str, " key ", string);
        n(context, string, str);
    }

    public static String h() {
        String strB = pjn.b(null);
        return strB == null ? "" : strB.toLowerCase(Locale.ENGLISH);
    }

    public static String g() {
        Configuration configuration = BaseApplication.getContext().getResources().getConfiguration();
        String strB = LanguageUtil.b(BaseApplication.getContext());
        String country = configuration.locale.getCountry();
        String script = Locale.getDefault().getScript();
        String str = strB + '-' + country;
        if (!MLAsrConstants.LAN_ZH.equals(strB)) {
            return str;
        }
        if ("Hans".equals(script) || (TextUtils.isEmpty(script) && "zh-CN".equals(str))) {
            return "zh-CN";
        }
        if ("zh-HK".equals(str)) {
            return "zh-HK";
        }
        return "zh-TW";
    }

    public static String f(Context context) {
        String strC = c(context, "", "");
        LogUtil.a("UpdateUtil", "getDeviceNewContent, content ", strC);
        return strC;
    }

    public static String c(Context context, String str, String str2) {
        String string = "update_key_band_auto_new_content";
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(nio.c(str + str2));
            sb.append("update_key_band_auto_new_content");
            string = sb.toString();
        }
        String strU = u(context, string);
        LogUtil.a("UpdateUtil", "getDeviceNewContent, content ", strU, " key ", CommonUtil.n(string));
        return strU;
    }

    public static void f(String str, Context context) {
        LogUtil.a("UpdateUtil", "setDeviceNewContent, content ", str);
        e(str, context, "", "");
    }

    public static void e(String str, Context context, String str2, String str3) {
        String string = "update_key_band_auto_new_content";
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            StringBuilder sb = new StringBuilder();
            sb.append(nio.c(str2 + str3));
            sb.append("update_key_band_auto_new_content");
            string = sb.toString();
        }
        LogUtil.a("UpdateUtil", "setDeviceNewContent, content ", str, " key ", CommonUtil.n(string));
        n(context, string, n(e(str)));
    }

    public static String e(String str) {
        int iIndexOf;
        LogUtil.a("UpdateUtil", "getDeviceUpdateLog updateLog = ", str);
        if (TextUtils.isEmpty(str) || (iIndexOf = str.indexOf(System.lineSeparator(), System.lineSeparator().length())) < 0) {
            return "";
        }
        return str.substring(iIndexOf + System.lineSeparator().length());
    }

    public static void q(Context context) {
        String strO = "";
        try {
            strO = o("yyyyMMddHH");
            LogUtil.a("UpdateUtil", "setBandAutoCheckTimeLater: time = ", strO);
        } catch (Exception unused) {
            LogUtil.e("UpdateUtil", "setBandAutoCheckTimeLater Exception");
        }
        n(context, "update_key_band_new_version_later", strO);
    }

    public static void a(Context context) {
        n(context, "update_key_band_new_version_later", "");
    }

    public static void g(String str, Context context) {
        LogUtil.a("UpdateUtil", "setAppCheckNewVersionCode, versionCode ", str);
        n(context, "update_key_app_new_version_code", str);
    }

    public static String d(Context context) {
        String strU = u(context, "update_key_app_new_version_code");
        LogUtil.a("UpdateUtil", "getAppCheckNewVersionCode, versionCode ", strU);
        return strU;
    }

    public static void i(String str, Context context) {
        LogUtil.a("UpdateUtil", "setAppCheckNewVersionCode, versionCode ", str);
        n(context, "update_key_app_new_version_name", str);
    }

    public static String b(Context context) {
        String strU = u(context, "update_key_app_new_version_name");
        LogUtil.a("UpdateUtil", "getAppCheckNewVersionCode, versionName ", strU);
        return strU;
    }

    public static String e(Context context) {
        String strU = u(context, "update_key_app_store_path");
        LogUtil.a("UpdateUtil", "getAppStorePath, storePath ", strU);
        return strU;
    }

    public static void h(String str, Context context) {
        LogUtil.a("UpdateUtil", "setAppStorePath, storePath ", str);
        n(context, "update_key_app_store_path", str);
    }

    public static void d(String str, String str2, Context context) {
        LogUtil.a("UpdateUtil", "setBandCheckEnterpriseID, enterpriseId ", CommonUtil.n(str));
        n(context, nio.e(str2) + "update_key_band_enterprise_id", str);
    }

    public static String d(Context context, String str) {
        String strU = u(context, nio.e(str) + "update_key_band_enterprise_id");
        LogUtil.a("UpdateUtil", "getBandCheckEnterpriseID, enterpriseId ", CommonUtil.n(strU));
        return strU;
    }

    public static void h(String str, String str2, Context context) {
        LogUtil.a("UpdateUtil", "setBandOsNewVersion, version ", str);
        n(context, nio.e(str2) + "update_key_band_os_new_version", str);
    }

    public static String n(Context context, String str) {
        String strU = u(context, nio.e(str) + "update_key_band_os_new_version");
        LogUtil.a("UpdateUtil", "getBandOsNewVersion, version ", strU);
        return strU;
    }

    public static void a(String str, String str2, Context context) {
        LogUtil.a("UpdateUtil", "setBandCheckNewVersion, version ", str);
        n(context, nio.e(str2) + "update_key_band_new_version", str);
    }

    public static String i(Context context, String str) {
        String strU = u(context, nio.e(str) + "update_key_band_new_version");
        LogUtil.a("UpdateUtil", "getBandCheckNewVersion, version ", strU);
        return strU;
    }

    public static void e(String str, String str2, Context context) {
        LogUtil.a("UpdateUtil", "setBandCheckVersionType, versionType ", str);
        n(context, nio.e(str2) + "update_key_band_version_type", str);
    }

    public static String j(Context context, String str) {
        String strU = u(context, nio.e(str) + "update_key_band_version_type");
        LogUtil.a("UpdateUtil", "getBandCheckVersionType, versionType ", strU);
        return strU;
    }

    public static void i(String str, String str2, Context context) {
        LogUtil.a("UpdateUtil", "setBandEnterpriseAgreeing, agreeing ", str);
        n(context, nio.e(str2) + "update_key_band_enterprise_agreeing", str);
    }

    public static String g(Context context, String str) {
        String strU = u(context, nio.e(str) + "update_key_band_enterprise_agreeing");
        LogUtil.a("UpdateUtil", "getBandEnterpriseAgreeing, agreeing ", strU);
        return strU;
    }

    public static void d(String str, String str2, String str3, Context context) {
        String str4 = nio.e(str) + "update_key_band_byte_size" + str3;
        LogUtil.a("UpdateUtil", "setBandByteSize, bandByteSize ", str2, " key ", str4);
        n(context, str4, str2);
    }

    public static String e(Context context, String str, String str2) {
        String str3 = nio.e(str) + "update_key_band_byte_size" + str2;
        String strU = u(context, str3);
        LogUtil.a("UpdateUtil", "getBandByteSize, bandByteSize ", strU, " key ", str3);
        return strU;
    }

    public static void e(Context context, boolean z) {
        LogUtil.a("UpdateUtil", "setUpdateShowing, isShowing ", String.valueOf(z), " key ", "update_key_is_update_showing");
        n(context, "update_key_is_update_showing", String.valueOf(z));
    }

    public static boolean o(Context context) {
        String strU = u(context, "update_key_is_update_showing");
        LogUtil.a("UpdateUtil", "isUpdateShowing, isShowing ", strU, " key ", "update_key_is_update_showing");
        return Boolean.parseBoolean(strU);
    }

    public static void c(String str, String str2, Context context) {
        LogUtil.a("UpdateUtil", "setBandCheckNewVersion, versionId:", str);
        n(context, nio.c(str2) + "update_key_band_new_version_id", str);
    }

    public static String h(Context context, String str) {
        String strU = u(context, nio.c(str) + "update_key_band_new_version_id");
        LogUtil.a("UpdateUtil", "setBandCheckNewVersion, versionId:", strU);
        return strU;
    }

    public static void f(String str, String str2, Context context) {
        LogUtil.a("UpdateUtil", "setBandLastVersionCode, lastVersionCode ", str2);
        n(context, nio.c(str) + "update_key_band_last_version_code", str2);
    }

    public static String m(Context context, String str) {
        String strU = u(context, nio.e(str) + "update_key_band_store_path");
        LogUtil.a("UpdateUtil", "getBandStorePath, storePath ", strU);
        return strU;
    }

    public static void j(String str, String str2, Context context) {
        LogUtil.a("UpdateUtil", "setBandStorePath, storePath ", str2);
        n(context, nio.e(str) + "update_key_band_store_path", str2);
    }

    public static String f(Context context, String str) {
        String strU = u(context, nio.e(str) + "update_key_band_device_version");
        LogUtil.a("UpdateUtil", "getBandDeviceVersion, version ", strU);
        return strU;
    }

    public static void g(String str, String str2, Context context) {
        LogUtil.a("UpdateUtil", "setBandDeviceVersion, version ", str2);
        n(context, nio.e(str) + "update_key_band_device_version", str2);
    }

    public static String k(Context context) {
        String strU = u(context, "update_key_ota_device_support");
        LogUtil.a("UpdateUtil", "getOtaVersionSupport, otaVersion ", strU);
        return strU;
    }

    public static void k(String str, Context context) {
        LogUtil.a("UpdateUtil", "setOtaVersionSupport, otaVersion ", str);
        n(context, "update_key_ota_device_support", str);
    }

    public static String c(String str, Context context) {
        String str2 = nio.e(str) + "update_key_band_device_package_name";
        String strU = u(context, str2);
        LogUtil.a("UpdateUtil", "getDeviceOtaPackageName, packageName ", strU, " key ", str2);
        return strU;
    }

    public static void k(String str, String str2, Context context) {
        String str3 = nio.e(str) + "update_key_band_device_package_name";
        LogUtil.a("UpdateUtil", "setDeviceOtaPackageName, packageName ", str2, " key ", str3);
        n(context, str3, str2);
    }

    public static void a(Context context, String str) {
        String strM = m(context, str);
        LogUtil.a("UpdateUtil", "deleteUpdateDfu: path = ", strM);
        String strU = u(context, nio.e(str) + "save_upgrade_package");
        if (CommonUtil.ap() && "true".equals(strU)) {
            LogUtil.j("UpdateUtil", "deleteUpdateDfu: SavePackageSwitch is open do not delete");
            return;
        }
        if (TextUtils.isEmpty(strM)) {
            return;
        }
        File file = new File(strM);
        if (!file.exists() || file.delete()) {
            return;
        }
        LogUtil.e("UpdateUtil", "deleteUpdateDfu: path = ", strM, " failed!");
    }

    public static void b(Context context, boolean z) {
        LogUtil.a("UpdateUtil", "setHaveNewBandVersion, haveNewVersion ", Boolean.valueOf(z));
        n(context, "update_key_band_new_version_tip", "" + z);
    }

    public static void c(boolean z) {
        LogUtil.a("UpdateUtil", "setBandOtaStatus, isOta ", Boolean.valueOf(z));
        e = z;
    }

    public static boolean h(Context context) {
        LogUtil.a("UpdateUtil", "getBandOtaStatus, mTransfer ", Boolean.valueOf(e));
        return e;
    }

    public static void g(String str) {
        f43789a = str;
    }

    public static String d() {
        return f43789a;
    }

    public static void h(String str) {
        d = str;
    }

    public static String c() {
        return d;
    }

    public static void e(Context context, num numVar, String str) {
        if (numVar != null) {
            LogUtil.a("UpdateUtil", "saveDownloadInfo, applicationInfo:", numVar.toString());
            String strC = nio.c(str);
            n(context, "update_key_band_download_spath" + strC, numVar.t());
            n(context, "update_key_band_download_byteSize" + strC, String.valueOf(numVar.b()));
            n(context, "update_key_band_download_md5" + strC, numVar.h());
            n(context, "update_key_band_download_sha256" + strC, numVar.r());
            n(context, "update_key_band_download_downloadurl" + strC, numVar.j());
            n(context, "update_key_band_download_macorsn" + strC, str);
            n(context, "update_key_band_download_versionname" + strC, numVar.y());
            n(context, "update_key_band_download_version_id" + strC, numVar.w());
        }
    }

    public static num l(Context context, String str) {
        String strC = nio.c(str);
        num numVar = new num();
        try {
            numVar.k(u(context, "update_key_band_download_spath" + strC));
            numVar.b(Long.parseLong(u(context, "update_key_band_download_byteSize" + strC)));
            numVar.j(u(context, "update_key_band_download_md5" + strC));
            numVar.l(u(context, "update_key_band_download_sha256" + strC));
            numVar.a(u(context, "update_key_band_download_downloadurl" + strC));
            numVar.q(u(context, "update_key_band_download_versionname" + strC));
            numVar.r(u(context, "update_key_band_download_version_id" + strC));
        } catch (NumberFormatException e2) {
            LogUtil.e("UpdateUtil", "getDownloadInfo NumberFormatException ", e2.getMessage());
        }
        LogUtil.a("UpdateUtil", "getDownloadInfo, applicationInfo:", numVar.toString());
        return numVar;
    }

    public static void r(Context context, String str) {
        String strC = nio.c(str);
        LogUtil.a("UpdateUtil", "setBandCheckBindTime: timekey ", CommonUtil.n(strC));
        String strU = u(context, strC);
        if (!TextUtils.isEmpty(strU)) {
            LogUtil.j("UpdateUtil", "setBandCheckBindTime: time existent ", strU);
            return;
        }
        try {
            String strO = o("yyyyMMddHH");
            LogUtil.a("UpdateUtil", "setBandCheckBindTime: time ", strO);
            n(context, strC, strO);
        } catch (Exception unused) {
            LogUtil.e("UpdateUtil", "setBandCheckBindTime Exception");
        }
    }

    private static String v(Context context, String str) {
        String strC = nio.c(str);
        String strU = u(context, strC);
        LogUtil.a("UpdateUtil", "getBandCheckBindTime, bindTime ", strU, " ,key ", CommonUtil.n(strC));
        return strU;
    }

    public static boolean j(String str) {
        String strV = v(BaseApplication.getContext(), str);
        if (TextUtils.isEmpty(strV)) {
            return true;
        }
        LogUtil.a("UpdateUtil", "isBandCheckBindingDuring bindTime ", strV);
        try {
            Date date = new SimpleDateFormat("yyyyMMddHH").parse(strV);
            LogUtil.a("UpdateUtil", "isBandCheckBindingDuring bindDate.getTime() ", Long.valueOf(date.getTime()), ",currentTimeMillis ", Long.valueOf(System.currentTimeMillis()));
            return Math.abs(System.currentTimeMillis() - date.getTime()) < 2592000000L;
        } catch (ParseException unused) {
            LogUtil.e("UpdateUtil", "isBandCheckBindingDuring Exception e");
        }
    }

    public static void b(Context context, DeviceInfo deviceInfo) {
        if (Utils.o()) {
            LogUtil.j("UpdateUtil", "setDeviceIdentify version is oversea");
            return;
        }
        if (context == null || deviceInfo == null) {
            LogUtil.j("UpdateUtil", "setDeviceIdentify context or deviceInfo is null");
            return;
        }
        String str = nio.c(deviceInfo.getSecurityDeviceId()) + "update_key_band_identify_mac";
        LogUtil.a("UpdateUtil", "setDeviceIdentify key: ", CommonUtil.n(str));
        if (!TextUtils.isEmpty(u(context, str))) {
            LogUtil.a("UpdateUtil", "setDeviceIdentify has exist");
            return;
        }
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        if (TextUtils.isEmpty(deviceIdentify)) {
            return;
        }
        n(context, str, eeq.e(WhiteBoxManager.b().e(deviceIdentify)));
    }

    public static String k(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.j("UpdateUtil", "getDeviceIdentify context or deviceSn is null");
            return "";
        }
        String str2 = nio.c(str) + "update_key_band_identify_mac";
        LogUtil.a("UpdateUtil", "getDeviceIdentify key: ", CommonUtil.n(str2));
        String strU = u(context, str2);
        if (TextUtils.isEmpty(strU)) {
            LogUtil.j("UpdateUtil", "getDeviceIdentify encryptDeviceIdentify is null");
            return "";
        }
        byte[] bArrA = WhiteBoxManager.b().a(eeq.c(strU));
        if (bArrA == null || bArrA.length == 0) {
            LogUtil.j("UpdateUtil", "getDeviceIdentify deviceIdentifyBytes is null");
            return "";
        }
        try {
            return new String(bArrA, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            LogUtil.j("UpdateUtil", "getDeviceIdentify UnsupportedEncodingException");
            return "";
        }
    }

    public static void c(Context context, DeviceInfo deviceInfo) {
        String str = nio.c(deviceInfo.getSecurityDeviceId()) + "update_key_band_check_address";
        String strU = u(context, str);
        LogUtil.a("UpdateUtil", "setPhdDeviceUdid key ", CommonUtil.n(str));
        if (TextUtils.isEmpty(strU)) {
            n(context, str, e(deviceInfo));
        }
    }

    private static String e(DeviceInfo deviceInfo) {
        String strReplace;
        if (deviceInfo == null) {
            return "";
        }
        if (Utils.o() || deviceInfo.getDeviceIdType() == 1) {
            strReplace = nio.e(deviceInfo.getSecurityDeviceId()).replace(Marker.ANY_NON_NULL_MARKER, "A").replace("=", "A").replace("/", "A");
            if (strReplace.length() >= 24) {
                strReplace = strReplace.substring(0, 24);
            }
        } else {
            strReplace = deviceInfo.getDeviceIdentify();
        }
        return deviceInfo.getProductType() < 58 ? strReplace : b(deviceInfo);
    }

    private static String b(DeviceInfo deviceInfo) {
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        if (!TextUtils.isEmpty(deviceIdentify)) {
            deviceIdentify = deviceIdentify.toUpperCase(Locale.ENGLISH).replace(":", "");
        }
        String securityDeviceId = deviceInfo.getSecurityDeviceId();
        if (!TextUtils.isEmpty(securityDeviceId)) {
            securityDeviceId = securityDeviceId.toUpperCase(Locale.ENGLISH).replace(":", "");
        }
        if (deviceIdentify != null && deviceIdentify.equals(securityDeviceId)) {
            return nio.c(deviceIdentify);
        }
        return nio.c(securityDeviceId + deviceIdentify);
    }

    public static String o(Context context, String str) {
        String str2 = nio.c(str) + "update_key_band_check_address";
        String strU = u(context, str2);
        LogUtil.a("UpdateUtil", "getPhdDeviceUdid key ", CommonUtil.n(str2));
        return strU;
    }

    public static void t(Context context, String str) {
        LogUtil.a("UpdateUtil", "resetBandUpdate");
        b(context, false);
        b("", str, context);
        h("", str, context);
        a("", str, context);
        c("", str, context);
        f(str, "", context);
        e(context, new num(), "");
        a(context);
        k("", context);
    }

    public static boolean i(String str) {
        int iIndexOf;
        if (TextUtils.isEmpty(str) || (iIndexOf = str.indexOf(":")) < 0) {
            return false;
        }
        String strSubstring = str.substring(0, iIndexOf);
        LogUtil.a("UpdateUtil", "isHttpProtocol protocol:", strSubstring);
        return "http".equalsIgnoreCase(strSubstring);
    }

    private static boolean b(int i) {
        switch (i) {
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 24:
                long jCurrentTimeMillis = System.currentTimeMillis();
                HashMap<Integer, Long> map = f43791c;
                String string = map.get(Integer.valueOf(i)).toString();
                HashMap<Integer, Long> map2 = f43790b;
                LogUtil.a("UpdateUtil", "DEVICE_SUPPORT_START = ", string, ",time = ", Long.valueOf(jCurrentTimeMillis), ",DEVICE_SUPPORT_END = ", map2.get(Integer.valueOf(i)).toString());
                return Long.parseLong(map.get(Integer.valueOf(i)).toString()) <= jCurrentTimeMillis && Long.parseLong(map2.get(Integer.valueOf(i)).toString()) >= jCurrentTimeMillis;
            case 22:
            default:
                return eev.e(i);
        }
    }

    public static void y(Context context, String str) {
        LogUtil.a("UpdateUtil", "setBandLocationInfo");
        m(context, "update_key_psi_upload_location", str);
    }

    public static String l(Context context) {
        return u(context, "update_key_psi_upload_location");
    }

    public static void w(Context context, String str) {
        LogUtil.a("UpdateUtil", "setBandLocationInfo");
        m(context, "update_key_ota_device_upload_location", str);
    }

    public static String g(Context context) {
        return u(context, "update_key_ota_device_upload_location");
    }

    public static String p(Context context, String str) {
        String strO = o(context, str);
        String strValueOf = String.valueOf(CommonUtil.e(context));
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(strO)) {
                jSONObject.put("phdDeviceUdid", strO);
            }
            if (!TextUtils.isEmpty(strValueOf)) {
                jSONObject.put("appVersion", strValueOf);
            }
        } catch (JSONException unused) {
            LogUtil.e("UpdateUtil", "getPhdDeviceUdidAndAppVersion JSONException");
        }
        return jSONObject.toString();
    }

    public static String a(Context context, String str, boolean z) {
        String strG;
        if (z) {
            strG = "";
        } else {
            strG = g(context);
        }
        String strO = o(context, str);
        String strValueOf = String.valueOf(CommonUtil.e(context));
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(strG)) {
                jSONObject = new JSONObject(strG);
            }
            if (!TextUtils.isEmpty(strO)) {
                jSONObject.put("phdDeviceUdid", strO);
            }
            if (!TextUtils.isEmpty(strValueOf)) {
                jSONObject.put("appVersion", strValueOf);
            }
        } catch (JSONException unused) {
            LogUtil.e("UpdateUtil", "setBandCheckNewVersionAndUploadLocation JSONException");
        }
        return jSONObject.toString();
    }

    public static String i(Context context) {
        String strU = u(context, "update_key_band_check_url");
        LogUtil.a("UpdateUtil", "getCheckUrlMode value:", strU);
        return strU;
    }

    public static String m(Context context) {
        DeviceInfo deviceInfoF = f();
        if (deviceInfoF == null) {
            LogUtil.j("UpdateUtil", "getSaveUpgradePackageMode deviceInfo == null");
            return "";
        }
        String strU = u(context, nio.e(deviceInfoF.getDeviceIdentify()) + "save_upgrade_package");
        LogUtil.a("UpdateUtil", "getSaveUpgradePackageMode value = ", strU);
        return strU;
    }

    public static List<String> n(Context context) {
        DeviceInfo deviceInfoF = f();
        if (deviceInfoF == null) {
            LogUtil.j("UpdateUtil", "getLoopUpgradePackagePaths deviceInfo == null");
            return new ArrayList();
        }
        String strU = u(context, nio.e(deviceInfoF.getDeviceIdentify()) + "loop_upgrade_package_path_list");
        LogUtil.a("UpdateUtil", "getLoopUpgradePackagePaths: ", strU);
        if (TextUtils.isEmpty(strU)) {
            return new ArrayList();
        }
        return new ArrayList(Arrays.asList(strU.split(",")));
    }

    public static void e(List<String> list, Context context) {
        if (list == null) {
            LogUtil.j("UpdateUtil", "setLoopUpgradePackagePaths paths == null");
            return;
        }
        DeviceInfo deviceInfoF = f();
        if (deviceInfoF == null) {
            LogUtil.j("UpdateUtil", "setLoopUpgradePackagePaths deviceInfo == null");
            return;
        }
        String str = nio.e(deviceInfoF.getDeviceIdentify()) + "loop_upgrade_package_path_list";
        String strJoin = String.join(",", list);
        n(context, str, strJoin);
        LogUtil.a("UpdateUtil", "setLoopUpgradePackagePaths: ", strJoin);
    }

    private static DeviceInfo f() {
        if (EnvironmentUtils.e()) {
            List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "UpdateUtil");
            if (njy.e(deviceList)) {
                return null;
            }
            return deviceList.get(0);
        }
        return ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "UpdateUtil");
    }

    public static void c(Context context, boolean z) {
        LogUtil.a("UpdateUtil", "setAutoNotRemind isChecked:", Boolean.valueOf(z));
        n(context, "update_key_auto_update_not_remind", String.valueOf(z));
    }

    public static boolean c(Context context) {
        return "true".equals(u(context, "update_key_auto_update_not_remind"));
    }

    private static String u(Context context, String str) {
        return SharedPreferenceManager.e(context, String.valueOf(1003), str);
    }

    private static int n(Context context, String str, String str2) {
        return SharedPreferenceManager.e(context, String.valueOf(1003), str, str2, null);
    }

    private static int m(Context context, String str, String str2) {
        StorageParams storageParams = new StorageParams();
        storageParams.e(1);
        return SharedPreferenceManager.e(context, String.valueOf(1003), str, str2, storageParams);
    }

    public static int a(Context context, String str, String str2, boolean z) {
        String str3 = nio.e(str) + str2;
        int iN = n(context, str3, String.valueOf(z));
        LogUtil.a("UpdateUtil", "saveOtaUpdateState key:", str3, " value:", Boolean.valueOf(z), " result:", Integer.valueOf(iN));
        return iN;
    }

    public static String a() {
        String commonCountryCode = GRSManager.c(BaseApplication.getContext()).getCommonCountryCode();
        String strD = lon.c().d("domain_honor_ota_privacy");
        String strD2 = lon.c().d("domain_honor_country");
        LogUtil.a("UpdateUtil", "countryCode: ", commonCountryCode, "honorUpdateUrl: ", strD, " honorCountrysString: ", strD2);
        if (strD == null || strD2 == null) {
            return null;
        }
        if (!"ALL".equalsIgnoreCase(strD2)) {
            for (String str : strD2.split(",")) {
                if (!str.equalsIgnoreCase(commonCountryCode)) {
                }
            }
            return null;
        }
        return strD;
    }

    public static String e(Context context, String str) {
        String strU = u(context, str);
        LogUtil.a("UpdateUtil", "getAppchangeLogPath, changeLogPath ", strU);
        return strU;
    }

    public static void f(Context context, String str, String str2) {
        LogUtil.a("UpdateUtil", "setAppChangeLogPath, changeLogPath ", str2, "changeLogName", str);
        n(context, str, str2);
    }

    public static String c(Context context, String str) {
        String strU = u(context, str);
        LogUtil.a("UpdateUtil", "getAppChangeLogUri, changeLogPath ", strU);
        return strU;
    }

    public static void j(Context context, String str, String str2) {
        LogUtil.a("UpdateUtil", "setAppChangeLogUri, changeLogUriKey ", str, "changeLogUri", str2);
        n(context, str, str2);
    }

    public static boolean s(Context context, String str) {
        String strJ = j(context, str);
        String strG = g(context, str);
        if (TextUtils.isEmpty(strJ) || strJ.equals("1")) {
            return false;
        }
        return TextUtils.isEmpty(strG) || strG.equals("0");
    }

    public static boolean q(Context context, String str) {
        String strJ = j(context, str);
        String strG = g(context, str);
        if (TextUtils.isEmpty(strJ) || strJ.equals("1")) {
            return true;
        }
        return !TextUtils.isEmpty(strG) && strG.equals("1");
    }

    public static boolean d(DeviceInfo deviceInfo, int i) {
        boolean zD = eey.d(deviceInfo, i);
        LogUtil.a("UpdateUtil", "checkSupportCapability is = ", Boolean.valueOf(zD), " =index= ", Integer.valueOf(i));
        return zD;
    }

    public static boolean a(DeviceInfo deviceInfo) {
        boolean zD = eey.d(deviceInfo, 97);
        LogUtil.a("UpdateUtil", "checkSupportIndustryCustomization is = ", Boolean.valueOf(zD));
        return zD;
    }

    public static boolean j() {
        return LoginInit.KOREA.equals(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010));
    }

    public static void d(DeviceInfo deviceInfo, String str, String str2) {
        if (deviceInfo == null) {
            LogUtil.a("UpdateUtil", "setOtaUpgradeEvent deviceInfo is null");
            return;
        }
        HashMap map = new HashMap();
        map.put("event", str);
        map.put(FunctionSetBeanReader.BI_ELEMENT, str2);
        map.put("device_name", deviceInfo.getDeviceModel());
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.OTA_UPGRADE_H9000003.value(), map, 0);
    }
}
