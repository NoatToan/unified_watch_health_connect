package com.huami.feedback.sync.api;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.ecg.core.model.constant.MeasureStateValue;
import com.huami.feedback.util.ErrorConstKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lcom/huami/feedback/sync/api/DeviceLogSyncError;", "", "", "value", LogUtil.I, "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "UNKNOWN", "UNKNOWN_DEVICE", "CONNECTION_FAILED", "NO_CONNECTION", "SYNC_SUCCESS", "UNKNOWN_COMMAND", "ERROR_PARAMETERS", "SYNC_FAILED", "ERROR_STATUS", "ERROR_DATA_PACKAGE", MeasureStateValue.BUSY, "VERIFY_FAILED", "CANCELLED_BY_USER", "ERROR_MUSIC_ALIVE", "ERROR_SPEECH_ALIVE", "DEVICE_SWITCH_FAILED", "FW_UPGRADING", "SYNCING", "UN_SUPPORT_SYNC_LOG", "feedback-sync-device-log-api_release"}, k = 1, mv = {1, 5, 1})
public enum DeviceLogSyncError {
    UNKNOWN(20000),
    UNKNOWN_DEVICE(20001),
    CONNECTION_FAILED(ErrorConstKt.DEVICE_CONNECTING_FAILED),
    NO_CONNECTION(ErrorConstKt.DEVICE_DISCONNECT),
    SYNC_SUCCESS(20004),
    UNKNOWN_COMMAND(20005),
    ERROR_PARAMETERS(20006),
    SYNC_FAILED(ErrorConstKt.LOG_OPERATE_FAILED),
    ERROR_STATUS(20008),
    ERROR_DATA_PACKAGE(20009),
    BUSY(20010),
    VERIFY_FAILED(20011),
    CANCELLED_BY_USER(20012),
    ERROR_MUSIC_ALIVE(20018),
    ERROR_SPEECH_ALIVE(20019),
    DEVICE_SWITCH_FAILED(20020),
    FW_UPGRADING(20021),
    SYNCING(20022),
    UN_SUPPORT_SYNC_LOG(20023);

    private final int value;

    DeviceLogSyncError(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
