package com.amap.api.mapcore.util;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kw {

    public static class a implements ku {
        private int a;
        private int b;
        private int c;

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        @Override // com.amap.api.mapcore.util.ku
        public final long a() {
            return (((long) this.b) & 4294967295L) | ((((long) this.a) & 4294967295L) << 32);
        }

        @Override // com.amap.api.mapcore.util.ku
        public final int b() {
            return this.c;
        }
    }

    public static synchronized void a(List<ky> list) {
        a aVar;
        if (list != null) {
            if (!list.isEmpty()) {
                ArrayList arrayList = new ArrayList(list.size());
                for (ky kyVar : list) {
                    if (kyVar instanceof la) {
                        la laVar = (la) kyVar;
                        aVar = new a(laVar.j, laVar.k, laVar.c);
                    } else if (kyVar instanceof lb) {
                        lb lbVar = (lb) kyVar;
                        aVar = new a(lbVar.j, lbVar.k, lbVar.c);
                    } else if (kyVar instanceof lc) {
                        lc lcVar = (lc) kyVar;
                        aVar = new a(lcVar.j, lcVar.k, lcVar.c);
                    } else if (kyVar instanceof kz) {
                        kz kzVar = (kz) kyVar;
                        aVar = new a(kzVar.k, kzVar.l, kzVar.c);
                    }
                    arrayList.add(aVar);
                }
                kv.a().a(arrayList);
            }
        }
    }
}
