package com.xiaomi.fitness.account.manager;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mibi.sdk.component.params.SdkContants;
import com.miui.circulate.api.protocol.audio.support.MediaMetaData;
import com.xiaomi.accounts.Manifest;
import com.xiaomi.accountsdk.account.XMPassportSettings;
import com.xiaomi.accountsdk.utils.AccountLogger;
import com.xiaomi.fitness.account.extensions.LogExtKt;
import com.xiaomi.fitness.account.manager.AccountManagerImpl;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.passport.PassportSDK;
import com.xiaomi.passport.accountmanager.XiaomiAccountManager;
import com.xiaomi.passport.accountmanager.XiaomiAccountManagerCallback;
import com.xiaomi.passport.accountmanager.XiaomiAccountManagerFuture;
import com.xiaomi.passport.servicetoken.ServiceTokenResult;
import com.xiaomi.passport.servicetoken.data.XmAccountVisibility;
import com.xiaomi.passport.ui.onetrack.TrackConstants;
import defpackage.ni4;
import defpackage.owk;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001c\u0010#\u001a\u00020\f2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\nH\u0016J\u001c\u0010%\u001a\u00020\f2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\nH\u0002J\u001c\u0010&\u001a\u00020\f2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\nH\u0016J\u0010\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u0012H\u0002J\b\u0010)\u001a\u00020\u000bH\u0002J\u0012\u0010*\u001a\u00020\f2\b\b\u0002\u0010+\u001a\u00020\u000bH\u0002J\u0006\u0010,\u001a\u00020\fJ\r\u0010-\u001a\u00020\fH\u0001¢\u0006\u0002\b.J\r\u0010/\u001a\u00020\fH\u0001¢\u0006\u0002\b0J\b\u00101\u001a\u00020\fH\u0016J\u000e\u00102\u001a\u000203H\u0097@¢\u0006\u0002\u00104J\u0010\u00105\u001a\u0002032\u0006\u00106\u001a\u000207H\u0002J+\u00108\u001a\u00020\f2!\u00109\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\f0\nH\u0016J\u001c\u0010<\u001a\u00020\f2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0016J\u0010\u0010=\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u000bH\u0002J\u0010\u0010>\u001a\u00020\u00172\u0006\u0010?\u001a\u00020\u0017H\u0016J\u0012\u0010@\u001a\u0004\u0018\u00010A2\u0006\u0010B\u001a\u00020\u000bH\u0017J\n\u0010C\u001a\u0004\u0018\u00010\u0017H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R-\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR-\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\n0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0018\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0019\"\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u0019\"\u0004\b \u0010\u001dR\u0014\u0010!\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0019R\u0014\u0010\"\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0019¨\u0006D"}, d2 = {"Lcom/xiaomi/fitness/account/manager/AccountManagerImpl;", "Lcom/xiaomi/fitness/account/manager/AccountManager;", "context", "Landroid/content/Context;", "mMiAccountManager", "Lcom/xiaomi/fitness/account/manager/IMiAccountManager;", "<init>", "(Landroid/content/Context;Lcom/xiaomi/fitness/account/manager/IMiAccountManager;)V", "mListeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lkotlin/Function1;", "", "", "getMListeners", "()Ljava/util/concurrent/CopyOnWriteArraySet;", "mListeners$delegate", "Lkotlin/Lazy;", "mLoginCallbackList", "Landroid/os/Bundle;", "getMLoginCallbackList", "mLoginCallbackList$delegate", "init", "sid", "", "isLogin", "()Z", "loggingIn", "getLoggingIn", "setLoggingIn", "(Z)V", "value", "isStaging", "setStaging", "isUseSystem", "isUseLocal", "login", "callback", "addLoginCallback", "removeLoginCallback", "notifyLoginCallbackList", SdkContants.KEY_BUNDLE, MediaMetaData.IS_LOCAL, "systemLogin", "refreshToken", "localLogin", "onLoginSuccess", "onLoginSuccess$account_release", "onLogoutSuccess", "onLogoutSuccess$account_release", TrackConstants.LOGOUT, "accessAccount", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doSystemAccount", "data", "Lcom/xiaomi/passport/servicetoken/data/XmAccountVisibility;", "addAccountListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/ParameterName;", "name", "removeAccountListener", "notifyAccountListeners", "getUserData", "key", "getMiAccountCoreInfoSync", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "forceRefresh", "getUserId", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAccountManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountManagerImpl.kt\ncom/xiaomi/fitness/account/manager/AccountManagerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,344:1\n1863#2,2:345\n1863#2,2:347\n*S KotlinDebug\n*F\n+ 1 AccountManagerImpl.kt\ncom/xiaomi/fitness/account/manager/AccountManagerImpl\n*L\n146#1:345,2\n326#1:347,2\n*E\n"})
public final class AccountManagerImpl implements AccountManager {

    @NotNull
    private final Context context;
    private volatile boolean loggingIn;

    /* JADX INFO: renamed from: mListeners$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mListeners;

    /* JADX INFO: renamed from: mLoginCallbackList$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mLoginCallbackList;

    @NotNull
    private final IMiAccountManager mMiAccountManager;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[XmAccountVisibility.ErrorCode.values().length];
            try {
                iArr[XmAccountVisibility.ErrorCode.ERROR_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[XmAccountVisibility.ErrorCode.ERROR_NO_ACCOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[XmAccountVisibility.ErrorCode.ERROR_PRE_ANDROID_O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[XmAccountVisibility.ErrorCode.ERROR_NO_PERMISSION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[XmAccountVisibility.ErrorCode.ERROR_NOT_SUPPORT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.account.manager.AccountManagerImpl$login$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.account.manager.AccountManagerImpl$login$1", f = "AccountManagerImpl.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountManagerImpl.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountManagerImpl accountManagerImpl = AccountManagerImpl.this;
                this.label = 1;
                obj = accountManagerImpl.accessAccount(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            int iIntValue = ((Number) obj).intValue();
            LogExtKt.logi("login: accessAccount code = " + iIntValue);
            if (iIntValue == 3) {
                AccountManagerImpl.this.systemLogin(true);
            } else if (iIntValue != 4) {
                Bundle bundle = new Bundle();
                bundle.putInt("errorCode", iIntValue);
                AccountManagerImpl.this.notifyLoginCallbackList(bundle);
            } else {
                AccountManagerImpl.this.localLogin();
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.account.manager.AccountManagerImpl$systemLogin$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.account.manager.AccountManagerImpl$systemLogin$1", f = "AccountManagerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17601 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $refreshToken;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.account.manager.AccountManagerImpl$systemLogin$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.account.manager.AccountManagerImpl$systemLogin$1$1", f = "AccountManagerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C03801 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AccountManagerImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03801(AccountManagerImpl accountManagerImpl, Continuation<? super C03801> continuation) {
                super(2, continuation);
                this.this$0 = accountManagerImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C03801(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Bundle bundle = new Bundle();
                bundle.putBoolean("booleanResult", true);
                this.this$0.onLoginSuccess$account_release();
                this.this$0.notifyLoginCallbackList(bundle);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C03801) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17601(boolean z, Continuation<? super C17601> continuation) {
            super(2, continuation);
            this.$refreshToken = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(AccountManagerImpl accountManagerImpl, AccountManagerFuture accountManagerFuture) throws OperationCanceledException, IOException, AuthenticatorException {
            Object result = accountManagerFuture.getResult();
            boolean zIsCancelled = accountManagerFuture.isCancelled();
            boolean zIsDone = accountManagerFuture.isDone();
            StringBuilder sb = new StringBuilder();
            sb.append("systemLogin: ");
            sb.append(result);
            sb.append(">>>");
            sb.append(zIsCancelled);
            sb.append(">>>");
            sb.append(zIsDone);
            try {
                AnyExtKt.main$default(null, new AccountManagerImpl$systemLogin$1$2$1(accountManagerImpl, accountManagerFuture, null), 1, null);
            } catch (AuthenticatorException e) {
                LogExtKt.logi("systemLogin: throw " + e + " when AccountManagerCallback");
            } catch (OperationCanceledException e2) {
                LogExtKt.logi("systemLogin: throw " + e2 + " when AccountManagerCallback");
            } catch (IOException e3) {
                LogExtKt.logi("systemLogin: throw " + e3 + " when AccountManagerCallback");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountManagerImpl.this.new C17601(this.$refreshToken, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AccountManagerImpl.this.mMiAccountManager.setUserSystem();
            ServiceTokenResult serviceToken = AccountManagerImpl.this.mMiAccountManager.getServiceToken(AccountManagerImpl.this.mMiAccountManager.getSid(), this.$refreshToken);
            if (serviceToken.errorCode == ServiceTokenResult.ErrorCode.ERROR_NONE) {
                Logger.d("systemLogin: 已经登录成功=" + AccountManagerImpl.this.mMiAccountManager.getMiAccount() + ">>" + serviceToken, new Object[0]);
                AnyExtKt.main$default(null, new C03801(AccountManagerImpl.this, null), 1, null);
            } else {
                IMiAccountManager iMiAccountManager = AccountManagerImpl.this.mMiAccountManager;
                final AccountManagerImpl accountManagerImpl = AccountManagerImpl.this;
                iMiAccountManager.systemLogin(new AccountManagerCallback() { // from class: com.xiaomi.fitness.account.manager.a
                    @Override // android.accounts.AccountManagerCallback
                    public final void run(AccountManagerFuture accountManagerFuture) throws OperationCanceledException, IOException, AuthenticatorException {
                        AccountManagerImpl.C17601.invokeSuspend$lambda$0(accountManagerImpl, accountManagerFuture);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public AccountManagerImpl(@NotNull Context context, @NotNull IMiAccountManager mMiAccountManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mMiAccountManager, "mMiAccountManager");
        this.context = context;
        this.mMiAccountManager = mMiAccountManager;
        this.mListeners = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: a90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountManagerImpl.mListeners_delegate$lambda$0();
            }
        });
        this.mLoginCallbackList = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: b90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountManagerImpl.mLoginCallbackList_delegate$lambda$1();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addLoginCallback(Function1<? super Bundle, Unit> callback) {
        if (getMLoginCallbackList().contains(callback)) {
            return;
        }
        getMLoginCallbackList().add(callback);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
    
        if (isLocal() != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r5.visible != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return 3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int doSystemAccount(com.xiaomi.passport.servicetoken.data.XmAccountVisibility r5) {
        /*
            r4 = this;
            com.xiaomi.passport.servicetoken.data.XmAccountVisibility$ErrorCode r0 = r5.errorCode
            if (r0 != 0) goto L6
            r0 = -1
            goto Le
        L6:
            int[] r1 = com.xiaomi.fitness.account.manager.AccountManagerImpl.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
        Le:
            r1 = 1
            r2 = 3
            r3 = 4
            if (r0 == r1) goto L2c
            r5 = 2
            if (r0 == r5) goto L23
            if (r0 == r2) goto L21
            if (r0 == r3) goto L31
            r1 = 5
            if (r0 == r1) goto L1f
        L1d:
            r1 = r3
            goto L31
        L1f:
            r1 = r5
            goto L31
        L21:
            r1 = 0
            goto L31
        L23:
            boolean r5 = r4.isLocal()
            if (r5 == 0) goto L2a
            goto L1d
        L2a:
            r1 = r2
            goto L31
        L2c:
            boolean r5 = r5.visible
            if (r5 == 0) goto L1d
            goto L2a
        L31:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.account.manager.AccountManagerImpl.doSystemAccount(com.xiaomi.passport.servicetoken.data.XmAccountVisibility):int");
    }

    private final CopyOnWriteArraySet<Function1<Boolean, Unit>> getMListeners() {
        return (CopyOnWriteArraySet) this.mListeners.getValue();
    }

    private final CopyOnWriteArraySet<Function1<Bundle, Unit>> getMLoginCallbackList() {
        return (CopyOnWriteArraySet) this.mLoginCallbackList.getValue();
    }

    private final boolean isLocal() {
        return (!isStaging() && owk.b() && XiaomiAccountManager.isSystemAccountInstalled(ApplicationExtKt.getApplication())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void localLogin$lambda$3(AccountManagerImpl this$0, AccountManagerFuture accountManagerFuture) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Bundle bundle = (Bundle) accountManagerFuture.getResult();
            LogExtKt.logi("result " + bundle);
            if (bundle.getBoolean("booleanResult")) {
                this$0.onLoginSuccess$account_release();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("booleanResult", true);
                this$0.notifyLoginCallbackList(bundle2);
            } else {
                LogExtKt.logi("localLogin: " + bundle.getInt("errorCode") + ", result = " + bundle);
                Intrinsics.checkNotNull(bundle);
                this$0.notifyLoginCallbackList(bundle);
            }
        } catch (AuthenticatorException e) {
            LogExtKt.logi("localLogin: throw " + e + " when remove xiaomi account");
        } catch (OperationCanceledException e2) {
            LogExtKt.logi("localLogin: throw " + e2 + " when remove xiaomi account");
        } catch (IOException e3) {
            LogExtKt.logi("localLogin: throw " + e3 + " when remove xiaomi account");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logout$lambda$4(AccountManagerImpl this$0, XiaomiAccountManagerFuture xiaomiAccountManagerFuture) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Bundle bundle = (Bundle) xiaomiAccountManagerFuture.getResult();
            if (bundle.getBoolean("booleanResult")) {
                this$0.onLogoutSuccess$account_release();
            } else {
                Logger.e(LogExtKt.ACCOUNT_TAG, "onLogoutFail intent " + ((Intent) bundle.getParcelable("intent")));
            }
        } catch (AuthenticatorException e) {
            Logger.e("logout exception: " + e, new Object[0]);
        } catch (OperationCanceledException e2) {
            Logger.e("logout exception: " + e2, new Object[0]);
        } catch (IOException e3) {
            Logger.e("logout exception: " + e3, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CopyOnWriteArraySet mListeners_delegate$lambda$0() {
        return new CopyOnWriteArraySet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CopyOnWriteArraySet mLoginCallbackList_delegate$lambda$1() {
        return new CopyOnWriteArraySet();
    }

    private final void notifyAccountListeners(boolean login) {
        LogExtKt.logi((login ? "login" : TrackConstants.LOGOUT) + " success");
        Iterator<T> it = getMListeners().iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke2(Boolean.valueOf(login));
        }
        setLoggingIn(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyLoginCallbackList(Bundle bundle) {
        Iterator<T> it = getMLoginCallbackList().iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke2(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void systemLogin(boolean refreshToken) {
        AnyExtKt.io$default(null, new C17601(refreshToken, null), 1, null);
    }

    public static /* synthetic */ void systemLogin$default(AccountManagerImpl accountManagerImpl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        accountManagerImpl.systemLogin(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.account.manager.AccountManager
    @RequiresPermission(Manifest.permission.GET_ACCOUNTS)
    @Nullable
    public Object accessAccount(@NotNull Continuation<? super Integer> continuation) {
        int iDoSystemAccount;
        XmAccountVisibility xmAccountVisibility = null;
        try {
            xmAccountVisibility = (XmAccountVisibility) IMiAccountManager.DefaultImpls.setSystemAccountVisibility$default(this.mMiAccountManager, null, 1, null).get();
        } catch (Exception e) {
            LogExtKt.logi("accessAccount exception " + e);
        }
        LogExtKt.logi("accountVisibility " + xmAccountVisibility);
        if (xmAccountVisibility != null) {
            LogExtKt.logi("Can access account");
            iDoSystemAccount = doSystemAccount(xmAccountVisibility);
        } else {
            LogExtKt.logi("Cannot access account, login to local");
            if (isLogin()) {
                logout();
            }
            iDoSystemAccount = 4;
        }
        return Boxing.boxInt(iDoSystemAccount);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.account.manager.AccountManager
    public void addAccountListener(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (getMListeners().contains(listener)) {
            return;
        }
        getMListeners().add(listener);
    }

    @Override // com.xiaomi.fitness.account.manager.AccountManager
    public boolean getLoggingIn() {
        return this.loggingIn;
    }

    @Override // com.xiaomi.fitness.account.manager.AccountManager
    @Nullable
    public AccountCoreInfo getMiAccountCoreInfoSync(boolean forceRefresh) {
        return this.mMiAccountManager.getMiAccountCoreInfoSync(forceRefresh);
    }

    @Override // com.xiaomi.fitness.account.manager.AccountManager
    @NotNull
    public String getUserData(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.mMiAccountManager.getUserData(key);
    }

    @Override // com.xiaomi.fitness.account.manager.AccountManager
    @Nullable
    public String getUserId() {
        return this.mMiAccountManager.getUserId();
    }

    @Override // com.xiaomi.fitness.account.manager.AccountManager
    public void init(@NotNull String sid) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        this.mMiAccountManager.setSid(sid);
        boolean zIsLocal = isLocal();
        LogExtKt.logi("init account with sid(" + sid + ") in " + (zIsLocal ? "local" : "system"));
        PassportSDK.init(this.context, new PassportSDK.SDKInitParams(zIsLocal ^ true, AppUtil.INSTANCE.isPlayChannel()).logger(new AccountLogger.Logger() { // from class: com.xiaomi.fitness.account.manager.AccountManagerImpl$init$sdkInitParams$1
            @Override // com.xiaomi.accountsdk.utils.AccountLogger.Logger
            public void log(String tag, String message) {
                Logger.i(String.valueOf(tag), "log: " + message);
            }

            @Override // com.xiaomi.accountsdk.utils.AccountLogger.Logger
            public void log(String tag, String message, Throwable tr) {
                Logger.i(String.valueOf(tag), "log: " + message, tr);
            }

            @Override // com.xiaomi.accountsdk.utils.AccountLogger.Logger
            public void log(String tag, Throwable tr) {
                Logger.i(String.valueOf(tag), "error ", tr);
            }

            @Override // com.xiaomi.accountsdk.utils.AccountLogger.Logger
            public void log(AccountLogger.HttpRequestLog requestLog) {
                LogExtKt.logi("requestLog: " + requestLog);
            }
        }));
        if (zIsLocal) {
            this.mMiAccountManager.setUserLocal();
        } else {
            this.mMiAccountManager.setUserSystem();
        }
        AccountBroadcastReceiver.INSTANCE.register(this);
    }

    @Override // com.xiaomi.fitness.account.manager.AccountManager
    public boolean isLogin() {
        return RegionPreference.INSTANCE.getPRIVACY_AGREE() && this.mMiAccountManager.getMiAccount() != null;
    }

    @Override // com.xiaomi.fitness.account.manager.AccountManager
    public boolean isStaging() {
        return XMPassportSettings.isLocalStaging(this.context);
    }

    @Override // com.xiaomi.fitness.account.manager.AccountManager
    public boolean isUseLocal() {
        return this.mMiAccountManager.isUseLocal();
    }

    @Override // com.xiaomi.fitness.account.manager.AccountManager
    public boolean isUseSystem() {
        return this.mMiAccountManager.isUseSystem();
    }

    public final void localLogin() {
        this.mMiAccountManager.localLogin(new AccountManagerCallback() { // from class: z80
            @Override // android.accounts.AccountManagerCallback
            public final void run(AccountManagerFuture accountManagerFuture) {
                AccountManagerImpl.localLogin$lambda$3(this.f40999a, accountManagerFuture);
            }
        });
    }

    @Override // com.xiaomi.fitness.account.manager.AccountManager
    public void login(@NotNull Function1<? super Bundle, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        setLoggingIn(true);
        addLoginCallback(callback);
        if (isLocal()) {
            localLogin();
        } else {
            AnyExtKt.io$default(null, new AnonymousClass1(null), 1, null);
        }
    }

    @Override // com.xiaomi.fitness.account.manager.AccountManager
    public void logout() {
        if (this.mMiAccountManager.isUseLocal()) {
            if (this.mMiAccountManager.getMiAccount() == null) {
                return;
            }
            this.mMiAccountManager.removeXiaomiAccount(new XiaomiAccountManagerCallback() { // from class: c90
                @Override // com.xiaomi.passport.accountmanager.XiaomiAccountManagerCallback
                public final void run(XiaomiAccountManagerFuture xiaomiAccountManagerFuture) {
                    AccountManagerImpl.logout$lambda$4(this.f5062a, xiaomiAccountManagerFuture);
                }
            });
        } else if (this.mMiAccountManager.isUseSystem()) {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setPackage("com.xiaomi.account");
            intent.addFlags(268435456);
            ni4.n(this.context, intent, null);
        }
    }

    public final void onLoginSuccess$account_release() {
        notifyAccountListeners(true);
    }

    public final void onLogoutSuccess$account_release() {
        notifyAccountListeners(false);
        BroadcastsKt.broadcastLogout();
    }

    @Override // com.xiaomi.fitness.account.manager.AccountManager
    public void removeAccountListener(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        getMListeners().remove(listener);
    }

    @Override // com.xiaomi.fitness.account.manager.AccountManager
    public void removeLoginCallback(@NotNull Function1<? super Bundle, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        getMLoginCallbackList().remove(callback);
    }

    @Override // com.xiaomi.fitness.account.manager.AccountManager
    public void setLoggingIn(boolean z) {
        this.loggingIn = z;
    }

    @Override // com.xiaomi.fitness.account.manager.AccountManager
    public void setStaging(boolean z) {
        XMPassportSettings.setLocalStaging(this.context, z);
        if (z) {
            this.mMiAccountManager.setUserLocal();
        } else {
            this.mMiAccountManager.setUserSystem();
        }
    }
}
