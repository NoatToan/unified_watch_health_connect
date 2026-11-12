package com.xiaomi.hm.health.training.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelProviders;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.api.entity.Resource;
import com.xiaomi.hm.health.training.api.entity.Status;
import com.xiaomi.hm.health.training.api.entity.TrainingKnowledge;
import com.xiaomi.hm.health.training.navigation.NavigationController;
import com.xiaomi.hm.health.training.ui.adapter.TrainingKnowledgeListAdapter;
import com.xiaomi.hm.health.training.ui.viewmodel.TrainingKnowledgeListViewModel;
import com.xiaomi.hm.health.training.ui.widget.CustomSmartRefreshLayout;
import com.xiaomi.hm.health.training.ui.widget.LinearLayoutDecoration;
import com.xiaomi.hm.health.training.utils.TrainingInjection;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;
import java.util.Objects;
import javax.inject.Inject;

/* JADX INFO: loaded from: classes21.dex */
public class TrainingKnowledgeListFragment extends Fragment {

    @Inject
    public ViewModelProvider.Factory a;

    @Inject
    public NavigationController b;
    private TrainingKnowledgeListViewModel c;
    private CustomSmartRefreshLayout d;
    private RecyclerView e;
    private TrainingKnowledgeListAdapter f;
    private boolean g = false;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Status.values().length];
            a = iArr;
            try {
                iArr[Status.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Status.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Status.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void e(View view) {
        this.d = (CustomSmartRefreshLayout) view.findViewById(R.id.refresh_layout);
        this.e = (RecyclerView) view.findViewById(R.id.recycler_view);
    }

    private void f() {
        this.e.setLayoutManager(new LinearLayoutManager(getContext()));
        LinearLayoutDecoration linearLayoutDecoration = new LinearLayoutDecoration(getContext(), 1, R.dimen.divider, R.color.black20);
        int i = R.dimen.divider_size_dp8;
        linearLayoutDecoration.setExtraPaddingStart(i);
        linearLayoutDecoration.setExtraPaddingEnd(i);
        linearLayoutDecoration.setExtraColor(R.color.white100);
        this.e.addItemDecoration(linearLayoutDecoration);
        TrainingKnowledgeListAdapter trainingKnowledgeListAdapter = new TrainingKnowledgeListAdapter(new Runnable() { // from class: ax7
            @Override // java.lang.Runnable
            public final void run() {
                this.a.i();
            }
        });
        this.f = trainingKnowledgeListAdapter;
        this.e.setAdapter(trainingKnowledgeListAdapter);
        this.e.setHasFixedSize(true);
        this.f.setOnItemClickListener(new TrainingKnowledgeListAdapter.OnItemClickListener() { // from class: zw7
            @Override // com.xiaomi.hm.health.training.ui.adapter.TrainingKnowledgeListAdapter.OnItemClickListener
            public final void onItemClick(TrainingKnowledgeListAdapter trainingKnowledgeListAdapter2, View view, int i2, TrainingKnowledge trainingKnowledge) {
                this.a.j(trainingKnowledgeListAdapter2, view, i2, trainingKnowledge);
            }
        });
        LiveData<Resource<Void>> networkState = this.c.getNetworkState();
        final TrainingKnowledgeListAdapter trainingKnowledgeListAdapter2 = this.f;
        Objects.requireNonNull(trainingKnowledgeListAdapter2);
        networkState.observe(this, new Observer() { // from class: ww7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                trainingKnowledgeListAdapter2.setNetworkState((Resource) obj);
            }
        });
    }

    private void g() {
        this.d.setEnableRefresh(true);
        this.d.setEnableLoadmore(false);
        this.d.setOnRefreshListener(new OnRefreshListener() { // from class: yw7
            @Override // com.scwang.smartrefresh.layout.listener.OnRefreshListener
            public final void onRefresh(RefreshLayout refreshLayout) {
                this.a.k(refreshLayout);
            }
        });
        this.c.getRefreshState().observe(this, new Observer() { // from class: xw7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.l((Resource) obj);
            }
        });
    }

    private void h() {
        this.a = TrainingInjection.get().getViewModelFactory();
        this.b = TrainingInjection.get().getNavigationController();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        this.c.retry();
    }

    private void initViewModel() {
        this.c = (TrainingKnowledgeListViewModel) ViewModelProviders.of(this, this.a).get(TrainingKnowledgeListViewModel.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(TrainingKnowledgeListAdapter trainingKnowledgeListAdapter, View view, int i, TrainingKnowledge trainingKnowledge) {
        TrainingAnalytics.event(view.getContext(), TrainingAnalytics.EventId.TRAININGKNOWLEDGE_CLICK, trainingKnowledge.title);
        this.b.navigateToWebPage(getContext(), trainingKnowledge.articleUrl, trainingKnowledge.title);
        Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.HEALTH_NEWS_CONTENT_C).addExtra("ID", String.valueOf(trainingKnowledge.id)).addExtra("Position", String.valueOf(i)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(RefreshLayout refreshLayout) {
        this.c.refresh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(Resource resource) {
        if (resource != null) {
            int i = a.a[resource.getStatus().ordinal()];
            if (i == 1) {
                this.d.startRefreshingAnim();
            } else if (i == 2) {
                this.d.finishRefresh(true);
            } else {
                if (i != 3) {
                    return;
                }
                this.d.finishRefresh(false);
            }
        }
    }

    private void m() {
        if (this.g) {
            return;
        }
        LiveData<PagedList<TrainingKnowledge>> pagedList = this.c.getPagedList();
        final TrainingKnowledgeListAdapter trainingKnowledgeListAdapter = this.f;
        Objects.requireNonNull(trainingKnowledgeListAdapter);
        pagedList.observe(this, new Observer() { // from class: vw7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                trainingKnowledgeListAdapter.submitList((PagedList) obj);
            }
        });
        this.g = true;
        this.d.autoRefresh(200);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getUserVisibleHint()) {
            m();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        h();
        initViewModel();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R.layout.tr_fragment_refresh_list, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        e(view);
        f();
        g();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.HEALTH_NEWS_V));
            if (getView() != null) {
                m();
            }
        }
    }
}
