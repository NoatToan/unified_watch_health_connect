package com.huami.account.ui.login.viewmodel;

import com.huami.account.bean.LoginResult;
import com.huami.account.service.model.Area;
import com.huami.account.service.model.LoginViewOptions;
import com.huami.account.ui.R;
import com.huami.passport.ErrorCode;
import com.huami.passport.OperationResult;
import com.huami.passport.entity.LoginToken;
import com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H&J\"\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u000fH&J\u001a\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H&J&\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002H&J\u001e\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u0019H&¨\u0006\u001c"}, d2 = {"Lcom/huami/account/ui/login/viewmodel/LoginViewModelContract;", "", "", "provider", "", "showLoginError", "", "res", "Lcom/huami/account/bean/LoginResult$Failed;", "result", "", "handleUnknownFailed", "isShowLoadingDialog", "handleProcessLoginDataSuccess", "accessToken", "Lcom/huami/account/service/model/Area;", BaseDeviceStatusActivity.KEY_AREA, "thirdAuthRegister", "Lcom/huami/passport/entity/LoginToken;", LoginViewOptions.EXTRA_LOGIN_TOKEN, "handleLoginSuccess", "Lcom/huami/passport/ErrorCode;", "error", "specifiedCountryCode", "handleLoginFailed", "Lcom/huami/passport/OperationResult;", "operationResult", "handlePassportResult", "accountui_release"}, k = 1, mv = {1, 5, 1})
public interface LoginViewModelContract {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ void handleLoginFailed$default(LoginViewModelContract loginViewModelContract, String str, ErrorCode errorCode, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleLoginFailed");
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            loginViewModelContract.handleLoginFailed(str, errorCode, str2);
        }

        public static /* synthetic */ void handleUnknownFailed$default(LoginViewModelContract loginViewModelContract, String str, boolean z, int i, LoginResult.Failed failed, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleUnknownFailed");
            }
            if ((i2 & 4) != 0) {
                i = R.string.account_ui_login_failed;
            }
            loginViewModelContract.handleUnknownFailed(str, z, i, failed);
        }
    }

    void handleLoginFailed(@NotNull String provider, @Nullable ErrorCode error, @Nullable String specifiedCountryCode);

    void handleLoginSuccess(@NotNull String provider, @Nullable LoginToken loginToken);

    void handlePassportResult(@NotNull String provider, @NotNull OperationResult<? extends LoginToken> operationResult);

    void handleProcessLoginDataSuccess(boolean isShowLoadingDialog);

    void handleUnknownFailed(@NotNull String provider, boolean showLoginError, int res, @NotNull LoginResult.Failed result);

    void thirdAuthRegister(@NotNull String provider, @Nullable String accessToken, @NotNull Area area);
}
