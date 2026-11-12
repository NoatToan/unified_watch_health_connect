package ie1;

import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.renderer.DataRenderer;
import f00.c;
import p005kotlin.Metadata;
import qz.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lie1/b;", "Lsz/b;", "Lcom/github/mikephil/charting/charts/CombinedChart;", "chart", "<init>", "(Lcom/github/mikephil/charting/charts/CombinedChart;)V", "gcm-respiration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends sz.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ke1.b f93100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final he1.b f93101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h00.b f93102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i00.b f93103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c00.a f93104f;

    public b(CombinedChart combinedChart) {
        combinedChart.getClass();
        ke1.b bVar = new ke1.b(combinedChart);
        this.f93100b = bVar;
        this.f93101c = new he1.b(combinedChart, combinedChart);
        this.f93102d = bVar.f104543a;
        this.f93103e = bVar.f104544b;
        DataRenderer renderer = combinedChart.getRenderer();
        renderer.getClass();
        this.f93104f = (c00.a) renderer;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b, reason: from getter */
    public final h00.b getF93102d() {
        return this.f93102d;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF173486i() {
        return this.f93104f;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d, reason: from getter */
    public final i00.b getF93103e() {
        return this.f93103e;
    }

    @Override // sz.b
    public final h<d00.a> e() {
        return this.f93101c;
    }

    @Override // sz.b
    public final h<c> g() {
        return this.f93100b;
    }
}
