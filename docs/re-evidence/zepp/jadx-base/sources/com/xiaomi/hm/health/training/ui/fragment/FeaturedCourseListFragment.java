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
import com.huami.lib.view.ViewUtils;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.api.bus.TrainingBus;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseListItem;
import com.xiaomi.hm.health.training.api.entity.Resource;
import com.xiaomi.hm.health.training.api.entity.SimpleFeaturedCourse;
import com.xiaomi.hm.health.training.api.entity.Status;
import com.xiaomi.hm.health.training.api.function.Supplier;
import com.xiaomi.hm.health.training.api.util.Loggers;
import com.xiaomi.hm.health.training.navigation.NavigationController;
import com.xiaomi.hm.health.training.ui.adapter.FeaturedCourseListAdapter;
import com.xiaomi.hm.health.training.ui.decoration.SpacingDecoration;
import com.xiaomi.hm.health.training.ui.fragment.FeaturedCourseListFragment;
import com.xiaomi.hm.health.training.ui.viewmodel.FeaturedCourseListViewModel;
import com.xiaomi.hm.health.training.ui.widget.CustomSmartRefreshLayout;
import com.xiaomi.hm.health.training.utils.Const;
import com.xiaomi.hm.health.training.utils.TrainingInjection;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;
import java.util.Objects;
import javax.inject.Inject;

/* JADX INFO: loaded from: classes21.dex */
public class FeaturedCourseListFragment extends Fragment {
    private static final String h = Const.LOG_TAG_PREFIX + FeaturedCourseListFragment.class.getSimpleName();

    @Inject
    public ViewModelProvider.Factory a;

    @Inject
    public NavigationController b;
    private FeaturedCourseListViewModel c;
    private CustomSmartRefreshLayout d;
    private RecyclerView e;
    private FeaturedCourseListAdapter f;
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

    private void i(View view) {
        this.d = (CustomSmartRefreshLayout) view.findViewById(R.id.refresh_layout);
        this.e = (RecyclerView) view.findViewById(R.id.recycler_view);
    }

    private void initViewModel() {
        this.c = (FeaturedCourseListViewModel) ViewModelProviders.of(this, this.a).get(FeaturedCourseListViewModel.class);
        TrainingBus.joinedFeaturedCourse().observe(this, new Observer() { // from class: x12
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.r((Resource) obj);
            }
        });
        TrainingBus.exitedFeaturedCourse().observe(this, new Observer() { // from class: y12
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.t((SimpleFeaturedCourse) obj);
            }
        });
    }

    private void j() {
        this.e.setLayoutManager(new LinearLayoutManager(getContext()));
        this.e.addItemDecoration(new SpacingDecoration(0, (int) ViewUtils.dp2px(this.e.getContext(), 8.0f), false));
        FeaturedCourseListAdapter featuredCourseListAdapter = new FeaturedCourseListAdapter(new Runnable() { // from class: d22
            @Override // java.lang.Runnable
            public final void run() {
                this.a.m();
            }
        });
        this.f = featuredCourseListAdapter;
        this.e.setAdapter(featuredCourseListAdapter);
        this.f.setOnItemClickListener(new FeaturedCourseListAdapter.OnItemClickListener() { // from class: c22
            @Override // com.xiaomi.hm.health.training.ui.adapter.FeaturedCourseListAdapter.OnItemClickListener
            public final void onItemClick(FeaturedCourseListAdapter featuredCourseListAdapter2, View view, int i, FeaturedCourseListItem featuredCourseListItem) {
                this.a.n(featuredCourseListAdapter2, view, i, featuredCourseListItem);
            }
        });
        LiveData<Resource<Void>> networkState = this.c.getNetworkState();
        final FeaturedCourseListAdapter featuredCourseListAdapter2 = this.f;
        Objects.requireNonNull(featuredCourseListAdapter2);
        networkState.observe(this, new Observer() { // from class: v12
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                featuredCourseListAdapter2.setNetworkState((Resource) obj);
            }
        });
    }

    private void k() {
        this.d.setEnableRefresh(true);
        this.d.setEnableLoadmore(false);
        this.d.setOnRefreshListener(new OnRefreshListener() { // from class: z12
            @Override // com.scwang.smartrefresh.layout.listener.OnRefreshListener
            public final void onRefresh(RefreshLayout refreshLayout) {
                this.a.o(refreshLayout);
            }
        });
        this.d.autoRefresh(200);
        this.c.getRefreshState().observe(this, new Observer() { // from class: w12
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.p((Resource) obj);
            }
        });
    }

    private void l() {
        this.a = TrainingInjection.get().getViewModelFactory();
        this.b = TrainingInjection.get().getNavigationController();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        this.c.retry();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(FeaturedCourseListAdapter featuredCourseListAdapter, View view, int i, FeaturedCourseListItem featuredCourseListItem) {
        this.b.navigateToFeaturedCourseDetail(getContext(), featuredCourseListItem.id);
        Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.FEATURED_ARTICLE_CONTENT_C).addExtra(TrainingAnalytics.ParamKey.COURSE_ID, featuredCourseListItem.id).addExtra("Position", String.valueOf(i)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(RefreshLayout refreshLayout) {
        this.c.refresh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(Resource resource) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object q(Resource resource) {
        return "精品课程列表页监听到用户参加了精品课程，" + resource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(final Resource resource) {
        Loggers.getLogger().v(h, new Supplier() { // from class: a22
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return FeaturedCourseListFragment.q(resource);
            }
        });
        this.c.refresh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object s(SimpleFeaturedCourse simpleFeaturedCourse) {
        return "精品课程列表页监听到用户退出了精品课程，" + simpleFeaturedCourse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(final SimpleFeaturedCourse simpleFeaturedCourse) {
        Loggers.getLogger().v(h, new Supplier() { // from class: b22
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return FeaturedCourseListFragment.s(simpleFeaturedCourse);
            }
        });
        this.c.refresh();
    }

    private void u() {
        if (this.g) {
            return;
        }
        LiveData<PagedList<FeaturedCourseListItem>> pagedList = this.c.getPagedList();
        final FeaturedCourseListAdapter featuredCourseListAdapter = this.f;
        Objects.requireNonNull(featuredCourseListAdapter);
        pagedList.observe(this, new Observer() { // from class: u12
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                featuredCourseListAdapter.submitList((PagedList) obj);
            }
        });
        this.g = true;
        this.d.autoRefresh(200);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getUserVisibleHint()) {
            u();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        l();
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
        i(view);
        j();
        k();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.FEATURED_ARTICLE_V));
            if (getView() != null) {
                u();
            }
        }
    }
}
