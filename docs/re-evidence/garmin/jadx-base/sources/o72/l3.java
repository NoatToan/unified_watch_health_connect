package o72;

import i3.fe;
import i3.se;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes9.dex */
public final class l3 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.ui.catalog.library.examples.SnackbarExamplesKt$SnackbarExamples$1$1$1$1$1", f = "SnackbarExamples.kt", l = {43}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f130469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fe f130470b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fe feVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f130470b = feVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f130470b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f130469a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f130469a = 1;
                if (l72.d3.c(this.f130470b, "Snackbar message with no action", null, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.ui.catalog.library.examples.SnackbarExamplesKt$SnackbarExamples$1$1$2$1$1", f = "SnackbarExamples.kt", l = {52, 54}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f130471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fe f130472b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(fe feVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f130472b = feVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f130472b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
        
            if (i3.fe.b(r9.f130472b, "Action performed", null, null, r9, 14) == r0) goto L17;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f130471a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f130471a = 1;
                obj = l72.d3.c(this.f130472b, "Longer snackbar message with an action", "Action", this);
                if (obj != aVar) {
                }
                return aVar;
            }
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
            if (((se) obj) == se.ActionPerformed) {
                this.f130471a = 2;
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(p3.m mVar, int i14) {
        p3.o0 o0Var;
        boolean z14;
        p3.o0 o0VarE = mVar.E(-906185183);
        p3.c<?> cVar = o0VarE.f135177b;
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarE);
            }
            final fe feVar = (fe) objQ;
            h4.r.a aVar = h4.r.S;
            h4.r rVarD = c2.x2.d(aVar, 1.0f);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            h4.r rVarF = c2.x2.f(uVar.c(aVar, h4.d.a.f81525c), 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            h4.r rVarY = c2.l.y(rVarF, eVar2.f97920e);
            c2.j jVar = c2.j.f22691a;
            bVar2.getClass();
            float f14 = eVar2.f97920e;
            jVar.getClass();
            c2.z zVarA = c2.y.a(c2.j.i(f14), h4.d.a.f81537o, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarY, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            l72.f0 f0Var = l72.f0.f110999a;
            h4.r rVarF2 = c2.x2.f(aVar, 1.0f);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                final int i15 = 0;
                objQ2 = new e23.a() { // from class: o72.k3
                    @Override // e23.a
                    public final Object invoke() {
                        int i16 = i15;
                        fe feVar2 = feVar;
                        switch (i16) {
                            case 0:
                                x53.c cVar2 = o53.s0.f129406a;
                                ge1.b.T(o53.c0.a(u53.o.f168762a), null, null, new l3.a(feVar2, null), 3);
                                break;
                            default:
                                x53.c cVar3 = o53.s0.f129406a;
                                ge1.b.T(o53.c0.a(u53.o.f168762a), null, null, new l3.b(feVar2, null), 3);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ2);
            }
            f0Var.d(25008, 9, (e23.a) objQ2, rVarF2, "Show Snackbar", o0VarE, null, false);
            h4.r rVarF3 = c2.x2.f(aVar, 1.0f);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                z14 = true;
                final char c14 = 1 == true ? 1 : 0;
                objQ3 = new e23.a() { // from class: o72.k3
                    @Override // e23.a
                    public final Object invoke() {
                        int i16 = c14;
                        fe feVar2 = feVar;
                        switch (i16) {
                            case 0:
                                x53.c cVar2 = o53.s0.f129406a;
                                ge1.b.T(o53.c0.a(u53.o.f168762a), null, null, new l3.a(feVar2, null), 3);
                                break;
                            default:
                                x53.c cVar3 = o53.s0.f129406a;
                                ge1.b.T(o53.c0.a(u53.o.f168762a), null, null, new l3.b(feVar2, null), 3);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ3);
            } else {
                z14 = true;
            }
            f0Var.i("Show Snackbar with Action", rVarF3, false, (e23.a) objQ3, o0VarE, 3126, 4);
            o0Var = o0VarE;
            o0Var.g0(z14);
            l72.d3.b(feVar, c2.x2.f(uVar.c(aVar, h4.d.a.f81531i), 1.0f), o0Var, 6, 0);
            o0Var.g0(z14);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new z1(i14, 27);
        }
    }
}
