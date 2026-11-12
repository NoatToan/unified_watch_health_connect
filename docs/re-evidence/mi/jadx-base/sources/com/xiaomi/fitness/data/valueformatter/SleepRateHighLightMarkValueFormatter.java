package com.xiaomi.fitness.data.valueformatter;

import android.app.Application;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.repo.RepositoryManager;
import defpackage.gv5;
import defpackage.qxi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/data/valueformatter/SleepRateHighLightMarkValueFormatter;", "Lgv5;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "barEntry", "", "getBarLabel", "(Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;)Ljava/lang/String;", "", "maxTime", "J", "getMaxTime", "()J", "setMaxTime", "(J)V", "", "digits", "<init>", "(I)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepRateHighLightMarkValueFormatter extends gv5 {
    private long maxTime;

    public SleepRateHighLightMarkValueFormatter(int i) {
        super(i);
        this.maxTime = -1L;
    }

    @Override // defpackage.gv5, defpackage.onq
    @NotNull
    public String getBarLabel(@NotNull RecyclerBarEntry barEntry) {
        StringBuilder sb;
        StringBuilder sb2;
        Intrinsics.checkNotNullParameter(barEntry, "barEntry");
        if (!(barEntry instanceof SegmentBarEntry)) {
            return "";
        }
        Application application = ApplicationExtKt.getApplication();
        SegmentBarEntry segmentBarEntry = (SegmentBarEntry) barEntry;
        int y = (int) segmentBarEntry.getY();
        String quantityString = application.getResources().getQuantityString(qxi.common_unit_heart_rate, y);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        boolean zIsRTLDirection = AppUtil.isRTLDirection();
        String rangeStr = segmentBarEntry.getRangeStr();
        if (zIsRTLDirection) {
            sb = new StringBuilder();
            sb.append(quantityString);
            sb.append(gv5.CONNECT_VALUE_STR);
            sb.append(rangeStr);
        } else {
            sb = new StringBuilder();
            sb.append(rangeStr);
            sb.append(gv5.CONNECT_VALUE_STR);
            sb.append(quantityString);
        }
        String string = sb.toString();
        String dateStr = TimeDateUtil.getDateStr(barEntry.timestamp, TimeUtils.FORMAT_H_M);
        long j = barEntry.timestamp + RepositoryManager.GAP_X_MINUTE;
        long j2 = this.maxTime;
        if (j > j2 && j2 != -1) {
            j = j2;
        }
        String dateStr2 = TimeDateUtil.getDateStr(j, TimeUtils.FORMAT_H_M);
        if (AppUtil.isRTLDirection()) {
            sb2 = new StringBuilder();
            sb2.append(dateStr2);
            sb2.append("-");
            sb2.append(dateStr);
        } else {
            sb2 = new StringBuilder();
            sb2.append(dateStr);
            sb2.append("-");
            sb2.append(dateStr2);
        }
        return y > 0 ? string + gv5.CONNECT_STR + sb2.toString() : "";
    }

    public final long getMaxTime() {
        return this.maxTime;
    }

    public final void setMaxTime(long j) {
        this.maxTime = j;
    }
}
