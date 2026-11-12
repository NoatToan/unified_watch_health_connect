package com.huami.discovery.bridge;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.JsResult;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import androidx.webkit.WebSettingsCompat;
import androidx.webkit.WebViewFeature;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.devicerecorder.UriGetter;
import com.huami.discovery.bridge.WebFragment;
import com.huami.discovery.bridge.bracelet.BraceletCallback;
import com.huami.discovery.bridge.bracelet.BraceletHandler;
import com.huami.discovery.bridge.jsbridge.JsBridgeCallback;
import com.huami.discovery.bridge.jsbridge.JsBridgeDefaultHandler;
import com.huami.discovery.bridge.jsbridge.JsBridgeNativeAPI;
import com.huami.discovery.bridge.jsbridge.JsBridgeUtil;
import com.huami.discovery.bridge.jsbridge.JsBridgeWebView;
import com.huami.discovery.bridge.jsbridge.JsBridgeWebViewClient;
import com.huami.discovery.bridge.jsbridge.view.ObservableWebView;
import com.huami.discovery.bridge.model.WebItem;
import com.huami.discovery.bridge.util.ImageUtils;
import com.huami.discovery.bridge.util.NetUtil;
import com.huami.tools.log.HMLog;
import com.huami.widget.toast.IconToast;
import com.tbruyelle.rxpermissions2.Permission;
import com.tbruyelle.rxpermissions2.RxPermissions;
import com.xiaomi.hm.health.baseutil.FileUtils;
import defpackage.yp8;
import io.reactivex.functions.Consumer;
import java.io.File;

/* JADX INFO: loaded from: classes8.dex */
public class WebFragment extends Fragment {
    public static final int CUSTOM_NO_TOKEN = 50;
    private static final String G = "WebFragment";
    private static final String H = "Item";
    private static final int I = 4659;
    private static final String J = "huami.health.authorization";
    public static final String WEBVIEW_LOADRESULT = "WebView_LoadResult";
    public static final String WEB_INTENT_ARG_RETURN_URL = "com.xiaomi.hm.health.web.RETURN_URL";
    private boolean A;
    private boolean B;
    private View F;
    private WebItem a;
    private WebLoadCallback b;
    private int c;
    private int d;
    private WebChromeClient.CustomViewCallback e;
    private View f;
    private TextView g;
    private ImageView h;
    private boolean i;
    private ProgressBar j;
    private String k;
    private JsBridgeWebView l;
    private WebSettings m;
    private JsBridgeWebViewClient n;
    private Context o;
    private WebChromeClient p;
    private ValueCallback q;
    private String r;
    private DownloadListener s;
    private OnWebViewScrollChangedListener t;
    private String u;
    private JsBridgeNativeAPI v;
    private JsBridgeCallback w;
    private BraceletHandler x;
    private BraceletCallback y;
    private WebLoadNewWindow z;
    public boolean isViewCreated = false;
    public boolean isInitWebView = false;
    private ObservableWebView.OnScrollChangeListener C = new c();
    private boolean D = false;
    private boolean E = false;

    public interface OnWebViewScrollChangedListener {
        void onScrollChange(String str, int i, int i2);
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!NetUtil.isNetworkConnected(WebFragment.this.o)) {
                IconToast.showError(WebFragment.this.getContext(), R.string.bridge_no_network);
                return;
            }
            WebFragment.this.g.setText(R.string.bridge_web_loading);
            if (!WebFragment.this.i) {
                WebFragment.this.reload();
                return;
            }
            WebFragment.this.i = false;
            WebFragment webFragment = WebFragment.this;
            webFragment.W(webFragment.a.url);
        }
    }

    public class b implements WebLoadCallback {
        public b() {
        }

        @Override // com.huami.discovery.bridge.WebLoadCallback
        public void onError(int i) {
            WebFragment.this.j.setVisibility(4);
        }

        @Override // com.huami.discovery.bridge.WebLoadCallback
        public void onPageFinish() {
            WebFragment.this.j.setVisibility(4);
        }

        @Override // com.huami.discovery.bridge.WebLoadCallback
        public void onPageStart() {
            WebFragment.this.j.setVisibility(0);
        }

        @Override // com.huami.discovery.bridge.WebLoadCallback
        public void onProgressChanged(int i) {
            WebFragment.this.j.setProgress(i);
        }

        @Override // com.huami.discovery.bridge.WebLoadCallback
        public void onReceivedTitle(String str) {
        }

        @Override // com.huami.discovery.bridge.WebLoadCallback
        public /* synthetic */ void onSslError(SslError sslError) {
            yp8.a(this, sslError);
        }
    }

    public class c implements ObservableWebView.OnScrollChangeListener {
        public c() {
        }

        @Override // com.huami.discovery.bridge.jsbridge.view.ObservableWebView.OnScrollChangeListener
        public void onScrollChange(View view, int i, int i2, int i3, int i4) {
            if (WebFragment.this.t != null) {
                WebFragment.this.t.onScrollChange(WebFragment.this.u, i, i2);
            }
        }
    }

    public class d extends WebChromeClient {

        public class a implements DialogInterface.OnClickListener {
            public final /* synthetic */ JsResult a;

            public a(JsResult jsResult) {
                this.a = jsResult;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                this.a.confirm();
            }
        }

        private d() {
        }

        private void a(ConsoleMessage.MessageLevel messageLevel, String str, int i, String str2) {
            HMLog.i("console", "[" + messageLevel + "] " + str + "(" + str2 + ":" + i + ")", new Object[0]);
        }

        @Override // android.webkit.WebChromeClient
        public void onConsoleMessage(String str, int i, String str2) {
            super.onConsoleMessage(str, i, str2);
            a(ConsoleMessage.MessageLevel.LOG, str, i, str2);
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            HMLog.i(WebFragment.G, "onShowCustomView : ", new Object[0]);
            ((FrameLayout) WebFragment.this.getActivity().getWindow().getDecorView()).removeView(WebFragment.this.F);
            WebFragment.this.F = null;
            WebFragment.this.getActivity().getWindow().getDecorView().setSystemUiVisibility(WebFragment.this.c);
            WebFragment.this.getActivity().setRequestedOrientation(WebFragment.this.d);
            WebFragment.this.e.onCustomViewHidden();
            WebFragment.this.e = null;
            WebFragment.this.B = false;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            new AlertDialogFragment.Builder(WebFragment.this.o).setTitle("Alert").setMessage(str2).setCancelable(true).setNeutralButton(android.R.string.ok, new a(jsResult)).show(WebFragment.this.getFragmentManager(), "Alert");
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            HMLog.i(WebFragment.G, "onProgressChanged : " + i, new Object[0]);
            if (WebFragment.this.b != null) {
                WebFragment.this.b.onProgressChanged(i);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            HMLog.i(WebFragment.G, "onReceivedTitle : " + str, new Object[0]);
            if (WebFragment.this.b == null || WebFragment.this.E) {
                return;
            }
            WebFragment.this.b.onReceivedTitle(str);
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            HMLog.i(WebFragment.G, "onShowCustomView : ", new Object[0]);
            if (WebFragment.this.F != null) {
                onHideCustomView();
                return;
            }
            WebFragment.this.F = view;
            WebFragment webFragment = WebFragment.this;
            webFragment.c = webFragment.getActivity().getWindow().getDecorView().getSystemUiVisibility();
            WebFragment webFragment2 = WebFragment.this;
            webFragment2.d = webFragment2.getActivity().getRequestedOrientation();
            WebFragment.this.e = customViewCallback;
            ((FrameLayout) WebFragment.this.getActivity().getWindow().getDecorView()).addView(WebFragment.this.F, new FrameLayout.LayoutParams(-1, -1));
            WebFragment.this.getActivity().getWindow().getDecorView().setSystemUiVisibility(3590);
            WebFragment.this.getActivity().setRequestedOrientation(0);
            WebFragment.this.B = true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            if (Build.VERSION.SDK_INT < 21) {
                return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
            }
            if (WebFragment.this.q != null) {
                WebFragment.this.q.onReceiveValue(null);
            }
            WebFragment.this.q = valueCallback;
            String str = (fileChooserParams.getAcceptTypes() == null || fileChooserParams.getAcceptTypes().length <= 0) ? "" : fileChooserParams.getAcceptTypes()[0];
            if (TextUtils.isEmpty(str)) {
                str = UriGetter.ShareContentType.IMAGE;
            }
            Intent intent = new Intent();
            intent.setAction("android.intent.action.PICK");
            intent.setType(str);
            WebFragment.this.J(intent);
            return true;
        }

        public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
            if (WebFragment.this.q != null) {
                WebFragment.this.q.onReceiveValue(null);
            }
            WebFragment.this.q = valueCallback;
            Intent intent = new Intent("android.intent.action.PICK");
            if (TextUtils.isEmpty(str)) {
                str = UriGetter.ShareContentType.IMAGE;
            }
            intent.setType(str);
            WebFragment.this.J(intent);
        }

        public /* synthetic */ d(WebFragment webFragment, a aVar) {
            this();
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            a(consoleMessage.messageLevel(), consoleMessage.message(), consoleMessage.lineNumber(), consoleMessage.sourceId());
            return super.onConsoleMessage(consoleMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(final Intent intent) {
        new RxPermissions(getActivity()).requestEachCombined("android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE").subscribe(new Consumer() { // from class: up8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.T(intent, (Permission) obj);
            }
        });
    }

    private void K(String str) {
        if (str.contains(J)) {
            String str2 = this.k;
            if (str2 == null || !str.contains(str2)) {
                HMLog.i(G, "checkIsAuthorizeUrl set new authorizeUrl", new Object[0]);
                this.k = str;
            }
            HMLog.i(G, "checkIsAuthorizeUrl:" + this.k, new Object[0]);
        }
    }

    private Intent L() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        File appFileDir = FileUtils.getAppFileDir(requireContext(), Environment.DIRECTORY_PICTURES);
        File file = new File(appFileDir.getAbsolutePath() + File.separator + (System.currentTimeMillis() + "") + ".JPEG");
        this.r = file.getAbsolutePath();
        intent.putExtra("output", P(file));
        return intent;
    }

    private Intent M(Intent... intentArr) {
        Intent intent = new Intent("android.intent.action.CHOOSER");
        intent.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(SslError sslError) {
        this.f.setClickable(true);
        this.h.setImageResource(R.drawable.ic_network_error_64);
        this.g.setText(getString(R.string.bridge_no_network));
        this.f.setVisibility(0);
        WebLoadCallback webLoadCallback = this.b;
        if (webLoadCallback != null) {
            webLoadCallback.onSslError(sslError);
            this.b.onReceivedTitle("");
        }
    }

    private Bitmap O() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(this.r, options);
        int iMin = Math.min(Math.min(options.outWidth, options.outHeight), RaceId.RACE_NVKEY_READFULLKEY);
        options.inSampleSize = ImageUtils.calculateInSampleSize(options, iMin, iMin);
        options.inPreferredConfig = Bitmap.Config.ARGB_4444;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inJustDecodeBounds = false;
        try {
            return BitmapFactory.decodeFile(this.r, options);
        } catch (OutOfMemoryError unused) {
            HMLog.e(G, "OutOfMemoryError", new Object[0]);
            return null;
        }
    }

    private Uri P(File file) {
        return FileProvider.getUriForFile(requireContext(), getContext().getPackageName() + ".bridge.fileprovider", file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(String str) {
        try {
            this.o.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Exception e2) {
            HMLog.i(G, "StartIntent Error: " + str, new Object[0]);
            e2.printStackTrace();
        }
    }

    private void R(boolean z) {
        if (!this.isViewCreated || this.isInitWebView || !z || getView() == null) {
            return;
        }
        JsBridgeWebView jsBridgeWebView = new JsBridgeWebView(getContext());
        this.l = jsBridgeWebView;
        jsBridgeWebView.setBackgroundColor(0);
        ((FrameLayout) getView().findViewById(R.id.web_view_layout)).addView(this.l);
        this.l.setOnScrollChangedCallback(this.C);
        this.m = this.l.getSettings();
        if (WebViewFeature.isFeatureSupported("FORCE_DARK")) {
            int i = getResources().getConfiguration().uiMode & 48;
            if (i == 0 || i == 16) {
                WebSettingsCompat.setForceDark(this.m, 0);
            } else if (i == 32) {
                WebSettingsCompat.setForceDark(this.m, 2);
            }
        }
        this.m.setJavaScriptEnabled(true);
        this.m.setSupportZoom(true);
        this.m.setBuiltInZoomControls(true);
        this.m.setDisplayZoomControls(false);
        this.m.setUseWideViewPort(true);
        this.m.setLoadWithOverviewMode(true);
        this.m.setAllowUniversalAccessFromFileURLs(false);
        this.m.setAllowFileAccessFromFileURLs(false);
        WebItem webItem = this.a;
        if (webItem != null) {
            if (!webItem.isUseCache) {
                this.m.setCacheMode(2);
            } else if (NetUtil.isNetworkConnected(getContext())) {
                this.m.setCacheMode(-1);
            } else {
                this.m.setCacheMode(1);
            }
            if (this.a.showProgressBar) {
                Z();
            }
        }
        this.m.setPluginState(WebSettings.PluginState.ON);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            this.m.setMixedContentMode(2);
        }
        configureAppCache(this.m);
        configureDOMStorage(this.m);
        if (i2 >= 19) {
            WebView.setWebContentsDebuggingEnabled(!BridgeCallbackBinder.getInstance().getAppNativeFunctionCallback().isLiveEnvironment());
        }
        this.l.setDefaultHandler(new JsBridgeDefaultHandler());
        e eVar = new e(this.l);
        this.n = eVar;
        this.l.setWebViewClient(eVar);
        d dVar = new d(this, null);
        this.p = dVar;
        this.l.setWebChromeClient(dVar);
        this.l.setDownloadListener(this.s);
        JsBridgeNativeAPI jsBridgeNativeAPI = new JsBridgeNativeAPI(getContext(), this.l);
        this.v = jsBridgeNativeAPI;
        jsBridgeNativeAPI.setJsBridgeListener(this.w);
        this.v.setJsBridgeApi(BridgeCallbackBinder.getInstance().getmJsBridgeApi());
        if (BridgeCallbackBinder.getInstance().getUserAgenter() != null) {
            this.m.setUserAgentString(BridgeCallbackBinder.getInstance().getUserAgenter().handleOriginUAString(this.m.getUserAgentString()));
        }
        HMLog.i(G, "initWebView: load url = " + this.a.url, new Object[0]);
        W(this.a.url);
        this.isInitWebView = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean S(String str) {
        return (this.x.isBraceletUrl(str) || JsBridgeUtil.isJsBridgeUrl(str)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T(Intent intent, Permission permission) throws Exception {
        if (permission.granted) {
            X(intent);
        } else {
            if (permission.shouldShowRequestPermissionRationale) {
                return;
            }
            a0((AppCompatActivity) getActivity(), getString(R.string.bridge_permission_cam));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void U(DialogInterface dialogInterface, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V(AppCompatActivity appCompatActivity, DialogInterface dialogInterface, int i) {
        b0(appCompatActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(String str) {
        Y();
        loadPage(str);
    }

    private void X(Intent intent) {
        Intent intentM = M(L());
        intentM.putExtra("android.intent.extra.INTENT", intent);
        intentM.putExtra("android.intent.extra.TITLE", getString(R.string.bridge_web_choose_upload_file));
        startActivityForResult(intentM, I);
    }

    private void Y() {
        if (Build.VERSION.SDK_INT < 21 || this.l == null) {
            return;
        }
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.l, true);
    }

    private void Z() {
        ProgressBar progressBar = this.j;
        if (progressBar == null) {
            return;
        }
        progressBar.setVisibility(0);
        this.b = new b();
    }

    private void a0(final AppCompatActivity appCompatActivity, String str) {
        new AlertDialogFragment.Builder(appCompatActivity).setTitle(R.string.bridge_permisson_tips_dialog_title).setMessage(str).setNegativeButton(R.string.bridge_cancel, new DialogInterface.OnClickListener() { // from class: tp8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                WebFragment.U(dialogInterface, i);
            }
        }).setPositiveButton(R.string.bridge_per_go_setting, new DialogInterface.OnClickListener() { // from class: sp8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.V(appCompatActivity, dialogInterface, i);
            }
        }).show(appCompatActivity.getSupportFragmentManager());
    }

    private void b0(AppCompatActivity appCompatActivity) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + appCompatActivity.getPackageName()));
        appCompatActivity.startActivity(intent);
    }

    private void initView(View view) {
        this.j = (ProgressBar) view.findViewById(R.id.web_view_progress_inner);
        this.g = (TextView) view.findViewById(R.id.web_status_text);
        this.h = (ImageView) view.findViewById(R.id.web_status_iv);
        View viewFindViewById = view.findViewById(R.id.status_layout);
        this.f = viewFindViewById;
        viewFindViewById.setVisibility(this.a.isShowLoadingTip ? 0 : 8);
        this.f.setOnClickListener(new a());
    }

    public static WebFragment newInstance(WebItem webItem) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(H, webItem);
        WebFragment webFragment = new WebFragment();
        webFragment.setArguments(bundle);
        return webFragment;
    }

    public void configureAppCache(WebSettings webSettings) {
        webSettings.setAppCacheEnabled(true);
        webSettings.setAppCachePath(getContext().getDir("cache", 0).getPath());
    }

    public void configureDOMStorage(WebSettings webSettings) {
        webSettings.setDomStorageEnabled(true);
        webSettings.setDatabaseEnabled(true);
        webSettings.setDatabasePath(getContext().getDir("database", 0).getPath());
    }

    public void dealErrorTip(int i) {
        boolean z = !NetUtil.isNetworkConnected(this.o);
        StringBuilder sb = new StringBuilder();
        int i2 = R.drawable.ic_network_error_64;
        if (i == -2 || i == -1) {
            if (z) {
                sb.append(getString(R.string.bridge_no_network));
                this.E = true;
            } else {
                sb.append(getString(R.string.bridge_web_load_failed));
            }
        } else if (i == -14 || i == -6) {
            i2 = R.drawable.ic_no_content_64;
            sb.append(getString(R.string.bridge_no_page_404));
        } else {
            sb.append(getString(R.string.bridge_web_load_failed));
        }
        if (z) {
            this.f.setClickable(true);
        } else if (i == -14 || i == -6) {
            this.f.setClickable(false);
        } else {
            if (i == 50) {
                this.i = true;
                sb.append("token invalid");
            }
            this.f.setClickable(true);
        }
        if (z || i == 50 || i == -2 || i == -1) {
            this.h.setImageResource(i2);
            this.g.setText(sb.toString());
            this.f.setVisibility(0);
        }
        WebLoadCallback webLoadCallback = this.b;
        if (webLoadCallback != null) {
            webLoadCallback.onReceivedTitle("");
        }
    }

    public String getAuthorizeUrl() {
        return this.k;
    }

    public WebView getWebView() {
        return this.l;
    }

    public void loadPage(String str) {
        if (verifyUrlBeforeLoad(str)) {
            HMLog.i(G, "Load Url : " + str, new Object[0]);
            this.l.loadUrl(str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Bitmap bitmapO;
        super.onActivityResult(i, i2, intent);
        HMLog.i(G, "onActivityResult data =" + intent + ",requestCode=" + i, new Object[0]);
        if (i == I) {
            if (i2 != -1) {
                ValueCallback valueCallback = this.q;
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(null);
                    this.q = null;
                    return;
                }
                return;
            }
            if (this.q == null) {
                return;
            }
            Uri data = intent == null ? null : intent.getData();
            if (data == null && (bitmapO = O()) != null) {
                data = FileUtils.saveBitmapToPictures(requireContext(), bitmapO, System.currentTimeMillis() + "", Bitmap.CompressFormat.JPEG);
                bitmapO.recycle();
            }
            try {
                if (this.q != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onActivityResult after parser uri:");
                    sb.append(data != null ? data.toString() : "");
                    HMLog.i(G, sb.toString(), new Object[0]);
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.q.onReceiveValue(new Uri[]{data});
                    } else {
                        this.q.onReceiveValue(data);
                    }
                    this.q = null;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                HMLog.i(G, "onActivityResult Exception:" + e2.getMessage(), new Object[0]);
            }
        }
    }

    public boolean onBackPressed(boolean z) {
        this.k = null;
        if (this.B) {
            this.p.onHideCustomView();
            this.B = false;
            return false;
        }
        if (this.x.handleBackPressed(z)) {
            return false;
        }
        HMLog.i(G, "Can Go Back : " + this.l.canGoBack() + ", " + this.l.copyBackForwardList(), new Object[0]);
        JsBridgeWebView jsBridgeWebView = this.l;
        if (jsBridgeWebView == null || !jsBridgeWebView.canGoBack()) {
            return true;
        }
        this.l.goBack();
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.o = getContext();
        Bundle arguments = getArguments();
        if (arguments == null) {
            throw new IllegalArgumentException("--> WebFragment must has Bundle <--");
        }
        WebItem webItem = (WebItem) arguments.getParcelable(H);
        this.a = webItem;
        if (webItem == null) {
            throw new IllegalArgumentException("--> WebFragment must has webItem <--");
        }
        BraceletHandler braceletHandler = new BraceletHandler(this.o, webItem);
        this.x = braceletHandler;
        braceletHandler.setBraceletCallback(this.y);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return View.inflate(getContext(), R.layout.bridge_fragment_web, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        releaseWebViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        releaseWebViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        JsBridgeWebView jsBridgeWebView = this.l;
        if (jsBridgeWebView != null) {
            jsBridgeWebView.onResume();
            this.l.resumeTimers();
            if (this.A) {
                this.A = false;
                this.l.reload();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        initView(view);
        this.isViewCreated = true;
        R(getUserVisibleHint());
    }

    public synchronized void releaseWebViews() {
        JsBridgeWebView jsBridgeWebView = this.l;
        if (jsBridgeWebView != null) {
            try {
                if (jsBridgeWebView.getParent() != null) {
                    ((ViewGroup) this.l.getParent()).removeView(this.l);
                }
                this.l.destroy();
            } catch (IllegalArgumentException e2) {
                HMLog.i(G, e2.getMessage(), new Object[0]);
            }
            this.l = null;
        }
    }

    public void reload() {
        if (this.l != null) {
            HMLog.i(G, BraceletHandler.H5_PARAM_BACK_KEY_RELOAD, new Object[0]);
            this.l.reload();
        }
    }

    public void setBraceletCallback(BraceletCallback braceletCallback) {
        this.y = braceletCallback;
    }

    public void setIsRefresh(boolean z) {
        this.A = z;
    }

    public void setJsBridgeCallback(JsBridgeCallback jsBridgeCallback) {
        this.w = jsBridgeCallback;
    }

    public void setLoadingCallback(WebLoadCallback webLoadCallback) {
        this.b = webLoadCallback;
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        R(z);
        super.setUserVisibleHint(z);
    }

    public void setWebDownloadCallback(DownloadListener downloadListener) {
        this.s = downloadListener;
    }

    public void setWebLoadNewWindow(WebLoadNewWindow webLoadNewWindow) {
        this.z = webLoadNewWindow;
    }

    public boolean verifyUrlBeforeLoad(String str) {
        if (TextUtils.isEmpty(str) || this.l == null) {
            HMLog.e(G, "Url is empty!! or WebView Miss ", new Object[0]);
            return false;
        }
        if (str.startsWith("file://")) {
            WebSettings settings = this.l.getSettings();
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
        }
        if (this.a.isShouldPreVerify) {
            this.v.preVerifyJsApi();
        } else {
            this.v.registerAllNativeApi();
        }
        K(str);
        return true;
    }

    public static WebFragment newInstance(WebItem webItem, String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(H, webItem);
        bundle.putString(WEB_INTENT_ARG_RETURN_URL, str);
        WebFragment webFragment = new WebFragment();
        webFragment.setArguments(bundle);
        return webFragment;
    }

    public class e extends JsBridgeWebViewClient {
        public e(JsBridgeWebView jsBridgeWebView) {
            super(jsBridgeWebView);
        }

        @Override // com.huami.discovery.bridge.jsbridge.JsBridgeWebViewClient, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            HMLog.i(WebFragment.G, "onPageFinished : " + str, new Object[0]);
            if (WebFragment.this.b != null && !WebFragment.this.E) {
                WebFragment.this.b.onReceivedTitle(webView.getTitle());
                WebFragment.this.b.onPageFinish();
            }
            if (WebFragment.this.D || WebFragment.this.f.getVisibility() == 8) {
                return;
            }
            WebFragment.this.f.setVisibility(8);
        }

        @Override // com.huami.discovery.bridge.jsbridge.JsBridgeWebViewClient, android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            HMLog.i(WebFragment.G, "onPageStarted : " + str, new Object[0]);
            if (WebFragment.this.b != null) {
                WebFragment.this.b.onPageStart();
            }
            WebFragment.this.D = false;
            WebFragment.this.E = false;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            HMLog.i(WebFragment.G, "LoadError : " + str2 + ", error code : " + i + ", " + str, new Object[0]);
            WebFragment.this.D = true;
            if (WebFragment.this.b != null) {
                WebFragment.this.b.onError(i);
            }
            WebFragment.this.dealErrorTip(i);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            WebFragment.this.D = true;
            WebFragment.this.N(sslError);
        }

        @Override // com.huami.discovery.bridge.jsbridge.JsBridgeWebViewClient, android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            HMLog.i(WebFragment.G, "shouldOverrideUrlLoading : " + str, new Object[0]);
            if (WebFragment.this.a.shouldOverrideUrl && WebFragment.this.S(str) && !TextUtils.equals(str, WebFragment.this.a.url)) {
                if (WebFragment.this.z != null) {
                    WebFragment.this.z.loadInNewWindow(WebFragment.this.getContext(), str, true);
                }
                return true;
            }
            try {
                if (str.contains("weixin://")) {
                    WebFragment.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (WebFragment.this.x.isBraceletUrl(str)) {
                WebFragment.this.x.handlerBraceletAction(str);
            } else {
                if (JsBridgeUtil.isJsBridgeUrl(str)) {
                    return super.shouldOverrideUrlLoading(webView, str);
                }
                if (!BraceletHandler.checkIsNonHttp(str)) {
                    WebFragment.this.verifyUrlBeforeLoad(str);
                    return false;
                }
                WebFragment.this.Q(str);
            }
            return true;
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(23)
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            WebFragment webFragment = WebFragment.this;
            webFragment.E = !NetUtil.isNetworkConnected(webFragment.o);
            if (webResourceRequest.isForMainFrame() || WebFragment.this.E) {
                onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
            }
            HMLog.i(WebFragment.G, "error code : " + webResourceError.getErrorCode(), new Object[0]);
        }
    }
}
