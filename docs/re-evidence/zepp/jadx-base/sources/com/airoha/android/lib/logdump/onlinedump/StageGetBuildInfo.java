package com.airoha.android.lib.logdump.onlinedump;

import android.os.Environment;
import android.util.Log;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.mmi.AirohaMmiMgr;
import com.airoha.android.lib.mmi.stage.MmiStage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class StageGetBuildInfo extends MmiStage {
    public StageGetBuildInfo(AirohaMmiMgr airohaMmiMgr) {
        super(airohaMmiMgr);
        this.mRaceId = RaceId.RACE_GET_BUILD_VERSION_INFO;
        this.mRaceRespType = RaceType.RESPONSE;
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void genRacePackets() {
        RacePacket racePacket = new RacePacket(RaceType.CMD_NEED_RESP, this.mRaceId);
        this.mCmdPacketQueue.offer(racePacket);
        this.mCmdPacketMap.put(this.TAG, racePacket);
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        this.mAirohaLink.logToFile(this.TAG, "RACE_GET_BUILD_VERSION_INFO resp status: " + ((int) b));
        RacePacket racePacket = this.mCmdPacketMap.get(this.TAG);
        if (b == 0) {
            byte[] bArr2 = new byte[48];
            System.arraycopy(bArr, 7, bArr2, 0, 48);
            String str = new String(bArr2);
            Arrays.fill(bArr2, (byte) 0);
            System.arraycopy(bArr, 55, bArr2, 0, 32);
            String str2 = new String(bArr2);
            Arrays.fill(bArr2, (byte) 0);
            System.arraycopy(bArr, 87, bArr2, 0, 16);
            String str3 = new String(bArr2);
            StringBuilder sb = new StringBuilder();
            sb.append(Environment.getExternalStorageDirectory());
            String str4 = File.separator;
            sb.append(str4);
            sb.append("Airoha");
            sb.append(str4);
            sb.append("AB155x");
            sb.append(str4);
            sb.append("onlinelog");
            String string = sb.toString();
            File file = new File(string, "version.txt");
            try {
                File file2 = new File(string);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                if (file.exists()) {
                    file.delete();
                }
                file.createNewFile();
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                fileOutputStream.write(("SW version: " + str.trim() + "\n").getBytes());
                fileOutputStream.write(("Build time: " + str2.trim() + "\n").getBytes());
                fileOutputStream.write(("HW version: " + str3.trim() + "\n").getBytes());
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (IOException e) {
                Log.d("StageGetBuildInfo", "create FileOutputStream fail");
                e.printStackTrace();
            }
            racePacket.setIsRespStatusSuccess();
        }
    }
}
