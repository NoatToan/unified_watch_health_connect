package com.huawei.health.h5pro.core;

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
import androidx.appcompat.app.AppCompatActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.android.view.WindowManagerEx;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.h5pro.dfx.bi.Analyzer;
import com.huawei.health.h5pro.jsbridge.system.container.H5Container;
import com.huawei.health.h5pro.jsbridge.system.container.H5ContainerEntry;
import com.huawei.health.h5pro.utils.AdjustResizeWithSoftInput;
import com.huawei.health.h5pro.utils.CommonUtil;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.health.h5pro.utils.H5ProBuild;
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
import com.huawei.operation.beans.TitleBean;
import com.huawei.ui.commonui.base.BaseDialog;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class H5ProWebViewActivity extends AppCompatActivity implements H5ProAppLoadListener, H5Container, H5ProViewControls, View.OnClickListener, WebChromeCustomViewListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f6755a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WebChromeClient.CustomViewCallback f6757c;
    private String d;
    private H5ProInstance f;
    private H5ProLaunchOption g;
    private H5ProWebView h;
    private H5ProCommand i;
    private H5ProLoadingView j;
    private RelativeLayout l;
    private Map<String, H5ProNativeView> o;
    private LinearLayout t;
    private final Analyzer e = new Analyzer();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f6756b = true;
    private int m = 0;
    private final Map<String, Boolean> k = new LinkedHashMap();
    private final Map<String, Long> n = new LinkedHashMap();

    public static abstract class CommonResultCallback implements H5ResultCallback {
        private static final String RESULT_TAG = "H5PRO_CommonResultCallback";
        private final WeakReference<H5ProWebViewActivity> mWrH5ProWebViewActivity;

        public CommonResultCallback(H5ProWebViewActivity h5ProWebViewActivity) {
            this.mWrH5ProWebViewActivity = new WeakReference<>(h5ProWebViewActivity);
        }

        public abstract void onCallResult(H5ProWebViewActivity h5ProWebViewActivity, Boolean bool);

        @Override // com.huawei.health.h5pro.vengine.H5ResultCallback
        public void onResult(Boolean bool) {
            H5ProWebViewActivity h5ProWebViewActivity = (H5ProWebViewActivity) GeneralUtil.getReferent(this.mWrH5ProWebViewActivity);
            if (h5ProWebViewActivity != null) {
                onCallResult(h5ProWebViewActivity, bool);
            } else {
                LogUtil.w(RESULT_TAG, "onResult: h5ProWebViewActivity is null");
            }
        }
    }

    public static class a extends CommonResultCallback {
        public a(H5ProWebViewActivity h5ProWebViewActivity) {
            super(h5ProWebViewActivity);
        }

        @Override // com.huawei.health.h5pro.core.H5ProWebViewActivity.CommonResultCallback
        public void onCallResult(H5ProWebViewActivity h5ProWebViewActivity, Boolean bool) {
            if (bool.booleanValue()) {
                h5ProWebViewActivity.finish();
            }
        }
    }

    public static class b extends CommonResultCallback {
        public b(H5ProWebViewActivity h5ProWebViewActivity) {
            super(h5ProWebViewActivity);
        }

        @Override // com.huawei.health.h5pro.core.H5ProWebViewActivity.CommonResultCallback
        public void onCallResult(H5ProWebViewActivity h5ProWebViewActivity, Boolean bool) {
            LogUtil.i(h5ProWebViewActivity.c(), "interceptor go back onResult " + bool);
            if (bool.booleanValue()) {
                h5ProWebViewActivity.d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        LogUtil.i(c(), "h5GoBack");
        H5ProEventInterceptor h5ProEventInterceptorE = e();
        if (h5ProEventInterceptorE == null) {
            d();
        } else {
            H5ProInstance h5ProInstance = this.f;
            h5ProEventInterceptorE.onEvent((h5ProInstance == null || !h5ProInstance.canGoBack()) ? 2 : 1, new b(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view) {
        if (view == null || this.l == null) {
            LogUtil.w(c(), "addChildViewToRootView: childView or mRootView is null");
            return;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                LogUtil.i(c(), "addChildViewToRootView: the specified child already has a parent");
                ((ViewGroup) parent).removeView(view);
            }
            this.l.addView(view);
        } catch (IllegalStateException e) {
            LogUtil.e(c(), "addChildViewToRootView: exception -> " + e.getMessage());
        }
    }

    private void a(final boolean z) {
        runOnUiThread(new Runnable() { // from class: com.huawei.health.h5pro.core.H5ProWebViewActivity.2
            @Override // java.lang.Runnable
            public void run() {
                if (H5ProWebViewActivity.this.t == null) {
                    return;
                }
                ViewStub viewStub = (ViewStub) H5ProWebViewActivity.this.t.findViewById(R.id.hwappbarpattern_menu_icon_container);
                int i = z ? 0 : 8;
                if (viewStub != null) {
                    viewStub.setVisibility(i);
                    ImageView imageView = (ImageView) H5ProWebViewActivity.this.findViewById(R.id.hwappbarpattern_menu_icon);
                    if (imageView != null) {
                        imageView.setAdjustViewBounds(true);
                        imageView.setMaxWidth(H5ProWebViewActivity.this.getResources().getDimensionPixelSize(R.dimen.hwappbarpattern_icon_size));
                        imageView.setImageResource(R.mipmap.ic_public_share);
                        imageView.setOnClickListener(H5ProWebViewActivity.this);
                        imageView.setClickable(z);
                        imageView.setVisibility(i);
                        imageView.setImageTintList(new ColorStateList((int[][]) Array.newInstance((Class<?>) Integer.TYPE, 1, 1), new int[]{H5ProWebViewActivity.this.getResources().getColor(R.color.emui_appbar_icon)}));
                    }
                }
            }
        });
    }

    private void b() {
        runOnUiThread(new Runnable() { // from class: com.huawei.health.h5pro.core.H5ProWebViewActivity.14
            @Override // java.lang.Runnable
            public void run() {
                RecyclerView recyclerView = (RecyclerView) H5ProWebViewActivity.this.findViewById(R.id.bottom_floating_bar);
                if (recyclerView == null) {
                    return;
                }
                recyclerView.setVisibility(8);
            }
        });
    }

    private void b(ImageView imageView) {
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
    public String c() {
        return LogUtil.getTag(this.f, "WebViewActivity");
    }

    private void c(Activity activity) {
        LogUtil.i(c(), "initStatusBar");
        H5ProLaunchOption h5ProLaunchOption = this.g;
        if (h5ProLaunchOption == null || !h5ProLaunchOption.isNeedSoftInputAdapter()) {
            return;
        }
        AdjustResizeWithSoftInput.assistActivity(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        RelativeLayout relativeLayout = this.l;
        if (relativeLayout == null) {
            return;
        }
        relativeLayout.setFitsSystemWindows(true);
        this.l.setPadding(0, CommonUtil.getStatusBarHeight(this), 0, 0);
        Window window = getWindow();
        int i = z ? 9216 : 1024;
        GeneralUtil.setAppearanceLightStatusBars(this, z);
        window.getDecorView().setSystemUiVisibility(i);
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        LogUtil.i(c(), "h5GoBackRaw");
        if (this.f6755a != null && this.f6757c != null) {
            onHideCustomView();
            return;
        }
        b();
        a(false);
        H5ProInstance h5ProInstance = this.f;
        if (h5ProInstance != null) {
            h5ProInstance.goBack(new a(this));
        } else {
            LogUtil.i(c(), "h5GoBackRaw mH5ProInstance is null");
            exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        TextView textView;
        LinearLayout linearLayout = this.t;
        if (linearLayout == null || (textView = (TextView) linearLayout.findViewById(R.id.hwappbarpattern_title)) == null) {
            return;
        }
        textView.setTextAlignment(5);
        textView.setText(str);
    }

    private void d(boolean z) {
        if (z) {
            H5ProLaunchOption h5ProLaunchOption = this.g;
            if (h5ProLaunchOption == null || !h5ProLaunchOption.isImmerse()) {
                i();
            } else {
                g();
            }
        }
        H5ProWebView h5ProWebView = (H5ProWebView) findViewById(R.id.webView);
        this.h = h5ProWebView;
        if (this.l == null || h5ProWebView == null) {
            finish();
        }
        this.h.setAppLoaderListener(this);
        this.f = this.h.getInstance();
        this.h.setViewControls(this);
        H5ContainerEntry h5ContainerEntry = new H5ContainerEntry(this);
        h5ContainerEntry.onMount(this, this.f);
        this.f.registerJsModule(TtmlNode.RUBY_CONTAINER, h5ContainerEntry);
        H5ProLaunchOption h5ProLaunchOption2 = this.g;
        if (h5ProLaunchOption2 != null) {
            this.f.setIsEnableOnPauseCallback(h5ProLaunchOption2.isEnableOnPauseCallback());
            this.f.setIsEnableOnResumeCallback(this.g.isEnableOnResumeCallback());
            this.f.setIsEnableOnDestroyCallback(this.g.isEnableOnDestroyCallback());
            this.f.setIsEnableSelfProtection(this.g.isEnableSelfProtection());
        }
        this.h.requestFocusToContentView();
        this.h.execute(this.i, this.j);
        this.h.setCustomViewListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z, boolean z2, boolean z3, boolean z4) {
        RelativeLayout relativeLayout = this.l;
        if (relativeLayout == null) {
            return;
        }
        relativeLayout.setFitsSystemWindows(false);
        this.l.setPadding(0, (z && z3) ? CommonUtil.getStatusBarHeight(this) : 0, 0, 0);
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        window.getDecorView().setSystemUiVisibility(e(z, z2, z4 ? 5378 : 5376));
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public H5ProEventInterceptor e() {
        Map<String, H5ProNativeView> map = this.o;
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

    private void e(final String str) {
        LogUtil.i(c(), com.huawei.health.h5pro.core.a.a("refreshTitle: ", str));
        runOnUiThread(new Runnable() { // from class: com.huawei.health.h5pro.core.H5ProWebViewActivity.18
            @Override // java.lang.Runnable
            public void run() {
                H5ProWebViewActivity.this.d(str);
            }
        });
    }

    private boolean f() {
        return (getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.toolbar);
        this.t = linearLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    private void h() {
        LogUtil.i(c(), "initStatusBar");
        H5ProLaunchOption h5ProLaunchOption = this.g;
        int screenOrientation = h5ProLaunchOption == null ? -1 : h5ProLaunchOption.getScreenOrientation();
        if (screenOrientation != -1) {
            setRequestedOrientation(screenOrientation);
        }
        H5ProLaunchOption h5ProLaunchOption2 = this.g;
        if (h5ProLaunchOption2 == null || !h5ProLaunchOption2.isImmerse()) {
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().setStatusBarColor(getResources().getColor(R.color.emui_appbar_bg));
            if (!f()) {
                getWindow().getDecorView().setSystemUiVisibility(9216);
            }
        } else {
            d(this.g.isShowStatusBar(), this.g.getStatusBarTextColor(), this.g.isStartAtBottomOfStatusBar(), this.g.isHideBottomVirtualKeys());
        }
        if (f()) {
            getWindow().setNavigationBarColor(getResources().getColor(R.color.colorBackgroundDark));
        }
        H5ProLaunchOption h5ProLaunchOption3 = this.g;
        if (h5ProLaunchOption3 != null) {
            if ("none".equals(h5ProLaunchOption3.getAnim())) {
                overridePendingTransition(0, 0);
            }
            if (this.g.isEnableSelfProtection()) {
                getWindow().addFlags(8192);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.toolbar);
        this.t = linearLayout;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setVisibility(0);
        ViewStub viewStub = (ViewStub) this.t.findViewById(R.id.hwappbarpattern_navigation_icon_container);
        if (viewStub != null) {
            viewStub.setVisibility(0);
            ImageView imageView = (ImageView) findViewById(R.id.hwappbarpattern_navigation_icon);
            if (imageView != null) {
                if (CommonUtil.isFlyme() && Build.VERSION.SDK_INT <= 28) {
                    b(imageView);
                }
                imageView.setVisibility(0);
                imageView.setOnClickListener(this);
                imageView.setClickable(true);
            }
        }
        this.k.put(TitleBean.RIGHT_BTN_TYPE_SHARE, Boolean.FALSE);
    }

    private boolean j() {
        try {
            Intent intent = getIntent();
            if (intent == null) {
                LogUtil.w(c(), "initConfigInfo: intent is null");
                return false;
            }
            Bundle bundleExtra = intent.getBundleExtra("com.huawei.health.h5pro.MESSAGE");
            if (bundleExtra == null) {
                LogUtil.w(c(), "initConfigInfo: bundle is null");
                return false;
            }
            H5ProCommand h5ProCommand = (H5ProCommand) bundleExtra.getParcelable("com.huawei.health.h5pro.MESSAGE");
            this.i = h5ProCommand;
            if (h5ProCommand == null) {
                LogUtil.w(c(), "initConfigInfo: mH5ProCommand is null");
                return false;
            }
            this.g = h5ProCommand.getLaunchOption();
            return true;
        } catch (BadParcelableException e) {
            LogUtil.e(c(), "initConfigInfo: exception -> " + e.getMessage());
            return false;
        }
    }

    private void k() {
        Long l = this.n.get(TitleBean.RIGHT_BTN_TYPE_SHARE);
        LogUtil.i(c(), "triggerShare:" + l);
        if (l != null) {
            this.f.getJsCbkInvoker().onSuccess("", l.longValue());
        }
    }

    private void l() {
        if (this.f != null) {
            this.f.onMultiWindowModeChange(CommonUtil.getActivityWindowMode(this));
        }
    }

    private void m() {
        if (H5ProBuild.f6991a) {
            return;
        }
        if (H5ProBuild.isEmuiGe100() || H5ProBuild.isNewHonor()) {
            new WindowManagerEx.LayoutParamsEx(getWindow().getAttributes()).setDisplaySideMode(1);
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.container.H5Container
    public void exit() {
        LogUtil.i(c(), "exit");
        runOnUiThread(new Runnable() { // from class: com.huawei.health.h5pro.core.H5ProWebViewActivity.17
            @Override // java.lang.Runnable
            public void run() {
                H5ProEventInterceptor h5ProEventInterceptorE = H5ProWebViewActivity.this.e();
                if (h5ProEventInterceptorE == null) {
                    H5ProWebViewActivity.this.finish();
                } else {
                    h5ProEventInterceptorE.onEvent(2, new a(H5ProWebViewActivity.this));
                }
            }
        });
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.container.H5Container
    public void exitWithResult(String str) {
        LogUtil.i(c(), "exitWithResult");
        Intent intent = new Intent();
        intent.putExtra("result", str);
        setResult(-1, intent);
        exit();
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProViewControls
    public H5ProNativeView getNativeView(String str) {
        Map<String, H5ProNativeView> map = this.o;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.o.get(str);
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.container.H5Container
    public void goBack() {
        LogUtil.i(c(), "goBack");
        runOnUiThread(new Runnable() { // from class: com.huawei.health.h5pro.core.H5ProWebViewActivity.19
            @Override // java.lang.Runnable
            public void run() {
                H5ProWebViewActivity.this.a();
            }
        });
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.container.H5Container
    public void hideTitleBarIcon(String str) {
        this.k.put(str, Boolean.FALSE);
        a(false);
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.container.H5Container
    public void keepScreenOn(final boolean z) {
        runOnUiThread(new Runnable() { // from class: com.huawei.health.h5pro.core.H5ProWebViewActivity.5
            @Override // java.lang.Runnable
            public void run() {
                if (z) {
                    H5ProWebViewActivity.this.getWindow().addFlags(128);
                } else {
                    H5ProWebViewActivity.this.getWindow().clearFlags(128);
                }
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        JsClientApi.handleActivityResult(i, i2, intent);
        H5ProBridgeManager.getInstance().notifyActivityResult(this.f, i, i2, intent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.hwappbarpattern_navigation_icon) {
            a();
        }
        if (view.getId() == R.id.hwappbarpattern_menu_icon) {
            k();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        H5ProWebView h5ProWebView = this.h;
        if (h5ProWebView != null) {
            h5ProWebView.onConfigurationChanged();
        }
        l();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.i(c(), "onCreate");
        if (!j()) {
            finish();
            return;
        }
        this.f6756b = true;
        if (bundle != null) {
            try {
                if (bundle.getBoolean("IS_TRIGGER_CONFIG_GUARDIAN_KEY", false)) {
                    H5ProConfigGuardian.d.onConfigGuardian(this);
                    H5ProEnvParamsGuardian.restoreFromBundle(bundle);
                }
            } catch (InflateException e) {
                LogUtil.e(c(), "onCreate: exception -> " + e.getMessage());
                finish();
                return;
            }
        }
        m();
        setContentView(R.layout.activity_h5pro_webview);
        this.l = (RelativeLayout) findViewById(R.id.activity);
        this.j = (H5ProLoadingView) findViewById(R.id.hplv_loadingView);
        h();
        c(this);
        d(true);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        LogUtil.i(c(), "onDestroy");
        H5ProCommand h5ProCommand = this.i;
        if (h5ProCommand != null) {
            H5ProLoadingRecordManager.d.removeLoadingRecord(h5ProCommand.getPackageName());
        }
        if (this.f != null) {
            this.f = null;
        }
        H5ProLoadingView h5ProLoadingView = this.j;
        if (h5ProLoadingView != null) {
            h5ProLoadingView.onDestroy();
        }
        super.onDestroy();
        this.e.leave();
        Map<String, H5ProNativeView> map = this.o;
        if (map != null && !map.isEmpty()) {
            removeAllNativeView();
        }
        this.h = null;
        this.l = null;
        this.f6755a = null;
        this.f6757c = null;
        this.j = null;
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProAppLoadListener
    public void onException(H5ProInstance h5ProInstance, String str) {
        LogUtil.e(c(), "onException: load h5 application failed", str);
        H5ProLoadingView h5ProLoadingView = this.j;
        if (h5ProLoadingView == null) {
            LogUtil.w(c(), "onException->mLoadingView is null");
        } else {
            h5ProLoadingView.post(new Runnable() { // from class: com.huawei.health.h5pro.core.H5ProWebViewActivity.15
                @Override // java.lang.Runnable
                public void run() {
                    if (H5ProWebViewActivity.this.j != null) {
                        H5ProWebViewActivity.this.j.setVisibility(8);
                    }
                }
            });
        }
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProAppLoadListener
    public void onFloatingBarRequested(final RecyclerView.Adapter adapter) {
        runOnUiThread(new Runnable() { // from class: com.huawei.health.h5pro.core.H5ProWebViewActivity.11
            @Override // java.lang.Runnable
            public void run() {
                RecyclerView recyclerView = (RecyclerView) H5ProWebViewActivity.this.findViewById(R.id.bottom_floating_bar);
                if (recyclerView == null) {
                    return;
                }
                recyclerView.setVisibility(0);
                recyclerView.setLayoutManager(new LinearLayoutManager(H5ProWebViewActivity.this, 0, false));
                recyclerView.setAdapter(adapter);
            }
        });
    }

    @Override // com.huawei.health.h5pro.webkit.WebChromeCustomViewListener
    public void onHideCustomView() {
        LogUtil.i(c(), "onHideCustomView start");
        runOnUiThread(new Runnable() { // from class: com.huawei.health.h5pro.core.H5ProWebViewActivity.3
            @Override // java.lang.Runnable
            public void run() {
                if (H5ProWebViewActivity.this.h != null) {
                    H5ProWebViewActivity.this.h.setVisibility(0);
                }
                if (H5ProWebViewActivity.this.f6755a == null || H5ProWebViewActivity.this.f6757c == null || H5ProWebViewActivity.this.l == null) {
                    return;
                }
                H5ProWebViewActivity.this.f6755a.setVisibility(8);
                H5ProWebViewActivity.this.l.removeView(H5ProWebViewActivity.this.f6755a);
                H5ProWebViewActivity.this.f6757c.onCustomViewHidden();
                H5ProWebViewActivity.this.f6755a = null;
                H5ProWebViewActivity.this.f6757c = null;
            }
        });
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4) {
            return false;
        }
        a();
        return false;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        LogUtil.i(c(), "onNewIntent");
        if (intent == null) {
            finish();
            return;
        }
        setIntent(intent);
        if (!j()) {
            finish();
        } else {
            this.f6756b = true;
            d(false);
        }
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProAppLoadListener
    public void onNewPageLoaded(H5ProInstance h5ProInstance, String str) {
        LogUtil.i(c(), "onNewPageLoaded.");
        H5ProLoadingView h5ProLoadingView = this.j;
        if (h5ProLoadingView != null) {
            h5ProLoadingView.post(new Runnable() { // from class: com.huawei.health.h5pro.core.H5ProWebViewActivity.12
                @Override // java.lang.Runnable
                public void run() {
                    String strC = H5ProWebViewActivity.this.c();
                    StringBuilder sb = new StringBuilder("mLoadingView.setVisibility - > mLoadingView: ");
                    sb.append(H5ProWebViewActivity.this.j == null);
                    LogUtil.i(strC, sb.toString());
                    if (H5ProWebViewActivity.this.j != null) {
                        H5ProWebViewActivity.this.j.setVisibility(8);
                    }
                }
            });
        }
        H5ProWebView h5ProWebView = this.h;
        if (h5ProWebView != null) {
            h5ProWebView.postDelayed(new Runnable() { // from class: com.huawei.health.h5pro.core.H5ProWebViewActivity.13
                @Override // java.lang.Runnable
                public void run() {
                    RelativeLayout relativeLayout = (RelativeLayout) H5ProWebViewActivity.this.findViewById(R.id.progress_bar_bg);
                    if (relativeLayout != null) {
                        relativeLayout.setVisibility(8);
                    }
                }
            }, 30L);
        }
        if (TextUtils.isEmpty(this.d)) {
            String title = h5ProInstance.getTitle();
            if (!TextUtils.isEmpty(title)) {
                e(title);
            }
        }
        if (this.f6756b) {
            this.f6756b = false;
            this.e.resume(str, h5ProInstance == null ? null : h5ProInstance.getAppInfo());
        }
        this.e.loadNewPage(str, h5ProInstance != null ? h5ProInstance.getAppInfo() : null);
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProAppLoadListener
    public void onNewPageStartLoad(H5ProInstance h5ProInstance, String str) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        LogUtil.i(c(), BaseDialog.LIFE_CYCLE_ON_PAUSE);
        super.onPause();
        H5ProWebView h5ProWebView = this.h;
        if (h5ProWebView != null) {
            h5ProWebView.onPause();
        }
        H5ProInstance h5ProInstance = this.f;
        if (h5ProInstance != null) {
            this.e.pause(h5ProInstance.getUrl(), this.f.getAppInfo());
        }
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
    public void onReceiveTitle(H5ProInstance h5ProInstance, String str) {
        if (str == null) {
            str = "";
        }
        e(str);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        H5ProBridgeManager.getInstance().notifyPermissionResult(this.f, i, strArr, iArr);
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProAppLoadListener
    public void onResourceLoadErr(H5ProInstance h5ProInstance, String str, int i) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        LogUtil.i(c(), BaseDialog.LIFE_CYCLE_ON_RESUME);
        super.onResume();
        H5ProWebView h5ProWebView = this.h;
        if (h5ProWebView != null) {
            h5ProWebView.onResume();
        }
        H5ProInstance h5ProInstance = this.f;
        if (h5ProInstance != null) {
            this.e.resume(h5ProInstance.getUrl(), this.f.getAppInfo());
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        LogUtil.i(c(), "onSaveInstanceState");
        super.onSaveInstanceState(bundle);
        H5ProEnvParamsGuardian.saveInBundle(bundle);
    }

    @Override // com.huawei.health.h5pro.webkit.WebChromeCustomViewListener
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        LogUtil.i(c(), "onShowCustomView start");
        if (this.f6755a != null) {
            customViewCallback.onCustomViewHidden();
        } else {
            if (this.l == null || view == null) {
                return;
            }
            this.f6755a = view;
            this.f6757c = customViewCallback;
            runOnUiThread(new Runnable() { // from class: com.huawei.health.h5pro.core.H5ProWebViewActivity.4
                @Override // java.lang.Runnable
                public void run() {
                    H5ProWebViewActivity.this.f6755a.setLayoutParams(new RelativeLayout.LayoutParams(H5ProWebViewActivity.this.l.getWidth(), H5ProWebViewActivity.this.l.getHeight()));
                    H5ProWebViewActivity.this.f6755a.setBackgroundColor(Color.rgb(0, 0, 0));
                    H5ProWebViewActivity h5ProWebViewActivity = H5ProWebViewActivity.this;
                    h5ProWebViewActivity.a(h5ProWebViewActivity.f6755a);
                    if (H5ProWebViewActivity.this.h != null) {
                        H5ProWebViewActivity.this.h.setVisibility(8);
                    }
                }
            });
        }
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProAppLoadListener
    public void onViewCreated(H5ProInstance h5ProInstance, View view) {
        LogUtil.i(c(), "onViewCreated");
        H5ProCommand h5ProCommand = this.i;
        if (h5ProCommand != null && h5ProCommand.getCommand() == 2) {
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.progress_bar_bg);
            boolean zF = f();
            int iRgb = zF ? Color.rgb(30, 30, 30) : -1;
            H5ProLaunchOption h5ProLaunchOption = this.g;
            if (h5ProLaunchOption != null) {
                setImmerse(new ImmerseInfo(h5ProLaunchOption.isImmerse(), this.g.isShowStatusBar(), !zF, this.g.isStartAtBottomOfStatusBar(), this.g.isHideBottomVirtualKeys()));
            }
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
                relativeLayout.setBackgroundColor(iRgb);
            }
        }
        if (TextUtils.isEmpty(this.d)) {
            String appName = h5ProInstance.getAppInfo().getAppName();
            if (TextUtils.isEmpty(appName)) {
                return;
            }
            e(appName);
        }
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProAppLoadListener
    public void onViewPreCreate(H5ProInstance h5ProInstance, View view) {
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.container.H5Container
    public void registryTitleBarCallback(long j, String str) {
        LogUtil.i(c(), "registryTitleBarCallback:" + str + j);
        str.getClass();
        if (!str.equals(TitleBean.RIGHT_BTN_TYPE_SHARE)) {
            LogUtil.e(c(), "registryTitleBarCallback unknown type:".concat(str));
            return;
        }
        this.n.put(str, Long.valueOf(j));
        this.k.put(str, Boolean.TRUE);
        a(true);
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProViewControls
    public void removeAllNativeView() {
        runOnUiThread(new Runnable() { // from class: com.huawei.health.h5pro.core.H5ProWebViewActivity.8
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.i(H5ProWebViewActivity.this.c(), "removeAllCustomNativeView");
                if (H5ProWebViewActivity.this.o == null || H5ProWebViewActivity.this.o.isEmpty()) {
                    LogUtil.w(H5ProWebViewActivity.this.c(), "no custom native view");
                    return;
                }
                for (H5ProNativeView h5ProNativeView : H5ProWebViewActivity.this.o.values()) {
                    if (H5ProWebViewActivity.this.l != null && h5ProNativeView != null) {
                        H5ProWebViewActivity.this.l.removeView(h5ProNativeView.getView());
                    }
                }
                H5ProWebViewActivity.this.o.clear();
            }
        });
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProViewControls
    public void removeNativeView(final String str) {
        runOnUiThread(new Runnable() { // from class: com.huawei.health.h5pro.core.H5ProWebViewActivity.10
            @Override // java.lang.Runnable
            public void run() {
                H5ProNativeView h5ProNativeView;
                LogUtil.i(H5ProWebViewActivity.this.c(), "removeCustomNativeView");
                if (TextUtils.isEmpty(str)) {
                    LogUtil.i(H5ProWebViewActivity.this.c(), "removeCustomNativeView -> viewId is null.");
                    return;
                }
                if (H5ProWebViewActivity.this.o == null || (h5ProNativeView = (H5ProNativeView) H5ProWebViewActivity.this.o.get(str)) == null) {
                    return;
                }
                H5ProWebViewActivity.this.o.remove(str);
                if (H5ProWebViewActivity.this.l != null) {
                    H5ProWebViewActivity.this.l.removeView(h5ProNativeView.getView());
                }
            }
        });
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.container.H5Container
    public void setImmerse(final ImmerseInfo immerseInfo) {
        runOnUiThread(new Runnable() { // from class: com.huawei.health.h5pro.core.H5ProWebViewActivity.1
            @Override // java.lang.Runnable
            public void run() {
                if (immerseInfo.isImmerse()) {
                    H5ProWebViewActivity.this.g();
                    H5ProWebViewActivity.this.d(immerseInfo.isShowStatusBar(), immerseInfo.isStatusBarTextBlack(), immerseInfo.isStartAtBottomOfStatusBar(), immerseInfo.isHideBottomVirtualKeys());
                } else {
                    H5ProWebViewActivity.this.c(immerseInfo.isStatusBarTextBlack());
                    H5ProWebViewActivity.this.i();
                }
            }
        });
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.container.H5Container
    public void setPageTitle(String str) {
        LogUtil.i(c(), com.huawei.health.h5pro.core.a.a("setPageTitle: ", str));
        this.d = str;
        e(str);
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.container.H5Container
    public void setScreenLandscape(boolean z) {
        if (z) {
            setRequestedOrientation(0);
        } else {
            setRequestedOrientation(1);
        }
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProViewControls
    public String showNativeView(final View view) {
        this.m++;
        runOnUiThread(new Runnable() { // from class: com.huawei.health.h5pro.core.H5ProWebViewActivity.9
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.i(H5ProWebViewActivity.this.c(), "showNativeView");
                if (view == null) {
                    LogUtil.w(H5ProWebViewActivity.this.c(), "nativeView is null");
                    return;
                }
                if (H5ProWebViewActivity.this.l == null) {
                    LogUtil.w(H5ProWebViewActivity.this.c(), "mRootView is null");
                    return;
                }
                if (H5ProWebViewActivity.this.o == null) {
                    H5ProWebViewActivity.this.o = new HashMap();
                }
                H5ProWebViewActivity.this.o.put(String.valueOf(H5ProWebViewActivity.this.m), new H5ProNativeView(view, null));
                H5ProWebViewActivity.this.a(view);
            }
        });
        return String.valueOf(this.m);
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProViewControls
    public void updateNativeView(final String str, final H5ProNativeView h5ProNativeView) {
        runOnUiThread(new Runnable() { // from class: com.huawei.health.h5pro.core.H5ProWebViewActivity.6
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.i(H5ProWebViewActivity.this.c(), "updateNativeView");
                if (TextUtils.isEmpty(str)) {
                    LogUtil.w(H5ProWebViewActivity.this.c(), "updateNativeView -> viewId is null");
                    return;
                }
                H5ProNativeView h5ProNativeView2 = h5ProNativeView;
                if (h5ProNativeView2 == null || h5ProNativeView2.getView() == null) {
                    LogUtil.w(H5ProWebViewActivity.this.c(), "updateNativeView -> nativeView is null");
                    return;
                }
                if (H5ProWebViewActivity.this.l == null) {
                    LogUtil.w(H5ProWebViewActivity.this.c(), "mRootView is null");
                    return;
                }
                if (H5ProWebViewActivity.this.o == null) {
                    H5ProWebViewActivity.this.o = new HashMap();
                }
                H5ProNativeView h5ProNativeView3 = (H5ProNativeView) H5ProWebViewActivity.this.o.get(str);
                if (h5ProNativeView3 != null && h5ProNativeView3.getView() != null) {
                    H5ProWebViewActivity.this.l.removeView(h5ProNativeView3.getView());
                }
                H5ProWebViewActivity.this.o.put(String.valueOf(H5ProWebViewActivity.this.m), h5ProNativeView);
                H5ProWebViewActivity.this.a(h5ProNativeView.getView());
            }
        });
    }

    private int e(boolean z, boolean z2, int i) {
        if (!z) {
            return i | 4;
        }
        if (z2) {
            i |= 8192;
        }
        GeneralUtil.setAppearanceLightStatusBars(this, z2);
        return i;
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProViewControls
    public String showNativeView(final H5ProNativeView h5ProNativeView) {
        this.m++;
        runOnUiThread(new Runnable() { // from class: com.huawei.health.h5pro.core.H5ProWebViewActivity.7
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.i(H5ProWebViewActivity.this.c(), "showNativeView");
                H5ProNativeView h5ProNativeView2 = h5ProNativeView;
                if (h5ProNativeView2 == null || h5ProNativeView2.getView() == null) {
                    LogUtil.w(H5ProWebViewActivity.this.c(), "customNativeView is null");
                    return;
                }
                if (H5ProWebViewActivity.this.l == null) {
                    LogUtil.w(H5ProWebViewActivity.this.c(), "mRootView is null");
                    return;
                }
                if (H5ProWebViewActivity.this.o == null) {
                    H5ProWebViewActivity.this.o = new HashMap();
                }
                H5ProWebViewActivity.this.o.put(String.valueOf(H5ProWebViewActivity.this.m), h5ProNativeView);
                H5ProWebViewActivity.this.a(h5ProNativeView.getView());
            }
        });
        return String.valueOf(this.m);
    }
}
