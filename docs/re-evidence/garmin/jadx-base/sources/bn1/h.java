package bn1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.l;
import c2.x2;
import c2.y;
import c2.z;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import f5.g0;
import h4.r;
import h5.e0;
import i3.mh;
import o4.m1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007²\u0006\u000e\u0010\u0006\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lbn1/h;", "", "Lg6/f;", "rangeProgressBarWidth", "<init>", "(FLkotlin/jvm/internal/j;)V", "valueTextWidth", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19063a;

    private h(float f14) {
        this.f19063a = f14;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0045  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:34:0x0057  */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x006c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x007a  */
    /* JADX WARN: Code duplicated, block: B:50:0x007d  */
    /* JADX WARN: Code duplicated, block: B:51:0x007f  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    public final void a(float f14, String str, h4.d.b bVar, m mVar, int i14, int i15) {
        int i16;
        String str2;
        int i17;
        h4.d.b bVar2;
        int i18;
        boolean z14;
        h4.d.b bVar3;
        p2 p2VarI0;
        String str3;
        h4.d.b bVar4;
        h4.d.b bVar5;
        int i19;
        o0 o0VarE = mVar.E(722467137);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.i(f14) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i24 = i15 & 2;
        if (i24 == 0) {
            if ((i14 & 48) == 0) {
                str2 = str;
                i16 |= o0VarE.B(str2) ? 32 : 16;
            }
            i17 = i15 & 4;
            if (i17 != 0) {
                if ((i14 & 384) == 0) {
                    bVar2 = bVar;
                    if (o0VarE.B(bVar2)) {
                        i18 = 256;
                    } else {
                        i18 = 128;
                    }
                    i16 |= i18;
                }
                if ((i14 & 3072) == 0) {
                    if (o0VarE.B(this)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i16 |= i19;
                }
                if ((i16 & 1171) != 1170) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    if (i24 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if (i17 != 0) {
                        bVar4 = null;
                    } else {
                        bVar4 = bVar2;
                    }
                    x1 x1Var = n.f135158a;
                    float f15 = 1;
                    g6.f.a aVar = g6.f.f75994b;
                    float f16 = 24;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
                    if (bVar4 == null) {
                        h4.d.f81522a.getClass();
                        bVar5 = h4.d.a.f81537o;
                    } else {
                        bVar5 = bVar4;
                    }
                    c(f14, f15, f16, str3, x0VarF, bVar5, o0VarE, (i16 & 14) | 432 | ((i16 << 6) & 7168) | ((i16 << 9) & 3670016));
                    bVar3 = bVar4;
                    str2 = str3;
                } else {
                    o0VarE.e();
                    bVar3 = bVar2;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new b12.c(this, f14, str2, bVar3, i14, i15, 1);
                }
            }
            i16 |= 384;
            bVar2 = bVar;
            if ((i14 & 3072) == 0) {
                if (o0VarE.B(this)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i16 |= i19;
            }
            if ((i16 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i24 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if (i17 != 0) {
                    bVar4 = null;
                } else {
                    bVar4 = bVar2;
                }
                x1 x1Var2 = n.f135158a;
                float f17 = 1;
                g6.f.a aVar2 = g6.f.f75994b;
                float f18 = 24;
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0 x0VarF2 = d92.c.f(j92.f.f97933j, o0VarE);
                if (bVar4 == null) {
                    h4.d.f81522a.getClass();
                    bVar5 = h4.d.a.f81537o;
                } else {
                    bVar5 = bVar4;
                }
                c(f14, f17, f18, str3, x0VarF2, bVar5, o0VarE, (i16 & 14) | 432 | ((i16 << 6) & 7168) | ((i16 << 9) & 3670016));
                bVar3 = bVar4;
                str2 = str3;
            } else {
                o0VarE.e();
                bVar3 = bVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new b12.c(this, f14, str2, bVar3, i14, i15, 1);
            }
        }
        i16 |= 48;
        str2 = str;
        i17 = i15 & 4;
        if (i17 != 0) {
            if ((i14 & 384) == 0) {
                bVar2 = bVar;
                if (o0VarE.B(bVar2)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i16 |= i18;
            }
            if ((i14 & 3072) == 0) {
                if (o0VarE.B(this)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i16 |= i19;
            }
            if ((i16 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i24 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if (i17 != 0) {
                    bVar4 = null;
                } else {
                    bVar4 = bVar2;
                }
                x1 x1Var3 = n.f135158a;
                float f19 = 1;
                g6.f.a aVar3 = g6.f.f75994b;
                float f110 = 24;
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0 x0VarF3 = d92.c.f(j92.f.f97933j, o0VarE);
                if (bVar4 == null) {
                    h4.d.f81522a.getClass();
                    bVar5 = h4.d.a.f81537o;
                } else {
                    bVar5 = bVar4;
                }
                c(f14, f19, f110, str3, x0VarF3, bVar5, o0VarE, (i16 & 14) | 432 | ((i16 << 6) & 7168) | ((i16 << 9) & 3670016));
                bVar3 = bVar4;
                str2 = str3;
            } else {
                o0VarE.e();
                bVar3 = bVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new b12.c(this, f14, str2, bVar3, i14, i15, 1);
            }
        }
        i16 |= 384;
        bVar2 = bVar;
        if ((i14 & 3072) == 0) {
            if (o0VarE.B(this)) {
                i19 = 2048;
            } else {
                i19 = 1024;
            }
            i16 |= i19;
        }
        if ((i16 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            if (i24 != 0) {
                str3 = null;
            } else {
                str3 = str2;
            }
            if (i17 != 0) {
                bVar4 = null;
            } else {
                bVar4 = bVar2;
            }
            x1 x1Var4 = n.f135158a;
            float f111 = 1;
            g6.f.a aVar4 = g6.f.f75994b;
            float f112 = 24;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarF4 = d92.c.f(j92.f.f97933j, o0VarE);
            if (bVar4 == null) {
                h4.d.f81522a.getClass();
                bVar5 = h4.d.a.f81537o;
            } else {
                bVar5 = bVar4;
            }
            c(f14, f111, f112, str3, x0VarF4, bVar5, o0VarE, (i16 & 14) | 432 | ((i16 << 6) & 7168) | ((i16 << 9) & 3670016));
            bVar3 = bVar4;
            str2 = str3;
        } else {
            o0VarE.e();
            bVar3 = bVar2;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b12.c(this, f14, str2, bVar3, i14, i15, 1);
        }
    }

    public final void b(float f14, String str, h4.d.b bVar, m mVar, int i14) {
        int i15;
        bVar.getClass();
        o0 o0VarE = mVar.E(343967182);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.i(f14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(bVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(this) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            g6.f.a aVar = g6.f.f75994b;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            int i16 = (i15 & 14) | 432 | ((i15 << 6) & 7168);
            int i17 = i15 << 9;
            c(f14, 2, 40, str, d92.c.b(d92.c.e(j92.f.f97932i), o0VarE), bVar, o0VarE, i16 | (458752 & i17) | (i17 & 3670016));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(this, f14, str, bVar, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0148  */
    /* JADX WARN: Code duplicated, block: B:77:0x014f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0153  */
    /* JADX WARN: Code duplicated, block: B:83:0x0174  */
    /* JADX WARN: Code duplicated, block: B:86:0x0180  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:93:0x0219  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void c(float f14, float f15, float f16, String str, x0 x0Var, h4.d.b bVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        float f17;
        r.a aVar;
        int i16;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar2;
        h5.g.a.b bVar2;
        boolean z14;
        boolean zR;
        Object objQ;
        o0 o0VarE = mVar.E(-1409350804);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.i(f14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.i(f15) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.i(f16) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(str) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(x0Var) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.B(bVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.B(this) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ2 = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = p0.n(g6.f.a(0));
                o0VarE.K(objQ2);
            }
            p1 p1Var = (p1) objQ2;
            float f18 = 2;
            float f19 = f15 / f18;
            g6.f.a aVar3 = g6.f.f75994b;
            float f22 = this.f19063a * f14;
            h4.d.f81522a.getClass();
            if (!s.g(bVar, h4.d.a.f81538p)) {
                if (!s.g(bVar, h4.d.a.f81536n)) {
                    f17 = f22 - (((g6.f) p1Var.getF182175a()).f75997a / f18);
                }
                aVar = r.S;
                r rVarV = l.v(aVar, f17, 0.0f, 2);
                i16 = i15 >> 9;
                c2.j.f22691a.getClass();
                zVarA = y.a(c2.j.f22694d, bVar, o0VarE, ((i16 & 896) >> 3) & 112);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarV, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
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
                bVar2 = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                if (str != null) {
                    o0VarE.C(1867783565);
                    r rVarY = x2.y(l.C(aVar, 0.0f, 0.0f, 0.0f, f18, 7), null, 3);
                    zR = o0VarE.r(context);
                    objQ = o0VarE.q();
                    if (zR || objQ == c2565a) {
                        objQ = new as.d(context, p1Var, 7);
                        o0VarE.K(objQ);
                    }
                    z14 = true;
                    mh.c(str, g0.f(rVarY, (e23.l) objQ), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, i16 & 14, (i15 << 9) & 29360128, 131068);
                    o0Var = o0VarE;
                    o0Var.g0(false);
                } else {
                    o0Var = o0VarE;
                    z14 = true;
                    o0Var.C(1868293856);
                    o0Var.g0(false);
                }
                r rVarH = x2.h(x2.u(aVar, f15), f16);
                gl.c.f77766a.getClass();
                l.f(u1.n.e(rVarH, gl.c.a(o0Var).f(), m1.f128891a), o0Var);
                o0Var.g0(z14);
            } else if (!g6.f.c(((g6.f) p1Var.getF182175a()).f75997a, 0)) {
                f19 = ((g6.f) p1Var.getF182175a()).f75997a - f19;
            }
            f17 = f22 - f19;
            aVar = r.S;
            r rVarV2 = l.v(aVar, f17, 0.0f, 2);
            i16 = i15 >> 9;
            c2.j.f22691a.getClass();
            zVarA = y.a(c2.j.f22694d, bVar, o0VarE, ((i16 & 896) >> 3) & 112);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarV2, o0VarE);
            h5.g.V.getClass();
            aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b != null) {
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
            bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var2 = b0.f22601a;
            if (str != null) {
                o0VarE.C(1867783565);
                r rVarY2 = x2.y(l.C(aVar, 0.0f, 0.0f, 0.0f, f18, 7), null, 3);
                zR = o0VarE.r(context);
                objQ = o0VarE.q();
                if (zR) {
                    objQ = new as.d(context, p1Var, 7);
                    o0VarE.K(objQ);
                } else {
                    objQ = new as.d(context, p1Var, 7);
                    o0VarE.K(objQ);
                }
                z14 = true;
                mh.c(str, g0.f(rVarY2, (e23.l) objQ), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, i16 & 14, (i15 << 9) & 29360128, 131068);
                o0Var = o0VarE;
                o0Var.g0(false);
            } else {
                o0Var = o0VarE;
                z14 = true;
                o0Var.C(1868293856);
                o0Var.g0(false);
            }
            r rVarH2 = x2.h(x2.u(aVar, f15), f16);
            gl.c.f77766a.getClass();
            l.f(u1.n.e(rVarH2, gl.c.a(o0Var).f(), m1.f128891a), o0Var);
            o0Var.g0(z14);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(this, f14, f15, f16, str, x0Var, bVar, i14);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && g6.f.c(this.f19063a, ((h) obj).f19063a);
    }

    public final int hashCode() {
        g6.f.a aVar = g6.f.f75994b;
        return Float.hashCode(this.f19063a);
    }

    public final String toString() {
        return am.j.m("RangeProgressBarScope(rangeProgressBarWidth=", g6.f.d(this.f19063a), ")");
    }

    public /* synthetic */ h(float f14, p005kotlin.jvm.internal.j jVar) {
        this(f14);
    }
}
