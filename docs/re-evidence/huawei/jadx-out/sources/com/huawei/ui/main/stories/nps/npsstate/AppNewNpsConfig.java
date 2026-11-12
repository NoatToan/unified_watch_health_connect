package com.huawei.ui.main.stories.nps.npsstate;

import com.google.gson.annotations.SerializedName;
import com.huawei.openalliance.ad.constant.OsType;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class AppNewNpsConfig {

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
        private List<ControlDeviceItem> deviceBlackList;

        @SerializedName("deviceWhiteList")
        private List<ControlDeviceItem> deviceWhiteList;

        public boolean isAllOpen() {
            return this.allOpen;
        }

        public List<ControlDeviceItem> getDeviceBlackList() {
            return this.deviceBlackList;
        }

        public List<ControlDeviceItem> getDeviceWhiteList() {
            return this.deviceWhiteList;
        }

        public String toString() {
            return "DeviceConfig{allOpen=" + this.allOpen + ", deviceBlackList=" + this.deviceBlackList + ", deviceWhiteList=" + this.deviceWhiteList + '}';
        }
    }

    public static class ControlDeviceItem {

        @SerializedName("control")
        private int control;

        @SerializedName("device")
        private List<String> device;

        public int getControl() {
            return this.control;
        }

        public List<String> getDevice() {
            return this.device;
        }

        public String toString() {
            return "ControlDeviceItem{control=" + this.control + ", device=" + this.device + '}';
        }
    }
}
