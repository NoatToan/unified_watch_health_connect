package kotlin;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;
import o13.m;
import o13.t;
import o53.s0;
import o53.z;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.w;
import p13.k;
import t13.g;
import u53.o;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Li5/r0;", "Lo53/z;", "Landroid/view/Choreographer;", "choreographer", "Landroid/os/Handler;", "handler", "<init>", "(Landroid/view/Choreographer;Landroid/os/Handler;)V", "c", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r0 extends z {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f91409k = new c(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final t f91410l = m.b(a.f91422a);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f91411m = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Choreographer f91412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f91413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f91414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k<Runnable> f91415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f91416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f91417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f91418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f91419h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d f91420i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s0 f91421j;

    @p005kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lt13/g;", "invoke", "()Lt13/g;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a extends w implements e23.a<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f91422a = new a();

        public a() {
            super(0);
        }

        @Override // e23.a
        public final g invoke() {
            Choreographer choreographer;
            j jVar = null;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                choreographer = Choreographer.getInstance();
            } else {
                x53.c cVar = s0.f129406a;
                choreographer = (Choreographer) ge1.b.W(o.f168762a, new q0(null));
            }
            r0 r0Var = new r0(choreographer, Handler.createAsync(Looper.getMainLooper()), jVar);
            return r0Var.plus(r0Var.f91421j);
        }
    }

    @p005kotlin.Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"i5/r0$b", "Ljava/lang/ThreadLocal;", "Lt13/g;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends ThreadLocal<g> {
        @Override // java.lang.ThreadLocal
        public final g initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null) {
                r0 r0Var = new r0(choreographer, Handler.createAsync(looperMyLooper), null);
                return r0Var.plus(r0Var.f91421j);
            }
            h.z("no Looper on this thread");
            return null;
        }
    }

    @p005kotlin.Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"i5/r0$d", "Landroid/view/Choreographer$FrameCallback;", "Ljava/lang/Runnable;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements Choreographer.FrameCallback, Runnable {
        public d() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j8) {
            r0.this.f91413b.removeCallbacks(this);
            r0.H(r0.this);
            r0 r0Var = r0.this;
            synchronized (r0Var.f91414c) {
                if (r0Var.f91419h) {
                    r0Var.f91419h = false;
                    ArrayList arrayList = r0Var.f91416e;
                    r0Var.f91416e = r0Var.f91417f;
                    r0Var.f91417f = arrayList;
                    int size = arrayList.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        ((Choreographer.FrameCallback) arrayList.get(i14)).doFrame(j8);
                    }
                    arrayList.clear();
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            r0.H(r0.this);
            r0 r0Var = r0.this;
            synchronized (r0Var.f91414c) {
                try {
                    if (r0Var.f91416e.isEmpty()) {
                        r0Var.f91412a.removeFrameCallback(this);
                        r0Var.f91419h = false;
                    }
                    p005kotlin.Unit unit = p005kotlin.Unit.INSTANCE;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    private r0(Choreographer choreographer, Handler handler) {
        this.f91412a = choreographer;
        this.f91413b = handler;
        this.f91414c = new Object();
        this.f91415d = new k<>();
        this.f91416e = new ArrayList();
        this.f91417f = new ArrayList();
        this.f91420i = new d();
        this.f91421j = new s0(choreographer, this);
    }

    public static final void H(r0 r0Var) {
        Runnable runnableRemoveFirst;
        boolean z14;
        do {
            synchronized (r0Var.f91414c) {
                k<Runnable> kVar = r0Var.f91415d;
                runnableRemoveFirst = kVar.isEmpty() ? null : kVar.removeFirst();
            }
            while (runnableRemoveFirst != null) {
                runnableRemoveFirst.run();
                synchronized (r0Var.f91414c) {
                    k<Runnable> kVar2 = r0Var.f91415d;
                    runnableRemoveFirst = kVar2.isEmpty() ? null : kVar2.removeFirst();
                }
            }
            synchronized (r0Var.f91414c) {
                if (r0Var.f91415d.isEmpty()) {
                    z14 = false;
                    r0Var.f91418g = false;
                } else {
                    z14 = true;
                }
            }
        } while (z14);
    }

    @Override // o53.z
    public final void dispatch(g gVar, Runnable runnable) {
        synchronized (this.f91414c) {
            try {
                this.f91415d.addLast(runnable);
                if (!this.f91418g) {
                    this.f91418g = true;
                    this.f91413b.post(this.f91420i);
                    if (!this.f91419h) {
                        this.f91419h = true;
                        this.f91412a.postFrameCallback(this.f91420i);
                    }
                }
                p005kotlin.Unit unit = p005kotlin.Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @p005kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li5/r0$c;", "", "<init>", "()V", "Ljava/lang/ThreadLocal;", "Lt13/g;", "currentThread", "Ljava/lang/ThreadLocal;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(j jVar) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ r0(Choreographer choreographer, Handler handler, j jVar) {
        this(choreographer, handler);
    }
}
