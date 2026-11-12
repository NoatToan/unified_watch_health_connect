package dj2;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lfj2/h;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.customermanagementlib.data.CustomerManagementRepository$getPhoneNumbers$resource$1", f = "CustomerManagementRepository.kt", l = {153, 153}, m = "invokeSuspend", v = 2)
public final class d0 extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends fj2.h>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public hj2.b f60006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f60007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f60008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f60009d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(a aVar, t13.d<? super d0> dVar) {
        super(1, dVar);
        this.f60009d = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d0(this.f60009d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends fj2.h>>> dVar) {
        return ((d0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        hj2.b bVar;
        String str;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f60008c;
        if (i14 == 0) {
            o13.r.b(obj);
            a aVar2 = this.f60009d;
            hj2.b bVar2 = aVar2.f59957a;
            ij2.a aVar3 = aVar2.f59961e;
            String strF = aVar3.f();
            this.f60006a = bVar2;
            this.f60007b = strF;
            this.f60008c = 1;
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
        str = this.f60007b;
        bVar = this.f60006a;
        o13.r.b(obj);
        this.f60006a = null;
        this.f60007b = null;
        this.f60008c = 2;
        Object objJ = bVar.j(str + "/accountProcessServices/customerAccounts/" + obj + "/phoneNumbers", this);
        return objJ == aVar ? aVar : objJ;
    }
}
