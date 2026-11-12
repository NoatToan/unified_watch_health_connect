package com.xiaomi.hm.health.view.pager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.huami.account.utils.PolicyTipUtil;

/* JADX INFO: loaded from: classes22.dex */
public class TabPageIndicator extends LinearLayout implements PageIndicator {
    private static final CharSequence g = "";
    private final View.OnClickListener a;
    private final LinearLayout b;
    private ViewPager c;
    private ViewPager.OnPageChangeListener d;
    private int e;
    private OnTabReselectedListener f;

    public interface OnTabReselectedListener {
        void onTabReselected(int position);
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int currentItem = TabPageIndicator.this.c.getCurrentItem();
            int index = ((TabIndicatorView) view).getIndex();
            if (PolicyTipUtil.isNeedIntercept() && (index == 0 || index == 3)) {
                PolicyTipUtil.showTip();
                return;
            }
            TabPageIndicator.this.c.setCurrentItem(index);
            if (currentItem != index || TabPageIndicator.this.f == null) {
                return;
            }
            TabPageIndicator.this.f.onTabReselected(index);
        }
    }

    public TabPageIndicator(Context context) {
        this(context, null);
    }

    private void c(int index, CharSequence text, int iconResId) {
        TabIndicatorView tabIndicatorView = new TabIndicatorView(getContext());
        tabIndicatorView.setIndex(index);
        tabIndicatorView.setFocusable(true);
        tabIndicatorView.setOnClickListener(this.a);
        tabIndicatorView.setText(text);
        tabIndicatorView.setImg(iconResId);
        this.b.addView(tabIndicatorView, new LinearLayout.LayoutParams(0, -1, 1.0f));
    }

    @Nullable
    public TabIndicatorView getTabView(int position) {
        if (position >= this.b.getChildCount()) {
            return null;
        }
        return (TabIndicatorView) this.b.getChildAt(position);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.view.pager.PageIndicator
    public void notifyDataSetChanged() {
        this.b.removeAllViews();
        PagerAdapter adapter = this.c.getAdapter();
        IconPagerAdapter iconPagerAdapter = adapter instanceof IconPagerAdapter ? (IconPagerAdapter) adapter : null;
        int count = adapter.getCount();
        for (int i = 0; i < count; i++) {
            CharSequence pageTitle = adapter.getPageTitle(i);
            if (pageTitle == null) {
                pageTitle = g;
            }
            c(i, pageTitle, iconPagerAdapter != null ? iconPagerAdapter.getIconResId(i) : 0);
        }
        if (this.e > count) {
            this.e = count - 1;
        }
        setCurrentItem(this.e);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        boolean z = View.MeasureSpec.getMode(widthMeasureSpec) == 1073741824;
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z || measuredWidth == measuredWidth2) {
            return;
        }
        setCurrentItem(this.e);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int arg0) {
        ViewPager.OnPageChangeListener onPageChangeListener = this.d;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(arg0);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int arg0, float arg1, int arg2) {
        ViewPager.OnPageChangeListener onPageChangeListener = this.d;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(arg0, arg1, arg2);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int arg0) {
        setCurrentItem(arg0);
        ViewPager.OnPageChangeListener onPageChangeListener = this.d;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(arg0);
        }
    }

    @Override // com.xiaomi.hm.health.view.pager.PageIndicator
    public void setCurrentItem(int item) {
        ViewPager viewPager = this.c;
        if (viewPager == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        this.e = item;
        viewPager.setCurrentItem(item);
        int childCount = this.b.getChildCount();
        int i = 0;
        while (i < childCount) {
            this.b.getChildAt(i).setSelected(i == item);
            i++;
        }
    }

    @Override // com.xiaomi.hm.health.view.pager.PageIndicator
    public void setOnPageChangeListener(ViewPager.OnPageChangeListener listener) {
        this.d = listener;
    }

    public void setOnTabReselectedListener(OnTabReselectedListener listener) {
        this.f = listener;
    }

    @Override // com.xiaomi.hm.health.view.pager.PageIndicator
    public void setViewPager(ViewPager view) {
        ViewPager viewPager = this.c;
        if (viewPager == view) {
            return;
        }
        if (viewPager != null) {
            viewPager.setOnPageChangeListener(null);
        }
        if (view.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        this.c = view;
        view.setOnPageChangeListener(this);
        notifyDataSetChanged();
    }

    public TabPageIndicator(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.a = new a();
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        addView(linearLayout, new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // com.xiaomi.hm.health.view.pager.PageIndicator
    public void setViewPager(ViewPager view, int initialPosition) {
        setViewPager(view);
        setCurrentItem(initialPosition);
    }
}
