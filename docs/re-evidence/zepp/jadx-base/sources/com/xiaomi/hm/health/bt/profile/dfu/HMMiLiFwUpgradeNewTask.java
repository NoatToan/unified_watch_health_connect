package com.xiaomi.hm.health.bt.profile.dfu;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.mili.MiLiProfile;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;

/* JADX INFO: loaded from: classes12.dex */
public class HMMiLiFwUpgradeNewTask extends HMBaseTask implements IHMFirmwareUpgradeCallback {
    private static final String h = "HMMiLiFwUpgradeNewTask";
    private IHMFirmwareUpgradeCallback b;
    private String c;
    private byte[] d;
    private int e = 0;
    private int f = 0;
    private MiLiProfile g;

    public HMMiLiFwUpgradeNewTask(MiLiProfile mp, String btAddress, byte[] fwData, IHMFirmwareUpgradeCallback fwCb) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.g = null;
        this.c = btAddress;
        this.b = fwCb;
        this.d = fwData;
        this.g = mp;
    }

    private boolean a(byte[] fwdata, int oldVersion, int newVersion, int crc, int flag, boolean needReboot, IHMFirmwareUpgradeCallback cb) {
        boolean zSendFirmwareInfo;
        if (flag == -1) {
            zSendFirmwareInfo = this.g.sendFirmwareInfo(oldVersion, newVersion, fwdata.length, crc);
        } else {
            zSendFirmwareInfo = flag == -2 ? this.g.sendFirmwareInfo(oldVersion, newVersion, fwdata.length, crc, 0) : this.g.sendFirmwareInfo(oldVersion, newVersion, fwdata.length, crc, flag);
        }
        if (!zSendFirmwareInfo) {
            Debug.i(h, "prepareFirmwareUpdate failed!");
            return false;
        }
        if (!this.g.sendFirmwareData(fwdata, cb)) {
            Debug.i(h, "sendFirmwareData failed!");
            return false;
        }
        if (needReboot) {
            Debug.i(h, "need reboot!!!");
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException unused) {
            }
            if (!this.g.reboot()) {
                Debug.i(h, "reboot failed!!!");
                return false;
            }
            Debug.i(h, "reboot success!!!");
            this.g.enableRefreshGatt(true);
        }
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() {
        boolean zA;
        Thread.currentThread().setPriority(10);
        this.b.onFwStart(0);
        byte[] bArr = this.d;
        if (bArr == null || bArr.length < 1) {
            this.b.onFwStop(false);
            return;
        }
        String[] strArrSplit = this.c.split(":");
        int iByteValue = (Integer.decode("0x" + strArrSplit[5]).byteValue() & 255) | ((Integer.decode("0x" + strArrSplit[4]).byteValue() & 255) << 8);
        DeviceInfo deviceInfo = this.g.getDeviceInfo();
        if (deviceInfo == null) {
            this.b.onFwStop(false);
            return;
        }
        if (deviceInfo.isMiLi1S()) {
            int fw1Version = ProfileUtils.getFw1Version(this.d);
            int fw2Version = ProfileUtils.getFw2Version(this.d);
            int firmwareVersion = deviceInfo.getFirmwareVersion();
            int firmware2Version = deviceInfo.getFirmware2Version();
            Debug.i(h, "old firmware version:" + firmwareVersion + ", " + firmware2Version + "  new firmware version:" + fw1Version + ", " + fw2Version);
            int fw2Start = ProfileUtils.getFw2Start(this.d);
            int fw2Size = ProfileUtils.getFw2Size(this.d);
            int fw1Start = ProfileUtils.getFw1Start(this.d);
            int fw1Size = ProfileUtils.getFw1Size(this.d);
            byte[] bArr2 = new byte[fw2Size];
            System.arraycopy(this.d, fw2Start, bArr2, 0, fw2Size);
            int iCrc16 = GattUtils.crc16(bArr2) ^ iByteValue;
            byte[] bArr3 = new byte[fw1Size];
            System.arraycopy(this.d, fw1Start, bArr3, 0, fw1Size);
            int iCrc17 = GattUtils.crc16(bArr3) ^ iByteValue;
            Debug.i(h, "size1:" + fw1Size + ",size2:" + fw2Size + ",data1 len:" + fw1Size + ",data2 len:" + fw2Size);
            Debug.i(h, "newVersion2:" + fw2Version + ",oldVersion2:" + firmware2Version + ",newVersion1:" + fw1Version + ",oldVersion1:" + firmwareVersion);
            boolean fw2Valid = ProfileUtils.getFw2Valid(this.d);
            boolean fw1Valid = ProfileUtils.getFw1Valid(this.d);
            StringBuilder sb = new StringBuilder();
            sb.append("getFw2Valid:");
            sb.append(fw2Valid);
            Debug.i(h, sb.toString());
            Debug.i(h, "getFw1Valid:" + fw1Valid);
            boolean zRevertUpgradeSeq = ProfileUtils.revertUpgradeSeq(this.d);
            Debug.i(h, "seq:" + zRevertUpgradeSeq);
            if (fw2Version <= firmware2Version || fw1Version <= firmwareVersion) {
                if (fw2Version > firmware2Version && fw2Valid) {
                    this.f = fw2Size;
                    zA = a(bArr2, firmware2Version, fw2Version, iCrc16, 1, true, this);
                } else if (fw1Version <= firmwareVersion || !fw1Valid) {
                    zA = false;
                } else {
                    this.f = fw1Size;
                    zA = a(bArr3, firmwareVersion, fw1Version, iCrc17, 0, true, this);
                }
            } else if (zRevertUpgradeSeq) {
                this.f = fw1Size;
                zA = a(bArr3, firmwareVersion, fw1Version, iCrc17, 0, true, this);
            } else {
                this.f = fw1Size + fw2Size;
                zA = fw2Valid ? a(bArr2, firmware2Version, fw2Version, iCrc16, 1, false, this) : false;
                if (zA && fw1Valid) {
                    this.e = fw2Size;
                    zA = a(bArr3, firmwareVersion, fw1Version, iCrc17, 0, true, this);
                }
            }
        } else {
            int firmwareVersion2 = deviceInfo.getFirmwareVersion();
            int versionCodeFromFwData = ProfileUtils.getVersionCodeFromFwData(this.d);
            int iCrc18 = GattUtils.crc16(this.d) ^ iByteValue;
            Debug.i(h, "old firmware version:" + firmwareVersion2 + "  new firmware version:" + versionCodeFromFwData);
            this.f = this.d.length;
            zA = a(this.d, firmwareVersion2, versionCodeFromFwData, iCrc18, deviceInfo.isMiLi1A() ? -2 : -1, true, this);
        }
        this.b.onFwStop(zA);
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
    public void onFwProgress(Progress progress) {
        Debug.i(h, "base size:" + this.e + ",current size:" + progress);
        this.b.onFwProgress(new Progress(this.f, this.e + progress.progress));
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
    public void onFwStart(int none) {
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
    public void onFwStop(boolean result) {
    }
}
