package com.huami.account.ui.register;

import androidx.fragment.app.FragmentActivity;
import com.huami.account.HMLoginManager;
import com.huami.account.HMProcessLoginDataManager;
import com.huami.account.bean.LoginResult;
import com.huami.account.service.model.LoginViewOptions;
import com.huami.account.ui.common.LoadingDialogHelper;
import com.huami.account.ui.register.EmailRegisterFormFragment$mLoginCallback$1;
import com.huami.account.usecase.RegisterFailedCustomTipUseCase;
import com.huami.passport.ErrorCode;
import com.huami.passport.IAccount;
import com.huami.passport.entity.LoginToken;
import com.huami.tools.log.HMLog;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"com/huami/account/ui/register/EmailRegisterFormFragment$mLoginCallback$1", "Lcom/huami/passport/IAccount$Callback;", "Lcom/huami/passport/entity/LoginToken;", "Lcom/huami/passport/ErrorCode;", LoginViewOptions.EXTRA_LOGIN_TOKEN, "", "onSuccess", "errorCode", "onError", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class EmailRegisterFormFragment$mLoginCallback$1 implements IAccount.Callback<LoginToken, ErrorCode> {
    public final /* synthetic */ EmailRegisterFormFragment a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public final /* synthetic */ EmailRegisterFormFragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EmailRegisterFormFragment emailRegisterFormFragment) {
            super(0);
            this.a = emailRegisterFormFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.u();
        }
    }

    public EmailRegisterFormFragment$mLoginCallback$1(EmailRegisterFormFragment emailRegisterFormFragment) {
        this.a = emailRegisterFormFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(EmailRegisterFormFragment emailRegisterFormFragment, LoginToken loginToken, LoginResult loginResult) {
        FragmentActivity activity = emailRegisterFormFragment.getActivity();
        if ((activity instanceof RegisterActivity) && !((RegisterActivity) activity).isFinishing()) {
            if (!loginResult.isSuccess()) {
                emailRegisterFormFragment.u();
                return;
            }
            HMLoginManager.verifyLoginSuccessHref(loginToken);
            FragmentActivity activity2 = emailRegisterFormFragment.getActivity();
            Objects.requireNonNull(activity2, "null cannot be cast to non-null type com.huami.account.ui.register.RegisterActivity");
            ((RegisterActivity) activity2).loginSuccess$accountui_release();
        }
    }

    @Override // com.huami.passport.IAccount.Callback
    public void onError(@NotNull ErrorCode errorCode) {
        LoadingDialogHelper dialog$accountui_release;
        HMLog.i("EmailRegisterFragment", "onError:" + errorCode, new Object[0]);
        if (!Intrinsics.areEqual(errorCode.getErrorCode(), "0129")) {
            this.a.u();
            return;
        }
        FragmentActivity activity = this.a.getActivity();
        RegisterActivity registerActivity = activity instanceof RegisterActivity ? (RegisterActivity) activity : null;
        if (registerActivity != null && (dialog$accountui_release = registerActivity.getDialog$accountui_release()) != null) {
            dialog$accountui_release.hideDialog();
        }
        RegisterFailedCustomTipUseCase.execute(this.a.getChildFragmentManager(), errorCode, new a(this.a));
    }

    @Override // com.huami.passport.IAccount.Callback
    public void onSuccess(@NotNull final LoginToken loginToken) {
        final EmailRegisterFormFragment emailRegisterFormFragment = this.a;
        HMProcessLoginDataManager.processRegisterLoginSuccess(new HMProcessLoginDataManager.LoginCallBack() { // from class: xk1
            @Override // com.huami.account.HMProcessLoginDataManager.LoginCallBack
            public final void onResult(LoginResult loginResult) {
                EmailRegisterFormFragment$mLoginCallback$1.b(emailRegisterFormFragment, loginToken, loginResult);
            }
        });
    }
}
