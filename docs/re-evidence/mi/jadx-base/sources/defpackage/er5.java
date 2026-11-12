package defpackage;

import android.app.Application;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.repo.RepositoryManager;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class er5 extends gv5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16983a;

    public er5(int i, boolean z) {
        super(i);
        this.f16983a = z;
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
        String quantityString = maxValue == minValue ? app.getResources().getQuantityString(qxi.z1, maxValue, Integer.valueOf(maxValue)) : String.format(Locale.US, "%1$s-%2$s", app.getResources().getQuantityString(qxi.z1, minValue, Integer.valueOf(minValue)), app.getResources().getQuantityString(qxi.z1, maxValue, Integer.valueOf(maxValue)));
        String dateYYYYMMddLocalFormat = TimeDateUtil.getDateYYYYMMddLocalFormat(recyclerBarEntry.timestamp * 1000);
        if (this.f16983a) {
            long j = recyclerBarEntry.timestamp;
            dateYYYYMMddLocalFormat = String.format(Locale.US, "%s-%s", TimeDateUtil.getDateFormated(j * 1000, TimeUtils.FORMAT_H_M), TimeDateUtil.getDateFormated((RepositoryManager.GAP_X_MINUTE + j) * 1000, TimeUtils.FORMAT_H_M));
        }
        return recyclerBarEntry.getY() > 0.0f ? quantityString + gv5.CONNECT_STR + dateYYYYMMddLocalFormat : "";
    }
}
