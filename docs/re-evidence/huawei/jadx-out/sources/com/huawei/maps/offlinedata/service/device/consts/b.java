package com.huawei.maps.offlinedata.service.device.consts;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* JADX INFO: loaded from: classes12.dex */
public enum b {
    QUERY_DEVICE_REMAIN_SPACE(1, HiAnalyticsConstant.KeyAndValue.NUMBER_01),
    SYNC_POLITICAL_PERSPECTIVE(2, com.huawei.hms.ads.dynamic.a.t),
    QUERY_DEVICE_DOWNLOADED_MAP_INFO(3, "03"),
    TRANSMIT_MAP_HANDSHAKE(4, "04"),
    DELETE_DEVICE_MAP(5, "05"),
    DEVICE_PING_MAP(6, "06"),
    DEVICE_REQUEST_POLITICAL_PERSPECTIVE(7, "07"),
    TRANSMIT_MAP_PARSE_FINISH(8, "08"),
    DEVICE_QUERY_MAP_SIZE(9, "09"),
    MAP_SIZE_BY_WEAR(10, "0A"),
    DOWNLOAD_BY_WEAR(11, "0B");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f17902b;

    b(int i, String str) {
        this.f17901a = i;
        this.f17902b = str;
    }

    public String b() {
        return this.f17902b;
    }

    public int c() {
        return this.f17901a;
    }
}
