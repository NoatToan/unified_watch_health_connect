package com.airoha.android.lib.RaceCommand.packet.fota.forSingle;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;

/* JADX INFO: loaded from: classes2.dex */
public class RaceCmdFileSystemPartitionInfoQuery extends RacePacket {
    public RaceCmdFileSystemPartitionInfoQuery(byte[] bArr) {
        super(RaceType.CMD_NEED_RESP, RaceId.RACE_FOTA_PARTITION_INFO_QUERY, bArr);
    }
}
