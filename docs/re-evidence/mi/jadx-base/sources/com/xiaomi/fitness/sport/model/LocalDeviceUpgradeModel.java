package com.xiaomi.fitness.sport.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public class LocalDeviceUpgradeModel {

    public static class CheckUpgradeRequest implements Serializable {

        @SerializedName("curr")
        public String currentVersion;
        public String description;
        public String did;

        @SerializedName("ota_failed_code")
        public int failCode;

        @SerializedName("ota_failed_reason")
        public String failReason;
        public boolean force;
        public boolean isLatest;

        @SerializedName("is_owner")
        public boolean isOwner;

        @SerializedName("latest")
        public String latestVersion;

        @SerializedName("ota_progress")
        public int progress;

        @SerializedName("rec")
        public boolean recommend;

        @SerializedName("ota_start_time")
        public int startTime;

        @SerializedName("ota_status")
        public String status;

        @SerializedName("timeout_time")
        public int timeout;
        public boolean updating;
    }
}
