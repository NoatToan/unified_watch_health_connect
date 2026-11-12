package com.miui.tsmclient.entity;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class ProbeResult {
    public static final int RESULT_CODE_DEFAULT_ERROR = -1;
    public static final int RESULT_CODE_ERROR_CONNECT = 101;
    public static final int RESULT_CODE_ERROR_DIFF_UID = 102;
    public static final int RESULT_CODE_SUCCESS = 0;

    @SerializedName("nonce")
    private Nonce mNonce;

    @SerializedName("probe")
    private ProbeData mProbeData;

    @SerializedName("resultCode")
    private int mResultCode = -1;

    @SerializedName("resultMsg")
    private String mResultMsg;

    @SerializedName("version")
    private int mVersion;

    public static ProbeResult formJsonString(String str) {
        ProbeResult probeResult = (ProbeResult) new Gson().fromJson(str, ProbeResult.class);
        Nonce nonce = probeResult.mNonce;
        if (nonce != null) {
            nonce.standardDeviation();
        }
        return probeResult;
    }

    public Nonce getNonce() {
        return this.mNonce;
    }

    public ProbeData getProbeData() {
        return this.mProbeData;
    }

    public int getResultCode() {
        return this.mResultCode;
    }

    public String getResultMsg() {
        return this.mResultMsg;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public boolean isSuccess() {
        return this.mResultCode == 0;
    }

    public void setNonce(Nonce nonce) {
        this.mNonce = nonce;
    }

    public void setProbeData(ProbeData probeData) {
        this.mProbeData = probeData;
    }

    public void setResultCode(int i) {
        this.mResultCode = i;
    }

    public void setResultMsg(String str) {
        this.mResultMsg = str;
    }

    public void setVersion(int i) {
        this.mVersion = i;
    }

    public String toJsonString() {
        return new Gson().toJson(this);
    }
}
