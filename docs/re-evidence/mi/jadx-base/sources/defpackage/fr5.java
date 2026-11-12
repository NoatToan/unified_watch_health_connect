package defpackage;

import android.content.Context;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;

/* JADX INFO: loaded from: classes7.dex */
public class fr5 extends gv5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f18119a;

    public fr5(Context context) {
        this(0);
        this.f18119a = context;
    }

    @Override // defpackage.gv5, defpackage.onq
    public String getBarLabel(RecyclerBarEntry recyclerBarEntry) {
        Context context;
        int i;
        if (recyclerBarEntry.validType == 1) {
            context = this.f18119a;
            i = c0j.Z6;
        } else {
            context = this.f18119a;
            i = c0j.X6;
        }
        return recyclerBarEntry.getY() > 0.0f ? context.getString(i) + gv5.CONNECT_STR + (TimeDateUtil.getDateStr(recyclerBarEntry.timestamp, TimeUtils.FORMAT_H_M) + "-" + TimeDateUtil.getDateStr(recyclerBarEntry.timestamp + TimeDateUtil.TIME_HOUR, TimeUtils.FORMAT_H_M)) : "";
    }

    public fr5(int i) {
        super(i);
    }
}
