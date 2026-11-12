package com.huami.account.auth.quicklogin;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.auth.entity.LastLoginInfo;
import com.huami.account.auth.repository.LastLoginInfoRepository;
import com.huami.account.bean.LoginResult;
import com.huami.account.service.model.Area;
import com.huami.account.service.model.LoginViewOptions;
import com.huami.account.ui.common.state.StateWrapper;
import com.huami.account.ui.login.state.LoginFailed;
import com.huami.account.ui.login.state.LoginSuccess;
import com.huami.account.ui.login.state.PassportOperationState;
import com.huami.account.ui.login.viewmodel.LoginViewModel;
import com.huami.account.ui.login.viewmodel.LoginViewModelContract;
import com.huami.account.utils.SingleLiveEvent;
import com.huami.passport.ErrorCode;
import com.huami.passport.OperationResult;
import com.huami.passport.entity.LoginToken;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010%\u001a\u00020#\u0012\u0006\u0010(\u001a\u00020&¢\u0006\u0004\bB\u0010CJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J'\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0096\u0001J\u001b\u0010\u0010\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0001J\u001f\u0010\u0013\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011H\u0096\u0001J\u0011\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0096\u0001J+\u0010\u001c\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0096\u0001J#\u0010 \u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0096\u0001J\u0006\u0010!\u001a\u00020\u0003J\u001c\u0010\"\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010'R\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010+R\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020.0-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R)\u00109\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020503j\u0002`6028F@\u0006¢\u0006\u0006\u001a\u0004\b7\u00108R\u0019\u0010;\u001a\b\u0012\u0004\u0012\u00020*028F@\u0006¢\u0006\u0006\u001a\u0004\b:\u00108R\u0019\u0010>\u001a\b\u0012\u0004\u0012\u00020.0-8F@\u0006¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0019\u0010A\u001a\b\u0012\u0004\u0012\u00020?028F@\u0006¢\u0006\u0006\u001a\u0004\b@\u00108¨\u0006D"}, d2 = {"Lcom/huami/account/auth/quicklogin/QuickLoginViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huami/account/ui/login/viewmodel/LoginViewModelContract;", "", "c", "a", "", "username", "b", "provider", "Lcom/huami/passport/ErrorCode;", "error", "specifiedCountryCode", "handleLoginFailed", "Lcom/huami/passport/entity/LoginToken;", LoginViewOptions.EXTRA_LOGIN_TOKEN, "handleLoginSuccess", "Lcom/huami/passport/OperationResult;", "operationResult", "handlePassportResult", "", "isShowLoadingDialog", "handleProcessLoginDataSuccess", "showLoginError", "", "res", "Lcom/huami/account/bean/LoginResult$Failed;", "result", "handleUnknownFailed", "accessToken", "Lcom/huami/account/service/model/Area;", BaseDeviceStatusActivity.KEY_AREA, "thirdAuthRegister", "login", "handleLoginResult", "Lcom/huami/account/auth/repository/LastLoginInfoRepository;", "Lcom/huami/account/auth/repository/LastLoginInfoRepository;", CommonLanguageSettingFragment.KEY_REPO, "Lcom/huami/account/ui/login/viewmodel/LoginViewModel;", "Lcom/huami/account/ui/login/viewmodel/LoginViewModel;", "baseLoginViewModel", "Lcom/huami/account/utils/SingleLiveEvent;", "Lcom/huami/account/auth/quicklogin/QuickLoginUiState$NavigateNormalLogin;", "Lcom/huami/account/utils/SingleLiveEvent;", "_navigateToLogin", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/account/auth/entity/LastLoginInfo;", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/MutableLiveData;", "_lastLoginInfo", "Landroidx/lifecycle/LiveData;", "Lcom/huami/account/ui/common/state/StateWrapper;", "Lcom/huami/account/ui/login/state/LoginSuccess;", "Lcom/huami/account/ui/login/state/LoginFailed;", "Lcom/huami/account/ui/login/state/LoginUiState;", "getUiState", "()Landroidx/lifecycle/LiveData;", "uiState", "getNavigateToLogin", "navigateToLogin", "getLastLoginInfo", "()Landroidx/lifecycle/MutableLiveData;", "lastLoginInfo", "Lcom/huami/account/ui/login/state/PassportOperationState;", "getPassportOperationState", "passportOperationState", "<init>", "(Lcom/huami/account/auth/repository/LastLoginInfoRepository;Lcom/huami/account/ui/login/viewmodel/LoginViewModel;)V", "auth_release"}, k = 1, mv = {1, 5, 1})
public final class QuickLoginViewModel extends ViewModel implements LoginViewModelContract {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LastLoginInfoRepository repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LoginViewModel baseLoginViewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final SingleLiveEvent<QuickLoginUiState.NavigateNormalLogin> _navigateToLogin = new SingleLiveEvent<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<LastLoginInfo> _lastLoginInfo = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "setupLoginInfo: login 信息为空";
        }
    }

    public QuickLoginViewModel(@NotNull LastLoginInfoRepository lastLoginInfoRepository, @NotNull LoginViewModel loginViewModel) {
        this.repo = lastLoginInfoRepository;
        this.baseLoginViewModel = loginViewModel;
        c();
    }

    private final void a() {
        this._navigateToLogin.setValue(new QuickLoginUiState.NavigateNormalLogin(null, 1, null));
    }

    private final void b(String username) {
        this._navigateToLogin.setValue(new QuickLoginUiState.NavigateNormalLogin(username));
    }

    private final void c() {
        LastLoginInfo loginInfo = this.repo.readLoginInfo();
        if (loginInfo != null) {
            this._lastLoginInfo.setValue(loginInfo);
        } else {
            HMLog.info$default(null, a.a, 1, null);
            a();
        }
    }

    @NotNull
    public final MutableLiveData<LastLoginInfo> getLastLoginInfo() {
        return this._lastLoginInfo;
    }

    @NotNull
    public final LiveData<QuickLoginUiState.NavigateNormalLogin> getNavigateToLogin() {
        return this._navigateToLogin;
    }

    @NotNull
    public final LiveData<PassportOperationState> getPassportOperationState() {
        return this.baseLoginViewModel.getPassportOperationState();
    }

    @NotNull
    public final LiveData<StateWrapper<LoginSuccess, LoginFailed>> getUiState() {
        return this.baseLoginViewModel.getLoginUiState();
    }

    @Override // com.huami.account.ui.login.viewmodel.LoginViewModelContract
    public void handleLoginFailed(@NotNull String provider, @Nullable ErrorCode error, @Nullable String specifiedCountryCode) {
        this.baseLoginViewModel.handleLoginFailed(provider, error, specifiedCountryCode);
    }

    public final void handleLoginResult(@NotNull String provider, @NotNull OperationResult<? extends LoginToken> operationResult) {
        if (operationResult.isSuccess()) {
            handleLoginSuccess(provider, operationResult.getResult());
        } else {
            handleLoginFailed(provider, operationResult.getErrorCode(), null);
        }
    }

    @Override // com.huami.account.ui.login.viewmodel.LoginViewModelContract
    public void handleLoginSuccess(@NotNull String provider, @Nullable LoginToken loginToken) {
        this.baseLoginViewModel.handleLoginSuccess(provider, loginToken);
    }

    @Override // com.huami.account.ui.login.viewmodel.LoginViewModelContract
    public void handlePassportResult(@NotNull String provider, @NotNull OperationResult<? extends LoginToken> operationResult) {
        this.baseLoginViewModel.handlePassportResult(provider, operationResult);
    }

    @Override // com.huami.account.ui.login.viewmodel.LoginViewModelContract
    public void handleProcessLoginDataSuccess(boolean isShowLoadingDialog) {
        this.baseLoginViewModel.handleProcessLoginDataSuccess(isShowLoadingDialog);
    }

    @Override // com.huami.account.ui.login.viewmodel.LoginViewModelContract
    public void handleUnknownFailed(@NotNull String provider, boolean showLoginError, int res, @NotNull LoginResult.Failed result) {
        this.baseLoginViewModel.handleUnknownFailed(provider, showLoginError, res, result);
    }

    public final void login() {
        LastLoginInfo value = getLastLoginInfo().getValue();
        if (value instanceof LastLoginInfo.Email) {
            b(((LastLoginInfo.Email) value).getUsername());
            return;
        }
        if (value instanceof LastLoginInfo.Phone) {
            b(((LastLoginInfo.Phone) value).getUsername());
        } else if (value instanceof LastLoginInfo.ThirdPartLogin) {
            this.baseLoginViewModel.thirdAuthLogin(((LastLoginInfo.ThirdPartLogin) value).getProvider());
        } else if (value == null) {
            a();
        }
    }

    @Override // com.huami.account.ui.login.viewmodel.LoginViewModelContract
    public void thirdAuthRegister(@NotNull String provider, @Nullable String accessToken, @NotNull Area area) {
        this.baseLoginViewModel.thirdAuthRegister(provider, accessToken, area);
    }
}
