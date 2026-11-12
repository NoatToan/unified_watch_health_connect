package com.xiaomi.hm.health.device.setting.vo;

import com.huami.nfc.applet.EntityKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/vo/ConnectStatus;", "", "<init>", "(Ljava/lang/String;I)V", "CONNECTED", "CONNECTING", EntityKt.FETCH_APDU_MODE_SYNC, "SYNC_A_GPS", "SYNC_A_GPS_FAIL", "UN_CONNECT", "BLUETOOTH_DISABLE", "FAILURE", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public enum ConnectStatus {
    CONNECTED,
    CONNECTING,
    SYNC,
    SYNC_A_GPS,
    SYNC_A_GPS_FAIL,
    UN_CONNECT,
    BLUETOOTH_DISABLE,
    FAILURE
}
