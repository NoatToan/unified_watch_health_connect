package com.xiaomi.fitness.health.todayhealth.ui.items;

import android.app.Application;
import com.xiaomi.fitness.chart.entrys.BloodGlucoseEntry;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.health.todayhealth.utils.HeartReportUtils;
import defpackage.gv5;
import defpackage.qxi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/items/HeartHighLightMarkValueFormatter;", "Lgv5;", "Lcom/xiaomi/fitness/chart/entrys/BloodGlucoseEntry;", "barEntry", "", "index", "", "getBloodGlucoseLabel", "(Lcom/xiaomi/fitness/chart/entrys/BloodGlucoseEntry;I)Ljava/lang/String;", "digits", "<init>", "(I)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HeartHighLightMarkValueFormatter extends gv5 {
    public HeartHighLightMarkValueFormatter(int i) {
        super(i);
    }

    @Override // defpackage.gv5, defpackage.onq
    @NotNull
    public String getBloodGlucoseLabel(@NotNull BloodGlucoseEntry barEntry, int index) {
        StringBuilder sb;
        Intrinsics.checkNotNullParameter(barEntry, "barEntry");
        Application application = ApplicationExtKt.getApplication();
        if (index < 0 || index >= barEntry.getFingerBSList().size()) {
            return "";
        }
        String heartRateStatusString = HeartReportUtils.INSTANCE.getHeartRateStatusString(barEntry.getFingerBSList().get(index).getLevelType());
        float value = barEntry.getFingerBSList().get(index).getValue();
        long time = barEntry.getValues().get(index).getTime();
        if (barEntry.getHighLightType() == 2) {
            value = barEntry.getFingerBSList().get(index).getValue();
            barEntry.getFingerBSList().get(index).getMealTime();
            time = barEntry.getFingerBSList().get(index).getTime();
        }
        if (value < 0.0f) {
            return "";
        }
        int i = (int) value;
        String strValueOf = String.valueOf(i);
        if (value >= 25.0f && barEntry.getHighLightType() == 1) {
            strValueOf = "@> @" + strValueOf;
        }
        if (value <= 2.0f && barEntry.getHighLightType() == 1) {
            strValueOf = "@≤ @" + strValueOf;
        }
        String quantityString = application.getResources().getQuantityString(qxi.common_unit_heart_rate, i);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        if (AppUtil.isRTLDirection()) {
            sb = new StringBuilder();
            sb.append(quantityString);
            sb.append(gv5.CONNECT_VALUE_STR);
            sb.append(strValueOf);
        } else {
            sb = new StringBuilder();
            sb.append(strValueOf);
            sb.append(gv5.CONNECT_VALUE_STR);
            sb.append(quantityString);
            sb.append(gv5.CONNECT_VALUE_STR);
            sb.append(heartRateStatusString);
        }
        String string = sb.toString();
        String dateHHmm24Format = TimeDateUtil.getDateHHmm24Format(time);
        if (TimeUtils.INSTANCE.isSameDay(((long) 1000) * time, System.currentTimeMillis())) {
            return string + gv5.CONNECT_STR + dateHHmm24Format;
        }
        return string + gv5.CONNECT_STR + TimeDateUtil.getDateMMddFormat(TimeDateUtil.timestampToLocalDate(time)) + " " + dateHHmm24Format;
    }
}
