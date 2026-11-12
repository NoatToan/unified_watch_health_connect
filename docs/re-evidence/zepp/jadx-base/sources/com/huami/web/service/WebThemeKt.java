package com.huami.web.service;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0006"}, d2 = {"Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "a", "", "getWebThemeMode", "service_release"}, k = 2, mv = {1, 5, 1})
public final class WebThemeKt {
    private static final boolean a(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    @NotNull
    public static final String getWebThemeMode(@NotNull Context context) {
        return a(context) ? "THEME_DARK" : "THEME_LIGHT";
    }
}
