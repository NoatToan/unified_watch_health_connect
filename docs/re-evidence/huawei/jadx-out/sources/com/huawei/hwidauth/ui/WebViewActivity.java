package com.huawei.hwidauth.ui;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.FileProvider;
import androidx.webkit.ProxyConfig;
import com.huawei.android.app.ActionBarEx;
import com.huawei.android.hms.hwid.R;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hms.common.utils.PresetUtil;
import com.huawei.hms.common.utils.UriCheckUtils;
import com.huawei.hwidauth.api.Result;
import com.huawei.hwidauth.api.ResultCallBack;
import com.huawei.operation.utils.Constants;
import com.huawei.secure.android.common.activity.SafeActivity;
import com.huawei.secure.android.common.intent.SafeBundle;
import com.huawei.secure.android.common.intent.SafeIntent;
import com.huawei.secure.android.common.util.EncodeUtil;
import com.huawei.secure.android.common.util.ScreenUtil;
import com.huawei.secure.android.common.webview.SafeWebView;
import com.tencent.mm.opensdk.modelmsg.SendAuth;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import defpackage.nmk;
import defpackage.nmn;
import defpackage.nms;
import defpackage.nmt;
import defpackage.nmw;
import defpackage.nnm;
import defpackage.nnv;
import defpackage.nnx;
import defpackage.nod;
import defpackage.noe;
import defpackage.nog;
import defpackage.noj;
import defpackage.nok;
import defpackage.nom;
import defpackage.noo;
import defpackage.nor;
import defpackage.nos;
import defpackage.not;
import defpackage.nou;
import defpackage.nox;
import defpackage.npa;
import defpackage.npb;
import defpackage.npe;
import defpackage.npi;
import defpackage.npj;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class WebViewActivity extends SafeActivity implements com.huawei.hwidauth.oberver.a, f.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final HashSet<String> f17594c = new HashSet<String>() { // from class: com.huawei.hwidauth.ui.WebViewActivity.1
        {
            add("com.android.fileexplorer");
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ProgressBar f17596b;
    private RelativeLayout d;
    private SafeWebView e;
    private ActionBar g;
    private nog j;
    private Uri k;
    private not l;
    private ValueCallback<?> n;
    private PermissionRequest p;
    private AlertDialog q;
    private AlertDialog r;
    private AlertDialog s;
    private int t;
    private String u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TextView f17595a = null;
    private String f = "0";
    private String i = "";
    private List<String> h = new ArrayList();
    private boolean m = false;
    private boolean o = false;
    private Handler w = new Handler(Looper.getMainLooper()) { // from class: com.huawei.hwidauth.ui.WebViewActivity.15
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            if (message.what == 1001) {
                WebViewActivity.this.j.d(WebViewActivity.this.f);
            }
            super.handleMessage(message);
        }
    };

    @Override // com.huawei.secure.android.common.activity.SafeActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        nox.b("WebViewActivity", "enter onCreate", true);
        Intent intent = getIntent();
        if (intent == null) {
            nox.a("WebViewActivity", "intent is null.", true);
            b();
            return;
        }
        SafeIntent safeIntent = new SafeIntent(intent);
        if (safeIntent.hasIntentBomb()) {
            nox.a("WebViewActivity", "has intent bomb.", true);
            b();
            return;
        }
        nom.e((Activity) this);
        setContentView(R.layout.hwid_auth_webview);
        nou.d(this);
        nom.b((Activity) this);
        ScreenUtil.disableScreenshots(this);
        this.e = (SafeWebView) findViewById(R.id.hwid_auth_webView);
        this.l = new not();
        nog nogVar = new nog(this, this);
        this.j = nogVar;
        nogVar.init(safeIntent);
        s();
        o();
        this.j.e();
        noo.c(this).e();
        nox.b("WebViewActivity", "out onCreate", true);
    }

    private void o() {
        if (nos.e()) {
            Window window = getWindow();
            View decorView = window.getDecorView();
            if (window == null || decorView == null) {
                nox.b("WebViewActivity", "is below EMUI10.0.", true);
                return;
            }
            nox.b("WebViewActivity", "visibility: 1280", true);
            boolean zC = npi.c(this);
            nox.b("WebViewActivity", "isNightMode: " + zC, true);
            if (!zC) {
                decorView.setSystemUiVisibility(9472);
            } else {
                decorView.setSystemUiVisibility(1280);
            }
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
            l();
        }
    }

    private void l() {
        View childAt = ((ViewGroup) getWindow().findViewById(android.R.id.content)).getChildAt(0);
        if (childAt != null) {
            childAt.setFitsSystemWindows(true);
        }
    }

    private void s() {
        ProgressBar progressBar;
        nox.b("WebViewActivity", "initViews", true);
        if (!nom.a("com.huawei.android.app.ActionBarEx")) {
            nox.b("WebViewActivity", "initViews else", true);
            p();
            ae();
            af();
        } else {
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.hwid_auth_top_view);
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            ActionBar actionBar = getActionBar();
            this.g = actionBar;
            if (actionBar != null) {
                actionBar.setDisplayHomeAsUpEnabled(false);
                j(" ");
                ActionBarEx.setStartIcon(this.g, true, (Drawable) null, new View.OnClickListener() { // from class: com.huawei.hwidauth.ui.WebViewActivity.11
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        WebViewActivity.this.j.d(6, "User cancel", "");
                    }
                });
            }
        }
        this.f17596b = (ProgressBar) findViewById(R.id.hwid_auth_Progressbar);
        if (nom.d() && (progressBar = this.f17596b) != null) {
            progressBar.setProgressDrawable(getDrawable(R.drawable.hwid_auth_progress_horizontal_emui5));
        }
        this.d = (RelativeLayout) findViewById(R.id.hwid_auth_loading);
        nox.b("WebViewActivity", "create webview", true);
        this.e.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        q();
    }

    private void p() {
        if (Build.VERSION.SDK_INT > 34) {
            nox.b("WebViewActivity", "3rd setStatusBarColor skip by gt34", true);
            return;
        }
        nox.b("WebViewActivity", "3rd setStatusBarColor ==", true);
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(getResources().getColor(R.color.hwid_auth_black_100_percent));
    }

    private void q() {
        nox.b("WebViewActivity", "init WebView.", true);
        if (this.e == null) {
            nox.a("WebViewActivity", "WebView is null.", true);
            return;
        }
        ArrayList<String> arrayListD = nnm.c().d(this);
        this.e.setWhitelistNotMatchSubDomain((String[]) arrayListD.toArray(new String[arrayListD.size()]));
        b(arrayListD);
        t();
        ah();
        r();
    }

    private void r() {
        nox.b("WebViewActivity", "webViewPerformanceSetting ==", true);
        SafeWebView safeWebView = this.e;
        if (safeWebView == null) {
            nox.a("WebViewActivity", "mWebView is null.", true);
        } else {
            safeWebView.setLayerType(2, null);
        }
    }

    private void t() {
        nox.b("WebViewActivity", "webViewSetting start.", true);
        this.e.setWebViewClient(new nok(this.j, this, this.e, this.l, this));
        this.e.setWebChromeClient(new AuthWebChromeClient());
        this.e.addJavascriptInterface(new a(), "webLoader");
        this.e.addJavascriptInterface(new e(), "hwop");
        if (npi.c(this)) {
            this.e.setBackgroundColor(getResources().getColor(R.color.hwid_auth_black_100_percent));
        } else {
            this.e.setBackgroundColor(0);
        }
    }

    private void b(ArrayList<String> arrayList) {
        URL url;
        String host;
        nox.b("WebViewActivity", "checkAcceptThirdPartyCookies ==", true);
        if ("from_other_app_signin".equalsIgnoreCase(this.j.d())) {
            try {
                url = new URL(this.j.b().replaceAll("[\\\\#]", "/"));
            } catch (MalformedURLException unused) {
                nox.b("WebViewActivity", "MalformedURLException", true);
                url = null;
            }
            if (url == null) {
                host = "";
            } else {
                host = url.getHost();
            }
            nox.b("WebViewActivity", "checkAcceptThirdPartyCookies host== " + host, false);
            if (arrayList.contains(host)) {
                nox.b("WebViewActivity", "checkAcceptThirdPartyCookies contain", true);
                CookieManager.getInstance().setAcceptThirdPartyCookies(this.e, true);
            } else {
                nox.b("WebViewActivity", "checkAcceptThirdPartyCookies not contain", true);
                this.j.d(6, "checkAcceptThirdPartyCookies not contain", "");
            }
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        nox.b("WebViewActivity", "onRequestPermissionsResult requestCode = " + i, true);
        if (i == 1006) {
            if (this.j.b(iArr)) {
                k();
                return;
            } else {
                i(true);
                e((Uri) null);
                return;
            }
        }
        if (i == 1007) {
            if (this.j.b(iArr)) {
                n();
                return;
            } else {
                i(false);
                e((Uri) null);
                return;
            }
        }
        if (i == 1008) {
            if (this.j.b(iArr)) {
                e(true);
            } else {
                e(false);
            }
        }
    }

    private void e(final boolean z) {
        runOnUiThread(new Runnable() { // from class: com.huawei.hwidauth.ui.WebViewActivity.14
            @Override // java.lang.Runnable
            public void run() {
                if (z) {
                    nox.b("WebViewActivity", "onPermissionRequest: granted", true);
                    WebViewActivity.this.p.grant(WebViewActivity.this.p.getResources());
                } else {
                    nox.b("WebViewActivity", "onPermissionRequest: deny", true);
                    WebViewActivity.this.p.deny();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        nox.b("WebViewActivity", "enter getDevAuthCode", true);
        this.w.sendEmptyMessage(1001);
    }

    private void u() {
        SafeWebView safeWebView = this.e;
        if (safeWebView == null) {
            nox.a("WebViewActivity", "mWebView is null.", true);
            return;
        }
        WebSettings settings = safeWebView.getSettings();
        settings.setUserAgentString(settings.getUserAgentString() + e((Context) this));
        StringBuilder sb = new StringBuilder("getUserAgentString:");
        sb.append(settings.getUserAgentString());
        nox.b("WebViewActivity", sb.toString(), false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:57:0x00bb  */
    public void e() {
        nox.b("WebViewActivity", "loadWebViewUrl start.", true);
        u();
        String strD = this.j.d();
        strD.hashCode();
        switch (strD) {
            case "scan_code_login":
                nox.a("WebViewActivity", "scan_code_login", true);
                ac();
                break;
            case "from_open_realNameInfo":
            case "from_open_childInfo":
            case "from_qr_authorize":
                y();
                break;
            case "from_open_auth_app_list":
                nox.a("WebViewActivity", "from_open_auth_app_list", true);
                ad();
                break;
            case "from_open_center_mng_new":
                nox.a("WebViewActivity", "from_open_center_mng_new", true);
                g(com.huawei.hwidauth.h.a.a().c());
                break;
            case "from_open_center_mng":
                nox.a("WebViewActivity", "from_open_center_mng", true);
                g(com.huawei.hwidauth.h.a.a().c());
                break;
            case "verify_password":
                nox.a("WebViewActivity", "verify_password", true);
                z();
                break;
            case "verify_password_new":
                nox.a("WebViewActivity", "verify_password_new", true);
                z();
                break;
            case "from_signin":
                nox.a("WebViewActivity", "from_signin", true);
                ai();
                break;
            case "from_v3_signin":
                nox.a("WebViewActivity", "from_v3_signin", true);
                ai();
                break;
            case "open_personal_info":
                nox.a("WebViewActivity", "open_personal_info", true);
                w();
                break;
            case "from_other_app_signin":
                nox.a("WebViewActivity", "from_other_app_signin", true);
                aa();
                break;
            default:
                nox.a("WebViewActivity", "from error", true);
                this.j.d(6, "User cancel", "");
                finish();
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    private void y() {
        byte b2;
        String strD = this.j.d();
        strD.hashCode();
        int iHashCode = strD.hashCode();
        if (iHashCode != -1899443177) {
            if (iHashCode != -982451862) {
                if (iHashCode == -313839168 && strD.equals("from_qr_authorize")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (strD.equals("from_open_childInfo")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (strD.equals("from_open_realNameInfo")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            nox.a("WebViewActivity", "open_realNameInfo", true);
            v();
        } else if (b2 == 1) {
            nox.a("WebViewActivity", "open_childInfo", true);
            ab();
        } else if (b2 != 2) {
            nox.b("WebViewActivity", "dealOtherOper not match", true);
        } else {
            nox.a("WebViewActivity", "qr_authorize", true);
            x();
        }
    }

    private void w() {
        nox.b("WebViewActivity", "handleOpenPersonalUrl start.", true);
        String strJ = com.huawei.hwidauth.h.a.a().j();
        nox.b("WebViewActivity", "atRemoteLoginUrl：" + strJ, false);
        a(this.e, strJ, this.j.b(this));
    }

    private void v() {
        nox.b("WebViewActivity", "handleOpenRealNameInfoUrl start.", true);
        String strJ = com.huawei.hwidauth.h.a.a().j();
        nox.b("WebViewActivity", "atRemoteLoginUrl：" + strJ, false);
        a(this.e, strJ, this.j.d(this));
    }

    private void x() {
        nox.b("WebViewActivity", "handleQrAurhorizeUrl start.", true);
        String strA = this.j.a(this);
        nox.b("WebViewActivity", "qrAurhorizeUrl：" + strA, false);
        e(this.e, strA);
    }

    private void ab() {
        nox.b("WebViewActivity", "handleOpenChildInfoUrl start.", true);
        String strJ = com.huawei.hwidauth.h.a.a().j();
        nox.b("WebViewActivity", "atRemoteLoginUrl：" + strJ, false);
        a(this.e, strJ, this.j.e(this));
    }

    private void a(SafeWebView safeWebView, String str, String str2) {
        if (safeWebView != null && d(str) && safeWebView.isWhiteListUrl(str)) {
            safeWebView.loadUrl(str + str2);
            return;
        }
        this.j.d(2015, "webview or url is invalid.", "");
    }

    private void c(SafeWebView safeWebView, String str, Map map) {
        if (safeWebView != null && d(str) && safeWebView.isWhiteListUrl(str)) {
            safeWebView.loadUrl(str, map);
        } else {
            this.j.d(2015, "webview or url is invalid.", "");
        }
    }

    private void e(SafeWebView safeWebView, String str) {
        if (safeWebView != null && d(str) && safeWebView.isWhiteListUrl(str)) {
            safeWebView.loadUrl(str);
        } else {
            this.j.d(2015, "webview or url is invalid.", "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(SafeWebView safeWebView, String str, byte[] bArr) {
        nox.b("WebViewActivity", "webViewPostUrl: " + str, false);
        if (safeWebView != null && d(str) && safeWebView.isWhiteListUrl(str)) {
            safeWebView.postUrl(str, bArr);
        } else {
            this.j.d(2015, "webview or url is invalid.", "");
        }
    }

    private boolean d(String str) {
        String strC = npj.c(str);
        if (!TextUtils.isEmpty(str) && i(strC)) {
            return true;
        }
        nox.b("WebViewActivity", "is not a right url", true);
        return false;
    }

    private boolean i(String str) {
        return ProxyConfig.MATCH_HTTPS.equalsIgnoreCase(str) || "http".equalsIgnoreCase(str) || com.huawei.hwcloudjs.g.a.f17122c.equalsIgnoreCase(str) || "mqq".equalsIgnoreCase(str) || "weixin".equalsIgnoreCase(str);
    }

    private void z() {
        nox.b("WebViewActivity", "handleVerifyPasswordUrl start.", true);
        String str = com.huawei.hwidauth.h.a.a().i() + this.j.c(nom.e((Context) this));
        this.i = nom.p();
        String str2 = str + "&clientNonce=" + this.i;
        nox.b("WebViewActivity", "verifyPasswordUrl：" + str2, false);
        c(this.e, str2, this.j.c());
    }

    private void ac() {
        nox.b("WebViewActivity", "handleAuthListUrl start.", true);
        String str = com.huawei.hwidauth.h.a.a().h() + this.j.e(nom.e((Context) this));
        nox.b("WebViewActivity", "qrLoginUrl：" + str, false);
        c(this.e, str, this.j.h(str));
    }

    private void ad() {
        nox.b("WebViewActivity", "handleAuthListUrl start.", true);
        String strE = com.huawei.hwidauth.h.a.a().e();
        nox.b("WebViewActivity", "authAppListUrl：" + strE, false);
        e(this.e, strE, nom.d(this.j.b(nom.e((Context) this))));
    }

    private void g(String str) {
        nox.b("WebViewActivity", "handleCenterUrl start.", true);
        String strJ = com.huawei.hwidauth.h.a.a().j();
        nox.b("WebViewActivity", "centerUrl：" + strJ, false);
        a(this.e, strJ, this.j.b(nom.e((Context) this), str));
    }

    private void aa() {
        nox.b("WebViewActivity", "handleOtherAppSignInUrl start.", true);
        nog nogVar = this.j;
        String strO = nogVar.o(nogVar.b());
        nox.b("WebViewActivity", "handleOtherAppSignInUrl：" + strO, false);
        e(this.e, strO);
    }

    private void ai() {
        nox.b("WebViewActivity", "handleSignInUrl start.", true);
        String strF = this.j.f(nom.e((Context) this));
        nox.b("WebViewActivity", "handleSignInUrl sigInUrl：" + strF, false);
        HashMap<String, String> mapI = this.j.i(strF);
        nox.b("WebViewActivity", "signInHeaders", true);
        nox.b("WebViewActivity", "signInHeaders：" + mapI, false);
        c(this.e, strF, mapI);
    }

    private void ah() {
        nox.b("WebViewActivity", "setWebViewSafeSettings ==", true);
        WebSettings settings = this.e.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setSupportZoom(false);
        settings.setSavePassword(false);
        settings.setCacheMode(2);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setMixedContentMode(1);
        settings.setGeolocationEnabled(false);
        settings.setAllowContentAccess(false);
        settings.setDomStorageEnabled(true);
        this.e.removeJavascriptInterface("searchBoxJavaBridge_");
        this.e.removeJavascriptInterface("accessibility");
        this.e.removeJavascriptInterface("accessibilityTraversal");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(String str) {
        if (TextUtils.isEmpty(str)) {
            str = " ";
        }
        TextView textView = this.f17595a;
        if (textView != null) {
            textView.setText(str);
        } else {
            setTitle(str);
        }
    }

    private void af() {
        this.f17595a = (TextView) findViewById(R.id.hwid_auth_title_text);
        ImageView imageView = (ImageView) findViewById(R.id.hwid_auth_close_imageview);
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.hwidauth.ui.WebViewActivity.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    WebViewActivity.this.j.d(6, "User cancel", "");
                }
            });
        }
    }

    private void ae() {
        try {
            ActionBar actionBar = getActionBar();
            if (actionBar != null) {
                actionBar.hide();
            }
        } catch (Exception unused) {
            nox.a("WebViewActivity", "hideActionbar Exception", true);
        }
    }

    @Override // com.huawei.hwidauth.ui.f.b
    public void a(final String str) {
        nox.b("WebViewActivity", "callbackForJs ==", true);
        runOnUiThread(new Runnable() { // from class: com.huawei.hwidauth.ui.WebViewActivity.3
            @Override // java.lang.Runnable
            public void run() {
                if (WebViewActivity.this.e != null) {
                    WebViewActivity.this.e.loadUrl(WebViewActivity.this.f(str));
                }
            }
        });
    }

    @Override // com.huawei.hwidauth.ui.f.b
    public void a(boolean z) {
        nox.b("WebViewActivity", "setLoading loading =" + z, true);
        RelativeLayout relativeLayout = this.d;
        if (relativeLayout != null && z) {
            relativeLayout.setVisibility(0);
            return;
        }
        if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
            this.d.setVisibility(8);
        }
        e();
    }

    @Override // com.huawei.hwidauth.ui.f.b
    public void b(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        runOnUiThread(new Runnable() { // from class: com.huawei.hwidauth.ui.WebViewActivity.2
            @Override // java.lang.Runnable
            public void run() {
                if (WebViewActivity.this.e != null) {
                    WebViewActivity.this.e.loadUrl(str);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String f(String str) {
        return "javascript:getDevAuthCodeCallback('" + EncodeUtil.encodeForJavaScript(str) + Constants.RIGHT_BRACKET;
    }

    @Override // com.huawei.hwidauth.ui.f.b
    public void b() {
        nox.b("WebViewActivity", "exitApp finish", true);
        finish();
    }

    @Override // com.huawei.hwidauth.ui.f.b
    public void a(int i, Intent intent) {
        nox.b("WebViewActivity", "exit resultCode", true);
        setResult(i, intent);
        finish();
    }

    @Override // com.huawei.hwidauth.ui.f.b
    public void b(int i, Intent intent) {
        nox.b("WebViewActivity", "exitApp finish", true);
        if (TextUtils.isEmpty(this.j.f())) {
            nox.b("WebViewActivity", "exitApp finish", true);
            finish();
        } else {
            setResult(i, intent);
            finish();
        }
    }

    @Override // com.huawei.hwidauth.oberver.a
    public void a(Intent intent) {
        nox.b("WebViewActivity", "WeixinAuthHandler receive:", true);
        if (-1 == intent.getIntExtra("resultCode", 0)) {
            nox.b("WebViewActivity", "get weChat code success", true);
            final String stringExtra = intent.getStringExtra("code");
            final String stringExtra2 = intent.getStringExtra("state");
            final String strG = com.huawei.hwidauth.h.a.a().g();
            nox.b("WebViewActivity", "weChatCodeAuthUrl: " + strG, false);
            new Handler(getMainLooper()).post(new Runnable() { // from class: com.huawei.hwidauth.ui.WebViewActivity.4
                @Override // java.lang.Runnable
                public void run() {
                    WebViewActivity webViewActivity = WebViewActivity.this;
                    webViewActivity.e(webViewActivity.e, strG, nom.d(WebViewActivity.this.j.c(stringExtra, stringExtra2)));
                }
            });
        } else {
            nox.a("WebViewActivity", "not allowed to login with weChat", true);
        }
        noe.a().d();
    }

    /* JADX INFO: loaded from: classes3.dex */
    final class a {
        a() {
        }

        @JavascriptInterface
        public void getDevAuthCode(final String str) {
            nox.b("WebViewActivity", "getDevAuthCode " + str, false);
            WebViewActivity.this.f = "0";
            if (noo.c(WebViewActivity.this).d()) {
                c(str);
            } else if (noo.c(WebViewActivity.this).a()) {
                noo.c(WebViewActivity.this).a(new com.huawei.hwidauth.g.f.a() { // from class: com.huawei.hwidauth.ui.WebViewActivity.a.1
                    @Override // com.huawei.hwidauth.g.f.a
                    public void a(SafeBundle safeBundle) {
                        a.this.c(str);
                    }

                    @Override // com.huawei.hwidauth.g.f.a
                    public void a(int i, String str2) {
                        nox.b("WebViewActivity", "getDevAuthCode get allowlist failed from file.", true);
                        WebViewActivity.this.a(WebViewActivity.this.j.d("1", "9999"));
                    }
                });
            } else {
                noo.c(WebViewActivity.this).b(new com.huawei.hwidauth.g.f.a() { // from class: com.huawei.hwidauth.ui.WebViewActivity.a.2
                    @Override // com.huawei.hwidauth.g.f.a
                    public void a(SafeBundle safeBundle) {
                        a.this.c(str);
                    }

                    @Override // com.huawei.hwidauth.g.f.a
                    public void a(int i, String str2) {
                        nox.b("WebViewActivity", "getDevAuthCode get allowlist failed.", true);
                        WebViewActivity.this.a(WebViewActivity.this.j.d("1", "9999"));
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(String str) {
            if (noo.c(WebViewActivity.this).c("getDevAuthCode", WebViewActivity.this.u, WebViewActivity.this.e)) {
                WebViewActivity.this.e(str);
                return;
            }
            nox.b("WebViewActivity", "getDevAuthCode allowlist match result: false", true);
            noj.b(WebViewActivity.this, 907115013, 2016, "interface getDevAuthCode check allowlist failed, url is " + WebViewActivity.this.u, WebViewActivity.this.j.h(), "accountPickerH5.getDevAuthCode", "api_ret");
            WebViewActivity webViewActivity = WebViewActivity.this;
            webViewActivity.a(webViewActivity.j.d("1", "9999"));
        }

        @JavascriptInterface
        public void getDevAuthCode(final String str, final String str2) {
            nox.b("WebViewActivity", "getDevAuthCode " + str + "--param==" + str2, false);
            if (noo.c(WebViewActivity.this).d()) {
                c(str, str2);
            } else if (noo.c(WebViewActivity.this).a()) {
                noo.c(WebViewActivity.this).a(new com.huawei.hwidauth.g.f.a() { // from class: com.huawei.hwidauth.ui.WebViewActivity.a.3
                    @Override // com.huawei.hwidauth.g.f.a
                    public void a(SafeBundle safeBundle) {
                        a.this.c(str, str2);
                    }

                    @Override // com.huawei.hwidauth.g.f.a
                    public void a(int i, String str3) {
                        nox.b("WebViewActivity", "getDevAuthCode get allowlist failed from file.", true);
                        WebViewActivity.this.a(WebViewActivity.this.j.d("1", "9999"));
                    }
                });
            } else {
                noo.c(WebViewActivity.this).b(new com.huawei.hwidauth.g.f.a() { // from class: com.huawei.hwidauth.ui.WebViewActivity.a.9
                    @Override // com.huawei.hwidauth.g.f.a
                    public void a(SafeBundle safeBundle) {
                        a.this.c(str, str2);
                    }

                    @Override // com.huawei.hwidauth.g.f.a
                    public void a(int i, String str3) {
                        nox.b("WebViewActivity", "getDevAuthCode with two params get allowlist failed.", true);
                        WebViewActivity.this.a(WebViewActivity.this.j.d("1", "9999"));
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(String str, String str2) {
            if (noo.c(WebViewActivity.this).c("getDevAuthCode", WebViewActivity.this.u, WebViewActivity.this.e)) {
                try {
                    WebViewActivity.this.f = new JSONObject(str2).getString("oprType");
                } catch (JSONException unused) {
                    WebViewActivity.this.f = "-1";
                    nox.a("WebViewActivity", "JSONException", true);
                }
                WebViewActivity.this.e(str);
                return;
            }
            nox.b("WebViewActivity", "getDevAuthCode with two params allowlist match result: false", true);
            WebViewActivity webViewActivity = WebViewActivity.this;
            webViewActivity.a(webViewActivity.j.d("1", "9999"));
            noj.b(WebViewActivity.this, 907115013, 2016, "interface getDevAuthCode check allowlist failed, url is " + WebViewActivity.this.u, WebViewActivity.this.j.h(), "accountPickerH5.getDevAuthCode", "api_ret");
        }

        @JavascriptInterface
        public void intoApp(final String str) {
            nox.b("WebViewActivity", "enter intoApp", true);
            nox.b("WebViewActivity", "enter intoApp returnMsg = " + str, false);
            new Handler(WebViewActivity.this.getMainLooper()).post(new Runnable() { // from class: com.huawei.hwidauth.ui.WebViewActivity.a.10
                @Override // java.lang.Runnable
                public void run() {
                    nox.b("WebViewActivity", "intoApp finish WebViewActivity", true);
                    if (TextUtils.isEmpty(str)) {
                        WebViewActivity.this.j.d(7, "", "");
                        nox.a("WebViewActivity", "enter intoApp returnMsg is null ", true);
                        WebViewActivity.this.finish();
                        return;
                    }
                    if ("scan_code_login".equalsIgnoreCase(WebViewActivity.this.j.d()) && !str.equalsIgnoreCase("OK")) {
                        nms nmsVar = new nms("atExpired".equalsIgnoreCase(str) ? 2008 : 404, str);
                        nmn nmnVar = new nmn(nmsVar);
                        nmsVar.d(false);
                        a.this.a(nom.j(), nmnVar, str, 907115008, "accountPickerH5.qrCodeAuthLogin", 404);
                        return;
                    }
                    if (!str.equalsIgnoreCase("OK")) {
                        if (!"open_personal_info".equalsIgnoreCase(WebViewActivity.this.j.d()) || !str.equalsIgnoreCase("atExpired")) {
                            if (("verify_password".equalsIgnoreCase(WebViewActivity.this.j.d()) || "verify_password_new".equalsIgnoreCase(WebViewActivity.this.j.d())) && str.equalsIgnoreCase("atExpired")) {
                                String strM = WebViewActivity.this.m();
                                nms nmsVar2 = new nms(2008, str);
                                nmk nmkVar = new nmk("", nmsVar2);
                                nmsVar2.d(false);
                                a.this.a(nom.i(), nmkVar, str, 907115003, strM, 404);
                                return;
                            }
                            if (!WebViewActivity.this.j.j()) {
                                if (!WebViewActivity.this.j.g()) {
                                    if ((!"from_open_realNameInfo".equalsIgnoreCase(WebViewActivity.this.j.d()) && !"from_open_childInfo".equalsIgnoreCase(WebViewActivity.this.j.d())) || !str.equalsIgnoreCase("atExpired")) {
                                        WebViewActivity.this.j.d(7, str, "");
                                        return;
                                    }
                                    nms nmsVar3 = new nms(2008, str);
                                    nmw nmwVar = new nmw(nmsVar3);
                                    nmsVar3.d(false);
                                    if (!"from_open_childInfo".equalsIgnoreCase(WebViewActivity.this.j.d())) {
                                        a.this.a(nom.n(), nmwVar, str, 907115010, "accountPickerH5.openRealNameInfo", 404);
                                        return;
                                    }
                                    nox.b("WebViewActivity", "enter intoApp = OPEN_CHILD_INFO ", true);
                                    nox.b("WebViewActivity", "enter intoApp = OPEN_CHILD_INFO " + str, false);
                                    a.this.a(nom.m(), nmwVar, str, 907115012, "accountPickerH5.openChildAccountDetailInfo", 2008);
                                    return;
                                }
                                Intent intent = new Intent();
                                intent.putExtra("retValue", str);
                                WebViewActivity.this.setResult(8, intent);
                                noj.b(WebViewActivity.this, 907115001, 200, str, WebViewActivity.this.j.h(), "accountPickerH5.signIn_pageFromOtherApp", "api_ret");
                                WebViewActivity.this.b();
                                return;
                            }
                            Intent intent2 = new Intent();
                            intent2.putExtra("retValue", str);
                            WebViewActivity.this.setResult(8, intent2);
                            noj.b(WebViewActivity.this, 907115001, 200, str, WebViewActivity.this.j.h(), "accountPickerH5.signIn_v3", "api_ret");
                            WebViewActivity.this.b();
                            return;
                        }
                        nms nmsVar4 = new nms(2008, str);
                        nmw nmwVar2 = new nmw(nmsVar4);
                        nmsVar4.d(false);
                        a.this.a(nom.f(), nmwVar2, str, 907115006, "accountPickerH5.openPersonalInfo", 404);
                        return;
                    }
                    a.this.e(str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(String str) {
            nox.b("WebViewActivity", "handleSuccessMsg start.", true);
            if (WebViewActivity.this.c()) {
                nms nmsVar = new nms(501, str);
                nmt nmtVar = new nmt(nmsVar);
                nmsVar.d(true);
                nox.b("WebViewActivity", "handle succ: 501", true);
                a(nom.l(), nmtVar, str, 907115004, "accountPickerH5.deleteAccount", 200);
                return;
            }
            if (!WebViewActivity.this.d()) {
                if (!"from_open_realNameInfo".equalsIgnoreCase(WebViewActivity.this.j.d())) {
                    if (!"from_open_childInfo".equalsIgnoreCase(WebViewActivity.this.j.d())) {
                        WebViewActivity.this.j.d(7, str, "");
                        nox.b("WebViewActivity", "handle succ: 7", true);
                        nox.b("WebViewActivity", "enter intoApp returnMsg = " + str, false);
                        WebViewActivity.this.finish();
                        return;
                    }
                    nms nmsVar2 = new nms(504, str);
                    nmw nmwVar = new nmw(nmsVar2);
                    nmsVar2.d(true);
                    nox.b("WebViewActivity", "handle succ: 504", true);
                    a(nom.n(), nmwVar, str, 907115012, "accountPickerH5.openChildAccountDetailInfo", 200);
                    return;
                }
                nms nmsVar3 = new nms(503, str);
                nmw nmwVar2 = new nmw(nmsVar3);
                nmsVar3.d(true);
                nox.b("WebViewActivity", "handle succ: 503", true);
                a(nom.n(), nmwVar2, str, 907115010, "accountPickerH5.openRealNameInfo", 200);
                return;
            }
            nms nmsVar4 = new nms(TypedValues.PositionType.TYPE_DRAWPATH, str);
            nmt nmtVar2 = new nmt(nmsVar4);
            nmsVar4.d(true);
            nox.b("WebViewActivity", "handle succ: 502", true);
            a(nom.l(), nmtVar2, str, 907115004, "accountPickerH5.appealSelf", 200);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(ResultCallBack resultCallBack, Result result, String str, int i, String str2, int i2) {
            if (resultCallBack != null && result != null) {
                resultCallBack.onResult(result);
                WebViewActivity webViewActivity = WebViewActivity.this;
                noj.b(webViewActivity, i, i2, str, webViewActivity.j.h(), str2, "api_ret");
                WebViewActivity.this.finish();
                return;
            }
            WebViewActivity webViewActivity2 = WebViewActivity.this;
            noj.b(webViewActivity2, i, 404, "resultCallBack is null", webViewActivity2.j.h(), str2, "api_ret");
        }

        @JavascriptInterface
        public void callWeChatAuthorize(String str, String str2, String str3) {
            nom.c(str);
            nox.b("WebViewActivity", "wxAuth 3param appID: " + str, false);
            WebViewActivity.this.d(str, str2, str3);
        }

        @JavascriptInterface
        public void callWeChatAuthorize(String str, String str2, String str3, String str4) {
            nom.c(str);
            nox.b("WebViewActivity", "wxAuth 4param appID: " + str, false);
            if (!TextUtils.isEmpty(str4)) {
                nox.b("WebViewActivity", "wxAuth 4param query: " + str4, false);
                nom.h(str4);
            }
            WebViewActivity.this.d(str, str2, str3);
        }

        @JavascriptInterface
        public void setForbiddenGoBackUrl(final String str) {
            nox.b("WebViewActivity", "setForbiddenGoBackUrl:" + str, false);
            if (noo.c(WebViewActivity.this).d()) {
                a(str);
            } else if (noo.c(WebViewActivity.this).a()) {
                noo.c(WebViewActivity.this).a(new com.huawei.hwidauth.g.f.a() { // from class: com.huawei.hwidauth.ui.WebViewActivity.a.8
                    @Override // com.huawei.hwidauth.g.f.a
                    public void a(SafeBundle safeBundle) {
                        a.this.a(str);
                    }

                    @Override // com.huawei.hwidauth.g.f.a
                    public void a(int i, String str2) {
                        nox.b("WebViewActivity", "setForbiddenGoBackUrl get allowlist failed from file.", true);
                    }
                });
            } else {
                noo.c(WebViewActivity.this).b(new com.huawei.hwidauth.g.f.a() { // from class: com.huawei.hwidauth.ui.WebViewActivity.a.6
                    @Override // com.huawei.hwidauth.g.f.a
                    public void a(SafeBundle safeBundle) {
                        a.this.a(str);
                    }

                    @Override // com.huawei.hwidauth.g.f.a
                    public void a(int i, String str2) {
                        nox.b("WebViewActivity", "setForbiddenGoBackUrl get allowlist failed.", true);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str) {
            if (noo.c(WebViewActivity.this).c("setForbiddenGoBackUrl", WebViewActivity.this.u, WebViewActivity.this.e)) {
                if (TextUtils.isEmpty(str) || WebViewActivity.this.h.contains(str)) {
                    return;
                }
                WebViewActivity.this.h.add(str);
                return;
            }
            nox.b("WebViewActivity", "setForbiddenGoBackUrl allowlist match result: false", true);
        }

        @JavascriptInterface
        public void verifyResult(final String str, final String str2) {
            nox.b("WebViewActivity", "checkUserPasswordResult start", true);
            if (noo.c(WebViewActivity.this).d()) {
                b(str, str2);
            } else if (noo.c(WebViewActivity.this).a()) {
                noo.c(WebViewActivity.this).a(new com.huawei.hwidauth.g.f.a() { // from class: com.huawei.hwidauth.ui.WebViewActivity.a.7
                    @Override // com.huawei.hwidauth.g.f.a
                    public void a(SafeBundle safeBundle) {
                        a.this.b(str, str2);
                    }

                    @Override // com.huawei.hwidauth.g.f.a
                    public void a(int i, String str3) {
                        WebViewActivity.this.j.d(7, "match allowlist failed", "");
                        WebViewActivity.this.finish();
                    }
                });
            } else {
                noo.c(WebViewActivity.this).b(new com.huawei.hwidauth.g.f.a() { // from class: com.huawei.hwidauth.ui.WebViewActivity.a.5
                    @Override // com.huawei.hwidauth.g.f.a
                    public void a(SafeBundle safeBundle) {
                        a.this.b(str, str2);
                    }

                    @Override // com.huawei.hwidauth.g.f.a
                    public void a(int i, String str3) {
                        nox.b("WebViewActivity", "verifyResult get allowlist failed.", true);
                        WebViewActivity.this.j.d(7, "match allowlist failed", "");
                        WebViewActivity.this.finish();
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str, final String str2) {
            if (noo.c(WebViewActivity.this).c("verifyResult", WebViewActivity.this.u, WebViewActivity.this.e)) {
                WebViewActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.hwidauth.ui.WebViewActivity.a.4
                    @Override // java.lang.Runnable
                    public void run() {
                        nox.b("WebViewActivity", "checkUserPasswordResult finish WebViewActivity", true);
                        String strM = WebViewActivity.this.m();
                        if ((!"verify_password".equalsIgnoreCase(WebViewActivity.this.j.d()) && !"verify_password_new".equalsIgnoreCase(WebViewActivity.this.j.d())) || TextUtils.isEmpty(str2)) {
                            WebViewActivity.this.j.d(7, str2, "");
                            noj.b(WebViewActivity.this, 907115003, 7, "token is empty or mPresenter.getFrom() is not verify_password", WebViewActivity.this.j.h(), strM, "api_ret");
                            WebViewActivity.this.finish();
                            return;
                        }
                        ResultCallBack resultCallBackI = nom.i();
                        nms nmsVar = new nms(200, "check password success.");
                        nmsVar.d(true);
                        nmk nmkVar = new nmk(str2, nmsVar);
                        if (resultCallBackI != null) {
                            resultCallBackI.onResult(nmkVar);
                            noj.b(WebViewActivity.this, 907115003, 200, "check password Success", WebViewActivity.this.j.h(), strM, "api_ret");
                            WebViewActivity.this.finish();
                        }
                    }
                });
                return;
            }
            nox.b("WebViewActivity", "verifyResult allowlist match result: false", true);
            noj.b(WebViewActivity.this, 907115013, 2016, "interface verifyResult check allowlist failed, url is " + WebViewActivity.this.u, WebViewActivity.this.j.h(), WebViewActivity.this.m(), "api_ret");
            WebViewActivity.this.j.d(7, "match allowlist failed", "");
            WebViewActivity.this.finish();
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    final class e {
        e() {
        }

        @JavascriptInterface
        public String getAuthInfo() {
            return WebViewActivity.this.j.c(WebViewActivity.this.e, WebViewActivity.this.getPackageName());
        }

        @JavascriptInterface
        public void authCancel(String str) {
            nox.b("WebViewActivity", "js call authCancel parameter:" + str, false);
            nox.b("WebViewActivity", "js call authCancel", true);
            WebViewActivity.this.j.d(6, "User cancel", "");
        }

        @JavascriptInterface
        public void authSuccCloseH5(String str) {
            nox.b("WebViewActivity", "js call auth suc parameter:" + str, false);
            nox.b("WebViewActivity", "js call auth suc.", true);
            WebViewActivity.this.j.d(200, "Sign In Success", "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, String str2, final String str3) {
        if (!nom.a(this) || !nom.a() || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            nox.b("WebViewActivity", "WXApp not Installed or parms invalid", true);
            final String strG = com.huawei.hwidauth.h.a.a().g();
            new Handler(getMainLooper()).post(new Runnable() { // from class: com.huawei.hwidauth.ui.WebViewActivity.10
                @Override // java.lang.Runnable
                public void run() {
                    WebViewActivity.this.e.postUrl(strG, nom.d(WebViewActivity.this.j.c("-1", str3)));
                }
            });
            return;
        }
        noe.a().d(this);
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(this, str, true);
        iwxapiCreateWXAPI.registerApp(str);
        SendAuth.Req req = new SendAuth.Req();
        req.scope = str2;
        req.state = str3;
        iwxapiCreateWXAPI.sendReq(req);
    }

    @Override // com.huawei.hwidauth.ui.f.b
    public void a(final int i, final String str) {
        runOnUiThread(new Runnable() { // from class: com.huawei.hwidauth.ui.WebViewActivity.6
            @Override // java.lang.Runnable
            public void run() {
                if (WebViewActivity.this.d != null && WebViewActivity.this.d.getVisibility() == 0) {
                    WebViewActivity.this.d.setVisibility(8);
                }
                WebViewActivity.this.j.d(i, str, "");
            }
        });
    }

    @Override // com.huawei.hwidauth.ui.f.b
    public void c(String str) {
        this.u = str;
    }

    private String e(Context context) {
        nox.b("WebViewActivity", "enter getUAExtra", true);
        StringBuilder sb = new StringBuilder("; phoneservice; hwidOAuthSDK_ver=6.13.0.301; app=");
        sb.append(context.getPackageName());
        sb.append("; app_ver=");
        sb.append(nom.c(this));
        sb.append("; noNeedClientNonce; supportChooseFile=true");
        if (nom.a(this)) {
            sb.append("; wechatinstalled");
        }
        if (nom.a()) {
            sb.append("; supportWechatLogin");
        }
        if ("from_other_app_signin".equalsIgnoreCase(this.j.d())) {
            sb.append("; service=");
            sb.append(this.j.i());
            sb.append("; X-Huawei-Client-Info=");
            nog nogVar = this.j;
            sb.append(nogVar.l(nogVar.b()));
        }
        sb.append("; faceRealnameSupport; androidVersionCode=");
        sb.append(Build.VERSION.SDK_INT);
        return sb.toString();
    }

    /* JADX INFO: loaded from: classes3.dex */
    class AuthWebChromeClient extends WebChromeClient {
        private AuthWebChromeClient() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
            if (WebViewActivity.this.f17596b != null) {
                WebViewActivity.this.f17596b.setProgress(i);
                if (i == 100) {
                    WebViewActivity.this.f17596b.setVisibility(8);
                    return;
                } else {
                    WebViewActivity.this.f17596b.setVisibility(0);
                    return;
                }
            }
            nox.a("WebViewActivity", "mProgressBar is null.", true);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            nox.b("WebViewActivity", "onConsoleMessage: message = " + consoleMessage.message(), false);
            nox.b("WebViewActivity", "onConsoleMessage: sourceId = " + consoleMessage.sourceId(), false);
            nox.b("WebViewActivity", "onConsoleMessage: lineNumber = " + consoleMessage.lineNumber(), false);
            nox.b("WebViewActivity", "onConsoleMessage: messageLevel = " + consoleMessage.messageLevel(), false);
            return super.onConsoleMessage(consoleMessage);
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            nox.b("WebViewActivity", "enter onReceivedTitle", true);
            String str2 = " ";
            if (TextUtils.isEmpty(str)) {
                str = " ";
            }
            if (!str.startsWith("http")) {
                str2 = str;
            } else if ("from_other_app_signin".equalsIgnoreCase(WebViewActivity.this.j.d())) {
                WebViewActivity.this.j(" ");
            }
            if (webView.getUrl() == null || str2.equalsIgnoreCase("Authorization")) {
                return;
            }
            nox.b("WebViewActivity", "url:" + webView.getUrl(), false);
            WebViewActivity.this.j(str2);
        }

        public void openFileChooser(ValueCallback<Uri> valueCallback) {
            nox.b("WebViewActivity", " openFileChooser < 3.0 " + Build.VERSION.SDK_INT, true);
            WebViewActivity.this.c(valueCallback);
        }

        public void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
            nox.b("WebViewActivity", "openFileChooser For Android 3.0+ " + Build.VERSION.SDK_INT, true);
            WebViewActivity.this.c(valueCallback);
        }

        public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
            nox.b("WebViewActivity", "openFileChooser For Android > 4.1 " + Build.VERSION.SDK_INT, true);
            if (!WebViewActivity.this.j.o()) {
                WebViewActivity.this.c(valueCallback);
                return;
            }
            WebViewActivity webViewActivity = WebViewActivity.this;
            webViewActivity.h(webViewActivity.getString(R.string.hwid_string_not_support_split));
            if (valueCallback != null) {
                try {
                    valueCallback.onReceiveValue(null);
                } catch (Exception e) {
                    nox.b("WebViewActivity", "openFileChooser  e" + e.getClass().getSimpleName(), true);
                }
            }
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            nox.b("WebViewActivity", "onShowFileChooser For Android > 5.0 " + Build.VERSION.SDK_INT, true);
            WebViewActivity.this.n = valueCallback;
            if (!WebViewActivity.this.j.o()) {
                WebViewActivity.this.t = 1002;
                nox.b("WebViewActivity", "onShowFileChooser showChoosePicDialog", true);
                WebViewActivity.this.d(1002);
                return true;
            }
            WebViewActivity webViewActivity = WebViewActivity.this;
            webViewActivity.h(webViewActivity.getString(R.string.hwid_string_not_support_split));
            if (valueCallback != null) {
                try {
                    valueCallback.onReceiveValue(new Uri[0]);
                } catch (Exception e) {
                    nox.b("WebViewActivity", "openFileChooser  e" + e.getClass().getSimpleName(), true);
                }
            }
            nox.b("WebViewActivity", "onShowFileChooser return", true);
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onPermissionRequest(PermissionRequest permissionRequest) {
            try {
                nox.b("WebViewActivity", "onPermissionRequest:" + Arrays.toString(permissionRequest.getResources()), true);
                WebViewActivity.this.p = permissionRequest;
                for (String str : permissionRequest.getResources()) {
                    if ("android.webkit.resource.VIDEO_CAPTURE".equals(str)) {
                        WebViewActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.hwidauth.ui.WebViewActivity.AuthWebChromeClient.4
                            @Override // java.lang.Runnable
                            public void run() {
                                if (!WebViewActivity.this.g()) {
                                    WebViewActivity.this.p.grant(WebViewActivity.this.p.getResources());
                                } else {
                                    WebViewActivity.this.e(2);
                                }
                            }
                        });
                        return;
                    }
                }
            } catch (NullPointerException e) {
                nox.b("WebViewActivity", "openFileChooser  e" + e.getClass().getSimpleName(), true);
            }
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        npe.c(getWindow());
        super.onPause();
        SafeWebView safeWebView = this.e;
        if (safeWebView != null) {
            safeWebView.onPause();
        }
    }

    private void ag() {
        nor.c(a());
        nox.b("WebViewActivity", "deleteFiles....successful", true);
    }

    private String a() {
        try {
            return getDir("hwId", 0).getCanonicalPath() + "/";
        } catch (IOException e2) {
            nox.a("WebViewActivity", "IOException:" + e2.getClass().getSimpleName(), true);
            return "";
        }
    }

    @Override // com.huawei.secure.android.common.activity.SafeActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        nox.a("WebViewActivity", "onDestroy", true);
        AlertDialog alertDialog = this.r;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.r.dismiss();
        }
        AlertDialog alertDialog2 = this.q;
        if (alertDialog2 != null && alertDialog2.isShowing()) {
            this.q.dismiss();
        }
        AlertDialog alertDialog3 = this.s;
        if (alertDialog3 != null && alertDialog3.isShowing()) {
            this.s.dismiss();
        }
        nnv.a(getApplicationContext()).d("fileDownLoadLastUpdate", String.valueOf(System.currentTimeMillis()));
        ag();
        i();
        noe.a().d();
        b bVar = new b(npb.d(this));
        bVar.setName("DeleteCachedFilesTask");
        bVar.start();
    }

    private void i() {
        SafeWebView safeWebView = this.e;
        if (safeWebView != null) {
            try {
                safeWebView.stopLoading();
                this.e.setVisibility(8);
                this.e.removeAllViews();
                this.e.clearFormData();
                this.e.clearHistory();
                this.e.destroy();
                this.e = null;
            } catch (Exception e2) {
                nox.a("WebViewActivity", "WebView cleanup error: " + e2.getMessage(), true);
            }
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static class b extends Thread {
        private final String e;

        public b(String str) {
            this.e = str;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            npb.e(this.e);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        nox.b("WebViewActivity", "onBackPressed", true);
        try {
            SafeWebView safeWebView = this.e;
            if (safeWebView != null && safeWebView.canGoBack()) {
                String url = this.e.getUrl();
                boolean z = false;
                nox.b("WebViewActivity", "currentUrl:" + url, false);
                if (!TextUtils.isEmpty(url)) {
                    String[] strArrSplit = url.split("\\?");
                    if (strArrSplit.length > 0 && (strArrSplit[0].endsWith("wapLogin.html") || strArrSplit[0].endsWith("welcome.html"))) {
                        this.j.d(6, "User cancel", "");
                        super.onBackPressed();
                        return;
                    }
                }
                for (String str : this.h) {
                    if (!TextUtils.isEmpty(url) && url.startsWith(str)) {
                        z = true;
                        break;
                    }
                }
                nox.b("WebViewActivity", "goBackUseWap:" + z, true);
                if (z) {
                    h();
                    this.e.loadUrl(j());
                    return;
                }
                this.e.goBack();
                return;
            }
            this.j.d(6, "User cancel", "");
            super.onBackPressed();
        } catch (RuntimeException unused) {
            nox.a("WebViewActivity", "catch Exception throw by FragmentManager!", true);
        }
    }

    private void h() {
        if ("from_other_app_signin".equals(this.j.d())) {
            nox.b("WebViewActivity", "onBackPressed setDiyTitle:", true);
            j("");
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }

    private String j() {
        return "javascript:goBack()";
    }

    @Override // com.huawei.secure.android.common.activity.SafeActivity, android.app.Activity
    public void onResume() {
        npe.d(getWindow());
        super.onResume();
        SafeWebView safeWebView = this.e;
        if (safeWebView != null) {
            safeWebView.onResume();
        }
    }

    public boolean c() {
        return this.m;
    }

    @Override // com.huawei.hwidauth.ui.f.b
    public void b(boolean z) {
        this.m = z;
    }

    public boolean d() {
        return this.o;
    }

    @Override // com.huawei.hwidauth.ui.f.b
    public void c(boolean z) {
        this.o = z;
    }

    @Override // com.huawei.secure.android.common.activity.SafeActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        nox.b("WebViewActivity", "onActivityResult " + i + " resultCode " + i2, true);
        super.onActivityResult(i, i2, intent);
        if (i == 1004 || i == 1003) {
            e(i, i2, intent);
        }
    }

    private void f() {
        nox.b("WebViewActivity", "showNoNetworkDialog", true);
        AlertDialog alertDialogCreate = npi.e(this).create();
        this.r = alertDialogCreate;
        alertDialogCreate.setCancelable(false);
        if (isFinishing()) {
            return;
        }
        npi.e(this.r);
        this.r.show();
    }

    private void e(int i, int i2, Intent intent) {
        nox.b("WebViewActivity", "dealRequestGalleryAndCamera start.", true);
        if (!nom.i(this)) {
            e((Uri) null);
            f();
            return;
        }
        if (i == 1004 && intent != null && intent.getData() != null) {
            this.k = intent.getData();
        }
        if (d(-1 == i2 && UriCheckUtils.isUriValid(i == 1004 ? 1 : 0, this.k))) {
            c(this.k);
        }
    }

    private void c(Uri uri) {
        nox.b("WebViewActivity", "startCompressPic", true);
        new nnx(this, uri, new com.huawei.hwidauth.g.b() { // from class: com.huawei.hwidauth.ui.WebViewActivity.7
            @Override // com.huawei.hwidauth.g.b
            public void a(Bundle bundle) {
                Uri uri2 = (Uri) bundle.getParcelable("request_pic_uri_tag");
                nox.b("WebViewActivity", "startCompressPic onSuccess", true);
                WebViewActivity.this.e(uri2);
            }

            @Override // com.huawei.hwidauth.g.b
            public void b(Bundle bundle) {
                nox.b("WebViewActivity", "startCompressPic onError", true);
                WebViewActivity.this.e((Uri) null);
            }
        }).execute(1);
    }

    private boolean d(boolean z) {
        nox.b("WebViewActivity", "checkNeedUpdatePic isResultOK = " + z, true);
        if (this.n == null) {
            return false;
        }
        if (z && this.k != null) {
            return true;
        }
        nox.b("WebViewActivity", "checkNeedUpdatePic onReceiveValue = null mTmpPicUri = " + this.k, false);
        e((Uri) null);
        return false;
    }

    private void i(boolean z) {
        boolean z2;
        String string;
        nox.b("WebViewActivity", "enter  showRefuseDailog", true);
        boolean z3 = false;
        if (z) {
            z2 = checkSelfPermission("android.permission.CAMERA") != 0;
        } else {
            z3 = checkSelfPermission(nom.b()) != 0;
            z2 = false;
        }
        if (z3) {
            string = getResources().getString(R.string.hwid_string_pic_permission_show_520, npa.a(this), getResources().getString(R.string.hwid_string_permission_storage));
        } else if (!z2) {
            string = "";
        } else {
            string = getResources().getString(R.string.hwid_string_pic_permission_show_520, npa.a(this), getResources().getString(R.string.hwid_string_permission_camera));
        }
        AlertDialog.Builder builderB = npi.b(this, string, getResources().getString(R.string.hwid_string_permission_use_appeal), null);
        if (isFinishing()) {
            return;
        }
        AlertDialog alertDialogCreate = builderB.create();
        npi.e(alertDialogCreate);
        nox.b("WebViewActivity", "enter  showRefuseDailog show", true);
        alertDialogCreate.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(String str) {
        Toast.makeText(this, str, 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(ValueCallback<Uri> valueCallback) {
        this.n = valueCallback;
        this.t = 1001;
        nox.b("WebViewActivity", "localOpenFileChoose", true);
        nox.b("WebViewActivity", "localOpenFileChoose showChoosePicDialog", true);
        d(1001);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        nox.b("WebViewActivity", "enter -showChoosePicDialog", true);
        Uri uriE = npb.e(this);
        this.k = uriE;
        if (uriE == null) {
            nox.b("WebViewActivity", "showChoosePicDialog mTmpPicUri null", true);
            return;
        }
        this.t = i;
        AlertDialog alertDialogCreate = new nod(this, this.k, new d() { // from class: com.huawei.hwidauth.ui.WebViewActivity.8
            @Override // com.huawei.hwidauth.ui.d
            public void a() {
                nox.b("WebViewActivity", "clickCancel", true);
                WebViewActivity.this.e((Uri) null);
            }

            @Override // com.huawei.hwidauth.ui.d
            public void b() {
                nox.b("WebViewActivity", "clickCamera", true);
                if (!WebViewActivity.this.g()) {
                    WebViewActivity.this.k();
                } else {
                    WebViewActivity.this.e(0);
                }
            }

            @Override // com.huawei.hwidauth.ui.d
            public void c() {
                nox.b("WebViewActivity", "clickPhoto", true);
                if (Build.VERSION.SDK_INT >= 29) {
                    nox.b("WebViewActivity", "clickPhoto android 6.0 less or 10.0 more ,buildVer is " + Build.VERSION.SDK_INT, true);
                    WebViewActivity.this.n();
                    return;
                }
                boolean z = WebViewActivity.this.checkSelfPermission(nom.b()) == 0;
                nox.b("WebViewActivity", "clickPhoto hasStoragePer" + z, true);
                if (z) {
                    WebViewActivity.this.n();
                } else {
                    WebViewActivity.this.e(1);
                }
            }
        }).create();
        this.q = alertDialogCreate;
        npi.e(alertDialogCreate);
        this.q.setCanceledOnTouchOutside(false);
        this.q.setCancelable(false);
        this.q.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.huawei.hwidauth.ui.WebViewActivity.9
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                nox.b("WebViewActivity", "dialog cancel", true);
                WebViewActivity.this.e((Uri) null);
            }
        });
        nox.b("WebViewActivity", "show showChoosePicDialog", true);
        if (isFinishing()) {
            return;
        }
        npi.e(this.q);
        this.q.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        boolean z = checkSelfPermission("android.permission.CAMERA") == 0;
        nox.b("WebViewActivity", "clickCamera hasCameraPer: " + z, true);
        return !z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        nox.b("WebViewActivity", "init showPermissionTipDialog", true);
        AlertDialog alertDialogCreate = b(i).create();
        this.s = alertDialogCreate;
        npi.e(alertDialogCreate);
        this.s.setCanceledOnTouchOutside(false);
        this.s.setCancelable(false);
        nox.b("WebViewActivity", "show showPermissionTipDialog", true);
        if (isFinishing()) {
            return;
        }
        npi.e(this.s);
        this.s.show();
    }

    private AlertDialog.Builder b(final int i) {
        nox.b("WebViewActivity", "createPermissionDialog", true);
        AlertDialog.Builder builder = new AlertDialog.Builder(this, npi.d(this));
        builder.setTitle(getResources().getString(R.string.hwid_string_permission_tip_640));
        builder.setNeutralButton(getResources().getString(R.string.hwid_string_permission_ok_640), new DialogInterface.OnClickListener() { // from class: com.huawei.hwidauth.ui.WebViewActivity.13
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                int i3 = i;
                if (i3 == 0) {
                    nox.b("WebViewActivity", "startCamera", true);
                    WebViewActivity.this.j.d(1006);
                } else if (i3 == 1) {
                    nox.b("WebViewActivity", "startGallery", true);
                    WebViewActivity.this.j.b(1007);
                } else {
                    if (i3 != 2) {
                        return;
                    }
                    nox.b("WebViewActivity", "check H5 camera perm", true);
                    WebViewActivity.this.j.d(1008);
                }
            }
        });
        String strC = c(i);
        if (i != 0) {
            if (i == 1) {
                if (TextUtils.isEmpty(strC)) {
                    strC = getResources().getString(R.string.hwid_string_storage_permission_description_640);
                }
                builder.setMessage(strC);
                nox.b("WebViewActivity", "show gallery text", true);
                return builder;
            }
            if (i != 2) {
                return builder;
            }
        }
        nox.b("WebViewActivity", "show camera text", true);
        if (TextUtils.isEmpty(strC)) {
            strC = getResources().getString(R.string.hwid_string_camera_permission_description_640);
        }
        builder.setMessage(strC);
        return builder;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    private String c(int i) {
        String str;
        try {
            Bundle bundle = getPackageManager().getApplicationInfo(getPackageName(), 128).metaData;
            if (bundle == null) {
                return "";
            }
            if (i == 0) {
                str = "picker.permission.reason.android.permission-group.CAMERA";
            } else if (i == 1) {
                str = "picker.permission.reason.android.permission-group.STORAGE";
            } else if (i != 2) {
                str = "";
            } else {
                str = "picker.permission.reason.android.permission-group.CAMERA";
            }
            if (TextUtils.isEmpty(str)) {
                nox.b("WebViewActivity", "do not have customized perm desc", true);
                return "";
            }
            int i2 = bundle.getInt(str);
            nox.b("WebViewActivity", "getMetaPermDesc resId:" + i2, true);
            return getResources().getString(i2);
        } catch (Exception e2) {
            nox.a("WebViewActivity", "getMetaPermDesc get " + e2.getClass().getSimpleName(), true);
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.k == null) {
            return;
        }
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.setFlags(3);
        String str = getPackageName() + ".hwidauth.fileProvider";
        nox.b("WebViewActivity", "start Camera authority = " + str, false);
        Uri uriForFile = FileProvider.getUriForFile(this, str, new File(this.k.getPath()));
        nox.b("WebViewActivity", "startCamera tmpCropUri = " + uriForFile, false);
        intent.putExtra("output", uriForFile);
        String systemAppPackage = PresetUtil.getSystemAppPackage(this, intent);
        if (!TextUtils.isEmpty(systemAppPackage)) {
            nox.b("WebViewActivity", "start Camare, packageName = " + systemAppPackage, true);
            intent.setPackage(systemAppPackage);
        }
        try {
            startActivityForResult(intent, 1003);
        } catch (Exception e2) {
            nox.a("WebViewActivity", "startCamera :" + e2.getClass().getSimpleName(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        Intent intent = new Intent("android.intent.action.PICK", (Uri) null);
        intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, Constants.IMAGE_TYPE);
        String systemAppPackage = PresetUtil.getSystemAppPackage(this, intent, f17594c);
        if (!TextUtils.isEmpty(systemAppPackage)) {
            nox.b("WebViewActivity", "start Gallery, packageName = " + systemAppPackage, true);
            intent.setPackage(systemAppPackage);
        }
        try {
            startActivityForResult(intent, 1004);
        } catch (Exception e2) {
            nox.a("WebViewActivity", "startGallery" + e2.getClass().getSimpleName(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void e(Uri uri) {
        nox.b("WebViewActivity", "uploadCardPic RESULTCODE", true);
        ValueCallback<?> valueCallback = this.n;
        if (valueCallback != null) {
            try {
                int i = this.t;
                if (i == 1001) {
                    valueCallback.onReceiveValue(uri);
                } else if (i == 1002) {
                    valueCallback.onReceiveValue(uri == null ? new Uri[0] : new Uri[]{uri});
                }
            } catch (Exception e2) {
                nox.b("WebViewActivity", "Exception e" + e2.getClass().getSimpleName(), true);
            }
            this.n = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String m() {
        if ("verify_password_new".equalsIgnoreCase(this.j.d())) {
            return "accountPickerH5.chkUserPassword_v3";
        }
        return "accountPickerH5.chkUserPassword_v2";
    }
}
