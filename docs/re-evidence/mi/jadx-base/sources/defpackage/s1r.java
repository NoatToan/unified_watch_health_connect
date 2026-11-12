package defpackage;

import android.content.Context;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.util.HealthUtil;

/* JADX INFO: loaded from: classes7.dex */
public class s1r extends gv5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f33181a;

    public s1r(Context context) {
        this(0);
        this.f33181a = context;
    }

    @Override // defpackage.gv5, defpackage.onq
    public String getBarLabel(RecyclerBarEntry recyclerBarEntry) {
        return recyclerBarEntry.getY() > 0.0f ? (((int) recyclerBarEntry.getY()) + gv5.CONNECT_VALUE_STR + this.f33181a.getString(c0j.ro)) + gv5.CONNECT_STR + HealthUtil.getWeekDateStr(TimeDateUtil.timestampToLocalDate(recyclerBarEntry.timestamp).minusDays(6)) : "";
    }

    public s1r(int i) {
        super(i);
    }
}
