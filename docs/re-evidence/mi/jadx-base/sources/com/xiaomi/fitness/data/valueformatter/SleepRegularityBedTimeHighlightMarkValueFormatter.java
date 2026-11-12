package com.xiaomi.fitness.data.valueformatter;

import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import defpackage.gv5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/data/valueformatter/SleepRegularityBedTimeHighlightMarkValueFormatter;", "Lgv5;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "barEntry", "", "getBarLabel", "(Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;)Ljava/lang/String;", "", "isWeek", "Z", "()Z", "", "digits", "<init>", "(IZ)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepRegularityBedTimeHighlightMarkValueFormatter extends gv5 {

    @NotNull
    public static final String TAG = "SleepRegularityBedTimeHighlightMarkValueFormatter";
    private final boolean isWeek;

    public SleepRegularityBedTimeHighlightMarkValueFormatter(int i, boolean z) {
        super(i);
        this.isWeek = z;
    }

    @Override // defpackage.gv5, defpackage.onq
    @NotNull
    public String getBarLabel(@Nullable RecyclerBarEntry barEntry) {
        if (barEntry == null || barEntry.localDate == null) {
            return "";
        }
        long y = barEntry.timestamp + ((long) ((int) barEntry.getY()));
        String dateHHmm24Format = TimeDateUtil.getDateHHmm24Format(y);
        String dateYYYYMMddLocalFormat = TimeDateUtil.getDateYYYYMMddLocalFormat(((long) 1000) * y);
        String dateMMddFormat = TimeDateUtil.getDateMMddFormat(y);
        if (this.isWeek) {
            dateYYYYMMddLocalFormat = dateMMddFormat;
        }
        return dateHHmm24Format + gv5.CONNECT_STR + dateYYYYMMddLocalFormat;
    }

    /* JADX INFO: renamed from: isWeek, reason: from getter */
    public final boolean getIsWeek() {
        return this.isWeek;
    }
}
