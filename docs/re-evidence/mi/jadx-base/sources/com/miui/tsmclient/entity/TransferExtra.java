package com.miui.tsmclient.entity;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class TransferExtra {

    @SerializedName("deletable")
    private boolean mDeletable;

    @SerializedName("returnable")
    private boolean mReturnable;

    @SerializedName("showBalance")
    private boolean mShowBalance;

    @SerializedName("supportAfterSale")
    private boolean mSupportAfterSale;

    @SerializedName("transferable")
    private boolean mTransferable;

    @SerializedName("untransferableDesc")
    private String mUntransferableDesc;

    public static TransferExtra get(String str) {
        return (TransferExtra) new Gson().fromJson(str, TransferExtra.class);
    }

    public String getUntransportableDesc() {
        return this.mUntransferableDesc;
    }

    public boolean isDeletable() {
        return this.mDeletable;
    }

    public boolean isReturnable() {
        return this.mReturnable;
    }

    public boolean isShowBalance() {
        return this.mShowBalance;
    }

    public boolean isSupportAfterSale() {
        return this.mSupportAfterSale;
    }

    public boolean isTransferable() {
        return this.mTransferable;
    }
}
