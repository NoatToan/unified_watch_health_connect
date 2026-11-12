package com.mi.fitness.lpamanagement.ui.download;

import com.mi.fitness.lpamanagement.util.BluetoothSender;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\t0\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/mi/fitness/lpamanagement/ui/download/DownloadProfileViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "profileDownload", "", "activationCode", "", "confirmationCode", "callBack", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "result", "Companion", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DownloadProfileViewModel extends AbsViewModel {

    @NotNull
    public static final String TAG = "DownloadProfileViewModel";

    @Nullable
    public final WearableDeviceModel getDeviceModel() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    public final void profileDownload(@NotNull String activationCode, @NotNull String confirmationCode, @NotNull Function1<? super Boolean, Unit> callBack) {
        String did;
        Intrinsics.checkNotNullParameter(activationCode, "activationCode");
        Intrinsics.checkNotNullParameter(confirmationCode, "confirmationCode");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        BluetoothSender bluetoothSender = BluetoothSender.INSTANCE;
        WearableDeviceModel deviceModel = getDeviceModel();
        if (deviceModel == null || (did = deviceModel.getDid()) == null) {
            did = "";
        }
        bluetoothSender.downloadProfile(did, activationCode, confirmationCode, callBack);
    }
}
