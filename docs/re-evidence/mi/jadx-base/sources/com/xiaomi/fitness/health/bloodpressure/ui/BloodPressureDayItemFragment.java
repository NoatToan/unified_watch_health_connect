package com.xiaomi.fitness.health.bloodpressure.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.api.repository.IBloodPressureRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBloodPressureReport;
import com.xiaomi.fit.fitness.export.data.item.BloodPressureItem;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.BloodPressureEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableProductManager;
import com.xiaomi.fitness.device.manager.export.bean.WearableProduct;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.bloodpressure.BloodPressureViewModel;
import com.xiaomi.fitness.health.bloodpressure.ui.BloodPressureDayItemFragment;
import com.xiaomi.fitness.statistics.OneTrackReportAspect;
import com.xiaomi.fitness.statistics.export.annotation.OneTrackReport;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.util.PingAnHealthExtKt;
import com.xiaomi.fitness.util.ViewUtil;
import com.xiaomi.fitness.view.HealthBannerCardSetView;
import com.xiaomi.fitness.widget.distribute.DistributeDataUtil;
import defpackage.a52;
import defpackage.bl5;
import defpackage.br5;
import defpackage.c0j;
import defpackage.hak;
import defpackage.hz2;
import defpackage.ili;
import defpackage.jui;
import defpackage.nrd;
import defpackage.opo;
import defpackage.pni;
import defpackage.q02;
import defpackage.q3a;
import defpackage.qpo;
import defpackage.qxi;
import defpackage.r02;
import defpackage.s02;
import defpackage.s69;
import defpackage.sz6;
import defpackage.uz6;
import defpackage.vnq;
import defpackage.vqr;
import defpackage.xcm;
import defpackage.xqr;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
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
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 k2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001kB\u0007¢\u0006\u0004\bj\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0006J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0006J\u000f\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0006J\u000f\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u0006J!\u0010 \u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\"\u0010\u0006J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010.R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001e\u00108\u001a\n\u0012\u0004\u0012\u000207\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u001e\u0010H\u001a\n\u0012\u0004\u0012\u00020G\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001e\u0010K\u001a\n\u0012\u0004\u0012\u00020G\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010T\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u001e\u0010W\u001a\n\u0012\u0004\u0012\u00020V\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010IR\u0018\u0010X\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010OR\u0018\u0010Z\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u001e\u0010]\u001a\n\u0012\u0004\u0012\u00020\\\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010IR$\u0010^\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010.\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u0014\u0010f\u001a\u00020c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0014\u0010i\u001a\u00020=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010h¨\u0006l"}, d2 = {"Lcom/xiaomi/fitness/health/bloodpressure/ui/BloodPressureDayItemFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/bloodpressure/BloodPressureViewModel;", "Lq3a;", "", Constants.KEY_REQUEST_DATA, "()V", "refreshViewOnReportChanged", "refreshDataTitleView", "refreshDataTitleViewWhenEmpty", "refreshDistributeCard", "refreshDetailCard", "refreshBarChart", "", "hasPulse", "refreshViewHeight", "(Z)V", "initView", "initHealthBannerSet", "initUnderstandCard", "initDistributeCard", "initDetailCard", "updateRecyclerDistributeLayoutManager", "updateRecyclerDetailLayoutManager", "initBarChartRecyclerView", "initViewBinding", "initBundle", LifecycleConstantKt.ON_RESUME, "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onInvisible", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lorg/joda/time/LocalDate;", "mCurrentLocalDate", "Lorg/joda/time/LocalDate;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodPressureReport;", "mBloodPressureReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodPressureReport;", "containerView", "Landroid/view/View;", "topGuideView", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "mBarChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "Ls02;", "mItemDecoration", "Ls02;", "Lvnq;", "La52;", "mYAxis", "Lvnq;", "Lvqr;", "mXAxis", "Lvqr;", "", "mDisplayNumber", "I", "Lr02;", "mBarChartAttrs", "Lr02;", "Lcom/xiaomi/fitness/health/bloodpressure/ui/BloodPressureDataTitleView;", "dataTitleView", "Lcom/xiaomi/fitness/health/bloodpressure/ui/BloodPressureDataTitleView;", "", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "mBarChartEntries", "Ljava/util/List;", "Lq02;", "mBarChartAdapter", "Lq02;", "Landroidx/recyclerview/widget/RecyclerView;", "mDetailRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lopo;", "mDetailAdapter", "Lopo;", "Lcom/xiaomi/fitness/view/HealthBannerCardSetView;", "healthBannerCardSetView", "Lcom/xiaomi/fitness/view/HealthBannerCardSetView;", "Lqpo;", "mDataListDetail", "mDistributeRecyclerView", "Lsz6;", "mDistributeAdapter", "Lsz6;", "Luz6;", "mDistributeData", "understandCard", "getUnderstandCard", "()Landroid/view/View;", "setUnderstandCard", "(Landroid/view/View;)V", "", "getEmptyTitleStr", "()Ljava/lang/String;", "emptyTitleStr", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBloodPressureDayItemFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodPressureDayItemFragment.kt\ncom/xiaomi/fitness/health/bloodpressure/ui/BloodPressureDayItemFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,422:1\n163#2,2:423\n1#3:425\n*S KotlinDebug\n*F\n+ 1 BloodPressureDayItemFragment.kt\ncom/xiaomi/fitness/health/bloodpressure/ui/BloodPressureDayItemFragment\n*L\n257#1:423,2\n*E\n"})
public final class BloodPressureDayItemFragment extends Hilt_BloodPressureDayItemFragment<BloodPressureViewModel, q3a> {

    @NotNull
    public static final String TAG = "BloodPressureDay";
    private static /* synthetic */ Annotation ajc$anno$0;
    private static /* synthetic */ nrd.a ajc$tjp_0;

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

    static {
        ajc$preClinit();
        INSTANCE = new Companion(null);
    }

    private static /* synthetic */ void ajc$preClinit() {
        s69 s69Var = new s69("BloodPressureDayItemFragment.kt", BloodPressureDayItemFragment.class);
        ajc$tjp_0 = s69Var.h("method-execution", s69Var.g("4", "onInvisible", "com.xiaomi.fitness.health.bloodpressure.ui.BloodPressureDayItemFragment", "", "", "", "void"), 0);
    }

    private final String getEmptyTitleStr() {
        String string = getString(c0j.L6);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
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
        vqrVar.setValueFormatter(new xqr());
        this.mItemDecoration = new s02(this.mYAxis, this.mXAxis, this.mBarChartAttrs);
        br5 br5Var = new br5(getMActivity());
        s02 s02Var = this.mItemDecoration;
        Intrinsics.checkNotNull(s02Var);
        s02Var.setHighLightValueFormatter(br5Var);
        BarChartRecyclerView barChartRecyclerView2 = this.mBarChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView2);
        s02 s02Var2 = this.mItemDecoration;
        Intrinsics.checkNotNull(s02Var2);
        barChartRecyclerView2.addItemDecoration(s02Var2);
        this.mBarChartAdapter = new q02<>(getMActivity(), this.mBarChartEntries, this.mBarChartRecyclerView, this.mXAxis, this.mBarChartAttrs, br5Var);
        BarChartRecyclerView barChartRecyclerView3 = this.mBarChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView3);
        barChartRecyclerView3.setAdapter(this.mBarChartAdapter);
        BarChartRecyclerView barChartRecyclerView4 = this.mBarChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView4);
        barChartRecyclerView4.setLayoutManager(speedRatioLayoutManager);
        BarChartRecyclerView barChartRecyclerView5 = this.mBarChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView5);
        barChartRecyclerView5.setNestedScrollingEnabled(false);
        hak hakVar = new hak(getActivity(), this.mBarChartRecyclerView, new xcm() { // from class: com.xiaomi.fitness.health.bloodpressure.ui.BloodPressureDayItemFragment$initBarChartRecyclerView$itemGestureListener$1
            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                if (barEntry == null || !barEntry.isSelected()) {
                    BloodPressureDataTitleView bloodPressureDataTitleView = this.this$0.dataTitleView;
                    if (bloodPressureDataTitleView != null) {
                        bloodPressureDataTitleView.setVisibility(0);
                        return;
                    }
                    return;
                }
                BloodPressureDataTitleView bloodPressureDataTitleView2 = this.this$0.dataTitleView;
                if (bloodPressureDataTitleView2 != null) {
                    bloodPressureDataTitleView2.setVisibility(4);
                }
            }
        });
        BarChartRecyclerView barChartRecyclerView6 = this.mBarChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView6);
        barChartRecyclerView6.addOnItemTouchListener(hakVar);
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
        bl5 bl5Var = new bl5(false);
        RecyclerView recyclerView = this.mDetailRecyclerView;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.addItemDecoration(bl5Var);
        this.mDetailAdapter = new opo(getMActivity(), this.mDataListDetail, c0j.I6, pni.H1);
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
    private final void initHealthBannerSet() {
        WearableProduct wearableProduct = (WearableProduct) DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).findProduct(new Function1() { // from class: jz2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(BloodPressureDayItemFragment.initHealthBannerSet$lambda$1((WearableProduct) obj));
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
    public static final boolean initHealthBannerSet$lambda$1(WearableProduct it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StringsKt__StringsKt.contains$default((CharSequence) it.getModel(), (CharSequence) AboutBloodPressureFragment.N60E_MODEL, false, 2, (Object) null);
    }

    private final void initUnderstandCard() {
        View view = this.understandCard;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: iz2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BloodPressureDayItemFragment.initUnderstandCard$lambda$2(this.f22239a, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initUnderstandCard$lambda$2(BloodPressureDayItemFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseFragmentExKt.gotoPage(this$0, UnderstandBloodPressureFragment.class, null);
    }

    private final void initView() {
        initBarChartRecyclerView();
        initDetailCard();
        initDistributeCard();
        initUnderstandCard();
        initHealthBannerSet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initViewBinding() {
        this.containerView = ((q3a) getMBinding()).A;
        this.mBarChartRecyclerView = ((q3a) getMBinding()).D;
        this.dataTitleView = ((q3a) getMBinding()).B;
        this.mDetailRecyclerView = ((q3a) getMBinding()).E;
        this.mDistributeRecyclerView = ((q3a) getMBinding()).F;
        this.understandCard = ((q3a) getMBinding()).H;
        this.topGuideView = ((q3a) getMBinding()).G;
        this.healthBannerCardSetView = ((q3a) getMBinding()).C;
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
            dailyBloodPressureReport = new DailyBloodPressureReport(TimeDateUtil.changZeroOfTheDay(localDate), "days");
        }
        List<BloodPressureEntry> listG = hz2.g(this.mBarChartAttrs, dailyBloodPressureReport);
        Intrinsics.checkNotNullExpressionValue(listG, "getDaySegmentBarEntryList(...)");
        List<RecyclerBarEntry> list2 = this.mBarChartEntries;
        if (list2 != null) {
            list2.clear();
        }
        List<RecyclerBarEntry> list3 = this.mBarChartEntries;
        if (list3 != null) {
            list3.addAll(listG);
        }
        float theMaxNumber = HealthUtil.getTheMaxNumber(listG);
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
    }

    private final void refreshDataTitleView() {
        String str;
        String strValueOf;
        String quantityString;
        Integer pulse;
        Integer pulse2;
        DailyBloodPressureReport dailyBloodPressureReport = this.mBloodPressureReport;
        if (dailyBloodPressureReport == null) {
            refreshDataTitleViewWhenEmpty();
            return;
        }
        Intrinsics.checkNotNull(dailyBloodPressureReport);
        BloodPressureItem latestRecord = dailyBloodPressureReport.getLatestRecord();
        if (latestRecord == null) {
            refreshDataTitleViewWhenEmpty();
            return;
        }
        View view = this.topGuideView;
        if (view != null) {
            ViewExtKt.setVisible(view, true);
        }
        DailyBloodPressureReport dailyBloodPressureReport2 = this.mBloodPressureReport;
        Intrinsics.checkNotNull(dailyBloodPressureReport2);
        boolean z = dailyBloodPressureReport2.getAvgPulse() > 0;
        refreshViewHeight(z);
        int highPressure = latestRecord.getHighPressure();
        int lowPressure = latestRecord.getLowPressure();
        long time = latestRecord.getTime();
        LocalDate localDate = this.mCurrentLocalDate;
        Intrinsics.checkNotNull(localDate);
        if (TimeDateUtil.isToday(localDate)) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format("%s %s", Arrays.copyOf(new Object[]{getString(c0j.v5), TimeDateUtil.getDateStr(time, TimeUtils.FORMAT_H_M)}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        } else {
            str = TimeDateUtil.getDateYYYYMMddLocalFormat(((long) 1000) * time) + " " + TimeDateUtil.getDateStr(time, TimeUtils.FORMAT_H_M);
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str2 = String.format("%d/%d", Arrays.copyOf(new Object[]{Integer.valueOf(highPressure), Integer.valueOf(lowPressure)}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        if (z && (pulse2 = latestRecord.getPulse()) != null && pulse2.intValue() > 0) {
            Integer pulse3 = latestRecord.getPulse();
            Intrinsics.checkNotNull(pulse3);
            strValueOf = String.valueOf(pulse3.intValue());
            Resources resources = getResources();
            int i = qxi.g;
            Integer pulse4 = latestRecord.getPulse();
            Intrinsics.checkNotNull(pulse4);
            quantityString = resources.getQuantityString(i, pulse4.intValue());
        } else if (z && ((pulse = latestRecord.getPulse()) == null || pulse.intValue() == 0)) {
            quantityString = getResources().getQuantityString(qxi.g, 0);
            strValueOf = "--";
        } else {
            strValueOf = null;
            quantityString = null;
        }
        BloodPressureDataTitleView bloodPressureDataTitleView = this.dataTitleView;
        if (bloodPressureDataTitleView != null) {
            bloodPressureDataTitleView.showTitle(str, str2, strValueOf, quantityString);
        }
    }

    private final void refreshDataTitleViewWhenEmpty() {
        refreshViewHeight(false);
        BloodPressureDataTitleView bloodPressureDataTitleView = this.dataTitleView;
        if (bloodPressureDataTitleView != null) {
            bloodPressureDataTitleView.showEmptyStr(getEmptyTitleStr());
        }
        View view = this.topGuideView;
        if (view != null) {
            ViewExtKt.setVisible(view, false);
        }
    }

    private final void refreshDetailCard() {
        List<BloodPressureItem> singlePressureRecords;
        DailyBloodPressureReport dailyBloodPressureReport = this.mBloodPressureReport;
        if (dailyBloodPressureReport == null || (singlePressureRecords = dailyBloodPressureReport.getSinglePressureRecords()) == null || singlePressureRecords.size() <= 1) {
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
        DailyBloodPressureReport dailyBloodPressureReport2 = this.mBloodPressureReport;
        Intrinsics.checkNotNull(dailyBloodPressureReport2);
        List<qpo> listC = hz2.c(contextRequireContext, dailyBloodPressureReport2);
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
        DailyBloodPressureReport dailyBloodPressureReport3 = this.mBloodPressureReport;
        Intrinsics.checkNotNull(dailyBloodPressureReport3);
        opoVar.setHeaderViewTitle(qpo.a(dailyBloodPressureReport3.getTag()));
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
                    recyclerView.setVisibility(8);
                    return;
                }
                DistributeDataUtil.setPositionOfList(listA);
                RecyclerView recyclerView2 = this.mDistributeRecyclerView;
                Intrinsics.checkNotNull(recyclerView2);
                recyclerView2.setVisibility(0);
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
        Logger.i("BloodPressureDay", "refresh BloodPressureReport .. " + (dailyBloodPressureReport != null ? dailyBloodPressureReport.toString() : null));
        refreshDataTitleView();
        refreshBarChart();
        refreshDetailCard();
        refreshDistributeCard();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestData() {
        this.mBloodPressureReport = null;
        LocalDate localDate = this.mCurrentLocalDate;
        Intrinsics.checkNotNull(localDate);
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDate);
        Logger.i("BloodPressureDay", "start request device data.." + this.mCurrentLocalDate + "/params start:" + jChangZeroOfTheDay);
        ((BloodPressureViewModel) getMViewModel()).triggerFetchFitnessReport(IBloodPressureRepository.class, "days", jChangZeroOfTheDay, 0, 0, "").observe(getViewLifecycleOwner(), new Observer() { // from class: kz2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodPressureDayItemFragment.requestData$lambda$0(this.f24433a, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestData$lambda$0(BloodPressureDayItemFragment this$0, List list) {
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

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.A;
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
        updateRecyclerDistributeLayoutManager();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    @OneTrackReport(args = {"name", "blood_pressure_detail_page", "page_fragment", "day", "title", "血压"}, tip = "56.4.5.1.21797")
    public void onInvisible() throws Throwable {
        OneTrackReportAspect oneTrackReportAspectAspectOf;
        Annotation annotation;
        nrd nrdVarB = s69.b(ajc$tjp_0, this, this);
        try {
            super.onInvisible();
            oneTrackReportAspectAspectOf = OneTrackReportAspect.aspectOf();
            Annotation annotation2 = ajc$anno$0;
            if (annotation2 == null) {
                Method declaredMethod = BloodPressureDayItemFragment.class.getDeclaredMethod("onInvisible", new Class[0]);
            }
        } finally {
            oneTrackReportAspectAspectOf = OneTrackReportAspect.aspectOf();
            annotation = ajc$anno$0;
            if (annotation == null) {
                annotation = BloodPressureDayItemFragment.class.getDeclaredMethod("onInvisible", new Class[0]).getAnnotation(OneTrackReport.class);
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

    public final void setUnderstandCard(@Nullable View view) {
        this.understandCard = view;
    }
}
