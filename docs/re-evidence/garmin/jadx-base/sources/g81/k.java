package g81;

import am.x0;
import am.y0;
import c22.c3;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;
import p13.u0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg81/k;", "", "<init>", "()V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f76348a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f76349b = u0.e(new o13.p(x0.f4308n, Integer.valueOf(R.color.gds_data_viz_orange_secondary)), new o13.p(x0.f4312o, Integer.valueOf(R.color.gds_data_viz_green_primary)), new o13.p(x0.f4316p, Integer.valueOf(R.color.gds_data_viz_orange_primary)), new o13.p(x0.f4324r, Integer.valueOf(R.color.gds_data_viz_blue_primary)), new o13.p(x0.U1, Integer.valueOf(R.color.gds_data_viz_blue_secondary)), new o13.p(x0.f4331t, Integer.valueOf(R.color.gds_data_viz_green_secondary)), new o13.p(x0.f4320q, Integer.valueOf(R.color.gds_data_viz_red_primary)), new o13.p(x0.f4350y, Integer.valueOf(R.color.gds_data_viz_teal_secondary)), new o13.p(x0.f4268a3, Integer.valueOf(R.color.lime_70)), new o13.p(x0.f4277d3, Integer.valueOf(R.color.gds_data_viz_purple_secondary)), new o13.p(x0.f4323q3, Integer.valueOf(R.color.lime_40)), new o13.p(x0.D, Integer.valueOf(R.color.purple_70)), new o13.p(x0.f4346x, Integer.valueOf(R.color.gds_data_viz_red_secondary)));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f76350c = R.color.gds_data_viz_neutral_secondary;

    private k() {
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0105  */
    /* JADX WARN: Code duplicated, block: B:69:0x0154  */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.util.Map] */
    public static ArrayList a(List list, y0 y0Var, LinkedHashMap linkedHashMap) {
        Object next;
        double dDoubleValue;
        Double contribution;
        g gVar;
        i53.c cVarB;
        x0 x0Var;
        c3 c3Var;
        c3 c3Var2;
        x0 x0Var2;
        v vVar;
        x0 x0Var3;
        x0 x0Var4;
        list.getClass();
        List<x0> listK = y0Var.k(x0.f4304m);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer group = ((n61.a) next).getGroup();
            int i14 = a81.b.OTHER.f1949a;
            if (group != null && group.intValue() == i14) {
                break;
            }
        }
        n61.a aVar = (n61.a) next;
        ArrayList arrayListZ = p13.h0.Z(p13.h0.y0(list, aVar));
        ArrayList arrayList = new ArrayList();
        Iterator<T> it3 = listK.iterator();
        while (true) {
            dDoubleValue = 0.0d;
            if (!it3.hasNext()) {
                break;
            }
            x0 x0Var5 = (x0) it3.next();
            List<x0> listK2 = y0Var.k(x0Var5);
            c3 c3Var3 = x0Var5.f4360c;
            ArrayList arrayListD0 = p13.h0.D0(listK2, x0Var5);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayListZ) {
                n61.a aVar2 = (n61.a) obj;
                Integer group2 = aVar2.getGroup();
                if (group2 != null) {
                    int iIntValue = group2.intValue();
                    a81.b.f1945e.getClass();
                    a81.b bVarA = a81.b.a.a(iIntValue);
                    if (bVarA != null) {
                        x0Var4 = bVarA.f1950b;
                    } else {
                        x0Var4 = null;
                    }
                } else {
                    x0Var4 = null;
                }
                Integer activityTypeId = aVar2.getActivityTypeId();
                x0 x0VarJ = activityTypeId != null ? y0Var.j(activityTypeId.intValue()) : null;
                if (p13.h0.R(arrayListD0, x0Var4) || p13.h0.R(arrayListD0, x0VarJ)) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                gVar = null;
            } else {
                Iterator it4 = arrayList2.iterator();
                double dDoubleValue2 = 0.0d;
                while (it4.hasNext()) {
                    Double contribution2 = ((n61.a) it4.next()).getContribution();
                    dDoubleValue2 += contribution2 != null ? contribution2.doubleValue() : 0.0d;
                }
                if (arrayList2.isEmpty()) {
                    cVarB = j53.l.b();
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : arrayList2) {
                        n61.a aVar3 = (n61.a) obj2;
                        Integer group3 = aVar3.getGroup();
                        if (group3 != null) {
                            int iIntValue2 = group3.intValue();
                            a81.b.f1945e.getClass();
                            a81.b bVarA2 = a81.b.a.a(iIntValue2);
                            if (bVarA2 != null) {
                                x0Var3 = bVarA2.f1950b;
                            } else {
                                x0Var3 = null;
                            }
                        } else {
                            x0Var3 = null;
                        }
                        Integer activityTypeId2 = aVar3.getActivityTypeId();
                        x0 x0VarJ2 = activityTypeId2 != null ? y0Var.j(activityTypeId2.intValue()) : null;
                        if (x0Var3 != null || x0VarJ2 != null) {
                            arrayList3.add(obj2);
                        }
                    }
                    List<n61.a> listN0 = p13.h0.N0(arrayList3, new i());
                    ArrayList arrayList4 = new ArrayList();
                    for (n61.a aVar4 : listN0) {
                        Integer group4 = aVar4.getGroup();
                        if (group4 != null) {
                            int iIntValue3 = group4.intValue();
                            a81.b.f1945e.getClass();
                            a81.b bVarA3 = a81.b.a.a(iIntValue3);
                            if (bVarA3 != null) {
                                x0Var2 = bVarA3.f1950b;
                            } else {
                                x0Var2 = null;
                            }
                        } else {
                            x0Var2 = null;
                        }
                        Integer activityTypeId3 = aVar4.getActivityTypeId();
                        x0 x0VarJ3 = activityTypeId3 != null ? y0Var.j(activityTypeId3.intValue()) : null;
                        String str = l3.f23125c.format(aVar4.getContribution());
                        if (x0Var2 != null) {
                            c3 c3Var4 = x0Var2.f4360c;
                            str.getClass();
                            vVar = new v(c3Var4, x0Var2, str);
                        } else if (x0VarJ3 != null) {
                            c3 c3Var5 = x0VarJ3.f4360c;
                            str.getClass();
                            vVar = new v(c3Var5, x0VarJ3, str);
                        } else {
                            vVar = null;
                        }
                        if (vVar != null) {
                            arrayList4.add(vVar);
                        }
                    }
                    cVarB = i53.a.j(arrayList4);
                }
                int size = ((Set) linkedHashMap.getOrDefault(x0Var5, p13.l0.f134950a)).size();
                ?? r14 = f76349b;
                if (size == 1) {
                    v vVar2 = (v) p13.h0.e0(0, cVarB);
                    c3 c3Var6 = (vVar2 == null || (c3Var2 = vVar2.f76409a) == null) ? c3Var3 : c3Var2;
                    c3 c3Var7 = (vVar2 == null || (c3Var = vVar2.f76409a) == null) ? c3Var3 : c3Var;
                    Integer num = (Integer) r14.get(x0Var5);
                    Double dValueOf = Double.valueOf(dDoubleValue2);
                    String str2 = l3.f23125c.format(dDoubleValue2);
                    str2.getClass();
                    gVar = new g(c3Var6, c3Var7, num, dValueOf, str2, (vVar2 == null || (x0Var = vVar2.f76410b) == null) ? x0Var5 : x0Var, j53.l.b());
                } else {
                    c3 c3Var8 = x0Var5.f4360c;
                    Integer num2 = (Integer) r14.get(x0Var5);
                    Double dValueOf2 = Double.valueOf(dDoubleValue2);
                    String str3 = l3.f23125c.format(dDoubleValue2);
                    str3.getClass();
                    gVar = new g(c3Var8, c3Var8, num2, dValueOf2, str3, x0Var5, cVarB);
                }
            }
            if (gVar != null) {
                arrayList.add(gVar);
            }
        }
        ArrayList arrayListD1 = p13.h0.d1(p13.h0.N0(arrayList, new h()));
        ArrayList arrayListD2 = p13.h0.d1(arrayListD1.size() >= 3 ? arrayListD1.subList(0, 3) : arrayListD1);
        Iterator it5 = p13.h0.z0(arrayListD1, p13.h0.g1(arrayListD2)).iterator();
        double dDoubleValue3 = 0.0d;
        while (it5.hasNext()) {
            Double d14 = ((g) it5.next()).f76328d;
            dDoubleValue3 += d14 != null ? d14.doubleValue() : 0.0d;
        }
        if (aVar != null && (contribution = aVar.getContribution()) != null) {
            dDoubleValue = contribution.doubleValue();
        }
        double d15 = dDoubleValue3 + dDoubleValue;
        if (d15 >= 0.01d) {
            c22.i iVarB = c22.i.b(R.string.lbl_miscellaneous_activities);
            c22.i iVarB2 = c22.i.b(R.string.lbl_miscellaneous_activities);
            Integer numValueOf = Integer.valueOf(R.color.gds_data_viz_neutral_secondary);
            Double dValueOf3 = Double.valueOf(d15);
            String str4 = l3.f23125c.format(d15);
            str4.getClass();
            arrayListD2.add(new g(iVarB, iVarB2, numValueOf, dValueOf3, str4, null, null, 96, null));
        }
        return arrayListD2;
    }
}
