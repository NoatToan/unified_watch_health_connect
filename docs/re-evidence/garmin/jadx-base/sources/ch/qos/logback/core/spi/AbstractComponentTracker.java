package ch.qos.logback.core.spi;

import am.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractComponentTracker<C> implements ComponentTracker<C> {
    private static final boolean ACCESS_ORDERED = true;
    public static final long LINGERING_TIMEOUT = 10000;
    public static final long WAIT_BETWEEN_SUCCESSIVE_REMOVAL_ITERATIONS = 1000;
    protected int maxComponents = Integer.MAX_VALUE;
    protected long timeout = ComponentTracker.DEFAULT_TIMEOUT;
    LinkedHashMap<String, Entry<C>> liveMap = new LinkedHashMap<>(32, 0.75f, true);
    LinkedHashMap<String, Entry<C>> lingerersMap = new LinkedHashMap<>(16, 0.75f, true);
    long lastCheck = 0;
    private RemovalPredicator<C> byExcedent = new RemovalPredicator<C>() { // from class: ch.qos.logback.core.spi.AbstractComponentTracker.1
        @Override // ch.qos.logback.core.spi.AbstractComponentTracker.RemovalPredicator
        public boolean isSlatedForRemoval(Entry<C> entry, long j8) {
            return AbstractComponentTracker.this.liveMap.size() > AbstractComponentTracker.this.maxComponents;
        }
    };
    private RemovalPredicator<C> byTimeout = new RemovalPredicator<C>() { // from class: ch.qos.logback.core.spi.AbstractComponentTracker.2
        @Override // ch.qos.logback.core.spi.AbstractComponentTracker.RemovalPredicator
        public boolean isSlatedForRemoval(Entry<C> entry, long j8) {
            return AbstractComponentTracker.this.isEntryStale(entry, j8);
        }
    };
    private RemovalPredicator<C> byLingering = new RemovalPredicator<C>() { // from class: ch.qos.logback.core.spi.AbstractComponentTracker.3
        @Override // ch.qos.logback.core.spi.AbstractComponentTracker.RemovalPredicator
        public boolean isSlatedForRemoval(Entry<C> entry, long j8) {
            return AbstractComponentTracker.this.isEntryDoneLingering(entry, j8);
        }
    };

    public static class Entry<C> {
        C component;
        String key;
        long timestamp;

        public Entry(String str, C c14, long j8) {
            this.key = str;
            this.component = c14;
            this.timestamp = j8;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Entry entry = (Entry) obj;
            String str = this.key;
            String str2 = entry.key;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            C c14 = this.component;
            C c15 = entry.component;
            if (c14 == null) {
                if (c15 != null) {
                    return false;
                }
            } else if (!c14.equals(c15)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.key.hashCode();
        }

        public void setTimestamp(long j8) {
            this.timestamp = j8;
        }

        public String toString() {
            StringBuilder sb3 = new StringBuilder("(");
            sb3.append(this.key);
            sb3.append(", ");
            return j.k(this.component, ")", sb3);
        }
    }

    public interface RemovalPredicator<C> {
        boolean isSlatedForRemoval(Entry<C> entry, long j8);
    }

    private void genericStaleComponentRemover(LinkedHashMap<String, Entry<C>> linkedHashMap, long j8, RemovalPredicator<C> removalPredicator) {
        Iterator<Map.Entry<String, Entry<C>>> it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Entry<C> value = it.next().getValue();
            if (!removalPredicator.isSlatedForRemoval(value, j8)) {
                return;
            }
            it.remove();
            processPriorToRemoval(value.component);
        }
    }

    private Entry<C> getFromEitherMap(String str) {
        Entry<C> entry = this.liveMap.get(str);
        return entry != null ? entry : this.lingerersMap.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isEntryDoneLingering(Entry<C> entry, long j8) {
        return entry.timestamp + LINGERING_TIMEOUT < j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isEntryStale(Entry<C> entry, long j8) {
        return isComponentStale(entry.component) || entry.timestamp + this.timeout < j8;
    }

    private boolean isTooSoonForRemovalIteration(long j8) {
        if (this.lastCheck + 1000 > j8) {
            return true;
        }
        this.lastCheck = j8;
        return false;
    }

    private void removeExcedentComponents() {
        genericStaleComponentRemover(this.liveMap, 0L, this.byExcedent);
    }

    private void removeStaleComponentsFromLingerersMap(long j8) {
        genericStaleComponentRemover(this.lingerersMap, j8, this.byLingering);
    }

    private void removeStaleComponentsFromMainMap(long j8) {
        genericStaleComponentRemover(this.liveMap, j8, this.byTimeout);
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public Collection<C> allComponents() {
        ArrayList arrayList = new ArrayList();
        Iterator<Entry<C>> it = this.liveMap.values().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().component);
        }
        Iterator<Entry<C>> it3 = this.lingerersMap.values().iterator();
        while (it3.hasNext()) {
            arrayList.add(it3.next().component);
        }
        return arrayList;
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public Set<String> allKeys() {
        HashSet hashSet = new HashSet(this.liveMap.keySet());
        hashSet.addAll(this.lingerersMap.keySet());
        return hashSet;
    }

    public abstract C buildComponent(String str);

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public void endOfLife(String str) {
        Entry<C> entryRemove = this.liveMap.remove(str);
        if (entryRemove == null) {
            return;
        }
        this.lingerersMap.put(str, entryRemove);
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public synchronized C find(String str) {
        Entry<C> fromEitherMap = getFromEitherMap(str);
        if (fromEitherMap == null) {
            return null;
        }
        return fromEitherMap.component;
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public int getComponentCount() {
        return this.lingerersMap.size() + this.liveMap.size();
    }

    public int getMaxComponents() {
        return this.maxComponents;
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public synchronized C getOrCreate(String str, long j8) {
        Entry<C> fromEitherMap;
        try {
            fromEitherMap = getFromEitherMap(str);
            if (fromEitherMap == null) {
                Entry<C> entry = new Entry<>(str, buildComponent(str), j8);
                this.liveMap.put(str, entry);
                fromEitherMap = entry;
            } else {
                fromEitherMap.setTimestamp(j8);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return fromEitherMap.component;
    }

    public long getTimeout() {
        return this.timeout;
    }

    public abstract boolean isComponentStale(C c14);

    public abstract void processPriorToRemoval(C c14);

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public synchronized void removeStaleComponents(long j8) {
        if (isTooSoonForRemovalIteration(j8)) {
            return;
        }
        removeExcedentComponents();
        removeStaleComponentsFromMainMap(j8);
        removeStaleComponentsFromLingerersMap(j8);
    }

    public void setMaxComponents(int i14) {
        this.maxComponents = i14;
    }

    public void setTimeout(long j8) {
        this.timeout = j8;
    }
}
