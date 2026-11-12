package com.xiaomi.fitness.data.valueformatter;

import android.content.Context;
import android.content.res.Resources;
import com.xiaomi.fitness.chart.entrys.MultiBarEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.curse.data.CurseExtKt;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.c0j;
import defpackage.gv5;
import defpackage.qxi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/data/valueformatter/CurseHistoryHighLightValueFormatter;", "Lgv5;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "barEntry", "", "getBarLabel", "(Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;)Ljava/lang/String;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CurseHistoryHighLightValueFormatter extends gv5 {

    @NotNull
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurseHistoryHighLightValueFormatter(@NotNull Context context) {
        super(0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // defpackage.gv5, defpackage.onq
    @NotNull
    public String getBarLabel(@NotNull RecyclerBarEntry barEntry) {
        Intrinsics.checkNotNullParameter(barEntry, "barEntry");
        List<MultiBarEntry.a> listA = ((MultiBarEntry) barEntry).a();
        if (listA == null || listA.size() != 2) {
            return "";
        }
        boolean z = false;
        int i = listA.get(0).f11757b;
        int i2 = listA.get(1).f11757b;
        long j = barEntry.timestamp * ((long) 1000);
        long j2 = (((long) (i2 - 1)) * 86400000) + j;
        long todayZeroMills = CurseExtKt.getTodayZeroMills();
        if (j <= todayZeroMills && todayZeroMills < j2) {
            z = true;
        }
        Resources resources = this.context.getResources();
        String string = z ? resources.getString(c0j.U5) : resources.getQuantityString(qxi.M, i, Integer.valueOf(i));
        Intrinsics.checkNotNull(string);
        String str = i2 + gv5.CONNECT_VALUE_STR + resources.getQuantityString(qxi.B, i2, Integer.valueOf(i2)) + ExtUtilKt.getString(c0j.f5) + string;
        String string2 = z ? resources.getString(c0j.z6, TimeDateUtil.getDateMdFormat(j)) : resources.getString(c0j.A7, TimeDateUtil.getDateMdFormat(j), TimeDateUtil.getDateMdFormat(j2));
        Intrinsics.checkNotNull(string2);
        return barEntry.getY() > 0.0f ? str + gv5.CONNECT_STR + string2 : "";
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }
}
