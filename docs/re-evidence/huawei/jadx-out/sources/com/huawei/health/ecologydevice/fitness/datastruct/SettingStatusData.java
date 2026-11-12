package com.huawei.health.ecologydevice.fitness.datastruct;

import defpackage.egx;
import defpackage.ehn;

/* JADX INFO: loaded from: classes7.dex */
public class SettingStatusData extends BaseRopeData {
    public SettingStatusData() {
        super(26);
    }

    public int getSettingVolume() {
        Object obj = this.mFitnessData.get(40024);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public void setSettingVolume(int i) {
        this.mFitnessData.put(40024, Integer.valueOf(i));
    }

    public int getSettingVoiceCoachingCorpus() {
        Object obj = this.mFitnessData.get(40025);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public void setSettingVoiceCoachingCorpus(int i) {
        this.mFitnessData.put(40025, Integer.valueOf(i));
    }

    public int getSettingVoiceCv() {
        Object obj = this.mFitnessData.get(40026);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public void setSettingVoiceCv(int i) {
        this.mFitnessData.put(40026, Integer.valueOf(i));
    }

    public int getSettingBeatSoundType() {
        Object obj = this.mFitnessData.get(40027);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public void setSettingBeatSoundType(int i) {
        this.mFitnessData.put(40027, Integer.valueOf(i));
    }

    public int getSettingBeatSound() {
        Object obj = this.mFitnessData.get(40028);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public void setSettingBeatSound(int i) {
        this.mFitnessData.put(40028, Integer.valueOf(i));
    }

    public int getSettingHeartRateUpperLimit() {
        Object obj = this.mFitnessData.get(40029);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public void setSettingHeartRateUpperLimit(int i) {
        this.mFitnessData.put(40029, Integer.valueOf(i));
    }

    public int getSettingReserveHeartRate() {
        Object obj = this.mFitnessData.get(40030);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public void setSettingReserveHeartRate(int i) {
        this.mFitnessData.put(40030, Integer.valueOf(i));
    }

    public int getSettingAerobicBase() {
        Object obj = this.mFitnessData.get(40031);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public void setSettingAerobicBase(int i) {
        this.mFitnessData.put(40031, Integer.valueOf(i));
    }

    public int getSettingAerobicAdvances() {
        Object obj = this.mFitnessData.get(40032);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public void setSettingAerobicAdvances(int i) {
        this.mFitnessData.put(40032, Integer.valueOf(i));
    }

    public int getSettingLactateThreshold() {
        Object obj = this.mFitnessData.get(40033);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public void setSettingLactateThreshold(int i) {
        this.mFitnessData.put(40033, Integer.valueOf(i));
    }

    public int getSettingAnaerobicFoundation() {
        Object obj = this.mFitnessData.get(40034);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public void setSettingAnaerobicFoundation(int i) {
        this.mFitnessData.put(40034, Integer.valueOf(i));
    }

    public int getSettingAnaerobicAdvanced() {
        Object obj = this.mFitnessData.get(40035);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public void setSettingAnaerobicAdvanced(int i) {
        this.mFitnessData.put(40035, Integer.valueOf(i));
    }

    public int getSettingMaximumRangeValue() {
        Object obj = this.mFitnessData.get(40036);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public void setSettingMaximumRangeValue(int i) {
        this.mFitnessData.put(40036, Integer.valueOf(i));
    }

    public int getSettingBestNumberSingleJumps() {
        Object obj = this.mFitnessData.get(40037);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public void setSettingBestNumberSingleJumps(int i) {
        this.mFitnessData.put(40037, Integer.valueOf(i));
    }

    public int getSettingBestNumberConsecutiveJumps() {
        Object obj = this.mFitnessData.get(40038);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public void setSettingBestNumberConsecutiveJumps(int i) {
        this.mFitnessData.put(40038, Integer.valueOf(i));
    }

    public int getSettingBestSkippingDuration() {
        Object obj = this.mFitnessData.get(40039);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public void setSettingBestSkippingDuration(int i) {
        this.mFitnessData.put(40039, Integer.valueOf(i));
    }

    public int getSettingBestSkippingSpeed() {
        Object obj = this.mFitnessData.get(40040);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public void setSettingBestSkippingSpeed(int i) {
        this.mFitnessData.put(40040, Integer.valueOf(i));
    }

    public int getSettingVoiceBroadcastFrequency() {
        Object obj = this.mFitnessData.get(40041);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public void setSettingVoiceBroadcastFrequency(int i) {
        this.mFitnessData.put(40041, Integer.valueOf(i));
    }

    public int getWeight() {
        Object obj = this.mFitnessData.get(40042);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public void setWeight(int i) {
        this.mFitnessData.put(40042, Integer.valueOf(i));
    }

    public int getHeight() {
        Object obj = this.mFitnessData.get(40043);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public void setHeight(int i) {
        this.mFitnessData.put(40043, Integer.valueOf(i));
    }

    public int getPlayMode() {
        Object obj = this.mFitnessData.get(40069);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public void setPlayMode(int i) {
        this.mFitnessData.put(40069, Integer.valueOf(i));
    }

    public int getSex() {
        Object obj = this.mFitnessData.get(40044);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public void setSex(int i) {
        this.mFitnessData.put(40044, Integer.valueOf(i));
    }

    @Override // com.huawei.health.ecologydevice.fitness.datastruct.BaseRopeData
    public BaseRopeData parseData() {
        switch (this.mCode) {
            case 0:
                parseSettingEnquire(this.mData, this.mOffset, this.mFlag);
                break;
            case 1:
                parseSettingVolume(this.mData, this.mOffset);
                break;
            case 2:
                parseSettingVoiceCoachingCorpus(this.mData, this.mOffset);
                break;
            case 3:
                parseSettingVoiceCv(this.mData, this.mOffset);
                break;
            case 4:
                parseSettingBeatSound(this.mData, this.mOffset);
                break;
            case 5:
                parseSettingHeartRateUpperLimit(this.mData, this.mOffset);
                break;
            case 6:
                parseSettingEnquireHeartRateRange(this.mData, this.mOffset);
                break;
            case 7:
                parseSettingEnquireBestSkipData(this.mData, this.mOffset);
                break;
            case 8:
                parseSettingVoiceBroadcastFrequency(this.mData, this.mOffset);
                break;
            case 9:
                parseSettingCalories(this.mData, this.mOffset);
                break;
            case 10:
                parseSettingPlayMode(this.mData, this.mOffset);
                break;
        }
        return this;
    }

    private void parseSettingPlayMode(byte[] bArr, int i) {
        setPlayMode(ehn.d(bArr, 17, i));
    }

    private void parseSettingEnquire(byte[] bArr, int i, int i2) {
        if ((i2 & 1) != 0) {
            i = parseSettingVolume(bArr, i);
        }
        if ((i2 & 2) != 0) {
            i = parseSettingVoiceCoachingCorpus(bArr, i);
        }
        if ((i2 & 4) != 0) {
            i = parseSettingVoiceCv(bArr, i);
        }
        if ((i2 & 8) != 0) {
            i = parseSettingBeatSound(bArr, i);
        }
        if ((i2 & 16) != 0) {
            i = parseSettingHeartRateUpperLimit(bArr, i);
        }
        if ((i2 & 32) != 0) {
            i = parseSettingEnquireHeartRateRange(bArr, i);
        }
        if ((i2 & 64) != 0) {
            i = parseSettingEnquireBestSkipData(bArr, i);
        }
        if ((i2 & 128) != 0) {
            i = parseSettingVoiceBroadcastFrequency(bArr, i);
        }
        if ((i2 & 256) != 0) {
            i = parseSettingCalories(bArr, i);
        }
        if ((i2 & 512) != 0) {
            parseSettingPlayMode(bArr, i);
        }
    }

    private int parseSettingVolume(byte[] bArr, int i) {
        setSettingVolume(ehn.d(bArr, 17, i));
        return i + 1;
    }

    private int parseSettingVoiceCoachingCorpus(byte[] bArr, int i) {
        setSettingVoiceCoachingCorpus(ehn.d(bArr, 17, i));
        return i + 1;
    }

    private int parseSettingVoiceCv(byte[] bArr, int i) {
        setSettingVoiceCv(ehn.d(bArr, 17, i));
        return i + 1;
    }

    private int parseSettingBeatSound(byte[] bArr, int i) {
        setSettingBeatSoundType(ehn.d(bArr, 17, i));
        setSettingBeatSound(ehn.d(bArr, 18, i + 1));
        return i + 3;
    }

    private int parseSettingHeartRateUpperLimit(byte[] bArr, int i) {
        setSettingHeartRateUpperLimit(ehn.d(bArr, 17, i));
        return i + 1;
    }

    private int parseSettingEnquireHeartRateRange(byte[] bArr, int i) {
        setSettingReserveHeartRate(ehn.d(bArr, 17, i));
        setSettingAerobicBase(ehn.d(bArr, 18, i + 1));
        setSettingAerobicAdvances(ehn.d(bArr, 18, i + 3));
        setSettingLactateThreshold(ehn.d(bArr, 18, i + 5));
        setSettingAnaerobicFoundation(ehn.d(bArr, 18, i + 7));
        setSettingAnaerobicAdvanced(ehn.d(bArr, 18, i + 9));
        setSettingMaximumRangeValue(ehn.d(bArr, 18, i + 11));
        return i + 13;
    }

    private int parseSettingEnquireBestSkipData(byte[] bArr, int i) {
        setSettingBestNumberSingleJumps(ehn.d(bArr, 18, i));
        setSettingBestNumberConsecutiveJumps(ehn.d(bArr, 18, i + 2));
        setSettingBestSkippingDuration(ehn.d(bArr, 18, i + 4));
        setSettingBestSkippingSpeed(ehn.d(bArr, 18, i + 6));
        return i + 8;
    }

    private int parseSettingVoiceBroadcastFrequency(byte[] bArr, int i) {
        setSettingVoiceBroadcastFrequency(ehn.d(bArr, 18, i));
        return i + 2;
    }

    private int parseSettingCalories(byte[] bArr, int i) {
        setWeight(ehn.d(bArr, 18, i));
        setHeight(ehn.d(bArr, 17, i + 2));
        setSex(ehn.d(bArr, 17, i + 3));
        return i + 4;
    }

    @Override // com.huawei.health.ecologydevice.fitness.datastruct.BaseRopeData
    public egx getTransmitCommand() {
        byte[] settingBeatSoundPara;
        egx.c cVar = new egx.c();
        cVar.a(this.mCommand);
        cVar.d(this.mCode);
        switch (this.mCode) {
            case 0:
                cVar.e(this.mPara[0]);
                settingBeatSoundPara = new byte[0];
                break;
            case 1:
            case 2:
            case 3:
            case 5:
            case 10:
                settingBeatSoundPara = new byte[1];
                ehn.a(settingBeatSoundPara, this.mPara[0], 0);
                break;
            case 4:
                settingBeatSoundPara = setSettingBeatSoundPara(this.mPara, 0, 0);
                break;
            case 6:
                settingBeatSoundPara = setSettingHeartRateZonePara(this.mPara, 0, 0);
                break;
            case 7:
                settingBeatSoundPara = setSettingSkippingRopeAchievementsPara(this.mPara, 0, 0);
                break;
            case 8:
                settingBeatSoundPara = new byte[2];
                ehn.b(settingBeatSoundPara, this.mPara[0], 0);
                break;
            case 9:
                settingBeatSoundPara = new byte[4];
                ehn.b(settingBeatSoundPara, this.mPara[0], 0);
                ehn.d(settingBeatSoundPara, 2, this.mPara, 1, 2);
                break;
            default:
                settingBeatSoundPara = new byte[0];
                break;
        }
        cVar.e(settingBeatSoundPara);
        return cVar.c();
    }

    private byte[] setSettingBeatSoundPara(int[] iArr, int i, int i2) {
        byte[] bArr = new byte[3];
        ehn.a(bArr, iArr[0], i);
        ehn.b(bArr, iArr[i2 + 1], i + 1);
        return bArr;
    }

    private byte[] setSettingHeartRateZonePara(int[] iArr, int i, int i2) {
        byte[] bArr = new byte[13];
        ehn.a(bArr, iArr[i2], i);
        ehn.e(bArr, i + 1, iArr, i2 + 1, 6);
        return bArr;
    }

    private byte[] setSettingSkippingRopeAchievementsPara(int[] iArr, int i, int i2) {
        byte[] bArr = new byte[8];
        ehn.e(bArr, i, iArr, i2, 4);
        return bArr;
    }
}
