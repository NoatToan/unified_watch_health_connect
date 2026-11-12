package jn2;

import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.garmin.device.nfc.NfcCommandHandler;
import com.google.common.base.Function;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.FluentFuture;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningScheduledExecutorService;
import com.google.common.util.concurrent.SettableFuture;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import ml2.e0;
import ml2.h0;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.r0;
import ty1.g2;
import vo2.v;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class k implements AsyncFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f99641b;

    public /* synthetic */ k(Object obj, int i14) {
        this.f99640a = i14;
        this.f99641b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, com.google.common.util.concurrent.FluentFuture] */
    @Override // com.google.common.util.concurrent.AsyncFunction
    public final ListenableFuture apply(Object obj) {
        Set setKeySet;
        int i14 = this.f99640a;
        Object obj2 = this.f99641b;
        switch (i14) {
            case 0:
                final m mVar = (m) obj2;
                Map map = (Map) obj;
                ListeningScheduledExecutorService listeningScheduledExecutorService = m.f99646l;
                int size = (map == null || (setKeySet = map.keySet()) == null) ? 0 : setKeySet.size();
                final m0 m0Var = new m0();
                m0Var.f105804a = true;
                final r0 r0Var = new r0();
                mVar.f99650d.debug("deleteProviderMetadata: found " + size + " cards");
                r0 r0Var2 = new r0();
                r0Var2.f105810a = FluentFuture.from(Futures.immediateFuture(Boolean.TRUE));
                if (size > 0) {
                    mVar.u(new s(map, r0Var2, m0Var, mVar, r0Var));
                } else {
                    m0Var.f105804a = false;
                }
                return ((FluentFuture) r0Var2.f105810a).transform(new Function() { // from class: jn2.e
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.common.base.Function
                    public final Object apply(Object obj3) throws Exception {
                        Logger logger = mVar.f99650d;
                        m0 m0Var2 = m0Var;
                        boolean z14 = m0Var2.f105804a;
                        r0 r0Var3 = r0Var;
                        Exception exc = (Exception) r0Var3.f105810a;
                        logger.debug("deleteProviderMetadata: deletes finished didDelete:" + z14 + ", exception:" + (exc != null ? exc.getMessage() : null));
                        Exception exc2 = (Exception) r0Var3.f105810a;
                        if (exc2 == null) {
                            return Boolean.valueOf(m0Var2.f105804a);
                        }
                        throw exc2;
                    }
                }, m.f99646l);
            case 1:
                return ((nl2.d) obj2).c();
            case 2:
                e0 e0Var = (e0) obj2;
                e0Var.f119329a.warn("Failed to close existing handles; continuing registration", (Throwable) obj);
                return Futures.immediateFuture(new nl2.a(e0Var.f119331c, -1));
            case 3:
                SettableFuture settableFuture = (SettableFuture) obj2;
                int i15 = h0.f119352l;
                return settableFuture;
            case 4:
                return ((nl2.d.a) obj2).f126514a;
            case 5:
                rl2.c cVar = (rl2.c) obj2;
                byte b14 = cVar.f50801b;
                com.garmin.device.nfc.i iVar = (com.garmin.device.nfc.i) obj;
                Logger logger = NfcCommandHandler.f50799g;
                if (iVar != null && iVar.d() != null) {
                    byte[] bArrD = iVar.d();
                    bArrD.getClass();
                    if (bArrD.length != 0) {
                        byte b15 = iVar.d()[0];
                        Logger logger2 = NfcCommandHandler.f50799g;
                        logger2.trace("verifyLockStatus: lock mode " + ((int) b15));
                        if (b15 != NfcCommandHandler.c.UNLOCKED.f50822a) {
                            if (b15 == b14) {
                                logger2.warn("verifyLockStatus: Device already locked by current app. Unlocking");
                                com.garmin.device.nfc.i iVar2 = new com.garmin.device.nfc.i(NfcCommandHandler.b.NFC_ACCESS_RELEASE, new byte[]{b14});
                                tl2.i iVar3 = cVar.f50805f;
                                tl2.g gVar = tl2.i.f165328k;
                                ListenableFuture listenableFutureTransform = Futures.transform(iVar3.d(iVar2, AbstractComponentTracker.LINGERING_TIMEOUT, 0), new androidx.media3.common.p(11), cVar.f50804e);
                                listenableFutureTransform.getClass();
                                return listenableFutureTransform;
                            }
                            logger2.warn("verifyLockStatus: Device is locked by " + ((int) b15) + ". Can't release");
                        }
                        return Futures.immediateFuture(Byte.valueOf(b15));
                    }
                }
                return Futures.immediateFuture(null);
            case 6:
                Logger logger3 = NfcCommandHandler.f50799g;
                return (ListenableFuture) ((p40.h) obj2).invoke(obj);
            case 7:
                NfcCommandHandler.d dVar = (NfcCommandHandler.d) obj2;
                Logger logger4 = NfcCommandHandler.f50799g;
                if (com.garmin.device.nfc.j.b((com.garmin.device.nfc.i) obj, NfcCommandHandler.e.DELETE_BY_PROVIDER)) {
                    return Futures.immediateFuture(Unit.INSTANCE);
                }
                return Futures.immediateFailedFuture(new IOException("Failed to delete by provider for " + dVar));
            case 8:
                return (ListenableFuture) ((g2) obj2).invoke(obj);
            case 9:
                return (ListenableFuture) ((v) obj2).invoke(obj);
            default:
                return (ListenableFuture) ((v) obj2).invoke(obj);
        }
    }
}
