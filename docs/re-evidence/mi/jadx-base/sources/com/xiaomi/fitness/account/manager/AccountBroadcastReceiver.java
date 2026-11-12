package com.xiaomi.fitness.account.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.xiaomi.fitness.account.extensions.LogExtKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.passport.utils.LoginPreferenceConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/account/manager/AccountBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "mAccountManager", "Lcom/xiaomi/fitness/account/manager/AccountManagerImpl;", "<init>", "(Lcom/xiaomi/fitness/account/manager/AccountManagerImpl;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AccountBroadcastReceiver extends BroadcastReceiver {

    @NotNull
    public static final String APP_ACCOUNT_LOGIN_CANCEL = "app_account_login_cancel";

    @NotNull
    public static final String APP_ACCOUNT_REFRESH = "APP_ACCOUNT_REFRESH";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String EXTRA_LOCAL_FLAG = "extra_local_flag";

    @NotNull
    public static final String EXTRA_UPDATE_TYPE = "extra_update_type";

    @NotNull
    private static final String SYSTEM_LOGIN_ACCOUNTS_POST_CHANGED_ACTION = "android.accounts.LOGIN_ACCOUNTS_POST_CHANGED";

    @NotNull
    private static final String SYSTEM_LOGIN_ACCOUNTS_PRE_CHANGED_ACTION = "android.accounts.LOGIN_ACCOUNTS_PRE_CHANGED";
    private static final int TYPE_ADD = 2;
    public static final int TYPE_CANCEL = 4;
    public static final int TYPE_REFRESH = 3;
    private static final int TYPE_REMOVE = 1;

    @NotNull
    private final AccountManagerImpl mAccountManager;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/account/manager/AccountBroadcastReceiver$Companion;", "", "<init>", "()V", "EXTRA_UPDATE_TYPE", "", "EXTRA_LOCAL_FLAG", "TYPE_REMOVE", "", "TYPE_ADD", "TYPE_REFRESH", "TYPE_CANCEL", "SYSTEM_LOGIN_ACCOUNTS_PRE_CHANGED_ACTION", "SYSTEM_LOGIN_ACCOUNTS_POST_CHANGED_ACTION", "APP_ACCOUNT_REFRESH", "APP_ACCOUNT_LOGIN_CANCEL", LoginPreferenceConfig.TYPE_REGISTER, "", "accountManager", "Lcom/xiaomi/fitness/account/manager/AccountManagerImpl;", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void register(@NotNull AccountManagerImpl accountManager) {
            Intrinsics.checkNotNullParameter(accountManager, "accountManager");
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.accounts.LOGIN_ACCOUNTS_POST_CHANGED");
            intentFilter.addAction("android.accounts.LOGIN_ACCOUNTS_PRE_CHANGED");
            intentFilter.addAction("com.xiaomi.accounts.LOGIN_ACCOUNTS_PRE_CHANGED");
            intentFilter.addAction("com.xiaomi.accounts.LOGIN_ACCOUNTS_POST_CHANGED");
            intentFilter.addAction("APP_ACCOUNT_REFRESH");
            intentFilter.addAction(AccountBroadcastReceiver.APP_ACCOUNT_LOGIN_CANCEL);
            if (Build.VERSION.SDK_INT >= 33) {
                ApplicationExtKt.getApplication().registerReceiver(new AccountBroadcastReceiver(accountManager), intentFilter, 2);
            } else {
                ApplicationExtKt.getApplication().registerReceiver(new AccountBroadcastReceiver(accountManager), intentFilter);
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.account.manager.AccountBroadcastReceiver$onReceive$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.account.manager.AccountBroadcastReceiver$onReceive$1", f = "AccountBroadcastReceiver.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Integer $type;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.account.manager.AccountBroadcastReceiver$onReceive$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.account.manager.AccountBroadcastReceiver$onReceive$1$1", f = "AccountBroadcastReceiver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C03791 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Integer $type;
            int label;
            final /* synthetic */ AccountBroadcastReceiver this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03791(Integer num, AccountBroadcastReceiver accountBroadcastReceiver, Continuation<? super C03791> continuation) {
                super(2, continuation);
                this.$type = num;
                this.this$0 = accountBroadcastReceiver;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C03791(this.$type, this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Integer num = this.$type;
                if (num != null && num.intValue() == 1) {
                    this.this$0.mAccountManager.onLogoutSuccess$account_release();
                } else if (num != null && num.intValue() == 2) {
                    this.this$0.mAccountManager.onLoginSuccess$account_release();
                } else if (num != null && num.intValue() == 3 && this.this$0.mAccountManager.isLogin()) {
                    this.this$0.mAccountManager.onLoginSuccess$account_release();
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C03791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Integer num, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$type = num;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountBroadcastReceiver.this.new AnonymousClass1(this.$type, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountManagerImpl accountManagerImpl = AccountBroadcastReceiver.this.mAccountManager;
                this.label = 1;
                if (accountManagerImpl.accessAccount(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            AnyExtKt.main$default(null, new C03791(this.$type, AccountBroadcastReceiver.this, null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public AccountBroadcastReceiver(@NotNull AccountManagerImpl mAccountManager) {
        Intrinsics.checkNotNullParameter(mAccountManager, "mAccountManager");
        this.mAccountManager = mAccountManager;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        Integer numValueOf = intent != null ? Integer.valueOf(intent.getIntExtra("extra_update_type", 0)) : null;
        LogExtKt.logi("onReceive: " + intent + ";updateType:" + numValueOf);
        AnyExtKt.io$default(null, new AnonymousClass1(numValueOf, null), 1, null);
    }
}
