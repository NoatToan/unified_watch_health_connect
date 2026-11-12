package defpackage;

import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
public class jrr extends onq {
    @Override // defpackage.onq
    public String getBarLabel(RecyclerBarEntry recyclerBarEntry) {
        LocalDate localDate = recyclerBarEntry.localDate;
        int i = recyclerBarEntry.type;
        return (i == 4 || i == 2) ? TimeDateUtil.getDateMMddNumberFormat(localDate) : "";
    }
}
