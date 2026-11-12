package qx0;

import e23.l;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;
import q72.f;
import v13.i;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.v2.screen.init.MctInitScreenKt$MctInitScreen$1$1", f = "MctInitScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<e, Unit> f148404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<e> f148405b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super e, Unit> lVar, x3<? extends e> x3Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f148404a = lVar;
            this.f148405b = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f148404a, this.f148405b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            e f182175a = this.f148405b.getF182175a();
            if (f182175a != null) {
                this.f148404a.invoke(f182175a);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(d dVar, l<? super e, Unit> lVar, m mVar, int i14) {
        dVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(101784640);
        int i15 = (o0VarE.r(dVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            p1 p1VarC = s9.c.c(dVar.f148407a, o0VarE);
            e eVar = (e) p1VarC.getF182175a();
            boolean zB = ((i15 & 112) == 32) | o0VarE.B(p1VarC);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new a(lVar, p1VarC, null);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a(lVar, p1VarC, null);
                    o0VarE.K(objQ);
                }
            }
            l0.e((p) objQ, eVar, o0VarE);
            boolean z14 = ((e) p1VarC.getF182175a()) == null;
            qx0.a.f148401a.getClass();
            z02.d.a(z14, qx0.a.f148402b, null, null, null, qx0.a.f148403c, o0VarE, 196656, 28);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(dVar, lVar, i14, 8);
        }
    }
}
