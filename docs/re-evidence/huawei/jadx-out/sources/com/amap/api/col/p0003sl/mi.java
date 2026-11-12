package com.amap.api.col.p0003sl;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class mi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ni f3192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ni f3193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private no f3194c;
    private a d = new a();
    private final List<ni> e = new ArrayList(3);

    final a a(no noVar, boolean z, byte b2, String str, List<ni> list) {
        if (z) {
            this.d.a();
            return null;
        }
        this.d.a(b2, str, list);
        if (this.d.f3197c == null) {
            return null;
        }
        if (this.f3194c != null && !a(noVar) && a.a(this.d.d, this.f3192a) && a.a(this.d.e, this.f3193b)) {
            return null;
        }
        this.f3192a = this.d.d;
        this.f3193b = this.d.e;
        this.f3194c = noVar;
        ne.a(this.d.f);
        a(this.d);
        return this.d;
    }

    private boolean a(no noVar) {
        float f;
        if (noVar.g > 10.0f) {
            f = 2000.0f;
        } else {
            f = noVar.g > 2.0f ? 500.0f : 100.0f;
        }
        return noVar.a(this.f3194c) > ((double) f);
    }

    private void a(a aVar) {
        synchronized (this.e) {
            for (ni niVar : aVar.f) {
                if (niVar != null && niVar.h) {
                    ni niVarClone = niVar.clone();
                    niVarClone.e = SystemClock.elapsedRealtime();
                    a(niVarClone);
                }
            }
            this.d.g.clear();
            this.d.g.addAll(this.e);
        }
    }

    private void a(ni niVar) {
        if (niVar == null) {
            return;
        }
        int size = this.e.size();
        if (size == 0) {
            this.e.add(niVar);
            return;
        }
        int i = -1;
        long jMin = Long.MAX_VALUE;
        int i2 = 0;
        int i3 = -1;
        while (true) {
            if (i2 >= size) {
                i = i3;
                break;
            }
            ni niVar2 = this.e.get(i2);
            if (niVar.equals(niVar2)) {
                if (niVar.f3227c == niVar2.f3227c) {
                    break;
                }
                niVar2.e = niVar.f3227c;
                niVar2.f3227c = niVar.f3227c;
                break;
            }
            jMin = Math.min(jMin, niVar2.e);
            if (jMin == niVar2.e) {
                i3 = i2;
            }
            i2++;
        }
        if (i >= 0) {
            if (size < 3) {
                this.e.add(niVar);
            } else {
                if (niVar.e <= jMin || i >= size) {
                    return;
                }
                this.e.remove(i);
                this.e.add(niVar);
            }
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte f3195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f3196b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ni f3197c;
        public ni d;
        public ni e;
        public List<ni> f = new ArrayList();
        public List<ni> g = new ArrayList();

        public final void a() {
            this.f3195a = (byte) 0;
            this.f3196b = "";
            this.f3197c = null;
            this.d = null;
            this.e = null;
            this.f.clear();
            this.g.clear();
        }

        public final void a(byte b2, String str, List<ni> list) {
            a();
            this.f3195a = b2;
            this.f3196b = str;
            if (list != null) {
                this.f.addAll(list);
                for (ni niVar : this.f) {
                    if (!niVar.i && niVar.h) {
                        this.d = niVar;
                    } else if (niVar.i && niVar.h) {
                        this.e = niVar;
                    }
                }
            }
            ni niVar2 = this.d;
            if (niVar2 == null) {
                niVar2 = this.e;
            }
            this.f3197c = niVar2;
        }

        public static boolean a(ni niVar, ni niVar2) {
            if (niVar == null || niVar2 == null) {
                return (niVar == null) == (niVar2 == null);
            }
            if ((niVar instanceof nk) && (niVar2 instanceof nk)) {
                nk nkVar = (nk) niVar;
                nk nkVar2 = (nk) niVar2;
                return nkVar.j == nkVar2.j && nkVar.k == nkVar2.k;
            }
            if ((niVar instanceof nj) && (niVar2 instanceof nj)) {
                nj njVar = (nj) niVar;
                nj njVar2 = (nj) niVar2;
                return njVar.l == njVar2.l && njVar.k == njVar2.k && njVar.j == njVar2.j;
            }
            if ((niVar instanceof nl) && (niVar2 instanceof nl)) {
                nl nlVar = (nl) niVar;
                nl nlVar2 = (nl) niVar2;
                return nlVar.j == nlVar2.j && nlVar.k == nlVar2.k;
            }
            if ((niVar instanceof nm) && (niVar2 instanceof nm)) {
                nm nmVar = (nm) niVar;
                nm nmVar2 = (nm) niVar2;
                if (nmVar.j == nmVar2.j && nmVar.k == nmVar2.k) {
                    return true;
                }
            }
            return false;
        }

        public final String toString() {
            return "CellInfo{radio=" + ((int) this.f3195a) + ", operator='" + this.f3196b + "', mainCell=" + this.f3197c + ", mainOldInterCell=" + this.d + ", mainNewInterCell=" + this.e + ", cells=" + this.f + ", historyMainCellList=" + this.g + '}';
        }
    }
}
