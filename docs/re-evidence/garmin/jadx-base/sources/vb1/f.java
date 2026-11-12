package vb1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.l;
import c2.u;
import c2.x2;
import c2.y;
import c2.z;
import c80.l0;
import c80.q0;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import e23.q;
import f5.z0;
import h4.k;
import h5.e0;
import i3.mh;
import l72.f0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p40.j0;
import p5.v;
import r1.c0;
import r1.u0;
import r53.j;
import u1.y0;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.presentation.components.LargePromoCardKt$LargePromoCard$1$1", f = "LargePromoCard.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f176875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f176876b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r53.i<q0> f176877c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l0.c f176878d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f176879e;

        /* JADX INFO: renamed from: vb1.f$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.presentation.components.LargePromoCardKt$LargePromoCard$1$1$1", f = "LargePromoCard.kt", l = {79}, m = "invokeSuspend", v = 2)
        public static final class C3303a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f176880a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r53.i<q0> f176881b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l0.c f176882c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ p1<Boolean> f176883d;

            /* JADX INFO: renamed from: vb1.f$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C3304a<T> implements j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ l0.c f176884a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p1<Boolean> f176885b;

                public C3304a(l0.c cVar, p1<Boolean> p1Var) {
                    this.f176884a = cVar;
                    this.f176885b = p1Var;
                }

                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    q0 q0Var = (q0) obj;
                    if ((q0Var instanceof q0.a) && ((q0.a) q0Var).f25550a == this.f176884a.f25409a) {
                        this.f176885b.setValue(Boolean.FALSE);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C3303a(r53.i<? extends q0> iVar, l0.c cVar, p1<Boolean> p1Var, t13.d<? super C3303a> dVar) {
                super(2, dVar);
                this.f176881b = iVar;
                this.f176882c = cVar;
                this.f176883d = p1Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C3303a(this.f176881b, this.f176882c, this.f176883d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C3303a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f176880a;
                if (i14 == 0) {
                    r.b(obj);
                    C3304a c3304a = new C3304a(this.f176882c, this.f176883d);
                    this.f176880a = 1;
                    if (this.f176881b.collect(c3304a, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.a<Unit> aVar, r53.i<? extends q0> iVar, l0.c cVar, p1<Boolean> p1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f176876b = aVar;
            this.f176877c = iVar;
            this.f176878d = cVar;
            this.f176879e = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f176876b, this.f176877c, this.f176878d, this.f176879e, dVar);
            aVar.f176875a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f176875a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f176876b.invoke();
            ge1.b.T(b0Var, null, null, new C3303a(this.f176877c, this.f176878d, this.f176879e, null), 3);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0126  */
    /* JADX WARN: Code duplicated, block: B:49:0x012d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0131  */
    /* JADX WARN: Code duplicated, block: B:55:0x014c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0154  */
    /* JADX WARN: Code duplicated, block: B:59:0x0163  */
    /* JADX WARN: Code duplicated, block: B:61:0x01af  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:65:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:66:0x0205  */
    /* JADX WARN: Code duplicated, block: B:68:0x022b  */
    /* JADX WARN: Code duplicated, block: B:69:0x022d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0234  */
    /* JADX WARN: Code duplicated, block: B:74:0x023d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0259  */
    public static final void a(int i14, e23.a aVar, h4.r rVar, String str, String str2, String str3, m mVar) {
        h4.r rVar2;
        boolean z14;
        int i15;
        h5.g.a.f fVar;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        boolean z15;
        j92.e eVar;
        boolean z16;
        boolean z17;
        Object objQ;
        o0 o0VarE = mVar.E(1623253761);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = i14 | 6 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128) | (o0VarE.B(str3) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192);
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            h4.r.a aVar2 = h4.r.S;
            x1 x1Var = n.f135158a;
            if (str2 != null) {
                o0VarE.C(873742715);
                boolean z18 = c22.b.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b)) < 2.0f;
                o0VarE.g0(false);
                z14 = z18;
            } else {
                o0VarE.C(1316221626);
                o0VarE.g0(false);
                z14 = false;
            }
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar2 = j92.b.f97899b;
            h4.r rVarY = l.y(aVar2, eVar2.f97920e);
            c2.j jVar = c2.j.f22691a;
            bVar.getClass();
            float f14 = eVar2.f97920e;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81536n;
            z zVarA2 = y.a(iVarI, aVar3, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar3 = h5.g.a.f81810g;
            b4.c(eVar3, zVarA2, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                i15 = i16;
            } else {
                i15 = i16;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                bVar.getClass();
                zVarA = y.a(c2.j.i(eVar2.f97917b), aVar3, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(aVar2, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar3, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                if (str == null) {
                    o0VarE.C(473557388);
                    o0VarE.g0(false);
                    eVar = eVar2;
                    z15 = false;
                    z16 = true;
                } else {
                    o0VarE.C(473557389);
                    d92.b.f58624b.getClass();
                    z15 = false;
                    eVar = eVar2;
                    z16 = true;
                    mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97928e), o0VarE), o0VarE, 0, 0, 131070);
                    Unit unit = Unit.INSTANCE;
                    o0VarE.g0(false);
                }
                if (z14) {
                    o0VarE = o0VarE;
                    o0VarE.C(473660185);
                    d92.b.f58624b.getClass();
                    o0 o0Var = o0VarE;
                    mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0Var, (i15 >> 6) & 14, 0, 131070);
                    o0VarE = o0Var;
                    o0VarE.g0(z15);
                } else {
                    o0VarE = o0VarE;
                    o0VarE.C(473748597);
                    o0VarE.g0(z15);
                }
                o0VarE.g0(z16);
                if (str3 == null) {
                    o0VarE.C(162754994);
                    o0VarE.g0(z15);
                } else {
                    o0VarE.C(162754995);
                    f0.a aVar5 = f0.a.f111000a;
                    h4.r rVarY2 = x2.y(aVar2, null, 3);
                    bVar.getClass();
                    h4.r rVarC3 = l.C(rVarY2, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
                    if ((i15 & 57344) == 16384) {
                        z17 = z16;
                    } else {
                        z17 = z15;
                    }
                    objQ = o0VarE.q();
                    if (z17) {
                        objQ = new ux1.g(aVar, 3);
                        o0VarE.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new ux1.g(aVar, 3);
                            o0VarE.K(objQ);
                        }
                    }
                    aVar5.f(str3, rVarC3, false, (e23.a) objQ, o0VarE, 0, 4);
                    Unit unit2 = Unit.INSTANCE;
                    o0VarE.g0(z15);
                }
                o0VarE.g0(z16);
                rVar2 = aVar2;
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            bVar.getClass();
            zVarA = y.a(c2.j.i(eVar2.f97917b), aVar3, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(aVar2, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(eVar3, zVarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, o0VarE);
            if (str == null) {
                o0VarE.C(473557388);
                o0VarE.g0(false);
                eVar = eVar2;
                z15 = false;
                z16 = true;
            } else {
                o0VarE.C(473557389);
                d92.b.f58624b.getClass();
                z15 = false;
                eVar = eVar2;
                z16 = true;
                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97928e), o0VarE), o0VarE, 0, 0, 131070);
                Unit unit3 = Unit.INSTANCE;
                o0VarE.g0(false);
            }
            if (z14) {
                o0VarE = o0VarE;
                o0VarE.C(473660185);
                d92.b.f58624b.getClass();
                o0 o0Var2 = o0VarE;
                mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0Var2, (i15 >> 6) & 14, 0, 131070);
                o0VarE = o0Var2;
                o0VarE.g0(z15);
            } else {
                o0VarE = o0VarE;
                o0VarE.C(473748597);
                o0VarE.g0(z15);
            }
            o0VarE.g0(z16);
            if (str3 == null) {
                o0VarE.C(162754994);
                o0VarE.g0(z15);
            } else {
                o0VarE.C(162754995);
                f0.a aVar6 = f0.a.f111000a;
                h4.r rVarY3 = x2.y(aVar2, null, 3);
                bVar.getClass();
                h4.r rVarC4 = l.C(rVarY3, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
                if ((i15 & 57344) == 16384) {
                    z17 = z16;
                } else {
                    z17 = z15;
                }
                objQ = o0VarE.q();
                if (z17) {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new ux1.g(aVar, 3);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new ux1.g(aVar, 3);
                    o0VarE.K(objQ);
                }
                aVar6.f(str3, rVarC4, false, (e23.a) objQ, o0VarE, 0, 4);
                Unit unit4 = Unit.INSTANCE;
                o0VarE.g0(z15);
            }
            o0VarE.g0(z16);
            rVar2 = aVar2;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ku1.i(rVar2, str, str2, str3, aVar, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008c  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(h4.r rVar, final o13.p pVar, final float f14, final boolean z14, final long j8, m mVar, final int i14) {
        final h4.r rVar2;
        o0 o0VarE = mVar.E(-612060146);
        int i15 = i14 | 6 | (o0VarE.r(pVar) ? 32 : 16) | (o0VarE.i(f14) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024) | (o0VarE.l(j8) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            rVar2 = h4.r.S;
            x1 x1Var = n.f135158a;
            h4.r rVarF = x2.f(l4.k.b(rVar2, k2.i.c(f14, f14, 0.0f, 0.0f, 12)), 1.0f);
            boolean z15 = ((57344 & i15) == 16384) | ((i15 & 7168) == 2048);
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new j82.b(j8, z14, 2);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new j82.b(j8, z14, 2);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarE = l4.k.e(rVarF, (e23.l) objQ);
            f5.k.f68985a.getClass();
            y0.a((t4.d) pVar.f128594a, (String) pVar.f128595b, rVarE, null, f5.k.a.f68990e, 0.0f, null, o0VarE, 24576, 104);
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(pVar, f14, z14, j8, i14) { // from class: vb1.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o13.p f176871b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ float f176872c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f176873d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f176874e;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(1);
                    f.b(this.f176870a, this.f176871b, this.f176872c, this.f176873d, this.f176874e, (m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final h4.r rVar, final l0.c cVar, r53.i<? extends q0> iVar, e23.a<Unit> aVar, final e23.a<Unit> aVar2, final e23.l<? super Context, Unit> lVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        Unit unit;
        rVar.getClass();
        o0 o0VarE = mVar.E(-1442003660);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        int i16 = i15 | (o0VarE.B(cVar) ? 32 : 16) | (o0VarE.r(iVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192) | (o0VarE.r(lVar) ? 131072 : 65536);
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            x1 x1Var = n.f135158a;
            final Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            final String str = cVar.f25421h;
            final String str2 = cVar.f25419f;
            final String str3 = cVar.f25420g;
            final o13.p<t4.d, String> pVar = cVar.f25417d;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            final float f14 = j92.b.f97900c.f97911c;
            final long jT = v.h.t(o0VarE);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.TRUE);
                o0VarE.K(objQ);
            }
            final p1 p1Var = (p1) objQ;
            Unit unit2 = Unit.INSTANCE;
            boolean zR = ((i16 & 7168) == 2048) | o0VarE.r(iVar) | ((i16 & 112) == 32);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                unit = unit2;
                a aVar3 = new a(aVar, iVar, cVar, p1Var, null);
                o0VarE.K(aVar3);
                objQ2 = aVar3;
            } else {
                unit = unit2;
            }
            p3.l0.e((p) objQ2, unit, o0VarE);
            o0Var = o0VarE;
            c0.e(((Boolean) p1Var.getF182175a()).booleanValue(), null, null, u0.j(null, null, 15), null, z3.f.c(1882927116, new q() { // from class: vb1.b
                /* JADX WARN: Code duplicated, block: B:20:0x00d7  */
                /* JADX WARN: Code duplicated, block: B:22:0x00e0  */
                /* JADX WARN: Code duplicated, block: B:23:0x00e4  */
                /* JADX WARN: Code duplicated, block: B:28:0x0101  */
                /* JADX WARN: Code duplicated, block: B:32:0x012d  */
                /* JADX WARN: Code duplicated, block: B:35:0x014b  */
                /* JADX WARN: Code duplicated, block: B:37:0x0164  */
                /* JADX WARN: Code duplicated, block: B:41:0x0183  */
                /* JADX WARN: Code duplicated, block: B:43:0x01a0  */
                /* JADX WARN: Code duplicated, block: B:46:0x01af  */
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
                    Throwable th3;
                    h5.g.a.f fVar;
                    u uVar;
                    h4.r.a aVar4;
                    z zVarA;
                    int iHashCode;
                    i2 i2VarX;
                    h4.r rVarC;
                    l0.c cVar2;
                    e23.l lVar2;
                    Context context2;
                    boolean zR2;
                    Object objQ3;
                    Object objQ4;
                    e23.a aVar5;
                    boolean zB;
                    Object objQ5;
                    m mVar2 = (m) obj2;
                    ((Integer) obj3).getClass();
                    ((r1.e0) obj).getClass();
                    x1 x1Var2 = n.f135158a;
                    float f15 = f14;
                    k2.h hVarA = k2.i.a(f15);
                    h4.r rVar2 = rVar;
                    long j8 = jT;
                    h4.r rVarE = u1.n.e(rVar2, j8, hVarA);
                    Object objQ6 = mVar2.q();
                    m.f135153a.getClass();
                    m.a.C2565a c2565a2 = m.a.f135155b;
                    if (objQ6 == c2565a2) {
                        objQ6 = new d(0);
                        mVar2.K(objQ6);
                    }
                    h4.r rVarC2 = v.c((e23.l) objQ6, rVarE, true);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    h4.r rVarC3 = k.c(rVarC2, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar6 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar6);
                    } else {
                        mVar2.c();
                    }
                    h5.g.a.e eVar = h5.g.a.f81810g;
                    b4.c(eVar, z0VarD, mVar2);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX2, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (!mVar2.getT()) {
                        th3 = null;
                        if (!s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        }
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC3, mVar2);
                        uVar = u.f22885a;
                        aVar4 = h4.r.S;
                        h4.r rVarF = x2.f(aVar4, 1.0f);
                        c2.j.f22691a.getClass();
                        zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, mVar2, 0);
                        iHashCode = Long.hashCode(mVar2.getU());
                        i2VarX = mVar2.x();
                        rVarC = k.c(rVarF, mVar2);
                        if (mVar2.F() != null) {
                            p0.l();
                            throw th3;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar6);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar, zVarA, mVar2);
                        b4.c(c1623g, i2VarX, mVar2);
                        if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar);
                        }
                        b4.c(fVar, rVarC, mVar2);
                        c2.b0 b0Var = c2.b0.f22601a;
                        cVar2 = cVar;
                        f.b(null, pVar, f15, !cVar2.f25418e, j8, mVar2, 0);
                        lVar2 = lVar;
                        boolean zB2 = mVar2.B(lVar2);
                        context2 = context;
                        zR2 = zB2 | mVar2.r(context2);
                        objQ3 = mVar2.q();
                        if (zR2 || objQ3 == c2565a2) {
                            objQ3 = new kv0.e(2, context2, lVar2);
                            mVar2.K(objQ3);
                        }
                        f.a(0, (e23.a) objQ3, null, str2, str3, str, mVar2);
                        mVar2.y();
                        if (cVar2.f25410b) {
                            mVar2.C(-59976709);
                            String strQ = gl1.y.Q(mVar2, R.string.lbl_dismiss);
                            h4.r rVarC4 = uVar.c(aVar4, h4.d.a.f81526d);
                            objQ4 = mVar2.q();
                            if (objQ4 == c2565a2) {
                                objQ4 = new d(1);
                                mVar2.K(objQ4);
                            }
                            h4.r rVarC5 = v.c((e23.l) objQ4, rVarC4, false);
                            aVar5 = aVar2;
                            zB = mVar2.B(aVar5);
                            objQ5 = mVar2.q();
                            if (zB || objQ5 == c2565a2) {
                                objQ5 = new j0(aVar5, p1Var, 17);
                                mVar2.K(objQ5);
                            }
                            l72.u0.a(rVarC5, null, strQ, null, (e23.a) objQ5, mVar2, 0, 10);
                            mVar2 = mVar2;
                            mVar2.f();
                        } else {
                            mVar2.C(-59542864);
                            mVar2.f();
                        }
                        mVar2.y();
                        return Unit.INSTANCE;
                    }
                    th3 = null;
                    v.h.z(iHashCode2, mVar2, iHashCode2, bVar);
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC3, mVar2);
                    uVar = u.f22885a;
                    aVar4 = h4.r.S;
                    h4.r rVarF2 = x2.f(aVar4, 1.0f);
                    c2.j.f22691a.getClass();
                    zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, mVar2, 0);
                    iHashCode = Long.hashCode(mVar2.getU());
                    i2VarX = mVar2.x();
                    rVarC = k.c(rVarF2, mVar2);
                    if (mVar2.F() != null) {
                        p0.l();
                        throw th3;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar6);
                    } else {
                        mVar2.c();
                    }
                    b4.c(eVar, zVarA, mVar2);
                    b4.c(c1623g, i2VarX, mVar2);
                    if (mVar2.getT()) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    } else {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(fVar, rVarC, mVar2);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    cVar2 = cVar;
                    f.b(null, pVar, f15, !cVar2.f25418e, j8, mVar2, 0);
                    lVar2 = lVar;
                    boolean zB3 = mVar2.B(lVar2);
                    context2 = context;
                    zR2 = zB3 | mVar2.r(context2);
                    objQ3 = mVar2.q();
                    if (zR2) {
                        objQ3 = new kv0.e(2, context2, lVar2);
                        mVar2.K(objQ3);
                    } else {
                        objQ3 = new kv0.e(2, context2, lVar2);
                        mVar2.K(objQ3);
                    }
                    f.a(0, (e23.a) objQ3, null, str2, str3, str, mVar2);
                    mVar2.y();
                    if (cVar2.f25410b) {
                        mVar2.C(-59976709);
                        String strQ2 = gl1.y.Q(mVar2, R.string.lbl_dismiss);
                        h4.r rVarC6 = uVar.c(aVar4, h4.d.a.f81526d);
                        objQ4 = mVar2.q();
                        if (objQ4 == c2565a2) {
                            objQ4 = new d(1);
                            mVar2.K(objQ4);
                        }
                        h4.r rVarC7 = v.c((e23.l) objQ4, rVarC6, false);
                        aVar5 = aVar2;
                        zB = mVar2.B(aVar5);
                        objQ5 = mVar2.q();
                        if (zB) {
                            objQ5 = new j0(aVar5, p1Var, 17);
                            mVar2.K(objQ5);
                        } else {
                            objQ5 = new j0(aVar5, p1Var, 17);
                            mVar2.K(objQ5);
                        }
                        l72.u0.a(rVarC7, null, strQ2, null, (e23.a) objQ5, mVar2, 0, 10);
                        mVar2 = mVar2;
                        mVar2.f();
                    } else {
                        mVar2.C(-59542864);
                        mVar2.f();
                    }
                    mVar2.y();
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0Var, 199680, 22);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q32.b(rVar, cVar, iVar, aVar, aVar2, lVar, i14, 17);
        }
    }
}
