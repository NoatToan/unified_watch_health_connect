package defpackage;

import com.xiaomi.fitness.chart.entrys.BloodGlucoseEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.utils.TimeDateUtil;

/* JADX INFO: loaded from: classes7.dex */
public class gv5 extends vx5 {
    public static final String CONNECT_STR = "&";
    public static final String CONNECT_VALUE_STR = "@";

    public gv5(int i) {
        super(i);
    }

    @Override // defpackage.onq
    public String getBarLabel(RecyclerBarEntry recyclerBarEntry) {
        return recyclerBarEntry.getY() > 0.0f ? xr5.f(recyclerBarEntry.getY()) + CONNECT_STR + TimeDateUtil.getDateSimpleLocalFormat(recyclerBarEntry.timestamp) : "";
    }

    @Override // defpackage.onq
    public String getBloodGlucoseLabel(BloodGlucoseEntry bloodGlucoseEntry, int i) {
        return getFormattedValue(bloodGlucoseEntry.getY());
    }

    @Override // defpackage.vx5, defpackage.onq
    public String getFormattedValue(float f) {
        return super.getFormattedValue(f);
    }
}
