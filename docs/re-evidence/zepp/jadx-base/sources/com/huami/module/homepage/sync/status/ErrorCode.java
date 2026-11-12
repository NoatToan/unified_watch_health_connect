package com.huami.module.homepage.sync.status;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/huami/module/homepage/sync/status/ErrorCode;", "", "", "code", LogUtil.I, "getCode", "()I", "<init>", "(Ljava/lang/String;II)V", "TYPE_NO_DEVICE", "TYPE_BLUETOOTH_OFF", "TYPE_CONNECT_TIMEOUT", "TYPE_MILI_SYNC_FAILED", "TYPE_WATCH_SYNC_FAILED", "TYPE_SPORT_WATCH_SYNC_FAILED", "TYPE_SHOES_SYNC_FAILED", "TYPE_SENSORHUB_SYNC_FAILED", "TYPE_MUSIC_ALIVE_FAILED", "ERROR_FORBIDDEN_SYNC_DATA", "ERROR_AGPS_SYNC", "TYPE_SYNC_DATA_FAIL", "ERROR_NO_BLUETOOTH", "ERROR_NETWORK", "ERROR_OTHER", "homePage_release"}, k = 1, mv = {1, 5, 1})
public enum ErrorCode {
    TYPE_NO_DEVICE(0),
    TYPE_BLUETOOTH_OFF(1),
    TYPE_CONNECT_TIMEOUT(2),
    TYPE_MILI_SYNC_FAILED(5),
    TYPE_WATCH_SYNC_FAILED(6),
    TYPE_SPORT_WATCH_SYNC_FAILED(7),
    TYPE_SHOES_SYNC_FAILED(8),
    TYPE_SENSORHUB_SYNC_FAILED(9),
    TYPE_MUSIC_ALIVE_FAILED(21),
    ERROR_FORBIDDEN_SYNC_DATA(22),
    ERROR_AGPS_SYNC(23),
    TYPE_SYNC_DATA_FAIL(24),
    ERROR_NO_BLUETOOTH(25),
    ERROR_NETWORK(400),
    ERROR_OTHER(255);

    private final int code;

    ErrorCode(int i) {
        this.code = i;
    }

    public final int getCode() {
        return this.code;
    }
}
