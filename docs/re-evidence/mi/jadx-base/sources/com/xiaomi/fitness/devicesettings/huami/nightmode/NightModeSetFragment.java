package com.xiaomi.fitness.devicesettings.huami.nightmode;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.fitness.permission.manager.export.IPermissionManager;
import com.fitness.permission.manager.export.PermissionExportExtKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.extensions.MultiplePermissionsBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.SystemSetting;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment;
import com.xiaomi.fitness.devicesettings.common.TimePickerDialog;
import com.xiaomi.fitness.devicesettings.huami.nightmode.NightModeSetFragment;
import com.xiaomi.fitness.settingitem.settingitem.NightMode;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import defpackage.ai6;
import defpackage.av6;
import defpackage.eui;
import defpackage.n1j;
import defpackage.wzi;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\"\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J!\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/nightmode/NightModeSetFragment;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/huami/nightmode/NightModeSetViewModel;", "Lai6;", "", "setViewStatus", "()V", "", "startAndStopIsSameToday", "()Z", "isStart", "alertTimePick", "(Z)V", "alertStatus", "showLocationPermissionDialog", "locationDeniedDialog", "updateNightModel", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "", "TAG", "Ljava/lang/String;", "Lcom/xiaomi/fitness/settingitem/settingitem/NightMode;", "nightMode", "Lcom/xiaomi/fitness/settingitem/settingitem/NightMode;", "", "getLayoutId", "()I", "layoutId", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class NightModeSetFragment extends BaseLoadableBindingFragment<NightModeSetViewModel, ai6> {

    @NotNull
    private final String TAG = "NightModeSetFragment";

    @NotNull
    private NightMode nightMode = NightModeHelper.INSTANCE.getDefaultNightMode();

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ NightModeSetViewModel access$getMViewModel(NightModeSetFragment nightModeSetFragment) {
        return (NightModeSetViewModel) nightModeSetFragment.getMViewModel();
    }

    private final void alertStatus() {
        int i;
        String string = getString(wzi.O5);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(wzi.R5);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = getString(wzi.P5);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        int nightMode = this.nightMode.getNightMode();
        if (nightMode != 0) {
            i = nightMode != 1 ? 2 : 1;
        } else {
            i = 0;
        }
        new CommonDialog.c("commonDialog").setDialogTitle(wzi.Q5).setNeutralText(wzi.e).setItems(new String[]{string, string2, string3}).setItemsCheckedIndex(i).setCanceledOnTouchOutside(true).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.huami.nightmode.NightModeSetFragment.alertStatus.1
            private final void changeMode(int which) {
                int i2;
                NightMode nightMode2 = NightModeSetFragment.this.nightMode;
                if (which != 0) {
                    i2 = 1;
                    if (which != 1) {
                        i2 = 2;
                    }
                } else {
                    i2 = 0;
                }
                nightMode2.setNightMode(i2);
                NightModeSetFragment.this.updateNightModel();
            }

            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -3) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } else if (which != 1 || NightModeSetFragment.access$getMViewModel(NightModeSetFragment.this).isBaseLocationPermissionGranted()) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    changeMode(which);
                } else {
                    NightModeSetFragment.this.showLocationPermissionDialog();
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            }
        }).show(getParentFragmentManager(), "");
    }

    private final void alertTimePick(final boolean isStart) {
        final TimePickerDialog currentMinute = TimePickerDialog.INSTANCE.defaultBuilder("time picker").setDialogTitle(isStart ? wzi.T5 : wzi.M5).setNegativeText(wzi.e).setPositiveText(wzi.g).create().setIs24HourView(true).setCurrentHour(isStart ? this.nightMode.getStartMinute() / 60 : this.nightMode.getEndMinute() / 60).setCurrentMinute(isStart ? this.nightMode.getStartMinute() % 60 : this.nightMode.getEndMinute() % 60);
        currentMinute.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.huami.nightmode.NightModeSetFragment.alertTimePick.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -1) {
                    if (isStart) {
                        this.nightMode.setStartMinute((currentMinute.getCurrentHour() * 60) + currentMinute.getCurrentMinute());
                    } else {
                        this.nightMode.setEndMinute((currentMinute.getCurrentHour() * 60) + currentMinute.getCurrentMinute());
                    }
                    this.updateNightModel();
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        currentMinute.showIfNeed(getParentFragmentManager());
    }

    private final void locationDeniedDialog() {
        CommonDialog.c cVar = new CommonDialog.c("PermissionsUtil.showSettingDialog");
        cVar.setDialogTitle(wzi.q5);
        cVar.setDialogDescription(wzi.z4);
        cVar.setPositiveText(n1j.f27440a);
        cVar.setNegativeText(n1j.common_cancel);
        CommonDialog commonDialogCreate = cVar.create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.huami.nightmode.NightModeSetFragment.locationDeniedDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                FragmentActivity activity;
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which != -1 || (activity = NightModeSetFragment.this.getActivity()) == null) {
                    return;
                }
                SystemSetting.INSTANCE.goToSetting(activity);
            }
        });
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        commonDialogCreate.showIfNeed(mActivity.getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(NightModeSetFragment this$0, NightMode nightMode) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(this$0.TAG, "load nightMode: " + nightMode);
        this$0.nightMode = nightMode;
        this$0.setViewStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(NightModeSetFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(this$0.TAG, "set nightMode: " + bool);
        if (bool.booleanValue()) {
            Context context = this$0.getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, wzi.common_set_success);
            }
            this$0.setViewStatus();
        } else {
            Context context2 = this$0.getContext();
            if (context2 != null) {
                ToastExtKt.toastShort(context2, wzi.common_set_error);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$2(NightModeSetFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.alertStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$3(NightModeSetFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.alertTimePick(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$4(NightModeSetFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.alertTimePick(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setViewStatus() {
        String string;
        RightArrowTwoLineTextView rightArrowTwoLineTextView = ((ai6) getMBinding()).B;
        int nightMode = this.nightMode.getNightMode();
        if (nightMode != 1) {
            string = nightMode != 2 ? getString(wzi.O5) : getString(wzi.P5);
        } else {
            string = getString(wzi.R5);
        }
        rightArrowTwoLineTextView.setRemindText(string);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(this.nightMode.getStartMinute() / 60), Integer.valueOf(this.nightMode.getStartMinute() % 60)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        ((ai6) getMBinding()).C.setRemindText(str);
        String str2 = String.format(" %02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(this.nightMode.getEndMinute() / 60), Integer.valueOf(this.nightMode.getEndMinute() % 60)}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        if (!startAndStopIsSameToday()) {
            str2 = getString(wzi.S5) + str2;
        }
        ((ai6) getMBinding()).A.setRemindText(str2);
        if (this.nightMode.getNightMode() == 2) {
            ((ai6) getMBinding()).C.setEnable(true);
            ((ai6) getMBinding()).A.setEnable(true);
        } else {
            ((ai6) getMBinding()).C.setEnable(false);
            ((ai6) getMBinding()).A.setEnable(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLocationPermissionDialog() {
        final Function0 function0 = new Function0() { // from class: dug
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NightModeSetFragment.showLocationPermissionDialog$lambda$9(this.f15937a);
            }
        };
        if (PermissionExtKt.supportMiuiPermissionEnable()) {
            function0.invoke();
            return;
        }
        String string = getString(wzi.f6);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(wzi.h6);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        CommonDialog commonDialogCreate = new CommonDialog.c("location").setDialogTitle(wzi.p3).setDialogDescriptionString(new DialogParams.DialogDescriptionString(new SpannableString(string + "\n\r\n\r" + string2))).setPositiveText(wzi.f38514b).setNegativeText(wzi.pf).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.huami.nightmode.NightModeSetFragment.showLocationPermissionDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -1) {
                    function0.invoke();
                }
            }
        });
        commonDialogCreate.showIfNeed(getParentFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showLocationPermissionDialog$lambda$9(final NightModeSetFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String[] locationPermissionList = ((NightModeSetViewModel) this$0.getMViewModel()).getLocationPermissionList();
        PermissionExtKt.permissions(this$0, (String[]) Arrays.copyOf(locationPermissionList, locationPermissionList.length), ((NightModeSetViewModel) this$0.getMViewModel()).getLocationPermissionDescList(), (Function1<? super MultiplePermissionsBuilder, Unit>) new Function1() { // from class: cug
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return NightModeSetFragment.showLocationPermissionDialog$lambda$9$lambda$8(this.f14726a, (MultiplePermissionsBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showLocationPermissionDialog$lambda$9$lambda$8(final NightModeSetFragment this$0, MultiplePermissionsBuilder permissions) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permissions, "$this$permissions");
        permissions.allGranted(new Function0() { // from class: ztg
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NightModeSetFragment.showLocationPermissionDialog$lambda$9$lambda$8$lambda$5(this.f41660a);
            }
        });
        permissions.denied(new Function1() { // from class: aug
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return NightModeSetFragment.showLocationPermissionDialog$lambda$9$lambda$8$lambda$7(this.f3457a, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showLocationPermissionDialog$lambda$9$lambda$8$lambda$5(NightModeSetFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(this$0.TAG, "granted");
        this$0.nightMode.setNightMode(1);
        this$0.updateNightModel();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showLocationPermissionDialog$lambda$9$lambda$8$lambda$7(final NightModeSetFragment this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        IPermissionManager instance = PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE);
        String str = (String) it.get(0);
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(instance, str, fragmentActivityRequireActivity, it, null, null, new Function0() { // from class: bug
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NightModeSetFragment.showLocationPermissionDialog$lambda$9$lambda$8$lambda$7$lambda$6(this.f4615a);
            }
        }, 24, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showLocationPermissionDialog$lambda$9$lambda$8$lambda$7$lambda$6(NightModeSetFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.locationDeniedDialog();
        return Unit.INSTANCE;
    }

    private final boolean startAndStopIsSameToday() {
        Logger.i(this.TAG, "startAndStopIsSameToday: " + this.nightMode);
        if (this.nightMode.getEndMinute() / 60 > this.nightMode.getStartMinute() / 60) {
            return true;
        }
        return this.nightMode.getEndMinute() / 60 == this.nightMode.getStartMinute() / 60 && this.nightMode.getEndMinute() % 60 > this.nightMode.getStartMinute() % 60;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void updateNightModel() {
        Logger.i(this.TAG, "update nightModel: " + this.nightMode);
        ((NightModeSetViewModel) getMViewModel()).syncNightModel(this.nightMode);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.t0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.N5);
        ((NightModeSetViewModel) getMViewModel()).getNightMode().observe(getViewLifecycleOwner(), new Observer() { // from class: xtg
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                NightModeSetFragment.onViewCreated$lambda$0(this.f39458a, (NightMode) obj);
            }
        });
        ((NightModeSetViewModel) getMViewModel()).getSyncResult().observe(getViewLifecycleOwner(), new NightModeSetFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ytg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return NightModeSetFragment.onViewCreated$lambda$1(this.f40522a, (Boolean) obj);
            }
        }));
        ((NightModeSetViewModel) getMViewModel()).getNightModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((ai6) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: utg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NightModeSetFragment.setListener$lambda$2(this.f36117a, view);
            }
        });
        ((ai6) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: vtg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NightModeSetFragment.setListener$lambda$3(this.f37212a, view);
            }
        });
        ((ai6) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: wtg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NightModeSetFragment.setListener$lambda$4(this.f38342a, view);
            }
        });
    }
}
