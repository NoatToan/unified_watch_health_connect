package com.huami.account.ui.login.usecase;

import com.huami.account.HMLoginManager;
import com.huami.account.HMProcessLoginDataManager;
import com.huami.account.bean.LoginResult;
import com.huami.account.service.model.LoginViewOptions;
import com.huami.account.ui.R;
import com.huami.account.ui.common.state.ResultWrapper;
import com.huami.account.ui.common.state.StateWrapper;
import com.huami.account.ui.login.state.LoginFailed;
import com.huami.account.ui.login.state.LoginSuccess;
import com.huami.passport.entity.LoginToken;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0086Bø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/huami/account/ui/login/usecase/HandleLoginSuccessUseCase;", "", "", "provider", "Lcom/huami/passport/entity/LoginToken;", LoginViewOptions.EXTRA_LOGIN_TOKEN, "Lcom/huami/account/ui/common/state/ResultWrapper;", "Lcom/huami/account/ui/login/state/LoginSuccess;", "Lcom/huami/account/ui/login/state/LoginFailed;", "Lcom/huami/account/ui/login/state/LoginUiResult;", "a", "(Ljava/lang/String;Lcom/huami/passport/entity/LoginToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "Lcom/huami/account/ui/login/usecase/HandleLoginUnknownErrorUseCase;", "Lcom/huami/account/ui/login/usecase/HandleLoginUnknownErrorUseCase;", "handleLoginUnknownError", "Lcom/huami/account/ui/login/usecase/HandleProcessLoginDataSuccessUseCase;", "b", "Lcom/huami/account/ui/login/usecase/HandleProcessLoginDataSuccessUseCase;", "handleProcessLoginDataSuccessUseCase", "<init>", "(Lcom/huami/account/ui/login/usecase/HandleLoginUnknownErrorUseCase;Lcom/huami/account/ui/login/usecase/HandleProcessLoginDataSuccessUseCase;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class HandleLoginSuccessUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HandleLoginUnknownErrorUseCase handleLoginUnknownError;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final HandleProcessLoginDataSuccessUseCase handleProcessLoginDataSuccessUseCase;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/account/bean/LoginResult;", "kotlin.jvm.PlatformType", "result", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a implements HMProcessLoginDataManager.LoginCallBack {
        public final /* synthetic */ LoginToken a;
        public final /* synthetic */ CancellableContinuation<ResultWrapper<LoginSuccess, ? extends LoginFailed>> b;
        public final /* synthetic */ HandleLoginSuccessUseCase c;
        public final /* synthetic */ String d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(LoginToken loginToken, CancellableContinuation<? super ResultWrapper<LoginSuccess, ? extends LoginFailed>> cancellableContinuation, HandleLoginSuccessUseCase handleLoginSuccessUseCase, String str) {
            this.a = loginToken;
            this.b = cancellableContinuation;
            this.c = handleLoginSuccessUseCase;
            this.d = str;
        }

        @Override // com.huami.account.HMProcessLoginDataManager.LoginCallBack
        public final void onResult(LoginResult loginResult) {
            if (loginResult instanceof LoginResult.Success) {
                HMLoginManager.verifyLoginSuccessHref(this.a);
                CancellableContinuation<ResultWrapper<LoginSuccess, ? extends LoginFailed>> cancellableContinuation = this.b;
                ResultWrapper<LoginSuccess, LoginFailed> resultWrapperInvoke = this.c.handleProcessLoginDataSuccessUseCase.invoke(this.d, true);
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m3845constructorimpl(resultWrapperInvoke));
                return;
            }
            if (loginResult instanceof LoginResult.Failed) {
                CancellableContinuation<ResultWrapper<LoginSuccess, ? extends LoginFailed>> cancellableContinuation2 = this.b;
                StateWrapper.Failed failed = ResultWrapper.INSTANCE.failed(this.c.handleLoginUnknownError.invoke(this.d, true, R.string.account_ui_phone_login_failed, (LoginResult.Failed) loginResult));
                Result.Companion companion2 = Result.Companion;
                cancellableContinuation2.resumeWith(Result.m3845constructorimpl(failed));
            }
        }
    }

    public HandleLoginSuccessUseCase(@NotNull HandleLoginUnknownErrorUseCase handleLoginUnknownErrorUseCase, @NotNull HandleProcessLoginDataSuccessUseCase handleProcessLoginDataSuccessUseCase) {
        this.handleLoginUnknownError = handleLoginUnknownErrorUseCase;
        this.handleProcessLoginDataSuccessUseCase = handleProcessLoginDataSuccessUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(String str, LoginToken loginToken, Continuation<? super ResultWrapper<LoginSuccess, ? extends LoginFailed>> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        HMProcessLoginDataManager.processLoginSuccess(new a(loginToken, cancellableContinuationImpl, this, str));
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Nullable
    public final Object invoke(@NotNull String str, @Nullable LoginToken loginToken, @NotNull Continuation<? super ResultWrapper<LoginSuccess, ? extends LoginFailed>> continuation) {
        return loginToken == null ? ResultWrapper.INSTANCE.failed(LoginFailed.CommonLoginError.INSTANCE) : a(str, loginToken, continuation);
    }
}
