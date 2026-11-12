package com.xiaomi.ai;

/* JADX INFO: loaded from: classes18.dex */
public class VoiceprintRecognizeRequest {
    public int disableTextDependent;
    public String family;
    public String id;
    public DataInputMode mode;
    public String query;
    public String vendorStr;

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
        this.id = str;
    }

    public void setVoiceprintDisableTextDependent(int i) {
        this.disableTextDependent = i;
    }
}
