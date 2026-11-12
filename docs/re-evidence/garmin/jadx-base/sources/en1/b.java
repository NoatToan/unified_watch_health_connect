package en1;

import c2.j;
import c2.x2;
import c2.y;
import c2.z;
import c22.g0;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import g6.f;
import h2.j0;
import h2.u;
import h4.k;
import h5.g;
import i3.v5;
import m4.q;
import o13.r;
import o53.b0;
import org.joda.time.DateTime;
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
import s1.b2;
import s1.e0;
import s1.l;
import sm1.a0;
import sm1.s;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.detail.SleepDetailsReportsPageKt$SleepDetailsReportsPage$1$1$1$1", f = "SleepDetailsReportsPage.kt", l = {56}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f64726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j0 f64727b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f64728c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j0 j0Var, int i14, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f64727b = j0Var;
            this.f64728c = i14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f64727b, this.f64728c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f64726a;
            if (i14 == 0) {
                r.b(obj);
                b2 b2VarD = l.d(100, 0, e0.f155563d, 2);
                this.f64726a = 1;
                if (j0.g(this.f64727b, this.f64728c, b2VarD, this, 2) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: en1.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.detail.SleepDetailsReportsPageKt$SleepDetailsReportsPage$1$2$1$1", f = "SleepDetailsReportsPage.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C1376b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f64729a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1376b(q qVar, t13.d<? super C1376b> dVar) {
            super(2, dVar);
            this.f64729a = qVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C1376b(this.f64729a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C1376b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f64729a.y(false);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.detail.SleepDetailsReportsPageKt$SleepDetailsReportsPage$1$3$1", f = "SleepDetailsReportsPage.kt", l = {102}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f64730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j0 f64731b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f64732c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(j0 j0Var, int i14, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f64731b = j0Var;
            this.f64732c = i14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f64731b, this.f64732c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f64730a;
            if (i14 == 0) {
                r.b(obj);
                j0 j0Var = this.f64731b;
                int iIntValue = ((Number) j0Var.f80947w.getF182175a()).intValue();
                int i15 = this.f64732c;
                if (iIntValue != i15) {
                    this.f64730a = 1;
                    if (j0.w(j0Var, i15, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(km1.c cVar, DateTime dateTime, s sVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, m mVar, int i14) {
        o0 o0Var;
        sVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(-1106928324);
        int i15 = i14 | ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | (o0VarE.r(dateTime) ? 32 : 16) | (o0VarE.r(sVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192) | (o0VarE.r(aVar3) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = n.f135158a;
            sn1.b.f160414a.getClass();
            if (sn1.b.f()) {
                o0VarE.C(257577846);
                h4.r.a aVar4 = h4.r.S;
                h4.r rVarD = x2.d(aVar4, 1.0f);
                j.f22691a.getClass();
                j.k kVar = j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = k.c(rVarD, o0VarE);
                g.V.getClass();
                h5.e0.a aVar5 = g.a.f81805b;
                if (o0VarE.f135177b == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                b4.c(g.a.f81810g, zVarA, o0VarE);
                b4.c(g.a.f81809f, i2VarA0, o0VarE);
                g.a.b bVar = g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                f.a aVar6 = f.f75994b;
                v5.a(16, 48, 1, tn.k.b(d92.b.f58623a, o0VarE), null, o0VarE);
                int i16 = ((a0) s9.c.c(sVar.f160188h, o0VarE).getF182175a()).f160089e.f64737a;
                Object objQ = o0VarE.q();
                m.f135153a.getClass();
                m.a.C2565a c2565a = m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new e51.c(13);
                    o0VarE.K(objQ);
                }
                h2.b bVarB = h2.o0.b(i16, (e23.a) objQ, o0VarE, 384, 2);
                Object objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = l0.j(t13.h.f161748a, o0VarE);
                    o0VarE.K(objQ2);
                }
                b0 b0Var2 = (b0) objQ2;
                i53.f fVarA = i53.a.a(gl1.y.Q(o0VarE, R.string.lbl_sleep_score), gl1.y.Q(o0VarE, R.string.lbl_sleep_coach));
                boolean zR = o0VarE.r(b0Var2) | o0VarE.B(bVarB) | o0VarE.r(sVar);
                Object objQ3 = o0VarE.q();
                if (zR || objQ3 == c2565a) {
                    objQ3 = new en1.a(b0Var2, sVar, bVarB, 0);
                    o0VarE.K(objQ3);
                }
                g0.a(i16, fVarA, null, false, (e23.l) objQ3, o0VarE, 0, 12);
                u.a(bVarB, x2.d(aVar4, 1.0f), null, null, 0, 0.0f, null, null, false, null, null, null, null, z3.f.c(-1260339378, new aa2.q(cVar, dateTime, sVar, aVar3, aVar, aVar2), o0VarE), o0VarE, 100663344, 24576, 16124);
                o0Var = o0VarE;
                Integer numValueOf = Integer.valueOf(i16);
                boolean zB = o0Var.B(bVarB) | o0Var.k(i16);
                Object objQ4 = o0Var.q();
                if (zB || objQ4 == c2565a) {
                    objQ4 = new c(bVarB, i16, null);
                    o0Var.K(objQ4);
                }
                l0.e((p) objQ4, numValueOf, o0Var);
                o0Var.g0(true);
                o0Var.g0(false);
            } else {
                o0Var = o0VarE;
                o0Var.C(260344069);
                if (sn1.b.g()) {
                    o0Var.C(260400427);
                    kn1.d.a(cVar, dateTime, sVar, aVar3, o0Var, km1.c.B | (i15 & 14) | (i15 & 112) | (i15 & 896) | ((i15 >> 6) & 7168));
                    o0Var.g0(false);
                } else {
                    o0Var.C(260496682);
                    jn1.e.a(cVar, dateTime, sVar, aVar3, o0Var, km1.c.B | (i15 & 14) | (i15 & 112) | (i15 & 896) | ((i15 >> 6) & 7168));
                    o0Var.g0(false);
                }
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a11.g0(cVar, dateTime, sVar, (e23.a) aVar, (e23.a) aVar2, (o13.h) aVar3, i14, 10);
        }
    }
}
