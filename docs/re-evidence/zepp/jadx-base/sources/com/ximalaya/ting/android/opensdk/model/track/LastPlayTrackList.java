package com.ximalaya.ting.android.opensdk.model.track;

import com.google.gson.annotations.SerializedName;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;

/* JADX INFO: loaded from: classes22.dex */
public class LastPlayTrackList extends CommonTrackList<Track> {

    @SerializedName(DTransferConstants.CATEGORY_ID)
    private int categoryId;

    @SerializedName("current_page")
    private int pageid;

    @SerializedName(DTransferConstants.TAG_NAME)
    private String tagname;

    public int getCategoryId() {
        return this.categoryId;
    }

    public int getPageid() {
        return this.pageid;
    }

    public String getTagname() {
        return this.tagname;
    }

    public void setCategoryId(int i) {
        this.categoryId = i;
    }

    public void setPageid(int i) {
        this.pageid = i;
    }

    public void setTagname(String str) {
        this.tagname = str;
    }

    @Override // com.ximalaya.ting.android.opensdk.model.track.CommonTrackList
    public String toString() {
        return "LastPlayTrackList [categoryId=" + this.categoryId + ", tagname=" + this.tagname + ", pageid=" + this.pageid + "]";
    }
}
