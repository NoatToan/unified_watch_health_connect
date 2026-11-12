package com.amap.api.col.p0003sl;

import androidx.media3.muxer.Mp4Utils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ne {
    public static long a(int i, int i2) {
        return (((long) i2) & Mp4Utils.UNSIGNED_INT_MAX_VALUE) | ((((long) i) & Mp4Utils.UNSIGNED_INT_MAX_VALUE) << 32);
    }

    public static void a(List<ni> list) {
        synchronized (ne.class) {
            if (list != null) {
                if (!list.isEmpty()) {
                    ArrayList arrayList = new ArrayList(list.size());
                    for (ni niVar : list) {
                        if (niVar instanceof nk) {
                            nk nkVar = (nk) niVar;
                            arrayList.add(new a(nkVar.j, nkVar.k, nkVar.f3227c));
                        } else if (niVar instanceof nl) {
                            nl nlVar = (nl) niVar;
                            arrayList.add(new a(nlVar.j, nlVar.k, nlVar.f3227c));
                        } else if (niVar instanceof nm) {
                            nm nmVar = (nm) niVar;
                            arrayList.add(new a(nmVar.j, nmVar.k, nmVar.f3227c));
                        } else if (niVar instanceof nj) {
                            nj njVar = (nj) niVar;
                            arrayList.add(new a(njVar.k, njVar.l, njVar.f3227c));
                        }
                    }
                    nd.a().a(arrayList);
                }
            }
        }
    }

    public static void b(List<np> list) {
        synchronized (ne.class) {
            if (list != null) {
                if (!list.isEmpty()) {
                    ArrayList arrayList = new ArrayList(list.size());
                    for (np npVar : list) {
                        arrayList.add(new b(npVar.f3231a, npVar.f3233c));
                    }
                    nd.a().b(arrayList);
                }
            }
        }
    }

    public static short a(long j) {
        short sA;
        synchronized (ne.class) {
            sA = nd.a().a(j);
        }
        return sA;
    }

    public static short b(long j) {
        short sB;
        synchronized (ne.class) {
            sB = nd.a().b(j);
        }
        return sB;
    }

    public static final class a implements nc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f3218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3219b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f3220c;

        a(int i, int i2, int i3) {
            this.f3218a = i;
            this.f3219b = i2;
            this.f3220c = i3;
        }

        @Override // com.amap.api.col.p0003sl.nc
        public final long a() {
            return ne.a(this.f3218a, this.f3219b);
        }

        @Override // com.amap.api.col.p0003sl.nc
        public final int b() {
            return this.f3220c;
        }
    }

    public static final class b implements nc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f3221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3222b;

        b(long j, int i) {
            this.f3221a = j;
            this.f3222b = i;
        }

        @Override // com.amap.api.col.p0003sl.nc
        public final long a() {
            return this.f3221a;
        }

        @Override // com.amap.api.col.p0003sl.nc
        public final int b() {
            return this.f3222b;
        }
    }
}
