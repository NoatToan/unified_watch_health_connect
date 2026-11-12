package ei0;

import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import kd0.l2;
import kd0.m2;

/* JADX INFO: loaded from: classes8.dex */
public interface d extends com.garmin.android.apps.connectmobile.f0 {
    static Object E0(d dVar, List list, v13.c cVar, int i14) {
        if ((i14 & 1) != 0) {
            list = com.garmin.android.apps.connectmobile.userprofile.model.k.f46891k;
        }
        return dVar.f2(list, null, p0.f64292c, cVar);
    }

    static Object F(d dVar, Integer num, Integer num2, List list, v13.c cVar, int i14) {
        if ((i14 & 1) != 0) {
            num = null;
        }
        return dVar.W2(num, num2, list, p0.f64292c, cVar);
    }

    Object A(List list, List list2, m2 m2Var);

    Object B3(Long l14, boolean z14, v13.i iVar);

    Object C0(List list, Integer num, Integer num2, qz0.d dVar);

    Object D(String str, boolean z14, v13.i iVar);

    Object I3(Long l14, v13.c cVar);

    Object K(v13.c cVar);

    Object O1(String str, v13.i iVar);

    Object R0(String str, String str2, List list, Integer num, Integer num2, List list2, fi0.s sVar);

    Object S(List list, List list2, mi0.d.a aVar);

    Object T3(Long l14, li0.i iVar);

    Object U(String str, li0.l lVar);

    Object W2(Integer num, Integer num2, List list, w13.c cVar, v13.c cVar2);

    Object Z1(v13.c cVar);

    Object Z3(String str, v13.i iVar);

    Object a3(t13.d<? super v2<Integer>> dVar);

    Object e0(String str, v13.i iVar);

    Object e3(String str, String str2, List list, Integer num, Integer num2, List list2, fi0.s sVar);

    Object f2(List list, Boolean bool, w13.c cVar, v13.c cVar2);

    Object f3(String str, int i14, int i15, List list, fi0.u uVar);

    Object g2(String str, li0.q qVar);

    Object h2(Integer num, Integer num2, r12.c cVar);

    Object h3(int i14, int i15, q12.b bVar);

    Object i0(String str, v13.c cVar);

    Object i4(String str, List list, Integer num, Integer num2, w13.c cVar, v13.c cVar2);

    Object k0(List list, Boolean bool, List list2, mt0.a0 a0Var);

    Object l2(List list, l2 l2Var);

    Object l3(List list, qz0.c cVar);

    Object m3(String str, li0.f.c cVar);

    Object o4(List list, List list2, mi0.d.c cVar);

    Object r0(List list, List list2, w13.c cVar, v13.c cVar2);

    Object t0(String str, List list, Integer num, Integer num2, w13.c cVar, v13.c cVar2);

    Object u4(hi0.i iVar, List list, fi0.j jVar);

    Object x(String str, v13.i iVar);

    Object x2(String str, li0.f.i iVar);

    Object z0(boolean z14, v13.c cVar);
}
