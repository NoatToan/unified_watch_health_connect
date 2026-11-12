package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import defpackage.amw;
import defpackage.aqy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
final class ListenerCallQueue<L> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final aqy f4701b = new aqy(ListenerCallQueue.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<e<L>> f4702a = Collections.synchronizedList(new ArrayList());

    interface Event<L> {
        void call(L l);
    }

    ListenerCallQueue() {
    }

    public void d(L l, Executor executor) {
        Preconditions.checkNotNull(l, "listener");
        Preconditions.checkNotNull(executor, "executor");
        this.f4702a.add(new e<>(l, executor));
    }

    public void b(Event<L> event) {
        b(event, event);
    }

    private void b(Event<L> event, Object obj) {
        Preconditions.checkNotNull(event, "event");
        Preconditions.checkNotNull(obj, "label");
        synchronized (this.f4702a) {
            Iterator<e<L>> it = this.f4702a.iterator();
            while (it.hasNext()) {
                it.next().a(event, obj);
            }
        }
    }

    public void c() throws Exception {
        for (int i = 0; i < this.f4702a.size(); i++) {
            this.f4702a.get(i).d();
        }
    }

    static final class e<L> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f4703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final L f4704b;
        final Executor e;
        final Queue<Event<L>> d = amw.c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Queue<Object> f4705c = amw.c();

        e(L l, Executor executor) {
            this.f4704b = (L) Preconditions.checkNotNull(l);
            this.e = (Executor) Preconditions.checkNotNull(executor);
        }

        void a(Event<L> event, Object obj) {
            synchronized (this) {
                this.d.add(event);
                this.f4705c.add(obj);
            }
        }

        void d() throws Exception {
            boolean z;
            synchronized (this) {
                if (this.f4703a) {
                    z = false;
                } else {
                    z = true;
                    this.f4703a = true;
                }
            }
            if (z) {
                try {
                    this.e.execute(this);
                } catch (Exception e) {
                    synchronized (this) {
                        this.f4703a = false;
                        ListenerCallQueue.f4701b.b().log(Level.SEVERE, "Exception while running callbacks for " + this.f4704b + " on " + this.e, (Throwable) e);
                        throw e;
                    }
                }
            }
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x005b */
        /* JADX WARN: Code duplicated, block: B:27:0x0060  */
        /* JADX WARN: Code duplicated, block: B:37:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
        
            r2.call(r9.f4704b);
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        
            com.google.common.util.concurrent.ListenerCallQueue.f4701b.b().log(java.util.logging.Level.SEVERE, "Exception while executing callback: " + r9.f4704b + " " + r3, (java.lang.Throwable) r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
        
            r8 = r2;
            r2 = r0;
            r0 = r8;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() throws Throwable {
            boolean z;
            Throwable th;
            while (true) {
                boolean z2 = true;
                try {
                    synchronized (this) {
                        try {
                            Preconditions.checkState(this.f4703a);
                            Event<L> eventPoll = this.d.poll();
                            Object objPoll = this.f4705c.poll();
                            if (eventPoll == null) {
                                this.f4703a = false;
                                try {
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    z = false;
                                }
                            }
                        } catch (Throwable th3) {
                            z = true;
                            th = th3;
                        }
                        while (true) {
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (z2) {
                        synchronized (this) {
                            this.f4703a = false;
                        }
                    }
                    throw th;
                }
                throw th;
            }
        }
    }
}
