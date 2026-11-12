package com.google.android.exoplayer2.extractor.mp4;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class g {
    public c a;
    public long b;
    public long c;
    public long d;
    public int e;
    public int f;
    public boolean m;

    @Nullable
    public TrackEncryptionBox o;
    public boolean q;
    public long r;
    public boolean s;
    public long[] g = new long[0];
    public int[] h = new int[0];
    public int[] i = new int[0];
    public int[] j = new int[0];
    public long[] k = new long[0];
    public boolean[] l = new boolean[0];
    public boolean[] n = new boolean[0];
    public final ParsableByteArray p = new ParsableByteArray();

    public void a(ExtractorInput input) throws IOException {
        input.readFully(this.p.getData(), 0, this.p.limit());
        this.p.setPosition(0);
        this.q = false;
    }

    public void b(ParsableByteArray source) {
        source.readBytes(this.p.getData(), 0, this.p.limit());
        this.p.setPosition(0);
        this.q = false;
    }

    public long c(int index) {
        return this.k[index] + ((long) this.j[index]);
    }

    public void d(int length) {
        this.p.reset(length);
        this.m = true;
        this.q = true;
    }

    public void e(int trunCount, int sampleCount) {
        this.e = trunCount;
        this.f = sampleCount;
        if (this.h.length < trunCount) {
            this.g = new long[trunCount];
            this.h = new int[trunCount];
        }
        if (this.i.length < sampleCount) {
            int i = (sampleCount * 125) / 100;
            this.i = new int[i];
            this.j = new int[i];
            this.k = new long[i];
            this.l = new boolean[i];
            this.n = new boolean[i];
        }
    }

    public void f() {
        this.e = 0;
        this.r = 0L;
        this.s = false;
        this.m = false;
        this.q = false;
        this.o = null;
    }

    public boolean g(int index) {
        return this.m && this.n[index];
    }
}
