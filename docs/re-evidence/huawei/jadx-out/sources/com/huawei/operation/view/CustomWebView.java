package com.huawei.operation.view;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebHistoryItem;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.hidatamanager.util.LogUtils;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.R;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.operation.adapter.AchievementShareCallback;
import com.huawei.operation.adapter.CloseWebCallback;
import com.huawei.operation.adapter.JsDataCallback;
import com.huawei.operation.adapter.OnActivityQuitCallback;
import com.huawei.operation.adapter.OnActivityShowButtonCallback;
import com.huawei.operation.adapter.OnCaptureExtCallback;
import com.huawei.operation.adapter.OnHealthDataCallback;
import com.huawei.operation.adapter.OnLoginCallback;
import com.huawei.operation.adapter.OnVmallCouponCallback;
import com.huawei.operation.adapter.OnWebViewStatusCallback;
import com.huawei.operation.adapter.PluginOperationAdapter;
import com.huawei.operation.adapter.SendCurrentUrlCallback;
import com.huawei.operation.adapter.SendNoNetMsgCallback;
import com.huawei.operation.adapter.SendServerErrorMsgCallback;
import com.huawei.operation.adapter.SetFullscreenCallback;
import com.huawei.operation.adapter.SetLeftBtnArrowTypeCallback;
import com.huawei.operation.adapter.SetShareDataCallback;
import com.huawei.operation.adapter.SetTitleCallback;
import com.huawei.operation.adapter.ShareCallback;
import com.huawei.operation.adapter.SleepQuestionnaireCallback;
import com.huawei.operation.adapter.SportsStatisticsCallback;
import com.huawei.operation.adapter.StartAppSettingPage;
import com.huawei.operation.adapter.StartFitnessPageCallback;
import com.huawei.operation.adapter.StartGpsTrackPageCallback;
import com.huawei.operation.adapter.StartMiniShopWebPage;
import com.huawei.operation.adapter.StartSportPage;
import com.huawei.operation.adapter.StartWebPage;
import com.huawei.operation.adapter.ToastCallback;
import com.huawei.operation.adapter.TouchSignalCallback;
import com.huawei.operation.adapter.UpdateCustomTitleBarCallback;
import com.huawei.operation.adapter.VmallArgSignCallback;
import com.huawei.operation.adapter.VmallLoginCallback;
import com.huawei.operation.beans.TitleBean;
import com.huawei.operation.beans.WebViewConfig;
import com.huawei.operation.h5pro.TrustListCheckerImpl;
import com.huawei.operation.js.InJavaScriptLocalObj;
import com.huawei.operation.js.JsInteraction;
import com.huawei.operation.myhuawei.MyHuaweiLogin;
import com.huawei.operation.operation.PluginOperation;
import com.huawei.operation.share.CaptureUtils;
import com.huawei.operation.share.ShareConfig;
import com.huawei.operation.share.ShareConfigCallback;
import com.huawei.operation.utils.ActivityHtmlPathApi;
import com.huawei.operation.utils.CasLoginUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.operation.utils.InformationBiOperate;
import com.huawei.operation.utils.KakaTaskUtils;
import com.huawei.operation.utils.UriConstants;
import com.huawei.operation.utils.Utils;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.operation.utils.WebViewUtils;
import com.huawei.operation.vmall.AuthVmall;
import com.huawei.pluginbase.PluginBaseAdapter;
import com.huawei.profile.profile.ProfileExtendConstants;
import com.huawei.secure.android.common.ssl.WebViewSSLCheck;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import defpackage.gxt;
import defpackage.lmf;
import defpackage.lrp;
import defpackage.lsy;
import defpackage.njy;
import defpackage.qqs;
import defpackage.qqw;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class CustomWebView implements SetTitleCallback, ShareCallback, AchievementShareCallback, ToastCallback, JsDataCallback, StartGpsTrackPageCallback, StartFitnessPageCallback, TouchSignalCallback, StartMiniShopWebPage, StartWebPage, StartAppSettingPage, CloseWebCallback, SendServerErrorMsgCallback, SendNoNetMsgCallback, SendCurrentUrlCallback, OnLoginCallback, ShareConfigCallback, OnWebViewStatusCallback, OnActivityQuitCallback, OnVmallCouponCallback, SleepQuestionnaireCallback, VmallArgSignCallback, VmallLoginCallback, OnCaptureExtCallback, OnActivityShowButtonCallback, UpdateCustomTitleBarCallback, SetFullscreenCallback, SetLeftBtnArrowTypeCallback, SetShareDataCallback, StartSportPage, SportsStatisticsCallback, OnHealthDataCallback {
    public static final String APP_MARKET_TITLE = "应用市场";
    private static final String CONTENT_TYPE_HTML = "text/html";
    private static final String PATH_VMALL_INDEX = "/index.html";
    private static final String PERSONAL = "/personal";
    private static final String TAG = "PluginOperation_CustomWebView";
    private static String sWebViewUrl;
    private Pattern mAchieveMedalPattern;
    private Activity mActivity;
    private PluginOperationAdapter mAdapter;
    private String mAppVersion;
    private Context mContext;
    private CustomViewDialog mCustomViewDialog;
    private String mFromWhere;
    private Handler mHandler;
    private Uri mImageUri;
    private InformationBiOperate mInformationBiOperate;
    private boolean mIsLoadMyHuaweiFail;
    private StringBuilder mJsFunctionBack;
    private StringBuilder mJsFunctionSecondBack;
    private StringBuilder mJsFunctionThirdBack;
    private JsInteraction mJsInteraction;
    private String mMobileVmallDetailHost;
    private String mMobileVmallHost;
    private WebViewClientImpl mMyWebViewClientImpl;
    private HealthProgressBar mProgressBar;
    private ShareConfig mShareConfig;
    private TextView mTextTitle;
    private int mType;
    private ValueCallback<Uri[]> mUploadMessageForAndroid5;
    private ArrayList<String> mUrlLists;
    private WebView mWebView;
    private WebViewConfig mWebViewConfig;
    private String mWebViewStatusFunction;
    private List<String> mWebViewTitles;
    private String sBiCurrentUrl;
    private static final Set<String> BLACK_URL = new HashSet();
    private static final Set<String> SAME_BLACK_URL = new HashSet();
    private static final ArrayList<String> BLACK_URL_LIST = new ArrayList<>();
    private static boolean sIsWebViewNoFirstLogin = false;
    public static final List<String> BROWSER_URIS = CustomWebView$$ExternalSyntheticBackport0.m(new Object[]{"member/invoice/dl", "member/order/dl"});
    private static Handler sInnerHandler = new Handler() { // from class: com.huawei.operation.view.CustomWebView.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 4001) {
                return;
            }
            boolean unused = CustomWebView.sIsWebViewNoFirstLogin = false;
        }
    };
    private boolean isVmallLogingIn = false;
    private boolean mIsHasLoginCallbackUrl = false;
    private boolean mIsHasVmallSignUrl = false;
    private boolean mIsVmallCouponPage = false;
    private boolean mIsAuthVmall = false;
    private long mLastVmallRemoteLoginTime = 0;
    private String mUnsafeUrl = "";
    private String mOriginUrl = "";
    private String mVmallUrl = null;
    private String mRegisterVmallCouponFunctionRes = "";
    private String mRegisterActivityQuitFunctionRes = "";
    private String mRegisterActivityShareFunctionRes = "";
    private String mCurrentUrl = null;
    private String mCaptureFunction = "";
    private FrameLayout mFrameLayout = null;
    private long mLoadStartTime = 0;
    private long mLoadEndTime = 0;
    private String mAnnualUrlPre = "";
    private boolean mIsInformation = false;
    private AtomicBoolean mHasLoadedStart = new AtomicBoolean(false);
    private boolean mIsCoreJsMounted = false;
    private boolean mIsFirstLoadMyHuawei = true;

    public CustomWebView(Context context, HealthProgressBar healthProgressBar, WebView webView, Handler handler, int i) {
        this.mType = -1;
        this.mAppVersion = null;
        this.mType = i;
        this.mContext = context;
        this.mHandler = handler;
        this.mWebView = webView;
        this.mProgressBar = healthProgressBar;
        this.mActivity = context instanceof Activity ? (Activity) context : null;
        PluginBaseAdapter adapter = PluginOperation.getInstance(context).getAdapter();
        this.mAdapter = adapter instanceof PluginOperationAdapter ? (PluginOperationAdapter) adapter : null;
        this.mShareConfig = new ShareConfig(this.mContext, handler);
        this.mInformationBiOperate = new InformationBiOperate(context);
        PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
        if (pluginOperationAdapter == null) {
            LogUtil.a(TAG, "PluginOperationAdapter is null");
            return;
        }
        this.mAppVersion = pluginOperationAdapter.getInfo(new String[]{"getAppInfo"}).get("grayVersion");
        this.mWebViewTitles = Collections.synchronizedList(new ArrayList(10));
        this.mUrlLists = new ArrayList<>(10);
        initWebViewSettings();
        InJavaScriptLocalObj inJavaScriptLocalObj = new InJavaScriptLocalObj();
        inJavaScriptLocalObj.setVmallLoginCallback(this);
        this.mWebView.addJavascriptInterface(inJavaScriptLocalObj, Constants.JAVA_APP_MARKET_OBJECT);
        registerCoreJsInterface();
        InJavaScriptLocalObj inJavaScriptLocalObj2 = new InJavaScriptLocalObj();
        inJavaScriptLocalObj2.setVmallLoginCallback(this);
        this.mWebView.addJavascriptInterface(inJavaScriptLocalObj2, Constants.JAVA_OBJ);
        initJsFuctionBackStringBuilder();
        this.mWebView.addJavascriptInterface(this, "override_back_btn_click");
    }

    private void registerCoreJsInterface() {
        JsInteraction jsInteraction = new JsInteraction(this.mContext);
        this.mJsInteraction = jsInteraction;
        jsInteraction.setShareCallback(this, this, this);
        this.mJsInteraction.setWidgetCallback(this, this, this);
        this.mJsInteraction.setTouchCallback(this, this, this);
        this.mJsInteraction.setSendCallback(this, this, this);
        this.mJsInteraction.setVmallCallback(this, this, this, this);
        this.mJsInteraction.setActivityShareButtonCallback(this);
        this.mJsInteraction.setStarCallback(this, this);
        this.mJsInteraction.setStarAndEndCallback(this, this, this, this);
        this.mJsInteraction.setTitleBarCallback(this, this, this, this);
        this.mJsInteraction.setStartSportPageCallback(this);
        this.mJsInteraction.setSportsStatisticsCallback(this);
        this.mJsInteraction.setOnHealthDataCallback(this);
        this.mWebView.addJavascriptInterface(this.mJsInteraction, "JsInteraction");
        this.mIsCoreJsMounted = true;
    }

    public void onDestroy() {
        JsInteraction jsInteraction = this.mJsInteraction;
        if (jsInteraction != null) {
            jsInteraction.onDestroy();
            this.mJsInteraction = null;
        }
    }

    private void initJsFuctionBackStringBuilder() {
        StringBuilder sb = new StringBuilder(Constants.JAVA_SCRIPT);
        this.mJsFunctionBack = sb;
        sb.append("(function(){document.getElementById('");
        sb.append("btn-back");
        sb.append("').onclick=function(){window.");
        sb.append("override_back_btn_click");
        sb.append(".jsBack();return false}})()");
        StringBuilder sb2 = new StringBuilder(Constants.JAVA_SCRIPT);
        this.mJsFunctionSecondBack = sb2;
        sb2.append("(function(){$('#");
        sb2.append("top-header-1");
        sb2.append(" #");
        sb2.append("btn-back");
        sb2.append("')[0].onclick=function(){window.");
        sb2.append("override_back_btn_click");
        sb2.append(".jsBack();return false}})()");
        StringBuilder sb3 = new StringBuilder(Constants.JAVA_SCRIPT);
        this.mJsFunctionThirdBack = sb3;
        sb3.append("(function(){");
        sb3.append("var bindBackTimer = setTimeout(function(){");
        sb3.append("var vmallTitleBar = document.getElementById('myVmallTitle');");
        sb3.append("if (!vmallTitleBar) { return;}");
        sb3.append("var vmallBack = vmallTitleBar.getElementsByClassName('icon-common icon-ic_public_back');");
        sb3.append("if (!vmallBack || vmallBack.length < 1) {return;}");
        sb3.append("vmallBack[0].onclick = function(){");
        sb3.append("window.override_back_btn_click.jsBack();return false;};");
        sb3.append("clearTimeout(bindBackTimer);");
        sb3.append("}, 800)})()");
    }

    public void setInformationFlag(boolean z) {
        this.mIsInformation = z;
    }

    public static void setLoginStatus(boolean z) {
        sIsWebViewNoFirstLogin = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVmallPressBackListner(String str) {
        if (this.mIsHasVmallSignUrl) {
            LogUtil.a(TAG, "addVmallPressBackListner enter!");
            if (TextUtils.isEmpty(this.mJsFunctionBack) || TextUtils.isEmpty(this.mJsFunctionSecondBack) || TextUtils.isEmpty(this.mJsFunctionThirdBack)) {
                initJsFuctionBackStringBuilder();
            }
            this.mWebView.loadUrl(this.mJsFunctionBack.toString());
            this.mWebView.loadUrl(this.mJsFunctionSecondBack.toString());
            this.mWebView.loadUrl(this.mJsFunctionThirdBack.toString());
        }
    }

    @JavascriptInterface
    public void jsBack() {
        if (this.mWebView == null) {
            LogUtil.j(TAG, "jsBack mWebView null ");
            return;
        }
        Activity activity = this.mActivity;
        if (activity == null) {
            LogUtil.j(TAG, "jsBack mActivity null ");
        } else {
            activity.runOnUiThread(new Runnable() { // from class: com.huawei.operation.view.CustomWebView.2
                @Override // java.lang.Runnable
                public void run() {
                    if (!CustomWebView.this.isTop()) {
                        if (!CustomWebView.this.mWebView.canGoBack()) {
                            LogUtil.a(CustomWebView.TAG, "mWebView JsBack false");
                            CustomWebView.this.mActivity.finish();
                            return;
                        } else {
                            LogUtil.a(CustomWebView.TAG, "mWebView JsBack true");
                            CustomWebView.this.loadUrl();
                            return;
                        }
                    }
                    LogUtil.a(CustomWebView.TAG, "mWebView JsBack isTop");
                    CustomWebView.this.mActivity.finish();
                }
            });
        }
    }

    public void initFrameLayout(Context context, FrameLayout frameLayout) {
        if (context instanceof Activity) {
            this.mActivity = (Activity) context;
        }
        this.mFrameLayout = frameLayout;
    }

    public String getWebViewTitles() {
        if (njy.e(this.mWebViewTitles)) {
            return "";
        }
        List<String> list = this.mWebViewTitles;
        return list.get(list.size() - 1);
    }

    public void setFromWhere(String str) {
        if (str == null) {
            LogUtil.j(TAG, "setFromWhere fromWhere is null");
        } else {
            this.mFromWhere = str;
        }
    }

    public void setMyWebViewClientImpl(WebViewClientImpl webViewClientImpl) {
        this.mMyWebViewClientImpl = webViewClientImpl;
    }

    public String getRegisterActivityQuitFunctionRes() {
        return this.mRegisterActivityQuitFunctionRes;
    }

    public void setRegisterActivityQuitFunctionRes(String str) {
        this.mRegisterActivityQuitFunctionRes = str;
    }

    public String getmRegisterActivityShareFunctionRes() {
        return this.mRegisterActivityShareFunctionRes;
    }

    public void setmRegisterActivityShareFunctionRes(String str) {
        this.mRegisterActivityShareFunctionRes = str;
    }

    public String getRegisterVmallCouponFunctionRes() {
        return this.mRegisterVmallCouponFunctionRes;
    }

    private void setRegisterVmallCouponFunctionRes(String str) {
        this.mRegisterVmallCouponFunctionRes = str;
    }

    public void clear() {
        Handler handler = sInnerHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public CustomViewDialog getCustomViewDialog() {
        LogUtil.a(TAG, "getCustomViewDialog");
        return this.mCustomViewDialog;
    }

    public void setCustomViewDialog(CustomViewDialog customViewDialog) {
        LogUtil.a(TAG, "setCustomViewDialog");
        this.mCustomViewDialog = customViewDialog;
    }

    public ValueCallback<Uri[]> getUploadMessageForAndroid5() {
        LogUtil.a(TAG, "getUploadMessageForAndroid5");
        return this.mUploadMessageForAndroid5;
    }

    public void setUploadMessageForAndroid5(ValueCallback<Uri[]> valueCallback) {
        LogUtil.a(TAG, "setUploadMessageForAndroid5");
        this.mUploadMessageForAndroid5 = valueCallback;
    }

    public Uri getImageUri() {
        LogUtil.a(TAG, "getImageUri");
        return this.mImageUri;
    }

    private void initWebViewSettings() {
        LogUtil.a(TAG, "initWebViewSettings");
        WebSettings settings = this.mWebView.getSettings();
        if (CommonUtil.ab(this.mContext)) {
            settings.setCacheMode(-1);
        } else {
            settings.setCacheMode(1);
        }
        settings.setAllowFileAccess(false);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setLoadWithOverviewMode(true);
        String userAgentString = this.mWebView.getSettings().getUserAgentString();
        this.mWebView.getSettings().setUserAgentString(userAgentString + "; HuaweiHealth; HuaweiHealthV2");
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setUseWideViewPort(false);
        settings.setTextZoom(100);
        settings.setSavePassword(false);
        settings.setGeolocationEnabled(false);
        settings.setAllowContentAccess(false);
        settings.setLoadWithOverviewMode(true);
        settings.setBlockNetworkImage(false);
        settings.setMixedContentMode(2);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.mWebView, true);
        initWebViewSettingsEvent();
    }

    private void initWebViewSettingsEvent() {
        if (!CommonUtil.ap() && !CommonUtil.af(this.mContext)) {
            WebView.setWebContentsDebuggingEnabled(true);
            LogUtil.a(TAG, "initWebViewSettingsEvent setWebContentsDebuggingEnabled");
        }
        this.mWebView.setOnKeyListener(new View.OnKeyListener() { // from class: com.huawei.operation.view.CustomWebView.3
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                LogUtil.a(CustomWebView.TAG, "keyCode", Integer.valueOf(i), Integer.valueOf(keyEvent.getAction()));
                if (keyEvent.getAction() != 1 || i != 4) {
                    return false;
                }
                if (CustomWebView.this.mAdapter != null) {
                    if (CustomWebView.this.mAdapter.canFinish(CustomWebView.this.mActivity) != 1) {
                        if (CustomWebView.this.mAdapter.canFinish(CustomWebView.this.mActivity) == 2) {
                            LogUtil.a(CustomWebView.TAG, "breathe show stop dialog");
                            return true;
                        }
                        LogUtil.d(CustomWebView.TAG, "initWebViewSettingsEvent mAdapter.canFinish(mActivity) result not 1 2");
                    } else {
                        LogUtil.a(CustomWebView.TAG, "breathe finish activity");
                        CustomWebView.this.mActivity.finish();
                        return true;
                    }
                }
                CustomWebView.this.callbackWebViewStatus(Constants.WEBVIEW_STATUS_BACK);
                if (CustomWebView.this.mWebView.canGoBack()) {
                    if (CustomWebView.this.mIsHasVmallSignUrl) {
                        if (!CustomWebView.this.isTop()) {
                            CustomWebView.this.loadUrl();
                            return true;
                        }
                        LogUtil.a(CustomWebView.TAG, "mIsHasVmallSignUrl KeyEvent setResult");
                        CustomWebView.this.mActivity.setResult(-1);
                        return false;
                    }
                    if (CustomWebView.this.appGoBack()) {
                        return true;
                    }
                    LogUtil.a(CustomWebView.TAG, "KeyEvent mWebView.canGoBack");
                    return CustomWebView.this.processBack();
                }
                LogUtil.a(CustomWebView.TAG, "mWebView KeyEvent setResult");
                CustomWebView.this.mActivity.setResult(-1);
                return false;
            }
        });
        this.mWebView.setWebChromeClient(new WebChromeClientBase());
        this.mWebView.setWebViewClient(new WebViewClientBase());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean appGoBack() {
        String str = this.mFromWhere;
        if (str == null || !"appMarket".equals(str)) {
            return false;
        }
        LogUtil.a(TAG, "mFromWhere");
        Handler handler = this.mHandler;
        if (handler == null) {
            return true;
        }
        handler.sendEmptyMessage(Constants.APP_MARKET_WEB_VIEW_BACK);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean processBack() {
        LogUtil.a(TAG, "processBack WebView go back");
        if (!isWhiteUrl(WebViewUtils.replaceSpace(this.mWebView.getUrl()))) {
            setJsEnable(false);
            return false;
        }
        setJsEnable(true);
        if (this.mIsHasVmallSignUrl || this.mIsHasLoginCallbackUrl) {
            if (isTop()) {
                LogUtil.a(TAG, "processBack mIsHasVmallSignUrl, do history update self!");
                this.mActivity.finish();
                return false;
            }
            loadUrl();
            return true;
        }
        this.mWebView.goBack();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    public void setBrowserTitle(String str) {
        String str2 = "";
        if (str == null) {
            LogUtil.a(TAG, "setBrowserTitle title is null!");
            str = "";
        }
        if (TextUtils.equals(APP_MARKET_TITLE, str)) {
            LogUtil.a(TAG, "setBrowserTitle app market title not is APPMARKET");
            return;
        }
        if (this.mTextTitle != null) {
            LogUtil.a(TAG, "setBrowserTitle mTextTitle != null");
            if (WebViewUtils.isUnreasonableTitle(WebViewUtils.getTitleList(), str)) {
                str = "";
            } else if (this.mWebView == null) {
                LogUtil.d(TAG, "setBrowserTitle isUnreasonableTitle is false, mWebView = null");
            } else {
                String webViewUrlUiThread = getWebViewUrlUiThread();
                Uri uri = webViewUrlUiThread != null ? Uri.parse(webViewUrlUiThread) : null;
                if (uri != null && uri.getHost() != null && uri.getHost().length() != 0 && str.contains(uri.getHost())) {
                    str = "";
                }
            }
            List<String> list = this.mWebViewTitles;
            if (list != null && !list.isEmpty()) {
                List<String> list2 = this.mWebViewTitles;
                str2 = list2.get(list2.size() - 1);
            }
            if (str.equals(str2)) {
                return;
            }
            this.mHandler.obtainMessage(2002, str).sendToTarget();
            List<String> list3 = this.mWebViewTitles;
            if (list3 != null) {
                list3.add(str);
            }
        }
    }

    public void load(String str) {
        LogUtil.a(TAG, "load");
        if (TextUtils.isEmpty(str)) {
            LogUtil.a(TAG, "load originUrl isEmpty");
            str = Constants.ABOUT_BLANK;
        }
        String strReplaceSpace = WebViewUtils.replaceSpace(str);
        this.mOriginUrl = strReplaceSpace;
        if (!isWhiteUrl(strReplaceSpace)) {
            setJsEnable(false);
            removeJavascriptInterface(this.mOriginUrl);
            return;
        }
        setJsEnable(true);
        setAllowFileAccess(this.mOriginUrl);
        if (!this.mIsCoreJsMounted) {
            registerCoreJsInterface();
        }
        loadUrl(this.mOriginUrl);
    }

    private void setAllowFileAccess(String str) {
        if (Utils.isHttpOrHttps(str)) {
            return;
        }
        WebView webView = this.mWebView;
        if (webView == null) {
            LogUtil.j(TAG, "allowFileAccess: mWebView is null");
            return;
        }
        WebSettings settings = webView.getSettings();
        if (Utils.isWhiteFileUrl(str)) {
            settings.setAllowFileAccess(true);
            return;
        }
        settings.setAllowFileAccess(false);
        LogUtil.j(TAG, "allowFileAccess: isWhiteFileUrl false -> " + str);
    }

    private void removeJavascriptInterface(String str) {
        if (CommonUtil.cl() || str.toLowerCase(Locale.ENGLISH).startsWith("https://")) {
            return;
        }
        if (!str.startsWith(Constants.JAVA_SCRIPT)) {
            LogUtil.a(TAG, "not https or JAVA_SCRIPT protocol removeJavascriptInterface");
            if (Utils.isWhiteFileUrl(str)) {
                return;
            }
            LogUtil.a(TAG, "not file protocol removeJavascriptInterface");
            this.mWebView.removeJavascriptInterface("JsInteraction");
            this.mWebView.removeJavascriptInterface(Constants.HBS_SDK);
            this.mIsCoreJsMounted = false;
            return;
        }
        LogUtil.a(TAG, "JAVA_SCRIPT protocol not removeJavascriptInterface");
    }

    private void loadUrl(String str) {
        if (CommonUtil.ab(this.mContext) || str.startsWith("file:///android_asset/") || str.contains(ConfigConstants.BREATHE_URL) || Utils.isMatchThirdDeviceH5UrlPrefix(str)) {
            HashMap map = new HashMap(2);
            map.put("x-version", this.mAppVersion);
            this.mWebView.loadUrl(str, map);
            this.mWebView.postDelayed(new Runnable() { // from class: com.huawei.operation.view.CustomWebView.4
                @Override // java.lang.Runnable
                public void run() {
                    CustomWebView.this.mWebView.clearHistory();
                    LogUtil.a(CustomWebView.TAG, "loadUrl url postDelayed");
                }
            }, 1000L);
            return;
        }
        if (this.mType == 3001) {
            HashMap map2 = new HashMap(2);
            map2.put("x-version", this.mAppVersion);
            this.mWebView.loadUrl(str, map2);
            LogUtil.a(TAG, "loadUrl url TYPE_MINI_SHOP_FRAGMENT");
            return;
        }
        this.mHandler.sendEmptyMessage(2003);
        LogUtil.a(TAG, "loadUrl url MSG_ON_NET_WORK");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadUrl() {
        WebBackForwardList webBackForwardListCopyBackForwardList = this.mWebView.copyBackForwardList();
        if (webBackForwardListCopyBackForwardList.getCurrentIndex() < 2) {
            this.mWebView.goBack();
            return;
        }
        String url = webBackForwardListCopyBackForwardList.getItemAtIndex(webBackForwardListCopyBackForwardList.getCurrentIndex()).getUrl();
        WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(webBackForwardListCopyBackForwardList.getCurrentIndex() - 1);
        if (WebViewUtils.cannotGoBackUrl(itemAtIndex.getUrl())) {
            goBackWhenLastUrlisInvalid(webBackForwardListCopyBackForwardList, url);
        } else {
            goBackWhenExistUrl(webBackForwardListCopyBackForwardList, itemAtIndex);
        }
    }

    public void reload(String str) {
        LogUtil.a(TAG, "reload");
        if (TextUtils.isEmpty(str)) {
            LogUtil.a(TAG, "reload tmpReloadUrl is isEmpty");
            str = Constants.ABOUT_BLANK;
        }
        String strReplaceSpace = WebViewUtils.replaceSpace(str);
        this.mOriginUrl = strReplaceSpace;
        if (!isWhiteUrl(strReplaceSpace)) {
            setJsEnable(false);
            return;
        }
        setJsEnable(true);
        setAllowFileAccess(this.mOriginUrl);
        removeJavascriptInterface(this.mOriginUrl);
        if (CommonUtil.ab(this.mContext)) {
            LogUtil.a(TAG, "reload mOriginUrl isNetworkConnected");
            HashMap map = new HashMap(2);
            map.put("x-version", this.mAppVersion);
            this.mWebView.loadUrl(this.mOriginUrl, map);
            this.mHandler.postDelayed(new Runnable() { // from class: com.huawei.operation.view.CustomWebView$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1624lambda$reload$0$comhuaweioperationviewCustomWebView();
                }
            }, 200L);
            LogUtil.a(TAG, "reload mOriginUrl = ", this.mOriginUrl);
            return;
        }
        if (this.mType == 3001) {
            LogUtil.a(TAG, "reload mOriginUrl TYPE_MINI_SHOP_FRAGMENT");
            HashMap map2 = new HashMap(2);
            map2.put("x-version", this.mAppVersion);
            this.mWebView.loadUrl(this.mOriginUrl, map2);
            return;
        }
        LogUtil.a(TAG, "reload mOriginUrl MSG_ON_NET_WORK");
        this.mHandler.sendEmptyMessage(2003);
    }

    /* JADX INFO: renamed from: lambda$reload$0$com-huawei-operation-view-CustomWebView, reason: not valid java name */
    /* synthetic */ void m1624lambda$reload$0$comhuaweioperationviewCustomWebView() {
        if (this.mOriginUrl.contains("#")) {
            this.mWebView.reload();
        }
    }

    public boolean goBack() {
        PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
        if (pluginOperationAdapter != null) {
            if (pluginOperationAdapter.canFinish(this.mActivity) == 1) {
                LogUtil.a(TAG, "breathe finish activity");
                this.mActivity.finish();
                return true;
            }
            if (this.mAdapter.canFinish(this.mActivity) == 2) {
                LogUtil.a(TAG, "breathe show stop dialog");
                return true;
            }
            LogUtil.d(TAG, "goBack mAdapter.canFinish(mActivity) result not 1 2");
        }
        if (!this.mWebView.canGoBack()) {
            LogUtil.a(TAG, "WebView no go back.");
            return false;
        }
        if (this.mIsHasVmallSignUrl || this.mIsHasLoginCallbackUrl) {
            if (isTop()) {
                this.mActivity.finish();
                return false;
            }
            loadUrl();
            return true;
        }
        if (!TextUtils.isEmpty(this.mCurrentUrl) && this.mCurrentUrl.contains(Constants.ABOUT_BLANK) && !CommonUtil.ab(this.mContext)) {
            LogUtil.j(TAG, "goBack the net isn't connected");
            return false;
        }
        if (this.mCurrentUrl.contains("health_help_all") && this.mWebView.canGoBack()) {
            LogUtil.a(TAG, "goBack canGoBack");
            this.mWebView.goBack();
            return true;
        }
        if (isFirstUrl()) {
            this.mActivity.finish();
            return false;
        }
        LogUtil.a(TAG, "goBack webView canGoBack");
        this.mWebView.goBack();
        return true;
    }

    private boolean isFirstUrl() {
        WebBackForwardList webBackForwardListCopyBackForwardList = this.mWebView.copyBackForwardList();
        if (webBackForwardListCopyBackForwardList.getSize() <= 1) {
            return true;
        }
        int i = 0;
        for (int i2 = 0; i2 < webBackForwardListCopyBackForwardList.getCurrentIndex(); i2++) {
            WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(i2);
            if (itemAtIndex != null && !isBlackUrl(itemAtIndex.getUrl())) {
                i++;
            }
        }
        return i == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isTop() {
        WebBackForwardList webBackForwardListCopyBackForwardList = this.mWebView.copyBackForwardList();
        int i = 0;
        for (int i2 = 0; i2 <= webBackForwardListCopyBackForwardList.getCurrentIndex(); i2++) {
            WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(i2);
            if (itemAtIndex != null && !WebViewUtils.cannotGoBackUrl(itemAtIndex.getUrl())) {
                i++;
            }
        }
        return i == 1;
    }

    private void goBackWhenLastUrlisInvalid(WebBackForwardList webBackForwardList, String str) {
        int currentIndex = webBackForwardList.getCurrentIndex() - 2;
        while (currentIndex >= 0) {
            WebHistoryItem itemAtIndex = webBackForwardList.getItemAtIndex(currentIndex);
            if (!WebViewUtils.cannotGoBackUrl(itemAtIndex.getUrl()) && !itemAtIndex.getUrl().equals(str)) {
                this.mWebView.goBackOrForward(currentIndex - webBackForwardList.getCurrentIndex());
                return;
            }
            currentIndex--;
            if (currentIndex < 0) {
                this.mActivity.finish();
                return;
            }
        }
    }

    private void goBackWhenExistUrl(WebBackForwardList webBackForwardList, WebHistoryItem webHistoryItem) {
        int iIsLoopBackScene = isLoopBackScene(webBackForwardList);
        if (iIsLoopBackScene != 0) {
            this.mWebView.goBackOrForward(0 - iIsLoopBackScene);
            return;
        }
        if (isBlackUrl(webHistoryItem.getUrl())) {
            int backStepWhenUrl = getBackStepWhenUrl(webBackForwardList, 2);
            if (backStepWhenUrl >= webBackForwardList.getSize()) {
                this.mActivity.finish();
                return;
            } else {
                this.mWebView.goBackOrForward(0 - backStepWhenUrl);
                return;
            }
        }
        this.mWebView.goBack();
    }

    private int getBackStepWhenUrl(WebBackForwardList webBackForwardList, int i) {
        if (webBackForwardList.getCurrentIndex() > i) {
            WebHistoryItem itemAtIndex = webBackForwardList.getItemAtIndex(webBackForwardList.getCurrentIndex() - i);
            if (isBlackUrl(itemAtIndex.getUrl()) || WebViewUtils.cannotGoBackUrl(itemAtIndex.getUrl())) {
                return getBackStepWhenUrl(webBackForwardList, i + 1);
            }
        }
        return i;
    }

    private boolean isBlackUrl(String str) {
        initBlackSet();
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        Iterator<String> it = SAME_BLACK_URL.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next())) {
                return true;
            }
        }
        Iterator<String> it2 = BLACK_URL.iterator();
        while (it2.hasNext()) {
            if (str.contains(it2.next())) {
                return true;
            }
        }
        return isRedictUrl(str);
    }

    private boolean isRedictUrl(String str) {
        return !TextUtils.isEmpty(this.mCurrentUrl) && this.mCurrentUrl.contains(Constants.SUFFIX_HTML) && this.mCurrentUrl.startsWith(str);
    }

    private int isLoopBackScene(WebBackForwardList webBackForwardList) {
        initBlackUrlList();
        String url = webBackForwardList.getCurrentItem().getUrl();
        int currentIndex = webBackForwardList.getCurrentIndex();
        Iterator<String> it = BLACK_URL_LIST.iterator();
        int backStepsAtBlackUrl = 0;
        while (it.hasNext()) {
            String[] strArrSplit = it.next().split(",");
            if (strArrSplit.length >= 2 && url.equals(strArrSplit[0])) {
                backStepsAtBlackUrl = getBackStepsAtBlackUrl(currentIndex, webBackForwardList, url, strArrSplit);
            }
        }
        return backStepsAtBlackUrl;
    }

    private int getBackStepsAtBlackUrl(int i, WebBackForwardList webBackForwardList, String str, String[] strArr) {
        int i2 = i - 1;
        int i3 = 1;
        while (i2 >= 0 && checkUrlCanJump(webBackForwardList.getItemAtIndex(i2).getUrl(), strArr, str)) {
            i2--;
            i3++;
        }
        return i3;
    }

    private boolean checkUrlCanJump(String str, String[] strArr, String str2) {
        return str.equals(str2) || str.contains(strArr[1]) || WebViewUtils.cannotGoBackUrl(str);
    }

    private void initBlackUrlList() {
        ArrayList<String> arrayList = BLACK_URL_LIST;
        if (njy.e(arrayList)) {
            arrayList.addAll(Arrays.asList(this.mContext.getResources().getStringArray(R.array.comb_black_url)));
        }
    }

    private void initBlackSet() {
        Set<String> set = BLACK_URL;
        if (set.isEmpty()) {
            set.addAll(Arrays.asList(this.mContext.getResources().getStringArray(R.array.black_url)));
            SAME_BLACK_URL.addAll(Arrays.asList(this.mContext.getResources().getStringArray(R.array.same_black_url)));
        }
    }

    public void setTextView(TextView textView) {
        LogUtil.a(TAG, "setTextView");
        this.mTextTitle = textView;
    }

    public HealthProgressBar getProgressBar() {
        LogUtil.a(TAG, "getProgressBar");
        return this.mProgressBar;
    }

    public String getCaptureFunction() {
        return this.mCaptureFunction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getGetDialogTips(String str) {
        PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
        if (pluginOperationAdapter != null) {
            String strQueryServiceNameById = this.mAdapter.queryServiceNameById(pluginOperationAdapter.getServiceIdByUrl(str));
            if (!TextUtils.isEmpty(strQueryServiceNameById)) {
                return String.format(Locale.ROOT, this.mContext.getString(R.string.IDS_hwh_me_healthshop_webview_location_tips), strQueryServiceNameById);
            }
        }
        return String.format(this.mContext.getString(R.string.IDS_hwh_me_healthshop_webview_third_pre), String.format(Locale.ROOT, this.mContext.getString(R.string.IDS_hwh_me_healthshop_webview_location_tips), Utils.getHostByJdk(str)));
    }

    public void clearUploadMessage() {
        LogUtil.a(TAG, "clearUploadMessage");
        ValueCallback<Uri[]> valueCallback = this.mUploadMessageForAndroid5;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(new Uri[0]);
            this.mUploadMessageForAndroid5 = null;
        } else {
            LogUtil.d(TAG, "clearUploadMessage: mUploadMessageForAndroid5 = null");
        }
    }

    public void takePhoto() {
        File fileCreateImageFile;
        LogUtil.a(TAG, "takePhoto");
        try {
            fileCreateImageFile = WebViewUtils.createImageFile();
        } catch (IOException e) {
            LogUtil.e(TAG, "takePhoto: IOException -> " + e.getMessage());
            fileCreateImageFile = null;
        }
        if (fileCreateImageFile == null) {
            LogUtil.j(TAG, "takePhoto: outputImage is null");
            return;
        }
        try {
            Intent takePhotoIntent = getTakePhotoIntent();
            if (takePhotoIntent == null) {
                LogUtil.j(TAG, "takePhoto: intent is null");
            } else {
                this.mImageUri = FileProvider.getUriForFile(this.mContext, lrp.f40730c, fileCreateImageFile);
                takePhotoIntent.addFlags(1);
                takePhotoIntent.putExtra("output", this.mImageUri);
                this.mActivity.startActivityForResult(takePhotoIntent, 20001);
            }
        } catch (ActivityNotFoundException e2) {
            LogUtil.e(TAG, "takePhoto: ActivityNotFoundException -> " + e2.getMessage());
        }
    }

    private Intent getTakePhotoIntent() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        PackageManager packageManager = this.mActivity.getPackageManager();
        if (packageManager == null) {
            LogUtil.j(TAG, "getTakePhotoIntent: packageManager is null");
            return null;
        }
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
        if (resolveInfoResolveActivity == null) {
            LogUtil.j(TAG, "getTakePhotoIntent: resolveInfo is null");
            return null;
        }
        ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
        if (activityInfo == null) {
            LogUtil.j(TAG, "getTakePhotoIntent: activityInfo is null");
            return null;
        }
        intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
        return intent;
    }

    public void setJsEnable(boolean z) {
        LogUtil.a(TAG, "setJsEnable isEnable:", Boolean.valueOf(z));
        WebView webView = this.mWebView;
        if (webView != null) {
            webView.getSettings().setJavaScriptEnabled(z);
        }
    }

    public String getUrlBiType(String str) {
        if (this.mAdapter == null || TextUtils.isEmpty(str)) {
            LogUtil.a(TAG, "getUrlBiType mAdapter is null or url is empty");
            return "";
        }
        List<String> listQueryUrlList = this.mAdapter.queryUrlList(Constants.BI_URL);
        if (njy.e(listQueryUrlList)) {
            LogUtil.j(TAG, "getUrlBiType queryUrlList isEmpty!");
            return "";
        }
        for (String str2 : listQueryUrlList) {
            if (str2.contains("#")) {
                String[] strArrSplit = str2.split("#", 2);
                if (strArrSplit.length == 2 && str.contains(strArrSplit[1])) {
                    return strArrSplit[0];
                }
            }
        }
        return "";
    }

    public boolean isWhiteUrl(String str) {
        if (!Utils.needAuth(this.mContext)) {
            LogUtil.a(TAG, "isWhiteUrl do not need auth version!");
            return true;
        }
        if (TrustListCheckerImpl.containsXss(str)) {
            LogUtil.j(TAG, "isWhiteUrl: url cannot contain Xss");
            return false;
        }
        if (Utils.isWhiteFileUrl(str)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        ArrayList<String> arrayList = this.mUrlLists;
        if (arrayList != null) {
            arrayList.add(str);
        }
        if (!str.toLowerCase(Locale.ENGLISH).startsWith("https://") && !str.toLowerCase(Locale.ENGLISH).startsWith("http://") && !str.startsWith(Constants.PREFIX_ENCODE_HTTPS)) {
            return false;
        }
        boolean zIsWhiteUrlLogicJudge = Utils.isWhiteUrlLogicJudge(str, this.mAdapter);
        LogUtil.a(TAG, "isWhiteUrl isValidUrl is ", Boolean.valueOf(zIsWhiteUrlLogicJudge));
        if (zIsWhiteUrlLogicJudge) {
            return true;
        }
        reportValidUrl(str);
        LogUtil.a(TAG, "invalid url return false");
        return false;
    }

    private void reportValidUrl(String str) {
        if (health.compact.a.Utils.o()) {
            LogUtil.a(TAG, "reportValidUrl isOversea return");
            return;
        }
        HashMap map = new HashMap(5);
        map.put("click", "1");
        ArrayList<String> arrayList = this.mUrlLists;
        if (arrayList != null && arrayList.size() >= 2) {
            ArrayList<String> arrayList2 = this.mUrlLists;
            map.put(Constants.LAST_URL, arrayList2.get(arrayList2.size() - 1));
        } else {
            map.put(Constants.LAST_URL, "");
        }
        map.put(Constants.INVALID_URL, str);
        lmf.d().c(this.mContext, AnalyticsValue.HEALTH_SHOP_INVALID_URL_2120008.value(), map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:48:0x0104  */
    public void isCustomTitle(String str) {
        if (TextUtils.isEmpty(str) || this.mAdapter == null) {
            LogUtil.j(TAG, "url = ", Boolean.valueOf(TextUtils.isEmpty(str)), "mAdapter  = ", Boolean.valueOf(this.mAdapter == null));
            return;
        }
        if (str.contains(Constants.MEMBER_TERMS_KEYWORD) || str.contains(Constants.RENEW_TERMS_KEYWORD)) {
            return;
        }
        boolean z = WebViewUtils.isVmallUrl(str) || str.contains(Constants.VMALL_TYPE_WITH_PREFIX);
        if (WebViewUtils.isValidUrl(str) || z) {
            for (TitleBean titleBean : getCloudTitleBeanList()) {
                if (titleBean != null && str.contains(titleBean.fetchGetUrl())) {
                    if (z) {
                        titleBean.configSetIsShowAppBar(false);
                    }
                    TitleBean titleBeanCreateTitleConfig = createTitleConfig(titleBean);
                    ActivityHtmlPathApi activityHtmlPathApi = (ActivityHtmlPathApi) Services.d("PluginOperation", ActivityHtmlPathApi.class);
                    if (activityHtmlPathApi == null) {
                        LogUtil.j(TAG, "activityHtmlPathApi is null");
                        this.mHandler.obtainMessage(2012, titleBeanCreateTitleConfig).sendToTarget();
                        return;
                    }
                    String activityKeyUrlSp = WebViewUtils.getActivityKeyUrlSp(this.mContext);
                    if (str.startsWith(activityKeyUrlSp + activityHtmlPathApi.getActivityHtmlPath() + Constants.ACTIVITY_HTML)) {
                        titleBeanCreateTitleConfig.configSetRightBtn(TitleBean.RIGHT_BTN_TYPE_IS_MY_ACTIVITY);
                        setRegisterActivityQuitFunctionRes("");
                    } else {
                        if (str.startsWith(activityKeyUrlSp + activityHtmlPathApi.getActivityHtmlPath() + Constants.MY_ACTIVITY_HTML)) {
                            titleBeanCreateTitleConfig.configSetRightBtn("");
                            setRegisterActivityQuitFunctionRes("");
                        } else if (z) {
                            if (str.startsWith(this.mMobileVmallHost + VmallOrderView.PATH_ADDRESS_MANAGEMENT)) {
                                titleBeanCreateTitleConfig.configSetIsShowAppBar(true);
                            } else {
                                LogUtil.a(TAG, "url does not match");
                            }
                        } else {
                            LogUtil.a(TAG, "url does not match");
                        }
                    }
                    this.mHandler.obtainMessage(2012, titleBeanCreateTitleConfig).sendToTarget();
                    return;
                }
            }
            this.mHandler.obtainMessage(2012, null).sendToTarget();
            return;
        }
        LogUtil.a(TAG, "isCustomTitle isValidUrl is false");
    }

    private TitleBean createTitleConfig(TitleBean titleBean) {
        TitleBean titleBean2 = new TitleBean();
        titleBean2.configSetUrl(titleBean.fetchGetUrl());
        titleBean2.configSetLeftBtn(titleBean.fetchGetLeftBtn());
        titleBean2.configSetRightBtn(titleBean.fetchGetRightBtn());
        titleBean2.configSetFeatureUrl(titleBean.fetchGetFeatureUrl());
        titleBean2.configSetShoppingCartUrl(titleBean.fetchGetShoppingCartUrl());
        titleBean2.configSetOrderManagerUrl(titleBean.fetchGetOrderManagerUrl());
        titleBean2.configSetIsShowAppBar(titleBean.fetchIsShowAppBar());
        return titleBean2;
    }

    private List<TitleBean> getCloudTitleBeanList() {
        List<TitleBean> titleBeanConfigs;
        WebViewConfig webViewConfig = this.mWebViewConfig;
        if (webViewConfig != null) {
            titleBeanConfigs = webViewConfig.getTitleBeanConfigs();
        } else {
            WebViewConfig webViewConfigQueryWebViewConfig = this.mAdapter.queryWebViewConfig();
            this.mWebViewConfig = webViewConfigQueryWebViewConfig;
            LogUtil.d(TAG, "queryWebViewConfig = ", webViewConfigQueryWebViewConfig);
            WebViewConfig webViewConfig2 = this.mWebViewConfig;
            if (webViewConfig2 != null) {
                titleBeanConfigs = webViewConfig2.getTitleBeanConfigs();
            } else {
                LogUtil.a(TAG, "mWebViewConfig is null");
                titleBeanConfigs = null;
            }
        }
        if (titleBeanConfigs != null && !titleBeanConfigs.isEmpty()) {
            LogUtil.a(TAG, "isCustomTitle in cloudTitleBeanList");
            return titleBeanConfigs;
        }
        LogUtil.a(TAG, "isCustomTitle in sLocalTitleBeans");
        return WebViewUtils.getLocalTitleBeans(this.mContext);
    }

    public void callbackWebViewStatus(String str) {
        String url;
        LogUtil.a(TAG, "callBackWebViewStatus status:", str);
        if (TextUtils.isEmpty(this.mWebViewStatusFunction)) {
            url = "";
        } else {
            url = WebViewUtils.getUrl(this.mWebViewStatusFunction, str);
        }
        if (TextUtils.isEmpty(url)) {
            LogUtil.a(TAG, "TextUtils.isEmpty(callJs)1");
        } else {
            this.mWebView.loadUrl(url);
        }
    }

    public void startVmallLogout() {
        LogUtil.a(TAG, "startVmallLogout");
        if (TextUtils.isEmpty(this.mMobileVmallHost)) {
            LogUtil.e(TAG, "startVmallLogout mobileVmallHost is empty");
            return;
        }
        LogUtil.d(TAG, "startVmallLogout mobileVmallHost = ", this.mMobileVmallHost);
        this.mWebView.loadUrl(this.mMobileVmallHost + UriConstants.URL_CASLOGOUT_DEFAULT);
        setLoginStatus(false);
    }

    @Override // com.huawei.operation.adapter.UpdateCustomTitleBarCallback
    public void updateCustomTitleBarVisibility(final String str) {
        this.mWebView.post(new Runnable() { // from class: com.huawei.operation.view.CustomWebView.5
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a(CustomWebView.TAG, "updateCustomTitleBarVisibility");
                CustomWebView.this.mHandler.obtainMessage(Constants.UPDATE_CUSTOM_TITLE_BAR_VISIBILITY, str).sendToTarget();
            }
        });
    }

    @Override // com.huawei.operation.adapter.SetFullscreenCallback
    public void setFullscreen(final String str) {
        this.mWebView.post(new Runnable() { // from class: com.huawei.operation.view.CustomWebView.6
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a(CustomWebView.TAG, "setFullscreen");
                CustomWebView.this.mHandler.obtainMessage(Constants.SET_FULLSCREEN, str).sendToTarget();
            }
        });
    }

    @Override // com.huawei.operation.adapter.SetLeftBtnArrowTypeCallback
    public void setLeftBtnArrowType() {
        this.mWebView.post(new Runnable() { // from class: com.huawei.operation.view.CustomWebView.7
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a(CustomWebView.TAG, "setLeftBtnArrowType");
                CustomWebView.this.mHandler.obtainMessage(Constants.LEFT_BTN_ARROW_TYPE, "").sendToTarget();
            }
        });
    }

    @Override // com.huawei.operation.adapter.SetLeftBtnArrowTypeCallback
    public void setNextH5PageLeftBtnArrowType() {
        this.mWebView.post(new Runnable() { // from class: com.huawei.operation.view.CustomWebView.8
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a(CustomWebView.TAG, "setLeftBtnArrowType");
                CustomWebView.this.mHandler.obtainMessage(Constants.NEXT_H5_PAGE_LEFT_BTN_ARROW_TYPE, "").sendToTarget();
            }
        });
    }

    @Override // com.huawei.operation.adapter.SetShareDataCallback
    public void setShareData(final String str, final String str2, final String str3, final String str4) {
        this.mWebView.post(new Runnable() { // from class: com.huawei.operation.view.CustomWebView.9
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a(CustomWebView.TAG, "setShareData.");
                Bundle bundle = new Bundle();
                bundle.putString(Constants.SHARE_BITMAPURL, str);
                bundle.putString(Constants.SHARE_TITLE, str2);
                bundle.putString(Constants.SHARE_CONTENT, str3);
                bundle.putString(Constants.SHARE_URL, str4);
                Message messageObtainMessage = CustomWebView.this.mHandler.obtainMessage(Constants.SET_SHARE_DATA);
                messageObtainMessage.setData(bundle);
                CustomWebView.this.mHandler.sendMessage(messageObtainMessage);
            }
        });
    }

    @Override // com.huawei.operation.adapter.SportsStatisticsCallback
    public void callSportSumDataJsFunction(final int i, final Object obj, final String str) {
        this.mWebView.post(new Runnable() { // from class: com.huawei.operation.view.CustomWebView.10
            @Override // java.lang.Runnable
            public void run() {
                String url;
                if (TextUtils.isEmpty(str)) {
                    url = "";
                } else {
                    url = WebViewUtils.getUrl(str, i + "', '" + HiJsonUtil.d(obj));
                }
                if (TextUtils.isEmpty(url)) {
                    LogUtil.j(CustomWebView.TAG, "callJs isEmpty.");
                } else {
                    LogUtil.a(CustomWebView.TAG, "callback Js function", url);
                    CustomWebView.this.mWebView.loadUrl(url);
                }
            }
        });
    }

    @Override // com.huawei.operation.adapter.OnHealthDataCallback
    public void onHealthDataStatisticsCallback(final int i, final Object obj, final String str) {
        LogUtils.d(TAG, "onHealthDataStatisticsCallback");
        if (TextUtils.isEmpty(str)) {
            LogUtils.w(TAG, "onHealthDataStatisticsCallback: callback is empty,ignore!");
        } else {
            this.mWebView.post(new Runnable() { // from class: com.huawei.operation.view.CustomWebView.11
                @Override // java.lang.Runnable
                public void run() {
                    String url;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("code", Integer.valueOf(i));
                    Object obj2 = obj;
                    if (obj2 == null) {
                        url = WebViewUtils.getUrl(str, linkedHashMap.toString());
                    } else {
                        linkedHashMap.put("data", obj2);
                        url = WebViewUtils.getUrl(str, linkedHashMap.toString());
                    }
                    if (TextUtils.isEmpty(url)) {
                        LogUtils.w(CustomWebView.TAG, "onCoreSleepDetailCallback:callJs is empty, ignore!");
                        return;
                    }
                    LogUtils.d(CustomWebView.TAG, "onCoreSleepDetailCallback:callJs data:" + url);
                    CustomWebView.this.mWebView.loadUrl(url);
                }
            });
        }
    }

    class WebChromeClientBase extends WebChromeClient {
        private View mCustomView;
        private WebChromeClient.CustomViewCallback mCustomViewCallback;

        private WebChromeClientBase() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            if (CustomWebView.this.mType == 3001) {
                return;
            }
            if (i < 100) {
                if (CustomWebView.this.mProgressBar.getVisibility() == 8) {
                    CustomWebView.this.mProgressBar.setVisibility(0);
                }
                CustomWebView.this.mProgressBar.setProgress(i);
            } else {
                LogUtil.a(CustomWebView.TAG, "setProgressBar >= 100");
                CustomWebView.this.mProgressBar.setProgress(i);
                CustomWebView.this.mHandler.sendMessageDelayed(CustomWebView.this.mHandler.obtainMessage(2000), 500L);
                CustomWebView.this.mHasLoadedStart.set(false);
            }
            super.onProgressChanged(webView, i);
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            CustomWebView.this.setBrowserTitle(str);
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(final String str, final GeolocationPermissions.Callback callback) {
            LogUtil.a(CustomWebView.TAG, "onGeolocationPermissionsShowPrompt() enter");
            CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(CustomWebView.this.mContext);
            builder.e(CustomWebView.this.mContext.getString(R.string.IDS_hwh_open_service_pop_up_notification_note)).a(CustomWebView.this.getGetDialogTips(str)).b(CustomWebView.this.mContext.getString(R.string.IDS_user_permission_ok), new View.OnClickListener() { // from class: com.huawei.operation.view.CustomWebView.WebChromeClientBase.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a(CustomWebView.TAG, "onGeolocationPermissionsShowPromptDialog setPositiveButton");
                    callback.invoke(str, true, false);
                }
            }).a(CustomWebView.this.mContext.getString(R.string.IDS_settings_button_cancal_ios_btn), new View.OnClickListener() { // from class: com.huawei.operation.view.CustomWebView.WebChromeClientBase.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a(CustomWebView.TAG, "onGeolocationPermissionsShowPromptDialog setNegativeButton");
                    callback.invoke(str, false, false);
                }
            });
            if (CustomWebView.this.mActivity.isFinishing()) {
                callback.invoke(str, false, false);
                return;
            }
            CustomTextAlertDialog customTextAlertDialogB = builder.b();
            customTextAlertDialogB.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.huawei.operation.view.CustomWebView.WebChromeClientBase.3
                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    LogUtil.a(CustomWebView.TAG, "onGeolocationPermissionsShowPromptDialog setOnCancelListener");
                    callback.invoke(str, false, false);
                }
            });
            customTextAlertDialogB.show();
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
            LogUtil.d(CustomWebView.TAG, "onReceivedTouchIconUrl");
            super.onReceivedTouchIconUrl(webView, str, z);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            LogUtil.a(CustomWebView.TAG, "onCreateWindow");
            return super.onCreateWindow(webView, z, z2, message);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            LogUtil.a(CustomWebView.TAG, "onShowFileChooser Android > 5.0");
            CustomWebView.this.clearUploadMessage();
            CustomWebView.this.mUploadMessageForAndroid5 = valueCallback;
            Object systemService = CustomWebView.this.mContext.getSystemService("layout_inflater");
            if (!(systemService instanceof LayoutInflater)) {
                return false;
            }
            View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.hw_show_select_pic_dialog_view, (ViewGroup) null);
            viewInflate.findViewById(R.id.line_take_photo).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.operation.view.CustomWebView$WebChromeClientBase$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m1632xc1727ef4(view);
                }
            });
            viewInflate.findViewById(R.id.line_gallery).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.operation.view.CustomWebView$WebChromeClientBase$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m1633x7be81f75(view);
                }
            });
            CustomWebView.this.mCustomViewDialog = new CustomViewDialog.Builder(CustomWebView.this.mContext).a(CustomWebView.this.mContext.getString(R.string.IDS_hwh_home_healthshop_select_upload_way)).d(viewInflate).c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.operation.view.CustomWebView$WebChromeClientBase$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m1634x365dbff6(view);
                }
            }).d();
            CustomWebView.this.mCustomViewDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.huawei.operation.view.CustomWebView$WebChromeClientBase$$ExternalSyntheticLambda3
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f$0.m1635xf0d36077(dialogInterface);
                }
            });
            CustomWebView.this.mCustomViewDialog.show();
            return true;
        }

        /* JADX INFO: renamed from: lambda$onShowFileChooser$0$com-huawei-operation-view-CustomWebView$WebChromeClientBase, reason: not valid java name */
        /* synthetic */ void m1632xc1727ef4(View view) {
            LogUtil.a(CustomWebView.TAG, "onShowFileChooser: line_take_photo");
            CustomWebView.this.mCustomViewDialog.dismiss();
            PermissionUtil.d(CustomWebView.this.mActivity, PermissionUtil.a() ? PermissionUtil.PermissionType.CAMERA : PermissionUtil.PermissionType.CAMERA_IMAGE, new CustomPermissionAction(CustomWebView.this.mActivity) { // from class: com.huawei.operation.view.CustomWebView.WebChromeClientBase.4
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    CustomWebView.this.takePhoto();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onShowFileChooser$1$com-huawei-operation-view-CustomWebView$WebChromeClientBase, reason: not valid java name */
        /* synthetic */ void m1633x7be81f75(View view) {
            LogUtil.a(CustomWebView.TAG, "onShowFileChooser: line_gallery");
            CustomWebView.this.mCustomViewDialog.dismiss();
            qrs.c(CustomWebView.this.mActivity, Constants.FILE_CHOOSER_RESULT_CODE_FOR_ANDROID_5);
        }

        /* JADX INFO: renamed from: lambda$onShowFileChooser$2$com-huawei-operation-view-CustomWebView$WebChromeClientBase, reason: not valid java name */
        /* synthetic */ void m1634x365dbff6(View view) {
            CustomWebView.this.clearUploadMessage();
        }

        /* JADX INFO: renamed from: lambda$onShowFileChooser$3$com-huawei-operation-view-CustomWebView$WebChromeClientBase, reason: not valid java name */
        /* synthetic */ void m1635xf0d36077(DialogInterface dialogInterface) {
            CustomWebView.this.clearUploadMessage();
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            super.onShowCustomView(view, customViewCallback);
            if (this.mCustomView != null) {
                customViewCallback.onCustomViewHidden();
                return;
            }
            this.mCustomView = view;
            if (CustomWebView.this.mFrameLayout != null) {
                CustomWebView.this.mFrameLayout.addView(this.mCustomView);
            }
            this.mCustomViewCallback = customViewCallback;
            if (CustomWebView.this.mHandler != null) {
                CustomWebView.this.mHandler.sendEmptyMessage(2021);
            }
            CustomWebView.this.mWebView.setVisibility(8);
            CustomWebView.this.mActivity.setRequestedOrientation(0);
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            if (CustomWebView.this.mHandler != null) {
                CustomWebView.this.mHandler.sendEmptyMessage(2022);
            }
            CustomWebView.this.mWebView.setVisibility(0);
            View view = this.mCustomView;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
            if (CustomWebView.this.mFrameLayout != null) {
                CustomWebView.this.mFrameLayout.removeView(this.mCustomView);
            }
            this.mCustomViewCallback.onCustomViewHidden();
            this.mCustomView = null;
            CustomWebView.this.mActivity.setRequestedOrientation(1);
            super.onHideCustomView();
        }
    }

    public String getBiCurrentUrl() {
        return this.sBiCurrentUrl;
    }

    private void setTimeBiAnalysis() {
        long j = this.mLoadEndTime - this.mLoadStartTime;
        if (j <= 0 || j > 30000) {
            return;
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(2);
        linkedHashMap.put(OpAnalyticsConstants.DELAY_MS, String.valueOf(j));
        linkedHashMap.put(OpAnalyticsConstants.URL_HEADER, getBiCurrentUrl());
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_WEBVIEW_LOADING_DELAY_80060002.value(), linkedHashMap);
    }

    class WebViewClientBase extends WebViewClient {
        private WebViewClientBase() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            CustomWebView.this.mOriginUrl = WebViewUtils.replaceSpace(str);
            CustomWebView.this.mCurrentUrl = str;
            CustomWebView.this.mHasLoadedStart.set(true);
            if (WebViewUtils.isValidUrl(CustomWebView.this.mOriginUrl)) {
                CustomWebView.this.mHandler.obtainMessage(2020).sendToTarget();
            }
            CustomWebView customWebView = CustomWebView.this;
            customWebView.setDarkMode(customWebView.mCurrentUrl);
            CustomWebView customWebView2 = CustomWebView.this;
            if (customWebView2.interceptUrlWithMyOrderUrl(customWebView2.mCurrentUrl)) {
                LogUtil.a(CustomWebView.TAG, "Intercepted special URL, finishing activity: " + CustomWebView.this.mCurrentUrl);
                if (CustomWebView.this.mActivity != null) {
                    CustomWebView.this.mActivity.finish();
                }
                return true;
            }
            CustomWebView customWebView3 = CustomWebView.this;
            if (!customWebView3.isInvoiceUrlToBrowser(customWebView3.mCurrentUrl)) {
                if (Utils.isNeedLoginWithVmallUrl(CustomWebView.this.mCurrentUrl, CustomWebView.this.mContext, CustomWebView.this)) {
                    return true;
                }
                CustomWebView.this.interceptMyhuawei(str);
                if (CustomWebView.this.interceptVmallLogin(str)) {
                    return true;
                }
                if (!WebViewUtils.isValidUrl(CustomWebView.this.mOriginUrl)) {
                    if (WebViewUtils.schemeHandle(CustomWebView.this.mContext, CustomWebView.this.mAdapter, CustomWebView.this.mOriginUrl) || WebViewUtils.schemeHandleVmall(CustomWebView.this.mContext, CustomWebView.this.mOriginUrl, CustomWebView.this.mVmallUrl)) {
                        LogUtil.a(CustomWebView.TAG, "scheme is known");
                        return true;
                    }
                    LogUtil.a(CustomWebView.TAG, "scheme is unknown");
                    return true;
                }
                CustomWebView.this.setJsEnable(true);
                CustomWebView customWebView4 = CustomWebView.this;
                if (customWebView4.isWhiteUrl(customWebView4.mOriginUrl)) {
                    if (!WebViewUtils.isFullScreen(CustomWebView.this.mOriginUrl)) {
                        if (WebViewHelp.prefixCheck(CustomWebView.this.mCurrentUrl, CustomWebView.this.mMobileVmallHost, CustomWebView.this.mMobileVmallDetailHost)) {
                            CustomWebView customWebView5 = CustomWebView.this;
                            customWebView5.mVmallUrl = customWebView5.mCurrentUrl;
                        }
                        return false;
                    }
                    Intent intent = new Intent(CustomWebView.this.mContext, (Class<?>) WebViewActivity.class);
                    intent.putExtra("url", CustomWebView.this.mOriginUrl);
                    CustomWebView.this.mContext.startActivity(intent);
                    return true;
                }
                LogUtil.d(CustomWebView.TAG, "shouldOverrideUrlHandler isWhiteUrl false");
                CustomWebView.this.mWebView.removeJavascriptInterface("JsInteraction");
                CustomWebView.this.mWebView.removeJavascriptInterface(Constants.HBS_SDK);
                CustomWebView.this.mIsCoreJsMounted = false;
                return true;
            }
            LogUtil.a(CustomWebView.TAG, "Intercepted browser jump URL: " + CustomWebView.this.mCurrentUrl);
            if (CustomWebView.this.mActivity != null) {
                WebViewUtils.jumpToBrowsers(CustomWebView.this.mCurrentUrl);
            }
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            LogUtil.a(CustomWebView.TAG, "onPageStarted");
            if (CustomWebView.this.mContext instanceof WebViewActivity) {
                ((WebViewActivity) CustomWebView.this.mContext).enableSlowWholeDocumentDraw(str);
            }
            KakaTaskUtils.onAchieveEvent(str, CustomWebView.this.mContext);
            CustomWebView.this.mProgressBar.setVisibility(0);
            if (!TextUtils.isEmpty(str)) {
                CustomWebView.this.mCurrentUrl = str;
                CustomWebView.this.mOriginUrl = str;
                CustomWebView.this.mHasLoadedStart.set(true);
                if (WebViewUtils.isValidUrl(CustomWebView.this.mCurrentUrl)) {
                    CustomWebView.this.mHandler.obtainMessage(2020).sendToTarget();
                }
                CustomWebView.this.mLoadStartTime = System.currentTimeMillis();
                CustomWebView.this.interceptPayUrl(str);
                CustomWebView.this.interceptMyhuawei(str);
                CustomWebView customWebView = CustomWebView.this;
                customWebView.setDarkMode(customWebView.mCurrentUrl);
                if (CustomWebView.this.interceptVmallLogin(str)) {
                    return;
                }
                CustomWebView.this.urlVerification(str);
                if (CustomWebView.this.mWebView.getProgress() < 100) {
                    LogUtil.a(CustomWebView.TAG, "onPageStarted mWebView.getProgress() < 100 ");
                    CustomWebView.this.mHandler.sendEmptyMessageDelayed(2007, 30000L);
                }
                if (WebViewUtils.isHealthVmall(CustomWebView.this.mCurrentUrl)) {
                    if (CustomWebView.this.isLoginHealthVmall()) {
                        LogUtil.a(CustomWebView.TAG, "health vmall: true");
                        super.onPageStarted(webView, str, bitmap);
                    } else {
                        LogUtil.j(CustomWebView.TAG, "health vmall: false");
                    }
                } else {
                    super.onPageStarted(webView, str, bitmap);
                }
                if (WebViewHelp.prefixCheck(CustomWebView.this.mCurrentUrl, CustomWebView.this.mMobileVmallHost, CustomWebView.this.mMobileVmallDetailHost)) {
                    CustomWebView customWebView2 = CustomWebView.this;
                    customWebView2.mVmallUrl = customWebView2.mCurrentUrl;
                }
                if (CustomWebView.this.mHandler != null) {
                    Message messageObtainMessage = CustomWebView.this.mHandler.obtainMessage(Constants.ON_PAGE_STARTED);
                    messageObtainMessage.obj = str;
                    CustomWebView.this.mHandler.sendMessage(messageObtainMessage);
                    return;
                }
                return;
            }
            LogUtil.j(CustomWebView.TAG, "WebViewClientBase onPageStarted url is null.");
        }

        private WebResourceResponse getAnnualMedalWebResourceResponse(WebView webView, WebResourceRequest webResourceRequest, String str) {
            WebResourceResponse webResourceResponseShouldInterceptRequest = webResourceRequest == null ? super.shouldInterceptRequest(webView, str) : super.shouldInterceptRequest(webView, webResourceRequest);
            if (str.contains(Constants.ANNUAL_MEDAL_PATH_PREFIX) || str.contains(Constants.ANNUAL_MEDAL_PATH_PREFIX_COMMON)) {
                try {
                    String strC = CommonUtil.c(Uri.parse(str.replace(Constants.ANNUAL_MEDAL_PATH_PREFIX, "").replace(Constants.ANNUAL_MEDAL_PATH_PREFIX_COMMON, "")).getPath());
                    if (GeneralUtil.isSafePath(strC)) {
                        if (CustomWebView.this.mAchieveMedalPattern == null) {
                            CustomWebView.this.mAchieveMedalPattern = Pattern.compile("^(/data/)((data)|(user/[0-9]))/" + BaseApplication.getAppPackage() + "/files/((achievemedalpng)|(achievemedal))/");
                        }
                        if (!CustomWebView.this.mAchieveMedalPattern.matcher(strC).find()) {
                            LogUtil.j(CustomWebView.TAG, "Invalid Resource: " + strC);
                            return webResourceResponseShouldInterceptRequest;
                        }
                        return new WebResourceResponse("image/png", "UTF-8", new FileInputStream(strC));
                    }
                } catch (IOException unused) {
                    LogUtil.e(CustomWebView.TAG, "getAnnualMedalWebResourceResponse: failed to obtain resources");
                    return webResourceResponseShouldInterceptRequest;
                }
            }
            return webResourceResponseShouldInterceptRequest;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            String string = webResourceRequest.getUrl().toString();
            if (TextUtils.isEmpty(string)) {
                return super.shouldInterceptRequest(webView, webResourceRequest);
            }
            if (string.contains(Constants.ANNUAL_MEDAL_PATH_PREFIX) || string.contains(Constants.ANNUAL_MEDAL_PATH_PREFIX_COMMON)) {
                return getAnnualMedalWebResourceResponse(webView, webResourceRequest, string);
            }
            removeJsInterface(string);
            return betaVersionResult(string);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            if (TextUtils.isEmpty(str)) {
                LogUtil.a(CustomWebView.TAG, "url is null!");
                return super.shouldInterceptRequest(webView, str);
            }
            if (str.contains(Constants.ANNUAL_MEDAL_PATH_PREFIX) || str.contains(Constants.ANNUAL_MEDAL_PATH_PREFIX_COMMON)) {
                return getAnnualMedalWebResourceResponse(webView, null, str);
            }
            notTestVersionAndNotHttps(str);
            return webResourceResponseResult(str);
        }

        private void removeJsInterface(String str) {
            if (CommonUtil.cl()) {
                return;
            }
            if (str.toLowerCase(Locale.ENGLISH).startsWith("http://") || str.toLowerCase(Locale.ENGLISH).startsWith(Constants.PREFIX_ENCODE_HTTP)) {
                LogUtil.a(CustomWebView.TAG, "not https protocol removeJavascriptInterface2");
                if ((Utils.isWhiteFileUrl(CustomWebView.this.mOriginUrl) && str.toLowerCase(Locale.ENGLISH).startsWith(Constants.PREFIX_FILE_WHITE)) || CustomWebView.this.mUnsafeUrl.equals(CustomWebView.this.mOriginUrl)) {
                    return;
                }
                CustomWebView customWebView = CustomWebView.this;
                customWebView.mUnsafeUrl = customWebView.mOriginUrl;
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.huawei.operation.view.CustomWebView.WebViewClientBase.1
                    @Override // java.lang.Runnable
                    public void run() {
                        CustomWebView.this.mWebView.removeJavascriptInterface("JsInteraction");
                        CustomWebView.this.mWebView.removeJavascriptInterface(Constants.HBS_SDK);
                        CustomWebView.this.mIsCoreJsMounted = false;
                        LogUtil.a(CustomWebView.TAG, "mUnsafeUrl removeJavascriptInterface and stopLoading!");
                        CustomWebView.this.reload(CustomWebView.this.mOriginUrl);
                    }
                });
            }
        }

        private WebResourceResponse betaVersionResult(String str) {
            if (!CommonUtil.ap() || health.compact.a.Utils.o()) {
                return null;
            }
            String hostByJdk = Utils.getHostByJdk(str);
            if (TextUtils.isEmpty(hostByJdk) || hostByJdk.endsWith(Constants.CRIP_COM) || hostByJdk.endsWith(Constants.TRIP_COM) || hostByJdk.endsWith(Constants.C_CTRIP_COM)) {
                return null;
            }
            ArrayList<Boolean> booleanArrayList = getBooleanArrayList(str);
            booleanArrayList.add(Boolean.valueOf(str.contains("/healthMallPlat/")));
            boolean z = str.contains("/messageH5/") && !str.contains("/audio/");
            Iterator<Boolean> it = booleanArrayList.iterator();
            while (it.hasNext()) {
                if (it.next().booleanValue() || z) {
                    return getWebResourceResponse(str);
                }
            }
            return null;
        }

        private WebResourceResponse getWebResourceResponse(String str) {
            String str2 = CustomWebView.CONTENT_TYPE_HTML;
            try {
                URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
                uRLConnectionOpenConnection.setRequestProperty("x-version", CustomWebView.this.mAppVersion);
                uRLConnectionOpenConnection.setRequestProperty("x-huid", LoginInit.getInstance(CustomWebView.this.mContext).getAccountInfo(1011));
                String contentType = uRLConnectionOpenConnection.getContentType();
                if (!str.contains(Constants.ACTIVITY_URL_CN) || TextUtils.isEmpty(contentType) || !contentType.startsWith(CustomWebView.CONTENT_TYPE_HTML)) {
                    str2 = contentType;
                }
                return new WebResourceResponse(str2, uRLConnectionOpenConnection.getHeaderField("encoding"), uRLConnectionOpenConnection.getInputStream());
            } catch (MalformedURLException e) {
                LogUtil.e(CustomWebView.TAG, "WebViewClientBase shouldInterceptRequest MalformedURLException", e.getMessage());
                return null;
            } catch (IOException unused) {
                LogUtil.e(CustomWebView.TAG, "WebViewClientBase shouldInterceptRequest IOException WebResourceResponse fail");
                return null;
            } catch (IllegalStateException e2) {
                LogUtil.e(CustomWebView.TAG, "WebViewClientBase shouldInterceptRequest IllegalStateException", e2.getMessage());
                return null;
            }
        }

        private void notTestVersionAndNotHttps(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if ((str.toLowerCase(Locale.ENGLISH).startsWith("http://") || str.toLowerCase(Locale.ENGLISH).startsWith(Constants.PREFIX_ENCODE_HTTP)) && !CommonUtil.cl()) {
                LogUtil.a(CustomWebView.TAG, "not https protocol removeJavascriptInterface3");
                if ((Utils.isWhiteFileUrl(CustomWebView.this.mOriginUrl) && str.toLowerCase(Locale.ENGLISH).startsWith(Constants.PREFIX_FILE_WHITE)) || CustomWebView.this.mUnsafeUrl.equals(CustomWebView.this.mOriginUrl)) {
                    return;
                }
                CustomWebView customWebView = CustomWebView.this;
                customWebView.mUnsafeUrl = customWebView.mOriginUrl;
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.huawei.operation.view.CustomWebView.WebViewClientBase.2
                    @Override // java.lang.Runnable
                    public void run() {
                        CustomWebView.this.mWebView.stopLoading();
                        CustomWebView.this.mWebView.removeJavascriptInterface("JsInteraction");
                        CustomWebView.this.mWebView.removeJavascriptInterface(Constants.HBS_SDK);
                        CustomWebView.this.mIsCoreJsMounted = false;
                        LogUtil.a(CustomWebView.TAG, "mUnsafeUrl removeJavascriptInterface and stopLoading!");
                        CustomWebView.this.reload(CustomWebView.this.mOriginUrl);
                    }
                });
            }
        }

        private WebResourceResponse webResourceResponseResult(String str) {
            ArrayList<Boolean> booleanArrayList = getBooleanArrayList(str);
            booleanArrayList.add(Boolean.valueOf(str.contains("/messageH5/")));
            Iterator<Boolean> it = booleanArrayList.iterator();
            while (it.hasNext()) {
                if (it.next().booleanValue() && !str.contains("/audio/")) {
                    return getWebResourceResponse(str);
                }
            }
            return null;
        }

        private ArrayList<Boolean> getBooleanArrayList(String str) {
            ArrayList<Boolean> arrayList = new ArrayList<>(5);
            arrayList.add(Boolean.valueOf(str.contains("/web/") && !str.contains("/cashier/web/")));
            arrayList.add(Boolean.valueOf(str.contains("/miniShop/")));
            arrayList.add(Boolean.valueOf(str.contains("/breathePractice/")));
            arrayList.add(Boolean.valueOf(str.contains("/heartIndex/")));
            return arrayList;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            LogUtil.a(CustomWebView.TAG, "onPageFinished");
            CustomWebView.this.addVmallPressBackListner(str);
            CustomWebView.this.biServiceProcessing(webView, str);
            if (Utils.isNeedLoginWithVmallUrl(CustomWebView.this.mCurrentUrl, CustomWebView.this.mContext, CustomWebView.this)) {
                return;
            }
            CustomWebView.this.mProgressBar.setVisibility(8);
            if (!CustomWebView.this.mIsVmallCouponPage) {
                CustomWebView customWebView = CustomWebView.this;
                customWebView.isCustomTitle(customWebView.mCurrentUrl);
                CustomWebView.this.mIsVmallCouponPage = false;
            }
            if (CustomWebView.this.mHandler.hasMessages(2007)) {
                CustomWebView.this.mHandler.removeMessages(2007);
            }
            String healthIdVmallHost = WebViewUtils.getHealthIdVmallHost();
            LogUtil.d(CustomWebView.TAG, "onPageFinished hwidVmallHost = ", healthIdVmallHost);
            if (TextUtils.equals(str, healthIdVmallHost + UriConstants.URL_VMALL_CAS_REMOTE_LOGIN)) {
                if (System.currentTimeMillis() - CustomWebView.this.mLastVmallRemoteLoginTime < 1000) {
                    super.onPageFinished(webView, str);
                    return;
                } else {
                    CustomWebView.this.mLastVmallRemoteLoginTime = System.currentTimeMillis();
                }
            }
            onPageFinishedForVmall(webView, str);
            Message messageObtainMessage = CustomWebView.this.mHandler.obtainMessage(10086);
            messageObtainMessage.obj = str;
            CustomWebView.this.mHandler.sendMessage(messageObtainMessage);
            super.onPageFinished(webView, str);
        }

        private void onPageFinishedForVmall(WebView webView, String str) {
            if (WebViewUtils.isUpLoginUrl(str)) {
                String autoLoginUrl = CasLoginUtil.getAutoLoginUrl();
                if (!TextUtils.isEmpty(autoLoginUrl) && CustomWebView.this.mWebView != null) {
                    CustomWebView.this.mWebView.loadUrl(autoLoginUrl);
                }
            }
            if (WebViewUtils.isVmallMcpLoginUrl(str)) {
                webView.loadUrl(WebViewUtils.getUrl("window.java_obj.showSource(document.getElementsByTagName", "pre", "[0].innerHTML);"));
                webView.loadUrl(WebViewUtils.getUrl("document.getElementsByTagName", Constants.SUFFIX_HTML, "[0].style.visibility='hidden';"));
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            LogUtil.a(CustomWebView.TAG, "onReceivedError errorCode is ", Integer.valueOf(i), "description is ", str);
            CustomWebView.this.mHandler.sendEmptyMessage(2001);
            webView.loadUrl(" ");
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            int statusCode = webResourceResponse.getStatusCode();
            LogUtil.a(CustomWebView.TAG, "onReceivedHttpError ", "getStatusCode = ", Integer.valueOf(statusCode), " getReasonPhrase", webResourceResponse.getReasonPhrase());
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (sslError == null) {
                LogUtil.j(CustomWebView.TAG, "onReceivedSslError error is null");
                return;
            }
            LogUtil.a(CustomWebView.TAG, "onReceivedSslError errorType is ", Integer.valueOf(sslError.getPrimaryError()));
            WebViewUtils.processSslError(sslError);
            WebViewSSLCheck.checkServerCertificateNew(sslErrorHandler, sslError, CustomWebView.this.mContext);
        }

        @Override // android.webkit.WebViewClient
        public void doUpdateVisitedHistory(final WebView webView, final String str, final boolean z) {
            lsy.a(new Runnable() { // from class: com.huawei.operation.view.CustomWebView$WebViewClientBase$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1637x4d9ddc95(str, webView, z);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$doUpdateVisitedHistory$1$com-huawei-operation-view-CustomWebView$WebViewClientBase, reason: not valid java name */
        /* synthetic */ void m1637x4d9ddc95(final String str, final WebView webView, final boolean z) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (str.contains(UriConstants.OAUTH_URL_LOGINCALLBACK)) {
                CustomWebView.this.mIsHasLoginCallbackUrl = true;
            }
            String healthRecommendHost = WebViewUtils.getHealthRecommendHost();
            LogUtil.d(CustomWebView.TAG, "doUpdateVisitedHistory healthRecommendHost = ", healthRecommendHost);
            if (str.startsWith(healthRecommendHost + UriConstants.URL_VMALL_SIGN)) {
                CustomWebView.this.mIsHasVmallSignUrl = true;
            }
            if (WebViewUtils.isUpLoginUrl(str) || WebViewUtils.isVmallMcpLoginUrl(str)) {
                CustomWebView.this.mIsHasVmallSignUrl = true;
            }
            if (WebViewUtils.isVmallUrl(str)) {
                CustomWebView.this.mIsHasVmallSignUrl = true;
            }
            if (!CommonUtil.ab(CustomWebView.this.mContext) && !str.contains(ConfigConstants.BREATHE_URL)) {
                if (CustomWebView.this.mHandler != null) {
                    CustomWebView.this.mHandler.sendEmptyMessage(2001);
                } else {
                    LogUtil.j(CustomWebView.TAG, "doUpdateVisitedHistory mHandler is null");
                }
            }
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.operation.view.CustomWebView$WebViewClientBase$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1636x3ce80fd4(webView, str, z);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$doUpdateVisitedHistory$0$com-huawei-operation-view-CustomWebView$WebViewClientBase, reason: not valid java name */
        /* synthetic */ void m1636x3ce80fd4(WebView webView, String str, boolean z) {
            LogUtil.a(CustomWebView.TAG, "doUpdateVisitedHistory: call super");
            super.doUpdateVisitedHistory(webView, str, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void urlVerification(String str) {
        if (CommonUtil.cl()) {
            LogUtil.j(TAG, "urlVerification: test");
            return;
        }
        if (this.mCurrentUrl.toLowerCase(Locale.ENGLISH).startsWith("https://")) {
            LogUtil.j(TAG, "urlVerification: https");
            return;
        }
        if (Utils.isWhiteFileUrl(str)) {
            return;
        }
        LogUtil.a(TAG, "urlVerification: removeJavascriptInterface");
        this.mWebView.removeJavascriptInterface("JsInteraction");
        this.mWebView.removeJavascriptInterface(Constants.HBS_SDK);
        this.mWebView.removeJavascriptInterface("innerapi");
        this.mWebView.removeJavascriptInterface("tradeApi");
        this.mIsCoreJsMounted = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isLoginHealthVmall() {
        LogUtil.a(TAG, "isLoginHealthVmall");
        this.mVmallUrl = this.mCurrentUrl;
        if (sIsWebViewNoFirstLogin || !this.mIsAuthVmall) {
            return true;
        }
        this.mWebView.stopLoading();
        vmallAtLogin(true);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void biServiceProcessing(WebView webView, String str) {
        InformationBiOperate informationBiOperate = this.mInformationBiOperate;
        if (informationBiOperate != null) {
            informationBiOperate.setBrowseBiAnalytics(this.mContext, str, webView.getTitle());
        }
        if (TextUtils.isEmpty(str) || str.equals(this.sBiCurrentUrl)) {
            return;
        }
        if (!TextUtils.isEmpty(this.sBiCurrentUrl)) {
            lmf.d().b(getBiIdFromUrl(this.sBiCurrentUrl), getUrlLifeCycleBiMap(this.sBiCurrentUrl));
        }
        this.sBiCurrentUrl = str;
        lmf.d().e(getBiIdFromUrl(this.sBiCurrentUrl), getUrlLifeCycleBiMap(this.sBiCurrentUrl));
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(2);
        linkedHashMap.put("flag", "0");
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_WEBVIEW_LOADING_SUCCESS_RATE_80060001.value(), linkedHashMap);
        this.mLoadEndTime = System.currentTimeMillis();
        setTimeBiAnalysis();
    }

    @Override // com.huawei.operation.adapter.SendCurrentUrlCallback
    public String getCurrentUrl() {
        if (TextUtils.isEmpty(this.mCurrentUrl)) {
            LogUtil.a(TAG, "getCurrentUrl mCurrentUrl is empty");
            return "";
        }
        LogUtil.a(TAG, "getCurrentUrl mCurrentUrl != null");
        return this.mCurrentUrl;
    }

    @Override // com.huawei.operation.adapter.SendCurrentUrlCallback
    public String getWebViewUrl() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return getWebViewUrlUiThread();
        }
        return TextUtils.isEmpty(this.mCurrentUrl) ? getWebViewUrlNotUiThread() : this.mCurrentUrl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getWebViewUrlUiThread() {
        try {
            return this.mWebView.getUrl();
        } catch (Throwable unused) {
            LogUtil.e(TAG, "getWebViewUrlUiThread error");
            return "";
        }
    }

    private String getWebViewUrlNotUiThread() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            this.mWebView.post(new Runnable() { // from class: com.huawei.operation.view.CustomWebView.12
                @Override // java.lang.Runnable
                public void run() {
                    String unused = CustomWebView.sWebViewUrl = CustomWebView.this.getWebViewUrlUiThread();
                    if (TextUtils.isEmpty(CustomWebView.sWebViewUrl)) {
                        LogUtil.e(CustomWebView.TAG, "getWebViewUrl is null.");
                    }
                    countDownLatch.countDown();
                }
            });
            if (!countDownLatch.await(ProfileExtendConstants.TIME_OUT, TimeUnit.MILLISECONDS)) {
                LogUtil.e(TAG, " webView await false");
            }
        } catch (InterruptedException e) {
            LogUtil.e(TAG, "getWebViewUrl InterruptedException: ", e.getMessage());
        }
        return sWebViewUrl;
    }

    @Override // com.huawei.operation.adapter.SetTitleCallback
    public void setTitle(final String str) {
        this.mWebView.post(new Runnable() { // from class: com.huawei.operation.view.CustomWebView.13
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a(CustomWebView.TAG, "setTitle");
                CustomWebView.this.setBrowserTitle(str);
            }
        });
    }

    @Override // com.huawei.operation.adapter.SetTitleCallback
    public void setTitleRightBlank(boolean z) {
        LogUtils.i(TAG, "setTitleRightBlank");
        if (this.mHandler != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 2009;
            messageObtain.obj = Boolean.valueOf(z);
            this.mHandler.sendMessage(messageObtain);
            return;
        }
        LogUtil.j(TAG, "setTitleRightBlank mHandler is null");
    }

    @Override // com.huawei.operation.adapter.ShareCallback
    public void onShare(String str, String str2) {
        LogUtil.a(TAG, "onShare activityId = ", str, "  shareType:", str2);
        ShareConfig shareConfig = this.mShareConfig;
        if (shareConfig != null) {
            shareConfig.obtainShareConfig(str, str2, this);
        }
    }

    @Override // com.huawei.operation.adapter.ShareCallback
    public void onShare(String str, String str2, String str3, String str4) {
        ShareConfig shareConfig = this.mShareConfig;
        if (shareConfig != null) {
            shareConfig.obtainShareConfig(str, str2, str3, str4, this);
        }
    }

    @Override // com.huawei.operation.adapter.OnCaptureExtCallback
    public void onShare(String str, String str2, HashMap<String, Object> map) {
        new CaptureUtils(this.mContext).share(str, str2, map);
    }

    @Override // com.huawei.operation.adapter.OnCaptureCallback
    public void onShare(String str) {
        new CaptureUtils(this.mContext).share(str);
    }

    @Override // com.huawei.operation.adapter.OnCaptureCallback
    public void onShareMultiple(String str, int i) {
        new CaptureUtils(this.mContext).share(str, i);
    }

    @Override // com.huawei.operation.share.ShareConfigCallback
    public void onShareConfig(String str, String str2, Bitmap bitmap, String str3) {
        LogUtil.a(TAG, "onShareConfig");
        if (this.mAdapter != null) {
            gxt gxtVar = new gxt(2);
            gxtVar.d(bitmap);
            gxtVar.f(str3);
            gxtVar.e(str);
            gxtVar.b(str2);
            if (this.mIsInformation) {
                gxtVar.d("14");
            } else {
                gxtVar.d(AnalyticsValue.SUCCESSES_SHARE_1100002.value());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("name", str);
            linkedHashMap.put(Constants.BI_ACTIVITY_SHARE_CONTENT, 1);
            gxtVar.c(linkedHashMap);
            this.mAdapter.share(this.mContext.getApplicationContext(), gxtVar, new IBaseResponseCallback() { // from class: com.huawei.operation.view.CustomWebView.14
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a(CustomWebView.TAG, "IBaseResponseCallback errCode:", Integer.valueOf(i));
                }
            });
        }
    }

    @Override // com.huawei.operation.adapter.StartMiniShopWebPage
    public void onStartMiniShopWebPage(String str, String str2) {
        LogUtil.a(TAG, "onStartMiniShopWebPage type is ", str2);
        Message messageObtainMessage = this.mHandler.obtainMessage(2004);
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        bundle.putString("type", str2);
        messageObtainMessage.setData(bundle);
        this.mHandler.sendMessage(messageObtainMessage);
    }

    @Override // com.huawei.operation.adapter.StartWebPage
    public void onStartWebPage(String str) {
        LogUtil.a(TAG, "onStartWebPage");
        Message messageObtainMessage = this.mHandler.obtainMessage(2016);
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        messageObtainMessage.setData(bundle);
        this.mHandler.sendMessage(messageObtainMessage);
    }

    @Override // com.huawei.operation.adapter.StartAppSettingPage
    public void onStartAppSettingPage() {
        LogUtil.a(TAG, "onStartAppSettingPage");
        Message messageObtainMessage = this.mHandler.obtainMessage(2018);
        messageObtainMessage.setData(new Bundle());
        this.mHandler.sendMessage(messageObtainMessage);
    }

    @Override // com.huawei.operation.adapter.TouchSignalCallback
    public void onTouchSignalCallback(boolean z) {
        LogUtil.d(TAG, "onTouchSignalCallback flag is ", Boolean.valueOf(z));
    }

    @Override // com.huawei.operation.adapter.AchievementShareCallback
    public void onAchievementShare(String str, String str2) {
        LogUtil.a(TAG, "onAchievementShare");
        PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
        if (pluginOperationAdapter != null) {
            pluginOperationAdapter.startAchieveAwardShare(this.mContext, str, str2);
        } else {
            LogUtil.a(TAG, "onAchievementShare mAdapter is null");
        }
    }

    @Override // com.huawei.operation.adapter.StartFitnessPageCallback
    public void onStartFitnessPage(Context context, String str, String str2) {
        LogUtil.a(TAG, "onStartFitnessPage");
        PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
        if (pluginOperationAdapter != null) {
            pluginOperationAdapter.startFitnessPage(context, str, str2);
        } else {
            LogUtil.a(TAG, "onStartFitnessPage mAdapter is null");
        }
    }

    @Override // com.huawei.operation.adapter.StartGpsTrackPageCallback
    public void onStartGpsTrackPage(Context context, int i, String str, float f) {
        LogUtil.a(TAG, "onStartGpsTrackPage sportType:", Integer.valueOf(i), " targetType:", str, " targetValue:", Float.valueOf(f));
        PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
        if (pluginOperationAdapter == null) {
            LogUtil.a(TAG, "onStartGpsTrackPage mAdapter is null");
        } else {
            pluginOperationAdapter.startGpsTrackPage(context, i, str, f);
        }
    }

    @Override // com.huawei.operation.adapter.CloseWebCallback
    public void onCloseWebCallback() {
        if (this.mActivity == null || this.mType == 3001) {
            return;
        }
        LogUtil.a(TAG, "onCloseWebCallback");
        this.mActivity.finish();
    }

    @Override // com.huawei.operation.adapter.VmallLoginCallback
    public void onVmallLoginCallback(int i, Object obj) {
        LogUtil.a(TAG, "onVmallLoginCallback");
        if (i != 0 || sIsWebViewNoFirstLogin) {
            return;
        }
        setLoginStatus(true);
        sInnerHandler.sendEmptyMessageDelayed(4001, 1200000L);
        LogUtil.a(TAG, "onPageStarted isHealthVmall removeMessages(MAG_WEB_VIEW_LOAD)");
        this.mHandler.removeMessages(4001);
        if (this.mWebView != null) {
            LogUtil.a(TAG, "pagerStartedWeb != null");
            Message messageObtainMessage = this.mHandler.obtainMessage(2016);
            Bundle bundle = new Bundle();
            bundle.putString("url", this.mVmallUrl);
            messageObtainMessage.setData(bundle);
            this.mHandler.sendMessage(messageObtainMessage);
        }
    }

    @Override // com.huawei.operation.adapter.CloseWebCallback
    public void goBackToMiniShop() {
        LogUtil.a(TAG, "goBackToMiniShop");
        Intent intent = new Intent();
        try {
            intent.setComponent(new ComponentName(Constants.APP_PACKAGE, this.mContext.getPackageManager().getLaunchIntentForPackage(Constants.APP_PACKAGE).getComponent().getClassName()));
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setFlags(67108864);
            this.mContext.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.a(TAG, "activity not found exception.");
        } catch (IllegalStateException e) {
            LogUtil.e(TAG, "goBackToMiniShop ", e.getMessage());
        }
        Intent intent2 = new Intent();
        intent2.setAction("com.huawei.plugin.operation.action_jumt_to_fearture_page");
        LocalBroadcastManager.getInstance().sendBroadcast(intent2);
    }

    @Override // com.huawei.operation.adapter.ToastCallback
    public void onToast(String str, String str2) {
        LogUtil.a(TAG, "onToast");
        if (this.mHandler != null) {
            LogUtil.a(TAG, "onToast not null");
            this.mHandler.obtainMessage(2005, str).sendToTarget();
        }
    }

    @Override // com.huawei.operation.adapter.SendServerErrorMsgCallback
    public void onSendServerErrorMsgCallback() {
        LogUtil.a(TAG, "onSendServerErrorMsgCallback");
        if (this.mHandler != null) {
            LogUtil.a(TAG, "onSendServerErrorMsgCallback not null");
            this.mHandler.obtainMessage(2006).sendToTarget();
        }
    }

    @Override // com.huawei.operation.adapter.SendNoNetMsgCallback
    public void onSendNoNetMsgCallback() {
        LogUtil.a(TAG, "onSendNoNetMsgCallBack");
        if (this.mHandler != null) {
            LogUtil.a(TAG, "onSendNoNetMsgCallBack not null");
            this.mHandler.obtainMessage(2003).sendToTarget();
        }
    }

    @Override // com.huawei.operation.adapter.OnLoginCallback
    public void onLogin(String str, String str2, String str3) {
        LogUtil.a(TAG, "onLogin");
        if (this.mHandler != null) {
            LogUtil.a(TAG, "onLogin is beginning send Message to WebViewActivity");
            Bundle bundle = new Bundle();
            bundle.putString("huid", str);
            bundle.putString("serviceId", str2);
            bundle.putString("function", str3);
            Message messageObtainMessage = this.mHandler.obtainMessage();
            messageObtainMessage.what = 2010;
            messageObtainMessage.setData(bundle);
            this.mHandler.sendMessage(messageObtainMessage);
        }
    }

    @Override // com.huawei.operation.adapter.JsDataCallback
    public void callJsSportDataFunction(String str, String str2, String str3, boolean z) {
        LogUtil.a(TAG, "callJsSportDataFunction enter");
        if (this.mHandler != null) {
            Bundle bundle = new Bundle();
            bundle.putString(Constants.JS_PARAM, str);
            bundle.putString(Constants.JS_FUNCTION_RES, str2);
            bundle.putString(Constants.JS_FUNCTION_ERR, str3);
            bundle.putBoolean(Constants.IS_LEGAL, z);
            Message messageObtainMessage = this.mHandler.obtainMessage(2011);
            messageObtainMessage.setData(bundle);
            this.mHandler.sendMessage(messageObtainMessage);
        }
    }

    @Override // com.huawei.operation.adapter.JsDataCallback
    public void callJsServiceFunction(String str, String str2, String str3, String str4, boolean z) {
        LogUtil.a(TAG, "callJsServiceFunction enter");
        if (this.mHandler != null) {
            Bundle bundle = new Bundle();
            bundle.putString(Constants.JS_SERVICE_TYPE, str);
            bundle.putString(Constants.JS_FUNCTION_RES, str4);
            bundle.putString(Constants.JS_FUNC_TYPE, str2);
            bundle.putString(Constants.JS_PARAM, str3);
            bundle.putBoolean(Constants.IS_LEGAL, z);
            Message messageObtainMessage = this.mHandler.obtainMessage(2013);
            messageObtainMessage.setData(bundle);
            this.mHandler.sendMessage(messageObtainMessage);
        }
    }

    @Override // com.huawei.operation.adapter.OnWebViewStatusCallback
    public void onWebViewStatusCallback(String str) {
        if (this.mHandler != null) {
            this.mWebViewStatusFunction = str;
        }
    }

    @Override // com.huawei.operation.adapter.SleepQuestionnaireCallback
    public void callSleepQuestionnaireJsFunction(final int i, final String str, final String str2) {
        this.mWebView.post(new Runnable() { // from class: com.huawei.operation.view.CustomWebView.15
            @Override // java.lang.Runnable
            public void run() {
                String url;
                if (TextUtils.isEmpty(str2)) {
                    url = "";
                } else {
                    url = WebViewUtils.getUrl(str2, i + "', '" + str);
                }
                if (!TextUtils.isEmpty(url)) {
                    CustomWebView.this.mWebView.loadUrl(url);
                } else {
                    LogUtil.d(CustomWebView.TAG, "TextUtils.isEmpty(callJs)2");
                }
            }
        });
    }

    @Override // com.huawei.operation.adapter.VmallArgSignCallback
    public void callVmallArgSignJsFunction(final int i, final String str, final String str2) {
        this.mWebView.post(new Runnable() { // from class: com.huawei.operation.view.CustomWebView.16
            @Override // java.lang.Runnable
            public void run() {
                String url;
                CustomWebView.this.judgeTriggerVmallLogin(i, str);
                if (TextUtils.isEmpty(str2)) {
                    url = "";
                } else {
                    url = WebViewUtils.getUrl(str2, i + "', '" + str);
                }
                if (!TextUtils.isEmpty(url)) {
                    CustomWebView.this.mWebView.loadUrl(url);
                } else {
                    LogUtil.d(CustomWebView.TAG, "TextUtils.isEmpty(callJs)3");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void judgeTriggerVmallLogin(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a(TAG, "responseData is null! ");
            return;
        }
        if (!sIsWebViewNoFirstLogin && i == 200) {
            int i2 = 0;
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray(Constants.VMALL_SIGN_INFO);
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i3);
                    if (jSONObject.getInt(Constants.VMALL_ARG_TYPE) == 134 || jSONObject.getInt(Constants.VMALL_ARG_TYPE) == 10023) {
                        i2++;
                    }
                }
            } catch (JSONException unused) {
                LogUtil.e(TAG, "Vmall query JSONException");
            }
            try {
                if (new JSONObject(str).getInt("errorCode") != 0) {
                    if (i2 != 2) {
                        return;
                    }
                }
            } catch (JSONException unused2) {
                LogUtil.e(TAG, "Vmall sign JSONException");
            }
            this.mIsAuthVmall = true;
            LogUtil.a(TAG, "shouldOverrideUrlLoading isHealthVmall sendEmptyMessageDelayed DELAY");
            LogUtil.a(TAG, "loadUrlVmall mIsWebViewNoFirstLogin = false mWebView.stopLoading()");
            this.mWebView.setVisibility(4);
            this.mWebView.stopLoading();
            vmallAtLogin(true);
            return;
        }
        LogUtil.e(TAG, "resCode Error && !mIsWebViewNoFirstLogin.");
    }

    @Override // com.huawei.operation.adapter.OnActivityQuitCallback
    public void onActivityQuitCallback(String str) {
        if (this.mHandler != null) {
            setRegisterActivityQuitFunctionRes(str);
            Message messageObtain = Message.obtain();
            messageObtain.what = 2014;
            this.mHandler.sendMessage(messageObtain);
        }
    }

    @Override // com.huawei.operation.adapter.OnVmallCouponCallback
    public void onVmallCouponCallback(String str) {
        if (this.mHandler != null) {
            setRegisterVmallCouponFunctionRes(str);
            Message messageObtain = Message.obtain();
            messageObtain.what = 2017;
            this.mHandler.sendMessage(messageObtain);
            this.mIsVmallCouponPage = true;
        }
    }

    @Override // com.huawei.operation.adapter.OnCaptureCallback
    public void onParseFunction(String str) {
        this.mCaptureFunction = str;
    }

    @Override // com.huawei.operation.adapter.OnCaptureCallback
    public void onCapture(String str) {
        if (this.mWebView != null) {
            LogUtil.a(TAG, "onCapture");
            new CaptureUtils(this.mContext).capture(this.mWebView, str);
        }
    }

    @Override // com.huawei.operation.adapter.OnCaptureCallback
    public void onNoGranted(String str) {
        if (this.mWebView != null) {
            LogUtil.a(TAG, "onNoGranted");
            new CaptureUtils(this.mContext).captureNoPermission(this.mWebView, str);
        }
    }

    @Override // com.huawei.operation.adapter.OnCaptureCallback
    public void onCustomUserPrefSet(final String str, final String str2, final String str3) {
        lsy.a(new Runnable() { // from class: com.huawei.operation.view.CustomWebView.17
            @Override // java.lang.Runnable
            public void run() {
                HiUserPreference hiUserPreference = new HiUserPreference();
                hiUserPreference.setKey(str2);
                hiUserPreference.setValue(str3);
                final boolean userPreference = HiHealthManager.d(BaseApplication.getContext()).setUserPreference(hiUserPreference);
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.huawei.operation.view.CustomWebView.17.1
                    @Override // java.lang.Runnable
                    public void run() {
                        CustomWebView.this.mWebView.loadUrl(WebViewUtils.getUrl(str, String.valueOf(userPreference)));
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void interceptMyhuawei(String str) {
        String url = this.mWebView.getUrl();
        LogUtil.a(TAG, "interceptMyhuawei with ", str, " page: ", url);
        Map<String, Object> myHuaweiLogin = MyHuaweiLogin.getMyHuaweiLogin(str, url, this.mIsFirstLoadMyHuawei);
        boolean zA = qqw.a(myHuaweiLogin, MyHuaweiLogin.IS_START_LOGIN, false);
        final String strD = qqw.d((Map) myHuaweiLogin, MyHuaweiLogin.RELOAD_URL, str);
        if (this.mIsLoadMyHuaweiFail || !zA) {
            return;
        }
        LogUtil.a(TAG, "interceptMyhuawei reloadUrl with ", strD);
        this.mWebView.stopLoading();
        MyHuaweiLogin.handleMyHuaweiLogin(str, new UiCallback<String>() { // from class: com.huawei.operation.view.CustomWebView.18
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str2) {
                ReleaseLogUtil.a(CustomWebView.TAG, "login Myhuawei for error");
                CustomWebView.this.mIsLoadMyHuaweiFail = true;
                CustomWebView.this.reload(strD);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onSuccess(String str2) {
                LogUtil.a(CustomWebView.TAG, "set cookie ", str2);
                CookieManager.getInstance().setCookie(strD, str2);
                CustomWebView.this.mIsFirstLoadMyHuawei = false;
                CustomWebView.this.reload(strD);
            }
        }, this.mActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean interceptVmallLogin(String str) {
        if (!str.contains(this.mMobileVmallHost + ConfigConstants.VMALL_WAP_LOGIN_URL)) {
            return false;
        }
        this.mWebView.stopLoading();
        vmallAtLogin(str.contains(this.mMobileVmallHost + "/account/applogin?url=/personal"));
        return true;
    }

    private void vmallAtLogin(final boolean z) {
        LogUtil.a(TAG, "vmallAtLogin");
        if (TextUtils.isEmpty(this.mCurrentUrl)) {
            this.isVmallLogingIn = false;
            return;
        }
        if (this.isVmallLogingIn) {
            return;
        }
        this.isVmallLogingIn = true;
        setLoginStatus(false);
        if (!LoginInit.getInstance(this.mContext).isBrowseMode()) {
            vmallAtLoginAfterLoginApp(z);
        } else {
            LoginInit.getInstance(this.mContext).browsingToLogin(new IBaseResponseCallback() { // from class: com.huawei.operation.view.CustomWebView$$ExternalSyntheticLambda3
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f$0.m1626lambda$vmallAtLogin$1$comhuaweioperationviewCustomWebView(z, i, obj);
                }
            }, "");
        }
    }

    /* JADX INFO: renamed from: lambda$vmallAtLogin$1$com-huawei-operation-view-CustomWebView, reason: not valid java name */
    /* synthetic */ void m1626lambda$vmallAtLogin$1$comhuaweioperationviewCustomWebView(boolean z, int i, Object obj) {
        LogUtil.a(TAG, "vmallAtLogin: browsingToLogin -> " + i);
        if (i == 0) {
            vmallAtLoginAfterLoginApp(z);
        } else {
            this.isVmallLogingIn = false;
        }
    }

    private void vmallAtLoginAfterLoginApp(boolean z) {
        final String strDecodeRealUrl = z ? this.mCurrentUrl : AuthVmall.decodeRealUrl(this.mCurrentUrl, this.mMobileVmallHost);
        AuthVmall.vmallAtLogin(this.mContext, new IBaseResponseCallback() { // from class: com.huawei.operation.view.CustomWebView$$ExternalSyntheticLambda1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f$0.m1628xf945e3f6(strDecodeRealUrl, i, obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$vmallAtLoginAfterLoginApp$3$com-huawei-operation-view-CustomWebView, reason: not valid java name */
    /* synthetic */ void m1628xf945e3f6(final String str, int i, Object obj) {
        if (i != 0 || TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "vmallAtLoginAfterLoginApp: failed -> ", Integer.valueOf(i));
            this.isVmallLogingIn = false;
        } else {
            LogUtil.a(TAG, "vmallAtLoginAfterLoginApp: success");
            this.mWebView.post(new Runnable() { // from class: com.huawei.operation.view.CustomWebView$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1627x6ca5b8f5(str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$vmallAtLoginAfterLoginApp$2$com-huawei-operation-view-CustomWebView, reason: not valid java name */
    /* synthetic */ void m1627x6ca5b8f5(String str) {
        this.mHandler.removeMessages(4001);
        this.isVmallLogingIn = false;
        setLoginStatus(true);
        this.mWebView.stopLoading();
        AuthVmall.setCookie(str);
        reload(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDarkMode(String str) {
        if (this.mWebView == null) {
            return;
        }
        if (!TextUtils.isEmpty(str) && str.contains(this.mAnnualUrlPre) && Build.VERSION.SDK_INT >= 29) {
            this.mWebView.getSettings().setForceDark(0);
        } else {
            qqs.c(this.mContext, this.mWebView);
        }
    }

    public void setAnnualUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mAnnualUrlPre = str;
    }

    public void setMobileVmallHostUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mMobileVmallHost = str;
    }

    public void setMobileVmallDetailHostUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mMobileVmallDetailHost = str;
    }

    @Override // com.huawei.operation.adapter.OnActivityShowButtonCallback
    public void onShowShareButtonWithFunc(String str) {
        if (this.mHandler != null) {
            if (!TextUtils.isEmpty(str)) {
                setmRegisterActivityShareFunctionRes(str);
            } else {
                LogUtil.j(TAG, "onShowShareButtonWithFunc functionStr is empty");
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 2030;
            this.mHandler.sendMessage(messageObtain);
            return;
        }
        LogUtil.j(TAG, "onShowShareButtonWithFunc mHandler is null1");
    }

    @Override // com.huawei.operation.adapter.OnActivityShowButtonCallback
    public void onShowShareButtonWithId(String str, String str2) {
        if (this.mHandler != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 2030;
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                Bundle bundle = new Bundle();
                bundle.putString("activityId", str);
                bundle.putString(Constants.ACTIVITY_SHARE_TYPE, str2);
                messageObtain.setData(bundle);
            } else {
                LogUtil.j(TAG, "onShowShareButtonWithId activityId or shareType is empty");
            }
            this.mHandler.sendMessage(messageObtain);
            return;
        }
        LogUtil.j(TAG, "onShowShareButtonWithFunc mHandler is null2");
    }

    @Override // com.huawei.operation.adapter.OnActivityShowButtonCallback
    public void onShowRightButtonWithType(int i) {
        if (this.mHandler != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 2031;
            messageObtain.arg1 = i;
            this.mHandler.sendMessage(messageObtain);
            return;
        }
        LogUtil.j(TAG, "onShowShareButtonWithFunc mHandler is null3");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    @Override // com.huawei.operation.adapter.StartSportPage
    public void startToSportPage(String str) {
        str.hashCode();
        switch (str) {
            case "indoor_running":
                startPageMsg(Constants.START_TO_INDOOR_RUNNING);
                break;
            case "outdoor_running":
                startPageMsg(2039);
                break;
            case "main_health":
                startPageMsg(Constants.START_TO_MAIN_ACTIVITY);
                break;
            case "calories":
                startPageMsg(2038);
                break;
            case "ride":
                startPageMsg(2034);
                break;
            case "sleep_card_detail":
                startPageMsg(2033);
                break;
            case "sport_fitness":
                startPageMsg(2037);
                break;
            case "sport_record_swimming":
                startPageMsg(2035);
                break;
            default:
                LogUtil.d(TAG, "handleStartToSportPage default.");
                break;
        }
    }

    private void startPageMsg(final int i) {
        this.mWebView.post(new Runnable() { // from class: com.huawei.operation.view.CustomWebView$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1625lambda$startPageMsg$4$comhuaweioperationviewCustomWebView(i);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$startPageMsg$4$com-huawei-operation-view-CustomWebView, reason: not valid java name */
    /* synthetic */ void m1625lambda$startPageMsg$4$comhuaweioperationviewCustomWebView(int i) {
        LogUtil.a(TAG, "startToSportPage", Integer.valueOf(i));
        this.mHandler.obtainMessage(i, "").sendToTarget();
    }

    public String getBiIdFromUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return Utils.getHostByJdk(str).replace(".", "_");
    }

    public LinkedHashMap<String, String> getUrlLifeCycleBiMap(String str) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(16);
        if (!TextUtils.isEmpty(str)) {
            linkedHashMap.put("url", str);
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void interceptPayUrl(String str) {
        Context context = this.mContext;
        if (context == null || !(context instanceof Activity)) {
            return;
        }
        Activity activity = (Activity) context;
        if (com.huawei.health.h5pro.utils.CommonUtil.isShouldSelfProtection(context, str, false)) {
            activity.getWindow().addFlags(8192);
        } else {
            activity.getWindow().clearFlags(8192);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean interceptUrlWithMyOrderUrl(String str) {
        String str2 = GRSManager.c(this.mContext).getUrl("domainMVmall") + PATH_VMALL_INDEX;
        if (TextUtils.equals(str, str2) && TextUtils.equals(this.mFromWhere, "MyOrderUrl")) {
            LogUtil.a(TAG, "intercepting VMALL index URL from MyOrder: " + str2);
            return true;
        }
        LogUtil.a(TAG, "No VMALL index interception needed");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isInvoiceUrlToBrowser(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Iterator<String> it = BROWSER_URIS.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return true;
            }
        }
        return false;
    }
}
