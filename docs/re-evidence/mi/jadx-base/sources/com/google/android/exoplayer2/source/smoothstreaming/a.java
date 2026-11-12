package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import defpackage.brl;
import defpackage.cw3;
import defpackage.dh4;
import defpackage.dw3;
import defpackage.ew3;
import defpackage.fxp;
import defpackage.g92;
import defpackage.l63;
import defpackage.rk1;
import defpackage.rkp;
import defpackage.sie;
import defpackage.smp;
import defpackage.tif;
import defpackage.uif;
import defpackage.zna;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class a implements com.google.android.exoplayer2.source.smoothstreaming.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sie f8255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8256b;
    public final dw3[] c;
    public final com.google.android.exoplayer2.upstream.a d;
    public com.google.android.exoplayer2.trackselection.b e;
    public com.google.android.exoplayer2.source.smoothstreaming.manifest.a f;
    public int g;
    public IOException h;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.smoothstreaming.a$a, reason: collision with other inner class name */
    public static final class C0200a implements com.google.android.exoplayer2.source.smoothstreaming.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.upstream.a.InterfaceC0205a f8257a;

        public C0200a(com.google.android.exoplayer2.upstream.a.InterfaceC0205a interfaceC0205a) {
            this.f8257a = interfaceC0205a;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.b.a
        public com.google.android.exoplayer2.source.smoothstreaming.b a(sie sieVar, com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar, int i, com.google.android.exoplayer2.trackselection.b bVar, fxp fxpVar) {
            com.google.android.exoplayer2.upstream.a aVarA = this.f8257a.a();
            if (fxpVar != null) {
                aVarA.f(fxpVar);
            }
            return new a(sieVar, aVar, i, bVar, aVarA);
        }
    }

    public static final class b extends g92 {
        public final com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b e;
        public final int f;

        public b(com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b bVar, int i, int i2) {
            super(i2, bVar.f8273k - 1);
            this.e = bVar;
            this.f = i;
        }

        @Override // defpackage.uif
        public long a() {
            return b() + this.e.c((int) d());
        }

        @Override // defpackage.uif
        public long b() {
            c();
            return this.e.e((int) d());
        }
    }

    public a(sie sieVar, com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar, int i, com.google.android.exoplayer2.trackselection.b bVar, com.google.android.exoplayer2.upstream.a aVar2) {
        this.f8255a = sieVar;
        this.f = aVar;
        this.f8256b = i;
        this.e = bVar;
        this.d = aVar2;
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b bVar2 = aVar.f[i];
        this.c = new dw3[bVar.length()];
        for (int i2 = 0; i2 < this.c.length; i2++) {
            int iC = bVar.c(i2);
            Format format = bVar2.j[iC];
            smp[] smpVarArr = format.o != null ? ((com.google.android.exoplayer2.source.smoothstreaming.manifest.a.C0201a) rk1.e(aVar.e)).c : null;
            int i3 = bVar2.f8271a;
            this.c[i2] = new l63(new zna(3, null, new rkp(iC, i3, bVar2.c, -9223372036854775807L, aVar.g, format, 0, smpVarArr, i3 == 2 ? 4 : 0, null, null)), bVar2.f8271a, format);
        }
    }

    public static tif k(Format format, com.google.android.exoplayer2.upstream.a aVar, Uri uri, int i, long j, long j2, long j3, int i2, Object obj, dw3 dw3Var) {
        return new dh4(aVar, new com.google.android.exoplayer2.upstream.b(uri), format, i2, obj, j, j2, j3, -9223372036854775807L, i, 1, j, dw3Var);
    }

    @Override // defpackage.hw3
    public void a() throws IOException {
        IOException iOException = this.h;
        if (iOException != null) {
            throw iOException;
        }
        this.f8255a.a();
    }

    @Override // defpackage.hw3
    public long b(long j, brl brlVar) {
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b bVar = this.f.f[this.f8256b];
        int iD = bVar.d(j);
        long jE = bVar.e(iD);
        return brlVar.a(j, jE, (jE >= j || iD >= bVar.f8273k + (-1)) ? jE : bVar.e(iD + 1));
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.b
    public void c(com.google.android.exoplayer2.trackselection.b bVar) {
        this.e = bVar;
    }

    @Override // defpackage.hw3
    public boolean d(long j, cw3 cw3Var, List<? extends tif> list) {
        if (this.h != null) {
            return false;
        }
        return this.e.b(j, cw3Var, list);
    }

    @Override // defpackage.hw3
    public final void f(long j, long j2, List<? extends tif> list, ew3 ew3Var) {
        int iF;
        long j3 = j2;
        if (this.h != null) {
            return;
        }
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar = this.f;
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b bVar = aVar.f[this.f8256b];
        if (bVar.f8273k == 0) {
            ew3Var.f17125b = !aVar.d;
            return;
        }
        if (list.isEmpty()) {
            iF = bVar.d(j3);
        } else {
            iF = (int) (list.get(list.size() - 1).f() - ((long) this.g));
            if (iF < 0) {
                this.h = new BehindLiveWindowException();
                return;
            }
        }
        if (iF >= bVar.f8273k) {
            ew3Var.f17125b = !this.f.d;
            return;
        }
        long j4 = j3 - j;
        long jL = l(j);
        int length = this.e.length();
        uif[] uifVarArr = new uif[length];
        for (int i = 0; i < length; i++) {
            uifVarArr[i] = new b(bVar, this.e.c(i), iF);
        }
        this.e.o(j, j4, jL, list, uifVarArr);
        long jE = bVar.e(iF);
        long jC = jE + bVar.c(iF);
        if (!list.isEmpty()) {
            j3 = -9223372036854775807L;
        }
        long j5 = j3;
        int i2 = iF + this.g;
        int iA = this.e.a();
        ew3Var.f17124a = k(this.e.i(), this.d, bVar.a(this.e.c(iA), iF), i2, jE, jC, j5, this.e.r(), this.e.n(), this.c[iA]);
    }

    @Override // defpackage.hw3
    public int g(long j, List<? extends tif> list) {
        return (this.h != null || this.e.length() < 2) ? list.size() : this.e.g(j, list);
    }

    @Override // defpackage.hw3
    public void h(cw3 cw3Var) {
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.b
    public void i(com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar) {
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b[] bVarArr = this.f.f;
        int i = this.f8256b;
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b bVar = bVarArr[i];
        int i2 = bVar.f8273k;
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b bVar2 = aVar.f[i];
        if (i2 == 0 || bVar2.f8273k == 0) {
            this.g += i2;
        } else {
            int i3 = i2 - 1;
            long jE = bVar.e(i3) + bVar.c(i3);
            long jE2 = bVar2.e(0);
            if (jE <= jE2) {
                this.g += i2;
            } else {
                this.g += bVar.d(jE2);
            }
        }
        this.f = aVar;
    }

    @Override // defpackage.hw3
    public boolean j(cw3 cw3Var, boolean z, Exception exc, long j) {
        if (z && j != -9223372036854775807L) {
            com.google.android.exoplayer2.trackselection.b bVar = this.e;
            if (bVar.k(bVar.q(cw3Var.d), j)) {
                return true;
            }
        }
        return false;
    }

    public final long l(long j) {
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar = this.f;
        if (!aVar.d) {
            return -9223372036854775807L;
        }
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b bVar = aVar.f[this.f8256b];
        int i = bVar.f8273k - 1;
        return (bVar.e(i) + bVar.c(i)) - j;
    }

    @Override // defpackage.hw3
    public void release() {
        for (dw3 dw3Var : this.c) {
            dw3Var.release();
        }
    }
}
