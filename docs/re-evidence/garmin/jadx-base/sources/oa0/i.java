package oa0;

import android.os.Parcelable;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.p;
import h4.k;
import h5.e0;
import i3.i7;
import i3.mh;
import j90.o;
import o13.r;
import o53.b0;
import o72.i1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.w;
import v62.e1;
import v62.l2;
import x62.q;

/* JADX INFO: loaded from: classes8.dex */
public final class i {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.displayprefernces.WearLocationScreenKt$WearLocationScreen$1$1", f = "WearLocationScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<o, Unit> f131071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<o> f131072b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super o, Unit> lVar, p1<o> p1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f131071a = lVar;
            this.f131072b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f131071a, this.f131072b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f131071a.invoke(this.f131072b.getF182175a());
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f131073a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.LEFT_WRIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.RIGHT_WRIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.LEFT_UPPER_ARM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o.RIGHT_UPPER_ARM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f131073a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0119  */
    /* JADX WARN: Code duplicated, block: B:76:0x0287  */
    public static final void a(final e.a aVar, e.a aVar2, o oVar, final l<? super o, Unit> lVar, m mVar, int i14) {
        final e.a aVar3;
        o0 o0VarE = mVar.E(959767893);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(aVar) ? 4 : 2) | (o0VarE.B(aVar2) ? 32 : 16) | (o0VarE.k(oVar.ordinal()) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            boolean z14 = oVar == aVar.f131054b;
            boolean z15 = oVar == aVar2.f131054b;
            h4.r.a aVar4 = h4.r.S;
            h4.r rVarF = x2.f(aVar4, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            boolean z16 = z14;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            boolean z17 = z15;
            e0.a aVar5 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r rVarF2 = x2.f(aVar4, 1.0f);
            long jA = am.j.A(d92.b.f58623a, o0VarE);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.d dVar = j92.b.f97900c;
            float f14 = dVar.f97911c;
            float f15 = dVar.f97911c;
            bVar2.getClass();
            h4.r rVarE = wz1.i.e(u1.n.e(rVarF2, jA, k2.i.c(f14, f15, 0.0f, 0.0f, 12)), z16, new i1(7), o0VarE, 0);
            boolean z18 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            m.a aVar6 = m.f135153a;
            if (z18) {
                final int i16 = 0;
                objQ = new e23.a() { // from class: oa0.g
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                lVar.invoke(aVar.f131054b);
                                break;
                            default:
                                lVar.invoke(aVar.f131054b);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ);
            } else {
                aVar6.getClass();
                if (objQ == m.a.f135155b) {
                    final int i17 = 0;
                    objQ = new e23.a() { // from class: oa0.g
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i17) {
                                case 0:
                                    lVar.invoke(aVar.f131054b);
                                    break;
                                default:
                                    lVar.invoke(aVar.f131054b);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarD = w.d(rVarE, false, null, null, (e23.a) objQ, 15);
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            h4.r rVarY = c2.l.y(rVarD, eVar2.f97920e);
            h4.g.b bVar3 = h4.d.a.f81534l;
            c2.j.C0343j c0343j = c2.j.f22692b;
            s2 s2VarA = q2.a(c0343j, bVar3, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = k.c(rVarY, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            int i18 = aVar.f131053a;
            Parcelable.Creator<c22.i> creator = c22.i.CREATOR;
            String strQ = gl1.y.Q(o0VarE, i18);
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0Var = j92.f.f97931h;
            mh.c(strQ, u2Var.a(aVar4, 1.0f, true), com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, 0, 0, 131064);
            if (z16) {
                o0VarE.C(-2048509416);
                s62.a.f157643a.getClass();
                i7.b(e1.a(t62.b.f162798a), null, null, hb.a.s(o0VarE), o0VarE, 48, 4);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-2048310489);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            h4.r rVarF3 = x2.f(aVar4, 1.0f);
            long jF = d92.b.a(o0VarE).c().f();
            bVar2.getClass();
            bVar2.getClass();
            h4.r rVarE2 = wz1.i.e(u1.n.e(rVarF3, jF, k2.i.c(0.0f, 0.0f, f15, f15, 3)), z17, new i1(8), o0VarE, 0);
            boolean z19 = (i15 & 112) == 32;
            Object objQ2 = o0VarE.q();
            if (z19) {
                aVar3 = aVar2;
                final int i19 = 1;
                objQ2 = new e23.a() { // from class: oa0.g
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i19) {
                            case 0:
                                lVar.invoke(aVar3.f131054b);
                                break;
                            default:
                                lVar.invoke(aVar3.f131054b);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ2);
            } else {
                aVar6.getClass();
                if (objQ2 == m.a.f135155b) {
                    aVar3 = aVar2;
                    final int i110 = 1;
                    objQ2 = new e23.a() { // from class: oa0.g
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i110) {
                                case 0:
                                    lVar.invoke(aVar3.f131054b);
                                    break;
                                default:
                                    lVar.invoke(aVar3.f131054b);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ2);
                } else {
                    aVar3 = aVar2;
                }
            }
            h4.r rVarD2 = w.d(rVarE2, false, null, null, (e23.a) objQ2, 15);
            bVar2.getClass();
            h4.r rVarY2 = c2.l.y(rVarD2, eVar2.f97920e);
            s2 s2VarA2 = q2.a(c0343j, bVar3, o0VarE, 48);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC3 = k.c(rVarY2, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA2, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
            }
            b4.c(fVar, rVarC3, o0VarE);
            String strQ2 = gl1.y.Q(o0VarE, aVar3.f131053a);
            fVar2.getClass();
            mh.c(strQ2, u2Var.a(aVar4, 1.0f, true), com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, 0, 0, 131064);
            o0VarE = o0VarE;
            if (z17) {
                o0VarE.C(737915151);
                s62.a.f157643a.getClass();
                i7.b(e1.a(t62.b.f162798a), null, null, hb.a.s(o0VarE), o0VarE, 48, 4);
                o0VarE.g0(false);
            } else {
                o0VarE.C(738114078);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new na0.a((Object) aVar, (Object) aVar2, (Object) oVar, (l) lVar, i14, 11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(o oVar, l<? super o, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i14) {
        o0 o0Var;
        f fVar;
        oVar.getClass();
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-1324867580);
        int i15 = i14 | (o0VarE.k(oVar.ordinal()) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024);
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(oVar);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                int i17 = b.f131073a[((o) p1Var.getF182175a()).ordinal()];
                if (i17 == 1 || i17 == 2) {
                    fVar = f.f131056e;
                } else {
                    fVar = (i17 == 3 || i17 == 4) ? f.f131057f : f.f131056e;
                }
                objQ2 = p0.n(fVar);
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            o oVar2 = (o) p1Var.getF182175a();
            boolean z14 = (i15 & 112) == 32;
            Object objQ3 = o0VarE.q();
            if (z14 || objQ3 == c2565a) {
                objQ3 = new a(lVar, p1Var, null);
                o0VarE.K(objQ3);
            }
            l0.e((p) objQ3, oVar2, o0VarE);
            String strQ = gl1.y.Q(o0VarE, R.string.wear_location_bic_title);
            s62.a.f157643a.getClass();
            t62.b.f162798a.getClass();
            o0Var = o0VarE;
            da0.p.b("device_customization_wear_location_screen", strQ, q.a(l2.f175943a), gl1.y.Q(o0VarE, R.string.msg_where_to_wear_device_hint_message), null, gl1.y.Q(o0VarE, R.string.lbl_next), aVar, false, null, null, false, null, null, false, false, aVar2, null, null, null, null, null, z3.f.c(477518596, new cb0.a(p1Var2, p1Var, i16), o0VarE), o0Var, ((i15 << 12) & 3670016) | 6, (i15 << 6) & 458752, 384, 4161424);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(oVar, lVar, aVar, aVar2, i14, 0);
        }
    }
}
