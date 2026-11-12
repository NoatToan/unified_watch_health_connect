package pj2;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f138110a;

    public s(v vVar) {
        this.f138110a = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f138110a.f138121e.info("services discovered, device available");
        if (this.f138110a.f138124h.f138031q.get() > 20) {
            n nVar = this.f138110a.f138120d;
            if (nVar instanceof p) {
                ((p) nVar).a();
            }
        }
        v vVar = this.f138110a;
        n nVar2 = vVar.f138120d;
        b bVar = vVar.f138124h;
        j jVar = (j) nVar2;
        jVar.f138068b.trace("onConnectionAvailable");
        jVar.f138079m = false;
        synchronized (jVar.f138076j) {
            try {
                if (jVar.f138078l == j.d.TERMINATED) {
                    return;
                }
                jVar.f138078l = j.d.CONNECTED;
                Logger logger = jVar.f138068b;
                CopyOnWriteArraySet<j.c> copyOnWriteArraySet = jVar.f138075i;
                logger.trace("notifyDeviceAvailable: {} callbacks", Integer.valueOf(copyOnWriteArraySet.size()));
                Iterator<j.c> it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    try {
                        it.next().a(jVar, bVar);
                    } catch (Exception e4) {
                        logger.warn("notifying callback of 'notifyDeviceAvailable'", (Throwable) e4);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
