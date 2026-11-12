package com.xiaomi.onetrack.b;

/* JADX INFO: loaded from: classes11.dex */
class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f13817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f13818b;

    public j(h hVar, String str) {
        this.f13818b = hVar;
        this.f13817a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f13818b.f13813b.getWritableDatabase().delete(g.f13811b, "app_id=?", new String[]{this.f13817a});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
