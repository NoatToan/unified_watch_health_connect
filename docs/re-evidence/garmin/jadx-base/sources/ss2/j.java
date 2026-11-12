package ss2;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lss2/x;", "<anonymous>", "(Lo53/b0;)Lss2/x;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.gfdi.auth.AuthHandler$monitorAuthStatus$result$1", f = "AuthHandler.kt", l = {133}, m = "invokeSuspend")
public final class j extends v13.i implements e23.p<b0, t13.d<? super x>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f160816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f160817b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(c cVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f160817b = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f160817b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super x> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f160816a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.s sVar = this.f160817b.f160796n;
        this.f160816a = 1;
        Object objC = sVar.C(this);
        return objC == aVar ? aVar : objC;
    }
}
