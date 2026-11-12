package com.loc;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class cs {

    public static class a implements cq {
        private int a;
        private int b;
        private int c;

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        @Override // com.loc.cq
        public final long a() {
            return cs.a(this.a, this.b);
        }

        @Override // com.loc.cq
        public final int b() {
            return this.c;
        }
    }

    public static class b implements cq {
        private long a;
        private int b;

        public b(long j, int i) {
            this.a = j;
            this.b = i;
        }

        @Override // com.loc.cq
        public final long a() {
            return this.a;
        }

        @Override // com.loc.cq
        public final int b() {
            return this.b;
        }
    }

    public static long a(int i, int i2) {
        return (((long) i2) & 4294967295L) | ((((long) i) & 4294967295L) << 32);
    }

    public static synchronized short a(long j) {
        return cr.a().a(j);
    }

    public static synchronized void a(List<cv> list) {
        a aVar;
        if (list != null) {
            if (!list.isEmpty()) {
                ArrayList arrayList = new ArrayList(list.size());
                for (cv cvVar : list) {
                    if (cvVar instanceof cx) {
                        cx cxVar = (cx) cvVar;
                        aVar = new a(cxVar.j, cxVar.k, cxVar.c);
                    } else if (cvVar instanceof cy) {
                        cy cyVar = (cy) cvVar;
                        aVar = new a(cyVar.j, cyVar.k, cyVar.c);
                    } else if (cvVar instanceof cz) {
                        cz czVar = (cz) cvVar;
                        aVar = new a(czVar.j, czVar.k, czVar.c);
                    } else if (cvVar instanceof cw) {
                        cw cwVar = (cw) cvVar;
                        aVar = new a(cwVar.k, cwVar.l, cwVar.c);
                    }
                    arrayList.add(aVar);
                }
                cr.a().a(arrayList);
            }
        }
    }

    public static synchronized short b(long j) {
        return cr.a().b(j);
    }

    public static synchronized void b(List<dc> list) {
        if (list != null) {
            if (!list.isEmpty()) {
                ArrayList arrayList = new ArrayList(list.size());
                for (dc dcVar : list) {
                    arrayList.add(new b(dcVar.a, dcVar.c));
                }
                cr.a().b(arrayList);
            }
        }
    }
}
