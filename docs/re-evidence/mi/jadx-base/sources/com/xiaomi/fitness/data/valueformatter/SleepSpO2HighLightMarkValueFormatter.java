package com.xiaomi.fitness.data.valueformatter;

import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.repo.RepositoryManager;
import defpackage.gv5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/data/valueformatter/SleepSpO2HighLightMarkValueFormatter;", "Lgv5;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "barEntry", "", "getBarLabel", "(Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;)Ljava/lang/String;", "", "digits", "<init>", "(I)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepSpO2HighLightMarkValueFormatter extends gv5 {
    public SleepSpO2HighLightMarkValueFormatter(int i) {
        super(i);
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
        int y = (int) ((SegmentBarEntry) barEntry).getY();
        if (AppUtil.isRTLDirection()) {
            sb = new StringBuilder();
            sb.append("%@");
            sb.append(y);
        } else {
            sb = new StringBuilder();
            sb.append(y);
            sb.append("@%");
        }
        String string = sb.toString();
        if (LocaleUtil.INSTANCE.isTR()) {
            string = "%" + y;
        }
        String dateStr = TimeDateUtil.getDateStr(barEntry.timestamp, TimeUtils.FORMAT_H_M);
        String dateStr2 = TimeDateUtil.getDateStr(barEntry.timestamp + RepositoryManager.GAP_X_MINUTE, TimeUtils.FORMAT_H_M);
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
        return ((SegmentBarEntry) barEntry).getY() > 0.0f ? string + gv5.CONNECT_STR + sb2.toString() : "";
    }
}
