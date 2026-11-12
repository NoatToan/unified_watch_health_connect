package com.huawei.health.ecologydevice.fitness.datastruct;

import defpackage.egx;
import defpackage.ehn;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class SwitchStatusData extends BaseRopeData {
    private static final String TAG = "PDROPE_SwitchStatusData";

    public SwitchStatusData() {
        super(25);
    }

    public boolean isOpenSpeechSoundSwitch() {
        Object obj = this.mFitnessData.get(40017);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    public void setOpenSpeechSoundSwitch(boolean z) {
        this.mFitnessData.put(40017, Boolean.valueOf(z));
    }

    public boolean isOpenSpeechSoundTrainSwitch() {
        Object obj = this.mFitnessData.get(40018);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    public void setOpenSpeechSoundTrainSwitch(boolean z) {
        this.mFitnessData.put(40018, Boolean.valueOf(z));
    }

    public boolean isOpenSpeechSoundCadenceSwitch() {
        Object obj = this.mFitnessData.get(40019);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    public void setOpenSpeechSoundCadenceSwitch(boolean z) {
        this.mFitnessData.put(40019, Boolean.valueOf(z));
    }

    public boolean isOpenSpeechSoundMotorSwitch() {
        Object obj = this.mFitnessData.get(40020);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    public void setOpenSpeechSoundMotorSwitch(boolean z) {
        this.mFitnessData.put(40020, Boolean.valueOf(z));
    }

    public boolean isOpenSpeechSoundHeartRateMonitoringSwitch() {
        Object obj = this.mFitnessData.get(40021);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    public void setOpenSpeechSoundHeartRateMonitoringSwitch(boolean z) {
        this.mFitnessData.put(40021, Boolean.valueOf(z));
    }

    public String getBrMacAddress() {
        Object obj = this.mFitnessData.get(40022);
        return obj instanceof String ? (String) obj : "";
    }

    public void setBrMacAddress(String str) {
        this.mFitnessData.put(40022, str);
    }

    public boolean isOpenBr() {
        Object obj = this.mFitnessData.get(40023);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    public void setOpenBr(boolean z) {
        this.mFitnessData.put(40023, Boolean.valueOf(z));
    }

    @Override // com.huawei.health.ecologydevice.fitness.datastruct.BaseRopeData
    public BaseRopeData parseData() {
        int i = this.mCode;
        if (i == 0) {
            parseSwitchEnquireData(this.mData, this.mOffset, this.mFlag);
            return this;
        }
        if (i == 1) {
            parseSwitchStatusData(this.mData, this.mOffset);
            return this;
        }
        if (i != 2 && i != 3) {
            return this;
        }
        parseBrSettingResultData(this.mData, this.mOffset);
        return this;
    }

    private void parseSwitchEnquireData(byte[] bArr, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        boolean z2 = ((i2 & 2) != 0) || ((i2 & 4) != 0);
        LogUtil.a(TAG, "flag: ", Integer.valueOf(i2), " isHasSwitchSettingResult: ", Boolean.valueOf(z), " isHasBrSettingResult: ", Boolean.valueOf(z2));
        if (z) {
            parseSwitchStatusData(bArr, i);
            i += 2;
        }
        if (z2) {
            parseBrSettingResultData(bArr, i);
        }
    }

    private void parseSwitchStatusData(byte[] bArr, int i) {
        int iD = ehn.d(bArr, 18, i);
        boolean z = (iD & 1) != 0;
        setOpenSpeechSoundSwitch(z);
        boolean z2 = (iD & 2) != 0;
        setOpenSpeechSoundTrainSwitch(z2);
        boolean z3 = (iD & 4) != 0;
        setOpenSpeechSoundCadenceSwitch(z3);
        boolean z4 = (iD & 8) != 0;
        setOpenSpeechSoundMotorSwitch(z4);
        boolean z5 = (iD & 16) != 0;
        setOpenSpeechSoundHeartRateMonitoringSwitch(z5);
        LogUtil.a(TAG, "isOpenSpeechSound= ", Boolean.valueOf(z), " isOpenSpeechSoundTrain= ", Boolean.valueOf(z2), " isOpenSpeechSoundCadence= ", Boolean.valueOf(z3), " isOpenSpeechSoundMotor= ", Boolean.valueOf(z4), " isOpenSpeechSoundHeartRateMonitoring= ", Boolean.valueOf(z5));
    }

    private void parseBrSettingResultData(byte[] bArr, int i) {
        String strE = ehn.e(ehn.c(bArr, i, 17), 0);
        int iD = ehn.d(bArr, 17, i + 17);
        LogUtil.a(TAG, "isOpenBr: ", Boolean.valueOf(iD != 0));
        setBrMacAddress(strE);
        setOpenBr(iD != 0);
    }

    @Override // com.huawei.health.ecologydevice.fitness.datastruct.BaseRopeData
    public egx getTransmitCommand() {
        byte[] bArr;
        egx.c cVar = new egx.c();
        cVar.a(this.mCommand);
        cVar.d(this.mCode);
        int i = this.mCode;
        if (i == 0) {
            cVar.e(this.mPara[0]);
            bArr = new byte[0];
        } else if (i == 1) {
            bArr = new byte[2];
            ehn.b(bArr, this.mPara[0], 0);
        } else {
            bArr = new byte[0];
        }
        cVar.e(bArr);
        return cVar.c();
    }
}
