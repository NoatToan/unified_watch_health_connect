package com.airoha.android.lib.RaceCommand.packet.fota.fotTws;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;

/* JADX INFO: loaded from: classes2.dex */
public class RaceIndFotaGetVersion extends RacePacket {
    public RaceIndFotaGetVersion(byte b) {
        super(RaceType.INDICATION, RaceId.RACE_FOTA_GET_VERSION, new byte[]{0, b, 0});
    }
}
