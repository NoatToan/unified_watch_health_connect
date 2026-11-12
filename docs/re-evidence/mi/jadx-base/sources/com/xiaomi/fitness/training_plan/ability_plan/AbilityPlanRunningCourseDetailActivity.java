package com.xiaomi.fitness.training_plan.ability_plan;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.baseui.view.TipType;
import com.xiaomi.fitness.baseui.view.TipViewKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.training_plan.ability_plan.AbilityPlanRunningCourseDetailActivity;
import com.xiaomi.fitness.training_plan.util.CourseMessageUtils;
import com.xiaomi.fitness.training_plan.util.TrainingSportUtils;
import com.xiaomi.fitness.training_plan.widget.AbilityRunningCourseListItem;
import com.xiaomi.fitness.training_plan_export.manager.ITrainingManager;
import com.xiaomi.fitness.training_plan_export.manager.TrainingManagerExtKt;
import com.xiaomi.fitness.training_plan_export.model.AbilityDayPlanCourse;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanRunningCourse;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanRunningCourseContent;
import com.xiaomi.fitness.training_plan_export.model.TrainingPlanConstantsKt;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import defpackage.aje;
import defpackage.cyi;
import defpackage.ioi;
import defpackage.jvi;
import defpackage.k1j;
import defpackage.tg0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001d\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/training_plan/ability_plan/AbilityPlanRunningCourseDetailActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/training_plan/ability_plan/AbilityPlanRunningCourseVM;", "Ltg0;", "", "initView", "()V", "loadData", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlanCourse;", "planCourse", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlanCourse;", "", "courseId", "Ljava/lang/Long;", "planId", DialWidgetType.DATE, "", "attentionVisible", "Z", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAbilityPlanRunningCourseDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbilityPlanRunningCourseDetailActivity.kt\ncom/xiaomi/fitness/training_plan/ability_plan/AbilityPlanRunningCourseDetailActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,192:1\n1863#2,2:193\n*S KotlinDebug\n*F\n+ 1 AbilityPlanRunningCourseDetailActivity.kt\ncom/xiaomi/fitness/training_plan/ability_plan/AbilityPlanRunningCourseDetailActivity\n*L\n124#1:193,2\n*E\n"})
public final class AbilityPlanRunningCourseDetailActivity extends BaseBindingActivity<AbilityPlanRunningCourseVM, tg0> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String KEY_COURSE_ID = "plan_course_id";

    @NotNull
    private static final String KEY_DATE = "plan_course_date";

    @NotNull
    private static final String KEY_PLAN_ID = "plan_id";

    @NotNull
    private static final String TAG = "AbilityPlanRunningCourseDetailActivity";
    private boolean attentionVisible = true;

    @Nullable
    private Long courseId;

    @Nullable
    private Long date;

    @Nullable
    private AbilityDayPlanCourse planCourse;

    @Nullable
    private Long planId;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/training_plan/ability_plan/AbilityPlanRunningCourseDetailActivity$Companion;", "", "<init>", "()V", "TAG", "", "KEY_PLAN_ID", "KEY_COURSE_ID", "KEY_DATE", "launch", "", "context", "Landroid/content/Context;", "planId", "", "courseId", DialWidgetType.DATE, "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Context context, long planId, long courseId, long date) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) AbilityPlanRunningCourseDetailActivity.class);
            intent.putExtra("plan_id", planId);
            intent.putExtra(AbilityPlanRunningCourseDetailActivity.KEY_COURSE_ID, courseId);
            intent.putExtra(AbilityPlanRunningCourseDetailActivity.KEY_DATE, date);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"UseCompatLoadingForDrawables"})
    private final void initView() {
        getMBinding().H.hideMore();
        ((AbilityPlanRunningCourseVM) getMViewModel()).getPlanCourse().observe(this, new AbilityPlanRunningCourseDetailActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ho
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AbilityPlanRunningCourseDetailActivity.initView$lambda$11(this.f20274a, (AbilityDayPlanCourse) obj);
            }
        }));
        aje.b(this).c(new BroadcastReceiver() { // from class: com.xiaomi.fitness.training_plan.ability_plan.AbilityPlanRunningCourseDetailActivity.initView.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                AbilityPlanRunningCourseDetailActivity.this.finish();
            }
        }, new IntentFilter(TrainingPlanConstantsKt.FINISH_COURSE_INFO_ACTIVITY));
        loadData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$11(final AbilityPlanRunningCourseDetailActivity this$0, final AbilityDayPlanCourse abilityDayPlanCourse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(TAG, "planCourseDetail:" + abilityDayPlanCourse);
        this$0.dismissDialog();
        if (abilityDayPlanCourse != null) {
            this$0.getMBinding().H.setTitle(abilityDayPlanCourse.getName());
            TextView textView = this$0.getMBinding().C;
            CourseMessageUtils courseMessageUtils = CourseMessageUtils.INSTANCE;
            textView.setText(courseMessageUtils.getCourseIntroduce(abilityDayPlanCourse.getCourseCode()));
            this$0.getMBinding().B.setText(courseMessageUtils.getCourseAttention());
            this$0.getMBinding().G.setImageResource(ioi.n);
            this$0.getMBinding().G.setOnClickListener(new View.OnClickListener() { // from class: co
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbilityPlanRunningCourseDetailActivity.initView$lambda$11$lambda$0(this.f5587a, view);
                }
            });
            TextView textView2 = this$0.getMBinding().D;
            int i = cyi.f14867b;
            AbilityPlanRunningCourse runningCourse = abilityDayPlanCourse.getCourseContent().getRunningCourse();
            Intrinsics.checkNotNull(runningCourse);
            int totalDuration = runningCourse.getTotalDuration();
            AbilityPlanRunningCourse runningCourse2 = abilityDayPlanCourse.getCourseContent().getRunningCourse();
            Intrinsics.checkNotNull(runningCourse2);
            textView2.setText(ResourceExtKt.getQuantityString(this$0, i, totalDuration, Integer.valueOf(runningCourse2.getTotalDuration())));
            Long l = this$0.planId;
            Intrinsics.checkNotNull(l);
            abilityDayPlanCourse.setPlanId(l.longValue());
            AbilityPlanRunningCourse runningCourse3 = abilityDayPlanCourse.getCourseContent().getRunningCourse();
            if (runningCourse3 != null) {
                int i2 = 0;
                for (AbilityPlanRunningCourseContent abilityPlanRunningCourseContent : runningCourse3.getCourseContent()) {
                    if (i2 == 0) {
                        LinearLayout linearLayout = this$0.getMBinding().E;
                        AbilityRunningCourseListItem abilityRunningCourseListItem = new AbilityRunningCourseListItem(this$0, null);
                        abilityRunningCourseListItem.updateData(abilityPlanRunningCourseContent);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams.setMargins(0, 0, 0, ExtUtilsKt.getDp(6));
                        Unit unit = Unit.INSTANCE;
                        linearLayout.addView(abilityRunningCourseListItem, layoutParams);
                    } else if (i2 == runningCourse3.getCourseContent().size() - 1) {
                        LinearLayout linearLayout2 = this$0.getMBinding().E;
                        AbilityRunningCourseListItem abilityRunningCourseListItem2 = new AbilityRunningCourseListItem(this$0, null);
                        abilityRunningCourseListItem2.updateData(abilityPlanRunningCourseContent);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams2.setMargins(0, 6, 0, 0);
                        Unit unit2 = Unit.INSTANCE;
                        linearLayout2.addView(abilityRunningCourseListItem2, layoutParams2);
                    } else {
                        LinearLayout linearLayout3 = this$0.getMBinding().E;
                        AbilityRunningCourseListItem abilityRunningCourseListItem3 = new AbilityRunningCourseListItem(this$0, null);
                        abilityRunningCourseListItem3.updateData(abilityPlanRunningCourseContent);
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams3.setMargins(0, ExtUtilsKt.getDp(6), 0, ExtUtilsKt.getDp(6));
                        Unit unit3 = Unit.INSTANCE;
                        linearLayout3.addView(abilityRunningCourseListItem3, layoutParams3);
                    }
                    i2++;
                }
            }
            this$0.getMBinding().I.showStatus(abilityDayPlanCourse.getStatus(), new View.OnClickListener() { // from class: fo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbilityPlanRunningCourseDetailActivity.initView$lambda$11$lambda$9(abilityDayPlanCourse, this$0, view);
                }
            }, abilityDayPlanCourse.getPlanId(), abilityDayPlanCourse.getCourseId());
        } else {
            FrameLayout contentRoot = this$0.getMBinding().A;
            Intrinsics.checkNotNullExpressionValue(contentRoot, "contentRoot");
            TipViewKt.addTipView$default(contentRoot, TipType.NO_NET, false, new Function0() { // from class: go
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbilityPlanRunningCourseDetailActivity.initView$lambda$11$lambda$10(this.f19173a);
                }
            }, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$11$lambda$0(AbilityPlanRunningCourseDetailActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean z = !this$0.attentionVisible;
        this$0.attentionVisible = z;
        if (z) {
            this$0.getMBinding().G.setImageResource(ioi.n);
            TextView courseAttention = this$0.getMBinding().B;
            Intrinsics.checkNotNullExpressionValue(courseAttention, "courseAttention");
            ViewExtKt.visible(courseAttention);
            return;
        }
        this$0.getMBinding().G.setImageResource(ioi.m);
        TextView courseAttention2 = this$0.getMBinding().B;
        Intrinsics.checkNotNullExpressionValue(courseAttention2, "courseAttention");
        ViewExtKt.gone(courseAttention2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$11$lambda$10(AbilityPlanRunningCourseDetailActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadData();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$11$lambda$9(AbilityDayPlanCourse abilityDayPlanCourse, AbilityPlanRunningCourseDetailActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(TAG, "launch running:" + abilityDayPlanCourse.getPlanId() + "-" + abilityDayPlanCourse.getCourseId());
        if (RegionPreference.INSTANCE.getSyncWeb()) {
            TrainingSportUtils.INSTANCE.startAbilitySport(this$0, abilityDayPlanCourse);
        } else {
            TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE).showCloudSyncDialog(this$0, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadData() {
        showLoading(k1j.o1, false);
        AbilityPlanRunningCourseVM abilityPlanRunningCourseVM = (AbilityPlanRunningCourseVM) getMViewModel();
        Long l = this.courseId;
        Intrinsics.checkNotNull(l);
        long jLongValue = l.longValue();
        Long l2 = this.date;
        Intrinsics.checkNotNull(l2);
        abilityPlanRunningCourseVM.getCourseDetail(jLongValue, l2.longValue());
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jvi.o;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Long l;
        Long l2;
        super.onCreate(savedInstanceState);
        setActionBarDisplayable(false);
        DisplayUtil.setTranslucentStatusBar(this);
        this.planId = Long.valueOf(getIntent().getLongExtra("plan_id", -1L));
        this.courseId = Long.valueOf(getIntent().getLongExtra(KEY_COURSE_ID, -1L));
        this.date = Long.valueOf(getIntent().getLongExtra(KEY_DATE, -1L));
        Long l3 = this.courseId;
        if ((l3 != null && l3.longValue() == -1) || (((l = this.date) != null && l.longValue() == -1) || ((l2 = this.planId) != null && l2.longValue() == -1))) {
            Logger.e(TAG, "can not init AbilityPlanRunningCourseDetailActivity with empty courseId or date!!");
            finish();
        }
        initView();
    }
}
