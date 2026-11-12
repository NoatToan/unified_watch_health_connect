package com.huami.account.di;

import com.huami.account.service.AccountService;
import com.huami.account.utils.AccountHelper;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¨\u0006\u0003"}, d2 = {"Lcom/huami/account/service/AccountService;", "", "getCurrentAccountDesc", "accountui_release"}, k = 2, mv = {1, 5, 1})
public final class AccountServiceExtImplKt {
    @Deprecated(message = "", replaceWith = @ReplaceWith(expression = "AccountHelper.getCurrentAccountDesc()", imports = {"com.huami.account.utils.AccountHelper"}))
    @Nullable
    public static final String getCurrentAccountDesc(@NotNull AccountService accountService) {
        return AccountHelper.INSTANCE.getCurrentAccountDesc();
    }
}
