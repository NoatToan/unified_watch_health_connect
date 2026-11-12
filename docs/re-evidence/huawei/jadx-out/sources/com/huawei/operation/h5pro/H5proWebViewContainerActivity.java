package com.huawei.operation.h5pro;

import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.InflateException;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.h5pro.core.H5ProBridgeManager;
import com.huawei.health.h5pro.core.H5ProCommand;
import com.huawei.health.h5pro.core.H5ProConfigGuardian;
import com.huawei.health.h5pro.core.H5ProEnvParamsGuardian;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.h5pro.core.H5ProWebView;
import com.huawei.health.h5pro.core.ImmerseInfo;
import com.huawei.health.h5pro.dfx.bi.Analyzer;
import com.huawei.health.h5pro.jsbridge.system.container.H5Container;
import com.huawei.health.h5pro.jsbridge.system.container.H5ContainerEntry;
import com.huawei.health.h5pro.utils.AdjustResizeWithSoftInput;
import com.huawei.health.h5pro.utils.CommonUtil;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.health.h5pro.utils.LanguageUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.vengine.H5ProAppLoadListener;
import com.huawei.health.h5pro.vengine.H5ProEventInterceptor;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import com.huawei.health.h5pro.vengine.H5ProNativeView;
import com.huawei.health.h5pro.vengine.H5ProViewControls;
import com.huawei.health.h5pro.vengine.H5ResultCallback;
import com.huawei.health.h5pro.webkit.H5ProLoadingRecordManager;
import com.huawei.health.h5pro.webkit.WebChromeCustomViewListener;
import com.huawei.hwcloudjs.JsClientApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.operation.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.transition.ActivityTransitionAnimator;
import defpackage.qqs;
import defpackage.qrs;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class H5proWebViewContainerActivity extends BaseActivity implements H5ProAppLoadListener, H5Container, H5ProViewControls, View.OnClickListener, WebChromeCustomViewListener {
    private static final long PROGRESSBAR_GONE_DELAYMILLIS = 30;
    private static final String REL_TAG = "R_H5proWebViewContainerActivity";
    private static final String TAG = "H5PRO_H5proWebViewContainerActivity";
    private static final int TITLE_ICON_SIZE_DP = 24;
    private static final String TOOL_BAR_CB_SHARE = "share";
    private String mContainerTitle;
    private View mCustomView;
    private WebChromeClient.CustomViewCallback mCustomViewCallback;
    private H5ProCommand mH5ProCommand;
    private H5ProInstance mH5ProInstance;
    private H5ProLaunchOption mH5ProLaunchOption;
    private H5ProWebView mH5ProWebView;
    private LinearLayout mLoadingView;
    private Map<String, H5ProNativeView> mNativeViews;
    private RelativeLayout mRootView;
    private LinearLayout mToolbarView;
    private final Analyzer mAnalyzer = new Analyzer();
    private boolean isFirstLoad = true;
    private int mNativeViewMaxId = 0;
    private final Map<String, Boolean> mToolbarIconVisibleMap = new LinkedHashMap();
    private final Map<String, Long> mToolbarCallbacks = new LinkedHashMap();

    private int setStatusBar(boolean z, boolean z2, int i) {
        if (z) {
            return z2 ? i | 8192 : i;
        }
        return i | 4;
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProAppLoadListener
    public void onNewPageStartLoad(H5ProInstance h5ProInstance, String str) {
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProAppLoadListener
    public void onResourceLoadErr(H5ProInstance h5ProInstance, String str, int i) {
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProAppLoadListener
    public void onViewPreCreate(H5ProInstance h5ProInstance, View view) {
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.i(TAG, "onCreate");
        if (!initConfigInfo()) {
            finish();
            return;
        }
        this.isFirstLoad = true;
        if (bundle != null) {
            try {
                if (bundle.getBoolean("IS_TRIGGER_CONFIG_GUARDIAN_KEY", false)) {
                    H5ProConfigGuardian.d.onConfigGuardian(this);
                    H5ProEnvParamsGuardian.restoreFromBundle(bundle);
                }
            } catch (InflateException e) {
                LogUtil.e(TAG, "onCreate: exception -> " + e.getMessage());
                finish();
                return;
            }
        }
        ActivityTransitionAnimator activityTransitionAnimatorA = ActivityTransitionAnimator.c().a((Activity) this);
        boolean zA = activityTransitionAnimatorA.a();
        if (zA) {
            activityTransitionAnimatorA.f();
        }
        BaseActivity.setDisplaySideMode(this);
        setContentView(R.layout.h5pro_container_layout);
        if (zA) {
            activityTransitionAnimatorA.d(true).e();
        }
        this.mRootView = (RelativeLayout) findViewById(R.id.activity);
        this.mLoadingView = (LinearLayout) findViewById(R.id.h5_page_loading);
        initByLaunchOption();
        setSoftInputAdapterIfNeed(this);
        loadApp(true);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        LogUtil.i(TAG, "onSaveInstanceState");
        super.onSaveInstanceState(bundle);
        H5ProEnvParamsGuardian.saveInBundle(bundle);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        LogUtil.i(TAG, "onNewIntent");
        if (intent == null) {
            finish();
            return;
        }
        setIntent(intent);
        if (!initConfigInfo()) {
            finish();
        } else {
            this.isFirstLoad = true;
            loadApp(false);
        }
    }

    private boolean initConfigInfo() {
        try {
            Bundle bundleExtra = getIntent().getBundleExtra("com.huawei.health.h5pro.MESSAGE");
            if (bundleExtra == null) {
                LogUtil.w(TAG, "initConfigInfo: bundle is null");
                return false;
            }
            H5ProCommand h5ProCommand = (H5ProCommand) bundleExtra.getParcelable("com.huawei.health.h5pro.MESSAGE");
            this.mH5ProCommand = h5ProCommand;
            if (h5ProCommand == null) {
                LogUtil.w(TAG, "initConfigInfo: mH5ProCommand is null");
                return false;
            }
            this.mH5ProLaunchOption = h5ProCommand.getLaunchOption();
            return true;
        } catch (BadParcelableException e) {
            LogUtil.e(TAG, "initConfigInfo: exception -> " + e.getMessage());
            return false;
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        LogUtil.i(TAG, "onDestroy");
        if (this.mH5ProCommand != null) {
            H5ProLoadingRecordManager.d.removeLoadingRecord(this.mH5ProCommand.getPackageName());
        }
        if (this.mH5ProInstance != null) {
            this.mH5ProInstance = null;
        }
        super.onDestroy();
        this.mAnalyzer.leave();
        Map<String, H5ProNativeView> map = this.mNativeViews;
        if (map != null && !map.isEmpty()) {
            removeAllNativeView();
        }
        this.mH5ProWebView = null;
        this.mRootView = null;
        this.mCustomView = null;
        this.mCustomViewCallback = null;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        LogUtil.i(TAG, BaseDialog.LIFE_CYCLE_ON_RESUME);
        super.onResume();
        H5ProWebView h5ProWebView = this.mH5ProWebView;
        if (h5ProWebView != null) {
            h5ProWebView.onResume();
        }
        H5ProInstance h5ProInstance = this.mH5ProInstance;
        if (h5ProInstance != null) {
            this.mAnalyzer.resume(h5ProInstance.getUrl(), this.mH5ProInstance.getAppInfo());
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        LogUtil.i(TAG, BaseDialog.LIFE_CYCLE_ON_PAUSE);
        super.onPause();
        H5ProWebView h5ProWebView = this.mH5ProWebView;
        if (h5ProWebView != null) {
            h5ProWebView.onPause();
        }
        H5ProInstance h5ProInstance = this.mH5ProInstance;
        if (h5ProInstance != null) {
            this.mAnalyzer.pause(h5ProInstance.getUrl(), this.mH5ProInstance.getAppInfo());
        }
    }

    @Override // android.app.Activity
    public void finish() {
        if (ActivityTransitionAnimator.c().a()) {
            HandlerExecutor.b(new Runnable() { // from class: com.huawei.operation.h5pro.H5proWebViewContainerActivity$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1526x2e39e112();
                }
            });
        } else {
            super.finish();
        }
    }

    /* JADX INFO: renamed from: lambda$finish$0$com-huawei-operation-h5pro-H5proWebViewContainerActivity, reason: not valid java name */
    /* synthetic */ void m1526x2e39e112() {
        ActivityTransitionAnimator.c().a(qrs.ad(this)).c(qrs.q(this)).b();
    }

    private void setSoftInputAdapterIfNeed(Activity activity) {
        LogUtil.i(TAG, "initStatusBar");
        H5ProLaunchOption h5ProLaunchOption = this.mH5ProLaunchOption;
        if (h5ProLaunchOption == null || !h5ProLaunchOption.isNeedSoftInputAdapter()) {
            return;
        }
        AdjustResizeWithSoftInput.assistActivity(activity);
    }

    private void initByLaunchOption() {
        LogUtil.i(TAG, "initStatusBar");
        H5ProLaunchOption h5ProLaunchOption = this.mH5ProLaunchOption;
        int screenOrientation = h5ProLaunchOption == null ? -1 : h5ProLaunchOption.getScreenOrientation();
        if (screenOrientation != -1) {
            setRequestedOrientation(screenOrientation);
        }
        H5ProLaunchOption h5ProLaunchOption2 = this.mH5ProLaunchOption;
        if (h5ProLaunchOption2 != null && h5ProLaunchOption2.isImmerse()) {
            setStatusBarImmerses(this.mH5ProLaunchOption.isShowStatusBar(), this.mH5ProLaunchOption.getStatusBarTextColor(), this.mH5ProLaunchOption.isStartAtBottomOfStatusBar(), this.mH5ProLaunchOption.isHideBottomVirtualKeys());
        } else {
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().setStatusBarColor(getResources().getColor(R.color.emui_appbar_bg));
            if (!isDark()) {
                getWindow().getDecorView().setSystemUiVisibility(9216);
            }
        }
        if (isDark()) {
            LogUtil.i(TAG, "isDark");
            getWindow().setNavigationBarColor(getResources().getColor(R.color.colorBackgroundDark));
        }
        H5ProLaunchOption h5ProLaunchOption3 = this.mH5ProLaunchOption;
        if (h5ProLaunchOption3 != null) {
            if ("none".equals(h5ProLaunchOption3.getAnim())) {
                overridePendingTransition(0, 0);
            }
            if (this.mH5ProLaunchOption.isEnableSelfProtection()) {
                getWindow().addFlags(8192);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusBarImmerses(boolean z, boolean z2, boolean z3, boolean z4) {
        RelativeLayout relativeLayout = this.mRootView;
        if (relativeLayout == null) {
            return;
        }
        relativeLayout.setFitsSystemWindows(false);
        this.mRootView.setPadding(0, (z && z3) ? CommonUtil.getStatusBarHeight(this) : 0, 0, 0);
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        window.getDecorView().setSystemUiVisibility(setStatusBar(z, z2, z4 ? 5378 : 5376));
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void restoreStatusBar(boolean z) {
        RelativeLayout relativeLayout = this.mRootView;
        if (relativeLayout == null) {
            return;
        }
        relativeLayout.setFitsSystemWindows(true);
        this.mRootView.setPadding(0, CommonUtil.getStatusBarHeight(this), 0, 0);
        Window window = getWindow();
        window.getDecorView().setSystemUiVisibility(z ? 9216 : 1024);
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
    }

    private boolean isDark() {
        return qqs.e(BaseApplication.getContext());
    }

    private void loadApp(boolean z) {
        if (z) {
            H5ProLaunchOption h5ProLaunchOption = this.mH5ProLaunchOption;
            if (h5ProLaunchOption == null || !h5ProLaunchOption.isImmerse()) {
                initToolBar();
            } else {
                hideTitleBar();
            }
        }
        H5ProWebView h5ProWebView = (H5ProWebView) findViewById(R.id.webView);
        this.mH5ProWebView = h5ProWebView;
        if (this.mRootView == null || h5ProWebView == null) {
            finish();
        }
        this.mH5ProWebView.setAppLoaderListener(this);
        this.mH5ProInstance = this.mH5ProWebView.getInstance();
        this.mH5ProWebView.setViewControls(this);
        H5ContainerEntry h5ContainerEntry = new H5ContainerEntry(this);
        h5ContainerEntry.onMount(this, this.mH5ProInstance);
        this.mH5ProInstance.registerJsModule(TtmlNode.RUBY_CONTAINER, h5ContainerEntry);
        H5ProLaunchOption h5ProLaunchOption2 = this.mH5ProLaunchOption;
        if (h5ProLaunchOption2 != null) {
            this.mH5ProInstance.setIsEnableOnPauseCallback(h5ProLaunchOption2.isEnableOnPauseCallback());
            this.mH5ProInstance.setIsEnableOnResumeCallback(this.mH5ProLaunchOption.isEnableOnResumeCallback());
            this.mH5ProInstance.setIsEnableOnDestroyCallback(this.mH5ProLaunchOption.isEnableOnDestroyCallback());
            this.mH5ProInstance.setIsEnableSelfProtection(this.mH5ProLaunchOption.isEnableSelfProtection());
        }
        this.mH5ProWebView.requestFocusToContentView();
        this.mH5ProWebView.execute(this.mH5ProCommand);
        this.mH5ProWebView.setCustomViewListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initToolBar() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.toolbar);
        this.mToolbarView = linearLayout;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setVisibility(0);
        ViewStub viewStub = (ViewStub) this.mToolbarView.findViewById(R.id.hwappbarpattern_navigation_icon_container);
        if (viewStub != null) {
            viewStub.setVisibility(0);
            ImageView imageView = (ImageView) findViewById(R.id.hwappbarpattern_navigation_icon);
            if (imageView != null) {
                if (CommonUtil.isFlyme() && Build.VERSION.SDK_INT <= 28) {
                    adaptForFlyme(imageView);
                }
                imageView.setVisibility(0);
                imageView.setOnClickListener(this);
                imageView.setClickable(true);
            }
        }
        this.mToolbarIconVisibleMap.put("share", false);
    }

    private void adaptForFlyme(ImageView imageView) {
        if (LanguageUtil.isRtlLanguage(this)) {
            imageView.setImageResource(R.mipmap.ic_health_rtl_back_black);
        } else {
            imageView.setImageResource(R.mipmap.ic_health_nav_back_black);
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = CommonUtil.dip2px(this, 24.0f);
        layoutParams.height = CommonUtil.dip2px(this, 24.0f);
        imageView.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideTitleBar() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.toolbar);
        this.mToolbarView = linearLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    private void showShareIcon(final boolean z) {
        runOnUiThread(new Runnable() { // from class: com.huawei.operation.h5pro.H5proWebViewContainerActivity$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1531x39b4af23(z);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$showShareIcon$1$com-huawei-operation-h5pro-H5proWebViewContainerActivity, reason: not valid java name */
    /* synthetic */ void m1531x39b4af23(boolean z) {
        LinearLayout linearLayout = this.mToolbarView;
        if (linearLayout == null) {
            return;
        }
        ViewStub viewStub = (ViewStub) linearLayout.findViewById(R.id.hwappbarpattern_menu_icon_container);
        int i = z ? 0 : 8;
        if (viewStub == null) {
            LogUtil.w(TAG, "showShareIcon->menuStub is null");
            return;
        }
        viewStub.setVisibility(i);
        ImageView imageView = (ImageView) this.mToolbarView.findViewById(R.id.hwappbarpattern_menu_icon);
        if (imageView == null) {
            LogUtil.w(TAG, "showShareIcon->menuIcon is null");
            return;
        }
        imageView.setAdjustViewBounds(true);
        imageView.setMaxWidth(getResources().getDimensionPixelSize(R.dimen.hwappbarpattern_icon_size));
        imageView.setImageResource(R.mipmap.ic_public_share);
        imageView.setOnClickListener(this);
        imageView.setClickable(z);
        imageView.setVisibility(i);
        imageView.setImageTintList(new ColorStateList(new int[][]{new int[0]}, new int[]{getResources().getColor(R.color.emui_appbar_icon)}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToolbarTitle(String str) {
        TextView textView;
        LinearLayout linearLayout = this.mToolbarView;
        if (linearLayout == null || (textView = (TextView) linearLayout.findViewById(R.id.hwappbarpattern_title)) == null) {
            return;
        }
        textView.setText(str);
    }

    private void hideNativeLoadingDelay() {
        LinearLayout linearLayout = this.mLoadingView;
        if (linearLayout == null) {
            LogUtil.w(TAG, "hideNativeLoadingDelay->mLoadingView is null");
        } else {
            if (linearLayout.getVisibility() == 8) {
                return;
            }
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.operation.h5pro.H5proWebViewContainerActivity$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1527x6a867183();
                }
            }, 550L);
        }
    }

    /* JADX INFO: renamed from: lambda$hideNativeLoadingDelay$2$com-huawei-operation-h5pro-H5proWebViewContainerActivity, reason: not valid java name */
    /* synthetic */ void m1527x6a867183() {
        this.mLoadingView.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.hwappbarpattern_navigation_icon) {
            h5GoBack();
        }
        if (view.getId() == R.id.hwappbarpattern_menu_icon) {
            triggerCallback();
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4) {
            return false;
        }
        h5GoBack();
        return true;
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProAppLoadListener
    public void onViewCreated(H5ProInstance h5ProInstance, View view) {
        LogUtil.i(TAG, "onViewCreated");
        H5ProCommand h5ProCommand = this.mH5ProCommand;
        if (h5ProCommand != null && h5ProCommand.getCommand() == 2) {
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.progress_bar_bg);
            boolean zIsDark = isDark();
            int iRgb = zIsDark ? Color.rgb(30, 30, 30) : -1;
            H5ProLaunchOption h5ProLaunchOption = this.mH5ProLaunchOption;
            if (h5ProLaunchOption != null) {
                setImmerse(new ImmerseInfo(h5ProLaunchOption.isImmerse(), this.mH5ProLaunchOption.isShowStatusBar(), !zIsDark, this.mH5ProLaunchOption.isStartAtBottomOfStatusBar(), this.mH5ProLaunchOption.isHideBottomVirtualKeys()));
            }
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
                relativeLayout.setBackgroundColor(iRgb);
            }
        }
        if (TextUtils.isEmpty(this.mContainerTitle)) {
            String appName = h5ProInstance.getAppInfo().getAppName();
            if (TextUtils.isEmpty(appName)) {
                return;
            }
            refreshTitle(appName);
        }
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProAppLoadListener
    public void onException(H5ProInstance h5ProInstance, String str) {
        LogUtil.e(TAG, "onException: load h5 application failed", str);
        hideNativeLoadingDelay();
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProAppLoadListener
    public void onProgressChanged(H5ProInstance h5ProInstance, int i) {
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        if (progressBar != null) {
            if (i == 100) {
                progressBar.setVisibility(8);
            } else {
                progressBar.setVisibility(0);
                progressBar.setProgress(i);
            }
        }
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProAppLoadListener
    public void onNewPageLoaded(H5ProInstance h5ProInstance, String str) {
        LogUtil.i(TAG, "onNewPageLoaded.");
        hideNativeLoadingDelay();
        H5ProWebView h5ProWebView = this.mH5ProWebView;
        if (h5ProWebView != null) {
            h5ProWebView.postDelayed(new Runnable() { // from class: com.huawei.operation.h5pro.H5proWebViewContainerActivity$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1528x31775ac7();
                }
            }, PROGRESSBAR_GONE_DELAYMILLIS);
        }
        if (TextUtils.isEmpty(this.mContainerTitle)) {
            String title = h5ProInstance.getTitle();
            if (!TextUtils.isEmpty(title)) {
                refreshTitle(title);
            }
        }
        if (this.isFirstLoad) {
            this.isFirstLoad = false;
            this.mAnalyzer.resume(str, h5ProInstance == null ? null : h5ProInstance.getAppInfo());
        }
        this.mAnalyzer.loadNewPage(str, h5ProInstance != null ? h5ProInstance.getAppInfo() : null);
    }

    /* JADX INFO: renamed from: lambda$onNewPageLoaded$3$com-huawei-operation-h5pro-H5proWebViewContainerActivity, reason: not valid java name */
    /* synthetic */ void m1528x31775ac7() {
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.progress_bar_bg);
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProAppLoadListener
    public void onReceiveTitle(H5ProInstance h5ProInstance, String str) {
        if (str == null) {
            str = "";
        }
        refreshTitle(str);
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProAppLoadListener
    public void onFloatingBarRequested(final RecyclerView.Adapter adapter) {
        runOnUiThread(new Runnable() { // from class: com.huawei.operation.h5pro.H5proWebViewContainerActivity.1
            @Override // java.lang.Runnable
            public void run() {
                RecyclerView recyclerView = (RecyclerView) H5proWebViewContainerActivity.this.findViewById(R.id.bottom_floating_bar);
                if (recyclerView == null) {
                    return;
                }
                recyclerView.setVisibility(0);
                recyclerView.setLayoutManager(new LinearLayoutManager(H5proWebViewContainerActivity.this, 0, false));
                recyclerView.setAdapter(adapter);
            }
        });
    }

    private void hideFloatingBar() {
        runOnUiThread(new Runnable() { // from class: com.huawei.operation.h5pro.H5proWebViewContainerActivity.2
            @Override // java.lang.Runnable
            public void run() {
                RecyclerView recyclerView = (RecyclerView) H5proWebViewContainerActivity.this.findViewById(R.id.bottom_floating_bar);
                if (recyclerView == null) {
                    return;
                }
                recyclerView.setVisibility(8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public H5ProEventInterceptor getNativeViewInterceptor() {
        Map<String, H5ProNativeView> map = this.mNativeViews;
        if (map == null) {
            return null;
        }
        for (H5ProNativeView h5ProNativeView : map.values()) {
            if (h5ProNativeView.getEventInterceptor() != null) {
                return h5ProNativeView.getEventInterceptor();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h5GoBack() {
        LogUtil.i(TAG, "h5GoBack");
        H5ProEventInterceptor nativeViewInterceptor = getNativeViewInterceptor();
        if (nativeViewInterceptor == null) {
            h5GoBackInner();
        } else {
            H5ProInstance h5ProInstance = this.mH5ProInstance;
            nativeViewInterceptor.onEvent((h5ProInstance == null || !h5ProInstance.canGoBack()) ? 2 : 1, new EventInterceptorCallback(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h5GoBackInner() {
        LogUtil.i(TAG, "h5GoBackRaw");
        if (this.mCustomView != null && this.mCustomViewCallback != null) {
            onHideCustomView();
            return;
        }
        hideFloatingBar();
        showShareIcon(false);
        H5ProInstance h5ProInstance = this.mH5ProInstance;
        if (h5ProInstance == null) {
            LogUtil.i(TAG, "h5GoBackRaw mH5ProInstance is null");
            exit();
        } else {
            h5ProInstance.goBack(new BackOrExitCallback(this));
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.container.H5Container
    public void goBack() {
        LogUtil.i(TAG, "goBack");
        runOnUiThread(new Runnable() { // from class: com.huawei.operation.h5pro.H5proWebViewContainerActivity.3
            @Override // java.lang.Runnable
            public void run() {
                H5proWebViewContainerActivity.this.h5GoBack();
            }
        });
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.container.H5Container
    public void setPageTitle(String str) {
        LogUtil.i(TAG, "setPageTitle: " + str);
        this.mContainerTitle = str;
        refreshTitle(str);
    }

    private void refreshTitle(final String str) {
        LogUtil.i(TAG, "refreshTitle: " + str);
        runOnUiThread(new Runnable() { // from class: com.huawei.operation.h5pro.H5proWebViewContainerActivity.4
            @Override // java.lang.Runnable
            public void run() {
                H5proWebViewContainerActivity.this.setToolbarTitle(str);
            }
        });
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.container.H5Container
    public void registryTitleBarCallback(long j, String str) {
        LogUtil.i(TAG, "registryTitleBarCallback:" + str + j);
        str.hashCode();
        if (str.equals("share")) {
            this.mToolbarCallbacks.put(str, Long.valueOf(j));
            this.mToolbarIconVisibleMap.put(str, true);
            showShareIcon(true);
        } else {
            LogUtil.e(TAG, "registryTitleBarCallback unknown type:" + str);
        }
    }

    private void triggerCallback() {
        Long l = this.mToolbarCallbacks.get("share");
        LogUtil.i(TAG, "triggerShare:" + l);
        if (l != null) {
            this.mH5ProInstance.getJsCbkInvoker().onSuccess("", l.longValue());
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.container.H5Container
    public void hideTitleBarIcon(String str) {
        this.mToolbarIconVisibleMap.put(str, false);
        showShareIcon(false);
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.container.H5Container
    public void exit() {
        LogUtil.i(TAG, "exit");
        runOnUiThread(new Runnable() { // from class: com.huawei.operation.h5pro.H5proWebViewContainerActivity.5
            @Override // java.lang.Runnable
            public void run() {
                H5ProEventInterceptor nativeViewInterceptor = H5proWebViewContainerActivity.this.getNativeViewInterceptor();
                if (nativeViewInterceptor == null) {
                    H5proWebViewContainerActivity.this.finish();
                } else {
                    nativeViewInterceptor.onEvent(2, new BackOrExitCallback(H5proWebViewContainerActivity.this));
                }
            }
        });
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.container.H5Container
    public void setScreenLandscape(boolean z) {
        if (z) {
            setRequestedOrientation(0);
        } else {
            setRequestedOrientation(1);
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.container.H5Container
    public void keepScreenOn(final boolean z) {
        runOnUiThread(new Runnable() { // from class: com.huawei.operation.h5pro.H5proWebViewContainerActivity.6
            @Override // java.lang.Runnable
            public void run() {
                if (z) {
                    H5proWebViewContainerActivity.this.getWindow().addFlags(128);
                } else {
                    H5proWebViewContainerActivity.this.getWindow().clearFlags(128);
                }
            }
        });
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.container.H5Container
    public void setImmerse(final ImmerseInfo immerseInfo) {
        runOnUiThread(new Runnable() { // from class: com.huawei.operation.h5pro.H5proWebViewContainerActivity.7
            @Override // java.lang.Runnable
            public void run() {
                if (immerseInfo.isImmerse()) {
                    H5proWebViewContainerActivity.this.hideTitleBar();
                    H5proWebViewContainerActivity.this.setStatusBarImmerses(immerseInfo.isShowStatusBar(), immerseInfo.isStatusBarTextBlack(), immerseInfo.isStartAtBottomOfStatusBar(), immerseInfo.isHideBottomVirtualKeys());
                } else {
                    H5proWebViewContainerActivity.this.restoreStatusBar(immerseInfo.isStatusBarTextBlack());
                    H5proWebViewContainerActivity.this.initToolBar();
                }
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        JsClientApi.handleActivityResult(i, i2, intent);
        if (this.mH5ProInstance != null) {
            H5ProBridgeManager.getInstance().notifyActivityResult(this.mH5ProInstance, i, i2, intent);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (this.mH5ProInstance != null) {
            H5ProBridgeManager.getInstance().notifyPermissionResult(this.mH5ProInstance, i, strArr, iArr);
        }
    }

    @Override // com.huawei.health.h5pro.webkit.WebChromeCustomViewListener
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        LogUtil.i(TAG, "onShowCustomView start");
        if (this.mCustomView != null) {
            customViewCallback.onCustomViewHidden();
        } else {
            if (this.mRootView == null || view == null) {
                return;
            }
            this.mCustomView = view;
            this.mCustomViewCallback = customViewCallback;
            runOnUiThread(new Runnable() { // from class: com.huawei.operation.h5pro.H5proWebViewContainerActivity.8
                @Override // java.lang.Runnable
                public void run() {
                    H5proWebViewContainerActivity.this.mCustomView.setLayoutParams(new RelativeLayout.LayoutParams(H5proWebViewContainerActivity.this.mRootView.getWidth(), H5proWebViewContainerActivity.this.mRootView.getHeight()));
                    H5proWebViewContainerActivity.this.mCustomView.setBackgroundColor(Color.rgb(0, 0, 0));
                    H5proWebViewContainerActivity h5proWebViewContainerActivity = H5proWebViewContainerActivity.this;
                    h5proWebViewContainerActivity.addChildViewToRootView(h5proWebViewContainerActivity.mCustomView);
                    if (H5proWebViewContainerActivity.this.mH5ProWebView != null) {
                        H5proWebViewContainerActivity.this.mH5ProWebView.setVisibility(8);
                    }
                }
            });
        }
    }

    @Override // com.huawei.health.h5pro.webkit.WebChromeCustomViewListener
    public void onHideCustomView() {
        LogUtil.i(TAG, "onHideCustomView start");
        runOnUiThread(new Runnable() { // from class: com.huawei.operation.h5pro.H5proWebViewContainerActivity.9
            @Override // java.lang.Runnable
            public void run() {
                if (H5proWebViewContainerActivity.this.mH5ProWebView != null) {
                    H5proWebViewContainerActivity.this.mH5ProWebView.setVisibility(0);
                }
                if (H5proWebViewContainerActivity.this.mCustomView == null || H5proWebViewContainerActivity.this.mCustomViewCallback == null || H5proWebViewContainerActivity.this.mRootView == null) {
                    return;
                }
                H5proWebViewContainerActivity.this.mCustomView.setVisibility(8);
                H5proWebViewContainerActivity.this.mRootView.removeView(H5proWebViewContainerActivity.this.mCustomView);
                H5proWebViewContainerActivity.this.mCustomViewCallback.onCustomViewHidden();
                H5proWebViewContainerActivity.this.mCustomView = null;
                H5proWebViewContainerActivity.this.mCustomViewCallback = null;
            }
        });
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProViewControls
    public String showNativeView(final View view) {
        this.mNativeViewMaxId++;
        runOnUiThread(new Runnable() { // from class: com.huawei.operation.h5pro.H5proWebViewContainerActivity.10
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.i(H5proWebViewContainerActivity.TAG, "showNativeView");
                if (view != null) {
                    if (H5proWebViewContainerActivity.this.mRootView != null) {
                        if (H5proWebViewContainerActivity.this.mNativeViews == null) {
                            H5proWebViewContainerActivity.this.mNativeViews = new HashMap();
                        }
                        H5proWebViewContainerActivity.this.mNativeViews.put(String.valueOf(H5proWebViewContainerActivity.this.mNativeViewMaxId), new H5ProNativeView(view, null));
                        H5proWebViewContainerActivity.this.addChildViewToRootView(view);
                        return;
                    }
                    LogUtil.w(H5proWebViewContainerActivity.TAG, "mRootView is null");
                    return;
                }
                LogUtil.w(H5proWebViewContainerActivity.TAG, "nativeView is null");
            }
        });
        return String.valueOf(this.mNativeViewMaxId);
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProViewControls
    public String showNativeView(final H5ProNativeView h5ProNativeView) {
        this.mNativeViewMaxId++;
        runOnUiThread(new Runnable() { // from class: com.huawei.operation.h5pro.H5proWebViewContainerActivity.11
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.i(H5proWebViewContainerActivity.TAG, "showNativeView");
                H5ProNativeView h5ProNativeView2 = h5ProNativeView;
                if (h5ProNativeView2 != null && h5ProNativeView2.getView() != null) {
                    if (H5proWebViewContainerActivity.this.mRootView != null) {
                        if (H5proWebViewContainerActivity.this.mNativeViews == null) {
                            H5proWebViewContainerActivity.this.mNativeViews = new HashMap();
                        }
                        H5proWebViewContainerActivity.this.mNativeViews.put(String.valueOf(H5proWebViewContainerActivity.this.mNativeViewMaxId), h5ProNativeView);
                        H5proWebViewContainerActivity.this.addChildViewToRootView(h5ProNativeView.getView());
                        return;
                    }
                    LogUtil.w(H5proWebViewContainerActivity.TAG, "mRootView is null");
                    return;
                }
                LogUtil.w(H5proWebViewContainerActivity.TAG, "customNativeView is null");
            }
        });
        return String.valueOf(this.mNativeViewMaxId);
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProViewControls
    public void removeNativeView(final String str) {
        runOnUiThread(new Runnable() { // from class: com.huawei.operation.h5pro.H5proWebViewContainerActivity$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1530xc6ff2741(str);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$removeNativeView$4$com-huawei-operation-h5pro-H5proWebViewContainerActivity, reason: not valid java name */
    /* synthetic */ void m1530xc6ff2741(String str) {
        LogUtil.i(TAG, "removeCustomNativeView");
        if (TextUtils.isEmpty(str)) {
            LogUtil.w(TAG, "removeCustomNativeView -> viewId is null.");
            return;
        }
        Map<String, H5ProNativeView> map = this.mNativeViews;
        if (map == null) {
            LogUtil.w(TAG, "removeCustomNativeView -> mNativeViews is null.");
            return;
        }
        H5ProNativeView h5ProNativeView = map.get(str);
        if (h5ProNativeView == null) {
            LogUtil.w(TAG, "removeCustomNativeView -> nativeView is null.");
            return;
        }
        this.mNativeViews.remove(str);
        RelativeLayout relativeLayout = this.mRootView;
        if (relativeLayout != null) {
            relativeLayout.removeView(h5ProNativeView.getView());
        }
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProViewControls
    public void removeAllNativeView() {
        runOnUiThread(new Runnable() { // from class: com.huawei.operation.h5pro.H5proWebViewContainerActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1529x9b578be1();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$removeAllNativeView$5$com-huawei-operation-h5pro-H5proWebViewContainerActivity, reason: not valid java name */
    /* synthetic */ void m1529x9b578be1() {
        LogUtil.i(TAG, "removeAllCustomNativeView");
        Map<String, H5ProNativeView> map = this.mNativeViews;
        if (map == null || map.isEmpty()) {
            LogUtil.w(TAG, "no custom native view");
            return;
        }
        for (H5ProNativeView h5ProNativeView : this.mNativeViews.values()) {
            RelativeLayout relativeLayout = this.mRootView;
            if (relativeLayout != null && h5ProNativeView != null) {
                relativeLayout.removeView(h5ProNativeView.getView());
            }
        }
        this.mNativeViews.clear();
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProViewControls
    public H5ProNativeView getNativeView(String str) {
        Map<String, H5ProNativeView> map = this.mNativeViews;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.mNativeViews.get(str);
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProViewControls
    public void updateNativeView(final String str, final H5ProNativeView h5ProNativeView) {
        runOnUiThread(new Runnable() { // from class: com.huawei.operation.h5pro.H5proWebViewContainerActivity.12
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.i(H5proWebViewContainerActivity.TAG, "updateNativeView");
                if (TextUtils.isEmpty(str)) {
                    LogUtil.w(H5proWebViewContainerActivity.TAG, "updateNativeView -> viewId is null");
                    return;
                }
                H5ProNativeView h5ProNativeView2 = h5ProNativeView;
                if (h5ProNativeView2 != null && h5ProNativeView2.getView() != null) {
                    if (H5proWebViewContainerActivity.this.mRootView != null) {
                        if (H5proWebViewContainerActivity.this.mNativeViews == null) {
                            H5proWebViewContainerActivity.this.mNativeViews = new HashMap();
                        }
                        H5ProNativeView h5ProNativeView3 = (H5ProNativeView) H5proWebViewContainerActivity.this.mNativeViews.get(str);
                        if (h5ProNativeView3 != null && h5ProNativeView3.getView() != null) {
                            H5proWebViewContainerActivity.this.mRootView.removeView(h5ProNativeView3.getView());
                        }
                        H5proWebViewContainerActivity.this.mNativeViews.put(String.valueOf(H5proWebViewContainerActivity.this.mNativeViewMaxId), h5ProNativeView);
                        H5proWebViewContainerActivity.this.addChildViewToRootView(h5ProNativeView.getView());
                        return;
                    }
                    LogUtil.w(H5proWebViewContainerActivity.TAG, "mRootView is null");
                    return;
                }
                LogUtil.w(H5proWebViewContainerActivity.TAG, "updateNativeView -> nativeView is null");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addChildViewToRootView(View view) {
        if (view == null || this.mRootView == null) {
            LogUtil.w(TAG, "addChildViewToRootView: childView or mRootView is null");
            return;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                LogUtil.i(TAG, "addChildViewToRootView: the specified child already has a parent");
                ((ViewGroup) parent).removeView(view);
            }
            this.mRootView.addView(view);
        } catch (IllegalStateException e) {
            LogUtil.e(TAG, "addChildViewToRootView: exception -> " + e.getMessage());
        }
    }

    static abstract class CommonResultCallback implements H5ResultCallback {
        private static final String RESULT_TAG = "H5PRO_CommonResultCallback";
        private final WeakReference<H5proWebViewContainerActivity> mWrH5ProWebViewActivity;

        abstract void onCallResult(H5proWebViewContainerActivity h5proWebViewContainerActivity, Boolean bool);

        CommonResultCallback(H5proWebViewContainerActivity h5proWebViewContainerActivity) {
            this.mWrH5ProWebViewActivity = new WeakReference<>(h5proWebViewContainerActivity);
        }

        @Override // com.huawei.health.h5pro.vengine.H5ResultCallback
        public void onResult(Boolean bool) {
            H5proWebViewContainerActivity h5proWebViewContainerActivity = (H5proWebViewContainerActivity) GeneralUtil.getReferent(this.mWrH5ProWebViewActivity);
            if (h5proWebViewContainerActivity != null) {
                onCallResult(h5proWebViewContainerActivity, bool);
            } else {
                LogUtil.w(RESULT_TAG, "onResult: h5ProWebViewActivity is null");
            }
        }
    }

    static class BackOrExitCallback extends CommonResultCallback {
        BackOrExitCallback(H5proWebViewContainerActivity h5proWebViewContainerActivity) {
            super(h5proWebViewContainerActivity);
        }

        @Override // com.huawei.operation.h5pro.H5proWebViewContainerActivity.CommonResultCallback
        void onCallResult(H5proWebViewContainerActivity h5proWebViewContainerActivity, Boolean bool) {
            if (bool.booleanValue()) {
                h5proWebViewContainerActivity.finish();
            }
        }
    }

    static class EventInterceptorCallback extends CommonResultCallback {
        EventInterceptorCallback(H5proWebViewContainerActivity h5proWebViewContainerActivity) {
            super(h5proWebViewContainerActivity);
        }

        @Override // com.huawei.operation.h5pro.H5proWebViewContainerActivity.CommonResultCallback
        void onCallResult(H5proWebViewContainerActivity h5proWebViewContainerActivity, Boolean bool) {
            LogUtil.i(H5proWebViewContainerActivity.TAG, "interceptor go back onResult " + bool);
            if (bool.booleanValue()) {
                h5proWebViewContainerActivity.h5GoBackInner();
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        H5ProWebView h5ProWebView = this.mH5ProWebView;
        if (h5ProWebView != null) {
            h5ProWebView.onConfigurationChanged();
        }
        onMultiWindowModeChanged();
    }

    private void onMultiWindowModeChanged() {
        if (this.mH5ProInstance != null) {
            this.mH5ProInstance.onMultiWindowModeChange(CommonUtil.getActivityWindowMode(this));
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.container.H5Container
    public void exitWithResult(String str) {
        ReleaseLogUtil.d(REL_TAG, "exitWithResult");
        Intent intent = new Intent();
        intent.putExtra("result", str);
        setResult(-1, intent);
        exit();
    }
}
