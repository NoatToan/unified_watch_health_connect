package com.xiaomi.fitness.training_plan.settings;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.MultiplePermissionsBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.training_plan.net.SmartRunningRemindSettings;
import com.xiaomi.fitness.training_plan.settings.HabitPlanSettingFragment;
import com.xiaomi.fitness.training_plan.util.RemindTimeUtils;
import com.xiaomi.fitness.training_plan.util.TrainingPlanPreference;
import com.xiaomi.fitness.training_plan.widget.TrainingRemindDialog;
import com.xiaomi.fitness.training_plan_export.model.HabitPlan;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.av6;
import defpackage.dih;
import defpackage.jvi;
import defpackage.k1j;
import defpackage.lm0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001!B\u0007¢\u0006\u0004\b \u0010\nJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\bJ!\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u0006*\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001f\u0010\u001b\u001a\r\u0012\t\u0012\u00070\u0015¢\u0006\u0002\b\u00180\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/training_plan/settings/HabitPlanSettingFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/training_plan/settings/HabitPlanSettingVM;", "Llm0;", "Lcom/xiaomi/fitness/training_plan/net/SmartRunningRemindSettings;", "settings", "", "updateHabitPlanSettingView", "(Lcom/xiaomi/fitness/training_plan/net/SmartRunningRemindSettings;)V", "showRemindTimeDialogIfNeed", "()V", "updateSettings", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "bindView", "(Llm0;)V", "", "", "permissions", "[Ljava/lang/String;", "Lkotlin/jvm/internal/EnhancedNullability;", "getPermissionDescArray", "()[Ljava/lang/String;", "permissionDescArray", "", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HabitPlanSettingFragment extends BaseBindingFragment<HabitPlanSettingVM, lm0> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String KEY_HABIT_PLAN = "key_habit_plan";

    @NotNull
    private static final String REQUEST_PLAN_ID = "REQUEST_PLAN_ID";

    @NotNull
    private static final String TAG = "HabitPlanSettingFragment";

    @NotNull
    private final String[] permissions = {"android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"};

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/training_plan/settings/HabitPlanSettingFragment$Companion;", "", "<init>", "()V", "TAG", "", HabitPlanSettingFragment.REQUEST_PLAN_ID, "KEY_HABIT_PLAN", "launch", "", "context", "Landroid/content/Context;", "planID", "", "habitPlan", "Lcom/xiaomi/fitness/training_plan_export/model/HabitPlan;", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Context context, long planID, @Nullable HabitPlan habitPlan) {
            Intrinsics.checkNotNullParameter(context, "context");
            Bundle bundle = new Bundle();
            bundle.putLong(HabitPlanSettingFragment.REQUEST_PLAN_ID, planID);
            bundle.putSerializable(HabitPlanSettingFragment.KEY_HABIT_PLAN, habitPlan);
            dih.a().e(context, new FragmentParams.b().e(HabitPlanSettingFragment.class).c(bundle).b());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ HabitPlanSettingVM access$getMViewModel(HabitPlanSettingFragment habitPlanSettingFragment) {
        return (HabitPlanSettingVM) habitPlanSettingFragment.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$2(HabitPlanSettingFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updateSettings(new SmartRunningRemindSettings(z, ((HabitPlanSettingVM) this$0.getMViewModel()).getReminderTime(), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$3(HabitPlanSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showRemindTimeDialogIfNeed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$8(final HabitPlanSettingFragment this$0, final lm0 this_bindView, final boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        String[] strArr = this$0.permissions;
        PermissionExtKt.permissions(this$0, (String[]) Arrays.copyOf(strArr, strArr.length), this$0.getPermissionDescArray(), (Function1<? super MultiplePermissionsBuilder, Unit>) new Function1() { // from class: ugb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HabitPlanSettingFragment.bindView$lambda$8$lambda$7(z, this$0, this_bindView, (MultiplePermissionsBuilder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$8$lambda$7(final boolean z, final HabitPlanSettingFragment this$0, final lm0 this_bindView, MultiplePermissionsBuilder permissions) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        Intrinsics.checkNotNullParameter(permissions, "$this$permissions");
        permissions.allGranted(new Function0() { // from class: bhb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HabitPlanSettingFragment.bindView$lambda$8$lambda$7$lambda$5(z, this$0, this_bindView);
            }
        });
        permissions.denied(new Function1() { // from class: chb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HabitPlanSettingFragment.bindView$lambda$8$lambda$7$lambda$6(this_bindView, this$0, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$8$lambda$7$lambda$5(boolean z, HabitPlanSettingFragment this$0, lm0 this_bindView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        if (z) {
            HabitPlanSettingVM habitPlanSettingVM = (HabitPlanSettingVM) this$0.getMViewModel();
            Context contextRequireContext = this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            habitPlanSettingVM.delAndAddHabitToCalendar(contextRequireContext, new Function1() { // from class: vgb
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return HabitPlanSettingFragment.bindView$lambda$8$lambda$7$lambda$5$lambda$4(((Boolean) obj).booleanValue());
                }
            });
        } else {
            TrainingPlanPreference.INSTANCE.setSAVE_PLAN_TO_CALENDAR(false);
            this_bindView.E.setSwitch(false);
            HabitPlanSettingVM habitPlanSettingVM2 = (HabitPlanSettingVM) this$0.getMViewModel();
            Context contextRequireContext2 = this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            habitPlanSettingVM2.deleteCalendarIfNeed(contextRequireContext2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$8$lambda$7$lambda$5$lambda$4(boolean z) {
        TrainingPlanPreference.INSTANCE.setSAVE_PLAN_TO_CALENDAR(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$8$lambda$7$lambda$6(lm0 this_bindView, final HabitPlanSettingFragment this$0, List it) {
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this_bindView.E.setSwitch(false);
        TrainingPlanPreference.INSTANCE.setSAVE_PLAN_TO_CALENDAR(false);
        if (!this$0.shouldShowRequestPermissionRationale(this$0.permissions[0]) || !this$0.shouldShowRequestPermissionRationale(this$0.permissions[1])) {
            CommonDialog.c cVar = new CommonDialog.c("CardManagerFragment.delete.mi");
            cVar.setDialogTitle(new DialogParams.DialogDescriptionString(k1j.f23327k, new Object[0]));
            cVar.setDialogDescriptionString(new DialogParams.DialogDescriptionString(k1j.j, new Object[0]));
            cVar.setPositiveText(k1j.v0);
            cVar.setNegativeText(k1j.f);
            CommonDialog commonDialogCreate = cVar.create();
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.training_plan.settings.HabitPlanSettingFragment$bindView$3$1$2$1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    if (which == -1) {
                        PermissionsUtil permissionsUtil = PermissionsUtil.INSTANCE;
                        FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                        permissionsUtil.toPermissionSetting(fragmentActivityRequireActivity);
                    }
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            });
            commonDialogCreate.showIfNeed(this$0.getChildFragmentManager());
        }
        return Unit.INSTANCE;
    }

    private final String[] getPermissionDescArray() {
        return new String[]{ApplicationExtKt.getApplication().getString(k1j.j), " "};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(HabitPlanSettingFragment this$0, SmartRunningRemindSettings smartRunningRemindSettings) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        this$0.updateHabitPlanSettingView(smartRunningRemindSettings);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(HabitPlanSettingFragment this$0, SmartRunningRemindSettings smartRunningRemindSettings) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        this$0.updateHabitPlanSettingView(smartRunningRemindSettings);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showRemindTimeDialogIfNeed() {
        final TrainingRemindDialog trainingRemindDialogCreate = TrainingRemindDialog.INSTANCE.defaultBuilder("add time switcher").setDialogTitle(k1j.y1).setNegativeText(k1j.f).setPositiveText(k1j.g).create();
        RemindTimeUtils remindTimeUtils = RemindTimeUtils.INSTANCE;
        int remindTimeHour = remindTimeUtils.getRemindTimeHour(((HabitPlanSettingVM) getMViewModel()).getReminderTime());
        int remindTimeMinute = remindTimeUtils.getRemindTimeMinute(((HabitPlanSettingVM) getMViewModel()).getReminderTime());
        trainingRemindDialogCreate.setCurrentHour(remindTimeHour);
        trainingRemindDialogCreate.setCurrentMinute(remindTimeMinute);
        trainingRemindDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.training_plan.settings.HabitPlanSettingFragment.showRemindTimeDialogIfNeed.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                        return;
                    }
                    return;
                }
                if (which != -1) {
                    return;
                }
                int currentHour = trainingRemindDialogCreate.getCurrentHour();
                int currentMinute = trainingRemindDialogCreate.getCurrentMinute();
                RemindTimeUtils remindTimeUtils2 = RemindTimeUtils.INSTANCE;
                String str = remindTimeUtils2.formateTime(currentHour) + ":" + remindTimeUtils2.formateTime(currentMinute);
                if (!TextUtils.equals(str, HabitPlanSettingFragment.access$getMViewModel(this).getReminderTime())) {
                    HabitPlanSettingFragment habitPlanSettingFragment = this;
                    habitPlanSettingFragment.updateSettings(new SmartRunningRemindSettings(HabitPlanSettingFragment.access$getMViewModel(habitPlanSettingFragment).getReminderSwitch(), str, null, null));
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        trainingRemindDialogCreate.showIfNeed(getParentFragmentManager());
    }

    private final void updateHabitPlanSettingView(SmartRunningRemindSettings settings) {
        if (settings == null) {
            return;
        }
        getMBinding().C.setSwitch(settings.getRemindSwitch());
        if (!settings.getRemindSwitch()) {
            RightArrowBindingSingleLineTextView trainingPlanSettingsRemindTime = getMBinding().D;
            Intrinsics.checkNotNullExpressionValue(trainingPlanSettingsRemindTime, "trainingPlanSettingsRemindTime");
            ViewExtKt.gone(trainingPlanSettingsRemindTime);
        } else {
            RightArrowBindingSingleLineTextView trainingPlanSettingsRemindTime2 = getMBinding().D;
            Intrinsics.checkNotNullExpressionValue(trainingPlanSettingsRemindTime2, "trainingPlanSettingsRemindTime");
            ViewExtKt.visible(trainingPlanSettingsRemindTime2);
            getMBinding().D.setRemindText(settings.getRemindTime());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void updateSettings(SmartRunningRemindSettings settings) {
        PageState.DefaultImpls.showLoading$default(this, k1j.o1, false, 2, null);
        ((HabitPlanSettingVM) getMViewModel()).updateHabitPlanSettings(settings);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull final lm0 lm0Var) {
        Intrinsics.checkNotNullParameter(lm0Var, "<this>");
        lm0Var.C.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: ygb
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                HabitPlanSettingFragment.bindView$lambda$2(this.f40153a, z, iSwitchButton);
            }
        });
        lm0Var.D.setOnClickListener(new View.OnClickListener() { // from class: zgb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HabitPlanSettingFragment.bindView$lambda$3(this.f41247a, view);
            }
        });
        lm0Var.E.setSwitch(TrainingPlanPreference.INSTANCE.getSAVE_PLAN_TO_CALENDAR());
        lm0Var.E.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: ahb
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                HabitPlanSettingFragment.bindView$lambda$8(this.f1019a, lm0Var, z, iSwitchButton);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jvi.w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        DisplayUtil.setTranslucentStatusBar(mActivity);
        setActionBarDisplayable(false);
        Bundle arguments = getArguments();
        if (arguments != null) {
            long j = arguments.getLong(REQUEST_PLAN_ID);
            HabitPlanSettingVM habitPlanSettingVM = (HabitPlanSettingVM) getMViewModel();
            Bundle arguments2 = getArguments();
            Serializable serializable = arguments2 != null ? arguments2.getSerializable(KEY_HABIT_PLAN) : null;
            habitPlanSettingVM.setHabitPlan(serializable instanceof HabitPlan ? (HabitPlan) serializable : null);
            getMBinding().B.hideMore();
            getMBinding().B.setTitle(k1j.z1);
            PageState.DefaultImpls.showLoading$default(this, null, 0, false, 3, null);
            ((HabitPlanSettingVM) getMViewModel()).getHabitPlanSettings(j);
            ((HabitPlanSettingVM) getMViewModel()).getMGetHabitPlanSettings().observe(getViewLifecycleOwner(), new Observer() { // from class: wgb
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    HabitPlanSettingFragment.onViewCreated$lambda$0(this.f37939a, (SmartRunningRemindSettings) obj);
                }
            });
            ((HabitPlanSettingVM) getMViewModel()).getUpdateSettingsResult().observe(getViewLifecycleOwner(), new Observer() { // from class: xgb
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    HabitPlanSettingFragment.onViewCreated$lambda$1(this.f39094a, (SmartRunningRemindSettings) obj);
                }
            });
        }
    }
}
