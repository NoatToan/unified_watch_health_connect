package com.google.common.collect;

import defpackage.c6i;
import defpackage.d00;
import defpackage.ri2;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class EnumBiMap<K extends Enum<K>, V extends Enum<V>> extends d00<K, V> {
    private static final long serialVersionUID = 0;
    private transient Class<K> keyType;
    private transient Class<V> valueType;

    private EnumBiMap(Class<K> cls, Class<V> cls2) {
        super(new EnumMap(cls), new EnumMap(cls2));
        this.keyType = cls;
        this.valueType = cls2;
    }

    public static <K extends Enum<K>, V extends Enum<V>> EnumBiMap<K, V> create(Class<K> cls, Class<V> cls2) {
        return new EnumBiMap<>(cls, cls2);
    }

    public static <K extends Enum<K>> Class<K> inferKeyType(Map<K, ?> map) {
        if (map instanceof EnumBiMap) {
            return ((EnumBiMap) map).keyType();
        }
        if (map instanceof EnumHashBiMap) {
            return ((EnumHashBiMap) map).keyType();
        }
        c6i.d(!map.isEmpty());
        return map.keySet().iterator().next().getDeclaringClass();
    }

    private static <V extends Enum<V>> Class<V> inferValueType(Map<?, V> map) {
        if (map instanceof EnumBiMap) {
            return ((EnumBiMap) map).valueType;
        }
        c6i.d(!map.isEmpty());
        return map.values().iterator().next().getDeclaringClass();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.keyType = (Class) objectInputStream.readObject();
        this.valueType = (Class) objectInputStream.readObject();
        setDelegates(new EnumMap(this.keyType), new EnumMap(this.valueType));
        g0.b(this, objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.keyType);
        objectOutputStream.writeObject(this.valueType);
        g0.i(this, objectOutputStream);
    }

    @Override // defpackage.d00, defpackage.r1a, java.util.Map
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // defpackage.d00, defpackage.r1a, java.util.Map
    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // defpackage.d00, defpackage.r1a, java.util.Map
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.d00
    public /* bridge */ /* synthetic */ Object forcePut(Object obj, Object obj2) {
        return super.forcePut(obj, obj2);
    }

    @Override // defpackage.d00, defpackage.ri2
    public /* bridge */ /* synthetic */ ri2 inverse() {
        return super.inverse();
    }

    @Override // defpackage.d00, defpackage.r1a, java.util.Map
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    public Class<K> keyType() {
        return this.keyType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.d00, defpackage.r1a, java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // defpackage.d00, defpackage.r1a, java.util.Map
    public /* bridge */ /* synthetic */ void putAll(Map map) {
        super.putAll(map);
    }

    @Override // defpackage.d00, defpackage.r1a, java.util.Map
    public /* bridge */ /* synthetic */ Object remove(Object obj) {
        return super.remove(obj);
    }

    public Class<V> valueType() {
        return this.valueType;
    }

    @Override // defpackage.d00, defpackage.r1a, java.util.Map
    public /* bridge */ /* synthetic */ Set values() {
        return super.values();
    }

    public static <K extends Enum<K>, V extends Enum<V>> EnumBiMap<K, V> create(Map<K, V> map) {
        EnumBiMap<K, V> enumBiMapCreate = create(inferKeyType(map), inferValueType(map));
        enumBiMapCreate.putAll(map);
        return enumBiMapCreate;
    }

    @Override // defpackage.d00
    public K checkKey(K k2) {
        return (K) c6i.o(k2);
    }

    @Override // defpackage.d00
    public V checkValue(V v) {
        return (V) c6i.o(v);
    }
}
