package com.autonavi.minimap.wearable.contract;

/* JADX INFO: loaded from: classes4.dex */
public enum ConnectResult {
    SUCCESS(1, "connect_success"),
    FAILED_NO_DEVICE(2, "connect_failed_no_device"),
    FAILED_UNINSTALL_TARGET_APP(3, "connect_failed_uninstall_target_app"),
    FAILED_NO_PERMISSION(4, "connect_failed_no_permission"),
    FAILED_OTHER(5, "connect_failed_other");

    public int code;
    public String message;

    ConnectResult(int i, String str) {
        this.code = i;
        this.message = str;
    }
}
