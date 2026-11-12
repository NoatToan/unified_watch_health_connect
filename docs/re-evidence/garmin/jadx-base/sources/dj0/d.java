package dj0;

import a11.g0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.y1;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import d81.t;
import e23.p;
import h5.e0;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import l72.f0;
import o13.r;
import o4.m1;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.x;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import s5.x0;
import u1.w;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.ftp.reports.presentation.composables.screen.CurrentFtpScreenKt$CurrentFtpScreen$1$3$1$1$1", f = "CurrentFtpScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<yi0.c, Unit> f59908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ yi0.c f59909b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super yi0.c, Unit> lVar, yi0.c cVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f59908a = lVar;
            this.f59909b = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f59908a, this.f59909b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f59908a.invoke(this.f59909b);
            return Unit.INSTANCE;
        }
    }

    public static final void a(String str, String str2, String str3, String str4, p3.m mVar, int i14) {
        String str5;
        int i15;
        o0 o0Var;
        char c14;
        o0 o0VarE = mVar.E(1963878472);
        if ((i14 & 6) == 0) {
            str5 = str;
            i15 = (o0VarE.B(str5) ? 4 : 2) | i14;
        } else {
            str5 = str;
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str3) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(str4) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarE = u1.n.e(aVar, am.j.A(d92.b.f58623a, o0VarE), m1.f128891a);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarY = c2.l.y(rVarE, eVar.f97920e);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new t(14);
                o0VarE.K(objQ);
            }
            h4.r rVarC = v.c((e23.l) objQ, rVarY, true);
            c2.j jVar = c2.j.f22691a;
            bVar.getClass();
            float f14 = eVar.f97918c;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(iVarI, h4.d.a.f81534l, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
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
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            h4.r rVarA = u2Var.a(aVar, 0.5f, true);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0Var = j92.f.f97932i;
            mh.c(str5, rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, i15 & 14, 0, 131068);
            h4.r rVarA2 = u2Var.a(aVar, 0.2f, true);
            boolean z14 = (((i15 & 896) ^ 384) > 256 && o0VarE.B(str3)) || (i15 & 384) == 256;
            Object objQ2 = o0VarE.q();
            if (z14 || objQ2 == c2565a) {
                c14 = 14;
                objQ2 = new cq.t(str3, 14);
                o0VarE.K(objQ2);
            } else {
                c14 = 14;
            }
            h4.r rVarC3 = v.c((e23.l) objQ2, rVarA2, false);
            fVar.getClass();
            mh.c(str2, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, (i15 >> 3) & 14, 0, 131068);
            h4.r rVarA3 = u2Var.a(aVar, 0.2f, true);
            fVar.getClass();
            mh.c(str4, rVarA3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, (i15 >> 9) & 14, 0, 131068);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(i14, str, str2, str3, str4);
        }
    }

    public static final void b(h4.r rVar, yi0.c cVar, String str, String str2, String str3, String str4, p3.m mVar, int i14) {
        int i15;
        String str5;
        yi0.c cVar2;
        o0 o0VarE = mVar.E(-2131683378);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.k(cVar.ordinal()) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            str5 = str2;
            i15 |= o0VarE.B(str5) ? 2048 : 1024;
        } else {
            str5 = str2;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(str3) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.B(str4) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            h4.r rVarD = x2.d(rVar, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r.a aVar2 = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarY = c2.l.y(aVar2, j92.b.f97899b.f97920e);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_based_on);
            d92.b.f58624b.getClass();
            mh.c(strQ, rVarY, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, 0, 0, 131068);
            cVar2 = cVar;
            String strT = gl1.d.T(cVar2.f197343e, o0VarE, 0);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new t(10);
                o0VarE.K(objQ);
            }
            int i16 = i15;
            o0VarE = o0VarE;
            a(strT, str, oi0.c.A(context, (e23.l) objQ, str), str5, o0VarE, ((i15 >> 3) & 112) | (i15 & 7168));
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_weight);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new t(11);
                o0VarE.K(objQ2);
            }
            a(strQ2, str3, oi0.c.A(context, (e23.l) objQ2, str3), str4, o0VarE, ((i16 >> 9) & 112) | ((i16 >> 6) & 7168));
            o0VarE.g0(true);
        } else {
            cVar2 = cVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g0(rVar, (Object) cVar2, str, str2, str3, (Object) str4, i14, 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:79:0x0208  */
    public static final void c(gj0.a aVar, yi0.c cVar, e23.l<? super yi0.c, Unit> lVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, p3.m mVar, int i14) {
        boolean z14;
        i53.d<yi0.c, gj0.e> dVar;
        gj0.a aVar4 = aVar;
        lVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(-1160067748);
        int i15 = i14 | (o0VarE.B(aVar4) ? 4 : 2) | (o0VarE.k(cVar == null ? -1 : cVar.ordinal()) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024) | (o0VarE.r(aVar3) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar5 = h4.r.S;
            h4.r rVarD = x2.d(aVar5, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar6 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = y.a(c2.j.f22694d, aVar6, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar7 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar7);
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
            if ((aVar4 != null ? aVar4.f77487a : null) != null) {
                i53.d<yi0.c, gj0.e> dVar2 = aVar4.f77487a;
                if (dVar2.size() > 1) {
                    o0VarE.C(-1448673378);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(c2.l.C(aVar5, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), o0VarE);
                    y1 y1Var = y1.f16902a;
                    o0VarE.C(-739463145);
                    Set<yi0.c> setKeySet = dVar2.keySet();
                    ArrayList arrayList = new ArrayList(p13.y.r(setKeySet, 10));
                    Iterator<T> it = setKeySet.iterator();
                    while (it.hasNext()) {
                        arrayList.add(gl1.y.Q(o0VarE, ((yi0.c) it.next()).f197342d));
                    }
                    o0VarE.g0(false);
                    i53.c<String> cVarE = i53.a.e(arrayList);
                    Iterator<T> it3 = dVar2.keySet().iterator();
                    int i16 = 0;
                    while (true) {
                        if (!it3.hasNext()) {
                            i16 = -1;
                            break;
                        }
                        Object next = it3.next();
                        if (i16 < 0) {
                            x.q();
                            throw null;
                        }
                        if (((yi0.c) next) == cVar) {
                            break;
                        } else {
                            i16++;
                        }
                    }
                    int i17 = i16 < 0 ? 0 : i16;
                    aVar4 = aVar;
                    z3.e eVarC = z3.f.c(-684394923, new a42.y(18, aVar2, aVar, aVar3, lVar), o0VarE);
                    y1 y1Var2 = y1.f16902a;
                    z14 = true;
                    y1Var.c(cVarE, i17, false, true, true, 0L, 0L, eVarC, o0VarE, 12610560, 100);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                } else {
                    z14 = true;
                    if (aVar4 != null) {
                        dVar = aVar4.f77487a;
                    } else {
                        dVar = null;
                    }
                    if (dVar != null || dVar.isEmpty()) {
                        o0VarE.C(-1446915833);
                        n.a(null, o0VarE, 0);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-1447332752);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        d((yi0.c) h0.a0(aVar4.f77487a.keySet()), (gj0.e) h0.a0(aVar4.f77487a.values()), c2.l.C(aVar5, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13), aVar2, aVar3, o0VarE, i15 & 64512);
                        o0VarE.g0(false);
                    }
                }
            } else {
                z14 = true;
                if (aVar4 != null) {
                    dVar = aVar4.f77487a;
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    o0VarE.C(-1446915833);
                    n.a(null, o0VarE, 0);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1446915833);
                    n.a(null, o0VarE, 0);
                    o0VarE.g0(false);
                }
            }
            o0VarE.g0(z14);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.z((Object) aVar4, (Object) cVar, (e23.l) lVar, (e23.a) aVar2, (e23.a) aVar3, i14, 22);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0138  */
    /* JADX WARN: Code duplicated, block: B:81:0x02ef  */
    public static final void d(yi0.c cVar, gj0.e eVar, h4.r rVar, e23.a aVar, e23.a aVar2, p3.m mVar, int i14) {
        yi0.c cVar2;
        boolean z14;
        boolean z15;
        j92.e eVar2;
        boolean z16;
        float f14;
        boolean z17;
        h4.r rVar2;
        boolean z18;
        o0 o0VarE = mVar.E(-1582196502);
        int i15 = i14 | (o0VarE.k(cVar.ordinal()) ? 4 : 2) | (o0VarE.B(eVar) ? 32 : 16) | (o0VarE.B(rVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            h4.r rVarF = x2.f(rVar, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81537o;
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar3 = j92.b.f97899b;
            float f15 = eVar3.f97918c;
            float f16 = eVar3.f97920e;
            jVar.getClass();
            z zVarA = y.a(c2.j.i(f15), aVar3, o0VarE, 48);
            Context context2 = context;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
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
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            String str = eVar.f77497a;
            p3.m.a aVar5 = p3.m.f135153a;
            if (str == null) {
                o0VarE.C(-275736283);
                o0VarE.g0(false);
                z16 = false;
                f14 = f16;
                eVar2 = eVar3;
                z15 = true;
            } else {
                o0VarE.C(-275736282);
                h4.r.a aVar6 = h4.r.S;
                bVar.getClass();
                h4.r rVarA = c2.l.A(aVar6, f16, 0.0f, 2);
                boolean zR = ((i15 & 112) == 32) | o0VarE.r(context2);
                Object objQ = o0VarE.q();
                if (zR) {
                    z14 = true;
                    objQ = new bj0.e(eVar, context2, 1);
                    o0VarE.K(objQ);
                } else {
                    aVar5.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        z14 = true;
                        objQ = new bj0.e(eVar, context2, 1);
                        o0VarE.K(objQ);
                    } else {
                        z14 = true;
                    }
                }
                h4.r rVarC2 = v.c((e23.l) objQ, rVarA, false);
                context2 = context2;
                String str2 = eVar.f77497a;
                d92.b.f58624b.getClass();
                x0 x0VarE = d92.c.e(d92.c.b(j92.f.f97932i, o0VarE));
                d6.h.f57752b.getClass();
                z15 = z14;
                eVar2 = eVar3;
                z16 = false;
                f14 = f16;
                mh.c(str2, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarE, o0VarE, 0, 0, 130044);
                o0VarE = o0VarE;
                Unit unit = Unit.INSTANCE;
                o0VarE.g0(false);
            }
            h4.r.a aVar7 = h4.r.S;
            bVar.getClass();
            h4.r rVarA2 = c2.l.A(aVar7, f14, 0.0f, 2);
            String str3 = eVar.f77498b;
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
            d6.h.f57752b.getClass();
            int i16 = d6.h.f57755e;
            o0 o0Var = o0VarE;
            mh.c(str3, rVarA2, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0VarF, o0Var, 0, 0, 130044);
            o0VarE = o0Var;
            if (eVar.f77500d.isEmpty()) {
                z17 = z15;
                j92.e eVar4 = eVar2;
                o0VarE.C(-273651749);
                bVar.getClass();
                h4.r rVarC3 = c2.l.C(aVar7, 0.0f, eVar4.f97923h, 0.0f, 0.0f, 13);
                bVar.getClass();
                h4.r rVarA3 = c2.l.A(rVarC3, f14, 0.0f, 2);
                Context context3 = context2;
                boolean zR2 = ((i15 & 112) != 32 ? z16 : z17) | o0VarE.r(context3);
                Object objQ2 = o0VarE.q();
                if (zR2) {
                    objQ2 = new bj0.e(eVar, context3, 2);
                    o0VarE.K(objQ2);
                } else {
                    aVar5.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new bj0.e(eVar, context3, 2);
                        o0VarE.K(objQ2);
                    }
                }
                h4.r rVarC4 = v.c((e23.l) objQ2, rVarA3, z16);
                String str4 = eVar.f77506j;
                fVar.getClass();
                mh.c(str4, rVarC4, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97928e, o0VarE), o0VarE, 0, 0, 130044);
                o0VarE = o0VarE;
                if (eVar.f77507k == null) {
                    o0VarE.C(-273027224);
                    o0VarE.g0(z16);
                } else {
                    o0VarE.C(-273027223);
                    bVar.getClass();
                    h4.r rVarC5 = c2.l.C(aVar7, 0.0f, 0.0f, 0.0f, eVar4.f97923h, 7);
                    bVar.getClass();
                    h4.r rVarA4 = c2.l.A(rVarC5, f14, 0.0f, 2);
                    String str5 = eVar.f77507k;
                    fVar.getClass();
                    mh.c(str5, rVarA4, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97935l, o0VarE), o0VarE, 0, 0, 130044);
                    o0VarE = o0VarE;
                    Unit unit2 = Unit.INSTANCE;
                    o0VarE.g0(z16);
                }
                if (eVar.f77501e) {
                    o0VarE.C(-272569756);
                    cVar2 = cVar;
                    rVar2 = null;
                    f(cVar2.f197342d, (i15 >> 3) & 896, aVar, null, o0VarE);
                    o0VarE.g0(z16);
                } else {
                    rVar2 = null;
                    cVar2 = cVar;
                    o0VarE.C(-272375634);
                    o0VarE.g0(z16);
                }
                if (eVar.f77502f) {
                    o0VarE.C(-272313386);
                    e((i15 >> 9) & 112, aVar2, rVar2, o0VarE);
                    o0VarE.g0(z16);
                } else {
                    o0VarE.C(-272228818);
                    o0VarE.g0(z16);
                }
                o0VarE.g0(z16);
            } else {
                o0VarE.C(-274816760);
                boolean z19 = (eVar.f77508l == null || eVar.f77510n == null || eVar.f77509m == null || eVar.f77511o == null) ? z16 : z15;
                bVar.getClass();
                h4.r rVarC6 = c2.l.C(aVar7, 0.0f, eVar2.f97918c, 0.0f, 0.0f, 13);
                bVar.getClass();
                j92.e eVar5 = eVar2;
                boolean z24 = z16;
                z17 = z15;
                bj0.f.a(eVar, c2.l.A(rVarC6, f14, 0.0f, 2), 0.0f, 0.0f, o0VarE, (i15 >> 3) & 14);
                if (z19) {
                    o0VarE.C(-274204913);
                    bVar.getClass();
                    z18 = z24;
                    b(c2.l.C(aVar7, 0.0f, eVar5.f97920e, 0.0f, 0.0f, 13), cVar, eVar.f77508l, eVar.f77509m, eVar.f77510n, eVar.f77511o, o0VarE, (i15 << 3) & 112);
                    o0VarE.g0(z18);
                } else {
                    z18 = z24;
                    o0VarE.C(-273713842);
                    o0VarE.g0(z18);
                }
                o0VarE.g0(z18);
                cVar2 = cVar;
            }
            o0VarE.g0(z17);
        } else {
            cVar2 = cVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.z((Object) cVar2, (Object) eVar, (Object) rVar, (Object) aVar, (Object) aVar2, i14, 23);
        }
    }

    public static final void e(int i14, e23.a aVar, h4.r rVar, p3.m mVar) {
        o0 o0Var;
        h4.r rVar2;
        o0 o0VarE = mVar.E(563252059);
        int i15 = i14 | 6;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            h4.r.a aVar2 = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarA = c2.l.A(aVar2, j92.b.f97899b.f97920e, 0.0f, 2);
            String strQ = gl1.y.Q(o0VarE, R.string.message_add_weight_info);
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
            d6.h.f57752b.getClass();
            o0Var = o0VarE;
            mh.c(strQ, rVarA, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF, o0Var, 0, 0, 130044);
            f0.a.f111000a.f(gl1.y.Q(o0Var, R.string.lbl_add_weigh_in), null, false, aVar, o0Var, (i15 << 6) & 7168, 6);
            rVar2 = aVar2;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ba2.g(rVar2, aVar, i14, 1, (byte) 0);
        }
    }

    public static final void f(int i14, int i15, e23.a aVar, h4.r rVar, p3.m mVar) {
        e23.a aVar2;
        h4.r rVar2;
        o0 o0VarE = mVar.E(-1058437086);
        int i16 = i15 | 6;
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.k(i14) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            aVar2 = aVar;
            i16 |= o0VarE.r(aVar2) ? 256 : 128;
        } else {
            aVar2 = aVar;
        }
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            h4.r.a aVar3 = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(aVar3, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar4 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = y.a(c2.j.f22694d, aVar4, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r rVarD = w.d(aVar3, false, null, null, aVar2, 15);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarY = c2.l.y(rVarD, j92.b.f97899b.f97918c);
            String strP = gl1.y.P(R.string.lbl_sport_type_update_ftp, new Object[]{gl1.y.Q(o0VarE, i14)}, o0VarE);
            d92.b.f58624b.getClass();
            x0 x0VarA = x0.a(d92.c.e(j92.f.f97933j), hb.a.e(o0VarE), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
            d6.h.f57752b.getClass();
            mh.c(strP, rVarY, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarA, o0VarE, 0, 0, 130044);
            o0VarE.g0(true);
            rVar2 = aVar3;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(rVar2, i14, aVar, i15, 0);
        }
    }
}
