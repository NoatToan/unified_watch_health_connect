package com.huami.account.ui.login.usecase;

import com.huami.account.AccountExternalsKt;
import com.huami.account.HMLoginManager;
import com.huami.account.XiaomiTokenMananger;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.account.ui.common.state.ResultWrapper;
import com.huami.account.ui.login.state.LoginFailed;
import com.huami.account.ui.login.state.LoginSuccess;
import com.huami.passport.AccountManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0002J)\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002R\u0019\u0010\u0011\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/account/ui/login/usecase/HandleProcessLoginDataSuccessUseCase;", "", "", "a", "", "provider", "", "isShowSuccessDialog", "Lcom/huami/account/ui/common/state/ResultWrapper;", "Lcom/huami/account/ui/login/state/LoginSuccess;", "Lcom/huami/account/ui/login/state/LoginFailed;", "Lcom/huami/account/ui/login/state/LoginUiResult;", "invoke", "Lcom/huami/passport/AccountManager;", "Lcom/huami/passport/AccountManager;", "getAccountManager", "()Lcom/huami/passport/AccountManager;", "accountManager", "<init>", "(Lcom/huami/passport/AccountManager;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class HandleProcessLoginDataSuccessUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AccountManager accountManager;

    public HandleProcessLoginDataSuccessUseCase(@NotNull AccountManager accountManager) {
        this.accountManager = accountManager;
    }

    private final void a() {
        AccountExternalsKt.getAccountDelegate().setActiveHistoryLogin();
        HMAccountKeeper.INSTANCE.setLastLoginProvider(this.accountManager.getProvider());
    }

    @NotNull
    public final AccountManager getAccountManager() {
        return this.accountManager;
    }

    @NotNull
    public final ResultWrapper<LoginSuccess, LoginFailed> invoke(@NotNull String provider, boolean isShowSuccessDialog) {
        ResultWrapper<LoginSuccess, LoginFailed> resultWrapperFailed;
        if (HMLoginManager.isExistingUser()) {
            resultWrapperFailed = ResultWrapper.INSTANCE.success(new LoginSuccess(provider, false, isShowSuccessDialog));
        } else if (HMLoginManager.isNewUser()) {
            HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
            hMPersonInfo.getUserInfo().setAvatar(AccountManager.getDefault(AccountExternalsKt.getAppContext()).getUserInfo().getAvatar());
            hMPersonInfo.saveInfoAsync();
            resultWrapperFailed = ResultWrapper.INSTANCE.success(new LoginSuccess(provider, true, isShowSuccessDialog));
        } else {
            resultWrapperFailed = ResultWrapper.INSTANCE.failed(new LoginFailed.IgnoredError("登录后，既不是新用户也不是存量用户"));
        }
        HMLoginManager.saveLoginCountryCode();
        XiaomiTokenMananger.saveXiaomiTokenWhenLogin();
        a();
        return resultWrapperFailed;
    }
}
