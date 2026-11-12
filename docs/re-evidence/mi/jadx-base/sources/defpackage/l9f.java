package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.render.BaseChartRender;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import defpackage.rtr;

/* JADX INFO: loaded from: classes7.dex */
public class l9f<T extends rtr> extends BaseChartRender<MaxMinEntry, r02> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r02 f24801a;

    public l9f(r02 r02Var, onq onqVar) {
        super(r02Var, onqVar);
        this.f24801a = r02Var;
    }

    public static <E extends rtr> RectF d(View view, RecyclerView recyclerView, E e, r02 r02Var, MaxMinEntry maxMinEntry) {
        RectF rectF = new RectF();
        float height = (recyclerView.getHeight() - recyclerView.getPaddingBottom()) - r02Var.f625a;
        float paddingTop = (height - recyclerView.getPaddingTop()) - r02Var.f626b;
        float paddingTop2 = recyclerView.getPaddingTop() + r02Var.f626b;
        float f = r02Var.F;
        float fMax = Math.max(height - (((maxMinEntry.getY() - f) / (e.getAxisMaximum() - f)) * paddingTop), paddingTop2);
        float fDip2px = fMax - DisplayUtil.dip2px(2.0f);
        float fDip2px2 = fMax + DisplayUtil.dip2px(2.0f);
        float width = view.getWidth();
        float f2 = r02Var.e0 * width;
        float f3 = width - f2;
        float f4 = r02Var.f0;
        if (f4 > 0.0f && f3 > f4) {
            f2 = width - f4;
            f3 = f4;
        }
        float left = view.getLeft() + (f2 / 2.0f);
        rectF.set(left, fDip2px, f3 + left, fDip2px2);
        return rectF;
    }

    public static <E extends rtr> RectF e(View view, RecyclerView recyclerView, E e, r02 r02Var, MaxMinEntry maxMinEntry) {
        RectF rectF = new RectF();
        float height = (recyclerView.getHeight() - recyclerView.getPaddingBottom()) - r02Var.f625a;
        float paddingTop = (height - recyclerView.getPaddingTop()) - r02Var.f626b;
        float paddingTop2 = recyclerView.getPaddingTop() + r02Var.f626b;
        float f = r02Var.F;
        float axisMaximum = ((maxMinEntry.maxY - f) / (e.getAxisMaximum() - f)) * paddingTop;
        float axisMaximum2 = ((maxMinEntry.minY - f) / (e.getAxisMaximum() - f)) * paddingTop;
        float f2 = height - axisMaximum;
        float fDip2px = height - axisMaximum2;
        if (f2 == fDip2px && f2 != height) {
            fDip2px += DisplayUtil.dip2px(2.0f);
        }
        float width = view.getWidth();
        float f3 = r02Var.e0 * width;
        float f4 = width - f3;
        float f5 = r02Var.f0;
        if (f5 > 0.0f && f4 > f5) {
            f3 = width - f5;
            f4 = f5;
        }
        float left = view.getLeft() + (f3 / 2.0f);
        rectF.set(left, Math.max(f2, paddingTop2), f4 + left, fDip2px);
        return rectF;
    }

    public final void a(Canvas canvas, RecyclerView recyclerView, T t) {
        float width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        float paddingLeft = recyclerView.getPaddingLeft();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            MaxMinEntry maxMinEntry = (MaxMinEntry) childAt.getTag();
            RectF rectFE = e(childAt, recyclerView, t, this.f24801a, maxMinEntry);
            RectF rectFD = d(childAt, recyclerView, t, this.f24801a, maxMinEntry);
            c(canvas, rectFE, paddingLeft, width, 36.0f, this.f24801a.S0);
            if (maxMinEntry.getY() > 0.0f) {
                r02 r02Var = this.f24801a;
                if (r02Var.U0) {
                    c(canvas, rectFD, paddingLeft, width, 36.0f, r02Var.T0);
                }
            }
        }
    }

    public final void b(Canvas canvas, RecyclerView recyclerView, T t) {
        float width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        float paddingLeft = recyclerView.getPaddingLeft();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            RectF rectFF = eu3.f(childAt, recyclerView, t, this.f24801a, (MaxMinEntry) childAt.getTag());
            if (xr5.a(rectFF.left, paddingLeft) && xr5.k(rectFF.right, width)) {
                this.mBarChartPaint.setColor(this.f24801a.g0);
                canvas.drawPath(zi3.b(rectFF, 36.0f), this.mBarChartPaint);
            }
        }
    }

    public void c(Canvas canvas, RectF rectF, float f, float f2, float f3, int i) {
        if (xr5.k(rectF.right, f)) {
            return;
        }
        float f4 = rectF.left;
        if (f4 < f && rectF.right > f) {
            rectF.left = f;
            Path pathC = zi3.c(rectF, f3, 4);
            this.mBarChartPaint.setColor(this.f24801a.i0);
            canvas.drawPath(pathC, this.mBarChartPaint);
            return;
        }
        if (xr5.a(f4, f) && xr5.k(rectF.right, f2)) {
            this.mBarChartPaint.setColor(i);
            canvas.drawPath(zi3.c(rectF, f3, 0), this.mBarChartPaint);
        } else {
            if (!xr5.k(rectF.left, f2) || rectF.right <= f2) {
                return;
            }
            float f5 = rectF.left;
            rectF.right = f5 + (f2 - f5);
            Path pathC2 = zi3.c(rectF, f3, 3);
            this.mBarChartPaint.setColor(this.f24801a.i0);
            canvas.drawPath(pathC2, this.mBarChartPaint);
        }
    }

    @Override // com.xiaomi.fitness.chart.render.BaseChartRender
    public int getChartColor(RecyclerBarEntry recyclerBarEntry) {
        return this.f24801a.g0;
    }

    @Override // com.xiaomi.fitness.chart.render.BaseChartRender
    public void setHighLightValueFormatter(onq onqVar) {
        this.mHighLightValueFormatter = onqVar;
    }
}
