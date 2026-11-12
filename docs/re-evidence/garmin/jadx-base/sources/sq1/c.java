package sq1;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.j;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.l;
import e23.p;
import f72.rb;
import gl1.y;
import i3.mh;
import java.text.NumberFormat;
import jq1.g;
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
import pq1.f;
import rx1.u;
import s1.e0;
import s5.x0;
import s70.r0;
import sk0.r1;
import tn.k;
import v.h;
import v13.i;
import v62.e9;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.steps.presentation.details.StepsDetailsScreenKt$StepsDetailsScreen$1$1", f = "StepsDetailsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f160531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f160532b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, p1<Boolean> p1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f160531a = fVar;
            this.f160532b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f160531a, this.f160532b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f160532b.setValue(Boolean.valueOf(this.f160531a.a() != null));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x00f6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r6v1, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r6v9, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r9v4, types: [p3.m] */
    public static final void a(g gVar, DateTime dateTime, boolean z14, l<? super Boolean, Unit> lVar, tf0.i iVar, l<? super Boolean, Unit> lVar2, l<? super DateTime, Unit> lVar3, l<? super Boolean, Unit> lVar4, m mVar, int i14) {
        int i15;
        ?? r14;
        boolean z15;
        ?? r15;
        ?? r16;
        u4.d dVarA;
        ?? r17;
        Integer num;
        Integer numValueOf;
        jq1.b bVar;
        Double d14;
        jq1.b bVar2;
        jq1.b bVar3;
        Integer num2;
        jq1.b bVar4;
        Integer num3;
        lVar.getClass();
        iVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        lVar4.getClass();
        o0 o0VarE = mVar.E(1162213446);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(gVar) : o0VarE.r(gVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(dateTime) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= (32768 & i14) == 0 ? o0VarE.B(iVar) : o0VarE.r(iVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(lVar2) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(lVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(lVar4) ? 8388608 : 4194304;
        }
        if (o0VarE.n(i15 & 1, (4793491 & i15) != 4793490)) {
            x1 x1Var = n.f135158a;
            Configuration configuration = (Configuration) o0VarE.A(AndroidCompositionLocals_androidKt.f6041a);
            boolean zB = o0VarE.B(configuration);
            Object objQ = o0VarE.q();
            m.a aVar = m.f135153a;
            if (zB) {
                objQ = p0.n(Boolean.valueOf(f0.E(configuration)));
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = p0.n(Boolean.valueOf(f0.E(configuration)));
                    o0VarE.K(objQ);
                }
            }
            p1 p1Var = (p1) objQ;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ2 = o0VarE.q();
            aVar.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = p0.n(new pq1.d(context));
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            f fVar = new f(context, gVar);
            ((pq1.d) p1Var2.getF182175a()).getClass();
            int i16 = fVar.f139578g;
            String strP = y.P(R.string.lbl_step_details_percent_of_goal, new Object[]{pq1.d.b(i16)}, o0VarE);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1 p1Var3 = (p1) objQ3;
            int i17 = i15;
            x3 x3VarB = s1.f.b(((Boolean) p1Var3.getF182175a()).booleanValue() ? 1.0f : 0.0f, s1.l.d(500, 0, e0.f155563d, 2), "", o0VarE, 3072, 20);
            String strA = fVar.a();
            boolean zR = o0VarE.r(fVar);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == c2565a) {
                objQ4 = new a(fVar, p1Var3, null);
                o0VarE.K(objQ4);
            }
            l0.e((p) objQ4, strA, o0VarE);
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarE = u1.n.e(x2.d(aVar2, 1.0f), k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81537o;
            j.f22691a.getClass();
            z zVarA = c2.y.a(j.f22694d, aVar3, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
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
            h5.g.a.b bVar5 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar5);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(552665761);
                h4.r rVarB = b0Var.b(x2.q(aVar2, 166), aVar3);
                boolean z16 = (i17 & 14) == 4 || ((i17 & 8) != 0 && o0VarE.r(gVar));
                Object objQ5 = o0VarE.q();
                if (z16 || objQ5 == c2565a) {
                    objQ5 = new rk0.g(29, gVar, p1Var2);
                    o0VarE.K(objQ5);
                }
                h4.r rVarC2 = v.c((l) objQ5, rVarB, false);
                Double dValueOf = (gVar == null || (bVar4 = gVar.f100009a) == null || (num3 = bVar4.f99981c) == null) ? null : Double.valueOf(num3.intValue());
                Double dValueOf2 = (gVar == null || (bVar3 = gVar.f100009a) == null || (num2 = bVar3.f99984f) == null) ? null : Double.valueOf(num2.intValue());
                Object objQ6 = o0VarE.q();
                if (objQ6 == c2565a) {
                    objQ6 = new sk0.n(p1Var2, 6);
                    o0VarE.K(objQ6);
                }
                c02.h.d(rVarC2, dValueOf, dValueOf2, (l) objQ6, o0VarE, 3072);
                o0 o0Var = o0VarE;
                d92.b.f58624b.getClass();
                x0 x0VarF = d92.c.f(j92.f.f97933j, o0Var);
                j92.b bVar6 = d92.b.f58625c;
                bVar6.getClass();
                j92.e eVar = j92.b.f97899b;
                mh.c(strP, c2.l.C(aVar2, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0Var, 0, 0, 131068);
                String strA2 = fVar.a();
                if (strA2 == null) {
                    o0Var.C(553704694);
                    r16 = 0;
                    o0Var.g0(false);
                    z15 = true;
                } else {
                    r16 = 0;
                    o0Var.C(553704695);
                    if (fVar.f139574c) {
                        s62.a.f157643a.getClass();
                        dVarA = e9.a(t62.b.f162798a);
                    } else if (fVar.f139577f || i16 >= 100) {
                        s62.a.f157643a.getClass();
                        dVarA = rb.a(t62.c.f162799a);
                    } else {
                        s62.a.f157643a.getClass();
                        dVarA = rb.a(t62.c.f162799a);
                    }
                    j0 j0Var = new j0(strA2, null, dVarA, false, false, 26, null);
                    bVar6.getClass();
                    h4.r rVarA = l4.k.a(c2.l.C(aVar2, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), ((Number) x3VarB.getF182175a()).floatValue());
                    boolean zB2 = o0Var.B(strA2);
                    Object objQ7 = o0Var.q();
                    if (zB2 || objQ7 == c2565a) {
                        objQ7 = new r0(strA2, 9);
                        o0Var.K(objQ7);
                    }
                    h4.r rVarB2 = v.b(rVarA, (l) objQ7);
                    Object objQ8 = o0Var.q();
                    if (objQ8 == c2565a) {
                        z15 = true;
                        objQ8 = new r1(1);
                        o0Var.K(objQ8);
                    } else {
                        z15 = true;
                    }
                    n0.a(rVarB2, j0Var, 0L, (l) objQ8, o0Var, 3072, 4);
                    o0 o0Var2 = o0Var;
                    Unit unit = Unit.INSTANCE;
                    o0Var2.g0(false);
                    r17 = o0Var2;
                }
                if (gVar == null || (bVar2 = gVar.f100009a) == null) {
                    r17 = o0Var;
                    r17 = o0Var;
                    num = null;
                } else {
                    num = bVar2.f99983e;
                }
                if (gVar == null || (bVar = gVar.f100009a) == null || (d14 = bVar.f99982d) == null) {
                    r17 = o0Var;
                    r17 = o0Var;
                    r17 = o0Var;
                    numValueOf = null;
                } else {
                    r17 = o0Var;
                    numValueOf = Integer.valueOf((int) d14.doubleValue());
                }
                b(num, numValueOf, (pq1.d) p1Var2.getF182175a(), r17, r16);
                r17.g0(r16);
                r15 = r17;
            } else {
                z15 = true;
                o0VarE.C(554515686);
                o0VarE.g0(false);
                r15 = o0VarE;
            }
            int i18 = i17 << 3;
            ?? r18 = r15;
            d.a(dateTime, gVar, iVar, z14, ((Boolean) p1Var.getF182175a()).booleanValue(), lVar2, lVar3, lVar, lVar4, r18, ((i17 >> 3) & 14) | (g.f100008e << 3) | (i18 & 112) | (tf0.i.f164439d << 6) | ((i17 >> 6) & 896) | (i18 & 7168) | (i17 & 458752) | (i17 & 3670016) | ((i17 << 12) & 29360128) | (i18 & 234881024));
            ?? r19 = r18;
            r19.g0(z15);
            r14 = r19;
        } else {
            o0VarE.e();
            r14 = o0VarE;
        }
        p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e52.d(gVar, dateTime, z14, lVar, iVar, lVar2, lVar3, lVar4, i14);
        }
    }

    public static final void b(Integer num, Integer num2, pq1.d dVar, m mVar, int i14) {
        o0 o0Var;
        String strF;
        o0 o0VarE = mVar.E(371260307);
        int i15 = i14 | (o0VarE.B(num) ? 4 : 2) | (o0VarE.B(num2) ? 32 : 16) | (o0VarE.r(dVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            String strA = dVar.a(num, dVar.f());
            String strD = dVar.d(num);
            if (num2 != null) {
                strF = NumberFormat.getIntegerInstance().format(num2.intValue());
                strF.getClass();
            } else {
                strF = dVar.f();
            }
            String str = strF;
            l72.x0 x0Var = l72.x0.f111346a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97920e;
            bVar.getClass();
            bVar.getClass();
            bVar.getClass();
            o0Var = o0VarE;
            x0Var.e(c2.l.B(aVar, f14, eVar.f97921f, f15, f15), z3.f.c(987982426, new mw0.h(22, strA, strD, dVar, str), o0VarE), o0Var, (l72.x0.f111348c << 6) | 48, 0);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u(num, num2, dVar, i14, 16);
        }
    }
}
