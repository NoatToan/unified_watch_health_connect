package com.xiaomi.hm.health.device.setting.ui.dialog;

import android.content.Context;
import android.content.DialogInterface;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel;

/* JADX INFO: loaded from: classes18.dex */
public class SetRingTypeDialogFactory {
    private DeviceFeatureViewModel a;

    public SetRingTypeDialogFactory(DeviceFeatureViewModel deviceFeatureViewModel) {
        this.a = deviceFeatureViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(DialogInterface dialogInterface, int i) {
        this.a.updateRingType(i);
    }

    public AlertDialogFragment create(Context context) {
        return new AlertDialogFragment.Builder(context).setTitle(R.string.find_phone_ring_type).setSingleChoiceItems(new AlertDialogFragment.ChoiceItems().setItems(R.array.ring_types).setItemChoice(DeviceXFunctionsKt.getPropertyStoreApi().getRingType()), new DialogInterface.OnClickListener() { // from class: zp6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.b(dialogInterface, i);
            }
        }).setCancelable(true).create();
    }
}
