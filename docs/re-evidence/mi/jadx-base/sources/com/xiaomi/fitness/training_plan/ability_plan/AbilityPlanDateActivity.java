package com.xiaomi.fitness.training_plan.ability_plan;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.device.manager.internal.extetions.LogExtKt;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.training_plan.ability_plan.AbilityPlanDateActivity;
import com.xiaomi.fitness.training_plan.net.TrainingPlanRequest;
import com.xiaomi.fitness.training_plan.widget.QuestionDateLayout;
import com.xiaomi.fitness.training_plan_export.model.TrainingPlanConstantsKt;
import defpackage.aje;
import defpackage.csi;
import defpackage.jvi;
import defpackage.k1j;
import defpackage.ng0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import miuix.androidbasewidget.widget.ProgressBar;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\b\u000b*\u0001\u0014\b\u0007\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u001c\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\u0006R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/training_plan/ability_plan/AbilityPlanDateActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/training_plan/ability_plan/AbilityDateViewModel;", "Lng0;", "", "initView", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_DESTROY, "Lcom/xiaomi/fitness/training_plan/ability_plan/AbilityPlanCreateLoadingActivity$AbilityPlanGenerateParams;", "generateParams", "Lcom/xiaomi/fitness/training_plan/ability_plan/AbilityPlanCreateLoadingActivity$AbilityPlanGenerateParams;", "Ljava/util/ArrayList;", "", "selectedRunningDays", "Ljava/util/ArrayList;", "selectedStrengthDays", "com/xiaomi/fitness/training_plan/ability_plan/AbilityPlanDateActivity$finishReceiver$1", "finishReceiver", "Lcom/xiaomi/fitness/training_plan/ability_plan/AbilityPlanDateActivity$finishReceiver$1;", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AbilityPlanDateActivity extends Hilt_AbilityPlanDateActivity<AbilityDateViewModel, ng0> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "AbilityPlanDateActivity";

    @Nullable
    private AbilityPlanCreateLoadingActivity.AbilityPlanGenerateParams generateParams;

    @NotNull
    private final ArrayList<Integer> selectedRunningDays = new ArrayList<>();

    @NotNull
    private ArrayList<Integer> selectedStrengthDays = new ArrayList<>();

    @NotNull
    private final AbilityPlanDateActivity$finishReceiver$1 finishReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.training_plan.ability_plan.AbilityPlanDateActivity$finishReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            this.this$0.finish();
        }
    };

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/training_plan/ability_plan/AbilityPlanDateActivity$Companion;", "", "<init>", "()V", "TAG", "", "launch", "", "context", "Landroid/content/Context;", "params", "Lcom/xiaomi/fitness/training_plan/ability_plan/AbilityPlanCreateLoadingActivity$AbilityPlanGenerateParams;", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Context context, @NotNull AbilityPlanCreateLoadingActivity.AbilityPlanGenerateParams params) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(params, "params");
            Intent intent = new Intent(context, (Class<?>) AbilityPlanDateActivity.class);
            intent.putExtra(AbilityPlanCreateLoadingActivity.KEY_ABILITY_GENERATE_PARAMS, params);
            context.startActivity(intent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        ((ng0) getMBinding()).F.setTitle(k1j.q0);
        View view = ((ng0) getMBinding()).D;
        ((ProgressBar) view.findViewById(csi.i2)).setProgress(75);
        ((TextView) view.findViewById(csi.I3)).setText(view.getResources().getString(k1j.c));
        ((TextView) view.findViewById(csi.X)).setText(view.getResources().getString(k1j.d));
        ((ng0) getMBinding()).F.hideMore();
        String string = getString(k1j.m0);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(k1j.n0);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        QuestionDateLayout questionDateLayout = new QuestionDateLayout(this, string, string2, CollectionsKt__CollectionsKt.arrayListOf(1, 2), new Function1() { // from class: ji
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AbilityPlanDateActivity.initView$lambda$1(this.f22822a, (List) obj);
            }
        }, 2, 6);
        String string3 = getString(k1j.o0);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = getString(k1j.p0);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        QuestionDateLayout questionDateLayout2 = new QuestionDateLayout(this, string3, string4, CollectionsKt__CollectionsKt.arrayListOf(1, 2), new Function1() { // from class: mi
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AbilityPlanDateActivity.initView$lambda$2(this.f26202a, (List) obj);
            }
        }, 0, 5);
        ((ng0) getMBinding()).A.addView(questionDateLayout, new LinearLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout = ((ng0) getMBinding()).A;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = ExtUtilsKt.getDp(12);
        Unit unit = Unit.INSTANCE;
        linearLayout.addView(questionDateLayout2, layoutParams);
        ((ng0) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: oi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbilityPlanDateActivity.initView$lambda$5(this.f29190a, view2);
            }
        });
        ((ng0) getMBinding()).E.setOnClickListener(new View.OnClickListener() { // from class: qi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbilityPlanDateActivity.initView$lambda$6(view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$1(AbilityPlanDateActivity this$0, List selectedDays) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(selectedDays, "selectedDays");
        this$0.selectedRunningDays.clear();
        this$0.selectedRunningDays.addAll(selectedDays);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$2(AbilityPlanDateActivity this$0, List selectedDays) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(selectedDays, "selectedDays");
        this$0.selectedStrengthDays.clear();
        this$0.selectedStrengthDays.addAll(selectedDays);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$5(AbilityPlanDateActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AbilityPlanCreateLoadingActivity.Companion companion = AbilityPlanCreateLoadingActivity.INSTANCE;
        AbilityPlanCreateLoadingActivity.AbilityPlanGenerateParams abilityPlanGenerateParams = this$0.generateParams;
        Intrinsics.checkNotNull(abilityPlanGenerateParams);
        CollectionsKt__MutableCollectionsJVMKt.sort(this$0.selectedRunningDays);
        CollectionsKt__MutableCollectionsJVMKt.sort(this$0.selectedStrengthDays);
        abilityPlanGenerateParams.setRunningDays(CollectionsKt___CollectionsKt.joinToString$default(this$0.selectedRunningDays, ",", null, null, 0, null, null, 62, null));
        abilityPlanGenerateParams.setStrengthDays(CollectionsKt___CollectionsKt.joinToString$default(this$0.selectedStrengthDays, ",", null, null, 0, null, null, 62, null));
        Unit unit = Unit.INSTANCE;
        companion.launch(this$0, abilityPlanGenerateParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$6(View view) {
        ScopeExtKt.scopeNet$default(null, new AbilityPlanDateActivity$initView$4$1(new TrainingPlanRequest(), null), 1, null);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jvi.l;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // com.xiaomi.fitness.training_plan.ability_plan.Hilt_AbilityPlanDateActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActionBarDisplayable(false);
        DisplayUtil.setTranslucentStatusBar(this);
        Serializable serializableExtra = getIntent().getSerializableExtra(AbilityPlanCreateLoadingActivity.KEY_ABILITY_GENERATE_PARAMS);
        AbilityPlanCreateLoadingActivity.AbilityPlanGenerateParams abilityPlanGenerateParams = serializableExtra instanceof AbilityPlanCreateLoadingActivity.AbilityPlanGenerateParams ? (AbilityPlanCreateLoadingActivity.AbilityPlanGenerateParams) serializableExtra : null;
        this.generateParams = abilityPlanGenerateParams;
        if (abilityPlanGenerateParams == null) {
            LogExtKt.loge(TAG, "can not create ability plan with empty params!!");
            finish();
        }
        initView();
        aje.b(this).c(this.finishReceiver, new IntentFilter(TrainingPlanConstantsKt.FINISH_CREATE_ACTION));
    }

    @Override // com.xiaomi.fitness.training_plan.ability_plan.Hilt_AbilityPlanDateActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        aje.b(this).e(this.finishReceiver);
        super.onDestroy();
    }
}
