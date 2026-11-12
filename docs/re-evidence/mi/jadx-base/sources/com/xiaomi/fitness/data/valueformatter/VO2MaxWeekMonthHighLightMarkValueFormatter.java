package com.xiaomi.fitness.data.valueformatter;

import android.app.Application;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import defpackage.c0j;
import defpackage.gv5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/data/valueformatter/VO2MaxWeekMonthHighLightMarkValueFormatter;", "Lgv5;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "barEntry", "", "getBarLabel", "(Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;)Ljava/lang/String;", "", "digits", "<init>", "(I)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class VO2MaxWeekMonthHighLightMarkValueFormatter extends gv5 {
    public VO2MaxWeekMonthHighLightMarkValueFormatter(int i) {
        super(i);
    }

    @Override // defpackage.gv5, defpackage.onq
    @NotNull
    public String getBarLabel(@NotNull RecyclerBarEntry barEntry) {
        StringBuilder sb;
        Intrinsics.checkNotNullParameter(barEntry, "barEntry");
        Application app = AppUtil.getApp();
        int y = (int) barEntry.getY();
        String string = app.getString(c0j.Oo);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        boolean zIsRTLDirection = AppUtil.isRTLDirection();
        String formattedValue = getFormattedValue(y);
        if (zIsRTLDirection) {
            sb = new StringBuilder();
            sb.append(string);
            sb.append(gv5.CONNECT_VALUE_STR);
            sb.append(formattedValue);
        } else {
            sb = new StringBuilder();
            sb.append(formattedValue);
            sb.append(gv5.CONNECT_VALUE_STR);
            sb.append(string);
        }
        return barEntry.getY() > 0.0f ? sb.toString() + gv5.CONNECT_STR + TimeDateUtil.getDateYYYYMMddLocalFormat(barEntry.timestamp * ((long) 1000)) : "";
    }
}
