package ya0;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class h0 {
    public static final void a(String str, String str2, o90.a aVar, String str3, String str4, String str5, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.l<? super Float, Unit> lVar, p3.m mVar, int i14) {
        int i15;
        e23.a<Unit> aVar4;
        o0 o0Var;
        o0 o0VarE = mVar.E(-2050306062);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(str3) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(str4) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.B(str5) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            aVar4 = aVar2;
            i15 |= o0VarE.r(aVar4) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            aVar4 = aVar2;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(aVar3) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i15 |= o0VarE.r(lVar) ? 67108864 : 33554432;
        }
        if (o0VarE.n(i15 & 1, (38347923 & i15) != 38347922)) {
            x1 x1Var = p3.n.f135158a;
            o0Var = o0VarE;
            da0.p.c(str, str2, aVar, str3, false, null, null, null, gl1.y.Q(o0VarE, R.string.lbl_yes), aVar4, false, gl1.y.Q(o0VarE, R.string.lbl_no), aVar3, false, null, null, false, false, null, lVar, null, null, z3.f.c(1985520657, new c40.i(str4, str5, 15), o0VarE), o0Var, (i15 & 8190) | ((i15 << 9) & 1879048192), ((i15 >> 15) & 896) | ((i15 << 3) & 1879048192), 3072, 7857392);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fo.b(str, str2, aVar, str3, str4, str5, aVar2, aVar3, lVar, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009a  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8  */
    public static final void b(q90.c cVar, String str, e23.l<? super Boolean, Unit> lVar, e23.l<? super Float, Unit> lVar2, p3.m mVar, int i14) {
        cVar.getClass();
        str.getClass();
        lVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(-10722148);
        int i15 = i14 | (o0VarE.r(cVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(lVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            l90.b bVar = cVar.f143495c;
            String str2 = bVar.f111521f;
            o90.a aVar = bVar.f111526k;
            String strQ = gl1.y.Q(o0VarE, R.string.primary_training_device);
            String strP = gl1.y.P(R.string.primary_training_current_device_description, new Object[]{str}, o0VarE);
            String strP2 = gl1.y.P(R.string.lbl_update_primary_training, new Object[]{str2}, o0VarE);
            int i16 = i15 & 896;
            boolean z14 = i16 == 256;
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (z14) {
                objQ = new ub0.h(lVar, 29);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ub0.h(lVar, 29);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar3 = (e23.a) objQ;
            boolean z15 = i16 == 256;
            Object objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new f0(lVar, 0);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new f0(lVar, 0);
                    o0VarE.K(objQ2);
                }
            }
            a("device_pairing_primary_training_screen", str2, aVar, strQ, strP, strP2, aVar3, (e23.a) objQ2, lVar2, o0VarE, ((i15 << 15) & 234881024) | 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g0(cVar, str, lVar, lVar2, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009c  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b7  */
    public static final void c(q90.c cVar, String str, e23.l<? super Boolean, Unit> lVar, e23.l<? super Float, Unit> lVar2, p3.m mVar, int i14) {
        cVar.getClass();
        str.getClass();
        lVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(-1648947941);
        int i15 = i14 | (o0VarE.r(cVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(lVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            l90.b bVar = cVar.f143495c;
            String str2 = bVar.f111521f;
            o90.a aVar = bVar.f111526k;
            String strQ = gl1.y.Q(o0VarE, R.string.primary_wearable);
            String strP = gl1.y.P(R.string.primary_wearable_current_device_description, new Object[]{str}, o0VarE);
            String strP2 = gl1.y.P(R.string.lbl_update_primary_wearable, new Object[]{str2}, o0VarE);
            int i16 = i15 & 896;
            boolean z14 = i16 == 256;
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (z14) {
                objQ = new f0(lVar, 1);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new f0(lVar, 1);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar3 = (e23.a) objQ;
            boolean z15 = i16 == 256;
            Object objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new f0(lVar, 2);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new f0(lVar, 2);
                    o0VarE.K(objQ2);
                }
            }
            a("device_pairing_primary_wearable_screen", str2, aVar, strQ, strP, strP2, aVar3, (e23.a) objQ2, lVar2, o0VarE, ((i15 << 15) & 234881024) | 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g0(cVar, str, lVar, lVar2, i14, 1);
        }
    }
}
