package com.huami.account.ui.login.usecase;

import com.huami.account.AccountExternalsKt;
import com.huami.account.bean.LoginResult;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.account.ui.R;
import com.huami.account.ui.login.LoginActivity;
import com.huami.account.ui.login.state.LoginFailed;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.passport.Keeper;
import com.huami.tools.log.HMLog;
import com.huami.util.net.NetUtil;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086\u0002¨\u0006\u0010"}, d2 = {"Lcom/huami/account/ui/login/usecase/HandleLoginUnknownErrorUseCase;", "", "", "provider", "", "a", "", "showLoginErrorFragment", "", "res", "Lcom/huami/account/bean/LoginResult$Failed;", "result", "Lcom/huami/account/ui/login/state/LoginFailed;", "invoke", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class HandleLoginUnknownErrorUseCase {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ LoginResult.Failed a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LoginResult.Failed failed) {
            super(0);
            this.a = failed;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "登录失败未知错误：" + this.a;
        }
    }

    private final void a(String provider) {
        if (Intrinsics.areEqual("wechat", provider)) {
            Analytics.recordEvent(new CountEventBuilder("Login_Result").setValue("WeixinFail"));
        } else if (Intrinsics.areEqual("xiaomi", provider)) {
            Analytics.recordEvent(new CountEventBuilder("Login_Result").setValue("XiaomiFail"));
        }
    }

    public static /* synthetic */ LoginFailed invoke$default(HandleLoginUnknownErrorUseCase handleLoginUnknownErrorUseCase, String str, boolean z, int i, LoginResult.Failed failed, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = R.string.account_ui_login_failed;
        }
        return handleLoginUnknownErrorUseCase.invoke(str, z, i, failed);
    }

    @NotNull
    public final LoginFailed invoke(@NotNull String provider, boolean showLoginErrorFragment, int res, @NotNull LoginResult.Failed result) {
        String string;
        if (AccountExternalsKt.getConfigDelegate().debug()) {
            string = AccountExternalsKt.getAppContext().getString(res) + "\n" + result.getCode();
        } else {
            string = AccountExternalsKt.getAppContext().getString(res);
        }
        HMLog.info(LoginActivity.TAG, new a(result));
        Keeper.clearToken(AccountExternalsKt.getAppContext());
        HMAccountKeeper.INSTANCE.keepLoginData(null, null, null);
        a(provider);
        return (showLoginErrorFragment && NetUtil.INSTANCE.networkInfo().isNetworkConnect()) ? LoginFailed.CommonLoginError.INSTANCE : new LoginFailed.NormalMessageError(string);
    }
}
