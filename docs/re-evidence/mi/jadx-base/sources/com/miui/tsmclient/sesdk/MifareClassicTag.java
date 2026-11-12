package com.miui.tsmclient.sesdk;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class MifareClassicTag {
    public static final int MIFARE_TYPE_ENCRYPTED = 1;
    public static final int MIFARE_TYPE_NORMAL = 0;

    @SerializedName("atqa")
    private String mAtqa;

    @SerializedName("consumedTime")
    private int mConsumedTime;

    @SerializedName("sak")
    private String mSak;

    @SerializedName("sectorList")
    private List<Sector> mSectorList = new ArrayList();

    @SerializedName(MediaStoreUtil.MediaInfo.SIZE)
    private int mSize;

    @SerializedName("uid")
    private String mUid;

    public String getAtqa() {
        return this.mAtqa;
    }

    public int getConsumedTime() {
        return this.mConsumedTime;
    }

    public String getSak() {
        return this.mSak;
    }

    public List<Sector> getSectorList() {
        return this.mSectorList;
    }

    public int getSize() {
        return this.mSize;
    }

    public String getUid() {
        return this.mUid;
    }

    public void setAtqa(String str) {
        this.mAtqa = str;
    }

    public void setConsumedTime(int i) {
        this.mConsumedTime = i;
    }

    public void setSak(String str) {
        this.mSak = str;
    }

    public void setSectorList(List<Sector> list) {
        this.mSectorList = list;
    }

    public void setSize(int i) {
        this.mSize = i;
    }

    public void setUid(String str) {
        this.mUid = str;
    }
}
