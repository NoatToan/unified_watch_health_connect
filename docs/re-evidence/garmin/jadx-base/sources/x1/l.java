package x1;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.q1;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import d6.o;
import e23.q;
import f5.z0;
import h4.r;
import h5.e0;
import l4.w;
import o4.f0;
import o4.m1;
import p004k6.d0;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.a2;
import w5.c0;
import w52.j0;
import w52.k0;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f188368a = new d0(true, false, false, false, 14, (p005kotlin.jvm.internal.j) null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f188369b;

    static {
        o4.d0.f128823b.getClass();
        long j8 = o4.d0.f128826e;
        long j14 = o4.d0.f128824c;
        f188369b = new e(j8, j14, j14, o4.d0.c(0.38f, j14, 14), o4.d0.c(0.38f, j14, 14), null);
    }

    public static final void a(e eVar, r rVar, z3.e eVar2, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-527864079);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(eVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(rVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(eVar2) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            j.f188348a.getClass();
            r rVarB = a2.b(c2.l.A(c2.l.E(u1.n.e(w.a(rVar, j.f188352e, k2.i.a(j.f188353f), false, 28), eVar.f188337a, m1.f128891a), q1.Max), 0.0f, j.f188357j, 1), a2.a(o0VarE), true);
            int i16 = (i15 << 3) & 7168;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
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
            b4.a(o0VarE, Integer.valueOf(iHashCode), h5.g.a.f81813j);
            b4.b(h5.g.a.f81814k, o0VarE);
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            eVar2.invoke(b0.f22601a, o0VarE, Integer.valueOf(((i16 >> 6) & 112) | 6));
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(eVar, rVar, eVar2, i14, 9);
        }
    }

    public static final void b(r rVar, e eVar, e23.l<? super i, Unit> lVar, m mVar, int i14, int i15) {
        int i16;
        int i17;
        o0 o0VarE = mVar.E(-625529233);
        int i18 = i15 & 1;
        if (i18 != 0) {
            i16 = i14 | 6;
        } else {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        }
        int i19 = i15 & 2;
        if (i19 != 0) {
            i17 = i16 | 48;
        } else {
            i17 = i16 | (o0VarE.B(eVar) ? 32 : 16);
        }
        int i24 = i17 | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i24 & 1, (i24 & 147) != 146)) {
            if (i18 != 0) {
                rVar = r.S;
            }
            if (i19 != 0) {
                eVar = f188369b;
            }
            x1 x1Var = n.f135158a;
            a(eVar, rVar, z3.f.c(-250345048, new vv0.e(19, lVar, eVar), o0VarE), o0VarE, ((i24 << 3) & 112) | ((i24 >> 3) & 14) | 384);
        } else {
            o0VarE.e();
        }
        r rVar2 = rVar;
        e eVar2 = eVar;
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(i14, i15, rVar2, eVar2, lVar, 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00cb  */
    public static final void c(String str, boolean z14, e eVar, r rVar, q qVar, e23.a aVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        boolean z15;
        o0 o0VarE = mVar.E(-2001167027);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(eVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(rVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(qVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(aVar) ? 131072 : 65536;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            x1 x1Var = n.f135158a;
            j.f188348a.getClass();
            h4.g.b bVar = j.f188354g;
            c2.j jVar = c2.j.f22691a;
            float f14 = j.f188356i;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            boolean z16 = ((i16 & 112) == 32) | ((i16 & 458752) == 131072);
            Object objQ = o0VarE.q();
            if (z16) {
                objQ = new as.i(z14, aVar, 3);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new as.i(z14, aVar, 3);
                    o0VarE.K(objQ);
                }
            }
            r rVarF = x2.f(u1.w.d(rVar, z14, str, null, (e23.a) objQ, 12), 1.0f);
            float f15 = j.f188349b;
            float f16 = j.f188350c;
            float f17 = j.f188351d;
            r rVarA = c2.l.A(x2.s(rVarF, f15, f17, f16, f17), f14, 0.0f, 2);
            s2 s2VarA = q2.a(iVarI, bVar, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            Integer numValueOf = Integer.valueOf(iHashCode);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            b4.a(o0VarE, numValueOf, bVar2);
            h5.g.a.C1622a c1622a = h5.g.a.f81814k;
            b4.b(c1622a, o0VarE);
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            if (qVar == null) {
                o0VarE.C(-1597947094);
                z15 = false;
            } else {
                o0VarE.C(-1597947093);
                r.a aVar3 = r.S;
                float f18 = j.f188358k;
                r rVarO = x2.o(aVar3, f18, 0.0f, f18, f18, 2);
                h4.d.f81522a.getClass();
                z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                r rVarC2 = h4.k.c(rVarO, o0VarE);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                b4.a(o0VarE, Integer.valueOf(iHashCode2), bVar2);
                b4.b(c1622a, o0VarE);
                b4.c(fVar, rVarC2, o0VarE);
                u uVar = u.f22885a;
                z15 = false;
                qVar.invoke(o4.d0.a(z14 ? eVar.f188339c : eVar.f188341e), o0VarE, 0);
                o0VarE.g0(true);
            }
            o0VarE.g0(z15);
            long j8 = z14 ? eVar.f188338b : eVar.f188340d;
            p006l2.y.b(str, u2Var.a(r.S, 1.0f, true), new x0(j8, j.f188361n, j.f188362o, (w5.b0) null, (c0) null, (w5.q) null, (String) null, j.f188364q, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (o4.q1) null, (q4.g) null, j.f188355h, 0, j.f188363p, (d6.n) null, (s5.c0) null, (d6.f) null, 0, 0, (o) null, 16613240, (p005kotlin.jvm.internal.j) null), null, 0, false, 1, 0, null, null, o0VarE, (i16 & 14) | 1572864, 952);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ux1.e(str, z14, eVar, rVar, qVar, aVar, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0095  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:58:0x0103  */
    /* JADX WARN: Code duplicated, block: B:59:0x0113  */
    public static final void d(p004k6.c0 c0Var, e23.a aVar, r rVar, e23.l lVar, m mVar, int i14) {
        int i15;
        e23.a aVar2;
        r rVar2;
        long jB;
        int iJ;
        int color;
        ColorStateList colorStateList;
        long jB2;
        int iJ2;
        Integer numValueOf;
        long jB3;
        int iJ3;
        Integer numValueOf2;
        o0 o0VarE = mVar.E(307841774);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(c0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            aVar2 = aVar;
            i15 |= o0VarE.r(aVar2) ? 32 : 16;
        } else {
            aVar2 = aVar;
        }
        if ((i14 & 384) == 0) {
            rVar2 = rVar;
            i15 |= o0VarE.B(rVar2) ? 256 : 128;
        } else {
            rVar2 = rVar;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean zB = o0VarE.B((Configuration) o0VarE.A(AndroidCompositionLocals_androidKt.f6041a)) | o0VarE.B(context);
            Object objQ = o0VarE.q();
            if (zB) {
                e eVar = f188369b;
                jB = eVar.f188337a;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Widget.PopupMenu, new int[]{R.attr.colorBackground});
                iJ = f0.j(jB);
                color = typedArrayObtainStyledAttributes.getColor(0, iJ);
                typedArrayObtainStyledAttributes.recycle();
                if (color != iJ) {
                    jB = f0.b(color);
                }
                long j8 = jB;
                TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(R.style.TextAppearance.Widget.PopupMenu.Large, new int[]{R.attr.textColorPrimary});
                colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(0);
                typedArrayObtainStyledAttributes2.recycle();
                jB2 = eVar.f188338b;
                iJ2 = f0.j(jB2);
                if (colorStateList != null) {
                    numValueOf = Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, iJ2));
                } else {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    jB2 = f0.b(numValueOf.intValue());
                }
                long j14 = jB2;
                jB3 = eVar.f188340d;
                iJ3 = f0.j(jB3);
                if (colorStateList != null) {
                    numValueOf2 = Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, iJ3));
                } else {
                    numValueOf2 = null;
                }
                if (numValueOf2 != null) {
                    jB3 = f0.b(numValueOf2.intValue());
                }
                long j15 = jB3;
                e eVar2 = new e(j8, j14, j14, j15, j15, null);
                o0VarE.K(eVar2);
                objQ = eVar2;
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    e eVar3 = f188369b;
                    jB = eVar3.f188337a;
                    TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(R.style.Widget.PopupMenu, new int[]{R.attr.colorBackground});
                    iJ = f0.j(jB);
                    color = typedArrayObtainStyledAttributes3.getColor(0, iJ);
                    typedArrayObtainStyledAttributes3.recycle();
                    if (color != iJ) {
                        jB = f0.b(color);
                    }
                    long j16 = jB;
                    TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(R.style.TextAppearance.Widget.PopupMenu.Large, new int[]{R.attr.textColorPrimary});
                    colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(0);
                    typedArrayObtainStyledAttributes4.recycle();
                    jB2 = eVar3.f188338b;
                    iJ2 = f0.j(jB2);
                    if (colorStateList != null) {
                        numValueOf = Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, iJ2));
                    } else {
                        numValueOf = null;
                    }
                    if (numValueOf != null && numValueOf.intValue() != iJ2) {
                        jB2 = f0.b(numValueOf.intValue());
                    }
                    long j17 = jB2;
                    jB3 = eVar3.f188340d;
                    iJ3 = f0.j(jB3);
                    if (colorStateList != null) {
                        numValueOf2 = Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, iJ3));
                    } else {
                        numValueOf2 = null;
                    }
                    if (numValueOf2 != null && numValueOf2.intValue() != iJ3) {
                        jB3 = f0.b(numValueOf2.intValue());
                    }
                    long j18 = jB3;
                    e eVar4 = new e(j16, j17, j17, j18, j18, null);
                    o0VarE.K(eVar4);
                    objQ = eVar4;
                }
            }
            e(c0Var, aVar2, rVar2, (e) objQ, lVar, o0VarE, (i15 & 1022) | ((i15 << 3) & 57344));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ug0.c((Object) c0Var, (Object) aVar, (Object) rVar, lVar, i14, 19);
        }
    }

    public static final void e(p004k6.c0 c0Var, e23.a aVar, r rVar, e eVar, e23.l lVar, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-305401220);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(c0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(rVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(eVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            p004k6.g.a(c0Var, aVar, f188368a, z3.f.c(-1271367778, new vx1.b(rVar, 21, eVar, lVar), o0VarE), o0VarE, (i15 & 14) | 3456 | (i15 & 112), 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j0(c0Var, aVar, rVar, eVar, lVar, i14, 4);
        }
    }
}
