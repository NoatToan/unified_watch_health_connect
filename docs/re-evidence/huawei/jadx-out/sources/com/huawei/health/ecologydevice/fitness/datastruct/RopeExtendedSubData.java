package com.huawei.health.ecologydevice.fitness.datastruct;

import defpackage.egx;
import defpackage.ehn;

/* JADX INFO: loaded from: classes7.dex */
public class RopeExtendedSubData extends BaseRopeData {
    public static final int ALL_DATA_FLAG = 31;
    public static final int ENERGY_POSITION = 3;
    public static final int FLAG_POSITION = 0;
    private static final int ONE_BYTE_PARA_COUNT = 2;
    public static final int PARA_LENGTH = 6;
    private static final int ROPE_CONTROL_ROPE_EXTENDED_LENGTH = 10;
    public static final int ROPE_INTERMITTENT_GROUP_NO_POSITION = 4;
    public static final int ROPE_MACHINE_STATUS_POSITION = 5;
    public static final int SKIPPING_NUM_POSITION = 2;
    public static final int SKIPPING_SPEED_POSITION = 1;
    private static final int TWO_BYTE_PARA_COUNT = 4;

    @Override // com.huawei.health.ecologydevice.fitness.datastruct.BaseRopeData
    public egx getTransmitCommand() {
        byte[] commandCodePara;
        egx.c cVar = new egx.c();
        cVar.a(this.mCommand);
        cVar.d(this.mCode);
        if (this.mCode == 1) {
            commandCodePara = getCommandCodePara();
        } else {
            commandCodePara = new byte[0];
        }
        cVar.e(commandCodePara);
        return cVar.c();
    }

    private byte[] getCommandCodePara() {
        byte[] bArr = new byte[10];
        ehn.e(bArr, 0, this.mPara, 0, 4);
        ehn.d(bArr, 8, this.mPara, 4, 2);
        return bArr;
    }
}
