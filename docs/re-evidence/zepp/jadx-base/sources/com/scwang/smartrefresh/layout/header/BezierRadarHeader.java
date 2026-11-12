package com.scwang.smartrefresh.layout.header;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.scwang.smartrefresh.layout.R;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.api.RefreshKernel;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.header.bezierradar.RippleView;
import com.scwang.smartrefresh.layout.header.bezierradar.RoundDotView;
import com.scwang.smartrefresh.layout.header.bezierradar.RoundProgressView;
import com.scwang.smartrefresh.layout.header.bezierradar.WaveView;
import com.scwang.smartrefresh.layout.util.DensityUtil;

/* JADX INFO: loaded from: classes18.dex */
public class BezierRadarHeader extends FrameLayout implements RefreshHeader {
    private WaveView a;
    private RippleView b;
    private RoundDotView c;
    private RoundProgressView d;
    private boolean e;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BezierRadarHeader.this.a.setWaveHeight(((Integer) valueAnimator.getAnimatedValue()).intValue() / 2);
            BezierRadarHeader.this.a.invalidate();
        }
    }

    public class b extends AnimatorListenerAdapter {
        public final /* synthetic */ RefreshLayout a;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                BezierRadarHeader.this.d.startAnim();
            }
        }

        public b(RefreshLayout refreshLayout) {
            this.a = refreshLayout;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            BezierRadarHeader.this.c.setVisibility(4);
            BezierRadarHeader.this.d.animate().scaleX(1.0f);
            BezierRadarHeader.this.d.animate().scaleY(1.0f);
            this.a.getLayout().postDelayed(new a(), 200L);
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BezierRadarHeader.this.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[RefreshState.values().length];
            a = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[RefreshState.PullToUpLoad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[RefreshState.Refreshing.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[RefreshState.Loading.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public BezierRadarHeader(Context context) {
        this(context, null);
    }

    private void d(Context context, AttributeSet attributeSet, int i) {
        setMinimumHeight(DensityUtil.dp2px(100.0f));
        this.a = new WaveView(getContext());
        this.b = new RippleView(getContext());
        this.c = new RoundDotView(getContext());
        this.d = new RoundProgressView(getContext());
        if (isInEditMode()) {
            addView(this.a, -1, -1);
            addView(this.d, -1, -1);
            this.a.setHeadHeight(1000);
        } else {
            addView(this.a, -1, -1);
            addView(this.c, -1, -1);
            addView(this.d, -1, -1);
            addView(this.b, -1, -1);
            this.d.setScaleX(0.0f);
            this.d.setScaleY(0.0f);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BezierRadarHeader);
        this.e = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BezierRadarHeader_srlEnableHorizontalDrag, this.e);
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.BezierRadarHeader_srlPrimaryColor, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(R.styleable.BezierRadarHeader_srlAccentColor, 0);
        if (color != 0) {
            setPrimaryColor(color);
        }
        if (color2 != 0) {
            setAccentColor(color);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public SpinnerStyle getSpinnerStyle() {
        return SpinnerStyle.Scale;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    @NonNull
    public View getView() {
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public boolean isSupportHorizontalDrag() {
        return this.e;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public int onFinish(RefreshLayout refreshLayout, boolean z) {
        this.d.stopAnim();
        this.d.animate().scaleX(0.0f);
        this.d.animate().scaleY(0.0f);
        this.b.setVisibility(0);
        this.b.startReveal();
        return 400;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onHorizontalDrag(float f, int i, int i2) {
        this.a.setWaveOffsetX(i);
        this.a.invalidate();
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onInitialized(RefreshKernel refreshKernel, int i, int i2) {
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshHeader
    public void onPullingDown(float f, int i, int i2, int i3) {
        this.a.setHeadHeight(Math.min(i2, i));
        this.a.setWaveHeight((int) (Math.max(0, i - i2) * 1.9f));
        this.c.setFraction(f);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshHeader
    public void onReleasing(float f, int i, int i2, int i3) {
        onPullingDown(f, i, i2, i3);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onStartAnimator(RefreshLayout refreshLayout, int i, int i2) {
        this.a.setHeadHeight(i);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.a.getWaveHeight(), 0, -((int) (((double) this.a.getWaveHeight()) * 0.8d)), 0, -((int) (this.a.getWaveHeight() * 0.4f)), 0);
        valueAnimatorOfInt.addUpdateListener(new a());
        valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfInt.setDuration(800L);
        valueAnimatorOfInt.start();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.addListener(new b(refreshLayout));
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new c());
        valueAnimatorOfFloat.start();
    }

    @Override // com.scwang.smartrefresh.layout.listener.OnStateChangedListener
    public void onStateChanged(RefreshLayout refreshLayout, RefreshState refreshState, RefreshState refreshState2) {
        int i = d.a[refreshState2.ordinal()];
        if (i == 1) {
            this.b.setVisibility(8);
            this.c.setAlpha(1.0f);
            this.c.setVisibility(0);
        } else {
            if (i != 2) {
                return;
            }
            this.d.setScaleX(0.0f);
            this.d.setScaleY(0.0f);
        }
    }

    public BezierRadarHeader setAccentColor(@ColorInt int i) {
        this.c.setDotColor(i);
        this.b.setFrontColor(i);
        this.d.setFrontColor(i);
        return this;
    }

    public BezierRadarHeader setAccentColorId(@ColorRes int i) {
        setAccentColor(ContextCompat.getColor(getContext(), i));
        return this;
    }

    public BezierRadarHeader setEnableHorizontalDrag(boolean z) {
        this.e = z;
        if (!z) {
            this.a.setWaveOffsetX(-1);
        }
        return this;
    }

    public BezierRadarHeader setPrimaryColor(@ColorInt int i) {
        this.a.setWaveColor(i);
        this.d.setBackColor(i);
        return this;
    }

    public BezierRadarHeader setPrimaryColorId(@ColorRes int i) {
        setPrimaryColor(ContextCompat.getColor(getContext(), i));
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    @Deprecated
    public void setPrimaryColors(@ColorInt int... iArr) {
        if (iArr.length > 0) {
            setPrimaryColor(iArr[0]);
        }
        if (iArr.length > 1) {
            setAccentColor(iArr[1]);
        }
    }

    public BezierRadarHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BezierRadarHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = false;
        d(context, attributeSet, i);
    }
}
