package defpackage;

import android.content.Context;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.utils.TimeUtils;

/* JADX INFO: loaded from: classes8.dex */
public class zqr extends onq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f41585a;

    public zqr(Context context) {
        this.f41585a = context;
    }

    @Override // defpackage.onq
    public String getBarLabel(RecyclerBarEntry recyclerBarEntry) {
        int i = recyclerBarEntry.type;
        return (i == 4 || i == 2) ? TimeUtils.formatDate("M/d", Long.valueOf(recyclerBarEntry.timestamp * 1000)) : "";
    }
}
