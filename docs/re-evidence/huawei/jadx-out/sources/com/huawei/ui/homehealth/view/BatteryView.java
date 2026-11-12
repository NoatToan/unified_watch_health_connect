package com.huawei.ui.homehealth.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.ui.homehealth.R;
import defpackage.qre;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes17.dex */
public class BatteryView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f26166a = qre.e(R.color.tab_device_battery_bg);
    private static final int d = qre.e(R.color.tab_device_battery_more_20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bitmap f26167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f26168c;
    private RectF e;
    private Paint f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int o;

    public BatteryView(Context context) {
        super(context);
        this.f26168c = new Paint(1);
        this.f = new Paint(1);
        this.e = new RectF();
        this.h = f26166a;
        this.j = d;
        this.i = 0;
        this.g = 100;
        c((AttributeSet) null);
    }

    public BatteryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26168c = new Paint(1);
        this.f = new Paint(1);
        this.e = new RectF();
        this.h = f26166a;
        this.j = d;
        this.i = 0;
        this.g = 100;
        c(attributeSet);
    }

    private void c(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ProgressRingView);
            this.h = typedArrayObtainStyledAttributes.getColor(R.styleable.ProgressRingView_ringBackgroundColor, f26166a);
            this.j = typedArrayObtainStyledAttributes.getColor(R.styleable.ProgressRingView_progressSolidColor, d);
            if (typedArrayObtainStyledAttributes.hasValue(R.styleable.ProgressRingView_centerIcon)) {
                this.f26167b = b(typedArrayObtainStyledAttributes.getDrawable(R.styleable.ProgressRingView_centerIcon));
            }
            this.o = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.ProgressRingView_ringWidth, c(6.0f));
            this.i = typedArrayObtainStyledAttributes.getInt(R.styleable.ProgressRingView_progress, 0);
            this.g = typedArrayObtainStyledAttributes.getInt(R.styleable.ProgressRingView_maxProgress, 100);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f26168c.setColor(this.h);
        this.f26168c.setStyle(Paint.Style.STROKE);
        this.f26168c.setStrokeWidth(this.o);
        this.f26168c.setStrokeCap(Paint.Cap.ROUND);
        this.f.setColor(this.j);
        this.f.setStyle(Paint.Style.STROKE);
        this.f.setStrokeWidth(this.o);
        this.f.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight());
        setMeasuredDimension(iMin, iMin);
        float f = this.o / 2.0f;
        float f2 = iMin - f;
        this.e.set(f, f, f2, f2);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.e, 0.0f, 360.0f, false, this.f26168c);
        int i = this.i;
        float f = (i * 360.0f) / this.g;
        ReleaseLogUtil.d("R_BatteryView", "onDraw progress:", Integer.valueOf(i), " sweepAngle:", Float.valueOf(f));
        canvas.drawArc(this.e, -90.0f, f, false, this.f);
        if (this.f26167b != null) {
            int iC = (int) c(18.0f);
            int width = (getWidth() - iC) / 2;
            int height = (getHeight() - iC) / 2;
            canvas.drawBitmap(this.f26167b, (Rect) null, new Rect(width, height, width + iC, iC + height), (Paint) null);
        }
    }

    private float c(float f) {
        return f * getResources().getDisplayMetrics().density;
    }

    public void setProgress(int i) {
        this.i = Math.min(Math.max(i, 0), this.g);
        c(false);
        invalidate();
    }

    public void setProgress(int i, boolean z) {
        this.i = Math.min(Math.max(i, 0), this.g);
        c(z);
        invalidate();
    }

    public void setMacaProgress(int i) {
        this.i = Math.min(Math.max(i, 0), this.g);
        invalidate();
    }

    public void setCenterIcon(Drawable drawable) {
        this.f26167b = b(drawable);
        invalidate();
    }

    public void setRingBackgroundColor(int i) {
        this.h = i;
        this.f26168c.setColor(i);
        invalidate();
    }

    public void setProgressSolidColor(int i) {
        this.j = i;
        this.f.setColor(i);
        invalidate();
    }

    private Bitmap b(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0) {
            intrinsicWidth = 100;
        }
        if (intrinsicHeight <= 0) {
            intrinsicHeight = 100;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    private void c(boolean z) {
        if (z) {
            int i = this.i;
            if (i <= 10) {
                this.j = qre.e(R.color.tab_device_battery_low_10);
            } else if (i <= 20) {
                this.j = qre.e(R.color.tab_device_battery_low_20);
            } else {
                this.j = qre.e(R.color.tab_device_battery_more_20);
            }
            this.f.setColor(this.j);
            return;
        }
        int i2 = this.i;
        if (i2 <= 10) {
            this.f26167b = b(ContextCompat.getDrawable(getContext(), this.i <= 5 ? R.drawable.ic_tab_device_battery_0_5 : R.drawable.ic_tab_device_battery_6_10));
            this.j = qre.e(R.color.tab_device_battery_low_10);
        } else if (i2 <= 20) {
            this.f26167b = b(ContextCompat.getDrawable(getContext(), R.drawable.ic_tab_device_battery_11_20));
            this.j = qre.e(R.color.tab_device_battery_low_20);
        } else {
            if (i2 <= 30) {
                this.f26167b = b(ContextCompat.getDrawable(getContext(), R.drawable.ic_tab_device_battery_21_30));
            } else if (i2 <= 40) {
                this.f26167b = b(ContextCompat.getDrawable(getContext(), R.drawable.ic_tab_device_battery_31_40));
            } else if (i2 <= 50) {
                this.f26167b = b(ContextCompat.getDrawable(getContext(), R.drawable.ic_tab_device_battery_41_50));
            } else if (i2 <= 60) {
                this.f26167b = b(ContextCompat.getDrawable(getContext(), R.drawable.ic_tab_device_battery_51_60));
            } else if (i2 <= 70) {
                this.f26167b = b(ContextCompat.getDrawable(getContext(), R.drawable.ic_tab_device_battery_61_70));
            } else if (i2 <= 80) {
                this.f26167b = b(ContextCompat.getDrawable(getContext(), R.drawable.ic_tab_device_battery_71_80));
            } else if (i2 <= 90) {
                this.f26167b = b(ContextCompat.getDrawable(getContext(), R.drawable.ic_tab_device_battery_81_90));
            } else {
                this.f26167b = b(ContextCompat.getDrawable(getContext(), R.drawable.ic_tab_device_battery_91_100));
            }
            this.j = qre.e(R.color.tab_device_battery_more_20);
        }
        this.f.setColor(this.j);
    }
}
