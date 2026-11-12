package com.airoha.android.lib.fota.fotaSetting;

import com.airoha.android.lib.fota.actionEnum.SingleActionEnum;

/* JADX INFO: loaded from: classes2.dex */
public class FotaSingleSettings {
    public SingleActionEnum actionEnum;
    public PartitionType partitionType = PartitionType.Fota;
    public int programSlidingWindow = 4;
    public int eraseSlidingWindow = 4;
    public boolean enableResumable = true;
    public boolean enableNormalPowerMode = true;
    public boolean enableActiveFota = false;
    public int batteryThreshold = 70;
    public int programInterval = 0;
}
