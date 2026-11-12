package com.mipay.sdk.app;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatDelegate;
import com.mipay.sdk.IMipayAccountProvider;
import com.mipay.sdk.Mipay;
import com.mipay.sdk.MipaySdkConfig;
import com.mipay.sdk.component.ImmersionListPopupWindow;
import com.mipay.sdk.util.MipayWebSdkUtils;
import com.mipay.sdk.util.NavBarUtils;
import com.mipay.sdk.util.StatusBarUtils;
import com.mipay.sdk.util.WBH5FaceVerifySDK;
import com.mipay.sdk.web.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import miuipub.hybrid.PageContext;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class MipayWebActivity extends MipayHybridActivity {
    private static final int INVALID_PADDING = Integer.MIN_VALUE;
    private static final String MIPAY_SDK_VERSION = "3.2.5";
    private static final int MSG_LOAD_URL = 1;
    public static final int REQUEST_CODE_CHOOSE_FILE = 1001;
    public static final int REQUEST_CODE_SELECT_IMAGE = 1000;
    private static final int SHOW_WEBVIEW_DELAY = 500;
    private static final String TAG = "MipayWeb_HybridActivity";
    private View mActionBarView;
    private ImageView mActionMoreView;
    private boolean mHasCurrentPermissionsRequest;
    private ImageSelector mImageSelector;
    private ImmersionListPopupWindow mMenuView;
    private OptionsItemClickListener mOptionsItemClickListener;
    private Intent mResultData;
    private View mRootView;
    private TextView mTitleView;
    WebView mWebView;
    private LoginState mLoginState = LoginState.LOAD_ING;
    private List<MenuData> mMenuList = new ArrayList();
    private int mDefaultActionBarPaddingStart = Integer.MIN_VALUE;
    private int mDefaultActionBarPaddingEnd = Integer.MIN_VALUE;
    private Handler mHandler = new Handler() { // from class: com.mipay.sdk.app.MipayWebActivity.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                String str = (String) message.obj;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                MipayWebActivity mipayWebActivity = MipayWebActivity.this;
                if (mipayWebActivity.mWebView != null) {
                    if (mipayWebActivity.isNightMode() != MipayWebSdkUtils.isNightMode(MipayWebActivity.this)) {
                        MipayWebActivity.this.recreate();
                    } else {
                        MipayWebActivity.this.mWebView.loadUrl(str);
                    }
                }
            }
        }
    };
    private final AccountManagerCallback<Bundle> mAuthTokenCallBack = new AccountManagerCallback<Bundle>() { // from class: com.mipay.sdk.app.MipayWebActivity.8
        @Override // android.accounts.AccountManagerCallback
        public void run(AccountManagerFuture<Bundle> accountManagerFuture) {
            try {
                String string = accountManagerFuture.getResult().getString("authtoken");
                if (MipayWebActivity.this.mLoginState == LoginState.DESTROY || TextUtils.isEmpty(string)) {
                    return;
                }
                MipayWebActivity.this.mWebView.loadUrl(string);
            } catch (Exception unused) {
            }
        }
    };
    private boolean mIsBacking = false;
    private List<ResultCallback> mCallbacks = new ArrayList();

    public enum LoginState {
        LOAD_ING,
        LOGIN_ING,
        LOGIN_FINISHING,
        LOGIN_FINISHED,
        LOAD_FINISHED,
        DESTROY
    }

    public interface OptionsItemClickListener {
        void onClick(int i);
    }

    public interface ResultCallback {
        void onResult(int i, int i2, Intent intent);
    }

    private void appendUA(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String userAgentString = this.mWebView.getSettings().getUserAgentString();
        this.mWebView.getSettings().setUserAgentString(userAgentString.trim() + " " + str.trim());
    }

    private Bundle convertJson2Map(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof Integer) {
                    bundle.putString(next, obj.toString());
                } else if (obj instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                } else if (obj instanceof String) {
                    bundle.putString(next, (String) obj);
                }
            }
            return bundle;
        } catch (JSONException unused) {
            return null;
        }
    }

    private void goBack() {
        this.mIsBacking = true;
        this.mWebView.goBack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideProgressView() {
    }

    private void initView() {
        this.mRootView = findViewById(R.id.ll_root_mipay_web);
        this.mActionBarView = findViewById(R.id.rl_actionbar_mipay_sdk_web);
        this.mTitleView = (TextView) findViewById(R.id.tv_title_actionbar);
        findViewById(R.id.iv_back_actionbar).setOnClickListener(new View.OnClickListener() { // from class: com.mipay.sdk.app.MipayWebActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                WebView webView = MipayWebActivity.this.mWebView;
                if (webView == null || !webView.canGoBack()) {
                    MipayWebActivity.this.onBackPressed();
                } else {
                    MipayWebActivity.this.mWebView.goBack();
                }
            }
        });
        findViewById(R.id.iv_close_actionbar).setOnClickListener(new View.OnClickListener() { // from class: com.mipay.sdk.app.MipayWebActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MipayWebActivity.this.finish();
            }
        });
        this.mActionMoreView = (ImageView) findViewById(R.id.iv_extend_actionbar);
        WebView webView = (WebView) findViewById(R.id.wv_mipay_web);
        this.mWebView = webView;
        webView.setBackgroundColor(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isNightMode() {
        MipaySdkConfig.UI_MODE uiMode = MipaySdkConfig.getUiMode();
        if (uiMode == MipaySdkConfig.UI_MODE.DARK) {
            return true;
        }
        if (uiMode == MipaySdkConfig.UI_MODE.LIGHT) {
            return false;
        }
        return MipayWebSdkUtils.isNightMode(this);
    }

    private Intent makeResult(int i, String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("code", i);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("message", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                intent.putExtra("result", convertJson2Map(new JSONObject(str2)));
            } catch (JSONException unused) {
                intent.putExtra("result", str2);
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", i);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("message", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("result", str2);
            }
        } catch (JSONException unused2) {
        }
        intent.putExtra(Mipay.KEY_FULL_RESULT, jSONObject.toString());
        return intent;
    }

    private void setActionBarPadding() {
        int dimensionPixelSize = MipayWebSdkUtils.getDisplayWidthDp(this) >= 600 ? getResources().getDimensionPixelSize(R.dimen.mipay_sdk_web_extra_padding) : 0;
        if (this.mDefaultActionBarPaddingStart == Integer.MIN_VALUE) {
            this.mDefaultActionBarPaddingStart = this.mActionBarView.getPaddingStart();
        }
        if (this.mDefaultActionBarPaddingEnd == Integer.MIN_VALUE) {
            this.mDefaultActionBarPaddingEnd = this.mActionBarView.getPaddingEnd();
        }
        int paddingStart = this.mActionBarView.getPaddingStart();
        int i = this.mDefaultActionBarPaddingStart;
        if (paddingStart == i + dimensionPixelSize) {
            return;
        }
        View view = this.mActionBarView;
        view.setPadding(i + dimensionPixelSize, view.getPaddingTop(), this.mDefaultActionBarPaddingEnd + dimensionPixelSize, this.mActionBarView.getPaddingBottom());
    }

    private void setBackgroundColor(int i) {
        View view = this.mRootView;
        if (view == null) {
            return;
        }
        view.setBackgroundColor(i);
    }

    private void setUIMode() {
        AppCompatDelegate delegate = getDelegate();
        MipaySdkConfig.UI_MODE uiMode = MipaySdkConfig.getUiMode();
        if (uiMode == MipaySdkConfig.UI_MODE.DARK) {
            delegate.I(2);
        } else if (uiMode == MipaySdkConfig.UI_MODE.LIGHT) {
            delegate.I(1);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface"})
    private void setupWebView() {
        WebSettings settings = this.mWebView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setAllowContentAccess(false);
        this.mWebView.addJavascriptInterface(new MipayJsInterface(this), MipayJsInterface.MIPAY_WEB_INTERFACE);
        appendUA("XiaoMi/MiuiBrowser/4.3");
        appendUA("MipaySdk/3.2.5");
        this.mWebView.setWebViewClient(new WebViewClient() { // from class: com.mipay.sdk.app.MipayWebActivity.7
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                StringBuilder sb = new StringBuilder();
                sb.append("page finished, state: ");
                sb.append(MipayWebActivity.this.mLoginState);
                MipayWebActivity.this.mIsBacking = false;
                if (MipayWebActivity.this.mLoginState == LoginState.LOGIN_FINISHING) {
                    MipayWebActivity.this.mLoginState = LoginState.LOGIN_FINISHED;
                    MipayWebActivity.this.mWebView.postDelayed(new Runnable() { // from class: com.mipay.sdk.app.MipayWebActivity.7.1
                        @Override // java.lang.Runnable
                        public void run() {
                            MipayWebActivity.this.hideProgressView();
                        }
                    }, 500L);
                } else if (MipayWebActivity.this.mLoginState == LoginState.LOAD_ING) {
                    MipayWebActivity.this.hideProgressView();
                    MipayWebActivity.this.mLoginState = LoginState.LOAD_FINISHED;
                }
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                StringBuilder sb = new StringBuilder();
                sb.append("page start, state: ");
                sb.append(MipayWebActivity.this.mLoginState);
                PageContext pageContext = new PageContext();
                pageContext.setId(UUID.randomUUID().toString());
                pageContext.setUrl(str);
                MipayWebActivity.this.setPageContext(pageContext);
                if (MipayWebActivity.this.mLoginState == LoginState.LOAD_ING) {
                    MipayWebActivity.this.showProgressView();
                } else if (MipayWebActivity.this.mLoginState == LoginState.LOGIN_ING) {
                    MipayWebActivity.this.mLoginState = LoginState.LOGIN_FINISHING;
                }
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
                StringBuilder sb = new StringBuilder();
                sb.append("received login request, isBacking: ");
                sb.append(MipayWebActivity.this.mIsBacking);
                if (MipayWebActivity.this.mIsBacking) {
                    if (webView.canGoBack()) {
                        webView.goBack();
                        return;
                    } else {
                        MipayWebActivity.this.finish();
                        return;
                    }
                }
                if (TextUtils.equals(str, "com.xiaomi")) {
                    IMipayAccountProvider iMipayAccountProvider = AccountProviderHolder.get();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("account provider is null: ");
                    sb2.append(iMipayAccountProvider == null);
                    if (iMipayAccountProvider != null) {
                        Account[] accountsByType = iMipayAccountProvider.getAccountsByType("com.xiaomi");
                        Account account = accountsByType.length != 0 ? accountsByType[0] : null;
                        if (account != null) {
                            MipayWebActivity.this.mLoginState = LoginState.LOGIN_ING;
                            MipayWebActivity.this.showProgressView();
                            iMipayAccountProvider.getAuthToken(account, "weblogin:" + str3, (Bundle) null, true, MipayWebActivity.this.mAuthTokenCallBack, (Handler) null);
                        }
                    }
                }
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (!UrlResolver.isOpenableUrl(str)) {
                    return false;
                }
                Context context = webView.getContext();
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.addCategory("android.intent.category.BROWSABLE");
                ResolveInfo resolveInfoCheckIsOpenableIntent = UrlResolver.checkIsOpenableIntent(context, intent);
                if (resolveInfoCheckIsOpenableIntent == null || resolveInfoCheckIsOpenableIntent.activityInfo == null) {
                    return false;
                }
                context.startActivity(intent);
                return true;
            }
        });
        this.mWebView.setWebChromeClient(new SDKWebChromeClient(this));
        WBH5FaceVerifySDK.getInstance().setWebViewSettings(this.mWebView, getApplicationContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showProgressView() {
    }

    private void showToast(String str) {
        Toast.makeText(this, str, 1).show();
    }

    public void addResultCallback(ResultCallback resultCallback) {
        this.mCallbacks.add(resultCallback);
    }

    @Override // com.mipay.sdk.app.MipayHybridActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        StringBuilder sb = new StringBuilder();
        sb.append("onActivityResult req : ");
        sb.append(i);
        sb.append(" ; res : ");
        sb.append(i2);
        if (i == 1000) {
            ImageSelector imageSelector = this.mImageSelector;
            if (imageSelector != null) {
                imageSelector.onResult(i2, intent);
            }
        } else {
            WBH5FaceVerifySDK.getInstance().receiveH5FaceVerifyResult(i, i2, intent);
        }
        Iterator<ResultCallback> it = this.mCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onResult(i, i2, intent);
        }
    }

    @Override // androidx.p004activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.mWebView.canGoBack()) {
            goBack();
        } else if (this.mResultData != null) {
            finish();
        } else {
            setResult(0, makeResult(2, "user canceled", null));
            finish();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setActionBarPadding();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setUIMode();
        super.onCreate(bundle);
        setContentView(R.layout.activity_mipay_web);
        boolean zIsNightMode = isNightMode();
        StringBuilder sb = new StringBuilder();
        sb.append("on create is night : ");
        sb.append(zIsNightMode);
        StatusBarUtils.setStatusColor(this, true, !zIsNightMode, zIsNightMode ? -16777216 : -1);
        NavBarUtils.setNavBarTranslucent(getWindow(), true);
        initView();
        setupWebView();
        initHybridInterface(this.mWebView);
        String stringExtra = getIntent().getStringExtra(WebConstants.KEY_URL);
        if (TextUtils.isEmpty(stringExtra)) {
            setResult(0, makeResult(7, "url is empty", null));
            finish();
        } else {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = stringExtra;
            this.mHandler.sendMessageDelayed(messageObtain, 10L);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.clear();
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.mipay.sdk.app.MipayHybridActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.mImageSelector != null) {
            this.mImageSelector = null;
        }
        this.mHandler.removeCallbacksAndMessages(null);
        this.mLoginState = LoginState.DESTROY;
        this.mWebView.removeAllViews();
        this.mWebView.destroy();
        this.mCallbacks.clear();
    }

    @Override // com.mipay.sdk.app.MipayHybridActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        setActionBarPadding();
    }

    public void removeCallback(ResultCallback resultCallback) {
        this.mCallbacks.remove(resultCallback);
    }

    public void removeMenu() {
        ImageView imageView = this.mActionMoreView;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(4);
        this.mMenuList.clear();
        this.mOptionsItemClickListener = null;
    }

    @TargetApi(23)
    public void requestPerms(String[] strArr, int i) {
        if (this.mHasCurrentPermissionsRequest) {
            onRequestPermissionsResult(i, new String[0], new int[0]);
            return;
        }
        this.mHasCurrentPermissionsRequest = true;
        requestPermissions(strArr, i);
        this.mHasCurrentPermissionsRequest = false;
    }

    public void setActionBarBg(int i) {
        setBackgroundColor(i);
    }

    public void setResult(String str) {
        String strOptString;
        String strOptString2 = "user canceled";
        int i = 2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i = jSONObject.getInt("code");
            strOptString2 = jSONObject.optString("message");
            strOptString = jSONObject.optString("result");
        } catch (JSONException unused) {
            strOptString = null;
        }
        Intent intentMakeResult = makeResult(i, strOptString2, strOptString);
        this.mResultData = intentMakeResult;
        if (i == 0) {
            setResult(-1, intentMakeResult);
        } else {
            setResult(0, intentMakeResult);
        }
    }

    @Override // android.app.Activity
    public void setTitle(CharSequence charSequence) {
        TextView textView = this.mTitleView;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void setupMenu(boolean z, final List<MenuData> list, OptionsItemClickListener optionsItemClickListener) {
        ImageView imageView;
        if (list == null || list.size() == 0 || optionsItemClickListener == null || (imageView = this.mActionMoreView) == null) {
            return;
        }
        imageView.setVisibility(0);
        this.mActionMoreView.setImageResource(z ? R.drawable.mipay_sdk_web_actionbar_more : R.drawable.mipay_sdk_web_actionbar_faq);
        this.mMenuList.clear();
        this.mMenuList.addAll(list);
        this.mOptionsItemClickListener = optionsItemClickListener;
        if (!z) {
            this.mActionMoreView.setOnClickListener(new View.OnClickListener() { // from class: com.mipay.sdk.app.MipayWebActivity.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (MipayWebActivity.this.mOptionsItemClickListener != null) {
                        MipayWebActivity.this.mOptionsItemClickListener.onClick(((MenuData) list.get(0)).mItemId);
                    }
                }
            });
            return;
        }
        ImmersionListPopupWindow immersionListPopupWindow = new ImmersionListPopupWindow(this);
        this.mMenuView = immersionListPopupWindow;
        immersionListPopupWindow.setData(list);
        this.mMenuView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.mipay.sdk.app.MipayWebActivity.4
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (MipayWebActivity.this.mOptionsItemClickListener != null) {
                    MipayWebActivity.this.mOptionsItemClickListener.onClick(((MenuData) list.get(i)).mItemId);
                }
            }
        });
        this.mActionMoreView.setOnClickListener(new View.OnClickListener() { // from class: com.mipay.sdk.app.MipayWebActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MipayWebActivity.this.mMenuView.show(view);
            }
        });
    }
}
