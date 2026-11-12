package defpackage;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public class yfe extends b52<vfe, rtr> {
    private onq mHighLightValueFormatter;
    private zfe mLineChartRender;

    public yfe(rtr rtrVar, vqr vqrVar, vfe vfeVar) {
        super(rtrVar, vqrVar, vfeVar);
        gv5 gv5Var = new gv5(0);
        this.mHighLightValueFormatter = gv5Var;
        this.mLineChartRender = new zfe((vfe) this.mBarChartAttrs, gv5Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        super.onDraw(canvas, recyclerView, zVar);
        this.yAxisRenderer.drawYAxisLabel(canvas, recyclerView, this.mYAxis);
        this.yAxisRenderer.drawHorizontalLine(canvas, recyclerView, this.mYAxis);
        this.xAxisRenderer.drawVerticalLine(canvas, recyclerView, this.mXAxis);
        this.xAxisRenderer.drawXAxis(canvas, recyclerView, this.mXAxis);
        this.xAxisRenderer.drawBackground(canvas, recyclerView);
        this.mBarBoardRender.drawBarBorder(canvas, recyclerView);
        this.mLineChartRender.drawLineChart(canvas, recyclerView, (rtr) this.mYAxis);
        this.mLineChartRender.drawHighLight(canvas, recyclerView, (rtr) this.mYAxis);
    }

    public void setBreakPointLine(Boolean bool) {
        this.mLineChartRender.setBreakPointLine(bool);
    }

    public void setHighLightValueFormatter(onq onqVar) {
        this.mHighLightValueFormatter = onqVar;
        this.mLineChartRender.setHighLightValueFormatter(onqVar);
    }
}
