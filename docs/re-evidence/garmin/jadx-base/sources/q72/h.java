package q72;

import a42.f0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b63.o;
import c2.c3;
import c2.j;
import c2.k3;
import c2.l;
import c2.n3;
import c2.p3;
import c2.q3;
import c2.x2;
import c2.y;
import c2.z;
import e23.p;
import h4.k;
import h5.e0;
import i3.e5;
import i3.e9;
import i3.kb;
import i3.mc;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.r;
import o4.m1;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
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
import q53.q;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.ui.catalog.library.examples.templates.ReportsPagerExamplesKt$ReportsPagerExamples$1$1$1$1", f = "ReportsPagerExamples.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f143287a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p1<Boolean> p1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f143287a = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f143287a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f143287a.setValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.ui.catalog.library.examples.templates.ReportsPagerExamplesKt$ReportsPagerExamples$2$1$hideBottomSheet$1$1$1", f = "ReportsPagerExamples.kt", l = {107}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f143288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f143289b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(mc mcVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f143289b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f143289b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f143288a;
            if (i14 == 0) {
                r.b(obj);
                this.f143288a = 1;
                if (this.f143289b.d(this) == aVar) {
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

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f143290a;

        static {
            int[] iArr = new int[o82.g.values().length];
            try {
                iArr[o82.g.f130849b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o82.g.f130850c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o82.g.f130851d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o82.g.f130852e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[o82.g.f130853f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[o82.g.f130857j.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[o82.g.f130854g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[o82.g.f130855h.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[o82.g.f130856i.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[o82.g.f130858k.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[o82.g.f130859l.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f143290a = iArr;
        }
    }

    public static final void a(h4.r rVar, r72.i iVar, w82.a aVar, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-2012377067);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(iVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarA = l.A(rVarF, j92.b.f97899b.f97920e, 0.0f, 2);
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            j.f22691a.getClass();
            z zVarA = y.a(j.f22694d, aVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = k.c(rVarA, o0VarE);
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
            e(rVar, iVar, aVar, o0VarE, (i15 & 896) | (i15 & 14) | 3072 | (i15 & 112));
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(rVar, iVar, aVar, i14, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:50:0x010a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0150  */
    /* JADX WARN: Code duplicated, block: B:54:0x0157  */
    /* JADX WARN: Code duplicated, block: B:55:0x015b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0176  */
    /* JADX WARN: Code duplicated, block: B:64:0x0190  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:77:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e6  */
    public static final void b(r72.i iVar, w82.a<o13.p<List<o>, b63.l>> aVar, e23.l<? super o, Unit> lVar, m mVar, int i14) {
        r72.i iVar2;
        int i15;
        o0 o0Var;
        p3.c<?> cVar;
        h5.g.a.f fVar;
        o13.p<List<o>, b63.l> pVar;
        boolean z14;
        List<o> list;
        h4.r rVarA;
        boolean z15;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        boolean z16;
        boolean zR;
        Object objQ;
        o0 o0VarE = mVar.E(1447019381);
        p3.c<?> cVar2 = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            iVar2 = iVar;
            i15 = (o0VarE.B(iVar2) ? 4 : 2) | i14;
        } else {
            iVar2 = iVar;
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarE = u1.n.e(x2.d(aVar2, 1.0f), vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81537o;
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            z zVarA2 = y.a(kVar, aVar3, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA2, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                o0Var = o0VarE;
                d(null, iVar2, i(aVar, "daily"), o0Var, (i16 << 3) & 112, 1);
                pVar = aVar.f183553b;
                if (pVar != null) {
                    list = pVar.f128594a;
                    if (list.isEmpty()) {
                        z14 = true;
                        o0Var.C(714515299);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(713821457);
                        j92.b bVar2 = d92.b.f58625c;
                        bVar2.getClass();
                        j92.e eVar2 = j92.b.f97899b;
                        float f14 = eVar2.f97918c;
                        float f15 = eVar2.f97920e;
                        rVarA = l.A(aVar2, 0.0f, f14, 1);
                        bVar2.getClass();
                        bVar2.getClass();
                        float f16 = eVar2.f97918c;
                        bVar2.getClass();
                        bVar2.getClass();
                        h4.r rVarD = l.D(l.B(aVar2, f15, f16, f15, f15));
                        z15 = false;
                        zVarA = y.a(kVar, h4.d.a.f81536n, o0Var, 0);
                        iHashCode = Long.hashCode(o0Var.U);
                        i2VarA0 = o0Var.a0();
                        rVarC = k.c(rVarD, o0Var);
                        if (cVar != null) {
                            p0.l();
                            throw null;
                        }
                        o0Var.z();
                        if (o0Var.T) {
                            o0Var.M(aVar4);
                        } else {
                            o0Var.c();
                        }
                        b4.c(eVar, zVarA, o0Var);
                        b4.c(c1623g, i2VarA0, o0Var);
                        if (o0Var.T || !s.g(o0Var.q(), Integer.valueOf(iHashCode))) {
                            v.h.A(iHashCode, o0Var, iHashCode, bVar);
                        }
                        b4.c(fVar, rVarC, o0Var);
                        o0Var.C(-1113170653);
                        for (o oVar : list) {
                            String string = oVar.toString();
                            if ((i16 & 896) == 256) {
                                z16 = true;
                            } else {
                                z16 = z15;
                            }
                            zR = z16 | o0Var.r(oVar);
                            objQ = o0Var.q();
                            if (zR) {
                                objQ = new kh0.j(lVar, oVar, 1);
                                o0Var.K(objQ);
                            } else {
                                m.f135153a.getClass();
                                if (objQ == m.a.f135155b) {
                                    objQ = new kh0.j(lVar, oVar, 1);
                                    o0Var.K(objQ);
                                }
                            }
                            o0 o0Var2 = o0Var;
                            h4.r rVar = rVarA;
                            l72.l.d(string, null, null, rVar, null, false, (e23.a) objQ, o0Var2, 0, 54);
                            i16 = i16;
                            z15 = z15;
                            rVarA = rVar;
                            o0Var = o0Var2;
                        }
                        boolean z17 = z15;
                        z14 = true;
                        e5.u(o0Var, z17, true, z17);
                    }
                } else {
                    z14 = true;
                    o0Var.C(714515299);
                    o0Var.g0(false);
                }
                o0Var.g0(z14);
                x1 x1Var2 = n.f135158a;
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            o0Var = o0VarE;
            d(null, iVar2, i(aVar, "daily"), o0Var, (i16 << 3) & 112, 1);
            pVar = aVar.f183553b;
            if (pVar != null) {
                list = pVar.f128594a;
                if (list.isEmpty()) {
                    o0Var.C(713821457);
                    j92.b bVar3 = d92.b.f58625c;
                    bVar3.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    float f17 = eVar3.f97918c;
                    float f18 = eVar3.f97920e;
                    rVarA = l.A(aVar2, 0.0f, f17, 1);
                    bVar3.getClass();
                    bVar3.getClass();
                    float f19 = eVar3.f97918c;
                    bVar3.getClass();
                    bVar3.getClass();
                    h4.r rVarD2 = l.D(l.B(aVar2, f18, f19, f18, f18));
                    z15 = false;
                    zVarA = y.a(kVar, h4.d.a.f81536n, o0Var, 0);
                    iHashCode = Long.hashCode(o0Var.U);
                    i2VarA0 = o0Var.a0();
                    rVarC = k.c(rVarD2, o0Var);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0Var.z();
                    if (o0Var.T) {
                        o0Var.M(aVar4);
                    } else {
                        o0Var.c();
                    }
                    b4.c(eVar, zVarA, o0Var);
                    b4.c(c1623g, i2VarA0, o0Var);
                    if (o0Var.T) {
                        v.h.A(iHashCode, o0Var, iHashCode, bVar);
                    } else {
                        v.h.A(iHashCode, o0Var, iHashCode, bVar);
                    }
                    b4.c(fVar, rVarC, o0Var);
                    o0Var.C(-1113170653);
                    while (r0.hasNext()) {
                        String string2 = oVar.toString();
                        if ((i16 & 896) == 256) {
                            z16 = true;
                        } else {
                            z16 = z15;
                        }
                        zR = z16 | o0Var.r(oVar);
                        objQ = o0Var.q();
                        if (zR) {
                            m.f135153a.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new kh0.j(lVar, oVar, 1);
                                o0Var.K(objQ);
                            }
                        } else {
                            objQ = new kh0.j(lVar, oVar, 1);
                            o0Var.K(objQ);
                        }
                        o0 o0Var3 = o0Var;
                        h4.r rVar2 = rVarA;
                        l72.l.d(string2, null, null, rVar2, null, false, (e23.a) objQ, o0Var3, 0, 54);
                        i16 = i16;
                        z15 = z15;
                        rVarA = rVar2;
                        o0Var = o0Var3;
                    }
                    boolean z18 = z15;
                    z14 = true;
                    e5.u(o0Var, z18, true, z18);
                } else {
                    z14 = true;
                    o0Var.C(714515299);
                    o0Var.g0(false);
                }
            } else {
                z14 = true;
                o0Var.C(714515299);
                o0Var.g0(false);
            }
            o0Var.g0(z14);
            x1 x1Var3 = n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(iVar, aVar, lVar, i14, 0);
        }
    }

    public static final void c(h4.r rVar, r72.i iVar, w82.a aVar, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-1459816852);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(iVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarA = l.A(rVarF, j92.b.f97899b.f97920e, 0.0f, 2);
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            j.f22691a.getClass();
            z zVarA = y.a(j.f22694d, aVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = k.c(rVarA, o0VarE);
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
            d(rVar, iVar, i(aVar, "details"), o0VarE, i15 & 126, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(rVar, iVar, aVar, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x019c  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:56:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:65:0x01e5  */
    public static final void d(h4.r rVar, r72.i iVar, String str, m mVar, int i14, int i15) {
        h4.r rVar2;
        int i16;
        o0 o0Var;
        h4.r rVar3;
        p3.c<?> cVar;
        h5.g.a.f fVar;
        h4.r rVar4;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        r72.i iVar2 = iVar;
        o0 o0VarE = mVar.E(-732225460);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i16 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        } else {
            rVar2 = rVar;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(iVar2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(str) ? 256 : 128;
        }
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            h4.r rVar5 = i17 != 0 ? h4.r.S : rVar2;
            x1 x1Var = n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarE = u1.n.e(x2.d(aVar, 1.0f), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarC2 = l.C(rVarE, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            z zVarA2 = y.a(kVar, aVar2, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = k.c(rVarC2, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA2, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                g6.f.a aVar4 = g6.f.f75994b;
                float f14 = 8;
                h4.r rVarY = l.y(l.B(rVar5, f14, 56, f14, 24), f14);
                d92.b.f58624b.getClass();
                x0 x0VarB = d92.c.b(j92.f.f97932i, o0VarE);
                d6.h.f57752b.getClass();
                rVar4 = rVar5;
                mh.c(str, rVarY, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, (i16 >> 6) & 14, 0, 130044);
                o0Var = o0VarE;
                bVar.getClass();
                h4.r rVarA = l.A(aVar, eVar.f97920e, 0.0f, 2);
                zVarA = y.a(kVar, h4.d.a.f81536n, o0Var, 0);
                iHashCode = Long.hashCode(o0Var.U);
                i2VarA0 = o0Var.a0();
                rVarC = k.c(rVarA, o0Var);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(aVar3);
                } else {
                    o0Var.c();
                }
                b4.c(eVar2, zVarA, o0Var);
                b4.c(c1623g, i2VarA0, o0Var);
                if (o0Var.T || !s.g(o0Var.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0Var, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0Var);
                iVar2 = iVar;
                r72.f.a(iVar2.f151181d, o0Var, 0);
                o0Var.g0(true);
                o0Var.g0(true);
                rVar3 = rVar4;
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            g6.f.a aVar5 = g6.f.f75994b;
            float f15 = 8;
            h4.r rVarY2 = l.y(l.B(rVar5, f15, 56, f15, 24), f15);
            d92.b.f58624b.getClass();
            x0 x0VarB2 = d92.c.b(j92.f.f97932i, o0VarE);
            d6.h.f57752b.getClass();
            rVar4 = rVar5;
            mh.c(str, rVarY2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB2, o0VarE, (i16 >> 6) & 14, 0, 130044);
            o0Var = o0VarE;
            bVar.getClass();
            h4.r rVarA2 = l.A(aVar, eVar.f97920e, 0.0f, 2);
            zVarA = y.a(kVar, h4.d.a.f81536n, o0Var, 0);
            iHashCode = Long.hashCode(o0Var.U);
            i2VarA0 = o0Var.a0();
            rVarC = k.c(rVarA2, o0Var);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0Var.z();
            if (o0Var.T) {
                o0Var.M(aVar3);
            } else {
                o0Var.c();
            }
            b4.c(eVar2, zVarA, o0Var);
            b4.c(c1623g, i2VarA0, o0Var);
            if (o0Var.T) {
                v.h.A(iHashCode, o0Var, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0Var, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, o0Var);
            iVar2 = iVar;
            r72.f.a(iVar2.f151181d, o0Var, 0);
            o0Var.g0(true);
            o0Var.g0(true);
            rVar3 = rVar4;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar3 = rVar2;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new an1.d((Object) rVar3, (Object) iVar2, str, i14, i15, 19);
        }
    }

    public static final void e(h4.r rVar, r72.i iVar, w82.a aVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        o0 o0VarE = mVar.E(459977952);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(iVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B("current") ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            if (iVar.f151180c) {
                o0VarE.C(-2037262981);
                h4.r.a aVar2 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                l.f(x2.h(aVar2, j92.b.f97899b.f97921f), o0VarE);
                r72.h.a(o0VarE, 0);
                o0VarE.g0(false);
                o0Var = o0VarE;
            } else {
                o0VarE.C(-2037146762);
                String strI = i(aVar, "current");
                g6.f.a aVar3 = g6.f.f75994b;
                float f14 = 8;
                h4.r rVarY = l.y(l.B(rVar, f14, 56, f14, 24), f14);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0 x0VarB = d92.c.b(j92.f.f97932i, o0VarE);
                d6.h.f57752b.getClass();
                mh.c(strI, rVarY, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 130044);
                o0Var = o0VarE;
                r72.f.a(iVar.f151181d, o0Var, 0);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(rVar, iVar, aVar, i14, 2);
        }
    }

    public static final void f(q72.b bVar, r72.i iVar, m mVar, int i14) {
        String str;
        o0 o0VarE = mVar.E(-997464075);
        int i15 = (o0VarE.r(bVar) ? 4 : 2) | i14 | (o0VarE.B(iVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarE = u1.n.e(aVar, tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            d92.b.f58625c.getClass();
            h4.r rVarC = x2.c(l.C(rVarE, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 1.0f);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = k.c(rVarC, o0VarE);
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
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = i53.a.a(o82.g.f130849b, o82.g.f130850c, o82.g.f130851d, o82.g.f130852e, o82.g.f130856i, o82.g.f130857j);
                o0VarE.K(objQ);
            }
            i53.f fVar = (i53.f) objQ;
            n82.f fVarA = n82.j.a(new n82.f.a((o82.g) h0.b0(fVar), null, null, 6, null), null, o0VarE, 2);
            n82.b bVar3 = fVarA.f124961b;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new i();
                o0VarE.K(objQ2);
            }
            q82.c cVar = (q82.c) objQ2;
            h4.r rVarB = b0Var.b(aVar, h4.d.a.f81537o);
            ArrayList arrayList = new ArrayList(p13.y.r(fVar, 10));
            Iterator<E> it = fVar.iterator();
            while (it.hasNext()) {
                switch (c.f143290a[((o82.g) it.next()).ordinal()]) {
                    case 1:
                        str = "Current";
                        break;
                    case 2:
                        str = "1d";
                        break;
                    case 3:
                        str = "7d";
                        break;
                    case 4:
                        str = "2w";
                        break;
                    case 5:
                        str = "4w";
                        break;
                    case 6:
                        str = "Mo";
                        break;
                    case 7:
                        str = "12w";
                        break;
                    case 8:
                        str = "26w";
                        break;
                    case 9:
                        str = "1y";
                        break;
                    case 10:
                        str = "6m";
                        break;
                    case 11:
                        str = "1y (12Mo)";
                        break;
                    default:
                        u0.r();
                        return;
                }
                arrayList.add(new t82.a(str, null, 2, null));
            }
            i53.c cVarE = i53.a.e(arrayList);
            int iIndexOf = fVar.indexOf(bVar3.a());
            boolean zB = o0VarE.B(fVarA);
            Object objQ3 = o0VarE.q();
            if (zB || objQ3 == m.a.f135155b) {
                objQ3 = new f0(fVarA, fVar, 12);
                o0VarE.K(objQ3);
            }
            t82.c.a(cVarE, rVarB, iIndexOf, 0.0f, (e23.l) objQ3, o0VarE, 0, 24);
            if (bVar3.a() != o82.g.f130849b) {
                o0VarE.C(771633068);
                q82.a.a(x2.f(h4.r.S, 1.0f), new n82.n(fVarA, cVar), null, o0VarE, 6, 4);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(771889655);
                o0VarE.g0(false);
            }
            n82.c.a(b0Var.a(h4.r.S, 1.0f, true), fVarA, iVar.f151178a, false, z3.f.c(-1974074099, new i91.e(bVar, 22, iVar, fVarA), o0VarE), o0VarE, 24576, 8);
            o0VarE.g0(true);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new oo0.f(bVar, iVar, i14, 29);
        }
    }

    public static final void g(q72.b bVar, m mVar, int i14) {
        o0 o0Var;
        bVar.getClass();
        o0 o0VarE = mVar.E(-607898506);
        int i15 = (o0VarE.r(bVar) ? 4 : 2) | i14;
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0 b0Var = (b0) objQ;
            Object[] objArr = new Object[0];
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new q(1);
                o0VarE.K(objQ2);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ2, o0VarE, 48);
            mc mcVarF = e9.f(false, null, o0VarE, 0, 3);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new x72.o(context);
                o0VarE.K(objQ3);
            }
            x72.o oVar = (x72.o) objQ3;
            Object[] objArr2 = new Object[0];
            d4.l lVar = x72.p.f189487a;
            boolean zR = o0VarE.r(oVar);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == c2565a) {
                objQ4 = new m72.l(oVar, 1);
                o0VarE.K(objQ4);
            }
            d4.a.f(objArr2, lVar, (e23.a) objQ4, o0VarE, 0);
            z3.e eVarC = z3.f.c(-1959953094, new f(i16, b0Var, p1Var), o0VarE);
            int i17 = k3.f22728a;
            c3 c3VarB = q3.b(o0VarE);
            p3.f22815b.getClass();
            o0Var = o0VarE;
            kb.a(null, eVarC, null, null, null, 0, 0L, 0L, n3.d(c3VarB, p3.f22826m), z3.f.c(-959747323, new mw0.h(b0Var, mcVarF, p1Var, bVar, 8), o0VarE), o0Var, 805306416, 253);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ov1.q(bVar, i14, 19);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0102  */
    /* JADX WARN: Code duplicated, block: B:50:0x010d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0150  */
    /* JADX WARN: Code duplicated, block: B:54:0x0157  */
    /* JADX WARN: Code duplicated, block: B:56:0x015d  */
    /* JADX WARN: Code duplicated, block: B:61:0x017b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0193  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:74:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:75:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ee  */
    public static final void h(r72.i iVar, w82.a<o13.p<List<o>, b63.l>> aVar, e23.l<? super o, Unit> lVar, m mVar, int i14) {
        r72.i iVar2;
        int i15;
        o0 o0Var;
        p3.c<?> cVar;
        h5.g.a.f fVar;
        o13.p<List<o>, b63.l> pVar;
        List<o> list;
        h4.r rVarA;
        boolean z14;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        boolean z15;
        boolean zR;
        Object objQ;
        o0 o0VarE = mVar.E(1497147103);
        p3.c<?> cVar2 = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            iVar2 = iVar;
            i15 = (o0VarE.B(iVar2) ? 4 : 2) | i14;
        } else {
            iVar2 = iVar;
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarE = u1.n.e(x2.d(aVar2, 1.0f), vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81537o;
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            z zVarA2 = y.a(kVar, aVar3, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA2, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                o0Var = o0VarE;
                d(null, iVar2, i(aVar, "weekly"), o0Var, (i16 << 3) & 112, 1);
                pVar = aVar.f183553b;
                if (pVar != null) {
                    list = pVar.f128594a;
                    if (list.isEmpty()) {
                        o0Var.C(-559289971);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(-560013604);
                        j92.b bVar2 = d92.b.f58625c;
                        bVar2.getClass();
                        j92.e eVar2 = j92.b.f97899b;
                        float f14 = eVar2.f97918c;
                        float f15 = eVar2.f97920e;
                        rVarA = l.A(aVar2, 0.0f, f14, 1);
                        bVar2.getClass();
                        bVar2.getClass();
                        float f16 = eVar2.f97918c;
                        bVar2.getClass();
                        bVar2.getClass();
                        h4.r rVarD = l.D(l.B(aVar2, f15, f16, f15, f15));
                        z14 = false;
                        zVarA = y.a(kVar, h4.d.a.f81536n, o0Var, 0);
                        iHashCode = Long.hashCode(o0Var.U);
                        i2VarA0 = o0Var.a0();
                        rVarC = k.c(rVarD, o0Var);
                        if (cVar != null) {
                            p0.l();
                            throw null;
                        }
                        o0Var.z();
                        if (o0Var.T) {
                            o0Var.M(aVar4);
                        } else {
                            o0Var.c();
                        }
                        b4.c(eVar, zVarA, o0Var);
                        b4.c(c1623g, i2VarA0, o0Var);
                        if (o0Var.T || !s.g(o0Var.q(), Integer.valueOf(iHashCode))) {
                            v.h.A(iHashCode, o0Var, iHashCode, bVar);
                        }
                        b4.c(fVar, rVarC, o0Var);
                        o0Var.C(228101530);
                        for (o oVar : list) {
                            String string = oVar.toString();
                            if ((i16 & 896) == 256) {
                                z15 = true;
                            } else {
                                z15 = z14;
                            }
                            zR = z15 | o0Var.r(oVar);
                            objQ = o0Var.q();
                            if (zR) {
                                objQ = new kh0.j(lVar, oVar, 2);
                                o0Var.K(objQ);
                            } else {
                                m.f135153a.getClass();
                                if (objQ == m.a.f135155b) {
                                    objQ = new kh0.j(lVar, oVar, 2);
                                    o0Var.K(objQ);
                                }
                            }
                            o0 o0Var2 = o0Var;
                            h4.r rVar = rVarA;
                            l72.l.d(string, null, null, rVar, null, false, (e23.a) objQ, o0Var2, 0, 54);
                            i16 = i16;
                            rVarA = rVar;
                            o0Var = o0Var2;
                            z14 = z14;
                        }
                        boolean z16 = z14;
                        e5.u(o0Var, z16, true, z16);
                    }
                } else {
                    o0Var.C(-559289971);
                    o0Var.g0(false);
                }
                o0Var.g0(true);
                x1 x1Var2 = n.f135158a;
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            o0Var = o0VarE;
            d(null, iVar2, i(aVar, "weekly"), o0Var, (i16 << 3) & 112, 1);
            pVar = aVar.f183553b;
            if (pVar != null) {
                list = pVar.f128594a;
                if (list.isEmpty()) {
                    o0Var.C(-560013604);
                    j92.b bVar3 = d92.b.f58625c;
                    bVar3.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    float f17 = eVar3.f97918c;
                    float f18 = eVar3.f97920e;
                    rVarA = l.A(aVar2, 0.0f, f17, 1);
                    bVar3.getClass();
                    bVar3.getClass();
                    float f19 = eVar3.f97918c;
                    bVar3.getClass();
                    bVar3.getClass();
                    h4.r rVarD2 = l.D(l.B(aVar2, f18, f19, f18, f18));
                    z14 = false;
                    zVarA = y.a(kVar, h4.d.a.f81536n, o0Var, 0);
                    iHashCode = Long.hashCode(o0Var.U);
                    i2VarA0 = o0Var.a0();
                    rVarC = k.c(rVarD2, o0Var);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0Var.z();
                    if (o0Var.T) {
                        o0Var.M(aVar4);
                    } else {
                        o0Var.c();
                    }
                    b4.c(eVar, zVarA, o0Var);
                    b4.c(c1623g, i2VarA0, o0Var);
                    if (o0Var.T) {
                        v.h.A(iHashCode, o0Var, iHashCode, bVar);
                    } else {
                        v.h.A(iHashCode, o0Var, iHashCode, bVar);
                    }
                    b4.c(fVar, rVarC, o0Var);
                    o0Var.C(228101530);
                    while (r0.hasNext()) {
                        String string2 = oVar.toString();
                        if ((i16 & 896) == 256) {
                            z15 = true;
                        } else {
                            z15 = z14;
                        }
                        zR = z15 | o0Var.r(oVar);
                        objQ = o0Var.q();
                        if (zR) {
                            m.f135153a.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new kh0.j(lVar, oVar, 2);
                                o0Var.K(objQ);
                            }
                        } else {
                            objQ = new kh0.j(lVar, oVar, 2);
                            o0Var.K(objQ);
                        }
                        o0 o0Var3 = o0Var;
                        h4.r rVar2 = rVarA;
                        l72.l.d(string2, null, null, rVar2, null, false, (e23.a) objQ, o0Var3, 0, 54);
                        i16 = i16;
                        rVarA = rVar2;
                        o0Var = o0Var3;
                        z14 = z14;
                    }
                    boolean z17 = z14;
                    e5.u(o0Var, z17, true, z17);
                } else {
                    o0Var.C(-559289971);
                    o0Var.g0(false);
                }
            } else {
                o0Var.C(-559289971);
                o0Var.g0(false);
            }
            o0Var.g0(true);
            x1 x1Var3 = n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(iVar, aVar, lVar, i14, 1);
        }
    }

    public static final <T> String i(w82.a<o13.p<T, b63.l>> aVar, String str) {
        o13.p<T, b63.l> pVar = aVar.f183553b;
        w82.a.InterfaceC3402a interfaceC3402a = aVar.f183552a;
        if (interfaceC3402a instanceof w82.a.InterfaceC3402a.b) {
            if (pVar == null) {
                return am.j.m("Test ", str, " page initial...");
            }
            return "Test " + str + " page initial data:\n" + pVar.f128594a + "\n\nData timestamp:\n" + pVar.f128595b;
        }
        if (interfaceC3402a instanceof w82.a.InterfaceC3402a.c) {
            if (pVar == null) {
                return am.j.m("Test ", str, " page loading...");
            }
            return "Test " + str + " page loading data:\n" + pVar.f128594a + "\n\nData timestamp:\n" + pVar.f128595b;
        }
        if (interfaceC3402a instanceof w82.a.InterfaceC3402a.d) {
            return "Test " + str + " page data:\n" + (pVar != null ? pVar.f128594a : null) + "\n\nData timestamp:\n" + (pVar != null ? pVar.f128595b : null);
        }
        if (!(interfaceC3402a instanceof w82.a.InterfaceC3402a.C3403a)) {
            u0.r();
            return null;
        }
        return "Test " + str + " page data:" + (pVar != null ? pVar.f128594a : null) + "\n\nData timestamp:\n" + (pVar != null ? pVar.f128595b : null) + "\n\nPage failure:\n" + ((w82.a.InterfaceC3402a.C3403a) interfaceC3402a).f183556a;
    }
}
