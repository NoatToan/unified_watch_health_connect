package com.google.common.collect;

import defpackage.c6i;
import defpackage.d00;
import defpackage.ri2;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class EnumHashBiMap<K extends Enum<K>, V> extends d00<K, V> {
    private static final long serialVersionUID = 0;
    private transient Class<K> keyType;

    private EnumHashBiMap(Class<K> cls) {
        super(new EnumMap(cls), s.p(cls.getEnumConstants().length));
        this.keyType = cls;
    }

    public static <K extends Enum<K>, V> EnumHashBiMap<K, V> create(Class<K> cls) {
        return new EnumHashBiMap<>(cls);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.keyType = (Class) objectInputStream.readObject();
        setDelegates(new EnumMap(this.keyType), new HashMap((this.keyType.getEnumConstants().length * 3) / 2));
        g0.b(this, objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.keyType);
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

    @Override // defpackage.d00, defpackage.r1a, java.util.Map
    public /* bridge */ /* synthetic */ void putAll(Map map) {
        super.putAll(map);
    }

    @Override // defpackage.d00, defpackage.r1a, java.util.Map
    public /* bridge */ /* synthetic */ Object remove(Object obj) {
        return super.remove(obj);
    }

    @Override // defpackage.d00, defpackage.r1a, java.util.Map
    public /* bridge */ /* synthetic */ Set values() {
        return super.values();
    }

    public static <K extends Enum<K>, V> EnumHashBiMap<K, V> create(Map<K, ? extends V> map) {
        EnumHashBiMap<K, V> enumHashBiMapCreate = create(EnumBiMap.inferKeyType(map));
        enumHashBiMapCreate.putAll(map);
        return enumHashBiMapCreate;
    }

    @Override // defpackage.d00
    public K checkKey(K k2) {
        return (K) c6i.o(k2);
    }

    @Override // defpackage.d00
    public V forcePut(K k2, V v) {
        return (V) super.forcePut(k2, (Object) v);
    }

    @Override // defpackage.d00, defpackage.r1a, java.util.Map
    public V put(K k2, V v) {
        return (V) super.put(k2, (Object) v);
    }
}
