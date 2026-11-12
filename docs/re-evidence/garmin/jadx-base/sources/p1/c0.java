package p1;

import ch.qos.logback.core.joran.action.Action;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0007J\u0017\u0010\u0013\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u000fJ1\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00012\b\u0010\u0017\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001a\u0010\u000fJ\u001f\u0010\u001b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u001b\u0010\u000bJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u001fJ\r\u0010 \u001a\u00020\u0004¢\u0006\u0004\b \u0010\u001fJ\r\u0010!\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\u001fJ\r\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\u001fJ\r\u0010#\u001a\u00020\u0004¢\u0006\u0004\b#\u0010\u001fJ\r\u0010$\u001a\u00020\u0004¢\u0006\u0004\b$\u0010\u001fJ\u0019\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010+R \u0010-\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010+R\u0016\u0010#\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010+R\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010+R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010+R\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010+R\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010+¨\u00062"}, d2 = {"Lp1/c0;", "", "K", "V", "", "maxSize", "<init>", "(I)V", Action.KEY_ATTRIBUTE, "value", "safeSizeOf", "(Ljava/lang/Object;Ljava/lang/Object;)I", "", "resize", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "trimToSize", "remove", "", "evicted", "oldValue", "newValue", "entryRemoved", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "create", "sizeOf", "evictAll", "()V", "size", "()I", "hitCount", "missCount", "createCount", "putCount", "evictionCount", "", "snapshot", "()Ljava/util/Map;", "", "toString", "()Ljava/lang/String;", "I", "Lq1/c;", "map", "Lq1/c;", "Lq1/b;", "lock", "Lq1/b;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class c0<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final q1.b lock;
    private final q1.c<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public c0(int i14) {
        this.maxSize = i14;
        if (!(i14 > 0)) {
            vb.h.s("maxSize <= 0");
            throw null;
        }
        this.map = new q1.c<>(0, 0.75f);
        this.lock = new q1.b();
    }

    private final int safeSizeOf(K key, V value) {
        int iSizeOf = sizeOf(key, value);
        if (iSizeOf >= 0) {
            return iSizeOf;
        }
        throw new IllegalStateException("Negative size: " + key + '=' + value);
    }

    public V create(K key) {
        key.getClass();
        return null;
    }

    public final int createCount() {
        int i14;
        synchronized (this.lock) {
            i14 = this.createCount;
        }
        return i14;
    }

    public void entryRemoved(boolean evicted, K key, V oldValue, V newValue) {
        key.getClass();
        oldValue.getClass();
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i14;
        synchronized (this.lock) {
            i14 = this.evictionCount;
        }
        return i14;
    }

    public final V get(K key) {
        V vPut;
        key.getClass();
        synchronized (this.lock) {
            q1.c<K, V> cVar = this.map;
            cVar.getClass();
            V v14 = cVar.f142057a.get(key);
            if (v14 != null) {
                this.hitCount++;
                return v14;
            }
            this.missCount++;
            V vCreate = create(key);
            if (vCreate == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    q1.c<K, V> cVar2 = this.map;
                    cVar2.getClass();
                    vPut = cVar2.f142057a.put(key, vCreate);
                    if (vPut != null) {
                        q1.c<K, V> cVar3 = this.map;
                        cVar3.getClass();
                        cVar3.f142057a.put(key, vPut);
                    } else {
                        this.size += safeSizeOf(key, vCreate);
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (vPut != null) {
                entryRemoved(false, key, vCreate, vPut);
                return vPut;
            }
            trimToSize(this.maxSize);
            return vCreate;
        }
    }

    public final int hitCount() {
        int i14;
        synchronized (this.lock) {
            i14 = this.hitCount;
        }
        return i14;
    }

    public final int maxSize() {
        int i14;
        synchronized (this.lock) {
            i14 = this.maxSize;
        }
        return i14;
    }

    public final int missCount() {
        int i14;
        synchronized (this.lock) {
            i14 = this.missCount;
        }
        return i14;
    }

    public final V put(K key, V value) {
        V vPut;
        key.getClass();
        value.getClass();
        synchronized (this.lock) {
            try {
                this.putCount++;
                this.size += safeSizeOf(key, value);
                q1.c<K, V> cVar = this.map;
                cVar.getClass();
                vPut = cVar.f142057a.put(key, value);
                if (vPut != null) {
                    this.size -= safeSizeOf(key, vPut);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (vPut != null) {
            entryRemoved(false, key, vPut, value);
        }
        trimToSize(this.maxSize);
        return vPut;
    }

    public final int putCount() {
        int i14;
        synchronized (this.lock) {
            i14 = this.putCount;
        }
        return i14;
    }

    public final V remove(K key) {
        V vRemove;
        key.getClass();
        synchronized (this.lock) {
            try {
                q1.c<K, V> cVar = this.map;
                cVar.getClass();
                vRemove = cVar.f142057a.remove(key);
                if (vRemove != null) {
                    this.size -= safeSizeOf(key, vRemove);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (vRemove != null) {
            entryRemoved(false, key, vRemove, null);
        }
        return vRemove;
    }

    public void resize(int maxSize) {
        if (!(maxSize > 0)) {
            vb.h.s("maxSize <= 0");
            return;
        }
        synchronized (this.lock) {
            this.maxSize = maxSize;
            Unit unit = Unit.INSTANCE;
        }
        trimToSize(maxSize);
    }

    public final int size() {
        int i14;
        synchronized (this.lock) {
            i14 = this.size;
        }
        return i14;
    }

    public int sizeOf(K key, V value) {
        key.getClass();
        value.getClass();
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.lock) {
            Set<Map.Entry<K, V>> setEntrySet = this.map.f142057a.entrySet();
            setEntrySet.getClass();
            linkedHashMap = new LinkedHashMap(setEntrySet.size());
            Set<Map.Entry<K, V>> setEntrySet2 = this.map.f142057a.entrySet();
            setEntrySet2.getClass();
            Iterator<T> it = setEntrySet2.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i14 = this.hitCount;
                int i15 = this.missCount + i14;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i15 != 0 ? (i14 * 100) / i15 : 0) + "%]";
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void trimToSize(int maxSize) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.lock) {
                try {
                    if (this.size < 0 || (this.map.f142057a.isEmpty() && this.size != 0)) {
                        break;
                    }
                    if (this.size > maxSize && !this.map.f142057a.isEmpty()) {
                        Set<Map.Entry<K, V>> setEntrySet = this.map.f142057a.entrySet();
                        setEntrySet.getClass();
                        Map.Entry entry = (Map.Entry) p13.h0.c0(setEntrySet);
                        if (entry == null) {
                            return;
                        }
                        key = entry.getKey();
                        value = entry.getValue();
                        q1.c<K, V> cVar = this.map;
                        cVar.getClass();
                        key.getClass();
                        cVar.f142057a.remove(key);
                        this.size -= safeSizeOf(key, value);
                        this.evictionCount++;
                    }
                    return;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            entryRemoved(true, key, value, null);
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }
}
