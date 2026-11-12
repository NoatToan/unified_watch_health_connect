package da0;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.ve;
import l72.v2;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class v {
    /* JADX WARN: Code duplicated, block: B:91:0x0152  */
    public static final void a(h4.r rVar, boolean z14, boolean z15, String str, String str2, String str3, String str4, e23.l<? super Boolean, Unit> lVar, p3.m mVar, int i14, int i15) {
        int i16;
        boolean z16;
        int i17;
        String str5;
        int i18;
        String str6;
        int i19;
        o0 o0Var;
        h4.r rVar2;
        boolean z17;
        String str7;
        String str8;
        long jB;
        h4.g.b bVar;
        str.getClass();
        str3.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-531083517);
        int i24 = i15 & 1;
        if (i24 != 0) {
            i16 = i14 | 6;
        } else {
            i16 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        }
        int i25 = i16 | (o0VarE.h(z14) ? 32 : 16);
        int i26 = i15 & 4;
        if (i26 != 0) {
            i17 = i25 | 384;
            z16 = z15;
        } else {
            z16 = z15;
            i17 = i25 | (o0VarE.h(z16) ? 256 : 128);
        }
        int i27 = i17 | (o0VarE.B(str) ? 2048 : 1024);
        int i28 = i15 & 16;
        if (i28 != 0) {
            i18 = i27 | 24576;
            str5 = str2;
        } else {
            str5 = str2;
            i18 = i27 | (o0VarE.B(str5) ? 16384 : 8192);
        }
        int i29 = i18 | (o0VarE.B(str3) ? 131072 : 65536);
        int i30 = i15 & 64;
        if (i30 != 0) {
            i19 = i29 | 1572864;
            str6 = str4;
        } else {
            str6 = str4;
            i19 = i29 | (o0VarE.B(str6) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        }
        int i34 = i19 | (o0VarE.r(lVar) ? 8388608 : 4194304);
        if (o0VarE.n(i34 & 1, (i34 & 4793491) != 4793490)) {
            h4.r rVar3 = i24 != 0 ? h4.r.S : rVar;
            boolean z18 = i26 != 0 ? true : z16;
            if (i28 != 0) {
                str5 = null;
            }
            String str9 = i30 == 0 ? str6 : null;
            x1 x1Var = p3.n.f135158a;
            if (z14) {
                o0VarE.C(729859115);
                d92.b.f58623a.getClass();
                jB = d92.b.a(o0VarE).c().g();
                o0VarE.g0(false);
            } else {
                o0VarE.C(729860299);
                jB = com.nimbusds.jose.shaded.gson.internal.a.b(d92.b.f58623a, o0VarE, false);
            }
            d92.b.f58623a.getClass();
            long jE = d92.b.a(o0VarE).j().e();
            if (str5 == null && str9 == null) {
                h4.d.f81522a.getClass();
                bVar = h4.d.a.f81534l;
            } else {
                h4.d.f81522a.getClass();
                bVar = h4.d.a.f81533k;
            }
            boolean z19 = z18;
            int i35 = i34 & 112;
            boolean z24 = ((i34 & 29360128) == 8388608) | (i35 == 32);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (z24) {
                objQ = new ad0.e(lVar, z14, 2);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ad0.e(lVar, z14, 2);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVar4 = rVar3;
            String str10 = str9;
            h4.g.b bVar2 = bVar;
            h4.r rVarA = v2.a(j2.b.b(rVar4, z14, z19, null, (e23.a) objQ, 12), z14, new aa2.e(jE, 1), o0VarE, i35);
            Object objQ2 = o0VarE.q();
            aVar.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new d81.t(5);
                o0VarE.K(objQ2);
            }
            h4.r rVarC = p5.v.c((e23.l) objQ2, rVarA, true);
            d92.b.f58625c.getClass();
            str7 = str5;
            o0Var = o0VarE;
            ve.a(rVarC, k2.i.a(j92.b.f97899b.f97918c), jB, 0L, 0.0f, 0.0f, null, z3.f.c(-1870016376, new ck0.h(bVar2, str, str3, z14, str7, str10, 3), o0VarE), o0Var, 12582912, 120);
            str8 = str10;
            rVar2 = rVar4;
            z17 = z19;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
            z17 = z16;
            str7 = str5;
            str8 = str6;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq.i(rVar2, z14, z17, str, str7, str3, str8, lVar, i14, i15);
        }
    }
}
