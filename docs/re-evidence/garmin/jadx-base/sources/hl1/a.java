package hl1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c.w;
import gl1.y;
import java.util.Set;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: hl1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.setup.presentation.activities.AllActivitiesScreenKt$AllActivitiesScreen$1$1", f = "AllActivitiesScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C1674a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3<b> f84354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.s<zf2.d, Boolean, Boolean, Boolean, Boolean, Unit> f84355b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f84356c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1674a(x3<b> x3Var, e23.s<? super zf2.d, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, Unit> sVar, c cVar, t13.d<? super C1674a> dVar) {
            super(2, dVar);
            this.f84354a = x3Var;
            this.f84355b = sVar;
            this.f84356c = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C1674a(this.f84354a, this.f84355b, this.f84356c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C1674a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            x3<b> x3Var = this.f84354a;
            zf2.d dVar = x3Var.getF182175a().f84360d;
            if (dVar != null && !x3Var.getF182175a().f84361e) {
                boolean zContains = x3Var.getF182175a().f84359c.contains(dVar);
                c cVar = this.f84356c;
                cVar.getClass();
                fl1.m mVar = cVar.f84367e;
                Set<String> set = cVar.f84373k;
                mVar.getClass();
                this.f84355b.invoke(dVar, Boolean.valueOf(fl1.m.a(set, dVar)), Boolean.valueOf(zContains), Boolean.TRUE, Boolean.valueOf(x3Var.getF182175a().f84362f));
                cVar.x4(null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:49:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:56:0x014f  */
    /* JADX WARN: Code duplicated, block: B:61:0x016c  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(c cVar, il1.a aVar, kl1.a aVar2, e23.s<? super zf2.d, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, Unit> sVar, e23.a<Unit> aVar3, p3.m mVar, int i14) {
        c cVar2 = cVar;
        cVar2.getClass();
        aVar2.getClass();
        sVar.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(-1162120606);
        int i15 = i14 | (o0VarE.r(cVar2) ? 4 : 2) | (o0VarE.k(aVar == null ? -1 : aVar.ordinal()) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128) | (o0VarE.r(sVar) ? 2048 : 1024) | (o0VarE.r(aVar3) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(cVar2.f84372j, o0VarE);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            g.h hVar = new g.h();
            int i16 = i15 & 7168;
            boolean zB = o0VarE.B(p1VarC) | (i16 == 2048) | o0VarE.r(cVar2);
            Object objQ = o0VarE.q();
            p3.m.a aVar4 = p3.m.f135153a;
            if (zB) {
                objQ = new gw1.d(p1VarC, 5, sVar, cVar2);
                o0VarE.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new gw1.d(p1VarC, 5, sVar, cVar2);
                    o0VarE.K(objQ);
                }
            }
            c.q qVarC = w.c(hVar, (e23.l) objQ, o0VarE, 0);
            zf2.d dVar = ((b) p1VarC.getF182175a()).f84360d;
            boolean zB2 = o0VarE.B(p1VarC) | (i16 == 2048) | o0VarE.r(cVar2);
            Object objQ2 = o0VarE.q();
            if (zB2) {
                objQ2 = new C1674a(p1VarC, sVar, cVar2, null);
                o0VarE.K(objQ2);
            } else {
                aVar4.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new C1674a(p1VarC, sVar, cVar2, null);
                    o0VarE.K(objQ2);
                }
            }
            l0.e((e23.p) objQ2, dVar, o0VarE);
            boolean z14 = ((b) p1VarC.getF182175a()).f84357a;
            z3.e eVarC = z3.f.c(-1987074201, new cq0.p(aVar3, 29), o0VarE);
            g52.d dVar2 = new g52.d(aVar, aVar2, cVar2, p1VarC, 12);
            cVar2 = cVar2;
            z02.d.a(z14, eVarC, null, null, null, z3.f.c(-69692053, dVar2, o0VarE), o0VarE, 196656, 28);
            if (((b) p1VarC.getF182175a()).f84361e) {
                o0VarE.C(998735407);
                boolean zR = o0VarE.r(cVar2) | o0VarE.r(qVarC) | o0VarE.r(context);
                Object objQ3 = o0VarE.q();
                if (zR) {
                    objQ3 = new fk0.a(cVar2, 23, qVarC, context);
                    o0VarE.K(objQ3);
                } else {
                    aVar4.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new fk0.a(cVar2, 23, qVarC, context);
                        o0VarE.K(objQ3);
                    }
                }
                e23.a aVar5 = (e23.a) objQ3;
                boolean zR2 = o0VarE.r(cVar2);
                Object objQ4 = o0VarE.q();
                if (zR2) {
                    objQ4 = new h62.j(cVar2, 8);
                    o0VarE.K(objQ4);
                } else {
                    aVar4.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new h62.j(cVar2, 8);
                        o0VarE.K(objQ4);
                    }
                }
                y.e(aVar5, (e23.a) objQ4, o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(999090016);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new et.p((Object) cVar2, (Object) aVar, (Object) aVar2, (o13.h) sVar, (e23.a) aVar3, i14, 18);
        }
    }
}
