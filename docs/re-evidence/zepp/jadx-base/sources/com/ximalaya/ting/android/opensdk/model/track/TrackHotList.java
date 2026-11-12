package com.ximalaya.ting.android.opensdk.model.track;

import com.google.gson.annotations.SerializedName;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;

/* JADX INFO: loaded from: classes22.dex */
public class TrackHotList extends CommonTrackList<Track> {

    @SerializedName(DTransferConstants.CATEGORY_ID)
    private int categoryId;

    @SerializedName("current_page")
    private int currentPage;

    @SerializedName(DTransferConstants.TAG_NAME)
    private String tagName;

    public int getCategoryId() {
        return this.categoryId;
    }

    public int getCurrentPage() {
        return this.currentPage;
    }

    public String getTagName() {
        return this.tagName;
    }

    public void setCategoryId(int i) {
        this.categoryId = i;
    }

    public void setCurrentPage(int i) {
        this.currentPage = i;
    }

    public void setTagName(String str) {
        this.tagName = str;
    }

    @Override // com.ximalaya.ting.android.opensdk.model.track.CommonTrackList
    public String toString() {
        return "TrackHotList [currentPage=" + this.currentPage + ", categoryId=" + this.categoryId + ", tagName=" + this.tagName + "]";
    }
}
