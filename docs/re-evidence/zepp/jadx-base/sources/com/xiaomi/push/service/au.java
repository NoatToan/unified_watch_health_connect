package com.xiaomi.push.service;

import android.util.Pair;
import com.xiaomi.push.dc;
import com.xiaomi.push.dd;
import com.xiaomi.push.de;
import com.xiaomi.push.dg;
import com.xiaomi.push.dr;
import com.xiaomi.push.ds;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class au {
    public static int a(at atVar, dc dcVar) {
        return atVar.a(dcVar, z.a[dcVar.ordinal()] != 1 ? 0 : 1);
    }

    public static void a(at atVar, dr drVar) {
        atVar.a(b(drVar.a(), true));
        atVar.e();
    }

    public static void a(at atVar, ds dsVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (de deVar : dsVar.a()) {
            arrayList.add(new Pair<>(deVar.m3651a(), Integer.valueOf(deVar.a())));
            List<Pair<Integer, Object>> listB = b(deVar.f75a, false);
            if (!com.xiaomi.push.k.a(listB)) {
                arrayList2.addAll(listB);
            }
        }
        atVar.a(arrayList, arrayList2);
        atVar.e();
    }

    private static List<Pair<Integer, Object>> b(List<dg> list, boolean z) {
        Pair pair;
        if (com.xiaomi.push.k.a(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (dg dgVar : list) {
            int iA = dgVar.a();
            dd ddVarA = dd.a(dgVar.b());
            if (ddVarA != null) {
                if (z && dgVar.f80a) {
                    arrayList.add(new Pair(Integer.valueOf(iA), null));
                } else {
                    int i = z.b[ddVarA.ordinal()];
                    if (i == 1) {
                        pair = new Pair(Integer.valueOf(iA), Integer.valueOf(dgVar.c()));
                    } else if (i == 2) {
                        pair = new Pair(Integer.valueOf(iA), Long.valueOf(dgVar.m3655a()));
                    } else if (i != 3) {
                        pair = i != 4 ? null : new Pair(Integer.valueOf(iA), Boolean.valueOf(dgVar.g()));
                    } else {
                        pair = new Pair(Integer.valueOf(iA), dgVar.m3656a());
                    }
                    arrayList.add(pair);
                }
            }
        }
        return arrayList;
    }
}
