package com.huawei.healthcloud.plugintrack.model;

/* JADX INFO: loaded from: classes33.dex */
public class SportGpsDataBean {
    private GpsSourcesState d = GpsSourcesState.CONTINUE;

    public enum GpsSourcesState {
        RECOVERY,
        RESUME,
        CONTINUE,
        IDLE
    }
}
