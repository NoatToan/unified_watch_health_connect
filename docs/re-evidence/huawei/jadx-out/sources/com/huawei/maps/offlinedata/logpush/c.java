package com.huawei.maps.offlinedata.logpush;

import com.huawei.maps.offlinedata.utils.g;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes12.dex */
public class c extends com.huawei.maps.offlinedata.logpush.a {
    private c() {
    }

    private static c f() {
        return a.f17850a;
    }

    @Override // com.huawei.maps.offlinedata.logpush.a
    protected String a() {
        return "ErrorTraceLogPusher";
    }

    public static void a(com.huawei.maps.offlinedata.logpush.dto.b bVar) {
        f().a(bVar, com.huawei.maps.offlinedata.logpush.utils.c.a(bVar.n()));
    }

    protected void a(com.huawei.maps.offlinedata.logpush.dto.b bVar, String str) {
        if (bVar == null) {
            g.c("ErrorTraceLogPusher", "log list is empty, do not need push.");
            return;
        }
        LinkedHashMap linkedHashMapA = a((com.huawei.maps.offlinedata.logpush.dto.c) bVar);
        linkedHashMapA.put(ParsedFieldTag.KAKA_TASK_SCENARIO, bVar.m());
        linkedHashMapA.put("message", bVar.l());
        linkedHashMapA.put("logTime", String.valueOf(System.currentTimeMillis()));
        linkedHashMapA.put("errorStack", str);
        a("map_offlinedata_errorlog_report", linkedHashMapA);
        e();
    }

    static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final c f17850a = new c();
    }
}
