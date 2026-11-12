package org.threeten.bp.zone;

import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ZoneRulesInitializer {
    public static final ZoneRulesInitializer DO_NOTHING = new a();
    private static final AtomicBoolean a = new AtomicBoolean(false);
    private static final AtomicReference<ZoneRulesInitializer> b = new AtomicReference<>();

    public static class a extends ZoneRulesInitializer {
        @Override // org.threeten.bp.zone.ZoneRulesInitializer
        public void initializeProviders() {
        }
    }

    public static class b extends ZoneRulesInitializer {
        @Override // org.threeten.bp.zone.ZoneRulesInitializer
        public void initializeProviders() {
            Iterator it2 = ServiceLoader.load(ZoneRulesProvider.class, ZoneRulesProvider.class.getClassLoader()).iterator();
            while (it2.hasNext()) {
                try {
                    ZoneRulesProvider.registerProvider((ZoneRulesProvider) it2.next());
                } catch (ServiceConfigurationError e) {
                    if (!(e.getCause() instanceof SecurityException)) {
                        throw e;
                    }
                }
            }
        }
    }

    public static void a() {
        if (a.getAndSet(true)) {
            throw new IllegalStateException("Already initialized");
        }
        AtomicReference<ZoneRulesInitializer> atomicReference = b;
        atomicReference.compareAndSet(null, new b());
        atomicReference.get().initializeProviders();
    }

    public static void setInitializer(ZoneRulesInitializer zoneRulesInitializer) {
        if (a.get()) {
            throw new IllegalStateException("Already initialized");
        }
        if (!b.compareAndSet(null, zoneRulesInitializer)) {
            throw new IllegalStateException("Initializer was already set, possibly with a default during initialization");
        }
    }

    public abstract void initializeProviders();
}
