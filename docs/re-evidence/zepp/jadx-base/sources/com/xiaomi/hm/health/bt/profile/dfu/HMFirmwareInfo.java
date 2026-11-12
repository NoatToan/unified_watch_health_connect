package com.xiaomi.hm.health.bt.profile.dfu;

import com.xiaomi.hm.health.bt.utils.FileUtilsKt;

/* JADX INFO: loaded from: classes12.dex */
public class HMFirmwareInfo {
    public static final int SYNC_SIZE_MIDDLE = 1500;
    public static final int SYNC_SIZE_NORMAL = 2000;
    public static final int SYNC_SIZE_SMALL = 1000;
    private String a;
    private HMFirmwareType b;
    private int c;
    private boolean d;
    private long e;
    private ContinueUpgradeState f;
    private boolean g;
    private int h;
    private String i;
    private byte j;
    private int k;
    private ContinueModeExtraInfo l;
    private UpgradeModel m;

    public enum ContinueUpgradeState {
        NONE(-1),
        CONTINUE(1),
        LAST(2);

        public int value;

        ContinueUpgradeState(int value) {
            this.value = value;
        }

        public static ContinueUpgradeState fromValue(int value) {
            for (ContinueUpgradeState continueUpgradeState : values()) {
                if (value == continueUpgradeState.getValue()) {
                    return continueUpgradeState;
                }
            }
            return NONE;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum UpgradeType {
        NONE(1),
        SILENT(1),
        FORCE(2);

        public int value;

        UpgradeType(int value) {
            this.value = value;
        }

        public static UpgradeType fromValue(int value) {
            for (UpgradeType upgradeType : values()) {
                if (value == upgradeType.getValue()) {
                    return upgradeType;
                }
            }
            return NONE;
        }

        public int getValue() {
            return this.value;
        }
    }

    public HMFirmwareInfo(String path, HMFirmwareType type) {
        this.c = 1500;
        this.d = false;
        this.f = ContinueUpgradeState.NONE;
        this.g = false;
        this.h = -1;
        this.l = new ContinueModeExtraInfo();
        this.m = UpgradeModel.FOREGROUND;
        this.a = path;
        this.b = type;
        this.e = FileUtilsKt.getFileSize(path);
    }

    public int getAllSize() {
        return this.h;
    }

    public ContinueModeExtraInfo getContinueModeExtraInfo() {
        return this.l;
    }

    public ContinueUpgradeState getContinueUpgradeState() {
        return this.f;
    }

    public long getFileSize() {
        return this.e;
    }

    public String getFwPath() {
        return this.a;
    }

    public HMFirmwareType getFwType() {
        return this.b;
    }

    public String getOtherFwPath() {
        return this.i;
    }

    public int getSyncSize() {
        return this.c;
    }

    public UpgradeModel getUpgradeModel() {
        return this.m;
    }

    public int getVoiceId() {
        return this.k;
    }

    public byte getVoiceType() {
        return this.j;
    }

    public boolean isSilent() {
        return this.g;
    }

    public boolean isSupportSyncSize() {
        return this.d;
    }

    public void setAllSize(int allSize) {
        this.h = allSize;
    }

    public void setContinueModeExtraInfo(ContinueModeExtraInfo continueModeExtraInfo) {
        this.l = continueModeExtraInfo;
    }

    public void setContinueUpgradeState(ContinueUpgradeState state) {
        this.f = state;
    }

    public void setFwPath(String fwPath) {
        this.a = fwPath;
    }

    public void setFwType(HMFirmwareType fwType) {
        this.b = fwType;
    }

    public void setOtherFwPath(String otherFwPath) {
        this.i = otherFwPath;
    }

    public void setSilent(boolean silent) {
        this.g = silent;
    }

    public void setSupportSyncSize(boolean supportSyncSize) {
        this.d = supportSyncSize;
    }

    public void setSyncSize(int syncSize) {
        this.c = syncSize;
    }

    public void setUpgradeModel(UpgradeModel upgradeModel) {
        this.m = upgradeModel;
    }

    public void setVoiceId(int voiceId) {
        this.k = voiceId;
    }

    public void setVoiceType(byte voiceType) {
        this.j = voiceType;
    }

    public String toString() {
        return "HMFirmwareInfo{fwPath='" + this.a + "', fwType=" + this.b + ", syncSize=" + this.c + ", fileSize=" + this.e + ", continueFlag=" + this.f.value + ", voiceType=" + ((int) this.j) + ", voiceId=" + this.k + ", otherFwPath=" + this.i + "'}";
    }

    public HMFirmwareInfo(String path, HMFirmwareType type, ContinueUpgradeState continueFlag) {
        this.c = 1500;
        this.d = false;
        this.f = ContinueUpgradeState.NONE;
        this.g = false;
        this.h = -1;
        this.l = new ContinueModeExtraInfo();
        this.m = UpgradeModel.FOREGROUND;
        this.a = path;
        this.b = type;
        this.e = FileUtilsKt.getFileSize(path);
        this.f = continueFlag;
    }

    public HMFirmwareInfo(String path, HMFirmwareType type, ContinueUpgradeState continueFlag, int allSize) {
        this.c = 1500;
        this.d = false;
        this.f = ContinueUpgradeState.NONE;
        this.g = false;
        this.h = -1;
        this.l = new ContinueModeExtraInfo();
        this.m = UpgradeModel.FOREGROUND;
        this.a = path;
        this.b = type;
        this.f = continueFlag;
        this.h = allSize;
    }
}
