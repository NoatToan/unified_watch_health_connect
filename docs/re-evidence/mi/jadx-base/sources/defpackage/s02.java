package defpackage;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.log.Logger;

/* JADX INFO: loaded from: classes7.dex */
public class s02 extends b52<r02, rtr> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t02 f33122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public onq f33123b;
    public onq c;
    public Canvas d;
    public RecyclerView e;

    public s02(rtr rtrVar, vqr vqrVar, r02 r02Var) {
        super(rtrVar, vqrVar, r02Var);
        this.f33123b = new qt5(0);
        gv5 gv5Var = new gv5(0);
        this.c = gv5Var;
        this.f33122a = new t02((r02) this.mBarChartAttrs, this.f33123b, gv5Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        super.onDraw(canvas, recyclerView, zVar);
        this.d = canvas;
        this.e = recyclerView;
        this.yAxisRenderer.drawYAxisLabel(canvas, recyclerView, this.mYAxis);
        this.yAxisRenderer.drawHorizontalLine(canvas, recyclerView, this.mYAxis);
        this.yAxisRenderer.drawStandardLines(canvas, recyclerView, (rtr) this.mYAxis);
        this.xAxisRenderer.drawVerticalLine(canvas, recyclerView, this.mXAxis);
        this.xAxisRenderer.drawXAxis(canvas, recyclerView, this.mXAxis);
        this.xAxisRenderer.drawXAxisDisplay(canvas, recyclerView, this.mBarChartAttrs);
        this.xAxisRenderer.drawBackground(canvas, recyclerView);
        this.mBarBoardRender.drawBarBorder(canvas, recyclerView);
        this.f33122a.drawHighLight(canvas, recyclerView, (rtr) this.mYAxis);
        Logger.d("BarChart Render click draw off time:" + System.currentTimeMillis(), new Object[0]);
        this.f33122a.b(canvas, recyclerView, (rtr) this.mYAxis);
        this.f33122a.h(canvas, recyclerView, (rtr) this.mYAxis);
        this.f33122a.d(canvas, recyclerView, (rtr) this.mYAxis);
        this.f33122a.g(canvas, recyclerView, (rtr) this.mYAxis);
    }

    public void setHighLightValueFormatter(onq onqVar) {
        this.c = onqVar;
        this.f33122a.setHighLightValueFormatter(onqVar);
    }
}
