package defpackage;

import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.utils.TimeDateUtil;

/* JADX INFO: loaded from: classes7.dex */
public class irr extends onq {
    @Override // defpackage.onq
    public String getBarLabel(RecyclerBarEntry recyclerBarEntry) {
        return TimeDateUtil.getDateMMddNumberFormat(recyclerBarEntry.localDate);
    }
}
