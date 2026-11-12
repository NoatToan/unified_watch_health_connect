package com.xiaomi.fitness.training_plan.habit_plan;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.training_plan.habit_plan.HabitPlanManualActivity;
import com.xiaomi.fitness.training_plan.widget.QuestionDateLayout;
import defpackage.cyi;
import defpackage.jm0;
import defpackage.jvi;
import defpackage.k1j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\"B\u0007¢\u0006\u0004\b!\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R&\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R&\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/training_plan/habit_plan/HabitPlanManualActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/training_plan/habit_plan/HabitPlanManualVM;", "Ljm0;", "", "initData", "()V", "initView", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/training_plan/widget/QuestionDateLayout;", "questionDateLayout", "Lcom/xiaomi/fitness/training_plan/widget/QuestionDateLayout;", "getQuestionDateLayout", "()Lcom/xiaomi/fitness/training_plan/widget/QuestionDateLayout;", "setQuestionDateLayout", "(Lcom/xiaomi/fitness/training_plan/widget/QuestionDateLayout;)V", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "planDateList", "Ljava/util/ArrayList;", "planDateChangedList", "", "planDistance", "Ljava/lang/Float;", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HabitPlanManualActivity extends BaseBindingActivity<HabitPlanManualVM, jm0> {

    @NotNull
    public static final String EXTRA_DISTANCE = "distance";

    @NotNull
    public static final String EXTRA_SELECT_DATE = "init_select_date";

    @NotNull
    public static final String TAG = "HabitPlanManualActivity";

    @Nullable
    private Float planDistance;
    public QuestionDateLayout questionDateLayout;

    @NotNull
    private ArrayList<Integer> planDateList = new ArrayList<>();

    @NotNull
    private ArrayList<Integer> planDateChangedList = new ArrayList<>();

    public static final /* synthetic */ jm0 access$getMBinding(HabitPlanManualActivity habitPlanManualActivity) {
        return habitPlanManualActivity.getMBinding();
    }

    private final void initData() {
        ArrayList<Integer> integerArrayListExtra = getIntent().getIntegerArrayListExtra(EXTRA_SELECT_DATE);
        Intrinsics.checkNotNull(integerArrayListExtra);
        this.planDateList = integerArrayListExtra;
        Float fValueOf = Float.valueOf(getIntent().getFloatExtra("distance", 0.0f));
        this.planDistance = fValueOf;
        ArrayList<Integer> arrayList = this.planDateList;
        StringBuilder sb = new StringBuilder();
        sb.append("initData:planDateList:");
        sb.append(arrayList);
        sb.append(",planDistance:");
        sb.append(fValueOf);
    }

    private final void initView() {
        String string = getString(k1j.G0);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(k1j.H0);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        setQuestionDateLayout(new QuestionDateLayout(this, string, string2, this.planDateList, new Function1() { // from class: rgb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HabitPlanManualActivity.initView$lambda$0(this.f32517a, (List) obj);
            }
        }, 2, 6));
        getMBinding().B.addView(getQuestionDateLayout());
        getMBinding().C.setOnClickListener(new View.OnClickListener() { // from class: sgb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HabitPlanManualActivity.initView$lambda$1(this.f33608a, view);
            }
        });
        TextView textView = getMBinding().I;
        int i = cyi.f14868k;
        Float f = this.planDistance;
        textView.setText(ResourceExtKt.getQuantityString(this, i, f != null ? (int) f.floatValue() : 0, this.planDistance));
        getMBinding().H.setText(String.valueOf(this.planDistance));
        getMBinding().H.addTextChangedListener(new TextWatcher() { // from class: com.xiaomi.fitness.training_plan.habit_plan.HabitPlanManualActivity.initView.3
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                Float fValueOf;
                if (s != null) {
                    HabitPlanManualActivity habitPlanManualActivity = HabitPlanManualActivity.this;
                    String string3 = s.toString();
                    if (StringsKt__StringsKt.contains$default((CharSequence) string3, (CharSequence) ".", false, 2, (Object) null)) {
                        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) string3, new String[]{"."}, false, 0, 6, (Object) null);
                        if (listSplit$default.size() > 1 && ((String) listSplit$default.get(1)).length() > 1) {
                            int length = s.length();
                            Object obj = listSplit$default.get(0);
                            String strSubstring = ((String) listSplit$default.get(1)).substring(0, 1);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                            s.replace(0, length, obj + "." + strSubstring);
                            HabitPlanManualActivity.access$getMBinding(habitPlanManualActivity).H.setSelection(s.toString().length());
                        }
                    }
                    try {
                        fValueOf = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(string3);
                    } catch (Exception unused) {
                        fValueOf = Float.valueOf(0.0f);
                    }
                    HabitPlanManualActivity.access$getMBinding(habitPlanManualActivity).I.setText(ResourceExtKt.getQuantityString(habitPlanManualActivity, cyi.f14868k, fValueOf != null ? (int) fValueOf.floatValue() : 0, fValueOf));
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });
        getMBinding().A.setOnClickListener(new View.OnClickListener() { // from class: tgb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HabitPlanManualActivity.initView$lambda$4(this.f34673a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$0(HabitPlanManualActivity this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        StringBuilder sb = new StringBuilder();
        sb.append("select list:");
        sb.append(it);
        this$0.planDateChangedList.clear();
        this$0.planDateChangedList.addAll(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(HabitPlanManualActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMBinding().H.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$4(HabitPlanManualActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Float floatOrNull = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(this$0.getMBinding().H.getText().toString());
        if ((floatOrNull != null ? floatOrNull.floatValue() : 0.0f) >= 0.5f) {
            if ((floatOrNull != null ? floatOrNull.floatValue() : 0.0f) <= 20.0f) {
                if (floatOrNull == null) {
                    ToastUtil.showToast(this$0.getString(k1j.I0));
                    return;
                }
                Intent intent = new Intent();
                intent.putIntegerArrayListExtra(EXTRA_SELECT_DATE, this$0.planDateChangedList.isEmpty() ? this$0.planDateList : this$0.planDateChangedList);
                intent.putExtra("distance", floatOrNull.floatValue());
                this$0.setResult(-1, intent);
                this$0.finish();
                return;
            }
        }
        ToastUtil.INSTANCE.showToast(k1j.J0);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jvi.v;
    }

    @NotNull
    public final QuestionDateLayout getQuestionDateLayout() {
        QuestionDateLayout questionDateLayout = this.questionDateLayout;
        if (questionDateLayout != null) {
            return questionDateLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("questionDateLayout");
        return null;
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
        getMBinding().G.hideMore();
        getMBinding().G.setTitle(k1j.c1);
        initData();
        initView();
    }

    public final void setQuestionDateLayout(@NotNull QuestionDateLayout questionDateLayout) {
        Intrinsics.checkNotNullParameter(questionDateLayout, "<set-?>");
        this.questionDateLayout = questionDateLayout;
    }
}
