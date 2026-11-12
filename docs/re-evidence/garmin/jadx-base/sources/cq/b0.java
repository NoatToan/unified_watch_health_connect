package cq;

import android.content.Context;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcq/b0;", "Lqz/e;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b0 implements qz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BarLineChartBase<?> f54982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b00.h f54983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zz.v f54984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zz.u f54985d;

    public b0(BarLineChartBase<?> barLineChartBase) {
        barLineChartBase.getClass();
        this.f54982a = barLineChartBase;
        this.f54983b = new b00.h(barLineChartBase, null, null, 6, null);
        ViewPortHandler viewPortHandler = barLineChartBase.getViewPortHandler();
        viewPortHandler.getClass();
        this.f54984c = new zz.v(viewPortHandler, 0.0f, 2, null);
        Context context = barLineChartBase.getContext();
        context.getClass();
        this.f54985d = new zz.u(context, 0, null, 6, null);
    }

    @Override // qz.e
    public final MarkerView b() {
        return this.f54985d;
    }

    @Override // qz.e
    public final zz.j c() {
        return this.f54984c;
    }

    @Override // qz.e
    public final Entry d(Highlight highlight) {
        highlight.getClass();
        Object data = ((BarLineScatterCandleBubbleData) this.f54982a.getData()).getEntryForHighlight(highlight).getData();
        data.getClass();
        v vVar = (v) data;
        Entry entry = new Entry();
        String str = vVar.f55106a;
        entry.setData(p13.x.k(new zz.l(str, vVar.f55109d, vVar.f55110e, null, null, null, null, null, 248, null), new zz.l(str, vVar.f55107b, vVar.f55108c, null, null, null, null, null, 248, null)));
        return entry;
    }

    @Override // qz.e
    public final zz.k e() {
        return null;
    }

    @Override // qz.e
    public final b00.b f() {
        return this.f54983b;
    }
}
