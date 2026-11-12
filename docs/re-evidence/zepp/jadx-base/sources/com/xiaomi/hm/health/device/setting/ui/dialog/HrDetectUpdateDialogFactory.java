package com.xiaomi.hm.health.device.setting.ui.dialog;

import android.content.Context;
import android.content.DialogInterface;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.devicex.R;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.event.EventWHTypeChanged;
import com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel;
import com.xiaomi.hm.health.device.setting.vo.BatteryTipsDialogVo;
import de.greenrobot.event.EventBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public class HrDetectUpdateDialogFactory {
    private DeviceFeatureViewModel a;
    private final String b = "HrDetectUpdateDialogFactory";

    public HrDetectUpdateDialogFactory(DeviceFeatureViewModel deviceFeatureViewModel) {
        this.a = deviceFeatureViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit c(Boolean bool) {
        if (bool.booleanValue()) {
            HMLog.i("HrDetectUpdateDialogFactory", "post heart type", new Object[0]);
            EventBus.getDefault().post(new EventWHTypeChanged());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(int i, int i2, DialogInterface dialogInterface, int i3) {
        if (i == i3) {
            return;
        }
        if (i3 == 0 || i3 == 1) {
            this.a.getShowBatterTipsDialog().setValue(new BatteryTipsDialogVo(true, i3, i2));
        } else if (i3 == 2) {
            this.a.updateHrDetectSetting(false, 0, new Function1() { // from class: i94
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return this.a.c((Boolean) obj);
                }
            });
        }
    }

    public AlertDialogFragment create(Context context, int i, final int i2) {
        final int i3 = 2;
        if (i == 1) {
            i3 = 1;
        } else if (i == 2) {
            i3 = 0;
        }
        return new AlertDialogFragment.Builder(context).setTitle(R.string.setting_heartrate_detect_select).setSingleChoiceItems(new AlertDialogFragment.ChoiceItems().setItems(R.array.setting_hr_types).setItemsSummary(R.array.setting_hr_types_desc).setItemChoice(i3), new DialogInterface.OnClickListener() { // from class: h94
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                this.a.d(i3, i2, dialogInterface, i4);
            }
        }).setCancelable(true).create();
    }
}
