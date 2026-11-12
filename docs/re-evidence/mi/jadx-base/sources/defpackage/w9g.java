package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.entrys.MultiBarEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.render.BaseChartRender;
import com.xiaomi.fitness.chart.util.RectFWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class w9g extends BaseChartRender<MultiBarEntry, r02> {
    public w9g(r02 r02Var, onq onqVar) {
        super(r02Var, onqVar);
    }

    public <T extends sf2> void a(Canvas canvas, RecyclerView recyclerView, T t) {
        float width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        float paddingLeft = recyclerView.getPaddingLeft();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            List<RectFWrapper> listH = eu3.h(childAt, recyclerView, t, this.mBarChartAttrs, ((MultiBarEntry) childAt.getTag()).a());
            for (int i2 = 0; i2 < listH.size(); i2++) {
                RectFWrapper rectFWrapper = listH.get(i2);
                b(canvas, rectFWrapper, paddingLeft, width, rectFWrapper.f11776b);
            }
        }
    }

    public void b(Canvas canvas, RectFWrapper rectFWrapper, float f, float f2, int i) {
        if (xr5.k(((RectF) rectFWrapper).right, f)) {
            return;
        }
        float f3 = ((RectF) rectFWrapper).left;
        if (f3 < f && ((RectF) rectFWrapper).right > f) {
            ((RectF) rectFWrapper).left = f;
            Path pathC = zi3.c(rectFWrapper, 36.0f, 7);
            this.mBarChartPaint.setColor(((r02) this.mBarChartAttrs).i0);
            canvas.drawPath(pathC, this.mBarChartPaint);
            return;
        }
        if (xr5.a(f3, f) && xr5.k(((RectF) rectFWrapper).right, f2)) {
            this.mBarChartPaint.setColor(i);
            canvas.drawPath(zi3.b(rectFWrapper, 36.0f), this.mBarChartPaint);
        } else {
            if (!xr5.k(((RectF) rectFWrapper).left, f2) || ((RectF) rectFWrapper).right <= f2) {
                return;
            }
            float f4 = ((RectF) rectFWrapper).left;
            ((RectF) rectFWrapper).right = f4 + (f2 - f4);
            Path pathC2 = zi3.c(rectFWrapper, 36.0f, 5);
            this.mBarChartPaint.setColor(((r02) this.mBarChartAttrs).i0);
            canvas.drawPath(pathC2, this.mBarChartPaint);
        }
    }

    @Override // com.xiaomi.fitness.chart.render.BaseChartRender
    public <T extends RecyclerBarEntry> int getChartColor(T t) {
        return ((r02) this.mBarChartAttrs).g0;
    }
}
