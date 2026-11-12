package com.xiaomi.fitness.training_plan.habit_plan;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.data.common.data.annotation.FitnessSportType;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportRes;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.view.Status;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.baseui.view.TipType;
import com.xiaomi.fitness.baseui.view.TipViewKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.trail.export.SportRecordApiKt;
import com.xiaomi.fitness.training_plan.habit_plan.HabitPlanHistoryRecordListActivity;
import com.xiaomi.fitness.training_plan.util.TrainingDataUtils;
import com.xiaomi.fitness.training_plan.util.TrainingReportUtils;
import com.xiaomi.fitness.training_plan_export.model.TrainingSportReportInfo;
import defpackage.fm0;
import defpackage.jvi;
import defpackage.k1j;
import defpackage.mnd;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003%&'B\u0007¢\u0006\u0004\b$\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u00060\u001bR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 ¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/training_plan/habit_plan/HabitPlanHistoryRecordListActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/training_plan/habit_plan/HabitPlanHistoryRecordListVM;", "Lfm0;", "", "initView", "()V", "", "loadMore", "loadData", "(Z)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "nextKey", "Ljava/lang/String;", "hasMore", "Z", "", "planId", "J", "Ljava/util/ArrayList;", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "reportList", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/training_plan/habit_plan/HabitPlanHistoryRecordListActivity$ReportListAdapter;", "reportListAdapter", "Lcom/xiaomi/fitness/training_plan/habit_plan/HabitPlanHistoryRecordListActivity$ReportListAdapter;", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "ReportListAdapter", "ReportListViewHolder", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HabitPlanHistoryRecordListActivity extends Hilt_HabitPlanHistoryRecordListActivity<HabitPlanHistoryRecordListVM, fm0> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String KEY_PLAN_ID = "plan_id";

    @NotNull
    private static final String TAG = "HabitPlanHistoryRecordListActivity";
    private long planId;

    @NotNull
    private String nextKey = "";
    private boolean hasMore = true;

    @NotNull
    private final ArrayList<SportBasicReport> reportList = new ArrayList<>();

    @NotNull
    private final ReportListAdapter reportListAdapter = new ReportListAdapter();

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/training_plan/habit_plan/HabitPlanHistoryRecordListActivity$Companion;", "", "<init>", "()V", "TAG", "", "KEY_PLAN_ID", "launch", "", "context", "Landroid/content/Context;", "planId", "", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void launch$default(Companion companion, Context context, long j, int i, Object obj) {
            if ((i & 2) != 0) {
                j = 0;
            }
            companion.launch(context, j);
        }

        public final void launch(@NotNull Context context, long planId) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) HabitPlanHistoryRecordListActivity.class);
            intent.putExtra("plan_id", planId);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u001c\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u000f\u001a\u00020\nH\u0016¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/training_plan/habit_plan/HabitPlanHistoryRecordListActivity$ReportListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/training_plan/habit_plan/HabitPlanHistoryRecordListActivity$ReportListViewHolder;", "Lcom/xiaomi/fitness/training_plan/habit_plan/HabitPlanHistoryRecordListActivity;", "<init>", "(Lcom/xiaomi/fitness/training_plan/habit_plan/HabitPlanHistoryRecordListActivity;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "onBindViewHolder", "", "holder", "position", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class ReportListAdapter extends RecyclerView.Adapter<ReportListViewHolder> {
        public ReportListAdapter() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return HabitPlanHistoryRecordListActivity.this.reportList.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull ReportListViewHolder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Object obj = HabitPlanHistoryRecordListActivity.this.reportList.get(position);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            holder.bindData((SportBasicReport) obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public ReportListViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            mnd mndVarA0 = mnd.A0(LayoutInflater.from(HabitPlanHistoryRecordListActivity.this));
            mndVarA0.getRoot().setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            Intrinsics.checkNotNullExpressionValue(mndVarA0, "apply(...)");
            return new ReportListViewHolder(HabitPlanHistoryRecordListActivity.this, mndVarA0);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/training_plan/habit_plan/HabitPlanHistoryRecordListActivity$ReportListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "report", "", "bindData", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)V", "Lmnd;", "binding", "Lmnd;", "getBinding", "()Lmnd;", "<init>", "(Lcom/xiaomi/fitness/training_plan/habit_plan/HabitPlanHistoryRecordListActivity;Lmnd;)V", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class ReportListViewHolder extends RecyclerView.d0 {

        @NotNull
        private final mnd binding;
        final /* synthetic */ HabitPlanHistoryRecordListActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReportListViewHolder(@NotNull HabitPlanHistoryRecordListActivity habitPlanHistoryRecordListActivity, mnd binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = habitPlanHistoryRecordListActivity;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindData$lambda$0(HabitPlanHistoryRecordListActivity this$0, SportBasicReport report, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(report, "$report");
            SportRecordApiKt.getSportRecordApi().goSportDetail(this$0, report);
        }

        @SuppressLint({"StringFormatInvalid", "SetTextI18n"})
        public final void bindData(@NotNull final SportBasicReport report) {
            Intrinsics.checkNotNullParameter(report, "report");
            SportRes sportRes = FitnessSportType.INSTANCE.getSportRes(report.getSportType());
            this.binding.D.setText(sportRes.getName());
            this.binding.B.setImageResource(sportRes.getIcon() != 0 ? sportRes.getIcon() : 0);
            Integer correctedDistance = report.getCorrectedDistance();
            Integer distance = (correctedDistance == null || correctedDistance.intValue() <= 0) ? report.getDistance() : report.getCorrectedDistance();
            Pair<String, String> pairHandleTotalDistance = TrainingDataUtils.INSTANCE.handleTotalDistance(distance != null ? distance.intValue() : 0.0f);
            this.binding.C.setText(((Object) pairHandleTotalDistance.getFirst()) + " " + ((Object) pairHandleTotalDistance.getSecond()));
            this.binding.A.setText(TimeDateUtil.INSTANCE.getDateMMDDLocalFormat(report.getStartTime() * 1000));
            View root = this.binding.getRoot();
            final HabitPlanHistoryRecordListActivity habitPlanHistoryRecordListActivity = this.this$0;
            root.setOnClickListener(new View.OnClickListener() { // from class: cgb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HabitPlanHistoryRecordListActivity.ReportListViewHolder.bindData$lambda$0(habitPlanHistoryRecordListActivity, report, view);
                }
            });
        }

        @NotNull
        public final mnd getBinding() {
            return this.binding;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"NotifyDataSetChanged"})
    private final void initView() {
        ((fm0) getMBinding()).D.setTitle(k1j.h1);
        ((fm0) getMBinding()).D.hideMore();
        ((fm0) getMBinding()).C.addItemDecoration(new RecyclerView.n() { // from class: com.xiaomi.fitness.training_plan.habit_plan.HabitPlanHistoryRecordListActivity.initView.1
            @Override // androidx.recyclerview.widget.RecyclerView.n
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.z state) {
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                outRect.bottom = ExtUtilsKt.getDp(12);
            }
        });
        ((fm0) getMBinding()).C.setLayoutManager(new LinearLayoutManager(this));
        ((fm0) getMBinding()).C.setAdapter(this.reportListAdapter);
        ((fm0) getMBinding()).C.setEnableMore(true);
        ((fm0) getMBinding()).C.setLoadListener(new MoreRecyclerView.LoadListener() { // from class: com.xiaomi.fitness.training_plan.habit_plan.HabitPlanHistoryRecordListActivity.initView.2
            @Override // com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView.LoadListener
            public void loadMore() {
                HabitPlanHistoryRecordListActivity.this.loadData(true);
            }
        });
        ((HabitPlanHistoryRecordListVM) getMViewModel()).getSportReportInfo().observe(this, new HabitPlanHistoryRecordListActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: zfb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HabitPlanHistoryRecordListActivity.initView$lambda$2(this.f41223a, (TrainingSportReportInfo) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initView$lambda$2(final HabitPlanHistoryRecordListActivity this$0, TrainingSportReportInfo trainingSportReportInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (trainingSportReportInfo != null) {
            this$0.nextKey = trainingSportReportInfo.getNextKey();
            this$0.hasMore = trainingSportReportInfo.getHasMore();
            this$0.reportList.addAll(TrainingReportUtils.INSTANCE.convertItems2Reports(trainingSportReportInfo.getReports()));
            MoreRecyclerView.setStatus$default(((fm0) this$0.getMBinding()).C, this$0.hasMore ? Status.MORE : Status.DONE, false, 2, null);
            if (this$0.reportList.isEmpty()) {
                FrameLayout contentRoot = ((fm0) this$0.getMBinding()).A;
                Intrinsics.checkNotNullExpressionValue(contentRoot, "contentRoot");
                TipViewKt.addTipView$default(contentRoot, TipType.NO_DATA, false, new Function0() { // from class: agb
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HabitPlanHistoryRecordListActivity.initView$lambda$2$lambda$0(this.f981a);
                    }
                }, 4, null);
            } else {
                this$0.reportListAdapter.notifyDataSetChanged();
            }
        } else if (this$0.reportList.isEmpty()) {
            MoreRecyclerView.setStatus$default(((fm0) this$0.getMBinding()).C, Status.FAIL, false, 2, null);
            FrameLayout contentRoot2 = ((fm0) this$0.getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(contentRoot2, "contentRoot");
            TipViewKt.addTipView$default(contentRoot2, TipType.NO_NET, false, new Function0() { // from class: bgb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HabitPlanHistoryRecordListActivity.initView$lambda$2$lambda$1(this.f4177a);
                }
            }, 4, null);
        } else {
            Logger.i(TAG, "get sport report info net error!!");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$2$lambda$0(HabitPlanHistoryRecordListActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        loadData$default(this$0, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$2$lambda$1(HabitPlanHistoryRecordListActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        loadData$default(this$0, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void loadData(boolean loadMore) {
        if (!loadMore) {
            PageState.DefaultImpls.showLoading$default(this, k1j.o1, false, 2, null);
        }
        ((HabitPlanHistoryRecordListVM) getMViewModel()).getHistoryList(this.planId, this.nextKey);
    }

    public static /* synthetic */ void loadData$default(HabitPlanHistoryRecordListActivity habitPlanHistoryRecordListActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        habitPlanHistoryRecordListActivity.loadData(z);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jvi.t;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // com.xiaomi.fitness.training_plan.habit_plan.Hilt_HabitPlanHistoryRecordListActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DisplayUtil.setTranslucentStatusBar(this);
        setActionBarDisplayable(false);
        long longExtra = getIntent().getLongExtra("plan_id", 0L);
        this.planId = longExtra;
        if (longExtra == 0) {
            Logger.i(TAG, "can not get report list with empty planId!!");
            finish();
        }
        initView();
        loadData$default(this, false, 1, null);
    }
}
