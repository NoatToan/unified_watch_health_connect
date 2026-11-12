package e61;

import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import qz.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Le61/d;", "Lsz/b;", "Lcom/github/mikephil/charting/charts/CombinedChart;", "chart", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "Lc61/a;", "acclimationType", "<init>", "(Lcom/github/mikephil/charting/charts/CombinedChart;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lc61/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends sz.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f63184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f63185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h00.b f63186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i00.b f63187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c00.a f63188f;

    public d(CombinedChart combinedChart, LocalDate localDate, LocalDate localDate2, c61.a aVar) {
        combinedChart.getClass();
        localDate.getClass();
        localDate2.getClass();
        aVar.getClass();
        ViewPortHandler viewPortHandler = combinedChart.getViewPortHandler();
        viewPortHandler.getClass();
        e eVar = new e(combinedChart, localDate, localDate2, aVar);
        this.f63184b = eVar;
        this.f63185c = new b(combinedChart, localDate, localDate2, aVar);
        this.f63186d = eVar.f63189a;
        this.f63187e = eVar.f63190b;
        ChartAnimator animator = combinedChart.getAnimator();
        animator.getClass();
        this.f63188f = new c00.a(combinedChart, animator, viewPortHandler);
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b, reason: from getter */
    public final h00.b getF63186d() {
        return this.f63186d;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF173486i() {
        return this.f63188f;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d, reason: from getter */
    public final i00.b getF63187e() {
        return this.f63187e;
    }

    @Override // sz.b
    public final h<d00.a> e() {
        return this.f63185c;
    }

    @Override // sz.b
    public final h<f00.c> g() {
        return this.f63184b;
    }
}
