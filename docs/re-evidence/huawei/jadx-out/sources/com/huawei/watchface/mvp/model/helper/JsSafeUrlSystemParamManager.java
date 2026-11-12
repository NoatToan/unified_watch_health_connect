package com.huawei.watchface.mvp.model.helper;

import android.text.TextUtils;
import android.webkit.URLUtil;
import android.webkit.WebView;
import com.huawei.secure.android.common.util.SafeString;
import com.huawei.secure.android.common.webview.UriUtil;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.c2;
import com.huawei.watchface.c5;
import com.huawei.watchface.e4;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.flavor.FlavorConfig;
import com.huawei.watchface.g4;
import com.huawei.watchface.mvp.model.helper.systemparam.NewSystemParamManager;
import com.huawei.watchface.mvp.model.helper.systemparam.SystemParamNames;
import com.huawei.watchface.q2;
import com.huawei.watchface.utils.ArrayUtils;
import com.huawei.watchface.utils.BackgroundTaskUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.HwSfpPolicyManagerHelper;
import com.huawei.watchface.utils.WebViewUtils;
import defpackage.ort;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class JsSafeUrlSystemParamManager {
    public static volatile JsSafeUrlSystemParamManager i;
    public static String j;
    public static List k = new CopyOnWriteArrayList();
    public static List l = new CopyOnWriteArrayList();
    public String f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f30335a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f30336b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f30337c = new HashMap();
    public volatile String d = "";
    public boolean e = true;
    public String g = "1";
    public String h = "";

    public class a implements NewSystemParamManager.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f30338a;

        public a(b bVar) {
            this.f30338a = bVar;
        }

        @Override // com.huawei.watchface.mvp.model.helper.systemparam.NewSystemParamManager.c
        public void a(int i) {
            HwLog.i("JsSafeUrlSystemParamManager", "getSystemParam() onParamPrepared enter.");
            synchronized (JsSafeUrlSystemParamManager.class) {
                JsSafeUrlSystemParamManager.this.j();
            }
            b bVar = this.f30338a;
            if (bVar != null) {
                bVar.onGetFinished();
            }
        }
    }

    public interface b {
        void onGetFinished();
    }

    public JsSafeUrlSystemParamManager() {
        g();
    }

    public static JsSafeUrlSystemParamManager getInstance() {
        if (i == null) {
            synchronized (JsSafeUrlSystemParamManager.class) {
                if (i == null) {
                    i = new JsSafeUrlSystemParamManager();
                }
            }
        }
        return i;
    }

    public void a(boolean z) {
        HwLog.d("JsSafeUrlSystemParamManager", "setWebViewUrlCache:" + z);
        this.e = z;
    }

    public void b(b bVar) {
        HwLog.i("JsSafeUrlSystemParamManager", "getSystemParamForResult enter");
        NewSystemParamManager.f();
        a(bVar);
    }

    public void c(b bVar) {
        if (ArrayUtils.isEmpty(c())) {
            NewSystemParamManager.f();
            a(bVar);
        } else {
            HwLog.i("JsSafeUrlSystemParamManager", "getSystemParam safeUrls !isEmpty");
            if (bVar != null) {
                bVar.onGetFinished();
            }
        }
    }

    public void d(String str) {
        this.d = str;
    }

    public String e() {
        return this.h;
    }

    public void f() {
        HwLog.i("JsSafeUrlSystemParamManager", "getWatchTypeSystemParamForNet() enter.");
        NewSystemParamManager.f();
        a((b) null);
    }

    public final void g() {
        BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.mvp.model.helper.JsSafeUrlSystemParamManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.i();
            }
        });
    }

    public void h() {
        HwLog.i("JsSafeUrlSystemParamManager", "initSystemParamCache() enter.");
        Set<String> setA = NewSystemParamManager.a(SystemParamNames.SYSTME_PARAM_SAFE_URL_WATCHFACE);
        HwLog.i("JsSafeUrlSystemParamManager", "watchfaceSafeUrls size:" + ArrayUtils.a(setA));
        if (!ArrayUtils.isEmpty(setA)) {
            for (String str : setA) {
                if (!this.f30335a.contains(str)) {
                    this.f30335a.add(str);
                }
            }
            HwLog.i("JsSafeUrlSystemParamManager", "watchfaceSafeUrls get cache size:" + ArrayUtils.a(this.f30335a));
        }
        Map mapA = a(NewSystemParamManager.a(SystemParamNames.SYSTME_PARAM_SAFE_URL_WATCHFACE_SENSITIVE));
        HwLog.i("JsSafeUrlSystemParamManager", "watchFaceSensitiveUrls size:" + ArrayUtils.b(mapA));
        if (q2.isEmpty(mapA)) {
            return;
        }
        this.f30337c.putAll(mapA);
        HwLog.i("JsSafeUrlSystemParamManager", "watchfaceSafeUrls get cache size:" + ArrayUtils.b(this.f30337c));
    }

    public final /* synthetic */ void i() {
        try {
            this.g = NewSystemParamManager.getSystemParam(SystemParamNames.SYSTEM_PARAM_RELEASE_LOG_SWITCH, "1");
            this.h = NewSystemParamManager.getSystemParam(SystemParamNames.SYSTEM_PARAM_RELEASE_URL_CONFIG, "");
            HwLog.i("JsSafeUrlSystemParamManager", "release log switches :" + this.g + ",releaseUrlConfig:" + this.h);
            if (Environment.getApplicationContext() != null) {
                HwWatchFaceApi.getInstance(Environment.getApplicationContext()).setReleaseLogSwitches(TextUtils.equals(this.g, "1"));
            }
            String systemParam = NewSystemParamManager.getSystemParam(SystemParamNames.SYSTEM_PARAM_SAFE_READ_PATH, "{\"whitePathList\":[\"/data/data/com.huawei.health/files/watchfacePhoto/\",\"/data/data/com.huawei.health/files/watchfaceVideo/\",\"/data/data/com.huawei.health/files/14/\",\"/data/data/com.huawei.health/files/16/\"],\"whiteFileTypeList\":[\".png\",\".jpg\",\".bmp\",\".mp4\"]}");
            FlavorConfig.safeHwLog("JsSafeUrlSystemParamManager", "h5LoadPathConfig:" + systemParam);
            JSONObject jSONObject = new JSONObject(systemParam);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("whitePathList");
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("whiteFileTypeList");
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                a(jSONArrayOptJSONArray.getString(i2));
            }
            b(k);
            for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                if (!TextUtils.isEmpty(jSONArrayOptJSONArray2.getString(i3)) && !l.contains(jSONArrayOptJSONArray2.getString(i3))) {
                    l.add(jSONArrayOptJSONArray2.getString(i3));
                }
            }
            FlavorConfig.safeHwLog("JsSafeUrlSystemParamManager", "mFilePermissionUrls:" + GsonHelper.toJson(k));
            h();
        } catch (JSONException e) {
            HwLog.e("JsSafeUrlSystemParamManager", "h5LoadPathConfig JSONException" + HwLog.printException((Exception) e));
        } catch (Exception e2) {
            HwLog.e("JsSafeUrlSystemParamManager", "h5LoadPathConfig Exception" + HwLog.printException(e2));
        }
    }

    public boolean isInSensitiveURLWhiteList(WebView webView, String str) {
        if (HwWatchFaceApi.getInstance(Environment.getApplicationContext()).isTestVersion()) {
            return true;
        }
        if (webView == null) {
            return false;
        }
        List list = (List) this.f30337c.get(str);
        return !ArrayUtils.isEmpty(list) ? a(webView, list, this.e) : a(webView, this.f30335a, true);
    }

    public boolean isInURLWhiteList(WebView webView) {
        if (HwWatchFaceApi.getInstance(Environment.getApplicationContext()).isTestVersion()) {
            return true;
        }
        if (webView != null) {
            return a(webView, this.f30335a, true);
        }
        return false;
    }

    public void j() {
        HwLog.i("JsSafeUrlSystemParamManager", "parseSystemParam() enter.");
        List<String> listC = NewSystemParamManager.c(SystemParamNames.SYSTME_PARAM_SAFE_URL_WATCHFACE);
        if (!ArrayUtils.isEmpty(listC)) {
            for (String str : listC) {
                if (!this.f30335a.contains(str)) {
                    this.f30335a.add(str);
                }
            }
        }
        Map mapA = a(NewSystemParamManager.c(SystemParamNames.SYSTME_PARAM_SAFE_URL_WATCHFACE_SENSITIVE));
        if (!q2.isEmpty(mapA)) {
            this.f30337c.putAll(mapA);
        }
        c2.a(Environment.getApplicationContext()).a(NewSystemParamManager.c(SystemParamNames.CLIENT_AUTH_ERROR));
        List listC2 = NewSystemParamManager.c(SystemParamNames.SYSTME_NODARK_URL_WATCHFACE);
        if (ArrayUtils.isEmpty(listC2)) {
            return;
        }
        this.f30336b.clear();
        this.f30336b.addAll(listC2);
    }

    public void d() {
        if (Environment.getApplicationContext() == null) {
            HwLog.i("JsSafeUrlSystemParamManager", "getPhoneTypeSystemParamForNet() getApplicationContext is null.");
            return;
        }
        if (c2.a(Environment.getApplicationContext()).w()) {
            e4.c("SystemParamFile");
            c2.a(Environment.getApplicationContext()).e(false);
        }
        if (HwWatchFaceApi.getInstance(Environment.getApplicationContext()).isBetaVersion()) {
            HwLog.i("JsSafeUrlSystemParamManager", "getPhoneTypeSystemParamForNet() isBetaVersion.");
        } else {
            NewSystemParamManager.e();
        }
    }

    public final void a(b bVar) {
        NewSystemParamManager.a(new a(bVar));
    }

    public static String a() {
        if (TextUtils.isEmpty(j)) {
            try {
                j = HwSfpPolicyManagerHelper.getFileDataUserPath();
            } catch (Exception e) {
                HwLog.e("JsSafeUrlSystemParamManager", "getFileDirPath Exception " + HwLog.printException(e));
            }
        }
        return j;
    }

    public String b() {
        this.f = NewSystemParamManager.getSystemParam(SystemParamNames.CLIENT_GREY_WATCHFACE_SITE, "");
        HwLog.i("JsSafeUrlSystemParamManager", "greyWatchface:" + this.f);
        return this.f;
    }

    public static void b(List list) {
        String strA = a();
        if (TextUtils.isEmpty(strA)) {
            HwLog.e("JsSafeUrlSystemParamManager", "unifyPath -- empty fileDirPath");
            return;
        }
        if (ArrayUtils.isEmpty(list)) {
            HwLog.e("JsSafeUrlSystemParamManager", "unifyPath -- empty mFilePermissionUrls");
            return;
        }
        FlavorConfig.safeHwLog("JsSafeUrlSystemParamManager", "unifyPath fileDirPath:" + strA);
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = (String) list.get(i2);
            if (str.startsWith("/data/data/") && !strA.startsWith("/data/data/")) {
                String strSubstring = SafeString.substring(str, 11);
                String strSubstring2 = SafeString.substring(strA, 0, strA.indexOf(SafeString.substring(strSubstring, 0, strSubstring.indexOf("/"))));
                if (!ort.d(strSubstring2)) {
                    list.add(strSubstring2 + strSubstring);
                }
            }
        }
    }

    public List c() {
        return this.f30335a;
    }

    public final boolean c(String str, List list) {
        if (!URLUtil.isHttpsUrl(str)) {
            HwLog.i("JsSafeUrlSystemParamManager", "isSafeUrl() targetUrl is not https url");
            return false;
        }
        return g4.a(str, list);
    }

    public final Map a(List list) {
        HashMap map = new HashMap();
        if (list == null) {
            HwLog.e("JsSafeUrlSystemParamManager", "empty list for sensitive urls");
            return map;
        }
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = new JSONObject((String) it.next());
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    List listA = c5.a(jSONObject.getJSONArray(next));
                    List list2 = (List) map.get(next);
                    if (ArrayUtils.isEmpty(list2)) {
                        map.put(next, listA);
                    } else if (listA != null) {
                        list2.addAll(listA);
                    }
                }
            }
        } catch (JSONException e) {
            HwLog.i("JsSafeUrlSystemParamManager", "parseSystemParamObject Exception: " + HwLog.printException((Exception) e));
        }
        return map;
    }

    public static boolean c(String str) {
        return !TextUtils.isEmpty(str) && b(str, k) && a(str, l);
    }

    public boolean b(String str) {
        if (HwWatchFaceApi.getInstance(Environment.getApplicationContext()).isTestVersion()) {
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return c(str, this.f30336b);
    }

    public static boolean b(String str, List list) {
        if (TextUtils.isEmpty(str)) {
            HwLog.i("JsSafeUrlSystemParamManager", "isPathInWhiteList | targetPath is empty");
            return false;
        }
        if (ArrayUtils.isEmpty(list)) {
            HwLog.e("JsSafeUrlSystemParamManager", "isPathInWhiteList | whiteList is empty");
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (str.startsWith((String) it.next())) {
                return true;
            }
        }
        HwLog.i("JsSafeUrlSystemParamManager", "isPathInWhiteList | targetPath not in whiteList");
        return false;
    }

    public final Map a(Set set) {
        HashMap map = new HashMap();
        if (set == null) {
            HwLog.e("JsSafeUrlSystemParamManager", "empty list for sensitive urls");
            return map;
        }
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = new JSONObject((String) it.next());
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    List listA = c5.a(jSONObject.getJSONArray(next));
                    List list = (List) map.get(next);
                    if (ArrayUtils.isEmpty(list)) {
                        map.put(next, listA);
                    } else if (listA != null) {
                        list.addAll(listA);
                    }
                }
            }
        } catch (JSONException e) {
            HwLog.i("JsSafeUrlSystemParamManager", "parseSystemParamObject Exception: " + HwLog.printException((Exception) e));
        }
        return map;
    }

    public final boolean a(WebView webView, List list, boolean z) {
        String strA;
        if (z && !TextUtils.isEmpty(this.d)) {
            strA = this.d;
        } else {
            strA = WebViewUtils.a(webView);
        }
        boolean zC = c(strA, list);
        if (!zC) {
            FlavorConfig.safeHwLog("JsSafeUrlSystemParamManager", "isInURLWhiteList -- false: " + UriUtil.getHostByURI(strA));
            HwLog.e("JsSafeUrlSystemParamManager", "isInURLWhiteList -- false");
        }
        return zC;
    }

    public static boolean a(String str, List list) {
        try {
            String strSubstring = SafeString.substring(str, str.lastIndexOf("."));
            if (!TextUtils.isEmpty(strSubstring)) {
                strSubstring = strSubstring.toLowerCase(Locale.ENGLISH);
            }
            HwLog.i("JsSafeUrlSystemParamManager", "isPathAndTypeInWhiteList fileSuffix：" + strSubstring);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (TextUtils.equals(strSubstring, (String) it.next())) {
                    return true;
                }
            }
        } catch (Exception unused) {
            HwLog.e("JsSafeUrlSystemParamManager", "isPathAndTypeInWhiteList() exception");
        }
        HwLog.i("JsSafeUrlSystemParamManager", "isFileTypeInWhiteList | targetPath not in whiteList");
        return false;
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str) || k.contains(str)) {
            return;
        }
        k.add(str);
    }
}
