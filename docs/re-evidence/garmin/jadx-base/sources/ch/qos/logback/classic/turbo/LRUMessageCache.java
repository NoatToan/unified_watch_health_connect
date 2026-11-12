package ch.qos.logback.classic.turbo;

import java.util.LinkedHashMap;
import java.util.Map;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
class LRUMessageCache extends LinkedHashMap<String, Integer> {
    private static final long serialVersionUID = 1;
    final int cacheSize;

    public LRUMessageCache(int i14) {
        super((int) (i14 * 1.3333334f), 0.75f, true);
        if (i14 >= 1) {
            this.cacheSize = i14;
        } else {
            h.s("Cache size cannot be smaller than 1");
            throw null;
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public synchronized void clear() {
        super.clear();
    }

    public int getMessageCountAndThenIncrement(String str) {
        Integer numValueOf;
        if (str == null) {
            return 0;
        }
        synchronized (this) {
            try {
                Integer num = (Integer) super.get(str);
                numValueOf = num == null ? 0 : Integer.valueOf(num.intValue() + 1);
                super.put(str, numValueOf);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return numValueOf.intValue();
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<String, Integer> entry) {
        return size() > this.cacheSize;
    }
}
