package com.huawei.ui.main.stories.fitness.views.base.chart;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.utils.Utils;
import com.huawei.healthcloud.plugintrack.ui.view.linechart.HorizontalMarkerView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.calendarview.HealthCalendar;
import com.huawei.ui.commonui.calendarview.HealthCalendarActivity;
import com.huawei.ui.commonui.calendarview.MarkDateTrigger;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.anchor.Layout;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthMarkerView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.heartrate.HeartRateDetailActivity;
import com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity;
import defpackage.fts;
import defpackage.izn;
import defpackage.lrd;
import defpackage.njy;
import defpackage.qnh;
import defpackage.qre;
import defpackage.qrk;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes19.dex */
public abstract class JumpTableChart<ChartT extends HwHealthBaseScrollBarLineChart> extends LinearLayout {
    private static final float CURSOR_MARGIN_Y_AXIS_MARGIN = 32.0f;
    private static final float CURSOR_MARGIN_Y_AXIS_MARGIN_DAY = 50.0f;
    private static final String TAG = "JumpTableChart";
    private HealthCalendar mCalendar;
    private ChartT mChart;
    private LinearLayout mChartContainer;
    private RelativeLayout mFitnessDetailLayout;
    private ImageView mHorizontalJumpButton;
    private View mHorizontalJumpRect;
    private HorizontalMarkerView mHorizontalMarkerView;
    private ObserveredClassifiedView mHost;
    private boolean mIsShowMarkerTime;
    protected LinearLayout mMarkerTextViewPlaceHolder;
    private RelativeLayout mMarkerViewRootPlaceHolder;
    private ImageView mNewerSwitchBtn;
    private String mNoDataStr;
    private ImageView mOlderSwitchBtn;
    protected JumpableStyleMarkerTextView mSylableMarkerTextView;
    private HealthTextView mTimeArea;
    private String mTimeRange;
    protected HealthTextView mTimeTextView;
    private String mType;

    protected abstract ChartT constructChart();

    protected boolean isHorizontal() {
        return false;
    }

    public JumpTableChart(Context context) {
        super(context);
        this.mTimeTextView = null;
        this.mMarkerTextViewPlaceHolder = null;
        this.mSylableMarkerTextView = null;
        this.mTimeRange = "--";
        this.mFitnessDetailLayout = null;
        this.mIsShowMarkerTime = true;
        this.mType = "";
        init();
    }

    public JumpTableChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTimeTextView = null;
        this.mMarkerTextViewPlaceHolder = null;
        this.mSylableMarkerTextView = null;
        this.mTimeRange = "--";
        this.mFitnessDetailLayout = null;
        this.mIsShowMarkerTime = true;
        this.mType = "";
        init();
    }

    public JumpTableChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTimeTextView = null;
        this.mMarkerTextViewPlaceHolder = null;
        this.mSylableMarkerTextView = null;
        this.mTimeRange = "--";
        this.mFitnessDetailLayout = null;
        this.mIsShowMarkerTime = true;
        this.mType = "";
        init();
    }

    public JumpTableChart(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mTimeTextView = null;
        this.mMarkerTextViewPlaceHolder = null;
        this.mSylableMarkerTextView = null;
        this.mTimeRange = "--";
        this.mFitnessDetailLayout = null;
        this.mIsShowMarkerTime = true;
        this.mType = "";
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.jump_table_chart, this);
        this.mNoDataStr = izn.e(BaseApplication.getContext());
        if (this.mFitnessDetailLayout == null) {
            LogUtil.e(TAG, "mFitnessDetailLayout is null");
            this.mFitnessDetailLayout = (RelativeLayout) findViewById(R.id.fitness_detail_up_layout);
        }
        BaseActivity.setViewSafeRegion(false, this.mFitnessDetailLayout);
        this.mOlderSwitchBtn = (ImageView) findViewById(R.id.older_switch_btn);
        this.mNewerSwitchBtn = (ImageView) findViewById(R.id.newer_switch_btn);
        this.mTimeArea = (HealthTextView) findViewById(R.id.time_area);
        this.mChartContainer = (LinearLayout) findViewById(R.id.barlinechart_container);
        if (isHorizontal()) {
            this.mChartContainer.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        }
        this.mMarkerViewRootPlaceHolder = (RelativeLayout) findViewById(R.id.marker_view_root_place_holder);
        View viewFindViewById = findViewById(R.id.horizontal_jump_outer_rect);
        this.mHorizontalJumpRect = viewFindViewById;
        if (viewFindViewById.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mHorizontalJumpRect.getLayoutParams();
            layoutParams.width += qrs.d(BaseApplication.getContext(), ((Integer) BaseActivity.getSafeRegionWidth().first).intValue());
            this.mHorizontalJumpRect.setLayoutParams(layoutParams);
        }
        ImageView imageView = (ImageView) findViewById(R.id.horizontal_jump_btn);
        this.mHorizontalJumpButton = imageView;
        if (imageView.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.mHorizontalJumpButton.getLayoutParams();
            layoutParams2.setMarginEnd(layoutParams2.getMarginEnd() + ((Integer) BaseActivity.getSafeRegionWidth().first).intValue());
            this.mHorizontalJumpButton.setLayoutParams(layoutParams2);
        }
        disablingHardwareAcceleration();
        this.mTimeTextView = (HealthTextView) findViewById(R.id.detail_markview_time);
        this.mMarkerTextViewPlaceHolder = (LinearLayout) findViewById(R.id.marker_textview_place_holder);
        if (isHorizontal()) {
            this.mTimeTextView.setVisibility(8);
            HorizontalMarkerView horizontalMarkerView = new HorizontalMarkerView(getContext());
            this.mHorizontalMarkerView = horizontalMarkerView;
            this.mMarkerTextViewPlaceHolder.addView(horizontalMarkerView, -1, -2);
        } else {
            JumpableStyleMarkerTextView jumpableStyleMarkerTextView = new JumpableStyleMarkerTextView(getContext());
            this.mSylableMarkerTextView = jumpableStyleMarkerTextView;
            this.mMarkerTextViewPlaceHolder.addView(jumpableStyleMarkerTextView, -1, -2);
        }
        initSwitchButton();
        initRTLStatus();
        initLinkChart2Text();
        initMarkViewAreaLinker();
        initPagerNoMoreListener();
    }

    private void disablingHardwareAcceleration() {
        ChartT chartt = (ChartT) constructChart();
        this.mChart = chartt;
        chartt.setLayerType(1, null);
        this.mChart.registerExternalTopArea(this.mMarkerViewRootPlaceHolder);
        this.mChartContainer.addView(this.mChart, -1, -1);
    }

    private void initPagerNoMoreListener() {
        this.mChart.setPagerNoMoreListener(new HwHealthBaseScrollBarLineChart.PagerNoMoreListener() { // from class: com.huawei.ui.main.stories.fitness.views.base.chart.JumpTableChart.3
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.PagerNoMoreListener
            public void notifyNewerPager(boolean z) {
                JumpTableChart.this.refreshBtnImage();
            }

            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.PagerNoMoreListener
            public void notifyOlderPager(boolean z) {
                JumpTableChart.this.refreshBtnImage();
            }
        });
    }

    private void initMarkViewAreaLinker() {
        if (isHorizontal()) {
            this.mChart.setOnMarkViewTextNotify(new HwHealthMarkerView.OnMarkViewTextNotify() { // from class: com.huawei.ui.main.stories.fitness.views.base.chart.JumpTableChart.5
                @Override // com.huawei.ui.commonui.linechart.view.HwHealthMarkerView.OnMarkViewTextNotify
                public void onTextChanged(String str, List<HwHealthMarkerView.d> list) {
                    if (JumpTableChart.this.mHorizontalMarkerView == null) {
                        return;
                    }
                    JumpTableChart.this.updateCalendar(qnh.f((int) JumpTableChart.this.mChart.fetchMarkViewMinuteValue()));
                    if (!JumpTableChart.this.mIsShowMarkerTime) {
                        str = "";
                    }
                    if (njy.e(list)) {
                        JumpTableChart.this.mHorizontalMarkerView.a(str, JumpTableChart.this.mNoDataStr, JumpTableChart.this.mNoDataStr);
                    } else {
                        JumpTableChart.this.mHorizontalMarkerView.a(str, JumpTableChart.this.mHost.parse(list.get(list.size() - 1).f23737a), list.get(list.size() - 1).d);
                    }
                }
            });
        } else {
            setOnMarkViewTextNotify();
            this.mChart.setOnMarkViewGlobalPoint(new HwHealthMarkerView.OnMarkViewGlobalPoint() { // from class: com.huawei.ui.main.stories.fitness.views.base.chart.JumpTableChart.9
                @Override // com.huawei.ui.commonui.linechart.view.HwHealthMarkerView.OnMarkViewGlobalPoint
                public void onTextGlobalPoint() {
                    JumpTableChart.this.setGlobalPointValue();
                }
            });
        }
    }

    private void setOnMarkViewTextNotify() {
        this.mChart.setOnMarkViewTextNotify(new HwHealthMarkerView.OnMarkViewTextNotify() { // from class: com.huawei.ui.main.stories.fitness.views.base.chart.JumpTableChart.8
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthMarkerView.OnMarkViewTextNotify
            public void onTextChanged(String str, List<HwHealthMarkerView.d> list) {
                JumpTableChart.this.updateCalendar(qnh.f((int) JumpTableChart.this.mChart.fetchMarkViewMinuteValue()));
                JumpTableChart.this.mTimeTextView.setVisibility(JumpTableChart.this.mIsShowMarkerTime ? 0 : 4);
                if (JumpTableChart.this.mIsShowMarkerTime) {
                    JumpTableChart jumpTableChart = JumpTableChart.this;
                    jumpTableChart.setText(jumpTableChart.mTimeTextView, str);
                } else {
                    JumpTableChart jumpTableChart2 = JumpTableChart.this;
                    jumpTableChart2.setText(jumpTableChart2.mTimeTextView, "");
                }
                int color = ContextCompat.getColor(JumpTableChart.this.getContext(), R.color.textColorPrimary);
                if (njy.e(list)) {
                    String strE = izn.e(JumpTableChart.this.getContext());
                    JumpTableChart.this.mSylableMarkerTextView.setMarkerText(strE, strE);
                } else {
                    JumpTableChart.this.mSylableMarkerTextView.setMarkerText(JumpTableChart.this.mHost.parse(list.get(list.size() - 1).f23737a), list.get(list.size() - 1).d);
                }
                JumpTableChart.this.mSylableMarkerTextView.setHost(JumpTableChart.this.mHost);
                JumpTableChart.this.mSylableMarkerTextView.e(color);
                JumpTableChart.this.mSylableMarkerTextView.setTextJumpable(false);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGlobalPointValue() {
        String currentDayValueMinimum;
        String currentDayValueUnit;
        Context context = getContext();
        if (!(context instanceof HeartRateDetailActivity)) {
            LogUtil.a(TAG, "not heart rate, set global point");
            setText(this.mTimeTextView, getGlobalPointTime());
        }
        if (context instanceof BaseStepDetailActivity) {
            BaseStepDetailActivity baseStepDetailActivity = (BaseStepDetailActivity) context;
            currentDayValueMinimum = baseStepDetailActivity.getCurrentDayValueMinimum();
            currentDayValueUnit = baseStepDetailActivity.getCurrentDayValueUnit();
        } else {
            currentDayValueMinimum = null;
            currentDayValueUnit = null;
        }
        this.mSylableMarkerTextView.setMarkerText(currentDayValueMinimum, currentDayValueUnit);
    }

    private String getGlobalPointTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        return DateUtils.formatDateRange(getContext(), timeInMillis, calendar.getTimeInMillis(), 129);
    }

    public void setMarkerTimeShowFlag(boolean z) {
        this.mIsShowMarkerTime = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(HealthTextView healthTextView, String str) {
        if (TextUtils.equals(healthTextView.getText(), str)) {
            return;
        }
        healthTextView.setText(str);
    }

    public void setDataTextViewOnClickListener(View.OnClickListener onClickListener) {
        this.mSylableMarkerTextView.setContentOnClickListener(onClickListener);
    }

    private void initLinkChart2Text() {
        this.mChart.addOnXRangeSet(new HwHealthBaseScrollBarLineChart.OnXRangeSet() { // from class: com.huawei.ui.main.stories.fitness.views.base.chart.JumpTableChart.6
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.OnXRangeSet
            public void onRangeShow(int i, int i2) {
                JumpTableChart jumpTableChart = JumpTableChart.this;
                jumpTableChart.mTimeRange = jumpTableChart.mChart.formatRangeText(i, i2);
                String rangeText = JumpTableChart.this.mChart.formatRangeText(i, i2);
                JumpTableChart jumpTableChart2 = JumpTableChart.this;
                jumpTableChart2.setText(jumpTableChart2.mTimeArea, rangeText);
                if (qrk.b(TimeUnit.MINUTES.toMillis(i), TimeUnit.MINUTES.toMillis(i2))) {
                    JumpTableChart.this.updateCalendar(i);
                }
            }
        });
    }

    private void initSwitchButton() {
        this.mOlderSwitchBtn.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.views.base.chart.JumpTableChart.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                boolean zIsAnimating = JumpTableChart.this.mChart.isAnimating();
                fts.e(2, JumpTableChart.this.mType);
                LogUtil.d(JumpTableChart.TAG, "mChart.isAnimating:", Boolean.valueOf(zIsAnimating));
                if (zIsAnimating) {
                    return;
                }
                HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart = JumpTableChart.this.mChart;
                HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart2 = JumpTableChart.this.mChart;
                Objects.requireNonNull(hwHealthBaseScrollBarLineChart2);
                hwHealthBaseScrollBarLineChart.scrollOnePageOlder(new HwHealthBaseScrollBarLineChart.b(hwHealthBaseScrollBarLineChart2) { // from class: com.huawei.ui.main.stories.fitness.views.base.chart.JumpTableChart.7.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super();
                        Objects.requireNonNull(hwHealthBaseScrollBarLineChart2);
                    }

                    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.b
                    public void c() {
                        super.c();
                    }
                });
            }
        });
        this.mNewerSwitchBtn.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.views.base.chart.JumpTableChart.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                boolean zIsAnimating = JumpTableChart.this.mChart.isAnimating();
                fts.e(1, JumpTableChart.this.mType);
                LogUtil.d(JumpTableChart.TAG, "mChart.isAnimating:", Boolean.valueOf(zIsAnimating));
                if (zIsAnimating) {
                    return;
                }
                HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart = JumpTableChart.this.mChart;
                HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart2 = JumpTableChart.this.mChart;
                Objects.requireNonNull(hwHealthBaseScrollBarLineChart2);
                hwHealthBaseScrollBarLineChart.scrollOnePageNewer(new HwHealthBaseScrollBarLineChart.b(hwHealthBaseScrollBarLineChart2) { // from class: com.huawei.ui.main.stories.fitness.views.base.chart.JumpTableChart.10.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super();
                        Objects.requireNonNull(hwHealthBaseScrollBarLineChart2);
                    }

                    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.b
                    public void c() {
                        super.c();
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCalendar(int i) {
        long millis = TimeUnit.MINUTES.toMillis(i);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        if (this.mCalendar == null) {
            this.mCalendar = new HealthCalendar();
        }
        this.mCalendar = this.mCalendar.transformFromCalendar(calendar);
    }

    private void initRTLStatus() {
        if (LanguageUtil.ba(getContext())) {
            this.mOlderSwitchBtn.setImageResource(R.mipmap.ic_health_chart_arrow_right);
            this.mNewerSwitchBtn.setImageResource(R.mipmap.ic_health_chart_arrow_left);
        } else {
            this.mOlderSwitchBtn.setImageResource(R.mipmap.ic_health_chart_arrow_left);
            this.mNewerSwitchBtn.setImageResource(R.mipmap.ic_health_chart_arrow_right);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshBtnImage() {
        ChartT chartt = this.mChart;
        if (chartt == null) {
            ReleaseLogUtil.d(TAG, "refreshBtnImage mChart is null");
            return;
        }
        if (chartt.canScrollOlderPager()) {
            this.mOlderSwitchBtn.setVisibility(0);
        } else {
            this.mOlderSwitchBtn.setVisibility(4);
        }
        if (this.mChart.canScrollNewerPager()) {
            this.mNewerSwitchBtn.setVisibility(0);
        } else {
            this.mNewerSwitchBtn.setVisibility(4);
        }
    }

    public ChartT aquireChart() {
        return this.mChart;
    }

    public void setHost(ObserveredClassifiedView observeredClassifiedView) {
        this.mHost = observeredClassifiedView;
        this.mChart.setParseTool(observeredClassifiedView);
    }

    public Bitmap drawChart() {
        ChartT chartt = this.mChart;
        int width = chartt.getWidth();
        int height = chartt.getHeight();
        if (width > 0 && height > 0) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            chartt.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        }
        LogUtil.e(TAG, "width or height is 0");
        return null;
    }

    public String acquireTimeRangeText() {
        return this.mTimeRange;
    }

    private void setContentDescriptionForArrow(DataInfos dataInfos) {
        int i;
        int i2;
        if (dataInfos == null) {
            ReleaseLogUtil.d(TAG, "setContentDescriptionForArrow dataInfos is null");
            return;
        }
        if (dataInfos.isDayData()) {
            i = R.string.accessibility_last_day;
            i2 = R.string.accessibility_next_day;
        } else if (dataInfos.isWeekData()) {
            i = R.string.accessibility_last_week;
            i2 = R.string.accessibility_next_week;
        } else if (dataInfos.isMonthData()) {
            i = R.string.accessibility_last_month;
            i2 = R.string.accessibility_next_month;
        } else if (!dataInfos.isYearData()) {
            LogUtil.j(TAG, "setContentDescriptionForArrow dataInfos ", dataInfos);
            return;
        } else {
            i = R.string.accessibility_last_year;
            i2 = R.string.accessibility_next_year;
        }
        lrd.b(this.mOlderSwitchBtn, qre.i(i));
        lrd.b(this.mNewerSwitchBtn, qre.i(i2));
    }

    public void customByDataType(DataInfos dataInfos) {
        setContentDescriptionForArrow(dataInfos);
        Layout layoutAcquireLayout = this.mChart.acquireLayout();
        switch (AnonymousClass4.f27164b[dataInfos.ordinal()]) {
            case 1:
                this.mType = "calorie";
                this.mChart.setGlobalPoint(true, R.color.hw_show_set_step_progress_color);
                layoutAcquireLayout.b(Utils.convertDpToPixel(50.0f));
                break;
            case 2:
                this.mType = "climbs";
                this.mChart.setGlobalPoint(true, R.color.clover_mood);
                layoutAcquireLayout.b(Utils.convertDpToPixel(50.0f));
                break;
            case 3:
                this.mType = "MVPA";
                this.mChart.setGlobalPoint(true, R.color.fitness_detail_time_color_four_new);
                layoutAcquireLayout.b(Utils.convertDpToPixel(50.0f));
                break;
            case 4:
                this.mType = "distance";
                this.mChart.setGlobalPoint(true, R.color.indicate_standard_color);
                layoutAcquireLayout.b(Utils.convertDpToPixel(50.0f));
                break;
            case 5:
                this.mType = "walk";
                this.mChart.setGlobalPoint(true, R.color.sport_step_focus);
                layoutAcquireLayout.b(Utils.convertDpToPixel(50.0f));
                break;
            case 6:
            case 7:
            case 8:
                this.mType = "walk";
                break;
            case 9:
            case 10:
            case 11:
                this.mType = "distance";
                break;
            case 12:
            case 13:
            case 14:
                this.mType = "MVPA";
                break;
            case 15:
            case 16:
            case 17:
                this.mType = "calorie";
                break;
            case 18:
            case 19:
            case 20:
                this.mType = "climbs";
                break;
        }
        if (!dataInfos.isStepData() || dataInfos == DataInfos.StepDayDetail) {
            return;
        }
        float f = getContext().getResources().getDisplayMetrics().density;
        if (f != 0.0f) {
            layoutAcquireLayout.a(Utils.convertDpToPixel(getContext().getResources().getDimension(R.dimen.maxPaddingStart) / f) + ((Integer) BaseActivity.getSafeRegionWidth().first).intValue()).b(Utils.convertDpToPixel(CURSOR_MARGIN_Y_AXIS_MARGIN));
        }
        this.mChart.customLayout(layoutAcquireLayout);
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.fitness.views.base.chart.JumpTableChart$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f27164b;

        static {
            int[] iArr = new int[DataInfos.values().length];
            f27164b = iArr;
            try {
                iArr[DataInfos.CaloriesDayDetail.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27164b[DataInfos.ClimbDayDetail.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27164b[DataInfos.TimeStrengthDayDetail.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27164b[DataInfos.DistanceDayDetail.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27164b[DataInfos.StepDayDetail.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27164b[DataInfos.StepWeekDetail.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27164b[DataInfos.StepMonthDetail.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f27164b[DataInfos.StepYearDetail.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f27164b[DataInfos.DistanceWeekDetail.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f27164b[DataInfos.DistanceMonthDetail.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f27164b[DataInfos.DistanceYearDetail.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f27164b[DataInfos.TimeStrengthWeekDetail.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f27164b[DataInfos.TimeStrengthMonthDetail.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f27164b[DataInfos.TimeStrengthYearDetail.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f27164b[DataInfos.CaloriesWeekDetail.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f27164b[DataInfos.CaloriesMonthDetail.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f27164b[DataInfos.CaloriesYearDetail.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f27164b[DataInfos.ClimbWeekDetail.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f27164b[DataInfos.ClimbMonthDetail.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f27164b[DataInfos.ClimbYearDetail.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    public void setHorizontalOnClickListener(View.OnClickListener onClickListener) {
        View view = this.mHorizontalJumpRect;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    public void openHorizontalJump() {
        View view = this.mHorizontalJumpRect;
        if (view != null) {
            view.setVisibility(0);
        }
        ImageView imageView = this.mHorizontalJumpButton;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.ic_full_screen_image_new);
        }
    }

    public void initCalendarView(final Activity activity, final HealthCalendar healthCalendar) {
        Drawable drawable = getResources().getDrawable(R.drawable.ic_arrow_popup_down);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.mTimeArea.setCompoundDrawables(null, null, drawable, null);
        this.mTimeArea.setCompoundDrawablePadding(getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.time_area_drawable_padding));
        this.mTimeArea.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.views.base.chart.JumpTableChart.13
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (JumpTableChart.this.mCalendar == null) {
                    JumpTableChart.this.mCalendar = healthCalendar;
                }
                HealthCalendarActivity.a(activity, JumpTableChart.this.mCalendar);
            }
        });
    }

    public void initCalendarView(final Activity activity, final HealthCalendar healthCalendar, final MarkDateTrigger markDateTrigger, final boolean z) {
        Drawable drawable = getResources().getDrawable(R.drawable.ic_arrow_popup_down);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.mTimeArea.setCompoundDrawables(null, null, drawable, null);
        this.mTimeArea.setCompoundDrawablePadding(getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.time_area_drawable_padding));
        this.mTimeArea.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.views.base.chart.JumpTableChart.15
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (JumpTableChart.this.mCalendar == null) {
                    JumpTableChart.this.mCalendar = healthCalendar;
                }
                Bundle bundle = new Bundle();
                bundle.putSerializable("calendar", JumpTableChart.this.mCalendar);
                bundle.putBoolean("isSetGrayUnmarkedDate", z);
                bundle.putParcelable("markDateTrigger", markDateTrigger);
                HealthCalendarActivity.d(activity, bundle);
            }
        });
    }

    public void initLandscapeCalendarView(final Activity activity, final HealthCalendar healthCalendar) {
        Drawable drawable = getResources().getDrawable(R.drawable.ic_arrow_popup_down);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.mTimeArea.setCompoundDrawables(null, null, drawable, null);
        this.mTimeArea.setCompoundDrawablePadding(getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.time_area_drawable_padding));
        this.mTimeArea.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.views.base.chart.JumpTableChart.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (JumpTableChart.this.mCalendar == null) {
                    JumpTableChart.this.mCalendar = healthCalendar;
                }
                HealthCalendarActivity.d(activity, JumpTableChart.this.mCalendar);
            }
        });
    }

    public void initLandscapeCalendarView(final Activity activity, final HealthCalendar healthCalendar, final MarkDateTrigger markDateTrigger, final boolean z) {
        Drawable drawable = getResources().getDrawable(R.drawable.ic_arrow_popup_down);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.mTimeArea.setCompoundDrawables(null, null, drawable, null);
        this.mTimeArea.setCompoundDrawablePadding(getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.time_area_drawable_padding));
        this.mTimeArea.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.views.base.chart.JumpTableChart.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (JumpTableChart.this.mCalendar == null) {
                    JumpTableChart.this.mCalendar = healthCalendar;
                }
                Bundle bundle = new Bundle();
                bundle.putSerializable("calendar", JumpTableChart.this.mCalendar);
                bundle.putBoolean("isSetGrayUnmarkedDate", z);
                bundle.putParcelable("markDateTrigger", markDateTrigger);
                HealthCalendarActivity.c(activity, bundle);
            }
        });
    }

    public void onProcessCalendarSelect(HealthCalendar healthCalendar) {
        this.mCalendar = healthCalendar;
        this.mChart.reflesh(healthCalendar.transformCalendar().getTimeInMillis());
    }
}
