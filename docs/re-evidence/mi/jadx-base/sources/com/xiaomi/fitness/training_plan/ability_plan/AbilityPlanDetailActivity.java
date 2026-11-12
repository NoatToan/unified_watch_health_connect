package com.xiaomi.fitness.training_plan.ability_plan;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.baseui.recyclerview.refresh.LoadAction;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.baseui.view.TipType;
import com.xiaomi.fitness.baseui.view.TipView;
import com.xiaomi.fitness.baseui.view.TipViewKt;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.device.manager.internal.extetions.LogExtKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.training_plan.ability_plan.AbilityPlanDetailActivity;
import com.xiaomi.fitness.training_plan.common.PlanCourseListActivity;
import com.xiaomi.fitness.training_plan.net.StopAbilityPlanResult;
import com.xiaomi.fitness.training_plan.report.TrainPlanReportFragment;
import com.xiaomi.fitness.training_plan.widget.AbilityMedalProgressLayout;
import com.xiaomi.fitness.training_plan.widget.AbilityMedalProgressLayoutTablet;
import com.xiaomi.fitness.training_plan.widget.AbilitySummaryLayout;
import com.xiaomi.fitness.training_plan_export.manager.ITrainingManager;
import com.xiaomi.fitness.training_plan_export.manager.TrainingManagerExtKt;
import com.xiaomi.fitness.training_plan_export.model.AbilityDetailSummary;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlan;
import com.xiaomi.fitness.training_plan_export.model.PlanModelsKt;
import com.xiaomi.fitness.training_plan_export.utils.DialogUtils;
import com.xiaomi.fitness.training_plan_export.utils.TrainingEventUtils;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.a4i;
import defpackage.csi;
import defpackage.jvi;
import defpackage.k1j;
import defpackage.mhs;
import defpackage.pg0;
import defpackage.rwi;
import defpackage.ze2;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 ;2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001;B\u0007¢\u0006\u0004\b:\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0006R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00107\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00109\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00106¨\u0006<"}, d2 = {"Lcom/xiaomi/fitness/training_plan/ability_plan/AbilityPlanDetailActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/training_plan/ability_plan/PlanDetailViewModel;", "Lpg0;", "", "initView", "()V", "initRefreshTrigger", "", MedicalIdSPContract.PREF_FIRST, "loadData", "(Z)V", "", BroadcastsKt.SILENT_PUSHING_PROGRESS, "handleProgress", "(F)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_START, LifecycleConstantKt.ON_STOP, "La4i;", "popupMenu", "La4i;", "", "planId", "Ljava/lang/Long;", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityDetailSummary;", "abilitySummary", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityDetailSummary;", "Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncer;", "serverSyncer$delegate", "Lkotlin/Lazy;", "getServerSyncer", "()Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncer;", "serverSyncer", "Lmhs;", "refreshTrigger", "Lmhs;", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlan;", "abilityPlan", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlan;", "", "curProgress", "I", "Lcom/xiaomi/fitness/baseui/view/TipView;", "errorTipView", "Lcom/xiaomi/fitness/baseui/view/TipView;", "medalWHRation", "F", "pageVisibleStartTime", "J", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AbilityPlanDetailActivity extends Hilt_AbilityPlanDetailActivity<PlanDetailViewModel, pg0> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String KEY_ABILITY_PLAN_ID = "key_ability_plan_id";

    @NotNull
    private static final String TAG = "AbilityPlanDetailActivity";

    @Nullable
    private AbilityPlan abilityPlan;

    @Nullable
    private AbilityDetailSummary abilitySummary;

    @Nullable
    private TipView errorTipView;
    private long pageVisibleStartTime;
    private a4i popupMenu;

    @Nullable
    private mhs refreshTrigger;

    @Nullable
    private Long planId = -1L;

    /* JADX INFO: renamed from: serverSyncer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy serverSyncer = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: zi
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbilityPlanDetailActivity.serverSyncer_delegate$lambda$0();
        }
    });
    private int curProgress = -1;
    private final float medalWHRation = 1.38f;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/training_plan/ability_plan/AbilityPlanDetailActivity$Companion;", "", "<init>", "()V", "KEY_ABILITY_PLAN_ID", "", "TAG", "launchWithPlanId", "", "context", "Landroid/content/Context;", "planId", "", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launchWithPlanId(@NotNull Context context, long planId) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) AbilityPlanDetailActivity.class);
            intent.putExtra(AbilityPlanDetailActivity.KEY_ABILITY_PLAN_ID, planId);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        }
    }

    private final FitnessServerSyncer getServerSyncer() {
        return (FitnessServerSyncer) this.serverSyncer.getValue();
    }

    private final void handleProgress(float progress) {
        int i = (int) (progress * 100);
        if (i < 0) {
            this.curProgress = 0;
        } else if (i > 100) {
            this.curProgress = 100;
        } else {
            this.curProgress = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initRefreshTrigger() {
        this.refreshTrigger = new mhs(this);
        int i = k1j.h;
        int i2 = k1j.l;
        LoadAction loadAction = new LoadAction(ExtUtilsKt.getDp(34), new int[]{i, i2, i2, k1j.i}, new Function0() { // from class: rj
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbilityPlanDetailActivity.initRefreshTrigger$lambda$10(this.f32590a);
            }
        });
        mhs mhsVar = this.refreshTrigger;
        if (mhsVar != null) {
            mhsVar.d(loadAction);
        }
        mhs mhsVar2 = this.refreshTrigger;
        if (mhsVar2 != null) {
            mhsVar2.M(((pg0) getMBinding()).H);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initRefreshTrigger$lambda$10(AbilityPlanDetailActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        loadData$default(this$0, false, 1, null);
        Logger.i(TAG, "loadAction triggerDataSync running");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        initRefreshTrigger();
        a4i a4iVar = new a4i(this, ((pg0) getMBinding()).I.findViewById(csi.M1));
        this.popupMenu = a4iVar;
        a4iVar.f(rwi.f32972a);
        a4i a4iVar2 = this.popupMenu;
        if (a4iVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupMenu");
            a4iVar2 = null;
        }
        a4iVar2.setOnMenuItemClickListener(new a4i.c() { // from class: tj
            @Override // a4i.c
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return AbilityPlanDetailActivity.initView$lambda$5(this.f34754a, menuItem);
            }
        });
        ((pg0) getMBinding()).I.setMoreClickListener(new View.OnClickListener() { // from class: fk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbilityPlanDetailActivity.initView$lambda$6(this.f17859a, view);
            }
        });
        ((PlanDetailViewModel) getMViewModel()).getStopResult().observe(this, new AbilityPlanDetailActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: nk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AbilityPlanDetailActivity.initView$lambda$7(this.f27999a, (StopAbilityPlanResult) obj);
            }
        }));
        ((PlanDetailViewModel) getMViewModel()).getSummaryData().observe(this, new AbilityPlanDetailActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: al
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AbilityPlanDetailActivity.initView$lambda$9(this.f1154a, (AbilityDetailSummary) obj);
            }
        }));
        loadData(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initView$lambda$5(final AbilityPlanDetailActivity this$0, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int itemId = menuItem.getItemId();
        if (itemId == csi.f2) {
            PlanCourseListActivity.INSTANCE.launch(this$0, this$0.abilitySummary);
            return true;
        }
        if (itemId == csi.g2) {
            TrainingEventUtils.INSTANCE.trackPlanSetting();
            AbilityPlan abilityPlan = this$0.abilityPlan;
            if (abilityPlan != null) {
                TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE).gotoAbilityPlanSettingPage(this$0, abilityPlan.getPlanId(), this$0.abilityPlan);
                return true;
            }
            Logger.i(TAG, "can not goto setting with empty abilityPlan!!");
            return true;
        }
        if (itemId != csi.h2) {
            return true;
        }
        TrainingEventUtils.INSTANCE.trackPlanStop();
        DialogUtils dialogUtils = DialogUtils.INSTANCE;
        DialogUtils.DialogBuilder dialogBuilder = new DialogUtils.DialogBuilder();
        dialogBuilder.setTitleRes(Integer.valueOf(k1j.B1));
        dialogBuilder.setMessage(this$0.getString(k1j.C1));
        dialogBuilder.setPositiveClickListener(new Function1() { // from class: ti
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AbilityPlanDetailActivity.initView$lambda$5$lambda$4$lambda$3(this.f34722a, (DialogInterface) obj);
            }
        });
        Unit unit = Unit.INSTANCE;
        dialogUtils.showTipDialog(this$0, dialogBuilder);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initView$lambda$5$lambda$4$lambda$3(AbilityPlanDetailActivity this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PageState.DefaultImpls.showLoading$default(this$0, k1j.o1, false, 2, null);
        ((PlanDetailViewModel) this$0.getMViewModel()).stopPlan();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$6(AbilityPlanDetailActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a4i a4iVar = this$0.popupMenu;
        if (a4iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupMenu");
            a4iVar = null;
        }
        a4iVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$7(AbilityPlanDetailActivity this$0, StopAbilityPlanResult stopAbilityPlanResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        FitnessServerSyncer serverSyncer = this$0.getServerSyncer();
        Long l = this$0.planId;
        Intrinsics.checkNotNull(l);
        serverSyncer.deleteCurDataByPlanId(l.longValue());
        if (stopAbilityPlanResult != null) {
            if (stopAbilityPlanResult.getWithReport()) {
                TrainingEventUtils.INSTANCE.trackPlanStopped(2, this$0.curProgress, 2);
                TrainPlanReportFragment.Companion companion = TrainPlanReportFragment.INSTANCE;
                Long l2 = this$0.planId;
                Intrinsics.checkNotNull(l2);
                companion.launch(this$0, 2, l2.longValue());
            } else {
                TrainingEventUtils.INSTANCE.trackPlanStopped(2, this$0.curProgress, 1);
            }
            TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE).clearTrainingPlanSettings();
            ToastUtil.showToast(this$0.getString(k1j.i1));
            this$0.finish();
        } else {
            ToastUtil.INSTANCE.showToast(k1j.B0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initView$lambda$9(final AbilityPlanDetailActivity this$0, AbilityDetailSummary abilityDetailSummary) {
        ze2.b bVarF;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (this$0.errorTipView != null) {
            ((pg0) this$0.getMBinding()).G.removeView(this$0.errorTipView);
        }
        mhs mhsVar = this$0.refreshTrigger;
        if (mhsVar != null && (bVarF = mhsVar.f()) != null) {
            bVarF.notifyLoadComplete();
        }
        if (abilityDetailSummary == null) {
            FrameLayout root = ((pg0) this$0.getMBinding()).G;
            Intrinsics.checkNotNullExpressionValue(root, "root");
            this$0.errorTipView = TipViewKt.addTipView(root, TipType.NO_NET, false, new Function0() { // from class: ui
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbilityPlanDetailActivity.initView$lambda$9$lambda$8(this.f35777a);
                }
            });
        } else {
            if (PlanModelsKt.isFinished(abilityDetailSummary)) {
                ToastUtil.INSTANCE.showToast(k1j.j1);
                this$0.finish();
                return Unit.INSTANCE;
            }
            this$0.abilitySummary = abilityDetailSummary;
            this$0.handleProgress(abilityDetailSummary.getSummary().getProgress());
            ((pg0) this$0.getMBinding()).A.refreshData(new AbilitySummaryLayout.AbilitySummary(this$0.curProgress, abilityDetailSummary.getSummary().getTodayCount(), abilityDetailSummary.getPlans().size(), abilityDetailSummary.getSummary().getTotalDuration(), abilityDetailSummary.getSummary().getTotalDistance(), abilityDetailSummary.getSummary().getTotalCalorie()));
            Long l = this$0.planId;
            Intrinsics.checkNotNull(l);
            AbilityPlan abilityPlan = new AbilityPlan(l.longValue(), abilityDetailSummary.getPlans(), null, null, null, null, 60, null);
            this$0.abilityPlan = abilityPlan;
            FragmentAbilityCalendar.Companion companion = FragmentAbilityCalendar.INSTANCE;
            int i = csi.d2;
            Intrinsics.checkNotNull(abilityPlan);
            companion.showAbilityPlanCalendar(i, abilityPlan, this$0.getSupportFragmentManager());
            if (UIUtils.INSTANCE.isTablet()) {
                AbilityMedalProgressLayout medalInfoLayout = ((pg0) this$0.getMBinding()).D;
                Intrinsics.checkNotNullExpressionValue(medalInfoLayout, "medalInfoLayout");
                ViewExtKt.gone(medalInfoLayout);
                AbilityMedalProgressLayoutTablet medalInfoLayoutTablet = ((pg0) this$0.getMBinding()).E;
                Intrinsics.checkNotNullExpressionValue(medalInfoLayoutTablet, "medalInfoLayoutTablet");
                ViewExtKt.visible(medalInfoLayoutTablet);
                ((pg0) this$0.getMBinding()).E.bind(abilityDetailSummary.getSummary().getFinishedTrainingTimes());
            } else {
                AbilityMedalProgressLayout medalInfoLayout2 = ((pg0) this$0.getMBinding()).D;
                Intrinsics.checkNotNullExpressionValue(medalInfoLayout2, "medalInfoLayout");
                ViewExtKt.visible(medalInfoLayout2);
                AbilityMedalProgressLayoutTablet medalInfoLayoutTablet2 = ((pg0) this$0.getMBinding()).E;
                Intrinsics.checkNotNullExpressionValue(medalInfoLayoutTablet2, "medalInfoLayoutTablet");
                ViewExtKt.gone(medalInfoLayoutTablet2);
                ((pg0) this$0.getMBinding()).D.render(abilityDetailSummary.getSummary().getFinishedTrainingTimes());
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$9$lambda$8(AbilityPlanDetailActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadData(true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadData(boolean first) {
        if (first) {
            showLoading(k1j.o1, false);
        }
        PlanDetailViewModel planDetailViewModel = (PlanDetailViewModel) getMViewModel();
        Long l = this.planId;
        Intrinsics.checkNotNull(l);
        planDetailViewModel.getPlanDetail(l.longValue());
    }

    public static /* synthetic */ void loadData$default(AbilityPlanDetailActivity abilityPlanDetailActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        abilityPlanDetailActivity.loadData(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessServerSyncer serverSyncer_delegate$lambda$0() {
        return FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jvi.m;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.training_plan.ability_plan.Hilt_AbilityPlanDetailActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DisplayUtil.setTranslucentStatusBar(this);
        setActionBarDisplayable(false);
        ((pg0) getMBinding()).I.setTitle(k1j.q0);
        Bundle extras = getIntent().getExtras();
        Long lValueOf = extras != null ? Long.valueOf(extras.getLong(KEY_ABILITY_PLAN_ID, -1L)) : null;
        this.planId = lValueOf;
        if (lValueOf == null || (lValueOf != null && lValueOf.longValue() == -1)) {
            LogExtKt.loge(TAG, "can init AbilityPlanDetailActivity with empty planId!!!");
            finish();
        }
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
        TrainingEventUtils.INSTANCE.trackPlanDetailView(2, (System.currentTimeMillis() - this.pageVisibleStartTime) / ((long) 1000));
    }
}
