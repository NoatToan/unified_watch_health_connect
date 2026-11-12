package defpackage;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.render.SleepChartRender;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class tim extends RecyclerView.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public qim f34744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SleepChartRender f34745b;
    public onq c;

    public tim(qim qimVar) {
        this.f34744a = qimVar;
        gv5 gv5Var = new gv5(0);
        this.c = gv5Var;
        this.f34745b = new SleepChartRender(this.f34744a, gv5Var);
    }

    public void c(Float f) {
        this.f34745b.setItemHeightOffset(f.floatValue());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        super.onDraw(canvas, recyclerView, zVar);
        this.f34745b.drawLines(canvas, recyclerView);
        this.f34745b.drawSleepChart(canvas, recyclerView);
        this.f34745b.drawHighLight(canvas, recyclerView);
    }

    public void setHighLightValueFormatter(onq onqVar) {
        this.c = onqVar;
        this.f34745b.setHighLightValueFormatter(onqVar);
    }

    public void setSleepItemStatus(List<Boolean> list) {
        this.f34745b.setSleepItemStatus(list);
    }

    public void updateStageSize(int i) {
        this.f34745b.updateStageSize(i);
    }
}
