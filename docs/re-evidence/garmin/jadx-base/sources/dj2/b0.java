package dj2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lfj2/h;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.customermanagementlib.data.CustomerManagementRepository$getPhoneNumber$resource$1", f = "CustomerManagementRepository.kt", l = {161, 161}, m = "invokeSuspend", v = 2)
public final class b0 extends v13.i implements e23.l<t13.d<? super c83.a0<fj2.h>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public hj2.b f59988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f59989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f59990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f59991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f59992e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(a aVar, String str, t13.d<? super b0> dVar) {
        super(1, dVar);
        this.f59991d = aVar;
        this.f59992e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b0(this.f59991d, this.f59992e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<fj2.h>> dVar) {
        return ((b0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        hj2.b bVar;
        String str;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f59990c;
        if (i14 == 0) {
            o13.r.b(obj);
            a aVar2 = this.f59991d;
            hj2.b bVar2 = aVar2.f59957a;
            ij2.a aVar3 = aVar2.f59961e;
            String strF = aVar3.f();
            this.f59988a = bVar2;
            this.f59989b = strF;
            this.f59990c = 1;
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
        str = this.f59989b;
        bVar = this.f59988a;
        o13.r.b(obj);
        String str2 = str + "/accountProcessServices/customerAccounts/" + obj + "/phoneNumbers/" + this.f59992e;
        this.f59988a = null;
        this.f59989b = null;
        this.f59990c = 2;
        Object objM = bVar.m(str2, this);
        return objM == aVar ? aVar : objM;
    }
}
