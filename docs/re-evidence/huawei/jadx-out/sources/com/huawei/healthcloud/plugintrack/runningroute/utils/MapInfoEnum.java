package com.huawei.healthcloud.plugintrack.runningroute.utils;

import com.huawei.healthcloud.plugintrack.R;

/* JADX INFO: loaded from: classes33.dex */
public enum MapInfoEnum {
    MAP_GAODE(1, "com.autonavi.minimap", R.string.IDS_hw_show_data_tarck_map_type_setting_gaode),
    MAP_TENCENT(2, "com.tencent.map", R.string.IDS_clock_rank_tencent_map),
    MAP_BAIDU(3, "com.baidu.BaiduMap", R.string.IDS_clock_rank_baidu_map);

    private int mId;
    private String mMapPackage;
    private int mNameId;

    MapInfoEnum(int i, String str, int i2) {
        this.mId = i;
        this.mMapPackage = str;
        this.mNameId = i2;
    }

    public int getId() {
        return this.mId;
    }

    public void setId(int i) {
        this.mId = i;
    }

    public String getMapPackage() {
        return this.mMapPackage;
    }

    public void setMapPackage(String str) {
        this.mMapPackage = str;
    }

    public int getNameId() {
        return this.mNameId;
    }

    public void setNameId(int i) {
        this.mNameId = i;
    }
}
