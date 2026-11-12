package com.xiaomi.fitness.health.sleep.ui.setting;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.xiaomi.fitness.auto.start.AutoStarterImpl;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.health.sleep.ui.setting.SleepPermissionSettingFragment;
import com.xiaomi.fitness.health.sleep.ui.setting.util.RemindTextConverter;
import com.xiaomi.fitness.health.sleep.ui.setting.util.SleepPermissionSettingUtil;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.av6;
import defpackage.c0j;
import defpackage.d2m;
import defpackage.jui;
import defpackage.mvb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J!\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0006R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/setting/SleepPermissionSettingFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/sleep/ui/setting/SleepSettingViewModel;", "Lmvb;", "", "refreshSleepPermissionSettingInstruction", "()V", "setUpRunInBgWithoutRestrictionSettingClickListener", "refreshRunInBgRestLevelDisplayText", "setUpAutoStartSwitchOnCheckedChange", "refreshAutoStartSwitch", "showCloseAutoStartConfirmationDialog", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "", "autoStartEnabled", "Z", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepPermissionSettingFragment extends Hilt_SleepPermissionSettingFragment<SleepSettingViewModel, mvb> {

    @NotNull
    public static final String TAG = "SleepPermissionSettingFragment";
    private boolean autoStartEnabled;

    public SleepPermissionSettingFragment() {
        super(jui.J3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshAutoStartSwitch() {
        this.autoStartEnabled = SleepPermissionSettingUtil.INSTANCE.getAutoStartEnabled();
        ((mvb) getMBinding()).A.setSwitch(this.autoStartEnabled);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshRunInBgRestLevelDisplayText() {
        ((SleepSettingViewModel) getMViewModel()).getRestrictionLevelLiveData().observe(getViewLifecycleOwner(), new SleepPermissionSettingFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: wqm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepPermissionSettingFragment.refreshRunInBgRestLevelDisplayText$lambda$2(this.f38262a, (Integer) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit refreshRunInBgRestLevelDisplayText$lambda$2(SleepPermissionSettingFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RemindTextConverter remindTextConverter = RemindTextConverter.INSTANCE;
        Intrinsics.checkNotNull(num);
        int iIntValue = num.intValue();
        RightArrowTwoLineTextView runInBackground = ((mvb) this$0.getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(runInBackground, "runInBackground");
        remindTextConverter.refreshRunInBgNoRestrictionDisplayTextVew(iIntValue, runInBackground);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshSleepPermissionSettingInstruction() {
        ((SleepSettingViewModel) getMViewModel()).isNoRestrictedLevelLiveData().observe(getViewLifecycleOwner(), new SleepPermissionSettingFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: uqm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepPermissionSettingFragment.refreshSleepPermissionSettingInstruction$lambda$0(this.f36038a, (Boolean) obj);
            }
        }));
        ((SleepSettingViewModel) getMViewModel()).queryRestrictionLevel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit refreshSleepPermissionSettingInstruction$lambda$0(SleepPermissionSettingFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SleepPermissionSettingUtil sleepPermissionSettingUtil = SleepPermissionSettingUtil.INSTANCE;
        TextView guideText = ((mvb) this$0.getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(guideText, "guideText");
        sleepPermissionSettingUtil.updateSleepPermissionSettingInstructionCard(null, guideText, Boolean.valueOf(this$0.autoStartEnabled), bool);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setUpAutoStartSwitchOnCheckedChange() {
        ((mvb) getMBinding()).A.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: vqm
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                SleepPermissionSettingFragment.setUpAutoStartSwitchOnCheckedChange$lambda$3(this.f37141a, z, iSwitchButton);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setUpAutoStartSwitchOnCheckedChange$lambda$3(SleepPermissionSettingFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(TAG, "setUpAutoStartSwitchOnCheckedChange autoStart getSwitch=" + ((mvb) this$0.getMBinding()).A.getSwitch());
        if (!z && AutoStarterImpl.INSTANCE.isAppNeedAutoStart()) {
            ((mvb) this$0.getMBinding()).A.setSwitch(true);
            this$0.showCloseAutoStartConfirmationDialog();
        } else {
            this$0.autoStartEnabled = z;
            SleepPermissionSettingUtil.INSTANCE.setAutoStart(z);
            this$0.refreshSleepPermissionSettingInstruction();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setUpRunInBgWithoutRestrictionSettingClickListener() {
        ((mvb) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: xqm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepPermissionSettingFragment.setUpRunInBgWithoutRestrictionSettingClickListener$lambda$1(this.f39371a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpRunInBgWithoutRestrictionSettingClickListener$lambda$1(SleepPermissionSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2m.r(this$0.requireActivity());
    }

    private final void showCloseAutoStartConfirmationDialog() {
        CommonDialog commonDialogCreate = new CommonDialog.c(getString(c0j.b5)).setDialogTitle(c0j.b5).setDialogDescription(c0j.a5).setPositiveText(c0j.I8).setNegativeText(c0j.c).setCancelable(true).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        Intrinsics.checkNotNull(commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.health.sleep.ui.setting.SleepPermissionSettingFragment.showCloseAutoStartConfirmationDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                super.onDialogClick(dialogName, dialog, which);
                if (which == -1) {
                    d2m.d(SleepPermissionSettingFragment.this.requireActivity());
                }
            }
        }), "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
        commonDialogCreate.showIfNeed(requireActivity().getSupportFragmentManager());
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        refreshAutoStartSwitch();
        refreshRunInBgRestLevelDisplayText();
        refreshSleepPermissionSettingInstruction();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(c0j.Ah);
        setUpAutoStartSwitchOnCheckedChange();
        setUpRunInBgWithoutRestrictionSettingClickListener();
    }
}
