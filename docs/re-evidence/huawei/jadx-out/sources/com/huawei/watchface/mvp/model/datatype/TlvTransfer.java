package com.huawei.watchface.mvp.model.datatype;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes45.dex */
public class TlvTransfer {
    private int mIndex;
    private String mNewType;
    private String mOldType;
    public List<TlvTransfer> mTlvTransfers;

    public TlvTransfer(int i, String str, String str2) {
        this.mIndex = i;
        this.mNewType = str2;
        this.mOldType = str;
    }

    public String getNewTypeValue() {
        return this.mNewType;
    }

    public String getOldTypeValue() {
        return this.mOldType;
    }

    public int getTransferDataIndex() {
        return this.mIndex;
    }

    public void setNewTypeValue(String str) {
        this.mNewType = str;
    }

    public void setOldTypeValue(String str) {
        this.mOldType = str;
    }

    public void setTransferDataIndex(int i) {
        this.mIndex = i;
    }

    public TlvTransfer() {
        this.mTlvTransfers = new ArrayList(32);
    }
}
