package e52;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.j;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import cq.t;
import e23.l;
import e23.p;
import i3.mh;
import java.text.NumberFormat;
import l72.j0;
import l72.n0;
import o13.r;
import o4.m1;
import o53.b0;
import o53.f0;
import org.joda.time.DateTime;
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
import p3.x3;
import p5.v;
import s1.e0;
import s5.x0;
import tn.k;
import u62.o5;
import v13.i;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.wheelchair.presentation.details.PushesDetailsScreenKt$PushesDetailsScreen$1$1", f = "PushesDetailsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f63086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f63087b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, p1<Boolean> p1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f63086a = hVar;
            this.f63087b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f63086a, this.f63087b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f63087b.setValue(Boolean.valueOf(this.f63086a.a() != null));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x00f2  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(z42.g gVar, DateTime dateTime, tf0.i iVar, boolean z14, e23.a<Unit> aVar, l<? super Boolean, Unit> lVar, l<? super DateTime, Unit> lVar2, l<? super Boolean, Unit> lVar3, m mVar, int i14) {
        int i15;
        m.a.C2565a c2565a;
        boolean z15;
        int i16;
        u4.d dVarA;
        Integer totalPushDistance;
        Integer calories;
        z42.b bVar;
        z42.b bVar2;
        z42.b bVar3;
        Integer pushesGoal;
        z42.b bVar4;
        Integer pushes;
        iVar.getClass();
        aVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        o0 o0VarE = mVar.E(-976077265);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(gVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(dateTime) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(iVar) : o0VarE.r(iVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(lVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(lVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(lVar3) ? 8388608 : 4194304;
        }
        if (o0VarE.n(i15 & 1, (4793491 & i15) != 4793490)) {
            x1 x1Var = n.f135158a;
            Configuration configuration = (Configuration) o0VarE.A(AndroidCompositionLocals_androidKt.f6041a);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean zB = o0VarE.B(configuration);
            Object objQ = o0VarE.q();
            m.a aVar2 = m.f135153a;
            if (zB) {
                objQ = p0.n(Boolean.valueOf(f0.E(configuration)));
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = p0.n(Boolean.valueOf(f0.E(configuration)));
                    o0VarE.K(objQ);
                }
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            aVar2.getClass();
            m.a.C2565a c2565a2 = m.a.f135155b;
            if (objQ2 == c2565a2) {
                objQ2 = p0.n(new d52.e(context));
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            h hVar = new h(context, gVar);
            Context context2 = ((d52.e) p1Var2.getF182175a()).f57568a;
            int i17 = hVar.f63092d;
            String string = context2.getString(R.string.lbl_step_details_percent_of_goal, d52.e.b(i17));
            string.getClass();
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a2) {
                objQ3 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1 p1Var3 = (p1) objQ3;
            x3 x3VarB = s1.f.b(((Boolean) p1Var3.getF182175a()).booleanValue() ? 1.0f : 0.0f, s1.l.d(500, 0, e0.f155563d, 2), "", o0VarE, 3072, 20);
            String strA = hVar.a();
            boolean zR = o0VarE.r(hVar);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == c2565a2) {
                objQ4 = new a(hVar, p1Var3, null);
                o0VarE.K(objQ4);
            }
            l0.e((p) objQ4, strA, o0VarE);
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarE = u1.n.e(x2.d(aVar3, 1.0f), k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            h4.d.f81522a.getClass();
            h4.g.a aVar4 = h4.d.a.f81537o;
            j.f22691a.getClass();
            z zVarA = y.a(j.f22694d, aVar4, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar5 = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar5 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar5);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(-1322113917);
                h4.r rVarQ = x2.q(aVar3, 166);
                boolean zR2 = o0VarE.r(gVar);
                Object objQ5 = o0VarE.q();
                if (zR2 || objQ5 == c2565a2) {
                    objQ5 = new b(0, gVar, p1Var2);
                    o0VarE.K(objQ5);
                }
                h4.r rVarC2 = v.c((l) objQ5, rVarQ, true);
                Double dValueOf = (gVar == null || (bVar4 = gVar.f202396a) == null || (pushes = bVar4.getPushes()) == null) ? null : Double.valueOf(pushes.intValue());
                Double dValueOf2 = (gVar == null || (bVar3 = gVar.f202396a) == null || (pushesGoal = bVar3.getPushesGoal()) == null) ? null : Double.valueOf(pushesGoal.intValue());
                Object objQ6 = o0VarE.q();
                if (objQ6 == c2565a2) {
                    objQ6 = new a11.m(p1Var2, 18);
                    o0VarE.K(objQ6);
                }
                c02.h.d(rVarC2, dValueOf, dValueOf2, (l) objQ6, o0VarE, 3072);
                d92.b.f58624b.getClass();
                x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
                j92.b bVar6 = d92.b.f58625c;
                bVar6.getClass();
                j92.e eVar = j92.b.f97899b;
                i16 = 16384;
                mh.c(string, c2.l.C(aVar3, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
                String strA2 = hVar.a();
                if (strA2 == null) {
                    o0VarE.C(-1321111781);
                    o0VarE.g0(false);
                    z15 = true;
                    c2565a = c2565a2;
                } else {
                    o0VarE.C(-1321111780);
                    if (hVar.f63091c || i17 >= 100) {
                        s62.a.f157643a.getClass();
                        dVarA = o5.a(t62.a.f162797a);
                    } else {
                        s62.a.f157643a.getClass();
                        dVarA = o5.a(t62.a.f162797a);
                    }
                    j0 j0Var = new j0(strA2, null, dVarA, false, true, 10, null);
                    bVar6.getClass();
                    h4.r rVarA = l4.k.a(c2.l.C(aVar3, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), ((Number) x3VarB.getF182175a()).floatValue());
                    boolean zB2 = o0VarE.B(strA2);
                    Object objQ7 = o0VarE.q();
                    if (zB2 || objQ7 == c2565a2) {
                        objQ7 = new t(strA2, 17);
                        o0VarE.K(objQ7);
                    }
                    h4.r rVarB = v.b(rVarA, (l) objQ7);
                    Object objQ8 = o0VarE.q();
                    if (objQ8 == c2565a2) {
                        objQ8 = new dv0.n(26);
                        o0VarE.K(objQ8);
                    }
                    c2565a = c2565a2;
                    z15 = true;
                    n0.a(rVarB, j0Var, 0L, (l) objQ8, o0VarE, 3072, 4);
                    o0VarE = o0VarE;
                    Unit unit = Unit.INSTANCE;
                    o0VarE.g0(false);
                }
                if (gVar == null || (bVar2 = gVar.f202396a) == null) {
                    o0VarE = o0VarE;
                    o0VarE = o0VarE;
                    totalPushDistance = null;
                } else {
                    totalPushDistance = bVar2.getTotalPushDistance();
                }
                if (gVar == null || (bVar = gVar.f202396a) == null) {
                    o0VarE = o0VarE;
                    o0VarE = o0VarE;
                    calories = null;
                } else {
                    o0VarE = o0VarE;
                    calories = bVar.getCalories();
                }
                b(totalPushDistance, calories, (d52.e) p1Var2.getF182175a(), o0VarE, 0);
                o0VarE.g0(false);
            } else {
                c2565a = c2565a2;
                z15 = true;
                i16 = 16384;
                o0VarE.C(-1320213059);
                o0VarE.g0(false);
            }
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            boolean z16 = (57344 & i15) == i16 ? z15 : false;
            Object objQ9 = o0VarE.q();
            if (z16 || objQ9 == c2565a) {
                objQ9 = new c(aVar, 0);
                o0VarE.K(objQ9);
            }
            o0 o0Var = o0VarE;
            g.a(gVar, dateTime, iVar, z14, zBooleanValue, lVar, lVar2, (e23.a) objQ9, lVar3, o0Var, (i15 & 126) | (tf0.i.f164439d << 6) | (i15 & 896) | (i15 & 7168) | (458752 & i15) | (3670016 & i15) | ((i15 << 3) & 234881024));
            o0VarE = o0Var;
            o0VarE.g0(z15);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(gVar, dateTime, iVar, z14, aVar, lVar, lVar2, lVar3, i14);
        }
    }

    public static final void b(Integer num, Integer num2, d52.e eVar, m mVar, int i14) {
        String strF;
        o0 o0VarE = mVar.E(1299935937);
        int i15 = (o0VarE.B(num) ? 4 : 2) | i14 | (o0VarE.B(num2) ? 32 : 16) | (o0VarE.r(eVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            String strA = eVar.a(num);
            String strE = eVar.e(num);
            if (num2 == null) {
                strF = eVar.f();
            } else {
                strF = NumberFormat.getIntegerInstance().format(num2);
                strF.getClass();
            }
            l72.x0 x0Var = l72.x0.f111346a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97920e;
            bVar.getClass();
            float f15 = eVar2.f97920e;
            bVar.getClass();
            float f16 = eVar2.f97918c;
            bVar.getClass();
            x0Var.e(c2.l.B(aVar, f14, eVar2.f97921f, f15, f16), z3.f.c(958540424, new e(strA, strE, eVar, strF), o0VarE), o0VarE, (l72.x0.f111348c << 6) | 48, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e11.f0(num, num2, eVar, i14, 1);
        }
    }
}
