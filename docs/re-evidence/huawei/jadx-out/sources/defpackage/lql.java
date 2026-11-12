package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.dictionary.utils.ProductMapParseUtil;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentUtils;
import health.compact.a.GRSManager;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.io.File;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class lql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f40631a = File.separator + "productmap" + File.separator + "product_map.json";

    public static boolean a(Context context) {
        if (context == null) {
            LogUtil.j("HiH_ProductMapConfigureUtil", "isNeedUpdateProductMapConfig context is null");
            return false;
        }
        boolean z = System.currentTimeMillis() - CommonUtil.i(SharedPreferenceManager.e(context, "productMapConfig", "product_map_config_last_update_time")) > 86400000;
        LogUtil.a("HiH_ProductMapConfigureUtil", "isNeedUpdateProductMapConfig isNeedUpdate = ", Boolean.valueOf(z));
        return z;
    }

    public static boolean b(Context context, int i) {
        String str;
        LogUtil.a("HiH_ProductMapConfigureUtil", "enter updateProductMapConfig retryCount = ", Integer.valueOf(i));
        if (context == null) {
            LogUtil.j("HiH_ProductMapConfigureUtil", "updateProductMapConfig context is null");
            return false;
        }
        if (i < 0) {
            LogUtil.j("HiH_ProductMapConfigureUtil", "updateProductMapConfig retryCount < 0");
            return false;
        }
        String noCheckUrl = GRSManager.c(context).getNoCheckUrl("getNewBatchPluginUrl", GRSManager.c(context).getCommonCountryCode());
        if (TextUtils.isEmpty(noCheckUrl)) {
            LogUtil.j("HiH_ProductMapConfigureUtil", "updateProductMapConfig url is empty");
            return false;
        }
        LogUtil.a("HiH_ProductMapConfigureUtil", "url = ", noCheckUrl);
        String strC = lqb.c(noCheckUrl + "com.huawei.health_common_config", "ProductMap=ProductMapConfig");
        if (TextUtils.isEmpty(strC) || Constants.NULL.equalsIgnoreCase(strC)) {
            LogUtil.j("HiH_ProductMapConfigureUtil", "updateProductMapConfig jsonResult is empty");
            return b(context, i - 1);
        }
        LogUtil.a("HiH_ProductMapConfigureUtil", "jsonResult = ", strC);
        try {
            str = context.getFilesDir().getCanonicalPath() + f40631a;
        } catch (IOException unused) {
            LogUtil.e("HiH_ProductMapConfigureUtil", "updateProductMapConfig getCanonicalPath IOException");
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("HiH_ProductMapConfigureUtil", "updateProductMapConfig filePath is empty");
            return false;
        }
        String strE = e(strC, RecommendConstants.VER);
        if (!e(context, strE)) {
            LogUtil.a("HiH_ProductMapConfigureUtil", "product map config not need update");
            return ProductMapParseUtil.c(context, str);
        }
        boolean zD = lqb.d(e(strC, RecommendConstants.DOWNLOAD_URL), str);
        LogUtil.a("HiH_ProductMapConfigureUtil", "updateProductMapConfig isDownloadSuccess = ", Boolean.valueOf(zD));
        if (!zD) {
            return b(context, i - 1);
        }
        SharedPreferenceManager.e(context, "productMapConfig", "product_map_config_last_version", strE, new StorageParams());
        if (!EnvironmentUtils.b()) {
            LogUtil.a("HiH_ProductMapConfigureUtil", "start to send product_map_update broadcast");
            Intent intent = new Intent("com.huawei.health.action.PRODUCT_MAP_UPDATE");
            intent.setPackage(BaseApplication.d());
            BaseApplication.b().sendOrderedBroadcast(intent, LocalBroadcast.f36595c);
        }
        return a(context, str);
    }

    private static boolean a(Context context, String str) {
        boolean zC = ProductMapParseUtil.c(context, str);
        LogUtil.a("HiH_ProductMapConfigureUtil", "parseJsonFileToSp isParseSuccess = ", Boolean.valueOf(zC));
        if (zC) {
            SharedPreferenceManager.e(context, "productMapConfig", "product_map_config_last_update_time", Long.toString(System.currentTimeMillis()), new StorageParams());
        }
        return zC;
    }

    private static String e(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if ("product_map".equals(jSONObject.getString(RecommendConstants.FILE_ID))) {
                    return jSONObject.getString(str2);
                }
            }
            return "";
        } catch (JSONException unused) {
            LogUtil.e("HiH_ProductMapConfigureUtil", "parseJsonString JSONException");
            return "";
        }
    }

    private static boolean e(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        String strE = SharedPreferenceManager.e(context, "productMapConfig", "product_map_config_last_version");
        ReleaseLogUtil.c("HiH_ProductMapConfigureUtil", "lastVer:", strE, " downloadVer:", str);
        return TextUtils.isEmpty(strE) || str.compareTo(strE) > 0;
    }
}
