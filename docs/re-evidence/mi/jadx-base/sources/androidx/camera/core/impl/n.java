package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.n;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class n implements Config {
    public static final Comparator<Config.a<?>> A;
    public static final n B;
    public final TreeMap<Config.a<?>, Map<Config.OptionPriority, Object>> z;

    static {
        Comparator<Config.a<?>> comparator = new Comparator() { // from class: dch
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.N((Config.a) obj, (Config.a) obj2);
            }
        };
        A = comparator;
        B = new n(new TreeMap(comparator));
    }

    public n(TreeMap<Config.a<?>, Map<Config.OptionPriority, Object>> treeMap) {
        this.z = treeMap;
    }

    public static n L() {
        return B;
    }

    public static n M(Config config) {
        if (n.class.equals(config.getClass())) {
            return (n) config;
        }
        TreeMap treeMap = new TreeMap(A);
        for (Config.a<?> aVar : config.h()) {
            Set<Config.OptionPriority> setC = config.c(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (Config.OptionPriority optionPriority : setC) {
                arrayMap.put(optionPriority, config.g(aVar, optionPriority));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new n(treeMap);
    }

    public static /* synthetic */ int N(Config.a aVar, Config.a aVar2) {
        return aVar.c().compareTo(aVar2.c());
    }

    @Override // androidx.camera.core.impl.Config
    public <ValueT> ValueT a(Config.a<ValueT> aVar) {
        Map<Config.OptionPriority, Object> map = this.z.get(aVar);
        if (map != null) {
            return (ValueT) map.get((Config.OptionPriority) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // androidx.camera.core.impl.Config
    public void b(String str, Config.b bVar) {
        for (Map.Entry<Config.a<?>, Map<Config.OptionPriority, Object>> entry : this.z.tailMap(Config.a.a(str, Void.class)).entrySet()) {
            if (!entry.getKey().c().startsWith(str) || !bVar.a(entry.getKey())) {
                return;
            }
        }
    }

    @Override // androidx.camera.core.impl.Config
    public Set<Config.OptionPriority> c(Config.a<?> aVar) {
        Map<Config.OptionPriority, Object> map = this.z.get(aVar);
        return map == null ? Collections.emptySet() : Collections.unmodifiableSet(map.keySet());
    }

    @Override // androidx.camera.core.impl.Config
    public <ValueT> ValueT d(Config.a<ValueT> aVar, ValueT valuet) {
        try {
            return (ValueT) a(aVar);
        } catch (IllegalArgumentException unused) {
            return valuet;
        }
    }

    @Override // androidx.camera.core.impl.Config
    public boolean f(Config.a<?> aVar) {
        return this.z.containsKey(aVar);
    }

    @Override // androidx.camera.core.impl.Config
    public <ValueT> ValueT g(Config.a<ValueT> aVar, Config.OptionPriority optionPriority) {
        Map<Config.OptionPriority, Object> map = this.z.get(aVar);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + aVar);
        }
        if (map.containsKey(optionPriority)) {
            return (ValueT) map.get(optionPriority);
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar + " with priority=" + optionPriority);
    }

    @Override // androidx.camera.core.impl.Config
    public Set<Config.a<?>> h() {
        return Collections.unmodifiableSet(this.z.keySet());
    }

    @Override // androidx.camera.core.impl.Config
    public Config.OptionPriority i(Config.a<?> aVar) {
        Map<Config.OptionPriority, Object> map = this.z.get(aVar);
        if (map != null) {
            return (Config.OptionPriority) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }
}
