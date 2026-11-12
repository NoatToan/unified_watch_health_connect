package com.huawei.health.knit.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.huawei.android.airsharing.api.IEventListener;
import com.huawei.haf.design.pattern.ObserveLabels;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.knit.model.KnitPageConfig;
import com.huawei.health.knit.model.KnitPageGroupConfig;
import com.huawei.health.knit.model.KnitSectionConfig;
import com.huawei.health.knit.model.KnitSubPageConfig;
import com.huawei.health.knit.section.listener.BasePageResTrigger;
import com.huawei.health.knit.section.listener.HealthPageResTrigger;
import com.huawei.health.knit.section.listener.IPageResTrigger;
import com.huawei.health.knit.section.model.MarketingIdInfo;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.scrollview.ScrollViewListener;
import com.huawei.ui.commonui.subtab.HealthSubTabWidget;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.toolbar.HealthToolBar;
import com.huawei.ui.commonui.transition.ActivityTransitionAnimator;
import com.huawei.ui.commonui.utils.ScrollUtil;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.commonui.view.ShareBitmapViewGroup;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import defpackage.ecu;
import defpackage.foc;
import defpackage.njy;
import defpackage.peh;
import defpackage.qpn;
import defpackage.qqn;
import defpackage.qqp;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class KnitHealthDetailActivity extends BaseActivity {
    private static final int BOTTOM_MARGIN = 50;
    protected static final int DEFAULT_PAGE_WITHOUT_DATA = 0;
    private static final int DELAY = 200;
    public static final String KEY_SLEEP_COMMON_SLEEP = "key_sleep_common_sleep";
    public static final String KEY_SLEEP_EFFICIENT = "sleepEfficient";
    public static final String KEY_SLEEP_SCORING = "sleepScoring";
    public static final String KEY_SLEEP_SCORING_DESC = "sleepScoringDesc";
    public static final String KEY_SLEEP_STATUS = "sleepStatus";
    public static final String KEY_SUB_PAGE_INDEX = "key_sub_page_index";
    protected static final int MULTI_PAGES_WITH_DATA = 2;
    protected static final int SINGLE_PAGE_WITH_DATA = 1;
    private static final String TAG = "KnitHealthDetailActivity";
    public static final String TEMPERATURE_TYPE = "temperatureType";
    protected String currentDayMsg;
    private Bundle mBundle;
    private LinearLayout mDefaultLayout;
    private int mDistanceHeight;
    protected Fragment mEmptyFragment;
    protected View mEmptyFragmentView;
    private LinearLayout mExtraContainer;
    private View mHasDataFragmentView;
    private ScrollView mHasDataScrollView;
    public boolean mIsNoDataFragment;
    private View mKnitHealthDetailTitleBarContainer;
    private long mLatestTime;
    protected KnitSubPageConfig mNoDataPageConfig;
    private HealthScrollView mNoDataScrollView;
    private ScrollViewListener mNoDataScrollViewListener;
    private View mNoNetworkLayout;
    private RelativeLayout mRootLayout;
    private KnitFragment mSingleFragment;
    private List<KnitSubPageConfig> mSubPageConfigs;
    protected qpn mSubTabAdapter;
    public HealthSubTabWidget mSubTabWidget;
    private String mTemperatureType;
    private CustomTitleBar mTitleBar;
    private int mTitleViewHeight;
    private HealthToolBar mToolBar;
    private HealthViewPager mViewPager;
    public ShareBitmapViewGroup shareContainer;
    protected Bundle sleepEfficientDesc;
    protected Bundle sleepScoringData;
    private static final Map<Integer, Integer> FLOATING_ID_MAP = new HashMap<Integer, Integer>() { // from class: com.huawei.health.knit.ui.KnitHealthDetailActivity.5
        {
            put(9, Integer.valueOf(IEventListener.EVENT_ID_DEVICE_UPDATE));
            put(3, 3010);
            put(2, Integer.valueOf(IEventListener.EVENT_ID_DEVICE_REQUEST_CONN));
            put(7, Integer.valueOf(IEventListener.EVENT_ID_GRAB_STATE_CHANGED));
            put(20, 3009);
            put(1, Integer.valueOf(IEventListener.EVENT_ID_DEVICE_DLNA_CONN_SUCC));
            put(24, 3031);
            put(8, Integer.valueOf(IEventListener.EVENT_ID_DEVICE_REQUEST_PLAY));
        }
    };
    private static final Map<Integer, Integer> NO_DATA_FLOATING_ID_MAP = new HashMap<Integer, Integer>() { // from class: com.huawei.health.knit.ui.KnitHealthDetailActivity.2
        {
            put(9, 3033);
            put(3, 3035);
            put(2, 3037);
            put(7, 3039);
            put(20, 3034);
            put(1, 3036);
            put(24, 3040);
            put(8, 3038);
        }
    };
    private static final Map<Integer, Integer> PAGE_ID_MAP = new HashMap<Integer, Integer>() { // from class: com.huawei.health.knit.ui.KnitHealthDetailActivity.3
        {
            put(9, 9);
            put(3, 3);
            put(2, 2);
            put(7, 7);
            put(20, 20);
            put(1, 1);
            put(24, 24);
            put(8, 8);
        }
    };
    private static final Map<Integer, Integer> NO_DATA_PAGE_ID_MAP = new HashMap<Integer, Integer>() { // from class: com.huawei.health.knit.ui.KnitHealthDetailActivity.4
        {
            put(9, 360);
            put(3, 330);
            put(2, Integer.valueOf(GlMapUtil.DEVICE_DISPLAY_DPI_HIGH));
            put(7, 340);
            put(20, 380);
            put(1, 310);
            put(24, 370);
            put(8, 350);
        }
    };
    private final Observer mObserver = new c(this);
    protected int deviceId = 0;
    private List<KnitFragment> mMultiFragmentList = new ArrayList();
    private Handler mHandler = new Handler();
    private int mState = 0;
    private int mTitleBarBackGround = BaseApplication.getContext().getColor(R.color.transparent);
    private boolean mIsFirst = true;
    private HealthViewPager.OnPageChangeListener mOnPageChangeListener = new HealthViewPager.OnPageChangeListener() { // from class: com.huawei.health.knit.ui.KnitHealthDetailActivity.6
        @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            KnitHealthDetailActivity.this.onKnitPageSelected(i);
        }
    };

    protected abstract void configExtraView(LinearLayout linearLayout);

    protected abstract void configTitleBar(CustomTitleBar customTitleBar);

    protected void configToast() {
    }

    protected abstract void configToolBar(HealthToolBar healthToolBar);

    public void configureNoDataToast(ViewGroup viewGroup) {
    }

    protected abstract boolean getExtra(Bundle bundle);

    protected abstract String getLogTag();

    protected abstract int getPageType();

    protected abstract DataInfos getSubPageDataInfos(int i);

    protected abstract Fragment onCreateEmptyFragment(KnitSubPageConfig knitSubPageConfig);

    public void onKnitPageSelected(int i) {
    }

    protected void setEmptyFragmentBelowTitleBar(View view, CustomTitleBar customTitleBar) {
    }

    public void showToast() {
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        LogUtil.a(TAG, "onCreate");
        super.onCreate(bundle);
        ActivityTransitionAnimator activityTransitionAnimatorA = ActivityTransitionAnimator.c().a((Activity) this);
        boolean zA = activityTransitionAnimatorA.a();
        if (zA) {
            ObserverManagerUtil.d(this.mObserver, ObserveLabels.ACTIVITY_TRANSITION_ANIMATOR_END);
            activityTransitionAnimatorA.f();
        }
        setContentView(R.layout.knit_health_detail_activity_layout);
        if (zA) {
            activityTransitionAnimatorA.d(true).d(new BaseActivity.e(this)).e();
        } else {
            clearBackgroundDrawable();
        }
        this.mLatestTime = 0L;
        Intent intent = getIntent();
        this.mTemperatureType = intent.getStringExtra(TEMPERATURE_TYPE);
        Bundle bundle2 = new Bundle();
        if (intent != null) {
            this.mLatestTime = intent.getLongExtra("key_bundle_health_last_data_time", 0L);
            bundle2.putLong("key_bundle_health_last_data_time", intent.getLongExtra("key_bundle_health_last_data_time", 0L));
            bundle2.putLong("key_marker_view_time", intent.getLongExtra("key_marker_view_time", 0L));
            bundle2.putInt(KEY_SUB_PAGE_INDEX, intent.getIntExtra(KEY_SUB_PAGE_INDEX, 0));
        }
        initView();
        getJsonConfigs();
        checkEmptyFragment(this.mLatestTime);
        configTitleBar(this.mTitleBar);
        configToolBar(this.mToolBar);
        configExtraView(this.mExtraContainer);
        configSubTitleBar(this);
        this.mSubTabAdapter = new qpn(this, this.mViewPager, this.mSubTabWidget);
        cancelLayoutById(this.mSubTabWidget, this.mViewPager, this.mToolBar);
        if (!getExtra(bundle2)) {
            LogUtil.a(TAG, "Not meet the initialization conditions");
        } else {
            this.mBundle = bundle2;
            addSubTagFragments(this.mSubTabWidget, this.mSubTabAdapter, bundle2);
        }
    }

    private void initView() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.knit_health_detail_title_bar);
        this.mTitleBar = customTitleBar;
        customTitleBar.setLeftButtonTextColor(ContextCompat.getDrawable(this, getBlackLeftButtonBackDrawable()), getColor(R.color.textColorPrimary), true, qre.f(R.string.accessibility_go_back));
        this.mToolBar = (HealthToolBar) findViewById(R.id.knit_health_detail_tool_bar);
        this.mExtraContainer = (LinearLayout) findViewById(R.id.extra_layout_container);
        this.mDefaultLayout = (LinearLayout) findViewById(R.id.knit_health_detail_default_layout);
        this.shareContainer = (ShareBitmapViewGroup) findViewById(R.id.share_container);
        this.mHasDataFragmentView = findViewById(R.id.knit_health_detail_layout);
        this.mKnitHealthDetailTitleBarContainer = findViewById(R.id.knit_health_detail_title_bar_container);
        this.mRootLayout = (RelativeLayout) findViewById(R.id.knit_detail_layout);
        HealthViewPager healthViewPager = (HealthViewPager) findViewById(R.id.knit_view_pager);
        this.mViewPager = healthViewPager;
        healthViewPager.addOnPageChangeListener(this.mOnPageChangeListener);
    }

    protected KnitFragment getSingleFragment() {
        return this.mSingleFragment;
    }

    protected void checkEmptyFragment(long j) {
        LogUtil.a(TAG, "latestDataTime: ", Long.valueOf(j));
        View viewFindViewById = findViewById(R.id.knit_health_detail_empty_layout);
        this.mEmptyFragmentView = viewFindViewById;
        setEmptyFragmentBelowTitleBar(viewFindViewById, this.mTitleBar);
        this.mEmptyFragment = onCreateEmptyFragment(this.mNoDataPageConfig);
        if (j == 0) {
            showEmptyFragment();
        }
    }

    public void post(Runnable runnable) {
        this.mHandler.post(runnable);
    }

    private void addEmptyFragment() {
        if (this.mEmptyFragment == null || this.mIsNoDataFragment) {
            return;
        }
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.replace(R.id.knit_health_detail_empty_layout, this.mEmptyFragment);
        fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
        this.mIsNoDataFragment = true;
    }

    public void showEmptyFragment() {
        LogUtil.a(TAG, "showEmptyFragment");
        if (!this.mIsNoDataFragment) {
            addEmptyFragment();
        }
        View view = this.mEmptyFragmentView;
        if (view == null) {
            return;
        }
        view.setVisibility(0);
        View view2 = this.mHasDataFragmentView;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        updateFragmentFloatingBoxStatus();
    }

    public void hideEmptyFragment() {
        LogUtil.a(TAG, "hideEmptyFragment");
        View view = this.mEmptyFragmentView;
        if (view == null) {
            return;
        }
        this.mIsNoDataFragment = false;
        view.setVisibility(8);
        View view2 = this.mHasDataFragmentView;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }

    protected boolean getIsNoDataFragment() {
        return this.mIsNoDataFragment;
    }

    public void hideNonEmptyFragment() {
        LogUtil.a(TAG, "hideNonEmptyFragment");
        qsp.c(this.mHasDataFragmentView, 8);
        qsp.c((View) this.mDefaultLayout, 8);
        qsp.c(this.mKnitHealthDetailTitleBarContainer, 8);
        qsp.c((View) this.mViewPager, 8);
        updateFragmentFloatingBoxStatus();
    }

    public void showNonEmptyFragment() {
        LogUtil.a(TAG, "showNonEmptyFragment");
        int i = this.mState;
        if (i == 1) {
            qsp.c(this.mHasDataFragmentView, 0);
            qsp.c((View) this.mDefaultLayout, 0);
            qsp.c(this.mKnitHealthDetailTitleBarContainer, 8);
            qsp.c((View) this.mViewPager, 8);
            return;
        }
        if (i == 2) {
            qsp.c(this.mHasDataFragmentView, 0);
            qsp.c((View) this.mDefaultLayout, 8);
            qsp.c(this.mKnitHealthDetailTitleBarContainer, 0);
            qsp.c((View) this.mViewPager, 0);
            return;
        }
        LogUtil.a(TAG, "mState: ", Integer.valueOf(i));
    }

    public void updateFragmentFloatingBoxStatus() {
        Fragment fragment = this.mEmptyFragment;
        if (fragment instanceof KnitFragment) {
            IPageResTrigger pageResTrigger = ((KnitFragment) fragment).getPageResTrigger();
            if (pageResTrigger instanceof BasePageResTrigger) {
                ((BasePageResTrigger) pageResTrigger).setLoadFloatingBox(this.mIsNoDataFragment);
            }
        }
        KnitFragment knitFragment = this.mSingleFragment;
        if (knitFragment != null) {
            IPageResTrigger pageResTrigger2 = knitFragment.getPageResTrigger();
            if (pageResTrigger2 instanceof BasePageResTrigger) {
                ((BasePageResTrigger) pageResTrigger2).setLoadFloatingBox(!this.mIsNoDataFragment);
            }
        }
        if (njy.b(this.mMultiFragmentList)) {
            Iterator<KnitFragment> it = this.mMultiFragmentList.iterator();
            while (it.hasNext()) {
                IPageResTrigger pageResTrigger3 = it.next().getPageResTrigger();
                if (pageResTrigger3 instanceof BasePageResTrigger) {
                    ((BasePageResTrigger) pageResTrigger3).setLoadFloatingBox(!this.mIsNoDataFragment);
                }
            }
        }
    }

    public void setDetailBackGround(int i) {
        RelativeLayout relativeLayout = this.mRootLayout;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(i);
        }
    }

    public HealthViewPager getViewPager() {
        return this.mViewPager;
    }

    public void onBundleArrived(final Bundle bundle) {
        this.mBundle = bundle;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            addSubTagFragments(this.mSubTabWidget, this.mSubTabAdapter, bundle);
        } else {
            this.mHandler.post(new Runnable() { // from class: com.huawei.health.knit.ui.KnitHealthDetailActivity.1
                @Override // java.lang.Runnable
                public void run() {
                    KnitHealthDetailActivity knitHealthDetailActivity = KnitHealthDetailActivity.this;
                    knitHealthDetailActivity.addSubTagFragments(knitHealthDetailActivity.mSubTabWidget, KnitHealthDetailActivity.this.mSubTabAdapter, bundle);
                }
            });
        }
    }

    protected void getJsonConfigs() {
        KnitPageGroupConfig knitPageGroupConfigC = foc.c(this, KnitFragment.HEALTH_DETAIL_CONFIG_NAME);
        if (knitPageGroupConfigC == null) {
            LogUtil.e(TAG, "addSubTagFragments cause pageGroupConfig is null!");
            return;
        }
        ArrayList<KnitPageConfig> pagesConfig = knitPageGroupConfigC.getPagesConfig();
        if (njy.e(pagesConfig)) {
            LogUtil.e(TAG, "addSubTagFragments cause pageConfigs is empty!");
            return;
        }
        for (int i = 0; i < pagesConfig.size(); i++) {
            KnitPageConfig knitPageConfig = pagesConfig.get(i);
            if (knitPageConfig == null) {
                LogUtil.e(TAG, "addSubTagFragments cause pageConfig1 is null!");
                return;
            }
            if (knitPageConfig.getPageType() == getPageType()) {
                this.mNoDataPageConfig = knitPageConfig.getNoDataPageConfig();
                ArrayList<KnitSubPageConfig> subPagesConfig = knitPageConfig.getSubPagesConfig();
                if (njy.e(subPagesConfig)) {
                    LogUtil.e(TAG, "subPageConfigs is empty!");
                    return;
                } else {
                    this.mSubPageConfigs = subPagesConfig;
                    return;
                }
            }
        }
    }

    protected void addSubTagFragments(HealthSubTabWidget healthSubTabWidget, qpn qpnVar, Bundle bundle) {
        int pageType = getPageType();
        LogUtil.a(TAG, "addSubTagFragments mIsFirst ", Boolean.valueOf(this.mIsFirst), " pageType ", Integer.valueOf(pageType));
        if (this.mIsFirst && ActivityTransitionAnimator.c().a() && (pageType == 1 || pageType == 7 || pageType == 20 || pageType == 24)) {
            return;
        }
        if (healthSubTabWidget == null || qpnVar == null || bundle == null) {
            ReleaseLogUtil.d(TAG, "addSubTagFragments subTabWidget ", healthSubTabWidget, " subTabAdapter ", qpnVar, " initialData ", bundle);
            return;
        }
        if (healthSubTabWidget.getSubTabCount() > 0 || qpnVar.getCount() > 0) {
            LogUtil.j(TAG, "addSubTagFragments, already has sub tabs, no need to add!");
            return;
        }
        qsp.c(this.mKnitHealthDetailTitleBarContainer, 0);
        List<KnitSubPageConfig> list = this.mSubPageConfigs;
        if (list != null && list.size() == 1) {
            this.mState = 1;
            replaceSinglePage(bundle);
        } else {
            this.mState = 2;
            this.mViewPager.setVisibility(0);
            addSubTab(healthSubTabWidget, qpnVar, bundle, this.mSubPageConfigs, pageType);
        }
        if (Utils.o() && pageType == 1) {
            this.mState = 2;
            hideEmptyFragment();
            showNonEmptyFragment();
            return;
        }
        configHealthDetailActivity();
    }

    private void replaceSinglePage(Bundle bundle) {
        qsp.c((View) this.mDefaultLayout, 0);
        qsp.c(this.mKnitHealthDetailTitleBarContainer, 8);
        KnitSubPageConfig knitSubPageConfig = this.mSubPageConfigs.get(0);
        int resPosId = knitSubPageConfig.getResPosId();
        String strC = peh.c(knitSubPageConfig);
        bundle.putSerializable("key_bundle_health_line_chart_data_infos", getSubPageDataInfos(0));
        bundle.putInt(BasePageResTrigger.KEY_EXTRA_MARKETING_ONE_PAGE_TYPE, getPageType());
        this.mSingleFragment = KnitFragment.newInstance(strC, getResTrigger(getPageType(), resPosId, true).setExtra(bundle));
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.replace(R.id.knit_health_detail_default_layout, this.mSingleFragment);
        fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
    }

    private void addSubTab(HealthSubTabWidget healthSubTabWidget, qpn qpnVar, Bundle bundle, List<KnitSubPageConfig> list, int i) {
        int iE;
        if (njy.e(list)) {
            LogUtil.j(TAG, "subPageConfigs is null");
            return;
        }
        int i2 = 0;
        while (i2 < list.size()) {
            KnitSubPageConfig knitSubPageConfig = list.get(i2);
            String subTitle = knitSubPageConfig.getSubTitle();
            if (TextUtils.isEmpty(subTitle)) {
                String subTitleRes = knitSubPageConfig.getSubTitleRes();
                if (!TextUtils.isEmpty(subTitleRes) && (iE = qre.e(subTitleRes, "string", R.string.class)) > 0) {
                    subTitle = getString(iE);
                }
            }
            printTemplateId(knitSubPageConfig);
            bundle.putSerializable("key_bundle_health_line_chart_data_infos", getSubPageDataInfos(i2));
            bundle.putInt(BasePageResTrigger.KEY_EXTRA_MARKETING_ONE_PAGE_TYPE, getPageType());
            if (i2 != 0) {
                bundle.putLong(BasePageResTrigger.KEY_DELAY_TIME_MILLIS, 200L);
            }
            bundle.putString(TEMPERATURE_TYPE, this.mTemperatureType);
            KnitFragment knitFragmentNewInstance = KnitFragment.newInstance(peh.c(knitSubPageConfig), getResTrigger(getPageType(), VersionControlUtil.isVersioned(knitSubPageConfig.getResVersionType()) ? knitSubPageConfig.getResPosId() : -1, true).setExtra(bundle));
            this.mMultiFragmentList.add(knitFragmentNewInstance);
            if (i2 != 0) {
                knitFragmentNewInstance.setIsShowLoading(false);
            }
            if (i == 1) {
                knitFragmentNewInstance.setIsAllowResumeRefresh(false);
                knitFragmentNewInstance.setIsRegisterForeverObserver(true);
            }
            Intent intent = getIntent();
            boolean z = i2 == (intent == null ? 0 : intent.getIntExtra(KEY_SUB_PAGE_INDEX, 0));
            if (z) {
                onKnitPageSelected(i2);
            }
            qpnVar.b(healthSubTabWidget.b(subTitle), knitFragmentNewInstance, z);
            i2++;
        }
    }

    private void printTemplateId(KnitSubPageConfig knitSubPageConfig) {
        if (knitSubPageConfig == null) {
            LogUtil.j(TAG, "subPageConfig is null. ");
            return;
        }
        if (njy.e(knitSubPageConfig.getSectionList())) {
            LogUtil.j(TAG, "SectionList in subPageConfig is empty. ");
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<KnitSectionConfig> it = knitSubPageConfig.getSectionList().iterator();
        while (it.hasNext()) {
            sb.append(it.next().getTemplate() + "; ");
        }
        LogUtil.a(TAG, "subPageConfig titleRes = ", knitSubPageConfig.getSubTitleRes(), "; include templateId = ", sb.toString());
    }

    protected BasePageResTrigger getResTrigger(int i, int i2, boolean z) {
        int floatingId = getFloatingId(i, z);
        int pageId = getPageId(i, z);
        if (floatingId != 0 && pageId != 0) {
            return new HealthPageResTrigger(this, i2, new MarketingIdInfo.a().a(pageId).b(floatingId).d());
        }
        LogUtil.a(TAG, "no marketingIdInfo pos id found for healthType = ", Integer.valueOf(i));
        return new BasePageResTrigger(this, i2, null);
    }

    private void configSubTitleBar(KnitHealthDetailActivity knitHealthDetailActivity) {
        ViewStub viewStub = (ViewStub) knitHealthDetailActivity.findViewById(R.id.knit_sub_tab_widget_stub);
        viewStub.setLayoutResource(configSubTabStyle());
        this.mSubTabWidget = (HealthSubTabWidget) viewStub.inflate();
    }

    protected int configSubTabStyle() {
        return R.layout.knit_sub_tab_widget_default;
    }

    protected void createShareBitmap() {
        Fragment item = this.mSubTabAdapter.getItem(this.mViewPager.getCurrentItem());
        if (item instanceof KnitFragment) {
            KnitFragment knitFragment = (KnitFragment) item;
            this.currentDayMsg = knitFragment.getCurrentDayMsg();
            this.sleepScoringData = knitFragment.getSleepScoringData();
            this.sleepEfficientDesc = knitFragment.getSleepEfficientDesc();
            this.deviceId = knitFragment.getDeviceId();
            List<Bitmap> shareBitmap = knitFragment.getShareBitmap();
            if (njy.b(shareBitmap)) {
                this.shareContainer.d(shareBitmap.get(0));
                if (shareBitmap.size() > 1) {
                    this.shareContainer.c(shareBitmap.subList(1, shareBitmap.size() - 1));
                    this.shareContainer.d(shareBitmap.get(shareBitmap.size() - 1));
                }
            }
        }
    }

    protected KnitFragment getCurrentFragment() {
        Fragment item = this.mSubTabAdapter.getItem(this.mViewPager.getCurrentItem());
        if (item instanceof KnitFragment) {
            return (KnitFragment) item;
        }
        return null;
    }

    private void addShareView(Object obj) {
        if (obj instanceof View) {
            View view = (View) obj;
            if (view.getHeight() <= 0 || view.getWidth() <= 0) {
                return;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_4444);
            view.draw(new Canvas(bitmapCreateBitmap));
            this.shareContainer.d(bitmapCreateBitmap);
            return;
        }
        if (obj instanceof Bitmap) {
            this.shareContainer.d((Bitmap) obj);
        } else {
            LogUtil.a(TAG, "other type view");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        configToast();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        configToast();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (this.mNoDataScrollViewListener != null) {
            this.mNoDataScrollViewListener = null;
        }
        super.onDestroy();
        ObserverManagerUtil.c(this.mObserver);
    }

    protected void configNoNetPage() {
        Fragment fragment;
        View viewFindViewById = this.mEmptyFragmentView.findViewById(R.id.no_network_layout);
        this.mNoNetworkLayout = viewFindViewById;
        if (viewFindViewById == null || (fragment = this.mEmptyFragment) == null) {
            return;
        }
        if (!CommonUtil.ab(fragment.getContext())) {
            this.mNoNetworkLayout.setVisibility(0);
        } else {
            this.mNoNetworkLayout.setVisibility(8);
        }
    }

    public void configScrollViewListener(final View view, final int i) {
        View view2 = this.mEmptyFragmentView;
        if (view2 != null) {
            this.mNoDataScrollView = (HealthScrollView) view2.findViewById(R.id.fitness_scroll_view);
        }
        LogUtil.a(TAG, "configScrollViewListener, mNoDataScrollView is null: ", Boolean.valueOf(this.mNoDataScrollView == null), ", listenerView is null: ", Boolean.valueOf(view == null), ", mIsEmptyFragmentAdded: ", Boolean.valueOf(this.mIsNoDataFragment));
        refreshTitleBar(!this.mIsNoDataFragment);
        if (this.mNoDataScrollView == null || view == null) {
            LogUtil.a(TAG, "do not need config ScrollViewListener");
            return;
        }
        ScrollViewListener scrollViewListener = new ScrollViewListener() { // from class: fwk
            @Override // com.huawei.ui.commonui.scrollview.ScrollViewListener
            public final void onScrollChanged(HealthScrollView healthScrollView, int i2, int i3, int i4, int i5) {
                this.e.m1122x959970e(view, i, healthScrollView, i2, i3, i4, i5);
            }
        };
        this.mNoDataScrollViewListener = scrollViewListener;
        this.mNoDataScrollView.setScrollViewListener(scrollViewListener);
    }

    /* JADX INFO: renamed from: lambda$configScrollViewListener$0$com-huawei-health-knit-ui-KnitHealthDetailActivity, reason: not valid java name */
    public /* synthetic */ void m1122x959970e(View view, int i, HealthScrollView healthScrollView, int i2, int i3, int i4, int i5) {
        this.mTitleViewHeight = this.mTitleBar.getMeasuredHeight();
        int measuredHeight = (view.getMeasuredHeight() - this.mTitleViewHeight) - i;
        this.mDistanceHeight = measuredHeight;
        if (measuredHeight > i3) {
            this.mTitleBar.setLeftButtonTextColor(ContextCompat.getDrawable(this, getWhiteLeftButtonBackDrawable()), getColor(R.color.emui_toolbar_icon_dark), qre.f(R.string.accessibility_go_back));
            this.mTitleBarBackGround = ContextCompat.getColor(this, R.color.transparent);
        } else {
            this.mTitleBar.setLeftButtonTextColor(ContextCompat.getDrawable(this, getBlackLeftButtonBackDrawable()), getColor(R.color.textColorPrimary), true, qre.f(R.string.accessibility_go_back));
            int i6 = this.mDistanceHeight;
            if (i6 + i > i3) {
                float f = i;
                float f2 = (i3 / f) - (i6 / f);
                LogUtil.a(TAG, "alpha: ", Float.valueOf(f2));
                this.mTitleBarBackGround = qqn.b(getColor(R.color.no_fragment_titlebgcolor), f2);
            } else {
                this.mTitleBarBackGround = ContextCompat.getColor(this, R.color.no_fragment_titlebgcolor);
            }
        }
        this.mTitleBar.setTitleBarBackgroundColor(this.mTitleBarBackGround);
    }

    public void setTitleStyleNoData() {
        this.mTitleBar.setLeftButtonTextColor(ContextCompat.getDrawable(this, getBlackLeftButtonBackDrawable()), getColor(R.color.textColorPrimary), true, qre.f(R.string.accessibility_go_back));
        this.mTitleBarBackGround = ContextCompat.getColor(this, R.color.no_fragment_titlebgcolor);
    }

    private void configScrollViewTouchListening() {
        LogUtil.a(TAG, "configScrollViewTouchListening");
        this.mHasDataScrollView = (ScrollView) this.mHasDataFragmentView.findViewById(R.id.fitness_scroll_view);
        HealthScrollView healthScrollView = (HealthScrollView) this.mEmptyFragmentView.findViewById(R.id.fitness_scroll_view);
        this.mNoDataScrollView = healthScrollView;
        if (healthScrollView != null) {
            int floatingId = getFloatingId(false);
            Fragment fragment = this.mEmptyFragment;
            if (fragment == null || fragment.getActivity() == null) {
                LogUtil.e(TAG, "mEmptyFragment == null || mEmptyFragment.getActivity() == null");
                return;
            } else {
                ScrollUtil.a(this.mNoDataScrollView, ((FragmentActivity) Objects.requireNonNull(this.mEmptyFragment.getActivity())).getWindow().getDecorView(), floatingId);
                return;
            }
        }
        if (this.mHasDataScrollView != null) {
            ScrollUtil.a(this.mHasDataScrollView, getWindow().getDecorView(), getFloatingId(true));
        } else {
            LogUtil.a(TAG, "the ScrollView is empty and can not set ScreenTouchListener");
        }
    }

    private int getFloatingId(boolean z) {
        return getFloatingId(getPageType(), z);
    }

    private int getFloatingId(int i, boolean z) {
        Integer num = (z ? FLOATING_ID_MAP : NO_DATA_FLOATING_ID_MAP).get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    private int getPageId(int i, boolean z) {
        Integer num = (z ? PAGE_ID_MAP : NO_DATA_PAGE_ID_MAP).get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public void configHealthDetailActivity() {
        configScrollViewTouchListening();
        if (this.mLatestTime == 0) {
            configNoNetPage();
        }
    }

    public void refreshTitleBar(boolean z) {
        LogUtil.a(TAG, "refreshTitleBar, isHasData: ", Boolean.valueOf(z));
        CustomTitleBar customTitleBar = this.mTitleBar;
        if (customTitleBar == null) {
            LogUtil.a(TAG, "mTitleBar is null");
            return;
        }
        if (z) {
            customTitleBar.setRightButtonVisibility(0);
            this.mTitleBar.setTitleBarBackgroundColor(ContextCompat.getColor(this, R.color.no_fragment_titlebgcolor));
            if (isFlyme() && qrs.x(this)) {
                this.mTitleBar.setLeftButtonTextColor(ContextCompat.getDrawable(this, getWhiteLeftButtonBackDrawable()), getColor(R.color.emui_toolbar_icon_dark), qre.f(R.string.accessibility_go_back));
                return;
            } else {
                this.mTitleBar.setLeftButtonTextColor(ContextCompat.getDrawable(this, getBlackLeftButtonBackDrawable()), getColor(R.color.textColorPrimary), true, qre.f(R.string.accessibility_go_back));
                return;
            }
        }
        customTitleBar.setRightButtonVisibility(8);
        refreshNoDataTitleBar(this.mTitleBar);
    }

    public void refreshNoDataTitleBar(CustomTitleBar customTitleBar) {
        if (this.mTitleBarBackGround != BaseApplication.getContext().getColor(R.color.transparent)) {
            LogUtil.a(TAG, "background is not match");
            this.mTitleBar.setTitleBarBackgroundColor(this.mTitleBarBackGround);
            this.mTitleBar.setLeftButtonTextColor(ContextCompat.getDrawable(this, getBlackLeftButtonBackDrawable()), getColor(R.color.textColorPrimary), true, qre.f(R.string.accessibility_go_back));
        } else {
            this.mTitleBar.setTitleBarBackgroundColor(BaseApplication.getContext().getColor(R.color.transparent));
            this.mTitleBar.setLeftButtonTextColor(ContextCompat.getDrawable(this, getWhiteLeftButtonBackDrawable()), getColor(R.color.emui_toolbar_icon_dark), qre.f(R.string.accessibility_go_back));
        }
    }

    public int getBlackLeftButtonBackDrawable() {
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            return R.drawable.health_navbar_rtl_back_selector;
        }
        return R.drawable.hwsearchview_ic_public_back;
    }

    public int getWhiteLeftButtonBackDrawable() {
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            return R.drawable.ic_back_white_reverse;
        }
        return R.drawable.ic_back_white;
    }

    protected boolean isDeviceConnected() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, TAG);
        return deviceInfo != null && deviceInfo.getDeviceConnectState() == 2;
    }

    protected int getPageState() {
        return this.mState;
    }

    public void setEmptyFragmentMargin() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mEmptyFragmentView.getLayoutParams();
        layoutParams.bottomMargin = qqp.a(BaseApplication.getContext(), 50.0f);
        this.mEmptyFragmentView.setLayoutParams(layoutParams);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public void finish() {
        if (ActivityTransitionAnimator.c().a()) {
            HandlerExecutor.b(new Runnable() { // from class: fwm
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34641a.m1123xfcd6c142();
                }
            });
        } else {
            super.finish();
        }
    }

    /* JADX INFO: renamed from: lambda$finish$1$com-huawei-health-knit-ui-KnitHealthDetailActivity, reason: not valid java name */
    public /* synthetic */ void m1123xfcd6c142() {
        ActivityTransitionAnimator.c().a(qrs.ad(this)).c(qrs.q(this)).b();
    }

    /* JADX INFO: loaded from: classes7.dex */
    static class c implements Observer {
        private final WeakReference<KnitHealthDetailActivity> d;

        c(KnitHealthDetailActivity knitHealthDetailActivity) {
            this.d = new WeakReference<>(knitHealthDetailActivity);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            KnitHealthDetailActivity knitHealthDetailActivity = this.d.get();
            if (knitHealthDetailActivity == null || knitHealthDetailActivity.isDestroyed() || knitHealthDetailActivity.isFinishing()) {
                ReleaseLogUtil.d(KnitHealthDetailActivity.TAG, "InnerObserver notify activity ", knitHealthDetailActivity);
                return;
            }
            LogUtil.a(KnitHealthDetailActivity.TAG, "InnerObserver notify label ", str, " objects ", objArr);
            knitHealthDetailActivity.mIsFirst = false;
            knitHealthDetailActivity.addSubTagFragments(knitHealthDetailActivity.mSubTabWidget, knitHealthDetailActivity.mSubTabAdapter, knitHealthDetailActivity.mBundle);
        }
    }
}
