package com.huami.heartrate.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.TypedValue;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.Constant;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002\u001a\b\u0010\t\u001a\u00020\bH\u0002\u001a\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¨\u0006\u000e"}, d2 = {"Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", Constant.PAI_KEY_DAILY_PAI, "", "dpToPx", "sp", "spToPx", "", "a", "", "s1", "s2", "stringFormat", "heartrate_release"}, k = 2, mv = {1, 5, 1})
public final class UIUtilsKt {
    private static final boolean a() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    public static final int dpToPx(@NotNull Context context, float f) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static final int spToPx(@NotNull Context context, float f) {
        return (int) TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }

    @NotNull
    public static final String stringFormat(@NotNull String str, @NotNull String str2) {
        StringBuilder sb;
        if (a()) {
            sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
        } else {
            sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
        }
        return sb.toString();
    }
}
