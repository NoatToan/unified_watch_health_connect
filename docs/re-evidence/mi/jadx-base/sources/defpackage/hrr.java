package defpackage;

import android.content.Context;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SportRecordEntry;

/* JADX INFO: loaded from: classes7.dex */
public class hrr extends onq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f20385a;

    public hrr(Context context) {
        this.f20385a = context;
    }

    @Override // defpackage.onq
    public String getBarLabel(RecyclerBarEntry recyclerBarEntry) {
        int x = (int) ((SportRecordEntry) recyclerBarEntry).getX();
        float f = (x * 1.0f) / 60.0f;
        return (f <= 0.0f || f >= 1.0f) ? Integer.toString(x / 60) : xr5.f(f);
    }

    @Override // defpackage.onq
    public String getFormattedValue(float f) {
        return xr5.f(f / 60.0f);
    }
}
