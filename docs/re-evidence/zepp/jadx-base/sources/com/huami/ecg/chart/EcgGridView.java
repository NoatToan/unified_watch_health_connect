package com.huami.ecg.chart;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import com.huami.ecg.chart.utils.UIUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class EcgGridView extends FrameLayout {
    private Paint a;
    private Paint b;
    private int c;
    private float d;
    public List<Float> dataList;
    private int e;
    private int f;
    private Context g;
    private boolean h;
    private boolean i;
    private Path j;
    public float mItemWidth;
    public float mMaxCount;
    public float mMinCount;
    public ArrayList<PointF> mPointList;
    public float mViewHeight;
    public float mViewWidth;
    public int mX;
    public int mY;

    public EcgGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(Canvas canvas) {
        if (this.i) {
            return;
        }
        float f = this.mViewHeight / this.mY;
        float f2 = this.mViewWidth / this.mX;
        int i = 1;
        if (!this.h) {
            for (int i2 = 1; i2 < this.mY; i2++) {
                float f3 = i2 * f;
                canvas.drawLine(0.0f, f3, this.mViewWidth, f3, this.a);
            }
            while (i < this.mX) {
                float f4 = i * f2;
                canvas.drawLine(f4, 0.0f, f4, this.mViewHeight, this.a);
                i++;
            }
            return;
        }
        for (int i3 = 1; i3 <= this.mY; i3++) {
            if (i3 % 5 == 0) {
                this.a.setStrokeWidth(this.c * 2);
            } else {
                this.a.setStrokeWidth(this.c);
            }
            float f5 = i3 * f;
            canvas.drawLine(0.0f, f5, this.mViewWidth, f5, this.a);
        }
        while (i < this.mX) {
            if (i % 5 == 0) {
                this.a.setStrokeWidth(this.c * 2);
            } else {
                this.a.setStrokeWidth(this.c);
            }
            float f6 = i * f2;
            canvas.drawLine(f6, 0.0f, f6, this.mViewHeight, this.a);
            i++;
        }
    }

    private void b(Canvas canvas) {
        ArrayList<PointF> arrayList = this.mPointList;
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        this.j.reset();
        this.j.moveTo(this.mPointList.get(0).x, this.mPointList.get(0).y);
        for (int i = 1; i < this.mPointList.size(); i++) {
            PointF pointF = this.mPointList.get(i);
            this.j.lineTo(pointF.x, pointF.y);
        }
        canvas.drawPath(this.j, this.b);
    }

    private void c() {
        Paint paint = new Paint();
        this.a = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.a.setColor(this.e);
        this.a.setStrokeWidth(this.c);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setColor(this.f);
        this.b.setStrokeWidth(UIUtils.dip2Pix(this.g, this.d));
        this.b.setStrokeJoin(Paint.Join.ROUND);
        this.b.setAntiAlias(true);
        this.b.setStyle(Paint.Style.STROKE);
        this.mPointList = new ArrayList<>();
        this.j = new Path();
    }

    private void d(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R.styleable.EcgGridView, 0, 0);
        try {
            try {
                setGridColor(typedArrayObtainStyledAttributes.getColor(R.styleable.EcgGridView_mGridLineColor, ContextCompat.getColor(context, R.color.ecg_chart_colorDivider)));
                setLineColor(typedArrayObtainStyledAttributes.getColor(R.styleable.EcgGridView_mLineColor, ContextCompat.getColor(context, R.color.ecg_chart_black_10)));
                setIsShowGrid(typedArrayObtainStyledAttributes.getBoolean(R.styleable.EcgGridView_mGridShow, false));
                this.i = typedArrayObtainStyledAttributes.getBoolean(R.styleable.EcgGridView_mHideAllGrid, false);
                this.mX = typedArrayObtainStyledAttributes.getInteger(R.styleable.EcgGridView_mGridX, 50);
                this.mY = typedArrayObtainStyledAttributes.getInteger(R.styleable.EcgGridView_mGridY, 12);
            } catch (Exception e) {
                e.printStackTrace();
            }
            typedArrayObtainStyledAttributes.recycle();
            this.a = new Paint();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public boolean isViewUpdate() {
        List<Float> list = this.dataList;
        return (list == null || list.isEmpty()) ? false : true;
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
            float f = this.mViewWidth;
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
        this.mViewWidth = getMeasuredWidth();
        this.mViewHeight = getMeasuredHeight();
        setData(this.dataList);
    }

    public void setData(List<Float> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        this.dataList = list;
        this.mPointList.clear();
        this.mItemWidth = this.mViewWidth / this.dataList.size();
        float f = (this.mViewHeight * 2.0f) / 3.0f;
        for (int i = 0; i < this.dataList.size() - 1; i++) {
            PointF pointF = new PointF();
            if (this.dataList.get(i).floatValue() > 0.0f) {
                pointF.set(i * this.mItemWidth, f - (this.mViewHeight * (this.dataList.get(i).floatValue() / this.mMaxCount)));
            } else {
                pointF.set(i * this.mItemWidth, (this.mViewHeight * (this.dataList.get(i).floatValue() / this.mMinCount)) + f);
            }
            this.mPointList.add(pointF);
        }
        invalidate();
    }

    public void setGridColor(int i) {
        this.e = i;
        invalidate();
    }

    public void setIsShowGrid(boolean z) {
        this.h = z;
        invalidate();
    }

    public void setLineColor(int i) {
        this.f = i;
        invalidate();
    }

    public EcgGridView(Context context) {
        this(context, null);
    }

    public EcgGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mX = 50;
        this.mY = 12;
        this.c = 1;
        this.d = 1.4f;
        this.mMaxCount = 1.5f;
        this.mMinCount = -1.5f;
        this.i = false;
        setWillNotDraw(false);
        this.g = context;
        d(context, attributeSet);
        c();
    }
}
