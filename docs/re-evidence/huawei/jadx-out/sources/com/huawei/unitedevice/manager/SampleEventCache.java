package com.huawei.unitedevice.manager;

import android.text.TextUtils;
import defpackage.eee;
import defpackage.lua;
import defpackage.pej;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class SampleEventCache {

    /* JADX INFO: loaded from: classes2.dex */
    public enum SampleEventCacheReason {
        DISCONNECT(1),
        SEND_FAIL(2),
        ALL(255);

        private int value;

        SampleEventCacheReason(int i) {
            this.value = i;
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f29880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private eee f29881b;

        public a(eee eeeVar, long j) {
            this.f29881b = eeeVar;
            this.f29880a = j;
        }

        public a() {
        }

        public eee c() {
            return this.f29881b;
        }

        public long d() {
            return this.f29880a;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<a> f29882c = new ArrayList(100);
        private String e = "";

        public void d(String str) {
            this.e = str;
        }

        public String b() {
            return this.e;
        }

        public void c(List<a> list) {
            this.f29882c = list;
        }

        public List<a> c() {
            return this.f29882c;
        }

        public void a(a aVar) {
            if (this.f29882c.size() >= 100) {
                LogUtil.e("SampleEventCache", "sampleEventInfos has 100");
            } else {
                this.f29882c.add(aVar);
            }
        }

        public void a() {
            this.f29882c.clear();
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f29883b;
        private SampleEventCacheReason d;

        public e() {
            this.d = SampleEventCacheReason.ALL;
            this.f29883b = 24;
        }

        public e(SampleEventCacheReason sampleEventCacheReason, int i) {
            this.d = sampleEventCacheReason;
            this.f29883b = i;
        }

        public int d() {
            return this.f29883b;
        }
    }

    public static void c(String str, eee eeeVar, e eVar) {
        LogUtil.b("SampleEventCache", "sampleEventCache cache");
        String strE = lua.e("SampleEventCache", "SampleEventCacheKey", "");
        d dVar = new d();
        if (!TextUtils.isEmpty(strE)) {
            LogUtil.b("SampleEventCache", "sampleEventCacheInfoStr is not empty");
            dVar = (d) pej.b(strE, d.class);
            if (dVar == null) {
                LogUtil.e("SampleEventCache", "sampleEventCacheInfo is null");
                lua.d("SampleEventCache", "SampleEventCacheKey");
                return;
            }
        }
        String strB = dVar.b();
        if (!TextUtils.isEmpty(strB) && !str.equals(strB)) {
            LogUtil.e("SampleEventCache", "deviceIdentify is not equals lastDeviceId");
            dVar.a();
        }
        dVar.d(str);
        dVar.a(new a(eeeVar, (((long) eVar.d()) * 3600000) + System.currentTimeMillis()));
        lua.f("SampleEventCache", "SampleEventCacheKey", pej.c(dVar));
    }

    public static void d(List<a> list) {
        LogUtil.b("SampleEventCache", "updateCache sampleEvents is empty:", Boolean.valueOf(list.isEmpty()));
        String strE = lua.e("SampleEventCache", "SampleEventCacheKey", "");
        new d();
        if (TextUtils.isEmpty(strE)) {
            LogUtil.e("SampleEventCache", "updateCache sampleEventCacheInfoStr is empty");
            return;
        }
        d dVar = (d) pej.b(strE, d.class);
        if (dVar == null) {
            LogUtil.e("SampleEventCache", "sampleEventCacheInfo is null");
        } else if (TextUtils.isEmpty(dVar.b())) {
            LogUtil.e("SampleEventCache", "updateCache getLastDeviceId is empty");
        } else {
            dVar.c(list);
            lua.f("SampleEventCache", "SampleEventCacheKey", pej.c(dVar));
        }
    }

    public static List<a> d() {
        String strE = lua.e("SampleEventCache", "SampleEventCacheKey", "");
        if (TextUtils.isEmpty(strE)) {
            LogUtil.e("SampleEventCache", "readAllEvents sampleEventCacheInfoStr is empty");
            return new ArrayList();
        }
        d dVar = (d) pej.b(strE, d.class);
        if (dVar == null) {
            LogUtil.e("SampleEventCache", "sampleEventCacheInfo is null");
            return new ArrayList();
        }
        return dVar.c();
    }

    public static void b() {
        lua.d("SampleEventCache", "SampleEventCacheKey");
    }

    public static String e() {
        String strE = lua.e("SampleEventCache", "SampleEventCacheKey", "");
        if (TextUtils.isEmpty(strE)) {
            LogUtil.e("SampleEventCache", "getLastDeviceId sampleEventCacheInfoStr is empty");
            return "";
        }
        d dVar = (d) pej.b(strE, d.class);
        if (dVar == null) {
            LogUtil.e("SampleEventCache", "sampleEventCacheInfo is null");
            return "";
        }
        return dVar.b();
    }
}
