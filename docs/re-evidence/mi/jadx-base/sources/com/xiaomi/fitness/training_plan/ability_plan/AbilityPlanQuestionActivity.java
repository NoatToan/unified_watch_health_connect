package com.xiaomi.fitness.training_plan.ability_plan;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.training_plan.ability_plan.AbilityPlanQuestionActivity;
import com.xiaomi.fitness.training_plan.widget.AbilityQuestionLayout;
import com.xiaomi.fitness.training_plan_export.model.Question;
import com.xiaomi.fitness.training_plan_export.model.TrainingPlanConstantsKt;
import defpackage.aje;
import defpackage.csi;
import defpackage.jvi;
import defpackage.k1j;
import defpackage.rg0;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import miuix.androidbasewidget.widget.ProgressBar;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u001b\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0006R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/training_plan/ability_plan/AbilityPlanQuestionActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/training_plan/ability_plan/AbilityQuestionViewModel;", "Lrg0;", "", "initView", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onRetry", "Ljava/util/HashMap;", "", "", "selectedInfo", "Ljava/util/HashMap;", "Lcom/xiaomi/fitness/training_plan_export/model/Question;", "questionInfo", "Lkotlin/Function2;", "onQuestionResultChange", "Lkotlin/jvm/functions/Function2;", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAbilityPlanQuestionActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbilityPlanQuestionActivity.kt\ncom/xiaomi/fitness/training_plan/ability_plan/AbilityPlanQuestionActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,152:1\n1863#2,2:153\n*S KotlinDebug\n*F\n+ 1 AbilityPlanQuestionActivity.kt\ncom/xiaomi/fitness/training_plan/ability_plan/AbilityPlanQuestionActivity\n*L\n63#1:153,2\n*E\n"})
public final class AbilityPlanQuestionActivity extends Hilt_AbilityPlanQuestionActivity<AbilityQuestionViewModel, rg0> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "AbilityPlanQuestionActivity";

    @NotNull
    private final HashMap<String, Integer> selectedInfo = new HashMap<>();

    @NotNull
    private final HashMap<Integer, Question> questionInfo = new HashMap<>();

    @NotNull
    private final Function2<String, Integer, Unit> onQuestionResultChange = new Function2() { // from class: cm
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return AbilityPlanQuestionActivity.onQuestionResultChange$lambda$0(this.f5471a, (String) obj, ((Integer) obj2).intValue());
        }
    };

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/training_plan/ability_plan/AbilityPlanQuestionActivity$Companion;", "", "<init>", "()V", "TAG", "", "launch", "", "context", "Landroid/content/Context;", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) AbilityPlanQuestionActivity.class));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        ((rg0) getMBinding()).E.hideMore();
        ((rg0) getMBinding()).E.setTitle(k1j.q0);
        View view = ((rg0) getMBinding()).A;
        ((ProgressBar) view.findViewById(csi.i2)).setProgress(50);
        ((TextView) view.findViewById(csi.I3)).setText(view.getResources().getString(k1j.f23325a));
        ((TextView) view.findViewById(csi.X)).setText(view.getResources().getString(k1j.f23326b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$6(AbilityPlanQuestionActivity this$0, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (((Boolean) pair.getFirst()).booleanValue()) {
            List list = (List) pair.getSecond();
            int i = 0;
            if (list == null || list.size() <= 0) {
                PageState.DefaultImpls.showEmpty$default(this$0, 0, 0, 3, null);
            } else {
                List<Question> list2 = (List) pair.getSecond();
                if (list2 != null) {
                    for (Question question : list2) {
                        this$0.questionInfo.put(Integer.valueOf(question.getId()), question);
                        AbilityQuestionLayout abilityQuestionLayout = new AbilityQuestionLayout(this$0, question, this$0.onQuestionResultChange);
                        if (i == 0) {
                            LinearLayout linearLayout = ((rg0) this$0.getMBinding()).C;
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                            layoutParams.bottomMargin = ExtUtilsKt.getDp(6);
                            Unit unit = Unit.INSTANCE;
                            linearLayout.addView(abilityQuestionLayout, layoutParams);
                        } else {
                            List list3 = (List) pair.getSecond();
                            if (i == (list3 != null ? list3.size() : -1)) {
                                LinearLayout linearLayout2 = ((rg0) this$0.getMBinding()).C;
                                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                                layoutParams2.topMargin = ExtUtilsKt.getDp(6);
                                Unit unit2 = Unit.INSTANCE;
                                linearLayout2.addView(abilityQuestionLayout, layoutParams2);
                            } else {
                                LinearLayout linearLayout3 = ((rg0) this$0.getMBinding()).C;
                                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                                layoutParams3.topMargin = ExtUtilsKt.getDp(6);
                                layoutParams3.bottomMargin = ExtUtilsKt.getDp(6);
                                Unit unit3 = Unit.INSTANCE;
                                linearLayout3.addView(abilityQuestionLayout, layoutParams3);
                            }
                        }
                        i++;
                    }
                }
            }
        } else {
            this$0.showNoNetwork();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$7(AbilityPlanQuestionActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AbilityPlanDateActivity.Companion companion = AbilityPlanDateActivity.INSTANCE;
        Integer num = this$0.selectedInfo.get("improve_distance");
        Intrinsics.checkNotNull(num);
        int iIntValue = num.intValue();
        Integer num2 = this$0.selectedInfo.get("running_frequency");
        Intrinsics.checkNotNull(num2);
        int iIntValue2 = num2.intValue();
        Integer num3 = this$0.selectedInfo.get("running_distance");
        Intrinsics.checkNotNull(num3);
        int iIntValue3 = num3.intValue();
        Integer num4 = this$0.selectedInfo.get("running_pace");
        Intrinsics.checkNotNull(num4);
        companion.launch(this$0, new AbilityPlanCreateLoadingActivity.AbilityPlanGenerateParams(iIntValue, iIntValue2, iIntValue3, num4.intValue(), null, null, 48, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onQuestionResultChange$lambda$0(AbilityPlanQuestionActivity this$0, String key, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "key");
        this$0.selectedInfo.put(key, Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jvi.n;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.training_plan.ability_plan.Hilt_AbilityPlanQuestionActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActionBarDisplayable(false);
        DisplayUtil.setTranslucentStatusBar(this);
        initView();
        ((AbilityQuestionViewModel) getMViewModel()).getQuestionInfo().observe(this, new AbilityPlanQuestionActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ml
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AbilityPlanQuestionActivity.onCreate$lambda$6(this.f26970a, (Pair) obj);
            }
        }));
        ((AbilityQuestionViewModel) getMViewModel()).m613getQuestionInfo();
        ((rg0) getMBinding()).D.setOnClickListener(new View.OnClickListener() { // from class: ul
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbilityPlanQuestionActivity.onCreate$lambda$7(this.f35896a, view);
            }
        });
        aje.b(this).c(new BroadcastReceiver() { // from class: com.xiaomi.fitness.training_plan.ability_plan.AbilityPlanQuestionActivity.onCreate.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                AbilityPlanQuestionActivity.this.finish();
            }
        }, new IntentFilter(TrainingPlanConstantsKt.FINISH_CREATE_ACTION));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, com.xiaomi.fitness.baseui.view.PageState
    public void onRetry() {
        ((AbilityQuestionViewModel) getMViewModel()).m613getQuestionInfo();
    }
}
