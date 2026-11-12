package com.google.android.material.slider;

import a7.b;
import am.j;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import androidx.core.view.g1;
import androidx.core.view.s0;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewOverlayImpl;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.slider.BaseOnChangeListener;
import com.google.android.material.slider.BaseOnSliderTouchListener;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.android.material.tooltip.TooltipDrawable;
import j20.x;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import l7.f;
import v.e0;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends BaseOnChangeListener<S>, T extends BaseOnSliderTouchListener<S>> extends View {
    private static final int DEFAULT_LABEL_ANIMATION_ENTER_DURATION = 83;
    private static final int DEFAULT_LABEL_ANIMATION_EXIT_DURATION = 117;
    private static final String EXCEPTION_ILLEGAL_DISCRETE_VALUE = "Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)";
    private static final String EXCEPTION_ILLEGAL_MIN_SEPARATION = "minSeparation(%s) must be greater or equal to 0";
    private static final String EXCEPTION_ILLEGAL_MIN_SEPARATION_STEP_SIZE = "minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)";
    private static final String EXCEPTION_ILLEGAL_MIN_SEPARATION_STEP_SIZE_UNIT = "minSeparation(%s) cannot be set as a dimension when using stepSize(%s)";
    private static final String EXCEPTION_ILLEGAL_STEP_SIZE = "The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range";
    private static final String EXCEPTION_ILLEGAL_VALUE = "Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)";
    private static final String EXCEPTION_ILLEGAL_VALUE_FROM = "valueFrom(%s) must be smaller than valueTo(%s)";
    private static final String EXCEPTION_ILLEGAL_VALUE_TO = "valueTo(%s) must be greater than valueFrom(%s)";
    private static final int HALO_ALPHA = 63;
    private static final int MIN_TOUCH_TARGET_DP = 48;
    private static final String TAG = "BaseSlider";
    private static final double THRESHOLD = 1.0E-4d;
    private static final float THUMB_WIDTH_PRESSED_RATIO = 0.5f;
    private static final int TIMEOUT_SEND_ACCESSIBILITY_EVENT = 200;
    static final int UNIT_PX = 0;
    static final int UNIT_VALUE = 1;
    private static final String WARNING_FLOATING_POINT_ERROR = "Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.";
    private BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender;
    private final AccessibilityHelper accessibilityHelper;
    private final AccessibilityManager accessibilityManager;
    private int activeThumbIdx;
    private final Paint activeTicksPaint;
    private final Paint activeTrackPaint;
    private final List<L> changeListeners;
    private final RectF cornerRect;
    private Drawable customThumbDrawable;
    private List<Drawable> customThumbDrawablesForValues;
    private final MaterialShapeDrawable defaultThumbDrawable;
    private int defaultThumbRadius;
    private int defaultThumbTrackGapSize;
    private int defaultThumbWidth;
    private int defaultTickActiveRadius;
    private int defaultTickInactiveRadius;
    private int defaultTrackHeight;
    private boolean dirtyConfig;
    private int focusedThumbIdx;
    private boolean forceDrawCompatHalo;
    private LabelFormatter formatter;
    private ColorStateList haloColor;
    private final Paint haloPaint;
    private int haloRadius;
    private final Paint inactiveTicksPaint;
    private final Paint inactiveTrackPaint;
    private boolean isLongPress;
    private int labelBehavior;
    private int labelPadding;
    private int labelStyle;
    private final List<TooltipDrawable> labels;
    private boolean labelsAreAnimatedIn;
    private ValueAnimator labelsInAnimator;
    private ValueAnimator labelsOutAnimator;
    private MotionEvent lastEvent;
    private int minTickSpacing;
    private int minTouchTargetSize;
    private int minTrackSidePadding;
    private int minWidgetHeight;
    private final ViewTreeObserver.OnScrollChangedListener onScrollChangedListener;
    private final int scaledTouchSlop;
    private int separationUnit;
    private float stepSize;
    private final Paint stopIndicatorPaint;
    private int thumbHeight;
    private boolean thumbIsPressed;
    private final Paint thumbPaint;
    private int thumbTrackGapSize;
    private int thumbWidth;
    private int tickActiveRadius;
    private ColorStateList tickColorActive;
    private ColorStateList tickColorInactive;
    private int tickInactiveRadius;
    private boolean tickVisible;
    private float[] ticksCoordinates;
    private float touchDownX;
    private final List<T> touchListeners;
    private float touchPosition;
    private ColorStateList trackColorActive;
    private ColorStateList trackColorInactive;
    private int trackHeight;
    private int trackInsideCornerSize;
    private final Path trackPath;
    private final RectF trackRect;
    private int trackSidePadding;
    private int trackStopIndicatorSize;
    private int trackWidth;
    private float valueFrom;
    private float valueTo;
    private ArrayList<Float> values;
    private int widgetHeight;
    static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_Slider;
    private static final int LABEL_ANIMATION_ENTER_DURATION_ATTR = R.attr.motionDurationMedium4;
    private static final int LABEL_ANIMATION_EXIT_DURATION_ATTR = R.attr.motionDurationShort3;
    private static final int LABEL_ANIMATION_ENTER_EASING_ATTR = R.attr.motionEasingEmphasizedInterpolator;
    private static final int LABEL_ANIMATION_EXIT_EASING_ATTR = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    /* JADX INFO: renamed from: com.google.android.material.slider.BaseSlider$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection;

        static {
            int[] iArr = new int[FullCornerDirection.values().length];
            $SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection = iArr;
            try {
                iArr[FullCornerDirection.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection[FullCornerDirection.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection[FullCornerDirection.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection[FullCornerDirection.BOTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class AccessibilityEventSender implements Runnable {
        int virtualViewId;

        private AccessibilityEventSender() {
            this.virtualViewId = -1;
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSlider.this.accessibilityHelper.sendEventForVirtualView(this.virtualViewId, 4);
        }

        public void setVirtualViewId(int i14) {
            this.virtualViewId = i14;
        }
    }

    public static class AccessibilityHelper extends androidx.customview.widget.a {
        private final BaseSlider<?, ?, ?> slider;
        final Rect virtualViewBounds;

        public AccessibilityHelper(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.virtualViewBounds = new Rect();
            this.slider = baseSlider;
        }

        private String startOrEndDescription(int i14) {
            if (i14 == this.slider.getValues().size() - 1) {
                return this.slider.getContext().getString(R.string.material_slider_range_end);
            }
            return i14 == 0 ? this.slider.getContext().getString(R.string.material_slider_range_start) : "";
        }

        @Override // androidx.customview.widget.a
        public int getVirtualViewAt(float f14, float f15) {
            for (int i14 = 0; i14 < this.slider.getValues().size(); i14++) {
                this.slider.updateBoundsForVirtualViewId(i14, this.virtualViewBounds);
                if (this.virtualViewBounds.contains((int) f14, (int) f15)) {
                    return i14;
                }
            }
            return -1;
        }

        @Override // androidx.customview.widget.a
        public void getVisibleVirtualViews(List<Integer> list) {
            for (int i14 = 0; i14 < this.slider.getValues().size(); i14++) {
                list.add(Integer.valueOf(i14));
            }
        }

        @Override // androidx.customview.widget.a
        public boolean onPerformActionForVirtualView(int i14, int i15, Bundle bundle) {
            if (!this.slider.isEnabled()) {
                return false;
            }
            if (i15 != 4096 && i15 != 8192) {
                if (i15 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                    if (this.slider.snapThumbToValue(i14, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                        this.slider.updateHaloHotspot();
                        this.slider.postInvalidate();
                        invalidateVirtualView(i14);
                        return true;
                    }
                }
                return false;
            }
            float fCalculateStepIncrement = this.slider.calculateStepIncrement(20);
            if (i15 == 8192) {
                fCalculateStepIncrement = -fCalculateStepIncrement;
            }
            if (this.slider.isRtl()) {
                fCalculateStepIncrement = -fCalculateStepIncrement;
            }
            if (!this.slider.snapThumbToValue(i14, g7.a.a(this.slider.getValues().get(i14).floatValue() + fCalculateStepIncrement, this.slider.getValueFrom(), this.slider.getValueTo()))) {
                return false;
            }
            this.slider.updateHaloHotspot();
            this.slider.postInvalidate();
            invalidateVirtualView(i14);
            return true;
        }

        @Override // androidx.customview.widget.a
        public void onPopulateNodeForVirtualView(int i14, f fVar) {
            fVar.b(f.a.f110580s);
            AccessibilityNodeInfo accessibilityNodeInfo = fVar.f110563a;
            List<Float> values = this.slider.getValues();
            float fFloatValue = values.get(i14).floatValue();
            float valueFrom = this.slider.getValueFrom();
            float valueTo = this.slider.getValueTo();
            if (this.slider.isEnabled()) {
                if (fFloatValue > valueFrom) {
                    fVar.a(8192);
                }
                if (fFloatValue < valueTo) {
                    fVar.a(4096);
                }
            }
            accessibilityNodeInfo.setRangeInfo((AccessibilityNodeInfo.RangeInfo) new f.i(AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, fFloatValue)).f110587a);
            fVar.n(SeekBar.class.getName());
            StringBuilder sb3 = new StringBuilder();
            if (this.slider.getContentDescription() != null) {
                sb3.append(this.slider.getContentDescription());
                sb3.append(",");
            }
            String value = this.slider.formatValue(fFloatValue);
            String string = this.slider.getContext().getString(R.string.material_slider_value);
            if (values.size() > 1) {
                string = startOrEndDescription(i14);
            }
            Locale locale = Locale.US;
            sb3.append(string + ", " + value);
            fVar.r(sb3.toString());
            this.slider.updateBoundsForVirtualViewId(i14, this.virtualViewBounds);
            accessibilityNodeInfo.setBoundsInParent(this.virtualViewBounds);
        }
    }

    public enum FullCornerDirection {
        BOTH,
        LEFT,
        RIGHT,
        NONE
    }

    public BaseSlider(Context context, AttributeSet attributeSet, int i14) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i14, DEF_STYLE_RES), attributeSet, i14);
        this.labels = new ArrayList();
        this.changeListeners = new ArrayList();
        this.touchListeners = new ArrayList();
        this.labelsAreAnimatedIn = false;
        this.defaultThumbWidth = -1;
        this.defaultThumbTrackGapSize = -1;
        this.thumbIsPressed = false;
        this.values = new ArrayList<>();
        this.activeThumbIdx = -1;
        this.focusedThumbIdx = -1;
        this.stepSize = 0.0f;
        this.tickVisible = true;
        this.isLongPress = false;
        this.trackPath = new Path();
        this.trackRect = new RectF();
        this.cornerRect = new RectF();
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.defaultThumbDrawable = materialShapeDrawable;
        this.customThumbDrawablesForValues = Collections.EMPTY_LIST;
        this.separationUnit = 0;
        this.onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.material.slider.a
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.f53247a.updateLabels();
            }
        };
        Context context2 = getContext();
        this.inactiveTrackPaint = new Paint();
        this.activeTrackPaint = new Paint();
        Paint paint = new Paint(1);
        this.thumbPaint = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.haloPaint = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.inactiveTicksPaint = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.activeTicksPaint = paint4;
        paint4.setStyle(style2);
        paint4.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.stopIndicatorPaint = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        loadResources(context2.getResources());
        processAttributes(context2, attributeSet, i14);
        setFocusable(true);
        setClickable(true);
        materialShapeDrawable.setShadowCompatibilityMode(2);
        this.scaledTouchSlop = ViewConfiguration.get(context2).getScaledTouchSlop();
        AccessibilityHelper accessibilityHelper = new AccessibilityHelper(this);
        this.accessibilityHelper = accessibilityHelper;
        s0.r(this, accessibilityHelper);
        this.accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    private void adjustCustomThumbDrawableBounds(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, this.thumbWidth, this.thumbHeight);
        } else {
            float fMax = Math.max(this.thumbWidth, this.thumbHeight) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    private void attachLabelToContentView(TooltipDrawable tooltipDrawable) {
        tooltipDrawable.setRelativeToView(ViewUtils.getContentView(this));
    }

    private Float calculateIncrementForKey(int i14) {
        float fCalculateStepIncrement = this.isLongPress ? calculateStepIncrement(20) : calculateStepIncrement();
        if (i14 == 21) {
            if (!isRtl()) {
                fCalculateStepIncrement = -fCalculateStepIncrement;
            }
            return Float.valueOf(fCalculateStepIncrement);
        }
        if (i14 == 22) {
            if (isRtl()) {
                fCalculateStepIncrement = -fCalculateStepIncrement;
            }
            return Float.valueOf(fCalculateStepIncrement);
        }
        if (i14 == 69) {
            return Float.valueOf(-fCalculateStepIncrement);
        }
        if (i14 == 70 || i14 == 81) {
            return Float.valueOf(fCalculateStepIncrement);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float calculateStepIncrement(int i14) {
        float fCalculateStepIncrement = calculateStepIncrement();
        float f14 = (this.valueTo - this.valueFrom) / fCalculateStepIncrement;
        float f15 = i14;
        return f14 <= f15 ? fCalculateStepIncrement : Math.round(f14 / f15) * fCalculateStepIncrement;
    }

    private int calculateTrackCenter() {
        return (this.widgetHeight / 2) + ((this.labelBehavior == 1 || shouldAlwaysShowLabel()) ? this.labels.get(0).getIntrinsicHeight() : 0);
    }

    private ValueAnimator createLabelAnimator(boolean z14) {
        int iResolveThemeDuration;
        TimeInterpolator timeInterpolatorResolveThemeInterpolator;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getAnimatorCurrentValueOrDefault(z14 ? this.labelsOutAnimator : this.labelsInAnimator, z14 ? 0.0f : 1.0f), z14 ? 1.0f : 0.0f);
        if (z14) {
            iResolveThemeDuration = MotionUtils.resolveThemeDuration(getContext(), LABEL_ANIMATION_ENTER_DURATION_ATTR, 83);
            timeInterpolatorResolveThemeInterpolator = MotionUtils.resolveThemeInterpolator(getContext(), LABEL_ANIMATION_ENTER_EASING_ATTR, AnimationUtils.DECELERATE_INTERPOLATOR);
        } else {
            iResolveThemeDuration = MotionUtils.resolveThemeDuration(getContext(), LABEL_ANIMATION_EXIT_DURATION_ATTR, 117);
            timeInterpolatorResolveThemeInterpolator = MotionUtils.resolveThemeInterpolator(getContext(), LABEL_ANIMATION_EXIT_EASING_ATTR, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        }
        valueAnimatorOfFloat.setDuration(iResolveThemeDuration);
        valueAnimatorOfFloat.setInterpolator(timeInterpolatorResolveThemeInterpolator);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.slider.BaseSlider.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = BaseSlider.this.labels.iterator();
                while (it.hasNext()) {
                    ((TooltipDrawable) it.next()).setRevealFraction(fFloatValue);
                }
                BaseSlider baseSlider = BaseSlider.this;
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                baseSlider.postInvalidateOnAnimation();
            }
        });
        return valueAnimatorOfFloat;
    }

    private void createLabelPool() {
        if (this.labels.size() > this.values.size()) {
            List<TooltipDrawable> listSubList = this.labels.subList(this.values.size(), this.labels.size());
            for (TooltipDrawable tooltipDrawable : listSubList) {
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                if (isAttachedToWindow()) {
                    detachLabelFromContentView(tooltipDrawable);
                }
            }
            listSubList.clear();
        }
        while (true) {
            if (this.labels.size() >= this.values.size()) {
                break;
            }
            TooltipDrawable tooltipDrawableCreateFromAttributes = TooltipDrawable.createFromAttributes(getContext(), null, 0, this.labelStyle);
            this.labels.add(tooltipDrawableCreateFromAttributes);
            WeakHashMap<View, g1> weakHashMap2 = s0.f6563a;
            if (isAttachedToWindow()) {
                attachLabelToContentView(tooltipDrawableCreateFromAttributes);
            }
        }
        int i14 = this.labels.size() != 1 ? 1 : 0;
        Iterator<TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            it.next().setStrokeWidth(i14);
        }
    }

    private void detachLabelFromContentView(TooltipDrawable tooltipDrawable) {
        ViewOverlayImpl contentViewOverlay = ViewUtils.getContentViewOverlay(this);
        if (contentViewOverlay != null) {
            contentViewOverlay.remove(tooltipDrawable);
            tooltipDrawable.detachView(ViewUtils.getContentView(this));
        }
    }

    private float dimenToValue(float f14) {
        if (f14 == 0.0f) {
            return 0.0f;
        }
        float f15 = (f14 - this.trackSidePadding) / this.trackWidth;
        float f16 = this.valueFrom;
        return x.a(f16, this.valueTo, f15, f16);
    }

    private void dispatchOnChangedFromUser(int i14) {
        Iterator<L> it = this.changeListeners.iterator();
        while (it.hasNext()) {
            it.next().onValueChange(this, this.values.get(i14).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        scheduleAccessibilityEventSender(i14);
    }

    private void dispatchOnChangedProgrammatically() {
        for (L l14 : this.changeListeners) {
            Iterator<Float> it = this.values.iterator();
            while (it.hasNext()) {
                l14.onValueChange(this, it.next().floatValue(), false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b6 A[SYNTHETIC] */
    private void drawActiveTrack(Canvas canvas, int i14, int i15) {
        int i16;
        float[] activeRange = getActiveRange();
        int i17 = this.trackSidePadding;
        float f14 = i14;
        float f15 = (activeRange[1] * f14) + i17;
        float fValueToX = (activeRange[0] * f14) + i17;
        if (!hasGapBetweenThumbAndTrack()) {
            this.activeTrackPaint.setStyle(Paint.Style.STROKE);
            this.activeTrackPaint.setStrokeCap(Paint.Cap.ROUND);
            float f16 = i15;
            canvas.drawLine(fValueToX, f16, f15, f16, this.activeTrackPaint);
            return;
        }
        FullCornerDirection fullCornerDirection = FullCornerDirection.NONE;
        if (this.values.size() == 1) {
            fullCornerDirection = isRtl() ? FullCornerDirection.RIGHT : FullCornerDirection.LEFT;
        }
        for (int i18 = 0; i18 < this.values.size(); i18++) {
            if (this.values.size() > 1) {
                if (i18 > 0) {
                    fValueToX = valueToX(this.values.get(i18 - 1).floatValue());
                }
                float fValueToX2 = valueToX(this.values.get(i18).floatValue());
                if (isRtl()) {
                    f15 = fValueToX;
                    fValueToX = fValueToX2;
                } else {
                    f15 = fValueToX2;
                }
            }
            int i19 = AnonymousClass3.$SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection[fullCornerDirection.ordinal()];
            if (i19 != 1) {
                if (i19 == 2) {
                    fValueToX -= this.trackHeight / 2.0f;
                    i16 = this.thumbTrackGapSize;
                } else if (i19 == 3) {
                    fValueToX += this.thumbTrackGapSize;
                    f15 = (this.trackHeight / 2.0f) + f15;
                }
                if (fValueToX >= f15) {
                    RectF rectF = this.trackRect;
                    float f17 = i15;
                    int i24 = this.trackHeight;
                    rectF.set(fValueToX, f17 - (i24 / 2.0f), f15, (i24 / 2.0f) + f17);
                    updateTrack(canvas, this.activeTrackPaint, this.trackRect, fullCornerDirection);
                }
            } else {
                i16 = this.thumbTrackGapSize;
                fValueToX += i16;
            }
            f15 -= i16;
            if (fValueToX >= f15) {
                RectF rectF2 = this.trackRect;
                float f18 = i15;
                int i25 = this.trackHeight;
                rectF2.set(fValueToX, f18 - (i25 / 2.0f), f15, (i25 / 2.0f) + f18);
                updateTrack(canvas, this.activeTrackPaint, this.trackRect, fullCornerDirection);
            }
        }
    }

    private void drawInactiveTrack(Canvas canvas, int i14, int i15) {
        float[] activeRange = getActiveRange();
        int i16 = this.trackSidePadding;
        float f14 = i14;
        float f15 = (activeRange[1] * f14) + i16;
        if (f15 < i16 + i14) {
            if (hasGapBetweenThumbAndTrack()) {
                RectF rectF = this.trackRect;
                float f16 = f15 + this.thumbTrackGapSize;
                float f17 = i15;
                int i17 = this.trackHeight;
                rectF.set(f16, f17 - (i17 / 2.0f), (i17 / 2.0f) + this.trackSidePadding + i14, (i17 / 2.0f) + f17);
                updateTrack(canvas, this.inactiveTrackPaint, this.trackRect, FullCornerDirection.RIGHT);
            } else {
                this.inactiveTrackPaint.setStyle(Paint.Style.STROKE);
                this.inactiveTrackPaint.setStrokeCap(Paint.Cap.ROUND);
                float f18 = i15;
                canvas.drawLine(f15, f18, this.trackSidePadding + i14, f18, this.inactiveTrackPaint);
            }
        }
        int i18 = this.trackSidePadding;
        float f19 = (activeRange[0] * f14) + i18;
        if (f19 > i18) {
            if (!hasGapBetweenThumbAndTrack()) {
                this.inactiveTrackPaint.setStyle(Paint.Style.STROKE);
                this.inactiveTrackPaint.setStrokeCap(Paint.Cap.ROUND);
                float f22 = i15;
                canvas.drawLine(this.trackSidePadding, f22, f19, f22, this.inactiveTrackPaint);
                return;
            }
            RectF rectF2 = this.trackRect;
            float f24 = this.trackSidePadding;
            int i19 = this.trackHeight;
            float f25 = i15;
            rectF2.set(f24 - (i19 / 2.0f), f25 - (i19 / 2.0f), f19 - this.thumbTrackGapSize, (i19 / 2.0f) + f25);
            updateTrack(canvas, this.inactiveTrackPaint, this.trackRect, FullCornerDirection.LEFT);
        }
    }

    private void drawThumbDrawable(Canvas canvas, int i14, int i15, float f14, Drawable drawable) {
        canvas.save();
        canvas.translate((this.trackSidePadding + ((int) (normalizeValue(f14) * i14))) - (drawable.getBounds().width() / 2.0f), i15 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    private void drawThumbs(Canvas canvas, int i14, int i15) {
        Canvas canvas2;
        int i16;
        int i17;
        int i18 = 0;
        while (i18 < this.values.size()) {
            float fFloatValue = this.values.get(i18).floatValue();
            Drawable drawable = this.customThumbDrawable;
            if (drawable != null) {
                canvas2 = canvas;
                i16 = i14;
                i17 = i15;
                drawThumbDrawable(canvas2, i16, i17, fFloatValue, drawable);
            } else {
                canvas2 = canvas;
                i16 = i14;
                i17 = i15;
                if (i18 < this.customThumbDrawablesForValues.size()) {
                    drawThumbDrawable(canvas2, i16, i17, fFloatValue, this.customThumbDrawablesForValues.get(i18));
                } else {
                    if (!isEnabled()) {
                        canvas2.drawCircle((normalizeValue(fFloatValue) * i16) + this.trackSidePadding, i17, getThumbRadius(), this.thumbPaint);
                    }
                    drawThumbDrawable(canvas2, i16, i17, fFloatValue, this.defaultThumbDrawable);
                }
            }
            i18++;
            canvas = canvas2;
            i14 = i16;
            i15 = i17;
        }
    }

    private void ensureLabelsAdded() {
        if (!this.labelsAreAnimatedIn) {
            this.labelsAreAnimatedIn = true;
            ValueAnimator valueAnimatorCreateLabelAnimator = createLabelAnimator(true);
            this.labelsInAnimator = valueAnimatorCreateLabelAnimator;
            this.labelsOutAnimator = null;
            valueAnimatorCreateLabelAnimator.start();
        }
        Iterator<TooltipDrawable> it = this.labels.iterator();
        for (int i14 = 0; i14 < this.values.size() && it.hasNext(); i14++) {
            if (i14 != this.focusedThumbIdx) {
                setValueForLabel(it.next(), this.values.get(i14).floatValue());
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(this.labels.size()), Integer.valueOf(this.values.size())));
        }
        setValueForLabel(it.next(), this.values.get(this.focusedThumbIdx).floatValue());
    }

    private void ensureLabelsRemoved() {
        if (this.labelsAreAnimatedIn) {
            this.labelsAreAnimatedIn = false;
            ValueAnimator valueAnimatorCreateLabelAnimator = createLabelAnimator(false);
            this.labelsOutAnimator = valueAnimatorCreateLabelAnimator;
            this.labelsInAnimator = null;
            valueAnimatorCreateLabelAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.slider.BaseSlider.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    ViewOverlayImpl contentViewOverlay = ViewUtils.getContentViewOverlay(BaseSlider.this);
                    Iterator it = BaseSlider.this.labels.iterator();
                    while (it.hasNext()) {
                        contentViewOverlay.remove((TooltipDrawable) it.next());
                    }
                }
            });
            this.labelsOutAnimator.start();
        }
    }

    private void focusThumbOnFocusGained(int i14) {
        if (i14 == 1) {
            moveFocus(Integer.MAX_VALUE);
            return;
        }
        if (i14 == 2) {
            moveFocus(Integer.MIN_VALUE);
        } else if (i14 == 17) {
            moveFocusInAbsoluteDirection(Integer.MAX_VALUE);
        } else {
            if (i14 != 66) {
                return;
            }
            moveFocusInAbsoluteDirection(Integer.MIN_VALUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String formatValue(float f14) {
        if (hasLabelFormatter()) {
            return this.formatter.getFormattedValue(f14);
        }
        return String.format(((float) ((int) f14)) == f14 ? "%.0f" : "%.2f", Float.valueOf(f14));
    }

    private float[] getActiveRange() {
        float fFloatValue = this.values.get(0).floatValue();
        float fFloatValue2 = ((Float) j.f(1, this.values)).floatValue();
        if (this.values.size() == 1) {
            fFloatValue = this.valueFrom;
        }
        float fNormalizeValue = normalizeValue(fFloatValue);
        float fNormalizeValue2 = normalizeValue(fFloatValue2);
        return isRtl() ? new float[]{fNormalizeValue2, fNormalizeValue} : new float[]{fNormalizeValue, fNormalizeValue2};
    }

    private static float getAnimatorCurrentValueOrDefault(ValueAnimator valueAnimator, float f14) {
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return f14;
        }
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        valueAnimator.cancel();
        return fFloatValue;
    }

    private float getClampedValue(int i14, float f14) {
        float minSeparation = getMinSeparation();
        if (this.separationUnit == 0) {
            minSeparation = dimenToValue(minSeparation);
        }
        if (isRtl()) {
            minSeparation = -minSeparation;
        }
        int i15 = i14 + 1;
        int i16 = i14 - 1;
        return g7.a.a(f14, i16 < 0 ? this.valueFrom : this.values.get(i16).floatValue() + minSeparation, i15 >= this.values.size() ? this.valueTo : this.values.get(i15).floatValue() - minSeparation);
    }

    private int getColorForState(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    private float[] getCornerRadii(float f14, float f15) {
        return new float[]{f14, f14, f15, f15, f15, f15, f14, f14};
    }

    private float getValueOfTouchPosition() {
        double dSnapPosition = snapPosition(this.touchPosition);
        if (isRtl()) {
            dSnapPosition = 1.0d - dSnapPosition;
        }
        float f14 = this.valueTo;
        float f15 = this.valueFrom;
        return (float) ((dSnapPosition * ((double) (f14 - f15))) + ((double) f15));
    }

    private float getValueOfTouchPositionAbsolute() {
        float f14 = this.touchPosition;
        if (isRtl()) {
            f14 = 1.0f - f14;
        }
        float f15 = this.valueTo;
        float f16 = this.valueFrom;
        return x.a(f15, f16, f14, f16);
    }

    private boolean hasGapBetweenThumbAndTrack() {
        return this.thumbTrackGapSize > 0;
    }

    private Drawable initializeCustomThumbDrawable(Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        adjustCustomThumbDrawableBounds(drawableNewDrawable);
        return drawableNewDrawable;
    }

    private void invalidateTrack() {
        this.inactiveTrackPaint.setStrokeWidth(this.trackHeight);
        this.activeTrackPaint.setStrokeWidth(this.trackHeight);
    }

    private boolean isInVerticalScrollingContainer() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    private static boolean isMouseEvent(MotionEvent motionEvent) {
        return motionEvent.getToolType(0) == 3;
    }

    private boolean isMultipleOfStepSize(double d14) {
        double dDoubleValue = new BigDecimal(Double.toString(d14)).divide(new BigDecimal(Float.toString(this.stepSize)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < THRESHOLD;
    }

    private boolean isPotentialVerticalScroll(MotionEvent motionEvent) {
        return !isMouseEvent(motionEvent) && isInVerticalScrollingContainer();
    }

    private boolean isSliderVisibleOnScreen() {
        Rect rect = new Rect();
        ViewUtils.getContentView(this).getHitRect(rect);
        return getLocalVisibleRect(rect);
    }

    private void loadResources(Resources resources) {
        this.minWidgetHeight = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.minTrackSidePadding = dimensionPixelOffset;
        this.trackSidePadding = dimensionPixelOffset;
        this.defaultThumbRadius = resources.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.defaultTrackHeight = resources.getDimensionPixelSize(R.dimen.mtrl_slider_track_height);
        int i14 = R.dimen.mtrl_slider_tick_radius;
        this.defaultTickActiveRadius = resources.getDimensionPixelSize(i14);
        this.defaultTickInactiveRadius = resources.getDimensionPixelSize(i14);
        this.minTickSpacing = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_min_spacing);
        this.labelPadding = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
    }

    private void maybeCalculateTicksCoordinates() {
        if (this.stepSize <= 0.0f) {
            return;
        }
        validateConfigurationIfDirty();
        int iMin = Math.min((int) (((this.valueTo - this.valueFrom) / this.stepSize) + 1.0f), (this.trackWidth / this.minTickSpacing) + 1);
        float[] fArr = this.ticksCoordinates;
        if (fArr == null || fArr.length != iMin * 2) {
            this.ticksCoordinates = new float[iMin * 2];
        }
        float f14 = this.trackWidth / (iMin - 1);
        for (int i14 = 0; i14 < iMin * 2; i14 += 2) {
            float[] fArr2 = this.ticksCoordinates;
            fArr2[i14] = ((i14 / 2.0f) * f14) + this.trackSidePadding;
            fArr2[i14 + 1] = calculateTrackCenter();
        }
    }

    private void maybeDrawCompatHalo(Canvas canvas, int i14, int i15) {
        if (shouldDrawCompatHalo()) {
            canvas.drawCircle((int) ((normalizeValue(this.values.get(this.focusedThumbIdx).floatValue()) * i14) + this.trackSidePadding), i15, this.haloRadius, this.haloPaint);
        }
    }

    private void maybeDrawStopIndicator(Canvas canvas, int i14) {
        if (this.trackStopIndicatorSize <= 0) {
            return;
        }
        if (this.values.size() >= 1) {
            float fFloatValue = ((Float) j.f(1, this.values)).floatValue();
            float f14 = this.valueTo;
            if (fFloatValue < f14) {
                canvas.drawPoint(valueToX(f14), i14, this.stopIndicatorPaint);
            }
        }
        if (this.values.size() > 1) {
            float fFloatValue2 = this.values.get(0).floatValue();
            float f15 = this.valueFrom;
            if (fFloatValue2 > f15) {
                canvas.drawPoint(valueToX(f15), i14, this.stopIndicatorPaint);
            }
        }
    }

    private void maybeDrawTicks(Canvas canvas) {
        if (!this.tickVisible || this.stepSize <= 0.0f) {
            return;
        }
        float[] activeRange = getActiveRange();
        int iCeil = (int) Math.ceil(((this.ticksCoordinates.length / 2.0f) - 1.0f) * activeRange[0]);
        int iFloor = (int) Math.floor(((this.ticksCoordinates.length / 2.0f) - 1.0f) * activeRange[1]);
        if (iCeil > 0) {
            canvas.drawPoints(this.ticksCoordinates, 0, iCeil * 2, this.inactiveTicksPaint);
        }
        if (iCeil <= iFloor) {
            canvas.drawPoints(this.ticksCoordinates, iCeil * 2, ((iFloor - iCeil) + 1) * 2, this.activeTicksPaint);
        }
        int i14 = (iFloor + 1) * 2;
        float[] fArr = this.ticksCoordinates;
        if (i14 < fArr.length) {
            canvas.drawPoints(fArr, i14, fArr.length - i14, this.inactiveTicksPaint);
        }
    }

    private boolean maybeIncreaseTrackSidePadding() {
        int iMax = Math.max((this.thumbWidth / 2) - this.defaultThumbRadius, 0);
        int iMax2 = Math.max((this.trackHeight - this.defaultTrackHeight) / 2, 0);
        int iMax3 = Math.max(this.tickActiveRadius - this.defaultTickActiveRadius, 0);
        int iMax4 = Math.max(this.tickInactiveRadius - this.defaultTickInactiveRadius, 0);
        int iMax5 = Math.max(Math.max(iMax, iMax2), Math.max(iMax3, iMax4)) + this.minTrackSidePadding;
        if (this.trackSidePadding == iMax5) {
            return false;
        }
        this.trackSidePadding = iMax5;
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        if (!isLaidOut()) {
            return true;
        }
        updateTrackWidth(getWidth());
        return true;
    }

    private boolean maybeIncreaseWidgetHeight() {
        int iMax = Math.max(this.minWidgetHeight, Math.max(this.trackHeight + getPaddingBottom() + getPaddingTop(), getPaddingBottom() + getPaddingTop() + this.thumbHeight));
        if (iMax == this.widgetHeight) {
            return false;
        }
        this.widgetHeight = iMax;
        return true;
    }

    private boolean moveFocus(int i14) {
        int i15 = this.focusedThumbIdx;
        long j8 = ((long) i15) + ((long) i14);
        long size = this.values.size() - 1;
        if (j8 < 0) {
            j8 = 0;
        } else if (j8 > size) {
            j8 = size;
        }
        int i16 = (int) j8;
        this.focusedThumbIdx = i16;
        if (i16 == i15) {
            return false;
        }
        if (this.activeThumbIdx != -1) {
            this.activeThumbIdx = i16;
        }
        updateHaloHotspot();
        postInvalidate();
        return true;
    }

    private boolean moveFocusInAbsoluteDirection(int i14) {
        if (isRtl()) {
            i14 = i14 == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i14;
        }
        return moveFocus(i14);
    }

    private float normalizeValue(float f14) {
        float f15 = this.valueFrom;
        float f16 = (f14 - f15) / (this.valueTo - f15);
        return isRtl() ? 1.0f - f16 : f16;
    }

    private Boolean onKeyDownNoActiveThumb(int i14, KeyEvent keyEvent) {
        if (i14 == 61) {
            if (keyEvent.hasNoModifiers()) {
                return Boolean.valueOf(moveFocus(1));
            }
            return keyEvent.isShiftPressed() ? Boolean.valueOf(moveFocus(-1)) : Boolean.FALSE;
        }
        if (i14 != 66) {
            if (i14 != 81) {
                if (i14 == 69) {
                    moveFocus(-1);
                    return Boolean.TRUE;
                }
                if (i14 != 70) {
                    switch (i14) {
                        case 21:
                            moveFocusInAbsoluteDirection(-1);
                            return Boolean.TRUE;
                        case 22:
                            moveFocusInAbsoluteDirection(1);
                            return Boolean.TRUE;
                        case 23:
                            break;
                        default:
                            return null;
                    }
                }
            }
            moveFocus(1);
            return Boolean.TRUE;
        }
        this.activeThumbIdx = this.focusedThumbIdx;
        postInvalidate();
        return Boolean.TRUE;
    }

    private void onStartTrackingTouch() {
        Iterator<T> it = this.touchListeners.iterator();
        while (it.hasNext()) {
            it.next().onStartTrackingTouch(this);
        }
    }

    private void onStopTrackingTouch() {
        Iterator<T> it = this.touchListeners.iterator();
        while (it.hasNext()) {
            it.next().onStopTrackingTouch(this);
        }
    }

    private void positionLabel(TooltipDrawable tooltipDrawable, float f14) {
        int iNormalizeValue = (this.trackSidePadding + ((int) (normalizeValue(f14) * this.trackWidth))) - (tooltipDrawable.getIntrinsicWidth() / 2);
        int iCalculateTrackCenter = calculateTrackCenter() - ((this.thumbHeight / 2) + this.labelPadding);
        tooltipDrawable.setBounds(iNormalizeValue, iCalculateTrackCenter - tooltipDrawable.getIntrinsicHeight(), tooltipDrawable.getIntrinsicWidth() + iNormalizeValue, iCalculateTrackCenter);
        Rect rect = new Rect(tooltipDrawable.getBounds());
        DescendantOffsetUtils.offsetDescendantRect(ViewUtils.getContentView(this), this, rect);
        tooltipDrawable.setBounds(rect);
    }

    private void processAttributes(Context context, AttributeSet attributeSet, int i14) {
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.Slider, i14, DEF_STYLE_RES, new int[0]);
        this.labelStyle = typedArrayObtainStyledAttributes.getResourceId(R.styleable.Slider_labelStyle, R.style.Widget_MaterialComponents_Tooltip);
        this.valueFrom = typedArrayObtainStyledAttributes.getFloat(R.styleable.Slider_android_valueFrom, 0.0f);
        this.valueTo = typedArrayObtainStyledAttributes.getFloat(R.styleable.Slider_android_valueTo, 1.0f);
        setValues(Float.valueOf(this.valueFrom));
        this.stepSize = typedArrayObtainStyledAttributes.getFloat(R.styleable.Slider_android_stepSize, 0.0f);
        this.minTouchTargetSize = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(R.styleable.Slider_minTouchTargetSize, (float) Math.ceil(ViewUtils.dpToPx(getContext(), 48))));
        int i15 = R.styleable.Slider_trackColor;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i15);
        int i16 = zHasValue ? i15 : R.styleable.Slider_trackColorInactive;
        if (!zHasValue) {
            i15 = R.styleable.Slider_trackColorActive;
        }
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i16);
        if (colorStateList == null) {
            colorStateList = b.getColorStateList(context, R.color.material_slider_inactive_track_color);
        }
        setTrackInactiveTintList(colorStateList);
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i15);
        if (colorStateList2 == null) {
            colorStateList2 = b.getColorStateList(context, R.color.material_slider_active_track_color);
        }
        setTrackActiveTintList(colorStateList2);
        this.defaultThumbDrawable.setFillColor(MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.Slider_thumbColor));
        int i17 = R.styleable.Slider_thumbStrokeColor;
        if (typedArrayObtainStyledAttributes.hasValue(i17)) {
            setThumbStrokeColor(MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i17));
        }
        setThumbStrokeWidth(typedArrayObtainStyledAttributes.getDimension(R.styleable.Slider_thumbStrokeWidth, 0.0f));
        ColorStateList colorStateList3 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.Slider_haloColor);
        if (colorStateList3 == null) {
            colorStateList3 = b.getColorStateList(context, R.color.material_slider_halo_color);
        }
        setHaloTintList(colorStateList3);
        this.tickVisible = typedArrayObtainStyledAttributes.getBoolean(R.styleable.Slider_tickVisible, true);
        int i18 = R.styleable.Slider_tickColor;
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(i18);
        int i19 = zHasValue2 ? i18 : R.styleable.Slider_tickColorInactive;
        if (!zHasValue2) {
            i18 = R.styleable.Slider_tickColorActive;
        }
        ColorStateList colorStateList4 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i19);
        if (colorStateList4 == null) {
            colorStateList4 = b.getColorStateList(context, R.color.material_slider_inactive_tick_marks_color);
        }
        setTickInactiveTintList(colorStateList4);
        ColorStateList colorStateList5 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i18);
        if (colorStateList5 == null) {
            colorStateList5 = b.getColorStateList(context, R.color.material_slider_active_tick_marks_color);
        }
        setTickActiveTintList(colorStateList5);
        setThumbTrackGapSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_thumbTrackGapSize, 0));
        setTrackStopIndicatorSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_trackStopIndicatorSize, 0));
        setTrackInsideCornerSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_trackInsideCornerSize, 0));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_thumbRadius, 0) * 2;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_thumbWidth, dimensionPixelSize);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_thumbHeight, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_haloRadius, 0));
        setThumbElevation(typedArrayObtainStyledAttributes.getDimension(R.styleable.Slider_thumbElevation, 0.0f));
        setTrackHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_trackHeight, 0));
        setTickActiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_tickRadiusActive, this.trackStopIndicatorSize / 2));
        setTickInactiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_tickRadiusInactive, this.trackStopIndicatorSize / 2));
        setLabelBehavior(typedArrayObtainStyledAttributes.getInt(R.styleable.Slider_labelBehavior, 0));
        if (!typedArrayObtainStyledAttributes.getBoolean(R.styleable.Slider_android_enabled, true)) {
            setEnabled(false);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void scheduleAccessibilityEventSender(int i14) {
        BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender = this.accessibilityEventSender;
        if (accessibilityEventSender == null) {
            this.accessibilityEventSender = new AccessibilityEventSender();
        } else {
            removeCallbacks(accessibilityEventSender);
        }
        this.accessibilityEventSender.setVirtualViewId(i14);
        postDelayed(this.accessibilityEventSender, 200L);
    }

    private void setValueForLabel(TooltipDrawable tooltipDrawable, float f14) {
        tooltipDrawable.setText(formatValue(f14));
        positionLabel(tooltipDrawable, f14);
        ViewUtils.getContentViewOverlay(this).add(tooltipDrawable);
    }

    private void setValuesInternal(ArrayList<Float> arrayList) {
        if (arrayList.isEmpty()) {
            h.s("At least one value must be set");
            return;
        }
        Collections.sort(arrayList);
        if (this.values.size() == arrayList.size() && this.values.equals(arrayList)) {
            return;
        }
        this.values = arrayList;
        this.dirtyConfig = true;
        this.focusedThumbIdx = 0;
        updateHaloHotspot();
        createLabelPool();
        dispatchOnChangedProgrammatically();
        postInvalidate();
    }

    private boolean shouldAlwaysShowLabel() {
        return this.labelBehavior == 3;
    }

    private boolean shouldDrawCompatHalo() {
        return this.forceDrawCompatHalo || !(getBackground() instanceof RippleDrawable);
    }

    private boolean snapActiveThumbToValue(float f14) {
        return snapThumbToValue(this.activeThumbIdx, f14);
    }

    private double snapPosition(float f14) {
        float f15 = this.stepSize;
        if (f15 <= 0.0f) {
            return f14;
        }
        int i14 = (int) ((this.valueTo - this.valueFrom) / f15);
        return ((double) Math.round(f14 * i14)) / ((double) i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean snapThumbToValue(int i14, float f14) {
        this.focusedThumbIdx = i14;
        if (Math.abs(f14 - this.values.get(i14).floatValue()) < THRESHOLD) {
            return false;
        }
        this.values.set(i14, Float.valueOf(getClampedValue(i14, f14)));
        dispatchOnChangedFromUser(i14);
        return true;
    }

    private boolean snapTouchPosition() {
        return snapActiveThumbToValue(getValueOfTouchPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateHaloHotspot() {
        if (shouldDrawCompatHalo() || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            int iNormalizeValue = (int) ((normalizeValue(this.values.get(this.focusedThumbIdx).floatValue()) * this.trackWidth) + this.trackSidePadding);
            int iCalculateTrackCenter = calculateTrackCenter();
            int i14 = this.haloRadius;
            background.setHotspotBounds(iNormalizeValue - i14, iCalculateTrackCenter - i14, iNormalizeValue + i14, iCalculateTrackCenter + i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLabels() {
        int i14 = this.labelBehavior;
        if (i14 == 0 || i14 == 1) {
            if (this.activeThumbIdx == -1 || !isEnabled()) {
                ensureLabelsRemoved();
                return;
            } else {
                ensureLabelsAdded();
                return;
            }
        }
        if (i14 == 2) {
            ensureLabelsRemoved();
            return;
        }
        if (i14 != 3) {
            sn.a.z(this.labelBehavior, "Unexpected labelBehavior: ");
        } else if (isEnabled() && isSliderVisibleOnScreen()) {
            ensureLabelsAdded();
        } else {
            ensureLabelsRemoved();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    /* JADX WARN: Code duplicated, block: B:15:0x0053  */
    /* JADX WARN: Code duplicated, block: B:17:0x0072  */
    /* JADX WARN: Code duplicated, block: B:19:0x0076  */
    /* JADX WARN: Code duplicated, block: B:20:0x0088  */
    /* JADX WARN: Code duplicated, block: B:21:0x0095  */
    private void updateTrack(Canvas canvas, Paint paint, RectF rectF, FullCornerDirection fullCornerDirection) {
        int i14;
        float fMax;
        int i15;
        RectF rectF2;
        int i16 = this.trackHeight;
        float f14 = i16 / 2.0f;
        float f15 = i16 / 2.0f;
        int[] iArr = AnonymousClass3.$SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection;
        int i17 = iArr[fullCornerDirection.ordinal()];
        if (i17 != 1) {
            if (i17 == 2) {
                i14 = this.trackInsideCornerSize;
            } else if (i17 == 3) {
                f14 = this.trackInsideCornerSize;
            }
            paint.setStyle(Paint.Style.FILL);
            paint.setStrokeCap(Paint.Cap.BUTT);
            paint.setAntiAlias(true);
            this.trackPath.reset();
            if (rectF.width() >= f14 + f15) {
                this.trackPath.addRoundRect(rectF, getCornerRadii(f14, f15), Path.Direction.CW);
                canvas.drawPath(this.trackPath, paint);
                return;
            }
            float fMin = Math.min(f14, f15);
            fMax = Math.max(f14, f15);
            canvas.save();
            this.trackPath.addRoundRect(rectF, fMin, fMin, Path.Direction.CW);
            canvas.clipPath(this.trackPath);
            i15 = iArr[fullCornerDirection.ordinal()];
            if (i15 != 2) {
                rectF2 = this.cornerRect;
                if (i15 != 3) {
                    rectF2.set(rectF.centerX() - fMax, rectF.top, rectF.centerX() + fMax, rectF.bottom);
                } else {
                    float f16 = rectF.right;
                    rectF2.set(f16 - (2.0f * fMax), rectF.top, f16, rectF.bottom);
                }
            } else {
                RectF rectF3 = this.cornerRect;
                float f17 = rectF.left;
                rectF3.set(f17, rectF.top, (2.0f * fMax) + f17, rectF.bottom);
            }
            canvas.drawRoundRect(this.cornerRect, fMax, fMax, paint);
            canvas.restore();
        }
        i14 = this.trackInsideCornerSize;
        f14 = i14;
        f15 = i14;
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        this.trackPath.reset();
        if (rectF.width() >= f14 + f15) {
            this.trackPath.addRoundRect(rectF, getCornerRadii(f14, f15), Path.Direction.CW);
            canvas.drawPath(this.trackPath, paint);
            return;
        }
        float fMin2 = Math.min(f14, f15);
        fMax = Math.max(f14, f15);
        canvas.save();
        this.trackPath.addRoundRect(rectF, fMin2, fMin2, Path.Direction.CW);
        canvas.clipPath(this.trackPath);
        i15 = iArr[fullCornerDirection.ordinal()];
        if (i15 != 2) {
            rectF2 = this.cornerRect;
            if (i15 != 3) {
                rectF2.set(rectF.centerX() - fMax, rectF.top, rectF.centerX() + fMax, rectF.bottom);
            } else {
                float f18 = rectF.right;
                rectF2.set(f18 - (2.0f * fMax), rectF.top, f18, rectF.bottom);
            }
        } else {
            RectF rectF4 = this.cornerRect;
            float f19 = rectF.left;
            rectF4.set(f19, rectF.top, (2.0f * fMax) + f19, rectF.bottom);
        }
        canvas.drawRoundRect(this.cornerRect, fMax, fMax, paint);
        canvas.restore();
    }

    private void updateTrackWidth(int i14) {
        this.trackWidth = Math.max(i14 - (this.trackSidePadding * 2), 0);
        maybeCalculateTicksCoordinates();
    }

    private void updateWidgetLayout() {
        boolean zMaybeIncreaseWidgetHeight = maybeIncreaseWidgetHeight();
        boolean zMaybeIncreaseTrackSidePadding = maybeIncreaseTrackSidePadding();
        if (zMaybeIncreaseWidgetHeight) {
            requestLayout();
        } else if (zMaybeIncreaseTrackSidePadding) {
            postInvalidate();
        }
    }

    private void validateConfigurationIfDirty() {
        if (this.dirtyConfig) {
            validateValueFrom();
            validateValueTo();
            validateStepSize();
            validateValues();
            validateMinSeparation();
            warnAboutFloatingPointError();
            this.dirtyConfig = false;
        }
    }

    private void validateMinSeparation() {
        float minSeparation = getMinSeparation();
        if (minSeparation < 0.0f) {
            throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal to 0");
        }
        float f14 = this.stepSize;
        if (f14 <= 0.0f || minSeparation <= 0.0f) {
            return;
        }
        if (this.separationUnit != 1) {
            h.z(j.l("minSeparation(", minSeparation, ") cannot be set as a dimension when using stepSize(", this.stepSize, ")"));
        } else if (minSeparation < f14 || !isMultipleOfStepSize(minSeparation)) {
            h.z(e0.e(this.stepSize, ")", e0.i("minSeparation(", minSeparation, ") must be greater or equal and a multiple of stepSize(", this.stepSize, ") when using stepSize(")));
        }
    }

    private void validateStepSize() {
        if (this.stepSize <= 0.0f || valueLandsOnTick(this.valueTo)) {
            return;
        }
        h.z(e0.e(this.valueTo, ") range", e0.i("The stepSize(", this.stepSize, ") must be 0, or a factor of the valueFrom(", this.valueFrom, ")-valueTo(")));
    }

    private void validateValueFrom() {
        float f14 = this.valueFrom;
        if (f14 < this.valueTo) {
            return;
        }
        h.z(j.l("valueFrom(", f14, ") must be smaller than valueTo(", this.valueTo, ")"));
    }

    private void validateValueTo() {
        float f14 = this.valueTo;
        if (f14 > this.valueFrom) {
            return;
        }
        h.z(j.l("valueTo(", f14, ") must be greater than valueFrom(", this.valueFrom, ")"));
    }

    private void validateValues() {
        for (Float f14 : this.values) {
            if (f14.floatValue() < this.valueFrom || f14.floatValue() > this.valueTo) {
                float f15 = this.valueFrom;
                float f16 = this.valueTo;
                StringBuilder sb3 = new StringBuilder("Slider value(");
                sb3.append(f14);
                sb3.append(") must be greater or equal to valueFrom(");
                sb3.append(f15);
                sb3.append("), and lower or equal to valueTo(");
                h.z(e0.e(f16, ")", sb3));
                return;
            }
            if (this.stepSize > 0.0f && !valueLandsOnTick(f14.floatValue())) {
                throw new IllegalStateException("Value(" + f14 + ") must be equal to valueFrom(" + this.valueFrom + ") plus a multiple of stepSize(" + this.stepSize + ") when using stepSize(" + this.stepSize + ")");
            }
        }
    }

    private boolean valueLandsOnTick(float f14) {
        return isMultipleOfStepSize(new BigDecimal(Float.toString(f14)).subtract(new BigDecimal(Float.toString(this.valueFrom)), MathContext.DECIMAL64).doubleValue());
    }

    private float valueToX(float f14) {
        return (normalizeValue(f14) * this.trackWidth) + this.trackSidePadding;
    }

    private void warnAboutFloatingPointError() {
        float f14 = this.stepSize;
        if (f14 == 0.0f) {
            return;
        }
        if (((int) f14) != f14) {
            StringBuilder sb3 = new StringBuilder("Floating point value used for stepSize(");
            sb3.append(f14);
            sb3.append("). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
        }
        float f15 = this.valueFrom;
        if (((int) f15) != f15) {
            StringBuilder sb4 = new StringBuilder("Floating point value used for valueFrom(");
            sb4.append(f15);
            sb4.append("). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
        }
        float f16 = this.valueTo;
        if (((int) f16) != f16) {
            StringBuilder sb5 = new StringBuilder("Floating point value used for valueTo(");
            sb5.append(f16);
            sb5.append("). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
        }
    }

    public void addOnChangeListener(L l14) {
        this.changeListeners.add(l14);
    }

    public void addOnSliderTouchListener(T t7) {
        this.touchListeners.add(t7);
    }

    public void clearOnChangeListeners() {
        this.changeListeners.clear();
    }

    public void clearOnSliderTouchListeners() {
        this.touchListeners.clear();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.accessibilityHelper.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.inactiveTrackPaint.setColor(getColorForState(this.trackColorInactive));
        this.activeTrackPaint.setColor(getColorForState(this.trackColorActive));
        this.inactiveTicksPaint.setColor(getColorForState(this.tickColorInactive));
        this.activeTicksPaint.setColor(getColorForState(this.tickColorActive));
        this.stopIndicatorPaint.setColor(getColorForState(this.trackColorActive));
        for (TooltipDrawable tooltipDrawable : this.labels) {
            if (tooltipDrawable.isStateful()) {
                tooltipDrawable.setState(getDrawableState());
            }
        }
        if (this.defaultThumbDrawable.isStateful()) {
            this.defaultThumbDrawable.setState(getDrawableState());
        }
        this.haloPaint.setColor(getColorForState(this.haloColor));
        this.haloPaint.setAlpha(63);
    }

    public void forceDrawCompatHalo(boolean z14) {
        this.forceDrawCompatHalo = z14;
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.accessibilityHelper.getAccessibilityFocusedVirtualViewId();
    }

    public int getActiveThumbIndex() {
        return this.activeThumbIdx;
    }

    public int getFocusedThumbIndex() {
        return this.focusedThumbIdx;
    }

    public int getHaloRadius() {
        return this.haloRadius;
    }

    public ColorStateList getHaloTintList() {
        return this.haloColor;
    }

    public int getLabelBehavior() {
        return this.labelBehavior;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.stepSize;
    }

    public float getThumbElevation() {
        return this.defaultThumbDrawable.getElevation();
    }

    public int getThumbHeight() {
        return this.thumbHeight;
    }

    public int getThumbRadius() {
        return this.thumbWidth / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.defaultThumbDrawable.getStrokeColor();
    }

    public float getThumbStrokeWidth() {
        return this.defaultThumbDrawable.getStrokeWidth();
    }

    public ColorStateList getThumbTintList() {
        return this.defaultThumbDrawable.getFillColor();
    }

    public int getThumbTrackGapSize() {
        return this.thumbTrackGapSize;
    }

    public int getThumbWidth() {
        return this.thumbWidth;
    }

    public int getTickActiveRadius() {
        return this.tickActiveRadius;
    }

    public ColorStateList getTickActiveTintList() {
        return this.tickColorActive;
    }

    public int getTickInactiveRadius() {
        return this.tickInactiveRadius;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.tickColorInactive;
    }

    public ColorStateList getTickTintList() {
        if (this.tickColorInactive.equals(this.tickColorActive)) {
            return this.tickColorActive;
        }
        h.z("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
        return null;
    }

    public ColorStateList getTrackActiveTintList() {
        return this.trackColorActive;
    }

    public int getTrackHeight() {
        return this.trackHeight;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.trackColorInactive;
    }

    public int getTrackInsideCornerSize() {
        return this.trackInsideCornerSize;
    }

    public int getTrackSidePadding() {
        return this.trackSidePadding;
    }

    public int getTrackStopIndicatorSize() {
        return this.trackStopIndicatorSize;
    }

    public ColorStateList getTrackTintList() {
        if (this.trackColorInactive.equals(this.trackColorActive)) {
            return this.trackColorActive;
        }
        h.z("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
        return null;
    }

    public int getTrackWidth() {
        return this.trackWidth;
    }

    public float getValueFrom() {
        return this.valueFrom;
    }

    public float getValueTo() {
        return this.valueTo;
    }

    public List<Float> getValues() {
        return new ArrayList(this.values);
    }

    public boolean hasLabelFormatter() {
        return this.formatter != null;
    }

    public final boolean isRtl() {
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        return getLayoutDirection() == 1;
    }

    public boolean isTickVisible() {
        return this.tickVisible;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.onScrollChangedListener);
        Iterator<TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            attachLabelToContentView(it.next());
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender = this.accessibilityEventSender;
        if (accessibilityEventSender != null) {
            removeCallbacks(accessibilityEventSender);
        }
        this.labelsAreAnimatedIn = false;
        Iterator<TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            detachLabelFromContentView(it.next());
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.onScrollChangedListener);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.dirtyConfig) {
            validateConfigurationIfDirty();
            maybeCalculateTicksCoordinates();
        }
        super.onDraw(canvas);
        int iCalculateTrackCenter = calculateTrackCenter();
        float fFloatValue = this.values.get(0).floatValue();
        float fFloatValue2 = ((Float) j.f(1, this.values)).floatValue();
        if (fFloatValue2 < this.valueTo || (this.values.size() > 1 && fFloatValue > this.valueFrom)) {
            drawInactiveTrack(canvas, this.trackWidth, iCalculateTrackCenter);
        }
        if (fFloatValue2 > this.valueFrom) {
            drawActiveTrack(canvas, this.trackWidth, iCalculateTrackCenter);
        }
        maybeDrawTicks(canvas);
        maybeDrawStopIndicator(canvas, iCalculateTrackCenter);
        if ((this.thumbIsPressed || isFocused()) && isEnabled()) {
            maybeDrawCompatHalo(canvas, this.trackWidth, iCalculateTrackCenter);
        }
        updateLabels();
        drawThumbs(canvas, this.trackWidth, iCalculateTrackCenter);
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z14, int i14, Rect rect) {
        super.onFocusChanged(z14, i14, rect);
        if (z14) {
            focusThumbOnFocusGained(i14);
            this.accessibilityHelper.requestKeyboardFocusForVirtualView(this.focusedThumbIdx);
        } else {
            this.activeThumbIdx = -1;
            this.accessibilityHelper.clearKeyboardFocusForVirtualView(this.focusedThumbIdx);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i14, KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i14, keyEvent);
        }
        if (this.values.size() == 1) {
            this.activeThumbIdx = 0;
        }
        if (this.activeThumbIdx == -1) {
            Boolean boolOnKeyDownNoActiveThumb = onKeyDownNoActiveThumb(i14, keyEvent);
            return boolOnKeyDownNoActiveThumb != null ? boolOnKeyDownNoActiveThumb.booleanValue() : super.onKeyDown(i14, keyEvent);
        }
        this.isLongPress |= keyEvent.isLongPress();
        Float fCalculateIncrementForKey = calculateIncrementForKey(i14);
        if (fCalculateIncrementForKey != null) {
            if (snapActiveThumbToValue(fCalculateIncrementForKey.floatValue() + this.values.get(this.activeThumbIdx).floatValue())) {
                updateHaloHotspot();
                postInvalidate();
            }
            return true;
        }
        if (i14 != 23) {
            if (i14 == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return moveFocus(1);
                }
                if (keyEvent.isShiftPressed()) {
                    return moveFocus(-1);
                }
                return false;
            }
            if (i14 != 66) {
                return super.onKeyDown(i14, keyEvent);
            }
        }
        this.activeThumbIdx = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i14, KeyEvent keyEvent) {
        this.isLongPress = false;
        return super.onKeyUp(i14, keyEvent);
    }

    @Override // android.view.View
    public void onMeasure(int i14, int i15) {
        super.onMeasure(i14, View.MeasureSpec.makeMeasureSpec(this.widgetHeight + ((this.labelBehavior == 1 || shouldAlwaysShowLabel()) ? this.labels.get(0).getIntrinsicHeight() : 0), 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.valueFrom = sliderState.valueFrom;
        this.valueTo = sliderState.valueTo;
        setValuesInternal(sliderState.values);
        this.stepSize = sliderState.stepSize;
        if (sliderState.hasFocus) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.valueFrom = this.valueFrom;
        sliderState.valueTo = this.valueTo;
        sliderState.values = new ArrayList<>(this.values);
        sliderState.stepSize = this.stepSize;
        sliderState.hasFocus = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i14, int i15, int i16, int i17) {
        updateTrackWidth(i14);
        updateHaloHotspot();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b5  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        int i14;
        if (!isEnabled()) {
            return false;
        }
        float x14 = motionEvent.getX();
        float f14 = (x14 - this.trackSidePadding) / this.trackWidth;
        this.touchPosition = f14;
        float fMax = Math.max(0.0f, f14);
        this.touchPosition = fMax;
        this.touchPosition = Math.min(1.0f, fMax);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.touchDownX = x14;
            if (!isPotentialVerticalScroll(motionEvent)) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (pickActiveThumb()) {
                    requestFocus();
                    this.thumbIsPressed = true;
                    snapTouchPosition();
                    updateHaloHotspot();
                    if (hasGapBetweenThumbAndTrack()) {
                        int i15 = this.thumbWidth;
                        this.defaultThumbWidth = i15;
                        this.defaultThumbTrackGapSize = this.thumbTrackGapSize;
                        int iRound = Math.round(i15 * THUMB_WIDTH_PRESSED_RATIO);
                        int i16 = this.thumbWidth - iRound;
                        setThumbWidth(iRound);
                        setThumbTrackGapSize(this.thumbTrackGapSize - (i16 / 2));
                    }
                    invalidate();
                    onStartTrackingTouch();
                }
            }
        } else if (actionMasked == 1) {
            this.thumbIsPressed = false;
            motionEvent2 = this.lastEvent;
            if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.lastEvent.getX() - motionEvent.getX()) <= this.scaledTouchSlop && Math.abs(this.lastEvent.getY() - motionEvent.getY()) <= this.scaledTouchSlop && pickActiveThumb()) {
                onStartTrackingTouch();
            }
            if (this.activeThumbIdx != -1) {
                snapTouchPosition();
                updateHaloHotspot();
                if (hasGapBetweenThumbAndTrack() && (i14 = this.defaultThumbWidth) != -1 && this.defaultThumbTrackGapSize != -1) {
                    setThumbWidth(i14);
                    setThumbTrackGapSize(this.defaultThumbTrackGapSize);
                }
                this.activeThumbIdx = -1;
                onStopTrackingTouch();
            }
            invalidate();
        } else if (actionMasked == 2) {
            if (!this.thumbIsPressed) {
                if (isPotentialVerticalScroll(motionEvent) && Math.abs(x14 - this.touchDownX) < this.scaledTouchSlop) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                onStartTrackingTouch();
            }
            if (pickActiveThumb()) {
                this.thumbIsPressed = true;
                snapTouchPosition();
                updateHaloHotspot();
                invalidate();
            }
        } else if (actionMasked == 3) {
            this.thumbIsPressed = false;
            motionEvent2 = this.lastEvent;
            if (motionEvent2 != null) {
                onStartTrackingTouch();
            }
            if (this.activeThumbIdx != -1) {
                snapTouchPosition();
                updateHaloHotspot();
                if (hasGapBetweenThumbAndTrack()) {
                    setThumbWidth(i14);
                    setThumbTrackGapSize(this.defaultThumbTrackGapSize);
                }
                this.activeThumbIdx = -1;
                onStopTrackingTouch();
            }
            invalidate();
        }
        setPressed(this.thumbIsPressed);
        this.lastEvent = MotionEvent.obtain(motionEvent);
        return true;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view2, int i14) {
        ViewOverlayImpl contentViewOverlay;
        super.onVisibilityChanged(view2, i14);
        if (i14 == 0 || (contentViewOverlay = ViewUtils.getContentViewOverlay(this)) == null) {
            return;
        }
        Iterator<TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            contentViewOverlay.remove(it.next());
        }
    }

    public boolean pickActiveThumb() {
        if (this.activeThumbIdx != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float fValueToX = valueToX(valueOfTouchPositionAbsolute);
        this.activeThumbIdx = 0;
        float fAbs = Math.abs(this.values.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i14 = 1; i14 < this.values.size(); i14++) {
            float fAbs2 = Math.abs(this.values.get(i14).floatValue() - valueOfTouchPositionAbsolute);
            float fValueToX2 = valueToX(this.values.get(i14).floatValue());
            if (Float.compare(fAbs2, fAbs) > 0) {
                break;
            }
            boolean z14 = !isRtl() ? fValueToX2 - fValueToX >= 0.0f : fValueToX2 - fValueToX <= 0.0f;
            if (Float.compare(fAbs2, fAbs) < 0) {
                this.activeThumbIdx = i14;
            } else {
                if (Float.compare(fAbs2, fAbs) != 0) {
                    continue;
                } else {
                    if (Math.abs(fValueToX2 - fValueToX) < this.scaledTouchSlop) {
                        this.activeThumbIdx = -1;
                        return false;
                    }
                    if (z14) {
                        this.activeThumbIdx = i14;
                    }
                }
            }
            fAbs = fAbs2;
        }
        return this.activeThumbIdx != -1;
    }

    public void removeOnChangeListener(L l14) {
        this.changeListeners.remove(l14);
    }

    public void removeOnSliderTouchListener(T t7) {
        this.touchListeners.remove(t7);
    }

    public void setActiveThumbIndex(int i14) {
        this.activeThumbIdx = i14;
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        this.customThumbDrawable = initializeCustomThumbDrawable(drawable);
        this.customThumbDrawablesForValues.clear();
        postInvalidate();
    }

    public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        this.customThumbDrawable = null;
        this.customThumbDrawablesForValues = new ArrayList();
        for (Drawable drawable : drawableArr) {
            this.customThumbDrawablesForValues.add(initializeCustomThumbDrawable(drawable));
        }
        postInvalidate();
    }

    @Override // android.view.View
    public void setEnabled(boolean z14) {
        super.setEnabled(z14);
        setLayerType(z14 ? 0 : 2, null);
    }

    public void setFocusedThumbIndex(int i14) {
        if (i14 < 0 || i14 >= this.values.size()) {
            h.s("index out of range");
            return;
        }
        this.focusedThumbIdx = i14;
        this.accessibilityHelper.requestKeyboardFocusForVirtualView(i14);
        postInvalidate();
    }

    public void setHaloRadius(int i14) {
        if (i14 == this.haloRadius) {
            return;
        }
        this.haloRadius = i14;
        Drawable background = getBackground();
        if (shouldDrawCompatHalo() || !(background instanceof RippleDrawable)) {
            postInvalidate();
        } else {
            DrawableUtils.setRippleDrawableRadius((RippleDrawable) background, this.haloRadius);
        }
    }

    public void setHaloRadiusResource(int i14) {
        setHaloRadius(getResources().getDimensionPixelSize(i14));
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.haloColor)) {
            return;
        }
        this.haloColor = colorStateList;
        Drawable background = getBackground();
        if (!shouldDrawCompatHalo() && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        this.haloPaint.setColor(getColorForState(colorStateList));
        this.haloPaint.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i14) {
        if (this.labelBehavior != i14) {
            this.labelBehavior = i14;
            requestLayout();
        }
    }

    public void setLabelFormatter(LabelFormatter labelFormatter) {
        this.formatter = labelFormatter;
    }

    public void setSeparationUnit(int i14) {
        this.separationUnit = i14;
        this.dirtyConfig = true;
        postInvalidate();
    }

    public void setStepSize(float f14) {
        if (f14 < 0.0f) {
            h.s(e0.e(this.valueTo, ") range", e0.i("The stepSize(", f14, ") must be 0, or a factor of the valueFrom(", this.valueFrom, ")-valueTo(")));
        } else if (this.stepSize != f14) {
            this.stepSize = f14;
            this.dirtyConfig = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f14) {
        this.defaultThumbDrawable.setElevation(f14);
    }

    public void setThumbElevationResource(int i14) {
        setThumbElevation(getResources().getDimension(i14));
    }

    public void setThumbHeight(int i14) {
        if (i14 == this.thumbHeight) {
            return;
        }
        this.thumbHeight = i14;
        this.defaultThumbDrawable.setBounds(0, 0, this.thumbWidth, i14);
        Drawable drawable = this.customThumbDrawable;
        if (drawable != null) {
            adjustCustomThumbDrawableBounds(drawable);
        }
        Iterator<Drawable> it = this.customThumbDrawablesForValues.iterator();
        while (it.hasNext()) {
            adjustCustomThumbDrawableBounds(it.next());
        }
        updateWidgetLayout();
    }

    public void setThumbHeightResource(int i14) {
        setThumbHeight(getResources().getDimensionPixelSize(i14));
    }

    public void setThumbRadius(int i14) {
        int i15 = i14 * 2;
        setThumbWidth(i15);
        setThumbHeight(i15);
    }

    public void setThumbRadiusResource(int i14) {
        setThumbRadius(getResources().getDimensionPixelSize(i14));
    }

    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.defaultThumbDrawable.setStrokeColor(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i14) {
        if (i14 != 0) {
            setThumbStrokeColor(b.getColorStateList(getContext(), i14));
        }
    }

    public void setThumbStrokeWidth(float f14) {
        this.defaultThumbDrawable.setStrokeWidth(f14);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i14) {
        if (i14 != 0) {
            setThumbStrokeWidth(getResources().getDimension(i14));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.defaultThumbDrawable.getFillColor())) {
            return;
        }
        this.defaultThumbDrawable.setFillColor(colorStateList);
        invalidate();
    }

    public void setThumbTrackGapSize(int i14) {
        if (this.thumbTrackGapSize == i14) {
            return;
        }
        this.thumbTrackGapSize = i14;
        invalidate();
    }

    public void setThumbWidth(int i14) {
        if (i14 == this.thumbWidth) {
            return;
        }
        this.thumbWidth = i14;
        this.defaultThumbDrawable.setShapeAppearanceModel(ShapeAppearanceModel.builder().setAllCorners(0, this.thumbWidth / 2.0f).build());
        this.defaultThumbDrawable.setBounds(0, 0, this.thumbWidth, this.thumbHeight);
        Drawable drawable = this.customThumbDrawable;
        if (drawable != null) {
            adjustCustomThumbDrawableBounds(drawable);
        }
        Iterator<Drawable> it = this.customThumbDrawablesForValues.iterator();
        while (it.hasNext()) {
            adjustCustomThumbDrawableBounds(it.next());
        }
        updateWidgetLayout();
    }

    public void setThumbWidthResource(int i14) {
        setThumbWidth(getResources().getDimensionPixelSize(i14));
    }

    public void setTickActiveRadius(int i14) {
        if (this.tickActiveRadius != i14) {
            this.tickActiveRadius = i14;
            this.activeTicksPaint.setStrokeWidth(i14 * 2);
            updateWidgetLayout();
        }
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.tickColorActive)) {
            return;
        }
        this.tickColorActive = colorStateList;
        this.activeTicksPaint.setColor(getColorForState(colorStateList));
        invalidate();
    }

    public void setTickInactiveRadius(int i14) {
        if (this.tickInactiveRadius != i14) {
            this.tickInactiveRadius = i14;
            this.inactiveTicksPaint.setStrokeWidth(i14 * 2);
            updateWidgetLayout();
        }
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.tickColorInactive)) {
            return;
        }
        this.tickColorInactive = colorStateList;
        this.inactiveTicksPaint.setColor(getColorForState(colorStateList));
        invalidate();
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z14) {
        if (this.tickVisible != z14) {
            this.tickVisible = z14;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.trackColorActive)) {
            return;
        }
        this.trackColorActive = colorStateList;
        this.activeTrackPaint.setColor(getColorForState(colorStateList));
        this.stopIndicatorPaint.setColor(getColorForState(this.trackColorActive));
        invalidate();
    }

    public void setTrackHeight(int i14) {
        if (this.trackHeight != i14) {
            this.trackHeight = i14;
            invalidateTrack();
            updateWidgetLayout();
        }
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.trackColorInactive)) {
            return;
        }
        this.trackColorInactive = colorStateList;
        this.inactiveTrackPaint.setColor(getColorForState(colorStateList));
        invalidate();
    }

    public void setTrackInsideCornerSize(int i14) {
        if (this.trackInsideCornerSize == i14) {
            return;
        }
        this.trackInsideCornerSize = i14;
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i14) {
        if (this.trackStopIndicatorSize == i14) {
            return;
        }
        this.trackStopIndicatorSize = i14;
        this.stopIndicatorPaint.setStrokeWidth(i14);
        invalidate();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f14) {
        this.valueFrom = f14;
        this.dirtyConfig = true;
        postInvalidate();
    }

    public void setValueTo(float f14) {
        this.valueTo = f14;
        this.dirtyConfig = true;
        postInvalidate();
    }

    public void setValues(Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    public void updateBoundsForVirtualViewId(int i14, Rect rect) {
        int iNormalizeValue = this.trackSidePadding + ((int) (normalizeValue(getValues().get(i14).floatValue()) * this.trackWidth));
        int iCalculateTrackCenter = calculateTrackCenter();
        int iMax = Math.max(this.thumbWidth / 2, this.minTouchTargetSize / 2);
        int iMax2 = Math.max(this.thumbHeight / 2, this.minTouchTargetSize / 2);
        rect.set(iNormalizeValue - iMax, iCalculateTrackCenter - iMax2, iNormalizeValue + iMax, iCalculateTrackCenter + iMax2);
    }

    public void setValues(List<Float> list) {
        setValuesInternal(new ArrayList<>(list));
    }

    public void setCustomThumbDrawable(int i14) {
        setCustomThumbDrawable(getResources().getDrawable(i14));
    }

    private float calculateStepIncrement() {
        float f14 = this.stepSize;
        if (f14 == 0.0f) {
            return 1.0f;
        }
        return f14;
    }

    public void setCustomThumbDrawablesForValues(int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i14 = 0; i14 < iArr.length; i14++) {
            drawableArr[i14] = getResources().getDrawable(iArr[i14]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new Parcelable.Creator<SliderState>() { // from class: com.google.android.material.slider.BaseSlider.SliderState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SliderState createFromParcel(Parcel parcel) {
                return new SliderState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SliderState[] newArray(int i14) {
                return new SliderState[i14];
            }
        };
        boolean hasFocus;
        float stepSize;
        float valueFrom;
        float valueTo;
        ArrayList<Float> values;

        private SliderState(Parcel parcel) {
            super(parcel);
            this.valueFrom = parcel.readFloat();
            this.valueTo = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.values = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.stepSize = parcel.readFloat();
            this.hasFocus = parcel.createBooleanArray()[0];
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i14) {
            super.writeToParcel(parcel, i14);
            parcel.writeFloat(this.valueFrom);
            parcel.writeFloat(this.valueTo);
            parcel.writeList(this.values);
            parcel.writeFloat(this.stepSize);
            parcel.writeBooleanArray(new boolean[]{this.hasFocus});
        }

        public SliderState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public BaseSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.sliderStyle);
    }

    public BaseSlider(Context context) {
        this(context, null);
    }
}
