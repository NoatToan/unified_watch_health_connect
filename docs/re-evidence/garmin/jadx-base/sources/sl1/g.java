package sl1;

import android.content.Context;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartGestureListener;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;
import p13.h0;
import zz.s;
import zz.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsl1/g;", "Lqz/e;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "Lcom/github/mikephil/charting/listener/OnChartGestureListener;", "onChartGestureListener", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;Lcom/github/mikephil/charting/listener/OnChartGestureListener;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements qz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BarLineChartBase<?> f159988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b00.h f159989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f159990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f159991d;

    public g(BarLineChartBase<?> barLineChartBase, OnChartGestureListener onChartGestureListener) {
        barLineChartBase.getClass();
        this.f159988a = barLineChartBase;
        this.f159989b = new b00.h(barLineChartBase, null, onChartGestureListener, 2, null);
        ViewPortHandler viewPortHandler = barLineChartBase.getViewPortHandler();
        viewPortHandler.getClass();
        this.f159990c = new v(viewPortHandler, 0.0f, 2, null);
        Context context = barLineChartBase.getContext();
        context.getClass();
        this.f159991d = new s(context, 0, null, 6, null);
    }

    @Override // qz.e
    public final zz.i a() {
        ViewPortHandler viewPortHandler = this.f159988a.getViewPortHandler();
        viewPortHandler.getClass();
        return new zz.c(viewPortHandler);
    }

    @Override // qz.e
    public final MarkerView b() {
        return this.f159991d;
    }

    @Override // qz.e
    public final zz.j c() {
        return this.f159990c;
    }

    @Override // qz.e
    public final Entry d(Highlight highlight) {
        highlight.getClass();
        Entry entry = new Entry();
        entry.setData(h0.b1(h0.f1(pz.d.a(this.f159988a, highlight.getX()))));
        return entry;
    }

    @Override // qz.e
    public final zz.k e() {
        return null;
    }

    @Override // qz.e
    public final b00.b f() {
        return this.f159989b;
    }

    public /* synthetic */ g(BarLineChartBase barLineChartBase, OnChartGestureListener onChartGestureListener, int i14, p005kotlin.jvm.internal.j jVar) {
        this(barLineChartBase, (i14 & 2) != 0 ? null : onChartGestureListener);
    }
}
