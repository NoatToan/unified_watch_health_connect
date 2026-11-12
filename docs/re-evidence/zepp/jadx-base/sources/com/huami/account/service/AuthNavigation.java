package com.huami.account.service;

import android.content.Context;
import android.os.Bundle;
import com.huami.account.service.model.LoginViewOptions;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J$\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¨\u0006\u000b"}, d2 = {"Lcom/huami/account/service/AuthNavigation;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/account/service/model/LoginViewOptions;", "options", "Landroid/os/Bundle;", "extras", "", "navigateToNormalLogin", "navigateToLogin", "service_release"}, k = 1, mv = {1, 5, 1})
public interface AuthNavigation {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ void navigateToLogin$default(AuthNavigation authNavigation, Context context, LoginViewOptions loginViewOptions, Bundle bundle, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToLogin");
            }
            if ((i & 4) != 0) {
                bundle = null;
            }
            authNavigation.navigateToLogin(context, loginViewOptions, bundle);
        }

        public static /* synthetic */ void navigateToNormalLogin$default(AuthNavigation authNavigation, Context context, LoginViewOptions loginViewOptions, Bundle bundle, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToNormalLogin");
            }
            if ((i & 4) != 0) {
                bundle = null;
            }
            authNavigation.navigateToNormalLogin(context, loginViewOptions, bundle);
        }
    }

    void navigateToLogin(@NotNull Context context, @NotNull LoginViewOptions options, @Nullable Bundle extras);

    void navigateToNormalLogin(@NotNull Context context, @NotNull LoginViewOptions options, @Nullable Bundle extras);
}
