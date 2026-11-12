package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.model.EnergyEntry;
import com.xiaomi.fitness.chart.render.BaseChartRender;

/* JADX INFO: loaded from: classes7.dex */
public class ka8 extends BaseChartRender<RecyclerBarEntry, r02> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f23654a;

    public ka8(r02 r02Var) {
        super(r02Var);
    }

    public final void a(Canvas canvas, RecyclerView recyclerView, rtr rtrVar) {
        float width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        float paddingLeft = recyclerView.getPaddingLeft();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            EnergyEntry energyEntry = (EnergyEntry) childAt.getTag();
            b(recyclerView.getContext(), canvas, eu3.d(childAt, recyclerView, rtrVar, this.mBarChartAttrs, energyEntry), paddingLeft, width, energyEntry);
        }
    }

    public final void b(Context context, Canvas canvas, RectF rectF, float f, float f2, EnergyEntry energyEntry) {
        if (xr5.k(rectF.right, f)) {
            return;
        }
        float f3 = rectF.left;
        if (f3 < f && rectF.right > f) {
            rectF.left = f;
            Path pathC = zi3.c(rectF, 36.0f, 7);
            this.mBarChartPaint.setColor(((r02) this.mBarChartAttrs).i0);
            canvas.drawPath(pathC, this.mBarChartPaint);
            return;
        }
        if (xr5.a(f3, f) && xr5.k(rectF.right, f2)) {
            this.mBarChartPaint.setColor(EnergyEntry.a(context, energyEntry.f11770a));
            int i = energyEntry.f11770a;
            canvas.drawPath((i == 2 || i == 1) ? zi3.c(rectF, 36.0f, 2) : zi3.c(rectF, 36.0f, 1), this.mBarChartPaint);
        } else {
            if (!xr5.k(rectF.left, f2) || rectF.right <= f2) {
                return;
            }
            float f4 = rectF.left;
            rectF.right = f4 + (f2 - f4);
            Path pathC2 = zi3.c(rectF, 36.0f, 5);
            this.mBarChartPaint.setColor(((r02) this.mBarChartAttrs).i0);
            canvas.drawPath(pathC2, this.mBarChartPaint);
        }
    }

    @Override // com.xiaomi.fitness.chart.render.BaseChartRender
    public int getChartColor(RecyclerBarEntry recyclerBarEntry) {
        return EnergyEntry.a(this.f23654a, ((EnergyEntry) recyclerBarEntry).f11770a);
    }
}
