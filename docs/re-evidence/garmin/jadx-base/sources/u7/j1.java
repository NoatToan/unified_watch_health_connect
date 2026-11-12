package u7;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu7/j1;", "", "<init>", "()V", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z53.b f169173a = z53.c.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o53.s f169174b = gl.b.b();

    public abstract Object a(v13.c cVar);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(v13.c cVar) throws Throwable {
        i1 i1Var;
        z53.a aVar;
        j1 j1Var;
        z53.a aVar2;
        Throwable th3;
        j1 j1Var2;
        if (cVar instanceof i1) {
            i1Var = (i1) cVar;
            int i14 = i1Var.f169168e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                i1Var.f169168e = i14 - Integer.MIN_VALUE;
            } else {
                i1Var = new i1(this, cVar);
            }
        } else {
            i1Var = new i1(this, cVar);
        }
        Object obj = i1Var.f169166c;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = i1Var.f169168e;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                if (this.f169174b.e()) {
                    return Unit.INSTANCE;
                }
                i1Var.f169164a = this;
                aVar = this.f169173a;
                i1Var.f169165b = aVar;
                i1Var.f169168e = 1;
                if (aVar.c(i1Var) != aVar3) {
                    j1Var = this;
                }
                return aVar3;
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = i1Var.f169165b;
                j1Var2 = i1Var.f169164a;
                try {
                    o13.r.b(obj);
                    o53.s sVar = j1Var2.f169174b;
                    Unit unit = Unit.INSTANCE;
                    sVar.g0(unit);
                    aVar2.e(null);
                    return unit;
                } catch (Throwable th4) {
                    th3 = th4;
                    aVar2.e(null);
                    throw th3;
                }
            }
            z53.a aVar4 = i1Var.f169165b;
            j1Var = i1Var.f169164a;
            o13.r.b(obj);
            aVar = aVar4;
            if (j1Var.f169174b.e()) {
                Unit unit2 = Unit.INSTANCE;
                aVar.e(null);
                return unit2;
            }
            i1Var.f169164a = j1Var;
            i1Var.f169165b = aVar;
            i1Var.f169168e = 2;
            if (j1Var.a(i1Var) != aVar3) {
                aVar2 = aVar;
                j1Var2 = j1Var;
                o53.s sVar2 = j1Var2.f169174b;
                Unit unit3 = Unit.INSTANCE;
                sVar2.g0(unit3);
                aVar2.e(null);
                return unit3;
            }
            return aVar3;
        } catch (Throwable th5) {
            aVar2 = aVar;
            th3 = th5;
            aVar2.e(null);
            throw th3;
        }
    }
}
