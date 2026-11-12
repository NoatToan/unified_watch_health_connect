package com.xiaomi.fitness.health.sleep.valueformater;

import android.app.Application;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SleepItemEntry;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import defpackage.c0j;
import defpackage.gv5;
import defpackage.npm;
import defpackage.qxi;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/valueformater/DaySleepHighLightFormatter;", "Lgv5;", "", "type", "", "getItemTpeStr", "(I)Ljava/lang/String;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "barEntry", "getBarLabel", "(Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;)Ljava/lang/String;", "digits", "<init>", "(I)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DaySleepHighLightFormatter extends gv5 {
    public DaySleepHighLightFormatter(int i) {
        super(i);
    }

    private final String getItemTpeStr(int type) {
        if (type == 0) {
            String string = AppUtil.getApp().getString(c0j.Dk);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (type == 1) {
            String string2 = AppUtil.getApp().getString(c0j.Nf);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (type == 2) {
            String string3 = AppUtil.getApp().getString(c0j.lk);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        if (type != 3) {
            String string4 = AppUtil.getApp().getString(c0j.Wc);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            return string4;
        }
        String string5 = AppUtil.getApp().getString(c0j.cf);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        return string5;
    }

    @Override // defpackage.gv5, defpackage.onq
    @NotNull
    public String getBarLabel(@NotNull RecyclerBarEntry barEntry) {
        StringBuilder sb;
        Intrinsics.checkNotNullParameter(barEntry, "barEntry");
        npm npmVar = ((SleepItemEntry) barEntry).f11764a;
        String str = "";
        if (npmVar == null) {
            return "";
        }
        long j = 60;
        int iMax = Math.max(1, (int) ((npmVar.g / j) - (npmVar.f / j)));
        Application app = AppUtil.getApp();
        int i = iMax / 60;
        if (i > 0) {
            str = i + gv5.CONNECT_STR + ResourceExtKt.getQuantityString(AppUtil.getApp(), qxi.N1, i, Integer.valueOf(i));
        }
        int i2 = iMax % 60;
        String str2 = i2 + gv5.CONNECT_STR + ResourceExtKt.getQuantityString(AppUtil.getApp(), qxi.P1, i2, Integer.valueOf(i2));
        String itemTpeStr = getItemTpeStr(npmVar.c);
        String dateStr = TimeDateUtil.getDateStr(npmVar.f, TimeUtils.FORMAT_H_M);
        String dateStr2 = TimeDateUtil.getDateStr(npmVar.g, TimeUtils.FORMAT_H_M);
        String str3 = itemTpeStr + gv5.CONNECT_STR + str + gv5.CONNECT_STR + str2;
        if (npmVar.j != 0 && npmVar.i != 0) {
            String string = app.getString(c0j.k7);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str4 = String.format("%d-%d", Arrays.copyOf(new Object[]{Integer.valueOf(npmVar.j), Integer.valueOf(npmVar.i)}, 2));
            Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
            int i3 = qxi.common_unit_heart_rate;
            int i4 = npmVar.i;
            str3 = str3 + "，" + (string + gv5.CONNECT_STR + str4 + gv5.CONNECT_STR + ResourceExtKt.getQuantityString(app, i3, i4, Integer.valueOf(i4)));
        }
        if (npmVar.f28235k != 0 && npmVar.l != 0) {
            String string2 = app.getString(c0j.w5);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            str3 = str3 + "，" + (app.getString(c0j.ch) + gv5.CONNECT_STR + npmVar.l + gv5.CONNECT_STR + string2 + "&-" + npmVar.f28235k + gv5.CONNECT_STR + string2);
        }
        if (AppUtil.isRTLDirection()) {
            sb = new StringBuilder();
            sb.append(dateStr2);
            sb.append("-");
            sb.append(dateStr);
        } else {
            sb = new StringBuilder();
            sb.append(dateStr);
            sb.append("-");
            sb.append(dateStr2);
        }
        return str3 + gv5.CONNECT_VALUE_STR + sb.toString();
    }
}
