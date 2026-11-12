package dk0;

import aq.m2;
import com.google.android.exoplayer2.audio.WavUtil;
import h4.r;
import i3.mh;
import o4.q1;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;
import s5.i0;
import s5.r0;
import s5.x0;
import w5.b0;
import w5.c0;
import w5.f0;
import w5.q;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public static final void a(r rVar, f fVar, int i14, p3.m mVar, int i15, int i16) {
        r rVar2;
        int i17;
        int i18;
        o0 o0Var;
        r rVar3;
        s5.c.b bVarH;
        int iJ;
        int iG;
        fVar.getClass();
        o0 o0VarE = mVar.E(120728070);
        int i19 = i16 & 1;
        if (i19 != 0) {
            i17 = i15 | 6;
            rVar2 = rVar;
        } else if ((i15 & 6) == 0) {
            rVar2 = rVar;
            i17 = (o0VarE.B(rVar2) ? 4 : 2) | i15;
        } else {
            rVar2 = rVar;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= o0VarE.B(fVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i18 = i14;
            i17 |= o0VarE.k(i18) ? 256 : 128;
        } else {
            i18 = i14;
        }
        if (o0VarE.n(i17 & 1, (i17 & 147) != 146)) {
            o0VarE.G0();
            try {
                try {
                    if ((i15 & 1) == 0 || o0VarE.o0()) {
                        if (i19 != 0) {
                            rVar3 = r.S;
                        }
                        o0VarE.h0();
                        x1 x1Var = p3.n.f135158a;
                        bVarH = l2.h(o0VarE, 55564223, 0, 1, null);
                        d92.b.f58623a.getClass();
                        iJ = bVarH.j(new i0(d92.b.a(o0VarE).k().d(), 0L, (f0) null, (b0) null, (c0) null, (q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null));
                        bVarH.b(fVar.f60178a);
                        Unit unit = Unit.INSTANCE;
                        bVarH.f(iJ);
                        bVarH.b(StringUtils.SPACE);
                        iG = bVarH.g(new s5.m.b(fVar.f60180c, new r0(new i0(hb.a.e(o0VarE), 0L, (f0) null, (b0) null, (c0) null, (q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null), null, null, null, 14, null), null, 4, null));
                        bVarH.b(fVar.f60179b);
                        bVarH.f(iG);
                        int i24 = i17;
                        s5.c cVarK = bVarH.k();
                        o0VarE.g0(false);
                        d92.b.f58624b.getClass();
                        o0Var = o0VarE;
                        mh.d(cVarK, rVar3, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, x0.a(j92.f.f97935l, 0L, 0L, null, null, 0L, null, null, i18, 0L, null, null, 16744447), o0Var, (i24 << 3) & 112, 0, 262140);
                    } else {
                        o0VarE.e();
                    }
                    bVarH.b(fVar.f60179b);
                    bVarH.f(iG);
                    int i25 = i17;
                    s5.c cVarK2 = bVarH.k();
                    o0VarE.g0(false);
                    d92.b.f58624b.getClass();
                    o0Var = o0VarE;
                    mh.d(cVarK2, rVar3, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, x0.a(j92.f.f97935l, 0L, 0L, null, null, 0L, null, null, i18, 0L, null, null, 16744447), o0Var, (i25 << 3) & 112, 0, 262140);
                } catch (Throwable th3) {
                    bVarH.f(iG);
                    throw th3;
                }
                bVarH.b(fVar.f60178a);
                Unit unit2 = Unit.INSTANCE;
                bVarH.f(iJ);
                bVarH.b(StringUtils.SPACE);
                iG = bVarH.g(new s5.m.b(fVar.f60180c, new r0(new i0(hb.a.e(o0VarE), 0L, (f0) null, (b0) null, (c0) null, (q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null), null, null, null, 14, null), null, 4, null));
            } catch (Throwable th4) {
                bVarH.f(iJ);
                throw th4;
            }
            rVar3 = rVar2;
            o0VarE.h0();
            x1 x1Var2 = p3.n.f135158a;
            bVarH = l2.h(o0VarE, 55564223, 0, 1, null);
            d92.b.f58623a.getClass();
            iJ = bVarH.j(new i0(d92.b.a(o0VarE).k().d(), 0L, (f0) null, (b0) null, (c0) null, (q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null));
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar3 = rVar2;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m2(rVar3, fVar, i14, i15, i16, 1);
        }
    }
}
