package ck0;

import android.content.ClipData;
import android.content.Context;
import android.os.Build;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.k3;
import c2.n3;
import c2.q1;
import c2.q3;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import c42.c0;
import ca0.v0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import f5.z0;
import h5.e0;
import i3.fe;
import i3.mh;
import java.util.ArrayList;
import kotlin.m1;
import kotlin.o1;
import kotlin.t1;
import kotlin.t3;
import l72.c1;
import l72.d3;
import l72.f0;
import lc.u0;
import o53.b0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import r1.q2;
import s5.x0;
import u1.y0;
import v62.s9;
import z2.m0;

/* JADX INFO: loaded from: classes8.dex */
public final class k {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gcplus.presentation.home.offers.ExclusiveOfferDetailsScreenKt$ExclusiveOfferDetailsScreen$2$1$1$1$1", f = "ExclusiveOfferDetailsScreen.kt", l = {166}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f27858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fe f27859b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f27860c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fe feVar, String str, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f27859b = feVar;
            this.f27860c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f27859b, this.f27860c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f27858a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f27858a = 1;
                if (d3.c(this.f27859b, this.f27860c, null, this) == aVar) {
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
    @v13.e(c = "com.garmin.android.apps.connectmobile.gcplus.presentation.home.offers.ExclusiveOfferDetailsScreenKt$ExclusiveOfferDetailsScreen$3$1$2$2$1$1", f = "ExclusiveOfferDetailsScreen.kt", l = {219, 222}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f27861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ v f27862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o1 f27863c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ fe f27864d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f27865e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v vVar, o1 o1Var, fe feVar, String str, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f27862b = vVar;
            this.f27863c = o1Var;
            this.f27864d = feVar;
            this.f27865e = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f27862b, this.f27863c, this.f27864d, this.f27865e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
        
            if (i3.fe.b(r9.f27864d, r9.f27865e, null, null, r9, 14) == r0) goto L17;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f27861a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            ClipData clipDataNewPlainText = ClipData.newPlainText("OfferCode", ((v.d) this.f27862b).f27897a);
            clipDataNewPlainText.getClass();
            m1 m1Var = new m1(clipDataNewPlainText);
            this.f27861a = 1;
            if (this.f27863c.c(m1Var) != aVar) {
            }
            return aVar;
            if (Build.VERSION.SDK_INT <= 32) {
                this.f27861a = 2;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0358  */
    /* JADX WARN: Code duplicated, block: B:76:0x028a  */
    /* JADX WARN: Code duplicated, block: B:80:0x02e7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(v vVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        long jA;
        Throwable th3;
        boolean z14;
        boolean z15;
        String strJ;
        boolean z16;
        v vVar2 = vVar;
        e23.a<Unit> aVar2 = aVar;
        o0 o0VarE = mVar.E(-1067004191);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(vVar2) ? 4 : 2) | (o0VarE.r(aVar2) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar3 = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97918c;
            h4.r rVarA = c2.l.A(aVar3, f14, 0.0f, 2);
            c2.j.i iVarG = q2.g(bVar, c2.j.f22691a, f15);
            h4.d.f81522a.getClass();
            z zVarA = y.a(iVarG, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarA, o0VarE);
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
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r rVarO = c2.l.o(aVar3, q1.Min);
            bVar.getClass();
            s2 s2VarA = c2.q2.a(c2.j.i(f15), h4.d.a.f81533k, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarO, o0VarE);
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
            b4.c(eVar2, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            boolean z17 = vVar2 instanceof v.a;
            if (z17) {
                o0VarE.C(-1202271122);
                jA = d92.b.a(o0VarE).j().g();
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1202208440);
                jA = d92.b.a(o0VarE).g().b().a();
                o0VarE.g0(false);
            }
            long j8 = jA;
            boolean z18 = true;
            h4.r rVarE = c2.l.E(x2.c(u2Var.a(aVar3, 1.0f, true), 1.0f), q1.Max);
            g6.f.a aVar5 = g6.f.f75994b;
            u1.u uVarA = u1.n.a(1, j8);
            bVar.getClass();
            h4.r rVarE2 = u1.n.e(u1.q.c(uVarA.f167683a, rVarE, uVarA.f167684b, k2.i.a(j92.b.f97900c.f97911c)), d92.b.a(o0VarE).g().a().a(), o4.m1.f128891a);
            bVar.getClass();
            float f16 = eVar.f97919d;
            bVar.getClass();
            h4.r rVarZ = c2.l.z(rVarE2, f15, f16);
            z0 z0VarD = c2.q.d(h4.d.a.f81527e, false);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarZ, o0VarE);
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
            b4.c(eVar2, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
            }
            b4.c(fVar, rVarC3, o0VarE);
            c2.u uVar = c2.u.f22885a;
            vVar2 = vVar;
            boolean z19 = vVar2 instanceof v.b;
            p3.m.a aVar6 = p3.m.f135153a;
            if (z19 || (vVar2 instanceof v.c) || z17) {
                o0VarE.C(-954444369);
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_hidden_code);
                String strQ2 = gl1.y.Q(o0VarE, R.string.hidden_code_dots);
                d92.b.f58624b.getClass();
                x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
                boolean zB = o0VarE.B(strQ);
                Object objQ = o0VarE.q();
                if (zB) {
                    objQ = new c82.b(strQ, 23);
                    o0VarE.K(objQ);
                } else {
                    aVar6.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new c82.b(strQ, 23);
                        o0VarE.K(objQ);
                    }
                }
                th3 = null;
                z14 = false;
                mh.c(strQ2, p5.v.c((e23.l) objQ, aVar3, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
                o0VarE = o0VarE;
                o0VarE.g0(false);
                z18 = true;
            } else {
                if (!(vVar2 instanceof v.d)) {
                    throw kg.f.h(o0VarE, -1000624672, false);
                }
                o0VarE.C(-953892786);
                String str = ((v.d) vVar2).f27897a;
                ArrayList arrayList = new ArrayList(str.length());
                for (int i16 = 0; i16 < str.length(); i16++) {
                    arrayList.add(Character.valueOf(str.charAt(i16)));
                }
                String strK0 = h0.k0(arrayList, StringUtils.SPACE, null, null, null, 62);
                Object objQ2 = o0VarE.q();
                aVar6.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new ch1.f(3);
                    o0VarE.K(objQ2);
                }
                m0.b(null, z3.f.c(697096453, new c0(12, vVar2, oi0.c.B(strK0, (e23.l) objQ2, o0VarE)), o0VarE), o0VarE, 48);
                o0VarE.g0(false);
                z14 = false;
                th3 = null;
            }
            o0VarE.g0(z18);
            f0 f0Var = f0.f110999a;
            boolean z24 = vVar2 instanceof v.c;
            if (z24) {
                z15 = z14;
            } else {
                if (z19) {
                    if (((v.b) vVar2).f27895a) {
                        z15 = z14;
                    }
                } else if (!z17 && !(vVar2 instanceof v.d)) {
                    u0.r();
                    return;
                }
                z15 = true;
            }
            if (z19 || z17) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -592873249, R.string.reveal_code, o0VarE, z14);
            } else if (z24) {
                o0VarE.C(-1199117214);
                o0VarE.g0(z14);
                strJ = th3;
            } else {
                if (!(vVar2 instanceof v.d)) {
                    throw kg.f.h(o0VarE, -592875942, z14);
                }
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -592868737, R.string.common_copy, o0VarE, z14);
            }
            e23.p pVarC = z3.f.c(1656343267, new c62.m1(vVar2, 9), o0VarE);
            boolean z25 = (i15 & 112) == 32 ? true : z14;
            Object objQ3 = o0VarE.q();
            if (z25) {
                aVar2 = aVar;
                objQ3 = new v0(aVar2, 12);
                o0VarE.K(objQ3);
            } else {
                aVar6.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    aVar2 = aVar;
                    objQ3 = new v0(aVar2, 12);
                    o0VarE.K(objQ3);
                } else {
                    aVar2 = aVar;
                }
            }
            o0 o0Var = o0VarE;
            f0Var.h(pVarC, strJ, null, z15, (e23.a) objQ3, o0Var, 48, 1);
            o0VarE = o0Var;
            o0VarE.g0(true);
            if (z17) {
                o0VarE.C(-716900998);
                h4.d.f81522a.getClass();
                h4.g.b bVar3 = h4.d.a.f81534l;
                c2.j jVar = c2.j.f22691a;
                d92.b.f58623a.getClass();
                j92.b bVar4 = d92.b.f58625c;
                bVar4.getClass();
                float f17 = j92.b.f97899b.f97917b;
                jVar.getClass();
                c2.j.i iVarI = c2.j.i(f17);
                h4.r.a aVar7 = h4.r.S;
                s2 s2VarA2 = c2.q2.a(iVarI, bVar3, o0VarE, 48);
                x1 x1Var2 = p3.n.f135158a;
                int iHashCode4 = Long.hashCode(o0VarE.U);
                i2 i2VarA3 = o0VarE.a0();
                h4.r rVarC4 = h4.k.c(aVar7, o0VarE);
                h5.g.V.getClass();
                e0.a aVar8 = h5.g.a.f81805b;
                if (cVar == null) {
                    p0.l();
                    throw th3;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar8);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, s2VarA2, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA3, o0VarE);
                h5.g.a.b bVar5 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode4))) {
                    v.h.A(iHashCode4, o0VarE, iHashCode4, bVar5);
                }
                b4.c(h5.g.a.f81807d, rVarC4, o0VarE);
                u2 u2Var2 = u2.f22900a;
                bVar4.getClass();
                h4.r rVarQ = x2.q(aVar7, j92.b.f97901d.f97904c);
                s62.a.f157643a.getClass();
                y0.b(s9.a(t62.b.f162798a), null, rVarQ, null, o0VarE, 48, 120);
                String strQ3 = gl1.y.Q(o0VarE, R.string.golf_shot_map_failed_message);
                d92.b.f58624b.getClass();
                mh.c(strQ3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97935l, o0VarE), o0VarE, 0, 0, 131070);
                o0VarE = o0VarE;
                z16 = true;
                o0VarE.g0(true);
                o0VarE.g0(z14);
            } else {
                z16 = true;
                o0VarE.C(-716321205);
                o0VarE.g0(z14);
            }
            o0VarE.g0(z16);
            x1 x1Var3 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c0(vVar2, aVar2, i14, 13);
        }
    }

    public static final void b(t tVar, p3.m mVar, int i14) {
        t tVar2 = tVar;
        o0 o0VarE = mVar.E(1046200095);
        int i15 = i14 | (o0VarE.r(tVar2) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97918c;
            h4.r rVarA = c2.l.A(aVar, f14, 0.0f, 2);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            String str = tVar2.f27886d;
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97928e), o0VarE), o0VarE, 0, 0, 131070);
            tn.k.n(bVar, aVar, f15, o0VarE);
            c cVar = tVar.f27889g;
            p.a(null, cVar != null ? cVar.f27821b : null, cVar != null, tVar.f27893k, null, o0VarE, 0);
            tn.k.n(bVar, aVar, f15, o0VarE);
            String str2 = tVar.f27887e;
            fVar.getClass();
            tVar2 = tVar;
            mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 131070);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c62.m1(tVar2, i14, 10);
        }
    }

    public static final void c(t tVar, v vVar, w wVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.l<? super String, Unit> lVar, e23.a<Unit> aVar3, p3.m mVar, int i14) {
        o0 o0Var;
        vVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        lVar.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(-1210139261);
        int i15 = 4;
        int i16 = i14 | (o0VarE.r(tVar) ? 4 : 2) | (o0VarE.B(vVar) ? 32 : 16) | (o0VarE.r(wVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192) | (o0VarE.r(lVar) ? 131072 : 65536) | (o0VarE.r(aVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i16 & 1, (599187 & i16) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            o1 o1Var = (o1) o0VarE.A(t1.f91488f);
            t3 t3Var = (t3) o0VarE.A(t1.f91501s);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarE);
            }
            fe feVar = (fe) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ2);
            }
            b0 b0Var = (b0) objQ2;
            boolean zR = o0VarE.r(context);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new a51.m(context, i15);
                o0VarE.K(objQ3);
            }
            e23.l lVar2 = (e23.l) objQ3;
            String str = tVar.f27884b;
            if (str == null || d53.w.J(str)) {
                str = null;
            }
            boolean z14 = str != null;
            String strQ = gl1.y.Q(o0VarE, R.string.code_copied);
            ck0.a.f27816a.getClass();
            o0Var = o0VarE;
            z02.d.a(false, ck0.a.f27817b, z3.f.c(-814664823, new ak0.o(feVar, 1), o0VarE), z3.f.c(1440838986, new h(z14, t3Var, tVar, b0Var, lVar, feVar, 0), o0VarE), n3.f22788a, z3.f.c(1656879308, new i(z14, tVar, vVar, aVar, b0Var, o1Var, strQ, wVar, aVar3, feVar, lVar2, aVar2), o0VarE), o0Var, 200112, 1);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b21.l0(i14, 2, tVar, vVar, wVar, aVar, aVar2, lVar, aVar3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ab  */
    public static final void d(q qVar, boolean z14, p3.m mVar, int i14) {
        boolean zD;
        String str;
        Unit unit;
        String str2 = qVar.f27879b;
        o0 o0VarE = mVar.E(-1830482748);
        int i15 = 4;
        int i16 = (o0VarE.B(qVar) ? 4 : 2) | i14 | 16;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                d92.b.f58623a.getClass();
                zD = d92.b.d(o0VarE);
            } else {
                o0VarE.e();
                zD = z14;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            if (!zD || (str = qVar.f27881d) == null) {
                str = str2;
            }
            if (str == null) {
                o0VarE.C(1288532619);
                o0VarE.g0(false);
                unit = null;
            } else {
                o0VarE.C(1288532620);
                long jB = tn.k.b(d92.b.f58623a, o0VarE);
                h4.r rVarF = x2.f(h4.r.S, 1.0f);
                g6.f.a aVar = g6.f.f75994b;
                int i17 = k3.f22728a;
                c2.g gVarC = q3.c(o0VarE);
                h4.r rVarH = x2.h(rVarF, 280 + gVarC.e().f25191b);
                boolean zL = o0VarE.l(jB);
                Object objQ = o0VarE.q();
                p3.m.a aVar2 = p3.m.f135153a;
                if (zL) {
                    objQ = new a02.a(jB, 12);
                    o0VarE.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new a02.a(jB, 12);
                        o0VarE.K(objQ);
                    }
                }
                h4.r rVarE = l4.k.e(rVarH, (e23.l) objQ);
                Object objQ2 = o0VarE.q();
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new ch1.f(4);
                    o0VarE.K(objQ2);
                }
                h4.r rVarC = p5.v.c((e23.l) objQ2, rVarE, false);
                f5.k.f68985a.getClass();
                f5.k.a.C1427a c1427a = f5.k.a.f68987b;
                h4.d.f81522a.getClass();
                jf.r.a(str, null, rVarC, null, h4.d.a.f81528f, c1427a, null, o0VarE, 1769520, 1944);
                o0VarE.g0(false);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                o0VarE.C(1842712398);
                h4.r.a aVar3 = h4.r.S;
                int i18 = k3.f22728a;
                c2.l.f(c2.l.I(aVar3, q3.d(o0VarE)), o0VarE);
            } else {
                o0VarE.C(1842680468);
            }
            o0VarE.g0(false);
        } else {
            o0VarE.e();
            zD = z14;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ap2.f(qVar, zD, i14, i15);
        }
    }

    public static final void e(w wVar, e23.l<? super b63.o, String> lVar, p3.m mVar, int i14) {
        o0 o0Var;
        String strP;
        o0 o0VarE = mVar.E(1513167463);
        int i15 = (o0VarE.r(wVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            String strInvoke = lVar.invoke(wVar.f27900c);
            String strInvoke2 = lVar.invoke(wVar.f27899b);
            c1 c1Var = c1.f110940a;
            String strQ = gl1.y.Q(o0VarE, R.string.reveal_code_question);
            int i16 = wVar.f27898a;
            if (i16 == 0) {
                o0VarE.C(-1839967123);
                strP = gl1.y.P(R.string.expires_on_no_remaining_codes_question, new Object[]{strInvoke, strInvoke2}, o0VarE);
                o0VarE.g0(false);
            } else if (i16 != 1) {
                o0VarE.C(-1839955333);
                strP = gl1.y.P(R.string.expires_on_remaining_codes_question, new Object[]{strInvoke, String.valueOf(i16), strInvoke2}, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1839961239);
                strP = gl1.y.P(R.string.expires_on_remaining_code_question, new Object[]{strInvoke, strInvoke2}, o0VarE);
                o0VarE.g0(false);
            }
            o0Var = o0VarE;
            c1Var.a(false, strQ, strP, null, null, gl1.y.Q(o0VarE, R.string.lbl_reveal), false, false, wVar.f27901d, gl1.y.Q(o0VarE, R.string.lbl_cancel), wVar.f27902e, o0Var, 0, 0, 217);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c0(wVar, lVar, i14, 11);
        }
    }
}
