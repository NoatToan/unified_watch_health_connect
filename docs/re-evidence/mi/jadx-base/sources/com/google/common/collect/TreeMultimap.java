package com.google.common.collect;

import defpackage.c6i;
import defpackage.ich;
import defpackage.nag;
import defpackage.u10;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes5.dex */
public class TreeMultimap<K, V> extends u10<K, V> {
    private static final long serialVersionUID = 0;
    private transient Comparator<? super K> keyComparator;
    private transient Comparator<? super V> valueComparator;

    public TreeMultimap(Comparator<? super K> comparator, Comparator<? super V> comparator2) {
        super(new TreeMap(comparator));
        this.keyComparator = comparator;
        this.valueComparator = comparator2;
    }

    public static <K extends Comparable, V extends Comparable> TreeMultimap<K, V> create() {
        return new TreeMultimap<>(ich.e(), ich.e());
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.keyComparator = (Comparator) c6i.o((Comparator) objectInputStream.readObject());
        this.valueComparator = (Comparator) c6i.o((Comparator) objectInputStream.readObject());
        setMap(new TreeMap(this.keyComparator));
        g0.d(this, objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(keyComparator());
        objectOutputStream.writeObject(valueComparator());
        g0.j(this, objectOutputStream);
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

    @Override // com.google.common.collect.b, com.google.common.collect.d
    public Map<K, Collection<V>> createAsMap() {
        return createMaybeNavigableAsMap();
    }

    @Override // com.google.common.collect.g, com.google.common.collect.b, com.google.common.collect.d, defpackage.nag
    public /* bridge */ /* synthetic */ Set entries() {
        return super.entries();
    }

    @Override // com.google.common.collect.g, com.google.common.collect.d
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.d
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.d, defpackage.nag
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Deprecated
    public Comparator<? super K> keyComparator() {
        return this.keyComparator;
    }

    @Override // com.google.common.collect.d
    public /* bridge */ /* synthetic */ u keys() {
        return super.keys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.g, com.google.common.collect.b, com.google.common.collect.d, defpackage.nag
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

    @Override // com.google.common.collect.i, com.google.common.collect.g, com.google.common.collect.b, defpackage.nag
    public /* bridge */ /* synthetic */ SortedSet removeAll(Object obj) {
        return super.removeAll(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.i, com.google.common.collect.g, com.google.common.collect.b, com.google.common.collect.d
    public /* bridge */ /* synthetic */ SortedSet replaceValues(Object obj, Iterable iterable) {
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

    public Comparator<? super V> valueComparator() {
        return this.valueComparator;
    }

    @Override // com.google.common.collect.i, com.google.common.collect.b, com.google.common.collect.d, defpackage.nag
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    public static <K, V> TreeMultimap<K, V> create(Comparator<? super K> comparator, Comparator<? super V> comparator2) {
        return new TreeMultimap<>((Comparator) c6i.o(comparator), (Comparator) c6i.o(comparator2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.d
    public /* bridge */ /* synthetic */ boolean putAll(Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    public static <K extends Comparable, V extends Comparable> TreeMultimap<K, V> create(nag<? extends K, ? extends V> nagVar) {
        return new TreeMultimap<>(ich.e(), ich.e(), nagVar);
    }

    @Override // defpackage.u10, com.google.common.collect.i, com.google.common.collect.g, com.google.common.collect.d, defpackage.nag
    public NavigableMap<K, Collection<V>> asMap() {
        return (NavigableMap) super.asMap();
    }

    @Override // com.google.common.collect.i, com.google.common.collect.g, com.google.common.collect.b
    public SortedSet<V> createCollection() {
        return new TreeSet(this.valueComparator);
    }

    @Override // defpackage.u10, com.google.common.collect.d, defpackage.nag
    public NavigableSet<K> keySet() {
        return (NavigableSet) super.keySet();
    }

    private TreeMultimap(Comparator<? super K> comparator, Comparator<? super V> comparator2, nag<? extends K, ? extends V> nagVar) {
        this(comparator, comparator2);
        putAll(nagVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.b
    public Collection<V> createCollection(K k2) {
        if (k2 == 0) {
            keyComparator().compare(k2, k2);
        }
        return super.createCollection(k2);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.g, com.google.common.collect.b, defpackage.nag
    public NavigableSet<V> get(K k2) {
        return (NavigableSet) super.get((Object) k2);
    }
}
