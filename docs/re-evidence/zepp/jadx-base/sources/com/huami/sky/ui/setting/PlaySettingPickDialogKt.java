package com.huami.sky.ui.setting;

import android.content.Context;
import com.huami.sky.ui.R;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¨\u0006\u0006"}, d2 = {"Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "minutes", "", "formatMinutesToString", "sky-ui_release"}, k = 2, mv = {1, 5, 1})
public final class PlaySettingPickDialogKt {
    @NotNull
    public static final String formatMinutesToString(@NotNull Context context, int i) {
        if (i == -1) {
            return context.getString(R.string.sky_pick_time_no_limit);
        }
        if (i <= 90) {
            return context.getString(R.string.sky_format_time_minutes, String.valueOf(i));
        }
        return i > 90 ? context.getString(R.string.sky_format_time_hour, String.valueOf(i / 60)) : "";
    }
}
