package com.xiaomi.fitness.login;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountContractConstants;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.token.TokenManager;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ComponentState;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.devicesettings.common.language.LanguageReceiver;
import com.xiaomi.fitness.keep_alive.BootCompletedReceiver;
import com.xiaomi.fitness.login.LoginComponent;
import com.xiaomi.fitness.login.export.AccountCookieManager;
import com.xiaomi.fitness.login.export.AccountServiceCookieManagerExtKt;
import com.xiaomi.fitness.sleep.trace.SleepTraceReceiver;
import com.xiaomi.push.service.receivers.NetworkStatusReceiver;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u000f\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\f\u001a\u00020\u0005H\u0007J\u0006\u0010\r\u001a\u00020\u0005J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002R\u0010\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/login/LoginComponent;", "", "<init>", "()V", "initAccount", "", "app", "Landroid/app/Application;", "loginIfNeed", "accountManager", "Lcom/xiaomi/fitness/account/manager/AccountManager;", "initAccountOnMain", "notifyAccountCookie", "closeComponent", "receiver", "com/xiaomi/fitness/login/LoginComponent$receiver$1", "Lcom/xiaomi/fitness/login/LoginComponent$receiver$1;", "toLogin", "getActionLoginBroadcastPermission", "", "Companion", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "登录")
public final class LoginComponent {

    @NotNull
    public static final String MIOT_SID = "miothealth";

    @NotNull
    public static final String TAG = "MineComponet";
    public static final int TOKEN_TIME_OUT = 86400000;

    @NotNull
    private final LoginComponent$receiver$1 receiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.login.LoginComponent$receiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Logger.i("LoginComponent", "onReceive: " + intent);
            LoginSupportActivity.INSTANCE.launch(intent != null ? (Intent) intent.getParcelableExtra("key_intent") : null, true);
        }
    };

    /* JADX INFO: renamed from: com.xiaomi.fitness.login.LoginComponent$loginIfNeed$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.login.LoginComponent$loginIfNeed$1", f = "LoginComponent.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AccountManager $accountManager;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AccountManager accountManager, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$accountManager = accountManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$accountManager, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountManager accountManager = this.$accountManager;
                this.label = 1;
                if (accountManager.accessAccount(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final String getActionLoginBroadcastPermission() {
        return AppUtil.getApp().getPackageName() + ".broadcast.permission.action_login";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initAccountOnMain$lambda$1(LoginComponent this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AccountManagerExtKt.getInstance(TokenManager.INSTANCE).update();
        if (!z) {
            this$0.closeComponent();
            AccountServiceCookieManagerExtKt.getInstance(AccountCookieManager.INSTANCE).clear();
            FileUtils.clearSpFile$default(FileUtils.INSTANCE, ApplicationExtKt.getApplication(), null, new String[0], 2, null);
            AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).clear();
            new Handler().postDelayed(new Runnable() { // from class: qqe
                @Override // java.lang.Runnable
                public final void run() {
                    LoginComponent.initAccountOnMain$lambda$1$lambda$0();
                }
            }, 500L);
            Logger.i("logout onetrack.", new Object[0]);
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).logout();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initAccountOnMain$lambda$1$lambda$0() {
        AppManager.INSTANCE.getInstance().appExit();
    }

    private final void loginIfNeed(AccountManager accountManager) {
        if (!AppUtil.INSTANCE.isPlayChannel() || accountManager.isLogin()) {
            return;
        }
        AnyExtKt.io$default(null, new AnonymousClass1(accountManager, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyAccountCookie$lambda$2() {
        Logger.i("LoginComponent", "notifyAccountCookie before");
        try {
            AccountServiceCookieManagerExtKt.getInstance(AccountCookieManager.INSTANCE).notifyAccountCookie();
        } catch (Throwable th) {
            Logger.i("LoginComponent", "notifyAccountCookie error", th);
        }
        Logger.i("LoginComponent", "notifyAccountCookie after");
    }

    private final void toLogin(Application app) {
        IntentFilter intentFilter = new IntentFilter(AccountContractConstants.ACTION_LOGIN);
        if (Build.VERSION.SDK_INT >= 33) {
            app.registerReceiver(this.receiver, intentFilter, getActionLoginBroadcastPermission(), null, 2);
        } else {
            app.registerReceiver(this.receiver, intentFilter, getActionLoginBroadcastPermission(), null);
        }
    }

    public final void closeComponent() {
        try {
            ComponentState componentState = ComponentState.INSTANCE;
            int i = SleepTraceReceiver.f12904a;
            Intrinsics.checkNotNullExpressionValue(SleepTraceReceiver.class, "forName(...)");
            componentState.enableComponent(false, SleepTraceReceiver.class);
            int i2 = BootCompletedReceiver.f12355a;
            Intrinsics.checkNotNullExpressionValue(BootCompletedReceiver.class, "forName(...)");
            componentState.enableComponent(false, BootCompletedReceiver.class);
            int i3 = LanguageReceiver.f11999a;
            Intrinsics.checkNotNullExpressionValue(LanguageReceiver.class, "forName(...)");
            componentState.enableComponent(false, LanguageReceiver.class);
            int i4 = NetworkStatusReceiver.c;
            Intrinsics.checkNotNullExpressionValue(NetworkStatusReceiver.class, "forName(...)");
            componentState.enableComponent(false, NetworkStatusReceiver.class);
        } catch (Exception e) {
            Logger.i("closeComponent error . " + e, new Object[0]);
            e.printStackTrace();
        }
    }

    @ComponentTask(multiProcess = true, notEarlierThan = 2, notLaterThan = 2, onMainThread = true)
    public final void initAccount(@NotNull Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        AccountManager accountManagerExtKt = AccountManagerExtKt.getInstance(AccountManager.INSTANCE);
        accountManagerExtKt.init("miothealth");
        AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).init();
        loginIfNeed(accountManagerExtKt);
        Logger.d("LoginComponent", "initAccount:" + ApplicationExtKt.getProcessName(ApplicationExtKt.getApplication()) + ">>" + accountManagerExtKt.isLogin());
    }

    @ComponentTask(notEarlierThan = 2, notLaterThan = 2, onMainThread = true)
    public final void initAccountOnMain(@NotNull Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        AccountManagerExtKt.getInstance(AccountManager.INSTANCE).addAccountListener(new Function1() { // from class: oqe
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LoginComponent.initAccountOnMain$lambda$1(this.f29386a, ((Boolean) obj).booleanValue());
            }
        });
        toLogin(app);
    }

    @ComponentTask(notEarlierThan = 4, notLaterThan = 5, onMainThread = false)
    public final void notifyAccountCookie() {
        new Thread(new Runnable() { // from class: pqe
            @Override // java.lang.Runnable
            public final void run() {
                LoginComponent.notifyAccountCookie$lambda$2();
            }
        }).start();
    }
}
