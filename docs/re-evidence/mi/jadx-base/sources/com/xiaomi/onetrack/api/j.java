package com.xiaomi.onetrack.api;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Map f13771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f13772b;

    public j(h hVar, Map map) {
        this.f13772b = hVar;
        this.f13771a = map;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            this.f13772b.f13768b.a(b.d, c.b(new JSONObject(this.f13771a), this.f13772b.f, this.f13772b.h, this.f13772b.f(b.d), this.f13772b.i, this.f13772b.j));
        } catch (Exception e) {
            com.xiaomi.onetrack.util.p.b("OneTrackImp", "userProfileIncrement map error:" + e.toString());
        }
    }
}
