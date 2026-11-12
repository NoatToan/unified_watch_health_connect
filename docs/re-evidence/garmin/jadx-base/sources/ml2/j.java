package ml2;

import com.garmin.device.multilink.reliable.MLRConnectionHelper;
import com.garmin.device.multilink.reliable.MLRInitializer;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public class j implements FutureCallback<n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ListenableFuture f119371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f119372b;

    public j(l lVar, ListenableFuture listenableFuture) {
        this.f119372b = lVar;
        this.f119371a = listenableFuture;
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onFailure(Throwable th3) {
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onSuccess(n nVar) {
        l lVar = this.f119372b;
        lVar.getClass();
        e0.b bVar = (e0.b) Futures.getUnchecked(this.f119371a);
        UUID uuid = bVar.f119334a;
        lVar.f119384k = uuid;
        pj2.k kVar = lVar.f119377d;
        kVar.a(lVar.f119374a, m.f119394a, uuid);
        Logger logger = lVar.f119376c;
        logger.debug("Multi-Link registered on characteristic for handle {}", Byte.valueOf(bVar.f119337d));
        nl2.d dVar = new nl2.d(lVar.f119377d, bVar.f119334a, bVar.f119335b, lVar.f119378e);
        lVar.f119383j = dVar;
        dVar.f126507b.set(lVar);
        i0 i0Var = new i0(kVar, bVar.f119335b);
        lVar.f119385l = i0Var;
        ReentrantLock reentrantLock = i0Var.f119362b;
        reentrantLock.lock();
        try {
            if (i0Var.f119361a.compareAndSet(0, 1)) {
                Thread thread = new Thread(new k32.n(i0Var, 14), "Multi-Link Writer: " + i0Var.f119365e.getMacAddress());
                i0Var.f119367g = thread;
                thread.start();
            }
            reentrantLock.unlock();
            MLRInitializer.initialize(MLRInitializer.isDebug());
            if (MLRInitializer.isLoaded()) {
                lVar.f119386m = new MLRConnectionHelper(lVar.f119385l, kVar.getMacAddress(), hashCode(), lVar.f119375b, lVar.f119387n != null ? new d(kVar.getMacAddress(), lVar.f119387n) : null);
            } else {
                logger.warn("MLRInitializer not setup. Reliable multilink unsupported");
                lVar.f119386m = null;
            }
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }
}
