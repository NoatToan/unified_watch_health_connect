package com.airoha.android.lib.physical.spp;

import com.airoha.android.lib.transport.AirohaLink;
import com.xiaomi.hm.health.bt.model.HMDisplaySetting;
import java.io.IOException;
import org.threeten.bp.a;

/* JADX INFO: loaded from: classes2.dex */
public class AirohaSppControllerCh3 extends AirohaSppController {
    private static final String p = "AirohaSppControllerR";
    private static final byte[] q = {-8, -47, -5, -28, 121, 102, a.m, 52, -128, 36, -1, -106, -55, HMDisplaySetting.TYPE_VENICE, 14, 21};

    public AirohaSppControllerCh3(AirohaLink airohaLink) {
        super(airohaLink);
    }

    @Override // com.airoha.android.lib.physical.spp.AirohaSppController
    public byte[] getConnUUID() {
        return q;
    }

    @Override // com.airoha.android.lib.physical.spp.AirohaSppController
    public void handleInputStream(RespIndPacketBuffer respIndPacketBuffer) throws IOException {
        int iAvailable = this.mInStream.available();
        if (iAvailable > 0) {
            byte[] bArr = new byte[iAvailable];
            this.mInStream.read(bArr);
            this.mAirohaLink.handlePhysicalPacket(bArr);
        }
    }
}
