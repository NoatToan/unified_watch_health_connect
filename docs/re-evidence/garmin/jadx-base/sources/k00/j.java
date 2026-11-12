package k00;

import android.content.Context;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;
import zz.q;
import zz.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lk00/j;", "Lqz/e;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class j implements qz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BarLineChartBase<?> f101987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b00.h f101988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f101989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f101990d;

    public j(BarLineChartBase<?> barLineChartBase) {
        barLineChartBase.getClass();
        this.f101987a = barLineChartBase;
        this.f101988b = new b00.h(barLineChartBase, null, null, 6, null);
        ViewPortHandler viewPortHandler = barLineChartBase.getViewPortHandler();
        viewPortHandler.getClass();
        this.f101989c = new v(viewPortHandler, 0.0f, 2, null);
        Context context = barLineChartBase.getContext();
        context.getClass();
        this.f101990d = new q(context, 0, null, 6, null);
    }

    @Override // qz.e
    public final zz.i a() {
        ViewPortHandler viewPortHandler = this.f101987a.getViewPortHandler();
        viewPortHandler.getClass();
        return new zz.c(viewPortHandler);
    }

    @Override // qz.e
    public final MarkerView b() {
        return this.f101990d;
    }

    @Override // qz.e
    public final zz.j c() {
        return this.f101989c;
    }

    @Override // qz.e
    public final Entry d(Highlight highlight) {
        highlight.getClass();
        Entry entryForHighlight = ((BarLineScatterCandleBubbleData) this.f101987a.getData()).getEntryForHighlight(highlight);
        entryForHighlight.getClass();
        return entryForHighlight;
    }

    @Override // qz.e
    public final zz.k e() {
        return null;
    }

    @Override // qz.e
    public b00.b f() {
        return this.f101988b;
    }
}
