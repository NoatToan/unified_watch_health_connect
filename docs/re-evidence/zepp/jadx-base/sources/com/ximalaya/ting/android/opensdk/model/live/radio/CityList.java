package com.ximalaya.ting.android.opensdk.model.live.radio;

import com.ximalaya.ting.android.opensdk.datatrasfer.XimalayaResponse;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class CityList extends XimalayaResponse {
    private List<City> cities;

    public List<City> getCities() {
        return this.cities;
    }

    public void setCities(List<City> list) {
        this.cities = list;
    }
}
