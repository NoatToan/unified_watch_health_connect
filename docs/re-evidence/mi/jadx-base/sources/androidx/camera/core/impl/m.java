package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.annotation.RequiresApi;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class m extends n implements l {
    public static final Config.OptionPriority C = Config.OptionPriority.OPTIONAL;

    public m(TreeMap<Config.a<?>, Map<Config.OptionPriority, Object>> treeMap) {
        super(treeMap);
    }

    public static m O() {
        return new m(new TreeMap(n.A));
    }

    public static m P(Config config) {
        TreeMap treeMap = new TreeMap(n.A);
        for (Config.a<?> aVar : config.h()) {
            Set<Config.OptionPriority> setC = config.c(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (Config.OptionPriority optionPriority : setC) {
                arrayMap.put(optionPriority, config.g(aVar, optionPriority));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new m(treeMap);
    }

    public <ValueT> ValueT Q(Config.a<ValueT> aVar) {
        return (ValueT) this.z.remove(aVar);
    }

    @Override // androidx.camera.core.impl.l
    public <ValueT> void o(Config.a<ValueT> aVar, Config.OptionPriority optionPriority, ValueT valuet) {
        Map<Config.OptionPriority, Object> map = this.z.get(aVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.z.put(aVar, arrayMap);
            arrayMap.put(optionPriority, valuet);
            return;
        }
        Config.OptionPriority optionPriority2 = (Config.OptionPriority) Collections.min(map.keySet());
        if (Objects.equals(map.get(optionPriority2), valuet) || !Config.D(optionPriority2, optionPriority)) {
            map.put(optionPriority, valuet);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + aVar.c() + ", existing value (" + optionPriority2 + ")=" + map.get(optionPriority2) + ", conflicting (" + optionPriority + ")=" + valuet);
    }

    @Override // androidx.camera.core.impl.l
    public <ValueT> void z(Config.a<ValueT> aVar, ValueT valuet) {
        o(aVar, C, valuet);
    }
}
