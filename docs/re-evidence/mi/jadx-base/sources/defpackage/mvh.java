package defpackage;

import android.content.Context;
import com.xiaomi.fitness.chart.entrys.PhysicalStatusEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;

/* JADX INFO: loaded from: classes7.dex */
public class mvh extends gv5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f27255a;

    public mvh(Context context) {
        this(0);
        this.f27255a = context;
    }

    @Override // defpackage.gv5, defpackage.onq
    public String getBarLabel(RecyclerBarEntry recyclerBarEntry) {
        if (!(recyclerBarEntry instanceof PhysicalStatusEntry)) {
            return "";
        }
        return this.f27255a.getString(c0j.nb) + gv5.CONNECT_STR + this.f27255a.getString(c0j.db) + gv5.CONNECT_STR + this.f27255a.getString(c0j.eb);
    }

    public mvh(int i) {
        super(i);
    }
}
