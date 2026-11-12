package an0;

import a03.t0;
import a42.z;
import c2.q;
import c2.u;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.p;
import f5.z0;
import gl1.y;
import h4.k;
import h5.e0;
import h5.g;
import i3.mh;
import j92.f;
import kotlin.m3;
import o13.r;
import o4.t1;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import r53.c2;
import r53.s;
import s5.x0;
import u2.h;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.ui.GroupInvitationSearchScreenKt$GroupInvitationSearchScreen$1$1", f = "GroupInvitationSearchScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m4.b0 f4462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m3 f4463b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m4.b0 b0Var, m3 m3Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f4462a = b0Var;
            this.f4463b = m3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f4462a, this.f4463b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            m4.b0.a(this.f4462a);
            m3 m3Var = this.f4463b;
            if (m3Var != null) {
                m3Var.show();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.ui.GroupInvitationSearchScreenKt$GroupInvitationSearchScreen$2$1", f = "GroupInvitationSearchScreen.kt", l = {65}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f4465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l<String, Unit> f4466c;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.group.ui.GroupInvitationSearchScreenKt$GroupInvitationSearchScreen$2$1$2", f = "GroupInvitationSearchScreen.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<String, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f4467a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l<String, Unit> f4468b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(l<? super String, Unit> lVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f4468b = lVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f4468b, dVar);
                aVar.f4467a = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(String str, t13.d<? super Unit> dVar) {
                return ((a) create(str, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                String str = (String) this.f4467a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                this.f4468b.invoke(str);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(h hVar, l<? super String, Unit> lVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f4465b = hVar;
            this.f4466c = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f4465b, this.f4466c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f4464a;
            if (i14 == 0) {
                r.b(obj);
                c2 c2VarS = p0.s(new an0.b(this.f4465b, 1));
                a aVar2 = new a(this.f4466c, null);
                this.f4464a = 1;
                if (s.k(c2VarS, aVar2, this) == aVar) {
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

    public static final void a(h hVar, h4.r rVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(385553130);
        int i15 = (o0VarE.B(hVar) ? 4 : 2) | i14 | (o0VarE.B(rVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = k.c(rVar, o0VarE);
            g.V.getClass();
            e0.a aVar = g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(g.a.f81810g, z0VarD, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            u uVar = u.f22885a;
            if (hVar.b().f167839c.length() == 0) {
                o0VarE.C(-616731001);
                String strQ = y.Q(o0VarE, R.string.lbl_search);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(f.f97931h, vb.h.g(o0VarE), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 0, 131070);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-616555138);
                o0VarE.g0(false);
            }
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            p006l2.r.b(hVar, rVarF, false, d92.c.b(f.f97931h, o0VarE), null, u2.g.b.f167845a, null, new t1(com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE), null), null, null, o0VarE, (i15 & 14) | 100663344, 30428);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t0(hVar, rVar, i14, 9);
        }
    }

    public static final void b(zc.d<km0.m> dVar, l<? super String, Unit> lVar, e23.a<Unit> aVar, l<? super Long, Unit> lVar2, l<? super Long, Unit> lVar3, m mVar, int i14) {
        dVar.getClass();
        lVar.getClass();
        aVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        o0 o0VarE = mVar.E(1466371924);
        int i15 = i14 | (o0VarE.r(dVar) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(lVar2) ? 2048 : 1024) | (o0VarE.r(lVar3) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = kg.f.j(o0VarE);
            }
            m4.b0 b0Var = (m4.b0) objQ;
            m3 m3Var = (m3) o0VarE.A(kotlin.t1.f91499q);
            Unit unit = Unit.INSTANCE;
            boolean zB = o0VarE.B(m3Var);
            Object objQ2 = o0VarE.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = new a(b0Var, m3Var, null);
                o0VarE.K(objQ2);
            }
            l0.e((p) objQ2, unit, o0VarE);
            h hVarC = u2.i.c(o0VarE);
            boolean zB2 = o0VarE.B(hVarC) | ((i15 & 112) == 32);
            Object objQ3 = o0VarE.q();
            if (zB2 || objQ3 == c2565a) {
                objQ3 = new b(hVarC, lVar, null);
                o0VarE.K(objQ3);
            }
            l0.e((p) objQ3, hVarC, o0VarE);
            z02.d.a(false, z3.f.c(1838589679, new a3.e(aVar, 8, hVarC, b0Var), o0VarE), null, null, null, z3.f.c(-2022413973, new a51.l(hVarC, dVar, lVar2, lVar3, 6), o0VarE), o0VarE, 196656, 29);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new z((zc.d) dVar, (l) lVar, (e23.a) aVar, (l) lVar2, (l) lVar3, i14);
        }
    }
}
