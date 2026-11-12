package cn.hutool.core.map;

import defpackage.tt3;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class CamelCaseLinkedMap<K, V> extends CustomKeyMap<K, V> {
    private static final long serialVersionUID = 4043263744224569870L;

    public CamelCaseLinkedMap() {
        this(16);
    }

    @Override // cn.hutool.core.map.CustomKeyMap
    public Object customKey(Object obj) {
        return obj instanceof CharSequence ? tt3.o0(obj.toString()) : obj;
    }

    public CamelCaseLinkedMap(int i) {
        this(i, 0.75f);
    }

    public CamelCaseLinkedMap(Map<? extends K, ? extends V> map) {
        this(0.75f, map);
    }

    public CamelCaseLinkedMap(float f, Map<? extends K, ? extends V> map) {
        this(map.size(), f);
        putAll(map);
    }

    public CamelCaseLinkedMap(int i, float f) {
        super(new LinkedHashMap(i, f));
    }
}
