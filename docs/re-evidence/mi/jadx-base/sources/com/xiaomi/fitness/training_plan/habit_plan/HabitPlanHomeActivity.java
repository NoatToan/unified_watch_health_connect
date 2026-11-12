package com.xiaomi.fitness.training_plan.habit_plan;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.recyclerview.refresh.LoadAction;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.baseui.view.TipType;
import com.xiaomi.fitness.baseui.view.TipView;
import com.xiaomi.fitness.baseui.view.TipViewKt;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.training_plan.habit_plan.HabitPlanHomeActivity;
import com.xiaomi.fitness.training_plan_export.manager.ITrainingManager;
import com.xiaomi.fitness.training_plan_export.manager.TrainingManagerExtKt;
import com.xiaomi.fitness.training_plan_export.model.HabitDayPlan;
import com.xiaomi.fitness.training_plan_export.model.HabitPlan;
import com.xiaomi.fitness.training_plan_export.model.HabitPlanHome;
import com.xiaomi.fitness.training_plan_export.model.PlanModelsKt;
import com.xiaomi.fitness.training_plan_export.utils.TrainingEventUtils;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import defpackage.a4i;
import defpackage.csi;
import defpackage.hm0;
import defpackage.jvi;
import defpackage.k1j;
import defpackage.mhs;
import defpackage.rwi;
import defpackage.ze2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 :2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001:B\u0007¢\u0006\u0004\b9\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0006R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001dR\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010\u001dR\u0014\u00106\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00108\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00105¨\u0006;"}, d2 = {"Lcom/xiaomi/fitness/training_plan/habit_plan/HabitPlanHomeActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/training_plan/habit_plan/HabitPlanHomeVM;", "Lhm0;", "", "initRefreshTrigger", "()V", "initData", "initView", "", MedicalIdSPContract.PREF_FIRST, "loadData", "(Z)V", "checkImprove", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_START, LifecycleConstantKt.ON_STOP, "La4i;", "popupMenu", "La4i;", "", "Lcom/xiaomi/fitness/training_plan/habit_plan/HabitMedalData;", "medalList", "Ljava/util/List;", "", "improvePlanId", "J", "", "improveDayOfWeeks", "", "improveDistance", "F", "planId", "Lcom/xiaomi/fitness/training_plan_export/model/HabitPlan;", "habitPlan", "Lcom/xiaomi/fitness/training_plan_export/model/HabitPlan;", "Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncer;", "serverSyncer$delegate", "Lkotlin/Lazy;", "getServerSyncer", "()Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncer;", "serverSyncer", "Lmhs;", "refreshTrigger", "Lmhs;", "Lcom/xiaomi/fitness/baseui/view/TipView;", "errorTipView", "Lcom/xiaomi/fitness/baseui/view/TipView;", "pageVisibleStartTime", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HabitPlanHomeActivity extends BaseBindingActivity<HabitPlanHomeVM, hm0> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String KEY_PLAN_ID = "plan_id";

    @NotNull
    private static final String TAG = "HabitPlanHomeActivity";

    @Nullable
    private TipView errorTipView;

    @Nullable
    private HabitPlan habitPlan;
    private float improveDistance;
    private long improvePlanId;
    private long pageVisibleStartTime;
    private a4i popupMenu;

    @Nullable
    private mhs refreshTrigger;

    @NotNull
    private final List<HabitMedalData> medalList = new ArrayList();

    @NotNull
    private final List<Integer> improveDayOfWeeks = new ArrayList();
    private long planId = -1;

    /* JADX INFO: renamed from: serverSyncer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy serverSyncer = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: kgb
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HabitPlanHomeActivity.serverSyncer_delegate$lambda$0();
        }
    });

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/training_plan/habit_plan/HabitPlanHomeActivity$Companion;", "", "<init>", "()V", "TAG", "", "KEY_PLAN_ID", "launchHabitHomeActivity", "", "context", "Landroid/content/Context;", "planId", "", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void launchHabitHomeActivity$default(Companion companion, Context context, long j, int i, Object obj) {
            if ((i & 2) != 0) {
                j = 0;
            }
            companion.launchHabitHomeActivity(context, j);
        }

        public final void launchHabitHomeActivity(@NotNull Context context, long planId) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) HabitPlanHomeActivity.class);
            intent.putExtra("plan_id", planId);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ HabitPlanHomeVM access$getMViewModel(HabitPlanHomeActivity habitPlanHomeActivity) {
        return (HabitPlanHomeVM) habitPlanHomeActivity.getMViewModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void checkImprove() {
        ((HabitPlanHomeVM) getMViewModel()).checkHabitTrainImprove();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FitnessServerSyncer getServerSyncer() {
        return (FitnessServerSyncer) this.serverSyncer.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initData() {
        this.planId = getIntent().getLongExtra("plan_id", -1L);
        ((HabitPlanHomeVM) getMViewModel()).getHabitPlanHomeDetailLiveData().observe(this, new HabitPlanHomeActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: fgb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HabitPlanHomeActivity.initData$lambda$5(this.f17758a, (HabitPlanHome) obj);
            }
        }));
        ((HabitPlanHomeVM) getMViewModel()).getHabitPlanImproveLiveData().observe(this, new HabitPlanHomeActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: hgb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HabitPlanHomeActivity.initData$lambda$8(this.f20041a, (HabitPlan) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initData$lambda$5(final HabitPlanHomeActivity this$0, HabitPlanHome habitPlanHome) {
        ze2.b bVarF;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (this$0.errorTipView != null) {
            this$0.getMBinding().B.removeView(this$0.errorTipView);
        }
        if (habitPlanHome == null) {
            FrameLayout root = this$0.getMBinding().B;
            Intrinsics.checkNotNullExpressionValue(root, "root");
            this$0.errorTipView = TipViewKt.addTipView(root, TipType.NO_NET, false, new Function0() { // from class: igb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HabitPlanHomeActivity.initData$lambda$5$lambda$4$lambda$3(this.f21113a);
                }
            });
        } else {
            if (PlanModelsKt.isFinished(habitPlanHome)) {
                ToastUtil.INSTANCE.showToast(k1j.j1);
                this$0.finish();
                return Unit.INSTANCE;
            }
            this$0.habitPlan = habitPlanHome.getHabitPlan();
            mhs mhsVar = this$0.refreshTrigger;
            if (mhsVar != null && (bVarF = mhsVar.f()) != null) {
                bVarF.notifyLoadComplete();
            }
            this$0.getMBinding().E.renderSummary(habitPlanHome.getSummary());
            this$0.getMBinding().E.renderMedal(habitPlanHome.getSummary().getFinishedTrainingTimes());
            this$0.getMBinding().G.render(habitPlanHome.getPlanToday());
            this$0.getMBinding().F.render(habitPlanHome.getPlanFuture());
            this$0.planId = habitPlanHome.getPlanToday().getPlanId();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initData$lambda$5$lambda$4$lambda$3(HabitPlanHomeActivity this_run) {
        Intrinsics.checkNotNullParameter(this_run, "$this_run");
        this_run.loadData(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initData$lambda$8(HabitPlanHomeActivity this$0, HabitPlan habitPlan) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (habitPlan != null) {
            ConstraintLayout trainImprove = this$0.getMBinding().I;
            Intrinsics.checkNotNullExpressionValue(trainImprove, "trainImprove");
            ViewExtKt.visible(trainImprove);
            this$0.improvePlanId = habitPlan.getId();
            this$0.improveDayOfWeeks.clear();
            this$0.improveDayOfWeeks.addAll(habitPlan.getDayOfWeek());
            this$0.improveDistance = habitPlan.getDistance();
        } else {
            ConstraintLayout trainImprove2 = this$0.getMBinding().I;
            Intrinsics.checkNotNullExpressionValue(trainImprove2, "trainImprove");
            ViewExtKt.gone(trainImprove2);
        }
        return Unit.INSTANCE;
    }

    private final void initRefreshTrigger() {
        this.refreshTrigger = new mhs(this);
        int i = k1j.h;
        int i2 = k1j.l;
        LoadAction loadAction = new LoadAction(ExtUtilsKt.getDp(34), new int[]{i, i2, i2, k1j.i}, new Function0() { // from class: jgb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HabitPlanHomeActivity.initRefreshTrigger$lambda$1(this.f22765a);
            }
        });
        mhs mhsVar = this.refreshTrigger;
        if (mhsVar != null) {
            mhsVar.d(loadAction);
        }
        mhs mhsVar2 = this.refreshTrigger;
        if (mhsVar2 != null) {
            mhsVar2.M(getMBinding().C);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initRefreshTrigger$lambda$1(HabitPlanHomeActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        loadData$default(this$0, false, 1, null);
        Logger.i(TAG, "loadAction triggerDataSync running");
        return Unit.INSTANCE;
    }

    private final void initView() {
        getMBinding().E.renderMedal(1);
        getMBinding().D.setTitle(k1j.c1);
        a4i a4iVar = new a4i(this, getMBinding().D.findViewById(csi.M1));
        this.popupMenu = a4iVar;
        a4iVar.f(rwi.f32972a);
        a4i a4iVar2 = this.popupMenu;
        if (a4iVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupMenu");
            a4iVar2 = null;
        }
        a4iVar2.setOnMenuItemClickListener(new a4i.c() { // from class: lgb
            @Override // a4i.c
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return HabitPlanHomeActivity.initView$lambda$9(this.f25036a, menuItem);
            }
        });
        getMBinding().D.setMoreClickListener(new View.OnClickListener() { // from class: mgb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HabitPlanHomeActivity.initView$lambda$10(this.f26136a, view);
            }
        });
        getMBinding().J.setOnClickListener(new View.OnClickListener() { // from class: ngb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HabitPlanHomeActivity.initView$lambda$11(this.f27904a, view);
            }
        });
        getMBinding().E.getAllRecordTV().setOnClickListener(new View.OnClickListener() { // from class: ogb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HabitPlanHomeActivity.initView$lambda$12(this.f29136a, view);
            }
        });
        getMBinding().H.setOnClickListener(new View.OnClickListener() { // from class: pgb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HabitPlanHomeActivity.initView$lambda$14(this.f30369a, view);
            }
        });
        loadData(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$10(HabitPlanHomeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a4i a4iVar = this$0.popupMenu;
        if (a4iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupMenu");
            a4iVar = null;
        }
        a4iVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initView$lambda$11(HabitPlanHomeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ConstraintLayout trainImprove = this$0.getMBinding().I;
        Intrinsics.checkNotNullExpressionValue(trainImprove, "trainImprove");
        ViewExtKt.setVisible(trainImprove, false);
        ((HabitPlanHomeVM) this$0.getMViewModel()).closeHabitImproveReply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$12(HabitPlanHomeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        HabitPlanHistoryRecordListActivity.INSTANCE.launch(this$0, this$0.planId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$14(final HabitPlanHomeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        HabitPlanSuggestActivity.INSTANCE.launchFromImprove(this$0, this$0.improvePlanId, this$0.improveDayOfWeeks, this$0.improveDistance, new Function2() { // from class: ggb
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return HabitPlanHomeActivity.initView$lambda$14$lambda$13(this.f18949a, ((Integer) obj).intValue(), (Intent) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$14$lambda$13(HabitPlanHomeActivity this$0, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.checkImprove();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean initView$lambda$9(HabitPlanHomeActivity this$0, MenuItem menuItem) {
        HabitDayPlan planToday;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int itemId = menuItem.getItemId();
        if (itemId == csi.f2) {
            HabitPlanDetailActivity.INSTANCE.launchHabitDetailActivity(this$0);
            return true;
        }
        if (itemId == csi.g2) {
            TrainingEventUtils.INSTANCE.trackPlanSetting();
            HabitPlanHome value = ((HabitPlanHomeVM) this$0.getMViewModel()).getHabitPlanHomeDetailLiveData().getValue();
            if (((value == null || (planToday = value.getPlanToday()) == null) ? null : Long.valueOf(planToday.getPlanId())) == null) {
                return true;
            }
            ITrainingManager trainingManagerExtKt = TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE);
            HabitPlanHome value2 = ((HabitPlanHomeVM) this$0.getMViewModel()).getHabitPlanHomeDetailLiveData().getValue();
            Intrinsics.checkNotNull(value2);
            trainingManagerExtKt.gotoHabitPlanSettingPage(this$0, value2.getPlanToday().getPlanId(), this$0.habitPlan);
            return true;
        }
        if (itemId != csi.h2) {
            return true;
        }
        TrainingEventUtils.INSTANCE.trackPlanStop();
        CommonDialog commonDialogCreate = new CommonDialog.c("finish plan").setDialogTitle(k1j.E1).setDialogDescription(k1j.D1).setPositiveText(k1j.g).setNegativeText(k1j.f).create();
        if (commonDialogCreate != null) {
            commonDialogCreate.setCancelable(false);
        }
        if (commonDialogCreate != null) {
            commonDialogCreate.addDialogCallback(new HabitPlanHomeActivity$initView$1$1(this$0));
        }
        if (commonDialogCreate == null) {
            return true;
        }
        commonDialogCreate.showIfNeed(this$0.getSupportFragmentManager());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadData(boolean first) {
        if (first) {
            PageState.DefaultImpls.showLoading$default(this, k1j.o1, false, 2, null);
        }
        ((HabitPlanHomeVM) getMViewModel()).getHabitPlanHomeDetail(this.planId);
        checkImprove();
    }

    public static /* synthetic */ void loadData$default(HabitPlanHomeActivity habitPlanHomeActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        habitPlanHomeActivity.loadData(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessServerSyncer serverSyncer_delegate$lambda$0() {
        return FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jvi.u;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DisplayUtil.setTranslucentStatusBar(this);
        setActionBarDisplayable(false);
        initData();
        initRefreshTrigger();
        initView();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.pageVisibleStartTime = System.currentTimeMillis();
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        TrainingEventUtils.INSTANCE.trackPlanDetailView(1, (System.currentTimeMillis() - this.pageVisibleStartTime) / ((long) 1000));
    }
}
