package com.ximalaya.ting.android.opensdk.model.live.provinces;

import com.google.gson.annotations.SerializedName;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;

/* JADX INFO: loaded from: classes22.dex */
public class Province {

    @SerializedName("created_at")
    private long createdAt;

    @SerializedName(DTransferConstants.PROVINCECODE)
    private long provinceCode;

    @SerializedName("id")
    private long provinceId;

    @SerializedName("province_name")
    private String provinceName;

    public long getCreatedAt() {
        return this.createdAt;
    }

    public long getProvinceCode() {
        return this.provinceCode;
    }

    public long getProvinceId() {
        return this.provinceId;
    }

    public String getProvinceName() {
        return this.provinceName;
    }

    public void setCreatedAt(long j) {
        this.createdAt = j;
    }

    public void setProvinceCode(long j) {
        this.provinceCode = j;
    }

    public void setProvinceId(long j) {
        this.provinceId = j;
    }

    public void setProvinceName(String str) {
        this.provinceName = str;
    }
}
