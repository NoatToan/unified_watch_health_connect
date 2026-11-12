package com.airoha.android.lib.RaceCommand.packet.fota;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;

/* JADX INFO: loaded from: classes2.dex */
public class RaceIndActiveFotaPreparation extends RacePacket {
    public RaceIndActiveFotaPreparation(byte b) {
        super(RaceType.INDICATION, RaceId.RACE_FOTA_ACTIVE_FOTA_PREPARATION, new byte[]{0, b});
    }
}
