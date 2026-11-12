package com.xiaomi.fitness.util;

import com.xiaomi.fitness.chart.entrys.CurseEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.curse.CurseManager;
import com.xiaomi.fitness.health.curse.DailyFemaleHealthReport;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/util/CurseDataUtil;", "", "<init>", "()V", "LENGTH", "", "createEmptyList", "", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "localDate", "Lorg/joda/time/LocalDate;", "createDayEntriesHome", "Lcom/xiaomi/fitness/chart/entrys/CurseEntry;", "report", "Lcom/xiaomi/fitness/health/curse/DailyFemaleHealthReport;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CurseDataUtil {

    @NotNull
    public static final CurseDataUtil INSTANCE = new CurseDataUtil();
    private static final int LENGTH = 7;

    private CurseDataUtil() {
    }

    @NotNull
    public final List<CurseEntry> createDayEntriesHome(@NotNull DailyFemaleHealthReport report) {
        Intrinsics.checkNotNullParameter(report, "report");
        ArrayList arrayList = new ArrayList();
        long menstrualStartTime = report.getMenstrualStartTime();
        long seconds = TimeUnit.DAYS.toSeconds(1L);
        for (int i = 0; i < 7; i++) {
            long j = menstrualStartTime + (((long) i) * seconds);
            LocalDate localDate = new LocalDate(((long) 1000) * j);
            CurseEntry curseEntry = new CurseEntry(i, 1.0f, j, 3, CurseManager.INSTANCE.getInstance().getEntranceDayStatus(localDate));
            curseEntry.localDate = localDate;
            arrayList.add(curseEntry);
        }
        return arrayList;
    }

    @NotNull
    public final List<RecyclerBarEntry> createEmptyList(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        ArrayList arrayList = new ArrayList();
        LocalDate localDatePlusDays = localDate.plusDays(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDatePlusDays);
        for (int i = 0; i < 7; i++) {
            jChangZeroOfTheDay -= 86400;
            RecyclerBarEntry recyclerBarEntry = new RecyclerBarEntry(i, 0, jChangZeroOfTheDay, 3);
            recyclerBarEntry.localDate = localDate;
            arrayList.add(recyclerBarEntry);
        }
        return arrayList;
    }
}
