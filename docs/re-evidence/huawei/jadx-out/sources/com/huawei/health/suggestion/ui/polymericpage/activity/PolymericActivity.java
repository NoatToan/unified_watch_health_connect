package com.huawei.health.suggestion.ui.polymericpage.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.google.gson.reflect.TypeToken;
import com.huawei.basefitnessadvice.model.FilterCondition;
import com.huawei.basefitnessadvice.model.Navigation;
import com.huawei.basefitnessadvice.model.NavigationFilter;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.health.marketing.datatype.InputBoxTemplate;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.BaseActivity;
import com.huawei.health.suggestion.ui.BaseStateActivity;
import com.huawei.health.suggestion.ui.polymericpage.adapter.PolymericCategoryAdapter;
import com.huawei.health.suggestion.ui.polymericpage.model.PolymericCustomer;
import com.huawei.health.suggestion.ui.polymericpage.model.PolymericDataViewModel;
import com.huawei.health.suggestion.ui.polymericpage.view.PolymericDataFragment;
import com.huawei.health.suggestion.ui.polymericpage.view.PolymericFilterRecyclerHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.ezi;
import defpackage.fxl;
import defpackage.gvi;
import defpackage.idy;
import defpackage.iei;
import defpackage.njy;
import defpackage.peh;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PolymericActivity extends BaseStateActivity {
    private static final String TAG = "Suggestion_PolymericActivity";
    private LinearLayout mAllCourseFilterBar;
    private FrameLayout mContentLayout;
    protected Context mContext;
    private int mCurNavigationId;
    private int mCurrentResourceId;
    private PolymericDataViewModel mDataViewModel;
    private HealthButton mGoToSetNetwork;
    private String mLastShowSearchHint;
    private PolymericCategoryAdapter mNavigationAdapter;
    private HealthRecycleView mNavigationListView;
    private View mNoNetWork;
    protected String mPageType;
    protected PolymericCustomer mPolymericCustomer;
    private PolymericDataFragment mPolymericDataFragment;
    private PolymericFilterRecyclerHelper mPolymericFilterRecyclerHelper;
    private LinearLayout mRecommendView;
    private long mStartTime;
    private HealthSubHeader mSubNavigationHeader;
    private InputBoxTemplate mInputBoxTemplate = null;
    private Observer<NavigationFilter> mNavigationObserver = new Observer() { // from class: com.huawei.health.suggestion.ui.polymericpage.activity.PolymericActivity$$ExternalSyntheticLambda4
        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: onChanged */
        public final void b(Object obj) {
            this.f9806b.notifyNavigationData((NavigationFilter) obj);
        }
    };

    public abstract PolymericCustomer createPolymericCustomer(Intent intent);

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        LogUtil.a(TAG, "onCreate.");
        qrs.c(this, bundle);
        this.mContext = this;
        this.mPolymericCustomer = createPolymericCustomer(getIntent());
        this.mStartTime = System.currentTimeMillis();
        super.onCreate(bundle);
        getWindow().setFlags(16777216, 16777216);
        initViewModelAndGetNavData();
        clearBackgroundDrawable();
        LogUtil.a(TAG, "onCreate finish.");
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getSearchHint();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void initViewTahiti() {
        LogUtil.a(TAG, "initViewTahiti");
        getWindow().setFlags(16777216, 16777216);
        this.mStartTime = System.currentTimeMillis();
        this.mContentLayout.invalidate();
        PolymericDataViewModel polymericDataViewModel = this.mDataViewModel;
        Navigation navigationB = polymericDataViewModel.b(polymericDataViewModel.c());
        if (!this.mPolymericCustomer.isSupportFilter() || navigationB == null) {
            return;
        }
        this.mPolymericFilterRecyclerHelper.a(navigationB.getFilterConditions(), navigationB.getName());
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initLayout() {
        setContentView(R.layout.sug_activity_sport_all_course_activity);
        this.mContext = this;
        Intent intent = getIntent();
        if (intent != null) {
            this.mPolymericCustomer.getPolymericIntentData(intent);
        }
        this.mContentLayout = (FrameLayout) findViewById(R.id.sug_march_frame);
        this.mLoadingView = findViewById(R.id.sug_loading);
        this.mNoNetWork = findViewById(R.id.sug_action_no_data_set_network);
        this.mGoToSetNetwork = (HealthButton) findViewById(R.id.btn_no_net_work);
        BaseActivity.cancelLayoutById(this.mContentLayout);
        BaseActivity.setViewSafeRegion(false, this.mContentLayout);
        cancelAdaptRingRegion();
        initNormalModeLayout();
        this.mPolymericDataFragment = this.mPolymericCustomer.createPolymericDataFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.sug_course_list_content, this.mPolymericDataFragment).commitAllowingStateLoss();
        setNoNetworkState(true);
    }

    protected void initNormalModeLayout() {
        LogUtil.a(TAG, "initNormalModeLayout.");
        HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.sug_course_category_list);
        this.mNavigationListView = healthRecycleView;
        healthRecycleView.setLayoutManager(new LinearLayoutManager(this.mContext));
        if (this.mNavigationListView.getItemAnimator() instanceof SimpleItemAnimator) {
            ((SimpleItemAnimator) this.mNavigationListView.getItemAnimator()).setSupportsChangeAnimations(false);
        }
        PolymericCategoryAdapter polymericCategoryAdapter = new PolymericCategoryAdapter(Collections.EMPTY_LIST);
        this.mNavigationAdapter = polymericCategoryAdapter;
        this.mNavigationListView.setAdapter(polymericCategoryAdapter);
        categoryListViewSetScrollListener(this.mNavigationListView);
        this.mNavigationAdapter.setOnItemClickListener(new BaseRecyclerAdapter.OnItemClickListener() { // from class: hyw
            @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter.OnItemClickListener
            public final void onItemClicked(RecyclerHolder recyclerHolder, int i, Object obj) {
                this.f37354c.m1230xe7bd212d(recyclerHolder, i, obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$initNormalModeLayout$0$com-huawei-health-suggestion-ui-polymericpage-activity-PolymericActivity, reason: not valid java name */
    public /* synthetic */ void m1230xe7bd212d(RecyclerHolder recyclerHolder, int i, Object obj) {
        if (i == this.mNavigationAdapter.d() || !(obj instanceof Navigation)) {
            LogUtil.j(TAG, "setOnItemClickListener, position not change or itemData not instanceof ClassifyInfo.");
        } else {
            this.mNavigationAdapter.d(i);
            onNavigationClick((Navigation) obj);
        }
    }

    private void categoryListViewSetScrollListener(HealthRecycleView healthRecycleView) {
        healthRecycleView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.huawei.health.suggestion.ui.polymericpage.activity.PolymericActivity.5
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
                PolymericActivity.this.slideLabelBottom();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void slideLabelBottom() {
        PolymericDataViewModel polymericDataViewModel = this.mDataViewModel;
        Navigation navigationB = polymericDataViewModel.b(polymericDataViewModel.c());
        String name = navigationB != null ? navigationB.getName() : "";
        if ("HEALTH_COURSE".equals(this.mPageType)) {
            iei.e(name);
        } else {
            iei.d(idy.b(this.mPageType));
        }
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initViewController() {
        initTitleBarSearchController();
        initNormalViewController();
    }

    public void initNormalViewController() {
        initTopView();
        if (this.mTitleBar == null) {
            LogUtil.j(TAG, "initNormalViewController, failed with null mTitleBar.");
            return;
        }
        this.mTitleBar.setTitleText(this.mPolymericCustomer.getTitleText(this));
        this.mTitleBar.setDoubleClickEnable(true);
        this.mTitleBar.setBackToTopListener(new CustomTitleBar.BackToTopListener() { // from class: hyy
            @Override // com.huawei.ui.commonui.titlebar.CustomTitleBar.BackToTopListener
            public final void backToTop() {
                this.e.onBackToTop();
            }
        });
    }

    protected void initTitleBarSearchController() {
        if (this.mTitleBar == null) {
            LogUtil.j(TAG, "initTitleBarSearchController, failed with null mTitleBar.");
            return;
        }
        Drawable rightButtonDrawable = getRightButtonDrawable();
        if (rightButtonDrawable == null) {
            LogUtil.a(TAG, "initTitleBarSearchController, rightButtonDrawable is null.");
            this.mTitleBar.setRightButtonVisibility(8);
        } else {
            this.mTitleBar.setRightButtonDrawable(rightButtonDrawable, qre.f(R.string.IDS_global_search_button));
            this.mTitleBar.setRightButtonVisibility(0);
            this.mTitleBar.setRightButtonOnClickListener(new View.OnClickListener() { // from class: hyx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f37355c.m1231x9335f141(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$initTitleBarSearchController$1$com-huawei-health-suggestion-ui-polymericpage-activity-PolymericActivity, reason: not valid java name */
    public /* synthetic */ void m1231x9335f141(View view) {
        rightButtonClick();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a(TAG, "onActivityResult.", Integer.valueOf(i), " resultCode:", Integer.valueOf(i2));
        if (i == 123) {
            if (i2 != -1 || intent == null) {
                LogUtil.j(TAG, "onActivityResult() resultCode is no OK or data is null");
                return;
            }
            this.mPolymericDataFragment.refreshCurrentPage(0);
            String stringExtra = intent.getStringExtra("MORE_FILTER_SELECTED_DATA");
            if (TextUtils.isEmpty(stringExtra)) {
                LogUtil.a(TAG, "selectedString empty.");
                return;
            }
            LogUtil.a(TAG, "selectedString.", stringExtra);
            Map<Long, List<Long>> map = (Map) peh.d(stringExtra, new TypeToken<Map<Long, List<Long>>>() { // from class: com.huawei.health.suggestion.ui.polymericpage.activity.PolymericActivity.2
            }.getType());
            if (this.mPolymericCustomer.isSupportFilter()) {
                this.mPolymericFilterRecyclerHelper.d(map);
            }
        }
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a(TAG, "onDestroy");
        this.mDataViewModel.d(this.mNavigationObserver);
        if (getIntent() != null) {
            String stringExtra = getIntent().getStringExtra("entrance");
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = "otherModel";
            }
            HashMap map = new HashMap(2);
            map.put("entrance", stringExtra);
            map.put("stay_time", Long.valueOf(System.currentTimeMillis() - this.mStartTime));
            idy.b("1130016", map);
        }
    }

    public int getIndexByNavigation(Navigation navigation, List<Navigation> list) {
        if (njy.e(list)) {
            return 0;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getValue() == navigation.getValue()) {
                return i;
            }
        }
        return 0;
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initData() {
        LogUtil.a(TAG, "initData");
    }

    private void getSearchHint() {
        this.mInputBoxTemplate = ezi.b(TextUtils.equals(this.mPageType, "RUNNING_COURSE") ? 52000 : 50000);
    }

    private void initViewModelAndGetNavData() {
        if (this.mDataViewModel == null) {
            this.mDataViewModel = (PolymericDataViewModel) new ViewModelProvider(this).get(PolymericDataViewModel.class);
        }
        this.mDataViewModel.a(this.mPageType, this.mPolymericCustomer.acquireFragmentParam());
        this.mDataViewModel.e(this, this.mNavigationObserver);
        showLoading();
        this.mDataViewModel.a();
    }

    private void initTopView() {
        if (this.mRecommendView == null) {
            this.mRecommendView = (LinearLayout) ((ViewStub) findViewById(R.id.sug_course_recommend_bar)).inflate().findViewById(R.id.sug_all_course_recommend_more_layout);
        }
        if (this.mPolymericFilterRecyclerHelper == null) {
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.sug_view_container);
            relativeLayout.removeAllViews();
            relativeLayout.addView(LayoutInflater.from(this.mContext).inflate(R.layout.include_sport_all_course_recyclerview, (ViewGroup) null));
            this.mAllCourseFilterBar = (LinearLayout) relativeLayout.findViewById(R.id.sug_course_screen_layout);
            HealthSubHeader healthSubHeader = (HealthSubHeader) relativeLayout.findViewById(R.id.sug_category_name);
            this.mSubNavigationHeader = healthSubHeader;
            healthSubHeader.setMoreTextVisibility(4);
            this.mSubNavigationHeader.setRightArrayVisibility(4);
            if (this.mPolymericCustomer.isSupportFilter()) {
                PolymericFilterRecyclerHelper polymericFilterRecyclerHelper = new PolymericFilterRecyclerHelper(this.mContext, this.mAllCourseFilterBar);
                this.mPolymericFilterRecyclerHelper = polymericFilterRecyclerHelper;
                polymericFilterRecyclerHelper.a(new PolymericFilterRecyclerHelper.OnCourseFilterListener() { // from class: hzc
                    @Override // com.huawei.health.suggestion.ui.polymericpage.view.PolymericFilterRecyclerHelper.OnCourseFilterListener
                    public final void onToFilterCallBack(List list) {
                        this.f37361b.m1232xe735cbbf(list);
                    }
                });
                return;
            }
            ((HealthRecycleView) this.mAllCourseFilterBar.findViewById(R.id.recycleview_filter)).setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: lambda$initTopView$2$com-huawei-health-suggestion-ui-polymericpage-activity-PolymericActivity, reason: not valid java name */
    public /* synthetic */ void m1232xe735cbbf(List list) {
        LogUtil.a(TAG, "OnFilter.", peh.c(list));
        this.mPolymericDataFragment.getPolymericData(this.mDataViewModel.b(this.mCurNavigationId), list, true);
    }

    public PolymericCustomer getPolymericCustomer() {
        return this.mPolymericCustomer;
    }

    protected void getResourceView(Navigation navigation) {
        if (navigation == null) {
            LogUtil.j(TAG, "getResourceView() mPrimaryClassify is null or out of bounds.");
            return;
        }
        if (this.mRecommendView == null) {
            LogUtil.j(TAG, "getResourceView() classifyInfo or mRecommendView is null");
            return;
        }
        int positionId = navigation.getPositionId();
        LogUtil.a(TAG, "notifyFilterData, getResourceView = ", Integer.valueOf(positionId));
        if (positionId == 0) {
            LogUtil.j(TAG, "getResourceView() resourceId == 0");
            this.mRecommendView.setVisibility(8);
            return;
        }
        if (positionId != this.mCurrentResourceId) {
            this.mRecommendView.removeAllViews();
            fxl.e(this.mContext, this.mRecommendView, positionId);
            this.mCurrentResourceId = positionId;
        }
        this.mRecommendView.setVisibility(0);
    }

    public void onNavigationClick(Navigation navigation) {
        this.mCurNavigationId = navigation.getValue();
        LogUtil.a(TAG, "onNavigationClick.", peh.c(navigation));
        HealthSubHeader healthSubHeader = this.mSubNavigationHeader;
        if (healthSubHeader != null) {
            healthSubHeader.setHeadTitleText(navigation.getName());
        }
        ArrayList arrayList = new ArrayList();
        if (this.mPolymericCustomer.isSupportFilter()) {
            this.mPolymericFilterRecyclerHelper.a(navigation.getFilterConditions(), navigation.getName());
        }
        this.mPolymericDataFragment.getPolymericData(navigation, arrayList, true);
        iei.b(navigation.getName());
        getResourceView(navigation);
    }

    public void rightButtonClick() {
        LogUtil.a(TAG, "rightButtonClick.");
        idy.c("1", 7);
        if (this.mInputBoxTemplate != null) {
            if (TextUtils.equals(this.mPageType, "FITNESS_COURSE")) {
                this.mInputBoxTemplate.setLessonSubCategory("fitnesslesson");
            } else if (TextUtils.equals(this.mPageType, "RUNNING_COURSE")) {
                this.mInputBoxTemplate.setLessonSubCategory("runninglesson");
            } else {
                LogUtil.e(TAG, "rightButtonClick mPageType: ", this.mPageType);
            }
        }
        ezi.d(this.mContext, this.mInputBoxTemplate, 4085);
        gvi.c(this.mContext, 4085, this.mInputBoxTemplate);
        InputBoxTemplate inputBoxTemplate = this.mInputBoxTemplate;
        if (inputBoxTemplate == null || TextUtils.equals(this.mLastShowSearchHint, inputBoxTemplate.getTheme())) {
            return;
        }
        gvi.a(1, 4085, this.mInputBoxTemplate);
        this.mLastShowSearchHint = this.mInputBoxTemplate.getTheme();
    }

    protected Drawable getRightButtonDrawable() {
        if (LanguageUtil.ba(this.mContext)) {
            return qqz.e(this.mContext, R.drawable.search_bar_icon);
        }
        return ContextCompat.getDrawable(this.mContext, R.drawable.search_bar_icon);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onBackToTop() {
        PolymericDataFragment polymericDataFragment = this.mPolymericDataFragment;
        if (polymericDataFragment == null) {
            LogUtil.j(TAG, "onBackToTop, mRecordsFragment null.");
        } else {
            polymericDataFragment.smoothScrollToPosition(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyNavigationData(NavigationFilter navigationFilter) {
        LogUtil.a(TAG, "notifyNavigationData");
        finishLoading();
        if (navigationFilter == null || njy.e(navigationFilter.getLeftNavigations())) {
            LogUtil.e(TAG, "notifyNavigationData size empty.");
            dealNoNavigationData();
            return;
        }
        LogUtil.a(TAG, "notifyNavigationData size:", Integer.valueOf(navigationFilter.getLeftNavigations().size()));
        if (!TextUtils.isEmpty(navigationFilter.getPageName())) {
            this.mTitleBar.setTitleText(navigationFilter.getPageName());
        }
        this.mNavigationAdapter.refreshDataChange(navigationFilter.getLeftNavigations());
        Navigation navigationInitActiveNavigation = this.mPolymericCustomer.initActiveNavigation(navigationFilter.getLeftNavigations());
        if (navigationInitActiveNavigation == null) {
            LogUtil.a(TAG, "no select navigation.");
            return;
        }
        LogUtil.a(TAG, "selectNavigation.", peh.c(navigationInitActiveNavigation));
        this.mCurNavigationId = navigationInitActiveNavigation.getValue();
        HealthSubHeader healthSubHeader = this.mSubNavigationHeader;
        if (healthSubHeader != null) {
            healthSubHeader.setHeadTitleText(navigationInitActiveNavigation.getName());
        }
        this.mNavigationAdapter.d(getIndexByNavigation(navigationInitActiveNavigation, navigationFilter.getLeftNavigations()));
        List<FilterCondition> listInitFilterConditions = this.mPolymericCustomer.initFilterConditions(navigationInitActiveNavigation);
        this.mPolymericDataFragment.getPolymericData(navigationInitActiveNavigation, listInitFilterConditions, true);
        getResourceView(navigationInitActiveNavigation);
        if (this.mPolymericCustomer.isSupportFilter()) {
            this.mPolymericFilterRecyclerHelper.a(navigationInitActiveNavigation.getFilterConditions(), navigationInitActiveNavigation.getName());
            this.mPolymericFilterRecyclerHelper.c(listInitFilterConditions);
        }
    }

    private void dealNoNavigationData() {
        if (!NetworkUtil.h()) {
            setNoNetworkState(false);
            return;
        }
        this.mPolymericDataFragment.getPolymericData(new Navigation.Builder().name(this.mContext.getString(R.string.IDS_FitnessAdvice_run_topic_tab_all)).categoryId(0).value(0).build(), new ArrayList(), true);
        ((HealthRecycleView) findViewById(R.id.sug_course_category_list)).setVisibility(8);
        ((RelativeLayout) findViewById(R.id.sug_view_container)).setVisibility(8);
    }

    private void setNoNetworkState(boolean z) {
        if (z) {
            this.mNoNetWork.setVisibility(8);
        } else {
            this.mNoNetWork.setVisibility(0);
            this.mGoToSetNetwork.setOnClickListener(new View.OnClickListener() { // from class: hzb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f37360a.m1233xe4caf7a2(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$setNoNetworkState$3$com-huawei-health-suggestion-ui-polymericpage-activity-PolymericActivity, reason: not valid java name */
    public /* synthetic */ void m1233xe4caf7a2(View view) {
        CommonUtil.t(this.mContext);
    }
}
