package com.huami.account.ui.login.usecase;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.AccountExternalsKt;
import com.huami.account.AccountStatEvent;
import com.huami.account.ui.R;
import com.huami.account.ui.common.repo.PhoneAccountRepository;
import com.huami.account.ui.common.state.ResultWrapper;
import com.huami.account.ui.login.entity.PhoneLoginForm;
import com.huami.account.ui.login.state.LoginFailed;
import com.huami.account.ui.login.state.LoginSuccess;
import com.huami.account.utils.AccountConstants;
import com.huami.account.utils.UtilsKt;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.passport.AccountManager;
import com.huami.passport.AccountManagerExt;
import com.huami.passport.OperationResult;
import com.huami.passport.entity.LoginToken;
import com.huami.util.net.NetUtil;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ3\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nJ3\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nJ3\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\nJ3\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086Bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\nR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lcom/huami/account/ui/login/usecase/LoginPhoneEmailUseCase;", "", "", "username", "password", "Lcom/huami/account/ui/common/state/ResultWrapper;", "Lcom/huami/account/ui/login/state/LoginSuccess;", "Lcom/huami/account/ui/login/state/LoginFailed;", "Lcom/huami/account/ui/login/state/LoginUiResult;", "a", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", GoogleApiAvailabilityLight.a, "b", "invoke", "Lcom/huami/passport/AccountManager;", "Lcom/huami/passport/AccountManager;", "accountManager", "Lcom/huami/account/ui/login/usecase/HandleLoginSuccessUseCase;", "Lcom/huami/account/ui/login/usecase/HandleLoginSuccessUseCase;", "handleLoginSuccessUseCase", "Lcom/huami/account/ui/login/usecase/HandleLoginFailedUseCase;", "Lcom/huami/account/ui/login/usecase/HandleLoginFailedUseCase;", "handleLoginFailedUseCase", "Lcom/huami/account/ui/common/repo/PhoneAccountRepository;", "Lcom/huami/account/ui/common/repo/PhoneAccountRepository;", "phoneAccountRepository", "<init>", "(Lcom/huami/passport/AccountManager;Lcom/huami/account/ui/login/usecase/HandleLoginSuccessUseCase;Lcom/huami/account/ui/login/usecase/HandleLoginFailedUseCase;Lcom/huami/account/ui/common/repo/PhoneAccountRepository;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class LoginPhoneEmailUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AccountManager accountManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final HandleLoginSuccessUseCase handleLoginSuccessUseCase;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final HandleLoginFailedUseCase handleLoginFailedUseCase;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final PhoneAccountRepository phoneAccountRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.account.ui.login.usecase.LoginPhoneEmailUseCase", f = "LoginPhoneEmailUseCase.kt", i = {0}, l = {91, 93}, m = "handleEmailLogin", n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return LoginPhoneEmailUseCase.this.c(null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.account.ui.login.usecase.LoginPhoneEmailUseCase", f = "LoginPhoneEmailUseCase.kt", i = {0, 0}, l = {108, 116}, m = "handlePhoneLogin", n = {"this", "provider"}, s = {"L$0", "L$1"})
    public static final class b extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return LoginPhoneEmailUseCase.this.d(null, null, this);
        }
    }

    public LoginPhoneEmailUseCase(@NotNull AccountManager accountManager, @NotNull HandleLoginSuccessUseCase handleLoginSuccessUseCase, @NotNull HandleLoginFailedUseCase handleLoginFailedUseCase, @NotNull PhoneAccountRepository phoneAccountRepository) {
        this.accountManager = accountManager;
        this.handleLoginSuccessUseCase = handleLoginSuccessUseCase;
        this.handleLoginFailedUseCase = handleLoginFailedUseCase;
        this.phoneAccountRepository = phoneAccountRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(String str, String str2, Continuation<? super ResultWrapper<LoginSuccess, ? extends LoginFailed>> continuation) {
        if (UtilsKt.isPhoneNumFormat(str)) {
            Analytics.recordEvent(new CountEventBuilder(AccountStatEvent.EVENT_LOGIN_ACCOUNT_SIGN).addExtra("type", "Phone"));
            return d(str, str2, continuation);
        }
        if (!UtilsKt.isEmailFormat(str)) {
            return ResultWrapper.INSTANCE.failed(new LoginFailed.NormalMessageError(R.string.account_ui_account_account_or_pwd_incorrect));
        }
        Analytics.recordEvent(new CountEventBuilder(AccountStatEvent.EVENT_LOGIN_ACCOUNT_SIGN).addExtra("type", "Email"));
        return c(str, str2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object b(String str, String str2, Continuation<? super ResultWrapper<LoginSuccess, ? extends LoginFailed>> continuation) {
        return UtilsKt.isPhoneNumFormat(str) ? d(str, str2, continuation) : ResultWrapper.INSTANCE.failed(new LoginFailed.NormalMessageError(R.string.account_ui_account_account_or_pwd_incorrect));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, String str2, Continuation<? super ResultWrapper<LoginSuccess, ? extends LoginFailed>> continuation) {
        a aVar;
        LoginPhoneEmailUseCase loginPhoneEmailUseCase;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.d = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objAwaitLogin = aVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                loginPhoneEmailUseCase = (LoginPhoneEmailUseCase) aVar.a;
                ResultKt.throwOnFailure(objAwaitLogin);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objAwaitLogin);
            }
        }
        ResultKt.throwOnFailure(objAwaitLogin);
        AccountManager accountManager = this.accountManager;
        aVar.a = this;
        aVar.d = 1;
        objAwaitLogin = AccountManagerExt.awaitLogin(accountManager, str, str2, false, aVar);
        if (objAwaitLogin == coroutine_suspended) {
            return coroutine_suspended;
        }
        loginPhoneEmailUseCase = this;
        OperationResult operationResult = (OperationResult) objAwaitLogin;
        if (!operationResult.isSuccess()) {
            return ResultWrapper.INSTANCE.failed(HandleLoginFailedUseCase.invoke$default(loginPhoneEmailUseCase.handleLoginFailedUseCase, "huami", operationResult.getErrorCode(), null, false, 8, null));
        }
        HandleLoginSuccessUseCase handleLoginSuccessUseCase = loginPhoneEmailUseCase.handleLoginSuccessUseCase;
        LoginToken loginToken = (LoginToken) operationResult.getResult();
        aVar.a = null;
        aVar.d = 2;
        objAwaitLogin = handleLoginSuccessUseCase.invoke("huami", loginToken, aVar);
        return objAwaitLogin == coroutine_suspended ? coroutine_suspended : objAwaitLogin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, String str2, Continuation<? super ResultWrapper<LoginSuccess, ? extends LoginFailed>> continuation) {
        b bVar;
        LoginPhoneEmailUseCase loginPhoneEmailUseCase;
        String str3;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.e = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objInvoke = bVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = bVar.e;
        if (i2 != 0) {
            if (i2 == 1) {
                String str4 = (String) bVar.b;
                loginPhoneEmailUseCase = (LoginPhoneEmailUseCase) bVar.a;
                ResultKt.throwOnFailure(objInvoke);
                str3 = str4;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objInvoke);
            }
        }
        ResultKt.throwOnFailure(objInvoke);
        PhoneAccountRepository phoneAccountRepository = this.phoneAccountRepository;
        PhoneLoginForm phoneLoginForm = new PhoneLoginForm(str, str2, AccountConstants.DEFAULT_AREA_CODE);
        bVar.a = this;
        bVar.b = "huami_phone";
        bVar.e = 1;
        Object objLoginWithPhone = phoneAccountRepository.loginWithPhone(phoneLoginForm, bVar);
        if (objLoginWithPhone == coroutine_suspended) {
            return coroutine_suspended;
        }
        loginPhoneEmailUseCase = this;
        str3 = "huami_phone";
        objInvoke = objLoginWithPhone;
        OperationResult operationResult = (OperationResult) objInvoke;
        if (!operationResult.isSuccess()) {
            return ResultWrapper.INSTANCE.failed(HandleLoginFailedUseCase.invoke$default(loginPhoneEmailUseCase.handleLoginFailedUseCase, str3, operationResult.getErrorCode(), null, false, 8, null));
        }
        HandleLoginSuccessUseCase handleLoginSuccessUseCase = loginPhoneEmailUseCase.handleLoginSuccessUseCase;
        LoginToken loginToken = (LoginToken) operationResult.getResult();
        bVar.a = null;
        bVar.b = null;
        bVar.e = 2;
        objInvoke = handleLoginSuccessUseCase.invoke(str3, loginToken, bVar);
        return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
    }

    @Nullable
    public final Object invoke(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super ResultWrapper<LoginSuccess, ? extends LoginFailed>> continuation) {
        if (NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            return AccountExternalsKt.getAccountDelegate().isChineseOnly() ? b(str, str2, continuation) : a(str, str2, continuation);
        }
        return ResultWrapper.INSTANCE.failed(new LoginFailed.NormalMessageError(R.string.account_ui_no_network_connection));
    }
}
