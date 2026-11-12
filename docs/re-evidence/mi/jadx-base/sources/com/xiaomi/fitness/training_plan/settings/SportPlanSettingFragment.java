package com.xiaomi.fitness.training_plan.settings;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.baseui.common.NetworkFallbackExtKt;
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
import com.xiaomi.fitness.training_plan.settings.SportPlanSettingFragment;
import com.xiaomi.fitness.training_plan.util.RemindTimeUtils;
import com.xiaomi.fitness.training_plan.util.TrainingPlanPreference;
import com.xiaomi.fitness.training_plan.widget.TrainingRemindDialog;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.av6;
import defpackage.dih;
import defpackage.jvi;
import defpackage.k1j;
import defpackage.po0;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 .2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001.B\u0007¢\u0006\u0004\b-\u0010\nJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u0006*\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001f\u0010*\u001a\r\u0012\t\u0012\u00070\r¢\u0006\u0002\b'0$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\"¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/training_plan/settings/SportPlanSettingFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/training_plan/settings/SportPlanSettingVM;", "Lpo0;", "Lcom/xiaomi/fitness/training_plan/net/SmartRunningRemindSettings;", "settings", "", "updateSportPlanSettingView", "(Lcom/xiaomi/fitness/training_plan/net/SmartRunningRemindSettings;)V", "showRemindTimeDialogIfNeed", "()V", "", "remindSwitch", "", "remindTime", "updateSettings", "(ZLjava/lang/String;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "bindView", "(Lpo0;)V", "", "planID$delegate", "Lkotlin/Lazy;", "getPlanID", "()J", "planID", "", "planType$delegate", "getPlanType", "()I", "planType", "", "permissions", "[Ljava/lang/String;", "Lkotlin/jvm/internal/EnhancedNullability;", "getPermissionDescArray", "()[Ljava/lang/String;", "permissionDescArray", "getLayoutId", "layoutId", "<init>", "Companion", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportPlanSettingFragment extends BaseBindingFragment<SportPlanSettingVM, po0> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String REQUEST_PLAN_ID = "REQUEST_PLAN_ID";

    @NotNull
    private static final String REQUEST_PLAN_TYPE = "request_plan_type";

    @NotNull
    private static final String TAG = "SportPlanSettingFragment";

    /* JADX INFO: renamed from: planID$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy planID = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ksn
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Long.valueOf(SportPlanSettingFragment.planID_delegate$lambda$0(this.f24267a));
        }
    });

    /* JADX INFO: renamed from: planType$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy planType = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: nsn
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(SportPlanSettingFragment.planType_delegate$lambda$1(this.f28333a));
        }
    });

    @NotNull
    private final String[] permissions = {"android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"};

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/training_plan/settings/SportPlanSettingFragment$Companion;", "", "<init>", "()V", "TAG", "", SportPlanSettingFragment.REQUEST_PLAN_ID, "REQUEST_PLAN_TYPE", "launch", "", "context", "Landroid/content/Context;", "planID", "", "planType", "", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Context context, long planID, int planType) {
            Intrinsics.checkNotNullParameter(context, "context");
            Bundle bundle = new Bundle();
            bundle.putLong(SportPlanSettingFragment.REQUEST_PLAN_ID, planID);
            bundle.putInt(SportPlanSettingFragment.REQUEST_PLAN_TYPE, planType);
            dih.a().e(context, new FragmentParams.b().e(SportPlanSettingFragment.class).c(bundle).b());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ SportPlanSettingVM access$getMViewModel(SportPlanSettingFragment sportPlanSettingFragment) {
        return (SportPlanSettingVM) sportPlanSettingFragment.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$10(final SportPlanSettingFragment this$0, final po0 this_bindView, final boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        String[] strArr = this$0.permissions;
        PermissionExtKt.permissions(this$0, (String[]) Arrays.copyOf(strArr, strArr.length), this$0.getPermissionDescArray(), (Function1<? super MultiplePermissionsBuilder, Unit>) new Function1() { // from class: tsn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportPlanSettingFragment.bindView$lambda$10$lambda$9(this.f35002a, z, this_bindView, (MultiplePermissionsBuilder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$10$lambda$9(final SportPlanSettingFragment this$0, final boolean z, final po0 this_bindView, MultiplePermissionsBuilder permissions) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        Intrinsics.checkNotNullParameter(permissions, "$this$permissions");
        permissions.allGranted(new Function0() { // from class: usn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportPlanSettingFragment.bindView$lambda$10$lambda$9$lambda$7(this.f36092a, z, this_bindView);
            }
        });
        permissions.denied(new Function1() { // from class: vsn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportPlanSettingFragment.bindView$lambda$10$lambda$9$lambda$8(this_bindView, this$0, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$10$lambda$9$lambda$7(final SportPlanSettingFragment this$0, boolean z, po0 this_bindView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        Logger.i(TAG, "Calender allGranted");
        this$0.showLoading();
        if (z) {
            Logger.i(TAG, "Calender delAndAddSportToCalendar start");
            SportPlanSettingVM sportPlanSettingVM = (SportPlanSettingVM) this$0.getMViewModel();
            Context contextRequireContext = this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            sportPlanSettingVM.delAndAddSportToCalendar(contextRequireContext, new Function1() { // from class: osn
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportPlanSettingFragment.bindView$lambda$10$lambda$9$lambda$7$lambda$6(this.f29653a, ((Boolean) obj).booleanValue());
                }
            });
        } else {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), Dispatchers.getMain(), null, new SportPlanSettingFragment$bindView$3$1$1$2(this_bindView, this$0, null), 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$10$lambda$9$lambda$7$lambda$6(SportPlanSettingFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "Calender delAndAddSportToCalendar result：" + z);
        TrainingPlanPreference.INSTANCE.setSAVE_PLAN_TO_CALENDAR(z);
        this$0.hideLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$10$lambda$9$lambda$8(po0 this_bindView, final SportPlanSettingFragment this$0, List it) {
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "Calender denied");
        this_bindView.E.setSwitch(false);
        TrainingPlanPreference.INSTANCE.setSAVE_PLAN_TO_CALENDAR(false);
        if (!this$0.shouldShowRequestPermissionRationale(this$0.permissions[0]) || !this$0.shouldShowRequestPermissionRationale(this$0.permissions[1])) {
            CommonDialog.c cVar = new CommonDialog.c("CardManagerFragment.delete.mi");
            cVar.setDialogTitle(new DialogParams.DialogDescriptionString(k1j.f23327k, new Object[0]));
            cVar.setDialogDescriptionString(new DialogParams.DialogDescriptionString(k1j.j, new Object[0]));
            cVar.setPositiveText(k1j.v0);
            cVar.setNegativeText(k1j.f);
            CommonDialog commonDialogCreate = cVar.create();
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.training_plan.settings.SportPlanSettingFragment$bindView$3$1$2$1
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$4(SportPlanSettingFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updateSettings(z, ((SportPlanSettingVM) this$0.getMViewModel()).getReminderTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$5(SportPlanSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showRemindTimeDialogIfNeed();
    }

    private final String[] getPermissionDescArray() {
        return new String[]{ApplicationExtKt.getApplication().getString(k1j.j), " "};
    }

    private final long getPlanID() {
        return ((Number) this.planID.getValue()).longValue();
    }

    private final int getPlanType() {
        return ((Number) this.planType.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(SportPlanSettingFragment this$0, SmartRunningRemindSettings smartRunningRemindSettings) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        this$0.updateSportPlanSettingView(smartRunningRemindSettings);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3(SportPlanSettingFragment this$0, SmartRunningRemindSettings smartRunningRemindSettings) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        this$0.updateSportPlanSettingView(smartRunningRemindSettings);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long planID_delegate$lambda$0(SportPlanSettingFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle arguments = this$0.getArguments();
        if (arguments != null) {
            return arguments.getLong(REQUEST_PLAN_ID);
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int planType_delegate$lambda$1(SportPlanSettingFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle arguments = this$0.getArguments();
        if (arguments != null) {
            return arguments.getInt(REQUEST_PLAN_TYPE);
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showRemindTimeDialogIfNeed() {
        final TrainingRemindDialog trainingRemindDialogCreate = TrainingRemindDialog.INSTANCE.defaultBuilder("add time switcher").setDialogTitle(k1j.y1).setNegativeText(k1j.f).setPositiveText(k1j.g).create();
        RemindTimeUtils remindTimeUtils = RemindTimeUtils.INSTANCE;
        int remindTimeHour = remindTimeUtils.getRemindTimeHour(((SportPlanSettingVM) getMViewModel()).getReminderTime());
        int remindTimeMinute = remindTimeUtils.getRemindTimeMinute(((SportPlanSettingVM) getMViewModel()).getReminderTime());
        trainingRemindDialogCreate.setCurrentHour(remindTimeHour);
        trainingRemindDialogCreate.setCurrentMinute(remindTimeMinute);
        trainingRemindDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.training_plan.settings.SportPlanSettingFragment.showRemindTimeDialogIfNeed.1
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
                if (!TextUtils.equals(str, SportPlanSettingFragment.access$getMViewModel(this).getReminderTime())) {
                    SportPlanSettingFragment sportPlanSettingFragment = this;
                    sportPlanSettingFragment.updateSettings(SportPlanSettingFragment.access$getMViewModel(sportPlanSettingFragment).getReminderSwitch(), str);
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        trainingRemindDialogCreate.showIfNeed(getParentFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSettings(final boolean remindSwitch, final String remindTime) {
        NetworkFallbackExtKt.checkNetworkAndProcessIfAvailable(new Function0() { // from class: psn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportPlanSettingFragment.updateSettings$lambda$11(this.f30712a, remindSwitch, remindTime);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit updateSettings$lambda$11(SportPlanSettingFragment this$0, boolean z, String remindTime) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(remindTime, "$remindTime");
        PageState.DefaultImpls.showLoading$default(this$0, k1j.o1, false, 2, null);
        ((SportPlanSettingVM) this$0.getMViewModel()).updateSportPlanSettings(this$0.getPlanID(), this$0.getPlanType(), z, remindTime);
        return Unit.INSTANCE;
    }

    private final void updateSportPlanSettingView(SmartRunningRemindSettings settings) {
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

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull final po0 po0Var) {
        Intrinsics.checkNotNullParameter(po0Var, "<this>");
        po0Var.C.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: qsn
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                SportPlanSettingFragment.bindView$lambda$4(this.f31809a, z, iSwitchButton);
            }
        });
        po0Var.D.setOnClickListener(new View.OnClickListener() { // from class: rsn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportPlanSettingFragment.bindView$lambda$5(this.f32867a, view);
            }
        });
        po0Var.E.setSwitch(TrainingPlanPreference.INSTANCE.getSAVE_PLAN_TO_CALENDAR());
        po0Var.E.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: ssn
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                SportPlanSettingFragment.bindView$lambda$10(this.f33952a, po0Var, z, iSwitchButton);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jvi.z;
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
        getMBinding().B.hideMore();
        getMBinding().B.setTitle(k1j.z1);
        PageState.DefaultImpls.showLoading$default(this, null, 0, false, 3, null);
        ((SportPlanSettingVM) getMViewModel()).getSportPlanSettings(getPlanID(), getPlanType());
        ((SportPlanSettingVM) getMViewModel()).getMGetSportPlanSettings().observe(getViewLifecycleOwner(), new Observer() { // from class: lsn
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SportPlanSettingFragment.onViewCreated$lambda$2(this.f25405a, (SmartRunningRemindSettings) obj);
            }
        });
        ((SportPlanSettingVM) getMViewModel()).getUpdateSettingsResult().observe(getViewLifecycleOwner(), new Observer() { // from class: msn
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SportPlanSettingFragment.onViewCreated$lambda$3(this.f27166a, (SmartRunningRemindSettings) obj);
            }
        });
    }
}
