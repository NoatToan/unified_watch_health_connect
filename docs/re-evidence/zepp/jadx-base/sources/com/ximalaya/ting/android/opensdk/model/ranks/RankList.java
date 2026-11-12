package com.ximalaya.ting.android.opensdk.model.ranks;

import com.ximalaya.ting.android.opensdk.datatrasfer.XimalayaResponse;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class RankList extends XimalayaResponse {
    private List<Rank> rankList;

    public List<Rank> getRankList() {
        return this.rankList;
    }

    public void setRankList(List<Rank> list) {
        this.rankList = list;
    }

    public String toString() {
        return "RankList{rankList=" + this.rankList + '}';
    }
}
