package defpackage;

import android.content.Context;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.utils.TimeDateUtil;

/* JADX INFO: loaded from: classes7.dex */
public class mwm extends gv5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f27296a;

    public mwm(Context context) {
        this(0);
        this.f27296a = context;
    }

    @Override // defpackage.gv5, defpackage.onq
    public String getBarLabel(RecyclerBarEntry recyclerBarEntry) {
        int y = (int) recyclerBarEntry.getY();
        return recyclerBarEntry.getY() > 0.0f ? (y + gv5.CONNECT_VALUE_STR + this.f27296a.getResources().getQuantityString(qxi.R0, y)) + gv5.CONNECT_STR + TimeDateUtil.getDateFormated(TimeDateUtil.localDateToTimestamp(recyclerBarEntry.localDate) * 1000, this.f27296a.getString(c0j.l)) : "";
    }

    public mwm(int i) {
        super(i);
    }
}
