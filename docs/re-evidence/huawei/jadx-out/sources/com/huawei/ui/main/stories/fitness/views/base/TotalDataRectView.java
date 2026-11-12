package com.huawei.ui.main.stories.fitness.views.base;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import defpackage.ukj;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes19.dex */
public class TotalDataRectView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f27120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f27121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f27122c;
    private float[] d;
    private Context e;
    private int f;
    private Paint g;
    private float i;

    public TotalDataRectView(Context context) {
        super(context);
        this.f = 0;
        this.e = context;
    }

    public TotalDataRectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = 0;
        this.e = context;
        this.d = new float[5];
        int[] iArr = new int[5];
        this.f27120a = iArr;
        iArr[0] = context.getResources().getColor(R.color.fitness_detail_calorie_total_data_walk_color_2);
        this.f27120a[1] = this.e.getResources().getColor(R.color.fitness_detail_calorie_total_data_run_color_2);
        this.f27120a[2] = this.e.getResources().getColor(R.color.fitness_detail_calorie_total_data_climb_color);
        this.f27120a[3] = this.e.getResources().getColor(R.color.fitness_detail_calorie_total_data_climb_color_2);
        this.f27120a[4] = this.e.getResources().getColor(R.color.fitness_detail_calorie_total_data_other_color_2);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f27122c = getDefaultSize(getSuggestedMinimumWidth(), i);
        this.f27121b = getDefaultSize(getSuggestedMinimumHeight(), i2);
        LogUtil.d("TotalDataRectView", "onMesure mWidth = " + this.f27122c + " mHeight = " + this.f27121b);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i;
        int i2;
        float fB;
        super.onDraw(canvas);
        Paint paint = new Paint();
        this.g = paint;
        paint.setAntiAlias(true);
        this.g.setStyle(Paint.Style.FILL);
        float fB2 = this.f27122c;
        int i3 = this.f;
        if (i3 > 1) {
            fB2 = (fB2 - ukj.b(1, (i3 - 1) * 2)) - this.f27121b;
        }
        float f = fB2;
        LogUtil.d("TotalDataRectView", "mWidth = " + this.f27122c + " tmpWidth = " + f + " recNum = " + this.f);
        int i4 = this.f27120a[0];
        this.g.setColor(i4);
        float f2 = this.f27121b / 2.0f;
        canvas.drawCircle(f2, f2, f2, this.g);
        float f3 = this.f27122c;
        float f4 = this.f27121b / 2.0f;
        canvas.drawCircle(f3 - f4, f4, f4, this.g);
        float f5 = this.f27121b;
        float f6 = f5 / 2.0f;
        canvas.drawRect(new RectF(f6, 0.0f, this.f27122c - f6, f5), this.g);
        int i5 = 0;
        while (true) {
            if (i5 >= 5) {
                i2 = i4;
                break;
            } else {
                if (this.d[i5] > 0.0f) {
                    i2 = this.f27120a[i5];
                    break;
                }
                i5++;
            }
        }
        for (int i6 = 4; i6 >= 0; i6--) {
            if (this.d[i6] > 0.0f) {
                i4 = this.f27120a[i6];
                break;
            }
        }
        int i7 = i4;
        float f7 = this.f27121b / 2.0f;
        int i8 = 0;
        float f8 = 0.0f;
        for (i = 5; i8 < i; i = 5) {
            if (this.d[i8] > 0.0f) {
                this.g.setColor(this.f27120a[i8]);
                if (i2 == this.f27120a[i8]) {
                    Context context = this.e;
                    if (context != null) {
                        this.g.setColor(context.getResources().getColor(R.color.colorBackground));
                    }
                    canvas.drawRect(new RectF(0.0f, 0.0f, this.f27122c, this.f27121b), this.g);
                    this.g.setColor(this.f27120a[i8]);
                    fB = f8 + f7;
                    canvas.drawCircle(f7, f7, f7, this.g);
                } else {
                    fB = ukj.b(1, 1.0f) + f8;
                    LogUtil.d("TotalDataRectView", "In value" + i8 + " after add startX = " + fB + " mWidth = " + this.f27122c + " circleR = " + f7);
                }
                LogUtil.d("TotalDataRectView", "In value" + i8 + "endX = " + f8 + " mWidth = " + this.f27122c + " circleR = " + f7);
                float f9 = ((this.d[i8] / this.i) * f) + fB;
                LogUtil.d("TotalDataRectView", "In value" + i8 + " after add endX = " + f9 + " mWidth = " + this.f27122c + " circleR = " + f7);
                if (i7 == this.f27120a[i8]) {
                    f9 = this.f27122c;
                    LogUtil.d("TotalDataRectView", "In value" + i8 + " endColor == mColors[" + i8 + "] endX = " + f9);
                    float f10 = f9 - f7;
                    canvas.drawCircle(f10, f7, f7, this.g);
                    canvas.drawRect(fB, 0.0f, f10, this.f27121b, this.g);
                } else {
                    canvas.drawRect(fB, 0.0f, f9, this.f27121b, this.g);
                }
                f8 = f9;
            } else {
                i8 = i8;
            }
            i8++;
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setViewData(float f, float f2, float f3, float f4) {
        this.d = new float[5];
        if (LanguageUtil.ba(this.e)) {
            float[] fArr = this.d;
            fArr[0] = f4;
            fArr[1] = f3;
            fArr[2] = f2;
            fArr[3] = f;
        } else {
            float[] fArr2 = this.d;
            fArr2[0] = f;
            fArr2[1] = f2;
            fArr2[2] = f3;
            fArr2[3] = f4;
        }
        this.i = 0.0f;
        this.f = 0;
        for (int i = 0; i < 5; i++) {
            float f5 = this.d[i];
            if (f5 > 0.0f) {
                this.f++;
                this.i += f5;
            }
        }
        LogUtil.a("TotalDataRectView", "value1 = " + this.d[0] + " value2 = " + this.d[1] + " value3 = " + this.d[2] + " value4 = " + this.d[3] + " value5 = " + this.d[4]);
    }

    public void setViewData(float f, float f2, float f3, float f4, float f5) {
        this.d = new float[5];
        if (LanguageUtil.ba(this.e)) {
            float[] fArr = this.d;
            fArr[0] = f5;
            fArr[1] = f4;
            fArr[2] = f3;
            fArr[3] = f2;
            fArr[4] = f;
        } else {
            float[] fArr2 = this.d;
            fArr2[0] = f;
            fArr2[1] = f2;
            fArr2[2] = f3;
            fArr2[3] = f4;
            fArr2[4] = f5;
        }
        this.i = 0.0f;
        this.f = 0;
        for (int i = 0; i < 5; i++) {
            float f6 = this.d[i];
            if (f6 > 0.0f) {
                this.f++;
                this.i += f6;
            }
        }
        LogUtil.a("TotalDataRectView", "value1 = " + this.d[0] + " value2 = " + this.d[1] + " value3 = " + this.d[2] + " value4 = " + this.d[3] + " value5 = " + this.d[4]);
    }

    public void setViewData(float f, float f2, float f3) {
        this.d = new float[5];
        if (LanguageUtil.ba(this.e)) {
            float[] fArr = this.d;
            fArr[0] = f3;
            fArr[1] = f2;
            fArr[2] = f;
        } else {
            float[] fArr2 = this.d;
            fArr2[0] = f;
            fArr2[1] = f2;
            fArr2[2] = f3;
        }
        this.i = 0.0f;
        this.f = 0;
        for (int i = 0; i < 5; i++) {
            float f4 = this.d[i];
            if (f4 > 0.0f) {
                this.f++;
                this.i += f4;
            }
        }
        LogUtil.a("TotalDataRectView", "value1 = " + this.d[0] + " value2 = " + this.d[1] + " value3 = " + this.d[2]);
    }

    public void setColors(int i, int i2, int i3) {
        if (LanguageUtil.ba(this.e)) {
            int[] iArr = this.f27120a;
            iArr[0] = i3;
            iArr[1] = i2;
            iArr[2] = i;
            return;
        }
        int[] iArr2 = this.f27120a;
        iArr2[0] = i;
        iArr2[1] = i2;
        iArr2[2] = i3;
    }

    public void setColors(int i, int i2, int i3, int i4) {
        if (LanguageUtil.ba(this.e)) {
            int[] iArr = this.f27120a;
            iArr[0] = i4;
            iArr[1] = i3;
            iArr[2] = i2;
            iArr[3] = i;
            return;
        }
        int[] iArr2 = this.f27120a;
        iArr2[0] = i;
        iArr2[1] = i2;
        iArr2[2] = i3;
        iArr2[3] = i4;
    }

    public void setColors(int i, int i2, int i3, int i4, int i5) {
        if (LanguageUtil.ba(this.e)) {
            int[] iArr = this.f27120a;
            iArr[0] = i5;
            iArr[1] = i4;
            iArr[2] = i3;
            iArr[3] = i2;
            iArr[4] = i;
            return;
        }
        int[] iArr2 = this.f27120a;
        iArr2[0] = i;
        iArr2[1] = i2;
        iArr2[2] = i3;
        iArr2[3] = i4;
        iArr2[4] = i5;
    }
}
