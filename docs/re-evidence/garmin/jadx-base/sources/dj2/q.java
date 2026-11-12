package dj2;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lfj2/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.customermanagementlib.data.CustomerManagementRepository$getAddresses$resource$1", f = "CustomerManagementRepository.kt", l = {96, 96}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends fj2.a>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public hj2.b f60119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f60120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f60121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f60122d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(a aVar, t13.d<? super q> dVar) {
        super(1, dVar);
        this.f60122d = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new q(this.f60122d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends fj2.a>>> dVar) {
        return ((q) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        hj2.b bVar;
        String str;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f60121c;
        if (i14 == 0) {
            o13.r.b(obj);
            a aVar2 = this.f60122d;
            hj2.b bVar2 = aVar2.f59957a;
            ij2.a aVar3 = aVar2.f59961e;
            String strF = aVar3.f();
            this.f60119a = bVar2;
            this.f60120b = strF;
            this.f60121c = 1;
            obj = aVar3.j(this);
            if (obj != aVar) {
                bVar = bVar2;
                str = strF;
            }
        }
        if (i14 != 1) {
            if (i14 == 2) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = this.f60120b;
        bVar = this.f60119a;
        o13.r.b(obj);
        this.f60119a = null;
        this.f60120b = null;
        this.f60121c = 2;
        Object objI = bVar.i(str + "/accountProcessServices/customerAccounts/" + obj + "/address", this);
        return objI == aVar ? aVar : objI;
    }
}
