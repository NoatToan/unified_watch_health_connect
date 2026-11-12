package com.xiaomi.hm.health.bt.device;

import androidx.annotation.Nullable;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AuthResult;

/* JADX INFO: loaded from: classes19.dex */
public enum Status {
    UNKNOWN,
    SCANNING,
    SCAN_SUCCESS,
    SCAN_FAIL,
    GATT_CONNECTING,
    GATT_CONNECT_FAILED,
    GATT_DISCONNECT,
    GATT_CONNECTED,
    DISCOVERY_START,
    DISCOVERY_SUCCESS,
    DISCOVERY_FAILED,
    INIT_START,
    INIT_FAILED,
    INIT_SUCCESS,
    AUTH_START,
    AUTH_PROTOCOL_SUCCESS,
    SET_TIME_SUCCESS,
    GET_DEVICE_INFO_SUCCESS,
    AUTH_FAILED,
    AUTH_SUCCESS_WITHOUT_DEVICE_INFO,
    AUTH_SUCCESS,
    DISCONNECTED,
    CONNECTING_TIMEOUT;

    public static final String PRE_CONNECT_STATE_CONNECTED = "connected";
    public static final String PRE_CONNECT_STATE_DEFAULT = "default";
    public static final String PRE_CONNECT_STATE_KNOWN = "known";
    public static final String PRE_CONNECT_STATE_NONE = "none";
    private int value = 0;
    private AuthResult authResult = null;
    private ScanReason scanReason = ScanReason.NORMAL;
    private boolean advConnectable = true;
    private String preConnectState = "default";

    Status() {
    }

    @Nullable
    public AuthResult getAuthResult() {
        return this.authResult;
    }

    public String getPreConnectState() {
        return this.preConnectState;
    }

    public ScanReason getScanReason() {
        return this.scanReason;
    }

    public int getValue() {
        return this.value;
    }

    public boolean isAdvConnectable() {
        return this.advConnectable;
    }

    public boolean isDetailedMessage() {
        return this == AUTH_PROTOCOL_SUCCESS || this == SET_TIME_SUCCESS || this == GET_DEVICE_INFO_SUCCESS;
    }

    public Status setAdvConnectable(boolean advConnectable) {
        this.advConnectable = advConnectable;
        return this;
    }

    public Status setAuthResult(AuthResult authResult) {
        this.authResult = authResult;
        return this;
    }

    public Status setPreConnectState(String preConnectState) {
        this.preConnectState = preConnectState;
        return this;
    }

    public Status setScanReason(ScanReason scanReason) {
        this.scanReason = scanReason;
        return this;
    }

    public Status setValue(int value) {
        this.value = value;
        return this;
    }
}
