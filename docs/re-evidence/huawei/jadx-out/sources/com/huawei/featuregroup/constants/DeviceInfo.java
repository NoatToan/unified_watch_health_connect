package com.huawei.featuregroup.constants;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes5.dex */
public class DeviceInfo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("deviceType")
    private int f5506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("deviceId")
    private String f5507c;

    @SerializedName("deviceName")
    private String e;

    public DeviceInfo(int i, String str, String str2) {
        this.f5506b = i;
        this.e = str;
        this.f5507c = str2;
    }

    public enum DeviceType {
        PHONE(0),
        WEAR(1);

        private final int value;

        DeviceType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }
}
