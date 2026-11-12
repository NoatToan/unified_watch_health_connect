package defpackage;

import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;

/* JADX INFO: loaded from: classes7.dex */
public class qt5 extends vx5 {
    public qt5(int i) {
        super(i);
    }

    @Override // defpackage.onq
    public String getBarLabel(RecyclerBarEntry recyclerBarEntry) {
        return recyclerBarEntry.getY() > 0.0f ? getFormattedValue(recyclerBarEntry.getY()) : "";
    }

    @Override // defpackage.vx5, defpackage.onq
    public String getFormattedValue(float f) {
        return super.getFormattedValue(f);
    }
}
