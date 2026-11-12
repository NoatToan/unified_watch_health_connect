package com.huawei.ui.device.views.music;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.huawei.ui.device.R;
import defpackage.qrs;
import defpackage.rfy;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class AlphabetIndexWaveSideBarView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f25000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25002c;
    private float d;
    private int e;
    private int f;
    private List<String> g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private ValueAnimator m;
    private Paint n;
    private OnLetterChangeListener o;
    private int p;
    private int q;
    private TextPaint r;
    private int s;
    private RectF t;
    private Path u;
    private Paint v;
    private int w;
    private int x;
    private int y;
    private int z;

    public interface OnLetterChangeListener {
        void onLetterChange(String str);
    }

    public AlphabetIndexWaveSideBarView(Context context) {
        this(context, null);
    }

    public AlphabetIndexWaveSideBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AlphabetIndexWaveSideBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25000a = context;
        b(attributeSet, i);
        c();
    }

    private void b(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.AlphabetIndexWaveSideBarView, i, 0);
        if (qrs.x(this.f25000a)) {
            this.q = typedArrayObtainStyledAttributes.getColor(R.styleable.AlphabetIndexWaveSideBarView_textColorOfAlphabetIndex, getResources().getColor(R.color.textColorSecondary));
        } else {
            this.q = typedArrayObtainStyledAttributes.getColor(R.styleable.AlphabetIndexWaveSideBarView_textColorOfAlphabetIndex, getResources().getColor(R.color.alphabet_index_default_color));
        }
        setTextSize(typedArrayObtainStyledAttributes);
        this.i = typedArrayObtainStyledAttributes.getColor(R.styleable.AlphabetIndexWaveSideBarView_hintedTextColor, getResources().getColor(R.color.color_normal_titlebar_title));
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.AlphabetIndexWaveSideBarView_hintCircleRadius, (int) TypedValue.applyDimension(1, 24.0f, getResources().getDisplayMetrics()));
        this.j = typedArrayObtainStyledAttributes.getColor(R.styleable.AlphabetIndexWaveSideBarView_hintCircleColor, getResources().getColor(R.color.alphabet_index_touch_color));
        this.y = typedArrayObtainStyledAttributes.getColor(R.styleable.AlphabetIndexWaveSideBarView_waveColor, getResources().getColor(R.color.alphabet_index_touch_color));
        this.z = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.AlphabetIndexWaveSideBarView_waveRadius, (int) TypedValue.applyDimension(1, 20.0f, getResources().getDisplayMetrics()));
        this.f25002c = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.AlphabetIndexWaveSideBarView_contentPadding, (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics()));
        this.f25001b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.AlphabetIndexWaveSideBarView_barPadding, (int) TypedValue.applyDimension(1, 8.0f, getResources().getDisplayMetrics()));
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.AlphabetIndexWaveSideBarView_barWidth, (int) TypedValue.applyDimension(1, 0.0f, getResources().getDisplayMetrics()));
        this.e = dimensionPixelOffset;
        if (dimensionPixelOffset == 0) {
            this.e = this.x;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void setTextSize(TypedArray typedArray) {
        if (typedArray.getBoolean(R.styleable.AlphabetIndexWaveSideBarView_is_multiple_scale, false)) {
            if (qrs.ac()) {
                this.x = typedArray.getDimensionPixelOffset(R.styleable.AlphabetIndexWaveSideBarView_textSize, (int) TypedValue.applyDimension(1, 20.0f, getResources().getDisplayMetrics()));
                this.p = typedArray.getDimensionPixelOffset(R.styleable.AlphabetIndexWaveSideBarView_selectTextSize, (int) TypedValue.applyDimension(1, 20.0f, getResources().getDisplayMetrics()));
                this.h = typedArray.getDimensionPixelOffset(R.styleable.AlphabetIndexWaveSideBarView_hintTextSize, (int) TypedValue.applyDimension(1, 32.0f, getResources().getDisplayMetrics()));
                return;
            } else {
                this.x = typedArray.getDimensionPixelOffset(R.styleable.AlphabetIndexWaveSideBarView_textSize, (int) TypedValue.applyDimension(2, 10.0f, getResources().getDisplayMetrics()));
                this.p = typedArray.getDimensionPixelOffset(R.styleable.AlphabetIndexWaveSideBarView_selectTextSize, (int) TypedValue.applyDimension(2, 10.0f, getResources().getDisplayMetrics()));
                this.h = typedArray.getDimensionPixelOffset(R.styleable.AlphabetIndexWaveSideBarView_hintTextSize, (int) TypedValue.applyDimension(2, 16.0f, getResources().getDisplayMetrics()));
                return;
            }
        }
        this.x = typedArray.getDimensionPixelOffset(R.styleable.AlphabetIndexWaveSideBarView_textSize, (int) TypedValue.applyDimension(1, 10.0f, getResources().getDisplayMetrics()));
        this.p = typedArray.getDimensionPixelOffset(R.styleable.AlphabetIndexWaveSideBarView_selectTextSize, (int) TypedValue.applyDimension(1, 10.0f, getResources().getDisplayMetrics()));
        this.h = typedArray.getDimensionPixelOffset(R.styleable.AlphabetIndexWaveSideBarView_hintTextSize, (int) TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
    }

    private void c() {
        this.g = Arrays.asList(getContext().getResources().getStringArray(R.array.slide_bar_value_list));
        this.r = new TextPaint();
        Paint paint = new Paint();
        this.n = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.v = paint2;
        paint2.setAntiAlias(true);
        this.u = new Path();
        this.s = -1;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.t == null) {
            this.t = new RectF();
        }
        float measuredWidth = (getMeasuredWidth() - this.e) - this.f25001b;
        int measuredWidth2 = getMeasuredWidth();
        int i3 = this.f25001b;
        float measuredHeight = getMeasuredHeight() - this.f25001b;
        this.t.set(measuredWidth, i3, measuredWidth2 - i3, measuredHeight);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c(canvas);
        a(canvas);
        d(canvas);
        e(canvas);
    }

    private void c(Canvas canvas) {
        this.n.setStyle(Paint.Style.FILL);
        if (qrs.x(this.f25000a)) {
            this.n.setColor(this.f25000a.getResources().getColor(R.color.colorBackground));
        } else {
            this.n.setColor(-1);
        }
        canvas.drawRect(this.t, this.n);
        float size = this.g.size() > 0 ? ((this.t.bottom - this.t.top) - (this.f25002c * 2)) / this.g.size() : 0.0f;
        for (int i = 0; i < this.g.size(); i++) {
            this.r.setTypeface(Typeface.create("Roboto-Regular", 0));
            this.r.setColor(this.q);
            this.r.setTextSize(this.x);
            this.r.setTextAlign(Paint.Align.CENTER);
            canvas.drawText(this.g.get(i), this.t.left + ((this.t.right - this.t.left) / 2.0f), rfy.e(this.t.top + this.f25002c + (i * size) + (size / 2.0f), this.r, this.x), this.r);
        }
    }

    private void a(Canvas canvas) {
        this.u.reset();
        this.u.moveTo(getMeasuredWidth(), this.w - (this.z * 3));
        int measuredWidth = getMeasuredWidth();
        int i = this.w - (this.z * 2);
        float measuredWidth2 = (int) (((double) getMeasuredWidth()) - ((((double) this.z) * Math.cos(0.7853981633974483d)) * ((double) this.d)));
        this.u.quadTo(measuredWidth, i, measuredWidth2, (int) (((double) i) + (((double) this.z) * Math.sin(0.7853981633974483d))));
        float measuredWidth3 = getMeasuredWidth();
        int i2 = this.z;
        int i3 = (int) (measuredWidth3 - ((i2 * 1.8f) * this.d));
        int i4 = this.w;
        this.u.quadTo(i3, i4, measuredWidth2, (int) (((double) ((i2 * 2) + i4)) - (((double) i2) * Math.cos(0.7853981633974483d))));
        this.u.quadTo(getMeasuredWidth(), this.w + (this.z * 2), getMeasuredWidth(), this.w + (this.z * 3));
        this.u.close();
        this.v.setStyle(Paint.Style.FILL);
        this.v.setColor(this.y);
        canvas.drawPath(this.u, this.v);
    }

    private void e(Canvas canvas) {
        if (this.s != -1) {
            this.r.setColor(getResources().getColor(R.color.self_discovery_text_orange));
            this.r.setTextSize(this.p);
            this.r.setTextAlign(Paint.Align.CENTER);
            float size = this.g.size() > 0 ? ((this.t.bottom - this.t.top) - (this.f25002c * 2)) / this.g.size() : 0.0f;
            canvas.drawText(this.g.get(this.s), this.t.left + ((this.t.right - this.t.left) / 2.0f), rfy.e(this.t.top + this.f25002c + (this.s * size) + (size / 2.0f), this.r, this.x), this.r);
        }
    }

    private void d(Canvas canvas) {
        int measuredWidth = getMeasuredWidth();
        int i = this.f;
        float f = (measuredWidth + i) - (((this.z * 2.0f) + (i * 2.0f)) * this.d);
        this.v.setStyle(Paint.Style.FILL);
        this.v.setColor(this.j);
        canvas.drawCircle(f, this.w, this.f, this.v);
        if (this.s != -1) {
            this.r.setColor(this.i);
            this.r.setTextSize(this.h);
            this.r.setTextAlign(Paint.Align.CENTER);
            canvas.drawText(this.g.get(this.s), f, rfy.e(this.w, this.r, this.h), this.r);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        int i3;
        OnLetterChangeListener onLetterChangeListener;
        float y = motionEvent.getY();
        float x = motionEvent.getX();
        this.k = this.s;
        this.l = (int) ((y / (this.t.bottom - this.t.top)) * this.g.size());
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                i = this.k;
                i2 = this.l;
                if (i != i2 && i2 >= 0 && i2 < this.g.size()) {
                    i3 = this.l;
                    this.s = i3;
                    onLetterChangeListener = this.o;
                    if (onLetterChangeListener != null) {
                        onLetterChangeListener.onLetterChange(this.g.get(i3));
                    }
                }
                e(0.0f);
            } else if (action == 2) {
                this.w = (int) y;
                int i4 = this.k;
                int i5 = this.l;
                if (i4 != i5 && i5 >= 0 && i5 < this.g.size()) {
                    int i6 = this.l;
                    this.s = i6;
                    OnLetterChangeListener onLetterChangeListener2 = this.o;
                    if (onLetterChangeListener2 != null) {
                        onLetterChangeListener2.onLetterChange(this.g.get(i6));
                    }
                }
                invalidate();
            } else if (action == 3) {
                i = this.k;
                i2 = this.l;
                if (i != i2) {
                    i3 = this.l;
                    this.s = i3;
                    onLetterChangeListener = this.o;
                    if (onLetterChangeListener != null) {
                        onLetterChangeListener.onLetterChange(this.g.get(i3));
                    }
                }
                e(0.0f);
            }
        } else {
            if (x < this.t.left - this.f25001b || y < this.t.top || y > this.t.bottom) {
                return false;
            }
            this.w = (int) y;
            e(1.0f);
        }
        return true;
    }

    private void e(float f) {
        if (this.m == null) {
            this.m = new ValueAnimator();
        }
        this.m.cancel();
        this.m.setFloatValues(f);
        this.m.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.huawei.ui.device.views.music.AlphabetIndexWaveSideBarView.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                AlphabetIndexWaveSideBarView.this.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (AlphabetIndexWaveSideBarView.this.d == 1.0f && AlphabetIndexWaveSideBarView.this.k != AlphabetIndexWaveSideBarView.this.l && AlphabetIndexWaveSideBarView.this.l >= 0 && AlphabetIndexWaveSideBarView.this.l < AlphabetIndexWaveSideBarView.this.g.size()) {
                    AlphabetIndexWaveSideBarView alphabetIndexWaveSideBarView = AlphabetIndexWaveSideBarView.this;
                    alphabetIndexWaveSideBarView.s = alphabetIndexWaveSideBarView.l;
                    if (AlphabetIndexWaveSideBarView.this.o != null) {
                        AlphabetIndexWaveSideBarView.this.o.onLetterChange((String) AlphabetIndexWaveSideBarView.this.g.get(AlphabetIndexWaveSideBarView.this.l));
                    }
                }
                AlphabetIndexWaveSideBarView.this.invalidate();
            }
        });
        this.m.start();
    }

    public void setOnLetterChangeListener(OnLetterChangeListener onLetterChangeListener) {
        this.o = onLetterChangeListener;
    }
}
