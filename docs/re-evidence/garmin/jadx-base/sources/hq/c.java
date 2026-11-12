package hq;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.g1;
import b82.k1;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.t1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.y3;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.exercises.DetailedMuscleMapActivityKt$DetailedMuscleMapComposeView$1$1$1$1$1", f = "DetailedMuscleMapActivity.kt", l = {TsExtractor.TS_STREAM_TYPE_SPLICE_INFO}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f84974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e2.i0 f84975b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e2.i0 i0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f84975b = i0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f84975b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f84974a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f84974a = 1;
                e2.i0.a aVar2 = e2.i0.f62432x;
                if (this.f84975b.l(0, 0, this) == aVar) {
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
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.exercises.DetailedMuscleMapActivityKt$DetailedMuscleMapComposeView$1$1$2$1$1", f = "DetailedMuscleMapActivity.kt", l = {156}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f84976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e2.i0 f84977b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f84978c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e2.i0 i0Var, int i14, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f84977b = i0Var;
            this.f84978c = i14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f84977b, this.f84978c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            e2.i0 i0Var;
            int i14;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = this.f84976a;
            if (i15 != 0 && i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            do {
                i0Var = this.f84977b;
                int iH = i0Var.h();
                i14 = this.f84978c;
                if (iH == i14 && i0Var.i() == 0) {
                    return Unit.INSTANCE;
                }
                this.f84976a = 1;
            } while (e2.i0.f(i0Var, i14, this) != aVar);
            return aVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0575  */
    /* JADX WARN: Code duplicated, block: B:107:0x058b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0148  */
    /* JADX WARN: Code duplicated, block: B:38:0x014f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0153  */
    /* JADX WARN: Code duplicated, block: B:44:0x016e  */
    /* JADX WARN: Code duplicated, block: B:47:0x018c  */
    /* JADX WARN: Code duplicated, block: B:51:0x021f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0263  */
    /* JADX WARN: Code duplicated, block: B:55:0x0265  */
    /* JADX WARN: Code duplicated, block: B:58:0x0279  */
    /* JADX WARN: Code duplicated, block: B:59:0x027c  */
    /* JADX WARN: Code duplicated, block: B:63:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:65:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:67:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:70:0x030d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0322  */
    /* JADX WARN: Code duplicated, block: B:74:0x0334  */
    /* JADX WARN: Code duplicated, block: B:75:0x0345  */
    /* JADX WARN: Code duplicated, block: B:79:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:81:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:83:0x03de  */
    /* JADX WARN: Code duplicated, block: B:86:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:88:0x040f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0422  */
    /* JADX WARN: Code duplicated, block: B:92:0x0435  */
    /* JADX WARN: Code duplicated, block: B:97:0x050a  */
    /* JADX WARN: Code duplicated, block: B:98:0x050d  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final e eVar, p3.m mVar, int i14) {
        p1 p1Var;
        h5.g.a.f fVar;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        Object objQ;
        p3.m.a.C2565a c2565a;
        final o53.b0 b0Var;
        final e2.i0 i0VarA;
        boolean zR;
        Object objQ2;
        p1 p1VarF;
        xd1.b bVar;
        boolean z14;
        float fS0;
        String str;
        s5.s0 s0VarA;
        int iA;
        int iA2;
        int iA3;
        int iA4;
        int iA5;
        ArrayList arrayList;
        Iterator it;
        int i15;
        final o53.b0 b0Var2;
        int iC;
        boolean z15;
        boolean zR2;
        Object objQ3;
        boolean z16;
        xd1.d dVar;
        boolean z17;
        String strJ;
        String strJ2;
        String strJ3;
        String strE;
        String str2;
        String strE2;
        int iA6;
        int iA7;
        ArrayList arrayList2;
        Iterator it3;
        int i16;
        xd1.c cVar;
        boolean z18;
        String strJ4;
        boolean z19;
        String strJ5;
        String strJ6;
        eVar.getClass();
        p3.o0 o0VarE = mVar.E(1117589436);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i17 = i14 | (o0VarE.r(eVar) ? 4 : 2);
        if (o0VarE.n(i17 & 1, (i17 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            float f14 = ((Configuration) o0VarE.A(AndroidCompositionLocals_androidKt.f6041a)).screenWidthDp;
            float f15 = d.f84985a;
            float f16 = f14 >= f15 ? 0.35f : 0.3f;
            androidx.lifecycle.y0<xd1.b> y0Var = eVar.f85005c;
            xd1.e eVar2 = xd1.e.GROUP_BY_EXERCISE;
            p1 p1VarF2 = o53.f0.F(y0Var, new xd1.b(eVar2, null, null, null, 14, null), o0VarE, 0);
            p1 p1VarF3 = o53.f0.F(eVar.f85008f, new o13.p(((xd1.b) p1VarF2.getF182175a()).f190010c, ((xd1.b) p1VarF2.getF182175a()).f190011d), o0VarE, 0);
            p1 p1VarF4 = o53.f0.F(eVar.f85007e, ((xd1.b) p1VarF2.getF182175a()).f190008a, o0VarE, 0);
            boolean z24 = ((xd1.e) p1VarF4.getF182175a()) == eVar2;
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar3 = h5.g.a.f81810g;
            b4.c(eVar3, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                p1Var = p1VarF3;
            } else {
                p1Var = p1VarF3;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                w.a(u2.f22900a.c(x2.f(aVar, f16), h4.d.a.f81534l), (List) ((o13.p) p1Var.getF182175a()).f128594a, (List) ((o13.p) p1Var.getF182175a()).f128595b, z24, o0VarE, 0);
                zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(aVar, o0VarE);
                if (cVar2 != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar3, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                c2.b0 b0Var3 = c2.b0.f22601a;
                float f17 = d.f84986b;
                c2.l.f(x2.h(aVar, f17), o0VarE);
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = p3.l0.j(t13.h.f161748a, o0VarE);
                    o0VarE.K(objQ);
                }
                b0Var = (o53.b0) objQ;
                i0VarA = e2.k0.a(0, 0, 3, o0VarE);
                p1 p1VarF5 = o53.f0.F(eVar.f85006d, 0, o0VarE, 48);
                h4.r rVarF = x2.f(aVar, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarB = b0Var3.b(x2.x(c2.l.A(rVarF, j92.b.f97899b.f97920e, 0.0f, 2), null, 3), h4.d.a.f81537o);
                i53.f fVarA = i53.a.a(new g1(gl1.y.Q(o0VarE, R.string.strength_training_exercises), null, null, null, 14, null), new g1(gl1.y.Q(o0VarE, R.string.lbl_primary_muscles), null, null, null, 14, null));
                int iIntValue = ((Number) p1VarF5.getF182175a()).intValue();
                zR = o0VarE.r(eVar) | o0VarE.r(b0Var) | o0VarE.B(i0VarA);
                objQ2 = o0VarE.q();
                if (zR || objQ2 == c2565a) {
                    final int i18 = 0;
                    objQ2 = new e23.l() { // from class: hq.b
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            int i19 = i18;
                            int iIntValue2 = ((Integer) obj).intValue();
                            switch (i19) {
                                case 0:
                                    eVar.x4(iIntValue2);
                                    ge1.b.T(b0Var, null, null, new c.a(i0VarA, null), 3);
                                    break;
                                default:
                                    e eVar4 = eVar;
                                    eVar4.y4(iIntValue2);
                                    Integer numD = eVar4.f85009g.d();
                                    if (numD == null || numD.intValue() != -1) {
                                        ge1.b.T(b0Var, null, null, new c.b(i0VarA, iIntValue2, null), 3);
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ2);
                }
                k1.a(fVarA, iIntValue, rVarB, null, 0.0f, (e23.l) objQ2, o0VarE, 3072, 16);
                o0VarE = o0VarE;
                c2.l.f(x2.h(aVar, f17), o0VarE);
                p1VarF = o53.f0.F(eVar.f85009g, -1, o0VarE, 48);
                bVar = (xd1.b) p1VarF2.getF182175a();
                if (((xd1.e) p1VarF4.getF182175a()) == eVar2) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                bVar.getClass();
                g6.c cVar3 = (g6.c) o0VarE.A(t1.f91490h);
                g6.f.a aVar3 = g6.f.f75994b;
                fS0 = cVar3.s0(f14);
                if (f14 >= f15) {
                    str = "WWWWWWWWWWWWWWWWWWW";
                } else {
                    str = "WWWWWWWWWWWWW";
                }
                s0VarA = s5.t0.a(o0VarE);
                iA = d.a(s0VarA, str, 0, o0VarE, 2);
                iA2 = d.a(s0VarA, gl1.y.Q(o0VarE, R.string.lbl_time), 0, o0VarE, 2);
                iA3 = d.a(s0VarA, gl1.y.Q(o0VarE, R.string.strength_training_reps), 0, o0VarE, 2);
                iA4 = d.a(s0VarA, gl1.y.Q(o0VarE, R.string.lbl_weight), 0, o0VarE, 2);
                iA5 = d.a(s0VarA, gl1.y.Q(o0VarE, R.string.strength_training_volume), 0, o0VarE, 2);
                arrayList = new ArrayList();
                o0VarE.C(178060783);
                it = bVar.f190009b.iterator();
                while (it.hasNext()) {
                    dVar = (xd1.d) it.next();
                    p1 p1Var2 = p1VarF;
                    float f18 = fS0;
                    if (p005kotlin.jvm.internal.s.g(dVar.f190018a, "Unknown")) {
                        z17 = false;
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1750571749, R.string.lbl_unknown, o0VarE, false);
                    } else {
                        z17 = false;
                        o0VarE.C(1750649435);
                        o0VarE.g0(false);
                        strJ = dVar.f190018a;
                    }
                    String str3 = strJ;
                    if (dVar.f190019b > 0) {
                        o0VarE.C(1750785401);
                        o0VarE.g0(z17);
                        strJ2 = l3.a.t1(l3.f23124b, dVar.f190019b);
                    } else {
                        strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1750906239, R.string.no_duration_value, o0VarE, z17);
                    }
                    if (dVar.f190020c > 0) {
                        o0VarE.C(1751055411);
                        o0VarE.g0(z17);
                        strJ3 = String.valueOf(dVar.f190020c);
                    } else {
                        strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1751120232, R.string.no_value, o0VarE, z17);
                    }
                    y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                    int i19 = iA5;
                    ArrayList arrayList3 = arrayList;
                    int i24 = iA;
                    strE = ss.f.e((Context) o0VarE.A(y3Var), Double.valueOf(ss.f.f(dVar.f190021d)), dVar.f190023f, true);
                    Context context = (Context) o0VarE.A(y3Var);
                    l3.a aVar4 = l3.f23124b;
                    str2 = strJ3;
                    double d14 = dVar.f190022e;
                    aVar4.getClass();
                    strE2 = ss.f.e(context, Double.valueOf(l3.a.V1(d14)), dVar.f190023f, true);
                    int iA8 = d.a(s0VarA, strJ2, iA2, o0VarE, 0);
                    iA6 = d.a(s0VarA, str2, iA3, o0VarE, 0);
                    int iA9 = d.a(s0VarA, strE, iA4, o0VarE, 0);
                    iA7 = d.a(s0VarA, strE2, i19, o0VarE, 0);
                    arrayList2 = new ArrayList();
                    o0VarE.C(178119575);
                    it3 = dVar.f190024g.iterator();
                    iA2 = iA8;
                    i16 = iA9;
                    while (it3.hasNext()) {
                        cVar = (xd1.c) it3.next();
                        String str4 = strJ2;
                        if (p005kotlin.jvm.internal.s.g(cVar.f190012a, "Unknown")) {
                            z18 = false;
                            strJ4 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -233000561, R.string.lbl_unknown, o0VarE, false);
                        } else {
                            z18 = false;
                            o0VarE.C(-232915125);
                            o0VarE.g0(false);
                            strJ4 = cVar.f190012a;
                        }
                        String str5 = strJ4;
                        int i25 = iA6;
                        if (cVar.f190013b > 0) {
                            o0VarE.C(-232775098);
                            o0VarE.g0(z18);
                            strJ5 = l3.a.t1(l3.f23124b, cVar.f190013b);
                            z19 = false;
                        } else {
                            z19 = false;
                            strJ5 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -232649207, R.string.no_duration_value, o0VarE, false);
                        }
                        int i26 = i16;
                        if (cVar.f190014c > 0) {
                            o0VarE.C(-232490208);
                            o0VarE.g0(z19);
                            strJ6 = String.valueOf(cVar.f190014c);
                        } else {
                            strJ6 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -232420334, R.string.no_value, o0VarE, z19);
                        }
                        y3 y3Var2 = AndroidCompositionLocals_androidKt.f6042b;
                        Iterator it4 = it3;
                        String strE3 = ss.f.e((Context) o0VarE.A(y3Var2), Double.valueOf(ss.f.f(cVar.f190015d)), cVar.f190017f, true);
                        Context context2 = (Context) o0VarE.A(y3Var2);
                        l3.a aVar5 = l3.f23124b;
                        String str6 = strJ5;
                        double d15 = cVar.f190016e;
                        aVar5.getClass();
                        String strE4 = ss.f.e(context2, Double.valueOf(l3.a.V1(d15)), cVar.f190017f, true);
                        iA2 = d.a(s0VarA, str6, iA2, o0VarE, 0);
                        int iA10 = d.a(s0VarA, strJ6, i25, o0VarE, 0);
                        int iA11 = d.a(s0VarA, strE3, i26, o0VarE, 0);
                        iA7 = d.a(s0VarA, strE4, iA7, o0VarE, 0);
                        arrayList2.add(new m(str5, str6, strJ6, strE3, strE4));
                        iA6 = iA10;
                        i16 = iA11;
                        strE = strE;
                        str2 = str2;
                        strJ2 = str4;
                        strE2 = strE2;
                        it3 = it4;
                    }
                    iA4 = i16;
                    int i27 = iA6;
                    o0VarE.g0(false);
                    arrayList3.add(new n(str3, strJ2, str2, strE, strE2, arrayList2));
                    arrayList = arrayList3;
                    iA5 = iA7;
                    fS0 = f18;
                    it = it;
                    b0Var = b0Var;
                    iA = i24;
                    p1VarF = p1Var2;
                    iA3 = i27;
                    bVar = bVar;
                }
                p1 p1Var3 = p1VarF;
                xd1.b bVar3 = bVar;
                i15 = iA;
                ArrayList arrayList4 = arrayList;
                b0Var2 = b0Var;
                o0VarE.g0(false);
                iC = MathKt.c((1 - f16) * fS0) - (((iA2 + iA3) + iA4) + iA5);
                if (iC < i15) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                int iMax = Math.max(iC, i15);
                g6.c cVar4 = (g6.c) o0VarE.A(t1.f91490h);
                l lVar = new l(gl1.y.Q(o0VarE, bVar3.f190008a.f190032a), arrayList4, new k(cVar4.c1(iMax), cVar4.c1(iA2), cVar4.c1(iA3), cVar4.c1(iA4), cVar4.c1(iA5), z15, null), z14);
                x1 x1Var2 = p3.n.f135158a;
                Integer num = (Integer) p1Var3.getF182175a();
                num.getClass();
                int iIntValue2 = num.intValue();
                zR2 = o0VarE.r(eVar) | o0VarE.r(b0Var2) | o0VarE.B(i0VarA);
                objQ3 = o0VarE.q();
                if (!zR2 || objQ3 == p3.m.a.f135155b) {
                    z16 = true;
                    final char c14 = 1 == true ? 1 : 0;
                    objQ3 = new e23.l() { // from class: hq.b
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            int i110 = c14;
                            int iIntValue3 = ((Integer) obj).intValue();
                            switch (i110) {
                                case 0:
                                    eVar.x4(iIntValue3);
                                    ge1.b.T(b0Var2, null, null, new c.a(i0VarA, null), 3);
                                    break;
                                default:
                                    e eVar4 = eVar;
                                    eVar4.y4(iIntValue3);
                                    Integer numD = eVar4.f85009g.d();
                                    if (numD == null || numD.intValue() != -1) {
                                        ge1.b.T(b0Var2, null, null, new c.b(i0VarA, iIntValue3, null), 3);
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ3);
                } else {
                    z16 = true;
                }
                v.d(lVar, i0VarA, iIntValue2, (e23.l) objQ3, o0VarE, 0);
                o0VarE.g0(z16);
                o0VarE.g0(z16);
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            w.a(u2.f22900a.c(x2.f(aVar, f16), h4.d.a.f81534l), (List) ((o13.p) p1Var.getF182175a()).f128594a, (List) ((o13.p) p1Var.getF182175a()).f128595b, z24, o0VarE, 0);
            zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(aVar, o0VarE);
            if (cVar2 != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
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
            c2.b0 b0Var4 = c2.b0.f22601a;
            float f19 = d.f84986b;
            c2.l.f(x2.h(aVar, f19), o0VarE);
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0Var = (o53.b0) objQ;
            i0VarA = e2.k0.a(0, 0, 3, o0VarE);
            p1 p1VarF6 = o53.f0.F(eVar.f85006d, 0, o0VarE, 48);
            h4.r rVarF2 = x2.f(aVar, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarB2 = b0Var4.b(x2.x(c2.l.A(rVarF2, j92.b.f97899b.f97920e, 0.0f, 2), null, 3), h4.d.a.f81537o);
            i53.f fVarA2 = i53.a.a(new g1(gl1.y.Q(o0VarE, R.string.strength_training_exercises), null, null, null, 14, null), new g1(gl1.y.Q(o0VarE, R.string.lbl_primary_muscles), null, null, null, 14, null));
            int iIntValue3 = ((Number) p1VarF6.getF182175a()).intValue();
            zR = o0VarE.r(eVar) | o0VarE.r(b0Var) | o0VarE.B(i0VarA);
            objQ2 = o0VarE.q();
            if (zR) {
                final int i110 = 0;
                objQ2 = new e23.l() { // from class: hq.b
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        int i111 = i110;
                        int iIntValue4 = ((Integer) obj).intValue();
                        switch (i111) {
                            case 0:
                                eVar.x4(iIntValue4);
                                ge1.b.T(b0Var, null, null, new c.a(i0VarA, null), 3);
                                break;
                            default:
                                e eVar4 = eVar;
                                eVar4.y4(iIntValue4);
                                Integer numD = eVar4.f85009g.d();
                                if (numD == null || numD.intValue() != -1) {
                                    ge1.b.T(b0Var, null, null, new c.b(i0VarA, iIntValue4, null), 3);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ2);
            } else {
                final int i111 = 0;
                objQ2 = new e23.l() { // from class: hq.b
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        int i112 = i111;
                        int iIntValue4 = ((Integer) obj).intValue();
                        switch (i112) {
                            case 0:
                                eVar.x4(iIntValue4);
                                ge1.b.T(b0Var, null, null, new c.a(i0VarA, null), 3);
                                break;
                            default:
                                e eVar4 = eVar;
                                eVar4.y4(iIntValue4);
                                Integer numD = eVar4.f85009g.d();
                                if (numD == null || numD.intValue() != -1) {
                                    ge1.b.T(b0Var, null, null, new c.b(i0VarA, iIntValue4, null), 3);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ2);
            }
            k1.a(fVarA2, iIntValue3, rVarB2, null, 0.0f, (e23.l) objQ2, o0VarE, 3072, 16);
            o0VarE = o0VarE;
            c2.l.f(x2.h(aVar, f19), o0VarE);
            p1VarF = o53.f0.F(eVar.f85009g, -1, o0VarE, 48);
            bVar = (xd1.b) p1VarF2.getF182175a();
            if (((xd1.e) p1VarF4.getF182175a()) == eVar2) {
                z14 = true;
            } else {
                z14 = false;
            }
            bVar.getClass();
            g6.c cVar5 = (g6.c) o0VarE.A(t1.f91490h);
            g6.f.a aVar6 = g6.f.f75994b;
            fS0 = cVar5.s0(f14);
            if (f14 >= f15) {
                str = "WWWWWWWWWWWWWWWWWWW";
            } else {
                str = "WWWWWWWWWWWWW";
            }
            s0VarA = s5.t0.a(o0VarE);
            iA = d.a(s0VarA, str, 0, o0VarE, 2);
            iA2 = d.a(s0VarA, gl1.y.Q(o0VarE, R.string.lbl_time), 0, o0VarE, 2);
            iA3 = d.a(s0VarA, gl1.y.Q(o0VarE, R.string.strength_training_reps), 0, o0VarE, 2);
            iA4 = d.a(s0VarA, gl1.y.Q(o0VarE, R.string.lbl_weight), 0, o0VarE, 2);
            iA5 = d.a(s0VarA, gl1.y.Q(o0VarE, R.string.strength_training_volume), 0, o0VarE, 2);
            arrayList = new ArrayList();
            o0VarE.C(178060783);
            it = bVar.f190009b.iterator();
            while (it.hasNext()) {
                dVar = (xd1.d) it.next();
                p1 p1Var4 = p1VarF;
                float f110 = fS0;
                if (p005kotlin.jvm.internal.s.g(dVar.f190018a, "Unknown")) {
                    z17 = false;
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1750571749, R.string.lbl_unknown, o0VarE, false);
                } else {
                    z17 = false;
                    o0VarE.C(1750649435);
                    o0VarE.g0(false);
                    strJ = dVar.f190018a;
                }
                String str7 = strJ;
                if (dVar.f190019b > 0) {
                    o0VarE.C(1750785401);
                    o0VarE.g0(z17);
                    strJ2 = l3.a.t1(l3.f23124b, dVar.f190019b);
                } else {
                    strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1750906239, R.string.no_duration_value, o0VarE, z17);
                }
                if (dVar.f190020c > 0) {
                    o0VarE.C(1751055411);
                    o0VarE.g0(z17);
                    strJ3 = String.valueOf(dVar.f190020c);
                } else {
                    strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1751120232, R.string.no_value, o0VarE, z17);
                }
                y3 y3Var3 = AndroidCompositionLocals_androidKt.f6042b;
                int i112 = iA5;
                ArrayList arrayList5 = arrayList;
                int i28 = iA;
                strE = ss.f.e((Context) o0VarE.A(y3Var3), Double.valueOf(ss.f.f(dVar.f190021d)), dVar.f190023f, true);
                Context context3 = (Context) o0VarE.A(y3Var3);
                l3.a aVar7 = l3.f23124b;
                str2 = strJ3;
                double d16 = dVar.f190022e;
                aVar7.getClass();
                strE2 = ss.f.e(context3, Double.valueOf(l3.a.V1(d16)), dVar.f190023f, true);
                int iA12 = d.a(s0VarA, strJ2, iA2, o0VarE, 0);
                iA6 = d.a(s0VarA, str2, iA3, o0VarE, 0);
                int iA13 = d.a(s0VarA, strE, iA4, o0VarE, 0);
                iA7 = d.a(s0VarA, strE2, i112, o0VarE, 0);
                arrayList2 = new ArrayList();
                o0VarE.C(178119575);
                it3 = dVar.f190024g.iterator();
                iA2 = iA12;
                i16 = iA13;
                while (it3.hasNext()) {
                    cVar = (xd1.c) it3.next();
                    String str8 = strJ2;
                    if (p005kotlin.jvm.internal.s.g(cVar.f190012a, "Unknown")) {
                        z18 = false;
                        strJ4 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -233000561, R.string.lbl_unknown, o0VarE, false);
                    } else {
                        z18 = false;
                        o0VarE.C(-232915125);
                        o0VarE.g0(false);
                        strJ4 = cVar.f190012a;
                    }
                    String str9 = strJ4;
                    int i29 = iA6;
                    if (cVar.f190013b > 0) {
                        o0VarE.C(-232775098);
                        o0VarE.g0(z18);
                        strJ5 = l3.a.t1(l3.f23124b, cVar.f190013b);
                        z19 = false;
                    } else {
                        z19 = false;
                        strJ5 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -232649207, R.string.no_duration_value, o0VarE, false);
                    }
                    int i210 = i16;
                    if (cVar.f190014c > 0) {
                        o0VarE.C(-232490208);
                        o0VarE.g0(z19);
                        strJ6 = String.valueOf(cVar.f190014c);
                    } else {
                        strJ6 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -232420334, R.string.no_value, o0VarE, z19);
                    }
                    y3 y3Var4 = AndroidCompositionLocals_androidKt.f6042b;
                    Iterator it5 = it3;
                    String strE5 = ss.f.e((Context) o0VarE.A(y3Var4), Double.valueOf(ss.f.f(cVar.f190015d)), cVar.f190017f, true);
                    Context context4 = (Context) o0VarE.A(y3Var4);
                    l3.a aVar8 = l3.f23124b;
                    String str10 = strJ5;
                    double d17 = cVar.f190016e;
                    aVar8.getClass();
                    String strE6 = ss.f.e(context4, Double.valueOf(l3.a.V1(d17)), cVar.f190017f, true);
                    iA2 = d.a(s0VarA, str10, iA2, o0VarE, 0);
                    int iA14 = d.a(s0VarA, strJ6, i29, o0VarE, 0);
                    int iA15 = d.a(s0VarA, strE5, i210, o0VarE, 0);
                    iA7 = d.a(s0VarA, strE6, iA7, o0VarE, 0);
                    arrayList2.add(new m(str9, str10, strJ6, strE5, strE6));
                    iA6 = iA14;
                    i16 = iA15;
                    strE = strE;
                    str2 = str2;
                    strJ2 = str8;
                    strE2 = strE2;
                    it3 = it5;
                }
                iA4 = i16;
                int i211 = iA6;
                o0VarE.g0(false);
                arrayList5.add(new n(str7, strJ2, str2, strE, strE2, arrayList2));
                arrayList = arrayList5;
                iA5 = iA7;
                fS0 = f110;
                it = it;
                b0Var = b0Var;
                iA = i28;
                p1VarF = p1Var4;
                iA3 = i211;
                bVar = bVar;
            }
            p1 p1Var5 = p1VarF;
            xd1.b bVar4 = bVar;
            i15 = iA;
            ArrayList arrayList6 = arrayList;
            b0Var2 = b0Var;
            o0VarE.g0(false);
            iC = MathKt.c((1 - f16) * fS0) - (((iA2 + iA3) + iA4) + iA5);
            if (iC < i15) {
                z15 = true;
            } else {
                z15 = false;
            }
            int iMax2 = Math.max(iC, i15);
            g6.c cVar6 = (g6.c) o0VarE.A(t1.f91490h);
            l lVar2 = new l(gl1.y.Q(o0VarE, bVar4.f190008a.f190032a), arrayList6, new k(cVar6.c1(iMax2), cVar6.c1(iA2), cVar6.c1(iA3), cVar6.c1(iA4), cVar6.c1(iA5), z15, null), z14);
            x1 x1Var3 = p3.n.f135158a;
            Integer num2 = (Integer) p1Var5.getF182175a();
            num2.getClass();
            int iIntValue4 = num2.intValue();
            zR2 = o0VarE.r(eVar) | o0VarE.r(b0Var2) | o0VarE.B(i0VarA);
            objQ3 = o0VarE.q();
            if (zR2) {
                z16 = true;
                final int c15 = 1 == true ? 1 : 0;
                objQ3 = new e23.l() { // from class: hq.b
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        int i113 = c15;
                        int iIntValue5 = ((Integer) obj).intValue();
                        switch (i113) {
                            case 0:
                                eVar.x4(iIntValue5);
                                ge1.b.T(b0Var2, null, null, new c.a(i0VarA, null), 3);
                                break;
                            default:
                                e eVar4 = eVar;
                                eVar4.y4(iIntValue5);
                                Integer numD = eVar4.f85009g.d();
                                if (numD == null || numD.intValue() != -1) {
                                    ge1.b.T(b0Var2, null, null, new c.b(i0VarA, iIntValue5, null), 3);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ3);
            } else {
                z16 = true;
                final int c16 = 1 == true ? 1 : 0;
                objQ3 = new e23.l() { // from class: hq.b
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        int i113 = c16;
                        int iIntValue5 = ((Integer) obj).intValue();
                        switch (i113) {
                            case 0:
                                eVar.x4(iIntValue5);
                                ge1.b.T(b0Var2, null, null, new c.a(i0VarA, null), 3);
                                break;
                            default:
                                e eVar4 = eVar;
                                eVar4.y4(iIntValue5);
                                Integer numD = eVar4.f85009g.d();
                                if (numD == null || numD.intValue() != -1) {
                                    ge1.b.T(b0Var2, null, null, new c.b(i0VarA, iIntValue5, null), 3);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ3);
            }
            v.d(lVar2, i0VarA, iIntValue4, (e23.l) objQ3, o0VarE, 0);
            o0VarE.g0(z16);
            o0VarE.g0(z16);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fp0.l(eVar, i14, 15);
        }
    }
}
