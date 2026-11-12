package com.xiaomi.fitness.training_plan.habit_plan;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.baseui.view.TipType;
import com.xiaomi.fitness.baseui.view.TipViewKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.training_plan.habit_plan.HabitPlanDetailActivity;
import com.xiaomi.fitness.training_plan.util.CalendarUtilsKt;
import com.xiaomi.fitness.training_plan_export.model.HabitPlan;
import com.xiaomi.fitness.training_plan_export.widget.TrainingCalendarItem;
import defpackage.bm0;
import defpackage.csi;
import defpackage.cyi;
import defpackage.jvi;
import defpackage.k1j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0013\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/training_plan/habit_plan/HabitPlanDetailActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/training_plan/habit_plan/HabitPlanDetailVM;", "Lbm0;", "", "initView", "()V", "loadData", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "HabitDayPlanHolder", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HabitPlanDetailActivity extends Hilt_HabitPlanDetailActivity<HabitPlanDetailVM, bm0> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "HabitPlanDetailActivity";

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/training_plan/habit_plan/HabitPlanDetailActivity$Companion;", "", "<init>", "()V", "TAG", "", "launchHabitDetailActivity", "", "context", "Landroid/app/Activity;", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launchHabitDetailActivity(@NotNull Activity context) {
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) HabitPlanDetailActivity.class));
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/training_plan/habit_plan/HabitPlanDetailActivity$HabitDayPlanHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/TextView;", "dayOfWeek", "Landroid/widget/TextView;", "getDayOfWeek", "()Landroid/widget/TextView;", "Landroid/widget/FrameLayout;", "container", "Landroid/widget/FrameLayout;", "getContainer", "()Landroid/widget/FrameLayout;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/training_plan/habit_plan/HabitPlanDetailActivity;Landroid/view/View;)V", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class HabitDayPlanHolder extends RecyclerView.d0 {

        @NotNull
        private final FrameLayout container;

        @NotNull
        private final TextView dayOfWeek;
        final /* synthetic */ HabitPlanDetailActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HabitDayPlanHolder(@NotNull HabitPlanDetailActivity habitPlanDetailActivity, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = habitPlanDetailActivity;
            View viewFindViewById = itemView.findViewById(csi.U);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.dayOfWeek = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(csi.A);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.container = (FrameLayout) viewFindViewById2;
        }

        @NotNull
        public final FrameLayout getContainer() {
            return this.container;
        }

        @NotNull
        public final TextView getDayOfWeek() {
            return this.dayOfWeek;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        ((bm0) getMBinding()).D.setText(ResourceExtKt.getQuantityString(this, cyi.p, 0, 0));
        ((bm0) getMBinding()).G.setText(ResourceExtKt.getQuantityString(this, cyi.q, 0, 0));
        ((HabitPlanDetailVM) getMViewModel()).getHabitData().observe(this, new HabitPlanDetailActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: sfb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HabitPlanDetailActivity.initView$lambda$1(this.f33586a, (HabitPlan) obj);
            }
        }));
        loadData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initView$lambda$1(final HabitPlanDetailActivity this$0, final HabitPlan habitPlan) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (habitPlan != null) {
            ((bm0) this$0.getMBinding()).B.setText(String.valueOf(habitPlan.getDayOfWeek().size()));
            ((bm0) this$0.getMBinding()).D.setText(ResourceExtKt.getQuantityString(this$0, cyi.p, habitPlan.getDayOfWeek().size(), Integer.valueOf(habitPlan.getDayOfWeek().size())));
            ((bm0) this$0.getMBinding()).E.setText(String.valueOf(habitPlan.getDistance()));
            ((bm0) this$0.getMBinding()).G.setText(ResourceExtKt.getQuantityString(this$0, cyi.q, (int) habitPlan.getDistance(), Float.valueOf(habitPlan.getDistance())));
            ((bm0) this$0.getMBinding()).I.setAdapter(new RecyclerView.Adapter<HabitDayPlanHolder>() { // from class: com.xiaomi.fitness.training_plan.habit_plan.HabitPlanDetailActivity$initView$1$1
                @Override // androidx.recyclerview.widget.RecyclerView.Adapter
                public int getItemCount() {
                    return 7;
                }

                @Override // androidx.recyclerview.widget.RecyclerView.Adapter
                public void onBindViewHolder(HabitPlanDetailActivity.HabitDayPlanHolder holder, int position) {
                    Intrinsics.checkNotNullParameter(holder, "holder");
                    int i = position + 1;
                    holder.getDayOfWeek().setText(CalendarUtilsKt.getDayOfWeekStr(this.this$0, i));
                    holder.getContainer().removeAllViews();
                    FrameLayout container = holder.getContainer();
                    TrainingCalendarItem trainingCalendarItem = new TrainingCalendarItem(this.this$0, 1, 0L, true, false, null, 52, null);
                    HabitPlan habitPlan2 = habitPlan;
                    trainingCalendarItem.showHabitDayPlan(i, habitPlan2.getDistance(), !habitPlan2.getDayOfWeek().contains(Integer.valueOf(i)));
                    container.addView(trainingCalendarItem, new FrameLayout.LayoutParams(-1, ExtUtilsKt.getDp(70)));
                }

                @Override // androidx.recyclerview.widget.RecyclerView.Adapter
                public HabitPlanDetailActivity.HabitDayPlanHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                    Intrinsics.checkNotNullParameter(parent, "parent");
                    View viewInflate = LayoutInflater.from(this.this$0).inflate(jvi.G, (ViewGroup) null);
                    HabitPlanDetailActivity habitPlanDetailActivity = this.this$0;
                    Intrinsics.checkNotNull(viewInflate);
                    return new HabitPlanDetailActivity.HabitDayPlanHolder(habitPlanDetailActivity, viewInflate);
                }
            });
            ((bm0) this$0.getMBinding()).I.setLayoutManager(new LinearLayoutManager(this$0));
            ((bm0) this$0.getMBinding()).I.addItemDecoration(new RecyclerView.n() { // from class: com.xiaomi.fitness.training_plan.habit_plan.HabitPlanDetailActivity$initView$1$2
                @Override // androidx.recyclerview.widget.RecyclerView.n
                public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.z state) {
                    Intrinsics.checkNotNullParameter(outRect, "outRect");
                    Intrinsics.checkNotNullParameter(view, "view");
                    Intrinsics.checkNotNullParameter(parent, "parent");
                    Intrinsics.checkNotNullParameter(state, "state");
                    outRect.bottom = ExtUtilsKt.getDp(12);
                }
            });
        } else {
            FrameLayout contentRoot = ((bm0) this$0.getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(contentRoot, "contentRoot");
            TipViewKt.addTipView$default(contentRoot, TipType.NO_NET, false, new Function0() { // from class: tfb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HabitPlanDetailActivity.initView$lambda$1$lambda$0(this.f34641a);
                }
            }, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$1$lambda$0(HabitPlanDetailActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadData();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadData() {
        PageState.DefaultImpls.showLoading$default(this, k1j.o1, false, 2, null);
        ((HabitPlanDetailVM) getMViewModel()).getHabitPlanDetail();
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jvi.f23187r;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.training_plan.habit_plan.Hilt_HabitPlanDetailActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DisplayUtil.setTranslucentStatusBar(this);
        setActionBarDisplayable(false);
        ((bm0) getMBinding()).J.hideMore();
        ((bm0) getMBinding()).J.setTitle(k1j.A0);
        initView();
    }
}
