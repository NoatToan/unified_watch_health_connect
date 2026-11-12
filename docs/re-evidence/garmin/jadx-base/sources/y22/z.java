package y22;

import c2.n0;
import c2.n3;
import java.text.NumberFormat;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p3.l0;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;
import ta0.g0;

/* JADX INFO: loaded from: classes10.dex */
public final class z {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.view.photos.ViewPhotosScreenKt$ViewPhotosScreen$1$1", f = "ViewPhotosScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f194336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f194337b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<v> f194338c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e23.a<Unit> aVar, j jVar, x3<v> x3Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f194336a = aVar;
            this.f194337b = jVar;
            this.f194338c = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f194336a, this.f194337b, this.f194338c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            i iVar = this.f194338c.getF182175a().f194321c;
            if (iVar instanceof i.b) {
                this.f194336a.invoke();
                this.f194337b.g3();
            } else if (!(iVar instanceof i.a) && iVar != null) {
                u0.r();
                return null;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.view.photos.ViewPhotosScreenKt$ViewPhotosScreen$2$1", f = "ViewPhotosScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w f194339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f194340b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(w wVar, e23.a<Unit> aVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f194339a = wVar;
            this.f194340b = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f194339a, this.f194340b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (this.f194339a == null) {
                this.f194340b.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0092  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i14, j jVar, hf.j jVar2, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i15) {
        jVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(71960648);
        int i16 = i15 | (o0VarE.k(i14) ? 4 : 2) | (o0VarE.B(jVar) ? 32 : 16) | (o0VarE.r(jVar2) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192);
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(jVar.getF153054g(), o0VarE);
            p1 p1VarC2 = s9.c.c(jVar.getF153055h(), o0VarE);
            boolean zB = o0VarE.B(p1VarC);
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zB) {
                objQ = new by1.h(p1VarC, 15);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new by1.h(p1VarC, 15);
                    o0VarE.K(objQ);
                }
            }
            h2.b bVarB = h2.o0.b(i14, (e23.a) objQ, o0VarE, i16 & 14, 2);
            Object[] objArr = new Object[0];
            Object objQ2 = o0VarE.q();
            aVar3.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = new xh0.d(25);
                o0VarE.K(objQ2);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ2, o0VarE, 48);
            boolean zK = o0VarE.k(bVarB.l()) | o0VarE.B((i53.c) p1VarC.getF182175a());
            Object objQ3 = o0VarE.q();
            if (zK || objQ3 == c2565a) {
                w wVar = (w) h0.e0(bVarB.l(), (i53.c) p1VarC.getF182175a());
                if (wVar == null) {
                    wVar = (w) h0.n0((i53.c) p1VarC.getF182175a());
                }
                objQ3 = wVar;
                o0VarE.K(objQ3);
            }
            w wVar2 = (w) objQ3;
            i iVar = ((v) p1VarC2.getF182175a()).f194321c;
            boolean zB2 = ((i16 & 112) == 32) | o0VarE.B(p1VarC2) | ((i16 & 57344) == 16384);
            Object objQ4 = o0VarE.q();
            if (zB2 || objQ4 == c2565a) {
                objQ4 = new a(aVar2, jVar, p1VarC2, null);
                o0VarE.K(objQ4);
            }
            l0.e((e23.p) objQ4, iVar, o0VarE);
            boolean zR = o0VarE.r(wVar2) | ((i16 & 7168) == 2048);
            Object objQ5 = o0VarE.q();
            if (zR || objQ5 == c2565a) {
                objQ5 = new b(wVar2, aVar, null);
                o0VarE.K(objQ5);
            }
            l0.e((e23.p) objQ5, wVar2, o0VarE);
            boolean zK2 = o0VarE.k(bVarB.l());
            Object objQ6 = o0VarE.q();
            if (zK2 || objQ6 == c2565a) {
                objQ6 = NumberFormat.getIntegerInstance().format(Integer.valueOf(bVarB.l() + 1));
                o0VarE.K(objQ6);
            }
            String str = (String) objQ6;
            boolean zB3 = o0VarE.B((i53.c) p1VarC.getF182175a());
            Object objQ7 = o0VarE.q();
            if (zB3 || objQ7 == c2565a) {
                objQ7 = NumberFormat.getIntegerInstance().format(Integer.valueOf(((i53.c) p1VarC.getF182175a()).size()));
                o0VarE.K(objQ7);
            }
            boolean z14 = ((v) p1VarC2.getF182175a()).f194319a;
            n0 n0Var = n3.f22788a;
            z02.d.a(z14, z3.f.c(127546851, new wv0.e(str, (String) objQ7, aVar, p1Var, wVar2), o0VarE), null, null, new n0(0, 0, 0, 0), z3.f.c(1726247007, new g0(bVarB, p1VarC, jVar2, p1Var, jVar, p1VarC2, 18), o0VarE), o0VarE, 196656, 12);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ug0.c(i14, jVar, jVar2, aVar, aVar2, i15);
        }
    }
}
