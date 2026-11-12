package androidx.media3.exoplayer.source;

import androidx.media3.common.d0;
import com.google.android.exoplayer2.C;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.MultimapBuilder;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class MergingMediaSource extends androidx.media3.exoplayer.source.c<Integer> {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final androidx.media3.common.t f9381w;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f9382k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f9383l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j[] f9384m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f9385n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d0[] f9386o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList<j> f9387p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sa.d f9388q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final HashMap f9389r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ListMultimap f9390s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f9391t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long[][] f9392u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public IllegalMergeException f9393v;

    public static final class IllegalMergeException extends IOException {
        public static final int REASON_PERIOD_COUNT_MISMATCH = 0;
        public final int reason;

        public IllegalMergeException(int i14) {
            this.reason = i14;
        }
    }

    public static final class b extends sa.h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long[] f9394c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long[] f9395d;

        public b(d0 d0Var, Map<Object, Long> map) {
            super(d0Var);
            int iO = d0Var.o();
            this.f9395d = new long[d0Var.o()];
            d0.c cVar = new d0.c();
            for (int i14 = 0; i14 < iO; i14++) {
                this.f9395d[i14] = d0Var.m(i14, cVar, 0L).f8208m;
            }
            int iH = d0Var.h();
            this.f9394c = new long[iH];
            d0.b bVar = new d0.b();
            for (int i15 = 0; i15 < iH; i15++) {
                d0Var.f(i15, bVar, true);
                Long l14 = map.get(bVar.f8188b);
                l14.getClass();
                long jLongValue = l14.longValue();
                long[] jArr = this.f9394c;
                jLongValue = jLongValue == Long.MIN_VALUE ? bVar.f8190d : jLongValue;
                jArr[i15] = jLongValue;
                long j8 = bVar.f8190d;
                if (j8 != C.TIME_UNSET) {
                    long[] jArr2 = this.f9395d;
                    int i16 = bVar.f8189c;
                    jArr2[i16] = jArr2[i16] - (j8 - jLongValue);
                }
            }
        }

        @Override // sa.h, androidx.media3.common.d0
        public final d0.b f(int i14, d0.b bVar, boolean z14) {
            super.f(i14, bVar, z14);
            bVar.f8190d = this.f9394c[i14];
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        @Override // sa.h, androidx.media3.common.d0
        public final d0.c m(int i14, d0.c cVar, long j8) {
            long jMin;
            super.m(i14, cVar, j8);
            long j14 = this.f9395d[i14];
            cVar.f8208m = j14;
            if (j14 != C.TIME_UNSET) {
                long j15 = cVar.f8207l;
                if (j15 == C.TIME_UNSET) {
                    jMin = cVar.f8207l;
                } else {
                    jMin = Math.min(j15, j14);
                }
            } else {
                jMin = cVar.f8207l;
            }
            cVar.f8207l = jMin;
            return cVar;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j.b f9396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i f9397b;

        private c(j.b bVar, i iVar) {
            this.f9396a = bVar;
            this.f9397b = iVar;
        }
    }

    static {
        androidx.media3.common.t.c cVar = new androidx.media3.common.t.c();
        cVar.f8446a = "MergingMediaSource";
        f9381w = cVar.a();
    }

    public MergingMediaSource(boolean z14, boolean z15, sa.d dVar, j... jVarArr) {
        this.f9382k = z14;
        this.f9383l = z15;
        this.f9384m = jVarArr;
        this.f9388q = dVar;
        this.f9387p = new ArrayList<>(Arrays.asList(jVarArr));
        this.f9391t = -1;
        this.f9385n = new ArrayList(jVarArr.length);
        for (int i14 = 0; i14 < jVarArr.length; i14++) {
            this.f9385n.add(new ArrayList());
        }
        this.f9386o = new d0[jVarArr.length];
        this.f9392u = new long[0][];
        this.f9389r = new HashMap();
        this.f9390s = MultimapBuilder.hashKeys().arrayListValues().build();
    }

    @Override // androidx.media3.exoplayer.source.j
    public final i c(j.b bVar, xa.b bVar2, long j8) {
        j[] jVarArr = this.f9384m;
        int length = jVarArr.length;
        i[] iVarArr = new i[length];
        d0[] d0VarArr = this.f9386o;
        d0 d0Var = d0VarArr[0];
        Object obj = bVar.f9519a;
        int iB = d0Var.b(obj);
        for (int i14 = 0; i14 < length; i14++) {
            j.b bVarA = bVar.a(d0VarArr[i14].l(iB));
            iVarArr[i14] = jVarArr[i14].c(bVarA, bVar2, j8 - this.f9392u[iB][i14]);
            ((List) this.f9385n.get(i14)).add(new c(bVarA, iVarArr[i14]));
        }
        m mVar = new m(this.f9388q, this.f9392u[iB], iVarArr);
        if (!this.f9383l) {
            return mVar;
        }
        Long l14 = (Long) this.f9389r.get(obj);
        l14.getClass();
        androidx.media3.exoplayer.source.b bVar3 = new androidx.media3.exoplayer.source.b(mVar, true, 0L, l14.longValue());
        this.f9390s.put(obj, bVar3);
        return bVar3;
    }

    @Override // androidx.media3.exoplayer.source.j
    public final androidx.media3.common.t getMediaItem() {
        j[] jVarArr = this.f9384m;
        return jVarArr.length > 0 ? jVarArr[0].getMediaItem() : f9381w;
    }

    @Override // androidx.media3.exoplayer.source.j
    public final void h(i iVar) {
        if (this.f9383l) {
            androidx.media3.exoplayer.source.b bVar = (androidx.media3.exoplayer.source.b) iVar;
            ListMultimap listMultimap = this.f9390s;
            Iterator it = listMultimap.entries().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((androidx.media3.exoplayer.source.b) entry.getValue()).equals(bVar)) {
                    listMultimap.remove(entry.getKey(), entry.getValue());
                    break;
                }
            }
            iVar = bVar.f9425a;
        }
        m mVar = (m) iVar;
        int i14 = 0;
        while (true) {
            j[] jVarArr = this.f9384m;
            if (i14 >= jVarArr.length) {
                return;
            }
            List list = (List) this.f9385n.get(i14);
            for (int i15 = 0; i15 < list.size(); i15++) {
                if (((c) list.get(i15)).f9397b.equals(iVar)) {
                    list.remove(i15);
                    break;
                }
            }
            j jVar = jVarArr[i14];
            i iVar2 = mVar.f9530a[i14];
            if (iVar2 instanceof w) {
                iVar2 = ((w) iVar2).f9686a;
            }
            jVar.h(iVar2);
            i14++;
        }
    }

    @Override // androidx.media3.exoplayer.source.j
    public final void k(androidx.media3.common.t tVar) {
        this.f9384m[0].k(tVar);
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.j
    public final void maybeThrowSourceInfoRefreshError() throws IllegalMergeException {
        IllegalMergeException illegalMergeException = this.f9393v;
        if (illegalMergeException != null) {
            throw illegalMergeException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.a
    public final void p(ha.n nVar) {
        super.p(nVar);
        int i14 = 0;
        while (true) {
            j[] jVarArr = this.f9384m;
            if (i14 >= jVarArr.length) {
                return;
            }
            w(Integer.valueOf(i14), jVarArr[i14]);
            i14++;
        }
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.a
    public final void r() {
        super.r();
        Arrays.fill(this.f9386o, (Object) null);
        this.f9391t = -1;
        this.f9393v = null;
        ArrayList<j> arrayList = this.f9387p;
        arrayList.clear();
        Collections.addAll(arrayList, this.f9384m);
    }

    @Override // androidx.media3.exoplayer.source.c
    public final j.b s(Integer num, j.b bVar) {
        int iIntValue = num.intValue();
        ArrayList arrayList = this.f9385n;
        List list = (List) arrayList.get(iIntValue);
        for (int i14 = 0; i14 < list.size(); i14++) {
            if (((c) list.get(i14)).f9396a.equals(bVar)) {
                return ((c) ((List) arrayList.get(0)).get(i14)).f9396a;
            }
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.source.c
    public final void v(Object obj, androidx.media3.exoplayer.source.a aVar, d0 d0Var) {
        HashMap map;
        Integer num = (Integer) obj;
        if (this.f9393v != null) {
            return;
        }
        if (this.f9391t == -1) {
            this.f9391t = d0Var.h();
        } else if (d0Var.h() != this.f9391t) {
            this.f9393v = new IllegalMergeException(0);
            return;
        }
        int length = this.f9392u.length;
        d0[] d0VarArr = this.f9386o;
        if (length == 0) {
            this.f9392u = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f9391t, d0VarArr.length);
        }
        ArrayList<j> arrayList = this.f9387p;
        arrayList.remove(aVar);
        d0VarArr[num.intValue()] = d0Var;
        if (arrayList.isEmpty()) {
            if (this.f9382k) {
                d0.b bVar = new d0.b();
                for (int i14 = 0; i14 < this.f9391t; i14++) {
                    long j8 = -d0VarArr[0].f(i14, bVar, false).f8191e;
                    for (int i15 = 1; i15 < d0VarArr.length; i15++) {
                        this.f9392u[i14][i15] = j8 - (-d0VarArr[i15].f(i14, bVar, false).f8191e);
                    }
                }
            }
            d0 bVar2 = d0VarArr[0];
            if (this.f9383l) {
                d0.b bVar3 = new d0.b();
                int i16 = 0;
                while (true) {
                    int i17 = this.f9391t;
                    map = this.f9389r;
                    if (i16 >= i17) {
                        break;
                    }
                    long j14 = Long.MIN_VALUE;
                    for (int i18 = 0; i18 < d0VarArr.length; i18++) {
                        long j15 = d0VarArr[i18].f(i16, bVar3, false).f8190d;
                        if (j15 != C.TIME_UNSET) {
                            long j16 = j15 + this.f9392u[i16][i18];
                            if (j14 == Long.MIN_VALUE || j16 < j14) {
                                j14 = j16;
                            }
                        }
                    }
                    Object objL = d0VarArr[0].l(i16);
                    map.put(objL, Long.valueOf(j14));
                    for (V v14 : this.f9390s.get(objL)) {
                        v14.f9429e = 0L;
                        v14.f9430f = j14;
                    }
                    i16++;
                }
                bVar2 = new b(bVar2, map);
            }
            q(bVar2);
        }
    }

    public MergingMediaSource(boolean z14, j... jVarArr) {
        this(z14, false, jVarArr);
    }

    public MergingMediaSource(boolean z14, boolean z15, j... jVarArr) {
        this(z14, z15, new sa.e(), jVarArr);
    }

    public MergingMediaSource(j... jVarArr) {
        this(false, jVarArr);
    }
}
