package com.xiaomi.fitness.health.hrm;

import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import defpackage.gv5;
import defpackage.qxi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/health/hrm/AbnormalHrmHighLightMarkValueFormatter;", "Lgv5;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "barEntry", "", "getBarLabel", "(Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;)Ljava/lang/String;", "", "digits", "<init>", "(I)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AbnormalHrmHighLightMarkValueFormatter extends gv5 {
    public AbnormalHrmHighLightMarkValueFormatter(int i) {
        super(i);
    }

    @Override // defpackage.gv5, defpackage.onq
    @NotNull
    public String getBarLabel(@NotNull RecyclerBarEntry barEntry) {
        StringBuilder sb;
        Intrinsics.checkNotNullParameter(barEntry, "barEntry");
        if (!(barEntry instanceof SegmentBarEntry)) {
            return "";
        }
        String quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.common_unit_heart_rate, (int) barEntry.getY());
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        if (AppUtil.isRTLDirection()) {
            String rangeStr = ((SegmentBarEntry) barEntry).getRangeStr();
            sb = new StringBuilder();
            sb.append(quantityString);
            sb.append(gv5.CONNECT_VALUE_STR);
            sb.append(rangeStr);
        } else {
            String rangeStr2 = ((SegmentBarEntry) barEntry).getRangeStr();
            sb = new StringBuilder();
            sb.append(rangeStr2);
            sb.append(gv5.CONNECT_VALUE_STR);
            sb.append(quantityString);
        }
        return barEntry.getY() > 0.0f ? sb.toString() + gv5.CONNECT_STR + TimeDateUtil.getDateFormated(barEntry.timestamp * ((long) 1000), TimeUtils.FORMAT_H_M) : "";
    }
}
