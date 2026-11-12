package dj2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lfj2/h;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.customermanagementlib.data.CustomerManagementRepository$updatePhoneNumber$resource$1", f = "CustomerManagementRepository.kt", l = {169, 169}, m = "invokeSuspend", v = 2)
public final class o0 extends v13.i implements e23.l<t13.d<? super c83.a0<fj2.h>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public hj2.b f60102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f60103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f60104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f60105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f60106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gj2.d f60107f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(a aVar, String str, gj2.d dVar, t13.d<? super o0> dVar2) {
        super(1, dVar2);
        this.f60105d = aVar;
        this.f60106e = str;
        this.f60107f = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new o0(this.f60105d, this.f60106e, this.f60107f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<fj2.h>> dVar) {
        return ((o0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        hj2.b bVar;
        String str;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f60104c;
        if (i14 == 0) {
            o13.r.b(obj);
            a aVar2 = this.f60105d;
            hj2.b bVar2 = aVar2.f59957a;
            ij2.a aVar3 = aVar2.f59961e;
            String strF = aVar3.f();
            this.f60102a = bVar2;
            this.f60103b = strF;
            this.f60104c = 1;
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
        str = this.f60103b;
        bVar = this.f60102a;
        o13.r.b(obj);
        String str2 = str + "/accountProcessServices/customerAccounts/" + obj + "/phoneNumbers/" + this.f60106e;
        this.f60102a = null;
        this.f60103b = null;
        this.f60104c = 2;
        Object objC = bVar.c(str2, this.f60107f, this);
        return objC == aVar ? aVar : objC;
    }
}
