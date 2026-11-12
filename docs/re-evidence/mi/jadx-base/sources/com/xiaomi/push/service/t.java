package com.xiaomi.push.service;

import android.os.SystemClock;
import android.text.TextUtils;
import defpackage.rts;
import defpackage.tts;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap<String, c> f14258a = new ConcurrentHashMap<>();

    public static class a extends XMPushService.j {
        public a() {
            super(17);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "RecordTimeManager clear";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public void b() {
            t.a().b();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final t f14259a = new t();
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f14260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f14261b;
        public long c;
        public long d;

        public c() {
        }

        public long a() {
            long j = this.c;
            long j2 = this.f14261b;
            if (j > j2) {
                return j - j2;
            }
            return 0L;
        }

        public long b() {
            long j = this.d;
            long j2 = this.c;
            if (j > j2) {
                return j - j2;
            }
            return 0L;
        }
    }

    public static t a() {
        return b.f14259a;
    }

    public void b() {
        if (this.f14258a.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<String, c>> it = this.f14258a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, c> next = it.next();
            if (next == null || next.getValue() == null) {
                it.remove();
            } else {
                c value = next.getValue();
                if (Math.abs(SystemClock.elapsedRealtime() - value.f14261b) > 10000) {
                    e(next.getKey(), value);
                    it.remove();
                }
            }
        }
    }

    public void c(String str, long j) {
        c cVar = this.f14258a.get(str);
        if (cVar != null) {
            cVar.c = j;
        }
    }

    public void d(String str, long j, long j2) {
        c cVar = new c();
        cVar.f14260a = j2;
        cVar.f14261b = j;
        this.f14258a.put(str, cVar);
    }

    public final void e(String str, c cVar) {
        if (TextUtils.isEmpty(str) || cVar == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("xmsfVC", Long.valueOf(cVar.f14260a));
        map.put("packetId", str);
        map.put("pTime", Long.valueOf(cVar.a()));
        map.put("bTime", Long.valueOf(cVar.b()));
        tts.c().a(new rts("msg_process_time", map));
    }

    public void f(String str, long j) {
        c cVarRemove = this.f14258a.remove(str);
        if (cVarRemove != null) {
            cVarRemove.d = j;
            e(str, cVarRemove);
        }
    }
}
