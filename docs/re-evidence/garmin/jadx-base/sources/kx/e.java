package kx;

import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import qz.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkx/e;", "Lsz/b;", "Lcom/github/mikephil/charting/charts/CombinedChart;", "chart", "", "showAllDay", "<init>", "(Lcom/github/mikephil/charting/charts/CombinedChart;Z)V", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends sz.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f107014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gt.g f107015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h00.b f107016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i00.b f107017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c00.a f107018f;

    public e(CombinedChart combinedChart, boolean z14) {
        h00.b eVar;
        combinedChart.getClass();
        g gVar = new g(combinedChart);
        this.f107014b = gVar;
        this.f107015c = new gt.g(combinedChart, combinedChart);
        if (z14) {
            eVar = gVar.f107029a;
        } else {
            ViewPortHandler viewPortHandler = combinedChart.getViewPortHandler();
            viewPortHandler.getClass();
            XAxis xAxis = combinedChart.getXAxis();
            xAxis.getClass();
            Transformer transformer = combinedChart.getTransformer(YAxis.AxisDependency.LEFT);
            transformer.getClass();
            eVar = new h00.e(viewPortHandler, xAxis, transformer, pz.a.LARGE_LIMIT_DOT_PATTERN, pz.b.DEFAULT_LABEL_PATTERN, false);
        }
        this.f107016d = eVar;
        this.f107017e = gVar.f107030b;
        DataRenderer renderer = combinedChart.getRenderer();
        renderer.getClass();
        this.f107018f = (c00.a) renderer;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b, reason: from getter */
    public final h00.b getF107016d() {
        return this.f107016d;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF173486i() {
        return this.f107018f;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d, reason: from getter */
    public final i00.b getF107017e() {
        return this.f107017e;
    }

    @Override // sz.b
    public final h<d00.a> e() {
        return this.f107015c;
    }

    @Override // sz.b
    public final h<f00.c> g() {
        return this.f107014b;
    }

    public /* synthetic */ e(CombinedChart combinedChart, boolean z14, int i14, j jVar) {
        this(combinedChart, (i14 & 2) != 0 ? true : z14);
    }
}
