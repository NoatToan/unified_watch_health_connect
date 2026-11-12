package com.huawei.watchface;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.gson.JsonArray;
import com.huawei.hms.mlsdk.common.internal.client.event.MonitorResult;
import com.huawei.openalliance.ad.beans.parameter.App;
import com.huawei.openalliance.ad.beans.parameter.RequestOptions;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.openalliance.ad.constant.VastTag;
import com.huawei.openalliance.ad.download.app.AppStatus;
import com.huawei.openalliance.ad.inter.IHiAd;
import com.huawei.openalliance.ad.inter.NativeAdLoader;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.data.INativeAd;
import com.huawei.openalliance.ad.inter.data.ImageInfo;
import com.huawei.openalliance.ad.inter.listeners.AppDownloadListener;
import com.huawei.openalliance.ad.inter.listeners.NativeAdListener;
import com.huawei.openalliance.ad.views.AppDownloadButton;
import com.huawei.openalliance.ad.views.PPSNativeView;
import com.huawei.operation.utils.Constants;
import com.huawei.secure.android.common.util.EncodeUtil;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.api.WebViewActivity;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.utils.ArrayUtils;
import com.huawei.watchface.utils.BackgroundTaskUtils;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.WebViewUtils;
import com.huawei.watchface.utils.callback.ILoginCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes45.dex */
public class o0 {
    public static final String m = "o0";
    public static volatile o0 n;
    public static final HashMap o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f30509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PPSNativeView f30510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f30511c;
    public ImageView d;
    public AppDownloadButton e;
    public PPSNativeView f;
    public List g;
    public WebView h;
    public Map i = new HashMap();
    public List j = new CopyOnWriteArrayList();
    public boolean k = false;
    public LinkedHashMap l = new LinkedHashMap();

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AppStatus f30514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AppInfo f30515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WebView f30516c;

        public b(AppStatus appStatus, AppInfo appInfo, WebView webView) {
            this.f30514a = appStatus;
            this.f30515b = appInfo;
            this.f30516c = webView;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            HashMap map = o0.o;
            if (!map.containsKey(this.f30514a) || this.f30515b == null) {
                return;
            }
            if (o0.this.k && this.f30514a == AppStatus.DOWNLOADFAILED) {
                str = "javascript:notifyDownloadResult('" + ((String) map.get(AppStatus.DOWNLOADCANCELLED)) + "','" + this.f30515b.getPackageName() + Constants.RIGHT_BRACKET;
            } else {
                str = "javascript:notifyDownloadResult('" + ((String) map.get(this.f30514a)) + "','" + this.f30515b.getPackageName() + Constants.RIGHT_BRACKET;
            }
            String str2 = o0.m;
            HwLog.i(str2, "notifyDownloadResult js: " + str);
            this.f30516c.evaluateJavascript(str, null);
            if (AppStatus.DOWNLOADED.equals(this.f30514a)) {
                o0.this.a(this.f30516c, this.f30515b);
                return;
            }
            HwLog.e(str2, "uploadDownloadStatus default..  status ==  " + this.f30514a);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f30518b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f30519c;

        public c(String str, String str2, String str3) {
            this.f30517a = str;
            this.f30518b = str2;
            this.f30519c = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            o0 o0Var = o0.this;
            boolean zA = o0.this.a("1", this.f30517a, this.f30518b, this.f30519c, o0Var.a(o0Var.h), e4.c("operator", "themename"));
            HwLog.i(o0.m, "launcherAdApp,Whether to report success:" + zA);
        }
    }

    public class d implements NativeAdListener {
        public d(j jVar) {
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.NativeAdListener
        public void onAdFailed(int i) {
            HwLog.e(o0.m, "Encourage onAdFailed: " + i);
            o0.this.c(null);
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.NativeAdListener
        public void onAdsLoaded(Map map) {
            HwLog.i(o0.m, "onAdsLoaded: enter");
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                List<INativeAd> list = (List) ((Map.Entry) it.next()).getValue();
                o0.a(list);
                if (list == null || list.isEmpty()) {
                    o0.this.g = new ArrayList();
                } else {
                    o0.this.g = list;
                }
                if (list != null && !list.isEmpty()) {
                    JsonArray jsonArray = new JsonArray();
                    for (INativeAd iNativeAd : list) {
                        AppInfo appInfo = iNativeAd.getAppInfo();
                        ImageInfo icon = iNativeAd.getIcon();
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("uniqueId", iNativeAd.getUniqueId());
                            if (o0.this.f30509a.get() != null) {
                                jSONObject.put("isValid", iNativeAd.isValid((Context) o0.this.f30509a.get()));
                            }
                            jSONObject.put("isExpired", iNativeAd.isExpired());
                            jSONObject.put("title", iNativeAd.getTitle());
                            jSONObject.put(VastTag.DESCRIPTION, iNativeAd.getDescription());
                            jSONObject.put("Lable", iNativeAd.getLabel());
                            jSONObject.put("AdSign", iNativeAd.getAdSign());
                            String str = o0.m;
                            StringBuilder sb = new StringBuilder();
                            sb.append("nativeAd.getVideoInfo is null:");
                            sb.append(iNativeAd.getVideoInfo() == null);
                            HwLog.i(str, sb.toString());
                            if (appInfo != null) {
                                jSONObject.put("AppName", appInfo.getAppName());
                                jSONObject.put("IconUrl", appInfo.getIconUrl());
                                String packageName = appInfo.getPackageName();
                                jSONObject.put("packageName", packageName);
                                o0.this.i.put(packageName, iNativeAd);
                                String permissionUrl = "";
                                jSONObject.put("VersionName", appInfo.getVersionName() == null ? "" : appInfo.getVersionName());
                                jSONObject.put("DeveloperName", appInfo.getDeveloperName() == null ? "" : appInfo.getDeveloperName());
                                jSONObject.put("AppDetailUrl", appInfo.getAppDetailUrl() == null ? "" : appInfo.getAppDetailUrl());
                                jSONObject.put("PrivacyLink", appInfo.getPrivacyLink() == null ? "" : appInfo.getPrivacyLink());
                                if (appInfo.getPermissionUrl() != null) {
                                    permissionUrl = appInfo.getPermissionUrl();
                                }
                                jSONObject.put("PermissionUrl", permissionUrl);
                            } else {
                                HwLog.e(str, iNativeAd.getTitle() + "：appInfo is null");
                            }
                            if (icon != null) {
                                jSONObject.put("appImageUrl", icon.getUrl());
                            } else {
                                Iterator<ImageInfo> it2 = iNativeAd.getImageInfos().iterator();
                                while (it2.hasNext()) {
                                    jSONObject.put("appImageUrl", it2.next().getOriginalUrl());
                                }
                            }
                            jsonArray.add(jSONObject.toString());
                        } catch (JSONException e) {
                            HwLog.e(o0.m, "onAdsLoaded JSONException" + HwLog.printException((Exception) e));
                        }
                    }
                    String string = jsonArray.toString();
                    HwLog.i(o0.m, "Encourage onAdsLoaded: " + string);
                    o0.this.c(string);
                }
            }
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30521a;

        public e(String str) {
            this.f30521a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (o0.this.h != null) {
                HwLog.i(o0.m, "notifyApplicationInfo isEmpty:" + TextUtils.isEmpty(this.f30521a));
                o0.this.h.evaluateJavascript("javascript:notifyApplicationInfo(" + this.f30521a + Constants.RIGHT_BRACKET_ONLY, null);
            }
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f30524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f30525c;

        public f(String str, Activity activity, boolean z) {
            this.f30523a = str;
            this.f30524b = activity;
            this.f30525c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = o0.m;
            HwLog.i(str, "showDownloadView runOnUiThread enter");
            List list = o0.this.g;
            if (list == null) {
                HwLog.e(str, "showDownloadView nativeAds is null");
                return;
            }
            int size = list.size();
            INativeAd iNativeAd = null;
            for (int i = 0; i < size; i++) {
                INativeAd iNativeAd2 = (INativeAd) o0.this.g.get(i);
                if (iNativeAd2.getAppInfo() != null && this.f30523a.equals(iNativeAd2.getAppInfo().getAppName())) {
                    iNativeAd = iNativeAd2;
                }
            }
            o0.this.f = (PPSNativeView) this.f30524b.findViewById(R.id.pps_root_layout);
            o0.this.d = (ImageView) this.f30524b.findViewById(R.id.pps_image_iv);
            o0.this.f30511c = (TextView) this.f30524b.findViewById(R.id.pps_label_tv);
            o0.this.e = (AppDownloadButton) this.f30524b.findViewById(R.id.pps_download_btn);
            if (iNativeAd == null) {
                HwLog.e(o0.m, "showDownloadView nativeAd is null");
            } else if (w2.a().b()) {
                o0.this.a(iNativeAd, this.f30525c);
            } else {
                HwLog.e(o0.m, "showDownloadView is showAd is false");
            }
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o0.this.e.cancel();
        }
    }

    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o0.this.e.performClick();
        }
    }

    public class i implements ILoginCallback {
        public i(o0 o0Var) {
        }

        @Override // com.huawei.watchface.utils.callback.ILoginCallback
        public void onLoginFailed(Object obj) {
            HwLog.i(o0.m, "setDownloadInfo() onLoginSuccess. ");
        }

        @Override // com.huawei.watchface.utils.callback.ILoginCallback
        public void onLoginSuccess(Object obj) {
            HwLog.i(o0.m, "setDownloadInfo() onLoginSuccess. ");
        }
    }

    public interface j {
    }

    static {
        HashMap map = new HashMap();
        o = map;
        map.put(AppStatus.INSTALLED, "OPEN");
        map.put(AppStatus.DOWNLOADING, "DOWNLOADING");
        map.put(AppStatus.DOWNLOADED, "DOWNLOADED");
        map.put(AppStatus.INSTALL, "INSTALL");
        map.put(AppStatus.INSTALLING, "INSTALLING");
        map.put(AppStatus.DOWNLOADFAILED, "DOWNLOADFAILED");
        map.put(AppStatus.DOWNLOADCANCELLED, "DOWNLOADCANCELLED");
        map.put(AppStatus.PAUSE, "PAUSE");
        map.put(AppStatus.RESUME, "RESUME");
        map.put(AppStatus.WAITING, "WAITING");
        map.put(AppStatus.DOWNLOAD, "DOWNLOAD");
    }

    public o0(Activity activity, WebView webView) {
        this.f30509a = new WeakReference(activity);
        this.h = webView;
    }

    public static o0 a(Activity activity, WebView webView) {
        if (n == null) {
            synchronized (o0.class) {
                if (n == null) {
                    n = new o0(activity, webView);
                }
            }
        }
        return n;
    }

    public static void e() {
        HwLog.i(m, "removeAll: enter");
        if (n == null) {
            return;
        }
        n.c();
        n.a();
        n.b();
        IHiAd iHiAdA = p1.a(Environment.getApplicationContext());
        if (iHiAdA != null) {
            iHiAdA.setAppDownloadListener(null);
        }
        n = null;
    }

    public final void b() {
        if (this.h != null) {
            this.h = null;
        }
    }

    public final void c(String str) {
        String str2 = m;
        HwLog.i(str2, "notifyApplicationInfo enter");
        WeakReference weakReference = this.f30509a;
        if (weakReference == null) {
            HwLog.e(str2, "notifyApplicationInfo() activity is null.");
            return;
        }
        Activity activity = (Activity) weakReference.get();
        if (activity == null) {
            HwLog.e(str2, "notifyApplicationInfo() webViewActivity is null.");
        } else {
            if (this.h == null || activity.isFinishing()) {
                return;
            }
            activity.runOnUiThread(new e(str));
        }
    }

    public void d(String str) {
        String str2 = m;
        HwLog.i(str2, "recordImpressionEvent: enter");
        INativeAd iNativeAdB = b(str);
        if (iNativeAdB == null || this.f30509a.get() == null) {
            HwLog.i(str2, "recordImpressionEvent nativeAd is null or activity is null");
        } else {
            iNativeAdB.recordImpressionEvent((Context) this.f30509a.get(), null);
        }
    }

    public final void f(String str) {
        LinkedHashMap linkedHashMap = this.l;
        if (linkedHashMap == null || linkedHashMap.size() <= 0) {
            return;
        }
        this.l.remove(str);
    }

    public void g(String str) {
        INativeAd iNativeAdB = b(str);
        if (iNativeAdB == null || this.f30509a.get() == null) {
            return;
        }
        iNativeAdB.triggerClick((Context) this.f30509a.get(), null);
    }

    public class a implements AppDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WeakReference f30512a;

        public a(WeakReference weakReference) {
            this.f30512a = weakReference;
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
        public void onAppOpen(AppInfo appInfo) {
            if (appInfo != null) {
                String appName = appInfo.getAppName();
                HwLog.i(o0.m, "onAppOpen: enter info_name:" + appName);
                o0.this.a(appInfo.getPackageName(), appName, appInfo.getUniqueId(), e4.c("operator", "themename"));
            }
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
        public void onDownloadProgress(AppInfo appInfo, int i) {
            HwLog.i(o0.m, "onDownloadProgress: progress == " + i);
            if (!CommonUtils.k((Context) o0.this.f30509a.get()) || this.f30512a.get() == null) {
                return;
            }
            o0.this.a((WebView) this.f30512a.get(), appInfo, i);
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
        public void onStatusChanged(AppStatus appStatus, AppInfo appInfo) {
            String appName = appInfo == null ? Constants.NULL : appInfo.getAppName();
            HwLog.i(o0.m, "onStatusChanged appStatus:" + appStatus + ",appInfo name:" + appName);
            if (!CommonUtils.k((Context) o0.this.f30509a.get()) || this.f30512a.get() == null) {
                return;
            }
            o0.this.a((WebView) this.f30512a.get(), appStatus, appInfo);
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
        public void onUserCancel(AppInfo appInfo) {
            HwLog.i(o0.m, "onUserCancel enter");
            o0 o0Var = o0.this;
            o0Var.k = true;
            if (!CommonUtils.k((Context) o0Var.f30509a.get()) || this.f30512a.get() == null) {
                return;
            }
            o0.this.a((WebView) this.f30512a.get(), AppStatus.DOWNLOADCANCELLED, appInfo);
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
        public void onAppOpen(String str) {
            HwLog.i(o0.m, "onAppOpen enter name: " + str);
        }
    }

    public final void b(WebView webView) {
        HwLog.i(m, "showEncourageAdInfos: enter");
        IHiAd iHiAdA = p1.a(Environment.getApplicationContext());
        if (iHiAdA != null) {
            iHiAdA.enableUserInfo(true);
        }
        a aVar = new a(new WeakReference(webView));
        if (iHiAdA != null) {
            iHiAdA.setAppDownloadListener(aVar);
        }
    }

    public final /* synthetic */ void d() {
        PPSNativeView pPSNativeView = this.f30510b;
        if (pPSNativeView != null) {
            pPSNativeView.setVisibility(8);
        }
        PPSNativeView pPSNativeView2 = this.f;
        if (pPSNativeView2 != null) {
            pPSNativeView2.setVisibility(8);
        }
    }

    public final void a(NativeAdListener nativeAdListener, String str, int i2) {
        NativeAdLoader nativeAdLoader = new NativeAdLoader(Environment.getApplicationContext(), new String[]{str}, i2, null);
        nativeAdLoader.setListener(nativeAdListener);
        nativeAdLoader.enableDirectReturnVideoAd(true);
        a(nativeAdLoader);
        nativeAdLoader.loadAds(4, false);
    }

    public static void a(NativeAdLoader nativeAdLoader) {
        if (nativeAdLoader != null && !HwWatchFaceApi.getInstance(Environment.getApplicationContext()).isOversea()) {
            HwLog.i(m, "setRequestOptions - enter");
            RequestOptions.Builder builder = new RequestOptions.Builder();
            App app = new App();
            app.setPkgname("com.huawei.android.thememanager");
            nativeAdLoader.setRequestOptions(builder.setApp(app).setNonPersonalizedAd(HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getNonPersonalizedAdSwitch(JsbMapKeyNames.H5_NPA)).setHwNonPersonalizedAd(HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getNonPersonalizedAdSwitch(JsbMapKeyNames.HW_DSP_NPA)).setThirdNonPersonalizedAd(HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getNonPersonalizedAdSwitch(JsbMapKeyNames.THIRD_DSP_NPA)).build());
            return;
        }
        HwLog.i(HwLog.TAG, "setRequestOptions -- isOversea");
    }

    public final void c() {
        String str = m;
        HwLog.i(str, "hidePpsView enter...");
        Activity activity = (Activity) this.f30509a.get();
        if (activity == null) {
            HwLog.e(str, "hidePpsView() webViewActivity is null.");
        } else {
            if (activity.isFinishing()) {
                return;
            }
            activity.runOnUiThread(new Runnable() { // from class: com.huawei.watchface.o0$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.d();
                }
            });
        }
    }

    public void e(String str) {
        String str2 = m;
        HwLog.i(str2, "recordShowStartEvent: enter");
        INativeAd iNativeAdB = b(str);
        if (iNativeAdB != null && this.f30509a.get() != null) {
            iNativeAdB.recordShowStartEvent((Context) this.f30509a.get(), null);
        } else {
            HwLog.i(str2, "recordShowStartEvent nativeAd is null or activity is null");
        }
    }

    public void a(PPSNativeView pPSNativeView) {
        this.f30510b = pPSNativeView;
    }

    public final void a(WebView webView, AppStatus appStatus, AppInfo appInfo) {
        BackgroundTaskUtils.postInMainThread(new b(appStatus, appInfo, webView));
    }

    public final void a(WebView webView, AppInfo appInfo) {
        String str = m;
        HwLog.i(str, "uploadDownloadSuccess enter");
        AppInfo appInfoA = a(appInfo);
        if (appInfoA != null) {
            HwLog.d(str, "uploadDownloadSuccess adName:" + appInfoA.getAppName());
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("uniqueId", appInfoA.getUniqueId());
                jSONObject.put("packageName", appInfoA.getPackageName());
                jSONObject.put("adName", appInfoA.getAppName());
            } catch (JSONException e2) {
                HwLog.e(m, "DownloadResultAdApp JSONException:" + HwLog.printException((Exception) e2));
            }
            webView.evaluateJavascript("javascript:notifyDownloadSuccess(" + jSONObject.toString() + Constants.RIGHT_BRACKET_ONLY, null);
            a(appInfo.getUniqueId(), appInfo.getPackageName(), appInfoA.getAppName());
        }
    }

    public final AppInfo a(AppInfo appInfo) {
        if (appInfo == null) {
            return null;
        }
        if (!TextUtils.isEmpty(appInfo.getAppName()) && !TextUtils.isEmpty(appInfo.getPackageName())) {
            return appInfo;
        }
        String str = m;
        HwLog.d(str, "appInfo getAppName:" + appInfo.getAppName() + ",getPackageName:" + appInfo.getPackageName());
        if (TextUtils.isEmpty(appInfo.getUniqueId())) {
            HwLog.d(str, "getUniqueId is empty");
            return appInfo;
        }
        if (ArrayUtils.isEmpty(this.g)) {
            HwLog.d(str, "nativeAds is empty");
            return appInfo;
        }
        for (INativeAd iNativeAd : this.g) {
            if (iNativeAd.getAppInfo() != null && appInfo.getUniqueId().equals(iNativeAd.getAppInfo().getUniqueId())) {
                HwLog.d(m, "nativeAds getAppName:" + iNativeAd.getAppInfo().getAppName() + ",getPackageName:" + iNativeAd.getAppInfo().getPackageName());
                return iNativeAd.getAppInfo();
            }
        }
        return appInfo;
    }

    public final INativeAd b(String str) {
        String str2 = m;
        HwLog.i(str2, "getNativeAdByPackageName: enter");
        if (!TextUtils.isEmpty(str)) {
            if (ArrayUtils.b(this.i) > 0) {
                return (INativeAd) this.i.get(str);
            }
            HwLog.i(str2, "getNativeAdByAppName mNativeAdMap size of " + ArrayUtils.b(this.i));
            return null;
        }
        HwLog.i(str2, "getNativeAdByAppName appName is empty");
        return null;
    }

    public String b(String str, String str2, String str3, String str4, String str5) {
        String accessToken = HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getAccessToken();
        if (this.f30509a.get() == null) {
            return "";
        }
        r4 r4Var = new r4(str, str3, str2, str4, accessToken, str5);
        String str6 = r4Var.b(r4Var.f()).retCode;
        HwLog.i(m, "reportServer , retCode is empty: " + TextUtils.isEmpty(str6));
        return str6;
    }

    public final void a(final WebView webView, AppInfo appInfo, int i2) {
        String packageName = appInfo != null ? appInfo.getPackageName() : "";
        HwLog.i(m, "uploadDownloaingProgress params packageName:" + packageName + ",progress:" + i2);
        if (TextUtils.isEmpty(packageName) || i2 > 100 || i2 <= 0) {
            return;
        }
        List list = this.j;
        if (list != null) {
            list.remove(packageName);
        }
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("packageName", packageName);
            jSONObject.put("progress", i2);
            BackgroundTaskUtils.postInMainThread(new Runnable() { // from class: com.huawei.watchface.o0$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    o0.a(webView, jSONObject);
                }
            });
        } catch (JSONException e2) {
            HwLog.e(m, "uploadDownloaingProgress JSONException:" + HwLog.printException((Exception) e2));
        }
    }

    public final void b(String str, String str2) {
        LinkedHashMap linkedHashMap = this.l;
        if (linkedHashMap != null) {
            linkedHashMap.put(str, str2);
        }
    }

    public static /* synthetic */ void a(WebView webView, JSONObject jSONObject) {
        if (webView == null) {
            HwLog.i(m, "uploadDownloaingProgress webView is null.");
            return;
        }
        webView.evaluateJavascript("javascript:notifyDownloadingPpsProgress(" + jSONObject.toString() + Constants.RIGHT_BRACKET_ONLY, null);
    }

    public final void a(String str, String str2, String str3) {
        HwLog.i(m, "launcherAdApp: enter");
        BackgroundTaskUtils.submit(new c(str2, str3, str));
    }

    public static byte[] a(String str) {
        if (str == null) {
            return new byte[0];
        }
        int length = str.length();
        if (length % 2 != 0) {
            return new byte[0];
        }
        String upperCase = str.toUpperCase(Locale.getDefault());
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = upperCase.charAt(i2);
            if (('0' > cCharAt || cCharAt > '9') && ('A' > cCharAt || cCharAt > 'F')) {
                return new byte[0];
            }
        }
        int i3 = length / 2;
        byte[] bArr = new byte[i3];
        byte[] bArr2 = new byte[2];
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            bArr2[0] = (byte) upperCase.charAt(i5);
            int i6 = i5 + 2;
            bArr2[1] = (byte) upperCase.charAt(i5 + 1);
            for (int i7 = 0; i7 < 2; i7++) {
                byte b2 = bArr2[i7];
                bArr2[i7] = (byte) (b2 - ((65 > b2 || b2 > 70) ? (byte) 48 : (byte) 55));
            }
            bArr[i4] = (byte) ((bArr2[0] << 4) | bArr2[1]);
            i4++;
            i5 = i6;
        }
        return bArr;
    }

    public static String a(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        char[] cArr2 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int i2 = 0;
        int i3 = 0;
        while (i3 < bArr.length) {
            byte b2 = bArr[i3];
            cArr[i2] = cArr2[(b2 >>> 4) & 15];
            cArr[i2 + 1] = cArr2[b2 & 15];
            i3++;
            i2 += 2;
        }
        return new String(cArr);
    }

    public void a() {
        if (ArrayUtils.b(this.i) > 0) {
            this.i.clear();
        }
    }

    public void a(String str, int i2, j jVar) {
        HwLog.i(m, "initEncourageAdHelper: enter");
        a(new d(jVar), str, i2);
        WebView webView = this.h;
        if (webView != null) {
            b(webView);
        }
    }

    public void a(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(str, i2, (j) null);
    }

    public void a(String str, boolean z) {
        String str2 = m;
        HwLog.i(str2, "showDownloadView: enter isUserCancel:" + z);
        if (TextUtils.isEmpty(str)) {
            HwLog.e(str2, "showDownloadView() appName is empty.");
            return;
        }
        WeakReference weakReference = this.f30509a;
        if (weakReference == null) {
            HwLog.e(str2, "showDownloadView() activity is null.");
            return;
        }
        Activity activity = (Activity) weakReference.get();
        if (activity == null) {
            HwLog.e(str2, "showDownloadView() webViewActivity is null.");
        } else {
            if (!(activity instanceof WebViewActivity) || activity.isFinishing()) {
                return;
            }
            activity.runOnUiThread(new f(str, activity, z));
        }
    }

    public final void a(INativeAd iNativeAd, boolean z) {
        PPSNativeView pPSNativeView;
        String str = m;
        HwLog.i(str, "showPpsView enter...");
        if (this.f30509a.get() == null || !iNativeAd.isValid((Context) this.f30509a.get()) || (pPSNativeView = this.f) == null) {
            return;
        }
        a(pPSNativeView);
        this.f.register(iNativeAd);
        this.f.setOnNativeAdClickListener(new w2.a());
        List<ImageInfo> imageInfos = iNativeAd.getImageInfos();
        if (imageInfos == null) {
            HwLog.i(str, "showPpsView imageInfos ==null");
            return;
        }
        Iterator<ImageInfo> it = imageInfos.iterator();
        String url = "";
        while (it.hasNext()) {
            url = it.next().getOriginalUrl();
        }
        ImageInfo icon = iNativeAd.getIcon();
        if (icon != null) {
            url = icon.getUrl();
        }
        int i2 = R.drawable.watchface_res_detail_pps_bottom_default;
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.watchface_ic_public_search);
        }
        h1.a((Context) this.f30509a.get(), url, i2, i2, this.d);
        a(iNativeAd, this.f, z);
    }

    public final void a(INativeAd iNativeAd, PPSNativeView pPSNativeView, boolean z) {
        TextView textView;
        TextView textView2;
        if (this.e == null || this.f30509a.get() == null) {
            return;
        }
        this.k = z;
        boolean zRegister = pPSNativeView.register(this.e);
        w2.a(pPSNativeView);
        if (z) {
            this.e.post(new g());
            return;
        }
        this.e.post(new h());
        if (zRegister) {
            this.e.refreshStatus();
            if (!TextUtils.isEmpty(iNativeAd.getTitle()) && (textView2 = this.f30511c) != null) {
                textView2.setText(iNativeAd.getTitle());
            }
            AppInfo appInfo = iNativeAd.getAppInfo();
            if (appInfo == null || (textView = this.f30511c) == null) {
                return;
            }
            textView.setText(appInfo.getAppName());
            return;
        }
        this.e.setVisibility(8);
    }

    public void a(String str, String str2, String str3, String str4) {
        String str5 = m;
        HwLog.i(str5, "openApp enter");
        String strA = a(this.h);
        if (this.j == null) {
            this.j = new CopyOnWriteArrayList();
        }
        if (this.j.contains(str)) {
            WeakReference weakReference = this.f30509a;
            if (weakReference == null) {
                HwLog.e(str5, "openApp() activity is null.");
                return;
            }
            Activity activity = (Activity) weakReference.get();
            if (activity == null) {
                HwLog.e(str5, "openApp() webViewActivity is null.");
                return;
            } else {
                CommonUtils.a(activity, activity.getPackageManager().getLaunchIntentForPackage(str));
                a(str, MonitorResult.SUCCESS);
                return;
            }
        }
        boolean zA = a("2", str, str2, str3, strA, str4);
        HwLog.i(str5, "openApp, result : " + zA + " adName: " + str2);
        if (zA) {
            this.j.add(str);
            WeakReference weakReference2 = this.f30509a;
            if (weakReference2 == null) {
                HwLog.e(str5, "openApp() activity is null.");
                return;
            }
            Activity activity2 = (Activity) weakReference2.get();
            if (activity2 == null) {
                HwLog.e(str5, "openApp() webViewActivity is null.");
                return;
            } else {
                CommonUtils.a(activity2, activity2.getPackageManager().getLaunchIntentForPackage(str));
                a(str, MonitorResult.SUCCESS);
                return;
            }
        }
        a(str, "FAILURE");
    }

    public final void a(String str, final String str2) {
        String strEncodeForJavaScript = EncodeUtil.encodeForJavaScript(str);
        HwLog.i(m, "notifyOpenApp enter encodePackageName ==" + strEncodeForJavaScript);
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("packageName", strEncodeForJavaScript);
            jSONObject.put("status", str2);
            BackgroundTaskUtils.postInMainThread(new Runnable() { // from class: com.huawei.watchface.o0$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(str2, jSONObject);
                }
            });
        } catch (JSONException e2) {
            HwLog.e(m, "notifyOpenApp JSONException:" + HwLog.printException((Exception) e2));
        }
    }

    public final /* synthetic */ void a(String str, JSONObject jSONObject) {
        if (this.h != null) {
            HwLog.i(m, "notifyOpenApp openApp status: " + str);
            this.h.evaluateJavascript("javascript:notifyOpenApp(" + jSONObject.toString() + Constants.RIGHT_BRACKET_ONLY, null);
        }
    }

    public final boolean a(String str, String str2, String str3, String str4, String str5, String str6) {
        String str7 = m;
        HwLog.i(str7, "isReportServer: enter");
        a(str2, str3, str4, str5, str6);
        String strB = b(str, str3, str4, str5, str6);
        if (TextUtils.equals("0", strB)) {
            f(str2);
            return true;
        }
        if (TextUtils.equals("9010120001", strB)) {
            HwLog.e(str7, "isReportServer token invalid : " + str);
            if (TextUtils.equals("1", str)) {
                b(str2, str);
            }
            HwWatchFaceApi.getInstance(Environment.getApplicationContext()).loginByHealthHms(Environment.getApplicationContext(), new i(this));
            return false;
        }
        if ((TextUtils.equals("9010410006", strB) || TextUtils.isEmpty(strB)) && TextUtils.equals("1", str)) {
            HwLog.e(str7, "isReportServer the first device change , download failure ,retCode is empty: " + TextUtils.isEmpty(strB));
            b(str2, str);
            return false;
        }
        HwLog.e(str7, "isReportServer,failure: " + strB);
        return false;
    }

    public final void a(String str, String str2, String str3, String str4, String str5) {
        String str6 = m;
        HwLog.i(str6, "downloadTypeRereportServer: enter");
        LinkedHashMap linkedHashMap = this.l;
        if (linkedHashMap == null || linkedHashMap.size() <= 0) {
            return;
        }
        String str7 = (String) this.l.get(str);
        if (TextUtils.isEmpty(str7) || !TextUtils.equals("1", str7)) {
            return;
        }
        HwLog.e(str6, "downloadTypeReportServer  token invalid " + str + " retCode :" + b(str7, str2, str3, str4, str5));
        f(str);
    }

    public static void a(List list) {
        if (ArrayUtils.isEmpty(list)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            INativeAd iNativeAd = (INativeAd) it.next();
            if (a(iNativeAd)) {
                HwLog.d(m, "delete INativeAd title:" + iNativeAd.getTitle() + ",UniqueId:" + iNativeAd.getUniqueId());
                it.remove();
            }
        }
    }

    public static boolean a(INativeAd iNativeAd) {
        AppInfo appInfo;
        if (iNativeAd == null || (appInfo = iNativeAd.getAppInfo()) == null) {
            return true;
        }
        if (TextUtils.isEmpty(appInfo.getDownloadUrl()) && TextUtils.isEmpty(appInfo.getSafeDownloadUrl()) && TextUtils.isEmpty(appInfo.getSha256()) && 0 == appInfo.getFileSize()) {
            return true;
        }
        return TextUtils.isEmpty(appInfo.getAppName()) || TextUtils.isEmpty(appInfo.getDeveloperName()) || TextUtils.isEmpty(appInfo.getVersionName()) || TextUtils.isEmpty(appInfo.getAppDetailUrl()) || TextUtils.isEmpty(appInfo.getPrivacyLink()) || TextUtils.isEmpty(appInfo.getPermissionUrl());
    }

    public final String a(WebView webView) {
        String strC = e4.c("campId", "themename");
        String str = m;
        HwLog.i(str, "downloaded report campId={" + strC + "}");
        if (webView != null && TextUtils.isEmpty(strC)) {
            String strA = WebViewUtils.a(webView);
            if (!TextUtils.isEmpty(strA)) {
                String strA2 = f4.a(strA, "(?<=/camp/).*?(?=/index.html)");
                HwLog.i(str, "getCampId getMatchSubString " + strA2);
                return strA2;
            }
        }
        return strC;
    }
}
