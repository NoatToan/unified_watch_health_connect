package com.google.common.collect;

import defpackage.ahd;
import defpackage.r7d;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public class b0<E> extends ImmutableMultiset<E> {
    public static final b0<Object> d = new b0<>(w.b());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient w<E> f9159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient int f9160b;
    public transient ImmutableSet<E> c;

    public final class b extends r7d<E> {
        public b() {
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return b0.this.contains(obj);
        }

        @Override // defpackage.r7d
        public E get(int i) {
            return b0.this.f9159a.i(i);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return b0.this.f9159a.C();
        }
    }

    public static class c implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object[] f9162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f9163b;

        public c(u<? extends Object> uVar) {
            int size = uVar.entrySet().size();
            this.f9162a = new Object[size];
            this.f9163b = new int[size];
            int i = 0;
            for (u.a<? extends Object> aVar : uVar.entrySet()) {
                this.f9162a[i] = aVar.getElement();
                this.f9163b[i] = aVar.getCount();
                i++;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Object readResolve() {
            ImmutableMultiset.b bVar = new ImmutableMultiset.b(this.f9162a.length);
            int i = 0;
            while (true) {
                Object[] objArr = this.f9162a;
                if (i >= objArr.length) {
                    return bVar.k();
                }
                bVar.j(objArr[i], this.f9163b[i]);
                i++;
            }
        }
    }

    public b0(w<E> wVar) {
        this.f9159a = wVar;
        long jK = 0;
        for (int i = 0; i < wVar.C(); i++) {
            jK += (long) wVar.k(i);
        }
        this.f9160b = ahd.j(jK);
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.u
    public int count(Object obj) {
        return this.f9159a.f(obj);
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public u.a<E> getEntry(int i) {
        return this.f9159a.g(i);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u
    public int size() {
        return this.f9160b;
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new c(this);
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.u
    public ImmutableSet<E> elementSet() {
        ImmutableSet<E> immutableSet = this.c;
        if (immutableSet != null) {
            return immutableSet;
        }
        b bVar = new b();
        this.c = bVar;
        return bVar;
    }
}
