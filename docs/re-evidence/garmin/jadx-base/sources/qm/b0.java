package qm;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.View;
import com.github.mikephil.chartingv2.charts.LineChart;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "core-ktx_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b0 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hz.h f145267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LineChart f145268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f145269c;

    public b0(hz.h hVar, LineChart lineChart, c0 c0Var) {
        this.f145267a = hVar;
        this.f145268b = lineChart;
        this.f145269c = c0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view2, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25) {
        view2.removeOnLayoutChangeListener(this);
        float chartHeight = this.f145268b.getViewPortHandler().getChartHeight();
        c0 c0Var = this.f145269c;
        this.f145267a.f86400b = new LinearGradient(0.0f, 0.0f, 0.0f, chartHeight, c0Var.f145336q, c0.w(c0Var), Shader.TileMode.CLAMP);
    }
}
