package com.huami.xiaopeng.ui.amazfit.navigation;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.p010navigation.NavController;
import com.huami.tools.analytics.DbUtils;
import com.huami.xiaopeng.ui.amazfit.fragment.CarCheckFragmentDirections;
import com.huami.xiaopeng.ui.amazfit.fragment.CarHostFragmentDirections;
import com.huami.xiaopeng.ui.amazfit.fragment.CardProgressFragmentDirections;
import com.huami.xiaopeng.ui.amazfit.fragment.CardResultFragmentDirections;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016J.\u0010\u0011\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0016J#\u0010\u0013\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\rH\u0016¨\u0006\u001d"}, d2 = {"Lcom/huami/xiaopeng/ui/amazfit/navigation/XpNavigationImpl;", "Lcom/huami/xiaopeng/ui/amazfit/navigation/XpNavigationApi;", "Landroidx/navigation/NavController;", "navController", "", "hostToDetail", "hostToNoCard", "", "action", "token", "keyToken", "hostToCheck", "checkToProgress", "", "isSuccess", "errorMsg", "errorCode", "progressToResult", "backToXp", "resultToDetail", "(Landroidx/navigation/NavController;Ljava/lang/Boolean;)V", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "toXpApp", "toXpAppKeyList", "success", "toXpAppCardManager", "<init>", "()V", "xiaopeng-ui-amazfit_release"}, k = 1, mv = {1, 5, 1})
public final class XpNavigationImpl implements XpNavigationApi {
    @Override // com.huami.xiaopeng.ui.amazfit.navigation.XpNavigationApi
    public void checkToProgress(@Nullable NavController navController, @NotNull String action, @NotNull String token, @NotNull String keyToken) {
        if (navController == null) {
            return;
        }
        navController.navigate(CarCheckFragmentDirections.toProgress(action, token, keyToken));
    }

    @Override // com.huami.xiaopeng.ui.amazfit.navigation.XpNavigationApi
    public void hostToCheck(@Nullable NavController navController, @NotNull String action, @NotNull String token, @NotNull String keyToken) {
        if (navController == null) {
            return;
        }
        navController.navigate(CarHostFragmentDirections.toCheck(action, token, keyToken));
    }

    @Override // com.huami.xiaopeng.ui.amazfit.navigation.XpNavigationApi
    public void hostToDetail(@Nullable NavController navController) {
        if (navController == null) {
            return;
        }
        navController.navigate(CarHostFragmentDirections.toDetail());
    }

    @Override // com.huami.xiaopeng.ui.amazfit.navigation.XpNavigationApi
    public void hostToNoCard(@Nullable NavController navController) {
        if (navController == null) {
            return;
        }
        navController.navigate(CarHostFragmentDirections.toNoCard());
    }

    @Override // com.huami.xiaopeng.ui.amazfit.navigation.XpNavigationApi
    public void progressToResult(@Nullable NavController navController, boolean isSuccess, @Nullable String errorMsg, @Nullable String errorCode) {
        if (navController == null) {
            return;
        }
        CardProgressFragmentDirections.ToResult result = CardProgressFragmentDirections.toResult(isSuccess);
        result.setErrorMsg(errorMsg);
        result.setErrorCode(errorCode);
        Unit unit = Unit.INSTANCE;
        navController.navigate(result);
    }

    @Override // com.huami.xiaopeng.ui.amazfit.navigation.XpNavigationApi
    public void resultToDetail(@Nullable NavController navController, @Nullable Boolean backToXp) {
        if (navController == null) {
            return;
        }
        CardResultFragmentDirections.ToDetail detail = CardResultFragmentDirections.toDetail();
        detail.setBackToXp(backToXp == null ? false : backToXp.booleanValue());
        Unit unit = Unit.INSTANCE;
        navController.navigate(detail);
    }

    @Override // com.huami.xiaopeng.ui.amazfit.navigation.XpNavigationApi
    public void toXpApp(@NotNull Context context, @NotNull String action) {
        Intent intent = new Intent();
        intent.setData(Uri.parse("xiaopeng://virtual/carselect?action=" + action + "&product_id=dd36783e7cb26907&type=101"));
        context.startActivity(intent);
    }

    @Override // com.huami.xiaopeng.ui.amazfit.navigation.XpNavigationApi
    public void toXpAppCardManager(@NotNull Context context, boolean success) {
        String str = success ? "xiaopeng://virtual/action?action=create&result=1" : "xiaopeng://virtual/action?action=create&result=0";
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

    @Override // com.huami.xiaopeng.ui.amazfit.navigation.XpNavigationApi
    public void toXpAppKeyList(@NotNull Context context) {
        Intent intent = new Intent();
        intent.setData(Uri.parse("xiaopeng://virtual/cardcheck"));
        context.startActivity(intent);
    }
}
