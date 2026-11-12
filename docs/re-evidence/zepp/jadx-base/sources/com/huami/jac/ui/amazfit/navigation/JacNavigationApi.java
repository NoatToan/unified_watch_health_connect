package com.huami.jac.ui.amazfit.navigation;

import android.content.Context;
import androidx.p010navigation.NavController;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J*\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H&J*\u0010\f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H&J2\u0010\u0011\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007H&J%\u0010\u0013\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H&J\u001a\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\rH&¨\u0006\u001b"}, d2 = {"Lcom/huami/jac/ui/amazfit/navigation/JacNavigationApi;", "", "Landroidx/navigation/NavController;", "navController", "", "hostToDetail", "hostToNoCard", "", "action", "token", "keyToken", "hostToCheck", "checkToProgress", "", "isSuccess", "errorMsg", "errorCode", "progressToResult", "backToXp", "resultToDetail", "(Landroidx/navigation/NavController;Ljava/lang/Boolean;)V", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "toJacApp", "toJacAppKeyList", "success", "toJacAppCardManager", "jac-ui-amazfit_release"}, k = 1, mv = {1, 5, 1})
public interface JacNavigationApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ void progressToResult$default(JacNavigationApi jacNavigationApi, NavController navController, boolean z, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: progressToResult");
            }
            if ((i & 4) != 0) {
                str = null;
            }
            if ((i & 8) != 0) {
                str2 = null;
            }
            jacNavigationApi.progressToResult(navController, z, str, str2);
        }

        public static /* synthetic */ void resultToDetail$default(JacNavigationApi jacNavigationApi, NavController navController, Boolean bool, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resultToDetail");
            }
            if ((i & 2) != 0) {
                bool = Boolean.FALSE;
            }
            jacNavigationApi.resultToDetail(navController, bool);
        }

        public static /* synthetic */ void toJacAppCardManager$default(JacNavigationApi jacNavigationApi, Context context, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toJacAppCardManager");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            jacNavigationApi.toJacAppCardManager(context, z);
        }
    }

    void checkToProgress(@Nullable NavController navController, @NotNull String action, @NotNull String token, @NotNull String keyToken);

    void hostToCheck(@Nullable NavController navController, @NotNull String action, @NotNull String token, @NotNull String keyToken);

    void hostToDetail(@Nullable NavController navController);

    void hostToNoCard(@Nullable NavController navController);

    void progressToResult(@Nullable NavController navController, boolean isSuccess, @Nullable String errorMsg, @Nullable String errorCode);

    void resultToDetail(@Nullable NavController navController, @Nullable Boolean backToXp);

    void toJacApp(@NotNull Context context, @NotNull String action);

    void toJacAppCardManager(@NotNull Context context, boolean success);

    void toJacAppKeyList(@NotNull Context context);
}
