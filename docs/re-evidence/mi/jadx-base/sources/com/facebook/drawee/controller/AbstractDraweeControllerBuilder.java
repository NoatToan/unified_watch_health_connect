package com.facebook.drawee.controller;

import android.content.Context;
import android.graphics.drawable.Animatable;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import defpackage.b6i;
import defpackage.cp5;
import defpackage.epa;
import defpackage.f52;
import defpackage.g57;
import defpackage.g7d;
import defpackage.gp5;
import defpackage.i4h;
import defpackage.jo9;
import defpackage.m00;
import defpackage.nya;
import defpackage.scm;
import defpackage.tpo;
import defpackage.uj4;
import defpackage.wj4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractDraweeControllerBuilder<BUILDER extends AbstractDraweeControllerBuilder<BUILDER, REQUEST, IMAGE, INFO>, REQUEST, IMAGE, INFO> implements scm {
    public static final uj4<Object> o = new a();
    public static final NullPointerException p = new NullPointerException("No image request was specified!");
    public static final AtomicLong q = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<uj4> f7098b;
    public Object c;
    public REQUEST d;
    public REQUEST e;
    public REQUEST[] f;
    public boolean g;
    public tpo<cp5<IMAGE>> h;
    public uj4<? super INFO> i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7099k;
    public boolean l;
    public String m;
    public g57 n;

    public enum CacheLevel {
        FULL_FETCH,
        DISK_CACHE,
        BITMAP_MEMORY_CACHE
    }

    public static class a extends f52<Object> {
        @Override // defpackage.f52, defpackage.uj4
        public void e(String str, Object obj, Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    }

    public class b implements tpo<cp5<IMAGE>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g57 f7100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f7101b;
        public final /* synthetic */ Object c;
        public final /* synthetic */ Object d;
        public final /* synthetic */ CacheLevel e;

        public b(g57 g57Var, String str, Object obj, Object obj2, CacheLevel cacheLevel) {
            this.f7100a = g57Var;
            this.f7101b = str;
            this.c = obj;
            this.d = obj2;
            this.e = cacheLevel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.tpo
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public cp5<IMAGE> get() {
            return AbstractDraweeControllerBuilder.this.i(this.f7100a, this.f7101b, this.c, this.d, this.e);
        }

        public String toString() {
            return i4h.d(this).b("request", this.c.toString()).toString();
        }
    }

    public AbstractDraweeControllerBuilder(Context context, Set<uj4> set) {
        this.f7097a = context;
        this.f7098b = set;
        q();
    }

    public static String e() {
        return String.valueOf(q.getAndIncrement());
    }

    public BUILDER A(REQUEST request) {
        this.d = request;
        return (BUILDER) p();
    }

    public BUILDER B(REQUEST request) {
        this.e = request;
        return (BUILDER) p();
    }

    @Override // defpackage.scm
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public BUILDER b(g57 g57Var) {
        this.n = g57Var;
        return (BUILDER) p();
    }

    public void D() {
        boolean z = true;
        b6i.j(this.f == null || this.d == null, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
        if (this.h != null && (this.f != null || this.d != null || this.e != null)) {
            z = false;
        }
        b6i.j(z, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
    }

    @Override // defpackage.scm
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public m00 build() {
        REQUEST request;
        D();
        if (this.d == null && this.f == null && (request = this.e) != null) {
            this.d = request;
            this.e = null;
        }
        return d();
    }

    public m00 d() {
        if (epa.d()) {
            epa.a("AbstractDraweeControllerBuilder#buildController");
        }
        m00 m00VarU = u();
        m00VarU.L(o());
        m00VarU.H(g());
        h();
        m00VarU.J(null);
        t(m00VarU);
        r(m00VarU);
        if (epa.d()) {
            epa.b();
        }
        return m00VarU;
    }

    public Object f() {
        return this.c;
    }

    public String g() {
        return this.m;
    }

    public wj4 h() {
        return null;
    }

    public abstract cp5<IMAGE> i(g57 g57Var, String str, REQUEST request, Object obj, CacheLevel cacheLevel);

    public tpo<cp5<IMAGE>> j(g57 g57Var, String str, REQUEST request) {
        return k(g57Var, str, request, CacheLevel.FULL_FETCH);
    }

    public tpo<cp5<IMAGE>> k(g57 g57Var, String str, REQUEST request, CacheLevel cacheLevel) {
        return new b(g57Var, str, request, f(), cacheLevel);
    }

    public tpo<cp5<IMAGE>> l(g57 g57Var, String str, REQUEST[] requestArr, boolean z) {
        ArrayList arrayList = new ArrayList(requestArr.length * 2);
        if (z) {
            for (REQUEST request : requestArr) {
                arrayList.add(k(g57Var, str, request, CacheLevel.BITMAP_MEMORY_CACHE));
            }
        }
        for (REQUEST request2 : requestArr) {
            arrayList.add(j(g57Var, str, request2));
        }
        return jo9.b(arrayList);
    }

    public REQUEST m() {
        return this.d;
    }

    public g57 n() {
        return this.n;
    }

    public boolean o() {
        return this.l;
    }

    public final BUILDER p() {
        return this;
    }

    public final void q() {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = true;
        this.i = null;
        this.j = false;
        this.f7099k = false;
        this.n = null;
        this.m = null;
    }

    public void r(m00 m00Var) {
        Set<uj4> set = this.f7098b;
        if (set != null) {
            Iterator<uj4> it = set.iterator();
            while (it.hasNext()) {
                m00Var.h(it.next());
            }
        }
        uj4<? super INFO> uj4Var = this.i;
        if (uj4Var != null) {
            m00Var.h(uj4Var);
        }
        if (this.f7099k) {
            m00Var.h(o);
        }
    }

    public void s(m00 m00Var) {
        if (m00Var.o() == null) {
            m00Var.K(nya.c(this.f7097a));
        }
    }

    public void t(m00 m00Var) {
        if (this.j) {
            m00Var.t().d(this.j);
            s(m00Var);
        }
    }

    public abstract m00 u();

    public tpo<cp5<IMAGE>> v(g57 g57Var, String str) {
        tpo<cp5<IMAGE>> tpoVarL;
        tpo<cp5<IMAGE>> tpoVar = this.h;
        if (tpoVar != null) {
            return tpoVar;
        }
        REQUEST request = this.d;
        if (request != null) {
            tpoVarL = j(g57Var, str, request);
        } else {
            REQUEST[] requestArr = this.f;
            tpoVarL = requestArr != null ? l(g57Var, str, requestArr, this.g) : null;
        }
        if (tpoVarL != null && this.e != null) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(tpoVarL);
            arrayList.add(j(g57Var, str, this.e));
            tpoVarL = g7d.c(arrayList, false);
        }
        return tpoVarL == null ? gp5.a(p) : tpoVarL;
    }

    public BUILDER w() {
        q();
        return (BUILDER) p();
    }

    public BUILDER x(boolean z) {
        this.f7099k = z;
        return (BUILDER) p();
    }

    public BUILDER y(Object obj) {
        this.c = obj;
        return (BUILDER) p();
    }

    public BUILDER z(uj4<? super INFO> uj4Var) {
        this.i = uj4Var;
        return (BUILDER) p();
    }
}
