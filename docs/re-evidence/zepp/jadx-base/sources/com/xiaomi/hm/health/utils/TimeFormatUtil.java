package com.xiaomi.hm.health.utils;

import android.content.Context;
import androidx.annotation.IntRange;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.hmwatchmanager.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/utils/TimeFormatUtil;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "minute", "", "formatMinute", "a", LogUtil.I, "MINUTE_IN_HOUR", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class TimeFormatUtil {

    @NotNull
    public static final TimeFormatUtil INSTANCE = new TimeFormatUtil();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final int MINUTE_IN_HOUR = 60;

    private TimeFormatUtil() {
    }

    @NotNull
    public final String formatMinute(@NotNull Context context, @IntRange(from = 0) int minute) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        int i = minute / 60;
        if (i > 0) {
            sb.append(context.getResources().getQuantityString(R.plurals.time_format_hour, i, Integer.valueOf(i)));
            z = false;
        } else {
            z = true;
        }
        int i2 = minute % 60;
        if (z || i2 > 0) {
            sb.append(context.getResources().getQuantityString(R.plurals.time_format_minute, i2, Integer.valueOf(i2)));
        }
        return sb.toString();
    }
}
