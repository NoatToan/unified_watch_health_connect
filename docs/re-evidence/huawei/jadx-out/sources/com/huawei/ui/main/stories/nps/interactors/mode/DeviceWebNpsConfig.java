package com.huawei.ui.main.stories.nps.interactors.mode;

import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class DeviceWebNpsConfig {

    @SerializedName("allOpen")
    private boolean allOpen;

    @SerializedName("deviceWhiteList")
    private Map<String, List<String>> deviceWhiteList;

    public boolean isAllOpen() {
        return this.allOpen;
    }

    public void setAllOpen(boolean z) {
        this.allOpen = z;
    }

    public Map<String, List<String>> getDeviceWhiteList() {
        Map<String, List<String>> map = this.deviceWhiteList;
        return map == null ? Collections.unmodifiableMap(new HashMap()) : Collections.unmodifiableMap(map);
    }

    public void setDeviceWhiteList(Map<String, List<String>> map) {
        this.deviceWhiteList = map;
    }

    public String toString() {
        return "DeviceWebNpsConfig{allOpen=" + this.allOpen + ", deviceWhiteList=" + this.deviceWhiteList + '}';
    }
}
