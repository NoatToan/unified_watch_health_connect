package com.google.android.exoplayer2.source;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import defpackage.g83;
import defpackage.nl8;
import defpackage.rk1;
import defpackage.toe;
import defpackage.wlf;
import defpackage.wlq;
import defpackage.yu5;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements wlf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.a.InterfaceC0205a f8129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray<wlf> f8130b;
    public final int[] c;
    public com.google.android.exoplayer2.upstream.h d;
    public long e;
    public long f;
    public long g;
    public float h;
    public float i;

    public e(Context context, nl8 nl8Var) {
        this(new com.google.android.exoplayer2.upstream.d(context), nl8Var);
    }

    public static SparseArray<wlf> b(com.google.android.exoplayer2.upstream.a.InterfaceC0205a interfaceC0205a, nl8 nl8Var) {
        SparseArray<wlf> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, (wlf) DashMediaSource.Factory.class.asSubclass(wlf.class).getConstructor(com.google.android.exoplayer2.upstream.a.InterfaceC0205a.class).newInstance(interfaceC0205a));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (wlf) SsMediaSource.Factory.class.asSubclass(wlf.class).getConstructor(com.google.android.exoplayer2.upstream.a.InterfaceC0205a.class).newInstance(interfaceC0205a));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (wlf) HlsMediaSource.Factory.class.asSubclass(wlf.class).getConstructor(com.google.android.exoplayer2.upstream.a.InterfaceC0205a.class).newInstance(interfaceC0205a));
        } catch (Exception unused3) {
        }
        try {
            sparseArray.put(3, (wlf) RtspMediaSource.Factory.class.asSubclass(wlf.class).getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Exception unused4) {
        }
        sparseArray.put(4, new p.b(interfaceC0205a, nl8Var));
        return sparseArray;
    }

    public static k c(com.google.android.exoplayer2.m mVar, k kVar) {
        com.google.android.exoplayer2.m.d dVar = mVar.e;
        long j = dVar.f7956a;
        if (j == 0 && dVar.f7957b == Long.MIN_VALUE && !dVar.d) {
            return kVar;
        }
        long jC = g83.c(j);
        long jC2 = g83.c(mVar.e.f7957b);
        com.google.android.exoplayer2.m.d dVar2 = mVar.e;
        return new ClippingMediaSource(kVar, jC, jC2, !dVar2.e, dVar2.c, dVar2.d);
    }

    @Override // defpackage.wlf
    public k a(com.google.android.exoplayer2.m mVar) {
        rk1.e(mVar.f7949b);
        com.google.android.exoplayer2.m.g gVar = mVar.f7949b;
        int iL0 = wlq.l0(gVar.f7962a, gVar.f7963b);
        wlf wlfVar = this.f8130b.get(iL0);
        StringBuilder sb = new StringBuilder(68);
        sb.append("No suitable media source factory found for content type: ");
        sb.append(iL0);
        rk1.f(wlfVar, sb.toString());
        com.google.android.exoplayer2.m.f fVar = mVar.c;
        if ((fVar.f7960a == -9223372036854775807L && this.e != -9223372036854775807L) || ((fVar.d == -3.4028235E38f && this.h != -3.4028235E38f) || ((fVar.e == -3.4028235E38f && this.i != -3.4028235E38f) || ((fVar.f7961b == -9223372036854775807L && this.f != -9223372036854775807L) || (fVar.c == -9223372036854775807L && this.g != -9223372036854775807L))))) {
            com.google.android.exoplayer2.m.c cVarA = mVar.a();
            long j = mVar.c.f7960a;
            if (j == -9223372036854775807L) {
                j = this.e;
            }
            com.google.android.exoplayer2.m.c cVarG = cVarA.g(j);
            float f = mVar.c.d;
            if (f == -3.4028235E38f) {
                f = this.h;
            }
            com.google.android.exoplayer2.m.c cVarF = cVarG.f(f);
            float f2 = mVar.c.e;
            if (f2 == -3.4028235E38f) {
                f2 = this.i;
            }
            com.google.android.exoplayer2.m.c cVarD = cVarF.d(f2);
            long j2 = mVar.c.f7961b;
            if (j2 == -9223372036854775807L) {
                j2 = this.f;
            }
            com.google.android.exoplayer2.m.c cVarE = cVarD.e(j2);
            long j3 = mVar.c.c;
            if (j3 == -9223372036854775807L) {
                j3 = this.g;
            }
            mVar = cVarE.c(j3).a();
        }
        k kVarA = wlfVar.a(mVar);
        List<com.google.android.exoplayer2.m.h> list = ((com.google.android.exoplayer2.m.g) wlq.j(mVar.f7949b)).g;
        if (!list.isEmpty()) {
            k[] kVarArr = new k[list.size() + 1];
            int i = 0;
            kVarArr[0] = kVarA;
            v.b bVarC = new v.b(this.f8129a).c(this.d);
            while (i < list.size()) {
                int i2 = i + 1;
                kVarArr[i2] = bVarC.b(list.get(i), -9223372036854775807L);
                i = i2;
            }
            kVarA = new MergingMediaSource(kVarArr);
        }
        return d(mVar, c(mVar, kVarA));
    }

    public final k d(com.google.android.exoplayer2.m mVar, k kVar) {
        rk1.e(mVar.f7949b);
        if (mVar.f7949b.d == null) {
            return kVar;
        }
        toe.h("DefaultMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
        return kVar;
    }

    public e(com.google.android.exoplayer2.upstream.a.InterfaceC0205a interfaceC0205a) {
        this(interfaceC0205a, new yu5());
    }

    public e(com.google.android.exoplayer2.upstream.a.InterfaceC0205a interfaceC0205a, nl8 nl8Var) {
        this.f8129a = interfaceC0205a;
        SparseArray<wlf> sparseArrayB = b(interfaceC0205a, nl8Var);
        this.f8130b = sparseArrayB;
        this.c = new int[sparseArrayB.size()];
        for (int i = 0; i < this.f8130b.size(); i++) {
            this.c[i] = this.f8130b.keyAt(i);
        }
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = -9223372036854775807L;
        this.h = -3.4028235E38f;
        this.i = -3.4028235E38f;
    }
}
