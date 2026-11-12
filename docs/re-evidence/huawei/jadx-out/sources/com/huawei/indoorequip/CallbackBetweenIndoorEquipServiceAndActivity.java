package com.huawei.indoorequip;

import com.huawei.indoorequip.datastruct.QrCodeOrNfcInfo;

/* JADX INFO: loaded from: classes11.dex */
public interface CallbackBetweenIndoorEquipServiceAndActivity {
    void onNewEvent(int i);

    void onNewEvent(int i, QrCodeOrNfcInfo qrCodeOrNfcInfo);

    void onNewEvent(int i, boolean z);
}
