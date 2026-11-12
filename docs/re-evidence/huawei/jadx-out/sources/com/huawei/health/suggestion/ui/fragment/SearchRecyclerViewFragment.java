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
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.btx;
import defpackage.ien;

/* JADX INFO: loaded from: classes31.dex */
public class SearchRecyclerViewFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FitSearchRecyAdapter f9550a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthRecycleView f9551c;
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
        HealthRecycleView healthRecycleView = this.f9551c;
        if (healthRecycleView == null || this.f9550a == null) {
            return;
        }
        healthRecycleView.setAdapter(null);
        this.f9551c.setLayoutManager(null);
        this.f9551c.setAdapter(this.f9550a);
        ien.b(btx.c(), this.f9551c);
        this.f9550a.notifyDataSetChanged();
    }

    private void b(View view) {
        this.f9551c = (HealthRecycleView) view.findViewById(R.id.search_recyclerView);
    }

    private void e() {
        this.f9551c.setItemAnimator(new DefaultItemAnimator());
        FitSearchRecyAdapter fitSearchRecyAdapter = new FitSearchRecyAdapter(getActivity());
        this.f9550a = fitSearchRecyAdapter;
        this.f9551c.setAdapter(fitSearchRecyAdapter);
        ien.b(btx.c(), this.f9551c);
        this.f9551c.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.huawei.health.suggestion.ui.fragment.SearchRecyclerViewFragment.4
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                if (ViewCompat.canScrollVertically(recyclerView, 1) || SearchRecyclerViewFragment.this.f9550a.e() == 0 || SearchRecyclerViewFragment.this.e == null) {
                    return;
                }
                SearchRecyclerViewFragment.this.e.loadMore();
            }
        });
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }
}
