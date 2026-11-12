package com.xiaomi.fitness.relative.stand;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.api.repository.IStandRepository;
import com.xiaomi.fit.fitness.export.data.CloudDataResult;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStandReport;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.recycer.BarChartRecyclerHelper;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.stand.StandManualSetView;
import com.xiaomi.fitness.relative.base.BasicRelativeDataViewModel;
import com.xiaomi.fitness.relative.stand.StandBaseRelativeFragment;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.util.StandDataUtil;
import defpackage.bl5;
import defpackage.c0j;
import defpackage.onq;
import defpackage.opo;
import defpackage.pni;
import defpackage.qpo;
import defpackage.r02;
import defpackage.rtr;
import defpackage.s02;
import defpackage.vqr;
import defpackage.x8o;
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
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\b&\u0018\u0000 r*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\u0001rB\u0007¢\u0006\u0004\bq\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bJ!\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H&¢\u0006\u0004\b\u001e\u0010\bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R$\u0010!\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010(\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u001e\u0010A\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER$\u0010G\u001a\u0004\u0018\u00010F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u001e\u0010Q\u001a\n\u0012\u0004\u0012\u00020P\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010BR$\u0010S\u001a\u0004\u0018\u00010R8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010Y\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010\"\u001a\u0004\bZ\u0010$\"\u0004\b[\u0010&R\u0018\u0010]\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\"\u0010`\u001a\u00020_8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR$\u0010f\u001a\u0004\u0018\u00010\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010^\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u0014\u0010m\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0014\u0010p\u001a\u00020\u00178$X¤\u0004¢\u0006\u0006\u001a\u0004\bn\u0010o¨\u0006s"}, d2 = {"Lcom/xiaomi/fitness/relative/stand/StandBaseRelativeFragment;", "Lcom/xiaomi/fitness/relative/base/BasicRelativeDataViewModel;", "VM", "Landroidx/databinding/ViewDataBinding;", "VDB", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "", Constants.KEY_REQUEST_DATA, "()V", "refreshViewIfNeed", "initView", "initUnderstandCard", "initDetailCard", "refreshDetailCard", "refreshManualStandCard", "initBundle", LifecycleConstantKt.ON_RESUME, "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "position", "Lorg/joda/time/LocalDate;", "localDate", "", "getTitleDesc", "(ILorg/joda/time/LocalDate;)Ljava/lang/String;", "initViewBinding", "mCurrentLocalDate", "Lorg/joda/time/LocalDate;", "containerView", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "setContainerView", "(Landroid/view/View;)V", "Landroid/widget/TextView;", "dataTitleView", "Landroid/widget/TextView;", "getDataTitleView", "()Landroid/widget/TextView;", "setDataTitleView", "(Landroid/widget/TextView;)V", "Ls02;", "mItemDecoration", "Ls02;", "Lrtr;", "mYAxis", "Lrtr;", "Lvqr;", "mXAxis", "Lvqr;", "Lonq;", "valueFormatter", "Lonq;", "displayNumber", "I", "Lr02;", "mBarChartAttrs", "Lr02;", "", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "mEntries", "Ljava/util/List;", "Lx8o;", "mBarChartAdapter", "Lx8o;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerDetail", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerDetail", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerDetail", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lopo;", "mDetailAdapter", "Lopo;", "Lqpo;", "mDataListDetail", "Lcom/xiaomi/fitness/health/stand/StandManualSetView;", "standManualSetView", "Lcom/xiaomi/fitness/health/stand/StandManualSetView;", "getStandManualSetView", "()Lcom/xiaomi/fitness/health/stand/StandManualSetView;", "setStandManualSetView", "(Lcom/xiaomi/fitness/health/stand/StandManualSetView;)V", "understandCard", "getUnderstandCard", "setUnderstandCard", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStandReport;", "mDailyStandReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStandReport;", "", "relativeUid", "J", "getRelativeUid", "()J", "setRelativeUid", "(J)V", "currentReport", "getCurrentReport", "()Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStandReport;", "setCurrentReport", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStandReport;)V", "getEmptyTitleStr", "()Ljava/lang/String;", "emptyTitleStr", "getFragmentPosition", "()I", "fragmentPosition", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class StandBaseRelativeFragment<VM extends BasicRelativeDataViewModel, VDB extends ViewDataBinding> extends BaseBindingFragment<VM, VDB> {

    @NotNull
    public static final String TAG = "MiHealth:stand";

    @Nullable
    private View containerView;

    @Nullable
    private DailyStandReport currentReport;

    @Nullable
    private TextView dataTitleView;
    private int displayNumber;

    @Nullable
    private x8o mBarChartAdapter;

    @Nullable
    private r02 mBarChartAttrs;

    @Nullable
    private LocalDate mCurrentLocalDate;

    @Nullable
    private DailyStandReport mDailyStandReport;

    @Nullable
    private List<qpo> mDataListDetail;

    @Nullable
    private opo mDetailAdapter;

    @Nullable
    private List<RecyclerBarEntry> mEntries;

    @Nullable
    private s02 mItemDecoration;

    @Nullable
    private vqr mXAxis;

    @Nullable
    private rtr mYAxis;

    @Nullable
    private RecyclerView recyclerDetail;
    private long relativeUid = -1;

    @Nullable
    private StandManualSetView standManualSetView;

    @Nullable
    private View understandCard;

    @Nullable
    private onq valueFormatter;

    private final String getEmptyTitleStr() {
        String string = getString(c0j.L6);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
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
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getMActivity(), 2);
        gridLayoutManager.D(new GridLayoutManager.b(this) { // from class: com.xiaomi.fitness.relative.stand.StandBaseRelativeFragment.initDetailCard.1
            final /* synthetic */ StandBaseRelativeFragment<VM, VDB> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                opo opoVar = ((StandBaseRelativeFragment) this.this$0).mDetailAdapter;
                Intrinsics.checkNotNull(opoVar);
                return opoVar.isHeaderView(position) ? 2 : 1;
            }
        });
        RecyclerView recyclerView = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setLayoutManager(gridLayoutManager);
        RecyclerView recyclerView2 = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.addItemDecoration(new bl5());
        this.mDetailAdapter = new opo(getMActivity(), this.mDataListDetail, c0j.I6, pni.D3);
        RecyclerView recyclerView3 = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setAdapter(this.mDetailAdapter);
        RecyclerView recyclerView4 = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView4);
        recyclerView4.setHasFixedSize(true);
    }

    private final void initUnderstandCard() {
        View view = this.understandCard;
        if (view != null) {
            ViewExtKt.setVisible(view, false);
        }
    }

    private final void initView() {
        initDetailCard();
        initUnderstandCard();
    }

    private final void refreshDetailCard() {
        if (this.mDailyStandReport == null) {
            TextView textView = this.dataTitleView;
            if (textView != null) {
                ViewExtKt.setVisible(textView, true);
            }
            RecyclerView recyclerView = this.recyclerDetail;
            Intrinsics.checkNotNull(recyclerView);
            recyclerView.setVisibility(8);
            return;
        }
        StandDataUtil standDataUtil = StandDataUtil.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        DailyStandReport dailyStandReport = this.mDailyStandReport;
        Intrinsics.checkNotNull(dailyStandReport);
        List<qpo> listCreateRSummaryModelList = standDataUtil.createRSummaryModelList(contextRequireContext, dailyStandReport, getFragmentPosition());
        if (!(!listCreateRSummaryModelList.isEmpty())) {
            TextView textView2 = this.dataTitleView;
            if (textView2 != null) {
                ViewExtKt.setVisible(textView2, true);
            }
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
        list2.addAll(listCreateRSummaryModelList);
        opo opoVar = this.mDetailAdapter;
        Intrinsics.checkNotNull(opoVar);
        DailyStandReport dailyStandReport2 = this.mDailyStandReport;
        Intrinsics.checkNotNull(dailyStandReport2);
        opoVar.setHeaderViewTitle(qpo.a(dailyStandReport2.getTag()));
        TextView textView3 = this.dataTitleView;
        if (textView3 != null) {
            ViewExtKt.setVisible(textView3, false);
        }
        opo opoVar2 = this.mDetailAdapter;
        Intrinsics.checkNotNull(opoVar2);
        opoVar2.notifyDataChanged();
    }

    private final void refreshManualStandCard() {
        if (getFragmentPosition() == 0 && this.currentReport != null) {
            LocalDate localDateNow = LocalDate.now();
            Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
            DailyStandReport dailyStandReport = this.currentReport;
            Intrinsics.checkNotNull(dailyStandReport);
            if (TimeDateUtil.isSameLocalDate(localDateNow, TimeDateUtil.timestampToLocalDate(dailyStandReport.getTime()))) {
                StandManualSetView standManualSetView = this.standManualSetView;
                if (standManualSetView != null) {
                    standManualSetView.setVisibility(0);
                }
                StandManualSetView standManualSetView2 = this.standManualSetView;
                if (standManualSetView2 != null) {
                    standManualSetView2.bindData();
                }
                StandDataUtil standDataUtil = StandDataUtil.INSTANCE;
                DailyStandReport dailyStandReport2 = this.currentReport;
                Intrinsics.checkNotNull(dailyStandReport2);
                boolean zFindCurrentHourStand = standDataUtil.findCurrentHourStand(dailyStandReport2);
                StandManualSetView standManualSetView3 = this.standManualSetView;
                if (standManualSetView3 != null) {
                    ViewExtKt.setVisible(standManualSetView3, !zFindCurrentHourStand);
                    return;
                }
                return;
            }
        }
        StandManualSetView standManualSetView4 = this.standManualSetView;
        if (standManualSetView4 != null) {
            standManualSetView4.setVisibility(8);
        }
    }

    private final void refreshViewIfNeed() {
        DailyStandReport dailyStandReport = this.mDailyStandReport;
        Logger.i("MiHealth:stand", "refreshViewIfNeed StandReport .. " + (dailyStandReport != null ? dailyStandReport.toString() : null));
        refreshDetailCard();
        refreshManualStandCard();
    }

    private final void requestData() {
        LocalDate localDate = this.mCurrentLocalDate;
        Intrinsics.checkNotNull(localDate);
        getMViewModel().triggerFetchFitnessReport(IStandRepository.class, BarChartRecyclerHelper.INSTANCE.getViewTag(getFragmentPosition()), TimeDateUtil.changZeroOfTheDay(localDate), 0, 0, this.relativeUid).observe(getViewLifecycleOwner(), new StandBaseRelativeFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: w8o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return StandBaseRelativeFragment.requestData$lambda$0(this.f37728a, (CloudDataResult) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestData$lambda$0(StandBaseRelativeFragment this$0, CloudDataResult cloudDataResult) {
        TextView textView;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (cloudDataResult.getData() == null || ArrayUtils.isEmpty((Collection<?>) cloudDataResult.getData())) {
            this$0.mDailyStandReport = null;
            if (cloudDataResult.isOutSharedData() && (textView = this$0.dataTitleView) != null) {
                textView.setText(this$0.getString(c0j.I4));
            }
        } else {
            Object data = cloudDataResult.getData();
            Intrinsics.checkNotNull(data);
            DailyBasicReport dailyBasicReport = (DailyBasicReport) ((List) data).get(0);
            if (dailyBasicReport instanceof DailyStandReport) {
                this$0.mDailyStandReport = (DailyStandReport) dailyBasicReport;
            }
        }
        this$0.refreshViewIfNeed();
        return Unit.INSTANCE;
    }

    @Nullable
    public final View getContainerView() {
        return this.containerView;
    }

    @Nullable
    public final DailyStandReport getCurrentReport() {
        return this.currentReport;
    }

    @Nullable
    public final TextView getDataTitleView() {
        return this.dataTitleView;
    }

    public abstract int getFragmentPosition();

    @Nullable
    public final RecyclerView getRecyclerDetail() {
        return this.recyclerDetail;
    }

    public final long getRelativeUid() {
        return this.relativeUid;
    }

    @Nullable
    public final StandManualSetView getStandManualSetView() {
        return this.standManualSetView;
    }

    @Nullable
    public String getTitleDesc(int position, @Nullable LocalDate localDate) {
        if (position == 0) {
            return TimeDateUtil.getDateYYYYMMddLocalFormat(localDate);
        }
        if (position == 1) {
            Intrinsics.checkNotNull(localDate);
            return HealthUtil.getWeekDateStr(localDate);
        }
        if (position != 2) {
            return "";
        }
        Intrinsics.checkNotNull(localDate);
        return TimeDateUtil.getDateYYYYMMLocalFormat(localDate);
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
        Logger.i("MiHealth:stand", "onViewCreated..mCurrentPosition-mCurrentDate:" + this.mCurrentLocalDate);
        initViewBinding();
        initView();
        requestData();
    }

    public final void setContainerView(@Nullable View view) {
        this.containerView = view;
    }

    public final void setCurrentReport(@Nullable DailyStandReport dailyStandReport) {
        this.currentReport = dailyStandReport;
    }

    public final void setDataTitleView(@Nullable TextView textView) {
        this.dataTitleView = textView;
    }

    public final void setRecyclerDetail(@Nullable RecyclerView recyclerView) {
        this.recyclerDetail = recyclerView;
    }

    public final void setRelativeUid(long j) {
        this.relativeUid = j;
    }

    public final void setStandManualSetView(@Nullable StandManualSetView standManualSetView) {
        this.standManualSetView = standManualSetView;
    }

    public final void setUnderstandCard(@Nullable View view) {
        this.understandCard = view;
    }
}
