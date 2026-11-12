package i60;

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
import zz.q;
import zz.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li60/e;", "Lqz/e;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;)V", "gcm-critical-swim-speed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements qz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BarLineChartBase<?> f91811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f91812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f91813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f91814d;

    public e(BarLineChartBase<?> barLineChartBase) {
        barLineChartBase.getClass();
        this.f91811a = barLineChartBase;
        this.f91812b = new h(barLineChartBase, new i31.e(9), null, 4, null);
        ViewPortHandler viewPortHandler = barLineChartBase.getViewPortHandler();
        viewPortHandler.getClass();
        this.f91813c = new v(viewPortHandler, 0.0f, 2, null);
        Context context = barLineChartBase.getContext();
        context.getClass();
        this.f91814d = new q(context, 0, null, 6, null);
    }

    @Override // qz.e
    public final MarkerView b() {
        return this.f91814d;
    }

    @Override // qz.e
    public final j c() {
        return this.f91813c;
    }

    @Override // qz.e
    public final Entry d(Highlight highlight) {
        highlight.getClass();
        Entry entryForHighlight = ((BarLineScatterCandleBubbleData) this.f91811a.getData()).getEntryForHighlight(highlight);
        return entryForHighlight == null ? new Entry() : entryForHighlight;
    }

    @Override // qz.e
    public final k e() {
        return null;
    }

    @Override // qz.e
    public final b00.b f() {
        return this.f91812b;
    }
}
