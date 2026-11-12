package com.google.common.eventbus;

import com.google.common.base.Preconditions;
import com.google.common.collect.Queues;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes3.dex */
abstract class a {

    public static final class b extends a {
        private static final b a = new b();

        private b() {
        }

        @Override // com.google.common.eventbus.a
        public void a(Object obj, Iterator<com.google.common.eventbus.b> it2) {
            Preconditions.checkNotNull(obj);
            while (it2.hasNext()) {
                it2.next().e(obj);
            }
        }
    }

    public static final class c extends a {
        private final ConcurrentLinkedQueue<C0207a> a;

        /* JADX INFO: renamed from: com.google.common.eventbus.a$c$a, reason: collision with other inner class name */
        public static final class C0207a {
            private final Object a;
            private final com.google.common.eventbus.b b;

            private C0207a(Object obj, com.google.common.eventbus.b bVar) {
                this.a = obj;
                this.b = bVar;
            }
        }

        private c() {
            this.a = Queues.newConcurrentLinkedQueue();
        }

        @Override // com.google.common.eventbus.a
        public void a(Object obj, Iterator<com.google.common.eventbus.b> it2) {
            Preconditions.checkNotNull(obj);
            while (it2.hasNext()) {
                this.a.add(new C0207a(obj, it2.next()));
            }
            while (true) {
                C0207a c0207aPoll = this.a.poll();
                if (c0207aPoll == null) {
                    return;
                } else {
                    c0207aPoll.b.e(c0207aPoll.a);
                }
            }
        }
    }

    public static final class d extends a {
        private final ThreadLocal<Queue<c>> a;
        private final ThreadLocal<Boolean> b;

        /* JADX INFO: renamed from: com.google.common.eventbus.a$d$a, reason: collision with other inner class name */
        public class C0208a extends ThreadLocal<Queue<c>> {
            public C0208a() {
            }

            @Override // java.lang.ThreadLocal
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Queue<c> initialValue() {
                return Queues.newArrayDeque();
            }
        }

        public class b extends ThreadLocal<Boolean> {
            public b() {
            }

            @Override // java.lang.ThreadLocal
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean initialValue() {
                return Boolean.FALSE;
            }
        }

        public static final class c {
            private final Object a;
            private final Iterator<com.google.common.eventbus.b> b;

            private c(Object obj, Iterator<com.google.common.eventbus.b> it2) {
                this.a = obj;
                this.b = it2;
            }
        }

        private d() {
            this.a = new C0208a();
            this.b = new b();
        }

        @Override // com.google.common.eventbus.a
        public void a(Object obj, Iterator<com.google.common.eventbus.b> it2) {
            Preconditions.checkNotNull(obj);
            Preconditions.checkNotNull(it2);
            Queue<c> queue = this.a.get();
            queue.offer(new c(obj, it2));
            if (this.b.get().booleanValue()) {
                return;
            }
            this.b.set(Boolean.TRUE);
            while (true) {
                try {
                    c cVarPoll = queue.poll();
                    if (cVarPoll == null) {
                        this.b.remove();
                        this.a.remove();
                        return;
                    } else {
                        while (cVarPoll.b.hasNext()) {
                            ((com.google.common.eventbus.b) cVarPoll.b.next()).e(cVarPoll.a);
                        }
                    }
                } catch (Throwable th) {
                    this.b.remove();
                    this.a.remove();
                    throw th;
                }
            }
        }
    }

    public static a b() {
        return b.a;
    }

    public static a c() {
        return new c();
    }

    public static a d() {
        return new d();
    }

    public abstract void a(Object obj, Iterator<com.google.common.eventbus.b> it2);
}
