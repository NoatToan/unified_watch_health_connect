package com.huawei.health.suggestion.ui.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.adapter.FitnessActionTypeRecyAdapter;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.AtomicAction;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.btx;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class FitnessActionSearchFragmentRecycleView extends Fragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FitnessActionTypeRecyAdapter f9541c;
    private FitSearchFragmentRecyclerView.LoadMoreListener d;
    private HealthRecycleView e;

    public void a() {
    }

    public void d() {
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.sug_fragment_fit_search_recycler, viewGroup, false);
        c(viewInflate);
        c();
        return viewInflate;
    }

    private void c(View view) {
        this.e = (HealthRecycleView) view.findViewById(R.id.search_recyclerView);
    }

    private void c() {
        FitnessActionTypeRecyAdapter fitnessActionTypeRecyAdapter = new FitnessActionTypeRecyAdapter(this.e, null);
        this.f9541c = fitnessActionTypeRecyAdapter;
        fitnessActionTypeRecyAdapter.a(null);
        this.e.setAdapter(this.f9541c);
        this.e.setLayoutManager(new LinearLayoutManager(btx.c()));
        this.e.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.huawei.health.suggestion.ui.fragment.FitnessActionSearchFragmentRecycleView.3
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                if (!ViewCompat.canScrollVertically(recyclerView, 1) && FitnessActionSearchFragmentRecycleView.this.f9541c.d() != 0) {
                    if (FitnessActionSearchFragmentRecycleView.this.d != null) {
                        FitnessActionSearchFragmentRecycleView.this.d.loadMore();
                        return;
                    }
                    return;
                }
                LogUtil.j("Suggestion_FitnessActionSearchFragmentRecycleView", "addOnScrollListener RecyclerView can not scroll");
            }
        });
    }

    public void e() {
        this.f9541c.a();
    }

    public int b() {
        return this.f9541c.d();
    }

    public void d(FitSearchFragmentRecyclerView.LoadMoreListener loadMoreListener) {
        this.d = loadMoreListener;
    }

    public void c(List<AtomicAction> list) {
        if (list != null) {
            this.f9541c.b(list);
        } else {
            this.f9541c.a();
        }
    }
}
