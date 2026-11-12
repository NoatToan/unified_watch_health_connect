package com.huawei.hms.findnetwork.comm.request.bean.poiinfo;

import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public class PoiResult {
    private List<PoiInfoResponse> pois;

    public void setPois(List<PoiInfoResponse> list) {
        this.pois = list;
    }

    public List<PoiInfoResponse> getPois() {
        return this.pois;
    }
}
