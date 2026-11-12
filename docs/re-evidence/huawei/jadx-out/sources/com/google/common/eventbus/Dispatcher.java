package com.google.common.eventbus;

import com.google.common.base.Preconditions;
import defpackage.amw;
import defpackage.aoh;
import java.util.Iterator;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class Dispatcher {
    abstract void dispatch(Object obj, Iterator<aoh> it);

    Dispatcher() {
    }

    public static Dispatcher perThreadDispatchQueue() {
        return new c();
    }

    static Dispatcher legacyAsync() {
        return new b();
    }

    static Dispatcher immediate() {
        return a.d;
    }

    static final class c extends Dispatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadLocal<Queue<d>> f4528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ThreadLocal<Boolean> f4529b;

        private c() {
            this.f4528a = new ThreadLocal<Queue<d>>(this) { // from class: com.google.common.eventbus.Dispatcher.c.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // java.lang.ThreadLocal
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public Queue<d> initialValue() {
                    return amw.c();
                }
            };
            this.f4529b = new ThreadLocal<Boolean>(this) { // from class: com.google.common.eventbus.Dispatcher.c.3
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // java.lang.ThreadLocal
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Boolean initialValue() {
                    return false;
                }
            };
        }

        @Override // com.google.common.eventbus.Dispatcher
        void dispatch(Object obj, Iterator<aoh> it) {
            Preconditions.checkNotNull(obj);
            Preconditions.checkNotNull(it);
            Queue queue = (Queue) Objects.requireNonNull(this.f4528a.get());
            queue.offer(new d(obj, it));
            if (this.f4529b.get().booleanValue()) {
                return;
            }
            this.f4529b.set(true);
            while (true) {
                try {
                    d dVar = (d) queue.poll();
                    if (dVar == null) {
                        this.f4529b.remove();
                        this.f4528a.remove();
                        return;
                    } else {
                        while (dVar.f4530a.hasNext()) {
                            ((aoh) dVar.f4530a.next()).a(dVar.f4531b);
                        }
                    }
                } catch (Throwable th) {
                    this.f4529b.remove();
                    this.f4528a.remove();
                    throw th;
                }
            }
        }

        static final class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Iterator<aoh> f4530a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Object f4531b;

            private d(Object obj, Iterator<aoh> it) {
                this.f4531b = obj;
                this.f4530a = it;
            }
        }
    }

    static final class b extends Dispatcher {
        private final ConcurrentLinkedQueue<c> e;

        private b() {
            this.e = amw.d();
        }

        @Override // com.google.common.eventbus.Dispatcher
        void dispatch(Object obj, Iterator<aoh> it) {
            Preconditions.checkNotNull(obj);
            while (it.hasNext()) {
                this.e.add(new c(obj, it.next()));
            }
            while (true) {
                c cVarPoll = this.e.poll();
                if (cVarPoll == null) {
                    return;
                } else {
                    cVarPoll.f4527c.a(cVarPoll.e);
                }
            }
        }

        static final class c {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final aoh f4527c;
            private final Object e;

            private c(Object obj, aoh aohVar) {
                this.e = obj;
                this.f4527c = aohVar;
            }
        }
    }

    static final class a extends Dispatcher {
        private static final a d = new a();

        private a() {
        }

        @Override // com.google.common.eventbus.Dispatcher
        void dispatch(Object obj, Iterator<aoh> it) {
            Preconditions.checkNotNull(obj);
            while (it.hasNext()) {
                it.next().a(obj);
            }
        }
    }
}
