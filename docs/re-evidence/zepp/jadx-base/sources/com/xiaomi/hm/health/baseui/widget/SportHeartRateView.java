package com.xiaomi.hm.health.baseui.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Region;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import com.huami.lib.view.ViewUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes19.dex */
public class SportHeartRateView extends View {
    private static final int q = 5;
    private static final int r = 2;
    private static final String s = "SportHeartRateView";
    private Builder a;
    private final Context b;
    private float c;
    private float d;
    private TextPaint e;
    private TextPaint f;
    private Paint g;
    private Paint h;
    private Paint i;
    private float j;
    private int k;
    private boolean l;
    private float m;
    private float n;
    private float o;
    private boolean p;

    public static class Builder {
        private SportHeartRateView a;
        private Bitmap c;
        private Bitmap d;
        private Bitmap e;
        private boolean b = false;
        private int f = 6;
        private float g = 40.0f;
        private float h = 26.7f;
        private float i = 10.0f;
        private float j = 5.0f;
        private int k = Color.parseColor("#777777");
        private int l = Color.parseColor("#999999");
        private int m = Color.parseColor("#ED4F4F");
        private int n = Color.parseColor("#FF4081");
        private int o = Color.parseColor("#30ED4F4F");
        private float p = 14.0f;
        private float q = 13.0f;
        private float r = 5.3f;
        private float s = 10.0f;
        private float t = 6.3f;
        private String[] u = {"热身放松", "脂肪燃烧", "心肺强化", "耐力强化", "无氧极限"};
        private int[] v = {100, 120, 140, 160, 180, 200};
        private a w = a.TYPE_AUTO;

        public enum a {
            TYPE_AUTO,
            TYPE_VERTICAL,
            TYPE_LADDER_SHAPED
        }

        public Builder(SportHeartRateView sportHeartRateView) {
            this.a = sportHeartRateView;
            this.c = BitmapFactory.decodeResource(sportHeartRateView.getResources(), R.drawable.icon_heart);
            this.d = BitmapFactory.decodeResource(sportHeartRateView.getResources(), R.drawable.icon_heart_red);
            this.e = BitmapFactory.decodeResource(sportHeartRateView.getResources(), R.drawable.icon_heart_gray);
        }

        public Builder areaColor(@ColorInt int areaColor) {
            this.o = areaColor;
            return this;
        }

        public Builder bezierLineColor(@ColorInt int bezierLineColor) {
            this.m = bezierLineColor;
            return this;
        }

        public SportHeartRateView build() {
            return this.a;
        }

        public Builder drawablePadding(float drawablePadding) {
            this.r = drawablePadding;
            return this;
        }

        public Builder heartBmp(@DrawableRes int resId) {
            this.c = BitmapFactory.decodeResource(this.a.getResources(), resId);
            return this;
        }

        public Builder lableTextSize(float lableTextSize) {
            this.p = lableTextSize;
            return this;
        }

        public Builder lables(String[] lables) {
            this.u = lables;
            return this;
        }

        public Builder scaleTextSize(float xScaleTextSize) {
            this.q = xScaleTextSize;
            return this;
        }

        public Builder scaleValue(int[] scaleValue) {
            this.v = scaleValue;
            return this;
        }

        public Builder textLableColor(@ColorInt int textLableColor) {
            this.k = textLableColor;
            return this;
        }

        public Builder textXScaleColor(@ColorInt int textXScaleColor) {
            this.l = textXScaleColor;
            return this;
        }

        public Builder xScaleLineColor(@ColorInt int xScaleLineColor) {
            this.n = xScaleLineColor;
            return this;
        }
    }

    public class a implements Runnable {
        public final /* synthetic */ int a;

        public a(final int val$heartRateValue) {
            this.a = val$heartRateValue;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = SportHeartRateView.this.a.v[SportHeartRateView.this.a.v.length - 1];
            int i2 = SportHeartRateView.this.a.v[0];
            if (SportHeartRateView.this.c <= 0.0f || i2 <= 0) {
                HMLog.e(SportHeartRateView.s, "数据错误，最小心率必须大于0", new Object[0]);
                return;
            }
            SportHeartRateView.this.j = ((this.a - i2) * ((SportHeartRateView.this.c - SportHeartRateView.this.getPaddingLeft()) - SportHeartRateView.this.getPaddingRight())) / (i - i2);
            SportHeartRateView sportHeartRateView = SportHeartRateView.this;
            sportHeartRateView.k = sportHeartRateView.g(this.a);
            SportHeartRateView.this.invalidate();
        }
    }

    public SportHeartRateView(Context context) {
        this(context, null);
    }

    private float[] f(float xValue, PathMeasure pathMeasure, float xScaleLength) {
        float[] fArr = {0.0f, 0.0f};
        if (pathMeasure != null) {
            pathMeasure.getPosTan((pathMeasure.getLength() * xValue) / xScaleLength, fArr, null);
        }
        return fArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int g(int heartRate) {
        for (int length = this.a.v.length - 2; length >= 0; length--) {
            if (heartRate > this.a.v[length]) {
                return length;
            }
        }
        return 0;
    }

    private int getMaxHeight() {
        float fDp2px;
        float fDp2px2;
        int length;
        int paddingTop = (int) (((int) (getPaddingTop() + 7 + getPaddingBottom() + ViewUtils.sp2px(this.b, this.a.q))) + ViewUtils.dp2px(this.b, this.a.g));
        boolean z = false;
        if (this.a.u != null && this.a.u.length > 0) {
            float paddingLeft = (this.c - getPaddingLeft()) - getPaddingRight();
            this.m = paddingLeft;
            float length2 = paddingLeft / (this.a.u == null ? 1 : this.a.u.length);
            for (int i = 0; i < this.a.u.length; i++) {
                if (this.e.measureText(this.a.u[(this.a.u.length - i) - 1]) >= length2) {
                    z = true;
                    break;
                }
            }
        }
        if (z || this.a.w == Builder.a.TYPE_VERTICAL) {
            fDp2px = (int) (((int) (paddingTop + ViewUtils.dp2px(this.b, this.a.h))) + (ViewUtils.sp2px(this.b, this.a.p) * (this.a.u.length - 1)));
            fDp2px2 = ViewUtils.dp2px(this.b, this.a.s);
            length = this.a.u.length;
        } else {
            fDp2px = (int) (((int) (paddingTop + ViewUtils.dp2px(this.b, this.a.i))) + ViewUtils.sp2px(this.b, this.a.p));
            fDp2px2 = ViewUtils.dp2px(this.b, this.a.t);
            length = this.a.u.length;
        }
        return (int) (fDp2px + (fDp2px2 * length));
    }

    private void h() {
        TextPaint textPaint = new TextPaint();
        this.e = textPaint;
        textPaint.setAntiAlias(true);
        this.e.setColor(this.a.k);
        this.e.setTextSize(ViewUtils.sp2px(this.b, this.a.p));
        TextPaint textPaint2 = new TextPaint();
        this.f = textPaint2;
        textPaint2.setAntiAlias(true);
        this.f.setColor(this.a.l);
        this.f.setTextSize(ViewUtils.sp2px(this.b, this.a.q));
        Paint paint = new Paint();
        this.g = paint;
        paint.setAntiAlias(true);
        this.g.setColor(this.a.m);
        this.g.setStrokeWidth(5.0f);
        this.g.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setAntiAlias(true);
        this.h.setStrokeWidth(2.0f);
        this.h.setColor(this.a.n);
        Paint paint3 = new Paint();
        this.i = paint3;
        paint3.setAntiAlias(true);
        this.i.setColor(this.a.o);
        this.i.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        boolean z;
        super.onDraw(canvas);
        float paddingLeft = (this.c - getPaddingLeft()) - getPaddingRight();
        float length = paddingLeft / (this.a.u == null ? 1 : this.a.u.length);
        int paddingLeft2 = getPaddingLeft();
        int textSize = (int) ((this.d - this.f.getTextSize()) - getPaddingBottom());
        float paddingRight = this.c - getPaddingRight();
        Path path = new Path();
        float fDp2px = ViewUtils.dp2px(this.b, this.a.j);
        float f = textSize;
        float fDp2px2 = f - ViewUtils.dp2px(this.b, this.a.g);
        float f2 = paddingLeft2;
        path.moveTo(f2, fDp2px2);
        for (int i = 0; i < this.a.f; i++) {
            float f3 = paddingLeft / this.a.f;
            if (i % 2 == 0) {
                path.rQuadTo(f3 / 2.0f, fDp2px, f3, -fDp2px);
            } else {
                float f4 = -fDp2px;
                path.rQuadTo(f3 / 2.0f, f4 * 2.0f, f3, f4);
            }
        }
        canvas.drawPath(path, this.g);
        PathMeasure pathMeasure = new PathMeasure(path, false);
        Path path2 = new Path();
        path2.set(path);
        path2.lineTo(paddingRight, f);
        path2.lineTo(f2, f);
        path2.lineTo(f2, fDp2px2);
        path2.close();
        canvas.drawPath(path2, this.i);
        canvas.drawLine(f2, f, paddingRight, f, this.h);
        this.h.setStyle(Paint.Style.STROKE);
        float fDp2px3 = ViewUtils.dp2px(this.b, 5.0f);
        this.h.setPathEffect(new DashPathEffect(new float[]{fDp2px3, fDp2px3, fDp2px3, fDp2px3}, 1.0f));
        if (this.a.v.length > 0) {
            for (int i2 = 1; i2 < this.a.v.length - 1; i2++) {
                Path path3 = new Path();
                float f5 = (i2 * length) + f2;
                path3.moveTo(f5, f);
                path3.lineTo(f5, f - this.d);
                canvas.save();
                canvas.clipPath(path2, Region.Op.INTERSECT);
                canvas.drawPath(path3, this.h);
                canvas.restore();
            }
            for (int i3 = 1; i3 < this.a.v.length - 1; i3++) {
                String strValueOf = String.valueOf(this.a.v[i3]);
                canvas.drawText(strValueOf, 0, strValueOf.length(), ((i3 * length) + f2) - (this.f.measureText(strValueOf) / 2.0f), f + this.f.getTextSize(), (Paint) this.f);
            }
        }
        if (this.a.w != Builder.a.TYPE_AUTO || this.a.u == null || this.a.u.length <= 0) {
            z = false;
            break;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= this.a.u.length) {
                z = false;
                break;
            } else {
                if (this.e.measureText(this.a.u[(this.a.u.length - i4) - 1]) >= length) {
                    z = true;
                    break;
                }
                i4++;
            }
        }
        if (!z && this.a.w != Builder.a.TYPE_VERTICAL) {
            for (int i5 = 0; i5 < this.a.u.length; i5++) {
                String str = this.a.u[i5];
                float f6 = i5;
                canvas.drawText(str, 0, str.length(), (((0.5f + f6) * length) + f2) - (this.e.measureText(str) / 2.0f), ((fDp2px2 - ViewUtils.dp2px(getContext(), this.a.i)) - this.e.getTextSize()) - (ViewUtils.dp2px(getContext(), this.a.t) * f6), (Paint) this.e);
            }
        } else if (this.a.u != null && this.a.u.length > 0) {
            for (int i6 = 0; i6 < this.a.u.length; i6++) {
                String str2 = this.a.u[(this.a.u.length - i6) - 1];
                float fDp2px4 = fDp2px2 - ViewUtils.dp2px(getContext(), this.a.h);
                float f7 = i6;
                float fDp2px5 = ViewUtils.dp2px(getContext(), this.a.s) * f7;
                canvas.drawBitmap((this.a.u.length - i6) - 1 == this.k ? this.a.d : this.a.e, f2, ((fDp2px4 - (this.e.getTextSize() * f7)) - this.a.e.getHeight()) - fDp2px5, this.e);
                canvas.drawText(str2, 0, str2.length(), this.a.e.getWidth() + paddingLeft2 + this.a.r, (fDp2px4 - (this.e.getTextSize() * f7)) - fDp2px5, (Paint) this.e);
            }
        }
        float[] fArrF = f(this.j, pathMeasure, paddingLeft);
        canvas.drawBitmap(this.a.c, fArrF[0] - (this.a.c.getWidth() / 2), fArrF[1] - (this.a.c.getHeight() / 2), this.g);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(heightMeasureSpec);
        if (this.l || mode == Integer.MIN_VALUE) {
            super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(getMaxHeight(), 1073741824));
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
        this.d = getMeasuredHeight();
        this.c = getMeasuredWidth();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(final MotionEvent event) {
        if (!this.a.b) {
            return super.onTouchEvent(event);
        }
        int action = event.getAction();
        if (action == 0) {
            this.n = event.getX();
            this.o = event.getY();
            this.p = false;
        } else if (action == 1 || action == 2) {
            if (!this.p && Math.abs(event.getX() - this.n) <= Math.abs(event.getY() - this.o)) {
                return super.onTouchEvent(event);
            }
            if (!this.p) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            this.j = event.getX() - getPaddingLeft();
            if (this.a.u.length > 0) {
                int length = (int) ((this.j / this.m) * this.a.u.length);
                this.k = length;
                if (length >= this.a.u.length) {
                    this.k = this.a.u.length - 1;
                }
            }
            invalidate();
            this.p = true;
        }
        return true;
    }

    public void setBuilder(Builder builder) {
        this.a = builder;
        h();
        invalidate();
    }

    public void setHeartRateValue(final int heartRateValue) {
        post(new a(heartRateValue));
    }

    public SportHeartRateView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.a = new Builder(this);
        this.c = 0.0f;
        this.d = 0.0f;
        this.j = 0.0f;
        this.b = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, com.xiaomi.hm.health.R.styleable.SportHeartRateView);
        this.l = typedArrayObtainStyledAttributes.getBoolean(0, false);
        h();
        typedArrayObtainStyledAttributes.recycle();
    }
}
