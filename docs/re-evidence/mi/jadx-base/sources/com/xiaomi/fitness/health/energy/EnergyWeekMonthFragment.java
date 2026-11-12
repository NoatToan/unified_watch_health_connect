package com.xiaomi.fitness.health.energy;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.api.repository.IEnergyRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyEnergyReport;
import com.xiaomi.fit.fitness.export.data.item.FitnessDeviceItem;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.base.BasicDataViewModel;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.devicelist.SportsDeviceListView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.recycer.BarChartRecyclerHelper;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.data.valueformatter.EnergyHighLightMarkValueFormatter;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.energy.EnergyViewModel;
import com.xiaomi.fitness.health.energy.EnergyWeekMonthFragment;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.view.DataTitleView;
import defpackage.bl5;
import defpackage.c0j;
import defpackage.hak;
import defpackage.j9f;
import defpackage.k9f;
import defpackage.na8;
import defpackage.opo;
import defpackage.pni;
import defpackage.qpo;
import defpackage.r02;
import defpackage.vnq;
import defpackage.vqr;
import defpackage.xcm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000 \u0081\u0001*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\u0002\u0081\u0001B\b¢\u0006\u0005\b\u0080\u0001\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\bJ\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\bJ\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\bJ\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\bJ\u000f\u0010\u001a\u001a\u00020\u0006H&¢\u0006\u0004\b\u001a\u0010\bJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\bJ!\u0010 \u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%R$\u0010&\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010-\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R \u0010;\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010:\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R$\u0010>\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001c\u0010E\u001a\b\u0012\u0002\b\u0003\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR$\u0010K\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0018\u0010R\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u001e\u0010U\u001a\n\u0012\u0004\u0012\u00020T\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010<R\u001c\u0010X\u001a\b\u0012\u0004\u0012\u00020W0V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR$\u0010[\u001a\u0004\u0018\u00010Z8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R$\u0010b\u001a\u0004\u0018\u00010a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u0018\u0010h\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010k\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR$\u0010n\u001a\u0004\u0018\u00010m8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\"\u0010u\u001a\u000e\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020m0t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010y\u001a\u00020W8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0014\u0010{\u001a\u00020W8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bz\u0010xR\u0014\u0010\u007f\u001a\u00020|8$X¤\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~¨\u0006\u0082\u0001"}, d2 = {"Lcom/xiaomi/fitness/health/energy/EnergyWeekMonthFragment;", "Lcom/xiaomi/fitness/health/energy/EnergyViewModel;", "VM", "Landroidx/databinding/ViewDataBinding;", "VDB", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "", Constants.KEY_REQUEST_DATA, "()V", "", "Lcom/xiaomi/fit/fitness/export/data/item/FitnessDeviceItem;", "deviceList", "onDeviceListChanged", "(Ljava/util/List;)V", "cleanDataList", "refreshViewIfNeed", "refreshDataTitleView", "refreshDetailCard", "refreshTopBarChart", "initView", "initUnderstandCard", "initDeviceViewCard", "initDetailCard", "updateRecyclerDetailLayoutManager", "initTopBarChart", "initBundle", "initViewBinding", LifecycleConstantKt.ON_RESUME, "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "containerView", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "setContainerView", "(Landroid/view/View;)V", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "mEnergyChart", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "getMEnergyChart", "()Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "setMEnergyChart", "(Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;)V", "Lr02;", "mEnergyChartAttrs", "Lr02;", "Lj9f;", "mEnergyChartAdapter", "Lj9f;", "", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "mEnergyEntries", "Ljava/util/List;", "Lcom/xiaomi/fitness/view/DataTitleView;", "dataTitleView", "Lcom/xiaomi/fitness/view/DataTitleView;", "getDataTitleView", "()Lcom/xiaomi/fitness/view/DataTitleView;", "setDataTitleView", "(Lcom/xiaomi/fitness/view/DataTitleView;)V", "Lvnq;", "mEnergyYAxis", "Lvnq;", "Lvqr;", "mEnergyXAxis", "Lvqr;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerEnergyDetail", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerEnergyDetail", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerEnergyDetail", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lopo;", "mDetailAdapter", "Lopo;", "Lqpo;", "mDataListDetail", "", "", "mDeviceSidSet", "Ljava/util/Set;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "understandCard", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getUnderstandCard", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setUnderstandCard", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "Lcom/xiaomi/fitness/common/devicelist/SportsDeviceListView;", "mDeviceListView", "Lcom/xiaomi/fitness/common/devicelist/SportsDeviceListView;", "getMDeviceListView", "()Lcom/xiaomi/fitness/common/devicelist/SportsDeviceListView;", "setMDeviceListView", "(Lcom/xiaomi/fitness/common/devicelist/SportsDeviceListView;)V", "mSid", "Ljava/lang/String;", "Lorg/joda/time/LocalDate;", "mCurrentLocalDate", "Lorg/joda/time/LocalDate;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyEnergyReport;", "mEnergyReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyEnergyReport;", "getMEnergyReport", "()Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyEnergyReport;", "setMEnergyReport", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyEnergyReport;)V", "", "mSidReportMap", "Ljava/util/Map;", "getViewTag", "()Ljava/lang/String;", CloudContract.COL_VIEW_TAG, "getEmptyTitleStr", "emptyTitleStr", "", "getFragmentPosition", "()I", "fragmentPosition", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEnergyWeekMonthFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnergyWeekMonthFragment.kt\ncom/xiaomi/fitness/health/energy/EnergyWeekMonthFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,364:1\n1863#2,2:365\n1863#2,2:367\n1863#2,2:369\n*S KotlinDebug\n*F\n+ 1 EnergyWeekMonthFragment.kt\ncom/xiaomi/fitness/health/energy/EnergyWeekMonthFragment\n*L\n151#1:365,2\n156#1:367,2\n115#1:369,2\n*E\n"})
public abstract class EnergyWeekMonthFragment<VM extends EnergyViewModel, VDB extends ViewDataBinding> extends BaseBindingFragment<VM, VDB> {

    @NotNull
    public static final String TAG = "MiHealth:energy";

    @Nullable
    private View containerView;

    @Nullable
    private DataTitleView dataTitleView;

    @Nullable
    private LocalDate mCurrentLocalDate;

    @Nullable
    private List<qpo> mDataListDetail;

    @Nullable
    private opo mDetailAdapter;

    @Nullable
    private SportsDeviceListView mDeviceListView;

    @Nullable
    private BarChartRecyclerView mEnergyChart;

    @Nullable
    private j9f mEnergyChartAdapter;

    @Nullable
    private r02 mEnergyChartAttrs;

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
    private RecyclerView recyclerEnergyDetail;

    @Nullable
    private ConstraintLayout understandCard;

    @NotNull
    private Set<String> mDeviceSidSet = new HashSet();

    @NotNull
    private Map<String, DailyEnergyReport> mSidReportMap = new HashMap();

    private final void cleanDataList() {
        this.mEnergyReport = null;
        this.mSidReportMap.clear();
        this.mDeviceSidSet.clear();
    }

    private final String getEmptyTitleStr() {
        String string = getString(c0j.L6);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    private final String getViewTag() {
        int fragmentPosition = getFragmentPosition();
        if (fragmentPosition != 0) {
            return fragmentPosition != 1 ? "months" : "weeks";
        }
        return "days";
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    /* JADX WARN: Code duplicated, block: B:17:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
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
            sportsDeviceListView3.setDeviceSelectedListener(new SportsDeviceListView.DeviceSelectedListener(this) { // from class: com.xiaomi.fitness.health.energy.EnergyWeekMonthFragment.initDeviceViewCard.1
                final /* synthetic */ EnergyWeekMonthFragment<VM, VDB> this$0;

                {
                    this.this$0 = this;
                }

                @Override // com.xiaomi.fitness.common.devicelist.SportsDeviceListView.DeviceSelectedListener
                public void deviceSelected(String did, boolean isClick) {
                    Intrinsics.checkNotNullParameter(did, "did");
                    ((EnergyWeekMonthFragment) this.this$0).mSid = did;
                    Logger.i("MiHealth:energy", "数据源切换:" + did);
                    this.this$0.refreshViewIfNeed();
                }
            });
        }
    }

    private final void initTopBarChart() {
        BarChartRecyclerView barChartRecyclerView = this.mEnergyChart;
        Intrinsics.checkNotNull(barChartRecyclerView);
        r02 r02Var = (r02) barChartRecyclerView.mAttrs;
        this.mEnergyChartAttrs = r02Var;
        Intrinsics.checkNotNull(r02Var);
        int i = r02Var.c;
        this.mEnergyEntries = new ArrayList();
        this.mEnergyYAxis = vnq.o(this.mEnergyChartAttrs, 100.0f);
        r02 r02Var2 = this.mEnergyChartAttrs;
        BarChartRecyclerHelper barChartRecyclerHelper = BarChartRecyclerHelper.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        this.mEnergyXAxis = new vqr(r02Var2, i, barChartRecyclerHelper.createXAxisFormatter(contextRequireContext, getFragmentPosition()));
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(getActivity(), this.mEnergyChartAttrs);
        k9f k9fVar = new k9f(this.mEnergyYAxis, this.mEnergyXAxis, this.mEnergyChartAttrs);
        EnergyHighLightMarkValueFormatter energyHighLightMarkValueFormatter = new EnergyHighLightMarkValueFormatter(0);
        k9fVar.setHighLightValueFormatter(energyHighLightMarkValueFormatter);
        BarChartRecyclerView barChartRecyclerView2 = this.mEnergyChart;
        Intrinsics.checkNotNull(barChartRecyclerView2);
        barChartRecyclerView2.addItemDecoration(k9fVar);
        this.mEnergyChartAdapter = new j9f(getActivity(), this.mEnergyEntries, this.mEnergyChart, this.mEnergyXAxis, this.mEnergyChartAttrs, energyHighLightMarkValueFormatter);
        BarChartRecyclerView barChartRecyclerView3 = this.mEnergyChart;
        Intrinsics.checkNotNull(barChartRecyclerView3);
        barChartRecyclerView3.setAdapter(this.mEnergyChartAdapter);
        BarChartRecyclerView barChartRecyclerView4 = this.mEnergyChart;
        Intrinsics.checkNotNull(barChartRecyclerView4);
        barChartRecyclerView4.setLayoutManager(speedRatioLayoutManager);
        BarChartRecyclerView barChartRecyclerView5 = this.mEnergyChart;
        Intrinsics.checkNotNull(barChartRecyclerView5);
        barChartRecyclerView5.setNestedScrollingEnabled(false);
        hak hakVar = new hak(getActivity(), this.mEnergyChart, new xcm(this) { // from class: com.xiaomi.fitness.health.energy.EnergyWeekMonthFragment$initTopBarChart$itemGestureListener$1
            final /* synthetic */ EnergyWeekMonthFragment<VM, VDB> this$0;

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
        BarChartRecyclerView barChartRecyclerView6 = this.mEnergyChart;
        Intrinsics.checkNotNull(barChartRecyclerView6);
        barChartRecyclerView6.addOnItemTouchListener(hakVar);
    }

    private final void initUnderstandCard() {
        ConstraintLayout constraintLayout = this.understandCard;
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: lb8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EnergyWeekMonthFragment.initUnderstandCard$lambda$6(this.f24855a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initUnderstandCard$lambda$6(EnergyWeekMonthFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseFragmentExKt.gotoPage(this$0, EnergyUnderstandFragment.class, null);
    }

    private final void initView() {
        initTopBarChart();
        initDetailCard();
        initDeviceViewCard();
        initUnderstandCard();
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

    private final void refreshDataTitleView() {
        DailyEnergyReport dailyEnergyReport = this.mEnergyReport;
        if (dailyEnergyReport == null) {
            DataTitleView dataTitleView = this.dataTitleView;
            if (dataTitleView != null) {
                dataTitleView.c(getEmptyTitleStr());
                return;
            }
            return;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        Intrinsics.checkNotNull(dailyEnergyReport);
        Integer numValueOf = Integer.valueOf(dailyEnergyReport.getMaxEnergy());
        DailyEnergyReport dailyEnergyReport2 = this.mEnergyReport;
        Intrinsics.checkNotNull(dailyEnergyReport2);
        String str = String.format(locale, "%d%%-%d%%", Arrays.copyOf(new Object[]{numValueOf, Integer.valueOf(dailyEnergyReport2.getMinEnergy())}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        DataTitleView dataTitleView2 = this.dataTitleView;
        if (dataTitleView2 != null) {
            dataTitleView2.a(requireContext(), str, str, "");
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

    private final void refreshTopBarChart() {
        List<MaxMinEntry> listE;
        boolean z = getFragmentPosition() == 1;
        DailyEnergyReport dailyEnergyReport = this.mEnergyReport;
        if (dailyEnergyReport == null) {
            r02 r02Var = this.mEnergyChartAttrs;
            LocalDate localDate = this.mCurrentLocalDate;
            Intrinsics.checkNotNull(localDate);
            listE = na8.e(r02Var, new DailyEnergyReport(TimeDateUtil.changZeroOfTheDay(localDate), z ? "weeks" : "months", ""), z);
        } else {
            listE = na8.e(this.mEnergyChartAttrs, dailyEnergyReport, z);
        }
        List<MaxMinEntry> list = this.mEnergyEntries;
        if (list != null) {
            list.clear();
        }
        List<MaxMinEntry> list2 = this.mEnergyEntries;
        if (list2 != null) {
            Intrinsics.checkNotNull(listE);
            list2.addAll(listE);
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
        refreshTopBarChart();
        refreshDataTitleView();
        refreshDetailCard();
    }

    private final void requestData() {
        cleanDataList();
        LocalDate localDate = this.mCurrentLocalDate;
        Intrinsics.checkNotNull(localDate);
        final long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDate);
        BarChartRecyclerHelper barChartRecyclerHelper = BarChartRecyclerHelper.INSTANCE;
        int fragmentPosition = getFragmentPosition();
        LocalDate localDate2 = this.mCurrentLocalDate;
        Intrinsics.checkNotNull(localDate2);
        LocalDate localDatePlusDays = barChartRecyclerHelper.getWeekOrMonthEndDate(fragmentPosition, localDate2).plusDays(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        long jChangZeroOfTheDay2 = TimeDateUtil.changZeroOfTheDay(localDatePlusDays);
        Logger.i("MiHealth:energy", "wm///start request device data.." + this.mCurrentLocalDate + "/params start:" + jChangZeroOfTheDay + "/end:" + jChangZeroOfTheDay2);
        final LiveData<List<FitnessDeviceItem>> liveDataQueryDeviceList = getMViewModel().queryDeviceList(jChangZeroOfTheDay, jChangZeroOfTheDay2);
        liveDataQueryDeviceList.observe(getViewLifecycleOwner(), new EnergyWeekMonthFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: nb8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EnergyWeekMonthFragment.requestData$lambda$3(this.f27747a, liveDataQueryDeviceList, jChangZeroOfTheDay, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit requestData$lambda$3(final EnergyWeekMonthFragment this$0, LiveData queryDeviceLiveData, long j, List list) {
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
                Logger.i("MiHealth:energy", "start request fitness data by sid " + str + " /params start:" + j + "/tag:" + this$0.getViewTag());
                final LiveData<List<DailyBasicReport>> liveDataTriggerFetchFitnessReport = ((BasicDataViewModel) this$0.getMViewModel()).triggerFetchFitnessReport(IEnergyRepository.class, this$0.getViewTag(), j, 0, 0, str);
                liveDataTriggerFetchFitnessReport.observe(this$0.getViewLifecycleOwner(), new EnergyWeekMonthFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: mb8
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return EnergyWeekMonthFragment.requestData$lambda$3$lambda$2$lambda$1$lambda$0(this.f25967a, str, liveDataTriggerFetchFitnessReport, (List) obj);
                    }
                }));
            }
        }
        queryDeviceLiveData.removeObservers(this$0.getViewLifecycleOwner());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestData$lambda$3$lambda$2$lambda$1$lambda$0(EnergyWeekMonthFragment this$0, String sid, LiveData paiReportLiveData, List list) {
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
    public final SportsDeviceListView getMDeviceListView() {
        return this.mDeviceListView;
    }

    @Nullable
    public final BarChartRecyclerView getMEnergyChart() {
        return this.mEnergyChart;
    }

    @Nullable
    public final DailyEnergyReport getMEnergyReport() {
        return this.mEnergyReport;
    }

    @Nullable
    public final RecyclerView getRecyclerEnergyDetail() {
        return this.recyclerEnergyDetail;
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
        Logger.i("MiHealth:energy", "onViewCreated..mCurrentPosition-mCurrentDate:" + this.mCurrentLocalDate);
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

    public final void setMDeviceListView(@Nullable SportsDeviceListView sportsDeviceListView) {
        this.mDeviceListView = sportsDeviceListView;
    }

    public final void setMEnergyChart(@Nullable BarChartRecyclerView barChartRecyclerView) {
        this.mEnergyChart = barChartRecyclerView;
    }

    public final void setMEnergyReport(@Nullable DailyEnergyReport dailyEnergyReport) {
        this.mEnergyReport = dailyEnergyReport;
    }

    public final void setRecyclerEnergyDetail(@Nullable RecyclerView recyclerView) {
        this.recyclerEnergyDetail = recyclerView;
    }

    public final void setUnderstandCard(@Nullable ConstraintLayout constraintLayout) {
        this.understandCard = constraintLayout;
    }
}
