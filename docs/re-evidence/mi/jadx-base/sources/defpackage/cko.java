package defpackage;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.health.stress.StressDayFaceLineChartRender;
import com.xiaomi.fitness.health.stress.StressFaceXAxisRender;

/* JADX INFO: loaded from: classes9.dex */
public class cko extends b52<vfe, rtr> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public StressDayFaceLineChartRender f5436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public StressFaceXAxisRender f5437b;
    public onq c;

    public cko(rtr rtrVar, vqr vqrVar, vfe vfeVar) {
        super(rtrVar, vqrVar, vfeVar);
        this.c = new gv5(0);
        this.f5436a = new StressDayFaceLineChartRender((vfe) this.mBarChartAttrs, this.c);
        this.f5437b = new StressFaceXAxisRender(this.mBarChartAttrs);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        super.onDraw(canvas, recyclerView, zVar);
        this.yAxisRenderer.drawsStressRightYAxisLabel(canvas, recyclerView, this.mYAxis, true);
        this.yAxisRenderer.drawHorizontalLine(canvas, recyclerView, this.mYAxis);
        this.f5437b.drawXAxis(canvas, recyclerView, this.mXAxis);
        this.mBarBoardRender.drawBarBorder(canvas, recyclerView);
        this.f5436a.drawLineChart(canvas, recyclerView, (rtr) this.mYAxis);
    }
}
