package com.ximalaya.ting.android.opensdk.model.banner;

import com.ximalaya.ting.android.opensdk.datatrasfer.XimalayaResponse;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class DiscoveryBannerList extends XimalayaResponse {
    private List<Banner> bannerList;

    public List<Banner> getBannerList() {
        return this.bannerList;
    }

    public void setBannerList(List<Banner> list) {
        this.bannerList = list;
    }

    public String toString() {
        return "BannerList [bannerList=" + this.bannerList + "]";
    }
}
