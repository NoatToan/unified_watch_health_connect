package com.huawei.maps.offlinedata.logpush;

import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.huawei.maps.offlinedata.utils.g;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes12.dex */
public class b extends com.huawei.maps.offlinedata.logpush.a {
    private b() {
    }

    public static void b(com.huawei.maps.offlinedata.logpush.dto.a aVar) {
        aVar.a(System.currentTimeMillis());
        f().a(aVar);
    }

    public static b f() {
        return a.f17849a;
    }

    @Override // com.huawei.maps.offlinedata.logpush.a
    protected String a() {
        return "AccessTraceLogPusher";
    }

    protected void a(com.huawei.maps.offlinedata.logpush.dto.a aVar) {
        if (aVar == null) {
            g.c("AccessTraceLogPusher", "log list is empty, do not need push.");
            return;
        }
        LinkedHashMap linkedHashMapA = a((com.huawei.maps.offlinedata.logpush.dto.c) aVar);
        linkedHashMapA.put("requestId", aVar.o());
        linkedHashMapA.put("apiName", aVar.l());
        linkedHashMapA.put("errorCode", aVar.n());
        linkedHashMapA.put("startTime", String.valueOf(aVar.p()));
        linkedHashMapA.put("endTime", String.valueOf(aVar.m()));
        linkedHashMapA.put(WiseOpenHianalyticsData.UNION_COSTTIME, String.valueOf(a(aVar.p(), aVar.m())));
        linkedHashMapA.put("count", "1");
        a("map_offlinedata_access_trace", linkedHashMapA);
        e();
    }

    private int a(long j, long j2) {
        long j3 = j2 - j;
        if (j3 <= 2147483647L && j3 >= -2147483648L) {
            return (int) j3;
        }
        g.d(a(), "duration is out of integer range, using 0. start is " + j + ", end is " + j2);
        return 0;
    }

    static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f17849a = new b();
    }
}
