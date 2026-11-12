package com.xiaomi.fitness.health.todayhealth.model;

import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JP\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0016J2\u0010\u000e\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/model/IBloodPressureData;", "", "updateMaxMinAvg", "", "avgHighBp", "", "maxHighBp", "minHighBp", "avgLowBp", "maxLowBp", "minLowBp", "avgPulse", "maxPulse", "minPulse", "updateChartHelpList", "highTimesList", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/TimesDataRecordInt;", "lowTimesList", "pulseTimesList", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IBloodPressureData {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void updateChartHelpList(@NotNull IBloodPressureData iBloodPressureData, @NotNull List<TimesDataRecordInt> highTimesList, @NotNull List<TimesDataRecordInt> lowTimesList, @NotNull List<TimesDataRecordInt> pulseTimesList) {
            Intrinsics.checkNotNullParameter(highTimesList, "highTimesList");
            Intrinsics.checkNotNullParameter(lowTimesList, "lowTimesList");
            Intrinsics.checkNotNullParameter(pulseTimesList, "pulseTimesList");
        }

        public static void updateMaxMinAvg(@NotNull IBloodPressureData iBloodPressureData, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        }
    }

    void updateChartHelpList(@NotNull List<TimesDataRecordInt> highTimesList, @NotNull List<TimesDataRecordInt> lowTimesList, @NotNull List<TimesDataRecordInt> pulseTimesList);

    void updateMaxMinAvg(int avgHighBp, int maxHighBp, int minHighBp, int avgLowBp, int maxLowBp, int minLowBp, int avgPulse, int maxPulse, int minPulse);
}
