package com.xiaomi.fitness.health.pingan;

import android.app.Application;
import android.util.DisplayMetrics;
import android.webkit.JavascriptInterface;
import android.webkit.WebStorage;
import com.xiaomi.accountsdk.request.NetworkUtils;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.MarketUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.common.utils.model.PackageNameWrapper;
import defpackage.c0j;
import defpackage.i4b;
import defpackage.jbr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0014J\b\u0010\f\u001a\u00020\u0005H\u0007J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0005H\u0002J\u0012\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0002¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/health/pingan/PinganHealthCareWebViewActivity;", "Lcom/xiaomi/fitness/webview/WebViewActivity;", "<init>", "()V", "addJavascriptInterfaceCustom", "", "initView", "onBackPressed", "onProgressChanged", "newProgress", "", LifecycleConstantKt.ON_DESTROY, "finishActivity", "isThirdPartyApkInstalled", "", "jsonData", "", "goBack", "isPinganH5", "url", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PinganHealthCareWebViewActivity extends Hilt_PinganHealthCareWebViewActivity {

    @NotNull
    public static final String TAG = "PinganHealthCareWebViewActivity";

    private final void goBack() {
        Logger.i(TAG, "goBack method running");
        if (NetworkUtils.isNetworkConnected(this)) {
            getWebView().loadUrl("javascript:goBack();");
        } else {
            ToastExtKt.toastShort(this, c0j.common_hint_network_unavailable);
            finishActivity();
        }
    }

    private final boolean isPinganH5(String url) {
        if (url == null) {
            return false;
        }
        return StringsKt__StringsJVMKt.startsWith$default(url, "https://test.pajk.cn", false, 2, null) || StringsKt__StringsJVMKt.startsWith$default(url, "https://www.test.pajk.cn", false, 2, null) || StringsKt__StringsJVMKt.startsWith$default(url, "https://jk.cn", false, 2, null) || StringsKt__StringsJVMKt.startsWith$default(url, "https://www.jk.cn", false, 2, null) || StringsKt__StringsJVMKt.startsWith$default(url, "https://www.pre.jk.cn", false, 2, null);
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity
    public void addJavascriptInterfaceCustom() {
        super.addJavascriptInterfaceCustom();
        getWebView().addJavascriptInterface(this, "pingan");
    }

    @JavascriptInterface
    public final void finishActivity() {
        Logger.i(TAG, "js:finishActivity");
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.webview.WebViewActivity
    public void initView() {
        super.initView();
        if (UIUtils.INSTANCE.isTablet()) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            ((jbr) getMBinding()).C.getLayoutParams().height = displayMetrics.heightPixels;
            ((jbr) getMBinding()).C.requestLayout();
        }
    }

    @JavascriptInterface
    public final boolean isThirdPartyApkInstalled(@Nullable String jsonData) {
        Logger.i(TAG, "js:isThirdPartyApkInstalled jsonData=" + jsonData);
        String packageName = ((PackageNameWrapper) i4b.a().fromJson(jsonData, PackageNameWrapper.class)).getPackageName();
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        return MarketUtil.checkAppInstalled(application, packageName);
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Logger.i(TAG, "onBackPressed running");
        String url = getWebView().getUrl();
        if (url == null) {
            finishActivity();
            return;
        }
        boolean zIsPinganH5 = isPinganH5(url);
        Logger.d(TAG, "isPinganPage=" + zIsPinganH5 + " onBackPressed");
        if (zIsPinganH5) {
            goBack();
        } else {
            finishActivity();
        }
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity, com.xiaomi.fitness.webview.Hilt_WebViewActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        WebStorage.getInstance().deleteAllData();
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity, defpackage.iqc
    public void onProgressChanged(int newProgress) {
        boolean zIsPinganH5 = isPinganH5(getWebView().getUrl());
        setTitleBarShow(!zIsPinganH5);
        setTitleBarMatchStatusBar(zIsPinganH5);
        super.onProgressChanged(newProgress);
    }
}
