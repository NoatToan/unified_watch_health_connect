package com.huami.watch.companion.components.bluetoothproxyserver.utils;

import com.xiaomi.hm.health.bt.model.HMDeviceState;

/* JADX INFO: loaded from: classes16.dex */
public class HttpDataFactory {
    public static final int DEF_LENGTH = 10240;
    public static final byte DNS_G_ONLY = 0;
    public static final short DNS_REQ = 1540;
    public static final short DNS_RES = 1541;
    public static final short HTTP_DATA = 1539;
    public static final byte[] HTTP_DATA_EOT = {4};
    public static final byte HTTP_G_CONTINUE = 2;
    public static final byte HTTP_G_END = 3;
    public static final byte HTTP_G_FIRST = 1;
    public static final byte HTTP_G_INTERRUPT = 4;
    public static final byte HTTP_G_ONLY = 0;
    public static final short HTTP_REQ = 1537;
    public static final short HTTP_RES = 1538;
    public static final short NO_MORE_DATA = 1536;
    public static final short TCPIP_DATA = 1542;
    public static final short TLS = 1543;
    public static final byte TLS_G_ONLY = 0;
    private static final String a = "HttpDataFactory";

    public enum DataGroup {
        HTTP_G_ONLY,
        HTTP_G_FIRST,
        HTTP_G_CONTINUE,
        HTTP_G_END
    }

    public enum DataType {
        HTTP_REQ,
        HTTP_RES,
        HTTP_DATA
    }

    public static HttpData getHttpBodyData(long j, byte b, byte[] bArr) {
        return new HttpData(HTTP_DATA, j, b, bArr.length, bArr);
    }

    public static HttpData getHttpData(short s, long j, byte b, short s2, byte[] bArr) {
        if (bArr == null) {
            ProxyLog.E(a, "data is null, not create HttpData instance");
            return null;
        }
        if (s2 != bArr.length) {
            ProxyLog.E(a, "length not equal to data's length,  not create HttpData instance");
            return null;
        }
        switch (s) {
            case 1536:
            case HMDeviceState.DEVICE_STATE_UPGRADE_GPS /* 1540 */:
            case 1541:
            case 1543:
                return new HttpData(s, j, b, s2, bArr);
            case HMDeviceState.DEVICE_STATE_UPGRADE_RES /* 1537 */:
                return new HttpData(HTTP_REQ, j, (byte) 0, s2, bArr);
            case HMDeviceState.DEVICE_STATE_UPGRADE_FONT /* 1538 */:
                return new HttpData(HTTP_RES, j, (byte) 0, s2, bArr);
            case HMDeviceState.DEVICE_STATE_UPGRADE_AGPS /* 1539 */:
                return new HttpData(HTTP_DATA, j, b, s2, bArr);
            case 1542:
            default:
                ProxyLog.E(a, "data type is error:" + ((int) s));
                return null;
        }
    }

    public static HttpData getHttpReqHeadData(long j, byte[] bArr) {
        return new HttpData(HTTP_REQ, j, (byte) 0, bArr.length, bArr);
    }

    public static HttpData getHttpResHeadData(long j, byte[] bArr) {
        return new HttpData(HTTP_RES, j, (byte) 0, bArr.length, bArr);
    }
}
