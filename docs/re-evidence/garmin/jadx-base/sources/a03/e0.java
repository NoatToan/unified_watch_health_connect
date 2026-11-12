package a03;

import java.util.concurrent.CancellationException;
import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import u1.k1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lo53/b0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.skydoves.flexible.core.InternalMutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {225, 147}, m = "invokeSuspend")
public final class e0 extends v13.i implements e23.p<o53.b0, t13.d<Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z53.a f80a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f81b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d0 f82c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f83d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f84e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k1 f85f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d0 f86g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e23.l<t13.d<Object>, Object> f87h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e0(k1 k1Var, d0 d0Var, e23.l<? super t13.d<Object>, ? extends Object> lVar, t13.d<? super e0> dVar) {
        super(2, dVar);
        this.f85f = k1Var;
        this.f86g = d0Var;
        this.f87h = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e0 e0Var = new e0(this.f85f, this.f86g, this.f87h, dVar);
        e0Var.f84e = obj;
        return e0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<Object> dVar) {
        return ((e0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00bf A[Catch: all -> 0x00c5, TRY_LEAVE, TryCatch #0 {all -> 0x00c5, blocks: (B:36:0x00b3, B:38:0x00bf, B:45:0x00cc, B:47:0x00d8, B:48:0x00da), top: B:51:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d8 A[Catch: all -> 0x00c5, TryCatch #0 {all -> 0x00c5, blocks: (B:36:0x00b3, B:38:0x00bf, B:45:0x00cc, B:47:0x00d8, B:48:0x00da), top: B:51:0x0007 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, z53.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, a03.d0$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [a03.d0$a] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        d0 d0Var;
        d0.a aVar;
        f0<d0.a> f0Var;
        z53.a aVar2;
        e23.l<t13.d<Object>, Object> lVar;
        ?? r14;
        z53.a aVar3;
        d0 d0Var2;
        Throwable th3;
        ?? r15;
        ?? r16;
        f0<d0.a> f0Var2;
        f0<d0.a> f0Var3;
        u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
        ?? r17 = this.f83d;
        try {
            try {
                if (r17 == 0) {
                    o13.r.b(obj);
                    t13.g.a aVar5 = ((o53.b0) this.f84e).getF195311f().get(l1.f129368i0);
                    aVar5.getClass();
                    ?? aVar6 = new d0.a(this.f85f, (l1) aVar5);
                    d0Var = this.f86g;
                    b<d0.a> bVar = d0Var.f74a;
                    do {
                        aVar = bVar.f68a.f90a;
                        if (aVar != null && aVar6.f76a.compareTo(aVar.f76a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        f0Var = bVar.f68a;
                    } while (!p005kotlin.jvm.internal.s.g(f0Var.f90a, aVar));
                    f0Var.f90a = aVar6;
                    if (aVar != null) {
                        aVar.f77b.c(null);
                    }
                    aVar2 = d0Var.f75b;
                    this.f84e = aVar6;
                    this.f80a = aVar2;
                    e23.l<t13.d<Object>, Object> lVar2 = this.f87h;
                    this.f81b = lVar2;
                    this.f82c = d0Var;
                    this.f83d = 1;
                    if (aVar2.c(this) != aVar4) {
                        lVar = lVar2;
                        r14 = aVar6;
                    }
                    return aVar4;
                }
                if (r17 != 1) {
                    if (r17 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    d0Var2 = (d0) this.f81b;
                    aVar3 = this.f80a;
                    r15 = (d0.a) this.f84e;
                    try {
                        o13.r.b(obj);
                        r16 = r15;
                        f0Var3 = d0Var2.f74a.f68a;
                        if (p005kotlin.jvm.internal.s.g(f0Var3.f90a, r16)) {
                            f0Var3.f90a = null;
                        }
                        aVar3.e(null);
                        return obj;
                    } catch (Throwable th4) {
                        th3 = th4;
                        f0Var2 = d0Var2.f74a.f68a;
                        if (p005kotlin.jvm.internal.s.g(f0Var2.f90a, r15)) {
                            f0Var2.f90a = null;
                        }
                        throw th3;
                    }
                }
                d0 d0Var3 = this.f82c;
                lVar = (e23.l) this.f81b;
                aVar2 = this.f80a;
                d0.a aVar7 = (d0.a) this.f84e;
                o13.r.b(obj);
                d0Var = d0Var3;
                r14 = aVar7;
                this.f84e = r14;
                this.f80a = aVar3;
                this.f81b = d0Var;
                this.f82c = null;
                this.f83d = 2;
                Object objInvoke = lVar.invoke(this);
                if (objInvoke != aVar4) {
                    d0Var2 = d0Var;
                    obj = objInvoke;
                    r16 = r14;
                    f0Var3 = d0Var2.f74a.f68a;
                    if (p005kotlin.jvm.internal.s.g(f0Var3.f90a, r16)) {
                        f0Var3.f90a = null;
                    }
                    aVar3.e(null);
                    return obj;
                }
                return aVar4;
            } catch (Throwable th5) {
                d0Var2 = d0Var;
                th3 = th5;
                r15 = r14;
                f0Var2 = d0Var2.f74a.f68a;
                if (p005kotlin.jvm.internal.s.g(f0Var2.f90a, r15)) {
                    f0Var2.f90a = null;
                }
                throw th3;
            }
            aVar3 = aVar2;
        } catch (Throwable th6) {
            r17.e(null);
            throw th6;
        }
    }
}
