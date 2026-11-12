package com.huawei.watchface.mvp.model.webview;

import android.content.Context;
import android.webkit.WebView;
import com.huawei.watchface.api.PortraitListener;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.f5;
import com.huawei.watchface.manager.WatchFaceKaleidoscopeManager;
import com.huawei.watchface.mvp.model.datatype.DownloadQueryBean;
import com.huawei.watchface.mvp.model.datatype.TryoutBean;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.mvp.model.helper.JsSafeUrlSystemParamManager;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.callback.PluginOperationAdapter;
import com.huawei.watchface.utils.callback.SendCurrentUrlCallback;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import com.huawei.watchface.utils.constants.WebViewConstant$InterfaceName;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes20.dex */
public class JsInteractAddition {
    public static final String HI_TOP_ID = "hiTopId";
    public static final String HI_TOP_URL = "url";
    public static final String HI_TOP_VERSION = "version";
    public static final String d = "JsInteractAddition";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f30379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f30380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PortraitListener f30381c;

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final JsInteractAddition f30382a = new JsInteractAddition();
    }

    public static JsInteractAddition getInstance() {
        return a.f30382a;
    }

    public void a(String str) {
        PortraitListener portraitListener = this.f30381c;
        if (portraitListener != null) {
            portraitListener.onStartSeparationPortrait(str);
        }
    }

    public void b(WebView webView) {
        this.f30379a = new WeakReference(webView);
    }

    public void c(Context context, SendCurrentUrlCallback sendCurrentUrlCallback, PluginOperationAdapter pluginOperationAdapter) {
        if (JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(a(), WebViewConstant$InterfaceName.INTERFACE_CHOOSE_WEAR_TO_CLIP)) {
            if (pluginOperationAdapter != null) {
                pluginOperationAdapter.chooseWearToClip();
            } else {
                HwLog.e(d, "choosePicToClip error adapter is null");
            }
        }
    }

    public String d(Context context, SendCurrentUrlCallback sendCurrentUrlCallback, PluginOperationAdapter pluginOperationAdapter) {
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(a())) {
            return "";
        }
        String albumPackageName = pluginOperationAdapter != null ? pluginOperationAdapter.getAlbumPackageName() : "";
        HwLog.i(d, "getAlbumPackageName return:" + albumPackageName);
        return albumPackageName;
    }

    public String e(Context context, SendCurrentUrlCallback sendCurrentUrlCallback, PluginOperationAdapter pluginOperationAdapter) {
        return (JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(a(), "getTokenAndDeviceType") && pluginOperationAdapter != null) ? pluginOperationAdapter.getTokenAndDeviceType() : "";
    }

    public int f(Context context, SendCurrentUrlCallback sendCurrentUrlCallback, PluginOperationAdapter pluginOperationAdapter) {
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(a())) {
            return -1;
        }
        if (pluginOperationAdapter != null) {
            return pluginOperationAdapter.getWatchFaceInstallState();
        }
        HwLog.e(d, "getWatchFaceNames error adapter is null");
        return -1;
    }

    public String g(Context context, SendCurrentUrlCallback sendCurrentUrlCallback, PluginOperationAdapter pluginOperationAdapter) {
        if (!JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(a(), "getWatchFaceUrlBase")) {
            return "";
        }
        String str = d;
        HwLog.i(str, "getWatchFaceUrlBase");
        if (pluginOperationAdapter != null) {
            return pluginOperationAdapter.getWatchFaceUrlBase();
        }
        HwLog.e(str, "getWatchFaceUrlBase error adapter is null");
        return "";
    }

    public void setPortraitListener(PortraitListener portraitListener) {
        this.f30381c = portraitListener;
    }

    public void b(Context context, SendCurrentUrlCallback sendCurrentUrlCallback, PluginOperationAdapter pluginOperationAdapter, String str) {
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(a())) {
            if (pluginOperationAdapter != null) {
                pluginOperationAdapter.getWatchFaceNames(str);
            } else {
                HwLog.e(d, "getWatchFaceNames error adapter is null");
            }
        }
    }

    public void a(WebView webView) {
        this.f30380b = new WeakReference(webView);
    }

    public WebView a() {
        WeakReference weakReference = this.f30380b;
        if (weakReference != null && weakReference.get() != null) {
            HwLog.d(d, "get magic webView");
            return (WebView) this.f30380b.get();
        }
        WeakReference weakReference2 = this.f30379a;
        if (weakReference2 != null) {
            return (WebView) weakReference2.get();
        }
        return null;
    }

    public String e(PluginOperationAdapter pluginOperationAdapter) {
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(a())) {
            return "";
        }
        return pluginOperationAdapter.getWatchFaceSortList();
    }

    public String f(PluginOperationAdapter pluginOperationAdapter) {
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(a())) {
            return "";
        }
        return pluginOperationAdapter.getWatchFaceSortState();
    }

    public boolean a(SendCurrentUrlCallback sendCurrentUrlCallback, PluginOperationAdapter pluginOperationAdapter) {
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(a())) {
            return false;
        }
        boolean zJ = CommonUtils.J();
        HwLog.i(d, "isTahitiForWeb() isTahiti: " + zJ);
        return zJ;
    }

    public void b(Context context, SendCurrentUrlCallback sendCurrentUrlCallback, PluginOperationAdapter pluginOperationAdapter, HashMap map) {
        String str = d;
        HwLog.i(str, "getWatchFaceThemeWearInfo");
        if (JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(a(), WebViewConstant$InterfaceName.INTERFACE_GETWATCHFACETHEMEALBUMINFO)) {
            HwLog.i(str, "getWatchFaceThemeWearInfo enter");
            if (pluginOperationAdapter != null) {
                HwLog.i(str, "getWatchFaceThemeWearInfo enter adapter is not null");
                pluginOperationAdapter.getWatchFaceThemeWearInfo((String) map.get(HI_TOP_ID), (String) map.get("version"), (String) map.get("url"), (String) map.get(WatchFaceConstant.HASHCODE));
            }
        }
    }

    public String c(PluginOperationAdapter pluginOperationAdapter) {
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(a())) {
            return "";
        }
        String videoAlbumPackageName = pluginOperationAdapter != null ? pluginOperationAdapter.getVideoAlbumPackageName() : "";
        HwLog.i(d, "getVideoAlbumPackageName retStr: " + videoAlbumPackageName);
        return videoAlbumPackageName;
    }

    public void d(Context context, SendCurrentUrlCallback sendCurrentUrlCallback, PluginOperationAdapter pluginOperationAdapter, String str) {
        if (JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(a(), WebViewConstant$InterfaceName.INTERFACE_SAVEWATCHFACETHEMEALBUMINFO) && pluginOperationAdapter != null) {
            pluginOperationAdapter.saveWatchFaceThemeWearInfo(str);
        }
    }

    public void a(Context context, SendCurrentUrlCallback sendCurrentUrlCallback, PluginOperationAdapter pluginOperationAdapter, String str, String str2) {
        if (JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(a(), "cancelInstallWatchFace")) {
            String str3 = d;
            HwLog.i(str3, "cancelInstallWatchFace hiTopId: " + str + " version:" + str2);
            if (pluginOperationAdapter != null) {
                pluginOperationAdapter.cancelInstallWatchFace(str, str2);
            } else {
                HwLog.e(str3, "cancelInstallWatchFace error adapter is null");
            }
        }
    }

    public String d(PluginOperationAdapter pluginOperationAdapter) {
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(a())) {
            return "";
        }
        return pluginOperationAdapter.getWatchFaceData();
    }

    public void c(Context context, SendCurrentUrlCallback sendCurrentUrlCallback, PluginOperationAdapter pluginOperationAdapter, String str, String str2) {
        if (JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(a(), "setWatchFaceDeleteButton")) {
            String str3 = d;
            HwLog.i(str3, "setWatchFaceDeleteId hiTopId: " + str + " version:" + str2);
            if (pluginOperationAdapter != null) {
                pluginOperationAdapter.setWatchFaceDeleteId(str, str2);
            } else {
                HwLog.e(str3, "setWatchFaceDeleteButton error adapter is null");
            }
        }
    }

    public void a(String str, PluginOperationAdapter pluginOperationAdapter) {
        if (JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(a(), "setWatchFaceSortList")) {
            pluginOperationAdapter.setWatchFaceSortList(str);
        }
    }

    public void b(Context context, SendCurrentUrlCallback sendCurrentUrlCallback, PluginOperationAdapter pluginOperationAdapter, String str, String str2) {
        if (JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(a(), "deleteWatchFace")) {
            String str3 = d;
            HwLog.i(str3, "deleteWatchFace hiTopId: " + str + " version:" + str2);
            if (pluginOperationAdapter != null) {
                pluginOperationAdapter.deleteWatchFace(str, str2);
            } else {
                HwLog.e(str3, "deleteWatchFace error adapter is null");
            }
        }
    }

    public void c(Context context, SendCurrentUrlCallback sendCurrentUrlCallback, PluginOperationAdapter pluginOperationAdapter, String str) {
        HwLog.i(d, "JsInteraction, saveWatchFaceThemeAlbumInfo");
        if (JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(a(), WebViewConstant$InterfaceName.INTERFACE_SAVEWATCHFACETHEMEALBUMINFO) && pluginOperationAdapter != null) {
            pluginOperationAdapter.saveWatchFaceThemeAlbumInfo(str);
        }
    }

    public String a(PluginOperationAdapter pluginOperationAdapter, DownloadQueryBean downloadQueryBean) {
        if (downloadQueryBean == null) {
            HwLog.w(d, "sendStartDownloadWatchFace -- tryoutBean parse failed");
            return "-2";
        }
        String str = d;
        HwLog.i(str, "sendStartDownloadWatchFace hitopId:" + downloadQueryBean.getHitopId() + ", cnTitle:" + downloadQueryBean.getCnTitle());
        if (pluginOperationAdapter != null) {
            return pluginOperationAdapter.downloadAndInstallWatchFace(downloadQueryBean);
        }
        HwLog.i(str, "sendStartDownloadWatchFace() fail mAdapter is null.");
        return "1";
    }

    public String b(PluginOperationAdapter pluginOperationAdapter) {
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(a())) {
            HwLog.e(d, "getTryOutWatchFacePackageName -- not in white list");
            return "";
        }
        String tryOutWatchFacePackageName = pluginOperationAdapter != null ? pluginOperationAdapter.getTryOutWatchFacePackageName() : "";
        HwLog.i(d, "getTryOutWatchFacePackageName retStr: " + tryOutWatchFacePackageName);
        return tryOutWatchFacePackageName;
    }

    public void a(PluginOperationAdapter pluginOperationAdapter, String str) {
        if (!JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(a(), "sendStartTryoutDownload")) {
            HwLog.w(d, "sendStartTryoutDownload -- not in white list");
            return;
        }
        TryoutBean tryoutBean = (TryoutBean) GsonHelper.fromJson(str, TryoutBean.class);
        if (tryoutBean == null) {
            HwLog.w(d, "sendStartTryoutDownload -- tryoutBean parse failed");
            return;
        }
        if (pluginOperationAdapter != null) {
            HwLog.i(d, "sendStartTryoutDownload() hiTopId:" + tryoutBean.getTryOutHiTopId() + " cnTitle:" + tryoutBean.getCnTitle() + " version:" + tryoutBean.getVersion() + " productId:" + tryoutBean.getProductId() + " resourceType:" + tryoutBean.getResourceType());
            f5.c("");
            pluginOperationAdapter.installTryoutWatchFace(tryoutBean);
            return;
        }
        HwLog.i(d, "sendStartTryoutDownload() fail mAdapter is null.");
    }

    public void b(Context context, SendCurrentUrlCallback sendCurrentUrlCallback, PluginOperationAdapter pluginOperationAdapter) {
        if (JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(a(), WebViewConstant$InterfaceName.INTERFACE_CHOOSEPICTOCLIP)) {
            if (pluginOperationAdapter != null) {
                pluginOperationAdapter.choosePicToClip();
            } else {
                HwLog.e(d, "choosePicToClip error adapter is null");
            }
        }
    }

    public void b(PluginOperationAdapter pluginOperationAdapter, String str) {
        if (JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(a(), WebViewConstant$InterfaceName.INTERFACE_GETWATCHFACETHEMEALBUMINFO) && pluginOperationAdapter != null) {
            pluginOperationAdapter.syncWatchFaceThemeAlbumInfo(str);
        }
    }

    public String a(PluginOperationAdapter pluginOperationAdapter) {
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(a())) {
            return "";
        }
        String kaleidoscopePackageName = pluginOperationAdapter != null ? pluginOperationAdapter.getKaleidoscopePackageName() : "";
        HwLog.i(d, "getKaleidoscopePackageName retStr: " + kaleidoscopePackageName);
        return kaleidoscopePackageName;
    }

    public void a(Context context, SendCurrentUrlCallback sendCurrentUrlCallback, PluginOperationAdapter pluginOperationAdapter) {
        if (JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(a(), WebViewConstant$InterfaceName.INTERFACE_CHOOSEPICTOCLIP)) {
            if (pluginOperationAdapter != null) {
                pluginOperationAdapter.choosePicToH5Clip();
            } else {
                HwLog.e(d, "choosePicToClip error adapter is null");
            }
        }
    }

    public void a(Context context, SendCurrentUrlCallback sendCurrentUrlCallback, PluginOperationAdapter pluginOperationAdapter, String str) {
        HwLog.i(d, "JsInteraction, saveWatchFaceThemeAlbumInfo");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(a()) && pluginOperationAdapter != null) {
            pluginOperationAdapter.applyWatchFaceThemeAlbumInfo(str);
        }
    }

    public void a(Context context, SendCurrentUrlCallback sendCurrentUrlCallback, PluginOperationAdapter pluginOperationAdapter, HashMap map) {
        if (JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(a(), WebViewConstant$InterfaceName.INTERFACE_GETWATCHFACETHEMEALBUMINFO) && pluginOperationAdapter != null) {
            pluginOperationAdapter.getWatchFaceThemeAlbumInfo((String) map.get(HI_TOP_ID), (String) map.get("version"), (String) map.get("url"), (String) map.get(WatchFaceConstant.HASHCODE));
        }
    }

    public String a(WebView webView, PluginOperationAdapter pluginOperationAdapter) {
        return (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(webView) && pluginOperationAdapter != null) ? pluginOperationAdapter.getWearPackageName() : "";
    }

    public void a(HashMap map, WebView webView) {
        HwLog.i(d, "getWatchFaceKaleidoscopeInfo() enter.");
        if (JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(a(), WebViewConstant$InterfaceName.INTERFACE_GETWATCHFACETHEMEALBUMINFO)) {
            WatchFaceKaleidoscopeManager.getInstance(Environment.getApplicationContext()).getWatchFaceInfo((String) map.get(HI_TOP_ID), (String) map.get("version"), (String) map.get("url"), (String) map.get(WatchFaceConstant.HASHCODE));
        }
    }
}
