package com.xiaomi.fitness.health.curse;

import com.xiaomi.fit.fitness.export.data.aggregation.CurseRecordKt;
import com.xiaomi.fit.fitness.export.data.aggregation.Record;
import com.xiaomi.fitness.chart.entrys.MultiBarEntry;
import com.xiaomi.fitness.health.curse.data.CurseExtKt;
import com.xiaomi.fitness.settingitem.settingitem.CurseSetting;
import defpackage.iji;
import defpackage.x44;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/health/curse/CurseChartHelper;", "", "<init>", "()V", "buildEmptyEntryList", "", "Lcom/xiaomi/fitness/chart/entrys/MultiBarEntry;", "buildBarEntryList", "list", "Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CurseChartHelper {

    @NotNull
    public static final CurseChartHelper INSTANCE = new CurseChartHelper();

    private CurseChartHelper() {
    }

    @Nullable
    public final List<MultiBarEntry> buildBarEntryList(@NotNull List<Record> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iA = x44.a(iji.q0);
        int iA2 = x44.a(iji.h0);
        for (Record record : list) {
            int interval = record.getInterval() > 0 ? record.getInterval() : CurseManager.INSTANCE.getInstance().getInterval();
            int inDays = CurseRecordKt.getInDays(record);
            ArrayList arrayList2 = new ArrayList();
            MultiBarEntry multiBarEntry = new MultiBarEntry(0.0f, Math.max(interval, inDays), record.getStartMills() / ((long) 1000), 2);
            multiBarEntry.localDate = new LocalDate(record.getStartMills());
            arrayList2.add(new MultiBarEntry.a(iA2, interval, true));
            arrayList2.add(new MultiBarEntry.a(iA, inDays, false));
            multiBarEntry.c(arrayList2);
            arrayList.add(multiBarEntry);
        }
        return arrayList;
    }

    @NotNull
    public final List<MultiBarEntry> buildEmptyEntryList() {
        ArrayList arrayList = new ArrayList();
        long todayZeroMills = CurseExtKt.getTodayZeroMills();
        CurseSetting setting = CurseManager.INSTANCE.getInstance().getSetting();
        int menstrualCycle = setting != null ? setting.getMenstrualCycle() : 28;
        for (int i = 0; i < 6; i++) {
            arrayList.add(new MultiBarEntry(0.0f, 0.0f, (todayZeroMills - (((long) (i * menstrualCycle)) * 86400000)) / ((long) 1000), 2));
        }
        return arrayList;
    }
}
