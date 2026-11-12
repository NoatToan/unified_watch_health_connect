package defpackage;

import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;

/* JADX INFO: loaded from: classes7.dex */
public class yqr extends onq {
    @Override // defpackage.onq
    public String getBarLabel(RecyclerBarEntry recyclerBarEntry) {
        int i = recyclerBarEntry.type;
        if (i != 1 && i != 4) {
            return "";
        }
        return (((int) recyclerBarEntry.getX()) / 25) + "s";
    }
}
