package rg0;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedUserConsentViewModel$sendInvite$1", f = "AuthorizedUserConsentViewModel.kt", l = {52}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p2 f152556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f152557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.a f152558c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.a aVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f152558c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f152558c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        p2 p2Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152557b;
        com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.a aVar2 = this.f152558c;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var2 = aVar2.f35019d;
            re0.h hVar = aVar2.f35017b;
            long j8 = aVar2.f35016a;
            this.f152556a = p2Var2;
            this.f152557b = 1;
            Object objD = hVar.d(j8, this);
            if (objD == aVar) {
                return aVar;
            }
            p2Var = p2Var2;
            obj = objD;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p2Var = this.f152556a;
            o13.r.b(obj);
        }
        p2Var.setValue(obj);
        aVar2.f35020e.k(null, Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
