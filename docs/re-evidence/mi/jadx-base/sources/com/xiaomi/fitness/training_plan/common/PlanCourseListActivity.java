package com.xiaomi.fitness.training_plan.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.device.manager.internal.extetions.LogExtKt;
import com.xiaomi.fitness.training_plan.adapter.AbilityPlanCourseListAdapter;
import com.xiaomi.fitness.training_plan_export.model.AbilityDetailSummary;
import defpackage.cyi;
import defpackage.jvi;
import defpackage.k1j;
import defpackage.lg0;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/training_plan/common/PlanCourseListActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/training_plan/common/PlanCourseListVM;", "Llg0;", "", "initView", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/training_plan/adapter/AbilityPlanCourseListAdapter;", "courseListAdapter", "Lcom/xiaomi/fitness/training_plan/adapter/AbilityPlanCourseListAdapter;", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityDetailSummary;", "abilitySummary", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityDetailSummary;", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class PlanCourseListActivity extends Hilt_PlanCourseListActivity<PlanCourseListVM, lg0> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String KEY_ABILITY_SUMMARY = "ability_plan_summary";

    @NotNull
    private static final String TAG = "AbilityCourseListActivity";

    @Nullable
    private AbilityDetailSummary abilitySummary;

    @NotNull
    private final AbilityPlanCourseListAdapter courseListAdapter = new AbilityPlanCourseListAdapter(this);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/training_plan/common/PlanCourseListActivity$Companion;", "", "<init>", "()V", "TAG", "", "KEY_ABILITY_SUMMARY", "launch", "", "context", "Landroid/content/Context;", "summary", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityDetailSummary;", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Context context, @Nullable AbilityDetailSummary summary) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) PlanCourseListActivity.class);
            intent.putExtra(PlanCourseListActivity.KEY_ABILITY_SUMMARY, summary);
            context.startActivity(intent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SetTextI18n"})
    private final void initView() {
        ((lg0) getMBinding()).C.hideMore();
        ((lg0) getMBinding()).C.setTitle(k1j.A0);
        AbilityDetailSummary abilityDetailSummary = this.abilitySummary;
        Intrinsics.checkNotNull(abilityDetailSummary);
        int size = (abilityDetailSummary.getPlans().size() + 6) / 7;
        ((lg0) getMBinding()).J.setText(String.valueOf(size));
        AbilityDetailSummary abilityDetailSummary2 = this.abilitySummary;
        Intrinsics.checkNotNull(abilityDetailSummary2);
        int size2 = abilityDetailSummary2.getPlans().size();
        AbilityDetailSummary abilityDetailSummary3 = this.abilitySummary;
        Intrinsics.checkNotNull(abilityDetailSummary3);
        int restDays = size2 - abilityDetailSummary3.getSummary().getRestDays();
        ((lg0) getMBinding()).D.setText(String.valueOf(restDays));
        TextView textView = ((lg0) getMBinding()).G;
        AbilityDetailSummary abilityDetailSummary4 = this.abilitySummary;
        Intrinsics.checkNotNull(abilityDetailSummary4);
        textView.setText(String.valueOf(abilityDetailSummary4.getSummary().getRestDays()));
        TextView textView2 = ((lg0) getMBinding()).I;
        int i = cyi.g;
        AbilityDetailSummary abilityDetailSummary5 = this.abilitySummary;
        Intrinsics.checkNotNull(abilityDetailSummary5);
        int restDays2 = abilityDetailSummary5.getSummary().getRestDays();
        AbilityDetailSummary abilityDetailSummary6 = this.abilitySummary;
        Intrinsics.checkNotNull(abilityDetailSummary6);
        textView2.setText(ResourceExtKt.getQuantityString(this, i, restDays2, Integer.valueOf(abilityDetailSummary6.getSummary().getRestDays())));
        ((lg0) getMBinding()).L.setText(ResourceExtKt.getQuantityString(this, cyi.h, size, Integer.valueOf(size)));
        ((lg0) getMBinding()).F.setText(ResourceExtKt.getQuantityString(this, cyi.g, restDays, Integer.valueOf(restDays)));
        ((lg0) getMBinding()).A.setLayoutManager(new LinearLayoutManager(this));
        AbilityPlanCourseListAdapter abilityPlanCourseListAdapter = this.courseListAdapter;
        AbilityDetailSummary abilityDetailSummary7 = this.abilitySummary;
        Intrinsics.checkNotNull(abilityDetailSummary7);
        abilityPlanCourseListAdapter.updatePlanCourses(abilityDetailSummary7.getPlans());
        ((lg0) getMBinding()).A.setAdapter(this.courseListAdapter);
        ((lg0) getMBinding()).A.addItemDecoration(new RecyclerView.n() { // from class: com.xiaomi.fitness.training_plan.common.PlanCourseListActivity.initView.1
            @Override // androidx.recyclerview.widget.RecyclerView.n
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.z state) {
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                outRect.bottom = ExtUtilsKt.getDp(12);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jvi.f23186k;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // com.xiaomi.fitness.training_plan.common.Hilt_PlanCourseListActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DisplayUtil.setTranslucentStatusBar(this);
        setActionBarDisplayable(false);
        Serializable serializableExtra = getIntent().getSerializableExtra(KEY_ABILITY_SUMMARY);
        AbilityDetailSummary abilityDetailSummary = serializableExtra instanceof AbilityDetailSummary ? (AbilityDetailSummary) serializableExtra : null;
        this.abilitySummary = abilityDetailSummary;
        if (abilityDetailSummary == null) {
            LogExtKt.loge(TAG, "can not init PlanCourseListActivity with empty abilitySummary!!");
            finish();
        }
        initView();
    }
}
