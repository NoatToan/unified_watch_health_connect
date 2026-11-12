package com.amap.api.mapcore.util;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class lf {
    private HashMap<String, lg> a = new HashMap<>();
    private long b = 0;

    public final long a(lg lgVar) {
        if (lgVar == null) {
            return 0L;
        }
        HashMap<String, lg> map = this.a;
        String strA = lgVar.a();
        lg lgVar2 = map.get(strA);
        if (lgVar2 == null) {
            lgVar.n = ki.b();
            map.put(strA, lgVar);
            return 0L;
        }
        if (lgVar2.k != lgVar.k) {
            lgVar.n = ki.b();
            map.put(strA, lgVar);
            return 0L;
        }
        lgVar.n = lgVar2.n;
        map.put(strA, lgVar);
        return (ki.b() - lgVar2.n) / 1000;
    }

    public final void a() {
        this.a.clear();
        this.b = 0L;
    }

    public final void a(ArrayList<? extends lg> arrayList) {
        if (arrayList != null) {
            long jB = ki.b();
            long j = this.b;
            if (j <= 0 || jB - j >= 60000) {
                HashMap<String, lg> map = this.a;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    lg lgVar = arrayList.get(i);
                    lg lgVar2 = map.get(lgVar.a());
                    if (lgVar2 != null) {
                        if (lgVar2.k == lgVar.k) {
                            lgVar.n = lgVar2.n;
                        } else {
                            lgVar.n = jB;
                        }
                    }
                }
                map.clear();
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    lg lgVar3 = arrayList.get(i2);
                    map.put(lgVar3.a(), lgVar3);
                }
                this.b = jB;
            }
        }
    }
}
