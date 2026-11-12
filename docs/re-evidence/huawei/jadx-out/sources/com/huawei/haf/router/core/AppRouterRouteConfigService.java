package com.huawei.haf.router.core;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.datasource.cache.CacheDataSink;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.router.AppRouterUtils;
import health.compact.a.LogUtil;
import health.compact.a.ProcessUtil;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class AppRouterRouteConfigService {
    private final Map<String, RouteConfigInfo> e = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, RouteConfigInfo> f6051b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, RouteConfigInfo> f6052c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Uri> f6050a = new HashMap();
    private Uri d = null;

    AppRouterRouteConfigService() {
        b(BaseApplication.b());
    }

    String b(String str) {
        RouteConfigInfo routeConfigInfoG = g(str);
        if (routeConfigInfoG == null) {
            return null;
        }
        return !TextUtils.isEmpty(routeConfigInfoG.f6055c) ? routeConfigInfoG.f6055c : str;
    }

    Uri c(Uri uri) {
        RouteConfigInfo routeConfigInfoG = g(uri.getPath());
        if (routeConfigInfoG == null) {
            return null;
        }
        if (!TextUtils.isEmpty(routeConfigInfoG.d)) {
            String query = uri.getQuery();
            if (!TextUtils.isEmpty(query) && query.startsWith(routeConfigInfoG.d)) {
                uri = b(uri, query.substring(routeConfigInfoG.d.length()));
            }
        }
        return d(uri, routeConfigInfoG.f6055c, routeConfigInfoG.e);
    }

    Uri d(String str) {
        return this.f6050a.get(str);
    }

    Uri c() {
        return this.d;
    }

    boolean j(String str) {
        return this.f6052c.containsKey(str);
    }

    String a(String str) {
        RouteConfigInfo routeConfigInfo = this.f6052c.get(str);
        return routeConfigInfo != null ? routeConfigInfo.f6054b : "";
    }

    String e(String str) {
        RouteConfigInfo routeConfigInfo = this.f6052c.get(str);
        return routeConfigInfo != null ? routeConfigInfo.h : "";
    }

    int c(String str) {
        RouteConfigInfo routeConfigInfo = this.f6052c.get(str);
        if (routeConfigInfo != null) {
            return routeConfigInfo.f6053a;
        }
        return 0;
    }

    boolean d(String str, String str2, RouteConfigInfo routeConfigInfo) {
        if (!str2.startsWith("/router/")) {
            return true;
        }
        RouteConfigInfo routeConfigInfo2 = routeConfigInfo == null ? this.f6052c.get(str2) : routeConfigInfo;
        if (routeConfigInfo == null && routeConfigInfo2 != null && !TextUtils.isEmpty(routeConfigInfo2.f6054b)) {
            return false;
        }
        if (routeConfigInfo2 != null && (!TextUtils.isEmpty(routeConfigInfo2.f6055c) || !TextUtils.isEmpty(routeConfigInfo2.f6054b))) {
            return true;
        }
        LogUtil.e(str, "route config error. path=", str2, " not allowed real exist,", " need config mappingPath and/or pretreatmentPath");
        return false;
    }

    private static Uri b(Uri uri, String str) {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        if (!TextUtils.isEmpty(str)) {
            builderBuildUpon.encodedQuery(str);
        }
        return builderBuildUpon.build();
    }

    private static Uri d(Uri uri, String str, String str2) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        if (!TextUtils.isEmpty(str)) {
            builderBuildUpon.encodedPath(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            b(builderBuildUpon, uri.getQueryParameterNames(), str2);
        }
        return builderBuildUpon.build();
    }

    private static void b(Uri.Builder builder, Set<String> set, String str) {
        int i = 0;
        do {
            int iIndexOf = str.indexOf(38, i);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i);
            if (iIndexOf2 > iIndexOf || iIndexOf2 == -1) {
                iIndexOf2 = iIndexOf;
            }
            String strSubstring = str.substring(i, iIndexOf2);
            if (!TextUtils.isEmpty(strSubstring)) {
                String strSubstring2 = iIndexOf2 == iIndexOf ? "" : str.substring(iIndexOf2 + 1, iIndexOf);
                String strDecode = Uri.decode(strSubstring);
                if (!set.contains(strDecode)) {
                    builder.appendQueryParameter(strDecode, Uri.decode(strSubstring2));
                }
            }
            i = iIndexOf + 1;
        } while (i < str.length());
    }

    private JSONObject c(Context context) throws JSONException, IOException {
        InputStream inputStreamOpen = context.getAssets().open("router_plugins/route_config.json");
        if (inputStreamOpen == null) {
            LogUtil.b("HAF_RouteConfig", "not router map config in assets.");
            return null;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject(FileUtils.e(inputStreamOpen, CacheDataSink.DEFAULT_FRAGMENT_SIZE));
            LogUtil.b("HAF_RouteConfig", "read router map config from assets, times=", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            return jSONObject;
        } finally {
            FileUtils.a(inputStreamOpen);
        }
    }

    private void b(Context context) {
        try {
            JSONObject jSONObjectC = c(context);
            if (jSONObjectC == null) {
                return;
            }
            JSONArray jSONArrayOptJSONArray = jSONObjectC.optJSONArray("routeMap");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    c(jSONArrayOptJSONArray.getJSONObject(i));
                }
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObjectC.optJSONArray("groupMap");
            if (jSONArrayOptJSONArray2 != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                    a(jSONArrayOptJSONArray2.getJSONObject(i2));
                }
            }
            JSONArray jSONArrayOptJSONArray3 = jSONObjectC.optJSONArray("remoteMap");
            if (jSONArrayOptJSONArray3 != null) {
                for (int i3 = 0; i3 < jSONArrayOptJSONArray3.length(); i3++) {
                    b(jSONArrayOptJSONArray3.getJSONObject(i3));
                }
            }
            String strC = c(jSONObjectC, "defaultRouteUri");
            if (!TextUtils.isEmpty(strC)) {
                this.d = Uri.parse(strC);
            }
            LogUtil.b("HAF_RouteConfig", "parseRouterInfo success. routeMap=(", Integer.valueOf(this.e.size()), ", ", Integer.valueOf(this.f6051b.size()), "), routeInfoMap=", Integer.valueOf(this.f6052c.size()), ", remoteMap=", Integer.valueOf(this.f6050a.size()));
        } catch (IOException | JSONException e) {
            LogUtil.e("HAF_RouteConfig", "parseRouterInfo ex=", LogUtil.c(e));
        }
    }

    private void c(JSONObject jSONObject) {
        try {
            d(jSONObject.getString("matchPaths").split("#"), new RouteConfigInfo(jSONObject));
        } catch (JSONException e) {
            LogUtil.e("HAF_RouteConfig", "parseRouteInfo ex=", LogUtil.c(e));
        }
    }

    private void a(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("pluginName");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            AppRouterRouteInfoLoader.d(string, jSONObject.getString("moduleOrGroupList").split("#"));
        } catch (JSONException e) {
            LogUtil.e("HAF_RouteConfig", "parseGroupMap ex=", LogUtil.c(e));
        }
    }

    private void b(JSONObject jSONObject) {
        try {
            String strD = d(jSONObject);
            if (TextUtils.isEmpty(strD)) {
                return;
            }
            String string = jSONObject.getString("authoritiesUri");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.f6050a.put(strD, Uri.parse(string));
        } catch (JSONException e) {
            LogUtil.e("HAF_RouteConfig", "parseRemoteMap ex=", LogUtil.c(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(JSONObject jSONObject, String str) {
        String strOptString = jSONObject.optString(str);
        return !TextUtils.isEmpty(strOptString) ? strOptString.intern() : strOptString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(JSONObject jSONObject) {
        if (jSONObject.has("runningProcess")) {
            return ProcessUtil.e(jSONObject.optString("runningProcess"));
        }
        return null;
    }

    private void d(String[] strArr, RouteConfigInfo routeConfigInfo) {
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                b(str, routeConfigInfo);
            }
        }
        if (TextUtils.isEmpty(routeConfigInfo.f6055c)) {
            return;
        }
        a(routeConfigInfo.f6055c, routeConfigInfo);
    }

    private void a(String str, RouteConfigInfo routeConfigInfo) {
        d("HAF_RouteConfig", str, routeConfigInfo);
        this.f6052c.put(str, routeConfigInfo);
        if (routeConfigInfo.f6053a > 0 || !TextUtils.isEmpty(routeConfigInfo.h)) {
            LogUtil.c("HAF_RouteConfig", "path=", str, ", runningProcess=", routeConfigInfo.h, ", extras=", AppRouterUtils.a(routeConfigInfo.f6053a));
        }
    }

    private void b(String str, RouteConfigInfo routeConfigInfo) {
        boolean z;
        if (str.endsWith("/*")) {
            String strSubstring = str.substring(0, str.length() - 1);
            z = f(strSubstring) != null;
            this.f6051b.put(strSubstring, routeConfigInfo);
            if (TextUtils.isEmpty(routeConfigInfo.f6055c)) {
                LogUtil.e("HAF_RouteConfig", "route config error. path=", str, " need config mappingPath");
            }
        } else {
            String strIntern = str.intern();
            z = this.e.put(strIntern, routeConfigInfo) != null;
            if (TextUtils.isEmpty(routeConfigInfo.f6055c)) {
                a(strIntern, routeConfigInfo);
            }
        }
        if (z) {
            LogUtil.e("HAF_RouteConfig", "route config error. repeat path=", str);
        }
    }

    private RouteConfigInfo g(String str) {
        RouteConfigInfo routeConfigInfo = this.e.get(str);
        return routeConfigInfo != null ? routeConfigInfo : f(str);
    }

    private RouteConfigInfo f(String str) {
        if (this.f6051b.isEmpty()) {
            return null;
        }
        for (Map.Entry<String, RouteConfigInfo> entry : this.f6051b.entrySet()) {
            if (str.startsWith(entry.getKey())) {
                return entry.getValue();
            }
        }
        return null;
    }

    static class RouteConfigInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f6053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f6054b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f6055c;
        final String d;
        final String e;
        final String h;

        RouteConfigInfo(JSONObject jSONObject) {
            this.d = jSONObject.optString("removeQueryPrefix");
            this.f6055c = AppRouterRouteConfigService.c(jSONObject, "mappingPath");
            this.e = jSONObject.optString("addParameters");
            this.f6054b = AppRouterRouteConfigService.c(jSONObject, "pretreatmentPath");
            this.f6053a = AppRouterUtils.b(jSONObject.optString("pathExtras"));
            this.h = AppRouterRouteConfigService.d(jSONObject);
        }
    }
}
