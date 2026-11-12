package com.huami.account.ui.login.usecase;

import com.huami.account.HMLoginManager;
import com.huami.account.ui.R;
import com.huami.account.ui.areas.SelectAreaManager;
import com.huami.account.ui.common.state.ResultWrapper;
import com.huami.account.ui.login.state.LoginFailed;
import com.huami.account.ui.login.state.ThirdPartAuthState;
import com.huami.util.net.NetUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002¨\u0006\n"}, d2 = {"Lcom/huami/account/ui/login/usecase/LoginThirdAuthUseCase;", "", "", "provider", "Lcom/huami/account/ui/common/state/ResultWrapper;", "Lcom/huami/account/ui/login/state/ThirdPartAuthState;", "Lcom/huami/account/ui/login/state/LoginFailed;", "invoke", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class LoginThirdAuthUseCase {
    @NotNull
    public final ResultWrapper<ThirdPartAuthState, LoginFailed> invoke(@NotNull String provider) {
        if (!NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            return ResultWrapper.INSTANCE.failed(new LoginFailed.NormalMessageError(R.string.account_ui_no_network_connection));
        }
        HMLoginManager.initAccountManager();
        return ResultWrapper.INSTANCE.success(new ThirdPartAuthState(provider, SelectAreaManager.INSTANCE.getArea().getValue()));
    }
}
