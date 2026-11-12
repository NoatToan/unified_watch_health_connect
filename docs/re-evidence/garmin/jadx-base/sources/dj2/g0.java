package dj2;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lfj2/k;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.customermanagementlib.data.CustomerManagementRepository$getStates$resource$1", f = "CustomerManagementRepository.kt", l = {217}, m = "invokeSuspend", v = 2)
public final class g0 extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends fj2.k>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f60031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f60032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f60033c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(a aVar, String str, t13.d<? super g0> dVar) {
        super(1, dVar);
        this.f60032b = aVar;
        this.f60033c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new g0(this.f60032b, this.f60033c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends fj2.k>>> dVar) {
        return ((g0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f60031a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        a aVar2 = this.f60032b;
        hj2.b bVar = aVar2.f59957a;
        String strH = com.nimbusds.jose.shaded.gson.internal.a.h(aVar2.f59961e.d(), "/geography-services/countries/", this.f60033c, "/subcountries");
        this.f60031a = 1;
        Object objD = bVar.d(strH, this);
        return objD == aVar ? aVar : objD;
    }
}
