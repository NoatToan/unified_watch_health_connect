package com.ximalaya.ting.android.opensdk.model.live.provinces;

import com.ximalaya.ting.android.opensdk.datatrasfer.XimalayaResponse;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class ProvinceList extends XimalayaResponse {
    private List<Province> provinceList;

    public List<Province> getProvinceList() {
        return this.provinceList;
    }

    public void setProvinceList(List<Province> list) {
        this.provinceList = list;
    }
}
