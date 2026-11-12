package com.xiaomi.fitness.data.valueformatter;

import android.app.Application;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import defpackage.gv5;
import defpackage.qxi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/data/valueformatter/RateHighLightMarkValueFormatter;", "Lgv5;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "barEntry", "", "getBarLabel", "(Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;)Ljava/lang/String;", "", "digits", "<init>", "(I)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class RateHighLightMarkValueFormatter extends gv5 {
    public RateHighLightMarkValueFormatter(int i) {
        super(i);
    }

    @Override // defpackage.gv5, defpackage.onq
    @NotNull
    public String getBarLabel(@NotNull RecyclerBarEntry barEntry) {
        String str;
        Intrinsics.checkNotNullParameter(barEntry, "barEntry");
        Application application = ApplicationExtKt.getApplication();
        if (!(barEntry instanceof SegmentBarEntry)) {
            return "";
        }
        String quantityString = application.getResources().getQuantityString(qxi.common_unit_heart_rate, (int) barEntry.getY());
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        if (AppUtil.isRTLDirection()) {
            str = quantityString + gv5.CONNECT_VALUE_STR + ((SegmentBarEntry) barEntry).getRangeStr();
        } else {
            str = ((SegmentBarEntry) barEntry).getRangeStr() + gv5.CONNECT_VALUE_STR + quantityString;
        }
        return str + gv5.CONNECT_STR + TimeDateUtil.getDateYYYYMMddLocalFormat(barEntry.localDate);
    }
}
