package com.xiaomi.fitness.health.threetarget.view;

import android.app.Application;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import defpackage.c0j;
import defpackage.gv5;
import defpackage.qxi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/health/threetarget/view/TargetHighLightMarkValueFormatter;", "Lgv5;", "", "getUnit", "()I", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "barEntry", "", "getBarLabel", "(Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;)Ljava/lang/String;", "goalType", "I", "getGoalType", "digits", "<init>", "(II)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TargetHighLightMarkValueFormatter extends gv5 {
    private final int goalType;

    public TargetHighLightMarkValueFormatter(int i, int i2) {
        super(i);
        this.goalType = i2;
    }

    private final int getUnit() {
        int i = this.goalType;
        if (i == 1) {
            return qxi.u;
        }
        if (i != 3) {
            return i != 4 ? qxi.common_unit_calorie : qxi.t;
        }
        return qxi.common_unit_time;
    }

    @Override // defpackage.gv5, defpackage.onq
    @NotNull
    public String getBarLabel(@NotNull RecyclerBarEntry barEntry) {
        StringBuilder sb;
        StringBuilder sb2;
        Intrinsics.checkNotNullParameter(barEntry, "barEntry");
        Application application = ApplicationExtKt.getApplication();
        int iRoundToInt = MathKt__MathJVMKt.roundToInt(barEntry.getY());
        int goalValue = barEntry.getGoalValue();
        String quantityString = application.getResources().getQuantityString(getUnit(), iRoundToInt);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        if (AppUtil.isRTLDirection()) {
            sb = new StringBuilder();
            sb.append(quantityString);
            sb.append(gv5.CONNECT_VALUE_STR);
            sb.append(iRoundToInt);
            sb.append(gv5.CONNECT_VALUE_STR);
        } else {
            sb = new StringBuilder();
            sb.append(iRoundToInt);
            sb.append(gv5.CONNECT_VALUE_STR);
            sb.append(quantityString);
        }
        String string = sb.toString();
        if (AppUtil.isRTLDirection()) {
            sb2 = new StringBuilder();
            sb2.append(quantityString);
            sb2.append(gv5.CONNECT_VALUE_STR);
            sb2.append(goalValue);
            sb2.append(gv5.CONNECT_VALUE_STR);
        } else {
            sb2 = new StringBuilder();
            sb2.append(gv5.CONNECT_VALUE_STR);
            sb2.append(goalValue);
            sb2.append(gv5.CONNECT_VALUE_STR);
            sb2.append(quantityString);
        }
        String string2 = sb2.toString();
        if (goalValue > 0) {
            string = application.getResources().getString(c0j.km, string, string2);
        }
        Intrinsics.checkNotNull(string);
        return barEntry.getY() > 0.0f ? string + gv5.CONNECT_STR + TimeDateUtil.getDateYYYYMMddLocalFormat(barEntry.localDate) : "";
    }

    public final int getGoalType() {
        return this.goalType;
    }
}
