package com.xiaomi.fitness.training_plan.settings;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.MultiplePermissionsBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.training_plan.net.SmartRunningRemindSettings;
import com.xiaomi.fitness.training_plan.settings.AbilityPlanSettingFragment;
import com.xiaomi.fitness.training_plan.util.RemindTimeUtils;
import com.xiaomi.fitness.training_plan.util.TrainingPlanPreference;
import com.xiaomi.fitness.training_plan.widget.AbilityDaySettingsDialog;
import com.xiaomi.fitness.training_plan.widget.TrainingRemindDialog;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlan;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.av6;
import defpackage.dih;
import defpackage.jvi;
import defpackage.k1j;
import defpackage.vg0;
import defpackage.yaa;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u00012B\u0007¢\u0006\u0004\b1\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0007J\u001f\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u0005*\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\"\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001f\u0010-\u001a\r\u0012\t\u0012\u00070\r¢\u0006\u0002\b*0'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/training_plan/settings/AbilityPlanSettingFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/training_plan/settings/AbilityPlanSettingVM;", "Lvg0;", "Lyaa;", "", "loadSettings", "()V", "Lcom/xiaomi/fitness/training_plan/net/SmartRunningRemindSettings;", "settings", "updateAbilityPlanSettingView", "(Lcom/xiaomi/fitness/training_plan/net/SmartRunningRemindSettings;)V", "showRemindTimeDialogIfNeed", "", "selectedDays", "", "type", "showDaySelectDialog", "(Ljava/lang/String;I)V", "", "isDays", "updateSettings", "(Lcom/xiaomi/fitness/training_plan/net/SmartRunningRemindSettings;Z)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "bindView", "(Lvg0;)V", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "data", "onFragmentResult", "(IILandroid/os/Bundle;)V", "", "planId", "J", "", "permissions", "[Ljava/lang/String;", "Lkotlin/jvm/internal/EnhancedNullability;", "getPermissionDescArray", "()[Ljava/lang/String;", "permissionDescArray", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AbilityPlanSettingFragment extends BaseBindingFragment<AbilityPlanSettingVM, vg0> implements yaa {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String KEY_ABILITY_PLAN = "key_ability_plan";

    @NotNull
    private static final String REQUEST_PLAN_ID = "REQUEST_PLAN_ID";
    private static final int RUNNING_DAY_RESULT_CODE = 1001;
    private static final int STRENGTH_DAY_RESULT_CODE = 1002;

    @NotNull
    private static final String TAG = "AbilityPlanSettingActivity";

    @NotNull
    private final String[] permissions = {"android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"};
    private long planId;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/training_plan/settings/AbilityPlanSettingFragment$Companion;", "", "<init>", "()V", "TAG", "", AbilityPlanSettingFragment.REQUEST_PLAN_ID, "KEY_ABILITY_PLAN", "RUNNING_DAY_RESULT_CODE", "", "STRENGTH_DAY_RESULT_CODE", "launch", "", "context", "Landroid/content/Context;", "planID", "", "abilityPlan", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlan;", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Context context, long planID, @Nullable AbilityPlan abilityPlan) {
            Intrinsics.checkNotNullParameter(context, "context");
            Bundle bundle = new Bundle();
            bundle.putLong(AbilityPlanSettingFragment.REQUEST_PLAN_ID, planID);
            bundle.putSerializable(AbilityPlanSettingFragment.KEY_ABILITY_PLAN, abilityPlan);
            dih.a().e(context, new FragmentParams.b().e(AbilityPlanSettingFragment.class).c(bundle).b());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AbilityPlanSettingVM access$getMViewModel(AbilityPlanSettingFragment abilityPlanSettingFragment) {
        return (AbilityPlanSettingVM) abilityPlanSettingFragment.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$10(AbilityPlanSettingFragment this$0, RightArrowBindingSingleLineTextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.showRemindTimeDialogIfNeed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$2(AbilityPlanSettingFragment this$0, RightArrowBindingSingleLineTextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.showDaySelectDialog(((AbilityPlanSettingVM) this$0.getMViewModel()).getRunningDays(), 1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$3(AbilityPlanSettingFragment this$0, RightArrowBindingSingleLineTextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.showDaySelectDialog(((AbilityPlanSettingVM) this$0.getMViewModel()).getStrengthDays(), 2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$4(AbilityPlanSettingFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updateSettings(new SmartRunningRemindSettings(z, ((AbilityPlanSettingVM) this$0.getMViewModel()).getReminderTime(), ((AbilityPlanSettingVM) this$0.getMViewModel()).getRunningDays(), ((AbilityPlanSettingVM) this$0.getMViewModel()).getStrengthDays()), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$9(final AbilityPlanSettingFragment this$0, final vg0 this_bindView, final boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        String[] strArr = this$0.permissions;
        PermissionExtKt.permissions(this$0, (String[]) Arrays.copyOf(strArr, strArr.length), this$0.getPermissionDescArray(), (Function1<? super MultiplePermissionsBuilder, Unit>) new Function1() { // from class: dp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AbilityPlanSettingFragment.bindView$lambda$9$lambda$8(z, this$0, this_bindView, (MultiplePermissionsBuilder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$9$lambda$8(final boolean z, final AbilityPlanSettingFragment this$0, final vg0 this_bindView, MultiplePermissionsBuilder permissions) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        Intrinsics.checkNotNullParameter(permissions, "$this$permissions");
        permissions.allGranted(new Function0() { // from class: po
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbilityPlanSettingFragment.bindView$lambda$9$lambda$8$lambda$6(z, this$0, this_bindView);
            }
        });
        permissions.denied(new Function1() { // from class: cp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AbilityPlanSettingFragment.bindView$lambda$9$lambda$8$lambda$7(this_bindView, this$0, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$9$lambda$8$lambda$6(boolean z, AbilityPlanSettingFragment this$0, final vg0 this_bindView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        if (z) {
            AbilityPlanSettingVM abilityPlanSettingVM = (AbilityPlanSettingVM) this$0.getMViewModel();
            Context contextRequireContext = this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            abilityPlanSettingVM.delAndAddAbilityToCalendar(contextRequireContext, new Function1() { // from class: cr
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return AbilityPlanSettingFragment.bindView$lambda$9$lambda$8$lambda$6$lambda$5(this_bindView, ((Boolean) obj).booleanValue());
                }
            });
        } else {
            TrainingPlanPreference.INSTANCE.setSAVE_PLAN_TO_CALENDAR(false);
            this_bindView.G.setSwitch(false);
            AbilityPlanSettingVM abilityPlanSettingVM2 = (AbilityPlanSettingVM) this$0.getMViewModel();
            Context contextRequireContext2 = this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            abilityPlanSettingVM2.deleteCalendarIfNeed(contextRequireContext2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$9$lambda$8$lambda$6$lambda$5(vg0 this_bindView, boolean z) {
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        TrainingPlanPreference.INSTANCE.setSAVE_PLAN_TO_CALENDAR(z);
        if (!z) {
            this_bindView.G.setSwitch(z);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$9$lambda$8$lambda$7(vg0 this_bindView, final AbilityPlanSettingFragment this$0, List it) {
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this_bindView.G.setSwitch(false);
        TrainingPlanPreference.INSTANCE.setSAVE_PLAN_TO_CALENDAR(false);
        if (!this$0.shouldShowRequestPermissionRationale(this$0.permissions[0]) || !this$0.shouldShowRequestPermissionRationale(this$0.permissions[1])) {
            CommonDialog.c cVar = new CommonDialog.c("CardManagerFragment.delete.mi");
            cVar.setDialogTitle(new DialogParams.DialogDescriptionString(k1j.f23327k, new Object[0]));
            cVar.setDialogDescriptionString(new DialogParams.DialogDescriptionString(k1j.j, new Object[0]));
            cVar.setPositiveText(k1j.v0);
            cVar.setNegativeText(k1j.f);
            CommonDialog commonDialogCreate = cVar.create();
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.training_plan.settings.AbilityPlanSettingFragment$bindView$4$1$2$1
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

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadSettings() {
        PageState.DefaultImpls.showLoading$default(this, k1j.o1, false, 2, null);
        ((AbilityPlanSettingVM) getMViewModel()).getAbilityPlanSettings(this.planId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(AbilityPlanSettingFragment this$0, SmartRunningRemindSettings smartRunningRemindSettings) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        this$0.updateAbilityPlanSettingView(smartRunningRemindSettings);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showDaySelectDialog(String selectedDays, int type) {
        int i = type == 1 ? 2 : 0;
        int i2 = type == 1 ? 6 : 5;
        int[] selectedDays2 = ((AbilityPlanSettingVM) getMViewModel()).getSelectedDays(selectedDays);
        int i3 = type == 1 ? k1j.v1 : k1j.p1;
        int i4 = type == 1 ? 1001 : 1002;
        AbilityDaySettingsDialog abilityDaySettingsDialogCreate = AbilityDaySettingsDialog.INSTANCE.defaultBuilder("ability_plan_days_setting").setNegativeText(k1j.common_cancel).setPositiveText(k1j.g).create();
        abilityDaySettingsDialogCreate.initSettings(i2, i, ArraysKt___ArraysKt.toList(selectedDays2), i3);
        abilityDaySettingsDialogCreate.setRequestCode(i4);
        abilityDaySettingsDialogCreate.showIfNeed(getChildFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showRemindTimeDialogIfNeed() {
        final TrainingRemindDialog trainingRemindDialogCreate = TrainingRemindDialog.INSTANCE.defaultBuilder("add time switcher").setDialogTitle(k1j.y1).setNegativeText(k1j.f).setPositiveText(k1j.g).create();
        RemindTimeUtils remindTimeUtils = RemindTimeUtils.INSTANCE;
        int remindTimeHour = remindTimeUtils.getRemindTimeHour(((AbilityPlanSettingVM) getMViewModel()).getReminderTime());
        int remindTimeMinute = remindTimeUtils.getRemindTimeMinute(((AbilityPlanSettingVM) getMViewModel()).getReminderTime());
        trainingRemindDialogCreate.setCurrentHour(remindTimeHour);
        trainingRemindDialogCreate.setCurrentMinute(remindTimeMinute);
        trainingRemindDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.training_plan.settings.AbilityPlanSettingFragment.showRemindTimeDialogIfNeed.1
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
                if (!TextUtils.equals(str, AbilityPlanSettingFragment.access$getMViewModel(this).getReminderTime())) {
                    AbilityPlanSettingFragment abilityPlanSettingFragment = this;
                    abilityPlanSettingFragment.updateSettings(new SmartRunningRemindSettings(AbilityPlanSettingFragment.access$getMViewModel(abilityPlanSettingFragment).getReminderSwitch(), str, AbilityPlanSettingFragment.access$getMViewModel(this).getRunningDays(), AbilityPlanSettingFragment.access$getMViewModel(this).getStrengthDays()), false);
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        trainingRemindDialogCreate.showIfNeed(getParentFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateAbilityPlanSettingView(SmartRunningRemindSettings settings) {
        if (settings == null) {
            return;
        }
        String runningDays = settings.getRunningDays();
        if (runningDays != null && runningDays.length() != 0) {
            getMBinding().D.setRemindText(((AbilityPlanSettingVM) getMViewModel()).getCustomRepeatFormatString(((AbilityPlanSettingVM) getMViewModel()).getSelectedDays(settings.getRunningDays())));
        }
        String strengthDays = settings.getStrengthDays();
        if (strengthDays != null && strengthDays.length() != 0) {
            getMBinding().C.setRemindText(((AbilityPlanSettingVM) getMViewModel()).getCustomRepeatFormatString(((AbilityPlanSettingVM) getMViewModel()).getSelectedDays(settings.getStrengthDays())));
        }
        getMBinding().E.setSwitch(settings.getRemindSwitch());
        getMBinding().F.setRemindText(settings.getRemindTime());
        if (!settings.getRemindSwitch()) {
            RightArrowBindingSingleLineTextView trainingPlanSettingsRemindTime = getMBinding().F;
            Intrinsics.checkNotNullExpressionValue(trainingPlanSettingsRemindTime, "trainingPlanSettingsRemindTime");
            ViewExtKt.gone(trainingPlanSettingsRemindTime);
        } else {
            RightArrowBindingSingleLineTextView trainingPlanSettingsRemindTime2 = getMBinding().F;
            Intrinsics.checkNotNullExpressionValue(trainingPlanSettingsRemindTime2, "trainingPlanSettingsRemindTime");
            ViewExtKt.visible(trainingPlanSettingsRemindTime2);
            getMBinding().F.setRemindText(settings.getRemindTime());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void updateSettings(SmartRunningRemindSettings settings, boolean isDays) {
        PageState.DefaultImpls.showLoading$default(this, k1j.o1, false, 2, null);
        AbilityPlanSettingVM abilityPlanSettingVM = (AbilityPlanSettingVM) getMViewModel();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        abilityPlanSettingVM.updateAbilityPlanSettings(contextRequireContext, settings, isDays);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull final vg0 vg0Var) {
        Intrinsics.checkNotNullParameter(vg0Var, "<this>");
        ViewExtKt.clickWithTrigger$default(vg0Var.D, 0L, new Function1() { // from class: ip
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AbilityPlanSettingFragment.bindView$lambda$2(this.f21961a, (RightArrowBindingSingleLineTextView) obj);
            }
        }, 1, null);
        ViewExtKt.clickWithTrigger$default(vg0Var.C, 0L, new Function1() { // from class: jp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AbilityPlanSettingFragment.bindView$lambda$3(this.f22988a, (RightArrowBindingSingleLineTextView) obj);
            }
        }, 1, null);
        vg0Var.E.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: tp
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                AbilityPlanSettingFragment.bindView$lambda$4(this.f34901a, z, iSwitchButton);
            }
        });
        vg0Var.G.setSwitch(TrainingPlanPreference.INSTANCE.getSAVE_PLAN_TO_CALENDAR());
        vg0Var.G.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: bq
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                AbilityPlanSettingFragment.bindView$lambda$9(this.f4474a, vg0Var, z, iSwitchButton);
            }
        });
        ViewExtKt.clickWithTrigger$default(getMBinding().F, 0L, new Function1() { // from class: yq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AbilityPlanSettingFragment.bindView$lambda$10(this.f40414a, (RightArrowBindingSingleLineTextView) obj);
            }
        }, 1, null);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jvi.p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yaa
    public void onFragmentResult(int requestCode, int resultCode, @NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (resultCode != -1) {
            Logger.d(TAG, "user cancel day setting!!");
            return;
        }
        if (requestCode == 1001) {
            updateSettings(new SmartRunningRemindSettings(((AbilityPlanSettingVM) getMViewModel()).getReminderSwitch(), ((AbilityPlanSettingVM) getMViewModel()).getReminderTime(), data.getString(AbilityDaySettingsDialog.KEY_SELECTED_DAY_OF_WEEK), ((AbilityPlanSettingVM) getMViewModel()).getStrengthDays()), true);
        } else {
            if (requestCode != 1002) {
                return;
            }
            updateSettings(new SmartRunningRemindSettings(((AbilityPlanSettingVM) getMViewModel()).getReminderSwitch(), ((AbilityPlanSettingVM) getMViewModel()).getReminderTime(), ((AbilityPlanSettingVM) getMViewModel()).getRunningDays(), data.getString(AbilityDaySettingsDialog.KEY_SELECTED_DAY_OF_WEEK)), true);
        }
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
        this.planId = arguments != null ? arguments.getLong(REQUEST_PLAN_ID, 0L) : 0L;
        Bundle arguments2 = getArguments();
        Serializable serializable = arguments2 != null ? arguments2.getSerializable(KEY_ABILITY_PLAN) : null;
        AbilityPlan abilityPlan = serializable instanceof AbilityPlan ? (AbilityPlan) serializable : null;
        if (abilityPlan != null && (!abilityPlan.getPlanCourseList().isEmpty())) {
            ((AbilityPlanSettingVM) getMViewModel()).handleDayPlans(abilityPlan);
        }
        if (this.planId == 0) {
            Logger.i(TAG, "can not set ability with empty planId!!");
            finish();
        }
        getMBinding().B.setTitle(k1j.z1);
        getMBinding().B.hideMore();
        ((AbilityPlanSettingVM) getMViewModel()).getMAbilityPlanSettings().observe(getViewLifecycleOwner(), new Observer() { // from class: gp
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                AbilityPlanSettingFragment.onViewCreated$lambda$1(this.f19198a, (SmartRunningRemindSettings) obj);
            }
        });
        loadSettings();
    }
}
