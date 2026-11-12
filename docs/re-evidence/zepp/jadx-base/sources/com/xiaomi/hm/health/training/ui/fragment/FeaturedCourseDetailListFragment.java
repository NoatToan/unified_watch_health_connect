package com.xiaomi.hm.health.training.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.lib.view.quickadapter.BaseQuickAdapter;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.widget.toast.CustomToast;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.api.bus.TrainingBus;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseDetail;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseDetailItem;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseItem;
import com.xiaomi.hm.health.training.api.entity.Resource;
import com.xiaomi.hm.health.training.api.entity.Status;
import com.xiaomi.hm.health.training.api.entity.TrainingRecord;
import com.xiaomi.hm.health.training.api.entity.VideoRecord;
import com.xiaomi.hm.health.training.api.function.Function;
import com.xiaomi.hm.health.training.api.helper.DataConverter;
import com.xiaomi.hm.health.training.navigation.TrainingNavigationController;
import com.xiaomi.hm.health.training.ui.adapter.FeaturedCourseDetailListAdapter;
import com.xiaomi.hm.health.training.ui.fragment.FeaturedCourseDetailListFragment;
import com.xiaomi.hm.health.training.ui.helper.NetworkConfirmHelper;
import com.xiaomi.hm.health.training.ui.viewmodel.FeaturedCourseDetailViewModel;
import com.xiaomi.hm.health.training.ui.widget.FeaturedCourseListView;
import com.xiaomi.hm.health.training.ui.widget.MyItemDecoration;
import com.xiaomi.hm.health.training.utils.TrainingInjection;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public class FeaturedCourseDetailListFragment extends Fragment {
    public static final String ARG_FEATURED_COURSE_ID = "ARG_FEATURED_COURSE_ID";
    private RecyclerView a;
    private LinearLayout b;
    private TextView c;
    private FeaturedCourseListView d;
    private FeaturedCourseDetailListAdapter e;
    private ArrayList<FeaturedCourseDetailItem> f = new ArrayList<>();
    private ArrayList<FeaturedCourseItem> g = new ArrayList<>();

    @Inject
    public ViewModelProvider.Factory h;

    @Inject
    public TrainingNavigationController i;
    private FeaturedCourseDetailViewModel j;

    public class a implements FeaturedCourseListView.OnItemShowListener {
        private Set a = new HashSet();

        public a() {
        }

        @Override // com.xiaomi.hm.health.training.ui.widget.FeaturedCourseListView.OnItemShowListener
        public void OnItemShow(@NotNull FeaturedCourseItem featuredCourseItem, int i) {
            if (this.a.contains(featuredCourseItem.id)) {
                return;
            }
            Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.FEATUREDRECOMMENDCOURSE_VN).addExtra(TrainingAnalytics.ParamKey.COURSE_ID, featuredCourseItem.id).addExtra("Position", String.valueOf(i)));
            this.a.add(featuredCourseItem.id);
        }
    }

    private void i() {
        this.a.setNestedScrollingEnabled(false);
        this.a.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.a.setHasFixedSize(true);
        this.a.addItemDecoration(new MyItemDecoration(getActivity(), true, true, null));
        FeaturedCourseDetailListAdapter featuredCourseDetailListAdapter = new FeaturedCourseDetailListAdapter(this.f);
        this.e = featuredCourseDetailListAdapter;
        this.a.setAdapter(featuredCourseDetailListAdapter);
        this.e.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: z02
            @Override // com.huami.lib.view.quickadapter.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                this.a.l(baseQuickAdapter, view, i);
            }
        });
    }

    private void initViewModel() {
        if (getActivity() == null) {
            return;
        }
        this.j = (FeaturedCourseDetailViewModel) ViewModelProviders.of(getActivity(), this.h).get(FeaturedCourseDetailViewModel.class);
        TrainingBus.finishedCourseTraining().observe(this, new Observer() { // from class: y02
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.m((Resource) obj);
            }
        });
        this.j.getDetailLiveData().observe(this, new Observer() { // from class: x02
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.n((Resource) obj);
            }
        });
        this.j.getRecommendedCoursesLiveData().observe(this, new Observer() { // from class: w02
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.p((Resource) obj);
            }
        });
    }

    private void j() {
        this.h = TrainingInjection.get().getViewModelFactory();
        this.i = TrainingInjection.get().getNavigationController();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(FeaturedCourseDetailItem featuredCourseDetailItem) {
        this.j.loadVideoUrl(featuredCourseDetailItem.id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        final FeaturedCourseDetailItem item = this.e.getItem(i);
        if (item == null || getActivity() == null) {
            return;
        }
        boolean z = this.j.getParticipateStatus() && this.j.getPurchaseStatus();
        boolean z2 = i == 0;
        boolean freeStatus = this.j.getFreeStatus();
        if (!z && !z2 && !freeStatus) {
            CustomToast.showShort(getActivity(), R.string.tr_unlock_course_tips);
            return;
        }
        NetworkConfirmHelper.checkNetworkAvailableThenDo(getActivity(), new Runnable() { // from class: c12
            @Override // java.lang.Runnable
            public final void run() {
                this.a.k(item);
            }
        });
        if (!z2 || freeStatus) {
            return;
        }
        Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.VIDEO_PREVIEW_CLICK).addExtra(TrainingAnalytics.ParamKey.COURSE_ID, String.valueOf(this.j.getCourseId())).addExtra("Source", TrainingAnalytics.ParamValue.WatchDemoSource.FIRST_VIDEO));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(Resource resource) {
        if (resource == null || !resource.isComplete() || resource.getData() == null) {
            return;
        }
        u((TrainingRecord) resource.getData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(Resource resource) {
        if (resource == null || !resource.isComplete() || resource.getData() == null) {
            return;
        }
        t((FeaturedCourseDetail) resource.getData());
    }

    public static FeaturedCourseDetailListFragment newInstance() {
        return new FeaturedCourseDetailListFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(FeaturedCourseItem featuredCourseItem, int i) {
        if (getActivity() != null) {
            this.j.setCourseId(featuredCourseItem.id);
            Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.FEATUREDRECOMMENDCOURSE_CN).addExtra(TrainingAnalytics.ParamKey.COURSE_ID, String.valueOf(this.j.getCourseId())).addExtra("Position", String.valueOf(i)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(Resource resource) {
        if (resource == null || resource.getStatus() != Status.SUCCESS || resource.getData() == null) {
            return;
        }
        this.g.clear();
        this.g.addAll((Collection) resource.getData());
        if (this.g.isEmpty()) {
            if (this.b.getVisibility() != 8) {
                this.b.setVisibility(8);
            }
        } else if (this.b.getVisibility() != 0) {
            this.b.setVisibility(0);
            this.d.setCourseItems(DataConverter.getLimitFeaturedCourses(this.g, 6));
            this.d.setOnItemClickListener(new FeaturedCourseListView.OnItemClickListener() { // from class: b12
                @Override // com.xiaomi.hm.health.training.ui.widget.FeaturedCourseListView.OnItemClickListener
                public final void onItemClick(FeaturedCourseItem featuredCourseItem, int i) {
                    this.a.o(featuredCourseItem, i);
                }
            });
            this.d.setOnItemShowListener(new a());
            Analytics.recordEvent(new CountEventBuilder("FeaturedRecommend_VN").addExtra(TrainingAnalytics.ParamKey.PAGE_SOURCE, TrainingAnalytics.ParamValue.PageSource.FEATURED_COURSE_DETAIL));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(View view) {
        if (getActivity() != null) {
            this.i.navigateToFeaturedCourseRecommendedList(getActivity(), this.g);
            Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.FEATUREDRECOMMENDMORE_CN).addExtra(TrainingAnalytics.ParamKey.PAGE_SOURCE, TrainingAnalytics.ParamValue.PageSource.FEATURED_COURSE_DETAIL));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ VideoRecord r(TrainingRecord trainingRecord, String str) {
        for (VideoRecord videoRecord : trainingRecord.watchedVideos) {
            if (TextUtils.equals(videoRecord.id, String.valueOf(str))) {
                return videoRecord;
            }
        }
        return null;
    }

    private void s() {
        Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.COURSE_VIDEO_LIST_VIEWNUM).addExtra(TrainingAnalytics.ParamKey.COURSE_ID, String.valueOf(this.j.getCourseId())));
    }

    private void t(@Nullable FeaturedCourseDetail featuredCourseDetail) {
        List<FeaturedCourseDetailItem> list;
        if (this.e == null || featuredCourseDetail == null || (list = featuredCourseDetail.videos) == null || list.isEmpty()) {
            return;
        }
        this.e.setStatus(featuredCourseDetail.isPurchase, featuredCourseDetail.isParticipate, featuredCourseDetail.isFree);
        if (this.f == null) {
            this.f = new ArrayList<>();
        }
        this.f.clear();
        this.f.addAll(featuredCourseDetail.videos);
        this.e.notifyDataSetChanged();
    }

    private void u(@NonNull final TrainingRecord trainingRecord) {
        if (this.e == null) {
            return;
        }
        Function function = new Function() { // from class: a12
            @Override // com.xiaomi.hm.health.training.api.function.Function
            public final Object apply(Object obj) {
                return FeaturedCourseDetailListFragment.r(trainingRecord, (String) obj);
            }
        };
        for (FeaturedCourseDetailItem featuredCourseDetailItem : this.e.getData()) {
            VideoRecord videoRecord = (VideoRecord) function.apply(featuredCourseDetailItem.id);
            if (videoRecord != null) {
                featuredCourseDetailItem.participantNumber = Long.valueOf(featuredCourseDetailItem.participantNumber.longValue() + ((long) videoRecord.watchedCount));
            }
        }
        this.e.notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getUserVisibleHint()) {
            s();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        j();
        initViewModel();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_featured_course_detail_list, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.a = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.c = (TextView) view.findViewById(R.id.tv_more_courses);
        this.d = (FeaturedCourseListView) view.findViewById(R.id.recommended_courses);
        this.b = (LinearLayout) view.findViewById(R.id.recommended_layout);
        this.c.setOnClickListener(new View.OnClickListener() { // from class: v02
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.q(view2);
            }
        });
        i();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!z || getView() == null) {
            return;
        }
        s();
    }
}
