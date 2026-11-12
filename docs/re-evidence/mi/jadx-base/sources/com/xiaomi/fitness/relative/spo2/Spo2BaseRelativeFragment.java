package com.xiaomi.fitness.relative.spo2;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.api.repository.ISpo2Repository;
import com.xiaomi.fit.fitness.export.data.CloudDataResult;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailySpo2Report;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.chart.barchart.SpO2BarChartAdapter;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.common.AbnormalDataUtil;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.recycer.BarChartRecyclerHelper;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.spo2.Spo2AbnormalChartFragment;
import com.xiaomi.fitness.relative.base.BasicRelativeDataViewModel;
import com.xiaomi.fitness.relative.spo2.Spo2BaseRelativeFragment;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.util.SpO2DataUtil;
import defpackage.bl5;
import defpackage.c0j;
import defpackage.cx;
import defpackage.onq;
import defpackage.opo;
import defpackage.pni;
import defpackage.qpo;
import defpackage.qxi;
import defpackage.r02;
import defpackage.rtr;
import defpackage.s02;
import defpackage.sf2;
import defpackage.vqr;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\b&\u0018\u0000 t*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\u0001tB\u0007¢\u0006\u0004\bs\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u001f\u0010\u0014\u001a\u00020\u00132\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\bJ\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\bJ!\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0006H&¢\u0006\u0004\b$\u0010\bR\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R$\u0010(\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010/\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001e\u0010=\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001e\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR$\u0010N\u001a\u0004\u0018\u00010M8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u0018\u0010U\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001e\u0010X\u001a\n\u0012\u0004\u0012\u00020W\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010LR$\u0010Y\u001a\u0004\u0018\u00010M8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010O\u001a\u0004\bZ\u0010Q\"\u0004\b[\u0010SR\u0018\u0010\\\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010VR\u001e\u0010]\u001a\n\u0012\u0004\u0012\u00020W\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010LR\u001e\u0010^\u001a\n\u0012\u0004\u0012\u00020W\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010LR$\u0010_\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010)\u001a\u0004\b`\u0010+\"\u0004\ba\u0010-R\u0018\u0010c\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\"\u0010f\u001a\u00020e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0014\u0010o\u001a\u00020l8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0014\u0010r\u001a\u00020\u00138$X¤\u0004¢\u0006\u0006\u001a\u0004\bp\u0010q¨\u0006u"}, d2 = {"Lcom/xiaomi/fitness/relative/spo2/Spo2BaseRelativeFragment;", "Lcom/xiaomi/fitness/relative/base/BasicRelativeDataViewModel;", "VM", "Landroidx/databinding/ViewDataBinding;", "VDB", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "", Constants.KEY_REQUEST_DATA, "()V", "initView", "initAbnormalLowSpo2Card", "setLowSpo2Fold", "initDetailCard", "updateRecyclerDetailLayoutManager", "refreshView", "refreshDataTitleView", "", "Lcom/xiaomi/fitness/chart/entrys/SegmentBarEntry;", "entries", "", "getTheSpoMinNumber", "(Ljava/util/List;)I", "refreshDetailCard", "refreshAbnormalLowSpo2Card", "initBundle", LifecycleConstantKt.ON_RESUME, "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "initViewBinding", "Lorg/joda/time/LocalDate;", "mCurrentLocalDate", "Lorg/joda/time/LocalDate;", "containerView", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "setContainerView", "(Landroid/view/View;)V", "Landroid/widget/TextView;", "dataTitleView", "Landroid/widget/TextView;", "getDataTitleView", "()Landroid/widget/TextView;", "setDataTitleView", "(Landroid/widget/TextView;)V", "Lr02;", "mBarChartAttrs", "Lr02;", "Ls02;", "mItemDecoration", "Ls02;", "Lcom/xiaomi/fitness/chart/barchart/SpO2BarChartAdapter;", "Lsf2;", "mBarChartAdapter", "Lcom/xiaomi/fitness/chart/barchart/SpO2BarChartAdapter;", "Lrtr;", "mYAxis", "Lrtr;", "Lvqr;", "mXAxis", "Lvqr;", "Lonq;", "valueFormatter", "Lonq;", "displayNumber", "I", "", "mEntries", "Ljava/util/List;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerDetail", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerDetail", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerDetail", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lopo;", "mDetailAdapter", "Lopo;", "Lqpo;", "mDataListDetail", "lowSpo2Recycler", "getLowSpo2Recycler", "setLowSpo2Recycler", "mLowSpo2Adapter", "mLowSpo2DataAdapterList", "mLowSpo2DataSrcList", "understandCard", "getUnderstandCard", "setUnderstandCard", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailySpo2Report;", "spo2Report", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailySpo2Report;", "", "relativeUid", "J", "getRelativeUid", "()J", "setRelativeUid", "(J)V", "", "getEmptyTitleStr", "()Ljava/lang/String;", "emptyTitleStr", "getFragmentPosition", "()I", "fragmentPosition", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class Spo2BaseRelativeFragment<VM extends BasicRelativeDataViewModel, VDB extends ViewDataBinding> extends BaseBindingFragment<VM, VDB> {

    @NotNull
    public static final String TAG = "MiHealth:spo2";

    @Nullable
    private View containerView;

    @Nullable
    private TextView dataTitleView;
    private int displayNumber;

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
    private long relativeUid = -1;

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

    private final int getTheSpoMinNumber(List<? extends SegmentBarEntry> entries) {
        if (entries == null || entries.isEmpty()) {
            return -1;
        }
        int minValue = entries.get(0).getMinValue();
        int size = entries.size();
        for (int i = 0; i < size; i++) {
            SegmentBarEntry segmentBarEntry = entries.get(i);
            if (minValue == 0) {
                minValue = segmentBarEntry.getMinValue();
            }
            if (segmentBarEntry.getMinValue() != 0) {
                minValue = Math.min(minValue, segmentBarEntry.getMinValue());
            }
        }
        return minValue;
    }

    private final void initAbnormalLowSpo2Card() {
        if (getFragmentPosition() != 0) {
            return;
        }
        this.mLowSpo2DataAdapterList = new ArrayList();
        this.mLowSpo2DataSrcList = new ArrayList();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getMActivity(), 2);
        gridLayoutManager.D(new GridLayoutManager.b(this) { // from class: com.xiaomi.fitness.relative.spo2.Spo2BaseRelativeFragment.initAbnormalLowSpo2Card.1
            final /* synthetic */ Spo2BaseRelativeFragment<VM, VDB> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                opo opoVar = ((Spo2BaseRelativeFragment) this.this$0).mLowSpo2Adapter;
                Intrinsics.checkNotNull(opoVar);
                if (!opoVar.isHeaderView(position)) {
                    opo opoVar2 = ((Spo2BaseRelativeFragment) this.this$0).mLowSpo2Adapter;
                    Intrinsics.checkNotNull(opoVar2);
                    if (!opoVar2.isFooterView(position)) {
                        return 1;
                    }
                }
                return 2;
            }
        });
        RecyclerView recyclerView = this.lowSpo2Recycler;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(gridLayoutManager);
        }
        bl5 bl5Var = new bl5();
        RecyclerView recyclerView2 = this.lowSpo2Recycler;
        if (recyclerView2 != null) {
            recyclerView2.addItemDecoration(bl5Var);
        }
        opo opoVar = new opo(getMActivity(), this.mLowSpo2DataAdapterList, c0j.Vk, pni.q0);
        this.mLowSpo2Adapter = opoVar;
        Intrinsics.checkNotNull(opoVar);
        opoVar.setOnItemClickListener(new opo.e(this) { // from class: com.xiaomi.fitness.relative.spo2.Spo2BaseRelativeFragment.initAbnormalLowSpo2Card.2
            final /* synthetic */ Spo2BaseRelativeFragment<VM, VDB> this$0;

            {
                this.this$0 = this;
            }

            @Override // opo.e
            public void onBottomClick(boolean fold) {
                if (fold) {
                    List list = ((Spo2BaseRelativeFragment) this.this$0).mLowSpo2DataAdapterList;
                    if (list != null) {
                        list.clear();
                    }
                    List list2 = ((Spo2BaseRelativeFragment) this.this$0).mLowSpo2DataAdapterList;
                    if (list2 != null) {
                        List list3 = ((Spo2BaseRelativeFragment) this.this$0).mLowSpo2DataSrcList;
                        Intrinsics.checkNotNull(list3);
                        list2.addAll(list3);
                    }
                    opo opoVar2 = ((Spo2BaseRelativeFragment) this.this$0).mLowSpo2Adapter;
                    Intrinsics.checkNotNull(opoVar2);
                    opoVar2.p(c0j.E4, false);
                } else {
                    this.this$0.setLowSpo2Fold();
                }
                opo opoVar3 = ((Spo2BaseRelativeFragment) this.this$0).mLowSpo2Adapter;
                Intrinsics.checkNotNull(opoVar3);
                opoVar3.notifyDataChanged();
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

    private final void initBundle() {
        LocalDate localDateMinusDays;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.relativeUid = arguments.getLong("key_relative_uid");
            int i = arguments.getInt("offset", 0);
            int fragmentPosition = getFragmentPosition();
            if (fragmentPosition != 0) {
                localDateMinusDays = fragmentPosition != 1 ? TimeDateUtil.getFirstDayOfMonth(LocalDate.now().minusMonths(i)) : TimeDateUtil.getWeekMonday(LocalDate.now().minusWeeks(i));
            } else {
                localDateMinusDays = LocalDate.now().minusDays(i);
            }
            this.mCurrentLocalDate = localDateMinusDays;
        }
        if (this.mCurrentLocalDate == null) {
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
        updateRecyclerDetailLayoutManager();
        RecyclerView recyclerView2 = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setAdapter(this.mDetailAdapter);
        RecyclerView recyclerView3 = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setHasFixedSize(true);
    }

    private final void initView() {
        initDetailCard();
        initAbnormalLowSpo2Card();
        View view = this.understandCard;
        if (view != null) {
            ViewExtKt.setVisible(view, false);
        }
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
                if (size >= 10) {
                    setLowSpo2Fold();
                } else {
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
                }
                opo opoVar2 = this.mLowSpo2Adapter;
                if (opoVar2 != null) {
                    opoVar2.notifyDataChanged();
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

    private final void refreshDataTitleView() {
        if (this.spo2Report == null) {
            TextView textView = this.dataTitleView;
            if (textView != null) {
                ViewExtKt.setVisible(textView, true);
                return;
            }
            return;
        }
        if (getFragmentPosition() == 0) {
            if (this.spo2Report != null) {
                TextView textView2 = this.dataTitleView;
                if (textView2 != null) {
                    ViewExtKt.setVisible(textView2, false);
                    return;
                }
                return;
            }
            TextView textView3 = this.dataTitleView;
            if (textView3 != null) {
                ViewExtKt.setVisible(textView3, true);
                return;
            }
            return;
        }
        DailySpo2Report dailySpo2Report = this.spo2Report;
        Intrinsics.checkNotNull(dailySpo2Report);
        int avgSpo2 = dailySpo2Report.getAvgSpo2();
        if (avgSpo2 <= 0) {
            TextView textView4 = this.dataTitleView;
            if (textView4 != null) {
                ViewExtKt.setVisible(textView4, true);
                return;
            }
            return;
        }
        Intrinsics.checkNotNullExpressionValue(requireContext().getResources().getQuantityString(qxi.z1, avgSpo2, Integer.valueOf(avgSpo2)), "getQuantityString(...)");
        Intrinsics.checkNotNullExpressionValue(getString(c0j.Wk), "getString(...)");
        TextView textView5 = this.dataTitleView;
        if (textView5 != null) {
            ViewExtKt.setVisible(textView5, false);
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
        refreshDetailCard();
        refreshDataTitleView();
        refreshAbnormalLowSpo2Card();
    }

    private final void requestData() {
        LocalDate localDate = this.mCurrentLocalDate;
        Intrinsics.checkNotNull(localDate);
        getMViewModel().triggerFetchFitnessReport(ISpo2Repository.class, BarChartRecyclerHelper.INSTANCE.getViewTag(getFragmentPosition()), TimeDateUtil.changZeroOfTheDay(localDate), 0, 0, this.relativeUid).observe(getViewLifecycleOwner(), new Spo2BaseRelativeFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: p7n
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Spo2BaseRelativeFragment.requestData$lambda$0(this.f30093a, (CloudDataResult) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestData$lambda$0(Spo2BaseRelativeFragment this$0, CloudDataResult cloudDataResult) {
        TextView textView;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (cloudDataResult.getData() == null || ArrayUtils.isEmpty((Collection<?>) cloudDataResult.getData())) {
            this$0.spo2Report = null;
            if (cloudDataResult.isOutSharedData() && (textView = this$0.dataTitleView) != null) {
                textView.setText(this$0.getString(c0j.I4));
            }
        } else {
            Object data = cloudDataResult.getData();
            Intrinsics.checkNotNull(data);
            DailyBasicReport dailyBasicReport = (DailyBasicReport) ((List) data).get(0);
            if (dailyBasicReport instanceof DailySpo2Report) {
                this$0.spo2Report = (DailySpo2Report) dailyBasicReport;
            }
        }
        this$0.refreshView();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLowSpo2Fold() {
        List<qpo> list = this.mLowSpo2DataAdapterList;
        if (list != null) {
            list.clear();
        }
        List<qpo> list2 = this.mLowSpo2DataSrcList;
        Intrinsics.checkNotNull(list2);
        int size = list2.size();
        if (size >= 2) {
            List<qpo> list3 = this.mLowSpo2DataAdapterList;
            if (list3 != null) {
                List<qpo> list4 = this.mLowSpo2DataSrcList;
                Intrinsics.checkNotNull(list4);
                list3.addAll(list4.subList(0, 2));
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

    @Nullable
    public final View getContainerView() {
        return this.containerView;
    }

    @Nullable
    public final TextView getDataTitleView() {
        return this.dataTitleView;
    }

    public abstract int getFragmentPosition();

    @Nullable
    public final RecyclerView getLowSpo2Recycler() {
        return this.lowSpo2Recycler;
    }

    @Nullable
    public final RecyclerView getRecyclerDetail() {
        return this.recyclerDetail;
    }

    public final long getRelativeUid() {
        return this.relativeUid;
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
        Logger.i("MiHealth:spo2", "onViewCreated..mCurrentPosition-mCurrentDate:" + this.mCurrentLocalDate);
        initViewBinding();
        initView();
        requestData();
    }

    public final void setContainerView(@Nullable View view) {
        this.containerView = view;
    }

    public final void setDataTitleView(@Nullable TextView textView) {
        this.dataTitleView = textView;
    }

    public final void setLowSpo2Recycler(@Nullable RecyclerView recyclerView) {
        this.lowSpo2Recycler = recyclerView;
    }

    public final void setRecyclerDetail(@Nullable RecyclerView recyclerView) {
        this.recyclerDetail = recyclerView;
    }

    public final void setRelativeUid(long j) {
        this.relativeUid = j;
    }

    public final void setUnderstandCard(@Nullable View view) {
        this.understandCard = view;
    }
}
