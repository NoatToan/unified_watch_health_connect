package dj2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lfj2/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.customermanagementlib.data.CustomerManagementRepository$validateAddress$resource$1", f = "CustomerManagementRepository.kt", l = {245}, m = "invokeSuspend", v = 2)
public final class q0 extends v13.i implements e23.l<t13.d<? super c83.a0<fj2.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f60123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f60124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gj2.b f60125c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(a aVar, gj2.b bVar, t13.d<? super q0> dVar) {
        super(1, dVar);
        this.f60124b = aVar;
        this.f60125c = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new q0(this.f60124b, this.f60125c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<fj2.b>> dVar) {
        return ((q0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f60123a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        a aVar2 = this.f60124b;
        hj2.b bVar = aVar2.f59957a;
        String strConcat = aVar2.f59961e.d().concat("/geography-services/addresses/validation");
        this.f60123a = 1;
        Object objE = bVar.e(strConcat, this.f60125c, this);
        return objE == aVar ? aVar : objE;
    }
}
