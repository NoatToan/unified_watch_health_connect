package b81;

import android.content.Context;
import b00.h;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;
import zz.j;
import zz.k;
import zz.p;
import zz.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lb81/d;", "Lqz/e;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements qz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BarLineChartBase<?> f16398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f16399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f16400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f16401d;

    public d(BarLineChartBase<?> barLineChartBase) {
        barLineChartBase.getClass();
        this.f16398a = barLineChartBase;
        this.f16399b = new h(barLineChartBase, null, null, 6, null);
        ViewPortHandler viewPortHandler = barLineChartBase.getViewPortHandler();
        viewPortHandler.getClass();
        this.f16400c = new v(viewPortHandler, 0.0f, 2, null);
        Context context = barLineChartBase.getContext();
        context.getClass();
        this.f16401d = new p(context);
    }

    @Override // qz.e
    public final MarkerView b() {
        return this.f16401d;
    }

    @Override // qz.e
    public final j c() {
        return this.f16400c;
    }

    @Override // qz.e
    public final Entry d(Highlight highlight) {
        highlight.getClass();
        Entry entryForHighlight = ((BarLineScatterCandleBubbleData) this.f16398a.getData()).getEntryForHighlight(highlight);
        return entryForHighlight == null ? new Entry() : entryForHighlight;
    }

    @Override // qz.e
    public final k e() {
        return null;
    }

    @Override // qz.e
    public final b00.b f() {
        return this.f16399b;
    }
}
