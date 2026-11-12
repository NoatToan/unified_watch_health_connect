package defpackage;

import android.content.Context;
import com.xiaomi.smarthome.device.api.BleMeshFirmwareUpdateInfo;

/* JADX INFO: loaded from: classes6.dex */
public interface i0d {
    void checkBleUpdateInfo(String str, BleMeshFirmwareUpdateInfo bleMeshFirmwareUpdateInfo);

    Context getContext();

    void onCheckFail(int i);

    void onInstalling();

    void onSuccess();

    void onUpgradeFail(int i);

    void onUpgrading();

    void showLog(String str);

    void showProgress(int i);
}
