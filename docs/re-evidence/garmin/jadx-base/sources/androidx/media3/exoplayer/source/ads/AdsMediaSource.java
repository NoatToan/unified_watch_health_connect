package androidx.media3.exoplayer.source.ads;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.d0;
import androidx.media3.common.t;
import androidx.media3.exoplayer.source.h;
import androidx.media3.exoplayer.source.i;
import androidx.media3.exoplayer.source.j;
import com.google.android.exoplayer2.C;
import fa.z;
import ha.g;
import ha.n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class AdsMediaSource extends androidx.media3.exoplayer.source.c<j.b> {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final j.b f9405u = new j.b(new Object());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final h f9406k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t.f f9407l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j.a f9408m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f9409n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Handler f9410o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d0.b f9411p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public c f9412q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public d0 f9413r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public androidx.media3.common.b f9414s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a[][] f9415t;

    public static final class AdLoadException extends IOException {
        public static final int TYPE_AD = 0;
        public static final int TYPE_AD_GROUP = 1;
        public static final int TYPE_ALL_ADS = 2;
        public static final int TYPE_UNEXPECTED = 3;
        public final int type;

        private AdLoadException(int i14, Exception exc) {
            super(exc);
            this.type = i14;
        }

        public static AdLoadException createForAd(Exception exc) {
            return new AdLoadException(0, exc);
        }

        public static AdLoadException createForAdGroup(Exception exc, int i14) {
            return new AdLoadException(1, new IOException(am.j.h(i14, "Failed to load ad group "), exc));
        }

        public static AdLoadException createForAllAds(Exception exc) {
            return new AdLoadException(2, exc);
        }

        public static AdLoadException createForUnexpected(RuntimeException runtimeException) {
            return new AdLoadException(3, runtimeException);
        }

        public RuntimeException getRuntimeExceptionForUnexpected() {
            fa.a.d(this.type == 3);
            Throwable cause = getCause();
            cause.getClass();
            return (RuntimeException) cause;
        }
    }

    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j.b f9416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f9417b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public t f9418c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public j f9419d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public d0 f9420e;

        public a(j.b bVar) {
            this.f9416a = bVar;
        }
    }

    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t f9422a;

        public b(t tVar) {
            this.f9422a = tVar;
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f9424a = z.m(null);

        public c(AdsMediaSource adsMediaSource) {
        }
    }

    public AdsMediaSource(j jVar, g gVar, Object obj, j.a aVar, ta.a aVar2, androidx.media3.common.c cVar) {
        this.f9406k = new h(jVar, true);
        t.h hVar = jVar.getMediaItem().f8439b;
        hVar.getClass();
        this.f9407l = hVar.f8484c;
        this.f9408m = aVar;
        this.f9409n = obj;
        this.f9410o = new Handler(Looper.getMainLooper());
        this.f9411p = new d0.b();
        this.f9415t = new a[0][];
        aVar.getSupportedTypes();
        aVar2.a();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    @Override // androidx.media3.exoplayer.source.j
    public final i c(j.b bVar, xa.b bVar2, long j8) {
        androidx.media3.common.b bVar3;
        t tVarA;
        androidx.media3.common.b bVar4 = this.f9414s;
        bVar4.getClass();
        if (bVar4.f8156b <= 0 || !bVar.b()) {
            androidx.media3.exoplayer.source.g gVar = new androidx.media3.exoplayer.source.g(bVar, bVar2, j8);
            gVar.i(this.f9406k);
            gVar.g(bVar);
            return gVar;
        }
        int i14 = bVar.f9520b;
        int i15 = bVar.f9521c;
        a[][] aVarArr = this.f9415t;
        a[] aVarArr2 = aVarArr[i14];
        if (aVarArr2.length <= i15) {
            aVarArr[i14] = (a[]) Arrays.copyOf(aVarArr2, i15 + 1);
        }
        a aVar = this.f9415t[i14][i15];
        if (aVar == null) {
            aVar = new a(bVar);
            this.f9415t[i14][i15] = aVar;
            androidx.media3.common.b bVar5 = this.f9414s;
            if (bVar5 != null) {
                for (int i16 = 0; i16 < this.f9415t.length; i16++) {
                    int i17 = 0;
                    while (true) {
                        a[] aVarArr3 = this.f9415t[i16];
                        if (i17 < aVarArr3.length) {
                            a aVar2 = aVarArr3[i17];
                            androidx.media3.common.b.C0118b c0118bA = bVar5.a(i16);
                            if (aVar2 == null || aVar2.f9419d != null) {
                                bVar3 = bVar5;
                            } else {
                                t[] tVarArr = c0118bA.f8165e;
                                if (i17 >= tVarArr.length || (tVarA = tVarArr[i17]) == null) {
                                    bVar3 = bVar5;
                                } else {
                                    t.f fVar = this.f9407l;
                                    if (fVar != null) {
                                        t.c cVar = new t.c();
                                        cVar.f8450e = new t.f.a();
                                        tVarA = cVar.a();
                                    }
                                    j jVarB = this.f9408m.b(tVarA);
                                    AdsMediaSource adsMediaSource = AdsMediaSource.this;
                                    ArrayList arrayList = aVar2.f9417b;
                                    aVar2.f9419d = jVarB;
                                    aVar2.f9418c = tVarA;
                                    int i18 = 0;
                                    while (i18 < arrayList.size()) {
                                        androidx.media3.exoplayer.source.g gVar2 = (androidx.media3.exoplayer.source.g) arrayList.get(i18);
                                        gVar2.i(jVarB);
                                        gVar2.f9504g = adsMediaSource.new b(tVarA);
                                        i18++;
                                        bVar5 = bVar5;
                                    }
                                    bVar3 = bVar5;
                                    adsMediaSource.w(aVar2.f9416a, jVarB);
                                }
                            }
                            i17++;
                            bVar5 = bVar3;
                        }
                    }
                }
            }
        }
        androidx.media3.exoplayer.source.g gVar3 = new androidx.media3.exoplayer.source.g(bVar, bVar2, j8);
        aVar.f9417b.add(gVar3);
        j jVar = aVar.f9419d;
        if (jVar != null) {
            gVar3.i(jVar);
            AdsMediaSource adsMediaSource2 = AdsMediaSource.this;
            t tVar = aVar.f9418c;
            tVar.getClass();
            gVar3.f9504g = adsMediaSource2.new b(tVar);
        }
        d0 d0Var = aVar.f9420e;
        if (d0Var != null) {
            gVar3.g(new j.b(d0Var.l(0), bVar.f9522d));
        }
        return gVar3;
    }

    @Override // androidx.media3.exoplayer.source.j
    public final t getMediaItem() {
        return this.f9406k.getMediaItem();
    }

    @Override // androidx.media3.exoplayer.source.j
    public final void h(i iVar) {
        androidx.media3.exoplayer.source.g gVar = (androidx.media3.exoplayer.source.g) iVar;
        j.b bVar = gVar.f9498a;
        boolean zB = bVar.b();
        int i14 = bVar.f9521c;
        int i15 = bVar.f9520b;
        if (!zB) {
            gVar.h();
            return;
        }
        a aVar = this.f9415t[i15][i14];
        aVar.getClass();
        ArrayList arrayList = aVar.f9417b;
        arrayList.remove(gVar);
        gVar.h();
        if (arrayList.isEmpty()) {
            if (aVar.f9419d != null) {
                AdsMediaSource adsMediaSource = AdsMediaSource.this;
                androidx.media3.exoplayer.source.c.b bVar2 = (androidx.media3.exoplayer.source.c.b) adsMediaSource.f9435h.remove(aVar.f9416a);
                bVar2.getClass();
                j jVar = bVar2.f9442a;
                jVar.b(bVar2.f9443b);
                androidx.media3.exoplayer.source.c<T>.a aVar2 = bVar2.f9444c;
                jVar.i(aVar2);
                jVar.j(aVar2);
            }
            this.f9415t[i15][i14] = null;
        }
    }

    @Override // androidx.media3.exoplayer.source.j
    public final void k(t tVar) {
        this.f9406k.k(tVar);
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.a
    public final void p(n nVar) {
        super.p(nVar);
        c cVar = new c(this);
        this.f9412q = cVar;
        h hVar = this.f9406k;
        this.f9413r = hVar.f9510o;
        w(f9405u, hVar);
        this.f9410o.post(new ab2.a(this, cVar, 6));
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.a
    public final void r() {
        super.r();
        c cVar = this.f9412q;
        cVar.getClass();
        this.f9412q = null;
        cVar.f9424a.removeCallbacksAndMessages(null);
        this.f9413r = null;
        this.f9414s = null;
        this.f9415t = new a[0][];
        this.f9410o.post(new ab2.a(this, cVar, 7));
    }

    @Override // androidx.media3.exoplayer.source.c
    public final j.b s(j.b bVar, j.b bVar2) {
        j.b bVar3 = bVar;
        return bVar3.b() ? bVar3 : bVar2;
    }

    @Override // androidx.media3.exoplayer.source.c
    public final void v(Object obj, androidx.media3.exoplayer.source.a aVar, d0 d0Var) {
        d0 d0Var2;
        j.b bVar = (j.b) obj;
        if (bVar.b()) {
            a aVar2 = this.f9415t[bVar.f9520b][bVar.f9521c];
            aVar2.getClass();
            ArrayList arrayList = aVar2.f9417b;
            fa.a.a(d0Var.h() == 1);
            if (aVar2.f9420e == null) {
                Object objL = d0Var.l(0);
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    androidx.media3.exoplayer.source.g gVar = (androidx.media3.exoplayer.source.g) arrayList.get(i14);
                    gVar.g(new j.b(objL, gVar.f9498a.f9522d));
                }
            }
            aVar2.f9420e = d0Var;
        } else {
            fa.a.a(d0Var.h() == 1);
            this.f9413r = d0Var;
        }
        d0 d0Var3 = this.f9413r;
        androidx.media3.common.b bVar2 = this.f9414s;
        if (bVar2 == null || d0Var3 == null) {
            return;
        }
        if (bVar2.f8156b == 0) {
            q(d0Var3);
            return;
        }
        long[][] jArr = new long[this.f9415t.length][];
        int i15 = 0;
        while (true) {
            a[][] aVarArr = this.f9415t;
            if (i15 >= aVarArr.length) {
                this.f9414s = bVar2.c(jArr);
                q(new ta.c(d0Var3, this.f9414s));
                return;
            }
            jArr[i15] = new long[aVarArr[i15].length];
            int i16 = 0;
            while (true) {
                a[] aVarArr2 = this.f9415t[i15];
                if (i16 < aVarArr2.length) {
                    a aVar3 = aVarArr2[i16];
                    long[] jArr2 = jArr[i15];
                    long j8 = C.TIME_UNSET;
                    if (aVar3 != null && (d0Var2 = aVar3.f9420e) != null) {
                        j8 = d0Var2.f(0, AdsMediaSource.this.f9411p, false).f8190d;
                    }
                    jArr2[i16] = j8;
                    i16++;
                }
            }
            i15++;
        }
    }
}
