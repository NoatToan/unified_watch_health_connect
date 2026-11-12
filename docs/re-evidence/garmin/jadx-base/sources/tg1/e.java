package tg1;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import ho.d0;
import i3.af;
import i3.cf;
import i3.df;
import i3.mh;
import kotlin.t1;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;
import s70.a0;
import u1.k1;
import xd2.m0;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.backup.ui.composable.AllBackupsListKt$SwipeToDeleteBackupListItem$2$1$1", f = "AllBackupsList.kt", l = {165}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f164510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ cf f164511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f164512c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(cf cfVar, p1<Boolean> p1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f164511b = cfVar;
            this.f164512c = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f164511b, this.f164512c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            s1.k kVar;
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f164510a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f164512c.setValue(Boolean.FALSE);
                this.f164510a = 1;
                p008y1.r<df> rVar = this.f164511b.f87782a;
                df dfVar = df.Settled;
                m0 m0Var = p008y1.e.f193170a;
                if (rVar.c()) {
                    kVar = rVar.f193582d;
                    if (kVar == null) {
                        p005kotlin.jvm.internal.s.m("snapAnimationSpec");
                        throw null;
                    }
                } else {
                    p008y1.b.f193089a.getClass();
                    kVar = p008y1.b.f193090b;
                }
                Object objA = rVar.a(dfVar, k1.Default, new p008y1.f(rVar, kVar, null), this);
                if (objA != obj2) {
                    objA = Unit.INSTANCE;
                }
                if (objA != obj2) {
                    objA = Unit.INSTANCE;
                }
                if (objA == obj2) {
                    return obj2;
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

    public static final void a(sg1.d dVar, e23.a aVar, pg1.d dVar2, e23.l lVar, pg1.d dVar3, p3.m mVar, int i14) {
        int i15;
        dVar.getClass();
        aVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-1121181289);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(dVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(dVar2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(dVar3) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            z02.d.a(false, z3.f.c(-622144100, new a0(aVar, 9), o0VarE), null, null, null, z3.f.c(1400934304, new tg1.a(dVar, dVar3, dVar2, lVar, (b0) objQ, 1), o0VarE), o0VarE, 196656, 29);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ka0.e(dVar, aVar, dVar2, lVar, dVar3, i14);
        }
    }

    public static final void b(p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-636387359);
        p3.c<?> cVar = o0VarE.f135177b;
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = x2.f(x2.c(aVar, 1.0f), 1.0f);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            h4.r rVarC2 = u2.f22900a.c(aVar, h4.d.a.f81534l);
            z zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarC2, o0VarE);
            if (cVar == null) {
                p0.l();
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
            b4.c(fVar, rVarC3, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_device_backups_no_backups);
            d92.b.f58623a.getClass();
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97930g, o0VarE);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            h4.r rVarY = c2.l.y(aVar, eVar2.f97918c);
            h4.g.a aVar3 = h4.d.a.f81537o;
            h4.r rVarB = b0Var.b(rVarY, aVar3);
            d6.h.f57752b.getClass();
            int i15 = d6.h.f57755e;
            mh.c(strQ, rVarB, 0L, null, 0L, null, 0L, d6.h.a(i15), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 130044);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_manage_device_backups_no_backups_caption);
            fVar2.getClass();
            x0 x0VarB2 = d92.c.b(j92.f.f97931h, o0VarE);
            bVar2.getClass();
            mh.c(strQ2, b0Var.b(c2.l.y(aVar, eVar2.f97918c), aVar3), 0L, null, 0L, null, 0L, d6.h.a(i15), 0L, 0, false, 0, 0, null, x0VarB2, o0VarE, 0, 0, 130044);
            o0Var = o0VarE;
            o0Var.g0(true);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new td0.a(i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(sg1.c cVar, e23.l<? super Long, Unit> lVar, e23.l<? super Long, Unit> lVar2, b0 b0Var, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(348869932);
        int i15 = i14 | (o0VarE.B(cVar) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(lVar2) ? 256 : 128) | (o0VarE.r(b0Var) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            df dfVar = df.Settled;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new sk0.n(p1Var, 8);
                o0VarE.K(objQ2);
            }
            e23.l lVar3 = (e23.l) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new t52.c(21);
                o0VarE.K(objQ3);
            }
            e23.l lVar4 = (e23.l) objQ3;
            float f14 = af.f87490a;
            g6.c cVar2 = (g6.c) o0VarE.A(t1.f91490h);
            Object[] objArr = new Object[0];
            cf.f87780c.getClass();
            ho2.o oVar = new ho2.o(20);
            gw1.d dVar = new gw1.d(cVar2, 14, lVar3, lVar4);
            d4.l lVar5 = d4.m.f57455a;
            d4.l lVar6 = new d4.l(oVar, dVar);
            boolean zB = o0VarE.B(cVar2);
            Object objQ4 = o0VarE.q();
            if (zB || objQ4 == c2565a) {
                objQ4 = new d0(dfVar, cVar2, lVar3, lVar4, 5);
                o0VarE.K(objQ4);
            }
            cf cfVar = (cf) d4.a.c(objArr, lVar6, (e23.a) objQ4, o0VarE, 0);
            g.f164513a.getClass();
            o0Var = o0VarE;
            int i16 = 1;
            af.a(cfVar, g.f164515c, null, false, true, false, null, z3.f.c(2034329424, new ry0.g(20, cVar, lVar2), o0VarE), o0Var, cf.f87781d | 12610608);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0Var.C(-634650110);
                String str = cVar.f159209g;
                long j8 = cVar.f159206d;
                boolean zR = o0Var.r(b0Var) | o0Var.r(cfVar);
                Object objQ5 = o0Var.q();
                if (zR || objQ5 == c2565a) {
                    objQ5 = new l72.i2(b0Var, cfVar, p1Var, i16);
                    o0Var.K(objQ5);
                }
                m.a(str, j8, (e23.a) objQ5, lVar, o0Var, (i15 << 6) & 7168);
                o0Var.g0(false);
            } else {
                o0Var.C(-634261866);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sk0.k1(cVar, lVar, lVar2, b0Var, i14, 10);
        }
    }
}
