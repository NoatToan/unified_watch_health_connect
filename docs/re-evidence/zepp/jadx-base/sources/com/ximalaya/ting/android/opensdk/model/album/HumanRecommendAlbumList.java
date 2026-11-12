package com.ximalaya.ting.android.opensdk.model.album;

import com.ximalaya.ting.android.opensdk.datatrasfer.XimalayaResponse;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
@Deprecated
public class HumanRecommendAlbumList extends XimalayaResponse {
    private List<HumanRecommendAlbum> albumList;

    public List<HumanRecommendAlbum> getAlbumList() {
        return this.albumList;
    }

    public void setAlbumList(List<HumanRecommendAlbum> list) {
        this.albumList = list;
    }

    public String toString() {
        return "HumanRecommendAlbumList [albumList=" + this.albumList + "]";
    }
}
