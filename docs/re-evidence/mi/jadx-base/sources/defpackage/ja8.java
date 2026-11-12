package defpackage;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public class ja8 extends b52<r02, vnq> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ka8 f22586a;

    public ja8(vnq vnqVar, vqr vqrVar, r02 r02Var) {
        super(vnqVar, vqrVar, r02Var);
        this.f22586a = new ka8((r02) this.mBarChartAttrs);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        super.onDraw(canvas, recyclerView, zVar);
        this.yAxisRenderer.drawHorizontalLine(canvas, recyclerView, this.mYAxis);
        this.xAxisRenderer.drawXAxis(canvas, recyclerView, this.mXAxis);
        this.f22586a.a(canvas, recyclerView, (rtr) this.mYAxis);
    }
}
