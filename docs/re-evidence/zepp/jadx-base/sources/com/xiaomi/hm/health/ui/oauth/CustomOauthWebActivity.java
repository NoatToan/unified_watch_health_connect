package com.xiaomi.hm.health.ui.oauth;

import android.R;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import com.huami.account.HMLoginManager;
import com.huami.account.ui.common.BaseTitleOauthActivity;
import com.huami.account.ui.login.LoginActivity;
import com.huami.discovery.bridge.BridgeCallbackBinder;
import com.huami.discovery.bridge.jsbridge.JsBridgeNativeAPI;
import com.huami.discovery.bridge.jsbridge.JsBridgeWebView;
import com.huami.lib.view.ViewUtils;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.passport.IAccount;
import com.huami.passport.auth.AuthorizeLoader;
import com.huami.passport.auth.IError;
import com.huami.passport.auth.Protocol;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.web.container.jsbridge.JsBridgeAdapter;
import com.xiaomi.hm.health.baseutil.GlobalUtil;
import com.xiaomi.hm.health.utils.HMPropertyUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes22.dex */
public class CustomOauthWebActivity extends BaseTitleOauthActivity {
    public static final int OAUTH_LOGIN_REQUEST_CODE = 4369;
    private JsBridgeWebView B;
    private ProgressBar C;
    private final String A = "CustomOauthWebActivity";
    private final int D = 5;
    private final int E = 100;

    public class a implements IAccount.Callback<String, IError> {
        public a() {
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(IError error) {
            HMLog.i("CustomOauthWebActivity", error.toString(), new Object[0]);
            CustomOauthWebActivity.this.C(error);
            CustomOauthWebActivity.this.finish();
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String result) {
            CustomOauthWebActivity.this.D(result);
            CustomOauthWebActivity.this.finish();
        }
    }

    public class b extends JsBridgeAdapter {
        public b(BaseTitleActivity activity) {
            super(activity);
        }

        @Override // com.huami.web.container.jsbridge.JsBridgeAdapter, com.huami.discovery.bridge.jsbridge.JsBridgeCallback
        public void loadPage(String url) {
            CustomOauthWebActivity.this.B.loadUrl(url);
        }

        @Override // com.huami.web.container.jsbridge.JsBridgeAdapter, com.huami.discovery.bridge.jsbridge.JsBridgeCallback
        public void setIsRefresh(boolean refresh) {
        }
    }

    public class c extends WebChromeClient {
        public c() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView view, int newProgress) {
            super.onProgressChanged(view, newProgress);
            if (newProgress > 5 && newProgress < 100) {
                CustomOauthWebActivity.this.C.setProgress(newProgress);
            }
            if (newProgress >= 100) {
                CustomOauthWebActivity.this.C.setProgress(100);
                CustomOauthWebActivity.this.C.setVisibility(8);
            }
            HMLog.d("CustomOauthWebActivity", "progress:" + newProgress, new Object[0]);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            CustomOauthWebActivity.this.C(IError.EC_10007);
            CustomOauthWebActivity.this.finish();
        }
    }

    public static class e extends AsyncTask<Void, Void, Boolean> {
        private WeakReference<CustomOauthWebActivity> a;

        public e(CustomOauthWebActivity activity) {
            this.a = new WeakReference<>(activity);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... params) {
            HMLoginManager.oldAccount2HuamiAccount();
            return Boolean.valueOf(HMLoginManager.isHuamiSDKLogin());
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean result) {
            super.onPostExecute(result);
            CustomOauthWebActivity customOauthWebActivity = this.a.get();
            if (customOauthWebActivity == null || customOauthWebActivity.isFinishing()) {
                return;
            }
            if (!result.booleanValue()) {
                customOauthWebActivity.C(IError.EC_10002);
            } else if (HMLoginManager.isOldUser()) {
                customOauthWebActivity.B();
            } else {
                customOauthWebActivity.y();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        Intent intent = getIntent();
        if (intent != null) {
            Uri data = intent.getData();
            if (Protocol.verifyUri(data, Protocol.ACCESS_TOKEN_PATH)) {
                AuthorizeLoader authorizeLoader = new AuthorizeLoader(this.B);
                String queryParameter = data.getQueryParameter("client_id");
                String property = HMPropertyUtil.getProperty("huami.thirdparty.oauth", "");
                if (!TextUtils.isEmpty(property) && z(queryParameter)) {
                    authorizeLoader.setCustomAuthUrl(property);
                }
                String debugUrl = OauthDebugHelper.getDebugUrl(this);
                if (!TextUtils.isEmpty(debugUrl) && GlobalUtil.isInnerFlavor()) {
                    authorizeLoader.setCustomAuthUrl(debugUrl);
                    Toast.makeText(getApplicationContext(), "正在使用调试地址\n" + debugUrl, 1).show();
                }
                boolean z = !HMServerDef.isProductUrl();
                HMLog.i("CustomOauthWebActivity", "isTest:" + z, new Object[0]);
                authorizeLoader.setTestMode(z);
                authorizeLoader.displayWebPage(getCallingPackage(), data, new a());
                this.B.setWebViewClient(new OAuthJsBridgeWebViewClient(this.B, authorizeLoader));
                return;
            }
        }
        C(IError.EC_10001);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(IError error) {
        Protocol.onErrorCallback(this, error);
        HMLog.i("CustomOauthWebActivity", "onErrorCallback:errorCode=" + error.errorCode + ";errorMsg=" + error.errorMsg, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(String token) {
        Protocol.onSuccessCallback(this, token);
        HMLog.i("CustomOauthWebActivity", "onSuccessCallback", new Object[0]);
    }

    private void E() {
        if (HMLoginManager.isOldAccount()) {
            new e(this).execute(new Void[0]);
            return;
        }
        if (!HMLoginManager.isHuamiSDKLogin()) {
            y();
        } else if (HMLoginManager.isUnInit()) {
            y();
        } else {
            B();
        }
    }

    private void initView() {
        JsBridgeWebView jsBridgeWebView = new JsBridgeWebView(this);
        this.B = jsBridgeWebView;
        configureAppCache(jsBridgeWebView.getSettings());
        configureDOMStorage(this.B.getSettings());
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        relativeLayout.addView(this.B, new ViewGroup.LayoutParams(-1, -1));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        layoutParams.setMargins(0, (int) ViewUtils.dp2px(this, -6.0f), 0, 0);
        ProgressBar progressBar = new ProgressBar(this, null, R.attr.progressBarStyleHorizontal);
        this.C = progressBar;
        progressBar.setDrawingCacheBackgroundColor(ContextCompat.getColor(this, com.huami.watch.hmwatchmanager.R.color.common_light_color));
        this.C.setProgress(5);
        this.C.setMax(100);
        this.C.setProgressTintList(ColorStateList.valueOf(ContextCompat.getColor(this, com.huami.watch.hmwatchmanager.R.color.common_light_color)));
        this.C.setProgressTintMode(PorterDuff.Mode.SRC_IN);
        this.C.setProgressBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, com.huami.watch.hmwatchmanager.R.color.transparent)));
        this.C.setProgressBackgroundTintMode(PorterDuff.Mode.SRC_IN);
        relativeLayout.addView(this.C, layoutParams);
        setContentView(relativeLayout);
        JsBridgeNativeAPI jsBridgeNativeAPI = new JsBridgeNativeAPI(this, this.B);
        jsBridgeNativeAPI.setJsBridgeListener(new b(this));
        jsBridgeNativeAPI.setJsBridgeApi(BridgeCallbackBinder.getInstance().getmJsBridgeApi());
        jsBridgeNativeAPI.preVerifyJsApi();
        this.B.setWebChromeClient(new c());
        getLeft().setOnClickListener(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        Intent intent = new Intent();
        intent.setClass(this, LoginActivity.class);
        startActivityForResult(intent, OAUTH_LOGIN_REQUEST_CODE);
    }

    private boolean z(String clientId) {
        if (clientId == null) {
            return false;
        }
        return clientId.startsWith("v2");
    }

    public void configureAppCache(WebSettings settings) {
        settings.setAppCacheEnabled(true);
        settings.setAppCachePath(getDir("cache", 0).getPath());
    }

    public void configureDOMStorage(WebSettings settings) {
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setDatabasePath(getDir("database", 0).getPath());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 4369) {
            if (resultCode == -1 && HMLoginManager.isOldUser()) {
                B();
            } else {
                C(IError.EC_10007);
                finish();
            }
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.B.canGoBack()) {
            this.B.goBack();
        } else {
            C(IError.EC_10007);
            finish();
        }
    }

    @Override // com.huami.account.ui.common.BaseTitleOauthActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fromOauth();
        initView();
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, ContextCompat.getColor(this, com.huami.watch.hmwatchmanager.R.color.pale_grey), true);
        setTitleText(com.huami.watch.hmwatchmanager.R.string.oauth_web_title);
        setBaseTitleColor(ContextCompat.getColor(this, com.huami.watch.hmwatchmanager.R.color.black70));
        setLeftImageRes(com.huami.watch.hmwatchmanager.R.drawable.icon_common_close, com.huami.watch.hmwatchmanager.R.color.black40);
        E();
    }
}
