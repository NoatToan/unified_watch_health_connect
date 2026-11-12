package com.huami.account.ui.register.usecase;

import com.huami.account.HMLoginManager;
import com.huami.account.service.model.Area;
import com.huami.account.ui.R;
import com.huami.account.ui.common.state.ResultWrapper;
import com.huami.account.ui.login.state.LoginFailed;
import com.huami.account.ui.login.state.PassportOperationState;
import com.huami.account.ui.login.state.RegistrationState;
import com.huami.util.net.NetUtil;
import com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\u0002¨\u0006\r"}, d2 = {"Lcom/huami/account/ui/register/usecase/ThirdAuthRegisterUseCase;", "", "", "provider", "accessToken", "Lcom/huami/account/service/model/Area;", BaseDeviceStatusActivity.KEY_AREA, "Lcom/huami/account/ui/common/state/ResultWrapper;", "Lcom/huami/account/ui/login/state/PassportOperationState;", "Lcom/huami/account/ui/login/state/LoginFailed;", "invoke", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class ThirdAuthRegisterUseCase {
    @NotNull
    public final ResultWrapper<PassportOperationState, LoginFailed> invoke(@NotNull String provider, @Nullable String accessToken, @NotNull Area area) {
        if (!NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            return ResultWrapper.INSTANCE.failed(new LoginFailed.NormalMessageError(R.string.no_network_connection));
        }
        HMLoginManager.initAccountManager();
        return accessToken == null || accessToken.length() == 0 ? ResultWrapper.INSTANCE.success(new RegistrationState.RegistrationBase(provider, area.getValue(), area.getSubAreaValue())) : ResultWrapper.INSTANCE.success(new RegistrationState.RegistrationV2(provider, area.getValue(), area.getSubAreaValue(), accessToken));
    }
}
