package com.huami.ecg.chart;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import com.huami.ecg.chart.utils.UIUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class EcgAnimLineView extends FrameLayout {
    private static final int t = 550;
    private static final int u = 50;
    private float a;
    private float b;
    private Paint c;
    private Paint d;
    private int e;
    private int f;
    private int g;
    private float h;
    private int i;
    private int j;
    private List<Float> k;
    private Point l;
    private Point m;
    private float n;
    private float o;
    private float p;
    private Context q;
    private long r;
    public int s;

    public EcgAnimLineView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(Canvas canvas) {
        float f = this.b / this.f;
        float f2 = this.a / this.e;
        for (int i = 0; i <= this.f; i++) {
            if (i % 5 == 0) {
                this.c.setStrokeWidth(this.g * 2);
            } else {
                this.c.setStrokeWidth(this.g);
            }
            float f3 = i * f;
            canvas.drawLine(0.0f, f3, this.a, f3, this.c);
        }
        for (int i2 = 0; i2 <= this.e; i2++) {
            if (i2 % 5 == 0) {
                this.c.setStrokeWidth(this.g * 2);
            } else {
                this.c.setStrokeWidth(this.g);
            }
            float f4 = i2 * f2;
            canvas.drawLine(f4, 0.0f, f4, this.b, this.c);
        }
    }

    private void b(Canvas canvas) {
        List<Float> list = this.k;
        if (list == null || list.size() == 0) {
            return;
        }
        float f = this.b / 2.0f;
        int i = 0;
        while (i < this.k.size() - 1) {
            if (this.k.get(i).floatValue() > 0.0f) {
                this.l.set((int) (i * this.n), (int) (f - (this.b * (this.k.get(i).floatValue() / this.o))));
            } else {
                this.l.set((int) (i * this.n), (int) ((this.b * (this.k.get(i).floatValue() / this.p)) + f));
            }
            int i2 = i + 1;
            if (this.k.get(i2).floatValue() > 0.0f) {
                this.m.set((int) (i2 * this.n), (int) (f - (this.b * (this.k.get(i2).floatValue() / this.o))));
            } else {
                this.m.set((int) (i2 * this.n), (int) ((this.b * (this.k.get(i2).floatValue() / this.p)) + f));
            }
            if (this.k.get(i).floatValue() != 0.0f && this.k.get(i2).floatValue() != 0.0f) {
                Point point = this.l;
                float f2 = point.x;
                float f3 = point.y;
                Point point2 = this.m;
                canvas.drawLine(f2, f3, point2.x, point2.y, this.d);
            }
            i = i2;
        }
    }

    private void c() {
        Paint paint = new Paint();
        this.c = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.c.setColor(this.i);
        this.c.setStrokeWidth(this.g);
        Paint paint2 = new Paint();
        this.d = paint2;
        paint2.setColor(this.j);
        this.d.setStrokeWidth(UIUtils.dip2Pix(this.q, this.h));
        this.d.setStrokeJoin(Paint.Join.ROUND);
        this.d.setAntiAlias(true);
        this.l = new Point();
        this.m = new Point();
        this.k = new ArrayList();
    }

    private void d(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R.styleable.EcgGridView, 0, 0);
        try {
            try {
                setGridColor(typedArrayObtainStyledAttributes.getColor(R.styleable.EcgGridView_mGridLineColor, ContextCompat.getColor(context, R.color.ecg_chart_colorDivider)));
                setLineColor(typedArrayObtainStyledAttributes.getColor(R.styleable.EcgGridView_mLineColor, ContextCompat.getColor(context, R.color.ecg_chart_black_10)));
                this.e = typedArrayObtainStyledAttributes.getInteger(R.styleable.EcgGridView_mGridX, this.e);
                this.f = typedArrayObtainStyledAttributes.getInteger(R.styleable.EcgGridView_mGridY, this.f);
            } catch (Exception e) {
                e.printStackTrace();
            }
            typedArrayObtainStyledAttributes.recycle();
            this.c = new Paint();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void addData(List<Float> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        long size = this.r + ((long) list.size());
        this.r = size;
        this.n = this.a / 550.0f;
        if (size < 550) {
            this.k.addAll(list);
        } else {
            if (this.k.size() < 550) {
                List<Float> list2 = this.k;
                list2.addAll(list.subList(0, 550 - list2.size()));
            } else if (this.k.size() == 550) {
                if (this.s >= 550) {
                    this.s = 0;
                }
                for (int i = 0; i < list.size(); i++) {
                    if (this.s + i < this.k.size()) {
                        this.k.set(this.s + i, list.get(i));
                    }
                }
                for (int i2 = 0; i2 < 50; i2++) {
                    if (this.s + i2 + list.size() < this.k.size()) {
                        this.k.set(this.s + i2 + list.size(), Float.valueOf(0.0f));
                    }
                }
                this.s += list.size();
            }
        }
        invalidate();
    }

    public void clearData() {
        this.r = 0L;
        this.k.clear();
        invalidate();
    }

    public long getAllDataSize() {
        return this.r;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        a(canvas);
        b(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (View.MeasureSpec.getSize(i) == -2 || mode == 0) {
            float f = this.a;
            int iRound = (f >= 1.0f ? Math.round(f) : 1) + getPaddingLeft() + getPaddingRight();
            if (mode == 0) {
                mode = 1073741824;
            }
            i = View.MeasureSpec.makeMeasureSpec(iRound, mode);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.a = getMeasuredWidth();
        this.b = getMeasuredHeight();
        setData(this.k);
    }

    public void setData(List<Float> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        this.k.addAll(list);
        this.n = this.a / 550.0f;
        invalidate();
    }

    public void setGridColor(int i) {
        this.i = i;
    }

    public void setLineColor(int i) {
        this.j = i;
    }

    public EcgAnimLineView(Context context) {
        this(context, null);
    }

    public EcgAnimLineView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = 55;
        this.f = 30;
        this.g = 1;
        this.h = 1.4f;
        this.o = 2.5f;
        this.p = -2.5f;
        setWillNotDraw(false);
        this.q = context;
        d(context, attributeSet);
        c();
    }
}
