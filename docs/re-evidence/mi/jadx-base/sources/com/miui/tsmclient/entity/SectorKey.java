package com.miui.tsmclient.entity;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class SectorKey {

    @SerializedName("keyList")
    private List<String> mKeyList;

    @SerializedName("sectorId")
    private int mSectorId;

    public List<String> getKeyList() {
        return this.mKeyList;
    }

    public int getSectorId() {
        return this.mSectorId;
    }

    public void setKeyList(List<String> list) {
        this.mKeyList = list;
    }

    public void setSectorId(int i) {
        this.mSectorId = i;
    }
}
