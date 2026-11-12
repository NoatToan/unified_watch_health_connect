package k00;

import android.content.Context;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;
import zz.r;
import zz.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lk00/k;", "Lqz/e;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "", "isReversed", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;Z)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k implements qz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BarLineChartBase<?> f101991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b00.h f101992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f101993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f101994d;

    public k(BarLineChartBase<?> barLineChartBase, boolean z14) {
        barLineChartBase.getClass();
        this.f101991a = barLineChartBase;
        this.f101992b = new b00.h(barLineChartBase, null, null, 6, null);
        ViewPortHandler viewPortHandler = barLineChartBase.getViewPortHandler();
        viewPortHandler.getClass();
        this.f101993c = new v(viewPortHandler, 0.0f, 2, null);
        Context context = barLineChartBase.getContext();
        context.getClass();
        this.f101994d = new r(context, 0, null, z14, 6, null);
    }

    @Override // qz.e
    public final zz.i a() {
        ViewPortHandler viewPortHandler = this.f101991a.getViewPortHandler();
        viewPortHandler.getClass();
        return new zz.c(viewPortHandler);
    }

    @Override // qz.e
    public final MarkerView b() {
        return this.f101994d;
    }

    @Override // qz.e
    public final zz.j c() {
        return this.f101993c;
    }

    @Override // qz.e
    public final Entry d(Highlight highlight) {
        highlight.getClass();
        Entry entry = new Entry();
        entry.setData(pz.d.a(this.f101991a, highlight.getX()));
        return entry;
    }

    @Override // qz.e
    public final zz.k e() {
        return null;
    }

    @Override // qz.e
    public final b00.b f() {
        return this.f101992b;
    }

    public /* synthetic */ k(BarLineChartBase barLineChartBase, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(barLineChartBase, (i14 & 2) != 0 ? false : z14);
    }
}
