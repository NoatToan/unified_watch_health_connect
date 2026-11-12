package defpackage;

import com.huawei.health.ecologydevice.fitness.datastruct.RopeRealData;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class ehj extends ehd {
    public RopeRealData a() {
        c();
        byte[] bArrB = b();
        if (bArrB == null || bArrB.length <= 0) {
            LogUtil.a("PDROPE_RealTimeDataPackets", "protocolData is null");
            return null;
        }
        if (!d(bArrB, 0, bArrB.length - 1)) {
            LogUtil.d("PDROPE_RealTimeDataPackets", "The data is not received.");
            return null;
        }
        LogUtil.a("PDROPE_RealTimeDataPackets", "real-time protocolData = ", erh.a(bArrB, ""));
        RopeRealData ropeRealDataD = d(bArrB, 1);
        if (ropeRealDataD == null) {
            LogUtil.a("PDROPE_RealTimeDataPackets", "The data is error");
            return ropeRealDataD;
        }
        int iD = ehn.d(bArrB, 17, 16);
        d(iD);
        LogUtil.e("PDROPE_RealTimeDataPackets", "RopeDataCharacteristic, totalPublicLength:" + iD);
        int iD2 = ehn.d(bArrB, 17, 17);
        ropeRealDataD.setRopeSkippingMode(iD2);
        LogUtil.a("PDROPE_RealTimeDataPackets", "RopeDataCharacteristic, ropeType:" + iD2);
        int iD3 = ehn.d(bArrB, 18, 18);
        ropeRealDataD.setSkippingSpeedSeconds(iD3);
        LogUtil.a("PDROPE_RealTimeDataPackets", "RopeDataCharacteristic, skippingSpeedSeconds:" + iD3);
        b(bArrB, ropeRealDataD, 20);
        return ropeRealDataD;
    }

    private void b(byte[] bArr, RopeRealData ropeRealData, int i) {
        if (ropeRealData.getRopeSkippingMode() == 4 || ropeRealData.getRopeSkippingMode() == 5) {
            int iD = ehn.d(bArr, 17, i);
            ropeRealData.setRopeIntermissionGroupNo(iD);
            int iD2 = ehn.d(bArr, 18, i + 1);
            LogUtil.a("PDROPE_RealTimeDataPackets", "RopeDataCharacteristic, ropeIntermissionGroup:" + iD, ", ropeIntermissionTime:" + iD2);
            if (ropeRealData.getStatus() == 1) {
                ropeRealData.setRopeIntermissionTime(iD2);
                return;
            } else {
                if (ropeRealData.getStatus() == 2) {
                    ropeRealData.setRopeIntermissionRestTime(iD2);
                    return;
                }
                return;
            }
        }
        if (ropeRealData.getRopeSkippingMode() == 3) {
            ropeRealData.setRopeSkippingTrick(b(bArr, i));
        } else {
            LogUtil.c("PDROPE_RealTimeDataPackets", "protocolData is error");
        }
    }

    public RopeRealData d(byte[] bArr, int i) {
        if (bArr == null || bArr.length == 0 || bArr.length < 14) {
            LogUtil.a("PDROPE_RealTimeDataPackets", "RopeRealData is error");
            return null;
        }
        RopeRealData ropeRealData = new RopeRealData();
        int iD = ehn.d(bArr, 17, i);
        ropeRealData.setStatus(iD);
        LogUtil.a("PDROPE_RealTimeDataPackets", "RopeDataCharacteristic, status:" + iD);
        int iD2 = ehn.d(bArr, 18, i + 1);
        ropeRealData.setElapsedTime(iD2);
        LogUtil.a("PDROPE_RealTimeDataPackets", "RopeDataCharacteristic, elapsedTime:" + iD2);
        int iD3 = ehn.d(bArr, 18, i + 3);
        ropeRealData.setTotalSkip(iD3);
        LogUtil.a("PDROPE_RealTimeDataPackets", "RopeDataCharacteristic, totalSkip:" + iD3);
        int iD4 = ehn.d(bArr, 18, i + 5);
        ropeRealData.setInstantaneousSpeed(iD4);
        LogUtil.a("PDROPE_RealTimeDataPackets", "RopeDataCharacteristic, instantaneousSpeed:" + iD4);
        int iD5 = ehn.d(bArr, 18, i + 7);
        ropeRealData.setInterruptTimes(iD5);
        LogUtil.a("PDROPE_RealTimeDataPackets", "RopeDataCharacteristic, interruptTimes:" + iD5);
        int iD6 = ehn.d(bArr, 18, i + 9);
        ropeRealData.setCurrentContinueSkip(iD6);
        LogUtil.a("PDROPE_RealTimeDataPackets", "RopeDataCharacteristic, currentContinueSkip:" + iD6);
        int iD7 = ehn.d(bArr, 18, i + 11);
        ropeRealData.setTotalEnergy(iD7);
        LogUtil.a("PDROPE_RealTimeDataPackets", "RopeDataCharacteristic, totalEnergy:" + iD7);
        return ropeRealData;
    }
}
