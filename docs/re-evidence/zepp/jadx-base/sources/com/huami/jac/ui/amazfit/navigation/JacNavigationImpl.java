package com.huami.jac.ui.amazfit.navigation;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.p010navigation.NavController;
import com.huami.jac.ui.amazfit.fragment.JacCarCheckFragmentDirections;
import com.huami.jac.ui.amazfit.fragment.JacCarHostFragmentDirections;
import com.huami.jac.ui.amazfit.fragment.JacCardProgressFragmentDirections;
import com.huami.jac.ui.amazfit.fragment.JacCardResultFragmentDirections;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016J.\u0010\u0011\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0016J#\u0010\u0013\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\rH\u0016¨\u0006\u001e"}, d2 = {"Lcom/huami/jac/ui/amazfit/navigation/JacNavigationImpl;", "Lcom/huami/jac/ui/amazfit/navigation/JacNavigationApi;", "Landroidx/navigation/NavController;", "navController", "", "hostToDetail", "hostToNoCard", "", "action", "token", "keyToken", "hostToCheck", "checkToProgress", "", "isSuccess", "errorMsg", "errorCode", "progressToResult", "backToXp", "resultToDetail", "(Landroidx/navigation/NavController;Ljava/lang/Boolean;)V", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "toJacApp", "toJacAppKeyList", "success", "toJacAppCardManager", "<init>", "()V", "Companion", "jac-ui-amazfit_release"}, k = 1, mv = {1, 5, 1})
public final class JacNavigationImpl implements JacNavigationApi {

    @NotNull
    public static final String TAG = "JacNavigationImpl";

    @Override // com.huami.jac.ui.amazfit.navigation.JacNavigationApi
    public void checkToProgress(@Nullable NavController navController, @NotNull String action, @NotNull String token, @NotNull String keyToken) {
        HMLog.w(TAG, "---checkToProgress " + action + " " + token + " " + keyToken, new Object[0]);
        if (navController == null) {
            return;
        }
        navController.navigate(JacCarCheckFragmentDirections.toProgress(action, token, keyToken));
    }

    @Override // com.huami.jac.ui.amazfit.navigation.JacNavigationApi
    public void hostToCheck(@Nullable NavController navController, @NotNull String action, @NotNull String token, @NotNull String keyToken) {
        HMLog.w(TAG, "---hostToCheck " + action + " " + token + " " + keyToken, new Object[0]);
        if (navController == null) {
            return;
        }
        navController.navigate(JacCarHostFragmentDirections.toCheck(action, token, keyToken));
    }

    @Override // com.huami.jac.ui.amazfit.navigation.JacNavigationApi
    public void hostToDetail(@Nullable NavController navController) {
        HMLog.w(TAG, "---hostToDetail", new Object[0]);
        if (navController == null) {
            return;
        }
        navController.navigate(JacCarHostFragmentDirections.toDetail());
    }

    @Override // com.huami.jac.ui.amazfit.navigation.JacNavigationApi
    public void hostToNoCard(@Nullable NavController navController) {
        HMLog.w(TAG, "---hostToNoCard", new Object[0]);
        if (navController == null) {
            return;
        }
        navController.navigate(JacCarHostFragmentDirections.toNoCard());
    }

    @Override // com.huami.jac.ui.amazfit.navigation.JacNavigationApi
    public void progressToResult(@Nullable NavController navController, boolean isSuccess, @Nullable String errorMsg, @Nullable String errorCode) {
        HMLog.w(TAG, "---progressToResult " + errorMsg + " " + errorCode + " ", new Object[0]);
        if (navController == null) {
            return;
        }
        JacCardProgressFragmentDirections.ToResult result = JacCardProgressFragmentDirections.toResult(isSuccess);
        result.setErrorMsg(errorMsg);
        result.setErrorCode(errorCode);
        Unit unit = Unit.INSTANCE;
        navController.navigate(result);
    }

    @Override // com.huami.jac.ui.amazfit.navigation.JacNavigationApi
    public void resultToDetail(@Nullable NavController navController, @Nullable Boolean backToXp) {
        HMLog.w(TAG, "---resultToDetail ", new Object[0]);
        if (navController == null) {
            return;
        }
        JacCardResultFragmentDirections.ToDetail detail = JacCardResultFragmentDirections.toDetail();
        detail.setBackToJac(backToXp != null ? backToXp.booleanValue() : false);
        Unit unit = Unit.INSTANCE;
        navController.navigate(detail);
    }

    @Override // com.huami.jac.ui.amazfit.navigation.JacNavigationApi
    public void toJacApp(@NotNull Context context, @NotNull String action) {
        Intent intent = new Intent();
        intent.setData(Uri.parse("jianghuai://virtual/carselect?action=" + action + "&product_id=xxx&type=xxx"));
        context.startActivity(intent);
    }

    @Override // com.huami.jac.ui.amazfit.navigation.JacNavigationApi
    public void toJacAppCardManager(@NotNull Context context, boolean success) {
        String str = success ? "jianghuai://virtual/action?action=create&result=1" : "jianghuai://virtual/action?action=create&result=0";
        try {
            Result.Companion companion = Result.Companion;
            Intent intent = new Intent();
            intent.setData(Uri.parse(str));
            context.startActivity(intent);
            Result.m3845constructorimpl(intent);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // com.huami.jac.ui.amazfit.navigation.JacNavigationApi
    public void toJacAppKeyList(@NotNull Context context) {
        Intent intent = new Intent();
        intent.setData(Uri.parse("jianghuai://virtual/cardcheck"));
        context.startActivity(intent);
    }
}
