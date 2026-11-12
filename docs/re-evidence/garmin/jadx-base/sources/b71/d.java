package b71;

import android.content.Context;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.MarkerView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lb71/d;", "Lk00/l;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends k00.l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f16316e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BarLineChartBase<?> barLineChartBase) {
        super(barLineChartBase);
        barLineChartBase.getClass();
        Context context = barLineChartBase.getContext();
        context.getClass();
        this.f16316e = new e(context, 0, null, 6, null);
    }

    @Override // k00.l, qz.e
    public final MarkerView b() {
        return this.f16316e;
    }
}
