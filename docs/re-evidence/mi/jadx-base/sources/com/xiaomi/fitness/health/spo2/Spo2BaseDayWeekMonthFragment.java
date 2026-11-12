package com.xiaomi.fitness.health.spo2;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.api.repository.ISpo2Repository;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailySpo2Report;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fit.fitness.export.data.item.Spo2Item;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.chart.barchart.SpO2BarChartAdapter;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.common.AbnormalDataUtil;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.recycer.BarChartRecyclerHelper;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.spo2.Spo2BaseDayWeekMonthFragment;
import com.xiaomi.fitness.health.spo2.Spo2ViewModel;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.util.PingAnHealthExtKt;
import com.xiaomi.fitness.util.SpO2DataUtil;
import com.xiaomi.fitness.view.DataTitleView;
import com.xiaomi.fitness.view.HealthBannerCardSetView;
import defpackage.bl5;
import defpackage.c0j;
import defpackage.cx;
import defpackage.er5;
import defpackage.hak;
import defpackage.onq;
import defpackage.opo;
import defpackage.pni;
import defpackage.qpo;
import defpackage.qxi;
import defpackage.r02;
import defpackage.rtr;
import defpackage.s02;
import defpackage.sf2;
import defpackage.vnq;
import defpackage.vqr;
import defpackage.xcm;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b&\u0018\u0000 {*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\u0001{B\u0007¢\u0006\u0004\bz\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\bJ!\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0006H&¢\u0006\u0004\b\u001b\u0010\bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR$\u0010\u001f\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010&\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010-\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001e\u0010;\u001a\n\u0012\u0004\u0012\u00020:\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010G\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u001e\u0010K\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR$\u0010N\u001a\u0004\u0018\u00010M8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010U\u001a\u0004\u0018\u00010T8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0018\u0010\\\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u001e\u0010_\u001a\n\u0012\u0004\u0012\u00020^\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010LR$\u0010`\u001a\u0004\u0018\u00010T8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010V\u001a\u0004\ba\u0010X\"\u0004\bb\u0010ZR\u0018\u0010c\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010]R\u001e\u0010d\u001a\n\u0012\u0004\u0012\u00020^\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010LR\u001e\u0010e\u001a\n\u0012\u0004\u0012\u00020^\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010LR$\u0010f\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010 \u001a\u0004\bg\u0010\"\"\u0004\bh\u0010$R$\u0010j\u001a\u0004\u0018\u00010i8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\u0016\u0010q\u001a\u00020p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010v\u001a\u00020s8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0014\u0010y\u001a\u00020F8$X¤\u0004¢\u0006\u0006\u001a\u0004\bw\u0010x¨\u0006|"}, d2 = {"Lcom/xiaomi/fitness/health/spo2/Spo2BaseDayWeekMonthFragment;", "Lcom/xiaomi/fitness/health/spo2/Spo2ViewModel;", "VM", "Landroidx/databinding/ViewDataBinding;", "VDB", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "", Constants.KEY_REQUEST_DATA, "()V", "initView", "initAbnormalLowSpo2Card", "setLowSpo2Fold", "initDetailCard", "initBarChart", "refreshView", "refreshBarChart", "refreshDataTitleView", "refreshDetailCard", "refreshAbnormalLowSpo2Card", "initBundle", LifecycleConstantKt.ON_RESUME, "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "initViewBinding", "Lorg/joda/time/LocalDate;", "mCurrentLocalDate", "Lorg/joda/time/LocalDate;", "containerView", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "setContainerView", "(Landroid/view/View;)V", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "chartRecyclerView", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "getChartRecyclerView", "()Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "setChartRecyclerView", "(Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;)V", "Lcom/xiaomi/fitness/view/DataTitleView;", "dataTitleView", "Lcom/xiaomi/fitness/view/DataTitleView;", "getDataTitleView", "()Lcom/xiaomi/fitness/view/DataTitleView;", "setDataTitleView", "(Lcom/xiaomi/fitness/view/DataTitleView;)V", "Lr02;", "mBarChartAttrs", "Lr02;", "Ls02;", "mItemDecoration", "Ls02;", "Lcom/xiaomi/fitness/chart/barchart/SpO2BarChartAdapter;", "Lsf2;", "mBarChartAdapter", "Lcom/xiaomi/fitness/chart/barchart/SpO2BarChartAdapter;", "Lrtr;", "mYAxis", "Lrtr;", "Lvqr;", "mXAxis", "Lvqr;", "Lonq;", "valueFormatter", "Lonq;", "", "displayNumber", "I", "", "Lcom/xiaomi/fitness/chart/entrys/SegmentBarEntry;", "mEntries", "Ljava/util/List;", "Lcom/xiaomi/fitness/view/HealthBannerCardSetView;", "healthBannerCardSetView", "Lcom/xiaomi/fitness/view/HealthBannerCardSetView;", "getHealthBannerCardSetView", "()Lcom/xiaomi/fitness/view/HealthBannerCardSetView;", "setHealthBannerCardSetView", "(Lcom/xiaomi/fitness/view/HealthBannerCardSetView;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerDetail", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerDetail", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerDetail", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lopo;", "mDetailAdapter", "Lopo;", "Lqpo;", "mDataListDetail", "lowSpo2Recycler", "getLowSpo2Recycler", "setLowSpo2Recycler", "mLowSpo2Adapter", "mLowSpo2DataAdapterList", "mLowSpo2DataSrcList", "understandCard", "getUnderstandCard", "setUnderstandCard", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailySpo2Report;", "spo2Report", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailySpo2Report;", "getSpo2Report", "()Lcom/xiaomi/fit/fitness/export/data/aggregation/DailySpo2Report;", "setSpo2Report", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailySpo2Report;)V", "", "autoFoldLowSpo2Recycler", "Z", "", "getEmptyTitleStr", "()Ljava/lang/String;", "emptyTitleStr", "getFragmentPosition", "()I", "fragmentPosition", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class Spo2BaseDayWeekMonthFragment<VM extends Spo2ViewModel, VDB extends ViewDataBinding> extends BaseBindingFragment<VM, VDB> {

    @NotNull
    public static final String TAG = "MiHealth:spo2";
    private boolean autoFoldLowSpo2Recycler = true;

    @Nullable
    private BarChartRecyclerView chartRecyclerView;

    @Nullable
    private View containerView;

    @Nullable
    private DataTitleView dataTitleView;
    private int displayNumber;

    @Nullable
    private HealthBannerCardSetView healthBannerCardSetView;

    @Nullable
    private RecyclerView lowSpo2Recycler;

    @Nullable
    private SpO2BarChartAdapter<sf2> mBarChartAdapter;

    @Nullable
    private r02 mBarChartAttrs;

    @Nullable
    private LocalDate mCurrentLocalDate;

    @Nullable
    private List<qpo> mDataListDetail;

    @Nullable
    private opo mDetailAdapter;

    @Nullable
    private List<SegmentBarEntry> mEntries;

    @Nullable
    private s02 mItemDecoration;

    @Nullable
    private opo mLowSpo2Adapter;

    @Nullable
    private List<qpo> mLowSpo2DataAdapterList;

    @Nullable
    private List<qpo> mLowSpo2DataSrcList;

    @Nullable
    private vqr mXAxis;

    @Nullable
    private rtr mYAxis;

    @Nullable
    private RecyclerView recyclerDetail;

    @Nullable
    private DailySpo2Report spo2Report;

    @Nullable
    private View understandCard;

    @Nullable
    private onq valueFormatter;

    private final String getEmptyTitleStr() {
        String string = getString(c0j.L6);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    private final void initAbnormalLowSpo2Card() {
        if (getFragmentPosition() != 0) {
            return;
        }
        this.mLowSpo2DataAdapterList = new ArrayList();
        this.mLowSpo2DataSrcList = new ArrayList();
        bl5 bl5Var = new bl5();
        RecyclerView recyclerView = this.lowSpo2Recycler;
        if (recyclerView != null) {
            recyclerView.addItemDecoration(bl5Var);
        }
        this.mLowSpo2Adapter = new opo(getMActivity(), this.mLowSpo2DataAdapterList, c0j.Vk, pni.q0);
        RecyclerView recyclerView2 = this.lowSpo2Recycler;
        if (recyclerView2 != null) {
            HealthUtil healthUtil = HealthUtil.INSTANCE;
            FragmentActivity mActivity = getMActivity();
            Intrinsics.checkNotNull(mActivity);
            opo opoVar = this.mLowSpo2Adapter;
            Intrinsics.checkNotNull(opoVar);
            recyclerView2.setLayoutManager(healthUtil.buildCommonDataAdapterLayoutManager(mActivity, opoVar));
        }
        opo opoVar2 = this.mLowSpo2Adapter;
        Intrinsics.checkNotNull(opoVar2);
        opoVar2.setOnItemClickListener(new opo.e(this) { // from class: com.xiaomi.fitness.health.spo2.Spo2BaseDayWeekMonthFragment.initAbnormalLowSpo2Card.1
            final /* synthetic */ Spo2BaseDayWeekMonthFragment<VM, VDB> this$0;

            {
                this.this$0 = this;
            }

            @Override // opo.e
            public void onBottomClick(boolean fold) {
                if (fold) {
                    List list = ((Spo2BaseDayWeekMonthFragment) this.this$0).mLowSpo2DataAdapterList;
                    if (list != null) {
                        list.clear();
                    }
                    List list2 = ((Spo2BaseDayWeekMonthFragment) this.this$0).mLowSpo2DataAdapterList;
                    if (list2 != null) {
                        List list3 = ((Spo2BaseDayWeekMonthFragment) this.this$0).mLowSpo2DataSrcList;
                        Intrinsics.checkNotNull(list3);
                        list2.addAll(list3);
                    }
                    opo opoVar3 = ((Spo2BaseDayWeekMonthFragment) this.this$0).mLowSpo2Adapter;
                    Intrinsics.checkNotNull(opoVar3);
                    opoVar3.p(c0j.E4, false);
                } else {
                    this.this$0.setLowSpo2Fold();
                }
                opo opoVar4 = ((Spo2BaseDayWeekMonthFragment) this.this$0).mLowSpo2Adapter;
                Intrinsics.checkNotNull(opoVar4);
                opoVar4.notifyDataChanged();
            }

            @Override // opo.e
            public void onClick(qpo model, int position) {
                if (model instanceof cx) {
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("abnormal_item", ((cx) model).b());
                    BaseFragmentExKt.gotoPage(this.this$0, Spo2AbnormalChartFragment.class, bundle);
                }
            }

            @Override // opo.e
            public /* bridge */ /* synthetic */ void onHeaderClick() {
                super.onHeaderClick();
            }
        });
        RecyclerView recyclerView3 = this.lowSpo2Recycler;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.mLowSpo2Adapter);
        }
        RecyclerView recyclerView4 = this.lowSpo2Recycler;
        if (recyclerView4 != null) {
            recyclerView4.setHasFixedSize(true);
        }
    }

    private final void initBarChart() {
        BarChartRecyclerView barChartRecyclerView = this.chartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView);
        r02 r02Var = (r02) barChartRecyclerView.mAttrs;
        this.mBarChartAttrs = r02Var;
        Intrinsics.checkNotNull(r02Var);
        this.displayNumber = r02Var.c;
        BarChartRecyclerHelper barChartRecyclerHelper = BarChartRecyclerHelper.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        this.valueFormatter = barChartRecyclerHelper.createXAxisFormatter(contextRequireContext, getFragmentPosition());
        this.mEntries = new ArrayList();
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(getActivity(), this.mBarChartAttrs);
        this.mYAxis = new vnq(this.mBarChartAttrs);
        vqr vqrVar = new vqr(this.mBarChartAttrs, this.displayNumber, this.valueFormatter);
        this.mXAxis = vqrVar;
        Intrinsics.checkNotNull(vqrVar);
        vqrVar.setValueFormatter(this.valueFormatter);
        this.mItemDecoration = new s02(this.mYAxis, this.mXAxis, this.mBarChartAttrs);
        er5 er5Var = new er5(0, getFragmentPosition() == 0);
        s02 s02Var = this.mItemDecoration;
        Intrinsics.checkNotNull(s02Var);
        s02Var.setHighLightValueFormatter(er5Var);
        BarChartRecyclerView barChartRecyclerView2 = this.chartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView2);
        s02 s02Var2 = this.mItemDecoration;
        Intrinsics.checkNotNull(s02Var2);
        barChartRecyclerView2.addItemDecoration(s02Var2);
        FragmentActivity activity = getActivity();
        List<SegmentBarEntry> list = this.mEntries;
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type java.util.ArrayList<com.xiaomi.fitness.chart.entrys.SegmentBarEntry>");
        this.mBarChartAdapter = new SpO2BarChartAdapter<>(activity, (ArrayList) list, this.chartRecyclerView, this.mXAxis, this.mBarChartAttrs, er5Var);
        BarChartRecyclerView barChartRecyclerView3 = this.chartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView3);
        barChartRecyclerView3.setAdapter(this.mBarChartAdapter);
        BarChartRecyclerView barChartRecyclerView4 = this.chartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView4);
        barChartRecyclerView4.setLayoutManager(speedRatioLayoutManager);
        BarChartRecyclerView barChartRecyclerView5 = this.chartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView5);
        barChartRecyclerView5.setNestedScrollingEnabled(false);
        hak hakVar = new hak(getActivity(), this.chartRecyclerView, new xcm(this) { // from class: com.xiaomi.fitness.health.spo2.Spo2BaseDayWeekMonthFragment$initBarChart$itemGestureListener$1
            final /* synthetic */ Spo2BaseDayWeekMonthFragment<VM, VDB> this$0;

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
        BarChartRecyclerView barChartRecyclerView6 = this.chartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView6);
        barChartRecyclerView6.addOnItemTouchListener(hakVar);
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
        RecyclerView recyclerView = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.addItemDecoration(bl5Var);
        this.mDetailAdapter = new opo(getMActivity(), this.mDataListDetail, c0j.I6, pni.B3);
        RecyclerView recyclerView2 = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView2);
        HealthUtil healthUtil = HealthUtil.INSTANCE;
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        opo opoVar = this.mDetailAdapter;
        Intrinsics.checkNotNull(opoVar);
        recyclerView2.setLayoutManager(healthUtil.buildCommonDataAdapterLayoutManager(mActivity, opoVar));
        RecyclerView recyclerView3 = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setAdapter(this.mDetailAdapter);
        RecyclerView recyclerView4 = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView4);
        recyclerView4.setHasFixedSize(true);
    }

    private final void initView() {
        initBarChart();
        initDetailCard();
        initAbnormalLowSpo2Card();
        View view = this.understandCard;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: n7n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Spo2BaseDayWeekMonthFragment.initView$lambda$1(this.f27626a, view2);
                }
            });
        }
        HealthBannerCardSetView healthBannerCardSetView = this.healthBannerCardSetView;
        if (healthBannerCardSetView != null) {
            PingAnHealthExtKt.bindOneBanner(healthBannerCardSetView, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(Spo2BaseDayWeekMonthFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseFragmentExKt.gotoPage(this$0, Spo2UnderstandFragment.class, null);
    }

    private final void refreshAbnormalLowSpo2Card() {
        DailySpo2Report dailySpo2Report;
        if (getFragmentPosition() == 0 && (dailySpo2Report = this.spo2Report) != null) {
            Intrinsics.checkNotNull(dailySpo2Report);
            if (!ArrayUtils.isEmpty(dailySpo2Report.getAbnormalSpo2Records())) {
                AbnormalDataUtil abnormalDataUtil = AbnormalDataUtil.INSTANCE;
                DailySpo2Report dailySpo2Report2 = this.spo2Report;
                Intrinsics.checkNotNull(dailySpo2Report2);
                List<SegmentItem> abnormalSpo2Records = dailySpo2Report2.getAbnormalSpo2Records();
                Intrinsics.checkNotNull(abnormalSpo2Records);
                List<cx> listCreateAbnormalSummaryViewModel = abnormalDataUtil.createAbnormalSummaryViewModel(abnormalSpo2Records, "%", true);
                int size = listCreateAbnormalSummaryViewModel.size();
                if (size == 0) {
                    RecyclerView recyclerView = this.lowSpo2Recycler;
                    if (recyclerView != null) {
                        ViewExtKt.setVisible(recyclerView, false);
                        return;
                    }
                    return;
                }
                RecyclerView recyclerView2 = this.lowSpo2Recycler;
                if (recyclerView2 != null) {
                    ViewExtKt.setVisible(recyclerView2, true);
                }
                List<qpo> list = this.mLowSpo2DataSrcList;
                if (list != null) {
                    list.clear();
                }
                List<qpo> list2 = this.mLowSpo2DataSrcList;
                if (list2 != null) {
                    list2.addAll(listCreateAbnormalSummaryViewModel);
                }
                Logger.d("MiHealth:spo2", "refresh low spo2 data!!");
                if (size < 10) {
                    List<qpo> list3 = this.mLowSpo2DataAdapterList;
                    if (list3 != null) {
                        list3.clear();
                    }
                    List<qpo> list4 = this.mLowSpo2DataAdapterList;
                    if (list4 != null) {
                        List<qpo> list5 = this.mLowSpo2DataSrcList;
                        Intrinsics.checkNotNull(list5);
                        list4.addAll(list5);
                    }
                    opo opoVar = this.mLowSpo2Adapter;
                    if (opoVar != null) {
                        opoVar.hideFooterFold();
                    }
                } else if (this.autoFoldLowSpo2Recycler) {
                    setLowSpo2Fold();
                    this.autoFoldLowSpo2Recycler = false;
                } else {
                    opo opoVar2 = this.mLowSpo2Adapter;
                    if (opoVar2 == null || !opoVar2.k()) {
                        List<qpo> list6 = this.mLowSpo2DataAdapterList;
                        if (list6 != null) {
                            list6.clear();
                        }
                        List<qpo> list7 = this.mLowSpo2DataAdapterList;
                        if (list7 != null) {
                            List<qpo> list8 = this.mLowSpo2DataSrcList;
                            Intrinsics.checkNotNull(list8);
                            list7.addAll(list8);
                        }
                        opo opoVar3 = this.mLowSpo2Adapter;
                        if (opoVar3 != null) {
                            opoVar3.p(c0j.E4, false);
                        }
                    } else {
                        setLowSpo2Fold();
                    }
                }
                opo opoVar4 = this.mLowSpo2Adapter;
                if (opoVar4 != null) {
                    opoVar4.notifyDataChanged();
                    return;
                }
                return;
            }
        }
        RecyclerView recyclerView3 = this.lowSpo2Recycler;
        if (recyclerView3 != null) {
            ViewExtKt.setVisible(recyclerView3, false);
        }
    }

    private final void refreshBarChart() {
        List<SegmentBarEntry> listFillWeekMonthSegmentBarEntries;
        int i;
        DailySpo2Report dailySpo2Report = this.spo2Report;
        if (dailySpo2Report == null) {
            LocalDate localDate = this.mCurrentLocalDate;
            Intrinsics.checkNotNull(localDate);
            dailySpo2Report = new DailySpo2Report(TimeDateUtil.changZeroOfTheDay(localDate), BarChartRecyclerHelper.INSTANCE.getViewTag(getFragmentPosition()));
        }
        if (getFragmentPosition() == 0) {
            SpO2DataUtil spO2DataUtil = SpO2DataUtil.INSTANCE;
            r02 r02Var = this.mBarChartAttrs;
            Intrinsics.checkNotNull(r02Var);
            listFillWeekMonthSegmentBarEntries = spO2DataUtil.fillDaySegmentBarEntries(dailySpo2Report, r02Var);
        } else {
            SpO2DataUtil spO2DataUtil2 = SpO2DataUtil.INSTANCE;
            r02 r02Var2 = this.mBarChartAttrs;
            Intrinsics.checkNotNull(r02Var2);
            listFillWeekMonthSegmentBarEntries = spO2DataUtil2.fillWeekMonthSegmentBarEntries(dailySpo2Report, r02Var2, getFragmentPosition() == 1);
        }
        List<SegmentBarEntry> list = this.mEntries;
        Intrinsics.checkNotNull(list);
        list.clear();
        List<SegmentBarEntry> list2 = this.mEntries;
        Intrinsics.checkNotNull(list2);
        list2.addAll(listFillWeekMonthSegmentBarEntries);
        int theSpoMinNumber = Spo2Utils.INSTANCE.getTheSpoMinNumber(this.mEntries);
        Logger.i("MiHealth:spo2", "refreshYAxis MinNumber:" + theSpoMinNumber);
        float f = 85.0f;
        if (theSpoMinNumber < 0 || theSpoMinNumber >= 85.0f) {
            i = 5;
        } else {
            f = (theSpoMinNumber / 10) * 10;
            i = 10;
        }
        r02 r02Var3 = this.mBarChartAttrs;
        Intrinsics.checkNotNull(r02Var3);
        r02Var3.E = 100.0f;
        r02 r02Var4 = this.mBarChartAttrs;
        Intrinsics.checkNotNull(r02Var4);
        r02Var4.F = f;
        rtr rtrVar = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar);
        rtrVar.setAxisMaximum(100.0f);
        rtr rtrVar2 = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar2);
        rtrVar2.setAxisMinimum(f);
        rtr rtrVar3 = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar3);
        rtrVar3.d(3, i);
        rtr rtrVar4 = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar4);
        rtrVar4.f = 3;
        s02 s02Var = this.mItemDecoration;
        Intrinsics.checkNotNull(s02Var);
        s02Var.setYAxis(this.mYAxis);
        SpO2BarChartAdapter<sf2> spO2BarChartAdapter = this.mBarChartAdapter;
        Intrinsics.checkNotNull(spO2BarChartAdapter);
        spO2BarChartAdapter.setYAxis(this.mYAxis);
        SpO2BarChartAdapter<sf2> spO2BarChartAdapter2 = this.mBarChartAdapter;
        Intrinsics.checkNotNull(spO2BarChartAdapter2);
        spO2BarChartAdapter2.notifyDataSetChanged();
    }

    private final void refreshDataTitleView() {
        if (this.spo2Report == null) {
            DataTitleView dataTitleView = this.dataTitleView;
            if (dataTitleView != null) {
                dataTitleView.c(getEmptyTitleStr());
                return;
            }
            return;
        }
        if (getFragmentPosition() == 0) {
            DailySpo2Report dailySpo2Report = this.spo2Report;
            Intrinsics.checkNotNull(dailySpo2Report);
            Spo2Item latestSpoRecord = dailySpo2Report.getLatestSpoRecord();
            if (latestSpoRecord == null || latestSpoRecord.getSpo2() <= 0) {
                DataTitleView dataTitleView2 = this.dataTitleView;
                if (dataTitleView2 != null) {
                    dataTitleView2.c(getEmptyTitleStr());
                    return;
                }
                return;
            }
            String dateStr = TimeDateUtil.getDateStr(latestSpoRecord.getTime(), TimeUtils.FORMAT_H_M);
            String quantityString = requireContext().getResources().getQuantityString(qxi.z1, latestSpoRecord.getSpo2(), Integer.valueOf(latestSpoRecord.getSpo2()));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            DataTitleView dataTitleView3 = this.dataTitleView;
            if (dataTitleView3 != null) {
                dataTitleView3.a(requireContext(), quantityString, quantityString, dateStr);
                return;
            }
            return;
        }
        DailySpo2Report dailySpo2Report2 = this.spo2Report;
        Intrinsics.checkNotNull(dailySpo2Report2);
        int avgSpo2 = dailySpo2Report2.getAvgSpo2();
        if (avgSpo2 <= 0) {
            DataTitleView dataTitleView4 = this.dataTitleView;
            if (dataTitleView4 != null) {
                dataTitleView4.c(getEmptyTitleStr());
                return;
            }
            return;
        }
        String quantityString2 = requireContext().getResources().getQuantityString(qxi.z1, avgSpo2, Integer.valueOf(avgSpo2));
        Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
        String string = getString(c0j.Wk);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        DataTitleView dataTitleView5 = this.dataTitleView;
        if (dataTitleView5 != null) {
            dataTitleView5.a(requireContext(), quantityString2, quantityString2, string);
        }
    }

    private final void refreshDetailCard() {
        if (this.spo2Report == null) {
            RecyclerView recyclerView = this.recyclerDetail;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
                return;
            }
            return;
        }
        SpO2DataUtil spO2DataUtil = SpO2DataUtil.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        DailySpo2Report dailySpo2Report = this.spo2Report;
        Intrinsics.checkNotNull(dailySpo2Report);
        List<qpo> listCreateSummaryViewModel = spO2DataUtil.createSummaryViewModel(contextRequireContext, dailySpo2Report);
        if (!(!listCreateSummaryViewModel.isEmpty())) {
            RecyclerView recyclerView2 = this.recyclerDetail;
            if (recyclerView2 != null) {
                recyclerView2.setVisibility(8);
                return;
            }
            return;
        }
        RecyclerView recyclerView3 = this.recyclerDetail;
        if (recyclerView3 != null) {
            recyclerView3.setVisibility(0);
        }
        List<qpo> list = this.mDataListDetail;
        if (list != null) {
            list.clear();
        }
        List<qpo> list2 = this.mDataListDetail;
        if (list2 != null) {
            list2.addAll(listCreateSummaryViewModel);
        }
        opo opoVar = this.mDetailAdapter;
        if (opoVar != null) {
            DailySpo2Report dailySpo2Report2 = this.spo2Report;
            Intrinsics.checkNotNull(dailySpo2Report2);
            opoVar.setHeaderViewTitle(qpo.a(dailySpo2Report2.getTag()));
        }
        opo opoVar2 = this.mDetailAdapter;
        if (opoVar2 != null) {
            opoVar2.notifyDataSetChanged();
        }
    }

    private final void refreshView() {
        DailySpo2Report dailySpo2Report = this.spo2Report;
        Logger.i("MiHealth:spo2", "report:" + (dailySpo2Report != null ? dailySpo2Report.toString() : null));
        refreshBarChart();
        refreshDetailCard();
        refreshDataTitleView();
        refreshAbnormalLowSpo2Card();
    }

    private final void requestData() {
        LocalDate localDate = this.mCurrentLocalDate;
        Intrinsics.checkNotNull(localDate);
        getMViewModel().triggerFetchFitnessReport(ISpo2Repository.class, BarChartRecyclerHelper.INSTANCE.getViewTag(getFragmentPosition()), TimeDateUtil.changZeroOfTheDay(localDate), 0, 0, "").observe(getViewLifecycleOwner(), new Spo2BaseDayWeekMonthFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: o7n
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Spo2BaseDayWeekMonthFragment.requestData$lambda$0(this.f28826a, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestData$lambda$0(Spo2BaseDayWeekMonthFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (ArrayUtils.isEmpty(list)) {
            this$0.spo2Report = null;
        } else {
            DailyBasicReport dailyBasicReport = (DailyBasicReport) list.get(0);
            if (dailyBasicReport instanceof DailySpo2Report) {
                this$0.spo2Report = (DailySpo2Report) dailyBasicReport;
            }
        }
        this$0.refreshView();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    public final void setLowSpo2Fold() {
        int i;
        List<qpo> list = this.mLowSpo2DataAdapterList;
        if (list != null) {
            list.clear();
        }
        List<qpo> list2 = this.mLowSpo2DataSrcList;
        Intrinsics.checkNotNull(list2);
        int size = list2.size();
        if (SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndExpand()) {
            i = 3;
        } else {
            UIUtils uIUtils = UIUtils.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            if (uIUtils.isTabletAndLandscape(fragmentActivityRequireActivity)) {
                i = 3;
            } else {
                i = 2;
            }
        }
        if (size >= i) {
            List<qpo> list3 = this.mLowSpo2DataAdapterList;
            if (list3 != null) {
                List<qpo> list4 = this.mLowSpo2DataSrcList;
                Intrinsics.checkNotNull(list4);
                list3.addAll(list4.subList(0, i));
            }
        } else if (size == 1) {
            List<qpo> list5 = this.mLowSpo2DataAdapterList;
            if (list5 != null) {
                List<qpo> list6 = this.mLowSpo2DataSrcList;
                Intrinsics.checkNotNull(list6);
                list5.addAll(list6.subList(0, 1));
            }
        } else {
            List<qpo> list7 = this.mLowSpo2DataAdapterList;
            if (list7 != null) {
                List<qpo> list8 = this.mLowSpo2DataSrcList;
                Intrinsics.checkNotNull(list8);
                list7.addAll(list8);
            }
        }
        opo opoVar = this.mLowSpo2Adapter;
        Intrinsics.checkNotNull(opoVar);
        opoVar.p(c0j.F4, true);
    }

    @Nullable
    public final BarChartRecyclerView getChartRecyclerView() {
        return this.chartRecyclerView;
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
    public final RecyclerView getLowSpo2Recycler() {
        return this.lowSpo2Recycler;
    }

    @Nullable
    public final RecyclerView getRecyclerDetail() {
        return this.recyclerDetail;
    }

    @Nullable
    public final DailySpo2Report getSpo2Report() {
        return this.spo2Report;
    }

    @Nullable
    public final View getUnderstandCard() {
        return this.understandCard;
    }

    public abstract void initViewBinding();

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
        Logger.i("MiHealth:spo2", "onViewCreated..mCurrentPosition-mCurrentDate:" + this.mCurrentLocalDate);
        initViewBinding();
        initView();
        requestData();
    }

    public final void setChartRecyclerView(@Nullable BarChartRecyclerView barChartRecyclerView) {
        this.chartRecyclerView = barChartRecyclerView;
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

    public final void setLowSpo2Recycler(@Nullable RecyclerView recyclerView) {
        this.lowSpo2Recycler = recyclerView;
    }

    public final void setRecyclerDetail(@Nullable RecyclerView recyclerView) {
        this.recyclerDetail = recyclerView;
    }

    public final void setSpo2Report(@Nullable DailySpo2Report dailySpo2Report) {
        this.spo2Report = dailySpo2Report;
    }

    public final void setUnderstandCard(@Nullable View view) {
        this.understandCard = view;
    }
}
