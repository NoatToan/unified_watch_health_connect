package defpackage;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.health.stress.CurseMoodFaceChartRender;
import com.xiaomi.fitness.health.stress.StressFaceXAxisRender;

/* JADX INFO: loaded from: classes9.dex */
public class z85 extends b52<vfe, rtr> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CurseMoodFaceChartRender f41006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public StressFaceXAxisRender f41007b;
    public onq c;

    public z85(rtr rtrVar, vqr vqrVar, vfe vfeVar) {
        super(rtrVar, vqrVar, vfeVar);
        gv5 gv5Var = new gv5(0);
        this.c = gv5Var;
        this.f41006a = new CurseMoodFaceChartRender((vfe) this.mBarChartAttrs, gv5Var);
        this.f41007b = new StressFaceXAxisRender(this.mBarChartAttrs);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        super.onDraw(canvas, recyclerView, zVar);
        this.yAxisRenderer.drawsStressRightYAxisLabel(canvas, recyclerView, this.mYAxis, true);
        this.yAxisRenderer.drawHorizontalLine(canvas, recyclerView, this.mYAxis);
        this.f41007b.drawXAxis(canvas, recyclerView, this.mXAxis);
        this.yAxisRenderer.drawYAxisLabel(canvas, recyclerView, this.mYAxis);
        this.mBarBoardRender.drawBarBorder(canvas, recyclerView);
        this.f41006a.drawLineChart(canvas, recyclerView, (rtr) this.mYAxis);
    }
}
