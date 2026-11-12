package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
abstract class g {
    private static final int n = 0;
    private static final int o = 1;
    private static final int p = 2;
    private static final int q = 3;
    private TrackOutput b;
    private ExtractorOutput c;
    private e d;
    private long e;
    private long f;
    private long g;
    private int h;
    private int i;
    private long k;
    private boolean l;
    private boolean m;
    private final com.google.android.exoplayer2.extractor.ogg.c a = new com.google.android.exoplayer2.extractor.ogg.c();
    private b j = new b();

    public static class b {
        public Format a;
        public e b;
    }

    public static final class c implements e {
        private c() {
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.e
        public SeekMap a() {
            return new SeekMap.Unseekable(C.TIME_UNSET);
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.e
        public void b(long targetGranule) {
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.e
        public long read(ExtractorInput input) {
            return -1L;
        }
    }

    @EnsuresNonNull({"trackOutput", "extractorOutput"})
    private void a() {
        Assertions.checkStateNotNull(this.b);
        Util.castNonNull(this.c);
    }

    @EnsuresNonNullIf(expression = {"setupData.format"}, result = true)
    private boolean h(ExtractorInput input) throws IOException {
        while (this.a.d(input)) {
            this.k = input.getPosition() - this.f;
            if (!i(this.a.c(), this.f, this.j)) {
                return true;
            }
            this.f = input.getPosition();
        }
        this.h = 3;
        return false;
    }

    @RequiresNonNull({"trackOutput"})
    private int j(ExtractorInput input) throws IOException {
        if (!h(input)) {
            return -1;
        }
        Format format = this.j.a;
        this.i = format.sampleRate;
        if (!this.m) {
            this.b.format(format);
            this.m = true;
        }
        e eVar = this.j.b;
        if (eVar != null) {
            this.d = eVar;
        } else if (input.getLength() == -1) {
            this.d = new c();
        } else {
            d dVarB = this.a.b();
            this.d = new com.google.android.exoplayer2.extractor.ogg.a(this, this.f, input.getLength(), dVarB.h + dVarB.i, dVarB.c, (dVarB.b & 4) != 0);
        }
        this.h = 2;
        this.a.f();
        return 0;
    }

    @RequiresNonNull({"trackOutput", "oggSeeker", "extractorOutput"})
    private int k(ExtractorInput input, PositionHolder seekPosition) throws IOException {
        long j = this.d.read(input);
        if (j >= 0) {
            seekPosition.position = j;
            return 1;
        }
        if (j < -1) {
            e(-(j + 2));
        }
        if (!this.l) {
            this.c.seekMap((SeekMap) Assertions.checkStateNotNull(this.d.a()));
            this.l = true;
        }
        if (this.k <= 0 && !this.a.d(input)) {
            this.h = 3;
            return -1;
        }
        this.k = 0L;
        ParsableByteArray parsableByteArrayC = this.a.c();
        long jF = f(parsableByteArrayC);
        if (jF >= 0) {
            long j2 = this.g;
            if (j2 + jF >= this.e) {
                long jB = b(j2);
                this.b.sampleData(parsableByteArrayC, parsableByteArrayC.limit());
                this.b.sampleMetadata(jB, 1, parsableByteArrayC.limit(), 0, null);
                this.e = -1L;
            }
        }
        this.g += jF;
        return 0;
    }

    public long b(long granule) {
        return (granule * 1000000) / ((long) this.i);
    }

    public long c(long timeUs) {
        return (((long) this.i) * timeUs) / 1000000;
    }

    public void d(ExtractorOutput output, TrackOutput trackOutput) {
        this.c = output;
        this.b = trackOutput;
        l(true);
    }

    public void e(long currentGranule) {
        this.g = currentGranule;
    }

    public abstract long f(ParsableByteArray packet);

    public final int g(ExtractorInput input, PositionHolder seekPosition) throws IOException {
        a();
        int i = this.h;
        if (i == 0) {
            return j(input);
        }
        if (i == 1) {
            input.skipFully((int) this.f);
            this.h = 2;
            return 0;
        }
        if (i == 2) {
            Util.castNonNull(this.d);
            return k(input, seekPosition);
        }
        if (i == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public abstract boolean i(ParsableByteArray packet, long position, b setupData) throws IOException;

    public void l(boolean headerData) {
        if (headerData) {
            this.j = new b();
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }

    public final void m(long position, long timeUs) {
        this.a.e();
        if (position == 0) {
            l(!this.l);
        } else if (this.h != 0) {
            this.e = c(timeUs);
            ((e) Util.castNonNull(this.d)).b(this.e);
            this.h = 2;
        }
    }
}
