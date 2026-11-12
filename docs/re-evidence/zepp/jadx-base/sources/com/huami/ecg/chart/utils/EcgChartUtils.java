package com.huami.ecg.chart.utils;

import android.content.Context;
import com.huami.ecg.chart.R;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/huami/ecg/chart/utils/EcgChartUtils;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "second", "", "secondToTime", "<init>", "()V", "ecg-chart_release"}, k = 1, mv = {1, 4, 1})
public final class EcgChartUtils {

    @NotNull
    public static final EcgChartUtils INSTANCE = new EcgChartUtils();

    private EcgChartUtils() {
    }

    @Nullable
    public final String secondToTime(@NotNull Context context, long second) {
        long j = 86400;
        long j2 = second / j;
        long j3 = second % j;
        long j4 = 3600;
        long j5 = j3 / j4;
        long j6 = j3 % j4;
        long j7 = 60;
        long j8 = j6 / j7;
        long j9 = j6 % j7;
        String string = context.getString(R.string.ecg_pdf_day);
        String string2 = context.getString(R.string.ecg_pdf_hour);
        String string3 = context.getString(R.string.ecg_pdf_min);
        String string4 = context.getString(R.string.ecg_pdf_second);
        if (j2 > 0) {
            return j2 + string + j5 + string2 + j8 + string3 + j9 + string4;
        }
        if (j5 > 0) {
            return j5 + string2 + j8 + string3 + j9 + string4;
        }
        if (j8 <= 0) {
            return j9 + string4;
        }
        return j8 + string3 + j9 + string4;
    }
}
