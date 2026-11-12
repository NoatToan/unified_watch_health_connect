package com.huawei.ui.main.stories.fitness.views.base.chart;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.huawei.ui.commonui.chartanimation.TweenAnimatiionMgr;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.icommon.IChartLayerHolder;
import com.huawei.ui.commonui.viewpager.HealthNativeViewPager;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.views.base.chart.icommon.IFocusObserverItem;
import com.huawei.ui.main.stories.fitness.views.base.chart.utils.IOnDataShowListener;
import com.huawei.ui.main.stories.fitness.views.base.chart.utils.UserEvent;
import com.huawei.ui.main.stories.fitness.views.heartrate.card.CardContainerView;
import defpackage.njy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class ClassifiedViewList extends LinearLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f27127c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ObserveredClassifiedView f27128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OnClassifiedViewChangeListener f27129b;
    private ClassifiedButtonList d;
    private a e;
    private List<ClassifiedView> f;
    private PagerAdapter g;
    private HealthNativeViewPager h;
    private TweenAnimatiionMgr i;
    private IOnDataShowListener j;

    public interface ClassifiedView {
        String acquireDataLayerIndex();

        void enableObserverView(ScrollChartObserverView scrollChartObserverView);

        String getClassStr();

        DataInfos getStepDataType();

        void init(IChartLayerHolder iChartLayerHolder);

        void loadTweenAnimatiionMgr(TweenAnimatiionMgr tweenAnimatiionMgr);

        ObserveredClassifiedView onCreateView();

        void onSelected();

        void selectDataLayerId(String str);

        void setOnDataShowListener(IOnDataShowListener iOnDataShowListener);
    }

    public interface IChartLayerHolderAdapter {
        IChartLayerHolder acquireAdapter(ClassifiedView classifiedView);
    }

    public interface OnClassifiedViewChangeListener {
        void onClassifiedViewSelected(View view, int i);
    }

    public ClassifiedViewList(Context context) {
        super(context);
        this.f = new ArrayList();
        this.e = null;
        this.i = null;
        this.j = null;
        b();
        f();
    }

    public ClassifiedViewList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new ArrayList();
        this.e = null;
        this.i = null;
        this.j = null;
        b();
        f();
    }

    public ClassifiedViewList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new ArrayList();
        this.e = null;
        this.i = null;
        this.j = null;
        b();
        f();
    }

    public ClassifiedViewList(Context context, ClassifiedButtonList classifiedButtonList, HealthNativeViewPager healthNativeViewPager) {
        super(context);
        this.f = new ArrayList();
        this.e = null;
        this.i = null;
        this.j = null;
        this.d = classifiedButtonList;
        this.h = healthNativeViewPager;
        f();
    }

    public Bitmap c() {
        ObserveredClassifiedView observeredClassifiedView = this.f27128a;
        if (observeredClassifiedView == null) {
            return null;
        }
        return observeredClassifiedView.drawChart();
    }

    public IFocusObserverItem d() {
        ObserveredClassifiedView observeredClassifiedView = this.f27128a;
        if (observeredClassifiedView == null) {
            return null;
        }
        ScrollChartObserverView scrollChartObserverViewAcquireScrollChartObserverView = observeredClassifiedView.acquireScrollChartObserverView();
        if (scrollChartObserverViewAcquireScrollChartObserverView instanceof CardContainerView) {
            return scrollChartObserverViewAcquireScrollChartObserverView.acquireFocusItem();
        }
        throw new RuntimeException("current not support " + scrollChartObserverViewAcquireScrollChartObserverView + " for focus view");
    }

    private void b() {
        inflate(getContext(), R.layout.view_classified_list, this);
        this.d = (ClassifiedButtonList) findViewById(R.id.classified_button_list);
        this.h = (HealthNativeViewPager) findViewById(R.id.classified_view_place);
    }

    private void f() {
        e eVar = new e();
        this.g = eVar;
        this.h.setAdapter(eVar);
        this.h.setIsAutoCurrentItemHeight(true);
        this.h.setIsScroll(false);
        this.h.setOffscreenPageLimit(4);
        TweenAnimatiionMgr tweenAnimatiionMgr = new TweenAnimatiionMgr();
        this.i = tweenAnimatiionMgr;
        tweenAnimatiionMgr.d(TweenAnimatiionMgr.UserLevelView.CHART_DAY);
        this.i.b(new TweenAnimatiionMgr.OnSwitchLevelView() { // from class: com.huawei.ui.main.stories.fitness.views.base.chart.ClassifiedViewList.1
            @Override // com.huawei.ui.commonui.chartanimation.TweenAnimatiionMgr.OnSwitchLevelView
            public void onNotifySwitchStatus(TweenAnimatiionMgr.UserLevelView userLevelView, TweenAnimatiionMgr.UserLevelView userLevelView2, float f) {
                if (f == 0.0f) {
                    ClassifiedViewList.this.d.a(ClassifiedViewList.this.b(userLevelView2));
                    ClassifiedViewList.this.h.setCurrentItem(ClassifiedViewList.this.b(userLevelView2));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b(TweenAnimatiionMgr.UserLevelView userLevelView) {
        for (int i = 0; i < this.f.size(); i++) {
            if (TweenAnimatiionMgr.UserLevelView.query(this.f.get(i).getStepDataType()) == userLevelView) {
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TweenAnimatiionMgr.UserLevelView b(int i) {
        return TweenAnimatiionMgr.UserLevelView.query(this.f.get(i).getStepDataType());
    }

    public void b(List<ClassifiedView> list, IChartLayerHolder iChartLayerHolder, ClassifiedView classifiedView) {
        c(list, iChartLayerHolder);
        this.i.d(TweenAnimatiionMgr.UserLevelView.query(classifiedView.getStepDataType()));
    }

    public void c(List<ClassifiedView> list, IChartLayerHolder iChartLayerHolder) {
        this.h.removeAllViews();
        this.h.clearOnPageChangeListeners();
        this.f.clear();
        this.f.addAll(list);
        a aVar = this.e;
        if (aVar != null) {
            aVar.c();
        }
        if (this.e == null) {
            this.e = new a();
        }
        this.e.e();
        if (this.f.size() > 0) {
            this.e.e(this.f.get(0).getStepDataType());
            if (this.f.get(0) instanceof ObserveredClassifiedView) {
                this.f27128a = (ObserveredClassifiedView) this.f.get(0);
            }
        }
        this.d.b(this.f, new ClassifiedButtonList.OnSwitchClassifies() { // from class: com.huawei.ui.main.stories.fitness.views.base.chart.ClassifiedViewList.4
            @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ClassifiedButtonList.OnSwitchClassifies
            public void onSwitchClassifies(ClassifiedView classifiedView) {
                ClassifiedViewList.this.h.setCurrentItem(ClassifiedViewList.this.f.indexOf(classifiedView));
                TweenAnimatiionMgr tweenAnimatiionMgr = ClassifiedViewList.this.i;
                ClassifiedViewList classifiedViewList = ClassifiedViewList.this;
                tweenAnimatiionMgr.d(classifiedViewList.b(classifiedViewList.f.indexOf(classifiedView)));
            }
        });
        this.h.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.huawei.ui.main.stories.fitness.views.base.chart.ClassifiedViewList.3
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                ClassifiedViewList.this.d.a(i);
                if (!njy.c(ClassifiedViewList.this.f, i) || ClassifiedViewList.this.f.get(i) == null) {
                    return;
                }
                if (ClassifiedViewList.this.f27129b != null) {
                    ClassifiedViewList.this.f27129b.onClassifiedViewSelected((View) ClassifiedViewList.this.f.get(i), i);
                }
                if (ClassifiedViewList.this.f.get(i) instanceof ObserveredClassifiedView) {
                    ClassifiedViewList classifiedViewList = ClassifiedViewList.this;
                    classifiedViewList.f27128a = (ObserveredClassifiedView) classifiedViewList.f.get(i);
                }
                ((ClassifiedView) ClassifiedViewList.this.f.get(i)).onSelected();
            }
        });
        setViewForAdapter(iChartLayerHolder);
    }

    private void setViewForAdapter(IChartLayerHolder iChartLayerHolder) {
        for (ClassifiedView classifiedView : this.f) {
            if (classifiedView != null) {
                classifiedView.init(iChartLayerHolder);
            }
        }
        this.g.notifyDataSetChanged();
        this.h.setCurrentItem(0);
        for (ClassifiedView classifiedView2 : this.f) {
            if (classifiedView2 != null) {
                classifiedView2.setOnDataShowListener(this.e);
                classifiedView2.loadTweenAnimatiionMgr(this.i);
            }
        }
        this.g.notifyDataSetChanged();
        for (ClassifiedView classifiedView3 : this.f) {
            if (classifiedView3 != null) {
                classifiedView3.onCreateView().openJumpableFeature(this.i);
            }
        }
    }

    public void b(List<ClassifiedView> list, IChartLayerHolderAdapter iChartLayerHolderAdapter) {
        this.h.clearOnPageChangeListeners();
        this.f.clear();
        this.f.addAll(list);
        a aVar = this.e;
        if (aVar != null) {
            aVar.c();
        }
        if (this.e == null) {
            this.e = new a();
        }
        this.e.e();
        if (this.f.size() > 0) {
            this.e.e(this.f.get(0).getStepDataType());
            if (this.f.get(0) instanceof ObserveredClassifiedView) {
                this.f27128a = (ObserveredClassifiedView) this.f.get(0);
            }
        }
        this.d.b(this.f, new ClassifiedButtonList.OnSwitchClassifies() { // from class: com.huawei.ui.main.stories.fitness.views.base.chart.ClassifiedViewList.2
            @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ClassifiedButtonList.OnSwitchClassifies
            public void onSwitchClassifies(ClassifiedView classifiedView) {
                ClassifiedViewList.this.h.setCurrentItem(ClassifiedViewList.this.f.indexOf(classifiedView));
                TweenAnimatiionMgr tweenAnimatiionMgr = ClassifiedViewList.this.i;
                ClassifiedViewList classifiedViewList = ClassifiedViewList.this;
                tweenAnimatiionMgr.d(classifiedViewList.b(classifiedViewList.f.indexOf(classifiedView)));
            }
        });
        this.h.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.huawei.ui.main.stories.fitness.views.base.chart.ClassifiedViewList.5
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                ClassifiedViewList.this.d.a(i);
                if (!njy.c(ClassifiedViewList.this.f, i) || ClassifiedViewList.this.f.get(i) == null) {
                    return;
                }
                if (ClassifiedViewList.this.f.get(i) instanceof ObserveredClassifiedView) {
                    ClassifiedViewList classifiedViewList = ClassifiedViewList.this;
                    classifiedViewList.f27128a = (ObserveredClassifiedView) classifiedViewList.f.get(i);
                }
                if (ClassifiedViewList.this.f27129b != null) {
                    ClassifiedViewList.this.f27129b.onClassifiedViewSelected((View) ClassifiedViewList.this.f.get(i), i);
                }
                ((ClassifiedView) ClassifiedViewList.this.f.get(i)).onSelected();
            }
        });
        e(list, iChartLayerHolderAdapter);
    }

    private void e(List<ClassifiedView> list, IChartLayerHolderAdapter iChartLayerHolderAdapter) {
        IChartLayerHolder iChartLayerHolderAcquireAdapter;
        for (ClassifiedView classifiedView : list) {
            if (classifiedView != null && (iChartLayerHolderAcquireAdapter = iChartLayerHolderAdapter.acquireAdapter(classifiedView)) != null) {
                classifiedView.init(iChartLayerHolderAcquireAdapter);
            }
        }
        this.g.notifyDataSetChanged();
        this.h.setCurrentItem(0);
        for (ClassifiedView classifiedView2 : this.f) {
            if (classifiedView2 != null) {
                classifiedView2.setOnDataShowListener(this.e);
                classifiedView2.loadTweenAnimatiionMgr(this.i);
            }
        }
        this.g.notifyDataSetChanged();
        for (ClassifiedView classifiedView3 : this.f) {
            if (classifiedView3 != null) {
                classifiedView3.onCreateView().openJumpableFeature(this.i);
            }
        }
    }

    class e extends PagerAdapter {
        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        private e() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return ClassifiedViewList.this.f.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            if (njy.e(ClassifiedViewList.this.f, i) || ClassifiedViewList.this.f.get(i) == null) {
                return null;
            }
            ObserveredClassifiedView observeredClassifiedViewOnCreateView = ((ClassifiedView) ClassifiedViewList.this.f.get(i)).onCreateView();
            ViewParent parent = observeredClassifiedViewOnCreateView.getParent();
            if (parent == null) {
                viewGroup.addView(observeredClassifiedViewOnCreateView, -1, -2);
                return observeredClassifiedViewOnCreateView;
            }
            if (parent == viewGroup) {
                return observeredClassifiedViewOnCreateView;
            }
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(observeredClassifiedViewOnCreateView);
            }
            viewGroup.addView(observeredClassifiedViewOnCreateView, -1, -2);
            return observeredClassifiedViewOnCreateView;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(Object obj) {
            return ClassifiedViewList.this.f.contains(obj) ? -1 : -2;
        }
    }

    public void e(IOnDataShowListener iOnDataShowListener) {
        synchronized (f27127c) {
            this.j = iOnDataShowListener;
        }
    }

    class a implements IOnDataShowListener {
        private final Map<DataInfos, d> d = new HashMap();
        private DataInfos e = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private DataInfos f27133b = null;

        a() {
        }

        public void e() {
            ClassifiedViewList.this.h.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.huawei.ui.main.stories.fitness.views.base.chart.ClassifiedViewList.a.2
                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrollStateChanged(int i) {
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrolled(int i, float f, int i2) {
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageSelected(int i) {
                    if (njy.e(ClassifiedViewList.this.f, i) || ClassifiedViewList.this.f.get(i) == null) {
                        return;
                    }
                    DataInfos stepDataType = ((ClassifiedView) ClassifiedViewList.this.f.get(i)).getStepDataType();
                    synchronized (ClassifiedViewList.f27127c) {
                        a.this.f27133b = stepDataType;
                        if (stepDataType == a.this.e) {
                            d dVar = (d) a.this.d.get(stepDataType);
                            if (dVar == null) {
                                return;
                            }
                            synchronized (ClassifiedViewList.f27127c) {
                                if (ClassifiedViewList.this.j != null) {
                                    ClassifiedViewList.this.j.onDataShowChanged(dVar.f27135a, dVar.d, dVar.f27136c, dVar.e);
                                }
                            }
                        }
                    }
                }
            });
        }

        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.utils.IOnDataShowListener
        public void onUserEvent(UserEvent userEvent) {
            synchronized (ClassifiedViewList.f27127c) {
                if (ClassifiedViewList.this.j != null) {
                    ClassifiedViewList.this.j.onUserEvent(userEvent);
                }
            }
        }

        @Override // com.huawei.ui.main.stories.fitness.views.base.chart.utils.IOnDataShowListener
        public void onDataShowChanged(DataInfos dataInfos, int i, int i2, HwHealthBaseBarLineChart hwHealthBaseBarLineChart) {
            synchronized (ClassifiedViewList.f27127c) {
                this.d.put(dataInfos, new d(dataInfos, i, i2, hwHealthBaseBarLineChart));
                this.e = dataInfos;
                if (this.f27133b == dataInfos && ClassifiedViewList.this.j != null) {
                    ClassifiedViewList.this.j.onDataShowChanged(dataInfos, i, i2, hwHealthBaseBarLineChart);
                }
            }
        }

        public void c() {
            synchronized (ClassifiedViewList.f27127c) {
                this.d.clear();
                this.f27133b = null;
                this.e = null;
            }
        }

        public void e(DataInfos dataInfos) {
            synchronized (ClassifiedViewList.f27127c) {
                this.f27133b = dataInfos;
            }
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        DataInfos f27135a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f27136c;
        int d;
        HwHealthBaseBarLineChart e;

        d(DataInfos dataInfos, int i, int i2, HwHealthBaseBarLineChart hwHealthBaseBarLineChart) {
            this.f27135a = dataInfos;
            this.d = i;
            this.f27136c = i2;
            this.e = hwHealthBaseBarLineChart;
        }
    }

    public String e() {
        ObserveredClassifiedView observeredClassifiedView = this.f27128a;
        if (observeredClassifiedView == null) {
            return "";
        }
        return observeredClassifiedView.acquireTimeRangeText();
    }

    public void setOnClassifiedViewChangeListener(OnClassifiedViewChangeListener onClassifiedViewChangeListener) {
        this.f27129b = onClassifiedViewChangeListener;
    }
}
