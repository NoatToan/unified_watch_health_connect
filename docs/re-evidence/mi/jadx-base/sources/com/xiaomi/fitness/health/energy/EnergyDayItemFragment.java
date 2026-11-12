package com.xiaomi.fitness.health.energy;

import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.api.repository.IEnergyRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyEnergyReport;
import com.xiaomi.fit.fitness.export.data.item.EnergyItem;
import com.xiaomi.fit.fitness.export.data.item.FitnessDeviceItem;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.model.EnergyEntry;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.devicelist.SportsDeviceListView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.data.valueformatter.DayEnergyHighLightMarkValueFormatter;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.energy.EnergyDayItemFragment;
import com.xiaomi.fitness.statistics.OneTrackReportAspect;
import com.xiaomi.fitness.statistics.export.annotation.OneTrackReport;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.view.DataTitleView;
import com.xiaomi.fitness.view.DispatchMaskDownLinearLayout;
import defpackage.bl5;
import defpackage.c0j;
import defpackage.gl8;
import defpackage.hak;
import defpackage.j9f;
import defpackage.ja8;
import defpackage.jui;
import defpackage.ma8;
import defpackage.na8;
import defpackage.nrd;
import defpackage.opo;
import defpackage.pni;
import defpackage.qpo;
import defpackage.r02;
import defpackage.s69;
import defpackage.t5a;
import defpackage.vfe;
import defpackage.vnq;
import defpackage.vqr;
import defpackage.xcm;
import defpackage.xqr;
import defpackage.yfe;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 t2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001tB\u0007¢\u0006\u0004\bs\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0006J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0006J\u000f\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0006J\u000f\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u0006J!\u0010 \u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\"\u0010\u0006J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R \u00104\u001a\f\u0012\u0006\u0012\u0004\u0018\u000103\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001c\u0010:\u001a\b\u0012\u0002\b\u0003\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u001e\u0010F\u001a\n\u0012\u0004\u0012\u00020E\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u00105R\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001c\u0010J\u001a\b\u0012\u0002\b\u0003\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010;R\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010N\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010>R\u0018\u0010P\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u001e\u0010Y\u001a\n\u0012\u0004\u0012\u00020X\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u00105R\u001c\u0010\\\u001a\b\u0012\u0004\u0012\u00020[0Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010_\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u0010b\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010d\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010g\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010j\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\"\u0010m\u001a\u000e\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020i0l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010r\u001a\u00020o8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010q¨\u0006u"}, d2 = {"Lcom/xiaomi/fitness/health/energy/EnergyDayItemFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/energy/EnergyViewModel;", "Lt5a;", "", "initViewBinding", "()V", Constants.KEY_REQUEST_DATA, "", "Lcom/xiaomi/fit/fitness/export/data/item/FitnessDeviceItem;", "deviceList", "onDeviceListChanged", "(Ljava/util/List;)V", "cleanDataList", "refreshViewIfNeed", "refreshDataTitleView", "refreshDetailCard", "refreshBottomBarChart", "refreshTopLineChart", "initView", "initDetailCard", "updateRecyclerDetailLayoutManager", "initBottomBarChart", "initTopLineChart", "initDeviceViewCard", "initUnderstandCard", "initBundle", LifecycleConstantKt.ON_RESUME, "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onInvisible", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "containerView", "Landroid/view/View;", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "mEnergyChart", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "Lvfe;", "mEnergyChartAttrs", "Lvfe;", "Lj9f;", "mEnergyChartAdapter", "Lj9f;", "", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "mEnergyEntries", "Ljava/util/List;", "Lcom/xiaomi/fitness/view/DataTitleView;", "dataTitleView", "Lcom/xiaomi/fitness/view/DataTitleView;", "Lvnq;", "mEnergyYAxis", "Lvnq;", "Lvqr;", "mEnergyXAxis", "Lvqr;", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "mBottomBarChart", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "Lma8;", "mBottomBarChartAdapter", "Lma8;", "Lcom/xiaomi/fitness/chart/entrys/model/EnergyEntry;", "mBottomBarEntries", "Lja8;", "mBottomChartItemDecoration", "Lja8;", "mBottomChartYAxis", "Lr02;", "mBottomBarChartAttrs", "Lr02;", "mBottomChartXAxis", "Lcom/xiaomi/fitness/view/DispatchMaskDownLinearLayout;", "maskDownLinearLayout", "Lcom/xiaomi/fitness/view/DispatchMaskDownLinearLayout;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerEnergyDetail", "Landroidx/recyclerview/widget/RecyclerView;", "Lopo;", "mDetailAdapter", "Lopo;", "Lqpo;", "mDataListDetail", "", "", "mDeviceSidSet", "Ljava/util/Set;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "understandCard", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/xiaomi/fitness/common/devicelist/SportsDeviceListView;", "mDeviceListView", "Lcom/xiaomi/fitness/common/devicelist/SportsDeviceListView;", "mSid", "Ljava/lang/String;", "Lorg/joda/time/LocalDate;", "mCurrentLocalDate", "Lorg/joda/time/LocalDate;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyEnergyReport;", "mEnergyReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyEnergyReport;", "", "mSidReportMap", "Ljava/util/Map;", "", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEnergyDayItemFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnergyDayItemFragment.kt\ncom/xiaomi/fitness/health/energy/EnergyDayItemFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,415:1\n1863#2,2:416\n1863#2,2:418\n1863#2,2:421\n1#3:420\n*S KotlinDebug\n*F\n+ 1 EnergyDayItemFragment.kt\ncom/xiaomi/fitness/health/energy/EnergyDayItemFragment\n*L\n174#1:416,2\n179#1:418,2\n142#1:421,2\n*E\n"})
public final class EnergyDayItemFragment extends Hilt_EnergyDayItemFragment<EnergyViewModel, t5a> {

    @NotNull
    public static final String TAG = "MiHealth:energy";
    private static /* synthetic */ Annotation ajc$anno$0;
    private static /* synthetic */ nrd.a ajc$tjp_0;

    @Nullable
    private View containerView;

    @Nullable
    private DataTitleView dataTitleView;

    @Nullable
    private BarChartRecyclerView mBottomBarChart;

    @Nullable
    private ma8 mBottomBarChartAdapter;

    @Nullable
    private r02 mBottomBarChartAttrs;

    @Nullable
    private List<EnergyEntry> mBottomBarEntries;

    @Nullable
    private ja8 mBottomChartItemDecoration;

    @Nullable
    private vqr mBottomChartXAxis;

    @Nullable
    private vnq<?> mBottomChartYAxis;

    @Nullable
    private LocalDate mCurrentLocalDate;

    @Nullable
    private List<qpo> mDataListDetail;

    @Nullable
    private opo mDetailAdapter;

    @Nullable
    private SportsDeviceListView mDeviceListView;

    @Nullable
    private LineChartRecyclerView mEnergyChart;

    @Nullable
    private j9f mEnergyChartAdapter;

    @Nullable
    private vfe mEnergyChartAttrs;

    @Nullable
    private List<MaxMinEntry> mEnergyEntries;

    @Nullable
    private DailyEnergyReport mEnergyReport;

    @Nullable
    private vqr mEnergyXAxis;

    @Nullable
    private vnq<?> mEnergyYAxis;

    @Nullable
    private String mSid;

    @Nullable
    private DispatchMaskDownLinearLayout maskDownLinearLayout;

    @Nullable
    private RecyclerView recyclerEnergyDetail;

    @Nullable
    private ConstraintLayout understandCard;

    @NotNull
    private Set<String> mDeviceSidSet = new HashSet();

    @NotNull
    private Map<String, DailyEnergyReport> mSidReportMap = new HashMap();

    static {
        ajc$preClinit();
        INSTANCE = new Companion(null);
    }

    private static /* synthetic */ void ajc$preClinit() {
        s69 s69Var = new s69("EnergyDayItemFragment.kt", EnergyDayItemFragment.class);
        ajc$tjp_0 = s69Var.h("method-execution", s69Var.g("4", "onInvisible", "com.xiaomi.fitness.health.energy.EnergyDayItemFragment", "", "", "", "void"), 0);
    }

    private final void cleanDataList() {
        this.mEnergyReport = null;
        this.mSidReportMap.clear();
        this.mDeviceSidSet.clear();
    }

    private final void initBottomBarChart() {
        BarChartRecyclerView barChartRecyclerView = this.mBottomBarChart;
        Intrinsics.checkNotNull(barChartRecyclerView);
        r02 r02Var = (r02) barChartRecyclerView.mAttrs;
        this.mBottomBarChartAttrs = r02Var;
        Intrinsics.checkNotNull(r02Var);
        int i = r02Var.c;
        this.mBottomBarEntries = new ArrayList();
        this.mBottomChartYAxis = vnq.q(this.mBottomBarChartAttrs, 100.0f, -100.0f, 2);
        this.mBottomChartXAxis = new vqr(this.mBottomBarChartAttrs, i, new xqr());
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(getActivity(), this.mBottomBarChartAttrs);
        this.mBottomChartItemDecoration = new ja8(this.mBottomChartYAxis, this.mBottomChartXAxis, this.mBottomBarChartAttrs);
        BarChartRecyclerView barChartRecyclerView2 = this.mBottomBarChart;
        Intrinsics.checkNotNull(barChartRecyclerView2);
        ja8 ja8Var = this.mBottomChartItemDecoration;
        Intrinsics.checkNotNull(ja8Var);
        barChartRecyclerView2.addItemDecoration(ja8Var);
        this.mBottomBarChartAdapter = new ma8(getActivity(), this.mBottomBarEntries, this.mBottomBarChart, this.mBottomChartXAxis, this.mBottomBarChartAttrs);
        BarChartRecyclerView barChartRecyclerView3 = this.mBottomBarChart;
        Intrinsics.checkNotNull(barChartRecyclerView3);
        barChartRecyclerView3.setLayoutManager(speedRatioLayoutManager);
        BarChartRecyclerView barChartRecyclerView4 = this.mBottomBarChart;
        Intrinsics.checkNotNull(barChartRecyclerView4);
        barChartRecyclerView4.setNestedScrollingEnabled(false);
        BarChartRecyclerView barChartRecyclerView5 = this.mBottomBarChart;
        Intrinsics.checkNotNull(barChartRecyclerView5);
        barChartRecyclerView5.setAdapter(this.mBottomBarChartAdapter);
        DispatchMaskDownLinearLayout dispatchMaskDownLinearLayout = this.maskDownLinearLayout;
        Intrinsics.checkNotNull(dispatchMaskDownLinearLayout);
        dispatchMaskDownLinearLayout.a(this.mEnergyChart, this.mBottomBarChart);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    private final void initBundle() {
        LocalDate localDateNow;
        Bundle arguments = getArguments();
        Integer numValueOf = arguments != null ? Integer.valueOf(arguments.getInt("offset", 0)) : null;
        if (numValueOf != null) {
            localDateNow = LocalDate.now().minusDays(numValueOf.intValue());
            if (localDateNow == null) {
                localDateNow = LocalDate.now();
            }
        } else {
            localDateNow = LocalDate.now();
        }
        this.mCurrentLocalDate = localDateNow;
        if (localDateNow == null) {
            this.mCurrentLocalDate = LocalDate.now();
        }
        Bundle arguments2 = getArguments();
        this.mSid = arguments2 != null ? arguments2.getString("sid") : null;
    }

    private final void initDetailCard() {
        this.mDataListDetail = new ArrayList();
        RecyclerView recyclerView = this.recyclerEnergyDetail;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.addItemDecoration(new bl5());
        this.mDetailAdapter = new opo(getMActivity(), this.mDataListDetail, c0j.I6, pni.N1);
        updateRecyclerDetailLayoutManager();
        RecyclerView recyclerView2 = this.recyclerEnergyDetail;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setAdapter(this.mDetailAdapter);
        RecyclerView recyclerView3 = this.recyclerEnergyDetail;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setHasFixedSize(true);
    }

    private final void initDeviceViewCard() {
        SportsDeviceListView sportsDeviceListView = this.mDeviceListView;
        if (sportsDeviceListView != null) {
            sportsDeviceListView.refreshCurrentSid(this.mSid);
        }
        SportsDeviceListView sportsDeviceListView2 = this.mDeviceListView;
        if (sportsDeviceListView2 != null) {
            sportsDeviceListView2.refreshIcon(pni.M1);
        }
        SportsDeviceListView sportsDeviceListView3 = this.mDeviceListView;
        if (sportsDeviceListView3 != null) {
            sportsDeviceListView3.setDeviceSelectedListener(new SportsDeviceListView.DeviceSelectedListener() { // from class: com.xiaomi.fitness.health.energy.EnergyDayItemFragment.initDeviceViewCard.1
                @Override // com.xiaomi.fitness.common.devicelist.SportsDeviceListView.DeviceSelectedListener
                public void deviceSelected(String did, boolean isClick) {
                    Intrinsics.checkNotNullParameter(did, "did");
                    EnergyDayItemFragment.this.mSid = did;
                    Logger.i("MiHealth:energy", "数据源切换:" + did);
                    EnergyDayItemFragment.this.refreshViewIfNeed();
                }
            });
        }
    }

    private final void initTopLineChart() {
        LineChartRecyclerView lineChartRecyclerView = this.mEnergyChart;
        Intrinsics.checkNotNull(lineChartRecyclerView);
        vfe vfeVar = (vfe) lineChartRecyclerView.mAttrs;
        this.mEnergyChartAttrs = vfeVar;
        Intrinsics.checkNotNull(vfeVar);
        int i = vfeVar.c;
        this.mEnergyEntries = new ArrayList();
        this.mEnergyYAxis = vnq.o(this.mEnergyChartAttrs, 100.0f);
        this.mEnergyXAxis = new vqr(this.mEnergyChartAttrs, i, new xqr());
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(getActivity(), this.mEnergyChartAttrs);
        yfe yfeVar = new yfe(this.mEnergyYAxis, this.mEnergyXAxis, this.mEnergyChartAttrs);
        DayEnergyHighLightMarkValueFormatter dayEnergyHighLightMarkValueFormatter = new DayEnergyHighLightMarkValueFormatter(0);
        yfeVar.setHighLightValueFormatter(dayEnergyHighLightMarkValueFormatter);
        LineChartRecyclerView lineChartRecyclerView2 = this.mEnergyChart;
        Intrinsics.checkNotNull(lineChartRecyclerView2);
        lineChartRecyclerView2.addItemDecoration(yfeVar);
        this.mEnergyChartAdapter = new j9f(getActivity(), this.mEnergyEntries, this.mEnergyChart, this.mEnergyXAxis, this.mEnergyChartAttrs, dayEnergyHighLightMarkValueFormatter);
        LineChartRecyclerView lineChartRecyclerView3 = this.mEnergyChart;
        Intrinsics.checkNotNull(lineChartRecyclerView3);
        lineChartRecyclerView3.setAdapter(this.mEnergyChartAdapter);
        LineChartRecyclerView lineChartRecyclerView4 = this.mEnergyChart;
        Intrinsics.checkNotNull(lineChartRecyclerView4);
        lineChartRecyclerView4.setLayoutManager(speedRatioLayoutManager);
        LineChartRecyclerView lineChartRecyclerView5 = this.mEnergyChart;
        Intrinsics.checkNotNull(lineChartRecyclerView5);
        lineChartRecyclerView5.setNestedScrollingEnabled(false);
        hak hakVar = new hak(getActivity(), this.mEnergyChart, new xcm() { // from class: com.xiaomi.fitness.health.energy.EnergyDayItemFragment$initTopLineChart$itemGestureListener$1
            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                if (barEntry == null || !barEntry.isSelected()) {
                    DataTitleView dataTitleView = this.this$0.dataTitleView;
                    if (dataTitleView != null) {
                        dataTitleView.setVisibility(0);
                        return;
                    }
                    return;
                }
                DataTitleView dataTitleView2 = this.this$0.dataTitleView;
                if (dataTitleView2 != null) {
                    dataTitleView2.setVisibility(4);
                }
            }
        });
        LineChartRecyclerView lineChartRecyclerView6 = this.mEnergyChart;
        Intrinsics.checkNotNull(lineChartRecyclerView6);
        lineChartRecyclerView6.addOnItemTouchListener(hakVar);
    }

    private final void initUnderstandCard() {
        ConstraintLayout constraintLayout = this.understandCard;
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: oa8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EnergyDayItemFragment.initUnderstandCard$lambda$6(this.f28918a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initUnderstandCard$lambda$6(EnergyDayItemFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseFragmentExKt.gotoPage(this$0, EnergyUnderstandFragment.class, null);
    }

    private final void initView() {
        initTopLineChart();
        initBottomBarChart();
        initDetailCard();
        initDeviceViewCard();
        initUnderstandCard();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initViewBinding() {
        this.containerView = ((t5a) getMBinding()).D;
        this.mEnergyChart = ((t5a) getMBinding()).E;
        this.dataTitleView = ((t5a) getMBinding()).B;
        this.mBottomBarChart = ((t5a) getMBinding()).A;
        this.maskDownLinearLayout = ((t5a) getMBinding()).C;
        this.recyclerEnergyDetail = ((t5a) getMBinding()).F.A;
        this.mDeviceListView = ((t5a) getMBinding()).F.B;
        this.understandCard = ((t5a) getMBinding()).F.C;
    }

    private final void onDeviceListChanged(List<FitnessDeviceItem> deviceList) {
        this.mDeviceSidSet.clear();
        if (deviceList != null) {
            Iterator<T> it = deviceList.iterator();
            while (it.hasNext()) {
                this.mDeviceSidSet.add(((FitnessDeviceItem) it.next()).getSid());
            }
        }
        if (!CollectionsKt___CollectionsKt.contains(this.mDeviceSidSet, this.mSid)) {
            this.mSid = null;
            for (String str : this.mDeviceSidSet) {
                if (this.mSid == null) {
                    this.mSid = str;
                }
            }
        }
        SportsDeviceListView sportsDeviceListView = this.mDeviceListView;
        if (sportsDeviceListView != null) {
            sportsDeviceListView.updateDeviceSet(this.mDeviceSidSet);
        }
        if (!(!this.mDeviceSidSet.isEmpty())) {
            SportsDeviceListView sportsDeviceListView2 = this.mDeviceListView;
            if (sportsDeviceListView2 != null) {
                ViewExtKt.setVisible(sportsDeviceListView2, false);
                return;
            }
            return;
        }
        SportsDeviceListView sportsDeviceListView3 = this.mDeviceListView;
        if (sportsDeviceListView3 != null) {
            sportsDeviceListView3.refreshCurrentSid(this.mSid);
        }
        SportsDeviceListView sportsDeviceListView4 = this.mDeviceListView;
        if (sportsDeviceListView4 != null) {
            ViewExtKt.setVisible(sportsDeviceListView4, true);
        }
    }

    private final void refreshBottomBarChart() {
        List<EnergyEntry> listA;
        DailyEnergyReport dailyEnergyReport = this.mEnergyReport;
        if (dailyEnergyReport == null) {
            vfe vfeVar = this.mEnergyChartAttrs;
            LocalDate localDate = this.mCurrentLocalDate;
            Intrinsics.checkNotNull(localDate);
            listA = na8.a(vfeVar, new DailyEnergyReport(TimeDateUtil.changZeroOfTheDay(localDate), "days", ""));
        } else {
            listA = na8.a(this.mEnergyChartAttrs, dailyEnergyReport);
        }
        List<EnergyEntry> list = this.mBottomBarEntries;
        if (list != null) {
            list.clear();
        }
        List<EnergyEntry> list2 = this.mBottomBarEntries;
        if (list2 != null) {
            Intrinsics.checkNotNull(listA);
            list2.addAll(listA);
        }
        ma8 ma8Var = this.mBottomBarChartAdapter;
        if (ma8Var != null) {
            ma8Var.notifyDataSetChanged();
        }
    }

    private final void refreshDataTitleView() {
        DailyEnergyReport dailyEnergyReport = this.mEnergyReport;
        if ((dailyEnergyReport != null ? dailyEnergyReport.getLatestRecord() : null) == null) {
            DataTitleView dataTitleView = this.dataTitleView;
            if (dataTitleView != null) {
                dataTitleView.c(getString(c0j.L6));
                return;
            }
            return;
        }
        DailyEnergyReport dailyEnergyReport2 = this.mEnergyReport;
        Intrinsics.checkNotNull(dailyEnergyReport2);
        EnergyItem latestRecord = dailyEnergyReport2.getLatestRecord();
        Intrinsics.checkNotNull(latestRecord);
        int energy = latestRecord.getEnergy();
        String dateStr = TimeDateUtil.getDateStr(latestRecord.getTimestamp(), TimeUtils.FORMAT_H_M);
        String str = energy + "%";
        String str2 = str + " " + gl8.a(getContext(), energy);
        DataTitleView dataTitleView2 = this.dataTitleView;
        if (dataTitleView2 != null) {
            dataTitleView2.a(requireContext(), str2, str, dateStr);
        }
    }

    private final void refreshDetailCard() {
        if (this.mEnergyReport == null) {
            RecyclerView recyclerView = this.recyclerEnergyDetail;
            Intrinsics.checkNotNull(recyclerView);
            recyclerView.setVisibility(8);
            return;
        }
        List<qpo> listD = na8.d(getMActivity(), this.mEnergyReport);
        List<qpo> list = listD;
        if (ArrayUtils.isEmpty(list)) {
            RecyclerView recyclerView2 = this.recyclerEnergyDetail;
            Intrinsics.checkNotNull(recyclerView2);
            recyclerView2.setVisibility(8);
            return;
        }
        RecyclerView recyclerView3 = this.recyclerEnergyDetail;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setVisibility(0);
        List<qpo> list2 = this.mDataListDetail;
        Intrinsics.checkNotNull(list2);
        list2.clear();
        List<qpo> list3 = this.mDataListDetail;
        Intrinsics.checkNotNull(list3);
        Intrinsics.checkNotNull(listD);
        list3.addAll(list);
        opo opoVar = this.mDetailAdapter;
        Intrinsics.checkNotNull(opoVar);
        DailyEnergyReport dailyEnergyReport = this.mEnergyReport;
        Intrinsics.checkNotNull(dailyEnergyReport);
        opoVar.setHeaderViewTitle(qpo.a(dailyEnergyReport.getTag()));
        opo opoVar2 = this.mDetailAdapter;
        Intrinsics.checkNotNull(opoVar2);
        opoVar2.notifyDataChanged();
    }

    private final void refreshTopLineChart() {
        List<MaxMinEntry> listC;
        DailyEnergyReport dailyEnergyReport = this.mEnergyReport;
        if (dailyEnergyReport == null) {
            vfe vfeVar = this.mEnergyChartAttrs;
            LocalDate localDate = this.mCurrentLocalDate;
            Intrinsics.checkNotNull(localDate);
            listC = na8.c(vfeVar, new DailyEnergyReport(TimeDateUtil.changZeroOfTheDay(localDate), "days", ""));
        } else {
            listC = na8.c(this.mEnergyChartAttrs, dailyEnergyReport);
        }
        List<MaxMinEntry> list = this.mEnergyEntries;
        if (list != null) {
            list.clear();
        }
        List<MaxMinEntry> list2 = this.mEnergyEntries;
        if (list2 != null) {
            Intrinsics.checkNotNull(listC);
            list2.addAll(listC);
        }
        j9f j9fVar = this.mEnergyChartAdapter;
        if (j9fVar != null) {
            j9fVar.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshViewIfNeed() {
        DailyEnergyReport dailyEnergyReport = this.mSidReportMap.isEmpty() ? null : this.mSidReportMap.get(this.mSid);
        this.mEnergyReport = dailyEnergyReport;
        Logger.i("MiHealth:energy", "refreshViewIfNeed DayEnergyReport .. " + (dailyEnergyReport != null ? dailyEnergyReport.toString() : null));
        refreshTopLineChart();
        refreshDataTitleView();
        refreshBottomBarChart();
        refreshDetailCard();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestData() {
        cleanDataList();
        LocalDate localDate = this.mCurrentLocalDate;
        Intrinsics.checkNotNull(localDate);
        final long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDate);
        LocalDate localDate2 = this.mCurrentLocalDate;
        Intrinsics.checkNotNull(localDate2);
        LocalDate localDatePlusDays = localDate2.plusDays(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        long jChangZeroOfTheDay2 = TimeDateUtil.changZeroOfTheDay(localDatePlusDays);
        Logger.i("MiHealth:energy", "day///start request device data.." + this.mCurrentLocalDate + "/params start:" + jChangZeroOfTheDay + "/end:" + jChangZeroOfTheDay2);
        final LiveData<List<FitnessDeviceItem>> liveDataQueryDeviceList = ((EnergyViewModel) getMViewModel()).queryDeviceList(jChangZeroOfTheDay, jChangZeroOfTheDay2);
        liveDataQueryDeviceList.observe(getViewLifecycleOwner(), new EnergyDayItemFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: pa8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EnergyDayItemFragment.requestData$lambda$3(this.f30163a, liveDataQueryDeviceList, jChangZeroOfTheDay, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit requestData$lambda$3(final EnergyDayItemFragment this$0, LiveData queryDeviceLiveData, long j, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(queryDeviceLiveData, "$queryDeviceLiveData");
        if (list == null || !(!list.isEmpty())) {
            Logger.i("MiHealth:energy", "queryDeviceList null");
            this$0.onDeviceListChanged(null);
            this$0.refreshViewIfNeed();
        } else {
            if (TextUtils.isEmpty(this$0.mSid)) {
                this$0.mSid = ((FitnessDeviceItem) list.get(0)).getSid();
            }
            this$0.onDeviceListChanged(list);
            for (final String str : this$0.mDeviceSidSet) {
                Logger.i("MiHealth:energy", "start request fitness data by sid " + str + " /params start:" + j);
                final LiveData<List<DailyBasicReport>> liveDataTriggerFetchFitnessReport = ((EnergyViewModel) this$0.getMViewModel()).triggerFetchFitnessReport(IEnergyRepository.class, "days", j, 0, 0, str);
                liveDataTriggerFetchFitnessReport.observe(this$0.getViewLifecycleOwner(), new EnergyDayItemFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: qa8
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return EnergyDayItemFragment.requestData$lambda$3$lambda$2$lambda$1$lambda$0(this.f31273a, str, liveDataTriggerFetchFitnessReport, (List) obj);
                    }
                }));
            }
        }
        queryDeviceLiveData.removeObservers(this$0.getViewLifecycleOwner());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestData$lambda$3$lambda$2$lambda$1$lambda$0(EnergyDayItemFragment this$0, String sid, LiveData paiReportLiveData, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sid, "$sid");
        Intrinsics.checkNotNullParameter(paiReportLiveData, "$paiReportLiveData");
        if (!ArrayUtils.isEmpty(list)) {
            DailyBasicReport dailyBasicReport = (DailyBasicReport) list.get(0);
            if (dailyBasicReport instanceof DailyEnergyReport) {
                this$0.mSidReportMap.put(sid, (DailyEnergyReport) dailyBasicReport);
            }
        }
        this$0.refreshViewIfNeed();
        paiReportLiveData.removeObservers(this$0.getViewLifecycleOwner());
        return Unit.INSTANCE;
    }

    private final void updateRecyclerDetailLayoutManager() {
        RecyclerView recyclerView;
        if (getMActivity() == null || this.mDetailAdapter == null || (recyclerView = this.recyclerEnergyDetail) == null) {
            return;
        }
        HealthUtil healthUtil = HealthUtil.INSTANCE;
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        opo opoVar = this.mDetailAdapter;
        Intrinsics.checkNotNull(opoVar);
        recyclerView.setLayoutManager(healthUtil.buildCommonDataAdapterLayoutManager(mActivity, opoVar));
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.T;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        updateRecyclerDetailLayoutManager();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    @OneTrackReport(args = {"name", "energy_detail_page", "page_fragment", "day", "title", "能量"}, tip = "56.4.5.1.21797")
    public void onInvisible() throws Throwable {
        OneTrackReportAspect oneTrackReportAspectAspectOf;
        Annotation annotation;
        nrd nrdVarB = s69.b(ajc$tjp_0, this, this);
        try {
            super.onInvisible();
            oneTrackReportAspectAspectOf = OneTrackReportAspect.aspectOf();
            Annotation annotation2 = ajc$anno$0;
            if (annotation2 == null) {
                Method declaredMethod = EnergyDayItemFragment.class.getDeclaredMethod("onInvisible", new Class[0]);
            }
        } finally {
            oneTrackReportAspectAspectOf = OneTrackReportAspect.aspectOf();
            annotation = ajc$anno$0;
            if (annotation == null) {
                annotation = EnergyDayItemFragment.class.getDeclaredMethod("onInvisible", new Class[0]).getAnnotation(OneTrackReport.class);
                ajc$anno$0 = annotation;
            }
            oneTrackReportAspectAspectOf.oneTrackReportPageView(nrdVarB, (OneTrackReport) annotation);
        }
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
        initView();
        requestData();
    }
}
