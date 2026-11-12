package com.huami.account.auth;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.huami.account.auth.quicklogin.QuickLoginActivity;
import com.huami.account.auth.repository.LastLoginInfoRepository;
import com.huami.account.service.AuthNavigation;
import com.huami.account.service.model.LoginViewOptions;
import com.huami.account.ui.login.LoginActivity;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\"\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/huami/account/auth/AuthNavigationImpl;", "Lcom/huami/account/service/AuthNavigation;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/account/service/model/LoginViewOptions;", "options", "Landroid/os/Bundle;", "extras", "", "navigateToNormalLogin", "navigateToLogin", "Lcom/huami/account/auth/repository/LastLoginInfoRepository;", "a", "Lcom/huami/account/auth/repository/LastLoginInfoRepository;", "repository", "<init>", "(Lcom/huami/account/auth/repository/LastLoginInfoRepository;)V", "auth_release"}, k = 1, mv = {1, 5, 1})
public final class AuthNavigationImpl implements AuthNavigation {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LastLoginInfoRepository repository;

    public AuthNavigationImpl(@NotNull LastLoginInfoRepository lastLoginInfoRepository) {
        this.repository = lastLoginInfoRepository;
    }

    @Override // com.huami.account.service.AuthNavigation
    public void navigateToLogin(@NotNull Context context, @NotNull LoginViewOptions options, @Nullable Bundle extras) {
        if (this.repository.readLoginInfo() != null) {
            QuickLoginActivity.INSTANCE.start(context, options, extras);
        } else {
            navigateToNormalLogin(context, options, extras);
        }
    }

    @Override // com.huami.account.service.AuthNavigation
    public void navigateToNormalLogin(@NotNull Context context, @NotNull LoginViewOptions options, @Nullable Bundle extras) {
        Intent intent = new Intent(context, (Class<?>) LoginActivity.class);
        intent.putExtras(options.toExtras());
        intent.addFlags(67108864);
        context.startActivity(intent);
    }
}
