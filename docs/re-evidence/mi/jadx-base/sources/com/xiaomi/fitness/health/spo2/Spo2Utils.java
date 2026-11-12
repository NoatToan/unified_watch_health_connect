package com.xiaomi.fitness.health.spo2;

import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.c0j;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007J\u0016\u0010\t\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007J\u0015\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/health/spo2/Spo2Utils;", "", "<init>", "()V", "getTheSpoMinNumber", "", "entries", "", "Lcom/xiaomi/fitness/chart/entrys/SegmentBarEntry;", "getTheSpoMaxNumber", "getSpo2AdviceByValue", "", "value", "(Ljava/lang/Integer;)Ljava/lang/String;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Spo2Utils {

    @NotNull
    public static final Spo2Utils INSTANCE = new Spo2Utils();

    private Spo2Utils() {
    }

    @NotNull
    public final String getSpo2AdviceByValue(@Nullable Integer value) {
        int i;
        if (value == null) {
            i = c0j.Bn;
        } else {
            i = value.intValue() < 95 ? c0j.Cn : c0j.Dn;
        }
        return ExtUtilKt.getString(i);
    }

    public final int getTheSpoMaxNumber(@Nullable List<? extends SegmentBarEntry> entries) {
        if (entries == null || entries.isEmpty()) {
            return -1;
        }
        int maxValue = entries.get(0).getMaxValue();
        int size = entries.size();
        for (int i = 0; i < size; i++) {
            SegmentBarEntry segmentBarEntry = entries.get(i);
            if (segmentBarEntry.getMaxValue() != 0) {
                maxValue = Math.max(maxValue, segmentBarEntry.getMaxValue());
            }
        }
        return maxValue;
    }

    public final int getTheSpoMinNumber(@Nullable List<? extends SegmentBarEntry> entries) {
        if (entries == null || entries.isEmpty()) {
            return -1;
        }
        int minValue = entries.get(0).getMinValue();
        int size = entries.size();
        for (int i = 0; i < size; i++) {
            SegmentBarEntry segmentBarEntry = entries.get(i);
            if (minValue == 0) {
                minValue = segmentBarEntry.getMinValue();
            }
            if (segmentBarEntry.getMinValue() != 0) {
                minValue = Math.min(minValue, segmentBarEntry.getMinValue());
            }
        }
        return minValue;
    }
}
