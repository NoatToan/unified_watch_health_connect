package com.pnikosis.materialishprogress;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import com.huami.watch.companion.R;

/* JADX INFO: loaded from: classes18.dex */
public class ProgressWheel extends View {
    private static final String z = ProgressWheel.class.getSimpleName();
    private final int a;
    private final int b;
    private final long c;
    private int d;
    private int e;
    private int f;
    private boolean g;
    private double h;
    private double i;
    private float j;
    private boolean k;
    private long l;
    private int m;
    private int n;
    private Paint o;
    private Paint p;
    private RectF q;
    private float r;
    private long s;
    private boolean t;
    private float u;
    private float v;
    private boolean w;
    private ProgressCallback x;
    private boolean y;

    public interface ProgressCallback {
        void onProgressUpdate(float f);
    }

    public static class WheelSavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<WheelSavedState> CREATOR = new a();
        public float a;
        public float b;
        public boolean c;
        public float d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public boolean j;
        public boolean k;

        public class a implements Parcelable.Creator<WheelSavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public WheelSavedState createFromParcel(Parcel parcel) {
                return new WheelSavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public WheelSavedState[] newArray(int i) {
                return new WheelSavedState[i];
            }
        }

        public WheelSavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.a);
            parcel.writeFloat(this.b);
            parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
            parcel.writeFloat(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
            parcel.writeInt(this.i);
            parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.k ? (byte) 1 : (byte) 0);
        }

        private WheelSavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readFloat();
            this.b = parcel.readFloat();
            this.c = parcel.readByte() != 0;
            this.d = parcel.readFloat();
            this.e = parcel.readInt();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
            this.h = parcel.readInt();
            this.i = parcel.readInt();
            this.j = parcel.readByte() != 0;
            this.k = parcel.readByte() != 0;
        }
    }

    public ProgressWheel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 16;
        this.b = 270;
        this.c = 200L;
        this.d = 28;
        this.e = 4;
        this.f = 4;
        this.g = false;
        this.h = 0.0d;
        this.i = 460.0d;
        this.j = 0.0f;
        this.k = true;
        this.l = 0L;
        this.m = -1442840576;
        this.n = 16777215;
        this.o = new Paint();
        this.p = new Paint();
        this.q = new RectF();
        this.r = 230.0f;
        this.s = 0L;
        this.u = 0.0f;
        this.v = 0.0f;
        this.w = false;
        a(context.obtainStyledAttributes(attributeSet, R.styleable.ProgressWheel));
        d();
    }

    private void a(TypedArray typedArray) {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        this.e = (int) TypedValue.applyDimension(1, this.e, displayMetrics);
        this.f = (int) TypedValue.applyDimension(1, this.f, displayMetrics);
        int iApplyDimension = (int) TypedValue.applyDimension(1, this.d, displayMetrics);
        this.d = iApplyDimension;
        this.d = (int) typedArray.getDimension(R.styleable.ProgressWheel_matProg_circleRadius, iApplyDimension);
        this.g = typedArray.getBoolean(R.styleable.ProgressWheel_matProg_fillRadius, false);
        this.e = (int) typedArray.getDimension(R.styleable.ProgressWheel_matProg_barWidth, this.e);
        this.f = (int) typedArray.getDimension(R.styleable.ProgressWheel_matProg_rimWidth, this.f);
        this.r = typedArray.getFloat(R.styleable.ProgressWheel_matProg_spinSpeed, this.r / 360.0f) * 360.0f;
        this.i = typedArray.getInt(R.styleable.ProgressWheel_matProg_barSpinCycleTime, (int) this.i);
        this.m = typedArray.getColor(R.styleable.ProgressWheel_matProg_barColor, this.m);
        this.n = typedArray.getColor(R.styleable.ProgressWheel_matProg_rimColor, this.n);
        this.t = typedArray.getBoolean(R.styleable.ProgressWheel_matProg_linearProgress, false);
        if (typedArray.getBoolean(R.styleable.ProgressWheel_matProg_progressIndeterminate, false)) {
            spin();
        }
        typedArray.recycle();
    }

    private void b() {
        if (this.x != null) {
            this.x.onProgressUpdate(Math.round((this.u * 100.0f) / 360.0f) / 100.0f);
        }
    }

    private void c(float f) {
        ProgressCallback progressCallback = this.x;
        if (progressCallback != null) {
            progressCallback.onProgressUpdate(f);
        }
    }

    @TargetApi(17)
    private void d() {
        this.y = Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f;
    }

    private void e(int i, int i2) {
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        if (this.g) {
            int i3 = this.e;
            this.q = new RectF(paddingLeft + i3, paddingTop + i3, (i - paddingRight) - i3, (i2 - paddingBottom) - i3);
            return;
        }
        int i4 = (i - paddingLeft) - paddingRight;
        int iMin = Math.min(Math.min(i4, (i2 - paddingBottom) - paddingTop), (this.d * 2) - (this.e * 2));
        int i5 = ((i4 - iMin) / 2) + paddingLeft;
        int i6 = ((((i2 - paddingTop) - paddingBottom) - iMin) / 2) + paddingTop;
        int i7 = this.e;
        this.q = new RectF(i5 + i7, i6 + i7, (i5 + iMin) - i7, (i6 + iMin) - i7);
    }

    private void f() {
        this.o.setColor(this.m);
        this.o.setAntiAlias(true);
        this.o.setStyle(Paint.Style.STROKE);
        this.o.setStrokeWidth(this.e);
        this.p.setColor(this.n);
        this.p.setAntiAlias(true);
        this.p.setStyle(Paint.Style.STROKE);
        this.p.setStrokeWidth(this.f);
    }

    private void g(long j) {
        long j2 = this.l;
        if (j2 < 200) {
            this.l = j2 + j;
            return;
        }
        double d = this.h + j;
        this.h = d;
        double d2 = this.i;
        if (d > d2) {
            this.h = d - d2;
            this.l = 0L;
            this.k = !this.k;
        }
        float fCos = (((float) Math.cos(((this.h / d2) + 1.0d) * 3.141592653589793d)) / 2.0f) + 0.5f;
        if (this.k) {
            this.j = fCos * 254.0f;
            return;
        }
        float f = (1.0f - fCos) * 254.0f;
        this.u += this.j - f;
        this.j = f;
    }

    public int getBarColor() {
        return this.m;
    }

    public int getBarWidth() {
        return this.e;
    }

    public int getCircleRadius() {
        return this.d;
    }

    public float getProgress() {
        if (this.w) {
            return -1.0f;
        }
        return this.u / 360.0f;
    }

    public int getRimColor() {
        return this.n;
    }

    public int getRimWidth() {
        return this.f;
    }

    public float getSpinSpeed() {
        return this.r / 360.0f;
    }

    public boolean isSpinning() {
        return this.w;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        super.onDraw(canvas);
        canvas.drawArc(this.q, 360.0f, 360.0f, false, this.p);
        if (this.y) {
            float fPow = 0.0f;
            boolean z2 = true;
            if (this.w) {
                long jUptimeMillis = SystemClock.uptimeMillis() - this.s;
                float f3 = (jUptimeMillis * this.r) / 1000.0f;
                g(jUptimeMillis);
                float f4 = this.u + f3;
                this.u = f4;
                if (f4 > 360.0f) {
                    this.u = f4 - 360.0f;
                    c(-1.0f);
                }
                this.s = SystemClock.uptimeMillis();
                float f5 = this.u - 90.0f;
                float f6 = this.j + 16.0f;
                if (isInEditMode()) {
                    f = 0.0f;
                    f2 = 135.0f;
                } else {
                    f = f5;
                    f2 = f6;
                }
                canvas.drawArc(this.q, f, f2, false, this.o);
            } else {
                float f7 = this.u;
                if (f7 != this.v) {
                    this.u = Math.min(this.u + (((SystemClock.uptimeMillis() - this.s) / 1000.0f) * this.r), this.v);
                    this.s = SystemClock.uptimeMillis();
                } else {
                    z2 = false;
                }
                if (f7 != this.u) {
                    b();
                }
                float fPow2 = this.u;
                if (!this.t) {
                    fPow = ((float) (1.0d - Math.pow(1.0f - (fPow2 / 360.0f), 4.0f))) * 360.0f;
                    fPow2 = ((float) (1.0d - Math.pow(1.0f - (this.u / 360.0f), 2.0f))) * 360.0f;
                }
                canvas.drawArc(this.q, fPow - 90.0f, isInEditMode() ? 360.0f : fPow2, false, this.o);
            }
            if (z2) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int paddingLeft = this.d + getPaddingLeft() + getPaddingRight();
        int paddingTop = this.d + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            paddingLeft = size;
        } else if (mode == Integer.MIN_VALUE) {
            paddingLeft = Math.min(paddingLeft, size);
        }
        if (mode2 == 1073741824 || mode == 1073741824) {
            paddingTop = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            paddingTop = Math.min(paddingTop, size2);
        }
        setMeasuredDimension(paddingLeft, paddingTop);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof WheelSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        WheelSavedState wheelSavedState = (WheelSavedState) parcelable;
        super.onRestoreInstanceState(wheelSavedState.getSuperState());
        this.u = wheelSavedState.a;
        this.v = wheelSavedState.b;
        this.w = wheelSavedState.c;
        this.r = wheelSavedState.d;
        this.e = wheelSavedState.e;
        this.m = wheelSavedState.f;
        this.f = wheelSavedState.g;
        this.n = wheelSavedState.h;
        this.d = wheelSavedState.i;
        this.t = wheelSavedState.j;
        this.g = wheelSavedState.k;
        this.s = SystemClock.uptimeMillis();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        WheelSavedState wheelSavedState = new WheelSavedState(super.onSaveInstanceState());
        wheelSavedState.a = this.u;
        wheelSavedState.b = this.v;
        wheelSavedState.c = this.w;
        wheelSavedState.d = this.r;
        wheelSavedState.e = this.e;
        wheelSavedState.f = this.m;
        wheelSavedState.g = this.f;
        wheelSavedState.h = this.n;
        wheelSavedState.i = this.d;
        wheelSavedState.j = this.t;
        wheelSavedState.k = this.g;
        return wheelSavedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        e(i, i2);
        f();
        invalidate();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            this.s = SystemClock.uptimeMillis();
        }
    }

    public void resetCount() {
        this.u = 0.0f;
        this.v = 0.0f;
        invalidate();
    }

    public void setBarColor(int i) {
        this.m = i;
        f();
        if (this.w) {
            return;
        }
        invalidate();
    }

    public void setBarWidth(int i) {
        this.e = i;
        if (this.w) {
            return;
        }
        invalidate();
    }

    public void setCallback(ProgressCallback progressCallback) {
        this.x = progressCallback;
        if (this.w) {
            return;
        }
        b();
    }

    public void setCircleRadius(int i) {
        this.d = i;
        if (this.w) {
            return;
        }
        invalidate();
    }

    public void setInstantProgress(float f) {
        if (this.w) {
            this.u = 0.0f;
            this.w = false;
        }
        if (f > 1.0f) {
            f -= 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        if (f == this.v) {
            return;
        }
        float fMin = Math.min(f * 360.0f, 360.0f);
        this.v = fMin;
        this.u = fMin;
        this.s = SystemClock.uptimeMillis();
        invalidate();
    }

    public void setLinearProgress(boolean z2) {
        this.t = z2;
        if (this.w) {
            return;
        }
        invalidate();
    }

    public void setProgress(float f) {
        if (this.w) {
            this.u = 0.0f;
            this.w = false;
            b();
        }
        if (f > 1.0f) {
            f -= 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = this.v;
        if (f == f2) {
            return;
        }
        if (this.u == f2) {
            this.s = SystemClock.uptimeMillis();
        }
        this.v = Math.min(f * 360.0f, 360.0f);
        invalidate();
    }

    public void setRimColor(int i) {
        this.n = i;
        f();
        if (this.w) {
            return;
        }
        invalidate();
    }

    public void setRimWidth(int i) {
        this.f = i;
        if (this.w) {
            return;
        }
        invalidate();
    }

    public void setSpinSpeed(float f) {
        this.r = f * 360.0f;
    }

    public void spin() {
        this.s = SystemClock.uptimeMillis();
        this.w = true;
        invalidate();
    }

    public void stopSpinning() {
        this.w = false;
        this.u = 0.0f;
        this.v = 0.0f;
        invalidate();
    }

    public ProgressWheel(Context context) {
        super(context);
        this.a = 16;
        this.b = 270;
        this.c = 200L;
        this.d = 28;
        this.e = 4;
        this.f = 4;
        this.g = false;
        this.h = 0.0d;
        this.i = 460.0d;
        this.j = 0.0f;
        this.k = true;
        this.l = 0L;
        this.m = -1442840576;
        this.n = 16777215;
        this.o = new Paint();
        this.p = new Paint();
        this.q = new RectF();
        this.r = 230.0f;
        this.s = 0L;
        this.u = 0.0f;
        this.v = 0.0f;
        this.w = false;
        d();
    }
}
