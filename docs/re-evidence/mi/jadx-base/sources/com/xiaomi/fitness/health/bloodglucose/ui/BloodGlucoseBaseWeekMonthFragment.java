package com.xiaomi.fitness.health.bloodglucose.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.api.repository.IBloodSugarRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBloodSugarReport;
import com.xiaomi.fit.fitness.export.data.aggregation.StatisticBloodSugar;
import com.xiaomi.fit.fitness.export.data.item.BloodSugarItem;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.baseui.extension.BaseFragmentExtKt;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.barchart.itemdecoration.BloodGlucoseLineChartItemDecoration;
import com.xiaomi.fitness.chart.entrys.BloodGlucoseEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.view.BloodSugarLineChartRecyclerView;
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
import com.xiaomi.fitness.health.bloodglucose.ui.BloodGlucoseBaseWeekMonthFragment;
import com.xiaomi.fitness.health.bloodglucose.util.BloodGlucoseDataUtil;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.util.PingAnHealthExtKt;
import com.xiaomi.fitness.view.DataTitleView;
import com.xiaomi.fitness.view.HealthBannerCardSetView;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.fitness.widget.distribute.DistributeDataUtil;
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
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u0007¢\u0006\u0004\b~\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\bJ\u000f\u0010\u0015\u001a\u00020\u0006H&¢\u0006\u0004\b\u0015\u0010\bJ\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\bJ!\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R$\u0010$\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010#\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010)\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u00100\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u00107\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001e\u0010?\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001e\u0010C\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010O\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR$\u0010R\u001a\u0004\u0018\u00010Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u0018\u0010Y\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u001e\u0010\\\u001a\n\u0012\u0004\u0012\u00020[\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010DR$\u0010]\u001a\u0004\u0018\u00010Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010S\u001a\u0004\b^\u0010U\"\u0004\b_\u0010WR\u0018\u0010a\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u001e\u0010d\u001a\n\u0012\u0004\u0012\u00020c\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010DR$\u0010e\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010*\u001a\u0004\bf\u0010,\"\u0004\bg\u0010.R$\u0010i\u001a\u0004\u0018\u00010h8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u0018\u0010p\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u001a\u0010t\u001a\b\u0012\u0004\u0012\u00020s0r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010DR\u001a\u0010u\u001a\b\u0012\u0004\u0012\u00020s0r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010DR\u0014\u0010y\u001a\u00020v8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0014\u0010}\u001a\u00020z8$X¤\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|¨\u0006\u007f"}, d2 = {"Lcom/xiaomi/fitness/health/bloodglucose/ui/BloodGlucoseBaseWeekMonthFragment;", "Lcom/xiaomi/fitness/health/bloodglucose/BloodGlucoseViewModel;", "VM", "Landroidx/databinding/ViewDataBinding;", "VDB", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "", "initPointLineColor", "()V", "initView", "initUnderstandView", "initLineChartRecyclerView", "refreshBarChart", "initDistributeCard", "refreshDistributeCard", "initDetailCard", "refreshDetailCard", Constants.KEY_REQUEST_DATA, "refreshViewOnReportChanged", "initBundle", "updateRecyclerLayoutManager", "initViewBinding", LifecycleConstantKt.ON_RESUME, "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lorg/joda/time/LocalDate;", "mCurrentLocalDate", "Lorg/joda/time/LocalDate;", "mCurrentDate", "getMCurrentDate", "()Lorg/joda/time/LocalDate;", "setMCurrentDate", "(Lorg/joda/time/LocalDate;)V", "containerView", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "setContainerView", "(Landroid/view/View;)V", "Lcom/xiaomi/fitness/chart/view/BloodSugarLineChartRecyclerView;", "lineChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/BloodSugarLineChartRecyclerView;", "getLineChartRecyclerView", "()Lcom/xiaomi/fitness/chart/view/BloodSugarLineChartRecyclerView;", "setLineChartRecyclerView", "(Lcom/xiaomi/fitness/chart/view/BloodSugarLineChartRecyclerView;)V", "Lcom/xiaomi/fitness/view/DataTitleView;", "dataTitleView", "Lcom/xiaomi/fitness/view/DataTitleView;", "getDataTitleView", "()Lcom/xiaomi/fitness/view/DataTitleView;", "setDataTitleView", "(Lcom/xiaomi/fitness/view/DataTitleView;)V", "Lux2;", "Lsf2;", "mLineChartAdapter", "Lux2;", "", "Lcom/xiaomi/fitness/chart/entrys/BloodGlucoseEntry;", "mChartEntries", "Ljava/util/List;", "Lcom/xiaomi/fitness/chart/barchart/itemdecoration/BloodGlucoseLineChartItemDecoration;", "mItemDecoration", "Lcom/xiaomi/fitness/chart/barchart/itemdecoration/BloodGlucoseLineChartItemDecoration;", "Lrtr;", "mYAxis", "Lrtr;", "Lvqr;", "mXAxis", "Lvqr;", "Lvfe;", "lineChartAttrs", "Lvfe;", "Landroidx/recyclerview/widget/RecyclerView;", "mDistributeRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getMDistributeRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setMDistributeRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lcx2;", "mDistributeAdapter", "Lcx2;", "Luz6;", "mDistributeData", "recyclerDetail", "getRecyclerDetail", "setRecyclerDetail", "Lopo;", "mDetailAdapter", "Lopo;", "Lqpo;", "mDataListDetail", "understandCard", "getUnderstandCard", "setUnderstandCard", "Lcom/xiaomi/fitness/view/HealthBannerCardSetView;", "healthBannerCardSetView", "Lcom/xiaomi/fitness/view/HealthBannerCardSetView;", "getHealthBannerCardSetView", "()Lcom/xiaomi/fitness/view/HealthBannerCardSetView;", "setHealthBannerCardSetView", "(Lcom/xiaomi/fitness/view/HealthBannerCardSetView;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodSugarReport;", "mBloodSugarReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodSugarReport;", "", "Landroid/graphics/drawable/Drawable;", "drawableList", "highLightDrawableList", "", "getViewTag", "()Ljava/lang/String;", CloudContract.COL_VIEW_TAG, "", "getFragmentPosition", "()I", "fragmentPosition", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class BloodGlucoseBaseWeekMonthFragment<VM extends BloodGlucoseViewModel, VDB extends ViewDataBinding> extends BaseBindingFragment<VM, VDB> {

    @Nullable
    private View containerView;

    @Nullable
    private DataTitleView dataTitleView;

    @Nullable
    private HealthBannerCardSetView healthBannerCardSetView;

    @Nullable
    private vfe lineChartAttrs;

    @Nullable
    private BloodSugarLineChartRecyclerView lineChartRecyclerView;

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
    private vqr mXAxis;

    @Nullable
    private rtr mYAxis;

    @Nullable
    private RecyclerView recyclerDetail;

    @Nullable
    private View understandCard;

    @NotNull
    private final List<Drawable> drawableList = CollectionsKt__CollectionsKt.listOf((Object[]) new Drawable[]{BaseFragmentExtKt.getDrawable(this, pni.g), BaseFragmentExtKt.getDrawable(this, pni.h), BaseFragmentExtKt.getDrawable(this, pni.e), BaseFragmentExtKt.getDrawable(this, pni.d), BaseFragmentExtKt.getDrawable(this, pni.f)});

    @NotNull
    private final List<Drawable> highLightDrawableList = CollectionsKt__CollectionsKt.listOf((Object[]) new Drawable[]{BaseFragmentExtKt.getDrawable(this, pni.g), BaseFragmentExtKt.getDrawable(this, pni.h), BaseFragmentExtKt.getDrawable(this, pni.e), BaseFragmentExtKt.getDrawable(this, pni.d), BaseFragmentExtKt.getDrawable(this, pni.f)});

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
        bl5 bl5Var = new bl5(false);
        RecyclerView recyclerView = this.mDistributeRecyclerView;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.addItemDecoration(bl5Var);
        this.mDistributeAdapter = new cx2(getMActivity(), this.mDistributeData, 10);
        RecyclerView recyclerView2 = this.mDistributeRecyclerView;
        Intrinsics.checkNotNull(recyclerView2);
        HealthUtil healthUtil = HealthUtil.INSTANCE;
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        cx2 cx2Var = this.mDistributeAdapter;
        Intrinsics.checkNotNull(cx2Var);
        recyclerView2.setLayoutManager(healthUtil.buildCommonDataAdapterLayoutManager(mActivity, cx2Var));
        cx2 cx2Var2 = this.mDistributeAdapter;
        Intrinsics.checkNotNull(cx2Var2);
        cx2Var2.m(getString(c0j.q1, "3.9", "10.0"));
        cx2 cx2Var3 = this.mDistributeAdapter;
        Intrinsics.checkNotNull(cx2Var3);
        cx2Var3.setDistributeGuidIconClickListener(new cx2.c() { // from class: ww2
            @Override // cx2.c
            public final void onClick(int i) {
                BloodGlucoseBaseWeekMonthFragment.initDistributeCard$lambda$1(this.f38416a, i);
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
    public static final void initDistributeCard$lambda$1(BloodGlucoseBaseWeekMonthFragment this$0, int i) {
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
        vqrVar.setValueFormatter(getFragmentPosition() == 1 ? new jrr() : new brr(requireContext()));
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
        s13 s13Var = new s13(getActivity(), this.lineChartRecyclerView, new xcm(this) { // from class: com.xiaomi.fitness.health.bloodglucose.ui.BloodGlucoseBaseWeekMonthFragment$initLineChartRecyclerView$itemGestureListener$1
            final /* synthetic */ BloodGlucoseBaseWeekMonthFragment<VM, VDB> this$0;

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
        BloodSugarLineChartRecyclerView bloodSugarLineChartRecyclerView6 = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(bloodSugarLineChartRecyclerView6);
        bloodSugarLineChartRecyclerView6.addOnItemTouchListener(s13Var);
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

    private final void initUnderstandView() {
        View view = this.understandCard;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: xw2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BloodGlucoseBaseWeekMonthFragment.initUnderstandView$lambda$0(this.f39524a, view2);
                }
            });
        }
        HealthBannerCardSetView healthBannerCardSetView = this.healthBannerCardSetView;
        if (healthBannerCardSetView != null) {
            PingAnHealthExtKt.bindOneBanner(healthBannerCardSetView, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initUnderstandView$lambda$0(BloodGlucoseBaseWeekMonthFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WebViewUtilKt.startWebView$default(HealthUtil.INSTANCE.getUnderstandBloodSugarUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null)), this$0.getString(c0j.o1), false, false, null, false, null, false, 252, null);
    }

    private final void initView() {
        getMViewModel().getBloodSugarRemindSettingFromLocal();
        initLineChartRecyclerView();
        initDetailCard();
        initDistributeCard();
        initUnderstandView();
    }

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
            dailyBloodSugarReport = new DailyBloodSugarReport(TimeDateUtil.changZeroOfTheDay(localDate), getViewTag());
        }
        BloodGlucoseDataUtil bloodGlucoseDataUtil = BloodGlucoseDataUtil.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        vfe vfeVar = this.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar);
        List listCreateWeekMonthEntries$default = BloodGlucoseDataUtil.createWeekMonthEntries$default(bloodGlucoseDataUtil, contextRequireContext, vfeVar, dailyBloodSugarReport, Intrinsics.areEqual(getViewTag(), "weeks"), 0, 16, null);
        List<BloodGlucoseEntry> list = this.mChartEntries;
        if (list != null) {
            list.clear();
        }
        List<BloodGlucoseEntry> list2 = this.mChartEntries;
        if (list2 != null) {
            list2.addAll(listCreateWeekMonthEntries$default);
        }
        float theMaxNumber = HealthUtil.getTheMaxNumber(listCreateWeekMonthEntries$default);
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
            DailyBloodSugarReport dailyBloodSugarReport9 = this.mBloodSugarReport;
            if (dailyBloodSugarReport9 != null && (latestItem = dailyBloodSugarReport9.getLatestItem()) != null) {
                trend = latestItem.getTrend();
            }
            if (trend > 0 && (dataTitleView = this.dataTitleView) != null) {
                dataTitleView.e(this.drawableList.get(trend - 1));
            }
            DataTitleView dataTitleView3 = this.dataTitleView;
            if (dataTitleView3 != null) {
                dataTitleView3.a(requireContext(), quantityString, string, dateHHmmFormat);
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
        if (listCreateDistributeData == null || listCreateDistributeData.size() <= 0) {
            RecyclerView recyclerView2 = this.mDistributeRecyclerView;
            Intrinsics.checkNotNull(recyclerView2);
            recyclerView2.setVisibility(8);
            return;
        }
        DistributeDataUtil.setPositionOfList(listCreateDistributeData);
        RecyclerView recyclerView3 = this.mDistributeRecyclerView;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setVisibility(0);
        List<uz6> list = this.mDistributeData;
        Intrinsics.checkNotNull(list);
        list.clear();
        List<uz6> list2 = this.mDistributeData;
        Intrinsics.checkNotNull(list2);
        list2.addAll(listCreateDistributeData);
        cx2 cx2Var = this.mDistributeAdapter;
        Intrinsics.checkNotNull(cx2Var);
        cx2Var.notifyDataSetChanged();
    }

    private final void refreshViewOnReportChanged() {
        DailyBloodSugarReport dailyBloodSugarReport = this.mBloodSugarReport;
        Logger.i("BloodPressureWm", "refresh BloodPressureReport .. " + (dailyBloodSugarReport != null ? dailyBloodSugarReport.toString() : null));
        refreshBarChart();
        refreshDetailCard();
        refreshDistributeCard();
    }

    private final void requestData() {
        this.mBloodSugarReport = null;
        LocalDate localDate = this.mCurrentLocalDate;
        Intrinsics.checkNotNull(localDate);
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDate);
        Logger.i(BaseFragment.TAG, "start request device data.." + this.mCurrentLocalDate + "/params start:" + jChangZeroOfTheDay);
        getMViewModel().triggerFetchFitnessReport(IBloodSugarRepository.class, getViewTag(), jChangZeroOfTheDay, 0, 0, "").observe(getViewLifecycleOwner(), new Observer() { // from class: vw2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodGlucoseBaseWeekMonthFragment.requestData$lambda$2(this.f37285a, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestData$lambda$2(BloodGlucoseBaseWeekMonthFragment this$0, List list) {
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
    public final BloodSugarLineChartRecyclerView getLineChartRecyclerView() {
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
    public final RecyclerView getRecyclerDetail() {
        return this.recyclerDetail;
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

    public final void setLineChartRecyclerView(@Nullable BloodSugarLineChartRecyclerView bloodSugarLineChartRecyclerView) {
        this.lineChartRecyclerView = bloodSugarLineChartRecyclerView;
    }

    public final void setMCurrentDate(@Nullable LocalDate localDate) {
        this.mCurrentDate = localDate;
    }

    public final void setMDistributeRecyclerView(@Nullable RecyclerView recyclerView) {
        this.mDistributeRecyclerView = recyclerView;
    }

    public final void setRecyclerDetail(@Nullable RecyclerView recyclerView) {
        this.recyclerDetail = recyclerView;
    }

    public final void setUnderstandCard(@Nullable View view) {
        this.understandCard = view;
    }
}
