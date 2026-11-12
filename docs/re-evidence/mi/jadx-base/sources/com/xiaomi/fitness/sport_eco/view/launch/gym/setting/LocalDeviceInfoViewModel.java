package com.xiaomi.fitness.sport_eco.view.launch.gym.setting;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoLocalInfo;
import defpackage.eu6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalDeviceInfoViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "deviceInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalDeviceInfoModel;", "getDeviceInfo", "()Landroidx/lifecycle/MutableLiveData;", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "loadLocalDeviceInfo", "deviceModel", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocalDeviceInfoViewModel extends AbsViewModel {

    @NotNull
    public static final String TAG = "LocalDeviceInfoViewModel";

    @NotNull
    private final MutableLiveData<LocalDeviceInfoModel> deviceInfo = new MutableLiveData<>();

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @NotNull
    public final MutableLiveData<LocalDeviceInfoModel> getDeviceInfo() {
        return this.deviceInfo;
    }

    public final void loadLocalDeviceInfo(@Nullable final EcoDeviceModel deviceModel) {
        if (deviceModel != null) {
            deviceModel.readLocalInfo(new eu6<EcoLocalInfo>() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalDeviceInfoViewModel.loadLocalDeviceInfo.1
                @Override // defpackage.eu6
                public void onError(int errorCode) {
                    Logger.e(LocalDeviceInfoViewModel.TAG, "loadLocalDeviceInfo error:" + errorCode);
                }

                @Override // defpackage.eu6
                public void onResult(EcoLocalInfo result) {
                    LocalDeviceInfoModel.Companion companion = LocalDeviceInfoModel.INSTANCE;
                    EcoDeviceModel ecoDeviceModel = deviceModel;
                    Intrinsics.checkNotNull(ecoDeviceModel);
                    LocalDeviceInfoModel localDeviceInfoModelValueOf = companion.valueOf(ecoDeviceModel.getDeviceInfo());
                    if (result != null) {
                        localDeviceInfoModelValueOf.setModel(result.getModel());
                        localDeviceInfoModelValueOf.setFwVersion(result.getFirmwareVersion());
                        localDeviceInfoModelValueOf.setSn(result.getSerialNumber());
                    }
                    Logger.d(LocalDeviceInfoViewModel.TAG, "loadLocalDeviceInfo " + localDeviceInfoModelValueOf);
                    this.getDeviceInfo().postValue(localDeviceInfoModelValueOf);
                }
            });
        }
    }
}
