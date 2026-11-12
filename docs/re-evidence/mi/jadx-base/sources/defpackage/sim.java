package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SleepEntry;
import com.xiaomi.fitness.chart.render.BaseChartRender;
import com.xiaomi.fitness.chart.util.RectFWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class sim extends BaseChartRender<SleepEntry, r02> {
    public sim(r02 r02Var, onq onqVar) {
        super(r02Var, onqVar);
    }

    public void a(Canvas canvas, RectFWrapper rectFWrapper, float f, float f2, int i) {
        float f3 = ((r02) this.mBarChartAttrs).f;
        if (xr5.k(((RectF) rectFWrapper).right, f)) {
            return;
        }
        float f4 = ((RectF) rectFWrapper).left;
        if (f4 < f && ((RectF) rectFWrapper).right > f) {
            ((RectF) rectFWrapper).left = f;
            Path pathC = rectFWrapper.f11775a ? zi3.c(rectFWrapper, f3, 7) : zi3.a(rectFWrapper);
            this.mBarChartPaint.setColor(((r02) this.mBarChartAttrs).i0);
            canvas.drawPath(pathC, this.mBarChartPaint);
            return;
        }
        if (xr5.a(f4, f) && xr5.k(((RectF) rectFWrapper).right, f2)) {
            this.mBarChartPaint.setColor(i);
            canvas.drawPath(rectFWrapper.f11775a ? zi3.b(rectFWrapper, f3) : zi3.a(rectFWrapper), this.mBarChartPaint);
        } else {
            if (!xr5.k(((RectF) rectFWrapper).left, f2) || ((RectF) rectFWrapper).right <= f2) {
                return;
            }
            float f5 = ((RectF) rectFWrapper).left;
            ((RectF) rectFWrapper).right = f5 + (f2 - f5);
            Path pathC2 = rectFWrapper.f11775a ? zi3.c(rectFWrapper, f3, 5) : zi3.a(rectFWrapper);
            this.mBarChartPaint.setColor(((r02) this.mBarChartAttrs).i0);
            canvas.drawPath(pathC2, this.mBarChartPaint);
        }
    }

    public <T extends sf2> void b(Canvas canvas, RecyclerView recyclerView, T t) {
        float width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        float paddingLeft = recyclerView.getPaddingLeft();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            List<RectFWrapper> listI = eu3.i(childAt, recyclerView, t, this.mBarChartAttrs, ((SleepEntry) childAt.getTag()).f11762a.f4804a);
            for (int i2 = 0; i2 < listI.size(); i2++) {
                RectFWrapper rectFWrapper = listI.get(i2);
                a(canvas, rectFWrapper, paddingLeft, width, rectFWrapper.f11776b);
            }
        }
    }

    @Override // com.xiaomi.fitness.chart.render.BaseChartRender
    public <T extends RecyclerBarEntry> int getChartColor(T t) {
        return ((r02) this.mBarChartAttrs).g0;
    }
}
