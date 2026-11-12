package in1;

import c2.x2;
import c2.y;
import c2.z;
import cn1.t;
import com.garmin.android.apps.connectmobile.R;
import f72.kb;
import f72.nb;
import g02.q0;
import h5.e0;
import i3.e9;
import i3.mc;
import km1.v;
import o53.b0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
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

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.detail.components.SleepNoDataKt$SleepNoData$1$1$1", f = "SleepNoData.kt", l = {57}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f94513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f94514b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc mcVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f94514b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f94514b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f94513a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f94513a = 1;
                if (this.f94514b.b(this) == aVar) {
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
    @v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.detail.components.SleepNoDataKt$SleepNoData$2$1$1$1", f = "SleepNoData.kt", l = {78}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f94515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f94516b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(mc mcVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f94516b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f94516b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f94515a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f94515a = 1;
                if (this.f94516b.d(this) == aVar) {
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

    /* JADX WARN: Code duplicated, block: B:53:0x011f  */
    /* JADX WARN: Code duplicated, block: B:62:0x013f  */
    public static final void a(boolean z14, e23.a aVar, e23.a aVar2, p3.m mVar, int i14) {
        int i15;
        u4.d dVarA;
        o0 o0VarE = mVar.E(781797529);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar2) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar3 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar3, o0VarE);
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            c2.l.f(x2.h(aVar3, j92.b.f97899b.f97920e), o0VarE);
            h4.r rVarX = x2.x(aVar3, h4.d.a.f81533k, 2);
            s62.a aVar5 = s62.a.f157643a;
            if (z14) {
                aVar5.getClass();
                dVarA = nb.a(t62.c.f162799a);
            } else {
                aVar5.getClass();
                dVarA = kb.a(t62.c.f162799a);
            }
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_no_sleep_data);
            String strQ2 = gl1.y.Q(o0VarE, R.string.msg_sleep_data_recording);
            String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_add_manual_sleep);
            String strQ4 = gl1.y.Q(o0VarE, R.string.common_learn_more);
            boolean z15 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            p3.m.a aVar6 = p3.m.f135153a;
            if (z15) {
                objQ = new ii0.h(aVar, 16);
                o0VarE.K(objQ);
            } else {
                aVar6.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ii0.h(aVar, 16);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar7 = (e23.a) objQ;
            boolean z16 = (i15 & 896) == 256;
            Object objQ2 = o0VarE.q();
            if (z16) {
                objQ2 = new ii0.h(aVar2, 17);
                o0VarE.K(objQ2);
            } else {
                aVar6.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new ii0.h(aVar2, 17);
                    o0VarE.K(objQ2);
                }
            }
            b82.n.d(dVarA, strQ, strQ2, rVarX, strQ3, aVar7, strQ4, (e23.a) objQ2, o0VarE, 3072, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h62.h(z14, aVar, aVar2, i14, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [int] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v3, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r7v8, types: [p3.m, p3.o0] */
    public static final void b(v vVar, DateTime dateTime, sm1.s sVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        ?? r14;
        p1 p1Var;
        p1 p1Var2;
        Object obj;
        ?? r15;
        ?? r16;
        sVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-2000895601);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(vVar) : o0VarE.r(vVar) ? 4 : 2) | i14;
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
            i15 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            Object obj2 = p3.m.a.f135155b;
            if (objQ == obj2) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0 b0Var = (b0) objQ;
            mc mcVarF = e9.f(true, null, o0VarE, 6, 2);
            Object objQ2 = o0VarE.q();
            if (objQ2 == obj2) {
                objQ2 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var3 = (p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == obj2) {
                objQ3 = p0.n(null);
                o0VarE.K(objQ3);
            }
            p1 p1Var4 = (p1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == obj2) {
                sn1.b.f160414a.getClass();
                objQ4 = Boolean.valueOf(sn1.b.g());
                o0VarE.K(objQ4);
            }
            boolean zBooleanValue = ((Boolean) objQ4).booleanValue();
            boolean zR = o0VarE.r(b0Var) | o0VarE.B(mcVarF);
            Object objQ5 = o0VarE.q();
            if (zR || objQ5 == obj2) {
                objQ5 = new t(b0Var, mcVarF, 23);
                o0VarE.K(objQ5);
            }
            a(zBooleanValue, (e23.a) objQ5, aVar, o0VarE, ((i15 >> 3) & 896) | 6);
            if (mcVarF.e()) {
                o0VarE.C(1170975738);
                bv.d dVar = (bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null);
                v vVar2 = vVar == null ? new v(0L, 0L, null, 0, 0, false, null, 0L, 0L, 0L, 0L, null, null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 8191, null) : vVar;
                boolean z14 = !g22.k.g(dateTime.toLocalDate(), LocalDate.now());
                v vVarB = v.b(vVar2, dVar.getUserProfilePk(), dateTime.toString("yyyy-MM-dd"), 0, 0L, 0L, null, -7, 8191);
                boolean zR2 = o0VarE.r(sVar) | o0VarE.r(b0Var) | o0VarE.B(mcVarF) | o0VarE.r(dateTime);
                Object objQ6 = o0VarE.q();
                if (zR2 || objQ6 == obj2) {
                    p1Var = p1Var3;
                    p1Var2 = p1Var4;
                    aa2.p pVar = new aa2.p(sVar, b0Var, p1Var2, dateTime, mcVarF, p1Var, 12);
                    o0VarE.K(pVar);
                    objQ6 = pVar;
                } else {
                    p1Var = p1Var3;
                    p1Var2 = p1Var4;
                }
                obj = obj2;
                r15 = 0;
                in1.b.a(false, z14, vVarB, b0Var, mcVarF, null, (e23.l) objQ6, o0VarE, (v.P0 << 6) | 6, 32);
                o0 o0Var = o0VarE;
                o0Var.g0(false);
                r16 = o0Var;
            } else {
                p1Var = p1Var3;
                p1Var2 = p1Var4;
                o0 o0Var2 = o0VarE;
                obj = obj2;
                r15 = 0;
                o0Var2.C(1172076083);
                o0Var2.g0(false);
                r16 = o0Var2;
            }
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                r16.C(1172110307);
                v vVar3 = (v) p1Var2.getF182175a();
                ?? sleepTimeSeconds = vVar3 != null ? vVar3.getSleepTimeSeconds() : r15;
                v vVar4 = (v) p1Var2.getF182175a();
                String userNote = vVar4 != null ? vVar4.getUserNote() : null;
                boolean zR3 = r16.r(sVar);
                Object objQ7 = r16.q();
                if (zR3 || objQ7 == obj) {
                    objQ7 = new hy.h(22, sVar, p1Var2);
                    r16.K(objQ7);
                }
                e.a(userNote, (e23.l) objQ7, r16, sleepTimeSeconds, r15);
                r16.g0(r15);
                r14 = r16;
            } else {
                r16.C(1172340947);
                r16.g0(r15);
                r14 = r16;
            }
        } else {
            o0 o0Var3 = o0VarE;
            o0Var3.e();
            r14 = o0Var3;
        }
        p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q0(vVar, dateTime, sVar, aVar, i14, 12);
        }
    }
}
