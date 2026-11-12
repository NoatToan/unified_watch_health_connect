package com.huami.hmdateformat.timeinterval;

import android.content.Context;
import android.text.format.DateUtils;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¨\u0006\u000e"}, d2 = {"Lcom/huami/hmdateformat/timeinterval/HMDataIntervalFormat;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "startMillis", "endMillis", "Lcom/huami/hmdateformat/timeinterval/HMDataIntervalFormat$Pattern;", "pattern", "", "getTimeRange", "<init>", "()V", "Pattern", "library_release"}, k = 1, mv = {1, 5, 1})
public final class HMDataIntervalFormat {

    @NotNull
    public static final HMDataIntervalFormat INSTANCE = new HMDataIntervalFormat();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/huami/hmdateformat/timeinterval/HMDataIntervalFormat$Pattern;", "", "", "value", LogUtil.I, "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "FORMAT_SHOW_TIME", "FORMAT_SHOW_WEEKDAY", "FORMAT_SHOW_YEAR", "FORMAT_SHOW_DATE", "FORMAT_NO_MONTH_DAY", "FORMAT_ABBREV_MONTH", "FORMAT_NUMERIC_DATE", "library_release"}, k = 1, mv = {1, 5, 1})
    public enum Pattern {
        FORMAT_SHOW_TIME(1),
        FORMAT_SHOW_WEEKDAY(2),
        FORMAT_SHOW_YEAR(4),
        FORMAT_SHOW_DATE(16),
        FORMAT_NO_MONTH_DAY(32),
        FORMAT_ABBREV_MONTH(65536),
        FORMAT_NUMERIC_DATE(131072);

        private final int value;

        Pattern(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    private HMDataIntervalFormat() {
    }

    @NotNull
    public final String getTimeRange(@NotNull Context context, long startMillis, long endMillis, @NotNull Pattern pattern) {
        return DateUtils.formatDateRange(context, startMillis, endMillis, pattern.getValue());
    }
}
