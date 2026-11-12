package com.huawei.ui.main.stories.health.views.charteye;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.main.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class MultiViewDataObserverView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f28209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected List<ScrollChartParentView> f28210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28211c;
    private int d;
    private int e;
    private OnSelectListener f;
    private HealthRecycleView g;
    private int h;
    private int i;
    private boolean j;
    private View l;
    private String m;
    private View o;

    public interface OnSelectListener {
        void onSelect(String str);
    }

    public MultiViewDataObserverView(Context context, boolean z) {
        super(context);
        this.f28210b = new ArrayList();
        this.f28211c = 0;
        this.j = z;
        c();
    }

    private void c() {
        inflate(getContext(), R.layout.layout_blood_sugar_charteye, this);
        this.f28210b = new ArrayList();
        this.f28209a = new c();
        View view = new View(getContext());
        this.l = view;
        view.setMinimumWidth((int) Utils.convertDpToPixel(0.5f));
        this.l.setMinimumHeight((int) Utils.convertDpToPixel(32.0f));
        View view2 = new View(getContext());
        this.o = view2;
        view2.setMinimumWidth((int) Utils.convertDpToPixel(0.5f));
        this.o.setMinimumHeight((int) Utils.convertDpToPixel(32.0f));
        this.g = (HealthRecycleView) findViewById(R.id.observer_view_container);
        LogUtil.d("MultiViewDataObserverView", "mRecyclerView is scroll ", Boolean.valueOf(this.j));
        if (!this.j) {
            this.g.setNestedScrollingEnabled(false);
            this.g.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            this.g.setIsScroll(false);
        } else {
            this.g.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        }
        this.g.setAdapter(this.f28209a);
    }

    class c extends RecyclerView.Adapter {
        private c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-2, MultiViewDataObserverView.this.l.getMinimumHeight());
            if (i == 0) {
                View view = new View(MultiViewDataObserverView.this.getContext());
                view.setMinimumWidth(MultiViewDataObserverView.this.l.getMinimumWidth());
                view.setMinimumHeight(MultiViewDataObserverView.this.l.getMinimumHeight());
                view.setLayoutParams(layoutParams);
                return new b(view);
            }
            if (i == 2) {
                View view2 = new View(MultiViewDataObserverView.this.getContext());
                view2.setMinimumWidth(MultiViewDataObserverView.this.o.getMinimumWidth());
                view2.setMinimumHeight(MultiViewDataObserverView.this.o.getMinimumHeight());
                view2.setLayoutParams(layoutParams);
                return new d(view2);
            }
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_bloodsugar_charteye_placeholder, viewGroup, false);
            MultiViewDataObserverView.this.a(viewGroup, viewInflate);
            return new e(viewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2;
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                if (viewHolder instanceof b) {
                    viewHolder.itemView.setMinimumWidth(MultiViewDataObserverView.this.l.getMinimumWidth());
                    viewHolder.itemView.setMinimumHeight(MultiViewDataObserverView.this.l.getMinimumHeight());
                    return;
                }
                return;
            }
            if (itemViewType == 2) {
                if (viewHolder instanceof d) {
                    viewHolder.itemView.setMinimumWidth(MultiViewDataObserverView.this.o.getMinimumWidth());
                    viewHolder.itemView.setMinimumHeight(MultiViewDataObserverView.this.o.getMinimumHeight());
                    return;
                }
                return;
            }
            if (!(viewHolder instanceof e) || (i2 = i / 2) >= MultiViewDataObserverView.this.f28210b.size()) {
                return;
            }
            ((e) viewHolder).b(MultiViewDataObserverView.this.f28210b.get(i2));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return MultiViewDataObserverView.this.f28210b.size() + MultiViewDataObserverView.this.f28210b.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            if (i == 0 || i == getItemCount() - 1) {
                return 2;
            }
            return (i < 0 || i % 2 != 1) ? 0 : 1;
        }
    }

    public void setSelectIndex(View view) {
        for (ScrollChartParentView scrollChartParentView : this.f28210b) {
            if (scrollChartParentView instanceof ScrollChartParentView) {
                scrollChartParentView.setClickable(true);
                ScrollChartParentView scrollChartParentView2 = scrollChartParentView;
                c(scrollChartParentView2, getDefaultColor(), getDefaultBackground());
                setViewListener(scrollChartParentView2);
                if ("BLOOD_SUGAR_FINGER_TIP".equals(scrollChartParentView2.getType()) && scrollChartParentView2.getArrowView() != null) {
                    scrollChartParentView2.getArrowView().setImageResource(R.drawable.bloodsugar_down_arrow_black);
                }
            }
        }
        if (view instanceof ScrollChartParentView) {
            ScrollChartParentView scrollChartParentView3 = (ScrollChartParentView) view;
            LogUtil.d("MultiViewDataObserverView", "setSelectIndex ", scrollChartParentView3.getType());
            setSelectedType(scrollChartParentView3.getType());
            c(scrollChartParentView3, getSelectColor(), getSelectBackground());
            scrollChartParentView3.setClickable(false);
            scrollChartParentView3.setOnClickListener(null);
            e(scrollChartParentView3);
            if ("BLOOD_SUGAR_FINGER_TIP".equals(scrollChartParentView3.getType()) && scrollChartParentView3.getArrowView() != null) {
                scrollChartParentView3.getArrowView().setImageResource(R.drawable.bloodsugar_down_arrow);
            }
            this.f28209a.notifyDataSetChanged();
        }
    }

    private void setViewListener(ScrollChartParentView scrollChartParentView) {
        scrollChartParentView.setOnClickListener(new View.OnClickListener() { // from class: vfg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51028a.c(view);
            }
        });
    }

    public /* synthetic */ void c(View view) {
        setSelectIndex(view);
        this.f28209a.notifyDataSetChanged();
        OnSelectListener onSelectListener = this.f;
        if (onSelectListener == null || !(view instanceof ScrollChartParentView)) {
            return;
        }
        onSelectListener.onSelect(((ScrollChartParentView) view).getType() + "");
    }

    public void e(ScrollChartParentView scrollChartParentView) {
        if (this.f != null) {
            LogUtil.d("MultiViewDataObserverView", "refreshSubView ", scrollChartParentView.getType());
            this.f.onSelect(scrollChartParentView.getType() + "");
        }
    }

    private void c(ScrollChartParentView scrollChartParentView, int i, int i2) {
        if (scrollChartParentView == null) {
            LogUtil.j("MultiViewDataObserverView", "setViewResource cardView is null.");
            return;
        }
        scrollChartParentView.setBackgroundResource(i2);
        scrollChartParentView.setTextColor(scrollChartParentView.getTitle(), i);
        scrollChartParentView.setTextColor(scrollChartParentView.getDataView(), i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ViewGroup viewGroup, View view) {
        if (viewGroup == null || view == null) {
            LogUtil.j("MultiViewDataObserverView", "adaptView input parameters can't be null.");
        } else {
            view.setLayoutParams(new FrameLayout.LayoutParams(this.f28211c, -2));
        }
    }

    static class e extends RecyclerView.ViewHolder {
        private LinearLayout e;

        e(View view) {
            super(view);
            this.e = null;
            this.e = (LinearLayout) view.findViewById(R.id.observer_view_item_place);
        }

        public void b(ScrollChartParentView scrollChartParentView) {
            if (scrollChartParentView != null && (scrollChartParentView.getParent() instanceof ViewGroup)) {
                ((ViewGroup) scrollChartParentView.getParent()).removeView(scrollChartParentView);
            }
            this.e.removeAllViews();
            this.e.addView(scrollChartParentView);
        }
    }

    static class b extends RecyclerView.ViewHolder {
        b(View view) {
            super(view);
        }
    }

    static class d extends RecyclerView.ViewHolder {
        d(View view) {
            super(view);
        }
    }

    public void setListener(OnSelectListener onSelectListener) {
        this.f = onSelectListener;
    }

    public void setCardWidth(int i) {
        this.f28211c = i;
    }

    public View b() {
        return this.l;
    }

    public View a() {
        return this.o;
    }

    public void a(List<ScrollChartParentView> list) {
        this.f28210b.clear();
        this.f28210b.addAll(list);
        this.f28209a.notifyDataSetChanged();
    }

    public int getDefaultColor() {
        return this.e;
    }

    public void setDefaultColor(int i) {
        this.e = i;
    }

    public int getSelectColor() {
        return this.i;
    }

    public void setSelectColor(int i) {
        this.i = i;
    }

    public int getDefaultBackground() {
        return this.d;
    }

    public void setDefaultBackground(int i) {
        this.d = i;
    }

    public int getSelectBackground() {
        return this.h;
    }

    public void setSelectBackground(int i) {
        this.h = i;
    }

    public String getSelectedType() {
        return this.m;
    }

    public void setSelectedType(String str) {
        this.m = str;
    }
}
