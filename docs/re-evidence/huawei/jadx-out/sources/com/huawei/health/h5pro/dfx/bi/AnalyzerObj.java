package com.huawei.health.h5pro.dfx.bi;

import com.google.gson.annotations.SerializedName;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class AnalyzerObj {

    @SerializedName("id")
    private String d;

    @SerializedName(JsbMapKeyNames.H5_CUSTOM_DATA)
    private Map<String, String> e;

    public Map<String, String> getCustomData() {
        return this.e;
    }

    public String getId() {
        return this.d;
    }

    public void setCustomData(Map<String, String> map) {
        this.e = map;
    }

    public void setId(String str) {
        this.d = str;
    }
}
