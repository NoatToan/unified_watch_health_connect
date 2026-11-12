package com.xiaomi.hm.health.device.bind.analytic;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.device.HMAppSortActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b'\"\u0016\u0010\u0001\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0016\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"\u0016\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005\"\u0016\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005\"\u0016\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0005\"\u0016\u0010\t\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0002\"\u0016\u0010\n\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0002\"\u0016\u0010\u000b\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0002\"\u0016\u0010\f\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0002\"\u0016\u0010\r\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0002\"\u0016\u0010\u000e\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0002\"\u0016\u0010\u000f\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0002\"\u0016\u0010\u0010\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0002\"\u0016\u0010\u0011\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0002\"\u0016\u0010\u0012\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0002\"\u0016\u0010\u0013\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0002\"\u0016\u0010\u0014\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0002\"\u0016\u0010\u0015\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0002\"\u0016\u0010\u0016\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0002\"\u0016\u0010\u0017\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0002\"\u0016\u0010\u0018\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0002\"\u0016\u0010\u0019\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0002\"\u0016\u0010\u001a\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0002\"\u0016\u0010\u001b\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0002\"\u0016\u0010\u001c\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0002\"\u0016\u0010\u001d\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0002\"\u0016\u0010\u001e\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0002\"\u0016\u0010\u001f\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0002\"\u0016\u0010 \u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0002\"\u0016\u0010!\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0002\"\u0016\u0010\"\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0002\"\u0016\u0010#\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0002\"\u0016\u0010$\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0002\"\u0016\u0010%\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0002\"\u0016\u0010&\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0002\"\u0016\u0010'\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0002\"\u0016\u0010(\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0002\"\u0016\u0010)\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0002¨\u0006*"}, d2 = {"", "KEY_BIND_MODE", "Ljava/lang/String;", "", "BIND_MODE_CONNECT_DIRECT", LogUtil.I, "BIND_MODE_SCAN_BROADCAST", "BIND_MODE_SCAN_QRCODE", "BIND_MODE_SCAN_BAND", "KEY_KNOWN_DEVICE", "KEY_MAC_ADDRESS", HMAppSortActivity.KEY_DEVICE_SOURCE, "KEY_APP_STATUS", "KEY_RSSI", "BIND_STAGE", "BIND_FAIL_REASON", "SN", "FW_VERSION", "STAGE_SCAN", "STAGE_CONNECT", "STAGE_QUERY", "STAGE_AUTH", "STAGE_SET_USER_INFO", "STAGE_UPLOAD_BIND", "CONNECT_FAIL_REASON_CONNECT_FAIL", "CONNECT_FAIL_REASON_DISCOVER_SERVICE_FAIL", "CONNECT_FAIL_REASON_INIT_FAIL", "CONNECT_FAIL_REASON_DISCONNECT", "CONNECT_FAIL_REASON_BLUETOOTH_OFF", "UPLOAD_BIND_FAIL_NO_NETWORK", "UPLOAD_BIND_FAIL_CLOUD_FAIL", "QUERY_FAIL_UNKNOWN_DEVICE_TYPE", "QUERY_FAIL_RESPONSE_CODE", "QUERY_FAIL_STATUS_CODE", "QUERY_FAIL_ON_FAILURE", "QUERY_FAIL_ON_ERROR", "QUERY_FAIL_ON_CANCEL", "EXTRA_UNKNOWN_AUTH_FAIL", "CANCEL_REASON", "CANCEL_REASON_NORMAL", "CANCEL_REASON_NOT_SHAKE", "NETWORK_ENABLE", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class ConstantKt {

    @NotNull
    public static final String BIND_FAIL_REASON = "error_reason";
    public static final int BIND_MODE_CONNECT_DIRECT = 0;
    public static final int BIND_MODE_SCAN_BAND = 3;
    public static final int BIND_MODE_SCAN_BROADCAST = 1;
    public static final int BIND_MODE_SCAN_QRCODE = 2;

    @NotNull
    public static final String BIND_STAGE = "bindstage";

    @NotNull
    public static final String CANCEL_REASON = "cancel_reason";

    @NotNull
    public static final String CANCEL_REASON_NORMAL = "normal";

    @NotNull
    public static final String CANCEL_REASON_NOT_SHAKE = "not_shake";

    @NotNull
    public static final String CONNECT_FAIL_REASON_BLUETOOTH_OFF = "bluetooth_off";

    @NotNull
    public static final String CONNECT_FAIL_REASON_CONNECT_FAIL = "connect_fail";

    @NotNull
    public static final String CONNECT_FAIL_REASON_DISCONNECT = "disconnect";

    @NotNull
    public static final String CONNECT_FAIL_REASON_DISCOVER_SERVICE_FAIL = "discover_service_fail";

    @NotNull
    public static final String CONNECT_FAIL_REASON_INIT_FAIL = "init_fail";

    @NotNull
    public static final String EXTRA_UNKNOWN_AUTH_FAIL = "unknown_auth_fail";

    @NotNull
    public static final String FW_VERSION = "fwVersion";

    @NotNull
    public static final String KEY_APP_STATUS = "app_status";

    @NotNull
    public static final String KEY_BIND_MODE = "bindmode";

    @NotNull
    public static final String KEY_DEVICE_SOURCE = "device_source";

    @NotNull
    public static final String KEY_KNOWN_DEVICE = "known_device";

    @NotNull
    public static final String KEY_MAC_ADDRESS = "macaddress";

    @NotNull
    public static final String KEY_RSSI = "rssi";

    @NotNull
    public static final String NETWORK_ENABLE = "network_enable";

    @NotNull
    public static final String QUERY_FAIL_ON_CANCEL = "on_cancel:";

    @NotNull
    public static final String QUERY_FAIL_ON_ERROR = "on_error:";

    @NotNull
    public static final String QUERY_FAIL_ON_FAILURE = "on_failure:";

    @NotNull
    public static final String QUERY_FAIL_RESPONSE_CODE = "response_code:";

    @NotNull
    public static final String QUERY_FAIL_STATUS_CODE = "status_code:";

    @NotNull
    public static final String QUERY_FAIL_UNKNOWN_DEVICE_TYPE = "unknown_device_type";

    @NotNull
    public static final String SN = "sn";

    @NotNull
    public static final String STAGE_AUTH = "Authrize";

    @NotNull
    public static final String STAGE_CONNECT = "Connect";

    @NotNull
    public static final String STAGE_QUERY = "Query relationship";

    @NotNull
    public static final String STAGE_SCAN = "Scan";

    @NotNull
    public static final String STAGE_SET_USER_INFO = "Write configure";

    @NotNull
    public static final String STAGE_UPLOAD_BIND = "Commit relationship";

    @NotNull
    public static final String UPLOAD_BIND_FAIL_CLOUD_FAIL = "server_fail";

    @NotNull
    public static final String UPLOAD_BIND_FAIL_NO_NETWORK = "no_network";
}
