package com.ximalaya.ting.android.opensdk.model.column;

import com.google.gson.annotations.SerializedName;
import com.ximalaya.ting.android.opensdk.model.track.Track;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class ColumnDetailTrack extends ColumnDetail {

    @SerializedName("column_items")
    private List<Track> trackList;

    public List<Track> getTrackList() {
        return this.trackList;
    }

    public void setTrackList(List<Track> list) {
        this.trackList = list;
    }

    @Override // com.ximalaya.ting.android.opensdk.model.column.ColumnDetail
    public String toString() {
        return "ColumnDetailTrack [trackList=" + this.trackList + "]";
    }
}
