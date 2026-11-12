package com.huawei.ui.commonui.reportrectview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes16.dex */
public class ReportTotalDataRectView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f23846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f23847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23848c;
    private int[] d;
    private float e;
    private float g;
    private float h;
    private float[] j;

    public ReportTotalDataRectView(Context context) {
        super(context);
        this.f23848c = 0;
        this.f23847b = context;
    }

    public ReportTotalDataRectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23848c = 0;
        this.f23847b = context;
        this.j = new float[5];
        int[] iArr = new int[5];
        this.d = iArr;
        if (context != null) {
            iArr[0] = context.getResources().getColor(R.color.achieve_report_rect_view_run_color);
            this.d[1] = this.f23847b.getResources().getColor(R.color.achieve_report_rect_view_walk_color);
            this.d[2] = this.f23847b.getResources().getColor(R.color.achieve_report_rect_view_bike_color);
            this.d[3] = this.f23847b.getResources().getColor(R.color.achieve_report_rect_view_climb_color);
            this.d[4] = this.f23847b.getResources().getColor(R.color.achieve_report_rect_view_other_color);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.h = getDefaultSize(getSuggestedMinimumWidth(), i);
        float defaultSize = getDefaultSize(getSuggestedMinimumHeight(), i2);
        this.e = defaultSize;
        LogUtil.d("TotalDataRectView", "onMeasure mWidth = ", Float.valueOf(this.h), " mHeight = ", Float.valueOf(defaultSize));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float fE;
        super.onDraw(canvas);
        if (this.f23847b == null) {
            LogUtil.j("TotalDataRectView", "onDraw mContext == null.");
            return;
        }
        b();
        float fE2 = this.h;
        int i = this.f23848c;
        if (i > 1) {
            fE2 = (fE2 - e(1, (i - 1) * 2)) - this.e;
        }
        float f = fE2;
        LogUtil.d("TotalDataRectView", "mWidth = ", Float.valueOf(this.h), " tempWidth = ", Float.valueOf(f), " recNum = ", Integer.valueOf(this.f23848c));
        this.f23846a.setColor(this.f23847b.getResources().getColor(android.R.color.transparent));
        float f2 = this.e / 2.0f;
        canvas.drawCircle(f2, f2, f2, this.f23846a);
        float f3 = this.h;
        float f4 = this.e / 2.0f;
        canvas.drawCircle(f3 - f4, f4, f4, this.f23846a);
        float f5 = this.e;
        float f6 = f5 / 2.0f;
        canvas.drawRect(new RectF(f6, 0.0f, this.h - f6, f5), this.f23846a);
        int startColor = getStartColor();
        int endColor = getEndColor();
        float f7 = this.e / 2.0f;
        float f8 = 0.0f;
        for (int i2 = 0; i2 < 5; i2++) {
            if (this.j[i2] > 0.0f) {
                this.f23846a.setColor(this.d[i2]);
                if (startColor == this.d[i2]) {
                    this.f23846a.setColor(this.f23847b.getResources().getColor(android.R.color.transparent));
                    canvas.drawRect(new RectF(0.0f, 0.0f, this.h, this.e), this.f23846a);
                    this.f23846a.setColor(this.d[i2]);
                    fE = f8 + f7;
                    canvas.drawCircle(f7, f7, f7, this.f23846a);
                } else {
                    fE = f8 + e(1, 1.0f);
                }
                float f9 = fE;
                float f10 = f9 + ((this.j[i2] / this.g) * f);
                if (endColor == this.d[i2]) {
                    float f11 = this.h;
                    float f12 = f11 - f7;
                    canvas.drawCircle(f12, f7, f7, this.f23846a);
                    canvas.drawRect(f9, 0.0f, f12, this.e, this.f23846a);
                    f8 = f11;
                } else {
                    canvas.drawRect(f9, 0.0f, f10, this.e, this.f23846a);
                    f8 = f10;
                }
            }
        }
    }

    private int getEndColor() {
        int i = this.d[0];
        for (int i2 = 4; i2 >= 0; i2--) {
            if (this.j[i2] > 0.0f) {
                return this.d[i2];
            }
        }
        return i;
    }

    private int getStartColor() {
        int i = this.d[0];
        for (int i2 = 0; i2 < 5; i2++) {
            if (this.j[i2] > 0.0f) {
                return this.d[i2];
            }
        }
        return i;
    }

    private void b() {
        Paint paint = new Paint();
        this.f23846a = paint;
        paint.setAntiAlias(true);
        this.f23846a.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setViewData(float f, float f2, float f3, float f4) {
        this.j = new float[5];
        if (LanguageUtil.ba(this.f23847b)) {
            float[] fArr = this.j;
            fArr[0] = f4;
            fArr[1] = f3;
            fArr[2] = f2;
            fArr[3] = f;
        } else {
            float[] fArr2 = this.j;
            fArr2[0] = f;
            fArr2[1] = f2;
            fArr2[2] = f3;
            fArr2[3] = f4;
        }
        setDate();
    }

    public void setViewData(float f, float f2, float f3, float f4, float f5) {
        this.j = new float[5];
        if (LanguageUtil.ba(this.f23847b)) {
            float[] fArr = this.j;
            fArr[0] = f5;
            fArr[1] = f4;
            fArr[2] = f3;
            fArr[3] = f2;
            fArr[4] = f;
        } else {
            float[] fArr2 = this.j;
            fArr2[0] = f;
            fArr2[1] = f2;
            fArr2[2] = f3;
            fArr2[3] = f4;
            fArr2[4] = f5;
        }
        setDate();
    }

    public void setViewData(float f, float f2, float f3) {
        this.j = new float[5];
        if (LanguageUtil.ba(this.f23847b)) {
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
        setDate();
    }

    public void setViewData(float f, float f2) {
        this.j = new float[5];
        if (LanguageUtil.ba(this.f23847b)) {
            float[] fArr = this.j;
            fArr[0] = f2;
            fArr[1] = f;
        } else {
            float[] fArr2 = this.j;
            fArr2[0] = f;
            fArr2[1] = f2;
        }
        setDate();
    }

    public void setViewData(float f) {
        float[] fArr = new float[5];
        this.j = fArr;
        fArr[0] = f;
        this.g = 0.0f;
        this.f23848c = 0;
        for (int i = 0; i < 5; i++) {
            float f2 = this.j[i];
            if (f2 > 0.0f) {
                this.f23848c++;
                this.g += f2;
            }
        }
    }

    public void setColors(int i) {
        this.d[0] = i;
    }

    public void setColors(int i, int i2) {
        if (LanguageUtil.ba(this.f23847b)) {
            int[] iArr = this.d;
            iArr[0] = i2;
            iArr[1] = i;
        } else {
            int[] iArr2 = this.d;
            iArr2[0] = i;
            iArr2[1] = i2;
        }
    }

    public void setColors(int i, int i2, int i3) {
        if (LanguageUtil.ba(this.f23847b)) {
            int[] iArr = this.d;
            iArr[0] = i3;
            iArr[1] = i2;
            iArr[2] = i;
            return;
        }
        int[] iArr2 = this.d;
        iArr2[0] = i;
        iArr2[1] = i2;
        iArr2[2] = i3;
    }

    public void setColors(int i, int i2, int i3, int i4) {
        if (LanguageUtil.ba(this.f23847b)) {
            int[] iArr = this.d;
            iArr[0] = i4;
            iArr[1] = i3;
            iArr[2] = i2;
            iArr[3] = i;
            return;
        }
        int[] iArr2 = this.d;
        iArr2[0] = i;
        iArr2[1] = i2;
        iArr2[2] = i3;
        iArr2[3] = i4;
    }

    public void setColors(int i, int i2, int i3, int i4, int i5) {
        if (LanguageUtil.ba(this.f23847b)) {
            int[] iArr = this.d;
            iArr[0] = i5;
            iArr[1] = i4;
            iArr[2] = i3;
            iArr[3] = i2;
            iArr[4] = i;
            return;
        }
        int[] iArr2 = this.d;
        iArr2[0] = i;
        iArr2[1] = i2;
        iArr2[2] = i3;
        iArr2[3] = i4;
        iArr2[4] = i5;
    }

    public static float e(int i, float f) {
        return TypedValue.applyDimension(i, f, Resources.getSystem().getDisplayMetrics());
    }

    public void setDate() {
        this.g = 0.0f;
        this.f23848c = 0;
        for (int i = 0; i < 5; i++) {
            float f = this.j[i];
            if (f > 0.0f) {
                this.f23848c++;
                this.g += f;
            }
        }
    }
}
