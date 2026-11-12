package com.xiaomi.hm.health.discovery.jsbridge.function.bloodpressure;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/discovery/jsbridge/function/bloodpressure/ErrorCode;", "", "", "RESPONSE_SUCCESS", "Ljava/lang/String;", "RESPONSE_NETWORK_ERROR", "RESPONSE_NOT_CONNECT", "RESPONSE_NOT_BIND", "RESPONSE_WRITE_FAIL", "RESPONSE_INVALID_PAYLOAD", "RESPONSE_DEVICE_NOT_SUPPORT", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ErrorCode {

    @NotNull
    public static final ErrorCode INSTANCE = new ErrorCode();

    @NotNull
    public static final String RESPONSE_DEVICE_NOT_SUPPORT = "{\"errorCode\": \"4021403\",\"errorMessage\": \"Device is not supported.\"}";

    @NotNull
    public static final String RESPONSE_INVALID_PAYLOAD = "{\"errorCode\": \"4021401\",\"errorMessage\": \"Invalid payload.\"}";

    @NotNull
    public static final String RESPONSE_NETWORK_ERROR = "{\"errorCode\": \"4000001\",\"errorMessage\": \"Network is Disconnected.\"}";

    @NotNull
    public static final String RESPONSE_NOT_BIND = "{\"errorCode\": \"4021405\",\"errorMessage\": \"Miss binding.\"}";

    @NotNull
    public static final String RESPONSE_NOT_CONNECT = "{\"errorCode\": \"4041001\",\"errorMessage\": \"Miss connecting.\"}";

    @NotNull
    public static final String RESPONSE_SUCCESS = "{\"status\": \"success\"}";

    @NotNull
    public static final String RESPONSE_WRITE_FAIL = "{\"errorCode\": \"4021402\",\"errorMessage\": \"Sync error.\"}";

    private ErrorCode() {
    }
}
