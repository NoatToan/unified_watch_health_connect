package n70;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lj70/r;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetUserFocusUseCase$invoke$1", f = "GetUserFocusUseCase.kt", l = {30, 54}, m = "invokeSuspend", v = 2)
public final class p6 extends v13.i implements e23.p<q53.t<? super j70.r>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f124496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f124497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o6 f124498c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(o6 o6Var, t13.d<? super p6> dVar) {
        super(2, dVar);
        this.f124498c = o6Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        p6 p6Var = new p6(this.f124498c, dVar);
        p6Var.f124497b = obj;
        return p6Var;
    }

    @Override // e23.p
    public final Object invoke(q53.t<? super j70.r> tVar, t13.d<? super Unit> dVar) {
        return ((p6) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        if (r10 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e3, code lost:
    
        if (q53.r.a(r0, r2, r9) == r1) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        q53.t tVar = (q53.t) this.f124497b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f124496a;
        o6 o6Var = this.f124498c;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        String strH4 = o6Var.f124464a.h4();
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
        String strN = fb1.c.n("GetUserFocusUseCase userFocus ", strH4);
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.a(a2Var, strN);
        if (strH4 != null) {
            j70.r.f97623f.getClass();
            j70.r rVarA = j70.r.a.a(strH4);
            if (rVarA == null) {
                rVarA = j70.r.f97627j;
            }
            q53.m.a(tVar.i(rVarA));
            lp.k kVar = new lp.k(tVar, o6Var, 4);
            o6Var.f124464a.u3(kVar);
            mt0.s1 s1Var = new mt0.s1(9, o6Var, kVar);
            this.f124497b = null;
            this.f124496a = 2;
        } else {
            com.garmin.android.apps.connectmobile.i2.a.a(a2Var, "GetUserFocusUseCase getUserFocus");
            l70.n0 n0Var = o6Var.f124465b;
            this.f124497b = tVar;
            this.f124496a = 1;
            obj = n0Var.j3(this);
        }
        return aVar;
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) obj;
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
            j70.y yVar = (j70.y) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
            String strN2 = fb1.c.n("GetUserFocusUseCase getUserFocus SUCCESS ", yVar.getUserFocus());
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.a(a2Var2, strN2);
            j70.r.a aVar2 = j70.r.f97623f;
            String userFocus = yVar.getUserFocus();
            aVar2.getClass();
            j70.r rVarA2 = j70.r.a.a(userFocus);
            if (rVarA2 == null) {
                rVarA2 = j70.r.f97627j;
            }
            q53.m.a(tVar.i(rVarA2));
        } else {
            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                lc.u0.r();
                return null;
            }
            com.garmin.android.apps.connectmobile.a2 a2Var3 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
            Integer num = ((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47384b;
            String strG = androidx.room.a0.g(num, "GetUserFocusUseCase getUserFocus ERROR response code ");
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.a(a2Var3, strG);
            if (num != null && num.intValue() == 404) {
                tVar.i(j70.r.f97629l);
            }
            Unit unit = Unit.INSTANCE;
        }
        lp.k kVar2 = new lp.k(tVar, o6Var, 4);
        o6Var.f124464a.u3(kVar2);
        mt0.s1 s1Var2 = new mt0.s1(9, o6Var, kVar2);
        this.f124497b = null;
        this.f124496a = 2;
    }
}
