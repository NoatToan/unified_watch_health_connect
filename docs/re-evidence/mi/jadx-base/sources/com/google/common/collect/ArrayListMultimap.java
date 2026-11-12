package com.google.common.collect;

import defpackage.d0i;
import defpackage.d44;
import defpackage.lj1;
import defpackage.nag;
import defpackage.x84;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class ArrayListMultimap<K, V> extends lj1<K, V> {
    private static final int DEFAULT_VALUES_PER_KEY = 3;
    private static final long serialVersionUID = 0;
    transient int expectedValuesPerKey;

    private ArrayListMultimap() {
        this(12, 3);
    }

    public static <K, V> ArrayListMultimap<K, V> create() {
        return new ArrayListMultimap<>();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.expectedValuesPerKey = 3;
        int iH = g0.h(objectInputStream);
        setMap(x84.y());
        g0.e(this, objectInputStream, iH);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        g0.j(this, objectOutputStream);
    }

    @Override // com.google.common.collect.a, com.google.common.collect.d, defpackage.nag
    public /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.b, defpackage.nag
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.d, defpackage.nag
    public /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // com.google.common.collect.b, defpackage.nag
    public /* bridge */ /* synthetic */ boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // com.google.common.collect.d
    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.b, com.google.common.collect.d, defpackage.nag
    public /* bridge */ /* synthetic */ Collection entries() {
        return super.entries();
    }

    @Override // com.google.common.collect.a, com.google.common.collect.d
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.a, com.google.common.collect.b, defpackage.nag
    public /* bridge */ /* synthetic */ List get(Object obj) {
        return super.get(obj);
    }

    @Override // com.google.common.collect.d
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.d, defpackage.nag
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.d, defpackage.nag
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.d
    public /* bridge */ /* synthetic */ u keys() {
        return super.keys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.a, com.google.common.collect.b, com.google.common.collect.d, defpackage.nag
    public /* bridge */ /* synthetic */ boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // com.google.common.collect.d
    public /* bridge */ /* synthetic */ boolean putAll(nag nagVar) {
        return super.putAll(nagVar);
    }

    @Override // com.google.common.collect.d, defpackage.nag
    public /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // com.google.common.collect.a, com.google.common.collect.b, defpackage.nag
    public /* bridge */ /* synthetic */ List removeAll(Object obj) {
        return super.removeAll(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.a, com.google.common.collect.b, com.google.common.collect.d
    public /* bridge */ /* synthetic */ List replaceValues(Object obj, Iterable iterable) {
        return super.replaceValues(obj, iterable);
    }

    @Override // com.google.common.collect.b, defpackage.nag
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.d
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Deprecated
    public void trimToSize() {
        Iterator<Collection<V>> it = backingMap().values().iterator();
        while (it.hasNext()) {
            ((ArrayList) it.next()).trimToSize();
        }
    }

    @Override // com.google.common.collect.b, com.google.common.collect.d, defpackage.nag
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    private ArrayListMultimap(int i, int i2) {
        super(d0i.c(i));
        d44.b(i2, "expectedValuesPerKey");
        this.expectedValuesPerKey = i2;
    }

    public static <K, V> ArrayListMultimap<K, V> create(int i, int i2) {
        return new ArrayListMultimap<>(i, i2);
    }

    @Override // com.google.common.collect.a, com.google.common.collect.b
    public List<V> createCollection() {
        return new ArrayList(this.expectedValuesPerKey);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.d
    public /* bridge */ /* synthetic */ boolean putAll(Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    public static <K, V> ArrayListMultimap<K, V> create(nag<? extends K, ? extends V> nagVar) {
        return new ArrayListMultimap<>(nagVar);
    }

    private ArrayListMultimap(nag<? extends K, ? extends V> nagVar) {
        this(nagVar.keySet().size(), nagVar instanceof ArrayListMultimap ? ((ArrayListMultimap) nagVar).expectedValuesPerKey : 3);
        putAll(nagVar);
    }
}
