package mk1;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.thirdparty.presentation.thirdpartyapps.ThirdPartyAppNotSupportedScreenKt$ThirdPartyAppNotSupportedScreen$2$1", f = "ThirdPartyAppNotSupportedScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {
        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return new a(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            ht.a.f85464a.getClass();
            ht.a.a(null, "PageViewChildThirdPartyApps");
            return Unit.INSTANCE;
        }
    }

    public static final void a(e23.a<Unit> aVar, m mVar, int i14) {
        aVar.getClass();
        o0 o0VarE = mVar.E(929572843);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            z3.e eVarC = z3.f.c(-416578640, new ll1.g(aVar, 10), o0VarE);
            mk1.a.f119141a.getClass();
            z02.d.a(false, eVarC, null, null, null, mk1.a.f119142b, o0VarE, 196656, 29);
            Unit unit = Unit.INSTANCE;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new a(null);
                o0VarE.K(objQ);
            }
            l0.e((p) objQ, unit, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ll1.g(aVar, i14, 11);
        }
    }
}
