package com.airoha.android.lib.physical.spp;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class RespIndPacketBuffer {
    private final List<Byte> a = new ArrayList();

    public void addArrayToPacket(byte[] bArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            this.a.add(Byte.valueOf(bArr[i2]));
        }
    }

    public byte[] getPacket() {
        byte[] bArr = new byte[this.a.size()];
        for (int i = 0; i < this.a.size(); i++) {
            bArr[i] = this.a.get(i).byteValue();
        }
        return bArr;
    }

    public void resetPacket() {
        this.a.clear();
    }
}
