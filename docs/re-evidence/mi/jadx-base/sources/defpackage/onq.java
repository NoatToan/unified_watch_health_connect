package defpackage;

import com.github.mikephil.charting.data.Entry;
import com.xiaomi.fitness.chart.entrys.BloodGlucoseEntry;
import com.xiaomi.fitness.chart.entrys.RadarEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;

/* JADX INFO: loaded from: classes7.dex */
public abstract class onq implements fpc {
    public String getAxisLabel(float f, ft1 ft1Var) {
        return getFormattedValue(f);
    }

    public String getBarLabel(RecyclerBarEntry recyclerBarEntry) {
        return getFormattedValue(recyclerBarEntry.getY());
    }

    public String getBarStackedLabel(float f, RecyclerBarEntry recyclerBarEntry) {
        return getFormattedValue(f);
    }

    public String getBloodGlucoseLabel(BloodGlucoseEntry bloodGlucoseEntry, int i) {
        return getFormattedValue(bloodGlucoseEntry.getY());
    }

    public String getBubbleLabel(q53 q53Var) {
        throw null;
    }

    public String getCandleLabel(wi3 wi3Var) {
        throw null;
    }

    @Override // defpackage.fpc
    @Deprecated
    public String getFormattedValue(float f, ft1 ft1Var) {
        return getFormattedValue(f);
    }

    public String getPieLabel(float f, jwh jwhVar) {
        return getFormattedValue(f);
    }

    public String getPointLabel(Entry entry) {
        return getFormattedValue(entry.getY());
    }

    public String getRadarLabel(RadarEntry radarEntry) {
        return getFormattedValue(radarEntry.getY());
    }

    public String getFormattedValue(float f) {
        return String.valueOf(f);
    }
}
