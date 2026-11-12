package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.chart.render.BaseChartRender;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class t02 extends BaseChartRender<RecyclerBarEntry, r02> {
    public t02(r02 r02Var, onq onqVar, onq onqVar2) {
        super(r02Var, onqVar, onqVar2);
    }

    public final void a(Canvas canvas, RecyclerView recyclerView, rtr rtrVar, long j, long j2) {
        float width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        float paddingLeft = recyclerView.getPaddingLeft();
        int childCount = recyclerView.getChildCount();
        long j3 = j2 - j;
        int i = 0;
        while (i < childCount) {
            View childAt = recyclerView.getChildAt(i);
            RecyclerBarEntry recyclerBarEntry = (RecyclerBarEntry) childAt.getTag();
            RectF rectFD = eu3.d(childAt, recyclerView, rtrVar, this.mBarChartAttrs, recyclerBarEntry);
            float fWidth = rectFD.width();
            float f = ((recyclerBarEntry.timestamp - j) / j3) * (width - paddingLeft);
            float f2 = fWidth / 2.0f;
            if (f < f2) {
                f = f2;
            }
            float f3 = f + paddingLeft;
            rectFD.left = f3;
            rectFD.right = f3 + fWidth;
            E e = this.mBarChartAttrs;
            if (((r02) e).V0 == 1) {
                f(canvas, rectFD, 36.0f, paddingLeft, width, recyclerBarEntry, recyclerView, rtrVar);
            } else {
                e(canvas, rectFD, 36.0f, paddingLeft, width, recyclerBarEntry, ((r02) e).g0, ((r02) e).g0, 1);
            }
            i++;
            j3 = j3;
        }
    }

    public final void b(Canvas canvas, RecyclerView recyclerView, rtr rtrVar) {
        float width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        float paddingLeft = recyclerView.getPaddingLeft();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            RecyclerBarEntry recyclerBarEntry = (RecyclerBarEntry) childAt.getTag();
            RectF rectFD = eu3.d(childAt, recyclerView, rtrVar, this.mBarChartAttrs, recyclerBarEntry);
            E e = this.mBarChartAttrs;
            float f = ((r02) e).f;
            if (((r02) e).D0) {
                f = 8.0f;
            } else if (f <= 0.0f) {
                f = 36.0f;
            }
            float f2 = f;
            if (((r02) e).V0 == 1) {
                f(canvas, rectFD, f2, paddingLeft, width, recyclerBarEntry, recyclerView, rtrVar);
            } else {
                e(canvas, rectFD, f2, paddingLeft, width, recyclerBarEntry, getChartColor(recyclerBarEntry), getChartColor(recyclerBarEntry), 1);
            }
        }
    }

    public void c(Canvas canvas, RecyclerView recyclerView, rtr rtrVar, int i) {
        float width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        float paddingLeft = recyclerView.getPaddingLeft();
        float fMax = Math.max(((recyclerView.getHeight() - recyclerView.getPaddingBottom()) - ((r02) this.mBarChartAttrs).f625a) - ((i - rtrVar.getAxisMinimum()) * jak.r(recyclerView, rtrVar, this.mBarChartAttrs)), recyclerView.getPaddingTop() + ((r02) this.mBarChartAttrs).f626b);
        Paint paint = new Paint();
        paint.reset();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(0.75f);
        paint.setColor(((r02) this.mBarChartAttrs).g0);
        paint.setPathEffect(new DashPathEffect(new float[]{DisplayUtil.dip2px(4.0f), DisplayUtil.dip2px(1.5f)}, 0.0f));
        canvas.drawLine(width, fMax, paddingLeft, fMax, paint);
        paint.reset();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(1.0f);
        paint.setColor(((r02) this.mBarChartAttrs).g0);
        paint.setTextSize(DisplayUtil.dip2px(10.0f));
        if (AppUtil.isRTLDirection()) {
            canvas.drawText(String.valueOf(i), (paddingLeft - this.mTextPaint.measureText(String.valueOf(i))) - rtrVar.f33581b, fMax + (o8p.i(paint) / 4.0f), paint);
        } else {
            canvas.drawText(String.valueOf(i), width + rtrVar.f33581b, fMax + (o8p.i(paint) / 4.0f), paint);
        }
    }

    public <E extends sf2> void d(Canvas canvas, RecyclerView recyclerView, E e) {
        if (((r02) this.mBarChartAttrs).A) {
            float width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            float paddingLeft = recyclerView.getPaddingLeft();
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                RecyclerBarEntry recyclerBarEntry = (RecyclerBarEntry) childAt.getTag();
                drawText(canvas, paddingLeft, width, this.mBarChartValueFormatter.getBarLabel(recyclerBarEntry), childAt.getLeft() + (childAt.getWidth() / 2.0f), eu3.k(recyclerBarEntry.getY(), recyclerView, e, this.mBarChartAttrs) - ((r02) this.mBarChartAttrs).L0, this.mTextPaint);
            }
        }
    }

    public final void e(Canvas canvas, RectF rectF, float f, float f2, float f3, RecyclerBarEntry recyclerBarEntry, int i, int i2, int i3) {
        if (xr5.k(rectF.right, f2)) {
            return;
        }
        float f4 = rectF.left;
        if (f4 < f2 && rectF.right > f2) {
            rectF.left = f2;
            Path pathC = zi3.c(rectF, f, 7);
            this.mBarChartPaint.setShader(null);
            this.mBarChartPaint.setColor(((r02) this.mBarChartAttrs).i0);
            canvas.drawPath(pathC, this.mBarChartPaint);
            return;
        }
        if (!xr5.a(f4, f2) || !xr5.k(rectF.right, f3)) {
            if (!xr5.k(rectF.left, f3) || rectF.right <= f3) {
                return;
            }
            float f5 = rectF.left;
            rectF.right = f5 + (f3 - f5);
            Path pathC2 = zi3.c(rectF, f, 5);
            this.mBarChartPaint.setShader(null);
            this.mBarChartPaint.setColor(((r02) this.mBarChartAttrs).i0);
            canvas.drawPath(pathC2, this.mBarChartPaint);
            return;
        }
        if (recyclerBarEntry.validType == 0) {
            E e = this.mBarChartAttrs;
            if (((r02) e).W0 == 0 || ((r02) e).X0 == 0) {
                this.mBarChartPaint.setColor(i2);
            } else {
                float f6 = rectF.left;
                float f7 = rectF.top;
                float f8 = rectF.bottom;
                E e2 = this.mBarChartAttrs;
                this.mBarChartPaint.setShader(new LinearGradient(f6, f7, f6, f8, ((r02) e2).W0, ((r02) e2).X0, Shader.TileMode.CLAMP));
            }
        } else {
            this.mBarChartPaint.setColor(((r02) this.mBarChartAttrs).j0);
        }
        Path pathC3 = zi3.c(rectF, f, i3);
        canvas.drawPath(pathC3, this.mBarChartPaint);
        if (i == i2 || i == -1) {
            return;
        }
        this.mBarChartStrokePaint.setColor(i);
        canvas.drawPath(pathC3, this.mBarChartStrokePaint);
    }

    public final void f(Canvas canvas, RectF rectF, float f, float f2, float f3, RecyclerBarEntry recyclerBarEntry, RecyclerView recyclerView, rtr rtrVar) {
        int i;
        float f4;
        int i2;
        float f5;
        float f6;
        float f7;
        if (recyclerBarEntry instanceof SegmentBarEntry) {
            List<hrl> list = ((SegmentBarEntry) recyclerBarEntry).rectValueModelList;
            float fCenterX = rectF.centerX();
            float fWidth = rectF.width() * 0.5f;
            float f8 = fCenterX - fWidth;
            float f9 = fCenterX + fWidth;
            int size = list.size();
            float height = (recyclerView.getHeight() - recyclerView.getPaddingBottom()) - ((r02) this.mBarChartAttrs).f625a;
            float paddingTop = recyclerView.getPaddingTop() + ((r02) this.mBarChartAttrs).f626b;
            int i3 = 0;
            while (i3 < size) {
                hrl hrlVar = list.get(i3);
                RectF rectF2 = new RectF(f8, jak.q(recyclerView, rtrVar, this.mBarChartAttrs, hrlVar.f20377a), f9, jak.q(recyclerView, rtrVar, this.mBarChartAttrs, hrlVar.f20378b));
                float f10 = rectF.bottom;
                rectF2.top = f10 - rectF2.top;
                rectF2.bottom = f10 - rectF2.bottom;
                if (rectF2.height() < rectF2.width()) {
                    float f11 = rectF2.top - fWidth;
                    float f12 = rectF2.bottom + fWidth;
                    rectF2.top = f11;
                    rectF2.bottom = f12;
                    if (f11 <= paddingTop) {
                        rectF2.top = paddingTop;
                        rectF2.bottom = rectF.width() + paddingTop;
                    }
                    if (f12 >= height) {
                        rectF2.bottom = height;
                        rectF2.top = height - rectF.width();
                    }
                }
                if (rectF2.top >= paddingTop) {
                    i = i3;
                    f7 = paddingTop;
                    f4 = height;
                    i2 = size;
                    f5 = f9;
                    f6 = f8;
                    e(canvas, rectF2, f, f2, f3, recyclerBarEntry, hrlVar.d, hrlVar.c, 0);
                } else {
                    i = i3;
                    float f13 = paddingTop;
                    f4 = height;
                    i2 = size;
                    f5 = f9;
                    f6 = f8;
                    if (rectF2.bottom > f13) {
                        rectF2.top = f13;
                        f7 = f13;
                        e(canvas, rectF2, f, f2, f3, recyclerBarEntry, hrlVar.d, hrlVar.c, 0);
                    } else {
                        f7 = f13;
                    }
                }
                i3 = i + 1;
                f8 = f6;
                f9 = f5;
                paddingTop = f7;
                height = f4;
                size = i2;
            }
        }
    }

    public void g(Canvas canvas, RecyclerView recyclerView, rtr rtrVar) {
        if (((r02) this.mBarChartAttrs).F0) {
            Paint paint = new Paint(1);
            paint.setColor(((r02) this.mBarChartAttrs).G0);
            paint.setTextSize(ExtUtilsKt.getDp(13));
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                RecyclerBarEntry recyclerBarEntry = (RecyclerBarEntry) childAt.getTag();
                if (recyclerBarEntry.getTargetSelected() == 1) {
                    Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(ApplicationExtKt.getApplication().getResources(), gni.i);
                    float left = (childAt.getLeft() + (childAt.getWidth() / 2.0f)) - (bitmapDecodeResource.getWidth() / 2.0f);
                    float goalY = recyclerBarEntry.getGoalY() - bitmapDecodeResource.getHeight();
                    canvas.drawBitmap(bitmapDecodeResource, left, goalY, paint);
                    String str = ((r02) this.mBarChartAttrs).H0;
                    float fMeasureText = paint.measureText(str);
                    Rect rect = new Rect();
                    paint.getTextBounds(str, 0, str.length(), rect);
                    canvas.drawText(str, (childAt.getLeft() + (childAt.getWidth() / 2.0f)) - (fMeasureText / 2.0f), goalY + (bitmapDecodeResource.getHeight() / 3.0f) + ((rect.bottom - rect.top) / 2.0f), paint);
                }
            }
        }
    }

    @Override // com.xiaomi.fitness.chart.render.BaseChartRender
    public int getChartColor(RecyclerBarEntry recyclerBarEntry) {
        return recyclerBarEntry.chartItemType == 0 ? ((r02) this.mBarChartAttrs).g0 : ((r02) this.mBarChartAttrs).h0;
    }

    public final void h(Canvas canvas, RecyclerView recyclerView, rtr rtrVar) {
        int i;
        float f;
        int i2 = 0;
        if (((r02) this.mBarChartAttrs).F0) {
            Paint paint = new Paint(1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(ExtUtilsKt.getDp(1));
            float dp = ExtUtilsKt.getDp(5);
            float dp2 = ExtUtilsKt.getDp(3);
            paint.setPathEffect(new DashPathEffect(new float[]{dp, dp2}, dp2));
            paint.setColor(((r02) this.mBarChartAttrs).G0);
            Path path = new Path();
            int childCount = recyclerView.getChildCount();
            float f2 = 0.0f;
            while (i2 < childCount) {
                View childAt = recyclerView.getChildAt(i2);
                float width = childAt.getWidth() / 3.0f;
                RecyclerBarEntry recyclerBarEntry = (RecyclerBarEntry) childAt.getTag();
                float axisMinimum = rtrVar.getAxisMinimum();
                float goalValue = recyclerBarEntry.getGoalValue();
                float fMax = Math.max(((recyclerView.getHeight() - recyclerView.getPaddingBottom()) - ((r02) this.mBarChartAttrs).f625a) - ((goalValue - axisMinimum) * jak.r(recyclerView, rtrVar, this.mBarChartAttrs)), recyclerView.getPaddingTop() + ((r02) this.mBarChartAttrs).f626b);
                recyclerBarEntry.setGoalY(fMax);
                if (goalValue <= 0.0f) {
                    i = 1;
                } else if (i2 == 0) {
                    path.moveTo(childAt.getRight(), fMax);
                    path.lineTo(childAt.getLeft(), fMax);
                    i = 1;
                } else {
                    if (f2 == goalValue) {
                        f = 0.0f;
                        width = 0.0f;
                    } else {
                        f = 0.0f;
                    }
                    if (f2 == f) {
                        path.moveTo(childAt.getRight(), fMax);
                        width = f;
                    }
                    path.lineTo(childAt.getRight() - width, fMax);
                    i = 1;
                    if (i2 == childCount - 1) {
                        width = f;
                    }
                    path.lineTo(childAt.getLeft() + width, fMax);
                }
                i2 += i;
                f2 = goalValue;
            }
            canvas.drawPath(path, paint);
        }
    }
}
