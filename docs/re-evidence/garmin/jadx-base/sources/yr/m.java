package yr;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.e9;
import i3.i7;
import i3.mc;
import i3.mh;
import l72.v2;
import o4.m1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.p2;
import p3.x1;
import v62.b3;

/* JADX INFO: loaded from: classes7.dex */
public final class m {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.overview.components.DescriptionComponentKt$DescriptionComponent$1$1$1$1$1", f = "DescriptionComponent.kt", l = {71}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f198880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f198881b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc mcVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f198881b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f198881b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f198880a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f198880a = 1;
                if (this.f198881b.b(this) == aVar) {
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
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.overview.components.DescriptionComponentKt$DescriptionComponent$1$2$1$1", f = "DescriptionComponent.kt", l = {89}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f198882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f198883b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(mc mcVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f198883b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f198883b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f198882a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f198882a = 1;
                if (this.f198883b.b(this) == aVar) {
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
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.overview.components.DescriptionComponentKt$DescriptionComponent$1$3$1$1", f = "DescriptionComponent.kt", l = {100}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f198884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f198885b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(mc mcVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f198885b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f198885b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f198884a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f198884a = 1;
                if (this.f198885b.b(this) == aVar) {
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

    /* JADX WARN: Code duplicated, block: B:106:0x0372  */
    /* JADX WARN: Code duplicated, block: B:107:0x037c  */
    /* JADX WARN: Code duplicated, block: B:33:0x011e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0127  */
    /* JADX WARN: Code duplicated, block: B:36:0x012b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0146  */
    /* JADX WARN: Code duplicated, block: B:44:0x0152  */
    /* JADX WARN: Code duplicated, block: B:45:0x0154  */
    /* JADX WARN: Code duplicated, block: B:55:0x021e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0236  */
    /* JADX WARN: Code duplicated, block: B:71:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:83:0x0309  */
    /* JADX WARN: Code duplicated, block: B:86:0x031d  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(nr.g.e eVar, p3.m mVar, int i14) {
        p3.c<?> cVar;
        h5.g.a.f fVar;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        String str;
        boolean z14;
        String str2;
        e23.l lVar;
        boolean z15 = eVar.f127057c;
        String str3 = eVar.f127060f;
        boolean z16 = eVar.f127055a;
        String str4 = eVar.f127056b;
        p3.o0 o0VarE = mVar.E(-900036677);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(eVar) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            mc mcVarF = e9.f(true, null, o0VarE, 6, 2);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            o53.b0 b0Var = (o53.b0) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(null);
                o0VarE.K(objQ2);
            }
            p1 p1Var = (p1) objQ2;
            h4.r.a aVar = h4.r.S;
            h4.r rVarY = x2.y(u1.n.e(aVar, tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a), null, 3);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar2 = j92.b.f97899b;
            h4.r rVarA = c2.l.A(rVarY, eVar2.f97920e, 0.0f, 2);
            bVar.getClass();
            h4.r rVarC2 = c2.l.C(rVarA, 0.0f, eVar2.f97918c, 0.0f, 0.0f, 13);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarC2, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar3 = h5.g.a.f81810g;
            b4.c(eVar3, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarE);
                c2.b0 b0Var2 = c2.b0.f22601a;
                s2VarA = q2.a(c2.j.f22698h, h4.d.a.f81533k, o0VarE, 6);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(aVar, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar3, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                u2 u2Var = u2.f22900a;
                if (str3 == null) {
                    str = "";
                } else {
                    str = str3;
                }
                j92.f fVar2 = d92.b.f58624b;
                fVar2.getClass();
                mh.c(str, u2Var.a(aVar, 1.0f, true), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, o0VarE), o0VarE, 0, 0, 131068);
                o0VarE = o0VarE;
                if (eVar.f127058d || !z16) {
                    o0VarE.C(-2126811443);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-2127320246);
                    s62.a.f157643a.getClass();
                    u4.d dVarA = b3.a(t62.b.f162798a);
                    bVar.getClass();
                    h4.r rVarQ = x2.q(aVar, j92.b.f97901d.f97904c);
                    boolean zR = o0VarE.r(b0Var) | o0VarE.B(mcVarF);
                    Object objQ3 = o0VarE.q();
                    if (zR || objQ3 == c2565a) {
                        objQ3 = new fo.j(p1Var, b0Var, mcVarF, 21);
                        o0VarE.K(objQ3);
                    }
                    i7.b(dVarA, gl1.y.Q(o0VarE, R.string.lbl_edit), u1.w.d(rVarQ, false, null, null, (e23.a) objQ3, 15), sn.a.y(o0VarE), o0VarE, 0, 0);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                if (str4 != null || str4.length() == 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (!z16 && z15 && z14) {
                    o0VarE.C(1299012854);
                    String strQ = gl1.y.Q(o0VarE, R.string.workout_add_notes);
                    fVar2.getClass();
                    s5.x0 x0Var = j92.f.f97933j;
                    long jA = d92.b.a(o0VarE).k().a();
                    bVar.getClass();
                    float f14 = eVar2.f97918c;
                    bVar.getClass();
                    h4.r rVarC4 = c2.l.C(aVar, 0.0f, f14, 0.0f, eVar2.f97918c, 5);
                    boolean zR2 = o0VarE.r(b0Var) | o0VarE.B(mcVarF);
                    Object objQ4 = o0VarE.q();
                    if (zR2 || objQ4 == c2565a) {
                        objQ4 = new fo.j(p1Var, b0Var, mcVarF, 22);
                        o0VarE.K(objQ4);
                    }
                    p3.o0 o0Var = o0VarE;
                    mh.c(strQ, u1.w.d(rVarC4, false, null, null, (e23.a) objQ4, 15), jA, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0Var, 0, 0, 131064);
                    o0VarE = o0Var;
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1299510001);
                    o0VarE.g0(false);
                }
                if (g22.n.d(str4)) {
                    o0VarE.C(1299567568);
                    if (z16 || !z15) {
                        o0VarE.C(1299901221);
                        o0VarE.g0(false);
                        lVar = null;
                    } else {
                        o0VarE.C(1299694017);
                        boolean zR3 = o0VarE.r(b0Var) | o0VarE.B(mcVarF);
                        Object objQ5 = o0VarE.q();
                        if (zR3 || objQ5 == c2565a) {
                            objQ5 = new kh0.e(p1Var, b0Var, mcVarF, 5);
                            o0VarE.K(objQ5);
                        }
                        lVar = (e23.l) objQ5;
                        o0VarE.g0(false);
                    }
                    str2 = str4;
                    b(str2, lVar, o0VarE, 0);
                    o0VarE.g0(false);
                } else {
                    str2 = str4;
                    o0VarE.C(1299968305);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                nr.x xVar = (nr.x) p1Var.getF182175a();
                if (mcVarF.e() || xVar == null) {
                    o0VarE.C(491003687);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(490819175);
                    String str5 = str2 == null ? "" : str2;
                    String str6 = str3 == null ? "" : str3;
                    boolean z17 = (i15 & 14) == 4;
                    Object objQ6 = o0VarE.q();
                    if (z17 || objQ6 == c2565a) {
                        objQ6 = new l(eVar);
                        o0VarE.K(objQ6);
                    }
                    x.a(mcVarF, b0Var, xVar, str5, str6, (e23.p) objQ6, o0VarE, 0);
                    o0VarE.g0(false);
                }
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarE);
            c2.b0 b0Var3 = c2.b0.f22601a;
            s2VarA = q2.a(c2.j.f22698h, h4.d.a.f81533k, o0VarE, 6);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(aVar, o0VarE);
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar3, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var2 = u2.f22900a;
            if (str3 == null) {
                str = "";
            } else {
                str = str3;
            }
            j92.f fVar3 = d92.b.f58624b;
            fVar3.getClass();
            mh.c(str, u2Var2.a(aVar, 1.0f, true), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, o0VarE), o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            if (eVar.f127058d) {
                o0VarE.C(-2126811443);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-2126811443);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            if (str4 != null) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (!z16) {
                o0VarE.C(1299510001);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1299510001);
                o0VarE.g0(false);
            }
            if (g22.n.d(str4)) {
                o0VarE.C(1299567568);
                if (z16) {
                    o0VarE.C(1299901221);
                    o0VarE.g0(false);
                    lVar = null;
                } else {
                    o0VarE.C(1299901221);
                    o0VarE.g0(false);
                    lVar = null;
                }
                str2 = str4;
                b(str2, lVar, o0VarE, 0);
                o0VarE.g0(false);
            } else {
                str2 = str4;
                o0VarE.C(1299968305);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            nr.x xVar2 = (nr.x) p1Var.getF182175a();
            if (mcVarF.e()) {
                o0VarE.C(491003687);
                o0VarE.g0(false);
            } else {
                o0VarE.C(491003687);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l(eVar, i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(String str, e23.l lVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        int i15;
        int i16;
        int i17;
        str.getClass();
        p3.o0 o0VarE = mVar.E(1063010052);
        int i18 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i18 & 1, (i18 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = x2.f(aVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarA = v2.a(r1.g0.a(c2.l.A(rVarF, 0.0f, eVar.f97918c, 1), null, 3), lVar != null, new gt1.l(lVar, 8), o0VarE, 0);
            int i19 = ((Boolean) p1Var.getF182175a()).booleanValue() ? Integer.MAX_VALUE : 4;
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                d6.p.f57793b.getClass();
                i15 = d6.p.f57796e;
            } else {
                d6.p.f57793b.getClass();
                i15 = d6.p.f57795d;
            }
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            s5.x0 x0Var = j92.f.f97933j;
            s5.x0 x0VarF = d92.c.f(x0Var, o0VarE);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new xq1.c(p1Var2, 9);
                o0VarE.K(objQ3);
            }
            mh.c(str, rVarA, 0L, null, 0L, null, 0L, null, 0L, i15, false, i19, 0, (e23.l) objQ3, x0VarF, o0VarE, i18 & 14, 1572864, 45052);
            o0Var = o0VarE;
            if (((Boolean) p1Var2.getF182175a()).booleanValue() || ((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0Var.C(1339568364);
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    i16 = -649523830;
                    i17 = R.string.lbl_read_less;
                } else {
                    i16 = -649522422;
                    i17 = R.string.lbl_read_more;
                }
                String strJ = com.airbnb.lottie.animation.keyframe.a.j(o0Var, i16, i17, o0Var, false);
                fVar.getClass();
                long jA = d92.b.a(o0Var).k().a();
                bVar.getClass();
                h4.r rVarA2 = c2.l.A(aVar, 0.0f, eVar.f97918c, 1);
                Object objQ4 = o0Var.q();
                if (objQ4 == c2565a) {
                    objQ4 = new yg2.l0(p1Var, 2);
                    o0Var.K(objQ4);
                }
                mh.c(strJ, u1.w.d(rVarA2, false, null, null, (e23.a) objQ4, 15), jA, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0Var, 0, 0, 131064);
                o0Var.g0(false);
            } else {
                o0Var.C(1339960638);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aa2.b(str, lVar, i14, 7);
        }
    }
}
