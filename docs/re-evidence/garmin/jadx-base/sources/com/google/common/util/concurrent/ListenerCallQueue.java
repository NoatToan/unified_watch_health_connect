package com.google.common.util.concurrent;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Queues;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
@J2ktIncompatible
final class ListenerCallQueue<L> {
    private static final LazyLogger logger = new LazyLogger(ListenerCallQueue.class);
    private final List<PerListenerQueue<L>> listeners = Collections.synchronizedList(new ArrayList());

    public interface Event<L> {
        void call(L l14);
    }

    public static final class PerListenerQueue<L> implements Runnable {
        final Executor executor;

        @GuardedBy("this")
        boolean isThreadScheduled;
        final L listener;

        @GuardedBy("this")
        final Queue<Event<L>> waitQueue = Queues.newArrayDeque();

        @GuardedBy("this")
        final Queue<Object> labelQueue = Queues.newArrayDeque();

        public PerListenerQueue(L l14, Executor executor) {
            this.listener = (L) Preconditions.checkNotNull(l14);
            this.executor = (Executor) Preconditions.checkNotNull(executor);
        }

        public synchronized void add(Event<L> event, Object obj) {
            this.waitQueue.add(event);
            this.labelQueue.add(obj);
        }

        public void dispatch() throws Exception {
            boolean z14;
            synchronized (this) {
                try {
                    if (this.isThreadScheduled) {
                        z14 = false;
                    } else {
                        z14 = true;
                        this.isThreadScheduled = true;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (z14) {
                try {
                    this.executor.execute(this);
                } catch (Exception e4) {
                    synchronized (this) {
                        this.isThreadScheduled = false;
                        ListenerCallQueue.logger.get().log(Level.SEVERE, "Exception while running callbacks for " + this.listener + " on " + this.executor, (Throwable) e4);
                        throw e4;
                    }
                }
            }
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x005e */
        /* JADX WARN: Code duplicated, block: B:28:0x0062  */
        /* JADX WARN: Code duplicated, block: B:38:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
        
            r2.call(r9.listener);
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
        
            com.google.common.util.concurrent.ListenerCallQueue.logger.get().log(java.util.logging.Level.SEVERE, "Exception while executing callback: " + r9.listener + org.apache.commons.lang3.StringUtils.SPACE + r3, (java.lang.Throwable) r2);
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() throws Throwable {
            boolean z14;
            Throwable th3;
            while (true) {
                boolean z15 = true;
                try {
                    synchronized (this) {
                        try {
                            Preconditions.checkState(this.isThreadScheduled);
                            Event<L> eventPoll = this.waitQueue.poll();
                            Object objPoll = this.labelQueue.poll();
                            if (eventPoll == null) {
                                this.isThreadScheduled = false;
                                try {
                                    return;
                                } catch (Throwable th4) {
                                    th3 = th4;
                                    z14 = false;
                                }
                            }
                        } catch (Throwable th5) {
                            z14 = true;
                            th3 = th5;
                        }
                        while (true) {
                        }
                    }
                    try {
                        throw th3;
                    } catch (Throwable th6) {
                        boolean z16 = z14;
                        th = th6;
                        z15 = z16;
                        if (z15) {
                            synchronized (this) {
                                this.isThreadScheduled = false;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    if (z15) {
                        synchronized (this) {
                            this.isThreadScheduled = false;
                        }
                    }
                    throw th;
                }
            }
        }
    }

    private void enqueueHelper(Event<L> event, Object obj) {
        Preconditions.checkNotNull(event, "event");
        Preconditions.checkNotNull(obj, Constants.ScionAnalytics.PARAM_LABEL);
        synchronized (this.listeners) {
            try {
                Iterator<PerListenerQueue<L>> it = this.listeners.iterator();
                while (it.hasNext()) {
                    it.next().add(event, obj);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void addListener(L l14, Executor executor) {
        Preconditions.checkNotNull(l14, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Preconditions.checkNotNull(executor, "executor");
        this.listeners.add(new PerListenerQueue<>(l14, executor));
    }

    public void dispatch() throws Exception {
        for (int i14 = 0; i14 < this.listeners.size(); i14++) {
            this.listeners.get(i14).dispatch();
        }
    }

    public void enqueue(Event<L> event) {
        enqueueHelper(event, event);
    }

    public void enqueue(Event<L> event, String str) {
        enqueueHelper(event, str);
    }
}
