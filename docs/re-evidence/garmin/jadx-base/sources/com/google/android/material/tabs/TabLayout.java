package com.google.android.material.tabs;

import a7.b;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.a1;
import androidx.core.view.d0;
import androidx.core.view.g1;
import androidx.core.view.j;
import androidx.core.view.s0;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import fe.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import k7.e;
import k7.g;
import l7.f;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@ViewPager.e
public class TabLayout extends HorizontalScrollView {
    private static final int ANIMATION_DURATION = 300;
    static final int DEFAULT_GAP_TEXT_ICON = 8;
    private static final int DEFAULT_HEIGHT = 48;
    private static final int DEFAULT_HEIGHT_WITH_TEXT_ICON = 72;
    static final int FIXED_WRAP_GUTTER_MIN = 16;
    public static final int GRAVITY_CENTER = 1;
    public static final int GRAVITY_FILL = 0;
    public static final int GRAVITY_START = 2;
    public static final int INDICATOR_ANIMATION_MODE_ELASTIC = 1;
    public static final int INDICATOR_ANIMATION_MODE_FADE = 2;
    public static final int INDICATOR_ANIMATION_MODE_LINEAR = 0;
    public static final int INDICATOR_GRAVITY_BOTTOM = 0;
    public static final int INDICATOR_GRAVITY_CENTER = 1;
    public static final int INDICATOR_GRAVITY_STRETCH = 3;
    public static final int INDICATOR_GRAVITY_TOP = 2;
    private static final int INVALID_WIDTH = -1;
    private static final String LOG_TAG = "TabLayout";
    public static final int MODE_AUTO = 2;
    public static final int MODE_FIXED = 1;
    public static final int MODE_SCROLLABLE = 0;
    private static final int SELECTED_INDICATOR_HEIGHT_DEFAULT = -1;
    public static final int TAB_LABEL_VISIBILITY_LABELED = 1;
    public static final int TAB_LABEL_VISIBILITY_UNLABELED = 0;
    private static final int TAB_MIN_WIDTH_MARGIN = 56;
    private AdapterChangeListener adapterChangeListener;
    private int contentInsetStart;
    private BaseOnTabSelectedListener currentVpSelectedListener;
    private final int defaultTabTextAppearance;
    int indicatorPosition;
    boolean inlineLabel;
    int mode;
    private TabLayoutOnPageChangeListener pageChangeListener;
    private a pagerAdapter;
    private DataSetObserver pagerAdapterObserver;
    private final int requestedTabMaxWidth;
    private final int requestedTabMinWidth;
    private ValueAnimator scrollAnimator;
    private final int scrollableTabMinWidth;
    private BaseOnTabSelectedListener selectedListener;
    private final ArrayList<BaseOnTabSelectedListener> selectedListeners;
    private Tab selectedTab;
    private int selectedTabTextAppearance;
    float selectedTabTextSize;
    private boolean setupViewPagerImplicitly;
    final SlidingTabIndicator slidingTabIndicator;
    final int tabBackgroundResId;
    int tabGravity;
    ColorStateList tabIconTint;
    PorterDuff.Mode tabIconTintMode;
    int tabIndicatorAnimationDuration;
    int tabIndicatorAnimationMode;
    boolean tabIndicatorFullWidth;
    int tabIndicatorGravity;
    int tabIndicatorHeight;
    private TabIndicatorInterpolator tabIndicatorInterpolator;
    private final TimeInterpolator tabIndicatorTimeInterpolator;
    int tabMaxWidth;
    int tabPaddingBottom;
    int tabPaddingEnd;
    int tabPaddingStart;
    int tabPaddingTop;
    ColorStateList tabRippleColorStateList;
    Drawable tabSelectedIndicator;
    private int tabSelectedIndicatorColor;
    private final int tabTextAppearance;
    ColorStateList tabTextColors;
    float tabTextMultiLineSize;
    float tabTextSize;
    private final e<TabView> tabViewPool;
    private final ArrayList<Tab> tabs;
    boolean unboundedRipple;
    ViewPager viewPager;
    private int viewPagerScrollState;
    private static final int DEF_STYLE_RES = R.style.Widget_Design_TabLayout;
    private static final e<Tab> tabPool = new g(16);

    public class AdapterChangeListener implements ViewPager.i {
        private boolean autoRefresh;

        public AdapterChangeListener() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onAdapterChanged(ViewPager viewPager, a aVar, a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.viewPager == viewPager) {
                tabLayout.setPagerAdapter(aVar2, this.autoRefresh);
            }
        }

        public void setAutoRefresh(boolean z14) {
            this.autoRefresh = z14;
        }
    }

    @Deprecated
    public interface BaseOnTabSelectedListener<T extends Tab> {
        void onTabReselected(T t7);

        void onTabSelected(T t7);

        void onTabUnselected(T t7);
    }

    public @interface LabelVisibility {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public interface OnTabSelectedListener extends BaseOnTabSelectedListener<Tab> {
    }

    public class PagerAdapterObserver extends DataSetObserver {
        public PagerAdapterObserver() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.populateFromPagerAdapter();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.populateFromPagerAdapter();
        }
    }

    public class SlidingTabIndicator extends LinearLayout {
        ValueAnimator indicatorAnimator;
        private int layoutDirection;

        public SlidingTabIndicator(Context context) {
            super(context);
            this.layoutDirection = -1;
            setWillNotDraw(false);
        }

        private void jumpIndicatorToIndicatorPosition() {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.indicatorPosition == -1) {
                tabLayout.indicatorPosition = tabLayout.getSelectedTabPosition();
            }
            jumpIndicatorToPosition(TabLayout.this.indicatorPosition);
        }

        private void jumpIndicatorToPosition(int i14) {
            if (TabLayout.this.viewPagerScrollState == 0 || (TabLayout.this.getTabSelectedIndicator().getBounds().left == -1 && TabLayout.this.getTabSelectedIndicator().getBounds().right == -1)) {
                View childAt = getChildAt(i14);
                TabIndicatorInterpolator tabIndicatorInterpolator = TabLayout.this.tabIndicatorInterpolator;
                TabLayout tabLayout = TabLayout.this;
                tabIndicatorInterpolator.setIndicatorBoundsForTab(tabLayout, childAt, tabLayout.tabSelectedIndicator);
                TabLayout.this.indicatorPosition = i14;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void jumpIndicatorToSelectedPosition() {
            jumpIndicatorToPosition(TabLayout.this.getSelectedTabPosition());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void tweenIndicatorPosition(View view2, View view3, float f14) {
            if (view2 == null || view2.getWidth() <= 0) {
                Drawable drawable = TabLayout.this.tabSelectedIndicator;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.tabSelectedIndicator.getBounds().bottom);
            } else {
                TabIndicatorInterpolator tabIndicatorInterpolator = TabLayout.this.tabIndicatorInterpolator;
                TabLayout tabLayout = TabLayout.this;
                tabIndicatorInterpolator.updateIndicatorForOffset(tabLayout, view2, view3, f14, tabLayout.tabSelectedIndicator);
            }
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            postInvalidateOnAnimation();
        }

        private void updateOrRecreateIndicatorAnimation(boolean z14, int i14, int i15) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.indicatorPosition == i14) {
                return;
            }
            final View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            final View childAt2 = getChildAt(i14);
            if (childAt2 == null) {
                jumpIndicatorToSelectedPosition();
                return;
            }
            TabLayout.this.indicatorPosition = i14;
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.tabs.TabLayout.SlidingTabIndicator.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SlidingTabIndicator.this.tweenIndicatorPosition(childAt, childAt2, valueAnimator.getAnimatedFraction());
                }
            };
            if (!z14) {
                this.indicatorAnimator.removeAllUpdateListeners();
                this.indicatorAnimator.addUpdateListener(animatorUpdateListener);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.indicatorAnimator = valueAnimator;
            valueAnimator.setInterpolator(TabLayout.this.tabIndicatorTimeInterpolator);
            valueAnimator.setDuration(i15);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(animatorUpdateListener);
            valueAnimator.start();
        }

        public void animateIndicatorToPosition(int i14, int i15) {
            ValueAnimator valueAnimator = this.indicatorAnimator;
            if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.indicatorPosition != i14) {
                this.indicatorAnimator.cancel();
            }
            updateOrRecreateIndicatorAnimation(true, i14, i15);
        }

        public boolean childrenNeedLayout() {
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                if (getChildAt(i14).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            int height;
            int iHeight = TabLayout.this.tabSelectedIndicator.getBounds().height();
            if (iHeight < 0) {
                iHeight = TabLayout.this.tabSelectedIndicator.getIntrinsicHeight();
            }
            int i14 = TabLayout.this.tabIndicatorGravity;
            if (i14 == 0) {
                height = getHeight() - iHeight;
                iHeight = getHeight();
            } else if (i14 != 1) {
                height = 0;
                if (i14 != 2) {
                    iHeight = i14 != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - iHeight) / 2;
                iHeight = (getHeight() + iHeight) / 2;
            }
            if (TabLayout.this.tabSelectedIndicator.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.tabSelectedIndicator.getBounds();
                TabLayout.this.tabSelectedIndicator.setBounds(bounds.left, height, bounds.right, iHeight);
                TabLayout.this.tabSelectedIndicator.draw(canvas);
            }
            super.draw(canvas);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
            super.onLayout(z14, i14, i15, i16, i17);
            ValueAnimator valueAnimator = this.indicatorAnimator;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                jumpIndicatorToIndicatorPosition();
            } else {
                updateOrRecreateIndicatorAnimation(false, TabLayout.this.getSelectedTabPosition(), -1);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i14, int i15) {
            super.onMeasure(i14, i15);
            if (View.MeasureSpec.getMode(i14) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z14 = true;
            if (tabLayout.tabGravity == 1 || tabLayout.mode == 2) {
                int childCount = getChildCount();
                int iMax = 0;
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = getChildAt(i16);
                    if (childAt.getVisibility() == 0) {
                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                    }
                }
                if (iMax <= 0) {
                    return;
                }
                if (iMax * childCount <= getMeasuredWidth() - (((int) ViewUtils.dpToPx(getContext(), 16)) * 2)) {
                    boolean z15 = false;
                    for (int i17 = 0; i17 < childCount; i17++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i17).getLayoutParams();
                        if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                            layoutParams.width = iMax;
                            layoutParams.weight = 0.0f;
                            z15 = true;
                        }
                    }
                    z14 = z15;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.tabGravity = 0;
                    tabLayout2.updateTabViews(false);
                }
                if (z14) {
                    super.onMeasure(i14, i15);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i14) {
            super.onRtlPropertiesChanged(i14);
        }

        public void setIndicatorPositionFromTabPosition(int i14, float f14) {
            TabLayout.this.indicatorPosition = Math.round(i14 + f14);
            ValueAnimator valueAnimator = this.indicatorAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.indicatorAnimator.cancel();
            }
            tweenIndicatorPosition(getChildAt(i14), getChildAt(i14 + 1), f14);
        }

        public void setSelectedIndicatorHeight(int i14) {
            Rect bounds = TabLayout.this.tabSelectedIndicator.getBounds();
            TabLayout.this.tabSelectedIndicator.setBounds(bounds.left, 0, bounds.right, i14);
            requestLayout();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TabGravity {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TabIndicatorAnimationMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TabIndicatorGravity {
    }

    public static class TabLayoutOnPageChangeListener implements ViewPager.j {
        private int previousScrollState;
        private int scrollState;
        private final WeakReference<TabLayout> tabLayoutRef;

        public TabLayoutOnPageChangeListener(TabLayout tabLayout) {
            this.tabLayoutRef = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrollStateChanged(int i14) {
            this.previousScrollState = this.scrollState;
            this.scrollState = i14;
            TabLayout tabLayout = this.tabLayoutRef.get();
            if (tabLayout != null) {
                tabLayout.updateViewPagerScrollState(this.scrollState);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i14, float f14, int i15) {
            TabLayout tabLayout = this.tabLayoutRef.get();
            if (tabLayout != null) {
                int i16 = this.scrollState;
                boolean z14 = true;
                if (i16 == 2 && this.previousScrollState != 1) {
                    z14 = false;
                }
                if (i16 == 2 && this.previousScrollState == 0) {
                    z14 = false;
                }
                tabLayout.setScrollPosition(i14, f14, z14, z14, false);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int i14) {
            TabLayout tabLayout = this.tabLayoutRef.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i14 || i14 >= tabLayout.getTabCount()) {
                return;
            }
            int i15 = this.scrollState;
            tabLayout.selectTab(tabLayout.getTabAt(i14), i15 == 0 || (i15 == 2 && this.previousScrollState == 0));
        }

        public void reset() {
            this.scrollState = 0;
            this.previousScrollState = 0;
        }
    }

    public final class TabView extends LinearLayout {
        private View badgeAnchorView;
        private BadgeDrawable badgeDrawable;
        private Drawable baseBackgroundDrawable;
        private ImageView customIconView;
        private TextView customTextView;
        private View customView;
        private int defaultMaxLines;
        private ImageView iconView;
        private Tab tab;
        private TextView textView;

        public TabView(Context context) {
            super(context);
            this.defaultMaxLines = 2;
            updateBackgroundDrawable(context);
            int i14 = TabLayout.this.tabPaddingStart;
            int i15 = TabLayout.this.tabPaddingTop;
            int i16 = TabLayout.this.tabPaddingEnd;
            int i17 = TabLayout.this.tabPaddingBottom;
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            setPaddingRelative(i14, i15, i16, i17);
            setGravity(17);
            setOrientation(!TabLayout.this.inlineLabel ? 1 : 0);
            setClickable(true);
            s0.f.a(this, d0.a(getContext()).f6411a);
        }

        private void addOnLayoutChangeListener(final View view2) {
            if (view2 == null) {
                return;
            }
            view2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.material.tabs.TabLayout.TabView.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view3, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25) {
                    if (view2.getVisibility() == 0) {
                        TabView.this.tryUpdateBadgeDrawableBounds(view2);
                    }
                }
            });
        }

        private float approximateLineWidth(Layout layout, int i14, float f14) {
            return (f14 / layout.getPaint().getTextSize()) * layout.getLineWidth(i14);
        }

        private void clipViewToPaddingForBadge(boolean z14) {
            setClipChildren(z14);
            setClipToPadding(z14);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z14);
                viewGroup.setClipToPadding(z14);
            }
        }

        private FrameLayout createPreApi18BadgeAnchorRoot() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void drawBackground(Canvas canvas) {
            Drawable drawable = this.baseBackgroundDrawable;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.baseBackgroundDrawable.draw(canvas);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public BadgeDrawable getBadge() {
            return this.badgeDrawable;
        }

        private FrameLayout getCustomParentForBadge(View view2) {
            if ((view2 == this.iconView || view2 == this.textView) && BadgeUtils.USE_COMPAT_PARENT) {
                return (FrameLayout) view2.getParent();
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public BadgeDrawable getOrCreateBadge() {
            if (this.badgeDrawable == null) {
                this.badgeDrawable = BadgeDrawable.create(getContext());
            }
            tryUpdateBadgeAnchor();
            BadgeDrawable badgeDrawable = this.badgeDrawable;
            if (badgeDrawable != null) {
                return badgeDrawable;
            }
            h.z("Unable to create badge");
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hasBadgeDrawable() {
            return this.badgeDrawable != null;
        }

        private void inflateAndAddDefaultIconView() {
            ViewGroup viewGroup;
            if (BadgeUtils.USE_COMPAT_PARENT) {
                FrameLayout frameLayoutCreatePreApi18BadgeAnchorRoot = createPreApi18BadgeAnchorRoot();
                addView(frameLayoutCreatePreApi18BadgeAnchorRoot, 0);
                viewGroup = frameLayoutCreatePreApi18BadgeAnchorRoot;
            } else {
                viewGroup = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, viewGroup, false);
            this.iconView = imageView;
            viewGroup.addView(imageView, 0);
        }

        private void inflateAndAddDefaultTextView() {
            ViewGroup viewGroup;
            if (BadgeUtils.USE_COMPAT_PARENT) {
                FrameLayout frameLayoutCreatePreApi18BadgeAnchorRoot = createPreApi18BadgeAnchorRoot();
                addView(frameLayoutCreatePreApi18BadgeAnchorRoot);
                viewGroup = frameLayoutCreatePreApi18BadgeAnchorRoot;
            } else {
                viewGroup = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, viewGroup, false);
            this.textView = textView;
            viewGroup.addView(textView);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeBadge() {
            if (this.badgeAnchorView != null) {
                tryRemoveBadgeFromAnchor();
            }
            this.badgeDrawable = null;
        }

        private void tryAttachBadgeToAnchor(View view2) {
            if (hasBadgeDrawable() && view2 != null) {
                clipViewToPaddingForBadge(false);
                BadgeUtils.attachBadgeDrawable(this.badgeDrawable, view2, getCustomParentForBadge(view2));
                this.badgeAnchorView = view2;
            }
        }

        private void tryRemoveBadgeFromAnchor() {
            if (hasBadgeDrawable()) {
                clipViewToPaddingForBadge(true);
                View view2 = this.badgeAnchorView;
                if (view2 != null) {
                    BadgeUtils.detachBadgeDrawable(this.badgeDrawable, view2);
                    this.badgeAnchorView = null;
                }
            }
        }

        private void tryUpdateBadgeAnchor() {
            Tab tab;
            Tab tab2;
            if (hasBadgeDrawable()) {
                if (this.customView != null) {
                    tryRemoveBadgeFromAnchor();
                    return;
                }
                if (this.iconView != null && (tab2 = this.tab) != null && tab2.getIcon() != null) {
                    View view2 = this.badgeAnchorView;
                    ImageView imageView = this.iconView;
                    if (view2 == imageView) {
                        tryUpdateBadgeDrawableBounds(imageView);
                        return;
                    } else {
                        tryRemoveBadgeFromAnchor();
                        tryAttachBadgeToAnchor(this.iconView);
                        return;
                    }
                }
                if (this.textView == null || (tab = this.tab) == null || tab.getTabLabelVisibility() != 1) {
                    tryRemoveBadgeFromAnchor();
                    return;
                }
                View view3 = this.badgeAnchorView;
                TextView textView = this.textView;
                if (view3 == textView) {
                    tryUpdateBadgeDrawableBounds(textView);
                } else {
                    tryRemoveBadgeFromAnchor();
                    tryAttachBadgeToAnchor(this.textView);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void tryUpdateBadgeDrawableBounds(View view2) {
            if (hasBadgeDrawable() && view2 == this.badgeAnchorView) {
                BadgeUtils.setBadgeDrawableBounds(this.badgeDrawable, view2, getCustomParentForBadge(view2));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateBackgroundDrawable(Context context) {
            GradientDrawable gradientDrawable;
            int i14 = TabLayout.this.tabBackgroundResId;
            if (i14 != 0) {
                Drawable drawableA = j.a.a(context, i14);
                this.baseBackgroundDrawable = drawableA;
                if (drawableA != null && drawableA.isStateful()) {
                    this.baseBackgroundDrawable.setState(getDrawableState());
                }
            } else {
                this.baseBackgroundDrawable = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            Drawable rippleDrawable = gradientDrawable2;
            if (TabLayout.this.tabRippleColorStateList != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList colorStateListConvertToRippleDrawableColor = RippleUtils.convertToRippleDrawableColor(TabLayout.this.tabRippleColorStateList);
                boolean z14 = TabLayout.this.unboundedRipple;
                if (z14) {
                    gradientDrawable = gradientDrawable2;
                    gradientDrawable = null;
                }
                rippleDrawable = new RippleDrawable(colorStateListConvertToRippleDrawableColor, gradientDrawable, z14 ? null : gradientDrawable3);
            }
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            setBackground(rippleDrawable);
            TabLayout.this.invalidate();
        }

        /* JADX WARN: Code duplicated, block: B:27:0x005c  */
        private void updateTextAndIcon(TextView textView, ImageView imageView, boolean z14) {
            boolean z15;
            Tab tab = this.tab;
            Drawable drawableMutate = (tab == null || tab.getIcon() == null) ? null : this.tab.getIcon().mutate();
            if (drawableMutate != null) {
                drawableMutate.setTintList(TabLayout.this.tabIconTint);
                PorterDuff.Mode mode = TabLayout.this.tabIconTintMode;
                if (mode != null) {
                    drawableMutate.setTintMode(mode);
                }
            }
            Tab tab2 = this.tab;
            CharSequence text = tab2 != null ? tab2.getText() : null;
            if (imageView != null) {
                if (drawableMutate != null) {
                    imageView.setImageDrawable(drawableMutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean zIsEmpty = TextUtils.isEmpty(text);
            if (textView != null) {
                if (!zIsEmpty) {
                    z15 = this.tab.labelVisibilityMode == 1;
                }
                textView.setText(!zIsEmpty ? text : null);
                textView.setVisibility(z15 ? 0 : 8);
                if (!zIsEmpty) {
                    setVisibility(0);
                }
            } else {
                z15 = false;
            }
            if (z14 && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int iDpToPx = (z15 && imageView.getVisibility() == 0) ? (int) ViewUtils.dpToPx(getContext(), 8) : 0;
                if (TabLayout.this.inlineLabel) {
                    if (iDpToPx != marginLayoutParams.getMarginEnd()) {
                        marginLayoutParams.setMarginEnd(iDpToPx);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (iDpToPx != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = iDpToPx;
                    marginLayoutParams.setMarginEnd(0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            Tab tab3 = this.tab;
            CharSequence charSequence = tab3 != null ? tab3.contentDesc : null;
            if (zIsEmpty) {
                text = charSequence;
            }
            a1.a(this, text);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.baseBackgroundDrawable;
            if ((drawable == null || !drawable.isStateful()) ? false : this.baseBackgroundDrawable.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public int getContentHeight() {
            View[] viewArr = {this.textView, this.iconView, this.customView};
            int iMax = 0;
            int iMin = 0;
            boolean z14 = false;
            for (int i14 = 0; i14 < 3; i14++) {
                View view2 = viewArr[i14];
                if (view2 != null && view2.getVisibility() == 0) {
                    iMin = z14 ? Math.min(iMin, view2.getTop()) : view2.getTop();
                    iMax = z14 ? Math.max(iMax, view2.getBottom()) : view2.getBottom();
                    z14 = true;
                }
            }
            return iMax - iMin;
        }

        public int getContentWidth() {
            View[] viewArr = {this.textView, this.iconView, this.customView};
            int iMax = 0;
            int iMin = 0;
            boolean z14 = false;
            for (int i14 = 0; i14 < 3; i14++) {
                View view2 = viewArr[i14];
                if (view2 != null && view2.getVisibility() == 0) {
                    iMin = z14 ? Math.min(iMin, view2.getLeft()) : view2.getLeft();
                    iMax = z14 ? Math.max(iMax, view2.getRight()) : view2.getRight();
                    z14 = true;
                }
            }
            return iMax - iMin;
        }

        public Tab getTab() {
            return this.tab;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            f fVarV = f.v(accessibilityNodeInfo);
            BadgeDrawable badgeDrawable = this.badgeDrawable;
            if (badgeDrawable != null && badgeDrawable.isVisible()) {
                fVarV.r(this.badgeDrawable.getContentDescription());
            }
            fVarV.q(f.h.a(0, 1, this.tab.getPosition(), 1, false, isSelected()));
            if (isSelected()) {
                fVarV.o(false);
                fVarV.k(f.a.f110568g);
            }
            fVarV.f110563a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i14, int i15) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i14);
            int mode = View.MeasureSpec.getMode(i14);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i14 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.tabMaxWidth, Integer.MIN_VALUE);
            }
            super.onMeasure(i14, i15);
            if (this.textView != null) {
                float f14 = TabLayout.this.tabTextSize;
                int i16 = this.defaultMaxLines;
                ImageView imageView = this.iconView;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.textView;
                    if (textView != null && textView.getLineCount() > 1) {
                        f14 = TabLayout.this.tabTextMultiLineSize;
                    }
                } else {
                    i16 = 1;
                }
                float textSize = this.textView.getTextSize();
                int lineCount = this.textView.getLineCount();
                int maxLines = this.textView.getMaxLines();
                if (f14 != textSize || (maxLines >= 0 && i16 != maxLines)) {
                    if (TabLayout.this.mode != 1 || f14 <= textSize || lineCount != 1 || ((layout = this.textView.getLayout()) != null && approximateLineWidth(layout, 0, f14) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        this.textView.setTextSize(0, f14);
                        this.textView.setMaxLines(i16);
                        super.onMeasure(i14, i15);
                    }
                }
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.tab == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            this.tab.select();
            return true;
        }

        public void reset() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void setSelected(boolean z14) {
            isSelected();
            super.setSelected(z14);
            TextView textView = this.textView;
            if (textView != null) {
                textView.setSelected(z14);
            }
            ImageView imageView = this.iconView;
            if (imageView != null) {
                imageView.setSelected(z14);
            }
            View view2 = this.customView;
            if (view2 != null) {
                view2.setSelected(z14);
            }
        }

        public void setTab(Tab tab) {
            if (tab != this.tab) {
                this.tab = tab;
                update();
            }
        }

        public final void update() {
            updateTab();
            Tab tab = this.tab;
            setSelected(tab != null && tab.isSelected());
        }

        public final void updateOrientation() {
            setOrientation(!TabLayout.this.inlineLabel ? 1 : 0);
            TextView textView = this.customTextView;
            if (textView == null && this.customIconView == null) {
                updateTextAndIcon(this.textView, this.iconView, true);
            } else {
                updateTextAndIcon(textView, this.customIconView, false);
            }
        }

        public final void updateTab() {
            ViewParent parent;
            Tab tab = this.tab;
            View customView = tab != null ? tab.getCustomView() : null;
            if (customView != null) {
                ViewParent parent2 = customView.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(customView);
                    }
                    View view2 = this.customView;
                    if (view2 != null && (parent = view2.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.customView);
                    }
                    addView(customView);
                }
                this.customView = customView;
                TextView textView = this.textView;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.iconView;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.iconView.setImageDrawable(null);
                }
                TextView textView2 = (TextView) customView.findViewById(android.R.id.text1);
                this.customTextView = textView2;
                if (textView2 != null) {
                    this.defaultMaxLines = textView2.getMaxLines();
                }
                this.customIconView = (ImageView) customView.findViewById(android.R.id.icon);
            } else {
                View view3 = this.customView;
                if (view3 != null) {
                    removeView(view3);
                    this.customView = null;
                }
                this.customTextView = null;
                this.customIconView = null;
            }
            if (this.customView == null) {
                if (this.iconView == null) {
                    inflateAndAddDefaultIconView();
                }
                if (this.textView == null) {
                    inflateAndAddDefaultTextView();
                    this.defaultMaxLines = this.textView.getMaxLines();
                }
                this.textView.setTextAppearance(TabLayout.this.defaultTabTextAppearance);
                if (!isSelected() || TabLayout.this.selectedTabTextAppearance == -1) {
                    this.textView.setTextAppearance(TabLayout.this.tabTextAppearance);
                } else {
                    this.textView.setTextAppearance(TabLayout.this.selectedTabTextAppearance);
                }
                ColorStateList colorStateList = TabLayout.this.tabTextColors;
                if (colorStateList != null) {
                    this.textView.setTextColor(colorStateList);
                }
                updateTextAndIcon(this.textView, this.iconView, true);
                tryUpdateBadgeAnchor();
                addOnLayoutChangeListener(this.iconView);
                addOnLayoutChangeListener(this.textView);
            } else {
                TextView textView3 = this.customTextView;
                if (textView3 != null || this.customIconView != null) {
                    updateTextAndIcon(textView3, this.customIconView, false);
                }
            }
            if (tab == null || TextUtils.isEmpty(tab.contentDesc)) {
                return;
            }
            setContentDescription(tab.contentDesc);
        }
    }

    public static class ViewPagerOnTabSelectedListener implements OnTabSelectedListener {
        private final ViewPager viewPager;

        public ViewPagerOnTabSelectedListener(ViewPager viewPager) {
            this.viewPager = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(Tab tab) {
            this.viewPager.setCurrentItem(tab.getPosition());
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(Tab tab) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TabLayout(Context context, AttributeSet attributeSet, int i14) {
        int i15 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i14, i15), attributeSet, i14);
        this.indicatorPosition = -1;
        this.tabs = new ArrayList<>();
        this.selectedTabTextAppearance = -1;
        this.tabSelectedIndicatorColor = 0;
        this.tabMaxWidth = Integer.MAX_VALUE;
        this.tabIndicatorHeight = -1;
        this.selectedListeners = new ArrayList<>();
        this.tabViewPool = new k7.f(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        SlidingTabIndicator slidingTabIndicator = new SlidingTabIndicator(context2);
        this.slidingTabIndicator = slidingTabIndicator;
        super.addView(slidingTabIndicator, 0, new FrameLayout.LayoutParams(-2, -1));
        int[] iArr = R.styleable.TabLayout;
        int i16 = R.styleable.TabLayout_tabTextAppearance;
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, iArr, i14, i15, i16);
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(getBackground());
        if (colorStateListOrNull != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.setFillColor(colorStateListOrNull);
            materialShapeDrawable.initializeElevationOverlay(context2);
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            materialShapeDrawable.setElevation(getElevation());
            setBackground(materialShapeDrawable);
        }
        setSelectedTabIndicator(MaterialResources.getDrawable(context2, typedArrayObtainStyledAttributes, R.styleable.TabLayout_tabIndicator));
        setSelectedTabIndicatorColor(typedArrayObtainStyledAttributes.getColor(R.styleable.TabLayout_tabIndicatorColor, 0));
        slidingTabIndicator.setSelectedIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabIndicatorHeight, -1));
        setSelectedTabIndicatorGravity(typedArrayObtainStyledAttributes.getInt(R.styleable.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorAnimationMode(typedArrayObtainStyledAttributes.getInt(R.styleable.TabLayout_tabIndicatorAnimationMode, 0));
        setTabIndicatorFullWidth(typedArrayObtainStyledAttributes.getBoolean(R.styleable.TabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPadding, 0);
        this.tabPaddingBottom = dimensionPixelSize;
        this.tabPaddingEnd = dimensionPixelSize;
        this.tabPaddingTop = dimensionPixelSize;
        this.tabPaddingStart = dimensionPixelSize;
        this.tabPaddingStart = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingStart, dimensionPixelSize);
        this.tabPaddingTop = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingTop, this.tabPaddingTop);
        this.tabPaddingEnd = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingEnd, this.tabPaddingEnd);
        this.tabPaddingBottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingBottom, this.tabPaddingBottom);
        if (ThemeEnforcement.isMaterial3Theme(context2)) {
            this.defaultTabTextAppearance = R.attr.textAppearanceTitleSmall;
        } else {
            this.defaultTabTextAppearance = R.attr.textAppearanceButton;
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(i16, R.style.TextAppearance_Design_Tab);
        this.tabTextAppearance = resourceId;
        int[] iArr2 = h.a.f80445y;
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(resourceId, iArr2);
        try {
            this.tabTextSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, 0);
            this.tabTextColors = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes2, 3);
            typedArrayObtainStyledAttributes2.recycle();
            int i17 = R.styleable.TabLayout_tabSelectedTextAppearance;
            if (typedArrayObtainStyledAttributes.hasValue(i17)) {
                this.selectedTabTextAppearance = typedArrayObtainStyledAttributes.getResourceId(i17, resourceId);
            }
            int i18 = this.selectedTabTextAppearance;
            if (i18 != -1) {
                TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(i18, iArr2);
                try {
                    this.selectedTabTextSize = typedArrayObtainStyledAttributes3.getDimensionPixelSize(0, (int) this.tabTextSize);
                    ColorStateList colorStateList = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes3, 3);
                    if (colorStateList != null) {
                        this.tabTextColors = createColorStateList(this.tabTextColors.getDefaultColor(), colorStateList.getColorForState(new int[]{android.R.attr.state_selected}, colorStateList.getDefaultColor()));
                    }
                    typedArrayObtainStyledAttributes3.recycle();
                } catch (Throwable th3) {
                    typedArrayObtainStyledAttributes3.recycle();
                    throw th3;
                }
            }
            int i19 = R.styleable.TabLayout_tabTextColor;
            if (typedArrayObtainStyledAttributes.hasValue(i19)) {
                this.tabTextColors = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, i19);
            }
            int i24 = R.styleable.TabLayout_tabSelectedTextColor;
            if (typedArrayObtainStyledAttributes.hasValue(i24)) {
                this.tabTextColors = createColorStateList(this.tabTextColors.getDefaultColor(), typedArrayObtainStyledAttributes.getColor(i24, 0));
            }
            this.tabIconTint = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.TabLayout_tabIconTint);
            this.tabIconTintMode = ViewUtils.parseTintMode(typedArrayObtainStyledAttributes.getInt(R.styleable.TabLayout_tabIconTintMode, -1), null);
            this.tabRippleColorStateList = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.TabLayout_tabRippleColor);
            this.tabIndicatorAnimationDuration = typedArrayObtainStyledAttributes.getInt(R.styleable.TabLayout_tabIndicatorAnimationDuration, 300);
            this.tabIndicatorTimeInterpolator = MotionUtils.resolveThemeInterpolator(context2, R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            this.requestedTabMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabMinWidth, -1);
            this.requestedTabMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabMaxWidth, -1);
            this.tabBackgroundResId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.TabLayout_tabBackground, 0);
            this.contentInsetStart = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabContentStart, 0);
            this.mode = typedArrayObtainStyledAttributes.getInt(R.styleable.TabLayout_tabMode, 1);
            this.tabGravity = typedArrayObtainStyledAttributes.getInt(R.styleable.TabLayout_tabGravity, 0);
            this.inlineLabel = typedArrayObtainStyledAttributes.getBoolean(R.styleable.TabLayout_tabInlineLabel, false);
            this.unboundedRipple = typedArrayObtainStyledAttributes.getBoolean(R.styleable.TabLayout_tabUnboundedRipple, false);
            typedArrayObtainStyledAttributes.recycle();
            Resources resources = getResources();
            this.tabTextMultiLineSize = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.scrollableTabMinWidth = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            applyModeAndGravity();
        } catch (Throwable th4) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th4;
        }
    }

    private void addTabFromItemView(TabItem tabItem) {
        Tab tabNewTab = newTab();
        CharSequence charSequence = tabItem.text;
        if (charSequence != null) {
            tabNewTab.setText(charSequence);
        }
        Drawable drawable = tabItem.icon;
        if (drawable != null) {
            tabNewTab.setIcon(drawable);
        }
        int i14 = tabItem.customLayout;
        if (i14 != 0) {
            tabNewTab.setCustomView(i14);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            tabNewTab.setContentDescription(tabItem.getContentDescription());
        }
        addTab(tabNewTab);
    }

    private void addTabView(Tab tab) {
        TabView tabView = tab.f53250view;
        tabView.setSelected(false);
        tabView.setActivated(false);
        this.slidingTabIndicator.addView(tabView, tab.getPosition(), createLayoutParamsForTabs());
    }

    private void addViewInternal(View view2) {
        if (view2 instanceof TabItem) {
            addTabFromItemView((TabItem) view2);
        } else {
            h.s("Only TabItem instances can be added to TabLayout");
        }
    }

    private void animateToTab(int i14) {
        if (i14 == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            if (isLaidOut() && !this.slidingTabIndicator.childrenNeedLayout()) {
                int scrollX = getScrollX();
                int iCalculateScrollXForTab = calculateScrollXForTab(i14, 0.0f);
                if (scrollX != iCalculateScrollXForTab) {
                    ensureScrollAnimator();
                    this.scrollAnimator.setIntValues(scrollX, iCalculateScrollXForTab);
                    this.scrollAnimator.start();
                }
                this.slidingTabIndicator.animateIndicatorToPosition(i14, this.tabIndicatorAnimationDuration);
                return;
            }
        }
        setScrollPosition(i14, 0.0f, true);
    }

    private void applyGravityForModeScrollable(int i14) {
        if (i14 != 0) {
            if (i14 == 1) {
                this.slidingTabIndicator.setGravity(1);
                return;
            } else if (i14 != 2) {
                return;
            }
        }
        this.slidingTabIndicator.setGravity(8388611);
    }

    private void applyModeAndGravity() {
        int i14 = this.mode;
        int iMax = (i14 == 0 || i14 == 2) ? Math.max(0, this.contentInsetStart - this.tabPaddingStart) : 0;
        SlidingTabIndicator slidingTabIndicator = this.slidingTabIndicator;
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        slidingTabIndicator.setPaddingRelative(iMax, 0, 0, 0);
        int i15 = this.mode;
        if (i15 == 0) {
            applyGravityForModeScrollable(this.tabGravity);
        } else if (i15 == 1 || i15 == 2) {
            this.slidingTabIndicator.setGravity(1);
        }
        updateTabViews(true);
    }

    private int calculateScrollXForTab(int i14, float f14) {
        View childAt;
        int i15 = this.mode;
        if ((i15 != 0 && i15 != 2) || (childAt = this.slidingTabIndicator.getChildAt(i14)) == null) {
            return 0;
        }
        int i16 = i14 + 1;
        View childAt2 = i16 < this.slidingTabIndicator.getChildCount() ? this.slidingTabIndicator.getChildAt(i16) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i17 = (int) ((width + width2) * 0.5f * f14);
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        return getLayoutDirection() == 0 ? left + i17 : left - i17;
    }

    private void configureTab(Tab tab, int i14) {
        tab.setPosition(i14);
        this.tabs.add(i14, tab);
        int size = this.tabs.size();
        int i15 = -1;
        for (int i16 = i14 + 1; i16 < size; i16++) {
            if (this.tabs.get(i16).getPosition() == this.indicatorPosition) {
                i15 = i16;
            }
            this.tabs.get(i16).setPosition(i16);
        }
        this.indicatorPosition = i15;
    }

    private static ColorStateList createColorStateList(int i14, int i15) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i15, i14});
    }

    private LinearLayout.LayoutParams createLayoutParamsForTabs() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        updateTabViewLayoutParams(layoutParams);
        return layoutParams;
    }

    private TabView createTabView(Tab tab) {
        e<TabView> eVar = this.tabViewPool;
        TabView tabViewAcquire = eVar != null ? eVar.acquire() : null;
        if (tabViewAcquire == null) {
            tabViewAcquire = new TabView(getContext());
        }
        tabViewAcquire.setTab(tab);
        tabViewAcquire.setFocusable(true);
        tabViewAcquire.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(tab.contentDesc)) {
            tabViewAcquire.setContentDescription(tab.text);
            return tabViewAcquire;
        }
        tabViewAcquire.setContentDescription(tab.contentDesc);
        return tabViewAcquire;
    }

    private void dispatchTabReselected(Tab tab) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            this.selectedListeners.get(size).onTabReselected(tab);
        }
    }

    private void dispatchTabSelected(Tab tab) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            this.selectedListeners.get(size).onTabSelected(tab);
        }
    }

    private void dispatchTabUnselected(Tab tab) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            this.selectedListeners.get(size).onTabUnselected(tab);
        }
    }

    private void ensureScrollAnimator() {
        if (this.scrollAnimator == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.scrollAnimator = valueAnimator;
            valueAnimator.setInterpolator(this.tabIndicatorTimeInterpolator);
            this.scrollAnimator.setDuration(this.tabIndicatorAnimationDuration);
            this.scrollAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.tabs.TabLayout.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    TabLayout.this.scrollTo(((Integer) valueAnimator2.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    private int getDefaultHeight() {
        int size = this.tabs.size();
        for (int i14 = 0; i14 < size; i14++) {
            Tab tab = this.tabs.get(i14);
            if (tab != null && tab.getIcon() != null && !TextUtils.isEmpty(tab.getText())) {
                return !this.inlineLabel ? 72 : 48;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i14 = this.requestedTabMinWidth;
        if (i14 != -1) {
            return i14;
        }
        int i15 = this.mode;
        if (i15 == 0 || i15 == 2) {
            return this.scrollableTabMinWidth;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.slidingTabIndicator.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private boolean isScrollingEnabled() {
        return getTabMode() == 0 || getTabMode() == 2;
    }

    private void removeTabViewAt(int i14) {
        TabView tabView = (TabView) this.slidingTabIndicator.getChildAt(i14);
        this.slidingTabIndicator.removeViewAt(i14);
        if (tabView != null) {
            tabView.reset();
            this.tabViewPool.a(tabView);
        }
        requestLayout();
    }

    private void setSelectedTabView(int i14) {
        int childCount = this.slidingTabIndicator.getChildCount();
        if (i14 < childCount) {
            int i15 = 0;
            while (i15 < childCount) {
                View childAt = this.slidingTabIndicator.getChildAt(i15);
                if ((i15 != i14 || childAt.isSelected()) && (i15 == i14 || !childAt.isSelected())) {
                    childAt.setSelected(i15 == i14);
                    childAt.setActivated(i15 == i14);
                } else {
                    childAt.setSelected(i15 == i14);
                    childAt.setActivated(i15 == i14);
                    if (childAt instanceof TabView) {
                        ((TabView) childAt).updateTab();
                    }
                }
                i15++;
            }
        }
    }

    private void setupWithViewPager(ViewPager viewPager, boolean z14, boolean z15) {
        ArrayList arrayList;
        ViewPager viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            TabLayoutOnPageChangeListener tabLayoutOnPageChangeListener = this.pageChangeListener;
            if (tabLayoutOnPageChangeListener != null) {
                viewPager2.z(tabLayoutOnPageChangeListener);
            }
            AdapterChangeListener adapterChangeListener = this.adapterChangeListener;
            if (adapterChangeListener != null && (arrayList = this.viewPager.V0) != null) {
                arrayList.remove(adapterChangeListener);
            }
        }
        BaseOnTabSelectedListener baseOnTabSelectedListener = this.currentVpSelectedListener;
        if (baseOnTabSelectedListener != null) {
            removeOnTabSelectedListener(baseOnTabSelectedListener);
            this.currentVpSelectedListener = null;
        }
        if (viewPager != null) {
            this.viewPager = viewPager;
            if (this.pageChangeListener == null) {
                this.pageChangeListener = new TabLayoutOnPageChangeListener(this);
            }
            this.pageChangeListener.reset();
            viewPager.c(this.pageChangeListener);
            ViewPagerOnTabSelectedListener viewPagerOnTabSelectedListener = new ViewPagerOnTabSelectedListener(viewPager);
            this.currentVpSelectedListener = viewPagerOnTabSelectedListener;
            addOnTabSelectedListener((BaseOnTabSelectedListener) viewPagerOnTabSelectedListener);
            a adapter = viewPager.getAdapter();
            if (adapter != null) {
                setPagerAdapter(adapter, z14);
            }
            if (this.adapterChangeListener == null) {
                this.adapterChangeListener = new AdapterChangeListener();
            }
            this.adapterChangeListener.setAutoRefresh(z14);
            viewPager.b(this.adapterChangeListener);
            setScrollPosition(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.viewPager = null;
            setPagerAdapter(null, false);
        }
        this.setupViewPagerImplicitly = z15;
    }

    private void updateAllTabs() {
        int size = this.tabs.size();
        for (int i14 = 0; i14 < size; i14++) {
            this.tabs.get(i14).updateView();
        }
    }

    private void updateTabViewLayoutParams(LinearLayout.LayoutParams layoutParams) {
        if (this.mode == 1 && this.tabGravity == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    @Deprecated
    public void addOnTabSelectedListener(BaseOnTabSelectedListener baseOnTabSelectedListener) {
        if (this.selectedListeners.contains(baseOnTabSelectedListener)) {
            return;
        }
        this.selectedListeners.add(baseOnTabSelectedListener);
    }

    public void addTab(Tab tab, int i14, boolean z14) {
        if (tab.parent != this) {
            h.s("Tab belongs to a different TabLayout.");
            return;
        }
        configureTab(tab, i14);
        addTabView(tab);
        if (z14) {
            tab.select();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view2) {
        addViewInternal(view2);
    }

    public void clearOnTabSelectedListeners() {
        this.selectedListeners.clear();
    }

    public Tab createTabFromPool() {
        Tab tabAcquire = tabPool.acquire();
        return tabAcquire == null ? new Tab() : tabAcquire;
    }

    public int getSelectedTabPosition() {
        Tab tab = this.selectedTab;
        if (tab != null) {
            return tab.getPosition();
        }
        return -1;
    }

    public Tab getTabAt(int i14) {
        if (i14 < 0 || i14 >= getTabCount()) {
            return null;
        }
        return this.tabs.get(i14);
    }

    public int getTabCount() {
        return this.tabs.size();
    }

    public int getTabGravity() {
        return this.tabGravity;
    }

    public ColorStateList getTabIconTint() {
        return this.tabIconTint;
    }

    public int getTabIndicatorAnimationMode() {
        return this.tabIndicatorAnimationMode;
    }

    public int getTabIndicatorGravity() {
        return this.tabIndicatorGravity;
    }

    public int getTabMaxWidth() {
        return this.tabMaxWidth;
    }

    public int getTabMode() {
        return this.mode;
    }

    public ColorStateList getTabRippleColor() {
        return this.tabRippleColorStateList;
    }

    public Drawable getTabSelectedIndicator() {
        return this.tabSelectedIndicator;
    }

    public ColorStateList getTabTextColors() {
        return this.tabTextColors;
    }

    public boolean hasUnboundedRipple() {
        return this.unboundedRipple;
    }

    public boolean isInlineLabel() {
        return this.inlineLabel;
    }

    public boolean isTabIndicatorFullWidth() {
        return this.tabIndicatorFullWidth;
    }

    public Tab newTab() {
        Tab tabCreateTabFromPool = createTabFromPool();
        tabCreateTabFromPool.parent = this;
        tabCreateTabFromPool.f53250view = createTabView(tabCreateTabFromPool);
        if (tabCreateTabFromPool.f53249id != -1) {
            tabCreateTabFromPool.f53250view.setId(tabCreateTabFromPool.f53249id);
        }
        return tabCreateTabFromPool;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
        if (this.viewPager == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                setupWithViewPager((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.setupViewPagerImplicitly) {
            setupWithViewPager(null);
            this.setupViewPagerImplicitly = false;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        for (int i14 = 0; i14 < this.slidingTabIndicator.getChildCount(); i14++) {
            View childAt = this.slidingTabIndicator.getChildAt(i14);
            if (childAt instanceof TabView) {
                ((TabView) childAt).drawBackground(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        f.v(accessibilityNodeInfo).p(f.g.a(1, getTabCount(), 1, false));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return isScrollingEnabled() && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i14, int i15) {
        int iRound = Math.round(ViewUtils.dpToPx(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i15);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i15 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + iRound, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i15) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i14);
        if (View.MeasureSpec.getMode(i14) != 0) {
            int iDpToPx = this.requestedTabMaxWidth;
            if (iDpToPx <= 0) {
                iDpToPx = (int) (size - ViewUtils.dpToPx(getContext(), 56));
            }
            this.tabMaxWidth = iDpToPx;
        }
        super.onMeasure(i14, i15);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i16 = this.mode;
            if (i16 == 0) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (i16 != 1) {
                if (i16 != 2) {
                    return;
                }
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i15, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || isScrollingEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void populateFromPagerAdapter() {
        int currentItem;
        removeAllTabs();
        a aVar = this.pagerAdapter;
        if (aVar != null) {
            int count = aVar.getF149591t();
            for (int i14 = 0; i14 < count; i14++) {
                addTab(newTab().setText(this.pagerAdapter.getPageTitle(i14)), false);
            }
            ViewPager viewPager = this.viewPager;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            selectTab(getTabAt(currentItem));
        }
    }

    public boolean releaseFromTabPool(Tab tab) {
        return tabPool.a(tab);
    }

    public void removeAllTabs() {
        for (int childCount = this.slidingTabIndicator.getChildCount() - 1; childCount >= 0; childCount--) {
            removeTabViewAt(childCount);
        }
        Iterator<Tab> it = this.tabs.iterator();
        while (it.hasNext()) {
            Tab next = it.next();
            it.remove();
            next.reset();
            releaseFromTabPool(next);
        }
        this.selectedTab = null;
    }

    @Deprecated
    public void removeOnTabSelectedListener(BaseOnTabSelectedListener baseOnTabSelectedListener) {
        this.selectedListeners.remove(baseOnTabSelectedListener);
    }

    public void removeTab(Tab tab) {
        if (tab.parent == this) {
            removeTabAt(tab.getPosition());
        } else {
            h.s("Tab does not belong to this TabLayout.");
        }
    }

    public void removeTabAt(int i14) {
        Tab tab = this.selectedTab;
        int position = tab != null ? tab.getPosition() : 0;
        removeTabViewAt(i14);
        Tab tabRemove = this.tabs.remove(i14);
        if (tabRemove != null) {
            tabRemove.reset();
            releaseFromTabPool(tabRemove);
        }
        int size = this.tabs.size();
        int i15 = -1;
        for (int i16 = i14; i16 < size; i16++) {
            if (this.tabs.get(i16).getPosition() == this.indicatorPosition) {
                i15 = i16;
            }
            this.tabs.get(i16).setPosition(i16);
        }
        this.indicatorPosition = i15;
        if (position == i14) {
            selectTab(this.tabs.isEmpty() ? null : this.tabs.get(Math.max(0, i14 - 1)));
        }
    }

    public void selectTab(Tab tab, boolean z14) {
        Tab tab2 = this.selectedTab;
        if (tab2 == tab) {
            if (tab2 != null) {
                dispatchTabReselected(tab);
                animateToTab(tab.getPosition());
                return;
            }
            return;
        }
        int position = tab != null ? tab.getPosition() : -1;
        if (z14) {
            if ((tab2 == null || tab2.getPosition() == -1) && position != -1) {
                setScrollPosition(position, 0.0f, true);
            } else {
                animateToTab(position);
            }
            if (position != -1) {
                setSelectedTabView(position);
            }
        }
        this.selectedTab = tab;
        if (tab2 != null && tab2.parent != null) {
            dispatchTabUnselected(tab2);
        }
        if (tab != null) {
            dispatchTabSelected(tab);
        }
    }

    @Override // android.view.View
    public void setElevation(float f14) {
        super.setElevation(f14);
        MaterialShapeUtils.setElevation(this, f14);
    }

    public void setInlineLabel(boolean z14) {
        if (this.inlineLabel != z14) {
            this.inlineLabel = z14;
            for (int i14 = 0; i14 < this.slidingTabIndicator.getChildCount(); i14++) {
                View childAt = this.slidingTabIndicator.getChildAt(i14);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).updateOrientation();
                }
            }
            applyModeAndGravity();
        }
    }

    public void setInlineLabelResource(int i14) {
        setInlineLabel(getResources().getBoolean(i14));
    }

    @Deprecated
    public void setOnTabSelectedListener(BaseOnTabSelectedListener baseOnTabSelectedListener) {
        BaseOnTabSelectedListener baseOnTabSelectedListener2 = this.selectedListener;
        if (baseOnTabSelectedListener2 != null) {
            removeOnTabSelectedListener(baseOnTabSelectedListener2);
        }
        this.selectedListener = baseOnTabSelectedListener;
        if (baseOnTabSelectedListener != null) {
            addOnTabSelectedListener(baseOnTabSelectedListener);
        }
    }

    public void setPagerAdapter(a aVar, boolean z14) {
        DataSetObserver dataSetObserver;
        a aVar2 = this.pagerAdapter;
        if (aVar2 != null && (dataSetObserver = this.pagerAdapterObserver) != null) {
            aVar2.unregisterDataSetObserver(dataSetObserver);
        }
        this.pagerAdapter = aVar;
        if (z14 && aVar != null) {
            if (this.pagerAdapterObserver == null) {
                this.pagerAdapterObserver = new PagerAdapterObserver();
            }
            aVar.registerDataSetObserver(this.pagerAdapterObserver);
        }
        populateFromPagerAdapter();
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        ensureScrollAnimator();
        this.scrollAnimator.addListener(animatorListener);
    }

    public void setScrollPosition(int i14, float f14, boolean z14, boolean z15, boolean z16) {
        int iRound = Math.round(i14 + f14);
        if (iRound < 0 || iRound >= this.slidingTabIndicator.getChildCount()) {
            return;
        }
        if (z15) {
            this.slidingTabIndicator.setIndicatorPositionFromTabPosition(i14, f14);
        }
        ValueAnimator valueAnimator = this.scrollAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.scrollAnimator.cancel();
        }
        int iCalculateScrollXForTab = calculateScrollXForTab(i14, f14);
        int scrollX = getScrollX();
        boolean z17 = (i14 < getSelectedTabPosition() && iCalculateScrollXForTab >= scrollX) || (i14 > getSelectedTabPosition() && iCalculateScrollXForTab <= scrollX) || i14 == getSelectedTabPosition();
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        if (getLayoutDirection() == 1) {
            z17 = (i14 < getSelectedTabPosition() && iCalculateScrollXForTab <= scrollX) || (i14 > getSelectedTabPosition() && iCalculateScrollXForTab >= scrollX) || i14 == getSelectedTabPosition();
        }
        if (z17 || this.viewPagerScrollState == 1 || z16) {
            if (i14 < 0) {
                iCalculateScrollXForTab = 0;
            }
            scrollTo(iCalculateScrollXForTab, 0);
        }
        if (z14) {
            setSelectedTabView(iRound);
        }
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = drawable.mutate();
        this.tabSelectedIndicator = drawableMutate;
        DrawableUtils.setTint(drawableMutate, this.tabSelectedIndicatorColor);
        int intrinsicHeight = this.tabIndicatorHeight;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.tabSelectedIndicator.getIntrinsicHeight();
        }
        this.slidingTabIndicator.setSelectedIndicatorHeight(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(int i14) {
        this.tabSelectedIndicatorColor = i14;
        DrawableUtils.setTint(this.tabSelectedIndicator, i14);
        updateTabViews(false);
    }

    public void setSelectedTabIndicatorGravity(int i14) {
        if (this.tabIndicatorGravity != i14) {
            this.tabIndicatorGravity = i14;
            SlidingTabIndicator slidingTabIndicator = this.slidingTabIndicator;
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            slidingTabIndicator.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i14) {
        this.tabIndicatorHeight = i14;
        this.slidingTabIndicator.setSelectedIndicatorHeight(i14);
    }

    public void setTabGravity(int i14) {
        if (this.tabGravity != i14) {
            this.tabGravity = i14;
            applyModeAndGravity();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.tabIconTint != colorStateList) {
            this.tabIconTint = colorStateList;
            updateAllTabs();
        }
    }

    public void setTabIconTintResource(int i14) {
        setTabIconTint(b.getColorStateList(getContext(), i14));
    }

    public void setTabIndicatorAnimationMode(int i14) {
        this.tabIndicatorAnimationMode = i14;
        if (i14 == 0) {
            this.tabIndicatorInterpolator = new TabIndicatorInterpolator();
            return;
        }
        if (i14 == 1) {
            this.tabIndicatorInterpolator = new ElasticTabIndicatorInterpolator();
        } else if (i14 == 2) {
            this.tabIndicatorInterpolator = new FadeTabIndicatorInterpolator();
        } else {
            h.s(j.f(i14, " is not a valid TabIndicatorAnimationMode"));
        }
    }

    public void setTabIndicatorFullWidth(boolean z14) {
        this.tabIndicatorFullWidth = z14;
        this.slidingTabIndicator.jumpIndicatorToSelectedPosition();
        SlidingTabIndicator slidingTabIndicator = this.slidingTabIndicator;
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        slidingTabIndicator.postInvalidateOnAnimation();
    }

    public void setTabMode(int i14) {
        if (i14 != this.mode) {
            this.mode = i14;
            applyModeAndGravity();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.tabRippleColorStateList != colorStateList) {
            this.tabRippleColorStateList = colorStateList;
            for (int i14 = 0; i14 < this.slidingTabIndicator.getChildCount(); i14++) {
                View childAt = this.slidingTabIndicator.getChildAt(i14);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).updateBackgroundDrawable(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i14) {
        setTabRippleColor(b.getColorStateList(getContext(), i14));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.tabTextColors != colorStateList) {
            this.tabTextColors = colorStateList;
            updateAllTabs();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(a aVar) {
        setPagerAdapter(aVar, false);
    }

    public void setUnboundedRipple(boolean z14) {
        if (this.unboundedRipple != z14) {
            this.unboundedRipple = z14;
            for (int i14 = 0; i14 < this.slidingTabIndicator.getChildCount(); i14++) {
                View childAt = this.slidingTabIndicator.getChildAt(i14);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).updateBackgroundDrawable(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i14) {
        setUnboundedRipple(getResources().getBoolean(i14));
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public void updateTabViews(boolean z14) {
        for (int i14 = 0; i14 < this.slidingTabIndicator.getChildCount(); i14++) {
            View childAt = this.slidingTabIndicator.getChildAt(i14);
            childAt.setMinimumWidth(getTabMinWidth());
            updateTabViewLayoutParams((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z14) {
                childAt.requestLayout();
            }
        }
    }

    public void updateViewPagerScrollState(int i14) {
        this.viewPagerScrollState = i14;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view2, int i14) {
        addViewInternal(view2);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view2, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view2, int i14, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view2);
    }

    public void removeOnTabSelectedListener(OnTabSelectedListener onTabSelectedListener) {
        removeOnTabSelectedListener((BaseOnTabSelectedListener) onTabSelectedListener);
    }

    public void setTabTextColors(int i14, int i15) {
        setTabTextColors(createColorStateList(i14, i15));
    }

    public void addOnTabSelectedListener(OnTabSelectedListener onTabSelectedListener) {
        addOnTabSelectedListener((BaseOnTabSelectedListener) onTabSelectedListener);
    }

    @Deprecated
    public void setOnTabSelectedListener(OnTabSelectedListener onTabSelectedListener) {
        setOnTabSelectedListener((BaseOnTabSelectedListener) onTabSelectedListener);
    }

    public static class Tab {
        public static final int INVALID_POSITION = -1;
        private CharSequence contentDesc;
        private View customView;
        private Drawable icon;
        public TabLayout parent;
        private Object tag;
        private CharSequence text;

        /* JADX INFO: renamed from: view, reason: collision with root package name */
        public TabView f53250view;
        private int position = -1;

        @LabelVisibility
        private int labelVisibilityMode = 1;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private int f53249id = -1;

        public BadgeDrawable getBadge() {
            return this.f53250view.getBadge();
        }

        public CharSequence getContentDescription() {
            TabView tabView = this.f53250view;
            if (tabView == null) {
                return null;
            }
            return tabView.getContentDescription();
        }

        public View getCustomView() {
            return this.customView;
        }

        public Drawable getIcon() {
            return this.icon;
        }

        public int getId() {
            return this.f53249id;
        }

        public BadgeDrawable getOrCreateBadge() {
            return this.f53250view.getOrCreateBadge();
        }

        public int getPosition() {
            return this.position;
        }

        @LabelVisibility
        public int getTabLabelVisibility() {
            return this.labelVisibilityMode;
        }

        public Object getTag() {
            return this.tag;
        }

        public CharSequence getText() {
            return this.text;
        }

        public boolean isSelected() {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                return selectedTabPosition != -1 && selectedTabPosition == this.position;
            }
            h.s("Tab not attached to a TabLayout");
            return false;
        }

        public void removeBadge() {
            this.f53250view.removeBadge();
        }

        public void reset() {
            this.parent = null;
            this.f53250view = null;
            this.tag = null;
            this.icon = null;
            this.f53249id = -1;
            this.text = null;
            this.contentDesc = null;
            this.position = -1;
            this.customView = null;
        }

        public void select() {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                tabLayout.selectTab(this);
            } else {
                h.s("Tab not attached to a TabLayout");
            }
        }

        @CanIgnoreReturnValue
        public Tab setContentDescription(int i14) {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                return setContentDescription(tabLayout.getResources().getText(i14));
            }
            h.s("Tab not attached to a TabLayout");
            return null;
        }

        @CanIgnoreReturnValue
        public Tab setCustomView(int i14) {
            return setCustomView(LayoutInflater.from(this.f53250view.getContext()).inflate(i14, (ViewGroup) this.f53250view, false));
        }

        @CanIgnoreReturnValue
        public Tab setIcon(Drawable drawable) {
            this.icon = drawable;
            TabLayout tabLayout = this.parent;
            if (tabLayout.tabGravity == 1 || tabLayout.mode == 2) {
                tabLayout.updateTabViews(true);
            }
            updateView();
            if (BadgeUtils.USE_COMPAT_PARENT && this.f53250view.hasBadgeDrawable() && this.f53250view.badgeDrawable.isVisible()) {
                this.f53250view.invalidate();
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Tab setId(int i14) {
            this.f53249id = i14;
            TabView tabView = this.f53250view;
            if (tabView != null) {
                tabView.setId(i14);
            }
            return this;
        }

        public void setPosition(int i14) {
            this.position = i14;
        }

        @CanIgnoreReturnValue
        public Tab setTabLabelVisibility(@LabelVisibility int i14) {
            this.labelVisibilityMode = i14;
            TabLayout tabLayout = this.parent;
            if (tabLayout.tabGravity == 1 || tabLayout.mode == 2) {
                tabLayout.updateTabViews(true);
            }
            updateView();
            if (BadgeUtils.USE_COMPAT_PARENT && this.f53250view.hasBadgeDrawable() && this.f53250view.badgeDrawable.isVisible()) {
                this.f53250view.invalidate();
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Tab setTag(Object obj) {
            this.tag = obj;
            return this;
        }

        @CanIgnoreReturnValue
        public Tab setText(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.contentDesc) && !TextUtils.isEmpty(charSequence)) {
                this.f53250view.setContentDescription(charSequence);
            }
            this.text = charSequence;
            updateView();
            return this;
        }

        public void updateView() {
            TabView tabView = this.f53250view;
            if (tabView != null) {
                tabView.update();
            }
        }

        @CanIgnoreReturnValue
        public Tab setCustomView(View view2) {
            this.customView = view2;
            updateView();
            return this;
        }

        @CanIgnoreReturnValue
        public Tab setContentDescription(CharSequence charSequence) {
            this.contentDesc = charSequence;
            updateView();
            return this;
        }

        @CanIgnoreReturnValue
        public Tab setText(int i14) {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                return setText(tabLayout.getResources().getText(i14));
            }
            h.s("Tab not attached to a TabLayout");
            return null;
        }

        @CanIgnoreReturnValue
        public Tab setIcon(int i14) {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                return setIcon(j.a.a(tabLayout.getContext(), i14));
            }
            h.s("Tab not attached to a TabLayout");
            return null;
        }
    }

    public void addTab(Tab tab, int i14) {
        addTab(tab, i14, this.tabs.isEmpty());
    }

    public void addTab(Tab tab, boolean z14) {
        addTab(tab, this.tabs.size(), z14);
    }

    public void addTab(Tab tab) {
        addTab(tab, this.tabs.isEmpty());
    }

    public void setSelectedTabIndicator(int i14) {
        if (i14 != 0) {
            setSelectedTabIndicator(j.a.a(getContext(), i14));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void selectTab(Tab tab) {
        selectTab(tab, true);
    }

    public void setupWithViewPager(ViewPager viewPager, boolean z14) {
        setupWithViewPager(viewPager, z14, false);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    public void setScrollPosition(int i14, float f14, boolean z14, boolean z15) {
        setScrollPosition(i14, f14, z14, z15, true);
    }

    public void setScrollPosition(int i14, float f14, boolean z14) {
        setScrollPosition(i14, f14, z14, true);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    public TabLayout(Context context) {
        this(context, null);
    }
}
