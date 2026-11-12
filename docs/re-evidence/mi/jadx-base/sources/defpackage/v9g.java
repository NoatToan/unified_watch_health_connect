package defpackage;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.render.BarBoardRender;

/* JADX INFO: loaded from: classes7.dex */
public class v9g extends b52<r02, rtr> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w9g f36640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BarBoardRender f36641b;
    public onq c;

    public v9g(rtr rtrVar, vqr vqrVar, r02 r02Var) {
        super(rtrVar, vqrVar, r02Var);
        gv5 gv5Var = new gv5(0);
        this.c = gv5Var;
        this.f36640a = new w9g((r02) this.mBarChartAttrs, gv5Var);
        this.f36641b = new BarBoardRender(this.mBarChartAttrs);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        Y y;
        super.onDraw(canvas, recyclerView, zVar);
        if (this.mXAxis == null || (y = this.mYAxis) == 0) {
            return;
        }
        this.yAxisRenderer.drawYAxisLabel(canvas, recyclerView, y);
        this.yAxisRenderer.drawHorizontalLine(canvas, recyclerView, this.mYAxis);
        this.xAxisRenderer.drawVerticalLine(canvas, recyclerView, this.mXAxis);
        this.xAxisRenderer.drawXAxis(canvas, recyclerView, this.mXAxis);
        this.xAxisRenderer.drawXAxisDisplay(canvas, recyclerView, this.mBarChartAttrs);
        this.xAxisRenderer.drawBackground(canvas, recyclerView);
        this.f36641b.drawBarBorder(canvas, recyclerView);
        this.f36640a.a(canvas, recyclerView, (rtr) this.mYAxis);
        this.f36640a.drawHighLight(canvas, recyclerView, (rtr) this.mYAxis);
    }

    public void setHighLightValueFormatter(onq onqVar) {
        this.c = onqVar;
        this.f36640a.setHighLightValueFormatter(onqVar);
    }
}
