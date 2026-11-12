package cf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p13.u0;
import ue.h0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class y implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f26997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f26998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f26999d;

    public /* synthetic */ y(String str, List list, b0 b0Var, int i14) {
        this.f26996a = i14;
        this.f26997b = str;
        this.f26998c = list;
        this.f26999d = b0Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        int i14 = this.f26996a;
        int i15 = 16;
        int i16 = 15;
        int i17 = 14;
        int i18 = 4;
        int i19 = 3;
        int i24 = 2;
        int i25 = 1;
        int i26 = 0;
        b0 b0Var = this.f26999d;
        List list = this.f26998c;
        String str = this.f26997b;
        switch (i14) {
            case 0:
                ud.a aVar = (ud.a) obj;
                b0.c cVar = b0.f26898d;
                aVar.getClass();
                ud.c cVarM0 = aVar.M0(str);
                try {
                    Iterator it = list.iterator();
                    int i27 = 1;
                    while (it.hasNext()) {
                        cVarM0.q3(i27, (String) it.next());
                        i27++;
                    }
                    p1.a<String, List<String>> aVar2 = new p1.a<>();
                    p1.a<String, List<androidx.work.c>> aVar3 = new p1.a<>();
                    while (cVarM0.J0()) {
                        String strM1 = cVarM0.M1(0);
                        if (!aVar2.containsKey(strM1)) {
                            aVar2.put(strM1, new ArrayList());
                        }
                        String strM2 = cVarM0.M1(0);
                        if (!aVar3.containsKey(strM2)) {
                            aVar3.put(strM2, new ArrayList());
                        }
                    }
                    cVarM0.reset();
                    b0Var.E(aVar, aVar2);
                    b0Var.D(aVar, aVar3);
                    ArrayList arrayList = new ArrayList();
                    while (cVarM0.J0()) {
                        String strM3 = cVarM0.M1(0);
                        h0.c cVarF = f0.f((int) cVarM0.getLong(i25));
                        byte[] blob = cVarM0.getBlob(2);
                        androidx.work.c.f11464b.getClass();
                        androidx.work.c cVarA = androidx.work.c.b.a(blob);
                        int i28 = (int) cVarM0.getLong(3);
                        int i29 = (int) cVarM0.getLong(4);
                        long j8 = cVarM0.getLong(14);
                        long j14 = cVarM0.getLong(15);
                        long j15 = cVarM0.getLong(16);
                        ue.a aVarC = f0.c((int) cVarM0.getLong(17));
                        long j16 = cVarM0.getLong(18);
                        long j17 = cVarM0.getLong(19);
                        int i30 = (int) cVarM0.getLong(20);
                        long j18 = cVarM0.getLong(21);
                        int i34 = (int) cVarM0.getLong(22);
                        ue.f fVar = new ue.f(f0.j(cVarM0.getBlob(6)), f0.d((int) cVarM0.getLong(5)), ((int) cVarM0.getLong(7)) != 0, ((int) cVarM0.getLong(8)) != 0, ((int) cVarM0.getLong(9)) != 0, ((int) cVarM0.getLong(10)) != 0, cVarM0.getLong(11), cVarM0.getLong(12), f0.a(cVarM0.getBlob(13)));
                        Object objC = u0.c(cVarM0.M1(0), aVar2);
                        objC.getClass();
                        List list2 = (List) objC;
                        Object objC2 = u0.c(cVarM0.M1(0), aVar3);
                        objC2.getClass();
                        arrayList.add(new t.c(strM3, cVarF, cVarA, j8, j14, j15, fVar, i28, aVarC, j16, j17, i30, i29, j18, i34, list2, (List) objC2));
                        i25 = 1;
                        break;
                    }
                    return arrayList;
                } finally {
                    cVarM0.close();
                }
            default:
                ud.a aVar4 = (ud.a) obj;
                b0.c cVar2 = b0.f26898d;
                aVar4.getClass();
                ud.c cVarM1 = aVar4.M0(str);
                try {
                    Iterator it3 = list.iterator();
                    int i35 = 1;
                    while (it3.hasNext()) {
                        cVarM1.q3(i35, (String) it3.next());
                        i35++;
                    }
                    p1.a<String, List<String>> aVar5 = new p1.a<>();
                    p1.a<String, List<androidx.work.c>> aVar6 = new p1.a<>();
                    while (cVarM1.J0()) {
                        String strM4 = cVarM1.M1(0);
                        if (!aVar5.containsKey(strM4)) {
                            aVar5.put(strM4, new ArrayList());
                        }
                        String strM5 = cVarM1.M1(0);
                        if (!aVar6.containsKey(strM5)) {
                            aVar6.put(strM5, new ArrayList());
                        }
                    }
                    cVarM1.reset();
                    b0Var.E(aVar4, aVar5);
                    b0Var.D(aVar4, aVar6);
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarM1.J0()) {
                        String strM6 = cVarM1.M1(i26);
                        h0.c cVarF2 = f0.f((int) cVarM1.getLong(1));
                        byte[] blob2 = cVarM1.getBlob(i24);
                        androidx.work.c.f11464b.getClass();
                        androidx.work.c cVarA2 = androidx.work.c.b.a(blob2);
                        int i36 = (int) cVarM1.getLong(i19);
                        int i37 = (int) cVarM1.getLong(i18);
                        long j19 = cVarM1.getLong(i17);
                        long j24 = cVarM1.getLong(i16);
                        long j25 = cVarM1.getLong(i15);
                        ue.a aVarC2 = f0.c((int) cVarM1.getLong(17));
                        long j26 = cVarM1.getLong(18);
                        long j27 = cVarM1.getLong(19);
                        int i38 = (int) cVarM1.getLong(20);
                        long j28 = cVarM1.getLong(21);
                        int i39 = (int) cVarM1.getLong(22);
                        ue.f fVar2 = new ue.f(f0.j(cVarM1.getBlob(6)), f0.d((int) cVarM1.getLong(5)), ((int) cVarM1.getLong(7)) != 0, ((int) cVarM1.getLong(8)) != 0, ((int) cVarM1.getLong(9)) != 0, ((int) cVarM1.getLong(10)) != 0, cVarM1.getLong(11), cVarM1.getLong(12), f0.a(cVarM1.getBlob(13)));
                        Object objC3 = u0.c(cVarM1.M1(0), aVar5);
                        objC3.getClass();
                        List list3 = (List) objC3;
                        Object objC4 = u0.c(cVarM1.M1(0), aVar6);
                        objC4.getClass();
                        arrayList2.add(new t.c(strM6, cVarF2, cVarA2, j19, j24, j25, fVar2, i36, aVarC2, j26, j27, i38, i37, j28, i39, list3, (List) objC4));
                        i15 = 16;
                        i16 = 15;
                        i17 = 14;
                        i18 = 4;
                        i19 = 3;
                        i24 = 2;
                        i26 = 0;
                        break;
                    }
                    return arrayList2;
                } finally {
                    cVarM1.close();
                }
        }
    }
}
