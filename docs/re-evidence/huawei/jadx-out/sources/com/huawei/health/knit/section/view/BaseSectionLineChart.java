package com.huawei.health.knit.section.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.knit.api.CombineChartRangeShowCallback;
import com.huawei.health.knit.section.listener.LineChartRangeShowCallback;
import com.huawei.health.knit.section.utils.CalendarChangeCallBack;
import com.huawei.health.knit.ui.KnitFragment;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.calendarview.HealthCalendar;
import com.huawei.ui.commonui.calendarview.HealthCalendarActivity;
import com.huawei.ui.commonui.calendarview.HealthDataMarkDateTrigger;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.icommon.IChartLayerHolder;
import com.huawei.ui.commonui.linechart.view.HwHealthMarkerView;
import com.huawei.ui.commonui.linechart.view.commonlinechart.HwHealthCommonLineChart;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import defpackage.foo;
import defpackage.ftw;
import defpackage.lsl;
import defpackage.njy;
import defpackage.qnh;
import defpackage.qqw;
import defpackage.qsp;
import health.compact.a.LanguageUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseSectionLineChart<ChartT extends HwHealthBaseScrollBarLineChart> extends BaseSection implements View.OnClickListener {
    private static final int AUTO_SIZE_MIN_TEXT_SIZE = 8;
    private static final int AUTO_SIZE_STEP_GRANULARITY = 1;
    private static final int CURSOR_INTERVAL_TIME = 5;
    private static final String FONT_PATH = "font/HarmonyOSCondensedClockProportional-Medium.ttf";
    private static final int MILLISECONDS = 1000;
    private static final int MINUTES = 60;
    protected static final String NO_VALUE_STR = "--";
    private static final String TAG = "BaseSectionLineChart";
    private static final int Y_SCROLL_MOVE_THRESHOLD = 80;
    protected LinearLayout dateLinearLayout;
    protected LinearLayout linearLayout;
    protected HealthCalendar mCalendar;
    private CalendarChangeCallBack mCalendarChangeCallBack;
    protected int mCardIndex;
    protected IChartLayerHolder mChartHolder;
    protected foo mChartPagerAdapter;
    protected LineChartRangeShowCallback mChartRangeShowCallback;
    protected ArrayList<View> mChartViewList;
    protected CombineChartRangeShowCallback mCombineChartRangeShowCallback;
    protected Context mContext;
    protected ChartT mCurrentChart;
    protected LinearLayout mCursorHavedataUnitLayout;
    protected HealthTextView mCursorNodataUnit;
    protected DataInfos mDataInfos;
    protected HealthTextView mFirstLayerDate;
    protected ImageView mHorizontalBtn;
    protected boolean mIsEnglish;
    protected ImageView mLeftArrow;
    private long mMarkerViewTime;
    protected ImageView mRightArrow;
    protected HealthTextView mSecondLayerDateTime;
    protected long mStartTimeStampMillis;
    protected HealthTextView mThirdLayerCursorText;
    protected List<Object> mThirdLayerCursorTextList;
    protected HealthTextView mThirdLayerCursorUnit;
    protected HealthTextView mThirdLayerCursorValue;
    protected View mThirdLayerUnitLayoutView;
    protected ViewStub mThirdLayerUnitLayoutViewStub;
    private HealthViewPager mViewPager;
    protected ViewStub mViewStub;
    protected View mainView;

    protected ChartT acquireCurrentChart(int i) {
        return null;
    }

    protected void bindExtraParamsToView(HashMap<String, Object> map) {
    }

    protected abstract DataInfos getJudgeDataInfos();

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected boolean isSupportSafeRegion() {
        return false;
    }

    public void onCardRangeShow(ChartT chartt, CombineChartRangeShowCallback combineChartRangeShowCallback, long j) {
    }

    protected abstract String parseEntry(HwHealthBaseEntry hwHealthBaseEntry);

    protected abstract void updateDateAndTime(String str, List<HwHealthMarkerView.d> list);

    public BaseSectionLineChart(Context context) {
        this(context, null);
    }

    public BaseSectionLineChart(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseSectionLineChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mStartTimeStampMillis = System.currentTimeMillis();
        this.mCardIndex = 0;
        this.mIsEnglish = false;
        initConstructor(context);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        LogUtil.a(TAG, "onCreateView");
        initSectionLineChart();
        return this.mainView;
    }

    protected void initSectionLineChart() {
        if (this.mainView == null) {
            LogUtil.j(TAG, "initView mainView is null, start to inflate");
            this.mainView = LayoutInflater.from(this.mContext).inflate(R.layout.section1_linechart_01_layout, (ViewGroup) this, false);
        }
        setThirdLayerUnitLayout(this.mainView);
        this.linearLayout = (LinearLayout) this.mainView.findViewById(R.id.section_line_ll);
        this.dateLinearLayout = (LinearLayout) this.mainView.findViewById(R.id.date_liearlayout);
        this.mLeftArrow = (ImageView) this.mainView.findViewById(R.id.left_arrow);
        this.mRightArrow = (ImageView) this.mainView.findViewById(R.id.right_arrow);
        this.mFirstLayerDate = (HealthTextView) this.mainView.findViewById(R.id.first_layer_date);
        this.mSecondLayerDateTime = (HealthTextView) this.mainView.findViewById(R.id.second_layer_date_time);
        this.mHorizontalBtn = (ImageView) this.mainView.findViewById(R.id.horizontal_btn);
        this.mThirdLayerCursorText = (HealthTextView) this.mainView.findViewById(R.id.third_layer_cursor_text);
        this.mThirdLayerCursorValue = (HealthTextView) this.mainView.findViewById(R.id.third_layer_cursor_value);
        this.mViewPager = (HealthViewPager) this.mainView.findViewById(R.id.section_view_pager);
        this.mLeftArrow.setOnClickListener(this);
        this.mRightArrow.setOnClickListener(this);
        this.mFirstLayerDate.setOnClickListener(this);
        this.mThirdLayerCursorText.setAutoTextInfo(8, 1, 2);
        this.mThirdLayerCursorValue.setTypeface(Typeface.createFromAsset(this.mContext.getAssets(), FONT_PATH));
        rtlLanguageAdjust();
    }

    private void rtlLanguageAdjust() {
        if (LanguageUtil.ba(this.mContext)) {
            this.mLeftArrow.setImageResource(R.drawable.common_right_arrow_click_selector);
            this.mRightArrow.setImageResource(R.drawable.common_left_arrow_click_selector);
        } else {
            this.mLeftArrow.setImageResource(R.drawable.common_left_arrow_click_selector);
            this.mRightArrow.setImageResource(R.drawable.common_right_arrow_click_selector);
        }
        if (LanguageUtil.br(getContext()) || LanguageUtil.z(getContext())) {
            this.mSecondLayerDateTime.setLayoutDirection(0);
        }
    }

    private void setThirdLayerUnitLayout(View view) {
        if (LanguageUtil.q(this.mContext)) {
            this.mIsEnglish = true;
            viewStubinflateThirdLayerUnitView(view, R.id.third_layer_unit_layout_other, R.id.third_layer_unit_layout_other_inflated);
        } else {
            this.mIsEnglish = false;
            viewStubinflateThirdLayerUnitView(view, R.id.third_layer_unit_layout, R.id.third_layer_unit_layout_inflated);
        }
        View view2 = this.mThirdLayerUnitLayoutView;
        if (view2 != null) {
            this.mThirdLayerCursorUnit = (HealthTextView) view2.findViewById(R.id.third_layer_cursor_unit);
            if (this.mIsEnglish) {
                this.mCursorHavedataUnitLayout = (LinearLayout) this.mThirdLayerUnitLayoutView.findViewById(R.id.cursor_havedata_unit_layout);
                this.mCursorNodataUnit = (HealthTextView) this.mThirdLayerUnitLayoutView.findViewById(R.id.cursor_nodata_unit);
            }
        }
    }

    private void viewStubinflateThirdLayerUnitView(View view, int i, int i2) {
        if (this.mThirdLayerUnitLayoutViewStub == null) {
            this.mThirdLayerUnitLayoutViewStub = (ViewStub) view.findViewById(i);
        }
        if (this.mThirdLayerUnitLayoutViewStub.getParent() != null) {
            this.mThirdLayerUnitLayoutView = this.mThirdLayerUnitLayoutViewStub.inflate();
        } else {
            this.mThirdLayerUnitLayoutView = view.findViewById(i2);
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a(TAG, "start to bindViewParams");
        if (map == null || map.size() == 0) {
            LogUtil.a(TAG, "no need to bind");
            return;
        }
        boolean zA = qqw.a(map, "FIRST_TIME_BIND", true);
        this.mStartTimeStampMillis = qqw.e((Map) map, "START_TIME", 0L);
        if (!zA) {
            refreshShowRange(this.mCurrentChart);
            return;
        }
        DataInfos dataInfos = (DataInfos) qqw.a(map, "DATA_INFO", (Class<DataInfos>) DataInfos.class, DataInfos.BloodPressureDayDetail);
        this.mDataInfos = dataInfos;
        if (dataInfos == DataInfos.BloodPressureDayDetail || this.mDataInfos == DataInfos.BloodPressureWeekDetail || this.mDataInfos == DataInfos.BloodPressureMonthDetail) {
            setMarginTopInvisible();
        }
        this.mStartTimeStampMillis = qqw.e((Map) map, "START_TIME", 0L);
        this.mThirdLayerCursorTextList = (List) qqw.a(map, "CURSOR_UP_AVERAGE_TEXT", (Class<Object>) List.class, (Object) null);
        qsp.b(this.mThirdLayerCursorUnit, (CharSequence) qqw.a(map, "CURSOR_UP_AVERAGE_UNIT", (Class<String>) String.class, ""));
        HealthTextView healthTextView = this.mCursorNodataUnit;
        if (healthTextView != null) {
            qsp.b(healthTextView, (CharSequence) qqw.a(map, "CURSOR_UP_AVERAGE_UNIT", (Class<String>) String.class, ""));
        }
        this.mChartHolder = (IChartLayerHolder) qqw.a(map, "HEALTH_CHART_HOLDER", (Class<Object>) HwHealthScrollChartHolder.class, (Object) null);
        this.mChartRangeShowCallback = (LineChartRangeShowCallback) qqw.a(map, "RANGE_SHOW_CALL_BACK", (Class<Object>) LineChartRangeShowCallback.class, (Object) null);
        this.mCombineChartRangeShowCallback = (CombineChartRangeShowCallback) qqw.a(map, "COMBINED_RANGE_SHOW_CALL_BACK", (Class<Object>) CombineChartRangeShowCallback.class, (Object) null);
        this.mCalendarChangeCallBack = (CalendarChangeCallBack) qqw.a(map, "CalendarChangeCallBack", (Class<Object>) CalendarChangeCallBack.class, (Object) null);
        this.mMarkerViewTime = qqw.e((Map) map, "key_marker_view_time", 0L);
        bindExtraParamsToView(map);
        if (this.mChartHolder == null) {
            LogUtil.a(TAG, "mChartHolder is null");
            return;
        }
        DataInfos dataInfos2 = this.mDataInfos;
        if (dataInfos2 == null || dataInfos2 == DataInfos.NoDataPlaceHolder) {
            LogUtil.a(TAG, "mDataInfos is invalid");
        } else {
            initChart(this.mCurrentChart, this.mCardIndex);
        }
    }

    private void setMarginTopInvisible() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.dateLinearLayout.getLayoutParams();
        layoutParams.setMargins(0, 0, 0, 0);
        this.dateLinearLayout.setLayoutParams(layoutParams);
    }

    protected void refreshShowRange(ChartT chartt) {
        if (chartt == null) {
            return;
        }
        HwHealthBaseScrollBarLineChart.ScrollAdapterInterface scrollAdapterInterfaceAcquireScrollAdapter = chartt.acquireScrollAdapter();
        if (scrollAdapterInterfaceAcquireScrollAdapter != null) {
            scrollAdapterInterfaceAcquireScrollAdapter.setFlag(scrollAdapterInterfaceAcquireScrollAdapter.getFlag() | 1);
        }
        chartt.setWillNotDraw(false);
        if (chartt instanceof HwHealthCommonLineChart) {
            if (this.mMarkerViewTime == 0) {
                ((HwHealthCommonLineChart) chartt).setMarkerViewPosition(null);
            } else {
                this.mCurrentChart.highlightValue(qnh.h((int) TimeUnit.MILLISECONDS.toMinutes(this.mMarkerViewTime)), false);
            }
        }
        refreshChart(chartt);
    }

    protected void refreshChart(ChartT chartt) {
        chartt.show(this.mStartTimeStampMillis);
        chartt.invalidate();
    }

    protected void initChart(ChartT chartt, int i) {
        if (chartt == null) {
            chartt = (ChartT) acquireCurrentChart(i);
            this.mCurrentChart = chartt;
        }
        if (chartt != null) {
            chartt.setLayerType(1, null);
            addDataLayer(this.mChartHolder, chartt, i);
            refreshShowRange(chartt);
            initPagerNoMoreListener(chartt);
            setChartRangeMarkViewNotify(chartt);
            attachChartToViewPager(chartt);
        }
        initLayer();
    }

    protected void setChartRangeMarkViewNotify(final ChartT chartt) {
        chartt.addOnXRangeSet(new HwHealthBaseScrollBarLineChart.OnXRangeSet() { // from class: com.huawei.health.knit.section.view.BaseSectionLineChart.3
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.OnXRangeSet
            public void onRangeShow(int i, int i2) {
                long millis = TimeUnit.MINUTES.toMillis(i);
                long millis2 = TimeUnit.MINUTES.toMillis(i2);
                if (lsl.c(millis, millis2)) {
                    BaseSectionLineChart.this.updateCalendar(i);
                }
                BaseSectionLineChart baseSectionLineChart = BaseSectionLineChart.this;
                baseSectionLineChart.onCardRangeShow(chartt, baseSectionLineChart.mCombineChartRangeShowCallback, (millis2 + millis) / 2);
                BaseSectionLineChart.this.notifyData(chartt, i, i2);
                if (BaseSectionLineChart.this.mChartRangeShowCallback != null) {
                    BaseSectionLineChart.this.mChartRangeShowCallback.onRangeChange(BaseSectionLineChart.this.getContext(), millis);
                }
            }
        });
        chartt.setOnMarkViewTextNotify(new HwHealthMarkerView.OnMarkViewTextNotify() { // from class: com.huawei.health.knit.section.view.BaseSectionLineChart.2
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthMarkerView.OnMarkViewTextNotify
            public void onTextChanged(String str, List<HwHealthMarkerView.d> list) {
                int iF = qnh.f((int) chartt.fetchMarkViewMinuteValue());
                if (BaseSectionLineChart.this.mDataInfos == DataInfos.BloodPressureDayDetail && ((int) chartt.fetchMarkViewMinuteValue()) == ((int) chartt.acquireShowRangeMaximum())) {
                    iF--;
                }
                long j = iF;
                ObserverManagerUtil.e("KnitHealthData_MarkView_" + BaseSectionLineChart.this.mDataInfos, Long.valueOf(TimeUnit.MINUTES.toMillis(j)));
                BaseSectionLineChart.this.updateCalendar(iF);
                BaseSectionLineChart.this.updateDateAndTime(str, list);
                String strD = ftw.d(TimeUnit.MINUTES.toMillis(j), 5);
                if (BaseSectionLineChart.this.mDataInfos == DataInfos.BloodPressureDayDetail) {
                    BaseSectionLineChart.this.notifyCursorDateAndTime(strD, list);
                }
            }
        });
    }

    protected void attachChartToViewPager(ChartT chartt) {
        if (this.mChartViewList == null) {
            this.mChartViewList = new ArrayList<>(16);
        }
        if (this.mChartPagerAdapter == null) {
            this.mChartPagerAdapter = new foo(this.mChartViewList, this.mContext);
        }
        this.mViewPager.setAdapter(this.mChartPagerAdapter);
        this.mViewPager.setIsCompatibleScrollView(true);
        this.mViewPager.setIsScroll(false);
        this.mViewPager.setYScrollMoveThreshold(80);
        this.mChartViewList.clear();
        this.mChartViewList.add(0, chartt);
        this.mChartPagerAdapter.notifyDataSetChanged();
    }

    protected void initLayer() {
        List<Object> list = this.mThirdLayerCursorTextList;
        if (list != null && list.size() > 1 && (this.mThirdLayerCursorTextList.get(1) instanceof String)) {
            this.mThirdLayerCursorText.setText(String.valueOf(this.mThirdLayerCursorTextList.get(1)));
        }
        this.mThirdLayerCursorText.setVisibility(0);
        this.mThirdLayerCursorValue.setText(NO_VALUE_STR);
        this.mThirdLayerCursorUnit.setVisibility(0);
    }

    public void notifyData(ChartT chartt, int i, int i2) {
        if (chartt == null) {
            return;
        }
        String rangeText = chartt.formatRangeText(i, i2);
        long j = ((long) i) * 60000;
        setDayAndWeek(rangeText, DateFormatUtil.d(j, DateFormatUtil.DateFormatType.DATE_FORMAT_WEEK), lsl.aa(j));
    }

    public void notifyCursorDateAndTime(String str, List<HwHealthMarkerView.d> list) {
        if (njy.b(list)) {
            notifyNumerical(str, list);
        } else {
            notifyNumerical(NO_VALUE_STR, null);
        }
    }

    private void initConstructor(Context context) {
        if (context == null) {
            LogUtil.j(TAG, "initConstructor context or dataType is null");
        } else {
            this.mContext = context;
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public void initView(KnitFragment knitFragment, int i) {
        super.initView(knitFragment, i);
        knitFragment.setOnActivityResultListener(new KnitFragment.OnActivityResultListener() { // from class: com.huawei.health.knit.section.view.BaseSectionLineChart.1
            @Override // com.huawei.health.knit.ui.KnitFragment.OnActivityResultListener
            public void onActivityResult(int i2, int i3, Intent intent) {
                if (i3 != -1 || intent == null) {
                    return;
                }
                Serializable serializableExtra = intent.getSerializableExtra("selectedDate");
                if (serializableExtra instanceof HealthCalendar) {
                    BaseSectionLineChart.this.mCalendar = (HealthCalendar) serializableExtra;
                    BaseSectionLineChart baseSectionLineChart = BaseSectionLineChart.this;
                    baseSectionLineChart.mStartTimeStampMillis = baseSectionLineChart.mCalendar.transformCalendar().getTimeInMillis();
                    BaseSectionLineChart.this.mCurrentChart.reflesh(BaseSectionLineChart.this.mStartTimeStampMillis);
                }
            }
        });
    }

    @Override // com.huawei.health.knit.section.view.BaseSection, android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.mLeftArrow) {
            initLeftArrowClick(this.mCurrentChart);
            return;
        }
        if (view == this.mRightArrow) {
            initRightArrowClick(this.mCurrentChart);
            return;
        }
        if (view.getId() == R.id.first_layer_date) {
            KnitFragment knitFragment = getKnitFragment();
            if (knitFragment != null) {
                Bundle bundle = new Bundle();
                bundle.putSerializable("calendar", this.mCalendar);
                bundle.putBoolean("isSetGrayUnmarkedDate", getIsSetUnmarkedGray(this.mDataInfos));
                bundle.putParcelable("markDateTrigger", new HealthDataMarkDateTrigger(getHiHealthDataTypes(this.mDataInfos)));
                HealthCalendarActivity.a(knitFragment, bundle);
                return;
            }
            return;
        }
        LogUtil.j(TAG, "click view unknow");
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        refreshShowRange(this.mCurrentChart);
    }

    protected void initLeftArrowClick(ChartT chartt) {
        LogUtil.d(TAG, "Day initLeftArrowClick");
        if (chartt == null || chartt.isAnimating()) {
            return;
        }
        clickLeftArrow(chartt);
    }

    protected void initRightArrowClick(ChartT chartt) {
        if (chartt == null || chartt.isAnimating()) {
            return;
        }
        clickRightArrow(chartt);
    }

    protected void updateCalendar(int i) {
        long millis = TimeUnit.MINUTES.toMillis(i);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        if (this.mCalendar == null) {
            this.mCalendar = new HealthCalendar();
        }
        CalendarChangeCallBack calendarChangeCallBack = this.mCalendarChangeCallBack;
        if (calendarChangeCallBack != null) {
            calendarChangeCallBack.onChange(millis);
        }
        this.mCalendar = this.mCalendar.transformFromCalendar(calendar);
    }

    protected void initPagerNoMoreListener(final ChartT chartt) {
        chartt.setPagerNoMoreListener(new HwHealthBaseScrollBarLineChart.PagerNoMoreListener() { // from class: com.huawei.health.knit.section.view.BaseSectionLineChart.5
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.PagerNoMoreListener
            public void notifyNewerPager(boolean z) {
                BaseSectionLineChart.this.refreshBtnImage(chartt);
            }

            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.PagerNoMoreListener
            public void notifyOlderPager(boolean z) {
                BaseSectionLineChart.this.refreshBtnImage(chartt);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshBtnImage(ChartT chartt) {
        if (chartt.canScrollOlderPager()) {
            this.mLeftArrow.setVisibility(0);
        } else {
            this.mLeftArrow.setVisibility(4);
        }
        if (chartt.canScrollNewerPager()) {
            this.mRightArrow.setVisibility(0);
        } else {
            this.mRightArrow.setVisibility(4);
        }
    }

    protected void clickLeftArrow(ChartT chartt) {
        Objects.requireNonNull(chartt);
        chartt.scrollOnePageOlder(new HwHealthBaseScrollBarLineChart.b(chartt) { // from class: com.huawei.health.knit.section.view.BaseSectionLineChart.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                Objects.requireNonNull(chartt);
            }

            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.b
            public void c() {
                super.c();
            }
        });
    }

    protected void clickRightArrow(ChartT chartt) {
        Objects.requireNonNull(chartt);
        chartt.scrollOnePageNewer(new HwHealthBaseScrollBarLineChart.b(chartt) { // from class: com.huawei.health.knit.section.view.BaseSectionLineChart.7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                Objects.requireNonNull(chartt);
            }

            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.b
            public void c() {
                super.c();
            }
        });
    }

    private void setDayAndWeek(String str, String str2, boolean z) {
        this.mFirstLayerDate.setText(str);
        if (this.mDataInfos != getJudgeDataInfos()) {
            return;
        }
        if (z) {
            this.mRightArrow.setVisibility(4);
        } else {
            this.mRightArrow.setVisibility(0);
        }
    }

    private void notifyNumerical(String str, List<HwHealthMarkerView.d> list) {
        HealthTextView healthTextView = this.mSecondLayerDateTime;
        if (healthTextView != null) {
            healthTextView.setText(str);
        } else {
            LogUtil.j(TAG, "notifyNumerical, mDateOrTime is null");
        }
        notifyView(list);
    }

    protected void notifyView(List<HwHealthMarkerView.d> list) {
        String entry;
        List<Object> list2;
        if (njy.e(list)) {
            LogUtil.j(TAG, "notifyView datas is empty");
            entry = NO_VALUE_STR;
        } else {
            entry = parseEntry(list.get(list.size() - 1).f23737a);
        }
        this.mThirdLayerCursorValue.setText(entry);
        if (!NO_VALUE_STR.equals(entry) || (list2 = this.mThirdLayerCursorTextList) == null || list2.size() <= 1 || !(this.mThirdLayerCursorTextList.get(1) instanceof String)) {
            return;
        }
        this.mThirdLayerCursorText.setText(String.valueOf(this.mThirdLayerCursorTextList.get(1)));
    }

    /* JADX INFO: renamed from: com.huawei.health.knit.section.view.BaseSectionLineChart$10, reason: invalid class name */
    static /* synthetic */ class AnonymousClass10 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7580a;

        static {
            int[] iArr = new int[DataInfos.values().length];
            f7580a = iArr;
            try {
                iArr[DataInfos.BloodPressureDayDetail.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7580a[DataInfos.BloodPressureWeekDetail.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7580a[DataInfos.BloodPressureMonthDetail.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private int[] getHiHealthDataTypes(DataInfos dataInfos) {
        int i = AnonymousClass10.f7580a[dataInfos.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return new int[]{2007, 2006};
        }
        return null;
    }

    private boolean getIsSetUnmarkedGray(DataInfos dataInfos) {
        return AnonymousClass10.f7580a[dataInfos.ordinal()] == 1;
    }

    protected void addDataLayer(IChartLayerHolder iChartLayerHolder, ChartT chartt, int i) {
        LogUtil.a(TAG, "addDataLayer mDataInfos ", this.mDataInfos);
        iChartLayerHolder.addDataLayer(chartt, this.mDataInfos);
    }
}
