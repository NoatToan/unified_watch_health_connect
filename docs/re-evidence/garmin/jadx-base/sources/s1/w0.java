package s1;

import androidx.compose.animation.core.MutationInterruptedException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lo53/b0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.animation.core.MutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {178, 126}, m = "invokeSuspend", v = 1)
public final class w0 extends v13.i implements e23.p<o53.b0, t13.d<Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z53.a f155827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f155828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v0 f155829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f155830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f155831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u0 f155832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v0 f155833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e23.l<t13.d<Object>, Object> f155834h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w0(u0 u0Var, v0 v0Var, e23.l<? super t13.d<Object>, ? extends Object> lVar, t13.d<? super w0> dVar) {
        super(2, dVar);
        this.f155832f = u0Var;
        this.f155833g = v0Var;
        this.f155834h = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        w0 w0Var = new w0(this.f155832f, this.f155833g, this.f155834h, dVar);
        w0Var.f155831e = obj;
        return w0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<Object> dVar) {
        return ((w0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, z53.a] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        v0 v0Var;
        z53.a aVar;
        e23.l<t13.d<Object>, Object> lVar;
        v0.a aVar2;
        z53.a aVar3;
        v0 v0Var2;
        Throwable th3;
        v0.a aVar4;
        AtomicReference<v0.a> atomicReference;
        AtomicReference<v0.a> atomicReference2;
        u13.a aVar5 = u13.a.COROUTINE_SUSPENDED;
        ?? r14 = this.f155830d;
        try {
            try {
                if (r14 == 0) {
                    o13.r.b(obj);
                    t13.g.a aVar6 = ((o53.b0) this.f155831e).getF195311f().get(o53.l1.f129368i0);
                    aVar6.getClass();
                    v0.a aVar7 = new v0.a(this.f155832f, (o53.l1) aVar6);
                    v0Var = this.f155833g;
                    AtomicReference<v0.a> atomicReference3 = v0Var.f155815a;
                    loop2: while (true) {
                        v0.a aVar8 = atomicReference3.get();
                        if (aVar8 != null && aVar7.f155817a.compareTo(aVar8.f155817a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        do {
                            if (atomicReference3.compareAndSet(aVar8, aVar7)) {
                                if (aVar8 != null) {
                                    aVar8.f155818b.c(new MutationInterruptedException());
                                }
                                aVar = v0Var.f155816b;
                                this.f155831e = aVar7;
                                this.f155827a = aVar;
                                e23.l<t13.d<Object>, Object> lVar2 = this.f155834h;
                                this.f155828b = lVar2;
                                this.f155829c = v0Var;
                                this.f155830d = 1;
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
                        v0Var2 = (v0) this.f155828b;
                        aVar3 = this.f155827a;
                        aVar4 = (v0.a) this.f155831e;
                        try {
                            o13.r.b(obj);
                            atomicReference2 = v0Var2.f155815a;
                            while (!atomicReference2.compareAndSet(aVar4, null) && atomicReference2.get() == aVar4) {
                            }
                            aVar3.e(null);
                            return obj;
                        } catch (Throwable th4) {
                            th3 = th4;
                            atomicReference = v0Var2.f155815a;
                            while (!atomicReference.compareAndSet(aVar4, null)) {
                            }
                            throw th3;
                        }
                    }
                    v0 v0Var3 = this.f155829c;
                    lVar = (e23.l) this.f155828b;
                    aVar = this.f155827a;
                    aVar2 = (v0.a) this.f155831e;
                    o13.r.b(obj);
                    v0Var = v0Var3;
                }
                this.f155831e = aVar2;
                this.f155827a = aVar3;
                this.f155828b = v0Var;
                this.f155829c = null;
                this.f155830d = 2;
                Object objInvoke = lVar.invoke(this);
                if (objInvoke != aVar5) {
                    v0Var2 = v0Var;
                    obj = objInvoke;
                    aVar4 = aVar2;
                    atomicReference2 = v0Var2.f155815a;
                    while (!atomicReference2.compareAndSet(aVar4, null)) {
                    }
                    aVar3.e(null);
                    return obj;
                }
                return aVar5;
            } catch (Throwable th5) {
                v0Var2 = v0Var;
                th3 = th5;
                aVar4 = aVar2;
                atomicReference = v0Var2.f155815a;
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
