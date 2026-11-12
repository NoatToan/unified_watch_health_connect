package com.xiaomi.fitness.health.bloodglucose.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.api.repository.IBloodSugarRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBloodSugarReport;
import com.xiaomi.fit.fitness.export.data.aggregation.StatisticBloodSugar;
import com.xiaomi.fit.fitness.export.data.item.BloodSugarItem;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.barchart.itemdecoration.BloodGlucoseLineChartItemDecoration;
import com.xiaomi.fitness.chart.entrys.BloodGlucoseEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.data.valueformatter.BloodGlucoseHighLightMarkValueFormatter;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.bloodglucose.BloodGlucoseViewModel;
import com.xiaomi.fitness.health.bloodglucose.holder.FingerMealTimeDetailAdapter;
import com.xiaomi.fitness.health.bloodglucose.ui.BloodGlucoseFingerBaseWeekMonthFragment;
import com.xiaomi.fitness.health.bloodglucose.util.BloodGlucoseDataUtil;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.util.PingAnHealthExtKt;
import com.xiaomi.fitness.view.DataTitleView;
import com.xiaomi.fitness.view.HealthBannerCardSetView;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.fitness.widget.distribute.DistributeDataUtil;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;
import defpackage.bl5;
import defpackage.brr;
import defpackage.c0j;
import defpackage.cx2;
import defpackage.jrr;
import defpackage.opo;
import defpackage.pni;
import defpackage.qpo;
import defpackage.qxi;
import defpackage.rtr;
import defpackage.s13;
import defpackage.sf2;
import defpackage.ux2;
import defpackage.uz6;
import defpackage.vfe;
import defpackage.vqr;
import defpackage.xcm;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\b¢\u0006\u0005\b\u009f\u0001\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\bJ\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\bJ\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u000f\u0010\u0017\u001a\u00020\u0006H&¢\u0006\u0004\b\u0017\u0010\bJ\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\bJ!\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082D¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R$\u0010)\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010(\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010.\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00105\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010<\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001e\u0010D\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u001e\u0010H\u001a\n\u0012\u0004\u0012\u00020G\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010T\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR$\u0010W\u001a\u0004\u0018\u00010V8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u0018\u0010^\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u001e\u0010a\u001a\n\u0012\u0004\u0012\u00020`\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010IR$\u0010b\u001a\u0004\u0018\u00010V8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010X\u001a\u0004\bc\u0010Z\"\u0004\bd\u0010\\R\u0018\u0010f\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u001e\u0010i\u001a\n\u0012\u0004\u0012\u00020h\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010IR$\u0010k\u001a\u0004\u0018\u00010j8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR$\u0010r\u001a\u0004\u0018\u00010q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR$\u0010x\u001a\u0004\u0018\u00010V8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010X\u001a\u0004\by\u0010Z\"\u0004\bz\u0010\\R)\u0010|\u001a\b\u0012\u0004\u0012\u00020{0F8\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b|\u0010I\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R,\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R(\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0088\u0001\u0010/\u001a\u0005\b\u0089\u0001\u00101\"\u0005\b\u008a\u0001\u00103R,\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R(\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0092\u0001\u0010/\u001a\u0005\b\u0093\u0001\u00101\"\u0005\b\u0094\u0001\u00103R\u001c\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0095\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0017\u0010\u009a\u0001\u001a\u00020#8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0018\u0010\u009e\u0001\u001a\u00030\u009b\u00018$X¤\u0004¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001¨\u0006 \u0001"}, d2 = {"Lcom/xiaomi/fitness/health/bloodglucose/ui/BloodGlucoseFingerBaseWeekMonthFragment;", "Lcom/xiaomi/fitness/health/bloodglucose/BloodGlucoseViewModel;", "VM", "Landroidx/databinding/ViewDataBinding;", "VDB", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "", "initPointLineColor", "()V", "initView", "initUnderstandView", "initLineChartRecyclerView", "refreshBarChart", "initDistributeCard", "refreshDistributeCard", "initDetailCard", "updateRecyclerLayoutManager", "refreshDetailCard", "initSegmentRecycler", "refreshSegmentRecycle", Constants.KEY_REQUEST_DATA, "refreshViewOnReportChanged", "initBundle", "initViewBinding", LifecycleConstantKt.ON_RESUME, "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "", "MODEL_CGM", "Ljava/lang/String;", "Lorg/joda/time/LocalDate;", "mCurrentLocalDate", "Lorg/joda/time/LocalDate;", "mCurrentDate", "getMCurrentDate", "()Lorg/joda/time/LocalDate;", "setMCurrentDate", "(Lorg/joda/time/LocalDate;)V", "containerView", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "setContainerView", "(Landroid/view/View;)V", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "lineChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "getLineChartRecyclerView", "()Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "setLineChartRecyclerView", "(Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;)V", "Lcom/xiaomi/fitness/view/DataTitleView;", "dataTitleView", "Lcom/xiaomi/fitness/view/DataTitleView;", "getDataTitleView", "()Lcom/xiaomi/fitness/view/DataTitleView;", "setDataTitleView", "(Lcom/xiaomi/fitness/view/DataTitleView;)V", "Lux2;", "Lsf2;", "mLineChartAdapter", "Lux2;", "", "Lcom/xiaomi/fitness/chart/entrys/BloodGlucoseEntry;", "mChartEntries", "Ljava/util/List;", "Lcom/xiaomi/fitness/chart/barchart/itemdecoration/BloodGlucoseLineChartItemDecoration;", "mItemDecoration", "Lcom/xiaomi/fitness/chart/barchart/itemdecoration/BloodGlucoseLineChartItemDecoration;", "Lrtr;", "mYAxis", "Lrtr;", "Lvqr;", "mXAxis", "Lvqr;", "Lvfe;", "lineChartAttrs", "Lvfe;", "Landroidx/recyclerview/widget/RecyclerView;", "mDistributeRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getMDistributeRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setMDistributeRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lcx2;", "mDistributeAdapter", "Lcx2;", "Luz6;", "mDistributeData", "recyclerDetail", "getRecyclerDetail", "setRecyclerDetail", "Lopo;", "mDetailAdapter", "Lopo;", "Lqpo;", "mDataListDetail", "Landroid/widget/LinearLayout;", "mealTimeLinearView", "Landroid/widget/LinearLayout;", "getMealTimeLinearView", "()Landroid/widget/LinearLayout;", "setMealTimeLinearView", "(Landroid/widget/LinearLayout;)V", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "mealTimeTitleView", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "getMealTimeTitleView", "()Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "setMealTimeTitleView", "(Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;)V", "recyclerMealTime", "getRecyclerMealTime", "setRecyclerMealTime", "Lcom/xiaomi/fitness/health/bloodglucose/util/BloodGlucoseDataUtil$FingerMealTimeRecycleModel;", "mMealTimeDataList", "getMMealTimeDataList", "()Ljava/util/List;", "setMMealTimeDataList", "(Ljava/util/List;)V", "Lcom/xiaomi/fitness/health/bloodglucose/holder/FingerMealTimeDetailAdapter;", "mMealTimeAdapter", "Lcom/xiaomi/fitness/health/bloodglucose/holder/FingerMealTimeDetailAdapter;", "getMMealTimeAdapter", "()Lcom/xiaomi/fitness/health/bloodglucose/holder/FingerMealTimeDetailAdapter;", "setMMealTimeAdapter", "(Lcom/xiaomi/fitness/health/bloodglucose/holder/FingerMealTimeDetailAdapter;)V", "understandCard", "getUnderstandCard", "setUnderstandCard", "Lcom/xiaomi/fitness/view/HealthBannerCardSetView;", "healthBannerCardSetView", "Lcom/xiaomi/fitness/view/HealthBannerCardSetView;", "getHealthBannerCardSetView", "()Lcom/xiaomi/fitness/view/HealthBannerCardSetView;", "setHealthBannerCardSetView", "(Lcom/xiaomi/fitness/view/HealthBannerCardSetView;)V", "moreDeviceCard", "getMoreDeviceCard", "setMoreDeviceCard", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodSugarReport;", "mBloodSugarReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodSugarReport;", "getViewTag", "()Ljava/lang/String;", CloudContract.COL_VIEW_TAG, "", "getFragmentPosition", "()I", "fragmentPosition", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class BloodGlucoseFingerBaseWeekMonthFragment<VM extends BloodGlucoseViewModel, VDB extends ViewDataBinding> extends BaseBindingFragment<VM, VDB> {

    @Nullable
    private View containerView;

    @Nullable
    private DataTitleView dataTitleView;

    @Nullable
    private HealthBannerCardSetView healthBannerCardSetView;

    @Nullable
    private vfe lineChartAttrs;

    @Nullable
    private LineChartRecyclerView lineChartRecyclerView;

    @Nullable
    private DailyBloodSugarReport mBloodSugarReport;

    @Nullable
    private List<BloodGlucoseEntry> mChartEntries;

    @Nullable
    private LocalDate mCurrentDate;

    @Nullable
    private LocalDate mCurrentLocalDate;

    @Nullable
    private List<qpo> mDataListDetail;

    @Nullable
    private opo mDetailAdapter;

    @Nullable
    private cx2 mDistributeAdapter;

    @Nullable
    private List<uz6> mDistributeData;

    @Nullable
    private RecyclerView mDistributeRecyclerView;

    @Nullable
    private BloodGlucoseLineChartItemDecoration mItemDecoration;

    @Nullable
    private ux2<sf2> mLineChartAdapter;

    @Nullable
    private FingerMealTimeDetailAdapter mMealTimeAdapter;

    @Nullable
    private vqr mXAxis;

    @Nullable
    private rtr mYAxis;

    @Nullable
    private LinearLayout mealTimeLinearView;

    @Nullable
    private DataTitleSimpleView mealTimeTitleView;

    @Nullable
    private View moreDeviceCard;

    @Nullable
    private RecyclerView recyclerDetail;

    @Nullable
    private RecyclerView recyclerMealTime;

    @Nullable
    private View understandCard;

    @NotNull
    private final String MODEL_CGM = BloodGlucoseAllDayItemFragment.MODEL_CGM;

    @NotNull
    private List<BloodGlucoseDataUtil.FingerMealTimeRecycleModel> mMealTimeDataList = new ArrayList();

    private final String getViewTag() {
        int fragmentPosition = getFragmentPosition();
        if (fragmentPosition != 0) {
            return fragmentPosition != 1 ? "months" : "weeks";
        }
        return "days";
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    private final void initBundle() {
        LocalDate firstDayOfMonth;
        Bundle arguments = getArguments();
        Integer numValueOf = arguments != null ? Integer.valueOf(arguments.getInt("offset", 0)) : null;
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            firstDayOfMonth = getFragmentPosition() == 1 ? TimeDateUtil.getWeekMonday(LocalDate.now().minusWeeks(iIntValue)) : TimeDateUtil.getFirstDayOfMonth(LocalDate.now().minusMonths(iIntValue));
            if (firstDayOfMonth == null) {
                if (getFragmentPosition() == 1) {
                    firstDayOfMonth = TimeDateUtil.getWeekMonday(LocalDate.now());
                } else {
                    firstDayOfMonth = TimeDateUtil.getFirstDayOfMonth(LocalDate.now());
                }
            }
        } else if (getFragmentPosition() == 1) {
            firstDayOfMonth = TimeDateUtil.getWeekMonday(LocalDate.now());
        } else {
            firstDayOfMonth = TimeDateUtil.getFirstDayOfMonth(LocalDate.now());
        }
        this.mCurrentLocalDate = firstDayOfMonth;
    }

    private final void initDetailCard() {
        this.mDataListDetail = new ArrayList();
        RecyclerView recyclerView = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.addItemDecoration(new bl5());
        this.mDetailAdapter = new opo(getMActivity(), this.mDataListDetail, c0j.I6, pni.I);
        updateRecyclerLayoutManager();
        RecyclerView recyclerView2 = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setAdapter(this.mDetailAdapter);
        RecyclerView recyclerView3 = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setHasFixedSize(true);
    }

    private final void initDistributeCard() {
        this.mDistributeData = new ArrayList();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getMActivity(), 2);
        gridLayoutManager.D(new GridLayoutManager.b(this) { // from class: com.xiaomi.fitness.health.bloodglucose.ui.BloodGlucoseFingerBaseWeekMonthFragment.initDistributeCard.1
            final /* synthetic */ BloodGlucoseFingerBaseWeekMonthFragment<VM, VDB> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                cx2 cx2Var = ((BloodGlucoseFingerBaseWeekMonthFragment) this.this$0).mDistributeAdapter;
                Intrinsics.checkNotNull(cx2Var);
                return cx2Var.isHeaderView(position) ? 2 : 1;
            }
        });
        RecyclerView recyclerView = this.mDistributeRecyclerView;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setLayoutManager(gridLayoutManager);
        bl5 bl5Var = new bl5(false);
        RecyclerView recyclerView2 = this.mDistributeRecyclerView;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.addItemDecoration(bl5Var);
        cx2 cx2Var = new cx2(getMActivity(), this.mDistributeData, 11);
        this.mDistributeAdapter = cx2Var;
        Intrinsics.checkNotNull(cx2Var);
        cx2Var.setDistributeGuidIconClickListener(new cx2.c() { // from class: ix2
            @Override // cx2.c
            public final void onClick(int i) {
                BloodGlucoseFingerBaseWeekMonthFragment.initDistributeCard$lambda$1(this.f22186a, i);
            }
        });
        RecyclerView recyclerView3 = this.mDistributeRecyclerView;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setAdapter(this.mDistributeAdapter);
        RecyclerView recyclerView4 = this.mDistributeRecyclerView;
        Intrinsics.checkNotNull(recyclerView4);
        recyclerView4.setHasFixedSize(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initDistributeCard$lambda$1(BloodGlucoseFingerBaseWeekMonthFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WebViewUtilKt.startWebView$default(HealthUtil.INSTANCE.getUnderstandBloodSugarUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null)), this$0.getString(c0j.o1), false, false, null, false, null, false, 252, null);
    }

    private final void initLineChartRecyclerView() {
        LineChartRecyclerView lineChartRecyclerView = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView);
        this.lineChartAttrs = (vfe) lineChartRecyclerView.mAttrs;
        this.mChartEntries = new ArrayList();
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(getActivity(), this.lineChartAttrs);
        this.mYAxis = new rtr(this.lineChartAttrs);
        vfe vfeVar = this.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar);
        this.mXAxis = new vqr(vfeVar, vfeVar.c);
        rtr rtrVar = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar);
        rtrVar.setAxisMaximum(15.0f);
        rtr rtrVar2 = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar2);
        rtrVar2.setLabelCount(5);
        rtr rtrVar3 = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar3);
        rtrVar3.f = 5;
        vqr vqrVar = this.mXAxis;
        Intrinsics.checkNotNull(vqrVar);
        vqrVar.setValueFormatter(getFragmentPosition() == 1 ? new jrr() : new brr(requireContext()));
        this.mItemDecoration = new BloodGlucoseLineChartItemDecoration(this.mYAxis, this.mXAxis, this.lineChartAttrs, false, 8, null);
        BloodGlucoseHighLightMarkValueFormatter bloodGlucoseHighLightMarkValueFormatter = new BloodGlucoseHighLightMarkValueFormatter(0);
        BloodGlucoseLineChartItemDecoration bloodGlucoseLineChartItemDecoration = this.mItemDecoration;
        Intrinsics.checkNotNull(bloodGlucoseLineChartItemDecoration);
        bloodGlucoseLineChartItemDecoration.setHighLightValueFormatter(bloodGlucoseHighLightMarkValueFormatter);
        LineChartRecyclerView lineChartRecyclerView2 = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView2);
        BloodGlucoseLineChartItemDecoration bloodGlucoseLineChartItemDecoration2 = this.mItemDecoration;
        Intrinsics.checkNotNull(bloodGlucoseLineChartItemDecoration2);
        lineChartRecyclerView2.addItemDecoration(bloodGlucoseLineChartItemDecoration2);
        this.mLineChartAdapter = new ux2<>(getActivity(), this.mChartEntries, this.lineChartRecyclerView, this.mXAxis, this.lineChartAttrs, bloodGlucoseHighLightMarkValueFormatter);
        LineChartRecyclerView lineChartRecyclerView3 = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView3);
        lineChartRecyclerView3.setAdapter(this.mLineChartAdapter);
        LineChartRecyclerView lineChartRecyclerView4 = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView4);
        lineChartRecyclerView4.setLayoutManager(speedRatioLayoutManager);
        LineChartRecyclerView lineChartRecyclerView5 = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView5);
        lineChartRecyclerView5.setNestedScrollingEnabled(false);
        s13 s13Var = new s13(getActivity(), this.lineChartRecyclerView, new xcm(this) { // from class: com.xiaomi.fitness.health.bloodglucose.ui.BloodGlucoseFingerBaseWeekMonthFragment$initLineChartRecyclerView$itemGestureListener$1
            final /* synthetic */ BloodGlucoseFingerBaseWeekMonthFragment<VM, VDB> this$0;

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
        LineChartRecyclerView lineChartRecyclerView6 = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView6);
        lineChartRecyclerView6.addOnItemTouchListener(s13Var);
    }

    private final void initPointLineColor() {
        BloodGlucoseDataUtil bloodGlucoseDataUtil = BloodGlucoseDataUtil.INSTANCE;
        VM mViewModel = getMViewModel();
        float lowSettingValue = mViewModel != null ? mViewModel.getLowSettingValue() : 3.9f;
        VM mViewModel2 = getMViewModel();
        float highSettingValue = mViewModel2 != null ? mViewModel2.getHighSettingValue() : 10.0f;
        BloodGlucoseLineChartItemDecoration bloodGlucoseLineChartItemDecoration = this.mItemDecoration;
        Intrinsics.checkNotNull(bloodGlucoseLineChartItemDecoration);
        bloodGlucoseDataUtil.initLineColor(lowSettingValue, highSettingValue, bloodGlucoseLineChartItemDecoration);
        ux2<sf2> ux2Var = this.mLineChartAdapter;
        Intrinsics.checkNotNull(ux2Var);
        ux2Var.notifyDataSetChanged();
    }

    private final void initSegmentRecycler() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireActivity());
        RecyclerView recyclerView = this.recyclerMealTime;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setLayoutManager(linearLayoutManager);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        this.mMealTimeAdapter = new FingerMealTimeDetailAdapter(fragmentActivityRequireActivity, this.mMealTimeDataList);
        RecyclerView recyclerView2 = this.recyclerMealTime;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setAdapter(this.mMealTimeAdapter);
        DataTitleSimpleView dataTitleSimpleView = this.mealTimeTitleView;
        if (dataTitleSimpleView != null) {
            dataTitleSimpleView.bindData(pni.J, getString(c0j.Y0));
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: kx2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BloodGlucoseFingerBaseWeekMonthFragment.initSegmentRecycler$lambda$2(this.f24384a, view);
            }
        };
        DataTitleSimpleView dataTitleSimpleView2 = this.mealTimeTitleView;
        if (dataTitleSimpleView2 != null) {
            dataTitleSimpleView2.setGuideIcon(pni.P3, onClickListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSegmentRecycler$lambda$2(BloodGlucoseFingerBaseWeekMonthFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String understandBloodSugarUrl = HealthUtil.INSTANCE.getUnderstandBloodSugarUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null));
        Context context = this$0.getContext();
        WebViewUtilKt.startWebView$default(understandBloodSugarUrl, context != null ? context.getString(c0j.o1) : null, false, false, null, false, null, false, 252, null);
    }

    private final void initUnderstandView() {
        HealthBannerCardSetView healthBannerCardSetView = this.healthBannerCardSetView;
        if (healthBannerCardSetView != null) {
            PingAnHealthExtKt.bindOneBanner(healthBannerCardSetView, 4);
        }
        View view = this.understandCard;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: hx2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BloodGlucoseFingerBaseWeekMonthFragment.initUnderstandView$lambda$0(this.f20558a, view2);
                }
            });
        }
        View view2 = this.moreDeviceCard;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initUnderstandView$lambda$0(BloodGlucoseFingerBaseWeekMonthFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WebViewUtilKt.startWebView$default(HealthUtil.INSTANCE.getUnderstandBloodSugarUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null)), this$0.getString(c0j.o1), false, false, null, false, null, false, 252, null);
    }

    private final void initView() {
        getMViewModel().getBloodSugarRemindSettingFromLocal();
        initLineChartRecyclerView();
        initDetailCard();
        initDistributeCard();
        initSegmentRecycler();
        initUnderstandView();
    }

    private final void refreshBarChart() {
        BloodSugarItem latestFingerItem;
        BloodSugarItem latestFingerItem2;
        BloodSugarItem latestFingerItem3;
        StatisticBloodSugar statisticFingerBS;
        BloodSugarItem maxItem;
        StatisticBloodSugar statisticBloodSugar;
        BloodSugarItem maxItem2;
        DailyBloodSugarReport dailyBloodSugarReport = this.mBloodSugarReport;
        if (dailyBloodSugarReport == null) {
            LocalDate localDate = this.mCurrentLocalDate;
            Intrinsics.checkNotNull(localDate);
            dailyBloodSugarReport = new DailyBloodSugarReport(TimeDateUtil.changZeroOfTheDay(localDate), getViewTag());
        }
        BloodGlucoseDataUtil bloodGlucoseDataUtil = BloodGlucoseDataUtil.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        vfe vfeVar = this.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar);
        List<BloodGlucoseEntry> listCreateWeekMonthEntries = bloodGlucoseDataUtil.createWeekMonthEntries(contextRequireContext, vfeVar, dailyBloodSugarReport, Intrinsics.areEqual(getViewTag(), "weeks"), 2);
        List<BloodGlucoseEntry> list = this.mChartEntries;
        if (list != null) {
            list.clear();
        }
        List<BloodGlucoseEntry> list2 = this.mChartEntries;
        if (list2 != null) {
            list2.addAll(listCreateWeekMonthEntries);
        }
        float theMaxNumber = HealthUtil.getTheMaxNumber(listCreateWeekMonthEntries);
        DailyBloodSugarReport dailyBloodSugarReport2 = this.mBloodSugarReport;
        Float fValueOf = null;
        float fBloodSugar = 10.0f;
        if ((dailyBloodSugarReport2 != null ? dailyBloodSugarReport2.getStatisticBloodSugar() : null) != null) {
            DailyBloodSugarReport dailyBloodSugarReport3 = this.mBloodSugarReport;
            theMaxNumber = (dailyBloodSugarReport3 == null || (statisticBloodSugar = dailyBloodSugarReport3.getStatisticBloodSugar()) == null || (maxItem2 = statisticBloodSugar.getMaxItem()) == null) ? 10.0f : maxItem2.bloodSugar();
        }
        DailyBloodSugarReport dailyBloodSugarReport4 = this.mBloodSugarReport;
        if ((dailyBloodSugarReport4 != null ? dailyBloodSugarReport4.getStatisticFingerBS() : null) != null) {
            DailyBloodSugarReport dailyBloodSugarReport5 = this.mBloodSugarReport;
            if (dailyBloodSugarReport5 != null && (statisticFingerBS = dailyBloodSugarReport5.getStatisticFingerBS()) != null && (maxItem = statisticFingerBS.getMaxItem()) != null) {
                fBloodSugar = maxItem.bloodSugar();
            }
            theMaxNumber = Math.max(theMaxNumber, fBloodSugar);
        }
        if (theMaxNumber < getMViewModel().getHighSettingValue()) {
            theMaxNumber = getMViewModel().getHighSettingValue();
        }
        float f = 15.0f;
        if (theMaxNumber >= 15.0f) {
            f = 20.0f;
            if (theMaxNumber >= 20.0f) {
                f = 25.0f;
            }
        }
        DailyBloodSugarReport dailyBloodSugarReport6 = this.mBloodSugarReport;
        if (((dailyBloodSugarReport6 == null || (latestFingerItem3 = dailyBloodSugarReport6.getLatestFingerItem()) == null) ? -1.0f : latestFingerItem3.bloodSugar()) > -1.0f) {
            DataTitleView dataTitleView = this.dataTitleView;
            if (dataTitleView != null) {
                ViewExtKt.setVisible(dataTitleView, true);
            }
            DailyBloodSugarReport dailyBloodSugarReport7 = this.mBloodSugarReport;
            long jCurrentTimeMillis = (dailyBloodSugarReport7 == null || (latestFingerItem2 = dailyBloodSugarReport7.getLatestFingerItem()) == null) ? System.currentTimeMillis() / ((long) 1000) : latestFingerItem2.getTime();
            String dateHHmmFormat = TimeDateUtil.getDateHHmmFormat(jCurrentTimeMillis);
            if (!TimeUtils.INSTANCE.isSameDay(((long) 1000) * jCurrentTimeMillis, System.currentTimeMillis())) {
                dateHHmmFormat = TimeDateUtil.getDateMMddFormat(TimeDateUtil.timestampToLocalDate(jCurrentTimeMillis)) + " " + dateHHmmFormat;
            }
            DailyBloodSugarReport dailyBloodSugarReport8 = this.mBloodSugarReport;
            if (dailyBloodSugarReport8 != null && (latestFingerItem = dailyBloodSugarReport8.getLatestFingerItem()) != null) {
                fValueOf = Float.valueOf(latestFingerItem.bloodSugar());
            }
            Resources resources = requireContext().getResources();
            int i = qxi.X;
            Intrinsics.checkNotNull(fValueOf);
            String quantityString = resources.getQuantityString(i, (int) fValueOf.floatValue(), fValueOf.toString());
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            if (Intrinsics.areEqual(fValueOf, 2.0f)) {
                quantityString = requireContext().getResources().getQuantityString(qxi.c, (int) fValueOf.floatValue(), fValueOf.toString());
            } else if (Intrinsics.areEqual(fValueOf, 25.0f)) {
                quantityString = requireContext().getResources().getQuantityString(qxi.f31939b, (int) fValueOf.floatValue(), fValueOf.toString());
            }
            String string = fValueOf.toString();
            DataTitleView dataTitleView2 = this.dataTitleView;
            if (dataTitleView2 != null) {
                dataTitleView2.a(requireContext(), quantityString, string, dateHHmmFormat);
            }
            BloodGlucoseLineChartItemDecoration bloodGlucoseLineChartItemDecoration = this.mItemDecoration;
            if (bloodGlucoseLineChartItemDecoration != null) {
                bloodGlucoseLineChartItemDecoration.setDrawSelectFill(true);
            }
        } else {
            DataTitleView dataTitleView3 = this.dataTitleView;
            if (dataTitleView3 != null) {
                ViewExtKt.setVisible(dataTitleView3, true);
            }
            BloodGlucoseLineChartItemDecoration bloodGlucoseLineChartItemDecoration2 = this.mItemDecoration;
            if (bloodGlucoseLineChartItemDecoration2 != null) {
                bloodGlucoseLineChartItemDecoration2.setDrawSelectFill(false);
            }
            DataTitleView dataTitleView4 = this.dataTitleView;
            if (dataTitleView4 != null) {
                dataTitleView4.c(getString(c0j.L6));
            }
        }
        rtr rtrVar = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar);
        rtrVar.setAxisMaximum(f);
        rtr rtrVar2 = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar2);
        rtrVar2.setLabelCount(5);
        rtr rtrVar3 = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar3);
        rtrVar3.f = 5;
        BloodGlucoseLineChartItemDecoration bloodGlucoseLineChartItemDecoration3 = this.mItemDecoration;
        Intrinsics.checkNotNull(bloodGlucoseLineChartItemDecoration3);
        bloodGlucoseLineChartItemDecoration3.setYAxis(this.mYAxis);
        BloodGlucoseLineChartItemDecoration bloodGlucoseLineChartItemDecoration4 = this.mItemDecoration;
        Intrinsics.checkNotNull(bloodGlucoseLineChartItemDecoration4);
        bloodGlucoseLineChartItemDecoration4.setXAxis(this.mXAxis);
        ux2<sf2> ux2Var = this.mLineChartAdapter;
        Intrinsics.checkNotNull(ux2Var);
        ux2Var.setYAxis(this.mYAxis);
        ux2<sf2> ux2Var2 = this.mLineChartAdapter;
        Intrinsics.checkNotNull(ux2Var2);
        ux2Var2.setXAxis(this.mXAxis);
        initPointLineColor();
    }

    private final void refreshDetailCard() {
        DailyBloodSugarReport dailyBloodSugarReport = this.mBloodSugarReport;
        if (dailyBloodSugarReport != null) {
            Intrinsics.checkNotNull(dailyBloodSugarReport);
            if (dailyBloodSugarReport.getStatisticFingerBS() != null) {
                BloodGlucoseDataUtil bloodGlucoseDataUtil = BloodGlucoseDataUtil.INSTANCE;
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                DailyBloodSugarReport dailyBloodSugarReport2 = this.mBloodSugarReport;
                Intrinsics.checkNotNull(dailyBloodSugarReport2);
                StatisticBloodSugar statisticFingerBS = dailyBloodSugarReport2.getStatisticFingerBS();
                Intrinsics.checkNotNull(statisticFingerBS);
                List<qpo> listCreateSummaryModelList = bloodGlucoseDataUtil.createSummaryModelList(contextRequireContext, statisticFingerBS, 2);
                if (!listCreateSummaryModelList.isEmpty()) {
                    DailyBloodSugarReport dailyBloodSugarReport3 = this.mBloodSugarReport;
                    Intrinsics.checkNotNull(dailyBloodSugarReport3);
                    Map<Long, List<BloodSugarItem>> fingerBSMap = dailyBloodSugarReport3.getFingerBSMap();
                    if (fingerBSMap != null && fingerBSMap.size() > 1) {
                        RecyclerView recyclerView = this.recyclerDetail;
                        Intrinsics.checkNotNull(recyclerView);
                        recyclerView.setVisibility(0);
                        List<qpo> list = this.mDataListDetail;
                        Intrinsics.checkNotNull(list);
                        list.clear();
                        List<qpo> list2 = this.mDataListDetail;
                        Intrinsics.checkNotNull(list2);
                        list2.addAll(listCreateSummaryModelList);
                        opo opoVar = this.mDetailAdapter;
                        Intrinsics.checkNotNull(opoVar);
                        opoVar.setHeaderViewTitle(qpo.a(getViewTag()));
                        opo opoVar2 = this.mDetailAdapter;
                        Intrinsics.checkNotNull(opoVar2);
                        opoVar2.notifyDataChanged();
                        return;
                    }
                }
                RecyclerView recyclerView2 = this.recyclerDetail;
                Intrinsics.checkNotNull(recyclerView2);
                recyclerView2.setVisibility(8);
                return;
            }
        }
        RecyclerView recyclerView3 = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setVisibility(8);
    }

    private final void refreshDistributeCard() {
        DailyBloodSugarReport dailyBloodSugarReport = this.mBloodSugarReport;
        if ((dailyBloodSugarReport != null ? dailyBloodSugarReport.getTargetDistFingerMap() : null) == null) {
            RecyclerView recyclerView = this.mDistributeRecyclerView;
            Intrinsics.checkNotNull(recyclerView);
            ViewExtKt.setVisible(recyclerView, false);
            return;
        }
        BloodGlucoseDataUtil bloodGlucoseDataUtil = BloodGlucoseDataUtil.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        DailyBloodSugarReport dailyBloodSugarReport2 = this.mBloodSugarReport;
        Intrinsics.checkNotNull(dailyBloodSugarReport2);
        Map<Integer, Integer> targetDistFingerMap = dailyBloodSugarReport2.getTargetDistFingerMap();
        Intrinsics.checkNotNull(targetDistFingerMap);
        List<uz6> listCreateFingerDistributeData = bloodGlucoseDataUtil.createFingerDistributeData(contextRequireContext, targetDistFingerMap);
        if (listCreateFingerDistributeData == null || listCreateFingerDistributeData.size() <= 0) {
            RecyclerView recyclerView2 = this.mDistributeRecyclerView;
            Intrinsics.checkNotNull(recyclerView2);
            recyclerView2.setVisibility(8);
            return;
        }
        DistributeDataUtil.setPositionOfList(listCreateFingerDistributeData);
        RecyclerView recyclerView3 = this.mDistributeRecyclerView;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setVisibility(0);
        List<uz6> list = this.mDistributeData;
        Intrinsics.checkNotNull(list);
        list.clear();
        List<uz6> list2 = this.mDistributeData;
        Intrinsics.checkNotNull(list2);
        list2.addAll(listCreateFingerDistributeData);
        cx2 cx2Var = this.mDistributeAdapter;
        Intrinsics.checkNotNull(cx2Var);
        cx2Var.m(getString(c0j.q1, String.valueOf(getMViewModel().getLowSettingValue()), String.valueOf(getMViewModel().getHighSettingValue())));
        cx2 cx2Var2 = this.mDistributeAdapter;
        Intrinsics.checkNotNull(cx2Var2);
        cx2Var2.notifyDataSetChanged();
    }

    private final void refreshSegmentRecycle() {
        StatisticBloodSugar statisticFingerBS;
        BloodSugarItem maxItem;
        DailyBloodSugarReport dailyBloodSugarReport = this.mBloodSugarReport;
        if (dailyBloodSugarReport != null) {
            Intrinsics.checkNotNull(dailyBloodSugarReport);
            if (dailyBloodSugarReport.getAvgFingerBSByPeriod() != null) {
                LinearLayout linearLayout = this.mealTimeLinearView;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                DailyBloodSugarReport dailyBloodSugarReport2 = this.mBloodSugarReport;
                float f = ((dailyBloodSugarReport2 == null || (statisticFingerBS = dailyBloodSugarReport2.getStatisticFingerBS()) == null || (maxItem = statisticFingerBS.getMaxItem()) == null) ? 15.0f : maxItem.bloodSugar()) > 15.0f ? 25.0f : 15.0f;
                BloodGlucoseDataUtil bloodGlucoseDataUtil = BloodGlucoseDataUtil.INSTANCE;
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                DailyBloodSugarReport dailyBloodSugarReport3 = this.mBloodSugarReport;
                Map<Integer, Float> avgFingerBSByPeriod = dailyBloodSugarReport3 != null ? dailyBloodSugarReport3.getAvgFingerBSByPeriod() : null;
                Intrinsics.checkNotNull(avgFingerBSByPeriod);
                List<BloodGlucoseDataUtil.FingerMealTimeRecycleModel> listCreateFingerMealTimeModelList = bloodGlucoseDataUtil.createFingerMealTimeModelList(contextRequireContext, avgFingerBSByPeriod, f);
                this.mMealTimeDataList.clear();
                this.mMealTimeDataList.addAll(listCreateFingerMealTimeModelList);
                FingerMealTimeDetailAdapter fingerMealTimeDetailAdapter = this.mMealTimeAdapter;
                if (fingerMealTimeDetailAdapter != null) {
                    fingerMealTimeDetailAdapter.notifyDataSetChanged();
                    return;
                }
                return;
            }
        }
        LinearLayout linearLayout2 = this.mealTimeLinearView;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    private final void refreshViewOnReportChanged() {
        DailyBloodSugarReport dailyBloodSugarReport = this.mBloodSugarReport;
        Logger.i("BloodPressureWm", "refresh BloodPressureReport .. " + (dailyBloodSugarReport != null ? dailyBloodSugarReport.toString() : null));
        refreshBarChart();
        refreshDetailCard();
        refreshDistributeCard();
        refreshSegmentRecycle();
    }

    private final void requestData() {
        this.mBloodSugarReport = null;
        LocalDate localDate = this.mCurrentLocalDate;
        Intrinsics.checkNotNull(localDate);
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDate);
        Logger.i(BaseFragment.TAG, "start request device data.." + this.mCurrentLocalDate + "/params start:" + jChangZeroOfTheDay);
        getMViewModel().triggerFetchFitnessReport(IBloodSugarRepository.class, getViewTag(), jChangZeroOfTheDay, 0, 0, "").observe(getViewLifecycleOwner(), new Observer() { // from class: jx2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodGlucoseFingerBaseWeekMonthFragment.requestData$lambda$3(this.f23211a, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestData$lambda$3(BloodGlucoseFingerBaseWeekMonthFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (ArrayUtils.isEmpty(list)) {
            this$0.mBloodSugarReport = null;
        } else {
            DailyBasicReport dailyBasicReport = (DailyBasicReport) list.get(0);
            if (dailyBasicReport instanceof DailyBloodSugarReport) {
                this$0.mBloodSugarReport = (DailyBloodSugarReport) dailyBasicReport;
            }
        }
        this$0.refreshViewOnReportChanged();
    }

    private final void updateRecyclerLayoutManager() {
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
    public final LineChartRecyclerView getLineChartRecyclerView() {
        return this.lineChartRecyclerView;
    }

    @Nullable
    public final LocalDate getMCurrentDate() {
        return this.mCurrentDate;
    }

    @Nullable
    public final RecyclerView getMDistributeRecyclerView() {
        return this.mDistributeRecyclerView;
    }

    @Nullable
    public final FingerMealTimeDetailAdapter getMMealTimeAdapter() {
        return this.mMealTimeAdapter;
    }

    @NotNull
    public final List<BloodGlucoseDataUtil.FingerMealTimeRecycleModel> getMMealTimeDataList() {
        return this.mMealTimeDataList;
    }

    @Nullable
    public final LinearLayout getMealTimeLinearView() {
        return this.mealTimeLinearView;
    }

    @Nullable
    public final DataTitleSimpleView getMealTimeTitleView() {
        return this.mealTimeTitleView;
    }

    @Nullable
    public final View getMoreDeviceCard() {
        return this.moreDeviceCard;
    }

    @Nullable
    public final RecyclerView getRecyclerDetail() {
        return this.recyclerDetail;
    }

    @Nullable
    public final RecyclerView getRecyclerMealTime() {
        return this.recyclerMealTime;
    }

    @Nullable
    public final View getUnderstandCard() {
        return this.understandCard;
    }

    public abstract void initViewBinding();

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        updateRecyclerLayoutManager();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        View view = this.containerView;
        if (view != null) {
            view.requestLayout();
        }
        getMViewModel().getBloodSugarRemindSettingFromLocal();
        initPointLineColor();
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

    public final void setContainerView(@Nullable View view) {
        this.containerView = view;
    }

    public final void setDataTitleView(@Nullable DataTitleView dataTitleView) {
        this.dataTitleView = dataTitleView;
    }

    public final void setHealthBannerCardSetView(@Nullable HealthBannerCardSetView healthBannerCardSetView) {
        this.healthBannerCardSetView = healthBannerCardSetView;
    }

    public final void setLineChartRecyclerView(@Nullable LineChartRecyclerView lineChartRecyclerView) {
        this.lineChartRecyclerView = lineChartRecyclerView;
    }

    public final void setMCurrentDate(@Nullable LocalDate localDate) {
        this.mCurrentDate = localDate;
    }

    public final void setMDistributeRecyclerView(@Nullable RecyclerView recyclerView) {
        this.mDistributeRecyclerView = recyclerView;
    }

    public final void setMMealTimeAdapter(@Nullable FingerMealTimeDetailAdapter fingerMealTimeDetailAdapter) {
        this.mMealTimeAdapter = fingerMealTimeDetailAdapter;
    }

    public final void setMMealTimeDataList(@NotNull List<BloodGlucoseDataUtil.FingerMealTimeRecycleModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mMealTimeDataList = list;
    }

    public final void setMealTimeLinearView(@Nullable LinearLayout linearLayout) {
        this.mealTimeLinearView = linearLayout;
    }

    public final void setMealTimeTitleView(@Nullable DataTitleSimpleView dataTitleSimpleView) {
        this.mealTimeTitleView = dataTitleSimpleView;
    }

    public final void setMoreDeviceCard(@Nullable View view) {
        this.moreDeviceCard = view;
    }

    public final void setRecyclerDetail(@Nullable RecyclerView recyclerView) {
        this.recyclerDetail = recyclerView;
    }

    public final void setRecyclerMealTime(@Nullable RecyclerView recyclerView) {
        this.recyclerMealTime = recyclerView;
    }

    public final void setUnderstandCard(@Nullable View view) {
        this.understandCard = view;
    }
}
