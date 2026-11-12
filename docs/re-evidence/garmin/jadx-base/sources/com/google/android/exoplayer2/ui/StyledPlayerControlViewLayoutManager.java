package com.google.android.exoplayer2.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
final class StyledPlayerControlViewLayoutManager {
    private static final long ANIMATION_INTERVAL_MS = 2000;
    private static final long DURATION_FOR_HIDING_ANIMATION_MS = 250;
    private static final long DURATION_FOR_SHOWING_ANIMATION_MS = 250;
    private static final int UX_STATE_ALL_VISIBLE = 0;
    private static final int UX_STATE_ANIMATING_HIDE = 3;
    private static final int UX_STATE_ANIMATING_SHOW = 4;
    private static final int UX_STATE_NONE_VISIBLE = 2;
    private static final int UX_STATE_ONLY_PROGRESS_VISIBLE = 1;
    private final ViewGroup basicControls;
    private final ViewGroup bottomBar;
    private final ViewGroup centerControls;
    private final View controlsBackground;
    private final ViewGroup extraControls;
    private final ViewGroup extraControlsScrollView;
    private final AnimatorSet hideAllBarsAnimator;
    private final Runnable hideAllBarsRunnable;
    private final AnimatorSet hideMainBarAnimator;
    private final AnimatorSet hideProgressBarAnimator;
    private boolean isMinimalMode;
    private final ViewGroup minimalControls;
    private boolean needToShowBars;
    private final View.OnLayoutChangeListener onLayoutChangeListener;
    private final ValueAnimator overflowHideAnimator;
    private final ValueAnimator overflowShowAnimator;
    private final View overflowShowButton;
    private final StyledPlayerControlView playerControlView;
    private final AnimatorSet showAllBarsAnimator;
    private final Runnable showAllBarsRunnable;
    private final AnimatorSet showMainBarAnimator;
    private final View timeBar;
    private final ViewGroup timeView;
    private final Runnable hideProgressBarRunnable = new i(this, 4);
    private final Runnable hideMainBarRunnable = new i(this, 5);
    private final Runnable hideControllerRunnable = new i(this, 6);
    private boolean animationEnabled = true;
    private int uxState = 0;
    private final List<View> shownButtons = new ArrayList();

    public StyledPlayerControlViewLayoutManager(final StyledPlayerControlView styledPlayerControlView) {
        this.playerControlView = styledPlayerControlView;
        int i14 = 0;
        this.showAllBarsRunnable = new i(this, i14);
        int i15 = 3;
        this.hideAllBarsRunnable = new i(this, i15);
        this.onLayoutChangeListener = new k(this, i14);
        int i16 = 1;
        this.controlsBackground = styledPlayerControlView.findViewById(R.id.exo_controls_background);
        this.centerControls = (ViewGroup) styledPlayerControlView.findViewById(R.id.exo_center_controls);
        this.minimalControls = (ViewGroup) styledPlayerControlView.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) styledPlayerControlView.findViewById(R.id.exo_bottom_bar);
        this.bottomBar = viewGroup;
        this.timeView = (ViewGroup) styledPlayerControlView.findViewById(R.id.exo_time);
        View viewFindViewById = styledPlayerControlView.findViewById(R.id.exo_progress);
        this.timeBar = viewFindViewById;
        this.basicControls = (ViewGroup) styledPlayerControlView.findViewById(R.id.exo_basic_controls);
        this.extraControls = (ViewGroup) styledPlayerControlView.findViewById(R.id.exo_extra_controls);
        this.extraControlsScrollView = (ViewGroup) styledPlayerControlView.findViewById(R.id.exo_extra_controls_scroll_view);
        View viewFindViewById2 = styledPlayerControlView.findViewById(R.id.exo_overflow_show);
        this.overflowShowButton = viewFindViewById2;
        View viewFindViewById3 = styledPlayerControlView.findViewById(R.id.exo_overflow_hide);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new f(this, i15));
            viewFindViewById3.setOnClickListener(new f(this, i15));
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new j(this, i15));
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (StyledPlayerControlViewLayoutManager.this.controlsBackground != null) {
                    StyledPlayerControlViewLayoutManager.this.controlsBackground.setVisibility(4);
                }
                if (StyledPlayerControlViewLayoutManager.this.centerControls != null) {
                    StyledPlayerControlViewLayoutManager.this.centerControls.setVisibility(4);
                }
                if (StyledPlayerControlViewLayoutManager.this.minimalControls != null) {
                    StyledPlayerControlViewLayoutManager.this.minimalControls.setVisibility(4);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if (!(StyledPlayerControlViewLayoutManager.this.timeBar instanceof DefaultTimeBar) || StyledPlayerControlViewLayoutManager.this.isMinimalMode) {
                    return;
                }
                ((DefaultTimeBar) StyledPlayerControlViewLayoutManager.this.timeBar).hideScrubber(250L);
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new j(this, i14));
        valueAnimatorOfFloat2.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if (StyledPlayerControlViewLayoutManager.this.controlsBackground != null) {
                    StyledPlayerControlViewLayoutManager.this.controlsBackground.setVisibility(0);
                }
                if (StyledPlayerControlViewLayoutManager.this.centerControls != null) {
                    StyledPlayerControlViewLayoutManager.this.centerControls.setVisibility(0);
                }
                if (StyledPlayerControlViewLayoutManager.this.minimalControls != null) {
                    StyledPlayerControlViewLayoutManager.this.minimalControls.setVisibility(StyledPlayerControlViewLayoutManager.this.isMinimalMode ? 0 : 4);
                }
                if (!(StyledPlayerControlViewLayoutManager.this.timeBar instanceof DefaultTimeBar) || StyledPlayerControlViewLayoutManager.this.isMinimalMode) {
                    return;
                }
                ((DefaultTimeBar) StyledPlayerControlViewLayoutManager.this.timeBar).showScrubber(250L);
            }
        });
        Resources resources = styledPlayerControlView.getResources();
        int i17 = R.dimen.exo_styled_bottom_bar_height;
        float dimension = resources.getDimension(i17) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(i17);
        AnimatorSet animatorSet = new AnimatorSet();
        this.hideMainBarAnimator = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                StyledPlayerControlViewLayoutManager.this.setUxState(1);
                if (StyledPlayerControlViewLayoutManager.this.needToShowBars) {
                    styledPlayerControlView.post(StyledPlayerControlViewLayoutManager.this.showAllBarsRunnable);
                    StyledPlayerControlViewLayoutManager.this.needToShowBars = false;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                StyledPlayerControlViewLayoutManager.this.setUxState(3);
            }
        });
        animatorSet.play(valueAnimatorOfFloat).with(ofTranslationY(0.0f, dimension, viewFindViewById)).with(ofTranslationY(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.hideProgressBarAnimator = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                StyledPlayerControlViewLayoutManager.this.setUxState(2);
                if (StyledPlayerControlViewLayoutManager.this.needToShowBars) {
                    styledPlayerControlView.post(StyledPlayerControlViewLayoutManager.this.showAllBarsRunnable);
                    StyledPlayerControlViewLayoutManager.this.needToShowBars = false;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                StyledPlayerControlViewLayoutManager.this.setUxState(3);
            }
        });
        animatorSet2.play(ofTranslationY(dimension, dimension2, viewFindViewById)).with(ofTranslationY(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.hideAllBarsAnimator = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                StyledPlayerControlViewLayoutManager.this.setUxState(2);
                if (StyledPlayerControlViewLayoutManager.this.needToShowBars) {
                    styledPlayerControlView.post(StyledPlayerControlViewLayoutManager.this.showAllBarsRunnable);
                    StyledPlayerControlViewLayoutManager.this.needToShowBars = false;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                StyledPlayerControlViewLayoutManager.this.setUxState(3);
            }
        });
        animatorSet3.play(valueAnimatorOfFloat).with(ofTranslationY(0.0f, dimension2, viewFindViewById)).with(ofTranslationY(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.showMainBarAnimator = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                StyledPlayerControlViewLayoutManager.this.setUxState(0);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                StyledPlayerControlViewLayoutManager.this.setUxState(4);
            }
        });
        animatorSet4.play(valueAnimatorOfFloat2).with(ofTranslationY(dimension, 0.0f, viewFindViewById)).with(ofTranslationY(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.showAllBarsAnimator = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.7
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                StyledPlayerControlViewLayoutManager.this.setUxState(0);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                StyledPlayerControlViewLayoutManager.this.setUxState(4);
            }
        });
        animatorSet5.play(valueAnimatorOfFloat2).with(ofTranslationY(dimension2, 0.0f, viewFindViewById)).with(ofTranslationY(dimension2, 0.0f, viewGroup));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.overflowShowAnimator = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new j(this, i16));
        valueAnimatorOfFloat3.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.8
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (StyledPlayerControlViewLayoutManager.this.basicControls != null) {
                    StyledPlayerControlViewLayoutManager.this.basicControls.setVisibility(4);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if (StyledPlayerControlViewLayoutManager.this.extraControlsScrollView != null) {
                    StyledPlayerControlViewLayoutManager.this.extraControlsScrollView.setVisibility(0);
                    StyledPlayerControlViewLayoutManager.this.extraControlsScrollView.setTranslationX(StyledPlayerControlViewLayoutManager.this.extraControlsScrollView.getWidth());
                    StyledPlayerControlViewLayoutManager.this.extraControlsScrollView.scrollTo(StyledPlayerControlViewLayoutManager.this.extraControlsScrollView.getWidth(), 0);
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.overflowHideAnimator = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new j(this, 2));
        valueAnimatorOfFloat4.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.9
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (StyledPlayerControlViewLayoutManager.this.extraControlsScrollView != null) {
                    StyledPlayerControlViewLayoutManager.this.extraControlsScrollView.setVisibility(4);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if (StyledPlayerControlViewLayoutManager.this.basicControls != null) {
                    StyledPlayerControlViewLayoutManager.this.basicControls.setVisibility(0);
                }
            }
        });
    }

    private void animateOverflow(float f14) {
        ViewGroup viewGroup = this.extraControlsScrollView;
        if (viewGroup != null) {
            this.extraControlsScrollView.setTranslationX((int) ((1.0f - f14) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.timeView;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f14);
        }
        ViewGroup viewGroup3 = this.basicControls;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f14);
        }
    }

    private static int getHeightWithMargins(View view2) {
        if (view2 == null) {
            return 0;
        }
        int height = view2.getHeight();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return height;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + height;
    }

    private static int getWidthWithMargins(View view2) {
        if (view2 == null) {
            return 0;
        }
        int width = view2.getWidth();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + width;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideAllBars() {
        this.hideAllBarsAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideController() {
        setUxState(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideMainBar() {
        this.hideMainBarAnimator.start();
        postDelayedRunnable(this.hideProgressBarRunnable, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideProgressBar() {
        this.hideProgressBarAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view2 = this.controlsBackground;
        if (view2 != null) {
            view2.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = this.centerControls;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = this.minimalControls;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view2 = this.controlsBackground;
        if (view2 != null) {
            view2.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = this.centerControls;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = this.minimalControls;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(ValueAnimator valueAnimator) {
        animateOverflow(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3(ValueAnimator valueAnimator) {
        animateOverflow(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private static ObjectAnimator ofTranslationY(float f14, float f15, View view2) {
        return ObjectAnimator.ofFloat(view2, "translationY", f14, f15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLayoutChange(View view2, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25) {
        boolean zUseMinimalMode = useMinimalMode();
        if (this.isMinimalMode != zUseMinimalMode) {
            this.isMinimalMode = zUseMinimalMode;
            view2.post(new i(this, 1));
        }
        boolean z14 = i16 - i14 != i24 - i18;
        if (this.isMinimalMode || !z14) {
            return;
        }
        view2.post(new i(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLayoutWidthChanged() {
        int i14;
        if (this.basicControls == null || this.extraControls == null) {
            return;
        }
        int width = (this.playerControlView.getWidth() - this.playerControlView.getPaddingLeft()) - this.playerControlView.getPaddingRight();
        while (true) {
            if (this.extraControls.getChildCount() <= 1) {
                break;
            }
            int childCount = this.extraControls.getChildCount() - 2;
            View childAt = this.extraControls.getChildAt(childCount);
            this.extraControls.removeViewAt(childCount);
            this.basicControls.addView(childAt, 0);
        }
        View view2 = this.overflowShowButton;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        int widthWithMargins = getWidthWithMargins(this.timeView);
        int childCount2 = this.basicControls.getChildCount() - 1;
        for (int i15 = 0; i15 < childCount2; i15++) {
            widthWithMargins += getWidthWithMargins(this.basicControls.getChildAt(i15));
        }
        if (widthWithMargins <= width) {
            ViewGroup viewGroup = this.extraControlsScrollView;
            if (viewGroup == null || viewGroup.getVisibility() != 0 || this.overflowHideAnimator.isStarted()) {
                return;
            }
            this.overflowShowAnimator.cancel();
            this.overflowHideAnimator.start();
            return;
        }
        View view3 = this.overflowShowButton;
        if (view3 != null) {
            view3.setVisibility(0);
            widthWithMargins += getWidthWithMargins(this.overflowShowButton);
        }
        ArrayList arrayList = new ArrayList();
        for (int i16 = 0; i16 < childCount2; i16++) {
            View childAt2 = this.basicControls.getChildAt(i16);
            widthWithMargins -= getWidthWithMargins(childAt2);
            arrayList.add(childAt2);
            if (widthWithMargins <= width) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.basicControls.removeViews(0, arrayList.size());
        for (i14 = 0; i14 < arrayList.size(); i14++) {
            this.extraControls.addView((View) arrayList.get(i14), this.extraControls.getChildCount() - 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onOverflowButtonClick(View view2) {
        resetHideCallbacks();
        if (view2.getId() == R.id.exo_overflow_show) {
            this.overflowShowAnimator.start();
        } else if (view2.getId() == R.id.exo_overflow_hide) {
            this.overflowHideAnimator.start();
        }
    }

    private void postDelayedRunnable(Runnable runnable, long j8) {
        if (j8 >= 0) {
            this.playerControlView.postDelayed(runnable, j8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUxState(int i14) {
        int i15 = this.uxState;
        this.uxState = i14;
        if (i14 == 2) {
            this.playerControlView.setVisibility(8);
        } else if (i15 == 2) {
            this.playerControlView.setVisibility(0);
        }
        if (i15 != i14) {
            this.playerControlView.notifyOnVisibilityChange();
        }
    }

    private boolean shouldHideInMinimalMode(View view2) {
        int id3 = view2.getId();
        return id3 == R.id.exo_bottom_bar || id3 == R.id.exo_prev || id3 == R.id.exo_next || id3 == R.id.exo_rew || id3 == R.id.exo_rew_with_amount || id3 == R.id.exo_ffwd || id3 == R.id.exo_ffwd_with_amount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showAllBars() {
        if (!this.animationEnabled) {
            setUxState(0);
            resetHideCallbacks();
            return;
        }
        int i14 = this.uxState;
        if (i14 == 1) {
            this.showMainBarAnimator.start();
        } else if (i14 == 2) {
            this.showAllBarsAnimator.start();
        } else if (i14 == 3) {
            this.needToShowBars = true;
        } else if (i14 == 4) {
            return;
        }
        resetHideCallbacks();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLayoutForSizeChange() {
        ViewGroup viewGroup = this.minimalControls;
        if (viewGroup != null) {
            viewGroup.setVisibility(this.isMinimalMode ? 0 : 4);
        }
        View view2 = this.timeBar;
        if (view2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int dimensionPixelSize = this.playerControlView.getResources().getDimensionPixelSize(R.dimen.exo_styled_progress_margin_bottom);
            if (this.isMinimalMode) {
                dimensionPixelSize = 0;
            }
            marginLayoutParams.bottomMargin = dimensionPixelSize;
            this.timeBar.setLayoutParams(marginLayoutParams);
            View view3 = this.timeBar;
            if (view3 instanceof DefaultTimeBar) {
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view3;
                if (this.isMinimalMode) {
                    defaultTimeBar.hideScrubber(true);
                } else {
                    int i14 = this.uxState;
                    if (i14 == 1) {
                        defaultTimeBar.hideScrubber(false);
                    } else if (i14 != 3) {
                        defaultTimeBar.showScrubber();
                    }
                }
            }
        }
        for (View view4 : this.shownButtons) {
            view4.setVisibility((this.isMinimalMode && shouldHideInMinimalMode(view4)) ? 4 : 0);
        }
    }

    private boolean useMinimalMode() {
        int paddingRight;
        int paddingBottom;
        int width = (this.playerControlView.getWidth() - this.playerControlView.getPaddingLeft()) - this.playerControlView.getPaddingRight();
        int height = (this.playerControlView.getHeight() - this.playerControlView.getPaddingBottom()) - this.playerControlView.getPaddingTop();
        int widthWithMargins = getWidthWithMargins(this.centerControls);
        ViewGroup viewGroup = this.centerControls;
        if (viewGroup != null) {
            paddingRight = this.centerControls.getPaddingRight() + viewGroup.getPaddingLeft();
        } else {
            paddingRight = 0;
        }
        int i14 = widthWithMargins - paddingRight;
        int heightWithMargins = getHeightWithMargins(this.centerControls);
        ViewGroup viewGroup2 = this.centerControls;
        if (viewGroup2 != null) {
            paddingBottom = this.centerControls.getPaddingBottom() + viewGroup2.getPaddingTop();
        } else {
            paddingBottom = 0;
        }
        return width <= Math.max(i14, getWidthWithMargins(this.timeView) + getWidthWithMargins(this.overflowShowButton)) || height <= (getHeightWithMargins(this.bottomBar) * 2) + (heightWithMargins - paddingBottom);
    }

    public boolean getShowButton(View view2) {
        return view2 != null && this.shownButtons.contains(view2);
    }

    public void hide() {
        int i14 = this.uxState;
        if (i14 == 3 || i14 == 2) {
            return;
        }
        removeHideCallbacks();
        if (!this.animationEnabled) {
            hideController();
        } else if (this.uxState == 1) {
            hideProgressBar();
        } else {
            hideAllBars();
        }
    }

    public void hideImmediately() {
        int i14 = this.uxState;
        if (i14 == 3 || i14 == 2) {
            return;
        }
        removeHideCallbacks();
        hideController();
    }

    public boolean isAnimationEnabled() {
        return this.animationEnabled;
    }

    public boolean isFullyVisible() {
        return this.uxState == 0 && this.playerControlView.isVisible();
    }

    public void onAttachedToWindow() {
        this.playerControlView.addOnLayoutChangeListener(this.onLayoutChangeListener);
    }

    public void onDetachedFromWindow() {
        this.playerControlView.removeOnLayoutChangeListener(this.onLayoutChangeListener);
    }

    public void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        View view2 = this.controlsBackground;
        if (view2 != null) {
            view2.layout(0, 0, i16 - i14, i17 - i15);
        }
    }

    public void removeHideCallbacks() {
        this.playerControlView.removeCallbacks(this.hideControllerRunnable);
        this.playerControlView.removeCallbacks(this.hideAllBarsRunnable);
        this.playerControlView.removeCallbacks(this.hideMainBarRunnable);
        this.playerControlView.removeCallbacks(this.hideProgressBarRunnable);
    }

    public void resetHideCallbacks() {
        if (this.uxState == 3) {
            return;
        }
        removeHideCallbacks();
        int showTimeoutMs = this.playerControlView.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.animationEnabled) {
                postDelayedRunnable(this.hideControllerRunnable, showTimeoutMs);
            } else if (this.uxState == 1) {
                postDelayedRunnable(this.hideProgressBarRunnable, 2000L);
            } else {
                postDelayedRunnable(this.hideMainBarRunnable, showTimeoutMs);
            }
        }
    }

    public void setAnimationEnabled(boolean z14) {
        this.animationEnabled = z14;
    }

    public void setShowButton(View view2, boolean z14) {
        if (view2 == null) {
            return;
        }
        if (!z14) {
            view2.setVisibility(8);
            this.shownButtons.remove(view2);
            return;
        }
        if (this.isMinimalMode && shouldHideInMinimalMode(view2)) {
            view2.setVisibility(4);
        } else {
            view2.setVisibility(0);
        }
        this.shownButtons.add(view2);
    }

    public void show() {
        if (!this.playerControlView.isVisible()) {
            this.playerControlView.setVisibility(0);
            this.playerControlView.updateAll();
            this.playerControlView.requestPlayPauseFocus();
        }
        showAllBars();
    }
}
