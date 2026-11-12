package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ugq {
    public static long d(List<ugv> list) {
        Iterator<ugv> it = list.iterator();
        long jA = 0;
        while (it.hasNext()) {
            jA += it.next().a();
        }
        return jA;
    }

    public static ugv a(List<ugv> list) {
        for (ugv ugvVar : list) {
            if (!ugvVar.b()) {
                return ugvVar;
            }
        }
        return null;
    }
}
