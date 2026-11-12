package ml2;

import com.garmin.device.ble.BleCommunicationException;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements AsyncFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f119298b;

    public /* synthetic */ a(c cVar, int i14) {
        this.f119297a = i14;
        this.f119298b = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0034  */
    @Override // com.google.common.util.concurrent.AsyncFunction
    public final ListenableFuture apply(Object obj) throws BleCommunicationException {
        boolean zRemoveIf;
        int i14 = this.f119297a;
        c cVar = this.f119298b;
        switch (i14) {
            case 0:
                BleCommunicationException bleCommunicationException = (BleCommunicationException) obj;
                int i15 = c.f119306h;
                if (cVar.f119419c.get() || cVar.f119420d.incrementAndGet() >= 5) {
                    throw bleCommunicationException;
                }
                return cVar.a();
            case 1:
                AtomicInteger atomicInteger = cVar.f119308g;
                Logger logger = cVar.f119417a;
                Set<o> set = cVar.f119418b;
                b0 b0VarB = cVar.b((byte[]) obj);
                int i16 = 0;
                if (b0VarB == null) {
                    zRemoveIf = false;
                } else if (b0VarB instanceof b0.a) {
                    zRemoveIf = set.remove(((b0.a) b0VarB).f119304a);
                    if (zRemoveIf) {
                        logger.info("Successfully read and parsed the page");
                    }
                } else if (b0VarB instanceof b0.b) {
                    b0.b bVar = (b0.b) b0VarB;
                    logger.info("MultiLinkInfo Page {} is unsupported", Byte.valueOf(bVar.f119305a));
                    zRemoveIf = set.removeIf(new b(bVar, i16));
                } else {
                    zRemoveIf = false;
                }
                if (zRemoveIf) {
                    atomicInteger.set(0);
                } else {
                    logger.info("Failed to read or parse the page");
                    atomicInteger.incrementAndGet();
                }
                Iterator<o> it = set.iterator();
                if (!it.hasNext()) {
                    return Futures.immediateFuture(cVar.f119421e);
                }
                if (atomicInteger.get() >= 5) {
                    return Futures.immediateFailedFuture(new BleCommunicationException("Device failed to change multi-link info page"));
                }
                o next = it.next();
                try {
                    Thread.sleep(((long) (Math.random() * 500.0d)) + 500);
                    break;
                } catch (Exception unused) {
                }
                return Futures.transformAsync(cVar.f119307f.c(m.f119394a, m.f119395b, next.a()), new a(cVar, 2), MoreExecutors.directExecutor());
            default:
                int i17 = c.f119306h;
                return Futures.transformAsync(cVar.f119307f.v(m.f119394a, m.f119395b), new a(cVar, 1), MoreExecutors.directExecutor());
        }
    }
}
