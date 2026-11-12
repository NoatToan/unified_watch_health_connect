package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.utils.AppTypeUtils;
import com.huawei.operation.utils.PhoneInfoUtils;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import com.huawei.ui.main.stories.guidepage.data.GuideResource;
import health.compact.a.CommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.SharedPreferenceManager;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes19.dex */
public class unh {
    public static HashMap<String, String> a() {
        Context context = BaseApplication.getContext();
        HashMap<String, String> map = new HashMap<>(16);
        map.put("tokenType", String.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
        String accountInfo = LoginInit.getInstance(context).getAccountInfo(1008);
        if (!TextUtils.isEmpty(accountInfo)) {
            try {
                map.put("token", URLEncoder.encode(accountInfo, StandardCharsets.UTF_8.name()));
            } catch (UnsupportedEncodingException e) {
                LogUtil.e("GuideCommonUtil", "token encode Exception ", e.toString());
            }
        }
        map.put("tokenType", String.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
        map.put("siteId", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009));
        map.put("appId", BaseApplication.getAppPackage());
        String deviceId = LoginInit.getInstance(context).getDeviceId();
        if (TextUtils.isEmpty(deviceId)) {
            deviceId = "clientnull";
        }
        map.put("deviceId", deviceId);
        map.put("deviceType", PhoneInfoUtils.getDeviceModel());
        map.put("sysVersion", Build.VERSION.RELEASE);
        map.put("appType", String.valueOf(AppTypeUtils.getAppType()));
        map.put("iVersion", String.valueOf(2));
        map.put("language", pjn.b(null));
        map.put("ts", String.valueOf(tre.j()));
        map.put("timeZone", HiDateUtil.c((String) null).replace(Marker.ANY_NON_NULL_MARKER, "%2B"));
        map.put("countryCode", LoginInit.getInstance(context).getAccountInfo(1010));
        map.put("phoneType", PhoneInfoUtils.getPhoneType());
        return map;
    }

    public static HashMap<String, String> b(String str) {
        Context context = BaseApplication.getContext();
        if (TextUtils.isEmpty(str)) {
            str = CommonUtil.c(context);
        }
        HashMap<String, String> map = new HashMap<>(16);
        map.put("x-huid", LoginInit.getInstance(context).getAccountInfo(1011));
        map.put("x-version", str);
        return map;
    }

    public static String c(String str) {
        String str2;
        try {
            str2 = BaseApplication.getContext().getFilesDir().getCanonicalPath() + File.separator + "guidevideo" + File.separator;
        } catch (IOException unused) {
            LogUtil.e("GuideCommonUtil", "IOException");
            str2 = null;
        }
        return str2 + e(str);
    }

    private static String e(String str) {
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf != -1) {
            return str.substring(iLastIndexOf + 1);
        }
        return "";
    }

    public static void d(List<GuideResource> list) {
        LogUtil.a("GuideCommonUtil", "enter saveGuidePageData");
        if (njy.e(list)) {
            LogUtil.j("GuideCommonUtil", "guideResources is Empty");
        } else {
            SharedPreferenceManager.e(BaseApplication.getContext(), "guide_page_caching_data", "catching_data", new Gson().toJson(list), null);
        }
    }

    public static List<GuideResource> e() {
        LogUtil.a("GuideCommonUtil", "enter getGuidePageData");
        ArrayList arrayList = new ArrayList();
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "guide_page_caching_data", "catching_data");
        if (!TextUtils.isEmpty(strE)) {
            try {
                return (List) new Gson().fromJson(strE, new TypeToken<ArrayList<GuideResource>>() { // from class: com.huawei.ui.main.stories.guidepage.util.GuideCommonUtil$1
                }.getType());
            } catch (JsonSyntaxException unused) {
                LogUtil.e("GuideCommonUtil", "JsonSyntaxException ");
            }
        }
        return arrayList;
    }

    public static boolean d() {
        long j;
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010);
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "guide_page_caching_data", accountInfo + "catching_data_version");
        if (TextUtils.isEmpty(strE)) {
            return false;
        }
        try {
            j = Long.parseLong(SharedPreferenceManager.e(BaseApplication.getContext(), "guide_page_caching_data", accountInfo + "catching_data_expire_time"));
        } catch (NumberFormatException unused) {
            LogUtil.e("GuideCommonUtil", "NumberFormatException");
            j = 0;
        }
        if (j < System.currentTimeMillis()) {
            LogUtil.a("GuideCommonUtil", "time is expired");
            b("", "");
            unl.b("");
            return false;
        }
        String strA = a(CommonUtil.a(BaseApplication.getContext()));
        LogUtil.a("GuideCommonUtil", "cachedVersion:", strE, " appVersion:", strA);
        return CommonUtil.e(strE, strA) == 0;
    }

    public static void b(String str, String str2) {
        String strA = a(str);
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010);
        SharedPreferenceManager.e(BaseApplication.getContext(), "guide_page_caching_data", accountInfo + "catching_data_version", strA, null);
        SharedPreferenceManager.e(BaseApplication.getContext(), "guide_page_caching_data", accountInfo + "catching_data_expire_time", str2, null);
    }

    public static String a(String str) {
        int iIndexOf;
        return (TextUtils.isEmpty(str) || (iIndexOf = str.indexOf(Constants.LINK)) <= 0) ? str : str.substring(0, iIndexOf);
    }
}
