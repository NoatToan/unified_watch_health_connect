package dj2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.customermanagementlib.data.CustomerManagementRepository$deletePhoneNumber$resource$1", f = "CustomerManagementRepository.kt", l = {177, 177}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public hj2.b f60054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f60055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f60056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f60057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f60058e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(a aVar, String str, t13.d<? super k> dVar) {
        super(1, dVar);
        this.f60057d = aVar;
        this.f60058e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new k(this.f60057d, this.f60058e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
        return ((k) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        hj2.b bVar;
        String str;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f60056c;
        if (i14 == 0) {
            o13.r.b(obj);
            a aVar2 = this.f60057d;
            hj2.b bVar2 = aVar2.f59957a;
            ij2.a aVar3 = aVar2.f59961e;
            String strF = aVar3.f();
            this.f60054a = bVar2;
            this.f60055b = strF;
            this.f60056c = 1;
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
        str = this.f60055b;
        bVar = this.f60054a;
        o13.r.b(obj);
        String str2 = str + "/accountProcessServices/customerAccounts/" + obj + "/phoneNumbers/" + this.f60058e;
        this.f60054a = null;
        this.f60055b = null;
        this.f60056c = 2;
        Object objH = bVar.h(str2, this);
        return objH == aVar ? aVar : objH;
    }
}
