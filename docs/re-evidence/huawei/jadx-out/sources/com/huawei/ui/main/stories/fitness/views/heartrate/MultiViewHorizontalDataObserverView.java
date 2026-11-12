package com.huawei.ui.main.stories.fitness.views.heartrate;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.icommon.IChartLayerHolder;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.views.base.chart.IScrollChartOuterObserver;
import com.huawei.ui.main.stories.fitness.views.base.chart.ObserveredClassifiedView;
import com.huawei.ui.main.stories.fitness.views.base.chart.icommon.IFocusObserverItem;
import defpackage.njy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class MultiViewHorizontalDataObserverView extends LinearLayout implements IScrollChartOuterObserver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HwHealthChartHolder.c f27293c = new HwHealthChartHolder.c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ObserveredClassifiedView f27294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ScrollChartHorizontalObserverHRView f27295b;
    protected boolean d;
    protected Map<HwHealthChartHolder.c, HwHealthBaseBarLineDataSet> e;
    private c f;
    protected List<ScrollChartHorizontalObserverHRView> g;
    protected List<HwHealthChartHolder.c> h;
    private List<OnSelectListener> i;
    protected d j;
    private HealthRecycleView l;
    private f m;
    private List<Integer> n;
    private List<Integer> o;

    public interface OnSelectListener {
        void onSelect(View view, int i);
    }

    public MultiViewHorizontalDataObserverView(Context context) {
        super(context);
        this.h = new ArrayList(10);
        this.g = new ArrayList(10);
        this.j = new d();
        this.e = new HashMap(10);
        this.d = false;
        this.f27295b = null;
        this.o = new ArrayList(10);
        this.n = new ArrayList(10);
        this.i = new ArrayList(10);
        b();
        c();
    }

    public MultiViewHorizontalDataObserverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = new ArrayList(10);
        this.g = new ArrayList(10);
        this.j = new d();
        this.e = new HashMap(10);
        this.d = false;
        this.f27295b = null;
        this.o = new ArrayList(10);
        this.n = new ArrayList(10);
        this.i = new ArrayList(10);
        b();
        c();
    }

    public MultiViewHorizontalDataObserverView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = new ArrayList(10);
        this.g = new ArrayList(10);
        this.j = new d();
        this.e = new HashMap(10);
        this.d = false;
        this.f27295b = null;
        this.o = new ArrayList(10);
        this.n = new ArrayList(10);
        this.i = new ArrayList(10);
        b();
        c();
    }

    private void b() {
        this.o.clear();
        this.o.add(Integer.valueOf(R.drawable.selector_popup_window_top));
        this.o.add(Integer.valueOf(R.drawable.selector_popup_window_center));
        this.o.add(Integer.valueOf(R.drawable.selector_popup_window_center));
        this.o.add(Integer.valueOf(R.drawable.selector_popup_window_bottom));
        this.n.clear();
        this.n.add(Integer.valueOf(R.drawable.selector_popup_window_top_current));
        this.n.add(Integer.valueOf(R.drawable.selector_popup_window_center_current));
        this.n.add(Integer.valueOf(R.drawable.selector_popup_window_center_current));
        this.n.add(Integer.valueOf(R.drawable.selector_popup_window_bottom_current));
    }

    public void setHost(ObserveredClassifiedView observeredClassifiedView) {
        this.f27294a = observeredClassifiedView;
    }

    private void c() {
        inflate(getContext(), R.layout.multi_view_data_observer_view, this);
        this.f = new c();
        this.m = null;
        HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.observer_view_container);
        this.l = healthRecycleView;
        healthRecycleView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.l.setAdapter(this.f);
    }

    class c extends RecyclerView.Adapter {
        private c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 0) {
                return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.multi_view_data_observer_view_divider, (ViewGroup) null));
            }
            return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.multi_view_horizontal_data_observer_view_item, (ViewGroup) null));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (i < 0 || i >= getItemCount()) {
                LogUtil.e("Health_MultiViewHorizontalDataObserverView", "onBindViewHolder position is wrong");
            } else {
                if (getItemViewType(i) == 0 || !(viewHolder instanceof a)) {
                    return;
                }
                ((a) viewHolder).a(MultiViewHorizontalDataObserverView.this.g.get(i / 2));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return (MultiViewHorizontalDataObserverView.this.g.size() * 2) - 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return i % 2 == 0 ? 1 : 0;
        }
    }

    static class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private LinearLayout f27297c;

        a(View view) {
            super(view);
            this.f27297c = (LinearLayout) view.findViewById(R.id.observer_view_item_place);
        }

        public void a(ScrollChartHorizontalObserverHRView scrollChartHorizontalObserverHRView) {
            if (scrollChartHorizontalObserverHRView == null) {
                return;
            }
            ViewParent parent = scrollChartHorizontalObserverHRView.getParent();
            if (parent instanceof ViewGroup) {
                LogUtil.j("Health_MultiViewHorizontalDataObserverView", "specifyObserverView():parent removeView");
                ((ViewGroup) parent).removeView(scrollChartHorizontalObserverHRView);
            }
            this.f27297c.removeAllViews();
            this.f27297c.addView(scrollChartHorizontalObserverHRView);
        }
    }

    static class b extends RecyclerView.ViewHolder {
        b(View view) {
            super(view);
        }
    }

    protected class f implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected List<? extends View> f27300a;
        private OnSelectListener d;

        f(List<? extends View> list) {
            if (list == null) {
                LogUtil.e("Health_MultiViewHorizontalDataObserverView", "init SingleSelectViewsMgr with wrong views,system error");
                return;
            }
            this.f27300a = list;
            Iterator<? extends View> it = list.iterator();
            while (it.hasNext()) {
                it.next().setOnClickListener(this);
            }
        }

        public boolean d() {
            return !MultiViewHorizontalDataObserverView.this.j.f27298a || MultiViewHorizontalDataObserverView.this.j.d == null;
        }

        public void b() {
            MultiViewHorizontalDataObserverView.this.j.f27298a = false;
            MultiViewHorizontalDataObserverView.this.j.d = null;
        }

        public void d(int i) {
            if (njy.e(this.f27300a, i)) {
                LogUtil.e("Health_MultiViewHorizontalDataObserverView", "set current item with wrong index, pls check.");
            }
            e(this.f27300a.get(i));
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e(view);
        }

        public void e(View view) {
            if (!(view instanceof ScrollChartHorizontalObserverHRView)) {
                LogUtil.e("Health_MultiViewHorizontalDataObserverView", "the select view is wrong type, pls check");
                return;
            }
            for (int i = 0; i < this.f27300a.size(); i++) {
                View view2 = this.f27300a.get(i);
                if (njy.c(MultiViewHorizontalDataObserverView.this.o, i)) {
                    view2.setBackgroundResource(((Integer) MultiViewHorizontalDataObserverView.this.o.get(i)).intValue());
                }
                view2.setClickable(true);
            }
            if (!this.f27300a.contains(view)) {
                LogUtil.e("Health_MultiViewHorizontalDataObserverView", "The input viewArg is not in the view set.");
                return;
            }
            int iIndexOf = this.f27300a.indexOf(view);
            if (njy.c(MultiViewHorizontalDataObserverView.this.n, iIndexOf)) {
                view.setBackgroundResource(((Integer) MultiViewHorizontalDataObserverView.this.n.get(iIndexOf)).intValue());
            }
            MultiViewHorizontalDataObserverView.this.f27295b = (ScrollChartHorizontalObserverHRView) view;
            this.d.onSelect(view, iIndexOf);
        }

        public void e() {
            for (HwHealthChartHolder.c cVar : MultiViewHorizontalDataObserverView.this.h) {
                HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSetFakeDataLayer = MultiViewHorizontalDataObserverView.this.f27294a.fakeDataLayer(cVar);
                if (cVar != MultiViewHorizontalDataObserverView.f27293c) {
                    b(cVar, hwHealthBaseBarLineDataSetFakeDataLayer);
                    MultiViewHorizontalDataObserverView.this.e.put(cVar, hwHealthBaseBarLineDataSetFakeDataLayer);
                }
            }
        }

        protected void b(HwHealthChartHolder.c cVar, HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet) {
            if (MultiViewHorizontalDataObserverView.this.f27294a == null || cVar == null || hwHealthBaseBarLineDataSet == null) {
                LogUtil.e("Health_MultiViewHorizontalDataObserverView", "the host view has not attached, pls attached first");
                return;
            }
            IChartLayerHolder iChartLayerHolderAcquireChartLayerHolder = MultiViewHorizontalDataObserverView.this.f27294a.acquireChartLayerHolder();
            if (!(iChartLayerHolderAcquireChartLayerHolder instanceof HwHealthScrollChartHolder)) {
                LogUtil.e("Health_MultiViewHorizontalDataObserverView", "not support scrollable,init focus now only support scrollable chart!!!");
            } else {
                MultiViewHorizontalDataObserverView.this.f27294a.manageDataSetAsProxy(hwHealthBaseBarLineDataSet, ((HwHealthScrollChartHolder) iChartLayerHolderAcquireChartLayerHolder).acquireStorageHelper(), MultiViewHorizontalDataObserverView.this.f27294a.getStepDataType(), cVar);
            }
        }

        protected void e(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet) {
            if (MultiViewHorizontalDataObserverView.this.f27294a == null || hwHealthBaseBarLineDataSet == null) {
                LogUtil.e("Health_MultiViewHorizontalDataObserverView", "the host view has not attached, pls attached first");
            } else {
                MultiViewHorizontalDataObserverView.this.f27294a.unManageDataSetAsProxy(hwHealthBaseBarLineDataSet);
            }
        }

        public void e(OnSelectListener onSelectListener) {
            this.d = onSelectListener;
        }

        public void e(int i) throws e {
            if (njy.e(MultiViewHorizontalDataObserverView.this.h, i)) {
                throw new RuntimeException("Health_MultiViewHorizontalDataObserverViewThe show mode index is out of the bounds");
            }
            HwHealthChartHolder.c cVar = MultiViewHorizontalDataObserverView.this.h.get(i);
            if (cVar == MultiViewHorizontalDataObserverView.f27293c) {
                throw new e();
            }
            HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet = MultiViewHorizontalDataObserverView.this.e.get(cVar);
            MultiViewHorizontalDataObserverView.this.f27294a.addDataLayer(hwHealthBaseBarLineDataSet, cVar);
            e(hwHealthBaseBarLineDataSet);
            MultiViewHorizontalDataObserverView.this.j.a(new d.a(hwHealthBaseBarLineDataSet, cVar));
            MultiViewHorizontalDataObserverView.this.j.c(true);
        }

        public void a() {
            if (d()) {
                return;
            }
            d.a aVar = MultiViewHorizontalDataObserverView.this.j.d;
            MultiViewHorizontalDataObserverView.this.f27294a.removeDataLayer(aVar.f27299a);
            b(aVar.e, aVar.f27299a);
            b();
        }
    }

    public void b(List<ScrollChartHorizontalObserverHRView> list, List<HwHealthChartHolder.c> list2, boolean z) {
        if (njy.e(list) || njy.e(list2)) {
            LogUtil.e("Health_MultiViewHorizontalDataObserverView", "observerViews or showModes is empty.");
            return;
        }
        int i = 0;
        for (ScrollChartHorizontalObserverHRView scrollChartHorizontalObserverHRView : list) {
            if (!(scrollChartHorizontalObserverHRView instanceof IFocusObserverItem)) {
                LogUtil.e("Health_MultiViewHorizontalDataObserverView", "enableObserverView give to multiView need impls IFocusObserverItem");
                return;
            } else {
                int iA = a(scrollChartHorizontalObserverHRView.getTitle());
                if (iA > i) {
                    i = iA;
                }
            }
        }
        if (i > 0) {
            for (ScrollChartHorizontalObserverHRView scrollChartHorizontalObserverHRView2 : list) {
                if (scrollChartHorizontalObserverHRView2.getTitle() != null) {
                    scrollChartHorizontalObserverHRView2.getTitle().setMinimumWidth(i);
                }
            }
        }
        this.g.clear();
        this.g.addAll(list);
        this.h.clear();
        this.h.addAll(list2);
        this.f.notifyDataSetChanged();
        b(z);
    }

    public void setCurrentItem(int i) {
        f fVar = this.m;
        if (fVar != null) {
            fVar.d(i);
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.IScrollChartOuterObserver
    public void onRangeShow(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, int i, int i2) {
        Iterator<ScrollChartHorizontalObserverHRView> it = this.g.iterator();
        while (it.hasNext()) {
            it.next().onRangeShow(hwHealthBaseScrollBarLineChart, i, i2);
        }
    }

    protected static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f27298a = false;
        private a d = null;

        protected d() {
        }

        public boolean e() {
            return this.f27298a;
        }

        public void c(boolean z) {
            this.f27298a = z;
        }

        public a d() {
            return this.d;
        }

        public void a(a aVar) {
            this.d = aVar;
        }

        static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private HwHealthBaseBarLineDataSet f27299a;
            private HwHealthChartHolder.c e;

            a(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, HwHealthChartHolder.c cVar) {
                this.f27299a = hwHealthBaseBarLineDataSet;
                this.e = cVar;
            }

            public HwHealthChartHolder.c b() {
                return this.e;
            }
        }
    }

    private void b(boolean z) {
        this.d = z;
    }

    private void d() {
        if (this.d) {
            f fVarA = a(this.g);
            this.m = fVarA;
            fVarA.e();
            this.m.e(new OnSelectListener() { // from class: com.huawei.ui.main.stories.fitness.views.heartrate.MultiViewHorizontalDataObserverView.5
                @Override // com.huawei.ui.main.stories.fitness.views.heartrate.MultiViewHorizontalDataObserverView.OnSelectListener
                public void onSelect(View view, int i) {
                    if (!MultiViewHorizontalDataObserverView.this.m.d()) {
                        MultiViewHorizontalDataObserverView.this.m.a();
                    }
                    try {
                        MultiViewHorizontalDataObserverView.this.m.e(i);
                    } catch (e unused) {
                        MultiViewHorizontalDataObserverView.this.m.a();
                    }
                    Iterator it = MultiViewHorizontalDataObserverView.this.i.iterator();
                    while (it.hasNext()) {
                        ((OnSelectListener) it.next()).onSelect(view, i);
                    }
                }
            });
            this.m.d(0);
            this.m.b();
        }
    }

    protected f a(List<ScrollChartHorizontalObserverHRView> list) {
        return new f(list);
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.IScrollChartOuterObserver
    public void initChartLinkage() {
        d();
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.IScrollChartOuterObserver
    public IFocusObserverItem acquireFocusItem() {
        ViewParent viewParent = this.f27295b;
        if (!(viewParent instanceof IFocusObserverItem)) {
            LogUtil.e("Health_MultiViewHorizontalDataObserverView", "the focus observer view is not instance of IFocusObserverItem");
            return null;
        }
        return (IFocusObserverItem) viewParent;
    }

    public static class e extends Exception {
        private static final long serialVersionUID = 8885490331373485667L;

        e() {
            super("rest show layer");
        }
    }

    private int a(HealthTextView healthTextView) {
        if (healthTextView == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        healthTextView.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        return healthTextView.getMeasuredWidth();
    }
}
