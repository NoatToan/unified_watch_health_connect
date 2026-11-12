package fv0;

import a42.a0;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.u1;
import c.q;
import c.w;
import c2.j;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import dv0.t;
import e23.l;
import e23.p;
import gl1.y;
import h4.k;
import h5.e0;
import i3.mh;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import l72.p2;
import lc.u0;
import o13.r;
import o53.b0;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.j0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import s5.x0;
import u1.a2;
import wd2.d2;
import wd2.e2;
import wd2.f2;
import wd2.g2;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.sessiondetails.SessionDetailsScreenKt$SessionDetailsScreen$1$1", f = "SessionDetailsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f73638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<g3<ou0.e>> f73639b;

        /* JADX INFO: renamed from: fv0.f$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1489a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f73640a;

            static {
                int[] iArr = new int[fw.p.values().length];
                try {
                    iArr[fw.p.LOADING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[fw.p.SUCCESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[fw.p.ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f73640a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, x3<g3<ou0.e>> x3Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f73638a = context;
            this.f73639b = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f73638a, this.f73639b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            int i14 = C1489a.f73640a[this.f73639b.getF182175a().f35300a.ordinal()];
            if (i14 != 1 && i14 != 2) {
                if (i14 != 3) {
                    u0.r();
                    return null;
                }
                Toast.makeText(this.f73638a, R.string.txt_error_occurred, 0).show();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    public static final void a(boolean z14, l<? super Boolean, Unit> lVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1466789062);
        int i15 = (o0VarE.h(z14) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            p2 p2Var = p2.f111205a;
            String strQ = y.Q(o0VarE, R.string.lbl_extend_session_visibility);
            z3.e eVarC = z3.f.c(-1081015473, new an1.i(z14, 23), o0VarE);
            boolean z15 = ((i15 & 112) == 32) | ((i15 & 14) == 4);
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new ad0.e(lVar, z14, 3);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new ad0.e(lVar, z14, 3);
                    o0VarE.K(objQ);
                }
            }
            p2Var.g(strQ, null, null, null, eVarC, false, false, (e23.a) objQ, o0VarE, 24576, 238);
            String strQ2 = y.Q(o0VarE, R.string.msg_livetrack_extend_option_description);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
            h4.r.a aVar = h4.r.S;
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97917b;
            bVar.getClass();
            mh.c(strQ2, c2.l.z(aVar, eVar.f97920e, f14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c21.a(z14, lVar, i14, 1);
        }
    }

    public static final void b(List<pu0.b> list, boolean z14, Boolean bool, boolean z15, m mVar, int i14) {
        boolean z16;
        o0 o0VarE = mVar.E(1177247515);
        int i15 = (i14 & 6) == 0 ? (o0VarE.r(list) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            z16 = z14;
            i15 |= o0VarE.h(z16) ? 32 : 16;
        } else {
            z16 = z14;
        }
        Boolean bool2 = bool;
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(bool2) ? 256 : 128;
        }
        boolean z17 = z15;
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.h(z17) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            yu0.d dVar = new yu0.d(context);
            for (pu0.b bVar : list) {
                p2.f111205a.f(null, z3.f.c(584110090, new b(z16, context, bVar, z17, dVar, bool2), o0VarE), null, false, false, null, null, o0VarE, 48, 125);
                bool2 = bool;
                z17 = z15;
                context = context;
                dVar = dVar;
                z16 = z14;
            }
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ct1.a(list, z14, bool, z15, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0117  */
    /* JADX WARN: Code duplicated, block: B:66:0x0157  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c0  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(g gVar, ou0.e eVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, m mVar, int i14) {
        String str;
        o0 o0VarE = mVar.E(1811586213);
        int i15 = i14 | (o0VarE.r(gVar) ? 4 : 2) | (o0VarE.r(eVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024) | (o0VarE.r(aVar3) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            p1 p1VarC = s9.c.c(gVar.f73647g, o0VarE);
            h4.r rVarB = a2.b(h4.r.S, a2.a(o0VarE), true);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = k.c(rVarB, o0VarE);
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
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            ou0.e eVar2 = (ou0.e) ((g3) gVar.f73645e.f150540a.getValue()).f35301b;
            if (eVar2 == null || (str = eVar2.f133978a) == null) {
                str = "";
            }
            String str2 = str.equals(gVar.f73643c.getF104144a().g()) ? "" : str;
            boolean z14 = (57344 & i15) == 16384;
            Object objQ = o0VarE.q();
            m.a aVar5 = m.f135153a;
            if (z14) {
                objQ = new eu.a(aVar3, 23);
                o0VarE.K(objQ);
            } else {
                aVar5.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new eu.a(aVar3, 23);
                    o0VarE.K(objQ);
                }
            }
            e(0, (e23.a) objQ, str2, o0VarE);
            if (gl.b.N((ou0.d) p1VarC.getF182175a())) {
                o0VarE.C(1571537060);
                ou0.f fVar = eVar.f133979b;
                boolean zG = fVar != null ? s.g(fVar.f133986d, Boolean.TRUE) : false;
                boolean zR = o0VarE.r(gVar);
                Object objQ2 = o0VarE.q();
                if (zR) {
                    objQ2 = new e(gVar, 0);
                    o0VarE.K(objQ2);
                } else {
                    aVar5.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new e(gVar, 0);
                        o0VarE.K(objQ2);
                    }
                }
                a(zG, (l) objQ2, o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1571755207);
                o0VarE.g0(false);
            }
            ou0.f fVar2 = eVar.f133979b;
            ou0.d dVar = (ou0.d) p1VarC.getF182175a();
            Boolean bool = dVar != null ? dVar.f133974a : null;
            su0.h.f160962a.getClass();
            int iD = su0.h.d();
            boolean z15 = (i15 & 896) == 256;
            Object objQ3 = o0VarE.q();
            if (z15) {
                objQ3 = new eu.a(aVar, 24);
                o0VarE.K(objQ3);
            } else {
                aVar5.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new eu.a(aVar, 24);
                    o0VarE.K(objQ3);
                }
            }
            e23.a aVar6 = (e23.a) objQ3;
            boolean z16 = (i15 & 7168) == 2048;
            Object objQ4 = o0VarE.q();
            if (z16) {
                objQ4 = new eu.a(aVar2, 25);
                o0VarE.K(objQ4);
            } else {
                aVar5.getClass();
                if (objQ4 == m.a.f135155b) {
                    objQ4 = new eu.a(aVar2, 25);
                    o0VarE.K(objQ4);
                }
            }
            f(eVar, fVar2, bool, iD, aVar6, (e23.a) objQ4, o0VarE, (i15 >> 3) & 14);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new et.p(gVar, eVar, (e23.a) aVar, (e23.a) aVar2, (e23.a) aVar3, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0099  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:46:0x0115  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(gv0.d dVar, long j8, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, m mVar, int i14) {
        dVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(-1052256837);
        int i15 = i14 | (o0VarE.r(dVar) ? 4 : 2) | (o0VarE.l(j8) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024) | (o0VarE.r(aVar3) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objA = o0VarE.A(c.n.f22332a);
            objA.getClass();
            b.g gVar = (b.g) objA;
            boolean z14 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            m.a aVar4 = m.f135153a;
            if (z14) {
                objQ = new a90.b(j8, 4);
                o0VarE.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a90.b(j8, 4);
                    o0VarE.K(objQ);
                }
            }
            o0VarE.L(-1614864554);
            u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(g.class), gVar.getF189591b(), null, CreationExtrasExtKt.defaultExtras(gVar), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), (e23.a) objQ);
            o0VarE.g0(false);
            g gVar2 = (g) u1VarResolveViewModel;
            p1 p1VarC = s9.c.c(gVar2.f73645e, o0VarE);
            g.h hVar = new g.h();
            boolean zR = o0VarE.r(dVar);
            Object objQ2 = o0VarE.q();
            if (zR) {
                objQ2 = new bv0.n(dVar, 4);
                o0VarE.K(objQ2);
            } else {
                aVar4.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new bv0.n(dVar, 4);
                    o0VarE.K(objQ2);
                }
            }
            q qVarC = w.c(hVar, (l) objQ2, o0VarE, 0);
            fw.p pVar = ((g3) p1VarC.getF182175a()).f35300a;
            boolean zB = o0VarE.B(p1VarC) | o0VarE.r(context);
            Object objQ3 = o0VarE.q();
            if (zB) {
                objQ3 = new a(context, p1VarC, null);
                o0VarE.K(objQ3);
            } else {
                aVar4.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new a(context, p1VarC, null);
                    o0VarE.K(objQ3);
                }
            }
            l0.e((p) objQ3, pVar, o0VarE);
            gl1.d.b(y.Q(o0VarE, R.string.lbl_session_details), aVar3, ((g3) p1VarC.getF182175a()).f35300a == fw.p.LOADING, null, null, null, z3.f.c(269936585, new ak0.h((Object) p1VarC, (Object) gVar2, (Object) aVar2, context, (Object) qVarC, (Object) aVar, 8), o0VarE), o0VarE, ((i15 >> 9) & 112) | 1572864, 56);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c42.e(dVar, j8, aVar, aVar2, aVar3, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c6  */
    public static final void e(int i14, e23.a aVar, String str, m mVar) {
        boolean z14;
        String str2 = str;
        o0 o0VarE = mVar.E(-1386900623);
        int i15 = i14 | (o0VarE.B(str2) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            int length = str2.length();
            m.a aVar2 = m.f135153a;
            if (length == 0) {
                o0VarE.C(429072654);
                p2 p2Var = p2.f111205a;
                String strQ = y.Q(o0VarE, R.string.live_tracking_session_name);
                h4.r.a aVar3 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarC = c2.l.C(aVar3, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                z14 = (i15 & 112) == 32;
                Object objQ = o0VarE.q();
                if (z14) {
                    objQ = new eu.a(aVar, 20);
                    o0VarE.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new eu.a(aVar, 20);
                        o0VarE.K(objQ);
                    }
                }
                p2Var.g(strQ, rVarC, null, null, null, false, false, (e23.a) objQ, o0VarE, 0, 252);
                o0VarE.g0(false);
            } else {
                o0VarE.C(429302612);
                p2 p2Var2 = p2.f111205a;
                String strQ2 = y.Q(o0VarE, R.string.live_tracking_session_name);
                z14 = (i15 & 112) == 32;
                Object objQ2 = o0VarE.q();
                if (z14) {
                    objQ2 = new eu.a(aVar, 22);
                    o0VarE.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new eu.a(aVar, 22);
                        o0VarE.K(objQ2);
                    }
                }
                p2Var2.h(strQ2, str2, null, null, null, false, false, null, null, null, (e23.a) objQ2, o0VarE, (i15 << 3) & 112, 0, 1020);
                o0VarE.g0(false);
            }
            String strQ3 = y.Q(o0VarE, R.string.msg_create_livetrack_session_name);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
            h4.r.a aVar4 = h4.r.S;
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97917b;
            float f15 = eVar.f97920e;
            bVar.getClass();
            bVar.getClass();
            bVar.getClass();
            mh.c(strQ3, c2.l.B(aVar4, f15, f14, f15, f15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
        } else {
            str2 = str2;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ao1.g(str2, aVar, i14, 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:157:0x030e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r33v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r34v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r35v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v31, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r9v32, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v33, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r9v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v35, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r9v36, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    public static final void f(ou0.e eVar, ou0.f fVar, Boolean bool, int i14, e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i15) {
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        boolean z14;
        Map<f2, List<d2>> map;
        boolean z15;
        boolean z16;
        int i16;
        g2 g2Var;
        ou0.b bVar;
        String strJ;
        d2 d2Var;
        List<pu0.a> list;
        List<d2> list2;
        Object next;
        o0 o0VarE = mVar.E(-45135794);
        int i17 = (i15 & 6) == 0 ? (o0VarE.r(eVar) ? 4 : 2) | i15 : i15;
        if ((i15 & 48) == 0) {
            i17 |= o0VarE.r(fVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= o0VarE.B(bool) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= o0VarE.k(i14) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i17 |= o0VarE.r(aVar) ? 16384 : 8192;
        }
        if ((196608 & i15) == 0) {
            i17 |= o0VarE.r(aVar2) ? 131072 : 65536;
        }
        if (o0VarE.n(i17 & 1, (74899 & i17) != 74898)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Map<f2, List<d2>> map2 = eVar.f133980c;
            List<pu0.b> list3 = eVar.f133981d;
            boolean z17 = map2 != null && map2.containsKey(f2.c.f184465c);
            boolean z18 = map2 != null && map2.containsKey(f2.d.f184466c);
            if (list3 != null) {
                arrayList = new ArrayList();
                for (Object obj : list3) {
                    if (og.a.B((pu0.b) obj).length() > 0) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = 0;
            }
            if (arrayList == 0) {
                arrayList = j0.f134944a;
            }
            ?? r34 = arrayList;
            if (list3 != null) {
                arrayList2 = new ArrayList();
                for (Object obj2 : list3) {
                    if (og.a.K((pu0.b) obj2).length() > 0) {
                        arrayList2.add(obj2);
                    }
                }
            } else {
                arrayList2 = 0;
            }
            if (arrayList2 == 0) {
                arrayList2 = j0.f134944a;
            }
            ?? r35 = arrayList2;
            if (list3 != null) {
                arrayList3 = new ArrayList();
                for (Object obj3 : list3) {
                    if (og.a.I((pu0.b) obj3).length() > 0) {
                        arrayList3.add(obj3);
                    }
                }
            } else {
                arrayList3 = 0;
            }
            if (arrayList3 == 0) {
                arrayList3 = j0.f134944a;
            }
            ?? r36 = arrayList3;
            boolean z19 = (((Collection) r34).isEmpty() && ((Collection) r35).isEmpty() && ((Collection) r36).isEmpty()) ? false : true;
            if (s.g(fVar != null ? fVar.f133984b : null, ou0.b.c.f133963a)) {
                z14 = false;
            } else {
                f2.d dVar = f2.d.f184466c;
                e2.d dVar2 = e2.d.f184448a;
                dVar.getClass();
                dVar2.getClass();
                if (map2 == null || (list2 = map2.get(dVar)) == null) {
                    d2Var = null;
                } else {
                    Iterator it = list2.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!s.g(((d2) next).f184431a, dVar2));
                    d2Var = (d2) next;
                }
                if (d2Var != null || (list = eVar.f133982e) == null || list.isEmpty()) {
                    z14 = false;
                } else {
                    z14 = true;
                }
            }
            if (z19) {
                o0VarE.C(-314343520);
                String upperCase = y.Q(o0VarE, R.string.lbl_shared_with).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0 x0VarF = d92.c.f(j92.f.f97934k, o0VarE);
                h4.r.a aVar3 = h4.r.S;
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar2 = j92.b.f97899b;
                float f14 = eVar2.f97917b;
                bVar2.getClass();
                h4.r rVarZ = c2.l.z(aVar3, eVar2.f97920e, f14);
                z15 = z18;
                map = map2;
                z16 = false;
                mh.c(upperCase, rVarZ, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
                int i18 = (i17 & 896) | 3072;
                boolean z24 = z17;
                b(r36, z24, bool, true, o0VarE, i18);
                b(r34, z24, bool, false, o0VarE, i18);
                b(r35, z24, bool, false, o0VarE, i18);
                o0VarE.g0(false);
            } else {
                map = map2;
                z15 = z18;
                z16 = false;
                o0VarE.C(-313770764);
                o0VarE.g0(false);
            }
            if (z14) {
                o0VarE.C(-313699030);
                p2 p2Var = p2.f111205a;
                h4.r.a aVar4 = h4.r.S;
                d92.b.f58623a.getClass();
                j92.b bVar3 = d92.b.f58625c;
                bVar3.getClass();
                j92.e eVar3 = j92.b.f97899b;
                float f15 = eVar3.f97920e;
                float f16 = eVar3.f97920e;
                h4.r rVarC = c2.l.C(aVar4, 0.0f, f15, 0.0f, 0.0f, 13);
                String strQ = y.Q(o0VarE, R.string.lbl_group_track);
                if (fVar != null) {
                    o0VarE = o0VarE;
                    bVar = fVar.f133984b;
                } else {
                    o0VarE = o0VarE;
                    bVar = null;
                }
                x1 x1Var2 = n.f135158a;
                if (s.g(bVar, ou0.b.a.f133961a)) {
                    i16 = i17;
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1654283672, R.string.lbl_visible_to_following_all, o0VarE, false);
                } else {
                    i16 = i17;
                    if (s.g(bVar, ou0.b.C2540b.f133962a)) {
                        o0VarE.C(-1654280696);
                        strJ = lv0.b.a(o0VarE, i14);
                        o0VarE.g0(false);
                    } else {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1654278477, R.string.lbl_off, o0VarE, false);
                    }
                }
                z3.e eVarC = z3.f.c(-71737971, new c(context, 1, z15), o0VarE);
                boolean z25 = (i16 & 57344) == 16384;
                Object objQ = o0VarE.q();
                if (z25) {
                    objQ = new eu.a(aVar, 26);
                    o0VarE.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new eu.a(aVar, 26);
                        o0VarE.K(objQ);
                    }
                }
                o0 o0Var = o0VarE;
                p2Var.h(strQ, strJ, null, rVarC, null, false, false, null, eVarC, null, (e23.a) objQ, o0Var, 100663296, 0, 756);
                String strQ2 = y.Q(o0Var, R.string.lbl_share_livetrack_location);
                d92.b.f58624b.getClass();
                x0 x0VarF2 = d92.c.f(j92.f.f97933j, o0Var);
                bVar3.getClass();
                float f17 = eVar3.f97917b;
                org.apache.commons.lang3.e.j(bVar3);
                mh.c(strQ2, c2.l.B(aVar4, f16, f17, f16, f16), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF2, o0Var, 0, 0, 131068);
                o0VarE = o0Var;
                o0VarE.g0(false);
            } else {
                i16 = i17;
                o0VarE.C(-312244076);
                o0VarE.g0(z16);
            }
            if (fVar != null) {
                o0VarE = o0VarE;
                g2Var = fVar.f133985c;
            } else {
                o0VarE = o0VarE;
                g2Var = null;
            }
            if (s.g(g2Var, g2.b.f184481a)) {
                o0VarE.C(-312162949);
                Map<f2, List<d2>> map3 = map;
                g(map3 != null && map3.containsKey(f2.e.f184467c), aVar2, o0VarE, (i16 >> 12) & 112);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-311985164);
                o0VarE.g0(false);
            }
            x1 x1Var3 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a0(eVar, fVar, bool, i14, aVar, aVar2, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    public static final void g(boolean z14, e23.a<Unit> aVar, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(349657964);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.h(z14) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p2 p2Var = p2.f111205a;
            String strQ = y.Q(o0VarE, R.string.lbl_strava_for_garmin);
            z3.e eVarC = z3.f.c(-1864489353, new c(context, 0, z14), o0VarE);
            boolean z15 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new eu.a(aVar, 21);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new eu.a(aVar, 21);
                    o0VarE.K(objQ);
                }
            }
            p2Var.g(strQ, null, null, null, eVarC, false, false, (e23.a) objQ, o0VarE, 24576, 238);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t(z14, aVar, i14, 1, (byte) 0);
        }
    }
}
