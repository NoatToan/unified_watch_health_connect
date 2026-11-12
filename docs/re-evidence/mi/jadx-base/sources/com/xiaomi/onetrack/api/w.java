package com.xiaomi.onetrack.api;

import com.xiaomi.onetrack.ServiceQualityEvent;

/* JADX INFO: loaded from: classes11.dex */
class w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ServiceQualityEvent f13795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f13796b;

    public w(h hVar, ServiceQualityEvent serviceQualityEvent) {
        this.f13796b = hVar;
        this.f13795a = serviceQualityEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f13796b.f13768b.a(b.e, c.a(this.f13795a, this.f13796b.f, this.f13796b.h, this.f13796b.i, this.f13796b.j));
        } catch (Exception e) {
            com.xiaomi.onetrack.util.p.b("OneTrackImp", "trackNetAvailableEvent error: " + e.toString());
        }
    }
}
