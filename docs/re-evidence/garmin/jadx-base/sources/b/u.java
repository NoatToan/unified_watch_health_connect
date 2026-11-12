package b;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.b0;
import androidx.lifecycle.k0;
import androidx.lifecycle.n0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\nB!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0015\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"Lb/u;", "", "Ljava/lang/Runnable;", "fallbackOnBackPressed", "Lk7/b;", "", "onHasEnabledCallbacksChanged", "<init>", "(Ljava/lang/Runnable;Lk7/b;)V", "(Ljava/lang/Runnable;)V", "a", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f13824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k7.b<Boolean> f13825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f13826c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb/u$a;", "Lwc/h;", "<init>", "(Lb/u;)V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class a extends wc.h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final wc.c f13827c;

        public a() {
            wc.c cVar = new wc.c(new a73.j(u.this, 25));
            cVar.b(this);
            this.f13827c = cVar;
        }

        @Override // wc.h
        public final void b(boolean z14) {
            u uVar = u.this;
            uVar.getClass();
            k7.b<Boolean> bVar = uVar.f13825b;
            if (bVar != null) {
                bVar.accept(Boolean.valueOf(z14));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003¨\u0006\u0004"}, d2 = {"b/u$b", "Landroidx/lifecycle/k0;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements k0, AutoCloseable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s.a f13829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ u f13830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b0 f13831c;

        public b(s.a aVar, u uVar, b0 b0Var) {
            this.f13829a = aVar;
            this.f13830b = uVar;
            this.f13831c = b0Var;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            this.f13831c.d(this);
        }

        @Override // androidx.lifecycle.k0
        public final void onStateChanged(n0 n0Var, b0.a aVar) {
            boolean z14 = b.a.f13786a;
            s.a aVar2 = this.f13829a;
            if (z14) {
                if (aVar == b0.a.ON_START) {
                    aVar2.j(true);
                } else if (aVar == b0.a.ON_STOP) {
                    aVar2.j(false);
                }
            } else if (aVar == b0.a.ON_START) {
                wc.c.a(this.f13830b.c().f13827c, aVar2);
            } else if (aVar == b0.a.ON_STOP) {
                aVar2.h();
            }
            if (aVar == b0.a.ON_DESTROY) {
                aVar2.h();
                this.f13831c.d(this);
            }
        }
    }

    public u(Runnable runnable, k7.b<Boolean> bVar) {
        this.f13824a = runnable;
        this.f13825b = bVar;
        this.f13826c = o13.m.b(new ak0.i(this, 6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(s sVar) {
        sVar.getClass();
        s.a aVar = new s.a(sVar, new t(sVar, null, 2, 0 == true ? 1 : 0));
        sVar.f13817a.add(aVar);
        wc.c.a(c().f13827c, aVar);
    }

    public final void b(s sVar, n0 n0Var) {
        n0Var.getClass();
        sVar.getClass();
        b0 lifecycle = n0Var.getF158017a();
        if (lifecycle.getF7973d() == b0.b.DESTROYED) {
            return;
        }
        s.a aVar = new s.a(sVar, new t(sVar, n0Var));
        sVar.f13817a.add(aVar);
        if (b.a.f13786a) {
            aVar.j(false);
            wc.c.a(c().f13827c, aVar);
        }
        b bVar = new b(aVar, this, lifecycle);
        lifecycle.a(bVar);
        sVar.f13819c.add(bVar);
    }

    public final a c() {
        return (a) this.f13826c.getValue();
    }

    public final void d() {
        c().a();
    }

    public final void e(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        c().f13827c.c(new wc.m(onBackInvokedDispatcher), 1);
        c().f13827c.c(new wc.p(onBackInvokedDispatcher), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public u(Runnable runnable) {
        this(runnable, null);
    }

    public /* synthetic */ u(Runnable runnable, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : runnable);
    }
}
