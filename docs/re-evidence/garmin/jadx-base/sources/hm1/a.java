package hm1;

import android.content.Context;
import b00.h;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;
import p13.h0;
import pz.d;
import qz.e;
import zz.c;
import zz.i;
import zz.j;
import zz.k;
import zz.u;
import zz.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhm1/a;", "Lqz/e;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BarLineChartBase<?> f84492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f84493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f84494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f84495d;

    public a(BarLineChartBase<?> barLineChartBase) {
        barLineChartBase.getClass();
        this.f84492a = barLineChartBase;
        this.f84493b = new h(barLineChartBase, null, null, 6, null);
        ViewPortHandler viewPortHandler = barLineChartBase.getViewPortHandler();
        viewPortHandler.getClass();
        this.f84494c = new v(viewPortHandler, 0.0f, 2, null);
        Context context = barLineChartBase.getContext();
        context.getClass();
        this.f84495d = new u(context, 0, null, 6, null);
    }

    @Override // qz.e
    public final i a() {
        ViewPortHandler viewPortHandler = this.f84492a.getViewPortHandler();
        viewPortHandler.getClass();
        return new c(viewPortHandler);
    }

    @Override // qz.e
    public final MarkerView b() {
        return this.f84495d;
    }

    @Override // qz.e
    public final j c() {
        return this.f84494c;
    }

    @Override // qz.e
    public final Entry d(Highlight highlight) {
        highlight.getClass();
        Entry entry = new Entry();
        entry.setData(h0.b1(h0.f1(d.a(this.f84492a, highlight.getX()))));
        return entry;
    }

    @Override // qz.e
    public final k e() {
        return null;
    }

    @Override // qz.e
    public final b00.b f() {
        return this.f84493b;
    }
}
