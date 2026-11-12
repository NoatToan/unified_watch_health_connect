package defpackage;

import android.content.Context;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public class gr5 extends gv5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f19260a;

    public gr5(Context context) {
        this(0);
        this.f19260a = context;
    }

    @Override // defpackage.gv5, defpackage.onq
    public String getBarLabel(RecyclerBarEntry recyclerBarEntry) {
        return recyclerBarEntry.getY() > 0.0f ? String.format(Locale.US, "%.1f", Float.valueOf(recyclerBarEntry.getY())) + gv5.CONNECT_VALUE_STR + AppUtil.getApp().getString(zzi.q5) + gv5.CONNECT_STR + TimeDateUtil.getDateStr(recyclerBarEntry.timestamp, TimeUtils.FORMAT_H_M) : "";
    }

    public gr5(int i) {
        super(i);
    }
}
