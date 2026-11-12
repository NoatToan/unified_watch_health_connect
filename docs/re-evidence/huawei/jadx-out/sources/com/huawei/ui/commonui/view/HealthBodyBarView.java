package com.huawei.ui.commonui.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import defpackage.qrs;
import defpackage.qtd;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes16.dex */
public class HealthBodyBarView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f23984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f23985c;
    private int d;
    private float e;
    private Paint f;
    private int g;
    private float h;
    private boolean i;
    private boolean j;
    private int o;

    private float a(float f, float f2, float f3) {
        float f4 = f3 - f2;
        if (f4 <= 0.0f) {
            return 0.0f;
        }
        return (f - f2) / f4;
    }

    public HealthBodyBarView(Context context) {
        this(context, null);
    }

    public HealthBodyBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HealthBodyBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = 0;
        this.o = 0;
        this.f23985c = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HealthBodyBarView);
        try {
            this.d = typedArrayObtainStyledAttributes.getColor(R.styleable.HealthBodyBarView_bar_color, ContextCompat.getColor(BaseApplication.b(), R.color.indicate_low_color));
            this.e = typedArrayObtainStyledAttributes.getDimension(R.styleable.HealthBodyBarView_body_bar_text_size, qrs.d(getContext(), 10.0f));
        } catch (Resources.NotFoundException unused) {
            LogUtil.e("HealthBodyBarView", "Resources NotFoundException.");
        }
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setAntiAlias(true);
        setWillNotDraw(false);
        this.i = LanguageUtil.c(this.f23985c);
    }

    public void setBarData(qtd qtdVar, int i) {
        if (qtdVar == null) {
            return;
        }
        if (i == 0) {
            this.f23984b = qtdVar.d();
        } else {
            this.f23984b = qtdVar.e();
        }
        this.f23983a = b(qtdVar, this.f23984b);
        float fC = this.f23984b;
        if (fC <= 0.0f) {
            return;
        }
        if (fC >= qtdVar.c()) {
            fC = qtdVar.c();
        }
        int i2 = this.f23983a;
        if (i2 == 0) {
            this.h = a(fC, qtdVar.h(), qtdVar.f());
        } else if (i2 == 1) {
            this.h = a(fC, qtdVar.f(), qtdVar.a());
        } else {
            this.h = a(fC, qtdVar.a(), qtdVar.c());
        }
        this.d = c(qtdVar, i);
        invalidate();
    }

    private int b(qtd qtdVar, float f) {
        int i = 0;
        if (qtdVar == null) {
            return 0;
        }
        if (f >= qtdVar.f()) {
            i = f < qtdVar.a() ? 1 : 2;
        }
        LogUtil.a("HealthBodyBarView", "getIndicatorState()  ", Integer.valueOf(i));
        return i;
    }

    private int c(qtd qtdVar, int i) {
        return (qtdVar != null && i == 0) ? ContextCompat.getColor(BaseApplication.b(), R.color.indicate_low_color) : ContextCompat.getColor(BaseApplication.b(), R.color.indicate_gray_color);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.g = View.MeasureSpec.getSize(i2);
        int size = View.MeasureSpec.getSize(i);
        this.o = size;
        setMeasuredDimension(size, this.g);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        e(canvas);
    }

    private void e(Canvas canvas) {
        float f;
        float f2;
        float f3;
        if (this.f23984b <= 0.0f) {
            return;
        }
        Paint paint = new Paint(this.f);
        paint.setColor(this.d);
        Paint textPaint = getTextPaint();
        String strE = UnitUtil.e(this.f23984b, 1, 1);
        if (this.j && this.i) {
            strE = UnitUtil.e(this.f23984b, 2, 1);
        }
        String str = strE;
        float fMeasureText = textPaint.measureText(str);
        float indicatorLength = getIndicatorLength();
        float f4 = this.g / 2.0f;
        float fD = d(indicatorLength, f4);
        float fB = b(textPaint, fMeasureText, fD, f4);
        if (LanguageUtil.ba(this.f23985c.getApplicationContext())) {
            float f5 = this.o;
            f = f5 - fB;
            f2 = f5 - fD;
            f3 = f5 - 0.0f;
        } else {
            f = fB;
            f2 = fD;
            f3 = 0.0f;
        }
        canvas.drawRect(f3, 0.0f, f2, this.g + 0.0f, paint);
        canvas.drawCircle(f2, f4, f4, paint);
        canvas.drawText(str, f, f4 + (d(str, textPaint) / 2.0f), textPaint);
    }

    private float d(float f, float f2) {
        float f3 = (-f2) / 2.0f;
        LogUtil.a("HealthBodyBarView", "getLineEndPosition indicatorLength ", Float.valueOf(f), " minEndPosition ", Float.valueOf(f3));
        return Math.max(f - f2, f3);
    }

    private float b(Paint paint, float f, float f2, float f3) {
        float f4 = f / 2.0f;
        if (f <= f2) {
            return f2 - f4;
        }
        if (f < f2 + f3) {
            return f4 + 3.0f;
        }
        paint.setColor(this.d);
        return f2 + (f3 * 2.0f) + f4;
    }

    private Paint getTextPaint() {
        Paint paint = new Paint(this.f);
        paint.setColor(this.f23985c.getResources().getColor(R.color.common_color_white));
        paint.setTextSize(this.e);
        paint.setTypeface(Typeface.create(this.f23985c.getResources().getString(R.string.textFontFamilyRegular), 0));
        paint.setTextAlign(Paint.Align.CENTER);
        return paint;
    }

    private float getIndicatorLength() {
        float f;
        float f2;
        float f3;
        float f4;
        int i = this.f23983a;
        if (i == 0) {
            f = this.o * 0.33333334f;
            f4 = this.h;
        } else {
            if (i == 1) {
                f = this.o * 0.33333334f;
                f2 = this.h;
                f3 = 1.0f;
            } else {
                f = this.o * 0.33333334f;
                f2 = this.h;
                f3 = 2.0f;
            }
            f4 = f2 + f3;
        }
        float f5 = f * f4;
        if (f5 < 0.0f) {
            return 0.0f;
        }
        return f5;
    }

    private int d(String str, Paint paint) {
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    public void setFatData(boolean z) {
        this.j = z;
    }
}
