package com.xiaomi.fitness.mine.company;

import android.content.Intent;
import android.webkit.JavascriptInterface;
import com.xiaomi.accountsdk.request.NetworkUtils;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.mine.company.CompanyUserWebViewActivity;
import com.xiaomi.fitness.webview.WebViewActivity;
import defpackage.m0j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0007J\b\u0010\b\u001a\u00020\u0005H\u0002¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/mine/company/CompanyUserWebViewActivity;", "Lcom/xiaomi/fitness/webview/WebViewActivity;", "<init>", "()V", "addJavascriptInterfaceCustom", "", "onBackPressed", "jumpToMyTab", "goBack", "Companion", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CompanyUserWebViewActivity extends Hilt_CompanyUserWebViewActivity {
    public static final int COMPANY_RESULT_CODE = 12345;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "CompanyUserWebViewActivity";

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/mine/company/CompanyUserWebViewActivity$Companion;", "", "<init>", "()V", "TAG", "", "COMPANY_RESULT_CODE", "", "startAndSetFinishCallback", "", "url", "context", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "callback", "Lkotlin/Function0;", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit startAndSetFinishCallback$lambda$1(Function0 callback, int i, Intent intent) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Logger.i(CompanyUserWebViewActivity.TAG, "startAndFinishWithCallback callback resultCode=" + i);
            if (i == 12345) {
                callback.invoke();
            }
            return Unit.INSTANCE;
        }

        public final void startAndSetFinishCallback(@NotNull String url, @NotNull BaseActivity context, @NotNull final Function0<Unit> callback) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intent intent = new Intent(context, (Class<?>) CompanyUserWebViewActivity.class);
            intent.putExtra(WebViewActivity.TITLE, ApplicationExtKt.getApplication().getString(m0j.v));
            intent.putExtra("URL", url);
            context.startForActivityResult(intent, new Function2() { // from class: m94
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CompanyUserWebViewActivity.Companion.startAndSetFinishCallback$lambda$1(callback, ((Integer) obj).intValue(), (Intent) obj2);
                }
            });
        }
    }

    private final void goBack() {
        Logger.i(TAG, "goBack method running");
        if (NetworkUtils.isNetworkConnected(this)) {
            getWebView().loadUrl("javascript:goBack();");
        } else {
            ToastExtKt.toastShort(this, m0j.common_hint_network_unavailable);
            jumpToMyTab();
        }
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity
    public void addJavascriptInterfaceCustom() {
        super.addJavascriptInterfaceCustom();
        getWebView().addJavascriptInterface(this, "company");
    }

    @JavascriptInterface
    public final void jumpToMyTab() {
        Logger.i(TAG, "jumpToMyTab running");
        setResult(COMPANY_RESULT_CODE, new Intent());
        finish();
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Logger.i(TAG, "onBackPressed running");
        goBack();
    }
}
