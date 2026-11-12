package ky0;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.e9;
import i3.i7;
import i3.mc;
import i3.mh;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import v62.b3;

/* JADX INFO: loaded from: classes9.dex */
public final class t {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDescriptionComponentKt$MultiDayActivitiesDescriptionComponent$1$1$1$1$1", f = "MultiDayActivitiesDescriptionComponent.kt", l = {63}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f107537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f107538b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc mcVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f107538b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f107538b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f107537a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f107537a = 1;
                if (this.f107538b.b(this) == aVar) {
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
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDescriptionComponentKt$MultiDayActivitiesDescriptionComponent$1$2$1$1", f = "MultiDayActivitiesDescriptionComponent.kt", l = {81}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f107539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f107540b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(mc mcVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f107540b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f107540b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f107539a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f107539a = 1;
                if (this.f107540b.b(this) == aVar) {
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
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDescriptionComponentKt$MultiDayActivitiesDescriptionComponent$1$3$1$1", f = "MultiDayActivitiesDescriptionComponent.kt", l = {92}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f107541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f107542b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(mc mcVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f107542b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f107542b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f107541a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f107541a = 1;
                if (this.f107542b.b(this) == aVar) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r10v6, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    public static final void a(String str, String str2, boolean z14, e23.p<? super String, ? super String, Unit> pVar, p3.m mVar, int i14) {
        String str3;
        e23.p<? super String, ? super String, Unit> pVar2;
        ?? r14;
        boolean z15;
        ?? r15;
        ?? r16;
        int i15;
        e23.l lVar;
        pVar.getClass();
        p3.o0 o0VarE = mVar.E(-1354162464);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.r(pVar) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
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
            p3.p1 p1Var = (p3.p1) objQ2;
            h4.r.a aVar = h4.r.S;
            h4.r rVarY = x2.y(u1.n.e(aVar, tn.k.b(d92.b.f58623a, o0VarE), o4.m1.f128891a), null, 3);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarA = c2.l.A(rVarY, eVar.f97920e, 0.0f, 2);
            bVar.getClass();
            h4.r rVarC = c2.l.C(rVarA, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
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
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            s2 s2VarA = q2.a(c2.j.f22698h, h4.d.a.f81533k, o0VarE, 6);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(aVar, o0VarE);
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
            b4.c(eVar2, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC3, o0VarE);
            u2 u2Var = u2.f22900a;
            String str4 = str == null ? "" : str;
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            mh.c(str4, u2Var.a(aVar, 1.0f, true), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, o0VarE), o0VarE, 0, 0, 131068);
            p3.o0 o0Var = o0VarE;
            if (z14) {
                o0Var.C(841888541);
                s62.a.f157643a.getClass();
                u4.d dVarA = b3.a(t62.b.f162798a);
                bVar.getClass();
                h4.r rVarQ = x2.q(aVar, j92.b.f97901d.f97904c);
                boolean zR = o0Var.r(b0Var) | o0Var.B(mcVarF);
                Object objQ3 = o0Var.q();
                if (zR || objQ3 == c2565a) {
                    objQ3 = new fo.j(p1Var, b0Var, mcVarF, 2);
                    o0Var.K(objQ3);
                }
                i7.b(dVarA, gl1.y.Q(o0Var, R.string.lbl_edit), u1.w.d(rVarQ, false, null, null, (e23.a) objQ3, 15), sn.a.y(o0Var), o0Var, 0, 0);
                z15 = false;
                o0Var.g0(false);
            } else {
                z15 = false;
                o0Var.C(842393500);
                o0Var.g0(false);
            }
            o0Var.g0(true);
            boolean z16 = (str2 == null || str2.length() == 0) ? true : z15;
            if (z14 && z16) {
                o0Var.C(1030767521);
                String strQ = gl1.y.Q(o0Var, R.string.workout_add_notes);
                fVar2.getClass();
                s5.x0 x0Var = j92.f.f97933j;
                long jA = d92.b.a(o0Var).k().a();
                bVar.getClass();
                float f14 = eVar.f97918c;
                bVar.getClass();
                h4.r rVarC4 = c2.l.C(aVar, 0.0f, f14, 0.0f, eVar.f97918c, 5);
                boolean zR2 = o0Var.r(b0Var) | o0Var.B(mcVarF);
                Object objQ4 = o0Var.q();
                if (zR2 || objQ4 == c2565a) {
                    objQ4 = new fo.j(p1Var, b0Var, mcVarF, 3);
                    o0Var.K(objQ4);
                }
                boolean z17 = z15;
                mh.c(strQ, u1.w.d(rVarC4, false, null, null, (e23.a) objQ4, 15), jA, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0Var, 0, 0, 131064);
                p3.o0 o0Var2 = o0Var;
                o0Var2.g0(z17);
                r16 = z17;
                r15 = o0Var2;
            } else {
                boolean z18 = z15;
                o0Var.C(1031260824);
                o0Var.g0(z18);
                r16 = z18;
                r15 = o0Var;
            }
            if (z16) {
                str3 = str2;
                i15 = i16;
                r15.C(1031700280);
                r15.g0(r16);
            } else {
                r15.C(1031308192);
                if (z14) {
                    r15.C(1031429836);
                    boolean zR3 = r15.r(b0Var) | r15.B(mcVarF);
                    Object objQ5 = r15.q();
                    if (zR3 || objQ5 == c2565a) {
                        objQ5 = new kh0.e(p1Var, b0Var, mcVarF, 1);
                        r15.K(objQ5);
                    }
                    lVar = (e23.l) objQ5;
                    r15.g0(r16);
                } else {
                    r15.C(1031633196);
                    r15.g0(r16);
                    lVar = null;
                }
                i15 = i16;
                str3 = str2;
                v1.a(str3, lVar, r15, (i15 >> 3) & 14, r16);
                r15.g0(r16);
            }
            r15.g0(true);
            f fVar3 = (f) p1Var.getF182175a();
            if (!mcVarF.e() || fVar3 == null) {
                pVar2 = pVar;
                r15.C(776602082);
                r15.g0(r16);
                r14 = r15;
            } else {
                r15.C(776431985);
                String str5 = str3 == null ? "" : str3;
                String str6 = str == null ? "" : str;
                ?? r17 = (i15 & 7168) == 2048 ? 1 : r16;
                Object objQ6 = r15.q();
                if (r17 != 0 || objQ6 == c2565a) {
                    pVar2 = pVar;
                    objQ6 = new a3.d(pVar2, 19);
                    r15.K(objQ6);
                } else {
                    pVar2 = pVar;
                }
                ?? r18 = r15;
                r.a(mcVarF, b0Var, fVar3, str5, str6, (e23.p) objQ6, r18, 0);
                ?? r19 = r18;
                r19.g0(r16);
                r14 = r19;
            }
        } else {
            str3 = str2;
            pVar2 = pVar;
            o0VarE.e();
            r14 = o0VarE;
        }
        p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.g((Object) str, (Object) str3, z14, (o13.h) pVar2, i14, 27);
        }
    }
}
