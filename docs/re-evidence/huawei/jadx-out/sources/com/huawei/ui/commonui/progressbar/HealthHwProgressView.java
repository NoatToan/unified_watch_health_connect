package com.huawei.ui.commonui.progressbar;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.R;
import defpackage.qrs;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes43.dex */
public class HealthHwProgressView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f23801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f23802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f23803c;
    private int d;
    private float e;
    private int f;
    private RectF g;
    private Paint h;
    private float i;
    private float j;
    private int o;

    public HealthHwProgressView(Context context) {
        this(context, null);
        this.f23801a = context;
    }

    public HealthHwProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f23801a = context;
    }

    public HealthHwProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = 7.0f;
        this.o = Color.parseColor("#FFFCA077");
        this.d = Color.parseColor(Constants.CHOOSE_TEXT_COLOR);
        this.f23801a = context;
        c(attributeSet);
        e();
    }

    private void e() {
        Paint paint = new Paint();
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h.setAntiAlias(true);
        this.g = new RectF();
        Paint paint2 = new Paint();
        this.f23803c = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f23803c.setAntiAlias(true);
        this.f23803c.setColor(Color.parseColor("#77999999"));
    }

    private void c(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes;
        Context context = this.f23801a;
        if (context == null || (typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HealthHwProgressView)) == null) {
            return;
        }
        try {
            this.o = typedArrayObtainStyledAttributes.getColor(R.styleable.HealthHwProgressView_health_progress_view_start_color, Color.parseColor("#FFFCA077"));
            this.d = typedArrayObtainStyledAttributes.getColor(R.styleable.HealthHwProgressView_health_progress_view_end_color, Color.parseColor(Constants.CHOOSE_TEXT_COLOR));
            this.i = typedArrayObtainStyledAttributes.getDimension(R.styleable.HealthHwProgressView_health_progress_view_radius, qrs.d(this.f23801a, 7.0f));
        } catch (Resources.NotFoundException unused) {
            LogUtil.c("CommonUI_HealthHwProgressView", "initAttrs NotFoundException");
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(e(i), d(i2));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f23801a == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        if (width == 0) {
            width = qrs.d(this.f23801a, 116.0f);
        }
        if (height == 0) {
            height = qrs.d(this.f23801a, 7.0f);
        }
        float f = height / 2.0f;
        b(canvas, width, f);
        float f2 = width;
        float fD = (qrs.d(this.f23801a, 7.0f) * 100.0f) / f2;
        this.e = fD;
        float f3 = this.j;
        if (f3 <= 0.0f) {
            LogUtil.a("CommonUI_HealthHwProgressView", "mRealPercent = 0 do nothing for progress view");
            return;
        }
        LogUtil.a("CommonUI_HealthHwProgressView", "mRealPercent = ", Float.valueOf(f3), ", mMinPercent = ", Float.valueOf(fD));
        if (this.j <= this.e) {
            b(canvas);
            return;
        }
        if (this.h == null) {
            Paint paint = new Paint();
            this.h = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.h.setAntiAlias(true);
        }
        float f4 = (this.f / 100.0f) * f2;
        this.h.setShader(new LinearGradient(0.0f, f, f4, f, this.o, this.d, Shader.TileMode.CLAMP));
        this.h.setStyle(Paint.Style.FILL);
        if (this.g == null) {
            this.g = new RectF();
        }
        this.g.set(0.0f, 0.0f, f4, getHeight());
        RectF rectF = this.g;
        float f5 = this.i;
        canvas.drawRoundRect(rectF, f5, f5, this.h);
    }

    private void b(Canvas canvas) {
        if (this.f23802b == null) {
            this.f23802b = new Paint();
        }
        float fD = qrs.d(this.f23801a, 3.5f);
        this.f23802b.setShader(new LinearGradient(0.0f, fD, qrs.d(this.f23801a, 7.0f), fD, this.o, this.d, Shader.TileMode.CLAMP));
        canvas.drawCircle(fD, fD, fD, this.f23802b);
    }

    private void b(Canvas canvas, int i, float f) {
        if (this.f23803c == null) {
            Paint paint = new Paint();
            this.f23803c = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f23803c.setAntiAlias(true);
            this.f23803c.setColor(Color.parseColor("#77999999"));
        }
        int iD = (i - qrs.d(this.f23801a, 5.5f)) / qrs.d(this.f23801a, 4.0f);
        float fD = 0.0f;
        for (int i2 = 0; i2 < iD + 2; i2++) {
            canvas.drawCircle(qrs.d(this.f23801a, (i2 * 4) + 0.75f), f, qrs.d(this.f23801a, 0.75f), this.f23803c);
            if (i2 == 0) {
                fD = qrs.d(this.f23801a, 1.5f);
            } else {
                fD += qrs.d(this.f23801a, 4.0f);
            }
            if (fD >= i) {
                return;
            }
        }
    }

    protected int e(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int iD = qrs.d(this.f23801a, 116.0f);
        return mode == Integer.MIN_VALUE ? Math.min(iD, size) : iD;
    }

    protected int d(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int iD = qrs.d(this.f23801a, 7.0f);
        return mode == Integer.MIN_VALUE ? Math.min(iD, size) : iD;
    }
}
