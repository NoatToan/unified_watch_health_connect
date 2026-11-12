package cn.hutool.core.map.multi;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.map.MapWrapper;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbsCollValueMap<K, V, C extends Collection<V>> extends MapWrapper<K, C> {
    protected static final int DEFAULT_COLLCTION_INITIAL_CAPACITY = 3;
    private static final long serialVersionUID = 1;

    public AbsCollValueMap() {
        this(16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$putAllValues$1(final Object obj, Collection collection) {
        if (collection != null) {
            collection.forEach(new Consumer() { // from class: uz
                @Override // java.util.function.Consumer
                public final void accept(Object obj2) {
                    this.f36293a.lambda$null$0(obj, obj2);
                }
            });
        }
    }

    public abstract C createCollection();

    public V get(K k2, int i) {
        return (V) CollUtil.e((Collection) get(k2), i);
    }

    public void putAllValues(Map<? extends K, ? extends Collection<V>> map) {
        if (map != null) {
            map.forEach(new BiConsumer() { // from class: vz
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    this.f37377a.lambda$putAllValues$1(obj, (Collection) obj2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: putValue, reason: merged with bridge method [inline-methods] */
    public void lambda$null$0(K k2, V v) {
        Collection collectionCreateCollection = (Collection) get(k2);
        if (collectionCreateCollection == null) {
            collectionCreateCollection = createCollection();
            put(k2, collectionCreateCollection);
        }
        collectionCreateCollection.add(v);
    }

    public AbsCollValueMap(int i) {
        this(i, 0.75f);
    }

    public AbsCollValueMap(Map<? extends K, C> map) {
        this(0.75f, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbsCollValueMap(float f, Map<? extends K, C> map) {
        this(map.size(), f);
        putAll(map);
    }

    public AbsCollValueMap(int i, float f) {
        super(new HashMap(i, f));
    }
}
