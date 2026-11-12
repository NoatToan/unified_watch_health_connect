package defpackage;

import android.media.ImageReader;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.arch.core.util.Function;
import androidx.camera.core.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class fk3 implements zj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zj3 f17861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zj3 f17862b;
    public final lhe<List<Void>> c;
    public final Executor d;
    public final int e;
    public p5d f = null;
    public q4d g = null;
    public final Object h = new Object();

    @GuardedBy("mLock")
    public boolean i = false;

    @GuardedBy("mLock")
    public boolean j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @GuardedBy("mLock")
    public cb3.a<Void> f17863k;

    @GuardedBy("mLock")
    public lhe<Void> l;

    public fk3(zj3 zj3Var, int i, zj3 zj3Var2, Executor executor) {
        this.f17861a = zj3Var;
        this.f17862b = zj3Var2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zj3Var.b());
        arrayList.add(zj3Var2.b());
        this.c = oua.c(arrayList);
        this.d = executor;
        this.e = i;
    }

    public static /* synthetic */ Void l(List list) {
        return null;
    }

    @Override // defpackage.zj3
    public void a(Surface surface, int i) {
        this.f17862b.a(surface, i);
    }

    @Override // defpackage.zj3
    public lhe<Void> b() {
        lhe<Void> lheVarJ;
        synchronized (this.h) {
            try {
                if (!this.i || this.j) {
                    if (this.l == null) {
                        this.l = cb3.a(new cb3.c() { // from class: dk3
                            @Override // cb3.c
                            public final Object a(cb3.a aVar) {
                                return this.f15605a.m(aVar);
                            }
                        });
                    }
                    lheVarJ = oua.j(this.l);
                } else {
                    lheVarJ = oua.o(this.c, new Function() { // from class: ck3
                        @Override // androidx.arch.core.util.Function
                        public final Object apply(Object obj) {
                            return fk3.l((List) obj);
                        }
                    }, li3.a());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return lheVarJ;
    }

    @Override // defpackage.zj3
    public void c(Size size) {
        ha1 ha1Var = new ha1(ImageReader.newInstance(size.getWidth(), size.getHeight(), 35, this.e));
        this.f = ha1Var;
        this.f17861a.a(ha1Var.a(), 35);
        this.f17861a.c(size);
        this.f17862b.c(size);
        this.f.d(new p5d.a() { // from class: ak3
            @Override // p5d.a
            public final void a(p5d p5dVar) {
                this.f1118a.o(p5dVar);
            }
        }, li3.a());
    }

    @Override // defpackage.zj3
    public void close() {
        synchronized (this.h) {
            try {
                if (this.i) {
                    return;
                }
                this.i = true;
                this.f17861a.close();
                this.f17862b.close();
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.zj3
    public void d(o5d o5dVar) {
        synchronized (this.h) {
            try {
                if (this.i) {
                    return;
                }
                this.j = true;
                lhe<m> lheVarB = o5dVar.b(o5dVar.a().get(0).intValue());
                g6i.a(lheVarB.isDone());
                try {
                    this.g = lheVarB.get().H();
                    this.f17861a.d(o5dVar);
                } catch (InterruptedException | ExecutionException unused) {
                    throw new IllegalArgumentException("Can not successfully extract ImageProxy from the ImageProxyBundle.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        boolean z;
        boolean z2;
        final cb3.a<Void> aVar;
        synchronized (this.h) {
            try {
                z = this.i;
                z2 = this.j;
                aVar = this.f17863k;
                if (z && !z2) {
                    this.f.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || z2 || aVar == null) {
            return;
        }
        this.c.addListener(new Runnable() { // from class: bk3
            @Override // java.lang.Runnable
            public final void run() {
                aVar.c(null);
            }
        }, li3.a());
    }

    public final /* synthetic */ Object m(cb3.a aVar) throws Exception {
        synchronized (this.h) {
            this.f17863k = aVar;
        }
        return "CaptureProcessorPipeline-close";
    }

    public final /* synthetic */ void o(p5d p5dVar) {
        final m mVarE = p5dVar.e();
        try {
            this.d.execute(new Runnable() { // from class: ek3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16719a.n(mVarE);
                }
            });
        } catch (RejectedExecutionException unused) {
            zpe.c("CaptureProcessorPipeline", "The executor for post-processing might have been shutting down or terminated!");
            mVarE.close();
        }
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void n(m mVar) {
        boolean z;
        synchronized (this.h) {
            z = this.i;
        }
        if (!z) {
            Size size = new Size(mVar.getWidth(), mVar.getHeight());
            g6i.g(this.g);
            String next = this.g.a().d().iterator().next();
            Integer num = (Integer) this.g.a().c(next);
            num.intValue();
            m0m m0mVar = new m0m(mVar, size, this.g);
            this.g = null;
            n0m n0mVar = new n0m(Collections.singletonList(num), next);
            n0mVar.c(m0mVar);
            try {
                this.f17862b.d(n0mVar);
            } catch (Exception e) {
                zpe.c("CaptureProcessorPipeline", "Post processing image failed! " + e.getMessage());
            }
        }
        synchronized (this.h) {
            this.j = false;
        }
        j();
    }
}
