package com.xiaomi.fitness.health.trainload;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.api.repository.ITrainingLoadRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyTrainingLoadReport;
import com.xiaomi.fit.fitness.export.data.item.FitnessDeviceItem;
import com.xiaomi.fit.fitness.export.data.item.TrainingLoadItem;
import com.xiaomi.fitness.base.BaseDetailChildFragment;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.widget.LevelBarView;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.devicelist.SportsDeviceListView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.trainload.TrainingLoadDetailFragment;
import com.xiaomi.fitness.health.vo2max.TrainingLoadUnderstandFragment;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.view.DataTitleView;
import defpackage.bl5;
import defpackage.bla;
import defpackage.c0j;
import defpackage.gfe;
import defpackage.hak;
import defpackage.j9f;
import defpackage.opo;
import defpackage.pni;
import defpackage.qpo;
import defpackage.vfe;
import defpackage.vnq;
import defpackage.vqr;
import defpackage.xcm;
import defpackage.yfe;
import defpackage.ztp;
import java.util.ArrayList;
import java.util.Arrays;
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
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 s2\u00020\u0001:\u0001sB\u0007¢\u0006\u0004\br\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00022\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010\u0004J\u0017\u0010&\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R \u00106\u001a\f\u0012\u0006\u0012\u0004\u0018\u000105\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001c\u0010<\u001a\b\u0012\u0002\b\u0003\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R$\u0010B\u001a\u0004\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010I\u001a\u0004\u0018\u00010H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010O\u001a\u0004\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010C\u001a\u0004\bP\u0010E\"\u0004\bQ\u0010GR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u001e\u0010V\u001a\n\u0012\u0004\u0012\u00020U\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u00107R\u001e\u0010X\u001a\n\u0012\u0004\u0012\u00020W\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u00107R$\u0010Y\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u0018\u0010`\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u001c\u0010d\u001a\b\u0012\u0004\u0012\u00020c0b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010g\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\"\u0010j\u001a\u000e\u0012\u0004\u0012\u00020c\u0012\u0004\u0012\u00020f0i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010m\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010q\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bo\u0010p¨\u0006t"}, d2 = {"Lcom/xiaomi/fitness/health/trainload/TrainingLoadDetailFragment;", "Lcom/xiaomi/fitness/base/BaseDetailChildFragment;", "", Constants.KEY_REQUEST_DATA, "()V", "", "Lcom/xiaomi/fit/fitness/export/data/item/FitnessDeviceItem;", "deviceList", "onDeviceListChanged", "(Ljava/util/List;)V", "refreshView", "refreshDetailCard", "refreshTopLineChart", "initView", "initDeviceView", "initTopLineChart", "initDetailCard", "initLevelDescRecyclerview", "updateRecyclerDetailLayoutManager", "updateLevelBarRecyclerViewMargin", "", "xAxisPosition", "()I", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lbla;", "_binding", "Lbla;", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "mLineChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "Lvfe;", "mLineChartAttrs", "Lvfe;", "Lj9f;", "mLineChartAdapter", "Lj9f;", "", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "mChartEntries", "Ljava/util/List;", "Lcom/xiaomi/fitness/view/DataTitleView;", "mDataTitleView", "Lcom/xiaomi/fitness/view/DataTitleView;", "Lvnq;", "mYAxis", "Lvnq;", "Lvqr;", "mXAxis", "Lvqr;", "Landroidx/recyclerview/widget/RecyclerView;", "mCardRecyclerDetail", "Landroidx/recyclerview/widget/RecyclerView;", "getMCardRecyclerDetail", "()Landroidx/recyclerview/widget/RecyclerView;", "setMCardRecyclerDetail", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lcom/xiaomi/fitness/baseui/widget/LevelBarView;", "mLevelBarView", "Lcom/xiaomi/fitness/baseui/widget/LevelBarView;", "getMLevelBarView", "()Lcom/xiaomi/fitness/baseui/widget/LevelBarView;", "setMLevelBarView", "(Lcom/xiaomi/fitness/baseui/widget/LevelBarView;)V", "mLevelDescRecyclerView", "getMLevelDescRecyclerView", "setMLevelDescRecyclerView", "Lopo;", "mDetailAdapter", "Lopo;", "Lqpo;", "mDataListDetail", "Lcom/xiaomi/fitness/baseui/widget/LevelBarView$LevelItem;", "mLevelItems", "understandCard", "Landroid/view/View;", "getUnderstandCard", "()Landroid/view/View;", "setUnderstandCard", "(Landroid/view/View;)V", "Lcom/xiaomi/fitness/common/devicelist/SportsDeviceListView;", "deviceListView", "Lcom/xiaomi/fitness/common/devicelist/SportsDeviceListView;", "", "", "mDeviceSidSet", "Ljava/util/Set;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyTrainingLoadReport;", "trainingLoadReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyTrainingLoadReport;", "", "mSidReportMap", "Ljava/util/Map;", "Lcom/xiaomi/fitness/health/trainload/TrainingLoadViewModel;", "trainingLoadViewModel", "Lcom/xiaomi/fitness/health/trainload/TrainingLoadViewModel;", "getBinding", "()Lbla;", "binding", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nTrainingLoadDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrainingLoadDetailFragment.kt\ncom/xiaomi/fitness/health/trainload/TrainingLoadDetailFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,373:1\n1863#2,2:374\n1863#2,2:376\n1863#2,2:378\n*S KotlinDebug\n*F\n+ 1 TrainingLoadDetailFragment.kt\ncom/xiaomi/fitness/health/trainload/TrainingLoadDetailFragment\n*L\n176#1:374,2\n181#1:376,2\n146#1:378,2\n*E\n"})
public final class TrainingLoadDetailFragment extends BaseDetailChildFragment {
    public static final int DEFAULT_YAXIS = 300;

    @NotNull
    public static final String TAG = "TrainLoad";

    @Nullable
    private bla _binding;

    @Nullable
    private SportsDeviceListView deviceListView;

    @Nullable
    private RecyclerView mCardRecyclerDetail;

    @Nullable
    private List<MaxMinEntry> mChartEntries;

    @Nullable
    private List<qpo> mDataListDetail;

    @Nullable
    private DataTitleView mDataTitleView;

    @Nullable
    private opo mDetailAdapter;

    @Nullable
    private LevelBarView mLevelBarView;

    @Nullable
    private RecyclerView mLevelDescRecyclerView;

    @Nullable
    private List<? extends LevelBarView.LevelItem> mLevelItems;

    @Nullable
    private j9f mLineChartAdapter;

    @Nullable
    private vfe mLineChartAttrs;

    @Nullable
    private LineChartRecyclerView mLineChartRecyclerView;

    @Nullable
    private vqr mXAxis;

    @Nullable
    private vnq<?> mYAxis;

    @Nullable
    private DailyTrainingLoadReport trainingLoadReport;

    @Nullable
    private TrainingLoadViewModel trainingLoadViewModel;

    @Nullable
    private View understandCard;

    @NotNull
    private Set<String> mDeviceSidSet = new HashSet();

    @NotNull
    private Map<String, DailyTrainingLoadReport> mSidReportMap = new HashMap();

    private final bla getBinding() {
        bla blaVar = this._binding;
        Intrinsics.checkNotNull(blaVar);
        return blaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initDetailCard() {
        this.mDataListDetail = new ArrayList();
        this.mLevelItems = TrainingLoadDataUtil.INSTANCE.getTrainLoadLevelList();
        RecyclerView recyclerView = this.mCardRecyclerDetail;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.addItemDecoration(new bl5());
        this.mDetailAdapter = new opo(getMActivity(), this.mDataListDetail, c0j.fo, pni.m2);
        RecyclerView recyclerView2 = this.mCardRecyclerDetail;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setAdapter(this.mDetailAdapter);
        RecyclerView recyclerView3 = this.mCardRecyclerDetail;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setHasFixedSize(true);
        LevelBarView levelBarView = this.mLevelBarView;
        if (levelBarView != 0) {
            List<? extends LevelBarView.LevelItem> list = this.mLevelItems;
            Intrinsics.checkNotNull(list);
            levelBarView.setLevels(list);
        }
        initLevelDescRecyclerview();
        updateRecyclerDetailLayoutManager();
        updateLevelBarRecyclerViewMargin();
    }

    private final void initDeviceView() {
        SportsDeviceListView sportsDeviceListView = this.deviceListView;
        if (sportsDeviceListView != null) {
            sportsDeviceListView.refreshIcon(pni.l2);
        }
        SportsDeviceListView sportsDeviceListView2 = this.deviceListView;
        if (sportsDeviceListView2 != null) {
            sportsDeviceListView2.setDeviceSelectedListener(new SportsDeviceListView.DeviceSelectedListener() { // from class: com.xiaomi.fitness.health.trainload.TrainingLoadDetailFragment.initDeviceView.1
                @Override // com.xiaomi.fitness.common.devicelist.SportsDeviceListView.DeviceSelectedListener
                public void deviceSelected(String did, boolean isClick) {
                    Intrinsics.checkNotNullParameter(did, "did");
                    TrainingLoadDetailFragment.this.setSid(did);
                    Logger.i(TrainingLoadDetailFragment.TAG, "data source change :" + did);
                    TrainingLoadDetailFragment.this.refreshView();
                }
            });
        }
    }

    private final void initLevelDescRecyclerview() {
        SettingsPropertiesUtil settingsPropertiesUtil = SettingsPropertiesUtil.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        int i = settingsPropertiesUtil.isExpand(contextRequireContext) ? 4 : 3;
        Context context = getContext();
        List<? extends LevelBarView.LevelItem> list = this.mLevelItems;
        Intrinsics.checkNotNull(list);
        gfe gfeVar = new gfe(context, list, i);
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

    private final void initTopLineChart() {
        LineChartRecyclerView lineChartRecyclerView = this.mLineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView);
        vfe vfeVar = (vfe) lineChartRecyclerView.mAttrs;
        this.mLineChartAttrs = vfeVar;
        Intrinsics.checkNotNull(vfeVar);
        int i = vfeVar.c;
        this.mChartEntries = new ArrayList();
        this.mYAxis = vnq.p(this.mLineChartAttrs, 300.0f, 5);
        this.mXAxis = new vqr(this.mLineChartAttrs, i, new ztp());
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(getActivity(), this.mLineChartAttrs);
        yfe yfeVar = new yfe(this.mYAxis, this.mXAxis, this.mLineChartAttrs);
        TrainHighLightMarkValueFormatter trainHighLightMarkValueFormatter = new TrainHighLightMarkValueFormatter();
        yfeVar.setHighLightValueFormatter(trainHighLightMarkValueFormatter);
        LineChartRecyclerView lineChartRecyclerView2 = this.mLineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView2);
        lineChartRecyclerView2.addItemDecoration(yfeVar);
        this.mLineChartAdapter = new j9f(getActivity(), this.mChartEntries, this.mLineChartRecyclerView, this.mXAxis, this.mLineChartAttrs, trainHighLightMarkValueFormatter);
        LineChartRecyclerView lineChartRecyclerView3 = this.mLineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView3);
        lineChartRecyclerView3.setAdapter(this.mLineChartAdapter);
        LineChartRecyclerView lineChartRecyclerView4 = this.mLineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView4);
        lineChartRecyclerView4.setLayoutManager(speedRatioLayoutManager);
        LineChartRecyclerView lineChartRecyclerView5 = this.mLineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView5);
        lineChartRecyclerView5.setNestedScrollingEnabled(false);
        hak hakVar = new hak(getActivity(), this.mLineChartRecyclerView, new xcm() { // from class: com.xiaomi.fitness.health.trainload.TrainingLoadDetailFragment$initTopLineChart$itemGestureListener$1
            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                if (barEntry == null || !barEntry.isSelected()) {
                    DataTitleView dataTitleView = this.this$0.mDataTitleView;
                    if (dataTitleView != null) {
                        dataTitleView.setVisibility(0);
                        return;
                    }
                    return;
                }
                DataTitleView dataTitleView2 = this.this$0.mDataTitleView;
                if (dataTitleView2 != null) {
                    dataTitleView2.setVisibility(4);
                }
            }
        });
        LineChartRecyclerView lineChartRecyclerView6 = this.mLineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView6);
        lineChartRecyclerView6.addOnItemTouchListener(hakVar);
    }

    private final void initView() {
        initTopLineChart();
        initDetailCard();
        initDeviceView();
        View view = this.understandCard;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: ntp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    TrainingLoadDetailFragment.initView$lambda$7(this.f28364a, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$7(TrainingLoadDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseFragmentExKt.gotoPage(this$0, TrainingLoadUnderstandFragment.class, null);
    }

    private final void onDeviceListChanged(List<FitnessDeviceItem> deviceList) {
        this.mDeviceSidSet.clear();
        if (deviceList != null) {
            Iterator<T> it = deviceList.iterator();
            while (it.hasNext()) {
                this.mDeviceSidSet.add(((FitnessDeviceItem) it.next()).getSid());
            }
        }
        if (!CollectionsKt___CollectionsKt.contains(this.mDeviceSidSet, getSid())) {
            setSid(null);
            for (String str : this.mDeviceSidSet) {
                if (getSid() == null) {
                    setSid(str);
                }
            }
        }
        SportsDeviceListView sportsDeviceListView = this.deviceListView;
        if (sportsDeviceListView != null) {
            sportsDeviceListView.updateDeviceSet(this.mDeviceSidSet);
        }
        if (!(!this.mDeviceSidSet.isEmpty())) {
            SportsDeviceListView sportsDeviceListView2 = this.deviceListView;
            if (sportsDeviceListView2 != null) {
                ViewExtKt.setVisible(sportsDeviceListView2, false);
                return;
            }
            return;
        }
        SportsDeviceListView sportsDeviceListView3 = this.deviceListView;
        if (sportsDeviceListView3 != null) {
            sportsDeviceListView3.refreshCurrentSid(getSid());
        }
        SportsDeviceListView sportsDeviceListView4 = this.deviceListView;
        if (sportsDeviceListView4 != null) {
            ViewExtKt.setVisible(sportsDeviceListView4, true);
        }
    }

    private final void refreshDetailCard() {
        int wtlSum;
        int trainingLoadLevel;
        DailyTrainingLoadReport dailyTrainingLoadReport = this.trainingLoadReport;
        if (dailyTrainingLoadReport != null) {
            wtlSum = dailyTrainingLoadReport.getWtlSum();
            trainingLoadLevel = dailyTrainingLoadReport.getTrainingLoadLevel();
        } else {
            wtlSum = 0;
            trainingLoadLevel = 0;
        }
        LevelBarView levelBarView = this.mLevelBarView;
        if (levelBarView != null) {
            levelBarView.setLevel(trainingLoadLevel - 1);
        }
        TrainingLoadDataUtil trainingLoadDataUtil = TrainingLoadDataUtil.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        List<qpo> listCreateTodayWtlSummaryModelList = trainingLoadDataUtil.createTodayWtlSummaryModelList(contextRequireContext, wtlSum, trainingLoadLevel);
        List<qpo> list = this.mDataListDetail;
        Intrinsics.checkNotNull(list);
        list.clear();
        List<qpo> list2 = this.mDataListDetail;
        Intrinsics.checkNotNull(list2);
        list2.addAll(listCreateTodayWtlSummaryModelList);
        opo opoVar = this.mDetailAdapter;
        Intrinsics.checkNotNull(opoVar);
        opoVar.notifyDataChanged();
    }

    private final void refreshTopLineChart() {
        DailyTrainingLoadReport dailyTrainingLoadReport = this.trainingLoadReport;
        if (dailyTrainingLoadReport == null) {
            LocalDate mCurrentDate = getMCurrentDate();
            Intrinsics.checkNotNull(mCurrentDate);
            dailyTrainingLoadReport = new DailyTrainingLoadReport(TimeDateUtil.changZeroOfTheDay(mCurrentDate), "weeks");
        }
        TrainingLoadDataUtil trainingLoadDataUtil = TrainingLoadDataUtil.INSTANCE;
        List<MaxMinEntry> lineChartEntries = trainingLoadDataUtil.getLineChartEntries(dailyTrainingLoadReport);
        List<MaxMinEntry> list = this.mChartEntries;
        Intrinsics.checkNotNull(list);
        list.clear();
        List<MaxMinEntry> list2 = this.mChartEntries;
        Intrinsics.checkNotNull(list2);
        list2.addAll(lineChartEntries);
        float theMaxNumber = HealthUtil.getTheMaxNumber(lineChartEntries);
        int i = theMaxNumber > 300.0f ? ((((int) (theMaxNumber - 300)) / 100) * 100) + 400 : 300;
        vnq<?> vnqVar = this.mYAxis;
        Intrinsics.checkNotNull(vnqVar);
        this.mYAxis = vnqVar.s(this.mYAxis, i, 5);
        LineChartRecyclerView lineChartRecyclerView = this.mLineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView);
        lineChartRecyclerView.setYAxis(this.mYAxis);
        j9f j9fVar = this.mLineChartAdapter;
        Intrinsics.checkNotNull(j9fVar);
        j9fVar.notifyDataSetChanged();
        List<TrainingLoadItem> dayTLList = dailyTrainingLoadReport.getDayTLList();
        if (dayTLList == null || dayTLList.isEmpty()) {
            DataTitleView dataTitleView = this.mDataTitleView;
            if (dataTitleView != null) {
                dataTitleView.c(getString(c0j.L6));
                return;
            }
            return;
        }
        TrainingLoadItem trainingLoadItem = (TrainingLoadItem) CollectionsKt___CollectionsKt.first((List) dayTLList);
        String dateYYYYMMddLocalFormat = TimeDateUtil.getDateYYYYMMddLocalFormat(trainingLoadItem.getTime() * ((long) 1000));
        int trainingLoadLevel = trainingLoadItem.convertToDailyTLReport().getTrainingLoadLevel();
        int wtlSum = trainingLoadItem.getWtlSum();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String strValueOf = String.valueOf(wtlSum);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        String str = String.format("%s %s", Arrays.copyOf(new Object[]{strValueOf, trainingLoadDataUtil.getTrainingLoadTitle(contextRequireContext, trainingLoadLevel)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        DataTitleView dataTitleView2 = this.mDataTitleView;
        if (dataTitleView2 != null) {
            dataTitleView2.a(requireContext(), str, String.valueOf(wtlSum), dateYYYYMMddLocalFormat);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshView() {
        DailyTrainingLoadReport dailyTrainingLoadReport = this.mSidReportMap.isEmpty() ? null : this.mSidReportMap.get(getSid());
        this.trainingLoadReport = dailyTrainingLoadReport;
        Logger.i(TAG, "current trainingLoadReport is " + dailyTrainingLoadReport);
        refreshTopLineChart();
        refreshDetailCard();
    }

    private final void requestData() {
        this.trainingLoadReport = null;
        this.mDeviceSidSet.clear();
        LocalDate mCurrentDate = getMCurrentDate();
        Intrinsics.checkNotNull(mCurrentDate);
        LocalDate localDateMinusDays = mCurrentDate.minusDays(27);
        LocalDate mCurrentDate2 = getMCurrentDate();
        Intrinsics.checkNotNull(mCurrentDate2);
        LocalDate localDatePlusDays = mCurrentDate2.plusDays(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDatePlusDays);
        Intrinsics.checkNotNull(localDateMinusDays);
        long jChangZeroOfTheDay2 = TimeDateUtil.changZeroOfTheDay(localDateMinusDays);
        BaseDetailChildFragment.OnDateSelectChangedListener mSelectChangedListener = getMSelectChangedListener();
        if (mSelectChangedListener != null) {
            LocalDate mCurrentDate3 = getMCurrentDate();
            Intrinsics.checkNotNull(mCurrentDate3);
            mSelectChangedListener.onSelectStartEndDateChanged(localDateMinusDays, mCurrentDate3);
        }
        TrainingLoadViewModel trainingLoadViewModel = this.trainingLoadViewModel;
        Intrinsics.checkNotNull(trainingLoadViewModel);
        final LiveData<List<FitnessDeviceItem>> liveDataQueryDeviceList = trainingLoadViewModel.queryDeviceList(jChangZeroOfTheDay2, jChangZeroOfTheDay);
        Logger.i(TAG, "refreshReport request params current " + getMCurrentDate() + ",start " + localDateMinusDays);
        liveDataQueryDeviceList.observe(getViewLifecycleOwner(), new TrainingLoadDetailFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ltp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TrainingLoadDetailFragment.requestData$lambda$3(this.f25429a, liveDataQueryDeviceList, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestData$lambda$3(final TrainingLoadDetailFragment this$0, LiveData queryDeviceLiveData, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(queryDeviceLiveData, "$queryDeviceLiveData");
        if (list == null || !(!list.isEmpty())) {
            Logger.i(TAG, "queryDeviceList null");
            this$0.onDeviceListChanged(null);
            this$0.refreshView();
        } else {
            if (TextUtils.isEmpty(this$0.getSid())) {
                this$0.setSid(((FitnessDeviceItem) list.get(0)).getSid());
            }
            this$0.onDeviceListChanged(list);
            Logger.i(TAG, "trainload...queryDeviceList result  deviceSidSetSize:" + this$0.mDeviceSidSet.size() + ",current sid is " + this$0.getSid() + ", deviceSet is " + this$0.mDeviceSidSet + " ");
            for (final String str : this$0.mDeviceSidSet) {
                Logger.i(TAG, "start triggerFetchFitnessReport sid is " + str);
                TrainingLoadViewModel trainingLoadViewModel = this$0.trainingLoadViewModel;
                Intrinsics.checkNotNull(trainingLoadViewModel);
                LocalDate mCurrentDate = this$0.getMCurrentDate();
                Intrinsics.checkNotNull(mCurrentDate);
                final LiveData<List<DailyBasicReport>> liveDataTriggerFetchFitnessReport = trainingLoadViewModel.triggerFetchFitnessReport(ITrainingLoadRepository.class, "weeks", TimeDateUtil.changZeroOfTheDay(mCurrentDate), 4, 0, str);
                liveDataTriggerFetchFitnessReport.observe(this$0.getViewLifecycleOwner(), new TrainingLoadDetailFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: mtp
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return TrainingLoadDetailFragment.requestData$lambda$3$lambda$2$lambda$1$lambda$0(this.f27208a, str, liveDataTriggerFetchFitnessReport, (List) obj);
                    }
                }));
            }
        }
        queryDeviceLiveData.removeObservers(this$0.getViewLifecycleOwner());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestData$lambda$3$lambda$2$lambda$1$lambda$0(TrainingLoadDetailFragment this$0, String it, LiveData reportLiveData, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(reportLiveData, "$reportLiveData");
        if (!ArrayUtils.isEmpty(list)) {
            DailyBasicReport dailyBasicReport = (DailyBasicReport) list.get(0);
            if (dailyBasicReport instanceof DailyTrainingLoadReport) {
                this$0.mSidReportMap.put(it, (DailyTrainingLoadReport) dailyBasicReport);
            }
            Logger.i(TAG, "mSidReportMap update , sid " + it + " , report is " + dailyBasicReport);
        }
        this$0.refreshView();
        reportLiveData.removeObservers(this$0.getViewLifecycleOwner());
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
    public final RecyclerView getMCardRecyclerDetail() {
        return this.mCardRecyclerDetail;
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
    public final View getUnderstandCard() {
        return this.understandCard;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        updateRecyclerDetailLayoutManager();
        updateLevelBarRecyclerViewMargin();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        this._binding = bla.A0(inflater, container, false);
        this.mLineChartRecyclerView = getBinding().F;
        this.understandCard = getBinding().I;
        this.mCardRecyclerDetail = getBinding().G;
        this.mLevelBarView = getBinding().D;
        this.mLevelDescRecyclerView = getBinding().E;
        this.deviceListView = getBinding().B;
        this.mDataTitleView = getBinding().A;
        View root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        requestData();
    }

    @Override // com.xiaomi.fitness.base.BaseDetailChildFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        this.trainingLoadViewModel = (TrainingLoadViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(TrainingLoadViewModel.class);
        initView();
    }

    public final void setMCardRecyclerDetail(@Nullable RecyclerView recyclerView) {
        this.mCardRecyclerDetail = recyclerView;
    }

    public final void setMLevelBarView(@Nullable LevelBarView levelBarView) {
        this.mLevelBarView = levelBarView;
    }

    public final void setMLevelDescRecyclerView(@Nullable RecyclerView recyclerView) {
        this.mLevelDescRecyclerView = recyclerView;
    }

    public final void setUnderstandCard(@Nullable View view) {
        this.understandCard = view;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailChildFragment
    public int xAxisPosition() {
        return 0;
    }
}
