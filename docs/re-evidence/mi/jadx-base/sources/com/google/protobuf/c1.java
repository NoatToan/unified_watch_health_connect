package com.google.protobuf;

import com.google.protobuf.a;
import com.google.protobuf.a.AbstractC0258a;
import com.google.protobuf.s0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class c1<MType extends a, BType extends a.AbstractC0258a, IType extends s0> implements a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.b f9612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<MType> f9613b;
    public boolean c;
    public List<h1<MType, BType, IType>> d;
    public boolean e;

    public c1(List<MType> list, boolean z, a.b bVar, boolean z2) {
        this.f9613b = list;
        this.c = z;
        this.f9612a = bVar;
        this.e = z2;
    }

    private void g() {
        if (this.c) {
            return;
        }
        this.f9613b = new ArrayList(this.f9613b);
        this.c = true;
    }

    private void i() {
    }

    private void k() {
        a.b bVar;
        if (!this.e || (bVar = this.f9612a) == null) {
            return;
        }
        bVar.a();
        this.e = false;
    }

    @Override // com.google.protobuf.a.b
    public void a() {
        k();
    }

    public c1<MType, BType, IType> b(Iterable<? extends MType> iterable) {
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
        g();
        if (size >= 0) {
            List<MType> list = this.f9613b;
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            }
        }
        Iterator<? extends MType> it2 = iterable.iterator();
        while (it2.hasNext()) {
            c(it2.next());
        }
        k();
        i();
        return this;
    }

    public c1<MType, BType, IType> c(MType mtype) {
        d0.a(mtype);
        g();
        this.f9613b.add(mtype);
        List<h1<MType, BType, IType>> list = this.d;
        if (list != null) {
            list.add(null);
        }
        k();
        i();
        return this;
    }

    public List<MType> d() {
        this.e = true;
        boolean z = this.c;
        if (!z && this.d == null) {
            return this.f9613b;
        }
        if (!z) {
            for (int i = 0; i < this.f9613b.size(); i++) {
                MType mtype = this.f9613b.get(i);
                h1<MType, BType, IType> h1Var = this.d.get(i);
                if (h1Var == null || h1Var.b() == mtype) {
                }
            }
            return this.f9613b;
        }
        g();
        for (int i2 = 0; i2 < this.f9613b.size(); i2++) {
            this.f9613b.set(i2, (MType) h(i2, true));
        }
        List<MType> listUnmodifiableList = Collections.unmodifiableList(this.f9613b);
        this.f9613b = listUnmodifiableList;
        this.c = false;
        return listUnmodifiableList;
    }

    public void e() {
        this.f9613b = Collections.emptyList();
        this.c = false;
        List<h1<MType, BType, IType>> list = this.d;
        if (list != null) {
            for (h1<MType, BType, IType> h1Var : list) {
                if (h1Var != null) {
                    h1Var.d();
                }
            }
            this.d = null;
        }
        k();
        i();
    }

    public void f() {
        this.f9612a = null;
    }

    public final MType h(int i, boolean z) {
        h1<MType, BType, IType> h1Var;
        List<h1<MType, BType, IType>> list = this.d;
        if (list != null && (h1Var = list.get(i)) != null) {
            return z ? (MType) h1Var.b() : (MType) h1Var.f();
        }
        return this.f9613b.get(i);
    }

    public boolean j() {
        return this.f9613b.isEmpty();
    }
}
