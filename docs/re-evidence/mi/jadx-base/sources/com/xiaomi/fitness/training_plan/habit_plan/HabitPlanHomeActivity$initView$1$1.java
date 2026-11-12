package com.xiaomi.fitness.training_plan.habit_plan;

import android.content.DialogInterface;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.training_plan.habit_plan.HabitPlanHomeActivity$initView$1$1;
import com.xiaomi.fitness.training_plan.report.TrainPlanReportFragment;
import com.xiaomi.fitness.training_plan_export.manager.ITrainingManager;
import com.xiaomi.fitness.training_plan_export.manager.TrainingManagerExtKt;
import defpackage.av6;
import defpackage.k1j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/training_plan/habit_plan/HabitPlanHomeActivity$initView$1$1", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HabitPlanHomeActivity$initView$1$1 extends av6 {
    final /* synthetic */ HabitPlanHomeActivity this$0;

    public HabitPlanHomeActivity$initView$1$1(HabitPlanHomeActivity habitPlanHomeActivity) {
        this.this$0 = habitPlanHomeActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDialogClick$lambda$0(HabitPlanHomeActivity this$0, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getServerSyncer().deleteCurDataByPlanId(0L);
        ToastUtil.showToast(this$0.getString(z ? k1j.i1 : k1j.B0));
        TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE).clearTrainingPlanSettings();
        if (z && z2) {
            TrainPlanReportFragment.INSTANCE.launch(this$0, 1, this$0.planId);
        }
        if (z) {
            this$0.finish();
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.av6
    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
        if (which == -1) {
            HabitPlanHomeVM habitPlanHomeVMAccess$getMViewModel = HabitPlanHomeActivity.access$getMViewModel(this.this$0);
            final HabitPlanHomeActivity habitPlanHomeActivity = this.this$0;
            habitPlanHomeVMAccess$getMViewModel.terminateCurrentPlan(new Function2() { // from class: qgb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HabitPlanHomeActivity$initView$1$1.onDialogClick$lambda$0(habitPlanHomeActivity, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
                }
            });
        }
        if (which != -2 || dialog == null) {
            return;
        }
        dialog.dismiss();
    }
}
