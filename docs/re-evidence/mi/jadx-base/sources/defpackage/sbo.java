package defpackage;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.render.SleepDayXAxisRender;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.data.valueformatter.SleepRateHighLightMarkValueFormatter;

/* JADX INFO: loaded from: classes9.dex */
public class sbo extends b52<r02, rtr> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t02 f33490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public onq f33491b;
    public onq c;
    public SleepDayXAxisRender d;
    public int e;
    public boolean f;
    public long g;
    public long h;

    public sbo(rtr rtrVar, vqr vqrVar, r02 r02Var) {
        super(rtrVar, vqrVar, r02Var);
        this.e = 0;
        this.f = false;
        this.f33491b = new qt5(0);
        gv5 gv5Var = new gv5(0);
        this.c = gv5Var;
        this.f33490a = new t02((r02) this.mBarChartAttrs, this.f33491b, gv5Var);
        this.d = new SleepDayXAxisRender(r02Var);
    }

    public void c(int i) {
        this.e = i;
        if (i > 0) {
            Y y = this.mYAxis;
            int iMax = Math.max(Math.round((i - ((rtr) y).mAxisMinimum) / (((int) (((rtr) y).mAxisMaximum - ((rtr) y).mAxisMinimum)) / ((rtr) y).f)), 0);
            Y y2 = this.mYAxis;
            ((rtr) y2).g = Math.min(iMax, ((rtr) y2).f);
        }
    }

    public void d(long j, long j2) {
        this.g = j;
        this.h = j2;
        onq onqVar = this.c;
        if (onqVar instanceof SleepRateHighLightMarkValueFormatter) {
            ((SleepRateHighLightMarkValueFormatter) onqVar).setMaxTime(j2);
        }
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
        Logger.d("BarChart Render click draw off time:" + System.currentTimeMillis(), new Object[0]);
        if (this.f) {
            this.f33490a.a(canvas, recyclerView, (rtr) this.mYAxis, this.g, this.h);
            this.f33490a.drawAbnormalHighLight(canvas, recyclerView, (rtr) this.mYAxis, this.g, this.h);
        } else {
            this.f33490a.b(canvas, recyclerView, (rtr) this.mYAxis);
            this.f33490a.drawHighLight(canvas, recyclerView, (rtr) this.mYAxis);
        }
        int i = this.e;
        if (i > 0) {
            this.f33490a.c(canvas, recyclerView, (rtr) this.mYAxis, i);
        }
        this.f33490a.d(canvas, recyclerView, (rtr) this.mYAxis);
    }

    public void setHighLightValueFormatter(onq onqVar) {
        this.c = onqVar;
        this.f33490a.setHighLightValueFormatter(onqVar);
    }
}
