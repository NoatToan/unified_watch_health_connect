package kn1;

import b82.a1;
import b82.g1;
import c2.q;
import c2.u;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import f5.z0;
import fn1.t;
import h5.e0;
import i3.e9;
import i3.mc;
import km1.v;
import l72.w1;
import l72.z2;
import o13.r;
import o4.m1;
import o53.b0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p13.x;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;
import sm1.a0;
import sm1.s;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.detail.score.SleepScoreDailyScreenKt$SleepScoreScreen$1$1$2$2$1$1", f = "SleepScoreDailyScreen.kt", l = {129}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f105652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f105653b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc mcVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f105653b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f105653b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f105652a;
            if (i14 == 0) {
                r.b(obj);
                this.f105652a = 1;
                if (this.f105653b.b(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.detail.score.SleepScoreDailyScreenKt$SleepTimelineDetails$1$1", f = "SleepScoreDailyScreen.kt", l = {168}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f105654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ DateTime f105655b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i2.a f105656c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ s f105657d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x3<a0> f105658e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(DateTime dateTime, i2.a aVar, s sVar, x3<a0> x3Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f105655b = dateTime;
            this.f105656c = aVar;
            this.f105657d = sVar;
            this.f105658e = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f105655b, this.f105656c, this.f105657d, this.f105658e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f105654a;
            if (i14 == 0) {
                r.b(obj);
                x3<a0> x3Var = this.f105658e;
                if (x3Var.getF182175a().f160092h && p005kotlin.jvm.internal.s.g(g22.l.h(x3Var.getF182175a().f160088d).toDateTimeAtStartOfDay(), this.f105655b)) {
                    this.f105654a = 1;
                    if (this.f105656c.a(null, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            this.f105657d.y4(false);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0123  */
    public static final void a(km1.c cVar, DateTime dateTime, s sVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        e23.a<Unit> aVar2;
        sVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(895593752);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(dateTime) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(sVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            aVar2 = aVar;
            i15 |= o0VarE.r(aVar2) ? 2048 : 1024;
        } else {
            aVar2 = aVar;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            if (cVar == null || !in1.a.b(cVar)) {
                o0VarE.C(297636658);
                in1.f.b(cVar != null ? cVar.getDailySleep() : null, dateTime, sVar, aVar2, o0VarE, (i15 & 7168) | v.P0 | (i15 & 112) | (i15 & 896));
                o0VarE.g0(false);
            } else {
                o0VarE.C(296849568);
                h4.r rVarE = u1.n.e(h4.r.S, vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
                h4.d.f81522a.getClass();
                z0 z0VarD = q.d(h4.d.a.f81524b, false);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(rVarE, o0VarE);
                h5.g.V.getClass();
                e0.a aVar3 = h5.g.a.f81805b;
                if (o0VarE.f135177b == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                u uVar = u.f22885a;
                v dailySleep = cVar.getDailySleep();
                if (dailySleep == null || !in1.a.c(dailySleep)) {
                    o0VarE.C(984492850);
                    v dailySleep2 = cVar.getDailySleep();
                    if (dailySleep2 != null && dailySleep2.getSleepFromDevice()) {
                        o0VarE.C(984659413);
                        b(cVar, dateTime, sVar, o0VarE, (i15 & 896) | km1.c.B | (i15 & 14) | (i15 & 112));
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(984749003);
                        jn1.c.a(cVar, dateTime, sVar, o0VarE, (i15 & 896) | km1.c.B | (i15 & 14) | (i15 & 112));
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(984259048);
                    int sleepTimeSeconds = dailySleep.getSleepTimeSeconds();
                    String userNote = dailySleep.getUserNote();
                    boolean zR = o0VarE.r(sVar) | o0VarE.r(dailySleep);
                    Object objQ = o0VarE.q();
                    if (zR) {
                        objQ = new jn1.d(sVar, dailySleep, 1);
                        o0VarE.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new jn1.d(sVar, dailySleep, 1);
                            o0VarE.K(objQ);
                        }
                    }
                    in1.e.a(userNote, (e23.l) objQ, o0VarE, sleepTimeSeconds, 0);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t(cVar, dateTime, sVar, aVar, i14, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:101:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:48:0x010e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0127  */
    /* JADX WARN: Code duplicated, block: B:53:0x0148  */
    /* JADX WARN: Code duplicated, block: B:56:0x016c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0175  */
    /* JADX WARN: Code duplicated, block: B:59:0x0179  */
    /* JADX WARN: Code duplicated, block: B:64:0x0194  */
    /* JADX WARN: Code duplicated, block: B:70:0x01be  */
    /* JADX WARN: Code duplicated, block: B:77:0x023b  */
    /* JADX WARN: Code duplicated, block: B:79:0x025e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0264  */
    /* JADX WARN: Code duplicated, block: B:84:0x0291  */
    /* JADX WARN: Code duplicated, block: B:85:0x0296  */
    /* JADX WARN: Code duplicated, block: B:94:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:97:0x02b2  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(km1.c cVar, DateTime dateTime, s sVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        p1 p1Var;
        h5.g.a.f fVar;
        int i16;
        int i17;
        boolean zB;
        p3.m.a aVar;
        int i18;
        j92.b bVar;
        float f14;
        int i19;
        int i24;
        int i25;
        int i26;
        v dailySleep;
        String userNote;
        int i27;
        int i28;
        Object objQ;
        boolean z14;
        m0 m0Var;
        Object objQ2;
        p3.m.a.C2565a c2565a;
        b0 b0Var;
        mc mcVarF;
        Object objQ3;
        p1 p1Var2;
        z0 z0VarD;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        boolean zR;
        Object objQ4;
        boolean z15;
        km1.c cVar2 = cVar;
        o0 o0VarE = mVar.E(803998301);
        p3.c<?> cVar3 = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(cVar2) : o0VarE.r(cVar2) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(dateTime) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(sVar) ? 256 : 128;
        }
        int i29 = i15;
        if (o0VarE.n(i29 & 1, (i29 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(sVar.f160188h, o0VarE);
            h4.r.a aVar2 = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f15 = eVar.f97921f;
            float f16 = eVar.f97920e;
            h4.r rVarC2 = c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, f15, 7);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarC2, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (cVar3 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T) {
                p1Var = p1VarC;
            } else {
                p1Var = p1VarC;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarE);
                c2.b0 b0Var2 = c2.b0.f22601a;
                int i30 = km1.c.B;
                i16 = i29 & 14;
                int i34 = i30 | i16;
                i17 = i34 | ((i29 >> 3) & 112);
                n.a(cVar2, sVar, o0VarE, i17);
                bVar2.getClass();
                c2.l.f(x2.h(aVar2, f16), o0VarE);
                zB = in1.a.b(cVar2);
                aVar = p3.m.f135153a;
                if (zB) {
                    o0VarE.C(-147025450);
                    m0Var = new m0();
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ2 == c2565a) {
                        objQ2 = l0.j(t13.h.f161748a, o0VarE);
                        o0VarE.K(objQ2);
                    }
                    b0Var = (b0) objQ2;
                    mcVarF = e9.f(true, null, o0VarE, 6, 2);
                    objQ3 = o0VarE.q();
                    if (objQ3 == c2565a) {
                        objQ3 = p0.n(null);
                        o0VarE.K(objQ3);
                    }
                    p1Var2 = (p1) objQ3;
                    z0VarD = q.d(h4.d.a.f81524b, false);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(aVar2, o0VarE);
                    if (cVar3 != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar3);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar2, z0VarD, o0VarE);
                    b4.c(c1623g, i2VarA0, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                    }
                    b4.c(fVar, rVarC, o0VarE);
                    u uVar = u.f22885a;
                    String strQ = gl1.y.Q(o0VarE, R.string.msg_tap_arrow_sleep_score);
                    w1 w1Var = w1.TopCenter;
                    l72.x1 x1Var2 = l72.x1.EndMedium;
                    boolean z16 = ((a0) p1Var.getF182175a()).f160096l;
                    zR = o0VarE.r(sVar);
                    objQ4 = o0VarE.q();
                    if (!zR || objQ4 == c2565a) {
                        z15 = true;
                        objQ4 = new in1.l(sVar, 1);
                        o0VarE.K(objQ4);
                    } else {
                        z15 = true;
                    }
                    e23.a aVar4 = (e23.a) objQ4;
                    bVar = bVar2;
                    i18 = i17;
                    z3.e eVarC = z3.f.c(2035478977, new ak0.j(cVar, b0Var, mcVarF, m0Var, p1Var2, 29), o0VarE);
                    aVar2 = aVar2;
                    i24 = i16;
                    i26 = 4;
                    i25 = 0;
                    i19 = i29;
                    a1.a(strQ, w1Var, x1Var2, null, 0L, z16, aVar4, eVarC, o0VarE, 100666752, 50);
                    if (mcVarF.e() || ((mn1.b) p1Var2.getF182175a()) == null) {
                        o0Var = o0VarE;
                        cVar2 = cVar;
                        o0Var.C(1797616508);
                        o0Var.g0(false);
                    } else {
                        o0VarE.C(1797512720);
                        o0Var = o0VarE;
                        cVar2 = cVar;
                        g.a((mn1.b) p1Var2.getF182175a(), cVar2, mcVarF, b0Var, o0Var, (i30 << 3) | ((i19 << 3) & 112));
                        o0Var.g0(false);
                    }
                    o0Var.g0(true);
                    bVar.getClass();
                    f14 = f16;
                    c2.l.f(x2.h(aVar2, f14), o0Var);
                    o0Var.g0(false);
                } else {
                    i18 = i17;
                    bVar = bVar2;
                    f14 = f16;
                    o0Var = o0VarE;
                    i19 = i29;
                    i24 = i16;
                    i25 = 0;
                    i26 = 4;
                    o0Var.C(-145114021);
                    o0Var.g0(false);
                }
                c(cVar2, dateTime, sVar, o0Var, i34 | (i19 & 112) | (i19 & 896));
                tn.k.n(bVar, aVar2, f14, o0Var);
                in1.s.q(cVar2, sVar, o0Var, i18);
                dailySleep = cVar2.getDailySleep();
                if (dailySleep != null) {
                    userNote = dailySleep.getUserNote();
                } else {
                    userNote = null;
                }
                boolean zR2 = o0Var.r(sVar);
                if (i24 != i26 || ((i19 & 8) != 0 && o0Var.r(cVar2))) {
                    i27 = 1;
                } else {
                    i27 = i25;
                }
                i28 = (zR2 ? 1 : 0) | i27;
                objQ = o0Var.q();
                if (i28 == 0) {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        z14 = true;
                        objQ = new jn1.a(sVar, cVar2, 1);
                        o0Var.K(objQ);
                    } else {
                        z14 = true;
                    }
                } else {
                    z14 = true;
                    objQ = new jn1.a(sVar, cVar2, 1);
                    o0Var.K(objQ);
                }
                in1.i.a(userNote, (e23.l) objQ, o0Var, i25);
                o0Var.g0(z14);
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarE);
            c2.b0 b0Var3 = c2.b0.f22601a;
            int i35 = km1.c.B;
            i16 = i29 & 14;
            int i36 = i35 | i16;
            i17 = i36 | ((i29 >> 3) & 112);
            n.a(cVar2, sVar, o0VarE, i17);
            bVar2.getClass();
            c2.l.f(x2.h(aVar2, f16), o0VarE);
            zB = in1.a.b(cVar2);
            aVar = p3.m.f135153a;
            if (zB) {
                o0VarE.C(-147025450);
                m0Var = new m0();
                objQ2 = o0VarE.q();
                aVar.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ2 == c2565a) {
                    objQ2 = l0.j(t13.h.f161748a, o0VarE);
                    o0VarE.K(objQ2);
                }
                b0Var = (b0) objQ2;
                mcVarF = e9.f(true, null, o0VarE, 6, 2);
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = p0.n(null);
                    o0VarE.K(objQ3);
                }
                p1Var2 = (p1) objQ3;
                z0VarD = q.d(h4.d.a.f81524b, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(aVar2, o0VarE);
                if (cVar3 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                }
                b4.c(fVar, rVarC, o0VarE);
                u uVar2 = u.f22885a;
                String strQ2 = gl1.y.Q(o0VarE, R.string.msg_tap_arrow_sleep_score);
                w1 w1Var2 = w1.TopCenter;
                l72.x1 x1Var3 = l72.x1.EndMedium;
                boolean z17 = ((a0) p1Var.getF182175a()).f160096l;
                zR = o0VarE.r(sVar);
                objQ4 = o0VarE.q();
                if (zR) {
                    z15 = true;
                    objQ4 = new in1.l(sVar, 1);
                    o0VarE.K(objQ4);
                } else {
                    z15 = true;
                    objQ4 = new in1.l(sVar, 1);
                    o0VarE.K(objQ4);
                }
                e23.a aVar5 = (e23.a) objQ4;
                bVar = bVar2;
                i18 = i17;
                z3.e eVarC2 = z3.f.c(2035478977, new ak0.j(cVar, b0Var, mcVarF, m0Var, p1Var2, 29), o0VarE);
                aVar2 = aVar2;
                i24 = i16;
                i26 = 4;
                i25 = 0;
                i19 = i29;
                a1.a(strQ2, w1Var2, x1Var3, null, 0L, z17, aVar5, eVarC2, o0VarE, 100666752, 50);
                if (mcVarF.e()) {
                    o0Var = o0VarE;
                    cVar2 = cVar;
                    o0Var.C(1797616508);
                    o0Var.g0(false);
                } else {
                    o0Var = o0VarE;
                    cVar2 = cVar;
                    o0Var.C(1797616508);
                    o0Var.g0(false);
                }
                o0Var.g0(true);
                bVar.getClass();
                f14 = f16;
                c2.l.f(x2.h(aVar2, f14), o0Var);
                o0Var.g0(false);
            } else {
                i18 = i17;
                bVar = bVar2;
                f14 = f16;
                o0Var = o0VarE;
                i19 = i29;
                i24 = i16;
                i25 = 0;
                i26 = 4;
                o0Var.C(-145114021);
                o0Var.g0(false);
            }
            c(cVar2, dateTime, sVar, o0Var, i36 | (i19 & 112) | (i19 & 896));
            tn.k.n(bVar, aVar2, f14, o0Var);
            in1.s.q(cVar2, sVar, o0Var, i18);
            dailySleep = cVar2.getDailySleep();
            if (dailySleep != null) {
                userNote = dailySleep.getUserNote();
            } else {
                userNote = null;
            }
            boolean zR3 = o0Var.r(sVar);
            if (i24 != i26) {
                i27 = 1;
            } else {
                i27 = 1;
            }
            i28 = (zR3 ? 1 : 0) | i27;
            objQ = o0Var.q();
            if (i28 == 0) {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    z14 = true;
                    objQ = new jn1.a(sVar, cVar2, 1);
                    o0Var.K(objQ);
                } else {
                    z14 = true;
                }
            } else {
                z14 = true;
                objQ = new jn1.a(sVar, cVar2, 1);
                o0Var.K(objQ);
            }
            in1.i.a(userNote, (e23.l) objQ, o0Var, i25);
            o0Var.g0(z14);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jn1.b(cVar2, dateTime, sVar, i14, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(km1.c cVar, DateTime dateTime, s sVar, p3.m mVar, int i14) {
        int i15;
        i2.a aVar;
        s sVar2 = sVar;
        o0 o0VarE = mVar.E(653862464);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(dateTime) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(sVar2) ? 256 : 128;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(sVar2.f160188h, o0VarE);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new i2.c();
                o0VarE.K(objQ);
            }
            i2.a aVar2 = (i2.a) objQ;
            i53.c cVarE = i53.a.e(x.k(new g1(gl1.y.Q(o0VarE, R.string.lbl_timeline_segment_title), null, null, null, 14, null), new g1(gl1.y.Q(o0VarE, R.string.lbl_stages), null, null, null, 14, null)));
            Unit unit = Unit.INSTANCE;
            boolean zB = o0VarE.B(p1VarC) | o0VarE.r(dateTime) | o0VarE.r(aVar2) | o0VarE.r(sVar2);
            Object objQ2 = o0VarE.q();
            if (zB || objQ2 == c2565a) {
                b bVar = new b(dateTime, aVar2, sVar, p1VarC, null);
                aVar = aVar2;
                sVar2 = sVar;
                o0VarE.K(bVar);
                objQ2 = bVar;
            } else {
                aVar = aVar2;
            }
            l0.e((p) objQ2, unit, o0VarE);
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarE = u1.n.e(x2.f(aVar3, 1.0f), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarA = i2.d.a(c2.l.C(rVarE, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), aVar);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            bVar2.getClass();
            h4.r rVarA2 = c2.l.A(aVar3, eVar.f97920e, 0.0f, 2);
            boolean zB2 = o0VarE.B(p1VarC);
            Object objQ3 = o0VarE.q();
            if (zB2 || objQ3 == c2565a) {
                objQ3 = new by1.h(p1VarC, 5);
                o0VarE.K(objQ3);
            }
            e23.a aVar5 = (e23.a) objQ3;
            boolean zR = o0VarE.r(sVar2);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == c2565a) {
                objQ4 = new in1.c(sVar2, 2);
                o0VarE.K(objQ4);
            }
            z2.a(cVarE, rVarA2, null, 0.0f, aVar5, (e23.l) objQ4, o0VarE, 384);
            o0VarE = o0VarE;
            int i17 = ((a0) p1VarC.getF182175a()).f160090f;
            if (i17 == 0) {
                o0VarE.C(-692383418);
                ht.a.f85464a.getClass();
                ht.a.a(null, "SleepTimelineChartTabSwitch");
                in1.d.a(cVar, dateTime, sVar, in1.a.d(cVar), o0VarE, km1.c.B | (i16 & 14) | (i16 & 112) | (i16 & 896));
                o0VarE.g0(false);
            } else if (i17 != 1) {
                o0VarE.C(-691563592);
                o0VarE.g0(false);
            } else {
                boolean z14 = false;
                o0VarE.C(-692084764);
                ht.a.f85464a.getClass();
                ht.a.a(null, "SleepTimelineStagesTabSwitch");
                if (cVar == null) {
                    o0VarE.C(-691911258);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-691911257);
                    bVar2.getClass();
                    h4.r rVarC2 = c2.l.C(aVar3, 0.0f, eVar.f97922g, 0.0f, 0.0f, 13);
                    tm1.a.C3110a c3110a = tm1.a.f165439a;
                    tm1.b bVarN = o72.t.N(cVar);
                    c3110a.getClass();
                    in1.j.a(rVarC2, tm1.a.C3110a.c(bVarN), in1.a.a(cVar), false, o0VarE, 0, 8);
                    z14 = false;
                    o0VarE.g0(false);
                }
                o0VarE.g0(z14);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jn1.b(cVar, dateTime, sVar, i14, 3);
        }
    }
}
