package kq;

import android.content.Context;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import l72.u1;
import p005kotlin.Metadata;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkq/o0;", "Lh82/c;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o0 extends h82.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f106115f = 0;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f106116a;

        static {
            int[] iArr = new int[ls1.a.values().length];
            try {
                iArr[ls1.a.RANGE_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ls1.a.RANGE_5.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f106116a = iArr;
        }
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        return p13.w.c(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(-1507896782, true, new m0(this, 0)), 4, null));
    }

    public final void g(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1872497097);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(708988938, new m0(this, i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n0(this, i14, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(p3.m mVar, int i14) {
        char c14;
        String strP;
        int i15;
        int i16;
        p3.o0 o0VarE = mVar.E(185739586);
        p3.c<?> cVar = o0VarE.f135177b;
        int i17 = ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2) | i14;
        int i18 = 0;
        if (o0VarE.n(i17 & 1, (i17 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarD = x2.d(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarY = c2.l.y(rVarD, j92.b.f97899b.f97920e);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
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
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            o0VarE.C(1905772772);
            w13.c cVar2 = ls1.a.f114786j;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar2, cVar2);
            while (bVarN.hasNext()) {
                ls1.a aVar2 = (ls1.a) bVarN.next();
                h4.r.a aVar3 = h4.r.S;
                c2.j.f22691a.getClass();
                c2.j.C0343j c0343j = c2.j.f22692b;
                h4.d.f81522a.getClass();
                s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, i18);
                x1 x1Var2 = p3.n.f135158a;
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC2 = h4.k.c(aVar3, o0VarE);
                h5.g.V.getClass();
                h5.e0.a aVar4 = h5.g.a.f81805b;
                if (cVar == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA1, o0VarE);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
                u2 u2Var = u2.f22900a;
                o4.d0 d0VarA = o4.d0.a(n5.a.a(o0VarE, aVar2.f114789c));
                int[] iArr = a.f106116a;
                int iOrdinal = aVar2.ordinal();
                p13.c.b bVar3 = bVarN;
                double d14 = aVar2.f114788b;
                double d15 = aVar2.f114787a;
                int i19 = iArr[iOrdinal];
                if (i19 != 1) {
                    c14 = 2;
                    if (i19 != 2) {
                        o0VarE.C(-375629960);
                        l3.f23124b.getClass();
                        String str = l3.f23131i.format(d15);
                        str.getClass();
                        strP = gl1.y.P(R.string.string_short_dash_line_string_pattern, new Object[]{str, l3.a.U(Double.valueOf(d14 - ((double) 1)), l3.f23131i)}, o0VarE);
                        i16 = 0;
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-375635987);
                        l3.a aVar5 = l3.f23124b;
                        Double dValueOf = Double.valueOf(d15 - ((double) 1));
                        aVar5.getClass();
                        strP = gl1.y.P(R.string.lbl_greater_than_number, new Object[]{l3.a.U(dValueOf, l3.f23131i)}, o0VarE);
                        i16 = 0;
                        o0VarE.g0(false);
                    }
                    i15 = i16;
                } else {
                    c14 = 2;
                    o0VarE.C(-375642330);
                    l3.a aVar6 = l3.f23124b;
                    Double dValueOf2 = Double.valueOf(d14);
                    aVar6.getClass();
                    strP = gl1.y.P(R.string.lbl_less_than_number, new Object[]{l3.a.U(dValueOf2, l3.f23131i)}, o0VarE);
                    i15 = 0;
                    o0VarE.g0(false);
                }
                u1.d(u2Var, d0VarA, strP, 0.6f, o0VarE, 3078, 0);
                o0VarE.g0(true);
                i18 = i15;
                bVarN = bVar3;
            }
            o0VarE.g0(i18);
            o0VarE.g0(true);
            x1 x1Var3 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n0(this, i14, 1);
        }
    }
}
