package cn.hutool.core.map;

import defpackage.tt3;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class CamelCaseMap<K, V> extends CustomKeyMap<K, V> {
    private static final long serialVersionUID = 4043263744224569870L;

    public CamelCaseMap() {
        this(16);
    }

    @Override // cn.hutool.core.map.CustomKeyMap
    public Object customKey(Object obj) {
        return obj instanceof CharSequence ? tt3.o0(obj.toString()) : obj;
    }

    public CamelCaseMap(int i) {
        this(i, 0.75f);
    }

    public CamelCaseMap(Map<? extends K, ? extends V> map) {
        this(0.75f, map);
    }

    public CamelCaseMap(float f, Map<? extends K, ? extends V> map) {
        this(map.size(), f);
        putAll(map);
    }

    public CamelCaseMap(int i, float f) {
        super(new HashMap(i, f));
    }
}
