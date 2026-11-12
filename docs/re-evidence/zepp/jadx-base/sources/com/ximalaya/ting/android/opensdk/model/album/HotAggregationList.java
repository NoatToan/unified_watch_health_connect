package com.ximalaya.ting.android.opensdk.model.album;

import com.ximalaya.ting.android.opensdk.datatrasfer.XimalayaResponse;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class HotAggregationList extends XimalayaResponse {
    private List<HotAggregation> list;

    public List<HotAggregation> getList() {
        return this.list;
    }

    public void setList(List<HotAggregation> list) {
        this.list = list;
    }

    public String toString() {
        return "HotAggregationList [list=" + this.list + "]";
    }
}
