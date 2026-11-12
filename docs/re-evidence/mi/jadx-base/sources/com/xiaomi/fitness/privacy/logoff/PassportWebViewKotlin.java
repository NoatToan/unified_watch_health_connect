package com.xiaomi.fitness.privacy.logoff;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Toast;
import com.xiaomi.accountsdk.account.URLs;
import com.xiaomi.accountsdk.account.XMPassportUserAgent;
import com.xiaomi.accountsdk.account.data.AccountInfo;
import com.xiaomi.accountsdk.utils.WebViewDeviceIdUtil;
import com.xiaomi.accountsdk.utils.WebViewFidNonceUtil;
import com.xiaomi.accountsdk.utils.WebViewNativeUserAgentUtil;
import com.xiaomi.accountsdk.utils.WebViewUserSpaceIdUtil;
import com.xiaomi.accountsdk.utils.XMPassportUtil;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.token.TokenManager;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.privacy.logoff.PassportWebViewKotlin;
import com.xiaomi.passport.accountmanager.XiaomiAccountManager;
import com.xiaomi.passport.servicetoken.ServiceTokenFuture;
import com.xiaomi.passport.servicetoken.ServiceTokenResult;
import com.xiaomi.passport.snscorelib.internal.entity.PassportSnsConstant;
import com.xiaomi.passport.snscorelib.internal.utils.SNSCookieManager;
import com.xiaomi.passport.task.BgTask;
import com.xiaomi.smarthome.setting.LoginSetting;
import defpackage.ilh;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 &2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\rJ$\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u001a\u0010\u0019\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\rJ\u0012\u0010\u001a\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\rH\u0002J\u0018\u0010\u001b\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0016\u001a\u00020\rJ\n\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0007H\u0016J\u0010\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001dH\u0016J\u0010\u0010!\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\rH\u0016J\u0012\u0010\"\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001dH\u0016J\u0012\u0010#\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010$\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\rH\u0016J\u0006\u0010%\u001a\u00020\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/privacy/logoff/PassportWebViewKotlin;", "Landroid/webkit/WebView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "unregisterResult", "", "getUnregisterResult", "()Z", "setUnregisterResult", "(Z)V", "originLoadUrl", "", "mCookieManager", "Landroid/webkit/CookieManager;", "onReceivedLoginRequest", "", "realm", "args", "onPageStarted", "view", "url", "favicon", "Landroid/graphics/Bitmap;", "onPageFinished", "processUnregisterByOldWay", "shouldOverrideUrlLoading", "getExistedAccountInfo", "Lcom/xiaomi/accountsdk/account/data/AccountInfo;", "onNeedReLogin", "onLoginEnd", "accountInfo", "onAuthEnd", "onSnsBindFinished", "onSnsBindCancel", "loadUrl", "plantMiHomeLoginCookie", "Companion", "privacy_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PassportWebViewKotlin extends WebView {

    @NotNull
    public static final String TAG = "PassportWebViewKotlin";

    @NotNull
    private final CookieManager mCookieManager;
    private String originLoadUrl;
    private boolean unregisterResult;

    /* JADX INFO: renamed from: com.xiaomi.fitness.privacy.logoff.PassportWebViewKotlin$plantMiHomeLoginCookie$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.privacy.logoff.PassportWebViewKotlin$plantMiHomeLoginCookie$1", f = "PassportWebViewKotlin.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TokenManager.DefaultImpls.getServiceToken$default(AccountManagerExtKt.getInstance(TokenManager.INSTANCE), LoginSetting.SID_XIAOMI_HOME, true, 0, 4, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassportWebViewKotlin(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        CookieSyncManager.createInstance(context);
        CookieManager cookieManager = CookieManager.getInstance();
        this.mCookieManager = cookieManager;
        cookieManager.removeAllCookie();
        getSettings().setUserAgentString(XMPassportUserAgent.getWebViewUserAgent(this, context));
        getSettings().setJavaScriptEnabled(true);
        getSettings().setBuiltInZoomControls(true);
        getSettings().setSupportZoom(true);
        addJavascriptInterface(new ilh(getContext(), this), "unregister");
        setWebChromeClient(new WebChromeClient());
        setWebViewClient(new PassportWebViewClientKotlin(this));
        new WebViewDeviceIdUtil().setupDeviceIdForAccountWeb(this);
        new WebViewFidNonceUtil().setupFidNonceForAccountWeb(this);
        new WebViewUserSpaceIdUtil().setupUserSpaceIdForAccountWeb(this);
        new WebViewNativeUserAgentUtil().setupUserAgentForAccountWeb(this);
    }

    private final AccountInfo getExistedAccountInfo() {
        XiaomiAccountManager xiaomiAccountManager = XiaomiAccountManager.get(getContext());
        Account xiaomiAccount = xiaomiAccountManager.getXiaomiAccount();
        if (xiaomiAccount == null) {
            return null;
        }
        String passToken = xiaomiAccountManager.getPassToken(xiaomiAccount);
        String name = xiaomiAccount.name;
        Intrinsics.checkNotNullExpressionValue(name, "name");
        return new AccountInfo.Builder().userId(name).passToken(passToken).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReceivedLoginRequest$lambda$1(PassportWebViewKotlin this$0, ServiceTokenResult serviceTokenResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "onReceivedLoginRequest error " + serviceTokenResult.errorCode);
        if (serviceTokenResult.errorCode == ServiceTokenResult.ErrorCode.ERROR_NONE) {
            String serviceToken = serviceTokenResult.serviceToken;
            Intrinsics.checkNotNullExpressionValue(serviceToken, "serviceToken");
            this$0.loadUrl(serviceToken);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReceivedLoginRequest$lambda$2(Throwable th) {
        Logger.i(TAG, "onReceivedLoginRequest ErrorResultRunnable " + th);
    }

    private final void processUnregisterByOldWay(String url) {
        String cookie = this.mCookieManager.getCookie(url);
        if (cookie == null || !StringsKt__StringsKt.contains$default((CharSequence) cookie, (CharSequence) "passport_action=user_rights_end", false, 2, (Object) null)) {
            return;
        }
        Logger.i(TAG, "passport_action=user_rights_end");
        Toast.makeText(getContext(), "passport_action=user_rights_end", 1).show();
        if (getContext() instanceof Activity) {
            Context context = getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context).finish();
        }
    }

    public final boolean getUnregisterResult() {
        return this.unregisterResult;
    }

    @Override // android.webkit.WebView
    public void loadUrl(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.originLoadUrl = url;
        super.loadUrl(url);
    }

    public boolean onAuthEnd(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return false;
    }

    public boolean onLoginEnd(@NotNull AccountInfo accountInfo) {
        Intrinsics.checkNotNullParameter(accountInfo, "accountInfo");
        return false;
    }

    public boolean onNeedReLogin() {
        return false;
    }

    public final void onPageFinished(@Nullable WebView view, @Nullable String url) {
        Logger.d(TAG, "onPageFinished: " + url);
        if (url == null || !StringsKt__StringsKt.contains$default((CharSequence) url, (CharSequence) "unregisterSuccess", false, 2, (Object) null)) {
            return;
        }
        this.unregisterResult = true;
    }

    public final void onPageStarted(@Nullable WebView view, @Nullable String url, @Nullable Bitmap favicon) {
        Logger.d(TAG, "onPageStarted: " + url);
    }

    public final void onReceivedLoginRequest(@Nullable String realm, @Nullable String args) {
        if (Intrinsics.areEqual("com.xiaomi", realm)) {
            String str = "weblogin:" + args;
            XiaomiAccountManager xiaomiAccountManager = XiaomiAccountManager.get(getContext());
            final ServiceTokenFuture serviceToken = xiaomiAccountManager.getServiceToken(xiaomiAccountManager.getXiaomiAccount(), str, null);
            new BgTask(new BgTask.BgTaskRunnable() { // from class: klh
                @Override // com.xiaomi.passport.task.BgTask.BgTaskRunnable
                public final Object run() {
                    return serviceToken.get();
                }
            }, new BgTask.SuccessResultRunnable() { // from class: llh
                @Override // com.xiaomi.passport.task.BgTask.SuccessResultRunnable
                public final void run(Object obj) {
                    PassportWebViewKotlin.onReceivedLoginRequest$lambda$1(this.f25201a, (ServiceTokenResult) obj);
                }
            }, new BgTask.ErrorResultRunnable() { // from class: mlh
                @Override // com.xiaomi.passport.task.BgTask.ErrorResultRunnable
                public final void run(Throwable th) {
                    PassportWebViewKotlin.onReceivedLoginRequest$lambda$2(th);
                }
            }).execute();
        }
    }

    public boolean onSnsBindCancel(@Nullable AccountInfo accountInfo) {
        return false;
    }

    public boolean onSnsBindFinished(@Nullable AccountInfo accountInfo) {
        return false;
    }

    public final void plantMiHomeLoginCookie() {
        AnyExtKt.io$default(null, new AnonymousClass1(null), 1, null);
    }

    public final void setUnregisterResult(boolean z) {
        this.unregisterResult = z;
    }

    public final boolean shouldOverrideUrlLoading(@Nullable WebView view, @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Logger.d(TAG, "shouldOverrideUrlLoading: " + url);
        String cookie = this.mCookieManager.getCookie(URLs.ACCOUNT_DOMAIN);
        if (!TextUtils.isEmpty(cookie)) {
            Intrinsics.checkNotNull(cookie);
            if (StringsKt__StringsKt.contains$default((CharSequence) cookie, (CharSequence) "sns-bind-step", false, 2, (Object) null)) {
                if (StringsKt__StringsKt.contains$default((CharSequence) cookie, (CharSequence) PassportSnsConstant.SNS_BIND_FINISH, false, 2, (Object) null)) {
                    AccountInfo existedAccountInfo = getExistedAccountInfo();
                    if (existedAccountInfo == null) {
                        existedAccountInfo = new AccountInfo.Builder().userId(SNSCookieManager.extractFromCookieString(cookie, "userId")).passToken(SNSCookieManager.extractFromCookieString(cookie, "passToken")).build();
                    }
                    if (onSnsBindFinished(existedAccountInfo)) {
                        return true;
                    }
                } else if (StringsKt__StringsKt.contains$default((CharSequence) cookie, (CharSequence) PassportSnsConstant.SNS_BIND_CANCEL, false, 2, (Object) null) && onSnsBindCancel(getExistedAccountInfo())) {
                    return true;
                }
            }
        }
        if (!TextUtils.isEmpty(cookie)) {
            Intrinsics.checkNotNull(cookie);
            if (StringsKt__StringsKt.contains$default((CharSequence) cookie, (CharSequence) "passInfo", false, 2, (Object) null)) {
                if (StringsKt__StringsKt.contains$default((CharSequence) cookie, (CharSequence) "need-relogin", false, 2, (Object) null) && onNeedReLogin()) {
                    return true;
                }
                if (StringsKt__StringsKt.contains$default((CharSequence) cookie, (CharSequence) "login-end", false, 2, (Object) null)) {
                    AccountInfo accountInfoBuild = new AccountInfo.Builder().userId(XMPassportUtil.extractUserIdFromNotificationLoginEndCookie(cookie)).passToken(XMPassportUtil.extractPasstokenFromNotificationLoginEndCookie(cookie)).build();
                    Intrinsics.checkNotNull(accountInfoBuild);
                    if (onLoginEnd(accountInfoBuild)) {
                        return true;
                    }
                }
                if (StringsKt__StringsKt.contains$default((CharSequence) cookie, (CharSequence) "auth-end", false, 2, (Object) null) && onAuthEnd(url)) {
                    return true;
                }
            }
        }
        return false;
    }
}
