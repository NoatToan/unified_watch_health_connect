package com.xiaomi.hm.health.ui.widget;

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
import com.huami.chart.template.ColorTemplate;
import com.huami.devicex.R;
import com.huami.lib.view.ViewUtils;

/* JADX INFO: loaded from: classes22.dex */
public class HeartRateSeekBar extends View {
    private e a;
    private a b;
    private f c;
    private OnSeekBarChangeListener d;
    private int e;
    private boolean f;
    private float g;
    private int[] h;
    private Float[] i;

    public interface OnSeekBarChangeListener {
        void onProgressChanged(HeartRateSeekBar heartRateSeekBar, float f);

        void onStartTrackingTouch(HeartRateSeekBar heartRateSeekBar);

        void onStopTrackingTouch(HeartRateSeekBar heartRateSeekBar);
    }

    public interface a extends b {
        void b(int[] iArr);

        void c(float f);

        void d(Float[] fArr);

        float f();
    }

    public interface b {
        void draw(Canvas canvas);
    }

    public static class c implements a {
        private e a;
        private Paint b;
        private float c;
        private int[] d = {-16128, -86780, -28404, -100847, -40960};
        private Float[] e;
        private float f;

        public c(e eVar) {
            this.a = eVar;
            Paint paint = new Paint(1);
            this.b = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f = eVar.a(1.0f);
        }

        @Override // com.xiaomi.hm.health.ui.widget.HeartRateSeekBar.a
        public void b(int[] iArr) {
            this.d = iArr;
        }

        @Override // com.xiaomi.hm.health.ui.widget.HeartRateSeekBar.a
        public void c(float f) {
            this.c = f;
        }

        @Override // com.xiaomi.hm.health.ui.widget.HeartRateSeekBar.a
        public void d(Float[] fArr) {
            this.e = fArr;
        }

        @Override // com.xiaomi.hm.health.ui.widget.HeartRateSeekBar.b
        public void draw(Canvas canvas) {
            int i;
            int i2;
            if (this.d == null) {
                return;
            }
            float f = this.c;
            if (f <= 0.0f || f > this.a.b().height()) {
                this.c = this.a.b().height();
            }
            int length = this.d.length;
            float fWidth = this.a.b().width();
            int i3 = (int) ((1.0f * fWidth) / length);
            int i4 = this.a.b().left;
            float fCenterY = this.a.b().centerY() - (this.c / 2.0f);
            float fCenterY2 = this.a.b().centerY();
            float f2 = this.c;
            float f3 = fCenterY2 + (f2 / 2.0f);
            float f4 = f2 / 2.0f;
            float fFloatValue = 0.0f;
            float fFloatValue2 = 0.0f;
            int i5 = 0;
            while (i5 < length) {
                this.b.setColor(this.d[i5]);
                Float[] fArr = this.e;
                if (fArr != null) {
                    int i6 = i5 - 1;
                    fFloatValue += i6 < 0 ? 0.0f : fArr[i6].floatValue();
                    fFloatValue2 += this.e[i5].floatValue();
                    i = ((int) (fWidth * fFloatValue)) + i4;
                    i2 = (int) (fWidth * fFloatValue2);
                } else {
                    i = (i3 * i5) + i4;
                    i2 = (i5 + 1) * i3;
                }
                int i7 = i2 + i4;
                float f5 = fFloatValue;
                float f6 = fFloatValue2;
                if (i5 == 0) {
                    float f7 = i + f4;
                    canvas.drawCircle(f7, this.a.b().centerY(), f4, this.b);
                    i = (int) f7;
                } else if (i5 == length - 1) {
                    float f8 = i7 - f4;
                    canvas.drawCircle(f8, this.a.b().centerY(), f4, this.b);
                    i7 = (int) f8;
                }
                if (i5 < length - 1) {
                    float f9 = i7;
                    canvas.drawRect(i, fCenterY, f9 - this.f, f3, this.b);
                    this.b.setColor(-1);
                    canvas.drawRect(f9 - this.f, fCenterY, f9, f3, this.b);
                } else {
                    canvas.drawRect(i, fCenterY, i7, f3, this.b);
                }
                i5++;
                fFloatValue = f5;
                fFloatValue2 = f6;
            }
        }

        @Override // com.xiaomi.hm.health.ui.widget.HeartRateSeekBar.a
        public float f() {
            return this.c;
        }
    }

    public static class d implements f {
        private e a;
        private float f;
        private float c = 6.0f;
        private float d = 0.0f;
        private float e = 1.0f;

        @ColorInt
        private int g = -1;

        @ColorInt
        private int h = ColorTemplate.INTERACTIVE_LINE_DEFAULT_COLOR;

        @ColorInt
        private int i = ColorTemplate.INTERACTIVE_LINE_DEFAULT_COLOR;
        private Paint b = new Paint(1);

        public d(e eVar) {
            this.f = 2.0f;
            this.a = eVar;
            this.f = eVar.a(0.5f);
        }

        @Override // com.xiaomi.hm.health.ui.widget.HeartRateSeekBar.f
        public float a() {
            float f = this.c;
            return f + (f / 3.0f);
        }

        @Override // com.xiaomi.hm.health.ui.widget.HeartRateSeekBar.b
        public void draw(Canvas canvas) {
            Rect rectB = this.a.b();
            float fWidth = rectB.left + ((rectB.width() * this.d) / this.e);
            float fCenterY = rectB.centerY();
            int i = rectB.left;
            float f = this.c;
            if (fWidth < i + (f / 2.0f)) {
                fWidth = i + (f / 2.0f);
            } else {
                int i2 = rectB.right;
                if (fWidth > i2 - (f / 2.0f)) {
                    fWidth = i2 - (f / 2.0f);
                }
            }
            this.b.setStyle(Paint.Style.FILL);
            this.b.setColor(this.g);
            this.b.setShadowLayer(this.c / 6.0f, 0.0f, this.a.a(1.0f), this.i);
            canvas.drawCircle(fWidth, fCenterY, this.c / 2.0f, this.b);
            this.b.setStyle(Paint.Style.STROKE);
            this.b.setColor(this.h);
            this.b.setStrokeWidth(this.f);
            canvas.drawCircle(fWidth, fCenterY, this.c / 2.0f, this.b);
        }

        @Override // com.xiaomi.hm.health.ui.widget.HeartRateSeekBar.f
        public void e(float f) {
            this.c = f;
        }

        @Override // com.xiaomi.hm.health.ui.widget.HeartRateSeekBar.f
        public void g(float f) {
            this.e = f;
        }

        @Override // com.xiaomi.hm.health.ui.widget.HeartRateSeekBar.f
        public float getMax() {
            return this.e;
        }

        @Override // com.xiaomi.hm.health.ui.widget.HeartRateSeekBar.f
        public float getProgress() {
            return this.d;
        }

        @Override // com.xiaomi.hm.health.ui.widget.HeartRateSeekBar.f
        public void setProgress(float f) {
            this.d = f;
        }
    }

    public static class e {
        private Context a;
        private Rect b = new Rect();

        public e(Context context) {
            this.a = context;
        }

        public float a(float f) {
            return TypedValue.applyDimension(1, f, this.a.getResources().getDisplayMetrics());
        }

        public Rect b() {
            return this.b;
        }

        public void c(int i, int i2, int i3, int i4, int i5, int i6) {
            this.b.set(i3, i4, i - i5, i2 - i6);
        }
    }

    public interface f extends b {
        float a();

        void e(float f);

        void g(float f);

        float getMax();

        float getProgress();

        void setProgress(float f);
    }

    public HeartRateSeekBar(Context context) {
        this(context, null);
    }

    private void a(int i) {
        c cVar = new c(this.a);
        cVar.c(i);
        this.b = cVar;
    }

    private void b(int i, float f2, float f3) {
        d dVar = new d(this.a);
        dVar.e(i);
        dVar.g(f3);
        dVar.setProgress(f2);
        this.c = dVar;
    }

    private void c(boolean z) {
        for (ViewParent parent = getParent(); parent != null && (parent instanceof ViewGroup); parent = parent.getParent()) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean d() {
        for (ViewParent parent = getParent(); parent != null && (parent instanceof ViewGroup); parent = parent.getParent()) {
            if (((ViewGroup) parent).shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    private void e() {
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

    private void f(MotionEvent motionEvent) {
        setPressed(true);
        onStartTrackingTouch();
        g(motionEvent);
    }

    private void g(MotionEvent motionEvent) {
        float f2;
        Rect rectB = this.a.b();
        int iRound = Math.round(motionEvent.getX());
        int iWidth = rectB.width();
        int i = rectB.left;
        if (iRound < i) {
            f2 = 0.0f;
        } else {
            f2 = iRound > rectB.right ? 1.0f : (iRound - i) / iWidth;
        }
        float max = (f2 * getMax()) + 0.0f;
        setProgress(max);
        invalidate();
        onProgressRefresh(max);
    }

    public float getMax() {
        return this.c.getMax();
    }

    public float getProgress() {
        return this.c.getProgress();
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return (int) (this.b.f() + this.c.a());
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.b.draw(canvas);
        this.c.draw(canvas);
    }

    public void onProgressRefresh(float f2) {
        OnSeekBarChangeListener onSeekBarChangeListener = this.d;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onProgressChanged(this, f2);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.a.c(getWidth(), getHeight(), getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    public void onStartTrackingTouch() {
        this.f = true;
        OnSeekBarChangeListener onSeekBarChangeListener = this.d;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(this);
        }
    }

    public void onStopTrackingTouch() {
        this.f = false;
        OnSeekBarChangeListener onSeekBarChangeListener = this.d;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStopTrackingTouch(this);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            c(true);
            if (d()) {
                this.g = motionEvent.getX();
            } else {
                f(motionEvent);
            }
        } else if (action == 1) {
            if (this.f) {
                g(motionEvent);
                onStopTrackingTouch();
                setPressed(false);
            } else {
                onStartTrackingTouch();
                g(motionEvent);
                onStopTrackingTouch();
            }
            invalidate();
            c(false);
        } else if (action != 2) {
            if (action == 3) {
                if (this.f) {
                    onStopTrackingTouch();
                    setPressed(false);
                }
                invalidate();
            }
        } else if (this.f) {
            g(motionEvent);
        } else if (Math.abs(motionEvent.getX() - this.g) > this.e) {
            f(motionEvent);
        }
        return true;
    }

    public void setBackgroundHeight(float f2) {
        this.b.c(f2);
    }

    public void setBackgroundTapeColors(int[] iArr) {
        this.b.b(iArr);
    }

    public void setMax(float f2) {
        this.c.g(f2);
    }

    public void setOnSeekBarChangeListener(OnSeekBarChangeListener onSeekBarChangeListener) {
        this.d = onSeekBarChangeListener;
    }

    public void setPercentsWidth(Float[] fArr) {
        this.b.d(fArr);
    }

    public void setProgress(float f2) {
        this.c.setProgress(f2);
        onProgressRefresh(f2);
        invalidate();
    }

    public void setThumbSize(float f2) {
        this.c.e(f2);
    }

    public HeartRateSeekBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = false;
        float f2 = 0.0f;
        this.g = 0.0f;
        setLayerType(1, null);
        this.e = ViewConfiguration.get(context).getScaledTouchSlop();
        e eVar = new e(context);
        this.a = eVar;
        int iA = (int) eVar.a(16.0f);
        int iA2 = (int) this.a.a(4.0f);
        float f3 = 100.0f;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HeartRateSeekBar);
            iA = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HeartRateSeekBar_hrsb_thumbSize, iA);
            iA2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HeartRateSeekBar_hrsb_backgroundHeight, iA2);
            f2 = typedArrayObtainStyledAttributes.getFloat(R.styleable.HeartRateSeekBar_hrsb_progress, 0.0f);
            f3 = typedArrayObtainStyledAttributes.getFloat(R.styleable.HeartRateSeekBar_hrsb_max, 100.0f);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HeartRateSeekBar_hrsb_section_colors, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HeartRateSeekBar_hrsb_section_percent, 0);
            if (resourceId > 0) {
                this.h = getContext().getResources().getIntArray(resourceId);
            }
            if (resourceId2 > 0) {
                String[] stringArray = getContext().getResources().getStringArray(resourceId2);
                Float[] fArr = new Float[stringArray.length];
                for (int i = 0; i < stringArray.length; i++) {
                    fArr[i] = Float.valueOf(stringArray[i]);
                }
                this.i = fArr;
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        a(iA2);
        b(iA, f2, f3);
        e();
        int[] iArr = this.h;
        if (iArr != null) {
            setBackgroundTapeColors(iArr);
        }
        Float[] fArr2 = this.i;
        if (fArr2 != null) {
            setPercentsWidth(fArr2);
        }
    }
}
