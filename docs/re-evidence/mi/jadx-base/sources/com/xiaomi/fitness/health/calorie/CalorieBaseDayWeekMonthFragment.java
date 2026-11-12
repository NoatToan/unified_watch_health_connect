package com.xiaomi.fitness.health.calorie;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.api.repository.ICalorieRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyCalorieReport;
import com.xiaomi.fitness.base.BasicDataViewModel;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.recycer.BarChartRecyclerHelper;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.data.valueformatter.DayCalorieHighLightMarkValueFormatter;
import com.xiaomi.fitness.health.calorie.CalorieBaseDayWeekMonthFragment;
import com.xiaomi.fitness.util.CalorieDataUtil;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.view.DataTitleView;
import defpackage.bl5;
import defpackage.c0j;
import defpackage.hak;
import defpackage.onq;
import defpackage.opo;
import defpackage.pni;
import defpackage.q02;
import defpackage.qb3;
import defpackage.qpo;
import defpackage.qxi;
import defpackage.r02;
import defpackage.rtr;
import defpackage.s02;
import defpackage.vqr;
import defpackage.xcm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b&\u0018\u0000 n*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\u0001nB\u0007¢\u0006\u0004\bm\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\bJ!\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H&¢\u0006\u0004\b \u0010\bJ\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R$\u0010'\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010.\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00105\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001e\u0010=\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u001e\u0010@\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR$\u0010O\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u001e\u0010Y\u001a\n\u0012\u0004\u0012\u00020X\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010AR\u0018\u0010[\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R$\u0010^\u001a\u0004\u0018\u00010]8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010d\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u0014\u0010l\u001a\u00020\u00198$X¤\u0004¢\u0006\u0006\u001a\u0004\bj\u0010k¨\u0006o"}, d2 = {"Lcom/xiaomi/fitness/health/calorie/CalorieBaseDayWeekMonthFragment;", "Lcom/xiaomi/fitness/base/BasicDataViewModel;", "VM", "Landroidx/databinding/ViewDataBinding;", "VDB", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "", Constants.KEY_REQUEST_DATA, "()V", "refreshView", "refreshDataTitleView", "refreshDetailCard", "refreshBarChart", "initView", "initBarChart", "initDetailCard", "updateRecyclerDetailLayoutManager", "initBundle", LifecycleConstantKt.ON_RESUME, "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "position", "Lorg/joda/time/LocalDate;", "localDate", "", "getTitleDesc", "(ILorg/joda/time/LocalDate;)Ljava/lang/String;", "initViewBinding", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "mCurrentLocalDate", "Lorg/joda/time/LocalDate;", "containerView", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "setContainerView", "(Landroid/view/View;)V", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "recyclerView", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "getRecyclerView", "()Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "setRecyclerView", "(Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;)V", "Lcom/xiaomi/fitness/view/DataTitleView;", "dataTitleView", "Lcom/xiaomi/fitness/view/DataTitleView;", "getDataTitleView", "()Lcom/xiaomi/fitness/view/DataTitleView;", "setDataTitleView", "(Lcom/xiaomi/fitness/view/DataTitleView;)V", "Lq02;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "mBarChartAdapter", "Lq02;", "", "mEntries", "Ljava/util/List;", "Ls02;", "mItemDecoration", "Ls02;", "Lr02;", "mBarChartAttrs", "Lr02;", "Lrtr;", "mYAxis", "Lrtr;", "Lvqr;", "mXAxis", "Lvqr;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerCalorieDetail", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerCalorieDetail", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerCalorieDetail", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lopo;", "mDetailAdapter", "Lopo;", "Lqpo;", "mDataListDetail", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyCalorieReport;", "calorieReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyCalorieReport;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "understandCard", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getUnderstandCard", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setUnderstandCard", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "oneTrackReportData", "Ljava/lang/String;", "getOneTrackReportData", "()Ljava/lang/String;", "setOneTrackReportData", "(Ljava/lang/String;)V", "getFragmentPosition", "()I", "fragmentPosition", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class CalorieBaseDayWeekMonthFragment<VM extends BasicDataViewModel, VDB extends ViewDataBinding> extends BaseBindingFragment<VM, VDB> {

    @NotNull
    public static final String TAG = "MiHealth:calories";

    @Nullable
    private DailyCalorieReport calorieReport;

    @Nullable
    private View containerView;

    @Nullable
    private DataTitleView dataTitleView;

    @Nullable
    private q02<RecyclerBarEntry> mBarChartAdapter;

    @Nullable
    private r02 mBarChartAttrs;

    @Nullable
    private LocalDate mCurrentLocalDate;

    @Nullable
    private List<qpo> mDataListDetail;

    @Nullable
    private opo mDetailAdapter;

    @Nullable
    private List<RecyclerBarEntry> mEntries;

    @Nullable
    private s02 mItemDecoration;

    @Nullable
    private vqr mXAxis;

    @Nullable
    private rtr mYAxis;

    @NotNull
    private String oneTrackReportData = "0";

    @Nullable
    private RecyclerView recyclerCalorieDetail;

    @Nullable
    private BarChartRecyclerView recyclerView;

    @Nullable
    private ConstraintLayout understandCard;

    private final void initBarChart() {
        onq qb3Var;
        BarChartRecyclerView barChartRecyclerView = this.recyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView);
        r02 r02Var = (r02) barChartRecyclerView.mAttrs;
        this.mBarChartAttrs = r02Var;
        Intrinsics.checkNotNull(r02Var);
        int i = r02Var.c;
        BarChartRecyclerHelper barChartRecyclerHelper = BarChartRecyclerHelper.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        onq onqVarCreateXAxisFormatter = barChartRecyclerHelper.createXAxisFormatter(contextRequireContext, getFragmentPosition());
        this.mEntries = new ArrayList();
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(getActivity(), this.mBarChartAttrs);
        this.mYAxis = new rtr(this.mBarChartAttrs);
        vqr vqrVar = new vqr(this.mBarChartAttrs, i);
        this.mXAxis = vqrVar;
        Intrinsics.checkNotNull(vqrVar);
        vqrVar.setValueFormatter(onqVarCreateXAxisFormatter);
        if (getFragmentPosition() == 0) {
            this.mItemDecoration = new s02(this.mYAxis, this.mXAxis, this.mBarChartAttrs);
            qb3Var = new DayCalorieHighLightMarkValueFormatter(getMActivity());
            s02 s02Var = this.mItemDecoration;
            Intrinsics.checkNotNull(s02Var);
            s02Var.setHighLightValueFormatter(qb3Var);
            BarChartRecyclerView barChartRecyclerView2 = this.recyclerView;
            Intrinsics.checkNotNull(barChartRecyclerView2);
            s02 s02Var2 = this.mItemDecoration;
            Intrinsics.checkNotNull(s02Var2);
            barChartRecyclerView2.addItemDecoration(s02Var2);
        } else {
            this.mItemDecoration = new s02(this.mYAxis, this.mXAxis, this.mBarChartAttrs);
            qb3Var = new qb3(getMActivity());
            s02 s02Var3 = this.mItemDecoration;
            Intrinsics.checkNotNull(s02Var3);
            s02Var3.setHighLightValueFormatter(qb3Var);
            BarChartRecyclerView barChartRecyclerView3 = this.recyclerView;
            Intrinsics.checkNotNull(barChartRecyclerView3);
            s02 s02Var4 = this.mItemDecoration;
            Intrinsics.checkNotNull(s02Var4);
            barChartRecyclerView3.addItemDecoration(s02Var4);
        }
        this.mBarChartAdapter = new q02<>(getMActivity(), this.mEntries, this.recyclerView, this.mXAxis, this.mBarChartAttrs, qb3Var);
        BarChartRecyclerView barChartRecyclerView4 = this.recyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView4);
        barChartRecyclerView4.setAdapter(this.mBarChartAdapter);
        BarChartRecyclerView barChartRecyclerView5 = this.recyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView5);
        barChartRecyclerView5.setLayoutManager(speedRatioLayoutManager);
        BarChartRecyclerView barChartRecyclerView6 = this.recyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView6);
        barChartRecyclerView6.setNestedScrollingEnabled(false);
        hak hakVar = new hak(getActivity(), this.recyclerView, new xcm(this) { // from class: com.xiaomi.fitness.health.calorie.CalorieBaseDayWeekMonthFragment$initBarChart$itemGestureListener$1
            final /* synthetic */ CalorieBaseDayWeekMonthFragment<VM, VDB> this$0;

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
        BarChartRecyclerView barChartRecyclerView7 = this.recyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView7);
        barChartRecyclerView7.addOnItemTouchListener(hakVar);
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
        bl5 bl5Var = new bl5();
        RecyclerView recyclerView = this.recyclerCalorieDetail;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.addItemDecoration(bl5Var);
        this.mDetailAdapter = new opo(getMActivity(), this.mDataListDetail, c0j.I6, pni.x3);
        updateRecyclerDetailLayoutManager();
        RecyclerView recyclerView2 = this.recyclerCalorieDetail;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setAdapter(this.mDetailAdapter);
        RecyclerView recyclerView3 = this.recyclerCalorieDetail;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setHasFixedSize(true);
    }

    private final void initView() {
        initBarChart();
        initDetailCard();
        ConstraintLayout constraintLayout = this.understandCard;
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: hb3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CalorieBaseDayWeekMonthFragment.initView$lambda$1(this.f19897a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(CalorieBaseDayWeekMonthFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseFragmentExKt.gotoPage(this$0, CalorieUnderstandFragment.class, null);
    }

    private final void refreshBarChart() {
        List<RecyclerBarEntry> listCreateDayEntries;
        DailyCalorieReport dailyCalorieReport = this.calorieReport;
        if (dailyCalorieReport == null) {
            String viewTag = BarChartRecyclerHelper.INSTANCE.getViewTag(getFragmentPosition());
            LocalDate localDate = this.mCurrentLocalDate;
            Intrinsics.checkNotNull(localDate);
            dailyCalorieReport = new DailyCalorieReport(viewTag, TimeDateUtil.changZeroOfTheDay(localDate));
        }
        int fragmentPosition = getFragmentPosition();
        if (fragmentPosition == 0) {
            CalorieDataUtil calorieDataUtil = CalorieDataUtil.INSTANCE;
            r02 r02Var = this.mBarChartAttrs;
            Intrinsics.checkNotNull(r02Var);
            listCreateDayEntries = calorieDataUtil.createDayEntries(r02Var, dailyCalorieReport);
        } else if (fragmentPosition == 1) {
            listCreateDayEntries = CalorieDataUtil.INSTANCE.createWeekEntries2(dailyCalorieReport);
        } else if (fragmentPosition != 2) {
            listCreateDayEntries = Collections.emptyList();
            Intrinsics.checkNotNullExpressionValue(listCreateDayEntries, "emptyList(...)");
        } else {
            listCreateDayEntries = CalorieDataUtil.INSTANCE.createMonthEntries2(dailyCalorieReport, this.mBarChartAttrs);
        }
        List<RecyclerBarEntry> list = this.mEntries;
        Intrinsics.checkNotNull(list);
        list.clear();
        List<RecyclerBarEntry> list2 = this.mEntries;
        Intrinsics.checkNotNull(list2);
        list2.addAll(listCreateDayEntries);
        float theMaxNumber = HealthUtil.getTheMaxNumber(listCreateDayEntries);
        rtr rtrVar = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar);
        rtr rtrVarL = rtrVar.l(this.mYAxis, theMaxNumber);
        if (rtrVarL != null) {
            this.mYAxis = rtrVarL;
            s02 s02Var = this.mItemDecoration;
            Intrinsics.checkNotNull(s02Var);
            s02Var.setYAxis(this.mYAxis);
            q02<RecyclerBarEntry> q02Var = this.mBarChartAdapter;
            Intrinsics.checkNotNull(q02Var);
            q02Var.setYAxis(this.mYAxis);
        }
        q02<RecyclerBarEntry> q02Var2 = this.mBarChartAdapter;
        Intrinsics.checkNotNull(q02Var2);
        q02Var2.notifyDataSetChanged();
    }

    private final void refreshDataTitleView() {
        if (this.calorieReport == null) {
            this.oneTrackReportData = "0";
            DataTitleView dataTitleView = this.dataTitleView;
            if (dataTitleView != null) {
                dataTitleView.c(getString(c0j.L6));
                return;
            }
            return;
        }
        this.oneTrackReportData = "1";
        int fragmentPosition = getFragmentPosition();
        DailyCalorieReport dailyCalorieReport = this.calorieReport;
        Intrinsics.checkNotNull(dailyCalorieReport);
        String titleDesc = getTitleDesc(fragmentPosition, TimeDateUtil.timestampToLocalDate(dailyCalorieReport.getTime()));
        Resources resources = requireContext().getResources();
        int i = qxi.s;
        DailyCalorieReport dailyCalorieReport2 = this.calorieReport;
        Intrinsics.checkNotNull(dailyCalorieReport2);
        int calories = dailyCalorieReport2.getCalories();
        DailyCalorieReport dailyCalorieReport3 = this.calorieReport;
        Intrinsics.checkNotNull(dailyCalorieReport3);
        String quantityString = resources.getQuantityString(i, calories, Integer.valueOf(dailyCalorieReport3.getCalories()));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        DailyCalorieReport dailyCalorieReport4 = this.calorieReport;
        Intrinsics.checkNotNull(dailyCalorieReport4);
        String strValueOf = String.valueOf(dailyCalorieReport4.getCalories());
        DataTitleView dataTitleView2 = this.dataTitleView;
        if (dataTitleView2 != null) {
            dataTitleView2.a(requireContext(), quantityString, strValueOf, titleDesc);
        }
    }

    private final void refreshDetailCard() {
        DailyCalorieReport dailyCalorieReport = this.calorieReport;
        if (dailyCalorieReport == null || dailyCalorieReport == null) {
            RecyclerView recyclerView = this.recyclerCalorieDetail;
            Intrinsics.checkNotNull(recyclerView);
            recyclerView.setVisibility(8);
            return;
        }
        CalorieDataUtil calorieDataUtil = CalorieDataUtil.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        DailyCalorieReport dailyCalorieReport2 = this.calorieReport;
        Intrinsics.checkNotNull(dailyCalorieReport2);
        List<qpo> listCreateSummaryModelList = calorieDataUtil.createSummaryModelList(contextRequireContext, dailyCalorieReport2, getFragmentPosition());
        if (listCreateSummaryModelList != null) {
            List<qpo> list = listCreateSummaryModelList;
            if (!list.isEmpty()) {
                RecyclerView recyclerView2 = this.recyclerCalorieDetail;
                Intrinsics.checkNotNull(recyclerView2);
                recyclerView2.setVisibility(0);
                List<qpo> list2 = this.mDataListDetail;
                Intrinsics.checkNotNull(list2);
                list2.clear();
                List<qpo> list3 = this.mDataListDetail;
                Intrinsics.checkNotNull(list3);
                list3.addAll(list);
                opo opoVar = this.mDetailAdapter;
                Intrinsics.checkNotNull(opoVar);
                DailyCalorieReport dailyCalorieReport3 = this.calorieReport;
                Intrinsics.checkNotNull(dailyCalorieReport3);
                opoVar.setHeaderViewTitle(qpo.a(dailyCalorieReport3.getTag()));
                opo opoVar2 = this.mDetailAdapter;
                Intrinsics.checkNotNull(opoVar2);
                opoVar2.notifyDataChanged();
                return;
            }
        }
        RecyclerView recyclerView3 = this.recyclerCalorieDetail;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setVisibility(8);
    }

    private final void refreshView() {
        refreshBarChart();
        refreshDetailCard();
        refreshDataTitleView();
    }

    private final void requestData() {
        LocalDate localDate = this.mCurrentLocalDate;
        Intrinsics.checkNotNull(localDate);
        getMViewModel().triggerFetchFitnessReport(ICalorieRepository.class, BarChartRecyclerHelper.INSTANCE.getViewTag(getFragmentPosition()), TimeDateUtil.changZeroOfTheDay(localDate), 0, 0, "").observe(getViewLifecycleOwner(), new CalorieBaseDayWeekMonthFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: gb3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CalorieBaseDayWeekMonthFragment.requestData$lambda$0(this.f18794a, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestData$lambda$0(CalorieBaseDayWeekMonthFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (ArrayUtils.isEmpty(list)) {
            this$0.calorieReport = null;
        } else {
            DailyBasicReport dailyBasicReport = (DailyBasicReport) list.get(0);
            if (dailyBasicReport instanceof DailyCalorieReport) {
                this$0.calorieReport = (DailyCalorieReport) dailyBasicReport;
            }
        }
        this$0.refreshView();
        return Unit.INSTANCE;
    }

    private final void updateRecyclerDetailLayoutManager() {
        RecyclerView recyclerView;
        if (getMActivity() == null || this.mDetailAdapter == null || (recyclerView = this.recyclerCalorieDetail) == null) {
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

    @NotNull
    public final String getOneTrackReportData() {
        return this.oneTrackReportData;
    }

    @Nullable
    public final RecyclerView getRecyclerCalorieDetail() {
        return this.recyclerCalorieDetail;
    }

    @Nullable
    public final BarChartRecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    @Nullable
    public String getTitleDesc(int position, @Nullable LocalDate localDate) {
        if (position == 0) {
            return TimeDateUtil.getDateYYYYMMddLocalFormat(localDate);
        }
        if (position == 1) {
            Intrinsics.checkNotNull(localDate);
            return HealthUtil.getWeekDateStr(localDate);
        }
        if (position != 2) {
            return "";
        }
        Intrinsics.checkNotNull(localDate);
        return TimeDateUtil.getDateYYYYMMLocalFormat(localDate);
    }

    @Nullable
    public final ConstraintLayout getUnderstandCard() {
        return this.understandCard;
    }

    public abstract void initViewBinding();

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        updateRecyclerDetailLayoutManager();
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
        initViewBinding();
        Logger.i("MiHealth:calories", "onViewCreated..mCurrentPosition-mCurrentDate:" + this.mCurrentLocalDate);
        initView();
        requestData();
    }

    public final void setContainerView(@Nullable View view) {
        this.containerView = view;
    }

    public final void setDataTitleView(@Nullable DataTitleView dataTitleView) {
        this.dataTitleView = dataTitleView;
    }

    public final void setOneTrackReportData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.oneTrackReportData = str;
    }

    public final void setRecyclerCalorieDetail(@Nullable RecyclerView recyclerView) {
        this.recyclerCalorieDetail = recyclerView;
    }

    public final void setRecyclerView(@Nullable BarChartRecyclerView barChartRecyclerView) {
        this.recyclerView = barChartRecyclerView;
    }

    public final void setUnderstandCard(@Nullable ConstraintLayout constraintLayout) {
        this.understandCard = constraintLayout;
    }
}
