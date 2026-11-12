package com.ximalaya.ting.android.opensdk.model.track;

import com.google.gson.annotations.SerializedName;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.ximalaya.ting.android.opensdk.datatrasfer.XimalayaResponse;
import com.ximalaya.ting.android.opensdk.model.PlayableModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class CommonTrackList<T extends PlayableModel> extends XimalayaResponse {
    private Map<String, String> params;

    @SerializedName("total_count")
    private int totalCount;

    @SerializedName(DTransferConstants.TOTAL_PAGE)
    private int totalPage;

    @SerializedName(alternate = {"paid_tracks"}, value = "tracks")
    private List<T> tracks;

    public static CommonTrackList<Track> newInstance() {
        CommonTrackList<Track> commonTrackList = new CommonTrackList<>();
        commonTrackList.setTracks(new ArrayList());
        return commonTrackList;
    }

    public void cloneCommonTrackList(CommonTrackList commonTrackList) {
        this.params = commonTrackList.params;
        this.totalCount = commonTrackList.totalCount;
        this.totalPage = commonTrackList.totalPage;
        List<T> list = this.tracks;
        if (list != null) {
            list.clear();
        } else {
            this.tracks = new ArrayList();
        }
        this.tracks.addAll(commonTrackList.tracks);
    }

    public Map<String, String> getParams() {
        return this.params;
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public int getTotalPage() {
        return this.totalPage;
    }

    public List<T> getTracks() {
        return this.tracks;
    }

    public void setParams(Map<String, String> map) {
        this.params = map;
    }

    public void setTotalCount(int i) {
        this.totalCount = i;
    }

    public void setTotalPage(int i) {
        this.totalPage = i;
    }

    public void setTracks(List<T> list) {
        this.tracks = list;
    }

    public String toString() {
        return "CommonTrackList [tracks=" + this.tracks + ", params=" + this.params + ", totalCount=" + this.totalCount + ", totalPage=" + this.totalPage + "]";
    }

    public void updateCommonParams(CommonTrackList commonTrackList) {
        this.params = commonTrackList.params;
        this.totalCount = commonTrackList.totalCount;
        this.totalPage = commonTrackList.totalPage;
    }

    public void updateCommonTrackList(CommonTrackList commonTrackList) {
        this.params = commonTrackList.params;
        this.totalCount = commonTrackList.totalCount;
        this.totalPage = commonTrackList.totalPage;
        List<T> list = this.tracks;
        if (list != null) {
            list.addAll(commonTrackList.tracks);
        } else {
            this.tracks = commonTrackList.tracks;
        }
    }

    public void updateCommonTrackList(int i, CommonTrackList commonTrackList) {
        this.params = commonTrackList.params;
        this.totalCount = commonTrackList.totalCount;
        this.totalPage = commonTrackList.totalPage;
        List<T> list = this.tracks;
        if (list != null) {
            list.addAll(i, commonTrackList.tracks);
        } else {
            this.tracks = commonTrackList.tracks;
        }
    }
}
