package com.google.protobuf;

import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.GeneratedMessage.f;
import com.google.protobuf.s0;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class b1<MType extends GeneratedMessage, BType extends GeneratedMessage.f, IType extends s0> implements GeneratedMessage.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GeneratedMessage.g f9606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<MType> f9607b;
    public boolean c;
    public List<g1<MType, BType, IType>> d;
    public boolean e;
    public b<MType, BType, IType> f;
    public a<MType, BType, IType> g;
    public c<MType, BType, IType> h;

    public static class a<MType extends GeneratedMessage, BType extends GeneratedMessage.f, IType extends s0> extends AbstractList<BType> implements List<BType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b1<MType, BType, IType> f9608a;

        public a(b1<MType, BType, IType> b1Var) {
            this.f9608a = b1Var;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BType get(int i) {
            return (BType) this.f9608a.l(i);
        }

        public void f() {
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f9608a.n();
        }
    }

    public static class b<MType extends GeneratedMessage, BType extends GeneratedMessage.f, IType extends s0> extends AbstractList<MType> implements List<MType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b1<MType, BType, IType> f9609a;

        public b(b1<MType, BType, IType> b1Var) {
            this.f9609a = b1Var;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public MType get(int i) {
            return (MType) this.f9609a.o(i);
        }

        public void f() {
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f9609a.n();
        }
    }

    public static class c<MType extends GeneratedMessage, BType extends GeneratedMessage.f, IType extends s0> extends AbstractList<IType> implements List<IType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b1<MType, BType, IType> f9610a;

        public c(b1<MType, BType, IType> b1Var) {
            this.f9610a = b1Var;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public IType get(int i) {
            return (IType) this.f9610a.r(i);
        }

        public void f() {
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f9610a.n();
        }
    }

    public b1(List<MType> list, boolean z, GeneratedMessage.g gVar, boolean z2) {
        this.f9607b = list;
        this.c = z;
        this.f9606a = gVar;
        this.e = z2;
    }

    @Override // com.google.protobuf.a.b
    public void a() {
        v();
    }

    public b1<MType, BType, IType> b(Iterable<? extends MType> iterable) {
        int size;
        Iterator<? extends MType> it = iterable.iterator();
        while (it.hasNext()) {
            d0.a(it.next());
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.isEmpty()) {
                return this;
            }
            size = collection.size();
        } else {
            size = -1;
        }
        k();
        if (size >= 0) {
            List<MType> list = this.f9607b;
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            }
        }
        Iterator<? extends MType> it2 = iterable.iterator();
        while (it2.hasNext()) {
            f(it2.next());
        }
        v();
        t();
        return this;
    }

    public BType c(int i, MType mtype) {
        k();
        j();
        g1<MType, BType, IType> g1Var = new g1<>(mtype, this, this.e);
        this.f9607b.add(i, null);
        this.d.add(i, g1Var);
        v();
        t();
        return (BType) g1Var.e();
    }

    public BType d(MType mtype) {
        k();
        j();
        g1<MType, BType, IType> g1Var = new g1<>(mtype, this, this.e);
        this.f9607b.add(null);
        this.d.add(g1Var);
        v();
        t();
        return (BType) g1Var.e();
    }

    public b1<MType, BType, IType> e(int i, MType mtype) {
        d0.a(mtype);
        k();
        this.f9607b.add(i, mtype);
        List<g1<MType, BType, IType>> list = this.d;
        if (list != null) {
            list.add(i, null);
        }
        v();
        t();
        return this;
    }

    public b1<MType, BType, IType> f(MType mtype) {
        d0.a(mtype);
        k();
        this.f9607b.add(mtype);
        List<g1<MType, BType, IType>> list = this.d;
        if (list != null) {
            list.add(null);
        }
        v();
        t();
        return this;
    }

    public List<MType> g() {
        this.e = true;
        boolean z = this.c;
        if (!z && this.d == null) {
            return this.f9607b;
        }
        if (!z) {
            for (int i = 0; i < this.f9607b.size(); i++) {
                MType mtype = this.f9607b.get(i);
                g1<MType, BType, IType> g1Var = this.d.get(i);
                if (g1Var == null || g1Var.b() == mtype) {
                }
            }
            return this.f9607b;
        }
        k();
        for (int i2 = 0; i2 < this.f9607b.size(); i2++) {
            this.f9607b.set(i2, (MType) p(i2, true));
        }
        List<MType> listUnmodifiableList = Collections.unmodifiableList(this.f9607b);
        this.f9607b = listUnmodifiableList;
        this.c = false;
        return listUnmodifiableList;
    }

    public void h() {
        this.f9607b = Collections.emptyList();
        this.c = false;
        List<g1<MType, BType, IType>> list = this.d;
        if (list != null) {
            for (g1<MType, BType, IType> g1Var : list) {
                if (g1Var != null) {
                    g1Var.d();
                }
            }
            this.d = null;
        }
        v();
        t();
    }

    public void i() {
        this.f9606a = null;
    }

    public final void j() {
        if (this.d == null) {
            this.d = new ArrayList(this.f9607b.size());
            for (int i = 0; i < this.f9607b.size(); i++) {
                this.d.add(null);
            }
        }
    }

    public final void k() {
        if (this.c) {
            return;
        }
        this.f9607b = new ArrayList(this.f9607b);
        this.c = true;
    }

    public BType l(int i) {
        j();
        g1<MType, BType, IType> g1Var = this.d.get(i);
        if (g1Var == null) {
            g1<MType, BType, IType> g1Var2 = new g1<>(this.f9607b.get(i), this, this.e);
            this.d.set(i, g1Var2);
            g1Var = g1Var2;
        }
        return (BType) g1Var.e();
    }

    public List<BType> m() {
        if (this.g == null) {
            this.g = new a<>(this);
        }
        return this.g;
    }

    public int n() {
        return this.f9607b.size();
    }

    public MType o(int i) {
        return (MType) p(i, false);
    }

    public final MType p(int i, boolean z) {
        g1<MType, BType, IType> g1Var;
        List<g1<MType, BType, IType>> list = this.d;
        if (list != null && (g1Var = list.get(i)) != null) {
            return z ? (MType) g1Var.b() : (MType) g1Var.f();
        }
        return this.f9607b.get(i);
    }

    public List<MType> q() {
        if (this.f == null) {
            this.f = new b<>(this);
        }
        return this.f;
    }

    public IType r(int i) {
        g1<MType, BType, IType> g1Var;
        List<g1<MType, BType, IType>> list = this.d;
        if (list != null && (g1Var = list.get(i)) != null) {
            return (IType) g1Var.g();
        }
        return this.f9607b.get(i);
    }

    public List<IType> s() {
        if (this.h == null) {
            this.h = new c<>(this);
        }
        return this.h;
    }

    public final void t() {
        b<MType, BType, IType> bVar = this.f;
        if (bVar != null) {
            bVar.f();
        }
        a<MType, BType, IType> aVar = this.g;
        if (aVar != null) {
            aVar.f();
        }
        c<MType, BType, IType> cVar = this.h;
        if (cVar != null) {
            cVar.f();
        }
    }

    public boolean u() {
        return this.f9607b.isEmpty();
    }

    public final void v() {
        GeneratedMessage.g gVar;
        if (!this.e || (gVar = this.f9606a) == null) {
            return;
        }
        gVar.a();
        this.e = false;
    }

    public void w(int i) {
        g1<MType, BType, IType> g1VarRemove;
        k();
        this.f9607b.remove(i);
        List<g1<MType, BType, IType>> list = this.d;
        if (list != null && (g1VarRemove = list.remove(i)) != null) {
            g1VarRemove.d();
        }
        v();
        t();
    }

    public b1<MType, BType, IType> x(int i, MType mtype) {
        g1<MType, BType, IType> g1Var;
        d0.a(mtype);
        k();
        this.f9607b.set(i, mtype);
        List<g1<MType, BType, IType>> list = this.d;
        if (list != null && (g1Var = list.set(i, null)) != null) {
            g1Var.d();
        }
        v();
        t();
        return this;
    }
}
