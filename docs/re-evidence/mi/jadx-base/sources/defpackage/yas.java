package defpackage;

import android.util.Pair;
import com.xiaomi.push.ih;
import com.xiaomi.push.ii;
import com.xiaomi.push.ik;
import com.xiaomi.push.im;
import com.xiaomi.push.iy;
import com.xiaomi.push.iz;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class yas {
    public static int a(vas vasVar, ih ihVar) {
        return vasVar.b(ihVar, cbs.f5172a[ihVar.ordinal()] != 1 ? 0 : 1);
    }

    public static List<Pair<Integer, Object>> b(List<im> list, boolean z) {
        Pair pair;
        if (m4s.a(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (im imVar : list) {
            int iA = imVar.a();
            ii iiVarA = ii.a(imVar.b());
            if (iiVarA != null) {
                if (z && imVar.f131a) {
                    arrayList.add(new Pair(Integer.valueOf(iA), null));
                } else {
                    int i = cbs.f5173b[iiVarA.ordinal()];
                    if (i == 1) {
                        pair = new Pair(Integer.valueOf(iA), Integer.valueOf(imVar.c()));
                    } else if (i == 2) {
                        pair = new Pair(Integer.valueOf(iA), Long.valueOf(imVar.m698a()));
                    } else if (i != 3) {
                        pair = i != 4 ? null : new Pair(Integer.valueOf(iA), Boolean.valueOf(imVar.g()));
                    } else {
                        pair = new Pair(Integer.valueOf(iA), imVar.m699a());
                    }
                    arrayList.add(pair);
                }
            }
        }
        return arrayList;
    }

    public static void c(vas vasVar, iy iyVar) {
        x9s.A("OnlineConfigHelper", "-->updateCustomConfigs(): onlineConfig=", vasVar, ", configMessage=", iyVar);
        vasVar.k(b(iyVar.a(), true));
        vasVar.n();
    }

    public static void d(vas vasVar, iz izVar) {
        x9s.A("OnlineConfigHelper", "-->updateNormalConfigs(): onlineConfig=", vasVar, ", configMessage=", izVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (ik ikVar : izVar.a()) {
            arrayList.add(new Pair<>(ikVar.m694a(), Integer.valueOf(ikVar.a())));
            List<Pair<Integer, Object>> listB = b(ikVar.f123a, false);
            if (!m4s.a(listB)) {
                arrayList2.addAll(listB);
            }
        }
        vasVar.l(arrayList, arrayList2);
        vasVar.n();
    }
}
