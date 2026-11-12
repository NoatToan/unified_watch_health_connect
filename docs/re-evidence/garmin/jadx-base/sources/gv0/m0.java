package gv0;

import android.content.Intent;
import com.garmin.android.apps.connectmobile.R;
import l72.c1;
import org.koin.compose.InjectKt;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes9.dex */
public final class m0 {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.a<ParametersHolder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3 f79326a;

        public a(x3 x3Var) {
            this.f79326a = x3Var;
        }

        @Override // e23.a
        public final ParametersHolder invoke() {
            ParametersHolder parametersHolder;
            e23.a aVarM473koinInject$lambda0 = InjectKt.m473koinInject$lambda0(this.f79326a);
            return (aVarM473koinInject$lambda0 == null || (parametersHolder = (ParametersHolder) aVarM473koinInject$lambda0.invoke()) == null) ? ParametersHolderKt.emptyParametersHolder() : parametersHolder;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.SendRequestEventHandlerKt$SendRequestEventHandler$1$1", f = "SendRequestEventHandler.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.p<String, Boolean, Unit> f79327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f79328b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c.q<Intent, f.a> f79329c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ uu0.c f79330d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ b.g f79331e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x3<k0> f79332f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(e23.p<? super String, ? super Boolean, Unit> pVar, d dVar, c.q<Intent, f.a> qVar, uu0.c cVar, b.g gVar, x3<? extends k0> x3Var, t13.d<? super b> dVar2) {
            super(2, dVar2);
            this.f79327a = pVar;
            this.f79328b = dVar;
            this.f79329c = qVar;
            this.f79330d = cVar;
            this.f79331e = gVar;
            this.f79332f = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f79327a, this.f79328b, this.f79329c, this.f79330d, this.f79331e, this.f79332f, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            k0 f182175a = this.f79332f.getF182175a();
            boolean z14 = f182175a instanceof k0.b;
            d dVar = this.f79328b;
            if (z14) {
                k0.b bVar = (k0.b) f182175a;
                this.f79327a.invoke(bVar.f79309a, Boolean.valueOf(bVar.f79310b));
                dVar.C4();
            } else if (f182175a instanceof k0.c) {
                k0.c cVar = (k0.c) f182175a;
                pu0.b bVar2 = cVar.f79312b;
                this.f79329c.a(this.f79330d.a(this.f79331e, cVar.f79311a, (pu0.i) p13.h0.d0(bVar2.f141191i), cVar.f79314d, dVar.f79188f), null);
                pu0.b bVar3 = cVar.f79313c;
                boolean z15 = cVar.f79314d;
                dVar.C = bVar2;
                dVar.D = bVar3;
                dVar.E = z15;
                dVar.C4();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0096  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:52:0x0119  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e9  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(d dVar, e23.p<? super String, ? super Boolean, Unit> pVar, p3.m mVar, final int i14) {
        int i15;
        p3.o0 o0Var;
        b.g gVar;
        c.q qVar;
        Object jVar;
        String str;
        boolean z14;
        final d dVar2 = dVar;
        final e23.p<? super String, ? super Boolean, Unit> pVar2 = pVar;
        dVar2.getClass();
        pVar2.getClass();
        p3.o0 o0VarE = mVar.E(828718484);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(dVar2) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(pVar2) ? 32 : 16;
        }
        final int i16 = 1;
        final int i17 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Object objA = o0VarE.A(c.n.f22332a);
            b.g gVar2 = objA instanceof b.g ? (b.g) objA : null;
            if (gVar2 == null) {
                p2 p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: gv0.l0
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i18 = i17;
                            p3.m mVar2 = (p3.m) obj;
                            ((Integer) obj2).intValue();
                            switch (i18) {
                                case 0:
                                    m0.a(dVar2, pVar2, mVar2, p3.p0.t(i14 | 1));
                                    break;
                                default:
                                    m0.a(dVar2, pVar2, mVar2, p3.p0.t(i14 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            o0VarE.L(414512006);
            Scope scopeCurrentKoinScope = KoinApplicationKt.currentKoinScope(o0VarE, 0);
            p1 p1VarQ = p3.p0.q(null, o0VarE);
            o0VarE.L(855641119);
            boolean zB = o0VarE.B(null) | o0VarE.B(scopeCurrentKoinScope);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zB) {
                objQ = scopeCurrentKoinScope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(uu0.c.class), (Qualifier) null, new a(p1VarQ));
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = scopeCurrentKoinScope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(uu0.c.class), (Qualifier) null, new a(p1VarQ));
                    o0VarE.K(objQ);
                }
            }
            o0VarE.g0(false);
            o0VarE.g0(false);
            uu0.c cVar = (uu0.c) objQ;
            p1 p1VarC = s9.c.c(dVar2.B, o0VarE);
            g.h hVar = new g.h();
            boolean zR = o0VarE.r(dVar2);
            Object objQ2 = o0VarE.q();
            if (zR) {
                objQ2 = new bv0.n(dVar2, 6);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new bv0.n(dVar2, 6);
                    o0VarE.K(objQ2);
                }
            }
            c.q qVarC = c.w.c(hVar, (e23.l) objQ2, o0VarE, 0);
            k0 k0Var = (k0) p1VarC.getF182175a();
            int i18 = i15 & 112;
            boolean zB2 = (i18 == 32) | o0VarE.B(p1VarC) | o0VarE.r(dVar2) | o0VarE.r(qVarC) | o0VarE.r(cVar) | o0VarE.r(gVar2);
            Object objQ3 = o0VarE.q();
            if (zB2) {
                gVar = gVar2;
                qVar = qVarC;
                b bVar = new b(pVar2, dVar2, qVar, cVar, gVar, p1VarC, null);
                o0VarE.K(bVar);
                objQ3 = bVar;
            } else {
                aVar.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    gVar = gVar2;
                    qVar = qVarC;
                    b bVar2 = new b(pVar2, dVar2, qVar, cVar, gVar, p1VarC, null);
                    o0VarE.K(bVar2);
                    objQ3 = bVar2;
                } else {
                    gVar = gVar2;
                    qVar = qVarC;
                }
            }
            p3.l0.e((e23.p) objQ3, k0Var, o0VarE);
            k0 k0Var2 = (k0) p1VarC.getF182175a();
            if (k0Var2 == null) {
                o0VarE.C(882327560);
                o0VarE.g0(false);
                pVar2 = pVar;
                o0Var = o0VarE;
                i16 = 1;
            } else {
                o0VarE.C(882327561);
                if (k0Var2 instanceof k0.b) {
                    o0VarE.C(-1956734308);
                    o0VarE.g0(false);
                } else {
                    if (k0Var2 instanceof k0.c) {
                        o0VarE.C(-1956732612);
                        o0VarE.g0(false);
                    } else {
                        if (!(k0Var2 instanceof k0.a)) {
                            throw kg.f.h(o0VarE, -1956734848, false);
                        }
                        o0VarE.C(-529039959);
                        c1 c1Var = c1.f110940a;
                        k0.a aVar2 = (k0.a) k0Var2;
                        String str2 = aVar2.f79302a;
                        String str3 = aVar2.f79303b;
                        String strQ = gl1.y.Q(o0VarE, R.string.lbl_common_continue);
                        String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_cancel);
                        boolean zB3 = o0VarE.B(k0Var2) | (i18 == 32) | o0VarE.r(qVar) | o0VarE.r(cVar) | o0VarE.r(gVar) | o0VarE.r(dVar2);
                        Object objQ4 = o0VarE.q();
                        if (zB3) {
                            str = str3;
                            jVar = new ck0.j(k0Var2, pVar, qVar, cVar, gVar, dVar2, 5);
                            pVar2 = pVar;
                            dVar2 = dVar2;
                            o0VarE.K(jVar);
                        } else {
                            aVar.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                str = str3;
                                jVar = new ck0.j(k0Var2, pVar, qVar, cVar, gVar, dVar2, 5);
                                pVar2 = pVar;
                                dVar2 = dVar2;
                                o0VarE.K(jVar);
                            } else {
                                pVar2 = pVar;
                                str = str3;
                                jVar = objQ4;
                            }
                        }
                        e23.a<Unit> aVar3 = (e23.a) jVar;
                        boolean zR2 = o0VarE.r(dVar2);
                        Object objQ5 = o0VarE.q();
                        if (zR2) {
                            objQ5 = new bv0.j(dVar2, 1);
                            o0VarE.K(objQ5);
                        } else {
                            aVar.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                objQ5 = new bv0.j(dVar2, 1);
                                o0VarE.K(objQ5);
                            }
                        }
                        e23.a<Unit> aVar4 = (e23.a) objQ5;
                        z14 = false;
                        c1Var.a(false, str2, str, null, null, strQ, false, false, aVar3, strQ2, aVar4, o0VarE, 0, 0, 217);
                        o0Var = o0VarE;
                        o0Var.g0(false);
                    }
                    o0Var.g0(z14);
                }
                pVar2 = pVar;
                o0Var = o0VarE;
                z14 = false;
                o0Var.g0(z14);
            }
        } else {
            o0Var = o0VarE;
            i16 = 1;
            o0Var.e();
        }
        p2 p2VarI1 = o0Var.i0();
        if (p2VarI1 != null) {
            p2VarI1.f135219d = new e23.p() { // from class: gv0.l0
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i19 = i16;
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).intValue();
                    switch (i19) {
                        case 0:
                            m0.a(dVar2, pVar2, mVar2, p3.p0.t(i14 | 1));
                            break;
                        default:
                            m0.a(dVar2, pVar2, mVar2, p3.p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
