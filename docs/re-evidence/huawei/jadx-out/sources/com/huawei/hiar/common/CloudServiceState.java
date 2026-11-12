package com.huawei.hiar.common;

/* JADX INFO: loaded from: classes33.dex */
public enum CloudServiceState {
    UNKNOWN_STATE(-1),
    CLOUD_SERVICE_NORMAL(10000),
    CLOUD_SERVICE_ERROR_NETWORK_UNAVAILABLE(10001),
    CLOUD_SERVICE_ERROR_CLOUD_SERVICE_UNAVAILABLE(10002),
    CLOUD_SERVICE_ERROR_NOT_AUTHORIZED(10003),
    CLOUD_SERVICE_ERROR_SERVER_VERSION_TOO_OLD(10004),
    CLOUD_SERVICE_ERROR_TIME_EXHAUSTED(10005),
    CLOUD_SERVICE_ERROR_INTERNAL(10006),
    CLOUD_IMAGE_ERROR_IMAGE_GALLERY_INVALID(20001),
    CLOUD_IMAGE_ERROR_IMAGE_RECOGNIZE_FAILE(20002),
    CLOUD_OBJECT_ERROR_OBJECT_MODEL_INVALID(30001),
    CLOUD_OBJECT_ERROR_OBJECT_RECOGNIZE_FAILE(30002);

    private final int nativeCode;

    public static CloudServiceState forNumber(int i) {
        for (CloudServiceState cloudServiceState : values()) {
            if (cloudServiceState.nativeCode == i) {
                return cloudServiceState;
            }
        }
        return UNKNOWN_STATE;
    }

    CloudServiceState(int i) {
        this.nativeCode = i;
    }
}
