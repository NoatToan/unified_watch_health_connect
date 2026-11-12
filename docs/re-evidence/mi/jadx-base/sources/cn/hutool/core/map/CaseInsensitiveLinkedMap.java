package cn.hutool.core.map;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class CaseInsensitiveLinkedMap<K, V> extends CustomKeyMap<K, V> {
    private static final long serialVersionUID = 4043263744224569870L;

    public CaseInsensitiveLinkedMap() {
        this(16);
    }

    @Override // cn.hutool.core.map.CustomKeyMap
    public Object customKey(Object obj) {
        return obj instanceof CharSequence ? obj.toString().toLowerCase() : obj;
    }

    public CaseInsensitiveLinkedMap(int i) {
        this(i, 0.75f);
    }

    public CaseInsensitiveLinkedMap(Map<? extends K, ? extends V> map) {
        this(0.75f, map);
    }

    public CaseInsensitiveLinkedMap(float f, Map<? extends K, ? extends V> map) {
        this(map.size(), f);
        putAll(map);
    }

    public CaseInsensitiveLinkedMap(int i, float f) {
        super(new LinkedHashMap(i, f));
    }
}
