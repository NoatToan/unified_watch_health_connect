package com.xiaomi.hm.health.device.setting.ui.dialog;

import android.content.Context;
import android.content.DialogInterface;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.devicex.R;
import com.xiaomi.hm.health.device.event.EventWHTypeChanged;
import com.xiaomi.hm.health.device.setting.ui.dialog.BatteryTipsDialogFactory;
import com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel;
import de.greenrobot.event.EventBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public class BatteryTipsDialogFactory {
    private DeviceFeatureViewModel a;

    public BatteryTipsDialogFactory(DeviceFeatureViewModel deviceFeatureViewModel) {
        this.a = deviceFeatureViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit d(Boolean bool) {
        if (bool.booleanValue()) {
            EventBus.getDefault().post(new EventWHTypeChanged());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit e(Boolean bool) {
        if (bool.booleanValue()) {
            EventBus.getDefault().post(new EventWHTypeChanged());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(int i, DialogInterface dialogInterface, int i2) {
        if (i == 0) {
            this.a.updateFullHeartRate(true, 2, new Function1() { // from class: ts
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BatteryTipsDialogFactory.d((Boolean) obj);
                }
            });
        } else if (i == 1) {
            this.a.updateSleepAssistantHr(true, 1, new Function1() { // from class: ss
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BatteryTipsDialogFactory.e((Boolean) obj);
                }
            });
        }
    }

    public AlertDialogFragment create(Context context, final int i) {
        AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(context);
        builder.setMessage(R.string.setting_heartrate_detect_battery_tips).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: rs
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.a.f(i, dialogInterface, i2);
            }
        }).setCancelable(true);
        return builder.create();
    }
}
