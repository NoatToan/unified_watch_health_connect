package u1;

import java.util.concurrent.atomic.AtomicReference;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lo53/b0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", l = {212, 167}, m = "invokeSuspend", v = 1)
public final class m1 extends v13.i implements e23.p<o53.b0, t13.d<Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z53.a f167615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f167616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f167617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l1 f167618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f167619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f167620f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k1 f167621g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l1 f167622h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e23.p<Object, t13.d<Object>, Object> f167623i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f167624j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m1(k1 k1Var, l1 l1Var, e23.p<Object, ? super t13.d<Object>, ? extends Object> pVar, Object obj, t13.d<? super m1> dVar) {
        super(2, dVar);
        this.f167621g = k1Var;
        this.f167622h = l1Var;
        this.f167623i = pVar;
        this.f167624j = obj;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        m1 m1Var = new m1(this.f167621g, this.f167622h, this.f167623i, this.f167624j, dVar);
        m1Var.f167620f = obj;
        return m1Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<Object> dVar) {
        return ((m1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, z53.a] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        l1 l1Var;
        Object obj2;
        l1.a aVar;
        z53.a aVar2;
        e23.p<Object, t13.d<Object>, Object> pVar;
        l1 l1Var2;
        Throwable th3;
        l1.a aVar3;
        AtomicReference<l1.a> atomicReference;
        AtomicReference<l1.a> atomicReference2;
        u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
        ?? r14 = this.f167619e;
        try {
            try {
                if (r14 == 0) {
                    o13.r.b(obj);
                    t13.g.a aVar5 = ((o53.b0) this.f167620f).getF195311f().get(o53.l1.f129368i0);
                    aVar5.getClass();
                    l1.a aVar6 = new l1.a(this.f167621g, (o53.l1) aVar5);
                    l1Var = this.f167622h;
                    l1.a(l1Var, aVar6);
                    z53.b bVar = l1Var.f167599b;
                    this.f167620f = aVar6;
                    this.f167615a = bVar;
                    e23.p<Object, t13.d<Object>, Object> pVar2 = this.f167623i;
                    this.f167616b = pVar2;
                    Object obj3 = this.f167624j;
                    this.f167617c = obj3;
                    this.f167618d = l1Var;
                    this.f167619e = 1;
                    if (bVar.c(this) != aVar4) {
                        obj2 = obj3;
                        aVar = aVar6;
                        aVar2 = bVar;
                        pVar = pVar2;
                    }
                    return aVar4;
                }
                if (r14 != 1) {
                    if (r14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    l1Var2 = (l1) this.f167616b;
                    aVar2 = this.f167615a;
                    aVar3 = (l1.a) this.f167620f;
                    try {
                        o13.r.b(obj);
                        atomicReference2 = l1Var2.f167598a;
                        while (!atomicReference2.compareAndSet(aVar3, null) && atomicReference2.get() == aVar3) {
                        }
                        aVar2.e(null);
                        return obj;
                    } catch (Throwable th4) {
                        th3 = th4;
                        atomicReference = l1Var2.f167598a;
                        while (!atomicReference.compareAndSet(aVar3, null)) {
                        }
                        throw th3;
                    }
                }
                l1 l1Var3 = this.f167618d;
                obj2 = this.f167617c;
                pVar = (e23.p) this.f167616b;
                z53.a aVar7 = this.f167615a;
                aVar = (l1.a) this.f167620f;
                o13.r.b(obj);
                l1Var = l1Var3;
                aVar2 = aVar7;
                this.f167620f = aVar;
                this.f167615a = aVar2;
                this.f167616b = l1Var;
                this.f167617c = null;
                this.f167618d = null;
                this.f167619e = 2;
                Object objInvoke = pVar.invoke(obj2, this);
                if (objInvoke != aVar4) {
                    l1Var2 = l1Var;
                    obj = objInvoke;
                    aVar3 = aVar;
                    atomicReference2 = l1Var2.f167598a;
                    while (!atomicReference2.compareAndSet(aVar3, null)) {
                    }
                    aVar2.e(null);
                    return obj;
                }
                return aVar4;
            } catch (Throwable th5) {
                l1Var2 = l1Var;
                th3 = th5;
                aVar3 = aVar;
                atomicReference = l1Var2.f167598a;
                while (!atomicReference.compareAndSet(aVar3, null) && atomicReference.get() == aVar3) {
                }
                throw th3;
            }
        } catch (Throwable th6) {
            r14.e(null);
            throw th6;
        }
    }
}
