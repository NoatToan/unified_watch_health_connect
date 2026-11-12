package com.huawei.ui.commonui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import defpackage.qqf;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes16.dex */
public class TotalDataRectView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f24006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f24007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f24008c;
    private float d;
    private Context e;
    private float f;
    private int g;
    private int h;
    private float i;
    private float[] j;

    public TotalDataRectView(Context context) {
        super(context);
        this.g = 0;
        this.f24007b = true;
        this.e = context;
    }

    public TotalDataRectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = 0;
        this.f24007b = true;
        this.e = context;
        this.j = new float[5];
        int[] iArr = new int[5];
        this.f24006a = iArr;
        iArr[0] = context.getResources().getColor(R.color.fitness_detail_calorie_total_data_walk_color_2);
        this.f24006a[1] = this.e.getResources().getColor(R.color.fitness_detail_calorie_total_data_run_color_2);
        this.f24006a[2] = this.e.getResources().getColor(R.color.fitness_detail_calorie_total_data_climb_color);
        this.f24006a[3] = this.e.getResources().getColor(R.color.fitness_detail_calorie_total_data_climb_color_2);
        this.f24006a[4] = this.e.getResources().getColor(R.color.fitness_detail_calorie_total_data_other_color_2);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f = getDefaultSize(getSuggestedMinimumWidth(), i);
        float defaultSize = getDefaultSize(getSuggestedMinimumHeight(), i2);
        this.d = defaultSize;
        LogUtil.d("TotalDataRectView", "onMesure mWidth = ", Float.valueOf(this.f), " mHeight = ", Float.valueOf(defaultSize));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        Paint paint = new Paint();
        this.f24008c = paint;
        paint.setAntiAlias(true);
        this.f24008c.setStyle(Paint.Style.FILL);
        int i2 = 0;
        int i3 = this.f24006a[0];
        this.f24008c.setColor(i3);
        float f = this.d / 2.0f;
        canvas.drawCircle(f, f, f, this.f24008c);
        canvas.drawCircle(this.f - f, f, f, this.f24008c);
        canvas.drawRect(new RectF(f, 0.0f, this.f - f, this.d), this.f24008c);
        while (true) {
            if (i2 >= 5) {
                i = i3;
                break;
            } else {
                if (this.j[i2] > 0.0f) {
                    i = this.f24006a[i2];
                    break;
                }
                i2++;
            }
        }
        for (int i4 = 4; i4 >= 0; i4--) {
            if (this.j[i4] > 0.0f) {
                i3 = this.f24006a[i4];
                break;
            }
        }
        a(i, i3, canvas, f);
    }

    private void a(int i, int i2, Canvas canvas, float f) {
        float fB;
        float fB2 = this.f;
        int i3 = this.g;
        if (i3 > 1) {
            fB2 = (fB2 - qqf.b(1, (i3 - 1) * 2)) - this.d;
        }
        float f2 = fB2;
        LogUtil.d("TotalDataRectView", "mWidth = ", Float.valueOf(this.f), " tmpWidth = ", Float.valueOf(f2), " mRectNum = ", Integer.valueOf(this.g));
        float f3 = 0.0f;
        for (int i4 = 0; i4 < 5; i4++) {
            if (this.j[i4] > 0.0f) {
                this.f24008c.setColor(this.f24006a[i4]);
                if (i == this.f24006a[i4]) {
                    if (this.f24007b) {
                        this.f24008c.setColor(getResources().getColor(R.color.colorBackground));
                    } else {
                        this.f24008c.setColor(this.h);
                    }
                    canvas.drawRect(new RectF(0.0f, 0.0f, this.f, this.d), this.f24008c);
                    this.f24008c.setColor(this.f24006a[i4]);
                    fB = f3 + f;
                    canvas.drawCircle(f, f, f, this.f24008c);
                } else {
                    fB = qqf.b(1, 1.0f) + f3;
                    LogUtil.d("TotalDataRectView", "In value", Integer.valueOf(i4), " after add startX = ", Float.valueOf(fB), " mWidth = ", Float.valueOf(this.f), " ", "circleR = ", Float.valueOf(f));
                }
                LogUtil.d("TotalDataRectView", "In value", Integer.valueOf(i4), "endX = ", Float.valueOf(f3), " mWidth = ", Float.valueOf(this.f), " circleR = ", Float.valueOf(f));
                float f4 = fB + ((this.j[i4] / this.i) * f2);
                LogUtil.d("TotalDataRectView", "In value", Integer.valueOf(i4), " after add endX = ", Float.valueOf(f4), " mWidth = ", Float.valueOf(this.f), " circleR = ", Float.valueOf(f));
                if (i2 == this.f24006a[i4]) {
                    f4 = this.f;
                    LogUtil.d("TotalDataRectView", "In value", Integer.valueOf(i4), " endColor == mColors[", Integer.valueOf(i4), "] endX = ", Float.valueOf(f4));
                    float f5 = f4 - f;
                    canvas.drawCircle(f5, f, f, this.f24008c);
                    canvas.drawRect(fB, 0.0f, f5, this.d, this.f24008c);
                } else {
                    canvas.drawRect(fB, 0.0f, f4, this.d, this.f24008c);
                }
                f3 = f4;
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setViewData(float f, float f2, float f3) {
        this.j = new float[5];
        if (LanguageUtil.ba(this.e)) {
            float[] fArr = this.j;
            fArr[0] = f3;
            fArr[1] = f2;
            fArr[2] = f;
        } else {
            float[] fArr2 = this.j;
            fArr2[0] = f;
            fArr2[1] = f2;
            fArr2[2] = f3;
        }
        this.i = 0.0f;
        this.g = 0;
        for (int i = 0; i < 5; i++) {
            float f4 = this.j[i];
            if (f4 > 0.0f) {
                this.g++;
                this.i += f4;
            }
        }
        float[] fArr3 = this.j;
        LogUtil.a("TotalDataRectView", "value1 = ", Float.valueOf(fArr3[0]), " value2 = ", Float.valueOf(fArr3[1]), " value3 = ", Float.valueOf(fArr3[2]));
    }

    public void setColors(int i, int i2, int i3) {
        if (LanguageUtil.ba(this.e)) {
            int[] iArr = this.f24006a;
            iArr[0] = i3;
            iArr[1] = i2;
            iArr[2] = i;
            return;
        }
        int[] iArr2 = this.f24006a;
        iArr2[0] = i;
        iArr2[1] = i2;
        iArr2[2] = i3;
    }

    public void setPaintBackgroundColor(boolean z, int i) {
        this.f24007b = z;
        this.h = i;
        invalidate();
    }
}
