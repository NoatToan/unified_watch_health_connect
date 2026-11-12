package com.ximalaya.ting.android.opensdk.model.track;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes22.dex */
public class SearchTrackListV2 extends CommonTrackList<Track> {

    @SerializedName("current_page")
    private int currentPage;

    public int getCurrentPage() {
        return this.currentPage;
    }

    public void setCurrentPage(int i) {
        this.currentPage = i;
    }
}
