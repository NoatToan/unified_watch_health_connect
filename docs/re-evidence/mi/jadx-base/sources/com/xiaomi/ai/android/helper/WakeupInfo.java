package com.xiaomi.ai.android.helper;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.miui.circulate.api.service.CirculateDeviceInfo;
import com.miui.tsmclientsdk.MiTsmConstants;

/* JADX INFO: loaded from: classes6.dex */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WakeupInfo {

    @JsonProperty("acoustic_info")
    public AcousticInfo acousticInfo;

    @JsonProperty("algorithm_info")
    public String algorithmInfo;

    @JsonProperty("audio_info")
    public String audioInfo;

    @JsonProperty("audio_meta")
    public AudioMeta audioMeta;

    @JsonProperty("car_status")
    public String carStatus;
    public Device device;

    @JsonProperty("device_id")
    public String deviceId;

    @JsonProperty("is_aec")
    public boolean isAEC;

    @JsonProperty("pre_request_id")
    public String preRequestId;

    @JsonProperty("pre_wakeup_time_interval")
    public long preWakeupTimeInterval;

    @JsonProperty("request_id")
    public String requestId;

    @JsonProperty("user_info")
    public UserInfo userInfo;

    @JsonProperty("wakeup_audio")
    public String wakeupAudio;

    @JsonProperty("wakeup_time")
    public long wakeupTime;

    @JsonProperty("wakeup_type")
    public WakeupType wakeupType;

    @JsonProperty("wakeup_vendor")
    public String wakeupVendor;

    @JsonProperty("wakeup_word")
    public String wakeupWord;

    @JsonProperty("wakeup_zone")
    public String wakeupZone;

    @JsonProperty("ws_statistics")
    public String wsStatistics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class AcousticInfo {

        @JsonProperty(CirculateDeviceInfo.GROUP_ID)
        public String groupId;

        @JsonProperty("group_info")
        public String groupInfo;

        @JsonProperty("wakeup_type")
        public String wakeupType;
        public String wuwid;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class AudioMeta {
        public int channel;
        public String codec;
        public int rate;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Device {

        @JsonProperty(MiTsmConstants.KEY_FAST_CARD_BIND_ID)
        public String bindId;

        @JsonProperty("feature_id")
        public int featureId;
        public String ip;
        public double latitude;

        @JsonProperty("license_provider")
        public int licenseProvider;
        public double longitude;

        @JsonProperty("miot_version")
        public String miotVersion;
        public String model;
        public String network;

        @JsonProperty("platform_id")
        public int platformId;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class UserInfo {
        public int age;
        public String gender;
        public String id;

        @JsonProperty("id_type")
        public String idType;
        public String ip;
    }

    public enum WakeupType {
        WAKEUP_REAL,
        WAKEUP_SUSP,
        WAKEUP_SUSP_HARD,
        ENROLL_RAW
    }
}
