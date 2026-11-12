package com.xiaomi.fitness.training_plan.common;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.miui.tsmclient.util.StringUtils;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.view.Status;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.baseui.view.TipType;
import com.xiaomi.fitness.baseui.view.TipViewKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.training_plan.common.PlanHistoryListActivity;
import com.xiaomi.fitness.training_plan.net.GetPlanHistoryResult;
import com.xiaomi.fitness.training_plan.util.TrainingDataUtils;
import com.xiaomi.fitness.training_plan_export.manager.ITrainingManager;
import com.xiaomi.fitness.training_plan_export.manager.TrainingManagerExtKt;
import com.xiaomi.fitness.training_plan_export.utils.TrainingMedalUtils;
import defpackage.cyi;
import defpackage.in0;
import defpackage.jvi;
import defpackage.k1j;
import defpackage.wnd;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003&'(B\u0007¢\u0006\u0004\b%\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001d\u001a\u00060\u001cR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/training_plan/common/PlanHistoryListActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/training_plan/common/PlanHistoryListVM;", "Lin0;", "", "initView", "()V", "loadData", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "nextKey", "Ljava/lang/String;", "", "hasMore", "Z", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/training_plan/common/PlanReport;", "historyData", "Ljava/util/ArrayList;", "Ljava/text/SimpleDateFormat;", "simpleDataFormat$delegate", "Lkotlin/Lazy;", "getSimpleDataFormat", "()Ljava/text/SimpleDateFormat;", "simpleDataFormat", "Lcom/xiaomi/fitness/training_plan/common/PlanHistoryListActivity$PlanHistoryAdapter;", "adapter", "Lcom/xiaomi/fitness/training_plan/common/PlanHistoryListActivity$PlanHistoryAdapter;", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "PlanHistoryAdapter", "PlanHistoryViewHolder", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class PlanHistoryListActivity extends Hilt_PlanHistoryListActivity<PlanHistoryListVM, in0> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private String nextKey = "";
    private boolean hasMore = true;

    @NotNull
    private final ArrayList<PlanReport> historyData = new ArrayList<>();

    /* JADX INFO: renamed from: simpleDataFormat$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy simpleDataFormat = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: szh
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PlanHistoryListActivity.simpleDataFormat_delegate$lambda$0();
        }
    });

    @NotNull
    private final PlanHistoryAdapter adapter = new PlanHistoryAdapter();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/training_plan/common/PlanHistoryListActivity$Companion;", "", "<init>", "()V", "launch", "", "context", "Landroid/content/Context;", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) PlanHistoryListActivity.class));
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u001c\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u000f\u001a\u00020\nH\u0016¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/training_plan/common/PlanHistoryListActivity$PlanHistoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/training_plan/common/PlanHistoryListActivity$PlanHistoryViewHolder;", "Lcom/xiaomi/fitness/training_plan/common/PlanHistoryListActivity;", "<init>", "(Lcom/xiaomi/fitness/training_plan/common/PlanHistoryListActivity;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "onBindViewHolder", "", "holder", "position", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class PlanHistoryAdapter extends RecyclerView.Adapter<PlanHistoryViewHolder> {
        public PlanHistoryAdapter() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onBindViewHolder$lambda$1(PlanHistoryListActivity this$0, PlanReport data, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(data, "$data");
            TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE).launchPlanReport(this$0, data.getPlanType(), data.getPlanId());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return PlanHistoryListActivity.this.historyData.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull PlanHistoryViewHolder holder, int position) {
            String string;
            Intrinsics.checkNotNullParameter(holder, "holder");
            Object obj = PlanHistoryListActivity.this.historyData.get(position);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            final PlanReport planReport = (PlanReport) obj;
            TextView textView = holder.getBinding().N;
            int planType = planReport.getPlanType();
            if (planType != 1) {
                string = planType != 2 ? "" : PlanHistoryListActivity.this.getString(k1j.q0);
            } else {
                string = PlanHistoryListActivity.this.getString(k1j.c1);
            }
            textView.setText(string);
            TextView textView2 = holder.getBinding().F;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string2 = PlanHistoryListActivity.this.getString(k1j.l1);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String str = String.format(string2, Arrays.copyOf(new Object[]{planReport.getStartDate(), planReport.getEndDate()}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            textView2.setText(str);
            if (planReport.getPlanType() == 2) {
                TextView totalDays = holder.getBinding().K;
                Intrinsics.checkNotNullExpressionValue(totalDays, "totalDays");
                ViewExtKt.gone(totalDays);
                View trainingDivider = holder.getBinding().M;
                Intrinsics.checkNotNullExpressionValue(trainingDivider, "trainingDivider");
                ViewExtKt.gone(trainingDivider);
            } else if (planReport.getPlanType() == 1) {
                TextView totalDays2 = holder.getBinding().K;
                Intrinsics.checkNotNullExpressionValue(totalDays2, "totalDays");
                ViewExtKt.visible(totalDays2);
                holder.getBinding().K.setText(ResourceExtKt.getQuantityString(PlanHistoryListActivity.this, cyi.u, planReport.getSummary().getTotalDays(), Integer.valueOf(planReport.getSummary().getTotalDays())));
            }
            if (planReport.getPlanType() == 1) {
                holder.getBinding().D.setText(PlanHistoryListActivity.this.getString(k1j.m1));
                holder.getBinding().E.setText(ResourceExtKt.getQuantityString(PlanHistoryListActivity.this, cyi.g, planReport.getSummary().getFinishTimes(), Integer.valueOf(planReport.getSummary().getFinishTimes())));
                holder.getBinding().C.setText(String.valueOf(planReport.getSummary().getFinishTimes()));
                holder.getBinding().I.setImageResource(TrainingMedalUtils.INSTANCE.calcHabitMedalIcon(planReport.getSummary().getFinishTimes()));
            } else {
                holder.getBinding().D.setText(PlanHistoryListActivity.this.getString(k1j.p));
                holder.getBinding().E.setText("%");
                int i = 100;
                int progress = (int) (planReport.getSummary().getProgress() * 100);
                if (progress <= 100) {
                    i = progress < 0 ? 0 : progress;
                }
                holder.getBinding().C.setText(String.valueOf(i));
                int iCalcAbilityIcon = TrainingMedalUtils.INSTANCE.calcAbilityIcon(planReport.getSummary().getFinishCourseCount());
                if (iCalcAbilityIcon < 0) {
                    ImageView medalImg = holder.getBinding().I;
                    Intrinsics.checkNotNullExpressionValue(medalImg, "medalImg");
                    ViewExtKt.gone(medalImg);
                } else {
                    holder.getBinding().I.setImageResource(iCalcAbilityIcon);
                }
            }
            Pair<String, String> pairHandleTotalDistanceWithEn = TrainingDataUtils.INSTANCE.handleTotalDistanceWithEn(planReport.getSummary().getTotalDistance());
            holder.getBinding().G.setText(pairHandleTotalDistanceWithEn.getFirst());
            holder.getBinding().H.setText(pairHandleTotalDistanceWithEn.getSecond());
            holder.getBinding().A.setText(String.valueOf((int) planReport.getSummary().getTotalCalorie()));
            View root = holder.getBinding().getRoot();
            final PlanHistoryListActivity planHistoryListActivity = PlanHistoryListActivity.this;
            root.setOnClickListener(new View.OnClickListener() { // from class: wzh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlanHistoryListActivity.PlanHistoryAdapter.onBindViewHolder$lambda$1(planHistoryListActivity, planReport, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public PlanHistoryViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            wnd wndVarA0 = wnd.A0(LayoutInflater.from(PlanHistoryListActivity.this));
            wndVarA0.getRoot().setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            Intrinsics.checkNotNullExpressionValue(wndVarA0, "apply(...)");
            return new PlanHistoryViewHolder(PlanHistoryListActivity.this, wndVarA0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/training_plan/common/PlanHistoryListActivity$PlanHistoryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lwnd;", "binding", "Lwnd;", "getBinding", "()Lwnd;", "<init>", "(Lcom/xiaomi/fitness/training_plan/common/PlanHistoryListActivity;Lwnd;)V", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class PlanHistoryViewHolder extends RecyclerView.d0 {

        @NotNull
        private final wnd binding;
        final /* synthetic */ PlanHistoryListActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlanHistoryViewHolder(@NotNull PlanHistoryListActivity planHistoryListActivity, wnd binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = planHistoryListActivity;
            this.binding = binding;
        }

        @NotNull
        public final wnd getBinding() {
            return this.binding;
        }
    }

    private final SimpleDateFormat getSimpleDataFormat() {
        return (SimpleDateFormat) this.simpleDataFormat.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        ((in0) getMBinding()).D.hideMore();
        ((in0) getMBinding()).D.setTitle(k1j.k1);
        ((in0) getMBinding()).B.setLayoutManager(new LinearLayoutManager(this));
        ((in0) getMBinding()).B.setAdapter(this.adapter);
        ((in0) getMBinding()).B.setEnableMore(true);
        ((in0) getMBinding()).B.setLoadListener(new MoreRecyclerView.LoadListener() { // from class: com.xiaomi.fitness.training_plan.common.PlanHistoryListActivity.initView.1
            @Override // com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView.LoadListener
            public void loadMore() {
                PlanHistoryListActivity.this.loadData();
            }
        });
        ((in0) getMBinding()).B.addItemDecoration(new RecyclerView.n() { // from class: com.xiaomi.fitness.training_plan.common.PlanHistoryListActivity.initView.2
            @Override // androidx.recyclerview.widget.RecyclerView.n
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.z state) {
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                outRect.bottom = ExtUtilsKt.getDp(10);
            }
        });
        ((PlanHistoryListVM) getMViewModel()).getData().observe(this, new PlanHistoryListActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: vzh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PlanHistoryListActivity.initView$lambda$3(this.f37394a, (GetPlanHistoryResult) obj);
            }
        }));
        loadData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initView$lambda$3(final PlanHistoryListActivity this$0, GetPlanHistoryResult getPlanHistoryResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (getPlanHistoryResult != null) {
            List<PlanReport> list = getPlanHistoryResult.getList();
            if (list == null || list.isEmpty()) {
                FrameLayout contentRoot = ((in0) this$0.getMBinding()).A;
                Intrinsics.checkNotNullExpressionValue(contentRoot, "contentRoot");
                TipViewKt.addTipView$default(contentRoot, TipType.NO_DATA, false, new Function0() { // from class: tzh
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PlanHistoryListActivity.initView$lambda$3$lambda$1(this.f35217a);
                    }
                }, 4, null);
            } else {
                this$0.historyData.addAll(list);
                this$0.adapter.notifyDataSetChanged();
                this$0.nextKey = getPlanHistoryResult.getNextKey();
                boolean hasMore = getPlanHistoryResult.getHasMore();
                this$0.hasMore = hasMore;
                if (hasMore) {
                    MoreRecyclerView.setStatus$default(((in0) this$0.getMBinding()).B, Status.MORE, false, 2, null);
                } else {
                    MoreRecyclerView.setStatus$default(((in0) this$0.getMBinding()).B, Status.DONE, false, 2, null);
                }
                Unit unit = Unit.INSTANCE;
            }
        } else {
            FrameLayout contentRoot2 = ((in0) this$0.getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(contentRoot2, "contentRoot");
            TipViewKt.addTipView$default(contentRoot2, TipType.NO_NET, false, new Function0() { // from class: uzh
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PlanHistoryListActivity.initView$lambda$3$lambda$2(this.f36319a);
                }
            }, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$3$lambda$1(PlanHistoryListActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadData();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$3$lambda$2(PlanHistoryListActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadData();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void loadData() {
        PageState.DefaultImpls.showLoading$default(this, k1j.o1, false, 2, null);
        ((PlanHistoryListVM) getMViewModel()).getHistory(this.nextKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleDateFormat simpleDataFormat_delegate$lambda$0() {
        return new SimpleDateFormat(StringUtils.EXPECT_DATE_FORMAT, new Locale(LocaleUtil.getCurrentLocale()));
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jvi.y;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // com.xiaomi.fitness.training_plan.common.Hilt_PlanHistoryListActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DisplayUtil.setTranslucentStatusBar(this);
        setActionBarDisplayable(false);
        initView();
    }
}
