package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;
import android.widget.ToggleButton;
import androidx.core.content.ContextCompat;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.run.activity.RunPlanCreateActivity;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ibe {
    public static void a(final View view, final View view2, final RunPlanCreateActivity.OnNextPageListener onNextPageListener, final boolean z) {
        if (view == null || view2 == null || onNextPageListener == null) {
            LogUtil.j("Suggestion_PlanViewDynamicEffectHelper", "panUpView layoutBubbles/answerBubbles/listener is null.");
            return;
        }
        view2.setVisibility(0);
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 1.0f, 2, 0.0f);
        translateAnimation.setDuration(250L);
        translateAnimation.setFillAfter(true);
        translateAnimation.setRepeatCount(0);
        translateAnimation.setRepeatMode(2);
        AlphaAnimation alphaAnimation = new AlphaAnimation(-1.0f, 1.0f);
        alphaAnimation.setDuration(250L);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setRepeatCount(0);
        alphaAnimation.setRepeatMode(2);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        view2.startAnimation(animationSet);
        view2.postDelayed(new Runnable() { // from class: ibe.1
            @Override // java.lang.Runnable
            public void run() {
                ibe.e(view, view2, onNextPageListener, z);
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(final View view, final View view2, final RunPlanCreateActivity.OnNextPageListener onNextPageListener, final boolean z) {
        if (view == null || view2 == null || onNextPageListener == null) {
            LogUtil.j("Suggestion_PlanViewDynamicEffectHelper", "upGone layoutBubbles/answerBubbles/listener is null.");
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 0.0f, 2, -1.0f);
        translateAnimation.setDuration(250L);
        translateAnimation.setFillAfter(true);
        translateAnimation.setRepeatCount(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, -1.0f);
        alphaAnimation.setDuration(250L);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setRepeatCount(0);
        alphaAnimation.setRepeatMode(2);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        view.startAnimation(animationSet);
        translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: ibe.3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                view.setVisibility(8);
                view.clearAnimation();
                view2.setVisibility(8);
                view2.clearAnimation();
                onNextPageListener.nextPage(z);
            }
        });
    }

    public static void a(boolean z, List<View> list) {
        if (njy.e(list)) {
            LogUtil.j("Suggestion_PlanViewDynamicEffectHelper", "fadeView viewList is null.");
            return;
        }
        for (View view : list) {
            if (view != null) {
                view.setVisibility(0);
            }
        }
        AnimationSet animationSetB = b(z, list);
        for (View view2 : list) {
            if (view2 != null) {
                view2.startAnimation(animationSetB);
            }
        }
    }

    private static AnimationSet b(boolean z, List<View> list) {
        AlphaAnimation alphaAnimation;
        if (z) {
            alphaAnimation = new AlphaAnimation(-1.0f, 1.0f);
        } else {
            alphaAnimation = new AlphaAnimation(1.0f, -1.0f);
        }
        alphaAnimation.setDuration(250L);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setRepeatCount(0);
        alphaAnimation.setRepeatMode(2);
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 1.0f, 2, 0.0f);
        translateAnimation.setDuration(250L);
        translateAnimation.setFillAfter(true);
        translateAnimation.setRepeatCount(0);
        translateAnimation.setRepeatMode(2);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        b(z, list, alphaAnimation);
        return animationSet;
    }

    private static void b(final boolean z, final List<View> list, AlphaAnimation alphaAnimation) {
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: ibe.5
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                for (View view : list) {
                    if (view != null) {
                        if (z) {
                            view.setVisibility(0);
                        } else {
                            view.setVisibility(8);
                        }
                        view.clearAnimation();
                    }
                }
            }
        });
    }

    public static void d(Context context, ToggleButton toggleButton, int i, int i2) {
        if (toggleButton == null) {
            LogUtil.e("Suggestion_PlanViewDynamicEffectHelper", "setSelectedBtnStyle button is null.");
            return;
        }
        if (i == 0) {
            i = R.drawable.train_date_selected_bg;
        }
        toggleButton.setBackground(ContextCompat.getDrawable(context, i));
        if (i2 == 0) {
            i2 = R.color.textColorPrimaryInverse;
        }
        toggleButton.setTextColor(ContextCompat.getColor(context, i2));
    }

    public static void c(Context context, ToggleButton toggleButton, int i, int i2) {
        if (toggleButton == null) {
            LogUtil.e("Suggestion_PlanViewDynamicEffectHelper", "setDefaultBtnStyle button is null.");
            return;
        }
        if (i == 0) {
            i = R.drawable.train_date_unselect_bg;
        }
        toggleButton.setBackground(ContextCompat.getDrawable(context, i));
        if (i2 == 0) {
            i2 = R.color.textColorPrimary;
        }
        toggleButton.setTextColor(ContextCompat.getColor(context, i2));
    }

    public static void b(final View view, final View view2, final View view3, final View view4, final int i) {
        if (view == null || view2 == null || view3 == null) {
            LogUtil.e("Suggestion_PlanViewDynamicEffectHelper", "setSpringViewHeight view , layoutTips or layoutBody is null.");
        } else {
            final View viewFindViewById = view.findViewById(R.id.spring_view);
            viewFindViewById.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ibe.4
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    int height;
                    int i2;
                    if (view3.getHeight() > 0) {
                        if (view4 == null) {
                            height = view3.getHeight();
                            i2 = i;
                        } else {
                            height = view3.getHeight() + view4.getHeight();
                            i2 = i;
                        }
                        int iMax = Math.max(view.getHeight() - (height + i2), view2.getHeight());
                        viewFindViewById.setLayoutParams(new RelativeLayout.LayoutParams(-1, iMax));
                        if (iMax > 0) {
                            ((HealthScrollView) view.findViewById(R.id.scroll_view)).setOverScrollable(false);
                        }
                    }
                }
            });
        }
    }
}
