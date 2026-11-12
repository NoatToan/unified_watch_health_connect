package com.google.common.collect;

import defpackage.cpd;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class HashMultiset<E> extends c<E> {
    private static final long serialVersionUID = 0;

    public HashMultiset(int i) {
        super(i);
    }

    public static <E> HashMultiset<E> create() {
        return create(3);
    }

    @Override // com.google.common.collect.e, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u
    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.u
    public /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.e, com.google.common.collect.u
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.e, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.c
    public w<E> newBackingMap(int i) {
        return new w<>(i);
    }

    public static <E> HashMultiset<E> create(int i) {
        return new HashMultiset<>(i);
    }

    public static <E> HashMultiset<E> create(Iterable<? extends E> iterable) {
        HashMultiset<E> hashMultisetCreate = create(v.h(iterable));
        cpd.a(hashMultisetCreate, iterable);
        return hashMultisetCreate;
    }
}
