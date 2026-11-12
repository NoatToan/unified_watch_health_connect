package com.xiaomi.fitness.devicesettings.guide;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.fragment.app.FragmentActivity;
import com.mi.fitness.checkupdate.ui.huami.HuamiUpgradeFragment;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.devicesettings.guide.GuideWebViewFragment;
import com.xiaomi.fitness.ubox.export.GuideNavigator;
import com.xiaomi.fitness.webview.CustomWebView;
import com.xiaomi.fitness.webview.WebViewActivity;
import defpackage.ah6;
import defpackage.cji;
import defpackage.eui;
import defpackage.iqc;
import defpackage.jni;
import defpackage.kad;
import defpackage.kki;
import defpackage.pe5;
import defpackage.ue5;
import defpackage.wzi;
import java.lang.ref.WeakReference;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Stack;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 k2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001kB\u0007¢\u0006\u0004\bj\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u0007J\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0007J!\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001d\u0010\fJ\u000f\u0010\u001e\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u001e\u0010\u0007J\u0017\u0010!\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0005H\u0016¢\u0006\u0004\b&\u0010\u0007J\u000f\u0010'\u001a\u00020\u0005H\u0016¢\u0006\u0004\b'\u0010\u0007J\u000f\u0010(\u001a\u00020\tH\u0016¢\u0006\u0004\b(\u0010)J!\u0010+\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b+\u0010,J%\u00101\u001a\u00020\u00052\u0014\u00100\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.\u0018\u00010-H\u0016¢\u0006\u0004\b1\u00102J%\u00103\u001a\u00020\u00052\u0014\u00100\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.\u0018\u00010-H\u0016¢\u0006\u0004\b3\u00102J\u0017\u00105\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u000eH\u0016¢\u0006\u0004\b5\u0010%J\u000f\u00106\u001a\u00020\u0005H\u0016¢\u0006\u0004\b6\u0010\u0007J\u000f\u00107\u001a\u00020\u0005H\u0016¢\u0006\u0004\b7\u0010\u0007J\u000f\u00108\u001a\u00020\u0005H\u0016¢\u0006\u0004\b8\u0010\u0007J\u0019\u0010;\u001a\u00020\u00052\b\u0010:\u001a\u0004\u0018\u000109H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0005H\u0016¢\u0006\u0004\b=\u0010\u0007J\u000f\u0010>\u001a\u00020\u0005H\u0016¢\u0006\u0004\b>\u0010\u0007J\u000f\u0010?\u001a\u00020\tH\u0016¢\u0006\u0004\b?\u0010)J\u000f\u0010@\u001a\u00020\u0005H\u0016¢\u0006\u0004\b@\u0010\u0007J\u000f\u0010A\u001a\u00020\u0005H\u0016¢\u0006\u0004\bA\u0010\u0007R\"\u0010C\u001a\u00020B8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0016\u0010J\u001a\u00020I8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bL\u0010MR\"\u0010N\u001a\u00020\u000e8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bN\u0010M\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010%R\"\u0010S\u001a\u00020R8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010Y\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\bY\u0010)\"\u0004\b[\u0010\fR(\u0010]\u001a\b\u0012\u0004\u0012\u00020\u000e0\\8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010c\u001a\u00020\u001f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010\"R\"\u0010h\u001a\u00020\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bh\u0010Z\u001a\u0004\bh\u0010)\"\u0004\bi\u0010\f¨\u0006l"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/guide/GuideWebViewFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/guide/GuideWebViewViewModel;", "Lah6;", "Liqc;", "", "initData", "()V", "initTitleBar", "", "visible", "setTitleBarVisible", "(Z)V", "initView", "", "currentUrl", "isCurrentUrl", "(Ljava/lang/String;)Z", "initTitle", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lkad;", "getJavaScriptInterface", "()Lkad;", "result", "onLoadFinish", "onLoadStart", "", "newProgress", "onProgressChanged", "(I)V", "title", "setWebTitle", "(Ljava/lang/String;)V", "showNoNetView", "hideNoNetView", "isInValid", "()Z", "isFullScreen", "onVideoScreenModeChanged", "(ZLandroid/view/View;)V", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "valueCallback", "openFileChooser", "(Landroid/webkit/ValueCallback;)V", "openCamera", "url", "loadUrl", "showServerErrorView", "popHistory", "finishFromWeb", "Landroid/content/Intent;", "data", "finishForResult", "(Landroid/content/Intent;)V", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_PAUSE, "onBackPressed", "onFinish", LifecycleConstantKt.ON_DESTROY, "Lcom/xiaomi/fitness/webview/CustomWebView;", "webView", "Lcom/xiaomi/fitness/webview/CustomWebView;", "getWebView", "()Lcom/xiaomi/fitness/webview/CustomWebView;", "setWebView", "(Lcom/xiaomi/fitness/webview/CustomWebView;)V", "Lue5;", "webViewClient", "Lue5;", "mTitle", "Ljava/lang/String;", "mUrl", "getMUrl", "()Ljava/lang/String;", "setMUrl", "Lcom/xiaomi/fitness/ubox/export/GuideNavigator;", "guideNavigator", "Lcom/xiaomi/fitness/ubox/export/GuideNavigator;", "getGuideNavigator", "()Lcom/xiaomi/fitness/ubox/export/GuideNavigator;", "setGuideNavigator", "(Lcom/xiaomi/fitness/ubox/export/GuideNavigator;)V", "isLightStatusBar", "Z", "setLightStatusBar", "Ljava/util/Stack;", "urlSets", "Ljava/util/Stack;", "getUrlSets", "()Ljava/util/Stack;", "setUrlSets", "(Ljava/util/Stack;)V", "mTitleBgRes", "I", "getMTitleBgRes", "()I", "setMTitleBgRes", "isTitleBarShow", "setTitleBarShow", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nGuideWebViewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuideWebViewFragment.kt\ncom/xiaomi/fitness/devicesettings/guide/GuideWebViewFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,335:1\n1#2:336\n*E\n"})
public final class GuideWebViewFragment extends Hilt_GuideWebViewFragment<GuideWebViewViewModel, ah6> implements iqc {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "GuideWebViewFragment";
    public GuideNavigator guideNavigator;
    private boolean isLightStatusBar;
    private boolean isTitleBarShow;
    private String mTitle;
    private int mTitleBgRes;
    protected String mUrl;

    @NotNull
    private Stack<String> urlSets;
    protected CustomWebView webView;
    private ue5 webViewClient;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/guide/GuideWebViewFragment$Companion;", "", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getTAG() {
            return GuideWebViewFragment.TAG;
        }
    }

    public GuideWebViewFragment() {
        super(eui.h0);
        this.isLightStatusBar = true;
        this.urlSets = new Stack<>();
        this.mTitleBgRes = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getJavaScriptInterface$lambda$2(GuideWebViewFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getGuideNavigator().navigate(HuamiUpgradeFragment.DONE_TAG);
    }

    private final void initData() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.mTitle = getResources().getString(wzi.f38513a);
            setMUrl(arguments.getString("URL", ""));
            this.isLightStatusBar = arguments.getBoolean(WebViewActivity.IS_LIGHT_STATUS_BAR, true);
            this.mTitleBgRes = arguments.getInt(WebViewActivity.SHOW_TITLE_COLOR, cji.H);
        }
    }

    private final void initTitle() {
        setTitleBarVisible(false);
        hideBack();
        IActionBar.DefaultImpls.setStartView$default(this, 0, this.mTitleBgRes == kki.f23951a ? jni.i1 : jni.a0, null, new View.OnClickListener() { // from class: aab
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideWebViewFragment.initTitle$lambda$3(this.f825a, view);
            }
        }, 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTitle$lambda$3(GuideWebViewFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    private final void initTitleBar() {
        setTitle("");
        int i = this.mTitleBgRes;
        if (i == kki.f23951a || i != kki.d) {
            setTitleBackground(i);
        }
        setTitleBarVisible(this.isTitleBarShow);
        if (!this.isTitleBarShow) {
            hideBack();
        }
        String str = this.mTitle;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitle");
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        setTitle("");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        Window window;
        initTitleBar();
        try {
            WebView.enableSlowWholeDocumentDraw();
        } catch (Exception e) {
            e.printStackTrace();
        }
        setWebView(((ah6) getMBinding()).C);
        getWebView().setWebChromeClient(new pe5(new WeakReference(this)));
        this.webViewClient = new ue5(new WeakReference(this));
        CustomWebView webView = getWebView();
        ue5 ue5Var = this.webViewClient;
        if (ue5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webViewClient");
            ue5Var = null;
        }
        webView.setWebViewClient(ue5Var);
        try {
            boolean zL = com.xiaomi.fitness.webview.a.l(getMUrl());
            Logger.i(TAG, "url = " + getMUrl() + ", safe = " + zL);
            String cookie = CookieManager.getInstance().getCookie(getMUrl());
            StringBuilder sb = new StringBuilder();
            sb.append("initWebView: cookie=");
            sb.append(cookie);
            if (zL) {
                getWebView().addJavascriptInterface(getJavaScriptInterface(), "m2w");
            }
        } catch (URISyntaxException e2) {
            Logger.i(TAG, "url is outer");
            e2.printStackTrace();
        }
        FragmentActivity mActivity = getMActivity();
        if (mActivity != null && (window = mActivity.getWindow()) != null) {
            UIUtils.INSTANCE.setLightStatusBar(window, this.isLightStatusBar);
        }
        String mUrl = getMUrl();
        Intrinsics.checkNotNull(mUrl);
        loadUrl(mUrl);
    }

    private final boolean isCurrentUrl(String currentUrl) {
        if (this.urlSets.empty()) {
            return false;
        }
        String strPeek = this.urlSets.peek();
        Intrinsics.checkNotNull(strPeek);
        if (StringsKt__StringsJVMKt.endsWith$default(strPeek, "/", false, 2, null)) {
            Intrinsics.checkNotNull(strPeek);
            strPeek = strPeek.substring(0, strPeek.length() - 1);
            Intrinsics.checkNotNullExpressionValue(strPeek, "substring(...)");
        }
        if (StringsKt__StringsJVMKt.endsWith$default(currentUrl, "/", false, 2, null)) {
            currentUrl = currentUrl.substring(0, currentUrl.length() - 1);
            Intrinsics.checkNotNullExpressionValue(currentUrl, "substring(...)");
        }
        return Intrinsics.areEqual(strPeek, currentUrl);
    }

    private final void setTitleBarVisible(boolean visible) {
        setActionBarDisplayable(visible);
        setActionBarExpandState(0);
        setActionBarResizeable(false);
    }

    @Override // defpackage.iqc
    public void finishForResult(@Nullable Intent data) {
        FragmentActivity mActivity = getMActivity();
        if (mActivity != null) {
            mActivity.setResult(-1, data);
        }
        finish();
    }

    @Override // defpackage.iqc
    public void finishFromWeb() {
        finish();
    }

    @NotNull
    public final GuideNavigator getGuideNavigator() {
        GuideNavigator guideNavigator = this.guideNavigator;
        if (guideNavigator != null) {
            return guideNavigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("guideNavigator");
        return null;
    }

    @NotNull
    public kad getJavaScriptInterface() {
        kad kadVar = new kad(getMActivity(), this);
        kadVar.onGuideEndRunable = new Runnable() { // from class: bab
            @Override // java.lang.Runnable
            public final void run() {
                GuideWebViewFragment.getJavaScriptInterface$lambda$2(this.f3983a);
            }
        };
        return kadVar;
    }

    public final int getMTitleBgRes() {
        return this.mTitleBgRes;
    }

    @NotNull
    public final String getMUrl() {
        String str = this.mUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mUrl");
        return null;
    }

    @NotNull
    public final Stack<String> getUrlSets() {
        return this.urlSets;
    }

    @NotNull
    public final CustomWebView getWebView() {
        CustomWebView customWebView = this.webView;
        if (customWebView != null) {
            return customWebView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("webView");
        return null;
    }

    @Override // defpackage.iqc
    public void hideNoNetView() {
        showContent();
    }

    @Override // defpackage.iqc
    public boolean isInValid() {
        FragmentActivity mActivity = getMActivity();
        if (mActivity != null && mActivity.isFinishing()) {
            return true;
        }
        FragmentActivity mActivity2 = getMActivity();
        return mActivity2 != null && mActivity2.isDestroyed();
    }

    /* JADX INFO: renamed from: isLightStatusBar, reason: from getter */
    public final boolean getIsLightStatusBar() {
        return this.isLightStatusBar;
    }

    /* JADX INFO: renamed from: isTitleBarShow, reason: from getter */
    public final boolean getIsTitleBarShow() {
        return this.isTitleBarShow;
    }

    @Override // defpackage.iqc
    public void loadUrl(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (!StringsKt__StringsJVMKt.startsWith$default(url, "http://", false, 2, null)) {
            getWebView().loadUrl(url);
            return;
        }
        Logger.i(TAG, "loadUrl fail url " + url);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        if (this.urlSets.empty()) {
            return true;
        }
        getWebView().setTouchFlag(true);
        if (getWebView().c()) {
            Logger.d(TAG + "isLoading true", new Object[0]);
        } else {
            Logger.d(TAG + "isLoading false sets pop", new Object[0]);
            this.urlSets.pop();
        }
        if (this.urlSets.empty()) {
            return true;
        }
        String strPop = this.urlSets.pop();
        Intrinsics.checkNotNullExpressionValue(strPop, "pop(...)");
        loadUrl(strPop);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s go back,urlSets.size:%d", Arrays.copyOf(new Object[]{TAG, Integer.valueOf(this.urlSets.size())}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Logger.d(str, new Object[0]);
        return true;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.webViewClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webViewClient");
        }
        ue5 ue5Var = this.webViewClient;
        if (ue5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webViewClient");
            ue5Var = null;
        }
        ue5Var.destroy();
        getWebView().f();
    }

    public void onFinish() {
        super.onBackPressed();
    }

    public void onLoadFinish(boolean result) {
        if (!getWebView().getSettings().getLoadsImagesAutomatically()) {
            getWebView().getSettings().setLoadsImagesAutomatically(true);
        }
        showContent();
        Logger.i(TAG, " onLoadFinish:" + result);
    }

    public void onLoadStart() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        getWebView().onPause();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iqc
    public void onProgressChanged(int newProgress) {
        if (newProgress < 100) {
            if (!getWebView().c() && getWebView().d()) {
                getWebView().setIsLoading(true);
                onLoadStart();
            }
            if (((ah6) getMBinding()).B.getVisibility() != 0) {
                ((ah6) getMBinding()).B.setVisibility(0);
            }
            ((ah6) getMBinding()).B.setProgress(newProgress);
            return;
        }
        String url = getWebView().getUrl();
        if (url != null) {
            if (getWebView().d()) {
                Logger.d(TAG + "currentUrl:" + url, new Object[0]);
                if (!isCurrentUrl(url)) {
                    getWebView().setTouchFlag(false);
                    this.urlSets.push(url);
                }
                ue5 ue5Var = this.webViewClient;
                if (ue5Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("webViewClient");
                    ue5Var = null;
                }
                onLoadFinish(ue5Var.onLoadFinish());
            } else {
                if (!this.urlSets.empty()) {
                    this.urlSets.pop();
                }
                this.urlSets.push(url);
                Logger.d(TAG + "re currentUrl:" + url, new Object[0]);
            }
        }
        getWebView().setIsLoading(false);
        ((ah6) getMBinding()).B.setVisibility(8);
        initTitle();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getWebView().onResume();
    }

    @Override // defpackage.iqc
    public void onVideoScreenModeChanged(boolean isFullScreen, @Nullable View view) {
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initData();
        try {
            WebView.enableSlowWholeDocumentDraw();
        } catch (Exception e) {
            e.printStackTrace();
        }
        initView();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            getWebView().getSettings().setAlgorithmicDarkeningAllowed(true);
        } else if (i >= 29) {
            if ((getResources().getConfiguration().uiMode & 48) == 32) {
                getWebView().getSettings().setForceDark(2);
            } else {
                getWebView().getSettings().setForceDark(0);
            }
        }
    }

    @Override // defpackage.iqc
    public void openCamera(@Nullable ValueCallback<Uri[]> valueCallback) {
    }

    @Override // defpackage.iqc
    public void openFileChooser(@Nullable ValueCallback<Uri[]> valueCallback) {
    }

    @Override // defpackage.iqc
    public void popHistory() {
        if (this.urlSets.empty()) {
            return;
        }
        Logger.d("|WEBVIEW|redirect pop url:" + this.urlSets.pop(), new Object[0]);
    }

    public final void setGuideNavigator(@NotNull GuideNavigator guideNavigator) {
        Intrinsics.checkNotNullParameter(guideNavigator, "<set-?>");
        this.guideNavigator = guideNavigator;
    }

    public final void setLightStatusBar(boolean z) {
        this.isLightStatusBar = z;
    }

    public final void setMTitleBgRes(int i) {
        this.mTitleBgRes = i;
    }

    public final void setMUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mUrl = str;
    }

    public final void setTitleBarShow(boolean z) {
        this.isTitleBarShow = z;
    }

    public final void setUrlSets(@NotNull Stack<String> stack) {
        Intrinsics.checkNotNullParameter(stack, "<set-?>");
        this.urlSets = stack;
    }

    @Override // defpackage.iqc
    public void setWebTitle(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        String str = this.mTitle;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitle");
            str = null;
        }
        if (!TextUtils.isEmpty(str) || StringsKt__StringsKt.contains$default((CharSequence) title, (CharSequence) "http", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) title, (CharSequence) "watch.iot", false, 2, (Object) null)) {
            return;
        }
        setTitle(title);
    }

    public final void setWebView(@NotNull CustomWebView customWebView) {
        Intrinsics.checkNotNullParameter(customWebView, "<set-?>");
        this.webView = customWebView;
    }

    @Override // defpackage.iqc
    public void showNoNetView() {
        showNoNetwork();
    }

    @Override // defpackage.iqc
    public void showServerErrorView() {
    }
}
