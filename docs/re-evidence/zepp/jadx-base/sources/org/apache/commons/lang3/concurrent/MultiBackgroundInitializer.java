package org.apache.commons.lang3.concurrent;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.apache.commons.lang3.Validate;

/* JADX INFO: loaded from: classes23.dex */
public class MultiBackgroundInitializer extends BackgroundInitializer<MultiBackgroundInitializerResults> {
    private final Map<String, BackgroundInitializer<?>> d;

    public static class MultiBackgroundInitializerResults {
        private final Map<String, BackgroundInitializer<?>> a;
        private final Map<String, Object> b;
        private final Map<String, ConcurrentException> c;

        private BackgroundInitializer<?> a(String str) {
            BackgroundInitializer<?> backgroundInitializer = this.a.get(str);
            if (backgroundInitializer != null) {
                return backgroundInitializer;
            }
            throw new NoSuchElementException("No child initializer with name " + str);
        }

        public ConcurrentException getException(String str) {
            a(str);
            return this.c.get(str);
        }

        public BackgroundInitializer<?> getInitializer(String str) {
            return a(str);
        }

        public Object getResultObject(String str) {
            a(str);
            return this.b.get(str);
        }

        public Set<String> initializerNames() {
            return Collections.unmodifiableSet(this.a.keySet());
        }

        public boolean isException(String str) {
            a(str);
            return this.c.containsKey(str);
        }

        public boolean isSuccessful() {
            return this.c.isEmpty();
        }

        private MultiBackgroundInitializerResults(Map<String, BackgroundInitializer<?>> map, Map<String, Object> map2, Map<String, ConcurrentException> map3) {
            this.a = map;
            this.b = map2;
            this.c = map3;
        }
    }

    public MultiBackgroundInitializer() {
        this.d = new HashMap();
    }

    public void addInitializer(String str, BackgroundInitializer<?> backgroundInitializer) {
        Validate.isTrue(str != null, "Name of child initializer must not be null!", new Object[0]);
        Validate.isTrue(backgroundInitializer != null, "Child initializer must not be null!", new Object[0]);
        synchronized (this) {
            if (isStarted()) {
                throw new IllegalStateException("addInitializer() must not be called after start()!");
            }
            this.d.put(str, backgroundInitializer);
        }
    }

    @Override // org.apache.commons.lang3.concurrent.BackgroundInitializer
    public int getTaskCount() {
        Iterator<BackgroundInitializer<?>> it2 = this.d.values().iterator();
        int taskCount = 1;
        while (it2.hasNext()) {
            taskCount += it2.next().getTaskCount();
        }
        return taskCount;
    }

    @Override // org.apache.commons.lang3.concurrent.BackgroundInitializer
    public MultiBackgroundInitializerResults initialize() throws Exception {
        HashMap map;
        synchronized (this) {
            map = new HashMap(this.d);
        }
        ExecutorService activeExecutor = getActiveExecutor();
        for (BackgroundInitializer backgroundInitializer : map.values()) {
            if (backgroundInitializer.getExternalExecutor() == null) {
                backgroundInitializer.setExternalExecutor(activeExecutor);
            }
            backgroundInitializer.start();
        }
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            try {
                map2.put(entry.getKey(), ((BackgroundInitializer) entry.getValue()).get());
            } catch (ConcurrentException e) {
                map3.put(entry.getKey(), e);
            }
        }
        return new MultiBackgroundInitializerResults(map, map2, map3);
    }

    public MultiBackgroundInitializer(ExecutorService executorService) {
        super(executorService);
        this.d = new HashMap();
    }
}
