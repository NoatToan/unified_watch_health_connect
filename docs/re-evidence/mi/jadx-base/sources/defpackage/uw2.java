package defpackage;

import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;

/* JADX INFO: loaded from: classes7.dex */
public class uw2 extends onq {
    @Override // defpackage.onq
    public String getBarLabel(RecyclerBarEntry recyclerBarEntry) {
        int i = recyclerBarEntry.type;
        if (i == 2 || i == 4) {
            return TimeDateUtil.getDate24HStr(recyclerBarEntry.timestamp, TimeUtils.FORMAT_H_M);
        }
        return (i == 6 || i == 5) ? TimeDateUtil.getDate24HStr(TimeDateUtil.changZeroOfTheDay(TimeDateUtil.timestampToLocalDate(recyclerBarEntry.timestamp)), TimeUtils.FORMAT_H_M) : "";
    }
}
