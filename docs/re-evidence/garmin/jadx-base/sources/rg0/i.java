package rg0;

import b21.n9;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import ei0.u0;
import i3.mh;
import java.util.List;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import p3.o0;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes8.dex */
public final class i {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f152562a;

        static {
            int[] iArr = new int[u0.a.b.values().length];
            try {
                iArr[u0.a.b.RequestSent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u0.a.b.Added.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f152562a = iArr;
        }
    }

    public static final void a(List list, h4.r rVar, boolean z14, int i14, e23.a aVar, e23.l lVar, p3.m mVar, int i15) {
        o0 o0VarO = androidx.room.a0.o(aVar, lVar, mVar, 2019179332);
        int i16 = i15 | (o0VarO.r(list) ? 4 : 2) | (o0VarO.B(rVar) ? 32 : 16) | (o0VarO.h(z14) ? 256 : 128) | (o0VarO.k(i14) ? 2048 : 1024) | (o0VarO.r(aVar) ? 16384 : 8192) | (o0VarO.r(lVar) ? 131072 : 65536);
        if (o0VarO.n(i16 & 1, (74899 & i16) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            m3.l.b(z14, aVar, rVar, null, null, null, z3.f.c(-2011317858, new as.q(i14, list, lVar, 6), o0VarO), o0VarO, ((i16 >> 6) & 14) | 1572864 | ((i16 >> 9) & 112) | ((i16 << 3) & 896), 56);
        } else {
            o0VarO.e();
        }
        p2 p2VarI0 = o0VarO.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.l(list, rVar, z14, i14, aVar, lVar, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0147  */
    public static final void b(b12.b bVar, String str, String str2, boolean z14, u0.a.b bVar2, h4.r rVar, e23.a aVar, p3.m mVar, int i14) {
        String strH;
        bVar.getClass();
        str.getClass();
        str2.getClass();
        bVar2.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-1210564263);
        int i15 = i14 | ((i14 & 8) == 0 ? o0VarE.B(bVar) : o0VarE.r(bVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024) | (o0VarE.k(bVar2.ordinal()) ? 16384 : 8192) | (o0VarE.B(rVar) ? 131072 : 65536) | (o0VarE.r(aVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            o0VarE.C(583890164);
            if (g22.n.d(str2)) {
                o0VarE.C(-1026593341);
                strH = com.nimbusds.jose.shaded.gson.internal.a.h(str, gl1.y.Q(o0VarE, R.string.common_comma), StringUtils.SPACE, str2);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1759563876);
                o0VarE.g0(false);
                strH = str;
            }
            if (bVar2 == u0.a.b.RequestSent) {
                o0VarE.C(-1759488577);
                strH = com.nimbusds.jose.shaded.gson.internal.a.h(strH, gl1.y.Q(o0VarE, R.string.common_comma), StringUtils.SPACE, gl1.y.Q(o0VarE, R.string.connection_request_sent));
                o0VarE.g0(false);
            } else if (bVar2 == u0.a.b.Added) {
                o0VarE.C(-1759302484);
                strH = com.nimbusds.jose.shaded.gson.internal.a.h(strH, gl1.y.Q(o0VarE, R.string.common_comma), StringUtils.SPACE, gl1.y.Q(o0VarE, R.string.wifi_added));
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1759194852);
                o0VarE.g0(false);
            }
            if (z14) {
                o0VarE.C(-1026578629);
                strH = com.nimbusds.jose.shaded.gson.internal.a.h(strH, gl1.y.Q(o0VarE, R.string.common_comma), StringUtils.SPACE, gl1.y.Q(o0VarE, R.string.activities_extended_map_legend_selected));
            } else {
                o0VarE.C(-1759053988);
            }
            o0VarE.g0(false);
            o0VarE.g0(false);
            l72.p2 p2Var = l72.p2.f111205a;
            boolean zB = o0VarE.B(strH);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new o60.b(strH, 22);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new o60.b(strH, 22);
                    o0VarE.K(objQ);
                }
            }
            int i16 = i15 >> 3;
            p2Var.h(str, str2, null, p5.v.b(rVar, (e23.l) objQ), null, false, false, z3.f.c(-1308179097, new r12.a(bVar, 13), o0VarE), z3.f.c(-1425815866, new ap2.f(bVar2, z14, 17), o0VarE), null, aVar, o0VarE, (i16 & 14) | 113246208 | (i16 & 112), (i15 >> 18) & 14, 628);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n9(bVar, str, str2, z14, bVar2, rVar, aVar, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0085  */
    public static final void c(int i14, h4.r rVar, String str, p3.m mVar) {
        o0 o0Var;
        str.getClass();
        o0 o0VarE = mVar.E(1362417109);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.B(rVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            String strP = gl1.y.P(R.string.x_heading, new Object[]{str}, o0VarE);
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97934k, o0VarE);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarZ = c2.l.z(rVar, f14, eVar.f97917b);
            boolean zB = o0VarE.B(strP);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new o60.b(strP, 21);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new o60.b(strP, 21);
                    o0VarE.K(objQ);
                }
            }
            o0Var = o0VarE;
            mh.c(upperCase, p5.v.c((e23.l) objQ, rVarZ, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0Var, 0, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq.g(str, rVar, i14, 5);
        }
    }
}
