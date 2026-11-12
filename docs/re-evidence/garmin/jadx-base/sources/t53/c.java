package t53;

import c53.j;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.Uninterruptibles;
import com.google.common.util.concurrent.internal.InternalFutureFailureAccess;
import com.google.common.util.concurrent.internal.InternalFutures;
import e23.l;
import e23.p;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import o13.q;
import o53.i0;
import o53.k;
import o53.l1;
import o53.n1;
import o53.o;
import o53.p1;
import o53.r;
import o53.s;
import o53.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import s70.b0;
import t13.g;
import t13.h;
import u13.f;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"t53/c$a", "Lcom/google/common/util/concurrent/FutureCallback;", "kotlinx-coroutines-guava"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements FutureCallback<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r<T> f162559a;

        public a(r<T> rVar) {
            this.f162559a = rVar;
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public final void onFailure(Throwable th3) {
            Object bVar;
            r<T> rVar = this.f162559a;
            try {
                int i14 = q.f128596b;
                bVar = Boolean.valueOf(rVar.O(th3));
            } catch (Throwable th4) {
                int i15 = q.f128596b;
                bVar = new q.b(th4);
            }
            Throwable thB = q.b(bVar);
            if (thB != null) {
                kotlinx.coroutines.a.a(thB, h.f161748a);
            }
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public final void onSuccess(T t7) {
            Object bVar;
            r<T> rVar = this.f162559a;
            try {
                int i14 = q.f128596b;
                bVar = Boolean.valueOf(rVar.p(t7));
            } catch (Throwable th3) {
                int i15 = q.f128596b;
                bVar = new q.b(th3);
            }
            Throwable thB = q.b(bVar);
            if (thB != null) {
                kotlinx.coroutines.a.a(thB, h.f161748a);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"t53/c$b", "Lo53/i0;", "kotlinx-coroutines-guava"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements i0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r<T> f162560a;

        public b(r<T> rVar) {
            this.f162560a = rVar;
        }

        @Override // o53.l1
        public final o E(p1 p1Var) {
            return this.f162560a.E(p1Var);
        }

        @Override // o53.l1
        public final u0 J(l<? super Throwable, Unit> lVar) {
            return this.f162560a.J(lVar);
        }

        @Override // o53.l1
        public final Object P(t13.d<? super Unit> dVar) {
            return this.f162560a.P(dVar);
        }

        @Override // o53.l1
        public final CancellationException Q() {
            return this.f162560a.Q();
        }

        @Override // o53.l1
        public final j<l1> a() {
            return this.f162560a.a();
        }

        @Override // o53.i0
        public final Object await(t13.d<? super T> dVar) {
            return this.f162560a.await(dVar);
        }

        @Override // o53.l1
        public final void c(CancellationException cancellationException) {
            this.f162560a.c(cancellationException);
        }

        @Override // o53.l1
        public final boolean e() {
            return this.f162560a.e();
        }

        @Override // o53.i0
        public final T f() {
            return this.f162560a.f();
        }

        @Override // t13.g
        public final <R> R fold(R r14, p<? super R, ? super g.a, ? extends R> pVar) {
            return (R) this.f162560a.fold(r14, pVar);
        }

        @Override // t13.g
        public final <E extends g.a> E get(g.b<E> bVar) {
            return (E) this.f162560a.get(bVar);
        }

        @Override // t13.g.a
        public final g.b<?> getKey() {
            return this.f162560a.getKey();
        }

        @Override // o53.l1
        public final boolean isActive() {
            return this.f162560a.isActive();
        }

        @Override // o53.l1
        public final boolean isCancelled() {
            return this.f162560a.isCancelled();
        }

        @Override // t13.g
        public final g minusKey(g.b<?> bVar) {
            return this.f162560a.minusKey(bVar);
        }

        @Override // t13.g
        public final g plus(g gVar) {
            return this.f162560a.plus(gVar);
        }

        @Override // o53.l1
        public final boolean start() {
            return this.f162560a.start();
        }

        @Override // o53.l1
        public final u0 w(boolean z14, boolean z15, n1 n1Var) {
            return this.f162560a.w(z14, z15, n1Var);
        }
    }

    /* JADX INFO: renamed from: t53.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C3062c implements l<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ListenableFuture<T> f162561a;

        public C3062c(ListenableFuture<T> listenableFuture) {
            this.f162561a = listenableFuture;
        }

        @Override // e23.l
        public final Unit invoke(Throwable th3) {
            this.f162561a.cancel(false);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> i0<T> a(ListenableFuture<T> listenableFuture) {
        Throwable thTryInternalFastPathGetFailure;
        if ((listenableFuture instanceof InternalFutureFailureAccess) && (thTryInternalFastPathGetFailure = InternalFutures.tryInternalFastPathGetFailure((InternalFutureFailureAccess) listenableFuture)) != null) {
            s sVarB = gl.b.b();
            sVarB.O(thTryInternalFastPathGetFailure);
            return sVarB;
        }
        if (!listenableFuture.isDone()) {
            s sVarB2 = gl.b.b();
            Futures.addCallback(listenableFuture, new a(sVarB2), MoreExecutors.directExecutor());
            sVarB2.J(new b0(listenableFuture, 17));
            return new b(sVarB2);
        }
        try {
            Object uninterruptibly = Uninterruptibles.getUninterruptibly(listenableFuture);
            s sVar = new s(null);
            sVar.g0(uninterruptibly);
            return sVar;
        } catch (CancellationException e4) {
            s sVarB3 = gl.b.b();
            sVarB3.H(e4);
            return sVarB3;
        } catch (ExecutionException e14) {
            s sVarB4 = gl.b.b();
            Throwable cause = e14.getCause();
            cause.getClass();
            sVarB4.O(cause);
            return sVarB4;
        }
    }

    public static final <T> Object b(ListenableFuture<T> listenableFuture, t13.d<? super T> dVar) throws Throwable {
        try {
            if (listenableFuture.isDone()) {
                return Uninterruptibles.getUninterruptibly(listenableFuture);
            }
            k kVar = new k(f.b(dVar), 1);
            kVar.q();
            listenableFuture.addListener(new d(listenableFuture, kVar), MoreExecutors.directExecutor());
            kVar.r(new C3062c(listenableFuture));
            Object objP = kVar.p();
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            return objP;
        } catch (ExecutionException e4) {
            Throwable cause = e4.getCause();
            cause.getClass();
            throw cause;
        }
    }
}
