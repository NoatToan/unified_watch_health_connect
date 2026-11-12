package com.xiaomi.onetrack.api;

import android.text.TextUtils;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
class ad implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f13721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Map f13722b;
    final /* synthetic */ List c;
    final /* synthetic */ h d;

    public ad(h hVar, String str, Map map, List list) {
        this.d = hVar;
        this.f13721a = str;
        this.f13722b = map;
        this.c = list;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            if (TextUtils.isEmpty(this.d.f.getAdEventAppId())) {
                com.xiaomi.onetrack.util.p.a("OneTrackImp", "adEventAppId is null,Please configure,event name:" + this.f13721a);
                return;
            }
            if (this.d.d(this.f13721a)) {
                return;
            }
            this.d.f13768b.a(this.f13721a, c.a(this.f13721a, com.xiaomi.onetrack.util.r.a((Map<String, Object>) this.f13722b, true), this.d.f, this.d.h, this.d.f(this.f13721a), this.d.i, com.xiaomi.onetrack.util.r.a(this.c), this.d.j));
        } catch (Exception e) {
            com.xiaomi.onetrack.util.p.b("OneTrackImp", "track map error: " + e.toString());
        }
    }
}
