package com.huawei.ui.main.stories.health.temperature.view.levelcard;

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
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.main.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class MultiViewDataObserverView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f28148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f28150c;
    private int d;
    protected List<ScrollCardParentView> e;
    private int f;
    private int g;
    private HealthRecycleView h;
    private OnSelectListener i;
    private int j;
    private View m;
    private View o;

    public interface OnSelectListener {
        void onSelect(String str, boolean z);
    }

    public MultiViewDataObserverView(Context context) {
        super(context);
        this.e = new ArrayList();
        this.d = 0;
        b();
    }

    private void b() {
        inflate(getContext(), R.layout.layout_blood_sugar_charteye, this);
        this.e = new ArrayList();
        this.f28150c = new c();
        View view = new View(getContext());
        this.o = view;
        view.setMinimumWidth((int) Utils.convertDpToPixel(0.5f));
        this.o.setMinimumHeight((int) Utils.convertDpToPixel(32.0f));
        LogUtil.d("MultiViewDataObserverView", "mViewDivider height ", Integer.valueOf(this.o.getMinimumHeight()), "mViewDivider width ", Integer.valueOf(this.o.getMinimumWidth()));
        View view2 = new View(getContext());
        this.m = view2;
        view2.setMinimumWidth((int) Utils.convertDpToPixel(0.5f));
        this.m.setMinimumHeight((int) Utils.convertDpToPixel(32.0f));
        HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.observer_view_container);
        this.h = healthRecycleView;
        healthRecycleView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.h.setAdapter(this.f28150c);
    }

    class c extends RecyclerView.Adapter {
        private c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-2, MultiViewDataObserverView.this.o.getMinimumHeight());
            if (i == 0) {
                View view = new View(MultiViewDataObserverView.this.getContext());
                view.setMinimumWidth(MultiViewDataObserverView.this.o.getMinimumWidth());
                view.setMinimumHeight(MultiViewDataObserverView.this.o.getMinimumHeight());
                view.setLayoutParams(layoutParams);
                return new e(view);
            }
            if (i == 2) {
                View view2 = new View(MultiViewDataObserverView.this.getContext());
                view2.setMinimumWidth(MultiViewDataObserverView.this.m.getMinimumWidth());
                view2.setMinimumHeight(MultiViewDataObserverView.this.m.getMinimumHeight());
                view2.setLayoutParams(layoutParams);
                return new b(view2);
            }
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_bloodsugar_charteye_placeholder, viewGroup, false);
            MultiViewDataObserverView.this.a(viewGroup, viewInflate);
            return new d(viewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2;
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                if (viewHolder instanceof e) {
                    viewHolder.itemView.setMinimumWidth(MultiViewDataObserverView.this.o.getMinimumWidth());
                    viewHolder.itemView.setMinimumHeight(MultiViewDataObserverView.this.o.getMinimumHeight());
                    return;
                }
                return;
            }
            if (itemViewType == 2) {
                if (viewHolder instanceof b) {
                    LogUtil.d("MultiViewDataObserverView", Integer.valueOf(i), "mViewEdge.getMinimumWidth() ", Integer.valueOf(MultiViewDataObserverView.this.m.getMinimumWidth()));
                    viewHolder.itemView.setMinimumWidth(MultiViewDataObserverView.this.m.getMinimumWidth() + ((Integer) BaseActivity.getSafeRegionWidth().first).intValue());
                    viewHolder.itemView.setMinimumHeight(MultiViewDataObserverView.this.m.getMinimumHeight());
                    return;
                }
                return;
            }
            if (!(viewHolder instanceof d) || (i2 = i / 2) >= MultiViewDataObserverView.this.e.size()) {
                return;
            }
            ((d) viewHolder).e(MultiViewDataObserverView.this.e.get(i2));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return MultiViewDataObserverView.this.e.size() + MultiViewDataObserverView.this.e.size() + 1;
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
        for (ScrollCardParentView scrollCardParentView : this.e) {
            if (scrollCardParentView instanceof ScrollCardParentView) {
                scrollCardParentView.setClickable(true);
                ScrollCardParentView scrollCardParentView2 = scrollCardParentView;
                c(scrollCardParentView2, getDefaultTitleColor(), getDefaultColor(), getDefaultBackground());
                setViewListener(scrollCardParentView2);
            }
        }
        if (view instanceof ScrollCardParentView) {
            ScrollCardParentView scrollCardParentView3 = (ScrollCardParentView) view;
            c(scrollCardParentView3, getSelectColor(), getSelectColor(), getSelectBackground());
            scrollCardParentView3.setClickable(false);
            scrollCardParentView3.setOnClickListener(null);
            this.f28150c.notifyDataSetChanged();
        }
    }

    private void c(ScrollCardParentView scrollCardParentView, int i, int i2, int i3) {
        if (scrollCardParentView == null) {
            LogUtil.j("MultiViewDataObserverView", "setViewResource cardView is null.");
            return;
        }
        scrollCardParentView.setBackgroundResource(i3);
        scrollCardParentView.setTextColor(scrollCardParentView.getTitle(), i);
        scrollCardParentView.setTextColor(scrollCardParentView.getDataTextView(), i2);
        scrollCardParentView.setTextColor(scrollCardParentView.getUnitTextView(), i2);
    }

    private void setViewListener(ScrollCardParentView scrollCardParentView) {
        scrollCardParentView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.temperature.view.levelcard.MultiViewDataObserverView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MultiViewDataObserverView.this.setSelectIndex(view);
                MultiViewDataObserverView.this.f28150c.notifyDataSetChanged();
                if (MultiViewDataObserverView.this.i == null || !(view instanceof ScrollCardParentView)) {
                    return;
                }
                MultiViewDataObserverView.this.i.onSelect(((ScrollCardParentView) view).getType() + "", true);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ViewGroup viewGroup, View view) {
        if (viewGroup == null || view == null) {
            LogUtil.j("MultiViewDataObserverView", "adaptView input parameters can't be null.");
        } else {
            view.setLayoutParams(new FrameLayout.LayoutParams(this.d, -2));
        }
    }

    static class d extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private LinearLayout f28152b;

        d(View view) {
            super(view);
            this.f28152b = null;
            this.f28152b = (LinearLayout) view.findViewById(R.id.observer_view_item_place);
        }

        public void e(ScrollCardParentView scrollCardParentView) {
            if (scrollCardParentView != null && (scrollCardParentView.getParent() instanceof ViewGroup)) {
                ((ViewGroup) scrollCardParentView.getParent()).removeView(scrollCardParentView);
            }
            this.f28152b.removeAllViews();
            this.f28152b.addView(scrollCardParentView);
        }
    }

    static class e extends RecyclerView.ViewHolder {
        e(View view) {
            super(view);
        }
    }

    static class b extends RecyclerView.ViewHolder {
        b(View view) {
            super(view);
        }
    }

    public void setListener(OnSelectListener onSelectListener) {
        this.i = onSelectListener;
    }

    public void setCardWidth(int i) {
        this.d = i;
    }

    public View c() {
        return this.o;
    }

    public View e() {
        return this.m;
    }

    public void b(List<ScrollCardParentView> list) {
        this.e.clear();
        this.e.addAll(list);
        this.f28150c.notifyDataSetChanged();
    }

    public int getDefaultColor() {
        return this.f28148a;
    }

    public void setDefaultColor(int i) {
        this.f28148a = i;
    }

    public int getDefaultTitleColor() {
        return this.f;
    }

    public void setDefaultTitleColor(int i) {
        this.f = i;
    }

    public int getSelectColor() {
        return this.j;
    }

    public void setSelectColor(int i) {
        this.j = i;
    }

    public int getDefaultBackground() {
        return this.f28149b;
    }

    public void setDefaultBackground(int i) {
        this.f28149b = i;
    }

    public int getSelectBackground() {
        return this.g;
    }

    public void setSelectBackground(int i) {
        this.g = i;
    }
}
