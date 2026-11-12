package h52;

import android.content.Context;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;
import zz.j;
import zz.k;
import zz.q;
import zz.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lh52/f;", "Lqz/e;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;)V", "gcm-wheelchair_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements qz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BarLineChartBase<?> f82125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b00.h f82126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f82127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f82128d;

    public f(BarLineChartBase<?> barLineChartBase) {
        barLineChartBase.getClass();
        this.f82125a = barLineChartBase;
        this.f82126b = new b00.h(barLineChartBase, null, null, 6, null);
        ViewPortHandler viewPortHandler = barLineChartBase.getViewPortHandler();
        viewPortHandler.getClass();
        this.f82127c = new v(viewPortHandler, 0.0f, 2, null);
        Context context = barLineChartBase.getContext();
        context.getClass();
        this.f82128d = new q(context, 0, null, 6, null);
    }

    @Override // qz.e
    public final MarkerView b() {
        return this.f82128d;
    }

    @Override // qz.e
    public final j c() {
        return this.f82127c;
    }

    @Override // qz.e
    public final Entry d(Highlight highlight) {
        highlight.getClass();
        Entry entryForHighlight = ((BarLineScatterCandleBubbleData) this.f82125a.getData()).getEntryForHighlight(highlight);
        entryForHighlight.getClass();
        return entryForHighlight;
    }

    @Override // qz.e
    public final k e() {
        return null;
    }

    @Override // qz.e
    public final b00.b f() {
        return this.f82126b;
    }
}
