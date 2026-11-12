package com.airoha.android.lib.simulator;

import com.airoha.android.lib.RaceCommand.packet.fota.RaceIndActiveFotaPreparation;
import com.airoha.android.lib.RaceCommand.packet.fota.RaceRespActiveFotaPreparation;
import com.airoha.android.lib.RaceCommand.packet.fota.fotTws.RaceIndFotaGetVersion;
import com.airoha.android.lib.RaceCommand.packet.fota.fotTws.RaceRespFotaGetVersion;
import com.airoha.android.lib.RaceCommand.packet.mmi.RaceIndRoleSwitch;
import com.airoha.android.lib.transport.AirohaLink;
import com.airoha.android.lib.transport.PacketParser.OnRacePacketListener;

/* JADX INFO: loaded from: classes2.dex */
public class AirohaSimFwServer {
    public static final String TAG = "AirohaSimFwServer";
    private AirohaLink a;
    private OnRacePacketListener b;

    public class a implements OnRacePacketListener {
        public a() {
        }

        @Override // com.airoha.android.lib.transport.PacketParser.OnRacePacketListener
        public void handleRespOrInd(int i, byte[] bArr, int i2) {
            AirohaSimFwServer.this.a.logToFile(AirohaSimFwServer.TAG, "received raceId: " + String.format("%04X", Integer.valueOf(i)) + ", raceType: " + String.format("%02X", Integer.valueOf(i2)));
            AirohaSimFwServer.this.d(i, bArr, i2);
            AirohaSimFwServer.this.e(i, bArr, i2);
        }
    }

    public AirohaSimFwServer(AirohaLink airohaLink) {
        a aVar = new a();
        this.b = aVar;
        this.a = airohaLink;
        airohaLink.registerOnRacePacketListener(TAG, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, byte[] bArr, int i2) {
        if (i != 7193) {
            return;
        }
        byte b = bArr[6];
        RaceRespActiveFotaPreparation raceRespActiveFotaPreparation = new RaceRespActiveFotaPreparation();
        RaceIndActiveFotaPreparation raceIndActiveFotaPreparation = new RaceIndActiveFotaPreparation(b);
        this.a.sendCommand(raceRespActiveFotaPreparation.getRawFotaMode());
        this.a.sendCommand(raceIndActiveFotaPreparation.getRawFotaMode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, byte[] bArr, int i2) {
        if (i != 7175) {
            return;
        }
        byte b = bArr[6];
        RaceRespFotaGetVersion raceRespFotaGetVersion = new RaceRespFotaGetVersion();
        RaceIndFotaGetVersion raceIndFotaGetVersion = new RaceIndFotaGetVersion(b);
        this.a.sendCommand(raceRespFotaGetVersion.getRawFotaMode());
        this.a.sendCommand(raceIndFotaGetVersion.getRawFotaMode());
    }

    public void sendRoleSwitchInd() {
        this.a.sendCommand(new RaceIndRoleSwitch().getRawFotaMode());
    }
}
