package defpackage;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.log.Logger;

/* JADX INFO: loaded from: classes9.dex */
public class h1r extends b52<r02, rtr> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t02 f19587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public onq f19588b;
    public onq c;

    public h1r(rtr rtrVar, vqr vqrVar, r02 r02Var) {
        super(rtrVar, vqrVar, r02Var);
        this.f19588b = new qt5(0);
        gv5 gv5Var = new gv5(0);
        this.c = gv5Var;
        this.f19587a = new t02((r02) this.mBarChartAttrs, this.f19588b, gv5Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        Y y;
        super.onDraw(canvas, recyclerView, zVar);
        if (this.mXAxis == null || (y = this.mYAxis) == 0) {
            return;
        }
        this.yAxisRenderer.drawYAxisLabelVitality(canvas, recyclerView, y, 100.0f / ((rtr) y).mAxisMaximum);
        this.yAxisRenderer.drawHorizontalVitality(canvas, recyclerView, Float.valueOf(100.0f / ((rtr) this.mYAxis).mAxisMaximum));
        this.xAxisRenderer.drawVerticalLine(canvas, recyclerView, this.mXAxis);
        this.xAxisRenderer.drawXAxis(canvas, recyclerView, this.mXAxis);
        this.xAxisRenderer.drawXAxisDisplay(canvas, recyclerView, this.mBarChartAttrs);
        this.xAxisRenderer.drawBackground(canvas, recyclerView);
        this.mBarBoardRender.drawBarBorder1(canvas, recyclerView);
        this.f19587a.drawHighLight(canvas, recyclerView, (rtr) this.mYAxis);
        Logger.d("BarChart Render click draw off time:" + System.currentTimeMillis(), new Object[0]);
        this.f19587a.b(canvas, recyclerView, (rtr) this.mYAxis);
        this.f19587a.d(canvas, recyclerView, (rtr) this.mYAxis);
    }

    public void setHighLightValueFormatter(onq onqVar) {
        this.c = onqVar;
        this.f19587a.setHighLightValueFormatter(onqVar);
    }
}
