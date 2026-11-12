package com.huawei.maps.offlinedata.service.device;

import com.huawei.maps.offlinedata.service.device.receivers.h;
import com.huawei.maps.offlinedata.service.device.receivers.j;
import com.huawei.maps.offlinedata.service.device.receivers.k;
import com.huawei.maps.offlinedata.utils.g;
import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile e f17934b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f17935a = new HashMap();

    private e() {
    }

    public static e a() {
        if (f17934b == null) {
            synchronized (e.class) {
                if (f17934b == null) {
                    f17934b = new e();
                }
            }
        }
        return f17934b;
    }

    public void b(int i) {
        this.f17935a.remove(Integer.valueOf(i));
    }

    public HashMap b() {
        return this.f17935a;
    }

    public void a(int i, long j) {
        this.f17935a.put(Integer.valueOf(i), Long.valueOf(j));
    }

    public com.huawei.maps.offlinedata.service.device.receivers.f a(int i) {
        if (i == com.huawei.maps.offlinedata.service.device.consts.b.QUERY_DEVICE_REMAIN_SPACE.c()) {
            return com.huawei.maps.offlinedata.service.device.receivers.c.a();
        }
        if (i != com.huawei.maps.offlinedata.service.device.consts.b.SYNC_POLITICAL_PERSPECTIVE.c() && i != com.huawei.maps.offlinedata.service.device.consts.b.TRANSMIT_MAP_HANDSHAKE.c()) {
            if (i == com.huawei.maps.offlinedata.service.device.consts.b.DEVICE_REQUEST_POLITICAL_PERSPECTIVE.c()) {
                return h.a();
            }
            if (i == com.huawei.maps.offlinedata.service.device.consts.b.QUERY_DEVICE_DOWNLOADED_MAP_INFO.c()) {
                return j.b();
            }
            if (i == com.huawei.maps.offlinedata.service.device.consts.b.DELETE_DEVICE_MAP.c()) {
                return com.huawei.maps.offlinedata.service.device.receivers.a.a();
            }
            if (i == com.huawei.maps.offlinedata.service.device.consts.b.TRANSMIT_MAP_PARSE_FINISH.c()) {
                return k.a();
            }
            if (i == com.huawei.maps.offlinedata.service.device.consts.b.DEVICE_QUERY_MAP_SIZE.c()) {
                return com.huawei.maps.offlinedata.service.device.receivers.b.a();
            }
            if (i == com.huawei.maps.offlinedata.service.device.consts.b.DOWNLOAD_BY_WEAR.c()) {
                return com.huawei.maps.offlinedata.service.device.receivers.d.a();
            }
            g.b("OfflineMapReceiverManager", "getReceiver msgType wrong: " + i);
            return null;
        }
        return com.huawei.maps.offlinedata.service.device.receivers.g.a();
    }
}
