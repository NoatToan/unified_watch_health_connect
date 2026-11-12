package com.huawei.ui.main.stories.health.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.health.configuredpage.api.ConfiguredPageDataCallback;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.MarketingOption;
import com.huawei.hwcommonmodel.fitnessdatatype.Vo2maxDetail;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.calendarview.HealthCalendar;
import com.huawei.ui.commonui.calendarview.HealthCalendarActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.indicator.HealthLevelIndicator;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.utils.ScrollUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.fragment.rqpackage.RqLineChartHolderView;
import com.huawei.ui.main.stories.health.fragment.rqpackage.RqLineVo2maxChartStorageHelper;
import com.huawei.ui.main.stories.health.fragment.rqpackage.Vo2maxLevelHelper;
import defpackage.lsy;
import defpackage.nkb;
import defpackage.qsp;
import defpackage.trd;
import defpackage.uvi;
import defpackage.vds;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public abstract class BaseVo2maxDetailFragment extends BaseFragment {
    private static final int GENDER_MAN = 0;
    protected static final int SHOW_LOADING_ANIMATION_UI = 3;
    private static final String TAG = "Track_BaseVo2maxDetailFragment";
    protected static final int UPDATE_VO2MAX_BAR = 2;
    protected static final int UPDATE_VO2MAX_PROGRESS = 1;
    protected int mAge;
    private HealthCalendar mCalendar;
    private LinearLayout mConfiguredLayout;
    protected Context mContext;
    protected HealthTextView mCurrentRanking;
    protected LinearLayout mCurrentRawLayout;
    protected HashMap<Long, Integer> mDataMap;
    protected HealthTextView mDayViewData;
    protected int mGender;
    protected HealthLevelIndicator mHealthLevelIndicator;
    protected boolean mIsDayFragment;
    private HealthTextView mLevelTextView;
    protected LinearLayout mMessageService;
    protected Integer[] mOxRange;
    protected RelativeLayout mPolyLineDetailLayout;
    protected HealthProgressBar mProgressBar;
    private RqLineChartHolderView mRqLineChartHolderView;
    protected View mView;
    private LinearLayout mVo2maxApiLayout;
    protected long mVo2maxTime;
    private LinearLayout mVo2maxTimeLayout;
    private HealthTextView mVo2maxTimeTextView;
    protected int mVo2maxValue;
    protected boolean mIsLoadingState = false;
    protected Handler mRequestHandler = new Handler() { // from class: com.huawei.ui.main.stories.health.fragment.BaseVo2maxDetailFragment.4
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                if (message.obj instanceof Vo2maxDetail) {
                    BaseVo2maxDetailFragment.this.updateLayout((Vo2maxDetail) message.obj);
                    return;
                }
                return;
            }
            if (i == 2) {
                LogUtil.a(BaseVo2maxDetailFragment.TAG, "UPDATE_VO2MAX_BAR");
                BaseVo2maxDetailFragment.this.updateBar();
            } else if (i == 3 && BaseVo2maxDetailFragment.this.mIsLoadingState && BaseVo2maxDetailFragment.this.mProgressBar != null) {
                BaseVo2maxDetailFragment.this.mProgressBar.setVisibility(0);
            }
        }
    };
    protected nkb mDataManager = nkb.d();

    protected abstract DataInfos getDataInfo();

    protected abstract void initFragmentView();

    public void requestData() {
    }

    protected void updateBar() {
    }

    protected void updateDateArrowVisible(int i, int i2) {
    }

    public void updateLayout(Vo2maxDetail vo2maxDetail) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.mView == null) {
            this.mView = layoutInflater.inflate(R.layout.fragment_health_vo2max_detail, viewGroup, false);
        }
        this.mContext = getActivity();
        this.mIsLoadingState = false;
        initTextViews();
        initViewPagerData();
        initFragmentView();
        initConfiguredPageData();
        lsy.a(new Runnable() { // from class: com.huawei.ui.main.stories.health.fragment.BaseVo2maxDetailFragment.1
            @Override // java.lang.Runnable
            public void run() {
                BaseVo2maxDetailFragment.this.requestData();
            }
        });
        return this.mView;
    }

    protected void isCurrentFragment(boolean z) {
        this.mIsDayFragment = z;
    }

    private void initTextViews() {
        LinearLayout linearLayout = (LinearLayout) qsp.a(this.mView, R.id.message_service);
        this.mMessageService = linearLayout;
        linearLayout.setVisibility(0);
        this.mVo2maxTimeLayout = (LinearLayout) qsp.a(this.mView, R.id.hw_show_health_data_vo2max_mid_layout);
        this.mVo2maxTimeTextView = (HealthTextView) qsp.a(this.mView, R.id.hw_show_health_data_vo2max_mid_time);
        this.mVo2maxApiLayout = (LinearLayout) qsp.a(this.mView, R.id.vo2max_marketing_layout);
        this.mCurrentRawLayout = (LinearLayout) this.mView.findViewById(R.id.current_fragment_ll);
        this.mCurrentRanking = (HealthTextView) this.mView.findViewById(R.id.current_fragment_bottom_text);
        this.mPolyLineDetailLayout = (RelativeLayout) this.mView.findViewById(R.id.v2max_main_line_detail_rl);
        this.mCurrentRawLayout.setVisibility(this.mIsDayFragment ? 0 : 8);
        this.mPolyLineDetailLayout.setVisibility(this.mIsDayFragment ? 8 : 0);
        HealthSubHeader healthSubHeader = (HealthSubHeader) this.mView.findViewById(R.id.vo2max_sub_header);
        healthSubHeader.setSubHeaderBackgroundColor(getResources().getColor(R.color.common_transparent));
        healthSubHeader.setPaddingStartEnd(0.0f, 0.0f);
        this.mHealthLevelIndicator = (HealthLevelIndicator) this.mView.findViewById(R.id.current_state_level_indicator);
        this.mDayViewData = (HealthTextView) this.mView.findViewById(R.id.current_fragment_top_text);
        this.mLevelTextView = (HealthTextView) this.mView.findViewById(R.id.vo2max_level_text_view);
        Vo2maxLevelHelper vo2maxLevelHelper = new Vo2maxLevelHelper(this.mContext);
        if (((int) this.mLevelTextView.getPaint().measureText(String.valueOf(vo2maxLevelHelper.b(false)))) > (getResources().getDisplayMetrics().widthPixels * 2) / 3) {
            this.mLevelTextView.setText(vo2maxLevelHelper.b(true));
        } else {
            this.mLevelTextView.setText(vo2maxLevelHelper.b(false));
        }
    }

    private void initViewPagerData() {
        this.mProgressBar = (HealthProgressBar) qsp.a(this.mView, R.id.loading_iv);
        HealthScrollView healthScrollView = (HealthScrollView) qsp.a(this.mView, R.id.vo2max_scrollview);
        healthScrollView.setScrollViewVerticalDirectionEvent(true);
        ScrollUtil.a(healthScrollView, getActivity().getWindow().getDecorView(), 3041);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.mGender = arguments.getInt("vo2max_gender", 0);
            int i = arguments.getInt("vo2max_age", 0);
            this.mAge = i;
            this.mOxRange = vds.a(this.mGender, i);
            this.mVo2maxValue = arguments.getInt("vo2max_value");
            this.mVo2maxTime = arguments.getLong("vo2max_time");
            return;
        }
        this.mGender = 0;
        this.mOxRange = vds.a(0, 0);
    }

    protected void initChartConfig() {
        this.mRqLineChartHolderView = (RqLineChartHolderView) this.mView.findViewById(R.id.rq_chart_line_view_holder);
        initStartViewListener();
        this.mRqLineChartHolderView.e(getDataInfo(), 2, 0);
        if (getArguments() != null) {
            final long j = getArguments().getLong("vo2max_time", 0L);
            setVo2maxDataChangeListener(new RqLineVo2maxChartStorageHelper.OnVo2maxDataChangeListener() { // from class: uuj
                @Override // com.huawei.ui.main.stories.health.fragment.rqpackage.RqLineVo2maxChartStorageHelper.OnVo2maxDataChangeListener
                public final void dataChange() {
                    this.d.m1730xa3213f93(j);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: refreshChartToLastData, reason: merged with bridge method [inline-methods] */
    public void m1730xa3213f93(final long j) {
        setVo2maxDataChangeListener(null);
        if (j != 0) {
            this.mRqLineChartHolderView.post(new Runnable() { // from class: com.huawei.ui.main.stories.health.fragment.BaseVo2maxDetailFragment.3
                @Override // java.lang.Runnable
                public void run() {
                    BaseVo2maxDetailFragment.this.mRqLineChartHolderView.c(j);
                }
            });
        }
    }

    private void setVo2maxDataChangeListener(RqLineVo2maxChartStorageHelper.OnVo2maxDataChangeListener onVo2maxDataChangeListener) {
        RqLineChartHolderView rqLineChartHolderView = this.mRqLineChartHolderView;
        if (rqLineChartHolderView == null) {
            LogUtil.j(TAG, "setVo2maxDataChangeListener mRqLineChartHolderView is null");
            return;
        }
        uvi rqChartLineViewHolder = rqLineChartHolderView.getRqChartLineViewHolder();
        if (rqChartLineViewHolder == null) {
            LogUtil.j(TAG, "setVo2maxDataChangeListener holder is null");
            return;
        }
        IChartStorageHelper iChartStorageHelperAcquireStorageHelper = rqChartLineViewHolder.acquireStorageHelper();
        if (iChartStorageHelperAcquireStorageHelper instanceof RqLineVo2maxChartStorageHelper) {
            ((RqLineVo2maxChartStorageHelper) iChartStorageHelperAcquireStorageHelper).a(onVo2maxDataChangeListener);
        }
    }

    protected void initConfiguredPageData() {
        if (CommonUtil.ca()) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(this.mContext);
        this.mConfiguredLayout = linearLayout;
        linearLayout.setId(R.id.vo2max_month_configure_page_detail);
        this.mConfiguredLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.mConfiguredLayout.setOrientation(1);
        this.mMessageService.addView(this.mConfiguredLayout);
        trd.a(17, this.mConfiguredLayout, (ConfiguredPageDataCallback) null);
        initMarketing();
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LinearLayout linearLayout = this.mConfiguredLayout;
        if (linearLayout != null) {
            trd.b(17, linearLayout);
        }
    }

    private void initMarketing() {
        MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi == null) {
            LogUtil.j(TAG, "initMarketing marketingApi is null");
            return;
        }
        HashMap map = new HashMap(16);
        map.put(4039, this.mVo2maxApiLayout);
        marketingApi.requestMarketingResource(new MarketingOption.Builder().setContext(getActivity()).setPageId(17).setLayoutMap(map).build());
        this.mVo2maxApiLayout.setVisibility(0);
    }

    private void initStartViewListener() {
        this.mRqLineChartHolderView.setStartCalendarViewListener(new RqLineChartHolderView.StartCalendarViewListener() { // from class: com.huawei.ui.main.stories.health.fragment.BaseVo2maxDetailFragment.2
            @Override // com.huawei.ui.main.stories.health.fragment.rqpackage.RqLineChartHolderView.StartCalendarViewListener
            public void onStartCalendarView() {
                BaseVo2maxDetailFragment baseVo2maxDetailFragment = BaseVo2maxDetailFragment.this;
                HealthCalendarActivity.c(baseVo2maxDetailFragment, baseVo2maxDetailFragment.mCalendar);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 != -1 || intent == null) {
            return;
        }
        LogUtil.a(TAG, "mCalendar=" + this.mCalendar);
        Serializable serializableExtra = intent.getSerializableExtra("selectedDate");
        if (serializableExtra instanceof HealthCalendar) {
            HealthCalendar healthCalendar = (HealthCalendar) serializableExtra;
            this.mCalendar = healthCalendar;
            this.mRqLineChartHolderView.b(healthCalendar.transformCalendar().getTimeInMillis(), this.mCalendar);
        }
    }
}
