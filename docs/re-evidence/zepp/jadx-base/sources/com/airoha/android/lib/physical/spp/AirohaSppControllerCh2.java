package com.airoha.android.lib.physical.spp;

import com.airoha.android.lib.transport.AirohaLink;
import com.xiaomi.hm.health.bt.model.HMDisplaySetting;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.io.IOException;
import org.threeten.bp.a;

/* JADX INFO: loaded from: classes2.dex */
public class AirohaSppControllerCh2 extends AirohaSppController {
    private static final byte[] p = {-127, -62, -25, 42, 5, -111, a.n, HMProSyncDataBaseProfile.DATA_TYPE_SLEEPING_BLOOD_PRESSURE_RESULT, -95, -1, 5, -7, -120, 89, HMDisplaySetting.TYPE_VENICE, 81};

    public AirohaSppControllerCh2(AirohaLink airohaLink) {
        super(airohaLink);
    }

    @Override // com.airoha.android.lib.physical.spp.AirohaSppController
    public byte[] getConnUUID() {
        return p;
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
