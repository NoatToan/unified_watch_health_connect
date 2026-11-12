package cf1;

import af1.e;
import android.content.Context;
import android.text.TextUtils;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.j;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import f12.l;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i3.mh;
import java.util.List;
import k2.i;
import o4.m1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.w;
import p3.b4;
import p3.i2;
import p3.m;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import qe1.d;
import qe1.f;
import qe1.n;
import s5.x0;
import v.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcf1/b;", "Lh82/c;", "<init>", "()V", "gcm-running-economy_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends h82.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f27017g = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f27018f;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27019a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.f3072e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.f3073f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.f3074g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.f3075h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e.f3076i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[e.f3077j.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[e.f3078k.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f27019a = iArr;
        }
    }

    public b() {
        l.f68084a.getClass();
        this.f27018f = TextUtils.isEmpty(l.a.a().w()) || l.a.a().w().equals("MALE");
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        return w.c(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(1465393808, true, new cf1.a(this, 0)), 4, null));
    }

    public final void g(e eVar, m mVar, int i14) {
        o0 o0Var;
        String strA;
        qe1.c female;
        f recreational;
        qe1.c female2;
        f recreational2;
        qe1.e male;
        f recreational3;
        qe1.e male2;
        f recreational4;
        qe1.c female3;
        d intermediate;
        qe1.c female4;
        d intermediate2;
        qe1.e male3;
        d intermediate3;
        qe1.e male4;
        d intermediate4;
        qe1.c female5;
        qe1.m trained;
        qe1.c female6;
        qe1.m trained2;
        qe1.e male5;
        qe1.m trained3;
        qe1.e male6;
        qe1.m trained4;
        qe1.c female7;
        n wellTrained;
        qe1.c female8;
        n wellTrained2;
        qe1.e male7;
        n wellTrained3;
        qe1.e male8;
        n wellTrained4;
        qe1.c female9;
        qe1.b expert;
        qe1.c female10;
        qe1.b expert2;
        qe1.e male9;
        qe1.b expert3;
        qe1.e male10;
        qe1.b expert4;
        qe1.c female11;
        qe1.l superior;
        qe1.c female12;
        qe1.l superior2;
        qe1.e male11;
        qe1.l superior3;
        qe1.e male12;
        qe1.l superior4;
        qe1.c female13;
        qe1.a elite;
        qe1.c female14;
        qe1.a elite2;
        qe1.e male13;
        qe1.a elite3;
        qe1.e male14;
        qe1.a elite4;
        e eVar2 = eVar;
        eVar2.getClass();
        o0 o0VarE = mVar.E(1101231390);
        int i15 = (i14 & 6) == 0 ? i14 | (o0VarE.k(eVar2.ordinal()) ? 4 : 2) : i14;
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            bf1.a aVar = new bf1.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            r.a aVar2 = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar3 = j92.b.f97899b;
            r rVarC = c2.l.C(aVar2, 0.0f, eVar3.f97918c, 0.0f, 0.0f, 13);
            j.f22691a.getClass();
            j.C0343j c0343j = j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = k.c(rVarC, o0VarE);
            g.V.getClass();
            e0.a aVar3 = g.a.f81805b;
            Long lValueOf = null;
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
            b4.c(g.a.f81810g, s2VarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar2 = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(g.a.f81807d, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            bVar.getClass();
            q.a(u2Var.c(u1.n.e(l4.k.b(x2.q(aVar2, eVar3.f97919d), i.f102406a), af1.f.a(eVar2, o0VarE), m1.f128891a), h4.d.a.f81534l), o0VarE, 0);
            String strQ = y.Q(o0VarE, eVar2.f3082a);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0Var = j92.f.f97932i;
            x0 x0VarB = d92.c.b(x0Var, o0VarE);
            bVar.getClass();
            mh.c(strQ, u2Var.d(c2.l.C(aVar2, eVar3.f97917b, 0.0f, 0.0f, 0.0f, 14), f5.b.f68892a), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
            o0VarE.g0(true);
            bVar.getClass();
            float f14 = eVar3.f97920e;
            bVar.getClass();
            float f15 = eVar3.f97920e;
            bVar.getClass();
            r rVarC3 = c2.l.C(aVar2, f14, eVar3.f97917b, f15, 0.0f, 8);
            int i16 = a.f27019a[eVar.ordinal()];
            boolean z14 = this.f27018f;
            switch (i16) {
                case 1:
                    if (!z14) {
                        c.f27020a.getClass();
                        qe1.i iVar = c.f27021b;
                        Long lValueOf2 = (iVar == null || (female2 = iVar.getFemale()) == null || (recreational2 = female2.getRecreational()) == null) ? null : Long.valueOf(recreational2.getMin());
                        qe1.i iVar2 = c.f27021b;
                        if (iVar2 != null && (female = iVar2.getFemale()) != null && (recreational = female.getRecreational()) != null) {
                            lValueOf = Long.valueOf(recreational.getMax());
                        }
                        strA = aVar.a(lValueOf2, lValueOf, eVar);
                    } else {
                        c.f27020a.getClass();
                        qe1.i iVar3 = c.f27021b;
                        Long lValueOf3 = (iVar3 == null || (male2 = iVar3.getMale()) == null || (recreational4 = male2.getRecreational()) == null) ? null : Long.valueOf(recreational4.getMin());
                        qe1.i iVar4 = c.f27021b;
                        if (iVar4 != null && (male = iVar4.getMale()) != null && (recreational3 = male.getRecreational()) != null) {
                            lValueOf = Long.valueOf(recreational3.getMax());
                        }
                        strA = aVar.a(lValueOf3, lValueOf, eVar);
                    }
                    break;
                case 2:
                    if (!z14) {
                        c.f27020a.getClass();
                        qe1.i iVar5 = c.f27021b;
                        Long lValueOf4 = (iVar5 == null || (female4 = iVar5.getFemale()) == null || (intermediate2 = female4.getIntermediate()) == null) ? null : Long.valueOf(intermediate2.getMin());
                        qe1.i iVar6 = c.f27021b;
                        if (iVar6 != null && (female3 = iVar6.getFemale()) != null && (intermediate = female3.getIntermediate()) != null) {
                            lValueOf = Long.valueOf(intermediate.getMax());
                        }
                        strA = aVar.a(lValueOf4, lValueOf, eVar);
                    } else {
                        c.f27020a.getClass();
                        qe1.i iVar7 = c.f27021b;
                        Long lValueOf5 = (iVar7 == null || (male4 = iVar7.getMale()) == null || (intermediate4 = male4.getIntermediate()) == null) ? null : Long.valueOf(intermediate4.getMin());
                        qe1.i iVar8 = c.f27021b;
                        if (iVar8 != null && (male3 = iVar8.getMale()) != null && (intermediate3 = male3.getIntermediate()) != null) {
                            lValueOf = Long.valueOf(intermediate3.getMax());
                        }
                        strA = aVar.a(lValueOf5, lValueOf, eVar);
                    }
                    break;
                case 3:
                    if (!z14) {
                        c.f27020a.getClass();
                        qe1.i iVar9 = c.f27021b;
                        Long lValueOf6 = (iVar9 == null || (female6 = iVar9.getFemale()) == null || (trained2 = female6.getTrained()) == null) ? null : Long.valueOf(trained2.getMin());
                        qe1.i iVar10 = c.f27021b;
                        if (iVar10 != null && (female5 = iVar10.getFemale()) != null && (trained = female5.getTrained()) != null) {
                            lValueOf = Long.valueOf(trained.getMax());
                        }
                        strA = aVar.a(lValueOf6, lValueOf, eVar);
                    } else {
                        c.f27020a.getClass();
                        qe1.i iVar11 = c.f27021b;
                        Long lValueOf7 = (iVar11 == null || (male6 = iVar11.getMale()) == null || (trained4 = male6.getTrained()) == null) ? null : Long.valueOf(trained4.getMin());
                        qe1.i iVar12 = c.f27021b;
                        if (iVar12 != null && (male5 = iVar12.getMale()) != null && (trained3 = male5.getTrained()) != null) {
                            lValueOf = Long.valueOf(trained3.getMax());
                        }
                        strA = aVar.a(lValueOf7, lValueOf, eVar);
                    }
                    break;
                case 4:
                    if (!z14) {
                        c.f27020a.getClass();
                        qe1.i iVar13 = c.f27021b;
                        Long lValueOf8 = (iVar13 == null || (female8 = iVar13.getFemale()) == null || (wellTrained2 = female8.getWellTrained()) == null) ? null : Long.valueOf(wellTrained2.getMin());
                        qe1.i iVar14 = c.f27021b;
                        if (iVar14 != null && (female7 = iVar14.getFemale()) != null && (wellTrained = female7.getWellTrained()) != null) {
                            lValueOf = Long.valueOf(wellTrained.getMax());
                        }
                        strA = aVar.a(lValueOf8, lValueOf, eVar);
                    } else {
                        c.f27020a.getClass();
                        qe1.i iVar15 = c.f27021b;
                        Long lValueOf9 = (iVar15 == null || (male8 = iVar15.getMale()) == null || (wellTrained4 = male8.getWellTrained()) == null) ? null : Long.valueOf(wellTrained4.getMin());
                        qe1.i iVar16 = c.f27021b;
                        if (iVar16 != null && (male7 = iVar16.getMale()) != null && (wellTrained3 = male7.getWellTrained()) != null) {
                            lValueOf = Long.valueOf(wellTrained3.getMax());
                        }
                        strA = aVar.a(lValueOf9, lValueOf, eVar);
                    }
                    break;
                case 5:
                    if (!z14) {
                        c.f27020a.getClass();
                        qe1.i iVar17 = c.f27021b;
                        Long lValueOf10 = (iVar17 == null || (female10 = iVar17.getFemale()) == null || (expert2 = female10.getExpert()) == null) ? null : Long.valueOf(expert2.getMin());
                        qe1.i iVar18 = c.f27021b;
                        if (iVar18 != null && (female9 = iVar18.getFemale()) != null && (expert = female9.getExpert()) != null) {
                            lValueOf = Long.valueOf(expert.getMax());
                        }
                        strA = aVar.a(lValueOf10, lValueOf, eVar);
                    } else {
                        c.f27020a.getClass();
                        qe1.i iVar19 = c.f27021b;
                        Long lValueOf11 = (iVar19 == null || (male10 = iVar19.getMale()) == null || (expert4 = male10.getExpert()) == null) ? null : Long.valueOf(expert4.getMin());
                        qe1.i iVar20 = c.f27021b;
                        if (iVar20 != null && (male9 = iVar20.getMale()) != null && (expert3 = male9.getExpert()) != null) {
                            lValueOf = Long.valueOf(expert3.getMax());
                        }
                        strA = aVar.a(lValueOf11, lValueOf, eVar);
                    }
                    break;
                case 6:
                    if (!z14) {
                        c.f27020a.getClass();
                        qe1.i iVar21 = c.f27021b;
                        Long lValueOf12 = (iVar21 == null || (female12 = iVar21.getFemale()) == null || (superior2 = female12.getSuperior()) == null) ? null : Long.valueOf(superior2.getMin());
                        qe1.i iVar22 = c.f27021b;
                        if (iVar22 != null && (female11 = iVar22.getFemale()) != null && (superior = female11.getSuperior()) != null) {
                            lValueOf = Long.valueOf(superior.getMax());
                        }
                        strA = aVar.a(lValueOf12, lValueOf, eVar);
                    } else {
                        c.f27020a.getClass();
                        qe1.i iVar23 = c.f27021b;
                        Long lValueOf13 = (iVar23 == null || (male12 = iVar23.getMale()) == null || (superior4 = male12.getSuperior()) == null) ? null : Long.valueOf(superior4.getMin());
                        qe1.i iVar24 = c.f27021b;
                        if (iVar24 != null && (male11 = iVar24.getMale()) != null && (superior3 = male11.getSuperior()) != null) {
                            lValueOf = Long.valueOf(superior3.getMax());
                        }
                        strA = aVar.a(lValueOf13, lValueOf, eVar);
                    }
                    break;
                case 7:
                    if (!z14) {
                        c.f27020a.getClass();
                        qe1.i iVar25 = c.f27021b;
                        Long lValueOf14 = (iVar25 == null || (female14 = iVar25.getFemale()) == null || (elite2 = female14.getElite()) == null) ? null : Long.valueOf(elite2.getMin());
                        qe1.i iVar26 = c.f27021b;
                        if (iVar26 != null && (female13 = iVar26.getFemale()) != null && (elite = female13.getElite()) != null) {
                            lValueOf = Long.valueOf(elite.getMax());
                        }
                        strA = aVar.a(lValueOf14, lValueOf, eVar);
                    } else {
                        c.f27020a.getClass();
                        qe1.i iVar27 = c.f27021b;
                        Long lValueOf15 = (iVar27 == null || (male14 = iVar27.getMale()) == null || (elite4 = male14.getElite()) == null) ? null : Long.valueOf(elite4.getMin());
                        qe1.i iVar28 = c.f27021b;
                        if (iVar28 != null && (male13 = iVar28.getMale()) != null && (elite3 = male13.getElite()) != null) {
                            lValueOf = Long.valueOf(elite3.getMax());
                        }
                        strA = aVar.a(lValueOf15, lValueOf, eVar);
                    }
                    break;
                default:
                    strA = "";
                    break;
            }
            fVar.getClass();
            o0Var = o0VarE;
            String str = strA;
            eVar2 = eVar;
            mh.c(str, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0VarE), o0Var, 0, 0, 131068);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.r(this, eVar2, i14, 12);
        }
    }

    public final void h(m mVar, int i14) {
        o0 o0VarE = mVar.E(-1577838379);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(816713320, new cf1.a(this, i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a03.k(this, i14, 8);
        }
    }
}
