package com.airoha.android.lib.RaceCommand.packet.fota.forSingle;

import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;

/* JADX INFO: loaded from: classes2.dex */
public class RaceCmdStoragePageProgram extends RacePacket {
    public static final /* synthetic */ boolean o = false;
    private byte l;
    private byte m;
    private StoragePageData[] n;

    public RaceCmdStoragePageProgram(byte b, byte b2, StoragePageData[] storagePageDataArr) {
        super(RaceType.CMD_NEED_RESP, 1026);
        this.l = b;
        this.m = b2;
        this.n = storagePageDataArr;
        byte[] bArr = new byte[(b2 * 261) + 2];
        bArr[0] = b;
        bArr[1] = b2;
        for (int i = 0; i < this.m; i++) {
            System.arraycopy(this.n[i].toRaw(), 0, bArr, (i * 261) + 2, 261);
        }
        setPayload(bArr);
        setAddr(this.n[0].StorageAddress);
    }
}
