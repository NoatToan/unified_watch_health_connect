package com.huami.account.di;

import androidx.exifinterface.media.ExifInterface;
import com.huami.account.AccountExternalContainer;
import com.huami.account.service.exception.LoginInfoInvalidException;
import com.huami.account.service.model.LoginViewOptions;
import com.huami.passport.Keeper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0015\u0010\n\u001a\u0004\u0018\u00010\u00078F@\u0006¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/huami/account/di/LoginToken;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "nullableValue", "checkLoginState", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lcom/huami/passport/entity/LoginToken;", "getLoginToken", "()Lcom/huami/passport/entity/LoginToken;", LoginViewOptions.EXTRA_LOGIN_TOKEN, "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class LoginToken {

    @NotNull
    public static final LoginToken INSTANCE = new LoginToken();

    private LoginToken() {
    }

    public final <T> T checkLoginState(@NotNull Function0<? extends T> nullableValue) {
        T tInvoke = nullableValue.invoke();
        if (tInvoke != null) {
            return tInvoke;
        }
        throw new LoginInfoInvalidException();
    }

    @Nullable
    public final com.huami.passport.entity.LoginToken getLoginToken() {
        return Keeper.getTokenCache(AccountExternalContainer.INSTANCE.getAppContext());
    }
}
