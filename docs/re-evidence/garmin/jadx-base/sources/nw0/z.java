package nw0;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes9.dex */
public final class z {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.settings.LifestyleLoggingRemindersScreenKt$LifestyleLoggingRemindersScreen$2$1", f = "LifestyleLoggingRemindersScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<Boolean, Unit> f128132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a0 f128133b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<g0> f128134c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super Boolean, Unit> lVar, a0 a0Var, x3<g0> x3Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f128132a = lVar;
            this.f128133b = a0Var;
            this.f128134c = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f128132a, this.f128133b, this.f128134c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (this.f128134c.getF182175a().f128038b instanceof i0.b) {
                this.f128132a.invoke(Boolean.valueOf(this.f128133b.f127990f));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:29:0x007a  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ac  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(a0 a0Var, e23.l<? super Boolean, Unit> lVar, p3.m mVar, int i14) {
        a0Var.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-885186026);
        int i15 = (o0VarE.r(a0Var) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(a0Var.f127988d, o0VarE);
            int i17 = i15 & 112;
            boolean zB = o0VarE.B(p1VarC) | (i17 == 32) | o0VarE.r(a0Var);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zB) {
                objQ = new p(lVar, i16, a0Var, p1VarC);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new p(lVar, i16, a0Var, p1VarC);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar2 = (e23.a) objQ;
            boolean zB2 = o0VarE.B(aVar2);
            Object objQ2 = o0VarE.q();
            if (zB2) {
                objQ2 = new x(aVar2, 0);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new x(aVar2, 0);
                    o0VarE.K(objQ2);
                }
            }
            c.w.a(6, 0, (e23.a) objQ2, o0VarE, true);
            i0 i0Var = ((g0) p1VarC.getF182175a()).f128038b;
            boolean zB3 = (i17 == 32) | o0VarE.B(p1VarC) | o0VarE.r(a0Var);
            Object objQ3 = o0VarE.q();
            if (zB3) {
                objQ3 = new a(lVar, a0Var, p1VarC, null);
                o0VarE.K(objQ3);
            } else {
                aVar.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new a(lVar, a0Var, p1VarC, null);
                    o0VarE.K(objQ3);
                }
            }
            l0.e((e23.p) objQ3, i0Var, o0VarE);
            z02.d.a((((g0) p1VarC.getF182175a()).f128037a instanceof f0.c) || (((g0) p1VarC.getF182175a()).f128038b instanceof i0.c), z3.f.c(1501440241, new ll1.g(aVar2, 22), o0VarE), null, null, null, z3.f.c(1387709549, new mw0.i(11, a0Var, p1VarC), o0VarE), o0VarE, 196656, 28);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mw0.i(a0Var, lVar, i14, 12);
        }
    }
}
