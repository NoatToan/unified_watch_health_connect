package kotlin;

import android.view.Choreographer;
import e23.l;
import e23.p;
import o13.q;
import o53.j;
import o53.k;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;
import p3.e1;
import t13.d;
import t13.e;
import t13.g;
import u13.f;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Li5/s0;", "Lp3/e1;", "Landroid/view/Choreographer;", "choreographer", "Li5/r0;", "dispatcher", "<init>", "(Landroid/view/Choreographer;Li5/r0;)V", "(Landroid/view/Choreographer;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s0 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Choreographer f91435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f91436b;

    @p005kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a extends w implements l<Throwable, p005kotlin.Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r0 f91437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Choreographer.FrameCallback f91438b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r0 r0Var, Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f91437a = r0Var;
            this.f91438b = frameCallback;
        }

        @Override // e23.l
        public final p005kotlin.Unit invoke(Throwable th3) {
            r0 r0Var = this.f91437a;
            Choreographer.FrameCallback frameCallback = this.f91438b;
            synchronized (r0Var.f91414c) {
                r0Var.f91416e.remove(frameCallback);
            }
            return p005kotlin.Unit.INSTANCE;
        }
    }

    @p005kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b extends w implements l<Throwable, p005kotlin.Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Choreographer.FrameCallback f91440b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f91440b = frameCallback;
        }

        @Override // e23.l
        public final p005kotlin.Unit invoke(Throwable th3) {
            s0.this.f91435a.removeFrameCallback(this.f91440b);
            return p005kotlin.Unit.INSTANCE;
        }
    }

    @p005kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "frameTimeNanos", "", "doFrame"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j<R> f91441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<Long, R> f91442b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(j<? super R> jVar, s0 s0Var, l<? super Long, ? extends R> lVar) {
            this.f91441a = jVar;
            this.f91442b = lVar;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j8) {
            Object bVar;
            l<Long, R> lVar = this.f91442b;
            try {
                int i14 = q.f128596b;
                bVar = lVar.invoke(Long.valueOf(j8));
            } catch (Throwable th3) {
                int i15 = q.f128596b;
                bVar = new q.b(th3);
            }
            this.f91441a.resumeWith(bVar);
        }
    }

    public s0(Choreographer choreographer, r0 r0Var) {
        this.f91435a = choreographer;
        this.f91436b = r0Var;
    }

    @Override // t13.g
    public final <R> R fold(R r14, p<? super R, ? super g.a, ? extends R> pVar) {
        return (R) g.a.C3052a.a(this, r14, pVar);
    }

    @Override // t13.g
    public final <E extends g.a> E get(g.b<E> bVar) {
        return (E) g.a.C3052a.b(this, bVar);
    }

    @Override // t13.g
    public final g minusKey(g.b<?> bVar) {
        return g.a.C3052a.c(this, bVar);
    }

    @Override // t13.g
    public final g plus(g gVar) {
        return g.a.C3052a.d(gVar, this);
    }

    @Override // p3.e1
    public final <R> Object v(l<? super Long, ? extends R> lVar, d<? super R> dVar) throws Throwable {
        r0 r0Var = this.f91436b;
        if (r0Var == null) {
            g.a aVar = dVar.getF157466b().get(e.f161746w0);
            r0Var = aVar instanceof r0 ? (r0) aVar : null;
        }
        k kVar = new k(f.b(dVar), 1);
        kVar.q();
        c cVar = new c(kVar, this, lVar);
        if (r0Var == null || !s.g(r0Var.f91412a, this.f91435a)) {
            this.f91435a.postFrameCallback(cVar);
            kVar.r(new b(cVar));
        } else {
            synchronized (r0Var.f91414c) {
                try {
                    r0Var.f91416e.add(cVar);
                    if (!r0Var.f91419h) {
                        r0Var.f91419h = true;
                        r0Var.f91412a.postFrameCallback(r0Var.f91420i);
                    }
                    p005kotlin.Unit unit = p005kotlin.Unit.INSTANCE;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            kVar.r(new a(r0Var, cVar));
        }
        Object objP = kVar.p();
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        return objP;
    }

    public s0(Choreographer choreographer) {
        this(choreographer, null);
    }
}
