package defpackage;

import com.amap.api.col.p0003sl.ni;
import com.amap.api.col.p0003sl.nj;
import com.amap.api.col.p0003sl.nk;
import com.amap.api.col.p0003sl.nl;
import com.amap.api.col.p0003sl.nm;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class vat {

    public static class a implements a9t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f36687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f36688b;
        public int c;

        public a(int i, int i2, int i3) {
            this.f36687a = i;
            this.f36688b = i2;
            this.c = i3;
        }

        @Override // defpackage.a9t
        public final long a() {
            return vat.a(this.f36687a, this.f36688b);
        }

        @Override // defpackage.a9t
        public final int b() {
            return this.c;
        }
    }

    public static class b implements a9t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f36689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f36690b;

        public b(long j, int i) {
            this.f36689a = j;
            this.f36690b = i;
        }

        @Override // defpackage.a9t
        public final long a() {
            return this.f36689a;
        }

        @Override // defpackage.a9t
        public final int b() {
            return this.f36690b;
        }
    }

    public static long a(int i, int i2) {
        return (((long) i2) & 4294967295L) | ((((long) i) & 4294967295L) << 32);
    }

    public static synchronized short b(long j) {
        return d9t.a().b(j);
    }

    public static synchronized void c(List<ni> list) {
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    ArrayList arrayList = new ArrayList(list.size());
                    for (ni niVar : list) {
                        if (niVar instanceof nk) {
                            nk nkVar = (nk) niVar;
                            arrayList.add(new a(nkVar.j, nkVar.f6218k, nkVar.c));
                        } else if (niVar instanceof nl) {
                            nl nlVar = (nl) niVar;
                            arrayList.add(new a(nlVar.j, nlVar.f6219k, nlVar.c));
                        } else if (niVar instanceof nm) {
                            nm nmVar = (nm) niVar;
                            arrayList.add(new a(nmVar.j, nmVar.f6220k, nmVar.c));
                        } else if (niVar instanceof nj) {
                            nj njVar = (nj) niVar;
                            arrayList.add(new a(njVar.f6217k, njVar.l, njVar.c));
                        }
                    }
                    d9t.a().d(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized short d(long j) {
        return d9t.a().g(j);
    }

    public static synchronized void e(List<cbt> list) {
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    ArrayList arrayList = new ArrayList(list.size());
                    for (cbt cbtVar : list) {
                        arrayList.add(new b(cbtVar.f5174a, cbtVar.c));
                    }
                    d9t.a().h(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
