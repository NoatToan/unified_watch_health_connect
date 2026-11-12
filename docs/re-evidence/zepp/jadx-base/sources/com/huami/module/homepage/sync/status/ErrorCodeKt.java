package com.huami.module.homepage.sync.status;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¨\u0006\u0004"}, d2 = {"", "code", "Lcom/huami/module/homepage/sync/status/ErrorCode;", "errorCode", "homePage_release"}, k = 2, mv = {1, 5, 1})
public final class ErrorCodeKt {
    @NotNull
    public static final ErrorCode errorCode(int i) {
        if (i == 0) {
            return ErrorCode.TYPE_NO_DEVICE;
        }
        if (i == 1) {
            return ErrorCode.TYPE_BLUETOOTH_OFF;
        }
        if (i == 2) {
            return ErrorCode.TYPE_CONNECT_TIMEOUT;
        }
        if (i == 400) {
            return ErrorCode.ERROR_NETWORK;
        }
        switch (i) {
            case 5:
                return ErrorCode.TYPE_MILI_SYNC_FAILED;
            case 6:
                return ErrorCode.TYPE_WATCH_SYNC_FAILED;
            case 7:
                return ErrorCode.TYPE_SPORT_WATCH_SYNC_FAILED;
            case 8:
                return ErrorCode.TYPE_SHOES_SYNC_FAILED;
            case 9:
                return ErrorCode.TYPE_SENSORHUB_SYNC_FAILED;
            default:
                switch (i) {
                    case 21:
                        return ErrorCode.TYPE_MUSIC_ALIVE_FAILED;
                    case 22:
                        return ErrorCode.ERROR_FORBIDDEN_SYNC_DATA;
                    case 23:
                        return ErrorCode.ERROR_AGPS_SYNC;
                    case 24:
                        return ErrorCode.TYPE_SYNC_DATA_FAIL;
                    case 25:
                        return ErrorCode.ERROR_NO_BLUETOOTH;
                    default:
                        return ErrorCode.ERROR_OTHER;
                }
        }
    }
}
