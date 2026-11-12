package com.xiaomi.passport.ui.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.widget.TextView;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.account.passportsdk.account_sso.R;
import com.xiaomi.accountsdk.account.XMPassportSettings;
import com.xiaomi.accountsdk.account.utils.WebViewFileTransferUtils;
import com.xiaomi.accountsdk.account.utils.XMPassportUtil;
import com.xiaomi.accountsdk.request.NetworkUtils;
import com.xiaomi.accountsdk.utils.AccountLogger;
import com.xiaomi.accountsdk.utils.ParcelableAttackGuardian;
import com.xiaomi.passport.jsb.ParcelablePassportJsbMethod;
import com.xiaomi.passport.jsb.PassportJsbMethod;
import com.xiaomi.passport.jsb.PassportJsbMethodException;
import com.xiaomi.passport.jsb.PassportJsbMethodResult;
import com.xiaomi.passport.jsb.PassportJsbWebViewPageConfig;
import com.xiaomi.passport.ui.BaseActivity;
import com.xiaomi.passport.ui.utils.AccountToast;
import com.xiaomi.passport.ui.utils.PassportPageIntent;
import com.xiaomi.passport.ui.view.PassportDialog;
import com.xiaomi.passport.utils.AnyUrl;
import com.xiaomi.passport.utils.ClipboardDataSetter;
import com.xiaomi.passport.webview.CookieFillAccountDeviceParamsULPT;
import com.xiaomi.passport.webview.CookieFillAutoLoginULPT;
import com.xiaomi.passport.webview.CookieLoginUrlInterceptor;
import com.xiaomi.passport.webview.DeeplinkUrlInterceptor;
import com.xiaomi.passport.webview.HeaderFillActivatorTokenULPT;
import com.xiaomi.passport.webview.PassportJsbWebPageLifecycleListener;
import com.xiaomi.passport.webview.PassportJsbWebView;
import com.xiaomi.passport.webview.RedirectControlInterceptor;
import com.xiaomi.passport.webview.RemoveAllCookiesULPT;
import com.xiaomi.passport.webview.UrlInterceptor;
import com.xiaomi.passport.webview.UrlLoadListener;
import com.xiaomi.passport.webview.UrlLoadPrepareTask;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class PassportJsbWebViewActivity extends BaseActivity implements UrlLoadListener {
    private static final int FILE_CHOOSER_REQUEST_CODE = 1;
    private static final String METADATA_ALLOWED_DOMAINS = "passport.allowed_domains";
    private static final String METADATA_DISABLE_DOMAIN_VALIDATION = "passport.disable_domain_validation";
    public static final String TAG = "PassportJsbWebViewActivity";
    private PassportDialog mLoadingDialog;
    private PassportJsbWebViewPageConfig mPageConfig;
    private WebViewFileTransferUtils.FileUpload mWebFileTransfer;
    private PassportJsbWebView mWebView;
    private static final List<String> DEFAULT_ALLOWED_DOMAINS = Arrays.asList("mi.com", "xiaomi.com");
    private static List<String> sAllowedDomains = null;
    private static Boolean sDomainValidationDisabled = null;
    private static Boolean sIsStagingEnv = null;
    private static boolean sConfigInitialized = false;
    private boolean mUrlHasLoadFinish = true;
    private boolean mUrlHasLoadError = false;

    private String appendCommonParams(String str) {
        HashMap map = new HashMap();
        map.put("_locale", XMPassportUtil.getISOLocaleString(Locale.getDefault()));
        return AnyUrl.make(str, map);
    }

    private void initDomainValidation() {
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        String[] stringArray;
        if (sConfigInitialized) {
            return;
        }
        synchronized (PassportJsbWebViewActivity.class) {
            try {
                if (!sConfigInitialized) {
                    sAllowedDomains = new ArrayList(DEFAULT_ALLOWED_DOMAINS);
                    try {
                        PackageManager packageManager = getPackageManager();
                        if (packageManager != null && (applicationInfo = (packageInfo = packageManager.getPackageInfo(getPackageName(), 128)).applicationInfo) != null && applicationInfo.metaData != null) {
                            sIsStagingEnv = Boolean.valueOf(XMPassportSettings.isLocalStaging(this));
                            Boolean boolValueOf = Boolean.valueOf(packageInfo.applicationInfo.metaData.getBoolean(METADATA_DISABLE_DOMAIN_VALIDATION, false));
                            sDomainValidationDisabled = boolValueOf;
                            if (boolValueOf.booleanValue()) {
                                AccountLogger.log(TAG, "域名验证已被手动禁用");
                            } else {
                                int i = packageInfo.applicationInfo.metaData.getInt(METADATA_ALLOWED_DOMAINS, 0);
                                if (i != 0 && (stringArray = getResources().getStringArray(i)) != null && stringArray.length > 0) {
                                    sAllowedDomains.addAll(Arrays.asList(stringArray));
                                    AccountLogger.log(TAG, "load whitelist config from user: " + sAllowedDomains);
                                }
                            }
                        }
                    } catch (Exception e) {
                        AccountLogger.log(TAG, "Error loading user config whitelist, using default", e);
                    }
                    sConfigInitialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void initParams() {
        AccountLogger.log(TAG, "intent params=" + getIntent().getExtras());
        this.mPageConfig = PassportJsbWebViewPageConfig.parse(getIntent()).build();
        initDomainValidation();
        if (isUrlValid(this.mPageConfig.url)) {
            return;
        }
        AccountLogger.log(TAG, "url is not valid: " + this.mPageConfig.url);
        finish();
    }

    private void initWebViewAndLoadUrl(Bundle bundle) {
        this.mWebView = new PassportJsbWebView(this);
        ((ViewGroup) findViewById(R.id.root)).addView(this.mWebView);
        Iterator<UrlInterceptor> it = collectUrlInterceptors(this.mPageConfig).iterator();
        while (it.hasNext()) {
            this.mWebView.addUrlInterceptor(it.next());
        }
        Iterator<PassportJsbMethod> it2 = collectJsbMethods(this.mPageConfig).iterator();
        while (it2.hasNext()) {
            this.mWebView.addJsbMethod(it2.next());
        }
        this.mWebView.setUrlLoadListener(this);
        this.mWebFileTransfer = WebViewFileTransferUtils.setupFileUpload(this.mWebView, this, 1);
        if (bundle == null) {
            loadWebUrl();
            return;
        }
        this.mWebView.restoreState(bundle);
        if (TextUtils.isEmpty(this.mWebView.getUrl())) {
            AccountLogger.log(TAG, "recreate no load ever and reload");
            loadWebUrl();
        }
    }

    private void internalCreate(Bundle bundle) {
        initParams();
        if (new DeeplinkUrlInterceptor().shouldIntercept(this, this.mPageConfig.url)) {
            finish();
            return;
        }
        try {
            if (!getPackageManager().getPackageInfo(getPackageName(), 128).applicationInfo.metaData.getBoolean("passport.not_use_app_webview", false)) {
                setContentView(R.layout.passport_activity_jsb_webview);
                initWebViewAndLoadUrl(bundle);
                return;
            }
            Intent externalWebPageIntentWithBestEffort = PassportPageIntent.getExternalWebPageIntentWithBestEffort(this, appendCommonParams(this.mPageConfig.url));
            if (externalWebPageIntentWithBestEffort == null) {
                AccountToast.showToastMessage(this, R.string.passport_error_unknow_error);
            } else {
                startActivity(externalWebPageIntentWithBestEffort);
            }
            finish();
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalStateException("should never happen", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isUrlValid(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            URI uri = new URI(str);
            if (!sIsStagingEnv.booleanValue() && !Constants.URI_SCHEME.equalsIgnoreCase(uri.getScheme())) {
                AccountLogger.log(TAG, "http is not permitted here, use https instead: " + str);
                return false;
            }
            if (sDomainValidationDisabled.booleanValue()) {
                return true;
            }
            String host = uri.getHost();
            if (host == null) {
                return false;
            }
            for (String str2 : sAllowedDomains) {
                if (!host.equals(str2)) {
                    if (host.endsWith("." + str2)) {
                    }
                }
                return true;
            }
            AccountLogger.log(TAG, "URL not in white list: " + str);
            return false;
        } catch (URISyntaxException e) {
            AccountLogger.log(TAG, "URL format error: " + str, e);
            return false;
        }
    }

    private void loadWebUrl() {
        if (!NetworkUtils.isNetworkConnected(this)) {
            AccountToast.showToastMessage(this, R.string.passport_unknown_host_network_error);
            setupPageLoadFailed();
            AccountLogger.log(TAG, "network not available, skip load");
            return;
        }
        AccountLogger.log(TAG, "page load start");
        showLoadingDialog();
        if (!this.mUrlHasLoadFinish) {
            AccountLogger.log(TAG, "has not load finish, skip");
            return;
        }
        String url = this.mWebView.getUrl();
        if (TextUtils.isEmpty(url)) {
            url = appendCommonParams(this.mPageConfig.url);
        }
        if (isUrlValid(url)) {
            this.mWebView.loadUrl(url, collectUrlLoadPrepareTasks(this.mPageConfig));
            return;
        }
        AccountLogger.log(TAG, "Redirect url not valid: " + url);
        setupPageLoadFailed();
    }

    public static Intent makeIntent(Context context, String str) {
        return makeIntent(context, new PassportJsbWebViewPageConfig.Builder().url(str).build());
    }

    private void setupPageLoadFailed() {
        AccountLogger.log(TAG, "setup page load failed");
        this.mWebView.setVisibility(4);
        findViewById(R.id.network_error_layout).setVisibility(0);
        findViewById(R.id.page_header).setVisibility(0);
        ((TextView) findViewById(R.id.page_header_title)).setText(R.string.passport_page_load_failed);
    }

    private void setupPageLoadWebView() {
        AccountLogger.log(TAG, "setup page load finish");
        this.mWebView.setVisibility(0);
        PassportJsbWebViewPageConfig.ActionBarConfig actionBarConfig = this.mPageConfig.actionBarConfig;
        if (actionBarConfig == null) {
            findViewById(R.id.page_header).setVisibility(8);
        } else {
            String str = actionBarConfig.style;
            if (TextUtils.isEmpty(str) || "none".equals(str)) {
                findViewById(R.id.page_header).setVisibility(8);
            } else {
                findViewById(R.id.page_header).setVisibility(0);
                ((TextView) findViewById(R.id.page_header_title)).setText(this.mPageConfig.actionBarConfig.title);
            }
        }
        findViewById(R.id.network_error_layout).setVisibility(4);
    }

    public List<PassportJsbMethod> collectJsbMethods(PassportJsbWebViewPageConfig passportJsbWebViewPageConfig) {
        ParcelablePassportJsbMethod[] parcelablePassportJsbMethodArr;
        ArrayList arrayList = new ArrayList();
        PassportJsbWebViewPageConfig.UrlInteractionStrategy urlInteractionStrategy = passportJsbWebViewPageConfig.urlInteractionStrategy;
        if (urlInteractionStrategy != null && (parcelablePassportJsbMethodArr = urlInteractionStrategy.jsbMethods) != null) {
            for (ParcelablePassportJsbMethod parcelablePassportJsbMethod : parcelablePassportJsbMethodArr) {
                arrayList.add(parcelablePassportJsbMethod);
            }
        }
        arrayList.add(new PassportJsbMethod() { // from class: com.xiaomi.passport.ui.internal.PassportJsbWebViewActivity.1
            @Override // com.xiaomi.passport.jsb.PassportJsbMethod
            public String getName() {
                return "notifyWebLoadFinish";
            }

            @Override // com.xiaomi.passport.jsb.PassportJsbMethod
            public PassportJsbMethodResult invoke(PassportJsbWebView passportJsbWebView, JSONObject jSONObject) throws PassportJsbMethodException {
                PassportJsbWebViewActivity passportJsbWebViewActivity = PassportJsbWebViewActivity.this;
                passportJsbWebViewActivity.onLoadMainFrameFinish(passportJsbWebViewActivity.mWebView, PassportJsbWebViewActivity.this.mWebView.getUrl());
                return new PassportJsbMethodResult(true);
            }
        });
        return arrayList;
    }

    public List<UrlInterceptor> collectUrlInterceptors(PassportJsbWebViewPageConfig passportJsbWebViewPageConfig) {
        UrlInterceptor[] urlInterceptorArr;
        ArrayList arrayList = new ArrayList();
        PassportJsbWebViewPageConfig.UrlInteractionStrategy urlInteractionStrategy = passportJsbWebViewPageConfig.urlInteractionStrategy;
        if (urlInteractionStrategy != null && (urlInterceptorArr = urlInteractionStrategy.urlInterceptors) != null) {
            for (UrlInterceptor urlInterceptor : urlInterceptorArr) {
                arrayList.add(urlInterceptor);
            }
        }
        arrayList.add(new CookieLoginUrlInterceptor(this, this.mPageConfig.closeAfterLogin));
        arrayList.add(new DeeplinkUrlInterceptor());
        arrayList.add(new RedirectControlInterceptor(new RedirectControlInterceptor.UrlValidator() { // from class: com.xiaomi.passport.ui.internal.PassportJsbWebViewActivity.2
            @Override // com.xiaomi.passport.webview.RedirectControlInterceptor.UrlValidator
            public boolean isUrlValid(String str) {
                return PassportJsbWebViewActivity.this.isUrlValid(str);
            }
        }));
        return arrayList;
    }

    public List<UrlLoadPrepareTask> collectUrlLoadPrepareTasks(PassportJsbWebViewPageConfig passportJsbWebViewPageConfig) {
        UrlLoadPrepareTask[] urlLoadPrepareTaskArr;
        UrlLoadPrepareTask[] urlLoadPrepareTaskArr2;
        ArrayList arrayList = new ArrayList();
        PassportJsbWebViewPageConfig.UrlInteractionStrategy urlInteractionStrategy = passportJsbWebViewPageConfig.urlInteractionStrategy;
        if (urlInteractionStrategy != null && (urlLoadPrepareTaskArr2 = urlInteractionStrategy.urlLoadPrepareTasks) != null) {
            for (UrlLoadPrepareTask urlLoadPrepareTask : urlLoadPrepareTaskArr2) {
                arrayList.add(urlLoadPrepareTask);
            }
        }
        if (this.mPageConfig.removeAllCookies) {
            arrayList.add(new RemoveAllCookiesULPT());
        }
        PassportJsbWebViewPageConfig.CookieFillConfig cookieFillConfig = this.mPageConfig.cookieFillConfig;
        if (cookieFillConfig != null) {
            if (cookieFillConfig.cookieFillAccountDeviceParams) {
                arrayList.add(new CookieFillAccountDeviceParamsULPT(this.mWebView.getSettings().getUserAgentString()));
            }
            if (!TextUtils.isEmpty(this.mPageConfig.cookieFillConfig.loginServiceId)) {
                PassportJsbWebViewPageConfig.CookieFillConfig cookieFillConfig2 = this.mPageConfig.cookieFillConfig;
                arrayList.add(new CookieFillAutoLoginULPT(cookieFillConfig2.loginServiceId, cookieFillConfig2.cookieSetUrl));
            }
        }
        PassportJsbWebViewPageConfig.HeaderFillConfig headerFillConfig = this.mPageConfig.headerFillConfig;
        if (headerFillConfig != null && headerFillConfig.headerFillActivatorToken) {
            arrayList.add(new HeaderFillActivatorTokenULPT());
        }
        PassportJsbWebViewPageConfig.UrlInteractionStrategy urlInteractionStrategy2 = this.mPageConfig.urlInteractionStrategy;
        if (urlInteractionStrategy2 != null && (urlLoadPrepareTaskArr = urlInteractionStrategy2.urlLoadPrepareTasks) != null) {
            for (UrlLoadPrepareTask urlLoadPrepareTask2 : urlLoadPrepareTaskArr) {
                arrayList.add(urlLoadPrepareTask2);
            }
        }
        return arrayList;
    }

    public void dismissLoadingDialog() {
        PassportDialog passportDialog = this.mLoadingDialog;
        if (passportDialog == null || !passportDialog.isShowing()) {
            return;
        }
        this.mLoadingDialog.dismiss();
    }

    @Override // com.xiaomi.passport.ui.BaseActivity
    public BaseActivity.StatParams getStatParams() {
        return new BaseActivity.StatParams("PassportWebView 页面", null);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.mWebFileTransfer.handleActivityResult(i, i2, intent);
    }

    public void onBackClicked(View view) {
        finish();
    }

    @Override // androidx.p004activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.mWebView.canGoBack()) {
            this.mWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }

    public void onCopyClicked(View view) {
        ClipboardDataSetter.setClipboardData(this, null, this.mPageConfig.url, false);
        AccountToast.showToastMessage(this, R.string.passport_copy_to_clipboard_successful);
    }

    @Override // com.xiaomi.passport.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!new ParcelableAttackGuardian().safeCheck(this)) {
            finish();
            return;
        }
        internalCreate(bundle);
        PassportJsbWebPageLifecycleListener passportJsbWebPageLifecycleListener = this.mPageConfig.pageLifecycleListener;
        if (passportJsbWebPageLifecycleListener != null) {
            passportJsbWebPageLifecycleListener.onPageEntered(this);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        dismissLoadingDialog();
        PassportJsbWebView passportJsbWebView = this.mWebView;
        if (passportJsbWebView != null) {
            passportJsbWebView.destroy();
            this.mWebView = null;
        }
        PassportJsbWebPageLifecycleListener passportJsbWebPageLifecycleListener = this.mPageConfig.pageLifecycleListener;
        if (passportJsbWebPageLifecycleListener != null) {
            passportJsbWebPageLifecycleListener.onPageExited(this);
        }
        super.onDestroy();
    }

    @Override // com.xiaomi.passport.webview.UrlLoadListener
    public void onLoadMainFrameError(PassportJsbWebView passportJsbWebView, WebResourceRequest webResourceRequest) {
        this.mUrlHasLoadError = true;
        dismissLoadingDialog();
    }

    @Override // com.xiaomi.passport.webview.UrlLoadListener
    public void onLoadMainFrameFinish(PassportJsbWebView passportJsbWebView, String str) {
        if (this.mUrlHasLoadFinish) {
            return;
        }
        this.mUrlHasLoadFinish = true;
        dismissLoadingDialog();
        if (this.mUrlHasLoadError) {
            setupPageLoadFailed();
        } else {
            setupPageLoadWebView();
        }
    }

    @Override // com.xiaomi.passport.webview.UrlLoadListener
    public void onLoadMainFrameStart(PassportJsbWebView passportJsbWebView, String str, Bitmap bitmap) {
        if (isUrlValid(str)) {
            this.mUrlHasLoadError = false;
            this.mUrlHasLoadFinish = false;
            return;
        }
        AccountLogger.log(TAG, "onLoadMainFrameStart invalid url: " + str);
        passportJsbWebView.stopLoading();
        setupPageLoadFailed();
    }

    @Override // com.xiaomi.passport.webview.UrlLoadListener
    public void onLoadResourceError(PassportJsbWebView passportJsbWebView, WebResourceRequest webResourceRequest) {
    }

    @Override // androidx.p004activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        internalCreate(null);
    }

    @Override // com.xiaomi.passport.webview.UrlLoadListener
    public void onReceiveUrlTitle(PassportJsbWebView passportJsbWebView, String str) {
    }

    @Override // com.xiaomi.passport.ui.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        PassportJsbWebView passportJsbWebView = this.mWebView;
        if (passportJsbWebView == null || !passportJsbWebView.isDestroyed()) {
            return;
        }
        initWebViewAndLoadUrl(this.mWebView.getDestroyedStateBundle());
    }

    public void onRetryClicked(View view) {
        loadWebUrl();
    }

    @Override // androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PassportJsbWebView passportJsbWebView = this.mWebView;
        if (passportJsbWebView != null) {
            passportJsbWebView.saveState(bundle);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        PassportJsbWebPageLifecycleListener passportJsbWebPageLifecycleListener = this.mPageConfig.pageLifecycleListener;
        if (passportJsbWebPageLifecycleListener != null) {
            passportJsbWebPageLifecycleListener.onPageShown(this);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        PassportJsbWebPageLifecycleListener passportJsbWebPageLifecycleListener = this.mPageConfig.pageLifecycleListener;
        if (passportJsbWebPageLifecycleListener != null) {
            passportJsbWebPageLifecycleListener.onPageHidden(this);
        }
        super.onStop();
    }

    public void showLoadingDialog() {
        if (this.mLoadingDialog == null) {
            PassportDialog passportDialog = new PassportDialog(this);
            this.mLoadingDialog = passportDialog;
            passportDialog.setLoadingProgressVisible(true).setMessage(getString(R.string.passport_dialog_loading));
        }
        this.mLoadingDialog.show();
    }

    public static Intent makeIntent(Context context, PassportJsbWebViewPageConfig passportJsbWebViewPageConfig) {
        Intent intent = new Intent(context, (Class<?>) PassportJsbWebViewActivity.class);
        intent.putExtras(passportJsbWebViewPageConfig.fillBundle(new Bundle()));
        return intent;
    }
}
