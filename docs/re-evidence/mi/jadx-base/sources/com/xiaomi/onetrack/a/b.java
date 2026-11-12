package com.xiaomi.onetrack.a;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.xiaomi.onetrack.f.b f13700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f13701b;

    public b(a aVar, com.xiaomi.onetrack.f.b bVar) {
        this.f13701b = aVar;
        this.f13700a = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        List<com.xiaomi.onetrack.a.b.a> listA;
        com.xiaomi.onetrack.f.b bVar = this.f13700a;
        if ((bVar instanceof com.xiaomi.onetrack.a.b.b) && (listA = ((com.xiaomi.onetrack.a.b.b) bVar).a()) != null && listA.size() > 0) {
            Iterator<com.xiaomi.onetrack.a.b.a> it = listA.iterator();
            while (it.hasNext()) {
                this.f13701b.a(it.next());
            }
        }
        com.xiaomi.onetrack.a.c.b.a().b();
    }
}
