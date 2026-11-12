package com.ximalaya.ting.android.opensdk.model.word;

import com.google.gson.annotations.SerializedName;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;

/* JADX INFO: loaded from: classes22.dex */
public class AlbumResult {

    @SerializedName("id")
    private long albumId;

    @SerializedName(DTransferConstants.ALBUM_TITLE)
    private String albumTitle;

    @SerializedName(DTransferConstants.CATEGORY_NAME)
    private String categoryName;

    @SerializedName("cover_url_small")
    private String coverUrlSmall;

    @SerializedName("highlight_album_title")
    private String hightlightAlbumTitle;

    public long getAlbumId() {
        return this.albumId;
    }

    public String getAlbumTitle() {
        return this.albumTitle;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public String getCoverUrlSmall() {
        return this.coverUrlSmall;
    }

    public String getHightlightAlbumTitle() {
        return this.hightlightAlbumTitle;
    }

    public void setAlbumId(long j) {
        this.albumId = j;
    }

    public void setAlbumTitle(String str) {
        this.albumTitle = str;
    }

    public void setCategoryName(String str) {
        this.categoryName = str;
    }

    public void setCoverUrlSmall(String str) {
        this.coverUrlSmall = str;
    }

    public void setHightlightAlbumTitle(String str) {
        this.hightlightAlbumTitle = str;
    }

    public String toString() {
        return "AlbumResult [albumId=" + this.albumId + ", albumTitle=" + this.albumTitle + ", hightlightAlbumTitle=" + this.hightlightAlbumTitle + ", categoryName=" + this.categoryName + ", coverUrlSmall=" + this.coverUrlSmall + "]";
    }
}
