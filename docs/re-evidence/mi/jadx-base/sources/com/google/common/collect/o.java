package com.google.common.collect;

import defpackage.epd;
import defpackage.i1a;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public abstract class o<E> extends i1a<E> implements u<E> {
    @Override // com.google.common.collect.u
    public int add(E e, int i) {
        return f().add(e, i);
    }

    @Override // com.google.common.collect.u
    public int count(Object obj) {
        return f().count(obj);
    }

    public abstract Set<u.a<E>> entrySet();

    @Override // java.util.Collection, com.google.common.collect.u
    public boolean equals(Object obj) {
        return obj == this || f().equals(obj);
    }

    public abstract u<E> f();

    @Override // java.util.Collection, com.google.common.collect.u
    public int hashCode() {
        return f().hashCode();
    }

    @Override // com.google.common.collect.u
    public int remove(Object obj, int i) {
        return f().remove(obj, i);
    }

    @Override // com.google.common.collect.u
    public int setCount(E e, int i) {
        return f().setCount(e, i);
    }

    @Override // defpackage.i1a
    public boolean standardAddAll(Collection<? extends E> collection) {
        return v.c(this, collection);
    }

    @Override // defpackage.i1a
    public void standardClear() {
        epd.d(entrySet().iterator());
    }

    @Override // defpackage.i1a
    public boolean standardContains(Object obj) {
        return count(obj) > 0;
    }

    @Override // defpackage.i1a
    public boolean standardRemove(Object obj) {
        return remove(obj, 1) > 0;
    }

    @Override // defpackage.i1a
    public boolean standardRemoveAll(Collection<?> collection) {
        return v.j(this, collection);
    }

    @Override // defpackage.i1a
    public boolean standardRetainAll(Collection<?> collection) {
        return v.k(this, collection);
    }

    @Override // defpackage.i1a
    public String standardToString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.u
    public boolean setCount(E e, int i, int i2) {
        return f().setCount(e, i, i2);
    }
}
