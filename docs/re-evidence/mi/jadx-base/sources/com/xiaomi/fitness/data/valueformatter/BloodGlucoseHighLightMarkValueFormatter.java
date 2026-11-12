package com.xiaomi.fitness.data.valueformatter;

import android.app.Application;
import com.xiaomi.fitness.chart.entrys.BloodGlucoseEntry;
import com.xiaomi.fitness.chart.entrys.FingerBSList;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import defpackage.c0j;
import defpackage.gv5;
import defpackage.qxi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/data/valueformatter/BloodGlucoseHighLightMarkValueFormatter;", "Lgv5;", "Lcom/xiaomi/fitness/chart/entrys/FingerBSList;", "fingerItem", "", "type", "", "createBarLabel", "(Lcom/xiaomi/fitness/chart/entrys/FingerBSList;I)Ljava/lang/String;", "Lcom/xiaomi/fitness/chart/entrys/BloodGlucoseEntry;", "barEntry", "index", "getBloodGlucoseLabel", "(Lcom/xiaomi/fitness/chart/entrys/BloodGlucoseEntry;I)Ljava/lang/String;", "digits", "<init>", "(I)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BloodGlucoseHighLightMarkValueFormatter extends gv5 {
    public BloodGlucoseHighLightMarkValueFormatter(int i) {
        super(i);
    }

    private final String createBarLabel(FingerBSList fingerItem, int type) {
        StringBuilder sb;
        float value = fingerItem.getValue();
        Application application = ApplicationExtKt.getApplication();
        String strValueOf = String.valueOf(value);
        String quantityString = application.getResources().getQuantityString(qxi.d, (int) value);
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
        }
        String string = sb.toString();
        String string2 = type == 0 ? application.getString(c0j.n0) : application.getString(c0j.m0);
        Intrinsics.checkNotNull(string2);
        return string + gv5.CONNECT_VALUE_STR + string2;
    }

    @Override // defpackage.gv5, defpackage.onq
    @NotNull
    public String getBloodGlucoseLabel(@NotNull BloodGlucoseEntry barEntry, int index) {
        String str;
        StringBuilder sb;
        String str2;
        Intrinsics.checkNotNullParameter(barEntry, "barEntry");
        Application application = ApplicationExtKt.getApplication();
        float value = barEntry.getValues().get(index).getValue();
        long time = barEntry.getValues().get(index).getTime();
        if (barEntry.getHighLightType() == 2) {
            value = barEntry.getFingerBSList().get(index).getValue();
            String mealTime = barEntry.getFingerBSList().get(index).getMealTime();
            long time2 = barEntry.getFingerBSList().get(index).getTime();
            if (barEntry.getFingerHighLightMap().get(Integer.valueOf(index)) != null) {
                FingerBSList fingerBSList = barEntry.getFingerHighLightMap().get(Integer.valueOf(index));
                Intrinsics.checkNotNull(fingerBSList);
                FingerBSList fingerBSList2 = fingerBSList;
                String strCreateBarLabel = createBarLabel(barEntry.getFingerBSList().get(index), 0);
                String strCreateBarLabel2 = createBarLabel(fingerBSList2, 1);
                String dateHHmmFormat = TimeDateUtil.getDateHHmmFormat(time2);
                String dateHHmmFormat2 = TimeDateUtil.getDateHHmmFormat(fingerBSList2.getTime());
                String str3 = (TimeUtils.INSTANCE.isSameDay(time2 * ((long) 1000), System.currentTimeMillis()) ? "" : TimeDateUtil.getDateMMddFormat(TimeDateUtil.timestampToLocalDate(time2))) + " " + dateHHmmFormat + "-" + dateHHmmFormat2;
                String str4 = barEntry.getFingerBSList().get(index).getMealTime() + gv5.CONNECT_VALUE_STR + barEntry.getFingerBSList().get(index).getLevelType() + gv5.CONNECT_VALUE_STR + barEntry.getFingerBSList().get(index).getLevelStingRes() + gv5.CONNECT_VALUE_STR + fingerBSList2.getMealTime() + gv5.CONNECT_VALUE_STR + fingerBSList2.getLevelType() + gv5.CONNECT_VALUE_STR + fingerBSList2.getLevelStingRes();
                Logger.i("barEntry.fingerHighLightMap  " + strCreateBarLabel + "  " + strCreateBarLabel2 + "  " + str3 + " " + str4, new Object[0]);
                return strCreateBarLabel + gv5.CONNECT_VALUE_STR + strCreateBarLabel2 + gv5.CONNECT_STR + str4 + gv5.CONNECT_STR + str3;
            }
            str = mealTime;
            time = time2;
        } else {
            str = "";
        }
        if (value < 0.0f) {
            return "";
        }
        String strValueOf = String.valueOf(value);
        if (value >= 25.0f && barEntry.getHighLightType() == 1) {
            strValueOf = "@> @" + strValueOf;
        }
        if (value <= 2.0f && barEntry.getHighLightType() == 1) {
            strValueOf = "@≤ @" + strValueOf;
        }
        String quantityString = application.getResources().getQuantityString(qxi.d, (int) value);
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
        }
        String string = sb.toString();
        String dateHHmmFormat3 = TimeDateUtil.getDateHHmmFormat(time);
        if (TimeUtils.INSTANCE.isSameDay(((long) 1000) * time, System.currentTimeMillis())) {
            str2 = string + gv5.CONNECT_STR + dateHHmmFormat3;
        } else {
            str2 = string + gv5.CONNECT_STR + TimeDateUtil.getDateMMddFormat(TimeDateUtil.timestampToLocalDate(time)) + " " + dateHHmmFormat3;
        }
        if (Intrinsics.areEqual(str, "")) {
            return str2;
        }
        return str2 + " " + str;
    }
}
