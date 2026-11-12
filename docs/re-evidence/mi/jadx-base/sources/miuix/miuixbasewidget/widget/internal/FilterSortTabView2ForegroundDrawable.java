package miuix.miuixbasewidget.widget.internal;

import android.R;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.View;
import defpackage.ebk;
import defpackage.j5j;
import defpackage.pu6;
import java.io.IOException;
import miuix.animation.Folme;
import miuix.animation.IStateStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.utils.EaseManager;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class FilterSortTabView2ForegroundDrawable extends Drawable {
    private static final AnimConfig ACTIVATE_ENTER_CONFIG;
    private static final AnimConfig ACTIVATE_EXIT_CONFIG;
    private static final String ALPHA_F = "alphaF";
    private static final AnimConfig HOVER_ENTER_CONFIG;
    private static final AnimConfig HOVER_EXIT_CONFIG;
    private static final AnimConfig PRESS_ENTER_CONFIG;
    private static final AnimConfig PRESS_EXIT_CONFIG;
    private static final String TAG = "StateTransitionDrawable";
    private static final boolean USE_FOLME;
    private static final boolean USE_SMOOTH_ROUND_RECT;
    private static Boolean mIsCommonLiteStrategy;
    private boolean mActivated;
    private float mActivatedAlpha;
    private AnimState mActivatedState;
    private boolean mHovered;
    private float mHoveredActivatedAlpha;
    private AnimState mHoveredActivatedState;
    private float mHoveredAlpha;
    private AnimState mHoveredState;
    private float mNormalAlpha;
    private AnimState mNormalState;
    private boolean mPressed;
    private float mPressedAlpha;
    private AnimState mPressedState;
    private int mRadius;
    private IStateStyle mStyle;
    private static final int[] STATE_PRESSED = {R.attr.state_pressed};
    private static final int[] STATE_DRAG_HOVERED = {R.attr.state_drag_hovered};
    private static final int[] STATE_HOVERED_ACTIVATED = {R.attr.state_hovered, R.attr.state_activated};
    private static final int[] STATE_HOVERED = {R.attr.state_hovered};
    private static final int[] STATE_ACTIVATED = {R.attr.state_activated};
    private final RectF mRect = new RectF();
    private final Path mPath = new Path();
    private final Paint mPaint = new Paint();

    static {
        boolean z = !isCommonLiteStrategy();
        USE_FOLME = z;
        USE_SMOOTH_ROUND_RECT = !isCommonLiteStrategy();
        if (!z) {
            HOVER_ENTER_CONFIG = null;
            HOVER_EXIT_CONFIG = null;
            PRESS_ENTER_CONFIG = null;
            PRESS_EXIT_CONFIG = null;
            ACTIVATE_ENTER_CONFIG = null;
            ACTIVATE_EXIT_CONFIG = null;
            return;
        }
        HOVER_ENTER_CONFIG = new AnimConfig().setEase(EaseManager.getStyle(-2, 0.99f, 0.6f));
        HOVER_EXIT_CONFIG = new AnimConfig().setEase(EaseManager.getStyle(-2, 0.9f, 0.2f));
        AnimConfig ease = new AnimConfig().setEase(EaseManager.getStyle(-2, 0.99f, 0.25f));
        PRESS_ENTER_CONFIG = ease;
        AnimConfig ease2 = new AnimConfig().setEase(EaseManager.getStyle(-2, 0.99f, 0.35f));
        PRESS_EXIT_CONFIG = ease2;
        ACTIVATE_ENTER_CONFIG = ease;
        ACTIVATE_EXIT_CONFIG = ease2;
    }

    public FilterSortTabView2ForegroundDrawable() {
    }

    private void calculatePath() {
        this.mPath.reset();
        Path path = this.mPath;
        RectF rectF = this.mRect;
        int i = this.mRadius;
        path.addRoundRect(rectF, i, i, Path.Direction.CW);
    }

    private void init(Resources resources, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, j5j.w1, 0, 0) : resources.obtainAttributes(attributeSet, j5j.w1);
        int color = typedArrayObtainStyledAttributes.getColor(j5j.C1, -16777216);
        this.mRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(j5j.D1, 0);
        this.mNormalAlpha = typedArrayObtainStyledAttributes.getFloat(j5j.A1, 0.0f);
        this.mPressedAlpha = typedArrayObtainStyledAttributes.getFloat(j5j.B1, 0.0f);
        this.mHoveredAlpha = typedArrayObtainStyledAttributes.getFloat(j5j.z1, 0.0f);
        this.mActivatedAlpha = typedArrayObtainStyledAttributes.getFloat(j5j.x1, 0.0f);
        this.mHoveredActivatedAlpha = typedArrayObtainStyledAttributes.getFloat(j5j.y1, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        this.mPaint.setColor(color);
        if (USE_FOLME) {
            this.mNormalState = new AnimState().add(ALPHA_F, this.mNormalAlpha);
            this.mPressedState = new AnimState().add(ALPHA_F, this.mPressedAlpha);
            this.mHoveredState = new AnimState().add(ALPHA_F, this.mHoveredAlpha);
            this.mActivatedState = new AnimState().add(ALPHA_F, this.mActivatedAlpha);
            this.mHoveredActivatedState = new AnimState().add(ALPHA_F, this.mHoveredActivatedAlpha);
            IStateStyle iStateStyleUseValue = Folme.useValue(this);
            this.mStyle = iStateStyleUseValue;
            iStateStyleUseValue.setTo(this.mNormalState);
        } else {
            setAlphaF(this.mNormalAlpha);
        }
        if (USE_SMOOTH_ROUND_RECT) {
            setSmoothCornerEnable(true);
        }
    }

    private static boolean isCommonLiteStrategy() {
        if (mIsCommonLiteStrategy == null) {
            mIsCommonLiteStrategy = Boolean.valueOf(pu6.E() || pu6.C() || pu6.F());
        }
        return mIsCommonLiteStrategy.booleanValue();
    }

    @SuppressLint({"LongLogTag"})
    private void setSmoothCornerEnable(boolean z) {
        try {
            ebk.m(Drawable.class, this, "setSmoothCornerEnabled", new Class[]{Boolean.TYPE}, Boolean.valueOf(z));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("setSmoothCornerEnabled failed:");
            sb.append(e.getMessage());
        }
    }

    private boolean toActivatedState() {
        if (this.mPressed) {
            this.mPressed = false;
            this.mHovered = false;
            this.mActivated = true;
            if (USE_FOLME) {
                this.mStyle.to(this.mActivatedState, PRESS_EXIT_CONFIG);
            } else {
                setAlphaF(this.mActivatedAlpha);
            }
            return true;
        }
        if (this.mHovered) {
            this.mHovered = false;
            this.mActivated = true;
            if (USE_FOLME) {
                this.mStyle.to(this.mActivatedState, HOVER_EXIT_CONFIG);
            } else {
                setAlphaF(this.mActivatedAlpha);
            }
            return true;
        }
        if (this.mActivated) {
            return false;
        }
        this.mActivated = true;
        if (USE_FOLME) {
            this.mStyle.to(this.mActivatedState, ACTIVATE_ENTER_CONFIG);
        } else {
            setAlphaF(this.mActivatedAlpha);
        }
        return true;
    }

    private boolean toHoveredActivatedState() {
        if (this.mPressed) {
            this.mPressed = false;
            this.mHovered = true;
            this.mActivated = true;
            if (USE_FOLME) {
                this.mStyle.to(this.mHoveredActivatedState, PRESS_EXIT_CONFIG);
            } else {
                setAlphaF(this.mHoveredActivatedAlpha);
            }
            return true;
        }
        boolean z = this.mHovered;
        if (z && this.mActivated) {
            return false;
        }
        if (z) {
            this.mActivated = true;
            if (USE_FOLME) {
                this.mStyle.to(this.mHoveredActivatedState, ACTIVATE_ENTER_CONFIG);
            } else {
                setAlphaF(this.mHoveredActivatedAlpha);
            }
            return true;
        }
        if (this.mActivated) {
            this.mHovered = true;
            if (USE_FOLME) {
                this.mStyle.to(this.mHoveredActivatedState, HOVER_ENTER_CONFIG);
            } else {
                setAlphaF(this.mHoveredActivatedAlpha);
            }
            return true;
        }
        this.mActivated = true;
        this.mHovered = true;
        if (USE_FOLME) {
            this.mStyle.to(this.mHoveredActivatedState, HOVER_ENTER_CONFIG);
        } else {
            setAlphaF(this.mHoveredActivatedAlpha);
        }
        return true;
    }

    private boolean toHoveredState() {
        if (this.mPressed) {
            this.mPressed = false;
            this.mHovered = true;
            this.mActivated = false;
            if (USE_FOLME) {
                this.mStyle.to(this.mHoveredState, PRESS_EXIT_CONFIG);
            } else {
                setAlphaF(this.mHoveredAlpha);
            }
            return true;
        }
        if (this.mHovered) {
            if (!this.mActivated) {
                return false;
            }
            if (USE_FOLME) {
                this.mStyle.to(this.mHoveredState, HOVER_EXIT_CONFIG);
            } else {
                setAlphaF(this.mHoveredAlpha);
            }
            return true;
        }
        this.mHovered = true;
        this.mActivated = false;
        if (USE_FOLME) {
            this.mStyle.to(this.mHoveredState, HOVER_ENTER_CONFIG);
        } else {
            setAlphaF(this.mHoveredAlpha);
        }
        return true;
    }

    private boolean toNormalState() {
        if (this.mPressed) {
            this.mPressed = false;
            this.mHovered = false;
            this.mActivated = false;
            if (USE_FOLME) {
                this.mStyle.to(this.mNormalState, PRESS_EXIT_CONFIG);
            } else {
                setAlphaF(this.mNormalAlpha);
            }
            return true;
        }
        if (this.mHovered) {
            this.mHovered = false;
            this.mActivated = false;
            if (USE_FOLME) {
                this.mStyle.to(this.mNormalState, HOVER_EXIT_CONFIG);
            } else {
                setAlphaF(this.mNormalAlpha);
            }
            return true;
        }
        if (!this.mActivated) {
            return false;
        }
        this.mActivated = false;
        if (USE_FOLME) {
            this.mStyle.to(this.mNormalState, ACTIVATE_EXIT_CONFIG);
        } else {
            setAlphaF(this.mNormalAlpha);
        }
        return true;
    }

    private boolean toPressedState() {
        if (this.mPressed) {
            return false;
        }
        if (USE_FOLME) {
            this.mStyle.to(this.mPressedState, PRESS_ENTER_CONFIG);
        } else {
            setAlphaF(this.mPressedAlpha);
        }
        this.mPressed = true;
        this.mHovered = false;
        this.mActivated = false;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (USE_SMOOTH_ROUND_RECT) {
            canvas.drawPath(this.mPath, this.mPaint);
            return;
        }
        RectF rectF = this.mRect;
        int i = this.mRadius;
        canvas.drawRoundRect(rectF, i, i, this.mPaint);
    }

    public float getAlphaF() {
        return this.mPaint.getAlpha() / 255.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        init(resources, attributeSet, theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        if (USE_FOLME) {
            IStateStyle iStateStyle = this.mStyle;
            iStateStyle.setTo(iStateStyle.getCurrentState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.mRect.set(rect);
        calculatePath();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (StateSet.stateSetMatches(STATE_PRESSED, iArr) || StateSet.stateSetMatches(STATE_DRAG_HOVERED, iArr)) {
            return toPressedState();
        }
        if (StateSet.stateSetMatches(STATE_HOVERED_ACTIVATED, iArr)) {
            return toHoveredActivatedState();
        }
        if (StateSet.stateSetMatches(STATE_HOVERED, iArr)) {
            return toHoveredState();
        }
        return StateSet.stateSetMatches(STATE_ACTIVATED, iArr) ? toActivatedState() : toNormalState();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    public void setAlphaF(float f) {
        this.mPaint.setAlpha((int) (f * 255.0f));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setRadius(int i) {
        if (this.mRadius == i) {
            return;
        }
        this.mRadius = i;
        invalidateSelf();
    }

    public FilterSortTabView2ForegroundDrawable(View view) {
        init(view.getResources(), null, null);
    }
}
