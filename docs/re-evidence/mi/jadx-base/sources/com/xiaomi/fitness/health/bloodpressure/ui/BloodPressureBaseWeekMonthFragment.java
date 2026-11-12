package com.xiaomi.fitness.health.bloodpressure.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.api.repository.IBloodPressureRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBloodPressureReport;
import com.xiaomi.fit.fitness.export.data.item.BloodPressureItem;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.recycer.BarChartRecyclerHelper;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableProductManager;
import com.xiaomi.fitness.device.manager.export.bean.WearableProduct;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.bloodpressure.BloodPressureViewModel;
import com.xiaomi.fitness.health.bloodpressure.ui.BloodPressureBaseWeekMonthFragment;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.util.PingAnHealthExtKt;
import com.xiaomi.fitness.util.ViewUtil;
import com.xiaomi.fitness.view.HealthBannerCardSetView;
import com.xiaomi.fitness.widget.distribute.DistributeDataUtil;
import defpackage.a52;
import defpackage.bl5;
import defpackage.c0j;
import defpackage.hak;
import defpackage.hdr;
import defpackage.hz2;
import defpackage.ili;
import defpackage.opo;
import defpackage.pni;
import defpackage.q02;
import defpackage.qpo;
import defpackage.qxi;
import defpackage.r02;
import defpackage.s02;
import defpackage.sz6;
import defpackage.uz6;
import defpackage.vnq;
import defpackage.vqr;
import defpackage.xcm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\b&\u0018\u0000 \u0087\u0001*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\u0002\u0087\u0001B\b¢\u0006\u0005\b\u0086\u0001\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\bJ\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\bJ\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\bJ\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\bJ\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\bJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\bJ!\u0010 \u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0006H&¢\u0006\u0004\b\"\u0010\bJ\u0017\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R$\u0010+\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00101\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u00107\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00102\u001a\u0004\b8\u00104\"\u0004\b9\u00106R$\u0010;\u001a\u0004\u0018\u00010:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001e\u0010F\u001a\n\u0012\u0004\u0012\u00020E\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010L\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010O\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR$\u0010R\u001a\u0004\u0018\u00010Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001e\u0010Z\u001a\n\u0012\u0004\u0012\u00020Y\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u001e\u0010]\u001a\n\u0012\u0004\u0012\u00020Y\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R$\u0010`\u001a\u0004\u0018\u00010_8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0018\u0010g\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u001e\u0010j\u001a\n\u0012\u0004\u0012\u00020i\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010[R$\u0010k\u001a\u0004\u0018\u00010_8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010a\u001a\u0004\bl\u0010c\"\u0004\bm\u0010eR\u0018\u0010o\u001a\u0004\u0018\u00010n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u001e\u0010r\u001a\n\u0012\u0004\u0012\u00020q\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010[R$\u0010s\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bs\u00102\u001a\u0004\bt\u00104\"\u0004\bu\u00106R$\u0010w\u001a\u0004\u0018\u00010v8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R\u0015\u0010\u0080\u0001\u001a\u00020}8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b~\u0010\u007fR\u0016\u0010\u0082\u0001\u001a\u00020}8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010\u007fR\u0017\u0010\u0085\u0001\u001a\u00020K8$X¤\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001¨\u0006\u0088\u0001"}, d2 = {"Lcom/xiaomi/fitness/health/bloodpressure/ui/BloodPressureBaseWeekMonthFragment;", "Lcom/xiaomi/fitness/health/bloodpressure/BloodPressureViewModel;", "VM", "Landroidx/databinding/ViewDataBinding;", "VDB", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "", Constants.KEY_REQUEST_DATA, "()V", "refreshViewOnReportChanged", "refreshDistributeCard", "refreshDetailCard", "refreshBarChart", "refreshDataTitleView", "", "hasPulse", "refreshViewHeight", "(Z)V", "initView", "initHealthBanners", "initUnderstandCard", "initDistributeCard", "updateRecyclerDistributeLayoutManager", "updateRecyclerDetailLayoutManager", "initDetailCard", "initBarChartRecyclerView", "initBundle", LifecycleConstantKt.ON_RESUME, "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "initViewBinding", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lorg/joda/time/LocalDate;", "mCurrentLocalDate", "Lorg/joda/time/LocalDate;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodPressureReport;", "mBloodPressureReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodPressureReport;", "getMBloodPressureReport", "()Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodPressureReport;", "setMBloodPressureReport", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodPressureReport;)V", "containerView", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "setContainerView", "(Landroid/view/View;)V", "topGuideView", "getTopGuideView", "setTopGuideView", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "mBarChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "getMBarChartRecyclerView", "()Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "setMBarChartRecyclerView", "(Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;)V", "Ls02;", "mItemDecoration", "Ls02;", "Lvnq;", "La52;", "mYAxis", "Lvnq;", "Lvqr;", "mXAxis", "Lvqr;", "", "mDisplayNumber", "I", "Lr02;", "mBarChartAttrs", "Lr02;", "Lcom/xiaomi/fitness/health/bloodpressure/ui/BloodPressureDataTitleView;", "dataTitleView", "Lcom/xiaomi/fitness/health/bloodpressure/ui/BloodPressureDataTitleView;", "getDataTitleView", "()Lcom/xiaomi/fitness/health/bloodpressure/ui/BloodPressureDataTitleView;", "setDataTitleView", "(Lcom/xiaomi/fitness/health/bloodpressure/ui/BloodPressureDataTitleView;)V", "", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "mBarChartEntries", "Ljava/util/List;", "Lq02;", "mBarChartAdapter", "Lq02;", "Landroidx/recyclerview/widget/RecyclerView;", "mDetailRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getMDetailRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setMDetailRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lopo;", "mDetailAdapter", "Lopo;", "Lqpo;", "mDataListDetail", "mDistributeRecyclerView", "getMDistributeRecyclerView", "setMDistributeRecyclerView", "Lsz6;", "mDistributeAdapter", "Lsz6;", "Luz6;", "mDistributeData", "understandCard", "getUnderstandCard", "setUnderstandCard", "Lcom/xiaomi/fitness/view/HealthBannerCardSetView;", "healthBannerCardSetView", "Lcom/xiaomi/fitness/view/HealthBannerCardSetView;", "getHealthBannerCardSetView", "()Lcom/xiaomi/fitness/view/HealthBannerCardSetView;", "setHealthBannerCardSetView", "(Lcom/xiaomi/fitness/view/HealthBannerCardSetView;)V", "", "getViewTag", "()Ljava/lang/String;", CloudContract.COL_VIEW_TAG, "getEmptyTitleStr", "emptyTitleStr", "getFragmentPosition", "()I", "fragmentPosition", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBloodPressureBaseWeekMonthFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodPressureBaseWeekMonthFragment.kt\ncom/xiaomi/fitness/health/bloodpressure/ui/BloodPressureBaseWeekMonthFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,439:1\n163#2,2:440\n*S KotlinDebug\n*F\n+ 1 BloodPressureBaseWeekMonthFragment.kt\ncom/xiaomi/fitness/health/bloodpressure/ui/BloodPressureBaseWeekMonthFragment\n*L\n276#1:440,2\n*E\n"})
public abstract class BloodPressureBaseWeekMonthFragment<VM extends BloodPressureViewModel, VDB extends ViewDataBinding> extends BaseBindingFragment<VM, VDB> {

    @NotNull
    public static final String TAG = "BloodPressureWm";

    @Nullable
    private View containerView;

    @Nullable
    private BloodPressureDataTitleView dataTitleView;

    @Nullable
    private HealthBannerCardSetView healthBannerCardSetView;

    @Nullable
    private q02<RecyclerBarEntry> mBarChartAdapter;

    @Nullable
    private r02 mBarChartAttrs;

    @Nullable
    private List<RecyclerBarEntry> mBarChartEntries;

    @Nullable
    private BarChartRecyclerView mBarChartRecyclerView;

    @Nullable
    private DailyBloodPressureReport mBloodPressureReport;

    @Nullable
    private LocalDate mCurrentLocalDate;

    @Nullable
    private List<qpo> mDataListDetail;

    @Nullable
    private opo mDetailAdapter;

    @Nullable
    private RecyclerView mDetailRecyclerView;
    private int mDisplayNumber;

    @Nullable
    private sz6 mDistributeAdapter;

    @Nullable
    private List<uz6> mDistributeData;

    @Nullable
    private RecyclerView mDistributeRecyclerView;

    @Nullable
    private s02 mItemDecoration;

    @Nullable
    private vqr mXAxis;

    @Nullable
    private vnq<a52> mYAxis;

    @Nullable
    private View topGuideView;

    @Nullable
    private View understandCard;

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

    private final void initBarChartRecyclerView() {
        BarChartRecyclerView barChartRecyclerView = this.mBarChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView);
        r02 r02Var = (r02) barChartRecyclerView.mAttrs;
        this.mBarChartAttrs = r02Var;
        ViewUtil viewUtil = ViewUtil.INSTANCE;
        Intrinsics.checkNotNull(r02Var);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        viewUtil.adaptChartHighLightTextSize(r02Var, contextRequireContext);
        r02 r02Var2 = this.mBarChartAttrs;
        Intrinsics.checkNotNull(r02Var2);
        this.mDisplayNumber = r02Var2.c;
        this.mBarChartEntries = new ArrayList();
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(getActivity(), this.mBarChartAttrs);
        this.mYAxis = vnq.p(this.mBarChartAttrs, 180.0f, 3);
        vqr vqrVar = new vqr(this.mBarChartAttrs, this.mDisplayNumber);
        this.mXAxis = vqrVar;
        Intrinsics.checkNotNull(vqrVar);
        BarChartRecyclerHelper barChartRecyclerHelper = BarChartRecyclerHelper.INSTANCE;
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        vqrVar.setValueFormatter(barChartRecyclerHelper.createXAxisFormatter(contextRequireContext2, getFragmentPosition()));
        this.mItemDecoration = new s02(this.mYAxis, this.mXAxis, this.mBarChartAttrs);
        hdr hdrVar = new hdr(getMActivity());
        s02 s02Var = this.mItemDecoration;
        Intrinsics.checkNotNull(s02Var);
        s02Var.setHighLightValueFormatter(hdrVar);
        BarChartRecyclerView barChartRecyclerView2 = this.mBarChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView2);
        s02 s02Var2 = this.mItemDecoration;
        Intrinsics.checkNotNull(s02Var2);
        barChartRecyclerView2.addItemDecoration(s02Var2);
        this.mBarChartAdapter = new q02<>(getMActivity(), this.mBarChartEntries, this.mBarChartRecyclerView, this.mXAxis, this.mBarChartAttrs, hdrVar);
        BarChartRecyclerView barChartRecyclerView3 = this.mBarChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView3);
        barChartRecyclerView3.setAdapter(this.mBarChartAdapter);
        BarChartRecyclerView barChartRecyclerView4 = this.mBarChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView4);
        barChartRecyclerView4.setLayoutManager(speedRatioLayoutManager);
        BarChartRecyclerView barChartRecyclerView5 = this.mBarChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView5);
        barChartRecyclerView5.setNestedScrollingEnabled(false);
        hak hakVar = new hak(getActivity(), this.mBarChartRecyclerView, new xcm(this) { // from class: com.xiaomi.fitness.health.bloodpressure.ui.BloodPressureBaseWeekMonthFragment$initBarChartRecyclerView$itemGestureListener$1
            final /* synthetic */ BloodPressureBaseWeekMonthFragment<VM, VDB> this$0;

            {
                this.this$0 = this;
            }

            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                if (barEntry == null || !barEntry.isSelected()) {
                    BloodPressureDataTitleView dataTitleView = this.this$0.getDataTitleView();
                    if (dataTitleView != null) {
                        dataTitleView.setVisibility(0);
                        return;
                    }
                    return;
                }
                BloodPressureDataTitleView dataTitleView2 = this.this$0.getDataTitleView();
                if (dataTitleView2 != null) {
                    dataTitleView2.setVisibility(4);
                }
            }
        });
        BarChartRecyclerView barChartRecyclerView6 = this.mBarChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView6);
        barChartRecyclerView6.addOnItemTouchListener(hakVar);
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
        bl5 bl5Var = new bl5();
        RecyclerView recyclerView = this.mDetailRecyclerView;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.addItemDecoration(bl5Var);
        this.mDetailAdapter = new opo(getMActivity(), this.mDataListDetail, getString(c0j.K6), pni.H1);
        updateRecyclerDetailLayoutManager();
        RecyclerView recyclerView2 = this.mDetailRecyclerView;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setAdapter(this.mDetailAdapter);
        RecyclerView recyclerView3 = this.mDetailRecyclerView;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setHasFixedSize(true);
    }

    private final void initDistributeCard() {
        this.mDistributeData = new ArrayList();
        bl5 bl5Var = new bl5(false);
        RecyclerView recyclerView = this.mDistributeRecyclerView;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.addItemDecoration(bl5Var);
        this.mDistributeAdapter = new sz6(getMActivity(), this.mDistributeData, 7);
        updateRecyclerDistributeLayoutManager();
        RecyclerView recyclerView2 = this.mDistributeRecyclerView;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setAdapter(this.mDistributeAdapter);
        RecyclerView recyclerView3 = this.mDistributeRecyclerView;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setHasFixedSize(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initHealthBanners() {
        WearableProduct wearableProduct = (WearableProduct) DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).findProduct(new Function1() { // from class: vy2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(BloodPressureBaseWeekMonthFragment.initHealthBanners$lambda$1((WearableProduct) obj));
            }
        });
        Logger.i("initHealthBannerSet", "findSupportProduct " + (wearableProduct != null ? wearableProduct.getModel() : null));
        if (wearableProduct != null) {
            HealthBannerCardSetView healthBannerCardSetView = this.healthBannerCardSetView;
            if (healthBannerCardSetView != null) {
                PingAnHealthExtKt.bindTwoBanners(healthBannerCardSetView, 0);
                return;
            }
            return;
        }
        HealthBannerCardSetView healthBannerCardSetView2 = this.healthBannerCardSetView;
        if (healthBannerCardSetView2 != null) {
            PingAnHealthExtKt.bindOneBanner(healthBannerCardSetView2, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initHealthBanners$lambda$1(WearableProduct it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StringsKt__StringsKt.contains$default((CharSequence) it.getModel(), (CharSequence) AboutBloodPressureFragment.N60E_MODEL, false, 2, (Object) null);
    }

    private final void initUnderstandCard() {
        View view = this.understandCard;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: wy2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BloodPressureBaseWeekMonthFragment.initUnderstandCard$lambda$2(this.f38471a, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initUnderstandCard$lambda$2(BloodPressureBaseWeekMonthFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseFragmentExKt.gotoPage(this$0, UnderstandBloodPressureFragment.class, null);
    }

    private final void initView() {
        initBarChartRecyclerView();
        initDetailCard();
        initDistributeCard();
        initUnderstandCard();
        initHealthBanners();
    }

    private final void refreshBarChart() {
        List<RecyclerBarEntry> list = this.mBarChartEntries;
        if (list != null) {
            list.clear();
        }
        DailyBloodPressureReport dailyBloodPressureReport = this.mBloodPressureReport;
        if (dailyBloodPressureReport == null) {
            LocalDate localDate = this.mCurrentLocalDate;
            Intrinsics.checkNotNull(localDate);
            dailyBloodPressureReport = new DailyBloodPressureReport(TimeDateUtil.changZeroOfTheDay(localDate), getViewTag());
        }
        List<SegmentBarEntry> listI = hz2.i(this.mBarChartAttrs, dailyBloodPressureReport, Intrinsics.areEqual(getViewTag(), "weeks"));
        Intrinsics.checkNotNullExpressionValue(listI, "getWeekMonthSegmentBarEntryList(...)");
        List<RecyclerBarEntry> list2 = this.mBarChartEntries;
        if (list2 != null) {
            list2.clear();
        }
        List<RecyclerBarEntry> list3 = this.mBarChartEntries;
        if (list3 != null) {
            list3.addAll(listI);
        }
        float theMaxNumber = HealthUtil.getTheMaxNumber(listI);
        Number numberValueOf = theMaxNumber > 180.0f ? Integer.valueOf(((((int) (theMaxNumber - 180)) / 20) * 20) + 200) : Float.valueOf(180.0f);
        vnq<a52> vnqVar = this.mYAxis;
        Intrinsics.checkNotNull(vnqVar);
        this.mYAxis = vnqVar.s(this.mYAxis, numberValueOf.floatValue(), 3);
        s02 s02Var = this.mItemDecoration;
        Intrinsics.checkNotNull(s02Var);
        s02Var.setYAxis(this.mYAxis);
        q02<RecyclerBarEntry> q02Var = this.mBarChartAdapter;
        Intrinsics.checkNotNull(q02Var);
        q02Var.setYAxis(this.mYAxis);
        q02<RecyclerBarEntry> q02Var2 = this.mBarChartAdapter;
        if (q02Var2 != null) {
            q02Var2.notifyDataSetChanged();
        }
        refreshDataTitleView();
    }

    private final void refreshDataTitleView() {
        String strValueOf;
        String strValueOf2;
        String strValueOf3;
        String quantityString;
        if (this.mBloodPressureReport == null) {
            refreshViewHeight(false);
            BloodPressureDataTitleView bloodPressureDataTitleView = this.dataTitleView;
            if (bloodPressureDataTitleView != null) {
                bloodPressureDataTitleView.showEmptyStr(getEmptyTitleStr());
            }
            View view = this.topGuideView;
            if (view != null) {
                ViewExtKt.setVisible(view, false);
                return;
            }
            return;
        }
        View view2 = this.topGuideView;
        if (view2 != null) {
            ViewExtKt.setVisible(view2, true);
        }
        DailyBloodPressureReport dailyBloodPressureReport = this.mBloodPressureReport;
        Intrinsics.checkNotNull(dailyBloodPressureReport);
        int minLow = dailyBloodPressureReport.getMinLow();
        DailyBloodPressureReport dailyBloodPressureReport2 = this.mBloodPressureReport;
        Intrinsics.checkNotNull(dailyBloodPressureReport2);
        int maxLow = dailyBloodPressureReport2.getMaxLow();
        if (minLow != maxLow) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            strValueOf = String.format("%d-%d", Arrays.copyOf(new Object[]{Integer.valueOf(minLow), Integer.valueOf(maxLow)}, 2));
            Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
        } else {
            strValueOf = String.valueOf(minLow);
        }
        DailyBloodPressureReport dailyBloodPressureReport3 = this.mBloodPressureReport;
        Intrinsics.checkNotNull(dailyBloodPressureReport3);
        int minHigh = dailyBloodPressureReport3.getMinHigh();
        DailyBloodPressureReport dailyBloodPressureReport4 = this.mBloodPressureReport;
        Intrinsics.checkNotNull(dailyBloodPressureReport4);
        int maxHigh = dailyBloodPressureReport4.getMaxHigh();
        if (minLow != maxLow) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            strValueOf2 = String.format("%d-%d", Arrays.copyOf(new Object[]{Integer.valueOf(minHigh), Integer.valueOf(maxHigh)}, 2));
            Intrinsics.checkNotNullExpressionValue(strValueOf2, "format(...)");
        } else {
            strValueOf2 = String.valueOf(minHigh);
        }
        DailyBloodPressureReport dailyBloodPressureReport5 = this.mBloodPressureReport;
        Intrinsics.checkNotNull(dailyBloodPressureReport5);
        boolean z = dailyBloodPressureReport5.getAvgPulse() > 0;
        refreshViewHeight(z);
        DailyBloodPressureReport dailyBloodPressureReport6 = this.mBloodPressureReport;
        Intrinsics.checkNotNull(dailyBloodPressureReport6);
        int minPulse = dailyBloodPressureReport6.getMinPulse();
        DailyBloodPressureReport dailyBloodPressureReport7 = this.mBloodPressureReport;
        Intrinsics.checkNotNull(dailyBloodPressureReport7);
        int maxPulse = dailyBloodPressureReport7.getMaxPulse();
        if (z && maxPulse != minPulse) {
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            strValueOf3 = String.format("%d-%d", Arrays.copyOf(new Object[]{Integer.valueOf(minPulse), Integer.valueOf(maxPulse)}, 2));
            Intrinsics.checkNotNullExpressionValue(strValueOf3, "format(...)");
            quantityString = getResources().getQuantityString(qxi.g, minPulse);
        } else if (z && maxPulse == minPulse) {
            strValueOf3 = String.valueOf(maxPulse);
            quantityString = getResources().getQuantityString(qxi.g, minPulse);
        } else {
            strValueOf3 = null;
            quantityString = null;
        }
        DailyBloodPressureReport dailyBloodPressureReport8 = this.mBloodPressureReport;
        Intrinsics.checkNotNull(dailyBloodPressureReport8);
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(dailyBloodPressureReport8.getTime());
        String weekDateStr = getFragmentPosition() == 1 ? HealthUtil.getWeekDateStr(localDateTimestampToLocalDate) : TimeDateUtil.getDateYYYYMMLocalFormat(localDateTimestampToLocalDate);
        BloodPressureDataTitleView bloodPressureDataTitleView2 = this.dataTitleView;
        if (bloodPressureDataTitleView2 != null) {
            StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
            String str = String.format("%s/%s", Arrays.copyOf(new Object[]{strValueOf2, strValueOf}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            bloodPressureDataTitleView2.showTitle(weekDateStr, str, strValueOf3, quantityString);
        }
    }

    private final void refreshDetailCard() {
        if (this.mBloodPressureReport == null) {
            RecyclerView recyclerView = this.mDetailRecyclerView;
            if (recyclerView != null) {
                ViewExtKt.setVisible(recyclerView, false);
                return;
            }
            return;
        }
        RecyclerView recyclerView2 = this.mDetailRecyclerView;
        if (recyclerView2 != null) {
            ViewExtKt.setVisible(recyclerView2, true);
        }
        Context contextRequireContext = requireContext();
        DailyBloodPressureReport dailyBloodPressureReport = this.mBloodPressureReport;
        Intrinsics.checkNotNull(dailyBloodPressureReport);
        List<qpo> listC = hz2.c(contextRequireContext, dailyBloodPressureReport);
        Intrinsics.checkNotNullExpressionValue(listC, "createSummaryViewModelList(...)");
        List<qpo> list = listC;
        if (ArrayUtils.isEmpty(list)) {
            RecyclerView recyclerView3 = this.mDetailRecyclerView;
            if (recyclerView3 != null) {
                ViewExtKt.setVisible(recyclerView3, false);
                return;
            }
            return;
        }
        List<qpo> list2 = this.mDataListDetail;
        Intrinsics.checkNotNull(list2);
        list2.clear();
        List<qpo> list3 = this.mDataListDetail;
        Intrinsics.checkNotNull(list3);
        list3.addAll(list);
        opo opoVar = this.mDetailAdapter;
        Intrinsics.checkNotNull(opoVar);
        DailyBloodPressureReport dailyBloodPressureReport2 = this.mBloodPressureReport;
        Intrinsics.checkNotNull(dailyBloodPressureReport2);
        opoVar.setHeaderViewTitle(qpo.a(dailyBloodPressureReport2.getTag()));
        opo opoVar2 = this.mDetailAdapter;
        Intrinsics.checkNotNull(opoVar2);
        opoVar2.notifyDataChanged();
    }

    private final void refreshDistributeCard() {
        DailyBloodPressureReport dailyBloodPressureReport = this.mBloodPressureReport;
        if (dailyBloodPressureReport != null) {
            Intrinsics.checkNotNull(dailyBloodPressureReport);
            if (!ArrayUtils.isEmpty(dailyBloodPressureReport.getSinglePressureRecords())) {
                FragmentActivity mActivity = getMActivity();
                DailyBloodPressureReport dailyBloodPressureReport2 = this.mBloodPressureReport;
                Intrinsics.checkNotNull(dailyBloodPressureReport2);
                List<BloodPressureItem> singlePressureRecords = dailyBloodPressureReport2.getSinglePressureRecords();
                Intrinsics.checkNotNull(singlePressureRecords);
                List<uz6> listA = hz2.a(mActivity, singlePressureRecords);
                if (listA == null || listA.size() <= 0) {
                    RecyclerView recyclerView = this.mDistributeRecyclerView;
                    Intrinsics.checkNotNull(recyclerView);
                    ViewExtKt.setVisible(recyclerView, false);
                    return;
                }
                RecyclerView recyclerView2 = this.mDistributeRecyclerView;
                Intrinsics.checkNotNull(recyclerView2);
                ViewExtKt.setVisible(recyclerView2, true);
                DistributeDataUtil.setPositionOfList(listA);
                List<uz6> list = this.mDistributeData;
                Intrinsics.checkNotNull(list);
                list.clear();
                List<uz6> list2 = this.mDistributeData;
                Intrinsics.checkNotNull(list2);
                list2.addAll(listA);
                sz6 sz6Var = this.mDistributeAdapter;
                Intrinsics.checkNotNull(sz6Var);
                sz6Var.notifyDataSetChanged();
                return;
            }
        }
        RecyclerView recyclerView3 = this.mDistributeRecyclerView;
        Intrinsics.checkNotNull(recyclerView3);
        ViewExtKt.setVisible(recyclerView3, false);
    }

    private final void refreshViewHeight(boolean hasPulse) {
        boolean zIsTablet = UIUtils.INSTANCE.isTablet();
        if (!hasPulse || zIsTablet) {
            BarChartRecyclerView barChartRecyclerView = this.mBarChartRecyclerView;
            if (barChartRecyclerView != null) {
                ViewExtKt.setHeight(barChartRecyclerView, ExtUtilsKt.getDp(313));
            }
            BarChartRecyclerView barChartRecyclerView2 = this.mBarChartRecyclerView;
            if (barChartRecyclerView2 != null) {
                barChartRecyclerView2.setPadding(ExtUtilKt.getDimension(ili.f21275b), ExtUtilsKt.getDp(71), ExtUtilKt.getDimension(ili.f21274a), 0);
            }
            BarChartRecyclerView barChartRecyclerView3 = this.mBarChartRecyclerView;
            if (barChartRecyclerView3 != null) {
                barChartRecyclerView3.requestLayout();
                return;
            }
            return;
        }
        BarChartRecyclerView barChartRecyclerView4 = this.mBarChartRecyclerView;
        if (barChartRecyclerView4 != null) {
            ViewExtKt.setHeight(barChartRecyclerView4, ExtUtilsKt.getDp(358));
        }
        BarChartRecyclerView barChartRecyclerView5 = this.mBarChartRecyclerView;
        if (barChartRecyclerView5 != null) {
            barChartRecyclerView5.setPadding(ExtUtilKt.getDimension(ili.f21275b), ExtUtilsKt.getDp(116), ExtUtilKt.getDimension(ili.f21274a), 0);
        }
        BarChartRecyclerView barChartRecyclerView6 = this.mBarChartRecyclerView;
        if (barChartRecyclerView6 != null) {
            barChartRecyclerView6.requestLayout();
        }
    }

    private final void refreshViewOnReportChanged() {
        DailyBloodPressureReport dailyBloodPressureReport = this.mBloodPressureReport;
        Logger.i("BloodPressureWm", "refresh BloodPressureReport .. " + (dailyBloodPressureReport != null ? dailyBloodPressureReport.toString() : null));
        refreshBarChart();
        refreshDetailCard();
        refreshDistributeCard();
    }

    private final void requestData() {
        this.mBloodPressureReport = null;
        LocalDate localDate = this.mCurrentLocalDate;
        Intrinsics.checkNotNull(localDate);
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDate);
        Logger.i("BloodPressureWm", "start request device data.." + this.mCurrentLocalDate + "/params start:" + jChangZeroOfTheDay);
        getMViewModel().triggerFetchFitnessReport(IBloodPressureRepository.class, getViewTag(), jChangZeroOfTheDay, 0, 0, "").observe(getViewLifecycleOwner(), new Observer() { // from class: xy2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodPressureBaseWeekMonthFragment.requestData$lambda$0(this.f39575a, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestData$lambda$0(BloodPressureBaseWeekMonthFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (ArrayUtils.isEmpty(list)) {
            this$0.mBloodPressureReport = null;
        } else {
            DailyBasicReport dailyBasicReport = (DailyBasicReport) list.get(0);
            if (dailyBasicReport instanceof DailyBloodPressureReport) {
                this$0.mBloodPressureReport = (DailyBloodPressureReport) dailyBasicReport;
            }
        }
        this$0.refreshViewOnReportChanged();
    }

    private final void updateRecyclerDetailLayoutManager() {
        RecyclerView recyclerView;
        if (getMActivity() == null || this.mDetailAdapter == null || (recyclerView = this.mDetailRecyclerView) == null) {
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
        if (getMActivity() == null || this.mDistributeAdapter == null || (recyclerView = this.mDistributeRecyclerView) == null) {
            return;
        }
        HealthUtil healthUtil = HealthUtil.INSTANCE;
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        sz6 sz6Var = this.mDistributeAdapter;
        Intrinsics.checkNotNull(sz6Var);
        recyclerView.setLayoutManager(healthUtil.buildCommonDataAdapterLayoutManager(mActivity, sz6Var));
    }

    @Nullable
    public final View getContainerView() {
        return this.containerView;
    }

    @Nullable
    public final BloodPressureDataTitleView getDataTitleView() {
        return this.dataTitleView;
    }

    public abstract int getFragmentPosition();

    @Nullable
    public final HealthBannerCardSetView getHealthBannerCardSetView() {
        return this.healthBannerCardSetView;
    }

    @Nullable
    public final BarChartRecyclerView getMBarChartRecyclerView() {
        return this.mBarChartRecyclerView;
    }

    @Nullable
    public final DailyBloodPressureReport getMBloodPressureReport() {
        return this.mBloodPressureReport;
    }

    @Nullable
    public final RecyclerView getMDetailRecyclerView() {
        return this.mDetailRecyclerView;
    }

    @Nullable
    public final RecyclerView getMDistributeRecyclerView() {
        return this.mDistributeRecyclerView;
    }

    @Nullable
    public final View getTopGuideView() {
        return this.topGuideView;
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
        updateRecyclerDistributeLayoutManager();
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
        initView();
        requestData();
    }

    public final void setContainerView(@Nullable View view) {
        this.containerView = view;
    }

    public final void setDataTitleView(@Nullable BloodPressureDataTitleView bloodPressureDataTitleView) {
        this.dataTitleView = bloodPressureDataTitleView;
    }

    public final void setHealthBannerCardSetView(@Nullable HealthBannerCardSetView healthBannerCardSetView) {
        this.healthBannerCardSetView = healthBannerCardSetView;
    }

    public final void setMBarChartRecyclerView(@Nullable BarChartRecyclerView barChartRecyclerView) {
        this.mBarChartRecyclerView = barChartRecyclerView;
    }

    public final void setMBloodPressureReport(@Nullable DailyBloodPressureReport dailyBloodPressureReport) {
        this.mBloodPressureReport = dailyBloodPressureReport;
    }

    public final void setMDetailRecyclerView(@Nullable RecyclerView recyclerView) {
        this.mDetailRecyclerView = recyclerView;
    }

    public final void setMDistributeRecyclerView(@Nullable RecyclerView recyclerView) {
        this.mDistributeRecyclerView = recyclerView;
    }

    public final void setTopGuideView(@Nullable View view) {
        this.topGuideView = view;
    }

    public final void setUnderstandCard(@Nullable View view) {
        this.understandCard = view;
    }
}
