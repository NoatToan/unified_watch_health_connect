package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.network.inner.api.NetworkService;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import health.compact.a.AuthorizationUtils;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.io.File;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class lor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f40568c = File.separator + NetworkService.Constants.GRS_SERVICE + File.separator + "grs_third_party_config.json";

    public static boolean b(Context context) {
        if (context == null) {
            LogUtil.j("GrsConfigInteractor", "isNeedUpdateGrsConfig context is null");
            return false;
        }
        if (!AuthorizationUtils.c(context)) {
            LogUtil.j("GrsConfigInteractor", "getAuthorizationStatus is false");
            return false;
        }
        boolean z = System.currentTimeMillis() - CommonUtil.i(SharedPreferenceManager.e(context, Integer.toString(10000), "grs_config_last_update_time")) > 86400000;
        LogUtil.a("GrsConfigInteractor", "isNeedUpdateGrsConfig isNeedUpdate = ", Boolean.valueOf(z));
        return z;
    }

    public static boolean c(Context context) {
        if (context == null) {
            LogUtil.j("GrsConfigInteractor", "isNeedDeleteGrsConfig context is null");
            return false;
        }
        String strE = SharedPreferenceManager.e(context, Integer.toString(10000), "grs_config_delete");
        LogUtil.a("GrsConfigInteractor", "isNeedDeleteGrsConfig, isNeedDelete:", strE);
        return "true".equals(strE);
    }

    public static boolean d(Context context, int i) {
        String str;
        LogUtil.a("GrsConfigInteractor", "enter updateGrsConfig retryCount = ", Integer.valueOf(i));
        if (context == null) {
            LogUtil.j("GrsConfigInteractor", "updateGrsConfig context is null");
            return false;
        }
        if (i < 0) {
            LogUtil.j("GrsConfigInteractor", "updateGrsConfig retryCount < 0");
            return false;
        }
        String noCheckUrl = GRSManager.c(context).getNoCheckUrl("getNewBatchPluginUrl", GRSManager.c(context).getCommonCountryCode());
        if (TextUtils.isEmpty(noCheckUrl)) {
            LogUtil.j("GrsConfigInteractor", "updateGrsConfig url is empty");
            return false;
        }
        String strC = lqb.c(noCheckUrl + "com.huawei.health_common_config", "resources=grs_third_party_config");
        if (TextUtils.isEmpty(strC) || Constants.NULL.equalsIgnoreCase(strC)) {
            LogUtil.j("GrsConfigInteractor", "updateGrsConfig jsonResult is empty");
            return d(context, i - 1);
        }
        String strD = d(strC);
        if (TextUtils.isEmpty(strD)) {
            LogUtil.j("GrsConfigInteractor", "updateGrsConfig downloadUrl is empty");
            return d(context, i - 1);
        }
        try {
            str = context.getFilesDir().getCanonicalPath() + f40568c;
        } catch (IOException unused) {
            LogUtil.e("GrsConfigInteractor", "updateGrsConfig getCanonicalPath IOException");
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("GrsConfigInteractor", "updateGrsConfig filePath is empty");
            return false;
        }
        boolean zD = lqb.d(strD, str);
        LogUtil.a("GrsConfigInteractor", "updateGrsConfig isDownloadSuccess = ", Boolean.valueOf(zD));
        if (!zD) {
            return d(context, i - 1);
        }
        boolean zC = c(str);
        LogUtil.a("GrsConfigInteractor", "updateGrsConfig isParseSuccess = ", Boolean.valueOf(zC));
        if (zC) {
            SharedPreferenceManager.e(context, Integer.toString(10000), "grs_config_last_update_time", Long.toString(System.currentTimeMillis()), new StorageParams());
        }
        return zC;
    }

    public static void d(Context context) {
        if (context == null) {
            LogUtil.j("GrsConfigInteractor", "deleteGrsConfig context is null");
            return;
        }
        lon.c().b();
        try {
            File file = new File(context.getFilesDir().getCanonicalPath() + f40568c);
            if (file.exists()) {
                if (file.delete()) {
                    LogUtil.j("GrsConfigInteractor", "deleteGrsConfig,file delete success!");
                    SharedPreferenceManager.b(context, Integer.toString(10000), "grs_config_delete");
                } else {
                    LogUtil.j("GrsConfigInteractor", "deleteGrsConfig,file delete fail!");
                }
            }
        } catch (IOException | SecurityException e) {
            LogUtil.e("GrsConfigInteractor", e.getMessage());
        }
    }

    private static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if ("grs_third_party_config".equals(jSONObject.getString(RecommendConstants.FILE_ID))) {
                    return jSONObject.getString(RecommendConstants.DOWNLOAD_URL);
                }
            }
            return "";
        } catch (JSONException unused) {
            LogUtil.e("GrsConfigInteractor", "parseJsonString JSONException");
            return "";
        }
    }

    private static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("GrsConfigInteractor", "parseJsonFile filePath is empty");
            return false;
        }
        String strA = pia.a(new File(str));
        if (TextUtils.isEmpty(strA)) {
            LogUtil.a("GrsConfigInteractor", "parseJsonFile urlJsonString is empty");
            return false;
        }
        try {
            JSONArray jSONArray = new JSONArray(strA);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject.has(MedalConstants.EVENT_KEY) && jSONObject.has("value")) {
                    String string = jSONObject.getString(MedalConstants.EVENT_KEY);
                    String string2 = jSONObject.getString("value");
                    if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                        lon.c().e(string, string2);
                    }
                }
            }
            return true;
        } catch (JSONException unused) {
            LogUtil.e("GrsConfigInteractor", "parseJsonFile JSONException");
            return false;
        }
    }
}
