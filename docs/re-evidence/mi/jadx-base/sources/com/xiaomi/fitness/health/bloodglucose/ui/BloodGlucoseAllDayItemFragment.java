package com.xiaomi.fitness.health.bloodglucose.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.api.repository.IBloodSugarRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.BloodSugarGMIAndAGPResult;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBloodSugarReport;
import com.xiaomi.fit.fitness.export.data.aggregation.StatisticBloodSugar;
import com.xiaomi.fit.fitness.export.data.item.BloodSugarItem;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.extension.BaseFragmentExtKt;
import com.xiaomi.fitness.blood_sugar.BloodSugarExtKt;
import com.xiaomi.fitness.blood_sugar.BloodSugarManager;
import com.xiaomi.fitness.blood_sugar.BloodSugarRemindSettingManager;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.barchart.itemdecoration.BloodGlucoseLineChartItemDecoration;
import com.xiaomi.fitness.chart.entrys.BloodGlucoseEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.view.BloodSugarLineChartRecyclerView;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.data.valueformatter.BloodGlucoseHighLightMarkValueFormatter;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.bloodglucose.BloodGlucoseViewModel;
import com.xiaomi.fitness.health.bloodglucose.ui.BloodGlucoseAllDayItemFragment;
import com.xiaomi.fitness.health.bloodglucose.util.BloodGlucoseDataUtil;
import com.xiaomi.fitness.health.bloodglucose.util.BloodSugarPermissionGuidePreference;
import com.xiaomi.fitness.health.sleep.ui.setting.SleepPermissionSettingFragment;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.util.PingAnHealthExtKt;
import com.xiaomi.fitness.view.DataTitleView;
import com.xiaomi.fitness.view.HealthBannerCardSetView;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.fitness.widget.distribute.DistributeDataUtil;
import defpackage.bl5;
import defpackage.c0j;
import defpackage.c3a;
import defpackage.cx2;
import defpackage.eri;
import defpackage.jui;
import defpackage.opo;
import defpackage.oyi;
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
import defpackage.xqr;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u008c\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u008c\u0001B\b¢\u0006\u0005\b\u008b\u0001\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0006J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0006J\u000f\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0006J\u000f\u0010\u001b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u0006J\u000f\u0010\u001c\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u0006J\u000f\u0010\u001d\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u0006J\u000f\u0010\u001e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u0006J!\u0010#\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010\u0006J\u0017\u0010(\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R$\u00100\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010/\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0018\u00105\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R$\u00108\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010?\u001a\u0004\u0018\u00010>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001e\u0010G\u001a\n\u0012\u0004\u0012\u00020F\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u001e\u0010K\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010T\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010W\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Z\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010]\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u001e\u0010`\u001a\n\u0012\u0004\u0012\u00020_\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010LR$\u0010a\u001a\u0004\u0018\u00010Y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010[\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0018\u0010g\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u001e\u0010j\u001a\n\u0012\u0004\u0012\u00020i\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010LR$\u0010k\u001a\u0004\u0018\u00010Y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010[\u001a\u0004\bl\u0010c\"\u0004\bm\u0010eR\u0018\u0010o\u001a\u0004\u0018\u00010n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR$\u0010q\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u00106\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u0016\u0010v\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bv\u00106R\u0016\u0010x\u001a\u00020w8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bx\u0010yR\u0016\u0010{\u001a\u00020z8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b{\u0010|R\u0018\u0010~\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001c\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001e\u0010\u0085\u0001\u001a\n\u0012\u0005\u0012\u00030\u0084\u00010\u0083\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010LR\u001e\u0010\u0086\u0001\u001a\n\u0012\u0005\u0012\u00030\u0084\u00010\u0083\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010LR\u0018\u0010\u008a\u0001\u001a\u00030\u0087\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001¨\u0006\u008d\u0001"}, d2 = {"Lcom/xiaomi/fitness/health/bloodglucose/ui/BloodGlucoseAllDayItemFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/bloodglucose/BloodGlucoseViewModel;", "Lc3a;", "", "initPointLineColor", "()V", "refreshViewOnReportChanged", "initViewBinding", "initPermissionInstructionView", "updateBloodGlucoseGuideView", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "model", "", "isSugarDadaSyncDone", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)Z", "initView", "initUnderstandView", "initLineChartRecyclerView", "refreshBarChart", "initDistributeCard", "refreshDistributeCard", "initDetailCard", "updateDetailRecyclerLayoutManager", "updateDistributeRecyclerLayoutManager", "refreshDetailCard", Constants.KEY_REQUEST_DATA, "goDeviceSettings", "initRecycleView", "initBundle", LifecycleConstantKt.ON_RESUME, "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_DESTROY, "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodSugarReport;", "mBloodSugarReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodSugarReport;", "Lorg/joda/time/LocalDate;", "mCurrentLocalDate", "Lorg/joda/time/LocalDate;", "mCurrentDate", "getMCurrentDate", "()Lorg/joda/time/LocalDate;", "setMCurrentDate", "(Lorg/joda/time/LocalDate;)V", "containerView", "Landroid/view/View;", "Lcom/xiaomi/fitness/chart/view/BloodSugarLineChartRecyclerView;", "lineChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/BloodSugarLineChartRecyclerView;", "getLineChartRecyclerView", "()Lcom/xiaomi/fitness/chart/view/BloodSugarLineChartRecyclerView;", "setLineChartRecyclerView", "(Lcom/xiaomi/fitness/chart/view/BloodSugarLineChartRecyclerView;)V", "Lcom/xiaomi/fitness/view/DataTitleView;", "dataTitleView", "Lcom/xiaomi/fitness/view/DataTitleView;", "getDataTitleView", "()Lcom/xiaomi/fitness/view/DataTitleView;", "setDataTitleView", "(Lcom/xiaomi/fitness/view/DataTitleView;)V", "Lux2;", "Lsf2;", "mLineChartAdapter", "Lux2;", "", "Lcom/xiaomi/fitness/chart/entrys/BloodGlucoseEntry;", "mChartEntries", "Ljava/util/List;", "Lcom/xiaomi/fitness/chart/barchart/itemdecoration/BloodGlucoseLineChartItemDecoration;", "mItemDecoration", "Lcom/xiaomi/fitness/chart/barchart/itemdecoration/BloodGlucoseLineChartItemDecoration;", "Lrtr;", "mYAxis", "Lrtr;", "Lvqr;", "mXAxis", "Lvqr;", "Lvfe;", "lineChartAttrs", "Lvfe;", "Landroidx/recyclerview/widget/RecyclerView;", "mDistributeRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lcx2;", "mDistributeAdapter", "Lcx2;", "Luz6;", "mDistributeData", "recyclerDetail", "getRecyclerDetail", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerDetail", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lopo;", "mDetailAdapter", "Lopo;", "Lqpo;", "mDataListDetail", "bloodGlucoseRecordRecyclerView", "getBloodGlucoseRecordRecyclerView", "setBloodGlucoseRecordRecyclerView", "Lcom/xiaomi/fitness/health/bloodglucose/ui/BloodGlucoseDayDetailAdapter;", "mDayDetailAdapter", "Lcom/xiaomi/fitness/health/bloodglucose/ui/BloodGlucoseDayDetailAdapter;", "understandCard", "getUnderstandCard", "()Landroid/view/View;", "setUnderstandCard", "(Landroid/view/View;)V", "permSettingInstView", "Landroid/widget/TextView;", "permSettingInstTv", "Landroid/widget/TextView;", "Landroidx/appcompat/widget/AppCompatImageView;", "closePermSettingCross", "Landroidx/appcompat/widget/AppCompatImageView;", "Ljava/lang/Runnable;", "timerRunnable", "Ljava/lang/Runnable;", "Landroid/os/Handler;", "mHandler", "Landroid/os/Handler;", "", "Landroid/graphics/drawable/Drawable;", "drawableList", "highLightDrawableList", "", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBloodGlucoseAllDayItemFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodGlucoseAllDayItemFragment.kt\ncom/xiaomi/fitness/health/bloodglucose/ui/BloodGlucoseAllDayItemFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,646:1\n1#2:647\n*E\n"})
public final class BloodGlucoseAllDayItemFragment extends Hilt_BloodGlucoseAllDayItemFragment<BloodGlucoseViewModel, c3a> {

    @NotNull
    public static final String MODEL_CGM = "synaps.watch.m8";

    @NotNull
    public static final String TAG = "BloodGlucoseDay";

    @Nullable
    private RecyclerView bloodGlucoseRecordRecyclerView;
    private AppCompatImageView closePermSettingCross;

    @Nullable
    private View containerView;

    @Nullable
    private DataTitleView dataTitleView;

    @Nullable
    private vfe lineChartAttrs;

    @Nullable
    private BloodSugarLineChartRecyclerView lineChartRecyclerView;

    @Nullable
    private DailyBloodSugarReport mBloodSugarReport;

    @Nullable
    private LocalDate mCurrentDate;

    @Nullable
    private LocalDate mCurrentLocalDate;

    @Nullable
    private List<qpo> mDataListDetail;

    @Nullable
    private BloodGlucoseDayDetailAdapter mDayDetailAdapter;

    @Nullable
    private opo mDetailAdapter;

    @Nullable
    private cx2 mDistributeAdapter;

    @Nullable
    private List<uz6> mDistributeData;

    @Nullable
    private RecyclerView mDistributeRecyclerView;

    @Nullable
    private Handler mHandler;

    @Nullable
    private BloodGlucoseLineChartItemDecoration mItemDecoration;

    @Nullable
    private ux2<sf2> mLineChartAdapter;

    @Nullable
    private vqr mXAxis;

    @Nullable
    private rtr mYAxis;
    private TextView permSettingInstTv;
    private View permSettingInstView;

    @Nullable
    private RecyclerView recyclerDetail;

    @Nullable
    private Runnable timerRunnable;

    @Nullable
    private View understandCard;

    @Nullable
    private List<BloodGlucoseEntry> mChartEntries = new ArrayList();

    @NotNull
    private final List<Drawable> drawableList = CollectionsKt__CollectionsKt.listOf((Object[]) new Drawable[]{BaseFragmentExtKt.getDrawable(this, pni.g), BaseFragmentExtKt.getDrawable(this, pni.h), BaseFragmentExtKt.getDrawable(this, pni.e), BaseFragmentExtKt.getDrawable(this, pni.d), BaseFragmentExtKt.getDrawable(this, pni.f)});

    @NotNull
    private final List<Drawable> highLightDrawableList = CollectionsKt__CollectionsKt.listOf((Object[]) new Drawable[]{BaseFragmentExtKt.getDrawable(this, pni.g), BaseFragmentExtKt.getDrawable(this, pni.h), BaseFragmentExtKt.getDrawable(this, pni.e), BaseFragmentExtKt.getDrawable(this, pni.d), BaseFragmentExtKt.getDrawable(this, pni.f)});

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.bloodglucose.ui.BloodGlucoseAllDayItemFragment$refreshViewOnReportChanged$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.bloodglucose.ui.BloodGlucoseAllDayItemFragment$refreshViewOnReportChanged$1", f = "BloodGlucoseAllDayItemFragment.kt", i = {}, l = {177}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.bloodglucose.ui.BloodGlucoseAllDayItemFragment$refreshViewOnReportChanged$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.health.bloodglucose.ui.BloodGlucoseAllDayItemFragment$refreshViewOnReportChanged$1$1", f = "BloodGlucoseAllDayItemFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05771 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ BloodGlucoseAllDayItemFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05771(BloodGlucoseAllDayItemFragment bloodGlucoseAllDayItemFragment, Continuation<? super C05771> continuation) {
                super(2, continuation);
                this.this$0 = bloodGlucoseAllDayItemFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05771(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.this$0.mBloodSugarReport != null) {
                    BloodGlucoseDayDetailAdapter bloodGlucoseDayDetailAdapter = this.this$0.mDayDetailAdapter;
                    Intrinsics.checkNotNull(bloodGlucoseDayDetailAdapter);
                    DailyBloodSugarReport dailyBloodSugarReport = this.this$0.mBloodSugarReport;
                    Intrinsics.checkNotNull(dailyBloodSugarReport);
                    bloodGlucoseDayDetailAdapter.setDataReport(dailyBloodSugarReport);
                }
                BloodGlucoseDayDetailAdapter bloodGlucoseDayDetailAdapter2 = this.this$0.mDayDetailAdapter;
                Intrinsics.checkNotNull(bloodGlucoseDayDetailAdapter2);
                bloodGlucoseDayDetailAdapter2.notifyDataSetChanged();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BloodGlucoseAllDayItemFragment.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                C05771 c05771 = new C05771(BloodGlucoseAllDayItemFragment.this, null);
                this.label = 1;
                if (BuildersKt.withContext(main, c05771, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void goDeviceSettings() {
        BloodSugarManager bloodSugarExtKt = BloodSugarExtKt.getInstance(BloodSugarManager.INSTANCE);
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        bloodSugarExtKt.goBloodSugarDevice(mActivity);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
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
    }

    private final void initDetailCard() {
        this.mDataListDetail = new ArrayList();
        RecyclerView recyclerView = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.addItemDecoration(new bl5());
        this.mDetailAdapter = new opo(getMActivity(), this.mDataListDetail, c0j.I6, pni.I);
        updateDetailRecyclerLayoutManager();
        RecyclerView recyclerView2 = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setAdapter(this.mDetailAdapter);
        RecyclerView recyclerView3 = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setHasFixedSize(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initDistributeCard() {
        this.mDistributeData = new ArrayList();
        bl5 bl5Var = new bl5(false);
        RecyclerView recyclerView = this.mDistributeRecyclerView;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.addItemDecoration(bl5Var);
        cx2 cx2Var = new cx2(getMActivity(), this.mDistributeData, 10);
        this.mDistributeAdapter = cx2Var;
        Intrinsics.checkNotNull(cx2Var);
        cx2Var.m(getString(c0j.q1, String.valueOf(((BloodGlucoseViewModel) getMViewModel()).getLowSettingValue()), String.valueOf(((BloodGlucoseViewModel) getMViewModel()).getHighSettingValue())));
        cx2 cx2Var2 = this.mDistributeAdapter;
        Intrinsics.checkNotNull(cx2Var2);
        cx2Var2.setDistributeGuidIconClickListener(new cx2.c() { // from class: kw2
            @Override // cx2.c
            public final void onClick(int i) {
                BloodGlucoseAllDayItemFragment.initDistributeCard$lambda$14(this.f24358a, i);
            }
        });
        updateDistributeRecyclerLayoutManager();
        RecyclerView recyclerView2 = this.mDistributeRecyclerView;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setAdapter(this.mDistributeAdapter);
        RecyclerView recyclerView3 = this.mDistributeRecyclerView;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setHasFixedSize(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initDistributeCard$lambda$14(BloodGlucoseAllDayItemFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WebViewUtilKt.startWebView$default(HealthUtil.INSTANCE.getUnderstandBloodSugarUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null)), this$0.getString(c0j.o1), false, false, null, false, null, false, 252, null);
    }

    private final void initLineChartRecyclerView() {
        BloodSugarLineChartRecyclerView bloodSugarLineChartRecyclerView = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(bloodSugarLineChartRecyclerView);
        this.lineChartAttrs = (vfe) bloodSugarLineChartRecyclerView.mAttrs;
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
        vqrVar.setValueFormatter(new xqr());
        this.mItemDecoration = new BloodGlucoseLineChartItemDecoration(this.mYAxis, this.mXAxis, this.lineChartAttrs, false, 8, null);
        BloodGlucoseHighLightMarkValueFormatter bloodGlucoseHighLightMarkValueFormatter = new BloodGlucoseHighLightMarkValueFormatter(0);
        BloodGlucoseLineChartItemDecoration bloodGlucoseLineChartItemDecoration = this.mItemDecoration;
        Intrinsics.checkNotNull(bloodGlucoseLineChartItemDecoration);
        bloodGlucoseLineChartItemDecoration.setHighLightValueFormatter(bloodGlucoseHighLightMarkValueFormatter);
        BloodGlucoseLineChartItemDecoration bloodGlucoseLineChartItemDecoration2 = this.mItemDecoration;
        Intrinsics.checkNotNull(bloodGlucoseLineChartItemDecoration2);
        bloodGlucoseLineChartItemDecoration2.setDrawable(this.highLightDrawableList);
        BloodSugarLineChartRecyclerView bloodSugarLineChartRecyclerView2 = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(bloodSugarLineChartRecyclerView2);
        BloodGlucoseLineChartItemDecoration bloodGlucoseLineChartItemDecoration3 = this.mItemDecoration;
        Intrinsics.checkNotNull(bloodGlucoseLineChartItemDecoration3);
        bloodSugarLineChartRecyclerView2.addItemDecoration(bloodGlucoseLineChartItemDecoration3);
        this.mLineChartAdapter = new ux2<>(getActivity(), this.mChartEntries, this.lineChartRecyclerView, this.mXAxis, this.lineChartAttrs, bloodGlucoseHighLightMarkValueFormatter);
        BloodSugarLineChartRecyclerView bloodSugarLineChartRecyclerView3 = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(bloodSugarLineChartRecyclerView3);
        bloodSugarLineChartRecyclerView3.setAdapter(this.mLineChartAdapter);
        BloodSugarLineChartRecyclerView bloodSugarLineChartRecyclerView4 = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(bloodSugarLineChartRecyclerView4);
        bloodSugarLineChartRecyclerView4.setLayoutManager(speedRatioLayoutManager);
        BloodSugarLineChartRecyclerView bloodSugarLineChartRecyclerView5 = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(bloodSugarLineChartRecyclerView5);
        bloodSugarLineChartRecyclerView5.setNestedScrollingEnabled(false);
        s13 s13Var = new s13(getActivity(), this.lineChartRecyclerView, new xcm() { // from class: com.xiaomi.fitness.health.bloodglucose.ui.BloodGlucoseAllDayItemFragment$initLineChartRecyclerView$itemGestureListener$1
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
        BloodSugarLineChartRecyclerView bloodSugarLineChartRecyclerView6 = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(bloodSugarLineChartRecyclerView6);
        bloodSugarLineChartRecyclerView6.addOnItemTouchListener(s13Var);
    }

    private final void initPermissionInstructionView() {
        View view = this.permSettingInstView;
        View view2 = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
            view = null;
        }
        this.permSettingInstTv = (TextView) view.findViewById(eri.a8);
        View view3 = this.permSettingInstView;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
        } else {
            view2 = view3;
        }
        this.closePermSettingCross = (AppCompatImageView) view2.findViewById(eri.P1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initPointLineColor() {
        BloodGlucoseDataUtil bloodGlucoseDataUtil = BloodGlucoseDataUtil.INSTANCE;
        BloodGlucoseViewModel bloodGlucoseViewModel = (BloodGlucoseViewModel) getMViewModel();
        float lowSettingValue = bloodGlucoseViewModel != null ? bloodGlucoseViewModel.getLowSettingValue() : 3.9f;
        BloodGlucoseViewModel bloodGlucoseViewModel2 = (BloodGlucoseViewModel) getMViewModel();
        float highSettingValue = bloodGlucoseViewModel2 != null ? bloodGlucoseViewModel2.getHighSettingValue() : 10.0f;
        BloodGlucoseLineChartItemDecoration bloodGlucoseLineChartItemDecoration = this.mItemDecoration;
        Intrinsics.checkNotNull(bloodGlucoseLineChartItemDecoration);
        bloodGlucoseDataUtil.initLineColor(lowSettingValue, highSettingValue, bloodGlucoseLineChartItemDecoration);
        ux2<sf2> ux2Var = this.mLineChartAdapter;
        Intrinsics.checkNotNull(ux2Var);
        ux2Var.notifyDataSetChanged();
    }

    private final void initRecycleView() {
        RecyclerView recyclerView = this.bloodGlucoseRecordRecyclerView;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        this.mDayDetailAdapter = new BloodGlucoseDayDetailAdapter(contextRequireContext);
        RecyclerView recyclerView2 = this.bloodGlucoseRecordRecyclerView;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setAdapter(this.mDayDetailAdapter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initUnderstandView() {
        View view = this.understandCard;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: cw2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BloodGlucoseAllDayItemFragment.initUnderstandView$lambda$13(this.f14793a, view2);
                }
            });
        }
        HealthBannerCardSetView healthBannerCardSet = ((c3a) getMBinding()).E;
        Intrinsics.checkNotNullExpressionValue(healthBannerCardSet, "healthBannerCardSet");
        PingAnHealthExtKt.bindOneBanner(healthBannerCardSet, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initUnderstandView$lambda$13(BloodGlucoseAllDayItemFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WebViewUtilKt.startWebView$default(HealthUtil.INSTANCE.getUnderstandBloodSugarUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null)), this$0.getString(c0j.o1), false, false, null, false, null, false, 252, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        ((BloodGlucoseViewModel) getMViewModel()).getBloodSugarRemindSettingFromLocal();
        initLineChartRecyclerView();
        initDistributeCard();
        initDetailCard();
        initRecycleView();
        initUnderstandView();
        requestData();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initViewBinding() {
        this.containerView = ((c3a) getMBinding()).C;
        this.lineChartRecyclerView = ((c3a) getMBinding()).F;
        this.dataTitleView = ((c3a) getMBinding()).D;
        this.understandCard = ((c3a) getMBinding()).I;
        this.mDistributeRecyclerView = ((c3a) getMBinding()).H;
        this.recyclerDetail = ((c3a) getMBinding()).G;
        this.bloodGlucoseRecordRecyclerView = ((c3a) getMBinding()).A;
        this.permSettingInstView = ((c3a) getMBinding()).B;
    }

    private final boolean isSugarDadaSyncDone(WearableDeviceModel model) {
        BloodSugarRemindSettingManager bloodSugarExtKt = BloodSugarExtKt.getInstance(BloodSugarRemindSettingManager.INSTANCE);
        Intrinsics.checkNotNull(model);
        return bloodSugarExtKt.isSugarDadaSyncDone(model);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshBarChart() {
        DataTitleView dataTitleView;
        BloodSugarItem latestItem;
        BloodSugarItem latestItem2;
        BloodSugarItem latestItem3;
        BloodSugarItem latestItem4;
        StatisticBloodSugar statisticFingerBS;
        BloodSugarItem maxItem;
        StatisticBloodSugar statisticBloodSugar;
        BloodSugarItem maxItem2;
        DailyBloodSugarReport dailyBloodSugarReport = this.mBloodSugarReport;
        if (dailyBloodSugarReport == null) {
            LocalDate localDate = this.mCurrentLocalDate;
            Intrinsics.checkNotNull(localDate);
            dailyBloodSugarReport = new DailyBloodSugarReport(TimeDateUtil.changZeroOfTheDay(localDate), "days");
        }
        BloodGlucoseDataUtil bloodGlucoseDataUtil = BloodGlucoseDataUtil.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        vfe vfeVar = this.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar);
        List listCreateDayEntries$default = BloodGlucoseDataUtil.createDayEntries$default(bloodGlucoseDataUtil, contextRequireContext, vfeVar, dailyBloodSugarReport, 0, 8, null);
        List<BloodGlucoseEntry> list = this.mChartEntries;
        if (list != null) {
            list.clear();
        }
        List<BloodGlucoseEntry> list2 = this.mChartEntries;
        if (list2 != null) {
            list2.addAll(listCreateDayEntries$default);
        }
        float theMaxNumber = HealthUtil.getTheMaxNumber(listCreateDayEntries$default);
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
        if (theMaxNumber < ((BloodGlucoseViewModel) getMViewModel()).getHighSettingValue()) {
            theMaxNumber = ((BloodGlucoseViewModel) getMViewModel()).getHighSettingValue();
        }
        float f = 15.0f;
        if (theMaxNumber >= 15.0f) {
            f = 20.0f;
            if (theMaxNumber >= 20.0f) {
                f = 25.0f;
            }
        }
        DailyBloodSugarReport dailyBloodSugarReport6 = this.mBloodSugarReport;
        int trend = 0;
        if (((dailyBloodSugarReport6 == null || (latestItem4 = dailyBloodSugarReport6.getLatestItem()) == null) ? -1.0f : latestItem4.bloodSugar()) > -1.0f) {
            DataTitleView dataTitleView2 = this.dataTitleView;
            if (dataTitleView2 != null) {
                ViewExtKt.setVisible(dataTitleView2, true);
            }
            DailyBloodSugarReport dailyBloodSugarReport7 = this.mBloodSugarReport;
            long jCurrentTimeMillis = (dailyBloodSugarReport7 == null || (latestItem3 = dailyBloodSugarReport7.getLatestItem()) == null) ? System.currentTimeMillis() / ((long) 1000) : latestItem3.getTime();
            String dateHHmmFormat = TimeDateUtil.getDateHHmmFormat(jCurrentTimeMillis);
            if (!TimeUtils.INSTANCE.isSameDay(((long) 1000) * jCurrentTimeMillis, System.currentTimeMillis())) {
                dateHHmmFormat = TimeDateUtil.getDateMMddFormat(TimeDateUtil.timestampToLocalDate(jCurrentTimeMillis)) + " " + dateHHmmFormat;
            }
            DailyBloodSugarReport dailyBloodSugarReport8 = this.mBloodSugarReport;
            if (dailyBloodSugarReport8 != null && (latestItem2 = dailyBloodSugarReport8.getLatestItem()) != null) {
                fValueOf = Float.valueOf(latestItem2.bloodSugar());
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
            DataTitleView dataTitleView3 = this.dataTitleView;
            if (dataTitleView3 != null) {
                dataTitleView3.a(requireContext(), quantityString, string, dateHHmmFormat);
            }
            DailyBloodSugarReport dailyBloodSugarReport9 = this.mBloodSugarReport;
            if (dailyBloodSugarReport9 != null && (latestItem = dailyBloodSugarReport9.getLatestItem()) != null) {
                trend = latestItem.getTrend();
            }
            if (trend > 0 && (dataTitleView = this.dataTitleView) != null) {
                dataTitleView.e(this.drawableList.get(trend - 1));
            }
            BloodGlucoseLineChartItemDecoration bloodGlucoseLineChartItemDecoration = this.mItemDecoration;
            if (bloodGlucoseLineChartItemDecoration != null) {
                bloodGlucoseLineChartItemDecoration.setDrawSelectFill(true);
            }
        } else {
            DataTitleView dataTitleView4 = this.dataTitleView;
            if (dataTitleView4 != null) {
                ViewExtKt.setVisible(dataTitleView4, true);
            }
            BloodGlucoseLineChartItemDecoration bloodGlucoseLineChartItemDecoration2 = this.mItemDecoration;
            if (bloodGlucoseLineChartItemDecoration2 != null) {
                bloodGlucoseLineChartItemDecoration2.setDrawSelectFill(false);
            }
            DataTitleView dataTitleView5 = this.dataTitleView;
            if (dataTitleView5 != null) {
                dataTitleView5.c(getString(c0j.L6));
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
            if (dailyBloodSugarReport.getStatisticBloodSugar() != null) {
                BloodGlucoseDataUtil bloodGlucoseDataUtil = BloodGlucoseDataUtil.INSTANCE;
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                DailyBloodSugarReport dailyBloodSugarReport2 = this.mBloodSugarReport;
                Intrinsics.checkNotNull(dailyBloodSugarReport2);
                StatisticBloodSugar statisticBloodSugar = dailyBloodSugarReport2.getStatisticBloodSugar();
                Intrinsics.checkNotNull(statisticBloodSugar);
                List listCreateSummaryModelList$default = BloodGlucoseDataUtil.createSummaryModelList$default(bloodGlucoseDataUtil, contextRequireContext, statisticBloodSugar, 0, 4, null);
                if (!listCreateSummaryModelList$default.isEmpty()) {
                    DailyBloodSugarReport dailyBloodSugarReport3 = this.mBloodSugarReport;
                    Intrinsics.checkNotNull(dailyBloodSugarReport3);
                    Map<Long, BloodSugarItem> bloodSugarMap = dailyBloodSugarReport3.getBloodSugarMap();
                    if (bloodSugarMap != null && bloodSugarMap.size() > 1) {
                        RecyclerView recyclerView = this.recyclerDetail;
                        Intrinsics.checkNotNull(recyclerView);
                        recyclerView.setVisibility(0);
                        List<qpo> list = this.mDataListDetail;
                        Intrinsics.checkNotNull(list);
                        list.clear();
                        List<qpo> list2 = this.mDataListDetail;
                        Intrinsics.checkNotNull(list2);
                        list2.addAll(listCreateSummaryModelList$default);
                        opo opoVar = this.mDetailAdapter;
                        Intrinsics.checkNotNull(opoVar);
                        opoVar.setHeaderViewTitle(qpo.a("days"));
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

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshDistributeCard() {
        DailyBloodSugarReport dailyBloodSugarReport = this.mBloodSugarReport;
        if ((dailyBloodSugarReport != null ? dailyBloodSugarReport.getTargetDistMap() : null) == null) {
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
        Map<Integer, Integer> targetDistMap = dailyBloodSugarReport2.getTargetDistMap();
        Intrinsics.checkNotNull(targetDistMap);
        List<uz6> listCreateDistributeData = bloodGlucoseDataUtil.createDistributeData(contextRequireContext, targetDistMap);
        List<uz6> list = listCreateDistributeData;
        if (!(!list.isEmpty())) {
            RecyclerView recyclerView2 = this.mDistributeRecyclerView;
            Intrinsics.checkNotNull(recyclerView2);
            recyclerView2.setVisibility(8);
            return;
        }
        DistributeDataUtil.setPositionOfList(listCreateDistributeData);
        RecyclerView recyclerView3 = this.mDistributeRecyclerView;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setVisibility(0);
        List<uz6> list2 = this.mDistributeData;
        Intrinsics.checkNotNull(list2);
        list2.clear();
        List<uz6> list3 = this.mDistributeData;
        Intrinsics.checkNotNull(list3);
        list3.addAll(list);
        cx2 cx2Var = this.mDistributeAdapter;
        Intrinsics.checkNotNull(cx2Var);
        cx2Var.m(getString(c0j.q1, String.valueOf(((BloodGlucoseViewModel) getMViewModel()).getLowSettingValue()), String.valueOf(((BloodGlucoseViewModel) getMViewModel()).getHighSettingValue())));
        cx2 cx2Var2 = this.mDistributeAdapter;
        Intrinsics.checkNotNull(cx2Var2);
        cx2Var2.notifyDataSetChanged();
    }

    private final void refreshViewOnReportChanged() {
        DailyBloodSugarReport dailyBloodSugarReport = this.mBloodSugarReport;
        Logger.i(TAG, "refresh BloodGlucoseDay .. " + (dailyBloodSugarReport != null ? dailyBloodSugarReport.toString() : null));
        refreshBarChart();
        refreshDetailCard();
        refreshDistributeCard();
        updateBloodGlucoseGuideView();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestData() {
        LocalDate localDate = this.mCurrentLocalDate;
        Intrinsics.checkNotNull(localDate);
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDate);
        Logger.i("BloodPressureDay", "start request device data.." + this.mCurrentLocalDate + "/params start:" + jChangZeroOfTheDay);
        ((BloodGlucoseViewModel) getMViewModel()).triggerFetchFitnessReport(IBloodSugarRepository.class, "days", jChangZeroOfTheDay, 0, 0, "").observe(getViewLifecycleOwner(), new Observer() { // from class: iw2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodGlucoseAllDayItemFragment.requestData$lambda$15(this.f22157a, (List) obj);
            }
        });
        ((BloodGlucoseViewModel) getMViewModel()).getTheGMIAndAGP(jChangZeroOfTheDay);
        ((BloodGlucoseViewModel) getMViewModel()).getBloodSugarGMIAndAGPResult().observe(getViewLifecycleOwner(), new BloodGlucoseAllDayItemFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: jw2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BloodGlucoseAllDayItemFragment.requestData$lambda$16(this.f23197a, (BloodSugarGMIAndAGPResult) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestData$lambda$15(BloodGlucoseAllDayItemFragment this$0, List list) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestData$lambda$16(BloodGlucoseAllDayItemFragment this$0, BloodSugarGMIAndAGPResult bloodSugarGMIAndAGPResult) {
        BloodGlucoseDayDetailAdapter bloodGlucoseDayDetailAdapter;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bloodSugarGMIAndAGPResult != null && (bloodGlucoseDayDetailAdapter = this$0.mDayDetailAdapter) != null) {
            if (bloodGlucoseDayDetailAdapter != null) {
                bloodGlucoseDayDetailAdapter.setGMIAndAGP(bloodSugarGMIAndAGPResult);
            }
            BloodGlucoseDayDetailAdapter bloodGlucoseDayDetailAdapter2 = this$0.mDayDetailAdapter;
            if (bloodGlucoseDayDetailAdapter2 != null) {
                bloodGlucoseDayDetailAdapter2.notifyDataSetChanged();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, lw2] */
    private final void updateBloodGlucoseGuideView() {
        Boolean boolIsDeviceInitDone;
        View view = this.permSettingInstView;
        AppCompatImageView appCompatImageView = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
            view = null;
        }
        ViewExtKt.setVisible(view, false);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new View.OnClickListener() { // from class: lw2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BloodGlucoseAllDayItemFragment.updateBloodGlucoseGuideView$lambda$0(this.f25485a, view2);
            }
        };
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        DeviceManagerExtKt.getInstance(companion).getDeviceByModelFromAllDevice(MODEL_CGM);
        final WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).findDeviceModel(new Function1() { // from class: mw2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(BloodGlucoseAllDayItemFragment.updateBloodGlucoseGuideView$lambda$1((WearableDeviceModel) obj));
            }
        });
        boolean zBooleanValue = (wearableDeviceModel == null || (boolIsDeviceInitDone = BloodSugarExtKt.getInstance(BloodSugarRemindSettingManager.INSTANCE).isDeviceInitDone(wearableDeviceModel)) == null) ? false : boolIsDeviceInitDone.booleanValue();
        final boolean zIsDeviceTimeExpire = wearableDeviceModel != null ? BloodSugarExtKt.getInstance(BloodSugarRemindSettingManager.INSTANCE).isDeviceTimeExpire(wearableDeviceModel) : false;
        if (!zBooleanValue && wearableDeviceModel != null) {
            final Ref.IntRef intRef = new Ref.IntRef();
            Integer numIsDeviceToInitDoneTime = BloodSugarExtKt.getInstance(BloodSugarRemindSettingManager.INSTANCE).isDeviceToInitDoneTime(wearableDeviceModel);
            if (numIsDeviceToInitDoneTime == null) {
                return;
            }
            int iIntValue = numIsDeviceToInitDoneTime.intValue();
            intRef.element = iIntValue;
            if (iIntValue > 0) {
                this.mHandler = new Handler(Looper.getMainLooper());
                View view2 = this.permSettingInstView;
                if (view2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
                    view2 = null;
                }
                ViewExtKt.setVisible(view2, true);
                AppCompatImageView appCompatImageView2 = this.closePermSettingCross;
                if (appCompatImageView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("closePermSettingCross");
                    appCompatImageView2 = null;
                }
                appCompatImageView2.setBackground(BaseFragmentExtKt.getDrawable(this, pni.f30561b));
                AppCompatImageView appCompatImageView3 = this.closePermSettingCross;
                if (appCompatImageView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("closePermSettingCross");
                } else {
                    appCompatImageView = appCompatImageView3;
                }
                appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: nw2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        WebViewUtilKt.startWebView$default("https://watch.iot.mi.com/html/m8-manual/index.html", null, false, false, null, false, null, false, 254, null);
                    }
                });
                Runnable runnable = new Runnable() { // from class: ow2
                    @Override // java.lang.Runnable
                    public final void run() {
                        BloodGlucoseAllDayItemFragment.updateBloodGlucoseGuideView$lambda$3(intRef, wearableDeviceModel, this);
                    }
                };
                this.timerRunnable = runnable;
                Handler handler = this.mHandler;
                if (handler != null) {
                    Intrinsics.checkNotNull(runnable);
                    handler.postDelayed(runnable, 1L);
                    return;
                }
                return;
            }
        }
        ((BloodGlucoseViewModel) getMViewModel()).queryRestrictionLevel();
        ((BloodGlucoseViewModel) getMViewModel()).isNoRestrictedLevelLiveData().observe(getViewLifecycleOwner(), new BloodGlucoseAllDayItemFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: pw2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BloodGlucoseAllDayItemFragment.updateBloodGlucoseGuideView$lambda$12(this.f30841a, objectRef, zIsDeviceTimeExpire, wearableDeviceModel, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateBloodGlucoseGuideView$lambda$0(BloodGlucoseAllDayItemFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View view2 = this$0.permSettingInstView;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
            view2 = null;
        }
        ExtUtilKt.gone(view2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean updateBloodGlucoseGuideView$lambda$1(WearableDeviceModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return BloodSugarExtKt.isBloodSugar(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r11v1, types: [T, gw2] */
    /* JADX WARN: Type inference failed for: r11v14, types: [T, ew2] */
    /* JADX WARN: Type inference failed for: r11v24, types: [T, sw2] */
    /* JADX WARN: Type inference failed for: r11v34, types: [T, qw2] */
    public static final Unit updateBloodGlucoseGuideView$lambda$12(final BloodGlucoseAllDayItemFragment this$0, Ref.ObjectRef closeListener, boolean z, WearableDeviceModel wearableDeviceModel, Boolean bool) {
        String string;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(closeListener, "$closeListener");
        View view = this$0.permSettingInstView;
        AppCompatImageView appCompatImageView = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
            view = null;
        }
        ExtUtilKt.gone(view);
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        DailyBloodSugarReport dailyBloodSugarReport = this$0.mBloodSugarReport;
        if (dailyBloodSugarReport != null && dailyBloodSugarReport.hasAbnormalDataByLatestItem() && !TimeUtils.INSTANCE.isSameDay(System.currentTimeMillis(), BloodSugarPermissionGuidePreference.INSTANCE.getFIRST_TIME_CLOSED_TIMESTAMP_ABNORMAL())) {
            closeListener.element = new View.OnClickListener() { // from class: qw2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BloodGlucoseAllDayItemFragment.updateBloodGlucoseGuideView$lambda$12$lambda$4(this.f31899a, view2);
                }
            };
            View view2 = this$0.permSettingInstView;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
                view2 = null;
            }
            ViewExtKt.setVisible(view2, true);
            TextView textView = this$0.permSettingInstTv;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("permSettingInstTv");
                textView = null;
            }
            textView.setText(this$0.getString(c0j.h1));
            TextView textView2 = this$0.permSettingInstTv;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("permSettingInstTv");
                textView2 = null;
            }
            textView2.setOnClickListener(new View.OnClickListener() { // from class: rw2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    BloodGlucoseAllDayItemFragment.updateBloodGlucoseGuideView$lambda$12$lambda$5(this.f32958a, view3);
                }
            });
        } else if (z && !this$0.isSugarDadaSyncDone(wearableDeviceModel) && !TimeUtils.INSTANCE.isSameDay(System.currentTimeMillis(), BloodSugarPermissionGuidePreference.INSTANCE.getFIRST_TIME_CLOSED_TIMESTAMP_LOSE_DATA())) {
            closeListener.element = new View.OnClickListener() { // from class: sw2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    BloodGlucoseAllDayItemFragment.updateBloodGlucoseGuideView$lambda$12$lambda$6(this.f34047a, view3);
                }
            };
            View view3 = this$0.permSettingInstView;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
                view3 = null;
            }
            ViewExtKt.setVisible(view3, true);
            TextView textView3 = this$0.permSettingInstTv;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("permSettingInstTv");
                textView3 = null;
            }
            textView3.setText(this$0.getString(c0j.n1));
            TextView textView4 = this$0.permSettingInstTv;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("permSettingInstTv");
                textView4 = null;
            }
            textView4.setOnClickListener(new View.OnClickListener() { // from class: dw2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    BloodGlucoseAllDayItemFragment.updateBloodGlucoseGuideView$lambda$12$lambda$7(this.f15984a, view4);
                }
            });
        } else if (!zBooleanValue && !TimeUtils.INSTANCE.isSameDay(System.currentTimeMillis(), BloodSugarPermissionGuidePreference.INSTANCE.getFIRST_TIME_CLOSED_TIMESTAMP_AUTO()) && RomUtils.isXiaomi()) {
            closeListener.element = new View.OnClickListener() { // from class: ew2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    BloodGlucoseAllDayItemFragment.updateBloodGlucoseGuideView$lambda$12$lambda$8(this.f17123a, view4);
                }
            };
            View view4 = this$0.permSettingInstView;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
                view4 = null;
            }
            ViewExtKt.setVisible(view4, true);
            TextView textView5 = this$0.permSettingInstTv;
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("permSettingInstTv");
                textView5 = null;
            }
            textView5.setText(this$0.getString(c0j.i1));
            TextView textView6 = this$0.permSettingInstTv;
            if (textView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("permSettingInstTv");
                textView6 = null;
            }
            textView6.setOnClickListener(new View.OnClickListener() { // from class: fw2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view5) {
                    BloodGlucoseAllDayItemFragment.updateBloodGlucoseGuideView$lambda$12$lambda$9(this.f18310a, view5);
                }
            });
        } else if (wearableDeviceModel != null && !TimeUtils.INSTANCE.isSameDay(System.currentTimeMillis(), BloodSugarPermissionGuidePreference.INSTANCE.getFIRST_TIME_CLOSED_TIMESTAMP_EXPIRE())) {
            BloodSugarRemindSettingManager.Companion companion = BloodSugarRemindSettingManager.INSTANCE;
            boolean zIsDeviceTimeExpireOneDay = BloodSugarExtKt.getInstance(companion).isDeviceTimeExpireOneDay(wearableDeviceModel);
            boolean zIsDeviceTimeExpireOneHour = BloodSugarExtKt.getInstance(companion).isDeviceTimeExpireOneHour(wearableDeviceModel);
            if (zIsDeviceTimeExpireOneHour) {
                string = this$0.getString(c0j.l1);
            } else {
                string = zIsDeviceTimeExpireOneDay ? this$0.getString(c0j.k1) : this$0.getString(c0j.j1);
            }
            Intrinsics.checkNotNull(string);
            if (zIsDeviceTimeExpireOneDay || zIsDeviceTimeExpireOneHour || z) {
                closeListener.element = new View.OnClickListener() { // from class: gw2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view5) {
                        BloodGlucoseAllDayItemFragment.updateBloodGlucoseGuideView$lambda$12$lambda$10(this.f19385a, view5);
                    }
                };
                View view5 = this$0.permSettingInstView;
                if (view5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
                    view5 = null;
                }
                ViewExtKt.setVisible(view5, true);
                TextView textView7 = this$0.permSettingInstTv;
                if (textView7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("permSettingInstTv");
                    textView7 = null;
                }
                textView7.setText(string);
                TextView textView8 = this$0.permSettingInstTv;
                if (textView8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("permSettingInstTv");
                    textView8 = null;
                }
                textView8.setOnClickListener(new View.OnClickListener() { // from class: hw2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view6) {
                        BloodGlucoseAllDayItemFragment.updateBloodGlucoseGuideView$lambda$12$lambda$11(this.f20531a, view6);
                    }
                });
            } else {
                View view6 = this$0.permSettingInstView;
                if (view6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
                    view6 = null;
                }
                ExtUtilKt.gone(view6);
            }
        }
        AppCompatImageView appCompatImageView2 = this$0.closePermSettingCross;
        if (appCompatImageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("closePermSettingCross");
        } else {
            appCompatImageView = appCompatImageView2;
        }
        appCompatImageView.setOnClickListener((View.OnClickListener) closeListener.element);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateBloodGlucoseGuideView$lambda$12$lambda$10(BloodGlucoseAllDayItemFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BloodSugarPermissionGuidePreference.INSTANCE.setFIRST_TIME_CLOSED_TIMESTAMP_EXPIRE(System.currentTimeMillis());
        View view2 = this$0.permSettingInstView;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
            view2 = null;
        }
        ExtUtilKt.gone(view2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateBloodGlucoseGuideView$lambda$12$lambda$11(BloodGlucoseAllDayItemFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.goDeviceSettings();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateBloodGlucoseGuideView$lambda$12$lambda$4(BloodGlucoseAllDayItemFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BloodSugarPermissionGuidePreference.INSTANCE.setFIRST_TIME_CLOSED_TIMESTAMP_ABNORMAL(System.currentTimeMillis());
        View view2 = this$0.permSettingInstView;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
            view2 = null;
        }
        ExtUtilKt.gone(view2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateBloodGlucoseGuideView$lambda$12$lambda$5(BloodGlucoseAllDayItemFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseFragmentExKt.gotoPage(this$0, BloodGlucoseFilteredRecordsFragment.class, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateBloodGlucoseGuideView$lambda$12$lambda$6(BloodGlucoseAllDayItemFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BloodSugarPermissionGuidePreference.INSTANCE.setFIRST_TIME_CLOSED_TIMESTAMP_LOSE_DATA(System.currentTimeMillis());
        View view2 = this$0.permSettingInstView;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
            view2 = null;
        }
        ExtUtilKt.gone(view2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateBloodGlucoseGuideView$lambda$12$lambda$7(BloodGlucoseAllDayItemFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.goDeviceSettings();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateBloodGlucoseGuideView$lambda$12$lambda$8(BloodGlucoseAllDayItemFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BloodSugarPermissionGuidePreference.INSTANCE.setFIRST_TIME_CLOSED_TIMESTAMP_AUTO(System.currentTimeMillis());
        View view2 = this$0.permSettingInstView;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
            view2 = null;
        }
        ExtUtilKt.gone(view2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateBloodGlucoseGuideView$lambda$12$lambda$9(BloodGlucoseAllDayItemFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseFragmentExKt.gotoPage(this$0, SleepPermissionSettingFragment.class, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateBloodGlucoseGuideView$lambda$3(Ref.IntRef initTime, WearableDeviceModel wearableDeviceModel, BloodGlucoseAllDayItemFragment this$0) {
        Intrinsics.checkNotNullParameter(initTime, "$initTime");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Integer numIsDeviceToInitDoneTime = BloodSugarExtKt.getInstance(BloodSugarRemindSettingManager.INSTANCE).isDeviceToInitDoneTime(wearableDeviceModel);
        if (numIsDeviceToInitDoneTime != null) {
            initTime.element = numIsDeviceToInitDoneTime.intValue();
            Resources resources = this$0.getResources();
            int i = oyi.c;
            int i2 = initTime.element;
            String quantityString = resources.getQuantityString(i, i2, Integer.valueOf(i2));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            TextView textView = this$0.permSettingInstTv;
            View view = null;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("permSettingInstTv");
                textView = null;
            }
            textView.setText(this$0.getString(c0j.m1, quantityString));
            if (initTime.element <= 0) {
                View view2 = this$0.permSettingInstView;
                if (view2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
                } else {
                    view = view2;
                }
                ViewExtKt.setVisible(view, false);
                return;
            }
            Handler handler = this$0.mHandler;
            if (handler != null) {
                Runnable runnable = this$0.timerRunnable;
                Intrinsics.checkNotNull(runnable);
                handler.postDelayed(runnable, 1000L);
            }
        }
    }

    private final void updateDetailRecyclerLayoutManager() {
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

    private final void updateDistributeRecyclerLayoutManager() {
        RecyclerView recyclerView;
        if (getMActivity() == null || this.mDistributeAdapter == null || (recyclerView = this.mDistributeRecyclerView) == null) {
            return;
        }
        HealthUtil healthUtil = HealthUtil.INSTANCE;
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        cx2 cx2Var = this.mDistributeAdapter;
        Intrinsics.checkNotNull(cx2Var);
        recyclerView.setLayoutManager(healthUtil.buildCommonDataAdapterLayoutManager(mActivity, cx2Var));
    }

    @Nullable
    public final RecyclerView getBloodGlucoseRecordRecyclerView() {
        return this.bloodGlucoseRecordRecyclerView;
    }

    @Nullable
    public final DataTitleView getDataTitleView() {
        return this.dataTitleView;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.t;
    }

    @Nullable
    public final BloodSugarLineChartRecyclerView getLineChartRecyclerView() {
        return this.lineChartRecyclerView;
    }

    @Nullable
    public final LocalDate getMCurrentDate() {
        return this.mCurrentDate;
    }

    @Nullable
    public final RecyclerView getRecyclerDetail() {
        return this.recyclerDetail;
    }

    @Nullable
    public final View getUnderstandCard() {
        return this.understandCard;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        updateDetailRecyclerLayoutManager();
        updateDistributeRecyclerLayoutManager();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        Runnable runnable;
        super.onDestroy();
        Handler handler = this.mHandler;
        if (handler == null || (runnable = this.timerRunnable) == null || handler == null) {
            return;
        }
        Intrinsics.checkNotNull(runnable);
        handler.removeCallbacks(runnable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        View view = this.containerView;
        if (view != null) {
            view.requestLayout();
        }
        ((BloodGlucoseViewModel) getMViewModel()).getBloodSugarRemindSettingFromLocal();
        initPointLineColor();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        initBundle();
        initViewBinding();
        initPermissionInstructionView();
        initView();
    }

    public final void setBloodGlucoseRecordRecyclerView(@Nullable RecyclerView recyclerView) {
        this.bloodGlucoseRecordRecyclerView = recyclerView;
    }

    public final void setDataTitleView(@Nullable DataTitleView dataTitleView) {
        this.dataTitleView = dataTitleView;
    }

    public final void setLineChartRecyclerView(@Nullable BloodSugarLineChartRecyclerView bloodSugarLineChartRecyclerView) {
        this.lineChartRecyclerView = bloodSugarLineChartRecyclerView;
    }

    public final void setMCurrentDate(@Nullable LocalDate localDate) {
        this.mCurrentDate = localDate;
    }

    public final void setRecyclerDetail(@Nullable RecyclerView recyclerView) {
        this.recyclerDetail = recyclerView;
    }

    public final void setUnderstandCard(@Nullable View view) {
        this.understandCard = view;
    }
}
