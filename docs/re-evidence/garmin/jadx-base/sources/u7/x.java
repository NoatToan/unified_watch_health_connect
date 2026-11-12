package u7;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lo13/p;", "Lu7/r1;", "", "<anonymous>", "()Lo13/p;"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", f = "DataStoreImpl.kt", l = {298, 300}, m = "invokeSuspend")
public final class x extends v13.i implements e23.l<t13.d<? super o13.p<? extends r1<Object>, ? extends Boolean>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Throwable f169359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f169360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m<Object> f169361c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(m<Object> mVar, t13.d<? super x> dVar) {
        super(1, dVar);
        this.f169361c = mVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new x(this.f169361c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super o13.p<? extends r1<Object>, ? extends Boolean>> dVar) {
        return ((x) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Throwable th3;
        r1 g1Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f169360b;
        m<Object> mVar = this.f169361c;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                this.f169360b = 1;
                obj = m.f(mVar, true, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th3 = this.f169359a;
                    o13.r.b(obj);
                    g1Var = new g1(th3, ((Number) obj).intValue());
                    return new o13.p(g1Var, Boolean.TRUE);
                }
                o13.r.b(obj);
            }
            g1Var = (r1) obj;
        } catch (Throwable th4) {
            int i15 = m.f169187m;
            t0 t0VarG = mVar.g();
            this.f169359a = th4;
            this.f169360b = 2;
            Object objE = t0VarG.e(this);
            if (objE != aVar) {
                th3 = th4;
                obj = objE;
            }
            return aVar;
        }
        return new o13.p(g1Var, Boolean.TRUE);
    }
}
