package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.g1;
import androidx.core.view.s0;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.google.android.material.animation.ChildrenAlphaProperty;
import com.google.android.material.animation.DrawableAlphaProperty;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.animation.MotionTiming;
import com.google.android.material.animation.Positioning;
import com.google.android.material.circularreveal.CircularRevealCompat;
import com.google.android.material.circularreveal.CircularRevealHelper;
import com.google.android.material.circularreveal.CircularRevealWidget;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.math.MathUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    private float dependencyOriginalTranslationX;
    private float dependencyOriginalTranslationY;
    private final int[] tmpArray;
    private final Rect tmpRect;
    private final RectF tmpRectF1;
    private final RectF tmpRectF2;

    public static class FabTransformationSpec {
        public Positioning positioning;
        public MotionSpec timings;
    }

    public FabTransformationBehavior() {
        this.tmpRect = new Rect();
        this.tmpRectF1 = new RectF();
        this.tmpRectF2 = new RectF();
        this.tmpArray = new int[2];
    }

    private ViewGroup calculateChildContentContainer(View view2) {
        View viewFindViewById = view2.findViewById(R.id.mtrl_child_content_container);
        if (viewFindViewById != null) {
            return toViewGroupOrNull(viewFindViewById);
        }
        return ((view2 instanceof TransformationChildLayout) || (view2 instanceof TransformationChildCard)) ? toViewGroupOrNull(((ViewGroup) view2).getChildAt(0)) : toViewGroupOrNull(view2);
    }

    private void calculateChildVisibleBoundsAtEndOfExpansion(View view2, FabTransformationSpec fabTransformationSpec, MotionTiming motionTiming, MotionTiming motionTiming2, float f14, float f15, float f16, float f17, RectF rectF) {
        float fCalculateValueOfAnimationAtEndOfExpansion = calculateValueOfAnimationAtEndOfExpansion(fabTransformationSpec, motionTiming, f14, f16);
        float fCalculateValueOfAnimationAtEndOfExpansion2 = calculateValueOfAnimationAtEndOfExpansion(fabTransformationSpec, motionTiming2, f15, f17);
        Rect rect = this.tmpRect;
        view2.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.tmpRectF1;
        rectF2.set(rect);
        RectF rectF3 = this.tmpRectF2;
        calculateWindowBounds(view2, rectF3);
        rectF3.offset(fCalculateValueOfAnimationAtEndOfExpansion, fCalculateValueOfAnimationAtEndOfExpansion2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private void calculateDependencyWindowBounds(View view2, RectF rectF) {
        calculateWindowBounds(view2, rectF);
        rectF.offset(this.dependencyOriginalTranslationX, this.dependencyOriginalTranslationY);
    }

    private Pair<MotionTiming, MotionTiming> calculateMotionTiming(float f14, float f15, boolean z14, FabTransformationSpec fabTransformationSpec) {
        MotionTiming timing;
        MotionTiming timing2;
        if (f14 == 0.0f || f15 == 0.0f) {
            timing = fabTransformationSpec.timings.getTiming("translationXLinear");
            timing2 = fabTransformationSpec.timings.getTiming("translationYLinear");
        } else if ((!z14 || f15 >= 0.0f) && (z14 || f15 <= 0.0f)) {
            timing = fabTransformationSpec.timings.getTiming("translationXCurveDownwards");
            timing2 = fabTransformationSpec.timings.getTiming("translationYCurveDownwards");
        } else {
            timing = fabTransformationSpec.timings.getTiming("translationXCurveUpwards");
            timing2 = fabTransformationSpec.timings.getTiming("translationYCurveUpwards");
        }
        return new Pair<>(timing, timing2);
    }

    private float calculateRevealCenterX(View view2, View view3, Positioning positioning) {
        RectF rectF = this.tmpRectF1;
        RectF rectF2 = this.tmpRectF2;
        calculateDependencyWindowBounds(view2, rectF);
        calculateWindowBounds(view3, rectF2);
        rectF2.offset(-calculateTranslationX(view2, view3, positioning), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private float calculateRevealCenterY(View view2, View view3, Positioning positioning) {
        RectF rectF = this.tmpRectF1;
        RectF rectF2 = this.tmpRectF2;
        calculateDependencyWindowBounds(view2, rectF);
        calculateWindowBounds(view3, rectF2);
        rectF2.offset(0.0f, -calculateTranslationY(view2, view3, positioning));
        return rectF.centerY() - rectF2.top;
    }

    private float calculateTranslationX(View view2, View view3, Positioning positioning) {
        float fCenterX;
        float fCenterX2;
        float f14;
        RectF rectF = this.tmpRectF1;
        RectF rectF2 = this.tmpRectF2;
        calculateDependencyWindowBounds(view2, rectF);
        calculateWindowBounds(view3, rectF2);
        int i14 = positioning.gravity & 7;
        if (i14 == 1) {
            fCenterX = rectF2.centerX();
            fCenterX2 = rectF.centerX();
        } else {
            if (i14 != 3) {
                if (i14 != 5) {
                    f14 = 0.0f;
                } else {
                    fCenterX = rectF2.right;
                    fCenterX2 = rectF.right;
                }
                return f14 + positioning.xAdjustment;
            }
            fCenterX = rectF2.left;
            fCenterX2 = rectF.left;
        }
        f14 = fCenterX - fCenterX2;
        return f14 + positioning.xAdjustment;
    }

    private float calculateTranslationY(View view2, View view3, Positioning positioning) {
        float fCenterY;
        float fCenterY2;
        float f14;
        RectF rectF = this.tmpRectF1;
        RectF rectF2 = this.tmpRectF2;
        calculateDependencyWindowBounds(view2, rectF);
        calculateWindowBounds(view3, rectF2);
        int i14 = positioning.gravity & 112;
        if (i14 == 16) {
            fCenterY = rectF2.centerY();
            fCenterY2 = rectF.centerY();
        } else {
            if (i14 != 48) {
                if (i14 != 80) {
                    f14 = 0.0f;
                } else {
                    fCenterY = rectF2.bottom;
                    fCenterY2 = rectF.bottom;
                }
                return f14 + positioning.yAdjustment;
            }
            fCenterY = rectF2.top;
            fCenterY2 = rectF.top;
        }
        f14 = fCenterY - fCenterY2;
        return f14 + positioning.yAdjustment;
    }

    private float calculateValueOfAnimationAtEndOfExpansion(FabTransformationSpec fabTransformationSpec, MotionTiming motionTiming, float f14, float f15) {
        long delay = motionTiming.getDelay();
        long duration = motionTiming.getDuration();
        MotionTiming timing = fabTransformationSpec.timings.getTiming("expansion");
        return AnimationUtils.lerp(f14, f15, motionTiming.getInterpolator().getInterpolation((((timing.getDuration() + timing.getDelay()) + 17) - delay) / duration));
    }

    private void calculateWindowBounds(View view2, RectF rectF) {
        rectF.set(0.0f, 0.0f, view2.getWidth(), view2.getHeight());
        int[] iArr = this.tmpArray;
        view2.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view2.getTranslationX()), (int) (-view2.getTranslationY()));
    }

    private void createChildrenFadeAnimation(View view2, View view3, boolean z14, boolean z15, FabTransformationSpec fabTransformationSpec, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup viewGroupCalculateChildContentContainer;
        ObjectAnimator objectAnimatorOfFloat;
        if (view3 instanceof ViewGroup) {
            if (((view3 instanceof CircularRevealWidget) && CircularRevealHelper.STRATEGY == 0) || (viewGroupCalculateChildContentContainer = calculateChildContentContainer(view3)) == null) {
                return;
            }
            if (z14) {
                if (!z15) {
                    ChildrenAlphaProperty.CHILDREN_ALPHA.set(viewGroupCalculateChildContentContainer, Float.valueOf(0.0f));
                }
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupCalculateChildContentContainer, ChildrenAlphaProperty.CHILDREN_ALPHA, 1.0f);
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupCalculateChildContentContainer, ChildrenAlphaProperty.CHILDREN_ALPHA, 0.0f);
            }
            fabTransformationSpec.timings.getTiming("contentFade").apply(objectAnimatorOfFloat);
            list.add(objectAnimatorOfFloat);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void createColorAnimation(View view2, View view3, boolean z14, boolean z15, FabTransformationSpec fabTransformationSpec, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfInt;
        if (view3 instanceof CircularRevealWidget) {
            CircularRevealWidget circularRevealWidget = (CircularRevealWidget) view3;
            int backgroundTint = getBackgroundTint(view2);
            int i14 = 16777215 & backgroundTint;
            if (z14) {
                if (!z15) {
                    circularRevealWidget.setCircularRevealScrimColor(backgroundTint);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(circularRevealWidget, CircularRevealWidget.CircularRevealScrimColorProperty.CIRCULAR_REVEAL_SCRIM_COLOR, i14);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(circularRevealWidget, CircularRevealWidget.CircularRevealScrimColorProperty.CIRCULAR_REVEAL_SCRIM_COLOR, backgroundTint);
            }
            objectAnimatorOfInt.setEvaluator(ArgbEvaluatorCompat.getInstance());
            fabTransformationSpec.timings.getTiming(TtmlNode.ATTR_TTS_COLOR).apply(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
        }
    }

    private void createDependencyTranslationAnimation(View view2, View view3, boolean z14, FabTransformationSpec fabTransformationSpec, List<Animator> list) {
        float fCalculateTranslationX = calculateTranslationX(view2, view3, fabTransformationSpec.positioning);
        float fCalculateTranslationY = calculateTranslationY(view2, view3, fabTransformationSpec.positioning);
        Pair<MotionTiming, MotionTiming> pairCalculateMotionTiming = calculateMotionTiming(fCalculateTranslationX, fCalculateTranslationY, z14, fabTransformationSpec);
        MotionTiming motionTiming = (MotionTiming) pairCalculateMotionTiming.first;
        MotionTiming motionTiming2 = (MotionTiming) pairCalculateMotionTiming.second;
        Property property = View.TRANSLATION_X;
        if (!z14) {
            fCalculateTranslationX = this.dependencyOriginalTranslationX;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, fCalculateTranslationX);
        Property property2 = View.TRANSLATION_Y;
        if (!z14) {
            fCalculateTranslationY = this.dependencyOriginalTranslationY;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property2, fCalculateTranslationY);
        motionTiming.apply(objectAnimatorOfFloat);
        motionTiming2.apply(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    @TargetApi(21)
    private void createElevationAnimation(View view2, View view3, boolean z14, boolean z15, FabTransformationSpec fabTransformationSpec, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfFloat;
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        float elevation = view3.getElevation() - view2.getElevation();
        if (z14) {
            if (!z15) {
                view3.setTranslationZ(-elevation);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.TRANSLATION_Z, -elevation);
        }
        fabTransformationSpec.timings.getTiming("elevation").apply(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void createExpansionAnimation(View view2, View view3, boolean z14, boolean z15, FabTransformationSpec fabTransformationSpec, float f14, float f15, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animatorCreateCircularReveal;
        if (view3 instanceof CircularRevealWidget) {
            final CircularRevealWidget circularRevealWidget = (CircularRevealWidget) view3;
            float fCalculateRevealCenterX = calculateRevealCenterX(view2, view3, fabTransformationSpec.positioning);
            float fCalculateRevealCenterY = calculateRevealCenterY(view2, view3, fabTransformationSpec.positioning);
            ((FloatingActionButton) view2).getContentRect(this.tmpRect);
            float fWidth = this.tmpRect.width() / 2.0f;
            MotionTiming timing = fabTransformationSpec.timings.getTiming("expansion");
            if (z14) {
                if (!z15) {
                    circularRevealWidget.setRevealInfo(new CircularRevealWidget.RevealInfo(fCalculateRevealCenterX, fCalculateRevealCenterY, fWidth));
                }
                if (z15) {
                    fWidth = circularRevealWidget.getRevealInfo().radius;
                }
                animatorCreateCircularReveal = CircularRevealCompat.createCircularReveal(circularRevealWidget, fCalculateRevealCenterX, fCalculateRevealCenterY, MathUtils.distanceToFurthestCorner(fCalculateRevealCenterX, fCalculateRevealCenterY, 0.0f, 0.0f, f14, f15));
                animatorCreateCircularReveal.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.FabTransformationBehavior.4
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        CircularRevealWidget.RevealInfo revealInfo = circularRevealWidget.getRevealInfo();
                        revealInfo.radius = Float.MAX_VALUE;
                        circularRevealWidget.setRevealInfo(revealInfo);
                    }
                });
                createPreFillRadialExpansion(view3, timing.getDelay(), (int) fCalculateRevealCenterX, (int) fCalculateRevealCenterY, fWidth, list);
            } else {
                float f16 = circularRevealWidget.getRevealInfo().radius;
                Animator animatorCreateCircularReveal2 = CircularRevealCompat.createCircularReveal(circularRevealWidget, fCalculateRevealCenterX, fCalculateRevealCenterY, fWidth);
                int i14 = (int) fCalculateRevealCenterX;
                int i15 = (int) fCalculateRevealCenterY;
                createPreFillRadialExpansion(view3, timing.getDelay(), i14, i15, f16, list);
                createPostFillRadialExpansion(view3, timing.getDelay(), timing.getDuration(), fabTransformationSpec.timings.getTotalDuration(), i14, i15, fWidth, list);
                animatorCreateCircularReveal = animatorCreateCircularReveal2;
            }
            timing.apply(animatorCreateCircularReveal);
            list.add(animatorCreateCircularReveal);
            list2.add(CircularRevealCompat.createCircularRevealListener(circularRevealWidget));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void createIconFadeAnimation(View view2, final View view3, boolean z14, boolean z15, FabTransformationSpec fabTransformationSpec, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfInt;
        if ((view3 instanceof CircularRevealWidget) && (view2 instanceof ImageView)) {
            final CircularRevealWidget circularRevealWidget = (CircularRevealWidget) view3;
            final Drawable drawable = ((ImageView) view2).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z14) {
                if (!z15) {
                    drawable.setAlpha(255);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT, 0);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT, 255);
            }
            objectAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.transformation.FabTransformationBehavior.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    view3.invalidate();
                }
            });
            fabTransformationSpec.timings.getTiming("iconFade").apply(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
            list2.add(new AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.FabTransformationBehavior.3
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    circularRevealWidget.setCircularRevealOverlayDrawable(null);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    circularRevealWidget.setCircularRevealOverlayDrawable(drawable);
                }
            });
        }
    }

    private void createPostFillRadialExpansion(View view2, long j8, long j14, long j15, int i14, int i15, float f14, List<Animator> list) {
        long j16 = j8 + j14;
        if (j16 < j15) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view2, i14, i15, f14, f14);
            animatorCreateCircularReveal.setStartDelay(j16);
            animatorCreateCircularReveal.setDuration(j15 - j16);
            list.add(animatorCreateCircularReveal);
        }
    }

    private void createPreFillRadialExpansion(View view2, long j8, int i14, int i15, float f14, List<Animator> list) {
        if (j8 > 0) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view2, i14, i15, f14, f14);
            animatorCreateCircularReveal.setStartDelay(0L);
            animatorCreateCircularReveal.setDuration(j8);
            list.add(animatorCreateCircularReveal);
        }
    }

    private void createTranslationAnimation(View view2, View view3, boolean z14, boolean z15, FabTransformationSpec fabTransformationSpec, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        MotionTiming motionTiming;
        MotionTiming motionTiming2;
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        float fCalculateTranslationX = calculateTranslationX(view2, view3, fabTransformationSpec.positioning);
        float fCalculateTranslationY = calculateTranslationY(view2, view3, fabTransformationSpec.positioning);
        Pair<MotionTiming, MotionTiming> pairCalculateMotionTiming = calculateMotionTiming(fCalculateTranslationX, fCalculateTranslationY, z14, fabTransformationSpec);
        MotionTiming motionTiming3 = (MotionTiming) pairCalculateMotionTiming.first;
        MotionTiming motionTiming4 = (MotionTiming) pairCalculateMotionTiming.second;
        if (z14) {
            if (!z15) {
                view3.setTranslationX(-fCalculateTranslationX);
                view3.setTranslationY(-fCalculateTranslationY);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            motionTiming = motionTiming4;
            motionTiming2 = motionTiming3;
            calculateChildVisibleBoundsAtEndOfExpansion(view3, fabTransformationSpec, motionTiming2, motionTiming, -fCalculateTranslationX, -fCalculateTranslationY, 0.0f, 0.0f, rectF);
        } else {
            motionTiming = motionTiming4;
            motionTiming2 = motionTiming3;
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.TRANSLATION_X, -fCalculateTranslationX);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.TRANSLATION_Y, -fCalculateTranslationY);
        }
        motionTiming2.apply(objectAnimatorOfFloat);
        motionTiming.apply(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    private int getBackgroundTint(View view2) {
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        ColorStateList backgroundTintList = view2.getBackgroundTintList();
        if (backgroundTintList != null) {
            return backgroundTintList.getColorForState(view2.getDrawableState(), backgroundTintList.getDefaultColor());
        }
        return 0;
    }

    private ViewGroup toViewGroupOrNull(View view2) {
        if (view2 instanceof ViewGroup) {
            return (ViewGroup) view2;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view2, View view3) {
        if (view2.getVisibility() == 8) {
            h.z("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
            return false;
        }
        if (!(view3 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view3).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view2.getId();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onAttachedToLayoutParams(CoordinatorLayout.f fVar) {
        if (fVar.f6357h == 0) {
            fVar.f6357h = 80;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public AnimatorSet onCreateExpandedStateChangeAnimation(final View view2, final View view3, final boolean z14, boolean z15) {
        FabTransformationSpec fabTransformationSpecOnCreateMotionSpec = onCreateMotionSpec(view3.getContext(), z14);
        if (z14) {
            this.dependencyOriginalTranslationX = view2.getTranslationX();
            this.dependencyOriginalTranslationY = view2.getTranslationY();
        }
        List<Animator> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        createElevationAnimation(view2, view3, z14, z15, fabTransformationSpecOnCreateMotionSpec, arrayList, arrayList2);
        RectF rectF = this.tmpRectF1;
        createTranslationAnimation(view2, view3, z14, z15, fabTransformationSpecOnCreateMotionSpec, arrayList, arrayList2, rectF);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        createDependencyTranslationAnimation(view2, view3, z14, fabTransformationSpecOnCreateMotionSpec, arrayList);
        createIconFadeAnimation(view2, view3, z14, z15, fabTransformationSpecOnCreateMotionSpec, arrayList, arrayList2);
        createExpansionAnimation(view2, view3, z14, z15, fabTransformationSpecOnCreateMotionSpec, fWidth, fHeight, arrayList, arrayList2);
        createColorAnimation(view2, view3, z14, z15, fabTransformationSpecOnCreateMotionSpec, arrayList, arrayList2);
        createChildrenFadeAnimation(view2, view3, z14, z15, fabTransformationSpecOnCreateMotionSpec, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.FabTransformationBehavior.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (z14) {
                    return;
                }
                view3.setVisibility(4);
                view2.setAlpha(1.0f);
                view2.setVisibility(0);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if (z14) {
                    view3.setVisibility(0);
                    view2.setAlpha(0.0f);
                    view2.setVisibility(4);
                }
            }
        });
        int size = arrayList2.size();
        for (int i14 = 0; i14 < size; i14++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i14));
        }
        return animatorSet;
    }

    public abstract FabTransformationSpec onCreateMotionSpec(Context context, boolean z14);

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.tmpRect = new Rect();
        this.tmpRectF1 = new RectF();
        this.tmpRectF2 = new RectF();
        this.tmpArray = new int[2];
    }
}
