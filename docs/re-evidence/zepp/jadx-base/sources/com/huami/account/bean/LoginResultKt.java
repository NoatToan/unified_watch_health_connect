package com.huami.account.bean;

import com.huami.passport.ErrorCode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¨\u0006\u0003"}, d2 = {"Lcom/huami/passport/ErrorCode;", "Lcom/huami/account/bean/LoginResult$Failed;", "toResult", "accountui_release"}, k = 2, mv = {1, 5, 1})
public final class LoginResultKt {
    @NotNull
    public static final LoginResult.Failed toResult(@Nullable ErrorCode errorCode) {
        LoginResult.Failed.Account account = errorCode == null ? null : new LoginResult.Failed.Account(errorCode);
        return account == null ? new LoginResult.Failed.MissParam("errorCode = null") : account;
    }
}
