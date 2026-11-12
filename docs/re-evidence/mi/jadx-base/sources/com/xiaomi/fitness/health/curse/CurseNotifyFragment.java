package com.xiaomi.fitness.health.curse;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.fitness.permission.manager.export.IPermissionManager;
import com.fitness.permission.manager.export.PermissionExportExtKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.CustomDisplayPickerDialog;
import com.xiaomi.fitness.baseui.utils.NotificationPermission;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extension.CurseDeviceSyncExtKt;
import com.xiaomi.fitness.common.extensions.AlarmManagerExtKt;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.curse.CurseNotifyFragment;
import com.xiaomi.fitness.health.curse.data.CurseNotifyType;
import com.xiaomi.fitness.health.curse.vm.CurseNotifyViewModel;
import com.xiaomi.fitness.settingitem.settingitem.CurseSetting;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.av6;
import defpackage.c0j;
import defpackage.gub;
import defpackage.jui;
import defpackage.qxi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001'B\u0007¢\u0006\u0004\b&\u0010\u0019J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\bJ'\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010#\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010%¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/health/curse/CurseNotifyFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/curse/vm/CurseNotifyViewModel;", "Lgub;", "", "enable", "", "setDeviceView", "(Z)V", "setAppView", "", "days", "", "getRemindText", "(I)Ljava/lang/String;", "value", "type", "setValue", "(II)V", "onPickerDialogResult", "Lcom/xiaomi/fitness/settingitem/settingitem/CurseSetting;", "setting", "setViews", "(Lcom/xiaomi/fitness/settingitem/settingitem/CurseSetting;)V", "requestAlarmPermission", "()V", "setCurseNotifyEnable", "curValue", "supportNoRemind", "selectDays", "(IIZ)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/settingitem/settingitem/CurseSetting;", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CurseNotifyFragment extends BaseBindingFragment<CurseNotifyViewModel, gub> {

    @NotNull
    private static final String TAG = "CurseNoticeFragment";
    private static final int TYPE_APP_IN = 1;
    private static final int TYPE_APP_OVUM = 2;
    private static final int TYPE_APP_PREGNANCY = 3;
    private static final int TYPE_DEVICE_IN = 4;
    private static final int TYPE_DEVICE_OVUM = 5;
    private static final int TYPE_DEVICE_PREGNANCY = 6;
    private CurseSetting setting;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CurseNotifyType.values().length];
            try {
                iArr[CurseNotifyType.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CurseNotifyType.OVUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CurseNotifyFragment() {
        super(jui.u3);
    }

    private final String getRemindText(int days) {
        if (days == 0) {
            String string = getResources().getString(c0j.d6);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        String quantityString = getResources().getQuantityString(qxi.common_unit_day_desc, days, Integer.valueOf(days));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onPickerDialogResult(int value, int type) {
        Logger.i(TAG, "onPickerDialogResult type:" + type + ";value " + value);
        switch (type) {
            case 1:
            case 2:
            case 3:
                setValue(value, type);
                ((CurseNotifyViewModel) getMViewModel()).setAppConfig();
                break;
            case 4:
                ((CurseNotifyViewModel) getMViewModel()).setDeviceItemNotify(CurseNotifyType.IN, value);
                break;
            case 5:
                ((CurseNotifyViewModel) getMViewModel()).setDeviceItemNotify(CurseNotifyType.OVUM, value);
                break;
            case 6:
                ((CurseNotifyViewModel) getMViewModel()).setDeviceItemNotify(CurseNotifyType.EASY_PREGNANCY, value);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(CurseNotifyFragment this$0, boolean z, CurseSetting curseSetting) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (z) {
            Intrinsics.checkNotNull(curseSetting);
            this$0.setViews(curseSetting);
        } else {
            FragmentActivity activity = this$0.getActivity();
            if (activity != null) {
                ToastExtKt.toastShort(activity, c0j.common_hint_unkonwn_error);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(CurseNotifyFragment this$0, CurseNotifyViewModel.DeviceRet deviceRet) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (deviceRet.getSuccess()) {
            this$0.setDeviceView(deviceRet.getEnable());
            CurseSetting curseSetting = this$0.setting;
            if (curseSetting == null) {
                Intrinsics.throwUninitializedPropertyAccessException("setting");
                curseSetting = null;
            }
            curseSetting.setHardwarePush(deviceRet.getEnable());
        } else {
            ToastUtil.INSTANCE.showToast(c0j.common_set_error);
            this$0.setDeviceView(!deviceRet.getEnable());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(CurseNotifyFragment this$0, CurseNotifyViewModel.DeviceDaysRet deviceDaysRet) {
        int i;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (!deviceDaysRet.getSuccess()) {
            ToastUtil.INSTANCE.showToast(c0j.common_set_error);
            return;
        }
        int days = deviceDaysRet.getDays();
        int i2 = WhenMappings.$EnumSwitchMapping$0[deviceDaysRet.getType().ordinal()];
        if (i2 != 1) {
            i = i2 != 2 ? 6 : 5;
        } else {
            i = 4;
        }
        this$0.setValue(days, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3(CurseNotifyFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CurseSetting curseSetting = this$0.setting;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting = null;
        }
        this$0.selectDays(1, curseSetting.getAppBeforeMenstruationPush(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$4(CurseNotifyFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CurseSetting curseSetting = this$0.setting;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting = null;
        }
        this$0.selectDays(2, curseSetting.getAppBeforeOvulationPush(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$5(CurseNotifyFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CurseSetting curseSetting = this$0.setting;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting = null;
        }
        this$0.selectDays(3, curseSetting.getAppBeforePregnancyPush(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$6(CurseNotifyFragment this$0, boolean z, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CurseSetting curseSetting = this$0.setting;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting = null;
        }
        this$0.selectDays(4, curseSetting.getHardwareBeforeMenstruationPush(), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$7(CurseNotifyFragment this$0, boolean z, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CurseSetting curseSetting = this$0.setting;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting = null;
        }
        this$0.selectDays(5, curseSetting.getHardwareBeforeOvulationPush(), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$8(CurseNotifyFragment this$0, boolean z, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CurseSetting curseSetting = this$0.setting;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting = null;
        }
        this$0.selectDays(6, curseSetting.getHardwareBeforePregnancyPush(), z);
    }

    private final void requestAlarmPermission() {
        NotificationPermission notificationPermission = NotificationPermission.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        NotificationPermission.requestAlarmPermissionIfNeed$default(notificationPermission, fragmentActivityRequireActivity, c0j.s6, false, new Function1() { // from class: e95
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CurseNotifyFragment.requestAlarmPermission$lambda$15(this.f16406a, ((Boolean) obj).booleanValue());
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestAlarmPermission$lambda$15(CurseNotifyFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "requestAlarmPermission result " + z);
        if (z) {
            this$0.getMBinding().G.setSwitch(true);
        }
        this$0.setCurseNotifyEnable(z);
        return Unit.INSTANCE;
    }

    private final void selectDays(final int type, final int curValue, final boolean supportNoRemind) {
        final CustomDisplayPickerDialog customDisplayPickerDialogCreate = new CustomDisplayPickerDialog.Builder("select_day").setCanceledOnTouchOutside(true).setCancelable(true).setDialogTitle(c0j.E5).setPositiveText(c0j.e).setNegativeText(c0j.c).create();
        Logger.d(TAG, "selectDays " + type + " " + curValue);
        customDisplayPickerDialogCreate.setValue(curValue);
        customDisplayPickerDialogCreate.setCustomAdapter(new CustomDisplayPickerDialog.CustomAdapter() { // from class: com.xiaomi.fitness.health.curse.CurseNotifyFragment.selectDays.1
            @Override // com.xiaomi.fitness.baseui.dialog.CustomDisplayPickerDialog.CustomAdapter, com.xiaomi.fitness.baseui.dialog.PickerDialog.a
            public int getCount() {
                return supportNoRemind ? 6 : 5;
            }

            @Override // com.xiaomi.fitness.baseui.dialog.CustomDisplayPickerDialog.CustomAdapter
            public String getDisplayValue(int index) {
                String string;
                if (!supportNoRemind || index != 0) {
                    return String.valueOf(getValue(index));
                }
                Context context = this.getContext();
                return (context == null || (string = context.getString(c0j.d6)) == null) ? "" : string;
            }

            @Override // com.xiaomi.fitness.baseui.dialog.CustomDisplayPickerDialog.CustomAdapter
            public String getHintTest(int index) {
                if (supportNoRemind && index == 0) {
                    return "";
                }
                String quantityString = this.getResources().getQuantityString(qxi.B, 1, 1);
                Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                return quantityString;
            }

            @Override // com.xiaomi.fitness.baseui.dialog.CustomDisplayPickerDialog.CustomAdapter, com.xiaomi.fitness.baseui.dialog.PickerDialog.a
            public int getValue(int index) {
                return supportNoRemind ? index : index + 1;
            }
        });
        customDisplayPickerDialogCreate.setPickerHintText(getResources().getQuantityString(qxi.B, 1, 1));
        customDisplayPickerDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.health.curse.CurseNotifyFragment.selectDays.2
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface _dialog, int which) {
                super.onDialogClick(dialogName, _dialog, which);
                if (_dialog != null) {
                    _dialog.dismiss();
                }
                if (which != -1 || curValue == customDisplayPickerDialogCreate.getValue()) {
                    return;
                }
                this.onPickerDialogResult(customDisplayPickerDialogCreate.getValue(), type);
            }
        });
        customDisplayPickerDialogCreate.showIfNeed(getParentFragmentManager());
    }

    private final void setAppView(boolean enable) {
        getMBinding().C.setEnable(enable);
        getMBinding().F.setEnabled(enable);
        getMBinding().E.setEnable(enable);
        getMBinding().D.setEnabled(enable);
        getMBinding().B.setEnable(enable);
        getMBinding().A.setEnabled(enable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setCurseNotifyEnable(boolean enable) {
        CurseSetting curseSetting = this.setting;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting = null;
        }
        curseSetting.setAppPush(enable);
        ((CurseNotifyViewModel) getMViewModel()).setAppConfig();
        setAppView(enable);
    }

    private final void setDeviceView(boolean enable) {
        getMBinding().N.setSwitch(enable);
        getMBinding().I.setEnable(enable);
        getMBinding().M.setEnabled(enable);
        getMBinding().K.setEnable(enable);
        getMBinding().J.setEnabled(enable);
        getMBinding().H.setEnable(enable);
        getMBinding().L.setEnabled(enable);
    }

    private final void setValue(int value, int type) {
        Logger.i(TAG, "set type " + type + ";value " + value);
        String remindText = getRemindText(value);
        CurseSetting curseSetting = null;
        switch (type) {
            case 1:
                CurseSetting curseSetting2 = this.setting;
                if (curseSetting2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("setting");
                } else {
                    curseSetting = curseSetting2;
                }
                curseSetting.setAppBeforeMenstruationPush(value);
                getMBinding().C.setRemindText(remindText);
                break;
            case 2:
                CurseSetting curseSetting3 = this.setting;
                if (curseSetting3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("setting");
                } else {
                    curseSetting = curseSetting3;
                }
                curseSetting.setAppBeforeOvulationPush(value);
                getMBinding().E.setRemindText(remindText);
                break;
            case 3:
                CurseSetting curseSetting4 = this.setting;
                if (curseSetting4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("setting");
                } else {
                    curseSetting = curseSetting4;
                }
                curseSetting.setAppBeforePregnancyPush(value);
                getMBinding().B.setRemindText(remindText);
                break;
            case 4:
                CurseSetting curseSetting5 = this.setting;
                if (curseSetting5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("setting");
                } else {
                    curseSetting = curseSetting5;
                }
                curseSetting.setHardwareBeforeMenstruationPush(value);
                getMBinding().I.setRemindText(remindText);
                break;
            case 5:
                CurseSetting curseSetting6 = this.setting;
                if (curseSetting6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("setting");
                } else {
                    curseSetting = curseSetting6;
                }
                curseSetting.setHardwareBeforeOvulationPush(value);
                getMBinding().K.setRemindText(remindText);
                break;
            case 6:
                CurseSetting curseSetting7 = this.setting;
                if (curseSetting7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("setting");
                } else {
                    curseSetting = curseSetting7;
                }
                curseSetting.setHardwareBeforePregnancyPush(value);
                getMBinding().H.setRemindText(remindText);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setViews(final CurseSetting setting) {
        Context context;
        ((CurseNotifyViewModel) getMViewModel()).setConfigRef(setting);
        this.setting = setting;
        boolean z = false;
        if (!setting.isPredictEnable()) {
            getMBinding().G.setEnable(false);
            getMBinding().C.setEnable(false);
            getMBinding().E.setEnable(false);
            getMBinding().B.setEnable(false);
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        Logger.i(TAG, "predictEnable " + setting.isPredictEnable() + ";currentDeviceModel " + wearableDeviceModel + " supportCurse " + (wearableDeviceModel != null ? Boolean.valueOf(CurseDeviceSyncExtKt.isSupportCurse(wearableDeviceModel)) : null));
        if (!setting.isPredictEnable() || wearableDeviceModel == null || !CurseDeviceSyncExtKt.isSupportCurse(wearableDeviceModel)) {
            getMBinding().I.setEnable(false);
            getMBinding().K.setEnable(false);
            getMBinding().N.setEnable(false);
            getMBinding().H.setEnable(false);
        }
        boolean deviceSupportEasyPregnancy = ((CurseNotifyViewModel) getMViewModel()).getDeviceSupportEasyPregnancy();
        if (!setting.isPredictEnable() || !deviceSupportEasyPregnancy) {
            RightArrowSingleLineTextView deviceEasyPregnancyView = getMBinding().H;
            Intrinsics.checkNotNullExpressionValue(deviceEasyPregnancyView, "deviceEasyPregnancyView");
            ViewExtKt.setVisible(deviceEasyPregnancyView, false);
            TextView devicePregnancyLabel = getMBinding().L;
            Intrinsics.checkNotNullExpressionValue(devicePregnancyLabel, "devicePregnancyLabel");
            ViewExtKt.setVisible(devicePregnancyLabel, false);
        }
        if (setting.isAppPush() && (context = getContext()) != null && AlarmManagerExtKt.canScheduleExactAlarms(context)) {
            z = true;
        }
        getMBinding().G.setSwitch(z);
        getMBinding().C.setRemindText(getRemindText(setting.getAppBeforeMenstruationPush()));
        getMBinding().E.setRemindText(getRemindText(setting.getAppBeforeOvulationPush()));
        getMBinding().B.setRemindText(getRemindText(setting.getAppBeforePregnancyPush()));
        getMBinding().G.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: f95
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z2, ISwitchButton iSwitchButton) {
                CurseNotifyFragment.setViews$lambda$13(this.f17544a, z2, iSwitchButton);
            }
        });
        setAppView(z);
        getMBinding().I.setRemindText(getRemindText(setting.getHardwareBeforeMenstruationPush()));
        getMBinding().K.setRemindText(getRemindText(setting.getHardwareBeforeOvulationPush()));
        getMBinding().H.setRemindText(getRemindText(setting.getHardwareBeforePregnancyPush()));
        getMBinding().N.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: g95
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z2, ISwitchButton iSwitchButton) {
                CurseNotifyFragment.setViews$lambda$14(this.f18746a, setting, z2, iSwitchButton);
            }
        });
        setDeviceView(setting.isHardwarePush());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setViews$lambda$13(final CurseNotifyFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!z) {
            this$0.setCurseNotifyEnable(false);
            return;
        }
        this$0.setAppView(false);
        this$0.getMBinding().G.setSwitch(false);
        NotificationPermission notificationPermission = NotificationPermission.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        boolean zPostNotificationPermissionGranted = notificationPermission.postNotificationPermissionGranted(fragmentActivityRequireActivity);
        FragmentActivity fragmentActivityRequireActivity2 = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
        boolean zCanScheduleExactAlarms = AlarmManagerExtKt.canScheduleExactAlarms(fragmentActivityRequireActivity2);
        if (zPostNotificationPermissionGranted && zCanScheduleExactAlarms) {
            this$0.getMBinding().G.setSwitch(true);
            this$0.setCurseNotifyEnable(true);
            return;
        }
        final Function0 function0 = new Function0() { // from class: i95
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CurseNotifyFragment.setViews$lambda$13$lambda$11(this.f20900a);
            }
        };
        if (PermissionExtKt.supportMiuiPermissionEnable()) {
            function0.invoke();
            return;
        }
        FragmentActivity activity = this$0.getActivity();
        String string = this$0.getString(c0j.D6);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        CommonDialog notifyAlarmGuideDialogForSingleFunction$default = NotificationPermission.getNotifyAlarmGuideDialogForSingleFunction$default(notificationPermission, activity, string, 1, false, new Function1() { // from class: j95
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CurseNotifyFragment.setViews$lambda$13$lambda$12(function0, this$0, ((Boolean) obj).booleanValue());
            }
        }, 8, null);
        if (notifyAlarmGuideDialogForSingleFunction$default != null) {
            notifyAlarmGuideDialogForSingleFunction$default.showIfNeed(this$0.getChildFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViews$lambda$13$lambda$11(final CurseNotifyFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        NotificationPermission notificationPermission = NotificationPermission.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        String string = this$0.getString(c0j.D6);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        NotificationPermission.requestPostNotificationPermissionIfNeed$default(notificationPermission, fragmentActivityRequireActivity, string, false, new Function1() { // from class: a95
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CurseNotifyFragment.setViews$lambda$13$lambda$11$lambda$10(this.f792a, ((Boolean) obj).booleanValue());
            }
        }, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViews$lambda$13$lambda$11$lambda$10(CurseNotifyFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.requestAlarmPermission();
        } else {
            this$0.setCurseNotifyEnable(false);
            IPermissionManager instance = PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE);
            FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(instance, "android.permission.POST_NOTIFICATIONS", fragmentActivityRequireActivity, null, null, null, new Function0() { // from class: h95
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CurseNotifyFragment.setViews$lambda$13$lambda$11$lambda$10$lambda$9();
                }
            }, 28, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViews$lambda$13$lambda$11$lambda$10$lambda$9() {
        NotificationPermission.INSTANCE.goNotifySettingPage();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViews$lambda$13$lambda$12(Function0 requestPermission, CurseNotifyFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(requestPermission, "$requestPermission");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            requestPermission.invoke();
        } else {
            this$0.setCurseNotifyEnable(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setViews$lambda$14(CurseNotifyFragment this$0, CurseSetting setting, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(setting, "$setting");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected()) {
            ((CurseNotifyViewModel) this$0.getMViewModel()).setDeviceNotifyEnable(z, setting.getHardwareBeforeMenstruationPush(), setting.getHardwareBeforeOvulationPush(), setting.getHardwareBeforePregnancyPush());
        } else {
            ToastUtil.INSTANCE.showToast(c0j.f4801r);
            this$0.getMBinding().N.setSwitch(!z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(c0j.e6);
        PageState.DefaultImpls.showLoading$default(this, null, 0, true, 3, null);
        ((CurseNotifyViewModel) getMViewModel()).getConfig(new Function2() { // from class: k95
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CurseNotifyFragment.onViewCreated$lambda$0(this.f23621a, ((Boolean) obj).booleanValue(), (CurseSetting) obj2);
            }
        });
        ((CurseNotifyViewModel) getMViewModel()).getDeviceObserver().observe(getViewLifecycleOwner(), new CurseNotifyFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: l95
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CurseNotifyFragment.onViewCreated$lambda$1(this.f24796a, (CurseNotifyViewModel.DeviceRet) obj);
            }
        }));
        ((CurseNotifyViewModel) getMViewModel()).getDeviceItemObserver().observe(getViewLifecycleOwner(), new Observer() { // from class: m95
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                CurseNotifyFragment.onViewCreated$lambda$2(this.f25909a, (CurseNotifyViewModel.DeviceDaysRet) obj);
            }
        });
        final boolean deviceSupportNotifySingleNoRemind = ((CurseNotifyViewModel) getMViewModel()).getDeviceSupportNotifySingleNoRemind();
        getMBinding().C.setOnClickListener(new View.OnClickListener() { // from class: n95
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CurseNotifyFragment.onViewCreated$lambda$3(this.f27677a, view2);
            }
        });
        getMBinding().E.setOnClickListener(new View.OnClickListener() { // from class: o95
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CurseNotifyFragment.onViewCreated$lambda$4(this.f28884a, view2);
            }
        });
        getMBinding().B.setOnClickListener(new View.OnClickListener() { // from class: p95
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CurseNotifyFragment.onViewCreated$lambda$5(this.f30144a, view2);
            }
        });
        getMBinding().I.setOnClickListener(new View.OnClickListener() { // from class: b95
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CurseNotifyFragment.onViewCreated$lambda$6(this.f3939a, deviceSupportNotifySingleNoRemind, view2);
            }
        });
        getMBinding().K.setOnClickListener(new View.OnClickListener() { // from class: c95
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CurseNotifyFragment.onViewCreated$lambda$7(this.f5068a, deviceSupportNotifySingleNoRemind, view2);
            }
        });
        getMBinding().H.setOnClickListener(new View.OnClickListener() { // from class: d95
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CurseNotifyFragment.onViewCreated$lambda$8(this.f15246a, deviceSupportNotifySingleNoRemind, view2);
            }
        });
    }
}
