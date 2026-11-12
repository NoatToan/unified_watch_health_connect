package com.huawei.ui.main.stories.health.views.healthdata.bloodsugarview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.chart.HealthRingChart;
import com.huawei.ui.commonui.chart.HealthRingChartAdapter;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.template.Constants;
import com.huawei.ui.main.stories.template.health.view.BaseNoDataView;
import defpackage.njy;
import defpackage.qjm;
import defpackage.qjp;
import defpackage.qnf;
import defpackage.qrs;
import defpackage.uma;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class BloodSugarDetectionDistributionView extends BaseNoDataView {
    private static final float DEFAULT_VALUE = 0.0f;
    private static final int PERCENT_MULTIPLIER = 100;
    private static final double REFERENCE_VALUE = 6.6d;
    private static final float SUB_HEADER_PADDING = 0.0f;
    private static final String TAG = "Main_BloodSugarDetectionDistributionView";
    private LinearLayout mAverageLayout;
    private HealthTextView mAverageType;
    private HealthTextView mBloodSugarAverageStatus;
    private LinearLayout mBloodSugarDetectionDistribution;
    private HealthDivider mBloodSugarHealthDivider;
    private HealthTextView mBloodSugarMax;
    private HealthTextView mBloodSugarMaxValue;
    private HealthTextView mBloodSugarMin;
    private HealthTextView mBloodSugarMinValue;
    private HealthRingChart mBloodSugarPieChartView;
    private ArrayList<Integer> mBloodSugarTimesList;
    private String mBloodSugarType;
    private HealthDivider mBottomDivider;
    private Context mContext;
    private HealthSubHeader mDetectionDistributionTitle;
    private HealthTextView mExportTable;
    private int mHighBloodSugarTimes;
    private int mLowBloodSugarTimes;
    private LinearLayout mMaxMinLayout;
    private ArrayList<uma> mModelList;
    private int mNormalBloodSugarTimes;
    private Constants.PageType mPageType;
    private HealthTextView mReferenceData;
    private Map<Long, IStorageModel> mResultMap;

    public BloodSugarDetectionDistributionView(Context context) {
        this(context, null);
    }

    public BloodSugarDetectionDistributionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BloodSugarDetectionDistributionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mLowBloodSugarTimes = 0;
        this.mHighBloodSugarTimes = 0;
        this.mNormalBloodSugarTimes = 0;
        this.mBloodSugarTimesList = new ArrayList<>(10);
        this.mModelList = new ArrayList<>(10);
        this.mContext = context;
    }

    @Override // com.huawei.ui.main.stories.template.health.view.BaseNoDataView, com.huawei.ui.main.stories.template.BaseComponent
    public void refreshView(boolean z) {
        super.refreshView(z);
        removeAllViews();
        if (qrs.af(this.mContext)) {
            LayoutInflater.from(this.mContext).inflate(R.layout.view_blood_sugar_detection_distribution_tahiti, this);
        } else {
            LayoutInflater.from(this.mContext).inflate(R.layout.view_blood_sugar_detection_distribution, this);
        }
        initView();
        initData(this.mBloodSugarType, this.mResultMap);
    }

    static class d implements Comparator<uma>, Serializable {
        private static final long serialVersionUID = -8204187395565030989L;

        private d() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(uma umaVar, uma umaVar2) {
            return Float.compare(umaVar2.e(), umaVar.e());
        }
    }

    private void initView() {
        HealthSubHeader healthSubHeader = (HealthSubHeader) findViewById(R.id.hw_hsh_detection_distribution_title);
        this.mDetectionDistributionTitle = healthSubHeader;
        healthSubHeader.setVisibility(0);
        this.mDetectionDistributionTitle.setPaddingStartEnd(0.0f, 0.0f);
        this.mDetectionDistributionTitle.setSubHeaderBackgroundColor(0);
        if (LanguageUtil.ao(this.mContext)) {
            this.mDetectionDistributionTitle.setSubHeaderTitleScaleTextSize(0.9f);
        }
        this.mBloodSugarMinValue = (HealthTextView) findViewById(R.id.tv_blood_sugar_min_value);
        this.mBloodSugarMaxValue = (HealthTextView) findViewById(R.id.tv_blood_sugar_max_value);
        this.mBloodSugarMin = (HealthTextView) findViewById(R.id.tv_blood_sugar_min);
        this.mBloodSugarMax = (HealthTextView) findViewById(R.id.tv_blood_sugar_max);
        this.mBloodSugarPieChartView = (HealthRingChart) findViewById(R.id.hw_blood_sugar_pie_chart);
        this.mBloodSugarDetectionDistribution = (LinearLayout) findViewById(R.id.ll_blood_sugar_detection_distribution);
        HealthDivider healthDivider = (HealthDivider) findViewById(R.id.hd_health_divider);
        this.mBloodSugarHealthDivider = healthDivider;
        healthDivider.setDividerBackground(R.color.emui_color_list_divider);
        this.mMaxMinLayout = (LinearLayout) findViewById(R.id.max_and_min_layout);
        this.mBottomDivider = (HealthDivider) findViewById(R.id.blood_health_divider);
        this.mExportTable = (HealthTextView) findViewById(R.id.blood_sugar_export_table);
        this.mAverageLayout = (LinearLayout) findViewById(R.id.blood_sugar_average_layout);
        this.mAverageType = (HealthTextView) findViewById(R.id.blood_sugar_average_type_title);
        this.mReferenceData = (HealthTextView) findViewById(R.id.blood_sugar_reference_data);
        this.mBloodSugarAverageStatus = (HealthTextView) findViewById(R.id.blood_sugar_average_state);
        this.mExportTable.setOnClickListener(new View.OnClickListener() { // from class: vfn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                uxd.d();
            }
        });
    }

    private void initData(String str, Map<Long, IStorageModel> map) {
        if (str == null || map == null || map.isEmpty()) {
            LogUtil.d(TAG, "bloodSugarType ==null or resultMap isEmpty");
            setBloodSugarDetectionDistributionVisibility(false);
            return;
        }
        setBloodSugarDetectionDistributionVisibility(true);
        showHeadTitle(str);
        parsingData(map);
        LogUtil.d(TAG, "initData type is  ", this.mPageType);
        if ("BLOOD_SUGAR_CONTINUE".equals(str)) {
            this.mBloodSugarHealthDivider.setVisibility(8);
            this.mMaxMinLayout.setVisibility(8);
            this.mAverageLayout.setVisibility(0);
            this.mBottomDivider.setVisibility(0);
            showBloodSugarAverageData();
        } else {
            this.mMaxMinLayout.setVisibility(0);
            if (qrs.af(this.mContext)) {
                this.mBloodSugarHealthDivider.setVisibility(8);
            } else {
                this.mBloodSugarHealthDivider.setVisibility(0);
            }
            this.mAverageLayout.setVisibility(8);
            this.mBottomDivider.setVisibility(8);
            showBloodSugarMaxValueAndMinValue();
        }
        showExportTable();
        showBloodSugarPieChart(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    private void showHeadTitle(String str) {
        TextView textView = (TextView) this.mDetectionDistributionTitle.findViewById(R.id.hwsubheader_title_left);
        if (textView != null) {
            textView.setAllCaps(true);
        }
        str.hashCode();
        switch (str) {
            case "BLOOD_SUGAR_NIGHT_BLOOD_GLUGLUCOSE":
                this.mDetectionDistributionTitle.setHeadTitleText(getResources().getString(R.string.IDS_bloodsugar_night));
                break;
            case "BLOOD_SUGAR_BEFORE_SLEEP_BlOOD_GLUCOSE":
                this.mDetectionDistributionTitle.setHeadTitleText(getResources().getString(R.string.IDS_bloodsugar_before_sleep));
                if (textView != null) {
                    textView.setAllCaps(false);
                    break;
                }
                break;
            case "BLOOD_SUGAR_BEFORE_MEAL":
                this.mDetectionDistributionTitle.setHeadTitleText(getResources().getString(R.string.IDS_bloodsugar_before_meal));
                break;
            case "BLOOD_SUGAR_AFTER_MEAL":
                this.mDetectionDistributionTitle.setHeadTitleText(getResources().getString(R.string.IDS_bloodsugar_after_meal));
                break;
            case "BLOOD_SUGAR_LIMOSIS":
                this.mDetectionDistributionTitle.setHeadTitleText(getResources().getString(R.string.IDS_bloodsugar_limosis));
                break;
            case "BLOOD_SUGAR_BEFORE_AFTER_MEAL_DIFFERENCE":
                setBloodSugarDetectionDistributionVisibility(false);
                break;
            case "BLOOD_SUGAR_CONTINUE":
                this.mDetectionDistributionTitle.setHeadTitleText(getResources().getString(R.string.IDS_bloodsugar_continue_glucose));
                break;
            case "BLOOD_SUGAR_FINGER_TIP":
                this.mDetectionDistributionTitle.setHeadTitleText(getResources().getString(R.string.IDS_bloodsugar_fingertip));
                if (textView != null) {
                    if (LanguageUtil.d(this.mContext) || LanguageUtil.q(this.mContext)) {
                        textView.setAllCaps(false);
                    }
                    break;
                }
                break;
            default:
                LogUtil.a(TAG, "not support type");
                break;
        }
    }

    private void parsingData(Map<Long, IStorageModel> map) {
        this.mLowBloodSugarTimes = 0;
        this.mHighBloodSugarTimes = 0;
        this.mNormalBloodSugarTimes = 0;
        if (njy.b(this.mModelList)) {
            this.mModelList.clear();
        }
        Iterator<Map.Entry<Long, IStorageModel>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            IStorageModel value = it.next().getValue();
            if (!(value instanceof uma)) {
                break;
            }
            this.mModelList.add((uma) value);
        }
        Iterator<uma> it2 = this.mModelList.iterator();
        while (it2.hasNext()) {
            notifySugarLevelTimes(it2.next());
        }
    }

    private void showBloodSugarPieChart(String str) {
        qjm qjmVarC;
        this.mBloodSugarTimesList.clear();
        this.mBloodSugarTimesList.add(Integer.valueOf(this.mLowBloodSugarTimes));
        this.mBloodSugarTimesList.add(Integer.valueOf(this.mHighBloodSugarTimes));
        this.mBloodSugarTimesList.add(Integer.valueOf(this.mNormalBloodSugarTimes));
        if (this.mBloodSugarPieChartView != null) {
            qjm qjmVar = new qjm();
            LogUtil.d(TAG, "showBloodSugarPieChart type ", str);
            if ("BLOOD_SUGAR_CONTINUE".equals(str)) {
                LogUtil.d(TAG, "showBloodSugarPieChart setShowValues false");
                qjmVarC = qjmVar.b(true).c(false);
            } else {
                qjmVarC = qjmVar.b(true).c(true);
            }
            LogUtil.a(TAG, "showBloodSugarPieChart config setShowValues ", Boolean.valueOf(qjmVarC.a()));
            HealthRingChartAdapter healthRingChartAdapter = new HealthRingChartAdapter(this.mContext, qjmVarC, getBloodSugarRingChartItems(this.mContext, this.mBloodSugarTimesList));
            healthRingChartAdapter.d(new HealthRingChartAdapter.DataFormatter() { // from class: vfi
                @Override // com.huawei.ui.commonui.chart.HealthRingChartAdapter.DataFormatter
                public final String format(qjp qjpVar) {
                    return this.f51029a.m1732x6e9dd95d(qjpVar);
                }
            });
            healthRingChartAdapter.c(new HealthRingChartAdapter.DataFormatter() { // from class: vfl
                @Override // com.huawei.ui.commonui.chart.HealthRingChartAdapter.DataFormatter
                public final String format(qjp qjpVar) {
                    return UnitUtil.e(qjpVar.b() * 100.0f, 2, 1);
                }
            });
            this.mBloodSugarPieChartView.setAdapter(healthRingChartAdapter);
            this.mBloodSugarPieChartView.b(this.mContext.getString(R.string.IDS_hw_pressure_ratio));
        }
    }

    /* JADX INFO: renamed from: lambda$showBloodSugarPieChart$1$com-huawei-ui-main-stories-health-views-healthdata-bloodsugarview-BloodSugarDetectionDistributionView, reason: not valid java name */
    public /* synthetic */ String m1732x6e9dd95d(qjp qjpVar) {
        int iF = (int) qjpVar.f();
        return this.mContext.getResources().getQuantityString(R.plurals.IDS_details_sleep_latency_times, iF, UnitUtil.e(iF, 1, 0));
    }

    private List<qjp> getBloodSugarRingChartItems(Context context, List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(context.getResources().getString(R.string.IDS_hw_show_healthdata_bloodsugar_status_overall_low));
        arrayList.add(context.getResources().getString(R.string.IDS_hw_show_healthdata_bloodsugar_status_overall_high));
        arrayList.add(context.getResources().getString(R.string.IDS_hw_show_healthdata_bloodsugar_status_overall_normal));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Integer.valueOf(ContextCompat.getColor(context, R.color.pie_sector_low_blood_sugar_color_begin)));
        arrayList2.add(Integer.valueOf(ContextCompat.getColor(context, R.color.pie_sector_high_blood_sugar_color_begin)));
        arrayList2.add(Integer.valueOf(ContextCompat.getColor(context, R.color.pie_sector_normal_blood_sugar_color_begin)));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(Integer.valueOf(ContextCompat.getColor(context, R.color.pie_sector_low_blood_sugar_color_end)));
        arrayList3.add(Integer.valueOf(ContextCompat.getColor(context, R.color.pie_sector_high_blood_sugar_color_end)));
        arrayList3.add(Integer.valueOf(ContextCompat.getColor(context, R.color.pie_sector_normal_blood_sugar_color_end)));
        int size = list != null ? list.size() : 0;
        ArrayList arrayList4 = new ArrayList(size);
        int i = 0;
        while (i < size) {
            arrayList4.add(new qjp(i < arrayList.size() ? (String) arrayList.get(i) : "", list.get(i).intValue(), i < arrayList3.size() ? ((Integer) arrayList3.get(i)).intValue() : 0, i < arrayList2.size() ? ((Integer) arrayList2.get(i)).intValue() : 0));
            i++;
        }
        return arrayList4;
    }

    private void setBloodSugarDetectionDistributionVisibility(boolean z) {
        LogUtil.a(TAG, "setBloodSugarDetectionDistributionVisibility");
        LinearLayout linearLayout = this.mBloodSugarDetectionDistribution;
        if (linearLayout != null) {
            if (z) {
                linearLayout.setVisibility(0);
                LogUtil.d(TAG, "mBloodSugarDetectionDistribution isVisible");
            } else {
                linearLayout.setVisibility(8);
                LogUtil.d(TAG, "mBloodSugarDetectionDistribution isGone");
            }
        }
    }

    public void setBloodSugarData(String str, Map<Long, IStorageModel> map) {
        this.mBloodSugarType = str;
        this.mResultMap = map;
        initData(str, map);
    }

    private void showBloodSugarMaxValueAndMinValue() {
        ArrayList<uma> arrayList = this.mModelList;
        if (arrayList != null && this.mBloodSugarMaxValue != null && this.mBloodSugarMinValue != null) {
            if (arrayList.size() > 1) {
                Collections.sort(this.mModelList, new d());
                setDigitalLocalization(this.mBloodSugarMaxValue, this.mModelList.get(0).e());
                HealthTextView healthTextView = this.mBloodSugarMinValue;
                ArrayList<uma> arrayList2 = this.mModelList;
                setDigitalLocalization(healthTextView, arrayList2.get(arrayList2.size() - 1).e());
            } else {
                setDigitalLocalization(this.mBloodSugarMaxValue, this.mModelList.get(0).e());
                setDigitalLocalization(this.mBloodSugarMinValue, this.mModelList.get(0).e());
            }
        }
        HealthTextView healthTextView2 = this.mBloodSugarMin;
        if (healthTextView2 != null) {
            healthTextView2.setText(R.string.IDS_hw_show_healthdata_bloodsugar_minimum_value);
        }
        HealthTextView healthTextView3 = this.mBloodSugarMax;
        if (healthTextView3 != null) {
            healthTextView3.setText(R.string.IDS_hw_show_healthdata_bloodsugar_maximum_value);
        }
    }

    private void setDigitalLocalization(HealthTextView healthTextView, float f) {
        if (healthTextView == null || njy.e(this.mModelList)) {
            LogUtil.j(TAG, "setDigitalLocalization view or bloodSugarStorageModel is null");
            return;
        }
        double d2 = UnitUtil.d(Math.abs(f), 1);
        String quantityString = BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_health_bloodsugar_mmol, UnitUtil.e(d2), UnitUtil.e(d2, 1, 1));
        LogUtil.d(TAG, "setDigitalLocalization sugarData is ", quantityString);
        healthTextView.setText(UnitUtil.b(this.mContext, "[\\.\\d]", quantityString, R.style.health_blood_min_max_value, R.style.health_blood_card_cursor_unit));
    }

    private void showBloodSugarAverageData() {
        String string;
        if (this.mAverageType == null || this.mReferenceData == null) {
            LogUtil.j(TAG, "showBloodSugarAverageData mAverageType is null");
            return;
        }
        String str = "  " + this.mContext.getResources().getQuantityString(R.plurals.IDS_health_bloodsugar_mmol, UnitUtil.e(getAverageData()), qnf.d(getAverageData()));
        if (this.mPageType == Constants.PageType.DAY) {
            string = this.mContext.getResources().getString(R.string.IDS_bloodsugar_avg_value_day, str);
        } else if (this.mPageType == Constants.PageType.WEEK) {
            string = this.mContext.getResources().getString(R.string.IDS_bloodsugar_avg_value_week, str);
        } else {
            string = this.mContext.getResources().getString(R.string.IDS_bloodsugar_avg_value_month, str);
        }
        this.mAverageType.setText(string);
        this.mReferenceData.setText(String.format(this.mContext.getResources().getString(R.string.IDS_bloodsugar_reference_range), this.mContext.getResources().getQuantityString(R.plurals.IDS_health_bloodsugar_mmol, UnitUtil.e(REFERENCE_VALUE), UnitUtil.e(REFERENCE_VALUE, 1, 1))));
        showBloodSugarStatus(getAverageData());
    }

    private boolean isShowExport() {
        Iterator<uma> it = this.mModelList.iterator();
        while (it.hasNext()) {
            if (it.next().n() != 2106) {
                return true;
            }
        }
        return false;
    }

    private float getAverageData() {
        int size;
        ArrayList<uma> arrayList = this.mModelList;
        float fE = 0.0f;
        if (arrayList == null || (size = arrayList.size()) <= 0) {
            return 0.0f;
        }
        for (int i = 0; i < size; i++) {
            fE += this.mModelList.get(i).e();
        }
        float f = fE / size;
        LogUtil.d(TAG, "averageData ", Float.valueOf(f), " totalData ", Float.valueOf(fE), " length ", Integer.valueOf(size));
        return f;
    }

    private void showBloodSugarStatus(float f) {
        if (f < REFERENCE_VALUE) {
            this.mBloodSugarAverageStatus.setTextColor(ContextCompat.getColor(this.mContext, R.color.color_blood_normal));
            this.mBloodSugarAverageStatus.setText(R.string.IDS_hw_health_show_healthdata_status_normal);
        } else {
            this.mBloodSugarAverageStatus.setTextColor(ContextCompat.getColor(this.mContext, R.color.color_blood_high));
            this.mBloodSugarAverageStatus.setText(R.string.IDS_hw_health_show_healthdata_status_high);
        }
    }

    public void showExportTable() {
        LogUtil.d(TAG, "showExportTable type is ", this.mPageType, ", mBloodSugarType ", this.mBloodSugarType);
        if (this.mPageType == Constants.PageType.WEEK && !"BLOOD_SUGAR_CONTINUE".equals(this.mBloodSugarType) && isShowExport()) {
            this.mExportTable.setVisibility(0);
            if (qrs.ac()) {
                this.mExportTable.setTextSize(1, 30.0f);
            } else {
                this.mExportTable.setTextSize(2, 16.0f);
            }
            this.mBottomDivider.setVisibility(0);
            this.mExportTable.setOnClickListener(new View.OnClickListener() { // from class: vfk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    uxd.d();
                }
            });
            return;
        }
        this.mExportTable.setVisibility(8);
    }

    private void notifySugarLevelTimes(uma umaVar) {
        switch (umaVar.h()) {
            case 1001:
            case 1002:
                this.mLowBloodSugarTimes++;
                break;
            case 1003:
                this.mNormalBloodSugarTimes++;
                break;
            case 1004:
            case 1005:
            case 1006:
                this.mHighBloodSugarTimes++;
                break;
            default:
                LogUtil.a(TAG, "no support blood type");
                break;
        }
    }

    @Override // com.huawei.ui.main.stories.template.health.view.BaseNoDataView, com.huawei.ui.main.stories.template.BaseComponent
    public void setPageType(Constants.PageType pageType) {
        this.mPageType = pageType;
    }
}
