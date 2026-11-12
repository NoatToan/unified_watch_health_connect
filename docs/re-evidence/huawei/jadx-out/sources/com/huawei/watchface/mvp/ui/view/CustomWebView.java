package com.huawei.watchface.mvp.ui.view;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.media3.common.C;
import com.google.gson.Gson;
import com.huawei.hms.ads.jsb.JsbConfig;
import com.huawei.hms.ads.jsb.PPSJsBridge;
import com.huawei.operation.utils.Constants;
import com.huawei.profile.profile.ProfileExtendConstants;
import com.huawei.secure.android.common.ssl.WebViewSSLCheck;
import com.huawei.secure.android.common.util.EncodeUtil;
import com.huawei.secure.android.common.util.SafeString;
import com.huawei.secure.android.common.webview.SafeWebSettings;
import com.huawei.secure.android.common.webview.SafeWebView;
import com.huawei.secure.android.common.webview.WebViewLoadCallBack;
import com.huawei.uikit.hwprogressbar.widget.HwProgressBar;
import com.huawei.watchface.R;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.api.HwWatchFaceBtManager;
import com.huawei.watchface.api.WebViewActivity;
import com.huawei.watchface.b3;
import com.huawei.watchface.e4;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.flavor.FlavorConfig;
import com.huawei.watchface.g4;
import com.huawei.watchface.j2;
import com.huawei.watchface.k3;
import com.huawei.watchface.mvp.model.datatype.WatchResourcesInfo;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.mvp.model.helper.JsSafeUrlSystemParamManager;
import com.huawei.watchface.mvp.model.latona.BackgroundOptionalConfig;
import com.huawei.watchface.mvp.model.webview.JSInterface;
import com.huawei.watchface.mvp.model.webview.JsInterfaceMarketing;
import com.huawei.watchface.mvp.ui.dialog.CustomViewDialog;
import com.huawei.watchface.n1;
import com.huawei.watchface.q0;
import com.huawei.watchface.t4;
import com.huawei.watchface.utils.ArrayUtils;
import com.huawei.watchface.utils.BackgroundTaskUtils;
import com.huawei.watchface.utils.ChoosePicUtil;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.DensityUtil;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.PermissionUtils;
import com.huawei.watchface.utils.WebViewUtils;
import com.huawei.watchface.utils.callback.CloseWebCallback;
import com.huawei.watchface.utils.callback.DelectUserDesignationWatchFaceCallback;
import com.huawei.watchface.utils.callback.IBaseResponseCallback;
import com.huawei.watchface.utils.callback.IH5LoadingCallback;
import com.huawei.watchface.utils.callback.MagicH5LoadingCallback;
import com.huawei.watchface.utils.callback.OnWebViewStatusCallback;
import com.huawei.watchface.utils.callback.OperateWatchFaceCallback;
import com.huawei.watchface.utils.callback.PluginOperationAdapter;
import com.huawei.watchface.utils.callback.SendCurrentUrlCallback;
import com.huawei.watchface.utils.callback.SendNoNetMsgCallback;
import com.huawei.watchface.utils.callback.SendServerErrorMsgCallback;
import com.huawei.watchface.utils.callback.ToastCallback;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import com.huawei.watchface.utils.permission.PermissionUtil;
import com.huawei.watchface.z3;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes20.dex */
public class CustomWebView implements ToastCallback, CloseWebCallback, SendServerErrorMsgCallback, SendNoNetMsgCallback, SendCurrentUrlCallback, OperateWatchFaceCallback, DelectUserDesignationWatchFaceCallback, OnWebViewStatusCallback, View.OnClickListener, IH5LoadingCallback, MagicH5LoadingCallback {
    public static final String C = "CustomWebView";
    protected static final String[] CAMERA_PERMISSIONS;
    public static final int CHOOSE_VIDEO_TO_CLIP = 1;
    public static String D = null;
    public static long E = 0;
    protected static final String[] GALLERY_PERMISSIONS;
    public static final int ID_CAMERA_PERMISSIONS = 1;
    protected static final int ID_GALLERY_PERMISSIONS = 2;
    public String A;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PPSJsBridge f30414c;
    public int d;
    public String g;
    public ValueCallback i;
    public boolean isH5Clip;
    public ValueCallback j;
    public Uri k;
    public Handler l;
    public HwProgressBar m;
    public Activity mActivity;
    public int mChooseToClipResourceStyle;
    public Context mContext;
    public CustomViewDialog mCustomViewDialog;
    public SafeWebView mWebView;
    public PluginOperationAdapter n;
    public z3 o;
    public String q;
    public boolean s;
    public boolean t;
    public String x;
    public int z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f30412a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f30413b = false;
    public String e = "";
    public String f = "";
    public String h = null;
    public String p = "";
    public boolean r = false;
    public boolean u = false;
    public String v = "";
    public long w = 0;
    public SparseArray y = new SparseArray();
    public final Stack B = new Stack();

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30415a;

        public a(String str) {
            this.f30415a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = "javascript:transmitWatchFaceThemeAlbumLoadingProgress('" + this.f30415a + Constants.RIGHT_BRACKET;
            HwLog.i(CustomWebView.C, "transmitWatchFaceThemeAlbumLoadingProgress:" + str);
            CustomWebView.this.loadCallJsUrl(str);
        }
    }

    public class a0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30417a;

        public a0(String str) {
            this.f30417a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            CustomWebView.this.loadCallJsUrl(WebViewUtils.getUrl("transmitClippedPath", this.f30417a));
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30419a;

        public b(String str) {
            this.f30419a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            CustomWebView.this.loadCallJsUrl("javascript:transmitWatchFaceThemeWearAlbumLoadingProgress('" + this.f30419a + Constants.RIGHT_BRACKET);
        }
    }

    public class b0 implements Runnable {
        public b0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CustomWebView.this.loadCallJsUrl(WebViewUtils.e("transmitCancelPickImage()"));
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f30422a;

        public c(int i) {
            this.f30422a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = "javascript:transmitWatchFaceAlbumInstallResult('" + this.f30422a + Constants.RIGHT_BRACKET;
            HwLog.i(CustomWebView.C, "transmitWatchFaceAlbumInstallResult:" + str);
            CustomWebView.this.loadCallJsUrl(str);
        }
    }

    public class c0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30424a;

        public c0(String str) {
            this.f30424a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = "javascript:transmitWatchFaceTimeWidgetColor('" + this.f30424a + Constants.RIGHT_BRACKET;
            HwLog.i(CustomWebView.C, "transmitWatchFaceTextColor:" + str);
            CustomWebView.this.loadCallJsUrl(str);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30426a;

        public d(String str) {
            this.f30426a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            CustomWebView.this.loadCallJsUrl(WebViewUtils.getUrl("transmitClippedImageTypeIsNotSupport", this.f30426a));
        }
    }

    public class d0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30428a;

        public d0(String str) {
            this.f30428a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            CustomWebView.this.loadCallJsUrl("javascript:transmitWatchFaceThemeWearAlbumInfo('" + this.f30428a + Constants.RIGHT_BRACKET);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f30430a;

        public e(int i) {
            this.f30430a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            CustomWebView.this.loadCallJsUrl("javascript:transmitWatchFaceWearAlbumInstallResult('" + this.f30430a + Constants.RIGHT_BRACKET);
        }
    }

    public class e0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30432a;

        public e0(String str) {
            this.f30432a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = "javascript:transmitWatchFaceThemeAlbumInfo('" + this.f30432a + Constants.RIGHT_BRACKET;
            HwLog.iBetaLog(CustomWebView.C, "transmitWatchFaceThemeAlbumInfo:" + str);
            CustomWebView.this.loadCallJsUrl(str);
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f30435b;

        public f(String str, String str2) {
            this.f30434a = str;
            this.f30435b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            String url = WebViewUtils.getUrl("transmitDeleteThemeSortIdRequest", this.f30434a + "', '" + this.f30435b);
            String str = CustomWebView.C;
            StringBuilder sb = new StringBuilder("transmitWatchFaceSortList:");
            sb.append(url);
            HwLog.i(str, sb.toString());
            CustomWebView.this.loadCallJsUrl(url);
        }
    }

    public static class f0 implements PermissionUtils.PermissonListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Activity f30437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f30438b;

        public f0(Activity activity, int i) {
            this.f30437a = activity;
            this.f30438b = i;
        }

        public final /* synthetic */ void a(View view) {
            HwLog.d(CustomWebView.C, "positiveListener click");
            CustomWebView.notifyH5(this.f30437a);
        }

        public final /* synthetic */ void b(View view) {
            HwLog.d(CustomWebView.C, "negativeListener click");
            CustomWebView.notifyH5(this.f30437a);
        }

        @Override // com.huawei.watchface.utils.PermissionUtils.PermissonListener
        public void onRequested(boolean z) {
            e4.a("android.permission.CAMERA", false, "sp_permission_file");
            if (z) {
                ChoosePicUtil.b(this.f30437a, this.f30438b);
            } else if (Environment.sIsAarInTheme) {
                CommonUtils.showPermissionSettingGuide(this.f30437a, DensityUtil.getStringById(R.string.watch_face_camera_permission_content));
            } else {
                HwWatchFaceApi.getInstance(this.f30437a).showHealthAppSettingGuide(this.f30437a, (CommonUtils.isAndroid10() ? PermissionUtil.PermissionType.CAMERA : PermissionUtil.PermissionType.CAMERA_IMAGE).getPermission(), new View.OnClickListener() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$f0$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f$0.a(view);
                    }
                }, new View.OnClickListener() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$f0$$ExternalSyntheticLambda1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f$0.b(view);
                    }
                });
            }
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f30439a;

        public g(CountDownLatch countDownLatch) {
            this.f30439a = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strJ = CustomWebView.this.j();
            CustomWebView.D = strJ;
            if (TextUtils.isEmpty(strJ)) {
                HwLog.e(CustomWebView.C, "getWebViewUrl is null.");
            }
            this.f30439a.countDown();
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f30444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f30445c;

        public h(String str, int i, String str2) {
            this.f30443a = str;
            this.f30444b = i;
            this.f30445c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            String url = WebViewUtils.getUrl("transmitProgress", com.huawei.watchface.n.e().c(this.f30443a) + "', '" + this.f30444b + "', '" + this.f30445c);
            String str = CustomWebView.C;
            StringBuilder sb = new StringBuilder("callTransmitProgressJsFunction:");
            sb.append(url);
            HwLog.i(str, sb.toString());
            CustomWebView.this.loadCallJsUrl(url);
        }
    }

    public class h0 extends WebChromeClient {
        public h0() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            if (i >= 100) {
                HwLog.i(CustomWebView.C, "setProgressBar >= 100");
                CustomWebView.this.m.setProgress(i);
                CustomWebView.this.l.sendMessageDelayed(CustomWebView.this.l.obtainMessage(2000), 500L);
            } else {
                CustomWebView.this.m.setProgress(i);
            }
            super.onProgressChanged(webView, i);
        }
    }

    public class i implements Runnable {
        public i() {
        }

        public static /* synthetic */ void a(String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
            CustomWebView.this.mWebView.evaluateJavascript(WebViewUtils.e("isNotInstallation()"), new ValueCallback() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$i$$ExternalSyntheticLambda0
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    CustomWebView.i.a((String) obj);
                }
            });
        }
    }

    public class i0 extends WebViewClient {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                CustomWebView.this.mWebView.stopLoading();
                CustomWebView.this.mWebView.removeJavascriptInterface("JsInteraction");
                CustomWebView.this.mWebView.removeJavascriptInterface(Constants.HBS_SDK);
                CustomWebView.this.mWebView.removeJavascriptInterface(WatchFaceConstant.JS_INTERFACE);
                HwLog.i(CustomWebView.C, "mUnsafeUrl removeJavascriptInterface and stopLoading!");
                CustomWebView customWebView = CustomWebView.this;
                customWebView.u(customWebView.f);
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                CustomWebView.this.mWebView.stopLoading();
                CustomWebView.this.mWebView.removeJavascriptInterface("JsInteraction");
                CustomWebView.this.mWebView.removeJavascriptInterface(Constants.HBS_SDK);
                CustomWebView.this.mWebView.removeJavascriptInterface(WatchFaceConstant.JS_INTERFACE);
                HwLog.i(CustomWebView.C, "mUnsafeUrl removeJavascriptInterface and stopLoading!");
                CustomWebView customWebView = CustomWebView.this;
                customWebView.u(customWebView.f);
            }
        }

        public i0() {
        }

        public final void a(String str) {
            boolean z = (TextUtils.isEmpty(str) || str.toLowerCase(Locale.ENGLISH).startsWith("https://")) ? false : true;
            if (HwWatchFaceApi.getInstance(CustomWebView.this.mContext).isTestVersion() || !z) {
                return;
            }
            HwLog.i(CustomWebView.C, "not https protocol removeJavascriptInterface");
            if (CommonUtils.i(CustomWebView.this.f) && str.toLowerCase(Locale.ENGLISH).startsWith(q0.h())) {
                return;
            }
            CustomWebView customWebView = CustomWebView.this;
            if (customWebView.e.equals(customWebView.f)) {
                return;
            }
            CustomWebView customWebView2 = CustomWebView.this;
            customWebView2.e = customWebView2.f;
            new Handler(Looper.getMainLooper()).post(new b());
        }

        public final void b(String str) {
            PluginOperationAdapter pluginOperationAdapter;
            if (!str.contains("health/watchFace") || (pluginOperationAdapter = CustomWebView.this.n) == null) {
                return;
            }
            boolean zIsBluetoothConnected = pluginOperationAdapter.isBluetoothConnected();
            HwLog.i(CustomWebView.C, "onPageFinishedForWatchFace() connected: " + zIsBluetoothConnected);
            if (zIsBluetoothConnected) {
                return;
            }
            CustomWebView.this.transmitDeviceConnectState(zIsBluetoothConnected, DensityUtil.getStringById(R.string.wearable_device_is_not_connected_notice));
        }

        public final void c(String str) {
            if (HwWatchFaceApi.getInstance(CustomWebView.this.mContext).isTestVersion()) {
                return;
            }
            Locale locale = Locale.ENGLISH;
            if (str.toLowerCase(locale).startsWith("https://")) {
                return;
            }
            HwLog.i(CustomWebView.C, "not https protocol removeJavascriptInterface");
            if (CommonUtils.i(CustomWebView.this.f) && str.toLowerCase(locale).startsWith(q0.h())) {
                return;
            }
            CustomWebView customWebView = CustomWebView.this;
            if (customWebView.e.equals(customWebView.f)) {
                return;
            }
            CustomWebView customWebView2 = CustomWebView.this;
            customWebView2.e = customWebView2.f;
            new Handler(Looper.getMainLooper()).post(new a());
        }

        @Override // android.webkit.WebViewClient
        public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
            String str2 = CustomWebView.C;
            HwLog.i(str2, "doUpdateVisitedHistory() enter.");
            if (TextUtils.isEmpty(str)) {
                HwLog.e(str2, "doUpdateVisitedHistory() url is null");
                return;
            }
            if (!CommonUtils.C()) {
                Handler handler = CustomWebView.this.l;
                if (handler != null) {
                    handler.sendEmptyMessage(2001);
                } else {
                    HwLog.e(str2, "doUpdateVisitedHistory() mHandler is null");
                }
            }
            super.doUpdateVisitedHistory(webView, str, z);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            String str2 = CustomWebView.C;
            HwLog.i(str2, "onPageFinished() enter.");
            CustomWebView.this.w(str);
            CustomWebView customWebView = CustomWebView.this;
            customWebView.A = str;
            customWebView.f30412a = true;
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.huawei.watchface.j jVar = new com.huawei.watchface.j();
            jVar.b(jCurrentTimeMillis);
            jVar.d(str);
            super.onPageFinished(webView, str);
            FlavorConfig.safeHwLog(str2, "onPageFinished url:" + str);
            CustomWebView.this.m.setVisibility(8);
            JsSafeUrlSystemParamManager.getInstance().d(WebViewUtils.a((WebView) CustomWebView.this.mWebView));
            if (CustomWebView.this.l.hasMessages(2007)) {
                CustomWebView.this.l.removeMessages(2007);
            }
            b(str);
            Message messageObtainMessage = CustomWebView.this.l.obtainMessage(10086);
            messageObtainMessage.obj = str;
            CustomWebView customWebView2 = CustomWebView.this;
            if (customWebView2.u) {
                messageObtainMessage.arg1 = 11;
                customWebView2.l.sendMessageDelayed(messageObtainMessage, 1000L);
            } else {
                customWebView2.l.sendMessage(messageObtainMessage);
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            CustomWebView customWebView3 = CustomWebView.this;
            customWebView3.v(customWebView3.h);
            HwWatchFaceBtManager.getInstance(CustomWebView.this.mContext).refreshUi(CustomWebView.this.mContext);
            countDownLatch.countDown();
            try {
                if (!countDownLatch.await(2000L, TimeUnit.MILLISECONDS)) {
                    HwLog.w(str2, "setDarkMode time out!");
                }
            } catch (InterruptedException e) {
                HwLog.e(CustomWebView.C, "setDarkMode: InterruptedException " + HwLog.printException((Exception) e));
            }
            HwLog.i(CustomWebView.C, "onPageFinished() end.");
            a(str, jVar, jCurrentTimeMillis);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            String str2 = CustomWebView.C;
            HwLog.i(str2, "onPageStarted");
            FlavorConfig.safeHwLog(str2, "onPageStarted url:" + str);
            JsSafeUrlSystemParamManager.getInstance().d(WebViewUtils.a((WebView) CustomWebView.this.mWebView));
            g4 g4VarC = b3.b().c();
            if (g4VarC != null && !g4VarC.a(str)) {
                HwLog.e(str2, "onPageStarted url is not in white list");
                webView.stopLoading();
                CustomWebView.this.f30412a = false;
                return;
            }
            CustomWebView.this.m.setVisibility(0);
            if (TextUtils.isEmpty(str)) {
                HwLog.w(str2, "WebViewClientBase onPageStarted url is null.");
                return;
            }
            CustomWebView customWebView = CustomWebView.this;
            customWebView.h = str;
            customWebView.f = str;
            if (!HwWatchFaceApi.getInstance(customWebView.mContext).isTestVersion() && !CustomWebView.this.h.toLowerCase(Locale.ENGLISH).startsWith("https://")) {
                HwLog.i(str2, "not https protocol removeJavascriptInterface");
                if (!CommonUtils.i(str)) {
                    HwLog.i(str2, "not file protocol removeJavascriptInterface");
                    CustomWebView.this.mWebView.removeJavascriptInterface("JsInteraction");
                    CustomWebView.this.mWebView.removeJavascriptInterface(Constants.HBS_SDK);
                    CustomWebView.this.mWebView.removeJavascriptInterface(WatchFaceConstant.JS_INTERFACE);
                }
            }
            if (CustomWebView.this.mWebView.getProgress() < 100) {
                HwLog.i(str2, "onPageStarted mWebView.getProgress() < 100 ");
                CustomWebView.this.l.sendEmptyMessageDelayed(2007, 30000L);
            }
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            HwLog.i(CustomWebView.C, "onReceivedError errorCode is " + i + "description is " + str);
            CustomWebView customWebView = CustomWebView.this;
            customWebView.f30412a = false;
            customWebView.l.sendEmptyMessage(2001);
            CustomWebView.this.v = WebViewUtils.a(webView);
            webView.loadUrl(" ");
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            HwLog.i(CustomWebView.C, "onReceivedHttpError enter.");
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (sslError == null) {
                HwLog.w(CustomWebView.C, "onReceivedSslError error is null");
                return;
            }
            HwLog.i(CustomWebView.C, "onReceivedSslError errorType is " + sslError.getPrimaryError());
            WebViewUtils.a(sslError);
            WebViewSSLCheck.checkServerCertificateNew(sslErrorHandler, sslError, CustomWebView.this.mContext);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            CustomWebView.this.f = WebViewUtils.g(str);
            CustomWebView customWebView = CustomWebView.this;
            customWebView.h = str;
            customWebView.v(str);
            if (WebViewUtils.f(CustomWebView.this.f)) {
                CustomWebView.this.b(true);
                CustomWebView customWebView2 = CustomWebView.this;
                if (customWebView2.b(customWebView2.f)) {
                    return false;
                }
                HwLog.d(CustomWebView.C, "shouldOverrideUrlHandler isWhiteUrl false");
                CustomWebView.this.mWebView.removeJavascriptInterface("JsInteraction");
                CustomWebView.this.mWebView.removeJavascriptInterface(Constants.HBS_SDK);
                CustomWebView.this.mWebView.removeJavascriptInterface(WatchFaceConstant.JS_INTERFACE);
                return true;
            }
            String strA = WebViewUtils.a(CustomWebView.this.h);
            if (TextUtils.isEmpty(strA)) {
                HwLog.i(CustomWebView.C, "scheme is unknown");
                CustomWebView.this.E();
                return true;
            }
            String str2 = CustomWebView.C;
            HwLog.i(str2, "scheme is known");
            String strC = WebViewUtils.c(strA);
            if (TextUtils.isEmpty(strC) || CommonUtils.a(CustomWebView.this.mContext, strC)) {
                CustomWebView customWebView3 = CustomWebView.this;
                WebViewUtils.a(customWebView3.mContext, customWebView3.f);
            } else {
                HwLog.i(str2, "not install packageName:" + strC);
                CustomWebView.this.t(EncodeUtil.encodeForJavaScript(strC));
            }
            return true;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            String string = webResourceRequest.getUrl().toString();
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            if (!string.contains("/watchface/localfile/")) {
                c(string);
                return null;
            }
            try {
                String strFilterFilePath = CommonUtils.filterFilePath(Uri.parse(SafeString.substring(string, string.indexOf("/watchface/localfile/") + 21)).getPath());
                FlavorConfig.safeHwLog(CustomWebView.C, "imgPath:" + strFilterFilePath);
                JsSafeUrlSystemParamManager.getInstance();
                return JsSafeUrlSystemParamManager.c(strFilterFilePath) ? new WebResourceResponse(WebViewUtils.b(string), "UTF-8", new FileInputStream(strFilterFilePath)) : new WebResourceResponse(WebViewUtils.b(string), "UTF-8", null);
            } catch (FileNotFoundException unused) {
                HwLog.i(CustomWebView.C, "WebViewClientBase shouldInterceptRequest fail");
                return null;
            }
        }

        public final void a(String str, com.huawei.watchface.j jVar, long j) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            jVar.a(jCurrentTimeMillis);
            jVar.c(jCurrentTimeMillis - j);
            if (TextUtils.equals(CustomWebView.this.x, str) && jCurrentTimeMillis - CustomWebView.this.w < C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS) {
                HwLog.i(CustomWebView.C, "report interval is less than 3000ms");
                return;
            }
            CustomWebView customWebView = CustomWebView.this;
            customWebView.w = jCurrentTimeMillis;
            customWebView.x = str;
            jVar.j();
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            if (TextUtils.isEmpty(str)) {
                HwLog.i(CustomWebView.C, "url is null!");
                return null;
            }
            if (str.contains("/watchface/localfile/")) {
                try {
                    String strFilterFilePath = CommonUtils.filterFilePath(Uri.parse(SafeString.substring(str, str.indexOf("/watchface/localfile/") + 21)).getPath());
                    if (strFilterFilePath != null) {
                        return new WebResourceResponse(WebViewUtils.b(str), "UTF-8", new FileInputStream(strFilterFilePath));
                    }
                } catch (FileNotFoundException unused) {
                    HwLog.i(CustomWebView.C, "WebViewClientBase shouldInterceptRequest fail");
                    return null;
                }
            }
            a(str);
            return null;
        }
    }

    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f30452b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f30453c;

        public j(String str, String str2, int i) {
            this.f30451a = str;
            this.f30452b = str2;
            this.f30453c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            String url = WebViewUtils.getUrl("transmitDownloadWatchFaceResult", this.f30451a + "', '" + this.f30452b + "', '" + this.f30453c);
            String str = CustomWebView.C;
            StringBuilder sb = new StringBuilder("transmitDownloadWatchFaceResult:");
            sb.append(url);
            HwLog.i(str, sb.toString());
            CustomWebView.this.loadCallJsUrl(url);
        }
    }

    public class k implements JsSafeUrlSystemParamManager.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f30454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f30455b;

        public k(boolean z, String str) {
            this.f30454a = z;
            this.f30455b = str;
        }

        @Override // com.huawei.watchface.mvp.model.helper.JsSafeUrlSystemParamManager.b
        public void onGetFinished() {
            String str = CustomWebView.C;
            HwLog.i(str, "loadSafeUrl - onGetFinished reload:" + this.f30454a);
            FlavorConfig.safeHwLog(str, "loadSafeUrl url:" + this.f30455b);
            g4 g4VarC = b3.b().c();
            if (g4VarC != null && g4VarC.a(this.f30455b)) {
                CustomWebView.this.a(this.f30455b, this.f30454a);
            } else {
                HwLog.i(str, "loadSafeUrl - loadPage: SupportType is null.");
                CustomWebView.this.b(this.f30455b, this.f30454a);
            }
        }
    }

    public class l implements Runnable {
        public l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String strE = WebViewUtils.e("transmitMembershipDialogStatus()");
            HwLog.i(CustomWebView.C, "transmitMembershipDialogStatus:" + strE);
            CustomWebView.this.loadCallJsUrl(strE);
        }
    }

    public class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f30459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f30460c;

        public m(String str, int i, String str2) {
            this.f30458a = str;
            this.f30459b = i;
            this.f30460c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            String url = WebViewUtils.getUrl("transmitDownloadProgressWatchFace", this.f30458a + "', '" + this.f30459b + "', '" + this.f30460c);
            String str = CustomWebView.C;
            StringBuilder sb = new StringBuilder("callDownloadProgressJsFuncion:");
            sb.append(url);
            HwLog.i(str, sb.toString());
            CustomWebView.this.loadCallJsUrl(url);
        }
    }

    public class n implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f30462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f30463c;

        public n(String str, String str2, int i) {
            this.f30461a = str;
            this.f30462b = str2;
            this.f30463c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            String url = WebViewUtils.getUrl("transmitInstallWatchFaceResult", this.f30461a + "', '" + this.f30462b + "', '" + this.f30463c);
            String str = CustomWebView.C;
            StringBuilder sb = new StringBuilder("transmitInstallWatchFaceResult:");
            sb.append(url);
            HwLog.i(str, sb.toString());
            CustomWebView.this.loadCallJsUrl(url);
        }
    }

    public class o implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f30465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f30466c;

        public o(String str, String str2, int i) {
            this.f30464a = str;
            this.f30465b = str2;
            this.f30466c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            String url = WebViewUtils.getUrl("transmitInstallWatchFaceResultNew", this.f30464a + "', '" + this.f30465b + "', '" + this.f30466c);
            String str = CustomWebView.C;
            StringBuilder sb = new StringBuilder("transmitInstallWatchFaceResultNew:");
            sb.append(url);
            HwLog.i(str, sb.toString());
            CustomWebView.this.loadCallJsUrl(url);
        }
    }

    public class p implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f30468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f30469c;

        public p(String str, String str2, int i) {
            this.f30467a = str;
            this.f30468b = str2;
            this.f30469c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            String url = WebViewUtils.getUrl("transmitSetDefaultWatchFaceResult", WatchResourcesInfo.markDownHiTopId(this.f30467a) + "', '" + this.f30468b + "', '" + this.f30469c);
            String str = CustomWebView.C;
            StringBuilder sb = new StringBuilder("transmitSetDefaultWatchFaceResult:");
            sb.append(url);
            HwLog.i(str, sb.toString());
            CustomWebView.this.loadCallJsUrl(url);
        }
    }

    public class q implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f30471b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f30472c;

        public q(String str, String str2, int i) {
            this.f30470a = str;
            this.f30471b = str2;
            this.f30472c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            String url = WebViewUtils.getUrl("transmitCancelInstallWatchFaceResult", this.f30470a + "', '" + this.f30471b + "', '" + this.f30472c);
            String str = CustomWebView.C;
            StringBuilder sb = new StringBuilder("transmitCancelInstallWatchFaceResult:");
            sb.append(url);
            HwLog.i(str, sb.toString());
            CustomWebView.this.loadCallJsUrl(url);
        }
    }

    public class r implements Runnable {
        public r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String strE = WebViewUtils.e("transmitGetResult()");
            HwLog.i(CustomWebView.C, "transmitGetResult:" + strE);
            CustomWebView.this.loadCallJsUrl(strE);
        }
    }

    public class s implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f30475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f30476c;

        public s(String str, String str2, int i) {
            this.f30474a = str;
            this.f30475b = str2;
            this.f30476c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strG = com.huawei.watchface.n.e().g(this.f30474a);
            HwLog.i(CustomWebView.C, "transmitDeleteWatchFaceResult  hitopid1: " + this.f30474a + "," + strG);
            CustomWebView.this.loadCallJsUrl(WebViewUtils.getUrl("transmitDeleteWatchFaceResult", strG + "', '" + this.f30475b + "', '" + this.f30476c));
        }
    }

    public class t implements Runnable {
        public t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String strE = WebViewUtils.e("transmitWatchInfoChange()");
            HwLog.i(CustomWebView.C, "transmitWatchInfoChange:" + strE);
            CustomWebView.this.loadCallJsUrl(strE);
        }
    }

    public class u implements Runnable {
        public u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String strE = WebViewUtils.e("transmitDeleteWatchFaceResult()");
            HwLog.i(CustomWebView.C, "callGetWatchFaceDeleteIdJsFunction:" + strE);
            CustomWebView.this.loadCallJsUrl(strE);
        }
    }

    public class v implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f30480b;

        public v(String str, boolean z) {
            this.f30479a = str;
            this.f30480b = z;
        }

        @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
        public void onResponse(int i, Object obj) {
            CustomWebView.this.a(this.f30479a, this.f30480b);
        }
    }

    public class w implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30482a;

        public w(String str) {
            this.f30482a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String url = WebViewUtils.getUrl("transmitWatchFaceNames", this.f30482a);
            HwLog.i(CustomWebView.C, "transmitWatchFaceNames:" + url);
            CustomWebView.this.loadCallJsUrl(url);
        }
    }

    public class x implements Runnable {
        public x() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CustomWebView.this.loadCallJsUrl(WebViewUtils.e("transmitWatchFaceGoBack()"));
        }
    }

    public class y implements Runnable {
        public y() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CustomWebView.this.loadCallJsUrl(WebViewUtils.e("transmitRefreshPullData()"));
        }
    }

    public class z implements Runnable {
        public z() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CustomWebView.this.mWebView.clearHistory();
            HwLog.i(CustomWebView.C, "loadUrl url postDelayed");
        }
    }

    static {
        CAMERA_PERMISSIONS = CommonUtils.isAndroid10() ? new String[]{"android.permission.CAMERA"} : new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
        GALLERY_PERMISSIONS = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
    }

    public CustomWebView(JSInterface jSInterface, Context context, HwProgressBar hwProgressBar, SafeWebView safeWebView, Handler handler, int i2) {
        this.d = -1;
        this.g = null;
        this.d = i2;
        this.mContext = context;
        this.l = handler;
        this.mWebView = safeWebView;
        this.m = hwProgressBar;
        this.mActivity = (Activity) context;
        this.n = (PluginOperationAdapter) k3.a(context).getAdapter();
        this.t = HwWatchFaceApi.getInstance(this.mContext).isOversea();
        this.s = HwWatchFaceApi.getInstance(this.mContext).isBetaVersion();
        if (((PluginOperationAdapter) k3.a(this.mContext).getAdapter()) == null) {
            HwLog.i(C, "PluginOperationAdapter is null");
            return;
        }
        this.g = CommonUtils.b(this.mContext);
        m();
        if (jSInterface != null) {
            addJavascriptInterface(jSInterface);
        }
    }

    public static void notifyH5(Activity activity) {
        if (activity == null || !(activity instanceof WebViewActivity)) {
            return;
        }
        ((WebViewActivity) activity).notifyH5ApplyPermission("0");
    }

    public final /* synthetic */ void A() {
        HwLog.i(C, "transmitUserTokenUpdate:javascript:transmitUserTokenUpdate()");
        loadCallJsUrl("javascript:transmitUserTokenUpdate()");
    }

    public void B() {
        HwLog.i(C, "notifyConfigChange:");
        this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda20
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.q();
            }
        });
    }

    public void C() {
    }

    public void D() {
        BackgroundTaskUtils.postInMainThread(new i());
    }

    public void E() {
        HwLog.i(C, "notifySchemeIsUnknown");
        if (o()) {
            return;
        }
        this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda31
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.t();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0028  */
    public void F() {
        HwLog.i(C, "onClick photo_album_gallery");
        if (CommonUtils.isAndroid10()) {
            ChoosePicUtil.a(this.mActivity, this.mChooseToClipResourceStyle);
        } else {
            String[] strArr = GALLERY_PERMISSIONS;
            if (PermissionUtils.checkPermission(strArr[0])) {
                ChoosePicUtil.a(this.mActivity, this.mChooseToClipResourceStyle);
            } else {
                Activity activity = this.mActivity;
                requestPermissionAsync(activity, strArr, new g0(activity, this.mChooseToClipResourceStyle), 2);
            }
        }
        CustomViewDialog customViewDialog = this.mCustomViewDialog;
        if (customViewDialog != null) {
            customViewDialog.dismiss();
        }
    }

    public void G() {
        HwLog.i(C, "onClick photo_album_take_photo");
        String[] strArr = CAMERA_PERMISSIONS;
        if (ArrayUtils.isEmpty(PermissionUtils.checkPermission(strArr))) {
            ChoosePicUtil.b(this.mActivity, this.mChooseToClipResourceStyle);
        } else {
            Activity activity = this.mActivity;
            requestPermissionAsync(activity, strArr, new f0(activity, this.mChooseToClipResourceStyle), 1);
        }
        CustomViewDialog customViewDialog = this.mCustomViewDialog;
        if (customViewDialog != null) {
            customViewDialog.dismiss();
        }
    }

    public void H() {
        PPSJsBridge pPSJsBridge = this.f30414c;
        if (pPSJsBridge != null) {
            pPSJsBridge.destroy();
        }
        SafeWebView safeWebView = this.mWebView;
        if (safeWebView != null) {
            safeWebView.removeJavascriptInterface("JsInteraction");
            this.mWebView.removeJavascriptInterface(Constants.HBS_SDK);
            this.mWebView.removeJavascriptInterface(WatchFaceConstant.JS_INTERFACE);
        }
        Handler handler = this.l;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        if (this.o != null) {
            this.o = null;
        }
        this.B.clear();
    }

    public void I() {
        HwLog.i(C, "transmitCancelPickImage() enter.");
        this.mWebView.post(new b0());
    }

    public void a(ValueCallback valueCallback) {
        HwLog.i(C, "setUploadMessage");
        this.i = valueCallback;
    }

    public void addJavascriptInterface(JSInterface jSInterface) {
        Object tag = this.mWebView.getTag();
        if (tag != null && ((Boolean) tag).booleanValue()) {
            HwLog.e(C, "mWebView set JSInterface again");
            return;
        }
        jSInterface.setOperateWatchFaceCallback(this, this);
        jSInterface.setSendCallback(this, this, this);
        jSInterface.setWidgetCallback(this);
        jSInterface.setTouchCallback(this);
        jSInterface.setH5LoadingCallback(this);
        jSInterface.setWebView(this.mWebView);
        this.mWebView.addJavascriptInterface(jSInterface, "JsInteraction");
        JsInterfaceMarketing jsInterfaceMarketing = new JsInterfaceMarketing(this.mContext);
        jsInterfaceMarketing.setWebView(this.mWebView);
        jsInterfaceMarketing.setMagicH5LoadingCallback(this);
        this.mWebView.addJavascriptInterface(jsInterfaceMarketing, WatchFaceConstant.JS_INTERFACE);
        PPSJsBridge.init(new JsbConfig.Builder().enableUserInfo(true).enableLog(true).build());
        HwLog.i(C, "PPSJsBridge bind mWebView");
        this.f30414c = new PPSJsBridge(this.mWebView);
        this.mWebView.setTag(Boolean.TRUE);
    }

    public void b(ValueCallback valueCallback) {
        HwLog.i(C, "setUploadMessageForAndroid5");
        this.j = valueCallback;
    }

    public CustomViewDialog c() {
        HwLog.i(C, "getCustomViewDialog");
        return this.mCustomViewDialog;
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void callGetWatchFaceDeleteIdJsFunction() {
        this.mWebView.post(new u());
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void callTransmitProgressJsFunction(String str, int i2, String str2) {
        if (!k3.a(this.mContext).a() || !"000000001".equals(str)) {
            this.mWebView.post(new h(str, i2, str2));
            return;
        }
        if (this.l != null) {
            HwLog.i(C, "start send message");
            Message messageObtainMessage = this.l.obtainMessage();
            messageObtainMessage.what = 2025;
            messageObtainMessage.arg1 = i2;
            this.l.sendMessage(messageObtainMessage);
        }
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void cancelSearchImage(boolean z2, boolean z3) {
        HwLog.i(C, "cancelSearchImage enter isGoBack :" + z3);
        if (z3 && !o()) {
            this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda46
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.p();
                }
            });
        }
        if (z2) {
            l();
        }
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void chooseToClip(int i2, boolean z2) {
        HwLog.i(C, "chooseToClip() clipType: " + i2 + ",h5Clip: " + z2);
        if (this.mActivity == null) {
            return;
        }
        this.isH5Clip = z2;
        this.mChooseToClipResourceStyle = i2;
        a();
    }

    public Uri d() {
        HwLog.i(C, "getImageUri");
        return this.k;
    }

    public HwProgressBar e() {
        HwLog.i(C, "getProgressBar");
        return this.m;
    }

    public String f() {
        return this.v;
    }

    public ValueCallback g() {
        HwLog.i(C, "getUploadMessage");
        return this.i;
    }

    public int getChooseToClipResourceStyle() {
        return this.mChooseToClipResourceStyle;
    }

    @Override // com.huawei.watchface.utils.callback.SendCurrentUrlCallback
    public String getCurrentUrl() {
        if (TextUtils.isEmpty(this.h)) {
            HwLog.i(C, "getCurrentUrl mCurrentUrl is empty");
            return "";
        }
        HwLog.i(C, "getCurrentUrl mCurrentUrl != null");
        return this.h;
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public Context getCustomWebViewContext() {
        return this.mActivity;
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public int getSoftKeyboardHeight() {
        return a(this.mContext) - b(this.mContext);
    }

    @Override // com.huawei.watchface.utils.callback.SendCurrentUrlCallback
    public String getWebViewUrl() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return j();
        }
        HwLog.i(C, "getWebViewUrlNotUiThread");
        return i();
    }

    public ValueCallback h() {
        HwLog.i(C, "getUploadMessageForAndroid5");
        return this.j;
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void handleCallbackResult(final String str, int i2) {
        String str2 = C;
        HwLog.i(str2, "handleCallbackResult:" + str);
        if (!HwWatchFaceApi.getInstance(this.mContext).getIsTaskExecuting() || i2 != 9) {
            this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.c(str);
                }
            });
        } else {
            HwLog.d(str2, "getIsTaskExecuting is true");
            HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).setTaskExecuting(true);
        }
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void hideLoadingDialog() {
        HwLog.i(C, "hideLoadingDialog() enter.");
        z3 z3Var = this.o;
        if (z3Var == null || !z3Var.isShowing()) {
            return;
        }
        this.o.dismiss();
        this.o = null;
    }

    public final String i() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            this.mWebView.post(new g(countDownLatch));
            if (!countDownLatch.await(ProfileExtendConstants.TIME_OUT, TimeUnit.MILLISECONDS)) {
                HwLog.e(C, " webView await false");
            }
        } catch (InterruptedException e2) {
            HwLog.e(C, "getWebViewUrl InterruptedException: " + HwLog.printException((Exception) e2));
        }
        return D;
    }

    public final String j() {
        try {
            return this.mWebView.getUrl();
        } catch (Throwable unused) {
            HwLog.e(C, "getWebViewUrlUiThread error");
            return "";
        }
    }

    public boolean k() {
        SafeWebView safeWebView = this.mWebView;
        if (safeWebView == null) {
            HwLog.i(C, "WebView is null");
            return false;
        }
        if (!safeWebView.canGoBack()) {
            HwLog.i(C, "WebView no go back.");
            return false;
        }
        HwLog.i(C, "webView canGoBack");
        this.mWebView.goBack();
        return true;
    }

    public void l() {
        HwLog.i(C, "goToCameraOrGalley enter");
        if (this.r) {
            G();
        } else {
            F();
        }
    }

    public void loadCallJsUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            HwLog.i(C, "TextUtils.isEmpty(callJs)");
        } else {
            this.mWebView.loadUrl(str);
        }
    }

    public void loadSafeUrl(String str, boolean z2) {
        JsSafeUrlSystemParamManager.getInstance().c(new k(z2, str));
    }

    public final void m() {
        HwLog.i(C, "initWebViewSettings");
        FlavorConfig.openWebviewDebugMode();
        WebSettings settings = this.mWebView.getSettings();
        settings.setCacheMode(-1);
        settings.setAllowFileAccess(true);
        settings.setUseWideViewPort(true);
        settings.setGeolocationEnabled(false);
        settings.setDomStorageEnabled(true);
        settings.setLoadWithOverviewMode(true);
        String userAgentString = this.mWebView.getSettings().getUserAgentString();
        this.mWebView.getSettings().setUserAgentString(userAgentString + "; HuaweiHealth");
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setTextZoom(100);
        settings.setLoadWithOverviewMode(true);
        settings.setMixedContentMode(2);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.mWebView, true);
        SafeWebSettings.initWebviewAndSettings(this.mWebView);
        n();
    }

    public final void n() {
        if (!this.s && !HwWatchFaceApi.getInstance(this.mContext).isRelease()) {
            HwLog.i(C, "initWebViewSettingsEvent setWebContentsDebuggingEnabled");
        }
        this.mWebView.setWebViewLoadCallBack(new WebViewLoadCallBack() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda8
            @Override // com.huawei.secure.android.common.webview.WebViewLoadCallBack
            public final void onCheckError(String str, WebViewLoadCallBack.ErrorCode errorCode) {
                HwLog.e(CustomWebView.C, "initWebViewSettingsEvent -- onCheckError: " + errorCode);
            }
        });
        this.mWebView.setWebChromeClient(new h0());
        this.mWebView.setWebViewClient(new i0(), false);
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void notifyBackgroundChange(final boolean z2) {
        HwLog.i(C, "notifyBackgroundChange");
        if (o()) {
            return;
        }
        this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(z2);
            }
        });
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void notifyCurrentWatchfaceIsVipFree(final String str, final String str2) {
        HwLog.i(C, "notifyCurrentWatchfaceIsVipFree");
        if (o()) {
            return;
        }
        this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda34
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(str, str2);
            }
        });
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void notifyGetShortCutIsCreate() {
        HwLog.i(C, "notifyGetShortCutIsCreate:");
        this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda43
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.r();
            }
        });
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void notifyGetWatchfaceStore() {
        HwLog.i(C, "notifyGetWatchfaceStore:");
        this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.s();
            }
        });
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void notifyKaleidoscopePackageName(final String str) {
        HwLog.i(C, "notifyKaleidoscopePackageName:" + str);
        this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.e(str);
            }
        });
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void notifyPhotoPackageName(final String str) {
        HwLog.i(C, "notifyPhotoPackageName:" + str);
        this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.f(str);
            }
        });
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void notifyRefreshPage(String str) {
        String str2 = C;
        HwLog.i(str2, "notifyRefreshPage -- enter.");
        if (this.l != null) {
            HwLog.i(str2, "notifyRefreshPage() -- mHandler is not null.");
            this.l.obtainMessage(2030, str).sendToTarget();
        }
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void notifyVideoAlbumPackageName(final String str) {
        HwLog.i(C, "notifyVideoAlbumPackageName:" + str);
        this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda40
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.g(str);
            }
        });
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void notifyWatchfaceModeChange(int i2) {
        String str = C;
        HwLog.i(str, "notifyDeviceModeChange -- enter.");
        if (this.l != null) {
            HwLog.i(str, "notifyDeviceModeChange() -- mHandler is not null.");
            this.l.obtainMessage(2024, Integer.valueOf(i2)).sendToTarget();
        }
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void notifyWearAlbumPackageName(final String str) {
        HwLog.i(C, "notifyWearAlbumPackageName:" + str);
        this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda21
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.h(str);
            }
        });
    }

    public final /* synthetic */ void o(String str) {
        String str2 = "javascript:transmitWatchFaceVideoAlbumInfo('" + str + Constants.RIGHT_BRACKET;
        HwLog.iBetaLog(C, "transmitWatchFaceVideoAlbumInfo:" + str2);
        loadCallJsUrl(str2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.photo_album_take_photo) {
            this.r = true;
            G();
            y("3");
        } else {
            if (view.getId() != R.id.photo_album_gallery) {
                HwLog.e(C, "onClick() invalid click id.");
                return;
            }
            this.r = false;
            F();
            y("2");
        }
    }

    @Override // com.huawei.watchface.utils.callback.CloseWebCallback
    public void onCloseWebCallback() {
        if (this.mActivity == null || this.d == 3001) {
            return;
        }
        HwLog.i(C, "onCloseWebCallback");
        this.mActivity.finish();
    }

    @Override // com.huawei.watchface.utils.callback.DelectUserDesignationWatchFaceCallback
    public void onDelectWatchFaceState(String str, String str2) {
        this.mWebView.post(new f(str, str2));
    }

    @Override // com.huawei.watchface.utils.callback.IH5LoadingCallback
    public void onLoadSuccess() {
        HwLog.i(C, "onLoadSuccess() enter.");
        boolean z2 = j2.g().m;
        String str = j2.g().n;
        if (z2) {
            j2.g().m = false;
            j2.g().n = null;
            transmitTryOutOver("1", str, "2");
        }
    }

    @Override // com.huawei.watchface.utils.callback.MagicH5LoadingCallback
    public void onMagicLoadSuccess() {
        HwLog.i(C, "onMagicLoadSuccess() enter.");
        this.f30413b = true;
    }

    @Override // com.huawei.watchface.utils.callback.SendNoNetMsgCallback
    public void onSendNoNetMsgCallback() {
        String str = C;
        HwLog.i(str, "onSendNoNetMsgCallBack");
        if (this.l != null) {
            HwLog.i(str, "onSendNoNetMsgCallBack not null");
            this.l.obtainMessage(2003).sendToTarget();
        }
    }

    @Override // com.huawei.watchface.utils.callback.SendServerErrorMsgCallback
    public void onSendServerErrorMsgCallback() {
        String str = C;
        HwLog.i(str, "onSendServerErrorMsgCallback");
        if (this.l != null) {
            HwLog.i(str, "onSendServerErrorMsgCallback not null");
            this.l.obtainMessage(2006).sendToTarget();
        }
    }

    @Override // com.huawei.watchface.utils.callback.SendServerErrorMsgCallback
    public void onSendWatchFaceServerErrorCallback() {
        String str = C;
        HwLog.i(str, "onSendWatchFaceServerErrorCallBack");
        if (this.l != null) {
            HwLog.i(str, "onSendWatchFaceServerErrorCallBack not null");
            this.l.obtainMessage(2021).sendToTarget();
        }
    }

    @Override // com.huawei.watchface.utils.callback.SendServerErrorMsgCallback
    public void onSendWatchFaceServerRetryCallback() {
        String str = C;
        HwLog.i(str, "onSendWatchFaceServerRetryCallBack");
        if (this.l != null) {
            HwLog.i(str, "onSendWatchFaceServerRetryCallBack not null");
            this.l.obtainMessage(2022).sendToTarget();
        }
    }

    @Override // com.huawei.watchface.utils.callback.ToastCallback
    public void onToast(String str, String str2) {
        String str3 = C;
        HwLog.i(str3, "onToast");
        if (this.l != null) {
            HwLog.i(str3, "onToast not null");
            this.l.obtainMessage(2005, str).sendToTarget();
        }
    }

    @Override // com.huawei.watchface.utils.callback.OnWebViewStatusCallback
    public void onWebViewStatusCallback(String str) {
        if (this.l != null) {
            this.q = str;
        }
    }

    public final /* synthetic */ void p() {
        String url = WebViewUtils.getUrl("transmitGotoSearchPage", "");
        HwLog.i(C, "cancelSearchImage:" + url);
        loadCallJsUrl(url);
    }

    public final /* synthetic */ void q(String str) {
        ((Activity) this.mContext).runOnUiThread(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda41
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.hideLoadingDialog();
            }
        });
    }

    public final /* synthetic */ void r(String str) {
        this.mWebView.evaluateJavascript(WebViewUtils.getUrl("transmitWearClippedPath", str), new ValueCallback() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda29
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                this.f$0.q((String) obj);
            }
        });
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void requestPermissionAsync(Activity activity, String[] strArr, PermissionUtils.PermissonListener permissonListener, int i2) {
        if (i2 == 3) {
            this.z = 5;
        }
        this.y.put(i2, permissonListener);
        HwLog.i(C, "requestPermissionAsync() permissionId:" + i2 + ", permissons:" + strArr[0]);
        E = System.currentTimeMillis();
        PermissionUtils.requestPermissionIfNeed(activity, strArr, i2);
        c(strArr);
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void reselectionWearTransmit() {
        String str = C;
        HwLog.i(str, "reselectionWearTransmit() -- enter.");
        if (this.l != null) {
            HwLog.i(str, "reselectionWearTransmit() -- mHandler is not null.");
            this.l.obtainMessage(20991).sendToTarget();
        }
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void resetKaleidoscopeCurrentMaxIndex() {
        Handler handler = this.l;
        if (handler != null) {
            handler.obtainMessage(2023).sendToTarget();
        }
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void resetWatchFaceAlbumInfoStatus(int i2) {
        HwLog.i(C, "resetWatchFaceAlbumInfoStatus");
        this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda35
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.u();
            }
        });
    }

    public void s(String str) {
        String url = WebViewUtils.getUrl("transmitNetworkChange", str);
        HwLog.i(C, "notifyH5NetworkChange() callJs: " + url);
        loadCallJsUrl(url);
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void saveSuccessComeback() {
        String str = C;
        HwLog.i(str, "saveSuccessComeback() enter.");
        Handler handler = this.l;
        if (handler == null) {
            HwLog.e(str, "saveSuccessComeback() mHandler is null.");
            return;
        }
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.what = Constants.UPLOAD_SUCCESS;
        this.l.sendMessage(messageObtainMessage);
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void setWatchFaceConfirmButton() {
        Handler handler = this.l;
        if (handler != null) {
            Message messageObtainMessage = handler.obtainMessage();
            messageObtainMessage.what = 2026;
            this.l.sendMessage(messageObtainMessage);
        }
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void showLoadingDialog(String str) {
        HwLog.i(C, "showLoadingDialog() enter.");
        if (this.o == null) {
            this.o = z3.d(this.mContext);
        }
        this.o.b(str);
        this.o.e();
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void showToast(String str) {
        String str2 = C;
        HwLog.i(str2, "showToast");
        Handler handler = this.l;
        if (handler == null) {
            HwLog.e(str2, "showToast error: handler is null");
        } else {
            handler.obtainMessage(2005, str).sendToTarget();
        }
    }

    public final /* synthetic */ void t() {
        loadCallJsUrl("javascript:notifySchemeIsUnknown()");
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitAppGoBack() {
        HwLog.i(C, "transmitAppGoBack");
        this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.v();
            }
        });
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitCancelInstallWatchFaceResult(String str, String str2, int i2) {
        if (i2 == 1) {
            j2.g().b(str, str2);
        }
        String strH = com.huawei.watchface.n.e().h(str);
        HwLog.i(C, "transmitCancelInstallWatchFaceResult before:" + str + ",version  ," + str2 + ",aod after:" + strH);
        this.mWebView.post(new q(strH, str2, i2));
    }

    public void transmitClippedPath(String str) {
        String str2 = C;
        HwLog.i(str2, "transmitClippedPath() enter");
        if (TextUtils.isEmpty(str)) {
            HwLog.i(str2, "transmitClippedPath() imgPath is null");
        } else {
            this.mWebView.post(new a0(str));
        }
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitDecryptResult(final int i2, final String str) {
        String str2 = C;
        HwLog.i(str2, "transmitDecryptResult");
        SafeWebView safeWebView = this.mWebView;
        if (safeWebView == null) {
            HwLog.e(str2, "transmitDecryptResult --  mWebView is null");
        } else {
            safeWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda37
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(i2, str);
                }
            });
        }
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitDeleteWatchFaceResult(String str, String str2, int i2) {
        this.mWebView.post(new s(str, str2, i2));
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitDeviceConnectState(final boolean z2, final String str) {
        this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda32
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(z2, str);
            }
        });
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitDialRecycleResult(final String str, final String str2, final String str3) {
        HwLog.i(C, "transmitDialRecycleResult");
        if (o()) {
            return;
        }
        this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda26
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(str, str2, str3);
            }
        });
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitDownloadProgressWatchFace(String str, int i2, String str2) {
        this.mWebView.post(new m(str, i2, str2));
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitDownloadUrl(final int i2, final String str) {
        String str2 = C;
        HwLog.i(str2, "transmitDownloadUrl");
        SafeWebView safeWebView = this.mWebView;
        if (safeWebView == null) {
            HwLog.e(str2, "transmitDownloadUrl --  mWebView is null");
        } else {
            safeWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda48
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b(i2, str);
                }
            });
        }
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitDownloadWatchFaceResult(String str, String str2, int i2) {
        this.mWebView.post(new j(str, str2, i2));
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitFinishPay(String str) {
        String str2 = C;
        HwLog.i(str2, "transmitFinishPay");
        SafeWebView safeWebView = this.mWebView;
        if (safeWebView == null) {
            HwLog.e(str2, "showToast error: mWebView is null");
        } else {
            safeWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda17
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.w();
                }
            });
        }
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitGetResult() {
        this.mWebView.post(new r());
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitHealthChildStatusChange(final String str) {
        HwLog.i(C, "transmitHealthChildStatusChange:");
        this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda24
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.i(str);
            }
        });
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitInstallWatchFaceResult(String str, String str2, int i2) {
        HwLog.i(C, " transmitInstallWatchFaceResult hiTopId:" + str);
        this.mWebView.post(new n(com.huawei.watchface.n.e().f(str), str2, i2));
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitInstallWatchFaceResultNew(String str, String str2, int i2) {
        HwLog.i(C, " transmitInstallWatchFaceResultNew hiTopId:" + str);
        this.mWebView.post(new o(com.huawei.watchface.n.e().f(str), str2, i2));
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitLoadingOpen() {
        HwLog.i(C, "transmitLoadingOpen");
        this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda25
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.x();
            }
        });
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitLocalWatchInfoChange(final int i2) {
        this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(i2);
            }
        });
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitMembershipDialogStatus() {
        this.mWebView.post(new l());
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitOperationScene(final String str) {
        HwLog.i(C, "transmitOperationScene");
        if (o()) {
            return;
        }
        this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda33
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.j(str);
            }
        });
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitPayWatchFaceResult(final String str, final String str2, final String str3) {
        String str4 = C;
        HwLog.i(str4, "transmitPayWatchFaceResult");
        if (this.l == null) {
            HwLog.e(str4, "showToast error: handler or names is null");
        } else {
            this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda49
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b(str, str2, str3);
                }
            });
        }
    }

    public void transmitPortraitClippedPath(String str, String str2, String str3, boolean z2, boolean z3) {
        HwLog.i(C, "transmitPortraitClippedPath() enter.");
        HashMap map = new HashMap();
        map.put("imageOriginal", str);
        map.put("imageForeground", str2);
        map.put("imageBackground", str3);
        map.put("isFaceDetected", z2 ? "true" : "false");
        if (z3) {
            map.put("isError", "true");
        }
        transmitClippedPath(GsonHelper.toJson(map));
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitRefreshPullData() {
        HwLog.i(C, "transmitRefreshPullData");
        this.mWebView.post(new y());
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitSearchToImgCut() {
        HwLog.i(C, "transmitSearchToImgCut() enter.");
        if (o()) {
            return;
        }
        this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda38
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.y();
            }
        });
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitSelectImageFailed() {
        if (o()) {
            return;
        }
        this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda47
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.z();
            }
        });
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitSendMemberSignatureResult(final int i2, final String str) {
        HwLog.i(C, "transmitSendMemberSignatureResult");
        if (o()) {
            return;
        }
        this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda22
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.c(i2, str);
            }
        });
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitSetDefaultWatchFaceResult(String str, String str2, int i2) {
        this.mWebView.post(new p(str, str2, i2));
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitShareResult(final String str, final int i2, final String str2) {
        HwLog.i(C, "transmitShareResult");
        if (o()) {
            return;
        }
        this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(str, i2, str2);
            }
        });
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitTryOutOver(final String str, final String str2, final String str3) {
        String str4 = C;
        HwLog.i(str4, "transmitTryOutOver");
        SafeWebView safeWebView = this.mWebView;
        if (safeWebView == null) {
            HwLog.e(str4, "transmitTryOutOver --  mWebView is null");
        } else {
            safeWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda23
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.c(str, str2, str3);
                }
            });
        }
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitUploadImageResult(final int i2, final String str) {
        HwLog.i(C, "transmitUploadImageResult");
        if (o()) {
            return;
        }
        this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.d(i2, str);
            }
        });
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitUserTokenUpdate() {
        HwLog.i(C, "transmitUserTokenUpdate:");
        this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda39
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.A();
            }
        });
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitVerityPwsRes(final String str, final String str2) {
        if (o()) {
            return;
        }
        this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(str, str2);
            }
        });
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitWatchFaceAlbumApplyResult(final int i2) {
        HwLog.i(C, "transmitWatchFaceAlbumApplyResult:" + i2);
        this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda36
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(i2);
            }
        });
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitWatchFaceAlbumInstallResult(int i2) {
        HwLog.i(C, "transmitWatchFaceThemeAlbumInfo:" + i2);
        this.mWebView.post(new c(i2));
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitWatchFaceGoBack() {
        HwLog.i(C, "transmitWatchFaceGoBack");
        this.mWebView.post(new x());
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitWatchFaceKaleidoscopeInfo(final String str) {
        this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda44
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.l(str);
            }
        });
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitWatchFaceKaleidoscopeInstallResult(final int i2) {
        HwLog.i(C, "transmitWatchFaceKaleidoscopeInstallResult:" + i2);
        this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda42
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.c(i2);
            }
        });
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitWatchFaceKaleidoscopeLoadingProgress(final String str) {
        this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m(str);
            }
        });
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitWatchFaceLoginResult(final String str) {
        this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.n(str);
            }
        });
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitWatchFaceNames(String str) {
        String str2 = C;
        HwLog.i(str2, "transmitWatchFaceNames");
        if (this.l == null || TextUtils.isEmpty(str)) {
            HwLog.e(str2, "showToast error: handler or names is null");
        } else {
            this.mWebView.post(new w(str));
        }
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitWatchFaceThemeAlbumInfo(String str) {
        this.mWebView.post(new e0(str));
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitWatchFaceThemeAlbumLoadingProgress(String str) {
        this.mWebView.post(new a(str));
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitWatchFaceThemeWearInfo(String str) {
        this.mWebView.post(new d0(str));
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitWatchFaceThemeWearLoadingProgress(String str) {
        this.mWebView.post(new b(str));
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitWatchFaceTimeWidgetColor(int i2) {
        String strC = CommonUtils.c(i2);
        HwLog.i(C, "color is:" + i2 + "hexColorString:" + strC);
        this.mWebView.post(new c0(strC));
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitWatchFaceVideoAlbumInfo(final String str) {
        this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.o(str);
            }
        });
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitWatchFaceVideoAlbumLoadingProgress(final String str) {
        this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.p(str);
            }
        });
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitWatchFaceVideoInstallResult(final int i2) {
        HwLog.i(C, "transmitWatchFaceVideoInstallResult:" + i2);
        this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda30
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.d(i2);
            }
        });
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitWatchFaceWearInstallResult(int i2) {
        this.mWebView.post(new e(i2));
    }

    @Override // com.huawei.watchface.utils.callback.OperateWatchFaceCallback
    public void transmitWatchInfoChange(int i2) {
        this.mWebView.post(new t());
    }

    public void transmitWearClippedPath(final String str) {
        if (str == null || str.isEmpty()) {
            HwLog.w(C, "transmitWearClippedPath() clippedWearList is null");
        } else {
            HwLog.i(C, "transmitWearClippedPath() enter.");
            this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda45
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.r(str);
                }
            });
        }
    }

    public void u(String str) {
        String str2 = C;
        HwLog.i(str2, "reload");
        if (TextUtils.isEmpty(str)) {
            HwLog.i(str2, "reload tmpReloadUrl is isEmpty");
            str = Constants.ABOUT_BLANK;
        }
        String strG = WebViewUtils.g(str);
        this.f = strG;
        if (!b(strG)) {
            b(false);
            this.f30412a = false;
            return;
        }
        b(true);
        if (CommonUtils.C()) {
            HwLog.i(str2, "reload mOriginUrl isNetworkConnected");
            HashMap map = new HashMap(2);
            map.put("x-version", this.g);
            this.mWebView.loadUrl(this.f, map);
            return;
        }
        if (this.d != 3001) {
            HwLog.i(str2, "reload mOriginUrl MSG_ON_NET_WORK");
            this.l.sendEmptyMessage(2003);
        } else {
            HwLog.i(str2, "reload mOriginUrl TYPE_MINI_SHOP_FRAGMENT");
            HashMap map2 = new HashMap(2);
            map2.put("x-version", this.g);
            this.mWebView.loadUrl(this.f, map2);
        }
    }

    public final /* synthetic */ void v() {
        loadCallJsUrl(WebViewUtils.e("transmitAppGoBack()"));
    }

    public final void w(String str) {
        if (TextUtils.isEmpty(this.A)) {
            HwLog.i(C, "setH5LoadSuccess lastLoadSuccessUrl is empty");
            return;
        }
        if (CommonUtils.k(this.mActivity)) {
            Activity activity = this.mActivity;
            if (activity instanceof WebViewActivity) {
                WebViewActivity webViewActivity = (WebViewActivity) activity;
                if (webViewActivity.isH5LoadSuccess()) {
                    HwLog.i(C, "setH5LoadSuccess isH5LoadSuccess true");
                    return;
                } else {
                    if (TextUtils.equals(this.A, str)) {
                        return;
                    }
                    webViewActivity.setH5LoadSuccess(true);
                    return;
                }
            }
        }
        HwLog.i(C, "setH5LoadSuccess mActivity is valid");
    }

    public void x(String str) {
        this.mWebView.post(new d(str));
    }

    public final /* synthetic */ void y() {
        HwLog.i(C, "transmitSearchToImgCut:javascript:transmitSearchToImgCut()");
        loadCallJsUrl("javascript:transmitSearchToImgCut()");
    }

    public final /* synthetic */ void z() {
        loadCallJsUrl("javascript:transmitSelectImageFailed()");
    }

    public final /* synthetic */ void f(String str) {
        String str2 = "javascript:transmitWatchFaceAlbumPackageName('" + str + Constants.RIGHT_BRACKET;
        HwLog.i(C, "notifyPhotoPackageName:" + str2);
        loadCallJsUrl(str2);
    }

    public final /* synthetic */ void q() {
        HwLog.i(C, "notifyConfigChange:javascript:notifyConfigChange()");
        loadCallJsUrl("javascript:notifyConfigChange()");
    }

    public void t(final String str) {
        HwLog.i(C, "notifyJumpMarket");
        if (o()) {
            return;
        }
        this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda18
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.d(str);
            }
        });
    }

    public final /* synthetic */ void x() {
        String strE = WebViewUtils.e("transmitLoadingOpen()");
        HwLog.i(C, "transmitLoadingOpen:" + strE);
        loadCallJsUrl(strE);
    }

    public final void b(String str, boolean z2) {
        b3.b().a(new v(str, z2));
        b3.b().f();
    }

    public void c(boolean z2) {
        this.u = z2;
    }

    public final /* synthetic */ void d(int i2) {
        String str = "javascript:transmitWatchFaceVideoInstallResult('" + i2 + Constants.RIGHT_BRACKET;
        HwLog.i(C, "transmitWatchFaceVideoInstallResult:" + str);
        loadCallJsUrl(str);
    }

    public void e(int i2) {
        this.mChooseToClipResourceStyle = i2;
    }

    public final /* synthetic */ void g(String str) {
        String str2 = "javascript:transmitWatchFaceVideoAlbumPackageName('" + str + Constants.RIGHT_BRACKET;
        HwLog.i(C, "notifyVideoAlbumPackageName:" + str2);
        loadCallJsUrl(str2);
    }

    public final /* synthetic */ void h(String str) {
        String str2 = "javascript:transmitWatchFaceWearAlbumPackageName('" + str + Constants.RIGHT_BRACKET;
        HwLog.i(C, "notifyWearAlbumPackageName:" + str2);
        loadCallJsUrl(str2);
    }

    public final /* synthetic */ void r() {
        HwLog.i(C, "notifyGetShortCutIsCreate:javascript:notifyGetShortCutIsCreate()");
        loadCallJsUrl("javascript:notifyGetShortCutIsCreate()");
    }

    public final void v(String str) {
        if (this.mWebView == null) {
            return;
        }
        if (CommonUtils.isAndroid13()) {
            HwLog.i(C, "setDarkMode isAndroid13");
            return;
        }
        if (!TextUtils.isEmpty(str) && str.contains(this.p) && Build.VERSION.SDK_INT >= 29) {
            this.mWebView.getSettings().setForceDark(0);
            HwLog.i(C, "setDarkMode FORCE_DARK_OFF");
        } else {
            n1.a(this.mContext, this.mWebView);
        }
    }

    public void y(final String str) {
        if (this.mChooseToClipResourceStyle != 4) {
            HwLog.i(C, "transmitSearchOperationScene is not CHOOSE_PIC_TO_SEARCH mChooseToClipResourceStyle:" + this.mChooseToClipResourceStyle);
            return;
        }
        HwLog.i(C, "transmitSearchOperationScene");
        if (o()) {
            return;
        }
        this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.k(str);
            }
        });
    }

    public final void a(String str, boolean z2) {
        g4 g4VarC = b3.b().c();
        if (g4VarC != null) {
            List listD = g4VarC.d();
            if (!ArrayUtils.isEmpty(listD)) {
                this.mWebView.setWhitelistNotMatchSubDomain((String[]) listD.toArray(new String[0]));
            }
        }
        String str2 = C;
        HwLog.i(str2, "load() enter.");
        if (TextUtils.isEmpty(str)) {
            HwLog.i(str2, "load() originUrl isEmpty");
            str = Constants.ABOUT_BLANK;
        }
        String strG = WebViewUtils.g(str);
        this.f = strG;
        if (!b(strG)) {
            b(false);
            this.f30412a = false;
        } else if (t4.a(this.f)) {
            HwLog.e(str2, "load() url contain xss char");
        } else {
            b(true);
            c(this.f, z2);
        }
    }

    public final void c(String str, boolean z2) {
        if (!CommonUtils.C() && !str.startsWith("file:///android_asset/")) {
            if (this.d == 3001) {
                HashMap map = new HashMap(2);
                map.put("x-version", this.g);
                this.mWebView.loadUrl(str, map);
                HwLog.i(C, "loadUrl url TYPE_MINI_SHOP_FRAGMENT");
                return;
            }
            this.l.sendEmptyMessage(2003);
            HwLog.i(C, "loadUrl url MSG_ON_NET_WORK");
            return;
        }
        String str2 = C;
        HwLog.i(str2, "loadUrl url isNetworkConnected");
        HashMap map2 = new HashMap(2);
        map2.put("x-version", this.g);
        HwLog.i(str2, "init time loadUrl:" + (System.currentTimeMillis() - HwWatchFaceApi.getInstance(this.mContext).getInitTime()));
        this.mWebView.loadUrl(str, map2);
        if (z2) {
            this.mWebView.loadUrl("javascript:window.location.reload( true )");
        }
        this.mWebView.postDelayed(new z(), 1000L);
    }

    public final /* synthetic */ void e(String str) {
        String str2 = "javascript:transmitWatchFaceKaleidoscopePackageName('" + str + Constants.RIGHT_BRACKET;
        HwLog.i(C, "notifyKaleidoscopePackageName:" + str2);
        loadCallJsUrl(str2);
    }

    public final boolean o() {
        if (this.mWebView != null) {
            return false;
        }
        HwLog.e(C, "mWebView is null");
        return true;
    }

    public final /* synthetic */ void p(String str) {
        String str2 = "javascript:transmitWatchFaceVideoAlbumLoadingProgress('" + str + Constants.RIGHT_BRACKET;
        HwLog.i(C, "transmitWatchFaceVideoAlbumLoadingProgress:" + str2);
        loadCallJsUrl(str2);
    }

    public final /* synthetic */ void s() {
        HwLog.i(C, "notifyGetWatchfaceStore:javascript:transmitGetWatchfaceStore()");
        loadCallJsUrl("javascript:transmitGetWatchfaceStore()");
    }

    public final /* synthetic */ void d(int i2, String str) {
        String url = WebViewUtils.getUrl("transmitUploadImageResult", i2 + "', '" + str);
        String str2 = C;
        StringBuilder sb = new StringBuilder("transmitUploadImageResult:");
        sb.append(url);
        HwLog.i(str2, sb.toString());
        loadCallJsUrl(url);
    }

    public final /* synthetic */ void j(String str) {
        String url = WebViewUtils.getUrl("transmitOperationScene", str);
        HwLog.i(C, "transmitOperationScene:" + url);
        loadCallJsUrl(url);
    }

    public final /* synthetic */ void l(String str) {
        String str2 = "javascript:transmitWatchFaceKaleidoscopeInfo('" + str + Constants.RIGHT_BRACKET;
        HwLog.iBetaLog(C, "transmitWatchFaceKaleidoscopeInfo:" + str2);
        loadCallJsUrl(str2);
    }

    public final /* synthetic */ void d(String str) {
        String strE = WebViewUtils.e("notifyJumpMarket('" + str + Constants.RIGHT_BRACKET);
        HwLog.i(C, "notifyJumpMarket:" + strE);
        loadCallJsUrl(strE);
    }

    public final /* synthetic */ void n(String str) {
        String url = WebViewUtils.getUrl("transmitWatchFaceLoginResult", str);
        HwLog.i(C, "transmitWatchFaceLoginResult:" + url);
        loadCallJsUrl(url);
    }

    public void b() {
        String str = C;
        HwLog.i(str, "clearUploadMessage");
        ValueCallback valueCallback = this.i;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
            this.i = null;
            return;
        }
        ValueCallback valueCallback2 = this.j;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(new Uri[0]);
            this.j = null;
        } else {
            HwLog.d(str, "clearUploadMessage mUploadMessage = null,mUploadMessageForAndroid5 = null");
        }
    }

    public final /* synthetic */ void k(String str) {
        String url = WebViewUtils.getUrl("transmitSearchOperationScene", str);
        HwLog.i(C, "transmitSearchOperationScene:" + url);
        loadCallJsUrl(url);
    }

    public final /* synthetic */ void w() {
        String url = WebViewUtils.getUrl("transmitFinishPay", "");
        HwLog.i(C, "transmitFinishPay:" + url);
        loadCallJsUrl(url);
    }

    public void b(boolean z2) {
        HwLog.i(C, "setJsEnable isEnable:" + z2);
        SafeWebView safeWebView = this.mWebView;
        if (safeWebView != null) {
            safeWebView.getSettings().setJavaScriptEnabled(z2);
        }
    }

    public boolean b(String str) {
        g4 g4VarC = b3.b().c();
        return g4VarC != null && g4VarC.a(str);
    }

    public final /* synthetic */ void i(String str) {
        String str2 = "javascript:transmitHealthChildStatusChange('" + str + Constants.RIGHT_BRACKET;
        HwLog.i(C, "transmitHealthChildStatusChange:" + str2);
        loadCallJsUrl(str2);
    }

    public final int b(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(com.huawei.openalliance.ad.constant.Constants.NATIVE_WINDOW_SUB_DIR);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public final /* synthetic */ void u() {
        loadCallJsUrl(WebViewUtils.e("resetWatchFaceAlbumInfoStatus()"));
    }

    public final /* synthetic */ void b(String str, String str2, String str3) {
        String url = WebViewUtils.getUrl("transmitPayWatchFaceResult", str + "', '" + str2 + "', '" + str3);
        String str4 = C;
        StringBuilder sb = new StringBuilder("transmitPayWatchFaceResult:");
        sb.append(url);
        HwLog.i(str4, sb.toString());
        loadCallJsUrl(url);
    }

    public final /* synthetic */ void m(String str) {
        String str2 = "javascript:transmitWatchFaceKaleidoscopeLoadingProgress('" + str + Constants.RIGHT_BRACKET;
        HwLog.i(C, "transmitWatchFaceKaleidoscopeLoadingProgress:" + str2);
        loadCallJsUrl(str2);
    }

    public void a(String str) {
        String url;
        HwLog.i(C, "callBackWebViewStatus status:" + str);
        if (TextUtils.isEmpty(this.q)) {
            url = "";
        } else {
            String strEncodeForJavaScript = EncodeUtil.encodeForJavaScript(this.q);
            this.q = strEncodeForJavaScript;
            url = WebViewUtils.getUrl(strEncodeForJavaScript, str);
        }
        loadCallJsUrl(url);
    }

    public void b(final String... strArr) {
        String str = C;
        HwLog.i(str, "notifyH5ApplyPermission");
        if (this.mWebView == null) {
            HwLog.e(str, "notifyH5ApplyPermission error: mWebView is null");
        } else if (ArrayUtils.isEmpty(strArr)) {
            HwLog.e(str, "notifyH5ApplyPermission error: permissions is null");
        } else {
            this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(strArr);
                }
            });
        }
    }

    public final /* synthetic */ void a(boolean z2, String str) {
        String url = WebViewUtils.getUrl("transmiDeviceConnectState", z2 + "', '" + str);
        String str2 = C;
        StringBuilder sb = new StringBuilder("transmiDeviceConnectState");
        sb.append(url);
        HwLog.i(str2, sb.toString());
        loadCallJsUrl(url);
    }

    public void a() {
        HwLog.i(C, "choosePictureToClip() enter.");
        View viewInflate = ((LayoutInflater) this.mContext.getSystemService("layout_inflater")).inflate(R.layout.watchface_dialog_select_user_photo, (ViewGroup) null);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.mContext);
        builder.setNegativeButton(R.string.cancel, new View.OnClickListener() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda27
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.a(view);
            }
        });
        builder.setTitle(DensityUtil.getStringById(R.string.photo_album_select_upload_way)).setView(viewInflate);
        this.mCustomViewDialog = builder.create();
        viewInflate.findViewById(R.id.photo_album_take_photo).setOnClickListener(this);
        viewInflate.findViewById(R.id.photo_album_gallery).setOnClickListener(this);
        this.mCustomViewDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda28
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f$0.a(dialogInterface);
            }
        });
        this.mCustomViewDialog.show();
        y("1");
    }

    public final /* synthetic */ void b(int i2, String str) {
        String url = WebViewUtils.getUrl("transmitDownloadUrl", i2 + "', '" + str);
        String str2 = C;
        StringBuilder sb = new StringBuilder("transmitDownloadUrl:");
        sb.append(url);
        HwLog.i(str2, sb.toString());
        loadCallJsUrl(url);
    }

    public void c(String[] strArr) {
        String str = C;
        HwLog.i(str, "toNotifyH5ApplyPermission enter");
        boolean z2 = this.mChooseToClipResourceStyle == 4;
        boolean z3 = this.z == 5;
        HashSet hashSet = new HashSet();
        if (ArrayUtils.isEmpty(strArr)) {
            HwLog.i(str, "toNotifyH5ApplyPermission permission is empty");
            return;
        }
        Map mapA = PermissionUtils.a(z2, z3);
        for (String str2 : strArr) {
            if (!PermissionUtils.checkPermission(str2) && mapA.containsKey(str2)) {
                String str3 = (String) mapA.get(str2);
                if (!TextUtils.isEmpty(str3)) {
                    hashSet.add(str3);
                }
            }
        }
        if (ArrayUtils.isEmpty(hashSet)) {
            return;
        }
        b((String[]) hashSet.toArray(new String[0]));
    }

    public final /* synthetic */ void b(int i2) {
        String str = "javascript:transmitWatchFaceAlbumApplyResult('" + i2 + Constants.RIGHT_BRACKET;
        HwLog.i(C, "transmitWatchFaceAlbumApplyResult:" + str);
        loadCallJsUrl(str);
    }

    public void b(final BackgroundOptionalConfig backgroundOptionalConfig) {
        if (backgroundOptionalConfig == null) {
            HwLog.i(C, "transmitClippedKaleidoscopeInfo() backgroundOptionalConfig is null");
        } else {
            HwLog.i(C, "transmitClippedKaleidoscopeInfo() enter.");
            this.mWebView.post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(backgroundOptionalConfig);
                }
            });
        }
    }

    public final /* synthetic */ void b(String str, String str2) {
        String url = WebViewUtils.getUrl("transmitVerityPwsRes", str + "', '" + str2);
        String str3 = C;
        StringBuilder sb = new StringBuilder("transmitVerityPwsRes:");
        sb.append(url);
        HwLog.i(str3, sb.toString());
        loadCallJsUrl(url);
    }

    public final /* synthetic */ void a(View view) {
        I();
        y("4");
    }

    public final /* synthetic */ void a(DialogInterface dialogInterface) {
        y("5");
    }

    public final /* synthetic */ void c(String str, String str2, String str3) {
        String url = WebViewUtils.getUrl("transmitTryOutOver", str + "', '" + str2 + "', '" + str3);
        String str4 = C;
        StringBuilder sb = new StringBuilder("transmitTryOutOver:");
        sb.append(url);
        HwLog.i(str4, sb.toString());
        loadCallJsUrl(url);
    }

    public final int a(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService(com.huawei.openalliance.ad.constant.Constants.NATIVE_WINDOW_SUB_DIR)).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(defaultDisplay, defaultDisplay);
        } catch (ClassNotFoundException unused) {
            HwLog.i(C, "ClassNotFoundException");
        } catch (IllegalAccessException unused2) {
            HwLog.i(C, "IllegalAccessException");
        } catch (NoSuchMethodException unused3) {
            HwLog.i(C, "NoSuchMethodException");
        } catch (InvocationTargetException unused4) {
            HwLog.i(C, "InvocationTargetException");
        }
        return displayMetrics.heightPixels;
    }

    public final /* synthetic */ void c(int i2) {
        String str = "javascript:transmitWatchFaceKaleidoscopeInstallResult('" + i2 + Constants.RIGHT_BRACKET;
        HwLog.i(C, "transmitWatchFaceKaleidoscopeInstallResult:" + str);
        loadCallJsUrl(str);
    }

    public final /* synthetic */ void c(String str) {
        String str2 = "javascript:handleCallbackResult('" + str + Constants.RIGHT_BRACKET;
        HwLog.i(C, "handleCallbackResult:" + str2);
        loadCallJsUrl(str2);
    }

    public final /* synthetic */ void c(int i2, String str) {
        String url = WebViewUtils.getUrl("transmitSendMemberSignatureResult", i2 + "', '" + str);
        String str2 = C;
        StringBuilder sb = new StringBuilder("transmitSendMemberSignatureResult:");
        sb.append(url);
        HwLog.i(str2, sb.toString());
        loadCallJsUrl(url);
    }

    public final /* synthetic */ void a(String[] strArr) {
        String url = WebViewUtils.getUrl("transmitApplyPermissionResult", String.join("_", strArr));
        HwLog.i(C, "transmitApplyPermissionResult:" + url);
        loadCallJsUrl(url);
    }

    public static void a(long j2) {
        E = j2;
    }

    public void a(int i2, boolean z2) {
        synchronized (this) {
            HwLog.i(C, "onRequestPermissionsResult() requestCode: " + i2 + ", result: " + z2);
            b("0");
            PermissionUtils.PermissonListener permissonListener = (PermissionUtils.PermissonListener) this.y.get(i2);
            this.y.remove(i2);
            a(permissonListener, z2);
        }
    }

    public final void a(PermissionUtils.PermissonListener permissonListener, boolean z2) {
        if (permissonListener != null) {
            permissonListener.onRequested(z2);
        }
    }

    public final /* synthetic */ void a(int i2, String str) {
        String url = WebViewUtils.getUrl("transmitDecryptResult", i2 + "', '" + str);
        String str2 = C;
        StringBuilder sb = new StringBuilder("transmitDecryptResult:");
        sb.append(url);
        HwLog.i(str2, sb.toString());
        loadCallJsUrl(url);
    }

    public final /* synthetic */ void a(boolean z2) {
        String str = "javascript:notifyBackgroundChange('" + z2 + Constants.RIGHT_BRACKET;
        HwLog.i(C, "notifyBackgroundChange:" + str);
        loadCallJsUrl(str);
    }

    public final /* synthetic */ void a(BackgroundOptionalConfig backgroundOptionalConfig) {
        loadCallJsUrl(WebViewUtils.getUrl("transmitClippedKaleidoscopeInfo", new Gson().toJson(backgroundOptionalConfig)));
    }

    public final /* synthetic */ void a(String str, String str2) {
        String url = WebViewUtils.getUrl("notifyCurrentWatchfaceIsVipFree", str + "', '" + str2);
        String str3 = C;
        StringBuilder sb = new StringBuilder("notifyCurrentWatchfaceIsVipFree:");
        sb.append(url);
        HwLog.i(str3, sb.toString());
        loadCallJsUrl(url);
    }

    public final /* synthetic */ void a(String str, String str2, String str3) {
        String strG = com.huawei.watchface.n.e().g(str);
        HwLog.i(C, "transmitDialRecycleResult  realHiTopId: " + str + "," + strG);
        loadCallJsUrl(WebViewUtils.getUrl("transmitDialRecycleResult", strG + "', '" + str2 + "', '" + str3));
    }

    public final /* synthetic */ void a(String str, int i2, String str2) {
        String url = WebViewUtils.getUrl("transmitShareResult", str + "', '" + i2 + "', '" + str2);
        String str3 = C;
        StringBuilder sb = new StringBuilder("transmitShareResult:");
        sb.append(url);
        HwLog.i(str3, sb.toString());
        loadCallJsUrl(url);
    }

    public final /* synthetic */ void a(int i2) {
        String strE = WebViewUtils.e("transmitLocalWatchInfoChange('" + i2 + Constants.RIGHT_BRACKET);
        HwLog.i(C, "transmitLocalWatchInfoChange:" + strE);
        loadCallJsUrl(strE);
    }

    public static class g0 implements PermissionUtils.PermissonListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Activity f30441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f30442b;

        public g0(Activity activity, int i) {
            this.f30441a = activity;
            this.f30442b = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(View view) {
            HwLog.d(CustomWebView.C, "positiveListener click");
            CustomWebView.notifyH5(this.f30441a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(View view) {
            HwLog.d(CustomWebView.C, "negativeListener click");
            CustomWebView.notifyH5(this.f30441a);
        }

        @Override // com.huawei.watchface.utils.PermissionUtils.PermissonListener
        public void onRequested(boolean z) {
            e4.a("android.permission.WRITE_EXTERNAL_STORAGE", false, "sp_permission_file");
            if (z && PermissionUtils.checkPermission(CustomWebView.GALLERY_PERMISSIONS[0])) {
                ChoosePicUtil.a(this.f30441a, this.f30442b);
            } else if (Environment.sIsAarInTheme) {
                CommonUtils.showPermissionSettingGuide(this.f30441a, DensityUtil.getStringById(R.string.watch_face_camera_permission_content));
            } else {
                HwWatchFaceApi.getInstance(this.f30441a).showHealthAppSettingGuide(this.f30441a, CommonUtils.isAndroid13() ? PermissionUtil.PermissionType.MEDIA_VIDEO_IMAGES.getPermission() : PermissionUtil.PermissionType.STORAGE.getPermission(), new View.OnClickListener() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$g0$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f$0.a(view);
                    }
                }, new View.OnClickListener() { // from class: com.huawei.watchface.mvp.ui.view.CustomWebView$g0$$ExternalSyntheticLambda1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f$0.b(view);
                    }
                });
            }
        }
    }
}
