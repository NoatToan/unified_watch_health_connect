package androidx.camera.core;

import android.media.ImageReader;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.arch.core.util.Function;
import androidx.camera.core.p;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTAudioModuleCore;
import defpackage.cb3;
import defpackage.g6i;
import defpackage.ha1;
import defpackage.jua;
import defpackage.lhe;
import defpackage.li3;
import defpackage.mj3;
import defpackage.n0m;
import defpackage.oua;
import defpackage.p5d;
import defpackage.we3;
import defpackage.zj3;
import defpackage.zpe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class p implements p5d {

    @GuardedBy("mLock")
    public final p5d g;

    @GuardedBy("mLock")
    public final p5d h;

    @GuardedBy("mLock")
    public p5d.a i;

    @GuardedBy("mLock")
    public Executor j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @GuardedBy("mLock")
    public cb3.a<Void> f1794k;

    @GuardedBy("mLock")
    public lhe<Void> l;
    public final Executor m;
    public final zj3 n;
    public final lhe<Void> o;

    @GuardedBy("mLock")
    public f t;

    @GuardedBy("mLock")
    public Executor u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1792a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p5d.a f1793b = new a();
    public p5d.a c = new b();
    public jua<List<m>> d = new c();

    @GuardedBy("mLock")
    public boolean e = false;

    @GuardedBy("mLock")
    public boolean f = false;
    public String p = new String();

    @GuardedBy("mLock")
    public n0m q = new n0m(Collections.emptyList(), this.p);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List<Integer> f1795r = new ArrayList();
    public lhe<List<m>> s = oua.h(new ArrayList());

    public class a implements p5d.a {
        public a() {
        }

        @Override // p5d.a
        public void a(p5d p5dVar) {
            p.this.p(p5dVar);
        }
    }

    public class b implements p5d.a {
        public b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onImageAvailable$0(p5d.a aVar) {
            aVar.a(p.this);
        }

        @Override // p5d.a
        public void a(p5d p5dVar) {
            final p5d.a aVar;
            Executor executor;
            synchronized (p.this.f1792a) {
                p pVar = p.this;
                aVar = pVar.i;
                executor = pVar.j;
                pVar.q.e();
                p.this.v();
            }
            if (aVar != null) {
                if (executor != null) {
                    executor.execute(new Runnable() { // from class: uai
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f35573a.lambda$onImageAvailable$0(aVar);
                        }
                    });
                } else {
                    aVar.a(p.this);
                }
            }
        }
    }

    public class c implements jua<List<m>> {
        public c() {
        }

        public static /* synthetic */ void b(f fVar, Exception exc) {
            fVar.a(exc.getMessage(), exc.getCause());
        }

        @Override // defpackage.jua
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<m> list) {
            p pVar;
            synchronized (p.this.f1792a) {
                try {
                    p pVar2 = p.this;
                    if (pVar2.e) {
                        return;
                    }
                    pVar2.f = true;
                    n0m n0mVar = pVar2.q;
                    final f fVar = pVar2.t;
                    Executor executor = pVar2.u;
                    try {
                        pVar2.n.d(n0mVar);
                    } catch (Exception e) {
                        synchronized (p.this.f1792a) {
                            try {
                                p.this.q.e();
                                if (fVar != null && executor != null) {
                                    executor.execute(new Runnable() { // from class: vai
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            p.c.b(fVar, e);
                                        }
                                    });
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    synchronized (p.this.f1792a) {
                        pVar = p.this;
                        pVar.f = false;
                    }
                    pVar.l();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // defpackage.jua
        public void onFailure(Throwable th) {
        }
    }

    public class d extends we3 {
        public d() {
        }
    }

    public interface f {
        void a(String str, Throwable th);
    }

    public p(e eVar) {
        if (eVar.f1800a.c() < eVar.f1801b.a().size()) {
            throw new IllegalArgumentException("MetadataImageReader is smaller than CaptureBundle.");
        }
        p5d p5dVar = eVar.f1800a;
        this.g = p5dVar;
        int width = p5dVar.getWidth();
        int height = p5dVar.getHeight();
        int i = eVar.d;
        if (i == 256) {
            width = ((int) (width * height * 1.5f)) + MIOTAudioModuleCore.COMPRESSED_AUDIO_FILE_BIT_RATE;
            height = 1;
        }
        ha1 ha1Var = new ha1(ImageReader.newInstance(width, height, i, p5dVar.c()));
        this.h = ha1Var;
        this.m = eVar.e;
        zj3 zj3Var = eVar.c;
        this.n = zj3Var;
        zj3Var.a(ha1Var.a(), eVar.d);
        zj3Var.c(new Size(p5dVar.getWidth(), p5dVar.getHeight()));
        this.o = zj3Var.b();
        t(eVar.f1801b);
    }

    public static /* synthetic */ Void r(Void r0) {
        return null;
    }

    @Override // defpackage.p5d
    public Surface a() {
        Surface surfaceA;
        synchronized (this.f1792a) {
            surfaceA = this.g.a();
        }
        return surfaceA;
    }

    @Override // defpackage.p5d
    public int b() {
        int iB;
        synchronized (this.f1792a) {
            iB = this.h.b();
        }
        return iB;
    }

    @Override // defpackage.p5d
    public int c() {
        int iC;
        synchronized (this.f1792a) {
            iC = this.g.c();
        }
        return iC;
    }

    @Override // defpackage.p5d
    public void close() {
        synchronized (this.f1792a) {
            try {
                if (this.e) {
                    return;
                }
                this.g.h();
                this.h.h();
                this.e = true;
                this.n.close();
                l();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.p5d
    public void d(p5d.a aVar, Executor executor) {
        synchronized (this.f1792a) {
            this.i = (p5d.a) g6i.g(aVar);
            this.j = (Executor) g6i.g(executor);
            this.g.d(this.f1793b, executor);
            this.h.d(this.c, executor);
        }
    }

    @Override // defpackage.p5d
    public m e() {
        m mVarE;
        synchronized (this.f1792a) {
            mVarE = this.h.e();
        }
        return mVarE;
    }

    @Override // defpackage.p5d
    public m g() {
        m mVarG;
        synchronized (this.f1792a) {
            mVarG = this.h.g();
        }
        return mVarG;
    }

    @Override // defpackage.p5d
    public int getHeight() {
        int height;
        synchronized (this.f1792a) {
            height = this.g.getHeight();
        }
        return height;
    }

    @Override // defpackage.p5d
    public int getWidth() {
        int width;
        synchronized (this.f1792a) {
            width = this.g.getWidth();
        }
        return width;
    }

    @Override // defpackage.p5d
    public void h() {
        synchronized (this.f1792a) {
            try {
                this.i = null;
                this.j = null;
                this.g.h();
                this.h.h();
                if (!this.f) {
                    this.q.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        synchronized (this.f1792a) {
            try {
                if (!this.s.isDone()) {
                    this.s.cancel(true);
                }
                this.q.e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void l() {
        boolean z;
        boolean z2;
        final cb3.a<Void> aVar;
        synchronized (this.f1792a) {
            try {
                z = this.e;
                z2 = this.f;
                aVar = this.f1794k;
                if (z && !z2) {
                    this.g.close();
                    this.q.d();
                    this.h.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || z2) {
            return;
        }
        this.o.addListener(new Runnable() { // from class: tai
            @Override // java.lang.Runnable
            public final void run() {
                this.f34513a.q(aVar);
            }
        }, li3.a());
    }

    public we3 m() {
        synchronized (this.f1792a) {
            try {
                p5d p5dVar = this.g;
                if (p5dVar instanceof n) {
                    return ((n) p5dVar).n();
                }
                return new d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public lhe<Void> n() {
        lhe<Void> lheVarJ;
        synchronized (this.f1792a) {
            try {
                if (!this.e || this.f) {
                    if (this.l == null) {
                        this.l = cb3.a(new cb3.c() { // from class: sai
                            @Override // cb3.c
                            public final Object a(cb3.a aVar) {
                                return this.f33460a.s(aVar);
                            }
                        });
                    }
                    lheVarJ = oua.j(this.l);
                } else {
                    lheVarJ = oua.o(this.o, new Function() { // from class: rai
                        @Override // androidx.arch.core.util.Function
                        public final Object apply(Object obj) {
                            return p.r((Void) obj);
                        }
                    }, li3.a());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return lheVarJ;
    }

    public String o() {
        return this.p;
    }

    public void p(p5d p5dVar) {
        synchronized (this.f1792a) {
            if (this.e) {
                return;
            }
            try {
                m mVarE = p5dVar.e();
                if (mVarE != null) {
                    Integer num = (Integer) mVarE.H().a().c(this.p);
                    if (this.f1795r.contains(num)) {
                        this.q.c(mVarE);
                    } else {
                        zpe.k("ProcessingImageReader", "ImageProxyBundle does not contain this id: " + num);
                        mVarE.close();
                    }
                }
            } catch (IllegalStateException e2) {
                zpe.d("ProcessingImageReader", "Failed to acquire latest image.", e2);
            }
        }
    }

    public final /* synthetic */ void q(cb3.a aVar) {
        k();
        if (aVar != null) {
            aVar.c(null);
        }
    }

    public final /* synthetic */ Object s(cb3.a aVar) throws Exception {
        synchronized (this.f1792a) {
            this.f1794k = aVar;
        }
        return "ProcessingImageReader-close";
    }

    public void t(mj3 mj3Var) {
        synchronized (this.f1792a) {
            try {
                if (this.e) {
                    return;
                }
                k();
                if (mj3Var.a() != null) {
                    if (this.g.c() < mj3Var.a().size()) {
                        throw new IllegalArgumentException("CaptureBundle is larger than InputImageReader.");
                    }
                    this.f1795r.clear();
                    for (androidx.camera.core.impl.f fVar : mj3Var.a()) {
                        if (fVar != null) {
                            this.f1795r.add(Integer.valueOf(fVar.getId()));
                        }
                    }
                }
                String string = Integer.toString(mj3Var.hashCode());
                this.p = string;
                this.q = new n0m(this.f1795r, string);
                v();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void u(Executor executor, f fVar) {
        synchronized (this.f1792a) {
            this.u = executor;
            this.t = fVar;
        }
    }

    @GuardedBy("mLock")
    public void v() {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = this.f1795r.iterator();
        while (it.hasNext()) {
            arrayList.add(this.q.b(it.next().intValue()));
        }
        this.s = oua.c(arrayList);
        oua.b(oua.c(arrayList), this.d, this.m);
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p5d f1800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final mj3 f1801b;
        public final zj3 c;
        public int d;
        public Executor e;

        public e(p5d p5dVar, mj3 mj3Var, zj3 zj3Var) {
            this.e = Executors.newSingleThreadExecutor();
            this.f1800a = p5dVar;
            this.f1801b = mj3Var;
            this.c = zj3Var;
            this.d = p5dVar.b();
        }

        public p a() {
            return new p(this);
        }

        public e b(int i) {
            this.d = i;
            return this;
        }

        public e c(Executor executor) {
            this.e = executor;
            return this;
        }

        public e(int i, int i2, int i3, int i4, mj3 mj3Var, zj3 zj3Var) {
            this(new n(i, i2, i3, i4), mj3Var, zj3Var);
        }
    }
}
