package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.telephony.HwTelephonyManager;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.utils.GsonUtil;
import com.huawei.hms.ads.dynamic.a;
import com.huawei.hms.network.inner.api.NetworkService;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.datastruct.MachineControlPointResponse;
import com.huawei.multisimservice.model.MultiSimDeviceInfo;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import com.huawei.sim.R;
import com.huawei.sim.multisim.activity.EsimCuccAgreementActivity;
import com.huawei.sim.multisim.activity.EsimOverseaEsActivity;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.unicom.online.account.shield.UniAccountHelper;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.MagicBuild;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes15.dex */
public class pxk {
    private static final int[] h = {85, 91};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f45933b = {"android.permission.READ_PHONE_NUMBERS"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f45932a = {"android.permission.READ_PHONE_STATE"};
    private static final String[] e = {"android.permission.CAMERA", "android.permission.READ_PHONE_NUMBERS"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f45934c = {"android.permission.CAMERA", "android.permission.READ_PHONE_STATE"};
    public static String d = "";
    private static String g = "";
    private static String i = "";

    public static boolean b(int i2) {
        return i2 == 1;
    }

    public static boolean c(int i2) {
        return i2 == 2;
    }

    public static boolean d(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 5) {
            return false;
        }
        return str.startsWith("46000") || str.startsWith("46002") || str.startsWith("46004") || str.startsWith("46007") || str.startsWith("46008") || str.startsWith("46020");
    }

    public static boolean h(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 5) {
            return false;
        }
        return str.startsWith("46001") || str.startsWith("46006") || str.startsWith("46009");
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 5) {
            return false;
        }
        return str.startsWith("46003") || str.startsWith("46005") || str.startsWith("46011") || str.startsWith("46012");
    }

    public static boolean i(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 5) {
            return false;
        }
        return str.startsWith("28601") || str.startsWith("28603") || str.startsWith("28604");
    }

    public static void g(Context context) {
        if (context == null) {
            LogUtil.j("MultiSimUtils", "openNetWorkSettingView context is null");
            return;
        }
        try {
            context.startActivity(new Intent("android.settings.SETTINGS"));
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("MultiSimUtils", "openNetWorkSettingView ActivityNotFoundException");
        }
    }

    public static String[] d() {
        if (Build.VERSION.SDK_INT > 29) {
            return f45933b;
        }
        return f45932a;
    }

    public static List<Map<String, Object>> b(Context context) {
        ArrayList arrayList = new ArrayList(2);
        if (context == null) {
            return arrayList;
        }
        if (!lsg.d(context, d())) {
            LogUtil.j("MultiSimUtils", "getDefaultSimCardInfo missing phonePermission");
            return arrayList;
        }
        List<SubscriptionInfo> activeSubscriptionInfoList = SubscriptionManager.from(context).getActiveSubscriptionInfoList();
        if (activeSubscriptionInfoList == null || activeSubscriptionInfoList.size() == 0) {
            LogUtil.a("MultiSimUtils", "getActiveSimCardInfo can not get subscriptionInfoList");
            return arrayList;
        }
        for (SubscriptionInfo subscriptionInfo : activeSubscriptionInfoList) {
            HashMap map = new HashMap(16);
            String str = subscriptionInfo.getMcc() + "";
            String str2 = subscriptionInfo.getMnc() + "";
            CharSequence carrierName = subscriptionInfo.getCarrierName();
            String string = carrierName != null ? carrierName.toString() : "";
            int simSlotIndex = subscriptionInfo.getSimSlotIndex();
            String number = subscriptionInfo.getNumber();
            if (TextUtils.isEmpty(number) && CommonUtil.bg()) {
                number = d(simSlotIndex);
            }
            map.put("number", number);
            map.put("imsi", c(context, subscriptionInfo.getSubscriptionId()));
            map.put("mccmnc", str + str2);
            map.put("spn", string);
            map.put("slotId", Integer.valueOf(simSlotIndex));
            LogUtil.a("MultiSimUtils", "getActiveSimCardInfo slotId = ", Integer.valueOf(simSlotIndex));
            arrayList.add(map);
        }
        b(arrayList);
        return arrayList;
    }

    private static String d(int i2) {
        String phoneNumberBySlotId;
        try {
            phoneNumberBySlotId = HwTelephonyManager.getDefault().getPhoneNumberBySlotId(i2);
        } catch (NoSuchMethodError unused) {
            LogUtil.j("MultiSimUtils", "HwTelephonyManager NoSuchMethodError");
            phoneNumberBySlotId = "";
        } catch (RuntimeException e2) {
            LogUtil.j("MultiSimUtils", "get phone number runtime exception", ExceptionUtils.c(e2));
            phoneNumberBySlotId = "";
        } catch (Throwable th) {
            LogUtil.j("MultiSimUtils", "get phone number exception:", ExceptionUtils.c(th));
            phoneNumberBySlotId = "";
        }
        return phoneNumberBySlotId == null ? "" : phoneNumberBySlotId;
    }

    private static void b(List<Map<String, Object>> list) {
        Collections.sort(list, new Comparator<Map<String, Object>>() { // from class: pxk.2
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public int compare(Map<String, Object> map, Map<String, Object> map2) {
                Integer num;
                int i2 = 0;
                if (!(map.get("slotId") instanceof Integer)) {
                    num = 0;
                } else {
                    num = (Integer) map.get("slotId");
                }
                if (map2.get("slotId") instanceof Integer) {
                    i2 = (Integer) map2.get("slotId");
                }
                return num.compareTo(i2);
            }
        });
    }

    public static String c(Context context, int i2) {
        if (context == null) {
            LogUtil.j("MultiSimUtils", "context is null");
            return "";
        }
        Object systemService = context.getSystemService("phone");
        if (!(systemService instanceof TelephonyManager)) {
            LogUtil.j("MultiSimUtils", "getImsi telephonyManagerObject is not instanceof TelephonyManager");
            return "";
        }
        try {
            TelephonyManager telephonyManagerCreateForSubscriptionId = ((TelephonyManager) systemService).createForSubscriptionId(i2);
            if (telephonyManagerCreateForSubscriptionId != null) {
                if (!CommonUtil.bg() && !g()) {
                    return telephonyManagerCreateForSubscriptionId.getSimOperator();
                }
                return telephonyManagerCreateForSubscriptionId.getSubscriberId();
            }
        } catch (SecurityException e2) {
            LogUtil.e("MultiSimUtils", e2.getMessage());
        }
        return "";
    }

    public static String c(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.j("MultiSimUtils", "context or imsi is null");
            return "";
        }
        if (d(str)) {
            return context.getResources().getString(R.string.IDS_plugin_multi_esim_provider_cmcc);
        }
        if (h(str)) {
            return context.getResources().getString(R.string.IDS_plugin_multi_esim_provider_cucc);
        }
        if (!a(str)) {
            return "";
        }
        return context.getResources().getString(R.string.IDS_plugin_multi_esim_provider_ctcc);
    }

    public static void d(Context context, String str, String str2) {
        Intent launchIntentForPackage;
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.j("MultiSimUtils", "startAppByPackageName context or imsi is null");
            return;
        }
        try {
            if (d(str)) {
                launchIntentForPackage = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
                launchIntentForPackage.setData(Uri.parse(str2));
            } else if (h(str)) {
                if (TextUtils.isEmpty(str2)) {
                    LogUtil.j("MultiSimUtils", "startAppByPackageName operator is default CUCC");
                    launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.sinovatech.unicom.ui");
                } else {
                    launchIntentForPackage = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
                    launchIntentForPackage.setData(Uri.parse(j(context, str2)));
                }
            } else {
                if (!a(str)) {
                    LogUtil.j("MultiSimUtils", "startAppByPackageName is not operator imsi");
                    return;
                }
                if (TextUtils.isEmpty(str2)) {
                    LogUtil.j("MultiSimUtils", "startAppByPackageName operator is default CTCC");
                    launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.ct.client");
                } else {
                    launchIntentForPackage = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
                    launchIntentForPackage.addFlags(268435456);
                    launchIntentForPackage.setData(Uri.parse("ctclient://startapp/android/open?LinkType=5&Link=" + str2));
                }
            }
            if (launchIntentForPackage == null) {
                LogUtil.j("MultiSimUtils", "startAppByPackageName intent is null");
            } else {
                context.startActivity(launchIntentForPackage);
            }
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("MultiSimUtils", "startAppByPackageName ActivityNotFoundException");
        }
    }

    public static boolean f(String str) {
        return d(str) || h(str) || a(str);
    }

    public static String b(Context context, String str, int i2) {
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.j("MultiSimUtils", "getOperatorAppName context or imsi is null");
            return "";
        }
        if (d(str)) {
            if (b(i2)) {
                return context.getString(R.string.IDS_plugin_multi_esim_cmcc_app_name);
            }
            return context.getString(R.string.IDS_plugin_multi_esim_provider_cmcc);
        }
        if (h(str)) {
            return context.getString(R.string.IDS_plugin_multi_esim_cucc_app_name);
        }
        if (!a(str)) {
            return "";
        }
        return context.getString(R.string.IDS_plugin_multi_esim_provider_ctcc);
    }

    public static String a(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("MultiSimUtils", "getOperatorAppId imsi is null");
            return "";
        }
        if (d(str)) {
            if (i2 == 1) {
                return "/appdl/C107024875";
            }
            return "/appdl/C10097559";
        }
        if (h(str)) {
            return "/appdl/C10059351";
        }
        return a(str) ? "/appdl/C38660" : "";
    }

    public static String d(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("MultiSimUtils", "getOperatorPackageName imsi is null");
            return "";
        }
        if (d(str)) {
            if (i2 == 1) {
                return "com.cmic.heduohao";
            }
            return "com.greenpoint.android.mc10086.activity";
        }
        if (h(str)) {
            return "com.sinovatech.unicom.ui";
        }
        return a(str) ? "com.ct.client" : "";
    }

    private static int d(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.j("MultiSimUtils", "getAppVersionCode context or packageName is null");
            return 0;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e("MultiSimUtils", "getAppVersionCode NameNotFoundException.");
        }
        return 0;
    }

    public static boolean e(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.j("MultiSimUtils", "isNewOperatorVersion context or packageName is null");
            return false;
        }
        int iD = d(context, str);
        LogUtil.a("MultiSimUtils", "isNewOperatorVersion versionCode = ", Integer.valueOf(iD));
        if ("com.cmic.heduohao".equals(str)) {
            return iD >= 2022051716;
        }
        if ("com.sinovatech.unicom.ui".equals(str)) {
            return iD >= 102;
        }
        if ("com.ct.client".equals(str)) {
            return iD >= 8600;
        }
        return "com.greenpoint.android.mc10086.activity".equals(str) && iD >= 87000;
    }

    private static String j(Context context, String str) {
        HashMap map = new HashMap(16);
        map.put("oemName", "huawei");
        map.put("packageName", "com.huawei.com");
        map.put("serviceType", "1");
        map.put("terminalType", "2");
        map.put("machineType", "57");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        for (Map.Entry entry : map.entrySet()) {
            String string = stringBuffer.toString();
            if (!string.contains((CharSequence) entry.getKey())) {
                if (string.contains("?")) {
                    stringBuffer.append("&" + ((String) entry.getKey()) + "=" + ((String) entry.getValue()));
                } else {
                    stringBuffer.append("?" + ((String) entry.getKey()) + "=" + ((String) entry.getValue()));
                }
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("openType", "url");
            jSONObject.put("title", context.getResources().getString(R.string.IDS_operator_title));
            jSONObject.put("openUrl", stringBuffer.toString());
        } catch (JSONException unused) {
            LogUtil.e("MultiSimUtils", "getCuccUrl JSONException");
        }
        return "chinaunicom://?open=" + jSONObject.toString();
    }

    public static Bitmap b(boolean z, String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("MultiSimUtils", "getOperatorBitmap imsi is null");
            return null;
        }
        if (lvi.n(e())) {
            return a(null, z, str, i2, e());
        }
        LogUtil.j("MultiSimUtils", "getOperatorBitmap is not plugin download");
        return null;
    }

    private static Bitmap a(Bitmap bitmap, boolean z, String str, int i2, int i3) {
        String strJ = lvi.j(i3);
        LogUtil.a("MultiSimUtils", "getOperatorBitmapgFromPlugin uuid = ", strJ);
        if (((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isResourcesAvailable(strJ)) {
            edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(strJ);
            if (pluginInfoByUuid != null) {
                String strA = a(pluginInfoByUuid, z, str, i2);
                LogUtil.a("MultiSimUtils", "getOperatorBitmapgFromPlugin imageName = ", strA);
                return !TextUtils.isEmpty(strA) ? ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).loadImageByImageName(pluginInfoByUuid, strA) : bitmap;
            }
            LogUtil.j("MultiSimUtils", "getOperatorBitmapgFromPlugin devicePluginInfo is null");
            return bitmap;
        }
        LogUtil.j("MultiSimUtils", "getOperatorBitmapgFromPlugin isPluginAvaiable is false");
        return bitmap;
    }

    private static String a(edl edlVar, boolean z, String str, int i2) {
        boolean zL = LanguageUtil.l(BaseApplication.getContext());
        if (d(str)) {
            if (z) {
                if (zL) {
                    return edlVar.i().n();
                }
                return edlVar.i().bg();
            }
            if (b(i2)) {
                if (zL) {
                    return edlVar.i().m();
                }
                return edlVar.i().o();
            }
            if (zL) {
                return edlVar.i().l();
            }
            return edlVar.i().o();
        }
        if (h(str)) {
            if (z) {
                if (zL) {
                    return edlVar.i().w();
                }
                return edlVar.i().bg();
            }
            if (zL) {
                return edlVar.i().u();
            }
            return edlVar.i().y();
        }
        if (!a(str)) {
            LogUtil.j("MultiSimUtils", "getImageName is not operator imsi");
            return "";
        }
        if (z) {
            if (zL) {
                return edlVar.i().t();
            }
            return edlVar.i().bg();
        }
        if (zL) {
            return edlVar.i().s();
        }
        return edlVar.i().p();
    }

    public static String e(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("MultiSimUtils", "getOperatoUrl imsi is null");
            return "";
        }
        if (lvi.n(e())) {
            String strJ = lvi.j(e());
            LogUtil.a("MultiSimUtils", "getOperatoUrl uuid = ", strJ);
            if (((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isResourcesAvailable(strJ)) {
                edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(strJ);
                if (pluginInfoByUuid != null) {
                    return e(pluginInfoByUuid, str, i2);
                }
                LogUtil.j("MultiSimUtils", "getOperatoUrl devicePluginInfo is null");
            } else {
                LogUtil.j("MultiSimUtils", "getOperatoUrl isPluginAvaiable is false");
            }
        } else {
            LogUtil.j("MultiSimUtils", "getOperatoUrl is not plugin download");
        }
        return "";
    }

    private static String e(edl edlVar, String str, int i2) {
        if (d(str)) {
            if (b(i2)) {
                return "heduohao://action=GoToApplyEsim#huawei";
            }
            return edlVar.i().r();
        }
        if (h(str)) {
            if (b(i2)) {
                return edlVar.i().aa();
            }
            return edlVar.i().x();
        }
        if (a(str)) {
            if (b(i2)) {
                return edlVar.i().v();
            }
            return edlVar.i().q();
        }
        LogUtil.j("MultiSimUtils", "getOperatorUrl is not operator imsi");
        return "";
    }

    public static String b(String str) {
        String strJ = lvi.j(e());
        return phs.d + strJ + File.separator + strJ + File.separator + "declaration" + File.separator + str;
    }

    public static boolean i() {
        DeviceCapability deviceCapabilityC = eej.c();
        if (deviceCapabilityC != null) {
            return deviceCapabilityC.isSupportNewEsim();
        }
        return false;
    }

    public static String c(Context context) {
        if (!Utils.o()) {
            if (LanguageUtil.l(context)) {
                return "/SmartWear/eSIM_GLL/EMUI8.0/C001B001/zh-CN/index.html";
            }
            return "/SmartWear/eSIM_GLL/EMUI8.0/C001B001/en-US/index.html";
        }
        return String.format(Locale.ENGLISH, "/handbook/Jumppage/EMUI8.0/C001B001/en-US/index.html?lang=%s&devicetype=eSIM_GLL", CommonUtil.z());
    }

    public static void e(Context context, String str, String str2) {
        if (context == null || TextUtils.isEmpty(str2)) {
            LogUtil.j("MultiSimUtils", "startWebView context is null or url is empty");
            return;
        }
        try {
            Intent intent = new Intent(context, (Class<?>) WebViewActivity.class);
            intent.putExtra("url", str2);
            intent.putExtra("title", str);
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("MultiSimUtils", "startWebView ActivityNotFoundException");
        }
    }

    public static void b(String str, String str2) {
        SharedPreferenceManager.e(BaseApplication.getContext(), "share_preference_esim_accode", "KEY_ACCODE", str, null);
        SharedPreferenceManager.e(BaseApplication.getContext(), "share_preference_esim_accode", "KEY_ACCODE_SAVE_TIME", str2, null);
    }

    public static void e(String str, boolean z) {
        String strValue;
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(16);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        if (z) {
            linkedHashMap.put("click", "1");
            linkedHashMap.put("startTime", strValueOf);
            linkedHashMap.put("openMethod", str);
            strValue = OperationKey.HEALTH_APP_ESIM_MANAGER_60010001.value();
        } else {
            linkedHashMap.put("endTime", strValueOf);
            strValue = OperationKey.HEALTH_APP_ESIM_MANAGER_60010002.value();
        }
        OpAnalyticsUtil.getInstance().setEvent2nd(strValue, linkedHashMap);
    }

    public static void a(int i2, boolean z) {
        String strValue;
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(16);
        linkedHashMap.put("status", String.valueOf(i2));
        if (z) {
            strValue = OperationKey.HEALTH_APP_ESIM_MANAGER_60010003.value();
        } else {
            strValue = OperationKey.HEALTH_APP_ESIM_MANAGER_60010004.value();
        }
        OpAnalyticsUtil.getInstance().setEvent2nd(strValue, linkedHashMap);
    }

    public static boolean g(String str) {
        if (!TextUtils.isEmpty(str)) {
            return "04".equals(str);
        }
        LogUtil.j("MultiSimUtils", "isTs43Es openMethod is empty");
        return false;
    }

    public static String a(Context context) {
        String strAl;
        if (CommonUtil.bt()) {
            strAl = CommonUtil.q();
        } else if (CommonUtil.bg()) {
            strAl = CommonUtil.n(context);
        } else {
            strAl = CommonUtil.al();
        }
        if (TextUtils.isEmpty(strAl)) {
            String strReplace = UUID.randomUUID().toString().replace(Constants.LINK, "");
            LogUtil.a("MultiSimUtils", "getPhoneTerminalId random uuid");
            return strReplace;
        }
        LogUtil.a("MultiSimUtils", "getPhoneTerminalId deviceId is not empty");
        return strAl;
    }

    public static boolean c(Intent intent) {
        if (intent == null) {
            LogUtil.j("MultiSimUtils", "isDeviceSupportCurFunction intent is null");
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo");
        if (deviceInfo == null) {
            LogUtil.j("MultiSimUtils", "isDeviceSupportCurFunction deviceInfo is null. ");
            return false;
        }
        Map<String, DeviceCapability> mapD = lvb.e().d(1, deviceInfo.getDeviceIdentify(), "MultiSimUtils");
        if (mapD == null || mapD.isEmpty()) {
            LogUtil.j("MultiSimUtils", "isDeviceSupportCurFunction queryDeviceCapability is null. ");
        } else {
            DeviceCapability deviceCapability = mapD.get(deviceInfo.getDeviceIdentify());
            if (deviceCapability != null && (deviceCapability.isSupportNewEsim() || deviceCapability.isSupportEsim() || deviceCapability.isSupportMultiSim())) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(Context context) {
        String str;
        if (context == null) {
            LogUtil.j("MultiSimUtils", "isSameImsi context is null");
            return false;
        }
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "share_preference_esim_accode", "imsi");
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j("MultiSimUtils", "isSameImsi oldImsi is empty");
            return false;
        }
        List<Map<String, Object>> listB = b(context);
        if (listB != null && listB.size() > 0) {
            Iterator<Map<String, Object>> it = listB.iterator();
            while (it.hasNext()) {
                Object obj = it.next().get("imsi");
                if (!(obj instanceof String)) {
                    str = "";
                } else {
                    str = (String) obj;
                }
                if (!TextUtils.isEmpty(str) && TextUtils.equals(nio.e(str), strE)) {
                    LogUtil.a("MultiSimUtils", "imsi is equals");
                    return true;
                }
            }
        }
        return false;
    }

    public static int d(Context context) {
        SubscriptionManager.from(context);
        int defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId();
        List<SubscriptionInfo> activeSubscriptionInfoList = SubscriptionManager.from(context).getActiveSubscriptionInfoList();
        if (activeSubscriptionInfoList == null || activeSubscriptionInfoList.size() == 0) {
            LogUtil.j("MultiSimUtils", "getPrimaryCardSlotId can not get subscriptionInfoList");
            return 0;
        }
        for (SubscriptionInfo subscriptionInfo : activeSubscriptionInfoList) {
            if (subscriptionInfo.getSubscriptionId() == defaultDataSubscriptionId) {
                return subscriptionInfo.getSimSlotIndex();
            }
        }
        return 0;
    }

    public static void n(Context context) {
        PackageInfo packageInfo;
        if (context == null) {
            LogUtil.j("MultiSimUtils", "startWearOsApp context is null");
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            packageInfo = packageManager.getPackageInfo("com.google.android.wearable.app.cn", 0);
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e("MultiSimUtils", "onClick() androidWearNameCn, error");
            try {
                packageInfo = packageManager.getPackageInfo("com.google.android.wearable.app", 0);
            } catch (PackageManager.NameNotFoundException unused2) {
                LogUtil.e("MultiSimUtils", "onClick() androidWearName, error");
                packageInfo = null;
            }
        }
        if (packageInfo == null) {
            LogUtil.j("MultiSimUtils", "startWearOsApp packageInfo is null");
        } else {
            a(context, packageInfo);
        }
    }

    private static void a(Context context, PackageInfo packageInfo) {
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(packageInfo.packageName);
        ResolveInfo next = context.getPackageManager().queryIntentActivities(intent, 0).iterator().next();
        if (next != null) {
            String str = next.activityInfo.packageName;
            String str2 = next.activityInfo.name;
            try {
                Intent intent2 = new Intent("android.intent.action.MAIN");
                intent2.addCategory("android.intent.category.LAUNCHER");
                intent2.setComponent(new ComponentName(str, str2));
                context.startActivity(intent2);
            } catch (ActivityNotFoundException unused) {
                LogUtil.e("MultiSimUtils", "startWearOs ActivityNotFoundException");
            }
        }
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("MultiSimUtils", "getContainsEsimUpperCaseText text is empty");
            return "";
        }
        if (!str.contains("eSIM")) {
            return str;
        }
        if (str.startsWith("eSIM")) {
            return "eSIM" + str.substring(str.indexOf("eSIM") + 4).toUpperCase(Locale.ENGLISH);
        }
        if (str.endsWith("eSIM")) {
            return str.substring(0, str.indexOf("eSIM")).toUpperCase(Locale.ENGLISH) + "eSIM";
        }
        int iIndexOf = str.indexOf("eSIM");
        return str.substring(0, iIndexOf).toUpperCase(Locale.ENGLISH) + "eSIM" + str.substring(iIndexOf + 4).toUpperCase(Locale.ENGLISH);
    }

    public static void b(Context context, View view, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (context == null || view == null) {
            LogUtil.j("MultiSimUtils", "setViewPosition context or view is null");
            return;
        }
        int iM = qrs.m();
        int iS = qrs.s(context);
        int i3 = ((iM - iS) * 2) / 5;
        int i4 = i2 / 2;
        LogUtil.a("MultiSimUtils", "setViewPosition screenHeight = ", Integer.valueOf(iM), ",statusBarHeight = ", Integer.valueOf(iS));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        }
        marginLayoutParams.setMargins(0, i3 - i4, 0, 0);
        marginLayoutParams.width = i2;
        marginLayoutParams.height = i2;
        view.setLayoutParams(marginLayoutParams);
    }

    public static void o(Context context) {
        boolean z = MagicBuild.f36615a;
        LogUtil.a("MultiSimUtils", "savePermissionException isNewHonorRemoveMagic = ", Boolean.valueOf(z));
        if (z) {
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10008), "is_esim_permission_exception", "", null);
            if (context == null) {
                LogUtil.j("MultiSimUtils", "savePermissionException context is null");
                return;
            }
            Object systemService = context.getSystemService("phone");
            if (!(systemService instanceof TelephonyManager)) {
                LogUtil.j("MultiSimUtils", "savePermissionException object is not instanceof TelephonyManager");
                return;
            }
            try {
                ((TelephonyManager) systemService).getSubscriberId();
            } catch (SecurityException unused) {
                LogUtil.e("MultiSimUtils", "savePermissionException SecurityException");
                SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10008), "is_esim_permission_exception", "is_esim_permission_exception", null);
            }
        }
    }

    public static boolean g() {
        if (!CommonUtil.bd()) {
            return false;
        }
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10008), "is_esim_permission_exception");
        LogUtil.a("MultiSimUtils", "isNewHonor savedPermissionStatus = ", strE);
        return TextUtils.isEmpty(strE);
    }

    public static pwo a(String str, String str2) {
        pwo pwoVar = new pwo();
        pwoVar.b(str);
        pwoVar.d(str2);
        LogUtil.a("MultiSimUtils", "getPrimaryDevice cache cardType = ", d);
        pwoVar.c(d);
        return pwoVar;
    }

    public static pwq e(MultiSimDeviceInfo multiSimDeviceInfo) {
        pwq pwqVar = new pwq();
        if (multiSimDeviceInfo == null) {
            LogUtil.j("MultiSimUtils", "getPairedDevice multiSimDeviceInfo is null");
            return pwqVar;
        }
        pwqVar.d(3);
        pwqVar.d(multiSimDeviceInfo.getEID());
        pwqVar.a(multiSimDeviceInfo.getProductName());
        pwqVar.e(multiSimDeviceInfo.getDeviceIMEI());
        DeviceInfo deviceInfoC = mgg.c("MultiSimUtils");
        if (deviceInfoC != null) {
            String deviceModel = deviceInfoC.getDeviceModel();
            String softVersion = deviceInfoC.getSoftVersion();
            LogUtil.a("MultiSimUtils", "getPairedDevice deviceModel = ", deviceModel, ", deviceSoftVersion = ", softVersion);
            pwqVar.c(deviceModel);
            pwqVar.b(softVersion);
        }
        return pwqVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    public static List<Map<String, Object>> e(Context context) {
        int iIntValue;
        String str;
        ArrayList arrayList = new ArrayList(2);
        if (context == null) {
            LogUtil.j("MultiSimUtils", "getSupportAccountManageSimCardList context is null");
            return arrayList;
        }
        List<Map<String, Object>> listB = b(context);
        if (listB == null || listB.isEmpty()) {
            LogUtil.j("MultiSimUtils", "getSupportAccountManageSimCardList sim cards is none");
            return arrayList;
        }
        for (int i2 = 0; i2 < listB.size(); i2++) {
            Map<String, Object> map = listB.get(i2);
            if (map == null) {
                LogUtil.j("MultiSimUtils", "getSupportAccountManageSimCardList map is null");
            } else {
                if (map.containsKey("slotId")) {
                    Object obj = map.get("slotId");
                    if (obj instanceof Integer) {
                        iIntValue = ((Integer) obj).intValue();
                    } else {
                        iIntValue = i2;
                    }
                } else {
                    iIntValue = i2;
                }
                if (map.containsKey("imsi")) {
                    Object obj2 = map.get("imsi");
                    if (obj2 instanceof String) {
                        str = (String) obj2;
                    } else {
                        str = "";
                    }
                } else {
                    str = "";
                }
                Boolean boolE = oco.e(context, "ODSA_SUPPORT_CHANGE_MANAGE_SUBSCRIPTION", iIntValue, false);
                boolean zBooleanValue = boolE.booleanValue();
                LogUtil.a("MultiSimUtils", "getSupportAccountManageSimCardList slotId = ", Integer.valueOf(iIntValue), ", isDisplay = ", boolE, ", isCmccImsi :", Boolean.valueOf(d(str)));
                if (zBooleanValue || (d(str) && CommonUtil.bg())) {
                    arrayList.add(map);
                }
            }
        }
        return arrayList;
    }

    public static ArrayList<String> b(Context context, String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (context == null) {
            LogUtil.j("MultiSimUtils", "getStandaloneNumCardTypeList context is null.");
            return arrayList;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("MultiSimUtils", "getStandaloneNumCardTypeList operatorName is empty.");
            return arrayList;
        }
        LogUtil.a("MultiSimUtils", "getStandaloneNumCardTypeList operatorName = ", str);
        if (str.equals(context.getString(R.string.IDS_plugin_multi_esim_provider_cmcc))) {
            arrayList.add(HiAnalyticsConstant.KeyAndValue.NUMBER_01);
            arrayList.add("07");
            return arrayList;
        }
        if (str.equals(context.getString(R.string.IDS_plugin_multi_esim_provider_cucc))) {
            arrayList.add(HiAnalyticsConstant.KeyAndValue.NUMBER_01);
            arrayList.add("04");
            return arrayList;
        }
        if (str.equals(context.getString(R.string.IDS_plugin_multi_esim_provider_ctcc))) {
            LogUtil.a("MultiSimUtils", "getStandaloneNumCardTypeList provider ctcc.");
            return arrayList;
        }
        LogUtil.j("MultiSimUtils", "getStandaloneNumCardTypeList else branch.");
        return arrayList;
    }

    public static int e() {
        DeviceInfo deviceInfoC = mgg.c("MultiSimUtils");
        if (deviceInfoC == null) {
            return 57;
        }
        int productType = deviceInfoC.getProductType();
        for (int i2 : h) {
            if (productType == i2) {
                return 85;
            }
        }
        if (productType == 99 || productType == 106 || productType == 110 || productType == 117) {
            return productType;
        }
        return 57;
    }

    public static boolean j() {
        return eey.d(mgg.c("MultiSimUtils"), MachineControlPointResponse.OP_CODE_EXTENSION_SET_TARGETED_EXPENDED_ENERGY);
    }

    public static boolean a() {
        boolean z = !j() || e() == 85;
        LogUtil.a("MultiSimUtils", "isOldDevice :", Boolean.valueOf(z));
        return !z;
    }

    public static boolean h(Context context) {
        boolean z = false;
        if (context == null) {
            LogUtil.j("MultiSimUtils", "context is null.");
            return false;
        }
        Object systemService = context.getSystemService("phone");
        if (!(systemService instanceof TelephonyManager)) {
            LogUtil.j("MultiSimUtils", "isCuccCellular object is not instanceof TelephonyManager");
            return false;
        }
        if (h(((TelephonyManager) systemService).getSimOperator()) && k(context) && !NetworkUtil.k()) {
            z = true;
        }
        LogUtil.a("MultiSimUtils", "isCuccCellular = ", Boolean.valueOf(z));
        return z;
    }

    public static boolean i(Context context) {
        if (context == null) {
            LogUtil.j("MultiSimUtils", "context is null.");
            return false;
        }
        List<SubscriptionInfo> activeSubscriptionInfoList = SubscriptionManager.from(context).getActiveSubscriptionInfoList();
        if (activeSubscriptionInfoList == null || activeSubscriptionInfoList.size() < 2) {
            LogUtil.a("MultiSimUtils", " isBothCardCucc subscriptionInfoList.size() < 2");
            return false;
        }
        int i2 = 0;
        for (SubscriptionInfo subscriptionInfo : activeSubscriptionInfoList) {
            if (h(c(context, subscriptionInfo.getSubscriptionId()))) {
                i2++;
                LogUtil.a("MultiSimUtils", " card ", Integer.valueOf(subscriptionInfo.getSubscriptionId()), " is cucc");
            }
        }
        return i2 >= 2;
    }

    public static void f(Context context) {
        npz.b().b("com.sinovatech.unicom.ui");
        UniAccountHelper.getInstance().init(context, "5778dec3e5d0a1922582541492240423", false);
        UniAccountHelper.getInstance().clearCache();
        UniAccountHelper.getInstance().setUseCacheFlag(false);
    }

    public static void e(Activity activity, String str) {
        if (activity == null) {
            LogUtil.e("MultiSimUtils", "startAgreementsActivity activity is null");
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) EsimCuccAgreementActivity.class);
        intent.putExtra("fakeMobile", str);
        activity.startActivityForResult(intent, 1099);
    }

    private static boolean k(Context context) {
        boolean zBooleanValue = false;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            Method declaredMethod = telephonyManager.getClass().getDeclaredMethod("getDataEnabled", new Class[0]);
            if (declaredMethod.invoke(telephonyManager, new Object[0]) instanceof Boolean) {
                zBooleanValue = ((Boolean) declaredMethod.invoke(telephonyManager, new Object[0])).booleanValue();
            }
        } catch (Exception e2) {
            LogUtil.e("MultiSimUtils", TrackConstants$Events.EXCEPTION + ExceptionUtils.c(e2));
        }
        LogUtil.a("MultiSimUtils", "isCellularEnabled : ", Boolean.valueOf(zBooleanValue));
        return zBooleanValue;
    }

    public static void b(Context context, DialogInterface.OnClickListener onClickListener) {
        String string;
        if (context == null) {
            LogUtil.e("MultiSimUtils", "showCuccNetConfirmDialog context is null");
            return;
        }
        if (Utils.o()) {
            string = context.getResources().getString(R.string.IDS_restore_factory_esim_wifi_tip);
        } else {
            string = context.getResources().getString(R.string.IDS_restore_factory_esim_wlan_tip);
        }
        CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(context).b(context.getResources().getString(R.string.IDS_restore_factory_esim_net)).e(string).d(R.string.IDS_esim_net_tip_done, onClickListener).b();
        customAlertDialogB.setCancelable(false);
        customAlertDialogB.show();
    }

    public static void b(final Context context, String str, final View.OnClickListener onClickListener) {
        final String string = context.getResources().getString(R.string.IDS_plugin_sim_esim_button_cannel);
        final String string2 = context.getResources().getString(R.string.IDS_plugin_sim_esim_button_delete);
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(context).a(R.string.IDS_delete_esim_dialog_title).a(str).a(string, new View.OnClickListener() { // from class: pxk.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.j("MultiSimUtils", "showCuccEsimDeleteDialog cancelled");
            }
        }).b(string2, new View.OnClickListener() { // from class: pxk.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                pxk.d(context, onClickListener, string, string2);
            }
        }).b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Context context, View.OnClickListener onClickListener, String str, String str2) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(context).b(R.string.IDS_delete_esim_dialog_title).d(str, new View.OnClickListener() { // from class: pxk.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.j("MultiSimUtils", "showCuccEsimDeleteConfirmDialog second confirm cancelled");
            }
        }).a(str2, onClickListener).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public static void d(Context context, String str, View.OnClickListener onClickListener) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(context).a(context.getResources().getString(R.string.IDS_esim_huawei_query_fail_tip)).a(str, onClickListener).d(context.getResources().getString(R.string.IDS_plugin_sim_esim_button_cannel), new View.OnClickListener() { // from class: pxq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.j("MultiSimUtils", "showEsimLogoutedDialog cancelled");
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public static void b(Context context, View.OnClickListener onClickListener) {
        if (context == null) {
            LogUtil.e("MultiSimUtils", "showStandaloneNumOpenedDialog context is null.");
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(context);
        builder.b(R.string.ids_oversea_es_query_opened);
        builder.a(context.getString(R.string.IDS_plugin_multi_sim_known), onClickListener);
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public static String a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.j("MultiSimUtils", "getHotLine context is null or operatorName is empty.");
            return "";
        }
        if (str.equals(context.getString(R.string.IDS_plugin_multi_esim_provider_cmcc))) {
            return "10086";
        }
        if (str.equals(context.getString(R.string.IDS_plugin_multi_esim_provider_cucc))) {
            return "10010";
        }
        if (str.equals(context.getString(R.string.IDS_plugin_multi_esim_provider_ctcc))) {
            return "10000";
        }
        LogUtil.j("MultiSimUtils", "getHotLine else branch.");
        return "";
    }

    public static void a(Activity activity, int i2) {
        if (activity == null) {
            LogUtil.j("MultiSimUtils", "startAppSettingActivity, context is null");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
        activity.startActivityForResult(intent, i2);
    }

    public static void b(Activity activity, int i2) {
        if (activity == null) {
            LogUtil.j("MultiSimUtils", "goToNetWorkSettingPage null");
        } else {
            activity.startActivityForResult(new Intent("android.settings.SETTINGS"), i2);
        }
    }

    public static String f() {
        StringBuilder sb = new StringBuilder();
        try {
            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
            InputStream inputStreamOpen = BaseApplication.getContext().getAssets().open("cmcc_qr_address_config.xml");
            xmlPullParserNewPullParser.setInput(inputStreamOpen, "UTF-8");
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.next()) {
                if (eventType == 2 && NetworkService.Constants.CONFIG_SERVICE.equals(xmlPullParserNewPullParser.getName())) {
                    if ("qraddress1".equals(xmlPullParserNewPullParser.getAttributeValue(null, MedalConstants.EVENT_KEY))) {
                        sb.append(xmlPullParserNewPullParser.nextText());
                    } else if ("qraddress2".equals(xmlPullParserNewPullParser.getAttributeValue(null, MedalConstants.EVENT_KEY))) {
                        sb.append(xmlPullParserNewPullParser.nextText());
                    } else if ("qraddress3".equals(xmlPullParserNewPullParser.getAttributeValue(null, MedalConstants.EVENT_KEY))) {
                        sb.append(xmlPullParserNewPullParser.nextText());
                    } else if ("qraddress4".equals(xmlPullParserNewPullParser.getAttributeValue(null, MedalConstants.EVENT_KEY))) {
                        sb.append(xmlPullParserNewPullParser.nextText());
                    }
                }
            }
            inputStreamOpen.close();
        } catch (IOException unused) {
            LogUtil.e("MultiSimUtils", "parseConfig IOException");
        } catch (XmlPullParserException unused2) {
            LogUtil.e("MultiSimUtils", "parseConfig XmlPullParserException!");
        }
        return sb.toString();
    }

    public static ArrayList<String> a(pxe pxeVar) {
        ArrayList<String> arrayList = new ArrayList<>(16);
        if (pxeVar == null) {
            LogUtil.e("MultiSimUtils", "getOpenMethod esimOpenMethod is null.");
            return arrayList;
        }
        String strD = pxeVar.d();
        if (TextUtils.isEmpty(strD)) {
            LogUtil.j("MultiSimUtils", "openMethod is null");
            return arrayList;
        }
        LogUtil.a("MultiSimUtils", "getOpenMethod openMethod = ", strD);
        if (strD.contains("|")) {
            for (String str : strD.split("\\|")) {
                arrayList.add(str);
            }
            return arrayList;
        }
        arrayList.add(strD);
        return arrayList;
    }

    public static boolean d(pxe pxeVar) {
        if (pxeVar == null) {
            return false;
        }
        boolean z = pxeVar.d().contains(a.t) || pxeVar.d().contains("03") || pxeVar.d().contains("04") || pxeVar.d().contains("05") || pxeVar.d().contains("06");
        LogUtil.a("MultiSimUtils", "esimOpenMethod = ", pxeVar);
        return z;
    }

    public static boolean e(List<Map<String, Object>> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("MultiSimUtils", "sim cards is none");
            return false;
        }
        boolean z = false;
        for (int i2 = 0; i2 < list.size(); i2++) {
            pxe pxeVarA = pxh.a(list.get(i2));
            if (pxeVarA != null && !TextUtils.isEmpty(pxeVarA.d())) {
                z = true;
            }
        }
        LogUtil.a("MultiSimUtils", "isOpenMethodExist:", Boolean.valueOf(z));
        return z;
    }

    public static String c(Map<String, Object> map) {
        String str = "";
        if (map == null || map.isEmpty()) {
            LogUtil.j("MultiSimUtils", "simCardInfoMap is empty.");
            return "";
        }
        if (map.containsKey("imsi")) {
            Object obj = map.get("imsi");
            str = obj instanceof String ? (String) obj : "";
            LogUtil.a("MultiSimUtils", "imsiStr = ", cpl.e(str));
        }
        return str;
    }

    public static int d(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            LogUtil.j("MultiSimUtils", "simCardInfoMap is empty.");
            return -1;
        }
        if (!map.containsKey("slotId")) {
            return -1;
        }
        Object obj = map.get("slotId");
        int iIntValue = obj instanceof Integer ? ((Integer) obj).intValue() : 0;
        LogUtil.a("MultiSimUtils", "mSlotId = ", Integer.valueOf(iIntValue));
        return iIntValue;
    }

    public static oeg e(String str) {
        return (oeg) GsonUtil.parseJson(str, oeg.class);
    }

    public static String b() {
        return g;
    }

    public static String c() {
        return i;
    }

    public static void m(Context context) {
        List<Map<String, Object>> listE = e(context);
        if (listE.isEmpty()) {
            g = "";
            i = "";
            LogUtil.j("MultiSimUtils", "getSupportAccountManageSimCardList is empty.");
            return;
        }
        if (listE.size() == 2) {
            g = c(listE.get(0));
            i = c(listE.get(1));
        } else {
            Map<String, Object> map = listE.get(0);
            int iD = d(map);
            if (iD == 0) {
                g = c(map);
                i = "";
            } else if (iD == 1) {
                g = "";
                i = c(map);
            } else {
                g = "";
                i = "";
                LogUtil.e("MultiSimUtils", "invalid slotid:", Integer.valueOf(iD));
            }
        }
        LogUtil.a("MultiSimUtils", "slot0 imsiStr = ", cpl.e(g));
        LogUtil.a("MultiSimUtils", "slot1 imsiStr = ", cpl.e(i));
    }

    public static LinearLayout a(Activity activity) {
        View viewInflate = View.inflate(activity, R.layout.esim_empty_page_layout, null);
        activity.addContentView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.empty_waiting_content);
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setVisibility(8);
        return linearLayout;
    }

    public static boolean b(String str, int i2) {
        boolean z = Build.VERSION.SDK_INT >= 28;
        boolean z2 = h(str) && b(i2);
        boolean z3 = h(b()) || h(c());
        LogUtil.a("MultiSimUtils", "SDK ver:", Integer.valueOf(Build.VERSION.SDK_INT), ", isDeviceCuccMultiSim:", Boolean.valueOf(z2), ", isSimCardCucc:", Boolean.valueOf(z3));
        return z && z2 && z3;
    }

    public static Map<String, Object> a(Context context, List<Map<String, Object>> list) {
        HashMap map = new HashMap();
        if (list == null || list.isEmpty()) {
            ReleaseLogUtil.e("DEVMGR_MultiSimUtils", "mSimCardInfoList is error.");
            return map;
        }
        ArrayList arrayList = new ArrayList();
        for (Map<String, Object> map2 : list) {
            if (map2 != null) {
                Object obj = map2.get("imsi");
                if ((obj instanceof String) && h((String) obj)) {
                    arrayList.add(map2);
                }
            }
        }
        int iD = d(context);
        ReleaseLogUtil.d("DEVMGR_MultiSimUtils", "primaryCardSlotId :", Integer.valueOf(iD));
        if (arrayList.size() == 2 && iD < 2) {
            return (Map) arrayList.get(iD);
        }
        if (arrayList.size() != 1) {
            ReleaseLogUtil.d("DEVMGR_MultiSimUtils", "cuccSimCardInfo is empty.");
            return map;
        }
        return (Map) arrayList.get(0);
    }

    public static void a(Context context, String str, int i2, String str2) {
        if (context == null) {
            LogUtil.e("MultiSimUtils", "jumpEsActivatedActivity context is null.");
            return;
        }
        Intent intent = new Intent(context, (Class<?>) EsimOverseaEsActivity.class);
        intent.putExtra("esimIsActivated", true);
        intent.putExtra("activatedAccode", str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        intent.putExtra("simImsi", str2);
        intent.putExtra("esim_card_type_key", i2);
        iov.d(context, intent);
    }
}
