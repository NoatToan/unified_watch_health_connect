package com.xiaomi.fitness.health.hrm;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.data.valueformatter.SleepRateHighLightMarkValueFormatter;
import com.xiaomi.fitness.health.sleep.view.SleepViewModel;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.util.HrmDataUtil;
import defpackage.c0j;
import defpackage.hak;
import defpackage.iji;
import defpackage.jui;
import defpackage.pni;
import defpackage.q02;
import defpackage.qxi;
import defpackage.r02;
import defpackage.rtr;
import defpackage.s02;
import defpackage.via;
import defpackage.vqr;
import defpackage.xcm;
import defpackage.xqr;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ;2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001;B\u0007¢\u0006\u0004\b:\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J!\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001cR\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010\u0019R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001e\u00105\u001a\n\u0012\u0004\u0012\u00020,\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006<"}, d2 = {"Lcom/xiaomi/fitness/health/hrm/StepHrmDetailFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/sleep/view/SleepViewModel;", "Lvia;", "", "initView", "()V", "initChartBarRecyclerView", "refreshView", "refreshChartView", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "stepAvgHr", "Ljava/lang/Integer;", "Lorg/joda/time/LocalDate;", "mLocalData", "Lorg/joda/time/LocalDate;", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/TimesDataRecordInt;", "stepHrmRecordList", "Ljava/util/List;", "Landroid/widget/TextView;", "tvAvgValue", "Landroid/widget/TextView;", "tvTimeRange", "tvTip", "chartTitleLayout", "Landroid/view/View;", "Landroidx/appcompat/widget/AppCompatImageView;", "ivChartIcon", "Landroidx/appcompat/widget/AppCompatImageView;", "tvChartTitle", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "barChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "Lr02;", "barChartAttrs", "Lr02;", "", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "entryList", "Lrtr;", "yAxis", "Lrtr;", "Lvqr;", "xAxis", "Lvqr;", "Lq02;", "chartAdapter", "Lq02;", "Ls02;", "chartItemDecoration", "Ls02;", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class StepHrmDetailFragment extends BaseBindingFragment<SleepViewModel, via> {

    @NotNull
    public static final String KEY_AVG_HR = "avg_hr";

    @NotNull
    public static final String KEY_HRM_RECORD_LIST = "record_list";

    @NotNull
    public static final String KEY_TIME = "report";

    @NotNull
    public static final String TAG = "StepHrmDetailFragment";

    @Nullable
    private r02 barChartAttrs;

    @Nullable
    private BarChartRecyclerView barChartRecyclerView;

    @Nullable
    private q02<RecyclerBarEntry> chartAdapter;

    @Nullable
    private s02 chartItemDecoration;

    @Nullable
    private View chartTitleLayout;

    @Nullable
    private List<RecyclerBarEntry> entryList;

    @Nullable
    private AppCompatImageView ivChartIcon;

    @Nullable
    private LocalDate mLocalData;

    @Nullable
    private Integer stepAvgHr;

    @Nullable
    private List<TimesDataRecordInt> stepHrmRecordList;

    @Nullable
    private TextView tvAvgValue;

    @Nullable
    private TextView tvChartTitle;

    @Nullable
    private TextView tvTimeRange;

    @Nullable
    private TextView tvTip;

    @Nullable
    private vqr xAxis;

    @Nullable
    private rtr yAxis;

    public StepHrmDetailFragment() {
        super(jui.v1);
    }

    private final void initChartBarRecyclerView() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        BarChartRecyclerView barChartRecyclerView = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView);
        this.barChartAttrs = (r02) barChartRecyclerView.mAttrs;
        xqr xqrVar = new xqr();
        this.entryList = new ArrayList();
        this.yAxis = new rtr(this.barChartAttrs);
        r02 r02Var = this.barChartAttrs;
        Intrinsics.checkNotNull(r02Var);
        vqr vqrVar = new vqr(r02Var, r02Var.c, xqrVar);
        this.xAxis = vqrVar;
        this.chartItemDecoration = new s02(this.yAxis, vqrVar, this.barChartAttrs);
        SleepRateHighLightMarkValueFormatter sleepRateHighLightMarkValueFormatter = new SleepRateHighLightMarkValueFormatter(0);
        s02 s02Var = this.chartItemDecoration;
        Intrinsics.checkNotNull(s02Var);
        s02Var.setHighLightValueFormatter(sleepRateHighLightMarkValueFormatter);
        this.chartAdapter = new q02<>(contextRequireContext, this.entryList, this.barChartRecyclerView, this.xAxis, this.barChartAttrs, sleepRateHighLightMarkValueFormatter);
        BarChartRecyclerView barChartRecyclerView2 = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView2);
        barChartRecyclerView2.setAdapter(this.chartAdapter);
        BarChartRecyclerView barChartRecyclerView3 = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView3);
        s02 s02Var2 = this.chartItemDecoration;
        Intrinsics.checkNotNull(s02Var2);
        barChartRecyclerView3.addItemDecoration(s02Var2);
        BarChartRecyclerView barChartRecyclerView4 = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView4);
        barChartRecyclerView4.setLayoutManager(new SpeedRatioLayoutManager(contextRequireContext, this.barChartAttrs));
        BarChartRecyclerView barChartRecyclerView5 = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView5);
        barChartRecyclerView5.setNestedScrollingEnabled(false);
        BarChartRecyclerView barChartRecyclerView6 = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView6);
        barChartRecyclerView6.addOnItemTouchListener(new hak(contextRequireContext, this.barChartRecyclerView, new xcm() { // from class: com.xiaomi.fitness.health.hrm.StepHrmDetailFragment.initChartBarRecyclerView.1
            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                super.onItemSelected(barEntry, position);
                if (barEntry == null || !barEntry.isSelected()) {
                    View view = StepHrmDetailFragment.this.chartTitleLayout;
                    if (view != null) {
                        view.setVisibility(0);
                        return;
                    }
                    return;
                }
                View view2 = StepHrmDetailFragment.this.chartTitleLayout;
                if (view2 != null) {
                    view2.setVisibility(4);
                }
            }
        }));
    }

    private final void initView() {
        this.tvAvgValue = getMBinding().J;
        this.tvTimeRange = getMBinding().G;
        this.tvTip = getMBinding().H;
        this.chartTitleLayout = getMBinding().B;
        this.ivChartIcon = getMBinding().C;
        this.tvChartTitle = getMBinding().F;
        this.barChartRecyclerView = getMBinding().A;
        initChartBarRecyclerView();
    }

    private final void refreshChartView() {
        List<TimesDataRecordInt> list;
        if (this.stepAvgHr == null || (list = this.stepHrmRecordList) == null || list.isEmpty() || this.mLocalData == null) {
            return;
        }
        HrmDataUtil hrmDataUtil = HrmDataUtil.INSTANCE;
        r02 r02Var = this.barChartAttrs;
        Intrinsics.checkNotNull(r02Var);
        LocalDate localDate = this.mLocalData;
        Intrinsics.checkNotNull(localDate);
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(TimeDateUtil.localDateToTimestamp(localDate));
        List<TimesDataRecordInt> list2 = this.stepHrmRecordList;
        Intrinsics.checkNotNull(list2);
        List<SegmentBarEntry> listFillDaySegmentBarEntry = hrmDataUtil.fillDaySegmentBarEntry(r02Var, jChangZeroOfTheDay, list2);
        List<RecyclerBarEntry> list3 = this.entryList;
        Intrinsics.checkNotNull(list3);
        list3.clear();
        List<RecyclerBarEntry> list4 = this.entryList;
        Intrinsics.checkNotNull(list4);
        list4.addAll(listFillDaySegmentBarEntry);
        vqr vqrVar = this.xAxis;
        Intrinsics.checkNotNull(vqrVar);
        r02 r02Var2 = this.barChartAttrs;
        Intrinsics.checkNotNull(r02Var2);
        vqrVar.f37144a = r02Var2.c;
        float theMaxNumber = HealthUtil.getTheMaxNumber(this.entryList);
        rtr rtrVar = this.yAxis;
        Intrinsics.checkNotNull(rtrVar);
        this.yAxis = rtrVar.l(this.yAxis, theMaxNumber);
        s02 s02Var = this.chartItemDecoration;
        Intrinsics.checkNotNull(s02Var);
        s02Var.setYAxis(this.yAxis);
        s02 s02Var2 = this.chartItemDecoration;
        Intrinsics.checkNotNull(s02Var2);
        s02Var2.setXAxis(this.xAxis);
        q02<RecyclerBarEntry> q02Var = this.chartAdapter;
        Intrinsics.checkNotNull(q02Var);
        q02Var.setXAxis(this.xAxis);
        q02<RecyclerBarEntry> q02Var2 = this.chartAdapter;
        Intrinsics.checkNotNull(q02Var2);
        q02Var2.notifyDataSetChanged();
    }

    private final void refreshView() {
        String dateStr;
        TextView textView = this.tvAvgValue;
        if (textView != null) {
            Resources resources = getResources();
            int i = qxi.common_unit_heart_rate_desc;
            Integer num = this.stepAvgHr;
            Intrinsics.checkNotNull(num);
            int iIntValue = num.intValue();
            Integer num2 = this.stepAvgHr;
            Intrinsics.checkNotNull(num2);
            textView.setText(resources.getQuantityString(i, iIntValue, num2));
        }
        TextView textView2 = this.tvTimeRange;
        if (textView2 != null) {
            LocalDate localDate = this.mLocalData;
            Intrinsics.checkNotNull(localDate);
            if (TimeDateUtil.isToday(localDate)) {
                dateStr = getString(c0j.v5);
            } else {
                LocalDate localDate2 = this.mLocalData;
                Intrinsics.checkNotNull(localDate2);
                dateStr = TimeDateUtil.getDateStr(TimeDateUtil.localDateToTimestamp(localDate2), TimeUtils.FORMAT_H_M);
            }
            textView2.setText(dateStr);
        }
        TextView textView3 = this.tvTip;
        if (textView3 != null) {
            textView3.setText(getString(c0j.Bd));
        }
        AppCompatImageView appCompatImageView = this.ivChartIcon;
        if (appCompatImageView != null) {
            appCompatImageView.setBackgroundResource(pni.S1);
        }
        TextView textView4 = this.tvChartTitle;
        if (textView4 != null) {
            textView4.setText(getString(c0j.Jb));
        }
        refreshChartView();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(getString(c0j.Jb));
        setActionBarExpandState(0);
        setTitleBackground(iji.T2);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.mLocalData = (LocalDate) arguments.getSerializable("report");
            this.stepAvgHr = Integer.valueOf(arguments.getInt(KEY_AVG_HR));
            this.stepHrmRecordList = (List) arguments.getSerializable("record_list");
        }
        Logger.i(TAG, "report " + this.stepAvgHr + ";hrm records " + this.stepHrmRecordList);
        if (this.stepAvgHr == null) {
            Logger.e(TAG, "param invalid !!");
            finish();
        } else {
            initView();
            refreshView();
        }
    }
}
