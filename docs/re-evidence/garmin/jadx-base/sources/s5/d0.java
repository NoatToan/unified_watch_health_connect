package s5;

import c2.k3;
import c2.n3;
import c2.p3;
import c2.q3;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.i7;
import java.util.ArrayList;
import java.util.List;
import o4.q1;
import p005kotlin.Unit;
import p3.x1;
import v62.s6;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157156a;

    public /* synthetic */ d0(int i14) {
        this.f157156a = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        g gVar;
        Object objA;
        switch (this.f157156a) {
            case 0:
                return Integer.valueOf(((d6.j) obj2).f57771a);
            case 1:
                return Integer.valueOf(((d6.d) obj2).f57711a);
            case 2:
                return Integer.valueOf(((w5.b0) obj2).f182072a);
            case 3:
                return Integer.valueOf(((w5.c0) obj2).f182079a);
            case 4:
                d4.n nVar = (d4.n) obj;
                g6.q qVar = (g6.q) obj2;
                g6.q.f76018b.getClass();
                return qVar != null ? g6.q.b(qVar.f76021a, g6.q.f76020d) : false ? Boolean.FALSE : p13.x.d(Float.valueOf(g6.q.d(qVar.f76021a)), f0.a(g6.r.a(g6.q.c(qVar.f76021a)), f0.f157183y, nVar));
            case 5:
                m.a aVar = (m.a) obj2;
                return p13.x.d(aVar.f157239a, f0.a(aVar.f157240b, f0.f157168j, (d4.n) obj));
            case 6:
                long j8 = ((g6.r) obj2).f76025a;
                g6.r.f76022b.getClass();
                if (g6.r.b(j8, g6.r.f76024d)) {
                    return 0;
                }
                if (g6.r.b(j8, g6.r.f76023c)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 7:
                n4.c cVar = (n4.c) obj2;
                n4.c.f123541b.getClass();
                return cVar != null ? n4.c.d(cVar.f123544a, n4.c.f123543d) : false ? Boolean.FALSE : p13.x.d(Float.valueOf(Float.intBitsToFloat((int) (cVar.f123544a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (cVar.f123544a & 4294967295L))));
            case 8:
                d4.n nVar2 = (d4.n) obj;
                c.d dVar = (c.d) obj2;
                T t7 = dVar.f157149a;
                if (t7 instanceof w) {
                    gVar = g.Paragraph;
                } else if (t7 instanceof i0) {
                    gVar = g.Span;
                } else if (t7 instanceof b1) {
                    gVar = g.VerbatimTts;
                } else if (t7 instanceof a1) {
                    gVar = g.Url;
                } else if (t7 instanceof m.b) {
                    gVar = g.Link;
                } else if (t7 instanceof m.a) {
                    gVar = g.Clickable;
                } else {
                    if (!(t7 instanceof k0)) {
                        com.google.protobuf.a.m();
                        return null;
                    }
                    gVar = g.String;
                }
                switch (f0.c.f157187a[gVar.ordinal()]) {
                    case 1:
                        t7.getClass();
                        objA = f0.a((w) t7, f0.f157166h, nVar2);
                        break;
                    case 2:
                        t7.getClass();
                        objA = f0.a((i0) t7, f0.f157167i, nVar2);
                        break;
                    case 3:
                        t7.getClass();
                        objA = f0.a((b1) t7, f0.f157162d, nVar2);
                        break;
                    case 4:
                        t7.getClass();
                        objA = f0.a((a1) t7, f0.f157163e, nVar2);
                        break;
                    case 5:
                        t7.getClass();
                        objA = f0.a((m.b) t7, f0.f157164f, nVar2);
                        break;
                    case 6:
                        t7.getClass();
                        objA = f0.a((m.a) t7, f0.f157165g, nVar2);
                        break;
                    case 7:
                        t7.getClass();
                        objA = ((k0) t7).f157233a;
                        break;
                    default:
                        lc.u0.r();
                        return null;
                }
                return p13.x.d(gVar, objA, Integer.valueOf(dVar.f157150b), Integer.valueOf(dVar.f157151c), dVar.f157152d);
            case 9:
                d4.n nVar3 = (d4.n) obj;
                List<z5.b> list = ((z5.c) obj2).f202443a;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i14 = 0; i14 < size; i14++) {
                    z5.b bVar = list.get(i14);
                    z5.b.a aVar2 = z5.b.f202439b;
                    arrayList.add(f0.a(bVar, f0.B, nVar3));
                }
                return arrayList;
            case 10:
                return ((z5.b) obj2).f202440a.toLanguageTag();
            case 11:
                d4.n nVar4 = (d4.n) obj;
                d6.f fVar = (d6.f) obj2;
                return p13.x.d(f0.a(d6.f.a.a(fVar.f57732a), f0.D, nVar4), f0.a(d6.f.d.a(fVar.f57733b), f0.E, nVar4), f0.a(d6.f.c.a(fVar.f57734c), f0.F, nVar4));
            case 12:
                return Float.valueOf(((d6.f.a) obj2).f57739a);
            case 13:
                return Integer.valueOf(((d6.f.d) obj2).f57748a);
            case 14:
                return Integer.valueOf(((d6.f.c) obj2).f57743a);
            case 15:
                return ((b1) obj2).f157136a;
            case 16:
                d4.n nVar5 = (d4.n) obj;
                w wVar = (w) obj2;
                Object objA2 = f0.a(d6.h.a(wVar.f157306a), f0.f157177s, nVar5);
                Object objA3 = f0.a(d6.j.a(wVar.f157307b), f0.f157178t, nVar5);
                Object objA4 = f0.a(g6.q.a(wVar.f157308c), f0.f157182x, nVar5);
                d6.n nVar6 = wVar.f157309d;
                d6.n.a aVar3 = d6.n.f57779c;
                Object objA5 = f0.a(nVar6, f0.f157171m, nVar5);
                a0 a0Var = wVar.f157310e;
                a0.a aVar4 = a0.f157123c;
                Object objA6 = f0.a(a0Var, h0.f157205a, nVar5);
                d6.f fVar2 = wVar.f157311f;
                d6.f.b bVar2 = d6.f.f57730d;
                Object objA7 = f0.a(fVar2, f0.C, nVar5);
                Object objA8 = f0.a(d6.e.a(wVar.f157312g), h0.f157207c, nVar5);
                Object objA9 = f0.a(d6.d.a(wVar.f157313h), f0.f157179u, nVar5);
                d6.o oVar = wVar.f157314i;
                d6.o.a aVar5 = d6.o.f57783c;
                return p13.x.d(objA2, objA3, objA4, objA5, objA6, objA7, objA8, objA9, f0.a(oVar, h0.f157208d, nVar5));
            case 17:
                return ((a1) obj2).f157127a;
            case 18:
                d4.n nVar7 = (d4.n) obj;
                i0 i0Var = (i0) obj2;
                o4.d0 d0VarA = o4.d0.a(i0Var.f157211a.getF57707b());
                g0 g0Var = f0.f157176r;
                Object objA10 = f0.a(d0VarA, g0Var, nVar7);
                g6.q qVarA = g6.q.a(i0Var.fontSize);
                g0 g0Var2 = f0.f157182x;
                Object objA11 = f0.a(qVarA, g0Var2, nVar7);
                w5.f0 f0Var = i0Var.fontWeight;
                w5.f0.a aVar6 = w5.f0.f182097b;
                Object objA12 = f0.a(f0Var, f0.f157172n, nVar7);
                w5.b0 b0Var = i0Var.fontStyle;
                w5.b0.a aVar7 = w5.b0.f182070b;
                Object objA13 = f0.a(b0Var, f0.f157180v, nVar7);
                w5.c0 c0Var = i0Var.fontSynthesis;
                w5.c0.a aVar8 = w5.c0.f182075b;
                Object objA14 = f0.a(c0Var, f0.f157181w, nVar7);
                String str = i0Var.fontFeatureSettings;
                Object objA15 = f0.a(g6.q.a(i0Var.letterSpacing), g0Var2, nVar7);
                d6.a aVar9 = i0Var.baselineShift;
                d6.a.C1234a c1234a = d6.a.f57703b;
                Object objA16 = f0.a(aVar9, f0.f157173o, nVar7);
                d6.m mVar = i0Var.textGeometricTransform;
                d6.m.a aVar10 = d6.m.f57775c;
                Object objA17 = f0.a(mVar, f0.f157170l, nVar7);
                z5.c cVar2 = i0Var.localeList;
                z5.c.a aVar11 = z5.c.f202441c;
                Object objA18 = f0.a(cVar2, f0.A, nVar7);
                Object objA19 = f0.a(o4.d0.a(i0Var.f157222l), g0Var, nVar7);
                d6.i iVar = i0Var.background;
                d6.i.a aVar12 = d6.i.f57760b;
                Object objA20 = f0.a(iVar, f0.f157169k, nVar7);
                q1 q1Var = i0Var.shadow;
                q1.a aVar13 = q1.f128956d;
                return p13.x.d(objA10, objA11, objA12, objA13, objA14, -1, str, objA15, objA16, objA17, objA18, objA19, objA20, f0.a(q1Var, f0.f157175q, nVar7));
            case 19:
                d4.n nVar8 = (d4.n) obj;
                r0 r0Var = (r0) obj2;
                i0 i0Var2 = r0Var.f157286a;
                d4.l lVar = f0.f157167i;
                return p13.x.d(f0.a(i0Var2, lVar, nVar8), f0.a(r0Var.f157287b, lVar, nVar8), f0.a(r0Var.f157288c, lVar, nVar8), f0.a(r0Var.f157289d, lVar, nVar8));
            case 20:
                a0 a0Var2 = (a0) obj2;
                Boolean boolValueOf = Boolean.valueOf(a0Var2.f157125a);
                d4.l lVar2 = f0.f157159a;
                return p13.x.d(boolValueOf, f0.a(l.a(a0Var2.f157126b), h0.f157206b, (d4.n) obj));
            case 21:
                return Integer.valueOf(((l) obj2).f157237a);
            case 22:
                return Integer.valueOf(((d6.e) obj2).f57714a);
            case 23:
                d6.o oVar2 = (d6.o) obj2;
                return p13.x.d(f0.a(d6.o.b.a(oVar2.f57786a), h0.f157209e, (d4.n) obj), Boolean.valueOf(oVar2.f57787b));
            case 24:
                return Integer.valueOf(((d6.o.b) obj2).f57792a);
            case 25:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s50.a aVar14 = s50.a.f157338a;
                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    i7.a(n5.c.a(R.drawable.icon_back_arrow, mVar2, 0), gl1.y.Q(mVar2, R.string.common_button_back), null, 0L, mVar2, 0, 12);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 26:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                s52.l lVar3 = s52.l.f157449a;
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = s6.a(t62.b.f162798a);
                    long jG = fb1.c.g(d92.b.f58623a, mVar3);
                    h4.r.a aVar15 = h4.r.S;
                    float f14 = 20;
                    g6.f.a aVar16 = g6.f.f75994b;
                    i7.b(dVarA, null, x2.u(x2.h(aVar15, f14), f14), jG, mVar3, 432, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 27:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 28:
                p3.m mVar4 = (p3.m) obj;
                ((Integer) obj2).getClass();
                mVar4.C(1589988029);
                x1 x1Var3 = p3.n.f135158a;
                int i15 = k3.f22728a;
                c2.g gVarD = q3.d(mVar4);
                p3.f22815b.getClass();
                c2.x1 x1VarD = n3.d(gVarD, p3.f22823j);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                float f15 = j92.b.f97899b.f97920e;
                c2.a aVar17 = new c2.a(x1VarD, n3.b(0.0f, f15, 0.0f, f15, 5));
                mVar4.f();
                return aVar17;
            default:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                s70.w wVar2 = s70.w.f157813a;
                if (mVar5.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
        }
    }
}
