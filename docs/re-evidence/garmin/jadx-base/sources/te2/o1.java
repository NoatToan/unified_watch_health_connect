package te2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lve2/d;", "<anonymous>", "(Lo53/b0;)Lve2/d;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.biz.ITTicketForCredentialExchanger$execute$2", f = "ITTicketForCredentialExchanger.kt", l = {60}, m = "invokeSuspend")
public final class o1 extends v13.i implements e23.p<o53.b0, t13.d<? super ve2.d>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f164213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f164214b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(s1 s1Var, t13.d<? super o1> dVar) {
        super(2, dVar);
        this.f164214b = s1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o1(this.f164214b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super ve2.d> dVar) {
        return ((o1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE0;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f164213a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        s1 s1Var = this.f164214b;
        sc2.h hVar = s1Var.f164289b;
        s1.b(s1Var, "serviceUrl", hVar.f158505a);
        s1.b(s1Var, "serviceTicket", hVar.f158506b);
        this.f164213a = 1;
        ve2.e eVar = s1Var.f164292e;
        ve2.l lVar = s1Var.f164291d;
        ve2.q qVar = lVar.f177761b;
        if (!qVar.a(sc2.a.f158478d) || qVar.a(sc2.a.f158476b) || qVar.a(sc2.a.f158477c)) {
            sc2.l lVarB = lVar.b(eVar);
            lVarB.getClass();
            x53.c cVar = o53.s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new p1(s1Var, lVarB, null), this);
            if (objE0 != aVar) {
                objE0 = (ve2.d) objE0;
            }
        } else {
            sc2.l lVarC = lVar.c(eVar);
            lVarC.getClass();
            String str = lVarC.f158524a;
            String strD = lVar.d();
            x53.c cVar2 = o53.s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new q1(s1Var, str, strD, null), this);
            if (objE0 != aVar) {
                objE0 = (ve2.d) objE0;
            }
        }
        return objE0 == aVar ? aVar : objE0;
    }
}
