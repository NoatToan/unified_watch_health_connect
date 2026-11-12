package com.xiaomi.hm.health.device.setting.ui.dialog;

import android.content.Context;
import android.content.DialogInterface;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.devicex.R;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.user.LocationExt;
import com.xiaomi.hm.health.device.setting.ui.dialog.WearStyleDialogFactory;
import com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;

/* JADX INFO: loaded from: classes18.dex */
public class WearStyleDialogFactory {
    private HMDeviceSource a;

    public WearStyleDialogFactory(HMDeviceSource hMDeviceSource) {
        this.a = hMDeviceSource;
    }

    private boolean c() {
        HMDeviceSource hMDeviceSource = this.a;
        return (hMDeviceSource == HMDeviceSource.MILI || hMDeviceSource == HMDeviceSource.MILI_1A || hMDeviceSource == HMDeviceSource.MILI_QINLING || hMDeviceSource == HMDeviceSource.MILI_AMAZFIT) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(DeviceFeatureViewModel deviceFeatureViewModel, DialogInterface dialogInterface, int i) {
        if (i == 0) {
            deviceFeatureViewModel.updateWearStyleSetting("LEFT_HAND", LocationExt.Wear.WRIST, LocationExt.Way.LEFT);
        } else {
            if (i != 1) {
                return;
            }
            deviceFeatureViewModel.updateWearStyleSetting(HMMiliConfig.ONBODY, LocationExt.Wear.CHEST, LocationExt.Way.OTHER);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(DeviceFeatureViewModel deviceFeatureViewModel, DialogInterface dialogInterface, int i) {
        if (i == 0) {
            deviceFeatureViewModel.updateWearStyleSetting("LEFT_HAND", LocationExt.Wear.WRIST, LocationExt.Way.LEFT);
        } else if (i == 1) {
            deviceFeatureViewModel.updateWearStyleSetting("RIGHT_HAND", LocationExt.Wear.WRIST, LocationExt.Way.RIGHT);
        } else {
            if (i != 2) {
                return;
            }
            deviceFeatureViewModel.updateWearStyleSetting(HMMiliConfig.ONBODY, LocationExt.Wear.CHEST, LocationExt.Way.OTHER);
        }
    }

    /* JADX WARN: switch over string: strings are not added: [[RIGHT_HAND], [LEFT_HAND]] */
    private AlertDialogFragment.Builder f(final DeviceFeatureViewModel deviceFeatureViewModel, Context context) {
        String wearHand = HMPersonInfo.getInstance().getMiliConfig().getWearHand();
        wearHand.hashCode();
        int i = 0;
        switch (wearHand) {
            case "ONBODY":
            case "PENDANT":
                i = 1;
                break;
        }
        return new AlertDialogFragment.Builder(context).setTitle(R.string.wear_hand).setCancelable(true).setSingleChoiceItems(new AlertDialogFragment.ChoiceItems().setItemChoice(i).setItems(R.array.amazfit_wear_type), new DialogInterface.OnClickListener() { // from class: eo8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                WearStyleDialogFactory.d(deviceFeatureViewModel, dialogInterface, i2);
            }
        });
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private AlertDialogFragment.Builder g(final DeviceFeatureViewModel deviceFeatureViewModel, Context context) {
        String wearHand = HMPersonInfo.getInstance().getMiliConfig().getWearHand();
        int i = c() ? R.array.wear_type : this.a == HMDeviceSource.MILI_QINLING ? R.array.wear_type_chest : R.array.wear_type_body;
        byte b = -1;
        int i2 = 0;
        switch (wearHand.hashCode()) {
            case -1959185407:
                if (wearHand.equals(HMMiliConfig.ONBODY)) {
                    b = 1;
                }
                break;
            case -873364270:
                if (wearHand.equals("RIGHT_HAND")) {
                    b = 0;
                }
                break;
            case 35387260:
                if (wearHand.equals(HMMiliConfig.ONBODY_IOS)) {
                    b = 2;
                }
                break;
            case 262784423:
                if (wearHand.equals("LEFT_HAND")) {
                    b = 3;
                }
                break;
        }
        if (b == 0) {
            i2 = 1;
        } else if (b == 1 || b == 2) {
            i2 = 2;
        }
        return new AlertDialogFragment.Builder(context).setTitle(R.string.wear_hand).setCancelable(true).setSingleChoiceItems(new AlertDialogFragment.ChoiceItems().setItemChoice(i2).setItems(i), new DialogInterface.OnClickListener() { // from class: fo8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                WearStyleDialogFactory.e(deviceFeatureViewModel, dialogInterface, i3);
            }
        });
    }

    public AlertDialogFragment.Builder createDialog(DeviceFeatureViewModel deviceFeatureViewModel, Context context) {
        return this.a == HMDeviceSource.MILI_AMAZFIT ? f(deviceFeatureViewModel, context) : g(deviceFeatureViewModel, context);
    }
}
