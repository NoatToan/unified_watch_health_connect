package com.xiaomi.hm.health.bt.classic;

import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.ftms.FTMSCommand;
import com.xiaomi.hm.health.bt.profile.ftms.IFTMSListener;
import com.xiaomi.hm.health.bt.profile.ftms.MachineStatus;
import com.xiaomi.hm.health.bt.profile.ftms.TreadmillData;
import com.xiaomi.hm.health.bt.profile.sport.SportCommand;

/* JADX INFO: loaded from: classes19.dex */
public class HMFTMSProfile implements IGattCallback.INotifyCallback {
    private IFTMSListener a = null;
    private ITransport b;

    public HMFTMSProfile(ITransport transport) {
        this.b = transport;
        transport.registerNotification(Protocol.FTMS_TD, this);
        this.b.registerNotification(Protocol.FTMS_STATUS, new IGattCallback.INotifyCallback() { // from class: pu2
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.b(bArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(byte[] bArr) {
        MachineStatus machineStatusC = c(bArr);
        if (machineStatusC != null) {
            this.a.onMachineStatus(machineStatusC);
        }
    }

    private MachineStatus c(byte[] value) {
        byte[] bArr = null;
        if (value == null || value.length < 1) {
            return null;
        }
        int length = value.length;
        byte b = value[0];
        if (length > 1) {
            int i = length - 1;
            bArr = new byte[i];
            System.arraycopy(value, 1, bArr, 0, i);
        }
        return new MachineStatus(b, bArr);
    }

    private TreadmillData d(byte[] value) {
        if (value == null) {
            return null;
        }
        int i = 2;
        if (value.length < 2) {
            return null;
        }
        TreadmillData treadmillData = new TreadmillData();
        int i2 = (value[0] & 255) | ((value[1] & 255) << 8);
        if ((i2 & 1) == 0) {
            treadmillData.setInstantaneousSpeed((((value[2] & 255) | ((value[3] & 255) << 8)) * 10.0f) / 3600.0f);
            i = 4;
        }
        if ((i2 & 2) != 0) {
            int i3 = i + 1;
            treadmillData.setAverageSpeed((((value[i] & 255) | ((value[i3] & 255) << 8)) * 10.0f) / 3600.0f);
            i = i3 + 1;
        }
        if ((i2 & 4) != 0) {
            int i4 = i + 1;
            int i5 = i4 + 1;
            treadmillData.setTotalDistance((value[i] & 255) | ((value[i4] & 255) << 8) | ((value[i5] & 255) << 16));
            i = i5 + 1;
        }
        if ((i2 & 8) != 0) {
            int i6 = i + 1;
            int i7 = i6 + 1;
            treadmillData.setInclination(((value[i] & 255) | ((value[i6] & 255) << 8)) * 0.1f);
            int i8 = i7 + 1;
            treadmillData.setRampAngle((((value[i8] & 255) << 8) | (value[i7] & 255)) * 0.1f);
            i = i8 + 1;
        }
        if ((i2 & 16) != 0) {
            int i9 = i + 1;
            int i10 = i9 + 1;
            treadmillData.setPositiveElevationGain((value[i] & 255) | ((value[i9] & 255) << 8));
            int i11 = i10 + 1;
            treadmillData.setNegativeElevationGain(((value[i11] & 255) << 8) | (value[i10] & 255));
            i = i11 + 1;
        }
        if ((i2 & 32) != 0) {
            treadmillData.setInstantaneousPace(((value[i] & 255) * 1000.0f) / 60.0f);
            i++;
        }
        if ((i2 & 64) != 0) {
            treadmillData.setAveragePace(((value[i] & 255) * 1000.0f) / 60.0f);
            i++;
        }
        if ((i2 & 128) != 0) {
            int i12 = i + 1;
            int i13 = i12 + 1;
            treadmillData.setExpendedEnergy((value[i] & 255) | ((value[i12] & 255) << 8));
            int i14 = i13 + 1;
            int i15 = value[i13] & 255;
            int i16 = i14 + 1;
            treadmillData.setEnergyPerHour(((value[i14] & 255) << 8) | i15);
            i = i16 + 1;
            treadmillData.setEnergyPerMinute(value[i16] & 255);
        }
        if ((i2 & 256) != 0) {
            treadmillData.setHeartRate(value[i] & 255);
            i++;
        }
        if ((i2 & 512) != 0) {
            treadmillData.setMetabolicEquivalent(value[i] & 255);
            i++;
        }
        if ((i2 & 1024) != 0) {
            int i17 = i + 1;
            treadmillData.setElapsedTime((value[i] & 255) | ((value[i17] & 255) << 8));
            i = i17 + 1;
        }
        if ((i2 & 2048) != 0) {
            int i18 = i + 1;
            treadmillData.setRemainingTime((value[i] & 255) | ((value[i18] & 255) << 8));
            i = i18 + 1;
        }
        if ((i2 & 4096) != 0) {
            int i19 = i + 1;
            int i20 = i19 + 1;
            treadmillData.setForceOnBelt((value[i] & 255) | ((value[i19] & 255) << 8));
            treadmillData.setPowerOutput(((value[i20 + 1] & 255) << 8) | (value[i20] & 255));
        }
        return treadmillData;
    }

    @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
    public void notify(byte[] value) {
        TreadmillData treadmillDataD;
        if (this.a == null || (treadmillDataD = d(value)) == null) {
            return;
        }
        this.a.onTreadmillData(treadmillDataD);
    }

    public boolean sendFTMSCommand(FTMSCommand command) {
        if (command == null) {
            return false;
        }
        if (command.getOp() == 24) {
            BoltSportStateHolder.updateSportState(SportCommand.STOP);
        }
        byte[] bytes = command.getBytes();
        if (bytes == null || bytes.length == 0) {
            return false;
        }
        return this.b.sendCommandWithResponse(Protocol.FTMS_CP, bytes, 5000).isSuccess((byte) command.getOp());
    }

    public void setListener(IFTMSListener listener) {
        this.a = listener;
    }
}
