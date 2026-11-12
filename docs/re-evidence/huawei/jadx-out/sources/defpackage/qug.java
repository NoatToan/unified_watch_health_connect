package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.network.inner.api.NetworkService;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.device.R;
import health.compact.a.CommonUtil;
import health.compact.a.Utils;
import java.io.File;
import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes16.dex */
public class qug {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f46871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f46872c;
    private static String f;
    private static final String[] e = {"wifiaren", "wifira", "Wifia", "Wi-Fi", "wifi"};
    private static ArrayList<String> d = new ArrayList<>(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ArrayList<String> f46870a = new ArrayList<>(10);
    private static ArrayList<String> h = new ArrayList<>(10);

    private static String b() {
        try {
            File filesDir = BaseApplication.getContext().getFilesDir();
            if (filesDir != null) {
                return filesDir.getCanonicalPath();
            }
            return "";
        } catch (IOException unused) {
            LogUtil.e("DeclarationUtil", "getSourcePath catch IOException");
            return "";
        }
    }

    public static rbq a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("DeclarationUtil", "getDeclaration featureId or emuiVersion is null or empty");
            return new rbq();
        }
        try {
            rbc rbcVarD = rbc.d();
            rbh rbhVarC = rbcVarD.c(d(str), str2);
            if (rbhVarC == null) {
                LogUtil.j("DeclarationUtil", "getDeclaration featureEntity is null");
                return new rbq();
            }
            return rbcVarD.a(rbhVarC.c(), d(str, rbhVarC.b()));
        } catch (IOException unused) {
            LogUtil.e("DeclarationUtil", "getDeclaration catch IOException");
            return new rbq();
        } catch (XmlPullParserException unused2) {
            LogUtil.e("DeclarationUtil", "getDeclaration catch XmlPullParserException");
            return new rbq();
        }
    }

    public static void d(List<rbg> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("DeclarationUtil", "sortDeclarationByIndex is null");
        } else {
            Collections.sort(list, new Comparator<rbg>() { // from class: qug.2
                @Override // java.util.Comparator
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public int compare(rbg rbgVar, rbg rbgVar2) {
                    return rbgVar.b() - rbgVar2.b();
                }
            });
        }
    }

    public static void c(final Context context, String str) {
        if (context == null) {
            LogUtil.j("DeclarationUtil", "openBrowser: context is null. ", str);
            return;
        }
        if (!b(str)) {
            LogUtil.j("DeclarationUtil", "openBrowser: url is invalid. url: ", str);
            return;
        }
        final Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str).normalizeScheme());
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null || intent.resolveActivity(packageManager) == null) {
            LogUtil.j("DeclarationUtil", "openBrowser: have no browser.");
            qpx.e(context, R.string.IDS_startup_no_browser);
            return;
        }
        try {
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
            if (resolveInfoResolveActivity != null && resolveInfoResolveActivity.activityInfo != null) {
                final ComponentName componentName = new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name);
                intent.setComponent(componentName);
                if (context instanceof Activity) {
                    ((Activity) context).runOnUiThread(new Runnable() { // from class: qug.3
                        @Override // java.lang.Runnable
                        public void run() {
                            Intent intent2 = intent;
                            String packageName = componentName.getPackageName();
                            Context context2 = context;
                            qrs.c(intent2, packageName, context2, context2.getString(R.string.IDS_browser_app_name));
                        }
                    });
                }
                LogUtil.a("DeclarationUtil", "openBrowser by:", resolveInfoResolveActivity.activityInfo.packageName);
                return;
            }
            LogUtil.j("DeclarationUtil", "openBrowser resolveInfo or activityInfo is null");
            qpx.e(context, R.string.IDS_startup_no_browser);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("DeclarationUtil", "openBrowser: ActivityNotFoundException occurred");
            qpx.e(context, R.string.IDS_startup_no_browser);
        }
    }

    private static String d(String str) {
        return f46871b + File.separator + str;
    }

    private static String d(String str, String str2) {
        String str3 = "_" + pjn.b(null);
        String str4 = f46872c + File.separator + str + File.separator + str2 + str3 + WatchFaceConstant.XML_SUFFIX;
        if (new File(str4).exists()) {
            return str4;
        }
        String str5 = f46872c + File.separator + str + File.separator + str + "_en.xml";
        LogUtil.a("DeclarationUtil", "getLanguageDir language file not exist. ", "language: ", str3);
        return str5;
    }

    private static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DeclarationUtil", "isUrlValid: url is null or empty.");
            return false;
        }
        if (Pattern.compile("[<>]").matcher(Normalizer.normalize(str, Normalizer.Form.NFKC)).find()) {
            LogUtil.a("DeclarationUtil", "isUrlValid: url is illegal.");
            return false;
        }
        LogUtil.a("DeclarationUtil", "isUrlValid: url is correct.");
        return str.contains("huawei.com");
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DeclarationUtil", "str is empty");
            return str;
        }
        if (!Utils.o()) {
            int i = 0;
            while (true) {
                String[] strArr = e;
                if (i >= strArr.length) {
                    break;
                }
                String lowerCase = str.toLowerCase();
                String lowerCase2 = strArr[i].toLowerCase();
                if (lowerCase.contains(lowerCase2)) {
                    int iIndexOf = lowerCase.indexOf(lowerCase2);
                    str = str.replaceAll(str.substring(iIndexOf, lowerCase2.length() + iIndexOf), "WLAN");
                }
                i++;
            }
        }
        return str;
    }

    private static rbl d() throws IOException {
        rbl rblVar = new rbl();
        String strA = pia.a(new File(f));
        if (TextUtils.isEmpty(strA)) {
            LogUtil.j("DeclarationUtil", "configJsonText is null");
            return rblVar;
        }
        try {
            String string = new JSONObject(CommonUtil.ac(strA)).toString();
            LogUtil.a("DeclarationUtil", "jsonObjectStr:", string);
            return (rbl) new Gson().fromJson(string, new TypeToken<rbl>() { // from class: com.huawei.ui.device.activity.agreement.DeclarationUtil$3
            }.getType());
        } catch (JsonSyntaxException unused) {
            LogUtil.e("DeclarationUtil", "loadConfigJson JsonSyntaxException");
            return rblVar;
        } catch (JSONException unused2) {
            LogUtil.e("DeclarationUtil", "loadConfigJson - JSONException");
            return rblVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void e(int i, String str) {
        byte b2;
        e(str);
        LogUtil.a("DeclarationUtil", "getAllFeatureId: ", f46871b, "  ", f46872c, " ", f);
        try {
            d.clear();
            f46870a.clear();
            h.clear();
            rbl rblVarD = d();
            if (rblVarD == null) {
                LogUtil.a("DeclarationUtil", "getAllFeatureId FeatureIdJson is empty");
                return;
            }
            List<rbj> listB = rblVarD.b();
            if (listB != null) {
                for (rbj rbjVar : listB) {
                    if (rbjVar != null) {
                        String strB = rbjVar.b();
                        switch (strB.hashCode()) {
                            case 48:
                                if (strB.equals("0")) {
                                    b2 = 0;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 49:
                                if (strB.equals("1")) {
                                    b2 = 1;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 50:
                                if (strB.equals("2")) {
                                    b2 = 2;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                        if (b2 != 0) {
                            if (b2 != 1) {
                                if (b2 == 2) {
                                    c(rbjVar);
                                } else {
                                    LogUtil.a("DeclarationUtil", "getAllFeatureId the default branch");
                                }
                            } else if (i == 2 || i == 3) {
                                c(rbjVar);
                            }
                        } else if (i == 0 || i == 1) {
                            c(rbjVar);
                        }
                    }
                }
            }
        } catch (IOException unused) {
            LogUtil.a("DeclarationUtil", "getAllFeatureId catch IOException");
        }
    }

    private static void e(String str) {
        String str2 = b() + File.separator + "plugins" + File.separator + str + File.separator + str + File.separator + "declaration";
        LogUtil.a("DeclarationUtil", "initPath: ", str2);
        f46871b = str2 + File.separator + NetworkService.Constants.CONFIG_SERVICE;
        f46872c = str2 + File.separator + "language";
        f = str2 + File.separator + "featureIds.json";
    }

    private static void c(rbj rbjVar) {
        if (rbjVar.a().equals("0")) {
            d.add(rbjVar.e());
        }
        if (rbjVar.a().equals("1")) {
            f46870a.add(rbjVar.e());
        }
        if ("1".equals(rbjVar.d())) {
            h.add(rbjVar.e());
        }
    }

    public static String[] e() {
        if (f46870a.size() > 0) {
            return (String[]) f46870a.toArray(new String[0]);
        }
        return new String[0];
    }

    public static String[] a() {
        if (d.size() > 0) {
            return (String[]) d.toArray(new String[0]);
        }
        return new String[0];
    }

    public static String[] c() {
        if (h.size() > 0) {
            return (String[]) h.toArray(new String[0]);
        }
        return new String[0];
    }

    public static void d(String str, int i, int i2) {
        HashMap map = new HashMap(16);
        map.put("Result", 2);
        map.put("deviceType", "HDK_WEAR");
        map.put("Action", Integer.valueOf(i));
        map.put("Page", Integer.valueOf(i2));
        map.put("deviceName", str);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.UNAUTHORIZED_DEVICE_PAIRING_FAILURE.value(), map, 0);
    }

    public static DeviceInfo c(String str, Intent intent) {
        if (TextUtils.isEmpty(str) || intent == null) {
            LogUtil.j("DeclarationUtil", "getCurrentDevice, deviceMac or intent is null");
            return null;
        }
        Parcelable parcelableExtra = intent.getParcelableExtra("deviceinfo");
        if (parcelableExtra instanceof DeviceInfo) {
            return (DeviceInfo) parcelableExtra;
        }
        LogUtil.j("DeclarationUtil", "the intent type is not DeviceInfo");
        for (DeviceInfo deviceInfo : ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "DeclarationUtil")) {
            if (deviceInfo != null && TextUtils.equals(str, deviceInfo.getDeviceIdentify())) {
                return deviceInfo;
            }
        }
        return null;
    }
}
