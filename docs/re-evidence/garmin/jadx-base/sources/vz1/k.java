package vz1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.HorseshoePieChart;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e2.i0;
import e2.k0;
import f72.i2;
import gl1.y;
import i3.mc;
import l72.j0;
import o53.b0;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p13.w;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import r53.q2;
import sz1.t;
import vv0.u;

/* JADX INFO: loaded from: classes10.dex */
public final class k {
    /* JADX WARN: Code duplicated, block: B:32:0x0084  */
    public static final void a(y31.a aVar, e23.l lVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(2011401341);
        int i15 = (o0VarE.k(aVar == null ? -1 : aVar.ordinal()) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            i0 i0VarA = k0.a(0, 0, 3, o0VarE);
            i53.c cVarE = i53.a.e(w.c(new j0(y.Q(o0VarE, R.string.ohrv_chip_title_overnight_averages), null, null, false, aVar != null, 14, null)));
            f82.b bVar = new f82.b();
            boolean z14 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new b71.n(lVar, 27, (byte) 0);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new b71.n(lVar, 27, (byte) 0);
                    o0VarE.K(objQ);
                }
            }
            e82.a.b(cVarE, bVar, i0VarA, null, null, (e23.p) objQ, o0VarE, 0, 24);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vq0.a((Object) aVar, lVar, i14, 14);
        }
    }

    public static final void b(DateTime dateTime, DateTime dateTime2, oz1.a aVar, t tVar, oz1.b bVar, mc mcVar, b0 b0Var, p3.m mVar, int i14) {
        Object obj;
        int i15;
        Object obj2;
        Object obj3;
        b0 b0Var2;
        aVar.getClass();
        int i16 = aVar.f134492c;
        b0Var.getClass();
        o0 o0VarE = mVar.E(574312012);
        if ((i14 & 6) == 0) {
            obj = dateTime;
            i15 = (o0VarE.r(obj) ? 4 : 2) | i14;
        } else {
            obj = dateTime;
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            obj2 = dateTime2;
            i15 |= o0VarE.r(obj2) ? 32 : 16;
        } else {
            obj2 = dateTime2;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            obj3 = tVar;
            i15 |= o0VarE.r(obj3) ? 2048 : 1024;
        } else {
            obj3 = tVar;
        }
        if ((i14 & 196608) == 0) {
            i15 |= o0VarE.B(mcVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            b0Var2 = b0Var;
            i15 |= o0VarE.r(b0Var2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            b0Var2 = b0Var;
        }
        if (o0VarE.n(i15 & 1, (590995 & i15) != 590994)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            oz1.h.f134549c.getClass();
            String strQ = y.Q(o0VarE, oz1.h.a.a(i16).f134558a);
            String strQ2 = y.Q(o0VarE, oz1.h.a.a(i16).f134559b);
            new HorseshoePieChart(context, null, 0, 6, null);
            String string = context.getString(R.string.common_no_certain_data, context.getString(R.string.ohrv_status));
            string.getClass();
            g41.a aVar2 = (g41.a) KoinJavaComponent.get$default(g41.a.class, null, null, 6, null);
            r53.p2 p2VarA = q2.a(new o41.b(aVar2.a()));
            p1 p1VarC = s9.c.c(r53.s.d(p2VarA), o0VarE);
            if (oz1.h.a.a(i16) != oz1.h.NONE) {
                o0VarE.C(-1819221267);
                int i17 = i15 >> 12;
                i.a(R.string.tr_factor_hrv_status, mcVar, b0Var2, strQ, strQ2, z3.f.c(1518681908, new j(obj, obj2, obj3, context, p1VarC, string, p2VarA, aVar2, 0), o0VarE), o0VarE, (i17 & 112) | 196608 | (i17 & 896));
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1813315085);
                s62.a.f157643a.getClass();
                u4.d dVarA = i2.a(t62.c.f162799a);
                Object objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new u(21);
                    o0VarE.K(objQ);
                }
                e23.a aVar3 = (e23.a) objQ;
                int i18 = i15 >> 15;
                l.a(mcVar, b0Var, R.string.tr_factor_hrv_status, dVarA, R.string.msg_not_enough_data, null, R.string.tr_feedback_hrv_no_data, aVar3, o0VarE, (i18 & 14) | 12779520 | (i18 & 112));
                o0VarE = o0VarE;
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.o(dateTime, dateTime2, aVar, tVar, bVar, mcVar, b0Var, i14, 26);
        }
    }

    public static final void c(HorseshoePieChart horseshoePieChart, i41.f fVar, Context context) {
        fVar.getClass();
        x31.c cVar = new x31.c(fVar);
        vz.a aVar = new vz.a(horseshoePieChart, new e41.b(context, false), new e41.c(horseshoePieChart));
        if (fVar.getWeeklyAvg() != null) {
            aVar.a(cVar.f188585a);
        }
    }
}
