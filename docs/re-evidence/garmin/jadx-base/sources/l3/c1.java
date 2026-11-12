package l3;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lo53/b0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.material3.internal.InternalMutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {179, 103}, m = "invokeSuspend")
public final class c1 extends v13.i implements e23.p<o53.b0, t13.d<Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z53.a f109194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f109195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b1 f109196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f109197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f109198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u1.k1 f109199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b1 f109200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e23.l<t13.d<Object>, Object> f109201h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c1(u1.k1 k1Var, b1 b1Var, e23.l<? super t13.d<Object>, ? extends Object> lVar, t13.d<? super c1> dVar) {
        super(2, dVar);
        this.f109199f = k1Var;
        this.f109200g = b1Var;
        this.f109201h = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c1 c1Var = new c1(this.f109199f, this.f109200g, this.f109201h, dVar);
        c1Var.f109198e = obj;
        return c1Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<Object> dVar) {
        return ((c1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, z53.a] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b1 b1Var;
        z53.a aVar;
        e23.l<t13.d<Object>, Object> lVar;
        b1.a aVar2;
        z53.a aVar3;
        b1 b1Var2;
        Throwable th3;
        b1.a aVar4;
        AtomicReference<b1.a> atomicReference;
        AtomicReference<b1.a> atomicReference2;
        u13.a aVar5 = u13.a.COROUTINE_SUSPENDED;
        ?? r14 = this.f109197d;
        try {
            try {
                if (r14 == 0) {
                    o13.r.b(obj);
                    t13.g.a aVar6 = ((o53.b0) this.f109198e).getF195311f().get(o53.l1.f129368i0);
                    aVar6.getClass();
                    b1.a aVar7 = new b1.a(this.f109199f, (o53.l1) aVar6);
                    b1Var = this.f109200g;
                    AtomicReference<b1.a> atomicReference3 = b1Var.f109181a;
                    loop2: while (true) {
                        b1.a aVar8 = atomicReference3.get();
                        if (aVar8 != null && aVar7.f109183a.compareTo(aVar8.f109183a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        do {
                            if (atomicReference3.compareAndSet(aVar8, aVar7)) {
                                if (aVar8 != null) {
                                    aVar8.f109184b.c(null);
                                }
                                aVar = b1Var.f109182b;
                                this.f109198e = aVar7;
                                this.f109194a = aVar;
                                e23.l<t13.d<Object>, Object> lVar2 = this.f109201h;
                                this.f109195b = lVar2;
                                this.f109196c = b1Var;
                                this.f109197d = 1;
                                if (aVar.c(this) != aVar5) {
                                    lVar = lVar2;
                                    aVar2 = aVar7;
                                    break loop2;
                                }
                                return aVar5;
                            }
                        } while (atomicReference3.get() == aVar8);
                    }
                } else {
                    if (r14 != 1) {
                        if (r14 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b1Var2 = (b1) this.f109195b;
                        aVar3 = this.f109194a;
                        aVar4 = (b1.a) this.f109198e;
                        try {
                            o13.r.b(obj);
                            atomicReference2 = b1Var2.f109181a;
                            while (!atomicReference2.compareAndSet(aVar4, null) && atomicReference2.get() == aVar4) {
                            }
                            aVar3.e(null);
                            return obj;
                        } catch (Throwable th4) {
                            th3 = th4;
                            atomicReference = b1Var2.f109181a;
                            while (!atomicReference.compareAndSet(aVar4, null)) {
                            }
                            throw th3;
                        }
                    }
                    b1 b1Var3 = this.f109196c;
                    lVar = (e23.l) this.f109195b;
                    aVar = this.f109194a;
                    aVar2 = (b1.a) this.f109198e;
                    o13.r.b(obj);
                    b1Var = b1Var3;
                }
                this.f109198e = aVar2;
                this.f109194a = aVar3;
                this.f109195b = b1Var;
                this.f109196c = null;
                this.f109197d = 2;
                Object objInvoke = lVar.invoke(this);
                if (objInvoke != aVar5) {
                    b1Var2 = b1Var;
                    obj = objInvoke;
                    aVar4 = aVar2;
                    atomicReference2 = b1Var2.f109181a;
                    while (!atomicReference2.compareAndSet(aVar4, null)) {
                    }
                    aVar3.e(null);
                    return obj;
                }
                return aVar5;
            } catch (Throwable th5) {
                b1Var2 = b1Var;
                th3 = th5;
                aVar4 = aVar2;
                atomicReference = b1Var2.f109181a;
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
