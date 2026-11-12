package com.huawei.basichealthmodel.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.basichealthmodel.R;
import com.huawei.basichealthmodel.callback.DateChangeListener;
import com.huawei.basichealthmodel.callback.DateSelectListener;
import com.huawei.basichealthmodel.callback.PageScrollChangeListener;
import com.huawei.basichealthmodel.callback.WeekCloverItemClickListener;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import defpackage.cah;
import defpackage.caq;
import defpackage.cbg;
import defpackage.lsl;
import defpackage.njy;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class HealthWeekCalendarGroupView extends LinearLayout implements HealthViewPager.OnPageChangeListener, DateSelectListener, WeekCloverItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f5370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthViewPager f5371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5372c;
    private HealthWeekCloverView d;
    private Context e;
    private PageScrollChangeListener f;
    private boolean g;
    private boolean h;
    private DateChangeListener i;
    private int j;
    private int k;
    private cah l;
    private int m;
    private List<HealthWeekCloverView> n;
    private HealthWeekCalendarView o;

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
    }

    public HealthWeekCalendarGroupView(Context context) {
        this(context, null);
    }

    public HealthWeekCalendarGroupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public HealthWeekCalendarGroupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = 0;
        this.f5372c = true;
        this.h = true;
        this.f5370a = true;
        this.g = false;
        this.e = context;
        int iR = cbg.r();
        this.j = iR;
        if (iR == 0) {
            this.j = DateFormatUtil.a(System.currentTimeMillis());
        }
        c(context, attributeSet);
        a(context);
    }

    private void c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HealthWeekCalendarGroupView);
        if (typedArrayObtainStyledAttributes == null) {
            return;
        }
        try {
            this.f5370a = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HealthWeekCalendarGroupView_health_week_calendar_header_visible, true);
            this.f5372c = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HealthWeekCalendarGroupView_health_week_calendar_view_clickable, true);
            this.h = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HealthWeekCalendarGroupView_health_clover_viewpager_scrollable, true);
        } catch (Resources.NotFoundException unused) {
            LogUtil.e("HL_HealthWeekCalendarGroupView", "init NotFoundException");
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setDateChangeListener(DateChangeListener dateChangeListener) {
        this.i = dateChangeListener;
    }

    public void setPageScrollChangeListener(PageScrollChangeListener pageScrollChangeListener) {
        this.f = pageScrollChangeListener;
    }

    public void setWeekData(Map<Integer, List<caq>> map, int i) {
        List<HealthWeekCloverView> list = this.n;
        if (list == null || list.size() <= 0) {
            LogUtil.j("HL_HealthWeekCalendarGroupView", "setWeekData mWeekCloverViewList can not be null");
            return;
        }
        LogUtil.a("HL_HealthWeekCalendarGroupView", "setWeekData pageNumber = ", Integer.valueOf(i));
        if (njy.c(this.n, i)) {
            List<HealthWeekCloverView> list2 = this.n;
            HealthWeekCloverView healthWeekCloverView = list2.get((list2.size() - i) - 1);
            healthWeekCloverView.setPageNumber(i);
            healthWeekCloverView.setCloverMapData(map);
        }
    }

    public void d(int i, int i2, Map<Integer, List<caq>> map, boolean z) {
        if (i2 < i) {
            LogUtil.j("HL_HealthWeekCalendarGroupView", "initExactWeekViewData endTime < beginTime");
            return;
        }
        if (map == null || map.size() <= 0) {
            LogUtil.j("HL_HealthWeekCalendarGroupView", "initExactWeekViewData map = null");
            return;
        }
        LogUtil.a("HL_HealthWeekCalendarGroupView", "initExactWeekViewData beginTime = ", Integer.valueOf(i), ", endTime = ", Integer.valueOf(i2));
        SparseIntArray sparseIntArrayE = cbg.e(i);
        if (sparseIntArrayE.size() <= 0) {
            LogUtil.a("HL_HealthWeekCalendarGroupView", "initExactWeekViewData getWeekArrayFromInt by beginTime get null");
            return;
        }
        if (sparseIntArrayE.get(i) <= 0 || sparseIntArrayE.get(i2) <= 0) {
            LogUtil.j("HL_HealthWeekCalendarGroupView", "initExactWeekViewData getWeekArrayFromInt by beginTime not contains beginTime and endTime");
            return;
        }
        this.o.setSparseArrayStrDate(cbg.f(i));
        this.o.setSparseArrayIntDate(sparseIntArrayE);
        this.o.b(z);
        this.d.setCloverToDateData(sparseIntArrayE);
        this.d.setCloverMapData(map);
    }

    private void a(Context context) {
        Object systemService = context.getSystemService("layout_inflater");
        if (!(systemService instanceof LayoutInflater)) {
            LogUtil.j("HL_HealthWeekCalendarGroupView", "initView object is null or not LayoutInflater");
            return;
        }
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.health_week_calendar_group_view, this);
        this.o = (HealthWeekCalendarView) viewInflate.findViewById(R.id.week_calendar_view);
        this.f5371b = (HealthViewPager) viewInflate.findViewById(R.id.clover_view_pager);
        this.o.setHeaderViewCanShow(this.f5370a);
        this.o.setClickAble(this.f5372c);
        this.f5371b.setIsScroll(this.h);
        this.f5371b.setIsCompatibleScrollView(true);
        this.n = new ArrayList();
        HealthWeekCloverView healthWeekCloverView = new HealthWeekCloverView(this.e);
        this.d = healthWeekCloverView;
        healthWeekCloverView.setCloverMapData(null);
        this.d.setWeekCloverItemClickListener(this);
        this.n.add(this.d);
        LogUtil.j("HL_HealthWeekCalendarGroupView", "set viewpager can Scroll = ", Boolean.valueOf(this.h));
        if (this.h) {
            this.f5371b.setOffscreenPageLimit(3);
            int iA = DateFormatUtil.a(lsl.e(System.currentTimeMillis(), 1, 0));
            LogUtil.a("HL_HealthWeekCalendarGroupView", "initView nowWeekStartDate ", Integer.valueOf(iA), " mJoinTime ", Integer.valueOf(this.j));
            if (iA > this.j) {
                HealthWeekCloverView healthWeekCloverView2 = new HealthWeekCloverView(this.e);
                healthWeekCloverView2.setPageNumber(1);
                healthWeekCloverView2.setCloverMapData(null);
                healthWeekCloverView2.setWeekCloverItemClickListener(this);
                this.n.add(0, healthWeekCloverView2);
                this.f5371b.addOnPageChangeListener(this);
            }
        }
        cah cahVar = new cah(context, this.n);
        this.l = cahVar;
        this.f5371b.setAdapter(cahVar);
        this.f5371b.setCurrentItem(this.l.getCount() - 1);
        this.o.d();
        this.o.setListener(this);
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        this.g = true;
        int count = (this.l.getCount() - 1) - i;
        this.k = count;
        int iG = cbg.g(count);
        this.m = iG;
        LogUtil.a("HL_HealthWeekCalendarGroupView", "onPageSelected mWeekPosition=", Integer.valueOf(this.k), ",mPageSelectedMonday=", Integer.valueOf(iG));
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        if (i == 0 && this.g) {
            this.g = false;
            LogUtil.a("HL_HealthWeekCalendarGroupView", "scroll has stop, must refresh calendarview");
            c();
            a();
            d();
        }
    }

    private void d() {
        if (this.f5371b.getCurrentItem() == 0) {
            LogUtil.a("HL_HealthWeekCalendarGroupView", "scroll to left， mWeekPosition = ", Integer.valueOf(this.k));
            if (this.m > this.j) {
                b();
            }
        }
    }

    private void a() {
        HealthWeekCalendarView healthWeekCalendarView;
        if (this.f == null || (healthWeekCalendarView = this.o) == null) {
            return;
        }
        int smoothSelectDate = healthWeekCalendarView.getSmoothSelectDate();
        LogUtil.a("HL_HealthWeekCalendarGroupView", "onPageScrollStateChanged send request event to HealthModelActivity smoothSelectDate = ", Integer.valueOf(smoothSelectDate));
        this.f.onScrollStateIdle(smoothSelectDate, this.k);
    }

    private void c() {
        this.o.setCountPageNumber(this.k);
        this.o.d();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    private void b() {
        HealthWeekCloverView healthWeekCloverView;
        LinkedList<View> linkedListB = this.l.b();
        if (njy.b(linkedListB)) {
            View viewPoll = linkedListB.poll();
            if ((viewPoll instanceof HealthWeekCloverView) && viewPoll.getParent() == null) {
                LogUtil.a("HL_HealthWeekCalendarGroupView", "addEmptyWeekView has view cache, getView from viewCache");
                healthWeekCloverView = (HealthWeekCloverView) viewPoll;
            } else {
                healthWeekCloverView = null;
            }
        } else {
            healthWeekCloverView = null;
        }
        if (healthWeekCloverView == null) {
            LogUtil.a("HL_HealthWeekCalendarGroupView", "addEmptyWeekView no view cache, new HealthWeekCloverView");
            healthWeekCloverView = new HealthWeekCloverView(this.e);
        }
        healthWeekCloverView.setPageNumber(this.k + 1);
        healthWeekCloverView.setCloverMapData(null);
        healthWeekCloverView.setWeekCloverItemClickListener(this);
        this.n.add(0, healthWeekCloverView);
        this.l.notifyDataSetChanged();
    }

    @Override // com.huawei.basichealthmodel.callback.DateSelectListener
    public void loadDayDataCallback(int i) {
        DateChangeListener dateChangeListener = this.i;
        if (dateChangeListener != null) {
            dateChangeListener.weekDateChangeCallback(i);
        }
    }

    public void b(List<caq> list) {
        if (njy.e(this.n)) {
            LogUtil.j("HL_HealthWeekCalendarGroupView", "notifyWeekCloverView mWeekCloverViewList = null");
        } else {
            if (njy.e(list)) {
                LogUtil.j("HL_HealthWeekCalendarGroupView", "notifyWeekCloverView list form outside is null");
                return;
            }
            LogUtil.a("HL_HealthWeekCalendarGroupView", "notifyWeekCloverView begin notify the current week clover");
            List<HealthWeekCloverView> list2 = this.n;
            list2.get(list2.size() - 1).b(list);
        }
    }

    @Override // com.huawei.basichealthmodel.callback.WeekCloverItemClickListener
    public void onCloverItemClick(int i) {
        LogUtil.a("HL_HealthWeekCalendarGroupView", "onCloverItemClick position = ", Integer.valueOf(i));
        if (!this.f5372c) {
            LogUtil.j("HL_HealthWeekCalendarGroupView", "onCloverItemClick is not support clicked event");
            return;
        }
        if (i <= 0 || i > 7) {
            LogUtil.j("HL_HealthWeekCalendarGroupView", "onCloverItemClick error position");
            return;
        }
        HealthWeekCalendarView healthWeekCalendarView = this.o;
        if (healthWeekCalendarView != null) {
            healthWeekCalendarView.e(i);
        }
    }
}
