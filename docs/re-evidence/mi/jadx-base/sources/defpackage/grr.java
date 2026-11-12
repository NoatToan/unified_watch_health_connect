package defpackage;

import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;

/* JADX INFO: loaded from: classes8.dex */
public class grr extends onq {
    @Override // defpackage.onq
    public String getBarLabel(RecyclerBarEntry recyclerBarEntry) {
        int i = recyclerBarEntry.type;
        if (i != 1 && i != 4) {
            return "";
        }
        int i2 = (int) recyclerBarEntry.timestamp;
        int i3 = i2 % 60;
        int i4 = (i2 / 60) % 60;
        int i5 = i2 / 3600;
        return String.format("%02d:%02d:%02d", Integer.valueOf((i5 % 24) + ((i5 / 24) * 24)), Integer.valueOf(i4), Integer.valueOf(i3));
    }
}
