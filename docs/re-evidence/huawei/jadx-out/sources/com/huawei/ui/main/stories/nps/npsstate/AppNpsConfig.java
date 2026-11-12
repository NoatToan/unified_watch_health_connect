package com.huawei.ui.main.stories.nps.npsstate;

import com.google.gson.annotations.SerializedName;
import com.huawei.openalliance.ad.constant.OsType;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class AppNpsConfig {

    @SerializedName(OsType.ANDROID)
    private DeviceConfig androidConfig;

    @SerializedName("emui")
    private DeviceConfig emuiConfig;

    public DeviceConfig getEmuiConfig() {
        return this.emuiConfig;
    }

    public DeviceConfig getAndroidConfig() {
        return this.androidConfig;
    }

    public static class DeviceConfig {

        @SerializedName("allOpen")
        private boolean allOpen;

        @SerializedName("deviceBlackList")
        private List<String> deviceBlackList;

        @SerializedName("deviceWhiteList")
        private List<String> deviceWhiteList;

        public boolean isAllOpen() {
            return this.allOpen;
        }

        public List<String> getDeviceBlackList() {
            return this.deviceBlackList;
        }

        public List<String> getDeviceWhiteList() {
            return this.deviceWhiteList;
        }

        public String toString() {
            return "DeviceConfig{allOpen=" + this.allOpen + ", deviceBlackList=" + this.deviceBlackList + ", deviceWhiteList=" + this.deviceWhiteList + '}';
        }
    }
}
