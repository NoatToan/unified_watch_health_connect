package n51;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.u1;
import androidx.room.a0;
import b.g;
import c.q;
import c.w;
import e23.l;
import e23.p;
import ew0.e0;
import i3.fe;
import i3.se;
import l51.j;
import l72.d3;
import mh1.x;
import o13.r;
import o53.b0;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import p51.c;
import r53.l1;
import r53.s;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: n51.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.pacepro.presentation.navigation.routes.PaceProListRouteScreenKt$PaceProListRouteScreen$6$1", f = "PaceProListRouteScreen.kt", l = {70}, m = "invokeSuspend", v = 2)
    public static final class C2322a extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f123763a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f123764b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ fe f123765c;

        /* JADX INFO: renamed from: n51.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp22/a;", "snackbarDataState", "", "<anonymous>", "(Lp22/a;)V"}, k = 3, mv = {2, 3, 0})
        @e(c = "com.garmin.android.apps.connectmobile.pacepro.presentation.navigation.routes.PaceProListRouteScreenKt$PaceProListRouteScreen$6$1$1", f = "PaceProListRouteScreen.kt", l = {73}, m = "invokeSuspend", v = 2)
        public static final class C2323a extends i implements p<p22.a, d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f123766a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f123767b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ fe f123768c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ c f123769d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2323a(fe feVar, c cVar, d<? super C2323a> dVar) {
                super(2, dVar);
                this.f123768c = feVar;
                this.f123769d = cVar;
            }

            @Override // v13.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                C2323a c2323a = new C2323a(this.f123768c, this.f123769d, dVar);
                c2323a.f123767b = obj;
                return c2323a;
            }

            @Override // e23.p
            public final Object invoke(p22.a aVar, d<? super Unit> dVar) {
                return ((C2323a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                e23.a<Unit> aVar;
                p22.a aVar2 = (p22.a) this.f123767b;
                u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f123766a;
                if (i14 == 0) {
                    r.b(obj);
                    String str = aVar2.f135022a;
                    if (str != null && str.length() != 0) {
                        String str2 = aVar2.f135023b;
                        this.f123767b = aVar2;
                        this.f123766a = 1;
                        obj = d3.c(this.f123768c, str, str2, this);
                        if (obj == aVar3) {
                            return aVar3;
                        }
                    }
                    o22.b bVar = this.f123769d.f136158g;
                    ge1.b.T(bVar.f128680b, null, null, new o22.a(bVar, null), 3);
                    return Unit.INSTANCE;
                }
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                if (((se) obj) == se.ActionPerformed && (aVar = aVar2.f135024c) != null) {
                    aVar.invoke();
                }
                o22.b bVar2 = this.f123769d.f136158g;
                ge1.b.T(bVar2.f128680b, null, null, new o22.a(bVar2, null), 3);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2322a(c cVar, fe feVar, d<? super C2322a> dVar) {
            super(2, dVar);
            this.f123764b = cVar;
            this.f123765c = feVar;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C2322a(this.f123764b, this.f123765c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((C2322a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f123763a;
            if (i14 == 0) {
                r.b(obj);
                c cVar = this.f123764b;
                l1 l1Var = new l1(cVar.f136159h);
                C2323a c2323a = new C2323a(this.f123765c, cVar, null);
                this.f123763a = 1;
                if (s.k(l1Var, c2323a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a7  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(e23.a<Unit> aVar, l<? super Long, Unit> lVar, m mVar, int i14) {
        p2 p2VarI0;
        e0 e0Var;
        o0 o0VarO = a0.o(aVar, lVar, mVar, -1815691407);
        int i15 = (o0VarO.r(aVar) ? 4 : 2) | i14 | (o0VarO.r(lVar) ? 32 : 16);
        if (o0VarO.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarO.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objA = o0VarO.A(c.n.f22332a);
            g gVar = objA instanceof g ? (g) objA : null;
            if (gVar == null) {
                p2VarI0 = o0VarO.i0();
                if (p2VarI0 == null) {
                    return;
                } else {
                    e0Var = new e0(i14, 1, lVar, aVar);
                }
            } else {
                o0VarO.L(-1614864554);
                u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(c.class), gVar.getF189591b(), null, CreationExtrasExtKt.defaultExtras(gVar), null, KoinApplicationKt.currentKoinScope(o0VarO, 0), null);
                o0VarO.g0(false);
                c cVar = (c) u1VarResolveViewModel;
                m51.a aVar2 = new m51.a();
                boolean zR = o0VarO.r(cVar) | o0VarO.r(context);
                Object objQ = o0VarO.q();
                m.a aVar3 = m.f135153a;
                if (zR) {
                    objQ = new ml0.e(10, cVar, context);
                    o0VarO.K(objQ);
                } else {
                    aVar3.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new ml0.e(10, cVar, context);
                        o0VarO.K(objQ);
                    }
                }
                q qVarC = w.c(aVar2, (l) objQ, o0VarO, 0);
                p1 p1VarC = s9.c.c(cVar.f136156e, o0VarO);
                Object objQ2 = o0VarO.q();
                aVar3.getClass();
                m.a.C2565a c2565a = m.a.f135155b;
                if (objQ2 == c2565a) {
                    objQ2 = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarO);
                }
                fe feVar = (fe) objQ2;
                o51.d dVar = (o51.d) p1VarC.getF182175a();
                boolean zR2 = o0VarO.r(cVar) | o0VarO.r(context);
                Object objQ3 = o0VarO.q();
                if (zR2 || objQ3 == c2565a) {
                    objQ3 = new j(cVar, context, 1);
                    o0VarO.K(objQ3);
                }
                e23.a aVar4 = (e23.a) objQ3;
                boolean zR3 = o0VarO.r(cVar) | o0VarO.r(qVarC);
                Object objQ4 = o0VarO.q();
                if (zR3 || objQ4 == c2565a) {
                    objQ4 = new ml0.e(11, cVar, qVarC);
                    o0VarO.K(objQ4);
                }
                l lVar2 = (l) objQ4;
                boolean zR4 = o0VarO.r(cVar);
                Object objQ5 = o0VarO.q();
                if (zR4 || objQ5 == c2565a) {
                    objQ5 = new mh1.i(cVar, 23);
                    o0VarO.K(objQ5);
                }
                e23.a aVar5 = (e23.a) objQ5;
                boolean zR5 = o0VarO.r(cVar);
                Object objQ6 = o0VarO.q();
                if (zR5 || objQ6 == c2565a) {
                    objQ6 = new x(cVar, 20);
                    o0VarO.K(objQ6);
                }
                l lVar3 = (l) objQ6;
                boolean zR6 = o0VarO.r(context);
                Object objQ7 = o0VarO.q();
                if (zR6 || objQ7 == c2565a) {
                    objQ7 = new l71.g(context, 9);
                    o0VarO.K(objQ7);
                }
                int i16 = i15 << 9;
                h51.d.a(dVar, feVar, aVar4, aVar, lVar, lVar2, aVar5, lVar3, (e23.a) objQ7, o0VarO, (i16 & 57344) | (i16 & 7168) | 48);
                Unit unit = Unit.INSTANCE;
                boolean zR7 = o0VarO.r(cVar);
                Object objQ8 = o0VarO.q();
                if (zR7 || objQ8 == c2565a) {
                    objQ8 = new C2322a(cVar, feVar, null);
                    o0VarO.K(objQ8);
                }
                l0.e((p) objQ8, unit, o0VarO);
            }
            p2VarI0.f135219d = e0Var;
        }
        o0VarO.e();
        p2VarI0 = o0VarO.i0();
        if (p2VarI0 != null) {
            e0Var = new e0(i14, 2, lVar, aVar);
            p2VarI0.f135219d = e0Var;
        }
    }
}
