package dj2;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lfj2/i;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.customermanagementlib.data.CustomerManagementRepository$retrieveAddressDetail$resource$1", f = "CustomerManagementRepository.kt", l = {316}, m = "invokeSuspend", v = 2)
public final class i0 extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends fj2.i>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f60045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f60046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f60047c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(a aVar, String str, t13.d<? super i0> dVar) {
        super(1, dVar);
        this.f60046b = aVar;
        this.f60047c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new i0(this.f60046b, this.f60047c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends fj2.i>>> dVar) {
        return ((i0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f60045a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        a aVar2 = this.f60046b;
        hj2.e eVar = aVar2.f59959c;
        String str = aVar2.f59962f.getCh.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE java.lang.String();
        this.f60045a = 1;
        Object objA = eVar.a(str, this.f60047c, this);
        return objA == aVar ? aVar : objA;
    }
}
