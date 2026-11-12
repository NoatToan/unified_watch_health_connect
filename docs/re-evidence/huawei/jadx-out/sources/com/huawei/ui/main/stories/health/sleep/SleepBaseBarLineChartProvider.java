package com.huawei.ui.main.stories.health.sleep;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.TypefaceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.android.airsharing.api.IEventListener;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.knit.data.MajorProvider;
import com.huawei.health.knit.section.listener.BarChartRangeShowCallback;
import com.huawei.health.knit.section.listener.ChartMarkChangeCallback;
import com.huawei.health.knit.section.listener.ChartMarkTextCallback;
import com.huawei.health.knit.section.listener.ClickChartDataCallback;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.knit.section.model.SleepModuleBarChartHolder;
import com.huawei.health.sleep.sleepviewdata.SleepViewConstants;
import com.huawei.health.sport.utils.FitnessDataQueryDefine;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiTimeInterval;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataClientListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import com.huawei.ui.commonui.calendarview.HealthCalendar;
import com.huawei.ui.commonui.calendarview.HealthCalendarActivity;
import com.huawei.ui.commonui.calendarview.HealthDataMarkDateTrigger;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.view.HwHealthMarkerView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.utils.HarmonyOsTypefaceSpan;
import com.huawei.ui.commonui.utils.ScrollUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.coresleep.KnitSleepDetailActivity;
import com.huawei.ui.main.stories.fitness.activity.coresleep.SleepViewCallback;
import com.huawei.ui.main.stories.fitness.views.coresleep.CoreSleepBarChartView;
import com.huawei.ui.main.stories.fitness.views.coresleep.CoreSleepServiceView;
import com.huawei.ui.main.stories.health.views.FitnessDataOriginView;
import com.huawei.ui.main.stories.utils.FitnessUtils;
import defpackage.gxp;
import defpackage.gxq;
import defpackage.lsl;
import defpackage.ltb;
import defpackage.njy;
import defpackage.qnh;
import defpackage.ucv;
import defpackage.uif;
import defpackage.uik;
import defpackage.uzo;
import defpackage.vdo;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes43.dex */
public abstract class SleepBaseBarLineChartProvider extends MajorProvider<gxq> implements BarChartRangeShowCallback, ChartMarkChangeCallback, ChartMarkTextCallback, SleepViewCallback {
    private static final String BED_TIME_TEXT = "BED_TIME_TEXT";
    private static final String CHART_BOTTOM_LINE = "CHART_BOTTOM_LINE";
    private static final String CHART_CALENDAR_LISTENER = "CHART_CALENDAR_LISTENER";
    private static final String CHART_DATA_INFO = "CHART_DATA_INFO";
    private static final String CHART_REFLESH_TIME = "CHART_REFLESH_TIME";
    private static final String FITNESSCORE_SLEEP_DETAIL_INTERACTOR = "FITNESSCORE_SLEEP_DETAIL_INTERACTOR";
    private static final String HELP_ICON_IMAGE = "HELP_ICON_IMAGE";
    private static final String HELP_ICON_IMAGE_VISIBILITY = "HELP_ICON_IMAGE_VISIBILITY";
    private static final String HOUR_UNIT_VISIBILITY = "HOUR_UNIT_VISIBILITY";
    private static final String HOUR_VALUE_TEXT = "HOUR_VALUE_TEXT";
    private static final String HOUR_VALUE_VISIBILITY = "HOUR_VALUE_VISIBILITY";
    private static final String HW_CHINESE_MEDIUM = "HwChinese-medium";
    protected static final String IS_RESET_BAR_CHART = "IS_RESET_BAR_CHART";
    private static final String JUMP_TO_DAY_CLICK_EVENT = "JUMP_TO_DAY_CLICK_EVENT";
    private static final String LEFT_ARROW_CALL_BACK = "LEFT_ARROW_CALL_BACK";
    private static final Object LOCK = new Object();
    private static final String MARK_CHANGE_CALL_BACK = "MARK_CHANGE_CALL_BACK";
    private static final String MARK_TEXT_CALL_BACK = "MARK_TEXT_CALL_BACK";
    private static final String MEDIUM_ASSETS_PATH = "font/HarmonyOSCondensedClockProportional-Medium.ttf";
    public static final int MESSAGE_JUMP_TO_DAY_TAB = 6010;
    public static final int MILLISECONDS_IN_SECOND = 1000;
    public static final int MINS_IN_HOUR = 60;
    private static final String MINUTE_UNIT_TEXT = "MINUTE_UNIT_TEXT";
    private static final String MINUTE_VALUE_TEXT = "MINUTE_VALUE_TEXT";
    public static final int MSG_UPDATE_DATA_ORIGINAL_ICON = 6011;
    private static final int NOON_TO_NORMAL_TIME = 3;
    public static final int NO_DATA = 0;
    private static final String PROCESS_TEXT_VISIBILITY = "PROCESS_TEXT_VISIBILITY";
    private static final String RANGE_SHOW_CALL_BACK = "RANGE_SHOW_CALL_BACK";
    private static final String RELEASE_TAG = "R_Sleep_SleepBaseBarLineChartProvider";
    private static final String RIGHT_ARROW_CALL_BACK = "RIGHT_ARROW_CALL_BACK";
    public static final int SHOW_RECOMMEND_SERVICE_UI = 6008;
    private static final String SLEEP_TIME_TEXT = "SLEEP_TIME_TEXT";
    private static final String TAG = "SleepBaseBarLineChartProvider";
    private static final String TIME_LAYOUT_CLICKABLE = "TIME_LAYOUT_CLICKABLE";
    private static final int TIME_TYPE_HAS_DATA = 1;
    private static final int TIME_TYPE_NO_DATA = 0;
    public static final int UPDATE_BAR_CHART_DATA_UI = 6001;
    public static final int UPDATE_TOTAL_DATA_UI = 6002;
    protected static final String YEAR_JUMP_TO_MONTH_TIME = "YEAR_JUMP_TO_MONTH_TIME";
    private Date lastMarkDate;
    private Date lastReqDate;
    private String[] mBiTypeArray;
    private HealthCalendar mCalendar;
    private d mCalendarSelectCallback;
    private WeakReference<Context> mContextReference;
    private CustomViewDialog mCustomViewDialog;
    private List<Double> mDeepSleepValueList;
    private List<Double> mDreamSleepValueList;
    private Date mEndDay;
    private int mEndX;
    private FitnessDataOriginView mFitnessDataOriginView;
    protected HealthScrollView mHealthScrollView;
    private uik mInteractor;
    private boolean mIsLoadingState;
    protected long mLastTimestamp;
    private List<Double> mLightSleepValueList;
    private List<Double> mNoonSleepValueList;
    protected SectionBean mSectionBean;
    private Date mStartDay;
    private int mStartX;
    private Typeface mTypeface;
    protected View mView;
    private List<Double> mWakeSleepValueList;
    private Date nowMarkDate;
    protected WeakReference<Activity> sleepActivityWeakReference;
    protected gxq mSleepChartData = new gxq(SleepViewConstants.ViewTypeEnum.UNKNOWN);
    protected Map<String, Object> mUiDataMap = new HashMap();
    private int mTimeType = 0;
    private SleepModuleBarChartHolder mSleepHolder = null;
    private List<uif> mFitnessOriginListData = new ArrayList();
    private List<HiHealthClient> mClientList = new ArrayList();
    private gxq mSleepReportData = new gxq(SleepViewConstants.ViewTypeEnum.UNKNOWN);
    private String mRecommendId = "0";
    protected Handler mUpdateUiHandler = new b(this);
    private DataInfos mDataInfos = DataInfos.NoDataPlaceHolder;
    private Map<String, SleepViewConstants.SleepTypeEnum> mDateIntegerMap = new ConcurrentHashMap();
    private Map<String, Integer> mDateSleepVersionMap = new ConcurrentHashMap();

    protected abstract LinearLayout getConfiguredLayout();

    protected abstract int getCoreSleepType();

    protected abstract DataInfos getDataInfo();

    protected abstract int getLayoutId();

    protected abstract LinearLayout getMarketingLayout();

    protected abstract Date getNextEndDay();

    protected abstract Date getNextStartDay();

    protected abstract Date getPreviousEndDay();

    protected abstract Date getPreviousStartDay();

    protected abstract void initOtherView();

    protected abstract void requestData(boolean z);

    protected abstract void showCurrentDate();

    protected abstract void showLastSleepData(CoreSleepBarChartView coreSleepBarChartView);

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public /* bridge */ /* synthetic */ void parseParams(Context context, HashMap map, Object obj) {
        parseParams(context, (HashMap<String, Object>) map, (gxq) obj);
    }

    protected static class b extends BaseHandler<SleepBaseBarLineChartProvider> {
        b(SleepBaseBarLineChartProvider sleepBaseBarLineChartProvider) {
            super(sleepBaseBarLineChartProvider);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(SleepBaseBarLineChartProvider sleepBaseBarLineChartProvider, Message message) {
            if (sleepBaseBarLineChartProvider == null || message == null) {
                return;
            }
            ReleaseLogUtil.d(SleepBaseBarLineChartProvider.RELEASE_TAG, "Msg:", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 6001) {
                sleepBaseBarLineChartProvider.updateBarChartUi();
                sleepBaseBarLineChartProvider.mUpdateUiHandler.sendEmptyMessageDelayed(6002, 1L);
                return;
            }
            if (i == 6002) {
                sleepBaseBarLineChartProvider.updateDatasUi(null);
                return;
            }
            if (i == 6008) {
                sleepBaseBarLineChartProvider.mRecommendId = message.arg1 + "";
                return;
            }
            if (i != 6010) {
                if (i != 6011) {
                    return;
                }
                sleepBaseBarLineChartProvider.processMsgUpdateDataOriginal(message);
            } else if (message.obj instanceof String) {
                sleepBaseBarLineChartProvider.jumpToDetailDay((String) message.obj);
            }
        }
    }

    protected View initView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.mView == null) {
            this.mView = layoutInflater.inflate(getLayoutId(), viewGroup, false);
        }
        Bundle extra = getExtra();
        if (extra == null) {
            LogUtil.e(TAG, "getArguments is null ");
        } else {
            long j = extra.getLong("key_bundle_health_last_data_time", 0L);
            this.mLastTimestamp = j;
            LogUtil.a(TAG, "mLastTimestamp= ", Long.valueOf(j));
        }
        HealthScrollView healthScrollView = (HealthScrollView) this.mView.findViewById(R.id.core_sleep_year_scrollview);
        this.mHealthScrollView = healthScrollView;
        healthScrollView.setScrollViewVerticalDirectionEvent(true);
        Activity activity = this.sleepActivityWeakReference.get();
        if (activity != null) {
            ScrollUtil.a(this.mHealthScrollView, activity.getWindow().getDecorView(), IEventListener.EVENT_ID_DEVICE_DLNA_CONN_SUCC);
        }
        ((CoreSleepServiceView) this.mView.findViewById(R.id.core_sleep_service_view)).setSleepViewCallback(this);
        return this.mView;
    }

    static class a implements Observer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<SleepBaseBarLineChartProvider> f28051a;

        private a(SleepBaseBarLineChartProvider sleepBaseBarLineChartProvider) {
            this.f28051a = new WeakReference<>(sleepBaseBarLineChartProvider);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            SleepBaseBarLineChartProvider sleepBaseBarLineChartProvider = this.f28051a.get();
            if (sleepBaseBarLineChartProvider == null) {
                LogUtil.j(SleepBaseBarLineChartProvider.TAG, "InnerHiDataClientListener provider is null");
                return;
            }
            ReleaseLogUtil.d(SleepBaseBarLineChartProvider.RELEASE_TAG, "Devices got ", objArr[0]);
            if (objArr.length == 1 && njy.b(objArr[0], uif.class)) {
                Message messageObtain = Message.obtain();
                messageObtain.what = SleepBaseBarLineChartProvider.MSG_UPDATE_DATA_ORIGINAL_ICON;
                messageObtain.obj = (ArrayList) objArr[0];
                sleepBaseBarLineChartProvider.mUpdateUiHandler.sendMessage(messageObtain);
            }
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        ReleaseLogUtil.d(RELEASE_TAG, "Load data");
        this.mSectionBean = sectionBean;
        this.mContextReference = new WeakReference<>(context);
        initViews(context);
        initOtherView();
        this.mCalendarSelectCallback = new d(this);
        this.mUiDataMap.put(RANGE_SHOW_CALL_BACK, this);
        this.mUiDataMap.put(MARK_CHANGE_CALL_BACK, this);
        this.mUiDataMap.put(MARK_TEXT_CALL_BACK, this);
        initClickListener();
        initJumpToDay();
        initCalendar();
        ObserverManagerUtil.d(new c(this), "FINISH_SLEEP_TAG");
    }

    static class c implements Observer {
        private WeakReference<SleepBaseBarLineChartProvider> e;

        c(SleepBaseBarLineChartProvider sleepBaseBarLineChartProvider) {
            this.e = new WeakReference<>(sleepBaseBarLineChartProvider);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            SleepBaseBarLineChartProvider sleepBaseBarLineChartProvider = this.e.get();
            if (sleepBaseBarLineChartProvider != null && sleepBaseBarLineChartProvider.mUpdateUiHandler != null) {
                sleepBaseBarLineChartProvider.clearList(sleepBaseBarLineChartProvider.mLightSleepValueList);
                sleepBaseBarLineChartProvider.clearList(sleepBaseBarLineChartProvider.mDeepSleepValueList);
                sleepBaseBarLineChartProvider.clearList(sleepBaseBarLineChartProvider.mDreamSleepValueList);
                sleepBaseBarLineChartProvider.clearList(sleepBaseBarLineChartProvider.mNoonSleepValueList);
                sleepBaseBarLineChartProvider.clearList(sleepBaseBarLineChartProvider.mWakeSleepValueList);
                sleepBaseBarLineChartProvider.requestData(true);
                return;
            }
            ReleaseLogUtil.a(SleepBaseBarLineChartProvider.TAG, "provider is null");
        }
    }

    private void initClickListener() {
        this.mUiDataMap.put(LEFT_ARROW_CALL_BACK, new OnClickSectionListener() { // from class: com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider.3
            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, int i2) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, String str) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(String str) {
                SleepBaseBarLineChartProvider.this.processLeftClick();
            }
        });
        this.mUiDataMap.put(RIGHT_ARROW_CALL_BACK, new OnClickSectionListener() { // from class: com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider.5
            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, int i2) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, String str) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(String str) {
                SleepBaseBarLineChartProvider.this.processRightClick();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processLeftClick() {
        this.mUiDataMap.put(PROCESS_TEXT_VISIBILITY, 4);
        this.mStartDay = getPreviousStartDay();
        this.mEndDay = getPreviousEndDay();
        clearList(this.mLightSleepValueList);
        clearList(this.mDeepSleepValueList);
        clearList(this.mDreamSleepValueList);
        clearList(this.mNoonSleepValueList);
        clearList(this.mWakeSleepValueList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processRightClick() {
        this.mUiDataMap.put(PROCESS_TEXT_VISIBILITY, 4);
        this.mStartDay = getNextStartDay();
        this.mEndDay = getNextEndDay();
        clearList(this.mLightSleepValueList);
        clearList(this.mDeepSleepValueList);
        clearList(this.mDreamSleepValueList);
        clearList(this.mNoonSleepValueList);
        clearList(this.mWakeSleepValueList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearList(List<?> list) {
        if (list != null) {
            list.clear();
        }
    }

    private void initJumpToDay() {
        this.mUiDataMap.put(JUMP_TO_DAY_CLICK_EVENT, new ClickChartDataCallback() { // from class: com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider.1
            @Override // com.huawei.health.knit.section.listener.ClickChartDataCallback
            public void onTimeChanged(long j) {
                SleepBaseBarLineChartProvider.this.processJump(j);
            }
        });
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        DataInfos dataInfos;
        HashMap<String, Object> map = new HashMap<>();
        Bundle extra = getExtra();
        Serializable serializable = extra != null ? extra.getSerializable("key_bundle_health_line_chart_data_infos") : null;
        if (serializable instanceof DataInfos) {
            dataInfos = (DataInfos) serializable;
        } else {
            dataInfos = DataInfos.NoDataPlaceHolder;
        }
        this.mDataInfos = dataInfos;
        map.put("BAR_COMMON_START_TIME", dataInfos);
        Object obj = DataInfos.NoDataPlaceHolder;
        Bundle extra2 = getExtra();
        long jCurrentTimeMillis = 0;
        if (extra2 != null) {
            long j = extra2.getLong("key_bundle_health_last_data_time", 0L);
            jCurrentTimeMillis = j == 0 ? System.currentTimeMillis() : j;
            if (extra2.getSerializable("key_bundle_health_line_chart_data_infos") instanceof DataInfos) {
                obj = (DataInfos) extra2.getSerializable("key_bundle_health_line_chart_data_infos");
            }
        }
        map.put("BAR_COMMON_START_TIME", Long.valueOf(jCurrentTimeMillis));
        map.put("BAR_COMMON_DATA_INFO", obj);
        SleepModuleBarChartHolder sleepModuleBarChartHolder = new SleepModuleBarChartHolder(BaseApplication.getContext());
        this.mSleepHolder = sleepModuleBarChartHolder;
        map.put("BAR_COMMON_CHART_HOLDER", sleepModuleBarChartHolder);
        map.put("BAR_HOUR_UNIT_TEXT", BaseApplication.getContext().getResources().getString(R.string.IDS_hw_show_main_home_page_hours));
        initLegend(map);
        map.put("BAR_DALIY_STRING", BaseApplication.getContext().getResources().getString(R.string.IDS_hw_health_show_healthdata_weight_average));
        sectionBean.c(map);
        ObserverManagerUtil.d(new a(), "SLEEP_DEVICE_LIST" + getTag());
    }

    private void initLegend(HashMap<String, Object> map) {
        map.put("BAR_COMMON_LEGEND_ONE", Integer.valueOf(R.drawable.deep_sleep_round));
        map.put("BAR_COMMON_LEGEND_TWO", Integer.valueOf(R.drawable.light_sleep_round));
        map.put("BAR_COMMON_LEGEND_THREE", Integer.valueOf(R.drawable.rem_sleep_round));
        map.put("BAR_COMMON_LEGEND_FOUR", Integer.valueOf(R.drawable.wake_sleep_round));
        map.put("BAR_COMMON_LEGEND_FIVE", Integer.valueOf(R.drawable.true_sleep_noon_round));
        map.put("BAR_COMMON_LEGEND_SIX", Integer.valueOf(R.drawable.manual_bed_round));
        map.put("BAR_COMMON_LEGEND_SEVEN", Integer.valueOf(R.drawable.manual_sleep_round));
        map.put("BAR_COMMON_LEGEND_TEXT_ONE", BaseApplication.getContext().getResources().getString(R.string.IDS_hw_show_main_health_page_healthdata_sleep_deepsleep));
        map.put("BAR_COMMON_LEGEND_TEXT_TWO", BaseApplication.getContext().getResources().getString(R.string.IDS_hw_show_main_health_page_healthdata_sleep_shallowsleep));
        map.put("BAR_COMMON_LEGEND_TEXT_THREE", BaseApplication.getContext().getResources().getString(R.string.IDS_fitness_core_sleep_rem_sleep));
        map.put("BAR_COMMON_LEGEND_TEXT_FOUR", BaseApplication.getContext().getResources().getString(R.string.IDS_details_sleep_sleep_latency));
        map.put("BAR_COMMON_LEGEND_TEXT_FIVE", BaseApplication.getContext().getResources().getString(R.string.IDS_fitness_core_sleep_noontime_sleep));
        map.put("BAR_COMMON_LEGEND_TEXT_SIX", BaseApplication.getContext().getResources().getString(R.string.IDS_manual_sleep_bed));
        map.put("BAR_COMMON_LEGEND_TEXT_SEVEN", BaseApplication.getContext().getResources().getString(R.string.IDS_manual_sleep_sleep));
    }

    public void parseParams(Context context, HashMap<String, Object> map, gxq gxqVar) {
        this.sleepActivityWeakReference = new WeakReference<>(vdo.b(context));
        synchronized (LOCK) {
            dealTotalData(map, gxqVar);
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        ObserverManagerUtil.a("SLEEP_BASE_BAR_DREAM_VISIBILITY");
        ObserverManagerUtil.a("SLEEP_WEEK_MONTH_YEAR_AVERAGE_DAILY");
        ObserverManagerUtil.a("SLEEP_AVERAGE_ICON_OFFSET");
        ObserverManagerUtil.a("SLEEP_DEVICE_LIST" + getLogTag());
        ObserverManagerUtil.a("FINISH_SLEEP_TAG");
        this.mUiDataMap.clear();
    }

    protected String getTag() {
        return TAG;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:39:0x0099  */
    private void dealTotalData(HashMap<String, Object> map, gxq gxqVar) {
        if (gxqVar.m() instanceof HashMap) {
            Set<Map.Entry> setEntrySet = ((HashMap) gxqVar.m()).entrySet();
            map.put("SLEEP_CORE_VERSION", Integer.valueOf(this.mSleepReportData.k().ax()));
            for (Map.Entry entry : setEntrySet) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                str.hashCode();
                switch (str) {
                    case "CHART_REFLESH_TIME":
                        if (value instanceof Long) {
                            map.put("BAR_COMMON_REFLESH_TIME", value);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "MINUTE_VALUE_TEXT":
                        if (value instanceof String) {
                            map.put("BAR_MINUTE_VALUE_TEXT", value);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "CHART_DATA_INFO":
                        if (value instanceof DataInfos) {
                            map.put("BAR_COMMON_DATA_INFO", value);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "CHART_CALENDAR_LISTENER":
                        if (value instanceof OnClickSectionListener) {
                            map.put("BAR_COMMON_CALENDER_EVENT", value);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "MINUTE_UNIT_TEXT":
                        if (value instanceof String) {
                            map.put("BAR_MINUTE_UNIT_TEXT", value);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "SLEEP_TIME_TEXT":
                        if (value instanceof SpannableString) {
                            map.put("BAR_TIME_VALUE_TEXT", value);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "BED_TIME_TEXT":
                        if (value instanceof SpannableString) {
                            map.put("BAR_BED_TIME_VALUE_TEXT", value);
                            break;
                        } else {
                            break;
                        }
                        break;
                    default:
                        continueDeal1(map, value, str);
                        break;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    private void continueDeal1(HashMap<String, Object> map, Object obj, String str) {
        str.hashCode();
        switch (str) {
            case "MARK_CHANGE_CALL_BACK":
                if (obj instanceof ChartMarkChangeCallback) {
                    map.put("BAR_COMMON_MARK_CHANGE_CALL_BACK", obj);
                    break;
                }
                break;
            case "JUMP_TO_DAY_CLICK_EVENT":
                if (obj instanceof ClickChartDataCallback) {
                    map.put("BAR_CHART_MID_DATA_CLICK_EVENT", obj);
                    break;
                }
                break;
            case "HOUR_VALUE_VISIBILITY":
                if (obj instanceof Integer) {
                    map.put("BAR_HOUR_VALUE_VISIBILITY", obj);
                    break;
                }
                break;
            case "MARK_TEXT_CALL_BACK":
                if (obj instanceof ChartMarkTextCallback) {
                    map.put("BAR_COMMON_MARK_TEXT_CALL_BACK", obj);
                    break;
                }
                break;
            case "TIME_LAYOUT_CLICKABLE":
                if (obj instanceof Boolean) {
                    map.put("BAR_TIME_LAYOUT_CLICKABLE", obj);
                    break;
                }
                break;
            case "RANGE_SHOW_CALL_BACK":
                if (obj instanceof BarChartRangeShowCallback) {
                    map.put("BAR_COMMON_RANGE_SHOW_CALL_BACK", obj);
                    break;
                }
                break;
            case "HOUR_UNIT_VISIBILITY":
                if (obj instanceof Integer) {
                    map.put("BAR_HOUR_UNIT_VISIBILITY", obj);
                    break;
                }
                break;
            case "HOUR_VALUE_TEXT":
                if (obj instanceof String) {
                    map.put("BAR_HOUR_VALUE_TEXT", obj);
                    break;
                }
                break;
            default:
                continueDeal(map, obj, str);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    private void continueDeal(HashMap<String, Object> map, Object obj, String str) {
        str.hashCode();
        switch (str) {
            case "PROCESS_TEXT_VISIBILITY":
                if (obj instanceof Integer) {
                    map.put("BAR_COMMON_PROCESS_TEXT_VISIBILITY", obj);
                    break;
                }
                break;
            case "IS_RESET_BAR_CHART":
                if (obj instanceof Boolean) {
                    map.put("BAR_COMMON_RESET_BAR_CHART", obj);
                    break;
                }
                break;
            case "LEFT_ARROW_CALL_BACK":
                if (obj instanceof OnClickSectionListener) {
                    map.put("BAR_COMMON_LEFT_ARROW_LISTENER", obj);
                    break;
                }
                break;
            case "YEAR_JUMP_TO_MONTH_TIME":
                if (obj instanceof Integer) {
                    map.put("BAR_COMMON_JUMP_TO_MONTH_TIME", obj);
                    break;
                }
                break;
            case "HELP_ICON_IMAGE":
                if (obj instanceof Drawable) {
                    map.put("BAR_CHART_HELP_ICON", obj);
                    break;
                }
                break;
            case "RIGHT_ARROW_CALL_BACK":
                if (obj instanceof OnClickSectionListener) {
                    map.put("BAR_COMMON_RIGHT_ARROW_LISTENER", obj);
                    break;
                }
                break;
            case "CHART_BOTTOM_LINE":
                if (obj instanceof Boolean) {
                    map.put("BAR_COMMON_BOTTOM_LINE", obj);
                    break;
                }
                break;
            case "HELP_ICON_IMAGE_VISIBILITY":
                if (obj instanceof Integer) {
                    map.put("BAR_CHART_HELP_ICON_VISIBILITY", obj);
                    break;
                }
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jumpToDetailDay(String str) {
        ObserverManagerUtil.e(TAG, str);
        Activity activity = this.sleepActivityWeakReference.get();
        if (activity instanceof KnitSleepDetailActivity) {
            ((KnitSleepDetailActivity) activity).getViewPager().setCurrentItem(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateDatasUi(Map<String, Object> map) {
        health.compact.a.util.LogUtil.a(TAG, "updateDatasUi");
        uik uikVar = this.mInteractor;
        if (uikVar == null) {
            return;
        }
        gxq gxqVarG = uikVar.g();
        this.mSleepReportData = gxqVarG;
        gxqVarG.e(getStartDay().getTime());
        this.mDateIntegerMap = this.mInteractor.b();
        this.mDateSleepVersionMap = this.mInteractor.e();
        if (map != null) {
            this.mUiDataMap.put(FITNESSCORE_SLEEP_DETAIL_INTERACTOR, this.mInteractor);
            this.mSleepReportData.e(map);
        }
        notifyDateType();
    }

    private String getDataDifference() {
        gxq gxqVarC;
        if ((this.mSleepReportData.d() != SleepViewConstants.ViewTypeEnum.MONTH && this.mSleepReportData.d() != SleepViewConstants.ViewTypeEnum.WEEK) || (gxqVarC = this.mInteractor.c()) == null) {
            return "";
        }
        int i = AnonymousClass10.f28043a[this.mSleepReportData.n().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return "";
            }
            return ucv.a(gxqVarC.g().e(), gxqVarC.g().k(), gxqVarC.g().i(), this.mSleepReportData.g().e(), this.mSleepReportData.g().k(), this.mSleepReportData.g().i(), this.mSleepReportData.d() == SleepViewConstants.ViewTypeEnum.WEEK);
        }
        if (gxqVarC.h().i() == 0) {
            return ucv.e(this.mSleepReportData.d() == SleepViewConstants.ViewTypeEnum.WEEK);
        }
        return ucv.a(gxqVarC.h().e(), gxqVarC.h().k(), gxqVarC.h().i(), this.mSleepReportData.h().e(), this.mSleepReportData.h().k(), this.mSleepReportData.h().i(), this.mSleepReportData.d() == SleepViewConstants.ViewTypeEnum.WEEK);
    }

    private void getBiType() {
        if (this.mBiTypeArray == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, SleepViewConstants.SleepTypeEnum>> it = this.mDateIntegerMap.entrySet().iterator();
        while (it.hasNext()) {
            String typeString = getTypeString(it.next().getValue());
            if (typeString != "" && !arrayList.contains(typeString)) {
                arrayList.add(typeString);
            }
        }
        this.mBiTypeArray = (String[]) arrayList.toArray(new String[arrayList.size()]);
        if (this.mContextReference.get() instanceof KnitSleepDetailActivity) {
            int i = AnonymousClass10.f28044c[getDataInfo().ordinal()];
            if (i == 1) {
                ((KnitSleepDetailActivity) this.mContextReference.get()).a(this.mBiTypeArray);
            } else if (i == 2) {
                ((KnitSleepDetailActivity) this.mContextReference.get()).d(this.mBiTypeArray);
            } else {
                if (i != 3) {
                    return;
                }
                ((KnitSleepDetailActivity) this.mContextReference.get()).c(this.mBiTypeArray);
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider$10, reason: invalid class name */
    static /* synthetic */ class AnonymousClass10 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28043a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f28044c;

        static {
            int[] iArr = new int[DataInfos.values().length];
            f28044c = iArr;
            try {
                iArr[DataInfos.CoreSleepWeekDetail.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28044c[DataInfos.CoreSleepMonthDetail.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28044c[DataInfos.CoreSleepYearDetail.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[SleepViewConstants.SleepTypeEnum.values().length];
            f28043a = iArr2;
            try {
                iArr2[SleepViewConstants.SleepTypeEnum.MANUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28043a[SleepViewConstants.SleepTypeEnum.PHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28043a[SleepViewConstants.SleepTypeEnum.SCIENCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28043a[SleepViewConstants.SleepTypeEnum.COMMON.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private String getTypeString(SleepViewConstants.SleepTypeEnum sleepTypeEnum) {
        int i = AnonymousClass10.f28043a[sleepTypeEnum.ordinal()];
        if (i == 1) {
            return "manual";
        }
        if (i == 2) {
            return "phone";
        }
        if (i == 3) {
            return "scientific";
        }
        if (i == 4) {
            return "normal";
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateBarChartUi() {
        if (isDataValid(this.mInteractor)) {
            this.mUiDataMap.put(PROCESS_TEXT_VISIBILITY, 0);
            setSleepDataToCommonSleep(0, 0);
            this.mUiDataMap.put(CHART_BOTTOM_LINE, false);
        } else {
            this.mUiDataMap.put(PROCESS_TEXT_VISIBILITY, 4);
            this.mUiDataMap.put(CHART_BOTTOM_LINE, true);
            this.mSleepChartData.e(this.mUiDataMap);
            this.mSectionBean.c(this.mSleepChartData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void prossCalendarSelect(HealthCalendar healthCalendar) {
        health.compact.a.util.LogUtil.c("debugt", "prossCalendarSelect calendar is" + healthCalendar);
        this.mUiDataMap.put(CHART_REFLESH_TIME, Long.valueOf(healthCalendar.transformCalendar().getTimeInMillis()));
        this.mSleepReportData.e(this.mUiDataMap);
        this.mSectionBean.c(this.mSleepReportData);
    }

    private void initCalendar() {
        this.mUiDataMap.put(CHART_CALENDAR_LISTENER, new OnClickSectionListener() { // from class: com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider.4
            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, int i2) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, String str) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(String str) {
                if (str.equals("BAR_CHART_CALENDAR_CLICK_EVENT")) {
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("calendar", SleepBaseBarLineChartProvider.this.mCalendar);
                    bundle.putParcelable("markDateTrigger", new HealthDataMarkDateTrigger(new int[]{44105, 44004, 44108, 44109}));
                    Activity activity = SleepBaseBarLineChartProvider.this.sleepActivityWeakReference.get();
                    if (activity != null) {
                        HealthCalendarActivity.c(activity, bundle, SleepBaseBarLineChartProvider.this.mCalendarSelectCallback);
                        return;
                    }
                    return;
                }
                if (str.equals("BAR_COMMON_HELP_ICON_LISTENER")) {
                    SleepBaseBarLineChartProvider.this.showFitnessDataOriginDialog();
                }
            }
        });
        this.mSleepChartData.e(this.mUiDataMap);
        this.mSectionBean.c(this.mSleepChartData);
    }

    private void initViews(Context context) {
        this.mInteractor = new uik();
        this.mUiDataMap.put(CHART_DATA_INFO, getDataInfo());
        this.mIsLoadingState = false;
        showCurrentDate();
        this.mSleepChartData.e(this.mUiDataMap);
        this.mSectionBean.c(this.mSleepChartData);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0088  */
    /* JADX WARN: Code duplicated, block: B:28:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // com.huawei.health.knit.section.listener.BarChartRangeShowCallback
    public void onRangeChange(int i, int i2) {
        boolean z;
        long j = i;
        this.mStartDay = new Date(j * 60000);
        long j2 = i2;
        this.mEndDay = new Date((60000 * j2) - 1);
        Date date = new Date(TimeUnit.MINUTES.toMillis(j));
        if (this.lastReqDate == null) {
            health.compact.a.util.LogUtil.a(TAG, "first entry");
        } else {
            if (getDataInfo() == DataInfos.CoreSleepYearDetail) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTime(this.lastReqDate);
                if (calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2)) {
                    z = true;
                }
            } else {
                Calendar calendar3 = Calendar.getInstance();
                Calendar calendar4 = Calendar.getInstance();
                calendar3.setTime(date);
                calendar4.setTime(this.lastReqDate);
                if (calendar3.get(1) == calendar4.get(1) && calendar3.get(6) == calendar4.get(6)) {
                    z = true;
                }
            }
            if (date.getHours() == 0 && date.getMinutes() == 0 && date.getSeconds() == 0 && !z) {
                this.lastReqDate = getStartDay();
                ReleaseLogUtil.d(TAG, "Current day is ", getStartDay());
                requestData(true);
            }
            this.mStartX = i;
            this.mEndX = i2;
            if (lsl.c(TimeUnit.MINUTES.toMillis(j), TimeUnit.MINUTES.toMillis(j2))) {
                updateCalendar(i);
            }
        }
        z = false;
        if (date.getHours() == 0) {
            this.lastReqDate = getStartDay();
            ReleaseLogUtil.d(TAG, "Current day is ", getStartDay());
            requestData(true);
        }
        this.mStartX = i;
        this.mEndX = i2;
        if (lsl.c(TimeUnit.MINUTES.toMillis(j), TimeUnit.MINUTES.toMillis(j2))) {
            updateCalendar(i);
        }
    }

    @Override // com.huawei.health.knit.section.listener.ChartMarkChangeCallback
    public void onMarkChange(float f, float f2) {
        if (this.mTimeType == 1) {
            setSleepDataToCommonSleep((int) f, (int) f2);
        }
    }

    @Override // com.huawei.health.knit.section.listener.ChartMarkTextCallback
    public void onMarkTextChange(String str, List<HwHealthMarkerView.d> list, int i) {
        if (list != null) {
            if ("--".equals(this.mSleepHolder.d(list.get(list.size() - 1).f23737a))) {
                this.mTimeType = 0;
                setSleepDataToCommonSleep(0, 0);
            } else {
                this.mTimeType = 1;
            }
        } else {
            setSleepDataToCommonSleep(0, 0);
        }
        health.compact.a.util.LogUtil.a(TAG, "minute is " + i);
        updateCalendar(qnh.f(i));
        long millis = TimeUnit.MINUTES.toMillis((long) qnh.f(i));
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        this.nowMarkDate = calendar.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        if (this.lastMarkDate == null || !simpleDateFormat.format(this.nowMarkDate).equals(simpleDateFormat.format(this.lastMarkDate))) {
            health.compact.a.util.LogUtil.a(TAG, "real go " + this.nowMarkDate.toString());
            this.lastMarkDate = this.nowMarkDate;
            notifyDateType();
        }
    }

    protected void processJump(long j) {
        health.compact.a.util.LogUtil.a(TAG, "processJump");
        String strE = ltb.e(qnh.k(j));
        Message message = new Message();
        message.what = MESSAGE_JUMP_TO_DAY_TAB;
        message.obj = strE;
        this.mUpdateUiHandler.sendMessage(message);
    }

    protected boolean getIfVerify(long j) {
        return !new Date(j).after(new Date(System.currentTimeMillis())) || FitnessUtils.a(System.currentTimeMillis(), j);
    }

    private boolean isDataValid(uik uikVar) {
        this.mNoonSleepValueList = FitnessUtils.a(uikVar.j());
        this.mWakeSleepValueList = FitnessUtils.a(uikVar.k());
        return isSleepDataValid(uikVar) || this.mWakeSleepValueList == null || this.mNoonSleepValueList == null;
    }

    public Date getStartDay() {
        Date date = this.mStartDay;
        if (date == null) {
            return null;
        }
        return (Date) date.clone();
    }

    public void setStartDay(Date date) {
        this.mStartDay = date == null ? null : (Date) date.clone();
    }

    public void setLoadingState(boolean z) {
        this.mIsLoadingState = z;
    }

    public void setEndDay(Date date) {
        this.mEndDay = date == null ? null : (Date) date.clone();
    }

    public Date getEndDay() {
        Date date = this.mEndDay;
        if (date == null) {
            return null;
        }
        return (Date) date.clone();
    }

    public Handler getBaseHandler() {
        return this.mUpdateUiHandler;
    }

    public uik getInteractor() {
        return this.mInteractor;
    }

    private boolean isSleepDataValid(uik uikVar) {
        this.mLightSleepValueList = FitnessUtils.a(uikVar.i());
        this.mDeepSleepValueList = FitnessUtils.a(uikVar.d());
        List<Double> listA = FitnessUtils.a(uikVar.o());
        this.mDreamSleepValueList = listA;
        return this.mLightSleepValueList == null || this.mDeepSleepValueList == null || listA == null;
    }

    private void setSleepDataToCommonSleep(final int i, final int i2) {
        HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider.2
            @Override // java.lang.Runnable
            public void run() {
                SleepBaseBarLineChartProvider.this.setSleepMins(i);
                if (SleepBaseBarLineChartProvider.this.getDataInfo() == DataInfos.CoreSleepYearDetail) {
                    SleepBaseBarLineChartProvider.this.setBedMins(0);
                } else {
                    SleepBaseBarLineChartProvider.this.setBedMins(i2);
                }
                SleepBaseBarLineChartProvider.this.mSleepChartData.e(SleepBaseBarLineChartProvider.this.mUiDataMap);
                SleepBaseBarLineChartProvider.this.mSectionBean.c(SleepBaseBarLineChartProvider.this.mSleepChartData);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBedMins(int i) {
        SpannableString spannableString;
        if (i == 0) {
            this.mUiDataMap.put(BED_TIME_TEXT, "");
        }
        int i2 = i / 60;
        int i3 = i % 60;
        double d2 = i2;
        String strE = UnitUtil.e(d2, 1, 0);
        double d3 = i3;
        String strE2 = UnitUtil.e(d3, 1, 0);
        String quantityString = BaseApplication.getContext().getResources().getQuantityString(com.huawei.ui.commonui.R.plurals.IDS_min_unit, i3, UnitUtil.e(d3, 1, 0));
        if (i2 == 0) {
            spannableString = new SpannableString("");
            int iIndexOf = i3 != 0 ? "".indexOf(strE2) : -1;
            int length = i3 != 0 ? strE2.length() : 2;
            if (iIndexOf >= 0) {
                setTypefaceSpan(spannableString, iIndexOf, length);
                spannableString.setSpan(new AbsoluteSizeSpan(BaseApplication.getContext().getResources().getDimensionPixelSize(com.huawei.health.servicesui.R.dimen.health_common_30dp)), iIndexOf, length + iIndexOf, 17);
            }
        } else {
            String string = BaseApplication.getContext().getString(com.huawei.ui.commonui.R.string.IDS_two_parts, BaseApplication.getContext().getResources().getQuantityString(com.huawei.ui.commonui.R.plurals.IDS_hour_unit, i2, UnitUtil.e(d2, 1, 0)), quantityString);
            int iLastIndexOf = string.lastIndexOf(strE2);
            int iIndexOf2 = string.indexOf(strE);
            spannableString = new SpannableString(string);
            setSleepTextSpan(iLastIndexOf, iIndexOf2, spannableString, strE2, strE);
        }
        this.mUiDataMap.put(BED_TIME_TEXT, spannableString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSleepMins(int i) {
        SpannableString spannableString;
        int iIndexOf;
        this.mTypeface = Typeface.createFromAsset(BaseApplication.getContext().getAssets(), MEDIUM_ASSETS_PATH);
        int i2 = i / 60;
        int i3 = i % 60;
        double d2 = i2;
        String strE = UnitUtil.e(d2, 1, 0);
        double d3 = i3;
        String strE2 = UnitUtil.e(d3, 1, 0);
        String quantityString = BaseApplication.getContext().getResources().getQuantityString(com.huawei.ui.commonui.R.plurals.IDS_min_unit, i3, UnitUtil.e(d3, 1, 0));
        if (i2 != 0) {
            this.mUiDataMap.put(TIME_LAYOUT_CLICKABLE, true);
            String string = BaseApplication.getContext().getString(com.huawei.ui.commonui.R.string.IDS_two_parts, BaseApplication.getContext().getResources().getQuantityString(com.huawei.ui.commonui.R.plurals.IDS_hour_unit, i2, UnitUtil.e(d2, 1, 0)), quantityString);
            int iLastIndexOf = string.lastIndexOf(strE2);
            int iIndexOf2 = string.indexOf(strE);
            spannableString = new SpannableString(string);
            setSleepTextSpan(iLastIndexOf, iIndexOf2, spannableString, strE2, strE);
        } else {
            if (i3 != 0) {
                this.mUiDataMap.put(TIME_LAYOUT_CLICKABLE, true);
            } else {
                quantityString = quantityString.replace(strE2, "--");
                this.mUiDataMap.put(TIME_LAYOUT_CLICKABLE, false);
            }
            spannableString = new SpannableString(quantityString);
            if (i3 == 0) {
                iIndexOf = quantityString.indexOf("--");
            } else {
                iIndexOf = quantityString.indexOf(strE2);
            }
            int length = i3 != 0 ? strE2.length() : 2;
            if (iIndexOf >= 0) {
                setTypefaceSpan(spannableString, iIndexOf, length);
                spannableString.setSpan(new AbsoluteSizeSpan(BaseApplication.getContext().getResources().getDimensionPixelSize(com.huawei.health.servicesui.R.dimen.health_common_30dp)), iIndexOf, length + iIndexOf, 17);
            }
        }
        this.mUiDataMap.put(SLEEP_TIME_TEXT, spannableString);
    }

    private void setTypefaceSpan(SpannableString spannableString, int i, int i2) {
        if (this.mTypeface == null) {
            LogUtil.d(TAG, "custom typeface is null.,return");
        } else if (Build.VERSION.SDK_INT >= 28) {
            spannableString.setSpan(new HarmonyOsTypefaceSpan(this.mTypeface), i, i2 + i, 17);
        } else {
            spannableString.setSpan(new TypefaceSpan("HwChinese-medium"), i, i2 + i, 17);
        }
    }

    private void setSleepTextSpan(int i, int i2, SpannableString spannableString, String str, String str2) {
        if (i >= 0) {
            setTypefaceSpan(spannableString, i, str.length());
            spannableString.setSpan(new AbsoluteSizeSpan(BaseApplication.getContext().getResources().getDimensionPixelSize(com.huawei.health.servicesui.R.dimen.health_common_30dp)), i, str.length() + i, 17);
        }
        if (i2 >= 0) {
            setTypefaceSpan(spannableString, i2, str2.length());
            spannableString.setSpan(new AbsoluteSizeSpan(BaseApplication.getContext().getResources().getDimensionPixelSize(com.huawei.health.servicesui.R.dimen.health_common_30dp)), i2, str2.length() + i2, 17);
        }
    }

    private void updateCalendar(int i) {
        long millis = TimeUnit.MINUTES.toMillis(i);
        long jC = ltb.c(millis);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        health.compact.a.util.LogUtil.c("debugtime", "updateCalendar timeMills is " + millis);
        if (this.mCalendar == null) {
            this.mCalendar = new HealthCalendar();
        }
        this.mCalendar = this.mCalendar.transformFromCalendar(calendar);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(jC);
        this.nowMarkDate = calendar2.getTime();
    }

    private int getSleepVersion(String str, SleepViewConstants.SleepTypeEnum sleepTypeEnum) {
        int iIntValue = this.mDateSleepVersionMap.getOrDefault(str, 0).intValue();
        boolean zBooleanValue = this.mInteractor.a().getOrDefault(str, false).booleanValue();
        if (this.mSleepReportData.d() == SleepViewConstants.ViewTypeEnum.YEAR && (this.mSleepReportData.k() instanceof gxp)) {
            gxp gxpVar = (gxp) this.mSleepReportData.k();
            Map<String, String> mapH = this.mInteractor.h();
            String strD = DateFormatUtil.d(this.nowMarkDate.getTime(), DateFormatUtil.DateFormatType.DATE_FORMAT_YEAR_MONTH);
            int iIntValue2 = mapH.containsKey(strD) ? this.mDateSleepVersionMap.getOrDefault(mapH.get(strD), 0).intValue() : 0;
            int i = (iIntValue2 != 5 || gxpVar.bu() > 0) ? iIntValue2 : 0;
            if (i != 0 || gxpVar.bw() > 0) {
                return i;
            }
            return 5;
        }
        if (sleepTypeEnum == SleepViewConstants.SleepTypeEnum.SCIENCE && zBooleanValue && (this.mSleepReportData.k() instanceof gxp)) {
            gxp gxpVar2 = (gxp) this.mSleepReportData.k();
            if (this.mSleepReportData.n() != SleepViewConstants.SleepTypeEnum.SCIENCE && gxpVar2.bu() > 0) {
                return 5;
            }
            if (this.mSleepReportData.n() == SleepViewConstants.SleepTypeEnum.SCIENCE) {
                return gxpVar2.ax();
            }
            if (gxpVar2.bt() > 0) {
                return 0;
            }
        }
        return iIntValue;
    }

    private void notifyDateType() {
        health.compact.a.util.LogUtil.a(TAG, " notifyDateType dateIntegerMap is ", this.mDateIntegerMap.toString());
        if (CollectionUtils.c(this.mDateIntegerMap) || this.nowMarkDate == null) {
            health.compact.a.util.LogUtil.a(TAG, "mDateIntegerMap is null or nowMarkDate is null");
            notifyMinorProviders(null);
            return;
        }
        getBiType();
        ReleaseLogUtil.d(RELEASE_TAG, " dateIntegerMap size is ", Integer.valueOf(this.mDateIntegerMap.size()));
        String strD = DateFormatUtil.d(this.nowMarkDate.getTime(), DateFormatUtil.DateFormatType.DATE_FORMAT_YYYY_MM_DD);
        SleepViewConstants.SleepTypeEnum sleepTypeEnum = this.mDateIntegerMap.containsKey(strD) ? this.mDateIntegerMap.get(strD) : SleepViewConstants.SleepTypeEnum.UNKNOWN;
        if ((sleepTypeEnum != SleepViewConstants.SleepTypeEnum.UNKNOWN || this.mSleepReportData.d() == SleepViewConstants.ViewTypeEnum.YEAR) && sleepTypeEnum != null) {
            this.mSleepReportData.k().aa(getSleepVersion(strD, sleepTypeEnum));
            this.mSleepReportData.b(sleepTypeEnum);
            if (getDataInfo() == DataInfos.CoreSleepYearDetail) {
                this.mUiDataMap.put("wear_core_data", 0);
            }
            this.mUiDataMap.put(FITNESSCORE_SLEEP_DETAIL_INTERACTOR, this.mInteractor);
            this.mUiDataMap.put("DATA_DIFFERENCE", getDataDifference());
            this.mSleepReportData.e(this.mUiDataMap);
            notifyMinorProviders(this.mSleepReportData);
        }
    }

    protected void getNormalWearList(long j, FitnessDataQueryDefine.FitnessQueryId fitnessQueryId, List<HiHealthClient> list) {
        HiHealthManager.d(com.huawei.haf.application.BaseApplication.b()).fetchDataSourceByType(22000, new HiTimeInterval(j * 1000, (((((long) (FitnessDataQueryDefine.e(j, fitnessQueryId) * FitnessDataQueryDefine.c(fitnessQueryId))) * 60) + j) * 1000) - 1), new e(this, list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getDeviceList(List<HiHealthClient> list, List<HiHealthClient> list2) {
        ArrayList<uif> arrayListC = uzo.c(list, list2);
        Message messageObtain = Message.obtain();
        messageObtain.what = MSG_UPDATE_DATA_ORIGINAL_ICON;
        messageObtain.obj = arrayListC;
        this.mUpdateUiHandler.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processMsgUpdateDataOriginal(Message message) {
        if (!njy.b(message.obj, uif.class)) {
            health.compact.a.util.LogUtil.d(TAG, "msg.obj not instanceof List");
            this.mSleepChartData.e(this.mUiDataMap);
            this.mSectionBean.c(this.mSleepChartData);
            return;
        }
        this.mFitnessOriginListData.clear();
        this.mFitnessOriginListData.addAll((List) message.obj);
        health.compact.a.util.LogUtil.a(TAG, "mFitnessOriginListData is ", this.mFitnessOriginListData);
        if (njy.c(this.mFitnessOriginListData, 0)) {
            this.mUiDataMap.put(HELP_ICON_IMAGE, BaseApplication.getContext().getDrawable(R.drawable.ic_public_detail));
        }
        this.mUiDataMap.put(HELP_ICON_IMAGE_VISIBILITY, 0);
        updateDatasUi(this.mUiDataMap);
    }

    private void processMsgUpdateDevicePriority(Message message) {
        List<HiHealthClient> list = (List) message.obj;
        health.compact.a.util.LogUtil.a(TAG, "clientList = ", list.toString());
        this.mClientList = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showFitnessDataOriginDialog() {
        String string;
        health.compact.a.util.LogUtil.a(TAG, "showFitnessDataOriginDialog()");
        this.mUiDataMap.put(HELP_ICON_IMAGE, BaseApplication.getContext().getDrawable(R.drawable.ic_public_detail));
        this.mSleepChartData.e(this.mUiDataMap);
        this.mSectionBean.c(this.mSleepChartData);
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10006), "SLEEP_DEVICE_ICON_RED_DOT_KEY", "false", new StorageParams());
        CustomViewDialog customViewDialog = this.mCustomViewDialog;
        if (customViewDialog != null && customViewDialog.isShowing()) {
            this.mCustomViewDialog.dismiss();
            return;
        }
        Activity activity = this.sleepActivityWeakReference.get();
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(activity);
        FitnessDataOriginView fitnessDataOriginView = new FitnessDataOriginView((Context) activity, (Boolean) true);
        this.mFitnessDataOriginView = fitnessDataOriginView;
        fitnessDataOriginView.setIsSleepType();
        if (njy.e(this.mFitnessOriginListData, 1)) {
            string = BaseApplication.getContext().getString(R.string.IDS_sleep_data_source_info_average_instruction, 3);
        } else {
            string = BaseApplication.getContext().getString(R.string.IDS_sleep_data_source_info_week, 3);
        }
        this.mFitnessDataOriginView.setInfoText(string);
        this.mFitnessDataOriginView.setmListdata(this.mFitnessOriginListData);
        builder.a(BaseApplication.getContext().getString(R.string.IDS_sleep_data_source)).d((View) this.mFitnessDataOriginView).d(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                health.compact.a.util.LogUtil.a(SleepBaseBarLineChartProvider.TAG, "showFitnessDataOriginDialog() PositiveButton onClick.");
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        this.mCustomViewDialog = customViewDialogD;
        customViewDialogD.show();
    }

    static class d implements CommonUiBaseResponse {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<SleepBaseBarLineChartProvider> f28052c;

        d(SleepBaseBarLineChartProvider sleepBaseBarLineChartProvider) {
            this.f28052c = new WeakReference<>(sleepBaseBarLineChartProvider);
        }

        @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
        public void onResponse(int i, Object obj) {
            SleepBaseBarLineChartProvider sleepBaseBarLineChartProvider = this.f28052c.get();
            if (sleepBaseBarLineChartProvider != null && i == 1 && (obj instanceof HealthCalendar)) {
                sleepBaseBarLineChartProvider.prossCalendarSelect((HealthCalendar) obj);
            }
        }
    }

    static class e implements HiDataClientListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<SleepBaseBarLineChartProvider> f28053c;
        private List<HiHealthClient> e;

        e(SleepBaseBarLineChartProvider sleepBaseBarLineChartProvider, List<HiHealthClient> list) {
            this.f28053c = new WeakReference<>(sleepBaseBarLineChartProvider);
            this.e = list;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataClientListener
        public void onResult(List<HiHealthClient> list) {
            health.compact.a.util.LogUtil.a(SleepBaseBarLineChartProvider.TAG, "on result normallist");
            SleepBaseBarLineChartProvider sleepBaseBarLineChartProvider = this.f28053c.get();
            if (sleepBaseBarLineChartProvider == null) {
                return;
            }
            sleepBaseBarLineChartProvider.getDeviceList(this.e, list);
        }
    }
}
