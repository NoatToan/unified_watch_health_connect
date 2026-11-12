package ot1;

import androidx.room.a0;
import i3.fe;
import lc.m0;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lot1/n;", "Lot1/a;", "<init>", "()V", "Lpt1/h;", "savedTrailsScreenState", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends ot1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f133806a = new n();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.navigation.routes.SavedTrailsRoute$Content$2$1", f = "SavedTrailsRoute.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ qt1.a f133807a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qt1.a aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f133807a = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f133807a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            vs1.t tVar = this.f133807a.f147506t;
            if (!tVar.f179901j) {
                b0 b0Var = tVar.f179893b;
                x53.c cVar = s0.f129406a;
                ge1.b.T(b0Var, x53.b.f189152a, null, new vs1.r(tVar, null), 2);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
        public b(Object obj) {
            super(0, obj, b.u.class, "onBackPressed", "onBackPressed()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((b.u) this.receiver).d();
            return Unit.INSTANCE;
        }
    }

    private n() {
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:54:0x010a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0125  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ot1.a
    public final void a(lc.v vVar, m0 m0Var, fe feVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarQ = a0.q(vVar, m0Var, mVar, -899868671);
        if ((i14 & 48) == 0) {
            i15 = (o0VarQ.r(m0Var) ? 32 : 16) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.B(feVar) ? 256 : 128;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 145) != 144)) {
            x1 x1Var = p3.n.f135158a;
            qt1.a aVarG0 = gl1.d.g0(o0VarQ);
            if (feVar == null) {
                vb.h.s("Snackbar host state must be passed to saved trails route");
                return;
            }
            p1 p1VarC = s9.c.c(aVarG0.A, o0VarQ);
            Unit unit = Unit.INSTANCE;
            boolean zR = o0VarQ.r(aVarG0);
            Object objQ = o0VarQ.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zR) {
                objQ = new a(aVarG0, null);
                o0VarQ.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a(aVarG0, null);
                    o0VarQ.K(objQ);
                }
            }
            l0.e((e23.p) objQ, unit, o0VarQ);
            pt1.h hVar = (pt1.h) p1VarC.getF182175a();
            b.u uVar = (b.u) o0VarQ.A(g02.d.f74342a);
            boolean zR2 = o0VarQ.r(uVar);
            Object objQ2 = o0VarQ.q();
            if (zR2) {
                objQ2 = new b(uVar);
                o0VarQ.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new b(uVar);
                    o0VarQ.K(objQ2);
                }
            }
            e23.a aVar2 = (e23.a) ((k23.g) objQ2);
            boolean zR3 = o0VarQ.r(aVarG0);
            Object objQ3 = o0VarQ.q();
            if (zR3) {
                objQ3 = new mt1.b(aVarG0, 11);
                o0VarQ.K(objQ3);
            } else {
                aVar.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new mt1.b(aVarG0, 11);
                    o0VarQ.K(objQ3);
                }
            }
            e23.l lVar = (e23.l) objQ3;
            boolean zR4 = o0VarQ.r(aVarG0);
            Object objQ4 = o0VarQ.q();
            if (zR4) {
                objQ4 = new mt1.b(aVarG0, 12);
                o0VarQ.K(objQ4);
            } else {
                aVar.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new mt1.b(aVarG0, 12);
                    o0VarQ.K(objQ4);
                }
            }
            e23.l lVar2 = (e23.l) objQ4;
            boolean zR5 = o0VarQ.r(m0Var);
            Object objQ5 = o0VarQ.q();
            if (zR5) {
                objQ5 = new ky0.w(m0Var, 15);
                o0VarQ.K(objQ5);
            } else {
                aVar.getClass();
                if (objQ5 == p3.m.a.f135155b) {
                    objQ5 = new ky0.w(m0Var, 15);
                    o0VarQ.K(objQ5);
                }
            }
            e23.l lVar3 = (e23.l) objQ5;
            boolean zR6 = o0VarQ.r(aVarG0);
            Object objQ6 = o0VarQ.q();
            if (zR6) {
                objQ6 = new c(aVarG0, 1);
                o0VarQ.K(objQ6);
            } else {
                aVar.getClass();
                if (objQ6 == p3.m.a.f135155b) {
                    objQ6 = new c(aVarG0, 1);
                    o0VarQ.K(objQ6);
                }
            }
            e23.p pVar = (e23.p) objQ6;
            boolean zR7 = o0VarQ.r(m0Var);
            Object objQ7 = o0VarQ.q();
            if (zR7) {
                objQ7 = new nk0.l(m0Var, 4);
                o0VarQ.K(objQ7);
            } else {
                aVar.getClass();
                if (objQ7 == p3.m.a.f135155b) {
                    objQ7 = new nk0.l(m0Var, 4);
                    o0VarQ.K(objQ7);
                }
            }
            et1.o.a(hVar, feVar, aVar2, lVar, lVar2, lVar3, pVar, (e23.a) objQ7, o0VarQ, (i15 >> 3) & 112);
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(this, vVar, m0Var, feVar, i14, 2);
        }
    }
}
