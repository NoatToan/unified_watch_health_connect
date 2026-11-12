package bo;

import am.x0;
import c22.l3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p13.x;

/* JADX INFO: loaded from: classes7.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:80:0x0172  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final b a(String str, ao.m mVar, List<? extends jo.c> list) {
        k kVar;
        T t7;
        T t14;
        Double dValueOf;
        Double dValueOf2;
        Double dValueOf3;
        Double dValueOf4;
        Double dValueOf5;
        double d14;
        double d15;
        am.g gVar;
        x0 x0Var;
        am.g gVar2;
        list.getClass();
        r0 r0Var = new r0();
        r0 r0Var2 = new r0();
        String str2 = null;
        int i14 = 3;
        i iVar = new i((Double) (false ? 1 : 0), (Double) (false ? 1 : 0), i14, (p005kotlin.jvm.internal.j) (false ? 1 : 0));
        i iVar2 = new i((Double) (false ? 1 : 0), (Double) (false ? 1 : 0), i14, (p005kotlin.jvm.internal.j) (false ? 1 : 0));
        i iVar3 = new i((Double) (false ? 1 : 0), (Double) (false ? 1 : 0), i14, (p005kotlin.jvm.internal.j) (false ? 1 : 0));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (((mVar == null || (gVar2 = mVar.f11528a) == null) ? null : gVar2.f3962b) != x0.f4304m && mVar != null && (gVar = mVar.f11528a) != null && (x0Var = gVar.f3962b) != null) {
            arrayList = x.m(x0Var.f4358a);
        }
        ArrayList arrayList3 = arrayList;
        Iterator it = list.iterator();
        i iVar4 = iVar;
        String str3 = null;
        String string = null;
        String string2 = null;
        i iVar5 = iVar2;
        i iVar6 = iVar3;
        while (it.hasNext()) {
            jo.c cVar = (jo.c) it.next();
            if (cVar instanceof jo.c.a.C1916a) {
                for (ho.b bVar : ((jo.c.a.C1916a) cVar).f99700c) {
                    if (bVar instanceof ho.b.C1677b) {
                        arrayList2.add(((ho.b.C1677b) bVar).f84585c.f4358a);
                    } else {
                        if (!(bVar instanceof ho.b.a)) {
                            u0.r();
                            return null;
                        }
                        arrayList3.add(bVar.f84581a.f4358a);
                    }
                }
            } else {
                if (cVar instanceof jo.c.a.b) {
                    jo.c.a.b bVar2 = (jo.c.a.b) cVar;
                    eo.d dVar = bVar2.f99703c;
                    string = dVar != null ? fz0.d.a(dVar.b()).toString() : str2;
                    eo.d dVar2 = bVar2.f99704d;
                    string2 = dVar2 != null ? fz0.d.a(dVar2.b()).toString() : str2;
                } else if (cVar instanceof jo.c.a.C1917c) {
                    jo.c.a.C1917c c1917c = (jo.c.a.C1917c) cVar;
                    boolean z14 = c1917c.f99708e;
                    Integer num = c1917c.f99706c;
                    if (num != null) {
                        double dIntValue = num.intValue();
                        if (z14) {
                            l3.f23124b.getClass();
                            d15 = dIntValue * 1000.0d;
                        } else {
                            l3.f23124b.getClass();
                            d15 = dIntValue * 1609.344d;
                        }
                        dValueOf4 = Double.valueOf(d15);
                    } else {
                        dValueOf4 = null;
                    }
                    Integer num2 = c1917c.f99707d;
                    if (num2 != null) {
                        double dIntValue2 = num2.intValue();
                        if (z14) {
                            l3.f23124b.getClass();
                            d14 = dIntValue2 * 1000.0d;
                        } else {
                            l3.f23124b.getClass();
                            d14 = dIntValue2 * 1609.344d;
                        }
                        dValueOf5 = Double.valueOf(d14);
                    } else {
                        dValueOf5 = null;
                    }
                    iVar4 = new i(dValueOf4, dValueOf5);
                } else {
                    it = it;
                    if (cVar instanceof jo.c.a.d) {
                        str3 = ((jo.c.a.d) cVar).f99713c.f64757b;
                    } else if (cVar instanceof jo.c.a.e) {
                        jo.c.a.e eVar = (jo.c.a.e) cVar;
                        Integer num3 = eVar.f99715c;
                        Double dValueOf6 = num3 != null ? Double.valueOf(((double) num3.intValue()) * 60.0d) : null;
                        Integer num4 = eVar.f99716d;
                        if (num4 == null) {
                            dValueOf3 = null;
                        } else {
                            if (num4.intValue() >= 1440) {
                                num4 = null;
                            }
                            if (num4 != null) {
                                dValueOf3 = Double.valueOf(((double) num4.intValue()) * 60.0d);
                            } else {
                                dValueOf3 = null;
                            }
                        }
                        iVar5 = new i(dValueOf6, dValueOf3);
                    } else if (cVar instanceof jo.c.a.f) {
                        jo.c.a.f fVar = (jo.c.a.f) cVar;
                        boolean z15 = fVar.f99722e;
                        Integer num5 = fVar.f99720c;
                        if (num5 != null) {
                            double dIntValue3 = num5.intValue();
                            if (!z15) {
                                l3.f23124b.getClass();
                                dIntValue3 /= 3.2808399d;
                            }
                            dValueOf = Double.valueOf(dIntValue3);
                        } else {
                            dValueOf = null;
                        }
                        Integer num6 = fVar.f99721d;
                        if (num6 != null) {
                            double dIntValue4 = num6.intValue();
                            if (!z15) {
                                l3.f23124b.getClass();
                                dIntValue4 /= 3.2808399d;
                            }
                            dValueOf2 = Double.valueOf(dIntValue4);
                        } else {
                            dValueOf2 = null;
                        }
                        iVar6 = new i(dValueOf, dValueOf2);
                    } else if (cVar instanceof jo.c.AbstractC1918c.a) {
                        Boolean bool = ((jo.c.AbstractC1918c.a) cVar).f99727c;
                        if (!s.g(bool, Boolean.TRUE)) {
                            t14 = bool;
                            t14 = 0;
                        }
                        t14 = bool;
                        r0Var2.f105810a = t14;
                    } else {
                        if (!(cVar instanceof jo.c.AbstractC1918c.b)) {
                            u0.r();
                            return null;
                        }
                        Boolean bool2 = ((jo.c.AbstractC1918c.b) cVar).f99727c;
                        if (!s.g(bool2, Boolean.TRUE)) {
                            t7 = bool2;
                            t7 = 0;
                        }
                        t7 = bool2;
                        r0Var.f105810a = t7;
                    }
                }
                it = it;
                str2 = null;
            }
            it = it;
            it = it;
            str2 = null;
        }
        if (mVar != null) {
            Integer numValueOf = Integer.valueOf(mVar.f11529b);
            Integer numValueOf2 = Integer.valueOf(mVar.f11530c);
            jo.f fVar2 = mVar.f11531d;
            kVar = new k(numValueOf, numValueOf2, fVar2.f99758b.f64781a, fVar2.f99757a.f64775a);
        } else {
            kVar = null;
        }
        return new b(kVar, (Boolean) r0Var2.f105810a, str, (Boolean) r0Var.f105810a, str3, arrayList3, arrayList2, (List) null, string, string2, iVar4, iVar5, iVar6, 128, (p005kotlin.jvm.internal.j) null);
    }
}
