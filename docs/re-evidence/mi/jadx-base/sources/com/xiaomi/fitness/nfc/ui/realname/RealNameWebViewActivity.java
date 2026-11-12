package com.xiaomi.fitness.nfc.ui.realname;

import androidx.appcompat.app.AppCompatDelegate;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.webview.WebViewActivity;
import com.xiaomi.fitness.webview.a;
import defpackage.kad;
import defpackage.uwc;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u00012\u00020\u0002:\u0001\u0012B\u0007¢\u0006\u0004\b\u0011\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/realname/RealNameWebViewActivity;", "Lcom/xiaomi/fitness/webview/WebViewActivity;", "Luwc;", "", "initView", "()V", "initWebView", "Lkad;", "getJavaScriptInterface", "()Lkad;", LifecycleConstantKt.ON_DESTROY, "", "getCplc", "()Ljava/lang/String;", "Lcom/xiaomi/fitness/webview/a;", "webViewBusinessHelper", "Lcom/xiaomi/fitness/webview/a;", "<init>", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class RealNameWebViewActivity extends WebViewActivity implements uwc {

    @NotNull
    public static final String CPLC = "cplc";

    @NotNull
    public static final String NUMBER = "number";

    @NotNull
    public static final String TAG = "RealNameWebViewActivity";

    @Nullable
    private a webViewBusinessHelper;

    @Override // defpackage.uwc
    @NotNull
    public String getCplc() {
        String stringExtra = getIntent().getStringExtra("cplc");
        if (stringExtra == null) {
            stringExtra = "";
        }
        Logger.i(TAG, "getCplc() " + stringExtra);
        return stringExtra;
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity
    @NotNull
    public kad getJavaScriptInterface() {
        return new RealNameJavaScriptImpl(this, this);
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity
    public void initView() {
        super.initView();
        hideBack();
        AppCompatDelegate.H(-1);
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity
    public void initWebView() {
        super.initWebView();
        getWebView().addJavascriptInterface(getJavaScriptInterface(), "miwearNFCNative");
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity, com.xiaomi.fitness.webview.Hilt_WebViewActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
