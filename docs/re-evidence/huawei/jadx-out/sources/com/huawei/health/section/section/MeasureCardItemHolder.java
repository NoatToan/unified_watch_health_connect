package com.huawei.health.section.section;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.core.util.Pair;
import androidx.core.widget.TextViewCompat;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;
import com.huawei.ui.commonui.linechart.view.HwHealthLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import defpackage.ddv;
import defpackage.gvh;
import defpackage.gvl;
import defpackage.njy;
import defpackage.pfi;
import defpackage.qnt;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public abstract class MeasureCardItemHolder {
    private static final String TAG = "CardHolder";
    private static final float Y_AXIS_MAXIMUM_OFFSET = 10.0f;
    private static final float Y_AXIS_MINIMUM_OFFSET = 10.0f;
    private ImageView mCenterArrow;
    protected HwHealthLineChart mChart;
    protected final LinearLayout mChartContainer;
    protected HwHealthLineDataSet mChartDataSet;
    private View mContentRootLayout;
    protected final Context mContext;
    private boolean mHasGotoDetailPage = false;
    protected final ImageView mIcon;
    protected View mItemView;
    protected HwHealthLineDataSet mMaskDataSet;
    private ImageView mNewDataDot;
    private View.OnClickListener mOnClickListener;
    protected final HealthTextView mPrimaryTipTextView;
    protected final HealthTextView mSecondaryTipTextView;
    private View mTimeAndArrowArea;
    protected final HealthTextView mTimeTextView;
    protected String mTitle;
    private LinearLayout mTitleDotArea;
    protected HealthTextView mTitleTextView;

    public enum MeasureType {
        ITEM_TYPE_ECG_NORMAL,
        ITEM_TYPE_ECG_ARRHYTHMIA,
        ITEM_TYPE_ECG_VASCULAR
    }

    protected abstract void bindDesc(gvl gvlVar);

    protected Pair<Integer, Integer> getChartGradientColors() {
        return null;
    }

    protected int getChartLineColor(Context context) {
        return 0;
    }

    protected abstract long getNewDataTimeStamp(gvl gvlVar);

    protected void preBindChart(gvl gvlVar) {
    }

    protected abstract void syncEcgData();

    public MeasureCardItemHolder(View view) {
        this.mItemView = view;
        Context context = view.getContext();
        this.mContext = context;
        this.mIcon = (ImageView) view.findViewById(R.id.icon);
        this.mTimeTextView = (HealthTextView) view.findViewById(R.id.time_text);
        this.mPrimaryTipTextView = (HealthTextView) view.findViewById(R.id.primary_tip);
        this.mSecondaryTipTextView = (HealthTextView) view.findViewById(R.id.secondary_tip);
        this.mTitleDotArea = (LinearLayout) view.findViewById(R.id.title_dot_area);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.card_line_chart_container);
        this.mChartContainer = linearLayout;
        if (LanguageUtil.ba(context)) {
            linearLayout.setRotationY(180.0f);
        }
        this.mTimeAndArrowArea = view.findViewById(R.id.time_arrow_area);
        this.mCenterArrow = (ImageView) view.findViewById(R.id.center_arrow);
        this.mNewDataDot = (ImageView) view.findViewById(R.id.new_data_dot);
        this.mContentRootLayout = view.findViewById(R.id.root_relative_layout);
        addTitleTextView();
    }

    private void addTitleTextView() {
        if (this.mTitleTextView != null) {
            return;
        }
        this.mTitleDotArea.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.health.section.section.MeasureCardItemHolder.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                ViewGroup.LayoutParams layoutParams = MeasureCardItemHolder.this.mNewDataDot.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    MeasureCardItemHolder.this.mTitleTextView = new HealthTextView(MeasureCardItemHolder.this.mContext);
                    qsp.b(MeasureCardItemHolder.this.mTitleTextView, MeasureCardItemHolder.this.mTitle);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    int width = MeasureCardItemHolder.this.mTitleDotArea.getWidth();
                    int width2 = MeasureCardItemHolder.this.mNewDataDot.getWidth();
                    int marginStart = marginLayoutParams.getMarginStart();
                    int marginEnd = marginLayoutParams.getMarginEnd();
                    int dimensionPixelSize = MeasureCardItemHolder.this.mContext.getResources().getDimensionPixelSize(R.dimen.textSizeBody2);
                    MeasureCardItemHolder.this.mTitleTextView.setTextSize(0, dimensionPixelSize);
                    MeasureCardItemHolder.this.mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                    MeasureCardItemHolder.this.mTitleTextView.setTextColor(ContextCompat.getColor(MeasureCardItemHolder.this.mContext, R.color.textColorPrimary));
                    MeasureCardItemHolder.this.mTitleTextView.setMaxWidth(((width - width2) - marginStart) - marginEnd);
                    MeasureCardItemHolder.this.mTitleTextView.setMaxLines(1);
                    MeasureCardItemHolder.this.mTitleTextView.setGravity(16);
                    MeasureCardItemHolder.this.mTitleTextView.setTextAlignment(1);
                    TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(MeasureCardItemHolder.this.mTitleTextView, MeasureCardItemHolder.this.mContext.getResources().getDimensionPixelSize(R.dimen.health_ring_chart_item_text_size_min), dimensionPixelSize, MeasureCardItemHolder.this.mContext.getResources().getDimensionPixelSize(R.dimen.textAutoSizeMinStepGranularity), 0);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    MeasureCardItemHolder.this.mTitleTextView.setLayoutParams(layoutParams2);
                    MeasureCardItemHolder.this.mTitleDotArea.addView(MeasureCardItemHolder.this.mTitleTextView, 0);
                    MeasureCardItemHolder.this.mTitleDotArea.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            }
        });
    }

    protected void showNewDataDot() {
        LogUtil.a(TAG, "showNewDataDot");
        this.mNewDataDot.setVisibility(0);
        setNewDataDotExists(true);
    }

    protected void hideNewDataDot() {
        LogUtil.a(TAG, "hideNewDataDot");
        this.mNewDataDot.setVisibility(8);
        setNewDataDotExists(false);
    }

    public void bindAll(gvl gvlVar) {
        bindClickEvent(gvlVar);
        bindDesc(gvlVar);
        bindNewDataDot(gvlVar);
        bindChart(gvlVar);
    }

    private void setNewDataDotExists(boolean z) {
        SharedPreferenceManager.a(Integer.toString(10052), getNewDataDotExistsKey(), z);
    }

    private boolean getNewDataDotExists() {
        return SharedPreferenceManager.b(Integer.toString(10052), getNewDataDotExistsKey(), false);
    }

    private long getNewDataDotTimeStamp() {
        return SharedPreferenceManager.d(Integer.toString(10052), getNewDataDotTimeStampKey(), 0L);
    }

    private void setNewDataDotTimeStamp(long j) {
        SharedPreferenceManager.c(Integer.toString(10052), getNewDataDotTimeStampKey(), j);
    }

    private void bindNewDataDot(gvl gvlVar) {
        long newDataTimeStamp = getNewDataTimeStamp(gvlVar);
        LogUtil.a(TAG, "bindNewDataDot newDataTimeStamp ", Long.valueOf(newDataTimeStamp));
        long newDataDotTimeStamp = getNewDataDotTimeStamp();
        LogUtil.a(TAG, "bindNewDataDot lastDataTimeStamp ", Long.valueOf(newDataDotTimeStamp));
        boolean newDataDotExists = getNewDataDotExists();
        LogUtil.a(TAG, "bindNewDataDot isNewDataDotExists ", Boolean.valueOf(newDataDotExists));
        if (newDataDotExists || (newDataTimeStamp != 0 && newDataTimeStamp > newDataDotTimeStamp)) {
            showNewDataDot();
            if (newDataTimeStamp != 0 && newDataTimeStamp > newDataDotTimeStamp) {
                syncEcgData();
            }
        }
        if ((newDataTimeStamp == 0 || this.mHasGotoDetailPage || newDataTimeStamp == newDataDotTimeStamp) && !newDataDotExists) {
            hideNewDataDot();
        }
        if (newDataTimeStamp != newDataDotTimeStamp) {
            setNewDataDotTimeStamp(newDataTimeStamp);
        }
        this.mHasGotoDetailPage = false;
    }

    private void bindClickEvent(final gvl gvlVar) {
        if (this.mOnClickListener == null) {
            this.mOnClickListener = new View.OnClickListener() { // from class: gvr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.m1150x5b50a07b(gvlVar, view);
                }
            };
        }
        this.mItemView.setOnClickListener(this.mOnClickListener);
    }

    /* JADX INFO: renamed from: lambda$bindClickEvent$1$com-huawei-health-section-section-MeasureCardItemHolder, reason: not valid java name */
    public /* synthetic */ void m1150x5b50a07b(gvl gvlVar, View view) {
        if (qrs.r()) {
            return;
        }
        final String strH = gvlVar.h();
        LogUtil.a(TAG, "goto H5: pkgH5Name = ", strH);
        final H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addPath(gvlVar.b());
        if (TextUtils.isEmpty(strH)) {
            LogUtil.e(TAG, "goto H5 failed: pkgH5Name = ", strH);
            return;
        }
        if (strH.contains("com.huawei.health.h5.ppg")) {
            pfi.c().launchActivity(this.mContext, new Intent(), new AppBundleLauncher.InstallCallback() { // from class: gvs
                @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
                public final boolean call(Context context, Intent intent) {
                    return this.e.m1149x35bc977a(strH, builder, context, intent);
                }
            });
        } else {
            ddv.b().loadH5ProApp(this.mContext, strH, builder);
        }
        this.mHasGotoDetailPage = true;
        hideNewDataDot();
    }

    /* JADX INFO: renamed from: lambda$bindClickEvent$0$com-huawei-health-section-section-MeasureCardItemHolder, reason: not valid java name */
    public /* synthetic */ boolean m1149x35bc977a(String str, H5ProLaunchOption.Builder builder, Context context, Intent intent) {
        ddv.b().loadH5ProApp(this.mContext, str, builder);
        return false;
    }

    protected void onDataAvailable(boolean z) {
        adjustArrowPosition(z);
        adjustBottomMargin(z);
        adjustChartVisibility(z);
    }

    private void adjustChartVisibility(boolean z) {
        this.mChartContainer.setVisibility(z ? 0 : 8);
    }

    protected void adjustArrowPosition(boolean z) {
        this.mCenterArrow.setVisibility(z ? 8 : 0);
        this.mTimeAndArrowArea.setVisibility(z ? 0 : 8);
    }

    private void adjustBottomMargin(boolean z) {
        ViewGroup.LayoutParams layoutParams = this.mContentRootLayout.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = this.mContext.getResources().getDimensionPixelSize(z ? R.dimen.health_common_14dp : R.dimen.health_common_12dp);
            this.mContentRootLayout.setLayoutParams(marginLayoutParams);
        }
    }

    private String getNewDataDotTimeStampKey() {
        return getTag() + "_newDataDotTimeStamp";
    }

    private String getNewDataDotExistsKey() {
        return getTag() + "_newDataDotExists";
    }

    public void bindChart(gvl gvlVar) {
        List<gvh> listJ = gvlVar.j();
        if (!gvlVar.g()) {
            listJ = null;
        }
        refreshChart(listJ);
    }

    private void refreshDataSet(List<gvh> list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        LogUtil.a(getTag(), "initLineChart dataSize = ", Integer.valueOf(size));
        for (int i = 0; i < size; i++) {
            gvh gvhVar = list.get(i);
            if (!gvhVar.a()) {
                arrayList.add(new HwHealthBaseEntry(i, (float) gvhVar.b()));
            }
        }
        HwHealthLineDataSet hwHealthLineDataSet = new HwHealthLineDataSet(this.mContext, arrayList, "line brief", "line label", "line unit");
        this.mChartDataSet = hwHealthLineDataSet;
        hwHealthLineDataSet.c(1);
        this.mChartDataSet.b(new HwHealthLineDataSet.LineLinkerFilter() { // from class: com.huawei.health.section.section.MeasureCardItemHolder.5
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.LineLinkerFilter
            public boolean drawLine(int i2, int i3, int i4) {
                return i3 - i2 <= i4;
            }
        });
        this.mChartDataSet.setLineWidth(this.mContext.getResources().getDimensionPixelSize(R.dimen.health_common_0_25dp));
        this.mChartDataSet.setColor(getChartLineColor(this.mContext));
        Pair<Integer, Integer> chartGradientColors = getChartGradientColors();
        if (chartGradientColors != null) {
            this.mChartDataSet.a(chartGradientColors.first.intValue(), chartGradientColors.second.intValue(), true);
        }
        this.mChartDataSet.setAxisDependency(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY);
    }

    private void refreshMaskDataSet(List<gvh> list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        LogUtil.a(getTag(), "initLineChart dataSize = ", Integer.valueOf(size));
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (list.get(i).a()) {
                arrayList.add(new HwHealthBaseEntry(i, z ? getYMin() : getYMax()));
                z = false;
            } else {
                if (!z && i > 0) {
                    arrayList.set(arrayList.size() - 1, new HwHealthBaseEntry(i - 1, getYMin()));
                }
                z = true;
            }
        }
        HwHealthLineDataSet hwHealthLineDataSet = new HwHealthLineDataSet(this.mContext, arrayList, "line brief", "line label", "line unit");
        this.mMaskDataSet = hwHealthLineDataSet;
        hwHealthLineDataSet.c(1);
        this.mMaskDataSet.b(new HwHealthLineDataSet.LineLinkerFilter() { // from class: com.huawei.health.section.section.MeasureCardItemHolder.4
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.LineLinkerFilter
            public boolean drawLine(int i2, int i3, int i4) {
                return true;
            }
        });
        this.mMaskDataSet.setLineWidth(this.mContext.getResources().getDimensionPixelSize(R.dimen.health_common_0dp));
        this.mMaskDataSet.setColor(ContextCompat.getColor(this.mContext, R.color.transparent));
        this.mMaskDataSet.setDrawFilled(true);
        this.mMaskDataSet.a(ContextCompat.getColor(this.mContext, R.color.emui_color_gray_1), ContextCompat.getColor(this.mContext, R.color.emui_color_gray_1), true);
        this.mMaskDataSet.setAxisDependency(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY);
    }

    protected float getYMin() {
        return this.mChartDataSet.getYMin();
    }

    protected float getYMax() {
        return this.mChartDataSet.getYMax();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: refreshChartData, reason: merged with bridge method [inline-methods] */
    public void m1151xf2e32770(List<gvh> list) {
        refreshDataSet(list);
        refreshMaskDataSet(list);
        ArrayList arrayList = new ArrayList();
        HwHealthYAxis axisFirstParty = this.mChart.getAxisFirstParty();
        axisFirstParty.setAxisMinimum(getYMin() - 10.0f);
        axisFirstParty.setAxisMaximum(getYMax() + 10.0f);
        arrayList.add(this.mChartDataSet);
        arrayList.add(this.mMaskDataSet);
        this.mChart.setData(new qnt(arrayList));
        this.mChart.refresh();
    }

    private void refreshChart(final List<gvh> list) {
        if (njy.e(list)) {
            HwHealthLineChart hwHealthLineChart = this.mChart;
            if (hwHealthLineChart == null) {
                return;
            }
            hwHealthLineChart.setVisibility(8);
            return;
        }
        this.mChartContainer.setVisibility(0);
        HwHealthLineChart hwHealthLineChart2 = this.mChart;
        if (hwHealthLineChart2 == null) {
            HwHealthLineChart hwHealthLineChart3 = (HwHealthLineChart) LayoutInflater.from(this.mContext).inflate(R.layout.measure_card_chart_layout, (ViewGroup) this.mChartContainer, false).findViewById(R.id.linechart);
            this.mChart = hwHealthLineChart3;
            hwHealthLineChart3.setAllowMultiSetDrawFillEnabled(true);
            this.mChart.post(new Runnable() { // from class: gvu
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.m1151xf2e32770(list);
                }
            });
            this.mChart.setTouchEnabled(false);
            this.mChart.getXAxis().setEnabled(false);
            this.mChart.getDescription().setEnabled(false);
            HwHealthYAxis axisFirstParty = this.mChart.getAxisFirstParty();
            axisFirstParty.setDrawLabels(false);
            axisFirstParty.setDrawGridLines(false);
            axisFirstParty.setDrawAxisLine(false);
            this.mChart.disableLabelsForce();
            this.mChartContainer.addView(this.mChart);
            return;
        }
        hwHealthLineChart2.setVisibility(0);
        m1151xf2e32770(list);
    }

    void hide() {
        this.mItemView.setVisibility(8);
    }

    void show() {
        this.mItemView.setVisibility(0);
    }

    protected String getTag() {
        return TAG;
    }
}
