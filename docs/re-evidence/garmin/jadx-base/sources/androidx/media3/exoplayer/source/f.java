package androidx.media3.exoplayer.source;

import android.net.Uri;
import bb.l0;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f implements ha.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ha.d f9493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f9495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f9496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9497e;

    public interface a {
    }

    public f(ha.d dVar, int i14, a aVar) {
        fa.a.a(i14 > 0);
        this.f9493a = dVar;
        this.f9494b = i14;
        this.f9495c = aVar;
        this.f9496d = new byte[1];
        this.f9497e = i14;
    }

    @Override // ha.d
    public final void a(ha.n nVar) {
        nVar.getClass();
        this.f9493a.a(nVar);
    }

    @Override // ha.d
    public final long b(ha.g gVar) {
        throw new UnsupportedOperationException();
    }

    @Override // ha.d
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // ha.d
    public final Map<String, List<String>> getResponseHeaders() {
        return this.f9493a.getResponseHeaders();
    }

    @Override // ha.d
    public final Uri getUri() {
        return this.f9493a.getUri();
    }

    @Override // androidx.media3.common.j
    public final int read(byte[] bArr, int i14, int i15) {
        long jMax;
        int i16 = this.f9497e;
        ha.d dVar = this.f9493a;
        if (i16 == 0) {
            byte[] bArr2 = this.f9496d;
            int i17 = 0;
            if (dVar.read(bArr2, 0, 1) != -1) {
                int i18 = (bArr2[0] & 255) << 4;
                if (i18 != 0) {
                    byte[] bArr3 = new byte[i18];
                    int i19 = i18;
                    while (i19 > 0) {
                        int i24 = dVar.read(bArr3, i17, i19);
                        if (i24 != -1) {
                            i17 += i24;
                            i19 -= i24;
                        }
                    }
                    while (i18 > 0 && bArr3[i18 - 1] == 0) {
                        i18--;
                    }
                    if (i18 > 0) {
                        fa.r rVar = new fa.r(bArr3, i18);
                        o.a aVar = (o.a) this.f9495c;
                        if (aVar.f9578m) {
                            o oVar = o.this;
                            Map<String, String> map = o.M0;
                            jMax = Math.max(oVar.k(true), aVar.f9575j);
                        } else {
                            jMax = aVar.f9575j;
                        }
                        long j8 = jMax;
                        int iA = rVar.a();
                        l0 l0Var = aVar.f9577l;
                        l0Var.getClass();
                        l0Var.f(iA, rVar);
                        l0Var.c(j8, 1, iA, 0, null);
                        aVar.f9578m = true;
                    }
                }
                this.f9497e = this.f9494b;
            }
            return -1;
        }
        int i25 = dVar.read(bArr, i14, Math.min(this.f9497e, i15));
        if (i25 != -1) {
            this.f9497e -= i25;
        }
        return i25;
    }
}
