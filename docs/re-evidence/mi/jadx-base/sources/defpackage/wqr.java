package defpackage;

import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;

/* JADX INFO: loaded from: classes8.dex */
public class wqr extends onq {
    @Override // defpackage.onq
    public String getBarLabel(RecyclerBarEntry recyclerBarEntry) {
        int i = recyclerBarEntry.type;
        if (i == 2 || i == 4) {
            return TimeDateUtil.getDateStr(recyclerBarEntry.timestamp, TimeUtils.FORMAT_H_M);
        }
        return (i == 6 || i == 5) ? TimeDateUtil.getDateStr(1645113600L, TimeUtils.FORMAT_H_M) : "";
    }
}
