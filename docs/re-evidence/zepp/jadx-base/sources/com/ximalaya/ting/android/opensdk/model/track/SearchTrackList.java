package com.ximalaya.ting.android.opensdk.model.track;

import com.google.gson.annotations.SerializedName;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;

/* JADX INFO: loaded from: classes22.dex */
public class SearchTrackList extends CommonTrackList<Track> {

    @SerializedName(DTransferConstants.CATEGORY_ID)
    private int categoryId;

    @SerializedName(DTransferConstants.TAG_NAME)
    private String tagName;

    public int getCategoryId() {
        return this.categoryId;
    }

    public String getTagName() {
        return this.tagName;
    }

    public void setCategoryId(int i) {
        this.categoryId = i;
    }

    public void setTagName(String str) {
        this.tagName = str;
    }
}
