package s5;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import o4.q1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157155a;

    public /* synthetic */ d(int i14) {
        this.f157155a = i14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        c.d dVar;
        int i14 = 0;
        i0 i0Var = null;
        aVar = null;
        m.a aVar = null;
        bVar = null;
        m.b bVar = null;
        a1Var = null;
        a1 a1Var = null;
        b1Var = null;
        b1 b1Var = null;
        i0Var = null;
        i0 i0Var2 = null;
        wVar = null;
        w wVar = null;
        rVar = null;
        g6.r rVar = null;
        r0Var = null;
        r0 r0Var = null;
        qVar = null;
        g6.q qVar = null;
        i0Var = null;
        switch (this.f157155a) {
            case 0:
                return Boolean.valueOf(!(((c.a) obj) instanceof w));
            case 1:
                s sVar = (s) obj;
                StringBuilder sb3 = new StringBuilder("[");
                sb3.append(sVar.f157291b);
                sb3.append(", ");
                return ds.e0.j(sb3, sVar.f157292c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
            case 2:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                d4.l lVar = f0.f157167i;
                Boolean bool = Boolean.FALSE;
                i0 i0Var3 = (p005kotlin.jvm.internal.s.g(obj2, bool) || obj2 == null) ? null : (i0) lVar.f57454b.invoke(obj2);
                Object obj3 = list.get(1);
                i0 i0Var4 = (p005kotlin.jvm.internal.s.g(obj3, bool) || obj3 == null) ? null : (i0) lVar.f57454b.invoke(obj3);
                Object obj4 = list.get(2);
                i0 i0Var5 = (p005kotlin.jvm.internal.s.g(obj4, bool) || obj4 == null) ? null : (i0) lVar.f57454b.invoke(obj4);
                Object obj5 = list.get(3);
                if (!p005kotlin.jvm.internal.s.g(obj5, bool) && obj5 != null) {
                    i0Var = (i0) lVar.f57454b.invoke(obj5);
                }
                return new r0(i0Var3, i0Var4, i0Var5, i0Var);
            case 3:
                obj.getClass();
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (p005kotlin.jvm.internal.s.g(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) f0.f157160b.f57454b.invoke(obj6);
                Object obj7 = list2.get(0);
                String str = obj7 != null ? (String) obj7 : null;
                str.getClass();
                return new c((List<? extends c.d<? extends c.a>>) list3, str);
            case 4:
                obj.getClass();
                return new d6.i(((Integer) obj).intValue());
            case 5:
                obj.getClass();
                List list4 = (List) obj;
                return new d6.m(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case 6:
                obj.getClass();
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                g6.q.a aVar2 = g6.q.f76018b;
                g0 g0Var = f0.f157182x;
                Boolean bool2 = Boolean.FALSE;
                g6.q qVar2 = ((p005kotlin.jvm.internal.s.g(obj8, bool2) && g0Var == null) || obj8 == null) ? null : (g6.q) g0Var.f157197b.invoke(obj8);
                qVar2.getClass();
                long j8 = qVar2.f76021a;
                Object obj9 = list5.get(1);
                if ((!p005kotlin.jvm.internal.s.g(obj9, bool2) || g0Var != null) && obj9 != null) {
                    qVar = (g6.q) g0Var.f157197b.invoke(obj9);
                }
                qVar.getClass();
                return new d6.n(j8, qVar.f76021a, null);
            case 7:
                obj.getClass();
                return new w5.f0(((Integer) obj).intValue());
            case 8:
                obj.getClass();
                return d6.a.a(((Float) obj).floatValue());
            case 9:
                obj.getClass();
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                Integer num = obj10 != null ? (Integer) obj10 : null;
                num.getClass();
                int iIntValue = num.intValue();
                Object obj11 = list6.get(1);
                Integer num2 = obj11 != null ? (Integer) obj11 : null;
                num2.getClass();
                return w0.a(og.a.l(iIntValue, num2.intValue()));
            case 10:
                obj.getClass();
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                o4.d0.a aVar3 = o4.d0.f128823b;
                g0 g0Var2 = f0.f157176r;
                Boolean bool3 = Boolean.FALSE;
                o4.d0 d0Var = ((p005kotlin.jvm.internal.s.g(obj12, bool3) && g0Var2 == null) || obj12 == null) ? null : (o4.d0) g0Var2.f157197b.invoke(obj12);
                d0Var.getClass();
                long j14 = d0Var.f128833a;
                Object obj13 = list7.get(1);
                n4.c.a aVar4 = n4.c.f123541b;
                g0 g0Var3 = f0.f157184z;
                n4.c cVar = ((p005kotlin.jvm.internal.s.g(obj13, bool3) && g0Var3 == null) || obj13 == null) ? null : (n4.c) g0Var3.f157197b.invoke(obj13);
                cVar.getClass();
                long j15 = cVar.f123544a;
                Object obj14 = list7.get(2);
                Float f14 = obj14 != null ? (Float) obj14 : null;
                f14.getClass();
                return new q1(j14, j15, f14.floatValue(), null);
            case 11:
                obj.getClass();
                return d6.h.a(((Integer) obj).intValue());
            case 12:
                obj.getClass();
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                String str2 = obj15 != null ? (String) obj15 : null;
                str2.getClass();
                Object obj16 = list8.get(1);
                d4.l lVar2 = f0.f157168j;
                if (!p005kotlin.jvm.internal.s.g(obj16, Boolean.FALSE) && obj16 != null) {
                    r0Var = (r0) lVar2.f57454b.invoke(obj16);
                }
                return new m.b(str2, r0Var, null, 4, null);
            case 13:
                obj.getClass();
                return d6.j.a(((Integer) obj).intValue());
            case 14:
                obj.getClass();
                return d6.d.a(((Integer) obj).intValue());
            case 15:
                obj.getClass();
                List list9 = (List) obj;
                ArrayList arrayList = new ArrayList(list9.size());
                int size = list9.size();
                while (i14 < size) {
                    Object obj17 = list9.get(i14);
                    c.d dVar2 = (p005kotlin.jvm.internal.s.g(obj17, Boolean.FALSE) || obj17 == null) ? null : (c.d) f0.f157161c.f57454b.invoke(obj17);
                    dVar2.getClass();
                    arrayList.add(dVar2);
                    i14++;
                }
                return arrayList;
            case 16:
                obj.getClass();
                return w5.b0.a(((Integer) obj).intValue());
            case 17:
                obj.getClass();
                return w5.c0.a(((Integer) obj).intValue());
            case 18:
                Boolean bool4 = Boolean.FALSE;
                if (p005kotlin.jvm.internal.s.g(obj, bool4)) {
                    g6.q.f76018b.getClass();
                    return g6.q.a(g6.q.f76020d);
                }
                obj.getClass();
                List list10 = (List) obj;
                Object obj18 = list10.get(0);
                Float f15 = obj18 != null ? (Float) obj18 : null;
                f15.getClass();
                float fFloatValue = f15.floatValue();
                Object obj19 = list10.get(1);
                g6.r.a aVar5 = g6.r.f76022b;
                g0 g0Var4 = f0.f157183y;
                if ((!p005kotlin.jvm.internal.s.g(obj19, bool4) || g0Var4 != null) && obj19 != null) {
                    rVar = (g6.r) g0Var4.f157197b.invoke(obj19);
                }
                rVar.getClass();
                return g6.q.a(o53.f0.H(fFloatValue, rVar.f76025a));
            case 19:
                if (p005kotlin.jvm.internal.s.g(obj, 0)) {
                    g6.r.f76022b.getClass();
                    return g6.r.a(g6.r.f76024d);
                }
                if (p005kotlin.jvm.internal.s.g(obj, 1)) {
                    g6.r.f76022b.getClass();
                    return g6.r.a(g6.r.f76023c);
                }
                g6.r.f76022b.getClass();
                return g6.r.a(0L);
            case 20:
                if (p005kotlin.jvm.internal.s.g(obj, Boolean.FALSE)) {
                    n4.c.f123541b.getClass();
                    return n4.c.a(n4.c.f123543d);
                }
                obj.getClass();
                List list11 = (List) obj;
                Object obj20 = list11.get(0);
                Float f16 = obj20 != null ? (Float) obj20 : null;
                f16.getClass();
                float fFloatValue2 = f16.floatValue();
                Object obj21 = list11.get(1);
                Float f17 = obj21 != null ? (Float) obj21 : null;
                f17.getClass();
                return n4.c.a((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f17.floatValue())) & 4294967295L));
            case 21:
                obj.getClass();
                List list12 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list12.size());
                int size2 = list12.size();
                while (i14 < size2) {
                    Object obj22 = list12.get(i14);
                    z5.b.a aVar6 = z5.b.f202439b;
                    z5.b bVar2 = (p005kotlin.jvm.internal.s.g(obj22, Boolean.FALSE) || obj22 == null) ? null : (z5.b) f0.B.f57454b.invoke(obj22);
                    bVar2.getClass();
                    arrayList2.add(bVar2);
                    i14++;
                }
                return new z5.c(arrayList2);
            case 22:
                obj.getClass();
                return new z5.b((String) obj);
            case 23:
                obj.getClass();
                List list13 = (List) obj;
                Object obj23 = list13.get(0);
                String str3 = obj23 != null ? (String) obj23 : null;
                str3.getClass();
                Object obj24 = list13.get(1);
                return new m.a(str3, (p005kotlin.jvm.internal.s.g(obj24, Boolean.FALSE) || obj24 == null) ? null : (r0) f0.f157168j.f57454b.invoke(obj24), null);
            case 24:
                obj.getClass();
                List list14 = (List) obj;
                Object obj25 = list14.get(0);
                d6.f.a.C1235a c1235a = d6.f.a.f57735b;
                g0 g0Var5 = f0.D;
                Boolean bool5 = Boolean.FALSE;
                d6.f.a aVar7 = ((p005kotlin.jvm.internal.s.g(obj25, bool5) && g0Var5 == null) || obj25 == null) ? null : (d6.f.a) g0Var5.f157197b.invoke(obj25);
                aVar7.getClass();
                float f18 = aVar7.f57739a;
                Object obj26 = list14.get(1);
                d6.f.d.a aVar8 = d6.f.d.f57744b;
                g0 g0Var6 = f0.E;
                d6.f.d dVar3 = ((p005kotlin.jvm.internal.s.g(obj26, bool5) && g0Var6 == null) || obj26 == null) ? null : (d6.f.d) g0Var6.f157197b.invoke(obj26);
                dVar3.getClass();
                int i15 = dVar3.f57748a;
                Object obj27 = list14.get(2);
                d6.f.c.a aVar9 = d6.f.c.f57740b;
                g0 g0Var7 = f0.F;
                d6.f.c cVar2 = ((p005kotlin.jvm.internal.s.g(obj27, bool5) && g0Var7 == null) || obj27 == null) ? null : (d6.f.c) g0Var7.f157197b.invoke(obj27);
                cVar2.getClass();
                return new d6.f(f18, i15, cVar2.f57743a, null);
            case 25:
                obj.getClass();
                float fFloatValue3 = ((Float) obj).floatValue();
                d6.f.a.b(fFloatValue3);
                return d6.f.a.a(fFloatValue3);
            case 26:
                obj.getClass();
                return d6.f.d.a(((Integer) obj).intValue());
            case 27:
                obj.getClass();
                List list15 = (List) obj;
                Object obj28 = list15.get(0);
                g gVar = obj28 != null ? (g) obj28 : null;
                gVar.getClass();
                Object obj29 = list15.get(2);
                Integer num3 = obj29 != null ? (Integer) obj29 : null;
                num3.getClass();
                int iIntValue2 = num3.intValue();
                Object obj30 = list15.get(3);
                Integer num4 = obj30 != null ? (Integer) obj30 : null;
                num4.getClass();
                int iIntValue3 = num4.intValue();
                Object obj31 = list15.get(4);
                String str4 = obj31 != null ? (String) obj31 : null;
                str4.getClass();
                switch (f0.c.f157187a[gVar.ordinal()]) {
                    case 1:
                        Object obj32 = list15.get(1);
                        d4.l lVar3 = f0.f157166h;
                        if (!p005kotlin.jvm.internal.s.g(obj32, Boolean.FALSE) && obj32 != null) {
                            wVar = (w) lVar3.f57454b.invoke(obj32);
                        }
                        wVar.getClass();
                        dVar = new c.d(wVar, iIntValue2, iIntValue3, str4);
                        break;
                    case 2:
                        Object obj33 = list15.get(1);
                        d4.l lVar4 = f0.f157167i;
                        if (!p005kotlin.jvm.internal.s.g(obj33, Boolean.FALSE) && obj33 != null) {
                            i0Var2 = (i0) lVar4.f57454b.invoke(obj33);
                        }
                        i0Var2.getClass();
                        dVar = new c.d(i0Var2, iIntValue2, iIntValue3, str4);
                        break;
                    case 3:
                        Object obj34 = list15.get(1);
                        d4.l lVar5 = f0.f157162d;
                        if (!p005kotlin.jvm.internal.s.g(obj34, Boolean.FALSE) && obj34 != null) {
                            b1Var = (b1) lVar5.f57454b.invoke(obj34);
                        }
                        b1Var.getClass();
                        dVar = new c.d(b1Var, iIntValue2, iIntValue3, str4);
                        break;
                    case 4:
                        Object obj35 = list15.get(1);
                        d4.l lVar6 = f0.f157163e;
                        if (!p005kotlin.jvm.internal.s.g(obj35, Boolean.FALSE) && obj35 != null) {
                            a1Var = (a1) lVar6.f57454b.invoke(obj35);
                        }
                        a1Var.getClass();
                        dVar = new c.d(a1Var, iIntValue2, iIntValue3, str4);
                        break;
                    case 5:
                        Object obj36 = list15.get(1);
                        d4.l lVar7 = f0.f157164f;
                        if (!p005kotlin.jvm.internal.s.g(obj36, Boolean.FALSE) && obj36 != null) {
                            bVar = (m.b) lVar7.f57454b.invoke(obj36);
                        }
                        bVar.getClass();
                        dVar = new c.d(bVar, iIntValue2, iIntValue3, str4);
                        break;
                    case 6:
                        Object obj37 = list15.get(1);
                        d4.l lVar8 = f0.f157165g;
                        if (!p005kotlin.jvm.internal.s.g(obj37, Boolean.FALSE) && obj37 != null) {
                            aVar = (m.a) lVar8.f57454b.invoke(obj37);
                        }
                        aVar.getClass();
                        dVar = new c.d(aVar, iIntValue2, iIntValue3, str4);
                        break;
                    case 7:
                        Object obj38 = list15.get(1);
                        String str5 = obj38 != null ? (String) obj38 : null;
                        str5.getClass();
                        dVar = new c.d(k0.a(str5), iIntValue2, iIntValue3, str4);
                        break;
                    default:
                        lc.u0.r();
                        return null;
                }
                return dVar;
            case 28:
                obj.getClass();
                return d6.f.c.a(((Integer) obj).intValue());
            default:
                String str6 = obj != null ? (String) obj : null;
                str6.getClass();
                return new b1(str6);
        }
    }
}
