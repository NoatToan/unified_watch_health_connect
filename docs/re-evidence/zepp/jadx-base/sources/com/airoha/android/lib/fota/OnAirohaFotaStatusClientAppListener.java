package com.airoha.android.lib.fota;

import com.airoha.android.lib.fota.actionEnum.DualActionEnum;
import com.airoha.android.lib.fota.actionEnum.SingleActionEnum;
import com.airoha.android.lib.fota.fotaInfo.DualFotaInfo;
import com.airoha.android.lib.fota.fotaInfo.SingleFotaInfo;

/* JADX INFO: loaded from: classes2.dex */
public interface OnAirohaFotaStatusClientAppListener {
    void notifyBatterLevelLow();

    void notifyClientExistence(boolean z);

    void notifyCompleted(String str);

    void notifyError(int i, int i2, String str);

    void notifyInterrupted(String str);

    void notifyStateEnum(byte b, String str);

    void notifyStatus(String str);

    void onAgentChannelReceived(boolean z);

    void onAvailableDualActionUpdated(DualActionEnum dualActionEnum);

    void onAvailableSingleActionUpdated(SingleActionEnum singleActionEnum);

    void onBatteryStatusReceived(byte b, int i);

    void onDualFotaInfoUpdated(DualFotaInfo dualFotaInfo);

    void onModelNameReceived(String str);

    void onProgressUpdated(String str, int i, int i2, int i3, int i4, int i5);

    void onSingleFotaInfoUpdated(SingleFotaInfo singleFotaInfo);

    void onVersionReceived(byte b, String str);
}
