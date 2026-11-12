package com.xiaomi.onetrack.a.c;

import com.xiaomi.onetrack.util.p;
import com.xiaomi.onetrack.util.q;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13711a = "PollingUploader";

    public static void a() {
        ArrayList<com.xiaomi.onetrack.a.b.a> arrayList;
        try {
            if (b()) {
                p.a(f13711a, "即将读取数据库并上传数据");
                int i = 0;
                while (i <= 20) {
                    com.xiaomi.onetrack.a.a.a().d();
                    a aVarB = com.xiaomi.onetrack.a.a.a().b();
                    if (aVarB != null && (arrayList = aVarB.f13707b) != null && arrayList.size() > 0) {
                        ArrayList<Integer> arrayList2 = new ArrayList<>();
                        ArrayList<Integer> arrayList3 = new ArrayList<>();
                        for (com.xiaomi.onetrack.a.b.a aVar : aVarB.f13707b) {
                            boolean zB = com.xiaomi.onetrack.g.b.b(aVar.c());
                            int iB = aVar.b();
                            if (zB) {
                                arrayList2.add(Integer.valueOf(iB));
                            } else {
                                arrayList3.add(Integer.valueOf(iB));
                            }
                        }
                        if (arrayList2.size() > 0) {
                            com.xiaomi.onetrack.a.a.a().a(arrayList2);
                        }
                        if (arrayList3.size() > 0) {
                            com.xiaomi.onetrack.a.a.a().b(arrayList3);
                        }
                        i++;
                        if (aVarB.c) {
                            p.a(f13711a, "No more ad monitor records");
                            return;
                        }
                    }
                    p.a(f13711a, "满足条件的adMonitor记录为空，即将返回");
                    return;
                }
            }
        } catch (Throwable th) {
            p.a(f13711a, "uploadData Throwable:" + th.getMessage());
        }
    }

    private static boolean b() {
        if (q.a(f13711a)) {
            p.a(f13711a, "the device is not provisioned, stop poll!");
            return false;
        }
        if (!com.xiaomi.onetrack.g.c.a()) {
            p.a(f13711a, "network is unconnected, stop poll!");
            return false;
        }
        if (com.xiaomi.onetrack.a.a.a().e() != 0) {
            return true;
        }
        p.a(f13711a, "no data remain in db, stop poll!");
        return false;
    }
}
