package com.huawei.ui.main.stories.fitness.views.heartrate.card;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.icommon.IChartLayerHolder;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.views.base.chart.ObserveredClassifiedView;
import com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverView;
import com.huawei.ui.main.stories.fitness.views.base.chart.icommon.IFocusObserverItem;
import defpackage.njy;
import defpackage.qqp;
import defpackage.qrs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class CardContainerView extends ScrollChartObserverView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected List<ScrollChartObserverView> f27315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected List<HwHealthChartHolder.c> f27316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected c f27317c;
    protected ScrollChartObserverView d;
    protected Map<HwHealthChartHolder.c, HwHealthBaseBarLineDataSet> e;
    private HealthRecycleView f;
    private int g;
    private e h;
    private d i;
    private List<OnSelectListener> j;
    private View k;
    private View m;

    public interface OnSelectListener {
        void onSelect(View view, int i);
    }

    public CardContainerView(Context context, ObserveredClassifiedView observeredClassifiedView) {
        super(context, observeredClassifiedView, null, null);
        this.f27316b = new ArrayList(16);
        this.f27315a = new ArrayList(16);
        this.f27317c = new c();
        this.e = new HashMap(16);
        this.d = null;
        this.j = new ArrayList();
        this.g = 0;
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverView
    public void initView(String str, String str2) {
        inflate(getContext(), R.layout.multi_view_data_observer_view, this);
        this.f27315a = new ArrayList();
        this.i = new d();
        this.h = null;
        HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.observer_view_container);
        this.f = healthRecycleView;
        healthRecycleView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f.setAdapter(this.i);
    }

    private void c() {
        this.g = getCardWidth();
        View view = new View(getContext());
        this.k = view;
        view.setMinimumWidth(getGutter());
        this.k.setMinimumHeight(qqp.a(getContext(), 32.0f));
        View view2 = new View(getContext());
        this.m = view2;
        view2.setMinimumWidth(getMargin());
        this.m.setMinimumHeight(qqp.a(getContext(), 32.0f));
    }

    class d extends RecyclerView.Adapter<b> {
        private d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 0) {
                View view = new View(CardContainerView.this.getContext());
                view.setLayoutParams(new RecyclerView.LayoutParams(CardContainerView.this.getGutter(), 1));
                return new b(view);
            }
            if (i == 2) {
                return new b(new View(CardContainerView.this.getContext()));
            }
            View viewInflate = LayoutInflater.from(CardContainerView.this.getContext()).inflate(R.layout.multi_view_data_observer_view_item, viewGroup, false);
            viewInflate.setLayoutParams(new LinearLayout.LayoutParams(CardContainerView.this.g, -2));
            return new b(viewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(b bVar, int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                bVar.itemView.setMinimumWidth(CardContainerView.this.k.getMinimumWidth());
                bVar.itemView.setMinimumHeight(CardContainerView.this.k.getMinimumHeight());
            } else if (itemViewType == 2) {
                bVar.itemView.setMinimumWidth(CardContainerView.this.m.getMinimumWidth() + ((Integer) BaseActivity.getSafeRegionWidth().first).intValue());
                bVar.itemView.setMinimumHeight(CardContainerView.this.m.getMinimumHeight());
            } else {
                c((LinearLayout) bVar.itemView.findViewById(R.id.observer_view_item_place), CardContainerView.this.f27315a.get(i / 2));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return CardContainerView.this.f27315a.size() + CardContainerView.this.f27315a.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            if (i == 0 || i == getItemCount() - 1) {
                return 2;
            }
            return (i < 0 || i % 2 != 1) ? 0 : 1;
        }

        public void c(ViewGroup viewGroup, ScrollChartObserverView scrollChartObserverView) {
            if (scrollChartObserverView != null && (scrollChartObserverView.getParent() instanceof ViewGroup)) {
                ((ViewGroup) scrollChartObserverView.getParent()).removeView(scrollChartObserverView);
            }
            viewGroup.removeAllViews();
            viewGroup.addView(scrollChartObserverView);
        }
    }

    static class b extends RecyclerView.ViewHolder {
        b(View view) {
            super(view);
        }
    }

    protected class e implements View.OnClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected List<ScrollChartObserverView> f27321c;

        public e(List<ScrollChartObserverView> list) {
            this.f27321c = list;
            Iterator<ScrollChartObserverView> it = list.iterator();
            while (it.hasNext()) {
                it.next().setOnClickListener(this);
            }
        }

        public boolean d() {
            return !CardContainerView.this.f27317c.d || CardContainerView.this.f27317c.f27318c == null;
        }

        public void b(int i) {
            b(this.f27321c.get(i));
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b(view);
        }

        public void b(View view) {
            if (view instanceof ScrollChartObserverView) {
                for (ScrollChartObserverView scrollChartObserverView : this.f27321c) {
                    scrollChartObserverView.setBackgroundResource(R.drawable.background_charteye);
                    scrollChartObserverView.setClickable(true);
                    scrollChartObserverView.setTitleColor(R.color.textColorSecondary);
                    scrollChartObserverView.setContentColor(R.color.emui_text_primary);
                }
                view.setBackgroundResource(R.drawable.bakground_charteye_select);
                CardContainerView.this.d = (ScrollChartObserverView) view;
                CardContainerView.this.d.setTitleColor(R.color.textColorPrimaryInverse);
                CardContainerView.this.d.setContentColor(R.color.textColorPrimaryInverse);
                CardContainerView.this.d.setClickable(false);
                if (this.f27321c.contains(view)) {
                    int iIndexOf = this.f27321c.indexOf(view);
                    if (!CardContainerView.this.h.d()) {
                        CardContainerView.this.h.a();
                    }
                    try {
                        CardContainerView.this.h.a(iIndexOf);
                    } catch (a unused) {
                        CardContainerView.this.h.a();
                    }
                    Iterator it = CardContainerView.this.j.iterator();
                    while (it.hasNext()) {
                        ((OnSelectListener) it.next()).onSelect(view, iIndexOf);
                    }
                }
            }
        }

        public void b() {
            for (HwHealthChartHolder.c cVar : CardContainerView.this.f27316b) {
                if (cVar == CardContainerView.this.f27316b.get(0)) {
                    if (CardContainerView.this.mHost.getChart() != null && CardContainerView.this.mHost.getChart().getData() != null && njy.b(CardContainerView.this.mHost.getChart().getData().getDataSets()) && (CardContainerView.this.mHost.getChart().getData().getDataSets().get(0) instanceof HwHealthBaseBarLineDataSet)) {
                        CardContainerView.this.e.put(cVar, (HwHealthBaseBarLineDataSet) CardContainerView.this.mHost.getChart().getData().getDataSets().get(0));
                    }
                } else {
                    HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSetFakeDataLayer = CardContainerView.this.mHost.fakeDataLayer(cVar);
                    CardContainerView.this.e.put(cVar, hwHealthBaseBarLineDataSetFakeDataLayer);
                    d(cVar, hwHealthBaseBarLineDataSetFakeDataLayer);
                }
            }
        }

        protected void d(HwHealthChartHolder.c cVar, HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet) {
            IChartLayerHolder iChartLayerHolderAcquireChartLayerHolder = CardContainerView.this.mHost.acquireChartLayerHolder();
            if (!(iChartLayerHolderAcquireChartLayerHolder instanceof HwHealthScrollChartHolder)) {
                throw new RuntimeException("not support scrollable,init focus now only support scrollable chart!!!");
            }
            CardContainerView.this.mHost.manageDataSetAsProxy(hwHealthBaseBarLineDataSet, ((HwHealthScrollChartHolder) iChartLayerHolderAcquireChartLayerHolder).acquireStorageHelper(), CardContainerView.this.mHost.getStepDataType(), cVar);
        }

        public void a(int i) throws a {
            HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet;
            if (njy.e(CardContainerView.this.f27316b, i)) {
                LogUtil.e("CardContainerView", "overLayout mShowModes, the index is out of bounds");
                return;
            }
            HwHealthChartHolder.c cVar = CardContainerView.this.f27316b.get(i);
            if (cVar == CardContainerView.this.f27316b.get(0)) {
                throw new a();
            }
            HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet2 = CardContainerView.this.e.get(cVar);
            if (HwHealthChartHolder.LAYER_ID_REST_HR.equals(cVar.a()) && !CardContainerView.this.e.isEmpty() && (hwHealthBaseBarLineDataSet = CardContainerView.this.e.get(CardContainerView.this.f27316b.get(0))) != null) {
                CardContainerView.this.mHost.removeDataLayer(hwHealthBaseBarLineDataSet);
                d(CardContainerView.this.f27316b.get(0), hwHealthBaseBarLineDataSet);
            }
            CardContainerView.this.mHost.addDataLayer(hwHealthBaseBarLineDataSet2, cVar);
            c(hwHealthBaseBarLineDataSet2);
            if (CardContainerView.this.mHost.getChart() != null) {
                CardContainerView.this.mHost.getChart().animateBorderYAuto();
            }
            CardContainerView.this.f27317c.d = true;
            CardContainerView.this.f27317c.f27318c = new c.e(hwHealthBaseBarLineDataSet2, cVar);
        }

        protected void c(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet) {
            CardContainerView.this.mHost.unManageDataSetAsProxy(hwHealthBaseBarLineDataSet);
        }

        public void a() {
            HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet;
            if (!CardContainerView.this.f27317c.d || CardContainerView.this.f27317c.f27318c == null) {
                return;
            }
            if (HwHealthChartHolder.LAYER_ID_REST_HR.equals(CardContainerView.this.f27317c.f27318c.e.a()) && !CardContainerView.this.e.isEmpty() && njy.c(CardContainerView.this.f27316b, 0) && (hwHealthBaseBarLineDataSet = CardContainerView.this.e.get(CardContainerView.this.f27316b.get(0))) != null) {
                CardContainerView.this.mHost.addDataLayer(hwHealthBaseBarLineDataSet, CardContainerView.this.f27316b.get(0));
                c(hwHealthBaseBarLineDataSet);
            }
            c.e eVar = CardContainerView.this.f27317c.f27318c;
            CardContainerView.this.mHost.removeDataLayer(eVar.f27319b);
            d(eVar.e, eVar.f27319b);
            if (CardContainerView.this.mHost.getChart() != null) {
                CardContainerView.this.mHost.getChart().animateBorderYAuto();
            }
            CardContainerView.this.f27317c.d = false;
            CardContainerView.this.f27317c.f27318c = null;
        }
    }

    public void setCurrentItem(int i) {
        e eVar = this.h;
        if (eVar != null) {
            eVar.b(i);
        }
    }

    public void b(List<ScrollChartObserverView> list, List<HwHealthChartHolder.c> list2) {
        c();
        this.f27315a.clear();
        this.f27315a.addAll(list);
        this.f27316b.clear();
        this.f27316b.addAll(list2);
        this.i.notifyDataSetChanged();
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverView
    public void onRangeShow(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, int i, int i2) {
        Iterator<ScrollChartObserverView> it = this.f27315a.iterator();
        while (it.hasNext()) {
            it.next().onRangeShow(hwHealthBaseScrollBarLineChart, i, i2);
        }
    }

    protected static class c {
        boolean d = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e f27318c = null;

        protected c() {
        }

        static class e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            HwHealthBaseBarLineDataSet f27319b;
            HwHealthChartHolder.c e;

            e(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, HwHealthChartHolder.c cVar) {
                this.f27319b = hwHealthBaseBarLineDataSet;
                this.e = cVar;
            }
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverView
    public void initChartLinkage() {
        e eVarD = d(this.f27315a);
        this.h = eVarD;
        eVarD.b();
        this.h.b(0);
        c cVar = new c();
        this.f27317c = cVar;
        cVar.d = false;
        this.f27317c.f27318c = null;
    }

    protected e d(List<ScrollChartObserverView> list) {
        return new e(list);
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverView
    public IFocusObserverItem acquireFocusItem() {
        return (IFocusObserverItem) this.d;
    }

    public void a(OnSelectListener onSelectListener) {
        this.j.add(onSelectListener);
    }

    public static class a extends Exception {
        private static final long serialVersionUID = -1714786535320703698L;

        public a() {
            super("rest show layer");
        }
    }

    public void a() {
        this.g = getCardWidth();
        this.k.setMinimumWidth(getGutter());
        this.m.setMinimumWidth(getMargin());
        d dVar = new d();
        this.i = dVar;
        this.f.setAdapter(dVar);
        this.i.notifyDataSetChanged();
    }

    private int getCardWidth() {
        int margin = getMargin();
        int gutter = getGutter();
        return (qrs.af(BaseApplication.getContext()) && qrs.t()) ? ((((qrs.q() - (margin * 2)) - (gutter * 7)) / 8) * 2) + gutter : (int) Utils.convertDpToPixel(154.0f);
    }

    private int getMargin() {
        return BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getGutter() {
        Context context = BaseApplication.getContext();
        if (qrs.af(context)) {
            return qqp.b(context);
        }
        return context.getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
    }
}
