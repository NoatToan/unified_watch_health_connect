package defpackage;

import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.utils.TimeDateUtil;

/* JADX INFO: loaded from: classes9.dex */
public class ztp extends onq {
    @Override // defpackage.onq
    public String getBarLabel(RecyclerBarEntry recyclerBarEntry) {
        return recyclerBarEntry.type == 2 ? TimeDateUtil.getDateMMddNumberFormat(recyclerBarEntry.localDate) : "";
    }
}
