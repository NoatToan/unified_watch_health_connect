package u7;

import kotlinx.coroutines.channels.ClosedSendChannelException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lo53/b0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.datastore.core.DataStoreImpl$updateData$2", f = "DataStoreImpl.kt", l = {169}, m = "invokeSuspend")
public final class e0 extends v13.i implements e23.p<o53.b0, t13.d<Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f169114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f169115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m<Object> f169116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.p<Object, t13.d<Object>, Object> f169117d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e0(m<Object> mVar, e23.p<Object, ? super t13.d<Object>, ? extends Object> pVar, t13.d<? super e0> dVar) {
        super(2, dVar);
        this.f169116c = mVar;
        this.f169117d = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e0 e0Var = new e0(this.f169116c, this.f169117d, dVar);
        e0Var.f169115b = obj;
        return e0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<Object> dVar) {
        return ((e0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f169114a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.b0 b0Var = (o53.b0) this.f169115b;
        o53.s sVarB = gl.b.b();
        m<Object> mVar = this.f169116c;
        u0.a aVar2 = new u0.a(this.f169117d, sVarB, mVar.f169195h.a(), b0Var.getF195311f());
        m1<u0.a<Object>> m1Var = mVar.f169199l;
        Object objI = m1Var.f169233c.i(aVar2);
        if (objI instanceof q53.m.a) {
            q53.m.c cVar = (q53.m.c) objI;
            q53.m.b bVar = q53.m.f142998b;
            q53.m.a aVar3 = cVar instanceof q53.m.a ? (q53.m.a) cVar : null;
            Throwable th3 = aVar3 != null ? aVar3.f143001a : null;
            if (th3 == null) {
                throw new ClosedSendChannelException("Channel was closed normally");
            }
            throw th3;
        }
        q53.m.b bVar2 = q53.m.f142998b;
        if (objI instanceof q53.m.c) {
            vb.h.z("Check failed.");
            return null;
        }
        if (m1Var.f169234d.f169086a.getAndIncrement() == 0) {
            ge1.b.T(m1Var.f169231a, null, null, new n1(m1Var, null), 3);
        }
        this.f169114a = 1;
        Object objC = sVarB.C(this);
        return objC == aVar ? aVar : objC;
    }
}
