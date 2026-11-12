package com.ximalaya.ting.android.opensdk.model.column;

import com.google.gson.annotations.SerializedName;
import com.ximalaya.ting.android.opensdk.model.album.Album;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class ColumnDetailAlbum extends ColumnDetail {

    @SerializedName("column_items")
    private List<Album> albumList;

    public List<Album> getAlbumList() {
        return this.albumList;
    }

    public void setAlbumList(List<Album> list) {
        this.albumList = list;
    }

    @Override // com.ximalaya.ting.android.opensdk.model.column.ColumnDetail
    public String toString() {
        return "ColumnDetailAlbum [albumList=" + this.albumList + "]";
    }
}
