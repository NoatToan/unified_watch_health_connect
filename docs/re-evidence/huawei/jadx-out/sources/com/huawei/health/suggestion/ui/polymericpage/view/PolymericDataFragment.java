package com.huawei.health.suggestion.ui.polymericpage.view;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.braintreepayments.api.PayPalPaymentIntent;
import com.huawei.basefitnessadvice.model.FilterCondition;
import com.huawei.basefitnessadvice.model.Navigation;
import com.huawei.basefitnessadvice.model.SearchCondition;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.polymericpage.adapter.PolymericDataAdapter;
import com.huawei.health.suggestion.ui.polymericpage.model.PolymericDataViewModel;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.ui.commonui.adapter.LoadMoreRecyclerViewAdapter;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.idy;
import defpackage.iei;
import defpackage.ien;
import defpackage.njy;
import defpackage.qqt;
import defpackage.qqz;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public abstract class PolymericDataFragment extends BaseFragment {
    private static final int DEFAULT_COLUMN = 1;
    private static final int SQUARE_COLUMN = 2;
    private static final String TAG = "Suggestion_PolymericDataFragment";
    private View mContent;
    private Context mContext;
    private int mCurrentPage;
    protected PolymericDataViewModel mDataViewModel;
    private ImageView mFitnessNoDataOrNoNetworkImageView;
    private HealthTextView mFitnessNoDataOrNoNetworkTextView;
    private LinearLayoutManager mLinearLayoutManager;
    private View mLoadingLayout;
    private View mNoDataOrNoNetworkView;
    protected PolymericDataAdapter mPolymericDataAdapter;
    protected HealthRecycleView mRecycleViewFitWorks;
    private int mPageFlag = 0;
    private boolean mIsCache = true;
    private Observer<Map<String, Object>> mObserver = new Observer() { // from class: com.huawei.health.suggestion.ui.polymericpage.view.PolymericDataFragment$$ExternalSyntheticLambda1
        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            this.e.notifyPolymericData((Map) obj);
        }
    };

    public abstract void initArgument();

    public abstract PolymericDataAdapter newPolymericDataAdapter();

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        initArgument();
        this.mContext = getContext();
        PolymericDataViewModel polymericDataViewModel = (PolymericDataViewModel) new ViewModelProvider(requireActivity()).get(PolymericDataViewModel.class);
        this.mDataViewModel = polymericDataViewModel;
        polymericDataViewModel.a(getActivity(), this.mObserver);
        return initView(layoutInflater, viewGroup);
    }

    public View initView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.sug_fragment_sport_all_course_list, viewGroup, false);
        this.mContent = viewInflate.findViewById(R.id.sug_content);
        this.mNoDataOrNoNetworkView = viewInflate.findViewById(R.id.no_record_layout);
        this.mFitnessNoDataOrNoNetworkTextView = (HealthTextView) viewInflate.findViewById(R.id.sug_fitnes_nodata);
        this.mFitnessNoDataOrNoNetworkImageView = (ImageView) viewInflate.findViewById(R.id.iv_sug_fitness_no_data);
        this.mLoadingLayout = viewInflate.findViewById(R.id.loading_layout);
        this.mRecycleViewFitWorks = (HealthRecycleView) viewInflate.findViewById(R.id.sug_train_rcv_events);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        this.mRecycleViewFitWorks.setItemAnimator(defaultItemAnimator);
        HealthLinearLayoutManager healthLinearLayoutManager = new HealthLinearLayoutManager(this.mContext, 1, false);
        this.mLinearLayoutManager = healthLinearLayoutManager;
        ien.a(this.mContext, this.mRecycleViewFitWorks, healthLinearLayoutManager);
        PolymericDataAdapter polymericDataAdapterNewPolymericDataAdapter = newPolymericDataAdapter();
        this.mPolymericDataAdapter = polymericDataAdapterNewPolymericDataAdapter;
        this.mRecycleViewFitWorks.setAdapter(polymericDataAdapterNewPolymericDataAdapter);
        this.mPolymericDataAdapter.setOnMoreListener(new LoadMoreRecyclerViewAdapter.OnMoreListener() { // from class: hzg
            @Override // com.huawei.ui.commonui.adapter.LoadMoreRecyclerViewAdapter.OnMoreListener
            public final void onLoadingMore() {
                this.f37374c.onLoadMoreClick();
            }
        });
        this.mPolymericDataAdapter.noMoreLoad();
        categoryListViewSetScrollListener();
        return viewInflate;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.mRecycleViewFitWorks == null || this.mPolymericDataAdapter == null) {
            LogUtil.j(TAG, "onConfigurationChanged, mRecycleViewFitWorks is null or mCourseAdapter is null.");
            return;
        }
        LogUtil.a(TAG, "onConfigurationChanged, FitnessCommonUtil.setRecyclerViewLayout");
        this.mRecycleViewFitWorks.setAdapter(null);
        this.mRecycleViewFitWorks.setLayoutManager(null);
        this.mRecycleViewFitWorks.setAdapter(this.mPolymericDataAdapter);
        this.mRecycleViewFitWorks.setLayoutManager(this.mLinearLayoutManager);
        categoryListViewSetScrollListener();
        PolymericDataViewModel polymericDataViewModel = this.mDataViewModel;
        Navigation navigationB = polymericDataViewModel.b(polymericDataViewModel.c());
        if (navigationB != null && navigationB.isDisplaySquareStyle()) {
            ien.c(this.mContext, 2, this.mRecycleViewFitWorks);
        } else {
            ien.c(this.mContext, 1, this.mRecycleViewFitWorks);
        }
        this.mPolymericDataAdapter.notifyDataSetChanged();
    }

    public void getPolymericData(final Navigation navigation, final List<FilterCondition> list, final boolean z) {
        HandlerExecutor.b(new Runnable() { // from class: hzh
            @Override // java.lang.Runnable
            public final void run() {
                this.f37375a.m1235x945b62b6(z, navigation, list);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getPolymericData$0$com-huawei-health-suggestion-ui-polymericpage-view-PolymericDataFragment, reason: not valid java name */
    public /* synthetic */ void m1235x945b62b6(boolean z, Navigation navigation, List list) {
        refreshCurrentPage(0);
        this.mIsCache = z;
        setLoadingViewState(false);
        this.mRecycleViewFitWorks.setAdapter(null);
        this.mRecycleViewFitWorks.setLayoutManager(null);
        if (navigation.isDisplaySquareStyle()) {
            ien.c(this.mContext, 2, this.mRecycleViewFitWorks);
        } else {
            ien.c(this.mContext, 1, this.mRecycleViewFitWorks);
        }
        this.mRecycleViewFitWorks.setAdapter(this.mPolymericDataAdapter);
        PolymericDataAdapter polymericDataAdapter = this.mPolymericDataAdapter;
        if (polymericDataAdapter != null) {
            polymericDataAdapter.clear();
            this.mPolymericDataAdapter.setNavigationId(navigation.getValue());
            this.mPolymericDataAdapter.setIsShowSquare(navigation.isDisplaySquareStyle());
        }
        this.mDataViewModel.d(navigation, list, this.mIsCache, this.mCurrentPage);
    }

    public void refreshCurrentPage(int i) {
        this.mCurrentPage = i;
        this.mPageFlag = i;
    }

    private void categoryListViewSetScrollListener() {
        this.mRecycleViewFitWorks.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.huawei.health.suggestion.ui.polymericpage.view.PolymericDataFragment.1
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                if (recyclerView.canScrollVertically(1)) {
                    return;
                }
                PolymericDataFragment.this.slideCourseBottom();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void slideCourseBottom() {
        PolymericDataViewModel polymericDataViewModel = this.mDataViewModel;
        Navigation navigationB = polymericDataViewModel.b(polymericDataViewModel.c());
        String name = navigationB != null ? navigationB.getName() : "";
        if ("HEALTH_COURSE".equals(this.mDataViewModel.b())) {
            iei.a(name);
        } else {
            iei.b(idy.b(this.mDataViewModel.b()), name);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyPolymericData(Map<String, Object> map) {
        boolean zBooleanValue = ((Boolean) map.get("is_success")).booleanValue();
        List<Workout> list = (List) map.get("visible_course_list");
        int iIntValue = ((Integer) map.get(PayPalPaymentIntent.ORDER)).intValue();
        if (isDifferent((SearchCondition) map.get("data_owner_id"), this.mDataViewModel.d())) {
            LogUtil.j(TAG, "notifyPolymericData different.");
            return;
        }
        if (!zBooleanValue || njy.e(list)) {
            LogUtil.j(TAG, "handFailureCourseData, mRecordsFragment is null or fitWorkoutList is empty.");
            handleDataFail(zBooleanValue);
            sendFilterBi(0, iIntValue);
        } else {
            sendFilterBi(list.size(), iIntValue);
            setLoadingViewState(true);
            handlePolymericData(list, this.mPageFlag);
        }
    }

    private void sendFilterBi(int i, int i2) {
        PolymericDataViewModel polymericDataViewModel = this.mDataViewModel;
        Navigation navigationB = polymericDataViewModel.b(polymericDataViewModel.c());
        SearchCondition searchConditionD = this.mDataViewModel.d();
        if (navigationB == null || searchConditionD == null) {
            return;
        }
        Map<String, Object> mapC = iei.c(navigationB.getName(), searchConditionD);
        mapC.put("result", Integer.valueOf(i));
        mapC.put(PayPalPaymentIntent.ORDER, Integer.valueOf(i2));
        if ("HEALTH_COURSE".equals(this.mDataViewModel.b())) {
            iei.a("1130070", mapC);
        } else {
            iei.a("1130009", mapC);
        }
    }

    private boolean isDifferent(SearchCondition searchCondition, SearchCondition searchCondition2) {
        if (searchCondition == null || searchCondition2 == null) {
            LogUtil.a(TAG, Boolean.valueOf(searchCondition == null), " and ", Boolean.valueOf(searchCondition2 == null));
            return false;
        }
        if (searchCondition.getLeftNavigationId() != searchCondition2.getLeftNavigationId()) {
            LogUtil.a(TAG, Integer.valueOf(searchCondition.getLeftNavigationId()), " and ", Integer.valueOf(searchCondition2.getLeftNavigationId()));
            return true;
        }
        if (searchCondition.getFilterConditions() == null || searchCondition2.getFilterConditions() == null) {
            LogUtil.a(TAG, Boolean.valueOf(searchCondition.getFilterConditions() == null), " and list ", Boolean.valueOf(searchCondition2.getFilterConditions() == null));
            return true;
        }
        if (qqt.b(searchCondition).equals(qqt.b(searchCondition2))) {
            return false;
        }
        LogUtil.j(TAG, "content diff.");
        return true;
    }

    private void handleDataFail(boolean z) {
        setLoadingViewState(true);
        handleNoData(this.mPageFlag, z);
    }

    public void handleNoData(int i, boolean z) {
        this.mCurrentPage = i;
        if (i == 0) {
            this.mPolymericDataAdapter.clear();
        }
        if (this.mPolymericDataAdapter.getItemCount() > 0 && z) {
            this.mPolymericDataAdapter.noMoreLoad();
            return;
        }
        if (this.mPolymericDataAdapter.getItemCount() > 0 && !z) {
            this.mPolymericDataAdapter.loadError();
            int i2 = this.mPageFlag;
            this.mPageFlag = i2 == 0 ? 0 : i2 - 1;
        } else {
            this.mContent.setVisibility(8);
            this.mPolymericDataAdapter.noMoreLoad();
            if (!CommonUtil.ab(this.mContext)) {
                showTips(R.string.IDS_plugin_achievement_network_error_msg_content_2, R.drawable.ic_recommend_list_no_network);
            } else {
                showNoDataTips();
            }
        }
    }

    protected void showNoDataTips() {
        showTips(R.string.IDS_hwh_sug_fitness_recom_nodata, R.drawable.ic_collect_course);
    }

    protected void showTips(int i, int i2) {
        this.mNoDataOrNoNetworkView.setVisibility(0);
        this.mFitnessNoDataOrNoNetworkTextView.setText(i);
        if (LanguageUtil.ba(this.mContext)) {
            this.mFitnessNoDataOrNoNetworkImageView.setImageDrawable(qqz.e(this.mContext, i2));
        } else {
            this.mFitnessNoDataOrNoNetworkImageView.setImageResource(i2);
        }
    }

    private void handlePolymericData(List<Workout> list, int i) {
        LogUtil.a(TAG, "handleCoursesData.", Integer.valueOf(i), " data:", Integer.valueOf(list.size()));
        this.mCurrentPage = i;
        if (njy.e(list)) {
            handleNoData(i, true);
            return;
        }
        if (this.mCurrentPage == 0) {
            this.mPolymericDataAdapter.clear();
        }
        List<Workout> differentWorkout = getDifferentWorkout(list, this.mPolymericDataAdapter.getData());
        if (list.size() < 10) {
            this.mPolymericDataAdapter.noMoreLoad(differentWorkout);
        } else {
            try {
                this.mPolymericDataAdapter.enableMoreLoad(differentWorkout);
                this.mCurrentPage++;
            } catch (IllegalStateException e) {
                ReleaseLogUtil.a(TAG, "handleCoursesData() exception: ", ExceptionUtils.c(e));
            }
        }
        hideTipsAndShowContent();
    }

    private List<Workout> getDifferentWorkout(List<Workout> list, List<Workout> list2) {
        if (njy.e(list2)) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Workout workout : list) {
            if (!list2.contains(workout)) {
                arrayList.add(workout);
            }
        }
        return arrayList;
    }

    private void hideTipsAndShowContent() {
        if (this.mNoDataOrNoNetworkView.getVisibility() == 0) {
            this.mNoDataOrNoNetworkView.setVisibility(8);
        }
        if (this.mContent.getVisibility() == 8) {
            this.mContent.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLoadMoreClick() {
        int i = this.mCurrentPage;
        if (i <= 0 || this.mPageFlag + 1 != i) {
            LogUtil.j(TAG, "onLoadMoreClick, not load more.");
        } else {
            this.mPageFlag = i;
            this.mDataViewModel.a(i, this.mIsCache);
        }
    }

    private void setLoadingViewState(boolean z) {
        View view = this.mLoadingLayout;
        if (view == null) {
            LogUtil.j(TAG, "setLoadingViewState, mLoadingLayout is null.");
        } else {
            view.setVisibility(z ? 8 : 0);
        }
    }

    public void smoothScrollToPosition(int i) {
        HealthRecycleView healthRecycleView = this.mRecycleViewFitWorks;
        if (healthRecycleView == null) {
            LogUtil.j(TAG, "smoothScrollToPosition, mRecycleViewFitWorks is null.");
        } else {
            healthRecycleView.smoothScrollToPosition(i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.mDataViewModel.b(this.mObserver);
    }
}
