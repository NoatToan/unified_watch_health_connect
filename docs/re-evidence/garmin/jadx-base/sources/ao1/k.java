package ao1;

import c2.l;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import gl1.y;
import h5.e0;
import i3.e5;
import i3.mh;
import java.util.Locale;
import o13.r;
import o4.m1;
import o53.b0;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.j0;
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
import p3.x3;
import r53.u1;
import s5.x0;
import u1.w;
import v62.l9;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.smartscale.ui.InviteFriendsScreenKt$InviteFriendsList$1$1", f = "InviteFriendsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3<Boolean> f11572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f11573b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x3<Boolean> x3Var, p1<Boolean> p1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f11572a = x3Var;
            this.f11573b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f11572a, this.f11573b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (!this.f11572a.getF182175a().booleanValue()) {
                this.f11573b.setValue(Boolean.FALSE);
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-822002583);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97922g;
            bVar.getClass();
            h4.r rVarC = l.C(aVar, 0.0f, f14, 0.0f, eVar.f97917b, 5);
            bVar.getClass();
            h4.r rVarA = l.A(rVarC, eVar.f97920e, 0.0f, 2);
            String upperCase = y.Q(o0VarE, R.string.lbl_child_accounts).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            d92.b.f58624b.getClass();
            o0Var = o0VarE;
            mh.c(upperCase, rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0.a(j92.f.f97934k, 0L, f0.B(13), null, null, 0L, null, null, 0, f0.B(18), null, null, 16646141), o0VarE), o0Var, 0, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a90.m(i14, 21);
        }
    }

    public static final void b(e23.a<Unit> aVar, m mVar, int i14) {
        e23.a<Unit> aVar2;
        aVar.getClass();
        o0 o0VarE = mVar.E(1824920298);
        int i15 = 4;
        int i16 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h4.r.a aVar3 = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarC = l.C(aVar3, 0.0f, j92.b.f97899b.f97922g, 0.0f, 0.0f, 13);
            s62.a.f157643a.getClass();
            aVar2 = aVar;
            b82.n.d(l9.a(t62.b.f162798a), y.Q(o0VarE, R.string.lbl_no_friends_invite), y.Q(o0VarE, R.string.msg_review_suggestions), rVarC, y.Q(o0VarE, R.string.lbl_review_suggestions), aVar2, null, null, o0VarE, (i16 << 15) & 458752, 192);
        } else {
            aVar2 = aVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a51.g(aVar2, i14, i15);
        }
    }

    public static final void c(m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(154956913);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = n.f135158a;
            String upperCase = y.Q(o0VarE, R.string.title_invite_your_friends).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarZ = l.z(rVarF, f14, eVar.f97917b);
            d92.b.f58624b.getClass();
            o0Var = o0VarE;
            mh.c(upperCase, rVarZ, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0.a(j92.f.f97934k, 0L, f0.B(13), null, null, 0L, null, null, 0, f0.B(18), null, null, 16646141), o0VarE), o0Var, 0, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a90.m(i14, 20);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00d1  */
    public static final void d(int i14, e23.a aVar, String str, m mVar) {
        o0 o0Var;
        aVar.getClass();
        o0 o0VarE = mVar.E(-1126344987);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarF = x2.f(aVar2, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            String strQ = y.Q(o0VarE, R.string.title_invite_by_email);
            h4.r rVarE = u1.n.e(x2.f(aVar2, 1.0f), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new defpackage.c(aVar, 17);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new defpackage.c(aVar, 17);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarD = w.d(rVarE, false, null, null, (e23.a) objQ, 15);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarY = l.y(rVarD, eVar.f97920e);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(strQ, rVarY, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97931h, o0VarE, 0, 0, 131068);
            String strP = y.P(R.string.msg_invite_friends_by_email, new Object[]{str}, o0VarE);
            h4.r rVarF2 = x2.f(aVar2, 1.0f);
            bVar2.getClass();
            float f14 = eVar.f97920e;
            bVar2.getClass();
            h4.r rVarZ = l.z(rVarF2, f14, eVar.f97917b);
            fVar.getClass();
            mh.c(strP, rVarZ, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0.a(j92.f.f97933j, 0L, f0.B(13), null, null, 0L, null, null, 0, f0.B(18), null, null, 16646141), o0VarE), o0VarE, 0, 0, 131068);
            o0Var = o0VarE;
            bVar2.getClass();
            e5.t(aVar2, eVar.f97918c, o0Var, true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(aVar, str, i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(wn1.n nVar, String str, e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i14) {
        nVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-417355082);
        int i15 = i14 | (o0VarE.r(nVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024);
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            u1 u1Var = nVar.f186276m;
            j0 j0Var = j0.f134944a;
            p1 p1VarB = s9.c.b(u1Var, j0Var, o0VarE, 48);
            p1 p1VarB2 = s9.c.b(nVar.f186275l, j0Var, o0VarE, 48);
            p1 p1VarC = s9.c.c(nVar.f186272i, o0VarE);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Boolean bool = (Boolean) p1VarC.getF182175a();
            bool.getClass();
            boolean zB = o0VarE.B(p1VarC);
            Object objQ2 = o0VarE.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = new a(p1VarC, p1Var, null);
                o0VarE.K(objQ2);
            }
            l0.e((p) objQ2, bool, o0VarE);
            if (((Boolean) p1VarC.getF182175a()).booleanValue()) {
                o0VarE.C(507535212);
                o0VarE.g0(false);
            } else {
                o0VarE.C(505793880);
                boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                boolean zR = o0VarE.r(nVar);
                Object objQ3 = o0VarE.q();
                if (zR || objQ3 == c2565a) {
                    objQ3 = new i(i16, nVar, p1Var);
                    o0VarE.K(objQ3);
                }
                m3.l.b(zBooleanValue, (e23.a) objQ3, null, null, null, null, z3.f.c(-1933281951, new ak0.h(aVar, str, p1VarB2, nVar, p1VarB, aVar2, 1), o0VarE), o0VarE, 1572864, 60);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(nVar, str, aVar, aVar2, i14);
        }
    }

    public static final void f(wn1.n nVar, String str, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, m mVar, int i14) {
        o0 o0Var;
        nVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(434675036);
        int i15 = i14 | (o0VarE.r(nVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024) | (o0VarE.r(aVar3) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            o0Var = o0VarE;
            z02.b.a(false, null, null, null, false, z3.f.c(-173933166, new a42.c(4, aVar, s9.c.c(nVar.f186272i, o0VarE), nVar, str, aVar2, aVar3), o0VarE), o0Var, 196608, 31);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.n(nVar, str, aVar, aVar2, aVar3, i14, 3);
        }
    }
}
