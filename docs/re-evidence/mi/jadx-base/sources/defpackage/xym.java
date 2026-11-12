package defpackage;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.render.SleepDayXAxisRender;
import com.xiaomi.fitness.common.log.Logger;

/* JADX INFO: loaded from: classes9.dex */
public class xym extends b52<r02, rtr> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t02 f39591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public onq f39592b;
    public onq c;
    public SleepDayXAxisRender d;

    public xym(rtr rtrVar, vqr vqrVar, r02 r02Var) {
        super(rtrVar, vqrVar, r02Var);
        this.f39592b = new qt5(0);
        gv5 gv5Var = new gv5(0);
        this.c = gv5Var;
        this.f39591a = new t02((r02) this.mBarChartAttrs, this.f39592b, gv5Var);
        this.d = new SleepDayXAxisRender(r02Var);
    }

    public void c(long j, long j2) {
        this.d.setTime(j, j2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        super.onDraw(canvas, recyclerView, zVar);
        this.yAxisRenderer.drawYAxisLabel(canvas, recyclerView, this.mYAxis);
        this.yAxisRenderer.drawHorizontalLine(canvas, recyclerView, this.mYAxis);
        this.xAxisRenderer.drawVerticalLine(canvas, recyclerView, this.mXAxis);
        this.d.drawXAxisLabel(recyclerView, canvas);
        this.xAxisRenderer.drawXAxisDisplay(canvas, recyclerView, this.mBarChartAttrs);
        this.xAxisRenderer.drawBackground(canvas, recyclerView);
        this.mBarBoardRender.drawBarBorder(canvas, recyclerView);
        this.f39591a.drawHighLight(canvas, recyclerView, (rtr) this.mYAxis);
        Logger.d("BarChart Render click draw off time:" + System.currentTimeMillis(), new Object[0]);
        this.f39591a.b(canvas, recyclerView, (rtr) this.mYAxis);
        this.f39591a.d(canvas, recyclerView, (rtr) this.mYAxis);
    }

    public void setHighLightValueFormatter(onq onqVar) {
        this.c = onqVar;
        this.f39591a.setHighLightValueFormatter(onqVar);
    }
}
