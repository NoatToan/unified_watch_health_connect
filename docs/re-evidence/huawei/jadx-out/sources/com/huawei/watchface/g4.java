package com.huawei.watchface;

import android.text.TextUtils;
import com.huawei.secure.android.common.util.UrlUtil;
import com.huawei.secure.android.common.webview.UriUtil;
import com.huawei.watchface.utils.ArrayUtils;
import com.huawei.watchface.utils.DensityUtil;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class g4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f30175c = "";
    public static String d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f30176a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f30177b = new ArrayList();

    public static String a() {
        if (TextUtils.isEmpty(f30175c)) {
            f30175c = WatchFaceHttpUtil.a("privacyV2");
        }
        return f30175c;
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(a() + DensityUtil.getStringById(R.string.CLOUD_CHANGE_URL));
    }

    public static boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith(a() + DensityUtil.getStringById(R.string.CLOUD_MEMBERSHIP_URL))) {
            return true;
        }
        if (str.startsWith(a() + DensityUtil.getStringById(R.string.CLOUD_MONSERVICE_URL))) {
            return true;
        }
        if (str.startsWith(a() + DensityUtil.getStringById(R.string.WATCHFACE_CLOUD_MEMBERSHIP_URL))) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a());
        sb.append(DensityUtil.getStringById(R.string.WATCHFACE_CLOUD_MONSERVICE_URL));
        return str.startsWith(sb.toString());
    }

    public static boolean e(String str) {
        return "file:///android_asset/openSource.html".equals(str) || "file:///android_asset/openSourceOverseas.html".equals(str) || "file:///android_asset/watchfaceOpenSource.html".equals(str) || "file:///android_asset/watchfaceOpenSourceOverseas.html".equals(str);
    }

    public static boolean f(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(a() + DensityUtil.getStringById(R.string.CLOUD_PRIVACY_URL));
    }

    public static boolean g(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return f(str) || h(str) || b(str) || d(str);
    }

    public static boolean h(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(a() + DensityUtil.getStringById(R.string.CLOUD_TERM_URL));
    }

    public static g4 i(String str) {
        g4 g4Var = new g4();
        try {
            a(g4Var, new JSONObject(str));
            return g4Var;
        } catch (JSONException e) {
            HwLog.e("SupportType", "parseSupportType exception " + HwLog.printException((Exception) e));
            return null;
        }
    }

    public boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (e(str)) {
            return true;
        }
        if (!g(str)) {
            return a(str);
        }
        HwLog.i("SupportType", "isInternalUrl isStatement  true");
        return true;
    }

    public boolean a(String str) {
        return b(str, this.f30176a);
    }

    public String b() {
        return d;
    }

    public static boolean a(String str, List list) {
        if (ArrayUtils.isEmpty(list)) {
            HwLog.e("SupportType", "checkIsUrlHostAndPathInWhiteList whiteList is empty");
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2.endsWith("/")) {
                if (UriUtil.isUrlHostMatchWhitelist(str, str2) && str.startsWith(str2)) {
                    return true;
                }
            } else if (UriUtil.isUrlHostAndPathMatchWhitelist(str, str2)) {
                return true;
            }
        }
        HwLog.i("SupportType", "checkIsUrlHostAndPathInWhiteList : false");
        return false;
    }

    public static boolean b(String str, List list) {
        if (ArrayUtils.isEmpty(list)) {
            HwLog.e("SupportType", "checkIsUrlHostInWhiteList whiteList is empty");
            return false;
        }
        String[] strArr = new String[list.size()];
        list.toArray(strArr);
        boolean zIsUrlHostSameWhitelist = UriUtil.isUrlHostSameWhitelist(str, strArr);
        boolean zIsHttpsUrl = UrlUtil.isHttpsUrl(str);
        HwLog.i("SupportType", "checkIsUrlHostInWhiteList urlHostInWhitelist : " + zIsUrlHostSameWhitelist + ",httpsUrl:" + zIsHttpsUrl);
        return zIsUrlHostSameWhitelist && zIsHttpsUrl;
    }

    public List d() {
        return this.f30176a;
    }

    public List c() {
        return this.f30177b;
    }

    public static void a(g4 g4Var, JSONObject jSONObject) {
        try {
            JSONArray jSONArray = jSONObject.has("whiteList") ? jSONObject.getJSONArray("whiteList") : null;
            if (jSONObject.has("supportPay")) {
                d = jSONObject.getString("supportPay");
            }
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    g4Var.f30176a.add(jSONArray.getString(i));
                }
            }
            JSONArray jSONArray2 = jSONObject.has("watchFaceWhiteList") ? jSONObject.getJSONArray("watchFaceWhiteList") : null;
            if (jSONArray2 != null) {
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    g4Var.f30177b.add(jSONArray2.getString(i2));
                }
            }
        } catch (JSONException e) {
            g4Var.f30176a = null;
            HwLog.e("SupportType", "parseWhitelist exception " + HwLog.printException((Exception) e));
        }
    }
}
