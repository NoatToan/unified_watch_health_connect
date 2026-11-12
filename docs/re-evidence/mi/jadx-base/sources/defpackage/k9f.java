package defpackage;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public class k9f extends b52<r02, vnq> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l9f f23631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public onq f23632b;

    public k9f(vnq vnqVar, vqr vqrVar, r02 r02Var) {
        super(vnqVar, vqrVar, r02Var);
        gv5 gv5Var = new gv5(0);
        this.f23632b = gv5Var;
        this.f23631a = new l9f((r02) this.mBarChartAttrs, gv5Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        super.onDraw(canvas, recyclerView, zVar);
        if (((r02) this.mBarChartAttrs).y0) {
            this.mBarBoardRender.drawBarBorder(canvas, recyclerView);
            this.yAxisRenderer.drawHorizontalLine(canvas, recyclerView, this.mYAxis);
            this.xAxisRenderer.drawVerticalLine(canvas, recyclerView, this.mXAxis);
            this.xAxisRenderer.drawXAxisDisplay(canvas, recyclerView, this.mBarChartAttrs);
            this.f23631a.b(canvas, recyclerView, (rtr) this.mYAxis);
            return;
        }
        this.yAxisRenderer.drawYAxisLabel(canvas, recyclerView, this.mYAxis);
        this.yAxisRenderer.drawHorizontalLine(canvas, recyclerView, this.mYAxis);
        this.xAxisRenderer.drawVerticalLine(canvas, recyclerView, this.mXAxis);
        this.xAxisRenderer.drawXAxis(canvas, recyclerView, this.mXAxis);
        this.xAxisRenderer.drawBackground(canvas, recyclerView);
        this.f23631a.a(canvas, recyclerView, (rtr) this.mYAxis);
        this.f23631a.drawHighLight(canvas, recyclerView, this.mYAxis);
        this.mBarBoardRender.drawBarBorder(canvas, recyclerView);
    }

    public void setHighLightValueFormatter(onq onqVar) {
        this.f23632b = onqVar;
        this.f23631a.setHighLightValueFormatter(onqVar);
    }
}
