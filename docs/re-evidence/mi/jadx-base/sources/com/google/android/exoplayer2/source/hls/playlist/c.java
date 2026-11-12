package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import defpackage.cpd;
import defpackage.k9c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends k9c {
    public final int d;
    public final long e;
    public final long f;
    public final boolean g;
    public final int h;
    public final long i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f8162k;
    public final long l;
    public final boolean m;
    public final boolean n;
    public final DrmInitData o;
    public final List<d> p;
    public final List<b> q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Map<Uri, C0194c> f8163r;
    public final long s;
    public final f t;

    public static final class b extends e {
        public final boolean l;
        public final boolean m;

        public b(String str, d dVar, long j, int i, long j2, DrmInitData drmInitData, String str2, String str3, long j3, long j4, boolean z, boolean z2, boolean z3) {
            super(str, dVar, j, i, j2, drmInitData, str2, str3, j3, j4, z);
            this.l = z2;
            this.m = z3;
        }

        public b b(long j, int i) {
            return new b(this.f8166a, this.f8167b, this.c, i, j, this.f, this.g, this.h, this.i, this.j, this.f8168k, this.l, this.m);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.c$c, reason: collision with other inner class name */
    public static final class C0194c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f8164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f8165b;
        public final int c;

        public C0194c(Uri uri, long j, int i) {
            this.f8164a = uri;
            this.f8165b = j;
            this.c = i;
        }
    }

    public static class e implements Comparable<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f8167b;
        public final long c;
        public final int d;
        public final long e;
        public final DrmInitData f;
        public final String g;
        public final String h;
        public final long i;
        public final long j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f8168k;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(Long l) {
            if (this.e > l.longValue()) {
                return 1;
            }
            return this.e < l.longValue() ? -1 : 0;
        }

        public e(String str, d dVar, long j, int i, long j2, DrmInitData drmInitData, String str2, String str3, long j3, long j4, boolean z) {
            this.f8166a = str;
            this.f8167b = dVar;
            this.c = j;
            this.d = i;
            this.e = j2;
            this.f = drmInitData;
            this.g = str2;
            this.h = str3;
            this.i = j3;
            this.j = j4;
            this.f8168k = z;
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f8169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f8170b;
        public final long c;
        public final long d;
        public final boolean e;

        public f(long j, boolean z, long j2, long j3, boolean z2) {
            this.f8169a = j;
            this.f8170b = z;
            this.c = j2;
            this.d = j3;
            this.e = z2;
        }
    }

    public c(int i, String str, List<String> list, long j, long j2, boolean z, int i2, long j3, int i3, long j4, long j5, boolean z2, boolean z3, boolean z4, DrmInitData drmInitData, List<d> list2, List<b> list3, f fVar, Map<Uri, C0194c> map) {
        super(str, list, z2);
        this.d = i;
        this.f = j2;
        this.g = z;
        this.h = i2;
        this.i = j3;
        this.j = i3;
        this.f8162k = j4;
        this.l = j5;
        this.m = z3;
        this.n = z4;
        this.o = drmInitData;
        this.p = ImmutableList.copyOf((Collection) list2);
        this.q = ImmutableList.copyOf((Collection) list3);
        this.f8163r = ImmutableMap.copyOf((Map) map);
        if (!list3.isEmpty()) {
            b bVar = (b) cpd.f(list3);
            this.s = bVar.e + bVar.c;
        } else if (list2.isEmpty()) {
            this.s = 0L;
        } else {
            d dVar = (d) cpd.f(list2);
            this.s = dVar.e + dVar.c;
        }
        this.e = j == -9223372036854775807L ? -9223372036854775807L : j >= 0 ? j : this.s + j;
        this.t = fVar;
    }

    @Override // defpackage.ym9
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c a(List<StreamKey> list) {
        return this;
    }

    public c c(long j, int i) {
        return new c(this.d, this.f23628a, this.f23629b, this.e, j, true, i, this.i, this.j, this.f8162k, this.l, this.c, this.m, this.n, this.o, this.p, this.q, this.t, this.f8163r);
    }

    public c d() {
        return this.m ? this : new c(this.d, this.f23628a, this.f23629b, this.e, this.f, this.g, this.h, this.i, this.j, this.f8162k, this.l, this.c, true, this.n, this.o, this.p, this.q, this.t, this.f8163r);
    }

    public long e() {
        return this.f + this.s;
    }

    public boolean f(c cVar) {
        if (cVar == null) {
            return true;
        }
        long j = this.i;
        long j2 = cVar.i;
        if (j > j2) {
            return true;
        }
        if (j < j2) {
            return false;
        }
        int size = this.p.size() - cVar.p.size();
        if (size != 0) {
            return size > 0;
        }
        int size2 = this.q.size();
        int size3 = cVar.q.size();
        if (size2 <= size3) {
            return size2 == size3 && this.m && !cVar.m;
        }
        return true;
    }

    public static final class d extends e {
        public final String l;
        public final List<b> m;

        public d(String str, long j, long j2, String str2, String str3) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j, j2, false, ImmutableList.of());
        }

        public d b(long j, int i) {
            ArrayList arrayList = new ArrayList();
            long j2 = j;
            for (int i2 = 0; i2 < this.m.size(); i2++) {
                b bVar = this.m.get(i2);
                arrayList.add(bVar.b(j2, i));
                j2 += bVar.c;
            }
            return new d(this.f8166a, this.f8167b, this.l, this.c, i, j, this.f, this.g, this.h, this.i, this.j, this.f8168k, arrayList);
        }

        public d(String str, d dVar, String str2, long j, int i, long j2, DrmInitData drmInitData, String str3, String str4, long j3, long j4, boolean z, List<b> list) {
            super(str, dVar, j, i, j2, drmInitData, str3, str4, j3, j4, z);
            this.l = str2;
            this.m = ImmutableList.copyOf((Collection) list);
        }
    }
}
