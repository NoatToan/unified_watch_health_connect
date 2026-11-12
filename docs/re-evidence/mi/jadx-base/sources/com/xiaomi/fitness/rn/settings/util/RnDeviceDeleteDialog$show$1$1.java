package com.xiaomi.fitness.rn.settings.util;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.DeviceManager;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.l;
import com.xiaomi.fitness.rn.export.RNDeviceModel;
import com.xiaomi.fitness.rn.sdk.RnPersistManager;
import com.xiaomi.fitness.rn.settings.util.RnDeviceDeleteDialog$show$1$1;
import defpackage.v0j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/xiaomi/fitness/rn/settings/util/RnDeviceDeleteDialog$show$1$1", "Lcom/xiaomi/fitness/device/manager/l$a;", "", "onSuccess", "()V", "", "code", "onFail", "(I)V", "settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class RnDeviceDeleteDialog$show$1$1 extends l.a {
    final /* synthetic */ RNDeviceModel $deviceModel;
    final /* synthetic */ DialogInterface $dialog;
    final /* synthetic */ RnDeviceDeleteDialog this$0;

    public RnDeviceDeleteDialog$show$1$1(DialogInterface dialogInterface, RnDeviceDeleteDialog rnDeviceDeleteDialog, RNDeviceModel rNDeviceModel) {
        this.$dialog = dialogInterface;
        this.this$0 = rnDeviceDeleteDialog;
        this.$deviceModel = rNDeviceModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSuccess$lambda$1() {
        DeviceManager.DefaultImpls.requestDeviceList$default(DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE), null, null, 3, null);
    }

    @Override // com.xiaomi.fitness.device.manager.l
    public void onFail(int code) {
        this.$dialog.dismiss();
        ToastUtil.showLongToast(v0j.o);
        Function1 function1 = this.this$0.callBack;
        if (function1 != null) {
            function1.invoke2(Boolean.FALSE);
        }
    }

    @Override // com.xiaomi.fitness.device.manager.l
    public void onSuccess() {
        this.$dialog.dismiss();
        ToastUtil.showLongToast(v0j.common_delete_success);
        Function1 function1 = this.this$0.callBack;
        if (function1 != null) {
            function1.invoke2(Boolean.TRUE);
        }
        RNDeviceModel rNDeviceModel = this.$deviceModel;
        if (rNDeviceModel != null) {
            RnPersistManager.INSTANCE.deleteDataAfterDeviceRemoved(DeviceModelExtKt.getModel(rNDeviceModel), rNDeviceModel.getDid());
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: huk
            @Override // java.lang.Runnable
            public final void run() {
                RnDeviceDeleteDialog$show$1$1.onSuccess$lambda$1();
            }
        }, 3000L);
    }
}
