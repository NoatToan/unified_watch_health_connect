package cn.hutool.core.map;

import java.util.Map;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public class FuncKeyMap<K, V> extends CustomKeyMap<K, V> {
    private static final long serialVersionUID = 1;
    private Function<Object, K> keyFunc;

    public FuncKeyMap(Map<K, V> map, Function<Object, K> function) {
        super(map);
    }

    @Override // cn.hutool.core.map.CustomKeyMap
    public Object customKey(Object obj) {
        Function<Object, K> function = this.keyFunc;
        return function != null ? function.apply(obj) : obj;
    }
}
