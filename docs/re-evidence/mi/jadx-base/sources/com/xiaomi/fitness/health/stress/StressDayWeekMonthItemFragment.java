package com.xiaomi.fitness.health.stress;

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
import com.xiaomi.fit.fitness.export.api.repository.IStressRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStressReport;
import com.xiaomi.fit.fitness.export.data.item.FitnessDeviceItem;
import com.xiaomi.fit.fitness.export.data.item.StressItem;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.base.BasicDataViewModel;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.devicelist.SportsDeviceListView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.recycer.BarChartRecyclerHelper;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.data.valueformatter.DayStressHighLightMarkValueFormatter;
import com.xiaomi.fitness.data.valueformatter.StressHighLightMarkValueFormatter;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.stress.StressDayWeekMonthItemFragment;
import com.xiaomi.fitness.health.stress.StressViewModel;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.util.PingAnHealthExtKt;
import com.xiaomi.fitness.util.StressDataUtil;
import com.xiaomi.fitness.view.DataTitleView;
import com.xiaomi.fitness.view.HealthBannerCardSetView;
import com.xiaomi.fitness.widget.distribute.DistributeDataUtil;
import defpackage.ako;
import defpackage.bl5;
import defpackage.c0j;
import defpackage.hak;
import defpackage.onq;
import defpackage.opo;
import defpackage.pni;
import defpackage.qpo;
import defpackage.r02;
import defpackage.s02;
import defpackage.tjo;
import defpackage.uz6;
import defpackage.vnq;
import defpackage.vqr;
import defpackage.xcm;
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
@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000 ¨\u0001*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\u0002¨\u0001B\b¢\u0006\u0005\b§\u0001\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\bJ\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\bJ\u001f\u0010\u001c\u001a\u00020\u00062\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\bJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010\bJ\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\bJ!\u0010%\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0006H&¢\u0006\u0004\b'\u0010\bJ\u000f\u0010(\u001a\u00020\u0006H&¢\u0006\u0004\b(\u0010\bJ\u000f\u0010)\u001a\u00020\u0006H&¢\u0006\u0004\b)\u0010\bJ\u0017\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-R$\u0010/\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u00105\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010<\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010C\u001a\u0004\u0018\u00010B8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010J\u001a\u0004\u0018\u00010I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR,\u0010U\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010T\u0018\u00010S8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010\u001dR\u0018\u0010[\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u001c\u0010^\u001a\b\u0012\u0002\b\u0003\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010a\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010c\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR$\u0010f\u001a\u0004\u0018\u00010e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR$\u0010m\u001a\u0004\u0018\u00010l8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\u0018\u0010t\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u001e\u0010w\u001a\n\u0012\u0004\u0012\u00020v\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010VR$\u0010x\u001a\u0004\u0018\u00010l8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010n\u001a\u0004\by\u0010p\"\u0004\bz\u0010rR\u0018\u0010|\u001a\u0004\u0018\u00010{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u001e\u0010\u007f\u001a\n\u0012\u0004\u0012\u00020~\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010VR,\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R!\u0010\u0089\u0001\u001a\n\u0012\u0005\u0012\u00030\u0088\u00010\u0087\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R,\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001c\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R(\u0010\u0096\u0001\u001a\u0011\u0012\u0005\u0012\u00030\u0088\u0001\u0012\u0005\u0012\u00030\u0095\u00010\u0094\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R,\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0095\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0018\u0010 \u0001\u001a\u00030\u0088\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0018\u0010¢\u0001\u001a\u00030\u0088\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010\u009f\u0001R\u0018\u0010¦\u0001\u001a\u00030£\u00018$X¤\u0004¢\u0006\b\u001a\u0006\b¤\u0001\u0010¥\u0001¨\u0006©\u0001"}, d2 = {"Lcom/xiaomi/fitness/health/stress/StressDayWeekMonthItemFragment;", "Lcom/xiaomi/fitness/health/stress/StressViewModel;", "VM", "Landroidx/databinding/ViewDataBinding;", "VDB", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "", "initView", "()V", "initHealthBanners", "initUnderstandCard", "initDeviceViewCard", "refreshViewIfNeed", "refreshDistributeCard", "refreshDetailCard", "refreshBarChart", "initDistributeCard", "initDetailCard", "updateRecyclerDetailLayoutManager", "updateRecyclerDistributeLayoutManager", "initBarChart", "Lonq;", "createHighLightFormatter", "()Lonq;", Constants.KEY_REQUEST_DATA, "", "Lcom/xiaomi/fit/fitness/export/data/item/FitnessDeviceItem;", "deviceList", "onDeviceListChanged", "(Ljava/util/List;)V", "cleanDataList", "initBundle", LifecycleConstantKt.ON_RESUME, "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "initStressFaceChart", "refreshStressFaceView", "initViewBinding", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lorg/joda/time/LocalDate;", "mCurrentLocalDate", "Lorg/joda/time/LocalDate;", "getMCurrentLocalDate", "()Lorg/joda/time/LocalDate;", "setMCurrentLocalDate", "(Lorg/joda/time/LocalDate;)V", "containerView", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "setContainerView", "(Landroid/view/View;)V", "Lcom/xiaomi/fitness/view/HealthBannerCardSetView;", "healthBannerCardSetView", "Lcom/xiaomi/fitness/view/HealthBannerCardSetView;", "getHealthBannerCardSetView", "()Lcom/xiaomi/fitness/view/HealthBannerCardSetView;", "setHealthBannerCardSetView", "(Lcom/xiaomi/fitness/view/HealthBannerCardSetView;)V", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "mBarChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "getMBarChartRecyclerView", "()Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "setMBarChartRecyclerView", "(Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;)V", "Lcom/xiaomi/fitness/view/DataTitleView;", "dataTitleView", "Lcom/xiaomi/fitness/view/DataTitleView;", "getDataTitleView", "()Lcom/xiaomi/fitness/view/DataTitleView;", "setDataTitleView", "(Lcom/xiaomi/fitness/view/DataTitleView;)V", "Ltjo;", "mBarChartAdapter", "Ltjo;", "", "Lcom/xiaomi/fitness/chart/entrys/SegmentBarEntry;", "mBarEntries", "Ljava/util/List;", "getMBarEntries", "()Ljava/util/List;", "setMBarEntries", "Ls02;", "mItemDecoration", "Ls02;", "Lvnq;", "mYAxis", "Lvnq;", "Lvqr;", "mXAxis", "Lvqr;", "valueFormatter", "Lonq;", "Lr02;", "mBarChartAttrs", "Lr02;", "getMBarChartAttrs", "()Lr02;", "setMBarChartAttrs", "(Lr02;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerDetail", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerDetail", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerDetail", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lopo;", "mDetailAdapter", "Lopo;", "Lqpo;", "mDataListDetail", "recyclerStressDistribute", "getRecyclerStressDistribute", "setRecyclerStressDistribute", "Lako;", "mDistributeAdapter", "Lako;", "Luz6;", "mDataListDistribute", "Lcom/xiaomi/fitness/common/devicelist/SportsDeviceListView;", "mDeviceListView", "Lcom/xiaomi/fitness/common/devicelist/SportsDeviceListView;", "getMDeviceListView", "()Lcom/xiaomi/fitness/common/devicelist/SportsDeviceListView;", "setMDeviceListView", "(Lcom/xiaomi/fitness/common/devicelist/SportsDeviceListView;)V", "", "", "mDeviceSidSet", "Ljava/util/Set;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "understandCard", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getUnderstandCard", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setUnderstandCard", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "mSid", "Ljava/lang/String;", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStressReport;", "mSidReportMap", "Ljava/util/Map;", "mDailyStressReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStressReport;", "getMDailyStressReport", "()Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStressReport;", "setMDailyStressReport", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStressReport;)V", "getEmptyTitleStr", "()Ljava/lang/String;", "emptyTitleStr", "getViewTag", CloudContract.COL_VIEW_TAG, "", "getFragmentPosition", "()I", "fragmentPosition", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nStressDayWeekMonthItemFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StressDayWeekMonthItemFragment.kt\ncom/xiaomi/fitness/health/stress/StressDayWeekMonthItemFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,466:1\n1863#2,2:467\n1863#2,2:469\n1863#2,2:471\n*S KotlinDebug\n*F\n+ 1 StressDayWeekMonthItemFragment.kt\ncom/xiaomi/fitness/health/stress/StressDayWeekMonthItemFragment\n*L\n414#1:467,2\n419#1:469,2\n376#1:471,2\n*E\n"})
public abstract class StressDayWeekMonthItemFragment<VM extends StressViewModel, VDB extends ViewDataBinding> extends BaseBindingFragment<VM, VDB> {

    @NotNull
    public static final String TAG = "MiHealth:stress";

    @Nullable
    private View containerView;

    @Nullable
    private DataTitleView dataTitleView;

    @Nullable
    private HealthBannerCardSetView healthBannerCardSetView;

    @Nullable
    private tjo mBarChartAdapter;

    @Nullable
    private r02 mBarChartAttrs;

    @Nullable
    private BarChartRecyclerView mBarChartRecyclerView;

    @Nullable
    private List<SegmentBarEntry> mBarEntries;

    @Nullable
    private LocalDate mCurrentLocalDate;

    @Nullable
    private DailyStressReport mDailyStressReport;

    @Nullable
    private List<qpo> mDataListDetail;

    @Nullable
    private List<uz6> mDataListDistribute;

    @Nullable
    private opo mDetailAdapter;

    @Nullable
    private SportsDeviceListView mDeviceListView;

    @Nullable
    private ako mDistributeAdapter;

    @Nullable
    private s02 mItemDecoration;

    @Nullable
    private String mSid;

    @Nullable
    private vqr mXAxis;

    @Nullable
    private vnq<?> mYAxis;

    @Nullable
    private RecyclerView recyclerDetail;

    @Nullable
    private RecyclerView recyclerStressDistribute;

    @Nullable
    private ConstraintLayout understandCard;

    @Nullable
    private onq valueFormatter;

    @NotNull
    private Set<String> mDeviceSidSet = new HashSet();

    @NotNull
    private Map<String, DailyStressReport> mSidReportMap = new HashMap();

    private final void cleanDataList() {
        this.mDailyStressReport = null;
        this.mSidReportMap.clear();
        this.mDeviceSidSet.clear();
    }

    private final onq createHighLightFormatter() {
        return getFragmentPosition() == 0 ? new DayStressHighLightMarkValueFormatter(requireContext()) : new StressHighLightMarkValueFormatter(requireContext());
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

    private final void initBarChart() {
        BarChartRecyclerView barChartRecyclerView = this.mBarChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView);
        this.mBarChartAttrs = (r02) barChartRecyclerView.mAttrs;
        BarChartRecyclerHelper barChartRecyclerHelper = BarChartRecyclerHelper.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        this.valueFormatter = barChartRecyclerHelper.createXAxisFormatter(contextRequireContext, getFragmentPosition());
        this.mBarEntries = new ArrayList();
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(getActivity(), this.mBarChartAttrs);
        this.mYAxis = vnq.o(this.mBarChartAttrs, 100.0f);
        r02 r02Var = this.mBarChartAttrs;
        Intrinsics.checkNotNull(r02Var);
        vqr vqrVar = new vqr(r02Var, r02Var.c, this.valueFormatter);
        this.mXAxis = vqrVar;
        this.mItemDecoration = new s02(this.mYAxis, vqrVar, this.mBarChartAttrs);
        onq onqVarCreateHighLightFormatter = createHighLightFormatter();
        s02 s02Var = this.mItemDecoration;
        Intrinsics.checkNotNull(s02Var);
        s02Var.setHighLightValueFormatter(onqVarCreateHighLightFormatter);
        BarChartRecyclerView barChartRecyclerView2 = this.mBarChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView2);
        s02 s02Var2 = this.mItemDecoration;
        Intrinsics.checkNotNull(s02Var2);
        barChartRecyclerView2.addItemDecoration(s02Var2);
        this.mBarChartAdapter = new tjo(getActivity(), this.mBarEntries, this.mBarChartRecyclerView, this.mXAxis, this.mBarChartAttrs, onqVarCreateHighLightFormatter);
        BarChartRecyclerView barChartRecyclerView3 = this.mBarChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView3);
        barChartRecyclerView3.setAdapter(this.mBarChartAdapter);
        BarChartRecyclerView barChartRecyclerView4 = this.mBarChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView4);
        barChartRecyclerView4.setLayoutManager(speedRatioLayoutManager);
        BarChartRecyclerView barChartRecyclerView5 = this.mBarChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView5);
        barChartRecyclerView5.setNestedScrollingEnabled(false);
        hak hakVar = new hak(getActivity(), this.mBarChartRecyclerView, new xcm(this) { // from class: com.xiaomi.fitness.health.stress.StressDayWeekMonthItemFragment$initBarChart$itemGestureListener$1
            final /* synthetic */ StressDayWeekMonthItemFragment<VM, VDB> this$0;

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
        BarChartRecyclerView barChartRecyclerView6 = this.mBarChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView6);
        barChartRecyclerView6.addOnItemTouchListener(hakVar);
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
        bl5 bl5Var = new bl5();
        RecyclerView recyclerView = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.addItemDecoration(bl5Var);
        this.mDetailAdapter = new opo(getMActivity(), this.mDataListDetail, c0j.I6, pni.F3);
        updateRecyclerDetailLayoutManager();
        RecyclerView recyclerView2 = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setAdapter(this.mDetailAdapter);
        RecyclerView recyclerView3 = this.recyclerDetail;
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
            sportsDeviceListView2.refreshIcon(pni.j2);
        }
        SportsDeviceListView sportsDeviceListView3 = this.mDeviceListView;
        if (sportsDeviceListView3 != null) {
            sportsDeviceListView3.setDeviceSelectedListener(new SportsDeviceListView.DeviceSelectedListener(this) { // from class: com.xiaomi.fitness.health.stress.StressDayWeekMonthItemFragment.initDeviceViewCard.1
                final /* synthetic */ StressDayWeekMonthItemFragment<VM, VDB> this$0;

                {
                    this.this$0 = this;
                }

                @Override // com.xiaomi.fitness.common.devicelist.SportsDeviceListView.DeviceSelectedListener
                public void deviceSelected(String did, boolean isClick) {
                    Intrinsics.checkNotNullParameter(did, "did");
                    ((StressDayWeekMonthItemFragment) this.this$0).mSid = did;
                    Logger.i(StressDayWeekMonthItemFragment.TAG, "数据源切换:" + did);
                    this.this$0.refreshViewIfNeed();
                }
            });
        }
    }

    private final void initDistributeCard() {
        this.mDataListDistribute = new ArrayList();
        bl5 bl5Var = new bl5(false);
        RecyclerView recyclerView = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.addItemDecoration(bl5Var);
        this.mDistributeAdapter = new ako(getMActivity(), this.mDataListDistribute, 4);
        updateRecyclerDistributeLayoutManager();
        RecyclerView recyclerView2 = this.recyclerStressDistribute;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setAdapter(this.mDistributeAdapter);
        RecyclerView recyclerView3 = this.recyclerStressDistribute;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setHasFixedSize(true);
    }

    private final void initHealthBanners() {
        HealthBannerCardSetView healthBannerCardSetView = this.healthBannerCardSetView;
        if (healthBannerCardSetView != null) {
            PingAnHealthExtKt.bindOneBanner(healthBannerCardSetView, 1);
        }
    }

    private final void initUnderstandCard() {
        ConstraintLayout constraintLayout = this.understandCard;
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: xjo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StressDayWeekMonthItemFragment.initUnderstandCard$lambda$0(this.f39195a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initUnderstandCard$lambda$0(StressDayWeekMonthItemFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseFragmentExKt.gotoPage(this$0, StressUnderstandFragment.class, null);
    }

    private final void initView() {
        initBarChart();
        initDetailCard();
        initDistributeCard();
        initDeviceViewCard();
        initUnderstandCard();
        initStressFaceChart();
        initHealthBanners();
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

    private final void refreshBarChart() {
        List<SegmentBarEntry> list = this.mBarEntries;
        if (list != null) {
            list.clear();
        }
        StressDataUtil stressDataUtil = StressDataUtil.INSTANCE;
        DailyStressReport dailyStressReport = this.mDailyStressReport;
        r02 r02Var = this.mBarChartAttrs;
        Intrinsics.checkNotNull(r02Var);
        List<SegmentBarEntry> barChartEntries = stressDataUtil.getBarChartEntries(dailyStressReport, r02Var, getFragmentPosition(), this.mCurrentLocalDate);
        List<SegmentBarEntry> list2 = this.mBarEntries;
        if (list2 != null) {
            list2.clear();
        }
        List<SegmentBarEntry> list3 = this.mBarEntries;
        if (list3 != null) {
            list3.addAll(barChartEntries);
        }
        tjo tjoVar = this.mBarChartAdapter;
        Intrinsics.checkNotNull(tjoVar);
        tjoVar.notifyDataSetChanged();
        if (this.mDailyStressReport == null) {
            DataTitleView dataTitleView = this.dataTitleView;
            if (dataTitleView != null) {
                dataTitleView.c(getEmptyTitleStr());
            }
        } else if (getFragmentPosition() == 0) {
            DailyStressReport dailyStressReport2 = this.mDailyStressReport;
            Intrinsics.checkNotNull(dailyStressReport2);
            StressItem latestStressRecord = dailyStressReport2.getLatestStressRecord();
            if (latestStressRecord == null || latestStressRecord.getStress() <= 0) {
                DataTitleView dataTitleView2 = this.dataTitleView;
                if (dataTitleView2 != null) {
                    dataTitleView2.c(getEmptyTitleStr());
                }
            } else {
                String strValueOf = String.valueOf(latestStressRecord.getStress());
                String stressTypeNameAsValue = StressDataUtil.getStressTypeNameAsValue(latestStressRecord.getStress());
                String dateHHmm24Format = TimeDateUtil.getDateHHmm24Format(latestStressRecord.getTime());
                DataTitleView dataTitleView3 = this.dataTitleView;
                if (dataTitleView3 != null) {
                    Context contextRequireContext = requireContext();
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String str = String.format("%d %s", Arrays.copyOf(new Object[]{Integer.valueOf(latestStressRecord.getStress()), stressTypeNameAsValue}, 2));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    dataTitleView3.a(contextRequireContext, str, strValueOf, dateHHmm24Format);
                }
            }
        } else {
            DailyStressReport dailyStressReport3 = this.mDailyStressReport;
            Intrinsics.checkNotNull(dailyStressReport3);
            int avgStress = dailyStressReport3.getAvgStress();
            if (avgStress == 0) {
                DataTitleView dataTitleView4 = this.dataTitleView;
                if (dataTitleView4 != null) {
                    dataTitleView4.c(getEmptyTitleStr());
                }
            } else {
                String stressTypeNameAsValue2 = StressDataUtil.getStressTypeNameAsValue(avgStress);
                DataTitleView dataTitleView5 = this.dataTitleView;
                if (dataTitleView5 != null) {
                    Context contextRequireContext2 = requireContext();
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    String str2 = String.format("%d %s", Arrays.copyOf(new Object[]{Integer.valueOf(avgStress), stressTypeNameAsValue2}, 2));
                    Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                    dataTitleView5.a(contextRequireContext2, str2, String.valueOf(avgStress), getString(c0j.Jl));
                }
            }
        }
        if (getFragmentPosition() == 0) {
            refreshStressFaceView();
        }
    }

    private final void refreshDetailCard() {
        if (this.mDailyStressReport == null) {
            RecyclerView recyclerView = this.recyclerDetail;
            Intrinsics.checkNotNull(recyclerView);
            recyclerView.setVisibility(8);
            return;
        }
        StressDataUtil stressDataUtil = StressDataUtil.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        List<qpo> listCreateSummaryViewModelList = stressDataUtil.createSummaryViewModelList(contextRequireContext, this.mDailyStressReport);
        if (ArrayUtils.isEmpty(listCreateSummaryViewModelList)) {
            RecyclerView recyclerView2 = this.recyclerDetail;
            Intrinsics.checkNotNull(recyclerView2);
            recyclerView2.setVisibility(8);
            return;
        }
        RecyclerView recyclerView3 = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setVisibility(0);
        List<qpo> list = this.mDataListDetail;
        Intrinsics.checkNotNull(list);
        list.clear();
        List<qpo> list2 = this.mDataListDetail;
        Intrinsics.checkNotNull(list2);
        list2.addAll(listCreateSummaryViewModelList);
        opo opoVar = this.mDetailAdapter;
        Intrinsics.checkNotNull(opoVar);
        DailyStressReport dailyStressReport = this.mDailyStressReport;
        Intrinsics.checkNotNull(dailyStressReport);
        opoVar.setHeaderViewTitle(qpo.a(dailyStressReport.getTag()));
        opo opoVar2 = this.mDetailAdapter;
        Intrinsics.checkNotNull(opoVar2);
        opoVar2.notifyDataChanged();
    }

    private final void refreshDistributeCard() {
        if (this.mDailyStressReport == null) {
            RecyclerView recyclerView = this.recyclerStressDistribute;
            Intrinsics.checkNotNull(recyclerView);
            recyclerView.setVisibility(8);
            return;
        }
        StressDataUtil stressDataUtil = StressDataUtil.INSTANCE;
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        DailyStressReport dailyStressReport = this.mDailyStressReport;
        Intrinsics.checkNotNull(dailyStressReport);
        List<uz6> listCreateDistributeModelList = stressDataUtil.createDistributeModelList(mActivity, dailyStressReport);
        if (listCreateDistributeModelList == null || listCreateDistributeModelList.size() <= 0) {
            RecyclerView recyclerView2 = this.recyclerStressDistribute;
            Intrinsics.checkNotNull(recyclerView2);
            recyclerView2.setVisibility(8);
            return;
        }
        DistributeDataUtil.setPositionOfList(listCreateDistributeModelList);
        RecyclerView recyclerView3 = this.recyclerStressDistribute;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setVisibility(0);
        List<uz6> list = this.mDataListDistribute;
        Intrinsics.checkNotNull(list);
        list.clear();
        List<uz6> list2 = this.mDataListDistribute;
        Intrinsics.checkNotNull(list2);
        list2.addAll(listCreateDistributeModelList);
        ako akoVar = this.mDistributeAdapter;
        Intrinsics.checkNotNull(akoVar);
        akoVar.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshViewIfNeed() {
        DailyStressReport dailyStressReport = this.mSidReportMap.isEmpty() ? null : this.mSidReportMap.get(this.mSid);
        this.mDailyStressReport = dailyStressReport;
        Logger.i(TAG, "refreshViewIfNeed StressReport .. " + (dailyStressReport != null ? dailyStressReport.toString() : null));
        refreshBarChart();
        refreshDetailCard();
        refreshDistributeCard();
    }

    private final void requestData() {
        long jChangZeroOfTheDay;
        cleanDataList();
        LocalDate localDate = this.mCurrentLocalDate;
        Intrinsics.checkNotNull(localDate);
        final long jChangZeroOfTheDay2 = TimeDateUtil.changZeroOfTheDay(localDate);
        if (getFragmentPosition() == 0) {
            LocalDate localDate2 = this.mCurrentLocalDate;
            Intrinsics.checkNotNull(localDate2);
            LocalDate localDatePlusDays = localDate2.plusDays(1);
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
            jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDatePlusDays);
        } else {
            BarChartRecyclerHelper barChartRecyclerHelper = BarChartRecyclerHelper.INSTANCE;
            int fragmentPosition = getFragmentPosition();
            LocalDate localDate3 = this.mCurrentLocalDate;
            Intrinsics.checkNotNull(localDate3);
            LocalDate localDatePlusDays2 = barChartRecyclerHelper.getWeekOrMonthEndDate(fragmentPosition, localDate3).plusDays(1);
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays2, "plusDays(...)");
            jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDatePlusDays2);
        }
        Logger.i(TAG, "start request device data.." + this.mCurrentLocalDate + "/params start:" + jChangZeroOfTheDay2 + "/end:" + jChangZeroOfTheDay);
        final LiveData<List<FitnessDeviceItem>> liveDataQueryDeviceList = getMViewModel().queryDeviceList(jChangZeroOfTheDay2, jChangZeroOfTheDay);
        liveDataQueryDeviceList.observe(getViewLifecycleOwner(), new StressDayWeekMonthItemFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: wjo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return StressDayWeekMonthItemFragment.requestData$lambda$4(this.f38038a, liveDataQueryDeviceList, jChangZeroOfTheDay2, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit requestData$lambda$4(final StressDayWeekMonthItemFragment this$0, LiveData queryDeviceLiveData, long j, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(queryDeviceLiveData, "$queryDeviceLiveData");
        if (list == null || !(!list.isEmpty())) {
            Logger.i(TAG, "queryDeviceList null");
            this$0.onDeviceListChanged(null);
            this$0.refreshViewIfNeed();
        } else {
            if (TextUtils.isEmpty(this$0.mSid)) {
                this$0.mSid = ((FitnessDeviceItem) list.get(0)).getSid();
            }
            this$0.onDeviceListChanged(list);
            for (final String str : this$0.mDeviceSidSet) {
                Logger.i(TAG, "start request fitness data by sid " + str + " /params start:" + j + "/tag:" + this$0.getViewTag());
                final LiveData<List<DailyBasicReport>> liveDataTriggerFetchFitnessReport = ((BasicDataViewModel) this$0.getMViewModel()).triggerFetchFitnessReport(IStressRepository.class, this$0.getViewTag(), j, 0, 0, str);
                liveDataTriggerFetchFitnessReport.observe(this$0.getViewLifecycleOwner(), new StressDayWeekMonthItemFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: yjo
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return StressDayWeekMonthItemFragment.requestData$lambda$4$lambda$3$lambda$2$lambda$1(this.f40251a, str, liveDataTriggerFetchFitnessReport, (List) obj);
                    }
                }));
            }
        }
        queryDeviceLiveData.removeObservers(this$0.getViewLifecycleOwner());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestData$lambda$4$lambda$3$lambda$2$lambda$1(StressDayWeekMonthItemFragment this$0, String sid, LiveData reportLiveData, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sid, "$sid");
        Intrinsics.checkNotNullParameter(reportLiveData, "$reportLiveData");
        if (!ArrayUtils.isEmpty(list)) {
            DailyBasicReport dailyBasicReport = (DailyBasicReport) list.get(0);
            if (dailyBasicReport instanceof DailyStressReport) {
                this$0.mSidReportMap.put(sid, (DailyStressReport) dailyBasicReport);
            }
        }
        this$0.refreshViewIfNeed();
        reportLiveData.removeObservers(this$0.getViewLifecycleOwner());
        return Unit.INSTANCE;
    }

    private final void updateRecyclerDetailLayoutManager() {
        RecyclerView recyclerView;
        if (getMActivity() == null || this.mDetailAdapter == null || (recyclerView = this.recyclerDetail) == null) {
            return;
        }
        HealthUtil healthUtil = HealthUtil.INSTANCE;
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        opo opoVar = this.mDetailAdapter;
        Intrinsics.checkNotNull(opoVar);
        recyclerView.setLayoutManager(healthUtil.buildCommonDataAdapterLayoutManager(mActivity, opoVar));
    }

    private final void updateRecyclerDistributeLayoutManager() {
        RecyclerView recyclerView;
        if (getMActivity() == null || this.mDistributeAdapter == null || (recyclerView = this.recyclerStressDistribute) == null) {
            return;
        }
        HealthUtil healthUtil = HealthUtil.INSTANCE;
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        ako akoVar = this.mDistributeAdapter;
        Intrinsics.checkNotNull(akoVar);
        recyclerView.setLayoutManager(healthUtil.buildCommonDataAdapterLayoutManager(mActivity, akoVar));
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
    public final HealthBannerCardSetView getHealthBannerCardSetView() {
        return this.healthBannerCardSetView;
    }

    @Nullable
    public final r02 getMBarChartAttrs() {
        return this.mBarChartAttrs;
    }

    @Nullable
    public final BarChartRecyclerView getMBarChartRecyclerView() {
        return this.mBarChartRecyclerView;
    }

    @Nullable
    public final List<SegmentBarEntry> getMBarEntries() {
        return this.mBarEntries;
    }

    @Nullable
    public final LocalDate getMCurrentLocalDate() {
        return this.mCurrentLocalDate;
    }

    @Nullable
    public final DailyStressReport getMDailyStressReport() {
        return this.mDailyStressReport;
    }

    @Nullable
    public final SportsDeviceListView getMDeviceListView() {
        return this.mDeviceListView;
    }

    @Nullable
    public final RecyclerView getRecyclerDetail() {
        return this.recyclerDetail;
    }

    @Nullable
    public final RecyclerView getRecyclerStressDistribute() {
        return this.recyclerStressDistribute;
    }

    @Nullable
    public final ConstraintLayout getUnderstandCard() {
        return this.understandCard;
    }

    public abstract void initStressFaceChart();

    public abstract void initViewBinding();

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        updateRecyclerDetailLayoutManager();
        updateRecyclerDistributeLayoutManager();
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

    public abstract void refreshStressFaceView();

    public final void setContainerView(@Nullable View view) {
        this.containerView = view;
    }

    public final void setDataTitleView(@Nullable DataTitleView dataTitleView) {
        this.dataTitleView = dataTitleView;
    }

    public final void setHealthBannerCardSetView(@Nullable HealthBannerCardSetView healthBannerCardSetView) {
        this.healthBannerCardSetView = healthBannerCardSetView;
    }

    public final void setMBarChartAttrs(@Nullable r02 r02Var) {
        this.mBarChartAttrs = r02Var;
    }

    public final void setMBarChartRecyclerView(@Nullable BarChartRecyclerView barChartRecyclerView) {
        this.mBarChartRecyclerView = barChartRecyclerView;
    }

    public final void setMBarEntries(@Nullable List<SegmentBarEntry> list) {
        this.mBarEntries = list;
    }

    public final void setMCurrentLocalDate(@Nullable LocalDate localDate) {
        this.mCurrentLocalDate = localDate;
    }

    public final void setMDailyStressReport(@Nullable DailyStressReport dailyStressReport) {
        this.mDailyStressReport = dailyStressReport;
    }

    public final void setMDeviceListView(@Nullable SportsDeviceListView sportsDeviceListView) {
        this.mDeviceListView = sportsDeviceListView;
    }

    public final void setRecyclerDetail(@Nullable RecyclerView recyclerView) {
        this.recyclerDetail = recyclerView;
    }

    public final void setRecyclerStressDistribute(@Nullable RecyclerView recyclerView) {
        this.recyclerStressDistribute = recyclerView;
    }

    public final void setUnderstandCard(@Nullable ConstraintLayout constraintLayout) {
        this.understandCard = constraintLayout;
    }
}
