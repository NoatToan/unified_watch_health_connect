package u1;

import androidx.compose.foundation.MutationInterruptedException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lu1/l1;", "", "<init>", "()V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<a> f167598a = new AtomicReference<>(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z53.b f167599b = z53.c.a();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lu1/l1$a;", "", "Lu1/k1;", "priority", "Lo53/l1;", "job", "<init>", "(Lu1/k1;Lo53/l1;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k1 f167600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o53.l1 f167601b;

        public a(k1 k1Var, o53.l1 l1Var) {
            this.f167600a = k1Var;
            this.f167601b = l1Var;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lo53/b0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.MutatorMutex$mutate$2", f = "MutatorMutex.kt", l = {212, 127}, m = "invokeSuspend", v = 1)
    public static final class b<R> extends v13.i implements e23.p<o53.b0, t13.d<? super R>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z53.a f167602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f167603b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public l1 f167604c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f167605d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f167606e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ k1 f167607f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ l1 f167608g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ e23.l<t13.d<? super R>, Object> f167609h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(k1 k1Var, l1 l1Var, e23.l<? super t13.d<? super R>, ? extends Object> lVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f167607f = k1Var;
            this.f167608g = l1Var;
            this.f167609h = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = new b(this.f167607f, this.f167608g, this.f167609h, dVar);
            bVar.f167606e = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, Object obj) {
            return ((b) create(b0Var, (t13.d) obj)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, z53.a] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            l1 l1Var;
            z53.a aVar;
            e23.l<t13.d<? super R>, Object> lVar;
            a aVar2;
            z53.a aVar3;
            l1 l1Var2;
            Throwable th3;
            a aVar4;
            AtomicReference<a> atomicReference;
            AtomicReference<a> atomicReference2;
            u13.a aVar5 = u13.a.COROUTINE_SUSPENDED;
            ?? r14 = this.f167605d;
            try {
                try {
                    if (r14 == 0) {
                        o13.r.b(obj);
                        t13.g.a aVar6 = ((o53.b0) this.f167606e).getF135150b().get(o53.l1.f129368i0);
                        aVar6.getClass();
                        a aVar7 = new a(this.f167607f, (o53.l1) aVar6);
                        l1Var = this.f167608g;
                        l1.a(l1Var, aVar7);
                        aVar = l1Var.f167599b;
                        this.f167606e = aVar7;
                        this.f167602a = aVar;
                        e23.l<t13.d<? super R>, Object> lVar2 = this.f167609h;
                        this.f167603b = lVar2;
                        this.f167604c = l1Var;
                        this.f167605d = 1;
                        if (aVar.c(this) != aVar5) {
                            lVar = lVar2;
                            aVar2 = aVar7;
                        }
                        return aVar5;
                    }
                    if (r14 != 1) {
                        if (r14 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        l1Var2 = (l1) this.f167603b;
                        aVar3 = this.f167602a;
                        aVar4 = (a) this.f167606e;
                        try {
                            o13.r.b(obj);
                            atomicReference2 = l1Var2.f167598a;
                            while (!atomicReference2.compareAndSet(aVar4, null) && atomicReference2.get() == aVar4) {
                            }
                            aVar3.e(null);
                            return obj;
                        } catch (Throwable th4) {
                            th3 = th4;
                            atomicReference = l1Var2.f167598a;
                            while (!atomicReference.compareAndSet(aVar4, null)) {
                            }
                            throw th3;
                        }
                    }
                    l1 l1Var3 = this.f167604c;
                    lVar = (e23.l) this.f167603b;
                    aVar = this.f167602a;
                    aVar2 = (a) this.f167606e;
                    o13.r.b(obj);
                    l1Var = l1Var3;
                    this.f167606e = aVar2;
                    this.f167602a = aVar3;
                    this.f167603b = l1Var;
                    this.f167604c = null;
                    this.f167605d = 2;
                    Object objInvoke = lVar.invoke(this);
                    if (objInvoke != aVar5) {
                        l1Var2 = l1Var;
                        obj = objInvoke;
                        aVar4 = aVar2;
                        atomicReference2 = l1Var2.f167598a;
                        while (!atomicReference2.compareAndSet(aVar4, null)) {
                        }
                        aVar3.e(null);
                        return obj;
                    }
                    return aVar5;
                } catch (Throwable th5) {
                    l1Var2 = l1Var;
                    th3 = th5;
                    aVar4 = aVar2;
                    atomicReference = l1Var2.f167598a;
                    while (!atomicReference.compareAndSet(aVar4, null) && atomicReference.get() == aVar4) {
                    }
                    throw th3;
                }
                aVar3 = aVar;
            } catch (Throwable th6) {
                r14.e(null);
                throw th6;
            }
        }
    }

    public static final void a(l1 l1Var, a aVar) {
        AtomicReference<a> atomicReference = l1Var.f167598a;
        while (true) {
            a aVar2 = atomicReference.get();
            if (aVar2 != null && aVar.f167600a.compareTo(aVar2.f167600a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            do {
                if (atomicReference.compareAndSet(aVar2, aVar)) {
                    if (aVar2 != null) {
                        aVar2.f167601b.c(new MutationInterruptedException());
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == aVar2);
        }
    }

    public final <R> Object b(k1 k1Var, e23.l<? super t13.d<? super R>, ? extends Object> lVar, t13.d<? super R> dVar) {
        return o53.c0.e(new b(k1Var, this, lVar, null), dVar);
    }
}
