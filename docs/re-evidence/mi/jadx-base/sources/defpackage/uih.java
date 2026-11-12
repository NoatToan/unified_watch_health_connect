package defpackage;

import android.content.Context;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.utils.TimeDateUtil;

/* JADX INFO: loaded from: classes7.dex */
public class uih extends gv5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f35794a;

    public uih(Context context) {
        this(0);
        this.f35794a = context;
    }

    @Override // defpackage.gv5, defpackage.onq
    public String getBarLabel(RecyclerBarEntry recyclerBarEntry) {
        return recyclerBarEntry.getY() > 0.0f ? (this.f35794a.getString(c0j.Xa) + " " + ((int) recyclerBarEntry.getY())) + gv5.CONNECT_STR + TimeDateUtil.getDateYYYYMMddLocalFormat(recyclerBarEntry.timestamp * 1000) : "";
    }

    public uih(int i) {
        super(i);
    }
}
