package com.xiaomi.ai;

/* JADX INFO: loaded from: classes18.dex */
public class VoiceprintRegisterRequest {
    public int disableTextDependent;
    public String family;
    public DataInputMode mode;
    public String query;
    public String userId;
    public String vendorStr;
    public int voiceId;

    public enum DataInputMode {
        DATA_INPUT_MODE_RECORDER,
        DATA_INPUT_MODE_BUFFER
    }

    public void addQueryText(String str) {
        this.query = str;
    }

    public void setDataInputMode(DataInputMode dataInputMode) {
        this.mode = dataInputMode;
    }

    public void setFamilyId(String str) {
        this.family = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public void setVoiceId(int i) {
        this.voiceId = i;
    }

    public void setVoiceprintDisableTextDependent(int i) {
        this.disableTextDependent = i;
    }
}
