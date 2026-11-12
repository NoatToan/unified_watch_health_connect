package com.xiaomi.fitness.data.valueformatter;

import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import defpackage.gv5;
import defpackage.xr5;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/data/valueformatter/EnergyHighLightMarkValueFormatter;", "Lgv5;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "barEntry", "", "getBarLabel", "(Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;)Ljava/lang/String;", "", "digits", "<init>", "(I)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class EnergyHighLightMarkValueFormatter extends gv5 {
    public EnergyHighLightMarkValueFormatter(int i) {
        super(i);
    }

    @Override // defpackage.gv5, defpackage.onq
    @NotNull
    public String getBarLabel(@NotNull RecyclerBarEntry barEntry) {
        String str;
        Intrinsics.checkNotNullParameter(barEntry, "barEntry");
        if (!(barEntry instanceof MaxMinEntry)) {
            return "";
        }
        MaxMinEntry maxMinEntry = (MaxMinEntry) barEntry;
        int i = (int) maxMinEntry.maxY;
        int i2 = (int) maxMinEntry.minY;
        String strH = xr5.h(i);
        String strH2 = xr5.h(i2);
        if (AppUtil.isRTLDirection()) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format("%s-%s", Arrays.copyOf(new Object[]{strH2, strH}, 2));
        } else {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            str = String.format("%s-%s", Arrays.copyOf(new Object[]{strH, strH2}, 2));
        }
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str + gv5.CONNECT_STR + TimeDateUtil.getDateYYYYMMddLocalFormat(barEntry.timestamp * ((long) 1000));
    }
}
