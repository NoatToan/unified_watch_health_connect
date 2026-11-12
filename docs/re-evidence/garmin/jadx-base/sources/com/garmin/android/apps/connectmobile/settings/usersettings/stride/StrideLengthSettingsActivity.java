package com.garmin.android.apps.connectmobile.settings.usersettings.stride;

import aa2.o;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import b.g;
import c2.b0;
import c2.j;
import c2.l;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import g6.f;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.ArrayList;
import l72.f0;
import l72.p2;
import l72.r1;
import lc.m0;
import lc.v0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import s5.x0;
import v.h;
import yk1.i;
import z3.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/usersettings/stride/StrideLengthSettingsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "Lal1/a;", "strideData", "", "isCustom", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StrideLengthSettingsActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f44198b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f44199a = new w1(s0.f105811a.b(i.class), new c(this), new b(this), new d(null, this));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f44200a;

        public b(g gVar) {
            this.f44200a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f44200a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f44201a;

        public c(g gVar) {
            this.f44201a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f44201a.getViewModelStore();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f44202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f44203b;

        public d(e23.a aVar, g gVar) {
            this.f44202a = aVar;
            this.f44203b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f44202a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f44203b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ca(i iVar, String str, m mVar, int i14) {
        String str2;
        p1 p1Var;
        r.a aVar;
        boolean z14;
        boolean z15;
        int i15;
        String string;
        o0 o0VarE = mVar.E(-1831509906);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = i14 | (o0VarE.r(iVar) ? 4 : 2) | (o0VarE.r(this) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            p3.x1 x1Var = n.f135158a;
            r.a aVar2 = r.S;
            r rVarD = x2.d(aVar2, 1.0f);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u uVar = u.f22885a;
            p1 p1VarC = p0.c(r53.s.d(iVar.f197622h), o0VarE, 0);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.valueOf(((al1.a) p1VarC.getF182175a()).a()));
                o0VarE.K(objQ);
            }
            p1 p1Var2 = (p1) objQ;
            r rVarF = x2.f(aVar2, 1.0f);
            j.f22691a.getClass();
            z zVarA = y.a(j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(rVarF, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            int i17 = iVar.C4() ? R.string.lbl_custom_stroke_length : R.string.user_setting_custom_stride_length;
            p2 p2Var = p2.f111205a;
            String strQ = gl1.y.Q(o0VarE, i17);
            f.a aVar4 = f.f75994b;
            r rVarC3 = l.C(aVar2, 0.0f, 24, 0.0f, 0.0f, 13);
            e eVarC = z3.f.c(-2026129849, new sk0.c(p1Var2, 15), o0VarE);
            boolean zR = o0VarE.r(iVar);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new x72.k(iVar, 10, str, p1Var2);
                o0VarE.K(objQ2);
            }
            p2Var.g(strQ, rVarC3, null, null, eVarC, false, false, (e23.a) objQ2, o0VarE, 24624, 236);
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0VarE.C(-680476469);
                yk1.b bVar2 = new yk1.b((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
                int iHashCode3 = str.hashCode();
                if (iHashCode3 != -2026200673) {
                    if (iHashCode3 != -988312717) {
                        if (iHashCode3 == 1836798297) {
                            str.equals("WALKING");
                        }
                    } else if (str.equals("WHEELCHAIR_PUSHING")) {
                        i15 = R.string.lbl_wheelchair_pushing;
                    }
                } else {
                    i15 = !str.equals("RUNNING") ? R.string.lbl_walking : R.string.lbl_running;
                }
                r1.b(gl1.y.Q(o0VarE, i15), z3.f.c(-750427972, new xr.n(this, iVar, str, p1VarC), o0VarE), o0VarE, 48, 0);
                r rVarF2 = x2.f(aVar2, 1.0f);
                s2 s2VarA = q2.a(j.f22692b, h4.d.a.f81533k, o0VarE, 0);
                int iHashCode4 = Long.hashCode(o0VarE.U);
                i2 i2VarA2 = o0VarE.a0();
                r rVarC4 = k.c(rVarF2, o0VarE);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode4))) {
                    h.A(iHashCode4, o0VarE, iHashCode4, bVar);
                }
                b4.c(fVar, rVarC4, o0VarE);
                u2 u2Var = u2.f22900a;
                String strQ2 = gl1.y.Q(o0VarE, iVar.C4() ? R.string.lbl_stroke_length : R.string.user_stride_stride_length);
                d92.b.f58623a.getClass();
                j92.f fVar2 = d92.b.f58624b;
                fVar2.getClass();
                x0 x0Var = j92.f.f97931h;
                x0 x0VarB = d92.c.b(x0Var, o0VarE);
                j92.b bVar3 = d92.b.f58625c;
                bVar3.getClass();
                j92.e eVar2 = j92.b.f97899b;
                p1Var = p1VarC;
                aVar = aVar2;
                mh.c(strQ2, u2Var.a(l.y(aVar2, eVar2.f97920e), 1.0f, true), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
                double d14 = ((al1.a) p1Var.getF182175a()).f3755d;
                int i18 = ((al1.a) p1Var.getF182175a()).f3753b;
                if (d14 <= 0.0d) {
                    string = bVar2.f197597b;
                } else {
                    string = bVar2.f197596a.getString(i18 == 0 ? R.string.common_n_feet_label : R.string.common_n_meters_label, l3.f23125c.format(d14));
                    string.getClass();
                }
                String str3 = string;
                fVar2.getClass();
                x0 x0VarB2 = d92.c.b(x0Var, o0VarE);
                bVar3.getClass();
                z14 = true;
                r rVarA = u2Var.a(l.y(aVar, eVar2.f97920e), 1.0f, true);
                d6.h.f57752b.getClass();
                mh.c(str3, rVarA, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57758h), 0L, 0, false, 0, 0, null, x0VarB2, o0VarE, 0, 0, 130044);
                o0VarE = o0VarE;
                o0VarE.g0(true);
                z15 = false;
                o0VarE.g0(false);
            } else {
                p1Var = p1VarC;
                aVar = aVar2;
                z14 = true;
                z15 = false;
                o0VarE.C(-678565040);
                o0VarE.g0(false);
            }
            o0VarE.g0(z14);
            if (!((Boolean) p1Var2.getF182175a()).booleanValue() || (((al1.a) p1Var.getF182175a()).f3755d <= 0.0d && ((al1.a) p1Var.getF182175a()).f3752a <= 0.0d && ((al1.a) p1Var.getF182175a()).f3754c <= 0)) {
                str2 = str;
                o0VarE.C(-1381731718);
                o0VarE.g0(z15);
            } else {
                o0VarE.C(-1382351563);
                f0 f0Var = f0.f110999a;
                String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_reset);
                r rVarC5 = uVar.c(aVar, h4.d.a.f81531i);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarC6 = l.C(rVarC5, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97918c, 7);
                boolean zR2 = o0VarE.r(iVar);
                Object objQ3 = o0VarE.q();
                if (zR2 || objQ3 == c2565a) {
                    str2 = str;
                    objQ3 = new xr.a(21, iVar, str2);
                    o0VarE.K(objQ3);
                } else {
                    str2 = str;
                }
                f0Var.k(strQ3, rVarC6, false, (e23.a) objQ3, o0VarE, 0, 4);
                o0VarE.g0(z15);
            }
            o0VarE.g0(z14);
        } else {
            str2 = str;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xk1.e(this, iVar, str2, i14, 15);
        }
    }

    public final void da(i iVar, e23.l<? super String, Unit> lVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(1512922965);
        int i15 = i14 | (o0VarE.r(iVar) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(this) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            r rVarF = x2.f(aVar, 1.0f);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarF, o0VarE);
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            String strQ = gl1.y.Q(o0VarE, iVar.C4() ? R.string.msg_set_custom_push_stroke_info : R.string.msg_set_custom_walk_stride_info);
            d92.b.f58623a.getClass();
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            mh.c(strQ, l.y(aVar, eVar.f97920e), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
            String strQ2 = gl1.y.Q(o0VarE, R.string.msg_optimize_accuracy_stride_length);
            fVar.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97932i, o0VarE);
            bVar2.getClass();
            float f14 = eVar.f97920e;
            bVar2.getClass();
            float f15 = eVar.f97920e;
            bVar2.getClass();
            mh.c(strQ2, l.C(aVar, f14, 0.0f, f15, eVar.f97920e, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            bb1.d dVar = !iVar.C4() ? new bb1.d(lVar, "WALKING", 8) : null;
            p2 p2Var = p2.f111205a;
            p2Var.g(gl1.y.Q(o0VarE, R.string.lbl_walking), null, null, null, null, !iVar.C4(), false, dVar, o0VarE, 0, 222);
            if (((Boolean) iVar.f197621g.getValue()).booleanValue()) {
                o0VarE.C(413421291);
                p2Var.g(gl1.y.Q(o0VarE, R.string.lbl_running), null, null, null, null, !iVar.C4(), false, !iVar.C4() ? new bb1.d(lVar, "RUNNING", 8) : null, o0VarE, 0, 222);
                o0VarE.g0(false);
            } else {
                o0VarE.C(413678839);
                o0VarE.g0(false);
            }
            if (((Boolean) iVar.f197620f.getValue()).booleanValue()) {
                o0VarE.C(413757548);
                p2Var.g(gl1.y.Q(o0VarE, R.string.lbl_wheelchair_pushing), null, null, null, null, iVar.C4(), false, iVar.C4() ? new bb1.d(lVar, "WHEELCHAIR_PUSHING", 8) : null, o0VarE, 0, 222);
                String strQ3 = gl1.y.Q(o0VarE, iVar.C4() ? R.string.msg_wheelchair_stride_disable : R.string.msg_wheelchair_stride_enable);
                fVar.getClass();
                x0 x0VarF2 = d92.c.f(j92.f.f97933j, o0VarE);
                bVar2.getClass();
                float f16 = eVar.f97920e;
                bVar2.getClass();
                mh.c(strQ3, l.z(aVar, f16, eVar.f97917b), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF2, o0VarE, 0, 0, 131068);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(414659927);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xk1.e(this, iVar, lVar, i14, 16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    public final void ea(String str, i iVar, e23.a<Unit> aVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(1707217293);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.r(iVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(this) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = n.f135158a;
            m0 m0VarI = gl1.y.I(new v0[0], o0VarE);
            boolean zR = o0VarE.r(iVar) | o0VarE.r(this) | ((i15 & 896) == 256) | o0VarE.r(m0VarI);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new wv0.h(iVar, this, aVar, m0VarI);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new wv0.h(iVar, this, aVar, m0VarI);
                    o0VarE.K(objQ);
                }
            }
            nc.y.b(m0VarI, str, null, null, null, null, null, null, (e23.l) objQ, o0VarE, (i15 << 3) & 112, 1020);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xr.n(this, str, iVar, aVar, i14, 8);
        }
    }

    public final void fa(String str, e23.a aVar, e eVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1472226090);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = n.f135158a;
            z02.d.a(false, z3.f.c(-1992647055, new uu1.i(str, aVar, 5), o0VarE), null, null, null, z3.f.c(362539245, new o(eVar, 20), o0VarE), o0VarE, 196656, 29);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xr.n(this, str, aVar, eVar, i14, 7);
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        i iVar = (i) this.f44199a.getValue();
        ArrayList arrayList = new ArrayList();
        String strX4 = i.x4(iVar.f197615a, i.y4());
        if (strX4 != null) {
            arrayList.add(new al1.b("RUNNING", strX4));
        }
        String strX5 = i.x4(iVar.f197616b, i.A4());
        if (strX5 != null) {
            arrayList.add(new al1.b("WALKING", strX5));
        }
        String strX6 = i.x4(iVar.f197617c, i.B4());
        if (strX6 != null) {
            arrayList.add(new al1.b("WHEELCHAIR_PUSHING", strX6));
        }
        if (!arrayList.isEmpty()) {
            Intent intent = new Intent();
            intent.putParcelableArrayListExtra("change_list_extra", new ArrayList<>(arrayList));
            setResult(-1, intent);
        }
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_composable_container);
        i iVar = (i) this.f44199a.getValue();
        iVar.f197615a = i.y4();
        iVar.f197616b = i.A4();
        iVar.f197617c = i.B4();
        String stringExtra = getIntent().getStringExtra("START_DESTINATION_EXTRA");
        if (stringExtra == null) {
            stringExtra = "HomeSettingsScreen";
        }
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new e(-1741659653, true, new yk1.c(this, stringExtra, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/usersettings/stride/StrideLengthSettingsActivity$a;", "", "<init>", "()V", "", "HOME_SETTINGS_SCREEN", "Ljava/lang/String;", "WALKING_SCREEN", "RUNNING_SCREEN", "WHEELCHAIR_PUSHING_SCREEN", "START_DESTINATION_EXTRA", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
