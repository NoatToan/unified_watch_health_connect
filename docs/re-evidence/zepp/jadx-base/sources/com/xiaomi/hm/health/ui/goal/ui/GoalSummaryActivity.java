package com.xiaomi.hm.health.ui.goal.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.exoplayer2.text.ttml.b;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.activity.ActivityViewBindingsKt;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.activity.ChangeSportGoalActivity;
import com.xiaomi.hm.health.baseui.GlobalTitleStyle;
import com.xiaomi.hm.health.bodyfat.activity.WeightGoalsSetActivity;
import com.xiaomi.hm.health.databinding.ActivityGoalSummaryBinding;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.ui.goal.GoalFunctionsKt;
import com.xiaomi.hm.health.ui.goal.ui.GoalSummaryActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\b\u0010\b\u001a\u00020\u0002H\u0014R\u001d\u0010\u000e\u001a\u00020\t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/ui/goal/ui/GoalSummaryActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "u", "initViews", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "Lcom/xiaomi/hm/health/databinding/ActivityGoalSummaryBinding;", "x", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", b.r, "()Lcom/xiaomi/hm/health/databinding/ActivityGoalSummaryBinding;", "viewBinding", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class GoalSummaryActivity extends BaseTitleActivity {
    public static final /* synthetic */ KProperty<Object>[] y = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GoalSummaryActivity.class), "viewBinding", "getViewBinding()Lcom/xiaomi/hm/health/databinding/ActivityGoalSummaryBinding;"))};

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty viewBinding = ActivityViewBindingsKt.viewBinding(new GoalSummaryActivity$special$$inlined$viewBinding$1(new InflateViewBinder(ActivityGoalSummaryBinding.class)));

    private final void initViews() {
        p().tvGoalStep.setOnClickListener(new View.OnClickListener() { // from class: kg2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GoalSummaryActivity.q(this.a, view);
            }
        });
        p().tvGoalWeight.setOnClickListener(new View.OnClickListener() { // from class: jg2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GoalSummaryActivity.r(this.a, view);
            }
        });
        p().tvGoalConsume.setOnClickListener(new View.OnClickListener() { // from class: ig2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GoalSummaryActivity.s(this.a, view);
            }
        });
        p().tvGoalSleep.setOnClickListener(new View.OnClickListener() { // from class: lg2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GoalSummaryActivity.t(this.a, view);
            }
        });
    }

    private final ActivityGoalSummaryBinding p() {
        return (ActivityGoalSummaryBinding) this.viewBinding.getValue(this, y[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(GoalSummaryActivity goalSummaryActivity, View view) {
        goalSummaryActivity.startActivity(new Intent(goalSummaryActivity, (Class<?>) ChangeSportGoalActivity.class));
        Analytics.recordEvent(new CountEventBuilder(StatEvent.MINE_GOAL_STEP_C));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(GoalSummaryActivity goalSummaryActivity, View view) {
        goalSummaryActivity.startActivity(new Intent(goalSummaryActivity, (Class<?>) WeightGoalsSetActivity.class));
        Analytics.recordEvent(new CountEventBuilder(StatEvent.MINE_GOAL_WEIGHT_C));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(GoalSummaryActivity goalSummaryActivity, View view) {
        SetCalorieGoalActivity.INSTANCE.start(goalSummaryActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(GoalSummaryActivity goalSummaryActivity, View view) {
        SetSleepGoalActivity.INSTANCE.start(goalSummaryActivity);
    }

    private final void u() {
        String string = getString(R.string.not_set);
        TextView textView = p().tvGoalStep;
        String goalStepString = GoalFunctionsKt.getGoalStepString();
        if (goalStepString == null) {
            goalStepString = string;
        }
        textView.setText(goalStepString);
        TextView textView2 = p().tvGoalWeight;
        String goalWeightString = GoalFunctionsKt.getGoalWeightString();
        if (goalWeightString != null) {
            string = goalWeightString;
        }
        textView2.setText(string);
        p().tvGoalConsume.setText(GoalFunctionsKt.getGoalCalorieString());
        p().tvGoalSleep.setText(GoalFunctionsKt.getGoalSleepString());
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(2132017904);
        super.onCreate(savedInstanceState);
        setContentView(p().getRoot());
        GlobalTitleStyle.setUnifyTitleStyle$default(this, getString(R.string.mine_goals), null, 2, null);
        initViews();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        u();
    }
}
