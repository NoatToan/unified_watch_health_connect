package lo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements androidx.lifecycle.z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f113724b;

    public /* synthetic */ d(f fVar, int i14) {
        this.f113723a = i14;
        this.f113724b = fVar;
    }

    @Override // androidx.lifecycle.z0
    public final void onChanged(Object obj) {
        T t7;
        int i14 = this.f113723a;
        f fVar = this.f113724b;
        com.garmin.android.apps.connectmobile.g3 g3Var = (com.garmin.android.apps.connectmobile.g3) obj;
        switch (i14) {
            case 0:
                if (g3Var.f35300a == fw.p.SUCCESS && (t7 = g3Var.f35301b) != 0) {
                    f0 f0Var = fVar.f113949a;
                    List<pe0.b> list = (List) t7;
                    if (f0Var.f113817p1) {
                        HashMap map = new HashMap();
                        for (pe0.b bVar : list) {
                            map.put(Long.valueOf(bVar.f137402a), bVar);
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Long l14 : f0Var.f113826s1) {
                            if (map.containsKey(l14)) {
                                arrayList.add(l14);
                            }
                        }
                        f0Var.f113826s1 = arrayList;
                        ArrayList arrayList2 = new ArrayList();
                        for (pe0.b bVar2 : list) {
                            boolean zContains = f0Var.f113826s1.contains(Long.valueOf(bVar2.f137402a));
                            if (bVar2.f137404c != je0.j.RETIRED || zContains) {
                                arrayList2.add(bVar2);
                            }
                        }
                        f0Var.f113829t1 = arrayList2;
                        f0Var.f113820q1 = true;
                        f0Var.u0();
                        break;
                    }
                }
                break;
            case 1:
                if (g3Var.f35300a == fw.p.LOADING) {
                    g22.e.l(fVar);
                } else {
                    g22.e.f(fVar);
                    fVar.T6();
                }
                break;
            default:
                if (g3Var.f35300a == fw.p.SUCCESS) {
                    boolean zEquals = Boolean.TRUE.equals(g3Var.f35301b);
                    f0 f0Var2 = fVar.f113949a;
                    f0Var2.f113813o1 = zEquals;
                    f0Var2.T0();
                    if (zEquals) {
                        oo.b bVar3 = fVar.f113750y;
                        bVar3.getClass();
                        t13.g gVar = androidx.lifecycle.v1.a(bVar3).f183565a;
                        x53.c cVar = o53.s0.f129406a;
                        androidx.lifecycle.m.a(gVar.plus(x53.b.f189152a), new oo.f(null), 2).f(fVar.getViewLifecycleOwner(), new d(fVar, 0));
                    }
                    break;
                }
                break;
        }
    }
}
