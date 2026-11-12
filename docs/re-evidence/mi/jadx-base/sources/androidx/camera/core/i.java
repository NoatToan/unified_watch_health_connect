package androidx.camera.core;

import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.m;
import defpackage.jua;
import defpackage.li3;
import defpackage.oua;
import defpackage.p5d;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class i extends h {
    public final Executor u;
    public final Object v = new Object();

    @GuardedBy("mLock")
    @VisibleForTesting
    public m w;

    @GuardedBy("mLock")
    public b x;

    public class a implements jua<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f1709a;

        public a(b bVar) {
            this.f1709a = bVar;
        }

        @Override // defpackage.jua
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r1) {
        }

        @Override // defpackage.jua
        public void onFailure(Throwable th) {
            this.f1709a.close();
        }
    }

    public static class b extends f {
        public final WeakReference<i> c;

        public b(m mVar, i iVar) {
            super(mVar);
            this.c = new WeakReference<>(iVar);
            addOnImageCloseListener(new f.a() { // from class: q2d
                @Override // androidx.camera.core.f.a
                public final void f(m mVar2) {
                    this.f31015a.l(mVar2);
                }
            });
        }

        public final /* synthetic */ void l(m mVar) {
            final i iVar = this.c.get();
            if (iVar != null) {
                iVar.u.execute(new Runnable() { // from class: r2d
                    @Override // java.lang.Runnable
                    public final void run() {
                        iVar.A();
                    }
                });
            }
        }
    }

    public i(Executor executor) {
        this.u = executor;
    }

    public void A() {
        synchronized (this.v) {
            try {
                this.x = null;
                m mVar = this.w;
                if (mVar != null) {
                    this.w = null;
                    p(mVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.h
    public m d(p5d p5dVar) {
        return p5dVar.g();
    }

    @Override // androidx.camera.core.h
    public void g() {
        synchronized (this.v) {
            try {
                m mVar = this.w;
                if (mVar != null) {
                    mVar.close();
                    this.w = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.h
    public void p(m mVar) {
        synchronized (this.v) {
            try {
                if (!this.s) {
                    mVar.close();
                    return;
                }
                if (this.x == null) {
                    b bVar = new b(mVar, this);
                    this.x = bVar;
                    oua.b(e(bVar), new a(bVar), li3.a());
                } else {
                    if (mVar.H().getTimestamp() <= this.x.H().getTimestamp()) {
                        mVar.close();
                    } else {
                        m mVar2 = this.w;
                        if (mVar2 != null) {
                            mVar2.close();
                        }
                        this.w = mVar;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
