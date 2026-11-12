package com.huami.moving.ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.huami.chart.template.ColorTemplate;
import com.huami.moving.R;
import com.huami.moving.ui.utils.ViewUtils;
import com.huami.moving.utils.Utils;

/* JADX INFO: loaded from: classes5.dex */
public class PaceNotiSeekBar extends View {
    private OnSeekBarChangeListener a;
    private b b;
    private a c;
    private int d;
    private boolean e;
    private float f;

    public interface OnSeekBarChangeListener {
        void onProgressChanged(PaceNotiSeekBar paceNotiSeekBar, float f);

        void onStartTrackingTouch(PaceNotiSeekBar paceNotiSeekBar);

        void onStopTrackingTouch(PaceNotiSeekBar paceNotiSeekBar);
    }

    public static class a {
        private b a;
        private Paint b;
        private float c = 6.0f;
        private float d = 0.0f;
        private float e = 1.0f;
        private float f;
        private float g;
        private int[] h;

        @ColorInt
        private int i;

        @ColorInt
        private int j;

        @ColorInt
        private int k;

        public a(b bVar) {
            this.f = 2.0f;
            int i = R.color.cl_sphr_first;
            this.h = new int[]{i, R.color.cl_sphr_second};
            this.i = -1;
            this.j = ColorTemplate.INTERACTIVE_LINE_DEFAULT_COLOR;
            this.k = ColorTemplate.INTERACTIVE_LINE_DEFAULT_COLOR;
            this.a = bVar;
            this.f = bVar.a(0.5f);
            this.b = new Paint(1);
            if (Utils.isMidong()) {
                this.h[0] = R.color.cl_sphr_first_zepp;
            } else {
                this.h[0] = i;
            }
        }

        public void a(Canvas canvas) {
            Rect rectC = this.a.c();
            float fWidth = rectC.left + ((rectC.width() * this.d) / this.e);
            float fCenterY = rectC.centerY();
            int i = rectC.left;
            float f = this.c;
            if (fWidth < i + (f / 2.0f)) {
                fWidth = i + (f / 2.0f);
            } else {
                int i2 = rectC.right;
                if (fWidth > i2 - (f / 2.0f)) {
                    fWidth = i2 - (f / 2.0f);
                }
            }
            float f2 = fWidth;
            float f3 = this.g;
            if (f3 <= 0.0f || f3 > this.a.c().height()) {
                this.g = this.a.c().height();
            }
            int iB = this.a.b(this.h[0]);
            int iB2 = this.a.b(this.h[1]);
            int i3 = this.a.c().left;
            int i4 = this.a.c().right;
            float fCenterY2 = this.a.c().centerY() - (this.g / 2.0f);
            float fCenterY3 = this.a.c().centerY();
            float f4 = this.g;
            float f5 = fCenterY3 + (f4 / 2.0f);
            float f6 = f4 / 2.0f;
            this.b.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            this.b.setStyle(Paint.Style.FILL);
            this.b.setColor(iB);
            float f7 = i3 + f6;
            canvas.drawCircle(f7, this.a.c().centerY(), f6, this.b);
            canvas.drawRect(f7, fCenterY2, f2, f5, this.b);
            this.b.setColor(iB2);
            float f8 = i4 - f6;
            canvas.drawRect(f2, fCenterY2, f8, f5, this.b);
            canvas.drawCircle(f8, this.a.c().centerY(), f6, this.b);
            this.b.setStyle(Paint.Style.FILL);
            this.b.setColor(this.i);
            this.b.setShadowLayer(this.c / 6.0f, 0.0f, this.a.a(1.0f), this.k);
            canvas.drawCircle(f2, fCenterY, this.c / 2.0f, this.b);
            this.b.setStyle(Paint.Style.STROKE);
            this.b.setColor(this.j);
            this.b.setStrokeWidth(this.f);
            canvas.drawCircle(f2, fCenterY, this.c / 2.0f, this.b);
        }

        public float b() {
            return this.g;
        }

        public float c() {
            return this.e;
        }

        public float d() {
            return this.d;
        }

        public float e() {
            float f = this.c;
            return f + (f / 3.0f);
        }

        public void f(float f) {
            this.g = f;
        }

        public void g(int[] iArr) {
            this.h = iArr;
        }

        public void h(float f) {
            this.e = f;
        }

        public void i(float f) {
            this.d = f;
        }

        public void j(float f) {
            this.c = f;
        }
    }

    public static class b {
        private Context a;
        private Rect b = new Rect();

        public b(Context context) {
            this.a = context;
        }

        public float a(float f) {
            return TypedValue.applyDimension(1, f, this.a.getResources().getDisplayMetrics());
        }

        public int b(int i) {
            return ContextCompat.getColor(this.a, i);
        }

        public Rect c() {
            return this.b;
        }

        public void d(int i, int i2, int i3, int i4, int i5, int i6) {
            this.b.set(i3, i4, i - i5, i2 - i6);
        }
    }

    public PaceNotiSeekBar(Context context) {
        super(context);
        this.e = false;
        this.f = 0.0f;
    }

    private void a(int i, int i2, float f, float f2) {
        a aVar = new a(this.b);
        this.c = aVar;
        aVar.f(i);
        this.c.j(i2);
        this.c.i(f);
        this.c.h(f2);
    }

    private void b(boolean z) {
        for (ViewParent parent = getParent(); parent != null && (parent instanceof ViewGroup); parent = parent.getParent()) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean c() {
        for (ViewParent parent = getParent(); parent != null && (parent instanceof ViewGroup); parent = parent.getParent()) {
            if (((ViewGroup) parent).shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    private void d() {
        int iDp2px = (int) ViewUtils.dp2px(getContext(), 4.0f);
        int paddingLeft = getPaddingLeft();
        if (paddingLeft < iDp2px) {
            paddingLeft = iDp2px;
        }
        int paddingRight = getPaddingRight();
        if (paddingRight >= iDp2px) {
            iDp2px = paddingRight;
        }
        setPadding(paddingLeft, getPaddingTop(), iDp2px, getPaddingBottom());
    }

    private void e(MotionEvent motionEvent) {
        setPressed(true);
        onStartTrackingTouch();
        f(motionEvent);
    }

    private void f(MotionEvent motionEvent) {
        float f;
        Rect rectC = this.b.c();
        int iRound = Math.round(motionEvent.getX());
        int iWidth = rectC.width();
        int i = rectC.left;
        if (iRound < i) {
            f = 0.0f;
        } else {
            f = iRound > rectC.right ? 1.0f : (iRound - i) / iWidth;
        }
        float max = (f * getMax()) + 0.0f;
        setProgress(max);
        invalidate();
        onProgressRefresh(max);
    }

    public float getMax() {
        return this.c.c();
    }

    public float getProgress() {
        return this.c.d();
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return (int) (this.c.b() + this.c.e());
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.c.a(canvas);
    }

    public void onProgressRefresh(float f) {
        OnSeekBarChangeListener onSeekBarChangeListener = this.a;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onProgressChanged(this, f);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.b.d(getWidth(), getHeight(), getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    public void onStartTrackingTouch() {
        this.e = true;
        OnSeekBarChangeListener onSeekBarChangeListener = this.a;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(this);
        }
    }

    public void onStopTrackingTouch() {
        this.e = false;
        OnSeekBarChangeListener onSeekBarChangeListener = this.a;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStopTrackingTouch(this);
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            b(true);
            if (c()) {
                this.f = motionEvent.getX();
            } else {
                e(motionEvent);
            }
        } else if (action == 1) {
            if (this.e) {
                f(motionEvent);
                onStopTrackingTouch();
                setPressed(false);
            } else {
                onStartTrackingTouch();
                f(motionEvent);
                onStopTrackingTouch();
            }
            invalidate();
            b(false);
        } else if (action != 2) {
            if (action == 3) {
                if (this.e) {
                    onStopTrackingTouch();
                    setPressed(false);
                }
                invalidate();
            }
        } else if (this.e) {
            f(motionEvent);
        } else if (Math.abs(motionEvent.getX() - this.f) > this.d) {
            e(motionEvent);
        }
        return true;
    }

    public void setBackgroundHeight(float f) {
        this.c.f(f);
    }

    public void setBackgroundTapeColors(int[] iArr) {
        this.c.g(iArr);
    }

    public void setMax(float f) {
        this.c.h(f);
    }

    public void setOnSeekBarChangeListener(OnSeekBarChangeListener onSeekBarChangeListener) {
        this.a = onSeekBarChangeListener;
    }

    public void setProgress(float f) {
        this.c.i(f);
        onProgressRefresh(f);
    }

    public void setThumbSize(float f) {
        this.c.j(f);
    }

    public PaceNotiSeekBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = false;
        float f = 0.0f;
        this.f = 0.0f;
        setLayerType(1, null);
        this.d = ViewConfiguration.get(context).getScaledTouchSlop();
        b bVar = new b(context);
        this.b = bVar;
        int iA = (int) bVar.a(16.0f);
        int iA2 = (int) this.b.a(4.0f);
        float f2 = 100.0f;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PaceNotiSeekBar);
            iA = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.PaceNotiSeekBar_psb_thumbSize, iA);
            iA2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.PaceNotiSeekBar_psb_backgroundHeight, iA2);
            f = typedArrayObtainStyledAttributes.getFloat(R.styleable.PaceNotiSeekBar_psb_progress, 0.0f);
            f2 = typedArrayObtainStyledAttributes.getFloat(R.styleable.PaceNotiSeekBar_psb_max, 100.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
        a(iA2, iA, f, f2);
        d();
    }
}
