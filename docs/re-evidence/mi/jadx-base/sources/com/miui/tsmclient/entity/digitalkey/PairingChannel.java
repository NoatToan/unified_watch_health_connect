package com.miui.tsmclient.entity.digitalkey;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class PairingChannel {

    @SerializedName("NFC")
    private boolean mNFC;

    @SerializedName("RKE")
    private boolean mRKE;

    @SerializedName("UWB")
    private boolean mUWB;

    public boolean getNFC() {
        return this.mNFC;
    }

    public boolean getRKE() {
        return this.mRKE;
    }

    public boolean getUWB() {
        return this.mUWB;
    }
}
