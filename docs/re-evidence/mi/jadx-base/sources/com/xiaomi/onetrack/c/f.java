package com.xiaomi.onetrack.c;

/* JADX INFO: loaded from: classes11.dex */
class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.xiaomi.onetrack.f.b f13839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f13840b;

    public f(c cVar, com.xiaomi.onetrack.f.b bVar) {
        this.f13840b = cVar;
        this.f13839a = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f13840b.b(this.f13839a);
            com.xiaomi.onetrack.a.a.a().a(this.f13839a);
            com.xiaomi.onetrack.util.p.a("EventManager", "addEvent: " + this.f13839a.e() + "data:" + this.f13839a.g().toString());
            q.a().a(this.f13839a.f(), false);
        } catch (Exception e) {
            com.xiaomi.onetrack.util.p.b("EventManager", "EventManager.addEvent exception: ", e);
        }
    }
}
