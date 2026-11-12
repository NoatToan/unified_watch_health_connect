package com.xiaomi.fitness.devicesettings.bluttooth.sleepmodel;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.devicesettings.bluttooth.sleepmodel.SleepModelFragment;
import com.xiaomi.fitness.devicesettings.common.TimePickerDialog;
import com.xiaomi.fitness.devicesettings.export.DeviceSettingsExportPreference;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.av6;
import defpackage.bw1;
import defpackage.eca;
import defpackage.eui;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\"B\u0007¢\u0006\u0004\b!\u0010\u000fJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0016\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u000fJ\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u000fR\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/sleepmodel/SleepModelFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/sleepmodel/SleepModelViewModel;", "Leca;", "", "code", "", "showLoadToast", "(I)V", "showSetToast", "", "isSleep", "setTimeZone", "(Z)V", "hideDelayLoading", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_PAUSE, "Lcom/xiaomi/fitness/devicesettings/bluttooth/sleepmodel/SleepModelData;", "originSleepModelData", "Lcom/xiaomi/fitness/devicesettings/bluttooth/sleepmodel/SleepModelData;", "hasGoMiuiSetting", "Z", "", "showLoadingTime", "J", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepModelFragment extends Hilt_SleepModelFragment<SleepModelViewModel, eca> {

    @NotNull
    public static final String KEY_SCHEDULE_TIME = "key_schedule_time";

    @NotNull
    public static final String KEY_SYNC_SCHEDULE = "key_sync_schedule";

    @NotNull
    private static final String TAG = "SleepModelFragment";
    private boolean hasGoMiuiSetting;

    @NotNull
    private SleepModelData originSleepModelData;
    private long showLoadingTime;

    public SleepModelFragment() {
        super(eui.z2, bw1.f);
        this.originSleepModelData = SleepModelManager.INSTANCE.initWhileFirst();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ eca access$getMBinding(SleepModelFragment sleepModelFragment) {
        return (eca) sleepModelFragment.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ SleepModelViewModel access$getMViewModel(SleepModelFragment sleepModelFragment) {
        return (SleepModelViewModel) sleepModelFragment.getMViewModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void hideDelayLoading() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.showLoadingTime;
        if (jCurrentTimeMillis >= 500) {
            hideLoading();
        } else {
            ((eca) getMBinding()).D.postDelayed(new Runnable() { // from class: gqm
                @Override // java.lang.Runnable
                public final void run() {
                    SleepModelFragment.hideDelayLoading$lambda$7(this.f19245a);
                }
            }, ((long) 500) - jCurrentTimeMillis);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideDelayLoading$lambda$7(SleepModelFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(SleepModelFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(num);
        this$0.showLoadToast(num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(SleepModelFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(num);
        this$0.showSetToast(num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$2(final SleepModelFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!z || ((SleepModelViewModel) this$0.getMViewModel()).getMModel().getStatus() != 2) {
            ((SleepModelViewModel) this$0.getMViewModel()).onSyncSystemScheduleCheck(z);
        } else {
            ((SleepModelViewModel) this$0.getMViewModel()).getMModel().getSwitchOn().postValue(Boolean.FALSE);
            new CommonDialog.c("go to set schedule").setDialogDescription(wzi.k8).setPositiveText(wzi.a2).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.sleepmodel.SleepModelFragment$setListener$1$1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -1) {
                        this.this$0.hasGoMiuiSetting = true;
                        Intent intent = new Intent();
                        intent.setAction("com.android.deskclock.BEDTIME_MANAGE");
                        intent.setFlags(268435456);
                        ApplicationExtKt.getApplication().startActivity(intent);
                    }
                }
            }).showIfNeed(this$0.getParentFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$3(SleepModelFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((SleepModelViewModel) this$0.getMViewModel()).onCustomizeScheduleViewCheck(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$4(SleepModelFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((SleepModelViewModel) this$0.getMViewModel()).onSetAlarmViewCheck(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$5(SleepModelFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setTimeZone(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$6(SleepModelFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setTimeZone(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setTimeZone(final boolean isSleep) {
        final TimePickerDialog timePickerDialogCreate = TimePickerDialog.INSTANCE.defaultBuilder("sleep model time picker").setDialogTitle(isSleep ? wzi.l7 : wzi.i9).setCancelable(false).setPositiveText(wzi.g).setNegativeText(wzi.e).create();
        final SleepModelData sleepModelData = ((SleepModelViewModel) getMViewModel()).getMModel().getSleepModelData();
        timePickerDialogCreate.setCurrentHour(isSleep ? sleepModelData.getSleep_hour() : sleepModelData.getWake_hour());
        timePickerDialogCreate.setCurrentMinute(isSleep ? sleepModelData.getSleep_minute() : sleepModelData.getWake_minute());
        timePickerDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.sleepmodel.SleepModelFragment.setTimeZone.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } else {
                    if (which != -1) {
                        return;
                    }
                    if (isSleep) {
                        sleepModelData.setSleep_hour(timePickerDialogCreate.getCurrentHour());
                        sleepModelData.setSleep_minute(timePickerDialogCreate.getCurrentMinute());
                        SleepModelFragment.access$getMBinding(this).F.setRemindText(TimeDateUtil.INSTANCE.getTimeByHourMinute(sleepModelData.getSleep_hour(), sleepModelData.getSleep_minute()));
                    } else {
                        sleepModelData.setWake_hour(timePickerDialogCreate.getCurrentHour());
                        sleepModelData.setWake_minute(timePickerDialogCreate.getCurrentMinute());
                        SleepModelFragment.access$getMBinding(this).H.setRemindText(TimeDateUtil.INSTANCE.getTimeByHourMinute(sleepModelData.getWake_hour(), sleepModelData.getWake_minute()));
                    }
                    SleepModelFragment.access$getMViewModel(this).updateSleepModel(2);
                }
            }
        });
        timePickerDialogCreate.showIfNeed(getParentFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showLoadToast(int code) {
        if (code == 0) {
            this.originSleepModelData = ((SleepModelViewModel) getMViewModel()).getMModel().getSleepModelData();
            hideLoading();
        } else {
            if (code != 1) {
                Context context = getContext();
                if (context != null) {
                    ToastExtKt.toastShort(context, wzi.i2);
                    return;
                }
                return;
            }
            Context context2 = getContext();
            if (context2 != null) {
                ToastExtKt.toastShort(context2, wzi.y4);
            }
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showSetToast(int code) {
        int i;
        Context context = getContext();
        if (context != null) {
            if (code == 0) {
                this.originSleepModelData = ((SleepModelViewModel) getMViewModel()).getMModel().getSleepModelData();
                hideLoading();
                i = wzi.common_set_success;
            } else if (code != 1) {
                i = wzi.i2;
            } else {
                finish();
                i = wzi.y4;
            }
            ToastExtKt.toastShort(context, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.hasGoMiuiSetting = ((SleepModelViewModel) getMViewModel()).getMModel().getSupportSyncMiuiSleepModel().get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() throws Throwable {
        super.onResume();
        showLoading();
        this.showLoadingTime = System.currentTimeMillis();
        if (!this.hasGoMiuiSetting) {
            ((SleepModelViewModel) getMViewModel()).loadSleepModelData();
            return;
        }
        this.hasGoMiuiSetting = false;
        SleepModelManager sleepModelManager = SleepModelManager.INSTANCE;
        SleepModelData sleepModelDataByMIUI = sleepModelManager.getSleepModelDataByMIUI();
        int scheduleStatus = sleepModelManager.getScheduleStatus(sleepModelDataByMIUI);
        if (sleepModelDataByMIUI == null) {
            hideDelayLoading();
            return;
        }
        if (Intrinsics.areEqual(sleepModelDataByMIUI, this.originSleepModelData)) {
            ((SleepModelViewModel) getMViewModel()).loadSleepModelData();
            return;
        }
        Logger.i(TAG, "goto miui clock and change schedule");
        ?? r0 = scheduleStatus == 1 ? 1 : 0;
        DeviceSettingsExportPreference.INSTANCE.setKEY_IS_SYNC_SLEEP_MODEL(r0);
        sleepModelDataByMIUI.setGetupClock(((SleepModelViewModel) getMViewModel()).getMModel().getSleepModelData().getGetupClock());
        ((SleepModelViewModel) getMViewModel()).getMModel().setStatus(scheduleStatus);
        ((SleepModelViewModel) getMViewModel()).getMModel().setSleepModelData(sleepModelDataByMIUI);
        ((SleepModelViewModel) getMViewModel()).updateSleepModel(r0);
        hideDelayLoading();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.g7);
        ((SleepModelViewModel) getMViewModel()).getLoadCode().observe(getViewLifecycleOwner(), new SleepModelFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: zpm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepModelFragment.onViewCreated$lambda$0(this.f41554a, (Integer) obj);
            }
        }));
        ((SleepModelViewModel) getMViewModel()).getSetCode().observe(getViewLifecycleOwner(), new SleepModelFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: aqm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepModelFragment.onViewCreated$lambda$1(this.f3359a, (Integer) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((eca) getMBinding()).G.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: bqm
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                SleepModelFragment.setListener$lambda$2(this.f4487a, z, iSwitchButton);
            }
        });
        ((eca) getMBinding()).A.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: cqm
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                SleepModelFragment.setListener$lambda$3(this.f14623a, z, iSwitchButton);
            }
        });
        ((eca) getMBinding()).C.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: dqm
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                SleepModelFragment.setListener$lambda$4(this.f15818a, z, iSwitchButton);
            }
        });
        ((eca) getMBinding()).F.setOnClickListener(new View.OnClickListener() { // from class: eqm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepModelFragment.setListener$lambda$5(this.f16970a, view);
            }
        });
        ((eca) getMBinding()).H.setOnClickListener(new View.OnClickListener() { // from class: fqm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepModelFragment.setListener$lambda$6(this.f18092a, view);
            }
        });
    }
}
