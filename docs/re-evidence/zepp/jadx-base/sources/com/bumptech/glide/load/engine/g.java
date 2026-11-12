package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.request.ResourceCallback;
import com.bumptech.glide.util.Util;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class g<R> implements f.b<R>, FactoryPools.Poolable {
    private static final int A = 2;
    private static final int B = 3;
    private static final a x = new a();
    private static final Handler y = new Handler(Looper.getMainLooper(), new b());
    private static final int z = 1;
    private final List<ResourceCallback> a;
    private final StateVerifier b;
    private final Pools.Pool<g<?>> c;
    private final a d;
    private final h e;
    private final GlideExecutor f;
    private final GlideExecutor g;
    private final GlideExecutor h;
    private final GlideExecutor i;
    private Key j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private Resource<?> o;
    private DataSource p;
    private boolean q;
    private GlideException r;
    private boolean s;
    private List<ResourceCallback> t;
    private k<?> u;
    private f<R> v;
    private volatile boolean w;

    @VisibleForTesting
    public static class a {
        public <R> k<R> a(Resource<R> resource, boolean z) {
            return new k<>(resource, z, true);
        }
    }

    public static class b implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            g gVar = (g) message.obj;
            int i = message.what;
            if (i == 1) {
                gVar.h();
            } else if (i == 2) {
                gVar.g();
            } else {
                if (i != 3) {
                    throw new IllegalStateException("Unrecognized message: " + message.what);
                }
                gVar.f();
            }
            return true;
        }
    }

    public g(GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, h hVar, Pools.Pool<g<?>> pool) {
        this(glideExecutor, glideExecutor2, glideExecutor3, glideExecutor4, hVar, pool, x);
    }

    private void c(ResourceCallback resourceCallback) {
        if (this.t == null) {
            this.t = new ArrayList(2);
        }
        if (this.t.contains(resourceCallback)) {
            return;
        }
        this.t.add(resourceCallback);
    }

    private GlideExecutor e() {
        if (this.l) {
            return this.h;
        }
        return this.m ? this.i : this.g;
    }

    private boolean k(ResourceCallback resourceCallback) {
        List<ResourceCallback> list = this.t;
        return list != null && list.contains(resourceCallback);
    }

    private void m(boolean z2) {
        Util.assertMainThread();
        this.a.clear();
        this.j = null;
        this.u = null;
        this.o = null;
        List<ResourceCallback> list = this.t;
        if (list != null) {
            list.clear();
        }
        this.s = false;
        this.w = false;
        this.q = false;
        this.v.r(z2);
        this.v = null;
        this.r = null;
        this.p = null;
        this.c.release(this);
    }

    @Override // com.bumptech.glide.load.engine.f.b
    public void a(f<?> fVar) {
        e().execute(fVar);
    }

    public void b(ResourceCallback resourceCallback) {
        Util.assertMainThread();
        this.b.throwIfRecycled();
        if (this.q) {
            resourceCallback.onResourceReady(this.u, this.p);
        } else if (this.s) {
            resourceCallback.onLoadFailed(this.r);
        } else {
            this.a.add(resourceCallback);
        }
    }

    public void d() {
        if (this.s || this.q || this.w) {
            return;
        }
        this.w = true;
        this.v.cancel();
        this.e.onEngineJobCancelled(this, this.j);
    }

    public void f() {
        this.b.throwIfRecycled();
        if (!this.w) {
            throw new IllegalStateException("Not cancelled");
        }
        this.e.onEngineJobCancelled(this, this.j);
        m(false);
    }

    public void g() {
        this.b.throwIfRecycled();
        if (this.w) {
            m(false);
            return;
        }
        if (this.a.isEmpty()) {
            throw new IllegalStateException("Received an exception without any callbacks to notify");
        }
        if (this.s) {
            throw new IllegalStateException("Already failed once");
        }
        this.s = true;
        this.e.onEngineJobComplete(this, this.j, null);
        for (ResourceCallback resourceCallback : this.a) {
            if (!k(resourceCallback)) {
                resourceCallback.onLoadFailed(this.r);
            }
        }
        m(false);
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
    @NonNull
    public StateVerifier getVerifier() {
        return this.b;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void h() {
        this.b.throwIfRecycled();
        if (this.w) {
            this.o.recycle();
            m(false);
            return;
        }
        if (this.a.isEmpty()) {
            throw new IllegalStateException("Received a resource without any callbacks to notify");
        }
        if (this.q) {
            throw new IllegalStateException("Already have resource");
        }
        k<?> kVarA = this.d.a(this.o, this.k);
        this.u = kVarA;
        this.q = true;
        kVarA.a();
        this.e.onEngineJobComplete(this, this.j, this.u);
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ResourceCallback resourceCallback = this.a.get(i);
            if (!k(resourceCallback)) {
                this.u.a();
                resourceCallback.onResourceReady(this.u, this.p);
            }
        }
        this.u.d();
        m(false);
    }

    @VisibleForTesting
    public g<R> i(Key key, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.j = key;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = z5;
        return this;
    }

    public boolean j() {
        return this.w;
    }

    public boolean l() {
        return this.n;
    }

    public void n(ResourceCallback resourceCallback) {
        Util.assertMainThread();
        this.b.throwIfRecycled();
        if (this.q || this.s) {
            c(resourceCallback);
            return;
        }
        this.a.remove(resourceCallback);
        if (this.a.isEmpty()) {
            d();
        }
    }

    public void o(f<R> fVar) {
        this.v = fVar;
        (fVar.x() ? this.f : e()).execute(fVar);
    }

    @Override // com.bumptech.glide.load.engine.f.b
    public void onLoadFailed(GlideException glideException) {
        this.r = glideException;
        y.obtainMessage(2, this).sendToTarget();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.engine.f.b
    public void onResourceReady(Resource<R> resource, DataSource dataSource) {
        this.o = resource;
        this.p = dataSource;
        y.obtainMessage(1, this).sendToTarget();
    }

    @VisibleForTesting
    public g(GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, h hVar, Pools.Pool<g<?>> pool, a aVar) {
        this.a = new ArrayList(2);
        this.b = StateVerifier.newInstance();
        this.f = glideExecutor;
        this.g = glideExecutor2;
        this.h = glideExecutor3;
        this.i = glideExecutor4;
        this.e = hVar;
        this.c = pool;
        this.d = aVar;
    }
}
