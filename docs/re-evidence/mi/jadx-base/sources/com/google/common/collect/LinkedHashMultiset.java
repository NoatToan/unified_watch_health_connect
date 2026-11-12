package com.google.common.collect;

import defpackage.cpd;
import defpackage.w3h;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class LinkedHashMultiset<E> extends c<E> {
    public LinkedHashMultiset(int i) {
        super(i);
    }

    public static <E> LinkedHashMultiset<E> create() {
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
        return new w3h(i);
    }

    public static <E> LinkedHashMultiset<E> create(int i) {
        return new LinkedHashMultiset<>(i);
    }

    public static <E> LinkedHashMultiset<E> create(Iterable<? extends E> iterable) {
        LinkedHashMultiset<E> linkedHashMultisetCreate = create(v.h(iterable));
        cpd.a(linkedHashMultisetCreate, iterable);
        return linkedHashMultisetCreate;
    }
}
