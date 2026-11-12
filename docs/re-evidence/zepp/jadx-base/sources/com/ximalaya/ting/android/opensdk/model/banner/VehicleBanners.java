package com.ximalaya.ting.android.opensdk.model.banner;

import com.google.gson.annotations.SerializedName;
import com.ximalaya.ting.android.opensdk.datatrasfer.XimalayaResponse;

/* JADX INFO: loaded from: classes22.dex */
public class VehicleBanners extends XimalayaResponse {

    @SerializedName("id")
    private long bannerId;

    @SerializedName("banner_title")
    private String bannerTitle;

    @SerializedName("banner_url")
    private String bannerUrl;

    @SerializedName("track_id")
    private String trackId;

    public long getBannerId() {
        return this.bannerId;
    }

    public String getBannerTitle() {
        return this.bannerTitle;
    }

    public String getBannerUrl() {
        return this.bannerUrl;
    }

    public String getTrackId() {
        return this.trackId;
    }

    public void setBannerId(long j) {
        this.bannerId = j;
    }

    public void setBannerTitle(String str) {
        this.bannerTitle = str;
    }

    public void setBannerUrl(String str) {
        this.bannerUrl = str;
    }

    public void setTrackId(String str) {
        this.trackId = str;
    }

    public String toString() {
        return "VehicleBanners [bannerId=" + this.bannerId + ", bannerTitle=" + this.bannerTitle + ", bannerUrl=" + this.bannerUrl + ", trackId=" + this.trackId + "]";
    }
}
