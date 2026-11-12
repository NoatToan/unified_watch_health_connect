package com.huawei.pluginachievement.ui.report;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.huawei.agconnect.apms.Agent;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.impl.AchieveCallback;
import com.huawei.pluginachievement.impl.AchieveObserver;
import com.huawei.pluginachievement.manager.model.MedalConfigInfo;
import com.huawei.pluginachievement.manager.model.MedalInfoReport;
import com.huawei.pluginachievement.manager.model.UserAchieveWrapper;
import com.huawei.pluginachievement.manager.model.WeekAndMonthRecord;
import com.huawei.pluginachievement.ui.adapter.BreakInfoRecyclerAdapter;
import com.huawei.pluginachievement.ui.adapter.ReportMedalRecyclerAdapter;
import com.huawei.pluginachievement.ui.views.ReportTypeCardView;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.reportchart.HwHealthReportBarChart;
import com.huawei.ui.commonui.scrollview.HealthNestedScrollView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.undertextview.ReportUnderlineTextView;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.up.model.UserInfomation;
import defpackage.lmf;
import defpackage.njy;
import defpackage.oru;
import defpackage.osa;
import defpackage.osb;
import defpackage.osf;
import defpackage.osv;
import defpackage.otl;
import defpackage.otu;
import defpackage.otx;
import defpackage.ouf;
import defpackage.ouo;
import defpackage.out;
import defpackage.pad;
import defpackage.par;
import defpackage.pat;
import defpackage.paw;
import defpackage.pax;
import defpackage.pbo;
import defpackage.qgm;
import defpackage.qpx;
import defpackage.qqp;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseReportActivity extends BaseActivity implements AchieveObserver {
    private static final String DATA_QUERY_END_TIME = "dataQueryEndTime";
    private static final String DATA_QUERY_START_TIME = "dataQueryStartTime";
    private static final int KILOBYTES = 1024;
    private static final int MAP_INITIAL_SIZE = 4;
    private static final int MAX_SIZE_MB = 1;
    private static final int MSG_GET_USER_INFO_FAIL = 1001;
    private static final int MSG_GET_USER_INFO_SUCCESS = 1000;
    private static final int RECORD_MIN_NUM = 2;
    private static final String TAG = "PLGACHIEVE_BaseReportActivity";
    private static final int WHAT_GET_ALL_MEDAL_CONFIGURE = 1002;
    private static final int WHAT_GET_DATA_EMPTY = 1009;
    private static final int WHAT_GET_DATA_SUCCESS = 1007;
    private static final int WHAT_GET_DATA_SUCCESS_CONTINUE = 1008;
    private static final int WHAT_REFRESH_BREAK_INFO = 1005;
    private static final int WHAT_REFRESH_DATA_FROM_NET = 1006;
    private static final int WHAT_REFRESH_WEEK_AND_MONTH_VIEW = 1004;
    private HealthTextView mBreakInfoDescText;
    private HealthCardView mBreakInfoItemLayout;
    private BreakInfoRecyclerAdapter mBreakInfoRecyclerAdapter;
    private HealthRecycleView mBreakInfoRecyclerView;
    private HealthTextView mComplianceDaysDescText;
    private ImageView mComplianceDaysImageView;
    private HealthTextView mComplianceDaysValueText;
    protected LinearLayout mContentLinearLayout;
    protected Context mContext;
    protected CustomTitleBar mCustomTitleBar;
    protected ExecutorService mExecutor;
    protected HealthTextView mExerciseAvgCaloriesTitleText;
    protected HealthTextView mExerciseAvgCaloriesValueText;
    protected HealthTextView mExerciseComparedCaloriesDescText;
    protected HealthTextView mExerciseComparedTimeValueText;
    protected HealthTextView mExerciseDescText;
    protected ImageView mExerciseHeatImage;
    private HealthCardView mExerciseItemLayout;
    protected ImageView mExerciseTimeImage;
    protected HealthTextView mExerciseTotalCaloriesTitleText;
    protected HealthTextView mExerciseTotalCaloriesValueText;
    protected HealthTextView mExerciseTotalTimeTitleText;
    protected HealthTextView mExerciseTotalTimeValueText;
    protected HealthCardView mExerciseTypeItemLayout;
    private HealthProgressBar mLoadingView;
    protected HealthTextView mMedalDescTextView;
    private ImageView mMedalItemBackground;
    private HealthCardView mMedalItemLayout;
    private HealthTextView mMedalNumbersTextView;
    private ReportMedalRecyclerAdapter mMedalRecyclerAdapter;
    protected HealthRecycleView mMedalRecyclerView;
    private HealthTextView mNoReportLayout;
    protected ImageView mPersonalHeaderIcon;
    private HealthTextView mReportAvgDailyStepText;
    private HealthTextView mReportAvgDailyStepTitleText;
    private LinearLayout mReportCardLayout;
    private HealthTextView mReportComparedStepText;
    private HealthTextView mReportComparedStepTitleText;
    private FrameLayout mReportContentLayout;
    private long mReportEndTime;
    protected HealthTextView mReportExerciseTypeDec;
    protected ReportUnderlineTextView mReportExerciseTypeTitle;
    protected ImageView mReportHeadRootBackground;
    protected RelativeLayout mReportHeadRootLayout;
    protected HealthTextView mReportIntervalDateNoText;
    protected HealthTextView mReportIntervalDateText;
    private FrameLayout mReportLoadingView;
    protected HwHealthReportBarChart mReportStepBarChart;
    private HealthTextView mReportStepDescText;
    protected HealthTextView mReportStepGoalText;
    protected ReportTypeCardView mReportTypePieChart;
    protected View mReportUserView;
    protected Resources mResource;
    private otl mService;
    protected LinearLayout mShareLogoLayout;
    protected HealthNestedScrollView mShareView;
    protected HealthCardView mStepItemLayout;
    private int mStepTarget;
    private UserInfomation mUserInfo;
    private UserProfileMgrApi mUserProfileMgrApi;
    protected HealthTextView mUsernameText;
    protected int mUsernameTextColor;
    protected ImageView mVipImage;
    private ImageView mWalkingMan;
    protected int mMaxReportNo = 0;
    protected int mMinReportNo = 0;
    protected boolean mIsRtlLanguage = false;
    protected boolean mIsImperialUnit = false;
    private boolean mIsShare = false;
    private boolean mIsGetNewData = false;
    private boolean mIsFirstGetData = false;
    private List<osf> mMedalConfigInfoList = new ArrayList(10);
    private Handler mHandler = new c(Looper.getMainLooper(), this);
    private boolean mIsGetAllMedalData = false;
    private boolean isDoRefreshing = false;

    protected abstract void findViewsById();

    protected abstract String getAvgDailyStepTitleText();

    protected abstract long getBarChartEndTime();

    protected abstract long getBarChartStartTime();

    protected abstract String getCachedMaxReportNo();

    protected abstract String getCachedMinReportNo();

    protected abstract String getClassName();

    protected abstract String getComparedStepTitleText();

    protected abstract int getContentType();

    protected abstract String getCustomTitleBarText();

    protected abstract String getExerciseAvgCaloriesTitle();

    protected abstract String getExerciseCaloriesTitleText();

    protected abstract int getLayoutId();

    protected abstract CharSequence getMedalNumbersText(int i);

    protected abstract String getNoReportHint();

    protected abstract String getReportRecentType();

    protected abstract int getReportType();

    protected abstract String getSuccessShareBiValue();

    protected abstract void refreshAchieveReportView(WeekAndMonthRecord weekAndMonthRecord, WeekAndMonthRecord weekAndMonthRecord2, Context context, pad padVar);

    protected abstract void refreshBarChart(WeekAndMonthRecord weekAndMonthRecord);

    protected abstract void refreshExerciseTypeView(WeekAndMonthRecord weekAndMonthRecord);

    protected abstract void refreshExerciseView(Context context, WeekAndMonthRecord weekAndMonthRecord, WeekAndMonthRecord weekAndMonthRecord2, pad padVar);

    protected abstract void refreshMedalView(WeekAndMonthRecord weekAndMonthRecord);

    protected abstract void setBreakInfoBg(ImageView imageView);

    protected abstract void setMedalImageHeight(ImageView imageView, int i);

    protected abstract void startHistoricalActivityForResult();

    protected void initStepBarChartSet(List<BarEntry> list, ArrayList<String> arrayList, int i, int i2) {
        BarDataSet barDataSet = new BarDataSet(list, Agent.OS_NAME);
        barDataSet.setColor(getResources().getColor(R.color.bar_chart_dark_color));
        barDataSet.setDrawValues(false);
        barDataSet.setBarBorderWidth(2.0f);
        ArrayList arrayList2 = new ArrayList(2);
        arrayList2.add(barDataSet);
        this.mReportStepBarChart.setData(new BarData(arrayList2));
        this.mReportStepBarChart.setCustomValue(this.mContext, arrayList, getResources().getColor(R.color.bar_chart_highlight_color), this.mStepTarget, i2, i, false);
        this.mReportStepBarChart.invalidate();
    }

    /* JADX INFO: loaded from: classes13.dex */
    static class c extends BaseHandler<BaseReportActivity> {
        private c(Looper looper, BaseReportActivity baseReportActivity) {
            super(looper, baseReportActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(BaseReportActivity baseReportActivity, Message message) {
            if (message == null) {
                LogUtil.j(BaseReportActivity.TAG, "handleMessageWhenReferenceNotNull activity or message is null.");
                return;
            }
            LogUtil.a(BaseReportActivity.TAG, "showReport_handleMessage message = ", Integer.valueOf(message.what));
            switch (message.what) {
                case 1000:
                    if (message.obj instanceof String) {
                        baseReportActivity.showUserHeadImage((String) message.obj);
                        return;
                    } else {
                        LogUtil.j(BaseReportActivity.TAG, "MSG_GET_USER_INFO_SUCCESS is not user information!");
                        return;
                    }
                case 1001:
                    baseReportActivity.mPersonalHeaderIcon.setImageResource(R.mipmap.ic_personal_head);
                    return;
                case 1002:
                    baseReportActivity.mIsGetAllMedalData = true;
                    return;
                case 1003:
                default:
                    return;
                case 1004:
                    if (!(message.obj instanceof List)) {
                        baseReportActivity.showNoReportDataView();
                        return;
                    }
                    List list = (List) message.obj;
                    Bundle data = message.getData();
                    if (data != null) {
                        baseReportActivity.refreshStepAndExerciseView(data.getLong(BaseReportActivity.DATA_QUERY_START_TIME), data.getLong(BaseReportActivity.DATA_QUERY_END_TIME), baseReportActivity.removeDuplicateData(list));
                        return;
                    } else {
                        LogUtil.j(BaseReportActivity.TAG, "message = WHAT_REFRESH_WEEK_AND_MONTH_VIEW, data is null.");
                        baseReportActivity.showNoReportDataView();
                        return;
                    }
                case 1005:
                    if (message.obj instanceof Map) {
                        baseReportActivity.refreshBreakInfoViews((Map) message.obj);
                        return;
                    }
                    return;
                case 1006:
                    LogUtil.a(BaseReportActivity.TAG, "refresh WHAT_REFRESH_DATA_FROM_NET");
                    baseReportActivity.refreshDataFromNet(message);
                    return;
                case 1007:
                    break;
                case 1008:
                    LogUtil.a(BaseReportActivity.TAG, "refresh WHAT_GET_DATA_SUCCESS_CONTINUE");
                    if (baseReportActivity.mIsFirstGetData) {
                        LogUtil.a(BaseReportActivity.TAG, "NO refresh");
                        return;
                    }
                    break;
                case 1009:
                    LogUtil.a(BaseReportActivity.TAG, "refresh WHAT_GET_DATA_FAIL");
                    baseReportActivity.showNoReportDataView();
                    return;
            }
            LogUtil.a(BaseReportActivity.TAG, "refresh WHAT_GET_DATA_SUCCESS");
            baseReportActivity.refreshDataFromDb(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshDataFromDb(Message message) {
        this.mIsGetNewData = true;
        if (!(message.obj instanceof long[])) {
            LogUtil.j(TAG, "refreshDataFromDb() message is null.return.");
            closeProgress();
        } else {
            long[] jArr = (long[]) message.obj;
            final long j = jArr[0];
            final long j2 = jArr[1];
            this.mExecutor.execute(new Runnable() { // from class: pah
                @Override // java.lang.Runnable
                public final void run() {
                    this.f45076b.m1652x3bf6c1f7(j, j2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: refreshDataFromDbInner, reason: merged with bridge method [inline-methods] */
    public void m1652x3bf6c1f7(long j, long j2) {
        LogUtil.a(TAG, "refreshDataFromDb() startTime = ", Long.valueOf(j), ", endTime = ", Long.valueOf(j2));
        List<osf> listD = otl.b(this.mContext).d(20, getReportParamMap(j, j2));
        if (njy.b(listD)) {
            LogUtil.a(TAG, "refreshDataFromDb achieveDataList size ", Integer.valueOf(listD.size()));
            Message messageObtainMessage = this.mHandler.obtainMessage();
            messageObtainMessage.what = 1004;
            messageObtainMessage.obj = listD;
            Bundle bundle = new Bundle();
            bundle.putLong(DATA_QUERY_START_TIME, j);
            bundle.putLong(DATA_QUERY_END_TIME, j2);
            messageObtainMessage.setData(bundle);
            this.mHandler.sendMessage(messageObtainMessage);
        } else {
            LogUtil.a(TAG, "refreshDataFromDb achieveDataList is empty.");
            Message messageObtainMessage2 = this.mHandler.obtainMessage();
            messageObtainMessage2.what = 1009;
            this.mHandler.sendMessage(messageObtainMessage2);
        }
        closeProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshDataFromNet(Message message) {
        if (message == null) {
            LogUtil.j(TAG, "refreshDataFromNet() message is null.return.");
            return;
        }
        if (this.isDoRefreshing) {
            refreshViewByNetData(message.arg1, message.arg2);
        }
        this.isDoRefreshing = false;
    }

    private void refreshViewByNetData(int i, int i2) {
        if (i == -1) {
            LogUtil.j(TAG, "onDataChanged error=", Integer.valueOf(i));
        } else if (i2 == 0) {
            initUserInfo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshBreakInfoViews(Map<Integer, Pair<Double, Long>> map) {
        if (map == null || map.size() <= 0) {
            LogUtil.a(TAG, "refreshBreakView data is null");
            initBreakInfoView(8);
            return;
        }
        initBreakInfoView(0);
        BreakInfoRecyclerAdapter breakInfoRecyclerAdapter = this.mBreakInfoRecyclerAdapter;
        if (breakInfoRecyclerAdapter == null) {
            this.mBreakInfoRecyclerAdapter = new BreakInfoRecyclerAdapter(this.mContext, map);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.mContext, 1);
            this.mBreakInfoRecyclerView.setAdapter(this.mBreakInfoRecyclerAdapter);
            this.mBreakInfoRecyclerView.setLayoutManager(gridLayoutManager);
            this.mBreakInfoRecyclerView.b(false);
            this.mBreakInfoRecyclerView.e(false);
            LogUtil.a(TAG, "refreshBreakInfoViews() breakInfoMap = ", Integer.valueOf(map.size()));
        } else {
            breakInfoRecyclerAdapter.c(map);
        }
        this.mBreakInfoDescText.setText(pat.c(this.mContext, map.size()));
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mExecutor = Executors.newSingleThreadExecutor();
        this.mContext = this;
        this.mResource = getResources();
        if (!CommonUtil.ab(this.mContext)) {
            qrs.e(this.mContext, getClassName(), getCustomTitleBarText(), false);
            finish();
            return;
        }
        this.mIsRtlLanguage = LanguageUtil.ba(this.mContext);
        this.mIsImperialUnit = UnitUtil.f();
        this.mUserProfileMgrApi = (UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class);
        registerAchieveObserver();
        initReportNumber();
        setContentView(getLayoutId());
        initView();
        findViewsById();
        BaseActivity.cancelLayoutById(this.mReportHeadRootLayout);
        getStepGoal();
        initData();
    }

    private void initReportNumber() {
        Intent intent = getIntent();
        if (intent != null) {
            this.mMaxReportNo = pax.s(intent.getStringExtra("max_report_no"));
            this.mMinReportNo = pax.s(intent.getStringExtra("min_report_no"));
        }
        clearBackgroundDrawable();
        int i = 0;
        try {
            if (getCachedMaxReportNo() != null && getCachedMinReportNo() != null) {
                i = Integer.parseInt(getCachedMaxReportNo());
                this.mMinReportNo = Integer.parseInt(getCachedMinReportNo());
                int iMax = Math.max(i, this.mMaxReportNo);
                this.mMaxReportNo = iMax;
                LogUtil.a(TAG, "maxReportNo:", Integer.valueOf(iMax), " minReportNo:", Integer.valueOf(this.mMinReportNo));
                int i2 = this.mMaxReportNo;
                if (i2 < this.mMinReportNo) {
                    this.mMinReportNo = i2;
                    return;
                }
                return;
            }
            LogUtil.j(TAG, "getCachedMaxReportNo or getCachedMinReportNo is null!");
        } catch (NumberFormatException unused) {
            LogUtil.e(TAG, "NumberFormatException");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        LogUtil.a(TAG, "onStart");
        super.onStart();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        LogUtil.a(TAG, "onStop");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeMessages(1004);
        }
        otl otlVar = this.mService;
        if (otlVar != null) {
            otlVar.d(this);
        }
        pbo.d(this.mExecutor);
        super.onDestroy();
    }

    private void registerAchieveObserver() {
        this.mService = otl.b(BaseApplication.getContext());
        LogUtil.a(TAG, "getData()");
        this.mService.c((AchieveObserver) this);
    }

    protected void initData() {
        initUserInfo();
        initStepData(getBarChartStartTime(), getBarChartEndTime());
        getAllMedalData();
    }

    private void getAllMedalData() {
        this.mExecutor.execute(new Runnable() { // from class: com.huawei.pluginachievement.ui.report.BaseReportActivity.3
            @Override // java.lang.Runnable
            public void run() {
                HashMap map = new HashMap(2);
                BaseReportActivity baseReportActivity = BaseReportActivity.this;
                baseReportActivity.mMedalConfigInfoList = otl.b(baseReportActivity.mContext).d(9, map);
                if (!njy.e(BaseReportActivity.this.mMedalConfigInfoList)) {
                    LogUtil.a(BaseReportActivity.TAG, "getMedalData mMedalConfigInfoList = ", Integer.valueOf(BaseReportActivity.this.mMedalConfigInfoList.size()));
                    if (BaseReportActivity.this.mHandler != null) {
                        BaseReportActivity.this.mHandler.sendEmptyMessage(1002);
                        return;
                    }
                    return;
                }
                LogUtil.j(BaseReportActivity.TAG, "getMedalData mMedalConfigInfoList is empty.");
            }
        });
    }

    protected void initBreakInfo(final long j, final int i) {
        this.mExecutor.execute(new Runnable() { // from class: com.huawei.pluginachievement.ui.report.BaseReportActivity.5
            @Override // java.lang.Runnable
            public void run() {
                Map<Integer, Pair<Double, Long>> mapB = otu.b(BaseReportActivity.this.mContext).b(j, i);
                if (BaseReportActivity.this.mHandler != null) {
                    Message messageObtainMessage = BaseReportActivity.this.mHandler.obtainMessage();
                    messageObtainMessage.what = 1005;
                    messageObtainMessage.obj = mapB;
                    BaseReportActivity.this.mHandler.sendMessage(messageObtainMessage);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshStepAndExerciseView(long j, long j2, List<osf> list) {
        LogUtil.a(TAG, "refreshStepAndExerciseView() startTime = ", Long.valueOf(j), ", endTime = ", Long.valueOf(j2));
        if (njy.e(list)) {
            showNoReportDataView();
            return;
        }
        LogUtil.a(TAG, "refreshStepAndExerciseView() size = ", Integer.valueOf(list.size()));
        long j3 = this.mReportEndTime;
        if (j3 != j2) {
            LogUtil.j(TAG, "endTime = ", Long.valueOf(j2), " mReportEndTime= ", Long.valueOf(j3));
            return;
        }
        WeekAndMonthRecord weekAndMonthRecord = null;
        WeekAndMonthRecord weekAndMonthRecord2 = null;
        for (osf osfVar : list) {
            if (osfVar == null) {
                LogUtil.j(TAG, "refreshStepAndExerciseView() achieveData is null.");
            } else {
                WeekAndMonthRecord weekAndMonthRecord3 = osfVar instanceof WeekAndMonthRecord ? (WeekAndMonthRecord) osfVar : null;
                if (weekAndMonthRecord3 == null) {
                    LogUtil.j(TAG, "refreshStepAndExerciseView weekAndMonthRecord is null");
                } else {
                    long startTimestamp = weekAndMonthRecord3.getStartTimestamp();
                    long endTimestamp = weekAndMonthRecord3.getEndTimestamp();
                    if (j2 == endTimestamp) {
                        weekAndMonthRecord = weekAndMonthRecord3;
                    } else if (j == startTimestamp) {
                        weekAndMonthRecord2 = weekAndMonthRecord3;
                    } else {
                        LogUtil.j(TAG, "refreshStepAndExerciseView() startTimestamp = ", Long.valueOf(startTimestamp), ", endTimestamp = ", Long.valueOf(endTimestamp));
                    }
                }
            }
        }
        if (weekAndMonthRecord == null) {
            LogUtil.j(TAG, "refreshStepAndExerciseView() currentRecord is null.");
            showNoReportDataView();
        } else {
            if (this.mUserInfo == null) {
                initUserInfo();
            }
            showReportDataView(weekAndMonthRecord, weekAndMonthRecord2);
            closeProgress();
        }
    }

    private void showReportDataView(WeekAndMonthRecord weekAndMonthRecord, WeekAndMonthRecord weekAndMonthRecord2) {
        this.mNoReportLayout.setVisibility(8);
        this.mShareView.setVisibility(0);
        this.mCustomTitleBar.setRightSoftkeyVisibility(0);
        refreshStepTarget();
        refreshBarChart(weekAndMonthRecord);
        refreshStepOtherView(weekAndMonthRecord, weekAndMonthRecord2);
        refreshExerciseOtherView(weekAndMonthRecord, weekAndMonthRecord2);
        refreshExerciseTypeView(weekAndMonthRecord);
        if (this.mIsGetAllMedalData) {
            refreshMedalView(weekAndMonthRecord);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showNoReportDataView() {
        if (!this.mIsGetNewData) {
            showProgress();
            return;
        }
        this.mNoReportLayout.setVisibility(0);
        this.mNoReportLayout.setText(getNoReportHint());
        this.mShareView.setVisibility(8);
        this.mCustomTitleBar.setRightSoftkeyVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeProgress() {
        if (!HandlerExecutor.c()) {
            HandlerExecutor.c(new Runnable() { // from class: pak
                @Override // java.lang.Runnable
                public final void run() {
                    this.f45078a.closeProgress();
                }
            });
            return;
        }
        LogUtil.a(TAG, "closeProgressDialog");
        this.mReportContentLayout.setVisibility(0);
        this.mReportLoadingView.setVisibility(8);
    }

    private void showProgress() {
        LogUtil.a(TAG, "showProgressDialog");
        this.mReportContentLayout.setVisibility(8);
        this.mReportLoadingView.setVisibility(0);
    }

    protected void refreshExerciseOtherView(WeekAndMonthRecord weekAndMonthRecord, WeekAndMonthRecord weekAndMonthRecord2) {
        pad padVar = new pad();
        padVar.h(this.mExerciseDescText);
        padVar.m(this.mExerciseTotalTimeValueText);
        padVar.f(this.mExerciseComparedTimeValueText);
        padVar.b(this.mExerciseTimeImage);
        padVar.a(this.mExerciseHeatImage);
        padVar.o(this.mExerciseTotalCaloriesValueText);
        padVar.i(this.mExerciseComparedCaloriesDescText);
        padVar.g(this.mExerciseAvgCaloriesValueText);
        refreshExerciseView(this.mContext, weekAndMonthRecord, weekAndMonthRecord2, padVar);
    }

    private void refreshStepOtherView(WeekAndMonthRecord weekAndMonthRecord, WeekAndMonthRecord weekAndMonthRecord2) {
        pad padVar = new pad();
        padVar.b(this.mIsImperialUnit);
        padVar.n(this.mReportStepDescText);
        padVar.b(this.mReportAvgDailyStepText);
        padVar.c(this.mReportComparedStepText);
        padVar.a(this.mStepTarget);
        padVar.c(this.mComplianceDaysImageView);
        padVar.j(this.mComplianceDaysValueText);
        padVar.a(this.mComplianceDaysDescText);
        refreshAchieveReportView(weekAndMonthRecord, weekAndMonthRecord2, this.mContext, padVar);
    }

    private void refreshStepTarget() {
        HealthTextView healthTextView;
        int i = this.mStepTarget;
        if (i != 0) {
            osa.b(this.mContext, "stepGoal", String.valueOf(i));
        } else {
            String strE = osa.e(this.mContext, "stepGoal");
            if (TextUtils.isEmpty(strE)) {
                getStepGoal();
            } else {
                this.mStepTarget = pax.s(strE);
            }
        }
        if (this.mStepTarget == 0 || (healthTextView = this.mReportStepGoalText) == null) {
            return;
        }
        healthTextView.setVisibility(0);
        this.mReportStepGoalText.setText(this.mResource.getString(R.string.IDS_report_step_goal, UnitUtil.e(this.mStepTarget, 1, 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<osf> removeDuplicateData(List<osf> list) {
        LogUtil.a(TAG, "removeDuplicateData enter");
        if (list == null || list.size() <= 4) {
            return list;
        }
        ArrayList arrayList = new ArrayList(4);
        ArrayList arrayList2 = new ArrayList(4);
        for (osf osfVar : list) {
            if (osfVar instanceof WeekAndMonthRecord) {
                long startTimestamp = ((WeekAndMonthRecord) osfVar).getStartTimestamp();
                LogUtil.a(TAG, "removeDuplicateData achieveListData startTimestamp == ", Long.valueOf(startTimestamp));
                if (!arrayList2.contains(Long.valueOf(startTimestamp))) {
                    arrayList.add(osfVar);
                    arrayList2.add(Long.valueOf(startTimestamp));
                }
            }
        }
        Collections.sort(arrayList, new Comparator<osf>() { // from class: com.huawei.pluginachievement.ui.report.BaseReportActivity.4
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public int compare(osf osfVar2, osf osfVar3) {
                if (!(osfVar2 instanceof WeekAndMonthRecord)) {
                    return -1;
                }
                WeekAndMonthRecord weekAndMonthRecord = (WeekAndMonthRecord) osfVar2;
                if (osfVar3 instanceof WeekAndMonthRecord) {
                    return (int) (((WeekAndMonthRecord) osfVar3).getStartTimestamp() - weekAndMonthRecord.getStartTimestamp());
                }
                return -1;
            }
        });
        return arrayList;
    }

    protected void initStepData(final long j, final long j2) {
        this.mIsGetNewData = false;
        this.mExecutor.execute(new Runnable() { // from class: com.huawei.pluginachievement.ui.report.BaseReportActivity.2
            @Override // java.lang.Runnable
            public void run() {
                BaseReportActivity.this.initStepDataInner(j, j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initStepDataInner(long j, long j2) {
        this.mReportEndTime = j2;
        HashMap<String, String> reportParamMap = getReportParamMap(j, j2);
        otl otlVarB = otl.b(this.mContext);
        if (otlVarB != null) {
            List<osf> listD = otlVarB.d(20, reportParamMap);
            if (njy.b(listD) && listD.size() >= 2) {
                LogUtil.a(TAG, "initStepData achieveDataList size ", Integer.valueOf(listD.size()));
                Message messageObtainMessage = this.mHandler.obtainMessage();
                messageObtainMessage.what = 1004;
                messageObtainMessage.obj = listD;
                Bundle bundle = new Bundle();
                bundle.putLong(DATA_QUERY_START_TIME, j);
                bundle.putLong(DATA_QUERY_END_TIME, j2);
                messageObtainMessage.setData(bundle);
                this.mHandler.sendMessage(messageObtainMessage);
                this.mIsFirstGetData = true;
            } else {
                this.mIsFirstGetData = false;
                LogUtil.j(TAG, "initStepData achieveDataList is empty. ");
                Message messageObtainMessage2 = this.mHandler.obtainMessage();
                messageObtainMessage2.what = 1009;
                this.mHandler.sendMessage(messageObtainMessage2);
            }
            otx.b(this.mContext).a(j, j2, 11, new a(this, j, j2));
        }
    }

    private HashMap<String, String> getReportParamMap(long j, long j2) {
        HashMap<String, String> map = new HashMap<>(4);
        map.put("startTimestamp", String.valueOf(j));
        map.put("endTimeStamp", String.valueOf(j2));
        map.put("dataSource", String.valueOf(2));
        map.put("recentType", getReportRecentType());
        return map;
    }

    protected void setMedalData(ArrayList<String> arrayList) {
        if (njy.e(arrayList)) {
            LogUtil.j(TAG, "setMedalData medalIdList is empty.");
            return;
        }
        int size = arrayList.size();
        LogUtil.j(TAG, "setMedalData medalIdListSize = ", Integer.valueOf(size));
        this.mMedalNumbersTextView.setText(getMedalNumbersText(size));
        this.mMedalDescTextView.setText(pat.e(this.mContext, getReportType(), size));
        setMedalImageHeight(this.mMedalItemBackground, size);
        ArrayList arrayList2 = new ArrayList(size);
        for (String str : arrayList) {
            if (TextUtils.isEmpty(str)) {
                LogUtil.j(TAG, "setMedalData medalId is empty.");
            } else {
                MedalInfoReport medalInfoReport = new MedalInfoReport();
                for (osf osfVar : this.mMedalConfigInfoList) {
                    if (osfVar instanceof MedalConfigInfo) {
                        MedalConfigInfo medalConfigInfo = (MedalConfigInfo) osfVar;
                        if (str.equals(medalConfigInfo.acquireMedalID())) {
                            medalInfoReport.setMedalId(str);
                            medalInfoReport.setMedalName(medalConfigInfo.acquireMedalName());
                            medalInfoReport.setGrayDetailStyle(medalConfigInfo.acquireGrayDetailStyle());
                            medalInfoReport.setMedalTypeLevel(osv.e(medalConfigInfo.acquireMedalType(), String.valueOf(medalConfigInfo.acquireMedalLevel())));
                            arrayList2.add(medalInfoReport);
                            break;
                        }
                    }
                }
            }
        }
        ReportMedalRecyclerAdapter reportMedalRecyclerAdapter = this.mMedalRecyclerAdapter;
        if (reportMedalRecyclerAdapter == null) {
            ReportMedalRecyclerAdapter reportMedalRecyclerAdapter2 = new ReportMedalRecyclerAdapter(this.mContext, arrayList2);
            this.mMedalRecyclerAdapter = reportMedalRecyclerAdapter2;
            this.mMedalRecyclerView.setAdapter(reportMedalRecyclerAdapter2);
            return;
        }
        reportMedalRecyclerAdapter.e(arrayList2);
    }

    private void initUserInfo() {
        Bitmap bitmapC;
        ImageView imageView;
        if (this.mUserInfo == null) {
            UserInfomation userInfo = this.mUserProfileMgrApi.getUserInfo();
            this.mUserInfo = userInfo;
            if (userInfo == null) {
                return;
            }
        }
        this.mUsernameText.setTextColor(this.mUsernameTextColor);
        this.mUsernameText.setText(this.mUserInfo.getName());
        String picPath = this.mUserInfo.getPicPath();
        if (!TextUtils.isEmpty(picPath) && (bitmapC = ouf.c(BaseApplication.getContext(), picPath)) != null && (imageView = this.mPersonalHeaderIcon) != null) {
            imageView.setImageBitmap(bitmapC);
            return;
        }
        LogUtil.j(TAG, "initUserInfo() imgUrl is empty.");
        String portraitUrl = this.mUserInfo.getPortraitUrl();
        if (!TextUtils.isEmpty(portraitUrl)) {
            showUserHeadImage(portraitUrl);
        } else {
            LogUtil.a(TAG, "initUserInfo() portraitUrl is empty.");
            getHeadIconFromCloud();
        }
    }

    private void getHeadIconFromCloud() {
        LogUtil.a(TAG, "get User head url from db");
        this.mUserProfileMgrApi.getUserInfo(new BaseResponseCallback<UserInfomation>() { // from class: com.huawei.pluginachievement.ui.report.BaseReportActivity.1
            @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onResponse(int i, UserInfomation userInfomation) {
                if (i != 0) {
                    BaseReportActivity.this.mHandler.sendEmptyMessage(1001);
                    return;
                }
                if (userInfomation == null) {
                    LogUtil.j(BaseReportActivity.TAG, "get user info success but obtain null objData");
                    return;
                }
                Message messageObtain = Message.obtain();
                messageObtain.obj = userInfomation.getPortraitUrl();
                messageObtain.what = 1000;
                BaseReportActivity.this.mHandler.sendMessage(messageObtain);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showUserHeadImage(String str) {
        osb.c(str, this.mPersonalHeaderIcon);
    }

    protected void initView() {
        initCustomTitleBarView();
        initPersonalView();
        initStepView();
        initExerciseView();
        initExerciseTypeView();
        initLoading();
    }

    private void initLoading() {
        this.mReportContentLayout = (FrameLayout) out.d(this, R.id.report_content_layout);
        this.mReportLoadingView = (FrameLayout) out.d(this, R.id.report_loading_view);
        HealthProgressBar healthProgressBar = (HealthProgressBar) out.d(this, R.id.hw_report_loading_view);
        this.mLoadingView = healthProgressBar;
        healthProgressBar.setLayerType(1, null);
    }

    private void initExerciseTypeView() {
        HealthCardView healthCardView = (HealthCardView) out.d(this, R.id.exercise_type_item_layout);
        this.mExerciseTypeItemLayout = healthCardView;
        this.mReportTypePieChart = (ReportTypeCardView) out.b(healthCardView, R.id.reportTypePieChart);
        this.mReportExerciseTypeTitle = (ReportUnderlineTextView) out.b(this.mExerciseTypeItemLayout, R.id.report_exercise_type_title);
        this.mReportExerciseTypeDec = (HealthTextView) out.b(this.mExerciseTypeItemLayout, R.id.report_exercise_type_desc);
    }

    private void initExerciseView() {
        HealthCardView healthCardView = (HealthCardView) out.d(this, R.id.exercise_item_layout);
        this.mExerciseItemLayout = healthCardView;
        this.mExerciseDescText = (HealthTextView) out.b(healthCardView, R.id.report_exercise_desc);
        HealthTextView healthTextView = (HealthTextView) out.b(this.mExerciseItemLayout, R.id.report_exercise_total_time);
        this.mExerciseTotalTimeTitleText = healthTextView;
        healthTextView.setText(this.mResource.getString(R.string.IDS_report_exercise_total_time));
        this.mExerciseTotalTimeValueText = (HealthTextView) out.b(this.mExerciseItemLayout, R.id.report_exercise_total_time_value);
        this.mExerciseComparedTimeValueText = (HealthTextView) out.b(this.mExerciseItemLayout, R.id.report_compared_exercise_total_value);
        this.mExerciseTimeImage = (ImageView) out.b(this.mExerciseItemLayout, R.id.exercise_time_image);
        this.mExerciseHeatImage = (ImageView) out.b(this.mExerciseItemLayout, R.id.exercise_heat_image);
        HealthTextView healthTextView2 = (HealthTextView) out.b(this.mExerciseItemLayout, R.id.report_calorie_total_title);
        this.mExerciseTotalCaloriesTitleText = healthTextView2;
        healthTextView2.setText(getExerciseCaloriesTitleText());
        this.mExerciseTotalCaloriesValueText = (HealthTextView) out.b(this.mExerciseItemLayout, R.id.report_calorie_total_value);
        this.mExerciseComparedCaloriesDescText = (HealthTextView) out.b(this.mExerciseItemLayout, R.id.compared_last_calories);
        HealthTextView healthTextView3 = (HealthTextView) out.b(this.mExerciseItemLayout, R.id.report_avg_calorie_total);
        this.mExerciseAvgCaloriesTitleText = healthTextView3;
        healthTextView3.setText(getExerciseAvgCaloriesTitle());
        this.mExerciseAvgCaloriesValueText = (HealthTextView) out.b(this.mExerciseItemLayout, R.id.report_avg_calorie_total_value);
    }

    private void initStepView() {
        HealthCardView healthCardView = (HealthCardView) out.d(this, R.id.step_item_layout);
        this.mStepItemLayout = healthCardView;
        this.mReportStepDescText = (HealthTextView) out.b(healthCardView, R.id.report_step_desc);
        this.mReportAvgDailyStepTitleText = (HealthTextView) out.b(this.mStepItemLayout, R.id.report_avg_daily_steps_title);
        this.mReportAvgDailyStepText = (HealthTextView) out.b(this.mStepItemLayout, R.id.report_avg_daily_steps);
        this.mReportComparedStepTitleText = (HealthTextView) out.b(this.mStepItemLayout, R.id.report_compared_last_title);
        this.mReportComparedStepText = (HealthTextView) out.b(this.mStepItemLayout, R.id.report_compared_last_steps);
        this.mReportStepGoalText = (HealthTextView) out.b(this.mStepItemLayout, R.id.report_step_goal);
        this.mReportStepBarChart = (HwHealthReportBarChart) out.b(this.mStepItemLayout, R.id.bar_chart_report_step);
        this.mComplianceDaysValueText = (HealthTextView) out.b(this.mStepItemLayout, R.id.report_step_compliance_days);
        this.mComplianceDaysImageView = (ImageView) out.b(this.mStepItemLayout, R.id.report_step_compliance_days_icon);
        this.mComplianceDaysDescText = (HealthTextView) out.b(this.mStepItemLayout, R.id.report_step_compliance_days_desc);
        this.mReportAvgDailyStepTitleText.setText(getAvgDailyStepTitleText());
        this.mReportComparedStepTitleText.setText(getComparedStepTitleText());
    }

    private void initBreakInfoView(int i) {
        if (this.mBreakInfoItemLayout == null) {
            if (i == 8) {
                return;
            }
            ViewStub viewStub = (ViewStub) findViewById(R.id.break_info_item_layout);
            if (viewStub == null) {
                LogUtil.a(TAG, "initBreakInfoView ViewStub is loaded fail.");
                return;
            }
            HealthCardView healthCardView = (HealthCardView) viewStub.inflate();
            this.mBreakInfoItemLayout = healthCardView;
            this.mBreakInfoDescText = (HealthTextView) out.b(healthCardView, R.id.report_break_info_desc);
            this.mBreakInfoRecyclerView = (HealthRecycleView) out.b(this.mBreakInfoItemLayout, R.id.break_info_view);
            setBreakInfoBg((ImageView) out.b(this.mBreakInfoItemLayout, R.id.report_break_info_background));
        }
        this.mBreakInfoItemLayout.setVisibility(i);
    }

    protected void initMedalView(int i) {
        if (this.mMedalItemLayout == null) {
            if (i == 8) {
                return;
            }
            ViewStub viewStub = (ViewStub) findViewById(R.id.medal_item_layout);
            if (viewStub == null) {
                LogUtil.a(TAG, "initMedalView ViewStub is loaded fail.");
                return;
            }
            HealthCardView healthCardView = (HealthCardView) viewStub.inflate();
            this.mMedalItemLayout = healthCardView;
            this.mMedalItemBackground = (ImageView) out.b(healthCardView, R.id.medal_item_background);
            this.mMedalDescTextView = (HealthTextView) out.b(this.mMedalItemLayout, R.id.report_medal_desc);
            this.mMedalNumbersTextView = (HealthTextView) out.b(this.mMedalItemLayout, R.id.report_medal_numbers);
            this.mMedalRecyclerView = (HealthRecycleView) out.b(this.mMedalItemLayout, R.id.report_medal_recycler_view);
            this.mMedalRecyclerView.setLayoutManager(new GridLayoutManager(this.mContext, 3));
            this.mMedalRecyclerView.b(false);
            this.mMedalRecyclerView.e(false);
        }
        this.mMedalItemLayout.setVisibility(i);
    }

    private void initPersonalView() {
        this.mReportHeadRootLayout = (RelativeLayout) out.d(this, R.id.report_head_root_layout);
        this.mReportHeadRootBackground = (ImageView) out.d(this, R.id.report_head_root_background);
        this.mReportUserView = out.d(this, R.id.report_user_view);
        setReportHeadLayout(getMarginStartAndEnd());
        this.mPersonalHeaderIcon = (ImageView) out.d(this, R.id.report_personal_header_icon);
        this.mUsernameText = (HealthTextView) out.d(this, R.id.report_username);
        this.mReportIntervalDateText = (HealthTextView) out.d(this, R.id.report_period_date);
        this.mReportIntervalDateNoText = (HealthTextView) out.d(this, R.id.report_period_date_no);
        BaseActivity.setViewSafeRegion(true, this.mPersonalHeaderIcon);
        this.mReportCardLayout = (LinearLayout) out.d(this, R.id.report_data);
        setReportCardLayout();
        this.mWalkingMan = (ImageView) out.d(this, R.id.walking_man);
        if (LanguageUtil.ba(this)) {
            this.mWalkingMan.setImageDrawable(qqz.e(this, R.drawable.report_walking_man));
        } else {
            this.mWalkingMan.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.report_walking_man));
        }
    }

    private void setReportCardLayout() {
        LinearLayout linearLayout = this.mReportCardLayout;
        if (linearLayout == null) {
            LogUtil.j(TAG, "setReportCardLayout() mReportCardLayout is null.");
            return;
        }
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        int iC = 0;
        if (qrs.af(this.mContext)) {
            HealthColumnSystem healthColumnSystem = new HealthColumnSystem(this.mContext, 0);
            iC = (int) (healthColumnSystem.c() + healthColumnSystem.f() + healthColumnSystem.b());
        }
        if (layoutParams2 != null) {
            layoutParams2.leftMargin = iC;
            layoutParams2.rightMargin = iC;
            this.mReportCardLayout.setLayoutParams(layoutParams2);
        }
    }

    private void setReportHeadLayout(int i) {
        RelativeLayout relativeLayout = this.mReportHeadRootLayout;
        if (relativeLayout != null) {
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.setMarginStart(i);
                layoutParams2.setMarginEnd(i);
                this.mReportHeadRootLayout.setLayoutParams(layoutParams2);
            }
        }
        View view = this.mReportUserView;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            if (layoutParams3 instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                layoutParams4.setMarginStart(i);
                layoutParams4.setMarginEnd(i);
                this.mReportUserView.setLayoutParams(layoutParams4);
            }
        }
    }

    private int getMarginStartAndEnd() {
        if (!qrs.af(this.mContext)) {
            return 0;
        }
        HealthColumnSystem healthColumnSystem = new HealthColumnSystem(this.mContext, 0);
        return (int) (healthColumnSystem.c() + healthColumnSystem.f() + qqp.b(this.mContext));
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LogUtil.a(TAG, "onConfigurationChanged()");
        setReportHeadLayout(getMarginStartAndEnd());
        setReportCardLayout();
    }

    private void initCustomTitleBarView() {
        this.mNoReportLayout = (HealthTextView) out.d(this, R.id.empty_report_text);
        this.mShareView = (HealthNestedScrollView) out.d(this, R.id.report_scrollview);
        LinearLayout linearLayout = (LinearLayout) out.d(this, R.id.report_linear_layout);
        this.mContentLinearLayout = linearLayout;
        linearLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: pag
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                this.f45074a.m1649x4e856ea6(view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
        this.mShareLogoLayout = (LinearLayout) out.d(this, R.id.share_logo_layout);
        this.mVipImage = (ImageView) out.d(this, R.id.vip_image);
        this.mShareLogoLayout.setVisibility(8);
        this.mVipImage.setVisibility(8);
        CustomTitleBar customTitleBar = (CustomTitleBar) out.d(this, R.id.txt_report_title);
        this.mCustomTitleBar = customTitleBar;
        customTitleBar.setTitleText(getCustomTitleBarText());
        this.mCustomTitleBar.setRightSoftkeyVisibility(8);
        if (LanguageUtil.ba(this.mContext)) {
            this.mCustomTitleBar.setRightSoftkeyBackground(qqz.e(this.mContext, R.drawable.ic_health_nav_share_black), qre.f(R.string.accessibility_share));
            this.mCustomTitleBar.setRightButtonDrawable(qqz.e(this.mContext, R.drawable.ic_historical_report_record), qre.f(R.string.IDS_plugin_achievement_kaka_task_type_title_record));
        } else {
            this.mCustomTitleBar.setRightSoftkeyBackground(BaseApplication.getContext().getResources().getDrawable(R.drawable.ic_health_nav_share_black), qre.f(R.string.accessibility_share));
            this.mCustomTitleBar.setRightButtonDrawable(BaseApplication.getContext().getResources().getDrawable(R.drawable.ic_historical_report_record), qre.f(R.string.IDS_plugin_achievement_kaka_task_type_title_record));
        }
        this.mCustomTitleBar.setRightSoftkeyOnClickListener(new View.OnClickListener() { // from class: pai
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f45077a.m1650x5f3b3b67(view);
            }
        });
        this.mCustomTitleBar.setRightButtonOnClickListener(new View.OnClickListener() { // from class: pae
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f45072c.m1651x6ff10828(view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$initCustomTitleBarView$1$com-huawei-pluginachievement-ui-report-BaseReportActivity, reason: not valid java name */
    public /* synthetic */ void m1649x4e856ea6(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.mIsShare) {
            this.mIsShare = false;
            share(true);
        }
    }

    /* JADX INFO: renamed from: lambda$initCustomTitleBarView$2$com-huawei-pluginachievement-ui-report-BaseReportActivity, reason: not valid java name */
    public /* synthetic */ void m1650x5f3b3b67(View view) {
        if (PermissionUtil.a()) {
            sharePage();
        } else {
            PermissionUtil.d(this.mContext, PermissionUtil.PermissionType.STORAGE, new CustomPermissionAction(this.mContext) { // from class: com.huawei.pluginachievement.ui.report.BaseReportActivity.9
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    BaseReportActivity.this.sharePage();
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$initCustomTitleBarView$3$com-huawei-pluginachievement-ui-report-BaseReportActivity, reason: not valid java name */
    public /* synthetic */ void m1651x6ff10828(View view) {
        if (qrs.r()) {
            LogUtil.a(TAG, "click too fast.");
        } else {
            startHistoricalActivityForResult();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sharePage() {
        if (!osb.c(BaseApplication.getContext())) {
            paw.a(this.mContext);
            return;
        }
        if (this.mShareView.getHeight() == 0) {
            LogUtil.a(TAG, "sharePage shareView height == 0");
            return;
        }
        this.mContentLinearLayout.setBackgroundResource(R.color.colorSubBackground);
        this.mShareLogoLayout.setVisibility(0);
        if (par.e()) {
            this.mVipImage.setVisibility(0);
        } else {
            this.mVipImage.setVisibility(8);
        }
        this.mIsShare = true;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.mContentLinearLayout.setBackgroundResource(R.color.common_transparent);
    }

    private void share(boolean z) {
        boolean zD = osb.d();
        if (z && zD) {
            this.mUsernameText.setText(osb.b());
            this.mUsernameText.post(new Runnable() { // from class: paf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f45073a.m1653x3db29f0d();
                }
            });
            return;
        }
        Bitmap bitmapE = ouo.e(this.mContentLinearLayout, zD ? this.mReportUserView : this.mReportIntervalDateNoText);
        this.mShareLogoLayout.setVisibility(8);
        this.mVipImage.setVisibility(8);
        UserInfomation userInfomation = this.mUserInfo;
        if (userInfomation != null) {
            this.mUsernameText.setText(userInfomation.getName());
        }
        if (bitmapE == null) {
            qpx.e(this.mContext, R.string.IDS_plugin_achievement_shared_fail);
            return;
        }
        lmf lmfVarD = lmf.d();
        HashMap map = new HashMap(2);
        if (oru.b()) {
            lmfVarD.c(this.mContext, getSuccessShareBiValue(), map, 0);
        }
        if ((ouo.d(bitmapE) / 1024) / 1024 >= 1) {
            osb.e(this.mContext, ouo.b(this.mContext, bitmapE, "all_medal_share.jpg"), getSuccessShareBiValue(), null);
        } else {
            osb.c(this.mContext, bitmapE, getSuccessShareBiValue(), null);
        }
        LogUtil.a(TAG, "sharePage end");
    }

    /* JADX INFO: renamed from: lambda$share$4$com-huawei-pluginachievement-ui-report-BaseReportActivity, reason: not valid java name */
    public /* synthetic */ void m1653x3db29f0d() {
        share(false);
    }

    @Override // com.huawei.pluginachievement.impl.AchieveObserver
    public void onDataChanged(int i, UserAchieveWrapper userAchieveWrapper) {
        Object objAcquireRecentWeekRecord;
        LogUtil.a(TAG, "onDataChanged->error:", Integer.valueOf(i));
        Message messageObtain = Message.obtain();
        messageObtain.what = 1006;
        messageObtain.arg1 = i;
        if (userAchieveWrapper != null) {
            LogUtil.a(TAG, "onDataChanged->resultCode:", userAchieveWrapper.getResultCode());
            if (i == 200) {
                int reportType = getReportType();
                int contentType = getContentType();
                if (reportType == 0 && contentType == userAchieveWrapper.getContentType()) {
                    objAcquireRecentWeekRecord = userAchieveWrapper.acquireRecentMonthRecord();
                } else if (reportType != 1 || contentType != userAchieveWrapper.getContentType()) {
                    return;
                } else {
                    objAcquireRecentWeekRecord = userAchieveWrapper.acquireRecentWeekRecord();
                }
            } else {
                objAcquireRecentWeekRecord = null;
            }
            messageObtain.arg2 = Integer.parseInt(userAchieveWrapper.getResultCode());
            messageObtain.obj = objAcquireRecentWeekRecord;
            this.mHandler.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    static class a implements AchieveCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long[] f22275b = new long[2];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<BaseReportActivity> f22276c;

        a(BaseReportActivity baseReportActivity, long j, long j2) {
            this.f22276c = new WeakReference<>(baseReportActivity);
            long[] jArr = this.f22275b;
            jArr[0] = j;
            jArr[1] = j2;
        }

        @Override // com.huawei.pluginachievement.impl.AchieveCallback
        public void onResponse(int i, Object obj) {
            BaseReportActivity baseReportActivity = this.f22276c.get();
            if (baseReportActivity != null) {
                if (i != 0) {
                    LogUtil.j(BaseReportActivity.TAG, "FetchCurrentCallback onResponse ret = ", Integer.valueOf(i));
                }
                Message messageObtainMessage = baseReportActivity.mHandler.obtainMessage();
                messageObtainMessage.what = 1007;
                if (obj != null && ((Boolean) obj).booleanValue()) {
                    messageObtainMessage.what = 1008;
                }
                messageObtainMessage.obj = this.f22275b;
                baseReportActivity.mHandler.sendMessage(messageObtainMessage);
                return;
            }
            LogUtil.a(BaseReportActivity.TAG, "reportActivity is null");
        }
    }

    private void getStepGoal() {
        qgm.c("900200006", new e(this.mContext));
    }

    /* JADX INFO: loaded from: classes13.dex */
    static class e implements IBaseResponseCallback {
        private WeakReference<Context> d;

        e(Context context) {
            this.d = new WeakReference<>(context);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            Context context = this.d.get();
            if ((context instanceof BaseReportActivity) && (obj instanceof Integer)) {
                ((BaseReportActivity) context).mStepTarget = ((Integer) obj).intValue();
            } else {
                LogUtil.j(BaseReportActivity.TAG, "fetchGoalInfo data is null");
            }
        }
    }
}
