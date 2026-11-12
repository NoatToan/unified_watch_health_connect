package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class ye8 implements k9l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Format f40091a;
    public long[] c;
    public boolean d;
    public ze8 e;
    public boolean f;
    public int g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ud8 f40092b = new ud8();
    public long h = -9223372036854775807L;

    public ye8(ze8 ze8Var, Format format, boolean z) {
        this.f40091a = format;
        this.e = ze8Var;
        this.c = ze8Var.f41188b;
        e(ze8Var, z);
    }

    @Override // defpackage.k9l
    public void a() throws IOException {
    }

    public String b() {
        return this.e.a();
    }

    public void c(long j) {
        int iE = wlq.e(this.c, j, true, false);
        this.g = iE;
        if (!this.d || iE != this.c.length) {
            j = -9223372036854775807L;
        }
        this.h = j;
    }

    @Override // defpackage.k9l
    public int d(a1a a1aVar, DecoderInputBuffer decoderInputBuffer, int i) {
        if ((i & 2) != 0 || !this.f) {
            a1aVar.f517b = this.f40091a;
            this.f = true;
            return -5;
        }
        int i2 = this.g;
        if (i2 == this.c.length) {
            if (this.d) {
                return -3;
            }
            decoderInputBuffer.p(4);
            return -4;
        }
        this.g = i2 + 1;
        byte[] bArrA = this.f40092b.a(this.e.f41187a[i2]);
        decoderInputBuffer.s(bArrA.length);
        decoderInputBuffer.c.put(bArrA);
        decoderInputBuffer.e = this.c[i2];
        decoderInputBuffer.p(1);
        return -4;
    }

    public void e(ze8 ze8Var, boolean z) {
        int i = this.g;
        long j = i == 0 ? -9223372036854775807L : this.c[i - 1];
        this.d = z;
        this.e = ze8Var;
        long[] jArr = ze8Var.f41188b;
        this.c = jArr;
        long j2 = this.h;
        if (j2 != -9223372036854775807L) {
            c(j2);
        } else if (j != -9223372036854775807L) {
            this.g = wlq.e(jArr, j, false, false);
        }
    }

    @Override // defpackage.k9l
    public boolean isReady() {
        return true;
    }

    @Override // defpackage.k9l
    public int k(long j) {
        int iMax = Math.max(this.g, wlq.e(this.c, j, true, false));
        int i = iMax - this.g;
        this.g = iMax;
        return i;
    }
}
