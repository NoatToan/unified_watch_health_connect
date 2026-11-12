package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.render.BarBoardRender;
import com.xiaomi.fitness.chart.render.XAxisRender;
import com.xiaomi.fitness.chart.render.YAxisRender;
import defpackage.a52;
import defpackage.sf2;

/* JADX INFO: loaded from: classes7.dex */
public class b52<T extends a52, Y extends sf2> extends RecyclerView.n {
    protected BarBoardRender mBarBoardRender;
    protected T mBarChartAttrs;
    protected vqr mXAxis;
    protected Y mYAxis;
    protected XAxisRender xAxisRenderer;
    protected YAxisRender yAxisRenderer;

    public b52(Y y, vqr vqrVar, T t) {
        this.mYAxis = y;
        this.mXAxis = vqrVar;
        this.mBarChartAttrs = t;
        this.yAxisRenderer = new YAxisRender(t);
        this.xAxisRenderer = new XAxisRender(this.mBarChartAttrs);
        this.mBarBoardRender = new BarBoardRender(this.mBarChartAttrs);
    }

    public void setXAxis(vqr vqrVar) {
        this.mXAxis = vqrVar;
    }

    public void setYAxis(Y y) {
        this.mYAxis = y;
    }
}
