package com.miui.tsmclient.entity;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class ProbeParam {
    public static final int MODE_GET_DISTANCES = 0;
    public static final int MODE_GET_RECOVERY = 1;

    @SerializedName("mode")
    private int mMode;

    @SerializedName("nonce")
    private Nonce mNonce;

    @SerializedName("probeSectorIndex")
    private int mProbeSectorIndex;

    @SerializedName("tag")
    private MFTag mTag;

    @SerializedName("version")
    private int mVersion = 1;

    @SerializedName("dumpKeyA")
    private boolean mDumpKeyA = true;

    public ProbeParam(int i, int i2, MifareTag mifareTag, Nonce nonce) {
        this.mProbeSectorIndex = i;
        this.mMode = i2;
        this.mTag = new MFTag(mifareTag);
        this.mNonce = nonce == null ? new Nonce() : nonce;
    }

    public static ProbeParam fromJsonString(String str) {
        return (ProbeParam) new Gson().fromJson(str, ProbeParam.class);
    }

    public int getMode() {
        return this.mMode;
    }

    public Nonce getNonce() {
        return this.mNonce;
    }

    public int getProbeSectorIndex() {
        return this.mProbeSectorIndex;
    }

    public MFTag getTag() {
        return this.mTag;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public boolean isDumpKeyA() {
        return this.mDumpKeyA;
    }

    public String toJsonString() {
        return new Gson().toJson(this);
    }
}
