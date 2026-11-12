package com.google.android.material.transition.platform;

import am.j;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.g1;
import androidx.core.view.s0;
import com.google.android.material.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.WeakHashMap;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public final class SlideDistanceProvider implements VisibilityAnimatorProvider {
    private static final int DEFAULT_DISTANCE = -1;
    private int slideDistance = -1;
    private int slideEdge;

    @Retention(RetentionPolicy.SOURCE)
    public @interface GravityFlag {
    }

    public SlideDistanceProvider(int i14) {
        this.slideEdge = i14;
    }

    private static Animator createTranslationAppearAnimator(View view2, View view3, int i14, int i15) {
        float translationX = view3.getTranslationX();
        float translationY = view3.getTranslationY();
        if (i14 == 3) {
            return createTranslationXAnimator(view3, i15 + translationX, translationX, translationX);
        }
        if (i14 == 5) {
            return createTranslationXAnimator(view3, translationX - i15, translationX, translationX);
        }
        if (i14 == 48) {
            return createTranslationYAnimator(view3, translationY - i15, translationY, translationY);
        }
        if (i14 == 80) {
            return createTranslationYAnimator(view3, i15 + translationY, translationY, translationY);
        }
        if (i14 == 8388611) {
            return createTranslationXAnimator(view3, isRtl(view2) ? i15 + translationX : translationX - i15, translationX, translationX);
        }
        if (i14 == 8388613) {
            return createTranslationXAnimator(view3, isRtl(view2) ? translationX - i15 : i15 + translationX, translationX, translationX);
        }
        h.s(j.h(i14, "Invalid slide direction: "));
        return null;
    }

    private static Animator createTranslationDisappearAnimator(View view2, View view3, int i14, int i15) {
        float translationX = view3.getTranslationX();
        float translationY = view3.getTranslationY();
        if (i14 == 3) {
            return createTranslationXAnimator(view3, translationX, translationX - i15, translationX);
        }
        if (i14 == 5) {
            return createTranslationXAnimator(view3, translationX, i15 + translationX, translationX);
        }
        if (i14 == 48) {
            return createTranslationYAnimator(view3, translationY, i15 + translationY, translationY);
        }
        if (i14 == 80) {
            return createTranslationYAnimator(view3, translationY, translationY - i15, translationY);
        }
        if (i14 == 8388611) {
            return createTranslationXAnimator(view3, translationX, isRtl(view2) ? translationX - i15 : i15 + translationX, translationX);
        }
        if (i14 == 8388613) {
            return createTranslationXAnimator(view3, translationX, isRtl(view2) ? i15 + translationX : translationX - i15, translationX);
        }
        h.s(j.h(i14, "Invalid slide direction: "));
        return null;
    }

    private static Animator createTranslationXAnimator(final View view2, float f14, float f15, final float f16) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view2, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f14, f15));
        objectAnimatorOfPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transition.platform.SlideDistanceProvider.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view2.setTranslationX(f16);
            }
        });
        return objectAnimatorOfPropertyValuesHolder;
    }

    private static Animator createTranslationYAnimator(final View view2, float f14, float f15, final float f16) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view2, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f14, f15));
        objectAnimatorOfPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transition.platform.SlideDistanceProvider.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view2.setTranslationY(f16);
            }
        });
        return objectAnimatorOfPropertyValuesHolder;
    }

    private int getSlideDistanceOrDefault(Context context) {
        int i14 = this.slideDistance;
        return i14 != -1 ? i14 : context.getResources().getDimensionPixelSize(R.dimen.mtrl_transition_shared_axis_slide_distance);
    }

    private static boolean isRtl(View view2) {
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        return view2.getLayoutDirection() == 1;
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    public Animator createAppear(ViewGroup viewGroup, View view2) {
        return createTranslationAppearAnimator(viewGroup, view2, this.slideEdge, getSlideDistanceOrDefault(view2.getContext()));
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    public Animator createDisappear(ViewGroup viewGroup, View view2) {
        return createTranslationDisappearAnimator(viewGroup, view2, this.slideEdge, getSlideDistanceOrDefault(view2.getContext()));
    }

    public int getSlideDistance() {
        return this.slideDistance;
    }

    public int getSlideEdge() {
        return this.slideEdge;
    }

    public void setSlideDistance(int i14) {
        if (i14 >= 0) {
            this.slideDistance = i14;
        } else {
            h.s("Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead.");
        }
    }

    public void setSlideEdge(int i14) {
        this.slideEdge = i14;
    }
}
