package com.loc;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class bw {
    private cv a;
    private cv b;
    private db c;
    private a d = new a();
    private final List<cv> e = new ArrayList(3);

    public static class a {
        public byte a;
        public String b;
        public cv c;
        public cv d;
        public cv e;
        public List<cv> f = new ArrayList();
        public List<cv> g = new ArrayList();

        public static boolean a(cv cvVar, cv cvVar2) {
            if (cvVar == null || cvVar2 == null) {
                return (cvVar == null) == (cvVar2 == null);
            }
            if ((cvVar instanceof cx) && (cvVar2 instanceof cx)) {
                cx cxVar = (cx) cvVar;
                cx cxVar2 = (cx) cvVar2;
                return cxVar.j == cxVar2.j && cxVar.k == cxVar2.k;
            }
            if ((cvVar instanceof cw) && (cvVar2 instanceof cw)) {
                cw cwVar = (cw) cvVar;
                cw cwVar2 = (cw) cvVar2;
                return cwVar.l == cwVar2.l && cwVar.k == cwVar2.k && cwVar.j == cwVar2.j;
            }
            if ((cvVar instanceof cy) && (cvVar2 instanceof cy)) {
                cy cyVar = (cy) cvVar;
                cy cyVar2 = (cy) cvVar2;
                return cyVar.j == cyVar2.j && cyVar.k == cyVar2.k;
            }
            if ((cvVar instanceof cz) && (cvVar2 instanceof cz)) {
                cz czVar = (cz) cvVar;
                cz czVar2 = (cz) cvVar2;
                if (czVar.j == czVar2.j && czVar.k == czVar2.k) {
                    return true;
                }
            }
            return false;
        }

        public final void a() {
            this.a = (byte) 0;
            this.b = "";
            this.c = null;
            this.d = null;
            this.e = null;
            this.f.clear();
            this.g.clear();
        }

        public final String toString() {
            return "CellInfo{radio=" + ((int) this.a) + ", operator='" + this.b + "', mainCell=" + this.c + ", mainOldInterCell=" + this.d + ", mainNewInterCell=" + this.e + ", cells=" + this.f + ", historyMainCellList=" + this.g + '}';
        }
    }

    public final a a(db dbVar, boolean z, byte b, String str, List<cv> list) {
        List list2;
        if (z) {
            this.d.a();
            return null;
        }
        a aVar = this.d;
        aVar.a();
        aVar.a = b;
        aVar.b = str;
        if (list != null) {
            aVar.f.addAll(list);
            for (cv cvVar : aVar.f) {
                boolean z2 = cvVar.i;
                if (!z2 && cvVar.h) {
                    aVar.d = cvVar;
                } else if (z2 && cvVar.h) {
                    aVar.e = cvVar;
                }
            }
        }
        cv cvVar2 = aVar.d;
        if (cvVar2 == null) {
            cvVar2 = aVar.e;
        }
        aVar.c = cvVar2;
        if (this.d.c == null) {
            return null;
        }
        db dbVar2 = this.c;
        boolean z3 = true;
        if (dbVar2 != null) {
            float f = dbVar.g;
            if (!(dbVar.a(dbVar2) > ((double) (f > 10.0f ? 2000.0f : f > 2.0f ? 500.0f : 100.0f))) && a.a(this.d.d, this.a) && a.a(this.d.e, this.b)) {
                z3 = false;
            }
        }
        if (!z3) {
            return null;
        }
        a aVar2 = this.d;
        this.a = aVar2.d;
        this.b = aVar2.e;
        this.c = dbVar;
        cs.a(aVar2.f);
        a aVar3 = this.d;
        synchronized (this.e) {
            for (cv cvVar3 : aVar3.f) {
                if (cvVar3 != null && cvVar3.h) {
                    cv cvVarClone = cvVar3.clone();
                    cvVarClone.e = SystemClock.elapsedRealtime();
                    int size = this.e.size();
                    if (size == 0) {
                        list2 = this.e;
                    } else {
                        long jMin = Long.MAX_VALUE;
                        int i = -1;
                        int i2 = 0;
                        int i3 = -1;
                        while (true) {
                            if (i2 >= size) {
                                i = i3;
                                break;
                            }
                            cv cvVar4 = this.e.get(i2);
                            if (cvVarClone.equals(cvVar4)) {
                                int i4 = cvVarClone.c;
                                if (i4 == cvVar4.c) {
                                    break;
                                }
                                cvVar4.e = i4;
                                cvVar4.c = i4;
                                break;
                            }
                            jMin = Math.min(jMin, cvVar4.e);
                            if (jMin == cvVar4.e) {
                                i3 = i2;
                            }
                            i2++;
                        }
                        if (i >= 0) {
                            if (size < 3) {
                                list2 = this.e;
                            } else if (cvVarClone.e > jMin && i < size) {
                                this.e.remove(i);
                                list2 = this.e;
                            }
                        }
                    }
                    list2.add(cvVarClone);
                }
            }
            this.d.g.clear();
            this.d.g.addAll(this.e);
        }
        return this.d;
    }
}
