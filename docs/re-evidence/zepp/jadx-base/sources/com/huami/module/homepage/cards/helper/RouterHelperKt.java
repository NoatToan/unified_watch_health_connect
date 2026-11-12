package com.huami.module.homepage.cards.helper;

import android.content.Context;
import com.chenenyu.router.IRouter;
import com.chenenyu.router.Router;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aW\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022*\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00050\u0004\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "path", "", "Lkotlin/Pair;", "", "param", "interceptors", "", "executeRoute", "(Landroid/content/Context;Ljava/lang/String;[Lkotlin/Pair;Ljava/lang/String;)V", "homePage_release"}, k = 2, mv = {1, 5, 1})
public final class RouterHelperKt {
    public static final void executeRoute(@NotNull Context context, @NotNull String str, @NotNull Pair<String, ? extends Object>[] pairArr, @Nullable String str2) {
        IRouter iRouterBuild = Router.build(str);
        for (Pair<String, ? extends Object> pair : pairArr) {
            iRouterBuild.with(pair.getFirst(), pair.getSecond());
        }
        if (str2 != null) {
            iRouterBuild.addInterceptors(str2);
        }
        iRouterBuild.go(context);
    }

    public static /* synthetic */ void executeRoute$default(Context context, String str, Pair[] pairArr, String str2, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        executeRoute(context, str, pairArr, str2);
    }
}
