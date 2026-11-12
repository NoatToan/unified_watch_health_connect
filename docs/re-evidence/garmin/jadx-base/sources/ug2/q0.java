package ug2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import b82.y1;
import c2.h2;
import c2.k3;
import c2.n3;
import c2.q3;
import c2.x2;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import f5.z0;
import i3.e9;
import i3.fe;
import i3.kb;
import i3.mc;
import i3.ve;
import kotlin.t1;
import l72.c1;
import o4.m1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.n1;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;
import p3.y3;
import r1.l2;
import r1.o2;
import r1.s1;
import r1.v1;
import s1.b2;
import ty1.g2;
import ty1.q1;

/* JADX INFO: loaded from: classes11.dex */
public final class q0 {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ug2/q0$a", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements p3.h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f170920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Integer f170921b;

        public a(Activity activity, Integer num) {
            this.f170920a = activity;
            this.f170921b = num;
        }

        @Override // p3.h0
        public final void dispose() {
            Activity activity = this.f170920a;
            if (activity != null) {
                Integer num = this.f170921b;
                activity.setRequestedOrientation(num != null ? num.intValue() : -1);
            }
        }
    }

    public static final void a(e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(2145213315);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            c1.f110940a.a(false, gl1.y.Q(o0VarE, R.string.lbl_discard_activity), gl1.y.Q(o0VarE, R.string.msg_discard_activity), null, null, gl1.y.Q(o0VarE, R.string.lbl_discard), true, false, aVar, gl1.y.Q(o0VarE, R.string.lbl_cancel), aVar2, o0VarE, ((i15 << 24) & 234881024) | 1572870, 6, SyslogConstants.LOG_LOCAL3);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new nw0.l(aVar, aVar2, i14, 15);
        }
    }

    public static final void b(h4.r rVar, z3.e eVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-272884532);
        int i15 = 2;
        int i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            i3.d0.f87812a.getClass();
            h4.r rVarG = c2.l.G(rVar, i3.d0.a(o0VarE));
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarG, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
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
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            eVar.invoke(c2.b0.f22601a, o0VarE, 54);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hw1.c(rVar, eVar, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x03d7  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final z3.e eVar, final e23.l lVar, final e23.l lVar2, p3.m mVar, int i14) {
        ag2.e eVarA;
        wg2.g gVar;
        Object e0Var;
        p3.m.a.C2565a c2565a;
        p1 p1Var;
        p1 p1Var2;
        lc.m0 m0Var;
        r0 r0Var;
        lVar.getClass();
        lVar2.getClass();
        p3.o0 o0VarE = mVar.E(-607617156);
        int i15 = i14 | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(lVar2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            v9.a.f176280a.getClass();
            ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
            if (viewModelStoreOwnerA == null) {
                vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            CreationExtras defaultViewModelCreationExtras = viewModelStoreOwnerA instanceof androidx.lifecycle.y ? ((androidx.lifecycle.y) viewModelStoreOwnerA).getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c;
            p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
            r0 r0Var2 = (r0) v9.b.a(t0Var.b(r0.class), viewModelStoreOwnerA, null, null, defaultViewModelCreationExtras, o0VarE);
            ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(o0VarE);
            if (viewModelStoreOwnerA2 == null) {
                vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            final rg2.h hVar = (rg2.h) v9.b.a(t0Var.b(rg2.h.class), viewModelStoreOwnerA2, null, null, viewModelStoreOwnerA2 instanceof androidx.lifecycle.y ? ((androidx.lifecycle.y) viewModelStoreOwnerA2).getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c, o0VarE);
            ViewModelStoreOwner viewModelStoreOwnerA3 = v9.a.a(o0VarE);
            if (viewModelStoreOwnerA3 == null) {
                vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            wg2.g gVar2 = (wg2.g) v9.b.a(t0Var.b(wg2.g.class), viewModelStoreOwnerA3, null, null, viewModelStoreOwnerA3 instanceof androidx.lifecycle.y ? ((androidx.lifecycle.y) viewModelStoreOwnerA3).getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c, o0VarE);
            ViewModelStoreOwner viewModelStoreOwnerA4 = v9.a.a(o0VarE);
            if (viewModelStoreOwnerA4 == null) {
                vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            final yg2.h hVar2 = (yg2.h) v9.b.a(t0Var.b(yg2.h.class), viewModelStoreOwnerA4, null, null, viewModelStoreOwnerA4 instanceof androidx.lifecycle.y ? ((androidx.lifecycle.y) viewModelStoreOwnerA4).getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c, o0VarE);
            ViewModelStoreOwner viewModelStoreOwnerA5 = v9.a.a(o0VarE);
            if (viewModelStoreOwnerA5 == null) {
                vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            final lg2.a aVar = (lg2.a) v9.b.a(t0Var.b(lg2.a.class), viewModelStoreOwnerA5, null, null, viewModelStoreOwnerA5 instanceof androidx.lifecycle.y ? ((androidx.lifecycle.y) viewModelStoreOwnerA5).getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c, o0VarE);
            ViewModelStoreOwner viewModelStoreOwnerA6 = v9.a.a(o0VarE);
            if (viewModelStoreOwnerA6 == null) {
                vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            final yg2.u0 u0Var = (yg2.u0) v9.b.a(t0Var.b(yg2.u0.class), viewModelStoreOwnerA6, null, null, viewModelStoreOwnerA6 instanceof androidx.lifecycle.y ? ((androidx.lifecycle.y) viewModelStoreOwnerA6).getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c, o0VarE);
            ViewModelStoreOwner viewModelStoreOwnerA7 = v9.a.a(o0VarE);
            if (viewModelStoreOwnerA7 == null) {
                vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            final bg2.j jVar = (bg2.j) v9.b.a(t0Var.b(bg2.j.class), viewModelStoreOwnerA7, null, null, viewModelStoreOwnerA7 instanceof androidx.lifecycle.y ? ((androidx.lifecycle.y) viewModelStoreOwnerA7).getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c, o0VarE);
            final p1 p1VarC = p3.p0.c(hVar.f152713f, o0VarE, 0);
            final p1 p1VarC2 = p3.p0.c(r0Var2.f170928e, o0VarE, 0);
            final p1 p1VarC3 = p3.p0.c(gVar2.f185157l, o0VarE, 0);
            final p1 p1VarC4 = p3.p0.c(gVar2.f185158m, o0VarE, 0);
            final p1 p1VarC5 = p3.p0.c(gVar2.f185159n, o0VarE, 0);
            final p1 p1VarC6 = p3.p0.c(r0Var2.f170933j, o0VarE, 0);
            final p1 p1VarC7 = p3.p0.c(r0Var2.f170934k, o0VarE, 0);
            final p1 p1VarC8 = p3.p0.c(r0Var2.f170935l, o0VarE, 0);
            final p1 p1VarC9 = p3.p0.c(r0Var2.f170936m, o0VarE, 0);
            final p1 p1VarC10 = p3.p0.c(r0Var2.f170938o, o0VarE, 0);
            final p1 p1VarC11 = p3.p0.c(r0Var2.f170929f, o0VarE, 0);
            final p1 p1VarC12 = p3.p0.c(r0Var2.f170930g, o0VarE, 0);
            final p1 p1VarC13 = p3.p0.c(r53.s.d(gVar2.x4().f71478b.f131785n), o0VarE, 0);
            final p1 p1VarC14 = p3.p0.c(gVar2.x4().f71490n, o0VarE, 0);
            final p1 p1VarC15 = p3.p0.c(gVar2.x4().f71498v, o0VarE, 0);
            final p1 p1VarC16 = p3.p0.c(gVar2.x4().f71494r, o0VarE, 0);
            final p1 p1VarC17 = p3.p0.c(gVar2.f185151f, o0VarE, 0);
            final p1 p1VarC18 = p3.p0.c(gVar2.f185152g, o0VarE, 0);
            final p1 p1VarC19 = p3.p0.c(gVar2.f185153h, o0VarE, 0);
            final p1 p1VarC20 = p3.p0.c(gVar2.f185154i, o0VarE, 0);
            final p1 p1VarC21 = p3.p0.c(gVar2.x4().f71492p, o0VarE, 0);
            final p1 p1VarC22 = p3.p0.c(r0Var2.f170940q, o0VarE, 0);
            final p1 p1VarC23 = p3.p0.c(r0Var2.B4().f71486j, o0VarE, 0);
            lc.m0 m0VarI = gl1.y.I(new lc.v0[0], o0VarE);
            final p1 p1VarC24 = p3.p0.c(u0Var.z4(), o0VarE, 0);
            final p1 p1VarC25 = p3.p0.c(u0Var.y4().f71478b.f131781j.f71431f, o0VarE, 0);
            final p1 p1VarB = p3.p0.b(u0Var.y4().f71478b.f131781j.f71437l, null, null, o0VarE, 48, 2);
            p1 p1VarC26 = p3.p0.c(aVar.f112258e, o0VarE, 0);
            p1 p1VarC27 = p3.p0.c(aVar.f112263j, o0VarE, 0);
            p1 p1VarC28 = p3.p0.c(r0Var2.B, o0VarE, 0);
            p1 p1VarC29 = p3.p0.c(aVar.f112264k, o0VarE, 0);
            final p1 p1VarC30 = p3.p0.c(aVar.f112260g, o0VarE, 0);
            final p1 p1VarC31 = p3.p0.c(aVar.f112262i, o0VarE, 0);
            final p1 p1VarC32 = p3.p0.c(aVar.f112265l, o0VarE, 0);
            p1 p1VarC33 = p3.p0.c(r0Var2.f170932i, o0VarE, 0);
            p1 p1VarC34 = p3.p0.c(r0Var2.f170941r, o0VarE, 0);
            p1 p1VarC35 = p3.p0.c(u0Var.y4().f71478b.f131781j.f71440o, o0VarE, 0);
            final p1 p1VarC36 = p3.p0.c(r0Var2.C, o0VarE, 0);
            final p1 p1VarC37 = p3.p0.c(r53.s.d(hVar.f152715h), o0VarE, 0);
            p1 p1VarC38 = p3.p0.c(r0Var2.f170945x, o0VarE, 0);
            p1 p1VarC39 = p3.p0.c(r0Var2.f170946y, o0VarE, 0);
            p1 p1VarC40 = p3.p0.c(hVar2.f197009q, o0VarE, 0);
            final Activity activity = (Activity) o0VarE.A(c.n.f22332a);
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ == c2565a2) {
                objQ = new uf2.p0(2);
                o0VarE.K(objQ);
            }
            final n1 n1Var = (n1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a2) {
                g6.f.a aVar2 = g6.f.f75994b;
                objQ2 = p3.p0.n(c2.l.a(0));
                o0VarE.K(objQ2);
            }
            final p1 p1Var3 = (p1) objQ2;
            final boolean z14 = ((fg2.a) p1VarC16.getF182175a()) instanceof fg2.a.C1456a;
            final boolean z15 = !(!((Boolean) p1VarC14.getF182175a()).booleanValue() || ((Boolean) p1VarC10.getF182175a()).booleanValue() || z14) || ((Boolean) p1VarC15.getF182175a()).booleanValue() || ((Boolean) p1VarC17.getF182175a()).booleanValue() || !((Boolean) p1VarC18.getF182175a()).booleanValue() || ((Boolean) p1VarC20.getF182175a()).booleanValue() || ((Boolean) p1VarC13.getF182175a()).booleanValue();
            boolean z16 = ((Configuration) o0VarE.A(AndroidCompositionLocals_androidKt.f6041a)).orientation == 2;
            ag2.d dVar = (ag2.d) p1VarC2.getF182175a();
            yg2.o oVar = (yg2.o) p1VarC24.getF182175a();
            rf2.l lVar3 = (rf2.l) p1VarC37.getF182175a();
            boolean zBooleanValue = ((Boolean) p1VarC23.getF182175a()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) p1VarC27.getF182175a()).booleanValue();
            boolean zBooleanValue3 = ((Boolean) p1VarC4.getF182175a()).booleanValue();
            boolean zBooleanValue4 = ((Boolean) p1VarC28.getF182175a()).booleanValue();
            final boolean z17 = z16;
            zf2.d dVar2 = (zf2.d) p1VarC9.getF182175a();
            boolean zBooleanValue5 = ((Boolean) p1VarC5.getF182175a()).booleanValue();
            dVar.getClass();
            dVar2.getClass();
            if (zBooleanValue2) {
                eVarA = ag2.e.START_RECORDING;
            } else if ((dVar2 == zf2.d.f204621w && lVar3 == null && zBooleanValue4 && !zBooleanValue5) || dVar2 == zf2.d.E1) {
                eVarA = null;
            } else if ((oVar == null || !fg2.h0.p(oVar)) && !zBooleanValue) {
                String primaryActionType = dVar.getPrimaryActionType();
                if (primaryActionType != null) {
                    ag2.e.f3224c.getClass();
                    eVarA = ag2.e.a.a(primaryActionType);
                } else {
                    eVarA = null;
                }
            } else {
                String primaryActionOnCompletionType = dVar.getPrimaryActionOnCompletionType();
                if (primaryActionOnCompletionType != null) {
                    ag2.e.f3224c.getClass();
                    eVarA = ag2.e.a.a(primaryActionOnCompletionType);
                } else {
                    eVarA = null;
                }
            }
            int i16 = eVarA == null ? -1 : ag2.b.f3167a[eVarA.ordinal()];
            if (i16 != 1) {
                if (i16 == 2 && zBooleanValue3) {
                    eVarA = ag2.e.END;
                }
            } else if (zBooleanValue3) {
                eVarA = ag2.e.START;
            }
            boolean z18 = (!((Boolean) p1VarC5.getF182175a()).booleanValue() || eVarA == null || eVarA == ag2.e.START_RECORDING || eVarA == ag2.e.STOP_RECORDING || eVarA == ag2.e.START || eVarA == ag2.e.END) ? false : true;
            boolean z19 = ((Boolean) p1VarC29.getF182175a()).booleanValue() || z18;
            final h21.m mVar2 = new h21.m(z18, p1VarC26, p1VarC11, p1VarC5, 15);
            final boolean z24 = ((Boolean) p1VarC22.getF182175a()).booleanValue() || ((Boolean) p1VarC40.getF182175a()).booleanValue();
            final boolean z25 = z19;
            final boolean z26 = r0Var2.B4().f71478b.f131780i.f144650e;
            final ag2.e eVar2 = eVarA;
            p1 p1VarC41 = p3.p0.c(r0Var2.f170931h, o0VarE, 0);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            androidx.lifecycle.n0 n0Var = (androidx.lifecycle.n0) o0VarE.A(s9.j.f158018a);
            if (((Boolean) p1VarC5.getF182175a()).booleanValue()) {
                o0VarE.C(1770690331);
                e(o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1770731654);
                o0VarE.g0(false);
            }
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a2) {
                objQ3 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1 p1Var4 = (p1) objQ3;
            Unit unit = Unit.INSTANCE;
            boolean zR = o0VarE.r(n0Var) | o0VarE.r(r0Var2);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == c2565a2) {
                objQ4 = new d0(n0Var, r0Var2, null);
                o0VarE.K(objQ4);
            }
            p3.l0.e((e23.p) objQ4, unit, o0VarE);
            boolean zR2 = o0VarE.r(gVar2) | ((i15 & 896) == 256) | o0VarE.B(p1VarC15);
            Object objQ5 = o0VarE.q();
            if (zR2 || objQ5 == c2565a2) {
                gVar = gVar2;
                c2565a = c2565a2;
                p1Var = p1Var4;
                e0Var = new e0(gVar, lVar2, p1Var, p1VarC15, null);
                o0VarE.K(e0Var);
            } else {
                gVar = gVar2;
                e0Var = objQ5;
                c2565a = c2565a2;
                p1Var = p1Var4;
            }
            p3.l0.f(gVar, n0Var, (e23.p) e0Var, o0VarE);
            boolean zR3 = o0VarE.r(r0Var2) | o0VarE.r(activity);
            Object objQ6 = o0VarE.q();
            if (zR3 || objQ6 == c2565a) {
                objQ6 = new f0(r0Var2, activity, null);
                o0VarE.K(objQ6);
            }
            p3.l0.f(r0Var2, n0Var, (e23.p) objQ6, o0VarE);
            vg2.a aVar3 = (vg2.a) p1VarC41.getF182175a();
            boolean zB = o0VarE.B(p1VarC41) | o0VarE.B(p1VarC34) | o0VarE.r(hVar2) | o0VarE.B(p1VarC35) | o0VarE.r(r43) | o0VarE.r(r0Var2);
            Object objQ7 = o0VarE.q();
            if (zB || objQ7 == c2565a) {
                p1Var2 = p1VarC34;
                m0Var = r43;
                g0 g0Var = new g0(m0Var, r0Var2, p1VarC41, p1Var2, hVar2, p1VarC35, null);
                r0Var = r0Var2;
                o0VarE.K(g0Var);
                objQ7 = g0Var;
            } else {
                p1Var2 = p1VarC34;
                m0Var = m0VarI;
                r0Var = r0Var2;
            }
            p3.l0.e((e23.p) objQ7, aVar3, o0VarE);
            Boolean bool = Boolean.TRUE;
            boolean zR4 = o0VarE.r(aVar) | o0VarE.r(context);
            Object objQ8 = o0VarE.q();
            if (zR4 || objQ8 == c2565a) {
                objQ8 = new h0(aVar, context, null);
                o0VarE.K(objQ8);
            }
            p3.l0.e((e23.p) objQ8, bool, o0VarE);
            Object objQ9 = o0VarE.q();
            if (objQ9 == c2565a) {
                objQ9 = new mg2.g();
                o0VarE.K(objQ9);
            }
            final mg2.g gVar3 = (mg2.g) objQ9;
            boolean zR5 = o0VarE.r(r0Var);
            Object objQ10 = o0VarE.q();
            if (zR5 || objQ10 == c2565a) {
                objQ10 = new i0(r0Var, gVar3, null);
                o0VarE.K(objQ10);
            }
            p3.l0.e((e23.p) objQ10, unit, o0VarE);
            Object objQ11 = o0VarE.q();
            if (objQ11 == c2565a) {
                objQ11 = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarE);
            }
            final fe feVar = (fe) objQ11;
            Object objQ12 = o0VarE.q();
            if (objQ12 == c2565a) {
                objQ12 = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ12);
            }
            o53.b0 b0Var = (o53.b0) objQ12;
            Object[] objArr2 = new Object[0];
            Object objQ13 = o0VarE.q();
            if (objQ13 == c2565a) {
                objQ13 = new uf2.p0(3);
                o0VarE.K(objQ13);
            }
            p1 p1Var5 = (p1) d4.a.e(objArr2, (e23.a) objQ13, o0VarE, 48);
            Object[] objArr3 = new Object[0];
            boolean zR6 = o0VarE.r(context);
            Object objQ14 = o0VarE.q();
            if (zR6 || objQ14 == c2565a) {
                objQ14 = new tz1.h(context, 1);
                o0VarE.K(objQ14);
            }
            p1 p1Var6 = (p1) d4.a.e(objArr3, (e23.a) objQ14, o0VarE, 0);
            g.h hVar3 = new g.h();
            boolean zB2 = o0VarE.B(p1VarC38) | o0VarE.B(p1Var6) | o0VarE.r(context) | o0VarE.r(b0Var);
            Object objQ15 = o0VarE.q();
            if (zB2 || objQ15 == c2565a) {
                objQ15 = new q((Object) context, (Object) b0Var, (Object) p1VarC38, (Object) p1Var6, (Object) feVar, 0);
                o0VarE.K(objQ15);
            }
            c.q qVarC = c.w.c(hVar3, (e23.l) objQ15, o0VarE, 0);
            Boolean bool2 = (Boolean) p1VarC38.getF182175a();
            bool2.getClass();
            Boolean bool3 = (Boolean) p1Var6.getF182175a();
            bool3.getClass();
            final p1 p1Var7 = p1Var;
            Boolean bool4 = (Boolean) p1Var5.getF182175a();
            bool4.getClass();
            Boolean bool5 = (Boolean) p1VarC39.getF182175a();
            bool5.getClass();
            Object[] objArr4 = {bool2, bool3, bool4, bool5};
            boolean zB3 = o0VarE.B(p1VarC38) | o0VarE.B(p1Var5) | o0VarE.r(b0Var) | o0VarE.B(p1Var6) | o0VarE.r(context) | o0VarE.B(p1VarC39) | o0VarE.r(qVarC);
            Object objQ16 = o0VarE.q();
            if (zB3 || objQ16 == c2565a) {
                objQ16 = new j0(b0Var, p1VarC38, p1Var5, feVar, context, qVarC, p1Var6, p1VarC39, null);
                o0VarE.K(objQ16);
            }
            p3.l0.h(objArr4, (e23.p) objQ16, o0VarE);
            boolean zB4 = o0VarE.B(p1VarC16);
            Object objQ17 = o0VarE.q();
            if (zB4 || objQ17 == c2565a) {
                objQ17 = new sk0.n(p1VarC16, 22);
                o0VarE.K(objQ17);
            }
            final mc mcVarF = e9.f(true, (e23.l) objQ17, o0VarE, 6, 0);
            Object objQ18 = o0VarE.q();
            if (objQ18 == c2565a) {
                objQ18 = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ18);
            }
            final o53.b0 b0Var2 = (o53.b0) objQ18;
            boolean zB5 = o0VarE.B(p1VarC16) | o0VarE.r(gVar) | o0VarE.r(r0Var) | o0VarE.r(aVar);
            Object objQ19 = o0VarE.q();
            if (zB5 || objQ19 == c2565a) {
                objQ19 = new k(gVar, r0Var, aVar, p1VarC16);
                o0VarE.K(objQ19);
            }
            final e23.a aVar4 = (e23.a) objQ19;
            final p1 p1Var8 = p1Var2;
            final wg2.g gVar4 = gVar;
            final lc.m0 m0Var2 = m0Var;
            final r0 r0Var3 = r0Var;
            og2.k.j(((Boolean) p1VarC33.getF182175a()).booleanValue(), null, null, z3.f.c(-1466931620, new e23.p() { // from class: ug2.y
                /* JADX WARN: Code duplicated, block: B:38:0x0262  */
                /* JADX WARN: Code duplicated, block: B:40:0x02b0  */
                /* JADX WARN: Code duplicated, block: B:42:0x02db  */
                /* JADX WARN: Code duplicated, block: B:45:0x02ef  */
                /* JADX WARN: Code duplicated, block: B:49:0x03b9  */
                /* JADX WARN: Code duplicated, block: B:52:0x03e0  */
                /* JADX WARN: Code duplicated, block: B:55:0x03f2  */
                /* JADX WARN: Code duplicated, block: B:58:0x0402  */
                /* JADX WARN: Code duplicated, block: B:60:0x0417  */
                /* JADX WARN: Code duplicated, block: B:63:0x042e  */
                /* JADX WARN: Code duplicated, block: B:66:0x0447  */
                /* JADX WARN: Code duplicated, block: B:68:0x045a  */
                /* JADX WARN: Code duplicated, block: B:98:0x0523  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    final p1 p1Var9;
                    final lg2.a aVar5;
                    x3 x3Var;
                    e23.l lVar4;
                    x3 x3Var2;
                    final e23.l lVar5;
                    x3 x3Var3;
                    boolean zBooleanValue6;
                    final x3 x3Var4;
                    Object objQ20;
                    p3.m.a.C2565a c2565a3;
                    Object objQ21;
                    final p1 p1Var10;
                    final lg2.a aVar6;
                    boolean zB6;
                    Object objQ22;
                    x3 x3Var5;
                    xf2.a aVar7;
                    boolean zR7;
                    Object objQ23;
                    boolean zR8;
                    Object objQ24;
                    Object objQ25;
                    p3.m mVar3 = (p3.m) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int iA = mVar3.a();
                    if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        x1 x1Var2 = p3.n.f135158a;
                        h4.r.a aVar8 = h4.r.S;
                        h4.r rVarD = x2.d(aVar8, 1.0f);
                        h4.d.f81522a.getClass();
                        z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                        int iHashCode = Long.hashCode(mVar3.getU());
                        i2 i2VarX = mVar3.x();
                        h4.r rVarC = h4.k.c(rVarD, mVar3);
                        h5.g.V.getClass();
                        h5.e0.a aVar9 = h5.g.a.f81805b;
                        if (mVar3.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar3.z();
                        if (mVar3.getT()) {
                            mVar3.M(aVar9);
                        } else {
                            mVar3.c();
                        }
                        b4.c(h5.g.a.f81810g, z0VarD, mVar3);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar3, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, mVar3);
                        c2.u uVar = c2.u.f22885a;
                        mVar3.C(780038739);
                        Object obj3 = z14 ? vg2.a.b.INSTANCE : vg2.a.C3329a.INSTANCE;
                        lg2.a aVar10 = aVar;
                        boolean zR9 = mVar3.r(aVar10);
                        final boolean z27 = z25;
                        boolean zH = zR9 | mVar3.h(z27);
                        final p1 p1Var11 = p1VarC5;
                        boolean zB7 = zH | mVar3.B(p1Var11);
                        final x3 x3Var6 = p1VarC6;
                        boolean zB8 = zB7 | mVar3.B(x3Var6);
                        final x3 x3Var7 = p1VarC12;
                        boolean zB9 = zB8 | mVar3.B(x3Var7);
                        final x3 x3Var8 = p1VarC11;
                        boolean zB10 = zB9 | mVar3.B(x3Var8);
                        final r0 r0Var4 = r0Var3;
                        boolean zR10 = zB10 | mVar3.r(r0Var4);
                        final e23.l lVar6 = lVar2;
                        boolean zB11 = zR10 | mVar3.B(lVar6);
                        final boolean z28 = z17;
                        boolean zH2 = zB11 | mVar3.h(z28);
                        final ag2.e eVar3 = eVar2;
                        boolean zK = mVar3.k(eVar3 == null ? -1 : eVar3.ordinal()) | zH2;
                        final h21.m mVar4 = mVar2;
                        boolean zB12 = zK | mVar3.B(mVar4);
                        final x3 x3Var9 = p1VarC30;
                        boolean zB13 = zB12 | mVar3.B(x3Var9);
                        final x3 x3Var10 = p1VarB;
                        boolean zB14 = zB13 | mVar3.B(x3Var10);
                        final p1 p1Var12 = p1VarC9;
                        boolean zB15 = zB14 | mVar3.B(p1Var12);
                        final x3 x3Var11 = p1VarC32;
                        boolean zB16 = zB15 | mVar3.B(x3Var11);
                        final bg2.j jVar2 = jVar;
                        boolean zR11 = zB16 | mVar3.r(jVar2);
                        final lc.m0 m0Var3 = m0Var2;
                        boolean zR12 = zR11 | mVar3.r(m0Var3);
                        final p1 p1Var13 = p1VarC22;
                        boolean zB17 = zR12 | mVar3.B(p1Var13);
                        final x3 x3Var12 = p1VarC25;
                        boolean zB18 = zB17 | mVar3.B(x3Var12);
                        final n1 n1Var2 = n1Var;
                        boolean zB19 = zB18 | mVar3.B(n1Var2);
                        final x3 x3Var13 = p1VarC19;
                        boolean zB20 = zB19 | mVar3.B(x3Var13);
                        final p1 p1Var14 = p1VarC24;
                        boolean zB21 = zB20 | mVar3.B(p1Var14);
                        final yg2.u0 u0Var2 = u0Var;
                        boolean zR13 = zB21 | mVar3.r(u0Var2);
                        final p1 p1Var15 = p1VarC2;
                        boolean zB22 = zR13 | mVar3.B(p1Var15);
                        final wg2.g gVar5 = gVar4;
                        boolean zR14 = zB22 | mVar3.r(gVar5);
                        final p1 p1Var16 = p1VarC37;
                        boolean zB23 = zR14 | mVar3.B(p1Var16);
                        final rg2.h hVar4 = hVar;
                        boolean zR15 = zB23 | mVar3.r(hVar4);
                        final boolean z29 = z26;
                        boolean zH3 = zR15 | mVar3.h(z29);
                        final Activity activity2 = activity;
                        boolean zR16 = zH3 | mVar3.r(activity2);
                        final x3 x3Var14 = p1VarC;
                        boolean zB24 = zR16 | mVar3.B(x3Var14);
                        final yg2.h hVar5 = hVar2;
                        boolean zR17 = zB24 | mVar3.r(hVar5);
                        final x3 x3Var15 = p1Var8;
                        boolean zB25 = zR17 | mVar3.B(x3Var15);
                        final boolean z34 = z24;
                        boolean zH4 = zB25 | mVar3.h(z34);
                        final p1 p1Var17 = p1VarC16;
                        boolean zB26 = zH4 | mVar3.B(p1Var17);
                        Object objQ26 = mVar3.q();
                        p1 p1Var18 = p1Var3;
                        p3.m.a aVar11 = p3.m.f135153a;
                        if (zB26) {
                            p1Var9 = p1Var18;
                        } else {
                            aVar11.getClass();
                            p1Var9 = p1Var18;
                            if (objQ26 != p3.m.a.f135155b) {
                                lVar4 = lVar6;
                                aVar5 = aVar10;
                                x3Var2 = x3Var7;
                                x3Var = x3Var8;
                            }
                            lVar5 = lVar4;
                            x3Var3 = x3Var;
                            nc.y.a(m0Var3, obj3, null, null, null, null, null, null, null, (e23.l) objQ26, mVar3, 0, 2044);
                            zBooleanValue6 = ((Boolean) p1VarC10.getF182175a()).booleanValue();
                            x3Var4 = p1VarC8;
                            if (zBooleanValue6) {
                                mVar3.C(806409787);
                                kb.a(null, z3.f.c(215603415, new b71.n(lVar5, 20, (byte) 0), mVar3), null, null, null, 0, 0L, 0L, null, z3.f.c(-1568750036, new mw0.h(lVar5, lVar, p1Var9, x3Var4, 25), mVar3), mVar3, 805306416, 509);
                                mVar3.w(iA);
                                return Unit.INSTANCE;
                            }
                            mVar3.C(807440940);
                            mVar3.f();
                            b2 b2VarD = s1.l.d(400, 0, null, 6);
                            h4.r rVarD2 = x2.d(aVar8, 1.0f);
                            objQ20 = mVar3.q();
                            aVar11.getClass();
                            c2565a3 = p3.m.a.f135155b;
                            if (objQ20 == c2565a3) {
                                objQ20 = new a81.m(26);
                                mVar3.K(objQ20);
                            }
                            v1 v1VarK = r1.u0.k((e23.l) objQ20, b2VarD);
                            objQ21 = mVar3.q();
                            if (objQ21 == c2565a3) {
                                objQ21 = new a81.m(26);
                                mVar3.K(objQ21);
                            }
                            r1.x1 x1Var3 = new r1.x1(new o2(null, new l2(new s1((e23.l) objQ21), b2VarD), null, null, null, false, null, 125, null));
                            final z3.e eVar4 = eVar;
                            final p1 p1Var19 = p1VarC14;
                            final o53.b0 b0Var3 = b0Var2;
                            final mc mcVar = mcVarF;
                            final x3 x3Var16 = p1VarC17;
                            final x3 x3Var17 = p1VarC18;
                            final x3 x3Var18 = p1VarC15;
                            final p1 p1Var20 = p1VarC4;
                            final x3 x3Var19 = p1VarC3;
                            final x3 x3Var20 = p1VarC7;
                            final e23.a aVar12 = aVar4;
                            final x3 x3Var21 = p1VarC31;
                            p1Var10 = p1Var7;
                            final p1 p1Var21 = p1VarC23;
                            final x3 x3Var22 = p1VarC20;
                            final x3 x3Var23 = p1VarC13;
                            aVar6 = aVar5;
                            final p1 p1Var22 = p1Var9;
                            r1.c0.e(z15, rVarD2, v1VarK, x1Var3, null, z3.f.c(1655651774, new e23.q() { // from class: ug2.j
                                @Override // e23.q
                                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                    p3.m mVar5 = (p3.m) obj5;
                                    ((Integer) obj6).getClass();
                                    ((r1.e0) obj4).getClass();
                                    x1 x1Var4 = p3.n.f135158a;
                                    h4.r rVarD3 = x2.d(h4.r.S, 1.0f);
                                    d92.b.f58623a.getClass();
                                    long jD = d92.b.a(mVar5).c().d();
                                    final p1 p1Var23 = p1Var19;
                                    final o53.b0 b0Var4 = b0Var3;
                                    final mc mcVar2 = mcVar;
                                    final z3.e eVar5 = eVar4;
                                    final r0 r0Var5 = r0Var4;
                                    final e23.l lVar7 = lVar5;
                                    final lg2.a aVar13 = aVar6;
                                    final lc.m0 m0Var4 = m0Var3;
                                    final x3 x3Var24 = x3Var16;
                                    final x3 x3Var25 = x3Var17;
                                    final p1 p1Var24 = p1Var22;
                                    final x3 x3Var26 = x3Var18;
                                    final p1 p1Var25 = p1Var20;
                                    final x3 x3Var27 = x3Var19;
                                    final x3 x3Var28 = x3Var4;
                                    final x3 x3Var29 = x3Var20;
                                    final x3 x3Var30 = x3Var14;
                                    final e23.a aVar14 = aVar12;
                                    final x3 x3Var31 = x3Var21;
                                    final p1 p1Var26 = p1Var10;
                                    final p1 p1Var27 = p1Var12;
                                    final p1 p1Var28 = p1Var21;
                                    ve.a(rVarD3, null, jD, 0L, 0.0f, 0.0f, null, z3.f.c(-1308598141, new e23.p() { // from class: ug2.l
                                        /* JADX WARN: Code duplicated, block: B:12:0x004e  */
                                        /* JADX WARN: Code duplicated, block: B:28:0x00bc  */
                                        /* JADX WARN: Code duplicated, block: B:44:0x0131  */
                                        /* JADX WARN: Code duplicated, block: B:56:0x01b8  */
                                        /* JADX WARN: Code duplicated, block: B:62:0x01d5  */
                                        /* JADX WARN: Code duplicated, block: B:67:0x01f8  */
                                        /* JADX WARN: Code duplicated, block: B:75:0x0247  */
                                        /* JADX WARN: Code duplicated, block: B:80:0x0268  */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // e23.p
                                        public final Object invoke(Object obj7, Object obj8) {
                                            p3.m mVar6 = (p3.m) obj7;
                                            int iIntValue2 = ((Integer) obj8).intValue();
                                            final int i17 = 0;
                                            final int i18 = 1;
                                            if (mVar6.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                x1 x1Var5 = p3.n.f135158a;
                                                p1 p1Var29 = p1Var23;
                                                Boolean bool6 = (Boolean) p1Var29.getF182175a();
                                                bool6.booleanValue();
                                                boolean zB27 = mVar6.B(p1Var29);
                                                o53.b0 b0Var5 = b0Var4;
                                                boolean zR18 = zB27 | mVar6.r(b0Var5);
                                                mc mcVar3 = mcVar2;
                                                boolean zB28 = zR18 | mVar6.B(mcVar3);
                                                Object objQ27 = mVar6.q();
                                                e23.a aVar15 = null;
                                                p3.m.a aVar16 = p3.m.f135153a;
                                                if (zB28) {
                                                    objQ27 = new k0(b0Var5, p1Var29, mcVar3, null);
                                                    mVar6.K(objQ27);
                                                } else {
                                                    aVar16.getClass();
                                                    if (objQ27 == p3.m.a.f135155b) {
                                                        objQ27 = new k0(b0Var5, p1Var29, mcVar3, null);
                                                        mVar6.K(objQ27);
                                                    }
                                                }
                                                p3.l0.e((e23.p) objQ27, bool6, mVar6);
                                                boolean zBooleanValue7 = ((Boolean) x3Var24.getF182175a()).booleanValue();
                                                final r0 r0Var6 = r0Var5;
                                                final e23.l lVar8 = lVar7;
                                                x3 x3Var32 = x3Var25;
                                                if (zBooleanValue7 || !((Boolean) x3Var32.getF182175a()).booleanValue()) {
                                                    mVar6.C(971256948);
                                                    float f22737b = ((h2) p1Var24.getF182175a()).getF22737b();
                                                    boolean zBooleanValue8 = ((Boolean) x3Var32.getF182175a()).booleanValue();
                                                    boolean zR19 = mVar6.r(r0Var6);
                                                    Object objQ28 = mVar6.q();
                                                    if (zR19) {
                                                        objQ28 = new i(r0Var6, 1);
                                                        mVar6.K(objQ28);
                                                    } else {
                                                        aVar16.getClass();
                                                        if (objQ28 == p3.m.a.f135155b) {
                                                            objQ28 = new i(r0Var6, 1);
                                                            mVar6.K(objQ28);
                                                        }
                                                    }
                                                    e23.a aVar17 = (e23.a) objQ28;
                                                    boolean zR20 = mVar6.r(r0Var6) | mVar6.B(lVar8);
                                                    Object objQ29 = mVar6.q();
                                                    if (zR20) {
                                                        objQ29 = new e23.a() { // from class: ug2.u
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i17) {
                                                                    case 0:
                                                                        r0Var6.A4();
                                                                        lVar8.invoke(Boolean.FALSE);
                                                                        break;
                                                                    default:
                                                                        r0Var6.B4().s(false);
                                                                        lVar8.invoke(Boolean.TRUE);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar6.K(objQ29);
                                                    } else {
                                                        aVar16.getClass();
                                                        if (objQ29 == p3.m.a.f135155b) {
                                                            objQ29 = new e23.a() { // from class: ug2.u
                                                                @Override // e23.a
                                                                public final Object invoke() {
                                                                    switch (i17) {
                                                                        case 0:
                                                                            r0Var6.A4();
                                                                            lVar8.invoke(Boolean.FALSE);
                                                                            break;
                                                                        default:
                                                                            r0Var6.B4().s(false);
                                                                            lVar8.invoke(Boolean.TRUE);
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            mVar6.K(objQ29);
                                                        }
                                                    }
                                                    wg2.c.b(f22737b, zBooleanValue8, eVar5, aVar17, (e23.a) objQ29, mVar6, 0);
                                                    mVar6.f();
                                                } else if (((Boolean) x3Var26.getF182175a()).booleanValue()) {
                                                    mVar6.C(971906491);
                                                    zf2.b bVar2 = zf2.b.SAVING_ACTIVITY_DIALOG;
                                                    long j8 = ((Boolean) p1Var25.getF182175a()).booleanValue() ? 6000L : 3000L;
                                                    boolean zR21 = mVar6.r(r0Var6) | mVar6.B(lVar8);
                                                    Object objQ30 = mVar6.q();
                                                    if (zR21) {
                                                        objQ30 = new e23.a() { // from class: ug2.u
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i18) {
                                                                    case 0:
                                                                        r0Var6.A4();
                                                                        lVar8.invoke(Boolean.FALSE);
                                                                        break;
                                                                    default:
                                                                        r0Var6.B4().s(false);
                                                                        lVar8.invoke(Boolean.TRUE);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar6.K(objQ30);
                                                    } else {
                                                        aVar16.getClass();
                                                        if (objQ30 == p3.m.a.f135155b) {
                                                            objQ30 = new e23.a() { // from class: ug2.u
                                                                @Override // e23.a
                                                                public final Object invoke() {
                                                                    switch (i18) {
                                                                        case 0:
                                                                            r0Var6.A4();
                                                                            lVar8.invoke(Boolean.FALSE);
                                                                            break;
                                                                        default:
                                                                            r0Var6.B4().s(false);
                                                                            lVar8.invoke(Boolean.TRUE);
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            mVar6.K(objQ30);
                                                        }
                                                    }
                                                    mg2.a.a(bVar2, j8, (e23.a) objQ30, mVar6, 6);
                                                    mVar6.f();
                                                } else if (((Boolean) p1Var29.getF182175a()).booleanValue()) {
                                                    mVar6.C(972584120);
                                                    boolean zBooleanValue9 = ((Boolean) x3Var27.getF182175a()).booleanValue();
                                                    lg2.a aVar18 = aVar13;
                                                    if (zBooleanValue9) {
                                                        mVar6.C(972673710);
                                                        String strQ = gl1.y.Q(mVar6, R.string.lbl_activity_stopped);
                                                        String str = (String) x3Var28.getF182175a();
                                                        if (str == null) {
                                                            str = "";
                                                        }
                                                        u4.d dVarA = (u4.d) x3Var29.getF182175a();
                                                        if (dVarA == null) {
                                                            s62.a.f157643a.getClass();
                                                            dVarA = u62.a.a(t62.a.f162797a);
                                                        }
                                                        boolean zR22 = mVar6.r(r0Var6);
                                                        Object objQ31 = mVar6.q();
                                                        if (zR22) {
                                                            objQ31 = new i(r0Var6, 2);
                                                            mVar6.K(objQ31);
                                                        } else {
                                                            aVar16.getClass();
                                                            if (objQ31 == p3.m.a.f135155b) {
                                                                objQ31 = new i(r0Var6, 2);
                                                                mVar6.K(objQ31);
                                                            }
                                                        }
                                                        wg2.j.b(mcVar3, b0Var5, strQ, str, dVarA, (e23.a) objQ31, z3.f.c(188032138, new jy0.t(x3Var30, i18), mVar6), z3.f.c(-1555025303, new mw0.h(aVar14, aVar18, x3Var31, p1Var26, 27), mVar6), mVar6, 14155776);
                                                        mVar6 = mVar6;
                                                        mVar6.f();
                                                    } else {
                                                        mVar6.C(974923380);
                                                        if (((zf2.d) p1Var27.getF182175a()) == zf2.d.f204585c2 && ((Boolean) p1Var28.getF182175a()).booleanValue()) {
                                                            mVar6.C(975019883);
                                                        } else {
                                                            mVar6.C(975110155);
                                                            boolean zR23 = mVar6.r(aVar18);
                                                            Object objQ32 = mVar6.q();
                                                            if (zR23) {
                                                                objQ32 = new s(aVar18, 1);
                                                                mVar6.K(objQ32);
                                                            } else {
                                                                aVar16.getClass();
                                                                if (objQ32 == p3.m.a.f135155b) {
                                                                    objQ32 = new s(aVar18, 1);
                                                                    mVar6.K(objQ32);
                                                                }
                                                            }
                                                            aVar15 = (e23.a) objQ32;
                                                        }
                                                        mVar6.f();
                                                        e23.a aVar19 = aVar15;
                                                        boolean zR24 = mVar6.r(r0Var6);
                                                        Object objQ33 = mVar6.q();
                                                        if (zR24) {
                                                            objQ33 = new i(r0Var6, 3);
                                                            mVar6.K(objQ33);
                                                        } else {
                                                            aVar16.getClass();
                                                            if (objQ33 == p3.m.a.f135155b) {
                                                                objQ33 = new i(r0Var6, 3);
                                                                mVar6.K(objQ33);
                                                            }
                                                        }
                                                        e23.a aVar20 = (e23.a) objQ33;
                                                        lc.m0 m0Var5 = m0Var4;
                                                        boolean zR25 = mVar6.r(m0Var5) | mVar6.B(lVar8);
                                                        Object objQ34 = mVar6.q();
                                                        if (zR25) {
                                                            objQ34 = new h(2, m0Var5, lVar8);
                                                            mVar6.K(objQ34);
                                                        } else {
                                                            aVar16.getClass();
                                                            if (objQ34 == p3.m.a.f135155b) {
                                                                objQ34 = new h(2, m0Var5, lVar8);
                                                                mVar6.K(objQ34);
                                                            }
                                                        }
                                                        wg2.l.b(null, aVar19, aVar20, (e23.a) objQ34, mVar6, 0);
                                                        mVar6.f();
                                                    }
                                                    mVar6.f();
                                                } else {
                                                    mVar6.C(976118399);
                                                    mVar6.f();
                                                }
                                            } else {
                                                mVar6.e();
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, mVar5), mVar5, 12582918, 122);
                                    if (((Boolean) x3Var22.getF182175a()).booleanValue()) {
                                        mVar5.C(123000971);
                                        wg2.e.a(eVar5, d92.b.a(mVar5).c().c(), mVar5, 0);
                                        p1Var26.setValue(Boolean.FALSE);
                                        mVar5.f();
                                    } else {
                                        mVar5.C(123148004);
                                        mVar5.f();
                                    }
                                    if (((Boolean) x3Var23.getF182175a()).booleanValue()) {
                                        mVar5.C(123192830);
                                        wg2.e.a(eVar5, d92.b.a(mVar5).c().c(), mVar5, 0);
                                        mVar5.f();
                                    } else {
                                        mVar5.C(123290852);
                                        mVar5.f();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, mVar3), mVar3, 200112, 16);
                            zB6 = mVar3.B(x3Var2) | mVar3.B(x3Var3) | mVar3.r(r0Var4) | mVar3.B(lVar5);
                            objQ22 = mVar3.q();
                            if (zB6 || objQ22 == c2565a3) {
                                objQ22 = new k(r0Var4, lVar5, x3Var2, x3Var3, 0);
                                mVar3.K(objQ22);
                            }
                            c.w.a(0, 1, (e23.a) objQ22, mVar3, false);
                            if (((Boolean) p1Var10.getF182175a()).booleanValue()) {
                                mVar3.C(813938602);
                                zR8 = mVar3.r(aVar6);
                                objQ24 = mVar3.q();
                                if (zR8 || objQ24 == c2565a3) {
                                    objQ24 = new h(aVar6, p1Var10);
                                    mVar3.K(objQ24);
                                }
                                e23.a aVar13 = (e23.a) objQ24;
                                objQ25 = mVar3.q();
                                if (objQ25 == c2565a3) {
                                    objQ25 = new tn.h(p1Var10, 12);
                                    mVar3.K(objQ25);
                                }
                                q0.a(aVar13, (e23.a) objQ25, mVar3, 48);
                                mVar3.f();
                            } else {
                                mVar3.C(814278796);
                                mVar3.f();
                            }
                            if (((Boolean) p1VarC21.getF182175a()).booleanValue()) {
                                mVar3.C(814343090);
                                zR7 = mVar3.r(gVar5) | mVar3.r(aVar6);
                                objQ23 = mVar3.q();
                                if (zR7 || objQ23 == c2565a3) {
                                    objQ23 = new g2(6, gVar5, aVar6);
                                    mVar3.K(objQ23);
                                }
                                q0.f((e23.l) objQ23, mVar3, 0);
                                mVar3.f();
                            } else {
                                mVar3.C(814706348);
                                mVar3.f();
                            }
                            x3Var5 = p1VarC36;
                            if (((w0) x3Var5.getF182175a()).f171061a || ((Boolean) x3Var16.getF182175a()).booleanValue() || !((Boolean) x3Var17.getF182175a()).booleanValue()) {
                                mVar3.C(815428524);
                                mVar3.f();
                            } else {
                                mVar3.C(814823094);
                                yf2.a aVar14 = ((w0) x3Var5.getF182175a()).f171062b;
                                if (aVar14 == null) {
                                    mVar3.C(814891665);
                                    mVar3.f();
                                    aVar7 = null;
                                } else {
                                    mVar3.C(164834160);
                                    kg2.b bVar2 = (kg2.b) mVar3.A(kg2.c.f104706a);
                                    if (xf2.b.f190716a[aVar14.ordinal()] != 1) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    aVar7 = new xf2.a(bVar2.a("720", new Object[0]), bVar2.a("721", new Object[0]));
                                    mVar3.f();
                                }
                                String str = aVar7 != null ? aVar7.f190714a : "";
                                String str2 = aVar7 != null ? aVar7.f190715b : "";
                                boolean zR18 = mVar3.r(r0Var4) | mVar3.r(aVar6);
                                Object objQ27 = mVar3.q();
                                if (zR18 || objQ27 == c2565a3) {
                                    objQ27 = new h(0, r0Var4, aVar6);
                                    mVar3.K(objQ27);
                                }
                                e23.a aVar15 = (e23.a) objQ27;
                                boolean zR19 = mVar3.r(r0Var4);
                                Object objQ28 = mVar3.q();
                                if (zR19 || objQ28 == c2565a3) {
                                    objQ28 = new i(r0Var4, 0);
                                    mVar3.K(objQ28);
                                }
                                q0.g(str, str2, aVar15, (e23.a) objQ28, mVar3, 0);
                                mVar3.f();
                            }
                            mVar3.f();
                            mVar3.y();
                        }
                        final mg2.g gVar6 = gVar3;
                        final fe feVar2 = feVar;
                        aVar5 = aVar10;
                        objQ26 = new e23.l() { // from class: ug2.c0
                            @Override // e23.l
                            public final Object invoke(Object obj4) {
                                lc.k0 k0Var = (lc.k0) obj4;
                                k0Var.getClass();
                                final lg2.a aVar16 = aVar5;
                                final boolean z35 = z28;
                                final boolean z36 = z27;
                                final p1 p1Var23 = p1Var11;
                                final x3 x3Var24 = x3Var8;
                                final r0 r0Var5 = r0Var4;
                                final e23.l lVar7 = lVar6;
                                final x3 x3Var25 = x3Var6;
                                final x3 x3Var26 = x3Var7;
                                final ag2.e eVar5 = eVar3;
                                final h21.m mVar5 = mVar4;
                                final x3 x3Var27 = x3Var9;
                                final x3 x3Var28 = x3Var10;
                                final p1 p1Var24 = p1Var12;
                                final x3 x3Var29 = x3Var11;
                                final mg2.g gVar7 = gVar6;
                                final fe feVar3 = feVar2;
                                final p1 p1Var25 = p1Var9;
                                final bg2.j jVar3 = jVar2;
                                final lc.m0 m0Var4 = m0Var3;
                                final wg2.g gVar8 = gVar5;
                                final rg2.h hVar6 = hVar4;
                                final boolean z37 = z29;
                                final p1 p1Var26 = p1Var13;
                                final x3 x3Var30 = x3Var12;
                                final n1 n1Var3 = n1Var2;
                                final yg2.u0 u0Var3 = u0Var2;
                                final x3 x3Var31 = x3Var13;
                                final p1 p1Var27 = p1Var14;
                                final p1 p1Var28 = p1Var15;
                                final p1 p1Var29 = p1Var16;
                                z3.e eVar6 = new z3.e(-341104971, true, new e23.r() { // from class: ug2.m
                                    /* JADX WARN: Code duplicated, block: B:15:0x0057  */
                                    /* JADX WARN: Code duplicated, block: B:6:0x0032  */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // e23.r
                                    public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                                        long jB;
                                        k3 k3VarB;
                                        p3.m mVar6 = (p3.m) obj7;
                                        ((Integer) obj8).getClass();
                                        ((r1.l) obj5).getClass();
                                        ((lc.v) obj6).getClass();
                                        x1 x1Var4 = p3.n.f135158a;
                                        final lg2.a aVar17 = aVar16;
                                        boolean zR20 = mVar6.r(aVar17);
                                        Object objQ29 = mVar6.q();
                                        p3.m.a aVar18 = p3.m.f135153a;
                                        if (zR20) {
                                            objQ29 = new s(aVar17, 0);
                                            mVar6.K(objQ29);
                                        } else {
                                            aVar18.getClass();
                                            if (objQ29 == p3.m.a.f135155b) {
                                                objQ29 = new s(aVar17, 0);
                                                mVar6.K(objQ29);
                                            }
                                        }
                                        e23.a aVar19 = (e23.a) objQ29;
                                        if (!z36) {
                                            aVar19 = null;
                                        }
                                        final e23.a aVar20 = aVar19;
                                        boolean zR21 = mVar6.r(aVar17);
                                        Object objQ30 = mVar6.q();
                                        if (zR21) {
                                            objQ30 = new r(aVar17, 1);
                                            mVar6.K(objQ30);
                                        } else {
                                            aVar18.getClass();
                                            if (objQ30 == p3.m.a.f135155b) {
                                                objQ30 = new r(aVar17, 1);
                                                mVar6.K(objQ30);
                                            }
                                        }
                                        final e23.l lVar8 = (e23.l) objQ30;
                                        p1 p1Var30 = p1Var23;
                                        if (((Boolean) p1Var30.getF182175a()).booleanValue()) {
                                            mVar6.C(34801634);
                                            d92.b.f58623a.getClass();
                                            jB = d92.b.a(mVar6).c().c();
                                            mVar6.f();
                                        } else {
                                            mVar6.C(34882079);
                                            d92.b.f58623a.getClass();
                                            jB = d92.b.a(mVar6).c().b();
                                            mVar6.f();
                                        }
                                        final long j8 = jB;
                                        final x3 x3Var32 = x3Var24;
                                        final r0 r0Var6 = r0Var5;
                                        z3.e eVarC = z3.f.c(-2101240719, new sg2.g(x3Var32, r0Var6, lVar7, x3Var25, x3Var26, 16), mVar6);
                                        final boolean z38 = z35;
                                        final ag2.e eVar7 = eVar5;
                                        final h21.m mVar7 = mVar5;
                                        final x3 x3Var33 = x3Var27;
                                        final x3 x3Var34 = x3Var28;
                                        final p1 p1Var31 = p1Var24;
                                        final x3 x3Var35 = x3Var29;
                                        z3.e eVarC2 = z3.f.c(1162265360, new ck0.i(z38, p1Var30, aVar20, eVar7, mVar7, lVar8, aVar17, x3Var33, x3Var34, x3Var32, p1Var31, x3Var35), mVar6);
                                        z3.e eVarC3 = z3.f.c(130804143, new r11.l(gVar7, feVar3, z38, 5), mVar6);
                                        if (z38) {
                                            mVar6.C(38755901);
                                            int i17 = k3.f22728a;
                                            k3VarB = q3.b(mVar6);
                                            mVar6.f();
                                        } else {
                                            mVar6.C(38840903);
                                            mVar6.f();
                                            k3VarB = n3.f22788a;
                                        }
                                        final p1 p1Var32 = p1Var25;
                                        final bg2.j jVar4 = jVar3;
                                        final lc.m0 m0Var5 = m0Var4;
                                        final wg2.g gVar9 = gVar8;
                                        final rg2.h hVar7 = hVar6;
                                        final boolean z39 = z37;
                                        final p1 p1Var33 = p1Var26;
                                        final x3 x3Var36 = x3Var30;
                                        final n1 n1Var4 = n1Var3;
                                        final yg2.u0 u0Var4 = u0Var3;
                                        final x3 x3Var37 = x3Var31;
                                        final p1 p1Var34 = p1Var27;
                                        final p1 p1Var35 = p1Var28;
                                        final p1 p1Var36 = p1Var29;
                                        kb.a(null, eVarC, eVarC2, eVarC3, null, 0, 0L, 0L, k3VarB, z3.f.c(382351494, new e23.q() { // from class: ug2.t
                                            /* JADX WARN: Code duplicated, block: B:30:0x00d0  */
                                            /* JADX WARN: Code duplicated, block: B:35:0x00ef  */
                                            /* JADX WARN: Code duplicated, block: B:40:0x010e  */
                                            /* JADX WARN: Code duplicated, block: B:45:0x012d  */
                                            /* JADX WARN: Code duplicated, block: B:73:0x034d  */
                                            /* JADX WARN: Code duplicated, block: B:75:0x0354  */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, o13.l] */
                                            @Override // e23.q
                                            public final Object invoke(Object obj9, Object obj10, Object obj11) {
                                                final p1 p1Var37;
                                                r53.p2 p2Var;
                                                lg2.a aVar21;
                                                boolean zR22;
                                                Object objQ31;
                                                p3.m mVar8;
                                                final h2 h2Var = (h2) obj9;
                                                p3.m mVar9 = (p3.m) obj10;
                                                int iIntValue2 = ((Integer) obj11).intValue();
                                                h2Var.getClass();
                                                if ((iIntValue2 & 6) == 0) {
                                                    iIntValue2 |= mVar9.B(h2Var) ? 4 : 2;
                                                }
                                                if (mVar9.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                    x1 x1Var5 = p3.n.f135158a;
                                                    p1Var32.setValue(h2Var);
                                                    h4.r.a aVar22 = h4.r.S;
                                                    h4.r rVarC2 = c2.l.C(aVar22, 0.0f, h2Var.getF22737b(), 0.0f, h2Var.getF22739d(), 5);
                                                    h4.d.f81522a.getClass();
                                                    z0 z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                                                    int iHashCode2 = Long.hashCode(mVar9.getU());
                                                    i2 i2VarX2 = mVar9.x();
                                                    h4.r rVarC3 = h4.k.c(rVarC2, mVar9);
                                                    h5.g.V.getClass();
                                                    h5.e0.a aVar23 = h5.g.a.f81805b;
                                                    if (mVar9.F() == null) {
                                                        p3.p0.l();
                                                        throw null;
                                                    }
                                                    mVar9.z();
                                                    if (mVar9.getT()) {
                                                        mVar9.M(aVar23);
                                                    } else {
                                                        mVar9.c();
                                                    }
                                                    b4.c(h5.g.a.f81810g, z0VarD2, mVar9);
                                                    b4.c(h5.g.a.f81809f, i2VarX2, mVar9);
                                                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                                                    if (mVar9.getT() || !p005kotlin.jvm.internal.s.g(mVar9.q(), Integer.valueOf(iHashCode2))) {
                                                        v.h.z(iHashCode2, mVar9, iHashCode2, bVar3);
                                                    }
                                                    b4.c(h5.g.a.f81807d, rVarC3, mVar9);
                                                    c2.u uVar2 = c2.u.f22885a;
                                                    final bg2.j jVar5 = jVar4;
                                                    final p1 p1VarC42 = p3.p0.c(r53.s.d(jVar5.f17891b), mVar9, 0);
                                                    final lc.m0 m0Var6 = m0Var5;
                                                    boolean zR23 = mVar9.r(m0Var6);
                                                    Object objQ32 = mVar9.q();
                                                    p3.m.a aVar24 = p3.m.f135153a;
                                                    if (zR23) {
                                                        objQ32 = new ky0.w(m0Var6, 23);
                                                        mVar9.K(objQ32);
                                                    } else {
                                                        aVar24.getClass();
                                                        if (objQ32 == p3.m.a.f135155b) {
                                                            objQ32 = new ky0.w(m0Var6, 23);
                                                            mVar9.K(objQ32);
                                                        }
                                                    }
                                                    final e23.l lVar9 = (e23.l) objQ32;
                                                    boolean zR24 = mVar9.r(m0Var6);
                                                    Object objQ33 = mVar9.q();
                                                    if (zR24) {
                                                        objQ33 = new nk0.l(m0Var6, 28);
                                                        mVar9.K(objQ33);
                                                    } else {
                                                        aVar24.getClass();
                                                        if (objQ33 == p3.m.a.f135155b) {
                                                            objQ33 = new nk0.l(m0Var6, 28);
                                                            mVar9.K(objQ33);
                                                        }
                                                    }
                                                    final e23.a aVar25 = (e23.a) objQ33;
                                                    boolean zR25 = mVar9.r(m0Var6);
                                                    Object objQ34 = mVar9.q();
                                                    if (zR25) {
                                                        objQ34 = new nk0.l(m0Var6, 29);
                                                        mVar9.K(objQ34);
                                                    } else {
                                                        aVar24.getClass();
                                                        if (objQ34 == p3.m.a.f135155b) {
                                                            objQ34 = new nk0.l(m0Var6, 29);
                                                            mVar9.K(objQ34);
                                                        }
                                                    }
                                                    final e23.a aVar26 = (e23.a) objQ34;
                                                    boolean zR26 = mVar9.r(m0Var6);
                                                    Object objQ35 = mVar9.q();
                                                    if (zR26) {
                                                        objQ35 = new v(m0Var6, 0);
                                                        mVar9.K(objQ35);
                                                    } else {
                                                        aVar24.getClass();
                                                        if (objQ35 == p3.m.a.f135155b) {
                                                            objQ35 = new v(m0Var6, 0);
                                                            mVar9.K(objQ35);
                                                        }
                                                    }
                                                    final e23.p pVar = (e23.p) objQ35;
                                                    boolean zBooleanValue7 = ((Boolean) p1Var33.getF182175a()).booleanValue();
                                                    final long j14 = j8;
                                                    final wg2.g gVar10 = gVar9;
                                                    final r0 r0Var7 = r0Var6;
                                                    final rg2.h hVar8 = hVar7;
                                                    final boolean z44 = z39;
                                                    final boolean z45 = z38;
                                                    final e23.a aVar27 = aVar20;
                                                    final ag2.e eVar8 = eVar7;
                                                    final e23.l lVar10 = lVar8;
                                                    final h21.m mVar10 = mVar7;
                                                    final p1 p1Var38 = p1Var31;
                                                    final x3 x3Var38 = x3Var36;
                                                    final x3 x3Var39 = x3Var37;
                                                    final p1 p1Var39 = p1Var34;
                                                    final x3 x3Var40 = x3Var33;
                                                    final x3 x3Var41 = x3Var32;
                                                    final p1 p1Var40 = p1Var35;
                                                    p1 p1Var41 = p1Var36;
                                                    if (zBooleanValue7) {
                                                        p1Var37 = p1Var41;
                                                        if (((zf2.d) p1Var38.getF182175a()) != zf2.d.f204583b2 && ((zf2.d) p1Var38.getF182175a()) != zf2.d.f204585c2) {
                                                            mVar9.C(-13258674);
                                                            yg2.h0 h0Var = (yg2.h0) x3Var38.getF182175a();
                                                            if (h0Var != null) {
                                                                if (h0Var.getCategory() == null || h0Var.getExerciseName() == null) {
                                                                    jVar5.f17891b.setValue(null);
                                                                } else {
                                                                    String category = h0Var.getCategory();
                                                                    String exerciseName = h0Var.getExerciseName();
                                                                    category.getClass();
                                                                    exerciseName.getClass();
                                                                    zg2.c.f204692a.getClass();
                                                                    zg2.c.a("MsnWorkoutViewModel", "fetchMsnExercise Start category:" + category + " and name:" + exerciseName);
                                                                    Object value = ((bg2.i) jVar5.f17890a.getValue()).f17889a.getValue();
                                                                    value.getClass();
                                                                    ((bg2.a) value).a("en-US", category, exerciseName).q0(new bg2.k(jVar5));
                                                                }
                                                            }
                                                            i53.f fVarA = i53.a.a(gl1.y.Q(mVar9, R.string.step_unit), gl1.y.Q(mVar9, R.string.lbl_workout));
                                                            y1 y1Var = y1.f16902a;
                                                            final n1 n1Var5 = n1Var4;
                                                            int intValue = n1Var5.getIntValue();
                                                            final yg2.u0 u0Var5 = u0Var4;
                                                            final x3 x3Var42 = x3Var34;
                                                            z3.e eVarC4 = z3.f.c(843518351, new e23.q() { // from class: ug2.w
                                                                /* JADX WARN: Code duplicated, block: B:21:0x00bb  */
                                                                /* JADX WARN: Multi-variable type inference failed */
                                                                @Override // e23.q
                                                                public final Object invoke(Object obj12, Object obj13, Object obj14) throws Throwable {
                                                                    h4.r rVar;
                                                                    int iIntValue3 = ((Integer) obj12).intValue();
                                                                    p3.m mVar11 = (p3.m) obj13;
                                                                    int iIntValue4 = ((Integer) obj14).intValue();
                                                                    if ((iIntValue4 & 6) == 0) {
                                                                        iIntValue4 |= mVar11.k(iIntValue3) ? 4 : 2;
                                                                    }
                                                                    if (mVar11.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                                                        x1 x1Var6 = p3.n.f135158a;
                                                                        n1Var5.t(iIntValue3);
                                                                        h2 h2Var2 = h2Var;
                                                                        ag2.e eVar9 = eVar8;
                                                                        h21.m mVar12 = mVar10;
                                                                        boolean z46 = z45;
                                                                        e23.a aVar28 = aVar27;
                                                                        e23.l lVar11 = lVar10;
                                                                        r0 r0Var8 = r0Var7;
                                                                        x3 x3Var43 = x3Var39;
                                                                        p1 p1Var42 = p1Var39;
                                                                        x3 x3Var44 = x3Var38;
                                                                        x3 x3Var45 = x3Var40;
                                                                        x3 x3Var46 = x3Var41;
                                                                        p3.m.a aVar29 = p3.m.f135153a;
                                                                        if (iIntValue3 == 1) {
                                                                            mVar11.C(-598163318);
                                                                            h4.r.a aVar30 = h4.r.S;
                                                                            y3 y3Var = t1.f91496n;
                                                                            h4.r rVarC4 = c2.l.C(aVar30, c2.l.i(h2Var2, (g6.o) mVar11.A(y3Var)), 0.0f, c2.l.h(h2Var2, (g6.o) mVar11.A(y3Var)), 0.0f, 10);
                                                                            boolean zBooleanValue8 = ((Boolean) x3Var43.getF182175a()).booleanValue();
                                                                            yg2.o oVar2 = (yg2.o) p1Var42.getF182175a();
                                                                            yg2.h0 h0Var2 = (yg2.h0) x3Var44.getF182175a();
                                                                            yg2.j0 j0Var = (yg2.j0) x3Var42.getF182175a();
                                                                            lg2.r rVar2 = (lg2.r) x3Var45.getF182175a();
                                                                            boolean zD = q0.d(x3Var46);
                                                                            boolean zR27 = mVar11.r(r0Var8);
                                                                            Object objQ36 = mVar11.q();
                                                                            if (zR27) {
                                                                                objQ36 = new i(r0Var8, 7);
                                                                                mVar11.K(objQ36);
                                                                            } else {
                                                                                aVar29.getClass();
                                                                                if (objQ36 == p3.m.a.f135155b) {
                                                                                    objQ36 = new i(r0Var8, 7);
                                                                                    mVar11.K(objQ36);
                                                                                }
                                                                            }
                                                                            yg2.q0.f(rVarC4, u0Var5, jVar5, m0Var6, zBooleanValue8, oVar2, h0Var2, j0Var, eVar9, mVar12, rVar2, z46, aVar28, lVar11, (e23.a) objQ36, zD, mVar11, 0);
                                                                            mVar11.f();
                                                                        } else {
                                                                            mVar11.C(-596171754);
                                                                            h4.r rVarE = u1.n.e(h4.r.S, j14, m1.f128891a);
                                                                            y3 y3Var2 = t1.f91496n;
                                                                            h4.r rVarC5 = c2.l.C(rVarE, c2.l.i(h2Var2, (g6.o) mVar11.A(y3Var2)), 0.0f, c2.l.h(h2Var2, (g6.o) mVar11.A(y3Var2)), 0.0f, 10);
                                                                            ag2.d dVar3 = (ag2.d) p1Var40.getF182175a();
                                                                            yg2.o oVar3 = (yg2.o) p1Var42.getF182175a();
                                                                            yg2.h0 h0Var3 = (yg2.h0) x3Var44.getF182175a();
                                                                            bg2.h hVar9 = (bg2.h) p1VarC42.getF182175a();
                                                                            lg2.r rVar3 = (lg2.r) x3Var45.getF182175a();
                                                                            zf2.d dVar4 = (zf2.d) p1Var38.getF182175a();
                                                                            boolean zBooleanValue9 = ((Boolean) x3Var43.getF182175a()).booleanValue();
                                                                            wg2.g gVar11 = gVar10;
                                                                            r53.p2 p2Var2 = gVar11.x4().f71490n;
                                                                            r53.p2 p2Var3 = gVar11.f185151f;
                                                                            boolean zD2 = q0.d(x3Var46);
                                                                            r53.b2 b2Var = r0Var8.A;
                                                                            r53.b2 b2Var2 = r0Var8.f170947z;
                                                                            rf2.l lVar12 = (rf2.l) p1Var37.getF182175a();
                                                                            boolean zR28 = mVar11.r(r0Var8);
                                                                            Object objQ37 = mVar11.q();
                                                                            if (zR28) {
                                                                                rVar = rVarC5;
                                                                            } else {
                                                                                aVar29.getClass();
                                                                                rVar = rVarC5;
                                                                                if (objQ37 == p3.m.a.f135155b) {
                                                                                }
                                                                                ng2.e.a(rVar, hVar8, dVar3, p2Var2, p2Var3, z44, oVar3, h0Var3, hVar9, true, z46, aVar28, eVar9, lVar11, mVar12, rVar3, (e23.a) objQ37, dVar4, zBooleanValue9, zD2, b2Var, b2Var2, lVar12, lVar9, aVar25, aVar26, pVar, false, null, mVar11, C.ENCODING_PCM_32BIT, 402653184);
                                                                                mVar11.f();
                                                                            }
                                                                            objQ37 = new i(r0Var8, 8);
                                                                            mVar11.K(objQ37);
                                                                            ng2.e.a(rVar, hVar8, dVar3, p2Var2, p2Var3, z44, oVar3, h0Var3, hVar9, true, z46, aVar28, eVar9, lVar11, mVar12, rVar3, (e23.a) objQ37, dVar4, zBooleanValue9, zD2, b2Var, b2Var2, lVar12, lVar9, aVar25, aVar26, pVar, false, null, mVar11, C.ENCODING_PCM_32BIT, 402653184);
                                                                            mVar11.f();
                                                                        }
                                                                    } else {
                                                                        mVar11.e();
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            }, mVar9);
                                                            mVar8 = mVar9;
                                                            y1Var.c(fVarA, intValue, false, true, false, 0L, 0L, eVarC4, mVar8, 12586368, 112);
                                                            mVar8.f();
                                                        }
                                                        mVar8.y();
                                                    } else {
                                                        p1Var37 = p1Var41;
                                                    }
                                                    mVar9.C(-7005571);
                                                    h4.r rVarE = u1.n.e(aVar22, j14, m1.f128891a);
                                                    y3 y3Var = t1.f91496n;
                                                    h4.r rVarC4 = c2.l.C(rVarE, c2.l.i(h2Var, (g6.o) mVar9.A(y3Var)), 0.0f, c2.l.h(h2Var, (g6.o) mVar9.A(y3Var)), 0.0f, 10);
                                                    ag2.d dVar3 = (ag2.d) p1Var40.getF182175a();
                                                    yg2.o oVar2 = (yg2.o) p1Var39.getF182175a();
                                                    yg2.h0 h0Var2 = (yg2.h0) x3Var38.getF182175a();
                                                    bg2.h hVar9 = (bg2.h) p1VarC42.getF182175a();
                                                    lg2.r rVar = (lg2.r) x3Var40.getF182175a();
                                                    zf2.d dVar4 = (zf2.d) p1Var38.getF182175a();
                                                    boolean zBooleanValue8 = ((Boolean) x3Var39.getF182175a()).booleanValue();
                                                    r53.p2 p2Var2 = gVar10.x4().f71490n;
                                                    r53.p2 p2Var3 = gVar10.f185151f;
                                                    boolean zD = q0.d(x3Var41);
                                                    r53.b2 b2Var = r0Var7.A;
                                                    r53.b2 b2Var2 = r0Var7.f170947z;
                                                    rf2.l lVar11 = (rf2.l) p1Var37.getF182175a();
                                                    boolean zBooleanValue9 = ((Boolean) x3Var35.getF182175a()).booleanValue();
                                                    boolean zR27 = mVar9.r(r0Var7);
                                                    Object objQ36 = mVar9.q();
                                                    if (zR27) {
                                                        p2Var = p2Var2;
                                                    } else {
                                                        aVar24.getClass();
                                                        p2Var = p2Var2;
                                                        if (objQ36 == p3.m.a.f135155b) {
                                                        }
                                                        e23.a aVar28 = (e23.a) objQ36;
                                                        aVar21 = aVar17;
                                                        zR22 = mVar9.r(aVar21);
                                                        objQ31 = mVar9.q();
                                                        if (zR22) {
                                                            objQ31 = new s(aVar21, 3);
                                                            mVar9.K(objQ31);
                                                        } else {
                                                            aVar24.getClass();
                                                            if (objQ31 == p3.m.a.f135155b) {
                                                                objQ31 = new s(aVar21, 3);
                                                                mVar9.K(objQ31);
                                                            }
                                                        }
                                                        ng2.e.a(rVarC4, hVar8, dVar3, p2Var, p2Var3, z44, oVar2, h0Var2, hVar9, false, z45, aVar27, eVar8, lVar10, mVar10, rVar, aVar28, dVar4, zBooleanValue8, zD, b2Var, b2Var2, lVar11, lVar9, aVar25, aVar26, pVar, zBooleanValue9, (e23.a) objQ31, mVar9, C.ENCODING_PCM_32BIT, 0);
                                                        mVar8 = mVar9;
                                                        mVar8.f();
                                                        mVar8.y();
                                                    }
                                                    objQ36 = new i(r0Var7, 5);
                                                    mVar9.K(objQ36);
                                                    e23.a aVar29 = (e23.a) objQ36;
                                                    aVar21 = aVar17;
                                                    zR22 = mVar9.r(aVar21);
                                                    objQ31 = mVar9.q();
                                                    if (zR22) {
                                                        aVar24.getClass();
                                                        if (objQ31 == p3.m.a.f135155b) {
                                                            objQ31 = new s(aVar21, 3);
                                                            mVar9.K(objQ31);
                                                        }
                                                    } else {
                                                        objQ31 = new s(aVar21, 3);
                                                        mVar9.K(objQ31);
                                                    }
                                                    ng2.e.a(rVarC4, hVar8, dVar3, p2Var, p2Var3, z44, oVar2, h0Var2, hVar9, false, z45, aVar27, eVar8, lVar10, mVar10, rVar, aVar29, dVar4, zBooleanValue8, zD, b2Var, b2Var2, lVar11, lVar9, aVar25, aVar26, pVar, zBooleanValue9, (e23.a) objQ31, mVar9, C.ENCODING_PCM_32BIT, 0);
                                                    mVar8 = mVar9;
                                                    mVar8.f();
                                                    mVar8.y();
                                                } else {
                                                    mVar9.e();
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, mVar6), mVar6, 805309872, 241);
                                        return Unit.INSTANCE;
                                    }
                                });
                                p13.k0 k0Var2 = p13.k0.f134949a;
                                k0Var2.getClass();
                                p13.j0 j0Var = p13.j0.f134944a;
                                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                                nc.n.a(k0Var, t0Var2.b(vg2.a.C3329a.class), k0Var2, j0Var, null, null, null, null, eVar6);
                                Activity activity3 = activity2;
                                nc.n.a(k0Var, t0Var2.b(vg2.a.f.class), k0Var2, j0Var, null, null, null, null, new z3.e(1128173918, true, new b21.s0(z37, activity3, m0Var4, p1Var24, gVar7, p1Var25, r0Var5, gVar8)));
                                nc.n.a(k0Var, t0Var2.b(vg2.a.e.class), k0Var2, j0Var, null, null, null, null, new z3.e(78801917, true, new a42.g0(activity3, m0Var4, x3Var25, gVar7, p1Var25, r0Var5, p1Var27, x3Var30)));
                                nc.n.a(k0Var, t0Var2.b(vg2.a.g.class), k0Var2, j0Var, null, null, null, null, new z3.e(-970570084, true, new ca0.e(activity3, m0Var4, x3Var25, gVar7, p1Var25, x3Var14, x3Var30)));
                                yg2.h hVar7 = hVar5;
                                nc.n.a(k0Var, t0Var2.b(vg2.a.c.class), k0Var2, j0Var, null, null, null, null, new z3.e(-2019942085, true, new sm1.q(hVar7, x3Var15, z34, m0Var4, p1Var26, p1Var23)));
                                nc.n.a(k0Var, t0Var2.b(vg2.a.h.class), k0Var2, j0Var, null, null, null, null, new z3.e(1225653210, true, new o72.m1(8, m0Var4, hVar7)));
                                vg2.a.d.INSTANCE.getClass();
                                nc.n.a(k0Var, t0Var2.b(vg2.a.d.class), vg2.a.d.f178248c, j0Var, null, null, null, null, new z3.e(176281209, true, new qw.b(m0Var4, p1Var25, r0Var5, x3Var31, 5)));
                                z3.e eVar7 = new z3.e(918659233, true, new oy0.g(z37, aVar16, p1Var17, p1Var24, 2));
                                nc.n.a(k0Var, t0Var2.b(vg2.a.b.class), k0Var2, j0Var, l0.f170871a, m0.f170896a, n0.f170901a, o0.f170904a, eVar7);
                                return Unit.INSTANCE;
                            }
                        };
                        x3Var = x3Var8;
                        lVar4 = lVar6;
                        x3Var2 = x3Var7;
                        mVar3.K(objQ26);
                        lVar5 = lVar4;
                        x3Var3 = x3Var;
                        nc.y.a(m0Var3, obj3, null, null, null, null, null, null, null, (e23.l) objQ26, mVar3, 0, 2044);
                        zBooleanValue6 = ((Boolean) p1VarC10.getF182175a()).booleanValue();
                        x3Var4 = p1VarC8;
                        if (zBooleanValue6) {
                            mVar3.C(806409787);
                            kb.a(null, z3.f.c(215603415, new b71.n(lVar5, 20, (byte) 0), mVar3), null, null, null, 0, 0L, 0L, null, z3.f.c(-1568750036, new mw0.h(lVar5, lVar, p1Var9, x3Var4, 25), mVar3), mVar3, 805306416, 509);
                            mVar3.w(iA);
                            return Unit.INSTANCE;
                        }
                        mVar3.C(807440940);
                        mVar3.f();
                        b2 b2VarD2 = s1.l.d(400, 0, null, 6);
                        h4.r rVarD3 = x2.d(aVar8, 1.0f);
                        objQ20 = mVar3.q();
                        aVar11.getClass();
                        c2565a3 = p3.m.a.f135155b;
                        if (objQ20 == c2565a3) {
                            objQ20 = new a81.m(26);
                            mVar3.K(objQ20);
                        }
                        v1 v1VarK2 = r1.u0.k((e23.l) objQ20, b2VarD2);
                        objQ21 = mVar3.q();
                        if (objQ21 == c2565a3) {
                            objQ21 = new a81.m(26);
                            mVar3.K(objQ21);
                        }
                        r1.x1 x1Var4 = new r1.x1(new o2(null, new l2(new s1((e23.l) objQ21), b2VarD2), null, null, null, false, null, 125, null));
                        final z3.e eVar5 = eVar;
                        final p1 p1Var110 = p1VarC14;
                        final o53.b0 b0Var4 = b0Var2;
                        final mc mcVar2 = mcVarF;
                        final x3 x3Var110 = p1VarC17;
                        final x3 x3Var111 = p1VarC18;
                        final x3 x3Var112 = p1VarC15;
                        final p1 p1Var23 = p1VarC4;
                        final x3 x3Var113 = p1VarC3;
                        final x3 x3Var24 = p1VarC7;
                        final e23.a aVar16 = aVar4;
                        final x3 x3Var25 = p1VarC31;
                        p1Var10 = p1Var7;
                        final p1 p1Var24 = p1VarC23;
                        final x3 x3Var26 = p1VarC20;
                        final x3 x3Var27 = p1VarC13;
                        aVar6 = aVar5;
                        final p1 p1Var25 = p1Var9;
                        r1.c0.e(z15, rVarD3, v1VarK2, x1Var4, null, z3.f.c(1655651774, new e23.q() { // from class: ug2.j
                            @Override // e23.q
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                p3.m mVar5 = (p3.m) obj5;
                                ((Integer) obj6).getClass();
                                ((r1.e0) obj4).getClass();
                                x1 x1Var5 = p3.n.f135158a;
                                h4.r rVarD4 = x2.d(h4.r.S, 1.0f);
                                d92.b.f58623a.getClass();
                                long jD = d92.b.a(mVar5).c().d();
                                final p1 p1Var26 = p1Var110;
                                final o53.b0 b0Var5 = b0Var4;
                                final mc mcVar3 = mcVar2;
                                final z3.e eVar6 = eVar5;
                                final r0 r0Var5 = r0Var4;
                                final e23.l lVar7 = lVar5;
                                final lg2.a aVar17 = aVar6;
                                final lc.m0 m0Var4 = m0Var3;
                                final x3 x3Var28 = x3Var110;
                                final x3 x3Var29 = x3Var111;
                                final p1 p1Var27 = p1Var25;
                                final x3 x3Var210 = x3Var112;
                                final p1 p1Var28 = p1Var23;
                                final x3 x3Var211 = x3Var113;
                                final x3 x3Var212 = x3Var4;
                                final x3 x3Var213 = x3Var24;
                                final x3 x3Var30 = x3Var14;
                                final e23.a aVar18 = aVar16;
                                final x3 x3Var31 = x3Var25;
                                final p1 p1Var29 = p1Var10;
                                final p1 p1Var210 = p1Var12;
                                final p1 p1Var211 = p1Var24;
                                ve.a(rVarD4, null, jD, 0L, 0.0f, 0.0f, null, z3.f.c(-1308598141, new e23.p() { // from class: ug2.l
                                    /* JADX WARN: Code duplicated, block: B:12:0x004e  */
                                    /* JADX WARN: Code duplicated, block: B:28:0x00bc  */
                                    /* JADX WARN: Code duplicated, block: B:44:0x0131  */
                                    /* JADX WARN: Code duplicated, block: B:56:0x01b8  */
                                    /* JADX WARN: Code duplicated, block: B:62:0x01d5  */
                                    /* JADX WARN: Code duplicated, block: B:67:0x01f8  */
                                    /* JADX WARN: Code duplicated, block: B:75:0x0247  */
                                    /* JADX WARN: Code duplicated, block: B:80:0x0268  */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // e23.p
                                    public final Object invoke(Object obj7, Object obj8) {
                                        p3.m mVar6 = (p3.m) obj7;
                                        int iIntValue2 = ((Integer) obj8).intValue();
                                        final int i17 = 0;
                                        final int i18 = 1;
                                        if (mVar6.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            x1 x1Var6 = p3.n.f135158a;
                                            p1 p1Var212 = p1Var26;
                                            Boolean bool6 = (Boolean) p1Var212.getF182175a();
                                            bool6.booleanValue();
                                            boolean zB27 = mVar6.B(p1Var212);
                                            o53.b0 b0Var6 = b0Var5;
                                            boolean zR110 = zB27 | mVar6.r(b0Var6);
                                            mc mcVar4 = mcVar3;
                                            boolean zB28 = zR110 | mVar6.B(mcVar4);
                                            Object objQ29 = mVar6.q();
                                            e23.a aVar19 = null;
                                            p3.m.a aVar110 = p3.m.f135153a;
                                            if (zB28) {
                                                objQ29 = new k0(b0Var6, p1Var212, mcVar4, null);
                                                mVar6.K(objQ29);
                                            } else {
                                                aVar110.getClass();
                                                if (objQ29 == p3.m.a.f135155b) {
                                                    objQ29 = new k0(b0Var6, p1Var212, mcVar4, null);
                                                    mVar6.K(objQ29);
                                                }
                                            }
                                            p3.l0.e((e23.p) objQ29, bool6, mVar6);
                                            boolean zBooleanValue7 = ((Boolean) x3Var28.getF182175a()).booleanValue();
                                            final r0 r0Var6 = r0Var5;
                                            final e23.l lVar8 = lVar7;
                                            x3 x3Var32 = x3Var29;
                                            if (zBooleanValue7 || !((Boolean) x3Var32.getF182175a()).booleanValue()) {
                                                mVar6.C(971256948);
                                                float f22737b = ((h2) p1Var27.getF182175a()).getF22737b();
                                                boolean zBooleanValue8 = ((Boolean) x3Var32.getF182175a()).booleanValue();
                                                boolean zR111 = mVar6.r(r0Var6);
                                                Object objQ210 = mVar6.q();
                                                if (zR111) {
                                                    objQ210 = new i(r0Var6, 1);
                                                    mVar6.K(objQ210);
                                                } else {
                                                    aVar110.getClass();
                                                    if (objQ210 == p3.m.a.f135155b) {
                                                        objQ210 = new i(r0Var6, 1);
                                                        mVar6.K(objQ210);
                                                    }
                                                }
                                                e23.a aVar111 = (e23.a) objQ210;
                                                boolean zR20 = mVar6.r(r0Var6) | mVar6.B(lVar8);
                                                Object objQ211 = mVar6.q();
                                                if (zR20) {
                                                    objQ211 = new e23.a() { // from class: ug2.u
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i17) {
                                                                case 0:
                                                                    r0Var6.A4();
                                                                    lVar8.invoke(Boolean.FALSE);
                                                                    break;
                                                                default:
                                                                    r0Var6.B4().s(false);
                                                                    lVar8.invoke(Boolean.TRUE);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar6.K(objQ211);
                                                } else {
                                                    aVar110.getClass();
                                                    if (objQ211 == p3.m.a.f135155b) {
                                                        objQ211 = new e23.a() { // from class: ug2.u
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i17) {
                                                                    case 0:
                                                                        r0Var6.A4();
                                                                        lVar8.invoke(Boolean.FALSE);
                                                                        break;
                                                                    default:
                                                                        r0Var6.B4().s(false);
                                                                        lVar8.invoke(Boolean.TRUE);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar6.K(objQ211);
                                                    }
                                                }
                                                wg2.c.b(f22737b, zBooleanValue8, eVar6, aVar111, (e23.a) objQ211, mVar6, 0);
                                                mVar6.f();
                                            } else if (((Boolean) x3Var210.getF182175a()).booleanValue()) {
                                                mVar6.C(971906491);
                                                zf2.b bVar3 = zf2.b.SAVING_ACTIVITY_DIALOG;
                                                long j8 = ((Boolean) p1Var28.getF182175a()).booleanValue() ? 6000L : 3000L;
                                                boolean zR21 = mVar6.r(r0Var6) | mVar6.B(lVar8);
                                                Object objQ30 = mVar6.q();
                                                if (zR21) {
                                                    objQ30 = new e23.a() { // from class: ug2.u
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i18) {
                                                                case 0:
                                                                    r0Var6.A4();
                                                                    lVar8.invoke(Boolean.FALSE);
                                                                    break;
                                                                default:
                                                                    r0Var6.B4().s(false);
                                                                    lVar8.invoke(Boolean.TRUE);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar6.K(objQ30);
                                                } else {
                                                    aVar110.getClass();
                                                    if (objQ30 == p3.m.a.f135155b) {
                                                        objQ30 = new e23.a() { // from class: ug2.u
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i18) {
                                                                    case 0:
                                                                        r0Var6.A4();
                                                                        lVar8.invoke(Boolean.FALSE);
                                                                        break;
                                                                    default:
                                                                        r0Var6.B4().s(false);
                                                                        lVar8.invoke(Boolean.TRUE);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar6.K(objQ30);
                                                    }
                                                }
                                                mg2.a.a(bVar3, j8, (e23.a) objQ30, mVar6, 6);
                                                mVar6.f();
                                            } else if (((Boolean) p1Var212.getF182175a()).booleanValue()) {
                                                mVar6.C(972584120);
                                                boolean zBooleanValue9 = ((Boolean) x3Var211.getF182175a()).booleanValue();
                                                lg2.a aVar112 = aVar17;
                                                if (zBooleanValue9) {
                                                    mVar6.C(972673710);
                                                    String strQ = gl1.y.Q(mVar6, R.string.lbl_activity_stopped);
                                                    String str3 = (String) x3Var212.getF182175a();
                                                    if (str3 == null) {
                                                        str3 = "";
                                                    }
                                                    u4.d dVarA = (u4.d) x3Var213.getF182175a();
                                                    if (dVarA == null) {
                                                        s62.a.f157643a.getClass();
                                                        dVarA = u62.a.a(t62.a.f162797a);
                                                    }
                                                    boolean zR22 = mVar6.r(r0Var6);
                                                    Object objQ31 = mVar6.q();
                                                    if (zR22) {
                                                        objQ31 = new i(r0Var6, 2);
                                                        mVar6.K(objQ31);
                                                    } else {
                                                        aVar110.getClass();
                                                        if (objQ31 == p3.m.a.f135155b) {
                                                            objQ31 = new i(r0Var6, 2);
                                                            mVar6.K(objQ31);
                                                        }
                                                    }
                                                    wg2.j.b(mcVar4, b0Var6, strQ, str3, dVarA, (e23.a) objQ31, z3.f.c(188032138, new jy0.t(x3Var30, i18), mVar6), z3.f.c(-1555025303, new mw0.h(aVar18, aVar112, x3Var31, p1Var29, 27), mVar6), mVar6, 14155776);
                                                    mVar6 = mVar6;
                                                    mVar6.f();
                                                } else {
                                                    mVar6.C(974923380);
                                                    if (((zf2.d) p1Var210.getF182175a()) == zf2.d.f204585c2 && ((Boolean) p1Var211.getF182175a()).booleanValue()) {
                                                        mVar6.C(975019883);
                                                    } else {
                                                        mVar6.C(975110155);
                                                        boolean zR23 = mVar6.r(aVar112);
                                                        Object objQ32 = mVar6.q();
                                                        if (zR23) {
                                                            objQ32 = new s(aVar112, 1);
                                                            mVar6.K(objQ32);
                                                        } else {
                                                            aVar110.getClass();
                                                            if (objQ32 == p3.m.a.f135155b) {
                                                                objQ32 = new s(aVar112, 1);
                                                                mVar6.K(objQ32);
                                                            }
                                                        }
                                                        aVar19 = (e23.a) objQ32;
                                                    }
                                                    mVar6.f();
                                                    e23.a aVar113 = aVar19;
                                                    boolean zR24 = mVar6.r(r0Var6);
                                                    Object objQ33 = mVar6.q();
                                                    if (zR24) {
                                                        objQ33 = new i(r0Var6, 3);
                                                        mVar6.K(objQ33);
                                                    } else {
                                                        aVar110.getClass();
                                                        if (objQ33 == p3.m.a.f135155b) {
                                                            objQ33 = new i(r0Var6, 3);
                                                            mVar6.K(objQ33);
                                                        }
                                                    }
                                                    e23.a aVar20 = (e23.a) objQ33;
                                                    lc.m0 m0Var5 = m0Var4;
                                                    boolean zR25 = mVar6.r(m0Var5) | mVar6.B(lVar8);
                                                    Object objQ34 = mVar6.q();
                                                    if (zR25) {
                                                        objQ34 = new h(2, m0Var5, lVar8);
                                                        mVar6.K(objQ34);
                                                    } else {
                                                        aVar110.getClass();
                                                        if (objQ34 == p3.m.a.f135155b) {
                                                            objQ34 = new h(2, m0Var5, lVar8);
                                                            mVar6.K(objQ34);
                                                        }
                                                    }
                                                    wg2.l.b(null, aVar113, aVar20, (e23.a) objQ34, mVar6, 0);
                                                    mVar6.f();
                                                }
                                                mVar6.f();
                                            } else {
                                                mVar6.C(976118399);
                                                mVar6.f();
                                            }
                                        } else {
                                            mVar6.e();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar5), mVar5, 12582918, 122);
                                if (((Boolean) x3Var26.getF182175a()).booleanValue()) {
                                    mVar5.C(123000971);
                                    wg2.e.a(eVar6, d92.b.a(mVar5).c().c(), mVar5, 0);
                                    p1Var29.setValue(Boolean.FALSE);
                                    mVar5.f();
                                } else {
                                    mVar5.C(123148004);
                                    mVar5.f();
                                }
                                if (((Boolean) x3Var27.getF182175a()).booleanValue()) {
                                    mVar5.C(123192830);
                                    wg2.e.a(eVar6, d92.b.a(mVar5).c().c(), mVar5, 0);
                                    mVar5.f();
                                } else {
                                    mVar5.C(123290852);
                                    mVar5.f();
                                }
                                return Unit.INSTANCE;
                            }
                        }, mVar3), mVar3, 200112, 16);
                        zB6 = mVar3.B(x3Var2) | mVar3.B(x3Var3) | mVar3.r(r0Var4) | mVar3.B(lVar5);
                        objQ22 = mVar3.q();
                        if (zB6) {
                            objQ22 = new k(r0Var4, lVar5, x3Var2, x3Var3, 0);
                            mVar3.K(objQ22);
                        } else {
                            objQ22 = new k(r0Var4, lVar5, x3Var2, x3Var3, 0);
                            mVar3.K(objQ22);
                        }
                        c.w.a(0, 1, (e23.a) objQ22, mVar3, false);
                        if (((Boolean) p1Var10.getF182175a()).booleanValue()) {
                            mVar3.C(813938602);
                            zR8 = mVar3.r(aVar6);
                            objQ24 = mVar3.q();
                            if (zR8) {
                                objQ24 = new h(aVar6, p1Var10);
                                mVar3.K(objQ24);
                            } else {
                                objQ24 = new h(aVar6, p1Var10);
                                mVar3.K(objQ24);
                            }
                            e23.a aVar17 = (e23.a) objQ24;
                            objQ25 = mVar3.q();
                            if (objQ25 == c2565a3) {
                                objQ25 = new tn.h(p1Var10, 12);
                                mVar3.K(objQ25);
                            }
                            q0.a(aVar17, (e23.a) objQ25, mVar3, 48);
                            mVar3.f();
                        } else {
                            mVar3.C(814278796);
                            mVar3.f();
                        }
                        if (((Boolean) p1VarC21.getF182175a()).booleanValue()) {
                            mVar3.C(814343090);
                            zR7 = mVar3.r(gVar5) | mVar3.r(aVar6);
                            objQ23 = mVar3.q();
                            if (zR7) {
                                objQ23 = new g2(6, gVar5, aVar6);
                                mVar3.K(objQ23);
                            } else {
                                objQ23 = new g2(6, gVar5, aVar6);
                                mVar3.K(objQ23);
                            }
                            q0.f((e23.l) objQ23, mVar3, 0);
                            mVar3.f();
                        } else {
                            mVar3.C(814706348);
                            mVar3.f();
                        }
                        x3Var5 = p1VarC36;
                        if (((w0) x3Var5.getF182175a()).f171061a) {
                            mVar3.C(815428524);
                            mVar3.f();
                        } else {
                            mVar3.C(815428524);
                            mVar3.f();
                        }
                        mVar3.f();
                        mVar3.y();
                    } else {
                        mVar3.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, 3072);
            o0VarE = o0VarE;
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new tb0.h((Object) eVar, lVar, (Object) lVar2, i14, 14);
        }
    }

    public static final boolean d(x3<Boolean> x3Var) {
        return x3Var.getF182175a().booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    @SuppressLint({"SourceLockedOrientationActivity"})
    public static final void e(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(1314870617);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = p3.n.f135158a;
            Activity activity = (Activity) o0VarE.A(c.n.f22332a);
            Unit unit = Unit.INSTANCE;
            boolean zR = o0VarE.r(activity);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new pg2.d(activity, 4);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new pg2.d(activity, 4);
                    o0VarE.K(objQ);
                }
            }
            p3.l0.a(unit, (e23.l) objQ, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q1(i14, 23);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    public static final void f(e23.l<? super Boolean, Unit> lVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(696541406);
        int i15 = (o0VarE.r(lVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            c1 c1Var = c1.f110940a;
            String strQ = gl1.y.Q(o0VarE, R.string.lsv_complete_skipped_steps_title);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lsv_complete_skipped_steps_message);
            String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_yes);
            int i16 = i15 & 14;
            boolean z14 = i16 == 4;
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (z14) {
                objQ = new ub0.h(lVar, 4);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ub0.h(lVar, 4);
                    o0VarE.K(objQ);
                }
            }
            e23.a<Unit> aVar2 = (e23.a) objQ;
            String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_no);
            boolean z15 = i16 == 4;
            Object objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new ub0.h(lVar, 5);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new ub0.h(lVar, 5);
                    o0VarE.K(objQ2);
                }
            }
            c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar2, strQ4, (e23.a) objQ2, o0VarE, 6, 0, 216);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b71.n(lVar, i14);
        }
    }

    public static final void g(String str, String str2, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-622483333);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            int i16 = i15 << 3;
            g82.c.f76436a.c(null, str, str2, 0, gl1.y.Q(o0VarE, R.string.lbl_continue_activity), aVar2, gl1.y.Q(o0VarE, R.string.lbl_stop_and_save_activity), aVar, false, aVar2, o0VarE, (i16 & 896) | (i16 & 112) | 100663296 | (458752 & (i15 << 6)) | ((i15 << 15) & 29360128) | ((i15 << 18) & 1879048192), 9);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.m(str, str2, aVar, aVar2, i14);
        }
    }
}
