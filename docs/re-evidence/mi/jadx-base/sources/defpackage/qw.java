package defpackage;

import android.app.Application;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class qw extends gv5 {
    public qw(int i) {
        super(i);
    }

    @Override // defpackage.gv5, defpackage.onq
    public String getBarLabel(RecyclerBarEntry recyclerBarEntry) {
        if (!(recyclerBarEntry instanceof SegmentBarEntry)) {
            return "";
        }
        SegmentBarEntry segmentBarEntry = (SegmentBarEntry) recyclerBarEntry;
        Application app = AppUtil.getApp();
        int maxValue = segmentBarEntry.getMaxValue();
        int minValue = segmentBarEntry.getMinValue();
        if (maxValue == 0) {
            maxValue = minValue;
        }
        if (minValue == 0) {
            minValue = maxValue;
        }
        if ((minValue == maxValue && minValue == 0) || minValue < 0 || maxValue > 100 || Math.abs(minValue) > 100 || Math.abs(maxValue) > 100) {
            return "";
        }
        return recyclerBarEntry.getY() > 0.0f ? (maxValue == minValue ? app.getResources().getQuantityString(qxi.z1, maxValue, Integer.valueOf(maxValue)) : String.format(Locale.US, "%1$s-%2$s", app.getResources().getQuantityString(qxi.z1, minValue, Integer.valueOf(minValue)), app.getResources().getQuantityString(qxi.z1, maxValue, Integer.valueOf(maxValue)))) + gv5.CONNECT_STR + TimeDateUtil.getDateFormated(recyclerBarEntry.timestamp * 1000, TimeUtils.FORMAT_H_M) : "";
    }
}
