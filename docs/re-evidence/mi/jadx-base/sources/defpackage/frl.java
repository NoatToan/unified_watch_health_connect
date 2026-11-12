package defpackage;

import com.github.mikephil.charting.data.BarEntry;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;

/* JADX INFO: loaded from: classes7.dex */
public class frl extends p02 {
    public frl(int i, int i2, boolean z) {
        super(i, i2, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p02
    public void e(gpc gpcVar) {
        float fO0 = gpcVar.O0() * this.c;
        float f = this.f29862k / 2.0f;
        for (int i = 0; i < fO0; i++) {
            BarEntry barEntry = (BarEntry) gpcVar.i(i);
            if (barEntry != null && (barEntry instanceof SegmentBarEntry)) {
                SegmentBarEntry segmentBarEntry = (SegmentBarEntry) barEntry;
                float x = segmentBarEntry.getX();
                float f2 = x - f;
                float f3 = x + f;
                for (hrl hrlVar : segmentBarEntry.rectValueModelList) {
                    d(f2, hrlVar.f20377a, f3, hrlVar.f20378b);
                }
            }
        }
        a();
    }
}
