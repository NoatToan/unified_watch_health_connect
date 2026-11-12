package h82;

import a42.a0;
import android.text.Html;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import c2.u;
import c2.x2;
import c2.z;
import c22.e0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.audio.WavUtil;
import f5.z0;
import gl1.y;
import i3.e5;
import i3.mh;
import java.util.ArrayList;
import o4.m1;
import o4.q1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import s5.a1;
import s5.i0;
import s5.x0;
import u1.m0;
import u1.w;
import w5.b0;
import w5.c0;
import w5.f0;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh82/r;", "", "<init>", "()V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f82497a = new r();

    private r() {
    }

    public static s5.c G(p3.m mVar, int i14) {
        x1 x1Var = p3.n.f135158a;
        Spanned spannedFromHtml = Html.fromHtml(y.Q(mVar, i14), 63);
        spannedFromHtml.getClass();
        s5.c.b bVar = new s5.c.b(0, 1, null);
        bVar.b(spannedFromHtml.toString());
        Object[] spans = spannedFromHtml.getSpans(0, spannedFromHtml.length(), Object.class);
        spans.getClass();
        for (Object obj : spans) {
            int spanStart = spannedFromHtml.getSpanStart(obj);
            int spanEnd = spannedFromHtml.getSpanEnd(obj);
            if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style == 1) {
                    f0.f182097b.getClass();
                    bVar.a(new i0(0L, 0L, f0.f182105j, (b0) null, (c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, 65531, (p005kotlin.jvm.internal.j) null), spanStart, spanEnd);
                } else if (style == 2) {
                    b0.f182070b.getClass();
                    bVar.a(new i0(0L, 0L, (f0) null, b0.a(b0.f182071c), (c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, 65527, (p005kotlin.jvm.internal.j) null), spanStart, spanEnd);
                } else if (style == 3) {
                    f0.f182097b.getClass();
                    f0 f0Var = f0.f182105j;
                    b0.f182070b.getClass();
                    bVar.a(new i0(0L, 0L, f0Var, b0.a(b0.f182071c), (c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, 65523, (p005kotlin.jvm.internal.j) null), spanStart, spanEnd);
                }
            } else if (obj instanceof UnderlineSpan) {
                d6.i.f57760b.getClass();
                bVar.a(new i0(0L, 0L, (f0) null, (b0) null, (c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, d6.i.f57762d, (q1) null, (s5.b0) null, (q4.g) null, 61439, (p005kotlin.jvm.internal.j) null), spanStart, spanEnd);
            } else if (obj instanceof ForegroundColorSpan) {
                bVar.a(new i0(o4.f0.b(((ForegroundColorSpan) obj).getForegroundColor()), 0L, (f0) null, (b0) null, (c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null), spanStart, spanEnd);
            }
        }
        s5.c cVarK = bVar.k();
        x1 x1Var2 = p3.n.f135158a;
        return cVarK;
    }

    public final void A(int i14, p3.m mVar, int i15) {
        int i16;
        o0 o0VarE = mVar.E(-1126401006);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.k(i14) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.B(this) ? 32 : 16;
        }
        int i17 = 0;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            z((i16 << 3) & 896, 2, y.Q(o0VarE, i14), o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j(this, i14, i15, i17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    public final void B(int i14, b92.a aVar, boolean z14, e23.a<Unit> aVar2, p3.m mVar, int i15, int i16) {
        int i17;
        boolean z15;
        boolean z16;
        b92.a aVar3;
        boolean z17;
        p2 p2VarI0;
        int i18;
        int i19;
        b92.a aVar4 = aVar;
        aVar2.getClass();
        o0 o0VarE = mVar.E(-1045460778);
        if ((i15 & 6) == 0) {
            i17 = (o0VarE.k(i14) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i24 = i16 & 2;
        if (i24 != 0) {
            i17 |= 48;
        } else if ((i15 & 48) == 0) {
            i17 |= (i15 & 64) == 0 ? o0VarE.B(aVar4) : o0VarE.r(aVar4) ? 32 : 16;
        }
        int i25 = i16 & 4;
        if (i25 == 0) {
            if ((i15 & 384) == 0) {
                z15 = z14;
                i17 |= o0VarE.h(z15) ? 256 : 128;
            }
            if ((i15 & 3072) == 0) {
                if (o0VarE.r(aVar2)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i17 |= i19;
            }
            if ((i15 & 24576) == 0) {
                if (o0VarE.B(this)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i17 |= i18;
            }
            if ((i17 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i17 & 1, z16)) {
                if (i24 != 0) {
                    aVar4 = null;
                }
                b92.a aVar5 = aVar4;
                boolean z18 = i25 == 0 ? z15 : false;
                x1 x1Var = p3.n.f135158a;
                String strQ = y.Q(o0VarE, i14);
                int i26 = b92.a.f16960b;
                C(strQ, aVar5, z18, aVar2, o0VarE, i17 & 65520, 0);
                aVar3 = aVar5;
                z17 = z18;
            } else {
                o0VarE.e();
                aVar3 = aVar4;
                z17 = z15;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e0(this, i14, aVar3, z17, aVar2, i15, i16);
            }
        }
        i17 |= 384;
        z15 = z14;
        if ((i15 & 3072) == 0) {
            if (o0VarE.r(aVar2)) {
                i19 = 2048;
            } else {
                i19 = 1024;
            }
            i17 |= i19;
        }
        if ((i15 & 24576) == 0) {
            if (o0VarE.B(this)) {
                i18 = 16384;
            } else {
                i18 = 8192;
            }
            i17 |= i18;
        }
        if ((i17 & 9363) != 9362) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i17 & 1, z16)) {
            if (i24 != 0) {
                aVar4 = null;
            }
            b92.a aVar6 = aVar4;
            if (i25 == 0) {
            }
            x1 x1Var2 = p3.n.f135158a;
            String strQ2 = y.Q(o0VarE, i14);
            int i27 = b92.a.f16960b;
            C(strQ2, aVar6, z18, aVar2, o0VarE, i17 & 65520, 0);
            aVar3 = aVar6;
            z17 = z18;
        } else {
            o0VarE.e();
            aVar3 = aVar4;
            z17 = z15;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e0(this, i14, aVar3, z17, aVar2, i15, i16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0065  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x007c  */
    /* JADX WARN: Code duplicated, block: B:50:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0081  */
    /* JADX WARN: Code duplicated, block: B:53:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public final void C(String str, b92.a aVar, boolean z14, e23.a<Unit> aVar2, p3.m mVar, int i14, int i15) {
        int i16;
        boolean z15;
        boolean z16;
        boolean z17;
        b92.a aVar3;
        p2 p2VarI0;
        boolean z18;
        int i17;
        o0 o0VarL = vb.h.l(-566078536, aVar2, str, mVar);
        if ((i14 & 6) == 0) {
            i16 = (o0VarL.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i18 = i15 & 2;
        if (i18 != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= (i14 & 64) == 0 ? o0VarL.B(aVar) : o0VarL.r(aVar) ? 32 : 16;
        }
        int i19 = i15 & 4;
        if (i19 == 0) {
            if ((i14 & 384) == 0) {
                z15 = z14;
                i16 |= o0VarL.h(z15) ? 256 : 128;
            }
            if ((i14 & 3072) == 0) {
                if (o0VarL.r(aVar2)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i16 |= i17;
            }
            if ((i16 & 1171) != 1170) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarL.n(i16 & 1, z16)) {
                if (i18 != 0) {
                    aVar = null;
                }
                if (i19 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                x1 x1Var = p3.n.f135158a;
                int i24 = i16;
                l72.p2 p2Var = l72.p2.f111205a;
                int i25 = b92.a.f16960b;
                aVar3 = aVar;
                p2Var.g(str, null, aVar3, null, null, false, z18, aVar2, o0VarL, (i24 & 14) | ((i24 << 3) & 896) | ((i24 << 12) & 3670016) | ((i24 << 15) & 234881024), 186);
                z17 = z18;
            } else {
                o0VarL.e();
                z17 = z15;
                aVar3 = aVar;
            }
            p2VarI0 = o0VarL.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a82.a(this, str, aVar3, z17, aVar2, i14, i15, 7);
            }
        }
        i16 |= 384;
        z15 = z14;
        if ((i14 & 3072) == 0) {
            if (o0VarL.r(aVar2)) {
                i17 = 2048;
            } else {
                i17 = 1024;
            }
            i16 |= i17;
        }
        if ((i16 & 1171) != 1170) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarL.n(i16 & 1, z16)) {
            if (i18 != 0) {
                aVar = null;
            }
            if (i19 != 0) {
                z18 = false;
            } else {
                z18 = z15;
            }
            x1 x1Var2 = p3.n.f135158a;
            int i26 = i16;
            l72.p2 p2Var2 = l72.p2.f111205a;
            int i27 = b92.a.f16960b;
            aVar3 = aVar;
            p2Var2.g(str, null, aVar3, null, null, false, z18, aVar2, o0VarL, (i26 & 14) | ((i26 << 3) & 896) | ((i26 << 12) & 3670016) | ((i26 << 15) & 234881024), 186);
            z17 = z18;
        } else {
            o0VarL.e();
            z17 = z15;
            aVar3 = aVar;
        }
        p2VarI0 = o0VarL.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.a(this, str, aVar3, z17, aVar2, i14, i15, 7);
        }
    }

    public final void D(int i14, p3.m mVar, int i15) {
        int i16;
        o0 o0VarE = mVar.E(1839977177);
        int i17 = 2;
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.k(i14) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.B(this) ? 32 : 16;
        }
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            E(y.Q(o0VarE, i14), o0VarE, (i16 << 3) & 896);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j(this, i14, i15, i17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0073  */
    public final void E(String str, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        str.getClass();
        o0 o0VarE = mVar.E(2035089724);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(str) ? 4 : 2);
        } else {
            i15 = i14;
        }
        int i16 = i15 | 48;
        int i17 = 18;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97930g), o0VarE);
            h4.r.a aVar = h4.r.S;
            float f14 = 16;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarA = m0.a(c2.l.C(aVar, f14, f14, f14, 0.0f, 8), true, null);
            boolean zB = o0VarE.B(str);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new gp.j(str, i17);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new gp.j(str, i17);
                    o0VarE.K(objQ);
                }
            }
            o0Var = o0VarE;
            mh.c(str, v.c((e23.l) objQ, rVarA, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0Var, i16 & 14, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(this, str, i14, 1);
        }
    }

    public final void F(s5.c cVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        o0 o0VarE = mVar.E(1226599231);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(cVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97930g), o0VarE);
            h4.r.a aVar = h4.r.S;
            float f14 = 16;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarA = m0.a(c2.l.C(aVar, f14, f14, f14, 0.0f, 8), true, null);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new h02.a(22);
                o0VarE.K(objQ);
            }
            o0Var = o0VarE;
            mh.d(cVar, v.c((e23.l) objQ, rVarA, false), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, x0VarB, o0Var, i15 & 14, 0, 262140);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(this, cVar, i14, 0);
        }
    }

    public final void a(z3.e eVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(380286950);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(eVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            g6.f.a aVar = g6.f.f75994b;
            c2.l.f(c2.l.C(h4.r.S, 0.0f, 16, 0.0f, 0.0f, 13), o0VarE);
            eVar.invoke(o0VarE, Integer.valueOf(i15 & 14));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f2.o(this, eVar, i14, 17);
        }
    }

    public final void b(float f14, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        o0 o0VarE = mVar.E(1421363537);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.k(R.string.lbl_video_load_failed) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.i(f14) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarH = x2.h(x2.f(aVar, 1.0f), f14);
            d92.b.f58623a.getClass();
            h4.r rVarE = u1.n.e(rVarH, d92.b.a(o0VarE).f().d(), m1.f128891a);
            float f15 = 8;
            g6.f.a aVar2 = g6.f.f75994b;
            float f16 = 16;
            h4.r rVarB = c2.l.B(rVarE, f15, f16, f16, f15);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u uVar = u.f22885a;
            String strQ = y.Q(o0VarE, R.string.lbl_video_load_failed);
            h4.r rVarC2 = uVar.c(aVar, h4.d.a.f81528f);
            d92.b.f58624b.getClass();
            mh.c(strQ, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(j92.f.f97931h, p6.b.b(o0VarE), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 0, 131068);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q(this, f14, i14);
        }
    }

    public final void c(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(685912435);
        int i15 = i14 & 1;
        int i16 = 0;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = p3.n.f135158a;
            g6.f.a aVar = g6.f.f75994b;
            c2.l.f(c2.l.C(h4.r.S, 0.0f, 16, 0.0f, 0.0f, 13), o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m(this, i14, i16);
        }
    }

    public final void d(int i14, int i15, int i16, String str, p3.m mVar) {
        int i17;
        String str2;
        o0 o0VarE = mVar.E(-1042152860);
        if ((i15 & 6) == 0) {
            i17 = (o0VarE.k(i14) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i18 = i16 & 2;
        if (i18 != 0) {
            i17 |= 48;
        } else if ((i15 & 48) == 0) {
            i17 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= o0VarE.B(this) ? 256 : 128;
        }
        if (o0VarE.n(i17 & 1, (i17 & 147) != 146)) {
            String str3 = i18 != 0 ? null : str;
            x1 x1Var = p3.n.f135158a;
            e(i17 & 1008, 0, y.Q(o0VarE, i14), str3, o0VarE);
            str2 = str3;
        } else {
            o0VarE.e();
            str2 = str;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(this, i14, str2, i15, i16, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0084  */
    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0091  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:51:0x0109  */
    /* JADX WARN: Code duplicated, block: B:54:0x0158  */
    /* JADX WARN: Code duplicated, block: B:55:0x015a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0161  */
    /* JADX WARN: Code duplicated, block: B:60:0x016a  */
    /* JADX WARN: Code duplicated, block: B:62:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:64:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    public final void e(int i14, int i15, String str, String str2, p3.m mVar) {
        int i16;
        String str3;
        boolean z14;
        o0 o0Var;
        String str4;
        p2 p2VarI0;
        String str5;
        h4.r.a aVar;
        h4.g gVar;
        z0 z0VarD;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar2;
        h5.g.a.e eVar;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar;
        h5.g.a.f fVar;
        z0 z0VarD2;
        int iHashCode2;
        i2 i2VarA1;
        h4.r rVarC2;
        boolean z15;
        Object objQ;
        str.getClass();
        o0 o0VarE = mVar.E(585907894);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i16 = i14 | (o0VarE.B(str) ? 4 : 2);
        } else {
            i16 = i14;
        }
        int i17 = i15 & 2;
        if (i17 == 0) {
            if ((i14 & 48) == 0) {
                str3 = str2;
                i16 |= o0VarE.B(str3) ? 32 : 16;
            }
            if ((i16 & 19) != 18) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i17 != 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                x1 x1Var = p3.n.f135158a;
                aVar = h4.r.S;
                g6.f.a aVar3 = g6.f.f75994b;
                h4.r rVarA = c2.l.A(aVar, 16, 0.0f, 2);
                h4.d.f81522a.getClass();
                gVar = h4.d.a.f81524b;
                z0VarD = c2.q.d(gVar, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarA, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                eVar = h5.g.a.f81810g;
                b4.c(eVar, z0VarD, o0VarE);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                u uVar = u.f22885a;
                h4.r rVarC3 = c2.l.C(aVar, 0.0f, 6, 0.0f, 0.0f, 13);
                z0VarD2 = c2.q.d(gVar, false);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarC3, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, z0VarD2, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                h4.r rVarB = l4.k.b(x2.q(aVar, 7), k2.i.f102406a);
                d92.b.f58623a.getClass();
                c2.q.a(u1.n.e(rVarB, d92.b.a(o0VarE).k().d(), m1.f128891a), o0VarE, 0);
                o0VarE.g0(true);
                j92.f.f97924a.getClass();
                x0 x0VarF = d92.c.f(j92.f.f97932i, o0VarE);
                h4.r rVarC4 = c2.l.C(aVar, 20, 0.0f, 0.0f, 0.0f, 14);
                if ((i16 & 112) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objQ = o0VarE.q();
                if (z15) {
                    objQ = new gp.j(str5, 19);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new gp.j(str5, 19);
                        o0VarE.K(objQ);
                    }
                }
                mh.c(str, v.c((e23.l) objQ, rVarC4, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, i16 & 14, 0, 131068);
                o0Var = o0VarE;
                o0Var.g0(true);
                str4 = str5;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                str4 = str3;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new f(this, str, str4, i14, i15, 2);
            }
        }
        i16 |= 48;
        str3 = str2;
        if ((i16 & 19) != 18) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            if (i17 != 0) {
                str5 = null;
            } else {
                str5 = str3;
            }
            x1 x1Var2 = p3.n.f135158a;
            aVar = h4.r.S;
            g6.f.a aVar4 = g6.f.f75994b;
            h4.r rVarA2 = c2.l.A(aVar, 16, 0.0f, 2);
            h4.d.f81522a.getClass();
            gVar = h4.d.a.f81524b;
            z0VarD = c2.q.d(gVar, false);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarA2, o0VarE);
            h5.g.V.getClass();
            aVar2 = h5.g.a.f81805b;
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD, o0VarE);
            c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u uVar2 = u.f22885a;
            h4.r rVarC5 = c2.l.C(aVar, 0.0f, 6, 0.0f, 0.0f, 13);
            z0VarD2 = c2.q.d(gVar, false);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = h4.k.c(rVarC5, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, z0VarD2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            h4.r rVarB2 = l4.k.b(x2.q(aVar, 7), k2.i.f102406a);
            d92.b.f58623a.getClass();
            c2.q.a(u1.n.e(rVarB2, d92.b.a(o0VarE).k().d(), m1.f128891a), o0VarE, 0);
            o0VarE.g0(true);
            j92.f.f97924a.getClass();
            x0 x0VarF2 = d92.c.f(j92.f.f97932i, o0VarE);
            h4.r rVarC6 = c2.l.C(aVar, 20, 0.0f, 0.0f, 0.0f, 14);
            if ((i16 & 112) == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            objQ = o0VarE.q();
            if (z15) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new gp.j(str5, 19);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new gp.j(str5, 19);
                o0VarE.K(objQ);
            }
            mh.c(str, v.c((e23.l) objQ, rVarC6, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF2, o0VarE, i16 & 14, 0, 131068);
            o0Var = o0VarE;
            o0Var.g0(true);
            str4 = str5;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            str4 = str3;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(this, str, str4, i14, i15, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x015c  */
    public final void f(s5.c cVar, String str, p3.m mVar, int i14, int i15) {
        String str2;
        int i16;
        o0 o0Var;
        String str3;
        o0 o0VarE = mVar.E(-270577090);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i17 = i14 | (o0VarE.B(cVar) ? 4 : 2);
        int i18 = i15 & 2;
        if (i18 != 0) {
            i16 = i17 | 48;
            str2 = str;
        } else {
            str2 = str;
            i16 = i17 | (o0VarE.B(str2) ? 32 : 16);
        }
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            String str4 = i18 != 0 ? null : str2;
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarA = c2.l.A(aVar, 16, 0.0f, 2);
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81524b;
            z0 z0VarD = c2.q.d(gVar, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (cVar2 == null) {
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
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u uVar = u.f22885a;
            h4.r rVarC2 = c2.l.C(aVar, 0.0f, 6, 0.0f, 0.0f, 13);
            z0 z0VarD2 = c2.q.d(gVar, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarC2, o0VarE);
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, z0VarD2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC3, o0VarE);
            h4.r rVarB = l4.k.b(x2.q(aVar, 7), k2.i.f102406a);
            d92.b.f58623a.getClass();
            c2.q.a(u1.n.e(rVarB, d92.b.a(o0VarE).k().d(), m1.f128891a), o0VarE, 0);
            o0VarE.g0(true);
            j92.f.f97924a.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97932i, o0VarE);
            h4.r rVarC4 = c2.l.C(aVar, 20, 0.0f, 0.0f, 0.0f, 14);
            boolean z14 = (i16 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new gp.j(str4, 21);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new gp.j(str4, 21);
                    o0VarE.K(objQ);
                }
            }
            mh.d(cVar, v.c((e23.l) objQ, rVarC4, false), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, x0VarF, o0VarE, i16 & 14, 0, 262140);
            o0Var = o0VarE;
            o0Var.g0(true);
            str3 = str4;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            str3 = str2;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(this, cVar, str3, i14, i15);
        }
    }

    public final void g(e23.p<? super p3.m, ? super Integer, Unit> pVar, p3.m mVar, int i14) {
        int i15;
        pVar.getClass();
        o0 o0VarE = mVar.E(1092673202);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(pVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            g6.f.a aVar = g6.f.f75994b;
            h4.r rVarC = c2.l.C(m0.a(h4.r.S, true, null), 16, 8, 0.0f, 0.0f, 12);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
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
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            e5.q(i15 & 14, pVar, o0VarE, true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(this, pVar, i14, i16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c0  */
    public final void h(int i14, e23.a aVar, String str, p3.m mVar) {
        int i15;
        o0 o0Var;
        o0 o0VarL = vb.h.l(121859411, aVar, str, mVar);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarL.B(str) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarL.r(aVar) ? 32 : 16;
        }
        int i16 = i15;
        if (o0VarL.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            s5.c.b bVarH = l2.h(o0VarL, 1142780076, 0, 1, null);
            bVarH.h("URL", str);
            d92.b.f58623a.getClass();
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0Var = j92.f.f97932i;
            int iJ = bVarH.j(i0.a(x0Var.f157322a, d92.b.a(o0VarL).k().a(), WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE));
            try {
                bVarH.b(str);
                Unit unit = Unit.INSTANCE;
                bVarH.f(iJ);
                bVarH.e();
                s5.c cVarK = bVarH.k();
                o0VarL.g0(false);
                h4.r rVarA = m0.a(h4.r.S, true, null);
                p5.l.f136032b.getClass();
                h4.r rVarD = w.d(rVarA, false, null, p5.l.a(0), aVar, 11);
                float f14 = 16;
                g6.f.a aVar2 = g6.f.f75994b;
                h4.r rVarZ = c2.l.z(rVarD, f14, f14);
                boolean z14 = (i16 & 14) == 4;
                Object objQ = o0VarL.q();
                if (z14) {
                    objQ = new gp.j(str, 17);
                    o0VarL.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new gp.j(str, 17);
                        o0VarL.K(objQ);
                    }
                }
                h4.r rVarC = v.c((e23.l) objQ, rVarZ, false);
                fVar.getClass();
                o0Var = o0VarL;
                mh.d(cVarK, rVarC, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, d92.c.f(x0Var, o0VarL), o0Var, 0, 0, 262140);
            } catch (Throwable th3) {
                bVarH.f(iJ);
                throw th3;
            }
        } else {
            o0Var = o0VarL;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l(this, str, aVar, i14, 0);
        }
    }

    public final void i(e23.a aVar, int i14, p3.m mVar, int i15) {
        int i16;
        aVar.getClass();
        o0 o0VarE = mVar.E(-969401623);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.k(i14) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= o0VarE.B(this) ? 256 : 128;
        }
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            h(i16 & 1008, aVar, y.Q(o0VarE, i14), o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(this, i14, aVar, i15, 1);
        }
    }

    public final void j(e23.p<? super p3.m, ? super Integer, Unit> pVar, p3.m mVar, int i14) {
        int i15;
        pVar.getClass();
        o0 o0VarE = mVar.E(1330490253);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(pVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new h02.a(23);
                o0VarE.K(objQ);
            }
            h4.r rVarC = v.c((e23.l) objQ, rVarF, true);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            e5.q(i15 & 14, pVar, o0VarE, true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(this, pVar, i14, i16);
        }
    }

    public final void k(e23.p<? super p3.m, ? super Integer, Unit> pVar, p3.m mVar, int i14) {
        int i15;
        pVar.getClass();
        o0 o0VarE = mVar.E(-833377219);
        int i16 = 2;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(pVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarE = u1.n.e(x2.f(h4.r.S, 1.0f), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
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
            e5.q(i15 & 14, pVar, o0VarE, true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(this, pVar, i14, i16);
        }
    }

    public final void l(int i14, int i15, int i16, String str, p3.m mVar) {
        int i17;
        String str2;
        o0 o0VarE = mVar.E(979528114);
        if ((i15 & 6) == 0) {
            i17 = (o0VarE.k(i14) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i18 = i16 & 2;
        if (i18 != 0) {
            i17 |= 48;
        } else if ((i15 & 48) == 0) {
            i17 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= o0VarE.B(this) ? 256 : 128;
        }
        if (o0VarE.n(i17 & 1, (i17 & 147) != 146)) {
            String str3 = i18 != 0 ? null : str;
            x1 x1Var = p3.n.f135158a;
            m(i17 & 1008, 0, y.Q(o0VarE, i14), str3, o0VarE);
            str2 = str3;
        } else {
            o0VarE.e();
            str2 = str;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(this, i14, str2, i15, i16, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0083  */
    /* JADX WARN: Code duplicated, block: B:38:0x008c  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    public final void m(int i14, int i15, String str, String str2, p3.m mVar) {
        String str3;
        int i16;
        String str4;
        boolean z14;
        o0 o0Var;
        p2 p2VarI0;
        String str5;
        String str6;
        boolean zB;
        Object objQ;
        str.getClass();
        o0 o0VarE = mVar.E(157412520);
        if ((i14 & 6) == 0) {
            str3 = str;
            i16 = i14 | (o0VarE.B(str3) ? 4 : 2);
        } else {
            str3 = str;
            i16 = i14;
        }
        int i17 = i15 & 2;
        if (i17 == 0) {
            if ((i14 & 48) == 0) {
                str4 = str2;
                i16 |= o0VarE.B(str4) ? 32 : 16;
            }
            if ((i16 & 19) != 18) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i17 != 0) {
                    str5 = null;
                } else {
                    str5 = str4;
                }
                x1 x1Var = p3.n.f135158a;
                if (str5 == null) {
                    str6 = str3;
                } else {
                    str6 = str5;
                }
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
                h4.r.a aVar = h4.r.S;
                float f14 = 16;
                g6.f.a aVar2 = g6.f.f75994b;
                h4.r rVarB = c2.l.B(aVar, f14, f14, f14, f14);
                zB = o0VarE.B(str6);
                objQ = o0VarE.q();
                if (zB) {
                    objQ = new gp.j(str6, 15);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new gp.j(str6, 15);
                        o0VarE.K(objQ);
                    }
                }
                o0Var = o0VarE;
                mh.c(str3, v.c((e23.l) objQ, rVarB, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0Var, i16 & 14, 0, 131068);
                str4 = str5;
            } else {
                o0Var = o0VarE;
                o0Var.e();
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new f(this, str, str4, i14, i15, 0);
            }
        }
        i16 |= 48;
        str4 = str2;
        if ((i16 & 19) != 18) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            if (i17 != 0) {
                str5 = null;
            } else {
                str5 = str4;
            }
            x1 x1Var2 = p3.n.f135158a;
            if (str5 == null) {
                str6 = str3;
            } else {
                str6 = str5;
            }
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarB2 = d92.c.b(j92.f.f97931h, o0VarE);
            h4.r.a aVar3 = h4.r.S;
            float f15 = 16;
            g6.f.a aVar4 = g6.f.f75994b;
            h4.r rVarB2 = c2.l.B(aVar3, f15, f15, f15, f15);
            zB = o0VarE.B(str6);
            objQ = o0VarE.q();
            if (zB) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new gp.j(str6, 15);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new gp.j(str6, 15);
                o0VarE.K(objQ);
            }
            o0Var = o0VarE;
            mh.c(str3, v.c((e23.l) objQ, rVarB2, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, o0Var, i16 & 14, 0, 131068);
            str4 = str5;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(this, str, str4, i14, i15, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x007f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0088  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    public final void n(s5.c cVar, String str, p3.m mVar, int i14, int i15) {
        int i16;
        String str2;
        boolean z14;
        o0 o0Var;
        String str3;
        p2 p2VarI0;
        String str4;
        String str5;
        boolean zB;
        Object objQ;
        o0 o0VarE = mVar.E(199832716);
        if ((i14 & 6) == 0) {
            i16 = i14 | (o0VarE.B(cVar) ? 4 : 2);
        } else {
            i16 = i14;
        }
        int i17 = i15 & 2;
        if (i17 == 0) {
            if ((i14 & 48) == 0) {
                str2 = str;
                i16 |= o0VarE.B(str2) ? 32 : 16;
            }
            if ((i16 & 19) != 18) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i17 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                x1 x1Var = p3.n.f135158a;
                if (str4 == null) {
                    str5 = cVar.f157138b;
                } else {
                    str5 = str4;
                }
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
                h4.r.a aVar = h4.r.S;
                float f14 = 16;
                g6.f.a aVar2 = g6.f.f75994b;
                h4.r rVarB = c2.l.B(aVar, f14, f14, f14, f14);
                zB = o0VarE.B(str5);
                objQ = o0VarE.q();
                if (zB) {
                    objQ = new gp.j(str5, 22);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new gp.j(str5, 22);
                        o0VarE.K(objQ);
                    }
                }
                o0Var = o0VarE;
                mh.d(cVar, v.c((e23.l) objQ, rVarB, false), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, x0VarB, o0Var, i16 & 14, 0, 262140);
                str3 = str4;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                str3 = str2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new an1.d((Object) this, (Object) cVar, str3, i14, i15, 7);
            }
        }
        i16 |= 48;
        str2 = str;
        if ((i16 & 19) != 18) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            if (i17 != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            x1 x1Var2 = p3.n.f135158a;
            if (str4 == null) {
                str5 = cVar.f157138b;
            } else {
                str5 = str4;
            }
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarB2 = d92.c.b(j92.f.f97931h, o0VarE);
            h4.r.a aVar3 = h4.r.S;
            float f15 = 16;
            g6.f.a aVar4 = g6.f.f75994b;
            h4.r rVarB2 = c2.l.B(aVar3, f15, f15, f15, f15);
            zB = o0VarE.B(str5);
            objQ = o0VarE.q();
            if (zB) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new gp.j(str5, 22);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new gp.j(str5, 22);
                o0VarE.K(objQ);
            }
            o0Var = o0VarE;
            mh.d(cVar, v.c((e23.l) objQ, rVarB2, false), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, x0VarB2, o0Var, i16 & 14, 0, 262140);
            str3 = str4;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            str3 = str2;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new an1.d((Object) this, (Object) cVar, str3, i14, i15, 7);
        }
    }

    public final void o(int i14, int i15, int i16, String str, p3.m mVar) {
        int i17;
        o0 o0VarE = mVar.E(-1004562508);
        if ((i15 & 6) == 0) {
            i17 = (o0VarE.k(i14) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i18 = i16 & 2;
        if (i18 != 0) {
            i17 |= 48;
        } else if ((i15 & 48) == 0) {
            i17 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= o0VarE.B(this) ? 256 : 128;
        }
        if (o0VarE.n(i17 & 1, (i17 & 147) != 146)) {
            if (i18 != 0) {
                str = null;
            }
            x1 x1Var = p3.n.f135158a;
            p(y.Q(o0VarE, i14), str, o0VarE, i17 & 1008);
        } else {
            o0VarE.e();
        }
        String str2 = str;
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(this, i14, str2, i15, i16, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    public final void p(String str, String str2, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        h4.r rVarC;
        str.getClass();
        o0 o0VarE = mVar.E(-546379930);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(str) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str2) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            if (str2 != null) {
                o0VarE.C(721681057);
                h4.r.a aVar = h4.r.S;
                boolean z14 = (i15 & 112) == 32;
                Object objQ = o0VarE.q();
                if (z14) {
                    objQ = new gp.j(str2, 20);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new gp.j(str2, 20);
                        o0VarE.K(objQ);
                    }
                }
                rVarC = v.c((e23.l) objQ, aVar, false);
                o0VarE.g0(false);
            } else {
                o0VarE.C(721775452);
                o0VarE.g0(false);
                rVarC = h4.r.S;
            }
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97932i, o0VarE);
            h4.r.a aVar2 = h4.r.S;
            float f14 = 16;
            g6.f.a aVar3 = g6.f.f75994b;
            o0Var = o0VarE;
            mh.c(str, c2.l.C(aVar2, f14, f14, f14, 0.0f, 8).then(rVarC), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0Var, i15 & 14, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(this, str, str2, i14, 0);
        }
    }

    public final void q(String str, p3.m mVar, int i14) {
        int i15;
        str.getClass();
        o0 o0VarE = mVar.E(601790993);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(this) ? 32 : 16;
        }
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            p(str, null, o0VarE, ((i15 << 3) & 896) | (i15 & 14) | 48);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(this, str, i14, i16);
        }
    }

    public final void r(s5.c cVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        cVar.getClass();
        o0 o0VarE = mVar.E(-1369608471);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(cVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97932i, o0VarE);
            h4.r.a aVar = h4.r.S;
            float f14 = 16;
            g6.f.a aVar2 = g6.f.f75994b;
            o0Var = o0VarE;
            mh.d(cVar, c2.l.C(aVar, f14, f14, f14, 0.0f, 8), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, x0VarF, o0Var, i15 & 14, 0, 262140);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(this, cVar, i14, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0093  */
    /* JADX WARN: Code duplicated, block: B:39:0x009c  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    public final void s(int i14, int i15, String str, String str2, p3.m mVar) {
        String str3;
        int i16;
        String str4;
        boolean z14;
        o0 o0Var;
        p2 p2VarI0;
        String str5;
        String str6;
        boolean zB;
        Object objQ;
        str.getClass();
        o0 o0VarE = mVar.E(-1204025532);
        if ((i14 & 6) == 0) {
            str3 = str;
            i16 = i14 | (o0VarE.B(str3) ? 4 : 2);
        } else {
            str3 = str;
            i16 = i14;
        }
        int i17 = i15 & 2;
        int i18 = 16;
        if (i17 == 0) {
            if ((i14 & 48) == 0) {
                str4 = str2;
                i16 |= o0VarE.B(str4) ? 32 : 16;
            }
            if ((i16 & 19) != 18) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i17 != 0) {
                    str5 = null;
                } else {
                    str5 = str4;
                }
                x1 x1Var = p3.n.f135158a;
                if (str5 == null) {
                    str6 = str3;
                } else {
                    str6 = str5;
                }
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
                h4.r rVarA = m0.a(h4.r.S, true, null);
                float f14 = 16;
                g6.f.a aVar = g6.f.f75994b;
                h4.r rVarC = c2.l.C(rVarA, f14, 24, f14, 0.0f, 8);
                zB = o0VarE.B(str6);
                objQ = o0VarE.q();
                if (zB) {
                    objQ = new gp.j(str6, i18);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new gp.j(str6, i18);
                        o0VarE.K(objQ);
                    }
                }
                o0Var = o0VarE;
                mh.c(str3, v.c((e23.l) objQ, rVarC, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0Var, i16 & 14, 0, 131068);
                str4 = str5;
            } else {
                o0Var = o0VarE;
                o0Var.e();
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new f(this, str, str4, i14, i15, 1);
            }
        }
        i16 |= 48;
        str4 = str2;
        if ((i16 & 19) != 18) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            if (i17 != 0) {
                str5 = null;
            } else {
                str5 = str4;
            }
            x1 x1Var2 = p3.n.f135158a;
            if (str5 == null) {
                str6 = str3;
            } else {
                str6 = str5;
            }
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarB2 = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
            h4.r rVarA2 = m0.a(h4.r.S, true, null);
            float f15 = 16;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarC2 = c2.l.C(rVarA2, f15, 24, f15, 0.0f, 8);
            zB = o0VarE.B(str6);
            objQ = o0VarE.q();
            if (zB) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new gp.j(str6, i18);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new gp.j(str6, i18);
                o0VarE.K(objQ);
            }
            o0Var = o0VarE;
            mh.c(str3, v.c((e23.l) objQ, rVarC2, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, o0Var, i16 & 14, 0, 131068);
            str4 = str5;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(this, str, str4, i14, i15, 1);
        }
    }

    public final void t(int i14, p3.m mVar, int i15) {
        int i16;
        o0 o0VarE = mVar.E(-41860383);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.k(i14) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.B(this) ? 32 : 16;
        }
        int i17 = 1;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            s((i16 << 3) & 896, 2, y.Q(o0VarE, i14), null, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j(this, i14, i15, i17);
        }
    }

    public final void u(int i14, e23.a aVar, String str, p3.m mVar) {
        int i15;
        o0 o0VarE = mVar.E(-494790121);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.k(R.string.link_paragraph_description) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        int i16 = i15 | 48;
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(str) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.B(this) ? 16384 : 8192;
        }
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            x(y.Q(o0VarE, R.string.link_paragraph_description), null, str, aVar, o0VarE, i16 & 65520);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l(this, str, aVar, i14, 1);
        }
    }

    public final void v(e23.a aVar, int i14, p3.m mVar, int i15) {
        int i16;
        o0 o0VarE = mVar.E(-1900203992);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.k(i14) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        int i17 = i16 | 48;
        if ((i15 & 384) == 0) {
            i17 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= o0VarE.B(this) ? 2048 : 1024;
        }
        if (o0VarE.n(i17 & 1, (i17 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            w(y.Q(o0VarE, i14), null, aVar, o0VarE, i17 & 8176, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(this, i14, aVar, i15, 0);
        }
    }

    public final void w(String str, String str2, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
        int i16;
        String str3;
        str.getClass();
        o0 o0VarE = mVar.E(-1092387494);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i17 = i15 & 2;
        if (i17 != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(str2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.B(this) ? 2048 : 1024;
        }
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            String str4 = i17 != 0 ? null : str2;
            x1 x1Var = p3.n.f135158a;
            int i18 = (i16 & 14) | 384 | (i16 & 112);
            int i19 = i16 << 3;
            x(str, str4, null, aVar, o0VarE, i18 | (i19 & 7168) | (i19 & 57344));
            str3 = str4;
        } else {
            o0VarE.e();
            str3 = str2;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.f0(i14, i15, 12, this, str, str3, aVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:82:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:93:0x01f9  */
    public final void x(String str, String str2, String str3, e23.a aVar, p3.m mVar, int i14) {
        int i15;
        String str4;
        o0 o0Var;
        Object fVar;
        e23.a aVar2;
        s5.c cVar;
        boolean z14;
        str.getClass();
        o0 o0VarE = mVar.E(1612050597);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str3) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(this) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            int iH = d53.w.H(str, "<link>", 0, false, 6);
            int iH2 = d53.w.H(str, "</link>", 0, false, 6);
            if (iH == -1 || iH2 == -1) {
                str4 = str2;
                o0Var = o0VarE;
                o0Var.C(-1724631859);
                p(str, str4, o0Var, ((i15 >> 6) & 896) | (i15 & 126));
                o0Var.g0(false);
            } else {
                o0VarE.C(-1724454849);
                d92.b.f58623a.getClass();
                j92.f fVar2 = d92.b.f58624b;
                fVar2.getClass();
                x0 x0Var = j92.f.f97932i;
                i0 i0VarA = i0.a(x0Var.f157322a, d92.b.a(o0VarE).k().d(), WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                fVar2.getClass();
                int i16 = i15;
                i0 i0VarA2 = i0.a(x0Var.f157322a, d92.b.a(o0VarE).k().a(), WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                int i17 = iH + 6;
                String strSubstring = str.substring(i17, iH2);
                s5.c.b bVar = new s5.c.b(0, 1, null);
                fVar2.getClass();
                int i18 = bVar.i(x0Var.f157323b);
                try {
                    int iJ = bVar.j(i0VarA);
                    try {
                        bVar.b(str.substring(0, iH));
                        Unit unit = Unit.INSTANCE;
                        bVar.f(iJ);
                        int iJ2 = bVar.j(i0VarA2);
                        try {
                            String strSubstring2 = str.substring(i17, iH2);
                            if (str3 != null) {
                                s5.c.b.C2962b c2962b = new s5.c.b.C2962b(new a1(str3), bVar.f157141a.length(), 0, null, 12, null);
                                ArrayList arrayList = bVar.f157142b;
                                arrayList.add(c2962b);
                                bVar.f157143c.add(c2962b);
                                int size = arrayList.size() - 1;
                                try {
                                    bVar.b(strSubstring2);
                                    bVar.f(size);
                                } catch (Throwable th3) {
                                    bVar.f(size);
                                    throw th3;
                                }
                            } else {
                                bVar.b(strSubstring2);
                            }
                            bVar.f(iJ2);
                            int iJ3 = bVar.j(i0VarA);
                            try {
                                bVar.b(str.substring(iH2 + 7, str.length()));
                                bVar.f(iJ3);
                                bVar.f(i18);
                                s5.c cVarK = bVar.k();
                                int iH3 = d53.w.H(cVarK, strSubstring, 0, false, 6);
                                int length = strSubstring.length() + iH3;
                                h4.r rVarA = m0.a(h4.r.S, true, null);
                                float f14 = 16;
                                g6.f.a aVar3 = g6.f.f75994b;
                                h4.r rVarC = c2.l.C(rVarA, f14, f14, f14, 0.0f, 8);
                                int i19 = i16 & 7168;
                                boolean zB = ((i16 & 112) == 32) | o0VarE.B(cVarK) | o0VarE.B(strSubstring) | (i19 == 2048);
                                Object objQ = o0VarE.q();
                                p3.m.a aVar4 = p3.m.f135153a;
                                if (zB) {
                                    aVar2 = aVar;
                                    fVar = new ev2.f(str2, cVarK, strSubstring, aVar2, 10);
                                    str4 = str2;
                                    cVar = cVarK;
                                    o0VarE.K(fVar);
                                } else {
                                    aVar4.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        aVar2 = aVar;
                                        fVar = new ev2.f(str2, cVarK, strSubstring, aVar2, 10);
                                        str4 = str2;
                                        cVar = cVarK;
                                        o0VarE.K(fVar);
                                    } else {
                                        aVar2 = aVar;
                                        fVar = objQ;
                                        cVar = cVarK;
                                        str4 = str2;
                                    }
                                }
                                h4.r rVarC2 = v.c((e23.l) fVar, rVarC, false);
                                boolean zK = o0VarE.k(iH3) | o0VarE.k(length) | (i19 == 2048);
                                Object objQ2 = o0VarE.q();
                                if (zK) {
                                    z14 = false;
                                    objQ2 = new k(iH3, length, 0, aVar2);
                                    o0VarE.K(objQ2);
                                } else {
                                    aVar4.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        z14 = false;
                                        objQ2 = new k(iH3, length, 0, aVar2);
                                        o0VarE.K(objQ2);
                                    } else {
                                        z14 = false;
                                    }
                                }
                                p006l2.c0.a(cVar, rVarC2, null, false, 0, 0, null, (e23.l) objQ2, o0VarE, 0, 124);
                                o0Var = o0VarE;
                                o0Var.g0(z14);
                            } catch (Throwable th4) {
                                bVar.f(iJ3);
                                throw th4;
                            }
                        } catch (Throwable th5) {
                            bVar.f(iJ2);
                            throw th5;
                        }
                    } catch (Throwable th6) {
                        bVar.f(iJ);
                        throw th6;
                    }
                } catch (Throwable th7) {
                    bVar.f(i18);
                    throw th7;
                }
            }
        } else {
            str4 = str2;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.n(this, str, str4, str3, aVar, i14, 24);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x008e  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00df  */
    /* JADX WARN: Code duplicated, block: B:61:0x014a  */
    /* JADX WARN: Code duplicated, block: B:65:0x016b  */
    /* JADX WARN: Code duplicated, block: B:66:0x016d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0185  */
    /* JADX WARN: Code duplicated, block: B:71:0x018c  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:78:0x01da  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:83:0x0202  */
    /* JADX WARN: Code duplicated, block: B:86:0x020e  */
    /* JADX WARN: Code duplicated, block: B:90:0x015f A[EDGE_INSN: B:90:0x015f->B:63:0x015f BREAK  A[LOOP:0: B:38:0x0086->B:62:0x0157], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x015f A[EDGE_INSN: B:92:0x015f->B:63:0x015f BREAK  A[LOOP:0: B:38:0x0086->B:62:0x0157], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    public final void y(String str, h4.r rVar, String str2, i53.c<? extends e23.l<? super String, Unit>> cVar, p3.m mVar, int i14, int i15) {
        int i16;
        String str3;
        boolean z14;
        h4.r rVar2;
        String str4;
        p2 p2VarI0;
        ArrayList arrayList;
        s5.c.b bVar;
        int i17;
        int i18;
        int length;
        p3.m.a aVar;
        s5.c cVarK;
        String str5;
        boolean zB;
        Object objQ;
        int i19;
        boolean zB2;
        Object objQ2;
        int iH;
        int iH2;
        String strSubstring;
        e23.l lVar;
        boolean zB3;
        Object objQ3;
        int iJ;
        int i24;
        str.getClass();
        cVar.getClass();
        o0 o0VarE = mVar.E(-153179578);
        int i25 = 4;
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i26 = i16 | 48;
        int i27 = i15 & 4;
        if (i27 == 0) {
            if ((i14 & 384) == 0) {
                str3 = str2;
                i26 |= o0VarE.B(str3) ? 256 : 128;
            }
            if ((i14 & 3072) == 0) {
                if (o0VarE.B(cVar)) {
                    i24 = 2048;
                } else {
                    i24 = 1024;
                }
                i26 |= i24;
            }
            if ((i26 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i26 & 1, z14)) {
                h4.r.a aVar2 = h4.r.S;
                if (i27 != 0) {
                    str3 = null;
                }
                x1 x1Var = p3.n.f135158a;
                arrayList = new ArrayList();
                o0VarE.C(-1176675102);
                bVar = new s5.c.b(0, 1, null);
                o0VarE.C(-1176672043);
                i17 = 0;
                i18 = 0;
                while (true) {
                    length = str.length();
                    aVar = p3.m.f135153a;
                    if (i18 >= length) {
                        break;
                    }
                    iH = d53.w.H(str, "<link>", i18, false, i25);
                    if (iH == -1) {
                        bVar.b(str.substring(i18));
                        break;
                    }
                    iH2 = d53.w.H(str, "</link>", iH, false, i25);
                    if (iH2 == -1) {
                        break;
                    }
                    String strSubstring2 = str.substring(i18, iH);
                    strSubstring = str.substring(iH + 6, iH2);
                    lVar = (e23.l) h0.e0(i17, cVar);
                    bVar.b(strSubstring2);
                    if (lVar != null) {
                        o0VarE.C(-1129359351);
                        zB3 = o0VarE.B(lVar) | o0VarE.B(strSubstring);
                        objQ3 = o0VarE.q();
                        if (zB3) {
                            objQ3 = new bb1.d(lVar, strSubstring, 2);
                            o0VarE.K(objQ3);
                        } else {
                            aVar.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new bb1.d(lVar, strSubstring, 2);
                                o0VarE.K(objQ3);
                            }
                        }
                        arrayList.add(new p5.g(strSubstring, (e23.a) objQ3));
                        bVar.h("link", strSubstring);
                        d92.b.f58623a.getClass();
                        iJ = bVar.j(new i0(d92.b.a(o0VarE).k().a(), 0L, (f0) null, (b0) null, (c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null));
                        try {
                            bVar.b(strSubstring);
                            Unit unit = Unit.INSTANCE;
                            bVar.f(iJ);
                            bVar.e();
                            o0VarE.g0(false);
                        } catch (Throwable th3) {
                            bVar.f(iJ);
                            throw th3;
                        }
                    } else {
                        o0VarE.C(-1128873085);
                        o0VarE.g0(false);
                        bVar.b(strSubstring);
                    }
                    i18 = iH2 + 7;
                    i17++;
                    i25 = 4;
                }
                o0VarE.g0(false);
                cVarK = bVar.k();
                o0VarE.g0(false);
                if (str3 == null) {
                    str5 = str;
                } else {
                    str5 = str3;
                }
                h4.r rVarA = m0.a(h4.r.S, true, null);
                zB = o0VarE.B(str5) | o0VarE.r(arrayList);
                objQ = o0VarE.q();
                if (zB) {
                    objQ = new g2.m1(15, str5, arrayList);
                    o0VarE.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new g2.m1(15, str5, arrayList);
                        o0VarE.K(objQ);
                    }
                }
                h4.r rVarC = v.c((e23.l) objQ, rVarA, false);
                i19 = 16;
                float f14 = 16;
                g6.f.a aVar3 = g6.f.f75994b;
                h4.r rVarThen = c2.l.C(rVarC, f14, 8, f14, 0.0f, 8).then(aVar2);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0 x0VarF = d92.c.f(j92.f.f97932i, o0VarE);
                zB2 = o0VarE.B(cVarK) | ((i26 & 7168) == 2048);
                objQ2 = o0VarE.q();
                if (zB2) {
                    objQ2 = new g2.m1(i19, cVarK, cVar);
                    o0VarE.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new g2.m1(i19, cVarK, cVar);
                        o0VarE.K(objQ2);
                    }
                }
                p006l2.c0.a(cVarK, rVarThen, x0VarF, false, 0, 0, null, (e23.l) objQ2, o0VarE, 0, 120);
                x1 x1Var2 = p3.n.f135158a;
                rVar2 = aVar2;
            } else {
                o0VarE.e();
                rVar2 = rVar;
            }
            str4 = str3;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a0((Object) this, (Object) str, rVar2, (Object) str4, (Object) cVar, i14, i15, 11);
            }
        }
        i26 = i16 | 432;
        str3 = str2;
        if ((i14 & 3072) == 0) {
            if (o0VarE.B(cVar)) {
                i24 = 2048;
            } else {
                i24 = 1024;
            }
            i26 |= i24;
        }
        if ((i26 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i26 & 1, z14)) {
            h4.r.a aVar4 = h4.r.S;
            if (i27 != 0) {
                str3 = null;
            }
            x1 x1Var3 = p3.n.f135158a;
            arrayList = new ArrayList();
            o0VarE.C(-1176675102);
            bVar = new s5.c.b(0, 1, null);
            o0VarE.C(-1176672043);
            i17 = 0;
            i18 = 0;
            while (true) {
                length = str.length();
                aVar = p3.m.f135153a;
                if (i18 >= length) {
                    break;
                    break;
                }
                iH = d53.w.H(str, "<link>", i18, false, i25);
                if (iH == -1) {
                    bVar.b(str.substring(i18));
                    break;
                }
                iH2 = d53.w.H(str, "</link>", iH, false, i25);
                if (iH2 == -1) {
                    break;
                    break;
                }
                String strSubstring3 = str.substring(i18, iH);
                strSubstring = str.substring(iH + 6, iH2);
                lVar = (e23.l) h0.e0(i17, cVar);
                bVar.b(strSubstring3);
                if (lVar != null) {
                    o0VarE.C(-1129359351);
                    zB3 = o0VarE.B(lVar) | o0VarE.B(strSubstring);
                    objQ3 = o0VarE.q();
                    if (zB3) {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new bb1.d(lVar, strSubstring, 2);
                            o0VarE.K(objQ3);
                        }
                    } else {
                        objQ3 = new bb1.d(lVar, strSubstring, 2);
                        o0VarE.K(objQ3);
                    }
                    arrayList.add(new p5.g(strSubstring, (e23.a) objQ3));
                    bVar.h("link", strSubstring);
                    d92.b.f58623a.getClass();
                    iJ = bVar.j(new i0(d92.b.a(o0VarE).k().a(), 0L, (f0) null, (b0) null, (c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null));
                    bVar.b(strSubstring);
                    Unit unit2 = Unit.INSTANCE;
                    bVar.f(iJ);
                    bVar.e();
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1128873085);
                    o0VarE.g0(false);
                    bVar.b(strSubstring);
                }
                i18 = iH2 + 7;
                i17++;
                i25 = 4;
            }
            o0VarE.g0(false);
            cVarK = bVar.k();
            o0VarE.g0(false);
            if (str3 == null) {
                str5 = str;
            } else {
                str5 = str3;
            }
            h4.r rVarA2 = m0.a(h4.r.S, true, null);
            zB = o0VarE.B(str5) | o0VarE.r(arrayList);
            objQ = o0VarE.q();
            if (zB) {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new g2.m1(15, str5, arrayList);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new g2.m1(15, str5, arrayList);
                o0VarE.K(objQ);
            }
            h4.r rVarC2 = v.c((e23.l) objQ, rVarA2, false);
            i19 = 16;
            float f15 = 16;
            g6.f.a aVar5 = g6.f.f75994b;
            h4.r rVarThen2 = c2.l.C(rVarC2, f15, 8, f15, 0.0f, 8).then(aVar4);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarF2 = d92.c.f(j92.f.f97932i, o0VarE);
            zB2 = o0VarE.B(cVarK) | ((i26 & 7168) == 2048);
            objQ2 = o0VarE.q();
            if (zB2) {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new g2.m1(i19, cVarK, cVar);
                    o0VarE.K(objQ2);
                }
            } else {
                objQ2 = new g2.m1(i19, cVarK, cVar);
                o0VarE.K(objQ2);
            }
            p006l2.c0.a(cVarK, rVarThen2, x0VarF2, false, 0, 0, null, (e23.l) objQ2, o0VarE, 0, 120);
            x1 x1Var4 = p3.n.f135158a;
            rVar2 = aVar4;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        str4 = str3;
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a0((Object) this, (Object) str, rVar2, (Object) str4, (Object) cVar, i14, i15, 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    public final void z(int i14, int i15, String str, p3.m mVar) {
        int i16;
        o0 o0Var;
        str.getClass();
        o0 o0VarE = mVar.E(-1385547979);
        if ((i14 & 6) == 0) {
            i16 = i14 | (o0VarE.B(str) ? 4 : 2);
        } else {
            i16 = i14;
        }
        if ((i15 & 2) != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(null) ? 32 : 16;
        }
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97932i, o0VarE);
            h4.r.a aVar = h4.r.S;
            float f14 = 16;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarC = c2.l.C(aVar, f14, 0.0f, f14, 0.0f, 10);
            boolean zB = o0VarE.B(str);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new gp.j(str, 23);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new gp.j(str, 23);
                    o0VarE.K(objQ);
                }
            }
            o0Var = o0VarE;
            mh.c(str, v.c((e23.l) objQ, rVarC, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0Var, i16 & 14, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ba2.f(this, str, i14, i15, 2);
        }
    }
}
