package com.zhouyou.recyclerview.progressindicator;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.zhouyou.recyclerview.progressindicator.indicator.BallBeatIndicator;
import com.zhouyou.recyclerview.progressindicator.indicator.BallClipRotateIndicator;
import com.zhouyou.recyclerview.progressindicator.indicator.BallClipRotateMultipleIndicator;
import com.zhouyou.recyclerview.progressindicator.indicator.BallClipRotatePulseIndicator;
import com.zhouyou.recyclerview.progressindicator.indicator.BallGridBeatIndicator;
import com.zhouyou.recyclerview.progressindicator.indicator.BallGridPulseIndicator;
import com.zhouyou.recyclerview.progressindicator.indicator.BallPulseIndicator;
import com.zhouyou.recyclerview.progressindicator.indicator.BallPulseRiseIndicator;
import com.zhouyou.recyclerview.progressindicator.indicator.BallPulseSyncIndicator;
import com.zhouyou.recyclerview.progressindicator.indicator.BallRotateIndicator;
import com.zhouyou.recyclerview.progressindicator.indicator.BallScaleIndicator;
import com.zhouyou.recyclerview.progressindicator.indicator.BallScaleMultipleIndicator;
import com.zhouyou.recyclerview.progressindicator.indicator.BallScaleRippleIndicator;
import com.zhouyou.recyclerview.progressindicator.indicator.BallScaleRippleMultipleIndicator;
import com.zhouyou.recyclerview.progressindicator.indicator.BallSpinFadeLoaderIndicator;
import com.zhouyou.recyclerview.progressindicator.indicator.BallTrianglePathIndicator;
import com.zhouyou.recyclerview.progressindicator.indicator.BallZigZagDeflectIndicator;
import com.zhouyou.recyclerview.progressindicator.indicator.BallZigZagIndicator;
import com.zhouyou.recyclerview.progressindicator.indicator.BaseIndicatorController;
import com.zhouyou.recyclerview.progressindicator.indicator.ClifeIndicator;
import com.zhouyou.recyclerview.progressindicator.indicator.CubeTransitionIndicator;
import com.zhouyou.recyclerview.progressindicator.indicator.LineScaleIndicator;
import com.zhouyou.recyclerview.progressindicator.indicator.LineScalePartyIndicator;
import com.zhouyou.recyclerview.progressindicator.indicator.LineScalePulseOutIndicator;
import com.zhouyou.recyclerview.progressindicator.indicator.LineScalePulseOutRapidIndicator;
import com.zhouyou.recyclerview.progressindicator.indicator.LineSpinFadeLoaderIndicator;
import com.zhouyou.recyclerview.progressindicator.indicator.PacmanIndicator;
import com.zhouyou.recyclerview.progressindicator.indicator.SemiCircleSpinIndicator;
import com.zhouyou.recyclerview.progressindicator.indicator.SquareSpinIndicator;
import com.zhouyou.recyclerview.progressindicator.indicator.TriangleSkewSpinIndicator;
import com.zhouyou.recyclerviewsdk.R;

/* JADX INFO: loaded from: classes22.dex */
public class AVLoadingIndicatorView extends View {
    public static final int BallBeat = 17;
    public static final int BallClipRotate = 2;
    public static final int BallClipRotateMultiple = 5;
    public static final int BallClipRotatePulse = 3;
    public static final int BallGridBeat = 26;
    public static final int BallGridPulse = 1;
    public static final int BallPulse = 0;
    public static final int BallPulseRise = 6;
    public static final int BallPulseSync = 16;
    public static final int BallRotate = 7;
    public static final int BallScale = 12;
    public static final int BallScaleMultiple = 15;
    public static final int BallScaleRipple = 20;
    public static final int BallScaleRippleMultiple = 21;
    public static final int BallSpinFadeLoader = 22;
    public static final int BallTrianglePath = 11;
    public static final int BallZigZag = 9;
    public static final int BallZigZagDeflect = 10;
    public static final int ClifeIndicator = 28;
    public static final int CubeTransition = 8;
    public static final int DEFAULT_SIZE = 30;
    public static final int LineScale = 13;
    public static final int LineScaleParty = 14;
    public static final int LineScalePulseOut = 18;
    public static final int LineScalePulseOutRapid = 19;
    public static final int LineSpinFadeLoader = 23;
    public static final int Pacman = 25;
    public static final int SemiCircleSpin = 27;
    public static final int SquareSpin = 4;
    public static final int TriangleSkewSpin = 24;
    public int a;
    public int b;
    public Paint c;
    public BaseIndicatorController d;
    private boolean e;

    public @interface Indicator {
    }

    public AVLoadingIndicatorView(Context context) {
        super(context);
        e(null, 0);
    }

    private void b() {
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        switch (this.a) {
            case 0:
                this.d = new BallPulseIndicator();
                break;
            case 1:
                this.d = new BallGridPulseIndicator();
                break;
            case 2:
                this.d = new BallClipRotateIndicator();
                break;
            case 3:
                this.d = new BallClipRotatePulseIndicator();
                break;
            case 4:
                this.d = new SquareSpinIndicator();
                break;
            case 5:
                this.d = new BallClipRotateMultipleIndicator();
                break;
            case 6:
                this.d = new BallPulseRiseIndicator();
                break;
            case 7:
                this.d = new BallRotateIndicator();
                break;
            case 8:
                this.d = new CubeTransitionIndicator();
                break;
            case 9:
                this.d = new BallZigZagIndicator();
                break;
            case 10:
                this.d = new BallZigZagDeflectIndicator();
                break;
            case 11:
                this.d = new BallTrianglePathIndicator();
                break;
            case 12:
                this.d = new BallScaleIndicator();
                break;
            case 13:
                this.d = new LineScaleIndicator();
                break;
            case 14:
                this.d = new LineScalePartyIndicator();
                break;
            case 15:
                this.d = new BallScaleMultipleIndicator();
                break;
            case 16:
                this.d = new BallPulseSyncIndicator();
                break;
            case 17:
                this.d = new BallBeatIndicator();
                break;
            case 18:
                this.d = new LineScalePulseOutIndicator();
                break;
            case 19:
                this.d = new LineScalePulseOutRapidIndicator();
                break;
            case 20:
                this.d = new BallScaleRippleIndicator();
                break;
            case 21:
                this.d = new BallScaleRippleMultipleIndicator();
                break;
            case 22:
                this.d = new BallSpinFadeLoaderIndicator();
                break;
            case 23:
                this.d = new LineSpinFadeLoaderIndicator();
                break;
            case 24:
                this.d = new TriangleSkewSpinIndicator();
                break;
            case 25:
                this.d = new PacmanIndicator();
                break;
            case 26:
                this.d = new BallGridBeatIndicator();
                break;
            case 27:
                this.d = new SemiCircleSpinIndicator();
                break;
            case 28:
                setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                this.d = new ClifeIndicator(getContext());
                break;
        }
        this.d.setTarget(this);
    }

    private int c(int i) {
        return ((int) getContext().getResources().getDisplayMetrics().density) * i;
    }

    private void e(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.AVLoadingIndicatorView);
        this.a = typedArrayObtainStyledAttributes.getInt(R.styleable.AVLoadingIndicatorView_indicator, 0);
        this.b = typedArrayObtainStyledAttributes.getColor(R.styleable.AVLoadingIndicatorView_indicator_color, -1);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.c = paint;
        paint.setColor(this.b);
        this.c.setStyle(Paint.Style.FILL);
        this.c.setAntiAlias(true);
        b();
    }

    private int f(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            return size;
        }
        return mode == Integer.MIN_VALUE ? Math.min(i, size) : i;
    }

    public void a() {
        this.d.initAnimation();
    }

    public void d(Canvas canvas) {
        this.d.draw(canvas, this.c);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.setAnimationStatus(BaseIndicatorController.AnimStatus.START);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.setAnimationStatus(BaseIndicatorController.AnimStatus.CANCEL);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.e) {
            return;
        }
        this.e = true;
        a();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(f(c(30), i), f(c(30), i2));
    }

    public void setIndicatorColor(int i) {
        this.b = i;
        this.c.setColor(i);
        invalidate();
    }

    public void setIndicatorId(int i) {
        this.a = i;
        b();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (getVisibility() != i) {
            super.setVisibility(i);
            if (i == 8 || i == 4) {
                this.d.setAnimationStatus(BaseIndicatorController.AnimStatus.END);
            } else {
                this.d.setAnimationStatus(BaseIndicatorController.AnimStatus.START);
            }
        }
    }

    public AVLoadingIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e(attributeSet, 0);
    }

    public AVLoadingIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e(attributeSet, i);
    }

    @TargetApi(21)
    public AVLoadingIndicatorView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        e(attributeSet, i);
    }
}
