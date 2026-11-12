package com.huawei.health.device.ui.measure.view;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.huawei.health.device.ui.measure.view.holder.HealthViewPagerHolderCreator;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.dotspageindicator.HealthDotsPageIndicator;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import defpackage.dux;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class HagridUsageGuideBanner<T> extends FrameLayout implements HealthViewPager.OnPageChangeListener, View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f6411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f6412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6413c;
    private HealthDotsPageIndicator d;
    private int e;
    private List<T> f;
    private Runnable g;
    private HealthViewPager h;
    private int i;
    private View j;

    static /* synthetic */ int c(HagridUsageGuideBanner hagridUsageGuideBanner) {
        int i = hagridUsageGuideBanner.f6413c;
        hagridUsageGuideBanner.f6413c = i + 1;
        return i;
    }

    public HagridUsageGuideBanner(Context context) {
        this(context, null);
        c(context);
    }

    public HagridUsageGuideBanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        c(context);
    }

    public HagridUsageGuideBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6413c = 0;
        this.f6412b = new Handler();
        this.e = 0;
        this.i = 0;
        this.g = new Runnable() { // from class: com.huawei.health.device.ui.measure.view.HagridUsageGuideBanner.4
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("HagridUsageGuideBanner", "Runnable mViewPager:", Integer.valueOf(HagridUsageGuideBanner.this.f6413c));
                if (HagridUsageGuideBanner.this.h == null || HagridUsageGuideBanner.this.h.getChildCount() <= 1) {
                    HagridUsageGuideBanner.this.f6411a = false;
                    if (HagridUsageGuideBanner.this.h != null) {
                        LogUtil.a("HagridUsageGuideBanner", "Runnable mViewPager count is :", Integer.valueOf(HagridUsageGuideBanner.this.h.getChildCount()));
                        return;
                    } else {
                        LogUtil.j("HagridUsageGuideBanner", "Runnable mViewPager is null");
                        return;
                    }
                }
                HagridUsageGuideBanner.this.f6411a = true;
                HagridUsageGuideBanner.this.f6412b.postDelayed(this, 5000L);
                HagridUsageGuideBanner.c(HagridUsageGuideBanner.this);
                HagridUsageGuideBanner.this.h.setCurrentItem(HagridUsageGuideBanner.this.f6413c, true);
            }
        };
        c(context);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        View viewFindViewWithTag = findViewWithTag(Integer.valueOf(this.h.getCurrentItem()));
        if (viewFindViewWithTag != null) {
            viewFindViewWithTag.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
            this.e = viewFindViewWithTag.getMeasuredHeight();
            this.i = viewFindViewWithTag.getMeasuredWidth();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.e, 1073741824));
    }

    private void c(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.fragment_hagrid_usage_guide_banner_view, this);
        this.j = viewInflate;
        this.h = (HealthViewPager) viewInflate.findViewById(R.id.guide_view_pager);
        this.d = (HealthDotsPageIndicator) this.j.findViewById(R.id.guide_dots);
        this.f = new ArrayList();
    }

    public void setViewPagerData(List<T> list, HealthViewPagerHolderCreator healthViewPagerHolderCreator) {
        b(list);
        a(healthViewPagerHolderCreator);
    }

    private void b(List<T> list) {
        if (list.size() == 0) {
            this.j.setVisibility(8);
        } else {
            this.f.addAll(list);
        }
        if (this.f.size() > 1) {
            this.d.setVisibility(0);
        } else {
            this.d.setVisibility(8);
        }
    }

    private void a(HealthViewPagerHolderCreator healthViewPagerHolderCreator) {
        this.h.setAdapter(new dux(this.f, healthViewPagerHolderCreator));
        this.h.setCurrentItem(this.f6413c);
        this.h.setOffscreenPageLimit(this.f.size());
        this.d.setViewPager(this.h);
        this.h.addOnPageChangeListener(this);
        this.h.setOnTouchListener(this);
        d();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028  */
    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent == null) {
            LogUtil.j("HagridUsageGuideBanner", "OnTouchListener onTouch event is null");
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f6411a = true;
            e();
        } else if (action == 1) {
            this.f6411a = false;
            d();
        } else if (action == 2) {
            this.f6411a = true;
            e();
        } else if (action != 3) {
            LogUtil.j("HagridUsageGuideBanner", "OnTouchListener onTouch default");
        } else {
            this.f6411a = false;
            d();
        }
        return false;
    }

    public void d() {
        LogUtil.a("HagridUsageGuideBanner", "startLoop isLoop:", Boolean.valueOf(this.f6411a), ",mViewPager is null?", Boolean.valueOf(this.h == null));
        if (this.f6411a || this.h == null) {
            return;
        }
        this.f6412b.postDelayed(this.g, 5000L);
        this.f6411a = true;
    }

    public void e() {
        LogUtil.a("HagridUsageGuideBanner", "stopLoop isLoop:", Boolean.valueOf(this.f6411a), ",mViewPager is null?", Boolean.valueOf(this.h == null));
        if (!this.f6411a || this.h == null) {
            return;
        }
        this.f6412b.removeCallbacks(this.g);
        this.f6411a = false;
    }

    public boolean b() {
        return this.f6411a;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        if (this.f6413c == i) {
            ViewGroup.LayoutParams layoutParams = this.j.getLayoutParams();
            layoutParams.height = this.e;
            layoutParams.width = this.i;
            this.j.setLayoutParams(layoutParams);
        }
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        requestLayout();
        this.f6413c = i;
        if (i == this.f.size() - 1) {
            e();
        }
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        if (i == 0) {
            this.h.setCurrentItem(this.f6413c, false);
        }
    }
}
