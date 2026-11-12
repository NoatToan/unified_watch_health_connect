package sa0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.WifiSetup;
import d53.w;
import gl1.y;
import h5.e0;
import i3.mh;
import java.util.ArrayList;
import java.util.List;
import o4.m1;
import o4.r1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import v62.ia;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.wifi.p f158161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<com.garmin.android.apps.connectmobile.settings.devices.wifi.p> f158162b;

        public a(com.garmin.android.apps.connectmobile.settings.devices.wifi.p pVar, p1<com.garmin.android.apps.connectmobile.settings.devices.wifi.p> p1Var) {
            this.f158161a = pVar;
            this.f158162b = p1Var;
        }

        @Override // e23.a
        public final Unit invoke() {
            this.f158162b.setValue(this.f158161a);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: sa0.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2989b implements e23.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2989b f158163a = new C2989b();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f158164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f158165b;

        public c(e23.l lVar, List list) {
            this.f158164a = lVar;
            this.f158165b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f158164a.invoke(this.f158165b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f158166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f158167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1 f158168c;

        public d(List list, List list2, p1 p1Var) {
            this.f158166a = list;
            this.f158167b = list2;
            this.f158168c = p1Var;
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00bd  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // e23.r
        public final Unit invoke(e2.d dVar, Integer num, p3.m mVar, Integer num2) {
            int i14;
            r1 r1VarC;
            e2.d dVar2 = dVar;
            int iIntValue = num.intValue();
            p3.m mVar2 = mVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i14 = (mVar2.B(dVar2) ? 4 : 2) | iIntValue2;
            } else {
                i14 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i14 |= mVar2.k(iIntValue) ? 32 : 16;
            }
            if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
                x1 x1Var = p3.n.f135158a;
                com.garmin.android.apps.connectmobile.settings.devices.wifi.p pVar = (com.garmin.android.apps.connectmobile.settings.devices.wifi.p) this.f158166a.get(iIntValue);
                mVar2.C(-289078581);
                List list = this.f158167b;
                if (p005kotlin.jvm.internal.s.g(pVar, h0.b0(list))) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f14 = j92.b.f97899b.f97918c;
                    r1VarC = k2.i.c(f14, f14, 0.0f, 0.0f, 12);
                } else if (p005kotlin.jvm.internal.s.g(pVar, h0.m0(list))) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f15 = j92.b.f97899b.f97918c;
                    r1VarC = k2.i.c(0.0f, 0.0f, f15, f15, 3);
                } else {
                    r1VarC = m1.f128891a;
                }
                r1 r1Var = r1VarC;
                String str = pVar.f43398a;
                p1 p1Var = this.f158168c;
                boolean z14 = ((com.garmin.android.apps.connectmobile.settings.devices.wifi.p) p1Var.getF182175a()).f43399b == pVar.f43399b;
                boolean zR = mVar2.r(pVar);
                Object objQ = mVar2.q();
                if (zR) {
                    objQ = new a(pVar, p1Var);
                    mVar2.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new a(pVar, p1Var);
                        mVar2.K(objQ);
                    }
                }
                b.c(0, (e23.a) objQ, str, r1Var, mVar2, z14);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(String str, List<? extends WifiSetup.SecurityType> list, e23.l<? super WifiSetup.ScannedAccessPoint, Unit> lVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(1417260997);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.r(list) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n("");
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            ArrayList arrayListA = com.garmin.android.apps.connectmobile.settings.devices.wifi.q.a(context, list, str);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(arrayListA.get(0));
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            String strQ = y.Q(o0VarE, R.string.activity_add_manually_label);
            s62.a.f157643a.getClass();
            u4.d dVarA = ia.a(t62.b.f162798a);
            String strQ2 = y.Q(o0VarE, R.string.lbl_next);
            boolean z14 = (i15 & 896) == 256;
            Object objQ3 = o0VarE.q();
            if (z14 || objQ3 == c2565a) {
                objQ3 = new lm0.o(lVar, p1Var, p1Var2, 5);
                o0VarE.K(objQ3);
            }
            o0Var = o0VarE;
            da0.p.b("wifi_add_manually_screen", strQ, dVarA, null, null, strQ2, (e23.a) objQ3, !w.J((String) p1Var.getF182175a()), null, null, false, null, null, false, false, aVar, null, null, null, null, null, z3.f.c(-1597516603, new ng2.i(arrayListA, 20, p1Var, p1Var2), o0VarE), o0Var, 6, (i15 << 6) & 458752, 384, 4161304);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sa0.a(str, list, lVar, aVar, i14, 1);
        }
    }

    public static final void b(String str, List<? extends WifiSetup.SecurityType> list, e23.l<? super WifiSetup.ScannedAccessPoint, Unit> lVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        str.getClass();
        lVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(241644186);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.r(list) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            a(str, list, lVar, aVar, o0VarE, i15 & 8190);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sa0.a(str, list, lVar, aVar, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a1  */
    public static final void c(int i14, e23.a aVar, String str, r1 r1Var, p3.m mVar, boolean z14) {
        o0 o0Var;
        long jB;
        o0 o0VarE = mVar.E(-239841261);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(r1Var) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            if (z14) {
                o0VarE.C(1440787835);
                d92.b.f58623a.getClass();
                jB = d92.b.a(o0VarE).c().g();
                o0VarE.g0(false);
            } else {
                o0VarE.C(1440789019);
                jB = com.nimbusds.jose.shaded.gson.internal.a.b(d92.b.f58623a, o0VarE, false);
            }
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarE = u1.n.e(x2.f(aVar2, 1.0f), jB, r1Var);
            boolean z15 = (i15 & 7168) == 2048;
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new rk0.y(aVar, 20);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new rk0.y(aVar, 20);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarD = u1.w.d(rVarE, false, null, null, (e23.a) objQ, 15);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarY = c2.l.y(rVarD, j92.b.f97899b.f97920e);
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarY, o0VarE);
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
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            d92.b.f58624b.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, i15 & 14, 0, 131070);
            o0Var = o0VarE;
            c2.l.f(u2Var.a(aVar2, 1.0f, true), o0Var);
            if (z14) {
                o0Var.C(696393517);
                da0.y.a(null, 0.0f, o0Var, 0, 3);
                o0Var.g0(false);
            } else {
                o0Var.C(696430035);
                o0Var.g0(false);
            }
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ka0.d(str, r1Var, z14, aVar, i14);
        }
    }
}
