package com.mapbox.bindgen;

import ab2.a;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class Cleaner {
    private CleanerImpl impl = new CleanerImpl();

    public static class CleanerImpl implements Runnable {
        private ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        private Set<Finalizer> references = Collections.newSetFromMap(new ConcurrentHashMap());

        public void register(Object obj, Runnable runnable) {
            this.references.add(new Finalizer(obj, this.referenceQueue, runnable));
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!this.references.isEmpty()) {
                try {
                    Reference<? extends Object> referenceRemove = this.referenceQueue.remove(60000L);
                    if (referenceRemove != null) {
                        Finalizer finalizer = (Finalizer) referenceRemove;
                        finalizer.finalizeResources();
                        finalizer.clear();
                        this.references.remove(finalizer);
                    }
                } catch (InterruptedException unused) {
                }
            }
        }

        public void start() {
            Thread thread = new Thread(this);
            thread.setDaemon(true);
            thread.setPriority(8);
            thread.start();
        }
    }

    public static class Finalizer extends PhantomReference<Object> {
        Runnable cleanable;

        public Finalizer(Object obj, ReferenceQueue<? super Object> referenceQueue, Runnable runnable) {
            super(obj, referenceQueue);
            this.cleanable = runnable;
        }

        public void finalizeResources() {
            this.cleanable.run();
        }
    }

    private Cleaner() {
    }

    public static Cleaner create() {
        Cleaner cleaner = new Cleaner();
        cleaner.impl.register(cleaner, new a(4));
        cleaner.impl.start();
        return cleaner;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$create$0() {
    }

    public void register(Object obj, Runnable runnable) {
        Objects.requireNonNull(obj, "obj");
        Objects.requireNonNull(runnable, "action");
        this.impl.register(obj, runnable);
    }
}
