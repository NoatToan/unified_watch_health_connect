package com.huawei.operation.activity;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.webkit.WebSettingsCompat;
import androidx.webkit.WebViewFeature;
import com.huawei.haf.application.BroadcastManager;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudjs.JsClientApi;
import com.huawei.hwcloudjs.api.IAccessToken;
import com.huawei.hwcloudjs.api.TaskCallBack;
import com.huawei.hwcloudjs.service.hms.HmsCoreApi;
import com.huawei.hwcloudjs.service.hms.HmsLiteCoreApi;
import com.huawei.hwcloudjs.service.hms.bean.AccessTokenInfo;
import com.huawei.hwcloudjs.service.hms.bean.Status;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import com.huawei.login.ui.login.AccountConstants;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.BuildConfig;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.operation.R;
import com.huawei.operation.adapter.PluginOperationAdapter;
import com.huawei.operation.beans.TitleBean;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.ble.BleOperatorImpl;
import com.huawei.operation.h5pro.adapter.H5ProJsAdapter;
import com.huawei.operation.js.JsInteraction;
import com.huawei.operation.jsoperation.JsCommand;
import com.huawei.operation.jsoperation.JsCommandOption;
import com.huawei.operation.jsoperation.JsOperationProducer;
import com.huawei.operation.jsoperation.JsRegisterFunctionResUtil;
import com.huawei.operation.operation.PluginOperation;
import com.huawei.operation.share.CaptureUtils;
import com.huawei.operation.share.ResultCallback;
import com.huawei.operation.utils.ActivityHtmlPathApi;
import com.huawei.operation.utils.AndroidBugWorkaround;
import com.huawei.operation.utils.Constants;
import com.huawei.operation.utils.OperationUtils;
import com.huawei.operation.utils.UriConstants;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.operation.utils.WebViewUtils;
import com.huawei.operation.view.ConfigConstants;
import com.huawei.operation.view.CustomWebView;
import com.huawei.operation.view.VmallOrderView;
import com.huawei.phoneservice.feedbackcommon.network.FeedbackWebConstants;
import com.huawei.pluginbase.PluginBaseAdapter;
import com.huawei.trade.TradeViewApi;
import com.huawei.trade.datatype.TradeViewInfo;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.popupview.PopViewList;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.gsm;
import defpackage.gxt;
import defpackage.lmf;
import defpackage.lsg;
import defpackage.lsy;
import defpackage.ltd;
import defpackage.qji;
import defpackage.qop;
import defpackage.qpx;
import defpackage.qqs;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class WebViewActivity extends BaseActivity implements View.OnClickListener {
    private static final String ANNUAL_URL_CONTENT = "annualReport";
    private static final String BLE_INTRODUCTION_TYPE = "bleIntroductionType";
    private static final String FROM_WHERE = "from";
    private static final String KEY_DEVICE_INFO = "commonDeviceInfo";
    private static final String KEY_OPERATE_CODE = "operateCode";
    private static final String KEY_PRODUCT_ID = "productId";
    private static final String OPERATE_DELETE = "Delete";
    private static final int SCROLL_TO_BOTTOM_VALUE = 3;
    private static final int STEP_FINISH_LOAD = 3;
    private static final int STEP_START_LOAD = 2;
    private static final String TAG = "PluginOperation_WebViewActivity";
    private static final int UNKNOWN_JUMP_MODE = -1;
    private static final String VMALL_API_PATH = "/rest.php";
    private static String mCurrentProductId = null;
    private static boolean mIsDesigner = false;
    private static boolean mIsShowBtnAdd = false;
    private static Activity sActivity = null;
    private static boolean sIsActiveFlag = false;
    private static boolean sIsOrderPrevious = false;
    private String mActivityId;
    private String mActivityShareType;
    private PluginOperationAdapter mAdapter;
    private String mAppMarketType;
    private String mBiId;
    private String mBiName;
    private String mBiSource;
    private String mBleIntroductionType;
    private BleOperatorImpl mBleOperator;
    private HealthButton mBtnNetSetting;
    private Context mContext;
    private CustomTitleBar mCustomTitleBar;
    private CustomWebView mCustomWebView;
    private String mDeviceId;
    private DoubleClickReceiver mDoubleClickReceiver;
    private FrameLayout mFrameLayout;
    private String mFromWhere;
    private H5ProJsAdapter mH5ProJsAdapter;
    private Handler mHandler;
    private String mHealthRecommendHost;
    private boolean mIsFromHeartRateBoard;
    private boolean mIsGuide;
    private String mJsApiId;
    private String mMiaoHealthHost;
    private ImageView mMiaoImageView;
    private HealthTextView mMiaoTextView;
    private String mMobileVmallDetailHost;
    private String mMobileVmallHost;
    private RelativeLayout mNetworkLayout;
    private HealthTextView mNoNetworkTips;
    private qop mPopView;
    private HealthProgressBar mProgressBar;
    private RelativeLayout mRelativeLayout;
    private RelativeLayout mReloadLayout;
    private String mShopUrlStart;
    private LinearLayout mShoppingLayOut;
    private String mShouldBiShowTime;
    private RelativeLayout mTabsRelativeLayout;
    private ImageView mTipsImageView;
    private String mTitle;
    private float mTouchX;
    private float mTouchY;
    private ImageView mTradeImageview;
    private HealthTextView mTradeTextview;
    private LinearLayout mTraderOrder;
    private String mType;
    private String mUrl;
    private ImageView mVmallImageView;
    private HealthTextView mVmallTextView;
    private WebView mWebView;
    private LinearLayout mWebViewLayout;
    private HealthTextView mWebViewTipsCheckDate;
    private HealthTextView mWebViewTipsCustomerService;
    private HealthTextView mWebViewTipsUpdate;
    private WebViewActivityExt webViewActivityExt;
    private static lmf sBiAnalyticsUtil = lmf.d();
    private static IBaseResponseCallback mCallback = null;
    private View mShoppingView = null;
    private Map<String, String> mShareData = new HashMap();
    private boolean mIsNextPageLeftBtnArrowType = false;
    private boolean mIsSetting = true;
    private boolean mIsShowTitleRightDeleteDevice = false;
    private int mJumpModeKey = -1;
    private int mUiOptions = 0;
    private String mProductId = null;
    private ContentValues mDeviceInfo = null;
    private long mBiStartTime = 0;
    private long mBiPauseTime = 0;
    private long mBiTotalTime = 0;
    private boolean mIsMiaoChoose = false;
    private boolean mIsVmallChoose = false;
    private boolean mIsHealthChoose = false;
    private boolean mIsFirstShowTab = false;
    private boolean mIsOrderManagerPage = false;
    private boolean mIsVmallOrMiaoChoose = true;
    private boolean mIsShowDelete = false;
    private boolean mIsFirstShow = true;
    private boolean mIsFullScreen = false;

    static {
        JsClientApi.setGrsAppName(AccountConstants.GRS_APP_NAME);
        if (CommonUtil.z(BaseApplication.getContext())) {
            LogUtil.a(TAG, "registerJsApi HmsLiteCoreApi");
            JsClientApi.registerJsApi(HmsLiteCoreApi.class);
            JsClientApi.registerIAccessTokenClass(new IAccessToken() { // from class: com.huawei.operation.activity.WebViewActivity.1
                @Override // com.huawei.hwcloudjs.api.IAccessToken
                public void getAccessToken(TaskCallBack taskCallBack) {
                    String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1008);
                    Status status = new Status(0, "success");
                    status.setSuccessFlag(true);
                    taskCallBack.onResult(new AccessTokenInfo(accountInfo, status));
                }
            });
        } else {
            JsClientApi.registerJsApi(HmsCoreApi.class);
            LogUtil.a(TAG, "registerJsApi HmsCoreApi");
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    static class CheckUserWeightCallback implements IBaseResponseCallback {
        private WeakReference<WebViewActivity> mWebViewActivity;

        CheckUserWeightCallback(WebViewActivity webViewActivity) {
            this.mWebViewActivity = new WeakReference<>(webViewActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, final Object obj) {
            final WebViewActivity webViewActivity = this.mWebViewActivity.get();
            if (webViewActivity == null || webViewActivity.mWebView == null || webViewActivity.mAdapter == null) {
                LogUtil.j(WebViewActivity.TAG, "activity or mWebView mAdapter is null");
            } else {
                webViewActivity.mWebView.post(new Runnable() { // from class: com.huawei.operation.activity.WebViewActivity$CheckUserWeightCallback$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        WebViewActivity webViewActivity2 = webViewActivity;
                        webViewActivity2.mAdapter.checkUserWeightAndShowDialog(webViewActivity2, obj);
                    }
                });
            }
        }
    }

    public static void setActiveFlag(boolean z) {
        sIsActiveFlag = z;
    }

    public static boolean getActiveFlag() {
        return sIsActiveFlag;
    }

    public static void setIsDesigner(boolean z) {
        mIsDesigner = z;
    }

    public static boolean getIsDesigner() {
        return mIsDesigner;
    }

    public static boolean getIsShowBtnAdd() {
        return mIsShowBtnAdd;
    }

    public static String getProductId() {
        return mCurrentProductId;
    }

    public static void setProductId(String str) {
        mCurrentProductId = str;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void loadApplicationTheme() {
        LogUtil.a(TAG, "loadApplicationTheme: setTheme");
        setTheme(R.style.OperationAppTheme);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mContext = this;
        Intent intent = getIntent();
        if (intent != null) {
            this.mUrl = intent.getStringExtra("url");
            this.mFromWhere = intent.getStringExtra("from");
            this.mAppMarketType = intent.getStringExtra("app_type");
            this.mDeviceInfo = (ContentValues) intent.getParcelableExtra(KEY_DEVICE_INFO);
            String stringExtra = intent.getStringExtra("productId");
            this.mProductId = stringExtra;
            setProductId(stringExtra);
            this.mBleIntroductionType = intent.getStringExtra(BLE_INTRODUCTION_TYPE);
            this.mDeviceId = intent.getStringExtra("deviceId");
            this.mJumpModeKey = intent.getIntExtra(Constants.JUMP_MODE_KEY, -1);
            if (!TextUtils.isEmpty(this.mUrl)) {
                String strTrim = this.mUrl.trim();
                this.mUrl = strTrim;
                intent.putExtra("url", strTrim);
            }
            ContentValues contentValues = this.mDeviceInfo;
            if (contentValues == null || contentValues.size() == 0) {
                ContentValues contentValues2 = new ContentValues();
                this.mDeviceInfo = contentValues2;
                contentValues2.put("uniqueId", intent.getStringExtra("uniqueId"));
                this.mDeviceInfo.put("name", intent.getStringExtra("name"));
                this.mDeviceInfo.put("deviceType", intent.getStringExtra("deviceType"));
                this.mDeviceInfo.put(Constants.KEY_BLE_SCAN_MODE, Integer.valueOf(intent.getIntExtra(Constants.KEY_BLE_SCAN_MODE, 0)));
            }
            if (OPERATE_DELETE.equals(intent.getStringExtra(KEY_OPERATE_CODE))) {
                this.mIsShowDelete = true;
            }
            if (!TextUtils.isEmpty(this.mDeviceId)) {
                JsInteraction.setDeviceId(this.mDeviceId);
            }
        }
        keepScreenOn();
        this.mIsFullScreen = WebViewUtils.isFullScreen(this.mUrl);
        clearFullScreen();
        this.webViewActivityExt = new WebViewActivityExt();
        WebViewHelp.putBiEventLoadPage(this.mUrl, 2);
        initGrsManager();
    }

    private void clearFullScreen() {
        if (this.mIsFullScreen) {
            return;
        }
        try {
            getWindow().clearFlags(1024);
        } catch (RuntimeException e) {
            LogUtil.e(TAG, "clearFullScreen: fullscreenException -> ", e.getMessage());
        }
    }

    private void keepScreenOn() {
        GRSManager.c(this.mContext).d("messageCenterUrl", new GrsQueryCallback() { // from class: com.huawei.operation.activity.WebViewActivity.2
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(final String str) {
                LogUtil.d(WebViewActivity.TAG, "onCreate messageCenterHost = ", str);
                WebViewActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.operation.activity.WebViewActivity.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (TextUtils.isEmpty(WebViewActivity.this.mUrl)) {
                            return;
                        }
                        if (TextUtils.equals(str + BuildConfig.BREATHE_SERVICE_URL, WebViewActivity.this.mUrl)) {
                            WebViewActivity.this.getWindow().addFlags(128);
                        }
                    }
                });
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                LogUtil.j(WebViewActivity.TAG, "onCallBackFail index = ", Integer.valueOf(i));
            }
        });
    }

    private void dealTitleBar() {
        if (TextUtils.isEmpty(this.mUrl)) {
            return;
        }
        if (this.mUrl.contains(ConfigConstants.VMALL_URL) || this.mUrl.contains(ConfigConstants.VMALL_CN_URL) || this.mUrl.contains(Constants.VMALL_TYPE_WITH_PREFIX)) {
            this.mCustomTitleBar.setAppBarVisible(false);
        }
    }

    private void initParam() {
        if (TextUtils.isEmpty(this.mUrl)) {
            return;
        }
        boolean zContains = Uri.decode(this.mUrl).contains(Constants.INFORMATION_PLATFORM);
        CustomWebView customWebView = this.mCustomWebView;
        if (customWebView != null) {
            customWebView.setInformationFlag(zContains);
        }
    }

    private void initGrsManager() {
        if (this.mHandler == null) {
            this.mHandler = new CommonWebViewActivityHandler(getMainLooper(), this);
        }
        lsy.a(new InitGrsManagerRunnable(this));
    }

    /* JADX INFO: loaded from: classes13.dex */
    static class InitGrsManagerRunnable implements Runnable {
        private final WeakReference<WebViewActivity> weakActivity;

        InitGrsManagerRunnable(WebViewActivity webViewActivity) {
            this.weakActivity = new WeakReference<>(webViewActivity);
        }

        @Override // java.lang.Runnable
        public void run() {
            WebViewUtils.initMyTabGrsUrl(new ResultCallback() { // from class: com.huawei.operation.activity.WebViewActivity.InitGrsManagerRunnable.1
                @Override // com.huawei.operation.share.ResultCallback
                public void onResult(int i, Object obj) {
                    WebViewActivity webViewActivity = (WebViewActivity) InitGrsManagerRunnable.this.weakActivity.get();
                    if (webViewActivity == null || !(obj instanceof List)) {
                        return;
                    }
                    List list = (List) obj;
                    if (list.size() >= 4) {
                        webViewActivity.mMobileVmallHost = (String) list.get(0);
                        webViewActivity.mShopUrlStart = (String) list.get(1);
                        webViewActivity.mHealthRecommendHost = (String) list.get(2);
                        webViewActivity.mMiaoHealthHost = (String) list.get(3);
                        webViewActivity.mMobileVmallDetailHost = (String) list.get(4);
                        webViewActivity.mHandler.sendEmptyMessage(2015);
                        return;
                    }
                    LogUtil.j(WebViewActivity.TAG, "wrong size");
                }
            });
        }
    }

    private void initAppMarketUrl() {
        if (CommonUtil.ap()) {
            String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "developeroptions", "developerswitch");
            LogUtil.a(TAG, "is beta version, developer:", strE);
            if (strE != null && strE.equals("1")) {
                getAppMarketDevelopUrl();
                return;
            }
            this.mUrl += "/sandbox/cch5/health/appMarketBeta/dist/index.html";
            return;
        }
        if (CommonUtil.cl()) {
            LogUtil.a(TAG, "is test version");
            return;
        }
        LogUtil.a(TAG, "is release version");
        this.mUrl += "/cch5/health/appMarket/dist/index.html#/index";
    }

    private void getAppMarketDevelopUrl() {
        String contentCenterTest;
        String strE = SharedPreferenceManager.e(this.mContext, "APP_MARKET", "app_market_test_url");
        String strE2 = SharedPreferenceManager.e(this.mContext, "APP_MARKET", "app_market_site_key");
        if (TextUtils.isEmpty(strE2)) {
            strE2 = "appMarketBeta";
        }
        if ("app_market_test".equals(strE)) {
            PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
            if (pluginOperationAdapter == null) {
                PluginBaseAdapter adapter = PluginOperation.getInstance(this.mContext).getAdapter();
                if (adapter instanceof PluginOperationAdapter) {
                    this.mAdapter = (PluginOperationAdapter) adapter;
                }
                if (this.mAdapter == null) {
                    this.mAdapter = WebViewHelp.initAdapter();
                }
                PluginOperationAdapter pluginOperationAdapter2 = this.mAdapter;
                if (pluginOperationAdapter2 != null) {
                    contentCenterTest = pluginOperationAdapter2.getContentCenterTest();
                } else {
                    LogUtil.j(TAG, "getAppMarketDevelopUrl mAdapter is null");
                    contentCenterTest = "";
                }
            } else {
                contentCenterTest = pluginOperationAdapter.getContentCenterTest();
            }
            this.mUrl = contentCenterTest + Constants.H5_URL_BASE_PATH_TEST + strE2 + "/dist/index.html";
            return;
        }
        this.mUrl += Constants.H5_URL_BASE_PATH_BETA + strE2 + "/dist/index.html";
    }

    private void initWebView() {
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("url");
            this.mUrl = stringExtra;
            if (TextUtils.isEmpty(stringExtra)) {
                this.mUrl = "";
            }
            enableSlowWholeDocumentDraw(this.mUrl);
        }
    }

    public void enableSlowWholeDocumentDraw(String str) {
        if (WebViewHelp.isAnnualReportUrl(str) || WebViewHelp.isGroupChallenge(str)) {
            LogUtil.a(TAG, "enableSlowWholeDocumentDraw");
            WebView.enableSlowWholeDocumentDraw();
        }
    }

    private void initErrorView() {
        LogUtil.a(TAG, "CommonUtil.isErrorWebView");
        ((HealthButton) findViewById(R.id.btn_go_setting)).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.operation.activity.WebViewActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1505x636592d2(view);
            }
        });
        CustomTitleBar customTitleBar = (CustomTitleBar) qsp.a(this, R.id.mini_shop__webview_titlebar);
        this.mCustomTitleBar = customTitleBar;
        customTitleBar.setTitleText(this.mContext.getString(R.string.IDS_apphelp_pwindows_back_button));
    }

    /* JADX INFO: renamed from: lambda$initErrorView$0$com-huawei-operation-activity-WebViewActivity, reason: not valid java name */
    /* synthetic */ void m1505x636592d2(View view) {
        LogUtil.a(TAG, "CommonUtil.uninstallApk");
        CommonUtil.p(this.mContext, "com.google.android.webview");
    }

    private void initIntentData() {
        LogUtil.a(TAG, "initIntentData");
        Intent intent = getIntent();
        if (intent != null) {
            this.mIsGuide = intent.getBooleanExtra(Constants.IS_GUIDE, false);
            this.mType = intent.getStringExtra("type");
            this.mUrl = intent.getStringExtra("url");
            this.mIsFromHeartRateBoard = intent.getBooleanExtra(Constants.IS_START_FROM_HEART_RATE_BOARD, false);
            if (TextUtils.isEmpty(this.mUrl)) {
                this.mUrl = "";
            }
            LogUtil.a(TAG, "initIntentData mUrl");
            if ("appMarket".equals(this.mFromWhere)) {
                initAppMarketUrl();
            }
            this.mTitle = intent.getStringExtra("title");
            this.mBiId = intent.getStringExtra("EXTRA_BI_ID");
            this.mBiName = intent.getStringExtra("EXTRA_BI_NAME");
            this.mBiSource = intent.getStringExtra("EXTRA_BI_SOURCE");
            this.mShouldBiShowTime = intent.getStringExtra("EXTRA_BI_SHOWTIME");
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        LogUtil.d(TAG, "onNewIntent");
        super.onNewIntent(intent);
        setIntent(intent);
        try {
            requestWindowFeature(1);
            if (this.mIsFullScreen) {
                WebViewHelp.setFullScreen(getWindow());
            }
        } catch (RuntimeException unused) {
            LogUtil.e(TAG, "Not support no title error.");
        }
        try {
            setContentView(R.layout.activity_common_web_view);
            clearFullScreen();
            this.mType = "";
            String stringExtra = intent.getStringExtra("url");
            this.mUrl = stringExtra;
            if (TextUtils.isEmpty(stringExtra)) {
                this.mUrl = "";
            }
            initView();
        } catch (RuntimeException unused2) {
            LogUtil.e(TAG, "onNewIntent webview error.");
            finish();
        }
    }

    private void initView() {
        LogUtil.a(TAG, "initView");
        initWebViewLayout();
        initLayout();
        initOnTouchListener();
        initLongClickImageShare();
        initData();
        initParam();
        showShoppingView();
    }

    private void initLayout() {
        this.mFrameLayout = (FrameLayout) qsp.a(this, R.id.web_view_frame_layout);
        this.mRelativeLayout = (RelativeLayout) qsp.a(this, R.id.web_view_relative_layout);
        CustomWebView customWebView = new CustomWebView(this.mContext, (HealthProgressBar) findViewById(R.id.load_url_progress), this.mWebView, this.mHandler, 3002);
        this.mCustomWebView = customWebView;
        customWebView.initFrameLayout(this.mContext, this.mFrameLayout);
        this.mCustomWebView.setFromWhere(this.mFromWhere);
        this.mCustomWebView.setAnnualUrl(ANNUAL_URL_CONTENT);
        this.mCustomWebView.setMobileVmallHostUrl(this.mMobileVmallHost);
        this.mCustomWebView.setMobileVmallDetailHostUrl(this.mMobileVmallDetailHost);
        H5ProJsAdapter h5ProJsAdapter = new H5ProJsAdapter(this.mWebView, this.mRelativeLayout);
        this.mH5ProJsAdapter = h5ProJsAdapter;
        h5ProJsAdapter.mountH5ProInterfaces(this.mUrl);
        BleOperatorImpl bleOperatorImpl = new BleOperatorImpl();
        this.mBleOperator = bleOperatorImpl;
        String str = this.mProductId;
        if (str != null) {
            bleOperatorImpl.startBleState(this.mContext, str, this.mWebView, this.mHandler);
        }
        ContentValues contentValues = this.mDeviceInfo;
        if (contentValues != null) {
            this.mBleOperator.setDeviceInfo(contentValues);
        }
        this.mProgressBar = this.mCustomWebView.getProgressBar();
        setCustomTitleBar();
        this.mCustomWebView.setTextView(this.mCustomTitleBar.getViewTitle());
        if (!TextUtils.isEmpty(this.mTitle)) {
            this.mCustomWebView.setTitle(this.mTitle);
        }
        this.mReloadLayout = (RelativeLayout) qsp.a(this, R.id.reload_layout);
        this.mNetworkLayout = (RelativeLayout) qsp.a(this, R.id.net_work_layout);
        this.mBtnNetSetting = (HealthButton) qsp.a(this, R.id.btn_no_net_work);
        this.mTipsImageView = (ImageView) qsp.a(this, R.id.img_no_net_work);
        this.mNoNetworkTips = (HealthTextView) qsp.a(this, R.id.tips_no_net_work);
        this.mWebViewTipsUpdate = (HealthTextView) qsp.a(this, R.id.tips_web_view_update);
        this.mWebViewTipsCheckDate = (HealthTextView) qsp.a(this, R.id.tips_web_view_check_date);
        this.mWebViewTipsCustomerService = (HealthTextView) qsp.a(this, R.id.tips_web_view_customer_service);
        this.mShoppingLayOut = (LinearLayout) qsp.a(this, R.id.shopping);
        this.mTraderOrder = (LinearLayout) qsp.a(this, R.id.rl_order);
        initTitle();
    }

    private void initTitle() {
        this.mReloadLayout.setOnClickListener(this);
        this.mNetworkLayout.setOnClickListener(this);
        this.mBtnNetSetting.setOnClickListener(this);
        if (this.mIsFullScreen) {
            ((FrameLayout) qsp.a(this, R.id.webview_framelayout)).setVisibility(8);
        }
        dealTitleBar();
        if (!this.mIsShowDelete || this.mAdapter == null || this.mDeviceInfo == null) {
            return;
        }
        if (this.webViewActivityExt == null) {
            this.webViewActivityExt = new WebViewActivityExt();
        }
        this.webViewActivityExt.showUnBindDeviceDialog(this.mContext, this.mDeviceInfo, this.mProductId, this.mAdapter);
    }

    private void initWebViewLayout() {
        this.mContext = this;
        setActivity(this);
        PluginBaseAdapter adapter = PluginOperation.getInstance(this.mContext).getAdapter();
        if (adapter instanceof PluginOperationAdapter) {
            this.mAdapter = (PluginOperationAdapter) adapter;
        } else {
            this.mAdapter = WebViewHelp.initAdapter();
        }
        if (this.mHandler == null) {
            this.mHandler = new CommonWebViewActivityHandler(getMainLooper(), this);
        }
        this.mWebViewLayout = (LinearLayout) qsp.a(this, R.id.webview_layout);
        this.mWebView = (WebView) qsp.a(this, R.id.web_view);
        if (WebViewHelp.isAnnualReportUrl(this.mUrl)) {
            this.mWebView.setLayerType(1, null);
        } else {
            this.mWebView.setLayerType(2, null);
        }
        LogUtil.a(TAG, "initView = ", Boolean.valueOf(this.mWebView.isHardwareAccelerated()));
        if (WebViewHelp.isAnnualReportUrl(this.mUrl) && Build.VERSION.SDK_INT >= 29) {
            this.mWebView.getSettings().setForceDark(0);
        } else {
            qqs.c(this.mContext, this.mWebView);
        }
        if (qqs.e(this.mContext)) {
            WebSettings settings = this.mWebView.getSettings();
            if (WebViewFeature.isFeatureSupported(WebViewFeature.ALGORITHMIC_DARKENING)) {
                LogUtil.a(TAG, "initWebViewLayout: setAlgorithmicDarkeningAllowed");
                WebSettingsCompat.setAlgorithmicDarkeningAllowed(settings, true);
            }
            if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK)) {
                LogUtil.a(TAG, "initWebViewLayout: setForceDark");
                WebSettingsCompat.setForceDark(settings, 2);
            }
            if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK_STRATEGY)) {
                LogUtil.a(TAG, "initWebViewLayout: setForceDarkStrategy");
                WebSettingsCompat.setForceDarkStrategy(settings, 2);
            }
        }
    }

    private void showShoppingView() {
        View shoppingView = getShoppingView();
        this.mShoppingView = shoppingView;
        if (shoppingView == null) {
            LogUtil.j(TAG, "showShoppingView: Get shopping view failed !!");
            return;
        }
        LogUtil.a(TAG, "showShoppingView: Get shopping view success !!");
        if (this.mIsFullScreen) {
            this.mShoppingLayOut.setVisibility(8);
            LogUtil.a(TAG, "showShoppingView: mIsFullScreen is true");
        } else if (this.mWebView.getVisibility() != 0) {
            this.mShoppingLayOut.setVisibility(8);
            LogUtil.a(TAG, "showShoppingView: mWebView is NOT visible");
        } else {
            this.mShoppingLayOut.removeAllViews();
            this.mShoppingLayOut.addView(this.mShoppingView);
            this.mShoppingLayOut.setVisibility(0);
        }
    }

    private View getShoppingView() {
        if (this.mShoppingView != null) {
            cancelShoppingView();
        }
        if (TextUtils.isEmpty(this.mUrl)) {
            LogUtil.j(TAG, "getShoppingView: url is null");
            return this.mShoppingView;
        }
        Uri uri = Uri.parse(this.mUrl);
        try {
            if (!"Merchandise".equals(uri.getQueryParameter("pullCategory"))) {
                LogUtil.a(TAG, "getShoppingView: Not shopping page");
                return this.mShoppingView;
            }
            String queryParameter = uri.getQueryParameter("productId");
            String queryParameter2 = uri.getQueryParameter(WebViewHelp.BI_KEY_PULL_FROM);
            String queryParameter3 = uri.getQueryParameter("fromPageTitle");
            if (TextUtils.isEmpty(queryParameter)) {
                LogUtil.j(TAG, "getShoppingView: No product information.");
                return this.mShoppingView;
            }
            if (TextUtils.isEmpty(queryParameter)) {
                LogUtil.j(TAG, "getShoppingView：productId is null!");
                return this.mShoppingView;
            }
            TradeViewApi tradeViewApi = (TradeViewApi) Services.d("TradeService", TradeViewApi.class);
            if (tradeViewApi == null) {
                LogUtil.j(TAG, "getShoppingView：get trade feature failed !!!");
                return this.mShoppingView;
            }
            TradeViewInfo tradeViewInfo = new TradeViewInfo(queryParameter);
            tradeViewInfo.setPositionId(queryParameter2);
            tradeViewInfo.setFromPageTitle(queryParameter3);
            HashMap map = new HashMap(16);
            map.put(WebViewHelp.BI_KEY_PULL_FROM, uri.getQueryParameter(WebViewHelp.BI_KEY_PULL_FROM));
            map.put("resourceId", uri.getQueryParameter("resourceId"));
            map.put("resourceName", uri.getQueryParameter("resourceName"));
            map.put("pullOrder", uri.getQueryParameter("pullOrder"));
            tradeViewInfo.setBiParams(map);
            View tradeView = tradeViewApi.getTradeView(this.mContext, tradeViewInfo);
            this.mShoppingView = tradeView;
            return tradeView;
        } catch (UnsupportedOperationException unused) {
            LogUtil.e(TAG, "getShoppingView: Exception = UnsupportedOperationException");
            return this.mShoppingView;
        }
    }

    private void cancelShoppingView() {
        if (this.mShoppingView == null) {
            return;
        }
        TradeViewApi tradeViewApi = (TradeViewApi) Services.d("TradeService", TradeViewApi.class);
        if (tradeViewApi == null) {
            LogUtil.j(TAG, "cancelShoppingView：get trade feature failed !!!");
        } else {
            tradeViewApi.cancelView(this.mShoppingView);
            this.mShoppingView = null;
        }
    }

    private void initData() {
        if (!Constants.HEALTH_SHOP_TYPE.equals(this.mType) && !CommonUtil.ab(this.mContext) && !CommonUtil.ca() && !TextUtils.isEmpty(this.mUrl) && !this.mUrl.contains(ConfigConstants.BREATHE_URL)) {
            showNoNetworkPage();
        }
        boolean zCheckOrderManagerPage = WebViewHelp.checkOrderManagerPage(this.mUrl);
        this.mIsOrderManagerPage = zCheckOrderManagerPage;
        LogUtil.a(TAG, "initData mIsOrderManagerPage:", Boolean.valueOf(zCheckOrderManagerPage));
        if (this.mIsOrderManagerPage) {
            initTheTabsView();
        }
        initEvent();
        WebViewHelp.setBiSource(this.mUrl, this.mCustomWebView, this.mBiId, this.mBiName, this.mBiSource);
        WebViewHelp.initGlobalBiParam(this.mUrl);
        if (!Utils.o() || CommonUtil.cj()) {
            if (CommonUtil.cl()) {
                LogUtil.a(TAG, "initData test version register jssdk");
                this.mJsApiId = JsClientApi.createApi(this.mWebView, new JsClientApi.SdkOpt.Builder().setShowAuthDlg(false).build());
            } else if (!TextUtils.isEmpty(this.mUrl) && this.mUrl.startsWith("https://")) {
                LogUtil.a(TAG, "initData https protocol url register jssdk");
                this.mJsApiId = JsClientApi.createApi(this.mWebView, new JsClientApi.SdkOpt.Builder().setShowAuthDlg(false).build());
            } else if (isRightVersion()) {
                LogUtil.a(TAG, "initData TestThirdDevice or Release local security url register jssdk");
                this.mJsApiId = JsClientApi.createApi(this.mWebView, new JsClientApi.SdkOpt.Builder().setShowAuthDlg(false).build());
            } else {
                LogUtil.a(TAG, "initData not test or not third or not https protocol url register jssdk");
            }
            setJsUrl();
        }
        AndroidBugWorkaround.assistActivity(this);
        this.mUiOptions = getWindow().getDecorView().getSystemUiVisibility();
    }

    private void setJsUrl() {
        GRSManager.c(this).d("domainApiVmall", new GrsQueryCallback() { // from class: com.huawei.operation.activity.WebViewActivity.3
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                LogUtil.d(WebViewActivity.TAG, "initView vmallHostGrs = ", str);
                if (TextUtils.isEmpty(str)) {
                    LogUtil.e(WebViewActivity.TAG, "initData the vmallHostGrs is empty");
                    return;
                }
                JsClientApi.setJsUrl(str + WebViewActivity.VMALL_API_PATH);
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                LogUtil.j(WebViewActivity.TAG, "onCallBackFail index = ", Integer.valueOf(i));
            }
        });
    }

    private boolean isRightVersion() {
        return (CommonUtil.cj() || CommonUtil.bu() || CommonUtil.ap() || CommonUtil.ao()) && !this.mUrl.contains(FeedbackWebConstants.INVALID_FILE_NAME_PRE) && com.huawei.operation.utils.Utils.isMatchThirdDeviceH5UrlPrefix(this.mUrl);
    }

    private void initEvent() {
        if (this.mUrl.contains(Constants.WENJUANXING_URL_PREFIX) && !this.mUrl.contains(Constants.WENJUANXING_URL_PARAM)) {
            com.huawei.operation.utils.Utils.getWjxSurveyId(this.mUrl, this.mHandler);
        } else {
            this.mWebViewLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.operation.activity.WebViewActivity.4
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    LogUtil.a(WebViewActivity.TAG, "initEvent getViewTreeObserver():", Boolean.valueOf(WebViewActivity.this.mIsFirstShowTab));
                    if (WebViewActivity.this.mIsFirstShowTab) {
                        return;
                    }
                    WebViewActivity.this.mIsFirstShowTab = true;
                    if (WebViewActivity.this.mIsOrderManagerPage) {
                        WebViewActivity.this.mCustomTitleBar.setTitleText(WebViewActivity.this.mContext.getString(R.string.IDS_hwh_home_healthshop_featured_order_management));
                        WebViewActivity.this.customLeftBtnArrowType();
                        WebViewActivity.this.setTradeTabsChoose();
                    } else {
                        LogUtil.a(WebViewActivity.TAG, "initEvent onGlobalLayout() mIsFirstShowTab is true");
                        WebViewActivity.this.mCustomWebView.load(WebViewActivity.this.mUrl);
                    }
                }
            });
        }
        LogUtil.a(TAG, "initEvent mUrl");
        this.mWebView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.huawei.operation.activity.WebViewActivity.5
            @Override // android.view.View.OnScrollChangeListener
            public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                if (WebViewActivity.this.mCustomWebView == null) {
                    return;
                }
                String currentUrl = WebViewActivity.this.mCustomWebView.getCurrentUrl();
                if (TextUtils.isEmpty(currentUrl) || !currentUrl.startsWith(WebViewActivity.this.mShopUrlStart)) {
                    return;
                }
                if ((WebViewActivity.this.mWebView.getContentHeight() * WebViewActivity.this.mWebView.getScale()) - (WebViewActivity.this.mWebView.getHeight() + WebViewActivity.this.mWebView.getScrollY()) < 3.0f) {
                    HashMap map = new HashMap(16);
                    map.put("click", "1");
                    map.put("title", WebViewActivity.this.mCustomTitleBar.getViewTitle().getText());
                    map.put("url", WebViewActivity.this.mCustomWebView.getCurrentUrl());
                    lmf.d().c(WebViewActivity.this.mContext, AnalyticsValue.HEALTH_SHOP_BOTOOM_2120007.value(), map, 0);
                }
            }
        });
    }

    private void initTheTabsView() {
        if (qrs.v()) {
            qsp.a(this, R.id.tabs_rl_layout).setVisibility(8);
            ViewStub viewStub = (ViewStub) qsp.a(this, R.id.scroll_view_view_sub);
            if (viewStub.getParent() != null) {
                View viewInflate = viewStub.inflate();
                this.mTabsRelativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.tabs_rl_layout_Large);
                this.mVmallTextView = (HealthTextView) viewInflate.findViewById(R.id.vmall_text_view_Large);
                this.mVmallImageView = (ImageView) viewInflate.findViewById(R.id.vmall_image_Large);
                this.mMiaoImageView = (ImageView) viewInflate.findViewById(R.id.miao_image_large);
                this.mMiaoTextView = (HealthTextView) viewInflate.findViewById(R.id.miao_text_view_Large);
                this.mTradeTextview = (HealthTextView) viewInflate.findViewById(R.id.trade_text_view_Large);
                this.mTradeImageview = (ImageView) viewInflate.findViewById(R.id.trade_image_Large);
            }
        } else {
            RelativeLayout relativeLayout = (RelativeLayout) qsp.a(this, R.id.tabs_rl_layout);
            this.mTabsRelativeLayout = relativeLayout;
            relativeLayout.setVisibility(0);
            this.mVmallTextView = (HealthTextView) qsp.a(this, R.id.vmall_text_view);
            this.mVmallImageView = (ImageView) qsp.a(this, R.id.vmall_image);
            this.mMiaoTextView = (HealthTextView) qsp.a(this, R.id.miao_text_view);
            this.mMiaoImageView = (ImageView) qsp.a(this, R.id.miao_image);
            this.mTradeTextview = (HealthTextView) qsp.a(this, R.id.trade_text_view);
            this.mTradeImageview = (ImageView) qsp.a(this, R.id.trade_image);
        }
        this.mVmallTextView.setOnClickListener(this);
        this.mMiaoTextView.setOnClickListener(this);
        this.mTradeTextview.setOnClickListener(this);
        addTradeView(true);
    }

    private void addTradeView(boolean z) {
        LogUtil.a(TAG, "addTradeView");
        this.mTraderOrder.removeAllViews();
        if (!z) {
            this.mTraderOrder.addView(new VmallOrderView(this));
            return;
        }
        TradeViewApi tradeViewApi = (TradeViewApi) Services.d("TradeService", TradeViewApi.class);
        if (tradeViewApi == null) {
            LogUtil.e(TAG, "getAppData : adapterHealthMgrApi is null.");
            return;
        }
        View orderVeiw = tradeViewApi.getOrderVeiw(this.mContext, 0);
        orderVeiw.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.mTraderOrder.addView(orderVeiw);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTradeTabsChoose() {
        setTheMiaoHealthChoose(false);
        setTheVmallChoose(false);
        setTheTradeText(true);
    }

    private void setTheTradeText(boolean z) {
        this.mIsHealthChoose = z;
        if (z) {
            this.mWebView.setVisibility(8);
            this.mCustomTitleBar.setTitleText(this.mContext.getString(R.string.IDS_hwh_home_healthshop_featured_order_management));
            this.mTradeTextview.setTextColor(getResources().getColor(R.color.common_colorAccent));
            this.mTradeTextview.getPaint().setFakeBoldText(true);
            this.mTradeImageview.setVisibility(0);
            this.mTradeImageview.setBackgroundColor(getResources().getColor(R.color.common_colorAccent));
            if (CommonUtil.ab(this.mContext)) {
                this.mTraderOrder.setVisibility(0);
                return;
            } else {
                LogUtil.j(TAG, "setTheTradeText net not ok");
                showNoNetworkPage();
                return;
            }
        }
        this.mWebView.setVisibility(0);
        this.mTraderOrder.setVisibility(8);
        this.mTradeTextview.setTextColor(getResources().getColor(R.color.textColorSecondary));
        this.mTradeTextview.getPaint().setFakeBoldText(false);
        this.mTradeImageview.setVisibility(4);
    }

    private void setTheTabsChoose(boolean z) {
        LogUtil.a(TAG, "setTheTabsChoose:", Boolean.valueOf(z));
        this.mIsVmallOrMiaoChoose = z;
        setTheVmallChoose(z);
        setTheMiaoHealthChoose(!z);
    }

    private void setTheVmallChoose(boolean z) {
        LogUtil.a(TAG, "setTheVmallChoose:", Boolean.valueOf(z));
        this.mIsVmallChoose = z;
        setTheVmallText(z);
        if (z) {
            setTheTradeText(false);
            this.mTraderOrder.setVisibility(0);
            addTradeView(false);
        }
    }

    private void setTheVmallText(boolean z) {
        if (z) {
            this.mVmallTextView.setTextColor(getResources().getColor(R.color.common_colorAccent));
            this.mVmallTextView.getPaint().setFakeBoldText(true);
            this.mVmallImageView.setVisibility(0);
            this.mVmallImageView.setBackgroundColor(getResources().getColor(R.color.common_colorAccent));
        } else {
            this.mVmallTextView.setTextColor(getResources().getColor(R.color.textColorSecondary));
            this.mVmallTextView.getPaint().setFakeBoldText(false);
            this.mVmallImageView.setVisibility(4);
        }
        this.mVmallTextView.setClickable(!z);
    }

    private void setTheMiaoHealthChoose(boolean z) {
        LogUtil.a(TAG, "setTheMiaoHealthChoose:", Boolean.valueOf(z));
        this.mIsMiaoChoose = z;
        WebViewHelp.setTheMiaoText(z, this.mMiaoTextView, this.mMiaoImageView);
        if (z) {
            setTheTradeText(false);
            String miaoHealthUrlString = WebViewHelp.getMiaoHealthUrlString(this.mMiaoHealthHost);
            LogUtil.a(TAG, "setTheMiaoHealthChoose get the miao health");
            if (TextUtils.isEmpty(miaoHealthUrlString)) {
                return;
            }
            this.mCustomWebView.load(miaoHealthUrlString);
        }
    }

    private void setCustomTitleBar() {
        LogUtil.a(TAG, "setCustomTitleBar");
        CustomTitleBar customTitleBar = (CustomTitleBar) qsp.a(this, R.id.mini_shop__webview_titlebar);
        this.mCustomTitleBar = customTitleBar;
        HealthTextView viewTitle = customTitleBar.getViewTitle();
        if (viewTitle != null) {
            viewTitle.setTextAlignment(5);
        }
        this.mCustomTitleBar.setLeftButtonDrawable(BaseApplication.getContext().getResources().getDrawable(R.drawable.health_navbar_cancel_selector), qre.f(R.string.accessibility_close));
        this.mCustomTitleBar.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.operation.activity.WebViewActivity$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1508xeee96624(view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setCustomTitleBar$1$com-huawei-operation-activity-WebViewActivity, reason: not valid java name */
    /* synthetic */ void m1508xeee96624(View view) {
        handlePushNotificationIntent();
        LogUtil.a(TAG, "setCustomTitleBar in finish!");
        finish();
    }

    private void shareToThirdOrigin() {
        CustomWebView customWebView = this.mCustomWebView;
        if (customWebView == null) {
            LogUtil.e(TAG, "shareToThird mCustomWebView is null.");
            return;
        }
        String webViewTitles = customWebView.getWebViewTitles();
        if (WebViewUtils.isUnreasonableTitle(WebViewUtils.getTitleList(), webViewTitles)) {
            webViewTitles = this.mContext.getResources().getString(R.string.IDS_social_information);
        }
        LogUtil.a(TAG, "shareToThird title is", webViewTitles);
        String string = getString(R.string.IDS_hwh_home_healthshop_webview_share_default_string, new Object[]{webViewTitles});
        LogUtil.d(TAG, "getShareTitleContent():", webViewTitles, "getWebViewOriginalUrl():", string);
        this.mWebView.setDrawingCacheEnabled(false);
        this.mWebView.buildDrawingCache();
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(this.mWebView.getDrawingCache(), 64, 64, true);
        this.mWebView.destroyDrawingCache();
        if (bitmapCreateScaledBitmap == null || bitmapCreateScaledBitmap.getByteCount() > 32768) {
            LogUtil.a(TAG, "bitmap is null or more than max show default picture");
            bitmapCreateScaledBitmap = BitmapFactory.decodeResource(this.mContext.getResources(), R.mipmap.healthlogo_hw_show_app);
        }
        if (!TextUtils.isEmpty(WebViewHelp.getCurrentPageUrl(this.mWebView)) && !"".equals(WebViewHelp.getCurrentPageUrl(this.mWebView))) {
            LogUtil.a(TAG, "Enter share information");
            HashMap map = new HashMap(16);
            map.put("id", this.mBiId);
            map.put("name", this.mBiName);
            gxt gxtVar = new gxt(2);
            gxtVar.b(string);
            gxtVar.d(bitmapCreateScaledBitmap);
            gxtVar.f(WebViewHelp.getCurrentPageUrl(this.mWebView));
            gxtVar.e(webViewTitles);
            gxtVar.d(AnalyticsValue.HEALTH_SHARE_INFORMATION_SHARE_2100007.value());
            gxtVar.c(map);
            OperationUtils.share(this.mContext, gxtVar, false);
            return;
        }
        LogUtil.a(TAG, "getWebViewOriginalUrl() is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void shareToThird() {
        if (this.mCustomWebView == null) {
            LogUtil.e(TAG, "shareToThird mCustomWebView is null.");
            return;
        }
        if (this.mShareData.isEmpty()) {
            shareToThirdOrigin();
            return;
        }
        String webViewTitles = this.mShareData.get(Constants.SHARE_TITLE);
        String str = this.mShareData.get(Constants.SHARE_CONTENT);
        String str2 = this.mShareData.get(Constants.SHARE_BITMAPURL);
        String currentPageUrl = WebViewHelp.getCurrentPageUrl(this.mWebView);
        if (TextUtils.isEmpty(webViewTitles) && (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2))) {
            webViewTitles = this.mCustomWebView.getWebViewTitles();
            if (WebViewUtils.isUnreasonableTitle(WebViewUtils.getTitleList(), webViewTitles)) {
                webViewTitles = this.mContext.getResources().getString(R.string.IDS_social_information);
            }
        }
        LogUtil.a(TAG, "shareToThird title is", webViewTitles);
        if (!TextUtils.isEmpty(currentPageUrl) && !"".equals(currentPageUrl)) {
            LogUtil.a(TAG, "Enter share information");
            this.mCustomWebView.onShare(str2, webViewTitles, str, currentPageUrl);
        } else {
            LogUtil.a(TAG, "getCurrentPageUrl() is null");
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    static class CommonWebViewActivityHandler extends BaseHandler<WebViewActivity> {
        CommonWebViewActivityHandler(Looper looper, WebViewActivity webViewActivity) {
            super(looper, webViewActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        public void handleMessageWhenReferenceNotNull(WebViewActivity webViewActivity, Message message) {
            if (webViewActivity == null) {
                return;
            }
            int i = message.what;
            if (i == 2000) {
                LogUtil.a(WebViewActivity.TAG, "MSG_PROGRESSBAR_GONE");
                webViewActivity.mProgressBar.setVisibility(8);
                return;
            }
            if (i == 2005) {
                LogUtil.a(WebViewActivity.TAG, "MSG_POST_TOAST");
                Object obj = message.obj;
                if (obj instanceof String) {
                    Toast.makeText(webViewActivity.mContext, (String) obj, 0).show();
                    return;
                }
                return;
            }
            if (i == 2010) {
                LogUtil.a(WebViewActivity.TAG, "MSG_SHOW_DIALOG");
                Bundle data = message.getData();
                if (data != null) {
                    WebViewHelp.showServiceTips(webViewActivity.mContext, webViewActivity.mWebView, data.getString("huid"), data.getString("serviceId"), data.getString("function"));
                    return;
                }
                LogUtil.j(WebViewActivity.TAG, "handleMessageWhenReferenceNotNull MSG_SHOW_DIALOG bundle is null");
                return;
            }
            if (i == 2099) {
                LogUtil.a(WebViewActivity.TAG, "MSG_SHARE_FAIL_TOAST");
                qpx.e(webViewActivity.mContext.getApplicationContext(), webViewActivity.mContext.getString(R.string.IDS_submit_error_message_1));
                return;
            }
            if (i == 20010) {
                webViewActivity.mUrl = (String) message.obj;
                webViewActivity.mCustomWebView.load(webViewActivity.mUrl);
            } else if (i == 2021) {
                webViewActivity.updateTitleBarVisibility(8);
            } else if (i != 2022) {
                webViewActivity.handleServerOrNetWorkPage(webViewActivity, message);
            } else {
                webViewActivity.updateTitleBarVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTitleBarVisibility(int i) {
        CustomTitleBar customTitleBar;
        if (this.mJumpModeKey != 0 || (customTitleBar = this.mCustomTitleBar) == null) {
            return;
        }
        customTitleBar.setVisibility(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleServerOrNetWorkPage(WebViewActivity webViewActivity, Message message) {
        int i = message.what;
        if (i == 2001) {
            if (CommonUtil.ab(webViewActivity)) {
                webViewActivity.showNoServicePage();
                return;
            } else {
                webViewActivity.showNoNetworkPage();
                return;
            }
        }
        if (i == 2003) {
            webViewActivity.showNoNetworkPage();
            WebViewHelp.setRightButtonVisibility(8, this.mCustomTitleBar);
            return;
        }
        if (i != 4001) {
            switch (i) {
                case 2006:
                    LogUtil.a(TAG, "MSG_SERVER_ERROR");
                    String currentUrl = this.mCustomWebView.getCurrentUrl();
                    boolean z = WebViewUtils.isVmallMcpLoginUrl(currentUrl) || WebViewUtils.isUpLoginUrl(currentUrl);
                    if (CommonUtil.ab(webViewActivity.mContext) && z) {
                        LogUtil.a(TAG, "isVmallMcpLoginUrl or isUpLoginUrl.");
                        webViewActivity.mNetworkLayout.setVisibility(4);
                    } else {
                        webViewActivity.showServerErrorPage();
                    }
                    break;
                case 2007:
                    LogUtil.a(TAG, "MSG_CONNECT_TIMEOUT");
                    webViewActivity.showUnstableNetworkPage();
                    break;
                case 2008:
                    LogUtil.a(TAG, "MSG_SSL_HANDLE_ERROR");
                    webViewActivity.showSslErrorTipsPage();
                    break;
                default:
                    webViewActivity.handleTitle(webViewActivity, message);
                    break;
            }
            return;
        }
        LogUtil.a(TAG, "MAG_WEB_VIEW_LOAD");
        webViewActivity.showUnstableNetworkPage();
    }

    private void handleTitle(WebViewActivity webViewActivity, Message message) {
        int i = message.what;
        if (i == 2002) {
            LogUtil.a(TAG, "UPDATE_TITLE");
            Object obj = message.obj;
            if (obj instanceof String) {
                String string = (String) obj;
                LogUtil.a(TAG, "handleTitle title=", string);
                if (string.contains(Constants.ABOUT_BLANK) && !CommonUtil.ab(this.mContext)) {
                    string = getString(R.string.IDS_hwh_home_healthshop_no_net_work_pls_click_again);
                }
                if (Constants.NULL.equals(string)) {
                    string = "";
                }
                webViewActivity.mCustomTitleBar.setTitleText(string);
                return;
            }
            return;
        }
        if (i == 2012) {
            LogUtil.a(TAG, "MSG_HANDLE_WEB_VIEW_TITLE");
            webViewActivity.handleWebViewTitle((TitleBean) message.obj);
            return;
        }
        if (i == 2014) {
            LogUtil.a(TAG, "CustomWebView.MSG_QUIT_ACT");
            webViewActivity.customTitleBarRightQuitAct();
            return;
        }
        if (i == 2030) {
            LogUtil.a(TAG, "CustomWebView.MSG_SHOW_SHARE");
            webViewActivity.customTitleBarRightShare();
            if (message.getData() != null) {
                this.mActivityId = message.getData().getString("activityId");
                this.mActivityShareType = message.getData().getString(Constants.ACTIVITY_SHARE_TYPE);
                return;
            }
            return;
        }
        if (i == 2031) {
            LogUtil.a(TAG, "CustomWebView.MSG_SHOW_ACTIVITY_RESULT_NOTE");
            if (message.arg1 == 1) {
                webViewActivity.showNoteBtn();
                return;
            }
            return;
        }
        webViewActivity.handleTitleSec(webViewActivity, message);
    }

    private void handleTitleSec(WebViewActivity webViewActivity, Message message) {
        int i = message.what;
        if (i == 2009) {
            Object obj = message.obj;
            LogUtil.a(TAG, "MSG_SHOW_MY_ACTIVITY isShow = ", obj);
            if (obj instanceof Boolean) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                this.mIsShowTitleRightDeleteDevice = zBooleanValue;
                webViewActivity.showRightTextBtnMyActivity(zBooleanValue);
                return;
            }
            return;
        }
        if (i == 2017) {
            LogUtil.a(TAG, "CustomWebView.MSG_VMALL_COUPON");
            webViewActivity.customTitleBarRightVmallCoupon();
        } else if (i == 2020) {
            LogUtil.a(TAG, "CustomWebView.MSG_RIGHT_BTN_INVISIBLE");
            webViewActivity.setRightBtnInvisible();
        } else {
            webViewActivity.handleStartActivity(webViewActivity, message);
        }
    }

    private void handleSetLeftBtnArrowType(WebViewActivity webViewActivity, Message message) {
        int i = message.what;
        if (i == 20023) {
            LogUtil.a(TAG, "LEFT_BTN_ARROW_TYPE.");
            customLeftBtnArrowType();
        } else if (i == 20025) {
            LogUtil.a(TAG, "NEXT_H5_PAGE_LEFT_BTN_ARROW_TYPE.");
            this.mIsNextPageLeftBtnArrowType = true;
        } else {
            webViewActivity.handleSetShareConfigData(webViewActivity, message);
        }
    }

    private void handleSetShareConfigData(WebViewActivity webViewActivity, Message message) {
        if (message.what == 20024) {
            LogUtil.a(TAG, "SET_SHARE_DATA.");
            Bundle data = message.getData();
            if (data != null) {
                String string = data.getString(Constants.SHARE_BITMAPURL);
                String string2 = data.getString(Constants.SHARE_TITLE);
                String string3 = data.getString(Constants.SHARE_CONTENT);
                String string4 = data.getString(Constants.SHARE_URL);
                if (this.mShareData == null) {
                    this.mShareData = new HashMap();
                }
                if (!TextUtils.isEmpty(string) || !TextUtils.isEmpty(string2) || !TextUtils.isEmpty(string3)) {
                    this.mShareData.put(Constants.SHARE_BITMAPURL, string);
                    this.mShareData.put(Constants.SHARE_TITLE, string2);
                    this.mShareData.put(Constants.SHARE_CONTENT, string3);
                    this.mShareData.put(Constants.SHARE_URL, string4);
                    return;
                }
                this.mShareData.clear();
                return;
            }
            return;
        }
        WebViewHelp.handleSetFullscreen(this.mContext, this.mWebView, getWindow(), webViewActivity, message);
    }

    private void handleStartActivity(WebViewActivity webViewActivity, Message message) {
        int i = message.what;
        if (i == 2004) {
            LogUtil.a(TAG, "MSG_START_MINI_SHOP_WEB_PAGE");
            Bundle data = message.getData();
            if (data != null) {
                String string = data.getString("url");
                String string2 = data.getString("type");
                Intent intent = new Intent(webViewActivity.mContext, (Class<?>) WebViewActivity.class);
                intent.putExtra("url", string);
                intent.putExtra("type", string2);
                webViewActivity.mContext.startActivity(intent);
                return;
            }
            LogUtil.j(TAG, "handleStartActivity MSG_START_MINI_SHOP_WEB_PAGE bundle is null");
            return;
        }
        if (i != 2018) {
            if (i == 20253) {
                LogUtil.a(TAG, "Constants.comeback");
                runOnUiThread(new Runnable() { // from class: com.huawei.operation.activity.WebViewActivity.6
                    @Override // java.lang.Runnable
                    public void run() {
                        LogUtil.a(WebViewActivity.TAG, "Constants.comeback11");
                        WebViewActivity.this.mCustomWebView.goBack();
                    }
                });
                return;
            } else {
                webViewActivity.handleLoadPage(webViewActivity, message);
                return;
            }
        }
        if (webViewActivity.mContext != null) {
            try {
                Intent intent2 = new Intent();
                intent2.setPackage(Constants.APP_PACKAGE);
                intent2.setClassName(Constants.APP_PACKAGE, Constants.APP_SETTING_ACTIVITY);
                webViewActivity.mContext.startActivity(intent2);
            } catch (ActivityNotFoundException unused) {
                LogUtil.a(TAG, "activity not found exception.");
            }
        }
    }

    private void handleLoadPage(WebViewActivity webViewActivity, Message message) {
        int i = message.what;
        boolean z = true;
        if (i == 1) {
            LogUtil.a(TAG, "RESET_ACTIVITY_LIST");
            String activityKeyUrlSp = WebViewUtils.getActivityKeyUrlSp(webViewActivity.mContext);
            ActivityHtmlPathApi activityHtmlPathApi = (ActivityHtmlPathApi) Services.d("PluginOperation", ActivityHtmlPathApi.class);
            if (activityHtmlPathApi != null) {
                webViewActivity.mCustomWebView.load(activityKeyUrlSp + activityHtmlPathApi.getActivityHtmlPath() + Constants.ACTIVITY_HTML);
                return;
            }
            return;
        }
        if (i == 2011) {
            LogUtil.a(TAG, "MSG_GET_SPORT_DATA");
            Bundle data = message.getData();
            if (data != null) {
                webViewActivity.callJsSportDataFunction(data.getString(Constants.JS_PARAM), data.getString(Constants.JS_FUNCTION_RES), data.getString(Constants.JS_FUNCTION_ERR), data.getBoolean(Constants.IS_LEGAL));
                return;
            } else {
                LogUtil.j(TAG, "handleStartActivity MSG_GET_SPORT_DATA bundle is null");
                return;
            }
        }
        if (i == 2015) {
            LogUtil.a(TAG, "CustomWebView.MSG_GRS_GET_URL");
            dealMsgGrsGetUrl(webViewActivity);
            return;
        }
        if (i == 2016) {
            LogUtil.a(TAG, "MSG_START_WEB_PAGE");
            Bundle data2 = message.getData();
            if (data2 != null) {
                webViewActivity.startLoadUrl(data2.getString("url"));
                return;
            } else {
                LogUtil.j(TAG, "handleStartActivity MSG_START_WEB_PAGE bundle is null");
                return;
            }
        }
        if (i != 10085) {
            if (i == 10086) {
                LogUtil.a(TAG, "ON_PAGE_FINISH");
                dealOnPageFinish(webViewActivity, message);
                return;
            } else {
                webViewActivity.handleJsService(webViewActivity, message);
                return;
            }
        }
        LogUtil.a(TAG, "ON_PAGE_STARTED");
        if (message.obj instanceof String) {
            String str = (String) message.obj;
            if (TextUtils.isEmpty(str) || webViewActivity.isResetToOrderManager(str) || (!str.contains(ConfigConstants.VMALL_URL) && !str.contains(ConfigConstants.VMALL_CN_URL))) {
                z = false;
            }
            LogUtil.a(TAG, "ON_PAGE_STARTED: isVmallUrl -> " + z);
            if (z) {
                webViewActivity.setTheTabsView(false);
                webViewActivity.mCustomTitleBar.setAppBarVisible(false);
            }
        }
    }

    private void dealMsgGrsGetUrl(WebViewActivity webViewActivity) {
        webViewActivity.initWebView();
        if (CommonUtil.ac(webViewActivity.mContext.getApplicationContext()) && !Utils.o()) {
            webViewActivity.setContentView(R.layout.fragment_web_view_error_1);
            webViewActivity.initErrorView();
            return;
        }
        try {
            requestWindowFeature(1);
            if (this.mIsFullScreen) {
                WebViewHelp.setFullScreen(getWindow());
            }
        } catch (RuntimeException unused) {
            LogUtil.e(TAG, "Not support no title error.");
        }
        try {
            setContentView(R.layout.activity_common_web_view);
            webViewActivity.initIntentData();
            webViewActivity.initView();
        } catch (RuntimeException unused2) {
            LogUtil.e(TAG, "handleMessage webview error.");
            finish();
        }
    }

    private void dealOnPageFinish(WebViewActivity webViewActivity, Message message) {
        WebViewHelp.putBiEventLoadPage(this.mUrl, 3);
        Object obj = message.obj;
        if (obj instanceof String) {
            String str = (String) obj;
            if (CommonUtil.ab(webViewActivity.mContext)) {
                if (WebViewUtils.isVmallMcpLoginUrl(str) || WebViewUtils.isUpLoginUrl(str)) {
                    webViewActivity.mWebView.setVisibility(4);
                    webViewActivity.mNetworkLayout.setVisibility(4);
                    return;
                } else if (this.mNetworkLayout.getVisibility() != 0) {
                    webViewActivity.mWebView.setVisibility(0);
                }
            }
            boolean zIsResetToOrderManager = webViewActivity.isResetToOrderManager(str);
            boolean z = true;
            boolean z2 = webViewActivity.isOrderSignPage(str) && sIsOrderPrevious;
            LogUtil.a(TAG, "isOrderArgSign:", Boolean.valueOf(z2));
            if (z2) {
                webViewActivity.mWebView.loadUrl(WebViewUtils.getUrl("sessionStorage.clear()"));
            }
            if (!zIsResetToOrderManager && !z2) {
                z = false;
            }
            LogUtil.a(TAG, "isResetToOrderManager isOrder:", Boolean.valueOf(z));
            webViewActivity.setTheTabsView(z);
            sIsOrderPrevious = zIsResetToOrderManager;
        }
        if (this.mIsNextPageLeftBtnArrowType) {
            customLeftBtnArrowType();
            return;
        }
        this.mIsNextPageLeftBtnArrowType = false;
        if (BleConstants.BLE_THIRD_DEVICE_H5.equals(this.mBleIntroductionType)) {
            customLeftBtnArrowType();
            PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
            if (pluginOperationAdapter != null && this.mIsFirstShow && pluginOperationAdapter.isRopeDevice(this.mProductId)) {
                this.mIsFirstShow = false;
                this.mAdapter.getUserInfo(new CheckUserWeightCallback(this));
            }
        }
    }

    private void handleJsService(WebViewActivity webViewActivity, Message message) {
        if (message.what == 2013) {
            Bundle data = message.getData();
            if (data == null) {
                LogUtil.j(TAG, "handleJsService MSG_JS_SERVICE bundle is null");
                return;
            }
            JsCommandOption jsCommandOption = new JsCommandOption();
            jsCommandOption.setServiceType(data.getString(Constants.JS_SERVICE_TYPE));
            jsCommandOption.setFuncType(data.getString(Constants.JS_FUNC_TYPE));
            jsCommandOption.setParam(data.getString(Constants.JS_PARAM));
            jsCommandOption.setFunctionRes(data.getString(Constants.JS_FUNCTION_RES));
            jsCommandOption.setLegal(data.getBoolean(Constants.IS_LEGAL));
            JsCommand jsCommandProduceRequest = JsOperationProducer.produceRequest(jsCommandOption.getServiceType());
            if (jsCommandProduceRequest == null) {
                LogUtil.e(TAG, "MSG_JS_SERVICE error serviceType,it is ", jsCommandOption.getServiceType());
                return;
            } else {
                jsCommandProduceRequest.execute(webViewActivity, webViewActivity.mAdapter, jsCommandOption);
                return;
            }
        }
        webViewActivity.handleSetLeftBtnArrowType(webViewActivity, message);
    }

    private boolean isResetToOrderManager(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (CommonUtil.cl()) {
            LogUtil.a(TAG, "isResetToOrderManager isTestVersion");
            if (!TextUtils.equals(this.mHealthRecommendHost + UriConstants.VMALL_URL_STRING, str)) {
                if (!TextUtils.equals(this.mMiaoHealthHost + UriConstants.MIAO_HEALTH_URL_TEST, str)) {
                    return false;
                }
            }
            return true;
        }
        if (CommonUtil.ap()) {
            LogUtil.a(TAG, "isResetToOrderManager is beta version");
            if (!(this.mHealthRecommendHost + UriConstants.VMALL_URL_STRING).equals(str)) {
                if (!(this.mMiaoHealthHost + UriConstants.MIAO_HEALTH_URL_BETA).equals(str)) {
                    return false;
                }
            }
            return true;
        }
        LogUtil.a(TAG, "isResetToOrderManager is other version");
        if (!TextUtils.equals(this.mHealthRecommendHost + UriConstants.VMALL_URL_STRING, str)) {
            if (!TextUtils.equals(this.mMiaoHealthHost + UriConstants.MIAO_HEALTH_URL, str)) {
                return false;
            }
        }
        return true;
    }

    private boolean isOrderSignPage(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (CommonUtil.cl()) {
            return str.startsWith(this.mHealthRecommendHost + "/healthMallPlat/vmall/index.html#/agrSign");
        }
        return str.startsWith(this.mHealthRecommendHost + "/healthMallPlat/vmall/index.html#/agrSign");
    }

    private void setTheTabsView(boolean z) {
        if (this.mTabsRelativeLayout == null) {
            if (!z) {
                if (qrs.v()) {
                    ViewStub viewStub = (ViewStub) qsp.a(this, R.id.scroll_view_view_sub);
                    if (viewStub.getParent() != null) {
                        this.mTabsRelativeLayout = (RelativeLayout) viewStub.inflate().findViewById(R.id.tabs_rl_layout_Large);
                    }
                } else {
                    this.mTabsRelativeLayout = (RelativeLayout) qsp.a(this, R.id.tabs_rl_layout);
                }
            } else {
                initTheTabsView();
            }
        }
        LogUtil.a(TAG, "isResetToOrderManager isShowTab:", Boolean.valueOf(z));
        if (z) {
            this.mTabsRelativeLayout.setVisibility(0);
            setTheVmallText(this.mIsVmallOrMiaoChoose);
            WebViewHelp.setTheMiaoText(!this.mIsVmallOrMiaoChoose, this.mMiaoTextView, this.mMiaoImageView);
            return;
        }
        this.mTabsRelativeLayout.setVisibility(8);
    }

    private void handleWebViewTitle(TitleBean titleBean) {
        if (this.mIsFullScreen) {
            this.mCustomTitleBar.setAppBarVisible(false);
        } else if (titleBean == null) {
            LogUtil.d(TAG, "titleBean is null");
            if (this.mIsShowTitleRightDeleteDevice) {
                LogUtil.a(TAG, "mIsShowTitleRightDeleteDevice = true");
                return;
            }
            defaultHandleTitle();
        } else if (!titleBean.fetchIsShowAppBar()) {
            this.mCustomTitleBar.setAppBarVisible(false);
        } else {
            this.mCustomTitleBar.setAppBarVisible(true);
            handleCustomTitleBarLeftBtn(titleBean);
            handleCustomTitleBarRightBtn(titleBean);
        }
        if (TextUtils.equals("appMarket", this.mFromWhere)) {
            customLeftBtnArrowType();
        }
    }

    private void handleCustomTitleBarLeftBtn(TitleBean titleBean) {
        if (titleBean == null) {
            return;
        }
        if (TitleBean.LEFT_BTN_TYPE_ARROW.equals(titleBean.fetchGetLeftBtn())) {
            customLeftBtnArrowType();
        } else {
            customLeftBtnCloseType();
        }
    }

    private void handleCustomTitleBarRightBtn(TitleBean titleBean) {
        if (titleBean != null) {
            if (titleBean.fetchGetFeatureUrl() == null || !titleBean.fetchGetFeatureUrl().contains(ConfigConstants.HW_HEALTH_SHOP_URL)) {
                String strFetchGetRightBtn = titleBean.fetchGetRightBtn();
                LogUtil.a(TAG, "rightBtnType = ", strFetchGetRightBtn);
                if (TitleBean.RIGHT_BTN_TYPE_MORE.equals(strFetchGetRightBtn)) {
                    customTitleBarRightMoreType(titleBean);
                    return;
                }
                if (TitleBean.RIGHT_BTN_TYPE_IS_MY_ACTIVITY.equals(strFetchGetRightBtn)) {
                    showRightTextBtnMyActivity(true);
                    return;
                }
                if (TitleBean.RIGHT_BTN_TYPE_SHARE.equals(strFetchGetRightBtn)) {
                    WebViewHelp.setRightButtonVisibility(0, this.mCustomTitleBar);
                    this.mCustomTitleBar.setRightButtonDrawable(BaseApplication.getContext().getResources().getDrawable(R.drawable.health_navbar_share_selector), qre.f(R.string.accessibility_share));
                    View rightIconImage = this.mCustomTitleBar.getRightIconImage();
                    if (rightIconImage != null) {
                        View viewFindViewById = rightIconImage.findViewById(R.id.hwappbarpattern_ok_icon);
                        if (viewFindViewById != null) {
                            viewFindViewById.setContentDescription(this.mContext.getString(R.string.accessibility_share));
                        }
                        rightIconImage.setVisibility(0);
                    }
                    this.mCustomTitleBar.setRightButtonOnClickListener(qji.b(new View.OnClickListener() { // from class: com.huawei.operation.activity.WebViewActivity.7
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            LogUtil.a(WebViewActivity.TAG, "onClick share information");
                            WebViewActivity.this.shareToThird();
                        }
                    }, (BaseActivity) this.mContext, true, ""));
                    return;
                }
                if (this.mIsSetting && "appMarket".equals(this.mFromWhere)) {
                    if (!TextUtils.isEmpty(this.mAppMarketType) && "smart_type".equals(this.mAppMarketType)) {
                        WebViewHelp.setRightButtonVisibility(8, this.mCustomTitleBar);
                        return;
                    } else {
                        WebViewHelp.setRightButtonVisibility(0, this.mCustomTitleBar);
                        return;
                    }
                }
                WebViewHelp.setRightButtonVisibility(8, this.mCustomTitleBar);
                this.mCustomTitleBar.setRightSoftkeyVisibility(8);
            }
        }
    }

    private void setShareRightDrawable() {
        View viewFindViewById;
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            this.mCustomTitleBar.setRightSoftkeyBackground(qqz.e(BaseApplication.getContext(), com.huawei.ui.commonui.R.drawable.ic_health_nav_share_black), qre.f(R.string.accessibility_share));
        } else {
            this.mCustomTitleBar.setRightSoftkeyBackground(ContextCompat.getDrawable(BaseApplication.getContext(), com.huawei.ui.commonui.R.drawable.ic_health_nav_share_black), qre.f(R.string.accessibility_share));
        }
        View rightSoftKey = this.mCustomTitleBar.getRightSoftKey();
        if (rightSoftKey == null || (viewFindViewById = rightSoftKey.findViewById(R.id.hwappbarpattern_menu_icon)) == null) {
            return;
        }
        viewFindViewById.setContentDescription(this.mContext.getString(R.string.accessibility_share));
    }

    private void customTitleBarRightQuitAct() {
        LogUtil.a(TAG, "customTitleBarRightQuitAct");
        WebViewHelp.setRightButtonVisibility(0, this.mCustomTitleBar);
        this.mCustomTitleBar.setRightButtonDrawable(BaseApplication.getContext().getResources().getDrawable(R.drawable.hw_health_shop_more_img), qre.f(R.string.accessibility_more_item));
        this.mCustomTitleBar.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.operation.activity.WebViewActivity.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a(WebViewActivity.TAG, "customTitleBarRightQuitAct onClick");
                WebViewActivity.this.handleMoreQuitActPopWindow();
            }
        });
    }

    private void customTitleBarRightShare() {
        LogUtil.a(TAG, "show customTitleBarRightShare");
        this.mCustomTitleBar.setRightSoftkeyVisibility(0);
        setShareRightDrawable();
        this.mCustomTitleBar.setRightSoftkeyOnClickListener(qji.b(new View.OnClickListener() { // from class: com.huawei.operation.activity.WebViewActivity.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a(WebViewActivity.TAG, "onClick share information");
                if (TextUtils.isEmpty(WebViewActivity.this.mActivityId) || TextUtils.isEmpty(WebViewActivity.this.mActivityShareType)) {
                    if (WebViewActivity.this.mCustomWebView != null && (WebViewActivity.this.mContext instanceof WebViewActivity)) {
                        JsRegisterFunctionResUtil.callBackResStatus((WebViewActivity) WebViewActivity.this.mContext, WebViewActivity.this.mCustomWebView.getmRegisterActivityShareFunctionRes(), "");
                        return;
                    } else {
                        LogUtil.j(WebViewActivity.TAG, "showShareDialog mCustomWebView is null");
                        return;
                    }
                }
                WebViewActivity.this.mCustomWebView.onShare(WebViewActivity.this.mActivityId, WebViewActivity.this.mActivityShareType);
            }
        }, (BaseActivity) this.mContext, true, ""));
    }

    private void showNoteBtn() {
        LogUtil.a(TAG, "showNoteBtn");
        WebViewHelp.setRightButtonVisibility(0, this.mCustomTitleBar);
        this.mCustomTitleBar.setRightButtonDrawable(getResources().getDrawable(R.mipmap.title_right_note_btn), qre.f(R.string.IDS_lactate_tittlebar_top));
        this.mCustomTitleBar.setRightTextButtonClickable(true);
        this.mCustomTitleBar.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.operation.activity.WebViewActivity.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a(WebViewActivity.TAG, "showNoteBtn onClick");
                if (WebViewActivity.this.webViewActivityExt == null) {
                    WebViewActivity.this.webViewActivityExt = new WebViewActivityExt();
                }
                WebViewActivity.this.webViewActivityExt.showActivityResultExplainDialog(WebViewActivity.this.mContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleMoreQuitActPopWindow() {
        View viewInflate = View.inflate(this.mContext, R.layout.common_pop_menu_single, null);
        this.mPopView = new qop(this.mContext, viewInflate);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.text);
        healthTextView.setText(R.string.IDS_hwh_home_healthshop_quit_activities);
        healthTextView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.operation.activity.WebViewActivity.11
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                WebViewHelp.showQuitDialog(WebViewActivity.this.mContext, WebViewActivity.this.mCustomWebView);
                WebViewActivity.this.mPopView.e();
            }
        });
        this.mPopView.e(this.mCustomTitleBar, 17);
    }

    private void setRightBtnInvisible() {
        LogUtil.a(TAG, "setRightBtnInvisible");
        WebViewHelp.setRightButtonVisibility(8, this.mCustomTitleBar);
        this.mCustomTitleBar.setRightSoftkeyVisibility(8);
    }

    private void customTitleBarRightVmallCoupon() {
        LogUtil.a(TAG, "customTitleBarRightVmallCoupon");
        WebViewHelp.setRightButtonVisibility(0, this.mCustomTitleBar);
        this.mCustomTitleBar.setRightButtonDrawable(BaseApplication.getContext().getResources().getDrawable(R.drawable.hw_health_shop_conpou_img), qre.f(R.string.IDS_coupons));
        this.mCustomTitleBar.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.operation.activity.WebViewActivity.12
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a(WebViewActivity.TAG, "customTitleBarRightVmallCoupon onClick");
                if (WebViewActivity.this.mCustomWebView != null && (WebViewActivity.this.mContext instanceof WebViewActivity)) {
                    JsRegisterFunctionResUtil.callBackResStatus((WebViewActivity) WebViewActivity.this.mContext, WebViewActivity.this.mCustomWebView.getRegisterVmallCouponFunctionRes(), "2");
                } else {
                    LogUtil.a(WebViewActivity.TAG, "customTitleBarRightVmallCoupon mCustomWebView is null");
                }
            }
        });
    }

    private void customTitleBarRightMoreType(final TitleBean titleBean) {
        if (TextUtils.isEmpty(titleBean.fetchGetFeatureUrl()) && TextUtils.isEmpty(titleBean.fetchGetShoppingCartUrl()) && TextUtils.isEmpty(titleBean.fetchGetOrderManagerUrl())) {
            WebViewHelp.setRightButtonVisibility(8, this.mCustomTitleBar);
        } else {
            WebViewHelp.setRightButtonVisibility(0, this.mCustomTitleBar);
        }
        this.mCustomTitleBar.setRightButtonDrawable(BaseApplication.getContext().getResources().getDrawable(R.drawable.hw_health_shop_more_img), qre.f(R.string.accessibility_more_item));
        this.mCustomTitleBar.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.operation.activity.WebViewActivity.13
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                WebViewHelp.setClickBi(WebViewActivity.this.mContext, AnalyticsValue.HEALTH_SHOP_WEBVIEW_MORE_CLICK_2120016.value());
                WebViewActivity webViewActivity = WebViewActivity.this;
                webViewActivity.mPopView = WebViewHelp.handleMorePopWindow(webViewActivity.mContext, WebViewActivity.this.mCustomWebView, titleBean);
                WebViewActivity.this.mPopView.e(WebViewActivity.this.mCustomTitleBar, 17);
            }
        });
    }

    private void defaultHandleTitle() {
        LogUtil.a(TAG, "defaultHandleTitle");
        customLeftBtnCloseType();
        WebViewHelp.setRightButtonVisibility(8, this.mCustomTitleBar);
        CustomTitleBar customTitleBar = this.mCustomTitleBar;
        if (customTitleBar != null) {
            customTitleBar.setAppBarVisible(true);
        }
    }

    private void customLeftBtnCloseType() {
        this.mCustomTitleBar.setLeftButtonDrawable(BaseApplication.getContext().getResources().getDrawable(R.drawable.health_navbar_cancel_selector), qre.f(R.string.accessibility_close));
        this.mCustomTitleBar.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.operation.activity.WebViewActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1504x3450d4df(view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$customLeftBtnCloseType$2$com-huawei-operation-activity-WebViewActivity, reason: not valid java name */
    /* synthetic */ void m1504x3450d4df(View view) {
        if (this.mCustomWebView != null && this.mWebView != null) {
            LogUtil.d(TAG, "Constants.WEB_VIEW_STATUS_CLOSE");
            this.mCustomWebView.callbackWebViewStatus(Constants.WEBVIEW_STATUS_CLOSE);
        }
        handlePushNotificationIntent();
        LogUtil.a(TAG, "setCustomTitleBar in finish");
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void customLeftBtnArrowType() {
        if (LanguageUtil.ba(this.mContext)) {
            this.mCustomTitleBar.setLeftButtonDrawable(BaseApplication.getContext().getResources().getDrawable(R.drawable.health_navbar_rtl_back_selector), qre.f(R.string.accessibility_go_back));
        } else {
            this.mCustomTitleBar.setLeftButtonDrawable(BaseApplication.getContext().getResources().getDrawable(R.drawable.health_navbar_back_selector), qre.f(R.string.accessibility_go_back));
        }
        this.mCustomTitleBar.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.operation.activity.WebViewActivity$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1503x67985ab1(view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$customLeftBtnArrowType$3$com-huawei-operation-activity-WebViewActivity, reason: not valid java name */
    /* synthetic */ void m1503x67985ab1(View view) {
        if (this.mAdapter != null) {
            if (this.mCustomWebView != null && this.mWebView != null) {
                LogUtil.d(TAG, "Constants.WEB_VIEW_STATUS_LEFT_ARROW");
                this.mCustomWebView.callbackWebViewStatus(Constants.WEBVIEW_STATUS_LEFT_ARROW);
            }
            handlePushNotificationIntent();
            if (this.mCustomWebView.goBack()) {
                return;
            }
            LogUtil.a(TAG, "setCustomTitleBar in finish");
            finish();
        }
    }

    private void handlePushNotificationIntent() {
        SharedPreferences sharedPreferences = getSharedPreferences("pushNotificationIntent", 0);
        if (sharedPreferences.getBoolean(Constants.KEY_IS_PUSH_NOTIFICATION, false)) {
            LogUtil.a(TAG, "setCustomTitleBar isPush in if");
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putBoolean(Constants.KEY_IS_PUSH_NOTIFICATION, false);
            editorEdit.apply();
            WebViewHelp.jumpToMain(this.mContext, getPackageManager());
        } else {
            LogUtil.a(TAG, "setCustomTitleBar isPush in else");
            setResult(-1);
        }
        if (isTaskRoot()) {
            LogUtil.a(TAG, "setCustomTitleBar is TaskRoot,jump to main");
            WebViewHelp.jumpToMain(this.mContext, getPackageManager());
        }
    }

    private void callJsSportDataFunction(String str, String str2, String str3, boolean z) {
        if (!z) {
            this.mWebView.loadUrl(WebViewUtils.getUrl(str3, String.valueOf(1003)));
            this.mWebView.loadUrl(WebViewUtils.getUrl(str2, Constants.NULL));
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString(Constants.START_DATE);
            String string2 = jSONObject.getString("endDate");
            this.mAdapter.getSportData(string, string2, new SportDataResponseCallback(this, str2, str3));
        } catch (JSONException unused) {
            LogUtil.e(TAG, "parse param json fail!");
            this.mWebView.loadUrl(WebViewUtils.getUrl(str3, String.valueOf(1001)));
            this.mWebView.loadUrl(WebViewUtils.getUrl(str2, Constants.NULL));
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    static class SportDataResponseCallback implements IBaseResponseCallback {
        private String mFunctionErr;
        private String mFunctionRes;
        private WeakReference<WebViewActivity> mWebViewActivity;

        SportDataResponseCallback(WebViewActivity webViewActivity, String str, String str2) {
            this.mWebViewActivity = new WeakReference<>(webViewActivity);
            this.mFunctionRes = str;
            this.mFunctionErr = str2;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(final int i, final Object obj) {
            WebViewActivity webViewActivity = this.mWebViewActivity.get();
            if (webViewActivity != null && webViewActivity.mWebView != null) {
                final WebView webView = webViewActivity.mWebView;
                if (i == 1001) {
                    webView.loadUrl(WebViewUtils.getUrl(this.mFunctionErr, String.valueOf(i)));
                    webView.loadUrl(WebViewUtils.getUrl(this.mFunctionRes, Constants.NULL));
                    return;
                } else if (i != 1999) {
                    LogUtil.d(WebViewActivity.TAG, "getSportData onResponse not illegal or not unknown error");
                    webViewActivity.runOnUiThread(new Runnable() { // from class: com.huawei.operation.activity.WebViewActivity$SportDataResponseCallback$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m1510x110df60f(webView, obj, i);
                        }
                    });
                    return;
                } else {
                    webView.loadUrl(WebViewUtils.getUrl(this.mFunctionErr, String.valueOf(i)));
                    webView.loadUrl(WebViewUtils.getUrl(this.mFunctionRes, Constants.NULL));
                    return;
                }
            }
            LogUtil.j(WebViewActivity.TAG, "activity or mWebView is null");
        }

        /* JADX INFO: renamed from: lambda$onResponse$0$com-huawei-operation-activity-WebViewActivity$SportDataResponseCallback, reason: not valid java name */
        /* synthetic */ void m1510x110df60f(WebView webView, Object obj, int i) {
            webView.loadUrl(WebViewUtils.getUrl(this.mFunctionRes, obj.toString()));
            webView.loadUrl(WebViewUtils.getUrl(this.mFunctionErr, String.valueOf(i)));
        }
    }

    private void showRightTextBtnMyActivity(boolean z) {
        if (z) {
            WebViewHelp.setRightButtonVisibility(0, this.mCustomTitleBar);
            this.mCustomTitleBar.setRightButtonDrawable(BaseApplication.getContext().getResources().getDrawable(R.drawable.hw_health_shop_more_img), qre.f(R.string.accessibility_more_item));
            this.mCustomTitleBar.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.operation.activity.WebViewActivity.14
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a(WebViewActivity.TAG, "onClick myActivity");
                    if (CommonUtil.ab(WebViewActivity.this.getApplicationContext())) {
                        WebViewActivity.this.mNetworkLayout.setVisibility(4);
                        WebViewActivity.this.mWebView.setVisibility(0);
                        if (BleConstants.BLE_THIRD_DEVICE_H5.equals(WebViewActivity.this.mBleIntroductionType)) {
                            WebViewActivity.this.showUnbindDeviceMenu();
                            return;
                        } else {
                            WebViewActivity.this.handleMoreMyActivityPopWindow();
                            return;
                        }
                    }
                    LogUtil.a(WebViewActivity.TAG, "reload isNetworkConnected");
                }
            });
            return;
        }
        WebViewHelp.setRightButtonVisibility(8, this.mCustomTitleBar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleMoreMyActivityPopWindow() {
        View viewInflate = View.inflate(this.mContext, R.layout.common_pop_menu_single, null);
        this.mPopView = new qop(this.mContext, viewInflate);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.text);
        healthTextView.setText(R.string.IDS_activity_social_my_activities);
        healthTextView.setOnClickListener(qji.b(new View.OnClickListener() { // from class: com.huawei.operation.activity.WebViewActivity.15
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                String activityKeyUrlSp = WebViewUtils.getActivityKeyUrlSp(WebViewActivity.this.mContext);
                WebViewHelp.setClickBi(WebViewActivity.this.mContext, AnalyticsValue.HEALTH_ACTIVITY_WEBVIEW_MY_ACTIVITY_1100035.value());
                ActivityHtmlPathApi activityHtmlPathApi = (ActivityHtmlPathApi) Services.d("PluginOperation", ActivityHtmlPathApi.class);
                if (activityHtmlPathApi != null) {
                    WebViewActivity.this.mCustomWebView.reload(activityKeyUrlSp + activityHtmlPathApi.getActivityHtmlPath() + Constants.MY_ACTIVITY_HTML);
                }
                WebViewActivity.this.mPopView.e();
            }
        }, (BaseActivity) this.mContext, true, AnalyticsValue.HEALTH_ACTIVITY_WEBVIEW_MY_ACTIVITY_1100035.value()));
        this.mPopView.e(this.mCustomTitleBar, 17);
    }

    public void startLoadUrl(String str) {
        LogUtil.a(TAG, "startLoadUrl startLoadUrl the url");
        if (this.mCustomWebView == null) {
            LogUtil.d(TAG, "mCustomWebView is null startLoadUrl");
            return;
        }
        String strReplaceSpace = WebViewUtils.replaceSpace(str);
        if (!this.mCustomWebView.isWhiteUrl(strReplaceSpace)) {
            LogUtil.d(TAG, "isWhiteUrl is false url");
            this.mCustomWebView.setJsEnable(false);
        } else {
            this.mCustomWebView.setJsEnable(true);
            this.mWebView.loadUrl(strReplaceSpace);
        }
    }

    public void startLoadJs(String str) {
        LogUtil.a(TAG, "startLoadJs");
        if (this.mCustomWebView == null) {
            LogUtil.d(TAG, "mCustomWebView is null");
        } else {
            this.mWebView.loadUrl(str);
        }
    }

    private void showNoServicePage() {
        LogUtil.a(TAG, "showNoServicePage");
        WebViewHelp.setBiAnalysis("-2");
        this.mNetworkLayout.setVisibility(0);
        this.mWebView.setVisibility(4);
        this.mShoppingLayOut.setVisibility(8);
        this.mTraderOrder.setVisibility(8);
        setTxtTipsVisibility(8);
        this.mBtnNetSetting.setVisibility(8);
        this.mNoNetworkTips.setGravity(17);
        this.mNoNetworkTips.setText(getString(R.string.IDS_hwh_home_healthshop_unable_connect_server_tips));
        this.mTipsImageView.setBackgroundResource(R.drawable.ic_network);
    }

    private void showUnstableNetworkPage() {
        LogUtil.a(TAG, "showNoServicePage");
        WebViewHelp.setBiAnalysis("-1");
        this.mNetworkLayout.setVisibility(0);
        this.mWebView.setVisibility(4);
        this.mShoppingLayOut.setVisibility(8);
        this.mTraderOrder.setVisibility(8);
        setTxtTipsVisibility(8);
        this.mNoNetworkTips.setGravity(17);
        this.mProgressBar.setVisibility(8);
        this.mNoNetworkTips.setText(getString(R.string.IDS_hwh_home_healthshop_unstable_net_work_pls_touch_to_retry));
        this.mTipsImageView.setBackgroundResource(R.drawable.ic_network);
    }

    private void showNoNetworkPage() {
        if (com.huawei.operation.utils.Utils.isMatchThirdDeviceH5UrlPrefix(this.mUrl)) {
            LogUtil.d(TAG, "the url is thirdParty device, not need showNoNetworkPage");
            return;
        }
        LogUtil.a(TAG, "showNoNetworkPage");
        WebViewHelp.setBiAnalysis("-1");
        this.mNetworkLayout.setVisibility(0);
        this.mWebView.setVisibility(4);
        this.mShoppingLayOut.setVisibility(8);
        this.mTraderOrder.setVisibility(8);
        setTxtTipsVisibility(8);
        this.mNoNetworkTips.setGravity(17);
        this.mNoNetworkTips.setText(getString(R.string.IDS_hwh_home_healthshop_no_net_work_pls_click_again));
        this.mTipsImageView.setBackgroundResource(R.drawable.ic_network);
    }

    private void showServerErrorPage() {
        LogUtil.a(TAG, "showServerErrorPage");
        WebViewHelp.setBiAnalysis("-2");
        this.mNetworkLayout.setVisibility(0);
        this.mWebView.setVisibility(4);
        this.mShoppingLayOut.setVisibility(8);
        this.mTraderOrder.setVisibility(8);
        this.mBtnNetSetting.setVisibility(8);
        setTxtTipsVisibility(8);
        this.mNoNetworkTips.setGravity(17);
        this.mNoNetworkTips.setText(getString(R.string.IDS_hwh_home_healthshop_servers_error));
        this.mTipsImageView.setBackgroundResource(R.drawable.ic_network);
    }

    private void showSslErrorTipsPage() {
        LogUtil.a(TAG, "showSslErrorTipsPage");
        WebViewHelp.setBiAnalysis(OpAnalyticsConstants.SSL_FAIL_CODE);
        this.mNetworkLayout.setVisibility(0);
        this.mWebView.setVisibility(4);
        this.mShoppingLayOut.setVisibility(8);
        this.mTraderOrder.setVisibility(8);
        this.mNoNetworkTips.setGravity(0);
        setTxtTipsVisibility(0);
        this.mNoNetworkTips.setText(getString(R.string.IDS_hwh_home_healthshop_webview_cannot_load));
        this.mWebViewTipsCheckDate.setText(String.format(Locale.ROOT, getString(R.string.IDS_hwh_home_healthshop_webview_check_date_tips), 2));
        this.mWebViewTipsCustomerService.setText(getString(R.string.IDS_hwh_home_healthshop_pls_contact_huawei_customer_service));
        this.mTipsImageView.setBackgroundResource(R.drawable.ic_abnormal);
    }

    private void setTxtTipsVisibility(int i) {
        this.mWebViewTipsUpdate.setVisibility(i);
        this.mWebViewTipsCheckDate.setVisibility(i);
        this.mWebViewTipsCustomerService.setVisibility(i);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        DoubleClickReceiver doubleClickReceiver = new DoubleClickReceiver();
        this.mDoubleClickReceiver = doubleClickReceiver;
        BroadcastManager.b(doubleClickReceiver);
        super.onResume();
        LogUtil.a(TAG, BaseDialog.LIFE_CYCLE_ON_RESUME);
        if (this.mCustomWebView != null && this.mWebView != null) {
            LogUtil.d(TAG, "Constants.WEB_VIEW_STATUS_ON_RESUME");
            this.mCustomWebView.callbackWebViewStatus(Constants.WEBVIEW_STATUS_ON_RESUME);
        }
        this.mBiTotalTime += this.mBiPauseTime - this.mBiStartTime;
        this.mBiStartTime = System.currentTimeMillis();
        CustomWebView customWebView = this.mCustomWebView;
        if (customWebView != null) {
            String biCurrentUrl = customWebView.getBiCurrentUrl();
            if (!TextUtils.isEmpty(biCurrentUrl)) {
                sBiAnalyticsUtil.e(this.mCustomWebView.getBiIdFromUrl(biCurrentUrl), this.mCustomWebView.getUrlLifeCycleBiMap(biCurrentUrl));
            }
        }
        if (this.mIsFullScreen) {
            WebViewHelp.setFullScreen(getWindow());
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        LogUtil.a(TAG, BaseDialog.LIFE_CYCLE_ON_PAUSE);
        if (this.mCustomWebView != null && this.mWebView != null) {
            LogUtil.d(TAG, "Constants.WEB_VIEW_STATUS_ON_PAUSE");
            this.mCustomWebView.callbackWebViewStatus(Constants.WEBVIEW_STATUS_ON_PAUSE);
        }
        CustomWebView customWebView = this.mCustomWebView;
        if (customWebView != null) {
            String biCurrentUrl = customWebView.getBiCurrentUrl();
            if (!TextUtils.isEmpty(biCurrentUrl)) {
                sBiAnalyticsUtil.b(this.mCustomWebView.getBiIdFromUrl(biCurrentUrl), this.mCustomWebView.getUrlLifeCycleBiMap(biCurrentUrl));
            }
        }
        this.mBiPauseTime = System.currentTimeMillis();
        BroadcastManager.k(this.mDoubleClickReceiver);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        LogUtil.a(TAG, "onDestroy");
        this.webViewActivityExt.startVmallLogout(this.mCustomWebView, this.mWebView);
        sIsActiveFlag = false;
        setActiveFlag(false);
        JsClientApi.destroyApi(this.mJsApiId);
        setActivity(null);
        destroyBi();
        destroyWebView();
        PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
        if (pluginOperationAdapter != null) {
            pluginOperationAdapter.stressAbort(null, this.mIsFromHeartRateBoard);
            this.mAdapter.breatheControl(4, 0, -1, 0, null);
        }
        onDestroyClear();
        H5ProJsAdapter h5ProJsAdapter = this.mH5ProJsAdapter;
        if (h5ProJsAdapter != null) {
            h5ProJsAdapter.cleanH5ProInterfaces();
            this.mH5ProJsAdapter = null;
        }
        this.webViewActivityExt = null;
        CustomWebView customWebView = this.mCustomWebView;
        if (customWebView != null) {
            customWebView.onDestroy();
        }
        if (!TextUtils.isEmpty(this.mDeviceId)) {
            JsInteraction.setDeviceId(null);
        }
        super.onDestroy();
    }

    private void destroyBi() {
        this.mBiTotalTime += this.mBiPauseTime - this.mBiStartTime;
        if (Constants.OPEN_SERVICE_TYPE.equals(this.mType)) {
            LogUtil.a("onDestroy OPEN_SERVICE_TYPE", new Object[0]);
            HashMap map = new HashMap(16);
            map.put("id", this.mBiId);
            map.put("name", this.mBiName);
            map.put("time", Long.valueOf(this.mBiTotalTime));
            lmf.d().c(this.mContext, AnalyticsValue.OPEN_SERVICE_WEBVIEW_2010064.value(), map, 0);
        }
        if ("SHOW_TIME_BI".equals(this.mShouldBiShowTime)) {
            LogUtil.a(TAG, "BI_SHOW_TIME");
            HashMap map2 = new HashMap(16);
            map2.put("id", this.mBiId);
            map2.put("title", this.mBiName);
            map2.put("source", this.mBiSource);
            map2.put(SmartMsgConstant.MSG_SHOW_TIME, Long.valueOf(this.mBiTotalTime));
            lmf.d().c(this.mContext, AnalyticsValue.WEBVIEW_SHOW_1100020.value(), map2, 0);
        }
        if (this.mIsGuide) {
            HashMap map3 = new HashMap(16);
            map3.put("startTime", Long.valueOf(this.mBiStartTime));
            map3.put("totalTime", Long.valueOf(this.mBiTotalTime));
            lmf.d().c(this.mContext, AnalyticsValue.HEALTH_SLEEP_GUIDE_TIME_21300024.value(), map3, 0);
        }
    }

    private void onDestroyClear() {
        BleOperatorImpl bleOperatorImpl;
        if (this.mProductId != null && (bleOperatorImpl = this.mBleOperator) != null) {
            bleOperatorImpl.stopBleState();
            this.mBleOperator = null;
        }
        cancelShoppingView();
        this.mDoubleClickReceiver = null;
        this.mAdapter = null;
    }

    private void destroyWebView() {
        LogUtil.a(TAG, "destroyWebView");
        if (this.mWebView != null) {
            LogUtil.a("onDestroy destroyWebView", new Object[0]);
            ViewParent parent = this.mWebView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.mWebView);
            }
            this.mWebView.stopLoading();
            this.mWebView.getSettings().setJavaScriptEnabled(false);
            this.mWebView.clearHistory();
            this.mWebView.clearView();
            this.mWebView.removeAllViews();
            this.mWebView.destroy();
        }
    }

    private void reload() {
        LogUtil.a(TAG, "reload");
        if (!CommonUtil.ab(getApplicationContext())) {
            LogUtil.a(TAG, "reload isNetworkConnected");
            return;
        }
        this.mNetworkLayout.setVisibility(4);
        this.mWebView.setVisibility(0);
        String webViewOriginalUrl = WebViewHelp.getWebViewOriginalUrl(this.mWebView);
        if (TextUtils.isEmpty(webViewOriginalUrl)) {
            LogUtil.a(TAG, "reloadUrl is empty");
            if (this.mIsHealthChoose) {
                this.mTraderOrder.setVisibility(0);
                addTradeView(true);
            } else if (this.mIsMiaoChoose) {
                LogUtil.a(TAG, "reloadUrl mIsVmallChoose is false");
                this.mCustomWebView.load(WebViewHelp.getMiaoHealthUrlString(this.mMiaoHealthHost));
            } else {
                this.mCustomWebView.load(this.mUrl);
            }
        } else if (WebViewHelp.checkOrderManagerPage(webViewOriginalUrl)) {
            LogUtil.a(TAG, "reloadUrl mIsVmallOrMiaoChoose is true");
            if (this.mIsHealthChoose) {
                this.mTraderOrder.setVisibility(0);
                addTradeView(true);
            } else if (this.mIsVmallChoose) {
                LogUtil.a(TAG, "reloadUrl mIsVmallChoose is true");
                this.mTraderOrder.setVisibility(0);
                addTradeView(false);
            } else {
                LogUtil.a(TAG, "reloadUrl mIsVmallChoose is false");
                this.mCustomWebView.load(WebViewHelp.getMiaoHealthUrlString(this.mMiaoHealthHost));
            }
        } else {
            LogUtil.a(TAG, "reloadUrl mIsVmallOrMiaoChoose is false");
            this.mCustomWebView.load(webViewOriginalUrl);
        }
        showShoppingView();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        LogUtil.a(TAG, "reload");
        if (view == this.mReloadLayout) {
            reload();
            return;
        }
        if (view == this.mBtnNetSetting) {
            CommonUtil.t(this.mContext);
            return;
        }
        if (view == this.mVmallTextView) {
            setTheTabsChoose(true);
            this.mNetworkLayout.setVisibility(4);
            this.mWebView.setVisibility(8);
            doBiEvent(1);
            return;
        }
        if (view == this.mMiaoTextView) {
            setTheTabsChoose(false);
            doBiEvent(2);
        } else if (view == this.mTradeTextview) {
            setTradeTabsChoose();
            addTradeView(true);
        } else {
            LogUtil.a(TAG, "other position");
        }
    }

    private void doBiEvent(int i) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put(com.huawei.health.messagecenter.model.CommonUtil.PAGE_TYPE, Integer.valueOf(i));
        lmf.d().c(com.huawei.haf.application.BaseApplication.b(), AnalyticsValue.REMIND_MY_ORDER_EVENT.value(), map, 0);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a(TAG, "requestCode is ", Integer.valueOf(i), " resultCode is ", Integer.valueOf(i2));
        BleOperatorImpl bleOperatorImpl = this.mBleOperator;
        if (bleOperatorImpl != null) {
            bleOperatorImpl.onActivityResult(i, i2, intent);
        }
        if (i == 10087) {
            CustomWebView customWebView = this.mCustomWebView;
            if (customWebView == null) {
                LogUtil.j(TAG, "onActivityResult: mCustomWebView is null");
                return;
            }
            ValueCallback<Uri[]> uploadMessageForAndroid5 = customWebView.getUploadMessageForAndroid5();
            if (uploadMessageForAndroid5 != null) {
                Uri data = (intent == null || i2 != -1) ? null : intent.getData();
                uploadMessageForAndroid5.onReceiveValue(WebViewUtils.checkUriIsValid(this.mContext, data) ? new Uri[]{data} : new Uri[0]);
            }
            this.mCustomWebView.setUploadMessageForAndroid5(null);
            return;
        }
        if (i == 20001) {
            WebViewHelp.takePhoto(i2, intent, this.mCustomWebView);
            return;
        }
        if (i != 20002) {
            if (i != 42001) {
                LogUtil.a(TAG, "onActivityResult in JsClientApi");
                JsClientApi.handleActivityResult(i, i2, intent);
                return;
            } else {
                if (i2 == 42002) {
                    finish();
                    return;
                }
                return;
            }
        }
        if (i2 != -1) {
            return;
        }
        int iC = gsm.c(intent);
        if (iC == 2) {
            qrs.e((Activity) this, 20002);
            return;
        }
        BleOperatorImpl bleOperatorImpl2 = this.mBleOperator;
        if (bleOperatorImpl2 == null || iC != 0) {
            return;
        }
        bleOperatorImpl2.handleScanCodeResult(i2, intent);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        LogUtil.a(TAG, "onRequestPermissionsResult requestCode is ", Integer.valueOf(i));
        ltd.e().e(strArr, iArr);
        if (i == 9006) {
            JsClientApi.handleActivityPermissionResult(i, strArr, iArr);
            return;
        }
        if (i == 3001) {
            LogUtil.a(TAG, "Constants.REQUEST_CODE_SCREEN");
            if (lsg.d(this.mContext, strArr)) {
                LogUtil.a(TAG, "onRequestPermissionsResult : HasPermissions");
                new CaptureUtils(this.mContext).capture(this.mWebView, this.mCustomWebView.getCaptureFunction());
                return;
            } else {
                new CaptureUtils(this.mContext).captureNoPermission(this.mWebView, this.mCustomWebView.getCaptureFunction());
                LogUtil.a(TAG, "onRequestPermissionsResult : finish");
                return;
            }
        }
        LogUtil.d(TAG, "onRequestPermissionsResult other");
    }

    private void resetActivityListPage() {
        LogUtil.a(TAG, "resetActivityListPage");
        this.mHandler.obtainMessage(1).sendToTarget();
    }

    public static void backToActivityListPage() {
        LogUtil.a(TAG, "backToActivityListPage");
        if (sActivity instanceof WebViewActivity) {
            LogUtil.a(TAG, "resetActivityListPage");
            ((WebViewActivity) sActivity).resetActivityListPage();
        }
    }

    public static void setActivity(Activity activity) {
        LogUtil.a(TAG, "setActivity");
        sActivity = activity;
    }

    public static Activity getActivity() {
        LogUtil.a(TAG, "getActivity");
        return sActivity;
    }

    /* JADX INFO: loaded from: classes13.dex */
    public class DoubleClickReceiver extends BroadcastReceiver {
        public DoubleClickReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.a(WebViewActivity.TAG, "DoubleClickReceiver onReceive()");
            if (WebViewActivity.this.mWebView != null) {
                WebViewActivity.this.mWebView.setScrollY(0);
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        int i = configuration.orientation;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            LogUtil.a(TAG, "ORIENTATION_LANDSCAPE");
            return;
        }
        LogUtil.a(TAG, "ORIENTATION_PORTRAIT");
        WebView webView = this.mWebView;
        if (webView == null) {
            return;
        }
        try {
            webView.getClass().getMethod(BaseDialog.LIFE_CYCLE_ON_PAUSE, new Class[0]).invoke(this.mWebView, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            LogUtil.a(TAG, e.getMessage());
        }
        CustomTitleBar customTitleBar = this.mCustomTitleBar;
        if (customTitleBar != null) {
            customTitleBar.setVisibility(0);
        }
        WebViewHelp.showBottomUiMenu(getWindow(), this.mUiOptions);
        try {
            this.mWebView.getClass().getMethod(BaseDialog.LIFE_CYCLE_ON_RESUME, new Class[0]).invoke(this.mWebView, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            LogUtil.a(TAG, e2.getMessage());
        }
        loadApplicationTheme();
        initSystemBar();
        if (CommonUtil.bg()) {
            getWindow().setNavigationBarColor(getResources().getColor(com.huawei.ui.commonui.R.color.common_color_white));
            LogUtil.a(TAG, "setNavigationBarColor common_color_white");
        }
        getWindow().getDecorView().refreshDrawableState();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        IBaseResponseCallback iBaseResponseCallback;
        super.onWindowFocusChanged(z);
        if (z && this.mIsFullScreen) {
            WebViewHelp.setFullScreen(getWindow());
        }
        if (!z || (iBaseResponseCallback = mCallback) == null) {
            return;
        }
        iBaseResponseCallback.a(0, "");
    }

    public String getUrl() {
        return this.mUrl;
    }

    public void setTitle(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mCustomWebView.setTitle(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showUnbindDeviceMenu() {
        if (this.mContext == null || this.mCustomTitleBar == null) {
            LogUtil.j(TAG, "showUnbindDeviceMenu mContext or mCustomTitleBar = null ");
        } else {
            new PopViewList(this.mContext, this.mCustomTitleBar, new ArrayList(Arrays.asList(getResources().getString(R.string.IDS_device_wear_home_delete_device)))).b(new PopViewList.PopViewClickListener() { // from class: com.huawei.operation.activity.WebViewActivity$$ExternalSyntheticLambda5
                @Override // com.huawei.ui.commonui.popupview.PopViewList.PopViewClickListener
                public final void setOnClick(int i) {
                    this.f$0.m1509x35209bfb(i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$showUnbindDeviceMenu$4$com-huawei-operation-activity-WebViewActivity, reason: not valid java name */
    /* synthetic */ void m1509x35209bfb(int i) {
        if (i == 0) {
            PluginBaseAdapter adapter = PluginOperation.getInstance(this.mContext).getAdapter();
            if (this.mAdapter == null && (adapter instanceof PluginOperationAdapter)) {
                this.mAdapter = (PluginOperationAdapter) adapter;
            }
            if (this.mAdapter == null) {
                LogUtil.j(TAG, "showUnbindDeviceMenu: adapter is null");
                return;
            }
            if (this.webViewActivityExt == null) {
                this.webViewActivityExt = new WebViewActivityExt();
            }
            this.webViewActivityExt.showUnBindDeviceDialog(this.mContext, this.mDeviceInfo, this.mProductId, this.mAdapter);
        }
    }

    private void initOnTouchListener() {
        WebView webView = this.mWebView;
        if (webView == null) {
            return;
        }
        webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.huawei.operation.activity.WebViewActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f$0.m1507x928f367e(view, motionEvent);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$initOnTouchListener$5$com-huawei-operation-activity-WebViewActivity, reason: not valid java name */
    /* synthetic */ boolean m1507x928f367e(View view, MotionEvent motionEvent) {
        if ((motionEvent.getAction() & 255) != 0) {
            return false;
        }
        this.mTouchX = motionEvent.getX();
        this.mTouchY = motionEvent.getY();
        return false;
    }

    private void initLongClickImageShare() {
        WebView webView = this.mWebView;
        if (webView == null) {
            return;
        }
        webView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.huawei.operation.activity.WebViewActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f$0.m1506x85c684dc(view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$initLongClickImageShare$7$com-huawei-operation-activity-WebViewActivity, reason: not valid java name */
    /* synthetic */ boolean m1506x85c684dc(View view) {
        WebView.HitTestResult hitTestResult = this.mWebView.getHitTestResult();
        if (hitTestResult == null) {
            return false;
        }
        int type = hitTestResult.getType();
        if (type != 5 && type != 8) {
            return false;
        }
        final String extra = hitTestResult.getExtra();
        LogUtil.a(TAG, "image in webview is long clicked: ", extra);
        if (WebViewHelp.isSvgUrl(extra)) {
            return false;
        }
        View view2 = new View(this.mContext);
        view2.setX(this.mTouchX);
        view2.setY(this.mTouchY);
        this.mFrameLayout.addView(view2);
        View viewInflate = View.inflate(this.mContext, R.layout.common_pop_menu_single, null);
        final qop qopVar = new qop(this.mContext, viewInflate);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.text);
        healthTextView.setText(R.string.IDS_webview_image_share);
        qopVar.e(view2, 18);
        healthTextView.setOnClickListener(qji.b(new View.OnClickListener() { // from class: com.huawei.operation.activity.WebViewActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                WebViewActivity.lambda$initLongClickImageShare$6(qopVar, extra, view3);
            }
        }, (BaseActivity) this.mContext, true, ""));
        this.mFrameLayout.removeView(view2);
        return false;
    }

    static /* synthetic */ void lambda$initLongClickImageShare$6(qop qopVar, String str, View view) {
        qopVar.e();
        WebViewHelp.shareWebImage(str);
    }
}
