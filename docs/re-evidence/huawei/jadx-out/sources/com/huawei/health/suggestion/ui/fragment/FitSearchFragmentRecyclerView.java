package com.huawei.health.suggestion.ui.fragment;

import android.app.Fragment;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.adapter.FitSearchRecyAdapter;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.btx;
import defpackage.ien;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class FitSearchFragmentRecyclerView extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FitSearchRecyAdapter f9539a;
    private HealthRecycleView d;
    private LoadMoreListener e;

    public interface LoadMoreListener {
        void loadMore();
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.sug_fragment_fit_search_recycler, viewGroup, false);
        b(viewInflate);
        e();
        return viewInflate;
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        HealthRecycleView healthRecycleView = this.d;
        if (healthRecycleView == null || this.f9539a == null) {
            return;
        }
        healthRecycleView.setAdapter(null);
        this.d.setLayoutManager(null);
        this.d.setAdapter(this.f9539a);
        ien.b(btx.c(), this.d);
        this.f9539a.notifyDataSetChanged();
    }

    private void b(View view) {
        this.d = (HealthRecycleView) view.findViewById(R.id.search_recyclerView);
    }

    private void e() {
        this.d.setItemAnimator(new DefaultItemAnimator());
        FitSearchRecyAdapter fitSearchRecyAdapter = new FitSearchRecyAdapter(getActivity());
        this.f9539a = fitSearchRecyAdapter;
        this.d.setAdapter(fitSearchRecyAdapter);
        ien.b(btx.c(), this.d);
        this.d.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.huawei.health.suggestion.ui.fragment.FitSearchFragmentRecyclerView.1
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                if (ViewCompat.canScrollVertically(recyclerView, 1) || FitSearchFragmentRecyclerView.this.f9539a.e() == 0 || FitSearchFragmentRecyclerView.this.e == null) {
                    return;
                }
                FitSearchFragmentRecyclerView.this.e.loadMore();
            }
        });
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public void d(List<FitWorkout> list) {
        this.f9539a.d(list);
    }

    public void d() {
        this.f9539a.c();
    }

    public void c() {
        this.f9539a.d();
    }

    public void a() {
        this.f9539a.a();
    }

    public int b() {
        return this.f9539a.e();
    }

    public void b(LoadMoreListener loadMoreListener) {
        this.e = loadMoreListener;
    }
}
