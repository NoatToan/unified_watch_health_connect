package com.xiaomi.fitness.health.vo2max;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.api.repository.IVO2MaxRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyVo2MaxReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fit.fitness.export.data.item.Vo2MaxItem;
import com.xiaomi.fitness.base.BasicDataViewModel;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.widget.LevelBarView;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.recycer.BarChartRecyclerHelper;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.data.valueformatter.VO2MaxWeekMonthHighLightMarkValueFormatter;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.vo2max.VO2MaxBaseWeekMonthFragment;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.util.VO2MaxDataUtil;
import com.xiaomi.fitness.view.DataTitleView;
import defpackage.bl5;
import defpackage.c0j;
import defpackage.gfe;
import defpackage.hak;
import defpackage.j9f;
import defpackage.onq;
import defpackage.opo;
import defpackage.pni;
import defpackage.qpo;
import defpackage.rtr;
import defpackage.vfe;
import defpackage.vnq;
import defpackage.vqr;
import defpackage.xcm;
import defpackage.yfe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u0000 {*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\u0001{B\u0007¢\u0006\u0004\bz\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bJ'\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u000b\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\bJ\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\bJ\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\bJ\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\bJ\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\bJ\u000f\u0010\u001b\u001a\u00020\u0006H&¢\u0006\u0004\b\u001b\u0010\bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\bJ!\u0010!\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R$\u0010*\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00101\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R \u0010?\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010>\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R$\u0010B\u001a\u0004\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0018\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR$\u0010N\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010+\u001a\u0004\bO\u0010-\"\u0004\bP\u0010/R$\u0010R\u001a\u0004\u0018\u00010Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR$\u0010Y\u001a\u0004\u0018\u00010X8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R$\u0010_\u001a\u0004\u0018\u00010Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010S\u001a\u0004\b`\u0010U\"\u0004\ba\u0010WR\u0018\u0010c\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u001e\u0010f\u001a\n\u0012\u0004\u0012\u00020e\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010@R\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020h0g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010@R$\u0010j\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010+\u001a\u0004\bk\u0010-\"\u0004\bl\u0010/R$\u0010n\u001a\u0004\u0018\u00010m8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u0014\u0010v\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0014\u0010y\u001a\u00020\u000e8$X¤\u0004¢\u0006\u0006\u001a\u0004\bw\u0010x¨\u0006|"}, d2 = {"Lcom/xiaomi/fitness/health/vo2max/VO2MaxBaseWeekMonthFragment;", "Lcom/xiaomi/fitness/base/BasicDataViewModel;", "VM", "Landroidx/databinding/ViewDataBinding;", "VDB", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "", Constants.KEY_REQUEST_DATA, "()V", "refreshView", "refreshDataTitleView", "refreshDetailCard", "Lcom/xiaomi/fit/fitness/export/data/item/Vo2MaxItem;", "item", "", "indexChange", "", "tag", "(Lcom/xiaomi/fit/fitness/export/data/item/Vo2MaxItem;ILjava/lang/String;)V", "refreshLineChart", "initView", "initDetailCard", "updateRecyclerDetailLayoutManager", "updateLevelBarRecyclerViewMargin", "initLevelDescRecyclerview", "initLineChart", "initBundle", "initViewBinding", LifecycleConstantKt.ON_RESUME, "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lorg/joda/time/LocalDate;", "mCurrentLocalDate", "Lorg/joda/time/LocalDate;", "containerView", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "setContainerView", "(Landroid/view/View;)V", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "mRecyclerChart", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "getMRecyclerChart", "()Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "setMRecyclerChart", "(Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;)V", "Lvfe;", "mBarChartAttrs", "Lvfe;", "Lj9f;", "mChartAdapter", "Lj9f;", "", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "mEntries", "Ljava/util/List;", "Lcom/xiaomi/fitness/view/DataTitleView;", "dataTitleView", "Lcom/xiaomi/fitness/view/DataTitleView;", "getDataTitleView", "()Lcom/xiaomi/fitness/view/DataTitleView;", "setDataTitleView", "(Lcom/xiaomi/fitness/view/DataTitleView;)V", "Lrtr;", "mYAxis", "Lrtr;", "Lvqr;", "mXAxis", "Lvqr;", "mDetailCard", "getMDetailCard", "setMDetailCard", "Landroidx/recyclerview/widget/RecyclerView;", "mCardRecyclerDetail", "Landroidx/recyclerview/widget/RecyclerView;", "getMCardRecyclerDetail", "()Landroidx/recyclerview/widget/RecyclerView;", "setMCardRecyclerDetail", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lcom/xiaomi/fitness/baseui/widget/LevelBarView;", "mLevelBarView", "Lcom/xiaomi/fitness/baseui/widget/LevelBarView;", "getMLevelBarView", "()Lcom/xiaomi/fitness/baseui/widget/LevelBarView;", "setMLevelBarView", "(Lcom/xiaomi/fitness/baseui/widget/LevelBarView;)V", "mLevelDescRecyclerView", "getMLevelDescRecyclerView", "setMLevelDescRecyclerView", "Lopo;", "mDetailAdapter", "Lopo;", "Lqpo;", "mDataListDetail", "", "Lcom/xiaomi/fitness/baseui/widget/LevelBarView$LevelItem;", "levelItems", "understandCard", "getUnderstandCard", "setUnderstandCard", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyVo2MaxReport;", "vo2MaxReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyVo2MaxReport;", "getVo2MaxReport", "()Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyVo2MaxReport;", "setVo2MaxReport", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyVo2MaxReport;)V", "getEmptyTitleStr", "()Ljava/lang/String;", "emptyTitleStr", "getFragmentPosition", "()I", "fragmentPosition", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class VO2MaxBaseWeekMonthFragment<VM extends BasicDataViewModel, VDB extends ViewDataBinding> extends BaseBindingFragment<VM, VDB> {

    @NotNull
    public static final String TAG = "MiHealth:vo2max";

    @Nullable
    private View containerView;

    @Nullable
    private DataTitleView dataTitleView;

    @NotNull
    private final List<LevelBarView.LevelItem> levelItems = VO2MaxDataUtil.INSTANCE.getVo2MaxLevelItems();

    @Nullable
    private vfe mBarChartAttrs;

    @Nullable
    private RecyclerView mCardRecyclerDetail;

    @Nullable
    private j9f mChartAdapter;

    @Nullable
    private LocalDate mCurrentLocalDate;

    @Nullable
    private List<qpo> mDataListDetail;

    @Nullable
    private opo mDetailAdapter;

    @Nullable
    private View mDetailCard;

    @Nullable
    private List<MaxMinEntry> mEntries;

    @Nullable
    private LevelBarView mLevelBarView;

    @Nullable
    private RecyclerView mLevelDescRecyclerView;

    @Nullable
    private LineChartRecyclerView mRecyclerChart;

    @Nullable
    private vqr mXAxis;

    @Nullable
    private rtr mYAxis;

    @Nullable
    private View understandCard;

    @Nullable
    private DailyVo2MaxReport vo2MaxReport;

    private final String getEmptyTitleStr() {
        String string = getString(c0j.L6);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0046  */
    /* JADX WARN: Code duplicated, block: B:17:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    private final void initBundle() {
        int fragmentPosition;
        LocalDate localDateNow;
        Bundle arguments = getArguments();
        Integer numValueOf = arguments != null ? Integer.valueOf(arguments.getInt("offset", 0)) : null;
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            int fragmentPosition2 = getFragmentPosition();
            if (fragmentPosition2 != 0) {
                localDateNow = fragmentPosition2 != 1 ? TimeDateUtil.getFirstDayOfMonth(LocalDate.now().minusMonths(iIntValue)) : TimeDateUtil.getWeekMonday(LocalDate.now().minusWeeks(iIntValue));
            } else {
                localDateNow = LocalDate.now().minusDays(iIntValue);
            }
            if (localDateNow == null) {
                fragmentPosition = getFragmentPosition();
                if (fragmentPosition != 0) {
                    localDateNow = LocalDate.now();
                } else if (fragmentPosition != 1) {
                    localDateNow = TimeDateUtil.getFirstDayOfMonth(LocalDate.now());
                } else {
                    localDateNow = TimeDateUtil.getWeekMonday(LocalDate.now());
                }
            }
        } else {
            fragmentPosition = getFragmentPosition();
            if (fragmentPosition != 0) {
                localDateNow = LocalDate.now();
            } else if (fragmentPosition != 1) {
                localDateNow = TimeDateUtil.getFirstDayOfMonth(LocalDate.now());
            } else {
                localDateNow = TimeDateUtil.getWeekMonday(LocalDate.now());
            }
        }
        this.mCurrentLocalDate = localDateNow;
        if (localDateNow == null) {
            this.mCurrentLocalDate = LocalDate.now();
        }
    }

    private final void initDetailCard() {
        this.mDataListDetail = new ArrayList();
        RecyclerView recyclerView = this.mCardRecyclerDetail;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.addItemDecoration(new bl5());
        this.mDetailAdapter = new opo(getMActivity(), this.mDataListDetail, c0j.I6, pni.m2);
        updateRecyclerDetailLayoutManager();
        RecyclerView recyclerView2 = this.mCardRecyclerDetail;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setAdapter(this.mDetailAdapter);
        RecyclerView recyclerView3 = this.mCardRecyclerDetail;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setHasFixedSize(true);
        LevelBarView levelBarView = this.mLevelBarView;
        if (levelBarView != null) {
            levelBarView.setLevels(this.levelItems);
        }
        initLevelDescRecyclerview();
        updateLevelBarRecyclerViewMargin();
    }

    private final void initLevelDescRecyclerview() {
        SettingsPropertiesUtil settingsPropertiesUtil = SettingsPropertiesUtil.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        int i = settingsPropertiesUtil.isExpand(contextRequireContext) ? 4 : 3;
        gfe gfeVar = new gfe(getContext(), this.levelItems, i);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), i);
        RecyclerView recyclerView = this.mLevelDescRecyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(gridLayoutManager);
        }
        RecyclerView recyclerView2 = this.mLevelDescRecyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setHasFixedSize(true);
        }
        RecyclerView recyclerView3 = this.mLevelDescRecyclerView;
        if (recyclerView3 != null) {
            recyclerView3.setNestedScrollingEnabled(false);
        }
        RecyclerView recyclerView4 = this.mLevelDescRecyclerView;
        if (recyclerView4 != null) {
            recyclerView4.setAdapter(gfeVar);
        }
        gfeVar.notifyDataSetChanged();
    }

    private final void initLineChart() {
        LineChartRecyclerView lineChartRecyclerView = this.mRecyclerChart;
        Intrinsics.checkNotNull(lineChartRecyclerView);
        vfe vfeVar = (vfe) lineChartRecyclerView.mAttrs;
        this.mBarChartAttrs = vfeVar;
        Intrinsics.checkNotNull(vfeVar);
        int i = vfeVar.c;
        BarChartRecyclerHelper barChartRecyclerHelper = BarChartRecyclerHelper.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        onq onqVarCreateXAxisFormatter = barChartRecyclerHelper.createXAxisFormatter(contextRequireContext, getFragmentPosition());
        this.mEntries = new ArrayList();
        this.mYAxis = new vnq(this.mBarChartAttrs);
        this.mXAxis = new vqr(this.mBarChartAttrs, i, onqVarCreateXAxisFormatter);
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(getActivity(), this.mBarChartAttrs);
        yfe yfeVar = new yfe(this.mYAxis, this.mXAxis, this.mBarChartAttrs);
        VO2MaxWeekMonthHighLightMarkValueFormatter vO2MaxWeekMonthHighLightMarkValueFormatter = new VO2MaxWeekMonthHighLightMarkValueFormatter(0);
        yfeVar.setHighLightValueFormatter(vO2MaxWeekMonthHighLightMarkValueFormatter);
        LineChartRecyclerView lineChartRecyclerView2 = this.mRecyclerChart;
        Intrinsics.checkNotNull(lineChartRecyclerView2);
        lineChartRecyclerView2.addItemDecoration(yfeVar);
        this.mChartAdapter = new j9f(getActivity(), this.mEntries, this.mRecyclerChart, this.mXAxis, this.mBarChartAttrs, vO2MaxWeekMonthHighLightMarkValueFormatter);
        LineChartRecyclerView lineChartRecyclerView3 = this.mRecyclerChart;
        Intrinsics.checkNotNull(lineChartRecyclerView3);
        lineChartRecyclerView3.setAdapter(this.mChartAdapter);
        LineChartRecyclerView lineChartRecyclerView4 = this.mRecyclerChart;
        Intrinsics.checkNotNull(lineChartRecyclerView4);
        lineChartRecyclerView4.setLayoutManager(speedRatioLayoutManager);
        LineChartRecyclerView lineChartRecyclerView5 = this.mRecyclerChart;
        Intrinsics.checkNotNull(lineChartRecyclerView5);
        lineChartRecyclerView5.setNestedScrollingEnabled(false);
        hak hakVar = new hak(getActivity(), this.mRecyclerChart, new xcm(this) { // from class: com.xiaomi.fitness.health.vo2max.VO2MaxBaseWeekMonthFragment$initLineChart$itemGestureListener$1
            final /* synthetic */ VO2MaxBaseWeekMonthFragment<VM, VDB> this$0;

            {
                this.this$0 = this;
            }

            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                if (barEntry == null || !barEntry.isSelected()) {
                    DataTitleView dataTitleView = this.this$0.getDataTitleView();
                    if (dataTitleView != null) {
                        dataTitleView.setVisibility(0);
                        return;
                    }
                    return;
                }
                DataTitleView dataTitleView2 = this.this$0.getDataTitleView();
                if (dataTitleView2 != null) {
                    dataTitleView2.setVisibility(4);
                }
            }
        });
        LineChartRecyclerView lineChartRecyclerView6 = this.mRecyclerChart;
        Intrinsics.checkNotNull(lineChartRecyclerView6);
        lineChartRecyclerView6.addOnItemTouchListener(hakVar);
    }

    private final void initView() {
        initLineChart();
        initDetailCard();
        View view = this.understandCard;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: rmq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    VO2MaxBaseWeekMonthFragment.initView$lambda$1(this.f32711a, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(VO2MaxBaseWeekMonthFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseFragmentExKt.gotoPage(this$0, VO2MaxUnderstandFragment.class, null);
    }

    private final void refreshDataTitleView() {
        DailyVo2MaxReport dailyVo2MaxReport = this.vo2MaxReport;
        if (dailyVo2MaxReport == null) {
            DataTitleView dataTitleView = this.dataTitleView;
            if (dataTitleView != null) {
                dataTitleView.c(getEmptyTitleStr());
                return;
            }
            return;
        }
        Intrinsics.checkNotNull(dailyVo2MaxReport);
        Vo2MaxItem latestItem = dailyVo2MaxReport.getLatestItem();
        if (latestItem == null || latestItem.getVo2Max() <= 0) {
            DataTitleView dataTitleView2 = this.dataTitleView;
            if (dataTitleView2 != null) {
                dataTitleView2.c(getEmptyTitleStr());
                return;
            }
            return;
        }
        String dateYYYYMMddLocalFormat = TimeDateUtil.getDateYYYYMMddLocalFormat(latestItem.getTime() * ((long) 1000));
        String strValueOf = String.valueOf(latestItem.getVo2Max());
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s %s", Arrays.copyOf(new Object[]{strValueOf, getString(c0j.Oo)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        DataTitleView dataTitleView3 = this.dataTitleView;
        if (dataTitleView3 != null) {
            dataTitleView3.a(requireContext(), str, strValueOf, dateYYYYMMddLocalFormat);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    private final void refreshDetailCard() {
        int i;
        DailyVo2MaxReport dailyVo2MaxReport = this.vo2MaxReport;
        int i2 = 0;
        if (dailyVo2MaxReport == null) {
            View view = this.mDetailCard;
            if (view != null) {
                ViewExtKt.setVisible(view, false);
                return;
            }
            return;
        }
        Intrinsics.checkNotNull(dailyVo2MaxReport);
        List<TimesDataRecordInt> vo2MaxList = dailyVo2MaxReport.getVo2MaxList();
        if (vo2MaxList == null || ArrayUtils.isEmpty(vo2MaxList)) {
            View view2 = this.mDetailCard;
            if (view2 != null) {
                ViewExtKt.setVisible(view2, false);
                return;
            }
            return;
        }
        View view3 = this.mDetailCard;
        if (view3 != null) {
            ViewExtKt.setVisible(view3, true);
        }
        int[] valueArray = vo2MaxList.get(0).getValueArray();
        if (valueArray == null) {
            i = 0;
        } else {
            if (!(valueArray.length == 0)) {
                i = valueArray[0];
            } else {
                i = 0;
            }
        }
        int[] valueArray2 = vo2MaxList.get(vo2MaxList.size() - 1).getValueArray();
        if (valueArray2 != null) {
            if (true ^ (valueArray2.length == 0)) {
                i2 = valueArray2[0];
            }
        }
        int i3 = i2 - i;
        DailyVo2MaxReport dailyVo2MaxReport2 = this.vo2MaxReport;
        Intrinsics.checkNotNull(dailyVo2MaxReport2);
        Vo2MaxItem latestItem = dailyVo2MaxReport2.getLatestItem();
        Intrinsics.checkNotNull(latestItem);
        DailyVo2MaxReport dailyVo2MaxReport3 = this.vo2MaxReport;
        Intrinsics.checkNotNull(dailyVo2MaxReport3);
        refreshDetailCard(latestItem, i3, dailyVo2MaxReport3.getTag());
    }

    private final void refreshLineChart() {
        DailyVo2MaxReport dailyVo2MaxReport = this.vo2MaxReport;
        if (dailyVo2MaxReport == null) {
            LocalDate localDate = this.mCurrentLocalDate;
            Intrinsics.checkNotNull(localDate);
            dailyVo2MaxReport = new DailyVo2MaxReport(TimeDateUtil.changZeroOfTheDay(localDate), BarChartRecyclerHelper.INSTANCE.getViewTag(getFragmentPosition()));
        }
        VO2MaxDataUtil vO2MaxDataUtil = VO2MaxDataUtil.INSTANCE;
        vfe vfeVar = this.mBarChartAttrs;
        Intrinsics.checkNotNull(vfeVar);
        List<MaxMinEntry> listFillWeekMonthMaxMinEntry = vO2MaxDataUtil.fillWeekMonthMaxMinEntry(vfeVar, dailyVo2MaxReport, getFragmentPosition() == 1);
        List<MaxMinEntry> list = this.mEntries;
        Intrinsics.checkNotNull(list);
        list.clear();
        List<MaxMinEntry> list2 = this.mEntries;
        Intrinsics.checkNotNull(list2);
        list2.addAll(listFillWeekMonthMaxMinEntry);
        rtr rtrVar = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar);
        this.mYAxis = rtrVar.l(this.mYAxis, 100.0f);
        LineChartRecyclerView lineChartRecyclerView = this.mRecyclerChart;
        Intrinsics.checkNotNull(lineChartRecyclerView);
        lineChartRecyclerView.setYAxis(this.mYAxis);
        j9f j9fVar = this.mChartAdapter;
        Intrinsics.checkNotNull(j9fVar);
        j9fVar.notifyDataSetChanged();
    }

    private final void refreshView() {
        refreshLineChart();
        refreshDataTitleView();
        refreshDetailCard();
    }

    private final void requestData() {
        LocalDate localDate = this.mCurrentLocalDate;
        Intrinsics.checkNotNull(localDate);
        getMViewModel().triggerFetchFitnessReport(IVO2MaxRepository.class, BarChartRecyclerHelper.INSTANCE.getViewTag(getFragmentPosition()), TimeDateUtil.changZeroOfTheDay(localDate), 0, 0, "").observe(getViewLifecycleOwner(), new VO2MaxBaseWeekMonthFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: qmq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return VO2MaxBaseWeekMonthFragment.requestData$lambda$0(this.f31668a, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestData$lambda$0(VO2MaxBaseWeekMonthFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (ArrayUtils.isEmpty(list)) {
            this$0.vo2MaxReport = null;
        } else {
            DailyBasicReport dailyBasicReport = (DailyBasicReport) list.get(0);
            if (dailyBasicReport instanceof DailyVo2MaxReport) {
                this$0.vo2MaxReport = (DailyVo2MaxReport) dailyBasicReport;
            }
        }
        DailyVo2MaxReport dailyVo2MaxReport = this$0.vo2MaxReport;
        Logger.i(TAG, "vo2MaxReport:" + (dailyVo2MaxReport != null ? dailyVo2MaxReport.toString() : null));
        this$0.refreshView();
        return Unit.INSTANCE;
    }

    private final void updateLevelBarRecyclerViewMargin() {
        RecyclerView recyclerView = this.mLevelDescRecyclerView;
        if (recyclerView != null) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i = 18;
            marginLayoutParams.setMarginStart(ExtUtilsKt.getDp(18));
            Context context = getContext();
            if (context != null && UIUtils.INSTANCE.isTabletAndLandscape(context)) {
                i = 270;
            }
            marginLayoutParams.setMarginEnd(ExtUtilsKt.getDp(Integer.valueOf(i)));
            recyclerView.setLayoutParams(marginLayoutParams);
        }
    }

    private final void updateRecyclerDetailLayoutManager() {
        RecyclerView recyclerView;
        if (getMActivity() == null || this.mDetailAdapter == null || (recyclerView = this.mCardRecyclerDetail) == null) {
            return;
        }
        HealthUtil healthUtil = HealthUtil.INSTANCE;
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        opo opoVar = this.mDetailAdapter;
        Intrinsics.checkNotNull(opoVar);
        recyclerView.setLayoutManager(healthUtil.buildCommonDataAdapterLayoutManager(mActivity, opoVar));
    }

    @Nullable
    public final View getContainerView() {
        return this.containerView;
    }

    @Nullable
    public final DataTitleView getDataTitleView() {
        return this.dataTitleView;
    }

    public abstract int getFragmentPosition();

    @Nullable
    public final RecyclerView getMCardRecyclerDetail() {
        return this.mCardRecyclerDetail;
    }

    @Nullable
    public final View getMDetailCard() {
        return this.mDetailCard;
    }

    @Nullable
    public final LevelBarView getMLevelBarView() {
        return this.mLevelBarView;
    }

    @Nullable
    public final RecyclerView getMLevelDescRecyclerView() {
        return this.mLevelDescRecyclerView;
    }

    @Nullable
    public final LineChartRecyclerView getMRecyclerChart() {
        return this.mRecyclerChart;
    }

    @Nullable
    public final View getUnderstandCard() {
        return this.understandCard;
    }

    @Nullable
    public final DailyVo2MaxReport getVo2MaxReport() {
        return this.vo2MaxReport;
    }

    public abstract void initViewBinding();

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        updateRecyclerDetailLayoutManager();
        updateLevelBarRecyclerViewMargin();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        View view = this.containerView;
        if (view != null) {
            view.requestLayout();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        initBundle();
        Logger.i(TAG, "onViewCreated..mCurrentPosition-mCurrentDate:" + this.mCurrentLocalDate);
        initViewBinding();
        initView();
        requestData();
    }

    public final void setContainerView(@Nullable View view) {
        this.containerView = view;
    }

    public final void setDataTitleView(@Nullable DataTitleView dataTitleView) {
        this.dataTitleView = dataTitleView;
    }

    public final void setMCardRecyclerDetail(@Nullable RecyclerView recyclerView) {
        this.mCardRecyclerDetail = recyclerView;
    }

    public final void setMDetailCard(@Nullable View view) {
        this.mDetailCard = view;
    }

    public final void setMLevelBarView(@Nullable LevelBarView levelBarView) {
        this.mLevelBarView = levelBarView;
    }

    public final void setMLevelDescRecyclerView(@Nullable RecyclerView recyclerView) {
        this.mLevelDescRecyclerView = recyclerView;
    }

    public final void setMRecyclerChart(@Nullable LineChartRecyclerView lineChartRecyclerView) {
        this.mRecyclerChart = lineChartRecyclerView;
    }

    public final void setUnderstandCard(@Nullable View view) {
        this.understandCard = view;
    }

    public final void setVo2MaxReport(@Nullable DailyVo2MaxReport dailyVo2MaxReport) {
        this.vo2MaxReport = dailyVo2MaxReport;
    }

    private final void refreshDetailCard(Vo2MaxItem item, int indexChange, String tag) {
        Logger.i("VO2Max", "refreshDetailCard avg:" + item.getVo2Max() + "/indexChange:" + indexChange + "/tag:" + tag);
        int level = VO2MaxDataUtil.getLevel(item);
        LevelBarView levelBarView = this.mLevelBarView;
        if (levelBarView != null) {
            levelBarView.setLevel(level - 1);
        }
        VO2MaxDataUtil vO2MaxDataUtil = VO2MaxDataUtil.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        List<qpo> listCreateWeekMonthSummaryModelList = vO2MaxDataUtil.createWeekMonthSummaryModelList(contextRequireContext, level, indexChange, tag);
        List<qpo> list = this.mDataListDetail;
        Intrinsics.checkNotNull(list);
        list.clear();
        List<qpo> list2 = this.mDataListDetail;
        Intrinsics.checkNotNull(list2);
        list2.addAll(listCreateWeekMonthSummaryModelList);
        opo opoVar = this.mDetailAdapter;
        Intrinsics.checkNotNull(opoVar);
        opoVar.setHeaderViewTitle(qpo.a(tag));
        opo opoVar2 = this.mDetailAdapter;
        Intrinsics.checkNotNull(opoVar2);
        opoVar2.notifyDataChanged();
    }
}
