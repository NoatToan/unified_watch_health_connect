package com.xiaomi.fitness.devicesettings.huami.goalremind;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.huami.goalremind.GoalRemindFragment;
import com.xiaomi.fitness.devicesettings.utils.UtilsKt;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.eui;
import defpackage.sg6;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\fJ!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/goalremind/GoalRemindFragment;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/huami/goalremind/GoalRemindViewModel;", "Lsg6;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "()V", "", "status", "onLoadStatusChanged", "(I)V", "getLayoutId", "()I", "layoutId", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class GoalRemindFragment extends Hilt_GoalRemindFragment<GoalRemindViewModel, sg6> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$0(GoalRemindFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!UtilsKt.isDeviceNotConnection()) {
            ((GoalRemindViewModel) this$0.getMViewModel()).setGoalRemindSwitch(z);
        } else {
            iSwitchButton.setChecked(!z);
            ToastUtil.showShortToast(wzi.u);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.d0;
    }

    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment
    public void onLoadStatusChanged(int status) {
        if (status == 5) {
            dismissLoadingWithToast(wzi.common_set_error);
        } else {
            super.onLoadStatusChanged(status);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.D4);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null && DeviceModelExtKt.isHuaMi(wearableDeviceModel) && wearableDeviceModel.isDeviceConnected()) {
            ((GoalRemindViewModel) getMViewModel()).loadGoalRemindSwitch();
            return;
        }
        FragmentActivity mActivity = getMActivity();
        if (mActivity != null) {
            ToastExtKt.toastShort(mActivity, wzi.common_hint_unkonwn_error);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((sg6) getMBinding()).A.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: d2b
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                GoalRemindFragment.setListener$lambda$0(this.f14990a, z, iSwitchButton);
            }
        });
    }
}
