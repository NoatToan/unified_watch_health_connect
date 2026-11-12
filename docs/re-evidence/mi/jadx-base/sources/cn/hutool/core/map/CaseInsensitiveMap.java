package cn.hutool.core.map;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class CaseInsensitiveMap<K, V> extends CustomKeyMap<K, V> {
    private static final long serialVersionUID = 4043263744224569870L;

    public CaseInsensitiveMap() {
        this(16);
    }

    @Override // cn.hutool.core.map.CustomKeyMap
    public Object customKey(Object obj) {
        return obj instanceof CharSequence ? obj.toString().toLowerCase() : obj;
    }

    public CaseInsensitiveMap(int i) {
        this(i, 0.75f);
    }

    public CaseInsensitiveMap(Map<? extends K, ? extends V> map) {
        this(0.75f, map);
    }

    public CaseInsensitiveMap(float f, Map<? extends K, ? extends V> map) {
        this(map.size(), f);
        putAll(map);
    }

    public CaseInsensitiveMap(int i, float f) {
        super(new HashMap(i, f));
    }
}
