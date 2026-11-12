package net.lucode.hackware.magicindicator.buildins.commonnavigator;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import net.lucode.hackware.magicindicator.NavigatorHelper;
import net.lucode.hackware.magicindicator.R;
import net.lucode.hackware.magicindicator.abs.IPagerNavigator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IMeasurablePagerTitleView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.model.PositionData;

/* JADX INFO: loaded from: classes23.dex */
public class CommonNavigator extends FrameLayout implements IPagerNavigator, NavigatorHelper.OnNavigatorScrollListener {
    private HorizontalScrollView a;
    private LinearLayout b;
    private LinearLayout c;
    private IPagerIndicator d;
    private CommonNavigatorAdapter e;
    private NavigatorHelper f;
    private boolean g;
    private boolean h;
    private float i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private boolean n;
    private boolean o;
    private boolean p;
    private List<PositionData> q;
    private DataSetObserver r;

    public class a extends DataSetObserver {
        public a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            CommonNavigator.this.f.setTotalCount(CommonNavigator.this.e.getCount());
            CommonNavigator.this.d();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
        }
    }

    public CommonNavigator(Context context) {
        super(context);
        this.i = 0.5f;
        this.j = true;
        this.k = true;
        this.p = true;
        this.q = new ArrayList();
        this.r = new a();
        NavigatorHelper navigatorHelper = new NavigatorHelper();
        this.f = navigatorHelper;
        navigatorHelper.setNavigatorScrollListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        removeAllViews();
        View viewInflate = this.g ? LayoutInflater.from(getContext()).inflate(R.layout.pager_navigator_layout_no_scroll, this) : LayoutInflater.from(getContext()).inflate(R.layout.pager_navigator_layout, this);
        this.a = (HorizontalScrollView) viewInflate.findViewById(R.id.scroll_view);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.title_container);
        this.b = linearLayout;
        linearLayout.setPadding(this.m, 0, this.l, 0);
        LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(R.id.indicator_container);
        this.c = linearLayout2;
        if (this.n) {
            linearLayout2.getParent().bringChildToFront(this.c);
        }
        e();
    }

    private void e() {
        LinearLayout.LayoutParams layoutParams;
        int totalCount = this.f.getTotalCount();
        for (int i = 0; i < totalCount; i++) {
            Object titleView = this.e.getTitleView(getContext(), i);
            if (titleView instanceof View) {
                View view = (View) titleView;
                if (this.g) {
                    layoutParams = new LinearLayout.LayoutParams(0, -1);
                    layoutParams.weight = this.e.getTitleWeight(getContext(), i);
                } else {
                    layoutParams = new LinearLayout.LayoutParams(-2, -1);
                }
                this.b.addView(view, layoutParams);
            }
        }
        CommonNavigatorAdapter commonNavigatorAdapter = this.e;
        if (commonNavigatorAdapter != null) {
            IPagerIndicator indicator = commonNavigatorAdapter.getIndicator(getContext());
            this.d = indicator;
            if (indicator instanceof View) {
                this.c.addView((View) this.d, new FrameLayout.LayoutParams(-1, -1));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void f() {
        this.q.clear();
        int totalCount = this.f.getTotalCount();
        for (int i = 0; i < totalCount; i++) {
            PositionData positionData = new PositionData();
            View childAt = this.b.getChildAt(i);
            if (childAt != 0) {
                positionData.mLeft = childAt.getLeft();
                positionData.mTop = childAt.getTop();
                positionData.mRight = childAt.getRight();
                int bottom = childAt.getBottom();
                positionData.mBottom = bottom;
                if (childAt instanceof IMeasurablePagerTitleView) {
                    IMeasurablePagerTitleView iMeasurablePagerTitleView = (IMeasurablePagerTitleView) childAt;
                    positionData.mContentLeft = iMeasurablePagerTitleView.getContentLeft();
                    positionData.mContentTop = iMeasurablePagerTitleView.getContentTop();
                    positionData.mContentRight = iMeasurablePagerTitleView.getContentRight();
                    positionData.mContentBottom = iMeasurablePagerTitleView.getContentBottom();
                } else {
                    positionData.mContentLeft = positionData.mLeft;
                    positionData.mContentTop = positionData.mTop;
                    positionData.mContentRight = positionData.mRight;
                    positionData.mContentBottom = bottom;
                }
            }
            this.q.add(positionData);
        }
    }

    public CommonNavigatorAdapter getAdapter() {
        return this.e;
    }

    public int getLeftPadding() {
        return this.m;
    }

    public IPagerIndicator getPagerIndicator() {
        return this.d;
    }

    public IPagerTitleView getPagerTitleView(int i) {
        LinearLayout linearLayout = this.b;
        if (linearLayout == null) {
            return null;
        }
        return (IPagerTitleView) linearLayout.getChildAt(i);
    }

    public int getRightPadding() {
        return this.l;
    }

    public float getScrollPivotX() {
        return this.i;
    }

    public LinearLayout getTitleContainer() {
        return this.b;
    }

    public boolean isAdjustMode() {
        return this.g;
    }

    public boolean isEnablePivotScroll() {
        return this.h;
    }

    public boolean isFollowTouch() {
        return this.k;
    }

    public boolean isIndicatorOnTop() {
        return this.n;
    }

    public boolean isReselectWhenLayout() {
        return this.p;
    }

    public boolean isSkimOver() {
        return this.o;
    }

    public boolean isSmoothScroll() {
        return this.j;
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void notifyDataSetChanged() {
        CommonNavigatorAdapter commonNavigatorAdapter = this.e;
        if (commonNavigatorAdapter != null) {
            commonNavigatorAdapter.notifyDataSetChanged();
        }
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void onAttachToMagicIndicator() {
        d();
    }

    @Override // net.lucode.hackware.magicindicator.NavigatorHelper.OnNavigatorScrollListener
    public void onDeselected(int i, int i2) {
        LinearLayout linearLayout = this.b;
        if (linearLayout == null) {
            return;
        }
        KeyEvent.Callback childAt = linearLayout.getChildAt(i);
        if (childAt instanceof IPagerTitleView) {
            ((IPagerTitleView) childAt).onDeselected(i, i2);
        }
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void onDetachFromMagicIndicator() {
    }

    @Override // net.lucode.hackware.magicindicator.NavigatorHelper.OnNavigatorScrollListener
    public void onEnter(int i, int i2, float f, boolean z) {
        LinearLayout linearLayout = this.b;
        if (linearLayout == null) {
            return;
        }
        KeyEvent.Callback childAt = linearLayout.getChildAt(i);
        if (childAt instanceof IPagerTitleView) {
            ((IPagerTitleView) childAt).onEnter(i, i2, f, z);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.e != null) {
            f();
            IPagerIndicator iPagerIndicator = this.d;
            if (iPagerIndicator != null) {
                iPagerIndicator.onPositionDataProvide(this.q);
            }
            if (this.p && this.f.getScrollState() == 0) {
                onPageSelected(this.f.getCurrentIndex());
                onPageScrolled(this.f.getCurrentIndex(), 0.0f, 0);
            }
        }
    }

    @Override // net.lucode.hackware.magicindicator.NavigatorHelper.OnNavigatorScrollListener
    public void onLeave(int i, int i2, float f, boolean z) {
        LinearLayout linearLayout = this.b;
        if (linearLayout == null) {
            return;
        }
        KeyEvent.Callback childAt = linearLayout.getChildAt(i);
        if (childAt instanceof IPagerTitleView) {
            ((IPagerTitleView) childAt).onLeave(i, i2, f, z);
        }
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void onPageScrollStateChanged(int i) {
        if (this.e != null) {
            this.f.onPageScrollStateChanged(i);
            IPagerIndicator iPagerIndicator = this.d;
            if (iPagerIndicator != null) {
                iPagerIndicator.onPageScrollStateChanged(i);
            }
        }
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void onPageScrolled(int i, float f, int i2) {
        if (this.e != null) {
            this.f.onPageScrolled(i, f, i2);
            IPagerIndicator iPagerIndicator = this.d;
            if (iPagerIndicator != null) {
                iPagerIndicator.onPageScrolled(i, f, i2);
            }
            if (this.a == null || this.q.size() <= 0 || i < 0 || i >= this.q.size() || !this.k) {
                return;
            }
            int iMin = Math.min(this.q.size() - 1, i);
            int iMin2 = Math.min(this.q.size() - 1, i + 1);
            PositionData positionData = this.q.get(iMin);
            PositionData positionData2 = this.q.get(iMin2);
            float fHorizontalCenter = positionData.horizontalCenter() - (this.a.getWidth() * this.i);
            this.a.scrollTo((int) (fHorizontalCenter + (((positionData2.horizontalCenter() - (this.a.getWidth() * this.i)) - fHorizontalCenter) * f)), 0);
        }
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void onPageSelected(int i) {
        if (this.e != null) {
            this.f.onPageSelected(i);
            IPagerIndicator iPagerIndicator = this.d;
            if (iPagerIndicator != null) {
                iPagerIndicator.onPageSelected(i);
            }
        }
    }

    @Override // net.lucode.hackware.magicindicator.NavigatorHelper.OnNavigatorScrollListener
    public void onSelected(int i, int i2) {
        LinearLayout linearLayout = this.b;
        if (linearLayout == null) {
            return;
        }
        KeyEvent.Callback childAt = linearLayout.getChildAt(i);
        if (childAt instanceof IPagerTitleView) {
            ((IPagerTitleView) childAt).onSelected(i, i2);
        }
        if (this.g || this.k || this.a == null || this.q.size() <= 0) {
            return;
        }
        PositionData positionData = this.q.get(Math.min(this.q.size() - 1, i));
        if (this.h) {
            float fHorizontalCenter = positionData.horizontalCenter() - (this.a.getWidth() * this.i);
            if (this.j) {
                this.a.smoothScrollTo((int) fHorizontalCenter, 0);
                return;
            } else {
                this.a.scrollTo((int) fHorizontalCenter, 0);
                return;
            }
        }
        int scrollX = this.a.getScrollX();
        int i3 = positionData.mLeft;
        if (scrollX > i3) {
            if (this.j) {
                this.a.smoothScrollTo(i3, 0);
                return;
            } else {
                this.a.scrollTo(i3, 0);
                return;
            }
        }
        int scrollX2 = this.a.getScrollX() + getWidth();
        int i4 = positionData.mRight;
        if (scrollX2 < i4) {
            if (this.j) {
                this.a.smoothScrollTo(i4 - getWidth(), 0);
            } else {
                this.a.scrollTo(i4 - getWidth(), 0);
            }
        }
    }

    public void setAdapter(CommonNavigatorAdapter commonNavigatorAdapter) {
        CommonNavigatorAdapter commonNavigatorAdapter2 = this.e;
        if (commonNavigatorAdapter2 == commonNavigatorAdapter) {
            return;
        }
        if (commonNavigatorAdapter2 != null) {
            commonNavigatorAdapter2.unregisterDataSetObserver(this.r);
        }
        this.e = commonNavigatorAdapter;
        if (commonNavigatorAdapter == null) {
            this.f.setTotalCount(0);
            d();
            return;
        }
        commonNavigatorAdapter.registerDataSetObserver(this.r);
        this.f.setTotalCount(this.e.getCount());
        if (this.b != null) {
            this.e.notifyDataSetChanged();
        }
    }

    public void setAdjustMode(boolean z) {
        this.g = z;
    }

    public void setEnablePivotScroll(boolean z) {
        this.h = z;
    }

    public void setFollowTouch(boolean z) {
        this.k = z;
    }

    public void setIndicatorOnTop(boolean z) {
        this.n = z;
    }

    public void setLeftPadding(int i) {
        this.m = i;
    }

    public void setReselectWhenLayout(boolean z) {
        this.p = z;
    }

    public void setRightPadding(int i) {
        this.l = i;
    }

    public void setScrollPivotX(float f) {
        this.i = f;
    }

    public void setSkimOver(boolean z) {
        this.o = z;
        this.f.setSkimOver(z);
    }

    public void setSmoothScroll(boolean z) {
        this.j = z;
    }
}
