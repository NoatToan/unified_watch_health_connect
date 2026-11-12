package com.ximalaya.ting.android.opensdk.model.track;

import com.google.gson.annotations.SerializedName;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;

/* JADX INFO: loaded from: classes22.dex */
public class TrackList extends CommonTrackList<Track> {

    @SerializedName(DTransferConstants.ALBUM_ID)
    private int albumId;

    @SerializedName("album_intro")
    private String albumIntro;

    @SerializedName(DTransferConstants.ALBUM_TITLE)
    private String albumTitle;

    @SerializedName("can_download")
    private boolean canDownload;

    @SerializedName(DTransferConstants.CATEGORY_ID)
    private int categoryId;

    @SerializedName("cover_url_large")
    private String coverUrlLarge;

    @SerializedName("cover_url_middle")
    private String coverUrlMiddle;

    @SerializedName("cover_url_small")
    private String coverUrlSmall;

    @SerializedName("current_page")
    private int currentPage;

    public int getAlbumId() {
        return this.albumId;
    }

    public String getAlbumIntro() {
        return this.albumIntro;
    }

    public String getAlbumTitle() {
        return this.albumTitle;
    }

    public int getCategoryId() {
        return this.categoryId;
    }

    public String getCoverUrlLarge() {
        return this.coverUrlLarge;
    }

    public String getCoverUrlMiddle() {
        return this.coverUrlMiddle;
    }

    public String getCoverUrlSmall() {
        return this.coverUrlSmall;
    }

    public int getCurrentPage() {
        return this.currentPage;
    }

    public boolean isCanDownload() {
        return this.canDownload;
    }

    public void setAlbumId(int i) {
        this.albumId = i;
    }

    public void setAlbumIntro(String str) {
        this.albumIntro = str;
    }

    public void setAlbumTitle(String str) {
        this.albumTitle = str;
    }

    public void setCanDownload(boolean z) {
        this.canDownload = z;
    }

    public void setCategoryId(int i) {
        this.categoryId = i;
    }

    public void setCoverUrlLarge(String str) {
        this.coverUrlLarge = str;
    }

    public void setCoverUrlMiddle(String str) {
        this.coverUrlMiddle = str;
    }

    public void setCoverUrlSmall(String str) {
        this.coverUrlSmall = str;
    }

    public void setCurrentPage(int i) {
        this.currentPage = i;
    }

    @Override // com.ximalaya.ting.android.opensdk.model.track.CommonTrackList
    public String toString() {
        return "TrackList [albumId=" + this.albumId + ", albumTitle=" + this.albumTitle + ", categoryId=" + this.categoryId + ", albumIntro=" + this.albumIntro + ", coverUrlSmall=" + this.coverUrlSmall + ", coverUrlMiddle=" + this.coverUrlMiddle + ", coverUrlLarge=" + this.coverUrlLarge + ", currentPage=" + this.currentPage + "]";
    }
}
