package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import org.eclipse.californium.core.config.CoapConfig;
import org.eclipse.californium.elements.config.Configuration;
import org.eclipse.californium.elements.util.ClockUtil;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public final class zwf extends zwh {
    private static final Logger d = aaex.a((Class<?>) zwf.class);
    private final ConcurrentMap<Object, Queue<zvv>> f;
    private final int h;

    public zwf(Configuration configuration) {
        super(configuration);
        this.f = new ConcurrentHashMap();
        this.f54676a = new a();
        this.h = ((Integer) configuration.c(CoapConfig.ao)).intValue();
    }

    @Override // defpackage.zwh
    protected void a(zvv zvvVar, boolean z) {
        Object objE = zvvVar.e();
        Queue<zvv> queuePutIfAbsent = this.f.get(objE);
        if (queuePutIfAbsent == null) {
            ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(this.h);
            arrayBlockingQueue.add(zvvVar);
            queuePutIfAbsent = this.f.putIfAbsent(objE, arrayBlockingQueue);
            if (queuePutIfAbsent == null) {
                return;
            }
        }
        if (z) {
            queuePutIfAbsent.remove(zvvVar);
        }
        while (!queuePutIfAbsent.offer(zvvVar)) {
            this.e.remove(queuePutIfAbsent.poll());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Queue<zvv> queue, zvv zvvVar) {
        Iterator<zvv> it = queue.iterator();
        while (it.hasNext()) {
            if (it.next() == zvvVar) {
                it.remove();
                return;
            }
        }
    }

    @Override // defpackage.zwh, org.eclipse.californium.core.network.deduplication.Deduplicator
    public void clear() {
        super.clear();
        this.f.clear();
    }

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f54672a;

        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                zwf.d.trace("Start Mark-And-Sweep with {} entries", Integer.valueOf(zwf.this.e.size()));
                a();
            } catch (Throwable th) {
                zwf.d.warn("Exception in Mark-and-Sweep algorithm", th);
            }
        }

        private void a() {
            if (zwf.this.e.isEmpty()) {
                return;
            }
            long jC = ClockUtil.c();
            long nanos = TimeUnit.MILLISECONDS.toNanos(zwf.this.f54678c);
            int size = zwf.this.e.size();
            int i = 0;
            int size2 = 0;
            for (Map.Entry entry : zwf.this.f.entrySet()) {
                Queue queue = (Queue) entry.getValue();
                if (queue.isEmpty()) {
                    zwf.this.f.remove(entry.getKey());
                } else {
                    size2 += queue.size();
                    while (true) {
                        zvv zvvVar = (zvv) queue.peek();
                        if (zvvVar == null) {
                            break;
                        }
                        zwh.a aVar = zwf.this.e.get(zvvVar);
                        long j = aVar == null ? -1L : aVar.f54679c - (jC - nanos);
                        if (j < 0) {
                            if (aVar != null) {
                                zwf.this.e.remove(zvvVar, aVar);
                                zwf.d.trace("Mark-And-Sweep removes {}", zvvVar);
                            } else {
                                i++;
                            }
                            zwf.this.d(queue, zvvVar);
                        } else {
                            if (!zwf.d.isTraceEnabled()) {
                                break;
                            }
                            zwf.d.trace("Time left {}ms", Long.valueOf(TimeUnit.NANOSECONDS.toMillis(j)));
                            break;
                        }
                    }
                }
            }
            zwf.d.debug("Sweep run took {}ms", Long.valueOf(TimeUnit.NANOSECONDS.toMillis(ClockUtil.c() - jC)));
            if (i > 0) {
                zwf.d.warn("{} exchanges missing", Integer.valueOf(i));
            }
            int i2 = size - size2;
            if (Math.abs(this.f54672a) > 1000 && Math.abs(i2) > 1000) {
                zwf.d.info("Map size {} differs from queues size {}!", Integer.valueOf(size), Integer.valueOf(size2));
            }
            this.f54672a = i2;
        }
    }
}
