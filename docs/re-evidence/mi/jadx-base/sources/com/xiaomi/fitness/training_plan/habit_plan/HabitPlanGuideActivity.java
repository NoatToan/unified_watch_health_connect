package com.xiaomi.fitness.training_plan.habit_plan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.training_plan.adapter.HabitMedalAdapter;
import com.xiaomi.fitness.training_plan.habit_plan.HabitPlanGuideActivity;
import com.xiaomi.fitness.training_plan.util.CalendarUtils;
import com.xiaomi.fitness.training_plan.util.TrainingSportUtils;
import com.xiaomi.fitness.training_plan.widget.HabitLaunchSportDialog;
import com.xiaomi.fitness.training_plan_export.model.HabitDayPlan;
import defpackage.cyi;
import defpackage.dm0;
import defpackage.ioi;
import defpackage.jvi;
import defpackage.k1j;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001!B\u0007¢\u0006\u0004\b \u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\f\u0010\u0006R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001c¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/training_plan/habit_plan/HabitPlanGuideActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/training_plan/habit_plan/HabitPlanGuideVM;", "Ldm0;", "", "initData", "()V", "initView", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_DESTROY, "Lcom/xiaomi/fitness/training_plan/adapter/HabitMedalAdapter;", "medalAdapter", "Lcom/xiaomi/fitness/training_plan/adapter/HabitMedalAdapter;", "getMedalAdapter", "()Lcom/xiaomi/fitness/training_plan/adapter/HabitMedalAdapter;", "setMedalAdapter", "(Lcom/xiaomi/fitness/training_plan/adapter/HabitMedalAdapter;)V", "", "Lcom/xiaomi/fitness/training_plan/habit_plan/HabitMedalData;", "medalList", "Ljava/util/List;", "getMedalList", "()Ljava/util/List;", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HabitPlanGuideActivity extends BaseBindingActivity<HabitPlanGuideVM, dm0> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "HabitPlanGuideActivity";

    @Nullable
    private HabitMedalAdapter medalAdapter;

    @NotNull
    private final List<HabitMedalData> medalList = new ArrayList();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/training_plan/habit_plan/HabitPlanGuideActivity$Companion;", "", "<init>", "()V", "TAG", "", "launchHabitGuideActivity", "", "context", "Landroid/app/Activity;", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launchHabitGuideActivity(@NotNull Activity context) {
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) HabitPlanGuideActivity.class));
        }
    }

    private final void initData() {
        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                List<HabitMedalData> list = this.medalList;
                String string = getString(k1j.K0);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                list.add(new HabitMedalData(true, false, string, ioi.B));
            } else {
                this.medalList.add(new HabitMedalData(false, false, ResourceExtKt.getQuantityString(this, cyi.t, i, Integer.valueOf(i)), ioi.H));
            }
        }
    }

    private final void initView() {
        this.medalAdapter = new HabitMedalAdapter(this.medalList);
        getMBinding().A.setAdapter(this.medalAdapter);
        getMBinding().B.setOnClickListener(new View.OnClickListener() { // from class: yfb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HabitPlanGuideActivity.initView$lambda$3(this.f40127a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3(final HabitPlanGuideActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        HabitLaunchSportDialog.INSTANCE.defaultBuilder("first_habit_train_to_sport").create().setOutdoorRunClickListener(new Function0() { // from class: vfb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HabitPlanGuideActivity.initView$lambda$3$lambda$0(this.f36842a);
            }
        }).setWalkClickListener(new Function0() { // from class: wfb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HabitPlanGuideActivity.initView$lambda$3$lambda$1(this.f37916a);
            }
        }).setIndoorRunClickListener(new Function0() { // from class: xfb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HabitPlanGuideActivity.initView$lambda$3$lambda$2(this.f39064a);
            }
        }).showIfNeed(this$0.getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$3$lambda$0(HabitPlanGuideActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TrainingSportUtils.INSTANCE.startHabitTrainingSport(this$0, 1, new HabitDayPlan(10001L, false, 0.1f, System.currentTimeMillis() / ((long) 1000), CalendarUtils.INSTANCE.calcDayOfWeek(new Date()), 2, null, true, 66, null));
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$3$lambda$1(HabitPlanGuideActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TrainingSportUtils.INSTANCE.startHabitTrainingSport(this$0, 2, new HabitDayPlan(10001L, false, 0.1f, System.currentTimeMillis() / ((long) 1000), CalendarUtils.INSTANCE.calcDayOfWeek(new Date()), 2, null, true, 66, null));
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$3$lambda$2(HabitPlanGuideActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TrainingSportUtils.INSTANCE.startHabitTrainingSport(this$0, 3, new HabitDayPlan(10001L, false, 0.1f, System.currentTimeMillis() / ((long) 1000), CalendarUtils.INSTANCE.calcDayOfWeek(new Date(System.currentTimeMillis())), 2, null, true, 66, null));
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jvi.s;
    }

    @Nullable
    public final HabitMedalAdapter getMedalAdapter() {
        return this.medalAdapter;
    }

    @NotNull
    public final List<HabitMedalData> getMedalList() {
        return this.medalList;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("运动习惯养成计划");
        initData();
        initView();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    public final void setMedalAdapter(@Nullable HabitMedalAdapter habitMedalAdapter) {
        this.medalAdapter = habitMedalAdapter;
    }
}
