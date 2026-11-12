package com.huawei.uikit.animations.drawable;

import android.animation.ObjectAnimator;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import com.huawei.uikit.hwanimations.R;
import defpackage.xdd;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes43.dex */
public class HwHoverAndPressAnimatedDrawable extends GradientDrawable {
    private static final int DURATION_HOVER = 250;
    private static final int DURATION_PRESS = 100;
    private static final int INVALID_SIZE = -1;
    private ObjectAnimator mAlphaEnterAnim;
    private ObjectAnimator mAlphaExitAnim;
    private Interpolator mHoveredInterpolator;
    private boolean mIsHovered;
    private boolean mIsPressed;
    private Interpolator mPressedInterpolator;
    private b mState;

    static class b extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f29222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ColorStateList f29223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f29224c;
        int d;
        int e;
        float[] f;
        int g;
        float h;
        int i;
        int j;

        private static int c(Resources resources, int i) {
            if (resources != null) {
                i = resources.getDisplayMetrics().densityDpi;
            }
            if (i == 0) {
                return 160;
            }
            return i;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new HwHoverAndPressAnimatedDrawable(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new HwHoverAndPressAnimatedDrawable(c(resources, this.f29224c) != this.f29224c ? new b(this, resources) : this);
        }

        private b() {
            this.f29222a = false;
            this.f29224c = 160;
            this.g = 0;
            this.h = 0.0f;
            this.f = null;
            this.i = -1;
            this.j = -1;
        }

        private b(b bVar, Resources resources) {
            this.f29222a = false;
            this.f29224c = 160;
            this.g = 0;
            this.h = 0.0f;
            this.f = null;
            this.i = -1;
            this.j = -1;
            this.g = bVar.g;
            this.h = bVar.h;
            float[] fArr = bVar.f;
            if (fArr != null) {
                this.f = (float[]) fArr.clone();
            }
            this.f29223b = bVar.f29223b;
            this.i = bVar.i;
            this.j = bVar.j;
            this.d = bVar.d;
            this.e = bVar.e;
            this.f29222a = bVar.f29222a;
            this.f29224c = c(resources, bVar.f29224c);
        }
    }

    private void clearEffect() {
        ObjectAnimator objectAnimator = this.mAlphaEnterAnim;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.mAlphaEnterAnim.end();
        }
        ObjectAnimator objectAnimator2 = this.mAlphaExitAnim;
        if (objectAnimator2 != null && objectAnimator2.isRunning()) {
            this.mAlphaExitAnim.end();
        }
        this.mAlphaExitAnim = null;
        this.mAlphaEnterAnim = null;
        this.mIsHovered = false;
        this.mIsPressed = false;
        setAlpha(0);
        invalidateSelf();
    }

    private void preInflate(Resources resources, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, R.styleable.HwHoverAndPressEffect) : theme.obtainStyledAttributes(attributeSet, R.styleable.HwHoverAndPressEffect, 0, 0);
        int color = typedArrayObtainAttributes.getColor(R.styleable.HwHoverAndPressEffect_hwHoveredColor, 0);
        int color2 = typedArrayObtainAttributes.getColor(R.styleable.HwHoverAndPressEffect_hwPressedColor, 0);
        if (color2 != 0) {
            this.mState.f29222a = true;
        }
        int iAlpha = Color.alpha(color);
        int iAlpha2 = Color.alpha(color2);
        this.mState.f29223b = ColorStateList.valueOf(this.mState.f29222a ? Color.rgb(Color.red(color2), Color.green(color2), Color.blue(color2)) : Color.rgb(Color.red(color), Color.green(color), Color.blue(color)));
        b bVar = this.mState;
        bVar.d = iAlpha;
        bVar.e = iAlpha2;
        typedArrayObtainAttributes.recycle();
    }

    private void setHoveredAnimation(boolean z) {
        if (this.mIsHovered != z) {
            this.mIsHovered = z;
            if (!z) {
                startExitAnim(0, 250, this.mHoveredInterpolator);
            } else {
                if (this.mIsPressed) {
                    return;
                }
                startEnterAnim(this.mState.d, 250, this.mHoveredInterpolator);
            }
        }
    }

    private void setPressedAnimation(boolean z) {
        if (this.mIsPressed != z) {
            this.mIsPressed = z;
            if (z) {
                startEnterAnim(this.mState.e, 100, this.mPressedInterpolator);
            } else {
                startExitAnim(this.mIsHovered ? this.mState.d : 0, 100, this.mPressedInterpolator);
            }
        }
    }

    private void startEnterAnim(int i, int i2, Interpolator interpolator) {
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "alpha", i);
        this.mAlphaEnterAnim = objectAnimatorOfInt;
        objectAnimatorOfInt.setAutoCancel(true);
        this.mAlphaEnterAnim.setDuration(i2);
        this.mAlphaEnterAnim.setInterpolator(interpolator);
        this.mAlphaEnterAnim.start();
    }

    private void startExitAnim(int i, int i2, Interpolator interpolator) {
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "alpha", i);
        this.mAlphaExitAnim = objectAnimatorOfInt;
        objectAnimatorOfInt.setAutoCancel(true);
        this.mAlphaExitAnim.setDuration(i2);
        this.mAlphaExitAnim.setInterpolator(interpolator);
        this.mAlphaExitAnim.start();
    }

    private void updateLocalStates() {
        this.mState.h = getCornerRadius();
        this.mState.g = getShape();
        this.mState.i = getIntrinsicWidth();
        this.mState.j = getIntrinsicHeight();
        try {
            this.mState.f = getCornerRadii();
        } catch (NullPointerException unused) {
            this.mState.f = null;
        }
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getColor() != null && this.mState.f29223b != null && getColor().getDefaultColor() != this.mState.f29223b.getDefaultColor()) {
            setColor(this.mState.f29223b);
        }
        super.draw(canvas);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.mState;
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        preInflate(resources, attributeSet, theme);
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        setColor(this.mState.f29223b);
        updateLocalStates();
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (super.mutate() == this) {
            b bVar = new b(this.mState, null);
            this.mState = bVar;
            bVar.f29223b = getColor();
            updateLocalStates();
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0023  */
    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842919) {
                z3 = true;
            } else if (i == 16843623) {
                z2 = true;
            } else if (i == 16842908) {
                z = true;
            }
        }
        if (!z) {
            clearEffect();
            return true;
        }
        setHoveredAnimation(z2);
        if (this.mState.f29222a) {
            setPressedAnimation(z3);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (!z) {
            clearEffect();
        }
        return visible;
    }

    public HwHoverAndPressAnimatedDrawable() {
        this(new b());
    }

    private HwHoverAndPressAnimatedDrawable(b bVar) {
        this.mHoveredInterpolator = xdd.b();
        this.mPressedInterpolator = xdd.d();
        this.mIsHovered = false;
        this.mIsPressed = false;
        this.mState = bVar;
        setShape(bVar.g);
        setSize(bVar.i, bVar.j);
        setBounds(new Rect(0, 0, bVar.i, bVar.j));
        setColor(bVar.f29223b);
        float[] fArr = bVar.f;
        if (this.mState.f == null) {
            setCornerRadius(bVar.h);
        } else {
            setCornerRadii(fArr);
        }
        setAlpha(0);
    }
}
